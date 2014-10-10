/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.des.random;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.math.BigInteger;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Surachai
 */
public class Randomizer {

    private static int secondOfDay = 86400000;
    private static String[] Province = {"Kamphaeng Phet","Chiang Rai","Chiang Mai","Tak","Nakhon Sawan","Nan","Phichit","Phitsanulok","Phetchabun","Phrae","Mae Hong Son","Lampang","Lamphun","Sukhothai","Uttaradit","Uthai Thani","Phayao","Bangkok","Kanchanaburi","Chanthaburi","Chachoengsao","Chon Buri","Chai Nat","Trat","Nakhon Nayok","Nakhon Pathom","Nonthaburi","Pathum Thani","Prachuap Khiri Khan","Prachin Buri","Phra Nakhon Si Ayutthaya","Phetchaburi","Rayong","Ratchaburi","Lop Buri","Samut Prakan","Samut Songkhram","Samut Sakhon","Saraburi","Sing Buri","Suphan Buri","Ang Thong","Sa Kaeo","Kalasin","Khon Kaen","Chaiyaphum","Yasothon","Nakhon Phanom","Nakhon Ratchasima","Buri Ram","Maha Sarakham","Roi Et","Loei","Si Sa Ket","Sakon Nakhon","Surin","Nong Khai","Udon Thani","Ubon Ratchathani","Mukdahan","Amnat Charoen","Nong Bua Lam Phu","Krabi","Chumphon","Trang","Nakhon Si Thammarat","Narathiwat","Pattani","Phangnga","Phatthalung","Phuket","Yala","Ranong","Songkhla","Satun","SuratThani"};
    private static String[] Distinct ={
"Phra Nakhon","Bang Kapi","Bang Khae","Bang Khen","Bang Kho Laem","Bang Khun Thian","Bang Na","Bang Phlat","Bang Rak","Bang Sue","Bangkok Noi","Bangkok Yai","Bueng Kum","Chatuchak","Chom Thong","Din Daeng","Don Mueang","Dusit","Huai Khwang","Khan Na Yao","Khlong Sam Wa","Khlong San","Khlong Toei","Lak Si","Lat Krabang","Lat Phrao","Min Buri","Nong Chok","Nong Khaem","Pathum Wan","Phasi Charoen","Phaya Thai","Phra Khanong","Pom Prap Sattru Phai","Prawet","Rat Burana","Ratchathewi","Sai Mai","Samphanthawong","Saphan Sung","Sathon","Suan Luang","Taling Chan","Thawi Watthana","Thon Buri","Thung Khru","Wang Thonglang","Vadhana","Yan Nawa","Mueang Amnat Charoen","Chanuman","Hua Taphan","Lue Amnat","Pathum Ratchawongsa","Phana","Senangkhanikhom","Mueang Ang Thong","Chaiyo","Pa Mok","Pho Thong","Samko","Sawaeng Ha","Wiset Chai Chan","Mueang Bueng Kan","Seka","So Phisai","Bueng Khong Long","Bung Khla","Pak Khat","Phon Charoen","Si Wilai","Mueang Buri Ram","Ban Dan","Ban Kruat","Ban Mai Chaiyaphot","Chaloem Phra Kiat","Chamni","Huai Rat","Khaen Dong","Khu Mueang","Krasang","Lahan Sai","Lam Plai Mat","Nang Rong","Na Pho","Non Din Daeng","Non Suwan","Nong Hong","Nong Ki","Pakham","Phlapphla Chai","Phutthaisong","Prakhon Chai","Satuek","Mueang Chachoengsao","Ban Pho","Bang Khla","Bang Nam Priao","Bang Pakong","Khlong Khuean",
"Phanom Sarakham","Plaeng Yao","Ratchasan","","Tha Takiap","Mueang Chai Nat","Hankha","Manorom","Noen Kham","Nong Mamong","Sankhaburi","Sapphaya","Wat Sing","Mueang Chaiyaphum","Bamnet Narong","Ban Khwao","Ban Thaen","Chatturat","Kaeng Khro","Kaset Sombun","Khon San","Khon Sawan","Noen Sa-nga","Nong Bua Daeng","Nong Bua Rawe","Phakdi Chumphon","Phu Khiao","Sap Yai","Thep Sathit","Mueang Chanthaburi","Kaeng Hang Maeo","Khao Khitchakut","Khlung","Laem Sing","Makham","Na Yai Am","Pong Nam Ron","Soi Dao","Tha Mai","Mueang Chiang Mai","Chai Prakan","Chiang Dao","Chom Thong","Doi Lo","Doi Saket","Doi Tao","Fang","Hang Dong","Hot","Mae Ai","Mae Chaem","Mae On","Mae Rim","Mae Taeng","Mae Wang","Omkoi","Phrao","Samoeng","San Kamphaeng","San Pa Tong","San Sai","Saraphi","Wiang Haeng","Mueang Chiang Rai","Chiang Khong","Chiang Saen","Khun Tan","Mae Chan","Doi Luang","Mae Fa Luang","Mae Lao","Mae Sai","Mae Suai","Pa Daet","Phan","Phaya Mengrai","Thoeng","Wiang Chai","Wiang Chiang Rung","Wiang Kaen","Wiang Pa Pao","Mueang Chon Buri","Ban Bueng","Bang Lamung","Bo Thong","Ko Chan","Ko Si Chang","Nong Yai","Phan Thong","Phanat Nikhom","Sattahip","Si Racha","Mueang Chumphon","Lamae","Lang Suan","Pathio","Phato","Sawi","Tha Sae","Thung Tako",
"Mueang Kalasin","Don Chan","Huai Mek","Huai Phueng","Kamalasai","Kham Muang","Khao Wong","Khong Chai","Kuchinarai","Na Khu","Na Mon","Nong Kung Si","Rong Kham","Sahatsakhan","Sam Chai","Somdet","Tha Khantho","Yang Talat","Mueang Kamphaeng Phet","Bueng Samakkhi","Khanu Woralaksaburi","Khlong Khlung","Khlong Lan","Kosamphi Nakhon","Lan Krabue","Pang Sila Thong","Phran Kratai","Sai Ngam","Sai Thong Watthana","Mueang Kanchanaburi","Bo Phloi","Dan Makham Tia","Huai Krachao","Lao Khwan","Nong Prue","Phanom Thuan","Sai Yok","Sangkhla Buri","Si Sawat","Tha Maka","Tha Muang","Thong Pha Phum","Mueang Khon Kaen","Ban Fang","Ban Phai","Ban Haet","Chonnabot","Chum Phae","Khao Suan Kwang","Khok Pho Chai","Kranuan","Mancha Khiri","Nam Phong","Nong Na Kham","Nong Ruea","Nong Song Hong","Non Sila","Phon","Phra Yuen","Phu Pha Man","Phu Wiang","Pueai Noi","Sam Sung","Si Chomphu","Ubolratana","Waeng Noi","Waeng Yai","Wiang Kao","Mueang Krabi","Ao Luek","Khao Phanom","Khlong Thom","Ko Lanta","Lam Thap","Nuea Khlong","Plai Phraya","Mueang Lampang","Chae Hom","Hang Chat","Ko Kha","Mae Mo","Mae Phrik","Mae Tha","Mueang Pan","Ngao","Soem Ngam","Sop Prap","Thoen","Wang Nuea","Mueang Lamphun","Ban Hong","Ban Thi","Li","Mae Tha","Pa Sang","Thung Hua Chang","Wiang Nong Long","Mueang Loei","Chiang Khan","Dan Sai",
"Erawan","Na Duang","Na Haeo","Nong Hin","Pak Chom","Pha Khao","Phu Kradueng","Phu Luang","Phu Ruea","Tha Li","Wang Saphung","Mueang Lop Buri","Ban Mi","Chai Badan","Khok Charoen","Khok Samrong","Lam Sonthi","Nong Muang","Phatthana Nikhom","Sa Bot","Tha Luang","Tha Wung","Mueang Mae Hong Son","Khun Yuam","Mae La Noi","Mae Sariang","Pai","Pang Mapha","Sop Moei","Mueang Maha Sarakham","Borabue","Chiang Yuen","Chuen Chom","Kae Dam","Kantharawichai","Kosum Phisai","Kut Rang","Na Chueak","Na Dun","Phayakkhaphum Phisai","Wapi Pathum","Yang Sisurat","Mueang Mukdahan","Don Tan","Dong Luang","Khamcha-i","Nikhom Kham Soi","Nong Sung","Wan Yai","Mueang Nakhon Nayok","Ban Na","Ongkharak","Pak Phli","Mueang Nakhon Pathom","Bang Len","Don Tum","Kamphaeng Saen","Nakhon Chai Si","Phutthamonthon","Sam Phran","Mueang Nakhon Phanom","Ban Phaeng","Na Kae","Na Thom","Na Wa","Phon Sawan","Pla Pak","Renu Nakhon","Si Songkhram","Tha Uthen","That Phanom","Wang Yang","Mueang Nakhon Ratchasima","Ban Lueam","Bua Lai","Bua Yai","Chakkarat","Chaloem Phra Kiat","Chok Chai","Chum Phuang","Dan Khun Thot","Huai Thalaeng","Kaeng Sanam Nang","Kham Sakaesaeng","Kham Thale So","Khon Buri","Khong","Lam Thamenchai","Mueang Yang","Non Daeng","Non Sung","Non Thai","Nong Bun Mak","Pak Chong","Pak Thong Chai","Phimai","Prathai","Phra Thong Kham","Sida","Sikhio",
"Soeng Sang","Sung Noen","Thepharak","Wang Nam Khiao","Mueang Nakhon Sawan","Banphot Phisai","Chum Saeng","Chum Ta Bong","Kao Liao","Krok Phra","Lat Yao","Mae Poen","Mae Wong","Nong Bua","Phaisali","Phayuha Khiri","Tak Fa","Takhli","Tha Tako","Mueang Nakhon Si Thammarat","Bang Khan","Chaloem Phra Kiat","Cha-uat","Chang Klang","Chawang","Chian Yai","Chulabhorn","Hua Sai","Khanom","Lan Saka","Na Bon","Nopphitam","Pak Phanang","Phipun","Phra Phrom","Phrom Khiri","Ron Phibun","Sichon","Tha Sala","Tham Phannara","Thung Song","Thung Yai","Mueang Nan","Ban Luang","Bo Kluea","Chaloem Phra Kiat","Chiang Klang","Mae Charim","Na Muen","Na Noi","Phu Phiang","Pua","Santi Suk","Song Khwae","Tha Wang Pha","Thung Chang","Wiang Sa","Mueang Narathiwat","Bacho","Chanae","Cho-airong","Ra-ngae","Rueso","Si Sakhon","Sukhirin","Su-ngai Kolok","Su-ngai Padi","Tak Bai","Waeng","Yi-ngo","Mueang Nong Khai","Tha Bo","Fao Rai","Pho Tak","Phon Phisai","Rattanawapi","Si Chiang Mai","Sakhrai","Sangkhom","Mueang Nong Bua Lam Phu","Na Klang","Na Wang","Non Sang","Si Bun Rueang","Suwannakhuha","Mueang Nonthaburi","Bang Bua Thong","Bang Kruai","Bang Yai","Pak Kret","Sai Noi","Mueang Pathum Thani","Khlong Luang","Lam Luk Ka","Lat Lum Kaeo","Nong Suea","Sam Khok","Thanyaburi","Mueang Pattani","Kapho",
"Khok Pho","Mae Lan","Mai Kaen","Mayo","Nong Chik","Panare","Sai Buri","Thung Yang Daeng","Yarang","Yaring","Mueang Phangnga","Kapong","Khura Buri","Ko Yao","Takua Pa","Takua Thung","Thai Mueang","Thap Put","Mueang Phatthalung","Bang Kaeo","Khao Chaison","Khuan Khanun","Kong Ra","Pa Bon","Pa Phayom","Pak Phayun","Si Banphot","Srinagarindra","Tamot","Mueang Phayao","Chiang Kham","Chiang Muan","Chun","Dok Khamtai","Mae Chai","Pong","Phu Kamyao","Phu Sang","Mueang Phetchabun","Bueng Sam Phan","Chon Daen","Khao Kho","Lom Kao","Lom Sak","Nam Nao","Nong Phai","Si Thep","Wang Pong","Wichian Buri","Mueang Phetchaburi","Ban Laem","Ban Lat","Cha-am","Kaeng Krachan","Khao Yoi","Nong Ya Plong","Tha Yang","Mueang Phichit","Bueng Na Rang","Bang Mun Nak","Dong Charoen","Pho Prathap Chang","Pho Thale","Sak Lek","Sam Ngam","Tap Khlo","Taphan Hin","Wachirabarami","Wang Sai Phun","Mueang Phitsanulok","Bang Krathum","Bang Rakam","Chat Trakan","Nakhon Thai","Noen Maprang","Phrom Phiram","Wang Thong","Wat Bot","Mueang Phrae","Den Chai","Long","Nong Muang Khai","Rong Kwang","Song","Sung Men","Wang Chin","Phra Nakhon Si Ayutthaya","Ban Phraek","Bang Ban","Bang Pahan","Bang Pa-in","Bang Sai","Bang Sai","Lat Bua Luang","Maha Rat","Nakhon Luang","Phachi","Phak Hai","Sena","Tha Ruea",
"Uthai","Wang Noi","Mueang Phuket","Kathu","Thalang","Mueang Prachin Buri","Ban Sang","Kabin Buri","Na Di","Prachantakham","Si Maha Phot","Si Mahosot","Mueang Prachuap Khiri Khan","Bang Saphan","Bang Saphan Noi","Hua Hin","Kui Buri","Pran Buri","Sam Roi Yot","Thap Sakae","Mueang Ranong","Kapoe","Kra Buri","La-un","Suk Samran","Mueang Ratchaburi","Ban Kha","Ban Pong","Bang Phae","Chom Bueng","Damnoen Saduak","Pak Tho","Photharam","Suan Phueng","Wat Phleng","Mueang Rayong","Ban Chang","Ban Khai","Khao Chamao","Klaeng","Nikhom Phatthana","Pluak Daeng","Wang Chan","Mueang Roi Et","At Samat","Changhan","Chaturaphak Phiman","Chiang Khwan","Kaset Wisai","Moei Wadi","Mueang Suang","Nong Hi","Nong Phok","Pathum Rat","Phanom Phrai","Pho Chai","Phon Sai","Phon Thong","Selaphum","Si Somdet","Suwannaphum","Thawat Buri","Thung Khao Luang","Mueang Sa Kaeo","Aranyaprathet","Khao Chakan","Khlong Hat","Khok Sung","Ta Phraya","Wang Nam Yen","Wang Sombun","Watthana Nakhon","Mueang Sakon Nakhon","Akat Amnuai","Ban Muang","Charoen Sin","Kham Ta Kla","Khok Si Suphan","Kusuman","Kut Bak","Nikhom Nam Un","Phang Khon","Phanna Nikhom","Phon Na Kaeo","Phu Phan","Sawang Daen Din","Song Dao","Tao Ngoi","Wanon Niwat","Waritchaphum","Mueang Samut Prakan","Bang Bo","Bang Phli","Bang Sao Thong","Phra Pradaeng","Phra Samut Chedi","Mueang Samut Sakhon","Ban Phaeo","Krathum Baen","Mueang Samut Songkhram",
"Amphawa","Bang Khonthi","Mueang Saraburi","Ban Mo","Chaloem Phra Kiat","Don Phut","Kaeng Khoi","Muak Lek","Nong Don","Nong Khae","Nong Saeng","Phra Phutthabat","Sao Hai","Wang Muang","Wihan Daeng","Mueang Satun","Khuan Don","Khuan Kalong","La-ngu","Manang","Tha Phae","Thung Wa","Mueang Sing Buri","Bang Rachan","In Buri","Khai Bang Rachan","Phrom Buri","Tha Chang","Mueang Si Sa Ket","Benchalak","Bueng Bun","Huai Thap Than","Kantharalak","Kanthararom","Khukhan","Khun Han","Mueang Chan","Nam Kliang","Non Khun","Phayu","Pho Si Suwan","Phrai Bueng","Phu Sing","Prang Ku","Rasi Salai","Sila Lat","Si Rattana","Uthumphon Phisai","Wang Hin","Yang Chum Noi","Mueang Songkhla","Bang Klam","Chana","Hat Yai","Khlong Hoi Khong","Khuan Niang","Krasae Sin","Na Mom","Na Thawi","Ranot","Rattaphum","Saba Yoi","Sadao","Sathing Phra","Singhanakhon","Thepha","Mueang Sukhothai","Ban Dan Lan Hoi","Khiri Mat","Kong Krailat","Sawankhalok","Si Nakhon","Si Samrong","Si Satchanalai","Thung Saliam","Mueang Suphan Buri","Bang Pla Ma","Dan Chang","Doem Bang Nang Buat","Don Chedi","Nong Ya Sai","Sam Chuk","Si Prachan","Song Phi Nong","U Thong","Mueang Surat Thani","Ban Na Doem","Ban Na San","Ban Ta Khun","Chai Buri","Chaiya","Don Sak","Kanchanadit","Khian Sa","Khiri Rat Nikhom","Ko Pha-ngan","Ko Samui","Phanom","Phrasaeng","Phunphin",
"Tha Chana","Tha Chang","Vibhavadi","Wiang Sa","Mueang Surin","Buachet","Chom Phra","Chumphon Buri","Kap Choeng","Khwao Sinarin","Lamduan","Non Narai","Phanom Dong Rak","Prasat","Rattanaburi","Samrong Thap","Sangkha","Sanom","Sikhoraphum","Si Narong","Tha Tum","Mueang Tak","Ban Tak","Mae Ramat","Mae Sot","Phop Phra","Sam Ngao","Tha Song Yang","Umphang","Wang Chao","Mueang Trang","Hat Samran","Huai Yot","Kantang","Na Yong","Palian","Ratsada","Sikao","Wang Wiset","Yan Ta Khao","Mueang Trat","Bo Rai","Khao Saming","Khlong Yai","Ko Chang","Ko Kut","Laem Ngop","Mueang Ubon Ratchathani","Buntharik","Det Udom","Don Mot Daeng","Khemarat","Lao Suea Kok","Khong Chiam","Khueang Nai","Kut Khaopun","Muang Sam Sip","Na Chaluai","Nam Khun","Nam Yuen","Na Tan","Na Yia","Phibun Mangsahan","Pho Sai","Samrong","Sawang Wirawong","Si Mueang Mai","Sirindhorn","Tan Sum","Thung Si Udom","Trakan Phuet Phon","Warin Chamrap","Mueang Udon Thani","Ban Dung","Ban Phue","Chai Wan","Ku Kaeo","Kumphawapi","Kut Chap","Na Yung","Nam Som","Non Sa-at","Nong Han","Nong Saeng","Nong Wua So","Phen","Phibun Rak","Prachaksinlapakhom","Sang Khom","Si That","Thung Fon","Wang Sam Mo","Mueang Uthai Thani","Ban Rai","Huai Khot","Lan Sak","Nong Chang","Nong Khayang","Sawang Arom","Thap Than",
"Mueang Uttaradit","Ban Khok","Fak Tha","Laplae","Nam Pat","Phichai","Tha Pla","Thong Saen Khan","Tron","Mueang Yala","Bannang Sata","Betong","Kabang","Krong Pinang","Raman","Than To","Yaha","Mueang Yasothon","Kham Khuean Kaeo","Kho Wang","Kut Chum","Loeng Nok Tha","Maha Chana Chai","Pa Tio","Sai Mun","Thai Charoen"};
    private static String[] Road = {
"﻿Krung Kasem","Krung Thep Kritha","Krung Thep  Nonthaburi","Krung Thon Buri","Krung Maen","Kluai Nam Thai Tat Mai","Klantan","Kaom Kraom","Kanlapaphruek","Kanlayanamaitri","Kanchanaphisek","Kamnan Maen","Kamphaeng Phet","King Kaeo","Kit Phanit","Kasem Rat","Kaeo","Kaeo Ngoen Thong","Kosum Ruam Chai","Kraisi","Khwan","Khao","Khao San","Khao Lam","Khum Thong  Lam Toiting","Khiao Khai Ka","Khru Nai","Khlong Kao","Khlong Thom Wat Phiren","Khlong Thom Wat Saket","Khlong Thom Wat Sommanat","Khlong Lamchiak","Khlong Lam Pak","Khlong Sip  Khlong Sip Si","Convent","Khum Klao","Khu Bon","Khu  Khlong Sip","Kheha Rom Klao","Ngam Wong Wan","Chatu Chot","Charan Sanit Wong","Charat Mueang","Charat Wiang","Chom Thong","Chom Thong Burana","Chakrabongse","Chakkraphatdiphong","Chak Phet","Chakkrawat","Chan","Chan Kao","Chantharubeksa","Charu Mueang","Chueng Charoen Phanit","Charoen Krung","Charoen Nakhon","Charoen Phatthana","Charoen Mueang","Charoen Rat","Charoen Wiang","Chao Khamrop","Chao Khun Thahan","Chao Phraya Sayam","Chao Fa","Chaeng Watthana","Chalong Krung","Chimphli","Chaloem Khet","Chaloem Phong","Chaloem Phra Kiat Ratchakan Thi","Chalaem Nimit","Chak Phra","Chaiyaphruek","Chang Akat Uthit","Chit Lom","Chettuphon","Choet Wutthakat","Chiang Mai","Chuea Phloeng","Chueam Khlong Mon","Chueam Samphan","Chok Chai","Na Ranong","Duang Phithak","Dao Khang","Damrong Rak","Din Daeng","Din Daeng","Dinso","Ditsamak","Decha Tungkha","Decho","Tri Phet","Tri Mit","Tanao","Tani","Ti Thong","Techawanit","Song Wat",
"Song Sawat","Song Soem","Sap","Sap Sin","Thawi Watthana","Thawi Watthana  Kanchanaphisek","Thahan","Thahan Akat Uthit","Thap Yao","Tha Kasem","Tha Kham","Thang Rotfai Sai Kao Pak Nam","Tha Din Daeng","Thai Wang","Thung Mangkon","Thetsaban Narueman","Thetsaban Nimit Tai","Thetsaban Nimit Nuea","Thetsaban Rangrak Tai","Thetsaban Rangrak Nuea","Thetsaban Rangsan Tai","Thetsaban Rangsan Nuea","Thetsaban Rangsarit Tai","Thetsaban Rangsarit Nuea","Thetsaban Songkhro","Thoet Damri","Thoet Thai","Thoet Rachan","Thiam Ruam Mit","Thai Raman","Thaniya","Nakhon Chai Si","Nakhon Pathom","Nakhon Ratchasima","Nakhon Lung","Nakhon Sawan","Nonsi","Naradhiwas Rajanagarindra","Naret","Nawamin","Nuan Chan","Nakkila Laem Thong","Nak Niwat","Nakkharat","Nang Linchi","Nawong Pracha Phatthana","Nikhom Makkasan","Nimit Mai","Nin Hem Niyom","Ni Chong Sawat","Borommaratchachonnani","Banthat Thong","Paribatra","Bowon Niwet","Bang Kradi","Bang Khun Thian","Bang Khun Thian  Chai Thale","Bang Khun Non","Bang Khae","Bang Chueak Nang","Bang Na  Trat","Bang Bon","Bang Bon Sai Doem","Bang Phai","Bang Phrom","Bang Ramat","Bang Waek","Ban Mo","Bamrung Mueang","Bueng Khwang","Bun Siri","Buri Phirom","Buranasat","Burapha","Baen Chado","Brest Rue de","Pracha Chuen","Prachathon","Prajadhipok","Prachathipatai","Pracha Phatthana","Pracha Ruam Chai","Pracha Rat Sai","Pracha Rat Bamphen","Pracha Songkhro","Pracha Samran","Pracha Suk","Pracha Uthit","Pradiphat","Pradit Manutham","Pramuan","PrasertManukitch  Prasoet Manukit","Parinayok","Pan","Pak Nam Krachom Thong","Pak Nam Fang Nuea","Plaeng Nam","Phadung Dao","Phadung Phan","Phaya Thai",
"Phaya Mai","Phrom Rat","Phra Chan","Phra Phithak","Phra Phiphit","Phraya Suren","Rama IX","Rama I","Rama II","Rama III","Rama IV","Rama V","Rama VI","Phra Sumen","Phra Athit","Phran Nok","Phlapphla Chai","Phuang Siri","Phahon Yothin","Phaniang","Phat Phong","Phatthana","Phatthanakan","Phatthana Chonnabot","Phanitchayakan Thon Buri","Phat Sai","Phahurat","Phichai","Phibun Songkhram","Phitsanulok","Phiraphong","Phuttha Bucha","Phutthamonthon Sai","Phet Kasem","Phetchaburi","Phet Phra Ram","Phet Uthai","Phloen Chit","Pho Phanit","Phoem Sin","Phraeng Nara","Phraeng Phuthon","Phraeng Sanphasat","Pho Kaeo","Fueang Nakhon","Phanu Rangsi","Phuchong","Phokhi","Mahannop","Maha Chak","Maha Chai","Maha Nakhon","Maha Phruettharam","Maha Rat","Maha Set","Mahesak","Mahaisawan","Motorway","Mangkon","Ma Charoen","Mittraphan","Mittraphap Thai  China","Mit Maitri","Min Phatthana","Maen Thai","Maitri Chit","Yommarat Sukhum","Yang Phatthana","Yan Nawa","Yi Sip Song Karakadakhom","Yukol","Yukhon","Yukol","Yukhon","Yen Chit","Yen Akat","Yaowaphanit","Yaowarat","Yaek Suan Sayam","Yotha","Yotha","Yothin Phatthana","Yothi","Rom Klao","Ruam Chit","Ruam Phatthana","Rong Mueang","Ranong","Ranong","Ratchadaphisek","Ratchadaphisek","Ratchadaphisek","Ratchadaphisek","Ratchada  Ram Inthra","Ratchamongkhon Prasat","Rang Nam","Ratchadamnoen Klang","Ratchadamnoen Nok","Ratchadamnoen Nai","Ratchadamri",
"Ratchabophit","Ratchaprarop","Ratchaphruek","Ratchamontri","Ratchawong","Ratchawithi","Rachini","Ramkhamhaeng","Ramkhamhaeng","Ram Buttri","Rarm Intra","Ram Inthra","Rat Nimit","Rat Burana","Rat Phatthana","Rat Phatthana","Rat Ruam Chai","Rat Rat Phatthana","Rat Uthit","Rim Khlong Prapa Fang Khwa","Rim Khlong Prapa Fang Sai","Rung Pracha","Long Tha","Lasalle","Lasalle  Bearing","Lat Krabang","Lat Pla Khao","Lat Phrao","Lat Phrao Wang Hin","Lat Ya","Lam Sai","Lamphun Chai","Lam Makhuea Khuen","Likhit","Luk Luang","Liap Khlong Noen Sai","Liap Khlong Bang Phrom","Liap Khlong Pathum","Liap Khlong Phadung Krung Kasem","Liap Khlong Bidyalongkorn","Liap Khlong Phasi Charoen Fang Tai","Liap Khlong Phasi Charoen Fang Nuea","Liap Khlong Mon","Liap Khlong Lam Ko Phai","Liap Khlong Song","Liap Khlong Sip Sam Fang Tawantok","Liap Khlong Sip Sam Fang Tawanok","Liap Thale Sap","Liap Wari","Wong Sawang","Worachak","Wang Chao Sai","Wang Doem","Wang Lang","Vacharaphol","Watthanatham","Wat Welu Wanaram","Wat Suk Chai","Wat Mai Charoen Rat","Witthayu","Wibun Sathu Kit","Vibhavadi Rangsit","Wiwat Wiang","Wisut Kasat","Wutthakat","Si Thammathirat","Srinagarindra","Si Burapha","Si Wara","Si Wiang","Si Ayutthaya","Sala Daeng","Sala Thammasop","Siri Kasem","Siri Phong","Supphamit","Set Siri","Sakun Di","Satri Witthaya","Sanam Chai","Somdet Chao Phraya","Somdet Phra Chao Tak Sin","Somdet Phra Pinklao","Song Prapha","Saranakhom","Sanphawut","Saran Rom","Suan Phak","Suan Phlu","Suan Sayam","Suan Oi Soi Klang","Sawankhalok","Sawatdikan","Sawatdikan","Sawatdikan","Sawang","Sakae Ngam","Saphan Phut","Sangkhom Songkhro","Sangkhalok",
"Sangkha Pracha","Sangkha Santisuk","Santiphap","Sathon Tai","Sathon Nuea","Sathu Pradit","Sam Wa","Sam Sen","Sai Mai","Sarasin","Saribut","Saribut  Thap Yao","Saliratthawiphak","Sip Sam Hang","Sirindhorn","Si Phraya","Si Lom","Sihaburanukit","Suk Sawat","Sukhaphiban","Sukhaphiban","Sukhaphiban Bang Ramat","Sukhumvit","Sukhumvit","Sukhothai","Sukhonthasawat","Sukhantharam","Sut Prasoet","Sutthawat","Sutthisan Winitchai","Sunthon Kosa","Suphan","Surawong","Surasak","Suwinthawong","Surao Khlong Nueng","Sena Nikhom","Seri Thai","Sueapa","Saen Kasem","Samae Dam","Hathai Mit","Hathai Rat","Nong Khaem  Wat Si Nuan","Nong Rahaeng","Na Phra That","Na Phra Lan","Na Happhoei","Mom Chao Sanga Ngam Supradit","Mu Ban Setthakit","Luang","Luang Phrotphitthayaphayat","Luang Phaeng","Lak Mueang","Lang Suan","Lan Luang","Ho Wang","Hua Mak","Anantanak","Anamai Ngam Charoen","Anu Wong","Yu Yen","Yu Witthaya","Arun Ammarin","Asok  Din Daeng","Asok Montri","On Nut","Henri Dunant","Atsawa Phichet","Atsadang","Assumption","At Narong","Amnuai Songkhram","Intharaphithak","Inthrawat","Itsaraphap","Unakan","Udom Suk","Utthayan","U Thong Nok","U Thong Nai","Ekkachai","Phansa Maha Rachini"};

    
    
