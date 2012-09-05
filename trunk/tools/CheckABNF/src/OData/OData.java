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
    public static int ruleCount = 286;
    /** This enum provides easy to remember enum constants for locating the rule identifiers and names.
     * The enum constants have the same spelling as the rule names rendered in all caps with underscores replacing hyphens. */
    public enum RuleNames{
        /** id = <code>131</code>, name = <code>"abstractSpatialTypeName"</code> */
        ABSTRACTSPATIALTYPENAME("abstractSpatialTypeName", 131, 903, 3),
        /** id = <code>163</code>, name = <code>"action"</code> */
        ACTION("action", 163, 969, 8),
        /** id = <code>184</code>, name = <code>"actionCall"</code> */
        ACTIONCALL("actionCall", 184, 1214, 6),
        /** id = <code>228</code>, name = <code>"addExpr"</code> */
        ADDEXPR("addExpr", 228, 1490, 6),
        /** id = <code>204</code>, name = <code>"aliasAndValue"</code> */
        ALIASANDVALUE("aliasAndValue", 204, 1290, 4),
        /** id = <code>246</code>, name = <code>"allExpr"</code> */
        ALLEXPR("allExpr", 246, 1732, 6),
        /** id = <code>275</code>, name = <code>"allMethodCallExpr"</code> */
        ALLMETHODCALLEXPR("allMethodCallExpr", 275, 2105, 1),
        /** id = <code>19</code>, name = <code>"allOperationsInContainer"</code> */
        ALLOPERATIONSINCONTAINER("allOperationsInContainer", 19, 159, 3),
        /** id = <code>25</code>, name = <code>"ALPHA"</code> */
        ALPHA("ALPHA", 25, 228, 3),
        /** id = <code>220</code>, name = <code>"andExpr"</code> */
        ANDEXPR("andExpr", 220, 1442, 6),
        /** id = <code>245</code>, name = <code>"anyExpr"</code> */
        ANYEXPR("anyExpr", 245, 1724, 8),
        /** id = <code>276</code>, name = <code>"anyMethodCallExpr"</code> */
        ANYMETHODCALLEXPR("anyMethodCallExpr", 276, 2106, 1),
        /** id = <code>59</code>, name = <code>"begin-object"</code> */
        BEGIN_OBJECT("begin-object", 59, 488, 1),
        /** id = <code>79</code>, name = <code>"binary"</code> */
        BINARY("binary", 79, 601, 9),
        /** id = <code>237</code>, name = <code>"boolCastExpr"</code> */
        BOOLCASTEXPR("boolCastExpr", 237, 1567, 19),
        /** id = <code>215</code>, name = <code>"boolCommonExpr"</code> */
        BOOLCOMMONEXPR("boolCommonExpr", 215, 1401, 23),
        /** id = <code>80</code>, name = <code>"boolean"</code> */
        BOOLEAN("boolean", 80, 610, 7),
        /** id = <code>277</code>, name = <code>"boolFunctionCallExpr"</code> */
        BOOLFUNCTIONCALLEXPR("boolFunctionCallExpr", 277, 2107, 1),
        /** id = <code>216</code>, name = <code>"boolLiteralExpr"</code> */
        BOOLLITERALEXPR("boolLiteralExpr", 216, 1424, 1),
        /** id = <code>278</code>, name = <code>"boolMethodCallExpr"</code> */
        BOOLMETHODCALLEXPR("boolMethodCallExpr", 278, 2108, 1),
        /** id = <code>250</code>, name = <code>"boolMethodExpr"</code> */
        BOOLMETHODEXPR("boolMethodExpr", 250, 1762, 7),
        /** id = <code>219</code>, name = <code>"boolParenExpr"</code> */
        BOOLPARENEXPR("boolParenExpr", 219, 1434, 8),
        /** id = <code>240</code>, name = <code>"boolPrimitiveMemberExpr"</code> */
        BOOLPRIMITIVEMEMBEREXPR("boolPrimitiveMemberExpr", 240, 1617, 12),
        /** id = <code>185</code>, name = <code>"boundActionCall"</code> */
        BOUNDACTIONCALL("boundActionCall", 185, 1220, 6),
        /** id = <code>196</code>, name = <code>"boundComplexColFuncCall"</code> */
        BOUNDCOMPLEXCOLFUNCCALL("boundComplexColFuncCall", 196, 1260, 3),
        /** id = <code>195</code>, name = <code>"boundComplexFuncCall"</code> */
        BOUNDCOMPLEXFUNCCALL("boundComplexFuncCall", 195, 1257, 3),
        /** id = <code>194</code>, name = <code>"boundEntityColFuncCall"</code> */
        BOUNDENTITYCOLFUNCCALL("boundEntityColFuncCall", 194, 1254, 3),
        /** id = <code>193</code>, name = <code>"boundEntityFuncCall"</code> */
        BOUNDENTITYFUNCCALL("boundEntityFuncCall", 193, 1251, 3),
        /** id = <code>244</code>, name = <code>"boundFunctionExpr"</code> */
        BOUNDFUNCTIONEXPR("boundFunctionExpr", 244, 1691, 33),
        /** id = <code>173</code>, name = <code>"boundOperation"</code> */
        BOUNDOPERATION("boundOperation", 173, 1115, 36),
        /** id = <code>198</code>, name = <code>"boundPrimitiveColFuncCall"</code> */
        BOUNDPRIMITIVECOLFUNCCALL("boundPrimitiveColFuncCall", 198, 1266, 3),
        /** id = <code>197</code>, name = <code>"boundPrimitiveFuncCall"</code> */
        BOUNDPRIMITIVEFUNCCALL("boundPrimitiveFuncCall", 197, 1263, 3),
        /** id = <code>92</code>, name = <code>"byte"</code> */
        BYTE("byte", 92, 722, 2),
        /** id = <code>236</code>, name = <code>"castExpr"</code> */
        CASTEXPR("castExpr", 236, 1548, 19),
        /** id = <code>271</code>, name = <code>"ceilingMethodCallExpr"</code> */
        CEILINGMETHODCALLEXPR("ceilingMethodCallExpr", 271, 2049, 11),
        /** id = <code>171</code>, name = <code>"collectionNavigation"</code> */
        COLLECTIONNAVIGATION("collectionNavigation", 171, 1048, 36),
        /** id = <code>242</code>, name = <code>"collectionNavigationExpr"</code> */
        COLLECTIONNAVIGATIONEXPR("collectionNavigationExpr", 242, 1656, 10),
        /** id = <code>208</code>, name = <code>"collectionPropertyInVJSON"</code> */
        COLLECTIONPROPERTYINVJSON("collectionPropertyInVJSON", 208, 1312, 29),
        /** id = <code>176</code>, name = <code>"collectionPropertyPath"</code> */
        COLLECTIONPROPERTYPATH("collectionPropertyPath", 176, 1175, 11),
        /** id = <code>57</code>, name = <code>"COMMA"</code> */
        COMMA("COMMA", 57, 484, 1),
        /** id = <code>214</code>, name = <code>"commonExpr"</code> */
        COMMONEXPR("commonExpr", 214, 1381, 20),
        /** id = <code>158</code>, name = <code>"complexAction"</code> */
        COMPLEXACTION("complexAction", 158, 964, 1),
        /** id = <code>159</code>, name = <code>"complexColAction"</code> */
        COMPLEXCOLACTION("complexColAction", 159, 965, 1),
        /** id = <code>146</code>, name = <code>"complexColFunction"</code> */
        COMPLEXCOLFUNCTION("complexColFunction", 146, 928, 1),
        /** id = <code>189</code>, name = <code>"complexColFunctionCall"</code> */
        COMPLEXCOLFUNCTIONCALL("complexColFunctionCall", 189, 1235, 3),
        /** id = <code>279</code>, name = <code>"complexColInJSON"</code> */
        COMPLEXCOLINJSON("complexColInJSON", 279, 2109, 1),
        /** id = <code>136</code>, name = <code>"complexColProperty"</code> */
        COMPLEXCOLPROPERTY("complexColProperty", 136, 910, 1),
        /** id = <code>145</code>, name = <code>"complexFunction"</code> */
        COMPLEXFUNCTION("complexFunction", 145, 927, 1),
        /** id = <code>188</code>, name = <code>"complexFunctionCall"</code> */
        COMPLEXFUNCTIONCALL("complexFunctionCall", 188, 1232, 3),
        /** id = <code>213</code>, name = <code>"complexInVJSON"</code> */
        COMPLEXINVJSON("complexInVJSON", 213, 1364, 17),
        /** id = <code>135</code>, name = <code>"complexProperty"</code> */
        COMPLEXPROPERTY("complexProperty", 135, 909, 1),
        /** id = <code>207</code>, name = <code>"complexPropertyInVJSON"</code> */
        COMPLEXPROPERTYINVJSON("complexPropertyInVJSON", 207, 1306, 6),
        /** id = <code>175</code>, name = <code>"complexPropertyPath"</code> */
        COMPLEXPROPERTYPATH("complexPropertyPath", 175, 1162, 13),
        /** id = <code>280</code>, name = <code>"complexTypeInJSON"</code> */
        COMPLEXTYPEINJSON("complexTypeInJSON", 280, 2110, 1),
        /** id = <code>210</code>, name = <code>"complexTypeMetadataInVJSON"</code> */
        COMPLEXTYPEMETADATAINVJSON("complexTypeMetadataInVJSON", 210, 1342, 9),
        /** id = <code>123</code>, name = <code>"complexTypeName"</code> */
        COMPLEXTYPENAME("complexTypeName", 123, 838, 1),
        /** id = <code>181</code>, name = <code>"compoundKey"</code> */
        COMPOUNDKEY("compoundKey", 181, 1201, 8),
        /** id = <code>260</code>, name = <code>"concatMethodCallExpr"</code> */
        CONCATMETHODCALLEXPR("concatMethodCallExpr", 260, 1920, 19),
        /** id = <code>130</code>, name = <code>"concreteSpatialTypeName"</code> */
        CONCRETESPATIALTYPENAME("concreteSpatialTypeName", 130, 888, 15),
        /** id = <code>170</code>, name = <code>"count"</code> */
        COUNT("count", 170, 1047, 1),
        /** id = <code>31</code>, name = <code>"CR"</code> */
        CR("CR", 31, 245, 1),
        /** id = <code>33</code>, name = <code>"CRLF"</code> */
        CRLF("CRLF", 33, 247, 3),
        /** id = <code>23</code>, name = <code>"customName"</code> */
        CUSTOMNAME("customName", 23, 183, 29),
        /** id = <code>22</code>, name = <code>"customQueryOption"</code> */
        CUSTOMQUERYOPTION("customQueryOption", 22, 173, 10),
        /** id = <code>24</code>, name = <code>"customValue"</code> */
        CUSTOMVALUE("customValue", 24, 212, 16),
        /** id = <code>81</code>, name = <code>"dateTime"</code> */
        DATETIME("dateTime", 81, 617, 5),
        /** id = <code>83</code>, name = <code>"dateTimeBody"</code> */
        DATETIMEBODY("dateTimeBody", 83, 627, 24),
        /** id = <code>82</code>, name = <code>"dateTimeOffset"</code> */
        DATETIMEOFFSET("dateTimeOffset", 82, 622, 5),
        /** id = <code>84</code>, name = <code>"dateTimeOffsetBody"</code> */
        DATETIMEOFFSETBODY("dateTimeOffsetBody", 84, 651, 9),
        /** id = <code>72</code>, name = <code>"day"</code> */
        DAY("day", 72, 533, 12),
        /** id = <code>265</code>, name = <code>"dayMethodCallExpr"</code> */
        DAYMETHODCALLEXPR("dayMethodCallExpr", 265, 1983, 11),
        /** id = <code>43</code>, name = <code>"dec-octet"</code> */
        DEC_OCTET("dec-octet", 43, 389, 16),
        /** id = <code>85</code>, name = <code>"decimal"</code> */
        DECIMAL("decimal", 85, 660, 4),
        /** id = <code>86</code>, name = <code>"decimalBody"</code> */
        DECIMALBODY("decimalBody", 86, 664, 10),
        /** id = <code>26</code>, name = <code>"DIGIT"</code> */
        DIGIT("DIGIT", 26, 231, 1),
        /** id = <code>272</code>, name = <code>"distanceMethodCallExpr"</code> */
        DISTANCEMETHODCALLEXPR("distanceMethodCallExpr", 272, 2060, 17),
        /** id = <code>231</code>, name = <code>"divExpr"</code> */
        DIVEXPR("divExpr", 231, 1508, 6),
        /** id = <code>88</code>, name = <code>"double"</code> */
        DOUBLE("double", 88, 685, 4),
        /** id = <code>87</code>, name = <code>"doubleBody"</code> */
        DOUBLEBODY("doubleBody", 87, 674, 11),
        /** id = <code>60</code>, name = <code>"end-object"</code> */
        END_OBJECT("end-object", 60, 489, 1),
        /** id = <code>251</code>, name = <code>"endsWithMethodCallExpr"</code> */
        ENDSWITHMETHODCALLEXPR("endsWithMethodCallExpr", 251, 1769, 17),
        /** id = <code>156</code>, name = <code>"entityAction"</code> */
        ENTITYACTION("entityAction", 156, 962, 1),
        /** id = <code>157</code>, name = <code>"entityColAction"</code> */
        ENTITYCOLACTION("entityColAction", 157, 963, 1),
        /** id = <code>144</code>, name = <code>"entityColFunction"</code> */
        ENTITYCOLFUNCTION("entityColFunction", 144, 926, 1),
        /** id = <code>187</code>, name = <code>"entityColFunctionCall"</code> */
        ENTITYCOLFUNCTIONCALL("entityColFunctionCall", 187, 1229, 3),
        /** id = <code>141</code>, name = <code>"entityColNavigationProperty"</code> */
        ENTITYCOLNAVIGATIONPROPERTY("entityColNavigationProperty", 141, 921, 1),
        /** id = <code>139</code>, name = <code>"entityContainerName"</code> */
        ENTITYCONTAINERNAME("entityContainerName", 139, 919, 1),
        /** id = <code>143</code>, name = <code>"entityFunction"</code> */
        ENTITYFUNCTION("entityFunction", 143, 925, 1),
        /** id = <code>186</code>, name = <code>"entityFunctionCall"</code> */
        ENTITYFUNCTIONCALL("entityFunctionCall", 186, 1226, 3),
        /** id = <code>140</code>, name = <code>"entityNavigationProperty"</code> */
        ENTITYNAVIGATIONPROPERTY("entityNavigationProperty", 140, 920, 1),
        /** id = <code>281</code>, name = <code>"entityProperty"</code> */
        ENTITYPROPERTY("entityProperty", 281, 2111, 1),
        /** id = <code>121</code>, name = <code>"entitySetName"</code> */
        ENTITYSETNAME("entitySetName", 121, 836, 1),
        /** id = <code>122</code>, name = <code>"entityTypeName"</code> */
        ENTITYTYPENAME("entityTypeName", 122, 837, 1),
        /** id = <code>124</code>, name = <code>"enumerationTypeName"</code> */
        ENUMERATIONTYPENAME("enumerationTypeName", 124, 839, 1),
        /** id = <code>222</code>, name = <code>"eqExpr"</code> */
        EQEXPR("eqExpr", 222, 1454, 6),
        /** id = <code>6</code>, name = <code>"expand"</code> */
        EXPAND("expand", 6, 47, 3),
        /** id = <code>7</code>, name = <code>"expandClause"</code> */
        EXPANDCLAUSE("expandClause", 7, 50, 6),
        /** id = <code>8</code>, name = <code>"expandItem"</code> */
        EXPANDITEM("expandItem", 8, 56, 14),
        /** id = <code>9</code>, name = <code>"filter"</code> */
        FILTER("filter", 9, 70, 8),
        /** id = <code>239</code>, name = <code>"firstBoolPrimitiveMemExpr"</code> */
        FIRSTBOOLPRIMITIVEMEMEXPR("firstBoolPrimitiveMemExpr", 239, 1611, 6),
        /** id = <code>238</code>, name = <code>"firstMemberExpr"</code> */
        FIRSTMEMBEREXPR("firstMemberExpr", 238, 1586, 25),
        /** id = <code>270</code>, name = <code>"floorMethodCallExpr"</code> */
        FLOORMETHODCALLEXPR("floorMethodCallExpr", 270, 2038, 11),
        /** id = <code>14</code>, name = <code>"format"</code> */
        FORMAT("format", 14, 117, 10),
        /** id = <code>76</code>, name = <code>"fractionalSeconds"</code> */
        FRACTIONALSECONDS("fractionalSeconds", 76, 559, 2),
        /** id = <code>164</code>, name = <code>"fullAction"</code> */
        FULLACTION("fullAction", 164, 977, 4),
        /** id = <code>152</code>, name = <code>"fullComplexColFunction"</code> */
        FULLCOMPLEXCOLFUNCTION("fullComplexColFunction", 152, 943, 4),
        /** id = <code>151</code>, name = <code>"fullComplexFunction"</code> */
        FULLCOMPLEXFUNCTION("fullComplexFunction", 151, 939, 4),
        /** id = <code>150</code>, name = <code>"fullEntityColFunction"</code> */
        FULLENTITYCOLFUNCTION("fullEntityColFunction", 150, 935, 4),
        /** id = <code>149</code>, name = <code>"fullEntityFunction"</code> */
        FULLENTITYFUNCTION("fullEntityFunction", 149, 931, 4),
        /** id = <code>155</code>, name = <code>"fullFunction"</code> */
        FULLFUNCTION("fullFunction", 155, 955, 7),
        /** id = <code>154</code>, name = <code>"fullPrimitiveColFunction"</code> */
        FULLPRIMITIVECOLFUNCTION("fullPrimitiveColFunction", 154, 951, 4),
        /** id = <code>153</code>, name = <code>"fullPrimitiveFunction"</code> */
        FULLPRIMITIVEFUNCTION("fullPrimitiveFunction", 153, 947, 4),
        /** id = <code>192</code>, name = <code>"functionCall"</code> */
        FUNCTIONCALL("functionCall", 192, 1244, 7),
        /** id = <code>200</code>, name = <code>"functionParameter"</code> */
        FUNCTIONPARAMETER("functionParameter", 200, 1279, 6),
        /** id = <code>201</code>, name = <code>"functionParameterName"</code> */
        FUNCTIONPARAMETERNAME("functionParameterName", 201, 1285, 1),
        /** id = <code>199</code>, name = <code>"functionParameters"</code> */
        FUNCTIONPARAMETERS("functionParameters", 199, 1269, 10),
        /** id = <code>227</code>, name = <code>"geExpr"</code> */
        GEEXPR("geExpr", 227, 1484, 6),
        /** id = <code>100</code>, name = <code>"geography"</code> */
        GEOGRAPHY("geography", 100, 802, 1),
        /** id = <code>101</code>, name = <code>"geographyCollection"</code> */
        GEOGRAPHYCOLLECTION("geographyCollection", 101, 803, 1),
        /** id = <code>102</code>, name = <code>"geographyLineString"</code> */
        GEOGRAPHYLINESTRING("geographyLineString", 102, 804, 1),
        /** id = <code>103</code>, name = <code>"geographyMultiLineString"</code> */
        GEOGRAPHYMULTILINESTRING("geographyMultiLineString", 103, 805, 1),
        /** id = <code>104</code>, name = <code>"geographyMultiPoint"</code> */
        GEOGRAPHYMULTIPOINT("geographyMultiPoint", 104, 806, 1),
        /** id = <code>105</code>, name = <code>"geographyMultiPolygon"</code> */
        GEOGRAPHYMULTIPOLYGON("geographyMultiPolygon", 105, 807, 1),
        /** id = <code>106</code>, name = <code>"geographyPoint"</code> */
        GEOGRAPHYPOINT("geographyPoint", 106, 808, 1),
        /** id = <code>107</code>, name = <code>"geographyPolygon"</code> */
        GEOGRAPHYPOLYGON("geographyPolygon", 107, 809, 1),
        /** id = <code>273</code>, name = <code>"geoLengthMethodCallExpr"</code> */
        GEOLENGTHMETHODCALLEXPR("geoLengthMethodCallExpr", 273, 2077, 11),
        /** id = <code>108</code>, name = <code>"geometry"</code> */
        GEOMETRY("geometry", 108, 810, 1),
        /** id = <code>109</code>, name = <code>"geometryCollection"</code> */
        GEOMETRYCOLLECTION("geometryCollection", 109, 811, 1),
        /** id = <code>110</code>, name = <code>"geometryLineString"</code> */
        GEOMETRYLINESTRING("geometryLineString", 110, 812, 1),
        /** id = <code>111</code>, name = <code>"geometryMultiLineString"</code> */
        GEOMETRYMULTILINESTRING("geometryMultiLineString", 111, 813, 1),
        /** id = <code>112</code>, name = <code>"geometryMultiPoint"</code> */
        GEOMETRYMULTIPOINT("geometryMultiPoint", 112, 814, 1),
        /** id = <code>113</code>, name = <code>"geometryMultiPolygon"</code> */
        GEOMETRYMULTIPOLYGON("geometryMultiPolygon", 113, 815, 1),
        /** id = <code>114</code>, name = <code>"geometryPoint"</code> */
        GEOMETRYPOINT("geometryPoint", 114, 816, 1),
        /** id = <code>115</code>, name = <code>"geometryPolygon"</code> */
        GEOMETRYPOLYGON("geometryPolygon", 115, 817, 1),
        /** id = <code>262</code>, name = <code>"getTotalOffsetMinutesExpr"</code> */
        GETTOTALOFFSETMINUTESEXPR("getTotalOffsetMinutesExpr", 262, 1950, 11),
        /** id = <code>226</code>, name = <code>"gtExpr"</code> */
        GTEXPR("gtExpr", 226, 1478, 6),
        /** id = <code>91</code>, name = <code>"guid"</code> */
        GUID("guid", 91, 704, 18),
        /** id = <code>40</code>, name = <code>"h16"</code> */
        H16("h16", 40, 373, 2),
        /** id = <code>27</code>, name = <code>"HEXDIG"</code> */
        HEXDIG("HEXDIG", 27, 232, 8),
        /** id = <code>35</code>, name = <code>"host"</code> */
        HOST("host", 35, 259, 4),
        /** id = <code>73</code>, name = <code>"hour"</code> */
        HOUR("hour", 73, 545, 12),
        /** id = <code>266</code>, name = <code>"hourMethodCallExpr"</code> */
        HOURMETHODCALLEXPR("hourMethodCallExpr", 266, 1994, 11),
        /** id = <code>29</code>, name = <code>"HTAB"</code> */
        HTAB("HTAB", 29, 241, 1),
        /** id = <code>118</code>, name = <code>"identifierCharacter"</code> */
        IDENTIFIERCHARACTER("identifierCharacter", 118, 825, 4),
        /** id = <code>117</code>, name = <code>"identifierLeadingCharacter"</code> */
        IDENTIFIERLEADINGCHARACTER("identifierLeadingCharacter", 117, 822, 3),
        /** id = <code>252</code>, name = <code>"indexOfMethodCallExpr"</code> */
        INDEXOFMETHODCALLEXPR("indexOfMethodCallExpr", 252, 1786, 17),
        /** id = <code>15</code>, name = <code>"inlinecount"</code> */
        INLINECOUNT("inlinecount", 15, 127, 5),
        /** id = <code>94</code>, name = <code>"int16"</code> */
        INT16("int16", 94, 729, 5),
        /** id = <code>95</code>, name = <code>"int32"</code> */
        INT32("int32", 95, 734, 5),
        /** id = <code>96</code>, name = <code>"int64"</code> */
        INT64("int64", 96, 739, 7),
        /** id = <code>274</code>, name = <code>"intersectsMethodCallExpr"</code> */
        INTERSECTSMETHODCALLEXPR("intersectsMethodCallExpr", 274, 2088, 17),
        /** id = <code>37</code>, name = <code>"IP-literal"</code> */
        IP_LITERAL("IP-literal", 37, 265, 6),
        /** id = <code>42</code>, name = <code>"IPv4address"</code> */
        IPV4ADDRESS("IPv4address", 42, 381, 8),
        /** id = <code>39</code>, name = <code>"IPv6address"</code> */
        IPV6ADDRESS("IPv6address", 39, 281, 92),
        /** id = <code>38</code>, name = <code>"IPvFuture"</code> */
        IPVFUTURE("IPvFuture", 38, 271, 10),
        /** id = <code>235</code>, name = <code>"isofExpr"</code> */
        ISOFEXPR("isofExpr", 235, 1529, 19),
        /** id = <code>179</code>, name = <code>"keyPredicate"</code> */
        KEYPREDICATE("keyPredicate", 179, 1194, 3),
        /** id = <code>183</code>, name = <code>"keyPropertyValue"</code> */
        KEYPROPERTYVALUE("keyPropertyValue", 183, 1213, 1),
        /** id = <code>182</code>, name = <code>"keyValuePair"</code> */
        KEYVALUEPAIR("keyValuePair", 182, 1209, 4),
        /** id = <code>248</code>, name = <code>"lambdaPredicateExpr"</code> */
        LAMBDAPREDICATEEXPR("lambdaPredicateExpr", 248, 1739, 1),
        /** id = <code>282</code>, name = <code>"lambdaPredicatePrefixExpr"</code> */
        LAMBDAPREDICATEPREFIXEXPR("lambdaPredicatePrefixExpr", 282, 2112, 1),
        /** id = <code>247</code>, name = <code>"lambdaVariableExpr"</code> */
        LAMBDAVARIABLEEXPR("lambdaVariableExpr", 247, 1738, 1),
        /** id = <code>225</code>, name = <code>"leExpr"</code> */
        LEEXPR("leExpr", 225, 1472, 6),
        /** id = <code>261</code>, name = <code>"lengthMethodCallExpr"</code> */
        LENGTHMETHODCALLEXPR("lengthMethodCallExpr", 261, 1939, 11),
        /** id = <code>32</code>, name = <code>"LF"</code> */
        LF("LF", 32, 246, 1),
        /** id = <code>217</code>, name = <code>"literalExpr"</code> */
        LITERALEXPR("literalExpr", 217, 1425, 1),
        /** id = <code>41</code>, name = <code>"ls32"</code> */
        LS32("ls32", 41, 375, 6),
        /** id = <code>224</code>, name = <code>"ltExpr"</code> */
        LTEXPR("ltExpr", 224, 1466, 6),
        /** id = <code>241</code>, name = <code>"memberExpr"</code> */
        MEMBEREXPR("memberExpr", 241, 1629, 27),
        /** id = <code>249</code>, name = <code>"methodCallExpr"</code> */
        METHODCALLEXPR("methodCallExpr", 249, 1740, 22),
        /** id = <code>74</code>, name = <code>"minute"</code> */
        MINUTE("minute", 74, 557, 1),
        /** id = <code>267</code>, name = <code>"minuteMethodCallExpr"</code> */
        MINUTEMETHODCALLEXPR("minuteMethodCallExpr", 267, 2005, 11),
        /** id = <code>232</code>, name = <code>"modExpr"</code> */
        MODEXPR("modExpr", 232, 1514, 6),
        /** id = <code>71</code>, name = <code>"month"</code> */
        MONTH("month", 71, 523, 10),
        /** id = <code>264</code>, name = <code>"monthMethodCallExpr"</code> */
        MONTHMETHODCALLEXPR("monthMethodCallExpr", 264, 1972, 11),
        /** id = <code>230</code>, name = <code>"mulExpr"</code> */
        MULEXPR("mulExpr", 230, 1502, 6),
        /** id = <code>62</code>, name = <code>"name-separator"</code> */
        NAME_SEPARATOR("name-separator", 62, 491, 1),
        /** id = <code>119</code>, name = <code>"namespace"</code> */
        NAMESPACE("namespace", 119, 829, 6),
        /** id = <code>120</code>, name = <code>"namespacePart"</code> */
        NAMESPACEPART("namespacePart", 120, 835, 1),
        /** id = <code>64</code>, name = <code>"nan"</code> */
        NAN("nan", 64, 493, 1),
        /** id = <code>67</code>, name = <code>"nanInfinity"</code> */
        NANINFINITY("nanInfinity", 67, 498, 4),
        /** id = <code>142</code>, name = <code>"navigationProperty"</code> */
        NAVIGATIONPROPERTY("navigationProperty", 142, 922, 3),
        /** id = <code>223</code>, name = <code>"neExpr"</code> */
        NEEXPR("neExpr", 223, 1460, 6),
        /** id = <code>233</code>, name = <code>"negateExpr"</code> */
        NEGATEEXPR("negateExpr", 233, 1520, 5),
        /** id = <code>66</code>, name = <code>"negativeInfinity"</code> */
        NEGATIVEINFINITY("negativeInfinity", 66, 495, 3),
        /** id = <code>234</code>, name = <code>"notExpr"</code> */
        NOTEXPR("notExpr", 234, 1525, 4),
        /** id = <code>78</code>, name = <code>"null"</code> */
        NULL("null", 78, 594, 7),
        /** id = <code>116</code>, name = <code>"odataIdentifier"</code> */
        ODATAIDENTIFIER("odataIdentifier", 116, 818, 4),
        /** id = <code>2</code>, name = <code>"odataRelativeUri"</code> */
        ODATARELATIVEURI("odataRelativeUri", 2, 20, 6),
        /** id = <code>0</code>, name = <code>"odataUri"</code> */
        ODATAURI("odataUri", 0, 0, 14),
        /** id = <code>68</code>, name = <code>"oneToNine"</code> */
        ONETONINE("oneToNine", 68, 502, 10),
        /** id = <code>20</code>, name = <code>"operationQualifier"</code> */
        OPERATIONQUALIFIER("operationQualifier", 20, 162, 7),
        /** id = <code>10</code>, name = <code>"orderby"</code> */
        ORDERBY("orderby", 10, 78, 28),
        /** id = <code>11</code>, name = <code>"orderExpr"</code> */
        ORDEREXPR("orderExpr", 11, 106, 3),
        /** id = <code>221</code>, name = <code>"orExpr"</code> */
        OREXPR("orExpr", 221, 1448, 6),
        /** id = <code>203</code>, name = <code>"parameterAlias"</code> */
        PARAMETERALIAS("parameterAlias", 203, 1287, 3),
        /** id = <code>205</code>, name = <code>"parameterNameAndValue"</code> */
        PARAMETERNAMEANDVALUE("parameterNameAndValue", 205, 1294, 4),
        /** id = <code>168</code>, name = <code>"parameterTypeName"</code> */
        PARAMETERTYPENAME("parameterTypeName", 168, 1002, 1),
        /** id = <code>167</code>, name = <code>"parameterTypeNames"</code> */
        PARAMETERTYPENAMES("parameterTypeNames", 167, 995, 7),
        /** id = <code>212</code>, name = <code>"parameterValue"</code> */
        PARAMETERVALUE("parameterValue", 212, 1359, 5),
        /** id = <code>218</code>, name = <code>"parenExpr"</code> */
        PARENEXPR("parenExpr", 218, 1426, 8),
        /** id = <code>46</code>, name = <code>"pchar"</code> */
        PCHAR("pchar", 46, 412, 6),
        /** id = <code>47</code>, name = <code>"pct-encoded"</code> */
        PCT_ENCODED("pct-encoded", 47, 418, 4),
        /** id = <code>36</code>, name = <code>"port"</code> */
        PORT("port", 36, 263, 2),
        /** id = <code>65</code>, name = <code>"positiveInfinity"</code> */
        POSITIVEINFINITY("positiveInfinity", 65, 494, 1),
        /** id = <code>160</code>, name = <code>"primitiveAction"</code> */
        PRIMITIVEACTION("primitiveAction", 160, 966, 1),
        /** id = <code>161</code>, name = <code>"primitiveColAction"</code> */
        PRIMITIVECOLACTION("primitiveColAction", 161, 967, 1),
        /** id = <code>148</code>, name = <code>"primitiveColFunction"</code> */
        PRIMITIVECOLFUNCTION("primitiveColFunction", 148, 930, 1),
        /** id = <code>191</code>, name = <code>"primitiveColFunctionCall"</code> */
        PRIMITIVECOLFUNCTIONCALL("primitiveColFunctionCall", 191, 1241, 3),
        /** id = <code>283</code>, name = <code>"primitiveColInJSON"</code> */
        PRIMITIVECOLINJSON("primitiveColInJSON", 283, 2113, 1),
        /** id = <code>134</code>, name = <code>"primitiveColProperty"</code> */
        PRIMITIVECOLPROPERTY("primitiveColProperty", 134, 908, 1),
        /** id = <code>147</code>, name = <code>"primitiveFunction"</code> */
        PRIMITIVEFUNCTION("primitiveFunction", 147, 929, 1),
        /** id = <code>190</code>, name = <code>"primitiveFunctionCall"</code> */
        PRIMITIVEFUNCTIONCALL("primitiveFunctionCall", 190, 1238, 3),
        /** id = <code>132</code>, name = <code>"primitiveKeyProperty"</code> */
        PRIMITIVEKEYPROPERTY("primitiveKeyProperty", 132, 906, 1),
        /** id = <code>77</code>, name = <code>"primitiveLiteral"</code> */
        PRIMITIVELITERAL("primitiveLiteral", 77, 561, 33),
        /** id = <code>209</code>, name = <code>"primitiveLiteralInVJSON"</code> */
        PRIMITIVELITERALINVJSON("primitiveLiteralInVJSON", 209, 1341, 1),
        /** id = <code>133</code>, name = <code>"primitiveNonKeyProperty"</code> */
        PRIMITIVENONKEYPROPERTY("primitiveNonKeyProperty", 133, 907, 1),
        /** id = <code>202</code>, name = <code>"primitiveParameterValue"</code> */
        PRIMITIVEPARAMETERVALUE("primitiveParameterValue", 202, 1286, 1),
        /** id = <code>206</code>, name = <code>"primitivePropertyInVJSON"</code> */
        PRIMITIVEPROPERTYINVJSON("primitivePropertyInVJSON", 206, 1298, 8),
        /** id = <code>174</code>, name = <code>"primitivePropertyPath"</code> */
        PRIMITIVEPROPERTYPATH("primitivePropertyPath", 174, 1151, 11),
        /** id = <code>129</code>, name = <code>"primitiveTypeName"</code> */
        PRIMITIVETYPENAME("primitiveTypeName", 129, 865, 23),
        /** id = <code>284</code>, name = <code>"primitiveVJSONLiteral"</code> */
        PRIMITIVEVJSONLITERAL("primitiveVJSONLiteral", 284, 2114, 1),
        /** id = <code>138</code>, name = <code>"propertyName"</code> */
        PROPERTYNAME("propertyName", 138, 912, 7),
        /** id = <code>165</code>, name = <code>"qualifiedActionName"</code> */
        QUALIFIEDACTIONNAME("qualifiedActionName", 165, 981, 7),
        /** id = <code>127</code>, name = <code>"qualifiedComplexTypeName"</code> */
        QUALIFIEDCOMPLEXTYPENAME("qualifiedComplexTypeName", 127, 857, 4),
        /** id = <code>126</code>, name = <code>"qualifiedEntityTypeName"</code> */
        QUALIFIEDENTITYTYPENAME("qualifiedEntityTypeName", 126, 853, 4),
        /** id = <code>128</code>, name = <code>"qualifiedEnumerationTypeName"</code> */
        QUALIFIEDENUMERATIONTYPENAME("qualifiedEnumerationTypeName", 128, 861, 4),
        /** id = <code>166</code>, name = <code>"qualifiedFunctionName"</code> */
        QUALIFIEDFUNCTIONNAME("qualifiedFunctionName", 166, 988, 7),
        /** id = <code>125</code>, name = <code>"qualifiedTypeName"</code> */
        QUALIFIEDTYPENAME("qualifiedTypeName", 125, 840, 13),
        /** id = <code>4</code>, name = <code>"queryOption"</code> */
        QUERYOPTION("queryOption", 4, 32, 5),
        /** id = <code>3</code>, name = <code>"queryOptions"</code> */
        QUERYOPTIONS("queryOptions", 3, 26, 6),
        /** id = <code>285</code>, name = <code>"quotation-mark"</code> */
        QUOTATION_MARK("quotation-mark", 285, 2115, 1),
        /** id = <code>44</code>, name = <code>"reg-name"</code> */
        REG_NAME("reg-name", 44, 405, 5),
        /** id = <code>253</code>, name = <code>"replaceMethodCallExpr"</code> */
        REPLACEMETHODCALLEXPR("replaceMethodCallExpr", 253, 1803, 23),
        /** id = <code>169</code>, name = <code>"resourcePath"</code> */
        RESOURCEPATH("resourcePath", 169, 1003, 44),
        /** id = <code>269</code>, name = <code>"roundMethodCallExpr"</code> */
        ROUNDMETHODCALLEXPR("roundMethodCallExpr", 269, 2027, 11),
        /** id = <code>93</code>, name = <code>"sbyte"</code> */
        SBYTE("sbyte", 93, 724, 5),
        /** id = <code>34</code>, name = <code>"scheme"</code> */
        SCHEME("scheme", 34, 250, 9),
        /** id = <code>75</code>, name = <code>"second"</code> */
        SECOND("second", 75, 558, 1),
        /** id = <code>268</code>, name = <code>"secondMethodCallExpr"</code> */
        SECONDMETHODCALLEXPR("secondMethodCallExpr", 268, 2016, 11),
        /** id = <code>45</code>, name = <code>"segment-nz"</code> */
        SEGMENT_NZ("segment-nz", 45, 410, 2),
        /** id = <code>16</code>, name = <code>"select"</code> */
        SELECT("select", 16, 132, 3),
        /** id = <code>17</code>, name = <code>"selectClause"</code> */
        SELECTCLAUSE("selectClause", 17, 135, 6),
        /** id = <code>18</code>, name = <code>"selectItem"</code> */
        SELECTITEM("selectItem", 18, 141, 18),
        /** id = <code>1</code>, name = <code>"serviceRoot"</code> */
        SERVICEROOT("serviceRoot", 1, 14, 6),
        /** id = <code>58</code>, name = <code>"sign"</code> */
        SIGN("sign", 58, 485, 3),
        /** id = <code>180</code>, name = <code>"simpleKey"</code> */
        SIMPLEKEY("simpleKey", 180, 1197, 4),
        /** id = <code>90</code>, name = <code>"single"</code> */
        SINGLE("single", 90, 700, 4),
        /** id = <code>89</code>, name = <code>"singleBody"</code> */
        SINGLEBODY("singleBody", 89, 689, 11),
        /** id = <code>172</code>, name = <code>"singleNavigation"</code> */
        SINGLENAVIGATION("singleNavigation", 172, 1084, 31),
        /** id = <code>243</code>, name = <code>"singleNavigationExpr"</code> */
        SINGLENAVIGATIONEXPR("singleNavigationExpr", 243, 1666, 25),
        /** id = <code>12</code>, name = <code>"skip"</code> */
        SKIP("skip", 12, 109, 4),
        /** id = <code>21</code>, name = <code>"skiptoken"</code> */
        SKIPTOKEN("skiptoken", 21, 169, 4),
        /** id = <code>28</code>, name = <code>"SP"</code> */
        SP("SP", 28, 240, 1),
        /** id = <code>56</code>, name = <code>"SQUOTE"</code> */
        SQUOTE("SQUOTE", 56, 483, 1),
        /** id = <code>98</code>, name = <code>"SQUOTE-in-string"</code> */
        SQUOTE_IN_STRING("SQUOTE-in-string", 98, 754, 3),
        /** id = <code>63</code>, name = <code>"star"</code> */
        STAR("star", 63, 492, 1),
        /** id = <code>254</code>, name = <code>"startsWithMethodCallExpr"</code> */
        STARTSWITHMETHODCALLEXPR("startsWithMethodCallExpr", 254, 1826, 17),
        /** id = <code>137</code>, name = <code>"streamProperty"</code> */
        STREAMPROPERTY("streamProperty", 137, 911, 1),
        /** id = <code>177</code>, name = <code>"streamPropertyPath"</code> */
        STREAMPROPERTYPATH("streamPropertyPath", 177, 1186, 7),
        /** id = <code>97</code>, name = <code>"string"</code> */
        STRING("string", 97, 746, 8),
        /** id = <code>49</code>, name = <code>"sub-delims"</code> */
        SUB_DELIMS("sub-delims", 49, 429, 12),
        /** id = <code>229</code>, name = <code>"subExpr"</code> */
        SUBEXPR("subExpr", 229, 1496, 6),
        /** id = <code>258</code>, name = <code>"substringMethodCallExpr"</code> */
        SUBSTRINGMETHODCALLEXPR("substringMethodCallExpr", 258, 1876, 25),
        /** id = <code>259</code>, name = <code>"substringOfMethodCallExpr"</code> */
        SUBSTRINGOFMETHODCALLEXPR("substringOfMethodCallExpr", 259, 1901, 19),
        /** id = <code>5</code>, name = <code>"systemQueryOption"</code> */
        SYSTEMQUERYOPTION("systemQueryOption", 5, 37, 10),
        /** id = <code>99</code>, name = <code>"time"</code> */
        TIME("time", 99, 757, 45),
        /** id = <code>255</code>, name = <code>"toLowerMethodCallExpr"</code> */
        TOLOWERMETHODCALLEXPR("toLowerMethodCallExpr", 255, 1843, 11),
        /** id = <code>13</code>, name = <code>"top"</code> */
        TOP("top", 13, 113, 4),
        /** id = <code>256</code>, name = <code>"toUpperMethodCallExpr"</code> */
        TOUPPERMETHODCALLEXPR("toUpperMethodCallExpr", 256, 1854, 11),
        /** id = <code>257</code>, name = <code>"trimMethodCallExpr"</code> */
        TRIMMETHODCALLEXPR("trimMethodCallExpr", 257, 1865, 11),
        /** id = <code>211</code>, name = <code>"typeNVPInVJSON"</code> */
        TYPENVPINVJSON("typeNVPInVJSON", 211, 1351, 8),
        /** id = <code>48</code>, name = <code>"unreserved"</code> */
        UNRESERVED("unreserved", 48, 422, 7),
        /** id = <code>51</code>, name = <code>"UTF8-1"</code> */
        UTF8_1("UTF8-1", 51, 446, 1),
        /** id = <code>52</code>, name = <code>"UTF8-2"</code> */
        UTF8_2("UTF8-2", 52, 447, 3),
        /** id = <code>53</code>, name = <code>"UTF8-3"</code> */
        UTF8_3("UTF8-3", 53, 450, 17),
        /** id = <code>54</code>, name = <code>"UTF8-4"</code> */
        UTF8_4("UTF8-4", 54, 467, 15),
        /** id = <code>50</code>, name = <code>"UTF8-char"</code> */
        UTF8_CHAR("UTF8-char", 50, 441, 5),
        /** id = <code>55</code>, name = <code>"UTF8-tail"</code> */
        UTF8_TAIL("UTF8-tail", 55, 482, 1),
        /** id = <code>178</code>, name = <code>"value"</code> */
        VALUE("value", 178, 1193, 1),
        /** id = <code>61</code>, name = <code>"value-separator"</code> */
        VALUE_SEPARATOR("value-separator", 61, 490, 1),
        /** id = <code>162</code>, name = <code>"voidAction"</code> */
        VOIDACTION("voidAction", 162, 968, 1),
        /** id = <code>30</code>, name = <code>"WSP"</code> */
        WSP("WSP", 30, 242, 3),
        /** id = <code>70</code>, name = <code>"year"</code> */
        YEAR("year", 70, 521, 2),
        /** id = <code>263</code>, name = <code>"yearMethodCallExpr"</code> */
        YEARMETHODCALLEXPR("yearMethodCallExpr", 263, 1961, 11),
        /** id = <code>69</code>, name = <code>"zeroToFiftyNine"</code> */
        ZEROTOFIFTYNINE("zeroToFiftyNine", 69, 512, 9);
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
    	Rule[] rules = new Rule[286];
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
    	Opcode[] op = new Opcode[2116];
        {int[] a = {1,2,3,4,8,9}; op[0] = getOpcodeCat(a);}
        op[1] = getOpcodeRnm(34, 250); // scheme
        {char[] a = {58,47,47}; op[2] = getOpcodeTls(a);}
        op[3] = getOpcodeRnm(35, 259); // host
        op[4] = getOpcodeRep((char)0, (char)1, 5);
        {int[] a = {6,7}; op[5] = getOpcodeCat(a);}
        {char[] a = {58}; op[6] = getOpcodeTls(a);}
        op[7] = getOpcodeRnm(36, 263); // port
        op[8] = getOpcodeRnm(1, 14); // serviceRoot
        op[9] = getOpcodeRep((char)0, (char)1, 10);
        {int[] a = {11,12,13}; op[10] = getOpcodeAlt(a);}
        {char[] a = {36,109,101,116,97,100,97,116,97}; op[11] = getOpcodeTls(a);}
        {char[] a = {36,98,97,116,99,104}; op[12] = getOpcodeTls(a);}
        op[13] = getOpcodeRnm(2, 20); // odataRelativeUri
        {int[] a = {15,16}; op[14] = getOpcodeCat(a);}
        {char[] a = {47}; op[15] = getOpcodeTls(a);}
        op[16] = getOpcodeRep((char)0, Character.MAX_VALUE, 17);
        {int[] a = {18,19}; op[17] = getOpcodeCat(a);}
        op[18] = getOpcodeRnm(45, 410); // segment-nz
        {char[] a = {47}; op[19] = getOpcodeTls(a);}
        {int[] a = {21,22}; op[20] = getOpcodeCat(a);}
        op[21] = getOpcodeRnm(169, 1003); // resourcePath
        op[22] = getOpcodeRep((char)0, (char)1, 23);
        {int[] a = {24,25}; op[23] = getOpcodeCat(a);}
        {char[] a = {63}; op[24] = getOpcodeTls(a);}
        op[25] = getOpcodeRnm(3, 26); // queryOptions
        {int[] a = {27,28}; op[26] = getOpcodeCat(a);}
        op[27] = getOpcodeRnm(4, 32); // queryOption
        op[28] = getOpcodeRep((char)0, Character.MAX_VALUE, 29);
        {int[] a = {30,31}; op[29] = getOpcodeCat(a);}
        {char[] a = {38}; op[30] = getOpcodeTls(a);}
        op[31] = getOpcodeRnm(4, 32); // queryOption
        {int[] a = {33,34,35,36}; op[32] = getOpcodeAlt(a);}
        op[33] = getOpcodeRnm(5, 37); // systemQueryOption
        op[34] = getOpcodeRnm(204, 1290); // aliasAndValue
        op[35] = getOpcodeRnm(205, 1294); // parameterNameAndValue
        op[36] = getOpcodeRnm(22, 173); // customQueryOption
        {int[] a = {38,39,40,41,42,43,44,45,46}; op[37] = getOpcodeAlt(a);}
        op[38] = getOpcodeRnm(6, 47); // expand
        op[39] = getOpcodeRnm(9, 70); // filter
        op[40] = getOpcodeRnm(10, 78); // orderby
        op[41] = getOpcodeRnm(12, 109); // skip
        op[42] = getOpcodeRnm(13, 113); // top
        op[43] = getOpcodeRnm(14, 117); // format
        op[44] = getOpcodeRnm(15, 127); // inlinecount
        op[45] = getOpcodeRnm(16, 132); // select
        op[46] = getOpcodeRnm(21, 169); // skiptoken
        {int[] a = {48,49}; op[47] = getOpcodeCat(a);}
        {char[] a = {36,101,120,112,97,110,100,61}; op[48] = getOpcodeTls(a);}
        op[49] = getOpcodeRnm(7, 50); // expandClause
        {int[] a = {51,52}; op[50] = getOpcodeCat(a);}
        op[51] = getOpcodeRnm(8, 56); // expandItem
        op[52] = getOpcodeRep((char)0, Character.MAX_VALUE, 53);
        {int[] a = {54,55}; op[53] = getOpcodeCat(a);}
        {char[] a = {44}; op[54] = getOpcodeTls(a);}
        op[55] = getOpcodeRnm(8, 56); // expandItem
        {int[] a = {57,61,62}; op[56] = getOpcodeCat(a);}
        op[57] = getOpcodeRep((char)0, (char)1, 58);
        {int[] a = {59,60}; op[58] = getOpcodeCat(a);}
        op[59] = getOpcodeRnm(126, 853); // qualifiedEntityTypeName
        {char[] a = {47}; op[60] = getOpcodeTls(a);}
        op[61] = getOpcodeRnm(142, 922); // navigationProperty
        op[62] = getOpcodeRep((char)0, Character.MAX_VALUE, 63);
        {int[] a = {64,65,69}; op[63] = getOpcodeCat(a);}
        {char[] a = {47}; op[64] = getOpcodeTls(a);}
        op[65] = getOpcodeRep((char)0, (char)1, 66);
        {int[] a = {67,68}; op[66] = getOpcodeCat(a);}
        op[67] = getOpcodeRnm(126, 853); // qualifiedEntityTypeName
        {char[] a = {47}; op[68] = getOpcodeTls(a);}
        op[69] = getOpcodeRnm(142, 922); // navigationProperty
        {int[] a = {71,72,74,75,77}; op[70] = getOpcodeCat(a);}
        {char[] a = {36,102,105,108,116,101,114}; op[71] = getOpcodeTls(a);}
        op[72] = getOpcodeRep((char)0, Character.MAX_VALUE, 73);
        op[73] = getOpcodeRnm(30, 242); // WSP
        {char[] a = {61}; op[74] = getOpcodeTls(a);}
        op[75] = getOpcodeRep((char)0, Character.MAX_VALUE, 76);
        op[76] = getOpcodeRnm(30, 242); // WSP
        op[77] = getOpcodeRnm(215, 1401); // boolCommonExpr
        {int[] a = {79,80,82,83,85,86,93}; op[78] = getOpcodeCat(a);}
        {char[] a = {36,111,114,100,101,114,98,121}; op[79] = getOpcodeTls(a);}
        op[80] = getOpcodeRep((char)0, Character.MAX_VALUE, 81);
        op[81] = getOpcodeRnm(30, 242); // WSP
        {char[] a = {61}; op[82] = getOpcodeTls(a);}
        op[83] = getOpcodeRep((char)0, Character.MAX_VALUE, 84);
        op[84] = getOpcodeRnm(30, 242); // WSP
        op[85] = getOpcodeRnm(11, 106); // orderExpr
        op[86] = getOpcodeRep((char)0, (char)1, 87);
        {int[] a = {88,90}; op[87] = getOpcodeCat(a);}
        op[88] = getOpcodeRep((char)1, Character.MAX_VALUE, 89);
        op[89] = getOpcodeRnm(30, 242); // WSP
        {int[] a = {91,92}; op[90] = getOpcodeAlt(a);}
        {char[] a = {97,115,99}; op[91] = getOpcodeTls(a);}
        {char[] a = {100,101,115,99}; op[92] = getOpcodeTls(a);}
        op[93] = getOpcodeRep((char)0, Character.MAX_VALUE, 94);
        {int[] a = {95,96,98,99}; op[94] = getOpcodeCat(a);}
        op[95] = getOpcodeRnm(57, 484); // COMMA
        op[96] = getOpcodeRep((char)0, Character.MAX_VALUE, 97);
        op[97] = getOpcodeRnm(30, 242); // WSP
        op[98] = getOpcodeRnm(11, 106); // orderExpr
        op[99] = getOpcodeRep((char)0, (char)1, 100);
        {int[] a = {101,103}; op[100] = getOpcodeCat(a);}
        op[101] = getOpcodeRep((char)1, Character.MAX_VALUE, 102);
        op[102] = getOpcodeRnm(30, 242); // WSP
        {int[] a = {104,105}; op[103] = getOpcodeAlt(a);}
        {char[] a = {97,115,99}; op[104] = getOpcodeTls(a);}
        {char[] a = {100,101,115,99}; op[105] = getOpcodeTls(a);}
        {int[] a = {107,108}; op[106] = getOpcodeAlt(a);}
        op[107] = getOpcodeRnm(132, 906); // primitiveKeyProperty
        op[108] = getOpcodeRnm(133, 907); // primitiveNonKeyProperty
        {int[] a = {110,111}; op[109] = getOpcodeCat(a);}
        {char[] a = {36,115,107,105,112,61}; op[110] = getOpcodeTls(a);}
        op[111] = getOpcodeRep((char)1, Character.MAX_VALUE, 112);
        op[112] = getOpcodeRnm(26, 231); // DIGIT
        {int[] a = {114,115}; op[113] = getOpcodeCat(a);}
        {char[] a = {36,116,111,112,61}; op[114] = getOpcodeTls(a);}
        op[115] = getOpcodeRep((char)1, Character.MAX_VALUE, 116);
        op[116] = getOpcodeRnm(26, 231); // DIGIT
        {int[] a = {118,119}; op[117] = getOpcodeCat(a);}
        {char[] a = {36,102,111,114,109,97,116,61}; op[118] = getOpcodeTls(a);}
        {int[] a = {120,121,122,123}; op[119] = getOpcodeAlt(a);}
        {char[] a = {106,115,111,110}; op[120] = getOpcodeTls(a);}
        {char[] a = {97,116,111,109}; op[121] = getOpcodeTls(a);}
        {char[] a = {120,109,108}; op[122] = getOpcodeTls(a);}
        op[123] = getOpcodeRep((char)1, Character.MAX_VALUE, 124);
        {int[] a = {125,126}; op[124] = getOpcodeAlt(a);}
        op[125] = getOpcodeRnm(46, 412); // pchar
        {char[] a = {47}; op[126] = getOpcodeTls(a);}
        {int[] a = {128,129}; op[127] = getOpcodeCat(a);}
        {char[] a = {36,105,110,108,105,110,101,99,111,117,110,116,61}; op[128] = getOpcodeTls(a);}
        {int[] a = {130,131}; op[129] = getOpcodeAlt(a);}
        {char[] a = {97,108,108,112,97,103,101,115}; op[130] = getOpcodeTls(a);}
        {char[] a = {110,111,110,101}; op[131] = getOpcodeTls(a);}
        {int[] a = {133,134}; op[132] = getOpcodeCat(a);}
        {char[] a = {36,115,101,108,101,99,116,61}; op[133] = getOpcodeTls(a);}
        op[134] = getOpcodeRnm(17, 135); // selectClause
        {int[] a = {136,137}; op[135] = getOpcodeCat(a);}
        op[136] = getOpcodeRnm(18, 141); // selectItem
        op[137] = getOpcodeRep((char)0, Character.MAX_VALUE, 138);
        {int[] a = {139,140}; op[138] = getOpcodeCat(a);}
        op[139] = getOpcodeRnm(57, 484); // COMMA
        op[140] = getOpcodeRnm(18, 141); // selectItem
        {int[] a = {142,143}; op[141] = getOpcodeAlt(a);}
        op[142] = getOpcodeRnm(63, 492); // star
        {int[] a = {144,148}; op[143] = getOpcodeCat(a);}
        op[144] = getOpcodeRep((char)0, (char)1, 145);
        {int[] a = {146,147}; op[145] = getOpcodeCat(a);}
        op[146] = getOpcodeRnm(126, 853); // qualifiedEntityTypeName
        {char[] a = {47}; op[147] = getOpcodeTls(a);}
        {int[] a = {149,155,156,157,158}; op[148] = getOpcodeAlt(a);}
        {int[] a = {150,151}; op[149] = getOpcodeCat(a);}
        op[150] = getOpcodeRnm(142, 922); // navigationProperty
        op[151] = getOpcodeRep((char)0, (char)1, 152);
        {int[] a = {153,154}; op[152] = getOpcodeCat(a);}
        {char[] a = {47}; op[153] = getOpcodeTls(a);}
        op[154] = getOpcodeRnm(18, 141); // selectItem
        op[155] = getOpcodeRnm(138, 912); // propertyName
        op[156] = getOpcodeRnm(19, 159); // allOperationsInContainer
        op[157] = getOpcodeRnm(165, 981); // qualifiedActionName
        op[158] = getOpcodeRnm(166, 988); // qualifiedFunctionName
        {int[] a = {160,161}; op[159] = getOpcodeCat(a);}
        op[160] = getOpcodeRnm(20, 162); // operationQualifier
        {char[] a = {42}; op[161] = getOpcodeTls(a);}
        {int[] a = {163,167,168}; op[162] = getOpcodeCat(a);}
        op[163] = getOpcodeRep((char)0, (char)1, 164);
        {int[] a = {165,166}; op[164] = getOpcodeCat(a);}
        op[165] = getOpcodeRnm(119, 829); // namespace
        {char[] a = {46}; op[166] = getOpcodeTls(a);}
        op[167] = getOpcodeRnm(139, 919); // entityContainerName
        {char[] a = {46}; op[168] = getOpcodeTls(a);}
        {int[] a = {170,171}; op[169] = getOpcodeCat(a);}
        {char[] a = {36,115,107,105,112,116,111,107,101,110,61}; op[170] = getOpcodeTls(a);}
        op[171] = getOpcodeRep((char)1, Character.MAX_VALUE, 172);
        op[172] = getOpcodeRnm(46, 412); // pchar
        {int[] a = {174,175,177}; op[173] = getOpcodeCat(a);}
        op[174] = getOpcodeRnm(23, 183); // customName
        op[175] = getOpcodeRep((char)0, Character.MAX_VALUE, 176);
        op[176] = getOpcodeRnm(30, 242); // WSP
        op[177] = getOpcodeRep((char)0, (char)1, 178);
        {int[] a = {179,180,182}; op[178] = getOpcodeCat(a);}
        {char[] a = {61}; op[179] = getOpcodeTls(a);}
        op[180] = getOpcodeRep((char)0, Character.MAX_VALUE, 181);
        op[181] = getOpcodeRnm(30, 242); // WSP
        op[182] = getOpcodeRnm(24, 212); // customValue
        {int[] a = {184,197}; op[183] = getOpcodeCat(a);}
        {int[] a = {185,186,187,188,189,190,191,192,193,194,195,196}; op[184] = getOpcodeAlt(a);}
        op[185] = getOpcodeRnm(48, 422); // unreserved
        op[186] = getOpcodeRnm(47, 418); // pct-encoded
        {char[] a = {58}; op[187] = getOpcodeTls(a);}
        {char[] a = {64}; op[188] = getOpcodeTls(a);}
        {char[] a = {33}; op[189] = getOpcodeTls(a);}
        {char[] a = {39}; op[190] = getOpcodeTls(a);}
        {char[] a = {40}; op[191] = getOpcodeTls(a);}
        {char[] a = {41}; op[192] = getOpcodeTls(a);}
        {char[] a = {42}; op[193] = getOpcodeTls(a);}
        {char[] a = {43}; op[194] = getOpcodeTls(a);}
        {char[] a = {44}; op[195] = getOpcodeTls(a);}
        {char[] a = {59}; op[196] = getOpcodeTls(a);}
        op[197] = getOpcodeRep((char)0, Character.MAX_VALUE, 198);
        {int[] a = {199,200,201,202,203,204,205,206,207,208,209,210,211}; op[198] = getOpcodeAlt(a);}
        op[199] = getOpcodeRnm(48, 422); // unreserved
        op[200] = getOpcodeRnm(47, 418); // pct-encoded
        {char[] a = {58}; op[201] = getOpcodeTls(a);}
        {char[] a = {64}; op[202] = getOpcodeTls(a);}
        {char[] a = {33}; op[203] = getOpcodeTls(a);}
        {char[] a = {36}; op[204] = getOpcodeTls(a);}
        {char[] a = {39}; op[205] = getOpcodeTls(a);}
        {char[] a = {40}; op[206] = getOpcodeTls(a);}
        {char[] a = {41}; op[207] = getOpcodeTls(a);}
        {char[] a = {42}; op[208] = getOpcodeTls(a);}
        {char[] a = {43}; op[209] = getOpcodeTls(a);}
        {char[] a = {44}; op[210] = getOpcodeTls(a);}
        {char[] a = {59}; op[211] = getOpcodeTls(a);}
        op[212] = getOpcodeRep((char)0, Character.MAX_VALUE, 213);
        {int[] a = {214,215,216,217,218,219,220,221,222,223,224,225,226,227}; op[213] = getOpcodeAlt(a);}
        op[214] = getOpcodeRnm(48, 422); // unreserved
        op[215] = getOpcodeRnm(47, 418); // pct-encoded
        {char[] a = {58}; op[216] = getOpcodeTls(a);}
        {char[] a = {64}; op[217] = getOpcodeTls(a);}
        {char[] a = {33}; op[218] = getOpcodeTls(a);}
        {char[] a = {36}; op[219] = getOpcodeTls(a);}
        {char[] a = {39}; op[220] = getOpcodeTls(a);}
        {char[] a = {40}; op[221] = getOpcodeTls(a);}
        {char[] a = {41}; op[222] = getOpcodeTls(a);}
        {char[] a = {42}; op[223] = getOpcodeTls(a);}
        {char[] a = {43}; op[224] = getOpcodeTls(a);}
        {char[] a = {44}; op[225] = getOpcodeTls(a);}
        {char[] a = {59}; op[226] = getOpcodeTls(a);}
        {char[] a = {61}; op[227] = getOpcodeTls(a);}
        {int[] a = {229,230}; op[228] = getOpcodeAlt(a);}
        op[229] = getOpcodeTrg((char)65, (char)90);
        op[230] = getOpcodeTrg((char)97, (char)122);
        op[231] = getOpcodeTrg((char)48, (char)57);
        {int[] a = {233,234,235,236,237,238,239}; op[232] = getOpcodeAlt(a);}
        op[233] = getOpcodeRnm(26, 231); // DIGIT
        {char[] a = {65}; op[234] = getOpcodeTls(a);}
        {char[] a = {66}; op[235] = getOpcodeTls(a);}
        {char[] a = {67}; op[236] = getOpcodeTls(a);}
        {char[] a = {68}; op[237] = getOpcodeTls(a);}
        {char[] a = {69}; op[238] = getOpcodeTls(a);}
        {char[] a = {70}; op[239] = getOpcodeTls(a);}
        {char[] a = {32}; op[240] = getOpcodeTbs(a);}
        {char[] a = {9}; op[241] = getOpcodeTbs(a);}
        {int[] a = {243,244}; op[242] = getOpcodeAlt(a);}
        op[243] = getOpcodeRnm(28, 240); // SP
        op[244] = getOpcodeRnm(29, 241); // HTAB
        {char[] a = {13}; op[245] = getOpcodeTbs(a);}
        {char[] a = {10}; op[246] = getOpcodeTbs(a);}
        {int[] a = {248,249}; op[247] = getOpcodeCat(a);}
        op[248] = getOpcodeRnm(31, 245); // CR
        op[249] = getOpcodeRnm(32, 246); // LF
        {int[] a = {251,252}; op[250] = getOpcodeCat(a);}
        op[251] = getOpcodeRnm(25, 228); // ALPHA
        op[252] = getOpcodeRep((char)0, Character.MAX_VALUE, 253);
        {int[] a = {254,255,256,257,258}; op[253] = getOpcodeAlt(a);}
        op[254] = getOpcodeRnm(25, 228); // ALPHA
        op[255] = getOpcodeRnm(26, 231); // DIGIT
        {char[] a = {43}; op[256] = getOpcodeTls(a);}
        {char[] a = {45}; op[257] = getOpcodeTls(a);}
        {char[] a = {46}; op[258] = getOpcodeTls(a);}
        {int[] a = {260,261,262}; op[259] = getOpcodeAlt(a);}
        op[260] = getOpcodeRnm(37, 265); // IP-literal
        op[261] = getOpcodeRnm(42, 381); // IPv4address
        op[262] = getOpcodeRnm(44, 405); // reg-name
        op[263] = getOpcodeRep((char)0, Character.MAX_VALUE, 264);
        op[264] = getOpcodeRnm(26, 231); // DIGIT
        {int[] a = {266,267,270}; op[265] = getOpcodeCat(a);}
        {char[] a = {91}; op[266] = getOpcodeTls(a);}
        {int[] a = {268,269}; op[267] = getOpcodeAlt(a);}
        op[268] = getOpcodeRnm(39, 281); // IPv6address
        op[269] = getOpcodeRnm(38, 271); // IPvFuture
        {char[] a = {93}; op[270] = getOpcodeTls(a);}
        {int[] a = {272,273,275,276}; op[271] = getOpcodeCat(a);}
        {char[] a = {118}; op[272] = getOpcodeTls(a);}
        op[273] = getOpcodeRep((char)1, Character.MAX_VALUE, 274);
        op[274] = getOpcodeRnm(27, 232); // HEXDIG
        {char[] a = {46}; op[275] = getOpcodeTls(a);}
        op[276] = getOpcodeRep((char)1, Character.MAX_VALUE, 277);
        {int[] a = {278,279,280}; op[277] = getOpcodeAlt(a);}
        op[278] = getOpcodeRnm(48, 422); // unreserved
        op[279] = getOpcodeRnm(49, 429); // sub-delims
        {char[] a = {58}; op[280] = getOpcodeTls(a);}
        {int[] a = {282,288,295,304,318,332,344,354,364}; op[281] = getOpcodeAlt(a);}
        {int[] a = {283,287}; op[282] = getOpcodeCat(a);}
        op[283] = getOpcodeRep((char)6, (char)6, 284);
        {int[] a = {285,286}; op[284] = getOpcodeCat(a);}
        op[285] = getOpcodeRnm(40, 373); // h16
        {char[] a = {58}; op[286] = getOpcodeTls(a);}
        op[287] = getOpcodeRnm(41, 375); // ls32
        {int[] a = {289,290,294}; op[288] = getOpcodeCat(a);}
        {char[] a = {58,58}; op[289] = getOpcodeTls(a);}
        op[290] = getOpcodeRep((char)5, (char)5, 291);
        {int[] a = {292,293}; op[291] = getOpcodeCat(a);}
        op[292] = getOpcodeRnm(40, 373); // h16
        {char[] a = {58}; op[293] = getOpcodeTls(a);}
        op[294] = getOpcodeRnm(41, 375); // ls32
        {int[] a = {296,298,299,303}; op[295] = getOpcodeCat(a);}
        op[296] = getOpcodeRep((char)0, (char)1, 297);
        op[297] = getOpcodeRnm(40, 373); // h16
        {char[] a = {58,58}; op[298] = getOpcodeTls(a);}
        op[299] = getOpcodeRep((char)4, (char)4, 300);
        {int[] a = {301,302}; op[300] = getOpcodeCat(a);}
        op[301] = getOpcodeRnm(40, 373); // h16
        {char[] a = {58}; op[302] = getOpcodeTls(a);}
        op[303] = getOpcodeRnm(41, 375); // ls32
        {int[] a = {305,312,313,317}; op[304] = getOpcodeCat(a);}
        op[305] = getOpcodeRep((char)0, (char)1, 306);
        {int[] a = {307,311}; op[306] = getOpcodeCat(a);}
        op[307] = getOpcodeRep((char)0, (char)1, 308);
        {int[] a = {309,310}; op[308] = getOpcodeCat(a);}
        op[309] = getOpcodeRnm(40, 373); // h16
        {char[] a = {58}; op[310] = getOpcodeTls(a);}
        op[311] = getOpcodeRnm(40, 373); // h16
        {char[] a = {58,58}; op[312] = getOpcodeTls(a);}
        op[313] = getOpcodeRep((char)3, (char)3, 314);
        {int[] a = {315,316}; op[314] = getOpcodeCat(a);}
        op[315] = getOpcodeRnm(40, 373); // h16
        {char[] a = {58}; op[316] = getOpcodeTls(a);}
        op[317] = getOpcodeRnm(41, 375); // ls32
        {int[] a = {319,326,327,331}; op[318] = getOpcodeCat(a);}
        op[319] = getOpcodeRep((char)0, (char)1, 320);
        {int[] a = {321,325}; op[320] = getOpcodeCat(a);}
        op[321] = getOpcodeRep((char)0, (char)2, 322);
        {int[] a = {323,324}; op[322] = getOpcodeCat(a);}
        op[323] = getOpcodeRnm(40, 373); // h16
        {char[] a = {58}; op[324] = getOpcodeTls(a);}
        op[325] = getOpcodeRnm(40, 373); // h16
        {char[] a = {58,58}; op[326] = getOpcodeTls(a);}
        op[327] = getOpcodeRep((char)2, (char)2, 328);
        {int[] a = {329,330}; op[328] = getOpcodeCat(a);}
        op[329] = getOpcodeRnm(40, 373); // h16
        {char[] a = {58}; op[330] = getOpcodeTls(a);}
        op[331] = getOpcodeRnm(41, 375); // ls32
        {int[] a = {333,340,341,342,343}; op[332] = getOpcodeCat(a);}
        op[333] = getOpcodeRep((char)0, (char)1, 334);
        {int[] a = {335,339}; op[334] = getOpcodeCat(a);}
        op[335] = getOpcodeRep((char)0, (char)3, 336);
        {int[] a = {337,338}; op[336] = getOpcodeCat(a);}
        op[337] = getOpcodeRnm(40, 373); // h16
        {char[] a = {58}; op[338] = getOpcodeTls(a);}
        op[339] = getOpcodeRnm(40, 373); // h16
        {char[] a = {58,58}; op[340] = getOpcodeTls(a);}
        op[341] = getOpcodeRnm(40, 373); // h16
        {char[] a = {58}; op[342] = getOpcodeTls(a);}
        op[343] = getOpcodeRnm(41, 375); // ls32
        {int[] a = {345,352,353}; op[344] = getOpcodeCat(a);}
        op[345] = getOpcodeRep((char)0, (char)1, 346);
        {int[] a = {347,351}; op[346] = getOpcodeCat(a);}
        op[347] = getOpcodeRep((char)0, (char)4, 348);
        {int[] a = {349,350}; op[348] = getOpcodeCat(a);}
        op[349] = getOpcodeRnm(40, 373); // h16
        {char[] a = {58}; op[350] = getOpcodeTls(a);}
        op[351] = getOpcodeRnm(40, 373); // h16
        {char[] a = {58,58}; op[352] = getOpcodeTls(a);}
        op[353] = getOpcodeRnm(41, 375); // ls32
        {int[] a = {355,362,363}; op[354] = getOpcodeCat(a);}
        op[355] = getOpcodeRep((char)0, (char)1, 356);
        {int[] a = {357,361}; op[356] = getOpcodeCat(a);}
        op[357] = getOpcodeRep((char)0, (char)5, 358);
        {int[] a = {359,360}; op[358] = getOpcodeCat(a);}
        op[359] = getOpcodeRnm(40, 373); // h16
        {char[] a = {58}; op[360] = getOpcodeTls(a);}
        op[361] = getOpcodeRnm(40, 373); // h16
        {char[] a = {58,58}; op[362] = getOpcodeTls(a);}
        op[363] = getOpcodeRnm(40, 373); // h16
        {int[] a = {365,372}; op[364] = getOpcodeCat(a);}
        op[365] = getOpcodeRep((char)0, (char)1, 366);
        {int[] a = {367,371}; op[366] = getOpcodeCat(a);}
        op[367] = getOpcodeRep((char)0, (char)6, 368);
        {int[] a = {369,370}; op[368] = getOpcodeCat(a);}
        op[369] = getOpcodeRnm(40, 373); // h16
        {char[] a = {58}; op[370] = getOpcodeTls(a);}
        op[371] = getOpcodeRnm(40, 373); // h16
        {char[] a = {58,58}; op[372] = getOpcodeTls(a);}
        op[373] = getOpcodeRep((char)1, (char)4, 374);
        op[374] = getOpcodeRnm(27, 232); // HEXDIG
        {int[] a = {376,380}; op[375] = getOpcodeAlt(a);}
        {int[] a = {377,378,379}; op[376] = getOpcodeCat(a);}
        op[377] = getOpcodeRnm(40, 373); // h16
        {char[] a = {58}; op[378] = getOpcodeTls(a);}
        op[379] = getOpcodeRnm(40, 373); // h16
        op[380] = getOpcodeRnm(42, 381); // IPv4address
        {int[] a = {382,383,384,385,386,387,388}; op[381] = getOpcodeCat(a);}
        op[382] = getOpcodeRnm(43, 389); // dec-octet
        {char[] a = {46}; op[383] = getOpcodeTls(a);}
        op[384] = getOpcodeRnm(43, 389); // dec-octet
        {char[] a = {46}; op[385] = getOpcodeTls(a);}
        op[386] = getOpcodeRnm(43, 389); // dec-octet
        {char[] a = {46}; op[387] = getOpcodeTls(a);}
        op[388] = getOpcodeRnm(43, 389); // dec-octet
        {int[] a = {390,394,398,401,404}; op[389] = getOpcodeAlt(a);}
        {int[] a = {391,392}; op[390] = getOpcodeCat(a);}
        {char[] a = {49}; op[391] = getOpcodeTls(a);}
        op[392] = getOpcodeRep((char)2, (char)2, 393);
        op[393] = getOpcodeRnm(26, 231); // DIGIT
        {int[] a = {395,396,397}; op[394] = getOpcodeCat(a);}
        {char[] a = {50}; op[395] = getOpcodeTls(a);}
        op[396] = getOpcodeTrg((char)48, (char)52);
        op[397] = getOpcodeRnm(26, 231); // DIGIT
        {int[] a = {399,400}; op[398] = getOpcodeCat(a);}
        {char[] a = {50,53}; op[399] = getOpcodeTls(a);}
        op[400] = getOpcodeTrg((char)48, (char)53);
        {int[] a = {402,403}; op[401] = getOpcodeCat(a);}
        op[402] = getOpcodeTrg((char)49, (char)57);
        op[403] = getOpcodeRnm(26, 231); // DIGIT
        op[404] = getOpcodeRnm(26, 231); // DIGIT
        op[405] = getOpcodeRep((char)0, Character.MAX_VALUE, 406);
        {int[] a = {407,408,409}; op[406] = getOpcodeAlt(a);}
        op[407] = getOpcodeRnm(48, 422); // unreserved
        op[408] = getOpcodeRnm(47, 418); // pct-encoded
        op[409] = getOpcodeRnm(49, 429); // sub-delims
        op[410] = getOpcodeRep((char)1, Character.MAX_VALUE, 411);
        op[411] = getOpcodeRnm(46, 412); // pchar
        {int[] a = {413,414,415,416,417}; op[412] = getOpcodeAlt(a);}
        op[413] = getOpcodeRnm(48, 422); // unreserved
        op[414] = getOpcodeRnm(47, 418); // pct-encoded
        op[415] = getOpcodeRnm(49, 429); // sub-delims
        {char[] a = {58}; op[416] = getOpcodeTls(a);}
        {char[] a = {64}; op[417] = getOpcodeTls(a);}
        {int[] a = {419,420,421}; op[418] = getOpcodeCat(a);}
        {char[] a = {37}; op[419] = getOpcodeTls(a);}
        op[420] = getOpcodeRnm(27, 232); // HEXDIG
        op[421] = getOpcodeRnm(27, 232); // HEXDIG
        {int[] a = {423,424,425,426,427,428}; op[422] = getOpcodeAlt(a);}
        op[423] = getOpcodeRnm(25, 228); // ALPHA
        op[424] = getOpcodeRnm(26, 231); // DIGIT
        {char[] a = {45}; op[425] = getOpcodeTls(a);}
        {char[] a = {46}; op[426] = getOpcodeTls(a);}
        {char[] a = {95}; op[427] = getOpcodeTls(a);}
        {char[] a = {126}; op[428] = getOpcodeTls(a);}
        {int[] a = {430,431,432,433,434,435,436,437,438,439,440}; op[429] = getOpcodeAlt(a);}
        {char[] a = {33}; op[430] = getOpcodeTls(a);}
        {char[] a = {36}; op[431] = getOpcodeTls(a);}
        {char[] a = {38}; op[432] = getOpcodeTls(a);}
        {char[] a = {39}; op[433] = getOpcodeTls(a);}
        {char[] a = {40}; op[434] = getOpcodeTls(a);}
        {char[] a = {41}; op[435] = getOpcodeTls(a);}
        {char[] a = {42}; op[436] = getOpcodeTls(a);}
        {char[] a = {43}; op[437] = getOpcodeTls(a);}
        {char[] a = {44}; op[438] = getOpcodeTls(a);}
        {char[] a = {59}; op[439] = getOpcodeTls(a);}
        {char[] a = {61}; op[440] = getOpcodeTls(a);}
        {int[] a = {442,443,444,445}; op[441] = getOpcodeAlt(a);}
        op[442] = getOpcodeRnm(51, 446); // UTF8-1
        op[443] = getOpcodeRnm(52, 447); // UTF8-2
        op[444] = getOpcodeRnm(53, 450); // UTF8-3
        op[445] = getOpcodeRnm(54, 467); // UTF8-4
        op[446] = getOpcodeTrg((char)0, (char)127);
        {int[] a = {448,449}; op[447] = getOpcodeCat(a);}
        op[448] = getOpcodeTrg((char)194, (char)223);
        op[449] = getOpcodeRnm(55, 482); // UTF8-tail
        {int[] a = {451,455,459,463}; op[450] = getOpcodeAlt(a);}
        {int[] a = {452,453,454}; op[451] = getOpcodeCat(a);}
        {char[] a = {224}; op[452] = getOpcodeTbs(a);}
        op[453] = getOpcodeTrg((char)160, (char)191);
        op[454] = getOpcodeRnm(55, 482); // UTF8-tail
        {int[] a = {456,457}; op[455] = getOpcodeCat(a);}
        op[456] = getOpcodeTrg((char)225, (char)236);
        op[457] = getOpcodeRep((char)2, (char)2, 458);
        op[458] = getOpcodeRnm(55, 482); // UTF8-tail
        {int[] a = {460,461,462}; op[459] = getOpcodeCat(a);}
        {char[] a = {237}; op[460] = getOpcodeTbs(a);}
        op[461] = getOpcodeTrg((char)128, (char)159);
        op[462] = getOpcodeRnm(55, 482); // UTF8-tail
        {int[] a = {464,465}; op[463] = getOpcodeCat(a);}
        op[464] = getOpcodeTrg((char)238, (char)239);
        op[465] = getOpcodeRep((char)2, (char)2, 466);
        op[466] = getOpcodeRnm(55, 482); // UTF8-tail
        {int[] a = {468,473,477}; op[467] = getOpcodeAlt(a);}
        {int[] a = {469,470,471}; op[468] = getOpcodeCat(a);}
        {char[] a = {240}; op[469] = getOpcodeTbs(a);}
        op[470] = getOpcodeTrg((char)144, (char)191);
        op[471] = getOpcodeRep((char)2, (char)2, 472);
        op[472] = getOpcodeRnm(55, 482); // UTF8-tail
        {int[] a = {474,475}; op[473] = getOpcodeCat(a);}
        op[474] = getOpcodeTrg((char)241, (char)243);
        op[475] = getOpcodeRep((char)3, (char)3, 476);
        op[476] = getOpcodeRnm(55, 482); // UTF8-tail
        {int[] a = {478,479,480}; op[477] = getOpcodeCat(a);}
        {char[] a = {244}; op[478] = getOpcodeTbs(a);}
        op[479] = getOpcodeTrg((char)128, (char)143);
        op[480] = getOpcodeRep((char)2, (char)2, 481);
        op[481] = getOpcodeRnm(55, 482); // UTF8-tail
        op[482] = getOpcodeTrg((char)128, (char)191);
        {char[] a = {39}; op[483] = getOpcodeTbs(a);}
        {char[] a = {44}; op[484] = getOpcodeTbs(a);}
        {int[] a = {486,487}; op[485] = getOpcodeAlt(a);}
        {char[] a = {43}; op[486] = getOpcodeTls(a);}
        {char[] a = {45}; op[487] = getOpcodeTls(a);}
        {char[] a = {123}; op[488] = getOpcodeTls(a);}
        {char[] a = {125}; op[489] = getOpcodeTls(a);}
        op[490] = getOpcodeRnm(57, 484); // COMMA
        {char[] a = {58}; op[491] = getOpcodeTls(a);}
        {char[] a = {42}; op[492] = getOpcodeTls(a);}
        {char[] a = {78,97,78}; op[493] = getOpcodeTbs(a);}
        {char[] a = {73,78,70}; op[494] = getOpcodeTbs(a);}
        {int[] a = {496,497}; op[495] = getOpcodeCat(a);}
        {char[] a = {45}; op[496] = getOpcodeTls(a);}
        op[497] = getOpcodeRnm(65, 494); // positiveInfinity
        {int[] a = {499,500,501}; op[498] = getOpcodeAlt(a);}
        op[499] = getOpcodeRnm(64, 493); // nan
        op[500] = getOpcodeRnm(66, 495); // negativeInfinity
        op[501] = getOpcodeRnm(65, 494); // positiveInfinity
        {int[] a = {503,504,505,506,507,508,509,510,511}; op[502] = getOpcodeAlt(a);}
        {char[] a = {49}; op[503] = getOpcodeTls(a);}
        {char[] a = {50}; op[504] = getOpcodeTls(a);}
        {char[] a = {51}; op[505] = getOpcodeTls(a);}
        {char[] a = {52}; op[506] = getOpcodeTls(a);}
        {char[] a = {53}; op[507] = getOpcodeTls(a);}
        {char[] a = {54}; op[508] = getOpcodeTls(a);}
        {char[] a = {55}; op[509] = getOpcodeTls(a);}
        {char[] a = {56}; op[510] = getOpcodeTls(a);}
        {char[] a = {57}; op[511] = getOpcodeTls(a);}
        {int[] a = {513,520}; op[512] = getOpcodeCat(a);}
        {int[] a = {514,515,516,517,518,519}; op[513] = getOpcodeAlt(a);}
        {char[] a = {48}; op[514] = getOpcodeTls(a);}
        {char[] a = {49}; op[515] = getOpcodeTls(a);}
        {char[] a = {50}; op[516] = getOpcodeTls(a);}
        {char[] a = {51}; op[517] = getOpcodeTls(a);}
        {char[] a = {52}; op[518] = getOpcodeTls(a);}
        {char[] a = {53}; op[519] = getOpcodeTls(a);}
        op[520] = getOpcodeRnm(26, 231); // DIGIT
        op[521] = getOpcodeRep((char)4, (char)4, 522);
        op[522] = getOpcodeRnm(26, 231); // DIGIT
        {int[] a = {524,527}; op[523] = getOpcodeAlt(a);}
        {int[] a = {525,526}; op[524] = getOpcodeCat(a);}
        {char[] a = {48}; op[525] = getOpcodeTls(a);}
        op[526] = getOpcodeRnm(68, 502); // oneToNine
        {int[] a = {528,529}; op[527] = getOpcodeCat(a);}
        {char[] a = {49}; op[528] = getOpcodeTls(a);}
        {int[] a = {530,531,532}; op[529] = getOpcodeAlt(a);}
        {char[] a = {48}; op[530] = getOpcodeTls(a);}
        {char[] a = {49}; op[531] = getOpcodeTls(a);}
        {char[] a = {50}; op[532] = getOpcodeTls(a);}
        {int[] a = {534,540}; op[533] = getOpcodeAlt(a);}
        {int[] a = {535,539}; op[534] = getOpcodeCat(a);}
        {int[] a = {536,537,538}; op[535] = getOpcodeAlt(a);}
        {char[] a = {48}; op[536] = getOpcodeTls(a);}
        {char[] a = {49}; op[537] = getOpcodeTls(a);}
        {char[] a = {50}; op[538] = getOpcodeTls(a);}
        op[539] = getOpcodeRnm(68, 502); // oneToNine
        {int[] a = {541,542}; op[540] = getOpcodeCat(a);}
        {char[] a = {51}; op[541] = getOpcodeTls(a);}
        {int[] a = {543,544}; op[542] = getOpcodeAlt(a);}
        {char[] a = {48}; op[543] = getOpcodeTls(a);}
        {char[] a = {49}; op[544] = getOpcodeTls(a);}
        {int[] a = {546,551}; op[545] = getOpcodeAlt(a);}
        {int[] a = {547,550}; op[546] = getOpcodeCat(a);}
        {int[] a = {548,549}; op[547] = getOpcodeAlt(a);}
        {char[] a = {48}; op[548] = getOpcodeTls(a);}
        {char[] a = {49}; op[549] = getOpcodeTls(a);}
        op[550] = getOpcodeRnm(26, 231); // DIGIT
        {int[] a = {552,553}; op[551] = getOpcodeCat(a);}
        {char[] a = {50}; op[552] = getOpcodeTls(a);}
        {int[] a = {554,555,556}; op[553] = getOpcodeAlt(a);}
        {char[] a = {49}; op[554] = getOpcodeTls(a);}
        {char[] a = {50}; op[555] = getOpcodeTls(a);}
        {char[] a = {51}; op[556] = getOpcodeTls(a);}
        op[557] = getOpcodeRnm(69, 512); // zeroToFiftyNine
        op[558] = getOpcodeRnm(69, 512); // zeroToFiftyNine
        op[559] = getOpcodeRep((char)1, Character.MAX_VALUE, 560);
        op[560] = getOpcodeRnm(26, 231); // DIGIT
        {int[] a = {562,563,564,565,566,567,568,569,570,571,572,573,574,575,576,577,578,579,580,581,582,583,584,585,586,587,588,589,590,591,592,593}; op[561] = getOpcodeAlt(a);}
        op[562] = getOpcodeRnm(78, 594); // null
        op[563] = getOpcodeRnm(85, 660); // decimal
        op[564] = getOpcodeRnm(90, 700); // single
        op[565] = getOpcodeRnm(88, 685); // double
        op[566] = getOpcodeRnm(93, 724); // sbyte
        op[567] = getOpcodeRnm(92, 722); // byte
        op[568] = getOpcodeRnm(94, 729); // int16
        op[569] = getOpcodeRnm(95, 734); // int32
        op[570] = getOpcodeRnm(96, 739); // int64
        op[571] = getOpcodeRnm(79, 601); // binary
        op[572] = getOpcodeRnm(81, 617); // dateTime
        op[573] = getOpcodeRnm(82, 622); // dateTimeOffset
        op[574] = getOpcodeRnm(91, 704); // guid
        op[575] = getOpcodeRnm(97, 746); // string
        op[576] = getOpcodeRnm(99, 757); // time
        op[577] = getOpcodeRnm(80, 610); // boolean
        op[578] = getOpcodeRnm(100, 802); // geography
        op[579] = getOpcodeRnm(101, 803); // geographyCollection
        op[580] = getOpcodeRnm(102, 804); // geographyLineString
        op[581] = getOpcodeRnm(103, 805); // geographyMultiLineString
        op[582] = getOpcodeRnm(104, 806); // geographyMultiPoint
        op[583] = getOpcodeRnm(105, 807); // geographyMultiPolygon
        op[584] = getOpcodeRnm(106, 808); // geographyPoint
        op[585] = getOpcodeRnm(107, 809); // geographyPolygon
        op[586] = getOpcodeRnm(108, 810); // geometry
        op[587] = getOpcodeRnm(109, 811); // geometryCollection
        op[588] = getOpcodeRnm(110, 812); // geometryLineString
        op[589] = getOpcodeRnm(111, 813); // geometryMultiLineString
        op[590] = getOpcodeRnm(112, 814); // geometryMultiPoint
        op[591] = getOpcodeRnm(113, 815); // geometryMultiPolygon
        op[592] = getOpcodeRnm(114, 816); // geometryPoint
        op[593] = getOpcodeRnm(115, 817); // geometryPolygon
        {int[] a = {595,596}; op[594] = getOpcodeCat(a);}
        {char[] a = {110,117,108,108}; op[595] = getOpcodeTbs(a);}
        op[596] = getOpcodeRep((char)0, (char)1, 597);
        {int[] a = {598,599,600}; op[597] = getOpcodeCat(a);}
        {char[] a = {39}; op[598] = getOpcodeTls(a);}
        op[599] = getOpcodeRnm(125, 840); // qualifiedTypeName
        {char[] a = {39}; op[600] = getOpcodeTls(a);}
        {int[] a = {602,605,606,609}; op[601] = getOpcodeCat(a);}
        {int[] a = {603,604}; op[602] = getOpcodeAlt(a);}
        {char[] a = {88}; op[603] = getOpcodeTbs(a);}
        {char[] a = {98,105,110,97,114,121}; op[604] = getOpcodeTls(a);}
        op[605] = getOpcodeRnm(56, 483); // SQUOTE
        op[606] = getOpcodeRep((char)0, Character.MAX_VALUE, 607);
        op[607] = getOpcodeRep((char)2, (char)2, 608);
        op[608] = getOpcodeRnm(27, 232); // HEXDIG
        op[609] = getOpcodeRnm(56, 483); // SQUOTE
        {int[] a = {611,614}; op[610] = getOpcodeAlt(a);}
        {int[] a = {612,613}; op[611] = getOpcodeAlt(a);}
        {char[] a = {116,114,117,101}; op[612] = getOpcodeTls(a);}
        {char[] a = {49}; op[613] = getOpcodeTls(a);}
        {int[] a = {615,616}; op[614] = getOpcodeAlt(a);}
        {char[] a = {102,97,108,115,101}; op[615] = getOpcodeTls(a);}
        {char[] a = {48}; op[616] = getOpcodeTls(a);}
        {int[] a = {618,619,620,621}; op[617] = getOpcodeCat(a);}
        {char[] a = {100,97,116,101,116,105,109,101}; op[618] = getOpcodeTls(a);}
        op[619] = getOpcodeRnm(56, 483); // SQUOTE
        op[620] = getOpcodeRnm(83, 627); // dateTimeBody
        op[621] = getOpcodeRnm(56, 483); // SQUOTE
        {int[] a = {623,624,625,626}; op[622] = getOpcodeCat(a);}
        {char[] a = {100,97,116,101,116,105,109,101,111,102,102,115,101,116}; op[623] = getOpcodeTls(a);}
        op[624] = getOpcodeRnm(56, 483); // SQUOTE
        op[625] = getOpcodeRnm(84, 651); // dateTimeOffsetBody
        op[626] = getOpcodeRnm(56, 483); // SQUOTE
        {int[] a = {628,629,630,631,632,633,634}; op[627] = getOpcodeCat(a);}
        op[628] = getOpcodeRnm(70, 521); // year
        {char[] a = {45}; op[629] = getOpcodeTls(a);}
        op[630] = getOpcodeRnm(71, 523); // month
        {char[] a = {45}; op[631] = getOpcodeTls(a);}
        op[632] = getOpcodeRnm(72, 533); // day
        {char[] a = {84}; op[633] = getOpcodeTls(a);}
        {int[] a = {635,647}; op[634] = getOpcodeAlt(a);}
        {int[] a = {636,637,638,639}; op[635] = getOpcodeCat(a);}
        op[636] = getOpcodeRnm(73, 545); // hour
        {char[] a = {58}; op[637] = getOpcodeTls(a);}
        op[638] = getOpcodeRnm(74, 557); // minute
        op[639] = getOpcodeRep((char)0, (char)1, 640);
        {int[] a = {641,642,643}; op[640] = getOpcodeCat(a);}
        {char[] a = {58}; op[641] = getOpcodeTls(a);}
        op[642] = getOpcodeRnm(75, 558); // second
        op[643] = getOpcodeRep((char)0, (char)1, 644);
        {int[] a = {645,646}; op[644] = getOpcodeCat(a);}
        {char[] a = {46}; op[645] = getOpcodeTls(a);}
        op[646] = getOpcodeRnm(76, 559); // fractionalSeconds
        {int[] a = {648,649}; op[647] = getOpcodeCat(a);}
        {char[] a = {50,52,58,48,48}; op[648] = getOpcodeTls(a);}
        op[649] = getOpcodeRep((char)0, (char)1, 650);
        {char[] a = {58,48,48}; op[650] = getOpcodeTls(a);}
        {int[] a = {652,653}; op[651] = getOpcodeCat(a);}
        op[652] = getOpcodeRnm(83, 627); // dateTimeBody
        {int[] a = {654,655}; op[653] = getOpcodeAlt(a);}
        {char[] a = {90}; op[654] = getOpcodeTls(a);}
        {int[] a = {656,657,658,659}; op[655] = getOpcodeCat(a);}
        op[656] = getOpcodeRnm(58, 485); // sign
        op[657] = getOpcodeRnm(73, 545); // hour
        {char[] a = {58}; op[658] = getOpcodeTls(a);}
        op[659] = getOpcodeRnm(74, 557); // minute
        {int[] a = {661,662}; op[660] = getOpcodeCat(a);}
        op[661] = getOpcodeRnm(86, 664); // decimalBody
        op[662] = getOpcodeRep((char)0, (char)1, 663);
        {char[] a = {77}; op[663] = getOpcodeTls(a);}
        {int[] a = {665,667,669}; op[664] = getOpcodeCat(a);}
        op[665] = getOpcodeRep((char)0, (char)1, 666);
        op[666] = getOpcodeRnm(58, 485); // sign
        op[667] = getOpcodeRep((char)1, Character.MAX_VALUE, 668);
        op[668] = getOpcodeRnm(26, 231); // DIGIT
        op[669] = getOpcodeRep((char)0, (char)1, 670);
        {int[] a = {671,672}; op[670] = getOpcodeCat(a);}
        {char[] a = {46}; op[671] = getOpcodeTls(a);}
        op[672] = getOpcodeRep((char)1, Character.MAX_VALUE, 673);
        op[673] = getOpcodeRnm(26, 231); // DIGIT
        {int[] a = {675,684}; op[674] = getOpcodeAlt(a);}
        {int[] a = {676,677}; op[675] = getOpcodeCat(a);}
        op[676] = getOpcodeRnm(86, 664); // decimalBody
        op[677] = getOpcodeRep((char)0, (char)1, 678);
        {int[] a = {679,680,682}; op[678] = getOpcodeCat(a);}
        {char[] a = {69}; op[679] = getOpcodeTls(a);}
        op[680] = getOpcodeRep((char)0, (char)1, 681);
        op[681] = getOpcodeRnm(58, 485); // sign
        op[682] = getOpcodeRep((char)1, Character.MAX_VALUE, 683);
        op[683] = getOpcodeRnm(26, 231); // DIGIT
        op[684] = getOpcodeRnm(67, 498); // nanInfinity
        {int[] a = {686,687}; op[685] = getOpcodeCat(a);}
        op[686] = getOpcodeRnm(87, 674); // doubleBody
        op[687] = getOpcodeRep((char)0, (char)1, 688);
        {char[] a = {68}; op[688] = getOpcodeTls(a);}
        {int[] a = {690,699}; op[689] = getOpcodeAlt(a);}
        {int[] a = {691,692}; op[690] = getOpcodeCat(a);}
        op[691] = getOpcodeRnm(86, 664); // decimalBody
        op[692] = getOpcodeRep((char)0, (char)1, 693);
        {int[] a = {694,695,697}; op[693] = getOpcodeCat(a);}
        {char[] a = {69}; op[694] = getOpcodeTls(a);}
        op[695] = getOpcodeRep((char)0, (char)1, 696);
        op[696] = getOpcodeRnm(58, 485); // sign
        op[697] = getOpcodeRep((char)1, Character.MAX_VALUE, 698);
        op[698] = getOpcodeRnm(26, 231); // DIGIT
        op[699] = getOpcodeRnm(67, 498); // nanInfinity
        {int[] a = {701,702}; op[700] = getOpcodeCat(a);}
        op[701] = getOpcodeRnm(89, 689); // singleBody
        op[702] = getOpcodeRep((char)0, (char)1, 703);
        {char[] a = {70}; op[703] = getOpcodeTls(a);}
        {int[] a = {705,706,707,709,710,712,713,715,716,718,719,721}; op[704] = getOpcodeCat(a);}
        {char[] a = {103,117,105,100}; op[705] = getOpcodeTls(a);}
        op[706] = getOpcodeRnm(56, 483); // SQUOTE
        op[707] = getOpcodeRep((char)8, (char)8, 708);
        op[708] = getOpcodeRnm(27, 232); // HEXDIG
        {char[] a = {45}; op[709] = getOpcodeTls(a);}
        op[710] = getOpcodeRep((char)4, (char)4, 711);
        op[711] = getOpcodeRnm(27, 232); // HEXDIG
        {char[] a = {45}; op[712] = getOpcodeTls(a);}
        op[713] = getOpcodeRep((char)4, (char)4, 714);
        op[714] = getOpcodeRnm(27, 232); // HEXDIG
        {char[] a = {45}; op[715] = getOpcodeTls(a);}
        op[716] = getOpcodeRep((char)4, (char)4, 717);
        op[717] = getOpcodeRnm(27, 232); // HEXDIG
        {char[] a = {45}; op[718] = getOpcodeTls(a);}
        op[719] = getOpcodeRep((char)12, (char)12, 720);
        op[720] = getOpcodeRnm(27, 232); // HEXDIG
        op[721] = getOpcodeRnm(56, 483); // SQUOTE
        op[722] = getOpcodeRep((char)1, (char)3, 723);
        op[723] = getOpcodeRnm(26, 231); // DIGIT
        {int[] a = {725,727}; op[724] = getOpcodeCat(a);}
        op[725] = getOpcodeRep((char)0, (char)1, 726);
        op[726] = getOpcodeRnm(58, 485); // sign
        op[727] = getOpcodeRep((char)1, (char)3, 728);
        op[728] = getOpcodeRnm(26, 231); // DIGIT
        {int[] a = {730,732}; op[729] = getOpcodeCat(a);}
        op[730] = getOpcodeRep((char)0, (char)1, 731);
        op[731] = getOpcodeRnm(58, 485); // sign
        op[732] = getOpcodeRep((char)1, (char)5, 733);
        op[733] = getOpcodeRnm(26, 231); // DIGIT
        {int[] a = {735,737}; op[734] = getOpcodeCat(a);}
        op[735] = getOpcodeRep((char)0, (char)1, 736);
        op[736] = getOpcodeRnm(58, 485); // sign
        op[737] = getOpcodeRep((char)1, (char)10, 738);
        op[738] = getOpcodeRnm(26, 231); // DIGIT
        {int[] a = {740,742,744}; op[739] = getOpcodeCat(a);}
        op[740] = getOpcodeRep((char)0, (char)1, 741);
        op[741] = getOpcodeRnm(58, 485); // sign
        op[742] = getOpcodeRep((char)1, (char)19, 743);
        op[743] = getOpcodeRnm(26, 231); // DIGIT
        op[744] = getOpcodeRep((char)0, (char)1, 745);
        {char[] a = {76}; op[745] = getOpcodeTls(a);}
        {int[] a = {747,748,753}; op[746] = getOpcodeCat(a);}
        op[747] = getOpcodeRnm(56, 483); // SQUOTE
        op[748] = getOpcodeRep((char)0, Character.MAX_VALUE, 749);
        {int[] a = {750,751,752}; op[749] = getOpcodeAlt(a);}
        op[750] = getOpcodeRnm(48, 422); // unreserved
        op[751] = getOpcodeRnm(47, 418); // pct-encoded
        op[752] = getOpcodeRnm(98, 754); // SQUOTE-in-string
        op[753] = getOpcodeRnm(56, 483); // SQUOTE
        {int[] a = {755,756}; op[754] = getOpcodeCat(a);}
        op[755] = getOpcodeRnm(56, 483); // SQUOTE
        op[756] = getOpcodeRnm(56, 483); // SQUOTE
        {int[] a = {758,759,760,762,763,768,773,778,801}; op[757] = getOpcodeCat(a);}
        {char[] a = {116,105,109,101}; op[758] = getOpcodeTls(a);}
        op[759] = getOpcodeRnm(56, 483); // SQUOTE
        op[760] = getOpcodeRep((char)0, (char)1, 761);
        op[761] = getOpcodeRnm(58, 485); // sign
        {char[] a = {80}; op[762] = getOpcodeTls(a);}
        op[763] = getOpcodeRep((char)0, (char)1, 764);
        {int[] a = {765,767}; op[764] = getOpcodeCat(a);}
        op[765] = getOpcodeRep((char)1, Character.MAX_VALUE, 766);
        op[766] = getOpcodeRnm(26, 231); // DIGIT
        {char[] a = {89}; op[767] = getOpcodeTls(a);}
        op[768] = getOpcodeRep((char)0, (char)1, 769);
        {int[] a = {770,772}; op[769] = getOpcodeCat(a);}
        op[770] = getOpcodeRep((char)1, Character.MAX_VALUE, 771);
        op[771] = getOpcodeRnm(26, 231); // DIGIT
        {char[] a = {77}; op[772] = getOpcodeTls(a);}
        op[773] = getOpcodeRep((char)0, (char)1, 774);
        {int[] a = {775,777}; op[774] = getOpcodeCat(a);}
        op[775] = getOpcodeRep((char)1, Character.MAX_VALUE, 776);
        op[776] = getOpcodeRnm(26, 231); // DIGIT
        {char[] a = {68}; op[777] = getOpcodeTls(a);}
        op[778] = getOpcodeRep((char)0, (char)1, 779);
        {int[] a = {780,781,786,791}; op[779] = getOpcodeCat(a);}
        {char[] a = {84}; op[780] = getOpcodeTls(a);}
        op[781] = getOpcodeRep((char)0, (char)1, 782);
        {int[] a = {783,785}; op[782] = getOpcodeCat(a);}
        op[783] = getOpcodeRep((char)1, Character.MAX_VALUE, 784);
        op[784] = getOpcodeRnm(26, 231); // DIGIT
        {char[] a = {72}; op[785] = getOpcodeTls(a);}
        op[786] = getOpcodeRep((char)0, (char)1, 787);
        {int[] a = {788,790}; op[787] = getOpcodeCat(a);}
        op[788] = getOpcodeRep((char)1, Character.MAX_VALUE, 789);
        op[789] = getOpcodeRnm(26, 231); // DIGIT
        {char[] a = {77}; op[790] = getOpcodeTls(a);}
        op[791] = getOpcodeRep((char)0, (char)1, 792);
        {int[] a = {793,795,800}; op[792] = getOpcodeCat(a);}
        op[793] = getOpcodeRep((char)1, Character.MAX_VALUE, 794);
        op[794] = getOpcodeRnm(26, 231); // DIGIT
        op[795] = getOpcodeRep((char)0, (char)1, 796);
        {int[] a = {797,798}; op[796] = getOpcodeCat(a);}
        {char[] a = {46}; op[797] = getOpcodeTls(a);}
        op[798] = getOpcodeRep((char)1, Character.MAX_VALUE, 799);
        op[799] = getOpcodeRnm(26, 231); // DIGIT
        {char[] a = {83}; op[800] = getOpcodeTls(a);}
        op[801] = getOpcodeRnm(56, 483); // SQUOTE
        {char[] a = {123,84,79,68,79,49,125}; op[802] = getOpcodeTls(a);}
        {char[] a = {123,84,79,68,79,50,125}; op[803] = getOpcodeTls(a);}
        {char[] a = {123,84,79,68,79,51,125}; op[804] = getOpcodeTls(a);}
        {char[] a = {123,84,79,68,79,52,125}; op[805] = getOpcodeTls(a);}
        {char[] a = {123,84,79,68,79,53,125}; op[806] = getOpcodeTls(a);}
        {char[] a = {123,84,79,68,79,54,125}; op[807] = getOpcodeTls(a);}
        {char[] a = {123,84,79,68,79,55,125}; op[808] = getOpcodeTls(a);}
        {char[] a = {123,84,79,68,79,56,125}; op[809] = getOpcodeTls(a);}
        {char[] a = {123,84,79,68,79,57,125}; op[810] = getOpcodeTls(a);}
        {char[] a = {123,84,79,68,79,49,48,125}; op[811] = getOpcodeTls(a);}
        {char[] a = {123,84,79,68,79,49,49,125}; op[812] = getOpcodeTls(a);}
        {char[] a = {123,84,79,68,79,49,50,125}; op[813] = getOpcodeTls(a);}
        {char[] a = {123,84,79,68,79,49,51,125}; op[814] = getOpcodeTls(a);}
        {char[] a = {123,84,79,68,79,49,52,125}; op[815] = getOpcodeTls(a);}
        {char[] a = {123,84,79,68,79,49,53,125}; op[816] = getOpcodeTls(a);}
        {char[] a = {123,84,79,68,79,49,54,125}; op[817] = getOpcodeTls(a);}
        {int[] a = {819,820}; op[818] = getOpcodeCat(a);}
        op[819] = getOpcodeRnm(117, 822); // identifierLeadingCharacter
        op[820] = getOpcodeRep((char)0, (char)478, 821);
        op[821] = getOpcodeRnm(118, 825); // identifierCharacter
        {int[] a = {823,824}; op[822] = getOpcodeAlt(a);}
        op[823] = getOpcodeRnm(25, 228); // ALPHA
        {char[] a = {95}; op[824] = getOpcodeTls(a);}
        {int[] a = {826,827,828}; op[825] = getOpcodeAlt(a);}
        op[826] = getOpcodeRnm(25, 228); // ALPHA
        op[827] = getOpcodeRnm(26, 231); // DIGIT
        {char[] a = {95}; op[828] = getOpcodeTls(a);}
        {int[] a = {830,831}; op[829] = getOpcodeCat(a);}
        op[830] = getOpcodeRnm(120, 835); // namespacePart
        op[831] = getOpcodeRep((char)0, Character.MAX_VALUE, 832);
        {int[] a = {833,834}; op[832] = getOpcodeCat(a);}
        {char[] a = {46}; op[833] = getOpcodeTls(a);}
        op[834] = getOpcodeRnm(120, 835); // namespacePart
        op[835] = getOpcodeRnm(116, 818); // odataIdentifier
        op[836] = getOpcodeRnm(116, 818); // odataIdentifier
        op[837] = getOpcodeRnm(116, 818); // odataIdentifier
        op[838] = getOpcodeRnm(116, 818); // odataIdentifier
        op[839] = getOpcodeRnm(116, 818); // odataIdentifier
        {int[] a = {841,842,843,844,845}; op[840] = getOpcodeAlt(a);}
        op[841] = getOpcodeRnm(126, 853); // qualifiedEntityTypeName
        op[842] = getOpcodeRnm(127, 857); // qualifiedComplexTypeName
        op[843] = getOpcodeRnm(128, 861); // qualifiedEnumerationTypeName
        op[844] = getOpcodeRnm(129, 865); // primitiveTypeName
        {int[] a = {846,847,852}; op[845] = getOpcodeCat(a);}
        {char[] a = {99,111,108,108,101,99,116,105,111,110,40}; op[846] = getOpcodeTls(a);}
        {int[] a = {848,849,850,851}; op[847] = getOpcodeAlt(a);}
        op[848] = getOpcodeRnm(126, 853); // qualifiedEntityTypeName
        op[849] = getOpcodeRnm(127, 857); // qualifiedComplexTypeName
        op[850] = getOpcodeRnm(128, 861); // qualifiedEnumerationTypeName
        op[851] = getOpcodeRnm(129, 865); // primitiveTypeName
        {char[] a = {41}; op[852] = getOpcodeTls(a);}
        {int[] a = {854,855,856}; op[853] = getOpcodeCat(a);}
        op[854] = getOpcodeRnm(119, 829); // namespace
        {char[] a = {46}; op[855] = getOpcodeTls(a);}
        op[856] = getOpcodeRnm(122, 837); // entityTypeName
        {int[] a = {858,859,860}; op[857] = getOpcodeCat(a);}
        op[858] = getOpcodeRnm(119, 829); // namespace
        {char[] a = {46}; op[859] = getOpcodeTls(a);}
        op[860] = getOpcodeRnm(123, 838); // complexTypeName
        {int[] a = {862,863,864}; op[861] = getOpcodeCat(a);}
        op[862] = getOpcodeRnm(119, 829); // namespace
        {char[] a = {46}; op[863] = getOpcodeTls(a);}
        op[864] = getOpcodeRnm(124, 839); // enumerationTypeName
        {int[] a = {866,868}; op[865] = getOpcodeCat(a);}
        op[866] = getOpcodeRep((char)0, (char)1, 867);
        {char[] a = {101,100,109,46}; op[867] = getOpcodeTls(a);}
        {int[] a = {869,870,871,872,873,874,875,876,877,878,879,880,881,882,883,884,885,886,887}; op[868] = getOpcodeAlt(a);}
        {char[] a = {98,105,110,97,114,121}; op[869] = getOpcodeTls(a);}
        {char[] a = {98,111,111,108,101,97,110}; op[870] = getOpcodeTls(a);}
        {char[] a = {98,121,116,101}; op[871] = getOpcodeTls(a);}
        {char[] a = {100,97,116,101,116,105,109,101}; op[872] = getOpcodeTls(a);}
        {char[] a = {100,97,116,101,116,105,109,101,111,102,102,115,101,116}; op[873] = getOpcodeTls(a);}
        {char[] a = {100,101,99,105,109,97,108}; op[874] = getOpcodeTls(a);}
        {char[] a = {100,111,117,98,108,101}; op[875] = getOpcodeTls(a);}
        {char[] a = {115,105,110,103,108,101}; op[876] = getOpcodeTls(a);}
        {char[] a = {102,108,111,97,116}; op[877] = getOpcodeTls(a);}
        {char[] a = {103,117,105,100}; op[878] = getOpcodeTls(a);}
        {char[] a = {105,110,116,49,54}; op[879] = getOpcodeTls(a);}
        {char[] a = {105,110,116,51,50}; op[880] = getOpcodeTls(a);}
        {char[] a = {105,110,116,54,52}; op[881] = getOpcodeTls(a);}
        {char[] a = {115,98,121,116,101}; op[882] = getOpcodeTls(a);}
        {char[] a = {115,116,114,101,97,109}; op[883] = getOpcodeTls(a);}
        {char[] a = {115,116,114,105,110,103}; op[884] = getOpcodeTls(a);}
        {char[] a = {116,105,109,101}; op[885] = getOpcodeTls(a);}
        op[886] = getOpcodeRnm(130, 888); // concreteSpatialTypeName
        op[887] = getOpcodeRnm(131, 903); // abstractSpatialTypeName
        {int[] a = {889,890,891,892,893,894,895,896,897,898,899,900,901,902}; op[888] = getOpcodeAlt(a);}
        {char[] a = {112,111,105,110,116}; op[889] = getOpcodeTls(a);}
        {char[] a = {108,105,110,101,115,116,114,105,110,103}; op[890] = getOpcodeTls(a);}
        {char[] a = {112,111,108,121,103,111,110}; op[891] = getOpcodeTls(a);}
        {char[] a = {103,101,111,103,114,97,112,104,121,99,111,108,108,101,99,116,105,111,110}; op[892] = getOpcodeTls(a);}
        {char[] a = {109,117,108,116,105,112,111,105,110,116}; op[893] = getOpcodeTls(a);}
        {char[] a = {109,117,108,116,105,108,105,110,101,115,116,114,105,110,103}; op[894] = getOpcodeTls(a);}
        {char[] a = {109,117,108,116,105,112,111,108,121,103,111,110}; op[895] = getOpcodeTls(a);}
        {char[] a = {103,101,111,109,101,116,114,105,99,112,111,105,110,116}; op[896] = getOpcodeTls(a);}
        {char[] a = {103,101,111,109,101,116,114,105,99,108,105,110,101,115,116,114,105,110,103}; op[897] = getOpcodeTls(a);}
        {char[] a = {103,101,111,109,101,116,114,105,99,112,111,108,121,103,111,110}; op[898] = getOpcodeTls(a);}
        {char[] a = {103,101,111,109,101,116,114,121,99,111,108,108,101,99,116,105,111,110}; op[899] = getOpcodeTls(a);}
        {char[] a = {103,101,111,109,101,116,114,105,99,109,117,108,116,105,112,111,105,110,116}; op[900] = getOpcodeTls(a);}
        {char[] a = {103,101,111,109,101,116,114,105,99,109,117,108,116,105,108,105,110,101,115,116,114,105,110,103}; op[901] = getOpcodeTls(a);}
        {char[] a = {103,101,111,109,101,116,114,105,99,109,117,108,116,105,112,111,108,121,103,111,110}; op[902] = getOpcodeTls(a);}
        {int[] a = {904,905}; op[903] = getOpcodeAlt(a);}
        {char[] a = {103,101,111,103,114,97,112,104,121}; op[904] = getOpcodeTls(a);}
        {char[] a = {103,101,111,109,101,116,114,121}; op[905] = getOpcodeTls(a);}
        op[906] = getOpcodeRnm(116, 818); // odataIdentifier
        op[907] = getOpcodeRnm(116, 818); // odataIdentifier
        op[908] = getOpcodeRnm(116, 818); // odataIdentifier
        op[909] = getOpcodeRnm(116, 818); // odataIdentifier
        op[910] = getOpcodeRnm(116, 818); // odataIdentifier
        op[911] = getOpcodeRnm(116, 818); // odataIdentifier
        {int[] a = {913,914,915,916,917,918}; op[912] = getOpcodeAlt(a);}
        op[913] = getOpcodeRnm(132, 906); // primitiveKeyProperty
        op[914] = getOpcodeRnm(133, 907); // primitiveNonKeyProperty
        op[915] = getOpcodeRnm(134, 908); // primitiveColProperty
        op[916] = getOpcodeRnm(135, 909); // complexProperty
        op[917] = getOpcodeRnm(136, 910); // complexColProperty
        op[918] = getOpcodeRnm(137, 911); // streamProperty
        op[919] = getOpcodeRnm(116, 818); // odataIdentifier
        op[920] = getOpcodeRnm(116, 818); // odataIdentifier
        op[921] = getOpcodeRnm(116, 818); // odataIdentifier
        {int[] a = {923,924}; op[922] = getOpcodeAlt(a);}
        op[923] = getOpcodeRnm(140, 920); // entityNavigationProperty
        op[924] = getOpcodeRnm(141, 921); // entityColNavigationProperty
        op[925] = getOpcodeRnm(116, 818); // odataIdentifier
        op[926] = getOpcodeRnm(116, 818); // odataIdentifier
        op[927] = getOpcodeRnm(116, 818); // odataIdentifier
        op[928] = getOpcodeRnm(116, 818); // odataIdentifier
        op[929] = getOpcodeRnm(116, 818); // odataIdentifier
        op[930] = getOpcodeRnm(116, 818); // odataIdentifier
        {int[] a = {932,934}; op[931] = getOpcodeCat(a);}
        op[932] = getOpcodeRep((char)0, (char)1, 933);
        op[933] = getOpcodeRnm(20, 162); // operationQualifier
        op[934] = getOpcodeRnm(143, 925); // entityFunction
        {int[] a = {936,938}; op[935] = getOpcodeCat(a);}
        op[936] = getOpcodeRep((char)0, (char)1, 937);
        op[937] = getOpcodeRnm(20, 162); // operationQualifier
        op[938] = getOpcodeRnm(144, 926); // entityColFunction
        {int[] a = {940,942}; op[939] = getOpcodeCat(a);}
        op[940] = getOpcodeRep((char)0, (char)1, 941);
        op[941] = getOpcodeRnm(20, 162); // operationQualifier
        op[942] = getOpcodeRnm(145, 927); // complexFunction
        {int[] a = {944,946}; op[943] = getOpcodeCat(a);}
        op[944] = getOpcodeRep((char)0, (char)1, 945);
        op[945] = getOpcodeRnm(20, 162); // operationQualifier
        op[946] = getOpcodeRnm(146, 928); // complexColFunction
        {int[] a = {948,950}; op[947] = getOpcodeCat(a);}
        op[948] = getOpcodeRep((char)0, (char)1, 949);
        op[949] = getOpcodeRnm(20, 162); // operationQualifier
        op[950] = getOpcodeRnm(147, 929); // primitiveFunction
        {int[] a = {952,954}; op[951] = getOpcodeCat(a);}
        op[952] = getOpcodeRep((char)0, (char)1, 953);
        op[953] = getOpcodeRnm(20, 162); // operationQualifier
        op[954] = getOpcodeRnm(148, 930); // primitiveColFunction
        {int[] a = {956,957,958,959,960,961}; op[955] = getOpcodeAlt(a);}
        op[956] = getOpcodeRnm(149, 931); // fullEntityFunction
        op[957] = getOpcodeRnm(150, 935); // fullEntityColFunction
        op[958] = getOpcodeRnm(151, 939); // fullComplexFunction
        op[959] = getOpcodeRnm(152, 943); // fullComplexColFunction
        op[960] = getOpcodeRnm(153, 947); // fullPrimitiveFunction
        op[961] = getOpcodeRnm(154, 951); // fullPrimitiveColFunction
        op[962] = getOpcodeRnm(116, 818); // odataIdentifier
        op[963] = getOpcodeRnm(116, 818); // odataIdentifier
        op[964] = getOpcodeRnm(116, 818); // odataIdentifier
        op[965] = getOpcodeRnm(116, 818); // odataIdentifier
        op[966] = getOpcodeRnm(116, 818); // odataIdentifier
        op[967] = getOpcodeRnm(116, 818); // odataIdentifier
        op[968] = getOpcodeRnm(116, 818); // odataIdentifier
        {int[] a = {970,971,972,973,974,975,976}; op[969] = getOpcodeAlt(a);}
        op[970] = getOpcodeRnm(156, 962); // entityAction
        op[971] = getOpcodeRnm(157, 963); // entityColAction
        op[972] = getOpcodeRnm(158, 964); // complexAction
        op[973] = getOpcodeRnm(159, 965); // complexColAction
        op[974] = getOpcodeRnm(160, 966); // primitiveAction
        op[975] = getOpcodeRnm(161, 967); // primitiveColAction
        op[976] = getOpcodeRnm(162, 968); // voidAction
        {int[] a = {978,980}; op[977] = getOpcodeCat(a);}
        op[978] = getOpcodeRep((char)0, (char)1, 979);
        op[979] = getOpcodeRnm(20, 162); // operationQualifier
        op[980] = getOpcodeRnm(163, 969); // action
        {int[] a = {982,983}; op[981] = getOpcodeCat(a);}
        op[982] = getOpcodeRnm(164, 977); // fullAction
        op[983] = getOpcodeRep((char)0, (char)1, 984);
        {int[] a = {985,986,987}; op[984] = getOpcodeCat(a);}
        {char[] a = {40}; op[985] = getOpcodeTls(a);}
        op[986] = getOpcodeRnm(167, 995); // parameterTypeNames
        {char[] a = {41}; op[987] = getOpcodeTls(a);}
        {int[] a = {989,990}; op[988] = getOpcodeCat(a);}
        op[989] = getOpcodeRnm(155, 955); // fullFunction
        op[990] = getOpcodeRep((char)0, (char)1, 991);
        {int[] a = {992,993,994}; op[991] = getOpcodeCat(a);}
        {char[] a = {40}; op[992] = getOpcodeTls(a);}
        op[993] = getOpcodeRnm(167, 995); // parameterTypeNames
        {char[] a = {41}; op[994] = getOpcodeTls(a);}
        op[995] = getOpcodeRep((char)0, (char)1, 996);
        {int[] a = {997,998}; op[996] = getOpcodeCat(a);}
        op[997] = getOpcodeRnm(168, 1002); // parameterTypeName
        op[998] = getOpcodeRep((char)0, Character.MAX_VALUE, 999);
        {int[] a = {1000,1001}; op[999] = getOpcodeCat(a);}
        {char[] a = {44}; op[1000] = getOpcodeTls(a);}
        op[1001] = getOpcodeRnm(168, 1002); // parameterTypeName
        op[1002] = getOpcodeRnm(125, 840); // qualifiedTypeName
        {int[] a = {1004,1018,1022,1026,1030,1036,1040,1046}; op[1003] = getOpcodeAlt(a);}
        {int[] a = {1005,1009,1010}; op[1004] = getOpcodeCat(a);}
        op[1005] = getOpcodeRep((char)0, (char)1, 1006);
        {int[] a = {1007,1008}; op[1006] = getOpcodeCat(a);}
        op[1007] = getOpcodeRnm(139, 919); // entityContainerName
        {char[] a = {46}; op[1008] = getOpcodeTls(a);}
        op[1009] = getOpcodeRnm(121, 836); // entitySetName
        op[1010] = getOpcodeRep((char)0, (char)1, 1011);
        {int[] a = {1012,1013,1014}; op[1011] = getOpcodeAlt(a);}
        op[1012] = getOpcodeRnm(170, 1047); // count
        op[1013] = getOpcodeRnm(171, 1048); // collectionNavigation
        {int[] a = {1015,1016}; op[1014] = getOpcodeCat(a);}
        op[1015] = getOpcodeRnm(179, 1194); // keyPredicate
        op[1016] = getOpcodeRep((char)0, (char)1, 1017);
        op[1017] = getOpcodeRnm(172, 1084); // singleNavigation
        {int[] a = {1019,1020}; op[1018] = getOpcodeCat(a);}
        op[1019] = getOpcodeRnm(187, 1229); // entityColFunctionCall
        op[1020] = getOpcodeRep((char)0, (char)1, 1021);
        op[1021] = getOpcodeRnm(171, 1048); // collectionNavigation
        {int[] a = {1023,1024}; op[1022] = getOpcodeCat(a);}
        op[1023] = getOpcodeRnm(186, 1226); // entityFunctionCall
        op[1024] = getOpcodeRep((char)0, (char)1, 1025);
        op[1025] = getOpcodeRnm(172, 1084); // singleNavigation
        {int[] a = {1027,1028}; op[1026] = getOpcodeCat(a);}
        op[1027] = getOpcodeRnm(189, 1235); // complexColFunctionCall
        op[1028] = getOpcodeRep((char)0, (char)1, 1029);
        op[1029] = getOpcodeRnm(173, 1115); // boundOperation
        {int[] a = {1031,1032}; op[1030] = getOpcodeCat(a);}
        op[1031] = getOpcodeRnm(188, 1232); // complexFunctionCall
        op[1032] = getOpcodeRep((char)0, (char)1, 1033);
        {int[] a = {1034,1035}; op[1033] = getOpcodeAlt(a);}
        op[1034] = getOpcodeRnm(173, 1115); // boundOperation
        op[1035] = getOpcodeRnm(175, 1162); // complexPropertyPath
        {int[] a = {1037,1038}; op[1036] = getOpcodeCat(a);}
        op[1037] = getOpcodeRnm(191, 1241); // primitiveColFunctionCall
        op[1038] = getOpcodeRep((char)0, (char)1, 1039);
        op[1039] = getOpcodeRnm(173, 1115); // boundOperation
        {int[] a = {1041,1042}; op[1040] = getOpcodeCat(a);}
        op[1041] = getOpcodeRnm(190, 1238); // primitiveFunctionCall
        op[1042] = getOpcodeRep((char)0, (char)1, 1043);
        {int[] a = {1044,1045}; op[1043] = getOpcodeAlt(a);}
        op[1044] = getOpcodeRnm(173, 1115); // boundOperation
        op[1045] = getOpcodeRnm(178, 1193); // value
        op[1046] = getOpcodeRnm(184, 1214); // actionCall
        {char[] a = {47,36,99,111,117,110,116}; op[1047] = getOpcodeTls(a);}
        {int[] a = {1049,1053,1054}; op[1048] = getOpcodeCat(a);}
        op[1049] = getOpcodeRep((char)0, (char)1, 1050);
        {int[] a = {1051,1052}; op[1050] = getOpcodeCat(a);}
        {char[] a = {47}; op[1051] = getOpcodeTls(a);}
        op[1052] = getOpcodeRnm(126, 853); // qualifiedEntityTypeName
        {char[] a = {47}; op[1053] = getOpcodeTls(a);}
        {int[] a = {1055,1059,1063,1069,1073,1079,1083}; op[1054] = getOpcodeAlt(a);}
        {int[] a = {1056,1057}; op[1055] = getOpcodeCat(a);}
        op[1056] = getOpcodeRnm(193, 1251); // boundEntityFuncCall
        op[1057] = getOpcodeRep((char)0, (char)1, 1058);
        op[1058] = getOpcodeRnm(172, 1084); // singleNavigation
        {int[] a = {1060,1061}; op[1059] = getOpcodeCat(a);}
        op[1060] = getOpcodeRnm(194, 1254); // boundEntityColFuncCall
        op[1061] = getOpcodeRep((char)0, (char)1, 1062);
        op[1062] = getOpcodeRnm(171, 1048); // collectionNavigation
        {int[] a = {1064,1065}; op[1063] = getOpcodeCat(a);}
        op[1064] = getOpcodeRnm(197, 1263); // boundPrimitiveFuncCall
        op[1065] = getOpcodeRep((char)0, (char)1, 1066);
        {int[] a = {1067,1068}; op[1066] = getOpcodeAlt(a);}
        op[1067] = getOpcodeRnm(173, 1115); // boundOperation
        op[1068] = getOpcodeRnm(178, 1193); // value
        {int[] a = {1070,1071}; op[1069] = getOpcodeCat(a);}
        op[1070] = getOpcodeRnm(198, 1266); // boundPrimitiveColFuncCall
        op[1071] = getOpcodeRep((char)0, (char)1, 1072);
        op[1072] = getOpcodeRnm(173, 1115); // boundOperation
        {int[] a = {1074,1075}; op[1073] = getOpcodeCat(a);}
        op[1074] = getOpcodeRnm(195, 1257); // boundComplexFuncCall
        op[1075] = getOpcodeRep((char)0, (char)1, 1076);
        {int[] a = {1077,1078}; op[1076] = getOpcodeAlt(a);}
        op[1077] = getOpcodeRnm(175, 1162); // complexPropertyPath
        op[1078] = getOpcodeRnm(173, 1115); // boundOperation
        {int[] a = {1080,1081}; op[1079] = getOpcodeCat(a);}
        op[1080] = getOpcodeRnm(196, 1260); // boundComplexColFuncCall
        op[1081] = getOpcodeRep((char)0, (char)1, 1082);
        op[1082] = getOpcodeRnm(173, 1115); // boundOperation
        op[1083] = getOpcodeRnm(185, 1220); // boundActionCall
        {int[] a = {1085,1089}; op[1084] = getOpcodeCat(a);}
        op[1085] = getOpcodeRep((char)0, (char)1, 1086);
        {int[] a = {1087,1088}; op[1086] = getOpcodeCat(a);}
        {char[] a = {47}; op[1087] = getOpcodeTls(a);}
        op[1088] = getOpcodeRnm(126, 853); // qualifiedEntityTypeName
        {int[] a = {1090,1109,1110,1111,1112,1113,1114}; op[1089] = getOpcodeAlt(a);}
        {int[] a = {1091,1092}; op[1090] = getOpcodeCat(a);}
        {char[] a = {47}; op[1091] = getOpcodeTls(a);}
        {int[] a = {1093,1096,1100}; op[1092] = getOpcodeAlt(a);}
        {int[] a = {1094,1095}; op[1093] = getOpcodeCat(a);}
        {char[] a = {36,108,105,110,107,115,47}; op[1094] = getOpcodeTls(a);}
        op[1095] = getOpcodeRnm(142, 922); // navigationProperty
        {int[] a = {1097,1098}; op[1096] = getOpcodeCat(a);}
        op[1097] = getOpcodeRnm(140, 920); // entityNavigationProperty
        op[1098] = getOpcodeRep((char)0, (char)1, 1099);
        op[1099] = getOpcodeRnm(172, 1084); // singleNavigation
        {int[] a = {1101,1102}; op[1100] = getOpcodeCat(a);}
        op[1101] = getOpcodeRnm(141, 921); // entityColNavigationProperty
        op[1102] = getOpcodeRep((char)0, (char)1, 1103);
        {int[] a = {1104,1105}; op[1103] = getOpcodeAlt(a);}
        op[1104] = getOpcodeRnm(171, 1048); // collectionNavigation
        {int[] a = {1106,1107}; op[1105] = getOpcodeCat(a);}
        op[1106] = getOpcodeRnm(179, 1194); // keyPredicate
        op[1107] = getOpcodeRep((char)0, (char)1, 1108);
        op[1108] = getOpcodeRnm(172, 1084); // singleNavigation
        op[1109] = getOpcodeRnm(174, 1151); // primitivePropertyPath
        op[1110] = getOpcodeRnm(175, 1162); // complexPropertyPath
        op[1111] = getOpcodeRnm(176, 1175); // collectionPropertyPath
        op[1112] = getOpcodeRnm(177, 1186); // streamPropertyPath
        op[1113] = getOpcodeRnm(178, 1193); // value
        op[1114] = getOpcodeRnm(173, 1115); // boundOperation
        {int[] a = {1116,1120,1121}; op[1115] = getOpcodeCat(a);}
        op[1116] = getOpcodeRep((char)0, (char)1, 1117);
        {int[] a = {1118,1119}; op[1117] = getOpcodeCat(a);}
        {char[] a = {47}; op[1118] = getOpcodeTls(a);}
        op[1119] = getOpcodeRnm(126, 853); // qualifiedEntityTypeName
        {char[] a = {47}; op[1120] = getOpcodeTls(a);}
        {int[] a = {1122,1126,1130,1136,1140,1146,1150}; op[1121] = getOpcodeAlt(a);}
        {int[] a = {1123,1124}; op[1122] = getOpcodeCat(a);}
        op[1123] = getOpcodeRnm(194, 1254); // boundEntityColFuncCall
        op[1124] = getOpcodeRep((char)0, (char)1, 1125);
        op[1125] = getOpcodeRnm(172, 1084); // singleNavigation
        {int[] a = {1127,1128}; op[1126] = getOpcodeCat(a);}
        op[1127] = getOpcodeRnm(193, 1251); // boundEntityFuncCall
        op[1128] = getOpcodeRep((char)0, (char)1, 1129);
        op[1129] = getOpcodeRnm(171, 1048); // collectionNavigation
        {int[] a = {1131,1132}; op[1130] = getOpcodeCat(a);}
        op[1131] = getOpcodeRnm(197, 1263); // boundPrimitiveFuncCall
        op[1132] = getOpcodeRep((char)0, (char)1, 1133);
        {int[] a = {1134,1135}; op[1133] = getOpcodeAlt(a);}
        op[1134] = getOpcodeRnm(173, 1115); // boundOperation
        op[1135] = getOpcodeRnm(178, 1193); // value
        {int[] a = {1137,1138}; op[1136] = getOpcodeCat(a);}
        op[1137] = getOpcodeRnm(198, 1266); // boundPrimitiveColFuncCall
        op[1138] = getOpcodeRep((char)0, (char)1, 1139);
        op[1139] = getOpcodeRnm(173, 1115); // boundOperation
        {int[] a = {1141,1142}; op[1140] = getOpcodeCat(a);}
        op[1141] = getOpcodeRnm(195, 1257); // boundComplexFuncCall
        op[1142] = getOpcodeRep((char)0, (char)1, 1143);
        {int[] a = {1144,1145}; op[1143] = getOpcodeAlt(a);}
        op[1144] = getOpcodeRnm(175, 1162); // complexPropertyPath
        op[1145] = getOpcodeRnm(173, 1115); // boundOperation
        {int[] a = {1147,1148}; op[1146] = getOpcodeCat(a);}
        op[1147] = getOpcodeRnm(196, 1260); // boundComplexColFuncCall
        op[1148] = getOpcodeRep((char)0, (char)1, 1149);
        op[1149] = getOpcodeRnm(173, 1115); // boundOperation
        op[1150] = getOpcodeRnm(185, 1220); // boundActionCall
        {int[] a = {1152,1156,1157,1160}; op[1151] = getOpcodeCat(a);}
        op[1152] = getOpcodeRep((char)0, (char)1, 1153);
        {int[] a = {1154,1155}; op[1153] = getOpcodeCat(a);}
        {char[] a = {47}; op[1154] = getOpcodeTls(a);}
        op[1155] = getOpcodeRnm(126, 853); // qualifiedEntityTypeName
        {char[] a = {47}; op[1156] = getOpcodeTls(a);}
        {int[] a = {1158,1159}; op[1157] = getOpcodeAlt(a);}
        op[1158] = getOpcodeRnm(132, 906); // primitiveKeyProperty
        op[1159] = getOpcodeRnm(133, 907); // primitiveNonKeyProperty
        op[1160] = getOpcodeRep((char)0, (char)1, 1161);
        op[1161] = getOpcodeRnm(178, 1193); // value
        {int[] a = {1163,1167,1168,1169}; op[1162] = getOpcodeCat(a);}
        op[1163] = getOpcodeRep((char)0, (char)1, 1164);
        {int[] a = {1165,1166}; op[1164] = getOpcodeCat(a);}
        {char[] a = {47}; op[1165] = getOpcodeTls(a);}
        op[1166] = getOpcodeRnm(126, 853); // qualifiedEntityTypeName
        {char[] a = {47}; op[1167] = getOpcodeTls(a);}
        op[1168] = getOpcodeRnm(135, 909); // complexProperty
        op[1169] = getOpcodeRep((char)0, (char)1, 1170);
        {int[] a = {1171,1172,1173,1174}; op[1170] = getOpcodeAlt(a);}
        op[1171] = getOpcodeRnm(174, 1151); // primitivePropertyPath
        op[1172] = getOpcodeRnm(175, 1162); // complexPropertyPath
        op[1173] = getOpcodeRnm(176, 1175); // collectionPropertyPath
        op[1174] = getOpcodeRnm(173, 1115); // boundOperation
        {int[] a = {1176,1180,1181,1184}; op[1175] = getOpcodeCat(a);}
        op[1176] = getOpcodeRep((char)0, (char)1, 1177);
        {int[] a = {1178,1179}; op[1177] = getOpcodeCat(a);}
        {char[] a = {47}; op[1178] = getOpcodeTls(a);}
        op[1179] = getOpcodeRnm(126, 853); // qualifiedEntityTypeName
        {char[] a = {47}; op[1180] = getOpcodeTls(a);}
        {int[] a = {1182,1183}; op[1181] = getOpcodeAlt(a);}
        op[1182] = getOpcodeRnm(134, 908); // primitiveColProperty
        op[1183] = getOpcodeRnm(136, 910); // complexColProperty
        op[1184] = getOpcodeRep((char)0, (char)1, 1185);
        op[1185] = getOpcodeRnm(173, 1115); // boundOperation
        {int[] a = {1187,1191,1192}; op[1186] = getOpcodeCat(a);}
        op[1187] = getOpcodeRep((char)0, (char)1, 1188);
        {int[] a = {1189,1190}; op[1188] = getOpcodeCat(a);}
        {char[] a = {47}; op[1189] = getOpcodeTls(a);}
        op[1190] = getOpcodeRnm(126, 853); // qualifiedEntityTypeName
        {char[] a = {47}; op[1191] = getOpcodeTls(a);}
        op[1192] = getOpcodeRnm(137, 911); // streamProperty
        {char[] a = {47,36,118,97,108,117,101}; op[1193] = getOpcodeTls(a);}
        {int[] a = {1195,1196}; op[1194] = getOpcodeAlt(a);}
        op[1195] = getOpcodeRnm(180, 1197); // simpleKey
        op[1196] = getOpcodeRnm(181, 1201); // compoundKey
        {int[] a = {1198,1199,1200}; op[1197] = getOpcodeCat(a);}
        {char[] a = {40}; op[1198] = getOpcodeTls(a);}
        op[1199] = getOpcodeRnm(77, 561); // primitiveLiteral
        {char[] a = {41}; op[1200] = getOpcodeTls(a);}
        {int[] a = {1202,1203,1204,1208}; op[1201] = getOpcodeCat(a);}
        {char[] a = {40}; op[1202] = getOpcodeTls(a);}
        op[1203] = getOpcodeRnm(182, 1209); // keyValuePair
        op[1204] = getOpcodeRep((char)0, Character.MAX_VALUE, 1205);
        {int[] a = {1206,1207}; op[1205] = getOpcodeCat(a);}
        {char[] a = {44}; op[1206] = getOpcodeTls(a);}
        op[1207] = getOpcodeRnm(182, 1209); // keyValuePair
        {char[] a = {41}; op[1208] = getOpcodeTls(a);}
        {int[] a = {1210,1211,1212}; op[1209] = getOpcodeCat(a);}
        op[1210] = getOpcodeRnm(132, 906); // primitiveKeyProperty
        {char[] a = {61}; op[1211] = getOpcodeTls(a);}
        op[1212] = getOpcodeRnm(183, 1213); // keyPropertyValue
        op[1213] = getOpcodeRnm(77, 561); // primitiveLiteral
        {int[] a = {1215,1217,1218}; op[1214] = getOpcodeCat(a);}
        op[1215] = getOpcodeRep((char)0, (char)1, 1216);
        op[1216] = getOpcodeRnm(20, 162); // operationQualifier
        op[1217] = getOpcodeRnm(163, 969); // action
        op[1218] = getOpcodeRep((char)0, (char)1, 1219);
        {char[] a = {40,41}; op[1219] = getOpcodeTls(a);}
        {int[] a = {1221,1223,1224}; op[1220] = getOpcodeCat(a);}
        op[1221] = getOpcodeRep((char)0, (char)1, 1222);
        op[1222] = getOpcodeRnm(20, 162); // operationQualifier
        op[1223] = getOpcodeRnm(163, 969); // action
        op[1224] = getOpcodeRep((char)0, (char)1, 1225);
        {char[] a = {40,41}; op[1225] = getOpcodeTls(a);}
        {int[] a = {1227,1228}; op[1226] = getOpcodeCat(a);}
        op[1227] = getOpcodeRnm(149, 931); // fullEntityFunction
        op[1228] = getOpcodeRnm(199, 1269); // functionParameters
        {int[] a = {1230,1231}; op[1229] = getOpcodeCat(a);}
        op[1230] = getOpcodeRnm(150, 935); // fullEntityColFunction
        op[1231] = getOpcodeRnm(199, 1269); // functionParameters
        {int[] a = {1233,1234}; op[1232] = getOpcodeCat(a);}
        op[1233] = getOpcodeRnm(151, 939); // fullComplexFunction
        op[1234] = getOpcodeRnm(199, 1269); // functionParameters
        {int[] a = {1236,1237}; op[1235] = getOpcodeCat(a);}
        op[1236] = getOpcodeRnm(152, 943); // fullComplexColFunction
        op[1237] = getOpcodeRnm(199, 1269); // functionParameters
        {int[] a = {1239,1240}; op[1238] = getOpcodeCat(a);}
        op[1239] = getOpcodeRnm(153, 947); // fullPrimitiveFunction
        op[1240] = getOpcodeRnm(199, 1269); // functionParameters
        {int[] a = {1242,1243}; op[1241] = getOpcodeCat(a);}
        op[1242] = getOpcodeRnm(154, 951); // fullPrimitiveColFunction
        op[1243] = getOpcodeRnm(199, 1269); // functionParameters
        {int[] a = {1245,1246,1247,1248,1249,1250}; op[1244] = getOpcodeAlt(a);}
        op[1245] = getOpcodeRnm(186, 1226); // entityFunctionCall
        op[1246] = getOpcodeRnm(187, 1229); // entityColFunctionCall
        op[1247] = getOpcodeRnm(188, 1232); // complexFunctionCall
        op[1248] = getOpcodeRnm(189, 1235); // complexColFunctionCall
        op[1249] = getOpcodeRnm(190, 1238); // primitiveFunctionCall
        op[1250] = getOpcodeRnm(191, 1241); // primitiveColFunctionCall
        {int[] a = {1252,1253}; op[1251] = getOpcodeCat(a);}
        op[1252] = getOpcodeRnm(149, 931); // fullEntityFunction
        op[1253] = getOpcodeRnm(199, 1269); // functionParameters
        {int[] a = {1255,1256}; op[1254] = getOpcodeCat(a);}
        op[1255] = getOpcodeRnm(150, 935); // fullEntityColFunction
        op[1256] = getOpcodeRnm(199, 1269); // functionParameters
        {int[] a = {1258,1259}; op[1257] = getOpcodeCat(a);}
        op[1258] = getOpcodeRnm(151, 939); // fullComplexFunction
        op[1259] = getOpcodeRnm(199, 1269); // functionParameters
        {int[] a = {1261,1262}; op[1260] = getOpcodeCat(a);}
        op[1261] = getOpcodeRnm(152, 943); // fullComplexColFunction
        op[1262] = getOpcodeRnm(199, 1269); // functionParameters
        {int[] a = {1264,1265}; op[1263] = getOpcodeCat(a);}
        op[1264] = getOpcodeRnm(153, 947); // fullPrimitiveFunction
        op[1265] = getOpcodeRnm(199, 1269); // functionParameters
        {int[] a = {1267,1268}; op[1266] = getOpcodeCat(a);}
        op[1267] = getOpcodeRnm(154, 951); // fullPrimitiveColFunction
        op[1268] = getOpcodeRnm(199, 1269); // functionParameters
        {int[] a = {1270,1271,1278}; op[1269] = getOpcodeCat(a);}
        {char[] a = {40}; op[1270] = getOpcodeTls(a);}
        op[1271] = getOpcodeRep((char)0, (char)1, 1272);
        {int[] a = {1273,1274}; op[1272] = getOpcodeCat(a);}
        op[1273] = getOpcodeRnm(200, 1279); // functionParameter
        op[1274] = getOpcodeRep((char)0, Character.MAX_VALUE, 1275);
        {int[] a = {1276,1277}; op[1275] = getOpcodeCat(a);}
        {char[] a = {44}; op[1276] = getOpcodeTls(a);}
        op[1277] = getOpcodeRnm(200, 1279); // functionParameter
        {char[] a = {41}; op[1278] = getOpcodeTls(a);}
        {int[] a = {1280,1281,1282}; op[1279] = getOpcodeCat(a);}
        op[1280] = getOpcodeRnm(201, 1285); // functionParameterName
        {char[] a = {61}; op[1281] = getOpcodeTls(a);}
        {int[] a = {1283,1284}; op[1282] = getOpcodeAlt(a);}
        op[1283] = getOpcodeRnm(202, 1286); // primitiveParameterValue
        op[1284] = getOpcodeRnm(203, 1287); // parameterAlias
        op[1285] = getOpcodeRnm(116, 818); // odataIdentifier
        op[1286] = getOpcodeRnm(77, 561); // primitiveLiteral
        {int[] a = {1288,1289}; op[1287] = getOpcodeCat(a);}
        {char[] a = {64}; op[1288] = getOpcodeTls(a);}
        op[1289] = getOpcodeRnm(116, 818); // odataIdentifier
        {int[] a = {1291,1292,1293}; op[1290] = getOpcodeCat(a);}
        op[1291] = getOpcodeRnm(203, 1287); // parameterAlias
        {char[] a = {61}; op[1292] = getOpcodeTls(a);}
        op[1293] = getOpcodeRnm(212, 1359); // parameterValue
        {int[] a = {1295,1296,1297}; op[1294] = getOpcodeCat(a);}
        op[1295] = getOpcodeRnm(201, 1285); // functionParameterName
        {char[] a = {61}; op[1296] = getOpcodeTls(a);}
        op[1297] = getOpcodeRnm(212, 1359); // parameterValue
        {int[] a = {1299,1300,1303,1304,1305}; op[1298] = getOpcodeCat(a);}
        op[1299] = getOpcodeRnm(285, 2115); // quotation-mark
        {int[] a = {1301,1302}; op[1300] = getOpcodeAlt(a);}
        op[1301] = getOpcodeRnm(132, 906); // primitiveKeyProperty
        op[1302] = getOpcodeRnm(133, 907); // primitiveNonKeyProperty
        op[1303] = getOpcodeRnm(285, 2115); // quotation-mark
        op[1304] = getOpcodeRnm(62, 491); // name-separator
        op[1305] = getOpcodeRnm(209, 1341); // primitiveLiteralInVJSON
        {int[] a = {1307,1308,1309,1310,1311}; op[1306] = getOpcodeCat(a);}
        op[1307] = getOpcodeRnm(285, 2115); // quotation-mark
        op[1308] = getOpcodeRnm(135, 909); // complexProperty
        op[1309] = getOpcodeRnm(285, 2115); // quotation-mark
        op[1310] = getOpcodeRnm(62, 491); // name-separator
        op[1311] = getOpcodeRnm(213, 1364); // complexInVJSON
        {int[] a = {1313,1327}; op[1312] = getOpcodeAlt(a);}
        {int[] a = {1314,1315,1316,1317,1318,1319,1326}; op[1313] = getOpcodeCat(a);}
        op[1314] = getOpcodeRnm(285, 2115); // quotation-mark
        op[1315] = getOpcodeRnm(134, 908); // primitiveColProperty
        op[1316] = getOpcodeRnm(285, 2115); // quotation-mark
        op[1317] = getOpcodeRnm(62, 491); // name-separator
        {char[] a = {91}; op[1318] = getOpcodeTls(a);}
        op[1319] = getOpcodeRep((char)0, (char)1, 1320);
        {int[] a = {1321,1322}; op[1320] = getOpcodeCat(a);}
        op[1321] = getOpcodeRnm(284, 2114); // primitiveVJSONLiteral
        op[1322] = getOpcodeRep((char)0, Character.MAX_VALUE, 1323);
        {int[] a = {1324,1325}; op[1323] = getOpcodeCat(a);}
        op[1324] = getOpcodeRnm(57, 484); // COMMA
        op[1325] = getOpcodeRnm(209, 1341); // primitiveLiteralInVJSON
        {char[] a = {93}; op[1326] = getOpcodeTls(a);}
        {int[] a = {1328,1329,1330,1331,1332,1333,1340}; op[1327] = getOpcodeCat(a);}
        op[1328] = getOpcodeRnm(285, 2115); // quotation-mark
        op[1329] = getOpcodeRnm(136, 910); // complexColProperty
        op[1330] = getOpcodeRnm(285, 2115); // quotation-mark
        op[1331] = getOpcodeRnm(62, 491); // name-separator
        {char[] a = {91}; op[1332] = getOpcodeTls(a);}
        op[1333] = getOpcodeRep((char)0, (char)1, 1334);
        {int[] a = {1335,1336}; op[1334] = getOpcodeCat(a);}
        op[1335] = getOpcodeRnm(213, 1364); // complexInVJSON
        op[1336] = getOpcodeRep((char)0, Character.MAX_VALUE, 1337);
        {int[] a = {1338,1339}; op[1337] = getOpcodeCat(a);}
        op[1338] = getOpcodeRnm(57, 484); // COMMA
        op[1339] = getOpcodeRnm(213, 1364); // complexInVJSON
        {char[] a = {93}; op[1340] = getOpcodeTls(a);}
        {char[] a = {123,84,79,68,79,50,50,125}; op[1341] = getOpcodeTls(a);}
        {int[] a = {1343,1344,1345,1346,1347,1348,1350}; op[1342] = getOpcodeCat(a);}
        op[1343] = getOpcodeRnm(285, 2115); // quotation-mark
        {char[] a = {95,95,109,101,116,97,100,97,116,97}; op[1344] = getOpcodeTls(a);}
        op[1345] = getOpcodeRnm(285, 2115); // quotation-mark
        op[1346] = getOpcodeRnm(62, 491); // name-separator
        op[1347] = getOpcodeRnm(59, 488); // begin-object
        op[1348] = getOpcodeRep((char)0, (char)1, 1349);
        op[1349] = getOpcodeRnm(211, 1351); // typeNVPInVJSON
        op[1350] = getOpcodeRnm(60, 489); // end-object
        {int[] a = {1352,1353,1354,1355,1356,1357,1358}; op[1351] = getOpcodeCat(a);}
        op[1352] = getOpcodeRnm(285, 2115); // quotation-mark
        {char[] a = {116,121,112,101}; op[1353] = getOpcodeTls(a);}
        op[1354] = getOpcodeRnm(285, 2115); // quotation-mark
        op[1355] = getOpcodeRnm(62, 491); // name-separator
        op[1356] = getOpcodeRnm(285, 2115); // quotation-mark
        op[1357] = getOpcodeRnm(125, 840); // qualifiedTypeName
        op[1358] = getOpcodeRnm(285, 2115); // quotation-mark
        {int[] a = {1360,1361,1362,1363}; op[1359] = getOpcodeAlt(a);}
        op[1360] = getOpcodeRnm(77, 561); // primitiveLiteral
        op[1361] = getOpcodeRnm(280, 2110); // complexTypeInJSON
        op[1362] = getOpcodeRnm(283, 2113); // primitiveColInJSON
        op[1363] = getOpcodeRnm(279, 2109); // complexColInJSON
        {int[] a = {1365,1366,1380}; op[1364] = getOpcodeCat(a);}
        op[1365] = getOpcodeRnm(59, 488); // begin-object
        op[1366] = getOpcodeRep((char)0, (char)1, 1367);
        {int[] a = {1368,1373}; op[1367] = getOpcodeCat(a);}
        {int[] a = {1369,1370,1371,1372}; op[1368] = getOpcodeAlt(a);}
        op[1369] = getOpcodeRnm(210, 1342); // complexTypeMetadataInVJSON
        op[1370] = getOpcodeRnm(206, 1298); // primitivePropertyInVJSON
        op[1371] = getOpcodeRnm(207, 1306); // complexPropertyInVJSON
        op[1372] = getOpcodeRnm(208, 1312); // collectionPropertyInVJSON
        op[1373] = getOpcodeRep((char)0, Character.MAX_VALUE, 1374);
        {int[] a = {1375,1376}; op[1374] = getOpcodeCat(a);}
        op[1375] = getOpcodeRnm(61, 490); // value-separator
        {int[] a = {1377,1378,1379}; op[1376] = getOpcodeAlt(a);}
        op[1377] = getOpcodeRnm(206, 1298); // primitivePropertyInVJSON
        op[1378] = getOpcodeRnm(207, 1306); // complexPropertyInVJSON
        op[1379] = getOpcodeRnm(208, 1312); // collectionPropertyInVJSON
        op[1380] = getOpcodeRnm(60, 489); // end-object
        {int[] a = {1382,1384,1399}; op[1381] = getOpcodeCat(a);}
        op[1382] = getOpcodeRep((char)0, (char)1, 1383);
        op[1383] = getOpcodeRnm(30, 242); // WSP
        {int[] a = {1385,1386,1387,1388,1389,1390,1391,1392,1393,1394,1395,1396,1397,1398}; op[1384] = getOpcodeAlt(a);}
        op[1385] = getOpcodeRnm(215, 1401); // boolCommonExpr
        op[1386] = getOpcodeRnm(249, 1740); // methodCallExpr
        op[1387] = getOpcodeRnm(218, 1426); // parenExpr
        op[1388] = getOpcodeRnm(217, 1425); // literalExpr
        op[1389] = getOpcodeRnm(228, 1490); // addExpr
        op[1390] = getOpcodeRnm(229, 1496); // subExpr
        op[1391] = getOpcodeRnm(230, 1502); // mulExpr
        op[1392] = getOpcodeRnm(231, 1508); // divExpr
        op[1393] = getOpcodeRnm(232, 1514); // modExpr
        op[1394] = getOpcodeRnm(233, 1520); // negateExpr
        op[1395] = getOpcodeRnm(241, 1629); // memberExpr
        op[1396] = getOpcodeRnm(238, 1586); // firstMemberExpr
        op[1397] = getOpcodeRnm(236, 1548); // castExpr
        op[1398] = getOpcodeRnm(192, 1244); // functionCall
        op[1399] = getOpcodeRep((char)0, (char)1, 1400);
        op[1400] = getOpcodeRnm(30, 242); // WSP
        {int[] a = {1402,1404,1422}; op[1401] = getOpcodeCat(a);}
        op[1402] = getOpcodeRep((char)0, (char)1, 1403);
        op[1403] = getOpcodeRnm(30, 242); // WSP
        {int[] a = {1405,1406,1407,1408,1409,1410,1411,1412,1413,1414,1415,1416,1417,1418,1419,1420,1421}; op[1404] = getOpcodeAlt(a);}
        op[1405] = getOpcodeRnm(216, 1424); // boolLiteralExpr
        op[1406] = getOpcodeRnm(220, 1442); // andExpr
        op[1407] = getOpcodeRnm(221, 1448); // orExpr
        op[1408] = getOpcodeRnm(240, 1617); // boolPrimitiveMemberExpr
        op[1409] = getOpcodeRnm(222, 1454); // eqExpr
        op[1410] = getOpcodeRnm(223, 1460); // neExpr
        op[1411] = getOpcodeRnm(224, 1466); // ltExpr
        op[1412] = getOpcodeRnm(225, 1472); // leExpr
        op[1413] = getOpcodeRnm(226, 1478); // gtExpr
        op[1414] = getOpcodeRnm(227, 1484); // geExpr
        op[1415] = getOpcodeRnm(234, 1525); // notExpr
        op[1416] = getOpcodeRnm(235, 1529); // isofExpr
        op[1417] = getOpcodeRnm(237, 1567); // boolCastExpr
        op[1418] = getOpcodeRnm(278, 2108); // boolMethodCallExpr
        op[1419] = getOpcodeRnm(239, 1611); // firstBoolPrimitiveMemExpr
        op[1420] = getOpcodeRnm(219, 1434); // boolParenExpr
        op[1421] = getOpcodeRnm(277, 2107); // boolFunctionCallExpr
        op[1422] = getOpcodeRep((char)0, (char)1, 1423);
        op[1423] = getOpcodeRnm(30, 242); // WSP
        op[1424] = getOpcodeRnm(80, 610); // boolean
        op[1425] = getOpcodeRnm(77, 561); // primitiveLiteral
        {int[] a = {1427,1428,1430,1431,1433}; op[1426] = getOpcodeCat(a);}
        {char[] a = {40}; op[1427] = getOpcodeTls(a);}
        op[1428] = getOpcodeRep((char)0, (char)1, 1429);
        op[1429] = getOpcodeRnm(30, 242); // WSP
        op[1430] = getOpcodeRnm(214, 1381); // commonExpr
        op[1431] = getOpcodeRep((char)0, (char)1, 1432);
        op[1432] = getOpcodeRnm(30, 242); // WSP
        {char[] a = {41}; op[1433] = getOpcodeTls(a);}
        {int[] a = {1435,1436,1438,1439,1441}; op[1434] = getOpcodeCat(a);}
        {char[] a = {40}; op[1435] = getOpcodeTls(a);}
        op[1436] = getOpcodeRep((char)0, (char)1, 1437);
        op[1437] = getOpcodeRnm(30, 242); // WSP
        op[1438] = getOpcodeRnm(215, 1401); // boolCommonExpr
        op[1439] = getOpcodeRep((char)0, (char)1, 1440);
        op[1440] = getOpcodeRnm(30, 242); // WSP
        {char[] a = {41}; op[1441] = getOpcodeTls(a);}
        {int[] a = {1443,1444,1445,1446,1447}; op[1442] = getOpcodeCat(a);}
        op[1443] = getOpcodeRnm(215, 1401); // boolCommonExpr
        op[1444] = getOpcodeRnm(30, 242); // WSP
        {char[] a = {97,110,100}; op[1445] = getOpcodeTls(a);}
        op[1446] = getOpcodeRnm(30, 242); // WSP
        op[1447] = getOpcodeRnm(215, 1401); // boolCommonExpr
        {int[] a = {1449,1450,1451,1452,1453}; op[1448] = getOpcodeCat(a);}
        op[1449] = getOpcodeRnm(215, 1401); // boolCommonExpr
        op[1450] = getOpcodeRnm(30, 242); // WSP
        {char[] a = {111,114}; op[1451] = getOpcodeTls(a);}
        op[1452] = getOpcodeRnm(30, 242); // WSP
        op[1453] = getOpcodeRnm(215, 1401); // boolCommonExpr
        {int[] a = {1455,1456,1457,1458,1459}; op[1454] = getOpcodeCat(a);}
        op[1455] = getOpcodeRnm(214, 1381); // commonExpr
        op[1456] = getOpcodeRnm(30, 242); // WSP
        {char[] a = {101,113}; op[1457] = getOpcodeTls(a);}
        op[1458] = getOpcodeRnm(30, 242); // WSP
        op[1459] = getOpcodeRnm(214, 1381); // commonExpr
        {int[] a = {1461,1462,1463,1464,1465}; op[1460] = getOpcodeCat(a);}
        op[1461] = getOpcodeRnm(214, 1381); // commonExpr
        op[1462] = getOpcodeRnm(30, 242); // WSP
        {char[] a = {110,101}; op[1463] = getOpcodeTls(a);}
        op[1464] = getOpcodeRnm(30, 242); // WSP
        op[1465] = getOpcodeRnm(214, 1381); // commonExpr
        {int[] a = {1467,1468,1469,1470,1471}; op[1466] = getOpcodeCat(a);}
        op[1467] = getOpcodeRnm(214, 1381); // commonExpr
        op[1468] = getOpcodeRnm(30, 242); // WSP
        {char[] a = {108,116}; op[1469] = getOpcodeTls(a);}
        op[1470] = getOpcodeRnm(30, 242); // WSP
        op[1471] = getOpcodeRnm(214, 1381); // commonExpr
        {int[] a = {1473,1474,1475,1476,1477}; op[1472] = getOpcodeCat(a);}
        op[1473] = getOpcodeRnm(214, 1381); // commonExpr
        op[1474] = getOpcodeRnm(30, 242); // WSP
        {char[] a = {108,101}; op[1475] = getOpcodeTls(a);}
        op[1476] = getOpcodeRnm(30, 242); // WSP
        op[1477] = getOpcodeRnm(214, 1381); // commonExpr
        {int[] a = {1479,1480,1481,1482,1483}; op[1478] = getOpcodeCat(a);}
        op[1479] = getOpcodeRnm(214, 1381); // commonExpr
        op[1480] = getOpcodeRnm(30, 242); // WSP
        {char[] a = {103,116}; op[1481] = getOpcodeTls(a);}
        op[1482] = getOpcodeRnm(30, 242); // WSP
        op[1483] = getOpcodeRnm(214, 1381); // commonExpr
        {int[] a = {1485,1486,1487,1488,1489}; op[1484] = getOpcodeCat(a);}
        op[1485] = getOpcodeRnm(214, 1381); // commonExpr
        op[1486] = getOpcodeRnm(30, 242); // WSP
        {char[] a = {103,101}; op[1487] = getOpcodeTls(a);}
        op[1488] = getOpcodeRnm(30, 242); // WSP
        op[1489] = getOpcodeRnm(214, 1381); // commonExpr
        {int[] a = {1491,1492,1493,1494,1495}; op[1490] = getOpcodeCat(a);}
        op[1491] = getOpcodeRnm(214, 1381); // commonExpr
        op[1492] = getOpcodeRnm(30, 242); // WSP
        {char[] a = {97,100,100}; op[1493] = getOpcodeTls(a);}
        op[1494] = getOpcodeRnm(30, 242); // WSP
        op[1495] = getOpcodeRnm(214, 1381); // commonExpr
        {int[] a = {1497,1498,1499,1500,1501}; op[1496] = getOpcodeCat(a);}
        op[1497] = getOpcodeRnm(214, 1381); // commonExpr
        op[1498] = getOpcodeRnm(30, 242); // WSP
        {char[] a = {115,117,98}; op[1499] = getOpcodeTls(a);}
        op[1500] = getOpcodeRnm(30, 242); // WSP
        op[1501] = getOpcodeRnm(214, 1381); // commonExpr
        {int[] a = {1503,1504,1505,1506,1507}; op[1502] = getOpcodeCat(a);}
        op[1503] = getOpcodeRnm(214, 1381); // commonExpr
        op[1504] = getOpcodeRnm(30, 242); // WSP
        {char[] a = {109,117,108}; op[1505] = getOpcodeTls(a);}
        op[1506] = getOpcodeRnm(30, 242); // WSP
        op[1507] = getOpcodeRnm(214, 1381); // commonExpr
        {int[] a = {1509,1510,1511,1512,1513}; op[1508] = getOpcodeCat(a);}
        op[1509] = getOpcodeRnm(214, 1381); // commonExpr
        op[1510] = getOpcodeRnm(30, 242); // WSP
        {char[] a = {100,105,118}; op[1511] = getOpcodeTls(a);}
        op[1512] = getOpcodeRnm(30, 242); // WSP
        op[1513] = getOpcodeRnm(214, 1381); // commonExpr
        {int[] a = {1515,1516,1517,1518,1519}; op[1514] = getOpcodeCat(a);}
        op[1515] = getOpcodeRnm(214, 1381); // commonExpr
        op[1516] = getOpcodeRnm(30, 242); // WSP
        {char[] a = {109,111,100}; op[1517] = getOpcodeTls(a);}
        op[1518] = getOpcodeRnm(30, 242); // WSP
        op[1519] = getOpcodeRnm(214, 1381); // commonExpr
        {int[] a = {1521,1522,1524}; op[1520] = getOpcodeCat(a);}
        {char[] a = {45}; op[1521] = getOpcodeTls(a);}
        op[1522] = getOpcodeRep((char)0, (char)1, 1523);
        op[1523] = getOpcodeRnm(30, 242); // WSP
        op[1524] = getOpcodeRnm(214, 1381); // commonExpr
        {int[] a = {1526,1527,1528}; op[1525] = getOpcodeCat(a);}
        {char[] a = {110,111,116}; op[1526] = getOpcodeTls(a);}
        op[1527] = getOpcodeRnm(30, 242); // WSP
        op[1528] = getOpcodeRnm(214, 1381); // commonExpr
        {int[] a = {1530,1531,1533,1534,1542,1544,1545,1547}; op[1529] = getOpcodeCat(a);}
        {char[] a = {105,115,111,102}; op[1530] = getOpcodeTls(a);}
        op[1531] = getOpcodeRep((char)0, (char)1, 1532);
        op[1532] = getOpcodeRnm(30, 242); // WSP
        {char[] a = {40}; op[1533] = getOpcodeTls(a);}
        op[1534] = getOpcodeRep((char)0, (char)1, 1535);
        {int[] a = {1536,1538,1539,1541}; op[1535] = getOpcodeCat(a);}
        op[1536] = getOpcodeRep((char)0, (char)1, 1537);
        op[1537] = getOpcodeRnm(30, 242); // WSP
        op[1538] = getOpcodeRnm(214, 1381); // commonExpr
        op[1539] = getOpcodeRep((char)0, (char)1, 1540);
        op[1540] = getOpcodeRnm(30, 242); // WSP
        {char[] a = {44}; op[1541] = getOpcodeTls(a);}
        op[1542] = getOpcodeRep((char)0, (char)1, 1543);
        op[1543] = getOpcodeRnm(30, 242); // WSP
        op[1544] = getOpcodeRnm(125, 840); // qualifiedTypeName
        op[1545] = getOpcodeRep((char)0, (char)1, 1546);
        op[1546] = getOpcodeRnm(30, 242); // WSP
        {char[] a = {41}; op[1547] = getOpcodeTls(a);}
        {int[] a = {1549,1550,1552,1553,1561,1563,1564,1566}; op[1548] = getOpcodeCat(a);}
        {char[] a = {99,97,115,116}; op[1549] = getOpcodeTls(a);}
        op[1550] = getOpcodeRep((char)0, (char)1, 1551);
        op[1551] = getOpcodeRnm(30, 242); // WSP
        {char[] a = {40}; op[1552] = getOpcodeTls(a);}
        op[1553] = getOpcodeRep((char)0, (char)1, 1554);
        {int[] a = {1555,1557,1558,1560}; op[1554] = getOpcodeCat(a);}
        op[1555] = getOpcodeRep((char)0, (char)1, 1556);
        op[1556] = getOpcodeRnm(30, 242); // WSP
        op[1557] = getOpcodeRnm(214, 1381); // commonExpr
        op[1558] = getOpcodeRep((char)0, (char)1, 1559);
        op[1559] = getOpcodeRnm(30, 242); // WSP
        {char[] a = {44}; op[1560] = getOpcodeTls(a);}
        op[1561] = getOpcodeRep((char)0, (char)1, 1562);
        op[1562] = getOpcodeRnm(30, 242); // WSP
        op[1563] = getOpcodeRnm(125, 840); // qualifiedTypeName
        op[1564] = getOpcodeRep((char)0, (char)1, 1565);
        op[1565] = getOpcodeRnm(30, 242); // WSP
        {char[] a = {41}; op[1566] = getOpcodeTls(a);}
        {int[] a = {1568,1569,1571,1572,1580,1582,1583,1585}; op[1567] = getOpcodeCat(a);}
        {char[] a = {99,97,115,116}; op[1568] = getOpcodeTls(a);}
        op[1569] = getOpcodeRep((char)0, (char)1, 1570);
        op[1570] = getOpcodeRnm(30, 242); // WSP
        {char[] a = {40}; op[1571] = getOpcodeTls(a);}
        op[1572] = getOpcodeRep((char)0, (char)1, 1573);
        {int[] a = {1574,1576,1577,1579}; op[1573] = getOpcodeCat(a);}
        op[1574] = getOpcodeRep((char)0, (char)1, 1575);
        op[1575] = getOpcodeRnm(30, 242); // WSP
        op[1576] = getOpcodeRnm(214, 1381); // commonExpr
        op[1577] = getOpcodeRep((char)0, (char)1, 1578);
        op[1578] = getOpcodeRnm(30, 242); // WSP
        {char[] a = {44}; op[1579] = getOpcodeTls(a);}
        op[1580] = getOpcodeRep((char)0, (char)1, 1581);
        op[1581] = getOpcodeRnm(30, 242); // WSP
        {char[] a = {69,100,109,46,66,111,111,108,101,97,110}; op[1582] = getOpcodeTls(a);}
        op[1583] = getOpcodeRep((char)0, (char)1, 1584);
        op[1584] = getOpcodeRnm(30, 242); // WSP
        {char[] a = {41}; op[1585] = getOpcodeTls(a);}
        {int[] a = {1587,1599,1603,1604,1605}; op[1586] = getOpcodeAlt(a);}
        {int[] a = {1588,1590,1594,1596,1597}; op[1587] = getOpcodeCat(a);}
        op[1588] = getOpcodeRep((char)0, (char)1, 1589);
        op[1589] = getOpcodeRnm(30, 242); // WSP
        op[1590] = getOpcodeRep((char)0, (char)1, 1591);
        {int[] a = {1592,1593}; op[1591] = getOpcodeCat(a);}
        op[1592] = getOpcodeRnm(126, 853); // qualifiedEntityTypeName
        {char[] a = {47}; op[1593] = getOpcodeTls(a);}
        op[1594] = getOpcodeRep((char)0, (char)1, 1595);
        op[1595] = getOpcodeRnm(282, 2112); // lambdaPredicatePrefixExpr
        op[1596] = getOpcodeRnm(141, 921); // entityColNavigationProperty
        op[1597] = getOpcodeRep((char)0, (char)1, 1598);
        op[1598] = getOpcodeRnm(242, 1656); // collectionNavigationExpr
        {int[] a = {1600,1601}; op[1599] = getOpcodeCat(a);}
        op[1600] = getOpcodeRnm(140, 920); // entityNavigationProperty
        op[1601] = getOpcodeRep((char)0, (char)1, 1602);
        op[1602] = getOpcodeRnm(243, 1666); // singleNavigationExpr
        op[1603] = getOpcodeRnm(174, 1151); // primitivePropertyPath
        op[1604] = getOpcodeRnm(175, 1162); // complexPropertyPath
        {int[] a = {1606,1607}; op[1605] = getOpcodeCat(a);}
        op[1606] = getOpcodeRnm(176, 1175); // collectionPropertyPath
        op[1607] = getOpcodeRep((char)0, (char)1, 1608);
        {int[] a = {1609,1610}; op[1608] = getOpcodeAlt(a);}
        op[1609] = getOpcodeRnm(245, 1724); // anyExpr
        op[1610] = getOpcodeRnm(246, 1732); // allExpr
        {int[] a = {1612,1616}; op[1611] = getOpcodeCat(a);}
        op[1612] = getOpcodeRep((char)0, (char)1, 1613);
        {int[] a = {1614,1615}; op[1613] = getOpcodeCat(a);}
        op[1614] = getOpcodeRnm(126, 853); // qualifiedEntityTypeName
        {char[] a = {47}; op[1615] = getOpcodeTls(a);}
        op[1616] = getOpcodeRnm(281, 2111); // entityProperty
        {int[] a = {1618,1619,1621,1622,1624,1628}; op[1617] = getOpcodeCat(a);}
        op[1618] = getOpcodeRnm(214, 1381); // commonExpr
        op[1619] = getOpcodeRep((char)0, (char)1, 1620);
        op[1620] = getOpcodeRnm(30, 242); // WSP
        {char[] a = {47}; op[1621] = getOpcodeTls(a);}
        op[1622] = getOpcodeRep((char)0, (char)1, 1623);
        op[1623] = getOpcodeRnm(30, 242); // WSP
        op[1624] = getOpcodeRep((char)0, (char)1, 1625);
        {int[] a = {1626,1627}; op[1625] = getOpcodeCat(a);}
        op[1626] = getOpcodeRnm(126, 853); // qualifiedEntityTypeName
        {char[] a = {47}; op[1627] = getOpcodeTls(a);}
        op[1628] = getOpcodeRnm(174, 1151); // primitivePropertyPath
        {int[] a = {1630,1644,1648,1649,1650}; op[1629] = getOpcodeAlt(a);}
        {int[] a = {1631,1632,1634,1635,1637,1641,1642}; op[1630] = getOpcodeCat(a);}
        op[1631] = getOpcodeRnm(214, 1381); // commonExpr
        op[1632] = getOpcodeRep((char)0, (char)1, 1633);
        op[1633] = getOpcodeRnm(30, 242); // WSP
        {char[] a = {47}; op[1634] = getOpcodeTls(a);}
        op[1635] = getOpcodeRep((char)0, (char)1, 1636);
        op[1636] = getOpcodeRnm(30, 242); // WSP
        op[1637] = getOpcodeRep((char)0, (char)1, 1638);
        {int[] a = {1639,1640}; op[1638] = getOpcodeCat(a);}
        op[1639] = getOpcodeRnm(126, 853); // qualifiedEntityTypeName
        {char[] a = {47}; op[1640] = getOpcodeTls(a);}
        op[1641] = getOpcodeRnm(141, 921); // entityColNavigationProperty
        op[1642] = getOpcodeRep((char)0, (char)1, 1643);
        op[1643] = getOpcodeRnm(242, 1656); // collectionNavigationExpr
        {int[] a = {1645,1646}; op[1644] = getOpcodeCat(a);}
        op[1645] = getOpcodeRnm(140, 920); // entityNavigationProperty
        op[1646] = getOpcodeRep((char)0, (char)1, 1647);
        op[1647] = getOpcodeRnm(243, 1666); // singleNavigationExpr
        op[1648] = getOpcodeRnm(174, 1151); // primitivePropertyPath
        op[1649] = getOpcodeRnm(175, 1162); // complexPropertyPath
        {int[] a = {1651,1652}; op[1650] = getOpcodeCat(a);}
        op[1651] = getOpcodeRnm(176, 1175); // collectionPropertyPath
        op[1652] = getOpcodeRep((char)0, (char)1, 1653);
        {int[] a = {1654,1655}; op[1653] = getOpcodeAlt(a);}
        op[1654] = getOpcodeRnm(245, 1724); // anyExpr
        op[1655] = getOpcodeRnm(246, 1732); // allExpr
        {int[] a = {1657,1661,1662}; op[1656] = getOpcodeCat(a);}
        op[1657] = getOpcodeRep((char)0, (char)1, 1658);
        {int[] a = {1659,1660}; op[1658] = getOpcodeCat(a);}
        {char[] a = {47}; op[1659] = getOpcodeTls(a);}
        op[1660] = getOpcodeRnm(126, 853); // qualifiedEntityTypeName
        {char[] a = {47}; op[1661] = getOpcodeTls(a);}
        {int[] a = {1663,1664,1665}; op[1662] = getOpcodeAlt(a);}
        op[1663] = getOpcodeRnm(244, 1691); // boundFunctionExpr
        op[1664] = getOpcodeRnm(245, 1724); // anyExpr
        op[1665] = getOpcodeRnm(246, 1732); // allExpr
        {int[] a = {1667,1671,1672}; op[1666] = getOpcodeCat(a);}
        op[1667] = getOpcodeRep((char)0, (char)1, 1668);
        {int[] a = {1669,1670}; op[1668] = getOpcodeCat(a);}
        {char[] a = {47}; op[1669] = getOpcodeTls(a);}
        op[1670] = getOpcodeRnm(126, 853); // qualifiedEntityTypeName
        {char[] a = {47}; op[1671] = getOpcodeTls(a);}
        {int[] a = {1673,1677,1681,1682,1683,1689,1690}; op[1672] = getOpcodeAlt(a);}
        {int[] a = {1674,1675}; op[1673] = getOpcodeCat(a);}
        op[1674] = getOpcodeRnm(141, 921); // entityColNavigationProperty
        op[1675] = getOpcodeRep((char)0, (char)1, 1676);
        op[1676] = getOpcodeRnm(242, 1656); // collectionNavigationExpr
        {int[] a = {1678,1679}; op[1677] = getOpcodeCat(a);}
        op[1678] = getOpcodeRnm(140, 920); // entityNavigationProperty
        op[1679] = getOpcodeRep((char)0, (char)1, 1680);
        op[1680] = getOpcodeRnm(243, 1666); // singleNavigationExpr
        op[1681] = getOpcodeRnm(174, 1151); // primitivePropertyPath
        op[1682] = getOpcodeRnm(175, 1162); // complexPropertyPath
        {int[] a = {1684,1685}; op[1683] = getOpcodeCat(a);}
        op[1684] = getOpcodeRnm(176, 1175); // collectionPropertyPath
        op[1685] = getOpcodeRep((char)0, (char)1, 1686);
        {int[] a = {1687,1688}; op[1686] = getOpcodeAlt(a);}
        op[1687] = getOpcodeRnm(245, 1724); // anyExpr
        op[1688] = getOpcodeRnm(246, 1732); // allExpr
        op[1689] = getOpcodeRnm(177, 1186); // streamPropertyPath
        op[1690] = getOpcodeRnm(244, 1691); // boundFunctionExpr
        {int[] a = {1692,1696,1697}; op[1691] = getOpcodeCat(a);}
        op[1692] = getOpcodeRep((char)0, (char)1, 1693);
        {int[] a = {1694,1695}; op[1693] = getOpcodeCat(a);}
        {char[] a = {47}; op[1694] = getOpcodeTls(a);}
        op[1695] = getOpcodeRnm(126, 853); // qualifiedEntityTypeName
        {char[] a = {47}; op[1696] = getOpcodeTls(a);}
        {int[] a = {1698,1702,1706,1710,1714,1720}; op[1697] = getOpcodeAlt(a);}
        {int[] a = {1699,1700}; op[1698] = getOpcodeCat(a);}
        op[1699] = getOpcodeRnm(194, 1254); // boundEntityColFuncCall
        op[1700] = getOpcodeRep((char)0, (char)1, 1701);
        op[1701] = getOpcodeRnm(243, 1666); // singleNavigationExpr
        {int[] a = {1703,1704}; op[1702] = getOpcodeCat(a);}
        op[1703] = getOpcodeRnm(193, 1251); // boundEntityFuncCall
        op[1704] = getOpcodeRep((char)0, (char)1, 1705);
        op[1705] = getOpcodeRnm(242, 1656); // collectionNavigationExpr
        {int[] a = {1707,1708}; op[1706] = getOpcodeCat(a);}
        op[1707] = getOpcodeRnm(197, 1263); // boundPrimitiveFuncCall
        op[1708] = getOpcodeRep((char)0, (char)1, 1709);
        op[1709] = getOpcodeRnm(244, 1691); // boundFunctionExpr
        {int[] a = {1711,1712}; op[1710] = getOpcodeCat(a);}
        op[1711] = getOpcodeRnm(198, 1266); // boundPrimitiveColFuncCall
        op[1712] = getOpcodeRep((char)0, (char)1, 1713);
        op[1713] = getOpcodeRnm(244, 1691); // boundFunctionExpr
        {int[] a = {1715,1716}; op[1714] = getOpcodeCat(a);}
        op[1715] = getOpcodeRnm(195, 1257); // boundComplexFuncCall
        op[1716] = getOpcodeRep((char)0, (char)1, 1717);
        {int[] a = {1718,1719}; op[1717] = getOpcodeAlt(a);}
        op[1718] = getOpcodeRnm(175, 1162); // complexPropertyPath
        op[1719] = getOpcodeRnm(244, 1691); // boundFunctionExpr
        {int[] a = {1721,1722}; op[1720] = getOpcodeCat(a);}
        op[1721] = getOpcodeRnm(196, 1260); // boundComplexColFuncCall
        op[1722] = getOpcodeRep((char)0, (char)1, 1723);
        op[1723] = getOpcodeRnm(244, 1691); // boundFunctionExpr
        {int[] a = {1725,1726,1731}; op[1724] = getOpcodeCat(a);}
        {char[] a = {97,110,121,40}; op[1725] = getOpcodeTls(a);}
        op[1726] = getOpcodeRep((char)0, (char)1, 1727);
        {int[] a = {1728,1729,1730}; op[1727] = getOpcodeCat(a);}
        op[1728] = getOpcodeRnm(247, 1738); // lambdaVariableExpr
        {char[] a = {58}; op[1729] = getOpcodeTls(a);}
        op[1730] = getOpcodeRnm(248, 1739); // lambdaPredicateExpr
        {char[] a = {41}; op[1731] = getOpcodeTls(a);}
        {int[] a = {1733,1734,1735,1736,1737}; op[1732] = getOpcodeCat(a);}
        {char[] a = {97,108,108,40}; op[1733] = getOpcodeTls(a);}
        op[1734] = getOpcodeRnm(247, 1738); // lambdaVariableExpr
        {char[] a = {58}; op[1735] = getOpcodeTls(a);}
        op[1736] = getOpcodeRnm(248, 1739); // lambdaPredicateExpr
        {char[] a = {41}; op[1737] = getOpcodeTls(a);}
        op[1738] = getOpcodeRnm(116, 818); // odataIdentifier
        op[1739] = getOpcodeRnm(215, 1401); // boolCommonExpr
        {int[] a = {1741,1742,1743,1744,1745,1746,1747,1748,1749,1750,1751,1752,1753,1754,1755,1756,1757,1758,1759,1760,1761}; op[1740] = getOpcodeAlt(a);}
        op[1741] = getOpcodeRnm(250, 1762); // boolMethodExpr
        op[1742] = getOpcodeRnm(252, 1786); // indexOfMethodCallExpr
        op[1743] = getOpcodeRnm(253, 1803); // replaceMethodCallExpr
        op[1744] = getOpcodeRnm(255, 1843); // toLowerMethodCallExpr
        op[1745] = getOpcodeRnm(256, 1854); // toUpperMethodCallExpr
        op[1746] = getOpcodeRnm(257, 1865); // trimMethodCallExpr
        op[1747] = getOpcodeRnm(258, 1876); // substringMethodCallExpr
        op[1748] = getOpcodeRnm(260, 1920); // concatMethodCallExpr
        op[1749] = getOpcodeRnm(261, 1939); // lengthMethodCallExpr
        op[1750] = getOpcodeRnm(263, 1961); // yearMethodCallExpr
        op[1751] = getOpcodeRnm(264, 1972); // monthMethodCallExpr
        op[1752] = getOpcodeRnm(265, 1983); // dayMethodCallExpr
        op[1753] = getOpcodeRnm(266, 1994); // hourMethodCallExpr
        op[1754] = getOpcodeRnm(267, 2005); // minuteMethodCallExpr
        op[1755] = getOpcodeRnm(268, 2016); // secondMethodCallExpr
        op[1756] = getOpcodeRnm(269, 2027); // roundMethodCallExpr
        op[1757] = getOpcodeRnm(270, 2038); // floorMethodCallExpr
        op[1758] = getOpcodeRnm(271, 2049); // ceilingMethodCallExpr
        op[1759] = getOpcodeRnm(272, 2060); // distanceMethodCallExpr
        op[1760] = getOpcodeRnm(273, 2077); // geoLengthMethodCallExpr
        op[1761] = getOpcodeRnm(262, 1950); // getTotalOffsetMinutesExpr
        {int[] a = {1763,1764,1765,1766,1767,1768}; op[1762] = getOpcodeAlt(a);}
        op[1763] = getOpcodeRnm(251, 1769); // endsWithMethodCallExpr
        op[1764] = getOpcodeRnm(254, 1826); // startsWithMethodCallExpr
        op[1765] = getOpcodeRnm(259, 1901); // substringOfMethodCallExpr
        op[1766] = getOpcodeRnm(274, 2088); // intersectsMethodCallExpr
        op[1767] = getOpcodeRnm(276, 2106); // anyMethodCallExpr
        op[1768] = getOpcodeRnm(275, 2105); // allMethodCallExpr
        {int[] a = {1770,1771,1773,1774,1776,1777,1779,1780,1782,1783,1785}; op[1769] = getOpcodeCat(a);}
        {char[] a = {101,110,100,115,119,105,116,104}; op[1770] = getOpcodeTls(a);}
        op[1771] = getOpcodeRep((char)0, (char)1, 1772);
        op[1772] = getOpcodeRnm(30, 242); // WSP
        {char[] a = {40}; op[1773] = getOpcodeTls(a);}
        op[1774] = getOpcodeRep((char)0, (char)1, 1775);
        op[1775] = getOpcodeRnm(30, 242); // WSP
        op[1776] = getOpcodeRnm(214, 1381); // commonExpr
        op[1777] = getOpcodeRep((char)0, (char)1, 1778);
        op[1778] = getOpcodeRnm(30, 242); // WSP
        {char[] a = {44}; op[1779] = getOpcodeTls(a);}
        op[1780] = getOpcodeRep((char)0, (char)1, 1781);
        op[1781] = getOpcodeRnm(30, 242); // WSP
        op[1782] = getOpcodeRnm(214, 1381); // commonExpr
        op[1783] = getOpcodeRep((char)0, (char)1, 1784);
        op[1784] = getOpcodeRnm(30, 242); // WSP
        {char[] a = {41}; op[1785] = getOpcodeTls(a);}
        {int[] a = {1787,1788,1790,1791,1793,1794,1796,1797,1799,1800,1802}; op[1786] = getOpcodeCat(a);}
        {char[] a = {105,110,100,101,120,111,102}; op[1787] = getOpcodeTls(a);}
        op[1788] = getOpcodeRep((char)0, (char)1, 1789);
        op[1789] = getOpcodeRnm(30, 242); // WSP
        {char[] a = {40}; op[1790] = getOpcodeTls(a);}
        op[1791] = getOpcodeRep((char)0, (char)1, 1792);
        op[1792] = getOpcodeRnm(30, 242); // WSP
        op[1793] = getOpcodeRnm(214, 1381); // commonExpr
        op[1794] = getOpcodeRep((char)0, (char)1, 1795);
        op[1795] = getOpcodeRnm(30, 242); // WSP
        {char[] a = {44}; op[1796] = getOpcodeTls(a);}
        op[1797] = getOpcodeRep((char)0, (char)1, 1798);
        op[1798] = getOpcodeRnm(30, 242); // WSP
        op[1799] = getOpcodeRnm(214, 1381); // commonExpr
        op[1800] = getOpcodeRep((char)0, (char)1, 1801);
        op[1801] = getOpcodeRnm(30, 242); // WSP
        {char[] a = {41}; op[1802] = getOpcodeTls(a);}
        {int[] a = {1804,1805,1807,1808,1810,1811,1813,1814,1816,1817,1819,1820,1822,1823,1825}; op[1803] = getOpcodeCat(a);}
        {char[] a = {114,101,112,108,97,99,101}; op[1804] = getOpcodeTls(a);}
        op[1805] = getOpcodeRep((char)0, (char)1, 1806);
        op[1806] = getOpcodeRnm(30, 242); // WSP
        {char[] a = {40}; op[1807] = getOpcodeTls(a);}
        op[1808] = getOpcodeRep((char)0, (char)1, 1809);
        op[1809] = getOpcodeRnm(30, 242); // WSP
        op[1810] = getOpcodeRnm(214, 1381); // commonExpr
        op[1811] = getOpcodeRep((char)0, (char)1, 1812);
        op[1812] = getOpcodeRnm(30, 242); // WSP
        {char[] a = {44}; op[1813] = getOpcodeTls(a);}
        op[1814] = getOpcodeRep((char)0, (char)1, 1815);
        op[1815] = getOpcodeRnm(30, 242); // WSP
        op[1816] = getOpcodeRnm(214, 1381); // commonExpr
        op[1817] = getOpcodeRep((char)0, (char)1, 1818);
        op[1818] = getOpcodeRnm(30, 242); // WSP
        {char[] a = {44}; op[1819] = getOpcodeTls(a);}
        op[1820] = getOpcodeRep((char)0, (char)1, 1821);
        op[1821] = getOpcodeRnm(30, 242); // WSP
        op[1822] = getOpcodeRnm(214, 1381); // commonExpr
        op[1823] = getOpcodeRep((char)0, (char)1, 1824);
        op[1824] = getOpcodeRnm(30, 242); // WSP
        {char[] a = {41}; op[1825] = getOpcodeTls(a);}
        {int[] a = {1827,1828,1830,1831,1833,1834,1836,1837,1839,1840,1842}; op[1826] = getOpcodeCat(a);}
        {char[] a = {115,116,97,114,116,115,119,105,116,104}; op[1827] = getOpcodeTls(a);}
        op[1828] = getOpcodeRep((char)0, (char)1, 1829);
        op[1829] = getOpcodeRnm(30, 242); // WSP
        {char[] a = {40}; op[1830] = getOpcodeTls(a);}
        op[1831] = getOpcodeRep((char)0, (char)1, 1832);
        op[1832] = getOpcodeRnm(30, 242); // WSP
        op[1833] = getOpcodeRnm(214, 1381); // commonExpr
        op[1834] = getOpcodeRep((char)0, (char)1, 1835);
        op[1835] = getOpcodeRnm(30, 242); // WSP
        {char[] a = {44}; op[1836] = getOpcodeTls(a);}
        op[1837] = getOpcodeRep((char)0, (char)1, 1838);
        op[1838] = getOpcodeRnm(30, 242); // WSP
        op[1839] = getOpcodeRnm(214, 1381); // commonExpr
        op[1840] = getOpcodeRep((char)0, (char)1, 1841);
        op[1841] = getOpcodeRnm(30, 242); // WSP
        {char[] a = {41}; op[1842] = getOpcodeTls(a);}
        {int[] a = {1844,1845,1847,1848,1850,1851,1853}; op[1843] = getOpcodeCat(a);}
        {char[] a = {116,111,108,111,119,101,114}; op[1844] = getOpcodeTls(a);}
        op[1845] = getOpcodeRep((char)0, (char)1, 1846);
        op[1846] = getOpcodeRnm(30, 242); // WSP
        {char[] a = {40}; op[1847] = getOpcodeTls(a);}
        op[1848] = getOpcodeRep((char)0, (char)1, 1849);
        op[1849] = getOpcodeRnm(30, 242); // WSP
        op[1850] = getOpcodeRnm(214, 1381); // commonExpr
        op[1851] = getOpcodeRep((char)0, (char)1, 1852);
        op[1852] = getOpcodeRnm(30, 242); // WSP
        {char[] a = {41}; op[1853] = getOpcodeTls(a);}
        {int[] a = {1855,1856,1858,1859,1861,1862,1864}; op[1854] = getOpcodeCat(a);}
        {char[] a = {116,111,117,112,112,101,114}; op[1855] = getOpcodeTls(a);}
        op[1856] = getOpcodeRep((char)0, (char)1, 1857);
        op[1857] = getOpcodeRnm(30, 242); // WSP
        {char[] a = {40}; op[1858] = getOpcodeTls(a);}
        op[1859] = getOpcodeRep((char)0, (char)1, 1860);
        op[1860] = getOpcodeRnm(30, 242); // WSP
        op[1861] = getOpcodeRnm(214, 1381); // commonExpr
        op[1862] = getOpcodeRep((char)0, (char)1, 1863);
        op[1863] = getOpcodeRnm(30, 242); // WSP
        {char[] a = {41}; op[1864] = getOpcodeTls(a);}
        {int[] a = {1866,1867,1869,1870,1872,1873,1875}; op[1865] = getOpcodeCat(a);}
        {char[] a = {116,114,105,109}; op[1866] = getOpcodeTls(a);}
        op[1867] = getOpcodeRep((char)0, (char)1, 1868);
        op[1868] = getOpcodeRnm(30, 242); // WSP
        {char[] a = {40}; op[1869] = getOpcodeTls(a);}
        op[1870] = getOpcodeRep((char)0, (char)1, 1871);
        op[1871] = getOpcodeRnm(30, 242); // WSP
        op[1872] = getOpcodeRnm(214, 1381); // commonExpr
        op[1873] = getOpcodeRep((char)0, (char)1, 1874);
        op[1874] = getOpcodeRnm(30, 242); // WSP
        {char[] a = {41}; op[1875] = getOpcodeTls(a);}
        {int[] a = {1877,1878,1880,1881,1883,1884,1886,1887,1889,1890,1892,1900}; op[1876] = getOpcodeCat(a);}
        {char[] a = {115,117,98,115,116,114,105,110,103}; op[1877] = getOpcodeTls(a);}
        op[1878] = getOpcodeRep((char)0, (char)1, 1879);
        op[1879] = getOpcodeRnm(30, 242); // WSP
        {char[] a = {40}; op[1880] = getOpcodeTls(a);}
        op[1881] = getOpcodeRep((char)0, (char)1, 1882);
        op[1882] = getOpcodeRnm(30, 242); // WSP
        op[1883] = getOpcodeRnm(214, 1381); // commonExpr
        op[1884] = getOpcodeRep((char)0, (char)1, 1885);
        op[1885] = getOpcodeRnm(30, 242); // WSP
        {char[] a = {44}; op[1886] = getOpcodeTls(a);}
        op[1887] = getOpcodeRep((char)0, (char)1, 1888);
        op[1888] = getOpcodeRnm(30, 242); // WSP
        op[1889] = getOpcodeRnm(214, 1381); // commonExpr
        op[1890] = getOpcodeRep((char)0, (char)1, 1891);
        op[1891] = getOpcodeRnm(30, 242); // WSP
        op[1892] = getOpcodeRep((char)0, (char)1, 1893);
        {int[] a = {1894,1895,1897,1898}; op[1893] = getOpcodeCat(a);}
        {char[] a = {44}; op[1894] = getOpcodeTls(a);}
        op[1895] = getOpcodeRep((char)0, (char)1, 1896);
        op[1896] = getOpcodeRnm(30, 242); // WSP
        op[1897] = getOpcodeRnm(214, 1381); // commonExpr
        op[1898] = getOpcodeRep((char)0, (char)1, 1899);
        op[1899] = getOpcodeRnm(30, 242); // WSP
        {char[] a = {41}; op[1900] = getOpcodeTls(a);}
        {int[] a = {1902,1903,1905,1906,1908,1909,1911,1919}; op[1901] = getOpcodeCat(a);}
        {char[] a = {115,117,98,115,116,114,105,110,103,111,102}; op[1902] = getOpcodeTls(a);}
        op[1903] = getOpcodeRep((char)0, (char)1, 1904);
        op[1904] = getOpcodeRnm(30, 242); // WSP
        {char[] a = {40}; op[1905] = getOpcodeTls(a);}
        op[1906] = getOpcodeRep((char)0, (char)1, 1907);
        op[1907] = getOpcodeRnm(30, 242); // WSP
        op[1908] = getOpcodeRnm(214, 1381); // commonExpr
        op[1909] = getOpcodeRep((char)0, (char)1, 1910);
        op[1910] = getOpcodeRnm(30, 242); // WSP
        op[1911] = getOpcodeRep((char)0, (char)1, 1912);
        {int[] a = {1913,1914,1916,1917}; op[1912] = getOpcodeCat(a);}
        {char[] a = {44}; op[1913] = getOpcodeTls(a);}
        op[1914] = getOpcodeRep((char)0, (char)1, 1915);
        op[1915] = getOpcodeRnm(30, 242); // WSP
        op[1916] = getOpcodeRnm(214, 1381); // commonExpr
        op[1917] = getOpcodeRep((char)0, (char)1, 1918);
        op[1918] = getOpcodeRnm(30, 242); // WSP
        {char[] a = {41}; op[1919] = getOpcodeTls(a);}
        {int[] a = {1921,1922,1924,1925,1927,1928,1930,1938}; op[1920] = getOpcodeCat(a);}
        {char[] a = {99,111,110,99,97,116}; op[1921] = getOpcodeTls(a);}
        op[1922] = getOpcodeRep((char)0, (char)1, 1923);
        op[1923] = getOpcodeRnm(30, 242); // WSP
        {char[] a = {40}; op[1924] = getOpcodeTls(a);}
        op[1925] = getOpcodeRep((char)0, (char)1, 1926);
        op[1926] = getOpcodeRnm(30, 242); // WSP
        op[1927] = getOpcodeRnm(214, 1381); // commonExpr
        op[1928] = getOpcodeRep((char)0, (char)1, 1929);
        op[1929] = getOpcodeRnm(30, 242); // WSP
        op[1930] = getOpcodeRep((char)0, (char)1, 1931);
        {int[] a = {1932,1933,1935,1936}; op[1931] = getOpcodeCat(a);}
        {char[] a = {44}; op[1932] = getOpcodeTls(a);}
        op[1933] = getOpcodeRep((char)0, (char)1, 1934);
        op[1934] = getOpcodeRnm(30, 242); // WSP
        op[1935] = getOpcodeRnm(214, 1381); // commonExpr
        op[1936] = getOpcodeRep((char)0, (char)1, 1937);
        op[1937] = getOpcodeRnm(30, 242); // WSP
        {char[] a = {41}; op[1938] = getOpcodeTls(a);}
        {int[] a = {1940,1941,1943,1944,1946,1947,1949}; op[1939] = getOpcodeCat(a);}
        {char[] a = {108,101,110,103,116,104}; op[1940] = getOpcodeTls(a);}
        op[1941] = getOpcodeRep((char)0, (char)1, 1942);
        op[1942] = getOpcodeRnm(30, 242); // WSP
        {char[] a = {40}; op[1943] = getOpcodeTls(a);}
        op[1944] = getOpcodeRep((char)0, (char)1, 1945);
        op[1945] = getOpcodeRnm(30, 242); // WSP
        op[1946] = getOpcodeRnm(214, 1381); // commonExpr
        op[1947] = getOpcodeRep((char)0, (char)1, 1948);
        op[1948] = getOpcodeRnm(30, 242); // WSP
        {char[] a = {41}; op[1949] = getOpcodeTls(a);}
        {int[] a = {1951,1952,1954,1955,1957,1958,1960}; op[1950] = getOpcodeCat(a);}
        {char[] a = {103,101,116,116,111,116,97,108,111,102,102,115,101,116,109,105,110,117,116,101,115}; op[1951] = getOpcodeTls(a);}
        op[1952] = getOpcodeRep((char)0, (char)1, 1953);
        op[1953] = getOpcodeRnm(30, 242); // WSP
        {char[] a = {40}; op[1954] = getOpcodeTls(a);}
        op[1955] = getOpcodeRep((char)0, (char)1, 1956);
        op[1956] = getOpcodeRnm(30, 242); // WSP
        op[1957] = getOpcodeRnm(214, 1381); // commonExpr
        op[1958] = getOpcodeRep((char)0, (char)1, 1959);
        op[1959] = getOpcodeRnm(30, 242); // WSP
        {char[] a = {41}; op[1960] = getOpcodeTls(a);}
        {int[] a = {1962,1963,1965,1966,1968,1969,1971}; op[1961] = getOpcodeCat(a);}
        {char[] a = {121,101,97,114}; op[1962] = getOpcodeTls(a);}
        op[1963] = getOpcodeRep((char)0, (char)1, 1964);
        op[1964] = getOpcodeRnm(30, 242); // WSP
        {char[] a = {40}; op[1965] = getOpcodeTls(a);}
        op[1966] = getOpcodeRep((char)0, (char)1, 1967);
        op[1967] = getOpcodeRnm(30, 242); // WSP
        op[1968] = getOpcodeRnm(214, 1381); // commonExpr
        op[1969] = getOpcodeRep((char)0, (char)1, 1970);
        op[1970] = getOpcodeRnm(30, 242); // WSP
        {char[] a = {41}; op[1971] = getOpcodeTls(a);}
        {int[] a = {1973,1974,1976,1977,1979,1980,1982}; op[1972] = getOpcodeCat(a);}
        {char[] a = {109,111,110,116,104}; op[1973] = getOpcodeTls(a);}
        op[1974] = getOpcodeRep((char)0, (char)1, 1975);
        op[1975] = getOpcodeRnm(30, 242); // WSP
        {char[] a = {40}; op[1976] = getOpcodeTls(a);}
        op[1977] = getOpcodeRep((char)0, (char)1, 1978);
        op[1978] = getOpcodeRnm(30, 242); // WSP
        op[1979] = getOpcodeRnm(214, 1381); // commonExpr
        op[1980] = getOpcodeRep((char)0, (char)1, 1981);
        op[1981] = getOpcodeRnm(30, 242); // WSP
        {char[] a = {41}; op[1982] = getOpcodeTls(a);}
        {int[] a = {1984,1985,1987,1988,1990,1991,1993}; op[1983] = getOpcodeCat(a);}
        {char[] a = {100,97,121}; op[1984] = getOpcodeTls(a);}
        op[1985] = getOpcodeRep((char)0, (char)1, 1986);
        op[1986] = getOpcodeRnm(30, 242); // WSP
        {char[] a = {40}; op[1987] = getOpcodeTls(a);}
        op[1988] = getOpcodeRep((char)0, (char)1, 1989);
        op[1989] = getOpcodeRnm(30, 242); // WSP
        op[1990] = getOpcodeRnm(214, 1381); // commonExpr
        op[1991] = getOpcodeRep((char)0, (char)1, 1992);
        op[1992] = getOpcodeRnm(30, 242); // WSP
        {char[] a = {41}; op[1993] = getOpcodeTls(a);}
        {int[] a = {1995,1996,1998,1999,2001,2002,2004}; op[1994] = getOpcodeCat(a);}
        {char[] a = {104,111,117,114}; op[1995] = getOpcodeTls(a);}
        op[1996] = getOpcodeRep((char)0, (char)1, 1997);
        op[1997] = getOpcodeRnm(30, 242); // WSP
        {char[] a = {40}; op[1998] = getOpcodeTls(a);}
        op[1999] = getOpcodeRep((char)0, (char)1, 2000);
        op[2000] = getOpcodeRnm(30, 242); // WSP
        op[2001] = getOpcodeRnm(214, 1381); // commonExpr
        op[2002] = getOpcodeRep((char)0, (char)1, 2003);
        op[2003] = getOpcodeRnm(30, 242); // WSP
        {char[] a = {41}; op[2004] = getOpcodeTls(a);}
        {int[] a = {2006,2007,2009,2010,2012,2013,2015}; op[2005] = getOpcodeCat(a);}
        {char[] a = {109,105,110,117,116,101}; op[2006] = getOpcodeTls(a);}
        op[2007] = getOpcodeRep((char)0, (char)1, 2008);
        op[2008] = getOpcodeRnm(30, 242); // WSP
        {char[] a = {40}; op[2009] = getOpcodeTls(a);}
        op[2010] = getOpcodeRep((char)0, (char)1, 2011);
        op[2011] = getOpcodeRnm(30, 242); // WSP
        op[2012] = getOpcodeRnm(214, 1381); // commonExpr
        op[2013] = getOpcodeRep((char)0, (char)1, 2014);
        op[2014] = getOpcodeRnm(30, 242); // WSP
        {char[] a = {41}; op[2015] = getOpcodeTls(a);}
        {int[] a = {2017,2018,2020,2021,2023,2024,2026}; op[2016] = getOpcodeCat(a);}
        {char[] a = {115,101,99,111,110,100}; op[2017] = getOpcodeTls(a);}
        op[2018] = getOpcodeRep((char)0, (char)1, 2019);
        op[2019] = getOpcodeRnm(30, 242); // WSP
        {char[] a = {40}; op[2020] = getOpcodeTls(a);}
        op[2021] = getOpcodeRep((char)0, (char)1, 2022);
        op[2022] = getOpcodeRnm(30, 242); // WSP
        op[2023] = getOpcodeRnm(214, 1381); // commonExpr
        op[2024] = getOpcodeRep((char)0, (char)1, 2025);
        op[2025] = getOpcodeRnm(30, 242); // WSP
        {char[] a = {41}; op[2026] = getOpcodeTls(a);}
        {int[] a = {2028,2029,2031,2032,2034,2035,2037}; op[2027] = getOpcodeCat(a);}
        {char[] a = {114,111,117,110,100}; op[2028] = getOpcodeTls(a);}
        op[2029] = getOpcodeRep((char)0, (char)1, 2030);
        op[2030] = getOpcodeRnm(30, 242); // WSP
        {char[] a = {40}; op[2031] = getOpcodeTls(a);}
        op[2032] = getOpcodeRep((char)0, (char)1, 2033);
        op[2033] = getOpcodeRnm(30, 242); // WSP
        op[2034] = getOpcodeRnm(214, 1381); // commonExpr
        op[2035] = getOpcodeRep((char)0, (char)1, 2036);
        op[2036] = getOpcodeRnm(30, 242); // WSP
        {char[] a = {41}; op[2037] = getOpcodeTls(a);}
        {int[] a = {2039,2040,2042,2043,2045,2046,2048}; op[2038] = getOpcodeCat(a);}
        {char[] a = {102,108,111,111,114}; op[2039] = getOpcodeTls(a);}
        op[2040] = getOpcodeRep((char)0, (char)1, 2041);
        op[2041] = getOpcodeRnm(30, 242); // WSP
        {char[] a = {40}; op[2042] = getOpcodeTls(a);}
        op[2043] = getOpcodeRep((char)0, (char)1, 2044);
        op[2044] = getOpcodeRnm(30, 242); // WSP
        op[2045] = getOpcodeRnm(214, 1381); // commonExpr
        op[2046] = getOpcodeRep((char)0, (char)1, 2047);
        op[2047] = getOpcodeRnm(30, 242); // WSP
        {char[] a = {41}; op[2048] = getOpcodeTls(a);}
        {int[] a = {2050,2051,2053,2054,2056,2057,2059}; op[2049] = getOpcodeCat(a);}
        {char[] a = {99,101,105,108,105,110,103}; op[2050] = getOpcodeTls(a);}
        op[2051] = getOpcodeRep((char)0, (char)1, 2052);
        op[2052] = getOpcodeRnm(30, 242); // WSP
        {char[] a = {40}; op[2053] = getOpcodeTls(a);}
        op[2054] = getOpcodeRep((char)0, (char)1, 2055);
        op[2055] = getOpcodeRnm(30, 242); // WSP
        op[2056] = getOpcodeRnm(214, 1381); // commonExpr
        op[2057] = getOpcodeRep((char)0, (char)1, 2058);
        op[2058] = getOpcodeRnm(30, 242); // WSP
        {char[] a = {41}; op[2059] = getOpcodeTls(a);}
        {int[] a = {2061,2062,2064,2065,2067,2068,2070,2071,2073,2074,2076}; op[2060] = getOpcodeCat(a);}
        {char[] a = {103,101,111,46,100,105,115,116,97,110,99,101}; op[2061] = getOpcodeTls(a);}
        op[2062] = getOpcodeRep((char)0, (char)1, 2063);
        op[2063] = getOpcodeRnm(30, 242); // WSP
        {char[] a = {40}; op[2064] = getOpcodeTls(a);}
        op[2065] = getOpcodeRep((char)0, (char)1, 2066);
        op[2066] = getOpcodeRnm(30, 242); // WSP
        op[2067] = getOpcodeRnm(214, 1381); // commonExpr
        op[2068] = getOpcodeRep((char)0, (char)1, 2069);
        op[2069] = getOpcodeRnm(30, 242); // WSP
        {char[] a = {44}; op[2070] = getOpcodeTls(a);}
        op[2071] = getOpcodeRep((char)0, (char)1, 2072);
        op[2072] = getOpcodeRnm(30, 242); // WSP
        op[2073] = getOpcodeRnm(214, 1381); // commonExpr
        op[2074] = getOpcodeRep((char)0, (char)1, 2075);
        op[2075] = getOpcodeRnm(30, 242); // WSP
        {char[] a = {41}; op[2076] = getOpcodeTls(a);}
        {int[] a = {2078,2079,2081,2082,2084,2085,2087}; op[2077] = getOpcodeCat(a);}
        {char[] a = {103,101,111,46,108,101,110,103,116,104}; op[2078] = getOpcodeTls(a);}
        op[2079] = getOpcodeRep((char)0, (char)1, 2080);
        op[2080] = getOpcodeRnm(30, 242); // WSP
        {char[] a = {40}; op[2081] = getOpcodeTls(a);}
        op[2082] = getOpcodeRep((char)0, (char)1, 2083);
        op[2083] = getOpcodeRnm(30, 242); // WSP
        op[2084] = getOpcodeRnm(214, 1381); // commonExpr
        op[2085] = getOpcodeRep((char)0, (char)1, 2086);
        op[2086] = getOpcodeRnm(30, 242); // WSP
        {char[] a = {41}; op[2087] = getOpcodeTls(a);}
        {int[] a = {2089,2090,2092,2093,2095,2096,2098,2099,2101,2102,2104}; op[2088] = getOpcodeCat(a);}
        {char[] a = {103,101,111,46,105,110,116,101,114,115,101,99,116,115}; op[2089] = getOpcodeTls(a);}
        op[2090] = getOpcodeRep((char)0, (char)1, 2091);
        op[2091] = getOpcodeRnm(30, 242); // WSP
        {char[] a = {40}; op[2092] = getOpcodeTls(a);}
        op[2093] = getOpcodeRep((char)0, (char)1, 2094);
        op[2094] = getOpcodeRnm(30, 242); // WSP
        op[2095] = getOpcodeRnm(214, 1381); // commonExpr
        op[2096] = getOpcodeRep((char)0, (char)1, 2097);
        op[2097] = getOpcodeRnm(30, 242); // WSP
        {char[] a = {44}; op[2098] = getOpcodeTls(a);}
        op[2099] = getOpcodeRep((char)0, (char)1, 2100);
        op[2100] = getOpcodeRnm(30, 242); // WSP
        op[2101] = getOpcodeRnm(214, 1381); // commonExpr
        op[2102] = getOpcodeRep((char)0, (char)1, 2103);
        op[2103] = getOpcodeRnm(30, 242); // WSP
        {char[] a = {41}; op[2104] = getOpcodeTls(a);}
        {char[] a = {123,84,79,68,79,50,53,125}; op[2105] = getOpcodeTls(a);}
        {char[] a = {123,84,79,68,79,50,54,125}; op[2106] = getOpcodeTls(a);}
        {char[] a = {123,84,79,68,79,50,55,125}; op[2107] = getOpcodeTls(a);}
        {char[] a = {123,84,79,68,79,50,56,125}; op[2108] = getOpcodeTls(a);}
        {char[] a = {123,84,79,68,79,51,48,125}; op[2109] = getOpcodeTls(a);}
        {char[] a = {123,84,79,68,79,51,50,125}; op[2110] = getOpcodeTls(a);}
        {char[] a = {123,84,79,68,79,51,53,125}; op[2111] = getOpcodeTls(a);}
        {char[] a = {123,84,79,68,79,52,53,125}; op[2112] = getOpcodeTls(a);}
        {char[] a = {123,84,79,68,79,52,57,125}; op[2113] = getOpcodeTls(a);}
        {char[] a = {123,84,79,68,79,53,49,125}; op[2114] = getOpcodeTls(a);}
        {char[] a = {123,84,79,68,79,53,51,125}; op[2115] = getOpcodeTls(a);}
        return op;
    }

    /** Displays the original SABNF grammar on the output device.
     * @param out the output device to display on.*/
    public static void display(PrintStream out){
        out.println(";");
        out.println("; OData.OData");
        out.println(";");
        out.println("; odata-v1.0-abnf ");
        out.println("");
        out.println("odataUri = scheme \"://\" host [ \":\" port ] serviceRoot [ \"$metadata\" / \"$batch\" / odataRelativeUri ]  ");
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
        out.println(";             / sopParameterNameAndValue  ");
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
        out.println("; TODO: names are case-sensitive");
        out.println("; TODO: whitespace around \"=\" (use EQ instead?)");
        out.println("expand       = \"$expand=\" expandClause ");
        out.println("expandClause = expandItem *( \",\" expandItem )");
        out.println("expandItem   =        [ qualifiedEntityTypeName \"/\" ] navigationProperty ");
        out.println("               *( \"/\" [ qualifiedEntityTypeName \"/\" ] navigationProperty ) ");
        out.println("");
        out.println("filter = \"$filter\" *WSP \"=\" *WSP boolCommonExpr");
        out.println("        ");
        out.println("orderby = \"$orderby\" *WSP \"=\" *WSP orderExpr [ 1*WSP ( \"asc\" / \"desc\" ) ]    ; TODO: really case-insensitive aSc and dEsC? Currently not");
        out.println("                     *( COMMA *WSP orderExpr [ 1*WSP ( \"asc\" / \"desc\" ) ] )");
        out.println("orderExpr =  primitiveKeyProperty / primitiveNonKeyProperty      ; TODO: originally commonExpr                                                                 ");
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
        out.println("             / [ qualifiedEntityTypeName \"/\" ] ");
        out.println("               ( ( navigationProperty [ \"/\" selectItem ] ) ");
        out.println("               / propertyName  ; TODO: also allow properties of complex properties");
        out.println("               / allOperationsInContainer ");
        out.println("               / qualifiedActionName  ");
        out.println("               / qualifiedFunctionName  ");
        out.println("               )");
        out.println("allOperationsInContainer = operationQualifier \"*\"                  ");
        out.println("operationQualifier       = [ namespace \".\" ] entityContainerName \".\"");
        out.println("");
        out.println("skiptoken = \"$skiptoken=\" 1*pchar ; TODO: minus \"&\" - use customValue?");
        out.println("");
        out.println("customQueryOption  = customName *WSP [ \"=\" *WSP customValue ]");
        out.println("; TODO: can this be expressed in terms of pchar, reserved etc.?");
        out.println("customName         =  ( unreserved / pct-encoded / \":\" / \"@\" / \"!\" /       \"'\" / \"(\" / \")\" / \"*\" / \"+\" / \",\" / \";\" ) ");
        out.println("                     *( unreserved / pct-encoded / \":\" / \"@\" / \"!\" / \"$\" / \"'\" / \"(\" / \")\" / \"*\" / \"+\" / \",\" / \";\" )                 ");
        out.println("                     ; MUST not start with '$'");
        out.println("customValue        = *( unreserved / pct-encoded / \":\" / \"@\" / \"!\" / \"$\" / \"'\" / \"(\" / \")\" / \"*\" / \"+\" / \",\" / \";\" / \"=\" )");
        out.println("");
        out.println("; ABNF core definitions [RFC5234]");
        out.println("ALPHA = %x41-5A / %x61-7A ");
        out.println("DIGIT = %x30-39 ");
        out.println("HEXDIG = DIGIT / \"A\" / \"B\" / \"C\" / \"D\" / \"E\" / \"F\" ");
        out.println(";DQUOTE = %x22");
        out.println("SP = %x20 ");
        out.println("HTAB = %x09 ");
        out.println("WSP = SP / HTAB ");
        out.println(";LWSP = *(WSP / CRLF WSP) ");
        out.println(";VCHAR = %x21-7E ");
        out.println(";CHAR = %x01-7F");
        out.println(";LOCTET = %x00-FF ");
        out.println(";CTL = %x00-1F / %x7F ");
        out.println("CR = %x0D ");
        out.println("LF = %x0A ");
        out.println("CRLF = CR LF");
        out.println(";BIT = \"0\" / \"1\" ");
        out.println("");
        out.println("; TODO: remove rules not necessary in OData context");
        out.println(";URI syntax [RFC3986]");
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
        out.println("scheme        = ALPHA *( ALPHA / DIGIT / \"+\" / \"-\" / \".\" ) ; TODO: restrict to http[s]?");
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
        out.println("sub-delims    = \"!\" / \"$\" / \"&\" / \"'\" / \"(\" / \")\"");
        out.println("                 / \"*\" / \"+\" / \",\" / \";\" / \"=\"");
        out.println("");
        out.println("; UTF-8 syntax [RFC3629]");
        out.println(";UTF8-octets = *( UTF8-char )");
        out.println("UTF8-char   = UTF8-1 / UTF8-2 / UTF8-3 / UTF8-4");
        out.println("UTF8-1      = %x00-7F");
        out.println("UTF8-2      = %xC2-DF UTF8-tail");
        out.println("UTF8-3      = %xE0 %xA0-BF UTF8-tail / %xE1-EC 2( UTF8-tail ) /");
        out.println("              %xED %x80-9F UTF8-tail / %xEE-EF 2( UTF8-tail )");
        out.println("UTF8-4      = %xF0 %x90-BF 2( UTF8-tail ) / %xF1-F3 3( UTF8-tail ) /");
        out.println("              %xF4 %x80-8F 2( UTF8-tail )");
        out.println("UTF8-tail   = %x80-BF");
        out.println("");
        out.println("; Punctuation");
        out.println("SQUOTE = %x27              ");
        out.println(";EQ = %x3D              ");
        out.println(";SEMI = %x3B              ");
        out.println("COMMA = %x2C");
        out.println("sign = \"+\" / \"-\"");
        out.println("begin-object = \"{\"");
        out.println("end-object = \"}\"");
        out.println("value-separator = COMMA");
        out.println("name-separator = \":\"");
        out.println("star = \"*\"");
        out.println("");
        out.println("; Unrepresentable numeric values");
        out.println("; TODO: exact case required --> hex values");
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
        out.println("                 / geography ");
        out.println("                 / geographyCollection ");
        out.println("                 / geographyLineString ");
        out.println("                 / geographyMultiLineString ");
        out.println("                 / geographyMultiPoint ");
        out.println("                 / geographyMultiPolygon ");
        out.println("                 / geographyPoint ");
        out.println("                 / geographyPolygon ");
        out.println("                 / geometry ");
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
        out.println("decimal = decimalBody [ \"M\" ]");
        out.println("decimalBody = [sign] 1*DIGIT [\".\" 1*DIGIT]");
        out.println("            ; / [sign] \".\" 1*DIGIT ;TODO: allow also this pattern?");
        out.println("doubleBody = decimalBody [ \"E\" [sign] 1*DIGIT ] ; TODO: restrict range");
        out.println("           / nanInfinity");
        out.println("double = doubleBody [ \"D\" ]");
        out.println("singleBody = decimalBody [ \"E\" [sign] 1*DIGIT ] ; TODO: restrict range");
        out.println("           / nanInfinity");
        out.println("single = singleBody [ \"F\" ]");
        out.println("");
        out.println("guid = \"guid\" SQUOTE 8HEXDIG \"-\" 4HEXDIG \"-\" 4HEXDIG \"-\" 4HEXDIG \"-\" 12HEXDIG SQUOTE");
        out.println("");
        out.println("byte  = 1*3DIGIT ; numbers in the range from 0 to 255");
        out.println("sbyte = [ sign ] 1*3DIGIT ; numbers in the range from -128 to 127");
        out.println("int16 = [ sign ] 1*5DIGIT ; numbers in the range from -32768 to 32767        ");
        out.println("int32 = [ sign ] 1*10DIGIT ; numbers in the range from -2147483648 to 2147483647");
        out.println("int64 = [ sign ] 1*19DIGIT [ \"L\" ] ; numbers in the range from -9223372036854775808 to 9223372036854775807");
        out.println("");
        out.println("string           = SQUOTE *( unreserved / pct-encoded / SQUOTE-in-string ) SQUOTE ; TODO; was SQUOTE *UTF8-char SQUOTE, but that's not sufficient for use in URLs");
        out.println("SQUOTE-in-string = SQUOTE SQUOTE ; two quotes represent one within string literal in quotes");
        out.println("");
        out.println("time = \"time\" SQUOTE [ sign ] \"P\" [ 1*DIGIT \"Y\" ] [ 1*DIGIT \"M\" ] [ 1*DIGIT \"D\" ] [ \"T\" [ 1*DIGIT \"H\" ] [ 1*DIGIT \"M\" ] [ 1*DIGIT [ \".\" 1*DIGIT ] \"S\" ] ] SQUOTE");
        out.println("     ; the above is an approximation of the rules for an xml duration.");
        out.println("     ; see the lexical representation for duration in http://www.w3.org/TR/xmlschema-2 for more information");
        out.println(" ");
        out.println("geography                = \"{TODO1}\"       ; Format specific");
        out.println("geographyCollection      = \"{TODO2}\"       ; Format specific");
        out.println("geographyLineString      = \"{TODO3}\"       ; Format specific");
        out.println("geographyMultiLineString = \"{TODO4}\"       ; Format specific");
        out.println("geographyMultiPoint      = \"{TODO5}\"       ; Format specific");
        out.println("geographyMultiPolygon    = \"{TODO6}\"       ; Format specific");
        out.println("geographyPoint           = \"{TODO7}\"       ; Format specific");
        out.println("geographyPolygon         = \"{TODO8}\"       ; Format specific");
        out.println("geometry                 = \"{TODO9}\"       ; Format specific");
        out.println("geometryCollection      = \"{TODO10}\"       ; Format specific");
        out.println("geometryLineString      = \"{TODO11}\"       ; Format specific");
        out.println("geometryMultiLineString = \"{TODO12}\"       ; Format specific");
        out.println("geometryMultiPoint      = \"{TODO13}\"       ; Format specific");
        out.println("geometryMultiPolygon    = \"{TODO14}\"       ; Format specific");
        out.println("geometryPoint           = \"{TODO15}\"       ; Format specific");
        out.println("geometryPolygon         = \"{TODO16}\"       ; Format specific");
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
        out.println("                             / concreteSpatialTypeName ");
        out.println("                             / abstractSpatialTypeName");
        out.println("                             )");
        out.println("concreteSpatialTypeName = \"point\" ");
        out.println("                        / \"linestring\" ");
        out.println("                        / \"polygon\" ");
        out.println("                        / \"geographycollection\" ");
        out.println("                        / \"multipoint\" ");
        out.println("                        / \"multilinestring\" ");
        out.println("                        / \"multipolygon\" ");
        out.println("                        / \"geometricpoint\" ");
        out.println("                        / \"geometriclinestring\" ");
        out.println("                        / \"geometricpolygon\" ");
        out.println("                        / \"geometrycollection\" ");
        out.println("                        / \"geometricmultipoint\" ");
        out.println("                        / \"geometricmultilinestring\" ");
        out.println("                        / \"geometricmultipolygon\" ");
        out.println("abstractSpatialTypeName = \"geography\" / \"geometry\"      ");
        out.println("");
        out.println("primitiveKeyProperty    = odataIdentifier");
        out.println("primitiveNonKeyProperty = odataIdentifier");
        out.println("primitiveColProperty    = odataIdentifier");
        out.println("complexProperty         = odataIdentifier");
        out.println("complexColProperty      = odataIdentifier");
        out.println("streamProperty          = odataIdentifier");
        out.println("");
        out.println("propertyName = primitiveKeyProperty  ");
        out.println("             / primitiveNonKeyProperty ");
        out.println("             / primitiveColProperty ");
        out.println("             / complexProperty ");
        out.println("             / complexColProperty ");
        out.println("             / streamProperty");
        out.println("");
        out.println("entityContainerName = odataIdentifier");
        out.println("");
        out.println(";serviceOperation = entityServiceOp  ");
        out.println(";                 / entityColServiceOp ");
        out.println(";                 / complexServiceOp  ");
        out.println(";                 / complexColServiceOp ");
        out.println(";                 / primitiveServiceOp ");
        out.println(";                 / primitiveColServiceOp ");
        out.println(";entityServiceOp = odataIdentifier        ");
        out.println(";entityColServiceOp = odataIdentifier        ");
        out.println(";complexServiceOp = odataIdentifier        ");
        out.println(";complexColServiceOp = odataIdentifier        ");
        out.println(";primitiveServiceOp = odataIdentifier        ");
        out.println(";primitiveColServiceOp = odataIdentifier");
        out.println("");
        out.println("entityNavigationProperty    = odataIdentifier");
        out.println("entityColNavigationProperty = odataIdentifier");
        out.println("navigationProperty = entityNavigationProperty / entityColNavigationProperty  ");
        out.println("");
        out.println("entityFunction = odataIdentifier");
        out.println("entityColFunction = odataIdentifier");
        out.println("complexFunction = odataIdentifier");
        out.println("complexColFunction = odataIdentifier");
        out.println("primitiveFunction = odataIdentifier");
        out.println("primitiveColFunction = odataIdentifier");
        out.println(";function = entityFunction / ");
        out.println("; entityColFunction /");
        out.println("; complexFunction / ");
        out.println("; complexColFunction /");
        out.println("; primitiveFunction /");
        out.println("; primitiveColFunction");
        out.println("fullEntityFunction = [ operationQualifier ] entityFunction");
        out.println("fullEntityColFunction = [ operationQualifier ] entityColFunction");
        out.println("fullComplexFunction = [ operationQualifier ] complexFunction");
        out.println("fullComplexColFunction = [ operationQualifier ] complexColFunction");
        out.println("fullPrimitiveFunction = [ operationQualifier ] primitiveFunction");
        out.println("fullPrimitiveColFunction = [ operationQualifier ] primitiveColFunction");
        out.println("fullFunction = fullEntityFunction / ");
        out.println(" fullEntityColFunction /");
        out.println(" fullComplexFunction / ");
        out.println(" fullComplexColFunction /");
        out.println(" fullPrimitiveFunction /");
        out.println(" fullPrimitiveColFunction            ");
        out.println("entityAction = odataIdentifier");
        out.println("entityColAction = odataIdentifier");
        out.println("complexAction = odataIdentifier");
        out.println("complexColAction = odataIdentifier");
        out.println("primitiveAction = odataIdentifier");
        out.println("primitiveColAction = odataIdentifier");
        out.println("voidAction = odataIdentifier");
        out.println("action = entityAction ");
        out.println("         / entityColAction ");
        out.println("         / complexAction ");
        out.println("         / complexColAction ");
        out.println("         / primitiveAction ");
        out.println("         / primitiveColAction ");
        out.println("         / voidAction");
        out.println("fullAction = [ operationQualifier ] action");
        out.println(";boundAction = fullAction");
        out.println("qualifiedActionName = fullAction [ \"(\" parameterTypeNames \")\" ]");
        out.println("qualifiedFunctionName = fullFunction [ \"(\" parameterTypeNames \")\" ]");
        out.println("                                                ; the parameterTypeNames are required to uniquely identify the Function");
        out.println("                                                ; only if the Function in question has overloads.");
        out.println("parameterTypeNames = [ parameterTypeName *( \",\" parameterTypeName ) ]");
        out.println("                                                ; the types of all the parameters to the corresponding functionImport ");
        out.println("                                                ; in the order they are declared in the function import");
        out.println("parameterTypeName = qualifiedTypeName ");
        out.println("        ");
        out.println("resourcePath = [ entityContainerName \".\" ] entitySetName [count / collectionNavigation / keyPredicate [ singleNavigation ] ] ");
        out.println("             / entityColFunctionCall [ collectionNavigation ] ");
        out.println("             / entityFunctionCall [ singleNavigation ] ");
        out.println("             / complexColFunctionCall [ boundOperation ] ");
        out.println("             / complexFunctionCall [ boundOperation / complexPropertyPath ] ");
        out.println("             / primitiveColFunctionCall [ boundOperation ] ");
        out.println("             / primitiveFunctionCall [ boundOperation / value ] ");
        out.println("             / actionCall ");
        out.println("");
        out.println("count = \"/$count\" ");
        out.println("");
        out.println("collectionNavigation        =       [ \"/\" qualifiedEntityTypeName ] \"/\"");
        out.println("                                                                        (");
        out.println("                                                                                boundEntityFuncCall [ singleNavigation ] /");
        out.println("                                                                                boundEntityColFuncCall [ collectionNavigation ] /");
        out.println("                                                                                boundPrimitiveFuncCall [ boundOperation / value ] /");
        out.println("                                                                                boundPrimitiveColFuncCall [ boundOperation ] /");
        out.println("                                                                                boundComplexFuncCall [ complexPropertyPath / boundOperation ] /");
        out.println("                                                                                boundComplexColFuncCall [ boundOperation ] /");
        out.println("                                                                                boundActionCall");
        out.println("                                                                        )");
        out.println("");
        out.println("singleNavigation                        =    [ \"/\" qualifiedEntityTypeName ] ");
        out.println("                                             ( ");
        out.println("                                               \"/\" ( ");
        out.println("                                                     ( \"$links/\" navigationProperty ) / ");
        out.println("                                                     ( entityNavigationProperty [ singleNavigation ] ) /");
        out.println("                                                     ( entityColNavigationProperty [ collectionNavigation / keyPredicate [ singleNavigation ] ] )");
        out.println("                                                   ) /");
        out.println("                                                     primitivePropertyPath / ");
        out.println("                                                     complexPropertyPath /");
        out.println("                                                     collectionPropertyPath / ");
        out.println("                                                     streamPropertyPath ");
        out.println("                                             / value  ; TODO: this doesn't make sense if singleNavigation means \"everything after having reached a single entity");
        out.println("                                             / boundOperation ");
        out.println("                                             )");
        out.println("                                                                    ");
        out.println("boundOperation              =       [ \"/\" qualifiedEntityTypeName ] ");
        out.println("                                                                        \"/\" ");
        out.println("                                                                        (");
        out.println("                                                                                boundEntityColFuncCall [ singleNavigation ] /");
        out.println("                                                                                boundEntityFuncCall [ collectionNavigation ] /");
        out.println("                                                                                boundPrimitiveFuncCall [ boundOperation / value ] /");
        out.println("                                                                                boundPrimitiveColFuncCall [ boundOperation ] /");
        out.println("                                                                                boundComplexFuncCall [ complexPropertyPath / boundOperation ] /");
        out.println("                                                                                boundComplexColFuncCall [ boundOperation ] /");
        out.println("                                                                                boundActionCall  ");
        out.println("                                                                        )");
        out.println("                                    ; boundOperation segments can only be composed if the type of the previous segment matches ");
        out.println("                                    ; the type of the first parameter of the action or function being called.");
        out.println("                                                                        ; NOTE: the qualifiedEntityTypeName is only permitted if the previous segment is an entity or collection of entities.");
        out.println("");
        out.println("primitivePropertyPath       =       [ \"/\" qualifiedEntityTypeName ] \"/\" ( primitiveKeyProperty / primitiveNonKeyProperty ) [ value ]");
        out.println("    ");
        out.println("complexPropertyPath         =       [ \"/\" qualifiedEntityTypeName ] \"/\" complexProperty ");
        out.println("                                                                        [ ");
        out.println("                                                                                primitivePropertyPath / ");
        out.println("                                                                                complexPropertyPath /");
        out.println("                                                                                collectionPropertyPath /");
        out.println("                                                                                boundOperation");
        out.println("                                                                        ] ");
        out.println("");
        out.println("collectionPropertyPath          =       [ \"/\" qualifiedEntityTypeName ] \"/\" ( primitiveColProperty / complexColProperty ) [ boundOperation ]");
        out.println("");
        out.println("streamPropertyPath                  =       [ \"/\" qualifiedEntityTypeName ] \"/\" streamProperty");
        out.println("");
        out.println("value                       =       \"/$value\"");
        out.println("");
        out.println("keyPredicate                       =       simpleKey / compoundKey");
        out.println("");
        out.println("simpleKey                                       =       \"(\" primitiveLiteral \")\"");
        out.println("");
        out.println("compoundKey                             =       \"(\" keyValuePair *(\",\" keyValuePair) \")\"");
        out.println("");
        out.println("keyValuePair                                =       primitiveKeyProperty \"=\" keyPropertyValue");
        out.println("");
        out.println("keyPropertyValue                        =       primitiveLiteral");
        out.println("");
        out.println("actionCall                                      =       [ operationQualifier ] action [ \"()\" ]");
        out.println("");
        out.println("boundActionCall                         =       [ operationQualifier ] action [ \"()\" ]");
        out.println("                                                                        ; with the added restriction that the binding parameter MUST be either an entity or collection of entities");
        out.println("                                    ; and is specified by reference using the URL immediately preceding (to the left) of the boundActionCall");
        out.println("");
        out.println("entityFunctionCall                      =       fullEntityFunction functionParameters");
        out.println("");
        out.println("entityColFunctionCall           =       fullEntityColFunction functionParameters");
        out.println("");
        out.println("complexFunctionCall                     =       fullComplexFunction functionParameters");
        out.println("");
        out.println("complexColFunctionCall          =       fullComplexColFunction functionParameters");
        out.println("");
        out.println("primitiveFunctionCall           =       fullPrimitiveFunction functionParameters");
        out.println("");
        out.println("primitiveColFunctionCall        =       fullPrimitiveColFunction functionParameters");
        out.println("");
        out.println("functionCall                            =       entityFunctionCall / ");
        out.println("                                                                        entityColFunctionCall /");
        out.println("                                                                        complexFunctionCall / ");
        out.println("                                                                        complexColFunctionCall /");
        out.println("                                                                        primitiveFunctionCall /");
        out.println("                                                                        primitiveColFunctionCall");
        out.println("");
        out.println("boundEntityFuncCall                     =       fullEntityFunction functionParameters");
        out.println("                                                                        ; with the added restrictions that the Function MUST support binding, and the binding parameter type ");
        out.println("                                                                        ; MUST match the type of resource identified by Uri immediately preceding (to the left) of the boundEntityFuncCall");
        out.println("                                                                        ; and the functionParameters MUST NOT include the bindingParameter.");
        out.println("");
        out.println("boundEntityColFuncCall          =       fullEntityColFunction functionParameters");
        out.println("                                                                        ; with the added restrictions that the Function MUST support binding, and the binding parameter type ");
        out.println("                                                                        ; MUST match the type of resource identified by Uri immediately preceding (to the left) of the boundEntityColFuncCall");
        out.println("                                                                        ; and the functionParameters MUST NOT include the bindingParameter.");
        out.println("");
        out.println("boundComplexFuncCall            =       fullComplexFunction functionParameters");
        out.println("                                                                        ; with the added restrictions that the Function MUST support binding, and the binding parameter type ");
        out.println("                                                                        ; MUST match the type of resource identified by Uri immediately preceding (to the left) of the boundComplexFuncCall");
        out.println("                                                                        ; and the functionParameters MUST NOT include the bindingParameter.");
        out.println("");
        out.println("boundComplexColFuncCall         =       fullComplexColFunction functionParameters");
        out.println("                                                                        ; with the added restrictions that the Function MUST support binding, and the binding parameter type ");
        out.println("                                                                        ; MUST match the type of resource identified by Uri immediately preceding (to the left) of the boundComplexColFuncCall");
        out.println("                                                                        ; and the functionParameters MUST NOT include the bindingParameter.");
        out.println("");
        out.println("boundPrimitiveFuncCall          =       fullPrimitiveFunction functionParameters");
        out.println("                                                                        ; with the added restrictions that the Function MUST support binding, and the binding parameter type ");
        out.println("                                                                        ; MUST match the type of resource identified by Uri immediately preceding (to the left) of the boundPrimitiveFuncCall");
        out.println("                                                                        ; and the functionParameters MUST NOT include the bindingParameter.");
        out.println("");
        out.println("boundPrimitiveColFuncCall       =       fullPrimitiveColFunction functionParameters");
        out.println("                                                                        ; with the added restrictions that the Function MUST support binding, and the binding parameter type ");
        out.println("                                                                        ; MUST match the type of resource identified by Uri immediately preceding (to the left) of the boundPrimitiveColFuncCall");
        out.println("                                                                        ; and the functionParameters MUST NOT include the bindingParameter.");
        out.println("");
        out.println(";boundFunctionCall = boundEntityFuncCall / ");
        out.println(";                    boundEntityColFuncCall /");
        out.println(";                    boundComplexFuncCall / ");
        out.println(";                    boundComplexColFuncCall /");
        out.println(";                    boundPrimitiveFuncCall /");
        out.println(";                    boundPrimitiveColFuncCall");
        out.println("");
        out.println("functionParameters      = \"(\" [ functionParameter *( \",\" functionParameter ) ] \")\"");
        out.println("functionParameter       = functionParameterName \"=\" ( primitiveParameterValue / parameterAlias )");
        out.println("functionParameterName   = odataIdentifier;");
        out.println("primitiveParameterValue = primitiveLiteral");
        out.println("parameterAlias          = \"@\" odataIdentifier ; TODO: was *pchar, which is definitely too relaxed: at least one, and no \")\"");
        out.println("");
        out.println("aliasAndValue = parameterAlias \"=\" parameterValue");
        out.println("");
        out.println("parameterNameAndValue = functionParameterName \"=\" parameterValue");
        out.println("");
        out.println(";primitivePropInJSONLight        = \"{TODO19}\"       ; arlo JSON Light format");
        out.println("                                                                        ; unreferenced until complexInJSONLight is defined.");
        out.println("");
        out.println("primitivePropertyInVJSON        =       quotation-mark ( primitiveKeyProperty / primitiveNonKeyProperty ) quotation-mark name-separator primitiveLiteralInVJSON");
        out.println("");
        out.println(";complexPropertyInJSON           =       complexPropertyInVJSON / complexPropertyInJSONLight");
        out.println("");
        out.println("complexPropertyInVJSON          =       quotation-mark complexProperty quotation-mark name-separator complexInVJSON");
        out.println("");
        out.println(";complexPropertyInJSONLight      = \"{TODO20}\"       ; arlo JSON Light format.");
        out.println("");
        out.println(";collectionPropertyInJSON        =       colPropertyInJSONLight / collectionPropertyInVJSON");
        out.println("");
        out.println("collectionPropertyInVJSON       =       ( quotation-mark primitiveColProperty quotation-mark name-separator \"[\" [ primitiveVJSONLiteral *( COMMA primitiveLiteralInVJSON ) ] \"]\" ) /");
        out.println("                                                                        ( quotation-mark complexColProperty quotation-mark name-separator \"[\" [ complexInVJSON *( COMMA complexInVJSON ) ] \"]\" )");
        out.println("                ");
        out.println(";colPropertyInJSONLight          = \"{TODO21}\"       ; alro JSON Light format");
        out.println("");
        out.println("primitiveLiteralInVJSON         = \"{TODO22}\"       ; arlo VJSON format.");
        out.println("");
        out.println(";primitiveLiteralInJSONLight     = \"{TODO23}\"       ; arlo JSON Light format.");
        out.println("                                                        ");
        out.println("complexTypeMetadataInVJSON      =       quotation-mark \"__metadata\" quotation-mark");
        out.println("                                                        name-separator");
        out.println("                                                        begin-object");
        out.println("                                                        [typeNVPInVJSON]");
        out.println("                                                        end-object");
        out.println("");
        out.println("typeNVPInVJSON                          =       quotation-mark \"type\" quotation-mark");
        out.println("                                                name-separator");
        out.println("                                                quotation-mark qualifiedTypeName quotation-mark");
        out.println("");
        out.println("parameterValue                          =       primitiveLiteral /                                              ; note this is a Uri literal not a JSON literal");
        out.println("                                                                        complexTypeInJSON / ");
        out.println("                                                                        primitiveColInJSON /");
        out.println("                                                                        complexColInJSON");
        out.println("");
        out.println(";complexInJSON                           =       complexInVJSON / complexInJSONLight");
        out.println("");
        out.println(";complexInJSONLight                      = \"{TODO24}\"       ; arlo JSON light format");
        out.println("");
        out.println("complexInVJSON                          =       begin-object");
        out.println("                                                        [");
        out.println("                                                        (");
        out.println("                                                                complexTypeMetadataInVJSON / ");
        out.println("                                                                                        primitivePropertyInVJSON /");
        out.println("                                                                                        complexPropertyInVJSON /");
        out.println("                                                                                        collectionPropertyInVJSON  ");
        out.println("                                                            )");
        out.println("                                                            *( ");
        out.println("                                                                value-separator ");
        out.println("                                                                                        ( ");
        out.println("                                                                                                primitivePropertyInVJSON /");
        out.println("                                                                                                complexPropertyInVJSON /");
        out.println("                                                                                                collectionPropertyInVJSON  ");
        out.println("                                                                                        ) ");
        out.println("                                                            )");
        out.println("                                                        ]  ");
        out.println("                                                                        end-object");
        out.println("");
        out.println("");
        out.println(";entityServiceOpCall                     =       [ operationQualifier ] entityServiceOp [ \"()\" ]");
        out.println(";entityColServiceOpCall          =       [ operationQualifier ] entityColServiceOp [ \"()\" ]");
        out.println(";complexServiceOpCall            =       [ operationQualifier ] complexServiceOp [ \"()\" ]");
        out.println(";complexColServiceOpCall         =       [ operationQualifier ] complexColServiceOp [ \"()\" ]");
        out.println(";primitiveServiceOpCall          =       [ operationQualifier ] primitiveServiceOp [ \"()\" ]");
        out.println(";primitiveColServiceOpCall       =       [ operationQualifier ] primitiveServiceOp [ \"()\" ]");
        out.println("");
        out.println(";serviceOperationCall            =       entityServiceOpCall / ");
        out.println(";                                                                        entityColServiceOpCall /");
        out.println(";                                                                        complexServiceOpCall / ");
        out.println(";                                                                        complexColServiceOpCall /");
        out.println(";                                                                        primitiveServiceOpCall /");
        out.println(";                                                                        primitiveColServiceOpCall ");
        out.println("");
        out.println(";serviceOpParameterName          =       odataIdentifier;");
        out.println("                                                                        ; identifies by name a parameter to a ServiceOperation");
        out.println("        ");
        out.println(";sopParameterNameAndValue        =       serviceOpParameterName \"=\" primitiveParameterValue");
        out.println("                                                                        ; when a serviceOperation Parameter is omitted the parameter value MUST be assumed to be null           ");
        out.println("    ");
        out.println("commonExpr = [ WSP ] (");
        out.println(" boolCommonExpr / ");
        out.println(" methodCallExpr /");
        out.println(" parenExpr / ");
        out.println(" literalExpr / ");
        out.println(" addExpr /");
        out.println(" subExpr / ");
        out.println(" mulExpr / ");
        out.println(" divExpr /");
        out.println(" modExpr /  ");
        out.println(" negateExpr / ");
        out.println(" memberExpr / ");
        out.println(" firstMemberExpr / ");
        out.println(" castExpr / ");
        out.println(" functionCall ");
        out.println(" ) [ WSP ]");
        out.println("");
        out.println("boolCommonExpr                          =       [ WSP ] (");
        out.println("                                                                                boolLiteralExpr / ");
        out.println("                                                                                andExpr /");
        out.println("                                                                orExpr /");
        out.println("                                                                boolPrimitiveMemberExpr / ");
        out.println("                                                                                eqExpr / ");
        out.println("                                                                                neExpr /");
        out.println("                                                                ltExpr / ");
        out.println("                                                                                leExpr / ");
        out.println("                                                                                gtExpr /");
        out.println("                                                                geExpr / ");
        out.println("                                                                                notExpr / ");
        out.println("                                                                                isofExpr /");
        out.println("                                                                boolCastExpr / ");
        out.println("                                                                                boolMethodCallExpr  /");
        out.println("                                                                firstBoolPrimitiveMemExpr / ");
        out.println("                                                                                boolParenExpr /");
        out.println("                                                                boolFunctionCallExpr");
        out.println("                                                                        ) [ WSP ]");
        out.println("");
        out.println("boolLiteralExpr                         =   boolean");
        out.println("");
        out.println("literalExpr                                     =       primitiveLiteral");
        out.println("");
        out.println("parenExpr                                       =       \"(\" [ WSP ] commonExpr [ WSP ] \")\"");
        out.println("");
        out.println("boolParenExpr                           =       \"(\" [ WSP ] boolCommonExpr [ WSP ] \")\"");
        out.println("");
        out.println("andExpr                                         =       boolCommonExpr WSP \"and\" WSP boolCommonExpr");
        out.println("");
        out.println("orExpr                                          =       boolCommonExpr WSP \"or\" WSP boolCommonExpr");
        out.println("");
        out.println("eqExpr                                  =       commonExpr WSP \"eq\" WSP commonExpr      ");
        out.println("");
        out.println("neExpr                                  =       commonExpr WSP \"ne\" WSP commonExpr");
        out.println("");
        out.println("ltExpr                                  =       commonExpr WSP \"lt\" WSP commonExpr");
        out.println("");
        out.println("leExpr                                  =       commonExpr WSP \"le\" WSP commonExpr");
        out.println("");
        out.println("gtExpr                                  =       commonExpr WSP \"gt\" WSP commonExpr");
        out.println("");
        out.println("geExpr                                  =       commonExpr WSP \"ge\" WSP commonExpr");
        out.println("");
        out.println("addExpr                                 =       commonExpr WSP \"add\" WSP commonExpr");
        out.println("");
        out.println("subExpr                                 =       commonExpr WSP \"sub\" WSP commonExpr");
        out.println("");
        out.println("mulExpr                                 =       commonExpr WSP \"mul\" WSP commonExpr");
        out.println("");
        out.println("divExpr                                 =       commonExpr WSP \"div\" WSP commonExpr");
        out.println("");
        out.println("modExpr                                 =       commonExpr WSP \"mod\" WSP commonExpr");
        out.println("");
        out.println("negateExpr                              =       \"-\" [ WSP ] commonExpr");
        out.println("");
        out.println("notExpr                                 =       \"not\" WSP commonExpr");
        out.println("");
        out.println("isofExpr                                =       \"isof\" [ WSP ] \"(\" [ [ WSP ] commonExpr [ WSP ] \",\" ] [ WSP ] qualifiedTypeName [ WSP ] \")\"");
        out.println("");
        out.println("castExpr                                =       \"cast\" [ WSP ] \"(\" [ [ WSP ] commonExpr [ WSP ] \",\" ] [ WSP ] qualifiedTypeName [ WSP ] \")\"");
        out.println("");
        out.println("boolCastExpr                            =       \"cast\" [ WSP ] \"(\" [ [ WSP ] commonExpr [ WSP ] \",\" ] [ WSP ] \"Edm.Boolean\" [ WSP ] \")\"");
        out.println("");
        out.println("firstMemberExpr = [ WSP ] [ qualifiedEntityTypeName \"/\"]");
        out.println("                  [ lambdaPredicatePrefixExpr ] ; A lambdaPredicatePrefixExpr is only defined inside a ");
        out.println("                                                ; lambdaPredicateExpr. A lambdaPredicateExpr is required   ");
        out.println("                                                ; inside a lambdaPredicateExpr.");
        out.println("                  entityColNavigationProperty [ collectionNavigationExpr ] /");
        out.println("                  entityNavigationProperty [ singleNavigationExpr ] /");
        out.println("                  primitivePropertyPath / ");
        out.println("                  complexPropertyPath /");
        out.println("                  collectionPropertyPath [ anyExpr / allExpr ]");
        out.println("");
        out.println("firstBoolPrimitiveMemExpr = [ qualifiedEntityTypeName \"/\"] entityProperty");
        out.println("");
        out.println("boolPrimitiveMemberExpr = commonExpr [ WSP ]  \"/\" [WSP] [ qualifiedEntityTypeName \"/\" ] primitivePropertyPath");
        out.println("");
        out.println("memberExpr = commonExpr [ WSP ]  \"/\" [ WSP ] [ qualifiedEntityTypeName \"/\" ]");
        out.println("             entityColNavigationProperty [ collectionNavigationExpr ] /");
        out.println("             entityNavigationProperty [ singleNavigationExpr ] /");
        out.println("             primitivePropertyPath / ");
        out.println("             complexPropertyPath /");
        out.println("             collectionPropertyPath [ anyExpr / allExpr ]");
        out.println("");
        out.println("collectionNavigationExpr = [ \"/\" qualifiedEntityTypeName ] \"/\" ( boundFunctionExpr / anyExpr / allExpr )");
        out.println("");
        out.println("singleNavigationExpr            =       [ \"/\" qualifiedEntityTypeName ] \"/\"");
        out.println("                                    ( ");
        out.println("                                        ( entityColNavigationProperty [ collectionNavigationExpr ] ) /");
        out.println("                                        ( entityNavigationProperty [ singleNavigationExpr ] ) /");
        out.println("                                                                                primitivePropertyPath / ");
        out.println("                                        complexPropertyPath /");
        out.println("                                                                                collectionPropertyPath [ anyExpr / allExpr ] / ");
        out.println("                                        streamPropertyPath / ");
        out.println("                                        boundFunctionExpr ");
        out.println("                                        )");
        out.println("        ");
        out.println(";functionExpr = ( entityColFuncCall [ singleNavigationExpr ] ");
        out.println(";               / entityFuncCall [ collectionNavigationExpr ] ");
        out.println(";               / primitiveFuncCall [ boundFunctionExpr ] ");
        out.println(";               / primitiveColFuncCall [ boundFunctionExpr ] ");
        out.println(";               / complexFuncCall [ complexPropertyPath / boundFunctionExpr ] ");
        out.println(";               / complexColFuncCall [ boundFunctionExpr ]");
        out.println(";               )");
        out.println("");
        out.println(";boolFunctionExpr                        =       functionExpr");
        out.println("                                                ; with the added restriction that the boolFunctionExpr MUST return a boolean value");
        out.println("        ");
        out.println("boundFunctionExpr                       =       [ \"/\" qualifiedEntityTypeName ] ");
        out.println("                                                                        \"/\" ");
        out.println("                                                                        (");
        out.println("                                                                                boundEntityColFuncCall [ singleNavigationExpr ] /");
        out.println("                                                                                boundEntityFuncCall [ collectionNavigationExpr ] /");
        out.println("                                                                                boundPrimitiveFuncCall [ boundFunctionExpr ] /");
        out.println("                                                                                boundPrimitiveColFuncCall [ boundFunctionExpr ] /");
        out.println("                                                                                boundComplexFuncCall [ complexPropertyPath / boundFunctionExpr ] /");
        out.println("                                                                                boundComplexColFuncCall [ boundFunctionExpr ]");
        out.println("                                                                        )");
        out.println("                                    ; boundOperation segments can only be composed if the type of the previous segment matches ");
        out.println("                                    ; the type of the first parameter of the action or function being called.");
        out.println("                                                                        ; NOTE: the qualifiedEntityTypeName is only permitted if the previous segment is an Entity or Collection of Entities.");
        out.println("");
        out.println(";boolBoundFunctionExpr           =       boundFunctionExpr");
        out.println("                                                                        ; with the added restriction that the boolBoundFunctionExpr MUST return a boolean value");
        out.println("");
        out.println("anyExpr = \"any(\" [ lambdaVariableExpr \":\" lambdaPredicateExpr ] \")\"");
        out.println("");
        out.println("allExpr = \"all(\" lambdaVariableExpr \":\" lambdaPredicateExpr \")\"");
        out.println("");
        out.println(";implicitVariableExpr = \"$it\" ; references the unnamed outer variable of the query");
        out.println("");
        out.println("lambdaVariableExpr = odataIdentifier");
        out.println(";inscopeVariableExpr = implicitVariableExpr / lambdaVariableExpr");
        out.println("lambdaPredicateExpr = boolCommonExpr");
        out.println("   ");
        out.println("methodCallExpr = boolMethodExpr /");
        out.println("                                                indexOfMethodCallExpr /");
        out.println("                                                replaceMethodCallExpr / ");
        out.println("                                                toLowerMethodCallExpr /");
        out.println("                                                toUpperMethodCallExpr / ");
        out.println("                                                trimMethodCallExpr /");
        out.println("                                                substringMethodCallExpr /");
        out.println("                                                concatMethodCallExpr /");
        out.println("                                                lengthMethodCallExpr /");
        out.println("                                                yearMethodCallExpr /");
        out.println("                                                monthMethodCallExpr /");
        out.println("                                                dayMethodCallExpr /");
        out.println("                                                hourMethodCallExpr /");
        out.println("                                                minuteMethodCallExpr /");
        out.println("                                                secondMethodCallExpr /");
        out.println("                                                roundMethodCallExpr /");
        out.println("                                                floorMethodCallExpr /");
        out.println("                                                ceilingMethodCallExpr /");
        out.println("                                                distanceMethodCallExpr /");
        out.println("                                                geoLengthMethodCallExpr /");
        out.println("                                                getTotalOffsetMinutesExpr");
        out.println("");
        out.println("boolMethodExpr = endsWithMethodCallExpr /");
        out.println("                                                startsWithMethodCallExpr /");
        out.println("                                                substringOfMethodCallExpr /                                         ");
        out.println("                                                intersectsMethodCallExpr /");
        out.println("                                                anyMethodCallExpr /");
        out.println("                                                allMethodCallExpr");
        out.println("");
        out.println("endsWithMethodCallExpr = \"endswith\" [WSP]");
        out.println("                                        \"(\" [WSP] commonExpr [WSP]");
        out.println("                                        \",\" [WSP] commonExpr  [WSP] \")\"");
        out.println("");
        out.println("indexOfMethodCallExpr = \"indexof\" [WSP]");
        out.println("                                        \"(\" [WSP] commonExpr [WSP]");
        out.println("                                        \",\" [WSP] commonExpr [WSP] \")\"");
        out.println("");
        out.println("replaceMethodCallExpr = \"replace\" [WSP]");
        out.println("                                        \"(\" [WSP] commonExpr [WSP]");
        out.println("                                        \",\" [WSP] commonExpr [WSP]");
        out.println("                                        \",\" [WSP] commonExpr [WSP] \")\"");
        out.println("");
        out.println("startsWithMethodCallExpr = \"startswith\" [WSP]");
        out.println("                                        \"(\" [WSP] commonExpr [WSP]");
        out.println("                                        \",\" [WSP] commonExpr  [WSP] \")\"");
        out.println("");
        out.println("toLowerMethodCallExpr = \"tolower\" [WSP]");
        out.println("                                        \"(\" [WSP] commonExpr [WSP] \")\"");
        out.println("");
        out.println("toUpperMethodCallExpr = \"toupper\" [WSP]");
        out.println("                                        \"(\" [WSP] commonExpr [WSP] \")\"");
        out.println("");
        out.println("trimMethodCallExpr = \"trim\" [WSP]");
        out.println("                                                \"(\" [WSP] commonExpr [WSP] \")\"");
        out.println("");
        out.println("substringMethodCallExpr = \"substring\" [WSP]");
        out.println("                                        \"(\" [WSP] commonExpr [WSP]");
        out.println("                                        \",\" [WSP] commonExpr [WSP]");
        out.println("                                        [ \",\" [WSP] commonExpr  [WSP] ] \")\"");
        out.println("");
        out.println("substringOfMethodCallExpr = \"substringof\" [WSP]");
        out.println("                                        \"(\" [WSP] commonExpr [WSP]");
        out.println("                                        [ \",\" [WSP] commonExpr [WSP] ] \")\"");
        out.println("");
        out.println("concatMethodCallExpr = \"concat\" [WSP]");
        out.println("                                        \"(\" [WSP] commonExpr [WSP]");
        out.println("                                        [ \",\" [WSP] commonExpr [WSP] ] \")\"");
        out.println("");
        out.println("lengthMethodCallExpr = \"length\" [WSP]");
        out.println("                                        \"(\" [WSP] commonExpr [WSP] \")\"");
        out.println("");
        out.println("getTotalOffsetMinutesExpr = \"gettotaloffsetminutes\" [WSP] \"(\" [WSP] commonExpr [WSP] \")\" ");
        out.println("");
        out.println("yearMethodCallExpr = \"year\" [WSP] \"(\" [WSP] commonExpr [WSP] \")\"");
        out.println("");
        out.println("monthMethodCallExpr = \"month\" [WSP] \"(\" [WSP] commonExpr [WSP] \")\"");
        out.println("");
        out.println("dayMethodCallExpr = \"day\" [WSP] \"(\" [WSP] commonExpr [WSP] \")\"");
        out.println("");
        out.println("hourMethodCallExpr = \"hour\" [WSP] \"(\" [WSP] commonExpr [WSP] \")\"");
        out.println("");
        out.println("minuteMethodCallExpr = \"minute\" [WSP] \"(\" [WSP] commonExpr [WSP] \")\"");
        out.println("");
        out.println("secondMethodCallExpr = \"second\" [WSP] \"(\" [WSP] commonExpr [WSP] \")\"");
        out.println("");
        out.println("roundMethodCallExpr = \"round\" [WSP] \"(\" [WSP] commonExpr [WSP] \")\"");
        out.println("");
        out.println("floorMethodCallExpr = \"floor\" [WSP] \"(\" [WSP] commonExpr [WSP] \")\"");
        out.println("");
        out.println("ceilingMethodCallExpr = \"ceiling\" [WSP] \"(\" [WSP] commonExpr [WSP] \")\"");
        out.println("");
        out.println("distanceMethodCallExpr = \"geo.distance\" [WSP] \"(\" [WSP] commonExpr [WSP] \",\" [WSP] commonExpr  [WSP] \")\"");
        out.println("");
        out.println("geoLengthMethodCallExpr = \"geo.length\" [WSP] \"(\" [WSP] commonExpr [WSP] \")\"");
        out.println("");
        out.println("intersectsMethodCallExpr = \"geo.intersects\" [WSP] \"(\" [WSP] commonExpr [WSP] \",\" [WSP] commonExpr  [WSP] \")\"");
        out.println("");
        out.println("; Other undefined terms");
        out.println("allMethodCallExpr = \"{TODO25}\"");
        out.println("anyMethodCallExpr = \"{TODO26}\"");
        out.println("boolFunctionCallExpr = \"{TODO27}\"");
        out.println("boolMethodCallExpr = \"{TODO28}\"");
        out.println(";complexColFuncCall = \"{TODO29}\"");
        out.println("complexColInJSON = \"{TODO30}\"");
        out.println(";complexFuncCall = \"{TODO31}\" ");
        out.println("complexTypeInJSON = \"{TODO32}\"");
        out.println(";entityColFuncCall = \"{TODO33}\"");
        out.println(";entityFuncCall = \"{TODO34}\"");
        out.println("entityProperty = \"{TODO35}\"");
        out.println("lambdaPredicatePrefixExpr = \"{TODO45}\"");
        out.println(";primitiveColFuncCall = \"{TODO48}\"");
        out.println("primitiveColInJSON = \"{TODO49}\"");
        out.println(";primitiveFuncCall = \"{TODO50}\"");
        out.println("primitiveVJSONLiteral = \"{TODO51}\"");
        out.println("quotation-mark = \"{TODO53}\"");
        out.println("");
        out.println("; End of odata-v1.0-abnf");
    }
}
