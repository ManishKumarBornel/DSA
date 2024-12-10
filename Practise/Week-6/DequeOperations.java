import java.util.ArrayDeque;
import java.util.Deque;

public class DequeOperations {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();

        // append() - Insert at the right end
        deque.addLast(10);
        deque.addLast(20);
        deque.addLast(30);

        // appendleft() - Insert at the left end
        deque.addFirst(5);

        // pop() - Delete from the right end
        deque.removeLast();

        // popleft() - Delete from the left end
        deque.removeFirst();

        // index(ele, beg, end) - Get index of element
        java.util.List<Integer> list = new java.util.ArrayList<>(deque);
        int index = list.indexOf(20);

        // insert(i, a) - Insert at index
        list.add(1, 15);
        deque.clear();
        deque.addAll(list);

        // remove() - Remove first occurrence of value
        deque.remove(15);

        // count() - Count occurrences of value
        long count = deque.stream().filter(e -> e == 20).count();

        // len(dequeue) - Get size of deque
        int size = deque.size();

        // Deque[0] - Access front element
        int front = deque.peekFirst();

        // Deque[-1] - Access back element
        int back = deque.peekLast();

        // extend(iterable) - Add multiple values at right end
        deque.addAll(java.util.Arrays.asList(40, 50, 60));

        // extendleft(iterable) - Add multiple values at left end
        java.util.List<Integer> listToAdd = java.util.Arrays.asList(1, 2, 3);
        for (int i = listToAdd.size() - 1; i >= 0; i--) {
            deque.addFirst(listToAdd.get(i));
        }

        // reverse() - Reverse the order of deque elements
        java.util.Deque<Integer> reversedDeque = new ArrayDeque<>();
        deque.descendingIterator().forEachRemaining(reversedDeque::add);

        // rotate() - Rotate the deque
        int rotateBy = 2;
        for (int i = 0; i < rotateBy; i++) {
            deque.addFirst(deque.removeLast());
        }

        // Print the deque
        System.out.println(deque);
    }
}