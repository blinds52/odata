package grammar;

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

public class GrammarUnderTest extends Grammar{

    // public API
    /** Called to get a singleton instance of this class.
     * @return a singleton instance of this class, cast as the base class, Grammar. */
    public static Grammar getInstance(){
        if(factoryInstance == null){
            factoryInstance = new GrammarUnderTest(getRules(), getUdts(), getOpcodes());
        }
        return factoryInstance;
    }

    // rule name enum
    /** The number of rules in the grammar */
    public static int ruleCount = 298;
    /** This enum provides easy to remember enum constants for locating the rule identifiers and names.
     * The enum constants have the same spelling as the rule names rendered in all caps with underscores replacing hyphens. */
    public enum RuleNames{
        /** id = <code>173</code>, name = <code>"abstractSpatialTypeName"</code> */
        ABSTRACTSPATIALTYPENAME("abstractSpatialTypeName", 173, 1322, 3),
        /** id = <code>187</code>, name = <code>"action"</code> */
        ACTION("action", 187, 1354, 1),
        /** id = <code>18</code>, name = <code>"actionCall"</code> */
        ACTIONCALL("actionCall", 18, 195, 6),
        /** id = <code>128</code>, name = <code>"addExpr"</code> */
        ADDEXPR("addExpr", 128, 1055, 7),
        /** id = <code>61</code>, name = <code>"aliasAndValue"</code> */
        ALIASANDVALUE("aliasAndValue", 61, 437, 4),
        /** id = <code>85</code>, name = <code>"allExpr"</code> */
        ALLEXPR("allExpr", 85, 664, 6),
        /** id = <code>54</code>, name = <code>"allOperationsInContainer"</code> */
        ALLOPERATIONSINCONTAINER("allOperationsInContainer", 54, 389, 3),
        /** id = <code>291</code>, name = <code>"ALPHA"</code> */
        ALPHA("ALPHA", 291, 2065, 3),
        /** id = <code>120</code>, name = <code>"andExpr"</code> */
        ANDEXPR("andExpr", 120, 999, 7),
        /** id = <code>84</code>, name = <code>"anyExpr"</code> */
        ANYEXPR("anyExpr", 84, 656, 8),
        /** id = <code>142</code>, name = <code>"begin-array"</code> */
        BEGIN_ARRAY("begin-array", 142, 1165, 1),
        /** id = <code>140</code>, name = <code>"begin-object"</code> */
        BEGIN_OBJECT("begin-object", 140, 1163, 1),
        /** id = <code>197</code>, name = <code>"binary"</code> */
        BINARY("binary", 197, 1406, 9),
        /** id = <code>68</code>, name = <code>"boolCommonExpr"</code> */
        BOOLCOMMONEXPR("boolCommonExpr", 68, 496, 20),
        /** id = <code>198</code>, name = <code>"boolean"</code> */
        BOOLEAN("boolean", 198, 1415, 7),
        /** id = <code>88</code>, name = <code>"boolMethodCallExpr"</code> */
        BOOLMETHODCALLEXPR("boolMethodCallExpr", 88, 697, 5),
        /** id = <code>118</code>, name = <code>"boolParenExpr"</code> */
        BOOLPARENEXPR("boolParenExpr", 118, 983, 8),
        /** id = <code>19</code>, name = <code>"boundActionCall"</code> */
        BOUNDACTIONCALL("boundActionCall", 19, 201, 1),
        /** id = <code>23</code>, name = <code>"boundComplexColFuncCall"</code> */
        BOUNDCOMPLEXCOLFUNCCALL("boundComplexColFuncCall", 23, 205, 1),
        /** id = <code>22</code>, name = <code>"boundComplexFuncCall"</code> */
        BOUNDCOMPLEXFUNCCALL("boundComplexFuncCall", 22, 204, 1),
        /** id = <code>21</code>, name = <code>"boundEntityColFuncCall"</code> */
        BOUNDENTITYCOLFUNCCALL("boundEntityColFuncCall", 21, 203, 1),
        /** id = <code>20</code>, name = <code>"boundEntityFuncCall"</code> */
        BOUNDENTITYFUNCCALL("boundEntityFuncCall", 20, 202, 1),
        /** id = <code>80</code>, name = <code>"boundFunctionExpr"</code> */
        BOUNDFUNCTIONEXPR("boundFunctionExpr", 80, 605, 1),
        /** id = <code>17</code>, name = <code>"boundOperation"</code> */
        BOUNDOPERATION("boundOperation", 17, 167, 28),
        /** id = <code>25</code>, name = <code>"boundPrimitiveColFuncCall"</code> */
        BOUNDPRIMITIVECOLFUNCCALL("boundPrimitiveColFuncCall", 25, 207, 1),
        /** id = <code>24</code>, name = <code>"boundPrimitiveFuncCall"</code> */
        BOUNDPRIMITIVEFUNCCALL("boundPrimitiveFuncCall", 24, 206, 1),
        /** id = <code>210</code>, name = <code>"byte"</code> */
        BYTE("byte", 210, 1493, 2),
        /** id = <code>136</code>, name = <code>"castExpr"</code> */
        CASTEXPR("castExpr", 136, 1113, 13),
        /** id = <code>113</code>, name = <code>"ceilingMethodCallExpr"</code> */
        CEILINGMETHODCALLEXPR("ceilingMethodCallExpr", 113, 934, 9),
        /** id = <code>152</code>, name = <code>"charInJSON"</code> */
        CHARINJSON("charInJSON", 152, 1204, 1),
        /** id = <code>234</code>, name = <code>"collectionLiteral"</code> */
        COLLECTIONLITERAL("collectionLiteral", 234, 1697, 8),
        /** id = <code>4</code>, name = <code>"collectionNavigation"</code> */
        COLLECTIONNAVIGATION("collectionNavigation", 4, 62, 12),
        /** id = <code>75</code>, name = <code>"collectionNavigationExpr"</code> */
        COLLECTIONNAVIGATIONEXPR("collectionNavigationExpr", 75, 560, 12),
        /** id = <code>11</code>, name = <code>"collectionPath"</code> */
        COLLECTIONPATH("collectionPath", 11, 134, 3),
        /** id = <code>77</code>, name = <code>"collectionPathExpr"</code> */
        COLLECTIONPATHEXPR("collectionPathExpr", 77, 575, 11),
        /** id = <code>158</code>, name = <code>"collectionPropertyInUri"</code> */
        COLLECTIONPROPERTYINURI("collectionPropertyInUri", 158, 1237, 13),
        /** id = <code>272</code>, name = <code>"COMMA"</code> */
        COMMA("COMMA", 272, 1876, 1),
        /** id = <code>67</code>, name = <code>"commonExpr"</code> */
        COMMONEXPR("commonExpr", 67, 480, 16),
        /** id = <code>192</code>, name = <code>"complexColFunction"</code> */
        COMPLEXCOLFUNCTION("complexColFunction", 192, 1365, 1),
        /** id = <code>29</code>, name = <code>"complexColFunctionCall"</code> */
        COMPLEXCOLFUNCTIONCALL("complexColFunctionCall", 29, 223, 5),
        /** id = <code>138</code>, name = <code>"complexColInUri"</code> */
        COMPLEXCOLINURI("complexColInUri", 138, 1143, 10),
        /** id = <code>181</code>, name = <code>"complexColProperty"</code> */
        COMPLEXCOLPROPERTY("complexColProperty", 181, 1346, 1),
        /** id = <code>191</code>, name = <code>"complexFunction"</code> */
        COMPLEXFUNCTION("complexFunction", 191, 1364, 1),
        /** id = <code>28</code>, name = <code>"complexFunctionCall"</code> */
        COMPLEXFUNCTIONCALL("complexFunctionCall", 28, 218, 5),
        /** id = <code>137</code>, name = <code>"complexInUri"</code> */
        COMPLEXINURI("complexInUri", 137, 1126, 17),
        /** id = <code>13</code>, name = <code>"complexPath"</code> */
        COMPLEXPATH("complexPath", 13, 140, 18),
        /** id = <code>78</code>, name = <code>"complexPathExpr"</code> */
        COMPLEXPATHEXPR("complexPathExpr", 78, 586, 16),
        /** id = <code>180</code>, name = <code>"complexProperty"</code> */
        COMPLEXPROPERTY("complexProperty", 180, 1345, 1),
        /** id = <code>157</code>, name = <code>"complexPropertyInUri"</code> */
        COMPLEXPROPERTYINURI("complexPropertyInUri", 157, 1231, 6),
        /** id = <code>147</code>, name = <code>"complexTypeMetadataInUri"</code> */
        COMPLEXTYPEMETADATAINURI("complexTypeMetadataInUri", 147, 1170, 9),
        /** id = <code>167</code>, name = <code>"complexTypeName"</code> */
        COMPLEXTYPENAME("complexTypeName", 167, 1284, 1),
        /** id = <code>7</code>, name = <code>"compoundKey"</code> */
        COMPOUNDKEY("compoundKey", 7, 81, 8),
        /** id = <code>98</code>, name = <code>"concatMethodCallExpr"</code> */
        CONCATMETHODCALLEXPR("concatMethodCallExpr", 98, 797, 11),
        /** id = <code>174</code>, name = <code>"concreteSpatialTypeName"</code> */
        CONCRETESPATIALTYPENAME("concreteSpatialTypeName", 174, 1325, 8),
        /** id = <code>14</code>, name = <code>"count"</code> */
        COUNT("count", 14, 158, 3),
        /** id = <code>65</code>, name = <code>"customName"</code> */
        CUSTOMNAME("customName", 65, 456, 15),
        /** id = <code>64</code>, name = <code>"customQueryOption"</code> */
        CUSTOMQUERYOPTION("customQueryOption", 64, 450, 6),
        /** id = <code>66</code>, name = <code>"customValue"</code> */
        CUSTOMVALUE("customValue", 66, 471, 9),
        /** id = <code>218</code>, name = <code>"dateTime"</code> */
        DATETIME("dateTime", 218, 1543, 5),
        /** id = <code>220</code>, name = <code>"dateTimeBody"</code> */
        DATETIMEBODY("dateTimeBody", 220, 1553, 24),
        /** id = <code>219</code>, name = <code>"dateTimeOffset"</code> */
        DATETIMEOFFSET("dateTimeOffset", 219, 1548, 5),
        /** id = <code>221</code>, name = <code>"dateTimeOffsetBody"</code> */
        DATETIMEOFFSETBODY("dateTimeOffsetBody", 221, 1577, 9),
        /** id = <code>227</code>, name = <code>"day"</code> */
        DAY("day", 227, 1662, 12),
        /** id = <code>103</code>, name = <code>"dayMethodCallExpr"</code> */
        DAYMETHODCALLEXPR("dayMethodCallExpr", 103, 844, 9),
        /** id = <code>104</code>, name = <code>"daysMethodCallExpr"</code> */
        DAYSMETHODCALLEXPR("daysMethodCallExpr", 104, 853, 9),
        /** id = <code>283</code>, name = <code>"dec-octet"</code> */
        DEC_OCTET("dec-octet", 283, 2011, 16),
        /** id = <code>199</code>, name = <code>"decimal"</code> */
        DECIMAL("decimal", 199, 1422, 4),
        /** id = <code>200</code>, name = <code>"decimalBody"</code> */
        DECIMALBODY("decimalBody", 200, 1426, 10),
        /** id = <code>292</code>, name = <code>"DIGIT"</code> */
        DIGIT("DIGIT", 292, 2068, 1),
        /** id = <code>115</code>, name = <code>"distanceMethodCallExpr"</code> */
        DISTANCEMETHODCALLEXPR("distanceMethodCallExpr", 115, 952, 11),
        /** id = <code>131</code>, name = <code>"divExpr"</code> */
        DIVEXPR("divExpr", 131, 1076, 7),
        /** id = <code>201</code>, name = <code>"double"</code> */
        DOUBLE("double", 201, 1436, 4),
        /** id = <code>202</code>, name = <code>"doubleBody"</code> */
        DOUBLEBODY("doubleBody", 202, 1440, 11),
        /** id = <code>294</code>, name = <code>"DQUOTE"</code> */
        DQUOTE("DQUOTE", 294, 2077, 1),
        /** id = <code>143</code>, name = <code>"end-array"</code> */
        END_ARRAY("end-array", 143, 1166, 1),
        /** id = <code>141</code>, name = <code>"end-object"</code> */
        END_OBJECT("end-object", 141, 1164, 1),
        /** id = <code>91</code>, name = <code>"endsWithMethodCallExpr"</code> */
        ENDSWITHMETHODCALLEXPR("endsWithMethodCallExpr", 91, 724, 11),
        /** id = <code>190</code>, name = <code>"entityColFunction"</code> */
        ENTITYCOLFUNCTION("entityColFunction", 190, 1363, 1),
        /** id = <code>27</code>, name = <code>"entityColFunctionCall"</code> */
        ENTITYCOLFUNCTIONCALL("entityColFunctionCall", 27, 213, 5),
        /** id = <code>185</code>, name = <code>"entityColNavigationProperty"</code> */
        ENTITYCOLNAVIGATIONPROPERTY("entityColNavigationProperty", 185, 1352, 1),
        /** id = <code>186</code>, name = <code>"entityContainerName"</code> */
        ENTITYCONTAINERNAME("entityContainerName", 186, 1353, 1),
        /** id = <code>189</code>, name = <code>"entityFunction"</code> */
        ENTITYFUNCTION("entityFunction", 189, 1362, 1),
        /** id = <code>26</code>, name = <code>"entityFunctionCall"</code> */
        ENTITYFUNCTIONCALL("entityFunctionCall", 26, 208, 5),
        /** id = <code>184</code>, name = <code>"entityNavigationProperty"</code> */
        ENTITYNAVIGATIONPROPERTY("entityNavigationProperty", 184, 1351, 1),
        /** id = <code>165</code>, name = <code>"entitySetName"</code> */
        ENTITYSETNAME("entitySetName", 165, 1282, 1),
        /** id = <code>166</code>, name = <code>"entityTypeName"</code> */
        ENTITYTYPENAME("entityTypeName", 166, 1283, 1),
        /** id = <code>168</code>, name = <code>"enumerationTypeName"</code> */
        ENUMERATIONTYPENAME("enumerationTypeName", 168, 1285, 1),
        /** id = <code>122</code>, name = <code>"eqExpr"</code> */
        EQEXPR("eqExpr", 122, 1013, 7),
        /** id = <code>156</code>, name = <code>"exp"</code> */
        EXP("exp", 156, 1223, 8),
        /** id = <code>39</code>, name = <code>"expand"</code> */
        EXPAND("expand", 39, 279, 4),
        /** id = <code>40</code>, name = <code>"expandClause"</code> */
        EXPANDCLAUSE("expandClause", 40, 283, 6),
        /** id = <code>41</code>, name = <code>"expandItem"</code> */
        EXPANDITEM("expandItem", 41, 289, 14),
        /** id = <code>42</code>, name = <code>"filter"</code> */
        FILTER("filter", 42, 303, 4),
        /** id = <code>69</code>, name = <code>"firstMemberExpr"</code> */
        FIRSTMEMBEREXPR("firstMemberExpr", 69, 516, 4),
        /** id = <code>112</code>, name = <code>"floorMethodCallExpr"</code> */
        FLOORMETHODCALLEXPR("floorMethodCallExpr", 112, 925, 9),
        /** id = <code>49</code>, name = <code>"format"</code> */
        FORMAT("format", 49, 337, 11),
        /** id = <code>155</code>, name = <code>"frac"</code> */
        FRAC("frac", 155, 1219, 4),
        /** id = <code>231</code>, name = <code>"fractionalSeconds"</code> */
        FRACTIONALSECONDS("fractionalSeconds", 231, 1688, 2),
        /** id = <code>233</code>, name = <code>"fullCollectionLiteral"</code> */
        FULLCOLLECTIONLITERAL("fullCollectionLiteral", 233, 1694, 3),
        /** id = <code>237</code>, name = <code>"fullLineStringLiteral"</code> */
        FULLLINESTRINGLITERAL("fullLineStringLiteral", 237, 1717, 3),
        /** id = <code>241</code>, name = <code>"fullMultiLineStringLiteral"</code> */
        FULLMULTILINESTRINGLITERAL("fullMultiLineStringLiteral", 241, 1735, 3),
        /** id = <code>244</code>, name = <code>"fullMultiPointLiteral"</code> */
        FULLMULTIPOINTLITERAL("fullMultiPointLiteral", 244, 1752, 3),
        /** id = <code>247</code>, name = <code>"fullMultiPolygonLiteral"</code> */
        FULLMULTIPOLYGONLITERAL("fullMultiPolygonLiteral", 247, 1769, 3),
        /** id = <code>250</code>, name = <code>"fullPointLiteral"</code> */
        FULLPOINTLITERAL("fullPointLiteral", 250, 1786, 3),
        /** id = <code>256</code>, name = <code>"fullPolygonLiteral"</code> */
        FULLPOLYGONLITERAL("fullPolygonLiteral", 256, 1809, 3),
        /** id = <code>188</code>, name = <code>"function"</code> */
        FUNCTION("function", 188, 1355, 7),
        /** id = <code>81</code>, name = <code>"functionExpr"</code> */
        FUNCTIONEXPR("functionExpr", 81, 606, 34),
        /** id = <code>83</code>, name = <code>"functionExprParameter"</code> */
        FUNCTIONEXPRPARAMETER("functionExprParameter", 83, 650, 6),
        /** id = <code>82</code>, name = <code>"functionExprParameters"</code> */
        FUNCTIONEXPRPARAMETERS("functionExprParameters", 82, 640, 10),
        /** id = <code>33</code>, name = <code>"functionParameter"</code> */
        FUNCTIONPARAMETER("functionParameter", 33, 248, 6),
        /** id = <code>34</code>, name = <code>"functionParameterName"</code> */
        FUNCTIONPARAMETERNAME("functionParameterName", 34, 254, 1),
        /** id = <code>32</code>, name = <code>"functionParameters"</code> */
        FUNCTIONPARAMETERS("functionParameters", 32, 238, 10),
        /** id = <code>127</code>, name = <code>"geExpr"</code> */
        GEEXPR("geExpr", 127, 1048, 7),
        /** id = <code>232</code>, name = <code>"geographyCollection"</code> */
        GEOGRAPHYCOLLECTION("geographyCollection", 232, 1690, 4),
        /** id = <code>236</code>, name = <code>"geographyLineString"</code> */
        GEOGRAPHYLINESTRING("geographyLineString", 236, 1713, 4),
        /** id = <code>240</code>, name = <code>"geographyMultiLineString"</code> */
        GEOGRAPHYMULTILINESTRING("geographyMultiLineString", 240, 1731, 4),
        /** id = <code>243</code>, name = <code>"geographyMultiPoint"</code> */
        GEOGRAPHYMULTIPOINT("geographyMultiPoint", 243, 1748, 4),
        /** id = <code>246</code>, name = <code>"geographyMultiPolygon"</code> */
        GEOGRAPHYMULTIPOLYGON("geographyMultiPolygon", 246, 1765, 4),
        /** id = <code>249</code>, name = <code>"geographyPoint"</code> */
        GEOGRAPHYPOINT("geographyPoint", 249, 1782, 4),
        /** id = <code>255</code>, name = <code>"geographyPolygon"</code> */
        GEOGRAPHYPOLYGON("geographyPolygon", 255, 1805, 4),
        /** id = <code>267</code>, name = <code>"geographyPrefix"</code> */
        GEOGRAPHYPREFIX("geographyPrefix", 267, 1859, 3),
        /** id = <code>116</code>, name = <code>"geoLengthMethodCallExpr"</code> */
        GEOLENGTHMETHODCALLEXPR("geoLengthMethodCallExpr", 116, 963, 9),
        /** id = <code>235</code>, name = <code>"geoLiteral"</code> */
        GEOLITERAL("geoLiteral", 235, 1705, 8),
        /** id = <code>260</code>, name = <code>"geometryCollection"</code> */
        GEOMETRYCOLLECTION("geometryCollection", 260, 1831, 4),
        /** id = <code>261</code>, name = <code>"geometryLineString"</code> */
        GEOMETRYLINESTRING("geometryLineString", 261, 1835, 4),
        /** id = <code>262</code>, name = <code>"geometryMultiLineString"</code> */
        GEOMETRYMULTILINESTRING("geometryMultiLineString", 262, 1839, 4),
        /** id = <code>263</code>, name = <code>"geometryMultiPoint"</code> */
        GEOMETRYMULTIPOINT("geometryMultiPoint", 263, 1843, 4),
        /** id = <code>264</code>, name = <code>"geometryMultiPolygon"</code> */
        GEOMETRYMULTIPOLYGON("geometryMultiPolygon", 264, 1847, 4),
        /** id = <code>265</code>, name = <code>"geometryPoint"</code> */
        GEOMETRYPOINT("geometryPoint", 265, 1851, 4),
        /** id = <code>266</code>, name = <code>"geometryPolygon"</code> */
        GEOMETRYPOLYGON("geometryPolygon", 266, 1855, 4),
        /** id = <code>268</code>, name = <code>"geometryPrefix"</code> */
        GEOMETRYPREFIX("geometryPrefix", 268, 1862, 3),
        /** id = <code>114</code>, name = <code>"getTotalOffsetMinutesExpr"</code> */
        GETTOTALOFFSETMINUTESEXPR("getTotalOffsetMinutesExpr", 114, 943, 9),
        /** id = <code>126</code>, name = <code>"gtExpr"</code> */
        GTEXPR("gtExpr", 126, 1041, 7),
        /** id = <code>209</code>, name = <code>"guid"</code> */
        GUID("guid", 209, 1475, 18),
        /** id = <code>280</code>, name = <code>"h16"</code> */
        H16("h16", 280, 1995, 2),
        /** id = <code>293</code>, name = <code>"HEXDIG"</code> */
        HEXDIG("HEXDIG", 293, 2069, 8),
        /** id = <code>275</code>, name = <code>"host"</code> */
        HOST("host", 275, 1881, 4),
        /** id = <code>228</code>, name = <code>"hour"</code> */
        HOUR("hour", 228, 1674, 12),
        /** id = <code>105</code>, name = <code>"hourMethodCallExpr"</code> */
        HOURMETHODCALLEXPR("hourMethodCallExpr", 105, 862, 9),
        /** id = <code>106</code>, name = <code>"hoursMethodCallExpr"</code> */
        HOURSMETHODCALLEXPR("hoursMethodCallExpr", 106, 871, 9),
        /** id = <code>296</code>, name = <code>"HTAB"</code> */
        HTAB("HTAB", 296, 2079, 1),
        /** id = <code>171</code>, name = <code>"identifierCharacter"</code> */
        IDENTIFIERCHARACTER("identifierCharacter", 171, 1293, 4),
        /** id = <code>170</code>, name = <code>"identifierLeadingCharacter"</code> */
        IDENTIFIERLEADINGCHARACTER("identifierLeadingCharacter", 170, 1290, 3),
        /** id = <code>73</code>, name = <code>"implicitVariableExpr"</code> */
        IMPLICITVARIABLEEXPR("implicitVariableExpr", 73, 558, 1),
        /** id = <code>93</code>, name = <code>"indexOfMethodCallExpr"</code> */
        INDEXOFMETHODCALLEXPR("indexOfMethodCallExpr", 93, 744, 11),
        /** id = <code>50</code>, name = <code>"inlinecount"</code> */
        INLINECOUNT("inlinecount", 50, 348, 6),
        /** id = <code>72</code>, name = <code>"inscopeVariableExpr"</code> */
        INSCOPEVARIABLEEXPR("inscopeVariableExpr", 72, 555, 3),
        /** id = <code>154</code>, name = <code>"int"</code> */
        INT("int", 154, 1213, 6),
        /** id = <code>212</code>, name = <code>"int16"</code> */
        INT16("int16", 212, 1500, 5),
        /** id = <code>213</code>, name = <code>"int32"</code> */
        INT32("int32", 213, 1505, 5),
        /** id = <code>214</code>, name = <code>"int64"</code> */
        INT64("int64", 214, 1510, 7),
        /** id = <code>117</code>, name = <code>"intersectsMethodCallExpr"</code> */
        INTERSECTSMETHODCALLEXPR("intersectsMethodCallExpr", 117, 972, 11),
        /** id = <code>277</code>, name = <code>"IP-literal"</code> */
        IP_LITERAL("IP-literal", 277, 1887, 6),
        /** id = <code>282</code>, name = <code>"IPv4address"</code> */
        IPV4ADDRESS("IPv4address", 282, 2003, 8),
        /** id = <code>279</code>, name = <code>"IPv6address"</code> */
        IPV6ADDRESS("IPv6address", 279, 1903, 92),
        /** id = <code>278</code>, name = <code>"IPvFuture"</code> */
        IPVFUTURE("IPvFuture", 278, 1893, 10),
        /** id = <code>135</code>, name = <code>"isofExpr"</code> */
        ISOFEXPR("isofExpr", 135, 1100, 13),
        /** id = <code>5</code>, name = <code>"keyPredicate"</code> */
        KEYPREDICATE("keyPredicate", 5, 74, 3),
        /** id = <code>9</code>, name = <code>"keyPropertyValue"</code> */
        KEYPROPERTYVALUE("keyPropertyValue", 9, 93, 1),
        /** id = <code>8</code>, name = <code>"keyValuePair"</code> */
        KEYVALUEPAIR("keyValuePair", 8, 89, 4),
        /** id = <code>86</code>, name = <code>"lambdaPredicateExpr"</code> */
        LAMBDAPREDICATEEXPR("lambdaPredicateExpr", 86, 670, 1),
        /** id = <code>71</code>, name = <code>"lambdaPredicatePrefixExpr"</code> */
        LAMBDAPREDICATEPREFIXEXPR("lambdaPredicatePrefixExpr", 71, 552, 3),
        /** id = <code>74</code>, name = <code>"lambdaVariableExpr"</code> */
        LAMBDAVARIABLEEXPR("lambdaVariableExpr", 74, 559, 1),
        /** id = <code>125</code>, name = <code>"leExpr"</code> */
        LEEXPR("leExpr", 125, 1034, 7),
        /** id = <code>92</code>, name = <code>"lengthMethodCallExpr"</code> */
        LENGTHMETHODCALLEXPR("lengthMethodCallExpr", 92, 735, 9),
        /** id = <code>239</code>, name = <code>"lineStringData"</code> */
        LINESTRINGDATA("lineStringData", 239, 1723, 8),
        /** id = <code>238</code>, name = <code>"lineStringLiteral"</code> */
        LINESTRINGLITERAL("lineStringLiteral", 238, 1720, 3),
        /** id = <code>15</code>, name = <code>"links"</code> */
        LINKS("links", 15, 161, 3),
        /** id = <code>281</code>, name = <code>"ls32"</code> */
        LS32("ls32", 281, 1997, 6),
        /** id = <code>124</code>, name = <code>"ltExpr"</code> */
        LTEXPR("ltExpr", 124, 1027, 7),
        /** id = <code>70</code>, name = <code>"memberExpr"</code> */
        MEMBEREXPR("memberExpr", 70, 520, 32),
        /** id = <code>87</code>, name = <code>"methodCallExpr"</code> */
        METHODCALLEXPR("methodCallExpr", 87, 671, 26),
        /** id = <code>229</code>, name = <code>"minute"</code> */
        MINUTE("minute", 229, 1686, 1),
        /** id = <code>107</code>, name = <code>"minuteMethodCallExpr"</code> */
        MINUTEMETHODCALLEXPR("minuteMethodCallExpr", 107, 880, 9),
        /** id = <code>108</code>, name = <code>"minutesMethodCallExpr"</code> */
        MINUTESMETHODCALLEXPR("minutesMethodCallExpr", 108, 889, 9),
        /** id = <code>132</code>, name = <code>"modExpr"</code> */
        MODEXPR("modExpr", 132, 1083, 7),
        /** id = <code>226</code>, name = <code>"month"</code> */
        MONTH("month", 226, 1652, 10),
        /** id = <code>101</code>, name = <code>"monthMethodCallExpr"</code> */
        MONTHMETHODCALLEXPR("monthMethodCallExpr", 101, 826, 9),
        /** id = <code>102</code>, name = <code>"monthsMethodCallExpr"</code> */
        MONTHSMETHODCALLEXPR("monthsMethodCallExpr", 102, 835, 9),
        /** id = <code>130</code>, name = <code>"mulExpr"</code> */
        MULEXPR("mulExpr", 130, 1069, 7),
        /** id = <code>242</code>, name = <code>"multiLineStringLiteral"</code> */
        MULTILINESTRINGLITERAL("multiLineStringLiteral", 242, 1738, 10),
        /** id = <code>245</code>, name = <code>"multiPointLiteral"</code> */
        MULTIPOINTLITERAL("multiPointLiteral", 245, 1755, 10),
        /** id = <code>248</code>, name = <code>"multiPolygonLiteral"</code> */
        MULTIPOLYGONLITERAL("multiPolygonLiteral", 248, 1772, 10),
        /** id = <code>145</code>, name = <code>"name-separator"</code> */
        NAME_SEPARATOR("name-separator", 145, 1168, 1),
        /** id = <code>163</code>, name = <code>"namespace"</code> */
        NAMESPACE("namespace", 163, 1275, 6),
        /** id = <code>164</code>, name = <code>"namespacePart"</code> */
        NAMESPACEPART("namespacePart", 164, 1281, 1),
        /** id = <code>205</code>, name = <code>"nan"</code> */
        NAN("nan", 205, 1466, 1),
        /** id = <code>208</code>, name = <code>"nanInfinity"</code> */
        NANINFINITY("nanInfinity", 208, 1471, 4),
        /** id = <code>183</code>, name = <code>"navigationProperty"</code> */
        NAVIGATIONPROPERTY("navigationProperty", 183, 1348, 3),
        /** id = <code>123</code>, name = <code>"neExpr"</code> */
        NEEXPR("neExpr", 123, 1020, 7),
        /** id = <code>133</code>, name = <code>"negateExpr"</code> */
        NEGATEEXPR("negateExpr", 133, 1090, 5),
        /** id = <code>207</code>, name = <code>"negativeInfinity"</code> */
        NEGATIVEINFINITY("negativeInfinity", 207, 1468, 3),
        /** id = <code>134</code>, name = <code>"notExpr"</code> */
        NOTEXPR("notExpr", 134, 1095, 5),
        /** id = <code>196</code>, name = <code>"null"</code> */
        NULL("null", 196, 1399, 7),
        /** id = <code>153</code>, name = <code>"numberInJSON"</code> */
        NUMBERINJSON("numberInJSON", 153, 1205, 8),
        /** id = <code>169</code>, name = <code>"odataIdentifier"</code> */
        ODATAIDENTIFIER("odataIdentifier", 169, 1286, 4),
        /** id = <code>2</code>, name = <code>"odataRelativeUri"</code> */
        ODATARELATIVEURI("odataRelativeUri", 2, 22, 6),
        /** id = <code>0</code>, name = <code>"odataUri"</code> */
        ODATAURI("odataUri", 0, 0, 16),
        /** id = <code>223</code>, name = <code>"oneToNine"</code> */
        ONETONINE("oneToNine", 223, 1631, 10),
        /** id = <code>55</code>, name = <code>"operationQualifier"</code> */
        OPERATIONQUALIFIER("operationQualifier", 55, 392, 7),
        /** id = <code>46</code>, name = <code>"orderAscDesc"</code> */
        ORDERASCDESC("orderAscDesc", 46, 324, 3),
        /** id = <code>43</code>, name = <code>"orderby"</code> */
        ORDERBY("orderby", 43, 307, 4),
        /** id = <code>44</code>, name = <code>"orderbyClause"</code> */
        ORDERBYCLAUSE("orderbyClause", 44, 311, 6),
        /** id = <code>45</code>, name = <code>"orderbyItem"</code> */
        ORDERBYITEM("orderbyItem", 45, 317, 7),
        /** id = <code>121</code>, name = <code>"orExpr"</code> */
        OREXPR("orExpr", 121, 1006, 7),
        /** id = <code>290</code>, name = <code>"other-delims"</code> */
        OTHER_DELIMS("other-delims", 290, 2056, 9),
        /** id = <code>35</code>, name = <code>"parameterAlias"</code> */
        PARAMETERALIAS("parameterAlias", 35, 255, 3),
        /** id = <code>62</code>, name = <code>"parameterNameAndValue"</code> */
        PARAMETERNAMEANDVALUE("parameterNameAndValue", 62, 441, 4),
        /** id = <code>59</code>, name = <code>"parameterTypeName"</code> */
        PARAMETERTYPENAME("parameterTypeName", 59, 424, 1),
        /** id = <code>58</code>, name = <code>"parameterTypeNames"</code> */
        PARAMETERTYPENAMES("parameterTypeNames", 58, 417, 7),
        /** id = <code>63</code>, name = <code>"parameterValue"</code> */
        PARAMETERVALUE("parameterValue", 63, 445, 5),
        /** id = <code>119</code>, name = <code>"parenExpr"</code> */
        PARENEXPR("parenExpr", 119, 991, 8),
        /** id = <code>286</code>, name = <code>"pchar"</code> */
        PCHAR("pchar", 286, 2034, 6),
        /** id = <code>216</code>, name = <code>"pchar-no-SQUOTE"</code> */
        PCHAR_NO_SQUOTE("pchar-no-SQUOTE", 216, 1525, 15),
        /** id = <code>287</code>, name = <code>"pct-encoded"</code> */
        PCT_ENCODED("pct-encoded", 287, 2040, 4),
        /** id = <code>253</code>, name = <code>"pointData"</code> */
        POINTDATA("pointData", 253, 1797, 4),
        /** id = <code>252</code>, name = <code>"pointLiteral"</code> */
        POINTLITERAL("pointLiteral", 252, 1794, 3),
        /** id = <code>258</code>, name = <code>"polygonData"</code> */
        POLYGONDATA("polygonData", 258, 1815, 8),
        /** id = <code>257</code>, name = <code>"polygonLiteral"</code> */
        POLYGONLITERAL("polygonLiteral", 257, 1812, 3),
        /** id = <code>276</code>, name = <code>"port"</code> */
        PORT("port", 276, 1885, 2),
        /** id = <code>254</code>, name = <code>"positionLiteral"</code> */
        POSITIONLITERAL("positionLiteral", 254, 1801, 4),
        /** id = <code>206</code>, name = <code>"positiveInfinity"</code> */
        POSITIVEINFINITY("positiveInfinity", 206, 1467, 1),
        /** id = <code>194</code>, name = <code>"primitiveColFunction"</code> */
        PRIMITIVECOLFUNCTION("primitiveColFunction", 194, 1367, 1),
        /** id = <code>31</code>, name = <code>"primitiveColFunctionCall"</code> */
        PRIMITIVECOLFUNCTIONCALL("primitiveColFunctionCall", 31, 233, 5),
        /** id = <code>139</code>, name = <code>"primitiveColInUri"</code> */
        PRIMITIVECOLINURI("primitiveColInUri", 139, 1153, 10),
        /** id = <code>179</code>, name = <code>"primitiveColProperty"</code> */
        PRIMITIVECOLPROPERTY("primitiveColProperty", 179, 1344, 1),
        /** id = <code>193</code>, name = <code>"primitiveFunction"</code> */
        PRIMITIVEFUNCTION("primitiveFunction", 193, 1366, 1),
        /** id = <code>30</code>, name = <code>"primitiveFunctionCall"</code> */
        PRIMITIVEFUNCTIONCALL("primitiveFunctionCall", 30, 228, 5),
        /** id = <code>177</code>, name = <code>"primitiveKeyProperty"</code> */
        PRIMITIVEKEYPROPERTY("primitiveKeyProperty", 177, 1342, 1),
        /** id = <code>195</code>, name = <code>"primitiveLiteral"</code> */
        PRIMITIVELITERAL("primitiveLiteral", 195, 1368, 31),
        /** id = <code>150</code>, name = <code>"primitiveLiteralInJSON"</code> */
        PRIMITIVELITERALINJSON("primitiveLiteralInJSON", 150, 1193, 6),
        /** id = <code>178</code>, name = <code>"primitiveNonKeyProperty"</code> */
        PRIMITIVENONKEYPROPERTY("primitiveNonKeyProperty", 178, 1343, 1),
        /** id = <code>176</code>, name = <code>"primitiveProperty"</code> */
        PRIMITIVEPROPERTY("primitiveProperty", 176, 1339, 3),
        /** id = <code>149</code>, name = <code>"primitivePropertyInUri"</code> */
        PRIMITIVEPROPERTYINURI("primitivePropertyInUri", 149, 1187, 6),
        /** id = <code>172</code>, name = <code>"primitiveTypeName"</code> */
        PRIMITIVETYPENAME("primitiveTypeName", 172, 1297, 25),
        /** id = <code>175</code>, name = <code>"property"</code> */
        PROPERTY("property", 175, 1333, 6),
        /** id = <code>56</code>, name = <code>"qualifiedActionName"</code> */
        QUALIFIEDACTIONNAME("qualifiedActionName", 56, 399, 9),
        /** id = <code>161</code>, name = <code>"qualifiedComplexTypeName"</code> */
        QUALIFIEDCOMPLEXTYPENAME("qualifiedComplexTypeName", 161, 1267, 4),
        /** id = <code>160</code>, name = <code>"qualifiedEntityTypeName"</code> */
        QUALIFIEDENTITYTYPENAME("qualifiedEntityTypeName", 160, 1263, 4),
        /** id = <code>162</code>, name = <code>"qualifiedEnumerationTypeName"</code> */
        QUALIFIEDENUMERATIONTYPENAME("qualifiedEnumerationTypeName", 162, 1271, 4),
        /** id = <code>57</code>, name = <code>"qualifiedFunctionName"</code> */
        QUALIFIEDFUNCTIONNAME("qualifiedFunctionName", 57, 408, 9),
        /** id = <code>159</code>, name = <code>"qualifiedTypeName"</code> */
        QUALIFIEDTYPENAME("qualifiedTypeName", 159, 1250, 13),
        /** id = <code>37</code>, name = <code>"queryOption"</code> */
        QUERYOPTION("queryOption", 37, 264, 5),
        /** id = <code>36</code>, name = <code>"queryOptions"</code> */
        QUERYOPTIONS("queryOptions", 36, 258, 6),
        /** id = <code>144</code>, name = <code>"quotation-mark"</code> */
        QUOTATION_MARK("quotation-mark", 144, 1167, 1),
        /** id = <code>284</code>, name = <code>"reg-name"</code> */
        REG_NAME("reg-name", 284, 2027, 5),
        /** id = <code>3</code>, name = <code>"resourcePath"</code> */
        RESOURCEPATH("resourcePath", 3, 28, 34),
        /** id = <code>259</code>, name = <code>"ringLiteral"</code> */
        RINGLITERAL("ringLiteral", 259, 1823, 8),
        /** id = <code>111</code>, name = <code>"roundMethodCallExpr"</code> */
        ROUNDMETHODCALLEXPR("roundMethodCallExpr", 111, 916, 9),
        /** id = <code>211</code>, name = <code>"sbyte"</code> */
        SBYTE("sbyte", 211, 1495, 5),
        /** id = <code>230</code>, name = <code>"second"</code> */
        SECOND("second", 230, 1687, 1),
        /** id = <code>109</code>, name = <code>"secondMethodCallExpr"</code> */
        SECONDMETHODCALLEXPR("secondMethodCallExpr", 109, 898, 9),
        /** id = <code>110</code>, name = <code>"secondsMethodCallExpr"</code> */
        SECONDSMETHODCALLEXPR("secondsMethodCallExpr", 110, 907, 9),
        /** id = <code>285</code>, name = <code>"segment-nz"</code> */
        SEGMENT_NZ("segment-nz", 285, 2032, 2),
        /** id = <code>51</code>, name = <code>"select"</code> */
        SELECT("select", 51, 354, 4),
        /** id = <code>52</code>, name = <code>"selectClause"</code> */
        SELECTCLAUSE("selectClause", 52, 358, 6),
        /** id = <code>53</code>, name = <code>"selectItem"</code> */
        SELECTITEM("selectItem", 53, 364, 25),
        /** id = <code>271</code>, name = <code>"SEMI"</code> */
        SEMI("SEMI", 271, 1875, 1),
        /** id = <code>1</code>, name = <code>"serviceRoot"</code> */
        SERVICEROOT("serviceRoot", 1, 16, 6),
        /** id = <code>273</code>, name = <code>"sign"</code> */
        SIGN("sign", 273, 1877, 3),
        /** id = <code>6</code>, name = <code>"simpleKey"</code> */
        SIMPLEKEY("simpleKey", 6, 77, 4),
        /** id = <code>203</code>, name = <code>"single"</code> */
        SINGLE("single", 203, 1451, 4),
        /** id = <code>204</code>, name = <code>"singleBody"</code> */
        SINGLEBODY("singleBody", 204, 1455, 11),
        /** id = <code>10</code>, name = <code>"singleNavigation"</code> */
        SINGLENAVIGATION("singleNavigation", 10, 94, 40),
        /** id = <code>76</code>, name = <code>"singleNavigationExpr"</code> */
        SINGLENAVIGATIONEXPR("singleNavigationExpr", 76, 572, 3),
        /** id = <code>12</code>, name = <code>"singlePath"</code> */
        SINGLEPATH("singlePath", 12, 137, 3),
        /** id = <code>79</code>, name = <code>"singlePathExpr"</code> */
        SINGLEPATHEXPR("singlePathExpr", 79, 602, 3),
        /** id = <code>47</code>, name = <code>"skip"</code> */
        SKIP("skip", 47, 327, 5),
        /** id = <code>60</code>, name = <code>"skiptoken"</code> */
        SKIPTOKEN("skiptoken", 60, 425, 12),
        /** id = <code>295</code>, name = <code>"SP"</code> */
        SP("SP", 295, 2078, 1),
        /** id = <code>270</code>, name = <code>"SQUOTE"</code> */
        SQUOTE("SQUOTE", 270, 1874, 1),
        /** id = <code>217</code>, name = <code>"SQUOTE-in-string"</code> */
        SQUOTE_IN_STRING("SQUOTE-in-string", 217, 1540, 3),
        /** id = <code>251</code>, name = <code>"sridLiteral"</code> */
        SRIDLITERAL("sridLiteral", 251, 1789, 5),
        /** id = <code>274</code>, name = <code>"STAR"</code> */
        STAR("STAR", 274, 1880, 1),
        /** id = <code>90</code>, name = <code>"startsWithMethodCallExpr"</code> */
        STARTSWITHMETHODCALLEXPR("startsWithMethodCallExpr", 90, 713, 11),
        /** id = <code>182</code>, name = <code>"streamProperty"</code> */
        STREAMPROPERTY("streamProperty", 182, 1347, 1),
        /** id = <code>215</code>, name = <code>"string"</code> */
        STRING("string", 215, 1517, 8),
        /** id = <code>151</code>, name = <code>"stringInJSON"</code> */
        STRINGINJSON("stringInJSON", 151, 1199, 5),
        /** id = <code>289</code>, name = <code>"sub-delims"</code> */
        SUB_DELIMS("sub-delims", 289, 2051, 5),
        /** id = <code>129</code>, name = <code>"subExpr"</code> */
        SUBEXPR("subExpr", 129, 1062, 7),
        /** id = <code>94</code>, name = <code>"substringMethodCallExpr"</code> */
        SUBSTRINGMETHODCALLEXPR("substringMethodCallExpr", 94, 755, 15),
        /** id = <code>89</code>, name = <code>"substringOfMethodCallExpr"</code> */
        SUBSTRINGOFMETHODCALLEXPR("substringOfMethodCallExpr", 89, 702, 11),
        /** id = <code>38</code>, name = <code>"systemQueryOption"</code> */
        SYSTEMQUERYOPTION("systemQueryOption", 38, 269, 10),
        /** id = <code>222</code>, name = <code>"time"</code> */
        TIME("time", 222, 1586, 45),
        /** id = <code>95</code>, name = <code>"toLowerMethodCallExpr"</code> */
        TOLOWERMETHODCALLEXPR("toLowerMethodCallExpr", 95, 770, 9),
        /** id = <code>48</code>, name = <code>"top"</code> */
        TOP("top", 48, 332, 5),
        /** id = <code>96</code>, name = <code>"toUpperMethodCallExpr"</code> */
        TOUPPERMETHODCALLEXPR("toUpperMethodCallExpr", 96, 779, 9),
        /** id = <code>97</code>, name = <code>"trimMethodCallExpr"</code> */
        TRIMMETHODCALLEXPR("trimMethodCallExpr", 97, 788, 9),
        /** id = <code>148</code>, name = <code>"typeNVPInUri"</code> */
        TYPENVPINURI("typeNVPInUri", 148, 1179, 8),
        /** id = <code>269</code>, name = <code>"unencoded"</code> */
        UNENCODED("unencoded", 269, 1865, 9),
        /** id = <code>288</code>, name = <code>"unreserved"</code> */
        UNRESERVED("unreserved", 288, 2044, 7),
        /** id = <code>16</code>, name = <code>"value"</code> */
        VALUE("value", 16, 164, 3),
        /** id = <code>146</code>, name = <code>"value-separator"</code> */
        VALUE_SEPARATOR("value-separator", 146, 1169, 1),
        /** id = <code>297</code>, name = <code>"WSP"</code> */
        WSP("WSP", 297, 2080, 3),
        /** id = <code>225</code>, name = <code>"year"</code> */
        YEAR("year", 225, 1650, 2),
        /** id = <code>99</code>, name = <code>"yearMethodCallExpr"</code> */
        YEARMETHODCALLEXPR("yearMethodCallExpr", 99, 808, 9),
        /** id = <code>100</code>, name = <code>"yearsMethodCallExpr"</code> */
        YEARSMETHODCALLEXPR("yearsMethodCallExpr", 100, 817, 9),
        /** id = <code>224</code>, name = <code>"zeroToFiftyNine"</code> */
        ZEROTOFIFTYNINE("zeroToFiftyNine", 224, 1641, 9);
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
    private static GrammarUnderTest factoryInstance = null;
    private GrammarUnderTest(Rule[] rules, Udt[] udts, Opcode[] opcodes){
        super(rules, udts, opcodes);
    }

