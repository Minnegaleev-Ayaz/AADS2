import org.junit.Test;

public class TreapTest {
    private static Treap treap = new Treap(1,2);
    int[] matrix10 = randomMatrix.randomMat(10,100000);
    int[] matrix10000 = randomMatrix.randomMat(10000,10000);
    long start;
    @Test
    public void add10Elements(){
        start = System.nanoTime();
        Treap treap = new Treap(matrix10[0]);
        for (int i = 1; i < 10; i++) {
            treap.add(matrix10[i]);
        }
        System.out.println("Time: "+(System.nanoTime()-start)+" ns");
    }
    @Test
    public void add10000Elements(){
        start = System.nanoTime();
        Treap treap = new Treap(matrix10000[0]);
        for (int i = 1; i < 10000; i++) {
            treap.add(matrix10000[i]);
        }
        System.out.println("Time: "+(System.nanoTime()-start)+" ns");
    }
    @Test
    public void remove10Elements(){
        Treap treap = new Treap(matrix10[0]);
        for (int i = 1; i < 10; i++) {
            treap.add(matrix10[i]);
        }
        start = System.nanoTime();
        for (int i = 0; i < 10; i++) {
            treap.remove(matrix10[i]);
        }
        System.out.println("Time: "+(System.nanoTime()-start)+" ns");
    }
    @Test
    public void remove10000Elements(){
        Treap treap = new Treap(matrix10000[0]);
        for (int i = 1; i < 1000; i++) {
            treap.add(matrix10000[i]);
        }
        start = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            treap.remove(matrix10000[i]);
        }
        System.out.println("Time: "+(System.nanoTime()-start)+" ns");
    }
    @Test
    public void contatins10Elements(){
        Treap treap = new Treap(matrix10[0]);
        for (int i = 1; i < 10; i++) {
            treap.add(matrix10[i]);
        }
        start = System.nanoTime();
        for (int i = 0; i < 10; i++) {
            treap.contains(matrix10[i]);
        }
        System.out.println("Time: "+(System.nanoTime()-start)+" ns");
    }
    @Test
    public void contatins10000Elements(){
        Treap treap = new Treap(matrix10000[0]);
        for (int i = 1; i < 10000; i++) {
            treap.add(matrix10000[i]);
        }
        start = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            treap.contains(matrix10000[i]);
        }
        System.out.println("Time: "+(System.nanoTime()-start)+" ns");
    }
}
