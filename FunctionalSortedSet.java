import java.util.function.Predicate;
import java.util.Comparator;
import java.util.SortedSet;

/**
 * An interface that extends SortedSet, which extends Set,
 * which extends Collection. It provides Functional behaviors that will make
 * use of Java 8's new Stream API.
 *
 * A FunctionalSortedSet maintains a sorted property based on a Comparator,
 * and can be resorted using a new one, or filtered based on a Predicate.
 *
 * @author Joe Rossi
 * @version 1.0
 * @param <E> The type of elements the FunctionalSortedSet contains.
 */
public interface FunctionalSortedSet<E> extends SortedSet<E> {

    /**
     * @param p a Predicate that either "has" or "is" a boolean valued method
     * @return  a new FunctionalSortedSet with elements whose predicate calls
     *          returned false removed
     */
    FunctionalSortedSet<E> filter(Predicate<E> p);

    /**
     * @param c a Comparator that either "has" or "is" an int valued method
     * @return  a new FunctionalSortedSet with the elements sorted based on c
     */
    FunctionalSortedSet<E> sort(Comparator<E> c);
}
