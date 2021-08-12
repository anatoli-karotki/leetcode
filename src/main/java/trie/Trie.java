package trie;

public class Trie {
    private Trie[] arr;
    boolean endOfWord = false;
    char val;

    /** Initialize your data structure here. */
    public Trie() {
        arr = new Trie[26];
    }

    public Trie(char val) {
        this();
        this.val = val;
    }

    /** Inserts a word into the trie. */
    public void insert(String word) {
        if (word == null || word.length() == 0) return;
        char ch = word.charAt(0);
        Trie t = arr[ch - 'a'];
        if (t == null) {
            t = new Trie(ch);
            arr[ch - 'a'] = t;
        }
        if (word.length() > 1) {
            t.insert(word.substring(1));
        } else t.endOfWord = true;
    }

    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        if (word == null || word.length() == 0) return false;
        char ch = word.charAt(0);
        Trie t = arr[ch - 'a'];
        if (t == null) return false;
        if (word.length() > 1) {
            return t.search(word.substring(1));
        } else return t.endOfWord;
    }

    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        if (prefix == null || prefix.length() == 0) return true;
        char ch = prefix.charAt(0);
        Trie t = arr[ch - 'a'];
        if (t == null) return false;
        return t.startsWith(prefix.substring(1));
    }
}