    private static Rule[] getRules(){
    	Rule[] rules = new Rule[298];
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
    	Opcode[] op = new Opcode[2083];
        {int[] a = {1,4,5,6,10,11}; op[0] = getOpcodeCat(a);}
        {int[] a = {2,3}; op[1] = getOpcodeAlt(a);}
        {char[] a = {104,116,116,112,115}; op[2] = getOpcodeTls(a);}
        {char[] a = {104,116,116,112}; op[3] = getOpcodeTls(a);}
        {char[] a = {58,47,47}; op[4] = getOpcodeTls(a);}
        op[5] = getOpcodeRnm(275, 1881); // host
        op[6] = getOpcodeRep((char)0, (char)1, 7);
        {int[] a = {8,9}; op[7] = getOpcodeCat(a);}
        {char[] a = {58}; op[8] = getOpcodeTls(a);}
        op[9] = getOpcodeRnm(276, 1885); // port
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
        op[20] = getOpcodeRnm(285, 2032); // segment-nz
        {char[] a = {47}; op[21] = getOpcodeTls(a);}
        {int[] a = {23,24}; op[22] = getOpcodeCat(a);}
        op[23] = getOpcodeRnm(3, 28); // resourcePath
        op[24] = getOpcodeRep((char)0, (char)1, 25);
        {int[] a = {26,27}; op[25] = getOpcodeCat(a);}
        {char[] a = {63}; op[26] = getOpcodeTls(a);}
        op[27] = getOpcodeRnm(36, 258); // queryOptions
        {int[] a = {29,37,38,42,46,50,54,58}; op[28] = getOpcodeAlt(a);}
        {int[] a = {30,34,35}; op[29] = getOpcodeCat(a);}
        op[30] = getOpcodeRep((char)0, (char)1, 31);
        {int[] a = {32,33}; op[31] = getOpcodeCat(a);}
        op[32] = getOpcodeRnm(186, 1353); // entityContainerName
        {char[] a = {46}; op[33] = getOpcodeTls(a);}
        op[34] = getOpcodeRnm(165, 1282); // entitySetName
        op[35] = getOpcodeRep((char)0, (char)1, 36);
        op[36] = getOpcodeRnm(4, 62); // collectionNavigation
        op[37] = getOpcodeRnm(18, 195); // actionCall
        {int[] a = {39,40}; op[38] = getOpcodeCat(a);}
        op[39] = getOpcodeRnm(27, 213); // entityColFunctionCall
        op[40] = getOpcodeRep((char)0, (char)1, 41);
        op[41] = getOpcodeRnm(4, 62); // collectionNavigation
        {int[] a = {43,44}; op[42] = getOpcodeCat(a);}
        op[43] = getOpcodeRnm(26, 208); // entityFunctionCall
        op[44] = getOpcodeRep((char)0, (char)1, 45);
        op[45] = getOpcodeRnm(10, 94); // singleNavigation
        {int[] a = {47,48}; op[46] = getOpcodeCat(a);}
        op[47] = getOpcodeRnm(29, 223); // complexColFunctionCall
        op[48] = getOpcodeRep((char)0, (char)1, 49);
        op[49] = getOpcodeRnm(11, 134); // collectionPath
        {int[] a = {51,52}; op[50] = getOpcodeCat(a);}
        op[51] = getOpcodeRnm(28, 218); // complexFunctionCall
        op[52] = getOpcodeRep((char)0, (char)1, 53);
        op[53] = getOpcodeRnm(13, 140); // complexPath
        {int[] a = {55,56}; op[54] = getOpcodeCat(a);}
        op[55] = getOpcodeRnm(31, 233); // primitiveColFunctionCall
        op[56] = getOpcodeRep((char)0, (char)1, 57);
        op[57] = getOpcodeRnm(11, 134); // collectionPath
        {int[] a = {59,60}; op[58] = getOpcodeCat(a);}
        op[59] = getOpcodeRnm(30, 228); // primitiveFunctionCall
        op[60] = getOpcodeRep((char)0, (char)1, 61);
        op[61] = getOpcodeRnm(12, 137); // singlePath
        {int[] a = {63,67}; op[62] = getOpcodeCat(a);}
        op[63] = getOpcodeRep((char)0, (char)1, 64);
        {int[] a = {65,66}; op[64] = getOpcodeCat(a);}
        {char[] a = {47}; op[65] = getOpcodeTls(a);}
        op[66] = getOpcodeRnm(160, 1263); // qualifiedEntityTypeName
        {int[] a = {68,72,73}; op[67] = getOpcodeAlt(a);}
        {int[] a = {69,70}; op[68] = getOpcodeCat(a);}
        op[69] = getOpcodeRnm(5, 74); // keyPredicate
        op[70] = getOpcodeRep((char)0, (char)1, 71);
        op[71] = getOpcodeRnm(10, 94); // singleNavigation
        op[72] = getOpcodeRnm(11, 134); // collectionPath
        {char[] a = {}; op[73] = getOpcodeTls(a);}
        {int[] a = {75,76}; op[74] = getOpcodeAlt(a);}
        op[75] = getOpcodeRnm(6, 77); // simpleKey
        op[76] = getOpcodeRnm(7, 81); // compoundKey
        {int[] a = {78,79,80}; op[77] = getOpcodeCat(a);}
        {char[] a = {40}; op[78] = getOpcodeTls(a);}
        op[79] = getOpcodeRnm(9, 93); // keyPropertyValue
        {char[] a = {41}; op[80] = getOpcodeTls(a);}
        {int[] a = {82,83,84,88}; op[81] = getOpcodeCat(a);}
        {char[] a = {40}; op[82] = getOpcodeTls(a);}
        op[83] = getOpcodeRnm(8, 89); // keyValuePair
        op[84] = getOpcodeRep((char)0, Character.MAX_VALUE, 85);
        {int[] a = {86,87}; op[85] = getOpcodeCat(a);}
        op[86] = getOpcodeRnm(272, 1876); // COMMA
        op[87] = getOpcodeRnm(8, 89); // keyValuePair
        {char[] a = {41}; op[88] = getOpcodeTls(a);}
        {int[] a = {90,91,92}; op[89] = getOpcodeCat(a);}
        op[90] = getOpcodeRnm(177, 1342); // primitiveKeyProperty
        {char[] a = {61}; op[91] = getOpcodeTls(a);}
        op[92] = getOpcodeRnm(9, 93); // keyPropertyValue
        op[93] = getOpcodeRnm(195, 1368); // primitiveLiteral
        {int[] a = {95,99}; op[94] = getOpcodeCat(a);}
        op[95] = getOpcodeRep((char)0, (char)1, 96);
        {int[] a = {97,98}; op[96] = getOpcodeCat(a);}
        {char[] a = {47}; op[97] = getOpcodeTls(a);}
        op[98] = getOpcodeRnm(160, 1263); // qualifiedEntityTypeName
        {int[] a = {100,104,132,133}; op[99] = getOpcodeAlt(a);}
        {int[] a = {101,102,103}; op[100] = getOpcodeCat(a);}
        op[101] = getOpcodeRnm(15, 161); // links
        {char[] a = {47}; op[102] = getOpcodeTls(a);}
        op[103] = getOpcodeRnm(183, 1348); // navigationProperty
        {int[] a = {105,106}; op[104] = getOpcodeCat(a);}
        {char[] a = {47}; op[105] = getOpcodeTls(a);}
        {int[] a = {107,111,115,119,123,127,131}; op[106] = getOpcodeAlt(a);}
        {int[] a = {108,109}; op[107] = getOpcodeCat(a);}
        op[108] = getOpcodeRnm(185, 1352); // entityColNavigationProperty
        op[109] = getOpcodeRep((char)0, (char)1, 110);
        op[110] = getOpcodeRnm(4, 62); // collectionNavigation
        {int[] a = {112,113}; op[111] = getOpcodeCat(a);}
        op[112] = getOpcodeRnm(184, 1351); // entityNavigationProperty
        op[113] = getOpcodeRep((char)0, (char)1, 114);
        op[114] = getOpcodeRnm(10, 94); // singleNavigation
        {int[] a = {116,117}; op[115] = getOpcodeCat(a);}
        op[116] = getOpcodeRnm(181, 1346); // complexColProperty
        op[117] = getOpcodeRep((char)0, (char)1, 118);
        op[118] = getOpcodeRnm(11, 134); // collectionPath
        {int[] a = {120,121}; op[119] = getOpcodeCat(a);}
        op[120] = getOpcodeRnm(180, 1345); // complexProperty
        op[121] = getOpcodeRep((char)0, (char)1, 122);
        op[122] = getOpcodeRnm(13, 140); // complexPath
        {int[] a = {124,125}; op[123] = getOpcodeCat(a);}
        op[124] = getOpcodeRnm(179, 1344); // primitiveColProperty
        op[125] = getOpcodeRep((char)0, (char)1, 126);
        op[126] = getOpcodeRnm(11, 134); // collectionPath
        {int[] a = {128,129}; op[127] = getOpcodeCat(a);}
        op[128] = getOpcodeRnm(176, 1339); // primitiveProperty
        op[129] = getOpcodeRep((char)0, (char)1, 130);
        op[130] = getOpcodeRnm(12, 137); // singlePath
        op[131] = getOpcodeRnm(182, 1347); // streamProperty
        op[132] = getOpcodeRnm(17, 167); // boundOperation
        {char[] a = {}; op[133] = getOpcodeTls(a);}
        {int[] a = {135,136}; op[134] = getOpcodeAlt(a);}
        op[135] = getOpcodeRnm(14, 158); // count
        op[136] = getOpcodeRnm(17, 167); // boundOperation
        {int[] a = {138,139}; op[137] = getOpcodeAlt(a);}
        op[138] = getOpcodeRnm(16, 164); // value
        op[139] = getOpcodeRnm(17, 167); // boundOperation
        {int[] a = {141,145}; op[140] = getOpcodeCat(a);}
        op[141] = getOpcodeRep((char)0, (char)1, 142);
        {int[] a = {143,144}; op[142] = getOpcodeCat(a);}
        {char[] a = {47}; op[143] = getOpcodeTls(a);}
        op[144] = getOpcodeRnm(161, 1267); // qualifiedComplexTypeName
        {int[] a = {146,157}; op[145] = getOpcodeAlt(a);}
        {int[] a = {147,148}; op[146] = getOpcodeCat(a);}
        {char[] a = {47}; op[147] = getOpcodeTls(a);}
        {int[] a = {149,153}; op[148] = getOpcodeAlt(a);}
        {int[] a = {150,151}; op[149] = getOpcodeCat(a);}
        op[150] = getOpcodeRnm(180, 1345); // complexProperty
        op[151] = getOpcodeRep((char)0, (char)1, 152);
        op[152] = getOpcodeRnm(13, 140); // complexPath
        {int[] a = {154,155}; op[153] = getOpcodeCat(a);}
        op[154] = getOpcodeRnm(176, 1339); // primitiveProperty
        op[155] = getOpcodeRep((char)0, (char)1, 156);
        op[156] = getOpcodeRnm(12, 137); // singlePath
        op[157] = getOpcodeRnm(17, 167); // boundOperation
        {int[] a = {159,160}; op[158] = getOpcodeCat(a);}
        {char[] a = {47}; op[159] = getOpcodeTls(a);}
        {char[] a = {36,99,111,117,110,116}; op[160] = getOpcodeTbs(a);}
        {int[] a = {162,163}; op[161] = getOpcodeCat(a);}
        {char[] a = {47}; op[162] = getOpcodeTls(a);}
        {char[] a = {36,108,105,110,107,115}; op[163] = getOpcodeTbs(a);}
        {int[] a = {165,166}; op[164] = getOpcodeCat(a);}
        {char[] a = {47}; op[165] = getOpcodeTls(a);}
        {char[] a = {36,118,97,108,117,101}; op[166] = getOpcodeTbs(a);}
        {int[] a = {168,169}; op[167] = getOpcodeCat(a);}
        {char[] a = {47}; op[168] = getOpcodeTls(a);}
        {int[] a = {170,171,175,179,183,187,191}; op[169] = getOpcodeAlt(a);}
        op[170] = getOpcodeRnm(19, 201); // boundActionCall
        {int[] a = {172,173}; op[171] = getOpcodeCat(a);}
        op[172] = getOpcodeRnm(21, 203); // boundEntityColFuncCall
        op[173] = getOpcodeRep((char)0, (char)1, 174);
        op[174] = getOpcodeRnm(4, 62); // collectionNavigation
        {int[] a = {176,177}; op[175] = getOpcodeCat(a);}
        op[176] = getOpcodeRnm(20, 202); // boundEntityFuncCall
        op[177] = getOpcodeRep((char)0, (char)1, 178);
        op[178] = getOpcodeRnm(10, 94); // singleNavigation
        {int[] a = {180,181}; op[179] = getOpcodeCat(a);}
        op[180] = getOpcodeRnm(23, 205); // boundComplexColFuncCall
        op[181] = getOpcodeRep((char)0, (char)1, 182);
        op[182] = getOpcodeRnm(11, 134); // collectionPath
        {int[] a = {184,185}; op[183] = getOpcodeCat(a);}
        op[184] = getOpcodeRnm(22, 204); // boundComplexFuncCall
        op[185] = getOpcodeRep((char)0, (char)1, 186);
        op[186] = getOpcodeRnm(13, 140); // complexPath
        {int[] a = {188,189}; op[187] = getOpcodeCat(a);}
        op[188] = getOpcodeRnm(25, 207); // boundPrimitiveColFuncCall
        op[189] = getOpcodeRep((char)0, (char)1, 190);
        op[190] = getOpcodeRnm(11, 134); // collectionPath
        {int[] a = {192,193}; op[191] = getOpcodeCat(a);}
        op[192] = getOpcodeRnm(24, 206); // boundPrimitiveFuncCall
        op[193] = getOpcodeRep((char)0, (char)1, 194);
        op[194] = getOpcodeRnm(12, 137); // singlePath
        {int[] a = {196,198,199}; op[195] = getOpcodeCat(a);}
        op[196] = getOpcodeRep((char)0, (char)1, 197);
        op[197] = getOpcodeRnm(55, 392); // operationQualifier
        op[198] = getOpcodeRnm(187, 1354); // action
        op[199] = getOpcodeRep((char)0, (char)1, 200);
        {char[] a = {40,41}; op[200] = getOpcodeTls(a);}
        op[201] = getOpcodeRnm(18, 195); // actionCall
        op[202] = getOpcodeRnm(26, 208); // entityFunctionCall
        op[203] = getOpcodeRnm(27, 213); // entityColFunctionCall
        op[204] = getOpcodeRnm(28, 218); // complexFunctionCall
        op[205] = getOpcodeRnm(29, 223); // complexColFunctionCall
        op[206] = getOpcodeRnm(30, 228); // primitiveFunctionCall
        op[207] = getOpcodeRnm(31, 233); // primitiveColFunctionCall
        {int[] a = {209,211,212}; op[208] = getOpcodeCat(a);}
        op[209] = getOpcodeRep((char)0, (char)1, 210);
        op[210] = getOpcodeRnm(55, 392); // operationQualifier
        op[211] = getOpcodeRnm(189, 1362); // entityFunction
        op[212] = getOpcodeRnm(32, 238); // functionParameters
        {int[] a = {214,216,217}; op[213] = getOpcodeCat(a);}
        op[214] = getOpcodeRep((char)0, (char)1, 215);
        op[215] = getOpcodeRnm(55, 392); // operationQualifier
        op[216] = getOpcodeRnm(190, 1363); // entityColFunction
        op[217] = getOpcodeRnm(32, 238); // functionParameters
        {int[] a = {219,221,222}; op[218] = getOpcodeCat(a);}
        op[219] = getOpcodeRep((char)0, (char)1, 220);
        op[220] = getOpcodeRnm(55, 392); // operationQualifier
        op[221] = getOpcodeRnm(191, 1364); // complexFunction
        op[222] = getOpcodeRnm(32, 238); // functionParameters
        {int[] a = {224,226,227}; op[223] = getOpcodeCat(a);}
        op[224] = getOpcodeRep((char)0, (char)1, 225);
        op[225] = getOpcodeRnm(55, 392); // operationQualifier
        op[226] = getOpcodeRnm(192, 1365); // complexColFunction
        op[227] = getOpcodeRnm(32, 238); // functionParameters
        {int[] a = {229,231,232}; op[228] = getOpcodeCat(a);}
        op[229] = getOpcodeRep((char)0, (char)1, 230);
        op[230] = getOpcodeRnm(55, 392); // operationQualifier
        op[231] = getOpcodeRnm(193, 1366); // primitiveFunction
        op[232] = getOpcodeRnm(32, 238); // functionParameters
        {int[] a = {234,236,237}; op[233] = getOpcodeCat(a);}
        op[234] = getOpcodeRep((char)0, (char)1, 235);
        op[235] = getOpcodeRnm(55, 392); // operationQualifier
        op[236] = getOpcodeRnm(194, 1367); // primitiveColFunction
        op[237] = getOpcodeRnm(32, 238); // functionParameters
        {int[] a = {239,240,247}; op[238] = getOpcodeCat(a);}
        {char[] a = {40}; op[239] = getOpcodeTls(a);}
        op[240] = getOpcodeRep((char)0, (char)1, 241);
        {int[] a = {242,243}; op[241] = getOpcodeCat(a);}
        op[242] = getOpcodeRnm(33, 248); // functionParameter
        op[243] = getOpcodeRep((char)0, Character.MAX_VALUE, 244);
        {int[] a = {245,246}; op[244] = getOpcodeCat(a);}
        op[245] = getOpcodeRnm(272, 1876); // COMMA
        op[246] = getOpcodeRnm(33, 248); // functionParameter
        {char[] a = {41}; op[247] = getOpcodeTls(a);}
        {int[] a = {249,250,251}; op[248] = getOpcodeCat(a);}
        op[249] = getOpcodeRnm(34, 254); // functionParameterName
        {char[] a = {61}; op[250] = getOpcodeTls(a);}
        {int[] a = {252,253}; op[251] = getOpcodeAlt(a);}
        op[252] = getOpcodeRnm(35, 255); // parameterAlias
        op[253] = getOpcodeRnm(195, 1368); // primitiveLiteral
        op[254] = getOpcodeRnm(169, 1286); // odataIdentifier
        {int[] a = {256,257}; op[255] = getOpcodeCat(a);}
        {char[] a = {64}; op[256] = getOpcodeTls(a);}
        op[257] = getOpcodeRnm(169, 1286); // odataIdentifier
        {int[] a = {259,260}; op[258] = getOpcodeCat(a);}
        op[259] = getOpcodeRnm(37, 264); // queryOption
        op[260] = getOpcodeRep((char)0, Character.MAX_VALUE, 261);
        {int[] a = {262,263}; op[261] = getOpcodeCat(a);}
        {char[] a = {38}; op[262] = getOpcodeTls(a);}
        op[263] = getOpcodeRnm(37, 264); // queryOption
        {int[] a = {265,266,267,268}; op[264] = getOpcodeAlt(a);}
        op[265] = getOpcodeRnm(38, 269); // systemQueryOption
        op[266] = getOpcodeRnm(61, 437); // aliasAndValue
        op[267] = getOpcodeRnm(62, 441); // parameterNameAndValue
        op[268] = getOpcodeRnm(64, 450); // customQueryOption
        {int[] a = {270,271,272,273,274,275,276,277,278}; op[269] = getOpcodeAlt(a);}
        op[270] = getOpcodeRnm(39, 279); // expand
        op[271] = getOpcodeRnm(42, 303); // filter
        op[272] = getOpcodeRnm(43, 307); // orderby
        op[273] = getOpcodeRnm(47, 327); // skip
        op[274] = getOpcodeRnm(48, 332); // top
        op[275] = getOpcodeRnm(49, 337); // format
        op[276] = getOpcodeRnm(50, 348); // inlinecount
        op[277] = getOpcodeRnm(51, 354); // select
        op[278] = getOpcodeRnm(60, 425); // skiptoken
        {int[] a = {280,281,282}; op[279] = getOpcodeCat(a);}
        {char[] a = {36,101,120,112,97,110,100}; op[280] = getOpcodeTbs(a);}
        {char[] a = {61}; op[281] = getOpcodeTls(a);}
        op[282] = getOpcodeRnm(40, 283); // expandClause
        {int[] a = {284,285}; op[283] = getOpcodeCat(a);}
        op[284] = getOpcodeRnm(41, 289); // expandItem
        op[285] = getOpcodeRep((char)0, Character.MAX_VALUE, 286);
        {int[] a = {287,288}; op[286] = getOpcodeCat(a);}
        op[287] = getOpcodeRnm(272, 1876); // COMMA
        op[288] = getOpcodeRnm(41, 289); // expandItem
        {int[] a = {290,294,295}; op[289] = getOpcodeCat(a);}
        op[290] = getOpcodeRep((char)0, (char)1, 291);
        {int[] a = {292,293}; op[291] = getOpcodeCat(a);}
        op[292] = getOpcodeRnm(160, 1263); // qualifiedEntityTypeName
        {char[] a = {47}; op[293] = getOpcodeTls(a);}
        op[294] = getOpcodeRnm(183, 1348); // navigationProperty
        op[295] = getOpcodeRep((char)0, Character.MAX_VALUE, 296);
        {int[] a = {297,298,302}; op[296] = getOpcodeCat(a);}
        {char[] a = {47}; op[297] = getOpcodeTls(a);}
        op[298] = getOpcodeRep((char)0, (char)1, 299);
        {int[] a = {300,301}; op[299] = getOpcodeCat(a);}
        op[300] = getOpcodeRnm(160, 1263); // qualifiedEntityTypeName
        {char[] a = {47}; op[301] = getOpcodeTls(a);}
        op[302] = getOpcodeRnm(183, 1348); // navigationProperty
        {int[] a = {304,305,306}; op[303] = getOpcodeCat(a);}
        {char[] a = {36,102,105,108,116,101,114}; op[304] = getOpcodeTbs(a);}
        {char[] a = {61}; op[305] = getOpcodeTls(a);}
        op[306] = getOpcodeRnm(68, 496); // boolCommonExpr
        {int[] a = {308,309,310}; op[307] = getOpcodeCat(a);}
        {char[] a = {36,111,114,100,101,114,98,121}; op[308] = getOpcodeTbs(a);}
        {char[] a = {61}; op[309] = getOpcodeTls(a);}
        op[310] = getOpcodeRnm(44, 311); // orderbyClause
        {int[] a = {312,313}; op[311] = getOpcodeCat(a);}
        op[312] = getOpcodeRnm(45, 317); // orderbyItem
        op[313] = getOpcodeRep((char)0, Character.MAX_VALUE, 314);
        {int[] a = {315,316}; op[314] = getOpcodeCat(a);}
        op[315] = getOpcodeRnm(272, 1876); // COMMA
        op[316] = getOpcodeRnm(45, 317); // orderbyItem
        {int[] a = {318,319}; op[317] = getOpcodeCat(a);}
        op[318] = getOpcodeRnm(67, 480); // commonExpr
        op[319] = getOpcodeRep((char)0, (char)1, 320);
        {int[] a = {321,323}; op[320] = getOpcodeCat(a);}
        op[321] = getOpcodeRep((char)1, Character.MAX_VALUE, 322);
        op[322] = getOpcodeRnm(297, 2080); // WSP
        op[323] = getOpcodeRnm(46, 324); // orderAscDesc
        {int[] a = {325,326}; op[324] = getOpcodeAlt(a);}
        {char[] a = {97,115,99}; op[325] = getOpcodeTbs(a);}
        {char[] a = {100,101,115,99}; op[326] = getOpcodeTbs(a);}
        {int[] a = {328,329,330}; op[327] = getOpcodeCat(a);}
        {char[] a = {36,115,107,105,112}; op[328] = getOpcodeTbs(a);}
        {char[] a = {61}; op[329] = getOpcodeTls(a);}
        op[330] = getOpcodeRep((char)1, Character.MAX_VALUE, 331);
        op[331] = getOpcodeRnm(292, 2068); // DIGIT
        {int[] a = {333,334,335}; op[332] = getOpcodeCat(a);}
        {char[] a = {36,116,111,112}; op[333] = getOpcodeTbs(a);}
        {char[] a = {61}; op[334] = getOpcodeTls(a);}
        op[335] = getOpcodeRep((char)1, Character.MAX_VALUE, 336);
        op[336] = getOpcodeRnm(292, 2068); // DIGIT
        {int[] a = {338,339,340}; op[337] = getOpcodeCat(a);}
        {char[] a = {36,102,111,114,109,97,116}; op[338] = getOpcodeTbs(a);}
        {char[] a = {61}; op[339] = getOpcodeTls(a);}
        {int[] a = {341,342,343,344}; op[340] = getOpcodeAlt(a);}
        {char[] a = {97,116,111,109}; op[341] = getOpcodeTbs(a);}
        {char[] a = {106,115,111,110}; op[342] = getOpcodeTbs(a);}
        {char[] a = {120,109,108}; op[343] = getOpcodeTbs(a);}
        op[344] = getOpcodeRep((char)1, Character.MAX_VALUE, 345);
        {int[] a = {346,347}; op[345] = getOpcodeAlt(a);}
        op[346] = getOpcodeRnm(286, 2034); // pchar
        {char[] a = {47}; op[347] = getOpcodeTls(a);}
        {int[] a = {349,350,351}; op[348] = getOpcodeCat(a);}
        {char[] a = {36,105,110,108,105,110,101,99,111,117,110,116}; op[349] = getOpcodeTbs(a);}
        {char[] a = {61}; op[350] = getOpcodeTls(a);}
        {int[] a = {352,353}; op[351] = getOpcodeAlt(a);}
        {char[] a = {97,108,108,112,97,103,101,115}; op[352] = getOpcodeTbs(a);}
        {char[] a = {110,111,110,101}; op[353] = getOpcodeTbs(a);}
        {int[] a = {355,356,357}; op[354] = getOpcodeCat(a);}
        {char[] a = {36,115,101,108,101,99,116}; op[355] = getOpcodeTbs(a);}
        {char[] a = {61}; op[356] = getOpcodeTls(a);}
        op[357] = getOpcodeRnm(52, 358); // selectClause
        {int[] a = {359,360}; op[358] = getOpcodeCat(a);}
        op[359] = getOpcodeRnm(53, 364); // selectItem
        op[360] = getOpcodeRep((char)0, Character.MAX_VALUE, 361);
        {int[] a = {362,363}; op[361] = getOpcodeCat(a);}
        op[362] = getOpcodeRnm(272, 1876); // COMMA
        op[363] = getOpcodeRnm(53, 364); // selectItem
        {int[] a = {365,366,367}; op[364] = getOpcodeAlt(a);}
        op[365] = getOpcodeRnm(274, 1880); // STAR
        op[366] = getOpcodeRnm(54, 389); // allOperationsInContainer
        {int[] a = {368,372}; op[367] = getOpcodeCat(a);}
        op[368] = getOpcodeRep((char)0, (char)1, 369);
        {int[] a = {370,371}; op[369] = getOpcodeCat(a);}
        op[370] = getOpcodeRnm(160, 1263); // qualifiedEntityTypeName
        {char[] a = {47}; op[371] = getOpcodeTls(a);}
        {int[] a = {373,379,387,388}; op[372] = getOpcodeAlt(a);}
        {int[] a = {374,375}; op[373] = getOpcodeCat(a);}
        op[374] = getOpcodeRnm(183, 1348); // navigationProperty
        op[375] = getOpcodeRep((char)0, (char)1, 376);
        {int[] a = {377,378}; op[376] = getOpcodeCat(a);}
        {char[] a = {47}; op[377] = getOpcodeTls(a);}
        op[378] = getOpcodeRnm(53, 364); // selectItem
        {int[] a = {380,386}; op[379] = getOpcodeCat(a);}
        op[380] = getOpcodeRep((char)0, Character.MAX_VALUE, 381);
        {int[] a = {382,385}; op[381] = getOpcodeCat(a);}
        {int[] a = {383,384}; op[382] = getOpcodeAlt(a);}
        op[383] = getOpcodeRnm(180, 1345); // complexProperty
        op[384] = getOpcodeRnm(181, 1346); // complexColProperty
        {char[] a = {47}; op[385] = getOpcodeTls(a);}
        op[386] = getOpcodeRnm(175, 1333); // property
        op[387] = getOpcodeRnm(56, 399); // qualifiedActionName
        op[388] = getOpcodeRnm(57, 408); // qualifiedFunctionName
        {int[] a = {390,391}; op[389] = getOpcodeCat(a);}
        op[390] = getOpcodeRnm(55, 392); // operationQualifier
        op[391] = getOpcodeRnm(274, 1880); // STAR
        {int[] a = {393,397,398}; op[392] = getOpcodeCat(a);}
        op[393] = getOpcodeRep((char)0, (char)1, 394);
        {int[] a = {395,396}; op[394] = getOpcodeCat(a);}
        op[395] = getOpcodeRnm(163, 1275); // namespace
        {char[] a = {46}; op[396] = getOpcodeTls(a);}
        op[397] = getOpcodeRnm(186, 1353); // entityContainerName
        {char[] a = {46}; op[398] = getOpcodeTls(a);}
        {int[] a = {400,402,403}; op[399] = getOpcodeCat(a);}
        op[400] = getOpcodeRep((char)0, (char)1, 401);
        op[401] = getOpcodeRnm(55, 392); // operationQualifier
        op[402] = getOpcodeRnm(187, 1354); // action
        op[403] = getOpcodeRep((char)0, (char)1, 404);
        {int[] a = {405,406,407}; op[404] = getOpcodeCat(a);}
        {char[] a = {40}; op[405] = getOpcodeTls(a);}
        op[406] = getOpcodeRnm(58, 417); // parameterTypeNames
        {char[] a = {41}; op[407] = getOpcodeTls(a);}
        {int[] a = {409,411,412}; op[408] = getOpcodeCat(a);}
        op[409] = getOpcodeRep((char)0, (char)1, 410);
        op[410] = getOpcodeRnm(55, 392); // operationQualifier
        op[411] = getOpcodeRnm(188, 1355); // function
        op[412] = getOpcodeRep((char)0, (char)1, 413);
        {int[] a = {414,415,416}; op[413] = getOpcodeCat(a);}
        {char[] a = {40}; op[414] = getOpcodeTls(a);}
        op[415] = getOpcodeRnm(58, 417); // parameterTypeNames
        {char[] a = {41}; op[416] = getOpcodeTls(a);}
        op[417] = getOpcodeRep((char)0, (char)1, 418);
        {int[] a = {419,420}; op[418] = getOpcodeCat(a);}
        op[419] = getOpcodeRnm(59, 424); // parameterTypeName
        op[420] = getOpcodeRep((char)0, Character.MAX_VALUE, 421);
        {int[] a = {422,423}; op[421] = getOpcodeCat(a);}
        op[422] = getOpcodeRnm(272, 1876); // COMMA
        op[423] = getOpcodeRnm(59, 424); // parameterTypeName
        op[424] = getOpcodeRnm(159, 1250); // qualifiedTypeName
        {int[] a = {426,427,428}; op[425] = getOpcodeCat(a);}
        {char[] a = {36,115,107,105,112,116,111,107,101,110}; op[426] = getOpcodeTbs(a);}
        {char[] a = {61}; op[427] = getOpcodeTls(a);}
        op[428] = getOpcodeRep((char)1, Character.MAX_VALUE, 429);
        {int[] a = {430,431,432,433,434,435,436}; op[429] = getOpcodeAlt(a);}
        op[430] = getOpcodeRnm(288, 2044); // unreserved
        op[431] = getOpcodeRnm(287, 2040); // pct-encoded
        op[432] = getOpcodeRnm(290, 2056); // other-delims
        {char[] a = {58}; op[433] = getOpcodeTls(a);}
        {char[] a = {64}; op[434] = getOpcodeTls(a);}
        {char[] a = {36}; op[435] = getOpcodeTls(a);}
        {char[] a = {61}; op[436] = getOpcodeTls(a);}
        {int[] a = {438,439,440}; op[437] = getOpcodeCat(a);}
        op[438] = getOpcodeRnm(35, 255); // parameterAlias
        {char[] a = {61}; op[439] = getOpcodeTls(a);}
        op[440] = getOpcodeRnm(63, 445); // parameterValue
        {int[] a = {442,443,444}; op[441] = getOpcodeCat(a);}
        op[442] = getOpcodeRnm(34, 254); // functionParameterName
        {char[] a = {61}; op[443] = getOpcodeTls(a);}
        op[444] = getOpcodeRnm(63, 445); // parameterValue
        {int[] a = {446,447,448,449}; op[445] = getOpcodeAlt(a);}
        op[446] = getOpcodeRnm(195, 1368); // primitiveLiteral
        op[447] = getOpcodeRnm(137, 1126); // complexInUri
        op[448] = getOpcodeRnm(138, 1143); // complexColInUri
        op[449] = getOpcodeRnm(139, 1153); // primitiveColInUri
        {int[] a = {451,452}; op[450] = getOpcodeCat(a);}
        op[451] = getOpcodeRnm(65, 456); // customName
        op[452] = getOpcodeRep((char)0, (char)1, 453);
        {int[] a = {454,455}; op[453] = getOpcodeCat(a);}
        {char[] a = {61}; op[454] = getOpcodeTls(a);}
        op[455] = getOpcodeRnm(66, 471); // customValue
        {int[] a = {457,463}; op[456] = getOpcodeCat(a);}
        {int[] a = {458,459,460,461,462}; op[457] = getOpcodeAlt(a);}
        op[458] = getOpcodeRnm(288, 2044); // unreserved
        op[459] = getOpcodeRnm(287, 2040); // pct-encoded
        op[460] = getOpcodeRnm(290, 2056); // other-delims
        {char[] a = {58}; op[461] = getOpcodeTls(a);}
        {char[] a = {64}; op[462] = getOpcodeTls(a);}
        op[463] = getOpcodeRep((char)0, Character.MAX_VALUE, 464);
        {int[] a = {465,466,467,468,469,470}; op[464] = getOpcodeAlt(a);}
        op[465] = getOpcodeRnm(288, 2044); // unreserved
        op[466] = getOpcodeRnm(287, 2040); // pct-encoded
        op[467] = getOpcodeRnm(290, 2056); // other-delims
        {char[] a = {58}; op[468] = getOpcodeTls(a);}
        {char[] a = {64}; op[469] = getOpcodeTls(a);}
        {char[] a = {36}; op[470] = getOpcodeTls(a);}
        op[471] = getOpcodeRep((char)0, Character.MAX_VALUE, 472);
        {int[] a = {473,474,475,476,477,478,479}; op[472] = getOpcodeAlt(a);}
        op[473] = getOpcodeRnm(288, 2044); // unreserved
        op[474] = getOpcodeRnm(287, 2040); // pct-encoded
        op[475] = getOpcodeRnm(290, 2056); // other-delims
        {char[] a = {58}; op[476] = getOpcodeTls(a);}
        {char[] a = {64}; op[477] = getOpcodeTls(a);}
        {char[] a = {36}; op[478] = getOpcodeTls(a);}
        {char[] a = {61}; op[479] = getOpcodeTls(a);}
        {int[] a = {481,489}; op[480] = getOpcodeCat(a);}
        {int[] a = {482,483,484,485,486,487,488}; op[481] = getOpcodeAlt(a);}
        op[482] = getOpcodeRnm(195, 1368); // primitiveLiteral
        op[483] = getOpcodeRnm(69, 516); // firstMemberExpr
        op[484] = getOpcodeRnm(81, 606); // functionExpr
        op[485] = getOpcodeRnm(133, 1090); // negateExpr
        op[486] = getOpcodeRnm(87, 671); // methodCallExpr
        op[487] = getOpcodeRnm(119, 991); // parenExpr
        op[488] = getOpcodeRnm(136, 1113); // castExpr
        op[489] = getOpcodeRep((char)0, (char)1, 490);
        {int[] a = {491,492,493,494,495}; op[490] = getOpcodeAlt(a);}
        op[491] = getOpcodeRnm(128, 1055); // addExpr
        op[492] = getOpcodeRnm(129, 1062); // subExpr
        op[493] = getOpcodeRnm(130, 1069); // mulExpr
        op[494] = getOpcodeRnm(131, 1076); // divExpr
        op[495] = getOpcodeRnm(132, 1083); // modExpr
        {int[] a = {497,512}; op[496] = getOpcodeCat(a);}
        {int[] a = {498,499,500,501,511}; op[497] = getOpcodeAlt(a);}
        op[498] = getOpcodeRnm(135, 1100); // isofExpr
        op[499] = getOpcodeRnm(88, 697); // boolMethodCallExpr
        op[500] = getOpcodeRnm(134, 1095); // notExpr
        {int[] a = {502,503}; op[501] = getOpcodeCat(a);}
        op[502] = getOpcodeRnm(67, 480); // commonExpr
        op[503] = getOpcodeRep((char)0, (char)1, 504);
        {int[] a = {505,506,507,508,509,510}; op[504] = getOpcodeAlt(a);}
        op[505] = getOpcodeRnm(122, 1013); // eqExpr
        op[506] = getOpcodeRnm(123, 1020); // neExpr
        op[507] = getOpcodeRnm(124, 1027); // ltExpr
        op[508] = getOpcodeRnm(125, 1034); // leExpr
        op[509] = getOpcodeRnm(126, 1041); // gtExpr
        op[510] = getOpcodeRnm(127, 1048); // geExpr
        op[511] = getOpcodeRnm(118, 983); // boolParenExpr
        op[512] = getOpcodeRep((char)0, (char)1, 513);
        {int[] a = {514,515}; op[513] = getOpcodeAlt(a);}
        op[514] = getOpcodeRnm(120, 999); // andExpr
        op[515] = getOpcodeRnm(121, 1006); // orExpr
        {int[] a = {517,519}; op[516] = getOpcodeCat(a);}
        op[517] = getOpcodeRep((char)0, (char)1, 518);
        op[518] = getOpcodeRnm(71, 552); // lambdaPredicatePrefixExpr
        op[519] = getOpcodeRnm(70, 520); // memberExpr
        {int[] a = {521,525}; op[520] = getOpcodeCat(a);}
        op[521] = getOpcodeRep((char)0, (char)1, 522);
        {int[] a = {523,524}; op[522] = getOpcodeCat(a);}
        op[523] = getOpcodeRnm(160, 1263); // qualifiedEntityTypeName
        {char[] a = {47}; op[524] = getOpcodeTls(a);}
        {int[] a = {526,530,534,538,542,546,550,551}; op[525] = getOpcodeAlt(a);}
        {int[] a = {527,528}; op[526] = getOpcodeCat(a);}
        op[527] = getOpcodeRnm(185, 1352); // entityColNavigationProperty
        op[528] = getOpcodeRep((char)0, (char)1, 529);
        op[529] = getOpcodeRnm(75, 560); // collectionNavigationExpr
        {int[] a = {531,532}; op[530] = getOpcodeCat(a);}
        op[531] = getOpcodeRnm(184, 1351); // entityNavigationProperty
        op[532] = getOpcodeRep((char)0, (char)1, 533);
        op[533] = getOpcodeRnm(76, 572); // singleNavigationExpr
        {int[] a = {535,536}; op[534] = getOpcodeCat(a);}
        op[535] = getOpcodeRnm(181, 1346); // complexColProperty
        op[536] = getOpcodeRep((char)0, (char)1, 537);
        op[537] = getOpcodeRnm(77, 575); // collectionPathExpr
        {int[] a = {539,540}; op[538] = getOpcodeCat(a);}
        op[539] = getOpcodeRnm(180, 1345); // complexProperty
        op[540] = getOpcodeRep((char)0, (char)1, 541);
        op[541] = getOpcodeRnm(78, 586); // complexPathExpr
        {int[] a = {543,544}; op[542] = getOpcodeCat(a);}
        op[543] = getOpcodeRnm(179, 1344); // primitiveColProperty
        op[544] = getOpcodeRep((char)0, (char)1, 545);
        op[545] = getOpcodeRnm(77, 575); // collectionPathExpr
        {int[] a = {547,548}; op[546] = getOpcodeCat(a);}
        op[547] = getOpcodeRnm(176, 1339); // primitiveProperty
        op[548] = getOpcodeRep((char)0, (char)1, 549);
        op[549] = getOpcodeRnm(79, 602); // singlePathExpr
        op[550] = getOpcodeRnm(182, 1347); // streamProperty
        op[551] = getOpcodeRnm(80, 605); // boundFunctionExpr
        {int[] a = {553,554}; op[552] = getOpcodeCat(a);}
        op[553] = getOpcodeRnm(72, 555); // inscopeVariableExpr
        {char[] a = {47}; op[554] = getOpcodeTls(a);}
        {int[] a = {556,557}; op[555] = getOpcodeAlt(a);}
        op[556] = getOpcodeRnm(73, 558); // implicitVariableExpr
        op[557] = getOpcodeRnm(74, 559); // lambdaVariableExpr
        {char[] a = {36,105,116}; op[558] = getOpcodeTls(a);}
        op[559] = getOpcodeRnm(169, 1286); // odataIdentifier
        {int[] a = {561,562}; op[560] = getOpcodeAlt(a);}
        op[561] = getOpcodeRnm(14, 158); // count
        {int[] a = {563,564,568}; op[562] = getOpcodeCat(a);}
        {char[] a = {47}; op[563] = getOpcodeTls(a);}
        op[564] = getOpcodeRep((char)0, (char)1, 565);
        {int[] a = {566,567}; op[565] = getOpcodeCat(a);}
        op[566] = getOpcodeRnm(160, 1263); // qualifiedEntityTypeName
        {char[] a = {47}; op[567] = getOpcodeTls(a);}
        {int[] a = {569,570,571}; op[568] = getOpcodeAlt(a);}
        op[569] = getOpcodeRnm(80, 605); // boundFunctionExpr
        op[570] = getOpcodeRnm(84, 656); // anyExpr
        op[571] = getOpcodeRnm(85, 664); // allExpr
        {int[] a = {573,574}; op[572] = getOpcodeCat(a);}
        {char[] a = {47}; op[573] = getOpcodeTls(a);}
        op[574] = getOpcodeRnm(70, 520); // memberExpr
        {int[] a = {576,577,580,583}; op[575] = getOpcodeAlt(a);}
        op[576] = getOpcodeRnm(14, 158); // count
        {int[] a = {578,579}; op[577] = getOpcodeCat(a);}
        {char[] a = {47}; op[578] = getOpcodeTls(a);}
        op[579] = getOpcodeRnm(80, 605); // boundFunctionExpr
        {int[] a = {581,582}; op[580] = getOpcodeCat(a);}
        {char[] a = {47}; op[581] = getOpcodeTls(a);}
        op[582] = getOpcodeRnm(84, 656); // anyExpr
        {int[] a = {584,585}; op[583] = getOpcodeCat(a);}
        {char[] a = {47}; op[584] = getOpcodeTls(a);}
        op[585] = getOpcodeRnm(85, 664); // allExpr
        {int[] a = {587,588,592}; op[586] = getOpcodeCat(a);}
        {char[] a = {47}; op[587] = getOpcodeTls(a);}
        op[588] = getOpcodeRep((char)0, (char)1, 589);
        {int[] a = {590,591}; op[589] = getOpcodeCat(a);}
        op[590] = getOpcodeRnm(161, 1267); // qualifiedComplexTypeName
        {char[] a = {47}; op[591] = getOpcodeTls(a);}
        {int[] a = {593,597,601}; op[592] = getOpcodeAlt(a);}
        {int[] a = {594,595}; op[593] = getOpcodeCat(a);}
        op[594] = getOpcodeRnm(176, 1339); // primitiveProperty
        op[595] = getOpcodeRep((char)0, (char)1, 596);
        op[596] = getOpcodeRnm(79, 602); // singlePathExpr
        {int[] a = {598,599}; op[597] = getOpcodeCat(a);}
        op[598] = getOpcodeRnm(180, 1345); // complexProperty
        op[599] = getOpcodeRep((char)0, (char)1, 600);
        op[600] = getOpcodeRnm(78, 586); // complexPathExpr
        op[601] = getOpcodeRnm(80, 605); // boundFunctionExpr
        {int[] a = {603,604}; op[602] = getOpcodeCat(a);}
        {char[] a = {47}; op[603] = getOpcodeTls(a);}
        op[604] = getOpcodeRnm(80, 605); // boundFunctionExpr
        op[605] = getOpcodeRnm(81, 606); // functionExpr
        {int[] a = {607,609}; op[606] = getOpcodeCat(a);}
        op[607] = getOpcodeRep((char)0, (char)1, 608);
        op[608] = getOpcodeRnm(55, 392); // operationQualifier
        {int[] a = {610,615,620,625,630,635}; op[609] = getOpcodeAlt(a);}
        {int[] a = {611,612,613}; op[610] = getOpcodeCat(a);}
        op[611] = getOpcodeRnm(190, 1363); // entityColFunction
        op[612] = getOpcodeRnm(82, 640); // functionExprParameters
        op[613] = getOpcodeRep((char)0, (char)1, 614);
        op[614] = getOpcodeRnm(75, 560); // collectionNavigationExpr
        {int[] a = {616,617,618}; op[615] = getOpcodeCat(a);}
        op[616] = getOpcodeRnm(189, 1362); // entityFunction
        op[617] = getOpcodeRnm(82, 640); // functionExprParameters
        op[618] = getOpcodeRep((char)0, (char)1, 619);
        op[619] = getOpcodeRnm(76, 572); // singleNavigationExpr
        {int[] a = {621,622,623}; op[620] = getOpcodeCat(a);}
        op[621] = getOpcodeRnm(192, 1365); // complexColFunction
        op[622] = getOpcodeRnm(82, 640); // functionExprParameters
        op[623] = getOpcodeRep((char)0, (char)1, 624);
        op[624] = getOpcodeRnm(77, 575); // collectionPathExpr
        {int[] a = {626,627,628}; op[625] = getOpcodeCat(a);}
        op[626] = getOpcodeRnm(191, 1364); // complexFunction
        op[627] = getOpcodeRnm(82, 640); // functionExprParameters
        op[628] = getOpcodeRep((char)0, (char)1, 629);
        op[629] = getOpcodeRnm(78, 586); // complexPathExpr
        {int[] a = {631,632,633}; op[630] = getOpcodeCat(a);}
        op[631] = getOpcodeRnm(194, 1367); // primitiveColFunction
        op[632] = getOpcodeRnm(82, 640); // functionExprParameters
        op[633] = getOpcodeRep((char)0, (char)1, 634);
        op[634] = getOpcodeRnm(77, 575); // collectionPathExpr
        {int[] a = {636,637,638}; op[635] = getOpcodeCat(a);}
        op[636] = getOpcodeRnm(193, 1366); // primitiveFunction
        op[637] = getOpcodeRnm(82, 640); // functionExprParameters
        op[638] = getOpcodeRep((char)0, (char)1, 639);
        op[639] = getOpcodeRnm(79, 602); // singlePathExpr
        {int[] a = {641,642,649}; op[640] = getOpcodeCat(a);}
        {char[] a = {40}; op[641] = getOpcodeTls(a);}
        op[642] = getOpcodeRep((char)0, (char)1, 643);
        {int[] a = {644,645}; op[643] = getOpcodeCat(a);}
        op[644] = getOpcodeRnm(83, 650); // functionExprParameter
        op[645] = getOpcodeRep((char)0, Character.MAX_VALUE, 646);
        {int[] a = {647,648}; op[646] = getOpcodeCat(a);}
        op[647] = getOpcodeRnm(272, 1876); // COMMA
        op[648] = getOpcodeRnm(83, 650); // functionExprParameter
        {char[] a = {41}; op[649] = getOpcodeTls(a);}
        {int[] a = {651,652,653}; op[650] = getOpcodeCat(a);}
        op[651] = getOpcodeRnm(34, 254); // functionParameterName
        {char[] a = {61}; op[652] = getOpcodeTls(a);}
        {int[] a = {654,655}; op[653] = getOpcodeAlt(a);}
        op[654] = getOpcodeRnm(63, 445); // parameterValue
        op[655] = getOpcodeRnm(69, 516); // firstMemberExpr
        {int[] a = {657,658,663}; op[656] = getOpcodeCat(a);}
        {char[] a = {97,110,121,40}; op[657] = getOpcodeTls(a);}
        op[658] = getOpcodeRep((char)0, (char)1, 659);
        {int[] a = {660,661,662}; op[659] = getOpcodeCat(a);}
        op[660] = getOpcodeRnm(74, 559); // lambdaVariableExpr
        {char[] a = {58}; op[661] = getOpcodeTls(a);}
        op[662] = getOpcodeRnm(86, 670); // lambdaPredicateExpr
        {char[] a = {41}; op[663] = getOpcodeTls(a);}
        {int[] a = {665,666,667,668,669}; op[664] = getOpcodeCat(a);}
        {char[] a = {97,108,108,40}; op[665] = getOpcodeTls(a);}
        op[666] = getOpcodeRnm(74, 559); // lambdaVariableExpr
        {char[] a = {58}; op[667] = getOpcodeTls(a);}
        op[668] = getOpcodeRnm(86, 670); // lambdaPredicateExpr
        {char[] a = {41}; op[669] = getOpcodeTls(a);}
        op[670] = getOpcodeRnm(68, 496); // boolCommonExpr
        {int[] a = {672,673,674,675,676,677,678,679,680,681,682,683,684,685,686,687,688,689,690,691,692,693,694,695,696}; op[671] = getOpcodeAlt(a);}
        op[672] = getOpcodeRnm(93, 744); // indexOfMethodCallExpr
        op[673] = getOpcodeRnm(95, 770); // toLowerMethodCallExpr
        op[674] = getOpcodeRnm(96, 779); // toUpperMethodCallExpr
        op[675] = getOpcodeRnm(97, 788); // trimMethodCallExpr
        op[676] = getOpcodeRnm(94, 755); // substringMethodCallExpr
        op[677] = getOpcodeRnm(98, 797); // concatMethodCallExpr
        op[678] = getOpcodeRnm(92, 735); // lengthMethodCallExpr
        op[679] = getOpcodeRnm(99, 808); // yearMethodCallExpr
        op[680] = getOpcodeRnm(100, 817); // yearsMethodCallExpr
        op[681] = getOpcodeRnm(101, 826); // monthMethodCallExpr
        op[682] = getOpcodeRnm(102, 835); // monthsMethodCallExpr
        op[683] = getOpcodeRnm(103, 844); // dayMethodCallExpr
        op[684] = getOpcodeRnm(104, 853); // daysMethodCallExpr
        op[685] = getOpcodeRnm(105, 862); // hourMethodCallExpr
        op[686] = getOpcodeRnm(106, 871); // hoursMethodCallExpr
        op[687] = getOpcodeRnm(107, 880); // minuteMethodCallExpr
        op[688] = getOpcodeRnm(108, 889); // minutesMethodCallExpr
        op[689] = getOpcodeRnm(109, 898); // secondMethodCallExpr
        op[690] = getOpcodeRnm(110, 907); // secondsMethodCallExpr
        op[691] = getOpcodeRnm(111, 916); // roundMethodCallExpr
        op[692] = getOpcodeRnm(112, 925); // floorMethodCallExpr
        op[693] = getOpcodeRnm(113, 934); // ceilingMethodCallExpr
        op[694] = getOpcodeRnm(115, 952); // distanceMethodCallExpr
        op[695] = getOpcodeRnm(116, 963); // geoLengthMethodCallExpr
        op[696] = getOpcodeRnm(114, 943); // getTotalOffsetMinutesExpr
        {int[] a = {698,699,700,701}; op[697] = getOpcodeAlt(a);}
        op[698] = getOpcodeRnm(91, 724); // endsWithMethodCallExpr
        op[699] = getOpcodeRnm(90, 713); // startsWithMethodCallExpr
        op[700] = getOpcodeRnm(89, 702); // substringOfMethodCallExpr
        op[701] = getOpcodeRnm(117, 972); // intersectsMethodCallExpr
        {int[] a = {703,704,705,707,708,709,710,712}; op[702] = getOpcodeCat(a);}
        {char[] a = {115,117,98,115,116,114,105,110,103,111,102}; op[703] = getOpcodeTls(a);}
        {char[] a = {40}; op[704] = getOpcodeTls(a);}
        op[705] = getOpcodeRep((char)0, Character.MAX_VALUE, 706);
        op[706] = getOpcodeRnm(297, 2080); // WSP
        op[707] = getOpcodeRnm(67, 480); // commonExpr
        op[708] = getOpcodeRnm(272, 1876); // COMMA
        op[709] = getOpcodeRnm(67, 480); // commonExpr
        op[710] = getOpcodeRep((char)0, Character.MAX_VALUE, 711);
        op[711] = getOpcodeRnm(297, 2080); // WSP
        {char[] a = {41}; op[712] = getOpcodeTls(a);}
        {int[] a = {714,715,716,718,719,720,721,723}; op[713] = getOpcodeCat(a);}
        {char[] a = {115,116,97,114,116,115,119,105,116,104}; op[714] = getOpcodeTls(a);}
        {char[] a = {40}; op[715] = getOpcodeTls(a);}
        op[716] = getOpcodeRep((char)0, Character.MAX_VALUE, 717);
        op[717] = getOpcodeRnm(297, 2080); // WSP
        op[718] = getOpcodeRnm(67, 480); // commonExpr
        op[719] = getOpcodeRnm(272, 1876); // COMMA
        op[720] = getOpcodeRnm(67, 480); // commonExpr
        op[721] = getOpcodeRep((char)0, Character.MAX_VALUE, 722);
        op[722] = getOpcodeRnm(297, 2080); // WSP
        {char[] a = {41}; op[723] = getOpcodeTls(a);}
        {int[] a = {725,726,727,729,730,731,732,734}; op[724] = getOpcodeCat(a);}
        {char[] a = {101,110,100,115,119,105,116,104}; op[725] = getOpcodeTls(a);}
        {char[] a = {40}; op[726] = getOpcodeTls(a);}
        op[727] = getOpcodeRep((char)0, Character.MAX_VALUE, 728);
        op[728] = getOpcodeRnm(297, 2080); // WSP
        op[729] = getOpcodeRnm(67, 480); // commonExpr
        op[730] = getOpcodeRnm(272, 1876); // COMMA
        op[731] = getOpcodeRnm(67, 480); // commonExpr
        op[732] = getOpcodeRep((char)0, Character.MAX_VALUE, 733);
        op[733] = getOpcodeRnm(297, 2080); // WSP
        {char[] a = {41}; op[734] = getOpcodeTls(a);}
        {int[] a = {736,737,738,740,741,743}; op[735] = getOpcodeCat(a);}
        {char[] a = {108,101,110,103,116,104}; op[736] = getOpcodeTls(a);}
        {char[] a = {40}; op[737] = getOpcodeTls(a);}
        op[738] = getOpcodeRep((char)0, Character.MAX_VALUE, 739);
        op[739] = getOpcodeRnm(297, 2080); // WSP
        op[740] = getOpcodeRnm(67, 480); // commonExpr
        op[741] = getOpcodeRep((char)0, Character.MAX_VALUE, 742);
        op[742] = getOpcodeRnm(297, 2080); // WSP
        {char[] a = {41}; op[743] = getOpcodeTls(a);}
        {int[] a = {745,746,747,749,750,751,752,754}; op[744] = getOpcodeCat(a);}
        {char[] a = {105,110,100,101,120,111,102}; op[745] = getOpcodeTls(a);}
        {char[] a = {40}; op[746] = getOpcodeTls(a);}
        op[747] = getOpcodeRep((char)0, Character.MAX_VALUE, 748);
        op[748] = getOpcodeRnm(297, 2080); // WSP
        op[749] = getOpcodeRnm(67, 480); // commonExpr
        op[750] = getOpcodeRnm(272, 1876); // COMMA
        op[751] = getOpcodeRnm(67, 480); // commonExpr
        op[752] = getOpcodeRep((char)0, Character.MAX_VALUE, 753);
        op[753] = getOpcodeRnm(297, 2080); // WSP
        {char[] a = {41}; op[754] = getOpcodeTls(a);}
        {int[] a = {756,757,758,760,761,762,763,769}; op[755] = getOpcodeCat(a);}
        {char[] a = {115,117,98,115,116,114,105,110,103}; op[756] = getOpcodeTls(a);}
        {char[] a = {40}; op[757] = getOpcodeTls(a);}
        op[758] = getOpcodeRep((char)0, Character.MAX_VALUE, 759);
        op[759] = getOpcodeRnm(297, 2080); // WSP
        op[760] = getOpcodeRnm(67, 480); // commonExpr
        op[761] = getOpcodeRnm(272, 1876); // COMMA
        op[762] = getOpcodeRnm(67, 480); // commonExpr
        op[763] = getOpcodeRep((char)0, (char)1, 764);
        {int[] a = {765,766,767}; op[764] = getOpcodeCat(a);}
        op[765] = getOpcodeRnm(272, 1876); // COMMA
        op[766] = getOpcodeRnm(67, 480); // commonExpr
        op[767] = getOpcodeRep((char)0, Character.MAX_VALUE, 768);
        op[768] = getOpcodeRnm(297, 2080); // WSP
        {char[] a = {41}; op[769] = getOpcodeTls(a);}
        {int[] a = {771,772,773,775,776,778}; op[770] = getOpcodeCat(a);}
        {char[] a = {116,111,108,111,119,101,114}; op[771] = getOpcodeTls(a);}
        {char[] a = {40}; op[772] = getOpcodeTls(a);}
        op[773] = getOpcodeRep((char)0, Character.MAX_VALUE, 774);
        op[774] = getOpcodeRnm(297, 2080); // WSP
        op[775] = getOpcodeRnm(67, 480); // commonExpr
        op[776] = getOpcodeRep((char)0, Character.MAX_VALUE, 777);
        op[777] = getOpcodeRnm(297, 2080); // WSP
        {char[] a = {41}; op[778] = getOpcodeTls(a);}
        {int[] a = {780,781,782,784,785,787}; op[779] = getOpcodeCat(a);}
        {char[] a = {116,111,117,112,112,101,114}; op[780] = getOpcodeTls(a);}
        {char[] a = {40}; op[781] = getOpcodeTls(a);}
        op[782] = getOpcodeRep((char)0, Character.MAX_VALUE, 783);
        op[783] = getOpcodeRnm(297, 2080); // WSP
        op[784] = getOpcodeRnm(67, 480); // commonExpr
        op[785] = getOpcodeRep((char)0, Character.MAX_VALUE, 786);
        op[786] = getOpcodeRnm(297, 2080); // WSP
        {char[] a = {41}; op[787] = getOpcodeTls(a);}
        {int[] a = {789,790,791,793,794,796}; op[788] = getOpcodeCat(a);}
        {char[] a = {116,114,105,109}; op[789] = getOpcodeTls(a);}
        {char[] a = {40}; op[790] = getOpcodeTls(a);}
        op[791] = getOpcodeRep((char)0, Character.MAX_VALUE, 792);
        op[792] = getOpcodeRnm(297, 2080); // WSP
        op[793] = getOpcodeRnm(67, 480); // commonExpr
        op[794] = getOpcodeRep((char)0, Character.MAX_VALUE, 795);
        op[795] = getOpcodeRnm(297, 2080); // WSP
        {char[] a = {41}; op[796] = getOpcodeTls(a);}
        {int[] a = {798,799,800,802,803,804,805,807}; op[797] = getOpcodeCat(a);}
        {char[] a = {99,111,110,99,97,116}; op[798] = getOpcodeTls(a);}
        {char[] a = {40}; op[799] = getOpcodeTls(a);}
        op[800] = getOpcodeRep((char)0, Character.MAX_VALUE, 801);
        op[801] = getOpcodeRnm(297, 2080); // WSP
        op[802] = getOpcodeRnm(67, 480); // commonExpr
        op[803] = getOpcodeRnm(272, 1876); // COMMA
        op[804] = getOpcodeRnm(67, 480); // commonExpr
        op[805] = getOpcodeRep((char)0, Character.MAX_VALUE, 806);
        op[806] = getOpcodeRnm(297, 2080); // WSP
        {char[] a = {41}; op[807] = getOpcodeTls(a);}
        {int[] a = {809,810,811,813,814,816}; op[808] = getOpcodeCat(a);}
        {char[] a = {121,101,97,114}; op[809] = getOpcodeTls(a);}
        {char[] a = {40}; op[810] = getOpcodeTls(a);}
        op[811] = getOpcodeRep((char)0, Character.MAX_VALUE, 812);
        op[812] = getOpcodeRnm(297, 2080); // WSP
        op[813] = getOpcodeRnm(67, 480); // commonExpr
        op[814] = getOpcodeRep((char)0, Character.MAX_VALUE, 815);
        op[815] = getOpcodeRnm(297, 2080); // WSP
        {char[] a = {41}; op[816] = getOpcodeTls(a);}
        {int[] a = {818,819,820,822,823,825}; op[817] = getOpcodeCat(a);}
        {char[] a = {121,101,97,114,115}; op[818] = getOpcodeTls(a);}
        {char[] a = {40}; op[819] = getOpcodeTls(a);}
        op[820] = getOpcodeRep((char)0, Character.MAX_VALUE, 821);
        op[821] = getOpcodeRnm(297, 2080); // WSP
        op[822] = getOpcodeRnm(67, 480); // commonExpr
        op[823] = getOpcodeRep((char)0, Character.MAX_VALUE, 824);
        op[824] = getOpcodeRnm(297, 2080); // WSP
        {char[] a = {41}; op[825] = getOpcodeTls(a);}
        {int[] a = {827,828,829,831,832,834}; op[826] = getOpcodeCat(a);}
        {char[] a = {109,111,110,116,104}; op[827] = getOpcodeTls(a);}
        {char[] a = {40}; op[828] = getOpcodeTls(a);}
        op[829] = getOpcodeRep((char)0, Character.MAX_VALUE, 830);
        op[830] = getOpcodeRnm(297, 2080); // WSP
        op[831] = getOpcodeRnm(67, 480); // commonExpr
        op[832] = getOpcodeRep((char)0, Character.MAX_VALUE, 833);
        op[833] = getOpcodeRnm(297, 2080); // WSP
        {char[] a = {41}; op[834] = getOpcodeTls(a);}
        {int[] a = {836,837,838,840,841,843}; op[835] = getOpcodeCat(a);}
        {char[] a = {109,111,110,116,104,115}; op[836] = getOpcodeTls(a);}
        {char[] a = {40}; op[837] = getOpcodeTls(a);}
        op[838] = getOpcodeRep((char)0, Character.MAX_VALUE, 839);
        op[839] = getOpcodeRnm(297, 2080); // WSP
        op[840] = getOpcodeRnm(67, 480); // commonExpr
        op[841] = getOpcodeRep((char)0, Character.MAX_VALUE, 842);
        op[842] = getOpcodeRnm(297, 2080); // WSP
        {char[] a = {41}; op[843] = getOpcodeTls(a);}
        {int[] a = {845,846,847,849,850,852}; op[844] = getOpcodeCat(a);}
        {char[] a = {100,97,121}; op[845] = getOpcodeTls(a);}
        {char[] a = {40}; op[846] = getOpcodeTls(a);}
        op[847] = getOpcodeRep((char)0, Character.MAX_VALUE, 848);
        op[848] = getOpcodeRnm(297, 2080); // WSP
        op[849] = getOpcodeRnm(67, 480); // commonExpr
        op[850] = getOpcodeRep((char)0, Character.MAX_VALUE, 851);
        op[851] = getOpcodeRnm(297, 2080); // WSP
        {char[] a = {41}; op[852] = getOpcodeTls(a);}
        {int[] a = {854,855,856,858,859,861}; op[853] = getOpcodeCat(a);}
        {char[] a = {100,97,121,115}; op[854] = getOpcodeTls(a);}
        {char[] a = {40}; op[855] = getOpcodeTls(a);}
        op[856] = getOpcodeRep((char)0, Character.MAX_VALUE, 857);
        op[857] = getOpcodeRnm(297, 2080); // WSP
        op[858] = getOpcodeRnm(67, 480); // commonExpr
        op[859] = getOpcodeRep((char)0, Character.MAX_VALUE, 860);
        op[860] = getOpcodeRnm(297, 2080); // WSP
        {char[] a = {41}; op[861] = getOpcodeTls(a);}
        {int[] a = {863,864,865,867,868,870}; op[862] = getOpcodeCat(a);}
        {char[] a = {104,111,117,114}; op[863] = getOpcodeTls(a);}
        {char[] a = {40}; op[864] = getOpcodeTls(a);}
        op[865] = getOpcodeRep((char)0, Character.MAX_VALUE, 866);
        op[866] = getOpcodeRnm(297, 2080); // WSP
        op[867] = getOpcodeRnm(67, 480); // commonExpr
        op[868] = getOpcodeRep((char)0, Character.MAX_VALUE, 869);
        op[869] = getOpcodeRnm(297, 2080); // WSP
        {char[] a = {41}; op[870] = getOpcodeTls(a);}
        {int[] a = {872,873,874,876,877,879}; op[871] = getOpcodeCat(a);}
        {char[] a = {104,111,117,114,115}; op[872] = getOpcodeTls(a);}
        {char[] a = {40}; op[873] = getOpcodeTls(a);}
        op[874] = getOpcodeRep((char)0, Character.MAX_VALUE, 875);
        op[875] = getOpcodeRnm(297, 2080); // WSP
        op[876] = getOpcodeRnm(67, 480); // commonExpr
        op[877] = getOpcodeRep((char)0, Character.MAX_VALUE, 878);
        op[878] = getOpcodeRnm(297, 2080); // WSP
        {char[] a = {41}; op[879] = getOpcodeTls(a);}
        {int[] a = {881,882,883,885,886,888}; op[880] = getOpcodeCat(a);}
        {char[] a = {109,105,110,117,116,101}; op[881] = getOpcodeTls(a);}
        {char[] a = {40}; op[882] = getOpcodeTls(a);}
        op[883] = getOpcodeRep((char)0, Character.MAX_VALUE, 884);
        op[884] = getOpcodeRnm(297, 2080); // WSP
        op[885] = getOpcodeRnm(67, 480); // commonExpr
        op[886] = getOpcodeRep((char)0, Character.MAX_VALUE, 887);
        op[887] = getOpcodeRnm(297, 2080); // WSP
        {char[] a = {41}; op[888] = getOpcodeTls(a);}
        {int[] a = {890,891,892,894,895,897}; op[889] = getOpcodeCat(a);}
        {char[] a = {109,105,110,117,116,101,115}; op[890] = getOpcodeTls(a);}
        {char[] a = {40}; op[891] = getOpcodeTls(a);}
        op[892] = getOpcodeRep((char)0, Character.MAX_VALUE, 893);
        op[893] = getOpcodeRnm(297, 2080); // WSP
        op[894] = getOpcodeRnm(67, 480); // commonExpr
        op[895] = getOpcodeRep((char)0, Character.MAX_VALUE, 896);
        op[896] = getOpcodeRnm(297, 2080); // WSP
        {char[] a = {41}; op[897] = getOpcodeTls(a);}
        {int[] a = {899,900,901,903,904,906}; op[898] = getOpcodeCat(a);}
        {char[] a = {115,101,99,111,110,100}; op[899] = getOpcodeTls(a);}
        {char[] a = {40}; op[900] = getOpcodeTls(a);}
        op[901] = getOpcodeRep((char)0, Character.MAX_VALUE, 902);
        op[902] = getOpcodeRnm(297, 2080); // WSP
        op[903] = getOpcodeRnm(67, 480); // commonExpr
        op[904] = getOpcodeRep((char)0, Character.MAX_VALUE, 905);
        op[905] = getOpcodeRnm(297, 2080); // WSP
        {char[] a = {41}; op[906] = getOpcodeTls(a);}
        {int[] a = {908,909,910,912,913,915}; op[907] = getOpcodeCat(a);}
        {char[] a = {115,101,99,111,110,100,115}; op[908] = getOpcodeTls(a);}
        {char[] a = {40}; op[909] = getOpcodeTls(a);}
        op[910] = getOpcodeRep((char)0, Character.MAX_VALUE, 911);
        op[911] = getOpcodeRnm(297, 2080); // WSP
        op[912] = getOpcodeRnm(67, 480); // commonExpr
        op[913] = getOpcodeRep((char)0, Character.MAX_VALUE, 914);
        op[914] = getOpcodeRnm(297, 2080); // WSP
        {char[] a = {41}; op[915] = getOpcodeTls(a);}
        {int[] a = {917,918,919,921,922,924}; op[916] = getOpcodeCat(a);}
        {char[] a = {114,111,117,110,100}; op[917] = getOpcodeTls(a);}
        {char[] a = {40}; op[918] = getOpcodeTls(a);}
        op[919] = getOpcodeRep((char)0, Character.MAX_VALUE, 920);
        op[920] = getOpcodeRnm(297, 2080); // WSP
        op[921] = getOpcodeRnm(67, 480); // commonExpr
        op[922] = getOpcodeRep((char)0, Character.MAX_VALUE, 923);
        op[923] = getOpcodeRnm(297, 2080); // WSP
        {char[] a = {41}; op[924] = getOpcodeTls(a);}
        {int[] a = {926,927,928,930,931,933}; op[925] = getOpcodeCat(a);}
        {char[] a = {102,108,111,111,114}; op[926] = getOpcodeTls(a);}
        {char[] a = {40}; op[927] = getOpcodeTls(a);}
        op[928] = getOpcodeRep((char)0, Character.MAX_VALUE, 929);
        op[929] = getOpcodeRnm(297, 2080); // WSP
        op[930] = getOpcodeRnm(67, 480); // commonExpr
        op[931] = getOpcodeRep((char)0, Character.MAX_VALUE, 932);
        op[932] = getOpcodeRnm(297, 2080); // WSP
        {char[] a = {41}; op[933] = getOpcodeTls(a);}
        {int[] a = {935,936,937,939,940,942}; op[934] = getOpcodeCat(a);}
        {char[] a = {99,101,105,108,105,110,103}; op[935] = getOpcodeTls(a);}
        {char[] a = {40}; op[936] = getOpcodeTls(a);}
        op[937] = getOpcodeRep((char)0, Character.MAX_VALUE, 938);
        op[938] = getOpcodeRnm(297, 2080); // WSP
        op[939] = getOpcodeRnm(67, 480); // commonExpr
        op[940] = getOpcodeRep((char)0, Character.MAX_VALUE, 941);
        op[941] = getOpcodeRnm(297, 2080); // WSP
        {char[] a = {41}; op[942] = getOpcodeTls(a);}
        {int[] a = {944,945,946,948,949,951}; op[943] = getOpcodeCat(a);}
        {char[] a = {103,101,116,116,111,116,97,108,111,102,102,115,101,116,109,105,110,117,116,101,115}; op[944] = getOpcodeTls(a);}
        {char[] a = {40}; op[945] = getOpcodeTls(a);}
        op[946] = getOpcodeRep((char)0, Character.MAX_VALUE, 947);
        op[947] = getOpcodeRnm(297, 2080); // WSP
        op[948] = getOpcodeRnm(67, 480); // commonExpr
        op[949] = getOpcodeRep((char)0, Character.MAX_VALUE, 950);
        op[950] = getOpcodeRnm(297, 2080); // WSP
        {char[] a = {41}; op[951] = getOpcodeTls(a);}
        {int[] a = {953,954,955,957,958,959,960,962}; op[952] = getOpcodeCat(a);}
        {char[] a = {103,101,111,46,100,105,115,116,97,110,99,101}; op[953] = getOpcodeTls(a);}
        {char[] a = {40}; op[954] = getOpcodeTls(a);}
        op[955] = getOpcodeRep((char)0, Character.MAX_VALUE, 956);
        op[956] = getOpcodeRnm(297, 2080); // WSP
        op[957] = getOpcodeRnm(67, 480); // commonExpr
        op[958] = getOpcodeRnm(272, 1876); // COMMA
        op[959] = getOpcodeRnm(67, 480); // commonExpr
        op[960] = getOpcodeRep((char)0, Character.MAX_VALUE, 961);
        op[961] = getOpcodeRnm(297, 2080); // WSP
        {char[] a = {41}; op[962] = getOpcodeTls(a);}
        {int[] a = {964,965,966,968,969,971}; op[963] = getOpcodeCat(a);}
        {char[] a = {103,101,111,46,108,101,110,103,116,104}; op[964] = getOpcodeTls(a);}
        {char[] a = {40}; op[965] = getOpcodeTls(a);}
        op[966] = getOpcodeRep((char)0, Character.MAX_VALUE, 967);
        op[967] = getOpcodeRnm(297, 2080); // WSP
        op[968] = getOpcodeRnm(67, 480); // commonExpr
        op[969] = getOpcodeRep((char)0, Character.MAX_VALUE, 970);
        op[970] = getOpcodeRnm(297, 2080); // WSP
        {char[] a = {41}; op[971] = getOpcodeTls(a);}
        {int[] a = {973,974,975,977,978,979,980,982}; op[972] = getOpcodeCat(a);}
        {char[] a = {103,101,111,46,105,110,116,101,114,115,101,99,116,115}; op[973] = getOpcodeTls(a);}
        {char[] a = {40}; op[974] = getOpcodeTls(a);}
        op[975] = getOpcodeRep((char)0, Character.MAX_VALUE, 976);
        op[976] = getOpcodeRnm(297, 2080); // WSP
        op[977] = getOpcodeRnm(67, 480); // commonExpr
        op[978] = getOpcodeRnm(272, 1876); // COMMA
        op[979] = getOpcodeRnm(67, 480); // commonExpr
        op[980] = getOpcodeRep((char)0, Character.MAX_VALUE, 981);
        op[981] = getOpcodeRnm(297, 2080); // WSP
        {char[] a = {41}; op[982] = getOpcodeTls(a);}
        {int[] a = {984,985,987,988,990}; op[983] = getOpcodeCat(a);}
        {char[] a = {40}; op[984] = getOpcodeTls(a);}
        op[985] = getOpcodeRep((char)0, Character.MAX_VALUE, 986);
        op[986] = getOpcodeRnm(297, 2080); // WSP
        op[987] = getOpcodeRnm(68, 496); // boolCommonExpr
        op[988] = getOpcodeRep((char)0, Character.MAX_VALUE, 989);
        op[989] = getOpcodeRnm(297, 2080); // WSP
        {char[] a = {41}; op[990] = getOpcodeTls(a);}
        {int[] a = {992,993,995,996,998}; op[991] = getOpcodeCat(a);}
        {char[] a = {40}; op[992] = getOpcodeTls(a);}
        op[993] = getOpcodeRep((char)0, Character.MAX_VALUE, 994);
        op[994] = getOpcodeRnm(297, 2080); // WSP
        op[995] = getOpcodeRnm(67, 480); // commonExpr
        op[996] = getOpcodeRep((char)0, Character.MAX_VALUE, 997);
        op[997] = getOpcodeRnm(297, 2080); // WSP
        {char[] a = {41}; op[998] = getOpcodeTls(a);}
        {int[] a = {1000,1002,1003,1005}; op[999] = getOpcodeCat(a);}
        op[1000] = getOpcodeRep((char)1, Character.MAX_VALUE, 1001);
        op[1001] = getOpcodeRnm(297, 2080); // WSP
        {char[] a = {97,110,100}; op[1002] = getOpcodeTls(a);}
        op[1003] = getOpcodeRep((char)1, Character.MAX_VALUE, 1004);
        op[1004] = getOpcodeRnm(297, 2080); // WSP
        op[1005] = getOpcodeRnm(68, 496); // boolCommonExpr
        {int[] a = {1007,1009,1010,1012}; op[1006] = getOpcodeCat(a);}
        op[1007] = getOpcodeRep((char)1, Character.MAX_VALUE, 1008);
        op[1008] = getOpcodeRnm(297, 2080); // WSP
        {char[] a = {111,114}; op[1009] = getOpcodeTls(a);}
        op[1010] = getOpcodeRep((char)1, Character.MAX_VALUE, 1011);
        op[1011] = getOpcodeRnm(297, 2080); // WSP
        op[1012] = getOpcodeRnm(68, 496); // boolCommonExpr
        {int[] a = {1014,1016,1017,1019}; op[1013] = getOpcodeCat(a);}
        op[1014] = getOpcodeRep((char)1, Character.MAX_VALUE, 1015);
        op[1015] = getOpcodeRnm(297, 2080); // WSP
        {char[] a = {101,113}; op[1016] = getOpcodeTls(a);}
        op[1017] = getOpcodeRep((char)1, Character.MAX_VALUE, 1018);
        op[1018] = getOpcodeRnm(297, 2080); // WSP
        op[1019] = getOpcodeRnm(67, 480); // commonExpr
        {int[] a = {1021,1023,1024,1026}; op[1020] = getOpcodeCat(a);}
        op[1021] = getOpcodeRep((char)1, Character.MAX_VALUE, 1022);
        op[1022] = getOpcodeRnm(297, 2080); // WSP
        {char[] a = {110,101}; op[1023] = getOpcodeTls(a);}
        op[1024] = getOpcodeRep((char)1, Character.MAX_VALUE, 1025);
        op[1025] = getOpcodeRnm(297, 2080); // WSP
        op[1026] = getOpcodeRnm(67, 480); // commonExpr
        {int[] a = {1028,1030,1031,1033}; op[1027] = getOpcodeCat(a);}
        op[1028] = getOpcodeRep((char)1, Character.MAX_VALUE, 1029);
        op[1029] = getOpcodeRnm(297, 2080); // WSP
        {char[] a = {108,116}; op[1030] = getOpcodeTls(a);}
        op[1031] = getOpcodeRep((char)1, Character.MAX_VALUE, 1032);
        op[1032] = getOpcodeRnm(297, 2080); // WSP
        op[1033] = getOpcodeRnm(67, 480); // commonExpr
        {int[] a = {1035,1037,1038,1040}; op[1034] = getOpcodeCat(a);}
        op[1035] = getOpcodeRep((char)1, Character.MAX_VALUE, 1036);
        op[1036] = getOpcodeRnm(297, 2080); // WSP
        {char[] a = {108,101}; op[1037] = getOpcodeTls(a);}
        op[1038] = getOpcodeRep((char)1, Character.MAX_VALUE, 1039);
        op[1039] = getOpcodeRnm(297, 2080); // WSP
        op[1040] = getOpcodeRnm(67, 480); // commonExpr
        {int[] a = {1042,1044,1045,1047}; op[1041] = getOpcodeCat(a);}
        op[1042] = getOpcodeRep((char)1, Character.MAX_VALUE, 1043);
        op[1043] = getOpcodeRnm(297, 2080); // WSP
        {char[] a = {103,116}; op[1044] = getOpcodeTls(a);}
        op[1045] = getOpcodeRep((char)1, Character.MAX_VALUE, 1046);
        op[1046] = getOpcodeRnm(297, 2080); // WSP
        op[1047] = getOpcodeRnm(67, 480); // commonExpr
        {int[] a = {1049,1051,1052,1054}; op[1048] = getOpcodeCat(a);}
        op[1049] = getOpcodeRep((char)1, Character.MAX_VALUE, 1050);
        op[1050] = getOpcodeRnm(297, 2080); // WSP
        {char[] a = {103,101}; op[1051] = getOpcodeTls(a);}
        op[1052] = getOpcodeRep((char)1, Character.MAX_VALUE, 1053);
        op[1053] = getOpcodeRnm(297, 2080); // WSP
        op[1054] = getOpcodeRnm(67, 480); // commonExpr
        {int[] a = {1056,1058,1059,1061}; op[1055] = getOpcodeCat(a);}
        op[1056] = getOpcodeRep((char)1, Character.MAX_VALUE, 1057);
        op[1057] = getOpcodeRnm(297, 2080); // WSP
        {char[] a = {97,100,100}; op[1058] = getOpcodeTls(a);}
        op[1059] = getOpcodeRep((char)1, Character.MAX_VALUE, 1060);
        op[1060] = getOpcodeRnm(297, 2080); // WSP
        op[1061] = getOpcodeRnm(67, 480); // commonExpr
        {int[] a = {1063,1065,1066,1068}; op[1062] = getOpcodeCat(a);}
        op[1063] = getOpcodeRep((char)1, Character.MAX_VALUE, 1064);
        op[1064] = getOpcodeRnm(297, 2080); // WSP
        {char[] a = {115,117,98}; op[1065] = getOpcodeTls(a);}
        op[1066] = getOpcodeRep((char)1, Character.MAX_VALUE, 1067);
        op[1067] = getOpcodeRnm(297, 2080); // WSP
        op[1068] = getOpcodeRnm(67, 480); // commonExpr
        {int[] a = {1070,1072,1073,1075}; op[1069] = getOpcodeCat(a);}
        op[1070] = getOpcodeRep((char)1, Character.MAX_VALUE, 1071);
        op[1071] = getOpcodeRnm(297, 2080); // WSP
        {char[] a = {109,117,108}; op[1072] = getOpcodeTls(a);}
        op[1073] = getOpcodeRep((char)1, Character.MAX_VALUE, 1074);
        op[1074] = getOpcodeRnm(297, 2080); // WSP
        op[1075] = getOpcodeRnm(67, 480); // commonExpr
        {int[] a = {1077,1079,1080,1082}; op[1076] = getOpcodeCat(a);}
        op[1077] = getOpcodeRep((char)1, Character.MAX_VALUE, 1078);
        op[1078] = getOpcodeRnm(297, 2080); // WSP
        {char[] a = {100,105,118}; op[1079] = getOpcodeTls(a);}
        op[1080] = getOpcodeRep((char)1, Character.MAX_VALUE, 1081);
        op[1081] = getOpcodeRnm(297, 2080); // WSP
        op[1082] = getOpcodeRnm(67, 480); // commonExpr
        {int[] a = {1084,1086,1087,1089}; op[1083] = getOpcodeCat(a);}
        op[1084] = getOpcodeRep((char)1, Character.MAX_VALUE, 1085);
        op[1085] = getOpcodeRnm(297, 2080); // WSP
        {char[] a = {109,111,100}; op[1086] = getOpcodeTls(a);}
        op[1087] = getOpcodeRep((char)1, Character.MAX_VALUE, 1088);
        op[1088] = getOpcodeRnm(297, 2080); // WSP
        op[1089] = getOpcodeRnm(67, 480); // commonExpr
        {int[] a = {1091,1092,1094}; op[1090] = getOpcodeCat(a);}
        {char[] a = {45}; op[1091] = getOpcodeTls(a);}
        op[1092] = getOpcodeRep((char)0, Character.MAX_VALUE, 1093);
        op[1093] = getOpcodeRnm(297, 2080); // WSP
        op[1094] = getOpcodeRnm(67, 480); // commonExpr
        {int[] a = {1096,1097,1099}; op[1095] = getOpcodeCat(a);}
        {char[] a = {110,111,116}; op[1096] = getOpcodeTls(a);}
        op[1097] = getOpcodeRep((char)1, Character.MAX_VALUE, 1098);
        op[1098] = getOpcodeRnm(297, 2080); // WSP
        op[1099] = getOpcodeRnm(68, 496); // boolCommonExpr
        {int[] a = {1101,1102,1103,1105,1109,1110,1112}; op[1100] = getOpcodeCat(a);}
        {char[] a = {105,115,111,102}; op[1101] = getOpcodeTls(a);}
        {char[] a = {40}; op[1102] = getOpcodeTls(a);}
        op[1103] = getOpcodeRep((char)0, Character.MAX_VALUE, 1104);
        op[1104] = getOpcodeRnm(297, 2080); // WSP
        op[1105] = getOpcodeRep((char)0, (char)1, 1106);
        {int[] a = {1107,1108}; op[1106] = getOpcodeCat(a);}
        op[1107] = getOpcodeRnm(67, 480); // commonExpr
        op[1108] = getOpcodeRnm(272, 1876); // COMMA
        op[1109] = getOpcodeRnm(159, 1250); // qualifiedTypeName
        op[1110] = getOpcodeRep((char)0, Character.MAX_VALUE, 1111);
        op[1111] = getOpcodeRnm(297, 2080); // WSP
        {char[] a = {41}; op[1112] = getOpcodeTls(a);}
        {int[] a = {1114,1115,1116,1118,1122,1123,1125}; op[1113] = getOpcodeCat(a);}
        {char[] a = {99,97,115,116}; op[1114] = getOpcodeTls(a);}
        {char[] a = {40}; op[1115] = getOpcodeTls(a);}
        op[1116] = getOpcodeRep((char)0, Character.MAX_VALUE, 1117);
        op[1117] = getOpcodeRnm(297, 2080); // WSP
        op[1118] = getOpcodeRep((char)0, (char)1, 1119);
        {int[] a = {1120,1121}; op[1119] = getOpcodeCat(a);}
        op[1120] = getOpcodeRnm(67, 480); // commonExpr
        op[1121] = getOpcodeRnm(272, 1876); // COMMA
        op[1122] = getOpcodeRnm(159, 1250); // qualifiedTypeName
        op[1123] = getOpcodeRep((char)0, Character.MAX_VALUE, 1124);
        op[1124] = getOpcodeRnm(297, 2080); // WSP
        {char[] a = {41}; op[1125] = getOpcodeTls(a);}
        {int[] a = {1127,1128,1142}; op[1126] = getOpcodeCat(a);}
        op[1127] = getOpcodeRnm(140, 1163); // begin-object
        op[1128] = getOpcodeRep((char)0, (char)1, 1129);
        {int[] a = {1130,1135}; op[1129] = getOpcodeCat(a);}
        {int[] a = {1131,1132,1133,1134}; op[1130] = getOpcodeAlt(a);}
        op[1131] = getOpcodeRnm(147, 1170); // complexTypeMetadataInUri
        op[1132] = getOpcodeRnm(149, 1187); // primitivePropertyInUri
        op[1133] = getOpcodeRnm(157, 1231); // complexPropertyInUri
        op[1134] = getOpcodeRnm(158, 1237); // collectionPropertyInUri
        op[1135] = getOpcodeRep((char)0, Character.MAX_VALUE, 1136);
        {int[] a = {1137,1138}; op[1136] = getOpcodeCat(a);}
        op[1137] = getOpcodeRnm(146, 1169); // value-separator
        {int[] a = {1139,1140,1141}; op[1138] = getOpcodeAlt(a);}
        op[1139] = getOpcodeRnm(149, 1187); // primitivePropertyInUri
        op[1140] = getOpcodeRnm(157, 1231); // complexPropertyInUri
        op[1141] = getOpcodeRnm(158, 1237); // collectionPropertyInUri
        op[1142] = getOpcodeRnm(141, 1164); // end-object
        {int[] a = {1144,1145,1152}; op[1143] = getOpcodeCat(a);}
        op[1144] = getOpcodeRnm(142, 1165); // begin-array
        op[1145] = getOpcodeRep((char)0, (char)1, 1146);
        {int[] a = {1147,1148}; op[1146] = getOpcodeCat(a);}
        op[1147] = getOpcodeRnm(137, 1126); // complexInUri
        op[1148] = getOpcodeRep((char)0, Character.MAX_VALUE, 1149);
        {int[] a = {1150,1151}; op[1149] = getOpcodeCat(a);}
        op[1150] = getOpcodeRnm(146, 1169); // value-separator
        op[1151] = getOpcodeRnm(137, 1126); // complexInUri
        op[1152] = getOpcodeRnm(143, 1166); // end-array
        {int[] a = {1154,1155,1162}; op[1153] = getOpcodeCat(a);}
        op[1154] = getOpcodeRnm(142, 1165); // begin-array
        op[1155] = getOpcodeRep((char)0, (char)1, 1156);
        {int[] a = {1157,1158}; op[1156] = getOpcodeCat(a);}
        op[1157] = getOpcodeRnm(150, 1193); // primitiveLiteralInJSON
        op[1158] = getOpcodeRep((char)0, Character.MAX_VALUE, 1159);
        {int[] a = {1160,1161}; op[1159] = getOpcodeCat(a);}
        op[1160] = getOpcodeRnm(146, 1169); // value-separator
        op[1161] = getOpcodeRnm(150, 1193); // primitiveLiteralInJSON
        op[1162] = getOpcodeRnm(143, 1166); // end-array
        {char[] a = {123}; op[1163] = getOpcodeTls(a);}
        {char[] a = {125}; op[1164] = getOpcodeTls(a);}
        {char[] a = {91}; op[1165] = getOpcodeTls(a);}
        {char[] a = {93}; op[1166] = getOpcodeTls(a);}
        op[1167] = getOpcodeRnm(294, 2077); // DQUOTE
        {char[] a = {58}; op[1168] = getOpcodeTls(a);}
        op[1169] = getOpcodeRnm(272, 1876); // COMMA
        {int[] a = {1171,1172,1173,1174,1175,1176,1178}; op[1170] = getOpcodeCat(a);}
        op[1171] = getOpcodeRnm(144, 1167); // quotation-mark
        {char[] a = {95,95,109,101,116,97,100,97,116,97}; op[1172] = getOpcodeTls(a);}
        op[1173] = getOpcodeRnm(144, 1167); // quotation-mark
        op[1174] = getOpcodeRnm(145, 1168); // name-separator
        op[1175] = getOpcodeRnm(140, 1163); // begin-object
        op[1176] = getOpcodeRep((char)0, (char)1, 1177);
        op[1177] = getOpcodeRnm(148, 1179); // typeNVPInUri
        op[1178] = getOpcodeRnm(141, 1164); // end-object
        {int[] a = {1180,1181,1182,1183,1184,1185,1186}; op[1179] = getOpcodeCat(a);}
        op[1180] = getOpcodeRnm(144, 1167); // quotation-mark
        {char[] a = {116,121,112,101}; op[1181] = getOpcodeTls(a);}
        op[1182] = getOpcodeRnm(144, 1167); // quotation-mark
        op[1183] = getOpcodeRnm(145, 1168); // name-separator
        op[1184] = getOpcodeRnm(144, 1167); // quotation-mark
        op[1185] = getOpcodeRnm(159, 1250); // qualifiedTypeName
        op[1186] = getOpcodeRnm(144, 1167); // quotation-mark
        {int[] a = {1188,1189,1190,1191,1192}; op[1187] = getOpcodeCat(a);}
        op[1188] = getOpcodeRnm(144, 1167); // quotation-mark
        op[1189] = getOpcodeRnm(176, 1339); // primitiveProperty
        op[1190] = getOpcodeRnm(144, 1167); // quotation-mark
        op[1191] = getOpcodeRnm(145, 1168); // name-separator
        op[1192] = getOpcodeRnm(150, 1193); // primitiveLiteralInJSON
        {int[] a = {1194,1195,1196,1197,1198}; op[1193] = getOpcodeAlt(a);}
        op[1194] = getOpcodeRnm(151, 1199); // stringInJSON
        op[1195] = getOpcodeRnm(153, 1205); // numberInJSON
        {char[] a = {116,114,117,101}; op[1196] = getOpcodeTbs(a);}
        {char[] a = {102,97,108,115,101}; op[1197] = getOpcodeTbs(a);}
        {char[] a = {110,117,108,108}; op[1198] = getOpcodeTbs(a);}
        {int[] a = {1200,1201,1203}; op[1199] = getOpcodeCat(a);}
        op[1200] = getOpcodeRnm(144, 1167); // quotation-mark
        op[1201] = getOpcodeRep((char)0, Character.MAX_VALUE, 1202);
        op[1202] = getOpcodeRnm(152, 1204); // charInJSON
        op[1203] = getOpcodeRnm(144, 1167); // quotation-mark
        op[1204] = getOpcodeRnm(286, 2034); // pchar
        {int[] a = {1206,1208,1209,1211}; op[1205] = getOpcodeCat(a);}
        op[1206] = getOpcodeRep((char)0, (char)1, 1207);
        {char[] a = {45}; op[1207] = getOpcodeTls(a);}
        op[1208] = getOpcodeRnm(154, 1213); // int
        op[1209] = getOpcodeRep((char)0, (char)1, 1210);
        op[1210] = getOpcodeRnm(155, 1219); // frac
        op[1211] = getOpcodeRep((char)0, (char)1, 1212);
        op[1212] = getOpcodeRnm(156, 1223); // exp
        {int[] a = {1214,1215}; op[1213] = getOpcodeAlt(a);}
        {char[] a = {48}; op[1214] = getOpcodeTls(a);}
        {int[] a = {1216,1217}; op[1215] = getOpcodeCat(a);}
        op[1216] = getOpcodeRnm(223, 1631); // oneToNine
        op[1217] = getOpcodeRep((char)0, Character.MAX_VALUE, 1218);
        op[1218] = getOpcodeRnm(292, 2068); // DIGIT
        {int[] a = {1220,1221}; op[1219] = getOpcodeCat(a);}
        {char[] a = {46}; op[1220] = getOpcodeTls(a);}
        op[1221] = getOpcodeRep((char)1, Character.MAX_VALUE, 1222);
        op[1222] = getOpcodeRnm(292, 2068); // DIGIT
        {int[] a = {1224,1225,1229}; op[1223] = getOpcodeCat(a);}
        {char[] a = {101}; op[1224] = getOpcodeTls(a);}
        op[1225] = getOpcodeRep((char)0, (char)1, 1226);
        {int[] a = {1227,1228}; op[1226] = getOpcodeAlt(a);}
        {char[] a = {45}; op[1227] = getOpcodeTls(a);}
        {char[] a = {43}; op[1228] = getOpcodeTls(a);}
        op[1229] = getOpcodeRep((char)1, Character.MAX_VALUE, 1230);
        op[1230] = getOpcodeRnm(292, 2068); // DIGIT
        {int[] a = {1232,1233,1234,1235,1236}; op[1231] = getOpcodeCat(a);}
        op[1232] = getOpcodeRnm(144, 1167); // quotation-mark
        op[1233] = getOpcodeRnm(180, 1345); // complexProperty
        op[1234] = getOpcodeRnm(144, 1167); // quotation-mark
        op[1235] = getOpcodeRnm(145, 1168); // name-separator
        op[1236] = getOpcodeRnm(137, 1126); // complexInUri
        {int[] a = {1238,1244}; op[1237] = getOpcodeAlt(a);}
        {int[] a = {1239,1240,1241,1242,1243}; op[1238] = getOpcodeCat(a);}
        op[1239] = getOpcodeRnm(144, 1167); // quotation-mark
        op[1240] = getOpcodeRnm(179, 1344); // primitiveColProperty
        op[1241] = getOpcodeRnm(144, 1167); // quotation-mark
        op[1242] = getOpcodeRnm(145, 1168); // name-separator
        op[1243] = getOpcodeRnm(139, 1153); // primitiveColInUri
        {int[] a = {1245,1246,1247,1248,1249}; op[1244] = getOpcodeCat(a);}
        op[1245] = getOpcodeRnm(144, 1167); // quotation-mark
        op[1246] = getOpcodeRnm(181, 1346); // complexColProperty
        op[1247] = getOpcodeRnm(144, 1167); // quotation-mark
        op[1248] = getOpcodeRnm(145, 1168); // name-separator
        op[1249] = getOpcodeRnm(138, 1143); // complexColInUri
        {int[] a = {1251,1252,1253,1254,1255}; op[1250] = getOpcodeAlt(a);}
        op[1251] = getOpcodeRnm(160, 1263); // qualifiedEntityTypeName
        op[1252] = getOpcodeRnm(161, 1267); // qualifiedComplexTypeName
        op[1253] = getOpcodeRnm(162, 1271); // qualifiedEnumerationTypeName
        op[1254] = getOpcodeRnm(172, 1297); // primitiveTypeName
        {int[] a = {1256,1257,1262}; op[1255] = getOpcodeCat(a);}
        {char[] a = {99,111,108,108,101,99,116,105,111,110,40}; op[1256] = getOpcodeTls(a);}
        {int[] a = {1258,1259,1260,1261}; op[1257] = getOpcodeAlt(a);}
        op[1258] = getOpcodeRnm(160, 1263); // qualifiedEntityTypeName
        op[1259] = getOpcodeRnm(161, 1267); // qualifiedComplexTypeName
        op[1260] = getOpcodeRnm(162, 1271); // qualifiedEnumerationTypeName
        op[1261] = getOpcodeRnm(172, 1297); // primitiveTypeName
        {char[] a = {41}; op[1262] = getOpcodeTls(a);}
        {int[] a = {1264,1265,1266}; op[1263] = getOpcodeCat(a);}
        op[1264] = getOpcodeRnm(163, 1275); // namespace
        {char[] a = {46}; op[1265] = getOpcodeTls(a);}
        op[1266] = getOpcodeRnm(166, 1283); // entityTypeName
        {int[] a = {1268,1269,1270}; op[1267] = getOpcodeCat(a);}
        op[1268] = getOpcodeRnm(163, 1275); // namespace
        {char[] a = {46}; op[1269] = getOpcodeTls(a);}
        op[1270] = getOpcodeRnm(167, 1284); // complexTypeName
        {int[] a = {1272,1273,1274}; op[1271] = getOpcodeCat(a);}
        op[1272] = getOpcodeRnm(163, 1275); // namespace
        {char[] a = {46}; op[1273] = getOpcodeTls(a);}
        op[1274] = getOpcodeRnm(168, 1285); // enumerationTypeName
        {int[] a = {1276,1277}; op[1275] = getOpcodeCat(a);}
        op[1276] = getOpcodeRnm(164, 1281); // namespacePart
        op[1277] = getOpcodeRep((char)0, Character.MAX_VALUE, 1278);
        {int[] a = {1279,1280}; op[1278] = getOpcodeCat(a);}
        {char[] a = {46}; op[1279] = getOpcodeTls(a);}
        op[1280] = getOpcodeRnm(164, 1281); // namespacePart
        op[1281] = getOpcodeRnm(169, 1286); // odataIdentifier
        op[1282] = getOpcodeRnm(169, 1286); // odataIdentifier
        op[1283] = getOpcodeRnm(169, 1286); // odataIdentifier
        op[1284] = getOpcodeRnm(169, 1286); // odataIdentifier
        op[1285] = getOpcodeRnm(169, 1286); // odataIdentifier
        {int[] a = {1287,1288}; op[1286] = getOpcodeCat(a);}
        op[1287] = getOpcodeRnm(170, 1290); // identifierLeadingCharacter
        op[1288] = getOpcodeRep((char)0, (char)478, 1289);
        op[1289] = getOpcodeRnm(171, 1293); // identifierCharacter
        {int[] a = {1291,1292}; op[1290] = getOpcodeAlt(a);}
        op[1291] = getOpcodeRnm(291, 2065); // ALPHA
        {char[] a = {95}; op[1292] = getOpcodeTls(a);}
        {int[] a = {1294,1295,1296}; op[1293] = getOpcodeAlt(a);}
        op[1294] = getOpcodeRnm(291, 2065); // ALPHA
        op[1295] = getOpcodeRnm(292, 2068); // DIGIT
        {char[] a = {95}; op[1296] = getOpcodeTls(a);}
        {int[] a = {1298,1300}; op[1297] = getOpcodeCat(a);}
        op[1298] = getOpcodeRep((char)0, (char)1, 1299);
        {char[] a = {101,100,109,46}; op[1299] = getOpcodeTls(a);}
        {int[] a = {1301,1302,1303,1304,1305,1306,1307,1308,1309,1310,1311,1312,1313,1314,1315,1316,1317,1318}; op[1300] = getOpcodeAlt(a);}
        {char[] a = {98,105,110,97,114,121}; op[1301] = getOpcodeTls(a);}
        {char[] a = {98,111,111,108,101,97,110}; op[1302] = getOpcodeTls(a);}
        {char[] a = {98,121,116,101}; op[1303] = getOpcodeTls(a);}
        {char[] a = {100,97,116,101,116,105,109,101}; op[1304] = getOpcodeTls(a);}
        {char[] a = {100,97,116,101,116,105,109,101,111,102,102,115,101,116}; op[1305] = getOpcodeTls(a);}
        {char[] a = {100,101,99,105,109,97,108}; op[1306] = getOpcodeTls(a);}
        {char[] a = {100,111,117,98,108,101}; op[1307] = getOpcodeTls(a);}
        {char[] a = {115,105,110,103,108,101}; op[1308] = getOpcodeTls(a);}
        {char[] a = {102,108,111,97,116}; op[1309] = getOpcodeTls(a);}
        {char[] a = {103,117,105,100}; op[1310] = getOpcodeTls(a);}
        {char[] a = {105,110,116,49,54}; op[1311] = getOpcodeTls(a);}
        {char[] a = {105,110,116,51,50}; op[1312] = getOpcodeTls(a);}
        {char[] a = {105,110,116,54,52}; op[1313] = getOpcodeTls(a);}
        {char[] a = {115,98,121,116,101}; op[1314] = getOpcodeTls(a);}
        {char[] a = {115,116,114,101,97,109}; op[1315] = getOpcodeTls(a);}
        {char[] a = {115,116,114,105,110,103}; op[1316] = getOpcodeTls(a);}
        {char[] a = {116,105,109,101}; op[1317] = getOpcodeTls(a);}
        {int[] a = {1319,1320}; op[1318] = getOpcodeCat(a);}
        op[1319] = getOpcodeRnm(173, 1322); // abstractSpatialTypeName
        op[1320] = getOpcodeRep((char)0, (char)1, 1321);
        op[1321] = getOpcodeRnm(174, 1325); // concreteSpatialTypeName
        {int[] a = {1323,1324}; op[1322] = getOpcodeAlt(a);}
        {char[] a = {71,101,111,103,114,97,112,104,121}; op[1323] = getOpcodeTls(a);}
        {char[] a = {71,101,111,109,101,116,114,121}; op[1324] = getOpcodeTls(a);}
        {int[] a = {1326,1327,1328,1329,1330,1331,1332}; op[1325] = getOpcodeAlt(a);}
        {char[] a = {67,111,108,108,101,99,116,105,111,110}; op[1326] = getOpcodeTls(a);}
        {char[] a = {76,105,110,101,83,116,114,105,110,103}; op[1327] = getOpcodeTls(a);}
        {char[] a = {77,117,108,116,105,76,105,110,101,83,116,114,105,110,103}; op[1328] = getOpcodeTls(a);}
        {char[] a = {77,117,108,116,105,80,111,105,110,116}; op[1329] = getOpcodeTls(a);}
        {char[] a = {77,117,108,116,105,80,111,108,121,103,111,110}; op[1330] = getOpcodeTls(a);}
        {char[] a = {80,111,105,110,116}; op[1331] = getOpcodeTls(a);}
        {char[] a = {80,111,108,121,103,111,110}; op[1332] = getOpcodeTls(a);}
        {int[] a = {1334,1335,1336,1337,1338}; op[1333] = getOpcodeAlt(a);}
        op[1334] = getOpcodeRnm(176, 1339); // primitiveProperty
        op[1335] = getOpcodeRnm(179, 1344); // primitiveColProperty
        op[1336] = getOpcodeRnm(180, 1345); // complexProperty
        op[1337] = getOpcodeRnm(181, 1346); // complexColProperty
        op[1338] = getOpcodeRnm(182, 1347); // streamProperty
        {int[] a = {1340,1341}; op[1339] = getOpcodeAlt(a);}
        op[1340] = getOpcodeRnm(177, 1342); // primitiveKeyProperty
        op[1341] = getOpcodeRnm(178, 1343); // primitiveNonKeyProperty
        op[1342] = getOpcodeRnm(169, 1286); // odataIdentifier
        op[1343] = getOpcodeRnm(169, 1286); // odataIdentifier
        op[1344] = getOpcodeRnm(169, 1286); // odataIdentifier
        op[1345] = getOpcodeRnm(169, 1286); // odataIdentifier
        op[1346] = getOpcodeRnm(169, 1286); // odataIdentifier
        op[1347] = getOpcodeRnm(169, 1286); // odataIdentifier
        {int[] a = {1349,1350}; op[1348] = getOpcodeAlt(a);}
        op[1349] = getOpcodeRnm(184, 1351); // entityNavigationProperty
        op[1350] = getOpcodeRnm(185, 1352); // entityColNavigationProperty
        op[1351] = getOpcodeRnm(169, 1286); // odataIdentifier
        op[1352] = getOpcodeRnm(169, 1286); // odataIdentifier
        op[1353] = getOpcodeRnm(169, 1286); // odataIdentifier
        op[1354] = getOpcodeRnm(169, 1286); // odataIdentifier
        {int[] a = {1356,1357,1358,1359,1360,1361}; op[1355] = getOpcodeAlt(a);}
        op[1356] = getOpcodeRnm(189, 1362); // entityFunction
        op[1357] = getOpcodeRnm(190, 1363); // entityColFunction
        op[1358] = getOpcodeRnm(191, 1364); // complexFunction
        op[1359] = getOpcodeRnm(192, 1365); // complexColFunction
        op[1360] = getOpcodeRnm(193, 1366); // primitiveFunction
        op[1361] = getOpcodeRnm(194, 1367); // primitiveColFunction
        op[1362] = getOpcodeRnm(169, 1286); // odataIdentifier
        op[1363] = getOpcodeRnm(169, 1286); // odataIdentifier
        op[1364] = getOpcodeRnm(169, 1286); // odataIdentifier
        op[1365] = getOpcodeRnm(169, 1286); // odataIdentifier
        op[1366] = getOpcodeRnm(169, 1286); // odataIdentifier
        op[1367] = getOpcodeRnm(169, 1286); // odataIdentifier
        {int[] a = {1369,1370,1371,1372,1373,1374,1375,1376,1377,1378,1379,1380,1381,1382,1383,1384,1385,1386,1387,1388,1389,1390,1391,1392,1393,1394,1395,1396,1397,1398}; op[1368] = getOpcodeAlt(a);}
        op[1369] = getOpcodeRnm(196, 1399); // null
        op[1370] = getOpcodeRnm(199, 1422); // decimal
        op[1371] = getOpcodeRnm(203, 1451); // single
        op[1372] = getOpcodeRnm(201, 1436); // double
        op[1373] = getOpcodeRnm(211, 1495); // sbyte
        op[1374] = getOpcodeRnm(210, 1493); // byte
        op[1375] = getOpcodeRnm(212, 1500); // int16
        op[1376] = getOpcodeRnm(213, 1505); // int32
        op[1377] = getOpcodeRnm(214, 1510); // int64
        op[1378] = getOpcodeRnm(197, 1406); // binary
        op[1379] = getOpcodeRnm(218, 1543); // dateTime
        op[1380] = getOpcodeRnm(219, 1548); // dateTimeOffset
        op[1381] = getOpcodeRnm(209, 1475); // guid
        op[1382] = getOpcodeRnm(215, 1517); // string
        op[1383] = getOpcodeRnm(222, 1586); // time
        op[1384] = getOpcodeRnm(198, 1415); // boolean
        op[1385] = getOpcodeRnm(232, 1690); // geographyCollection
        op[1386] = getOpcodeRnm(236, 1713); // geographyLineString
        op[1387] = getOpcodeRnm(240, 1731); // geographyMultiLineString
        op[1388] = getOpcodeRnm(243, 1748); // geographyMultiPoint
        op[1389] = getOpcodeRnm(246, 1765); // geographyMultiPolygon
        op[1390] = getOpcodeRnm(249, 1782); // geographyPoint
        op[1391] = getOpcodeRnm(255, 1805); // geographyPolygon
        op[1392] = getOpcodeRnm(260, 1831); // geometryCollection
        op[1393] = getOpcodeRnm(261, 1835); // geometryLineString
        op[1394] = getOpcodeRnm(262, 1839); // geometryMultiLineString
        op[1395] = getOpcodeRnm(263, 1843); // geometryMultiPoint
        op[1396] = getOpcodeRnm(264, 1847); // geometryMultiPolygon
        op[1397] = getOpcodeRnm(265, 1851); // geometryPoint
        op[1398] = getOpcodeRnm(266, 1855); // geometryPolygon
        {int[] a = {1400,1401}; op[1399] = getOpcodeCat(a);}
        {char[] a = {110,117,108,108}; op[1400] = getOpcodeTbs(a);}
        op[1401] = getOpcodeRep((char)0, (char)1, 1402);
        {int[] a = {1403,1404,1405}; op[1402] = getOpcodeCat(a);}
        {char[] a = {39}; op[1403] = getOpcodeTls(a);}
        op[1404] = getOpcodeRnm(159, 1250); // qualifiedTypeName
        {char[] a = {39}; op[1405] = getOpcodeTls(a);}
        {int[] a = {1407,1410,1411,1414}; op[1406] = getOpcodeCat(a);}
        {int[] a = {1408,1409}; op[1407] = getOpcodeAlt(a);}
        {char[] a = {88}; op[1408] = getOpcodeTbs(a);}
        {char[] a = {98,105,110,97,114,121}; op[1409] = getOpcodeTls(a);}
        op[1410] = getOpcodeRnm(270, 1874); // SQUOTE
        op[1411] = getOpcodeRep((char)0, Character.MAX_VALUE, 1412);
        op[1412] = getOpcodeRep((char)2, (char)2, 1413);
        op[1413] = getOpcodeRnm(293, 2069); // HEXDIG
        op[1414] = getOpcodeRnm(270, 1874); // SQUOTE
        {int[] a = {1416,1419}; op[1415] = getOpcodeAlt(a);}
        {int[] a = {1417,1418}; op[1416] = getOpcodeAlt(a);}
        {char[] a = {116,114,117,101}; op[1417] = getOpcodeTls(a);}
        {char[] a = {49}; op[1418] = getOpcodeTls(a);}
        {int[] a = {1420,1421}; op[1419] = getOpcodeAlt(a);}
        {char[] a = {102,97,108,115,101}; op[1420] = getOpcodeTls(a);}
        {char[] a = {48}; op[1421] = getOpcodeTls(a);}
        {int[] a = {1423,1424}; op[1422] = getOpcodeCat(a);}
        op[1423] = getOpcodeRnm(200, 1426); // decimalBody
        op[1424] = getOpcodeRep((char)0, (char)1, 1425);
        {char[] a = {77}; op[1425] = getOpcodeTls(a);}
        {int[] a = {1427,1429,1431}; op[1426] = getOpcodeCat(a);}
        op[1427] = getOpcodeRep((char)0, (char)1, 1428);
        op[1428] = getOpcodeRnm(273, 1877); // sign
        op[1429] = getOpcodeRep((char)1, Character.MAX_VALUE, 1430);
        op[1430] = getOpcodeRnm(292, 2068); // DIGIT
        op[1431] = getOpcodeRep((char)0, (char)1, 1432);
        {int[] a = {1433,1434}; op[1432] = getOpcodeCat(a);}
        {char[] a = {46}; op[1433] = getOpcodeTls(a);}
        op[1434] = getOpcodeRep((char)1, Character.MAX_VALUE, 1435);
        op[1435] = getOpcodeRnm(292, 2068); // DIGIT
        {int[] a = {1437,1438}; op[1436] = getOpcodeCat(a);}
        op[1437] = getOpcodeRnm(202, 1440); // doubleBody
        op[1438] = getOpcodeRep((char)0, (char)1, 1439);
        {char[] a = {68}; op[1439] = getOpcodeTls(a);}
        {int[] a = {1441,1450}; op[1440] = getOpcodeAlt(a);}
        {int[] a = {1442,1443}; op[1441] = getOpcodeCat(a);}
        op[1442] = getOpcodeRnm(200, 1426); // decimalBody
        op[1443] = getOpcodeRep((char)0, (char)1, 1444);
        {int[] a = {1445,1446,1448}; op[1444] = getOpcodeCat(a);}
        {char[] a = {69}; op[1445] = getOpcodeTls(a);}
        op[1446] = getOpcodeRep((char)0, (char)1, 1447);
        op[1447] = getOpcodeRnm(273, 1877); // sign
        op[1448] = getOpcodeRep((char)1, Character.MAX_VALUE, 1449);
        op[1449] = getOpcodeRnm(292, 2068); // DIGIT
        op[1450] = getOpcodeRnm(208, 1471); // nanInfinity
        {int[] a = {1452,1453}; op[1451] = getOpcodeCat(a);}
        op[1452] = getOpcodeRnm(204, 1455); // singleBody
        op[1453] = getOpcodeRep((char)0, (char)1, 1454);
        {char[] a = {70}; op[1454] = getOpcodeTls(a);}
        {int[] a = {1456,1465}; op[1455] = getOpcodeAlt(a);}
        {int[] a = {1457,1458}; op[1456] = getOpcodeCat(a);}
        op[1457] = getOpcodeRnm(200, 1426); // decimalBody
        op[1458] = getOpcodeRep((char)0, (char)1, 1459);
        {int[] a = {1460,1461,1463}; op[1459] = getOpcodeCat(a);}
        {char[] a = {69}; op[1460] = getOpcodeTls(a);}
        op[1461] = getOpcodeRep((char)0, (char)1, 1462);
        op[1462] = getOpcodeRnm(273, 1877); // sign
        op[1463] = getOpcodeRep((char)1, Character.MAX_VALUE, 1464);
        op[1464] = getOpcodeRnm(292, 2068); // DIGIT
        op[1465] = getOpcodeRnm(208, 1471); // nanInfinity
        {char[] a = {78,97,78}; op[1466] = getOpcodeTbs(a);}
        {char[] a = {73,78,70}; op[1467] = getOpcodeTbs(a);}
        {int[] a = {1469,1470}; op[1468] = getOpcodeCat(a);}
        {char[] a = {45}; op[1469] = getOpcodeTls(a);}
        op[1470] = getOpcodeRnm(206, 1467); // positiveInfinity
        {int[] a = {1472,1473,1474}; op[1471] = getOpcodeAlt(a);}
        op[1472] = getOpcodeRnm(205, 1466); // nan
        op[1473] = getOpcodeRnm(207, 1468); // negativeInfinity
        op[1474] = getOpcodeRnm(206, 1467); // positiveInfinity
        {int[] a = {1476,1477,1478,1480,1481,1483,1484,1486,1487,1489,1490,1492}; op[1475] = getOpcodeCat(a);}
        {char[] a = {103,117,105,100}; op[1476] = getOpcodeTls(a);}
        op[1477] = getOpcodeRnm(270, 1874); // SQUOTE
        op[1478] = getOpcodeRep((char)8, (char)8, 1479);
        op[1479] = getOpcodeRnm(293, 2069); // HEXDIG
        {char[] a = {45}; op[1480] = getOpcodeTls(a);}
        op[1481] = getOpcodeRep((char)4, (char)4, 1482);
        op[1482] = getOpcodeRnm(293, 2069); // HEXDIG
        {char[] a = {45}; op[1483] = getOpcodeTls(a);}
        op[1484] = getOpcodeRep((char)4, (char)4, 1485);
        op[1485] = getOpcodeRnm(293, 2069); // HEXDIG
        {char[] a = {45}; op[1486] = getOpcodeTls(a);}
        op[1487] = getOpcodeRep((char)4, (char)4, 1488);
        op[1488] = getOpcodeRnm(293, 2069); // HEXDIG
        {char[] a = {45}; op[1489] = getOpcodeTls(a);}
        op[1490] = getOpcodeRep((char)12, (char)12, 1491);
        op[1491] = getOpcodeRnm(293, 2069); // HEXDIG
        op[1492] = getOpcodeRnm(270, 1874); // SQUOTE
        op[1493] = getOpcodeRep((char)1, (char)3, 1494);
        op[1494] = getOpcodeRnm(292, 2068); // DIGIT
        {int[] a = {1496,1498}; op[1495] = getOpcodeCat(a);}
        op[1496] = getOpcodeRep((char)0, (char)1, 1497);
        op[1497] = getOpcodeRnm(273, 1877); // sign
        op[1498] = getOpcodeRep((char)1, (char)3, 1499);
        op[1499] = getOpcodeRnm(292, 2068); // DIGIT
        {int[] a = {1501,1503}; op[1500] = getOpcodeCat(a);}
        op[1501] = getOpcodeRep((char)0, (char)1, 1502);
        op[1502] = getOpcodeRnm(273, 1877); // sign
        op[1503] = getOpcodeRep((char)1, (char)5, 1504);
        op[1504] = getOpcodeRnm(292, 2068); // DIGIT
        {int[] a = {1506,1508}; op[1505] = getOpcodeCat(a);}
        op[1506] = getOpcodeRep((char)0, (char)1, 1507);
        op[1507] = getOpcodeRnm(273, 1877); // sign
        op[1508] = getOpcodeRep((char)1, (char)10, 1509);
        op[1509] = getOpcodeRnm(292, 2068); // DIGIT
        {int[] a = {1511,1513,1515}; op[1510] = getOpcodeCat(a);}
        op[1511] = getOpcodeRep((char)0, (char)1, 1512);
        op[1512] = getOpcodeRnm(273, 1877); // sign
        op[1513] = getOpcodeRep((char)1, (char)19, 1514);
        op[1514] = getOpcodeRnm(292, 2068); // DIGIT
        op[1515] = getOpcodeRep((char)0, (char)1, 1516);
        {char[] a = {76}; op[1516] = getOpcodeTls(a);}
        {int[] a = {1518,1519,1524}; op[1517] = getOpcodeCat(a);}
        op[1518] = getOpcodeRnm(270, 1874); // SQUOTE
        op[1519] = getOpcodeRep((char)0, Character.MAX_VALUE, 1520);
        {int[] a = {1521,1522,1523}; op[1520] = getOpcodeAlt(a);}
        op[1521] = getOpcodeRnm(216, 1525); // pchar-no-SQUOTE
        op[1522] = getOpcodeRnm(217, 1540); // SQUOTE-in-string
        op[1523] = getOpcodeRnm(269, 1865); // unencoded
        op[1524] = getOpcodeRnm(270, 1874); // SQUOTE
        {int[] a = {1526,1527,1528,1529,1530,1531,1532,1533,1534,1535,1536,1537,1538,1539}; op[1525] = getOpcodeAlt(a);}
        op[1526] = getOpcodeRnm(288, 2044); // unreserved
        op[1527] = getOpcodeRnm(287, 2040); // pct-encoded
        {char[] a = {33}; op[1528] = getOpcodeTls(a);}
        {char[] a = {36}; op[1529] = getOpcodeTls(a);}
        {char[] a = {38}; op[1530] = getOpcodeTls(a);}
        {char[] a = {40}; op[1531] = getOpcodeTls(a);}
        {char[] a = {41}; op[1532] = getOpcodeTls(a);}
        {char[] a = {42}; op[1533] = getOpcodeTls(a);}
        {char[] a = {43}; op[1534] = getOpcodeTls(a);}
        {char[] a = {44}; op[1535] = getOpcodeTls(a);}
        {char[] a = {59}; op[1536] = getOpcodeTls(a);}
        {char[] a = {61}; op[1537] = getOpcodeTls(a);}
        {char[] a = {58}; op[1538] = getOpcodeTls(a);}
        {char[] a = {64}; op[1539] = getOpcodeTls(a);}
        {int[] a = {1541,1542}; op[1540] = getOpcodeCat(a);}
        op[1541] = getOpcodeRnm(270, 1874); // SQUOTE
        op[1542] = getOpcodeRnm(270, 1874); // SQUOTE
        {int[] a = {1544,1545,1546,1547}; op[1543] = getOpcodeCat(a);}
        {char[] a = {100,97,116,101,116,105,109,101}; op[1544] = getOpcodeTls(a);}
        op[1545] = getOpcodeRnm(270, 1874); // SQUOTE
        op[1546] = getOpcodeRnm(220, 1553); // dateTimeBody
        op[1547] = getOpcodeRnm(270, 1874); // SQUOTE
        {int[] a = {1549,1550,1551,1552}; op[1548] = getOpcodeCat(a);}
        {char[] a = {100,97,116,101,116,105,109,101,111,102,102,115,101,116}; op[1549] = getOpcodeTls(a);}
        op[1550] = getOpcodeRnm(270, 1874); // SQUOTE
        op[1551] = getOpcodeRnm(221, 1577); // dateTimeOffsetBody
        op[1552] = getOpcodeRnm(270, 1874); // SQUOTE
        {int[] a = {1554,1555,1556,1557,1558,1559,1560}; op[1553] = getOpcodeCat(a);}
        op[1554] = getOpcodeRnm(225, 1650); // year
        {char[] a = {45}; op[1555] = getOpcodeTls(a);}
        op[1556] = getOpcodeRnm(226, 1652); // month
        {char[] a = {45}; op[1557] = getOpcodeTls(a);}
        op[1558] = getOpcodeRnm(227, 1662); // day
        {char[] a = {84}; op[1559] = getOpcodeTls(a);}
        {int[] a = {1561,1573}; op[1560] = getOpcodeAlt(a);}
        {int[] a = {1562,1563,1564,1565}; op[1561] = getOpcodeCat(a);}
        op[1562] = getOpcodeRnm(228, 1674); // hour
        {char[] a = {58}; op[1563] = getOpcodeTls(a);}
        op[1564] = getOpcodeRnm(229, 1686); // minute
        op[1565] = getOpcodeRep((char)0, (char)1, 1566);
        {int[] a = {1567,1568,1569}; op[1566] = getOpcodeCat(a);}
        {char[] a = {58}; op[1567] = getOpcodeTls(a);}
        op[1568] = getOpcodeRnm(230, 1687); // second
        op[1569] = getOpcodeRep((char)0, (char)1, 1570);
        {int[] a = {1571,1572}; op[1570] = getOpcodeCat(a);}
        {char[] a = {46}; op[1571] = getOpcodeTls(a);}
        op[1572] = getOpcodeRnm(231, 1688); // fractionalSeconds
        {int[] a = {1574,1575}; op[1573] = getOpcodeCat(a);}
        {char[] a = {50,52,58,48,48}; op[1574] = getOpcodeTls(a);}
        op[1575] = getOpcodeRep((char)0, (char)1, 1576);
        {char[] a = {58,48,48}; op[1576] = getOpcodeTls(a);}
        {int[] a = {1578,1579}; op[1577] = getOpcodeCat(a);}
        op[1578] = getOpcodeRnm(220, 1553); // dateTimeBody
        {int[] a = {1580,1581}; op[1579] = getOpcodeAlt(a);}
        {char[] a = {90}; op[1580] = getOpcodeTls(a);}
        {int[] a = {1582,1583,1584,1585}; op[1581] = getOpcodeCat(a);}
        op[1582] = getOpcodeRnm(273, 1877); // sign
        op[1583] = getOpcodeRnm(228, 1674); // hour
        {char[] a = {58}; op[1584] = getOpcodeTls(a);}
        op[1585] = getOpcodeRnm(229, 1686); // minute
        {int[] a = {1587,1588,1589,1591,1592,1597,1602,1607,1630}; op[1586] = getOpcodeCat(a);}
        {char[] a = {116,105,109,101}; op[1587] = getOpcodeTls(a);}
        op[1588] = getOpcodeRnm(270, 1874); // SQUOTE
        op[1589] = getOpcodeRep((char)0, (char)1, 1590);
        op[1590] = getOpcodeRnm(273, 1877); // sign
        {char[] a = {80}; op[1591] = getOpcodeTls(a);}
        op[1592] = getOpcodeRep((char)0, (char)1, 1593);
        {int[] a = {1594,1596}; op[1593] = getOpcodeCat(a);}
        op[1594] = getOpcodeRep((char)1, Character.MAX_VALUE, 1595);
        op[1595] = getOpcodeRnm(292, 2068); // DIGIT
        {char[] a = {89}; op[1596] = getOpcodeTls(a);}
        op[1597] = getOpcodeRep((char)0, (char)1, 1598);
        {int[] a = {1599,1601}; op[1598] = getOpcodeCat(a);}
        op[1599] = getOpcodeRep((char)1, Character.MAX_VALUE, 1600);
        op[1600] = getOpcodeRnm(292, 2068); // DIGIT
        {char[] a = {77}; op[1601] = getOpcodeTls(a);}
        op[1602] = getOpcodeRep((char)0, (char)1, 1603);
        {int[] a = {1604,1606}; op[1603] = getOpcodeCat(a);}
        op[1604] = getOpcodeRep((char)1, Character.MAX_VALUE, 1605);
        op[1605] = getOpcodeRnm(292, 2068); // DIGIT
        {char[] a = {68}; op[1606] = getOpcodeTls(a);}
        op[1607] = getOpcodeRep((char)0, (char)1, 1608);
        {int[] a = {1609,1610,1615,1620}; op[1608] = getOpcodeCat(a);}
        {char[] a = {84}; op[1609] = getOpcodeTls(a);}
        op[1610] = getOpcodeRep((char)0, (char)1, 1611);
        {int[] a = {1612,1614}; op[1611] = getOpcodeCat(a);}
        op[1612] = getOpcodeRep((char)1, Character.MAX_VALUE, 1613);
        op[1613] = getOpcodeRnm(292, 2068); // DIGIT
        {char[] a = {72}; op[1614] = getOpcodeTls(a);}
        op[1615] = getOpcodeRep((char)0, (char)1, 1616);
        {int[] a = {1617,1619}; op[1616] = getOpcodeCat(a);}
        op[1617] = getOpcodeRep((char)1, Character.MAX_VALUE, 1618);
        op[1618] = getOpcodeRnm(292, 2068); // DIGIT
        {char[] a = {77}; op[1619] = getOpcodeTls(a);}
        op[1620] = getOpcodeRep((char)0, (char)1, 1621);
        {int[] a = {1622,1624,1629}; op[1621] = getOpcodeCat(a);}
        op[1622] = getOpcodeRep((char)1, Character.MAX_VALUE, 1623);
        op[1623] = getOpcodeRnm(292, 2068); // DIGIT
        op[1624] = getOpcodeRep((char)0, (char)1, 1625);
        {int[] a = {1626,1627}; op[1625] = getOpcodeCat(a);}
        {char[] a = {46}; op[1626] = getOpcodeTls(a);}
        op[1627] = getOpcodeRep((char)1, Character.MAX_VALUE, 1628);
        op[1628] = getOpcodeRnm(292, 2068); // DIGIT
        {char[] a = {83}; op[1629] = getOpcodeTls(a);}
        op[1630] = getOpcodeRnm(270, 1874); // SQUOTE
        {int[] a = {1632,1633,1634,1635,1636,1637,1638,1639,1640}; op[1631] = getOpcodeAlt(a);}
        {char[] a = {49}; op[1632] = getOpcodeTls(a);}
        {char[] a = {50}; op[1633] = getOpcodeTls(a);}
        {char[] a = {51}; op[1634] = getOpcodeTls(a);}
        {char[] a = {52}; op[1635] = getOpcodeTls(a);}
        {char[] a = {53}; op[1636] = getOpcodeTls(a);}
        {char[] a = {54}; op[1637] = getOpcodeTls(a);}
        {char[] a = {55}; op[1638] = getOpcodeTls(a);}
        {char[] a = {56}; op[1639] = getOpcodeTls(a);}
        {char[] a = {57}; op[1640] = getOpcodeTls(a);}
        {int[] a = {1642,1649}; op[1641] = getOpcodeCat(a);}
        {int[] a = {1643,1644,1645,1646,1647,1648}; op[1642] = getOpcodeAlt(a);}
        {char[] a = {48}; op[1643] = getOpcodeTls(a);}
        {char[] a = {49}; op[1644] = getOpcodeTls(a);}
        {char[] a = {50}; op[1645] = getOpcodeTls(a);}
        {char[] a = {51}; op[1646] = getOpcodeTls(a);}
        {char[] a = {52}; op[1647] = getOpcodeTls(a);}
        {char[] a = {53}; op[1648] = getOpcodeTls(a);}
        op[1649] = getOpcodeRnm(292, 2068); // DIGIT
        op[1650] = getOpcodeRep((char)4, (char)4, 1651);
        op[1651] = getOpcodeRnm(292, 2068); // DIGIT
        {int[] a = {1653,1656}; op[1652] = getOpcodeAlt(a);}
        {int[] a = {1654,1655}; op[1653] = getOpcodeCat(a);}
        {char[] a = {48}; op[1654] = getOpcodeTls(a);}
        op[1655] = getOpcodeRnm(223, 1631); // oneToNine
        {int[] a = {1657,1658}; op[1656] = getOpcodeCat(a);}
        {char[] a = {49}; op[1657] = getOpcodeTls(a);}
        {int[] a = {1659,1660,1661}; op[1658] = getOpcodeAlt(a);}
        {char[] a = {48}; op[1659] = getOpcodeTls(a);}
        {char[] a = {49}; op[1660] = getOpcodeTls(a);}
        {char[] a = {50}; op[1661] = getOpcodeTls(a);}
        {int[] a = {1663,1669}; op[1662] = getOpcodeAlt(a);}
        {int[] a = {1664,1668}; op[1663] = getOpcodeCat(a);}
        {int[] a = {1665,1666,1667}; op[1664] = getOpcodeAlt(a);}
        {char[] a = {48}; op[1665] = getOpcodeTls(a);}
        {char[] a = {49}; op[1666] = getOpcodeTls(a);}
        {char[] a = {50}; op[1667] = getOpcodeTls(a);}
        op[1668] = getOpcodeRnm(223, 1631); // oneToNine
        {int[] a = {1670,1671}; op[1669] = getOpcodeCat(a);}
        {char[] a = {51}; op[1670] = getOpcodeTls(a);}
        {int[] a = {1672,1673}; op[1671] = getOpcodeAlt(a);}
        {char[] a = {48}; op[1672] = getOpcodeTls(a);}
        {char[] a = {49}; op[1673] = getOpcodeTls(a);}
        {int[] a = {1675,1680}; op[1674] = getOpcodeAlt(a);}
        {int[] a = {1676,1679}; op[1675] = getOpcodeCat(a);}
        {int[] a = {1677,1678}; op[1676] = getOpcodeAlt(a);}
        {char[] a = {48}; op[1677] = getOpcodeTls(a);}
        {char[] a = {49}; op[1678] = getOpcodeTls(a);}
        op[1679] = getOpcodeRnm(292, 2068); // DIGIT
        {int[] a = {1681,1682}; op[1680] = getOpcodeCat(a);}
        {char[] a = {50}; op[1681] = getOpcodeTls(a);}
        {int[] a = {1683,1684,1685}; op[1682] = getOpcodeAlt(a);}
        {char[] a = {49}; op[1683] = getOpcodeTls(a);}
        {char[] a = {50}; op[1684] = getOpcodeTls(a);}
        {char[] a = {51}; op[1685] = getOpcodeTls(a);}
        op[1686] = getOpcodeRnm(224, 1641); // zeroToFiftyNine
        op[1687] = getOpcodeRnm(224, 1641); // zeroToFiftyNine
        op[1688] = getOpcodeRep((char)1, Character.MAX_VALUE, 1689);
        op[1689] = getOpcodeRnm(292, 2068); // DIGIT
        {int[] a = {1691,1692,1693}; op[1690] = getOpcodeCat(a);}
        op[1691] = getOpcodeRnm(267, 1859); // geographyPrefix
        op[1692] = getOpcodeRnm(233, 1694); // fullCollectionLiteral
        op[1693] = getOpcodeRnm(270, 1874); // SQUOTE
        {int[] a = {1695,1696}; op[1694] = getOpcodeCat(a);}
        op[1695] = getOpcodeRnm(251, 1789); // sridLiteral
        op[1696] = getOpcodeRnm(234, 1697); // collectionLiteral
        {int[] a = {1698,1699,1700,1704}; op[1697] = getOpcodeCat(a);}
        {char[] a = {67,111,108,108,101,99,116,105,111,110,40}; op[1698] = getOpcodeTls(a);}
        op[1699] = getOpcodeRnm(235, 1705); // geoLiteral
        op[1700] = getOpcodeRep((char)0, Character.MAX_VALUE, 1701);
        {int[] a = {1702,1703}; op[1701] = getOpcodeCat(a);}
        op[1702] = getOpcodeRnm(272, 1876); // COMMA
        op[1703] = getOpcodeRnm(235, 1705); // geoLiteral
        {char[] a = {41}; op[1704] = getOpcodeTls(a);}
        {int[] a = {1706,1707,1708,1709,1710,1711,1712}; op[1705] = getOpcodeAlt(a);}
        op[1706] = getOpcodeRnm(234, 1697); // collectionLiteral
        op[1707] = getOpcodeRnm(238, 1720); // lineStringLiteral
        op[1708] = getOpcodeRnm(245, 1755); // multiPointLiteral
        op[1709] = getOpcodeRnm(242, 1738); // multiLineStringLiteral
        op[1710] = getOpcodeRnm(248, 1772); // multiPolygonLiteral
        op[1711] = getOpcodeRnm(252, 1794); // pointLiteral
        op[1712] = getOpcodeRnm(257, 1812); // polygonLiteral
        {int[] a = {1714,1715,1716}; op[1713] = getOpcodeCat(a);}
        op[1714] = getOpcodeRnm(267, 1859); // geographyPrefix
        op[1715] = getOpcodeRnm(237, 1717); // fullLineStringLiteral
        op[1716] = getOpcodeRnm(270, 1874); // SQUOTE
        {int[] a = {1718,1719}; op[1717] = getOpcodeCat(a);}
        op[1718] = getOpcodeRnm(251, 1789); // sridLiteral
        op[1719] = getOpcodeRnm(238, 1720); // lineStringLiteral
        {int[] a = {1721,1722}; op[1720] = getOpcodeCat(a);}
        {char[] a = {76,105,110,101,83,116,114,105,110,103}; op[1721] = getOpcodeTls(a);}
        op[1722] = getOpcodeRnm(239, 1723); // lineStringData
        {int[] a = {1724,1725,1726,1730}; op[1723] = getOpcodeCat(a);}
        {char[] a = {40}; op[1724] = getOpcodeTls(a);}
        op[1725] = getOpcodeRnm(254, 1801); // positionLiteral
        op[1726] = getOpcodeRep((char)1, Character.MAX_VALUE, 1727);
        {int[] a = {1728,1729}; op[1727] = getOpcodeCat(a);}
        op[1728] = getOpcodeRnm(272, 1876); // COMMA
        op[1729] = getOpcodeRnm(254, 1801); // positionLiteral
        {char[] a = {41}; op[1730] = getOpcodeTls(a);}
        {int[] a = {1732,1733,1734}; op[1731] = getOpcodeCat(a);}
        op[1732] = getOpcodeRnm(267, 1859); // geographyPrefix
        op[1733] = getOpcodeRnm(241, 1735); // fullMultiLineStringLiteral
        op[1734] = getOpcodeRnm(270, 1874); // SQUOTE
        {int[] a = {1736,1737}; op[1735] = getOpcodeCat(a);}
        op[1736] = getOpcodeRnm(251, 1789); // sridLiteral
        op[1737] = getOpcodeRnm(242, 1738); // multiLineStringLiteral
        {int[] a = {1739,1740,1747}; op[1738] = getOpcodeCat(a);}
        {char[] a = {77,117,108,116,105,76,105,110,101,83,116,114,105,110,103,40}; op[1739] = getOpcodeTls(a);}
        op[1740] = getOpcodeRep((char)0, (char)1, 1741);
        {int[] a = {1742,1743}; op[1741] = getOpcodeCat(a);}
        op[1742] = getOpcodeRnm(239, 1723); // lineStringData
        op[1743] = getOpcodeRep((char)0, Character.MAX_VALUE, 1744);
        {int[] a = {1745,1746}; op[1744] = getOpcodeCat(a);}
        op[1745] = getOpcodeRnm(272, 1876); // COMMA
        op[1746] = getOpcodeRnm(239, 1723); // lineStringData
        {char[] a = {41}; op[1747] = getOpcodeTls(a);}
        {int[] a = {1749,1750,1751}; op[1748] = getOpcodeCat(a);}
        op[1749] = getOpcodeRnm(267, 1859); // geographyPrefix
        op[1750] = getOpcodeRnm(244, 1752); // fullMultiPointLiteral
        op[1751] = getOpcodeRnm(270, 1874); // SQUOTE
        {int[] a = {1753,1754}; op[1752] = getOpcodeCat(a);}
        op[1753] = getOpcodeRnm(251, 1789); // sridLiteral
        op[1754] = getOpcodeRnm(245, 1755); // multiPointLiteral
        {int[] a = {1756,1757,1764}; op[1755] = getOpcodeCat(a);}
        {char[] a = {77,117,108,116,105,80,111,105,110,116,40}; op[1756] = getOpcodeTls(a);}
        op[1757] = getOpcodeRep((char)0, (char)1, 1758);
        {int[] a = {1759,1760}; op[1758] = getOpcodeCat(a);}
        op[1759] = getOpcodeRnm(253, 1797); // pointData
        op[1760] = getOpcodeRep((char)0, Character.MAX_VALUE, 1761);
        {int[] a = {1762,1763}; op[1761] = getOpcodeCat(a);}
        op[1762] = getOpcodeRnm(272, 1876); // COMMA
        op[1763] = getOpcodeRnm(253, 1797); // pointData
        {char[] a = {41}; op[1764] = getOpcodeTls(a);}
        {int[] a = {1766,1767,1768}; op[1765] = getOpcodeCat(a);}
        op[1766] = getOpcodeRnm(267, 1859); // geographyPrefix
        op[1767] = getOpcodeRnm(247, 1769); // fullMultiPolygonLiteral
        op[1768] = getOpcodeRnm(270, 1874); // SQUOTE
        {int[] a = {1770,1771}; op[1769] = getOpcodeCat(a);}
        op[1770] = getOpcodeRnm(251, 1789); // sridLiteral
        op[1771] = getOpcodeRnm(248, 1772); // multiPolygonLiteral
        {int[] a = {1773,1774,1781}; op[1772] = getOpcodeCat(a);}
        {char[] a = {77,117,108,116,105,80,111,108,121,103,111,110,40}; op[1773] = getOpcodeTls(a);}
        op[1774] = getOpcodeRep((char)0, (char)1, 1775);
        {int[] a = {1776,1777}; op[1775] = getOpcodeCat(a);}
        op[1776] = getOpcodeRnm(258, 1815); // polygonData
        op[1777] = getOpcodeRep((char)0, Character.MAX_VALUE, 1778);
        {int[] a = {1779,1780}; op[1778] = getOpcodeCat(a);}
        op[1779] = getOpcodeRnm(272, 1876); // COMMA
        op[1780] = getOpcodeRnm(258, 1815); // polygonData
        {char[] a = {41}; op[1781] = getOpcodeTls(a);}
        {int[] a = {1783,1784,1785}; op[1782] = getOpcodeCat(a);}
        op[1783] = getOpcodeRnm(267, 1859); // geographyPrefix
        op[1784] = getOpcodeRnm(250, 1786); // fullPointLiteral
        op[1785] = getOpcodeRnm(270, 1874); // SQUOTE
        {int[] a = {1787,1788}; op[1786] = getOpcodeCat(a);}
        op[1787] = getOpcodeRnm(251, 1789); // sridLiteral
        op[1788] = getOpcodeRnm(252, 1794); // pointLiteral
        {int[] a = {1790,1791,1793}; op[1789] = getOpcodeCat(a);}
        {char[] a = {83,82,73,68,61}; op[1790] = getOpcodeTls(a);}
        op[1791] = getOpcodeRep((char)1, (char)5, 1792);
        op[1792] = getOpcodeRnm(292, 2068); // DIGIT
        op[1793] = getOpcodeRnm(271, 1875); // SEMI
        {int[] a = {1795,1796}; op[1794] = getOpcodeCat(a);}
        {char[] a = {80,111,105,110,116}; op[1795] = getOpcodeTls(a);}
        op[1796] = getOpcodeRnm(253, 1797); // pointData
        {int[] a = {1798,1799,1800}; op[1797] = getOpcodeCat(a);}
        {char[] a = {40}; op[1798] = getOpcodeTls(a);}
        op[1799] = getOpcodeRnm(254, 1801); // positionLiteral
        {char[] a = {41}; op[1800] = getOpcodeTls(a);}
        {int[] a = {1802,1803,1804}; op[1801] = getOpcodeCat(a);}
        op[1802] = getOpcodeRnm(201, 1436); // double
        op[1803] = getOpcodeRnm(295, 2078); // SP
        op[1804] = getOpcodeRnm(201, 1436); // double
        {int[] a = {1806,1807,1808}; op[1805] = getOpcodeCat(a);}
        op[1806] = getOpcodeRnm(267, 1859); // geographyPrefix
        op[1807] = getOpcodeRnm(256, 1809); // fullPolygonLiteral
        op[1808] = getOpcodeRnm(270, 1874); // SQUOTE
        {int[] a = {1810,1811}; op[1809] = getOpcodeCat(a);}
        op[1810] = getOpcodeRnm(251, 1789); // sridLiteral
        op[1811] = getOpcodeRnm(257, 1812); // polygonLiteral
        {int[] a = {1813,1814}; op[1812] = getOpcodeCat(a);}
        {char[] a = {80,111,108,121,103,111,110}; op[1813] = getOpcodeTls(a);}
        op[1814] = getOpcodeRnm(258, 1815); // polygonData
        {int[] a = {1816,1817,1818,1822}; op[1815] = getOpcodeCat(a);}
        {char[] a = {40}; op[1816] = getOpcodeTls(a);}
        op[1817] = getOpcodeRnm(259, 1823); // ringLiteral
        op[1818] = getOpcodeRep((char)0, Character.MAX_VALUE, 1819);
        {int[] a = {1820,1821}; op[1819] = getOpcodeCat(a);}
        op[1820] = getOpcodeRnm(272, 1876); // COMMA
        op[1821] = getOpcodeRnm(259, 1823); // ringLiteral
        {char[] a = {41}; op[1822] = getOpcodeTls(a);}
        {int[] a = {1824,1825,1826,1830}; op[1823] = getOpcodeCat(a);}
        {char[] a = {40}; op[1824] = getOpcodeTls(a);}
        op[1825] = getOpcodeRnm(254, 1801); // positionLiteral
        op[1826] = getOpcodeRep((char)0, Character.MAX_VALUE, 1827);
        {int[] a = {1828,1829}; op[1827] = getOpcodeCat(a);}
        op[1828] = getOpcodeRnm(272, 1876); // COMMA
        op[1829] = getOpcodeRnm(254, 1801); // positionLiteral
        {char[] a = {41}; op[1830] = getOpcodeTls(a);}
        {int[] a = {1832,1833,1834}; op[1831] = getOpcodeCat(a);}
        op[1832] = getOpcodeRnm(268, 1862); // geometryPrefix
        op[1833] = getOpcodeRnm(233, 1694); // fullCollectionLiteral
        op[1834] = getOpcodeRnm(270, 1874); // SQUOTE
        {int[] a = {1836,1837,1838}; op[1835] = getOpcodeCat(a);}
        op[1836] = getOpcodeRnm(268, 1862); // geometryPrefix
        op[1837] = getOpcodeRnm(237, 1717); // fullLineStringLiteral
        op[1838] = getOpcodeRnm(270, 1874); // SQUOTE
        {int[] a = {1840,1841,1842}; op[1839] = getOpcodeCat(a);}
        op[1840] = getOpcodeRnm(268, 1862); // geometryPrefix
        op[1841] = getOpcodeRnm(241, 1735); // fullMultiLineStringLiteral
        op[1842] = getOpcodeRnm(270, 1874); // SQUOTE
        {int[] a = {1844,1845,1846}; op[1843] = getOpcodeCat(a);}
        op[1844] = getOpcodeRnm(268, 1862); // geometryPrefix
        op[1845] = getOpcodeRnm(244, 1752); // fullMultiPointLiteral
        op[1846] = getOpcodeRnm(270, 1874); // SQUOTE
        {int[] a = {1848,1849,1850}; op[1847] = getOpcodeCat(a);}
        op[1848] = getOpcodeRnm(268, 1862); // geometryPrefix
        op[1849] = getOpcodeRnm(247, 1769); // fullMultiPolygonLiteral
        op[1850] = getOpcodeRnm(270, 1874); // SQUOTE
        {int[] a = {1852,1853,1854}; op[1851] = getOpcodeCat(a);}
        op[1852] = getOpcodeRnm(268, 1862); // geometryPrefix
        op[1853] = getOpcodeRnm(250, 1786); // fullPointLiteral
        op[1854] = getOpcodeRnm(270, 1874); // SQUOTE
        {int[] a = {1856,1857,1858}; op[1855] = getOpcodeCat(a);}
        op[1856] = getOpcodeRnm(268, 1862); // geometryPrefix
        op[1857] = getOpcodeRnm(256, 1809); // fullPolygonLiteral
        op[1858] = getOpcodeRnm(270, 1874); // SQUOTE
        {int[] a = {1860,1861}; op[1859] = getOpcodeCat(a);}
        {char[] a = {103,101,111,103,114,97,112,104,121}; op[1860] = getOpcodeTls(a);}
        op[1861] = getOpcodeRnm(270, 1874); // SQUOTE
        {int[] a = {1863,1864}; op[1862] = getOpcodeCat(a);}
        {char[] a = {103,101,111,109,101,116,114,121}; op[1863] = getOpcodeTls(a);}
        op[1864] = getOpcodeRnm(270, 1874); // SQUOTE
        {int[] a = {1866,1867,1868,1869,1870,1871,1872,1873}; op[1865] = getOpcodeAlt(a);}
        op[1866] = getOpcodeRnm(295, 2078); // SP
        op[1867] = getOpcodeRnm(296, 2079); // HTAB
        op[1868] = getOpcodeRnm(294, 2077); // DQUOTE
        {char[] a = {58}; op[1869] = getOpcodeTls(a);}
        {char[] a = {123}; op[1870] = getOpcodeTls(a);}
        {char[] a = {125}; op[1871] = getOpcodeTls(a);}
        {char[] a = {91}; op[1872] = getOpcodeTls(a);}
        {char[] a = {93}; op[1873] = getOpcodeTls(a);}
        {char[] a = {39}; op[1874] = getOpcodeTbs(a);}
        {char[] a = {59}; op[1875] = getOpcodeTbs(a);}
        {char[] a = {44}; op[1876] = getOpcodeTbs(a);}
        {int[] a = {1878,1879}; op[1877] = getOpcodeAlt(a);}
        {char[] a = {43}; op[1878] = getOpcodeTls(a);}
        {char[] a = {45}; op[1879] = getOpcodeTls(a);}
        {char[] a = {42}; op[1880] = getOpcodeTls(a);}
        {int[] a = {1882,1883,1884}; op[1881] = getOpcodeAlt(a);}
        op[1882] = getOpcodeRnm(277, 1887); // IP-literal
        op[1883] = getOpcodeRnm(282, 2003); // IPv4address
        op[1884] = getOpcodeRnm(284, 2027); // reg-name
        op[1885] = getOpcodeRep((char)0, Character.MAX_VALUE, 1886);
        op[1886] = getOpcodeRnm(292, 2068); // DIGIT
        {int[] a = {1888,1889,1892}; op[1887] = getOpcodeCat(a);}
        {char[] a = {91}; op[1888] = getOpcodeTls(a);}
        {int[] a = {1890,1891}; op[1889] = getOpcodeAlt(a);}
        op[1890] = getOpcodeRnm(279, 1903); // IPv6address
        op[1891] = getOpcodeRnm(278, 1893); // IPvFuture
        {char[] a = {93}; op[1892] = getOpcodeTls(a);}
        {int[] a = {1894,1895,1897,1898}; op[1893] = getOpcodeCat(a);}
        {char[] a = {118}; op[1894] = getOpcodeTls(a);}
        op[1895] = getOpcodeRep((char)1, Character.MAX_VALUE, 1896);
        op[1896] = getOpcodeRnm(293, 2069); // HEXDIG
        {char[] a = {46}; op[1897] = getOpcodeTls(a);}
        op[1898] = getOpcodeRep((char)1, Character.MAX_VALUE, 1899);
        {int[] a = {1900,1901,1902}; op[1899] = getOpcodeAlt(a);}
        op[1900] = getOpcodeRnm(288, 2044); // unreserved
        op[1901] = getOpcodeRnm(289, 2051); // sub-delims
        {char[] a = {58}; op[1902] = getOpcodeTls(a);}
        {int[] a = {1904,1910,1917,1926,1940,1954,1966,1976,1986}; op[1903] = getOpcodeAlt(a);}
        {int[] a = {1905,1909}; op[1904] = getOpcodeCat(a);}
        op[1905] = getOpcodeRep((char)6, (char)6, 1906);
        {int[] a = {1907,1908}; op[1906] = getOpcodeCat(a);}
        op[1907] = getOpcodeRnm(280, 1995); // h16
        {char[] a = {58}; op[1908] = getOpcodeTls(a);}
        op[1909] = getOpcodeRnm(281, 1997); // ls32
        {int[] a = {1911,1912,1916}; op[1910] = getOpcodeCat(a);}
        {char[] a = {58,58}; op[1911] = getOpcodeTls(a);}
        op[1912] = getOpcodeRep((char)5, (char)5, 1913);
        {int[] a = {1914,1915}; op[1913] = getOpcodeCat(a);}
        op[1914] = getOpcodeRnm(280, 1995); // h16
        {char[] a = {58}; op[1915] = getOpcodeTls(a);}
        op[1916] = getOpcodeRnm(281, 1997); // ls32
        {int[] a = {1918,1920,1921,1925}; op[1917] = getOpcodeCat(a);}
        op[1918] = getOpcodeRep((char)0, (char)1, 1919);
        op[1919] = getOpcodeRnm(280, 1995); // h16
        {char[] a = {58,58}; op[1920] = getOpcodeTls(a);}
        op[1921] = getOpcodeRep((char)4, (char)4, 1922);
        {int[] a = {1923,1924}; op[1922] = getOpcodeCat(a);}
        op[1923] = getOpcodeRnm(280, 1995); // h16
        {char[] a = {58}; op[1924] = getOpcodeTls(a);}
        op[1925] = getOpcodeRnm(281, 1997); // ls32
        {int[] a = {1927,1934,1935,1939}; op[1926] = getOpcodeCat(a);}
        op[1927] = getOpcodeRep((char)0, (char)1, 1928);
        {int[] a = {1929,1933}; op[1928] = getOpcodeCat(a);}
        op[1929] = getOpcodeRep((char)0, (char)1, 1930);
        {int[] a = {1931,1932}; op[1930] = getOpcodeCat(a);}
        op[1931] = getOpcodeRnm(280, 1995); // h16
        {char[] a = {58}; op[1932] = getOpcodeTls(a);}
        op[1933] = getOpcodeRnm(280, 1995); // h16
        {char[] a = {58,58}; op[1934] = getOpcodeTls(a);}
        op[1935] = getOpcodeRep((char)3, (char)3, 1936);
        {int[] a = {1937,1938}; op[1936] = getOpcodeCat(a);}
        op[1937] = getOpcodeRnm(280, 1995); // h16
        {char[] a = {58}; op[1938] = getOpcodeTls(a);}
        op[1939] = getOpcodeRnm(281, 1997); // ls32
        {int[] a = {1941,1948,1949,1953}; op[1940] = getOpcodeCat(a);}
        op[1941] = getOpcodeRep((char)0, (char)1, 1942);
        {int[] a = {1943,1947}; op[1942] = getOpcodeCat(a);}
        op[1943] = getOpcodeRep((char)0, (char)2, 1944);
        {int[] a = {1945,1946}; op[1944] = getOpcodeCat(a);}
        op[1945] = getOpcodeRnm(280, 1995); // h16
        {char[] a = {58}; op[1946] = getOpcodeTls(a);}
        op[1947] = getOpcodeRnm(280, 1995); // h16
        {char[] a = {58,58}; op[1948] = getOpcodeTls(a);}
        op[1949] = getOpcodeRep((char)2, (char)2, 1950);
        {int[] a = {1951,1952}; op[1950] = getOpcodeCat(a);}
        op[1951] = getOpcodeRnm(280, 1995); // h16
        {char[] a = {58}; op[1952] = getOpcodeTls(a);}
        op[1953] = getOpcodeRnm(281, 1997); // ls32
        {int[] a = {1955,1962,1963,1964,1965}; op[1954] = getOpcodeCat(a);}
        op[1955] = getOpcodeRep((char)0, (char)1, 1956);
        {int[] a = {1957,1961}; op[1956] = getOpcodeCat(a);}
        op[1957] = getOpcodeRep((char)0, (char)3, 1958);
        {int[] a = {1959,1960}; op[1958] = getOpcodeCat(a);}
        op[1959] = getOpcodeRnm(280, 1995); // h16
        {char[] a = {58}; op[1960] = getOpcodeTls(a);}
        op[1961] = getOpcodeRnm(280, 1995); // h16
        {char[] a = {58,58}; op[1962] = getOpcodeTls(a);}
        op[1963] = getOpcodeRnm(280, 1995); // h16
        {char[] a = {58}; op[1964] = getOpcodeTls(a);}
        op[1965] = getOpcodeRnm(281, 1997); // ls32
        {int[] a = {1967,1974,1975}; op[1966] = getOpcodeCat(a);}
        op[1967] = getOpcodeRep((char)0, (char)1, 1968);
        {int[] a = {1969,1973}; op[1968] = getOpcodeCat(a);}
        op[1969] = getOpcodeRep((char)0, (char)4, 1970);
        {int[] a = {1971,1972}; op[1970] = getOpcodeCat(a);}
        op[1971] = getOpcodeRnm(280, 1995); // h16
        {char[] a = {58}; op[1972] = getOpcodeTls(a);}
        op[1973] = getOpcodeRnm(280, 1995); // h16
        {char[] a = {58,58}; op[1974] = getOpcodeTls(a);}
        op[1975] = getOpcodeRnm(281, 1997); // ls32
        {int[] a = {1977,1984,1985}; op[1976] = getOpcodeCat(a);}
        op[1977] = getOpcodeRep((char)0, (char)1, 1978);
        {int[] a = {1979,1983}; op[1978] = getOpcodeCat(a);}
        op[1979] = getOpcodeRep((char)0, (char)5, 1980);
        {int[] a = {1981,1982}; op[1980] = getOpcodeCat(a);}
        op[1981] = getOpcodeRnm(280, 1995); // h16
        {char[] a = {58}; op[1982] = getOpcodeTls(a);}
        op[1983] = getOpcodeRnm(280, 1995); // h16
        {char[] a = {58,58}; op[1984] = getOpcodeTls(a);}
        op[1985] = getOpcodeRnm(280, 1995); // h16
        {int[] a = {1987,1994}; op[1986] = getOpcodeCat(a);}
        op[1987] = getOpcodeRep((char)0, (char)1, 1988);
        {int[] a = {1989,1993}; op[1988] = getOpcodeCat(a);}
        op[1989] = getOpcodeRep((char)0, (char)6, 1990);
        {int[] a = {1991,1992}; op[1990] = getOpcodeCat(a);}
        op[1991] = getOpcodeRnm(280, 1995); // h16
        {char[] a = {58}; op[1992] = getOpcodeTls(a);}
        op[1993] = getOpcodeRnm(280, 1995); // h16
        {char[] a = {58,58}; op[1994] = getOpcodeTls(a);}
        op[1995] = getOpcodeRep((char)1, (char)4, 1996);
        op[1996] = getOpcodeRnm(293, 2069); // HEXDIG
        {int[] a = {1998,2002}; op[1997] = getOpcodeAlt(a);}
        {int[] a = {1999,2000,2001}; op[1998] = getOpcodeCat(a);}
        op[1999] = getOpcodeRnm(280, 1995); // h16
        {char[] a = {58}; op[2000] = getOpcodeTls(a);}
        op[2001] = getOpcodeRnm(280, 1995); // h16
        op[2002] = getOpcodeRnm(282, 2003); // IPv4address
        {int[] a = {2004,2005,2006,2007,2008,2009,2010}; op[2003] = getOpcodeCat(a);}
        op[2004] = getOpcodeRnm(283, 2011); // dec-octet
        {char[] a = {46}; op[2005] = getOpcodeTls(a);}
        op[2006] = getOpcodeRnm(283, 2011); // dec-octet
        {char[] a = {46}; op[2007] = getOpcodeTls(a);}
        op[2008] = getOpcodeRnm(283, 2011); // dec-octet
        {char[] a = {46}; op[2009] = getOpcodeTls(a);}
        op[2010] = getOpcodeRnm(283, 2011); // dec-octet
        {int[] a = {2012,2016,2020,2023,2026}; op[2011] = getOpcodeAlt(a);}
        {int[] a = {2013,2014}; op[2012] = getOpcodeCat(a);}
        {char[] a = {49}; op[2013] = getOpcodeTls(a);}
        op[2014] = getOpcodeRep((char)2, (char)2, 2015);
        op[2015] = getOpcodeRnm(292, 2068); // DIGIT
        {int[] a = {2017,2018,2019}; op[2016] = getOpcodeCat(a);}
        {char[] a = {50}; op[2017] = getOpcodeTls(a);}
        op[2018] = getOpcodeTrg((char)48, (char)52);
        op[2019] = getOpcodeRnm(292, 2068); // DIGIT
        {int[] a = {2021,2022}; op[2020] = getOpcodeCat(a);}
        {char[] a = {50,53}; op[2021] = getOpcodeTls(a);}
        op[2022] = getOpcodeTrg((char)48, (char)53);
        {int[] a = {2024,2025}; op[2023] = getOpcodeCat(a);}
        op[2024] = getOpcodeTrg((char)49, (char)57);
        op[2025] = getOpcodeRnm(292, 2068); // DIGIT
        op[2026] = getOpcodeRnm(292, 2068); // DIGIT
        op[2027] = getOpcodeRep((char)0, Character.MAX_VALUE, 2028);
        {int[] a = {2029,2030,2031}; op[2028] = getOpcodeAlt(a);}
        op[2029] = getOpcodeRnm(288, 2044); // unreserved
        op[2030] = getOpcodeRnm(287, 2040); // pct-encoded
        op[2031] = getOpcodeRnm(289, 2051); // sub-delims
        op[2032] = getOpcodeRep((char)1, Character.MAX_VALUE, 2033);
        op[2033] = getOpcodeRnm(286, 2034); // pchar
        {int[] a = {2035,2036,2037,2038,2039}; op[2034] = getOpcodeAlt(a);}
        op[2035] = getOpcodeRnm(288, 2044); // unreserved
        op[2036] = getOpcodeRnm(287, 2040); // pct-encoded
        op[2037] = getOpcodeRnm(289, 2051); // sub-delims
        {char[] a = {58}; op[2038] = getOpcodeTls(a);}
        {char[] a = {64}; op[2039] = getOpcodeTls(a);}
        {int[] a = {2041,2042,2043}; op[2040] = getOpcodeCat(a);}
        {char[] a = {37}; op[2041] = getOpcodeTls(a);}
        op[2042] = getOpcodeRnm(293, 2069); // HEXDIG
        op[2043] = getOpcodeRnm(293, 2069); // HEXDIG
        {int[] a = {2045,2046,2047,2048,2049,2050}; op[2044] = getOpcodeAlt(a);}
        op[2045] = getOpcodeRnm(291, 2065); // ALPHA
        op[2046] = getOpcodeRnm(292, 2068); // DIGIT
        {char[] a = {45}; op[2047] = getOpcodeTls(a);}
        {char[] a = {46}; op[2048] = getOpcodeTls(a);}
        {char[] a = {95}; op[2049] = getOpcodeTls(a);}
        {char[] a = {126}; op[2050] = getOpcodeTls(a);}
        {int[] a = {2052,2053,2054,2055}; op[2051] = getOpcodeAlt(a);}
        {char[] a = {36}; op[2052] = getOpcodeTls(a);}
        {char[] a = {38}; op[2053] = getOpcodeTls(a);}
        {char[] a = {61}; op[2054] = getOpcodeTls(a);}
        op[2055] = getOpcodeRnm(290, 2056); // other-delims
        {int[] a = {2057,2058,2059,2060,2061,2062,2063,2064}; op[2056] = getOpcodeAlt(a);}
        {char[] a = {33}; op[2057] = getOpcodeTls(a);}
        {char[] a = {39}; op[2058] = getOpcodeTls(a);}
        {char[] a = {40}; op[2059] = getOpcodeTls(a);}
        {char[] a = {41}; op[2060] = getOpcodeTls(a);}
        {char[] a = {42}; op[2061] = getOpcodeTls(a);}
        {char[] a = {43}; op[2062] = getOpcodeTls(a);}
        {char[] a = {44}; op[2063] = getOpcodeTls(a);}
        {char[] a = {59}; op[2064] = getOpcodeTls(a);}
        {int[] a = {2066,2067}; op[2065] = getOpcodeAlt(a);}
        op[2066] = getOpcodeTrg((char)65, (char)90);
        op[2067] = getOpcodeTrg((char)97, (char)122);
        op[2068] = getOpcodeTrg((char)48, (char)57);
        {int[] a = {2070,2071,2072,2073,2074,2075,2076}; op[2069] = getOpcodeAlt(a);}
        op[2070] = getOpcodeRnm(292, 2068); // DIGIT
        {char[] a = {65}; op[2071] = getOpcodeTls(a);}
        {char[] a = {66}; op[2072] = getOpcodeTls(a);}
        {char[] a = {67}; op[2073] = getOpcodeTls(a);}
        {char[] a = {68}; op[2074] = getOpcodeTls(a);}
        {char[] a = {69}; op[2075] = getOpcodeTls(a);}
        {char[] a = {70}; op[2076] = getOpcodeTls(a);}
        {char[] a = {34}; op[2077] = getOpcodeTbs(a);}
        {char[] a = {32}; op[2078] = getOpcodeTbs(a);}
        {char[] a = {9}; op[2079] = getOpcodeTbs(a);}
        {int[] a = {2081,2082}; op[2080] = getOpcodeAlt(a);}
        op[2081] = getOpcodeRnm(295, 2078); // SP
        op[2082] = getOpcodeRnm(296, 2079); // HTAB
        return op;
    }

