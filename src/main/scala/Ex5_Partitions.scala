import org.apache.spark.{SparkContext, SparkConf}


object Ex5_Partitions {
  def main(args: Array[String]) {
    val conf = new SparkConf().setAppName("Ex5_Partitions").setMaster("local[4]")
    val sc = new SparkContext(conf)

    // look at the distribution of numbers > 5 across partitions
    val numbers =  sc.parallelize(1 to 10, 4)
    numbers.foreachPartition(pi => println(pi.count(_ > 5)))

    // TODO: ShuffledRDD

    // TODO: coalesce

    // TODO: repartition

    // TODO: optional partition counts such as intersection and groupBy

    // TODO: preferredLocations
  }
}