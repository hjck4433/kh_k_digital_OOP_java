package 단어정렬하기;

import java.util.Collection;
import java.util.Comparator;

public class WordsComparator implements Comparator<Words> {
    @Override
    public int compare(Words o1, Words o2) {
        if(o1.word.length() > o2.word.length()) return 1;
        else if(o1.word.length() == o2.word.length()) {
            return o1.word.compareTo(o2.word);
        }
        return -1;
    }
}
