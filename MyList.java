package Problems;


import java.lang.reflect.Array;
import java.util.*;

class MyList{
public static void main(String[] args) {
    List< Integer > arr=new ArrayList<>();
    arr.add(1);
    arr.add(2);
    arr.add(3);
    arr.add(4);
    System.out.println(arr);
    System.out.println("arr "+ arr.isEmpty());
Stack<Integer> stack=new Stack<>();
stack.add(1);
stack.add(3);
stack.add(2);
stack.add(2);
stack.add(4);
stack.add(5);
    System.out.println(stack);
    System.out.println(stack.pop().hashCode());
    Queue<Integer> queue=new ArrayDeque<>();
    queue.add(1);
    queue.add(2);
    queue.add(3);
    queue.add(4);
    queue.add(3);
    queue.add(5);
    System.out.println(queue);
    System.out.println(queue.element());







            //new List<Integer>() {
//        @Override
//        public int size() {
//            return 0;
//        }
//
//        @Override
//        public boolean isEmpty() {
//            return false;
//        }
//
//        @Override
//        public boolean contains(Object o) {
//            return false;
//        }
//
//        @Override
//        public Iterator<Integer> iterator() {
//            return null;
//        }
//
//        @Override
//        public Object[] toArray() {
//            return new Object[0];
//        }
//
//        @Override
//        public <T> T[] toArray(T[] a) {
//            return null;
//        }
//
//        @Override
//        public boolean add(Integer integer) {
//            return false;
//        }
//
//        @Override
//        public boolean remove(Object o) {
//            return false;
//        }
//
//        @Override
//        public boolean containsAll(Collection<?> c) {
//            return false;
//        }
//
//        @Override
//        public boolean addAll(Collection<? extends Integer> c) {
//            return false;
//        }
//
//        @Override
//        public boolean addAll(int index, Collection<? extends Integer> c) {
//            return false;
//        }
//
//        @Override
//        public boolean removeAll(Collection<?> c) {
//            return false;
//        }
//
//        @Override
//        public boolean retainAll(Collection<?> c) {
//            return false;
//        }
//
//        @Override
//        public void clear() {
//
//        }
//
//        @Override
//        public Integer get(int index) {
//            return 0;
//        }
//
//        @Override
//        public Integer set(int index, Integer element) {
//            return 0;
//        }
//
//        @Override
//        public void add(int index, Integer element) {
//
//        }
//
//        @Override
//        public Integer remove(int index) {
//            return 0;
//        }
//
//        @Override
//        public int indexOf(Object o) {
//            return 0;
//        }
//
//        @Override
//        public int lastIndexOf(Object o) {
//            return 0;
//        }
//
//        @Override
//        public ListIterator<Integer> listIterator() {
//            return null;
//        }
//
//        @Override
//        public ListIterator<Integer> listIterator(int index) {
//            return null;
//        }
//
//        @Override
//        public List<Integer> subList(int fromIndex, int toIndex) {
//            return List.of();
//        }
//    }
}
}