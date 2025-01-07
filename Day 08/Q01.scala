object CaesarCipher {

    def encrypt(plaintext: String, shift: Int): String = {
        plaintext.map { char =>
            if (char.isLetter) {
            val shiftOffset = if (char.isUpper) 'A' else 'a'
            ((char - shiftOffset + shift) % 26 + shiftOffset).toChar
        } else {
            char
        }
        }
    }

    def decrypt(ciphertext: String, shift: Int): String = {
        encrypt(ciphertext, 26 - shift)
    }

    def cipher(data: String, shift: Int, operation: (String, Int) => String): String = { //highorder function 
        operation(data, shift)
    }

    def main(args: Array[String]): Unit = {
        print("Enter the text: ")
        val text = scala.io.StdIn.readLine()

        print("Enter the shift value: ")
        val shift = scala.io.StdIn.readInt()

        print("Choose operation( (1) Encrypt / (2) Decrypt ): ")
        val choice = scala.io.StdIn.readInt()

        val result = choice match {
            case 1 => cipher(text, shift, encrypt)
            case 2 => cipher(text, shift, decrypt)
            case _ => "Invalid choice. Please select 1 for encryption or 2 for decryption."
        }

        println(s"Result: $result")
    }
}