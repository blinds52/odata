package OData;

import com.coasttocoastresearch.apg.Grammar;
import java.io.PrintStream;
/** This class has been generated automatically from an SABNF grammer by
 * Java APG, the {@link com.coasttocoastresearch.apg.Generator} class.<br>
 * It is an extension of the {@link com.coasttocoastresearch.apg.Grammar}
 * class containing additional members and enums not found
 * in the base class.<br>
 * The function {@link #getInstance()} will return a reference to a static,
 * singleton instance of the class.
 * <p>For more information visit <a href="http://www.coasttocoastresearch.com" target="_blank">http://www.coasttocoastresearch.com</a>. */

public class OData extends Grammar{

    // public API
    /** Called to get a singleton instance of this class.
     * @return a singleton instance of this class, cast as the base class, Grammar. */
    public static Grammar getInstance(){
        if(factoryInstance == null){
            factoryInstance = new OData(getRules(), getUdts(), getOpcodes());
        }
        return factoryInstance;
    }

    // rule name enum
    /** The number of rules in the grammar */
    public static int ruleCount = 297;
    /** This enum provides easy to remember enum constants for locating the rule identifiers and names.
     * The enum constants have the same spelling as the rule names rendered in all caps with underscores replacing hyphens. */
    public enum RuleNames{
        /** id = <code>144</code>, name = <code>"abstractSpatialTypeName"</code> */
        ABSTRACTSPATIALTYPENAME("abstractSpatialTypeName", 144, 995, 3),
        /** id = <code>158</code>, name = <code>"action"</code> */
        ACTION("action", 158, 1027, 1),
        /** id = <code>181</code>, name = <code>"actionCall"</code> */
        ACTIONCALL("actionCall", 181, 1203, 6),
        /** id = <code>283</code>, name = <code>"addExpr"</code> */
        ADDEXPR("addExpr", 283, 1942, 8),
        /** id = <code>199</code>, name = <code>"aliasAndValue"</code> */
        ALIASANDVALUE("aliasAndValue", 199, 1266, 4),
        /** id = <code>244</code>, name = <code>"allExpr"</code> */
        ALLEXPR("allExpr", 244, 1582, 6),
        /** id = <code>18</code>, name = <code>"allOperationsInContainer"</code> */
        ALLOPERATIONSINCONTAINER("allOperationsInContainer", 18, 153, 3),
        /** id = <code>28</code>, name = <code>"ALPHA"</code> */
        ALPHA("ALPHA", 28, 230, 3),
        /** id = <code>275</code>, name = <code>"andExpr"</code> */
        ANDEXPR("andExpr", 275, 1878, 8),
        /** id = <code>243</code>, name = <code>"anyExpr"</code> */
        ANYEXPR("anyExpr", 243, 1574, 8),
        /** id = <code>207</code>, name = <code>"begin-array"</code> */
        BEGIN_ARRAY("begin-array", 207, 1318, 1),
        /** id = <code>205</code>, name = <code>"begin-object"</code> */
        BEGIN_OBJECT("begin-object", 205, 1316, 1),
        /** id = <code>72</code>, name = <code>"binary"</code> */
        BINARY("binary", 72, 546, 9),
        /** id = <code>292</code>, name = <code>"boolCastExpr"</code> */
        BOOLCASTEXPR("boolCastExpr", 292, 2018, 13),
        /** id = <code>225</code>, name = <code>"boolCommonExpr"</code> */
        BOOLCOMMONEXPR("boolCommonExpr", 225, 1417, 17),
        /** id = <code>73</code>, name = <code>"boolean"</code> */
        BOOLEAN("boolean", 73, 555, 7),
        /** id = <code>226</code>, name = <code>"boolFirstMemberExpr"</code> */
        BOOLFIRSTMEMBEREXPR("boolFirstMemberExpr", 226, 1434, 1),
        /** id = <code>238</code>, name = <code>"boolFunctionExpr"</code> */
        BOOLFUNCTIONEXPR("boolFunctionExpr", 238, 1524, 1),
        /** id = <code>247</code>, name = <code>"boolMethodCallExpr"</code> */
        BOOLMETHODCALLEXPR("boolMethodCallExpr", 247, 1616, 5),
        /** id = <code>274</code>, name = <code>"boolParenExpr"</code> */
        BOOLPARENEXPR("boolParenExpr", 274, 1870, 8),
        /** id = <code>182</code>, name = <code>"boundActionCall"</code> */
        BOUNDACTIONCALL("boundActionCall", 182, 1209, 1),
        /** id = <code>192</code>, name = <code>"boundComplexColFuncCall"</code> */
        BOUNDCOMPLEXCOLFUNCCALL("boundComplexColFuncCall", 192, 1243, 1),
        /** id = <code>191</code>, name = <code>"boundComplexFuncCall"</code> */
        BOUNDCOMPLEXFUNCCALL("boundComplexFuncCall", 191, 1242, 1),
        /** id = <code>190</code>, name = <code>"boundEntityColFuncCall"</code> */
        BOUNDENTITYCOLFUNCCALL("boundEntityColFuncCall", 190, 1241, 1),
        /** id = <code>189</code>, name = <code>"boundEntityFuncCall"</code> */
        BOUNDENTITYFUNCCALL("boundEntityFuncCall", 189, 1240, 1),
        /** id = <code>239</code>, name = <code>"boundFunctionExpr"</code> */
        BOUNDFUNCTIONEXPR("boundFunctionExpr", 239, 1525, 1),
        /** id = <code>180</code>, name = <code>"boundOperation"</code> */
        BOUNDOPERATION("boundOperation", 180, 1175, 28),
        /** id = <code>194</code>, name = <code>"boundPrimitiveColFuncCall"</code> */
        BOUNDPRIMITIVECOLFUNCCALL("boundPrimitiveColFuncCall", 194, 1245, 1),
        /** id = <code>193</code>, name = <code>"boundPrimitiveFuncCall"</code> */
        BOUNDPRIMITIVEFUNCCALL("boundPrimitiveFuncCall", 193, 1244, 1),
        /** id = <code>85</code>, name = <code>"byte"</code> */
        BYTE("byte", 85, 667, 2),
        /** id = <code>291</code>, name = <code>"castExpr"</code> */
        CASTEXPR("castExpr", 291, 2005, 13),
        /** id = <code>272</code>, name = <code>"ceilingMethodCallExpr"</code> */
        CEILINGMETHODCALLEXPR("ceilingMethodCallExpr", 272, 1853, 9),
        /** id = <code>217</code>, name = <code>"charInJSON"</code> */
        CHARINJSON("charInJSON", 217, 1357, 1),
        /** id = <code>95</code>, name = <code>"collectionLiteral"</code> */
        COLLECTIONLITERAL("collectionLiteral", 95, 754, 8),
        /** id = <code>167</code>, name = <code>"collectionNavigation"</code> */
        COLLECTIONNAVIGATION("collectionNavigation", 167, 1075, 12),
        /** id = <code>233</code>, name = <code>"collectionNavigationExpr"</code> */
        COLLECTIONNAVIGATIONEXPR("collectionNavigationExpr", 233, 1479, 12),
        /** id = <code>174</code>, name = <code>"collectionPath"</code> */
        COLLECTIONPATH("collectionPath", 174, 1148, 3),
        /** id = <code>235</code>, name = <code>"collectionPathExpr"</code> */
        COLLECTIONPATHEXPR("collectionPathExpr", 235, 1494, 11),
        /** id = <code>223</code>, name = <code>"collectionPropertyInUri"</code> */
        COLLECTIONPROPERTYINURI("collectionPropertyInUri", 223, 1390, 13),
        /** id = <code>54</code>, name = <code>"COMMA"</code> */
        COMMA("COMMA", 54, 435, 1),
        /** id = <code>224</code>, name = <code>"commonExpr"</code> */
        COMMONEXPR("commonExpr", 224, 1403, 14),
        /** id = <code>163</code>, name = <code>"complexColFunction"</code> */
        COMPLEXCOLFUNCTION("complexColFunction", 163, 1038, 1),
        /** id = <code>186</code>, name = <code>"complexColFunctionCall"</code> */
        COMPLEXCOLFUNCTIONCALL("complexColFunctionCall", 186, 1225, 5),
        /** id = <code>203</code>, name = <code>"complexColInUri"</code> */
        COMPLEXCOLINURI("complexColInUri", 203, 1296, 10),
        /** id = <code>152</code>, name = <code>"complexColProperty"</code> */
        COMPLEXCOLPROPERTY("complexColProperty", 152, 1019, 1),
        /** id = <code>162</code>, name = <code>"complexFunction"</code> */
        COMPLEXFUNCTION("complexFunction", 162, 1037, 1),
        /** id = <code>185</code>, name = <code>"complexFunctionCall"</code> */
        COMPLEXFUNCTIONCALL("complexFunctionCall", 185, 1220, 5),
        /** id = <code>202</code>, name = <code>"complexInUri"</code> */
        COMPLEXINURI("complexInUri", 202, 1279, 17),
        /** id = <code>176</code>, name = <code>"complexPath"</code> */
        COMPLEXPATH("complexPath", 176, 1154, 18),
        /** id = <code>236</code>, name = <code>"complexPathExpr"</code> */
        COMPLEXPATHEXPR("complexPathExpr", 236, 1505, 16),
        /** id = <code>151</code>, name = <code>"complexProperty"</code> */
        COMPLEXPROPERTY("complexProperty", 151, 1018, 1),
        /** id = <code>222</code>, name = <code>"complexPropertyInUri"</code> */
        COMPLEXPROPERTYINURI("complexPropertyInUri", 222, 1384, 6),
        /** id = <code>212</code>, name = <code>"complexTypeMetadataInUri"</code> */
        COMPLEXTYPEMETADATAINURI("complexTypeMetadataInUri", 212, 1323, 9),
        /** id = <code>137</code>, name = <code>"complexTypeName"</code> */
        COMPLEXTYPENAME("complexTypeName", 137, 943, 1),
        /** id = <code>170</code>, name = <code>"compoundKey"</code> */
        COMPOUNDKEY("compoundKey", 170, 1094, 8),
        /** id = <code>257</code>, name = <code>"concatMethodCallExpr"</code> */
        CONCATMETHODCALLEXPR("concatMethodCallExpr", 257, 1716, 11),
        /** id = <code>145</code>, name = <code>"concreteSpatialTypeName"</code> */
        CONCRETESPATIALTYPENAME("concreteSpatialTypeName", 145, 998, 8),
        /** id = <code>177</code>, name = <code>"count"</code> */
        COUNT("count", 177, 1172, 1),
        /** id = <code>26</code>, name = <code>"customName"</code> */
        CUSTOMNAME("customName", 26, 206, 15),
        /** id = <code>25</code>, name = <code>"customQueryOption"</code> */
        CUSTOMQUERYOPTION("customQueryOption", 25, 200, 6),
        /** id = <code>27</code>, name = <code>"customValue"</code> */
        CUSTOMVALUE("customValue", 27, 221, 9),
        /** id = <code>74</code>, name = <code>"dateTime"</code> */
        DATETIME("dateTime", 74, 562, 5),
        /** id = <code>76</code>, name = <code>"dateTimeBody"</code> */
        DATETIMEBODY("dateTimeBody", 76, 572, 24),
        /** id = <code>75</code>, name = <code>"dateTimeOffset"</code> */
        DATETIMEOFFSET("dateTimeOffset", 75, 567, 5),
        /** id = <code>77</code>, name = <code>"dateTimeOffsetBody"</code> */
        DATETIMEOFFSETBODY("dateTimeOffsetBody", 77, 596, 9),
        /** id = <code>65</code>, name = <code>"day"</code> */
        DAY("day", 65, 480, 12),
        /** id = <code>262</code>, name = <code>"dayMethodCallExpr"</code> */
        DAYMETHODCALLEXPR("dayMethodCallExpr", 262, 1763, 9),
        /** id = <code>263</code>, name = <code>"daysMethodCallExpr"</code> */
        DAYSMETHODCALLEXPR("daysMethodCallExpr", 263, 1772, 9),
        /** id = <code>43</code>, name = <code>"dec-octet"</code> */
        DEC_OCTET("dec-octet", 43, 378, 16),
        /** id = <code>78</code>, name = <code>"decimal"</code> */
        DECIMAL("decimal", 78, 605, 4),
        /** id = <code>79</code>, name = <code>"decimalBody"</code> */
        DECIMALBODY("decimalBody", 79, 609, 10),
        /** id = <code>29</code>, name = <code>"DIGIT"</code> */
        DIGIT("DIGIT", 29, 233, 1),
        /** id = <code>294</code>, name = <code>"distanceMethodCallExpr"</code> */
        DISTANCEMETHODCALLEXPR("distanceMethodCallExpr", 294, 2040, 11),
        /** id = <code>286</code>, name = <code>"divExpr"</code> */
        DIVEXPR("divExpr", 286, 1966, 8),
        /** id = <code>80</code>, name = <code>"double"</code> */
        DOUBLE("double", 80, 619, 4),
        /** id = <code>81</code>, name = <code>"doubleBody"</code> */
        DOUBLEBODY("doubleBody", 81, 623, 11),
        /** id = <code>31</code>, name = <code>"DQUOTE"</code> */
        DQUOTE("DQUOTE", 31, 242, 1),
        /** id = <code>208</code>, name = <code>"end-array"</code> */
        END_ARRAY("end-array", 208, 1319, 1),
        /** id = <code>206</code>, name = <code>"end-object"</code> */
        END_OBJECT("end-object", 206, 1317, 1),
        /** id = <code>250</code>, name = <code>"endsWithMethodCallExpr"</code> */
        ENDSWITHMETHODCALLEXPR("endsWithMethodCallExpr", 250, 1643, 11),
        /** id = <code>161</code>, name = <code>"entityColFunction"</code> */
        ENTITYCOLFUNCTION("entityColFunction", 161, 1036, 1),
        /** id = <code>184</code>, name = <code>"entityColFunctionCall"</code> */
        ENTITYCOLFUNCTIONCALL("entityColFunctionCall", 184, 1215, 5),
        /** id = <code>156</code>, name = <code>"entityColNavigationProperty"</code> */
        ENTITYCOLNAVIGATIONPROPERTY("entityColNavigationProperty", 156, 1025, 1),
        /** id = <code>157</code>, name = <code>"entityContainerName"</code> */
        ENTITYCONTAINERNAME("entityContainerName", 157, 1026, 1),
        /** id = <code>160</code>, name = <code>"entityFunction"</code> */
        ENTITYFUNCTION("entityFunction", 160, 1035, 1),
        /** id = <code>183</code>, name = <code>"entityFunctionCall"</code> */
        ENTITYFUNCTIONCALL("entityFunctionCall", 183, 1210, 5),
        /** id = <code>155</code>, name = <code>"entityNavigationProperty"</code> */
        ENTITYNAVIGATIONPROPERTY("entityNavigationProperty", 155, 1024, 1),
        /** id = <code>135</code>, name = <code>"entitySetName"</code> */
        ENTITYSETNAME("entitySetName", 135, 941, 1),
        /** id = <code>136</code>, name = <code>"entityTypeName"</code> */
        ENTITYTYPENAME("entityTypeName", 136, 942, 1),
        /** id = <code>138</code>, name = <code>"enumerationTypeName"</code> */
        ENUMERATIONTYPENAME("enumerationTypeName", 138, 944, 1),
        /** id = <code>52</code>, name = <code>"EQ"</code> */
        EQ("EQ", 52, 433, 1),
        /** id = <code>277</code>, name = <code>"eqExpr"</code> */
        EQEXPR("eqExpr", 277, 1894, 8),
        /** id = <code>221</code>, name = <code>"exp"</code> */
        EXP("exp", 221, 1376, 8),
        /** id = <code>6</code>, name = <code>"expand"</code> */
        EXPAND("expand", 6, 49, 3),
        /** id = <code>7</code>, name = <code>"expandClause"</code> */
        EXPANDCLAUSE("expandClause", 7, 52, 6),
        /** id = <code>8</code>, name = <code>"expandItem"</code> */
        EXPANDITEM("expandItem", 8, 58, 14),
        /** id = <code>9</code>, name = <code>"filter"</code> */
        FILTER("filter", 9, 72, 3),
        /** id = <code>227</code>, name = <code>"firstMemberExpr"</code> */
        FIRSTMEMBEREXPR("firstMemberExpr", 227, 1435, 4),
        /** id = <code>271</code>, name = <code>"floorMethodCallExpr"</code> */
        FLOORMETHODCALLEXPR("floorMethodCallExpr", 271, 1844, 9),
        /** id = <code>13</code>, name = <code>"format"</code> */
        FORMAT("format", 13, 104, 10),
        /** id = <code>220</code>, name = <code>"frac"</code> */
        FRAC("frac", 220, 1372, 4),
        /** id = <code>69</code>, name = <code>"fractionalSeconds"</code> */
        FRACTIONALSECONDS("fractionalSeconds", 69, 506, 2),
        /** id = <code>94</code>, name = <code>"fullCollectionLiteral"</code> */
        FULLCOLLECTIONLITERAL("fullCollectionLiteral", 94, 751, 3),
        /** id = <code>98</code>, name = <code>"fullLineStringLiteral"</code> */
        FULLLINESTRINGLITERAL("fullLineStringLiteral", 98, 774, 3),
        /** id = <code>102</code>, name = <code>"fullMultiLineStringLiteral"</code> */
        FULLMULTILINESTRINGLITERAL("fullMultiLineStringLiteral", 102, 792, 3),
        /** id = <code>105</code>, name = <code>"fullMultiPointLiteral"</code> */
        FULLMULTIPOINTLITERAL("fullMultiPointLiteral", 105, 809, 3),
        /** id = <code>108</code>, name = <code>"fullMultiPolygonLiteral"</code> */
        FULLMULTIPOLYGONLITERAL("fullMultiPolygonLiteral", 108, 826, 3),
        /** id = <code>111</code>, name = <code>"fullPointLiteral"</code> */
        FULLPOINTLITERAL("fullPointLiteral", 111, 843, 3),
        /** id = <code>117</code>, name = <code>"fullPolygonLiteral"</code> */
        FULLPOLYGONLITERAL("fullPolygonLiteral", 117, 867, 3),
        /** id = <code>159</code>, name = <code>"function"</code> */
        FUNCTION("function", 159, 1028, 7),
        /** id = <code>240</code>, name = <code>"functionExpr"</code> */
        FUNCTIONEXPR("functionExpr", 240, 1526, 34),
        /** id = <code>242</code>, name = <code>"functionExprParameter"</code> */
        FUNCTIONEXPRPARAMETER("functionExprParameter", 242, 1570, 4),
        /** id = <code>241</code>, name = <code>"functionExprParameters"</code> */
        FUNCTIONEXPRPARAMETERS("functionExprParameters", 241, 1560, 10),
        /** id = <code>196</code>, name = <code>"functionParameter"</code> */
        FUNCTIONPARAMETER("functionParameter", 196, 1256, 6),
        /** id = <code>197</code>, name = <code>"functionParameterName"</code> */
        FUNCTIONPARAMETERNAME("functionParameterName", 197, 1262, 1),
        /** id = <code>195</code>, name = <code>"functionParameters"</code> */
        FUNCTIONPARAMETERS("functionParameters", 195, 1246, 10),
        /** id = <code>282</code>, name = <code>"geExpr"</code> */
        GEEXPR("geExpr", 282, 1934, 8),
        /** id = <code>93</code>, name = <code>"geographyCollection"</code> */
        GEOGRAPHYCOLLECTION("geographyCollection", 93, 747, 4),
        /** id = <code>97</code>, name = <code>"geographyLineString"</code> */
        GEOGRAPHYLINESTRING("geographyLineString", 97, 770, 4),
        /** id = <code>101</code>, name = <code>"geographyMultiLineString"</code> */
        GEOGRAPHYMULTILINESTRING("geographyMultiLineString", 101, 788, 4),
        /** id = <code>104</code>, name = <code>"geographyMultiPoint"</code> */
        GEOGRAPHYMULTIPOINT("geographyMultiPoint", 104, 805, 4),
        /** id = <code>107</code>, name = <code>"geographyMultiPolygon"</code> */
        GEOGRAPHYMULTIPOLYGON("geographyMultiPolygon", 107, 822, 4),
        /** id = <code>110</code>, name = <code>"geographyPoint"</code> */
        GEOGRAPHYPOINT("geographyPoint", 110, 839, 4),
        /** id = <code>116</code>, name = <code>"geographyPolygon"</code> */
        GEOGRAPHYPOLYGON("geographyPolygon", 116, 863, 4),
        /** id = <code>128</code>, name = <code>"geographyPrefix"</code> */
        GEOGRAPHYPREFIX("geographyPrefix", 128, 917, 3),
        /** id = <code>295</code>, name = <code>"geoLengthMethodCallExpr"</code> */
        GEOLENGTHMETHODCALLEXPR("geoLengthMethodCallExpr", 295, 2051, 9),
        /** id = <code>96</code>, name = <code>"geoLiteral"</code> */
        GEOLITERAL("geoLiteral", 96, 762, 8),
        /** id = <code>121</code>, name = <code>"geometryCollection"</code> */
        GEOMETRYCOLLECTION("geometryCollection", 121, 889, 4),
        /** id = <code>122</code>, name = <code>"geometryLineString"</code> */
        GEOMETRYLINESTRING("geometryLineString", 122, 893, 4),
        /** id = <code>123</code>, name = <code>"geometryMultiLineString"</code> */
        GEOMETRYMULTILINESTRING("geometryMultiLineString", 123, 897, 4),
        /** id = <code>124</code>, name = <code>"geometryMultiPoint"</code> */
        GEOMETRYMULTIPOINT("geometryMultiPoint", 124, 901, 4),
        /** id = <code>125</code>, name = <code>"geometryMultiPolygon"</code> */
        GEOMETRYMULTIPOLYGON("geometryMultiPolygon", 125, 905, 4),
        /** id = <code>126</code>, name = <code>"geometryPoint"</code> */
        GEOMETRYPOINT("geometryPoint", 126, 909, 4),
        /** id = <code>127</code>, name = <code>"geometryPolygon"</code> */
        GEOMETRYPOLYGON("geometryPolygon", 127, 913, 4),
        /** id = <code>129</code>, name = <code>"geometryPrefix"</code> */
        GEOMETRYPREFIX("geometryPrefix", 129, 920, 3),
        /** id = <code>293</code>, name = <code>"getTotalOffsetMinutesExpr"</code> */
        GETTOTALOFFSETMINUTESEXPR("getTotalOffsetMinutesExpr", 293, 2031, 9),
        /** id = <code>281</code>, name = <code>"gtExpr"</code> */
        GTEXPR("gtExpr", 281, 1926, 8),
        /** id = <code>84</code>, name = <code>"guid"</code> */
        GUID("guid", 84, 649, 18),
        /** id = <code>40</code>, name = <code>"h16"</code> */
        H16("h16", 40, 362, 2),
        /** id = <code>30</code>, name = <code>"HEXDIG"</code> */
        HEXDIG("HEXDIG", 30, 234, 8),
        /** id = <code>35</code>, name = <code>"host"</code> */
        HOST("host", 35, 248, 4),
        /** id = <code>66</code>, name = <code>"hour"</code> */
        HOUR("hour", 66, 492, 12),
        /** id = <code>264</code>, name = <code>"hourMethodCallExpr"</code> */
        HOURMETHODCALLEXPR("hourMethodCallExpr", 264, 1781, 9),
        /** id = <code>265</code>, name = <code>"hoursMethodCallExpr"</code> */
        HOURSMETHODCALLEXPR("hoursMethodCallExpr", 265, 1790, 9),
        /** id = <code>33</code>, name = <code>"HTAB"</code> */
        HTAB("HTAB", 33, 244, 1),
        /** id = <code>132</code>, name = <code>"identifierCharacter"</code> */
        IDENTIFIERCHARACTER("identifierCharacter", 132, 930, 4),
        /** id = <code>131</code>, name = <code>"identifierLeadingCharacter"</code> */
        IDENTIFIERLEADINGCHARACTER("identifierLeadingCharacter", 131, 927, 3),
        /** id = <code>231</code>, name = <code>"implicitVariableExpr"</code> */
        IMPLICITVARIABLEEXPR("implicitVariableExpr", 231, 1477, 1),
        /** id = <code>252</code>, name = <code>"indexOfMethodCallExpr"</code> */
        INDEXOFMETHODCALLEXPR("indexOfMethodCallExpr", 252, 1663, 11),
        /** id = <code>14</code>, name = <code>"inlinecount"</code> */
        INLINECOUNT("inlinecount", 14, 114, 5),
        /** id = <code>230</code>, name = <code>"inscopeVariableExpr"</code> */
        INSCOPEVARIABLEEXPR("inscopeVariableExpr", 230, 1474, 3),
        /** id = <code>219</code>, name = <code>"int"</code> */
        INT("int", 219, 1366, 6),
        /** id = <code>87</code>, name = <code>"int16"</code> */
        INT16("int16", 87, 674, 5),
        /** id = <code>88</code>, name = <code>"int32"</code> */
        INT32("int32", 88, 679, 5),
        /** id = <code>89</code>, name = <code>"int64"</code> */
        INT64("int64", 89, 684, 7),
        /** id = <code>296</code>, name = <code>"intersectsMethodCallExpr"</code> */
        INTERSECTSMETHODCALLEXPR("intersectsMethodCallExpr", 296, 2060, 11),
        /** id = <code>37</code>, name = <code>"IP-literal"</code> */
        IP_LITERAL("IP-literal", 37, 254, 6),
        /** id = <code>42</code>, name = <code>"IPv4address"</code> */
        IPV4ADDRESS("IPv4address", 42, 370, 8),
        /** id = <code>39</code>, name = <code>"IPv6address"</code> */
        IPV6ADDRESS("IPv6address", 39, 270, 92),
        /** id = <code>38</code>, name = <code>"IPvFuture"</code> */
        IPVFUTURE("IPvFuture", 38, 260, 10),
        /** id = <code>290</code>, name = <code>"isofExpr"</code> */
        ISOFEXPR("isofExpr", 290, 1992, 13),
        /** id = <code>168</code>, name = <code>"keyPredicate"</code> */
        KEYPREDICATE("keyPredicate", 168, 1087, 3),
        /** id = <code>172</code>, name = <code>"keyPropertyValue"</code> */
        KEYPROPERTYVALUE("keyPropertyValue", 172, 1106, 1),
        /** id = <code>171</code>, name = <code>"keyValuePair"</code> */
        KEYVALUEPAIR("keyValuePair", 171, 1102, 4),
        /** id = <code>245</code>, name = <code>"lambdaPredicateExpr"</code> */
        LAMBDAPREDICATEEXPR("lambdaPredicateExpr", 245, 1588, 1),
        /** id = <code>229</code>, name = <code>"lambdaPredicatePrefixExpr"</code> */
        LAMBDAPREDICATEPREFIXEXPR("lambdaPredicatePrefixExpr", 229, 1471, 3),
        /** id = <code>232</code>, name = <code>"lambdaVariableExpr"</code> */
        LAMBDAVARIABLEEXPR("lambdaVariableExpr", 232, 1478, 1),
        /** id = <code>280</code>, name = <code>"leExpr"</code> */
        LEEXPR("leExpr", 280, 1918, 8),
        /** id = <code>251</code>, name = <code>"lengthMethodCallExpr"</code> */
        LENGTHMETHODCALLEXPR("lengthMethodCallExpr", 251, 1654, 9),
        /** id = <code>100</code>, name = <code>"lineStringData"</code> */
        LINESTRINGDATA("lineStringData", 100, 780, 8),
        /** id = <code>99</code>, name = <code>"lineStringLiteral"</code> */
        LINESTRINGLITERAL("lineStringLiteral", 99, 777, 3),
        /** id = <code>179</code>, name = <code>"links"</code> */
        LINKS("links", 179, 1174, 1),
        /** id = <code>41</code>, name = <code>"ls32"</code> */
        LS32("ls32", 41, 364, 6),
        /** id = <code>279</code>, name = <code>"ltExpr"</code> */
        LTEXPR("ltExpr", 279, 1910, 8),
        /** id = <code>228</code>, name = <code>"memberExpr"</code> */
        MEMBEREXPR("memberExpr", 228, 1439, 32),
        /** id = <code>246</code>, name = <code>"methodCallExpr"</code> */
        METHODCALLEXPR("methodCallExpr", 246, 1589, 27),
        /** id = <code>67</code>, name = <code>"minute"</code> */
        MINUTE("minute", 67, 504, 1),
        /** id = <code>266</code>, name = <code>"minuteMethodCallExpr"</code> */
        MINUTEMETHODCALLEXPR("minuteMethodCallExpr", 266, 1799, 9),
        /** id = <code>267</code>, name = <code>"minutesMethodCallExpr"</code> */
        MINUTESMETHODCALLEXPR("minutesMethodCallExpr", 267, 1808, 9),
        /** id = <code>287</code>, name = <code>"modExpr"</code> */
        MODEXPR("modExpr", 287, 1974, 8),
        /** id = <code>64</code>, name = <code>"month"</code> */
        MONTH("month", 64, 470, 10),
        /** id = <code>260</code>, name = <code>"monthMethodCallExpr"</code> */
        MONTHMETHODCALLEXPR("monthMethodCallExpr", 260, 1745, 9),
        /** id = <code>261</code>, name = <code>"monthsMethodCallExpr"</code> */
        MONTHSMETHODCALLEXPR("monthsMethodCallExpr", 261, 1754, 9),
        /** id = <code>285</code>, name = <code>"mulExpr"</code> */
        MULEXPR("mulExpr", 285, 1958, 8),
        /** id = <code>103</code>, name = <code>"multiLineStringLiteral"</code> */
        MULTILINESTRINGLITERAL("multiLineStringLiteral", 103, 795, 10),
        /** id = <code>106</code>, name = <code>"multiPointLiteral"</code> */
        MULTIPOINTLITERAL("multiPointLiteral", 106, 812, 10),
        /** id = <code>109</code>, name = <code>"multiPolygonLiteral"</code> */
        MULTIPOLYGONLITERAL("multiPolygonLiteral", 109, 829, 10),
        /** id = <code>210</code>, name = <code>"name-separator"</code> */
        NAME_SEPARATOR("name-separator", 210, 1321, 1),
        /** id = <code>133</code>, name = <code>"namespace"</code> */
        NAMESPACE("namespace", 133, 934, 6),
        /** id = <code>134</code>, name = <code>"namespacePart"</code> */
        NAMESPACEPART("namespacePart", 134, 940, 1),
        /** id = <code>57</code>, name = <code>"nan"</code> */
        NAN("nan", 57, 440, 1),
        /** id = <code>60</code>, name = <code>"nanInfinity"</code> */
        NANINFINITY("nanInfinity", 60, 445, 4),
        /** id = <code>154</code>, name = <code>"navigationProperty"</code> */
        NAVIGATIONPROPERTY("navigationProperty", 154, 1021, 3),
        /** id = <code>278</code>, name = <code>"neExpr"</code> */
        NEEXPR("neExpr", 278, 1902, 8),
        /** id = <code>288</code>, name = <code>"negateExpr"</code> */
        NEGATEEXPR("negateExpr", 288, 1982, 5),
        /** id = <code>59</code>, name = <code>"negativeInfinity"</code> */
        NEGATIVEINFINITY("negativeInfinity", 59, 442, 3),
        /** id = <code>289</code>, name = <code>"notExpr"</code> */
        NOTEXPR("notExpr", 289, 1987, 5),
        /** id = <code>71</code>, name = <code>"null"</code> */
        NULL("null", 71, 539, 7),
        /** id = <code>218</code>, name = <code>"numberInJSON"</code> */
        NUMBERINJSON("numberInJSON", 218, 1358, 8),
        /** id = <code>130</code>, name = <code>"odataIdentifier"</code> */
        ODATAIDENTIFIER("odataIdentifier", 130, 923, 4),
        /** id = <code>2</code>, name = <code>"odataRelativeUri"</code> */
        ODATARELATIVEURI("odataRelativeUri", 2, 22, 6),
        /** id = <code>0</code>, name = <code>"odataUri"</code> */
        ODATAURI("odataUri", 0, 0, 16),
        /** id = <code>61</code>, name = <code>"oneToNine"</code> */
        ONETONINE("oneToNine", 61, 449, 10),
        /** id = <code>19</code>, name = <code>"operationQualifier"</code> */
        OPERATIONQUALIFIER("operationQualifier", 19, 156, 7),
        /** id = <code>10</code>, name = <code>"orderby"</code> */
        ORDERBY("orderby", 10, 75, 21),
        /** id = <code>276</code>, name = <code>"orExpr"</code> */
        OREXPR("orExpr", 276, 1886, 8),
        /** id = <code>50</code>, name = <code>"other-delims"</code> */
        OTHER_DELIMS("other-delims", 50, 423, 9),
        /** id = <code>198</code>, name = <code>"parameterAlias"</code> */
        PARAMETERALIAS("parameterAlias", 198, 1263, 3),
        /** id = <code>200</code>, name = <code>"parameterNameAndValue"</code> */
        PARAMETERNAMEANDVALUE("parameterNameAndValue", 200, 1270, 4),
        /** id = <code>23</code>, name = <code>"parameterTypeName"</code> */
        PARAMETERTYPENAME("parameterTypeName", 23, 188, 1),
        /** id = <code>22</code>, name = <code>"parameterTypeNames"</code> */
        PARAMETERTYPENAMES("parameterTypeNames", 22, 181, 7),
        /** id = <code>201</code>, name = <code>"parameterValue"</code> */
        PARAMETERVALUE("parameterValue", 201, 1274, 5),
        /** id = <code>273</code>, name = <code>"parenExpr"</code> */
        PARENEXPR("parenExpr", 273, 1862, 8),
        /** id = <code>46</code>, name = <code>"pchar"</code> */
        PCHAR("pchar", 46, 401, 6),
        /** id = <code>47</code>, name = <code>"pct-encoded"</code> */
        PCT_ENCODED("pct-encoded", 47, 407, 4),
        /** id = <code>114</code>, name = <code>"pointData"</code> */
        POINTDATA("pointData", 114, 855, 4),
        /** id = <code>113</code>, name = <code>"pointLiteral"</code> */
        POINTLITERAL("pointLiteral", 113, 852, 3),
        /** id = <code>119</code>, name = <code>"polygonData"</code> */
        POLYGONDATA("polygonData", 119, 873, 8),
        /** id = <code>118</code>, name = <code>"polygonLiteral"</code> */
        POLYGONLITERAL("polygonLiteral", 118, 870, 3),
        /** id = <code>36</code>, name = <code>"port"</code> */
        PORT("port", 36, 252, 2),
        /** id = <code>115</code>, name = <code>"positionLiteral"</code> */
        POSITIONLITERAL("positionLiteral", 115, 859, 4),
        /** id = <code>58</code>, name = <code>"positiveInfinity"</code> */
        POSITIVEINFINITY("positiveInfinity", 58, 441, 1),
        /** id = <code>165</code>, name = <code>"primitiveColFunction"</code> */
        PRIMITIVECOLFUNCTION("primitiveColFunction", 165, 1040, 1),
        /** id = <code>188</code>, name = <code>"primitiveColFunctionCall"</code> */
        PRIMITIVECOLFUNCTIONCALL("primitiveColFunctionCall", 188, 1235, 5),
        /** id = <code>204</code>, name = <code>"primitiveColInUri"</code> */
        PRIMITIVECOLINURI("primitiveColInUri", 204, 1306, 10),
        /** id = <code>150</code>, name = <code>"primitiveColProperty"</code> */
        PRIMITIVECOLPROPERTY("primitiveColProperty", 150, 1017, 1),
        /** id = <code>164</code>, name = <code>"primitiveFunction"</code> */
        PRIMITIVEFUNCTION("primitiveFunction", 164, 1039, 1),
        /** id = <code>187</code>, name = <code>"primitiveFunctionCall"</code> */
        PRIMITIVEFUNCTIONCALL("primitiveFunctionCall", 187, 1230, 5),
        /** id = <code>148</code>, name = <code>"primitiveKeyProperty"</code> */
        PRIMITIVEKEYPROPERTY("primitiveKeyProperty", 148, 1015, 1),
        /** id = <code>70</code>, name = <code>"primitiveLiteral"</code> */
        PRIMITIVELITERAL("primitiveLiteral", 70, 508, 31),
        /** id = <code>215</code>, name = <code>"primitiveLiteralInJSON"</code> */
        PRIMITIVELITERALINJSON("primitiveLiteralInJSON", 215, 1346, 6),
        /** id = <code>149</code>, name = <code>"primitiveNonKeyProperty"</code> */
        PRIMITIVENONKEYPROPERTY("primitiveNonKeyProperty", 149, 1016, 1),
        /** id = <code>147</code>, name = <code>"primitiveProperty"</code> */
        PRIMITIVEPROPERTY("primitiveProperty", 147, 1012, 3),
        /** id = <code>214</code>, name = <code>"primitivePropertyInUri"</code> */
        PRIMITIVEPROPERTYINURI("primitivePropertyInUri", 214, 1340, 6),
        /** id = <code>143</code>, name = <code>"primitiveTypeName"</code> */
        PRIMITIVETYPENAME("primitiveTypeName", 143, 970, 25),
        /** id = <code>146</code>, name = <code>"property"</code> */
        PROPERTY("property", 146, 1006, 6),
        /** id = <code>20</code>, name = <code>"qualifiedActionName"</code> */
        QUALIFIEDACTIONNAME("qualifiedActionName", 20, 163, 9),
        /** id = <code>141</code>, name = <code>"qualifiedComplexTypeName"</code> */
        QUALIFIEDCOMPLEXTYPENAME("qualifiedComplexTypeName", 141, 962, 4),
        /** id = <code>140</code>, name = <code>"qualifiedEntityTypeName"</code> */
        QUALIFIEDENTITYTYPENAME("qualifiedEntityTypeName", 140, 958, 4),
        /** id = <code>142</code>, name = <code>"qualifiedEnumerationTypeName"</code> */
        QUALIFIEDENUMERATIONTYPENAME("qualifiedEnumerationTypeName", 142, 966, 4),
        /** id = <code>21</code>, name = <code>"qualifiedFunctionName"</code> */
        QUALIFIEDFUNCTIONNAME("qualifiedFunctionName", 21, 172, 9),
        /** id = <code>139</code>, name = <code>"qualifiedTypeName"</code> */
        QUALIFIEDTYPENAME("qualifiedTypeName", 139, 945, 13),
        /** id = <code>4</code>, name = <code>"queryOption"</code> */
        QUERYOPTION("queryOption", 4, 34, 5),
        /** id = <code>3</code>, name = <code>"queryOptions"</code> */
        QUERYOPTIONS("queryOptions", 3, 28, 6),
        /** id = <code>209</code>, name = <code>"quotation-mark"</code> */
        QUOTATION_MARK("quotation-mark", 209, 1320, 1),
        /** id = <code>44</code>, name = <code>"reg-name"</code> */
        REG_NAME("reg-name", 44, 394, 5),
        /** id = <code>166</code>, name = <code>"resourcePath"</code> */
        RESOURCEPATH("resourcePath", 166, 1041, 34),
        /** id = <code>120</code>, name = <code>"ringLiteral"</code> */
        RINGLITERAL("ringLiteral", 120, 881, 8),
        /** id = <code>270</code>, name = <code>"roundMethodCallExpr"</code> */
        ROUNDMETHODCALLEXPR("roundMethodCallExpr", 270, 1835, 9),
        /** id = <code>86</code>, name = <code>"sbyte"</code> */
        SBYTE("sbyte", 86, 669, 5),
        /** id = <code>68</code>, name = <code>"second"</code> */
        SECOND("second", 68, 505, 1),
        /** id = <code>268</code>, name = <code>"secondMethodCallExpr"</code> */
        SECONDMETHODCALLEXPR("secondMethodCallExpr", 268, 1817, 9),
        /** id = <code>269</code>, name = <code>"secondsMethodCallExpr"</code> */
        SECONDSMETHODCALLEXPR("secondsMethodCallExpr", 269, 1826, 9),
        /** id = <code>45</code>, name = <code>"segment-nz"</code> */
        SEGMENT_NZ("segment-nz", 45, 399, 2),
        /** id = <code>15</code>, name = <code>"select"</code> */
        SELECT("select", 15, 119, 3),
        /** id = <code>16</code>, name = <code>"selectClause"</code> */
        SELECTCLAUSE("selectClause", 16, 122, 6),
        /** id = <code>17</code>, name = <code>"selectItem"</code> */
        SELECTITEM("selectItem", 17, 128, 25),
        /** id = <code>53</code>, name = <code>"SEMI"</code> */
        SEMI("SEMI", 53, 434, 1),
        /** id = <code>1</code>, name = <code>"serviceRoot"</code> */
        SERVICEROOT("serviceRoot", 1, 16, 6),
        /** id = <code>55</code>, name = <code>"sign"</code> */
        SIGN("sign", 55, 436, 3),
        /** id = <code>169</code>, name = <code>"simpleKey"</code> */
        SIMPLEKEY("simpleKey", 169, 1090, 4),
        /** id = <code>82</code>, name = <code>"single"</code> */
        SINGLE("single", 82, 634, 4),
        /** id = <code>83</code>, name = <code>"singleBody"</code> */
        SINGLEBODY("singleBody", 83, 638, 11),
        /** id = <code>173</code>, name = <code>"singleNavigation"</code> */
        SINGLENAVIGATION("singleNavigation", 173, 1107, 41),
        /** id = <code>234</code>, name = <code>"singleNavigationExpr"</code> */
        SINGLENAVIGATIONEXPR("singleNavigationExpr", 234, 1491, 3),
        /** id = <code>175</code>, name = <code>"singlePath"</code> */
        SINGLEPATH("singlePath", 175, 1151, 3),
        /** id = <code>237</code>, name = <code>"singlePathExpr"</code> */
        SINGLEPATHEXPR("singlePathExpr", 237, 1521, 3),
        /** id = <code>11</code>, name = <code>"skip"</code> */
        SKIP("skip", 11, 96, 4),
        /** id = <code>24</code>, name = <code>"skiptoken"</code> */
        SKIPTOKEN("skiptoken", 24, 189, 11),
        /** id = <code>32</code>, name = <code>"SP"</code> */
        SP("SP", 32, 243, 1),
        /** id = <code>51</code>, name = <code>"SQUOTE"</code> */
        SQUOTE("SQUOTE", 51, 432, 1),
        /** id = <code>91</code>, name = <code>"SQUOTE-in-string"</code> */
        SQUOTE_IN_STRING("SQUOTE-in-string", 91, 699, 3),
        /** id = <code>112</code>, name = <code>"sridLiteral"</code> */
        SRIDLITERAL("sridLiteral", 112, 846, 6),
        /** id = <code>56</code>, name = <code>"star"</code> */
        STAR("star", 56, 439, 1),
        /** id = <code>249</code>, name = <code>"startsWithMethodCallExpr"</code> */
        STARTSWITHMETHODCALLEXPR("startsWithMethodCallExpr", 249, 1632, 11),
        /** id = <code>153</code>, name = <code>"streamProperty"</code> */
        STREAMPROPERTY("streamProperty", 153, 1020, 1),
        /** id = <code>90</code>, name = <code>"string"</code> */
        STRING("string", 90, 691, 8),
        /** id = <code>216</code>, name = <code>"stringInJSON"</code> */
        STRINGINJSON("stringInJSON", 216, 1352, 5),
        /** id = <code>49</code>, name = <code>"sub-delims"</code> */
        SUB_DELIMS("sub-delims", 49, 418, 5),
        /** id = <code>284</code>, name = <code>"subExpr"</code> */
        SUBEXPR("subExpr", 284, 1950, 8),
        /** id = <code>253</code>, name = <code>"substringMethodCallExpr"</code> */
        SUBSTRINGMETHODCALLEXPR("substringMethodCallExpr", 253, 1674, 15),
        /** id = <code>248</code>, name = <code>"substringOfMethodCallExpr"</code> */
        SUBSTRINGOFMETHODCALLEXPR("substringOfMethodCallExpr", 248, 1621, 11),
        /** id = <code>5</code>, name = <code>"systemQueryOption"</code> */
        SYSTEMQUERYOPTION("systemQueryOption", 5, 39, 10),
        /** id = <code>92</code>, name = <code>"time"</code> */
        TIME("time", 92, 702, 45),
        /** id = <code>254</code>, name = <code>"toLowerMethodCallExpr"</code> */
        TOLOWERMETHODCALLEXPR("toLowerMethodCallExpr", 254, 1689, 9),
        /** id = <code>12</code>, name = <code>"top"</code> */
        TOP("top", 12, 100, 4),
        /** id = <code>255</code>, name = <code>"toUpperMethodCallExpr"</code> */
        TOUPPERMETHODCALLEXPR("toUpperMethodCallExpr", 255, 1698, 9),
        /** id = <code>256</code>, name = <code>"trimMethodCallExpr"</code> */
        TRIMMETHODCALLEXPR("trimMethodCallExpr", 256, 1707, 9),
        /** id = <code>213</code>, name = <code>"typeNVPInUri"</code> */
        TYPENVPINURI("typeNVPInUri", 213, 1332, 8),
        /** id = <code>48</code>, name = <code>"unreserved"</code> */
        UNRESERVED("unreserved", 48, 411, 7),
        /** id = <code>178</code>, name = <code>"value"</code> */
        VALUE("value", 178, 1173, 1),
        /** id = <code>211</code>, name = <code>"value-separator"</code> */
        VALUE_SEPARATOR("value-separator", 211, 1322, 1),
        /** id = <code>34</code>, name = <code>"WSP"</code> */
        WSP("WSP", 34, 245, 3),
        /** id = <code>63</code>, name = <code>"year"</code> */
        YEAR("year", 63, 468, 2),
        /** id = <code>258</code>, name = <code>"yearMethodCallExpr"</code> */
        YEARMETHODCALLEXPR("yearMethodCallExpr", 258, 1727, 9),
        /** id = <code>259</code>, name = <code>"yearsMethodCallExpr"</code> */
        YEARSMETHODCALLEXPR("yearsMethodCallExpr", 259, 1736, 9),
        /** id = <code>62</code>, name = <code>"zeroToFiftyNine"</code> */
        ZEROTOFIFTYNINE("zeroToFiftyNine", 62, 459, 9);
        private String name;
        private int id;
        private int offset;
        private int count;
        RuleNames(String string, int id, int offset, int count){
            this.name = string;
            this.id = id;
            this.offset = offset;
            this.count = count;
        }
        /** Associates the enum with the original grammar name of the rule it represents.
        * @return the original grammar rule name. */
        public  String ruleName(){return name;}
        /** Associates the enum with an identifier for the grammar rule it represents.
        * @return the rule name identifier. */
        public  int    ruleID(){return id;}
        private int    opcodeOffset(){return offset;}
        private int    opcodeCount(){return count;}
    }

