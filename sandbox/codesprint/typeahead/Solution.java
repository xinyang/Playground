import java.util.*;

public class Solution {

        private TreeMap<HashSet<String>, Item> data;
        
        private Solution() {
        
                TreeMap<HashSet<String>, Item> data = new TreeMap<HashSet<String>, Item>();
        }

        private enum ItemType{user, topic, question, board}

        private static class Item {
                public ItemType type;
                public String id;
                public double score;
                public Item (ItemType type, String id, double score) {
                        this.type = type;
                        this.id = id;
                        this.score = score;
                }
        }

        private HashSet<String> strToSet(String str) {
                HashSet<String> ha = new HashSet<String>();
                for (String s : str.split(" "))
                        ha.add(s);
                return ha;
        }
        
        private void add(String[] str) {
                HashSet<String> dataString = strToSet(str[4]);
                Item item = new Item(ItemType.valueOf(str[1]), str[2], Double.parseDouble(str[3]));
                
        }


        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                
                int N = Integer.parseInt(sc.nextLine());
                
                Solution sol = new Solution();
                
                String[] line = new String[N];
                for (int i = 0; sc.hasNextLine(); i++) {        
                        line = (sc.nextLine()).split(" ");
                        switch(line[0]) {
                                case "ADD":
                                        sol.add(line);
                                break;
                                case "DEL":
                                        sol.del(line);
                                break;
                                case "QUERY":
                                        sol.query(line);
                                break;
                                case "WQUERY":
                                        sol.wquery(line);
                                break;
                        }
                                
                }
 
        }

}
