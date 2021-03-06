-- SET DATABASE
USE abs_bankaccount;

-- SET AUTO INCREMENT
ALTER TABLE `AccountImpl` CHANGE `id` `id` INT(11) NOT NULL AUTO_INCREMENT;
ALTER TABLE `CustomerImpl` CHANGE `id` `id` INT(11) NOT NULL AUTO_INCREMENT;

-- SEED CUSTOMER LIST
insert into CustomerImpl (address, phone, name, id, email) values ('pondok ripi', '08121828383', 'Affan', '1', 'affan.dhia@ui.ac.id');
insert into CustomerImpl (address, phone, name, id, email) values ('1855 Jana Lane', '8729726894', 'Christin Mapletoft', '2', 'cmapletoft1@newyorker.com');
insert into CustomerImpl (address, phone, name, id, email) values ('2321 Manitowish Ro', '6714579142', 'Trula Dickings', '3', 'tdickings2@cocolog-nifty.com');
insert into CustomerImpl (address, phone, name, id, email) values ('03 Mcbride Park', '8044275999', 'Jeffy Danzey', '4', 'jdanzey3@example.com');
insert into CustomerImpl (address, phone, name, id, email) values ('05643 Anthes Crossi', '6601869233', 'Gates Crampton', '5', 'gcrampton4@tamu.edu');
insert into CustomerImpl (address, phone, name, id, email) values ('02 Homewood Trail', '3078262926', 'Cecilio Cohan', '6', 'ccohan5@merriam-webster.com');
insert into CustomerImpl (address, phone, name, id, email) values ('49954 Moulton Hill', '4742938248', 'Van Hannam', '7', 'vhannam6@amazon.co.jp');
insert into CustomerImpl (address, phone, name, id, email) values ('721 Golf View Way', '7258033516', 'Anselma Webburn', '8', 'awebburn7@ftc.gov');
insert into CustomerImpl (address, phone, name, id, email) values ('5166 Manitowish Ro', '9839496016', 'Elias Berthomier', '9', 'eberthomier8@msn.com');
insert into CustomerImpl (address, phone, name, id, email) values ('15 Butterfield Cross', '9138813613', 'Chase Burris', '10', 'cburris9@trellian.com');
insert into CustomerImpl (address, phone, name, id, email) values ('77945 Lillian Lane', '5093942519', 'Eamon Root', '11', 'eroota@tec.com');
insert into CustomerImpl (address, phone, name, id, email) values ('087 Scott Park', '4392076394', 'Sayres Fonte', '12', 'sfonteb@xinhuanet.com');
insert into CustomerImpl (address, phone, name, id, email) values ('8382 Melby Plaza', '9555220249', 'Denny Doerrling', '13', 'ddoerrlingc@tec.com');
insert into CustomerImpl (address, phone, name, id, email) values ('6839 Cody Hill', '4746936383', 'Ailene Osselton', '14', 'aosseltond@tec.com');
insert into CustomerImpl (address, phone, name, id, email) values ('0496 Hudson Juncti', '4577929965', 'Shena McColm', '15', 'smccolme@hubpages.com');
insert into CustomerImpl (address, phone, name, id, email) values ('5 Melby Point', '5137466293', 'Andy Witchard', '16', 'awitchardf@wufoo.com');
insert into CustomerImpl (address, phone, name, id, email) values ('89537 Pierstorff Po', '9245746111', 'Wynn Cummins', '17', 'wcumminsg@un.org');
insert into CustomerImpl (address, phone, name, id, email) values ('145 Summit Alley', '6339427450', 'Nahum Sussams', '18', 'nsussamsh@netvibes.com');
insert into CustomerImpl (address, phone, name, id, email) values ('631 Gina Pass', '3309473994', 'Templeton Easeman', '19', 'teasemani@vkontakte.ru');
insert into CustomerImpl (address, phone, name, id, email) values ('859 Cottonwood Cou', '8652396922', 'Agneta Fifield', '20', 'afifieldj@vis.com');
insert into CustomerImpl (address, phone, name, id, email) values ('95 Mitchell Road', '4736062628', 'Cathlene Beacock', '21', 'cbeacockk@merriam-webster.com');
insert into CustomerImpl (address, phone, name, id, email) values ('08 Fremont Terrace', '8472029114', 'Syman Papierz', '22', 'spapierzl@tinyurl.com');
insert into CustomerImpl (address, phone, name, id, email) values ('4 Tennessee Juncti', '7919000152', 'Stanleigh Szachniew', '23', 'sszachniewiczm@networkso.com');
insert into CustomerImpl (address, phone, name, id, email) values ('1697 Continental Junct', '7345607904', 'Ingar Borgne', '24', 'iborgnen@oakley.com');
insert into CustomerImpl (address, phone, name, id, email) values ('28986 Truax Avenue', '5938407133', 'Barnaby De Ruel', '25', 'bdeo@msn.com');
insert into CustomerImpl (address, phone, name, id, email) values ('1917 4th Park', '7799434549', 'Eolande Gasken', '26', 'egaskenp@wordpress.org');
insert into CustomerImpl (address, phone, name, id, email) values ('6258 Forest Street', '3831233603', 'Archibaldo Heaton', '27', 'aheatonq@tinyurl.com');
insert into CustomerImpl (address, phone, name, id, email) values ('15 Fordem Terrace', '1518118323', 'Sile Chaney', '28', 'schaneyr@miitbeian.gov.cn');
insert into CustomerImpl (address, phone, name, id, email) values ('29 2nd Center', '7883258581', 'Sallee Knoton', '29', 'sknotons@twitter.com');
insert into CustomerImpl (address, phone, name, id, email) values ('1 Dexter Terrace', '9052918439', 'Prince Mityushin', '30', 'pmityushint@time.com');
insert into CustomerImpl (address, phone, name, id, email) values ('47 Birchwood Lane', '2132953005', 'Marylynne Rubinowi', '31', 'mrubinowitzu@google.es');
insert into CustomerImpl (address, phone, name, id, email) values ('162 American Hill', '4418659311', 'Melly Kirgan', '32', 'mkirganv@alexa.com');
insert into CustomerImpl (address, phone, name, id, email) values ('588 Doe Crossing Junct', '7298043210', 'Curt Gilchrest', '33', 'cgilchrestw@ebay.com');
insert into CustomerImpl (address, phone, name, id, email) values ('28 Dovetail Lane', '4173077937', 'Toinette Heddan', '34', 'theddanx@free.fr');
insert into CustomerImpl (address, phone, name, id, email) values ('99245 Beilfuss Way', '5225097545', 'Maxy Hiddsley', '35', 'mhiddsleyy@gizmodo.com');
insert into CustomerImpl (address, phone, name, id, email) values ('29574 Amoth Terrace', '2591491261', 'Salli Rosenboim', '36', 'srosenboimz@dot.gov');
insert into CustomerImpl (address, phone, name, id, email) values ('04881 Springview La', '5029823522', 'Elisabetta Cluatt', '37', 'ecluatt10@kick.com');
insert into CustomerImpl (address, phone, name, id, email) values ('8743 Forster Circle', '3374742937', 'Yard Ulster', '38', 'yulster11@taobao.com');
insert into CustomerImpl (address, phone, name, id, email) values ('2192 Del Sol Lane', '9019181482', 'Noel Dagworthy', '39', 'ndagworthy12@cmu.edu');
-- insert into CustomerImpl (address, phone, name, id, email) values ('5528 Hazelcrest Junct', '8642998425', 'Clareta Viger', '40', 'cviger13@gmpg.org');
-- insert into CustomerImpl (address, phone, name, id, email) values ('97 Welch Road', '3404731211', 'Eustacia Rucklesse', '41', 'erucklesse14@networkso.com');
-- insert into CustomerImpl (address, phone, name, id, email) values ('147 Tony Parkway', '7828766818', 'Lelah Olekhov', '42', 'lolekhov15@hexun.com');
-- insert into CustomerImpl (address, phone, name, id, email) values ('7 Chive Terrace', '4637867940', 'Phil Illidge', '43', 'pillidge16@wufoo.com');
-- insert into CustomerImpl (address, phone, name, id, email) values ('03883 Hauk Hill', '6582777578', 'Rhiamon Knaggs', '44', 'rknaggs17@yell.com');
-- insert into CustomerImpl (address, phone, name, id, email) values ('3789 Mitchell Parkw', '1786799529', 'Pyotr Garret', '45', 'pgarret18@vis.com');
-- insert into CustomerImpl (address, phone, name, id, email) values ('919 Milwaukee Terra', '8194665031', 'Jolyn Bishopp', '46', 'jbishopp19@economist.com');
-- insert into CustomerImpl (address, phone, name, id, email) values ('00485 Forest Run Tr', '2677537574', 'Phillipp Loch', '47', 'ploch1a@msn.com');
-- insert into CustomerImpl (address, phone, name, id, email) values ('215 Raven Court', '1482111745', 'Scottie Bartosinski', '48', 'sbartosinski1b@busin.com');
-- insert into CustomerImpl (address, phone, name, id, email) values ('822 Porter Crossing', '9788017097', 'Tasha Bastone', '49', 'tbastone1c@scienc.com');
-- insert into CustomerImpl (address, phone, name, id, email) values ('189 Clarendon Cross', '1642489255', 'Constantin Krimmer', '50', 'ckrimmer1d@alt.org');
-- insert into CustomerImpl (address, phone, name, id, email) values ('3 Kenwood Trail', '9269792446', 'Smith Glennard', '51', 'sglennard1e@plala.or.jp');
-- insert into CustomerImpl (address, phone, name, id, email) values ('67188 Texas Hill', '7101032215', 'Desiree Welbelove', '52', 'dwelbelove1f@prweb.com');
-- insert into CustomerImpl (address, phone, name, id, email) values ('619 Knutson Avenue', '6802389202', 'Anson Hinksen', '53', 'ahinksen1g@zimbio.com');
-- insert into CustomerImpl (address, phone, name, id, email) values ('5916 Sachtjen Road', '6119240885', 'Babbie Eborn', '54', 'beborn1h@sogou.com');
-- insert into CustomerImpl (address, phone, name, id, email) values ('9 Kensington Court', '9315698704', 'Evy Florez', '55', 'eflorez1i@irs.gov');
-- insert into CustomerImpl (address, phone, name, id, email) values ('03132 Nelson Juncti', '6229009761', 'Andee Cator', '56', 'acator1j@ocn.ne.jp');
-- insert into CustomerImpl (address, phone, name, id, email) values ('52319 Farwell Aven', '4931657399', 'Martainn Chomicki', '57', 'mchomicki1k@baidu.com');
-- insert into CustomerImpl (address, phone, name, id, email) values ('53 Eastwood Parkway', '7566808952', 'Roma Tapson', '58', 'rtapson1l@taobao.com');
-- insert into CustomerImpl (address, phone, name, id, email) values ('00 Grasskamp Place', '1192154340', 'Thedrick Gammons', '59', 'tgammons1m@bloglines.com');
-- insert into CustomerImpl (address, phone, name, id, email) values ('4072 Bayside Trail', '9811616283', 'Godfree Tawton', '60', 'gtawton1n@walmart.com');
-- insert into CustomerImpl (address, phone, name, id, email) values ('8843 Michigan Stre', '4104319915', 'Etan Groom', '61', 'egroom1o@trip.com');
-- insert into CustomerImpl (address, phone, name, id, email) values ('0 Delaware Parkway', '9979804720', 'Micheil Wanek', '62', 'mwanek1p@ucla.edu');
-- insert into CustomerImpl (address, phone, name, id, email) values ('64341 Butterfield Pl', '6555174445', 'Francois Garmans', '63', 'fgarmans1q@hp.com');
-- insert into CustomerImpl (address, phone, name, id, email) values ('04809 Stephen Junct', '9844797591', 'Darnell Sorsby', '64', 'dsorsby1r@bloglovin.com');
-- insert into CustomerImpl (address, phone, name, id, email) values ('10 Fuller Trail', '8619961546', 'Thorndike Dyson', '65', 'tdyson1s@mysql.com');
-- insert into CustomerImpl (address, phone, name, id, email) values ('918 Blaine Street', '7489793978', 'Wenda Upcott', '66', 'wupcott1t@cnet.com');
-- insert into CustomerImpl (address, phone, name, id, email) values ('68 Amoth Parkway', '3001481481', 'Carmon Menel', '67', 'cmenel1u@tut.it');
-- insert into CustomerImpl (address, phone, name, id, email) values ('466 Blackbird Terra', '1795888419', 'Jefferey Edel', '68', 'jedel1v@ucla.edu');
-- insert into CustomerImpl (address, phone, name, id, email) values ('368 Morningstar Cou', '1482697691', 'Dani Pearmain', '69', 'dpearmain1w@aol.com');
-- insert into CustomerImpl (address, phone, name, id, email) values ('6 Moulton Parkway', '1344340860', 'Genia Fernanando', '70', 'gfernanando1x@ycom.com');
-- insert into CustomerImpl (address, phone, name, id, email) values ('4292 Ridgeway Trail', '3354825162', 'Lishe Antosch', '71', 'lantosch1y@fc2.com');
-- insert into CustomerImpl (address, phone, name, id, email) values ('23 Scott Street', '7462974874', 'Dell Delagua', '72', 'ddelagua1z@theg.com');
-- insert into CustomerImpl (address, phone, name, id, email) values ('9932 Manufacturers R', '9314040266', 'Dmitri Goodby', '73', 'dgoodby20@yandex.ru');
-- insert into CustomerImpl (address, phone, name, id, email) values ('02 Evergreen Street', '2885462790', 'Ashley Dallender', '74', 'adallender21@cnn.com');
-- insert into CustomerImpl (address, phone, name, id, email) values ('9045 Lotheville Pa', '3539299541', 'Reed Arnould', '75', 'rarnould22@newsvine.com');
-- insert into CustomerImpl (address, phone, name, id, email) values ('995 Sherman Place', '7514044959', 'Irma Dovey', '76', 'idovey23@yolasite.com');
-- insert into CustomerImpl (address, phone, name, id, email) values ('678 Marcy Terrace', '2231734977', 'Obediah Cobello', '77', 'ocobello24@cdc.gov');
-- insert into CustomerImpl (address, phone, name, id, email) values ('8593 John Wall Way', '3657270152', 'Gawen Vian', '78', 'gvian25@bluehost.com');
-- insert into CustomerImpl (address, phone, name, id, email) values ('6 Schlimgen Pass', '7995858473', 'Carr Schultz', '79', 'cschultz26@busin.com');
-- insert into CustomerImpl (address, phone, name, id, email) values ('40 Hollow Ridge Dri', '8119440245', 'Olivette Vondrys', '80', 'ovondrys27@ca.gov');
-- insert into CustomerImpl (address, phone, name, id, email) values ('733 Golf Terrace', '8379081708', 'Ivette Bolliver', '81', 'ibolliver28@washing.com');
-- insert into CustomerImpl (address, phone, name, id, email) values ('31 Prairie Rose Park', '5645028579', 'Artemus Isles', '82', 'aisles29@ibm.com');
-- insert into CustomerImpl (address, phone, name, id, email) values ('21 Marquette Terra', '4173723184', 'Rodrick Fincke', '83', 'rfincke2a@tinyurl.com');
-- insert into CustomerImpl (address, phone, name, id, email) values ('736 Nobel Court', '5876803306', 'Reggis Pinard', '84', 'rpinard2b@google.co.uk');
-- insert into CustomerImpl (address, phone, name, id, email) values ('018 Kensington Road', '6955674857', 'Noell Hindge', '85', 'nhindge2c@etsy.com');
-- insert into CustomerImpl (address, phone, name, id, email) values ('27776 Grayhawk Lane', '1774240395', 'Klaus Lorenzo', '86', 'klorenzo2d@symantec.com');
-- insert into CustomerImpl (address, phone, name, id, email) values ('5 Southridge Road', '2569419422', 'Felecia Lebell', '87', 'flebell2e@hatena.ne.jp');
-- insert into CustomerImpl (address, phone, name, id, email) values ('34710 Red Cloud Tra', '4812239544', 'Gwendolyn Shreeve', '88', 'gshreeve2f@arst.com');
-- insert into CustomerImpl (address, phone, name, id, email) values ('7743 Fisk Drive', '2151057983', 'Giralda Kendal', '89', 'gkendal2g@auda.org.au');
-- insert into CustomerImpl (address, phone, name, id, email) values ('7566 Westend Hill', '1701743644', 'Lenard Stoner', '90', 'lstoner2h@digg.com');
-- insert into CustomerImpl (address, phone, name, id, email) values ('340 Boyd Crossing', '2999335837', 'Sharlene Tomlett', '91', 'stomlett2i@elpais.com');
-- insert into CustomerImpl (address, phone, name, id, email) values ('9827 Farwell Court', '5183925441', 'Hermie Bester', '92', 'hbester2j@yahoo.com');
-- insert into CustomerImpl (address, phone, name, id, email) values ('61389 Dexter Avenue', '6197497722', 'Roderich Toffts', '93', 'rtoffts2k@may.com');
-- insert into CustomerImpl (address, phone, name, id, email) values ('71 Carpenter Street', '7915800471', 'Carlee Stidson', '94', 'cstidson2l@ning.com');
-- insert into CustomerImpl (address, phone, name, id, email) values ('6 Tomscot Hill', '9451894308', 'Dom Magarrell', '95', 'dmagarrell2m@miitbeian.gov.cn');
-- insert into CustomerImpl (address, phone, name, id, email) values ('9706 Florence Cent', '7554010424', 'Brok Sodo', '96', 'bsodo2n@huge.com');
-- insert into CustomerImpl (address, phone, name, id, email) values ('226 Maywood Lane', '1314037079', 'Darby Cano', '97', 'dcano2o@usda.gov');
-- insert into CustomerImpl (address, phone, name, id, email) values ('736 Monument Road', '5701477169', 'Bessie Basill', '98', 'bbasill2p@google.com.au');
-- insert into CustomerImpl (address, phone, name, id, email) values ('9871 Steensland Pa', '7719435246', 'Lezlie MacGeaney', '99', 'lmacgeaney2q@samsung.com');
-- insert into CustomerImpl (address, phone, name, id, email) values ('39 Meadow Valley Cross', '4018977243', 'Brandy Graine', '100', 'bgraine2r@about.com');