    /** Displays the original SABNF grammar on the output device.
     * @param out the output device to display on.*/
    public static void display(PrintStream out){
        out.println(";");
        out.println("; grammar.GrammarUnderTest");
        out.println(";");
        out.println(";------------------------------------------------------------------------------");
        out.println("; odata-v1.0-abnf for URI conventions");
        out.println(";------------------------------------------------------------------------------");
        out.println("; The following rules assume that URIs have been percent-encoding normalized as");
        out.println("; described in section 6.2.2.2 of RFC3986 ");
        out.println("; (http://tools.ietf.org/html/rfc3986#section-6.2.2) ");
        out.println("; before applying the grammar to them, i.e. all characters in the unreserved ");
        out.println("; set (see rule \"unreserved\" below) are plain literals and NOT percent-encoded. ");
        out.println(";");
        out.println("; In addition the characters in rule \"unencoded\" (see section 7. Punctuation)");
        out.println("; must also be stated as plain literals and not percent-encoded when occurring");
        out.println("; in the resourcePath or queryOptions part of a URI.");
        out.println(";------------------------------------------------------------------------------");
        out.println("; Contents");
        out.println("; --------");
        out.println("; 1. Resource Path");
        out.println("; 2. Query Options");
        out.println("; 3. Expressions");
        out.println("; 4. JSON format for function and action parameters");
        out.println("; 5. Names and identifiers");
        out.println("; 6. Literal Data Values");
        out.println("; 7. Punctuation");
        out.println(";");
        out.println("; A. URI syntax [RFC3986]");
        out.println("; B. ABNF core definitions [RFC5234]");
        out.println("; C. UTF-8 syntax [RFC3629]");
        out.println(";------------------------------------------------------------------------------");
        out.println("");
        out.println("odataUri = ( \"https\" / \"http\" ) \"://\" host [ \":\" port ] ");
        out.println("           serviceRoot ");
        out.println("           [ \"$metadata\" / \"$batch\" / odataRelativeUri ]  ");
        out.println("");
        out.println("serviceRoot = \"/\" *( segment-nz \"/\" )");
        out.println("");
        out.println("odataRelativeUri = resourcePath [ \"?\" queryOptions ]");
        out.println("");
        out.println(";------------------------------------------------------------------------------");
        out.println("; 1. Resource Path");
        out.println(";------------------------------------------------------------------------------");
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
        out.println("simpleKey        = \"(\" keyPropertyValue \")\"");
        out.println("compoundKey      = \"(\" keyValuePair *( COMMA keyValuePair ) \")\"");
        out.println("keyValuePair     = primitiveKeyProperty \"=\" keyPropertyValue");
        out.println("keyPropertyValue = primitiveLiteral");
        out.println("");
        out.println("singleNavigation = [ \"/\" qualifiedEntityTypeName ] ");
        out.println("                   ( links \"/\" navigationProperty ");
        out.println("                   / \"/\" ( entityColNavigationProperty [ collectionNavigation ]");
        out.println("                         / entityNavigationProperty    [ singleNavigation ]");
        out.println("                         / complexColProperty          [ collectionPath ]");
        out.println("                         / complexProperty             [ complexPath ]");
        out.println("                         / primitiveColProperty        [ collectionPath ]");
        out.println("                         / primitiveProperty           [ singlePath ]");
        out.println("                         / streamProperty ");
        out.println("                         )");
        out.println("                   / boundOperation ");
        out.println("                   / \"\"     ; for casting after key access");
        out.println("                   )");
        out.println("");
        out.println("collectionPath = count / boundOperation");
        out.println("singlePath     = value / boundOperation");
        out.println("");
        out.println("complexPath    = [ \"/\" qualifiedComplexTypeName ] ");
        out.println("                 ( \"/\" ( complexProperty   [ complexPath ]");
        out.println("                       / primitiveProperty [ singlePath ]");
        out.println("                       ) ");
        out.println("                 / boundOperation");
        out.println("                 )");
        out.println("");
        out.println("count = \"/\" %x24.63.6f.75.6e.74 ; $count");
        out.println("links = \"/\" %x24.6c.69.6e.6b.73 ; $links");
        out.println("value = \"/\" %x24.76.61.6c.75.65 ; $value");
        out.println("");
        out.println("; boundOperation segments can only be composed if the type of the previous segment ");
        out.println("; matches the type of the first parameter of the action or function being called.");
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
        out.println("                  ; and is specified by reference using the URI immediately preceding (to the left) of the boundActionCall");
        out.println("");
        out.println("; The following boundXxxFuncCall rules have the added restrictions that");
        out.println(";  - the function MUST support binding, and ");
        out.println(";  - the binding parameter type MUST match the type of resource identified by the ");
        out.println(";    URI immediately preceding (to the left) of the boundXxxFuncCall, and");
        out.println(";  - the functionParameters MUST NOT include the bindingParameter.");
        out.println("boundEntityFuncCall       = entityFunctionCall");
        out.println("boundEntityColFuncCall    = entityColFunctionCall");
        out.println("boundComplexFuncCall      = complexFunctionCall");
        out.println("boundComplexColFuncCall   = complexColFunctionCall");
        out.println("boundPrimitiveFuncCall    = primitiveFunctionCall");
        out.println("boundPrimitiveColFuncCall = primitiveColFunctionCall");
        out.println("");
        out.println("entityFunctionCall       = [ operationQualifier ] entityFunction       functionParameters");
        out.println("entityColFunctionCall    = [ operationQualifier ] entityColFunction    functionParameters");
        out.println("complexFunctionCall      = [ operationQualifier ] complexFunction      functionParameters");
        out.println("complexColFunctionCall   = [ operationQualifier ] complexColFunction   functionParameters");
        out.println("primitiveFunctionCall    = [ operationQualifier ] primitiveFunction    functionParameters");
        out.println("primitiveColFunctionCall = [ operationQualifier ] primitiveColFunction functionParameters");
        out.println("");
        out.println("functionParameters    = \"(\" [ functionParameter *( COMMA functionParameter ) ] \")\"");
        out.println("functionParameter     = functionParameterName \"=\" ( parameterAlias / primitiveLiteral )");
        out.println("functionParameterName = odataIdentifier");
        out.println("parameterAlias        = \"@\" odataIdentifier");
        out.println("");
        out.println(";------------------------------------------------------------------------------");
        out.println("; 2. Query Options");
        out.println(";------------------------------------------------------------------------------");
        out.println("");
        out.println("queryOptions = queryOption *( \"&\" queryOption )        ");
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
        out.println("expand       = %x24.65.78.70.61.6e.64 \"=\" expandClause ; $expand ");
        out.println("expandClause = expandItem *( COMMA expandItem )");
        out.println("expandItem   =        [ qualifiedEntityTypeName \"/\" ] navigationProperty ");
        out.println("               *( \"/\" [ qualifiedEntityTypeName \"/\" ] navigationProperty ) ");
        out.println("");
        out.println("filter = %x24.66.69.6c.74.65.72 \"=\" boolCommonExpr ; $filter");
        out.println("");
        out.println("orderby       = %x24.6f.72.64.65.72.62.79 \"=\" orderbyClause ; $orderby");
        out.println("orderbyClause = orderbyItem *( COMMA orderbyItem )");
        out.println("orderbyItem   = commonExpr [ 1*WSP orderAscDesc ]");
        out.println("orderAscDesc  = ( %x61.73.63    ; asc");
        out.println("                / %x64.65.73.63 ; desc");
        out.println("                )");
        out.println("");
        out.println("skip = %x24.73.6b.69.70 \"=\" 1*DIGIT ; $skip");
        out.println("top  = %x24.74.6f.70    \"=\" 1*DIGIT ; $top");
        out.println("");
        out.println("format = %x24.66.6f.72.6d.61.74 \"=\" ; $format");
        out.println("         ( %x61.74.6f.6d ; atom");
        out.println("         / %x6a.73.6f.6e ; json ");
        out.println("         / %x78.6d.6c    ; xml ");
        out.println("         / 1*( pchar / \"/\" ) ; <a data service specific value indicating a");
        out.println("         )                   ; format specific to the specific data service> or");
        out.println("                             ; <An IANA-defined [IANA-MMT] content type>");
        out.println("                          ");
        out.println("inlinecount = %x24.69.6e.6c.69.6e.65.63.6f.75.6e.74 \"=\" ; $inlinecount ");
        out.println("              ( %x61.6c.6c.70.61.67.65.73               ; allpages ");
        out.println("              / %x6e.6f.6e.65                           ; none ");
        out.println("              )");
        out.println("");
        out.println("select       = %x24.73.65.6c.65.63.74 \"=\" selectClause ; $select");
        out.println("selectClause = selectItem *( COMMA selectItem )");
        out.println("selectItem   = STAR  ");
        out.println("             / allOperationsInContainer ");
        out.println("             / [ qualifiedEntityTypeName \"/\" ] ");
        out.println("               ( ( navigationProperty [ \"/\" selectItem ] ) ");
        out.println("               / *( ( complexProperty / complexColProperty ) \"/\" ) property ");
        out.println("               / qualifiedActionName  ");
        out.println("               / qualifiedFunctionName  ");
        out.println("               )");
        out.println("allOperationsInContainer = operationQualifier STAR                 ");
        out.println("operationQualifier       = [ namespace \".\" ] entityContainerName \".\"");
        out.println("");
        out.println("; The parameterTypeNames are required to uniquely identify the action or function");
        out.println("; only if it has overloads.");
        out.println("qualifiedActionName   = [ operationQualifier ] action   [ \"(\" parameterTypeNames \")\" ]");
        out.println("qualifiedFunctionName = [ operationQualifier ] function [ \"(\" parameterTypeNames \")\" ]");
        out.println("");
        out.println("; The types of all the parameters to the corresponding function import ");
        out.println("; in the order they are declared in the function import.");
        out.println("parameterTypeNames = [ parameterTypeName *( COMMA parameterTypeName ) ]");
        out.println("parameterTypeName  = qualifiedTypeName ");
        out.println("");
        out.println("skiptoken = %x24.73.6b.69.70.74.6f.6b.65.6e \"=\" ; $skiptoken ");
        out.println("            1*( unreserved / pct-encoded / other-delims /  \":\" / \"@\" / \"$\" / \"=\" ) ; everything except \"&\"");
        out.println("");
        out.println("aliasAndValue         = parameterAlias        \"=\" parameterValue");
        out.println("parameterNameAndValue = functionParameterName \"=\" parameterValue");
        out.println("");
        out.println("parameterValue = primitiveLiteral");
        out.println("               / complexInUri  ");
        out.println("               / complexColInUri");
        out.println("               / primitiveColInUri");
        out.println("");
        out.println("customQueryOption = customName [ \"=\" customValue ]");
        out.println("customName        =  ( unreserved / pct-encoded / other-delims / \":\" / \"@\" )             ; MUST NOT start with \"$\"");
        out.println("                    *( unreserved / pct-encoded / other-delims / \":\" / \"@\" / \"$\" )       ; MUST NOT contain \"=\"");
        out.println("customValue       = *( unreserved / pct-encoded / other-delims / \":\" / \"@\" / \"$\" / \"=\" ) ; everything except \"&\"");
        out.println("");
        out.println(";------------------------------------------------------------------------------");
        out.println("; 3. Expressions");
        out.println(";------------------------------------------------------------------------------");
        out.println("");
        out.println("; TODO: is a boolCommonExpr also a commonExpr? To e.g. sort by Boolean?");
        out.println("commonExpr = ( primitiveLiteral");
        out.println("             / firstMemberExpr");
        out.println("             / functionExpr");
        out.println("             / negateExpr ");
        out.println("             / methodCallExpr ");
        out.println("             / parenExpr ");
        out.println("             / castExpr ");
        out.println("             ) ");
        out.println("             [ addExpr ");
        out.println("             / subExpr ");
        out.println("             / mulExpr ");
        out.println("             / divExpr ");
        out.println("             / modExpr");
        out.println("             ]  ");
        out.println("");
        out.println("boolCommonExpr = ( isofExpr ");
        out.println("                 / boolMethodCallExpr ");
        out.println("                 / notExpr  ");
        out.println("                 / commonExpr");
        out.println("                   [ eqExpr ");
        out.println("                   / neExpr ");
        out.println("                   / ltExpr  ");
        out.println("                   / leExpr  ");
        out.println("                   / gtExpr ");
        out.println("                   / geExpr  ");
        out.println("                   ]");
        out.println("                 / boolParenExpr");
        out.println("                 ) [ andExpr / orExpr ] ");
        out.println("");
        out.println("firstMemberExpr = [ lambdaPredicatePrefixExpr ]  ; only allowed inside a lambdaPredicateExpr");
        out.println("                  memberExpr");
        out.println("");
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
        out.println("functionExprParameters = \"(\" [ functionExprParameter *( COMMA functionExprParameter ) ] \")\"");
        out.println("functionExprParameter  = functionParameterName \"=\" ( parameterValue / firstMemberExpr )");
        out.println("");
        out.println("; TODO: case-sensitive (ODATA-117)");
        out.println("anyExpr = \"any(\" [ lambdaVariableExpr \":\" lambdaPredicateExpr ] \")\"");
        out.println("allExpr = \"all(\" lambdaVariableExpr \":\" lambdaPredicateExpr \")\"");
        out.println("lambdaPredicateExpr = boolCommonExpr ; containing at least one lambdaPredicatePrefixExpr");
        out.println("");
        out.println("methodCallExpr = indexOfMethodCallExpr ");
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
        out.println("; TODO: case-sensitive (ODATA-117)");
        out.println("substringOfMethodCallExpr = \"substringof\" \"(\" *WSP commonExpr COMMA commonExpr *WSP \")\"");
        out.println("startsWithMethodCallExpr  = \"startswith\"  \"(\" *WSP commonExpr COMMA commonExpr *WSP \")\"");
        out.println("endsWithMethodCallExpr    = \"endswith\"    \"(\" *WSP commonExpr COMMA commonExpr *WSP \")\"");
        out.println("lengthMethodCallExpr      = \"length\"      \"(\" *WSP commonExpr *WSP \")\"");
        out.println("indexOfMethodCallExpr     = \"indexof\"     \"(\" *WSP commonExpr COMMA commonExpr *WSP \")\"");
        out.println("substringMethodCallExpr   = \"substring\"   \"(\" *WSP commonExpr COMMA commonExpr [ COMMA commonExpr *WSP ] \")\"");
        out.println("toLowerMethodCallExpr     = \"tolower\"     \"(\" *WSP commonExpr *WSP \")\"");
        out.println("toUpperMethodCallExpr     = \"toupper\"     \"(\" *WSP commonExpr *WSP \")\"");
        out.println("trimMethodCallExpr        = \"trim\"        \"(\" *WSP commonExpr *WSP \")\"");
        out.println("concatMethodCallExpr      = \"concat\"      \"(\" *WSP commonExpr COMMA commonExpr *WSP \")\"");
        out.println("");
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
        out.println("");
        out.println("roundMethodCallExpr       = \"round\"       \"(\" *WSP commonExpr *WSP \")\"");
        out.println("floorMethodCallExpr       = \"floor\"       \"(\" *WSP commonExpr *WSP \")\"");
        out.println("ceilingMethodCallExpr     = \"ceiling\"     \"(\" *WSP commonExpr *WSP \")\"");
        out.println("");
        out.println("getTotalOffsetMinutesExpr = \"gettotaloffsetminutes\" \"(\" *WSP commonExpr *WSP \")\" ");
        out.println("");
        out.println("distanceMethodCallExpr    = \"geo.distance\"   \"(\" *WSP commonExpr COMMA commonExpr *WSP \")\"");
        out.println("geoLengthMethodCallExpr   = \"geo.length\"     \"(\" *WSP commonExpr *WSP \")\"");
        out.println("intersectsMethodCallExpr  = \"geo.intersects\" \"(\" *WSP commonExpr COMMA commonExpr *WSP \")\"");
        out.println("");
        out.println("boolParenExpr = \"(\" *WSP boolCommonExpr *WSP \")\"");
        out.println("parenExpr     = \"(\" *WSP commonExpr     *WSP \")\"");
        out.println("");
        out.println("; TODO: case-sensitive (ODATA-117)");
        out.println("andExpr = 1*WSP \"and\" 1*WSP boolCommonExpr");
        out.println("orExpr  = 1*WSP \"or\"  1*WSP boolCommonExpr");
        out.println("");
        out.println("eqExpr = 1*WSP \"eq\" 1*WSP commonExpr     ");
        out.println("neExpr = 1*WSP \"ne\" 1*WSP commonExpr");
        out.println("ltExpr = 1*WSP \"lt\" 1*WSP commonExpr");
        out.println("leExpr = 1*WSP \"le\" 1*WSP commonExpr");
        out.println("gtExpr = 1*WSP \"gt\" 1*WSP commonExpr");
        out.println("geExpr = 1*WSP \"ge\" 1*WSP commonExpr");
        out.println("");
        out.println("addExpr = 1*WSP \"add\" 1*WSP commonExpr");
        out.println("subExpr = 1*WSP \"sub\" 1*WSP commonExpr");
        out.println("mulExpr = 1*WSP \"mul\" 1*WSP commonExpr");
        out.println("divExpr = 1*WSP \"div\" 1*WSP commonExpr");
        out.println("modExpr = 1*WSP \"mod\" 1*WSP commonExpr");
        out.println("");
        out.println("negateExpr = \"-\" *WSP commonExpr");
        out.println("");
        out.println("; TODO: case-sensitive (ODATA-117)");
        out.println("notExpr = \"not\" 1*WSP boolCommonExpr");
        out.println("");
        out.println("; TODO: isn't this rather singleNavigation (once the leading slash has been removed)?");
        out.println("isofExpr = \"isof\" \"(\" *WSP [ commonExpr COMMA ] qualifiedTypeName *WSP \")\"");
        out.println("castExpr = \"cast\" \"(\" *WSP [ commonExpr COMMA ] qualifiedTypeName *WSP \")\"");
        out.println("");
        out.println(";------------------------------------------------------------------------------");
        out.println("; 4. JSON format for function and action parameters");
        out.println(";------------------------------------------------------------------------------");
        out.println("; Note: the query part of a URI needs to be partially percent-decoded before");
        out.println("; applying these rules, see comment at the top of this file");
        out.println("");
        out.println("; TODO: action request payloads (ODATA-80)");
        out.println("");
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
        out.println(";------------------------------------------------------------------------------");
        out.println("; 5. Names and identifiers");
        out.println(";------------------------------------------------------------------------------");
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
        out.println("");
        out.println("qualifiedEntityTypeName      = namespace \".\" entityTypeName");
        out.println("qualifiedComplexTypeName     = namespace \".\" complexTypeName");
        out.println("qualifiedEnumerationTypeName = namespace \".\" enumerationTypeName");
        out.println("");
        out.println("namespace     = namespacePart *(\".\" namespacePart)");
        out.println("namespacePart = odataIdentifier");
        out.println("");
        out.println("entitySetName       = odataIdentifier");
        out.println("entityTypeName      = odataIdentifier");
        out.println("complexTypeName     = odataIdentifier ");
        out.println("enumerationTypeName = odataIdentifier");
        out.println("");
        out.println("odataIdentifier             = identifierLeadingCharacter *478identifierCharacter");
        out.println("identifierLeadingCharacter  = ALPHA / \"_\"            ; TODO: Any character from the Unicode classes L or Nl");
        out.println("identifierCharacter         = ALPHA / DIGIT / \"_\"    ; TODO: Any character from the Unicode classes L, Nl, Nd, Mn, Mc, Pc or Cf");
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
        out.println("                        / \"LineString\" ");
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
        out.println("");
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
        out.println("         ");
        out.println("entityFunction       = odataIdentifier");
        out.println("entityColFunction    = odataIdentifier");
        out.println("complexFunction      = odataIdentifier");
        out.println("complexColFunction   = odataIdentifier");
        out.println("primitiveFunction    = odataIdentifier");
        out.println("primitiveColFunction = odataIdentifier");
        out.println("");
        out.println(";------------------------------------------------------------------------------");
        out.println("; 6. Literal Data Values");
        out.println(";------------------------------------------------------------------------------");
        out.println("");
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
        out.println("decimal     = decimalBody [ \"M\" ]");
        out.println("decimalBody = [sign] 1*DIGIT [\".\" 1*DIGIT]");
        out.println("double      = doubleBody [ \"D\" ]");
        out.println("doubleBody  = decimalBody [ \"E\" [sign] 1*DIGIT ] ; TODO: restrict range");
        out.println("            / nanInfinity");
        out.println("single      = singleBody [ \"F\" ]");
        out.println("singleBody  = decimalBody [ \"E\" [sign] 1*DIGIT ] ; TODO: restrict range");
        out.println("            / nanInfinity");
        out.println("");
        out.println("; Unrepresentable numeric values");
        out.println("nan              = %x4e.61.4e ; NaN (upper lower upper case)");
        out.println("positiveInfinity = %x49.4e.46 ; INF (all upper case)");
        out.println("negativeInfinity = \"-\" positiveInfinity ; -INF (all upper case)");
        out.println("nanInfinity      = nan / negativeInfinity / positiveInfinity");
        out.println("");
        out.println("guid = \"guid\" SQUOTE 8HEXDIG \"-\" 4HEXDIG \"-\" 4HEXDIG \"-\" 4HEXDIG \"-\" 12HEXDIG SQUOTE");
        out.println("");
        out.println("byte  = 1*3DIGIT ; numbers in the range from 0 to 255");
        out.println("sbyte = [ sign ] 1*3DIGIT ; numbers in the range from -128 to 127");
        out.println("int16 = [ sign ] 1*5DIGIT ; numbers in the range from -32768 to 32767        ");
        out.println("int32 = [ sign ] 1*10DIGIT ; numbers in the range from -2147483648 to 2147483647");
        out.println("int64 = [ sign ] 1*19DIGIT [ \"L\" ] ; numbers in the range from -9223372036854775808 to 9223372036854775807");
        out.println("");
        out.println("string           = SQUOTE *( pchar-no-SQUOTE / SQUOTE-in-string / unencoded ) SQUOTE");
        out.println("pchar-no-SQUOTE  = unreserved / pct-encoded / \"!\" / \"$\" / \"&\" / \"(\" / \")\" / \"*\" / \"+\" / \",\" / \";\" / \"=\" / \":\" / \"@\" ");
        out.println("SQUOTE-in-string = SQUOTE SQUOTE ; two quotes represent one within string literal");
        out.println("");
        out.println("; dates and times");
        out.println("dateTime       = \"datetime\" SQUOTE dateTimeBody SQUOTE");
        out.println("dateTimeOffset = \"datetimeoffset\" SQUOTE dateTimeOffsetBody SQUOTE");
        out.println("dateTimeBody = year \"-\" month \"-\" day \"T\" ");
        out.println("               ( hour \":\" minute [ \":\" second [ \".\" fractionalSeconds ] ]");
        out.println("               / \"24:00\" [ \":00\" ] ; the first instant of the following day");
        out.println("               ) ");
        out.println("dateTimeOffsetBody = dateTimeBody ( \"Z\" / sign hour \":\" minute )");
        out.println("");
        out.println("time = \"time\" SQUOTE [ sign ] \"P\" [ 1*DIGIT \"Y\" ] [ 1*DIGIT \"M\" ] [ 1*DIGIT \"D\" ] [ \"T\" [ 1*DIGIT \"H\" ] [ 1*DIGIT \"M\" ] [ 1*DIGIT [ \".\" 1*DIGIT ] \"S\" ] ] SQUOTE");
        out.println("     ; the above is an approximation of the rules for an xml duration.");
        out.println("     ; see the lexical representation for duration in http://www.w3.org/TR/xmlschema-2 for more information");
        out.println(" ");
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
        out.println("sridLiteral      = \"SRID=\" 1*5DIGIT SEMI");
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
        out.println(";------------------------------------------------------------------------------");
        out.println("; 7. Punctuation");
        out.println(";------------------------------------------------------------------------------");
        out.println("");
        out.println("unencoded = SP / HTAB / DQUOTE / \":\" / \"{\" / \"}\" / \"[\" / \"]\" ");
        out.println("");
        out.println("SQUOTE = %x27              ");
        out.println("SEMI   = %x3B              ");
        out.println("COMMA  = %x2C");
        out.println("sign   = \"+\" / \"-\"");
        out.println("STAR   = \"*\"");
        out.println("");
        out.println(";------------------------------------------------------------------------------");
        out.println("; A. URI syntax [RFC3986]");
        out.println(";------------------------------------------------------------------------------");
        out.println("");
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
        out.println("sub-delims    = \"$\" / \"&\" / \"=\" / other-delims");
        out.println("other-delims  = \"!\" / \"'\" / \"(\" / \")\" / \"*\" / \"+\" / \",\" / \";\"");
        out.println("");
        out.println(";------------------------------------------------------------------------------");
        out.println("; B. ABNF core definitions [RFC5234]");
        out.println(";------------------------------------------------------------------------------");
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
        out.println(";------------------------------------------------------------------------------");
        out.println("; C. UTF-8 syntax [RFC3629]");
        out.println(";------------------------------------------------------------------------------");
        out.println("");
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
        out.println(";------------------------------------------------------------------------------");
        out.println("; End of odata-v1.0-abnf");
        out.println(";------------------------------------------------------------------------------");
    }
}
