# J2Pay

**version 2.3.0**

J2Pay is an open source multi-gateway payment processing library for Java. Which provides simple and generic api for many gateways. It reduces developers efforts of writing individual code for each gateway. It provides flexibility to write code once for all gateways. It also excludes the efforts of reading docs for individual gateways.

## Why use J2Pay

1. You want multi gateway support in your application.
2. You do not have time for learning individual payment gateways docs that are also (poorly documented).
3. You want to support multiple payment gateways in your application without worrying about the implemention of each gateways.
4. You want to use single api for each gateway.
5. You dont want to write seperate logic for each gateway.

## Generic Request/Response.

If you would like to work with multiple gateways the main problem developers usually face are api prameters names.

for example.

some gateways 
take first name as fname or first_name or
take card number as CardNumber or Card_Number or card.

J2Pay excludes this type of efforts and provide classes for customer details and customer cards which will remain same for all gateways. 

Same problem when parsing gateway response.

J2Pay also excluded this type of efforts and provide generic response for all gateways.

for example.

when a transaction is successfully processed some gateways return transaction id as transaction_id or transId or trans_tag blah blah.
but if you are using J2pay you will always receive "transactionId".

You can see J2Pay official documentation and contributors guide on [j2pay.org](http://j2pay.org/)

# Contact us.

Feel free to contact us at info@tranxactive.com.
Your feedback is very important for us.

**`GOOD LUCK`**