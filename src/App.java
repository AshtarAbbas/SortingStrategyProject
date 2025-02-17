import com.example.strategy.SortingContext;
import com.example.strategy.strategy.BubbleSortStrategy;
import com.example.strategy.strategy.MergeSortStrategy;
import com.example.strategy.strategy.QuickSortStrategy;

public class App {
    public static void main(String[] args) {
        SortingContext sortingContext = new SortingContext(new BubbleSortStrategy());

        int[] array1 = {5, 2, 9, 1, 5};
        sortingContext.performSort(array1);

        sortingContext.setSortingStrategy(new MergeSortStrategy());
        int[] array2 = {8, 3, 7, 4, 2};
        sortingContext.performSort(array2);

        sortingContext.setSortingStrategy(new QuickSortStrategy());
        int[] array3 = {6, 1, 3, 9, 5};
        sortingContext.performSort(array3);
    }
}
