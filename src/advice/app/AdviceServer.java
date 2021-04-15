package advice.app;

import advice.repository.AdviceRepository;
import advice.repository.io.FileAdviceRepository;

public class AdviceServer {

    public static void main(String[] args) {
        System.out.println("Server running...");
        final AdviceRepository repository = new FileAdviceRepository();

        System.out.println(repository.read());
    }
}
