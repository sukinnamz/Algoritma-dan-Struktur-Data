package UTS.code;

public class Pengurutan15 {
    int[] data;

    Pengurutan15(int[] a) {
        data = new int[a.length];
        for (int index = 0; index < a.length; index++) {
            data[index] = a[index];
        }
    }

    int BinarySearchAC(int cari, int left, int right) {
        int mid;
        if (right >= left) {
            mid = (left + right) / 2;
            if (data[mid] == cari) {
                return mid;
            } else if (data[mid] > cari) {
                return BinarySearchAC(cari, left, mid - 1);
            } else {
                return BinarySearchAC(cari, mid + 1, right);
            }
        }
        return -1;
    }

    int BinarySearchDC(int cari, int left, int right) {
        int mid;
        if (right >= left) {
            mid = (left + right) / 2;
            if (data[mid] == cari) {
                return mid;
            } else if (data[mid] < cari) {
                return BinarySearchDC(cari, left, mid - 1);
            } else {
                return BinarySearchDC(cari, mid + 1, right);
            }
        }
        return -1;
    }

    void insertionSortAC() {
        for (int i = 1; i < data.length; i++) {
            int temp = data[i];
            int j = i;
            while (j > 0 && data[j - 1] > temp) {
                data[j] = data[j - 1];
                j--;
            }
            data[j] = temp;
        }
    }

    void insertionSortDC() {
        for (int i = 1; i < data.length; i++) {
            int temp = data[i];
            int j = i;
            while (j > 0 && data[j - 1] < temp) {
                data[j] = data[j - 1];
                j--;
            }
            data[j] = temp;
        }
    }

    void tampilPosisiIndex(int pos) {
        if (pos >= 0) {
            System.out.println("Nilai yang anda cari berada pada index ke " + pos);
        } else {
            System.out.println("Data tidak ditemukan");
        }
    }

    void tampilData() {
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }

}
