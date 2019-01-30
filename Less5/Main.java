public class Main {

        private static final int SIZE = 10000000;

        //задаем сколько потоков делать??
        private static final int howm = 2;

        private static final int H = SIZE / howm;

        public float[] calculate(float[] arr) {
            for (int i = 0; i < arr.length; i++)
               arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            return arr;
        }

        public void job1() {
            float[] arr = new float[SIZE];
            for (int i = 0; i < arr.length; i++) arr[i] = 1.0f;
            long a = System.currentTimeMillis();
            calculate(arr);
            System.out.println("Первый метод завершился за: " + (System.currentTimeMillis() - a));
        }

        public void job2() {

            float[] arr = new float[SIZE];

            float[] arr1 = new float[H];
            float[] arr2 = new float[H];

            for (int i = 0; i < arr.length; i++) {

                    arr[i] = 1.0f;

                }

            long a = System.currentTimeMillis();



             System.arraycopy(arr, 0, arr1, 0, H);
            System.arraycopy(arr, H, arr2, 0, H);

            new Thread(() -> {
                float[] m1 = calculate(arr1);
                System.arraycopy(m1, 0, arr1, 0, m1.length);
            }).start();

            new Thread(() -> {
                float[] m2 = calculate(arr2);
                System.arraycopy(m2, 0, arr2, 0, m2.length);
            }).start();

            System.arraycopy(arr1, 0, arr, 0, H);
            System.arraycopy(arr2, 0, arr, H, H);

            System.out.println("Второй метод завершился за : " + (System.currentTimeMillis() - a));
        }

        public static void main(String s[]) {
            Main go = new Main();
            go.job1();
            go.job2();

        }
    }


