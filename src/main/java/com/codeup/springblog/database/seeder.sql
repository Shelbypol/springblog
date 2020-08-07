
USE spring_db;

INSERT INTO posts (id, title, post, user_id)
VALUES
(1, 'According to all known laws of aviation,', 'there is no way that a bee should be able to fly. Its wings are too small to get its fat little body off the ground. The bee, of course, flies anyway. Because bees don’t care what humans think is impossible.” SEQ. 75 - “INTRO TO BARRY” INT. BENSON HOUSE - DAY ANGLE ON: Sneakers on the ground. Camera PANS UP to reveal BARRY BENSON’S BEDROOM ANGLE ON: Barry’s hand flipping through different sweaters in his closet. BARRY Yellow black, yellow black, yellow black, yellow black, yellow black, yellow black...oohh, black and yellow... ANGLE ON: Barry wearing the sweater he picked, looking in the mirror. BARRY (CONT’D) Yeah, let’s shake it up a little. He picks the black and yellow one. He then goes to the sink, takes the top off a CONTAINER OF HONEY, and puts some honey into his hair.', 9),
(2, 'BARRY Can’t believe it. I’ll pick you up.', 'He squirts some in his mouth and gargles. Then he takes the lid off the bottle, and rolls some on like deodorant. CUT TO: INT. BENSON HOUSE KITCHEN - CONTINUOUS Barry’s mother, JANET BENSON, yells up at Barry. JANET BENSON Barry, breakfast is ready! CUT TO: "Bee Movie" - JS REVISIONS 8/13/07 1. INT. BARRY’S ROOM - CONTINUOUS BARRY Coming! SFX: Phone RINGING. Barry’s antennae vibrate as they RING like a phone. Barry’s hands are wet. He looks around for a towel. BARRY (CONT’D) Hang on a second! He wipes his hands on his sweater, and pulls his antennae down to his ear and mouth. BARRY (CONT''D) Hello? His best friend, ADAM FLAYMAN, is on the other end. ADAM Barry? BARRY Adam? ADAM Can you believe this is happening? BARRY Can’t believe it. I’ll pick you up.', 9),
(3, 'Barry sticks his stinger in a sharpener.', 'SFX: BUZZING AS HIS STINGER IS SHARPENED. He tests the sharpness with his finger. SFX: Bing. BARRY (CONT’D) Looking sharp. ANGLE ON: Barry hovering down the hall, sliding down the staircase bannister. Barry’s mother, JANET BENSON, is in the kitchen. JANET BENSON Barry, why don’t you use the stairs? Your father paid good money for those. "Bee Movie" - JS REVISIONS 8/13/07 2. BARRY Sorry, I’m excited. Barry’s father, MARTIN BENSON, ENTERS. He’s reading a NEWSPAPER with the HEADLINE, “Queen gives birth to thousandtuplets: Resting Comfortably.” MARTIN BENSON Here’s the graduate. We’re very proud of you, Son. And a perfect report card, all B’s. JANET BENSON (mushing Barry’s hair) Very proud. BARRY Ma! I’ve got a thing going here. Barry re-adjusts his hair, starts to leave. JANET BENSON You’ve got some lint on your fuzz. She picks it off. BARRY Ow, that’s me! MARTIN BENSON Wave to us. We’ll be in row 118,000. Barry zips off.', 3),
(4, 'BARRY Bye!', 'JANET BENSON Barry, I told you, stop flying in the house! CUT TO: SEQ. 750 - DRIVING TO GRADUATION EXT. BEE SUBURB - MORNING A GARAGE DOOR OPENS. Barry drives out in his CAR. "Bee Movie" - JS REVISIONS 8/13/07 3. ANGLE ON: Barry’s friend, ADAM FLAYMAN, standing by the curb. He’s reading a NEWSPAPER with the HEADLINE: “Frisbee Hits Hive: Internet Down. Bee-stander: “I heard a sound, and next thing I knew...wham-o!.” Barry drives up, stops in front of Adam. Adam jumps in. BARRY Hey, Adam. ADAM Hey, Barry. (pointing at Barry’s hair) Is that fuzz gel? BARRY A little. It’s a special day. Finally graduating. ADAM I never thought I’d make it. BARRY Yeah, three days of grade school, three days of high school. ADAM Those were so awkward. BARRY Three days of college', 4),
(5, 'I’m glad I took off one day in the middle', 'and just hitchhiked around the hive. ADAM You did come back different. They drive by a bee who’s jogging. ARTIE Hi Barry! BARRY (to a bee pedestrian) Hey Artie, growing a mustache? Looks good. Barry and Adam drive from the suburbs into the city. ADAM Hey, did you hear about Frankie? "Bee Movie" - JS REVISIONS 8/13/07 4. BARRY Yeah. ADAM You going to his funeral? BARRY No, I’m not going to his funeral. Everybody knows you sting someone you die, you don’t waste it on a squirrel. He was such a hot head. ADAM Yeah, I guess he could’ve just gotten out of the way. The DRIVE through a loop de loop. BARRY AND ADAM Whoa...Whooo...wheee!! ADAM I love this incorporating the amusement park right into our regular day.', 2),
(6, 'that’s why they say we don’t need vacations.', 'CUT TO: SEQ. 95 - GRADUATION EXT. GRADUATION CEREMONY - CONTINUOUS Barry and Adam come to a stop. They exit the car, and fly over the crowd to their seats. * BARRY * (re: graduation ceremony) * Boy, quite a bit of pomp...under * the circumstances. * They land in their seats. BARRY (CONT’D) Well Adam, today we are men.', 2),
(7, 'BARRY', 'BARRY Are we going to pick our job today? ADAM I heard it’s just orientation. The rows of chairs change in transformer-like mechanical motion to Universal Studios type tour trams. Buzzwell walks off stage. BARRY (re: trams) Whoa, heads up! Here we go. "Bee Movie" - JS REVISIONS 8/13/07 6. SEQ. 125 - “FACTORY” FEMALE VOICE (V.O) Keep your hands and antennas inside the tram at all times. (in Spanish) Dejen las manos y antennas adentro del tram a todos tiempos. BARRY I wonder what it’s going to be like? ADAM A little scary. Barry shakes Adam. BARRY AND ADAM AAHHHH!', 7);

