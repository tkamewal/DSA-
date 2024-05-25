import java.util.*;
public class HashingGet {
    static class HashMap<K,V> {
        private class Node {
            K key;
            V value;

            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int n;
        private int N;
        private LinkedList<Node> buckets[];

        @SuppressWarnings("unchecked")
        public HashMap() {
            this.N = 4; 
            this.buckets = new LinkedList[4];
            for (int i = 0; i < 4; i++) {
                this.buckets[i] = new LinkedList<>();
            }
        }

        private int HashFunction(K key) { // 0 to N-1
          int bi =  key.hashCode();
         return Math.abs(bi) % N;  // abs convert into absolute values
        }

        private int searchInLL(K key, int bi) {
            LinkedList<Node> ll = buckets[bi];
            // int di = 0;
            for (int i = 0; i < ll.size(); i++) {
                if (ll.get(i).key == key) {
                    return i;
                }
            }
            return -1;
        }

        private void reHash() {
            LinkedList<Node> oldBucket[] = buckets;
            buckets = new LinkedList[n*2];

            for (int i = 0; i < n*2; i++) {
                buckets[i] = new LinkedList<>();
            }

            for (int i = 0; i < oldBucket.length; i++) {
                LinkedList<Node> ll = oldBucket[i];
                for (int j = 0; j < ll.size(); j++) {
                    Node node = ll.get(j);
                    put(node.key, node.value);
                }
            }
        }

public void put(K key, V value) {

    int bi = HashFunction(key);
   int di = searchInLL(key, bi);  // return data index in that bucket....

   if (di == -1) { // key not exist
    buckets[bi].add(new Node(key, value));
    n++;
   } else {
   Node node = buckets[bi].get(di);
   node.value = value;
   }

   double lambda = (double)n/N;
   if(lambda > 2.0) {
    // Rehashing
reHash();

   }
}

public V get(K key) {
    
    int bi = HashFunction(key);
   int di = searchInLL(key, bi);  // return data index in that bucket....

   if (di == -1) { // key not exist
   return null;
   } else {
   Node node = buckets[bi].get(di);
  return node.value;
   }
}

    }
    public static void main(String args[]){
     HashMap<String, Integer> map = new HashMap<>();
     map.put("India", 190);
     map.put("china", 200);
     map.put("America", 100);
     map.put("nepal", 50);
    }
}

