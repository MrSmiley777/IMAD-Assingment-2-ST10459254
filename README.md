# IMAD-Assingment-2-ST10459254
Tamagotchi App Assingment 2 IMAD 
Gesaven Pillay
ST10459254
IMAD Assignment 2 Report

Purpose of Application

This Tamagotchi app for android, is a game that allows you to connect with a virtual pet (in this scenario I have chosen a Shiba Inu dog named Bob) which you can clean, play and feed.

General function of Application

The user opens the application and sees the welcome screen, in which the user will see a picture of bob welcoming the user and a button to continue to the next page.

When the user clicks on the button, it will take them to the next page with 3 buttons a picture of bob waiting and the stats, hunger, cleanliness and happiness. Every time the user clicks one of the buttons (one button for feeding, a button for cleaning and a button for playing with Bob) it changes the picture depending on the number of the stats. All the stats go up to a maximum of 100, each time the button is clicked 5 is added to the stat (default stat is 0), and while the stat is less than 100 the picture changes according to which button is clicked, if feed is clicked than a picture of Bob eating is shown, if the stat reaches 100 and is clicked then a picture of Bob waiting is shown, also a pop up message will tell the user if Bob is full, clean or tired of playing. When all the stats reach 100, any buttons clicked will show a picture of Bob celebrating and a pop up message will be shown in relation to it.  

Graphical Design 

The welcome screen contains a lot of textview with purple backgrounds and orange text to contrast and pop out to the user. The purple also blends well with the Bob “welcome” picture. The button matches the textview and are both in cursive font to give the app some elegance and making it appealing.

The interaction screen has a relative layout in a similar colour to Bob’s fur colour and has purple buttons with blue writing contrasting each other making it pop out to the user. The blue text matches with Bob’s “waiting” picture’s background. It also contains 6 textviews that have very easily readable text and clear displays for the user to understand the app easily. Everything blends well with each other while the text contrasts to make it extremely visible to the user. 

I have chosen the Shiba Inu, Bob and have used cute cartoon pictures that are similar to each other to make the application feel better and more professional (for example imagine using this app for a single pet but then the app displays multiple different dog types, it does not make sense and feels very fake). There are 6 pictures in total all depicting Bob and his relative action according to which button is clicked. I chose cute, cartoon pictures as it becomes more appealing to younger ages as this app is meant for that target market.

