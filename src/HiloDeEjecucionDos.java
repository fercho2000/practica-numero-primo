import java.util.Random;

class HiloDeEjecucionDos implements Runnable {

    public HiloDeEjecucionDos() {
        Thread thread = new Thread(this);
        thread.start();
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {

                Thread.sleep(2000);
                System.out.println(" ***** datos del hilo dos *****");
                new LecturaDatosDelArchivo(new Random().nextInt(50));

            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}