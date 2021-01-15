# Caesar encryption and decryption implementation

This is a simple implementation of the Caesar encryption and decryption algorithm.

**How does it work?**
The program uses internally the ASCII charset, meaning an A would not be 0 or 1 but 65.
Hence, the last character (the Z) would have the index / position 90.
Now, if you have the key 'A' (value is 65 again) and the cleartext sign 'B' (= 66),
the result would be of course 131.
Now you actually don't know what is 131, so you take a look at the ASCII table,
e.g. here https://de.wikipedia.org/wiki/American_Standard_Code_for_Information_Interchange#ASCII-Tabelle .

You will find out, the encrypted sign is actually beyond the ASCII table (only 128 signs).
That is simply because originally there are only 128 signs but in modern systems you most likely
will have the so called "extended ASCII charset", which has 256 signs in the end.
There are various versions of these "extended" ones but you will most likely have the
ISO 8859-1 standard in western countries.
The table can be found here: https://www.ascii-code.com/
Now, when we are looking at 131 it is displays the sign ƒ which is the result.
If not, this is just because your systems console has a different charset,
so don't worry..
You can always cast the char value to an integer if you are unsure what is the result..


For decryption, the reversed algorithm applies correspondingly.
You just subtract the key from the ciphertext sign, but note:
if the result would be negative (e.g. 33 - 34, where 34 is the key sign)
you would have to begin again at 255 (extended ASCII) or 127 (normal ASCII).