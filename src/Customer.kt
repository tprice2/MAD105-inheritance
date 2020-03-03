
open class Customer(customerName: String, customerPhone: String,
               customerAddress: String,squareFootage: Double) {
    var customerName = ""
    var customerPhone = ""
    var customerAddress = ""
    var squareFootage = 0.0
    init{
        println("Creating a customer")
        this.customerName = customerName
        this.customerPhone = customerPhone
        this.customerAddress = customerAddress
        this.squareFootage = squareFootage
    }

    fun showCustomer(){
        println("Name: " + customerName + "\nPhone: " + customerPhone +
                "\nAddress: " + customerAddress + "\nSquare Footage: " + squareFootage)
    }
}

class Commercial(customerName: String,customerPhone: String,
                 customerAddress: String,squareFootage: Double,
                 propertyName: String, multiProperty: Boolean):
                    Customer(customerName,customerPhone,
                    customerAddress,squareFootage)
{

    var propertyName = ""
    var rate = 0.0
    var multiProperty = false

    init{
        println("Make a commercial customer")
        this.customerName = customerName
        this.customerPhone = customerPhone
        this.customerAddress = customerAddress
        this.squareFootage = squareFootage
        this.propertyName = propertyName
        this.multiProperty = multiProperty
    }

     fun weeklyCharge(){
         rate = 5 * squareFootage/1000

         if(multiProperty == true)
         {
             rate = rate*.9
         }

         println("Multi-property: " + multiProperty +"\nWeekly charge: $" + rate +
                 "\nProperty Name: " + propertyName)
     }
}

class Residential(customerName: String,customerPhone: String,
                  customerAddress: String,squareFootage: Double,
                  Senior: Boolean):
                    Customer(customerName,customerPhone,
                    customerAddress,squareFootage)
{
    var rate = 0.0
    var Senior = false

    init{
        println("Make a commercial customer")
        this.customerName = customerName
        this.customerPhone = customerPhone
        this.customerAddress = customerAddress
        this.squareFootage = squareFootage
        this.Senior = Senior
    }

    fun weeklyCharge(){
        rate = 6 * squareFootage/1000

        if(Senior == true)
        {
            rate = rate*.85
        }

        println("Senior discount: " + Senior +"\nWeekly charge: $" + rate)
    }
}
