package com.example.androiddevchallenge.model

import com.example.androiddevchallenge.R

data class Puppy(
    val puppyId: Int,
    val puppyName: String,
    val puppyKind: String,
    val puppyImage: Int,
    val puppyDescription: String
)

val puppyList = listOf(
    Puppy(
        0,
        "Brown",
        "Germen Shepherd",
        R.drawable.germanshepherd,
        "The German Shepherd is a breed of medium to large-sized working dog that originated in Germany"
    ),
    Puppy(
        1,
        "Roda",
        "Labrador Retriever",
        R.drawable.labradorretriever,
        "The Labrador Retriever, often abbreviated to Labrador, is a breed of retriever-gun dog from the United Kingdom that was developed from imported Canadian fishing dogs"
    ),
    Puppy(
        2,
        "LubTip",
        "American Pitbull Terrier",
        R.drawable.americanpitbullterrier,
        "The American Pit Bull Terrier is a dog breed recognized by the United Kennel Club and the American Dog Breeders Association but not the American Kennel Club"
    ),
    Puppy(
        3,
        "Elga",
        "Beagle",
        R.drawable.beagle,
        "The beagle is a breed of small hound that is similar in appearance to the much larger foxhound"
    ),
    Puppy(
        4,
        "Lub",
        "Bulldog",
        R.drawable.bulldog,
        "The Bulldog also known as the English Bulldog or British Bulldog, is a medium-sized dog breed"
    ),
    Puppy(
        5,
        "Enac",
        "Cane Corso",
        R.drawable.canecorso,
        "The Cane Corso is an Italian breed of mastiff. It is used for personal protection, tracking, law enforcement, as a guard dog, and as a companion dog"
    ),
    Puppy(
        6,
        "Hach",
        "Chihuahua",
        R.drawable.chihuahua,
        "The Chihuahua is one of the smallest breeds of dog and is named after the Mexican state of Chihuahua"
    ),
    Puppy(
        7,
        "CoCo",
        "Chow Chow",
        R.drawable.chowchow,
        "The Chow Chow is a dog breed originally from northern China"
    ),
    Puppy(
        8,
        "Dus",
        "Dachshund",
        R.drawable.dachshund,
        "The dachshund also known as the wiener dog, badger dog, or sausage dog, is a short-legged, long-bodied, hound-type dog breed"
    ),
    Puppy(
        9,
        "NamReb",
        "Doberman Pinscher",
        R.drawable.dobermanpinscher,
        "The Dobermann or Doberman Pinscher in the United States and Canada, is a medium-large breed of domestic dog that was originally developed around 1890 by Karl Friedrich Louis Dobermann, a tax collector from Germany"
    ),
    Puppy(
        10,
        "Eset",
        "Maltese",
        R.drawable.maltese,
        "The Maltese is a breed of dog in the toy group. It is thought to have originated in south-central Europe from dogs of spitz type"
    ),
    Puppy(
        11,
        "Naina",
        "Pomeranian",
        R.drawable.pomeranian,
        "The Pomeranian (often known as a Pom) is a breed of dog of the Spitz type that is named for the Pomerania region in north-west Poland and north-east Germany in Central Europe"
    ),
    Puppy(
        12,
        "Eld",
        "Poodle",
        R.drawable.poodle,
        "The Poodle is a dog breed that comes in three varieties: Standard Poodle, Miniature Poodle, and Toy Poodle"
    ),
    Puppy(
        13,
        "Reli",
        "Rottweiler",
        R.drawable.rottweiler,
        "The Rottweiler is a breed of domestic dog, regarded as medium-to-large or large"
    ),
    Puppy(
        14,
        "Epra",
        "Sharpei",
        R.drawable.sharpei,
        "The Shar Pei is a dog breed from southern China. Traditionally kept for dog fighting, the Shar Pei was driven to the point of extinction in the 20th century"
    ),
    Puppy(
        15,
        "Uni",
        "Shiba Inu",
        R.drawable.shibainu,
        "The Shiba Inu is a breed of hunting dog from Japan. A small-to-medium breed, it is the smallest of the six original and distinct spitz breeds of dog native to Japan"
    )
)
