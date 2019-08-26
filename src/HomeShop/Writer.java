package HomeShop;

public interface Writer {

    /**
     * Start writing process
     */
    void start();

    /**
     * Write on line
     * @param line
     */
    void writeLine(String line);

    /**
     * Stop writing process
     */
    void stop();
}
