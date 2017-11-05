object ModelToBrand {
  def main(args: Array[String]) {
        val phones = Map("1" -> "iFruit", "2" -> "iFruit", "3" -> "iFruit", "3A" -> "iFruit", "4" -> "iFruit", "4A" -> "iFruit", "5" -> "iFruit",
                        "S1" -> "Ronin", "S2"->"Ronin", "S3" -> "Ronin", "F01L"->"Sorrento", "F11L"->"Sorrento", "F21L"->"Sorrento", "F23L"->"Sorrento",
                        "F33L"->"Sorrento", "F41L"->"Sorrento")
        if(args.length == 0){
            val brands = phones.values.toSet
            println( "Models Available : " + phones.keys )
            println( "Brands Available : " + brands )        
        }
        if(args.length > 0){
            println("Model name entered: "+args(0))
            if(phones.contains(args(0))){
              println("Brand Name Found: "+phones(args(0)))
            }else
              println("Record not found")
        }
        
    }
}