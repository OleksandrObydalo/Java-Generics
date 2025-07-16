package wildcard;

import java.util.*;

class E {

}

public class PESC {
    // PECS-принцип (Producer Extends, Consumer Super)
    
    
    public void pushAll(Collection<? extends E> collection) {
        for (E element : collection) {
            this.push(element);
        }
    }

    private void push(Object element) {
    }

    public List<E> sort(Comparator<? super E> comp) {
        List<E> list = this.asList();
        Collections.sort(list, comp);
        return list;
    }

    private List<E> asList() {
        return new ArrayList<E>();
    }


}
