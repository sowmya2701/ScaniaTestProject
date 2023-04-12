package com.example.scaniatestproject.data

import com.google.gson.annotations.SerializedName

data class Dog(@SerializedName("message" ) var message : JsonMessage = JsonMessage(),
               @SerializedName("status"  ) var status  : String?  = null)

data class JsonMessage(@SerializedName("affenpinscher"   ) var affenpinscher   : ArrayList<String> = arrayListOf(),
                       @SerializedName("african"         ) var african         : ArrayList<String> = arrayListOf(),
                       @SerializedName("airedale"        ) var airedale        : ArrayList<String> = arrayListOf(),
                       @SerializedName("akita"           ) var akita           : ArrayList<String> = arrayListOf(),
                       @SerializedName("appenzeller"     ) var appenzeller     : ArrayList<String> = arrayListOf(),
                       @SerializedName("australian"      ) var australian      : ArrayList<String> = arrayListOf(),
                       @SerializedName("basenji"         ) var basenji         : ArrayList<String> = arrayListOf(),
                       @SerializedName("beagle"          ) var beagle          : ArrayList<String> = arrayListOf(),
                       @SerializedName("bluetick"        ) var bluetick        : ArrayList<String> = arrayListOf(),
                       @SerializedName("borzoi"          ) var borzoi          : ArrayList<String> = arrayListOf(),
                       @SerializedName("bouvier"         ) var bouvier         : ArrayList<String> = arrayListOf(),
                       @SerializedName("boxer"           ) var boxer           : ArrayList<String> = arrayListOf(),
                       @SerializedName("brabancon"       ) var brabancon       : ArrayList<String> = arrayListOf(),
                       @SerializedName("briard"          ) var briard          : ArrayList<String> = arrayListOf(),
                       @SerializedName("buhund"          ) var buhund          : ArrayList<String> = arrayListOf(),
                       @SerializedName("bulldog"         ) var bulldog         : ArrayList<String> = arrayListOf(),
                       @SerializedName("bullterrier"     ) var bullterrier     : ArrayList<String> = arrayListOf(),
                       @SerializedName("cattledog"       ) var cattledog       : ArrayList<String> = arrayListOf(),
                       @SerializedName("chihuahua"       ) var chihuahua       : ArrayList<String> = arrayListOf(),
                       @SerializedName("chow"            ) var chow            : ArrayList<String> = arrayListOf(),
                       @SerializedName("clumber"         ) var clumber         : ArrayList<String> = arrayListOf(),
                       @SerializedName("cockapoo"        ) var cockapoo        : ArrayList<String> = arrayListOf(),
                       @SerializedName("collie"          ) var collie          : ArrayList<String> = arrayListOf(),
                       @SerializedName("coonhound"       ) var coonhound       : ArrayList<String> = arrayListOf(),
                       @SerializedName("corgi"           ) var corgi           : ArrayList<String> = arrayListOf(),
                       @SerializedName("cotondetulear"   ) var cotondetulear   : ArrayList<String> = arrayListOf(),
                       @SerializedName("dachshund"       ) var dachshund       : ArrayList<String> = arrayListOf(),
                       @SerializedName("dalmatian"       ) var dalmatian       : ArrayList<String> = arrayListOf(),
                       @SerializedName("dane"            ) var dane            : ArrayList<String> = arrayListOf(),
                       @SerializedName("deerhound"       ) var deerhound       : ArrayList<String> = arrayListOf(),
                       @SerializedName("dhole"           ) var dhole           : ArrayList<String> = arrayListOf(),
                       @SerializedName("dingo"           ) var dingo           : ArrayList<String> = arrayListOf(),
                       @SerializedName("doberman"        ) var doberman        : ArrayList<String> = arrayListOf(),
                       @SerializedName("elkhound"        ) var elkhound        : ArrayList<String> = arrayListOf(),
                       @SerializedName("entlebucher"     ) var entlebucher     : ArrayList<String> = arrayListOf(),
                       @SerializedName("eskimo"          ) var eskimo          : ArrayList<String> = arrayListOf(),
                       @SerializedName("finnish"         ) var finnish         : ArrayList<String> = arrayListOf(),
                       @SerializedName("frise"           ) var frise           : ArrayList<String> = arrayListOf(),
                       @SerializedName("germanshepherd"  ) var germanshepherd  : ArrayList<String> = arrayListOf(),
                       @SerializedName("greyhound"       ) var greyhound       : ArrayList<String> = arrayListOf(),
                       @SerializedName("groenendael"     ) var groenendael     : ArrayList<String> = arrayListOf(),
                       @SerializedName("havanese"        ) var havanese        : ArrayList<String> = arrayListOf(),
                       @SerializedName("hound"           ) var hound           : ArrayList<String> = arrayListOf(),
                       @SerializedName("husky"           ) var husky           : ArrayList<String> = arrayListOf(),
                       @SerializedName("keeshond"        ) var keeshond        : ArrayList<String> = arrayListOf(),
                       @SerializedName("kelpie"          ) var kelpie          : ArrayList<String> = arrayListOf(),
                       @SerializedName("komondor"        ) var komondor        : ArrayList<String> = arrayListOf(),
                       @SerializedName("kuvasz"          ) var kuvasz          : ArrayList<String> = arrayListOf(),
                       @SerializedName("labradoodle"     ) var labradoodle     : ArrayList<String> = arrayListOf(),
                       @SerializedName("labrador"        ) var labrador        : ArrayList<String> = arrayListOf(),
                       @SerializedName("leonberg"        ) var leonberg        : ArrayList<String> = arrayListOf(),
                       @SerializedName("lhasa"           ) var lhasa           : ArrayList<String> = arrayListOf(),
                       @SerializedName("malamute"        ) var malamute        : ArrayList<String> = arrayListOf(),
                       @SerializedName("malinois"        ) var malinois        : ArrayList<String> = arrayListOf(),
                       @SerializedName("maltese"         ) var maltese         : ArrayList<String> = arrayListOf(),
                       @SerializedName("mastiff"         ) var mastiff         : ArrayList<String> = arrayListOf(),
                       @SerializedName("mexicanhairless" ) var mexicanhairless : ArrayList<String> = arrayListOf(),
                       @SerializedName("mix"             ) var mix             : ArrayList<String> = arrayListOf(),
                       @SerializedName("mountain"        ) var mountain        : ArrayList<String> = arrayListOf(),
                       @SerializedName("newfoundland"    ) var newfoundland    : ArrayList<String> = arrayListOf(),
                       @SerializedName("otterhound"      ) var otterhound      : ArrayList<String> = arrayListOf(),
                       @SerializedName("ovcharka"        ) var ovcharka        : ArrayList<String> = arrayListOf(),
                       @SerializedName("papillon"        ) var papillon        : ArrayList<String> = arrayListOf(),
                       @SerializedName("pekinese"        ) var pekinese        : ArrayList<String> = arrayListOf(),
                       @SerializedName("pembroke"        ) var pembroke        : ArrayList<String> = arrayListOf(),
                       @SerializedName("pinscher"        ) var pinscher        : ArrayList<String> = arrayListOf(),
                       @SerializedName("pitbull"         ) var pitbull         : ArrayList<String> = arrayListOf(),
                       @SerializedName("pointer"         ) var pointer         : ArrayList<String> = arrayListOf(),
                       @SerializedName("pomeranian"      ) var pomeranian      : ArrayList<String> = arrayListOf(),
                       @SerializedName("poodle"          ) var poodle          : ArrayList<String> = arrayListOf(),
                       @SerializedName("pug"             ) var pug             : ArrayList<String> = arrayListOf(),
                       @SerializedName("puggle"          ) var puggle          : ArrayList<String> = arrayListOf(),
                       @SerializedName("pyrenees"        ) var pyrenees        : ArrayList<String> = arrayListOf(),
                       @SerializedName("redbone"         ) var redbone         : ArrayList<String> = arrayListOf(),
                       @SerializedName("retriever"       ) var retriever       : ArrayList<String> = arrayListOf(),
                       @SerializedName("ridgeback"       ) var ridgeback       : ArrayList<String> = arrayListOf(),
                       @SerializedName("rottweiler"      ) var rottweiler      : ArrayList<String> = arrayListOf(),
                       @SerializedName("saluki"          ) var saluki          : ArrayList<String> = arrayListOf(),
                       @SerializedName("samoyed"         ) var samoyed         : ArrayList<String> = arrayListOf(),
                       @SerializedName("schipperke"      ) var schipperke      : ArrayList<String> = arrayListOf(),
                       @SerializedName("schnauzer"       ) var schnauzer       : ArrayList<String> = arrayListOf(),
                       @SerializedName("segugio"         ) var segugio         : ArrayList<String> = arrayListOf(),
                       @SerializedName("setter"          ) var setter          : ArrayList<String> = arrayListOf(),
                       @SerializedName("sharpei"         ) var sharpei         : ArrayList<String> = arrayListOf(),
                       @SerializedName("sheepdog"        ) var sheepdog        : ArrayList<String> = arrayListOf(),
                       @SerializedName("shiba"           ) var shiba           : ArrayList<String> = arrayListOf(),
                       @SerializedName("shihtzu"         ) var shihtzu         : ArrayList<String> = arrayListOf(),
                       @SerializedName("spaniel"         ) var spaniel         : ArrayList<String> = arrayListOf(),
                       @SerializedName("spitz"           ) var spitz           : ArrayList<String> = arrayListOf(),
                       @SerializedName("springer"        ) var springer        : ArrayList<String> = arrayListOf(),
                       @SerializedName("stbernard"       ) var stbernard       : ArrayList<String> = arrayListOf(),
                       @SerializedName("terrier"         ) var terrier         : ArrayList<String> = arrayListOf(),
                       @SerializedName("tervuren"        ) var tervuren        : ArrayList<String> = arrayListOf(),
                       @SerializedName("vizsla"          ) var vizsla          : ArrayList<String> = arrayListOf(),
                       @SerializedName("waterdog"        ) var waterdog        : ArrayList<String> = arrayListOf(),
                       @SerializedName("weimaraner"      ) var weimaraner      : ArrayList<String> = arrayListOf(),
                       @SerializedName("whippet"         ) var whippet         : ArrayList<String> = arrayListOf(),
                       @SerializedName("wolfhound"       ) var wolfhound       : ArrayList<String> = arrayListOf())



sealed class NetworkResult<T> {
    data class Loading<T>(val isLoading: Boolean) : NetworkResult<T>()
    data class Success<T>(val data: T) : NetworkResult<T>()
    data class Failure<T>(val errorMessage: String) : NetworkResult<T>()
}