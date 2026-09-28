class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {

        int peak = peakelement(mountainArr);

        // Search in increasing part
        int l = 0;
        int r = peak;

        while (l <= r) {
            int mid = l + (r - l) / 2;

            if (mountainArr.get(mid) == target) {
                return mid;
            }

            if (mountainArr.get(mid) < target) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }

        // Search in decreasing part
        l = peak + 1;
        r = mountainArr.length() - 1;

        while (l <= r) {
            int mid = l + (r - l) / 2;

            if (mountainArr.get(mid) == target) {
                return mid;
            }

            if (mountainArr.get(mid) < target) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }

        return -1;
    }

    public int peakelement(MountainArray mountainArr) {

        int l = 0;
        int r = mountainArr.length() - 1;

        while (l < r) {
            int mid = l + (r - l) / 2;

            if (mountainArr.get(mid) < mountainArr.get(mid + 1)) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }

        return l;
    }
}