#
use comments;
INSERT INTO comments (content, post_id)
VALUES
('I love the bee movie! ...."WAAATCCHHH THISSSSS!!"', 1),
('Today is the day! They are graduating!', 2),
('the bee movie!', 1),
('Is that fuzz gel? ~classic~', 4),
('We''re all cousins!', 7),
('bee-men!', 7),
('I don''t know about these buzzy fools but i need a vacation', 6);


insert into users (id, username, email, password) values (1, 'rpermain0', 'cmouat0@disqus.com', 'Jz2o5SVqbqlL');
insert into users (id, username, email, password) values (2, 'spalister1', 'pburner1@ask.com', 'QaRHbuYbg');
insert into users (id, username, email, password) values (3, 'jyushachkov2', 'kwrettum2@pcworld.com', 'TJKABVBaVayw');
insert into users (id, username, email, password) values (4, 'cfarrin3', 'mhens3@umich.edu', 'HVsRiIONt2');
insert into users (id, username, email, password) values (5, 'pkmietsch4', 'rpaulmann4@cnet.com', 'JrJoMH');
insert into users (id, username, email, password) values (6, 'abexon5', 'lmcmillian5@slate.com', 'P7gL6P');
insert into users (id, username, email, password) values (7, 'apauleit6', 'ibassil6@multiply.com', 'bUuFFrYf');
insert into users (id, username, email, password) values (8, 'dmccurt7', 'rhenbury7@google.it', '4W43zGKTyv4d');
insert into users (id, username, email, password) values (9, 'izarfati8', 'rpirolini8@dyndns.org', 'pLFPHEKjA');