    // UDT name enum
    /** The number of UDTs in the grammar */
    public static int udtCount = 0;
    /** This enum provides easy to remember enum constants for locating the UDT identifiers and names.
     * The enum constants have the same spelling as the UDT names rendered in all caps with underscores replacing hyphens. */
    public enum UdtNames{
    }

    // private
    private static OData factoryInstance = null;
    private OData(Rule[] rules, Udt[] udts, Opcode[] opcodes){
        super(rules, udts, opcodes);
    }

    private static Rule[] getRules(){
    	Rule[] rules = new Rule[297];
        for(RuleNames r : RuleNames.values()){
            rules[r.ruleID()] = getRule(r.ruleID(), r.ruleName(), r.opcodeOffset(), r.opcodeCount());
        }
        return rules;
    }

    private static Udt[] getUdts(){
    	Udt[] udts = new Udt[0];
        return udts;
    }

        // opcodes
    private static Opcode[] getOpcodes(){
    	Opcode[] op = new Opcode[2071];
        {int[] a = {1,2,4,5,6,10,11}; op[0] = getOpcodeCat(a);}
        {char[] a = {104,116,116,112}; op[1] = getOpcodeTls(a);}
        op[2] = getOpcodeRep((char)0, (char)1, 3);
        {char[] a = {115}; op[3] = getOpcodeTls(a);}
        {char[] a = {58,47,47}; op[4] = getOpcodeTls(a);}
        op[5] = getOpcodeRnm(35, 248); // host
        op[6] = getOpcodeRep((char)0, (char)1, 7);
        {int[] a = {8,9}; op[7] = getOpcodeCat(a);}
        {char[] a = {58}; op[8] = getOpcodeTls(a);}
        op[9] = getOpcodeRnm(36, 252); // port
        op[10] = getOpcodeRnm(1, 16); // serviceRoot
        op[11] = getOpcodeRep((char)0, (char)1, 12);
        {int[] a = {13,14,15}; op[12] = getOpcodeAlt(a);}
        {char[] a = {36,109,101,116,97,100,97,116,97}; op[13] = getOpcodeTls(a);}
        {char[] a = {36,98,97,116,99,104}; op[14] = getOpcodeTls(a);}
        op[15] = getOpcodeRnm(2, 22); // odataRelativeUri
        {int[] a = {17,18}; op[16] = getOpcodeCat(a);}
        {char[] a = {47}; op[17] = getOpcodeTls(a);}
        op[18] = getOpcodeRep((char)0, Character.MAX_VALUE, 19);
        {int[] a = {20,21}; op[19] = getOpcodeCat(a);}
        op[20] = getOpcodeRnm(45, 399); // segment-nz
        {char[] a = {47}; op[21] = getOpcodeTls(a);}
        {int[] a = {23,24}; op[22] = getOpcodeCat(a);}
        op[23] = getOpcodeRnm(166, 1041); // resourcePath
        op[24] = getOpcodeRep((char)0, (char)1, 25);
        {int[] a = {26,27}; op[25] = getOpcodeCat(a);}
        {char[] a = {63}; op[26] = getOpcodeTls(a);}
        op[27] = getOpcodeRnm(3, 28); // queryOptions
        {int[] a = {29,30}; op[28] = getOpcodeCat(a);}
        op[29] = getOpcodeRnm(4, 34); // queryOption
        op[30] = getOpcodeRep((char)0, Character.MAX_VALUE, 31);
        {int[] a = {32,33}; op[31] = getOpcodeCat(a);}
        {char[] a = {38}; op[32] = getOpcodeTls(a);}
        op[33] = getOpcodeRnm(4, 34); // queryOption
        {int[] a = {35,36,37,38}; op[34] = getOpcodeAlt(a);}
        op[35] = getOpcodeRnm(5, 39); // systemQueryOption
        op[36] = getOpcodeRnm(199, 1266); // aliasAndValue
        op[37] = getOpcodeRnm(200, 1270); // parameterNameAndValue
        op[38] = getOpcodeRnm(25, 200); // customQueryOption
        {int[] a = {40,41,42,43,44,45,46,47,48}; op[39] = getOpcodeAlt(a);}
        op[40] = getOpcodeRnm(6, 49); // expand
        op[41] = getOpcodeRnm(9, 72); // filter
        op[42] = getOpcodeRnm(10, 75); // orderby
        op[43] = getOpcodeRnm(11, 96); // skip
        op[44] = getOpcodeRnm(12, 100); // top
        op[45] = getOpcodeRnm(13, 104); // format
        op[46] = getOpcodeRnm(14, 114); // inlinecount
        op[47] = getOpcodeRnm(15, 119); // select
        op[48] = getOpcodeRnm(24, 189); // skiptoken
        {int[] a = {50,51}; op[49] = getOpcodeCat(a);}
        {char[] a = {36,101,120,112,97,110,100,61}; op[50] = getOpcodeTls(a);}
        op[51] = getOpcodeRnm(7, 52); // expandClause
        {int[] a = {53,54}; op[52] = getOpcodeCat(a);}
        op[53] = getOpcodeRnm(8, 58); // expandItem
        op[54] = getOpcodeRep((char)0, Character.MAX_VALUE, 55);
        {int[] a = {56,57}; op[55] = getOpcodeCat(a);}
        {char[] a = {44}; op[56] = getOpcodeTls(a);}
        op[57] = getOpcodeRnm(8, 58); // expandItem
        {int[] a = {59,63,64}; op[58] = getOpcodeCat(a);}
        op[59] = getOpcodeRep((char)0, (char)1, 60);
        {int[] a = {61,62}; op[60] = getOpcodeCat(a);}
        op[61] = getOpcodeRnm(140, 958); // qualifiedEntityTypeName
        {char[] a = {47}; op[62] = getOpcodeTls(a);}
        op[63] = getOpcodeRnm(154, 1021); // navigationProperty
        op[64] = getOpcodeRep((char)0, Character.MAX_VALUE, 65);
        {int[] a = {66,67,71}; op[65] = getOpcodeCat(a);}
        {char[] a = {47}; op[66] = getOpcodeTls(a);}
        op[67] = getOpcodeRep((char)0, (char)1, 68);
        {int[] a = {69,70}; op[68] = getOpcodeCat(a);}
        op[69] = getOpcodeRnm(140, 958); // qualifiedEntityTypeName
        {char[] a = {47}; op[70] = getOpcodeTls(a);}
        op[71] = getOpcodeRnm(154, 1021); // navigationProperty
        {int[] a = {73,74}; op[72] = getOpcodeCat(a);}
        {char[] a = {36,102,105,108,116,101,114,61}; op[73] = getOpcodeTls(a);}
        op[74] = getOpcodeRnm(225, 1417); // boolCommonExpr
        {int[] a = {76,77,78,85}; op[75] = getOpcodeCat(a);}
        {char[] a = {36,111,114,100,101,114,98,121,61}; op[76] = getOpcodeTls(a);}
        op[77] = getOpcodeRnm(224, 1403); // commonExpr
        op[78] = getOpcodeRep((char)0, (char)1, 79);
        {int[] a = {80,82}; op[79] = getOpcodeCat(a);}
        op[80] = getOpcodeRep((char)1, Character.MAX_VALUE, 81);
        op[81] = getOpcodeRnm(34, 245); // WSP
        {int[] a = {83,84}; op[82] = getOpcodeAlt(a);}
        {char[] a = {97,115,99}; op[83] = getOpcodeTls(a);}
        {char[] a = {100,101,115,99}; op[84] = getOpcodeTls(a);}
        op[85] = getOpcodeRep((char)0, Character.MAX_VALUE, 86);
        {int[] a = {87,88,89}; op[86] = getOpcodeCat(a);}
        op[87] = getOpcodeRnm(54, 435); // COMMA
        op[88] = getOpcodeRnm(224, 1403); // commonExpr
        op[89] = getOpcodeRep((char)0, (char)1, 90);
        {int[] a = {91,93}; op[90] = getOpcodeCat(a);}
        op[91] = getOpcodeRep((char)1, Character.MAX_VALUE, 92);
        op[92] = getOpcodeRnm(34, 245); // WSP
        {int[] a = {94,95}; op[93] = getOpcodeAlt(a);}
        {char[] a = {97,115,99}; op[94] = getOpcodeTls(a);}
        {char[] a = {100,101,115,99}; op[95] = getOpcodeTls(a);}
        {int[] a = {97,98}; op[96] = getOpcodeCat(a);}
        {char[] a = {36,115,107,105,112,61}; op[97] = getOpcodeTls(a);}
        op[98] = getOpcodeRep((char)1, Character.MAX_VALUE, 99);
        op[99] = getOpcodeRnm(29, 233); // DIGIT
        {int[] a = {101,102}; op[100] = getOpcodeCat(a);}
        {char[] a = {36,116,111,112,61}; op[101] = getOpcodeTls(a);}
        op[102] = getOpcodeRep((char)1, Character.MAX_VALUE, 103);
        op[103] = getOpcodeRnm(29, 233); // DIGIT
        {int[] a = {105,106}; op[104] = getOpcodeCat(a);}
        {char[] a = {36,102,111,114,109,97,116,61}; op[105] = getOpcodeTls(a);}
        {int[] a = {107,108,109,110}; op[106] = getOpcodeAlt(a);}
        {char[] a = {106,115,111,110}; op[107] = getOpcodeTls(a);}
        {char[] a = {97,116,111,109}; op[108] = getOpcodeTls(a);}
        {char[] a = {120,109,108}; op[109] = getOpcodeTls(a);}
        op[110] = getOpcodeRep((char)1, Character.MAX_VALUE, 111);
        {int[] a = {112,113}; op[111] = getOpcodeAlt(a);}
        op[112] = getOpcodeRnm(46, 401); // pchar
        {char[] a = {47}; op[113] = getOpcodeTls(a);}
        {int[] a = {115,116}; op[114] = getOpcodeCat(a);}
        {char[] a = {36,105,110,108,105,110,101,99,111,117,110,116,61}; op[115] = getOpcodeTls(a);}
        {int[] a = {117,118}; op[116] = getOpcodeAlt(a);}
        {char[] a = {97,108,108,112,97,103,101,115}; op[117] = getOpcodeTls(a);}
        {char[] a = {110,111,110,101}; op[118] = getOpcodeTls(a);}
        {int[] a = {120,121}; op[119] = getOpcodeCat(a);}
        {char[] a = {36,115,101,108,101,99,116,61}; op[120] = getOpcodeTls(a);}
        op[121] = getOpcodeRnm(16, 122); // selectClause
        {int[] a = {123,124}; op[122] = getOpcodeCat(a);}
        op[123] = getOpcodeRnm(17, 128); // selectItem
        op[124] = getOpcodeRep((char)0, Character.MAX_VALUE, 125);
        {int[] a = {126,127}; op[125] = getOpcodeCat(a);}
        op[126] = getOpcodeRnm(54, 435); // COMMA
        op[127] = getOpcodeRnm(17, 128); // selectItem
        {int[] a = {129,130,131}; op[128] = getOpcodeAlt(a);}
        op[129] = getOpcodeRnm(56, 439); // star
        op[130] = getOpcodeRnm(18, 153); // allOperationsInContainer
        {int[] a = {132,136}; op[131] = getOpcodeCat(a);}
        op[132] = getOpcodeRep((char)0, (char)1, 133);
        {int[] a = {134,135}; op[133] = getOpcodeCat(a);}
        op[134] = getOpcodeRnm(140, 958); // qualifiedEntityTypeName
        {char[] a = {47}; op[135] = getOpcodeTls(a);}
        {int[] a = {137,143,151,152}; op[136] = getOpcodeAlt(a);}
        {int[] a = {138,139}; op[137] = getOpcodeCat(a);}
        op[138] = getOpcodeRnm(154, 1021); // navigationProperty
        op[139] = getOpcodeRep((char)0, (char)1, 140);
        {int[] a = {141,142}; op[140] = getOpcodeCat(a);}
        {char[] a = {47}; op[141] = getOpcodeTls(a);}
        op[142] = getOpcodeRnm(17, 128); // selectItem
        {int[] a = {144,150}; op[143] = getOpcodeCat(a);}
        op[144] = getOpcodeRep((char)0, Character.MAX_VALUE, 145);
        {int[] a = {146,149}; op[145] = getOpcodeCat(a);}
        {int[] a = {147,148}; op[146] = getOpcodeAlt(a);}
        op[147] = getOpcodeRnm(151, 1018); // complexProperty
        op[148] = getOpcodeRnm(152, 1019); // complexColProperty
        {char[] a = {47}; op[149] = getOpcodeTls(a);}
        op[150] = getOpcodeRnm(146, 1006); // property
        op[151] = getOpcodeRnm(20, 163); // qualifiedActionName
        op[152] = getOpcodeRnm(21, 172); // qualifiedFunctionName
        {int[] a = {154,155}; op[153] = getOpcodeCat(a);}
        op[154] = getOpcodeRnm(19, 156); // operationQualifier
        op[155] = getOpcodeRnm(56, 439); // star
        {int[] a = {157,161,162}; op[156] = getOpcodeCat(a);}
        op[157] = getOpcodeRep((char)0, (char)1, 158);
        {int[] a = {159,160}; op[158] = getOpcodeCat(a);}
        op[159] = getOpcodeRnm(133, 934); // namespace
        {char[] a = {46}; op[160] = getOpcodeTls(a);}
        op[161] = getOpcodeRnm(157, 1026); // entityContainerName
        {char[] a = {46}; op[162] = getOpcodeTls(a);}
        {int[] a = {164,166,167}; op[163] = getOpcodeCat(a);}
        op[164] = getOpcodeRep((char)0, (char)1, 165);
        op[165] = getOpcodeRnm(19, 156); // operationQualifier
        op[166] = getOpcodeRnm(158, 1027); // action
        op[167] = getOpcodeRep((char)0, (char)1, 168);
        {int[] a = {169,170,171}; op[168] = getOpcodeCat(a);}
        {char[] a = {40}; op[169] = getOpcodeTls(a);}
        op[170] = getOpcodeRnm(22, 181); // parameterTypeNames
        {char[] a = {41}; op[171] = getOpcodeTls(a);}
        {int[] a = {173,175,176}; op[172] = getOpcodeCat(a);}
        op[173] = getOpcodeRep((char)0, (char)1, 174);
        op[174] = getOpcodeRnm(19, 156); // operationQualifier
        op[175] = getOpcodeRnm(159, 1028); // function
        op[176] = getOpcodeRep((char)0, (char)1, 177);
        {int[] a = {178,179,180}; op[177] = getOpcodeCat(a);}
        {char[] a = {40}; op[178] = getOpcodeTls(a);}
        op[179] = getOpcodeRnm(22, 181); // parameterTypeNames
        {char[] a = {41}; op[180] = getOpcodeTls(a);}
        op[181] = getOpcodeRep((char)0, (char)1, 182);
        {int[] a = {183,184}; op[182] = getOpcodeCat(a);}
        op[183] = getOpcodeRnm(23, 188); // parameterTypeName
        op[184] = getOpcodeRep((char)0, Character.MAX_VALUE, 185);
        {int[] a = {186,187}; op[185] = getOpcodeCat(a);}
        {char[] a = {44}; op[186] = getOpcodeTls(a);}
        op[187] = getOpcodeRnm(23, 188); // parameterTypeName
        op[188] = getOpcodeRnm(139, 945); // qualifiedTypeName
        {int[] a = {190,191}; op[189] = getOpcodeCat(a);}
        {char[] a = {36,115,107,105,112,116,111,107,101,110,61}; op[190] = getOpcodeTls(a);}
        op[191] = getOpcodeRep((char)1, Character.MAX_VALUE, 192);
        {int[] a = {193,194,195,196,197,198,199}; op[192] = getOpcodeAlt(a);}
        op[193] = getOpcodeRnm(48, 411); // unreserved
        op[194] = getOpcodeRnm(47, 407); // pct-encoded
        op[195] = getOpcodeRnm(50, 423); // other-delims
        {char[] a = {58}; op[196] = getOpcodeTls(a);}
        {char[] a = {64}; op[197] = getOpcodeTls(a);}
        {char[] a = {36}; op[198] = getOpcodeTls(a);}
        {char[] a = {61}; op[199] = getOpcodeTls(a);}
        {int[] a = {201,202}; op[200] = getOpcodeCat(a);}
        op[201] = getOpcodeRnm(26, 206); // customName
        op[202] = getOpcodeRep((char)0, (char)1, 203);
        {int[] a = {204,205}; op[203] = getOpcodeCat(a);}
        {char[] a = {61}; op[204] = getOpcodeTls(a);}
        op[205] = getOpcodeRnm(27, 221); // customValue
        {int[] a = {207,213}; op[206] = getOpcodeCat(a);}
        {int[] a = {208,209,210,211,212}; op[207] = getOpcodeAlt(a);}
        op[208] = getOpcodeRnm(48, 411); // unreserved
        op[209] = getOpcodeRnm(47, 407); // pct-encoded
        op[210] = getOpcodeRnm(50, 423); // other-delims
        {char[] a = {58}; op[211] = getOpcodeTls(a);}
        {char[] a = {64}; op[212] = getOpcodeTls(a);}
        op[213] = getOpcodeRep((char)0, Character.MAX_VALUE, 214);
        {int[] a = {215,216,217,218,219,220}; op[214] = getOpcodeAlt(a);}
        op[215] = getOpcodeRnm(48, 411); // unreserved
        op[216] = getOpcodeRnm(47, 407); // pct-encoded
        op[217] = getOpcodeRnm(50, 423); // other-delims
        {char[] a = {58}; op[218] = getOpcodeTls(a);}
        {char[] a = {64}; op[219] = getOpcodeTls(a);}
        {char[] a = {36}; op[220] = getOpcodeTls(a);}
        op[221] = getOpcodeRep((char)0, Character.MAX_VALUE, 222);
        {int[] a = {223,224,225,226,227,228,229}; op[222] = getOpcodeAlt(a);}
        op[223] = getOpcodeRnm(48, 411); // unreserved
        op[224] = getOpcodeRnm(47, 407); // pct-encoded
        op[225] = getOpcodeRnm(50, 423); // other-delims
        {char[] a = {58}; op[226] = getOpcodeTls(a);}
        {char[] a = {64}; op[227] = getOpcodeTls(a);}
        {char[] a = {36}; op[228] = getOpcodeTls(a);}
        {char[] a = {61}; op[229] = getOpcodeTls(a);}
        {int[] a = {231,232}; op[230] = getOpcodeAlt(a);}
        op[231] = getOpcodeTrg((char)65, (char)90);
        op[232] = getOpcodeTrg((char)97, (char)122);
        op[233] = getOpcodeTrg((char)48, (char)57);
        {int[] a = {235,236,237,238,239,240,241}; op[234] = getOpcodeAlt(a);}
        op[235] = getOpcodeRnm(29, 233); // DIGIT
        {char[] a = {65}; op[236] = getOpcodeTls(a);}
        {char[] a = {66}; op[237] = getOpcodeTls(a);}
        {char[] a = {67}; op[238] = getOpcodeTls(a);}
        {char[] a = {68}; op[239] = getOpcodeTls(a);}
        {char[] a = {69}; op[240] = getOpcodeTls(a);}
        {char[] a = {70}; op[241] = getOpcodeTls(a);}
        {char[] a = {34}; op[242] = getOpcodeTbs(a);}
        {char[] a = {32}; op[243] = getOpcodeTbs(a);}
        {char[] a = {9}; op[244] = getOpcodeTbs(a);}
        {int[] a = {246,247}; op[245] = getOpcodeAlt(a);}
        op[246] = getOpcodeRnm(32, 243); // SP
        op[247] = getOpcodeRnm(33, 244); // HTAB
        {int[] a = {249,250,251}; op[248] = getOpcodeAlt(a);}
        op[249] = getOpcodeRnm(37, 254); // IP-literal
        op[250] = getOpcodeRnm(42, 370); // IPv4address
        op[251] = getOpcodeRnm(44, 394); // reg-name
        op[252] = getOpcodeRep((char)0, Character.MAX_VALUE, 253);
        op[253] = getOpcodeRnm(29, 233); // DIGIT
        {int[] a = {255,256,259}; op[254] = getOpcodeCat(a);}
        {char[] a = {91}; op[255] = getOpcodeTls(a);}
        {int[] a = {257,258}; op[256] = getOpcodeAlt(a);}
        op[257] = getOpcodeRnm(39, 270); // IPv6address
        op[258] = getOpcodeRnm(38, 260); // IPvFuture
        {char[] a = {93}; op[259] = getOpcodeTls(a);}
        {int[] a = {261,262,264,265}; op[260] = getOpcodeCat(a);}
        {char[] a = {118}; op[261] = getOpcodeTls(a);}
        op[262] = getOpcodeRep((char)1, Character.MAX_VALUE, 263);
        op[263] = getOpcodeRnm(30, 234); // HEXDIG
        {char[] a = {46}; op[264] = getOpcodeTls(a);}
        op[265] = getOpcodeRep((char)1, Character.MAX_VALUE, 266);
        {int[] a = {267,268,269}; op[266] = getOpcodeAlt(a);}
        op[267] = getOpcodeRnm(48, 411); // unreserved
        op[268] = getOpcodeRnm(49, 418); // sub-delims
        {char[] a = {58}; op[269] = getOpcodeTls(a);}
        {int[] a = {271,277,284,293,307,321,333,343,353}; op[270] = getOpcodeAlt(a);}
        {int[] a = {272,276}; op[271] = getOpcodeCat(a);}
        op[272] = getOpcodeRep((char)6, (char)6, 273);
        {int[] a = {274,275}; op[273] = getOpcodeCat(a);}
        op[274] = getOpcodeRnm(40, 362); // h16
        {char[] a = {58}; op[275] = getOpcodeTls(a);}
        op[276] = getOpcodeRnm(41, 364); // ls32
        {int[] a = {278,279,283}; op[277] = getOpcodeCat(a);}
        {char[] a = {58,58}; op[278] = getOpcodeTls(a);}
        op[279] = getOpcodeRep((char)5, (char)5, 280);
        {int[] a = {281,282}; op[280] = getOpcodeCat(a);}
        op[281] = getOpcodeRnm(40, 362); // h16
        {char[] a = {58}; op[282] = getOpcodeTls(a);}
        op[283] = getOpcodeRnm(41, 364); // ls32
        {int[] a = {285,287,288,292}; op[284] = getOpcodeCat(a);}
        op[285] = getOpcodeRep((char)0, (char)1, 286);
        op[286] = getOpcodeRnm(40, 362); // h16
        {char[] a = {58,58}; op[287] = getOpcodeTls(a);}
        op[288] = getOpcodeRep((char)4, (char)4, 289);
        {int[] a = {290,291}; op[289] = getOpcodeCat(a);}
        op[290] = getOpcodeRnm(40, 362); // h16
        {char[] a = {58}; op[291] = getOpcodeTls(a);}
        op[292] = getOpcodeRnm(41, 364); // ls32
        {int[] a = {294,301,302,306}; op[293] = getOpcodeCat(a);}
        op[294] = getOpcodeRep((char)0, (char)1, 295);
        {int[] a = {296,300}; op[295] = getOpcodeCat(a);}
        op[296] = getOpcodeRep((char)0, (char)1, 297);
        {int[] a = {298,299}; op[297] = getOpcodeCat(a);}
        op[298] = getOpcodeRnm(40, 362); // h16
        {char[] a = {58}; op[299] = getOpcodeTls(a);}
        op[300] = getOpcodeRnm(40, 362); // h16
        {char[] a = {58,58}; op[301] = getOpcodeTls(a);}
        op[302] = getOpcodeRep((char)3, (char)3, 303);
        {int[] a = {304,305}; op[303] = getOpcodeCat(a);}
        op[304] = getOpcodeRnm(40, 362); // h16
        {char[] a = {58}; op[305] = getOpcodeTls(a);}
        op[306] = getOpcodeRnm(41, 364); // ls32
        {int[] a = {308,315,316,320}; op[307] = getOpcodeCat(a);}
        op[308] = getOpcodeRep((char)0, (char)1, 309);
        {int[] a = {310,314}; op[309] = getOpcodeCat(a);}
        op[310] = getOpcodeRep((char)0, (char)2, 311);
        {int[] a = {312,313}; op[311] = getOpcodeCat(a);}
        op[312] = getOpcodeRnm(40, 362); // h16
        {char[] a = {58}; op[313] = getOpcodeTls(a);}
        op[314] = getOpcodeRnm(40, 362); // h16
        {char[] a = {58,58}; op[315] = getOpcodeTls(a);}
        op[316] = getOpcodeRep((char)2, (char)2, 317);
        {int[] a = {318,319}; op[317] = getOpcodeCat(a);}
        op[318] = getOpcodeRnm(40, 362); // h16
        {char[] a = {58}; op[319] = getOpcodeTls(a);}
        op[320] = getOpcodeRnm(41, 364); // ls32
        {int[] a = {322,329,330,331,332}; op[321] = getOpcodeCat(a);}
        op[322] = getOpcodeRep((char)0, (char)1, 323);
        {int[] a = {324,328}; op[323] = getOpcodeCat(a);}
        op[324] = getOpcodeRep((char)0, (char)3, 325);
        {int[] a = {326,327}; op[325] = getOpcodeCat(a);}
        op[326] = getOpcodeRnm(40, 362); // h16
        {char[] a = {58}; op[327] = getOpcodeTls(a);}
        op[328] = getOpcodeRnm(40, 362); // h16
        {char[] a = {58,58}; op[329] = getOpcodeTls(a);}
        op[330] = getOpcodeRnm(40, 362); // h16
        {char[] a = {58}; op[331] = getOpcodeTls(a);}
        op[332] = getOpcodeRnm(41, 364); // ls32
        {int[] a = {334,341,342}; op[333] = getOpcodeCat(a);}
        op[334] = getOpcodeRep((char)0, (char)1, 335);
        {int[] a = {336,340}; op[335] = getOpcodeCat(a);}
        op[336] = getOpcodeRep((char)0, (char)4, 337);
        {int[] a = {338,339}; op[337] = getOpcodeCat(a);}
        op[338] = getOpcodeRnm(40, 362); // h16
        {char[] a = {58}; op[339] = getOpcodeTls(a);}
        op[340] = getOpcodeRnm(40, 362); // h16
        {char[] a = {58,58}; op[341] = getOpcodeTls(a);}
        op[342] = getOpcodeRnm(41, 364); // ls32
        {int[] a = {344,351,352}; op[343] = getOpcodeCat(a);}
        op[344] = getOpcodeRep((char)0, (char)1, 345);
        {int[] a = {346,350}; op[345] = getOpcodeCat(a);}
        op[346] = getOpcodeRep((char)0, (char)5, 347);
        {int[] a = {348,349}; op[347] = getOpcodeCat(a);}
        op[348] = getOpcodeRnm(40, 362); // h16
        {char[] a = {58}; op[349] = getOpcodeTls(a);}
        op[350] = getOpcodeRnm(40, 362); // h16
        {char[] a = {58,58}; op[351] = getOpcodeTls(a);}
        op[352] = getOpcodeRnm(40, 362); // h16
        {int[] a = {354,361}; op[353] = getOpcodeCat(a);}
        op[354] = getOpcodeRep((char)0, (char)1, 355);
        {int[] a = {356,360}; op[355] = getOpcodeCat(a);}
        op[356] = getOpcodeRep((char)0, (char)6, 357);
        {int[] a = {358,359}; op[357] = getOpcodeCat(a);}
        op[358] = getOpcodeRnm(40, 362); // h16
        {char[] a = {58}; op[359] = getOpcodeTls(a);}
        op[360] = getOpcodeRnm(40, 362); // h16
        {char[] a = {58,58}; op[361] = getOpcodeTls(a);}
        op[362] = getOpcodeRep((char)1, (char)4, 363);
        op[363] = getOpcodeRnm(30, 234); // HEXDIG
        {int[] a = {365,369}; op[364] = getOpcodeAlt(a);}
        {int[] a = {366,367,368}; op[365] = getOpcodeCat(a);}
        op[366] = getOpcodeRnm(40, 362); // h16
        {char[] a = {58}; op[367] = getOpcodeTls(a);}
        op[368] = getOpcodeRnm(40, 362); // h16
        op[369] = getOpcodeRnm(42, 370); // IPv4address
        {int[] a = {371,372,373,374,375,376,377}; op[370] = getOpcodeCat(a);}
        op[371] = getOpcodeRnm(43, 378); // dec-octet
        {char[] a = {46}; op[372] = getOpcodeTls(a);}
        op[373] = getOpcodeRnm(43, 378); // dec-octet
        {char[] a = {46}; op[374] = getOpcodeTls(a);}
        op[375] = getOpcodeRnm(43, 378); // dec-octet
        {char[] a = {46}; op[376] = getOpcodeTls(a);}
        op[377] = getOpcodeRnm(43, 378); // dec-octet
        {int[] a = {379,383,387,390,393}; op[378] = getOpcodeAlt(a);}
        {int[] a = {380,381}; op[379] = getOpcodeCat(a);}
        {char[] a = {49}; op[380] = getOpcodeTls(a);}
        op[381] = getOpcodeRep((char)2, (char)2, 382);
        op[382] = getOpcodeRnm(29, 233); // DIGIT
        {int[] a = {384,385,386}; op[383] = getOpcodeCat(a);}
        {char[] a = {50}; op[384] = getOpcodeTls(a);}
        op[385] = getOpcodeTrg((char)48, (char)52);
        op[386] = getOpcodeRnm(29, 233); // DIGIT
        {int[] a = {388,389}; op[387] = getOpcodeCat(a);}
        {char[] a = {50,53}; op[388] = getOpcodeTls(a);}
        op[389] = getOpcodeTrg((char)48, (char)53);
        {int[] a = {391,392}; op[390] = getOpcodeCat(a);}
        op[391] = getOpcodeTrg((char)49, (char)57);
        op[392] = getOpcodeRnm(29, 233); // DIGIT
        op[393] = getOpcodeRnm(29, 233); // DIGIT
        op[394] = getOpcodeRep((char)0, Character.MAX_VALUE, 395);
        {int[] a = {396,397,398}; op[395] = getOpcodeAlt(a);}
        op[396] = getOpcodeRnm(48, 411); // unreserved
        op[397] = getOpcodeRnm(47, 407); // pct-encoded
        op[398] = getOpcodeRnm(49, 418); // sub-delims
        op[399] = getOpcodeRep((char)1, Character.MAX_VALUE, 400);
        op[400] = getOpcodeRnm(46, 401); // pchar
        {int[] a = {402,403,404,405,406}; op[401] = getOpcodeAlt(a);}
        op[402] = getOpcodeRnm(48, 411); // unreserved
        op[403] = getOpcodeRnm(47, 407); // pct-encoded
        op[404] = getOpcodeRnm(49, 418); // sub-delims
        {char[] a = {58}; op[405] = getOpcodeTls(a);}
        {char[] a = {64}; op[406] = getOpcodeTls(a);}
        {int[] a = {408,409,410}; op[407] = getOpcodeCat(a);}
        {char[] a = {37}; op[408] = getOpcodeTls(a);}
        op[409] = getOpcodeRnm(30, 234); // HEXDIG
        op[410] = getOpcodeRnm(30, 234); // HEXDIG
        {int[] a = {412,413,414,415,416,417}; op[411] = getOpcodeAlt(a);}
        op[412] = getOpcodeRnm(28, 230); // ALPHA
        op[413] = getOpcodeRnm(29, 233); // DIGIT
        {char[] a = {45}; op[414] = getOpcodeTls(a);}
        {char[] a = {46}; op[415] = getOpcodeTls(a);}
        {char[] a = {95}; op[416] = getOpcodeTls(a);}
        {char[] a = {126}; op[417] = getOpcodeTls(a);}
        {int[] a = {419,420,421,422}; op[418] = getOpcodeAlt(a);}
        {char[] a = {38}; op[419] = getOpcodeTls(a);}
        {char[] a = {61}; op[420] = getOpcodeTls(a);}
        {char[] a = {36}; op[421] = getOpcodeTls(a);}
        op[422] = getOpcodeRnm(50, 423); // other-delims
        {int[] a = {424,425,426,427,428,429,430,431}; op[423] = getOpcodeAlt(a);}
        {char[] a = {33}; op[424] = getOpcodeTls(a);}
        {char[] a = {39}; op[425] = getOpcodeTls(a);}
        {char[] a = {40}; op[426] = getOpcodeTls(a);}
        {char[] a = {41}; op[427] = getOpcodeTls(a);}
        {char[] a = {42}; op[428] = getOpcodeTls(a);}
        {char[] a = {43}; op[429] = getOpcodeTls(a);}
        {char[] a = {44}; op[430] = getOpcodeTls(a);}
        {char[] a = {59}; op[431] = getOpcodeTls(a);}
        {char[] a = {39}; op[432] = getOpcodeTbs(a);}
        {char[] a = {61}; op[433] = getOpcodeTbs(a);}
        {char[] a = {59}; op[434] = getOpcodeTbs(a);}
        {char[] a = {44}; op[435] = getOpcodeTbs(a);}
        {int[] a = {437,438}; op[436] = getOpcodeAlt(a);}
        {char[] a = {43}; op[437] = getOpcodeTls(a);}
        {char[] a = {45}; op[438] = getOpcodeTls(a);}
        {char[] a = {42}; op[439] = getOpcodeTls(a);}
        {char[] a = {78,97,78}; op[440] = getOpcodeTbs(a);}
        {char[] a = {73,78,70}; op[441] = getOpcodeTbs(a);}
        {int[] a = {443,444}; op[442] = getOpcodeCat(a);}
        {char[] a = {45}; op[443] = getOpcodeTls(a);}
        op[444] = getOpcodeRnm(58, 441); // positiveInfinity
        {int[] a = {446,447,448}; op[445] = getOpcodeAlt(a);}
        op[446] = getOpcodeRnm(57, 440); // nan
        op[447] = getOpcodeRnm(59, 442); // negativeInfinity
        op[448] = getOpcodeRnm(58, 441); // positiveInfinity
        {int[] a = {450,451,452,453,454,455,456,457,458}; op[449] = getOpcodeAlt(a);}
        {char[] a = {49}; op[450] = getOpcodeTls(a);}
        {char[] a = {50}; op[451] = getOpcodeTls(a);}
        {char[] a = {51}; op[452] = getOpcodeTls(a);}
        {char[] a = {52}; op[453] = getOpcodeTls(a);}
        {char[] a = {53}; op[454] = getOpcodeTls(a);}
        {char[] a = {54}; op[455] = getOpcodeTls(a);}
        {char[] a = {55}; op[456] = getOpcodeTls(a);}
        {char[] a = {56}; op[457] = getOpcodeTls(a);}
        {char[] a = {57}; op[458] = getOpcodeTls(a);}
        {int[] a = {460,467}; op[459] = getOpcodeCat(a);}
        {int[] a = {461,462,463,464,465,466}; op[460] = getOpcodeAlt(a);}
        {char[] a = {48}; op[461] = getOpcodeTls(a);}
        {char[] a = {49}; op[462] = getOpcodeTls(a);}
        {char[] a = {50}; op[463] = getOpcodeTls(a);}
        {char[] a = {51}; op[464] = getOpcodeTls(a);}
        {char[] a = {52}; op[465] = getOpcodeTls(a);}
        {char[] a = {53}; op[466] = getOpcodeTls(a);}
        op[467] = getOpcodeRnm(29, 233); // DIGIT
        op[468] = getOpcodeRep((char)4, (char)4, 469);
        op[469] = getOpcodeRnm(29, 233); // DIGIT
        {int[] a = {471,474}; op[470] = getOpcodeAlt(a);}
        {int[] a = {472,473}; op[471] = getOpcodeCat(a);}
        {char[] a = {48}; op[472] = getOpcodeTls(a);}
        op[473] = getOpcodeRnm(61, 449); // oneToNine
        {int[] a = {475,476}; op[474] = getOpcodeCat(a);}
        {char[] a = {49}; op[475] = getOpcodeTls(a);}
        {int[] a = {477,478,479}; op[476] = getOpcodeAlt(a);}
        {char[] a = {48}; op[477] = getOpcodeTls(a);}
        {char[] a = {49}; op[478] = getOpcodeTls(a);}
        {char[] a = {50}; op[479] = getOpcodeTls(a);}
        {int[] a = {481,487}; op[480] = getOpcodeAlt(a);}
        {int[] a = {482,486}; op[481] = getOpcodeCat(a);}
        {int[] a = {483,484,485}; op[482] = getOpcodeAlt(a);}
        {char[] a = {48}; op[483] = getOpcodeTls(a);}
        {char[] a = {49}; op[484] = getOpcodeTls(a);}
        {char[] a = {50}; op[485] = getOpcodeTls(a);}
        op[486] = getOpcodeRnm(61, 449); // oneToNine
        {int[] a = {488,489}; op[487] = getOpcodeCat(a);}
        {char[] a = {51}; op[488] = getOpcodeTls(a);}
        {int[] a = {490,491}; op[489] = getOpcodeAlt(a);}
        {char[] a = {48}; op[490] = getOpcodeTls(a);}
        {char[] a = {49}; op[491] = getOpcodeTls(a);}
        {int[] a = {493,498}; op[492] = getOpcodeAlt(a);}
        {int[] a = {494,497}; op[493] = getOpcodeCat(a);}
        {int[] a = {495,496}; op[494] = getOpcodeAlt(a);}
        {char[] a = {48}; op[495] = getOpcodeTls(a);}
        {char[] a = {49}; op[496] = getOpcodeTls(a);}
        op[497] = getOpcodeRnm(29, 233); // DIGIT
        {int[] a = {499,500}; op[498] = getOpcodeCat(a);}
        {char[] a = {50}; op[499] = getOpcodeTls(a);}
        {int[] a = {501,502,503}; op[500] = getOpcodeAlt(a);}
        {char[] a = {49}; op[501] = getOpcodeTls(a);}
        {char[] a = {50}; op[502] = getOpcodeTls(a);}
        {char[] a = {51}; op[503] = getOpcodeTls(a);}
        op[504] = getOpcodeRnm(62, 459); // zeroToFiftyNine
        op[505] = getOpcodeRnm(62, 459); // zeroToFiftyNine
        op[506] = getOpcodeRep((char)1, Character.MAX_VALUE, 507);
        op[507] = getOpcodeRnm(29, 233); // DIGIT
        {int[] a = {509,510,511,512,513,514,515,516,517,518,519,520,521,522,523,524,525,526,527,528,529,530,531,532,533,534,535,536,537,538}; op[508] = getOpcodeAlt(a);}
        op[509] = getOpcodeRnm(71, 539); // null
        op[510] = getOpcodeRnm(78, 605); // decimal
        op[511] = getOpcodeRnm(82, 634); // single
        op[512] = getOpcodeRnm(80, 619); // double
        op[513] = getOpcodeRnm(86, 669); // sbyte
        op[514] = getOpcodeRnm(85, 667); // byte
        op[515] = getOpcodeRnm(87, 674); // int16
        op[516] = getOpcodeRnm(88, 679); // int32
        op[517] = getOpcodeRnm(89, 684); // int64
        op[518] = getOpcodeRnm(72, 546); // binary
        op[519] = getOpcodeRnm(74, 562); // dateTime
        op[520] = getOpcodeRnm(75, 567); // dateTimeOffset
        op[521] = getOpcodeRnm(84, 649); // guid
        op[522] = getOpcodeRnm(90, 691); // string
        op[523] = getOpcodeRnm(92, 702); // time
        op[524] = getOpcodeRnm(73, 555); // boolean
        op[525] = getOpcodeRnm(93, 747); // geographyCollection
        op[526] = getOpcodeRnm(97, 770); // geographyLineString
        op[527] = getOpcodeRnm(101, 788); // geographyMultiLineString
        op[528] = getOpcodeRnm(104, 805); // geographyMultiPoint
        op[529] = getOpcodeRnm(107, 822); // geographyMultiPolygon
        op[530] = getOpcodeRnm(110, 839); // geographyPoint
        op[531] = getOpcodeRnm(116, 863); // geographyPolygon
        op[532] = getOpcodeRnm(121, 889); // geometryCollection
        op[533] = getOpcodeRnm(122, 893); // geometryLineString
        op[534] = getOpcodeRnm(123, 897); // geometryMultiLineString
        op[535] = getOpcodeRnm(124, 901); // geometryMultiPoint
        op[536] = getOpcodeRnm(125, 905); // geometryMultiPolygon
        op[537] = getOpcodeRnm(126, 909); // geometryPoint
        op[538] = getOpcodeRnm(127, 913); // geometryPolygon
        {int[] a = {540,541}; op[539] = getOpcodeCat(a);}
        {char[] a = {110,117,108,108}; op[540] = getOpcodeTbs(a);}
        op[541] = getOpcodeRep((char)0, (char)1, 542);
        {int[] a = {543,544,545}; op[542] = getOpcodeCat(a);}
        {char[] a = {39}; op[543] = getOpcodeTls(a);}
        op[544] = getOpcodeRnm(139, 945); // qualifiedTypeName
        {char[] a = {39}; op[545] = getOpcodeTls(a);}
        {int[] a = {547,550,551,554}; op[546] = getOpcodeCat(a);}
        {int[] a = {548,549}; op[547] = getOpcodeAlt(a);}
        {char[] a = {88}; op[548] = getOpcodeTbs(a);}
        {char[] a = {98,105,110,97,114,121}; op[549] = getOpcodeTls(a);}
        op[550] = getOpcodeRnm(51, 432); // SQUOTE
        op[551] = getOpcodeRep((char)0, Character.MAX_VALUE, 552);
        op[552] = getOpcodeRep((char)2, (char)2, 553);
        op[553] = getOpcodeRnm(30, 234); // HEXDIG
        op[554] = getOpcodeRnm(51, 432); // SQUOTE
        {int[] a = {556,559}; op[555] = getOpcodeAlt(a);}
        {int[] a = {557,558}; op[556] = getOpcodeAlt(a);}
        {char[] a = {116,114,117,101}; op[557] = getOpcodeTls(a);}
        {char[] a = {49}; op[558] = getOpcodeTls(a);}
        {int[] a = {560,561}; op[559] = getOpcodeAlt(a);}
        {char[] a = {102,97,108,115,101}; op[560] = getOpcodeTls(a);}
        {char[] a = {48}; op[561] = getOpcodeTls(a);}
        {int[] a = {563,564,565,566}; op[562] = getOpcodeCat(a);}
        {char[] a = {100,97,116,101,116,105,109,101}; op[563] = getOpcodeTls(a);}
        op[564] = getOpcodeRnm(51, 432); // SQUOTE
        op[565] = getOpcodeRnm(76, 572); // dateTimeBody
        op[566] = getOpcodeRnm(51, 432); // SQUOTE
        {int[] a = {568,569,570,571}; op[567] = getOpcodeCat(a);}
        {char[] a = {100,97,116,101,116,105,109,101,111,102,102,115,101,116}; op[568] = getOpcodeTls(a);}
        op[569] = getOpcodeRnm(51, 432); // SQUOTE
        op[570] = getOpcodeRnm(77, 596); // dateTimeOffsetBody
        op[571] = getOpcodeRnm(51, 432); // SQUOTE
        {int[] a = {573,574,575,576,577,578,579}; op[572] = getOpcodeCat(a);}
        op[573] = getOpcodeRnm(63, 468); // year
        {char[] a = {45}; op[574] = getOpcodeTls(a);}
        op[575] = getOpcodeRnm(64, 470); // month
        {char[] a = {45}; op[576] = getOpcodeTls(a);}
        op[577] = getOpcodeRnm(65, 480); // day
        {char[] a = {84}; op[578] = getOpcodeTls(a);}
        {int[] a = {580,592}; op[579] = getOpcodeAlt(a);}
        {int[] a = {581,582,583,584}; op[580] = getOpcodeCat(a);}
        op[581] = getOpcodeRnm(66, 492); // hour
        {char[] a = {58}; op[582] = getOpcodeTls(a);}
        op[583] = getOpcodeRnm(67, 504); // minute
        op[584] = getOpcodeRep((char)0, (char)1, 585);
        {int[] a = {586,587,588}; op[585] = getOpcodeCat(a);}
        {char[] a = {58}; op[586] = getOpcodeTls(a);}
        op[587] = getOpcodeRnm(68, 505); // second
        op[588] = getOpcodeRep((char)0, (char)1, 589);
        {int[] a = {590,591}; op[589] = getOpcodeCat(a);}
        {char[] a = {46}; op[590] = getOpcodeTls(a);}
        op[591] = getOpcodeRnm(69, 506); // fractionalSeconds
        {int[] a = {593,594}; op[592] = getOpcodeCat(a);}
        {char[] a = {50,52,58,48,48}; op[593] = getOpcodeTls(a);}
        op[594] = getOpcodeRep((char)0, (char)1, 595);
        {char[] a = {58,48,48}; op[595] = getOpcodeTls(a);}
        {int[] a = {597,598}; op[596] = getOpcodeCat(a);}
        op[597] = getOpcodeRnm(76, 572); // dateTimeBody
        {int[] a = {599,600}; op[598] = getOpcodeAlt(a);}
        {char[] a = {90}; op[599] = getOpcodeTls(a);}
        {int[] a = {601,602,603,604}; op[600] = getOpcodeCat(a);}
        op[601] = getOpcodeRnm(55, 436); // sign
        op[602] = getOpcodeRnm(66, 492); // hour
        {char[] a = {58}; op[603] = getOpcodeTls(a);}
        op[604] = getOpcodeRnm(67, 504); // minute
        {int[] a = {606,607}; op[605] = getOpcodeCat(a);}
        op[606] = getOpcodeRnm(79, 609); // decimalBody
        op[607] = getOpcodeRep((char)0, (char)1, 608);
        {char[] a = {77}; op[608] = getOpcodeTls(a);}
        {int[] a = {610,612,614}; op[609] = getOpcodeCat(a);}
        op[610] = getOpcodeRep((char)0, (char)1, 611);
        op[611] = getOpcodeRnm(55, 436); // sign
        op[612] = getOpcodeRep((char)1, Character.MAX_VALUE, 613);
        op[613] = getOpcodeRnm(29, 233); // DIGIT
        op[614] = getOpcodeRep((char)0, (char)1, 615);
        {int[] a = {616,617}; op[615] = getOpcodeCat(a);}
        {char[] a = {46}; op[616] = getOpcodeTls(a);}
        op[617] = getOpcodeRep((char)1, Character.MAX_VALUE, 618);
        op[618] = getOpcodeRnm(29, 233); // DIGIT
        {int[] a = {620,621}; op[619] = getOpcodeCat(a);}
        op[620] = getOpcodeRnm(81, 623); // doubleBody
        op[621] = getOpcodeRep((char)0, (char)1, 622);
        {char[] a = {68}; op[622] = getOpcodeTls(a);}
        {int[] a = {624,633}; op[623] = getOpcodeAlt(a);}
        {int[] a = {625,626}; op[624] = getOpcodeCat(a);}
        op[625] = getOpcodeRnm(79, 609); // decimalBody
        op[626] = getOpcodeRep((char)0, (char)1, 627);
        {int[] a = {628,629,631}; op[627] = getOpcodeCat(a);}
        {char[] a = {69}; op[628] = getOpcodeTls(a);}
        op[629] = getOpcodeRep((char)0, (char)1, 630);
        op[630] = getOpcodeRnm(55, 436); // sign
        op[631] = getOpcodeRep((char)1, Character.MAX_VALUE, 632);
        op[632] = getOpcodeRnm(29, 233); // DIGIT
        op[633] = getOpcodeRnm(60, 445); // nanInfinity
        {int[] a = {635,636}; op[634] = getOpcodeCat(a);}
        op[635] = getOpcodeRnm(83, 638); // singleBody
        op[636] = getOpcodeRep((char)0, (char)1, 637);
        {char[] a = {70}; op[637] = getOpcodeTls(a);}
        {int[] a = {639,648}; op[638] = getOpcodeAlt(a);}
        {int[] a = {640,641}; op[639] = getOpcodeCat(a);}
        op[640] = getOpcodeRnm(79, 609); // decimalBody
        op[641] = getOpcodeRep((char)0, (char)1, 642);
        {int[] a = {643,644,646}; op[642] = getOpcodeCat(a);}
        {char[] a = {69}; op[643] = getOpcodeTls(a);}
        op[644] = getOpcodeRep((char)0, (char)1, 645);
        op[645] = getOpcodeRnm(55, 436); // sign
        op[646] = getOpcodeRep((char)1, Character.MAX_VALUE, 647);
        op[647] = getOpcodeRnm(29, 233); // DIGIT
        op[648] = getOpcodeRnm(60, 445); // nanInfinity
        {int[] a = {650,651,652,654,655,657,658,660,661,663,664,666}; op[649] = getOpcodeCat(a);}
        {char[] a = {103,117,105,100}; op[650] = getOpcodeTls(a);}
        op[651] = getOpcodeRnm(51, 432); // SQUOTE
        op[652] = getOpcodeRep((char)8, (char)8, 653);
        op[653] = getOpcodeRnm(30, 234); // HEXDIG
        {char[] a = {45}; op[654] = getOpcodeTls(a);}
        op[655] = getOpcodeRep((char)4, (char)4, 656);
        op[656] = getOpcodeRnm(30, 234); // HEXDIG
        {char[] a = {45}; op[657] = getOpcodeTls(a);}
        op[658] = getOpcodeRep((char)4, (char)4, 659);
        op[659] = getOpcodeRnm(30, 234); // HEXDIG
        {char[] a = {45}; op[660] = getOpcodeTls(a);}
        op[661] = getOpcodeRep((char)4, (char)4, 662);
        op[662] = getOpcodeRnm(30, 234); // HEXDIG
        {char[] a = {45}; op[663] = getOpcodeTls(a);}
        op[664] = getOpcodeRep((char)12, (char)12, 665);
        op[665] = getOpcodeRnm(30, 234); // HEXDIG
        op[666] = getOpcodeRnm(51, 432); // SQUOTE
        op[667] = getOpcodeRep((char)1, (char)3, 668);
        op[668] = getOpcodeRnm(29, 233); // DIGIT
        {int[] a = {670,672}; op[669] = getOpcodeCat(a);}
        op[670] = getOpcodeRep((char)0, (char)1, 671);
        op[671] = getOpcodeRnm(55, 436); // sign
        op[672] = getOpcodeRep((char)1, (char)3, 673);
        op[673] = getOpcodeRnm(29, 233); // DIGIT
        {int[] a = {675,677}; op[674] = getOpcodeCat(a);}
        op[675] = getOpcodeRep((char)0, (char)1, 676);
        op[676] = getOpcodeRnm(55, 436); // sign
        op[677] = getOpcodeRep((char)1, (char)5, 678);
        op[678] = getOpcodeRnm(29, 233); // DIGIT
        {int[] a = {680,682}; op[679] = getOpcodeCat(a);}
        op[680] = getOpcodeRep((char)0, (char)1, 681);
        op[681] = getOpcodeRnm(55, 436); // sign
        op[682] = getOpcodeRep((char)1, (char)10, 683);
        op[683] = getOpcodeRnm(29, 233); // DIGIT
        {int[] a = {685,687,689}; op[684] = getOpcodeCat(a);}
        op[685] = getOpcodeRep((char)0, (char)1, 686);
        op[686] = getOpcodeRnm(55, 436); // sign
        op[687] = getOpcodeRep((char)1, (char)19, 688);
        op[688] = getOpcodeRnm(29, 233); // DIGIT
        op[689] = getOpcodeRep((char)0, (char)1, 690);
        {char[] a = {76}; op[690] = getOpcodeTls(a);}
        {int[] a = {692,693,698}; op[691] = getOpcodeCat(a);}
        op[692] = getOpcodeRnm(51, 432); // SQUOTE
        op[693] = getOpcodeRep((char)0, Character.MAX_VALUE, 694);
        {int[] a = {695,696,697}; op[694] = getOpcodeAlt(a);}
        op[695] = getOpcodeRnm(48, 411); // unreserved
        op[696] = getOpcodeRnm(47, 407); // pct-encoded
        op[697] = getOpcodeRnm(91, 699); // SQUOTE-in-string
        op[698] = getOpcodeRnm(51, 432); // SQUOTE
        {int[] a = {700,701}; op[699] = getOpcodeCat(a);}
        op[700] = getOpcodeRnm(51, 432); // SQUOTE
        op[701] = getOpcodeRnm(51, 432); // SQUOTE
        {int[] a = {703,704,705,707,708,713,718,723,746}; op[702] = getOpcodeCat(a);}
        {char[] a = {116,105,109,101}; op[703] = getOpcodeTls(a);}
        op[704] = getOpcodeRnm(51, 432); // SQUOTE
        op[705] = getOpcodeRep((char)0, (char)1, 706);
        op[706] = getOpcodeRnm(55, 436); // sign
        {char[] a = {80}; op[707] = getOpcodeTls(a);}
        op[708] = getOpcodeRep((char)0, (char)1, 709);
        {int[] a = {710,712}; op[709] = getOpcodeCat(a);}
        op[710] = getOpcodeRep((char)1, Character.MAX_VALUE, 711);
        op[711] = getOpcodeRnm(29, 233); // DIGIT
        {char[] a = {89}; op[712] = getOpcodeTls(a);}
        op[713] = getOpcodeRep((char)0, (char)1, 714);
        {int[] a = {715,717}; op[714] = getOpcodeCat(a);}
        op[715] = getOpcodeRep((char)1, Character.MAX_VALUE, 716);
        op[716] = getOpcodeRnm(29, 233); // DIGIT
        {char[] a = {77}; op[717] = getOpcodeTls(a);}
        op[718] = getOpcodeRep((char)0, (char)1, 719);
        {int[] a = {720,722}; op[719] = getOpcodeCat(a);}
        op[720] = getOpcodeRep((char)1, Character.MAX_VALUE, 721);
        op[721] = getOpcodeRnm(29, 233); // DIGIT
        {char[] a = {68}; op[722] = getOpcodeTls(a);}
        op[723] = getOpcodeRep((char)0, (char)1, 724);
        {int[] a = {725,726,731,736}; op[724] = getOpcodeCat(a);}
        {char[] a = {84}; op[725] = getOpcodeTls(a);}
        op[726] = getOpcodeRep((char)0, (char)1, 727);
        {int[] a = {728,730}; op[727] = getOpcodeCat(a);}
        op[728] = getOpcodeRep((char)1, Character.MAX_VALUE, 729);
        op[729] = getOpcodeRnm(29, 233); // DIGIT
        {char[] a = {72}; op[730] = getOpcodeTls(a);}
        op[731] = getOpcodeRep((char)0, (char)1, 732);
        {int[] a = {733,735}; op[732] = getOpcodeCat(a);}
        op[733] = getOpcodeRep((char)1, Character.MAX_VALUE, 734);
        op[734] = getOpcodeRnm(29, 233); // DIGIT
        {char[] a = {77}; op[735] = getOpcodeTls(a);}
        op[736] = getOpcodeRep((char)0, (char)1, 737);
        {int[] a = {738,740,745}; op[737] = getOpcodeCat(a);}
        op[738] = getOpcodeRep((char)1, Character.MAX_VALUE, 739);
        op[739] = getOpcodeRnm(29, 233); // DIGIT
        op[740] = getOpcodeRep((char)0, (char)1, 741);
        {int[] a = {742,743}; op[741] = getOpcodeCat(a);}
        {char[] a = {46}; op[742] = getOpcodeTls(a);}
        op[743] = getOpcodeRep((char)1, Character.MAX_VALUE, 744);
        op[744] = getOpcodeRnm(29, 233); // DIGIT
        {char[] a = {83}; op[745] = getOpcodeTls(a);}
        op[746] = getOpcodeRnm(51, 432); // SQUOTE
        {int[] a = {748,749,750}; op[747] = getOpcodeCat(a);}
        op[748] = getOpcodeRnm(128, 917); // geographyPrefix
        op[749] = getOpcodeRnm(94, 751); // fullCollectionLiteral
        op[750] = getOpcodeRnm(51, 432); // SQUOTE
        {int[] a = {752,753}; op[751] = getOpcodeCat(a);}
        op[752] = getOpcodeRnm(112, 846); // sridLiteral
        op[753] = getOpcodeRnm(95, 754); // collectionLiteral
        {int[] a = {755,756,757,761}; op[754] = getOpcodeCat(a);}
        {char[] a = {67,111,108,108,101,99,116,105,111,110,40}; op[755] = getOpcodeTls(a);}
        op[756] = getOpcodeRnm(96, 762); // geoLiteral
        op[757] = getOpcodeRep((char)0, Character.MAX_VALUE, 758);
        {int[] a = {759,760}; op[758] = getOpcodeCat(a);}
        op[759] = getOpcodeRnm(54, 435); // COMMA
        op[760] = getOpcodeRnm(96, 762); // geoLiteral
        {char[] a = {41}; op[761] = getOpcodeTls(a);}
        {int[] a = {763,764,765,766,767,768,769}; op[762] = getOpcodeAlt(a);}
        op[763] = getOpcodeRnm(95, 754); // collectionLiteral
        op[764] = getOpcodeRnm(99, 777); // lineStringLiteral
        op[765] = getOpcodeRnm(106, 812); // multiPointLiteral
        op[766] = getOpcodeRnm(103, 795); // multiLineStringLiteral
        op[767] = getOpcodeRnm(109, 829); // multiPolygonLiteral
        op[768] = getOpcodeRnm(113, 852); // pointLiteral
        op[769] = getOpcodeRnm(118, 870); // polygonLiteral
        {int[] a = {771,772,773}; op[770] = getOpcodeCat(a);}
        op[771] = getOpcodeRnm(128, 917); // geographyPrefix
        op[772] = getOpcodeRnm(98, 774); // fullLineStringLiteral
        op[773] = getOpcodeRnm(51, 432); // SQUOTE
        {int[] a = {775,776}; op[774] = getOpcodeCat(a);}
        op[775] = getOpcodeRnm(112, 846); // sridLiteral
        op[776] = getOpcodeRnm(99, 777); // lineStringLiteral
        {int[] a = {778,779}; op[777] = getOpcodeCat(a);}
        {char[] a = {76,105,110,101,83,116,114,105,110,103}; op[778] = getOpcodeTls(a);}
        op[779] = getOpcodeRnm(100, 780); // lineStringData
        {int[] a = {781,782,783,787}; op[780] = getOpcodeCat(a);}
        {char[] a = {40}; op[781] = getOpcodeTls(a);}
        op[782] = getOpcodeRnm(115, 859); // positionLiteral
        op[783] = getOpcodeRep((char)1, Character.MAX_VALUE, 784);
        {int[] a = {785,786}; op[784] = getOpcodeCat(a);}
        op[785] = getOpcodeRnm(54, 435); // COMMA
        op[786] = getOpcodeRnm(115, 859); // positionLiteral
        {char[] a = {41}; op[787] = getOpcodeTls(a);}
        {int[] a = {789,790,791}; op[788] = getOpcodeCat(a);}
        op[789] = getOpcodeRnm(128, 917); // geographyPrefix
        op[790] = getOpcodeRnm(102, 792); // fullMultiLineStringLiteral
        op[791] = getOpcodeRnm(51, 432); // SQUOTE
        {int[] a = {793,794}; op[792] = getOpcodeCat(a);}
        op[793] = getOpcodeRnm(112, 846); // sridLiteral
        op[794] = getOpcodeRnm(103, 795); // multiLineStringLiteral
        {int[] a = {796,797,804}; op[795] = getOpcodeCat(a);}
        {char[] a = {77,117,108,116,105,76,105,110,101,83,116,114,105,110,103,40}; op[796] = getOpcodeTls(a);}
        op[797] = getOpcodeRep((char)0, (char)1, 798);
        {int[] a = {799,800}; op[798] = getOpcodeCat(a);}
        op[799] = getOpcodeRnm(100, 780); // lineStringData
        op[800] = getOpcodeRep((char)0, Character.MAX_VALUE, 801);
        {int[] a = {802,803}; op[801] = getOpcodeCat(a);}
        op[802] = getOpcodeRnm(54, 435); // COMMA
        op[803] = getOpcodeRnm(100, 780); // lineStringData
        {char[] a = {41}; op[804] = getOpcodeTls(a);}
        {int[] a = {806,807,808}; op[805] = getOpcodeCat(a);}
        op[806] = getOpcodeRnm(128, 917); // geographyPrefix
        op[807] = getOpcodeRnm(105, 809); // fullMultiPointLiteral
        op[808] = getOpcodeRnm(51, 432); // SQUOTE
        {int[] a = {810,811}; op[809] = getOpcodeCat(a);}
        op[810] = getOpcodeRnm(112, 846); // sridLiteral
        op[811] = getOpcodeRnm(106, 812); // multiPointLiteral
        {int[] a = {813,814,821}; op[812] = getOpcodeCat(a);}
        {char[] a = {77,117,108,116,105,80,111,105,110,116,40}; op[813] = getOpcodeTls(a);}
        op[814] = getOpcodeRep((char)0, (char)1, 815);
        {int[] a = {816,817}; op[815] = getOpcodeCat(a);}
        op[816] = getOpcodeRnm(114, 855); // pointData
        op[817] = getOpcodeRep((char)0, Character.MAX_VALUE, 818);
        {int[] a = {819,820}; op[818] = getOpcodeCat(a);}
        op[819] = getOpcodeRnm(54, 435); // COMMA
        op[820] = getOpcodeRnm(114, 855); // pointData
        {char[] a = {41}; op[821] = getOpcodeTls(a);}
        {int[] a = {823,824,825}; op[822] = getOpcodeCat(a);}
        op[823] = getOpcodeRnm(128, 917); // geographyPrefix
        op[824] = getOpcodeRnm(108, 826); // fullMultiPolygonLiteral
        op[825] = getOpcodeRnm(51, 432); // SQUOTE
        {int[] a = {827,828}; op[826] = getOpcodeCat(a);}
        op[827] = getOpcodeRnm(112, 846); // sridLiteral
        op[828] = getOpcodeRnm(109, 829); // multiPolygonLiteral
        {int[] a = {830,831,838}; op[829] = getOpcodeCat(a);}
        {char[] a = {77,117,108,116,105,80,111,108,121,103,111,110,40}; op[830] = getOpcodeTls(a);}
        op[831] = getOpcodeRep((char)0, (char)1, 832);
        {int[] a = {833,834}; op[832] = getOpcodeCat(a);}
        op[833] = getOpcodeRnm(119, 873); // polygonData
        op[834] = getOpcodeRep((char)0, Character.MAX_VALUE, 835);
        {int[] a = {836,837}; op[835] = getOpcodeCat(a);}
        op[836] = getOpcodeRnm(54, 435); // COMMA
        op[837] = getOpcodeRnm(119, 873); // polygonData
        {char[] a = {41}; op[838] = getOpcodeTls(a);}
        {int[] a = {840,841,842}; op[839] = getOpcodeCat(a);}
        op[840] = getOpcodeRnm(128, 917); // geographyPrefix
        op[841] = getOpcodeRnm(111, 843); // fullPointLiteral
        op[842] = getOpcodeRnm(51, 432); // SQUOTE
        {int[] a = {844,845}; op[843] = getOpcodeCat(a);}
        op[844] = getOpcodeRnm(112, 846); // sridLiteral
        op[845] = getOpcodeRnm(113, 852); // pointLiteral
        {int[] a = {847,848,849,851}; op[846] = getOpcodeCat(a);}
        {char[] a = {83,82,73,68}; op[847] = getOpcodeTls(a);}
        op[848] = getOpcodeRnm(52, 433); // EQ
        op[849] = getOpcodeRep((char)1, (char)5, 850);
        op[850] = getOpcodeRnm(29, 233); // DIGIT
        op[851] = getOpcodeRnm(53, 434); // SEMI
        {int[] a = {853,854}; op[852] = getOpcodeCat(a);}
        {char[] a = {80,111,105,110,116}; op[853] = getOpcodeTls(a);}
        op[854] = getOpcodeRnm(114, 855); // pointData
        {int[] a = {856,857,858}; op[855] = getOpcodeCat(a);}
        {char[] a = {40}; op[856] = getOpcodeTls(a);}
        op[857] = getOpcodeRnm(115, 859); // positionLiteral
        {char[] a = {41}; op[858] = getOpcodeTls(a);}
        {int[] a = {860,861,862}; op[859] = getOpcodeCat(a);}
        op[860] = getOpcodeRnm(80, 619); // double
        op[861] = getOpcodeRnm(32, 243); // SP
        op[862] = getOpcodeRnm(80, 619); // double
        {int[] a = {864,865,866}; op[863] = getOpcodeCat(a);}
        op[864] = getOpcodeRnm(128, 917); // geographyPrefix
        op[865] = getOpcodeRnm(117, 867); // fullPolygonLiteral
        op[866] = getOpcodeRnm(51, 432); // SQUOTE
        {int[] a = {868,869}; op[867] = getOpcodeCat(a);}
        op[868] = getOpcodeRnm(112, 846); // sridLiteral
        op[869] = getOpcodeRnm(118, 870); // polygonLiteral
        {int[] a = {871,872}; op[870] = getOpcodeCat(a);}
        {char[] a = {80,111,108,121,103,111,110}; op[871] = getOpcodeTls(a);}
        op[872] = getOpcodeRnm(119, 873); // polygonData
        {int[] a = {874,875,876,880}; op[873] = getOpcodeCat(a);}
        {char[] a = {40}; op[874] = getOpcodeTls(a);}
        op[875] = getOpcodeRnm(120, 881); // ringLiteral
        op[876] = getOpcodeRep((char)0, Character.MAX_VALUE, 877);
        {int[] a = {878,879}; op[877] = getOpcodeCat(a);}
        op[878] = getOpcodeRnm(54, 435); // COMMA
        op[879] = getOpcodeRnm(120, 881); // ringLiteral
        {char[] a = {41}; op[880] = getOpcodeTls(a);}
        {int[] a = {882,883,884,888}; op[881] = getOpcodeCat(a);}
        {char[] a = {40}; op[882] = getOpcodeTls(a);}
        op[883] = getOpcodeRnm(115, 859); // positionLiteral
        op[884] = getOpcodeRep((char)0, Character.MAX_VALUE, 885);
        {int[] a = {886,887}; op[885] = getOpcodeCat(a);}
        op[886] = getOpcodeRnm(54, 435); // COMMA
        op[887] = getOpcodeRnm(115, 859); // positionLiteral
        {char[] a = {41}; op[888] = getOpcodeTls(a);}
        {int[] a = {890,891,892}; op[889] = getOpcodeCat(a);}
        op[890] = getOpcodeRnm(129, 920); // geometryPrefix
        op[891] = getOpcodeRnm(94, 751); // fullCollectionLiteral
        op[892] = getOpcodeRnm(51, 432); // SQUOTE
        {int[] a = {894,895,896}; op[893] = getOpcodeCat(a);}
        op[894] = getOpcodeRnm(129, 920); // geometryPrefix
        op[895] = getOpcodeRnm(98, 774); // fullLineStringLiteral
        op[896] = getOpcodeRnm(51, 432); // SQUOTE
        {int[] a = {898,899,900}; op[897] = getOpcodeCat(a);}
        op[898] = getOpcodeRnm(129, 920); // geometryPrefix
        op[899] = getOpcodeRnm(102, 792); // fullMultiLineStringLiteral
        op[900] = getOpcodeRnm(51, 432); // SQUOTE
        {int[] a = {902,903,904}; op[901] = getOpcodeCat(a);}
        op[902] = getOpcodeRnm(129, 920); // geometryPrefix
        op[903] = getOpcodeRnm(105, 809); // fullMultiPointLiteral
        op[904] = getOpcodeRnm(51, 432); // SQUOTE
        {int[] a = {906,907,908}; op[905] = getOpcodeCat(a);}
        op[906] = getOpcodeRnm(129, 920); // geometryPrefix
        op[907] = getOpcodeRnm(108, 826); // fullMultiPolygonLiteral
        op[908] = getOpcodeRnm(51, 432); // SQUOTE
        {int[] a = {910,911,912}; op[909] = getOpcodeCat(a);}
        op[910] = getOpcodeRnm(129, 920); // geometryPrefix
        op[911] = getOpcodeRnm(111, 843); // fullPointLiteral
        op[912] = getOpcodeRnm(51, 432); // SQUOTE
        {int[] a = {914,915,916}; op[913] = getOpcodeCat(a);}
        op[914] = getOpcodeRnm(129, 920); // geometryPrefix
        op[915] = getOpcodeRnm(117, 867); // fullPolygonLiteral
        op[916] = getOpcodeRnm(51, 432); // SQUOTE
        {int[] a = {918,919}; op[917] = getOpcodeCat(a);}
        {char[] a = {103,101,111,103,114,97,112,104,121}; op[918] = getOpcodeTls(a);}
        op[919] = getOpcodeRnm(51, 432); // SQUOTE
        {int[] a = {921,922}; op[920] = getOpcodeCat(a);}
        {char[] a = {103,101,111,109,101,116,114,121}; op[921] = getOpcodeTls(a);}
        op[922] = getOpcodeRnm(51, 432); // SQUOTE
        {int[] a = {924,925}; op[923] = getOpcodeCat(a);}
        op[924] = getOpcodeRnm(131, 927); // identifierLeadingCharacter
        op[925] = getOpcodeRep((char)0, (char)478, 926);
        op[926] = getOpcodeRnm(132, 930); // identifierCharacter
        {int[] a = {928,929}; op[927] = getOpcodeAlt(a);}
        op[928] = getOpcodeRnm(28, 230); // ALPHA
        {char[] a = {95}; op[929] = getOpcodeTls(a);}
        {int[] a = {931,932,933}; op[930] = getOpcodeAlt(a);}
        op[931] = getOpcodeRnm(28, 230); // ALPHA
        op[932] = getOpcodeRnm(29, 233); // DIGIT
        {char[] a = {95}; op[933] = getOpcodeTls(a);}
        {int[] a = {935,936}; op[934] = getOpcodeCat(a);}
        op[935] = getOpcodeRnm(134, 940); // namespacePart
        op[936] = getOpcodeRep((char)0, Character.MAX_VALUE, 937);
        {int[] a = {938,939}; op[937] = getOpcodeCat(a);}
        {char[] a = {46}; op[938] = getOpcodeTls(a);}
        op[939] = getOpcodeRnm(134, 940); // namespacePart
        op[940] = getOpcodeRnm(130, 923); // odataIdentifier
        op[941] = getOpcodeRnm(130, 923); // odataIdentifier
        op[942] = getOpcodeRnm(130, 923); // odataIdentifier
        op[943] = getOpcodeRnm(130, 923); // odataIdentifier
        op[944] = getOpcodeRnm(130, 923); // odataIdentifier
        {int[] a = {946,947,948,949,950}; op[945] = getOpcodeAlt(a);}
        op[946] = getOpcodeRnm(140, 958); // qualifiedEntityTypeName
        op[947] = getOpcodeRnm(141, 962); // qualifiedComplexTypeName
        op[948] = getOpcodeRnm(142, 966); // qualifiedEnumerationTypeName
        op[949] = getOpcodeRnm(143, 970); // primitiveTypeName
        {int[] a = {951,952,957}; op[950] = getOpcodeCat(a);}
        {char[] a = {99,111,108,108,101,99,116,105,111,110,40}; op[951] = getOpcodeTls(a);}
        {int[] a = {953,954,955,956}; op[952] = getOpcodeAlt(a);}
        op[953] = getOpcodeRnm(140, 958); // qualifiedEntityTypeName
        op[954] = getOpcodeRnm(141, 962); // qualifiedComplexTypeName
        op[955] = getOpcodeRnm(142, 966); // qualifiedEnumerationTypeName
        op[956] = getOpcodeRnm(143, 970); // primitiveTypeName
        {char[] a = {41}; op[957] = getOpcodeTls(a);}
        {int[] a = {959,960,961}; op[958] = getOpcodeCat(a);}
        op[959] = getOpcodeRnm(133, 934); // namespace
        {char[] a = {46}; op[960] = getOpcodeTls(a);}
        op[961] = getOpcodeRnm(136, 942); // entityTypeName
        {int[] a = {963,964,965}; op[962] = getOpcodeCat(a);}
        op[963] = getOpcodeRnm(133, 934); // namespace
        {char[] a = {46}; op[964] = getOpcodeTls(a);}
        op[965] = getOpcodeRnm(137, 943); // complexTypeName
        {int[] a = {967,968,969}; op[966] = getOpcodeCat(a);}
        op[967] = getOpcodeRnm(133, 934); // namespace
        {char[] a = {46}; op[968] = getOpcodeTls(a);}
        op[969] = getOpcodeRnm(138, 944); // enumerationTypeName
        {int[] a = {971,973}; op[970] = getOpcodeCat(a);}
        op[971] = getOpcodeRep((char)0, (char)1, 972);
        {char[] a = {101,100,109,46}; op[972] = getOpcodeTls(a);}
        {int[] a = {974,975,976,977,978,979,980,981,982,983,984,985,986,987,988,989,990,991}; op[973] = getOpcodeAlt(a);}
        {char[] a = {98,105,110,97,114,121}; op[974] = getOpcodeTls(a);}
        {char[] a = {98,111,111,108,101,97,110}; op[975] = getOpcodeTls(a);}
        {char[] a = {98,121,116,101}; op[976] = getOpcodeTls(a);}
        {char[] a = {100,97,116,101,116,105,109,101}; op[977] = getOpcodeTls(a);}
        {char[] a = {100,97,116,101,116,105,109,101,111,102,102,115,101,116}; op[978] = getOpcodeTls(a);}
        {char[] a = {100,101,99,105,109,97,108}; op[979] = getOpcodeTls(a);}
        {char[] a = {100,111,117,98,108,101}; op[980] = getOpcodeTls(a);}
        {char[] a = {115,105,110,103,108,101}; op[981] = getOpcodeTls(a);}
        {char[] a = {102,108,111,97,116}; op[982] = getOpcodeTls(a);}
        {char[] a = {103,117,105,100}; op[983] = getOpcodeTls(a);}
        {char[] a = {105,110,116,49,54}; op[984] = getOpcodeTls(a);}
        {char[] a = {105,110,116,51,50}; op[985] = getOpcodeTls(a);}
        {char[] a = {105,110,116,54,52}; op[986] = getOpcodeTls(a);}
        {char[] a = {115,98,121,116,101}; op[987] = getOpcodeTls(a);}
        {char[] a = {115,116,114,101,97,109}; op[988] = getOpcodeTls(a);}
        {char[] a = {115,116,114,105,110,103}; op[989] = getOpcodeTls(a);}
        {char[] a = {116,105,109,101}; op[990] = getOpcodeTls(a);}
        {int[] a = {992,993}; op[991] = getOpcodeCat(a);}
        op[992] = getOpcodeRnm(144, 995); // abstractSpatialTypeName
        op[993] = getOpcodeRep((char)0, (char)1, 994);
        op[994] = getOpcodeRnm(145, 998); // concreteSpatialTypeName
        {int[] a = {996,997}; op[995] = getOpcodeAlt(a);}
        {char[] a = {71,101,111,103,114,97,112,104,121}; op[996] = getOpcodeTls(a);}
        {char[] a = {71,101,111,109,101,116,114,121}; op[997] = getOpcodeTls(a);}
        {int[] a = {999,1000,1001,1002,1003,1004,1005}; op[998] = getOpcodeAlt(a);}
        {char[] a = {67,111,108,108,101,99,116,105,111,110}; op[999] = getOpcodeTls(a);}
        {char[] a = {76,105,110,101,115,116,114,105,110,103}; op[1000] = getOpcodeTls(a);}
        {char[] a = {77,117,108,116,105,76,105,110,101,83,116,114,105,110,103}; op[1001] = getOpcodeTls(a);}
        {char[] a = {77,117,108,116,105,80,111,105,110,116}; op[1002] = getOpcodeTls(a);}
        {char[] a = {77,117,108,116,105,80,111,108,121,103,111,110}; op[1003] = getOpcodeTls(a);}
        {char[] a = {80,111,105,110,116}; op[1004] = getOpcodeTls(a);}
        {char[] a = {80,111,108,121,103,111,110}; op[1005] = getOpcodeTls(a);}
        {int[] a = {1007,1008,1009,1010,1011}; op[1006] = getOpcodeAlt(a);}
        op[1007] = getOpcodeRnm(147, 1012); // primitiveProperty
        op[1008] = getOpcodeRnm(150, 1017); // primitiveColProperty
        op[1009] = getOpcodeRnm(151, 1018); // complexProperty
        op[1010] = getOpcodeRnm(152, 1019); // complexColProperty
        op[1011] = getOpcodeRnm(153, 1020); // streamProperty
        {int[] a = {1013,1014}; op[1012] = getOpcodeAlt(a);}
        op[1013] = getOpcodeRnm(148, 1015); // primitiveKeyProperty
        op[1014] = getOpcodeRnm(149, 1016); // primitiveNonKeyProperty
        op[1015] = getOpcodeRnm(130, 923); // odataIdentifier
        op[1016] = getOpcodeRnm(130, 923); // odataIdentifier
        op[1017] = getOpcodeRnm(130, 923); // odataIdentifier
        op[1018] = getOpcodeRnm(130, 923); // odataIdentifier
        op[1019] = getOpcodeRnm(130, 923); // odataIdentifier
        op[1020] = getOpcodeRnm(130, 923); // odataIdentifier
        {int[] a = {1022,1023}; op[1021] = getOpcodeAlt(a);}
        op[1022] = getOpcodeRnm(155, 1024); // entityNavigationProperty
        op[1023] = getOpcodeRnm(156, 1025); // entityColNavigationProperty
        op[1024] = getOpcodeRnm(130, 923); // odataIdentifier
        op[1025] = getOpcodeRnm(130, 923); // odataIdentifier
        op[1026] = getOpcodeRnm(130, 923); // odataIdentifier
        op[1027] = getOpcodeRnm(130, 923); // odataIdentifier
        {int[] a = {1029,1030,1031,1032,1033,1034}; op[1028] = getOpcodeAlt(a);}
        op[1029] = getOpcodeRnm(160, 1035); // entityFunction
        op[1030] = getOpcodeRnm(161, 1036); // entityColFunction
        op[1031] = getOpcodeRnm(162, 1037); // complexFunction
        op[1032] = getOpcodeRnm(163, 1038); // complexColFunction
        op[1033] = getOpcodeRnm(164, 1039); // primitiveFunction
        op[1034] = getOpcodeRnm(165, 1040); // primitiveColFunction
        op[1035] = getOpcodeRnm(130, 923); // odataIdentifier
        op[1036] = getOpcodeRnm(130, 923); // odataIdentifier
        op[1037] = getOpcodeRnm(130, 923); // odataIdentifier
        op[1038] = getOpcodeRnm(130, 923); // odataIdentifier
        op[1039] = getOpcodeRnm(130, 923); // odataIdentifier
        op[1040] = getOpcodeRnm(130, 923); // odataIdentifier
        {int[] a = {1042,1050,1051,1055,1059,1063,1067,1071}; op[1041] = getOpcodeAlt(a);}
        {int[] a = {1043,1047,1048}; op[1042] = getOpcodeCat(a);}
        op[1043] = getOpcodeRep((char)0, (char)1, 1044);
        {int[] a = {1045,1046}; op[1044] = getOpcodeCat(a);}
        op[1045] = getOpcodeRnm(157, 1026); // entityContainerName
        {char[] a = {46}; op[1046] = getOpcodeTls(a);}
        op[1047] = getOpcodeRnm(135, 941); // entitySetName
        op[1048] = getOpcodeRep((char)0, (char)1, 1049);
        op[1049] = getOpcodeRnm(167, 1075); // collectionNavigation
        op[1050] = getOpcodeRnm(181, 1203); // actionCall
        {int[] a = {1052,1053}; op[1051] = getOpcodeCat(a);}
        op[1052] = getOpcodeRnm(184, 1215); // entityColFunctionCall
        op[1053] = getOpcodeRep((char)0, (char)1, 1054);
        op[1054] = getOpcodeRnm(167, 1075); // collectionNavigation
        {int[] a = {1056,1057}; op[1055] = getOpcodeCat(a);}
        op[1056] = getOpcodeRnm(183, 1210); // entityFunctionCall
        op[1057] = getOpcodeRep((char)0, (char)1, 1058);
        op[1058] = getOpcodeRnm(173, 1107); // singleNavigation
        {int[] a = {1060,1061}; op[1059] = getOpcodeCat(a);}
        op[1060] = getOpcodeRnm(186, 1225); // complexColFunctionCall
        op[1061] = getOpcodeRep((char)0, (char)1, 1062);
        op[1062] = getOpcodeRnm(174, 1148); // collectionPath
        {int[] a = {1064,1065}; op[1063] = getOpcodeCat(a);}
        op[1064] = getOpcodeRnm(185, 1220); // complexFunctionCall
        op[1065] = getOpcodeRep((char)0, (char)1, 1066);
        op[1066] = getOpcodeRnm(176, 1154); // complexPath
        {int[] a = {1068,1069}; op[1067] = getOpcodeCat(a);}
        op[1068] = getOpcodeRnm(188, 1235); // primitiveColFunctionCall
        op[1069] = getOpcodeRep((char)0, (char)1, 1070);
        op[1070] = getOpcodeRnm(174, 1148); // collectionPath
        {int[] a = {1072,1073}; op[1071] = getOpcodeCat(a);}
        op[1072] = getOpcodeRnm(187, 1230); // primitiveFunctionCall
        op[1073] = getOpcodeRep((char)0, (char)1, 1074);
        op[1074] = getOpcodeRnm(175, 1151); // singlePath
        {int[] a = {1076,1080}; op[1075] = getOpcodeCat(a);}
        op[1076] = getOpcodeRep((char)0, (char)1, 1077);
        {int[] a = {1078,1079}; op[1077] = getOpcodeCat(a);}
        {char[] a = {47}; op[1078] = getOpcodeTls(a);}
        op[1079] = getOpcodeRnm(140, 958); // qualifiedEntityTypeName
        {int[] a = {1081,1085,1086}; op[1080] = getOpcodeAlt(a);}
        {int[] a = {1082,1083}; op[1081] = getOpcodeCat(a);}
        op[1082] = getOpcodeRnm(168, 1087); // keyPredicate
        op[1083] = getOpcodeRep((char)0, (char)1, 1084);
        op[1084] = getOpcodeRnm(173, 1107); // singleNavigation
        op[1085] = getOpcodeRnm(174, 1148); // collectionPath
        {char[] a = {}; op[1086] = getOpcodeTls(a);}
        {int[] a = {1088,1089}; op[1087] = getOpcodeAlt(a);}
        op[1088] = getOpcodeRnm(169, 1090); // simpleKey
        op[1089] = getOpcodeRnm(170, 1094); // compoundKey
        {int[] a = {1091,1092,1093}; op[1090] = getOpcodeCat(a);}
        {char[] a = {40}; op[1091] = getOpcodeTls(a);}
        op[1092] = getOpcodeRnm(70, 508); // primitiveLiteral
        {char[] a = {41}; op[1093] = getOpcodeTls(a);}
        {int[] a = {1095,1096,1097,1101}; op[1094] = getOpcodeCat(a);}
        {char[] a = {40}; op[1095] = getOpcodeTls(a);}
        op[1096] = getOpcodeRnm(171, 1102); // keyValuePair
        op[1097] = getOpcodeRep((char)0, Character.MAX_VALUE, 1098);
        {int[] a = {1099,1100}; op[1098] = getOpcodeCat(a);}
        {char[] a = {44}; op[1099] = getOpcodeTls(a);}
        op[1100] = getOpcodeRnm(171, 1102); // keyValuePair
        {char[] a = {41}; op[1101] = getOpcodeTls(a);}
        {int[] a = {1103,1104,1105}; op[1102] = getOpcodeCat(a);}
        op[1103] = getOpcodeRnm(148, 1015); // primitiveKeyProperty
        {char[] a = {61}; op[1104] = getOpcodeTls(a);}
        op[1105] = getOpcodeRnm(172, 1106); // keyPropertyValue
        op[1106] = getOpcodeRnm(70, 508); // primitiveLiteral
        {int[] a = {1108,1112}; op[1107] = getOpcodeCat(a);}
        op[1108] = getOpcodeRep((char)0, (char)1, 1109);
        {int[] a = {1110,1111}; op[1109] = getOpcodeCat(a);}
        {char[] a = {47}; op[1110] = getOpcodeTls(a);}
        op[1111] = getOpcodeRnm(140, 958); // qualifiedEntityTypeName
        {int[] a = {1113,1114,1118,1146,1147}; op[1112] = getOpcodeAlt(a);}
        op[1113] = getOpcodeRnm(178, 1173); // value
        {int[] a = {1115,1116,1117}; op[1114] = getOpcodeCat(a);}
        op[1115] = getOpcodeRnm(179, 1174); // links
        {char[] a = {47}; op[1116] = getOpcodeTls(a);}
        op[1117] = getOpcodeRnm(154, 1021); // navigationProperty
        {int[] a = {1119,1120}; op[1118] = getOpcodeCat(a);}
        {char[] a = {47}; op[1119] = getOpcodeTls(a);}
        {int[] a = {1121,1122,1126,1130,1134,1138,1142}; op[1120] = getOpcodeAlt(a);}
        op[1121] = getOpcodeRnm(153, 1020); // streamProperty
        {int[] a = {1123,1124}; op[1122] = getOpcodeCat(a);}
        op[1123] = getOpcodeRnm(150, 1017); // primitiveColProperty
        op[1124] = getOpcodeRep((char)0, (char)1, 1125);
        op[1125] = getOpcodeRnm(174, 1148); // collectionPath
        {int[] a = {1127,1128}; op[1126] = getOpcodeCat(a);}
        op[1127] = getOpcodeRnm(147, 1012); // primitiveProperty
        op[1128] = getOpcodeRep((char)0, (char)1, 1129);
        op[1129] = getOpcodeRnm(175, 1151); // singlePath
        {int[] a = {1131,1132}; op[1130] = getOpcodeCat(a);}
        op[1131] = getOpcodeRnm(152, 1019); // complexColProperty
        op[1132] = getOpcodeRep((char)0, (char)1, 1133);
        op[1133] = getOpcodeRnm(174, 1148); // collectionPath
        {int[] a = {1135,1136}; op[1134] = getOpcodeCat(a);}
        op[1135] = getOpcodeRnm(151, 1018); // complexProperty
        op[1136] = getOpcodeRep((char)0, (char)1, 1137);
        op[1137] = getOpcodeRnm(176, 1154); // complexPath
        {int[] a = {1139,1140}; op[1138] = getOpcodeCat(a);}
        op[1139] = getOpcodeRnm(156, 1025); // entityColNavigationProperty
        op[1140] = getOpcodeRep((char)0, (char)1, 1141);
        op[1141] = getOpcodeRnm(167, 1075); // collectionNavigation
        {int[] a = {1143,1144}; op[1142] = getOpcodeCat(a);}
        op[1143] = getOpcodeRnm(155, 1024); // entityNavigationProperty
        op[1144] = getOpcodeRep((char)0, (char)1, 1145);
        op[1145] = getOpcodeRnm(173, 1107); // singleNavigation
        op[1146] = getOpcodeRnm(180, 1175); // boundOperation
        {char[] a = {}; op[1147] = getOpcodeTls(a);}
        {int[] a = {1149,1150}; op[1148] = getOpcodeAlt(a);}
        op[1149] = getOpcodeRnm(177, 1172); // count
        op[1150] = getOpcodeRnm(180, 1175); // boundOperation
        {int[] a = {1152,1153}; op[1151] = getOpcodeAlt(a);}
        op[1152] = getOpcodeRnm(178, 1173); // value
        op[1153] = getOpcodeRnm(180, 1175); // boundOperation
        {int[] a = {1155,1159}; op[1154] = getOpcodeCat(a);}
        op[1155] = getOpcodeRep((char)0, (char)1, 1156);
        {int[] a = {1157,1158}; op[1156] = getOpcodeCat(a);}
        {char[] a = {47}; op[1157] = getOpcodeTls(a);}
        op[1158] = getOpcodeRnm(141, 962); // qualifiedComplexTypeName
        {int[] a = {1160,1171}; op[1159] = getOpcodeAlt(a);}
        {int[] a = {1161,1162}; op[1160] = getOpcodeCat(a);}
        {char[] a = {47}; op[1161] = getOpcodeTls(a);}
        {int[] a = {1163,1167}; op[1162] = getOpcodeAlt(a);}
        {int[] a = {1164,1165}; op[1163] = getOpcodeCat(a);}
        op[1164] = getOpcodeRnm(147, 1012); // primitiveProperty
        op[1165] = getOpcodeRep((char)0, (char)1, 1166);
        op[1166] = getOpcodeRnm(175, 1151); // singlePath
        {int[] a = {1168,1169}; op[1167] = getOpcodeCat(a);}
        op[1168] = getOpcodeRnm(151, 1018); // complexProperty
        op[1169] = getOpcodeRep((char)0, (char)1, 1170);
        op[1170] = getOpcodeRnm(176, 1154); // complexPath
        op[1171] = getOpcodeRnm(180, 1175); // boundOperation
        {char[] a = {47,36,99,111,117,110,116}; op[1172] = getOpcodeTls(a);}
        {char[] a = {47,36,118,97,108,117,101}; op[1173] = getOpcodeTls(a);}
        {char[] a = {47,36,108,105,110,107,115}; op[1174] = getOpcodeTls(a);}
        {int[] a = {1176,1177}; op[1175] = getOpcodeCat(a);}
        {char[] a = {47}; op[1176] = getOpcodeTls(a);}
        {int[] a = {1178,1179,1183,1187,1191,1195,1199}; op[1177] = getOpcodeAlt(a);}
        op[1178] = getOpcodeRnm(182, 1209); // boundActionCall
        {int[] a = {1180,1181}; op[1179] = getOpcodeCat(a);}
        op[1180] = getOpcodeRnm(190, 1241); // boundEntityColFuncCall
        op[1181] = getOpcodeRep((char)0, (char)1, 1182);
        op[1182] = getOpcodeRnm(167, 1075); // collectionNavigation
        {int[] a = {1184,1185}; op[1183] = getOpcodeCat(a);}
        op[1184] = getOpcodeRnm(189, 1240); // boundEntityFuncCall
        op[1185] = getOpcodeRep((char)0, (char)1, 1186);
        op[1186] = getOpcodeRnm(173, 1107); // singleNavigation
        {int[] a = {1188,1189}; op[1187] = getOpcodeCat(a);}
        op[1188] = getOpcodeRnm(192, 1243); // boundComplexColFuncCall
        op[1189] = getOpcodeRep((char)0, (char)1, 1190);
        op[1190] = getOpcodeRnm(174, 1148); // collectionPath
        {int[] a = {1192,1193}; op[1191] = getOpcodeCat(a);}
        op[1192] = getOpcodeRnm(191, 1242); // boundComplexFuncCall
        op[1193] = getOpcodeRep((char)0, (char)1, 1194);
        op[1194] = getOpcodeRnm(176, 1154); // complexPath
        {int[] a = {1196,1197}; op[1195] = getOpcodeCat(a);}
        op[1196] = getOpcodeRnm(194, 1245); // boundPrimitiveColFuncCall
        op[1197] = getOpcodeRep((char)0, (char)1, 1198);
        op[1198] = getOpcodeRnm(174, 1148); // collectionPath
        {int[] a = {1200,1201}; op[1199] = getOpcodeCat(a);}
        op[1200] = getOpcodeRnm(193, 1244); // boundPrimitiveFuncCall
        op[1201] = getOpcodeRep((char)0, (char)1, 1202);
        op[1202] = getOpcodeRnm(175, 1151); // singlePath
        {int[] a = {1204,1206,1207}; op[1203] = getOpcodeCat(a);}
        op[1204] = getOpcodeRep((char)0, (char)1, 1205);
        op[1205] = getOpcodeRnm(19, 156); // operationQualifier
        op[1206] = getOpcodeRnm(158, 1027); // action
        op[1207] = getOpcodeRep((char)0, (char)1, 1208);
        {char[] a = {40,41}; op[1208] = getOpcodeTls(a);}
        op[1209] = getOpcodeRnm(181, 1203); // actionCall
        {int[] a = {1211,1213,1214}; op[1210] = getOpcodeCat(a);}
        op[1211] = getOpcodeRep((char)0, (char)1, 1212);
        op[1212] = getOpcodeRnm(19, 156); // operationQualifier
        op[1213] = getOpcodeRnm(160, 1035); // entityFunction
        op[1214] = getOpcodeRnm(195, 1246); // functionParameters
        {int[] a = {1216,1218,1219}; op[1215] = getOpcodeCat(a);}
        op[1216] = getOpcodeRep((char)0, (char)1, 1217);
        op[1217] = getOpcodeRnm(19, 156); // operationQualifier
        op[1218] = getOpcodeRnm(161, 1036); // entityColFunction
        op[1219] = getOpcodeRnm(195, 1246); // functionParameters
        {int[] a = {1221,1223,1224}; op[1220] = getOpcodeCat(a);}
        op[1221] = getOpcodeRep((char)0, (char)1, 1222);
        op[1222] = getOpcodeRnm(19, 156); // operationQualifier
        op[1223] = getOpcodeRnm(162, 1037); // complexFunction
        op[1224] = getOpcodeRnm(195, 1246); // functionParameters
        {int[] a = {1226,1228,1229}; op[1225] = getOpcodeCat(a);}
        op[1226] = getOpcodeRep((char)0, (char)1, 1227);
        op[1227] = getOpcodeRnm(19, 156); // operationQualifier
        op[1228] = getOpcodeRnm(163, 1038); // complexColFunction
        op[1229] = getOpcodeRnm(195, 1246); // functionParameters
        {int[] a = {1231,1233,1234}; op[1230] = getOpcodeCat(a);}
        op[1231] = getOpcodeRep((char)0, (char)1, 1232);
        op[1232] = getOpcodeRnm(19, 156); // operationQualifier
        op[1233] = getOpcodeRnm(164, 1039); // primitiveFunction
        op[1234] = getOpcodeRnm(195, 1246); // functionParameters
        {int[] a = {1236,1238,1239}; op[1235] = getOpcodeCat(a);}
        op[1236] = getOpcodeRep((char)0, (char)1, 1237);
        op[1237] = getOpcodeRnm(19, 156); // operationQualifier
        op[1238] = getOpcodeRnm(165, 1040); // primitiveColFunction
        op[1239] = getOpcodeRnm(195, 1246); // functionParameters
        op[1240] = getOpcodeRnm(183, 1210); // entityFunctionCall
        op[1241] = getOpcodeRnm(184, 1215); // entityColFunctionCall
        op[1242] = getOpcodeRnm(185, 1220); // complexFunctionCall
        op[1243] = getOpcodeRnm(186, 1225); // complexColFunctionCall
        op[1244] = getOpcodeRnm(187, 1230); // primitiveFunctionCall
        op[1245] = getOpcodeRnm(188, 1235); // primitiveColFunctionCall
        {int[] a = {1247,1248,1255}; op[1246] = getOpcodeCat(a);}
        {char[] a = {40}; op[1247] = getOpcodeTls(a);}
        op[1248] = getOpcodeRep((char)0, (char)1, 1249);
        {int[] a = {1250,1251}; op[1249] = getOpcodeCat(a);}
        op[1250] = getOpcodeRnm(196, 1256); // functionParameter
        op[1251] = getOpcodeRep((char)0, Character.MAX_VALUE, 1252);
        {int[] a = {1253,1254}; op[1252] = getOpcodeCat(a);}
        {char[] a = {44}; op[1253] = getOpcodeTls(a);}
        op[1254] = getOpcodeRnm(196, 1256); // functionParameter
        {char[] a = {41}; op[1255] = getOpcodeTls(a);}
        {int[] a = {1257,1258,1259}; op[1256] = getOpcodeCat(a);}
        op[1257] = getOpcodeRnm(197, 1262); // functionParameterName
        {char[] a = {61}; op[1258] = getOpcodeTls(a);}
        {int[] a = {1260,1261}; op[1259] = getOpcodeAlt(a);}
        op[1260] = getOpcodeRnm(70, 508); // primitiveLiteral
        op[1261] = getOpcodeRnm(198, 1263); // parameterAlias
        op[1262] = getOpcodeRnm(130, 923); // odataIdentifier
        {int[] a = {1264,1265}; op[1263] = getOpcodeCat(a);}
        {char[] a = {64}; op[1264] = getOpcodeTls(a);}
        op[1265] = getOpcodeRnm(130, 923); // odataIdentifier
        {int[] a = {1267,1268,1269}; op[1266] = getOpcodeCat(a);}
        op[1267] = getOpcodeRnm(198, 1263); // parameterAlias
        {char[] a = {61}; op[1268] = getOpcodeTls(a);}
        op[1269] = getOpcodeRnm(201, 1274); // parameterValue
        {int[] a = {1271,1272,1273}; op[1270] = getOpcodeCat(a);}
        op[1271] = getOpcodeRnm(197, 1262); // functionParameterName
        {char[] a = {61}; op[1272] = getOpcodeTls(a);}
        op[1273] = getOpcodeRnm(201, 1274); // parameterValue
        {int[] a = {1275,1276,1277,1278}; op[1274] = getOpcodeAlt(a);}
        op[1275] = getOpcodeRnm(70, 508); // primitiveLiteral
        op[1276] = getOpcodeRnm(202, 1279); // complexInUri
        op[1277] = getOpcodeRnm(203, 1296); // complexColInUri
        op[1278] = getOpcodeRnm(204, 1306); // primitiveColInUri
        {int[] a = {1280,1281,1295}; op[1279] = getOpcodeCat(a);}
        op[1280] = getOpcodeRnm(205, 1316); // begin-object
        op[1281] = getOpcodeRep((char)0, (char)1, 1282);
        {int[] a = {1283,1288}; op[1282] = getOpcodeCat(a);}
        {int[] a = {1284,1285,1286,1287}; op[1283] = getOpcodeAlt(a);}
        op[1284] = getOpcodeRnm(212, 1323); // complexTypeMetadataInUri
        op[1285] = getOpcodeRnm(214, 1340); // primitivePropertyInUri
        op[1286] = getOpcodeRnm(222, 1384); // complexPropertyInUri
        op[1287] = getOpcodeRnm(223, 1390); // collectionPropertyInUri
        op[1288] = getOpcodeRep((char)0, Character.MAX_VALUE, 1289);
        {int[] a = {1290,1291}; op[1289] = getOpcodeCat(a);}
        op[1290] = getOpcodeRnm(211, 1322); // value-separator
        {int[] a = {1292,1293,1294}; op[1291] = getOpcodeAlt(a);}
        op[1292] = getOpcodeRnm(214, 1340); // primitivePropertyInUri
        op[1293] = getOpcodeRnm(222, 1384); // complexPropertyInUri
        op[1294] = getOpcodeRnm(223, 1390); // collectionPropertyInUri
        op[1295] = getOpcodeRnm(206, 1317); // end-object
        {int[] a = {1297,1298,1305}; op[1296] = getOpcodeCat(a);}
        op[1297] = getOpcodeRnm(207, 1318); // begin-array
        op[1298] = getOpcodeRep((char)0, (char)1, 1299);
        {int[] a = {1300,1301}; op[1299] = getOpcodeCat(a);}
        op[1300] = getOpcodeRnm(202, 1279); // complexInUri
        op[1301] = getOpcodeRep((char)0, Character.MAX_VALUE, 1302);
        {int[] a = {1303,1304}; op[1302] = getOpcodeCat(a);}
        op[1303] = getOpcodeRnm(211, 1322); // value-separator
        op[1304] = getOpcodeRnm(202, 1279); // complexInUri
        op[1305] = getOpcodeRnm(208, 1319); // end-array
        {int[] a = {1307,1308,1315}; op[1306] = getOpcodeCat(a);}
        op[1307] = getOpcodeRnm(207, 1318); // begin-array
        op[1308] = getOpcodeRep((char)0, (char)1, 1309);
        {int[] a = {1310,1311}; op[1309] = getOpcodeCat(a);}
        op[1310] = getOpcodeRnm(215, 1346); // primitiveLiteralInJSON
        op[1311] = getOpcodeRep((char)0, Character.MAX_VALUE, 1312);
        {int[] a = {1313,1314}; op[1312] = getOpcodeCat(a);}
        op[1313] = getOpcodeRnm(211, 1322); // value-separator
        op[1314] = getOpcodeRnm(215, 1346); // primitiveLiteralInJSON
        op[1315] = getOpcodeRnm(208, 1319); // end-array
        {char[] a = {123}; op[1316] = getOpcodeTls(a);}
        {char[] a = {125}; op[1317] = getOpcodeTls(a);}
        {char[] a = {91}; op[1318] = getOpcodeTls(a);}
        {char[] a = {93}; op[1319] = getOpcodeTls(a);}
        op[1320] = getOpcodeRnm(31, 242); // DQUOTE
        {char[] a = {58}; op[1321] = getOpcodeTls(a);}
        op[1322] = getOpcodeRnm(54, 435); // COMMA
        {int[] a = {1324,1325,1326,1327,1328,1329,1331}; op[1323] = getOpcodeCat(a);}
        op[1324] = getOpcodeRnm(209, 1320); // quotation-mark
        {char[] a = {95,95,109,101,116,97,100,97,116,97}; op[1325] = getOpcodeTls(a);}
        op[1326] = getOpcodeRnm(209, 1320); // quotation-mark
        op[1327] = getOpcodeRnm(210, 1321); // name-separator
        op[1328] = getOpcodeRnm(205, 1316); // begin-object
        op[1329] = getOpcodeRep((char)0, (char)1, 1330);
        op[1330] = getOpcodeRnm(213, 1332); // typeNVPInUri
        op[1331] = getOpcodeRnm(206, 1317); // end-object
        {int[] a = {1333,1334,1335,1336,1337,1338,1339}; op[1332] = getOpcodeCat(a);}
        op[1333] = getOpcodeRnm(209, 1320); // quotation-mark
        {char[] a = {116,121,112,101}; op[1334] = getOpcodeTls(a);}
        op[1335] = getOpcodeRnm(209, 1320); // quotation-mark
        op[1336] = getOpcodeRnm(210, 1321); // name-separator
        op[1337] = getOpcodeRnm(209, 1320); // quotation-mark
        op[1338] = getOpcodeRnm(139, 945); // qualifiedTypeName
        op[1339] = getOpcodeRnm(209, 1320); // quotation-mark
        {int[] a = {1341,1342,1343,1344,1345}; op[1340] = getOpcodeCat(a);}
        op[1341] = getOpcodeRnm(209, 1320); // quotation-mark
        op[1342] = getOpcodeRnm(147, 1012); // primitiveProperty
        op[1343] = getOpcodeRnm(209, 1320); // quotation-mark
        op[1344] = getOpcodeRnm(210, 1321); // name-separator
        op[1345] = getOpcodeRnm(215, 1346); // primitiveLiteralInJSON
        {int[] a = {1347,1348,1349,1350,1351}; op[1346] = getOpcodeAlt(a);}
        op[1347] = getOpcodeRnm(216, 1352); // stringInJSON
        op[1348] = getOpcodeRnm(218, 1358); // numberInJSON
        {char[] a = {116,114,117,101}; op[1349] = getOpcodeTbs(a);}
        {char[] a = {102,97,108,115,101}; op[1350] = getOpcodeTbs(a);}
        {char[] a = {110,117,108,108}; op[1351] = getOpcodeTbs(a);}
        {int[] a = {1353,1354,1356}; op[1352] = getOpcodeCat(a);}
        op[1353] = getOpcodeRnm(209, 1320); // quotation-mark
        op[1354] = getOpcodeRep((char)0, Character.MAX_VALUE, 1355);
        op[1355] = getOpcodeRnm(217, 1357); // charInJSON
        op[1356] = getOpcodeRnm(209, 1320); // quotation-mark
        op[1357] = getOpcodeRnm(46, 401); // pchar
        {int[] a = {1359,1361,1362,1364}; op[1358] = getOpcodeCat(a);}
        op[1359] = getOpcodeRep((char)0, (char)1, 1360);
        {char[] a = {45}; op[1360] = getOpcodeTls(a);}
        op[1361] = getOpcodeRnm(219, 1366); // int
        op[1362] = getOpcodeRep((char)0, (char)1, 1363);
        op[1363] = getOpcodeRnm(220, 1372); // frac
        op[1364] = getOpcodeRep((char)0, (char)1, 1365);
        op[1365] = getOpcodeRnm(221, 1376); // exp
        {int[] a = {1367,1368}; op[1366] = getOpcodeAlt(a);}
        {char[] a = {48}; op[1367] = getOpcodeTls(a);}
        {int[] a = {1369,1370}; op[1368] = getOpcodeCat(a);}
        op[1369] = getOpcodeRnm(61, 449); // oneToNine
        op[1370] = getOpcodeRep((char)0, Character.MAX_VALUE, 1371);
        op[1371] = getOpcodeRnm(29, 233); // DIGIT
        {int[] a = {1373,1374}; op[1372] = getOpcodeCat(a);}
        {char[] a = {46}; op[1373] = getOpcodeTls(a);}
        op[1374] = getOpcodeRep((char)1, Character.MAX_VALUE, 1375);
        op[1375] = getOpcodeRnm(29, 233); // DIGIT
        {int[] a = {1377,1378,1382}; op[1376] = getOpcodeCat(a);}
        {char[] a = {101}; op[1377] = getOpcodeTls(a);}
        op[1378] = getOpcodeRep((char)0, (char)1, 1379);
        {int[] a = {1380,1381}; op[1379] = getOpcodeAlt(a);}
        {char[] a = {45}; op[1380] = getOpcodeTls(a);}
        {char[] a = {43}; op[1381] = getOpcodeTls(a);}
        op[1382] = getOpcodeRep((char)1, Character.MAX_VALUE, 1383);
        op[1383] = getOpcodeRnm(29, 233); // DIGIT
        {int[] a = {1385,1386,1387,1388,1389}; op[1384] = getOpcodeCat(a);}
        op[1385] = getOpcodeRnm(209, 1320); // quotation-mark
        op[1386] = getOpcodeRnm(151, 1018); // complexProperty
        op[1387] = getOpcodeRnm(209, 1320); // quotation-mark
        op[1388] = getOpcodeRnm(210, 1321); // name-separator
        op[1389] = getOpcodeRnm(202, 1279); // complexInUri
        {int[] a = {1391,1397}; op[1390] = getOpcodeAlt(a);}
        {int[] a = {1392,1393,1394,1395,1396}; op[1391] = getOpcodeCat(a);}
        op[1392] = getOpcodeRnm(209, 1320); // quotation-mark
        op[1393] = getOpcodeRnm(150, 1017); // primitiveColProperty
        op[1394] = getOpcodeRnm(209, 1320); // quotation-mark
        op[1395] = getOpcodeRnm(210, 1321); // name-separator
        op[1396] = getOpcodeRnm(204, 1306); // primitiveColInUri
        {int[] a = {1398,1399,1400,1401,1402}; op[1397] = getOpcodeCat(a);}
        op[1398] = getOpcodeRnm(209, 1320); // quotation-mark
        op[1399] = getOpcodeRnm(152, 1019); // complexColProperty
        op[1400] = getOpcodeRnm(209, 1320); // quotation-mark
        op[1401] = getOpcodeRnm(210, 1321); // name-separator
        op[1402] = getOpcodeRnm(203, 1296); // complexColInUri
        {int[] a = {1404,1405,1406,1407,1408,1409,1410,1411,1412,1413,1414,1415,1416}; op[1403] = getOpcodeAlt(a);}
        op[1404] = getOpcodeRnm(70, 508); // primitiveLiteral
        op[1405] = getOpcodeRnm(227, 1435); // firstMemberExpr
        op[1406] = getOpcodeRnm(240, 1526); // functionExpr
        op[1407] = getOpcodeRnm(225, 1417); // boolCommonExpr
        op[1408] = getOpcodeRnm(246, 1589); // methodCallExpr
        op[1409] = getOpcodeRnm(273, 1862); // parenExpr
        op[1410] = getOpcodeRnm(283, 1942); // addExpr
        op[1411] = getOpcodeRnm(284, 1950); // subExpr
        op[1412] = getOpcodeRnm(285, 1958); // mulExpr
        op[1413] = getOpcodeRnm(286, 1966); // divExpr
        op[1414] = getOpcodeRnm(287, 1974); // modExpr
        op[1415] = getOpcodeRnm(288, 1982); // negateExpr
        op[1416] = getOpcodeRnm(291, 2005); // castExpr
        {int[] a = {1418,1419,1420,1421,1422,1423,1424,1425,1426,1427,1428,1429,1430,1431,1432,1433}; op[1417] = getOpcodeAlt(a);}
        op[1418] = getOpcodeRnm(73, 555); // boolean
        op[1419] = getOpcodeRnm(226, 1434); // boolFirstMemberExpr
        op[1420] = getOpcodeRnm(238, 1524); // boolFunctionExpr
        op[1421] = getOpcodeRnm(277, 1894); // eqExpr
        op[1422] = getOpcodeRnm(278, 1902); // neExpr
        op[1423] = getOpcodeRnm(279, 1910); // ltExpr
        op[1424] = getOpcodeRnm(280, 1918); // leExpr
        op[1425] = getOpcodeRnm(281, 1926); // gtExpr
        op[1426] = getOpcodeRnm(282, 1934); // geExpr
        op[1427] = getOpcodeRnm(289, 1987); // notExpr
        op[1428] = getOpcodeRnm(275, 1878); // andExpr
        op[1429] = getOpcodeRnm(276, 1886); // orExpr
        op[1430] = getOpcodeRnm(290, 1992); // isofExpr
        op[1431] = getOpcodeRnm(292, 2018); // boolCastExpr
        op[1432] = getOpcodeRnm(247, 1616); // boolMethodCallExpr
        op[1433] = getOpcodeRnm(274, 1870); // boolParenExpr
        op[1434] = getOpcodeRnm(227, 1435); // firstMemberExpr
        {int[] a = {1436,1438}; op[1435] = getOpcodeCat(a);}
        op[1436] = getOpcodeRep((char)0, (char)1, 1437);
        op[1437] = getOpcodeRnm(229, 1471); // lambdaPredicatePrefixExpr
        op[1438] = getOpcodeRnm(228, 1439); // memberExpr
        {int[] a = {1440,1444}; op[1439] = getOpcodeCat(a);}
        op[1440] = getOpcodeRep((char)0, (char)1, 1441);
        {int[] a = {1442,1443}; op[1441] = getOpcodeCat(a);}
        op[1442] = getOpcodeRnm(140, 958); // qualifiedEntityTypeName
        {char[] a = {47}; op[1443] = getOpcodeTls(a);}
        {int[] a = {1445,1449,1453,1457,1461,1465,1469,1470}; op[1444] = getOpcodeAlt(a);}
        {int[] a = {1446,1447}; op[1445] = getOpcodeCat(a);}
        op[1446] = getOpcodeRnm(156, 1025); // entityColNavigationProperty
        op[1447] = getOpcodeRep((char)0, (char)1, 1448);
        op[1448] = getOpcodeRnm(233, 1479); // collectionNavigationExpr
        {int[] a = {1450,1451}; op[1449] = getOpcodeCat(a);}
        op[1450] = getOpcodeRnm(155, 1024); // entityNavigationProperty
        op[1451] = getOpcodeRep((char)0, (char)1, 1452);
        op[1452] = getOpcodeRnm(234, 1491); // singleNavigationExpr
        {int[] a = {1454,1455}; op[1453] = getOpcodeCat(a);}
        op[1454] = getOpcodeRnm(152, 1019); // complexColProperty
        op[1455] = getOpcodeRep((char)0, (char)1, 1456);
        op[1456] = getOpcodeRnm(235, 1494); // collectionPathExpr
        {int[] a = {1458,1459}; op[1457] = getOpcodeCat(a);}
        op[1458] = getOpcodeRnm(151, 1018); // complexProperty
        op[1459] = getOpcodeRep((char)0, (char)1, 1460);
        op[1460] = getOpcodeRnm(236, 1505); // complexPathExpr
        {int[] a = {1462,1463}; op[1461] = getOpcodeCat(a);}
        op[1462] = getOpcodeRnm(150, 1017); // primitiveColProperty
        op[1463] = getOpcodeRep((char)0, (char)1, 1464);
        op[1464] = getOpcodeRnm(235, 1494); // collectionPathExpr
        {int[] a = {1466,1467}; op[1465] = getOpcodeCat(a);}
        op[1466] = getOpcodeRnm(147, 1012); // primitiveProperty
        op[1467] = getOpcodeRep((char)0, (char)1, 1468);
        op[1468] = getOpcodeRnm(237, 1521); // singlePathExpr
        op[1469] = getOpcodeRnm(153, 1020); // streamProperty
        op[1470] = getOpcodeRnm(239, 1525); // boundFunctionExpr
        {int[] a = {1472,1473}; op[1471] = getOpcodeCat(a);}
        op[1472] = getOpcodeRnm(230, 1474); // inscopeVariableExpr
        {char[] a = {47}; op[1473] = getOpcodeTls(a);}
        {int[] a = {1475,1476}; op[1474] = getOpcodeAlt(a);}
        op[1475] = getOpcodeRnm(231, 1477); // implicitVariableExpr
        op[1476] = getOpcodeRnm(232, 1478); // lambdaVariableExpr
        {char[] a = {36,105,116}; op[1477] = getOpcodeTls(a);}
        op[1478] = getOpcodeRnm(130, 923); // odataIdentifier
        {int[] a = {1480,1481}; op[1479] = getOpcodeAlt(a);}
        op[1480] = getOpcodeRnm(177, 1172); // count
        {int[] a = {1482,1483,1487}; op[1481] = getOpcodeCat(a);}
        {char[] a = {47}; op[1482] = getOpcodeTls(a);}
        op[1483] = getOpcodeRep((char)0, (char)1, 1484);
        {int[] a = {1485,1486}; op[1484] = getOpcodeCat(a);}
        op[1485] = getOpcodeRnm(140, 958); // qualifiedEntityTypeName
        {char[] a = {47}; op[1486] = getOpcodeTls(a);}
        {int[] a = {1488,1489,1490}; op[1487] = getOpcodeAlt(a);}
        op[1488] = getOpcodeRnm(239, 1525); // boundFunctionExpr
        op[1489] = getOpcodeRnm(243, 1574); // anyExpr
        op[1490] = getOpcodeRnm(244, 1582); // allExpr
        {int[] a = {1492,1493}; op[1491] = getOpcodeCat(a);}
        {char[] a = {47}; op[1492] = getOpcodeTls(a);}
        op[1493] = getOpcodeRnm(228, 1439); // memberExpr
        {int[] a = {1495,1496,1499,1502}; op[1494] = getOpcodeAlt(a);}
        op[1495] = getOpcodeRnm(177, 1172); // count
        {int[] a = {1497,1498}; op[1496] = getOpcodeCat(a);}
        {char[] a = {47}; op[1497] = getOpcodeTls(a);}
        op[1498] = getOpcodeRnm(239, 1525); // boundFunctionExpr
        {int[] a = {1500,1501}; op[1499] = getOpcodeCat(a);}
        {char[] a = {47}; op[1500] = getOpcodeTls(a);}
        op[1501] = getOpcodeRnm(243, 1574); // anyExpr
        {int[] a = {1503,1504}; op[1502] = getOpcodeCat(a);}
        {char[] a = {47}; op[1503] = getOpcodeTls(a);}
        op[1504] = getOpcodeRnm(244, 1582); // allExpr
        {int[] a = {1506,1507,1511}; op[1505] = getOpcodeCat(a);}
        {char[] a = {47}; op[1506] = getOpcodeTls(a);}
        op[1507] = getOpcodeRep((char)0, (char)1, 1508);
        {int[] a = {1509,1510}; op[1508] = getOpcodeCat(a);}
        op[1509] = getOpcodeRnm(141, 962); // qualifiedComplexTypeName
        {char[] a = {47}; op[1510] = getOpcodeTls(a);}
        {int[] a = {1512,1516,1520}; op[1511] = getOpcodeAlt(a);}
        {int[] a = {1513,1514}; op[1512] = getOpcodeCat(a);}
        op[1513] = getOpcodeRnm(147, 1012); // primitiveProperty
        op[1514] = getOpcodeRep((char)0, (char)1, 1515);
        op[1515] = getOpcodeRnm(237, 1521); // singlePathExpr
        {int[] a = {1517,1518}; op[1516] = getOpcodeCat(a);}
        op[1517] = getOpcodeRnm(151, 1018); // complexProperty
        op[1518] = getOpcodeRep((char)0, (char)1, 1519);
        op[1519] = getOpcodeRnm(236, 1505); // complexPathExpr
        op[1520] = getOpcodeRnm(239, 1525); // boundFunctionExpr
        {int[] a = {1522,1523}; op[1521] = getOpcodeCat(a);}
        {char[] a = {47}; op[1522] = getOpcodeTls(a);}
        op[1523] = getOpcodeRnm(239, 1525); // boundFunctionExpr
        op[1524] = getOpcodeRnm(240, 1526); // functionExpr
        op[1525] = getOpcodeRnm(240, 1526); // functionExpr
        {int[] a = {1527,1529}; op[1526] = getOpcodeCat(a);}
        op[1527] = getOpcodeRep((char)0, (char)1, 1528);
        op[1528] = getOpcodeRnm(19, 156); // operationQualifier
        {int[] a = {1530,1535,1540,1545,1550,1555}; op[1529] = getOpcodeAlt(a);}
        {int[] a = {1531,1532,1533}; op[1530] = getOpcodeCat(a);}
        op[1531] = getOpcodeRnm(161, 1036); // entityColFunction
        op[1532] = getOpcodeRnm(241, 1560); // functionExprParameters
        op[1533] = getOpcodeRep((char)0, (char)1, 1534);
        op[1534] = getOpcodeRnm(233, 1479); // collectionNavigationExpr
        {int[] a = {1536,1537,1538}; op[1535] = getOpcodeCat(a);}
        op[1536] = getOpcodeRnm(160, 1035); // entityFunction
        op[1537] = getOpcodeRnm(241, 1560); // functionExprParameters
        op[1538] = getOpcodeRep((char)0, (char)1, 1539);
        op[1539] = getOpcodeRnm(234, 1491); // singleNavigationExpr
        {int[] a = {1541,1542,1543}; op[1540] = getOpcodeCat(a);}
        op[1541] = getOpcodeRnm(163, 1038); // complexColFunction
        op[1542] = getOpcodeRnm(241, 1560); // functionExprParameters
        op[1543] = getOpcodeRep((char)0, (char)1, 1544);
        op[1544] = getOpcodeRnm(235, 1494); // collectionPathExpr
        {int[] a = {1546,1547,1548}; op[1545] = getOpcodeCat(a);}
        op[1546] = getOpcodeRnm(162, 1037); // complexFunction
        op[1547] = getOpcodeRnm(241, 1560); // functionExprParameters
        op[1548] = getOpcodeRep((char)0, (char)1, 1549);
        op[1549] = getOpcodeRnm(236, 1505); // complexPathExpr
        {int[] a = {1551,1552,1553}; op[1550] = getOpcodeCat(a);}
        op[1551] = getOpcodeRnm(165, 1040); // primitiveColFunction
        op[1552] = getOpcodeRnm(241, 1560); // functionExprParameters
        op[1553] = getOpcodeRep((char)0, (char)1, 1554);
        op[1554] = getOpcodeRnm(235, 1494); // collectionPathExpr
        {int[] a = {1556,1557,1558}; op[1555] = getOpcodeCat(a);}
        op[1556] = getOpcodeRnm(164, 1039); // primitiveFunction
        op[1557] = getOpcodeRnm(241, 1560); // functionExprParameters
        op[1558] = getOpcodeRep((char)0, (char)1, 1559);
        op[1559] = getOpcodeRnm(237, 1521); // singlePathExpr
        {int[] a = {1561,1562,1569}; op[1560] = getOpcodeCat(a);}
        {char[] a = {40}; op[1561] = getOpcodeTls(a);}
        op[1562] = getOpcodeRep((char)0, (char)1, 1563);
        {int[] a = {1564,1565}; op[1563] = getOpcodeCat(a);}
        op[1564] = getOpcodeRnm(242, 1570); // functionExprParameter
        op[1565] = getOpcodeRep((char)0, Character.MAX_VALUE, 1566);
        {int[] a = {1567,1568}; op[1566] = getOpcodeCat(a);}
        {char[] a = {44}; op[1567] = getOpcodeTls(a);}
        op[1568] = getOpcodeRnm(242, 1570); // functionExprParameter
        {char[] a = {41}; op[1569] = getOpcodeTls(a);}
        {int[] a = {1571,1572,1573}; op[1570] = getOpcodeCat(a);}
        op[1571] = getOpcodeRnm(197, 1262); // functionParameterName
        {char[] a = {61}; op[1572] = getOpcodeTls(a);}
        op[1573] = getOpcodeRnm(201, 1274); // parameterValue
        {int[] a = {1575,1576,1581}; op[1574] = getOpcodeCat(a);}
        {char[] a = {97,110,121,40}; op[1575] = getOpcodeTls(a);}
        op[1576] = getOpcodeRep((char)0, (char)1, 1577);
        {int[] a = {1578,1579,1580}; op[1577] = getOpcodeCat(a);}
        op[1578] = getOpcodeRnm(232, 1478); // lambdaVariableExpr
        {char[] a = {58}; op[1579] = getOpcodeTls(a);}
        op[1580] = getOpcodeRnm(245, 1588); // lambdaPredicateExpr
        {char[] a = {41}; op[1581] = getOpcodeTls(a);}
        {int[] a = {1583,1584,1585,1586,1587}; op[1582] = getOpcodeCat(a);}
        {char[] a = {97,108,108,40}; op[1583] = getOpcodeTls(a);}
        op[1584] = getOpcodeRnm(232, 1478); // lambdaVariableExpr
        {char[] a = {58}; op[1585] = getOpcodeTls(a);}
        op[1586] = getOpcodeRnm(245, 1588); // lambdaPredicateExpr
        {char[] a = {41}; op[1587] = getOpcodeTls(a);}
        op[1588] = getOpcodeRnm(225, 1417); // boolCommonExpr
        {int[] a = {1590,1591,1592,1593,1594,1595,1596,1597,1598,1599,1600,1601,1602,1603,1604,1605,1606,1607,1608,1609,1610,1611,1612,1613,1614,1615}; op[1589] = getOpcodeAlt(a);}
        op[1590] = getOpcodeRnm(247, 1616); // boolMethodCallExpr
        op[1591] = getOpcodeRnm(252, 1663); // indexOfMethodCallExpr
        op[1592] = getOpcodeRnm(254, 1689); // toLowerMethodCallExpr
        op[1593] = getOpcodeRnm(255, 1698); // toUpperMethodCallExpr
        op[1594] = getOpcodeRnm(256, 1707); // trimMethodCallExpr
        op[1595] = getOpcodeRnm(253, 1674); // substringMethodCallExpr
        op[1596] = getOpcodeRnm(257, 1716); // concatMethodCallExpr
        op[1597] = getOpcodeRnm(251, 1654); // lengthMethodCallExpr
        op[1598] = getOpcodeRnm(258, 1727); // yearMethodCallExpr
        op[1599] = getOpcodeRnm(259, 1736); // yearsMethodCallExpr
        op[1600] = getOpcodeRnm(260, 1745); // monthMethodCallExpr
        op[1601] = getOpcodeRnm(261, 1754); // monthsMethodCallExpr
        op[1602] = getOpcodeRnm(262, 1763); // dayMethodCallExpr
        op[1603] = getOpcodeRnm(263, 1772); // daysMethodCallExpr
        op[1604] = getOpcodeRnm(264, 1781); // hourMethodCallExpr
        op[1605] = getOpcodeRnm(265, 1790); // hoursMethodCallExpr
        op[1606] = getOpcodeRnm(266, 1799); // minuteMethodCallExpr
        op[1607] = getOpcodeRnm(267, 1808); // minutesMethodCallExpr
        op[1608] = getOpcodeRnm(268, 1817); // secondMethodCallExpr
        op[1609] = getOpcodeRnm(269, 1826); // secondsMethodCallExpr
        op[1610] = getOpcodeRnm(270, 1835); // roundMethodCallExpr
        op[1611] = getOpcodeRnm(271, 1844); // floorMethodCallExpr
        op[1612] = getOpcodeRnm(272, 1853); // ceilingMethodCallExpr
        op[1613] = getOpcodeRnm(294, 2040); // distanceMethodCallExpr
        op[1614] = getOpcodeRnm(295, 2051); // geoLengthMethodCallExpr
        op[1615] = getOpcodeRnm(293, 2031); // getTotalOffsetMinutesExpr
        {int[] a = {1617,1618,1619,1620}; op[1616] = getOpcodeAlt(a);}
        op[1617] = getOpcodeRnm(250, 1643); // endsWithMethodCallExpr
        op[1618] = getOpcodeRnm(249, 1632); // startsWithMethodCallExpr
        op[1619] = getOpcodeRnm(248, 1621); // substringOfMethodCallExpr
        op[1620] = getOpcodeRnm(296, 2060); // intersectsMethodCallExpr
        {int[] a = {1622,1623,1624,1626,1627,1628,1629,1631}; op[1621] = getOpcodeCat(a);}
        {char[] a = {115,117,98,115,116,114,105,110,103,111,102}; op[1622] = getOpcodeTls(a);}
        {char[] a = {40}; op[1623] = getOpcodeTls(a);}
        op[1624] = getOpcodeRep((char)0, Character.MAX_VALUE, 1625);
        op[1625] = getOpcodeRnm(34, 245); // WSP
        op[1626] = getOpcodeRnm(224, 1403); // commonExpr
        {char[] a = {44}; op[1627] = getOpcodeTls(a);}
        op[1628] = getOpcodeRnm(224, 1403); // commonExpr
        op[1629] = getOpcodeRep((char)0, Character.MAX_VALUE, 1630);
        op[1630] = getOpcodeRnm(34, 245); // WSP
        {char[] a = {41}; op[1631] = getOpcodeTls(a);}
        {int[] a = {1633,1634,1635,1637,1638,1639,1640,1642}; op[1632] = getOpcodeCat(a);}
        {char[] a = {115,116,97,114,116,115,119,105,116,104}; op[1633] = getOpcodeTls(a);}
        {char[] a = {40}; op[1634] = getOpcodeTls(a);}
        op[1635] = getOpcodeRep((char)0, Character.MAX_VALUE, 1636);
        op[1636] = getOpcodeRnm(34, 245); // WSP
        op[1637] = getOpcodeRnm(224, 1403); // commonExpr
        {char[] a = {44}; op[1638] = getOpcodeTls(a);}
        op[1639] = getOpcodeRnm(224, 1403); // commonExpr
        op[1640] = getOpcodeRep((char)0, Character.MAX_VALUE, 1641);
        op[1641] = getOpcodeRnm(34, 245); // WSP
        {char[] a = {41}; op[1642] = getOpcodeTls(a);}
        {int[] a = {1644,1645,1646,1648,1649,1650,1651,1653}; op[1643] = getOpcodeCat(a);}
        {char[] a = {101,110,100,115,119,105,116,104}; op[1644] = getOpcodeTls(a);}
        {char[] a = {40}; op[1645] = getOpcodeTls(a);}
        op[1646] = getOpcodeRep((char)0, Character.MAX_VALUE, 1647);
        op[1647] = getOpcodeRnm(34, 245); // WSP
        op[1648] = getOpcodeRnm(224, 1403); // commonExpr
        {char[] a = {44}; op[1649] = getOpcodeTls(a);}
        op[1650] = getOpcodeRnm(224, 1403); // commonExpr
        op[1651] = getOpcodeRep((char)0, Character.MAX_VALUE, 1652);
        op[1652] = getOpcodeRnm(34, 245); // WSP
        {char[] a = {41}; op[1653] = getOpcodeTls(a);}
        {int[] a = {1655,1656,1657,1659,1660,1662}; op[1654] = getOpcodeCat(a);}
        {char[] a = {108,101,110,103,116,104}; op[1655] = getOpcodeTls(a);}
        {char[] a = {40}; op[1656] = getOpcodeTls(a);}
        op[1657] = getOpcodeRep((char)0, Character.MAX_VALUE, 1658);
        op[1658] = getOpcodeRnm(34, 245); // WSP
        op[1659] = getOpcodeRnm(224, 1403); // commonExpr
        op[1660] = getOpcodeRep((char)0, Character.MAX_VALUE, 1661);
        op[1661] = getOpcodeRnm(34, 245); // WSP
        {char[] a = {41}; op[1662] = getOpcodeTls(a);}
        {int[] a = {1664,1665,1666,1668,1669,1670,1671,1673}; op[1663] = getOpcodeCat(a);}
        {char[] a = {105,110,100,101,120,111,102}; op[1664] = getOpcodeTls(a);}
        {char[] a = {40}; op[1665] = getOpcodeTls(a);}
        op[1666] = getOpcodeRep((char)0, Character.MAX_VALUE, 1667);
        op[1667] = getOpcodeRnm(34, 245); // WSP
        op[1668] = getOpcodeRnm(224, 1403); // commonExpr
        {char[] a = {44}; op[1669] = getOpcodeTls(a);}
        op[1670] = getOpcodeRnm(224, 1403); // commonExpr
        op[1671] = getOpcodeRep((char)0, Character.MAX_VALUE, 1672);
        op[1672] = getOpcodeRnm(34, 245); // WSP
        {char[] a = {41}; op[1673] = getOpcodeTls(a);}
        {int[] a = {1675,1676,1677,1679,1680,1681,1682,1688}; op[1674] = getOpcodeCat(a);}
        {char[] a = {115,117,98,115,116,114,105,110,103}; op[1675] = getOpcodeTls(a);}
        {char[] a = {40}; op[1676] = getOpcodeTls(a);}
        op[1677] = getOpcodeRep((char)0, Character.MAX_VALUE, 1678);
        op[1678] = getOpcodeRnm(34, 245); // WSP
        op[1679] = getOpcodeRnm(224, 1403); // commonExpr
        {char[] a = {44}; op[1680] = getOpcodeTls(a);}
        op[1681] = getOpcodeRnm(224, 1403); // commonExpr
        op[1682] = getOpcodeRep((char)0, (char)1, 1683);
        {int[] a = {1684,1685,1686}; op[1683] = getOpcodeCat(a);}
        {char[] a = {44}; op[1684] = getOpcodeTls(a);}
        op[1685] = getOpcodeRnm(224, 1403); // commonExpr
        op[1686] = getOpcodeRep((char)0, Character.MAX_VALUE, 1687);
        op[1687] = getOpcodeRnm(34, 245); // WSP
        {char[] a = {41}; op[1688] = getOpcodeTls(a);}
        {int[] a = {1690,1691,1692,1694,1695,1697}; op[1689] = getOpcodeCat(a);}
        {char[] a = {116,111,108,111,119,101,114}; op[1690] = getOpcodeTls(a);}
        {char[] a = {40}; op[1691] = getOpcodeTls(a);}
        op[1692] = getOpcodeRep((char)0, Character.MAX_VALUE, 1693);
        op[1693] = getOpcodeRnm(34, 245); // WSP
        op[1694] = getOpcodeRnm(224, 1403); // commonExpr
        op[1695] = getOpcodeRep((char)0, Character.MAX_VALUE, 1696);
        op[1696] = getOpcodeRnm(34, 245); // WSP
        {char[] a = {41}; op[1697] = getOpcodeTls(a);}
        {int[] a = {1699,1700,1701,1703,1704,1706}; op[1698] = getOpcodeCat(a);}
        {char[] a = {116,111,117,112,112,101,114}; op[1699] = getOpcodeTls(a);}
        {char[] a = {40}; op[1700] = getOpcodeTls(a);}
        op[1701] = getOpcodeRep((char)0, Character.MAX_VALUE, 1702);
        op[1702] = getOpcodeRnm(34, 245); // WSP
        op[1703] = getOpcodeRnm(224, 1403); // commonExpr
        op[1704] = getOpcodeRep((char)0, Character.MAX_VALUE, 1705);
        op[1705] = getOpcodeRnm(34, 245); // WSP
        {char[] a = {41}; op[1706] = getOpcodeTls(a);}
        {int[] a = {1708,1709,1710,1712,1713,1715}; op[1707] = getOpcodeCat(a);}
        {char[] a = {116,114,105,109}; op[1708] = getOpcodeTls(a);}
        {char[] a = {40}; op[1709] = getOpcodeTls(a);}
        op[1710] = getOpcodeRep((char)0, Character.MAX_VALUE, 1711);
        op[1711] = getOpcodeRnm(34, 245); // WSP
        op[1712] = getOpcodeRnm(224, 1403); // commonExpr
        op[1713] = getOpcodeRep((char)0, Character.MAX_VALUE, 1714);
        op[1714] = getOpcodeRnm(34, 245); // WSP
        {char[] a = {41}; op[1715] = getOpcodeTls(a);}
        {int[] a = {1717,1718,1719,1721,1722,1723,1724,1726}; op[1716] = getOpcodeCat(a);}
        {char[] a = {99,111,110,99,97,116}; op[1717] = getOpcodeTls(a);}
        {char[] a = {40}; op[1718] = getOpcodeTls(a);}
        op[1719] = getOpcodeRep((char)0, Character.MAX_VALUE, 1720);
        op[1720] = getOpcodeRnm(34, 245); // WSP
        op[1721] = getOpcodeRnm(224, 1403); // commonExpr
        {char[] a = {44}; op[1722] = getOpcodeTls(a);}
        op[1723] = getOpcodeRnm(224, 1403); // commonExpr
        op[1724] = getOpcodeRep((char)0, Character.MAX_VALUE, 1725);
        op[1725] = getOpcodeRnm(34, 245); // WSP
        {char[] a = {41}; op[1726] = getOpcodeTls(a);}
        {int[] a = {1728,1729,1730,1732,1733,1735}; op[1727] = getOpcodeCat(a);}
        {char[] a = {121,101,97,114}; op[1728] = getOpcodeTls(a);}
        {char[] a = {40}; op[1729] = getOpcodeTls(a);}
        op[1730] = getOpcodeRep((char)0, Character.MAX_VALUE, 1731);
        op[1731] = getOpcodeRnm(34, 245); // WSP
        op[1732] = getOpcodeRnm(224, 1403); // commonExpr
        op[1733] = getOpcodeRep((char)0, Character.MAX_VALUE, 1734);
        op[1734] = getOpcodeRnm(34, 245); // WSP
        {char[] a = {41}; op[1735] = getOpcodeTls(a);}
        {int[] a = {1737,1738,1739,1741,1742,1744}; op[1736] = getOpcodeCat(a);}
        {char[] a = {121,101,97,114,115}; op[1737] = getOpcodeTls(a);}
        {char[] a = {40}; op[1738] = getOpcodeTls(a);}
        op[1739] = getOpcodeRep((char)0, Character.MAX_VALUE, 1740);
        op[1740] = getOpcodeRnm(34, 245); // WSP
        op[1741] = getOpcodeRnm(224, 1403); // commonExpr
        op[1742] = getOpcodeRep((char)0, Character.MAX_VALUE, 1743);
        op[1743] = getOpcodeRnm(34, 245); // WSP
        {char[] a = {41}; op[1744] = getOpcodeTls(a);}
        {int[] a = {1746,1747,1748,1750,1751,1753}; op[1745] = getOpcodeCat(a);}
        {char[] a = {109,111,110,116,104}; op[1746] = getOpcodeTls(a);}
        {char[] a = {40}; op[1747] = getOpcodeTls(a);}
        op[1748] = getOpcodeRep((char)0, Character.MAX_VALUE, 1749);
        op[1749] = getOpcodeRnm(34, 245); // WSP
        op[1750] = getOpcodeRnm(224, 1403); // commonExpr
        op[1751] = getOpcodeRep((char)0, Character.MAX_VALUE, 1752);
        op[1752] = getOpcodeRnm(34, 245); // WSP
        {char[] a = {41}; op[1753] = getOpcodeTls(a);}
        {int[] a = {1755,1756,1757,1759,1760,1762}; op[1754] = getOpcodeCat(a);}
        {char[] a = {109,111,110,116,104,115}; op[1755] = getOpcodeTls(a);}
        {char[] a = {40}; op[1756] = getOpcodeTls(a);}
        op[1757] = getOpcodeRep((char)0, Character.MAX_VALUE, 1758);
        op[1758] = getOpcodeRnm(34, 245); // WSP
        op[1759] = getOpcodeRnm(224, 1403); // commonExpr
        op[1760] = getOpcodeRep((char)0, Character.MAX_VALUE, 1761);
        op[1761] = getOpcodeRnm(34, 245); // WSP
        {char[] a = {41}; op[1762] = getOpcodeTls(a);}
        {int[] a = {1764,1765,1766,1768,1769,1771}; op[1763] = getOpcodeCat(a);}
        {char[] a = {100,97,121}; op[1764] = getOpcodeTls(a);}
        {char[] a = {40}; op[1765] = getOpcodeTls(a);}
        op[1766] = getOpcodeRep((char)0, Character.MAX_VALUE, 1767);
        op[1767] = getOpcodeRnm(34, 245); // WSP
        op[1768] = getOpcodeRnm(224, 1403); // commonExpr
        op[1769] = getOpcodeRep((char)0, Character.MAX_VALUE, 1770);
        op[1770] = getOpcodeRnm(34, 245); // WSP
        {char[] a = {41}; op[1771] = getOpcodeTls(a);}
        {int[] a = {1773,1774,1775,1777,1778,1780}; op[1772] = getOpcodeCat(a);}
        {char[] a = {100,97,121,115}; op[1773] = getOpcodeTls(a);}
        {char[] a = {40}; op[1774] = getOpcodeTls(a);}
        op[1775] = getOpcodeRep((char)0, Character.MAX_VALUE, 1776);
        op[1776] = getOpcodeRnm(34, 245); // WSP
        op[1777] = getOpcodeRnm(224, 1403); // commonExpr
        op[1778] = getOpcodeRep((char)0, Character.MAX_VALUE, 1779);
        op[1779] = getOpcodeRnm(34, 245); // WSP
        {char[] a = {41}; op[1780] = getOpcodeTls(a);}
        {int[] a = {1782,1783,1784,1786,1787,1789}; op[1781] = getOpcodeCat(a);}
        {char[] a = {104,111,117,114}; op[1782] = getOpcodeTls(a);}
        {char[] a = {40}; op[1783] = getOpcodeTls(a);}
        op[1784] = getOpcodeRep((char)0, Character.MAX_VALUE, 1785);
        op[1785] = getOpcodeRnm(34, 245); // WSP
        op[1786] = getOpcodeRnm(224, 1403); // commonExpr
        op[1787] = getOpcodeRep((char)0, Character.MAX_VALUE, 1788);
        op[1788] = getOpcodeRnm(34, 245); // WSP
        {char[] a = {41}; op[1789] = getOpcodeTls(a);}
        {int[] a = {1791,1792,1793,1795,1796,1798}; op[1790] = getOpcodeCat(a);}
        {char[] a = {104,111,117,114,115}; op[1791] = getOpcodeTls(a);}
        {char[] a = {40}; op[1792] = getOpcodeTls(a);}
        op[1793] = getOpcodeRep((char)0, Character.MAX_VALUE, 1794);
        op[1794] = getOpcodeRnm(34, 245); // WSP
        op[1795] = getOpcodeRnm(224, 1403); // commonExpr
        op[1796] = getOpcodeRep((char)0, Character.MAX_VALUE, 1797);
        op[1797] = getOpcodeRnm(34, 245); // WSP
        {char[] a = {41}; op[1798] = getOpcodeTls(a);}
        {int[] a = {1800,1801,1802,1804,1805,1807}; op[1799] = getOpcodeCat(a);}
        {char[] a = {109,105,110,117,116,101}; op[1800] = getOpcodeTls(a);}
        {char[] a = {40}; op[1801] = getOpcodeTls(a);}
        op[1802] = getOpcodeRep((char)0, Character.MAX_VALUE, 1803);
        op[1803] = getOpcodeRnm(34, 245); // WSP
        op[1804] = getOpcodeRnm(224, 1403); // commonExpr
        op[1805] = getOpcodeRep((char)0, Character.MAX_VALUE, 1806);
        op[1806] = getOpcodeRnm(34, 245); // WSP
        {char[] a = {41}; op[1807] = getOpcodeTls(a);}
        {int[] a = {1809,1810,1811,1813,1814,1816}; op[1808] = getOpcodeCat(a);}
        {char[] a = {109,105,110,117,116,101,115}; op[1809] = getOpcodeTls(a);}
        {char[] a = {40}; op[1810] = getOpcodeTls(a);}
        op[1811] = getOpcodeRep((char)0, Character.MAX_VALUE, 1812);
        op[1812] = getOpcodeRnm(34, 245); // WSP
        op[1813] = getOpcodeRnm(224, 1403); // commonExpr
        op[1814] = getOpcodeRep((char)0, Character.MAX_VALUE, 1815);
        op[1815] = getOpcodeRnm(34, 245); // WSP
        {char[] a = {41}; op[1816] = getOpcodeTls(a);}
        {int[] a = {1818,1819,1820,1822,1823,1825}; op[1817] = getOpcodeCat(a);}
        {char[] a = {115,101,99,111,110,100}; op[1818] = getOpcodeTls(a);}
        {char[] a = {40}; op[1819] = getOpcodeTls(a);}
        op[1820] = getOpcodeRep((char)0, Character.MAX_VALUE, 1821);
        op[1821] = getOpcodeRnm(34, 245); // WSP
        op[1822] = getOpcodeRnm(224, 1403); // commonExpr
        op[1823] = getOpcodeRep((char)0, Character.MAX_VALUE, 1824);
        op[1824] = getOpcodeRnm(34, 245); // WSP
        {char[] a = {41}; op[1825] = getOpcodeTls(a);}
        {int[] a = {1827,1828,1829,1831,1832,1834}; op[1826] = getOpcodeCat(a);}
        {char[] a = {115,101,99,111,110,100,115}; op[1827] = getOpcodeTls(a);}
        {char[] a = {40}; op[1828] = getOpcodeTls(a);}
        op[1829] = getOpcodeRep((char)0, Character.MAX_VALUE, 1830);
        op[1830] = getOpcodeRnm(34, 245); // WSP
        op[1831] = getOpcodeRnm(224, 1403); // commonExpr
        op[1832] = getOpcodeRep((char)0, Character.MAX_VALUE, 1833);
        op[1833] = getOpcodeRnm(34, 245); // WSP
        {char[] a = {41}; op[1834] = getOpcodeTls(a);}
        {int[] a = {1836,1837,1838,1840,1841,1843}; op[1835] = getOpcodeCat(a);}
        {char[] a = {114,111,117,110,100}; op[1836] = getOpcodeTls(a);}
        {char[] a = {40}; op[1837] = getOpcodeTls(a);}
        op[1838] = getOpcodeRep((char)0, Character.MAX_VALUE, 1839);
        op[1839] = getOpcodeRnm(34, 245); // WSP
        op[1840] = getOpcodeRnm(224, 1403); // commonExpr
        op[1841] = getOpcodeRep((char)0, Character.MAX_VALUE, 1842);
        op[1842] = getOpcodeRnm(34, 245); // WSP
        {char[] a = {41}; op[1843] = getOpcodeTls(a);}
        {int[] a = {1845,1846,1847,1849,1850,1852}; op[1844] = getOpcodeCat(a);}
        {char[] a = {102,108,111,111,114}; op[1845] = getOpcodeTls(a);}
        {char[] a = {40}; op[1846] = getOpcodeTls(a);}
        op[1847] = getOpcodeRep((char)0, Character.MAX_VALUE, 1848);
        op[1848] = getOpcodeRnm(34, 245); // WSP
        op[1849] = getOpcodeRnm(224, 1403); // commonExpr
        op[1850] = getOpcodeRep((char)0, Character.MAX_VALUE, 1851);
        op[1851] = getOpcodeRnm(34, 245); // WSP
        {char[] a = {41}; op[1852] = getOpcodeTls(a);}
        {int[] a = {1854,1855,1856,1858,1859,1861}; op[1853] = getOpcodeCat(a);}
        {char[] a = {99,101,105,108,105,110,103}; op[1854] = getOpcodeTls(a);}
        {char[] a = {40}; op[1855] = getOpcodeTls(a);}
        op[1856] = getOpcodeRep((char)0, Character.MAX_VALUE, 1857);
        op[1857] = getOpcodeRnm(34, 245); // WSP
        op[1858] = getOpcodeRnm(224, 1403); // commonExpr
        op[1859] = getOpcodeRep((char)0, Character.MAX_VALUE, 1860);
        op[1860] = getOpcodeRnm(34, 245); // WSP
        {char[] a = {41}; op[1861] = getOpcodeTls(a);}
        {int[] a = {1863,1864,1866,1867,1869}; op[1862] = getOpcodeCat(a);}
        {char[] a = {40}; op[1863] = getOpcodeTls(a);}
        op[1864] = getOpcodeRep((char)0, Character.MAX_VALUE, 1865);
        op[1865] = getOpcodeRnm(34, 245); // WSP
        op[1866] = getOpcodeRnm(224, 1403); // commonExpr
        op[1867] = getOpcodeRep((char)0, Character.MAX_VALUE, 1868);
        op[1868] = getOpcodeRnm(34, 245); // WSP
        {char[] a = {41}; op[1869] = getOpcodeTls(a);}
        {int[] a = {1871,1872,1874,1875,1877}; op[1870] = getOpcodeCat(a);}
        {char[] a = {40}; op[1871] = getOpcodeTls(a);}
        op[1872] = getOpcodeRep((char)0, Character.MAX_VALUE, 1873);
        op[1873] = getOpcodeRnm(34, 245); // WSP
        op[1874] = getOpcodeRnm(225, 1417); // boolCommonExpr
        op[1875] = getOpcodeRep((char)0, Character.MAX_VALUE, 1876);
        op[1876] = getOpcodeRnm(34, 245); // WSP
        {char[] a = {41}; op[1877] = getOpcodeTls(a);}
        {int[] a = {1879,1880,1882,1883,1885}; op[1878] = getOpcodeCat(a);}
        op[1879] = getOpcodeRnm(225, 1417); // boolCommonExpr
        op[1880] = getOpcodeRep((char)1, Character.MAX_VALUE, 1881);
        op[1881] = getOpcodeRnm(34, 245); // WSP
        {char[] a = {97,110,100}; op[1882] = getOpcodeTls(a);}
        op[1883] = getOpcodeRep((char)1, Character.MAX_VALUE, 1884);
        op[1884] = getOpcodeRnm(34, 245); // WSP
        op[1885] = getOpcodeRnm(225, 1417); // boolCommonExpr
        {int[] a = {1887,1888,1890,1891,1893}; op[1886] = getOpcodeCat(a);}
        op[1887] = getOpcodeRnm(225, 1417); // boolCommonExpr
        op[1888] = getOpcodeRep((char)1, Character.MAX_VALUE, 1889);
        op[1889] = getOpcodeRnm(34, 245); // WSP
        {char[] a = {111,114}; op[1890] = getOpcodeTls(a);}
        op[1891] = getOpcodeRep((char)1, Character.MAX_VALUE, 1892);
        op[1892] = getOpcodeRnm(34, 245); // WSP
        op[1893] = getOpcodeRnm(225, 1417); // boolCommonExpr
        {int[] a = {1895,1896,1898,1899,1901}; op[1894] = getOpcodeCat(a);}
        op[1895] = getOpcodeRnm(224, 1403); // commonExpr
        op[1896] = getOpcodeRep((char)1, Character.MAX_VALUE, 1897);
        op[1897] = getOpcodeRnm(34, 245); // WSP
        {char[] a = {101,113}; op[1898] = getOpcodeTls(a);}
        op[1899] = getOpcodeRep((char)1, Character.MAX_VALUE, 1900);
        op[1900] = getOpcodeRnm(34, 245); // WSP
        op[1901] = getOpcodeRnm(224, 1403); // commonExpr
        {int[] a = {1903,1904,1906,1907,1909}; op[1902] = getOpcodeCat(a);}
        op[1903] = getOpcodeRnm(224, 1403); // commonExpr
        op[1904] = getOpcodeRep((char)1, Character.MAX_VALUE, 1905);
        op[1905] = getOpcodeRnm(34, 245); // WSP
        {char[] a = {110,101}; op[1906] = getOpcodeTls(a);}
        op[1907] = getOpcodeRep((char)1, Character.MAX_VALUE, 1908);
        op[1908] = getOpcodeRnm(34, 245); // WSP
        op[1909] = getOpcodeRnm(224, 1403); // commonExpr
        {int[] a = {1911,1912,1914,1915,1917}; op[1910] = getOpcodeCat(a);}
        op[1911] = getOpcodeRnm(224, 1403); // commonExpr
        op[1912] = getOpcodeRep((char)1, Character.MAX_VALUE, 1913);
        op[1913] = getOpcodeRnm(34, 245); // WSP
        {char[] a = {108,116}; op[1914] = getOpcodeTls(a);}
        op[1915] = getOpcodeRep((char)1, Character.MAX_VALUE, 1916);
        op[1916] = getOpcodeRnm(34, 245); // WSP
        op[1917] = getOpcodeRnm(224, 1403); // commonExpr
        {int[] a = {1919,1920,1922,1923,1925}; op[1918] = getOpcodeCat(a);}
        op[1919] = getOpcodeRnm(224, 1403); // commonExpr
        op[1920] = getOpcodeRep((char)1, Character.MAX_VALUE, 1921);
        op[1921] = getOpcodeRnm(34, 245); // WSP
        {char[] a = {108,101}; op[1922] = getOpcodeTls(a);}
        op[1923] = getOpcodeRep((char)1, Character.MAX_VALUE, 1924);
        op[1924] = getOpcodeRnm(34, 245); // WSP
        op[1925] = getOpcodeRnm(224, 1403); // commonExpr
        {int[] a = {1927,1928,1930,1931,1933}; op[1926] = getOpcodeCat(a);}
        op[1927] = getOpcodeRnm(224, 1403); // commonExpr
        op[1928] = getOpcodeRep((char)1, Character.MAX_VALUE, 1929);
        op[1929] = getOpcodeRnm(34, 245); // WSP
        {char[] a = {103,116}; op[1930] = getOpcodeTls(a);}
        op[1931] = getOpcodeRep((char)1, Character.MAX_VALUE, 1932);
        op[1932] = getOpcodeRnm(34, 245); // WSP
        op[1933] = getOpcodeRnm(224, 1403); // commonExpr
        {int[] a = {1935,1936,1938,1939,1941}; op[1934] = getOpcodeCat(a);}
        op[1935] = getOpcodeRnm(224, 1403); // commonExpr
        op[1936] = getOpcodeRep((char)1, Character.MAX_VALUE, 1937);
        op[1937] = getOpcodeRnm(34, 245); // WSP
        {char[] a = {103,101}; op[1938] = getOpcodeTls(a);}
        op[1939] = getOpcodeRep((char)1, Character.MAX_VALUE, 1940);
        op[1940] = getOpcodeRnm(34, 245); // WSP
        op[1941] = getOpcodeRnm(224, 1403); // commonExpr
        {int[] a = {1943,1944,1946,1947,1949}; op[1942] = getOpcodeCat(a);}
        op[1943] = getOpcodeRnm(224, 1403); // commonExpr
        op[1944] = getOpcodeRep((char)1, Character.MAX_VALUE, 1945);
        op[1945] = getOpcodeRnm(34, 245); // WSP
        {char[] a = {97,100,100}; op[1946] = getOpcodeTls(a);}
        op[1947] = getOpcodeRep((char)1, Character.MAX_VALUE, 1948);
        op[1948] = getOpcodeRnm(34, 245); // WSP
        op[1949] = getOpcodeRnm(224, 1403); // commonExpr
        {int[] a = {1951,1952,1954,1955,1957}; op[1950] = getOpcodeCat(a);}
        op[1951] = getOpcodeRnm(224, 1403); // commonExpr
        op[1952] = getOpcodeRep((char)1, Character.MAX_VALUE, 1953);
        op[1953] = getOpcodeRnm(34, 245); // WSP
        {char[] a = {115,117,98}; op[1954] = getOpcodeTls(a);}
        op[1955] = getOpcodeRep((char)1, Character.MAX_VALUE, 1956);
        op[1956] = getOpcodeRnm(34, 245); // WSP
        op[1957] = getOpcodeRnm(224, 1403); // commonExpr
        {int[] a = {1959,1960,1962,1963,1965}; op[1958] = getOpcodeCat(a);}
        op[1959] = getOpcodeRnm(224, 1403); // commonExpr
        op[1960] = getOpcodeRep((char)1, Character.MAX_VALUE, 1961);
        op[1961] = getOpcodeRnm(34, 245); // WSP
        {char[] a = {109,117,108}; op[1962] = getOpcodeTls(a);}
        op[1963] = getOpcodeRep((char)1, Character.MAX_VALUE, 1964);
        op[1964] = getOpcodeRnm(34, 245); // WSP
        op[1965] = getOpcodeRnm(224, 1403); // commonExpr
        {int[] a = {1967,1968,1970,1971,1973}; op[1966] = getOpcodeCat(a);}
        op[1967] = getOpcodeRnm(224, 1403); // commonExpr
        op[1968] = getOpcodeRep((char)1, Character.MAX_VALUE, 1969);
        op[1969] = getOpcodeRnm(34, 245); // WSP
        {char[] a = {100,105,118}; op[1970] = getOpcodeTls(a);}
        op[1971] = getOpcodeRep((char)1, Character.MAX_VALUE, 1972);
        op[1972] = getOpcodeRnm(34, 245); // WSP
        op[1973] = getOpcodeRnm(224, 1403); // commonExpr
        {int[] a = {1975,1976,1978,1979,1981}; op[1974] = getOpcodeCat(a);}
        op[1975] = getOpcodeRnm(224, 1403); // commonExpr
        op[1976] = getOpcodeRep((char)1, Character.MAX_VALUE, 1977);
        op[1977] = getOpcodeRnm(34, 245); // WSP
        {char[] a = {109,111,100}; op[1978] = getOpcodeTls(a);}
        op[1979] = getOpcodeRep((char)1, Character.MAX_VALUE, 1980);
        op[1980] = getOpcodeRnm(34, 245); // WSP
        op[1981] = getOpcodeRnm(224, 1403); // commonExpr
        {int[] a = {1983,1984,1986}; op[1982] = getOpcodeCat(a);}
        {char[] a = {45}; op[1983] = getOpcodeTls(a);}
        op[1984] = getOpcodeRep((char)0, Character.MAX_VALUE, 1985);
        op[1985] = getOpcodeRnm(34, 245); // WSP
        op[1986] = getOpcodeRnm(224, 1403); // commonExpr
        {int[] a = {1988,1989,1991}; op[1987] = getOpcodeCat(a);}
        {char[] a = {110,111,116}; op[1988] = getOpcodeTls(a);}
        op[1989] = getOpcodeRep((char)1, Character.MAX_VALUE, 1990);
        op[1990] = getOpcodeRnm(34, 245); // WSP
        op[1991] = getOpcodeRnm(225, 1417); // boolCommonExpr
        {int[] a = {1993,1994,1995,1997,2001,2002,2004}; op[1992] = getOpcodeCat(a);}
        {char[] a = {105,115,111,102}; op[1993] = getOpcodeTls(a);}
        {char[] a = {40}; op[1994] = getOpcodeTls(a);}
        op[1995] = getOpcodeRep((char)0, Character.MAX_VALUE, 1996);
        op[1996] = getOpcodeRnm(34, 245); // WSP
        op[1997] = getOpcodeRep((char)0, (char)1, 1998);
        {int[] a = {1999,2000}; op[1998] = getOpcodeCat(a);}
        op[1999] = getOpcodeRnm(224, 1403); // commonExpr
        {char[] a = {44}; op[2000] = getOpcodeTls(a);}
        op[2001] = getOpcodeRnm(139, 945); // qualifiedTypeName
        op[2002] = getOpcodeRep((char)0, Character.MAX_VALUE, 2003);
        op[2003] = getOpcodeRnm(34, 245); // WSP
        {char[] a = {41}; op[2004] = getOpcodeTls(a);}
        {int[] a = {2006,2007,2008,2010,2014,2015,2017}; op[2005] = getOpcodeCat(a);}
        {char[] a = {99,97,115,116}; op[2006] = getOpcodeTls(a);}
        {char[] a = {40}; op[2007] = getOpcodeTls(a);}
        op[2008] = getOpcodeRep((char)0, Character.MAX_VALUE, 2009);
        op[2009] = getOpcodeRnm(34, 245); // WSP
        op[2010] = getOpcodeRep((char)0, (char)1, 2011);
        {int[] a = {2012,2013}; op[2011] = getOpcodeCat(a);}
        op[2012] = getOpcodeRnm(224, 1403); // commonExpr
        {char[] a = {44}; op[2013] = getOpcodeTls(a);}
        op[2014] = getOpcodeRnm(139, 945); // qualifiedTypeName
        op[2015] = getOpcodeRep((char)0, Character.MAX_VALUE, 2016);
        op[2016] = getOpcodeRnm(34, 245); // WSP
        {char[] a = {41}; op[2017] = getOpcodeTls(a);}
        {int[] a = {2019,2020,2021,2023,2027,2028,2030}; op[2018] = getOpcodeCat(a);}
        {char[] a = {99,97,115,116}; op[2019] = getOpcodeTls(a);}
        {char[] a = {40}; op[2020] = getOpcodeTls(a);}
        op[2021] = getOpcodeRep((char)0, Character.MAX_VALUE, 2022);
        op[2022] = getOpcodeRnm(34, 245); // WSP
        op[2023] = getOpcodeRep((char)0, (char)1, 2024);
        {int[] a = {2025,2026}; op[2024] = getOpcodeCat(a);}
        op[2025] = getOpcodeRnm(224, 1403); // commonExpr
        {char[] a = {44}; op[2026] = getOpcodeTls(a);}
        {char[] a = {69,100,109,46,66,111,111,108,101,97,110}; op[2027] = getOpcodeTls(a);}
        op[2028] = getOpcodeRep((char)0, Character.MAX_VALUE, 2029);
        op[2029] = getOpcodeRnm(34, 245); // WSP
        {char[] a = {41}; op[2030] = getOpcodeTls(a);}
        {int[] a = {2032,2033,2034,2036,2037,2039}; op[2031] = getOpcodeCat(a);}
        {char[] a = {103,101,116,116,111,116,97,108,111,102,102,115,101,116,109,105,110,117,116,101,115}; op[2032] = getOpcodeTls(a);}
        {char[] a = {40}; op[2033] = getOpcodeTls(a);}
        op[2034] = getOpcodeRep((char)0, Character.MAX_VALUE, 2035);
        op[2035] = getOpcodeRnm(34, 245); // WSP
        op[2036] = getOpcodeRnm(224, 1403); // commonExpr
        op[2037] = getOpcodeRep((char)0, Character.MAX_VALUE, 2038);
        op[2038] = getOpcodeRnm(34, 245); // WSP
        {char[] a = {41}; op[2039] = getOpcodeTls(a);}
        {int[] a = {2041,2042,2043,2045,2046,2047,2048,2050}; op[2040] = getOpcodeCat(a);}
        {char[] a = {103,101,111,46,100,105,115,116,97,110,99,101}; op[2041] = getOpcodeTls(a);}
        {char[] a = {40}; op[2042] = getOpcodeTls(a);}
        op[2043] = getOpcodeRep((char)0, Character.MAX_VALUE, 2044);
        op[2044] = getOpcodeRnm(34, 245); // WSP
        op[2045] = getOpcodeRnm(224, 1403); // commonExpr
        {char[] a = {44}; op[2046] = getOpcodeTls(a);}
        op[2047] = getOpcodeRnm(224, 1403); // commonExpr
        op[2048] = getOpcodeRep((char)0, Character.MAX_VALUE, 2049);
        op[2049] = getOpcodeRnm(34, 245); // WSP
        {char[] a = {41}; op[2050] = getOpcodeTls(a);}
        {int[] a = {2052,2053,2054,2056,2057,2059}; op[2051] = getOpcodeCat(a);}
        {char[] a = {103,101,111,46,108,101,110,103,116,104}; op[2052] = getOpcodeTls(a);}
        {char[] a = {40}; op[2053] = getOpcodeTls(a);}
        op[2054] = getOpcodeRep((char)0, Character.MAX_VALUE, 2055);
        op[2055] = getOpcodeRnm(34, 245); // WSP
        op[2056] = getOpcodeRnm(224, 1403); // commonExpr
        op[2057] = getOpcodeRep((char)0, Character.MAX_VALUE, 2058);
        op[2058] = getOpcodeRnm(34, 245); // WSP
        {char[] a = {41}; op[2059] = getOpcodeTls(a);}
        {int[] a = {2061,2062,2063,2065,2066,2067,2068,2070}; op[2060] = getOpcodeCat(a);}
        {char[] a = {103,101,111,46,105,110,116,101,114,115,101,99,116,115}; op[2061] = getOpcodeTls(a);}
        {char[] a = {40}; op[2062] = getOpcodeTls(a);}
        op[2063] = getOpcodeRep((char)0, Character.MAX_VALUE, 2064);
        op[2064] = getOpcodeRnm(34, 245); // WSP
        op[2065] = getOpcodeRnm(224, 1403); // commonExpr
        {char[] a = {44}; op[2066] = getOpcodeTls(a);}
        op[2067] = getOpcodeRnm(224, 1403); // commonExpr
        op[2068] = getOpcodeRep((char)0, Character.MAX_VALUE, 2069);
        op[2069] = getOpcodeRnm(34, 245); // WSP
        {char[] a = {41}; op[2070] = getOpcodeTls(a);}
        return op;
    }

