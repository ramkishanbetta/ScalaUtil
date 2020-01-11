/*
package com.betta.learning.scala.util


import scala.util.Try

private case class RunTimeOptions(NUM_EXECUTORS: Int, NUM_CORES: Int, APP_NAME: String, PARALLELISM: Int)

object Driver {

  def main(args: Array[String]): RunTimeOptions = Unit {
    if (args == null || args.length % 2 == 1) help
    val defaultBuilderTemplate: (String, String) => RunTimeOptions = builder(RunTimeOptions(1, 4, "Default", 1))
    val runTimeOptions = Try {
      extract(defaultBuilderTemplate, args)
    }.get

    println(runTimeOptions)
  }

  def builder(runTimeOptions: RunTimeOptions) = (key: String, value: String) => {
    populator(runTimeOptions, key, value)
  }

  def extract(builderTemplate: (String, String) => RunTimeOptions, args: Array[String]): RunTimeOptions = {
    if (args.length == 0) builderTemplate(null, null)
    val updatedBuilderTemplate = builder(builderTemplate(args(0), args(1)))
    extract(updatedBuilderTemplate, args.drop(2))
  }

  def populator(runTimeOptions: RunTimeOptions, key: String, value: String): RunTimeOptions = {
    case "--num-executors" => runTimeOptions.copy(NUM_EXECUTORS = value.asInstanceOf[Int])
    case "--num-cores" => runTimeOptions.copy(NUM_CORES = value.asInstanceOf[Int])
    case "--appName" => runTimeOptions.copy(APP_NAME = value)
    case "-m" => runTimeOptions.copy(PARALLELISM = value.asInstanceOf[Int])
    case null => runTimeOptions
    case _ => {
      help
      throw new RuntimeException
    }
  }

  def help = {
    print("help")
  }

}
*/
