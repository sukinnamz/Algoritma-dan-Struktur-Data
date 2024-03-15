package Pertemuan05.code;

public class Latihan15 {

    double TinggiDC(double arr[], int l, int r) {
        if (l == r) {
            return arr[l];
        } else if (l < r) {
            int mid = (l + r) / 2;
            double lmax = TinggiDC(arr, l, mid);
            double rmax = TinggiDC(arr, mid + 1, r);
            return Math.max(lmax, rmax);
        }
        return 0;
    }

    double RendahDC(double arr[], int l, int r) {
        if (l == r) {
            return arr[l];
        } else if (l < r) {
            int mid = (l + r) / 2;
            double lmin = RendahDC(arr, l, mid);
            double rmin = RendahDC(arr, mid + 1, r);
            return Math.min(lmin, rmin);
        }
        return 0;
    }

    double JumlahBF(double arr[], double total) {
        for (int index = 0; index < arr.length; index++) {
            total += arr[index];
        }
        return total / arr.length;
    }
}
