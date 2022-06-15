import java.util.Random;

class HiloDeEjecucionUno implements Runnable {

    public HiloDeEjecucionUno() {
        Thread thread = new Thread(this);
        thread.start();
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {

                Thread.sleep(1000);
                System.out.println(" ***** datos del hilo uno *****");
                new LecturaDatosDelArchivo(new Random().nextInt(50));

            }
        } catch (Exception e) {


            System.out.println(e);
        }
    }
}