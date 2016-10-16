# 🎶⚗️ DnACE ⚗️🎶



###CHALLENGE TO BE SOLVED
####The general public doesn't show an interest in genomics due to a lack of engagement and basic knowldege 🤔

![Alt Text] (http://destinhaus.com/wp-content/uploads/2015/10/genomic_sequencing_usamriid.jpg)

###💡 SOLUTION 💡
####Provide a DDR (Dance Dance Revolution) experience using music comosed by DNA that attracts public and provides basic concepts that would bring people together. This will create awareness of the field of genomics that is emerging and will benefit the public.

####DDR will provide an interactive, multi-sensory experience, by combining science and dance-gaming to engage the public in Genomics.

###DnACE will make you to experience the DNA 😎 👯💥💥💥💥

![Alt Text] (https://66.media.tumblr.com/b5b8ef183bbf02fc98a3a21d99159dc1/tumblr_nw4yfqxSU71ubphlpo1_400.gif)

###_DNACE MEMBERS_

####_James F = Problem owner & mentor 🤓_

####_Elise & Sylvain = Creating DDR visuals. User interface development based in user experience (USUI) and associated hardware (existing dance mats) 👀_

####_James H = Interface functuallity. Development of visuals, flow, stream reading and key events 💻_

####_Louis & Angela = _Music producers. Establish the relationship between the cords and the base pairs to create a melody. Getting the DNA string from a database and reading that into different chords 🎶_

####_Araitz = Connecting work 😜_

### DDR VISUALS 

The visuals were made with java script based on SPACE INVADERS game.

![Alt Text](https://upload.wikimedia.org/wikipedia/en/2/20/SpaceInvaders-Gameplay.gif)

### HARDWARE

Sylvan had a idea to include LED strip to represent a strand of DNA however brainstorming suggested to include music and movement with the final prototype being a similar to the game "DANCE DANCE REVOLUTION" 💃💃💃 
To implement the dance steps we considered an existing solution or hacking keyboard.
The keyboard hack was attempted but the existing solution of the dance REDOCTANE pad was purchased (costs rrp $100 per pad but we found one in gumtree for $30 for 2 pads 🎉🎉🎉)

Sylvan manage to get a contact in Clovely for the dance mats.

![Alt Text] (https://cloud.githubusercontent.com/assets/22849604/19414444/4a00d336-9399-11e6-95b9-8f114ac212f9.JPG)

To hack a keyboard:


[Link to Hack a Keyboard ⌨️] (http://www.instructables.com/id/Hacking-a-USB-Keyboard/step1/Trace-the-letters-back-to-the-pins/)

### INTERFACE FUNCTIONALLITY

Enjoy2 for MACOS

[Link to Enjoy2] (https://github.com/fyhuang/enjoy2/blob/master/license.txt)


![Alt Text](https://raw.githubusercontent.com/HealthHackAu2016/DNACE/ab7ad23db0247caea85991ec7e1f7993c1e83edc/IMG_0357.PNG)

### MUSIC PRODUCTION

The music has been composed algoritmically according to the DNA sequence. 

The permutations of the 2 first letter in a set of 4 letters mapped onto one of 6 cords of the enigmatig D-scale, which is an interesting and unique music scale. 

Chords are determined by a data seet of DNA sequence.

The ambient melody takes 4 letters of another sequence provided by another data set and maps each letter to a note in the arpegio of the chord which was determined by the first data set.

Angela has hacked the CSV to midi source chors such that we translate DNA into music format.

“Chord” DNA String (human) for each set of 4 letters if first 2 letters are:
GT
GA
then play Cdim

if first 2 letters are:
GC
GG
then play Daug

if first 2 letters are:
TT
TA
CT
then play D#m

if first 2 letters are:
TC
TG
CA
then play F#

if first 2 letters are:
AA
AC
then play F#Aug

if first 2 letters are:
AT
AG
then play G#

if first 2 letters are:
CC
CG
Then play: A#aug

“melodic” DNA string embedded if for a different string input, based on each above chord  
Melodic string for each 4 letters
if
A= base note (of chord arpeggio)
if
G = 2nd note(of chord arpeggio)
if
T = 3rd note( of chord arpeggio)
if
C = Octave/4th note if diminished/4 note chord structure( of chord arpeggio)

Notes(ascending arpeggios) that comprise chords:
C dim: C, Eb, Gb
Daug: D, F#, A#
D#m: D#, F#, A#,
F#: F#, A#, C#
F#Aug: F, A, C#
G#: G#, B#, D#, 
A#: A#, C, E,


var sub1 = str.substring(4);
while (str.length >= "0") {
  var sub = sub1.substring(2);
    if (sub == "GT" || sub == "GA") {
      //play Cdim
    } else if (sub == "GC" || sub == "GG") {
      //play Daug
    } else if (sub == "TT" || sub == "TA" || sub == "CT") {
      //play D#m
    } else if (sub == "TC" || sub == "TG" || sub == "CA") {
      //play F#
    } else if (sub == "AA" || sub == "AC") {
      //play F#Aug
    } else if (sub == "AT" || sub == "AG") {
      //play G#
    } else {
      //play A#Aug
    }

  var str = str.slice(4,str.length);
}


![Alt Text](http://bestanimations.com/Music/MirrorBalls/disco-dancing-animated-gif-3.gif)

[Link to GENOMIC BEAUTY!!! 👑👑👑] (https://youtu.be/yKW4F0Nu-UY)

![Alt Text](https://github.com/HealthHackAu2016/DNACE/blob/master/IMG_0356.PNG?raw=true)

![Alt Text](http://www.rivercitylabs.net/wp-content/uploads/2015/10/health-hack.png)
