import java.util.*

public class Solution {
/*
1 points: A, E, I, L, N, O, R, S, T, U

2 points: D, G

3 points: B, C, M, P

4 points: F, H, V, W, Y

5 points: K

8 points: J, X

10 points: Q, Z
*/
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()) {
            int K = Integer.parseInt(sc.nextLine());
            int N = Integer.parseInt(sc.nextLine());
            int[] words = new int[N];                        
            for(int i = 0; i < N; i++)
                words[i] = sc.nextLine();      
        
            HashSet<Character>[] scoreToLetter = new HashSet<Character>[11];
            for (Character c: "AEILNORSTU")
                scoreToLetter[1].add(c)
            
            HashMap<Character, Integer> letterToScore = new HashMap<Character, Integer>();
            letterToScore.put(
            
        }
}