    /** Displays the original SABNF grammar on the output device.
     * @param out the output device to display on.*/
    public static void display(PrintStream out){
        out.println(";");
        out.println("; OData.OData");
        out.println(";");
        out.println("; odata-v1.0-abnf for URI conventions");
        out.println(";");
        out.println("; The following rules assume that URIs have been percent-encoding normalized as");
        out.println("; described in section 6.2.2.2 of RFC3986 (http://tools.ietf.org/html/rfc3986#section-6.2.2) ");
        out.println("; before applying the grammar to them, i.e. all characters in the unreserved set ");
        out.println("; (see rule \"unreserved\" below) are plain literals and not percent-encoded. ");
        out.println("; In addition the characters SPACE, HTAB, DQUOTE, \":\", \"{\", \"}\", \"[\", and \"]\" must ");
        out.println("; also be stated as plain literals and not percent-encoded when occuring in the");
        out.println("; query part of a URI.");
        out.println(" ");
        out.println("; TODO: action request payloads (ODATA-80)");
        out.println("");
        out.println("; TODO: reorder rules top-down");
        out.println("");
        out.println("odataUri = \"http\" [ \"s\" ] \"://\" host [ \":\" port ] serviceRoot [ \"$metadata\" / \"$batch\" / odataRelativeUri ]  ");
        out.println("");
        out.println("serviceRoot = \"/\" *( segment-nz \"/\" )");
        out.println("");
        out.println("odataRelativeUri = resourcePath [ \"?\" queryOptions ]");
        out.println("");
        out.println("queryOptions = queryOption *(\"&\" queryOption)        ");
        out.println("queryOption  = systemQueryOption  ");
        out.println("             / aliasAndValue ");
        out.println("             / parameterNameAndValue");
        out.println("             / customQueryOption  ");
        out.println("");
        out.println("systemQueryOption = expand ");
        out.println("                  / filter ");
        out.println("                  / orderby ");
        out.println("                  / skip ");
        out.println("                  / top ");
        out.println("                  / format ");
        out.println("                  / inlinecount ");
        out.println("                  / select ");
        out.println("                  / skiptoken");
        out.println("");
        out.println("; TODO: case-sensitivity of system query option names (ODATA-117)");
        out.println("expand       = \"$expand=\" expandClause ");
        out.println("expandClause = expandItem *( \",\" expandItem )");
        out.println("expandItem   =        [ qualifiedEntityTypeName \"/\" ] navigationProperty ");
        out.println("               *( \"/\" [ qualifiedEntityTypeName \"/\" ] navigationProperty ) ");
        out.println("");
        out.println("filter = \"$filter=\" boolCommonExpr");
        out.println("");
        out.println("; TODO: case-sensitivity of asc and desc (ODATA-117)        ");
        out.println("orderby = \"$orderby=\" commonExpr [ 1*WSP ( \"asc\" / \"desc\" ) ]    ");
        out.println("             *( COMMA commonExpr [ 1*WSP ( \"asc\" / \"desc\" ) ] )");
        out.println("");
        out.println("skip = \"$skip=\" 1*DIGIT");
        out.println("top  = \"$top=\"  1*DIGIT");
        out.println("");
        out.println("format = \"$format=\" ( \"json\" ");
        out.println("                    / \"atom\"");
        out.println("                    / \"xml\" ");
        out.println("                    / 1*( pchar / \"/\" ) ; <a data service specific value ");
        out.println("                    )                   ; indicating a format specific to");
        out.println("                                        ; the specific data service> or");
        out.println("                                        ; <An IANA-defined [IANA-MMT] ");
        out.println("                                        ; content type>");
        out.println("                          ");
        out.println("inlinecount = \"$inlinecount=\" ( \"allpages\" / \"none\" )");
        out.println("");
        out.println("select       = \"$select=\" selectClause");
        out.println("selectClause = selectItem *( COMMA selectItem )");
        out.println("selectItem   = star  ");
        out.println("             / allOperationsInContainer ");
        out.println("             / [ qualifiedEntityTypeName \"/\" ] ");
        out.println("               ( ( navigationProperty [ \"/\" selectItem ] ) ");
        out.println("               / *( ( complexProperty / complexColProperty ) \"/\" ) property ");
        out.println("               / qualifiedActionName  ");
        out.println("               / qualifiedFunctionName  ");
        out.println("               )");
        out.println("allOperationsInContainer = operationQualifier star                 ");
        out.println("operationQualifier       = [ namespace \".\" ] entityContainerName \".\"");
        out.println("");
        out.println("qualifiedActionName   = [ operationQualifier ] action   [ \"(\" parameterTypeNames \")\" ]");
        out.println("qualifiedFunctionName = [ operationQualifier ] function [ \"(\" parameterTypeNames \")\" ]");
        out.println("                                                ; the parameterTypeNames are required to uniquely identify the Function");
        out.println("                                                ; only if the Function in question has overloads.");
        out.println("");
        out.println("parameterTypeNames = [ parameterTypeName *( \",\" parameterTypeName ) ]");
        out.println("                                                ; the types of all the parameters to the corresponding functionImport ");
        out.println("                                                ; in the order they are declared in the function import");
        out.println("parameterTypeName  = qualifiedTypeName ");
        out.println("");
        out.println("skiptoken = \"$skiptoken=\" 1*( unreserved / pct-encoded / other-delims /  \":\" / \"@\" / \"$\" / \"=\" ) ; everything except \"&\"");
        out.println("");
        out.println("customQueryOption = customName [ \"=\" customValue ]");
        out.println("customName        =  ( unreserved / pct-encoded / other-delims / \":\" / \"@\" )       ; MUST NOT start with \"$\"");
        out.println("                    *( unreserved / pct-encoded / other-delims / \":\" / \"@\" / \"$\" ) ; MUST NOT contain \"=\"");
        out.println("customValue       = *( unreserved / pct-encoded / other-delims / \":\" / \"@\" / \"$\" / \"=\" ) ; everything except \"&\"");
        out.println("");
        out.println("; ABNF core definitions [RFC5234]");
        out.println("ALPHA  = %x41-5A / %x61-7A ");
        out.println("DIGIT  = %x30-39 ");
        out.println("HEXDIG = DIGIT / \"A\" / \"B\" / \"C\" / \"D\" / \"E\" / \"F\" ");
        out.println("DQUOTE = %x22");
        out.println("SP     = %x20 ");
        out.println("HTAB   = %x09 ");
        out.println("WSP    = SP / HTAB ");
        out.println(";LWSP = *(WSP / CRLF WSP) ");
        out.println(";VCHAR = %x21-7E ");
        out.println(";CHAR = %x01-7F");
        out.println(";LOCTET = %x00-FF ");
        out.println(";CR     = %x0D ");
        out.println(";LF     = %x0A ");
        out.println(";CRLF   = CR LF");
        out.println(";BIT = \"0\" / \"1\" ");
        out.println("");
        out.println("; URI syntax [RFC3986]");
        out.println(";URI           = scheme \":\" hier-part [ \"?\" query ] [ \"#\" fragment ]");
        out.println(";hier-part     = \"//\" authority path-abempty");
        out.println(";              / path-absolute");
        out.println(";              / path-rootless");
        out.println(";              / path-empty");
        out.println(";URI-reference = URI / relative-ref");
        out.println(";absolute-URI  = scheme \":\" hier-part [ \"?\" query ]");
        out.println(";relative-ref  = relative-part [ \"?\" query ] [ \"#\" fragment ]");
        out.println(";relative-part = \"//\" authority path-abempty");
        out.println(";              / path-absolute");
        out.println(";              / path-noscheme");
        out.println(";              / path-empty");
        out.println(";scheme        = ALPHA *( ALPHA / DIGIT / \"+\" / \"-\" / \".\" )");
        out.println(";authority     = [ userinfo \"@\" ] host [ \":\" port ]");
        out.println(";userinfo      = *( unreserved / pct-encoded / sub-delims / \":\" )");
        out.println("host          = IP-literal / IPv4address / reg-name");
        out.println("port          = *DIGIT");
        out.println("IP-literal    = \"[\" ( IPv6address / IPvFuture  ) \"]\"");
        out.println("IPvFuture     = \"v\" 1*HEXDIG \".\" 1*( unreserved / sub-delims / \":\" )");
        out.println("IPv6address   =                            6( h16 \":\" ) ls32");
        out.println("                 /                       \"::\" 5( h16 \":\" ) ls32");
        out.println("                 / [               h16 ] \"::\" 4( h16 \":\" ) ls32");
        out.println("                 / [ *1( h16 \":\" ) h16 ] \"::\" 3( h16 \":\" ) ls32");
        out.println("                 / [ *2( h16 \":\" ) h16 ] \"::\" 2( h16 \":\" ) ls32");
        out.println("                 / [ *3( h16 \":\" ) h16 ] \"::\"    h16 \":\"   ls32");
        out.println("                 / [ *4( h16 \":\" ) h16 ] \"::\"              ls32");
        out.println("                 / [ *5( h16 \":\" ) h16 ] \"::\"              h16");
        out.println("                 / [ *6( h16 \":\" ) h16 ] \"::\"");
        out.println("h16           = 1*4HEXDIG");
        out.println("ls32          = ( h16 \":\" h16 ) / IPv4address");
        out.println("IPv4address   = dec-octet \".\" dec-octet \".\" dec-octet \".\" dec-octet");
        out.println("dec-octet     = \"1\" 2DIGIT            ; 100-199");
        out.println("              / \"2\" %x30-34 DIGIT     ; 200-249");
        out.println("              / \"25\" %x30-35          ; 250-255");
        out.println("              / %x31-39 DIGIT         ; 10-99");
        out.println("              / DIGIT                 ; 0-9");
        out.println("reg-name      = *( unreserved / pct-encoded / sub-delims )");
        out.println(";path          = path-abempty    ; begins with \"/\" or is empty");
        out.println(";              / path-absolute   ; begins with \"/\" but not \"//\"");
        out.println(";              / path-noscheme   ; begins with a non-colon segment");
        out.println(";              / path-rootless   ; begins with a segment");
        out.println(";              / path-empty      ; zero characters");
        out.println(";path-abempty  = *( \"/\" segment )");
        out.println(";path-absolute = \"/\" [ segment-nz *( \"/\" segment ) ]");
        out.println(";path-noscheme = segment-nz-nc *( \"/\" segment )");
        out.println(";path-rootless = segment-nz *( \"/\" segment )");
        out.println(";path-empty    = \"\"");
        out.println(";segment       = *pchar");
        out.println("segment-nz    = 1*pchar");
        out.println(";segment-nz-nc = 1*( unreserved / pct-encoded / sub-delims / \"@\" ) ; non-zero-length segment without any colon \":\"");
        out.println("pchar         = unreserved / pct-encoded / sub-delims / \":\" / \"@\"");
        out.println(";query         = *( pchar / \"/\" / \"?\" )");
        out.println(";fragment      = *( pchar / \"/\" / \"?\" )");
        out.println("pct-encoded   = \"%\" HEXDIG HEXDIG");
        out.println("unreserved    = ALPHA / DIGIT / \"-\" / \".\" / \"_\" / \"~\"");
        out.println(";reserved      = gen-delims / sub-delims");
        out.println(";gen-delims    = \":\" / \"/\" / \"?\" / \"#\" / \"[\" / \"]\" / \"@\"");
        out.println(";sub-delims    = \"!\" / \"$\" / \"&\" / \"'\" / \"(\" / \")\" / \"*\" / \"+\" / \",\" / \";\" / \"=\"");
        out.println("sub-delims    = \"&\" / \"=\" / \"$\" / other-delims");
        out.println("other-delims  = \"!\" / \"'\" / \"(\" / \")\" / \"*\" / \"+\" / \",\" / \";\"");
        out.println("");
        out.println("; UTF-8 syntax [RFC3629]");
        out.println(";UTF8-octets = *( UTF8-char )");
        out.println(";UTF8-char   = UTF8-1 / UTF8-2 / UTF8-3 / UTF8-4");
        out.println(";UTF8-1      = %x00-7F");
        out.println(";UTF8-2      = %xC2-DF UTF8-tail");
        out.println(";UTF8-3      = %xE0 %xA0-BF UTF8-tail / %xE1-EC 2( UTF8-tail ) /");
        out.println(";              %xED %x80-9F UTF8-tail / %xEE-EF 2( UTF8-tail )");
        out.println(";UTF8-4      = %xF0 %x90-BF 2( UTF8-tail ) / %xF1-F3 3( UTF8-tail ) /");
        out.println(";              %xF4 %x80-8F 2( UTF8-tail )");
        out.println(";UTF8-tail   = %x80-BF");
        out.println("");
        out.println("; Punctuation");
        out.println("SQUOTE = %x27              ");
        out.println("EQ     = %x3D              ");
        out.println("SEMI   = %x3B              ");
        out.println("COMMA  = %x2C");
        out.println("sign   = \"+\" / \"-\"");
        out.println("star   = \"*\"");
        out.println("");
        out.println("; Unrepresentable numeric values");
        out.println("nan              = %x4e.61.4e ; NaN (upper lower upper case)");
        out.println("positiveInfinity = %x49.4e.46 ; INF (all upper case)");
        out.println("negativeInfinity = \"-\" positiveInfinity ; -INF (all upper case)");
        out.println("nanInfinity      = nan / negativeInfinity / positiveInfinity");
        out.println("");
        out.println("; Dates and times");
        out.println("oneToNine       = \"1\" / \"2\" / \"3\" / \"4\" / \"5\" / \"6\" / \"7\" / \"8\" / \"9\" ");
        out.println("zeroToFiftyNine = ( \"0\" / \"1\" / \"2\" / \"3\" / \"4\" / \"5\" ) DIGIT");
        out.println("year  = 4DIGIT;");
        out.println("month = \"0\" oneToNine");
        out.println("      / \"1\" ( \"0\" / \"1\" / \"2\" )");
        out.println("day   = ( \"0\" / \"1\" / \"2\" ) oneToNine");
        out.println("      / \"3\" ( \"0\" / \"1\" )");
        out.println("hour   = ( \"0\" / \"1\" ) DIGIT");
        out.println("       / \"2\" ( \"1\" / \"2\" / \"3\" ) ");
        out.println("minute = zeroToFiftyNine");
        out.println("second = zeroToFiftyNine       ");
        out.println("fractionalSeconds = 1*DIGIT");
        out.println("");
        out.println("; Literal data values");
        out.println("primitiveLiteral = null ");
        out.println("                 / decimal ");
        out.println("                 / single ");
        out.println("                 / double ");
        out.println("                 / sbyte ");
        out.println("                 / byte ");
        out.println("                 / int16 ");
        out.println("                 / int32 ");
        out.println("                 / int64 ");
        out.println("                 / binary ");
        out.println("                 / dateTime ");
        out.println("                 / dateTimeOffset ");
        out.println("                 / guid ");
        out.println("                 / string ");
        out.println("                 / time ");
        out.println("                 / boolean ");
        out.println("                 / geographyCollection ");
        out.println("                 / geographyLineString ");
        out.println("                 / geographyMultiLineString ");
        out.println("                 / geographyMultiPoint ");
        out.println("                 / geographyMultiPolygon ");
        out.println("                 / geographyPoint ");
        out.println("                 / geographyPolygon ");
        out.println("                 / geometryCollection ");
        out.println("                 / geometryLineString ");
        out.println("                 / geometryMultiLineString ");
        out.println("                 / geometryMultiPoint ");
        out.println("                 / geometryMultiPolygon ");
        out.println("                 / geometryPoint ");
        out.println("                 / geometryPolygon ");
        out.println("");
        out.println("null = %x6e.75.6c.6c            ; null (all lower case)");
        out.println("       [ \"'\" qualifiedTypeName \"'\" ] ");
        out.println("       ; The optional qualifiedTypeName is used to specify what type this null value should be considered. ");
        out.println("       ; Knowing the type is useful for function overload resolution purposes ");
        out.println("                                                ");
        out.println("binary = ( %d88 / \"binary\" ) SQUOTE *(2HEXDIG) SQUOTE ; note: \"X\" is case sensitive \"binary\" is not hence using the character code.");
        out.println("boolean = ( \"true\" / \"1\" ) / ( \"false\" / \"0\" )");
        out.println("");
        out.println("dateTime       = \"datetime\" SQUOTE dateTimeBody SQUOTE");
        out.println("dateTimeOffset = \"datetimeoffset\" SQUOTE dateTimeOffsetBody SQUOTE");
        out.println("dateTimeBody = year \"-\" month \"-\" day \"T\" ");
        out.println("               ( hour \":\" minute [ \":\" second [ \".\" fractionalSeconds ] ]");
        out.println("               / \"24:00\" [ \":00\" ] ; the first instant of the following day");
        out.println("               ) ");
        out.println("dateTimeOffsetBody = dateTimeBody ( \"Z\" / sign hour \":\" minute )");
        out.println("");
        out.println("decimal     = decimalBody [ \"M\" ]");
        out.println("decimalBody = [sign] 1*DIGIT [\".\" 1*DIGIT]");
        out.println("double      = doubleBody [ \"D\" ]");
        out.println("doubleBody  = decimalBody [ \"E\" [sign] 1*DIGIT ] ; TODO: restrict range");
        out.println("            / nanInfinity");
        out.println("single      = singleBody [ \"F\" ]");
        out.println("singleBody  = decimalBody [ \"E\" [sign] 1*DIGIT ] ; TODO: restrict range");
        out.println("            / nanInfinity");
        out.println("");
        out.println("guid = \"guid\" SQUOTE 8HEXDIG \"-\" 4HEXDIG \"-\" 4HEXDIG \"-\" 4HEXDIG \"-\" 12HEXDIG SQUOTE");
        out.println("");
        out.println("byte  = 1*3DIGIT ; numbers in the range from 0 to 255");
        out.println("sbyte = [ sign ] 1*3DIGIT ; numbers in the range from -128 to 127");
        out.println("int16 = [ sign ] 1*5DIGIT ; numbers in the range from -32768 to 32767        ");
        out.println("int32 = [ sign ] 1*10DIGIT ; numbers in the range from -2147483648 to 2147483647");
        out.println("int64 = [ sign ] 1*19DIGIT [ \"L\" ] ; numbers in the range from -9223372036854775808 to 9223372036854775807");
        out.println("");
        out.println("string           = SQUOTE *( unreserved / pct-encoded / SQUOTE-in-string ) SQUOTE ; TODO: was SQUOTE *UTF8-char SQUOTE, but that's not sufficient for use in URLs");
        out.println("SQUOTE-in-string = SQUOTE SQUOTE ; two quotes represent one within string literal in quotes");
        out.println("");
        out.println("time = \"time\" SQUOTE [ sign ] \"P\" [ 1*DIGIT \"Y\" ] [ 1*DIGIT \"M\" ] [ 1*DIGIT \"D\" ] [ \"T\" [ 1*DIGIT \"H\" ] [ 1*DIGIT \"M\" ] [ 1*DIGIT [ \".\" 1*DIGIT ] \"S\" ] ] SQUOTE");
        out.println("     ; the above is an approximation of the rules for an xml duration.");
        out.println("     ; see the lexical representation for duration in http://www.w3.org/TR/xmlschema-2 for more information");
        out.println(" ");
        out.println("geographyCollection   = geographyPrefix fullCollectionLiteral SQUOTE");
        out.println("fullCollectionLiteral = sridLiteral collectionLiteral");
        out.println("collectionLiteral     = \"Collection(\" geoLiteral *( COMMA geoLiteral ) \")\"");
        out.println("geoLiteral            = collectionLiteral");
        out.println("                      / lineStringLiteral");
        out.println("                      / multiPointLiteral");
        out.println("                      / multiLineStringLiteral");
        out.println("                      / multiPolygonLiteral");
        out.println("                      / pointLiteral");
        out.println("                      / polygonLiteral");
        out.println("");
        out.println("geographyLineString   = geographyPrefix fullLineStringLiteral SQUOTE");
        out.println("fullLineStringLiteral = sridLiteral lineStringLiteral");
        out.println("lineStringLiteral     = \"LineString\" lineStringData");
        out.println("lineStringData        = \"(\" positionLiteral 1*( COMMA positionLiteral ) \")\"");
        out.println("");
        out.println("geographyMultiLineString   = geographyPrefix fullMultiLineStringLiteral SQUOTE");
        out.println("fullMultiLineStringLiteral = sridLiteral multiLineStringLiteral");
        out.println("multiLineStringLiteral     = \"MultiLineString(\" [ lineStringData *( COMMA lineStringData ) ] \")\"");
        out.println("");
        out.println("geographyMultiPoint   = geographyPrefix fullMultiPointLiteral SQUOTE");
        out.println("fullMultiPointLiteral = sridLiteral multiPointLiteral");
        out.println("multiPointLiteral     = \"MultiPoint(\" [ pointData *( COMMA pointData ) ] \")\"");
        out.println("");
        out.println("geographyMultiPolygon   = geographyPrefix fullMultiPolygonLiteral SQUOTE");
        out.println("fullMultiPolygonLiteral = sridLiteral multiPolygonLiteral");
        out.println("multiPolygonLiteral     = \"MultiPolygon(\" [ polygonData *( COMMA polygonData ) ] \")\"");
        out.println("");
        out.println("geographyPoint   = geographyPrefix fullPointLiteral SQUOTE");
        out.println("fullPointLiteral = sridLiteral pointLiteral");
        out.println("sridLiteral      = \"SRID\" EQ 1*5DIGIT SEMI");
        out.println("pointLiteral     =\"Point\" pointData");
        out.println("pointData        = \"(\" positionLiteral \")\"");
        out.println("positionLiteral  = double SP double  ; longitude, then latitude");
        out.println("");
        out.println("geographyPolygon   = geographyPrefix fullPolygonLiteral SQUOTE");
        out.println("fullPolygonLiteral = sridLiteral polygonLiteral");
        out.println("polygonLiteral     = \"Polygon\" polygonData");
        out.println("polygonData        = \"(\" ringLiteral   *( COMMA ringLiteral ) \")\"");
        out.println("ringLiteral        = \"(\" positionLiteral *( COMMA positionLiteral ) \")\"");
        out.println("                   ; Within each ringLiteral, the first and last positionLiteral elements MUST be an exact syntactic match to each other.");
        out.println("                   ; Within the polygonData, the ringLiterals MUST specify their points in appropriate winding order. ");
        out.println("                   ; In order of traversal, points to the left side of the ring are interpreted as being in the polygon.");
        out.println("");
        out.println("geometryCollection      = geometryPrefix fullCollectionLiteral      SQUOTE");
        out.println("geometryLineString      = geometryPrefix fullLineStringLiteral      SQUOTE");
        out.println("geometryMultiLineString = geometryPrefix fullMultiLineStringLiteral SQUOTE");
        out.println("geometryMultiPoint      = geometryPrefix fullMultiPointLiteral      SQUOTE");
        out.println("geometryMultiPolygon    = geometryPrefix fullMultiPolygonLiteral    SQUOTE");
        out.println("geometryPoint           = geometryPrefix fullPointLiteral           SQUOTE");
        out.println("geometryPolygon         = geometryPrefix fullPolygonLiteral         SQUOTE");
        out.println("");
        out.println("geographyPrefix = \"geography\" SQUOTE");
        out.println("geometryPrefix  = \"geometry\" SQUOTE");
        out.println("");
        out.println("");
        out.println("; Names and identifiers");
        out.println("odataIdentifier             = identifierLeadingCharacter *478identifierCharacter");
        out.println("identifierLeadingCharacter  = ALPHA / \"_\"            ; TODO: Any character from the Unicode classes L or Nl");
        out.println("identifierCharacter         = ALPHA / DIGIT / \"_\"    ; TODO: Any character from the Unicode classes L, Nl, Nd, Mn, Mc, Pc or Cf");
        out.println("");
        out.println("namespace     = namespacePart *(\".\" namespacePart)");
        out.println("namespacePart = odataIdentifier");
        out.println("");
        out.println("entitySetName       = odataIdentifier");
        out.println("entityTypeName      = odataIdentifier");
        out.println("complexTypeName     = odataIdentifier ");
        out.println("enumerationTypeName = odataIdentifier");
        out.println("");
        out.println("qualifiedTypeName = qualifiedEntityTypeName ");
        out.println("                  / qualifiedComplexTypeName");
        out.println("                  / qualifiedEnumerationTypeName");
        out.println("                  / primitiveTypeName ");
        out.println("                  / \"collection(\" ");
        out.println("                    ( qualifiedEntityTypeName ");
        out.println("                    / qualifiedComplexTypeName");
        out.println("                    / qualifiedEnumerationTypeName ");
        out.println("                    / primitiveTypeName ");
        out.println("                    ) \")\"");
        out.println("qualifiedEntityTypeName      = namespace \".\" entityTypeName");
        out.println("qualifiedComplexTypeName     = namespace \".\" complexTypeName");
        out.println("qualifiedEnumerationTypeName = namespace \".\" enumerationTypeName");
        out.println("");
        out.println("; TODO: case-sensitivity of Edm type names (ODATA-77)");
        out.println("primitiveTypeName = [\"edm.\"] ( \"binary\" ");
        out.println("                             / \"boolean\" ");
        out.println("                             / \"byte\" ");
        out.println("                             / \"datetime\" ");
        out.println("                             / \"datetimeoffset\" ");
        out.println("                             / \"decimal\" ");
        out.println("                             / \"double\" ");
        out.println("                             / \"single\" ");
        out.println("                             / \"float\" ");
        out.println("                             / \"guid\" ");
        out.println("                             / \"int16\" ");
        out.println("                             / \"int32\" ");
        out.println("                             / \"int64\" ");
        out.println("                             / \"sbyte\" ");
        out.println("                             / \"stream\" ");
        out.println("                             / \"string\" ");
        out.println("                             / \"time\" ");
        out.println("                             / abstractSpatialTypeName [ concreteSpatialTypeName ] ");
        out.println("                             )");
        out.println("abstractSpatialTypeName = \"Geography\" ");
        out.println("                        / \"Geometry\"      ");
        out.println("concreteSpatialTypeName = \"Collection\" ");
        out.println("                        / \"Linestring\" ");
        out.println("                        / \"MultiLineString\" ");
        out.println("                        / \"MultiPoint\" ");
        out.println("                        / \"MultiPolygon\" ");
        out.println("                        / \"Point\" ");
        out.println("                        / \"Polygon\" ");
        out.println("");
        out.println("property = primitiveProperty  ");
        out.println("         / primitiveColProperty ");
        out.println("         / complexProperty ");
        out.println("         / complexColProperty ");
        out.println("         / streamProperty");
        out.println("primitiveProperty       = primitiveKeyProperty / primitiveNonKeyProperty");
        out.println("primitiveKeyProperty    = odataIdentifier");
        out.println("primitiveNonKeyProperty = odataIdentifier");
        out.println("primitiveColProperty    = odataIdentifier");
        out.println("complexProperty         = odataIdentifier");
        out.println("complexColProperty      = odataIdentifier");
        out.println("streamProperty          = odataIdentifier");
        out.println("");
        out.println("navigationProperty          = entityNavigationProperty / entityColNavigationProperty  ");
        out.println("entityNavigationProperty    = odataIdentifier");
        out.println("entityColNavigationProperty = odataIdentifier");
        out.println("");
        out.println("entityContainerName = odataIdentifier");
        out.println("");
        out.println("action = odataIdentifier");
        out.println("");
        out.println("function = entityFunction ");
        out.println("         / entityColFunction ");
        out.println("         / complexFunction ");
        out.println("         / complexColFunction ");
        out.println("         / primitiveFunction ");
        out.println("         / primitiveColFunction");
        out.println("entityFunction       = odataIdentifier");
        out.println("entityColFunction    = odataIdentifier");
        out.println("complexFunction      = odataIdentifier");
        out.println("complexColFunction   = odataIdentifier");
        out.println("primitiveFunction    = odataIdentifier");
        out.println("primitiveColFunction = odataIdentifier");
        out.println("");
        out.println("resourcePath = [ entityContainerName \".\" ] entitySetName [ collectionNavigation ] ");
        out.println("             / actionCall ");
        out.println("             / entityColFunctionCall    [ collectionNavigation ] ");
        out.println("             / entityFunctionCall       [ singleNavigation ] ");
        out.println("             / complexColFunctionCall   [ collectionPath ] ");
        out.println("             / complexFunctionCall      [ complexPath ] ");
        out.println("             / primitiveColFunctionCall [ collectionPath ] ");
        out.println("             / primitiveFunctionCall    [ singlePath ] ");
        out.println("");
        out.println("collectionNavigation = [ \"/\" qualifiedEntityTypeName ]");
        out.println("                       ( keyPredicate [ singleNavigation ]");
        out.println("                       / collectionPath");
        out.println("                       / \"\"     ; for restricting to a derived entity type");
        out.println("                       )");
        out.println("");
        out.println("keyPredicate     = simpleKey / compoundKey");
        out.println("simpleKey        = \"(\" primitiveLiteral \")\"");
        out.println("compoundKey      = \"(\" keyValuePair *(\",\" keyValuePair) \")\"");
        out.println("keyValuePair     = primitiveKeyProperty \"=\" keyPropertyValue");
        out.println("keyPropertyValue = primitiveLiteral");
        out.println("");
        out.println("singleNavigation = [ \"/\" qualifiedEntityTypeName ] ");
        out.println("                   ( value  ; for addressing media resources");
        out.println("                   / links \"/\" navigationProperty ");
        out.println("                   / \"/\" ( streamProperty ");
        out.println("                         / primitiveColProperty        [ collectionPath ]");
        out.println("                         / primitiveProperty           [ singlePath ]");
        out.println("                         / complexColProperty          [ collectionPath ]");
        out.println("                         / complexProperty             [ complexPath ]");
        out.println("                         / entityColNavigationProperty [ collectionNavigation ]");
        out.println("                         / entityNavigationProperty    [ singleNavigation ]");
        out.println("                         )");
        out.println("                   / boundOperation ");
        out.println("                   / \"\"     ; for casting after key access");
        out.println("                   )");
        out.println("");
        out.println("collectionPath = count / boundOperation");
        out.println("singlePath     = value / boundOperation");
        out.println("complexPath    = [ \"/\" qualifiedComplexTypeName ] ");
        out.println("                 ( \"/\" ( primitiveProperty [ singlePath ]");
        out.println("                       / complexProperty   [ complexPath ]");
        out.println("                       ) ");
        out.println("                 / boundOperation");
        out.println("                 )");
        out.println("");
        out.println("count = \"/$count\" ");
        out.println("value = \"/$value\"");
        out.println("links = \"/$links\"");
        out.println("");
        out.println("; boundOperation segments can only be composed if the type of the previous segment matches ");
        out.println("; the type of the first parameter of the action or function being called.");
        out.println("boundOperation = \"/\" ( boundActionCall");
        out.println("                     / boundEntityColFuncCall    [ collectionNavigation ] ");
        out.println("                     / boundEntityFuncCall       [ singleNavigation ] ");
        out.println("                     / boundComplexColFuncCall   [ collectionPath ] ");
        out.println("                     / boundComplexFuncCall      [ complexPath ]");
        out.println("                     / boundPrimitiveColFuncCall [ collectionPath ] ");
        out.println("                     / boundPrimitiveFuncCall    [ singlePath ] ");
        out.println("                     )");
        out.println("");
        out.println("actionCall      = [ operationQualifier ] action [ \"()\" ]");
        out.println("boundActionCall = actionCall");
        out.println("                  ; with the added restriction that the binding parameter MUST be either an entity or collection of entities");
        out.println("                  ; and is specified by reference using the URL immediately preceding (to the left) of the boundActionCall");
        out.println("");
        out.println("entityFunctionCall       = [ operationQualifier ] entityFunction       functionParameters");
        out.println("entityColFunctionCall    = [ operationQualifier ] entityColFunction    functionParameters");
        out.println("complexFunctionCall      = [ operationQualifier ] complexFunction      functionParameters");
        out.println("complexColFunctionCall   = [ operationQualifier ] complexColFunction   functionParameters");
        out.println("primitiveFunctionCall    = [ operationQualifier ] primitiveFunction    functionParameters");
        out.println("primitiveColFunctionCall = [ operationQualifier ] primitiveColFunction functionParameters");
        out.println("");
        out.println("; The following boundXxxFuncCall rules have the added restrictions that");
        out.println(";  - the Function MUST support binding, and ");
        out.println(";  - the binding parameter type MUST match the type of resource identified by the ");
        out.println(";    Uri immediately preceding (to the left) of the boundXxxFuncCall, and");
        out.println(";  - the functionParameters MUST NOT include the bindingParameter.");
        out.println("boundEntityFuncCall       = entityFunctionCall");
        out.println("boundEntityColFuncCall    = entityColFunctionCall");
        out.println("boundComplexFuncCall      = complexFunctionCall");
        out.println("boundComplexColFuncCall   = complexColFunctionCall");
        out.println("boundPrimitiveFuncCall    = primitiveFunctionCall");
        out.println("boundPrimitiveColFuncCall = primitiveColFunctionCall");
        out.println("");
        out.println("functionParameters    = \"(\" [ functionParameter *( \",\" functionParameter ) ] \")\"");
        out.println("functionParameter     = functionParameterName \"=\" ( primitiveLiteral / parameterAlias )");
        out.println("functionParameterName = odataIdentifier");
        out.println("parameterAlias        = \"@\" odataIdentifier");
        out.println("");
        out.println("aliasAndValue         = parameterAlias        \"=\" parameterValue");
        out.println("parameterNameAndValue = functionParameterName \"=\" parameterValue");
        out.println("");
        out.println("parameterValue = primitiveLiteral     ; note this is a Uri literal, not a JSON literal");
        out.println("               / complexInUri  ");
        out.println("               / complexColInUri");
        out.println("               / primitiveColInUri");
        out.println("");
        out.println("; The following rules define a JSON format for function and action parameters");
        out.println("; Note that the query part ofa URL needs to be partially percent-decoded before");
        out.println("; applying these rules, see comment at the top of this file");
        out.println("complexInUri = begin-object");
        out.println("                   [ ( complexTypeMetadataInUri  ");
        out.println("                     / primitivePropertyInUri ");
        out.println("                     / complexPropertyInUri ");
        out.println("                     / collectionPropertyInUri  ");
        out.println("                     )");
        out.println("                    *( value-separator ");
        out.println("                       ( primitivePropertyInUri ");
        out.println("                       / complexPropertyInUri ");
        out.println("                       / collectionPropertyInUri  ");
        out.println("                       ) ");
        out.println("                     )");
        out.println("                   ]  ");
        out.println("                   end-object");
        out.println("");
        out.println("complexColInUri = begin-array ");
        out.println("                  [ complexInUri *( value-separator complexInUri ) ] ");
        out.println("                  end-array");
        out.println("                  ");
        out.println("primitiveColInUri = begin-array ");
        out.println("                    [ primitiveLiteralInJSON *( value-separator primitiveLiteralInJSON ) ] ");
        out.println("                    end-array");
        out.println("");
        out.println("begin-object = \"{\" ");
        out.println("end-object   = \"}\"");
        out.println("");
        out.println("begin-array = \"[\" ");
        out.println("end-array   = \"]\" ");
        out.println("");
        out.println("quotation-mark  = DQUOTE");
        out.println("name-separator  = \":\"");
        out.println("value-separator = COMMA");
        out.println("");
        out.println("complexTypeMetadataInUri = quotation-mark \"__metadata\" quotation-mark");
        out.println("                           name-separator");
        out.println("                           begin-object");
        out.println("                           [ typeNVPInUri ]");
        out.println("                           end-object");
        out.println("");
        out.println("typeNVPInUri = quotation-mark \"type\" quotation-mark");
        out.println("               name-separator");
        out.println("               quotation-mark qualifiedTypeName quotation-mark");
        out.println("");
        out.println("primitivePropertyInUri = quotation-mark primitiveProperty quotation-mark ");
        out.println("                         name-separator ");
        out.println("                         primitiveLiteralInJSON");
        out.println("; TODO: not complete ");
        out.println("; JSON syntay [ RFC4627 ]                 ");
        out.println("primitiveLiteralInJSON = stringInJSON");
        out.println("                       / numberInJSON");
        out.println("                       / %x74.72.75.65    ; true ");
        out.println("                       / %x66.61.6c.73.65 ; false");
        out.println("                       / %x6e.75.6c.6c    ; null");
        out.println("stringInJSON = quotation-mark *charInJSON quotation-mark");
        out.println("charInJSON = pchar   ; TODO: more specific, following RFC4627");
        out.println(";         char = unescaped /");
        out.println(";                escape (");
        out.println(";                    %x22 /          ; \"    quotation mark  U+0022");
        out.println(";                    %x5C /          ; \\    reverse solidus U+005C");
        out.println(";                    %x2F /          ; /    solidus         U+002F");
        out.println(";                    %x62 /          ; b    backspace       U+0008");
        out.println(";                    %x66 /          ; f    form feed       U+000C");
        out.println(";                    %x6E /          ; n    line feed       U+000A");
        out.println(";                    %x72 /          ; r    carriage return U+000D");
        out.println(";                    %x74 /          ; t    tab             U+0009");
        out.println(";                    %x75 4HEXDIG )  ; uXXXX                U+XXXX");
        out.println(";         escape = %x5C              ; \\");
        out.println(";         quotation-mark = %x22      ; \"");
        out.println(";         unescaped = %x20-21 / %x23-5B / %x5D-10FFFF");
        out.println("numberInJSON  = [ \"-\" ] int [ frac ] [ exp ]");
        out.println("int           = \"0\" / ( oneToNine *DIGIT )");
        out.println("frac          = \".\" 1*DIGIT");
        out.println("exp           = \"e\" [ \"-\" / \"+\" ] 1*DIGIT");
        out.println("");
        out.println("complexPropertyInUri = quotation-mark complexProperty quotation-mark ");
        out.println("                       name-separator ");
        out.println("                       complexInUri");
        out.println("                            ");
        out.println("collectionPropertyInUri = ( quotation-mark primitiveColProperty quotation-mark ");
        out.println("                            name-separator ");
        out.println("                            primitiveColInUri ");
        out.println("                          ) ");
        out.println("                        / ( quotation-mark complexColProperty quotation-mark ");
        out.println("                            name-separator ");
        out.println("                            complexColInUri");
        out.println("                          )");
        out.println("                ");
        out.println("commonExpr = primitiveLiteral");
        out.println("           / firstMemberExpr");
        out.println("           / functionExpr");
        out.println("           / boolCommonExpr ");
        out.println("           / methodCallExpr ");
        out.println("           / parenExpr ");
        out.println("           / addExpr ");
        out.println("           / subExpr ");
        out.println("           / mulExpr ");
        out.println("           / divExpr ");
        out.println("           / modExpr ");
        out.println("           / negateExpr ");
        out.println("           / castExpr ");
        out.println("");
        out.println("boolCommonExpr = boolean");
        out.println("               / boolFirstMemberExpr");
        out.println("               / boolFunctionExpr");
        out.println("               / eqExpr ");
        out.println("               / neExpr ");
        out.println("               / ltExpr  ");
        out.println("               / leExpr  ");
        out.println("               / gtExpr ");
        out.println("               / geExpr  ");
        out.println("               / notExpr  ");
        out.println("               / andExpr ");
        out.println("               / orExpr ");
        out.println("               / isofExpr ");
        out.println("               / boolCastExpr  ");
        out.println("               / boolMethodCallExpr  ");
        out.println("               / boolParenExpr ");
        out.println("");
        out.println("boolFirstMemberExpr = firstMemberExpr ; with the added restriction that the return type is Edm.Boolean");
        out.println("firstMemberExpr     = [ lambdaPredicatePrefixExpr ]  ; only allowed inside a lambdaPredicateExpr");
        out.println("                      memberExpr");
        out.println("                  ");
        out.println("memberExpr = [ qualifiedEntityTypeName \"/\" ]");
        out.println("             ( entityColNavigationProperty [ collectionNavigationExpr ] ");
        out.println("             / entityNavigationProperty    [ singleNavigationExpr ] ");
        out.println("             / complexColProperty          [ collectionPathExpr ]");
        out.println("             / complexProperty             [ complexPathExpr ] ");
        out.println("             / primitiveColProperty        [ collectionPathExpr ]");
        out.println("             / primitiveProperty           [ singlePathExpr ]");
        out.println("             / streamProperty ");
        out.println("             / boundFunctionExpr ");
        out.println("             )");
        out.println("                   ");
        out.println("lambdaPredicatePrefixExpr = inscopeVariableExpr \"/\"");
        out.println("inscopeVariableExpr       = implicitVariableExpr / lambdaVariableExpr");
        out.println("implicitVariableExpr      = \"$it\" ; references the unnamed outer variable of the query");
        out.println("lambdaVariableExpr        = odataIdentifier");
        out.println("");
        out.println("collectionNavigationExpr = count");
        out.println("                         / \"/\" [ qualifiedEntityTypeName \"/\" ] ");
        out.println("                           ( boundFunctionExpr ");
        out.println("                           / anyExpr");
        out.println("                           / allExpr ");
        out.println("                           )");
        out.println("");
        out.println("singleNavigationExpr = \"/\" memberExpr");
        out.println("");
        out.println("collectionPathExpr = count ");
        out.println("                   / \"/\" boundFunctionExpr");
        out.println("                   / \"/\" anyExpr");
        out.println("                   / \"/\" allExpr");
        out.println(" ");
        out.println("complexPathExpr = \"/\" [ qualifiedComplexTypeName \"/\" ]");
        out.println("                  ( primitiveProperty [ singlePathExpr ]");
        out.println("                  / complexProperty   [ complexPathExpr ]");
        out.println("                  / boundFunctionExpr");
        out.println("                  )");
        out.println("");
        out.println("singlePathExpr = \"/\" boundFunctionExpr");
        out.println("");
        out.println("boolFunctionExpr  = functionExpr ; with the added restriction that the return type is Edm.Boolean");
        out.println("boundFunctionExpr = functionExpr ; boundFunction segments can only be composed if the type of the    ");
        out.println("                                 ; previous segment matches the type of the first function parameter");
        out.println("                                     ");
        out.println("functionExpr = [ operationQualifier ] ");
        out.println("               ( entityColFunction    functionExprParameters [ collectionNavigationExpr ] ");
        out.println("               / entityFunction       functionExprParameters [ singleNavigationExpr ] ");
        out.println("               / complexColFunction   functionExprParameters [ collectionPathExpr ]");
        out.println("               / complexFunction      functionExprParameters [ complexPathExpr ] ");
        out.println("               / primitiveColFunction functionExprParameters [ collectionPathExpr ] ");
        out.println("               / primitiveFunction    functionExprParameters [ singlePathExpr ] ");
        out.println("               )");
        out.println("");
        out.println("functionExprParameters = \"(\" [ functionExprParameter *( \",\" functionExprParameter ) ] \")\"");
        out.println("; TODO: allow firstMemberExpr also as parameter values");
        out.println("functionExprParameter  = functionParameterName \"=\" parameterValue");
        out.println("");
        out.println("anyExpr = \"any(\" [ lambdaVariableExpr \":\" lambdaPredicateExpr ] \")\"");
        out.println("allExpr = \"all(\" lambdaVariableExpr \":\" lambdaPredicateExpr \")\"");
        out.println("lambdaPredicateExpr = boolCommonExpr ; containing at least one lambdaPredicatePrefixExpr");
        out.println("");
        out.println("methodCallExpr = boolMethodCallExpr ");
        out.println("               / indexOfMethodCallExpr ");
        out.println("               / toLowerMethodCallExpr ");
        out.println("               / toUpperMethodCallExpr  ");
        out.println("               / trimMethodCallExpr ");
        out.println("               / substringMethodCallExpr ");
        out.println("               / concatMethodCallExpr ");
        out.println("               / lengthMethodCallExpr ");
        out.println("               / yearMethodCallExpr ");
        out.println("               / yearsMethodCallExpr ");
        out.println("               / monthMethodCallExpr ");
        out.println("               / monthsMethodCallExpr ");
        out.println("               / dayMethodCallExpr ");
        out.println("               / daysMethodCallExpr ");
        out.println("               / hourMethodCallExpr ");
        out.println("               / hoursMethodCallExpr ");
        out.println("               / minuteMethodCallExpr ");
        out.println("               / minutesMethodCallExpr ");
        out.println("               / secondMethodCallExpr ");
        out.println("               / secondsMethodCallExpr ");
        out.println("               / roundMethodCallExpr ");
        out.println("               / floorMethodCallExpr ");
        out.println("               / ceilingMethodCallExpr ");
        out.println("               / distanceMethodCallExpr ");
        out.println("               / geoLengthMethodCallExpr ");
        out.println("               / getTotalOffsetMinutesExpr");
        out.println("");
        out.println("boolMethodCallExpr = endsWithMethodCallExpr ");
        out.println("                   / startsWithMethodCallExpr ");
        out.println("                   / substringOfMethodCallExpr                                          ");
        out.println("                   / intersectsMethodCallExpr ");
        out.println("");
        out.println("substringOfMethodCallExpr = \"substringof\" \"(\" *WSP commonExpr \",\" commonExpr *WSP \")\"");
        out.println("startsWithMethodCallExpr  = \"startswith\"  \"(\" *WSP commonExpr \",\" commonExpr *WSP \")\"");
        out.println("endsWithMethodCallExpr    = \"endswith\"    \"(\" *WSP commonExpr \",\" commonExpr *WSP \")\"");
        out.println("lengthMethodCallExpr      = \"length\"      \"(\" *WSP commonExpr *WSP \")\"");
        out.println("indexOfMethodCallExpr     = \"indexof\"     \"(\" *WSP commonExpr \",\" commonExpr *WSP \")\"");
        out.println("substringMethodCallExpr   = \"substring\"   \"(\" *WSP commonExpr \",\" commonExpr [ \",\" commonExpr *WSP ] \")\"");
        out.println("toLowerMethodCallExpr     = \"tolower\"     \"(\" *WSP commonExpr *WSP \")\"");
        out.println("toUpperMethodCallExpr     = \"toupper\"     \"(\" *WSP commonExpr *WSP \")\"");
        out.println("trimMethodCallExpr        = \"trim\"        \"(\" *WSP commonExpr *WSP \")\"");
        out.println("concatMethodCallExpr      = \"concat\"      \"(\" *WSP commonExpr \",\" commonExpr *WSP \")\"");
        out.println("yearMethodCallExpr        = \"year\"        \"(\" *WSP commonExpr *WSP \")\"");
        out.println("yearsMethodCallExpr       = \"years\"       \"(\" *WSP commonExpr *WSP \")\"");
        out.println("monthMethodCallExpr       = \"month\"       \"(\" *WSP commonExpr *WSP \")\"");
        out.println("monthsMethodCallExpr      = \"months\"      \"(\" *WSP commonExpr *WSP \")\"");
        out.println("dayMethodCallExpr         = \"day\"         \"(\" *WSP commonExpr *WSP \")\"");
        out.println("daysMethodCallExpr        = \"days\"        \"(\" *WSP commonExpr *WSP \")\"");
        out.println("hourMethodCallExpr        = \"hour\"        \"(\" *WSP commonExpr *WSP \")\"");
        out.println("hoursMethodCallExpr       = \"hours\"       \"(\" *WSP commonExpr *WSP \")\"");
        out.println("minuteMethodCallExpr      = \"minute\"      \"(\" *WSP commonExpr *WSP \")\"");
        out.println("minutesMethodCallExpr     = \"minutes\"     \"(\" *WSP commonExpr *WSP \")\"");
        out.println("secondMethodCallExpr      = \"second\"      \"(\" *WSP commonExpr *WSP \")\"");
        out.println("secondsMethodCallExpr     = \"seconds\"     \"(\" *WSP commonExpr *WSP \")\"");
        out.println("roundMethodCallExpr       = \"round\"       \"(\" *WSP commonExpr *WSP \")\"");
        out.println("floorMethodCallExpr       = \"floor\"       \"(\" *WSP commonExpr *WSP \")\"");
        out.println("ceilingMethodCallExpr     = \"ceiling\"     \"(\" *WSP commonExpr *WSP \")\"");
        out.println("");
        out.println("parenExpr     = \"(\" *WSP commonExpr     *WSP \")\"");
        out.println("boolParenExpr = \"(\" *WSP boolCommonExpr *WSP \")\"");
        out.println("");
        out.println("; TODO: case-sensitive (ODATA-117)");
        out.println("andExpr = boolCommonExpr 1*WSP \"and\" 1*WSP boolCommonExpr");
        out.println("orExpr  = boolCommonExpr 1*WSP \"or\"  1*WSP boolCommonExpr");
        out.println("");
        out.println("eqExpr = commonExpr 1*WSP \"eq\" 1*WSP commonExpr     ");
        out.println("neExpr = commonExpr 1*WSP \"ne\" 1*WSP commonExpr");
        out.println("ltExpr = commonExpr 1*WSP \"lt\" 1*WSP commonExpr");
        out.println("leExpr = commonExpr 1*WSP \"le\" 1*WSP commonExpr");
        out.println("gtExpr = commonExpr 1*WSP \"gt\" 1*WSP commonExpr");
        out.println("geExpr = commonExpr 1*WSP \"ge\" 1*WSP commonExpr");
        out.println("");
        out.println("addExpr = commonExpr 1*WSP \"add\" 1*WSP commonExpr");
        out.println("subExpr = commonExpr 1*WSP \"sub\" 1*WSP commonExpr");
        out.println("mulExpr = commonExpr 1*WSP \"mul\" 1*WSP commonExpr");
        out.println("divExpr = commonExpr 1*WSP \"div\" 1*WSP commonExpr");
        out.println("modExpr = commonExpr 1*WSP \"mod\" 1*WSP commonExpr");
        out.println("");
        out.println("negateExpr = \"-\" *WSP commonExpr");
        out.println("");
        out.println("; TODO: case-sensitive (ODATA-117)");
        out.println("notExpr = \"not\" 1*WSP boolCommonExpr");
        out.println("");
        out.println("; TODO: isn't this rather singleNavigation (once the leading slash has been removed)?");
        out.println("isofExpr     = \"isof\" \"(\" *WSP [ commonExpr \",\" ] qualifiedTypeName *WSP \")\"");
        out.println("castExpr     = \"cast\" \"(\" *WSP [ commonExpr \",\" ] qualifiedTypeName *WSP \")\"");
        out.println("boolCastExpr = \"cast\" \"(\" *WSP [ commonExpr \",\" ] \"Edm.Boolean\"     *WSP \")\"");
        out.println("");
        out.println("getTotalOffsetMinutesExpr = \"gettotaloffsetminutes\" \"(\" *WSP commonExpr *WSP \")\" ");
        out.println("distanceMethodCallExpr    = \"geo.distance\"          \"(\" *WSP commonExpr \",\" commonExpr *WSP \")\"");
        out.println("geoLengthMethodCallExpr   = \"geo.length\"            \"(\" *WSP commonExpr *WSP \")\"");
        out.println("intersectsMethodCallExpr  = \"geo.intersects\"        \"(\" *WSP commonExpr \",\" commonExpr *WSP \")\"");
        out.println("");
        out.println("; End of odata-v1.0-abnf");
    }
}
