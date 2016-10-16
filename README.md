# 🎶⚗️ DnACE ⚗️🎶



###CHALLENGE TO BE SOLVED
####General public doesnt show interest in genomics due to technicisim and lack of basic knowldege 🤔

![Alt Text] (http://destinhaus.com/wp-content/uploads/2015/10/genomic_sequencing_usamriid.jpg)

###💡 SOLUTION 💡
####Provide a DDR (Dance Dance Revolution) experience based on genomics that attracts public and provides basic concepts that would bring people into it. This will create awareness of a biomedical field that is emerging and would benefit the public.

####DDR will provide a sensory interactivity of combining science and dance-gaming to engage public in Genomics.

###DnACE will make you to experience the DNA 😎 👯💥💥💥💥

![Alt Text] (https://66.media.tumblr.com/b5b8ef183bbf02fc98a3a21d99159dc1/tumblr_nw4yfqxSU71ubphlpo1_400.gif)

###_DNACE MEMBERS_

####_James F = Problem owner & mentor 🤓_

####_Elise & Sylvain = Creating DDR visuals. User interface development based in user experience (USUI) and associated hardware (existing dance mats) 👀_

####_James H = Interface functuallity. Xx developing? flow, stream reading and key events 💻_

####_Louis & Angela = _Music producers. Establish the relationship between the cords and the base pairs to create a melody. Getting the DNA string from a database and reading that into different chords 🎶_

####_Araitz = Connecting work 😜_

### DDR VISUALS 

![Alt Text](https://upload.wikimedia.org/wikipedia/en/2/20/SpaceInvaders-Gameplay.gif)

### HARDWARE

Sylvan manage to get a contact in Clovely for the dance mats.

![Alt Text] (https://github.com/HealthHackAu2016/DNACE/blob/master/IMG_0340.PNG?raw=true)

The other option would be to hack a keyboard:


[Link to Hack a Keyboard ⌨️] (http://www.instructables.com/id/Hacking-a-USB-Keyboard/step1/Trace-the-letters-back-to-the-pins/)

### INTERFACE FUNCTIONALLITY







### MUSIC PRODUCTION

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
G= base note (of chord arpeggio)
if
T = 2nd note(of chord arpeggio)
if
A = 3rd note( of chord arpeggio)
if
C = Octave/4th note if diminished/4 note chord structure( of chord arpeggio)


“bass” DNA string note based on chord also,
For each SET of 4 letters,
if first letter is:
G, then play basenote ( of chord arpeggio)
T = 2nd note (of chord arpeggio)
A = 3rd note(of chord arpeggio)
C = Octave/4th note(of chord arpeggio)

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