![image](https://github.com/MrSmiley777/IMAD-Assingment-2-ST10459254/assets/166629805/4a5213cf-c48b-47d9-ae9f-aa01a329bb64)

Figure 1. Pillay, G. 2024. Screenshot from Android Studio of user interface of the interaction screen.

![image](https://github.com/MrSmiley777/IMAD-Assingment-2-ST10459254/assets/166629805/b441456a-cf65-409f-b4c9-ec49bf2edaf9)

Figure 2. Pillay, G. Screenshot from Android Studio of user interface of the welcome screen.

![image](https://github.com/MrSmiley777/IMAD-Assingment-2-ST10459254/assets/166629805/9e72094b-2590-4c34-ab06-1ab859b2e130)

Figure 3. catalyststuff. [s. a.]., Cute shiba inu dog hug cartoon vector icon illustration animal nature icon concept isolated premium (Freepik, n.d.)

![image](https://github.com/MrSmiley777/IMAD-Assingment-2-ST10459254/assets/166629805/6b40e2d7-2901-49eb-806e-ea00f64baa23)

Figure 4. catalyststuff. [s. a.]. Bonito shiba inu sentado desenhos animados ilustração de ícone vetorial conceito de ícone de natureza animal isolado (Freepik, n.d.)

![image](https://github.com/MrSmiley777/IMAD-Assingment-2-ST10459254/assets/166629805/cf8250c3-8e86-4e2e-aee5-ca456d140dea)

Figure 5. catalyststuff. [s. a.]. Cute cool shiba inu dog playing skateboard cartoon vector icon ilustración. deporte animal aislado (Freepik, n.d.)

![image](https://github.com/MrSmiley777/IMAD-Assingment-2-ST10459254/assets/166629805/263e0200-e311-42ae-9dd7-561bb34d6514)

Figure 6. catalyststuff. [s. a.]. Cachorro shiba inu fofo comendo sushi cartoon (Freepik, n.d.)

![image](https://github.com/MrSmiley777/IMAD-Assingment-2-ST10459254/assets/166629805/5436e96c-5cdf-462e-87ad-a0016fcdb1a3)

Figure 7. catalyststuff. [s. a.]. Cute shiba inu bathing shower in bathtub cartoon vector illustration. animal love concept isolated vector. flat cartoon (Freepik, n.d.)

![image](https://github.com/MrSmiley777/IMAD-Assingment-2-ST10459254/assets/166629805/d6bde6b0-40c7-401f-b827-11671926378b)

Figure 8. catalyststuff. [s. a.]. Cute shiba inu celebrating cartoon vector icon illustration animal nature icon concept isolated (Freepik, n.d.)

Coding Design

The user must be able to enjoy the interface, we covered how it is visually appealing, but now let us look at the actual feel of the application. The user should be able to go through the application fluently without any glitches or annoying interface issues.

Which my application accomplishes. It is fluent in how it works. The user can clearly see what they need to do: Click the “Continue” button to go to the interaction screen and then clicking the feed, eat or clean buttons to make Bob happy.

Each time a button is clicked the stat is increased by 5 and a picture is displayed related to the button clicked unless it is already at 100 at which a relative message will pop up telling the user why they can no longer increase the stat and a picture of Bob waiting will be shown as he no longer can perform the action of the button. Additionally, if all stats are at 100 then the picture will change to Bob celebrating. Each button have basically the same code with slight differences depending on the action they are responsible for.

![image](https://github.com/MrSmiley777/IMAD-Assingment-2-ST10459254/assets/166629805/e3450585-3f77-4099-8eeb-787815bdead9)

Figure 9. Pillay, G. 2024. Screenshot displaying the feed button on click code.

What about user error? We must ensure that if the user makes an error, it should not break the program and that an error message should be displayed to correct the user.

No matter what order the buttons are pressed or how many times a button is pressed the application does not break and displays the correct output every time.

Testing in Android Studio

Through testing there is no glitches or problems with any data entered. Also, it is clear to the user how the application works which is good because when an interface becomes too complex it can make the user dislike the application or even uninstall it.

Utilisation of GitHub and GitHub Actions

It was easy to set up a repository and the fact that you can easily push your code, to make any changes even if its already uploaded is an amazing feature for anybody having questions: They can upload the code for everybody to see and comment on, either to improve, to learn and/or get help from other coders. GitHub Actions is also useful to test that other people can run your code without any errors, which is extremely helpful for both fun and business use. 


Logging of Code and Whole Assignment

26 April 2024-Main Activity
-	Made user interface, added images and picked right colours that make the app appealing.
-	Line 15-18 Coded button to move to interaction screen. 
26 April 2024-Interaction Activity
-	Made user interface, added images and picked right colours that make the app appealing.
-	Started coding.
-	Line 12-21 Variable declaration.
-	Line 26-34 Assigned variables to components with the “findViewById” method. 
-	Line 36-56 Coded button for feeding.
-	Line 38-56 Image error, I put the if statement for all stats being the same, first under the button which made the image produced wrong. 
-	Line 57-102 Copied code from feed button and made small details related to the button I was doing next.
-	Code completed.

References

1.	Freepik. [s. a.]. catalyststuff. [Online]. Available at:https://www.freepik.com [Accessed 26 April 2024].

List of figures

Figure 1: Pillay, G. 2024.  Screenshot from Android Studio of user interface of the interaction screen.

Figure 2: Pillay, G. 2024.  Screenshot from Android Studio of user interface of the welcome screen.

Figure 3. catalyststuff. [s. a.]. Cute shiba inu dog hug cartoon vector icon illustration animal nature icon concept isolated premium.

Figure 4. catalyststuff. [s. a.]. Bonito shiba inu sentado desenhos animados ilustração de ícone vetorial conceito de ícone de natureza animal isolado.

Figure 5. catalyststuff. [s. a.]. Cute cool shiba inu dog playing skateboard cartoon vector icon ilustración. deporte animal aislado.

Figure 6. catalyststuff. [s. a.]. Cachorro shiba inu fofo comendo sushi cartoon.

Figure 7. catalyststuff. [s. a.]. Cute shiba inu bathing shower in bathtub cartoon vector illustration. animal love concept isolated vector. flat cartoon.

Figure 8. catalyststuff. [s. a.]. Cute shiba inu celebrating cartoon vector icon illustration animal nature icon concept isolated.

Figure 9. Pillay, G. 2024. Screenshot displaying the feed button on click code.









