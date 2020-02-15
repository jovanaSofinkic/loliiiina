public class PaintJob {
    public static int getBucketCount (double width, double height, double areaPerBucket, int extraBuckets){
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0){
            return -1;
        } else {
            double totalArea = width * height;
            double totalBuckets = Math.ceil(totalArea / areaPerBucket);
            return  Math.abs((int) totalBuckets - extraBuckets);
        }
    }
    public static int getBucketCount (double width, double height, double areaPerBucket){
        if (width <= 0 || height <= 0 || areaPerBucket <= 0){
            return -1;
        } else {
            double totalArea = width * height;
            return (int) Math.ceil(totalArea / areaPerBucket);
        }
    }
    public static int getBucketCount (double area, double areaPerBucket){
        if (area <= 0 || areaPerBucket <= 0){
            return -1;
        } else {
            return (int) Math.ceil(area / areaPerBucket);
        }
    }
}
