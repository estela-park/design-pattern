import java.util.ArrayList;
import java.util.List;

public class CompositeBox implements Box {
    // Composite Boxes hold products and other composite boxes
    private final List<Box> children = new ArrayList<>();

    public CompositeBox(Box... boxes) {
        children.addAll(Arrays.asList(boxes));
    }

    @Override
    public double calculatePrice() {
        return children.stream()
                .mapToDouble(Box::calculatePrice)
                // not sure what mapToDouble fn specifically does
                // but it calls all of its child box's calculatePrice fn
                // review how children works
                .sum();
    }
}

