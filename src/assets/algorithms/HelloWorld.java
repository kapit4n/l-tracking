class HelloWorld {
    
    public static void main(String[] args) {
        UserProfile user = new UserProfile("Luis Arce");
        System.out.println(user);
        testNumber();
    }

    public static void testNumber() {
        
        double dat1 = 5.0;
        double dat2 = 0.10;
        double dat3 = 0.010;
        double res = dat1 - dat2 - dat3;
        System.out.println(res);
    }

    public static testSort() {
        int test[] = new int[] {1, 3, 5, 1, 2};
        printArray(test);
        //System.out.println("Steps to short it with BubbleSort: " + bubbleSort(test));
        quickSort(test, 0, test.length-1);
        printArray(test);
    }

    public static int bubbleSort(int arr[]) {
        int n = arr.length;
        int res = 0;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n -i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    res++;
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return res;
    }

    public static void printArray(int arr[]) {
        int n = arr.length;
        for (int i=0; i<n; ++i) System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static int partition(int arr[], int low, int high)
    {
        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    public static void quickSort(int arr[], int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }
}