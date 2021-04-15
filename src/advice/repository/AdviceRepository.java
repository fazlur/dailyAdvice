package advice.repository;

public interface AdviceRepository {

    void write(String message);

    String read();
}
