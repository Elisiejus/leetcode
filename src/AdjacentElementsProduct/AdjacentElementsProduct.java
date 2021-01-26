package AdjacentElementsProduct;

public class AdjacentElementsProduct {
    public static void main(String[] args) {

        AdjacentElementsProduct elementsProduct = new AdjacentElementsProduct();

        System.out.println(elementsProduct.adjacentElementsProduct(new int[] {3, 6, -2, -5, 7, 3}));
    }

    public int adjacentElementsProduct(int[] inputArray) {

        int product = inputArray[0] * inputArray[1];

        for (int i = 1; i < inputArray.length - 1; i++) {
            product = inputArray[i] * inputArray[i+1] >= product ? inputArray[i] * inputArray[i+1] : product;
        }
        return product;
    }
}