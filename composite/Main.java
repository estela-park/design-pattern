public static void main(String[] args) {
    DeliveryService DeliveryService = new DeliveryService();

    DeliveryService.setupOrder(
        new CompositeBox(
                new VideoGame("1", 100)
                // why 2 indentation?
                // personal preference
        ),
        new CompositeBox(
                new CompositeBox(
                        new Book("2", 200),
                        new Book("3", 300)
                ),
                new VideoGame("4", 400),
                new VideoGame("5", 500)
        )
    );

    DeliveryService.calculateOrderPrice();
    // 1500$
}