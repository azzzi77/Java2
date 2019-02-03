package Server;

import java.io.*;
import java.net.*;

public class ServerChat {
    public static void main(String[] args) throws IOException {
        SRV s = new SRV();
        s.start();
        s.catchClient();
        new Thread(() -> {
            while (true) {
                String txt = null;
                try {
                    txt = s.in.readLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (txt != null) {
                    try {
                        s.sendMessage(txt);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();

        new Thread(() -> {
            try {
                s.writeToConsole();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }).start();

        //s.writeToConsole();
    }
}

class SRV {
    BufferedReader in = null;
    PrintWriter out = null;
    ServerSocket serverSocket = null;
    Socket socket = null;
    String input;
    BufferedReader console = null;

    void start() {
        try {
            serverSocket = new ServerSocket(37370);
        } catch (IOException e) {
            System.out.println("Ошибка открытия порта");
            System.exit(1);
        }
        System.out.print("Сервер включен. Ожидаю клиентов...");
    }

    void catchClient() throws IOException {
        try {
            socket = serverSocket.accept();
            System.out.println("Клиент подключен");
        } catch (IOException e) {
            System.out.println("Ошибка подключения");
            System.exit(1);
        }

        in  = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        out = new PrintWriter(socket.getOutputStream(),true);

        System.out.println("Ожидаем сообщения...");
    }

    void sendMessage(String msg) throws IOException {
        if (msg.equalsIgnoreCase("exit")) close();
        out.println(" ::::::: " + msg);
        System.out.println(msg);
    }

    void close() throws IOException {
        out.close();
        in.close();
        socket.close();
        serverSocket.close();
    }

    void writeToConsole() throws IOException {
        while (true) {
            console = new BufferedReader(new InputStreamReader(System.in));
            String txt = console.readLine();
            sendMessage(txt);
        }
    }
}