//20 Random Integers between 1 to 100
var a = 1
while(a < 21){
	println(Math.ceil(Math.random()*100).toInt)
	a += 1
}

for(i <- 1 to 20)
	println(Math.ceil(Math.random()*100).toInt)