-- SEED ACCOUNT LIST
insert into AccountImpl (balance, rekening, interest, customerId, id) values (6741989694, '3547926111599841', 8, 1, 1);
insert into AccountImpl (balance, rekening, interest, customerId, id) values (308827658, '3549784516262327', 5, 2, 2);
insert into AccountImpl (balance, rekening, interest, customerId, id) values (6630340154, '06044993141880493', 10, 3, 3);
insert into AccountImpl (balance, rekening, interest, customerId, id) values (8966700007, '5641828049639469', 4, 4, 4);
insert into AccountImpl (balance, rekening, interest, customerId, id) values (1035198676, '3560290344459147', 9, 5, 5);
insert into AccountImpl (balance, rekening, interest, customerId, id) values (5169273609, '5365691543673598', 9, 6, 6);
insert into AccountImpl (balance, rekening, interest, customerId, id) values (4606893947, '633379205602339687', 3, 7, 7);
insert into AccountImpl (balance, rekening, interest, customerId, id) values (6393735165, '3551020317821051', 9, 8, 8);
insert into AccountImpl (balance, rekening, interest, customerId, id) values (6285152352, '3577802825658368', 4, 9, 9);
insert into AccountImpl (balance, rekening, interest, customerId, id) values (3628644163, '30525311044242', 3, 10, 10);
insert into AccountImpl (balance, rekening, interest, customerId, id) values (6066440680, '3575169795676800', 4, 11, 11);
insert into AccountImpl (balance, rekening, interest, customerId, id) values (4055018951, '3529728175341934', 5, 12, 12);
insert into AccountImpl (balance, rekening, interest, customerId, id) values (1137174547, '5602218292310664585', 5, 13, 13);
insert into AccountImpl (balance, rekening, interest, customerId, id) values (5920033019, '3545988372054777', 6, 14, 14);
insert into AccountImpl (balance, rekening, interest, customerId, id) values (36644725, '5602240636004848239', 4, 15, 15);
insert into AccountImpl (balance, rekening, interest, customerId, id) values (8041688474, '6334158142764418486', 2, 16, 16);
insert into AccountImpl (balance, rekening, interest, customerId, id) values (2298372617, '201619022831063', 8, 17, 17);
insert into AccountImpl (balance, rekening, interest, customerId, id) values (7656329740, '6304968502145890617', 1, 18, 18);
insert into AccountImpl (balance, rekening, interest, customerId, id) values (3949749002, '5602235343989318', 10, 19, 19);
insert into AccountImpl (balance, rekening, interest, customerId, id) values (1872475329, '6767883349516837540', 9, 20, 20);
insert into AccountImpl (balance, rekening, interest, customerId, id) values (4140319882, '5602234568120873', 9, 21, 21);
insert into AccountImpl (balance, rekening, interest, customerId, id) values (9059633748, '201502180265821', 7, 22, 22);
insert into AccountImpl (balance, rekening, interest, customerId, id) values (1007968214, '30104547426324', 10, 23, 23);
insert into AccountImpl (balance, rekening, interest, customerId, id) values (9296648580, '3555250890756350', 4, 24, 24);
insert into AccountImpl (balance, rekening, interest, customerId, id) values (8526344562, '4844472145420140', 9, 25, 25);
insert into AccountImpl (balance, rekening, interest, customerId, id) values (8721969611, '345975744003358', 3, 26, 26);
insert into AccountImpl (balance, rekening, interest, customerId, id) values (8657310385, '6767251278333363', 2, 27, 27);
insert into AccountImpl (balance, rekening, interest, customerId, id) values (9486582730, '6334112604238888', 4, 28, 28);
insert into AccountImpl (balance, rekening, interest, customerId, id) values (6555115003, '374288849227532', 10, 29, 29);
insert into AccountImpl (balance, rekening, interest, customerId, id) values (4223649445, '3546931090567281', 1, 30, 30);
insert into AccountImpl (balance, rekening, interest, customerId, id) values (1778744848, '50189047415876522', 4, 31, 31);
insert into AccountImpl (balance, rekening, interest, customerId, id) values (3906275519, '3588189519037175', 1, 32, 32);
insert into AccountImpl (balance, rekening, interest, customerId, id) values (7872031986, '5038920219037607', 9, 33, 33);
insert into AccountImpl (balance, rekening, interest, customerId, id) values (3028737092, '3570880722759593', 3, 34, 34);
insert into AccountImpl (balance, rekening, interest, customerId, id) values (8329306936, '3567763617348760', 1, 35, 35);
insert into AccountImpl (balance, rekening, interest, customerId, id) values (985744893, '337941157410951', 1, 36, 36);
insert into AccountImpl (balance, rekening, interest, customerId, id) values (8294669727, '3551993024424874', 8, 37, 37);
insert into AccountImpl (balance, rekening, interest, customerId, id) values (6081558403, '3562336565770023', 6, 38, 38);
insert into AccountImpl (balance, rekening, interest, customerId, id) values (1126093140, '3575434017196932', 9, 39, 39);
-- insert into AccountImpl (balance, rekening, interest, customerId, id) values (6944707419, '3541261762065140', 10, 40, 40);
-- insert into AccountImpl (balance, rekening, interest, customerId, id) values (4524292904, '4017954418735677', 6, 41, 41);
-- insert into AccountImpl (balance, rekening, interest, customerId, id) values (7949525089, '3544200377188118', 8, 42, 42);
-- insert into AccountImpl (balance, rekening, interest, customerId, id) values (4979871478, '5602244993591218', 10, 43, 43);
-- insert into AccountImpl (balance, rekening, interest, customerId, id) values (4258960863, '50207399644488654', 6, 44, 44);
-- insert into AccountImpl (balance, rekening, interest, customerId, id) values (6215582301, '3535449242971965', 6, 45, 45);
-- insert into AccountImpl (balance, rekening, interest, customerId, id) values (635400717, '67638550186500966', 6, 46, 46);
-- insert into AccountImpl (balance, rekening, interest, customerId, id) values (310708779, '3530595064903414', 8, 47, 47);
-- insert into AccountImpl (balance, rekening, interest, customerId, id) values (6279802756, '4913707469755019', 7, 48, 48);
-- insert into AccountImpl (balance, rekening, interest, customerId, id) values (9962101693, '6334766020626447105', 3, 49, 49);
-- insert into AccountImpl (balance, rekening, interest, customerId, id) values (126634945, '6761447663622081088', 3, 50, 50);
-- insert into AccountImpl (balance, rekening, interest, customerId, id) values (1922162587, '36679430728468', 5, 51, 51);
-- insert into AccountImpl (balance, rekening, interest, customerId, id) values (1838623956, '30288633085498', 1, 52, 52);
-- insert into AccountImpl (balance, rekening, interest, customerId, id) values (2039716758, '3564187189524967', 3, 53, 53);
-- insert into AccountImpl (balance, rekening, interest, customerId, id) values (9634908509, '337941515931383', 4, 54, 54);
-- insert into AccountImpl (balance, rekening, interest, customerId, id) values (6786969726, '4936573643521542', 2, 55, 55);
-- insert into AccountImpl (balance, rekening, interest, customerId, id) values (8796542965, '374622353679946', 2, 56, 56);
-- insert into AccountImpl (balance, rekening, interest, customerId, id) values (1706437733, '6334341890670112209', 9, 57, 57);
-- insert into AccountImpl (balance, rekening, interest, customerId, id) values (8100787323, '3586573176737742', 6, 58, 58);
-- insert into AccountImpl (balance, rekening, interest, customerId, id) values (5571168912, '3580558746871044', 3, 59, 59);
-- insert into AccountImpl (balance, rekening, interest, customerId, id) values (4175192594, '3578786721906485', 3, 60, 60);
-- insert into AccountImpl (balance, rekening, interest, customerId, id) values (9789784963, '3545495554545838', 6, 61, 61);
-- insert into AccountImpl (balance, rekening, interest, customerId, id) values (6558670467, '4844065697115850', 4, 62, 62);
-- insert into AccountImpl (balance, rekening, interest, customerId, id) values (4007669586, '4903604926966572', 4, 63, 63);
-- insert into AccountImpl (balance, rekening, interest, customerId, id) values (4884821134, '5602214594981415', 5, 64, 64);
-- insert into AccountImpl (balance, rekening, interest, customerId, id) values (5400437696, '30288785021192', 6, 65, 65);
-- insert into AccountImpl (balance, rekening, interest, customerId, id) values (2334580066, '3545789891308508', 5, 66, 66);
-- insert into AccountImpl (balance, rekening, interest, customerId, id) values (3277569605, '201991942333763', 9, 67, 67);
-- insert into AccountImpl (balance, rekening, interest, customerId, id) values (8447432219, '3537973260605104', 5, 68, 68);
-- insert into AccountImpl (balance, rekening, interest, customerId, id) values (5687911017, '3566064387367044', 3, 69, 69);
-- insert into AccountImpl (balance, rekening, interest, customerId, id) values (6916318706, '67630715928124395', 8, 70, 70);
-- insert into AccountImpl (balance, rekening, interest, customerId, id) values (7078794209, '5641823746529919416', 2, 71, 71);
-- insert into AccountImpl (balance, rekening, interest, customerId, id) values (2638943632, '5251553043404683', 2, 72, 72);
-- insert into AccountImpl (balance, rekening, interest, customerId, id) values (7281560801, '3581003915627942', 6, 73, 73);
-- insert into AccountImpl (balance, rekening, interest, customerId, id) values (6734939253, '3541600355058105', 9, 74, 74);
-- insert into AccountImpl (balance, rekening, interest, customerId, id) values (5215488348, '374622263525593', 7, 75, 75);
-- insert into AccountImpl (balance, rekening, interest, customerId, id) values (6691541746, '4175004766880531', 7, 76, 76);
-- insert into AccountImpl (balance, rekening, interest, customerId, id) values (7751845010, '3563192749294524', 8, 77, 77);
-- insert into AccountImpl (balance, rekening, interest, customerId, id) values (7685908071, '0604012011049488', 5, 78, 78);
-- insert into AccountImpl (balance, rekening, interest, customerId, id) values (8019434979, '67624913069487113', 4, 79, 79);
-- insert into AccountImpl (balance, rekening, interest, customerId, id) values (155161266, '5602259472691487', 9, 80, 80);
-- insert into AccountImpl (balance, rekening, interest, customerId, id) values (6415385894, '374288621332880', 2, 81, 81);
-- insert into AccountImpl (balance, rekening, interest, customerId, id) values (5241576455, '5002355589254858', 2, 82, 82);
-- insert into AccountImpl (balance, rekening, interest, customerId, id) values (1731028513, '4913286998918422', 9, 83, 83);
-- insert into AccountImpl (balance, rekening, interest, customerId, id) values (35862867, '374622558532742', 5, 84, 84);
-- insert into AccountImpl (balance, rekening, interest, customerId, id) values (7676123385, '675911780543648772', 6, 85, 85);
-- insert into AccountImpl (balance, rekening, interest, customerId, id) values (454448260, '3551979296987631', 2, 86, 86);
-- insert into AccountImpl (balance, rekening, interest, customerId, id) values (1631510915, '676789641830314758', 5, 87, 87);
-- insert into AccountImpl (balance, rekening, interest, customerId, id) values (6623322695, '0604117494847982737', 5, 88, 88);
-- insert into AccountImpl (balance, rekening, interest, customerId, id) values (7195476998, '4106520731382', 3, 89, 89);
-- insert into AccountImpl (balance, rekening, interest, customerId, id) values (2882113401, '3571876337294728', 9, 90, 90);
-- insert into AccountImpl (balance, rekening, interest, customerId, id) values (8092388195, '3569758140752080', 3, 91, 91);
-- insert into AccountImpl (balance, rekening, interest, customerId, id) values (7962614533, '63048570933490140', 2, 92, 92);
-- insert into AccountImpl (balance, rekening, interest, customerId, id) values (293282864, '6374119619339263', 1, 93, 93);
-- insert into AccountImpl (balance, rekening, interest, customerId, id) values (157059400, '6395625979915406', 9, 94, 94);
-- insert into AccountImpl (balance, rekening, interest, customerId, id) values (4238885745, '6762804339141440718', 2, 95, 95);
-- insert into AccountImpl (balance, rekening, interest, customerId, id) values (7397418507, '3550198800299109', 2, 96, 96);
-- insert into AccountImpl (balance, rekening, interest, customerId, id) values (6228930301, '3580626998714384', 9, 97, 97);
-- insert into AccountImpl (balance, rekening, interest, customerId, id) values (6070588767, '3574056159164252', 5, 98, 98);
-- insert into AccountImpl (balance, rekening, interest, customerId, id) values (3000635948, '5010125068448275', 6, 99, 99);
-- insert into AccountImpl (balance, rekening, interest, customerId, id) values (156438678, '3570568067898320', 4, 100, 100);