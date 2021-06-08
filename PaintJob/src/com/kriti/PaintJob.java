package com.kriti;

public class PaintJob {
	public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
		if(width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
			return -1;
		}
		int bucketsNeeded = (int) (Math.ceil(((width * height) / areaPerBucket)));
		if(bucketsNeeded > extraBuckets) {
			bucketsNeeded -= extraBuckets;
		}else if(bucketsNeeded < extraBuckets) {
			extraBuckets -= bucketsNeeded;
			return extraBuckets;
		}else {
			return extraBuckets;
		}
		return bucketsNeeded;
	}


	public static int getBucketCount(double width, double height, double areaPerBucket) {
		if(width <= 0 || height <= 0 || areaPerBucket <= 0) {
			return -1;
		}
		int bucketsNeeded = (int) (Math.ceil((width * height) / areaPerBucket));
		return bucketsNeeded;
	}

	public static int getBucketCount(double area, double areaPerBucket) {
		if(area <= 0 || areaPerBucket <= 0) {
			return -1;
		}
		int bucketsNeeded = (int) (Math.ceil(area / areaPerBucket));
		return bucketsNeeded;
	}
}
// Using Ternary Operator


//public class PaintJob {
//    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets){
//        return (width<=0 || height<=0 || areaPerBucket<=0 || extraBuckets<0) ? -1 : (int) Math.ceil((width*height-(areaPerBucket*extraBuckets))/ areaPerBucket);
//    }
//    
//    public static int getBucketCount(double width, double height, double areaPerBucket){
//        return (width<=0 || height<=0 || areaPerBucket<=0) ? -1 : (int) Math.ceil(width*height/areaPerBucket);
//    }
//    
//    public static int getBucketCount(double area, double areaPerBucket){
//        return (area<=0 || areaPerBucket<=0) ? -1 : (int) Math.ceil(area/areaPerBucket);
//    }
//}


// Alternative way


//public class PaintJob {
//    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets){
//        if(width<=0 || height<=0 || areaPerBucket<=0 || extraBuckets<0) return -1;
//        return (int) Math.ceil((width*height-(areaPerBucket*extraBuckets))/areaPerBucket);
//    }
//    
//    public static int getBucketCount(double width, double height, double areaPerBucket){
//        // if(width<=0 || height<=0 || areaPerBucket<=0) return -1;
//        // return (int) Math.ceil(width*height/areaPerBucket);
//        return getBucketCount(width, height, areaPerBucket, 0); // call first method
//    }
//    
//    public static int getBucketCount(double area, double areaPerBucket){
//        // if(area<=0 || areaPerBucket<=0) return -1;
//        // return (int) Math.ceil(area/areaPerBucket);
//        return getBucketCount(area, 1, areaPerBucket, 0); // call first method where width*height = area is the same as area*1 = area
//    }
//}