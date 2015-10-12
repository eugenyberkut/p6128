import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Created by Yevhen on 07.10.2015.
 */
public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Deque<String> deque = new ArrayDeque<>();
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String[] line;
            loop:
            while (true) {
                line = reader.readLine().split(" ");
                switch (line[0]) {
                    case "exit" :
                        System.out.println("bye");
                        break loop;
                    case "push_front" :
                        deque.addFirst(line[1]);
                        System.out.println("ok");
                        break;
                    case "push_back" :
                        deque.addLast(line[1]);
                        System.out.println("ok");
                        break;
                    case "pop_front" :
                        System.out.println(deque.removeFirst());
                        break;
                    case "pop_back" :
                        System.out.println(deque.removeLast());
                        break;
                    case "front" :
                        System.out.println(deque.getFirst());
                        break;
                    case "back" :
                        System.out.println(deque.getLast());
                        break;
                    case "size" :
                        System.out.println(deque.size());
                        break;
                    case "clear" :
                        deque.clear();
                        System.out.println("ok");
                        break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