    public String RandomCharacters(int length){
        String result="";
        int StartAc= 97;
        int EndAc= 122;
        for(int i=0;i<length;i++){
            int temp =RandomIntFromRange(StartAc,EndAc);
            result += String.valueOf((char)temp);
        }
        return result;
    }
    public String RandomAddress(){
        return RandomAddressNo()+" "+RandomDistinct()+" "+RandomRoad()+"Road "+RandomProvince()+" "+(10000+RandomIntFromRange(100,500));
    }
    public String RandomAddressNo(){
        Random rnd = new Random();
        return rnd.nextInt(300)+"/"+rnd.nextInt(100);
    }
    public String RandomRoad() {
        return RandomFromFile(Road);    
    }
    public String RandomDistinct() {
        return RandomFromFile(Distinct);     
    }
    public String RandomProvince() {
        return RandomFromFile(Province);
    }
    public String RandomFromFile(String[] dataList) {
        Random rnd = new Random();
        return dataList[rnd.nextInt(dataList.length)];
    }
    public String RandomNameFromLength(int length) {
        BufferedReader br = null;
        String sCurrentLine = "";
        List<String> dataList = new LinkedList<String>();
        Random rnd = new Random();
        try {
            br = new BufferedReader(new FileReader("src\\resource\\name.txt"));
            while ((sCurrentLine = br.readLine()) != null) {
                if (sCurrentLine.length() == length) {
                    dataList.add(sCurrentLine);
                }
            }
            int randomIndex = rnd.nextInt(dataList.size());
            if (dataList.size() == 0) {
                return "";
            }
            return dataList.get(randomIndex);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return "";
    }
    public String RandomName() {
        BufferedReader br = null;
        String sCurrentLine = "";
        List<String> dataList = new LinkedList<String>();
        Random rnd = new Random();
        try {
            br = new BufferedReader(new FileReader("src\\resource\\name.txt"));
            while ((sCurrentLine = br.readLine()) != null) {
                dataList.add(sCurrentLine);
            }
            int randomIndex = rnd.nextInt(dataList.size());
            if (dataList.size() == 0) {
                return "";
            }
            return dataList.get(randomIndex);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return "";
    }
    public Date RandomDateFromRange(String Startdate, int year, int month, int day) {
        Date output = new Date();
        Random rnd = new Random();
        int sumDay = (year * 365) + (month * 30) + day;
        output.setYear(Integer.parseInt(Startdate.split("-")[2]));
        output.setMonth(Integer.parseInt(Startdate.split("-")[1]));
        output.setDate(Integer.parseInt(Startdate.split("-")[0]) + ((sumDay == 0) ? 0 : rnd.nextInt(sumDay)));
        return output;
    }
    public Date RandomDateFromDateRange(String Startdate, String EndDate) {
        Date Sdata = new Date();
        Date Edata = new Date();
        Date output = new Date();
        Sdata.setDate(Integer.parseInt(Startdate.split("-")[2]));
        Sdata.setMonth(Integer.parseInt(Startdate.split("-")[1]));
        Sdata.setYear(Integer.parseInt(Startdate.split("-")[0]));
        Edata.setDate(Integer.parseInt(EndDate.split("-")[2]));
        Edata.setMonth(Integer.parseInt(EndDate.split("-")[1]));
        Edata.setYear(Integer.parseInt(EndDate.split("-")[0]));
        long interval = Edata.getTime() - Sdata.getTime();
        BigInteger day = new BigInteger(String.valueOf((interval) / secondOfDay));
        int temp = RandomIntFromRange(0, Integer.parseInt(day.add(new BigInteger("1")).toString()));
        output.setTime(Sdata.getTime());
        output.setDate(output.getDate() + temp);
        return output;
    }
    public double RandomDoubleFromRange(int start, int end, double precision) {
        Random rnd = new Random();
        double temp = rnd.nextDouble() + rnd.nextInt(end-start) + start;
        temp = Math.round(temp * Math.pow(10, precision));
        temp = temp / Math.pow(10, precision);
        return temp;
    }
    public List<Double> RandomListDoubleFromRange(int start, int end, double precision, int size) {
        List<Double> output = new LinkedList<>();
        for (int i = 0; i < size; i++) {
            output.add(RandomDoubleFromRange(start, end, precision));
        }
        return output;
    }
    public int RandomIntFromRange(int start, int end) {
        Random rnd = new Random();  
        int temp = rnd.nextInt(end-start) + start;
        return temp;
    }
    public List<Integer> RandomListIntFromRange(int start, int end, int size) {
        List<Integer> output = new LinkedList<Integer>();
        for (int i = 0; i < size; i++) {
            output.add(RandomIntFromRange(start, end));
        }
        return output;
    }

}
