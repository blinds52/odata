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
    public static int ruleCount = 356;
    /** This enum provides easy to remember enum constants for locating the rule identifiers and names.
     * The enum constants have the same spelling as the rule names rendered in all caps with underscores replacing hyphens. */
    public enum RuleNames{
        /** id = <code>19</code>, name = <code>"absolute-URI"</code> */
        ABSOLUTE_URI("absolute-URI", 19, 61, 8),
        /** id = <code>101</code>, name = <code>"abstractSpatialTypeName"</code> */
        ABSTRACTSPATIALTYPENAME("abstractSpatialTypeName", 101, 580, 3),
        /** id = <code>141</code>, name = <code>"action"</code> */
        ACTION("action", 141, 666, 8),
        /** id = <code>222</code>, name = <code>"actionCall"</code> */
        ACTIONCALL("actionCall", 222, 1437, 6),
        /** id = <code>284</code>, name = <code>"addExpr"</code> */
        ADDEXPR("addExpr", 284, 1783, 6),
        /** id = <code>243</code>, name = <code>"aliasAndValue"</code> */
        ALIASANDVALUE("aliasAndValue", 243, 1521, 4),
        /** id = <code>305</code>, name = <code>"allExpr"</code> */
        ALLEXPR("allExpr", 305, 2054, 6),
        /** id = <code>336</code>, name = <code>"allMethodCallExpr"</code> */
        ALLMETHODCALLEXPR("allMethodCallExpr", 336, 2431, 1),
        /** id = <code>95</code>, name = <code>"allOperationsInContainer"</code> */
        ALLOPERATIONSINCONTAINER("allOperationsInContainer", 95, 520, 3),
        /** id = <code>0</code>, name = <code>"ALPHA"</code> */
        ALPHA("ALPHA", 0, 0, 3),
        /** id = <code>276</code>, name = <code>"andExpr"</code> */
        ANDEXPR("andExpr", 276, 1735, 6),
        /** id = <code>304</code>, name = <code>"anyExpr"</code> */
        ANYEXPR("anyExpr", 304, 2046, 8),
        /** id = <code>337</code>, name = <code>"anyMethodCallExpr"</code> */
        ANYMETHODCALLEXPR("anyMethodCallExpr", 337, 2432, 1),
        /** id = <code>23</code>, name = <code>"authority"</code> */
        AUTHORITY("authority", 23, 96, 10),
        /** id = <code>64</code>, name = <code>"begin-object"</code> */
        BEGIN_OBJECT("begin-object", 64, 406, 1),
        /** id = <code>150</code>, name = <code>"binary"</code> */
        BINARY("binary", 150, 741, 9),
        /** id = <code>15</code>, name = <code>"BIT"</code> */
        BIT("BIT", 15, 35, 3),
        /** id = <code>303</code>, name = <code>"boolBoundFunctionExpr"</code> */
        BOOLBOUNDFUNCTIONEXPR("boolBoundFunctionExpr", 303, 2045, 1),
        /** id = <code>293</code>, name = <code>"boolCastExpr"</code> */
        BOOLCASTEXPR("boolCastExpr", 293, 1860, 19),
        /** id = <code>271</code>, name = <code>"boolCommonExpr"</code> */
        BOOLCOMMONEXPR("boolCommonExpr", 271, 1694, 23),
        /** id = <code>151</code>, name = <code>"boolean"</code> */
        BOOLEAN("boolean", 151, 750, 7),
        /** id = <code>338</code>, name = <code>"boolFunctionCallExpr"</code> */
        BOOLFUNCTIONCALLEXPR("boolFunctionCallExpr", 338, 2433, 1),
        /** id = <code>301</code>, name = <code>"boolFunctionExpr"</code> */
        BOOLFUNCTIONEXPR("boolFunctionExpr", 301, 2011, 1),
        /** id = <code>272</code>, name = <code>"boolLiteralExpr"</code> */
        BOOLLITERALEXPR("boolLiteralExpr", 272, 1717, 1),
        /** id = <code>339</code>, name = <code>"boolMethodCallExpr"</code> */
        BOOLMETHODCALLEXPR("boolMethodCallExpr", 339, 2434, 1),
        /** id = <code>311</code>, name = <code>"boolMethodExpr"</code> */
        BOOLMETHODEXPR("boolMethodExpr", 311, 2088, 7),
        /** id = <code>275</code>, name = <code>"boolParenExpr"</code> */
        BOOLPARENEXPR("boolParenExpr", 275, 1727, 8),
        /** id = <code>296</code>, name = <code>"boolPrimitiveMemberExpr"</code> */
        BOOLPRIMITIVEMEMBEREXPR("boolPrimitiveMemberExpr", 296, 1910, 12),
        /** id = <code>143</code>, name = <code>"boundAction"</code> */
        BOUNDACTION("boundAction", 143, 678, 1),
        /** id = <code>223</code>, name = <code>"boundActionCall"</code> */
        BOUNDACTIONCALL("boundActionCall", 223, 1443, 6),
        /** id = <code>234</code>, name = <code>"boundComplexColFuncCall"</code> */
        BOUNDCOMPLEXCOLFUNCCALL("boundComplexColFuncCall", 234, 1483, 3),
        /** id = <code>233</code>, name = <code>"boundComplexFuncCall"</code> */
        BOUNDCOMPLEXFUNCCALL("boundComplexFuncCall", 233, 1480, 3),
        /** id = <code>232</code>, name = <code>"boundEntityColFuncCall"</code> */
        BOUNDENTITYCOLFUNCCALL("boundEntityColFuncCall", 232, 1477, 3),
        /** id = <code>231</code>, name = <code>"boundEntityFuncCall"</code> */
        BOUNDENTITYFUNCCALL("boundEntityFuncCall", 231, 1474, 3),
        /** id = <code>237</code>, name = <code>"boundFunctionCall"</code> */
        BOUNDFUNCTIONCALL("boundFunctionCall", 237, 1492, 7),
        /** id = <code>302</code>, name = <code>"boundFunctionExpr"</code> */
        BOUNDFUNCTIONEXPR("boundFunctionExpr", 302, 2012, 33),
        /** id = <code>211</code>, name = <code>"boundOperation"</code> */
        BOUNDOPERATION("boundOperation", 211, 1342, 36),
        /** id = <code>236</code>, name = <code>"boundPrimitiveColFuncCall"</code> */
        BOUNDPRIMITIVECOLFUNCCALL("boundPrimitiveColFuncCall", 236, 1489, 3),
        /** id = <code>235</code>, name = <code>"boundPrimitiveFuncCall"</code> */
        BOUNDPRIMITIVEFUNCCALL("boundPrimitiveFuncCall", 235, 1486, 3),
        /** id = <code>152</code>, name = <code>"byte"</code> */
        BYTE("byte", 152, 757, 2),
        /** id = <code>292</code>, name = <code>"castExpr"</code> */
        CASTEXPR("castExpr", 292, 1841, 19),
        /** id = <code>332</code>, name = <code>"ceilingMethodCallExpr"</code> */
        CEILINGMETHODCALLEXPR("ceilingMethodCallExpr", 332, 2375, 11),
        /** id = <code>9</code>, name = <code>"CHAR"</code> */
        CHAR("CHAR", 9, 25, 1),
        /** id = <code>209</code>, name = <code>"collectionNavigation"</code> */
        COLLECTIONNAVIGATION("collectionNavigation", 209, 1275, 36),
        /** id = <code>298</code>, name = <code>"collectionNavigationExpr"</code> */
        COLLECTIONNAVIGATIONEXPR("collectionNavigationExpr", 298, 1949, 10),
        /** id = <code>250</code>, name = <code>"collectionPropertyInJSON"</code> */
        COLLECTIONPROPERTYINJSON("collectionPropertyInJSON", 250, 1548, 3),
        /** id = <code>251</code>, name = <code>"collectionPropertyInVJSON"</code> */
        COLLECTIONPROPERTYINVJSON("collectionPropertyInVJSON", 251, 1551, 29),
        /** id = <code>214</code>, name = <code>"collectionPropertyPath"</code> */
        COLLECTIONPROPERTYPATH("collectionPropertyPath", 214, 1398, 11),
        /** id = <code>252</code>, name = <code>"colPropertyInJSONLight"</code> */
        COLPROPERTYINJSONLIGHT("colPropertyInJSONLight", 252, 1580, 1),
        /** id = <code>62</code>, name = <code>"COMMA"</code> */
        COMMA("COMMA", 62, 402, 1),
        /** id = <code>270</code>, name = <code>"commonExpr"</code> */
        COMMONEXPR("commonExpr", 270, 1674, 20),
        /** id = <code>136</code>, name = <code>"complexAction"</code> */
        COMPLEXACTION("complexAction", 136, 661, 1),
        /** id = <code>137</code>, name = <code>"complexColAction"</code> */
        COMPLEXCOLACTION("complexColAction", 137, 662, 1),
        /** id = <code>340</code>, name = <code>"complexColFuncCall"</code> */
        COMPLEXCOLFUNCCALL("complexColFuncCall", 340, 2435, 1),
        /** id = <code>123</code>, name = <code>"complexColFunction"</code> */
        COMPLEXCOLFUNCTION("complexColFunction", 123, 618, 1),
        /** id = <code>227</code>, name = <code>"complexColFunctionCall"</code> */
        COMPLEXCOLFUNCTIONCALL("complexColFunctionCall", 227, 1458, 3),
        /** id = <code>341</code>, name = <code>"complexColInJSON"</code> */
        COMPLEXCOLINJSON("complexColInJSON", 341, 2436, 1),
        /** id = <code>106</code>, name = <code>"complexColProperty"</code> */
        COMPLEXCOLPROPERTY("complexColProperty", 106, 587, 1),
        /** id = <code>114</code>, name = <code>"complexColServiceOp"</code> */
        COMPLEXCOLSERVICEOP("complexColServiceOp", 114, 607, 1),
        /** id = <code>264</code>, name = <code>"complexColServiceOpCall"</code> */
        COMPLEXCOLSERVICEOPCALL("complexColServiceOpCall", 264, 1644, 6),
        /** id = <code>342</code>, name = <code>"complexFuncCall"</code> */
        COMPLEXFUNCCALL("complexFuncCall", 342, 2437, 1),
        /** id = <code>122</code>, name = <code>"complexFunction"</code> */
        COMPLEXFUNCTION("complexFunction", 122, 617, 1),
        /** id = <code>226</code>, name = <code>"complexFunctionCall"</code> */
        COMPLEXFUNCTIONCALL("complexFunctionCall", 226, 1455, 3),
        /** id = <code>258</code>, name = <code>"complexInJSON"</code> */
        COMPLEXINJSON("complexInJSON", 258, 1605, 3),
        /** id = <code>259</code>, name = <code>"complexInJSONLight"</code> */
        COMPLEXINJSONLIGHT("complexInJSONLight", 259, 1608, 1),
        /** id = <code>260</code>, name = <code>"complexInVJSON"</code> */
        COMPLEXINVJSON("complexInVJSON", 260, 1609, 17),
        /** id = <code>105</code>, name = <code>"complexProperty"</code> */
        COMPLEXPROPERTY("complexProperty", 105, 586, 1),
        /** id = <code>247</code>, name = <code>"complexPropertyInJSON"</code> */
        COMPLEXPROPERTYINJSON("complexPropertyInJSON", 247, 1538, 3),
        /** id = <code>249</code>, name = <code>"complexPropertyInJSONLight"</code> */
        COMPLEXPROPERTYINJSONLIGHT("complexPropertyInJSONLight", 249, 1547, 1),
        /** id = <code>248</code>, name = <code>"complexPropertyInVJSON"</code> */
        COMPLEXPROPERTYINVJSON("complexPropertyInVJSON", 248, 1541, 6),
        /** id = <code>213</code>, name = <code>"complexPropertyPath"</code> */
        COMPLEXPROPERTYPATH("complexPropertyPath", 213, 1387, 11),
        /** id = <code>113</code>, name = <code>"complexServiceOp"</code> */
        COMPLEXSERVICEOP("complexServiceOp", 113, 606, 1),
        /** id = <code>263</code>, name = <code>"complexServiceOpCall"</code> */
        COMPLEXSERVICEOPCALL("complexServiceOpCall", 263, 1638, 6),
        /** id = <code>343</code>, name = <code>"complexTypeInJSON"</code> */
        COMPLEXTYPEINJSON("complexTypeInJSON", 343, 2438, 1),
        /** id = <code>255</code>, name = <code>"complexTypeMetadataInVJSON"</code> */
        COMPLEXTYPEMETADATAINVJSON("complexTypeMetadataInVJSON", 255, 1583, 9),
        /** id = <code>93</code>, name = <code>"complexTypeName"</code> */
        COMPLEXTYPENAME("complexTypeName", 93, 512, 1),
        /** id = <code>219</code>, name = <code>"compoundKey"</code> */
        COMPOUNDKEY("compoundKey", 219, 1424, 8),
        /** id = <code>321</code>, name = <code>"concatMethodCallExpr"</code> */
        CONCATMETHODCALLEXPR("concatMethodCallExpr", 321, 2246, 19),
        /** id = <code>100</code>, name = <code>"concreteSpatialTypeName"</code> */
        CONCRETESPATIALTYPENAME("concreteSpatialTypeName", 100, 565, 15),
        /** id = <code>193</code>, name = <code>"count"</code> */
        COUNT("count", 193, 1073, 1),
        /** id = <code>12</code>, name = <code>"CR"</code> */
        CR("CR", 12, 30, 1),
        /** id = <code>14</code>, name = <code>"CRLF"</code> */
        CRLF("CRLF", 14, 32, 3),
        /** id = <code>11</code>, name = <code>"CTL"</code> */
        CTL("CTL", 11, 27, 3),
        /** id = <code>206</code>, name = <code>"customName"</code> */
        CUSTOMNAME("customName", 206, 1175, 29),
        /** id = <code>205</code>, name = <code>"customQueryOption"</code> */
        CUSTOMQUERYOPTION("customQueryOption", 205, 1165, 10),
        /** id = <code>207</code>, name = <code>"customValue"</code> */
        CUSTOMVALUE("customValue", 207, 1204, 16),
        /** id = <code>153</code>, name = <code>"dateTime"</code> */
        DATETIME("dateTime", 153, 759, 5),
        /** id = <code>155</code>, name = <code>"dateTimeBody"</code> */
        DATETIMEBODY("dateTimeBody", 155, 769, 18),
        /** id = <code>154</code>, name = <code>"dateTimeOffset"</code> */
        DATETIMEOFFSET("dateTimeOffset", 154, 764, 5),
        /** id = <code>156</code>, name = <code>"dateTimeOffsetBody"</code> */
        DATETIMEOFFSETBODY("dateTimeOffsetBody", 156, 787, 18),
        /** id = <code>81</code>, name = <code>"day"</code> */
        DAY("day", 81, 486, 1),
        /** id = <code>326</code>, name = <code>"dayMethodCallExpr"</code> */
        DAYMETHODCALLEXPR("dayMethodCallExpr", 326, 2309, 11),
        /** id = <code>33</code>, name = <code>"dec-octet"</code> */
        DEC_OCTET("dec-octet", 33, 242, 16),
        /** id = <code>157</code>, name = <code>"decimal"</code> */
        DECIMAL("decimal", 157, 805, 12),
        /** id = <code>1</code>, name = <code>"DIGIT"</code> */
        DIGIT("DIGIT", 1, 3, 1),
        /** id = <code>333</code>, name = <code>"distanceMethodCallExpr"</code> */
        DISTANCEMETHODCALLEXPR("distanceMethodCallExpr", 333, 2386, 17),
        /** id = <code>287</code>, name = <code>"divExpr"</code> */
        DIVEXPR("divExpr", 287, 1801, 6),
        /** id = <code>158</code>, name = <code>"double"</code> */
        DOUBLE("double", 158, 817, 36),
        /** id = <code>3</code>, name = <code>"DQUOTE"</code> */
        DQUOTE("DQUOTE", 3, 12, 1),
        /** id = <code>65</code>, name = <code>"end-object"</code> */
        END_OBJECT("end-object", 65, 407, 1),
        /** id = <code>312</code>, name = <code>"endsWithMethodCallExpr"</code> */
        ENDSWITHMETHODCALLEXPR("endsWithMethodCallExpr", 312, 2095, 17),
        /** id = <code>134</code>, name = <code>"entityAction"</code> */
        ENTITYACTION("entityAction", 134, 659, 1),
        /** id = <code>135</code>, name = <code>"entityColAction"</code> */
        ENTITYCOLACTION("entityColAction", 135, 660, 1),
        /** id = <code>344</code>, name = <code>"entityColFuncCall"</code> */
        ENTITYCOLFUNCCALL("entityColFuncCall", 344, 2439, 1),
        /** id = <code>121</code>, name = <code>"entityColFunction"</code> */
        ENTITYCOLFUNCTION("entityColFunction", 121, 616, 1),
        /** id = <code>225</code>, name = <code>"entityColFunctionCall"</code> */
        ENTITYCOLFUNCTIONCALL("entityColFunctionCall", 225, 1452, 3),
        /** id = <code>118</code>, name = <code>"entityColNavigationProperty"</code> */
        ENTITYCOLNAVIGATIONPROPERTY("entityColNavigationProperty", 118, 611, 1),
        /** id = <code>112</code>, name = <code>"entityColServiceOp"</code> */
        ENTITYCOLSERVICEOP("entityColServiceOp", 112, 605, 1),
        /** id = <code>262</code>, name = <code>"entityColServiceOpCall"</code> */
        ENTITYCOLSERVICEOPCALL("entityColServiceOpCall", 262, 1632, 6),
        /** id = <code>109</code>, name = <code>"entityContainerName"</code> */
        ENTITYCONTAINERNAME("entityContainerName", 109, 596, 1),
        /** id = <code>345</code>, name = <code>"entityFuncCall"</code> */
        ENTITYFUNCCALL("entityFuncCall", 345, 2440, 1),
        /** id = <code>120</code>, name = <code>"entityFunction"</code> */
        ENTITYFUNCTION("entityFunction", 120, 615, 1),
        /** id = <code>224</code>, name = <code>"entityFunctionCall"</code> */
        ENTITYFUNCTIONCALL("entityFunctionCall", 224, 1449, 3),
        /** id = <code>117</code>, name = <code>"entityNavigationProperty"</code> */
        ENTITYNAVIGATIONPROPERTY("entityNavigationProperty", 117, 610, 1),
        /** id = <code>346</code>, name = <code>"entityProperty"</code> */
        ENTITYPROPERTY("entityProperty", 346, 2441, 1),
        /** id = <code>111</code>, name = <code>"entityServiceOp"</code> */
        ENTITYSERVICEOP("entityServiceOp", 111, 604, 1),
        /** id = <code>261</code>, name = <code>"entityServiceOpCall"</code> */
        ENTITYSERVICEOPCALL("entityServiceOpCall", 261, 1626, 6),
        /** id = <code>91</code>, name = <code>"entitySetName"</code> */
        ENTITYSETNAME("entitySetName", 91, 510, 1),
        /** id = <code>92</code>, name = <code>"entityTypeName"</code> */
        ENTITYTYPENAME("entityTypeName", 92, 511, 1),
        /** id = <code>60</code>, name = <code>"EQ"</code> */
        EQ("EQ", 60, 400, 1),
        /** id = <code>278</code>, name = <code>"eqExpr"</code> */
        EQEXPR("eqExpr", 278, 1747, 6),
        /** id = <code>190</code>, name = <code>"expand"</code> */
        EXPAND("expand", 190, 1050, 3),
        /** id = <code>191</code>, name = <code>"expandClause"</code> */
        EXPANDCLAUSE("expandClause", 191, 1053, 6),
        /** id = <code>192</code>, name = <code>"expandItem"</code> */
        EXPANDITEM("expandItem", 192, 1059, 14),
        /** id = <code>194</code>, name = <code>"filter"</code> */
        FILTER("filter", 194, 1074, 8),
        /** id = <code>295</code>, name = <code>"firstBoolPrimitiveMemExpr"</code> */
        FIRSTBOOLPRIMITIVEMEMEXPR("firstBoolPrimitiveMemExpr", 295, 1904, 6),
        /** id = <code>294</code>, name = <code>"firstMemberExpr"</code> */
        FIRSTMEMBEREXPR("firstMemberExpr", 294, 1879, 25),
        /** id = <code>331</code>, name = <code>"floorMethodCallExpr"</code> */
        FLOORMETHODCALLEXPR("floorMethodCallExpr", 331, 2364, 11),
        /** id = <code>199</code>, name = <code>"format"</code> */
        FORMAT("format", 199, 1119, 10),
        /** id = <code>46</code>, name = <code>"fragment"</code> */
        FRAGMENT("fragment", 46, 316, 5),
        /** id = <code>142</code>, name = <code>"fullAction"</code> */
        FULLACTION("fullAction", 142, 674, 4),
        /** id = <code>130</code>, name = <code>"fullComplexColFunction"</code> */
        FULLCOMPLEXCOLFUNCTION("fullComplexColFunction", 130, 640, 4),
        /** id = <code>129</code>, name = <code>"fullComplexFunction"</code> */
        FULLCOMPLEXFUNCTION("fullComplexFunction", 129, 636, 4),
        /** id = <code>128</code>, name = <code>"fullEntityColFunction"</code> */
        FULLENTITYCOLFUNCTION("fullEntityColFunction", 128, 632, 4),
        /** id = <code>127</code>, name = <code>"fullEntityFunction"</code> */
        FULLENTITYFUNCTION("fullEntityFunction", 127, 628, 4),
        /** id = <code>133</code>, name = <code>"fullFunction"</code> */
        FULLFUNCTION("fullFunction", 133, 652, 7),
        /** id = <code>132</code>, name = <code>"fullPrimitiveColFunction"</code> */
        FULLPRIMITIVECOLFUNCTION("fullPrimitiveColFunction", 132, 648, 4),
        /** id = <code>131</code>, name = <code>"fullPrimitiveFunction"</code> */
        FULLPRIMITIVEFUNCTION("fullPrimitiveFunction", 131, 644, 4),
        /** id = <code>126</code>, name = <code>"function"</code> */
        FUNCTION("function", 126, 621, 7),
        /** id = <code>230</code>, name = <code>"functionCall"</code> */
        FUNCTIONCALL("functionCall", 230, 1467, 7),
        /** id = <code>347</code>, name = <code>"functionCallExpr"</code> */
        FUNCTIONCALLEXPR("functionCallExpr", 347, 2442, 1),
        /** id = <code>300</code>, name = <code>"functionExpr"</code> */
        FUNCTIONEXPR("functionExpr", 300, 1984, 27),
        /** id = <code>239</code>, name = <code>"functionParameter"</code> */
        FUNCTIONPARAMETER("functionParameter", 239, 1509, 6),
        /** id = <code>240</code>, name = <code>"functionParameterName"</code> */
        FUNCTIONPARAMETERNAME("functionParameterName", 240, 1515, 1),
        /** id = <code>238</code>, name = <code>"functionParameters"</code> */
        FUNCTIONPARAMETERS("functionParameters", 238, 1499, 10),
        /** id = <code>283</code>, name = <code>"geExpr"</code> */
        GEEXPR("geExpr", 283, 1777, 6),
        /** id = <code>50</code>, name = <code>"gen-delims"</code> */
        GEN_DELIMS("gen-delims", 50, 335, 8),
        /** id = <code>159</code>, name = <code>"geography"</code> */
        GEOGRAPHY("geography", 159, 853, 1),
        /** id = <code>160</code>, name = <code>"geographyCollection"</code> */
        GEOGRAPHYCOLLECTION("geographyCollection", 160, 854, 1),
        /** id = <code>161</code>, name = <code>"geographyLineString"</code> */
        GEOGRAPHYLINESTRING("geographyLineString", 161, 855, 1),
        /** id = <code>162</code>, name = <code>"geographyMultiLineString"</code> */
        GEOGRAPHYMULTILINESTRING("geographyMultiLineString", 162, 856, 1),
        /** id = <code>163</code>, name = <code>"geographyMultiPoint"</code> */
        GEOGRAPHYMULTIPOINT("geographyMultiPoint", 163, 857, 1),
        /** id = <code>164</code>, name = <code>"geographyMultiPolygon"</code> */
        GEOGRAPHYMULTIPOLYGON("geographyMultiPolygon", 164, 858, 1),
        /** id = <code>165</code>, name = <code>"geographyPoint"</code> */
        GEOGRAPHYPOINT("geographyPoint", 165, 859, 1),
        /** id = <code>166</code>, name = <code>"geographyPolygon"</code> */
        GEOGRAPHYPOLYGON("geographyPolygon", 166, 860, 1),
        /** id = <code>334</code>, name = <code>"geoLengthMethodCallExpr"</code> */
        GEOLENGTHMETHODCALLEXPR("geoLengthMethodCallExpr", 334, 2403, 11),
        /** id = <code>167</code>, name = <code>"geometry"</code> */
        GEOMETRY("geometry", 167, 861, 1),
        /** id = <code>168</code>, name = <code>"geometryCollection"</code> */
        GEOMETRYCOLLECTION("geometryCollection", 168, 862, 1),
        /** id = <code>169</code>, name = <code>"geometryLineString"</code> */
        GEOMETRYLINESTRING("geometryLineString", 169, 863, 1),
        /** id = <code>170</code>, name = <code>"geometryMultiLineString"</code> */
        GEOMETRYMULTILINESTRING("geometryMultiLineString", 170, 864, 1),
        /** id = <code>171</code>, name = <code>"geometryMultiPoint"</code> */
        GEOMETRYMULTIPOINT("geometryMultiPoint", 171, 865, 1),
        /** id = <code>172</code>, name = <code>"geometryMultiPolygon"</code> */
        GEOMETRYMULTIPOLYGON("geometryMultiPolygon", 172, 866, 1),
        /** id = <code>173</code>, name = <code>"geometryPoint"</code> */
        GEOMETRYPOINT("geometryPoint", 173, 867, 1),
        /** id = <code>174</code>, name = <code>"geometryPolygon"</code> */
        GEOMETRYPOLYGON("geometryPolygon", 174, 868, 1),
        /** id = <code>323</code>, name = <code>"getTotalOffsetMinutesExpr"</code> */
        GETTOTALOFFSETMINUTESEXPR("getTotalOffsetMinutesExpr", 323, 2276, 11),
        /** id = <code>282</code>, name = <code>"gtExpr"</code> */
        GTEXPR("gtExpr", 282, 1771, 6),
        /** id = <code>175</code>, name = <code>"guid"</code> */
        GUID("guid", 175, 869, 18),
        /** id = <code>30</code>, name = <code>"h16"</code> */
        H16("h16", 30, 226, 2),
        /** id = <code>2</code>, name = <code>"HEXDIG"</code> */
        HEXDIG("HEXDIG", 2, 4, 8),
        /** id = <code>17</code>, name = <code>"hier-part"</code> */
        HIER_PART("hier-part", 17, 50, 8),
        /** id = <code>25</code>, name = <code>"host"</code> */
        HOST("host", 25, 112, 4),
        /** id = <code>82</code>, name = <code>"hour"</code> */
        HOUR("hour", 82, 487, 1),
        /** id = <code>327</code>, name = <code>"hourMethodCallExpr"</code> */
        HOURMETHODCALLEXPR("hourMethodCallExpr", 327, 2320, 11),
        /** id = <code>5</code>, name = <code>"HTAB"</code> */
        HTAB("HTAB", 5, 14, 1),
        /** id = <code>88</code>, name = <code>"identifierCharacter"</code> */
        IDENTIFIERCHARACTER("identifierCharacter", 88, 499, 4),
        /** id = <code>87</code>, name = <code>"identifierLeadingCharacter"</code> */
        IDENTIFIERLEADINGCHARACTER("identifierLeadingCharacter", 87, 496, 3),
        /** id = <code>306</code>, name = <code>"implicitVariableExpr"</code> */
        IMPLICITVARIABLEEXPR("implicitVariableExpr", 306, 2060, 1),
        /** id = <code>313</code>, name = <code>"indexOfMethodCallExpr"</code> */
        INDEXOFMETHODCALLEXPR("indexOfMethodCallExpr", 313, 2112, 17),
        /** id = <code>200</code>, name = <code>"inlinecount"</code> */
        INLINECOUNT("inlinecount", 200, 1129, 5),
        /** id = <code>308</code>, name = <code>"inscopeVariableExpr"</code> */
        INSCOPEVARIABLEEXPR("inscopeVariableExpr", 308, 2062, 3),
        /** id = <code>176</code>, name = <code>"int16"</code> */
        INT16("int16", 176, 887, 5),
        /** id = <code>177</code>, name = <code>"int32"</code> */
        INT32("int32", 177, 892, 5),
        /** id = <code>178</code>, name = <code>"int64"</code> */
        INT64("int64", 178, 897, 8),
        /** id = <code>335</code>, name = <code>"intersectsMethodCallExpr"</code> */
        INTERSECTSMETHODCALLEXPR("intersectsMethodCallExpr", 335, 2414, 17),
        /** id = <code>27</code>, name = <code>"IP-literal"</code> */
        IP_LITERAL("IP-literal", 27, 118, 6),
        /** id = <code>32</code>, name = <code>"IPv4address"</code> */
        IPV4ADDRESS("IPv4address", 32, 234, 8),
        /** id = <code>29</code>, name = <code>"IPv6address"</code> */
        IPV6ADDRESS("IPv6address", 29, 134, 92),
        /** id = <code>28</code>, name = <code>"IPvFuture"</code> */
        IPVFUTURE("IPvFuture", 28, 124, 10),
        /** id = <code>291</code>, name = <code>"isofExpr"</code> */
        ISOFEXPR("isofExpr", 291, 1822, 19),
        /** id = <code>217</code>, name = <code>"keyPredicate"</code> */
        KEYPREDICATE("keyPredicate", 217, 1417, 3),
        /** id = <code>221</code>, name = <code>"keyPropertyValue"</code> */
        KEYPROPERTYVALUE("keyPropertyValue", 221, 1436, 1),
        /** id = <code>220</code>, name = <code>"keyValuePair"</code> */
        KEYVALUEPAIR("keyValuePair", 220, 1432, 4),
        /** id = <code>309</code>, name = <code>"lambdaPredicateExpr"</code> */
        LAMBDAPREDICATEEXPR("lambdaPredicateExpr", 309, 2065, 1),
        /** id = <code>348</code>, name = <code>"lambdaPredicatePrefixExpr"</code> */
        LAMBDAPREDICATEPREFIXEXPR("lambdaPredicatePrefixExpr", 348, 2443, 1),
        /** id = <code>307</code>, name = <code>"lambdaVariableExpr"</code> */
        LAMBDAVARIABLEEXPR("lambdaVariableExpr", 307, 2061, 1),
        /** id = <code>281</code>, name = <code>"leExpr"</code> */
        LEEXPR("leExpr", 281, 1765, 6),
        /** id = <code>322</code>, name = <code>"lengthMethodCallExpr"</code> */
        LENGTHMETHODCALLEXPR("lengthMethodCallExpr", 322, 2265, 11),
        /** id = <code>13</code>, name = <code>"LF"</code> */
        LF("LF", 13, 31, 1),
        /** id = <code>273</code>, name = <code>"literalExpr"</code> */
        LITERALEXPR("literalExpr", 273, 1718, 1),
        /** id = <code>31</code>, name = <code>"ls32"</code> */
        LS32("ls32", 31, 228, 6),
        /** id = <code>280</code>, name = <code>"ltExpr"</code> */
        LTEXPR("ltExpr", 280, 1759, 6),
        /** id = <code>7</code>, name = <code>"LWSP"</code> */
        LWSP("LWSP", 7, 18, 6),
        /** id = <code>297</code>, name = <code>"memberExpr"</code> */
        MEMBEREXPR("memberExpr", 297, 1922, 27),
        /** id = <code>310</code>, name = <code>"methodCallExpr"</code> */
        METHODCALLEXPR("methodCallExpr", 310, 2066, 22),
        /** id = <code>83</code>, name = <code>"minute"</code> */
        MINUTE("minute", 83, 488, 1),
        /** id = <code>328</code>, name = <code>"minuteMethodCallExpr"</code> */
        MINUTEMETHODCALLEXPR("minuteMethodCallExpr", 328, 2331, 11),
        /** id = <code>288</code>, name = <code>"modExpr"</code> */
        MODEXPR("modExpr", 288, 1807, 6),
        /** id = <code>80</code>, name = <code>"month"</code> */
        MONTH("month", 80, 485, 1),
        /** id = <code>325</code>, name = <code>"monthMethodCallExpr"</code> */
        MONTHMETHODCALLEXPR("monthMethodCallExpr", 325, 2298, 11),
        /** id = <code>286</code>, name = <code>"mulExpr"</code> */
        MULEXPR("mulExpr", 286, 1795, 6),
        /** id = <code>67</code>, name = <code>"name-separator"</code> */
        NAME_SEPARATOR("name-separator", 67, 409, 1),
        /** id = <code>90</code>, name = <code>"namespace"</code> */
        NAMESPACE("namespace", 90, 504, 6),
        /** id = <code>89</code>, name = <code>"namespacePart"</code> */
        NAMESPACEPART("namespacePart", 89, 503, 1),
        /** id = <code>69</code>, name = <code>"nan"</code> */
        NAN("nan", 69, 411, 1),
        /** id = <code>72</code>, name = <code>"nanInfinity"</code> */
        NANINFINITY("nanInfinity", 72, 414, 4),
        /** id = <code>85</code>, name = <code>"nanoSeconds"</code> */
        NANOSECONDS("nanoSeconds", 85, 490, 2),
        /** id = <code>119</code>, name = <code>"navigationProperty"</code> */
        NAVIGATIONPROPERTY("navigationProperty", 119, 612, 3),
        /** id = <code>279</code>, name = <code>"neExpr"</code> */
        NEEXPR("neExpr", 279, 1753, 6),
        /** id = <code>289</code>, name = <code>"negateExpr"</code> */
        NEGATEEXPR("negateExpr", 289, 1813, 5),
        /** id = <code>70</code>, name = <code>"negativeInfinity"</code> */
        NEGATIVEINFINITY("negativeInfinity", 70, 412, 1),
        /** id = <code>290</code>, name = <code>"notExpr"</code> */
        NOTEXPR("notExpr", 290, 1818, 4),
        /** id = <code>149</code>, name = <code>"null"</code> */
        NULL("null", 149, 734, 7),
        /** id = <code>10</code>, name = <code>"OCTET"</code> */
        OCTET("OCTET", 10, 26, 1),
        /** id = <code>86</code>, name = <code>"odataIdentifier"</code> */
        ODATAIDENTIFIER("odataIdentifier", 86, 492, 4),
        /** id = <code>186</code>, name = <code>"odataRelativeUri"</code> */
        ODATARELATIVEURI("odataRelativeUri", 186, 1022, 6),
        /** id = <code>184</code>, name = <code>"odataUri"</code> */
        ODATAURI("odataUri", 184, 1002, 14),
        /** id = <code>74</code>, name = <code>"oneToNine"</code> */
        ONETONINE("oneToNine", 74, 420, 10),
        /** id = <code>94</code>, name = <code>"operationQualifier"</code> */
        OPERATIONQUALIFIER("operationQualifier", 94, 513, 7),
        /** id = <code>195</code>, name = <code>"orderby"</code> */
        ORDERBY("orderby", 195, 1082, 26),
        /** id = <code>196</code>, name = <code>"orderExpr"</code> */
        ORDEREXPR("orderExpr", 196, 1108, 3),
        /** id = <code>277</code>, name = <code>"orExpr"</code> */
        OREXPR("orExpr", 277, 1741, 6),
        /** id = <code>242</code>, name = <code>"parameterAlias"</code> */
        PARAMETERALIAS("parameterAlias", 242, 1517, 4),
        /** id = <code>244</code>, name = <code>"parameterAndValue"</code> */
        PARAMETERANDVALUE("parameterAndValue", 244, 1525, 4),
        /** id = <code>349</code>, name = <code>"parameterNameAndValue"</code> */
        PARAMETERNAMEANDVALUE("parameterNameAndValue", 349, 2444, 1),
        /** id = <code>147</code>, name = <code>"parameterTypeName"</code> */
        PARAMETERTYPENAME("parameterTypeName", 147, 700, 1),
        /** id = <code>146</code>, name = <code>"parameterTypeNames"</code> */
        PARAMETERTYPENAMES("parameterTypeNames", 146, 693, 7),
        /** id = <code>257</code>, name = <code>"parameterValue"</code> */
        PARAMETERVALUE("parameterValue", 257, 1600, 5),
        /** id = <code>274</code>, name = <code>"parenExpr"</code> */
        PARENEXPR("parenExpr", 274, 1719, 8),
        /** id = <code>35</code>, name = <code>"path"</code> */
        PATH("path", 35, 263, 6),
        /** id = <code>36</code>, name = <code>"path-abempty"</code> */
        PATH_ABEMPTY("path-abempty", 36, 269, 4),
        /** id = <code>37</code>, name = <code>"path-absolute"</code> */
        PATH_ABSOLUTE("path-absolute", 37, 273, 9),
        /** id = <code>40</code>, name = <code>"path-empty"</code> */
        PATH_EMPTY("path-empty", 40, 294, 1),
        /** id = <code>38</code>, name = <code>"path-noscheme"</code> */
        PATH_NOSCHEME("path-noscheme", 38, 282, 6),
        /** id = <code>39</code>, name = <code>"path-rootless"</code> */
        PATH_ROOTLESS("path-rootless", 39, 288, 6),
        /** id = <code>44</code>, name = <code>"pchar"</code> */
        PCHAR("pchar", 44, 305, 6),
        /** id = <code>47</code>, name = <code>"pct-encoded"</code> */
        PCT_ENCODED("pct-encoded", 47, 321, 4),
        /** id = <code>26</code>, name = <code>"port"</code> */
        PORT("port", 26, 116, 2),
        /** id = <code>71</code>, name = <code>"positiveInfinity"</code> */
        POSITIVEINFINITY("positiveInfinity", 71, 413, 1),
        /** id = <code>138</code>, name = <code>"primitiveAction"</code> */
        PRIMITIVEACTION("primitiveAction", 138, 663, 1),
        /** id = <code>139</code>, name = <code>"primitiveColAction"</code> */
        PRIMITIVECOLACTION("primitiveColAction", 139, 664, 1),
        /** id = <code>350</code>, name = <code>"primitiveColFuncCall"</code> */
        PRIMITIVECOLFUNCCALL("primitiveColFuncCall", 350, 2445, 1),
        /** id = <code>125</code>, name = <code>"primitiveColFunction"</code> */
        PRIMITIVECOLFUNCTION("primitiveColFunction", 125, 620, 1),
        /** id = <code>229</code>, name = <code>"primitiveColFunctionCall"</code> */
        PRIMITIVECOLFUNCTIONCALL("primitiveColFunctionCall", 229, 1464, 3),
        /** id = <code>351</code>, name = <code>"primitiveColInJSON"</code> */
        PRIMITIVECOLINJSON("primitiveColInJSON", 351, 2446, 1),
        /** id = <code>104</code>, name = <code>"primitiveColProperty"</code> */
        PRIMITIVECOLPROPERTY("primitiveColProperty", 104, 585, 1),
        /** id = <code>116</code>, name = <code>"primitiveColServiceOp"</code> */
        PRIMITIVECOLSERVICEOP("primitiveColServiceOp", 116, 609, 1),
        /** id = <code>266</code>, name = <code>"primitiveColServiceOpCall"</code> */
        PRIMITIVECOLSERVICEOPCALL("primitiveColServiceOpCall", 266, 1656, 6),
        /** id = <code>352</code>, name = <code>"primitiveFuncCall"</code> */
        PRIMITIVEFUNCCALL("primitiveFuncCall", 352, 2447, 1),
        /** id = <code>124</code>, name = <code>"primitiveFunction"</code> */
        PRIMITIVEFUNCTION("primitiveFunction", 124, 619, 1),
        /** id = <code>228</code>, name = <code>"primitiveFunctionCall"</code> */
        PRIMITIVEFUNCTIONCALL("primitiveFunctionCall", 228, 1461, 3),
        /** id = <code>102</code>, name = <code>"primitiveKeyProperty"</code> */
        PRIMITIVEKEYPROPERTY("primitiveKeyProperty", 102, 583, 1),
        /** id = <code>148</code>, name = <code>"primitiveLiteral"</code> */
        PRIMITIVELITERAL("primitiveLiteral", 148, 701, 33),
        /** id = <code>254</code>, name = <code>"primitiveLiteralInJSONLight"</code> */
        PRIMITIVELITERALINJSONLIGHT("primitiveLiteralInJSONLight", 254, 1582, 1),
        /** id = <code>253</code>, name = <code>"primitiveLiteralInVJSON"</code> */
        PRIMITIVELITERALINVJSON("primitiveLiteralInVJSON", 253, 1581, 1),
        /** id = <code>103</code>, name = <code>"primitiveNonKeyProperty"</code> */
        PRIMITIVENONKEYPROPERTY("primitiveNonKeyProperty", 103, 584, 1),
        /** id = <code>241</code>, name = <code>"primitiveParameterValue"</code> */
        PRIMITIVEPARAMETERVALUE("primitiveParameterValue", 241, 1516, 1),
        /** id = <code>246</code>, name = <code>"primitivePropertyInVJSON"</code> */
        PRIMITIVEPROPERTYINVJSON("primitivePropertyInVJSON", 246, 1530, 8),
        /** id = <code>212</code>, name = <code>"primitivePropertyPath"</code> */
        PRIMITIVEPROPERTYPATH("primitivePropertyPath", 212, 1378, 9),
        /** id = <code>245</code>, name = <code>"primitivePropInJSONLight"</code> */
        PRIMITIVEPROPINJSONLIGHT("primitivePropInJSONLight", 245, 1529, 1),
        /** id = <code>115</code>, name = <code>"primitiveServiceOp"</code> */
        PRIMITIVESERVICEOP("primitiveServiceOp", 115, 608, 1),
        /** id = <code>265</code>, name = <code>"primitiveServiceOpCall"</code> */
        PRIMITIVESERVICEOPCALL("primitiveServiceOpCall", 265, 1650, 6),
        /** id = <code>99</code>, name = <code>"primitiveTypeName"</code> */
        PRIMITIVETYPENAME("primitiveTypeName", 99, 542, 23),
        /** id = <code>353</code>, name = <code>"primitiveVJSONLiteral"</code> */
        PRIMITIVEVJSONLITERAL("primitiveVJSONLiteral", 353, 2448, 1),
        /** id = <code>108</code>, name = <code>"propertyName"</code> */
        PROPERTYNAME("propertyName", 108, 589, 7),
        /** id = <code>144</code>, name = <code>"qualifiedActionName"</code> */
        QUALIFIEDACTIONNAME("qualifiedActionName", 144, 679, 7),
        /** id = <code>98</code>, name = <code>"qualifiedComplexTypeName"</code> */
        QUALIFIEDCOMPLEXTYPENAME("qualifiedComplexTypeName", 98, 538, 4),
        /** id = <code>97</code>, name = <code>"qualifiedEntityTypeName"</code> */
        QUALIFIEDENTITYTYPENAME("qualifiedEntityTypeName", 97, 534, 4),
        /** id = <code>145</code>, name = <code>"qualifiedFunctionName"</code> */
        QUALIFIEDFUNCTIONNAME("qualifiedFunctionName", 145, 686, 7),
        /** id = <code>96</code>, name = <code>"qualifiedTypeName"</code> */
        QUALIFIEDTYPENAME("qualifiedTypeName", 96, 523, 11),
        /** id = <code>45</code>, name = <code>"query"</code> */
        QUERY("query", 45, 311, 5),
        /** id = <code>188</code>, name = <code>"queryOption"</code> */
        QUERYOPTION("queryOption", 188, 1034, 6),
        /** id = <code>187</code>, name = <code>"queryOptions"</code> */
        QUERYOPTIONS("queryOptions", 187, 1028, 6),
        /** id = <code>354</code>, name = <code>"quotation-mark"</code> */
        QUOTATION_MARK("quotation-mark", 354, 2449, 1),
        /** id = <code>34</code>, name = <code>"reg-name"</code> */
        REG_NAME("reg-name", 34, 258, 5),
        /** id = <code>21</code>, name = <code>"relative-part"</code> */
        RELATIVE_PART("relative-part", 21, 79, 8),
        /** id = <code>20</code>, name = <code>"relative-ref"</code> */
        RELATIVE_REF("relative-ref", 20, 69, 10),
        /** id = <code>314</code>, name = <code>"replaceMethodCallExpr"</code> */
        REPLACEMETHODCALLEXPR("replaceMethodCallExpr", 314, 2129, 23),
        /** id = <code>49</code>, name = <code>"reserved"</code> */
        RESERVED("reserved", 49, 332, 3),
        /** id = <code>208</code>, name = <code>"resourcePath"</code> */
        RESOURCEPATH("resourcePath", 208, 1220, 55),
        /** id = <code>330</code>, name = <code>"roundMethodCallExpr"</code> */
        ROUNDMETHODCALLEXPR("roundMethodCallExpr", 330, 2353, 11),
        /** id = <code>179</code>, name = <code>"sbyte"</code> */
        SBYTE("sbyte", 179, 905, 5),
        /** id = <code>22</code>, name = <code>"scheme"</code> */
        SCHEME("scheme", 22, 87, 9),
        /** id = <code>84</code>, name = <code>"second"</code> */
        SECOND("second", 84, 489, 1),
        /** id = <code>329</code>, name = <code>"secondMethodCallExpr"</code> */
        SECONDMETHODCALLEXPR("secondMethodCallExpr", 329, 2342, 11),
        /** id = <code>41</code>, name = <code>"segment"</code> */
        SEGMENT("segment", 41, 295, 2),
        /** id = <code>42</code>, name = <code>"segment-nz"</code> */
        SEGMENT_NZ("segment-nz", 42, 297, 2),
        /** id = <code>43</code>, name = <code>"segment-nz-nc"</code> */
        SEGMENT_NZ_NC("segment-nz-nc", 43, 299, 6),
        /** id = <code>201</code>, name = <code>"select"</code> */
        SELECT("select", 201, 1134, 3),
        /** id = <code>202</code>, name = <code>"selectClause"</code> */
        SELECTCLAUSE("selectClause", 202, 1137, 6),
        /** id = <code>203</code>, name = <code>"selectItem"</code> */
        SELECTITEM("selectItem", 203, 1143, 18),
        /** id = <code>61</code>, name = <code>"SEMI"</code> */
        SEMI("SEMI", 61, 401, 1),
        /** id = <code>110</code>, name = <code>"serviceOperation"</code> */
        SERVICEOPERATION("serviceOperation", 110, 597, 7),
        /** id = <code>267</code>, name = <code>"serviceOperationCall"</code> */
        SERVICEOPERATIONCALL("serviceOperationCall", 267, 1662, 7),
        /** id = <code>268</code>, name = <code>"serviceOpParameterName"</code> */
        SERVICEOPPARAMETERNAME("serviceOpParameterName", 268, 1669, 1),
        /** id = <code>185</code>, name = <code>"serviceRoot"</code> */
        SERVICEROOT("serviceRoot", 185, 1016, 6),
        /** id = <code>63</code>, name = <code>"sign"</code> */
        SIGN("sign", 63, 403, 3),
        /** id = <code>218</code>, name = <code>"simpleKey"</code> */
        SIMPLEKEY("simpleKey", 218, 1420, 4),
        /** id = <code>180</code>, name = <code>"single"</code> */
        SINGLE("single", 180, 910, 36),
        /** id = <code>210</code>, name = <code>"singleNavigation"</code> */
        SINGLENAVIGATION("singleNavigation", 210, 1311, 31),
        /** id = <code>299</code>, name = <code>"singleNavigationExpr"</code> */
        SINGLENAVIGATIONEXPR("singleNavigationExpr", 299, 1959, 25),
        /** id = <code>197</code>, name = <code>"skip"</code> */
        SKIP("skip", 197, 1111, 4),
        /** id = <code>204</code>, name = <code>"skiptoken"</code> */
        SKIPTOKEN("skiptoken", 204, 1161, 4),
        /** id = <code>269</code>, name = <code>"sopParameterNameAndValue"</code> */
        SOPPARAMETERNAMEANDVALUE("sopParameterNameAndValue", 269, 1670, 4),
        /** id = <code>4</code>, name = <code>"SP"</code> */
        SP("SP", 4, 13, 1),
        /** id = <code>59</code>, name = <code>"SQUOTE"</code> */
        SQUOTE("SQUOTE", 59, 399, 1),
        /** id = <code>182</code>, name = <code>"SQUOTE-in-string"</code> */
        SQUOTE_IN_STRING("SQUOTE-in-string", 182, 954, 3),
        /** id = <code>68</code>, name = <code>"star"</code> */
        STAR("star", 68, 410, 1),
        /** id = <code>315</code>, name = <code>"startsWithMethodCallExpr"</code> */
        STARTSWITHMETHODCALLEXPR("startsWithMethodCallExpr", 315, 2152, 17),
        /** id = <code>107</code>, name = <code>"streamProperty"</code> */
        STREAMPROPERTY("streamProperty", 107, 588, 1),
        /** id = <code>215</code>, name = <code>"streamPropertyPath"</code> */
        STREAMPROPERTYPATH("streamPropertyPath", 215, 1409, 7),
        /** id = <code>181</code>, name = <code>"string"</code> */
        STRING("string", 181, 946, 8),
        /** id = <code>51</code>, name = <code>"sub-delims"</code> */
        SUB_DELIMS("sub-delims", 51, 343, 12),
        /** id = <code>285</code>, name = <code>"subExpr"</code> */
        SUBEXPR("subExpr", 285, 1789, 6),
        /** id = <code>319</code>, name = <code>"substringMethodCallExp"</code> */
        SUBSTRINGMETHODCALLEXP("substringMethodCallExp", 319, 2202, 25),
        /** id = <code>355</code>, name = <code>"substringMethodCallExpr"</code> */
        SUBSTRINGMETHODCALLEXPR("substringMethodCallExpr", 355, 2450, 1),
        /** id = <code>320</code>, name = <code>"substringOfMethodCallExpr"</code> */
        SUBSTRINGOFMETHODCALLEXPR("substringOfMethodCallExpr", 320, 2227, 19),
        /** id = <code>189</code>, name = <code>"systemQueryOption"</code> */
        SYSTEMQUERYOPTION("systemQueryOption", 189, 1040, 10),
        /** id = <code>183</code>, name = <code>"time"</code> */
        TIME("time", 183, 957, 45),
        /** id = <code>316</code>, name = <code>"toLowerMethodCallExpr"</code> */
        TOLOWERMETHODCALLEXPR("toLowerMethodCallExpr", 316, 2169, 11),
        /** id = <code>198</code>, name = <code>"top"</code> */
        TOP("top", 198, 1115, 4),
        /** id = <code>317</code>, name = <code>"toUpperMethodCallExpr"</code> */
        TOUPPERMETHODCALLEXPR("toUpperMethodCallExpr", 317, 2180, 11),
        /** id = <code>318</code>, name = <code>"trimMethodCallExpr"</code> */
        TRIMMETHODCALLEXPR("trimMethodCallExpr", 318, 2191, 11),
        /** id = <code>256</code>, name = <code>"typeNVPInVJSON"</code> */
        TYPENVPINVJSON("typeNVPInVJSON", 256, 1592, 8),
        /** id = <code>48</code>, name = <code>"unreserved"</code> */
        UNRESERVED("unreserved", 48, 325, 7),
        /** id = <code>16</code>, name = <code>"URI"</code> */
        URI("URI", 16, 38, 12),
        /** id = <code>18</code>, name = <code>"URI-reference"</code> */
        URI_REFERENCE("URI-reference", 18, 58, 3),
        /** id = <code>24</code>, name = <code>"userinfo"</code> */
        USERINFO("userinfo", 24, 106, 6),
        /** id = <code>54</code>, name = <code>"UTF8-1"</code> */
        UTF8_1("UTF8-1", 54, 362, 1),
        /** id = <code>55</code>, name = <code>"UTF8-2"</code> */
        UTF8_2("UTF8-2", 55, 363, 3),
        /** id = <code>56</code>, name = <code>"UTF8-3"</code> */
        UTF8_3("UTF8-3", 56, 366, 17),
        /** id = <code>57</code>, name = <code>"UTF8-4"</code> */
        UTF8_4("UTF8-4", 57, 383, 15),
        /** id = <code>53</code>, name = <code>"UTF8-char"</code> */
        UTF8_CHAR("UTF8-char", 53, 357, 5),
        /** id = <code>52</code>, name = <code>"UTF8-octets"</code> */
        UTF8_OCTETS("UTF8-octets", 52, 355, 2),
        /** id = <code>58</code>, name = <code>"UTF8-tail"</code> */
        UTF8_TAIL("UTF8-tail", 58, 398, 1),
        /** id = <code>216</code>, name = <code>"value"</code> */
        VALUE("value", 216, 1416, 1),
        /** id = <code>66</code>, name = <code>"value-separator"</code> */
        VALUE_SEPARATOR("value-separator", 66, 408, 1),
        /** id = <code>8</code>, name = <code>"VCHAR"</code> */
        VCHAR("VCHAR", 8, 24, 1),
        /** id = <code>140</code>, name = <code>"voidAction"</code> */
        VOIDACTION("voidAction", 140, 665, 1),
        /** id = <code>6</code>, name = <code>"WSP"</code> */
        WSP("WSP", 6, 15, 3),
        /** id = <code>73</code>, name = <code>"year"</code> */
        YEAR("year", 73, 418, 2),
        /** id = <code>324</code>, name = <code>"yearMethodCallExpr"</code> */
        YEARMETHODCALLEXPR("yearMethodCallExpr", 324, 2287, 11),
        /** id = <code>77</code>, name = <code>"zeroToSixty"</code> */
        ZEROTOSIXTY("zeroToSixty", 77, 444, 14),
        /** id = <code>76</code>, name = <code>"zeroToThirteen"</code> */
        ZEROTOTHIRTEEN("zeroToThirteen", 76, 441, 3),
        /** id = <code>78</code>, name = <code>"zeroToThirtyOne"</code> */
        ZEROTOTHIRTYONE("zeroToThirtyOne", 78, 458, 12),
        /** id = <code>75</code>, name = <code>"zeroToTwelve"</code> */
        ZEROTOTWELVE("zeroToTwelve", 75, 430, 11),
        /** id = <code>79</code>, name = <code>"zeroToTwentyFour"</code> */
        ZEROTOTWENTYFOUR("zeroToTwentyFour", 79, 470, 15);
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
    	Rule[] rules = new Rule[356];
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
    	Opcode[] op = new Opcode[2451];
        {int[] a = {1,2}; op[0] = getOpcodeAlt(a);}
        op[1] = getOpcodeTrg((char)65, (char)90);
        op[2] = getOpcodeTrg((char)97, (char)122);
        op[3] = getOpcodeTrg((char)48, (char)57);
        {int[] a = {5,6,7,8,9,10,11}; op[4] = getOpcodeAlt(a);}
        op[5] = getOpcodeRnm(1, 3); // DIGIT
        {char[] a = {65}; op[6] = getOpcodeTls(a);}
        {char[] a = {66}; op[7] = getOpcodeTls(a);}
        {char[] a = {67}; op[8] = getOpcodeTls(a);}
        {char[] a = {68}; op[9] = getOpcodeTls(a);}
        {char[] a = {69}; op[10] = getOpcodeTls(a);}
        {char[] a = {70}; op[11] = getOpcodeTls(a);}
        {char[] a = {34}; op[12] = getOpcodeTbs(a);}
        {char[] a = {32}; op[13] = getOpcodeTbs(a);}
        {char[] a = {9}; op[14] = getOpcodeTbs(a);}
        {int[] a = {16,17}; op[15] = getOpcodeAlt(a);}
        op[16] = getOpcodeRnm(4, 13); // SP
        op[17] = getOpcodeRnm(5, 14); // HTAB
        op[18] = getOpcodeRep((char)0, Character.MAX_VALUE, 19);
        {int[] a = {20,21}; op[19] = getOpcodeAlt(a);}
        op[20] = getOpcodeRnm(6, 15); // WSP
        {int[] a = {22,23}; op[21] = getOpcodeCat(a);}
        op[22] = getOpcodeRnm(14, 32); // CRLF
        op[23] = getOpcodeRnm(6, 15); // WSP
        op[24] = getOpcodeTrg((char)33, (char)126);
        op[25] = getOpcodeTrg((char)1, (char)127);
        op[26] = getOpcodeTrg((char)0, (char)255);
        {int[] a = {28,29}; op[27] = getOpcodeAlt(a);}
        op[28] = getOpcodeTrg((char)0, (char)31);
        {char[] a = {127}; op[29] = getOpcodeTbs(a);}
        {char[] a = {13}; op[30] = getOpcodeTbs(a);}
        {char[] a = {10}; op[31] = getOpcodeTbs(a);}
        {int[] a = {33,34}; op[32] = getOpcodeCat(a);}
        op[33] = getOpcodeRnm(12, 30); // CR
        op[34] = getOpcodeRnm(13, 31); // LF
        {int[] a = {36,37}; op[35] = getOpcodeAlt(a);}
        {char[] a = {48}; op[36] = getOpcodeTls(a);}
        {char[] a = {49}; op[37] = getOpcodeTls(a);}
        {int[] a = {39,40,41,42,46}; op[38] = getOpcodeCat(a);}
        op[39] = getOpcodeRnm(22, 87); // scheme
        {char[] a = {58}; op[40] = getOpcodeTls(a);}
        op[41] = getOpcodeRnm(17, 50); // hier-part
        op[42] = getOpcodeRep((char)0, (char)1, 43);
        {int[] a = {44,45}; op[43] = getOpcodeCat(a);}
        {char[] a = {63}; op[44] = getOpcodeTls(a);}
        op[45] = getOpcodeRnm(45, 311); // query
        op[46] = getOpcodeRep((char)0, (char)1, 47);
        {int[] a = {48,49}; op[47] = getOpcodeCat(a);}
        {char[] a = {35}; op[48] = getOpcodeTls(a);}
        op[49] = getOpcodeRnm(46, 316); // fragment
        {int[] a = {51,55,56,57}; op[50] = getOpcodeAlt(a);}
        {int[] a = {52,53,54}; op[51] = getOpcodeCat(a);}
        {char[] a = {47,47}; op[52] = getOpcodeTls(a);}
        op[53] = getOpcodeRnm(23, 96); // authority
        op[54] = getOpcodeRnm(36, 269); // path-abempty
        op[55] = getOpcodeRnm(37, 273); // path-absolute
        op[56] = getOpcodeRnm(39, 288); // path-rootless
        op[57] = getOpcodeRnm(40, 294); // path-empty
        {int[] a = {59,60}; op[58] = getOpcodeAlt(a);}
        op[59] = getOpcodeRnm(16, 38); // URI
        op[60] = getOpcodeRnm(20, 69); // relative-ref
        {int[] a = {62,63,64,65}; op[61] = getOpcodeCat(a);}
        op[62] = getOpcodeRnm(22, 87); // scheme
        {char[] a = {58}; op[63] = getOpcodeTls(a);}
        op[64] = getOpcodeRnm(17, 50); // hier-part
        op[65] = getOpcodeRep((char)0, (char)1, 66);
        {int[] a = {67,68}; op[66] = getOpcodeCat(a);}
        {char[] a = {63}; op[67] = getOpcodeTls(a);}
        op[68] = getOpcodeRnm(45, 311); // query
        {int[] a = {70,71,75}; op[69] = getOpcodeCat(a);}
        op[70] = getOpcodeRnm(21, 79); // relative-part
        op[71] = getOpcodeRep((char)0, (char)1, 72);
        {int[] a = {73,74}; op[72] = getOpcodeCat(a);}
        {char[] a = {63}; op[73] = getOpcodeTls(a);}
        op[74] = getOpcodeRnm(45, 311); // query
        op[75] = getOpcodeRep((char)0, (char)1, 76);
        {int[] a = {77,78}; op[76] = getOpcodeCat(a);}
        {char[] a = {35}; op[77] = getOpcodeTls(a);}
        op[78] = getOpcodeRnm(46, 316); // fragment
        {int[] a = {80,84,85,86}; op[79] = getOpcodeAlt(a);}
        {int[] a = {81,82,83}; op[80] = getOpcodeCat(a);}
        {char[] a = {47,47}; op[81] = getOpcodeTls(a);}
        op[82] = getOpcodeRnm(23, 96); // authority
        op[83] = getOpcodeRnm(36, 269); // path-abempty
        op[84] = getOpcodeRnm(37, 273); // path-absolute
        op[85] = getOpcodeRnm(38, 282); // path-noscheme
        op[86] = getOpcodeRnm(40, 294); // path-empty
        {int[] a = {88,89}; op[87] = getOpcodeCat(a);}
        op[88] = getOpcodeRnm(0, 0); // ALPHA
        op[89] = getOpcodeRep((char)0, Character.MAX_VALUE, 90);
        {int[] a = {91,92,93,94,95}; op[90] = getOpcodeAlt(a);}
        op[91] = getOpcodeRnm(0, 0); // ALPHA
        op[92] = getOpcodeRnm(1, 3); // DIGIT
        {char[] a = {43}; op[93] = getOpcodeTls(a);}
        {char[] a = {45}; op[94] = getOpcodeTls(a);}
        {char[] a = {46}; op[95] = getOpcodeTls(a);}
        {int[] a = {97,101,102}; op[96] = getOpcodeCat(a);}
        op[97] = getOpcodeRep((char)0, (char)1, 98);
        {int[] a = {99,100}; op[98] = getOpcodeCat(a);}
        op[99] = getOpcodeRnm(24, 106); // userinfo
        {char[] a = {64}; op[100] = getOpcodeTls(a);}
        op[101] = getOpcodeRnm(25, 112); // host
        op[102] = getOpcodeRep((char)0, (char)1, 103);
        {int[] a = {104,105}; op[103] = getOpcodeCat(a);}
        {char[] a = {58}; op[104] = getOpcodeTls(a);}
        op[105] = getOpcodeRnm(26, 116); // port
        op[106] = getOpcodeRep((char)0, Character.MAX_VALUE, 107);
        {int[] a = {108,109,110,111}; op[107] = getOpcodeAlt(a);}
        op[108] = getOpcodeRnm(48, 325); // unreserved
        op[109] = getOpcodeRnm(47, 321); // pct-encoded
        op[110] = getOpcodeRnm(51, 343); // sub-delims
        {char[] a = {58}; op[111] = getOpcodeTls(a);}
        {int[] a = {113,114,115}; op[112] = getOpcodeAlt(a);}
        op[113] = getOpcodeRnm(27, 118); // IP-literal
        op[114] = getOpcodeRnm(32, 234); // IPv4address
        op[115] = getOpcodeRnm(34, 258); // reg-name
        op[116] = getOpcodeRep((char)0, Character.MAX_VALUE, 117);
        op[117] = getOpcodeRnm(1, 3); // DIGIT
        {int[] a = {119,120,123}; op[118] = getOpcodeCat(a);}
        {char[] a = {91}; op[119] = getOpcodeTls(a);}
        {int[] a = {121,122}; op[120] = getOpcodeAlt(a);}
        op[121] = getOpcodeRnm(29, 134); // IPv6address
        op[122] = getOpcodeRnm(28, 124); // IPvFuture
        {char[] a = {93}; op[123] = getOpcodeTls(a);}
        {int[] a = {125,126,128,129}; op[124] = getOpcodeCat(a);}
        {char[] a = {118}; op[125] = getOpcodeTls(a);}
        op[126] = getOpcodeRep((char)1, Character.MAX_VALUE, 127);
        op[127] = getOpcodeRnm(2, 4); // HEXDIG
        {char[] a = {46}; op[128] = getOpcodeTls(a);}
        op[129] = getOpcodeRep((char)1, Character.MAX_VALUE, 130);
        {int[] a = {131,132,133}; op[130] = getOpcodeAlt(a);}
        op[131] = getOpcodeRnm(48, 325); // unreserved
        op[132] = getOpcodeRnm(51, 343); // sub-delims
        {char[] a = {58}; op[133] = getOpcodeTls(a);}
        {int[] a = {135,141,148,157,171,185,197,207,217}; op[134] = getOpcodeAlt(a);}
        {int[] a = {136,140}; op[135] = getOpcodeCat(a);}
        op[136] = getOpcodeRep((char)6, (char)6, 137);
        {int[] a = {138,139}; op[137] = getOpcodeCat(a);}
        op[138] = getOpcodeRnm(30, 226); // h16
        {char[] a = {58}; op[139] = getOpcodeTls(a);}
        op[140] = getOpcodeRnm(31, 228); // ls32
        {int[] a = {142,143,147}; op[141] = getOpcodeCat(a);}
        {char[] a = {58,58}; op[142] = getOpcodeTls(a);}
        op[143] = getOpcodeRep((char)5, (char)5, 144);
        {int[] a = {145,146}; op[144] = getOpcodeCat(a);}
        op[145] = getOpcodeRnm(30, 226); // h16
        {char[] a = {58}; op[146] = getOpcodeTls(a);}
        op[147] = getOpcodeRnm(31, 228); // ls32
        {int[] a = {149,151,152,156}; op[148] = getOpcodeCat(a);}
        op[149] = getOpcodeRep((char)0, (char)1, 150);
        op[150] = getOpcodeRnm(30, 226); // h16
        {char[] a = {58,58}; op[151] = getOpcodeTls(a);}
        op[152] = getOpcodeRep((char)4, (char)4, 153);
        {int[] a = {154,155}; op[153] = getOpcodeCat(a);}
        op[154] = getOpcodeRnm(30, 226); // h16
        {char[] a = {58}; op[155] = getOpcodeTls(a);}
        op[156] = getOpcodeRnm(31, 228); // ls32
        {int[] a = {158,165,166,170}; op[157] = getOpcodeCat(a);}
        op[158] = getOpcodeRep((char)0, (char)1, 159);
        {int[] a = {160,164}; op[159] = getOpcodeCat(a);}
        op[160] = getOpcodeRep((char)0, (char)1, 161);
        {int[] a = {162,163}; op[161] = getOpcodeCat(a);}
        op[162] = getOpcodeRnm(30, 226); // h16
        {char[] a = {58}; op[163] = getOpcodeTls(a);}
        op[164] = getOpcodeRnm(30, 226); // h16
        {char[] a = {58,58}; op[165] = getOpcodeTls(a);}
        op[166] = getOpcodeRep((char)3, (char)3, 167);
        {int[] a = {168,169}; op[167] = getOpcodeCat(a);}
        op[168] = getOpcodeRnm(30, 226); // h16
        {char[] a = {58}; op[169] = getOpcodeTls(a);}
        op[170] = getOpcodeRnm(31, 228); // ls32
        {int[] a = {172,179,180,184}; op[171] = getOpcodeCat(a);}
        op[172] = getOpcodeRep((char)0, (char)1, 173);
        {int[] a = {174,178}; op[173] = getOpcodeCat(a);}
        op[174] = getOpcodeRep((char)0, (char)2, 175);
        {int[] a = {176,177}; op[175] = getOpcodeCat(a);}
        op[176] = getOpcodeRnm(30, 226); // h16
        {char[] a = {58}; op[177] = getOpcodeTls(a);}
        op[178] = getOpcodeRnm(30, 226); // h16
        {char[] a = {58,58}; op[179] = getOpcodeTls(a);}
        op[180] = getOpcodeRep((char)2, (char)2, 181);
        {int[] a = {182,183}; op[181] = getOpcodeCat(a);}
        op[182] = getOpcodeRnm(30, 226); // h16
        {char[] a = {58}; op[183] = getOpcodeTls(a);}
        op[184] = getOpcodeRnm(31, 228); // ls32
        {int[] a = {186,193,194,195,196}; op[185] = getOpcodeCat(a);}
        op[186] = getOpcodeRep((char)0, (char)1, 187);
        {int[] a = {188,192}; op[187] = getOpcodeCat(a);}
        op[188] = getOpcodeRep((char)0, (char)3, 189);
        {int[] a = {190,191}; op[189] = getOpcodeCat(a);}
        op[190] = getOpcodeRnm(30, 226); // h16
        {char[] a = {58}; op[191] = getOpcodeTls(a);}
        op[192] = getOpcodeRnm(30, 226); // h16
        {char[] a = {58,58}; op[193] = getOpcodeTls(a);}
        op[194] = getOpcodeRnm(30, 226); // h16
        {char[] a = {58}; op[195] = getOpcodeTls(a);}
        op[196] = getOpcodeRnm(31, 228); // ls32
        {int[] a = {198,205,206}; op[197] = getOpcodeCat(a);}
        op[198] = getOpcodeRep((char)0, (char)1, 199);
        {int[] a = {200,204}; op[199] = getOpcodeCat(a);}
        op[200] = getOpcodeRep((char)0, (char)4, 201);
        {int[] a = {202,203}; op[201] = getOpcodeCat(a);}
        op[202] = getOpcodeRnm(30, 226); // h16
        {char[] a = {58}; op[203] = getOpcodeTls(a);}
        op[204] = getOpcodeRnm(30, 226); // h16
        {char[] a = {58,58}; op[205] = getOpcodeTls(a);}
        op[206] = getOpcodeRnm(31, 228); // ls32
        {int[] a = {208,215,216}; op[207] = getOpcodeCat(a);}
        op[208] = getOpcodeRep((char)0, (char)1, 209);
        {int[] a = {210,214}; op[209] = getOpcodeCat(a);}
        op[210] = getOpcodeRep((char)0, (char)5, 211);
        {int[] a = {212,213}; op[211] = getOpcodeCat(a);}
        op[212] = getOpcodeRnm(30, 226); // h16
        {char[] a = {58}; op[213] = getOpcodeTls(a);}
        op[214] = getOpcodeRnm(30, 226); // h16
        {char[] a = {58,58}; op[215] = getOpcodeTls(a);}
        op[216] = getOpcodeRnm(30, 226); // h16
        {int[] a = {218,225}; op[217] = getOpcodeCat(a);}
        op[218] = getOpcodeRep((char)0, (char)1, 219);
        {int[] a = {220,224}; op[219] = getOpcodeCat(a);}
        op[220] = getOpcodeRep((char)0, (char)6, 221);
        {int[] a = {222,223}; op[221] = getOpcodeCat(a);}
        op[222] = getOpcodeRnm(30, 226); // h16
        {char[] a = {58}; op[223] = getOpcodeTls(a);}
        op[224] = getOpcodeRnm(30, 226); // h16
        {char[] a = {58,58}; op[225] = getOpcodeTls(a);}
        op[226] = getOpcodeRep((char)1, (char)4, 227);
        op[227] = getOpcodeRnm(2, 4); // HEXDIG
        {int[] a = {229,233}; op[228] = getOpcodeAlt(a);}
        {int[] a = {230,231,232}; op[229] = getOpcodeCat(a);}
        op[230] = getOpcodeRnm(30, 226); // h16
        {char[] a = {58}; op[231] = getOpcodeTls(a);}
        op[232] = getOpcodeRnm(30, 226); // h16
        op[233] = getOpcodeRnm(32, 234); // IPv4address
        {int[] a = {235,236,237,238,239,240,241}; op[234] = getOpcodeCat(a);}
        op[235] = getOpcodeRnm(33, 242); // dec-octet
        {char[] a = {46}; op[236] = getOpcodeTls(a);}
        op[237] = getOpcodeRnm(33, 242); // dec-octet
        {char[] a = {46}; op[238] = getOpcodeTls(a);}
        op[239] = getOpcodeRnm(33, 242); // dec-octet
        {char[] a = {46}; op[240] = getOpcodeTls(a);}
        op[241] = getOpcodeRnm(33, 242); // dec-octet
        {int[] a = {243,244,247,251,255}; op[242] = getOpcodeAlt(a);}
        op[243] = getOpcodeRnm(1, 3); // DIGIT
        {int[] a = {245,246}; op[244] = getOpcodeCat(a);}
        op[245] = getOpcodeTrg((char)49, (char)57);
        op[246] = getOpcodeRnm(1, 3); // DIGIT
        {int[] a = {248,249}; op[247] = getOpcodeCat(a);}
        {char[] a = {49}; op[248] = getOpcodeTls(a);}
        op[249] = getOpcodeRep((char)2, (char)2, 250);
        op[250] = getOpcodeRnm(1, 3); // DIGIT
        {int[] a = {252,253,254}; op[251] = getOpcodeCat(a);}
        {char[] a = {50}; op[252] = getOpcodeTls(a);}
        op[253] = getOpcodeTrg((char)48, (char)52);
        op[254] = getOpcodeRnm(1, 3); // DIGIT
        {int[] a = {256,257}; op[255] = getOpcodeCat(a);}
        {char[] a = {50,53}; op[256] = getOpcodeTls(a);}
        op[257] = getOpcodeTrg((char)48, (char)53);
        op[258] = getOpcodeRep((char)0, Character.MAX_VALUE, 259);
        {int[] a = {260,261,262}; op[259] = getOpcodeAlt(a);}
        op[260] = getOpcodeRnm(48, 325); // unreserved
        op[261] = getOpcodeRnm(47, 321); // pct-encoded
        op[262] = getOpcodeRnm(51, 343); // sub-delims
        {int[] a = {264,265,266,267,268}; op[263] = getOpcodeAlt(a);}
        op[264] = getOpcodeRnm(36, 269); // path-abempty
        op[265] = getOpcodeRnm(37, 273); // path-absolute
        op[266] = getOpcodeRnm(38, 282); // path-noscheme
        op[267] = getOpcodeRnm(39, 288); // path-rootless
        op[268] = getOpcodeRnm(40, 294); // path-empty
        op[269] = getOpcodeRep((char)0, Character.MAX_VALUE, 270);
        {int[] a = {271,272}; op[270] = getOpcodeCat(a);}
        {char[] a = {47}; op[271] = getOpcodeTls(a);}
        op[272] = getOpcodeRnm(41, 295); // segment
        {int[] a = {274,275}; op[273] = getOpcodeCat(a);}
        {char[] a = {47}; op[274] = getOpcodeTls(a);}
        op[275] = getOpcodeRep((char)0, (char)1, 276);
        {int[] a = {277,278}; op[276] = getOpcodeCat(a);}
        op[277] = getOpcodeRnm(42, 297); // segment-nz
        op[278] = getOpcodeRep((char)0, Character.MAX_VALUE, 279);
        {int[] a = {280,281}; op[279] = getOpcodeCat(a);}
        {char[] a = {47}; op[280] = getOpcodeTls(a);}
        op[281] = getOpcodeRnm(41, 295); // segment
        {int[] a = {283,284}; op[282] = getOpcodeCat(a);}
        op[283] = getOpcodeRnm(43, 299); // segment-nz-nc
        op[284] = getOpcodeRep((char)0, Character.MAX_VALUE, 285);
        {int[] a = {286,287}; op[285] = getOpcodeCat(a);}
        {char[] a = {47}; op[286] = getOpcodeTls(a);}
        op[287] = getOpcodeRnm(41, 295); // segment
        {int[] a = {289,290}; op[288] = getOpcodeCat(a);}
        op[289] = getOpcodeRnm(42, 297); // segment-nz
        op[290] = getOpcodeRep((char)0, Character.MAX_VALUE, 291);
        {int[] a = {292,293}; op[291] = getOpcodeCat(a);}
        {char[] a = {47}; op[292] = getOpcodeTls(a);}
        op[293] = getOpcodeRnm(41, 295); // segment
        {char[] a = {}; op[294] = getOpcodeTls(a);}
        op[295] = getOpcodeRep((char)0, Character.MAX_VALUE, 296);
        op[296] = getOpcodeRnm(44, 305); // pchar
        op[297] = getOpcodeRep((char)1, Character.MAX_VALUE, 298);
        op[298] = getOpcodeRnm(44, 305); // pchar
        op[299] = getOpcodeRep((char)1, Character.MAX_VALUE, 300);
        {int[] a = {301,302,303,304}; op[300] = getOpcodeAlt(a);}
        op[301] = getOpcodeRnm(48, 325); // unreserved
        op[302] = getOpcodeRnm(47, 321); // pct-encoded
        op[303] = getOpcodeRnm(51, 343); // sub-delims
        {char[] a = {64}; op[304] = getOpcodeTls(a);}
        {int[] a = {306,307,308,309,310}; op[305] = getOpcodeAlt(a);}
        op[306] = getOpcodeRnm(48, 325); // unreserved
        op[307] = getOpcodeRnm(47, 321); // pct-encoded
        op[308] = getOpcodeRnm(51, 343); // sub-delims
        {char[] a = {58}; op[309] = getOpcodeTls(a);}
        {char[] a = {64}; op[310] = getOpcodeTls(a);}
        op[311] = getOpcodeRep((char)0, Character.MAX_VALUE, 312);
        {int[] a = {313,314,315}; op[312] = getOpcodeAlt(a);}
        op[313] = getOpcodeRnm(44, 305); // pchar
        {char[] a = {47}; op[314] = getOpcodeTls(a);}
        {char[] a = {63}; op[315] = getOpcodeTls(a);}
        op[316] = getOpcodeRep((char)0, Character.MAX_VALUE, 317);
        {int[] a = {318,319,320}; op[317] = getOpcodeAlt(a);}
        op[318] = getOpcodeRnm(44, 305); // pchar
        {char[] a = {47}; op[319] = getOpcodeTls(a);}
        {char[] a = {63}; op[320] = getOpcodeTls(a);}
        {int[] a = {322,323,324}; op[321] = getOpcodeCat(a);}
        {char[] a = {37}; op[322] = getOpcodeTls(a);}
        op[323] = getOpcodeRnm(2, 4); // HEXDIG
        op[324] = getOpcodeRnm(2, 4); // HEXDIG
        {int[] a = {326,327,328,329,330,331}; op[325] = getOpcodeAlt(a);}
        op[326] = getOpcodeRnm(0, 0); // ALPHA
        op[327] = getOpcodeRnm(1, 3); // DIGIT
        {char[] a = {45}; op[328] = getOpcodeTls(a);}
        {char[] a = {46}; op[329] = getOpcodeTls(a);}
        {char[] a = {95}; op[330] = getOpcodeTls(a);}
        {char[] a = {126}; op[331] = getOpcodeTls(a);}
        {int[] a = {333,334}; op[332] = getOpcodeAlt(a);}
        op[333] = getOpcodeRnm(50, 335); // gen-delims
        op[334] = getOpcodeRnm(51, 343); // sub-delims
        {int[] a = {336,337,338,339,340,341,342}; op[335] = getOpcodeAlt(a);}
        {char[] a = {58}; op[336] = getOpcodeTls(a);}
        {char[] a = {47}; op[337] = getOpcodeTls(a);}
        {char[] a = {63}; op[338] = getOpcodeTls(a);}
        {char[] a = {35}; op[339] = getOpcodeTls(a);}
        {char[] a = {91}; op[340] = getOpcodeTls(a);}
        {char[] a = {93}; op[341] = getOpcodeTls(a);}
        {char[] a = {64}; op[342] = getOpcodeTls(a);}
        {int[] a = {344,345,346,347,348,349,350,351,352,353,354}; op[343] = getOpcodeAlt(a);}
        {char[] a = {33}; op[344] = getOpcodeTls(a);}
        {char[] a = {36}; op[345] = getOpcodeTls(a);}
        {char[] a = {38}; op[346] = getOpcodeTls(a);}
        {char[] a = {39}; op[347] = getOpcodeTls(a);}
        {char[] a = {40}; op[348] = getOpcodeTls(a);}
        {char[] a = {41}; op[349] = getOpcodeTls(a);}
        {char[] a = {42}; op[350] = getOpcodeTls(a);}
        {char[] a = {43}; op[351] = getOpcodeTls(a);}
        {char[] a = {44}; op[352] = getOpcodeTls(a);}
        {char[] a = {59}; op[353] = getOpcodeTls(a);}
        {char[] a = {61}; op[354] = getOpcodeTls(a);}
        op[355] = getOpcodeRep((char)0, Character.MAX_VALUE, 356);
        op[356] = getOpcodeRnm(53, 357); // UTF8-char
        {int[] a = {358,359,360,361}; op[357] = getOpcodeAlt(a);}
        op[358] = getOpcodeRnm(54, 362); // UTF8-1
        op[359] = getOpcodeRnm(55, 363); // UTF8-2
        op[360] = getOpcodeRnm(56, 366); // UTF8-3
        op[361] = getOpcodeRnm(57, 383); // UTF8-4
        op[362] = getOpcodeTrg((char)0, (char)127);
        {int[] a = {364,365}; op[363] = getOpcodeCat(a);}
        op[364] = getOpcodeTrg((char)194, (char)223);
        op[365] = getOpcodeRnm(58, 398); // UTF8-tail
        {int[] a = {367,371,375,379}; op[366] = getOpcodeAlt(a);}
        {int[] a = {368,369,370}; op[367] = getOpcodeCat(a);}
        {char[] a = {224}; op[368] = getOpcodeTbs(a);}
        op[369] = getOpcodeTrg((char)160, (char)191);
        op[370] = getOpcodeRnm(58, 398); // UTF8-tail
        {int[] a = {372,373}; op[371] = getOpcodeCat(a);}
        op[372] = getOpcodeTrg((char)225, (char)236);
        op[373] = getOpcodeRep((char)2, (char)2, 374);
        op[374] = getOpcodeRnm(58, 398); // UTF8-tail
        {int[] a = {376,377,378}; op[375] = getOpcodeCat(a);}
        {char[] a = {237}; op[376] = getOpcodeTbs(a);}
        op[377] = getOpcodeTrg((char)128, (char)159);
        op[378] = getOpcodeRnm(58, 398); // UTF8-tail
        {int[] a = {380,381}; op[379] = getOpcodeCat(a);}
        op[380] = getOpcodeTrg((char)238, (char)239);
        op[381] = getOpcodeRep((char)2, (char)2, 382);
        op[382] = getOpcodeRnm(58, 398); // UTF8-tail
        {int[] a = {384,389,393}; op[383] = getOpcodeAlt(a);}
        {int[] a = {385,386,387}; op[384] = getOpcodeCat(a);}
        {char[] a = {240}; op[385] = getOpcodeTbs(a);}
        op[386] = getOpcodeTrg((char)144, (char)191);
        op[387] = getOpcodeRep((char)2, (char)2, 388);
        op[388] = getOpcodeRnm(58, 398); // UTF8-tail
        {int[] a = {390,391}; op[389] = getOpcodeCat(a);}
        op[390] = getOpcodeTrg((char)241, (char)243);
        op[391] = getOpcodeRep((char)3, (char)3, 392);
        op[392] = getOpcodeRnm(58, 398); // UTF8-tail
        {int[] a = {394,395,396}; op[393] = getOpcodeCat(a);}
        {char[] a = {244}; op[394] = getOpcodeTbs(a);}
        op[395] = getOpcodeTrg((char)128, (char)143);
        op[396] = getOpcodeRep((char)2, (char)2, 397);
        op[397] = getOpcodeRnm(58, 398); // UTF8-tail
        op[398] = getOpcodeTrg((char)128, (char)191);
        {char[] a = {39}; op[399] = getOpcodeTbs(a);}
        {char[] a = {61}; op[400] = getOpcodeTbs(a);}
        {char[] a = {59}; op[401] = getOpcodeTbs(a);}
        {char[] a = {44}; op[402] = getOpcodeTbs(a);}
        {int[] a = {404,405}; op[403] = getOpcodeAlt(a);}
        {char[] a = {43}; op[404] = getOpcodeTls(a);}
        {char[] a = {45}; op[405] = getOpcodeTls(a);}
        {char[] a = {123}; op[406] = getOpcodeTls(a);}
        {char[] a = {125}; op[407] = getOpcodeTls(a);}
        op[408] = getOpcodeRnm(62, 402); // COMMA
        {char[] a = {58}; op[409] = getOpcodeTls(a);}
        {char[] a = {42}; op[410] = getOpcodeTls(a);}
        {char[] a = {78,97,78}; op[411] = getOpcodeTls(a);}
        {char[] a = {45,73,78,70}; op[412] = getOpcodeTls(a);}
        {char[] a = {73,78,70}; op[413] = getOpcodeTls(a);}
        {int[] a = {415,416,417}; op[414] = getOpcodeAlt(a);}
        op[415] = getOpcodeRnm(69, 411); // nan
        op[416] = getOpcodeRnm(70, 412); // negativeInfinity
        op[417] = getOpcodeRnm(71, 413); // positiveInfinity
        op[418] = getOpcodeRep((char)4, Character.MAX_VALUE, 419);
        op[419] = getOpcodeRnm(1, 3); // DIGIT
        {int[] a = {421,422,423,424,425,426,427,428,429}; op[420] = getOpcodeAlt(a);}
        {char[] a = {49}; op[421] = getOpcodeTls(a);}
        {char[] a = {50}; op[422] = getOpcodeTls(a);}
        {char[] a = {51}; op[423] = getOpcodeTls(a);}
        {char[] a = {52}; op[424] = getOpcodeTls(a);}
        {char[] a = {53}; op[425] = getOpcodeTls(a);}
        {char[] a = {54}; op[426] = getOpcodeTls(a);}
        {char[] a = {55}; op[427] = getOpcodeTls(a);}
        {char[] a = {56}; op[428] = getOpcodeTls(a);}
        {char[] a = {57}; op[429] = getOpcodeTls(a);}
        {int[] a = {431,435}; op[430] = getOpcodeAlt(a);}
        {int[] a = {432,434}; op[431] = getOpcodeCat(a);}
        op[432] = getOpcodeRep((char)0, (char)1, 433);
        {char[] a = {48}; op[433] = getOpcodeTls(a);}
        op[434] = getOpcodeRnm(74, 420); // oneToNine
        {int[] a = {436,437}; op[435] = getOpcodeCat(a);}
        {char[] a = {49}; op[436] = getOpcodeTls(a);}
        {int[] a = {438,439,440}; op[437] = getOpcodeAlt(a);}
        {char[] a = {48}; op[438] = getOpcodeTls(a);}
        {char[] a = {49}; op[439] = getOpcodeTls(a);}
        {char[] a = {50}; op[440] = getOpcodeTls(a);}
        {int[] a = {442,443}; op[441] = getOpcodeAlt(a);}
        op[442] = getOpcodeRnm(75, 430); // zeroToTwelve
        {char[] a = {49,51}; op[443] = getOpcodeTls(a);}
        {int[] a = {445,449,457}; op[444] = getOpcodeAlt(a);}
        {int[] a = {446,448}; op[445] = getOpcodeCat(a);}
        op[446] = getOpcodeRep((char)0, (char)1, 447);
        {char[] a = {48}; op[447] = getOpcodeTls(a);}
        op[448] = getOpcodeRnm(74, 420); // oneToNine
        {int[] a = {450,456}; op[449] = getOpcodeCat(a);}
        {int[] a = {451,452,453,454,455}; op[450] = getOpcodeAlt(a);}
        {char[] a = {49}; op[451] = getOpcodeTls(a);}
        {char[] a = {50}; op[452] = getOpcodeTls(a);}
        {char[] a = {51}; op[453] = getOpcodeTls(a);}
        {char[] a = {52}; op[454] = getOpcodeTls(a);}
        {char[] a = {53}; op[455] = getOpcodeTls(a);}
        op[456] = getOpcodeRnm(1, 3); // DIGIT
        {char[] a = {54,48}; op[457] = getOpcodeTls(a);}
        {int[] a = {459,463,468,469}; op[458] = getOpcodeAlt(a);}
        {int[] a = {460,462}; op[459] = getOpcodeCat(a);}
        op[460] = getOpcodeRep((char)0, (char)1, 461);
        {char[] a = {48}; op[461] = getOpcodeTls(a);}
        op[462] = getOpcodeRnm(74, 420); // oneToNine
        {int[] a = {464,467}; op[463] = getOpcodeCat(a);}
        {int[] a = {465,466}; op[464] = getOpcodeAlt(a);}
        {char[] a = {49}; op[465] = getOpcodeTls(a);}
        {char[] a = {50}; op[466] = getOpcodeTls(a);}
        op[467] = getOpcodeRnm(1, 3); // DIGIT
        {char[] a = {51,48}; op[468] = getOpcodeTls(a);}
        {char[] a = {51,49}; op[469] = getOpcodeTls(a);}
        {int[] a = {471,475,478}; op[470] = getOpcodeAlt(a);}
        {int[] a = {472,474}; op[471] = getOpcodeCat(a);}
        op[472] = getOpcodeRep((char)0, (char)1, 473);
        {char[] a = {48}; op[473] = getOpcodeTls(a);}
        op[474] = getOpcodeRnm(74, 420); // oneToNine
        {int[] a = {476,477}; op[475] = getOpcodeCat(a);}
        {char[] a = {49}; op[476] = getOpcodeTls(a);}
        op[477] = getOpcodeRnm(1, 3); // DIGIT
        {int[] a = {479,480}; op[478] = getOpcodeCat(a);}
        {char[] a = {50}; op[479] = getOpcodeTls(a);}
        {int[] a = {481,482,483,484}; op[480] = getOpcodeAlt(a);}
        {char[] a = {49}; op[481] = getOpcodeTls(a);}
        {char[] a = {50}; op[482] = getOpcodeTls(a);}
        {char[] a = {51}; op[483] = getOpcodeTls(a);}
        {char[] a = {52}; op[484] = getOpcodeTls(a);}
        op[485] = getOpcodeRnm(75, 430); // zeroToTwelve
        op[486] = getOpcodeRnm(78, 458); // zeroToThirtyOne
        op[487] = getOpcodeRnm(79, 470); // zeroToTwentyFour
        op[488] = getOpcodeRnm(77, 444); // zeroToSixty
        op[489] = getOpcodeRnm(77, 444); // zeroToSixty
        op[490] = getOpcodeRep((char)1, (char)7, 491);
        op[491] = getOpcodeRnm(1, 3); // DIGIT
        {int[] a = {493,494}; op[492] = getOpcodeCat(a);}
        op[493] = getOpcodeRnm(87, 496); // identifierLeadingCharacter
        op[494] = getOpcodeRep((char)0, (char)478, 495);
        op[495] = getOpcodeRnm(88, 499); // identifierCharacter
        {int[] a = {497,498}; op[496] = getOpcodeAlt(a);}
        op[497] = getOpcodeRnm(0, 0); // ALPHA
        {char[] a = {95}; op[498] = getOpcodeTls(a);}
        {int[] a = {500,501,502}; op[499] = getOpcodeAlt(a);}
        op[500] = getOpcodeRnm(0, 0); // ALPHA
        op[501] = getOpcodeRnm(1, 3); // DIGIT
        {char[] a = {95}; op[502] = getOpcodeTls(a);}
        op[503] = getOpcodeRnm(86, 492); // odataIdentifier
        {int[] a = {505,506}; op[504] = getOpcodeCat(a);}
        op[505] = getOpcodeRnm(89, 503); // namespacePart
        op[506] = getOpcodeRep((char)0, Character.MAX_VALUE, 507);
        {int[] a = {508,509}; op[507] = getOpcodeCat(a);}
        {char[] a = {46}; op[508] = getOpcodeTls(a);}
        op[509] = getOpcodeRnm(89, 503); // namespacePart
        op[510] = getOpcodeRnm(86, 492); // odataIdentifier
        op[511] = getOpcodeRnm(86, 492); // odataIdentifier
        op[512] = getOpcodeRnm(86, 492); // odataIdentifier
        {int[] a = {514,518,519}; op[513] = getOpcodeCat(a);}
        op[514] = getOpcodeRep((char)0, (char)1, 515);
        {int[] a = {516,517}; op[515] = getOpcodeCat(a);}
        op[516] = getOpcodeRnm(90, 504); // namespace
        {char[] a = {46}; op[517] = getOpcodeTls(a);}
        op[518] = getOpcodeRnm(109, 596); // entityContainerName
        {char[] a = {46}; op[519] = getOpcodeTls(a);}
        {int[] a = {521,522}; op[520] = getOpcodeCat(a);}
        op[521] = getOpcodeRnm(94, 513); // operationQualifier
        {char[] a = {42}; op[522] = getOpcodeTls(a);}
        {int[] a = {524,525,526,527}; op[523] = getOpcodeAlt(a);}
        op[524] = getOpcodeRnm(97, 534); // qualifiedEntityTypeName
        op[525] = getOpcodeRnm(98, 538); // qualifiedComplexTypeName
        op[526] = getOpcodeRnm(99, 542); // primitiveTypeName
        {int[] a = {528,529,533}; op[527] = getOpcodeCat(a);}
        {char[] a = {99,111,108,108,101,99,116,105,111,110,40}; op[528] = getOpcodeTls(a);}
        {int[] a = {530,531,532}; op[529] = getOpcodeAlt(a);}
        op[530] = getOpcodeRnm(97, 534); // qualifiedEntityTypeName
        op[531] = getOpcodeRnm(98, 538); // qualifiedComplexTypeName
        op[532] = getOpcodeRnm(99, 542); // primitiveTypeName
        {char[] a = {41}; op[533] = getOpcodeTls(a);}
        {int[] a = {535,536,537}; op[534] = getOpcodeCat(a);}
        op[535] = getOpcodeRnm(90, 504); // namespace
        {char[] a = {46}; op[536] = getOpcodeTls(a);}
        op[537] = getOpcodeRnm(92, 511); // entityTypeName
        {int[] a = {539,540,541}; op[538] = getOpcodeCat(a);}
        op[539] = getOpcodeRnm(90, 504); // namespace
        {char[] a = {46}; op[540] = getOpcodeTls(a);}
        op[541] = getOpcodeRnm(93, 512); // complexTypeName
        {int[] a = {543,545}; op[542] = getOpcodeCat(a);}
        op[543] = getOpcodeRep((char)0, (char)1, 544);
        {char[] a = {101,100,109,46}; op[544] = getOpcodeTls(a);}
        {int[] a = {546,547,548,549,550,551,552,553,554,555,556,557,558,559,560,561,562,563,564}; op[545] = getOpcodeAlt(a);}
        {char[] a = {98,105,110,97,114,121}; op[546] = getOpcodeTls(a);}
        {char[] a = {98,111,111,108,101,97,110}; op[547] = getOpcodeTls(a);}
        {char[] a = {98,121,116,101}; op[548] = getOpcodeTls(a);}
        {char[] a = {100,97,116,101,116,105,109,101}; op[549] = getOpcodeTls(a);}
        {char[] a = {100,101,99,105,109,97,108}; op[550] = getOpcodeTls(a);}
        {char[] a = {100,111,117,98,108,101}; op[551] = getOpcodeTls(a);}
        {char[] a = {115,105,110,103,108,101}; op[552] = getOpcodeTls(a);}
        {char[] a = {102,108,111,97,116}; op[553] = getOpcodeTls(a);}
        {char[] a = {103,117,105,100}; op[554] = getOpcodeTls(a);}
        {char[] a = {105,110,116,49,54}; op[555] = getOpcodeTls(a);}
        {char[] a = {105,110,116,51,50}; op[556] = getOpcodeTls(a);}
        {char[] a = {105,110,116,54,52}; op[557] = getOpcodeTls(a);}
        {char[] a = {115,98,121,116,101}; op[558] = getOpcodeTls(a);}
        {char[] a = {115,116,114,105,110,103}; op[559] = getOpcodeTls(a);}
        {char[] a = {116,105,109,101}; op[560] = getOpcodeTls(a);}
        {char[] a = {100,97,116,101,116,105,109,101,111,102,102,115,101,116}; op[561] = getOpcodeTls(a);}
        {char[] a = {115,116,114,101,97,109}; op[562] = getOpcodeTls(a);}
        op[563] = getOpcodeRnm(100, 565); // concreteSpatialTypeName
        op[564] = getOpcodeRnm(101, 580); // abstractSpatialTypeName
        {int[] a = {566,567,568,569,570,571,572,573,574,575,576,577,578,579}; op[565] = getOpcodeAlt(a);}
        {char[] a = {112,111,105,110,116}; op[566] = getOpcodeTls(a);}
        {char[] a = {108,105,110,101,115,116,114,105,110,103}; op[567] = getOpcodeTls(a);}
        {char[] a = {112,111,108,121,103,111,110}; op[568] = getOpcodeTls(a);}
        {char[] a = {103,101,111,103,114,97,112,104,121,99,111,108,108,101,99,116,105,111,110}; op[569] = getOpcodeTls(a);}
        {char[] a = {109,117,108,116,105,112,111,105,110,116}; op[570] = getOpcodeTls(a);}
        {char[] a = {109,117,108,116,105,108,105,110,101,100,116,114,105,110,103}; op[571] = getOpcodeTls(a);}
        {char[] a = {109,117,108,116,105,112,111,108,121,103,111,110}; op[572] = getOpcodeTls(a);}
        {char[] a = {103,101,111,109,101,116,114,105,99,112,111,105,110,116}; op[573] = getOpcodeTls(a);}
        {char[] a = {103,101,111,109,101,116,114,105,99,108,105,110,101,115,116,114,105,110,103}; op[574] = getOpcodeTls(a);}
        {char[] a = {103,101,111,109,101,116,114,105,99,112,111,108,121,103,111,110}; op[575] = getOpcodeTls(a);}
        {char[] a = {103,101,111,109,101,116,114,121,99,111,108,108,101,99,116,105,111,110}; op[576] = getOpcodeTls(a);}
        {char[] a = {103,101,111,109,101,116,114,105,99,109,117,108,116,105,112,111,105,110,116}; op[577] = getOpcodeTls(a);}
        {char[] a = {103,101,111,109,101,116,114,105,99,109,117,108,116,105,108,105,110,101,115,116,114,105,110,103}; op[578] = getOpcodeTls(a);}
        {char[] a = {103,101,111,109,101,116,114,105,99,109,117,108,116,105,112,111,108,121,103,111,110}; op[579] = getOpcodeTls(a);}
        {int[] a = {581,582}; op[580] = getOpcodeAlt(a);}
        {char[] a = {103,101,111,103,114,97,112,104,121}; op[581] = getOpcodeTls(a);}
        {char[] a = {103,101,111,109,101,116,114,121}; op[582] = getOpcodeTls(a);}
        op[583] = getOpcodeRnm(86, 492); // odataIdentifier
        op[584] = getOpcodeRnm(86, 492); // odataIdentifier
        op[585] = getOpcodeRnm(86, 492); // odataIdentifier
        op[586] = getOpcodeRnm(86, 492); // odataIdentifier
        op[587] = getOpcodeRnm(86, 492); // odataIdentifier
        op[588] = getOpcodeRnm(86, 492); // odataIdentifier
        {int[] a = {590,591,592,593,594,595}; op[589] = getOpcodeAlt(a);}
        op[590] = getOpcodeRnm(102, 583); // primitiveKeyProperty
        op[591] = getOpcodeRnm(103, 584); // primitiveNonKeyProperty
        op[592] = getOpcodeRnm(104, 585); // primitiveColProperty
        op[593] = getOpcodeRnm(105, 586); // complexProperty
        op[594] = getOpcodeRnm(106, 587); // complexColProperty
        op[595] = getOpcodeRnm(107, 588); // streamProperty
        op[596] = getOpcodeRnm(86, 492); // odataIdentifier
        {int[] a = {598,599,600,601,602,603}; op[597] = getOpcodeAlt(a);}
        op[598] = getOpcodeRnm(111, 604); // entityServiceOp
        op[599] = getOpcodeRnm(112, 605); // entityColServiceOp
        op[600] = getOpcodeRnm(113, 606); // complexServiceOp
        op[601] = getOpcodeRnm(114, 607); // complexColServiceOp
        op[602] = getOpcodeRnm(115, 608); // primitiveServiceOp
        op[603] = getOpcodeRnm(116, 609); // primitiveColServiceOp
        op[604] = getOpcodeRnm(86, 492); // odataIdentifier
        op[605] = getOpcodeRnm(86, 492); // odataIdentifier
        op[606] = getOpcodeRnm(86, 492); // odataIdentifier
        op[607] = getOpcodeRnm(86, 492); // odataIdentifier
        op[608] = getOpcodeRnm(86, 492); // odataIdentifier
        op[609] = getOpcodeRnm(86, 492); // odataIdentifier
        op[610] = getOpcodeRnm(86, 492); // odataIdentifier
        op[611] = getOpcodeRnm(86, 492); // odataIdentifier
        {int[] a = {613,614}; op[612] = getOpcodeAlt(a);}
        op[613] = getOpcodeRnm(117, 610); // entityNavigationProperty
        op[614] = getOpcodeRnm(118, 611); // entityColNavigationProperty
        op[615] = getOpcodeRnm(86, 492); // odataIdentifier
        op[616] = getOpcodeRnm(86, 492); // odataIdentifier
        op[617] = getOpcodeRnm(86, 492); // odataIdentifier
        op[618] = getOpcodeRnm(86, 492); // odataIdentifier
        op[619] = getOpcodeRnm(86, 492); // odataIdentifier
        op[620] = getOpcodeRnm(86, 492); // odataIdentifier
        {int[] a = {622,623,624,625,626,627}; op[621] = getOpcodeAlt(a);}
        op[622] = getOpcodeRnm(120, 615); // entityFunction
        op[623] = getOpcodeRnm(121, 616); // entityColFunction
        op[624] = getOpcodeRnm(122, 617); // complexFunction
        op[625] = getOpcodeRnm(123, 618); // complexColFunction
        op[626] = getOpcodeRnm(124, 619); // primitiveFunction
        op[627] = getOpcodeRnm(125, 620); // primitiveColFunction
        {int[] a = {629,631}; op[628] = getOpcodeCat(a);}
        op[629] = getOpcodeRep((char)0, (char)1, 630);
        op[630] = getOpcodeRnm(94, 513); // operationQualifier
        op[631] = getOpcodeRnm(120, 615); // entityFunction
        {int[] a = {633,635}; op[632] = getOpcodeCat(a);}
        op[633] = getOpcodeRep((char)0, (char)1, 634);
        op[634] = getOpcodeRnm(94, 513); // operationQualifier
        op[635] = getOpcodeRnm(121, 616); // entityColFunction
        {int[] a = {637,639}; op[636] = getOpcodeCat(a);}
        op[637] = getOpcodeRep((char)0, (char)1, 638);
        op[638] = getOpcodeRnm(94, 513); // operationQualifier
        op[639] = getOpcodeRnm(122, 617); // complexFunction
        {int[] a = {641,643}; op[640] = getOpcodeCat(a);}
        op[641] = getOpcodeRep((char)0, (char)1, 642);
        op[642] = getOpcodeRnm(94, 513); // operationQualifier
        op[643] = getOpcodeRnm(123, 618); // complexColFunction
        {int[] a = {645,647}; op[644] = getOpcodeCat(a);}
        op[645] = getOpcodeRep((char)0, (char)1, 646);
        op[646] = getOpcodeRnm(94, 513); // operationQualifier
        op[647] = getOpcodeRnm(124, 619); // primitiveFunction
        {int[] a = {649,651}; op[648] = getOpcodeCat(a);}
        op[649] = getOpcodeRep((char)0, (char)1, 650);
        op[650] = getOpcodeRnm(94, 513); // operationQualifier
        op[651] = getOpcodeRnm(125, 620); // primitiveColFunction
        {int[] a = {653,654,655,656,657,658}; op[652] = getOpcodeAlt(a);}
        op[653] = getOpcodeRnm(127, 628); // fullEntityFunction
        op[654] = getOpcodeRnm(128, 632); // fullEntityColFunction
        op[655] = getOpcodeRnm(129, 636); // fullComplexFunction
        op[656] = getOpcodeRnm(130, 640); // fullComplexColFunction
        op[657] = getOpcodeRnm(131, 644); // fullPrimitiveFunction
        op[658] = getOpcodeRnm(132, 648); // fullPrimitiveColFunction
        op[659] = getOpcodeRnm(86, 492); // odataIdentifier
        op[660] = getOpcodeRnm(86, 492); // odataIdentifier
        op[661] = getOpcodeRnm(86, 492); // odataIdentifier
        op[662] = getOpcodeRnm(86, 492); // odataIdentifier
        op[663] = getOpcodeRnm(86, 492); // odataIdentifier
        op[664] = getOpcodeRnm(86, 492); // odataIdentifier
        op[665] = getOpcodeRnm(86, 492); // odataIdentifier
        {int[] a = {667,668,669,670,671,672,673}; op[666] = getOpcodeAlt(a);}
        op[667] = getOpcodeRnm(134, 659); // entityAction
        op[668] = getOpcodeRnm(135, 660); // entityColAction
        op[669] = getOpcodeRnm(136, 661); // complexAction
        op[670] = getOpcodeRnm(137, 662); // complexColAction
        op[671] = getOpcodeRnm(138, 663); // primitiveAction
        op[672] = getOpcodeRnm(139, 664); // primitiveColAction
        op[673] = getOpcodeRnm(140, 665); // voidAction
        {int[] a = {675,677}; op[674] = getOpcodeCat(a);}
        op[675] = getOpcodeRep((char)0, (char)1, 676);
        op[676] = getOpcodeRnm(94, 513); // operationQualifier
        op[677] = getOpcodeRnm(141, 666); // action
        op[678] = getOpcodeRnm(142, 674); // fullAction
        {int[] a = {680,681}; op[679] = getOpcodeCat(a);}
        op[680] = getOpcodeRnm(142, 674); // fullAction
        op[681] = getOpcodeRep((char)0, (char)1, 682);
        {int[] a = {683,684,685}; op[682] = getOpcodeCat(a);}
        {char[] a = {40}; op[683] = getOpcodeTls(a);}
        op[684] = getOpcodeRnm(146, 693); // parameterTypeNames
        {char[] a = {41}; op[685] = getOpcodeTls(a);}
        {int[] a = {687,688}; op[686] = getOpcodeCat(a);}
        op[687] = getOpcodeRnm(133, 652); // fullFunction
        op[688] = getOpcodeRep((char)0, (char)1, 689);
        {int[] a = {690,691,692}; op[689] = getOpcodeCat(a);}
        {char[] a = {40}; op[690] = getOpcodeTls(a);}
        op[691] = getOpcodeRnm(146, 693); // parameterTypeNames
        {char[] a = {41}; op[692] = getOpcodeTls(a);}
        op[693] = getOpcodeRep((char)0, (char)1, 694);
        {int[] a = {695,696}; op[694] = getOpcodeCat(a);}
        op[695] = getOpcodeRnm(147, 700); // parameterTypeName
        op[696] = getOpcodeRep((char)0, Character.MAX_VALUE, 697);
        {int[] a = {698,699}; op[697] = getOpcodeCat(a);}
        {char[] a = {44}; op[698] = getOpcodeTls(a);}
        op[699] = getOpcodeRnm(147, 700); // parameterTypeName
        op[700] = getOpcodeRnm(96, 523); // qualifiedTypeName
        {int[] a = {702,703,704,705,706,707,708,709,710,711,712,713,714,715,716,717,718,719,720,721,722,723,724,725,726,727,728,729,730,731,732,733}; op[701] = getOpcodeAlt(a);}
        op[702] = getOpcodeRnm(149, 734); // null
        op[703] = getOpcodeRnm(157, 805); // decimal
        op[704] = getOpcodeRnm(180, 910); // single
        op[705] = getOpcodeRnm(158, 817); // double
        op[706] = getOpcodeRnm(179, 905); // sbyte
        op[707] = getOpcodeRnm(152, 757); // byte
        op[708] = getOpcodeRnm(176, 887); // int16
        op[709] = getOpcodeRnm(177, 892); // int32
        op[710] = getOpcodeRnm(178, 897); // int64
        op[711] = getOpcodeRnm(150, 741); // binary
        op[712] = getOpcodeRnm(153, 759); // dateTime
        op[713] = getOpcodeRnm(154, 764); // dateTimeOffset
        op[714] = getOpcodeRnm(175, 869); // guid
        op[715] = getOpcodeRnm(181, 946); // string
        op[716] = getOpcodeRnm(183, 957); // time
        op[717] = getOpcodeRnm(151, 750); // boolean
        op[718] = getOpcodeRnm(159, 853); // geography
        op[719] = getOpcodeRnm(160, 854); // geographyCollection
        op[720] = getOpcodeRnm(161, 855); // geographyLineString
        op[721] = getOpcodeRnm(162, 856); // geographyMultiLineString
        op[722] = getOpcodeRnm(163, 857); // geographyMultiPoint
        op[723] = getOpcodeRnm(164, 858); // geographyMultiPolygon
        op[724] = getOpcodeRnm(165, 859); // geographyPoint
        op[725] = getOpcodeRnm(166, 860); // geographyPolygon
        op[726] = getOpcodeRnm(167, 861); // geometry
        op[727] = getOpcodeRnm(168, 862); // geometryCollection
        op[728] = getOpcodeRnm(169, 863); // geometryLineString
        op[729] = getOpcodeRnm(170, 864); // geometryMultiLineString
        op[730] = getOpcodeRnm(171, 865); // geometryMultiPoint
        op[731] = getOpcodeRnm(172, 866); // geometryMultiPolygon
        op[732] = getOpcodeRnm(173, 867); // geometryPoint
        op[733] = getOpcodeRnm(174, 868); // geometryPolygon
        {int[] a = {735,736}; op[734] = getOpcodeCat(a);}
        {char[] a = {110,117,108,108}; op[735] = getOpcodeTls(a);}
        op[736] = getOpcodeRep((char)0, (char)1, 737);
        {int[] a = {738,739,740}; op[737] = getOpcodeCat(a);}
        {char[] a = {39}; op[738] = getOpcodeTls(a);}
        op[739] = getOpcodeRnm(96, 523); // qualifiedTypeName
        {char[] a = {39}; op[740] = getOpcodeTls(a);}
        {int[] a = {742,745,746,749}; op[741] = getOpcodeCat(a);}
        {int[] a = {743,744}; op[742] = getOpcodeAlt(a);}
        {char[] a = {88}; op[743] = getOpcodeTbs(a);}
        {char[] a = {98,105,110,97,114,121}; op[744] = getOpcodeTls(a);}
        op[745] = getOpcodeRnm(59, 399); // SQUOTE
        op[746] = getOpcodeRep((char)0, Character.MAX_VALUE, 747);
        op[747] = getOpcodeRep((char)2, (char)2, 748);
        op[748] = getOpcodeRnm(2, 4); // HEXDIG
        op[749] = getOpcodeRnm(59, 399); // SQUOTE
        {int[] a = {751,754}; op[750] = getOpcodeAlt(a);}
        {int[] a = {752,753}; op[751] = getOpcodeAlt(a);}
        {char[] a = {116,114,117,101}; op[752] = getOpcodeTls(a);}
        {char[] a = {49}; op[753] = getOpcodeTls(a);}
        {int[] a = {755,756}; op[754] = getOpcodeAlt(a);}
        {char[] a = {102,97,108,115,101}; op[755] = getOpcodeTls(a);}
        {char[] a = {48}; op[756] = getOpcodeTls(a);}
        op[757] = getOpcodeRep((char)1, (char)3, 758);
        op[758] = getOpcodeRnm(1, 3); // DIGIT
        {int[] a = {760,761,762,763}; op[759] = getOpcodeCat(a);}
        {char[] a = {100,97,116,101,116,105,109,101}; op[760] = getOpcodeTls(a);}
        op[761] = getOpcodeRnm(59, 399); // SQUOTE
        op[762] = getOpcodeRnm(155, 769); // dateTimeBody
        op[763] = getOpcodeRnm(59, 399); // SQUOTE
        {int[] a = {765,766,767,768}; op[764] = getOpcodeCat(a);}
        {char[] a = {100,97,116,101,116,105,109,101,111,102,102,115,101,116}; op[765] = getOpcodeTls(a);}
        op[766] = getOpcodeRnm(59, 399); // SQUOTE
        op[767] = getOpcodeRnm(156, 787); // dateTimeOffsetBody
        op[768] = getOpcodeRnm(59, 399); // SQUOTE
        {int[] a = {770,771,772,773,774,775,776,777,778,779}; op[769] = getOpcodeCat(a);}
        op[770] = getOpcodeRnm(73, 418); // year
        {char[] a = {45}; op[771] = getOpcodeTls(a);}
        op[772] = getOpcodeRnm(80, 485); // month
        {char[] a = {45}; op[773] = getOpcodeTls(a);}
        op[774] = getOpcodeRnm(81, 486); // day
        {char[] a = {84}; op[775] = getOpcodeTls(a);}
        op[776] = getOpcodeRnm(82, 487); // hour
        {char[] a = {58}; op[777] = getOpcodeTls(a);}
        op[778] = getOpcodeRnm(83, 488); // minute
        op[779] = getOpcodeRep((char)0, (char)1, 780);
        {int[] a = {781,782,783}; op[780] = getOpcodeCat(a);}
        {char[] a = {58}; op[781] = getOpcodeTls(a);}
        op[782] = getOpcodeRnm(84, 489); // second
        op[783] = getOpcodeRep((char)0, (char)1, 784);
        {int[] a = {785,786}; op[784] = getOpcodeCat(a);}
        {char[] a = {46}; op[785] = getOpcodeTls(a);}
        op[786] = getOpcodeRnm(85, 490); // nanoSeconds
        {int[] a = {788,791,797}; op[787] = getOpcodeAlt(a);}
        {int[] a = {789,790}; op[788] = getOpcodeCat(a);}
        op[789] = getOpcodeRnm(155, 769); // dateTimeBody
        {char[] a = {90}; op[790] = getOpcodeTls(a);}
        {int[] a = {792,793,794,795}; op[791] = getOpcodeCat(a);}
        op[792] = getOpcodeRnm(155, 769); // dateTimeBody
        op[793] = getOpcodeRnm(63, 403); // sign
        op[794] = getOpcodeRnm(76, 441); // zeroToThirteen
        op[795] = getOpcodeRep((char)0, (char)1, 796);
        {char[] a = {58,48,48}; op[796] = getOpcodeTls(a);}
        {int[] a = {798,799,800,801}; op[797] = getOpcodeCat(a);}
        op[798] = getOpcodeRnm(155, 769); // dateTimeBody
        op[799] = getOpcodeRnm(63, 403); // sign
        op[800] = getOpcodeRnm(75, 430); // zeroToTwelve
        op[801] = getOpcodeRep((char)0, (char)1, 802);
        {int[] a = {803,804}; op[802] = getOpcodeCat(a);}
        {char[] a = {58}; op[803] = getOpcodeTls(a);}
        op[804] = getOpcodeRnm(77, 444); // zeroToSixty
        {int[] a = {806,807,809,814}; op[805] = getOpcodeCat(a);}
        op[806] = getOpcodeRnm(63, 403); // sign
        op[807] = getOpcodeRep((char)1, (char)29, 808);
        op[808] = getOpcodeRnm(1, 3); // DIGIT
        op[809] = getOpcodeRep((char)0, (char)1, 810);
        {int[] a = {811,812}; op[810] = getOpcodeCat(a);}
        {char[] a = {46}; op[811] = getOpcodeTls(a);}
        op[812] = getOpcodeRep((char)1, (char)29, 813);
        op[813] = getOpcodeRnm(1, 3); // DIGIT
        {int[] a = {815,816}; op[814] = getOpcodeAlt(a);}
        {char[] a = {77}; op[815] = getOpcodeTls(a);}
        {char[] a = {109}; op[816] = getOpcodeTls(a);}
        {int[] a = {818,847}; op[817] = getOpcodeAlt(a);}
        {int[] a = {819,844}; op[818] = getOpcodeCat(a);}
        {int[] a = {820,824,831}; op[819] = getOpcodeAlt(a);}
        {int[] a = {821,822}; op[820] = getOpcodeCat(a);}
        op[821] = getOpcodeRnm(63, 403); // sign
        op[822] = getOpcodeRep((char)1, (char)17, 823);
        op[823] = getOpcodeRnm(1, 3); // DIGIT
        {int[] a = {825,826,828,829}; op[824] = getOpcodeCat(a);}
        op[825] = getOpcodeRnm(63, 403); // sign
        op[826] = getOpcodeRep((char)0, Character.MAX_VALUE, 827);
        op[827] = getOpcodeRnm(1, 3); // DIGIT
        {char[] a = {46}; op[828] = getOpcodeTls(a);}
        op[829] = getOpcodeRep((char)0, Character.MAX_VALUE, 830);
        op[830] = getOpcodeRnm(1, 3); // DIGIT
        {int[] a = {832,833,835,836,838,841,842}; op[831] = getOpcodeCat(a);}
        op[832] = getOpcodeRnm(63, 403); // sign
        op[833] = getOpcodeRep((char)1, Character.MAX_VALUE, 834);
        op[834] = getOpcodeRnm(1, 3); // DIGIT
        {char[] a = {46}; op[835] = getOpcodeTls(a);}
        op[836] = getOpcodeRep((char)16, Character.MAX_VALUE, 837);
        op[837] = getOpcodeRnm(1, 3); // DIGIT
        {int[] a = {839,840}; op[838] = getOpcodeAlt(a);}
        {char[] a = {101}; op[839] = getOpcodeTls(a);}
        {char[] a = {69}; op[840] = getOpcodeTls(a);}
        op[841] = getOpcodeRnm(63, 403); // sign
        op[842] = getOpcodeRep((char)1, (char)3, 843);
        op[843] = getOpcodeRnm(1, 3); // DIGIT
        {int[] a = {845,846}; op[844] = getOpcodeAlt(a);}
        {char[] a = {68}; op[845] = getOpcodeTls(a);}
        {char[] a = {100}; op[846] = getOpcodeTls(a);}
        {int[] a = {848,849}; op[847] = getOpcodeCat(a);}
        op[848] = getOpcodeRnm(72, 414); // nanInfinity
        op[849] = getOpcodeRep((char)0, (char)1, 850);
        {int[] a = {851,852}; op[850] = getOpcodeAlt(a);}
        {char[] a = {68}; op[851] = getOpcodeTls(a);}
        {char[] a = {100}; op[852] = getOpcodeTls(a);}
        {char[] a = {123,84,79,68,79,49,125}; op[853] = getOpcodeTls(a);}
        {char[] a = {123,84,79,68,79,50,125}; op[854] = getOpcodeTls(a);}
        {char[] a = {123,84,79,68,79,51,125}; op[855] = getOpcodeTls(a);}
        {char[] a = {123,84,79,68,79,52,125}; op[856] = getOpcodeTls(a);}
        {char[] a = {123,84,79,68,79,53,125}; op[857] = getOpcodeTls(a);}
        {char[] a = {123,84,79,68,79,54,125}; op[858] = getOpcodeTls(a);}
        {char[] a = {123,84,79,68,79,55,125}; op[859] = getOpcodeTls(a);}
        {char[] a = {123,84,79,68,79,56,125}; op[860] = getOpcodeTls(a);}
        {char[] a = {123,84,79,68,79,57,125}; op[861] = getOpcodeTls(a);}
        {char[] a = {123,84,79,68,79,49,48,125}; op[862] = getOpcodeTls(a);}
        {char[] a = {123,84,79,68,79,49,49,125}; op[863] = getOpcodeTls(a);}
        {char[] a = {123,84,79,68,79,49,50,125}; op[864] = getOpcodeTls(a);}
        {char[] a = {123,84,79,68,79,49,51,125}; op[865] = getOpcodeTls(a);}
        {char[] a = {123,84,79,68,79,49,52,125}; op[866] = getOpcodeTls(a);}
        {char[] a = {123,84,79,68,79,49,53,125}; op[867] = getOpcodeTls(a);}
        {char[] a = {123,84,79,68,79,49,54,125}; op[868] = getOpcodeTls(a);}
        {int[] a = {870,871,872,874,875,877,878,880,881,883,884,886}; op[869] = getOpcodeCat(a);}
        {char[] a = {103,117,105,100}; op[870] = getOpcodeTls(a);}
        op[871] = getOpcodeRnm(59, 399); // SQUOTE
        op[872] = getOpcodeRep((char)8, (char)8, 873);
        op[873] = getOpcodeRnm(2, 4); // HEXDIG
        {char[] a = {45}; op[874] = getOpcodeTls(a);}
        op[875] = getOpcodeRep((char)4, (char)4, 876);
        op[876] = getOpcodeRnm(2, 4); // HEXDIG
        {char[] a = {45}; op[877] = getOpcodeTls(a);}
        op[878] = getOpcodeRep((char)4, (char)4, 879);
        op[879] = getOpcodeRnm(2, 4); // HEXDIG
        {char[] a = {45}; op[880] = getOpcodeTls(a);}
        op[881] = getOpcodeRep((char)4, (char)4, 882);
        op[882] = getOpcodeRnm(2, 4); // HEXDIG
        {char[] a = {45}; op[883] = getOpcodeTls(a);}
        op[884] = getOpcodeRep((char)12, (char)12, 885);
        op[885] = getOpcodeRnm(2, 4); // HEXDIG
        op[886] = getOpcodeRnm(59, 399); // SQUOTE
        {int[] a = {888,890}; op[887] = getOpcodeCat(a);}
        op[888] = getOpcodeRep((char)0, (char)1, 889);
        op[889] = getOpcodeRnm(63, 403); // sign
        op[890] = getOpcodeRep((char)1, (char)5, 891);
        op[891] = getOpcodeRnm(1, 3); // DIGIT
        {int[] a = {893,895}; op[892] = getOpcodeCat(a);}
        op[893] = getOpcodeRep((char)0, (char)1, 894);
        op[894] = getOpcodeRnm(63, 403); // sign
        op[895] = getOpcodeRep((char)1, (char)10, 896);
        op[896] = getOpcodeRnm(1, 3); // DIGIT
        {int[] a = {898,900,902}; op[897] = getOpcodeCat(a);}
        op[898] = getOpcodeRep((char)0, (char)1, 899);
        op[899] = getOpcodeRnm(63, 403); // sign
        op[900] = getOpcodeRep((char)1, (char)19, 901);
        op[901] = getOpcodeRnm(1, 3); // DIGIT
        {int[] a = {903,904}; op[902] = getOpcodeAlt(a);}
        {char[] a = {76}; op[903] = getOpcodeTls(a);}
        {char[] a = {108}; op[904] = getOpcodeTls(a);}
        {int[] a = {906,908}; op[905] = getOpcodeCat(a);}
        op[906] = getOpcodeRep((char)0, (char)1, 907);
        op[907] = getOpcodeRnm(63, 403); // sign
        op[908] = getOpcodeRep((char)1, (char)3, 909);
        op[909] = getOpcodeRnm(1, 3); // DIGIT
        {int[] a = {911,940}; op[910] = getOpcodeAlt(a);}
        {int[] a = {912,937}; op[911] = getOpcodeCat(a);}
        {int[] a = {913,917,924}; op[912] = getOpcodeAlt(a);}
        {int[] a = {914,915}; op[913] = getOpcodeCat(a);}
        op[914] = getOpcodeRnm(63, 403); // sign
        op[915] = getOpcodeRep((char)1, (char)8, 916);
        op[916] = getOpcodeRnm(1, 3); // DIGIT
        {int[] a = {918,919,921,922}; op[917] = getOpcodeCat(a);}
        op[918] = getOpcodeRnm(63, 403); // sign
        op[919] = getOpcodeRep((char)0, Character.MAX_VALUE, 920);
        op[920] = getOpcodeRnm(1, 3); // DIGIT
        {char[] a = {46}; op[921] = getOpcodeTls(a);}
        op[922] = getOpcodeRep((char)0, Character.MAX_VALUE, 923);
        op[923] = getOpcodeRnm(1, 3); // DIGIT
        {int[] a = {925,926,928,929,931,934,935}; op[924] = getOpcodeCat(a);}
        op[925] = getOpcodeRnm(63, 403); // sign
        op[926] = getOpcodeRep((char)1, Character.MAX_VALUE, 927);
        op[927] = getOpcodeRnm(1, 3); // DIGIT
        {char[] a = {46}; op[928] = getOpcodeTls(a);}
        op[929] = getOpcodeRep((char)8, Character.MAX_VALUE, 930);
        op[930] = getOpcodeRnm(1, 3); // DIGIT
        {int[] a = {932,933}; op[931] = getOpcodeAlt(a);}
        {char[] a = {101}; op[932] = getOpcodeTls(a);}
        {char[] a = {69}; op[933] = getOpcodeTls(a);}
        op[934] = getOpcodeRnm(63, 403); // sign
        op[935] = getOpcodeRep((char)1, (char)2, 936);
        op[936] = getOpcodeRnm(1, 3); // DIGIT
        {int[] a = {938,939}; op[937] = getOpcodeAlt(a);}
        {char[] a = {70}; op[938] = getOpcodeTls(a);}
        {char[] a = {102}; op[939] = getOpcodeTls(a);}
        {int[] a = {941,942}; op[940] = getOpcodeCat(a);}
        op[941] = getOpcodeRnm(72, 414); // nanInfinity
        op[942] = getOpcodeRep((char)0, (char)1, 943);
        {int[] a = {944,945}; op[943] = getOpcodeAlt(a);}
        {char[] a = {70}; op[944] = getOpcodeTls(a);}
        {char[] a = {102}; op[945] = getOpcodeTls(a);}
        {int[] a = {947,948,953}; op[946] = getOpcodeCat(a);}
        op[947] = getOpcodeRnm(59, 399); // SQUOTE
        op[948] = getOpcodeRep((char)0, Character.MAX_VALUE, 949);
        {int[] a = {950,951,952}; op[949] = getOpcodeAlt(a);}
        op[950] = getOpcodeRnm(48, 325); // unreserved
        op[951] = getOpcodeRnm(47, 321); // pct-encoded
        op[952] = getOpcodeRnm(182, 954); // SQUOTE-in-string
        op[953] = getOpcodeRnm(59, 399); // SQUOTE
        {int[] a = {955,956}; op[954] = getOpcodeCat(a);}
        op[955] = getOpcodeRnm(59, 399); // SQUOTE
        op[956] = getOpcodeRnm(59, 399); // SQUOTE
        {int[] a = {958,959,960,962,963,968,973,978,1001}; op[957] = getOpcodeCat(a);}
        {char[] a = {116,105,109,101}; op[958] = getOpcodeTls(a);}
        op[959] = getOpcodeRnm(59, 399); // SQUOTE
        op[960] = getOpcodeRep((char)0, (char)1, 961);
        op[961] = getOpcodeRnm(63, 403); // sign
        {char[] a = {80}; op[962] = getOpcodeTls(a);}
        op[963] = getOpcodeRep((char)0, (char)1, 964);
        {int[] a = {965,967}; op[964] = getOpcodeCat(a);}
        op[965] = getOpcodeRep((char)1, Character.MAX_VALUE, 966);
        op[966] = getOpcodeRnm(1, 3); // DIGIT
        {char[] a = {89}; op[967] = getOpcodeTls(a);}
        op[968] = getOpcodeRep((char)0, (char)1, 969);
        {int[] a = {970,972}; op[969] = getOpcodeCat(a);}
        op[970] = getOpcodeRep((char)1, Character.MAX_VALUE, 971);
        op[971] = getOpcodeRnm(1, 3); // DIGIT
        {char[] a = {77}; op[972] = getOpcodeTls(a);}
        op[973] = getOpcodeRep((char)0, (char)1, 974);
        {int[] a = {975,977}; op[974] = getOpcodeCat(a);}
        op[975] = getOpcodeRep((char)1, Character.MAX_VALUE, 976);
        op[976] = getOpcodeRnm(1, 3); // DIGIT
        {char[] a = {68}; op[977] = getOpcodeTls(a);}
        op[978] = getOpcodeRep((char)0, (char)1, 979);
        {int[] a = {980,981,986,991}; op[979] = getOpcodeCat(a);}
        {char[] a = {84}; op[980] = getOpcodeTls(a);}
        op[981] = getOpcodeRep((char)0, (char)1, 982);
        {int[] a = {983,985}; op[982] = getOpcodeCat(a);}
        op[983] = getOpcodeRep((char)1, Character.MAX_VALUE, 984);
        op[984] = getOpcodeRnm(1, 3); // DIGIT
        {char[] a = {72}; op[985] = getOpcodeTls(a);}
        op[986] = getOpcodeRep((char)0, (char)1, 987);
        {int[] a = {988,990}; op[987] = getOpcodeCat(a);}
        op[988] = getOpcodeRep((char)1, Character.MAX_VALUE, 989);
        op[989] = getOpcodeRnm(1, 3); // DIGIT
        {char[] a = {77}; op[990] = getOpcodeTls(a);}
        op[991] = getOpcodeRep((char)0, (char)1, 992);
        {int[] a = {993,995,1000}; op[992] = getOpcodeCat(a);}
        op[993] = getOpcodeRep((char)1, Character.MAX_VALUE, 994);
        op[994] = getOpcodeRnm(1, 3); // DIGIT
        op[995] = getOpcodeRep((char)0, (char)1, 996);
        {int[] a = {997,998}; op[996] = getOpcodeCat(a);}
        {char[] a = {46}; op[997] = getOpcodeTls(a);}
        op[998] = getOpcodeRep((char)1, Character.MAX_VALUE, 999);
        op[999] = getOpcodeRnm(1, 3); // DIGIT
        {char[] a = {83}; op[1000] = getOpcodeTls(a);}
        op[1001] = getOpcodeRnm(59, 399); // SQUOTE
        {int[] a = {1003,1004,1005,1006,1010,1011}; op[1002] = getOpcodeCat(a);}
        op[1003] = getOpcodeRnm(22, 87); // scheme
        {char[] a = {58,47,47}; op[1004] = getOpcodeTls(a);}
        op[1005] = getOpcodeRnm(25, 112); // host
        op[1006] = getOpcodeRep((char)0, (char)1, 1007);
        {int[] a = {1008,1009}; op[1007] = getOpcodeCat(a);}
        {char[] a = {58}; op[1008] = getOpcodeTls(a);}
        op[1009] = getOpcodeRnm(26, 116); // port
        op[1010] = getOpcodeRnm(185, 1016); // serviceRoot
        op[1011] = getOpcodeRep((char)0, (char)1, 1012);
        {int[] a = {1013,1014,1015}; op[1012] = getOpcodeAlt(a);}
        {char[] a = {36,109,101,116,97,100,97,116,97}; op[1013] = getOpcodeTls(a);}
        {char[] a = {36,98,97,116,99,104}; op[1014] = getOpcodeTls(a);}
        op[1015] = getOpcodeRnm(186, 1022); // odataRelativeUri
        {int[] a = {1017,1018}; op[1016] = getOpcodeCat(a);}
        {char[] a = {47}; op[1017] = getOpcodeTls(a);}
        op[1018] = getOpcodeRep((char)0, Character.MAX_VALUE, 1019);
        {int[] a = {1020,1021}; op[1019] = getOpcodeCat(a);}
        op[1020] = getOpcodeRnm(42, 297); // segment-nz
        {char[] a = {47}; op[1021] = getOpcodeTls(a);}
        {int[] a = {1023,1024}; op[1022] = getOpcodeCat(a);}
        op[1023] = getOpcodeRnm(208, 1220); // resourcePath
        op[1024] = getOpcodeRep((char)0, (char)1, 1025);
        {int[] a = {1026,1027}; op[1025] = getOpcodeCat(a);}
        {char[] a = {63}; op[1026] = getOpcodeTls(a);}
        op[1027] = getOpcodeRnm(187, 1028); // queryOptions
        {int[] a = {1029,1030}; op[1028] = getOpcodeCat(a);}
        op[1029] = getOpcodeRnm(188, 1034); // queryOption
        op[1030] = getOpcodeRep((char)0, Character.MAX_VALUE, 1031);
        {int[] a = {1032,1033}; op[1031] = getOpcodeCat(a);}
        {char[] a = {38}; op[1032] = getOpcodeTls(a);}
        op[1033] = getOpcodeRnm(188, 1034); // queryOption
        {int[] a = {1035,1036,1037,1038,1039}; op[1034] = getOpcodeAlt(a);}
        op[1035] = getOpcodeRnm(189, 1040); // systemQueryOption
        op[1036] = getOpcodeRnm(205, 1165); // customQueryOption
        op[1037] = getOpcodeRnm(269, 1670); // sopParameterNameAndValue
        op[1038] = getOpcodeRnm(243, 1521); // aliasAndValue
        op[1039] = getOpcodeRnm(349, 2444); // parameterNameAndValue
        {int[] a = {1041,1042,1043,1044,1045,1046,1047,1048,1049}; op[1040] = getOpcodeAlt(a);}
        op[1041] = getOpcodeRnm(190, 1050); // expand
        op[1042] = getOpcodeRnm(194, 1074); // filter
        op[1043] = getOpcodeRnm(195, 1082); // orderby
        op[1044] = getOpcodeRnm(197, 1111); // skip
        op[1045] = getOpcodeRnm(198, 1115); // top
        op[1046] = getOpcodeRnm(199, 1119); // format
        op[1047] = getOpcodeRnm(200, 1129); // inlinecount
        op[1048] = getOpcodeRnm(201, 1134); // select
        op[1049] = getOpcodeRnm(204, 1161); // skiptoken
        {int[] a = {1051,1052}; op[1050] = getOpcodeCat(a);}
        {char[] a = {36,101,120,112,97,110,100,61}; op[1051] = getOpcodeTls(a);}
        op[1052] = getOpcodeRnm(191, 1053); // expandClause
        {int[] a = {1054,1055}; op[1053] = getOpcodeCat(a);}
        op[1054] = getOpcodeRnm(192, 1059); // expandItem
        op[1055] = getOpcodeRep((char)0, Character.MAX_VALUE, 1056);
        {int[] a = {1057,1058}; op[1056] = getOpcodeCat(a);}
        {char[] a = {44}; op[1057] = getOpcodeTls(a);}
        op[1058] = getOpcodeRnm(192, 1059); // expandItem
        {int[] a = {1060,1064,1065}; op[1059] = getOpcodeCat(a);}
        op[1060] = getOpcodeRep((char)0, (char)1, 1061);
        {int[] a = {1062,1063}; op[1061] = getOpcodeCat(a);}
        op[1062] = getOpcodeRnm(97, 534); // qualifiedEntityTypeName
        {char[] a = {47}; op[1063] = getOpcodeTls(a);}
        op[1064] = getOpcodeRnm(119, 612); // navigationProperty
        op[1065] = getOpcodeRep((char)0, Character.MAX_VALUE, 1066);
        {int[] a = {1067,1071,1072}; op[1066] = getOpcodeCat(a);}
        op[1067] = getOpcodeRep((char)0, (char)1, 1068);
        {int[] a = {1069,1070}; op[1068] = getOpcodeCat(a);}
        {char[] a = {47}; op[1069] = getOpcodeTls(a);}
        op[1070] = getOpcodeRnm(97, 534); // qualifiedEntityTypeName
        {char[] a = {47}; op[1071] = getOpcodeTls(a);}
        op[1072] = getOpcodeRnm(119, 612); // navigationProperty
        {char[] a = {47,36,99,111,117,110,116}; op[1073] = getOpcodeTls(a);}
        {int[] a = {1075,1076,1078,1079,1081}; op[1074] = getOpcodeCat(a);}
        {char[] a = {36,102,105,108,116,101,114}; op[1075] = getOpcodeTls(a);}
        op[1076] = getOpcodeRep((char)0, (char)1, 1077);
        op[1077] = getOpcodeRnm(6, 15); // WSP
        {char[] a = {61}; op[1078] = getOpcodeTls(a);}
        op[1079] = getOpcodeRep((char)0, (char)1, 1080);
        op[1080] = getOpcodeRnm(6, 15); // WSP
        op[1081] = getOpcodeRnm(271, 1694); // boolCommonExpr
        {int[] a = {1083,1084,1086,1087,1089,1090,1092,1096}; op[1082] = getOpcodeCat(a);}
        {char[] a = {36,111,114,100,101,114,98,121}; op[1083] = getOpcodeTls(a);}
        op[1084] = getOpcodeRep((char)0, (char)1, 1085);
        op[1085] = getOpcodeRnm(6, 15); // WSP
        {char[] a = {61}; op[1086] = getOpcodeTls(a);}
        op[1087] = getOpcodeRep((char)0, (char)1, 1088);
        op[1088] = getOpcodeRnm(6, 15); // WSP
        op[1089] = getOpcodeRnm(196, 1108); // orderExpr
        op[1090] = getOpcodeRep((char)0, (char)1, 1091);
        op[1091] = getOpcodeRnm(6, 15); // WSP
        op[1092] = getOpcodeRep((char)0, (char)1, 1093);
        {int[] a = {1094,1095}; op[1093] = getOpcodeAlt(a);}
        {char[] a = {97,115,99}; op[1094] = getOpcodeTls(a);}
        {char[] a = {100,101,115,99}; op[1095] = getOpcodeTls(a);}
        op[1096] = getOpcodeRep((char)0, Character.MAX_VALUE, 1097);
        {int[] a = {1098,1099,1101,1102,1104}; op[1097] = getOpcodeCat(a);}
        op[1098] = getOpcodeRnm(62, 402); // COMMA
        op[1099] = getOpcodeRep((char)0, (char)1, 1100);
        op[1100] = getOpcodeRnm(6, 15); // WSP
        op[1101] = getOpcodeRnm(196, 1108); // orderExpr
        op[1102] = getOpcodeRep((char)0, (char)1, 1103);
        op[1103] = getOpcodeRnm(6, 15); // WSP
        op[1104] = getOpcodeRep((char)0, (char)1, 1105);
        {int[] a = {1106,1107}; op[1105] = getOpcodeAlt(a);}
        {char[] a = {97,115,99}; op[1106] = getOpcodeTls(a);}
        {char[] a = {100,101,115,99}; op[1107] = getOpcodeTls(a);}
        {int[] a = {1109,1110}; op[1108] = getOpcodeAlt(a);}
        op[1109] = getOpcodeRnm(102, 583); // primitiveKeyProperty
        op[1110] = getOpcodeRnm(103, 584); // primitiveNonKeyProperty
        {int[] a = {1112,1113}; op[1111] = getOpcodeCat(a);}
        {char[] a = {36,115,107,105,112,61}; op[1112] = getOpcodeTls(a);}
        op[1113] = getOpcodeRep((char)1, Character.MAX_VALUE, 1114);
        op[1114] = getOpcodeRnm(1, 3); // DIGIT
        {int[] a = {1116,1117}; op[1115] = getOpcodeCat(a);}
        {char[] a = {36,116,111,112,61}; op[1116] = getOpcodeTls(a);}
        op[1117] = getOpcodeRep((char)1, Character.MAX_VALUE, 1118);
        op[1118] = getOpcodeRnm(1, 3); // DIGIT
        {int[] a = {1120,1121}; op[1119] = getOpcodeCat(a);}
        {char[] a = {36,102,111,114,109,97,116,61}; op[1120] = getOpcodeTls(a);}
        {int[] a = {1122,1123,1124,1125}; op[1121] = getOpcodeAlt(a);}
        {char[] a = {106,115,111,110}; op[1122] = getOpcodeTls(a);}
        {char[] a = {97,116,111,109}; op[1123] = getOpcodeTls(a);}
        {char[] a = {120,109,108}; op[1124] = getOpcodeTls(a);}
        op[1125] = getOpcodeRep((char)1, Character.MAX_VALUE, 1126);
        {int[] a = {1127,1128}; op[1126] = getOpcodeAlt(a);}
        op[1127] = getOpcodeRnm(44, 305); // pchar
        {char[] a = {47}; op[1128] = getOpcodeTls(a);}
        {int[] a = {1130,1131}; op[1129] = getOpcodeCat(a);}
        {char[] a = {36,105,110,108,105,110,101,99,111,117,110,116,61}; op[1130] = getOpcodeTls(a);}
        {int[] a = {1132,1133}; op[1131] = getOpcodeAlt(a);}
        {char[] a = {97,108,108,112,97,103,101,115}; op[1132] = getOpcodeTls(a);}
        {char[] a = {110,111,110,101}; op[1133] = getOpcodeTls(a);}
        {int[] a = {1135,1136}; op[1134] = getOpcodeCat(a);}
        {char[] a = {36,115,101,108,101,99,116,61}; op[1135] = getOpcodeTls(a);}
        op[1136] = getOpcodeRnm(202, 1137); // selectClause
        {int[] a = {1138,1139}; op[1137] = getOpcodeCat(a);}
        op[1138] = getOpcodeRnm(203, 1143); // selectItem
        op[1139] = getOpcodeRep((char)0, Character.MAX_VALUE, 1140);
        {int[] a = {1141,1142}; op[1140] = getOpcodeCat(a);}
        op[1141] = getOpcodeRnm(62, 402); // COMMA
        op[1142] = getOpcodeRnm(203, 1143); // selectItem
        {int[] a = {1144,1145}; op[1143] = getOpcodeAlt(a);}
        op[1144] = getOpcodeRnm(68, 410); // star
        {int[] a = {1146,1150}; op[1145] = getOpcodeCat(a);}
        op[1146] = getOpcodeRep((char)0, (char)1, 1147);
        {int[] a = {1148,1149}; op[1147] = getOpcodeCat(a);}
        op[1148] = getOpcodeRnm(97, 534); // qualifiedEntityTypeName
        {char[] a = {47}; op[1149] = getOpcodeTls(a);}
        {int[] a = {1151,1157,1158,1159,1160}; op[1150] = getOpcodeAlt(a);}
        {int[] a = {1152,1153}; op[1151] = getOpcodeCat(a);}
        op[1152] = getOpcodeRnm(119, 612); // navigationProperty
        op[1153] = getOpcodeRep((char)0, (char)1, 1154);
        {int[] a = {1155,1156}; op[1154] = getOpcodeCat(a);}
        {char[] a = {47}; op[1155] = getOpcodeTls(a);}
        op[1156] = getOpcodeRnm(203, 1143); // selectItem
        op[1157] = getOpcodeRnm(108, 589); // propertyName
        op[1158] = getOpcodeRnm(144, 679); // qualifiedActionName
        op[1159] = getOpcodeRnm(145, 686); // qualifiedFunctionName
        op[1160] = getOpcodeRnm(95, 520); // allOperationsInContainer
        {int[] a = {1162,1163}; op[1161] = getOpcodeCat(a);}
        {char[] a = {36,115,107,105,112,116,111,107,101,110,61}; op[1162] = getOpcodeTls(a);}
        op[1163] = getOpcodeRep((char)1, Character.MAX_VALUE, 1164);
        op[1164] = getOpcodeRnm(44, 305); // pchar
        {int[] a = {1166,1167,1169}; op[1165] = getOpcodeCat(a);}
        op[1166] = getOpcodeRnm(206, 1175); // customName
        op[1167] = getOpcodeRep((char)0, (char)1, 1168);
        op[1168] = getOpcodeRnm(6, 15); // WSP
        op[1169] = getOpcodeRep((char)0, (char)1, 1170);
        {int[] a = {1171,1172,1174}; op[1170] = getOpcodeCat(a);}
        {char[] a = {61}; op[1171] = getOpcodeTls(a);}
        op[1172] = getOpcodeRep((char)0, (char)1, 1173);
        op[1173] = getOpcodeRnm(6, 15); // WSP
        op[1174] = getOpcodeRnm(207, 1204); // customValue
        {int[] a = {1176,1189}; op[1175] = getOpcodeCat(a);}
        {int[] a = {1177,1178,1179,1180,1181,1182,1183,1184,1185,1186,1187,1188}; op[1176] = getOpcodeAlt(a);}
        op[1177] = getOpcodeRnm(48, 325); // unreserved
        op[1178] = getOpcodeRnm(47, 321); // pct-encoded
        {char[] a = {58}; op[1179] = getOpcodeTls(a);}
        {char[] a = {64}; op[1180] = getOpcodeTls(a);}
        {char[] a = {33}; op[1181] = getOpcodeTls(a);}
        {char[] a = {39}; op[1182] = getOpcodeTls(a);}
        {char[] a = {40}; op[1183] = getOpcodeTls(a);}
        {char[] a = {41}; op[1184] = getOpcodeTls(a);}
        {char[] a = {42}; op[1185] = getOpcodeTls(a);}
        {char[] a = {43}; op[1186] = getOpcodeTls(a);}
        {char[] a = {44}; op[1187] = getOpcodeTls(a);}
        {char[] a = {59}; op[1188] = getOpcodeTls(a);}
        op[1189] = getOpcodeRep((char)0, Character.MAX_VALUE, 1190);
        {int[] a = {1191,1192,1193,1194,1195,1196,1197,1198,1199,1200,1201,1202,1203}; op[1190] = getOpcodeAlt(a);}
        op[1191] = getOpcodeRnm(48, 325); // unreserved
        op[1192] = getOpcodeRnm(47, 321); // pct-encoded
        {char[] a = {58}; op[1193] = getOpcodeTls(a);}
        {char[] a = {64}; op[1194] = getOpcodeTls(a);}
        {char[] a = {33}; op[1195] = getOpcodeTls(a);}
        {char[] a = {36}; op[1196] = getOpcodeTls(a);}
        {char[] a = {39}; op[1197] = getOpcodeTls(a);}
        {char[] a = {40}; op[1198] = getOpcodeTls(a);}
        {char[] a = {41}; op[1199] = getOpcodeTls(a);}
        {char[] a = {42}; op[1200] = getOpcodeTls(a);}
        {char[] a = {43}; op[1201] = getOpcodeTls(a);}
        {char[] a = {44}; op[1202] = getOpcodeTls(a);}
        {char[] a = {59}; op[1203] = getOpcodeTls(a);}
        op[1204] = getOpcodeRep((char)0, Character.MAX_VALUE, 1205);
        {int[] a = {1206,1207,1208,1209,1210,1211,1212,1213,1214,1215,1216,1217,1218,1219}; op[1205] = getOpcodeAlt(a);}
        op[1206] = getOpcodeRnm(48, 325); // unreserved
        op[1207] = getOpcodeRnm(47, 321); // pct-encoded
        {char[] a = {58}; op[1208] = getOpcodeTls(a);}
        {char[] a = {64}; op[1209] = getOpcodeTls(a);}
        {char[] a = {33}; op[1210] = getOpcodeTls(a);}
        {char[] a = {36}; op[1211] = getOpcodeTls(a);}
        {char[] a = {39}; op[1212] = getOpcodeTls(a);}
        {char[] a = {40}; op[1213] = getOpcodeTls(a);}
        {char[] a = {41}; op[1214] = getOpcodeTls(a);}
        {char[] a = {42}; op[1215] = getOpcodeTls(a);}
        {char[] a = {43}; op[1216] = getOpcodeTls(a);}
        {char[] a = {44}; op[1217] = getOpcodeTls(a);}
        {char[] a = {59}; op[1218] = getOpcodeTls(a);}
        {char[] a = {61}; op[1219] = getOpcodeTls(a);}
        {int[] a = {1221,1234,1240,1246,1252,1260,1266,1274}; op[1220] = getOpcodeAlt(a);}
        {int[] a = {1222,1226,1227}; op[1221] = getOpcodeCat(a);}
        op[1222] = getOpcodeRep((char)0, (char)1, 1223);
        {int[] a = {1224,1225}; op[1223] = getOpcodeCat(a);}
        op[1224] = getOpcodeRnm(109, 596); // entityContainerName
        {char[] a = {46}; op[1225] = getOpcodeTls(a);}
        op[1226] = getOpcodeRnm(91, 510); // entitySetName
        op[1227] = getOpcodeRep((char)0, (char)1, 1228);
        {int[] a = {1229,1230}; op[1228] = getOpcodeAlt(a);}
        op[1229] = getOpcodeRnm(209, 1275); // collectionNavigation
        {int[] a = {1231,1232}; op[1230] = getOpcodeCat(a);}
        op[1231] = getOpcodeRnm(217, 1417); // keyPredicate
        op[1232] = getOpcodeRep((char)0, (char)1, 1233);
        op[1233] = getOpcodeRnm(210, 1311); // singleNavigation
        {int[] a = {1235,1238}; op[1234] = getOpcodeCat(a);}
        {int[] a = {1236,1237}; op[1235] = getOpcodeAlt(a);}
        op[1236] = getOpcodeRnm(262, 1632); // entityColServiceOpCall
        op[1237] = getOpcodeRnm(225, 1452); // entityColFunctionCall
        op[1238] = getOpcodeRep((char)0, (char)1, 1239);
        op[1239] = getOpcodeRnm(209, 1275); // collectionNavigation
        {int[] a = {1241,1244}; op[1240] = getOpcodeCat(a);}
        {int[] a = {1242,1243}; op[1241] = getOpcodeAlt(a);}
        op[1242] = getOpcodeRnm(261, 1626); // entityServiceOpCall
        op[1243] = getOpcodeRnm(224, 1449); // entityFunctionCall
        op[1244] = getOpcodeRep((char)0, (char)1, 1245);
        op[1245] = getOpcodeRnm(210, 1311); // singleNavigation
        {int[] a = {1247,1250}; op[1246] = getOpcodeCat(a);}
        {int[] a = {1248,1249}; op[1247] = getOpcodeAlt(a);}
        op[1248] = getOpcodeRnm(264, 1644); // complexColServiceOpCall
        op[1249] = getOpcodeRnm(227, 1458); // complexColFunctionCall
        op[1250] = getOpcodeRep((char)0, (char)1, 1251);
        op[1251] = getOpcodeRnm(211, 1342); // boundOperation
        {int[] a = {1253,1256}; op[1252] = getOpcodeCat(a);}
        {int[] a = {1254,1255}; op[1253] = getOpcodeAlt(a);}
        op[1254] = getOpcodeRnm(263, 1638); // complexServiceOpCall
        op[1255] = getOpcodeRnm(226, 1455); // complexFunctionCall
        op[1256] = getOpcodeRep((char)0, (char)1, 1257);
        {int[] a = {1258,1259}; op[1257] = getOpcodeAlt(a);}
        op[1258] = getOpcodeRnm(211, 1342); // boundOperation
        op[1259] = getOpcodeRnm(213, 1387); // complexPropertyPath
        {int[] a = {1261,1264}; op[1260] = getOpcodeCat(a);}
        {int[] a = {1262,1263}; op[1261] = getOpcodeAlt(a);}
        op[1262] = getOpcodeRnm(266, 1656); // primitiveColServiceOpCall
        op[1263] = getOpcodeRnm(229, 1464); // primitiveColFunctionCall
        op[1264] = getOpcodeRep((char)0, (char)1, 1265);
        op[1265] = getOpcodeRnm(211, 1342); // boundOperation
        {int[] a = {1267,1270}; op[1266] = getOpcodeCat(a);}
        {int[] a = {1268,1269}; op[1267] = getOpcodeAlt(a);}
        op[1268] = getOpcodeRnm(265, 1650); // primitiveServiceOpCall
        op[1269] = getOpcodeRnm(228, 1461); // primitiveFunctionCall
        op[1270] = getOpcodeRep((char)0, (char)1, 1271);
        {int[] a = {1272,1273}; op[1271] = getOpcodeAlt(a);}
        op[1272] = getOpcodeRnm(211, 1342); // boundOperation
        op[1273] = getOpcodeRnm(216, 1416); // value
        op[1274] = getOpcodeRnm(222, 1437); // actionCall
        {int[] a = {1276,1280,1281}; op[1275] = getOpcodeCat(a);}
        op[1276] = getOpcodeRep((char)0, (char)1, 1277);
        {int[] a = {1278,1279}; op[1277] = getOpcodeCat(a);}
        {char[] a = {47}; op[1278] = getOpcodeTls(a);}
        op[1279] = getOpcodeRnm(97, 534); // qualifiedEntityTypeName
        {char[] a = {47}; op[1280] = getOpcodeTls(a);}
        {int[] a = {1282,1286,1290,1296,1300,1306,1310}; op[1281] = getOpcodeAlt(a);}
        {int[] a = {1283,1284}; op[1282] = getOpcodeCat(a);}
        op[1283] = getOpcodeRnm(231, 1474); // boundEntityFuncCall
        op[1284] = getOpcodeRep((char)0, (char)1, 1285);
        op[1285] = getOpcodeRnm(210, 1311); // singleNavigation
        {int[] a = {1287,1288}; op[1286] = getOpcodeCat(a);}
        op[1287] = getOpcodeRnm(232, 1477); // boundEntityColFuncCall
        op[1288] = getOpcodeRep((char)0, (char)1, 1289);
        op[1289] = getOpcodeRnm(209, 1275); // collectionNavigation
        {int[] a = {1291,1292}; op[1290] = getOpcodeCat(a);}
        op[1291] = getOpcodeRnm(235, 1486); // boundPrimitiveFuncCall
        op[1292] = getOpcodeRep((char)0, (char)1, 1293);
        {int[] a = {1294,1295}; op[1293] = getOpcodeAlt(a);}
        op[1294] = getOpcodeRnm(211, 1342); // boundOperation
        op[1295] = getOpcodeRnm(216, 1416); // value
        {int[] a = {1297,1298}; op[1296] = getOpcodeCat(a);}
        op[1297] = getOpcodeRnm(236, 1489); // boundPrimitiveColFuncCall
        op[1298] = getOpcodeRep((char)0, (char)1, 1299);
        op[1299] = getOpcodeRnm(211, 1342); // boundOperation
        {int[] a = {1301,1302}; op[1300] = getOpcodeCat(a);}
        op[1301] = getOpcodeRnm(233, 1480); // boundComplexFuncCall
        op[1302] = getOpcodeRep((char)0, (char)1, 1303);
        {int[] a = {1304,1305}; op[1303] = getOpcodeAlt(a);}
        op[1304] = getOpcodeRnm(213, 1387); // complexPropertyPath
        op[1305] = getOpcodeRnm(211, 1342); // boundOperation
        {int[] a = {1307,1308}; op[1306] = getOpcodeCat(a);}
        op[1307] = getOpcodeRnm(234, 1483); // boundComplexColFuncCall
        op[1308] = getOpcodeRep((char)0, (char)1, 1309);
        op[1309] = getOpcodeRnm(211, 1342); // boundOperation
        op[1310] = getOpcodeRnm(223, 1443); // boundActionCall
        {int[] a = {1312,1316}; op[1311] = getOpcodeCat(a);}
        op[1312] = getOpcodeRep((char)0, (char)1, 1313);
        {int[] a = {1314,1315}; op[1313] = getOpcodeCat(a);}
        {char[] a = {47}; op[1314] = getOpcodeTls(a);}
        op[1315] = getOpcodeRnm(97, 534); // qualifiedEntityTypeName
        {int[] a = {1317,1336,1337,1338,1339,1340,1341}; op[1316] = getOpcodeAlt(a);}
        {int[] a = {1318,1319}; op[1317] = getOpcodeCat(a);}
        {char[] a = {47}; op[1318] = getOpcodeTls(a);}
        {int[] a = {1320,1323,1327}; op[1319] = getOpcodeAlt(a);}
        {int[] a = {1321,1322}; op[1320] = getOpcodeCat(a);}
        {char[] a = {36,108,105,110,107,115,47}; op[1321] = getOpcodeTls(a);}
        op[1322] = getOpcodeRnm(119, 612); // navigationProperty
        {int[] a = {1324,1325}; op[1323] = getOpcodeCat(a);}
        op[1324] = getOpcodeRnm(117, 610); // entityNavigationProperty
        op[1325] = getOpcodeRep((char)0, (char)1, 1326);
        op[1326] = getOpcodeRnm(210, 1311); // singleNavigation
        {int[] a = {1328,1329}; op[1327] = getOpcodeCat(a);}
        op[1328] = getOpcodeRnm(118, 611); // entityColNavigationProperty
        op[1329] = getOpcodeRep((char)0, (char)1, 1330);
        {int[] a = {1331,1332}; op[1330] = getOpcodeAlt(a);}
        op[1331] = getOpcodeRnm(209, 1275); // collectionNavigation
        {int[] a = {1333,1334}; op[1332] = getOpcodeCat(a);}
        op[1333] = getOpcodeRnm(217, 1417); // keyPredicate
        op[1334] = getOpcodeRep((char)0, (char)1, 1335);
        op[1335] = getOpcodeRnm(210, 1311); // singleNavigation
        op[1336] = getOpcodeRnm(213, 1387); // complexPropertyPath
        op[1337] = getOpcodeRnm(214, 1398); // collectionPropertyPath
        op[1338] = getOpcodeRnm(212, 1378); // primitivePropertyPath
        op[1339] = getOpcodeRnm(215, 1409); // streamPropertyPath
        op[1340] = getOpcodeRnm(216, 1416); // value
        op[1341] = getOpcodeRnm(211, 1342); // boundOperation
        {int[] a = {1343,1347,1348}; op[1342] = getOpcodeCat(a);}
        op[1343] = getOpcodeRep((char)0, (char)1, 1344);
        {int[] a = {1345,1346}; op[1344] = getOpcodeCat(a);}
        {char[] a = {47}; op[1345] = getOpcodeTls(a);}
        op[1346] = getOpcodeRnm(97, 534); // qualifiedEntityTypeName
        {char[] a = {47}; op[1347] = getOpcodeTls(a);}
        {int[] a = {1349,1353,1357,1363,1367,1373,1377}; op[1348] = getOpcodeAlt(a);}
        {int[] a = {1350,1351}; op[1349] = getOpcodeCat(a);}
        op[1350] = getOpcodeRnm(232, 1477); // boundEntityColFuncCall
        op[1351] = getOpcodeRep((char)0, (char)1, 1352);
        op[1352] = getOpcodeRnm(210, 1311); // singleNavigation
        {int[] a = {1354,1355}; op[1353] = getOpcodeCat(a);}
        op[1354] = getOpcodeRnm(231, 1474); // boundEntityFuncCall
        op[1355] = getOpcodeRep((char)0, (char)1, 1356);
        op[1356] = getOpcodeRnm(209, 1275); // collectionNavigation
        {int[] a = {1358,1359}; op[1357] = getOpcodeCat(a);}
        op[1358] = getOpcodeRnm(235, 1486); // boundPrimitiveFuncCall
        op[1359] = getOpcodeRep((char)0, (char)1, 1360);
        {int[] a = {1361,1362}; op[1360] = getOpcodeAlt(a);}
        op[1361] = getOpcodeRnm(211, 1342); // boundOperation
        op[1362] = getOpcodeRnm(216, 1416); // value
        {int[] a = {1364,1365}; op[1363] = getOpcodeCat(a);}
        op[1364] = getOpcodeRnm(236, 1489); // boundPrimitiveColFuncCall
        op[1365] = getOpcodeRep((char)0, (char)1, 1366);
        op[1366] = getOpcodeRnm(211, 1342); // boundOperation
        {int[] a = {1368,1369}; op[1367] = getOpcodeCat(a);}
        op[1368] = getOpcodeRnm(233, 1480); // boundComplexFuncCall
        op[1369] = getOpcodeRep((char)0, (char)1, 1370);
        {int[] a = {1371,1372}; op[1370] = getOpcodeAlt(a);}
        op[1371] = getOpcodeRnm(213, 1387); // complexPropertyPath
        op[1372] = getOpcodeRnm(211, 1342); // boundOperation
        {int[] a = {1374,1375}; op[1373] = getOpcodeCat(a);}
        op[1374] = getOpcodeRnm(234, 1483); // boundComplexColFuncCall
        op[1375] = getOpcodeRep((char)0, (char)1, 1376);
        op[1376] = getOpcodeRnm(211, 1342); // boundOperation
        op[1377] = getOpcodeRnm(223, 1443); // boundActionCall
        {int[] a = {1379,1381,1382,1385}; op[1378] = getOpcodeCat(a);}
        op[1379] = getOpcodeRep((char)0, (char)1, 1380);
        {char[] a = {47,32,113,117,97,108,105,102,105,101,100,69,110,116,105,116,121,84,121,112,101,78,97,109,101}; op[1380] = getOpcodeTls(a);}
        {char[] a = {47}; op[1381] = getOpcodeTls(a);}
        {int[] a = {1383,1384}; op[1382] = getOpcodeAlt(a);}
        op[1383] = getOpcodeRnm(102, 583); // primitiveKeyProperty
        op[1384] = getOpcodeRnm(103, 584); // primitiveNonKeyProperty
        op[1385] = getOpcodeRep((char)0, (char)1, 1386);
        op[1386] = getOpcodeRnm(216, 1416); // value
        {int[] a = {1388,1390,1391,1392}; op[1387] = getOpcodeCat(a);}
        op[1388] = getOpcodeRep((char)0, (char)1, 1389);
        {char[] a = {47,32,113,117,97,108,105,102,105,101,100,69,110,116,105,116,121,84,121,112,101,78,97,109,101}; op[1389] = getOpcodeTls(a);}
        {char[] a = {47}; op[1390] = getOpcodeTls(a);}
        op[1391] = getOpcodeRnm(105, 586); // complexProperty
        op[1392] = getOpcodeRep((char)0, (char)1, 1393);
        {int[] a = {1394,1395,1396,1397}; op[1393] = getOpcodeAlt(a);}
        op[1394] = getOpcodeRnm(212, 1378); // primitivePropertyPath
        op[1395] = getOpcodeRnm(213, 1387); // complexPropertyPath
        op[1396] = getOpcodeRnm(214, 1398); // collectionPropertyPath
        op[1397] = getOpcodeRnm(211, 1342); // boundOperation
        {int[] a = {1399,1403,1404,1407}; op[1398] = getOpcodeCat(a);}
        op[1399] = getOpcodeRep((char)0, (char)1, 1400);
        {int[] a = {1401,1402}; op[1400] = getOpcodeCat(a);}
        {char[] a = {47}; op[1401] = getOpcodeTls(a);}
        op[1402] = getOpcodeRnm(0, 0); // ALPHA
        {char[] a = {47}; op[1403] = getOpcodeTls(a);}
        {int[] a = {1405,1406}; op[1404] = getOpcodeAlt(a);}
        op[1405] = getOpcodeRnm(104, 585); // primitiveColProperty
        op[1406] = getOpcodeRnm(106, 587); // complexColProperty
        op[1407] = getOpcodeRep((char)0, (char)1, 1408);
        op[1408] = getOpcodeRnm(211, 1342); // boundOperation
        {int[] a = {1410,1414,1415}; op[1409] = getOpcodeCat(a);}
        op[1410] = getOpcodeRep((char)0, (char)1, 1411);
        {int[] a = {1412,1413}; op[1411] = getOpcodeCat(a);}
        {char[] a = {47}; op[1412] = getOpcodeTls(a);}
        op[1413] = getOpcodeRnm(97, 534); // qualifiedEntityTypeName
        {char[] a = {47}; op[1414] = getOpcodeTls(a);}
        op[1415] = getOpcodeRnm(107, 588); // streamProperty
        {char[] a = {47,36,118,97,108,117,101}; op[1416] = getOpcodeTls(a);}
        {int[] a = {1418,1419}; op[1417] = getOpcodeAlt(a);}
        op[1418] = getOpcodeRnm(218, 1420); // simpleKey
        op[1419] = getOpcodeRnm(219, 1424); // compoundKey
        {int[] a = {1421,1422,1423}; op[1420] = getOpcodeCat(a);}
        {char[] a = {40}; op[1421] = getOpcodeTls(a);}
        op[1422] = getOpcodeRnm(148, 701); // primitiveLiteral
        {char[] a = {41}; op[1423] = getOpcodeTls(a);}
        {int[] a = {1425,1426,1427,1431}; op[1424] = getOpcodeCat(a);}
        {char[] a = {40}; op[1425] = getOpcodeTls(a);}
        op[1426] = getOpcodeRnm(220, 1432); // keyValuePair
        op[1427] = getOpcodeRep((char)0, Character.MAX_VALUE, 1428);
        {int[] a = {1429,1430}; op[1428] = getOpcodeCat(a);}
        {char[] a = {44}; op[1429] = getOpcodeTls(a);}
        op[1430] = getOpcodeRnm(220, 1432); // keyValuePair
        {char[] a = {41}; op[1431] = getOpcodeTls(a);}
        {int[] a = {1433,1434,1435}; op[1432] = getOpcodeCat(a);}
        op[1433] = getOpcodeRnm(102, 583); // primitiveKeyProperty
        {char[] a = {61}; op[1434] = getOpcodeTls(a);}
        op[1435] = getOpcodeRnm(221, 1436); // keyPropertyValue
        op[1436] = getOpcodeRnm(148, 701); // primitiveLiteral
        {int[] a = {1438,1440,1441}; op[1437] = getOpcodeCat(a);}
        op[1438] = getOpcodeRep((char)0, (char)1, 1439);
        op[1439] = getOpcodeRnm(94, 513); // operationQualifier
        op[1440] = getOpcodeRnm(141, 666); // action
        op[1441] = getOpcodeRep((char)0, (char)1, 1442);
        {char[] a = {40,41}; op[1442] = getOpcodeTls(a);}
        {int[] a = {1444,1446,1447}; op[1443] = getOpcodeCat(a);}
        op[1444] = getOpcodeRep((char)0, (char)1, 1445);
        op[1445] = getOpcodeRnm(94, 513); // operationQualifier
        op[1446] = getOpcodeRnm(141, 666); // action
        op[1447] = getOpcodeRep((char)0, (char)1, 1448);
        {char[] a = {40,41}; op[1448] = getOpcodeTls(a);}
        {int[] a = {1450,1451}; op[1449] = getOpcodeCat(a);}
        op[1450] = getOpcodeRnm(127, 628); // fullEntityFunction
        op[1451] = getOpcodeRnm(238, 1499); // functionParameters
        {int[] a = {1453,1454}; op[1452] = getOpcodeCat(a);}
        op[1453] = getOpcodeRnm(128, 632); // fullEntityColFunction
        op[1454] = getOpcodeRnm(238, 1499); // functionParameters
        {int[] a = {1456,1457}; op[1455] = getOpcodeCat(a);}
        op[1456] = getOpcodeRnm(129, 636); // fullComplexFunction
        op[1457] = getOpcodeRnm(238, 1499); // functionParameters
        {int[] a = {1459,1460}; op[1458] = getOpcodeCat(a);}
        op[1459] = getOpcodeRnm(130, 640); // fullComplexColFunction
        op[1460] = getOpcodeRnm(238, 1499); // functionParameters
        {int[] a = {1462,1463}; op[1461] = getOpcodeCat(a);}
        op[1462] = getOpcodeRnm(131, 644); // fullPrimitiveFunction
        op[1463] = getOpcodeRnm(238, 1499); // functionParameters
        {int[] a = {1465,1466}; op[1464] = getOpcodeCat(a);}
        op[1465] = getOpcodeRnm(131, 644); // fullPrimitiveFunction
        op[1466] = getOpcodeRnm(238, 1499); // functionParameters
        {int[] a = {1468,1469,1470,1471,1472,1473}; op[1467] = getOpcodeAlt(a);}
        op[1468] = getOpcodeRnm(224, 1449); // entityFunctionCall
        op[1469] = getOpcodeRnm(225, 1452); // entityColFunctionCall
        op[1470] = getOpcodeRnm(226, 1455); // complexFunctionCall
        op[1471] = getOpcodeRnm(227, 1458); // complexColFunctionCall
        op[1472] = getOpcodeRnm(228, 1461); // primitiveFunctionCall
        op[1473] = getOpcodeRnm(229, 1464); // primitiveColFunctionCall
        {int[] a = {1475,1476}; op[1474] = getOpcodeCat(a);}
        op[1475] = getOpcodeRnm(127, 628); // fullEntityFunction
        op[1476] = getOpcodeRnm(238, 1499); // functionParameters
        {int[] a = {1478,1479}; op[1477] = getOpcodeCat(a);}
        op[1478] = getOpcodeRnm(128, 632); // fullEntityColFunction
        op[1479] = getOpcodeRnm(238, 1499); // functionParameters
        {int[] a = {1481,1482}; op[1480] = getOpcodeCat(a);}
        op[1481] = getOpcodeRnm(129, 636); // fullComplexFunction
        op[1482] = getOpcodeRnm(238, 1499); // functionParameters
        {int[] a = {1484,1485}; op[1483] = getOpcodeCat(a);}
        op[1484] = getOpcodeRnm(130, 640); // fullComplexColFunction
        op[1485] = getOpcodeRnm(238, 1499); // functionParameters
        {int[] a = {1487,1488}; op[1486] = getOpcodeCat(a);}
        op[1487] = getOpcodeRnm(131, 644); // fullPrimitiveFunction
        op[1488] = getOpcodeRnm(238, 1499); // functionParameters
        {int[] a = {1490,1491}; op[1489] = getOpcodeCat(a);}
        op[1490] = getOpcodeRnm(131, 644); // fullPrimitiveFunction
        op[1491] = getOpcodeRnm(238, 1499); // functionParameters
        {int[] a = {1493,1494,1495,1496,1497,1498}; op[1492] = getOpcodeAlt(a);}
        op[1493] = getOpcodeRnm(231, 1474); // boundEntityFuncCall
        op[1494] = getOpcodeRnm(232, 1477); // boundEntityColFuncCall
        op[1495] = getOpcodeRnm(233, 1480); // boundComplexFuncCall
        op[1496] = getOpcodeRnm(234, 1483); // boundComplexColFuncCall
        op[1497] = getOpcodeRnm(235, 1486); // boundPrimitiveFuncCall
        op[1498] = getOpcodeRnm(236, 1489); // boundPrimitiveColFuncCall
        {int[] a = {1500,1501,1508}; op[1499] = getOpcodeCat(a);}
        {char[] a = {40}; op[1500] = getOpcodeTls(a);}
        op[1501] = getOpcodeRep((char)0, (char)1, 1502);
        {int[] a = {1503,1504}; op[1502] = getOpcodeCat(a);}
        op[1503] = getOpcodeRnm(239, 1509); // functionParameter
        op[1504] = getOpcodeRep((char)0, Character.MAX_VALUE, 1505);
        {int[] a = {1506,1507}; op[1505] = getOpcodeCat(a);}
        {char[] a = {44}; op[1506] = getOpcodeTls(a);}
        op[1507] = getOpcodeRnm(239, 1509); // functionParameter
        {char[] a = {41}; op[1508] = getOpcodeTls(a);}
        {int[] a = {1510,1511,1512}; op[1509] = getOpcodeCat(a);}
        op[1510] = getOpcodeRnm(240, 1515); // functionParameterName
        {char[] a = {61}; op[1511] = getOpcodeTls(a);}
        {int[] a = {1513,1514}; op[1512] = getOpcodeAlt(a);}
        op[1513] = getOpcodeRnm(241, 1516); // primitiveParameterValue
        op[1514] = getOpcodeRnm(242, 1517); // parameterAlias
        op[1515] = getOpcodeRnm(86, 492); // odataIdentifier
        op[1516] = getOpcodeRnm(148, 701); // primitiveLiteral
        {int[] a = {1518,1519}; op[1517] = getOpcodeCat(a);}
        {char[] a = {64}; op[1518] = getOpcodeTls(a);}
        op[1519] = getOpcodeRep((char)0, Character.MAX_VALUE, 1520);
        op[1520] = getOpcodeRnm(44, 305); // pchar
        {int[] a = {1522,1523,1524}; op[1521] = getOpcodeCat(a);}
        op[1522] = getOpcodeRnm(242, 1517); // parameterAlias
        {char[] a = {61}; op[1523] = getOpcodeTls(a);}
        op[1524] = getOpcodeRnm(257, 1600); // parameterValue
        {int[] a = {1526,1527,1528}; op[1525] = getOpcodeCat(a);}
        op[1526] = getOpcodeRnm(240, 1515); // functionParameterName
        {char[] a = {61}; op[1527] = getOpcodeTls(a);}
        op[1528] = getOpcodeRnm(257, 1600); // parameterValue
        {char[] a = {123,84,79,68,79,49,57,125}; op[1529] = getOpcodeTls(a);}
        {int[] a = {1531,1532,1535,1536,1537}; op[1530] = getOpcodeCat(a);}
        op[1531] = getOpcodeRnm(354, 2449); // quotation-mark
        {int[] a = {1533,1534}; op[1532] = getOpcodeAlt(a);}
        op[1533] = getOpcodeRnm(102, 583); // primitiveKeyProperty
        op[1534] = getOpcodeRnm(103, 584); // primitiveNonKeyProperty
        op[1535] = getOpcodeRnm(354, 2449); // quotation-mark
        op[1536] = getOpcodeRnm(67, 409); // name-separator
        op[1537] = getOpcodeRnm(253, 1581); // primitiveLiteralInVJSON
        {int[] a = {1539,1540}; op[1538] = getOpcodeAlt(a);}
        op[1539] = getOpcodeRnm(248, 1541); // complexPropertyInVJSON
        op[1540] = getOpcodeRnm(249, 1547); // complexPropertyInJSONLight
        {int[] a = {1542,1543,1544,1545,1546}; op[1541] = getOpcodeCat(a);}
        op[1542] = getOpcodeRnm(354, 2449); // quotation-mark
        op[1543] = getOpcodeRnm(105, 586); // complexProperty
        op[1544] = getOpcodeRnm(354, 2449); // quotation-mark
        op[1545] = getOpcodeRnm(67, 409); // name-separator
        op[1546] = getOpcodeRnm(260, 1609); // complexInVJSON
        {char[] a = {123,84,79,68,79,50,48,125}; op[1547] = getOpcodeTls(a);}
        {int[] a = {1549,1550}; op[1548] = getOpcodeAlt(a);}
        op[1549] = getOpcodeRnm(252, 1580); // colPropertyInJSONLight
        op[1550] = getOpcodeRnm(251, 1551); // collectionPropertyInVJSON
        {int[] a = {1552,1566}; op[1551] = getOpcodeAlt(a);}
        {int[] a = {1553,1554,1555,1556,1557,1558,1565}; op[1552] = getOpcodeCat(a);}
        op[1553] = getOpcodeRnm(354, 2449); // quotation-mark
        op[1554] = getOpcodeRnm(104, 585); // primitiveColProperty
        op[1555] = getOpcodeRnm(354, 2449); // quotation-mark
        op[1556] = getOpcodeRnm(67, 409); // name-separator
        {char[] a = {91}; op[1557] = getOpcodeTls(a);}
        op[1558] = getOpcodeRep((char)0, (char)1, 1559);
        {int[] a = {1560,1561}; op[1559] = getOpcodeCat(a);}
        op[1560] = getOpcodeRnm(353, 2448); // primitiveVJSONLiteral
        op[1561] = getOpcodeRep((char)0, Character.MAX_VALUE, 1562);
        {int[] a = {1563,1564}; op[1562] = getOpcodeCat(a);}
        op[1563] = getOpcodeRnm(62, 402); // COMMA
        op[1564] = getOpcodeRnm(253, 1581); // primitiveLiteralInVJSON
        {char[] a = {93}; op[1565] = getOpcodeTls(a);}
        {int[] a = {1567,1568,1569,1570,1571,1572,1579}; op[1566] = getOpcodeCat(a);}
        op[1567] = getOpcodeRnm(354, 2449); // quotation-mark
        op[1568] = getOpcodeRnm(106, 587); // complexColProperty
        op[1569] = getOpcodeRnm(354, 2449); // quotation-mark
        op[1570] = getOpcodeRnm(67, 409); // name-separator
        {char[] a = {91}; op[1571] = getOpcodeTls(a);}
        op[1572] = getOpcodeRep((char)0, (char)1, 1573);
        {int[] a = {1574,1575}; op[1573] = getOpcodeCat(a);}
        op[1574] = getOpcodeRnm(260, 1609); // complexInVJSON
        op[1575] = getOpcodeRep((char)0, Character.MAX_VALUE, 1576);
        {int[] a = {1577,1578}; op[1576] = getOpcodeCat(a);}
        op[1577] = getOpcodeRnm(62, 402); // COMMA
        op[1578] = getOpcodeRnm(260, 1609); // complexInVJSON
        {char[] a = {93}; op[1579] = getOpcodeTls(a);}
        {char[] a = {123,84,79,68,79,50,49,125}; op[1580] = getOpcodeTls(a);}
        {char[] a = {123,84,79,68,79,50,50,125}; op[1581] = getOpcodeTls(a);}
        {char[] a = {123,84,79,68,79,50,51,125}; op[1582] = getOpcodeTls(a);}
        {int[] a = {1584,1585,1586,1587,1588,1589,1591}; op[1583] = getOpcodeCat(a);}
        op[1584] = getOpcodeRnm(354, 2449); // quotation-mark
        {char[] a = {95,95,109,101,116,97,100,97,116,97}; op[1585] = getOpcodeTls(a);}
        op[1586] = getOpcodeRnm(354, 2449); // quotation-mark
        op[1587] = getOpcodeRnm(67, 409); // name-separator
        op[1588] = getOpcodeRnm(64, 406); // begin-object
        op[1589] = getOpcodeRep((char)0, (char)1, 1590);
        op[1590] = getOpcodeRnm(256, 1592); // typeNVPInVJSON
        op[1591] = getOpcodeRnm(65, 407); // end-object
        {int[] a = {1593,1594,1595,1596,1597,1598,1599}; op[1592] = getOpcodeCat(a);}
        op[1593] = getOpcodeRnm(354, 2449); // quotation-mark
        {char[] a = {116,121,112,101}; op[1594] = getOpcodeTls(a);}
        op[1595] = getOpcodeRnm(354, 2449); // quotation-mark
        op[1596] = getOpcodeRnm(67, 409); // name-separator
        op[1597] = getOpcodeRnm(354, 2449); // quotation-mark
        op[1598] = getOpcodeRnm(96, 523); // qualifiedTypeName
        op[1599] = getOpcodeRnm(354, 2449); // quotation-mark
        {int[] a = {1601,1602,1603,1604}; op[1600] = getOpcodeAlt(a);}
        op[1601] = getOpcodeRnm(148, 701); // primitiveLiteral
        op[1602] = getOpcodeRnm(343, 2438); // complexTypeInJSON
        op[1603] = getOpcodeRnm(351, 2446); // primitiveColInJSON
        op[1604] = getOpcodeRnm(341, 2436); // complexColInJSON
        {int[] a = {1606,1607}; op[1605] = getOpcodeAlt(a);}
        op[1606] = getOpcodeRnm(260, 1609); // complexInVJSON
        op[1607] = getOpcodeRnm(259, 1608); // complexInJSONLight
        {char[] a = {123,84,79,68,79,50,52,125}; op[1608] = getOpcodeTls(a);}
        {int[] a = {1610,1611,1625}; op[1609] = getOpcodeCat(a);}
        op[1610] = getOpcodeRnm(64, 406); // begin-object
        op[1611] = getOpcodeRep((char)0, (char)1, 1612);
        {int[] a = {1613,1618}; op[1612] = getOpcodeCat(a);}
        {int[] a = {1614,1615,1616,1617}; op[1613] = getOpcodeAlt(a);}
        op[1614] = getOpcodeRnm(255, 1583); // complexTypeMetadataInVJSON
        op[1615] = getOpcodeRnm(246, 1530); // primitivePropertyInVJSON
        op[1616] = getOpcodeRnm(248, 1541); // complexPropertyInVJSON
        op[1617] = getOpcodeRnm(251, 1551); // collectionPropertyInVJSON
        op[1618] = getOpcodeRep((char)0, Character.MAX_VALUE, 1619);
        {int[] a = {1620,1621}; op[1619] = getOpcodeCat(a);}
        op[1620] = getOpcodeRnm(66, 408); // value-separator
        {int[] a = {1622,1623,1624}; op[1621] = getOpcodeAlt(a);}
        op[1622] = getOpcodeRnm(246, 1530); // primitivePropertyInVJSON
        op[1623] = getOpcodeRnm(248, 1541); // complexPropertyInVJSON
        op[1624] = getOpcodeRnm(251, 1551); // collectionPropertyInVJSON
        op[1625] = getOpcodeRnm(65, 407); // end-object
        {int[] a = {1627,1629,1630}; op[1626] = getOpcodeCat(a);}
        op[1627] = getOpcodeRep((char)0, (char)1, 1628);
        op[1628] = getOpcodeRnm(94, 513); // operationQualifier
        op[1629] = getOpcodeRnm(111, 604); // entityServiceOp
        op[1630] = getOpcodeRep((char)0, (char)1, 1631);
        {char[] a = {40,41}; op[1631] = getOpcodeTls(a);}
        {int[] a = {1633,1635,1636}; op[1632] = getOpcodeCat(a);}
        op[1633] = getOpcodeRep((char)0, (char)1, 1634);
        op[1634] = getOpcodeRnm(94, 513); // operationQualifier
        op[1635] = getOpcodeRnm(112, 605); // entityColServiceOp
        op[1636] = getOpcodeRep((char)0, (char)1, 1637);
        {char[] a = {40,41}; op[1637] = getOpcodeTls(a);}
        {int[] a = {1639,1641,1642}; op[1638] = getOpcodeCat(a);}
        op[1639] = getOpcodeRep((char)0, (char)1, 1640);
        op[1640] = getOpcodeRnm(94, 513); // operationQualifier
        op[1641] = getOpcodeRnm(113, 606); // complexServiceOp
        op[1642] = getOpcodeRep((char)0, (char)1, 1643);
        {char[] a = {40,41}; op[1643] = getOpcodeTls(a);}
        {int[] a = {1645,1647,1648}; op[1644] = getOpcodeCat(a);}
        op[1645] = getOpcodeRep((char)0, (char)1, 1646);
        op[1646] = getOpcodeRnm(94, 513); // operationQualifier
        op[1647] = getOpcodeRnm(114, 607); // complexColServiceOp
        op[1648] = getOpcodeRep((char)0, (char)1, 1649);
        {char[] a = {40,41}; op[1649] = getOpcodeTls(a);}
        {int[] a = {1651,1653,1654}; op[1650] = getOpcodeCat(a);}
        op[1651] = getOpcodeRep((char)0, (char)1, 1652);
        op[1652] = getOpcodeRnm(94, 513); // operationQualifier
        op[1653] = getOpcodeRnm(115, 608); // primitiveServiceOp
        op[1654] = getOpcodeRep((char)0, (char)1, 1655);
        {char[] a = {40,41}; op[1655] = getOpcodeTls(a);}
        {int[] a = {1657,1659,1660}; op[1656] = getOpcodeCat(a);}
        op[1657] = getOpcodeRep((char)0, (char)1, 1658);
        op[1658] = getOpcodeRnm(94, 513); // operationQualifier
        op[1659] = getOpcodeRnm(115, 608); // primitiveServiceOp
        op[1660] = getOpcodeRep((char)0, (char)1, 1661);
        {char[] a = {40,41}; op[1661] = getOpcodeTls(a);}
        {int[] a = {1663,1664,1665,1666,1667,1668}; op[1662] = getOpcodeAlt(a);}
        op[1663] = getOpcodeRnm(261, 1626); // entityServiceOpCall
        op[1664] = getOpcodeRnm(262, 1632); // entityColServiceOpCall
        op[1665] = getOpcodeRnm(263, 1638); // complexServiceOpCall
        op[1666] = getOpcodeRnm(264, 1644); // complexColServiceOpCall
        op[1667] = getOpcodeRnm(265, 1650); // primitiveServiceOpCall
        op[1668] = getOpcodeRnm(266, 1656); // primitiveColServiceOpCall
        op[1669] = getOpcodeRnm(86, 492); // odataIdentifier
        {int[] a = {1671,1672,1673}; op[1670] = getOpcodeCat(a);}
        op[1671] = getOpcodeRnm(268, 1669); // serviceOpParameterName
        {char[] a = {61}; op[1672] = getOpcodeTls(a);}
        op[1673] = getOpcodeRnm(241, 1516); // primitiveParameterValue
        {int[] a = {1675,1677,1692}; op[1674] = getOpcodeCat(a);}
        op[1675] = getOpcodeRep((char)0, (char)1, 1676);
        op[1676] = getOpcodeRnm(6, 15); // WSP
        {int[] a = {1678,1679,1680,1681,1682,1683,1684,1685,1686,1687,1688,1689,1690,1691}; op[1677] = getOpcodeAlt(a);}
        op[1678] = getOpcodeRnm(271, 1694); // boolCommonExpr
        op[1679] = getOpcodeRnm(310, 2066); // methodCallExpr
        op[1680] = getOpcodeRnm(274, 1719); // parenExpr
        op[1681] = getOpcodeRnm(273, 1718); // literalExpr
        op[1682] = getOpcodeRnm(284, 1783); // addExpr
        op[1683] = getOpcodeRnm(285, 1789); // subExpr
        op[1684] = getOpcodeRnm(286, 1795); // mulExpr
        op[1685] = getOpcodeRnm(287, 1801); // divExpr
        op[1686] = getOpcodeRnm(288, 1807); // modExpr
        op[1687] = getOpcodeRnm(289, 1813); // negateExpr
        op[1688] = getOpcodeRnm(297, 1922); // memberExpr
        op[1689] = getOpcodeRnm(294, 1879); // firstMemberExpr
        op[1690] = getOpcodeRnm(292, 1841); // castExpr
        op[1691] = getOpcodeRnm(347, 2442); // functionCallExpr
        op[1692] = getOpcodeRep((char)0, (char)1, 1693);
        op[1693] = getOpcodeRnm(6, 15); // WSP
        {int[] a = {1695,1697,1715}; op[1694] = getOpcodeCat(a);}
        op[1695] = getOpcodeRep((char)0, (char)1, 1696);
        op[1696] = getOpcodeRnm(6, 15); // WSP
        {int[] a = {1698,1699,1700,1701,1702,1703,1704,1705,1706,1707,1708,1709,1710,1711,1712,1713,1714}; op[1697] = getOpcodeAlt(a);}
        op[1698] = getOpcodeRnm(272, 1717); // boolLiteralExpr
        op[1699] = getOpcodeRnm(276, 1735); // andExpr
        op[1700] = getOpcodeRnm(277, 1741); // orExpr
        op[1701] = getOpcodeRnm(296, 1910); // boolPrimitiveMemberExpr
        op[1702] = getOpcodeRnm(278, 1747); // eqExpr
        op[1703] = getOpcodeRnm(279, 1753); // neExpr
        op[1704] = getOpcodeRnm(280, 1759); // ltExpr
        op[1705] = getOpcodeRnm(281, 1765); // leExpr
        op[1706] = getOpcodeRnm(282, 1771); // gtExpr
        op[1707] = getOpcodeRnm(283, 1777); // geExpr
        op[1708] = getOpcodeRnm(290, 1818); // notExpr
        op[1709] = getOpcodeRnm(291, 1822); // isofExpr
        op[1710] = getOpcodeRnm(293, 1860); // boolCastExpr
        op[1711] = getOpcodeRnm(339, 2434); // boolMethodCallExpr
        op[1712] = getOpcodeRnm(295, 1904); // firstBoolPrimitiveMemExpr
        op[1713] = getOpcodeRnm(275, 1727); // boolParenExpr
        op[1714] = getOpcodeRnm(338, 2433); // boolFunctionCallExpr
        op[1715] = getOpcodeRep((char)0, (char)1, 1716);
        op[1716] = getOpcodeRnm(6, 15); // WSP
        op[1717] = getOpcodeRnm(151, 750); // boolean
        op[1718] = getOpcodeRnm(148, 701); // primitiveLiteral
        {int[] a = {1720,1721,1723,1724,1726}; op[1719] = getOpcodeCat(a);}
        {char[] a = {40}; op[1720] = getOpcodeTls(a);}
        op[1721] = getOpcodeRep((char)0, (char)1, 1722);
        op[1722] = getOpcodeRnm(6, 15); // WSP
        op[1723] = getOpcodeRnm(270, 1674); // commonExpr
        op[1724] = getOpcodeRep((char)0, (char)1, 1725);
        op[1725] = getOpcodeRnm(6, 15); // WSP
        {char[] a = {41}; op[1726] = getOpcodeTls(a);}
        {int[] a = {1728,1729,1731,1732,1734}; op[1727] = getOpcodeCat(a);}
        {char[] a = {40}; op[1728] = getOpcodeTls(a);}
        op[1729] = getOpcodeRep((char)0, (char)1, 1730);
        op[1730] = getOpcodeRnm(6, 15); // WSP
        op[1731] = getOpcodeRnm(271, 1694); // boolCommonExpr
        op[1732] = getOpcodeRep((char)0, (char)1, 1733);
        op[1733] = getOpcodeRnm(6, 15); // WSP
        {char[] a = {41}; op[1734] = getOpcodeTls(a);}
        {int[] a = {1736,1737,1738,1739,1740}; op[1735] = getOpcodeCat(a);}
        op[1736] = getOpcodeRnm(271, 1694); // boolCommonExpr
        op[1737] = getOpcodeRnm(6, 15); // WSP
        {char[] a = {97,110,100}; op[1738] = getOpcodeTls(a);}
        op[1739] = getOpcodeRnm(6, 15); // WSP
        op[1740] = getOpcodeRnm(271, 1694); // boolCommonExpr
        {int[] a = {1742,1743,1744,1745,1746}; op[1741] = getOpcodeCat(a);}
        op[1742] = getOpcodeRnm(271, 1694); // boolCommonExpr
        op[1743] = getOpcodeRnm(6, 15); // WSP
        {char[] a = {111,114}; op[1744] = getOpcodeTls(a);}
        op[1745] = getOpcodeRnm(6, 15); // WSP
        op[1746] = getOpcodeRnm(271, 1694); // boolCommonExpr
        {int[] a = {1748,1749,1750,1751,1752}; op[1747] = getOpcodeCat(a);}
        op[1748] = getOpcodeRnm(270, 1674); // commonExpr
        op[1749] = getOpcodeRnm(6, 15); // WSP
        {char[] a = {101,113}; op[1750] = getOpcodeTls(a);}
        op[1751] = getOpcodeRnm(6, 15); // WSP
        op[1752] = getOpcodeRnm(270, 1674); // commonExpr
        {int[] a = {1754,1755,1756,1757,1758}; op[1753] = getOpcodeCat(a);}
        op[1754] = getOpcodeRnm(270, 1674); // commonExpr
        op[1755] = getOpcodeRnm(6, 15); // WSP
        {char[] a = {110,101}; op[1756] = getOpcodeTls(a);}
        op[1757] = getOpcodeRnm(6, 15); // WSP
        op[1758] = getOpcodeRnm(270, 1674); // commonExpr
        {int[] a = {1760,1761,1762,1763,1764}; op[1759] = getOpcodeCat(a);}
        op[1760] = getOpcodeRnm(270, 1674); // commonExpr
        op[1761] = getOpcodeRnm(6, 15); // WSP
        {char[] a = {108,116}; op[1762] = getOpcodeTls(a);}
        op[1763] = getOpcodeRnm(6, 15); // WSP
        op[1764] = getOpcodeRnm(270, 1674); // commonExpr
        {int[] a = {1766,1767,1768,1769,1770}; op[1765] = getOpcodeCat(a);}
        op[1766] = getOpcodeRnm(270, 1674); // commonExpr
        op[1767] = getOpcodeRnm(6, 15); // WSP
        {char[] a = {108,101}; op[1768] = getOpcodeTls(a);}
        op[1769] = getOpcodeRnm(6, 15); // WSP
        op[1770] = getOpcodeRnm(270, 1674); // commonExpr
        {int[] a = {1772,1773,1774,1775,1776}; op[1771] = getOpcodeCat(a);}
        op[1772] = getOpcodeRnm(270, 1674); // commonExpr
        op[1773] = getOpcodeRnm(6, 15); // WSP
        {char[] a = {103,116}; op[1774] = getOpcodeTls(a);}
        op[1775] = getOpcodeRnm(6, 15); // WSP
        op[1776] = getOpcodeRnm(270, 1674); // commonExpr
        {int[] a = {1778,1779,1780,1781,1782}; op[1777] = getOpcodeCat(a);}
        op[1778] = getOpcodeRnm(270, 1674); // commonExpr
        op[1779] = getOpcodeRnm(6, 15); // WSP
        {char[] a = {103,101}; op[1780] = getOpcodeTls(a);}
        op[1781] = getOpcodeRnm(6, 15); // WSP
        op[1782] = getOpcodeRnm(270, 1674); // commonExpr
        {int[] a = {1784,1785,1786,1787,1788}; op[1783] = getOpcodeCat(a);}
        op[1784] = getOpcodeRnm(270, 1674); // commonExpr
        op[1785] = getOpcodeRnm(6, 15); // WSP
        {char[] a = {97,100,100}; op[1786] = getOpcodeTls(a);}
        op[1787] = getOpcodeRnm(6, 15); // WSP
        op[1788] = getOpcodeRnm(270, 1674); // commonExpr
        {int[] a = {1790,1791,1792,1793,1794}; op[1789] = getOpcodeCat(a);}
        op[1790] = getOpcodeRnm(270, 1674); // commonExpr
        op[1791] = getOpcodeRnm(6, 15); // WSP
        {char[] a = {115,117,98}; op[1792] = getOpcodeTls(a);}
        op[1793] = getOpcodeRnm(6, 15); // WSP
        op[1794] = getOpcodeRnm(270, 1674); // commonExpr
        {int[] a = {1796,1797,1798,1799,1800}; op[1795] = getOpcodeCat(a);}
        op[1796] = getOpcodeRnm(270, 1674); // commonExpr
        op[1797] = getOpcodeRnm(6, 15); // WSP
        {char[] a = {109,117,108}; op[1798] = getOpcodeTls(a);}
        op[1799] = getOpcodeRnm(6, 15); // WSP
        op[1800] = getOpcodeRnm(270, 1674); // commonExpr
        {int[] a = {1802,1803,1804,1805,1806}; op[1801] = getOpcodeCat(a);}
        op[1802] = getOpcodeRnm(270, 1674); // commonExpr
        op[1803] = getOpcodeRnm(6, 15); // WSP
        {char[] a = {100,105,118}; op[1804] = getOpcodeTls(a);}
        op[1805] = getOpcodeRnm(6, 15); // WSP
        op[1806] = getOpcodeRnm(270, 1674); // commonExpr
        {int[] a = {1808,1809,1810,1811,1812}; op[1807] = getOpcodeCat(a);}
        op[1808] = getOpcodeRnm(270, 1674); // commonExpr
        op[1809] = getOpcodeRnm(6, 15); // WSP
        {char[] a = {109,111,100}; op[1810] = getOpcodeTls(a);}
        op[1811] = getOpcodeRnm(6, 15); // WSP
        op[1812] = getOpcodeRnm(270, 1674); // commonExpr
        {int[] a = {1814,1815,1817}; op[1813] = getOpcodeCat(a);}
        {char[] a = {45}; op[1814] = getOpcodeTls(a);}
        op[1815] = getOpcodeRep((char)0, (char)1, 1816);
        op[1816] = getOpcodeRnm(6, 15); // WSP
        op[1817] = getOpcodeRnm(270, 1674); // commonExpr
        {int[] a = {1819,1820,1821}; op[1818] = getOpcodeCat(a);}
        {char[] a = {110,111,116}; op[1819] = getOpcodeTls(a);}
        op[1820] = getOpcodeRnm(6, 15); // WSP
        op[1821] = getOpcodeRnm(270, 1674); // commonExpr
        {int[] a = {1823,1824,1826,1827,1835,1837,1838,1840}; op[1822] = getOpcodeCat(a);}
        {char[] a = {105,115,111,102}; op[1823] = getOpcodeTls(a);}
        op[1824] = getOpcodeRep((char)0, (char)1, 1825);
        op[1825] = getOpcodeRnm(6, 15); // WSP
        {char[] a = {40}; op[1826] = getOpcodeTls(a);}
        op[1827] = getOpcodeRep((char)0, (char)1, 1828);
        {int[] a = {1829,1831,1832,1834}; op[1828] = getOpcodeCat(a);}
        op[1829] = getOpcodeRep((char)0, (char)1, 1830);
        op[1830] = getOpcodeRnm(6, 15); // WSP
        op[1831] = getOpcodeRnm(270, 1674); // commonExpr
        op[1832] = getOpcodeRep((char)0, (char)1, 1833);
        op[1833] = getOpcodeRnm(6, 15); // WSP
        {char[] a = {44}; op[1834] = getOpcodeTls(a);}
        op[1835] = getOpcodeRep((char)0, (char)1, 1836);
        op[1836] = getOpcodeRnm(6, 15); // WSP
        op[1837] = getOpcodeRnm(96, 523); // qualifiedTypeName
        op[1838] = getOpcodeRep((char)0, (char)1, 1839);
        op[1839] = getOpcodeRnm(6, 15); // WSP
        {char[] a = {41}; op[1840] = getOpcodeTls(a);}
        {int[] a = {1842,1843,1845,1846,1854,1856,1857,1859}; op[1841] = getOpcodeCat(a);}
        {char[] a = {99,97,115,116}; op[1842] = getOpcodeTls(a);}
        op[1843] = getOpcodeRep((char)0, (char)1, 1844);
        op[1844] = getOpcodeRnm(6, 15); // WSP
        {char[] a = {40}; op[1845] = getOpcodeTls(a);}
        op[1846] = getOpcodeRep((char)0, (char)1, 1847);
        {int[] a = {1848,1850,1851,1853}; op[1847] = getOpcodeCat(a);}
        op[1848] = getOpcodeRep((char)0, (char)1, 1849);
        op[1849] = getOpcodeRnm(6, 15); // WSP
        op[1850] = getOpcodeRnm(270, 1674); // commonExpr
        op[1851] = getOpcodeRep((char)0, (char)1, 1852);
        op[1852] = getOpcodeRnm(6, 15); // WSP
        {char[] a = {44}; op[1853] = getOpcodeTls(a);}
        op[1854] = getOpcodeRep((char)0, (char)1, 1855);
        op[1855] = getOpcodeRnm(6, 15); // WSP
        op[1856] = getOpcodeRnm(96, 523); // qualifiedTypeName
        op[1857] = getOpcodeRep((char)0, (char)1, 1858);
        op[1858] = getOpcodeRnm(6, 15); // WSP
        {char[] a = {41}; op[1859] = getOpcodeTls(a);}
        {int[] a = {1861,1862,1864,1865,1873,1875,1876,1878}; op[1860] = getOpcodeCat(a);}
        {char[] a = {99,97,115,116}; op[1861] = getOpcodeTls(a);}
        op[1862] = getOpcodeRep((char)0, (char)1, 1863);
        op[1863] = getOpcodeRnm(6, 15); // WSP
        {char[] a = {40}; op[1864] = getOpcodeTls(a);}
        op[1865] = getOpcodeRep((char)0, (char)1, 1866);
        {int[] a = {1867,1869,1870,1872}; op[1866] = getOpcodeCat(a);}
        op[1867] = getOpcodeRep((char)0, (char)1, 1868);
        op[1868] = getOpcodeRnm(6, 15); // WSP
        op[1869] = getOpcodeRnm(270, 1674); // commonExpr
        op[1870] = getOpcodeRep((char)0, (char)1, 1871);
        op[1871] = getOpcodeRnm(6, 15); // WSP
        {char[] a = {44}; op[1872] = getOpcodeTls(a);}
        op[1873] = getOpcodeRep((char)0, (char)1, 1874);
        op[1874] = getOpcodeRnm(6, 15); // WSP
        {char[] a = {69,100,109,46,66,111,111,108,101,97,110}; op[1875] = getOpcodeTls(a);}
        op[1876] = getOpcodeRep((char)0, (char)1, 1877);
        op[1877] = getOpcodeRnm(6, 15); // WSP
        {char[] a = {41}; op[1878] = getOpcodeTls(a);}
        {int[] a = {1880,1892,1896,1897,1898}; op[1879] = getOpcodeAlt(a);}
        {int[] a = {1881,1883,1887,1889,1890}; op[1880] = getOpcodeCat(a);}
        op[1881] = getOpcodeRep((char)0, (char)1, 1882);
        op[1882] = getOpcodeRnm(6, 15); // WSP
        op[1883] = getOpcodeRep((char)0, (char)1, 1884);
        {int[] a = {1885,1886}; op[1884] = getOpcodeCat(a);}
        op[1885] = getOpcodeRnm(97, 534); // qualifiedEntityTypeName
        {char[] a = {47}; op[1886] = getOpcodeTls(a);}
        op[1887] = getOpcodeRep((char)0, (char)1, 1888);
        op[1888] = getOpcodeRnm(348, 2443); // lambdaPredicatePrefixExpr
        op[1889] = getOpcodeRnm(118, 611); // entityColNavigationProperty
        op[1890] = getOpcodeRep((char)0, (char)1, 1891);
        op[1891] = getOpcodeRnm(298, 1949); // collectionNavigationExpr
        {int[] a = {1893,1894}; op[1892] = getOpcodeCat(a);}
        op[1893] = getOpcodeRnm(117, 610); // entityNavigationProperty
        op[1894] = getOpcodeRep((char)0, (char)1, 1895);
        op[1895] = getOpcodeRnm(299, 1959); // singleNavigationExpr
        op[1896] = getOpcodeRnm(212, 1378); // primitivePropertyPath
        op[1897] = getOpcodeRnm(213, 1387); // complexPropertyPath
        {int[] a = {1899,1900}; op[1898] = getOpcodeCat(a);}
        op[1899] = getOpcodeRnm(214, 1398); // collectionPropertyPath
        op[1900] = getOpcodeRep((char)0, (char)1, 1901);
        {int[] a = {1902,1903}; op[1901] = getOpcodeAlt(a);}
        op[1902] = getOpcodeRnm(304, 2046); // anyExpr
        op[1903] = getOpcodeRnm(305, 2054); // allExpr
        {int[] a = {1905,1909}; op[1904] = getOpcodeCat(a);}
        op[1905] = getOpcodeRep((char)0, (char)1, 1906);
        {int[] a = {1907,1908}; op[1906] = getOpcodeCat(a);}
        op[1907] = getOpcodeRnm(97, 534); // qualifiedEntityTypeName
        {char[] a = {47}; op[1908] = getOpcodeTls(a);}
        op[1909] = getOpcodeRnm(346, 2441); // entityProperty
        {int[] a = {1911,1912,1914,1915,1917,1921}; op[1910] = getOpcodeCat(a);}
        op[1911] = getOpcodeRnm(270, 1674); // commonExpr
        op[1912] = getOpcodeRep((char)0, (char)1, 1913);
        op[1913] = getOpcodeRnm(6, 15); // WSP
        {char[] a = {47}; op[1914] = getOpcodeTls(a);}
        op[1915] = getOpcodeRep((char)0, (char)1, 1916);
        op[1916] = getOpcodeRnm(6, 15); // WSP
        op[1917] = getOpcodeRep((char)0, (char)1, 1918);
        {int[] a = {1919,1920}; op[1918] = getOpcodeCat(a);}
        op[1919] = getOpcodeRnm(97, 534); // qualifiedEntityTypeName
        {char[] a = {47}; op[1920] = getOpcodeTls(a);}
        op[1921] = getOpcodeRnm(212, 1378); // primitivePropertyPath
        {int[] a = {1923,1937,1941,1942,1943}; op[1922] = getOpcodeAlt(a);}
        {int[] a = {1924,1925,1927,1928,1930,1934,1935}; op[1923] = getOpcodeCat(a);}
        op[1924] = getOpcodeRnm(270, 1674); // commonExpr
        op[1925] = getOpcodeRep((char)0, (char)1, 1926);
        op[1926] = getOpcodeRnm(6, 15); // WSP
        {char[] a = {47}; op[1927] = getOpcodeTls(a);}
        op[1928] = getOpcodeRep((char)0, (char)1, 1929);
        op[1929] = getOpcodeRnm(6, 15); // WSP
        op[1930] = getOpcodeRep((char)0, (char)1, 1931);
        {int[] a = {1932,1933}; op[1931] = getOpcodeCat(a);}
        op[1932] = getOpcodeRnm(97, 534); // qualifiedEntityTypeName
        {char[] a = {47}; op[1933] = getOpcodeTls(a);}
        op[1934] = getOpcodeRnm(118, 611); // entityColNavigationProperty
        op[1935] = getOpcodeRep((char)0, (char)1, 1936);
        op[1936] = getOpcodeRnm(298, 1949); // collectionNavigationExpr
        {int[] a = {1938,1939}; op[1937] = getOpcodeCat(a);}
        op[1938] = getOpcodeRnm(117, 610); // entityNavigationProperty
        op[1939] = getOpcodeRep((char)0, (char)1, 1940);
        op[1940] = getOpcodeRnm(299, 1959); // singleNavigationExpr
        op[1941] = getOpcodeRnm(212, 1378); // primitivePropertyPath
        op[1942] = getOpcodeRnm(213, 1387); // complexPropertyPath
        {int[] a = {1944,1945}; op[1943] = getOpcodeCat(a);}
        op[1944] = getOpcodeRnm(214, 1398); // collectionPropertyPath
        op[1945] = getOpcodeRep((char)0, (char)1, 1946);
        {int[] a = {1947,1948}; op[1946] = getOpcodeAlt(a);}
        op[1947] = getOpcodeRnm(304, 2046); // anyExpr
        op[1948] = getOpcodeRnm(305, 2054); // allExpr
        {int[] a = {1950,1954,1955}; op[1949] = getOpcodeCat(a);}
        op[1950] = getOpcodeRep((char)0, (char)1, 1951);
        {int[] a = {1952,1953}; op[1951] = getOpcodeCat(a);}
        {char[] a = {47}; op[1952] = getOpcodeTls(a);}
        op[1953] = getOpcodeRnm(97, 534); // qualifiedEntityTypeName
        {char[] a = {47}; op[1954] = getOpcodeTls(a);}
        {int[] a = {1956,1957,1958}; op[1955] = getOpcodeAlt(a);}
        op[1956] = getOpcodeRnm(302, 2012); // boundFunctionExpr
        op[1957] = getOpcodeRnm(304, 2046); // anyExpr
        op[1958] = getOpcodeRnm(305, 2054); // allExpr
        {int[] a = {1960,1964,1965}; op[1959] = getOpcodeCat(a);}
        op[1960] = getOpcodeRep((char)0, (char)1, 1961);
        {int[] a = {1962,1963}; op[1961] = getOpcodeCat(a);}
        {char[] a = {47}; op[1962] = getOpcodeTls(a);}
        op[1963] = getOpcodeRnm(97, 534); // qualifiedEntityTypeName
        {char[] a = {47}; op[1964] = getOpcodeTls(a);}
        {int[] a = {1966,1970,1974,1975,1976,1982,1983}; op[1965] = getOpcodeAlt(a);}
        {int[] a = {1967,1968}; op[1966] = getOpcodeCat(a);}
        op[1967] = getOpcodeRnm(118, 611); // entityColNavigationProperty
        op[1968] = getOpcodeRep((char)0, (char)1, 1969);
        op[1969] = getOpcodeRnm(298, 1949); // collectionNavigationExpr
        {int[] a = {1971,1972}; op[1970] = getOpcodeCat(a);}
        op[1971] = getOpcodeRnm(117, 610); // entityNavigationProperty
        op[1972] = getOpcodeRep((char)0, (char)1, 1973);
        op[1973] = getOpcodeRnm(299, 1959); // singleNavigationExpr
        op[1974] = getOpcodeRnm(212, 1378); // primitivePropertyPath
        op[1975] = getOpcodeRnm(213, 1387); // complexPropertyPath
        {int[] a = {1977,1978}; op[1976] = getOpcodeCat(a);}
        op[1977] = getOpcodeRnm(214, 1398); // collectionPropertyPath
        op[1978] = getOpcodeRep((char)0, (char)1, 1979);
        {int[] a = {1980,1981}; op[1979] = getOpcodeAlt(a);}
        op[1980] = getOpcodeRnm(304, 2046); // anyExpr
        op[1981] = getOpcodeRnm(305, 2054); // allExpr
        op[1982] = getOpcodeRnm(215, 1409); // streamPropertyPath
        op[1983] = getOpcodeRnm(302, 2012); // boundFunctionExpr
        {int[] a = {1985,1989,1993,1997,2001,2007}; op[1984] = getOpcodeAlt(a);}
        {int[] a = {1986,1987}; op[1985] = getOpcodeCat(a);}
        op[1986] = getOpcodeRnm(344, 2439); // entityColFuncCall
        op[1987] = getOpcodeRep((char)0, (char)1, 1988);
        op[1988] = getOpcodeRnm(299, 1959); // singleNavigationExpr
        {int[] a = {1990,1991}; op[1989] = getOpcodeCat(a);}
        op[1990] = getOpcodeRnm(345, 2440); // entityFuncCall
        op[1991] = getOpcodeRep((char)0, (char)1, 1992);
        op[1992] = getOpcodeRnm(298, 1949); // collectionNavigationExpr
        {int[] a = {1994,1995}; op[1993] = getOpcodeCat(a);}
        op[1994] = getOpcodeRnm(352, 2447); // primitiveFuncCall
        op[1995] = getOpcodeRep((char)0, (char)1, 1996);
        op[1996] = getOpcodeRnm(302, 2012); // boundFunctionExpr
        {int[] a = {1998,1999}; op[1997] = getOpcodeCat(a);}
        op[1998] = getOpcodeRnm(350, 2445); // primitiveColFuncCall
        op[1999] = getOpcodeRep((char)0, (char)1, 2000);
        op[2000] = getOpcodeRnm(302, 2012); // boundFunctionExpr
        {int[] a = {2002,2003}; op[2001] = getOpcodeCat(a);}
        op[2002] = getOpcodeRnm(342, 2437); // complexFuncCall
        op[2003] = getOpcodeRep((char)0, (char)1, 2004);
        {int[] a = {2005,2006}; op[2004] = getOpcodeAlt(a);}
        op[2005] = getOpcodeRnm(213, 1387); // complexPropertyPath
        op[2006] = getOpcodeRnm(302, 2012); // boundFunctionExpr
        {int[] a = {2008,2009}; op[2007] = getOpcodeCat(a);}
        op[2008] = getOpcodeRnm(340, 2435); // complexColFuncCall
        op[2009] = getOpcodeRep((char)0, (char)1, 2010);
        op[2010] = getOpcodeRnm(302, 2012); // boundFunctionExpr
        op[2011] = getOpcodeRnm(300, 1984); // functionExpr
        {int[] a = {2013,2017,2018}; op[2012] = getOpcodeCat(a);}
        op[2013] = getOpcodeRep((char)0, (char)1, 2014);
        {int[] a = {2015,2016}; op[2014] = getOpcodeCat(a);}
        {char[] a = {47}; op[2015] = getOpcodeTls(a);}
        op[2016] = getOpcodeRnm(97, 534); // qualifiedEntityTypeName
        {char[] a = {47}; op[2017] = getOpcodeTls(a);}
        {int[] a = {2019,2023,2027,2031,2035,2041}; op[2018] = getOpcodeAlt(a);}
        {int[] a = {2020,2021}; op[2019] = getOpcodeCat(a);}
        op[2020] = getOpcodeRnm(232, 1477); // boundEntityColFuncCall
        op[2021] = getOpcodeRep((char)0, (char)1, 2022);
        op[2022] = getOpcodeRnm(299, 1959); // singleNavigationExpr
        {int[] a = {2024,2025}; op[2023] = getOpcodeCat(a);}
        op[2024] = getOpcodeRnm(231, 1474); // boundEntityFuncCall
        op[2025] = getOpcodeRep((char)0, (char)1, 2026);
        op[2026] = getOpcodeRnm(298, 1949); // collectionNavigationExpr
        {int[] a = {2028,2029}; op[2027] = getOpcodeCat(a);}
        op[2028] = getOpcodeRnm(235, 1486); // boundPrimitiveFuncCall
        op[2029] = getOpcodeRep((char)0, (char)1, 2030);
        op[2030] = getOpcodeRnm(302, 2012); // boundFunctionExpr
        {int[] a = {2032,2033}; op[2031] = getOpcodeCat(a);}
        op[2032] = getOpcodeRnm(236, 1489); // boundPrimitiveColFuncCall
        op[2033] = getOpcodeRep((char)0, (char)1, 2034);
        op[2034] = getOpcodeRnm(302, 2012); // boundFunctionExpr
        {int[] a = {2036,2037}; op[2035] = getOpcodeCat(a);}
        op[2036] = getOpcodeRnm(233, 1480); // boundComplexFuncCall
        op[2037] = getOpcodeRep((char)0, (char)1, 2038);
        {int[] a = {2039,2040}; op[2038] = getOpcodeAlt(a);}
        op[2039] = getOpcodeRnm(213, 1387); // complexPropertyPath
        op[2040] = getOpcodeRnm(302, 2012); // boundFunctionExpr
        {int[] a = {2042,2043}; op[2041] = getOpcodeCat(a);}
        op[2042] = getOpcodeRnm(234, 1483); // boundComplexColFuncCall
        op[2043] = getOpcodeRep((char)0, (char)1, 2044);
        op[2044] = getOpcodeRnm(302, 2012); // boundFunctionExpr
        op[2045] = getOpcodeRnm(302, 2012); // boundFunctionExpr
        {int[] a = {2047,2048,2053}; op[2046] = getOpcodeCat(a);}
        {char[] a = {97,110,121,40}; op[2047] = getOpcodeTls(a);}
        op[2048] = getOpcodeRep((char)0, (char)1, 2049);
        {int[] a = {2050,2051,2052}; op[2049] = getOpcodeCat(a);}
        op[2050] = getOpcodeRnm(307, 2061); // lambdaVariableExpr
        {char[] a = {58}; op[2051] = getOpcodeTls(a);}
        op[2052] = getOpcodeRnm(309, 2065); // lambdaPredicateExpr
        {char[] a = {41}; op[2053] = getOpcodeTls(a);}
        {int[] a = {2055,2056,2057,2058,2059}; op[2054] = getOpcodeCat(a);}
        {char[] a = {97,108,108,40}; op[2055] = getOpcodeTls(a);}
        op[2056] = getOpcodeRnm(307, 2061); // lambdaVariableExpr
        {char[] a = {58}; op[2057] = getOpcodeTls(a);}
        op[2058] = getOpcodeRnm(309, 2065); // lambdaPredicateExpr
        {char[] a = {41}; op[2059] = getOpcodeTls(a);}
        {char[] a = {36,105,116}; op[2060] = getOpcodeTls(a);}
        op[2061] = getOpcodeRnm(86, 492); // odataIdentifier
        {int[] a = {2063,2064}; op[2062] = getOpcodeAlt(a);}
        op[2063] = getOpcodeRnm(306, 2060); // implicitVariableExpr
        op[2064] = getOpcodeRnm(307, 2061); // lambdaVariableExpr
        op[2065] = getOpcodeRnm(271, 1694); // boolCommonExpr
        {int[] a = {2067,2068,2069,2070,2071,2072,2073,2074,2075,2076,2077,2078,2079,2080,2081,2082,2083,2084,2085,2086,2087}; op[2066] = getOpcodeAlt(a);}
        op[2067] = getOpcodeRnm(311, 2088); // boolMethodExpr
        op[2068] = getOpcodeRnm(313, 2112); // indexOfMethodCallExpr
        op[2069] = getOpcodeRnm(314, 2129); // replaceMethodCallExpr
        op[2070] = getOpcodeRnm(316, 2169); // toLowerMethodCallExpr
        op[2071] = getOpcodeRnm(317, 2180); // toUpperMethodCallExpr
        op[2072] = getOpcodeRnm(318, 2191); // trimMethodCallExpr
        op[2073] = getOpcodeRnm(355, 2450); // substringMethodCallExpr
        op[2074] = getOpcodeRnm(321, 2246); // concatMethodCallExpr
        op[2075] = getOpcodeRnm(322, 2265); // lengthMethodCallExpr
        op[2076] = getOpcodeRnm(324, 2287); // yearMethodCallExpr
        op[2077] = getOpcodeRnm(325, 2298); // monthMethodCallExpr
        op[2078] = getOpcodeRnm(326, 2309); // dayMethodCallExpr
        op[2079] = getOpcodeRnm(327, 2320); // hourMethodCallExpr
        op[2080] = getOpcodeRnm(328, 2331); // minuteMethodCallExpr
        op[2081] = getOpcodeRnm(329, 2342); // secondMethodCallExpr
        op[2082] = getOpcodeRnm(330, 2353); // roundMethodCallExpr
        op[2083] = getOpcodeRnm(331, 2364); // floorMethodCallExpr
        op[2084] = getOpcodeRnm(332, 2375); // ceilingMethodCallExpr
        op[2085] = getOpcodeRnm(333, 2386); // distanceMethodCallExpr
        op[2086] = getOpcodeRnm(334, 2403); // geoLengthMethodCallExpr
        op[2087] = getOpcodeRnm(323, 2276); // getTotalOffsetMinutesExpr
        {int[] a = {2089,2090,2091,2092,2093,2094}; op[2088] = getOpcodeAlt(a);}
        op[2089] = getOpcodeRnm(312, 2095); // endsWithMethodCallExpr
        op[2090] = getOpcodeRnm(315, 2152); // startsWithMethodCallExpr
        op[2091] = getOpcodeRnm(320, 2227); // substringOfMethodCallExpr
        op[2092] = getOpcodeRnm(335, 2414); // intersectsMethodCallExpr
        op[2093] = getOpcodeRnm(337, 2432); // anyMethodCallExpr
        op[2094] = getOpcodeRnm(336, 2431); // allMethodCallExpr
        {int[] a = {2096,2097,2099,2100,2102,2103,2105,2106,2108,2109,2111}; op[2095] = getOpcodeCat(a);}
        {char[] a = {101,110,100,115,119,105,116,104}; op[2096] = getOpcodeTls(a);}
        op[2097] = getOpcodeRep((char)0, (char)1, 2098);
        op[2098] = getOpcodeRnm(6, 15); // WSP
        {char[] a = {40}; op[2099] = getOpcodeTls(a);}
        op[2100] = getOpcodeRep((char)0, (char)1, 2101);
        op[2101] = getOpcodeRnm(6, 15); // WSP
        op[2102] = getOpcodeRnm(270, 1674); // commonExpr
        op[2103] = getOpcodeRep((char)0, (char)1, 2104);
        op[2104] = getOpcodeRnm(6, 15); // WSP
        {char[] a = {44}; op[2105] = getOpcodeTls(a);}
        op[2106] = getOpcodeRep((char)0, (char)1, 2107);
        op[2107] = getOpcodeRnm(6, 15); // WSP
        op[2108] = getOpcodeRnm(270, 1674); // commonExpr
        op[2109] = getOpcodeRep((char)0, (char)1, 2110);
        op[2110] = getOpcodeRnm(6, 15); // WSP
        {char[] a = {41}; op[2111] = getOpcodeTls(a);}
        {int[] a = {2113,2114,2116,2117,2119,2120,2122,2123,2125,2126,2128}; op[2112] = getOpcodeCat(a);}
        {char[] a = {105,110,100,101,120,111,102}; op[2113] = getOpcodeTls(a);}
        op[2114] = getOpcodeRep((char)0, (char)1, 2115);
        op[2115] = getOpcodeRnm(6, 15); // WSP
        {char[] a = {40}; op[2116] = getOpcodeTls(a);}
        op[2117] = getOpcodeRep((char)0, (char)1, 2118);
        op[2118] = getOpcodeRnm(6, 15); // WSP
        op[2119] = getOpcodeRnm(270, 1674); // commonExpr
        op[2120] = getOpcodeRep((char)0, (char)1, 2121);
        op[2121] = getOpcodeRnm(6, 15); // WSP
        {char[] a = {44}; op[2122] = getOpcodeTls(a);}
        op[2123] = getOpcodeRep((char)0, (char)1, 2124);
        op[2124] = getOpcodeRnm(6, 15); // WSP
        op[2125] = getOpcodeRnm(270, 1674); // commonExpr
        op[2126] = getOpcodeRep((char)0, (char)1, 2127);
        op[2127] = getOpcodeRnm(6, 15); // WSP
        {char[] a = {41}; op[2128] = getOpcodeTls(a);}
        {int[] a = {2130,2131,2133,2134,2136,2137,2139,2140,2142,2143,2145,2146,2148,2149,2151}; op[2129] = getOpcodeCat(a);}
        {char[] a = {114,101,112,108,97,99,101}; op[2130] = getOpcodeTls(a);}
        op[2131] = getOpcodeRep((char)0, (char)1, 2132);
        op[2132] = getOpcodeRnm(6, 15); // WSP
        {char[] a = {40}; op[2133] = getOpcodeTls(a);}
        op[2134] = getOpcodeRep((char)0, (char)1, 2135);
        op[2135] = getOpcodeRnm(6, 15); // WSP
        op[2136] = getOpcodeRnm(270, 1674); // commonExpr
        op[2137] = getOpcodeRep((char)0, (char)1, 2138);
        op[2138] = getOpcodeRnm(6, 15); // WSP
        {char[] a = {44}; op[2139] = getOpcodeTls(a);}
        op[2140] = getOpcodeRep((char)0, (char)1, 2141);
        op[2141] = getOpcodeRnm(6, 15); // WSP
        op[2142] = getOpcodeRnm(270, 1674); // commonExpr
        op[2143] = getOpcodeRep((char)0, (char)1, 2144);
        op[2144] = getOpcodeRnm(6, 15); // WSP
        {char[] a = {44}; op[2145] = getOpcodeTls(a);}
        op[2146] = getOpcodeRep((char)0, (char)1, 2147);
        op[2147] = getOpcodeRnm(6, 15); // WSP
        op[2148] = getOpcodeRnm(270, 1674); // commonExpr
        op[2149] = getOpcodeRep((char)0, (char)1, 2150);
        op[2150] = getOpcodeRnm(6, 15); // WSP
        {char[] a = {41}; op[2151] = getOpcodeTls(a);}
        {int[] a = {2153,2154,2156,2157,2159,2160,2162,2163,2165,2166,2168}; op[2152] = getOpcodeCat(a);}
        {char[] a = {115,116,97,114,116,115,119,105,116,104}; op[2153] = getOpcodeTls(a);}
        op[2154] = getOpcodeRep((char)0, (char)1, 2155);
        op[2155] = getOpcodeRnm(6, 15); // WSP
        {char[] a = {40}; op[2156] = getOpcodeTls(a);}
        op[2157] = getOpcodeRep((char)0, (char)1, 2158);
        op[2158] = getOpcodeRnm(6, 15); // WSP
        op[2159] = getOpcodeRnm(270, 1674); // commonExpr
        op[2160] = getOpcodeRep((char)0, (char)1, 2161);
        op[2161] = getOpcodeRnm(6, 15); // WSP
        {char[] a = {44}; op[2162] = getOpcodeTls(a);}
        op[2163] = getOpcodeRep((char)0, (char)1, 2164);
        op[2164] = getOpcodeRnm(6, 15); // WSP
        op[2165] = getOpcodeRnm(270, 1674); // commonExpr
        op[2166] = getOpcodeRep((char)0, (char)1, 2167);
        op[2167] = getOpcodeRnm(6, 15); // WSP
        {char[] a = {41}; op[2168] = getOpcodeTls(a);}
        {int[] a = {2170,2171,2173,2174,2176,2177,2179}; op[2169] = getOpcodeCat(a);}
        {char[] a = {116,111,108,111,119,101,114}; op[2170] = getOpcodeTls(a);}
        op[2171] = getOpcodeRep((char)0, (char)1, 2172);
        op[2172] = getOpcodeRnm(6, 15); // WSP
        {char[] a = {40}; op[2173] = getOpcodeTls(a);}
        op[2174] = getOpcodeRep((char)0, (char)1, 2175);
        op[2175] = getOpcodeRnm(6, 15); // WSP
        op[2176] = getOpcodeRnm(270, 1674); // commonExpr
        op[2177] = getOpcodeRep((char)0, (char)1, 2178);
        op[2178] = getOpcodeRnm(6, 15); // WSP
        {char[] a = {41}; op[2179] = getOpcodeTls(a);}
        {int[] a = {2181,2182,2184,2185,2187,2188,2190}; op[2180] = getOpcodeCat(a);}
        {char[] a = {116,111,117,112,112,101,114}; op[2181] = getOpcodeTls(a);}
        op[2182] = getOpcodeRep((char)0, (char)1, 2183);
        op[2183] = getOpcodeRnm(6, 15); // WSP
        {char[] a = {40}; op[2184] = getOpcodeTls(a);}
        op[2185] = getOpcodeRep((char)0, (char)1, 2186);
        op[2186] = getOpcodeRnm(6, 15); // WSP
        op[2187] = getOpcodeRnm(270, 1674); // commonExpr
        op[2188] = getOpcodeRep((char)0, (char)1, 2189);
        op[2189] = getOpcodeRnm(6, 15); // WSP
        {char[] a = {41}; op[2190] = getOpcodeTls(a);}
        {int[] a = {2192,2193,2195,2196,2198,2199,2201}; op[2191] = getOpcodeCat(a);}
        {char[] a = {116,114,105,109}; op[2192] = getOpcodeTls(a);}
        op[2193] = getOpcodeRep((char)0, (char)1, 2194);
        op[2194] = getOpcodeRnm(6, 15); // WSP
        {char[] a = {40}; op[2195] = getOpcodeTls(a);}
        op[2196] = getOpcodeRep((char)0, (char)1, 2197);
        op[2197] = getOpcodeRnm(6, 15); // WSP
        op[2198] = getOpcodeRnm(270, 1674); // commonExpr
        op[2199] = getOpcodeRep((char)0, (char)1, 2200);
        op[2200] = getOpcodeRnm(6, 15); // WSP
        {char[] a = {41}; op[2201] = getOpcodeTls(a);}
        {int[] a = {2203,2204,2206,2207,2209,2210,2212,2213,2215,2216,2218,2226}; op[2202] = getOpcodeCat(a);}
        {char[] a = {115,117,98,115,116,114,105,110,103}; op[2203] = getOpcodeTls(a);}
        op[2204] = getOpcodeRep((char)0, (char)1, 2205);
        op[2205] = getOpcodeRnm(6, 15); // WSP
        {char[] a = {40}; op[2206] = getOpcodeTls(a);}
        op[2207] = getOpcodeRep((char)0, (char)1, 2208);
        op[2208] = getOpcodeRnm(6, 15); // WSP
        op[2209] = getOpcodeRnm(270, 1674); // commonExpr
        op[2210] = getOpcodeRep((char)0, (char)1, 2211);
        op[2211] = getOpcodeRnm(6, 15); // WSP
        {char[] a = {44}; op[2212] = getOpcodeTls(a);}
        op[2213] = getOpcodeRep((char)0, (char)1, 2214);
        op[2214] = getOpcodeRnm(6, 15); // WSP
        op[2215] = getOpcodeRnm(270, 1674); // commonExpr
        op[2216] = getOpcodeRep((char)0, (char)1, 2217);
        op[2217] = getOpcodeRnm(6, 15); // WSP
        op[2218] = getOpcodeRep((char)0, (char)1, 2219);
        {int[] a = {2220,2221,2223,2224}; op[2219] = getOpcodeCat(a);}
        {char[] a = {44}; op[2220] = getOpcodeTls(a);}
        op[2221] = getOpcodeRep((char)0, (char)1, 2222);
        op[2222] = getOpcodeRnm(6, 15); // WSP
        op[2223] = getOpcodeRnm(270, 1674); // commonExpr
        op[2224] = getOpcodeRep((char)0, (char)1, 2225);
        op[2225] = getOpcodeRnm(6, 15); // WSP
        {char[] a = {41}; op[2226] = getOpcodeTls(a);}
        {int[] a = {2228,2229,2231,2232,2234,2235,2237,2245}; op[2227] = getOpcodeCat(a);}
        {char[] a = {115,117,98,115,116,114,105,110,103,111,102}; op[2228] = getOpcodeTls(a);}
        op[2229] = getOpcodeRep((char)0, (char)1, 2230);
        op[2230] = getOpcodeRnm(6, 15); // WSP
        {char[] a = {40}; op[2231] = getOpcodeTls(a);}
        op[2232] = getOpcodeRep((char)0, (char)1, 2233);
        op[2233] = getOpcodeRnm(6, 15); // WSP
        op[2234] = getOpcodeRnm(270, 1674); // commonExpr
        op[2235] = getOpcodeRep((char)0, (char)1, 2236);
        op[2236] = getOpcodeRnm(6, 15); // WSP
        op[2237] = getOpcodeRep((char)0, (char)1, 2238);
        {int[] a = {2239,2240,2242,2243}; op[2238] = getOpcodeCat(a);}
        {char[] a = {44}; op[2239] = getOpcodeTls(a);}
        op[2240] = getOpcodeRep((char)0, (char)1, 2241);
        op[2241] = getOpcodeRnm(6, 15); // WSP
        op[2242] = getOpcodeRnm(270, 1674); // commonExpr
        op[2243] = getOpcodeRep((char)0, (char)1, 2244);
        op[2244] = getOpcodeRnm(6, 15); // WSP
        {char[] a = {41}; op[2245] = getOpcodeTls(a);}
        {int[] a = {2247,2248,2250,2251,2253,2254,2256,2264}; op[2246] = getOpcodeCat(a);}
        {char[] a = {99,111,110,99,97,116}; op[2247] = getOpcodeTls(a);}
        op[2248] = getOpcodeRep((char)0, (char)1, 2249);
        op[2249] = getOpcodeRnm(6, 15); // WSP
        {char[] a = {40}; op[2250] = getOpcodeTls(a);}
        op[2251] = getOpcodeRep((char)0, (char)1, 2252);
        op[2252] = getOpcodeRnm(6, 15); // WSP
        op[2253] = getOpcodeRnm(270, 1674); // commonExpr
        op[2254] = getOpcodeRep((char)0, (char)1, 2255);
        op[2255] = getOpcodeRnm(6, 15); // WSP
        op[2256] = getOpcodeRep((char)0, (char)1, 2257);
        {int[] a = {2258,2259,2261,2262}; op[2257] = getOpcodeCat(a);}
        {char[] a = {44}; op[2258] = getOpcodeTls(a);}
        op[2259] = getOpcodeRep((char)0, (char)1, 2260);
        op[2260] = getOpcodeRnm(6, 15); // WSP
        op[2261] = getOpcodeRnm(270, 1674); // commonExpr
        op[2262] = getOpcodeRep((char)0, (char)1, 2263);
        op[2263] = getOpcodeRnm(6, 15); // WSP
        {char[] a = {41}; op[2264] = getOpcodeTls(a);}
        {int[] a = {2266,2267,2269,2270,2272,2273,2275}; op[2265] = getOpcodeCat(a);}
        {char[] a = {108,101,110,103,116,104}; op[2266] = getOpcodeTls(a);}
        op[2267] = getOpcodeRep((char)0, (char)1, 2268);
        op[2268] = getOpcodeRnm(6, 15); // WSP
        {char[] a = {40}; op[2269] = getOpcodeTls(a);}
        op[2270] = getOpcodeRep((char)0, (char)1, 2271);
        op[2271] = getOpcodeRnm(6, 15); // WSP
        op[2272] = getOpcodeRnm(270, 1674); // commonExpr
        op[2273] = getOpcodeRep((char)0, (char)1, 2274);
        op[2274] = getOpcodeRnm(6, 15); // WSP
        {char[] a = {41}; op[2275] = getOpcodeTls(a);}
        {int[] a = {2277,2278,2280,2281,2283,2284,2286}; op[2276] = getOpcodeCat(a);}
        {char[] a = {103,101,116,116,111,116,97,108,111,102,102,115,101,116,109,105,110,117,116,101,115}; op[2277] = getOpcodeTls(a);}
        op[2278] = getOpcodeRep((char)0, (char)1, 2279);
        op[2279] = getOpcodeRnm(6, 15); // WSP
        {char[] a = {40}; op[2280] = getOpcodeTls(a);}
        op[2281] = getOpcodeRep((char)0, (char)1, 2282);
        op[2282] = getOpcodeRnm(6, 15); // WSP
        op[2283] = getOpcodeRnm(270, 1674); // commonExpr
        op[2284] = getOpcodeRep((char)0, (char)1, 2285);
        op[2285] = getOpcodeRnm(6, 15); // WSP
        {char[] a = {41}; op[2286] = getOpcodeTls(a);}
        {int[] a = {2288,2289,2291,2292,2294,2295,2297}; op[2287] = getOpcodeCat(a);}
        {char[] a = {121,101,97,114}; op[2288] = getOpcodeTls(a);}
        op[2289] = getOpcodeRep((char)0, (char)1, 2290);
        op[2290] = getOpcodeRnm(6, 15); // WSP
        {char[] a = {40}; op[2291] = getOpcodeTls(a);}
        op[2292] = getOpcodeRep((char)0, (char)1, 2293);
        op[2293] = getOpcodeRnm(6, 15); // WSP
        op[2294] = getOpcodeRnm(270, 1674); // commonExpr
        op[2295] = getOpcodeRep((char)0, (char)1, 2296);
        op[2296] = getOpcodeRnm(6, 15); // WSP
        {char[] a = {41}; op[2297] = getOpcodeTls(a);}
        {int[] a = {2299,2300,2302,2303,2305,2306,2308}; op[2298] = getOpcodeCat(a);}
        {char[] a = {109,111,110,116,104}; op[2299] = getOpcodeTls(a);}
        op[2300] = getOpcodeRep((char)0, (char)1, 2301);
        op[2301] = getOpcodeRnm(6, 15); // WSP
        {char[] a = {40}; op[2302] = getOpcodeTls(a);}
        op[2303] = getOpcodeRep((char)0, (char)1, 2304);
        op[2304] = getOpcodeRnm(6, 15); // WSP
        op[2305] = getOpcodeRnm(270, 1674); // commonExpr
        op[2306] = getOpcodeRep((char)0, (char)1, 2307);
        op[2307] = getOpcodeRnm(6, 15); // WSP
        {char[] a = {41}; op[2308] = getOpcodeTls(a);}
        {int[] a = {2310,2311,2313,2314,2316,2317,2319}; op[2309] = getOpcodeCat(a);}
        {char[] a = {100,97,121}; op[2310] = getOpcodeTls(a);}
        op[2311] = getOpcodeRep((char)0, (char)1, 2312);
        op[2312] = getOpcodeRnm(6, 15); // WSP
        {char[] a = {40}; op[2313] = getOpcodeTls(a);}
        op[2314] = getOpcodeRep((char)0, (char)1, 2315);
        op[2315] = getOpcodeRnm(6, 15); // WSP
        op[2316] = getOpcodeRnm(270, 1674); // commonExpr
        op[2317] = getOpcodeRep((char)0, (char)1, 2318);
        op[2318] = getOpcodeRnm(6, 15); // WSP
        {char[] a = {41}; op[2319] = getOpcodeTls(a);}
        {int[] a = {2321,2322,2324,2325,2327,2328,2330}; op[2320] = getOpcodeCat(a);}
        {char[] a = {104,111,117,114}; op[2321] = getOpcodeTls(a);}
        op[2322] = getOpcodeRep((char)0, (char)1, 2323);
        op[2323] = getOpcodeRnm(6, 15); // WSP
        {char[] a = {40}; op[2324] = getOpcodeTls(a);}
        op[2325] = getOpcodeRep((char)0, (char)1, 2326);
        op[2326] = getOpcodeRnm(6, 15); // WSP
        op[2327] = getOpcodeRnm(270, 1674); // commonExpr
        op[2328] = getOpcodeRep((char)0, (char)1, 2329);
        op[2329] = getOpcodeRnm(6, 15); // WSP
        {char[] a = {41}; op[2330] = getOpcodeTls(a);}
        {int[] a = {2332,2333,2335,2336,2338,2339,2341}; op[2331] = getOpcodeCat(a);}
        {char[] a = {109,105,110,117,116,101}; op[2332] = getOpcodeTls(a);}
        op[2333] = getOpcodeRep((char)0, (char)1, 2334);
        op[2334] = getOpcodeRnm(6, 15); // WSP
        {char[] a = {40}; op[2335] = getOpcodeTls(a);}
        op[2336] = getOpcodeRep((char)0, (char)1, 2337);
        op[2337] = getOpcodeRnm(6, 15); // WSP
        op[2338] = getOpcodeRnm(270, 1674); // commonExpr
        op[2339] = getOpcodeRep((char)0, (char)1, 2340);
        op[2340] = getOpcodeRnm(6, 15); // WSP
        {char[] a = {41}; op[2341] = getOpcodeTls(a);}
        {int[] a = {2343,2344,2346,2347,2349,2350,2352}; op[2342] = getOpcodeCat(a);}
        {char[] a = {115,101,99,111,110,100}; op[2343] = getOpcodeTls(a);}
        op[2344] = getOpcodeRep((char)0, (char)1, 2345);
        op[2345] = getOpcodeRnm(6, 15); // WSP
        {char[] a = {40}; op[2346] = getOpcodeTls(a);}
        op[2347] = getOpcodeRep((char)0, (char)1, 2348);
        op[2348] = getOpcodeRnm(6, 15); // WSP
        op[2349] = getOpcodeRnm(270, 1674); // commonExpr
        op[2350] = getOpcodeRep((char)0, (char)1, 2351);
        op[2351] = getOpcodeRnm(6, 15); // WSP
        {char[] a = {41}; op[2352] = getOpcodeTls(a);}
        {int[] a = {2354,2355,2357,2358,2360,2361,2363}; op[2353] = getOpcodeCat(a);}
        {char[] a = {114,111,117,110,100}; op[2354] = getOpcodeTls(a);}
        op[2355] = getOpcodeRep((char)0, (char)1, 2356);
        op[2356] = getOpcodeRnm(6, 15); // WSP
        {char[] a = {40}; op[2357] = getOpcodeTls(a);}
        op[2358] = getOpcodeRep((char)0, (char)1, 2359);
        op[2359] = getOpcodeRnm(6, 15); // WSP
        op[2360] = getOpcodeRnm(270, 1674); // commonExpr
        op[2361] = getOpcodeRep((char)0, (char)1, 2362);
        op[2362] = getOpcodeRnm(6, 15); // WSP
        {char[] a = {41}; op[2363] = getOpcodeTls(a);}
        {int[] a = {2365,2366,2368,2369,2371,2372,2374}; op[2364] = getOpcodeCat(a);}
        {char[] a = {102,108,111,111,114}; op[2365] = getOpcodeTls(a);}
        op[2366] = getOpcodeRep((char)0, (char)1, 2367);
        op[2367] = getOpcodeRnm(6, 15); // WSP
        {char[] a = {40}; op[2368] = getOpcodeTls(a);}
        op[2369] = getOpcodeRep((char)0, (char)1, 2370);
        op[2370] = getOpcodeRnm(6, 15); // WSP
        op[2371] = getOpcodeRnm(270, 1674); // commonExpr
        op[2372] = getOpcodeRep((char)0, (char)1, 2373);
        op[2373] = getOpcodeRnm(6, 15); // WSP
        {char[] a = {41}; op[2374] = getOpcodeTls(a);}
        {int[] a = {2376,2377,2379,2380,2382,2383,2385}; op[2375] = getOpcodeCat(a);}
        {char[] a = {99,101,105,108,105,110,103}; op[2376] = getOpcodeTls(a);}
        op[2377] = getOpcodeRep((char)0, (char)1, 2378);
        op[2378] = getOpcodeRnm(6, 15); // WSP
        {char[] a = {40}; op[2379] = getOpcodeTls(a);}
        op[2380] = getOpcodeRep((char)0, (char)1, 2381);
        op[2381] = getOpcodeRnm(6, 15); // WSP
        op[2382] = getOpcodeRnm(270, 1674); // commonExpr
        op[2383] = getOpcodeRep((char)0, (char)1, 2384);
        op[2384] = getOpcodeRnm(6, 15); // WSP
        {char[] a = {41}; op[2385] = getOpcodeTls(a);}
        {int[] a = {2387,2388,2390,2391,2393,2394,2396,2397,2399,2400,2402}; op[2386] = getOpcodeCat(a);}
        {char[] a = {103,101,111,46,100,105,115,116,97,110,99,101}; op[2387] = getOpcodeTls(a);}
        op[2388] = getOpcodeRep((char)0, (char)1, 2389);
        op[2389] = getOpcodeRnm(6, 15); // WSP
        {char[] a = {40}; op[2390] = getOpcodeTls(a);}
        op[2391] = getOpcodeRep((char)0, (char)1, 2392);
        op[2392] = getOpcodeRnm(6, 15); // WSP
        op[2393] = getOpcodeRnm(270, 1674); // commonExpr
        op[2394] = getOpcodeRep((char)0, (char)1, 2395);
        op[2395] = getOpcodeRnm(6, 15); // WSP
        {char[] a = {44}; op[2396] = getOpcodeTls(a);}
        op[2397] = getOpcodeRep((char)0, (char)1, 2398);
        op[2398] = getOpcodeRnm(6, 15); // WSP
        op[2399] = getOpcodeRnm(270, 1674); // commonExpr
        op[2400] = getOpcodeRep((char)0, (char)1, 2401);
        op[2401] = getOpcodeRnm(6, 15); // WSP
        {char[] a = {41}; op[2402] = getOpcodeTls(a);}
        {int[] a = {2404,2405,2407,2408,2410,2411,2413}; op[2403] = getOpcodeCat(a);}
        {char[] a = {103,101,111,46,108,101,110,103,116,104}; op[2404] = getOpcodeTls(a);}
        op[2405] = getOpcodeRep((char)0, (char)1, 2406);
        op[2406] = getOpcodeRnm(6, 15); // WSP
        {char[] a = {40}; op[2407] = getOpcodeTls(a);}
        op[2408] = getOpcodeRep((char)0, (char)1, 2409);
        op[2409] = getOpcodeRnm(6, 15); // WSP
        op[2410] = getOpcodeRnm(270, 1674); // commonExpr
        op[2411] = getOpcodeRep((char)0, (char)1, 2412);
        op[2412] = getOpcodeRnm(6, 15); // WSP
        {char[] a = {41}; op[2413] = getOpcodeTls(a);}
        {int[] a = {2415,2416,2418,2419,2421,2422,2424,2425,2427,2428,2430}; op[2414] = getOpcodeCat(a);}
        {char[] a = {103,101,111,46,105,110,116,101,114,115,101,99,116,115}; op[2415] = getOpcodeTls(a);}
        op[2416] = getOpcodeRep((char)0, (char)1, 2417);
        op[2417] = getOpcodeRnm(6, 15); // WSP
        {char[] a = {40}; op[2418] = getOpcodeTls(a);}
        op[2419] = getOpcodeRep((char)0, (char)1, 2420);
        op[2420] = getOpcodeRnm(6, 15); // WSP
        op[2421] = getOpcodeRnm(270, 1674); // commonExpr
        op[2422] = getOpcodeRep((char)0, (char)1, 2423);
        op[2423] = getOpcodeRnm(6, 15); // WSP
        {char[] a = {44}; op[2424] = getOpcodeTls(a);}
        op[2425] = getOpcodeRep((char)0, (char)1, 2426);
        op[2426] = getOpcodeRnm(6, 15); // WSP
        op[2427] = getOpcodeRnm(270, 1674); // commonExpr
        op[2428] = getOpcodeRep((char)0, (char)1, 2429);
        op[2429] = getOpcodeRnm(6, 15); // WSP
        {char[] a = {41}; op[2430] = getOpcodeTls(a);}
        {char[] a = {123,84,79,68,79,50,53,125}; op[2431] = getOpcodeTls(a);}
        {char[] a = {123,84,79,68,79,50,54,125}; op[2432] = getOpcodeTls(a);}
        {char[] a = {123,84,79,68,79,50,55,125}; op[2433] = getOpcodeTls(a);}
        {char[] a = {123,84,79,68,79,50,56,125}; op[2434] = getOpcodeTls(a);}
        {char[] a = {123,84,79,68,79,50,57,125}; op[2435] = getOpcodeTls(a);}
        {char[] a = {123,84,79,68,79,51,48,125}; op[2436] = getOpcodeTls(a);}
        {char[] a = {123,84,79,68,79,51,49,125}; op[2437] = getOpcodeTls(a);}
        {char[] a = {123,84,79,68,79,51,50,125}; op[2438] = getOpcodeTls(a);}
        {char[] a = {123,84,79,68,79,51,51,125}; op[2439] = getOpcodeTls(a);}
        {char[] a = {123,84,79,68,79,51,52,125}; op[2440] = getOpcodeTls(a);}
        {char[] a = {123,84,79,68,79,51,53,125}; op[2441] = getOpcodeTls(a);}
        {char[] a = {123,84,79,68,79,52,50,125}; op[2442] = getOpcodeTls(a);}
        {char[] a = {123,84,79,68,79,52,53,125}; op[2443] = getOpcodeTls(a);}
        {char[] a = {123,84,79,68,79,52,55,125}; op[2444] = getOpcodeTls(a);}
        {char[] a = {123,84,79,68,79,52,56,125}; op[2445] = getOpcodeTls(a);}
        {char[] a = {123,84,79,68,79,52,57,125}; op[2446] = getOpcodeTls(a);}
        {char[] a = {123,84,79,68,79,53,48,125}; op[2447] = getOpcodeTls(a);}
        {char[] a = {123,84,79,68,79,53,49,125}; op[2448] = getOpcodeTls(a);}
        {char[] a = {123,84,79,68,79,53,51,125}; op[2449] = getOpcodeTls(a);}
        {char[] a = {123,84,79,68,79,53,53,125}; op[2450] = getOpcodeTls(a);}
        return op;
    }

    /** Displays the original SABNF grammar on the output device.
     * @param out the output device to display on.*/
    public static void display(PrintStream out){
        out.println(";");
        out.println("; OData.OData");
        out.println(";");
        out.println("; ABNF core definitions [RFC5234]");
        out.println("ALPHA = %x41-5A / %x61-7A ");
        out.println("DIGIT = %x30-39 ");
        out.println("HEXDIG = DIGIT / \"A\" / \"B\" / \"C\" / \"D\" / \"E\" / \"F\" ");
        out.println("DQUOTE = %x22");
        out.println("SP = %x20 ");
        out.println("HTAB = %x09 ");
        out.println("WSP = SP / HTAB ");
        out.println("LWSP = *(WSP / CRLF WSP) ");
        out.println("VCHAR = %x21-7E ");
        out.println("CHAR = %x01-7F");
        out.println("OCTET = %x00-FF ");
        out.println("CTL = %x00-1F / %x7F ");
        out.println("CR = %x0D ");
        out.println("LF = %x0A ");
        out.println("CRLF = CR LF");
        out.println("BIT = \"0\" / \"1\" ");
        out.println("");
        out.println("; URI syntax [RFC3986]");
        out.println("URI           = scheme \":\" hier-part [ \"?\" query ] [ \"#\" fragment ]");
        out.println("hier-part     = \"//\" authority path-abempty");
        out.println("                 / path-absolute");
        out.println("                 / path-rootless");
        out.println("                 / path-empty");
        out.println("URI-reference = URI / relative-ref");
        out.println("absolute-URI  = scheme \":\" hier-part [ \"?\" query ]");
        out.println("relative-ref  = relative-part [ \"?\" query ] [ \"#\" fragment ]");
        out.println("relative-part = \"//\" authority path-abempty");
        out.println("                 / path-absolute");
        out.println("                 / path-noscheme");
        out.println("                 / path-empty");
        out.println("scheme        = ALPHA *( ALPHA / DIGIT / \"+\" / \"-\" / \".\" )");
        out.println("authority     = [ userinfo \"@\" ] host [ \":\" port ]");
        out.println("userinfo      = *( unreserved / pct-encoded / sub-delims / \":\" )");
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
        out.println("dec-octet     = DIGIT                 ; 0-9");
        out.println("                 / %x31-39 DIGIT         ; 10-99");
        out.println("                 / \"1\" 2DIGIT            ; 100-199");
        out.println("                 / \"2\" %x30-34 DIGIT     ; 200-249");
        out.println("                 / \"25\" %x30-35          ; 250-255");
        out.println("reg-name      = *( unreserved / pct-encoded / sub-delims )");
        out.println("path          = path-abempty    ; begins with \"/\" or is empty");
        out.println("                 / path-absolute   ; begins with \"/\" but not \"//\"");
        out.println("                 / path-noscheme   ; begins with a non-colon segment");
        out.println("                 / path-rootless   ; begins with a segment");
        out.println("                 / path-empty      ; zero characters");
        out.println("path-abempty  = *( \"/\" segment )");
        out.println("path-absolute = \"/\" [ segment-nz *( \"/\" segment ) ]");
        out.println("path-noscheme = segment-nz-nc *( \"/\" segment )");
        out.println("path-rootless = segment-nz *( \"/\" segment )");
        out.println("path-empty    = \"\"");
        out.println("segment       = *pchar");
        out.println("segment-nz    = 1*pchar");
        out.println("segment-nz-nc = 1*( unreserved / pct-encoded / sub-delims / \"@\" )");
        out.println("                 ; non-zero-length segment without any colon \":\"");
        out.println("pchar         = unreserved / pct-encoded / sub-delims / \":\" / \"@\"");
        out.println("query         = *( pchar / \"/\" / \"?\" )");
        out.println("fragment      = *( pchar / \"/\" / \"?\" )");
        out.println("pct-encoded   = \"%\" HEXDIG HEXDIG");
        out.println("unreserved    = ALPHA / DIGIT / \"-\" / \".\" / \"_\" / \"~\"");
        out.println("reserved      = gen-delims / sub-delims");
        out.println("gen-delims    = \":\" / \"/\" / \"?\" / \"#\" / \"[\" / \"]\" / \"@\"");
        out.println("sub-delims    = \"!\" / \"$\" / \"&\" / \"'\" / \"(\" / \")\"");
        out.println("                 / \"*\" / \"+\" / \",\" / \";\" / \"=\"");
        out.println("");
        out.println("; UTF-8 syntax [RFC3629]");
        out.println("UTF8-octets = *( UTF8-char )");
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
        out.println("EQ = %x3D              ");
        out.println("SEMI = %x3B              ");
        out.println("COMMA = %x2C");
        out.println("sign = \"+\" / \"-\"");
        out.println("begin-object = \"{\"");
        out.println("end-object = \"}\"");
        out.println("value-separator = COMMA");
        out.println("name-separator = \":\"");
        out.println("star = \"*\"");
        out.println("");
        out.println("; Unrepresentable numeric values");
        out.println("nan = \"NaN\"");
        out.println("negativeInfinity = \"-INF\"");
        out.println("positiveInfinity = \"INF\"");
        out.println("nanInfinity = nan / negativeInfinity / positiveInfinity");
        out.println("");
        out.println("; Dates and times");
        out.println("year = 4*DIGIT;");
        out.println("oneToNine = \"1\" / \"2\" / \"3\" / \"4\" / \"5\" / \"6\" / \"7\" / \"8\" / \"9\" ");
        out.println("zeroToTwelve = [ \"0\" ] oneToNine / \"1\" ( \"0\" / \"1\" / \"2\" ) ");
        out.println("zeroToThirteen = zeroToTwelve / \"13\"     ");
        out.println("zeroToSixty = [ \"0\" ] oneToNine  / ( \"1\" / \"2\" / \"3\" / \"4\" / \"5\" ) DIGIT / \"60\"");
        out.println("zeroToThirtyOne = [ \"0\" ] oneToNine / ( \"1\" / \"2\" ) DIGIT / \"30\" / \"31\"");
        out.println("zeroToTwentyFour = [ \"0\" ] oneToNine / \"1\" DIGIT / \"2\" ( \"1\" / \"2\" / \"3\" / \"4\" ) ");
        out.println("month = zeroToTwelve");
        out.println("day = zeroToThirtyOne");
        out.println("hour = zeroToTwentyFour");
        out.println("minute = zeroToSixty");
        out.println("second = zeroToSixty        ");
        out.println("nanoSeconds = 1*7DIGIT");
        out.println("");
        out.println("; Names and identifiers");
        out.println("odataIdentifier             = identifierLeadingCharacter *478identifierCharacter");
        out.println("identifierLeadingCharacter  = ALPHA / \"_\"            ; TODO: Any character from the Unicode classes L or Nl");
        out.println("identifierCharacter         = ALPHA / DIGIT / \"_\"    ; TODO: Any character from the Unicode classes L, Nl, Nd, Mn, Mc, Pc or Cf");
        out.println("namespacePart = odataIdentifier");
        out.println("namespace = namespacePart *(\".\" namespacePart)");
        out.println("entitySetName = odataIdentifier");
        out.println("entityTypeName = odataIdentifier");
        out.println("complexTypeName = odataIdentifier ");
        out.println("operationQualifier = [ namespace \".\" ] entityContainerName \".\"");
        out.println("allOperationsInContainer = operationQualifier \"*\"                  ");
        out.println("qualifiedTypeName = qualifiedEntityTypeName /");
        out.println(" qualifiedComplexTypeName / ");
        out.println(" primitiveTypeName /");
        out.println("  \"collection(\" (");
        out.println("  qualifiedEntityTypeName /");
        out.println("  qualifiedComplexTypeName / ");
        out.println("  primitiveTypeName ");
        out.println("  ) \")\"");
        out.println("qualifiedEntityTypeName = namespace \".\" entityTypeName");
        out.println("qualifiedComplexTypeName = namespace \".\" complexTypeName");
        out.println("primitiveTypeName = [\"edm.\"] (");
        out.println(" \"binary\" /");
        out.println(" \"boolean\" /");
        out.println(" \"byte\" /");
        out.println(" \"datetime\" /");
        out.println(" \"decimal\" /");
        out.println(" \"double\" /");
        out.println(" \"single\" /");
        out.println(" \"float\" /");
        out.println(" \"guid\" /");
        out.println(" \"int16\" /");
        out.println(" \"int32\" /");
        out.println(" \"int64\" /");
        out.println(" \"sbyte\" /");
        out.println(" \"string\" /");
        out.println(" \"time\" /");
        out.println(" \"datetimeoffset\" /");
        out.println(" \"stream\" /");
        out.println(" concreteSpatialTypeName /");
        out.println(" abstractSpatialTypeName");
        out.println(" )");
        out.println("concreteSpatialTypeName = \"point\" /");
        out.println(" \"linestring\" /");
        out.println(" \"polygon\" /");
        out.println(" \"geographycollection\" /");
        out.println(" \"multipoint\" /");
        out.println(" \"multilinedtring\" /");
        out.println(" \"multipolygon\" /");
        out.println(" \"geometricpoint\" /");
        out.println(" \"geometriclinestring\" /");
        out.println(" \"geometricpolygon\" /");
        out.println(" \"geometrycollection\" /");
        out.println(" \"geometricmultipoint\" /");
        out.println(" \"geometricmultilinestring\" /");
        out.println(" \"geometricmultipolygon\" ");
        out.println("abstractSpatialTypeName = \"geography\" / \"geometry\"      ");
        out.println("primitiveKeyProperty = odataIdentifier");
        out.println("primitiveNonKeyProperty = odataIdentifier");
        out.println("primitiveColProperty = odataIdentifier");
        out.println("complexProperty = odataIdentifier");
        out.println("complexColProperty = odataIdentifier");
        out.println("streamProperty = odataIdentifier");
        out.println("propertyName = primitiveKeyProperty / ");
        out.println(" primitiveNonKeyProperty /");
        out.println(" primitiveColProperty / ");
        out.println(" complexProperty / ");
        out.println(" complexColProperty /");
        out.println(" streamProperty");
        out.println("entityContainerName = odataIdentifier");
        out.println("serviceOperation = entityServiceOp / ");
        out.println(" entityColServiceOp /");
        out.println(" complexServiceOp / ");
        out.println(" complexColServiceOp /");
        out.println(" primitiveServiceOp /");
        out.println(" primitiveColServiceOp ");
        out.println("entityServiceOp = odataIdentifier        ");
        out.println("entityColServiceOp = odataIdentifier        ");
        out.println("complexServiceOp = odataIdentifier        ");
        out.println("complexColServiceOp = odataIdentifier        ");
        out.println("primitiveServiceOp = odataIdentifier        ");
        out.println("primitiveColServiceOp = odataIdentifier");
        out.println("entityNavigationProperty = odataIdentifier");
        out.println("entityColNavigationProperty = odataIdentifier");
        out.println("navigationProperty = entityNavigationProperty / entityColNavigationProperty  ");
        out.println("entityFunction = odataIdentifier");
        out.println("entityColFunction = odataIdentifier");
        out.println("complexFunction = odataIdentifier");
        out.println("complexColFunction = odataIdentifier");
        out.println("primitiveFunction = odataIdentifier");
        out.println("primitiveColFunction = odataIdentifier");
        out.println("function = entityFunction / ");
        out.println(" entityColFunction /");
        out.println(" complexFunction / ");
        out.println(" complexColFunction /");
        out.println(" primitiveFunction /");
        out.println(" primitiveColFunction");
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
        out.println("action = entityAction / ");
        out.println(" entityColAction /");
        out.println(" complexAction /");
        out.println(" complexColAction /");
        out.println(" primitiveAction / ");
        out.println(" primitiveColAction / ");
        out.println(" voidAction");
        out.println("fullAction = [ operationQualifier ] action");
        out.println("boundAction = fullAction");
        out.println("qualifiedActionName = fullAction [ \"(\" parameterTypeNames \")\" ]");
        out.println("qualifiedFunctionName = fullFunction [ \"(\" parameterTypeNames \")\" ]");
        out.println("                                                ; the parameterTypeNames are required to uniquely identify the Function");
        out.println("                                                ; only if the Function in question has overloads.");
        out.println("parameterTypeNames = [ parameterTypeName *( \",\" parameterTypeName ) ]");
        out.println("                                                ; the types of all the parameters to the corresponding functionImport ");
        out.println("                                                ; in the order they are declared in the function import");
        out.println("parameterTypeName = qualifiedTypeName ");
        out.println("");
        out.println("; Literal data values");
        out.println("primitiveLiteral = null /");
        out.println(" decimal /");
        out.println(" single /");
        out.println(" double /");
        out.println(" sbyte /");
        out.println(" byte /");
        out.println(" int16 /");
        out.println(" int32 /");
        out.println(" int64 / ");
        out.println(" binary / ");
        out.println(" dateTime /");
        out.println(" dateTimeOffset /");
        out.println(" guid / ");
        out.println(" string / ");
        out.println(" time /");
        out.println(" boolean /");
        out.println(" geography /");
        out.println(" geographyCollection / ");
        out.println(" geographyLineString /");
        out.println(" geographyMultiLineString /");
        out.println(" geographyMultiPoint /");
        out.println(" geographyMultiPolygon /");
        out.println(" geographyPoint / ");
        out.println(" geographyPolygon /");
        out.println(" geometry /");
        out.println(" geometryCollection / ");
        out.println(" geometryLineString /");
        out.println(" geometryMultiLineString /");
        out.println(" geometryMultiPoint /");
        out.println(" geometryMultiPolygon /");
        out.println(" geometryPoint / ");
        out.println(" geometryPolygon ");
        out.println("");
        out.println("null = \"null\" [ \"'\" qualifiedTypeName \"'\" ] ");
        out.println(" ; The optional qualifiedTypeName is used to specify what type this null value should be considered. ");
        out.println(" ; Knowing the type is useful for function overload resolution purposes. ");
        out.println("                                                ");
        out.println("binary = ( %d88 / \"binary\" ) SQUOTE *(2HEXDIG) SQUOTE ; note: \"X\" is case sensitive \"binary\" is not hence using the character code.");
        out.println("boolean = ( \"true\" / \"1\" ) / ( \"false\" / \"0\" )");
        out.println("byte = 1*3DIGIT ; numbers in the range from 0 to 257");
        out.println("dateTime = \"datetime\" SQUOTE dateTimeBody SQUOTE");
        out.println("dateTimeOffset = \"datetimeoffset\" SQUOTE dateTimeOffsetBody SQUOTE");
        out.println("dateTimeBody = year \"-\" month \"-\" day \"T\" hour \":\" minute [ \":\" second [ \".\" nanoSeconds ] ] ");
        out.println("dateTimeOffsetBody = dateTimeBody \"Z\" / ; TODO: is the Z optional?");
        out.println(" dateTimeBody sign zeroToThirteen [ \":00\" ] /");
        out.println(" dateTimeBody sign zeroToTwelve [ \":\" zeroToSixty ] ");
        out.println("decimal = sign 1*29DIGIT [\".\" 1*29DIGIT] (\"M\"/\"m\")");
        out.println("double = (  ");
        out.println(" sign 1*17DIGIT /");
        out.println(" sign *DIGIT \".\" *DIGIT /");
        out.println(" sign 1*DIGIT \".\" 16*DIGIT ( \"e\" / \"E\" ) sign 1*3DIGIT");
        out.println(" ) (\"D\" / \"d\") /");
        out.println(" nanInfinity [ \"D\" / \"d\" ]");
        out.println("");
        out.println("geography = \"{TODO1}\"       ; Format specific");
        out.println("geographyCollection = \"{TODO2}\"       ; Format specific");
        out.println("geographyLineString = \"{TODO3}\"       ; Format specific");
        out.println("geographyMultiLineString = \"{TODO4}\"       ; Format specific");
        out.println("geographyMultiPoint = \"{TODO5}\"       ; Format specific");
        out.println("geographyMultiPolygon = \"{TODO6}\"       ; Format specific");
        out.println("geographyPoint = \"{TODO7}\"       ; Format specific");
        out.println("geographyPolygon = \"{TODO8}\"       ; Format specific");
        out.println("geometry = \"{TODO9}\"       ; Format specific");
        out.println("geometryCollection = \"{TODO10}\"       ; Format specific");
        out.println("geometryLineString = \"{TODO11}\"       ; Format specific");
        out.println("geometryMultiLineString = \"{TODO12}\"       ; Format specific");
        out.println("geometryMultiPoint = \"{TODO13}\"       ; Format specific");
        out.println("geometryMultiPolygon = \"{TODO14}\"       ; Format specific");
        out.println("geometryPoint = \"{TODO15}\"       ; Format specific");
        out.println("geometryPolygon = \"{TODO16}\"       ; Format specific");
        out.println("");
        out.println("guid = \"guid\" SQUOTE 8HEXDIG \"-\" 4HEXDIG \"-\" 4HEXDIG \"-\" 4HEXDIG \"-\" 12HEXDIG SQUOTE");
        out.println("int16 = [ sign ] 1*5DIGIT ; numbers in the range from -32768 to 32767        ");
        out.println("int32 = [ sign ] 1*10DIGIT ; numbers in the range from -2147483648 to 2147483647");
        out.println("int64 = [ sign ] 1*19DIGIT ( \"L\" / \"l\" ) ; numbers in the range from -9223372036854775808 to 9223372036854775807");
        out.println("sbyte = [ sign ] 1*3DIGIT ; numbers in the range from -128 to 127");
        out.println("single = (  ");
        out.println(" sign 1*8DIGIT /");
        out.println(" sign *DIGIT \".\" *DIGIT /");
        out.println(" sign 1*DIGIT \".\" 8*DIGIT ( \"e\" / \"E\" ) sign 1*2DIGIT");
        out.println(" ) (\"F\" / \"f\") /");
        out.println(" nanInfinity [ \"F\" / \"f\" ]");
        out.println("");
        out.println("string = SQUOTE *( unreserved / pct-encoded / SQUOTE-in-string ) SQUOTE ; TODO; was SQUOTE *UTF8-char SQUOTE, but that's not sufficient for use in URLs");
        out.println("SQUOTE-in-string = SQUOTE SQUOTE ; two quotes represent one within string literal in quotes");
        out.println("time = \"time\" SQUOTE [ sign ] \"P\" [ 1*DIGIT \"Y\" ] [ 1*DIGIT \"M\" ] [ 1*DIGIT \"D\" ] [ \"T\" [ 1*DIGIT \"H\" ] [ 1*DIGIT \"M\" ] [ 1*DIGIT [ \".\" 1*DIGIT ] \"S\" ] ] SQUOTE");
        out.println(" ; the above is an approximation of the rules for an xml duration.");
        out.println(" ; see the lexical representation for duration in http://www.w3.org/TR/xmlschema-2 for more information");
        out.println("");
        out.println("odataUri = scheme \"://\" host [ \":\" port ] serviceRoot [ \"$metadata\" / \"$batch\" / odataRelativeUri ]  ");
        out.println("");
        out.println("serviceRoot = \"/\" *( segment-nz \"/\" )");
        out.println("odataRelativeUri = resourcePath [\"?\" queryOptions ]");
        out.println("queryOptions = queryOption *(\"&\" queryOption)        ");
        out.println("queryOption = systemQueryOption / ");
        out.println(" customQueryOption / ");
        out.println(" sopParameterNameAndValue / ");
        out.println(" aliasAndValue /");
        out.println(" parameterNameAndValue");
        out.println("        ");
        out.println("systemQueryOption = expand / ");
        out.println(" filter /");
        out.println(" orderby /");
        out.println(" skip /");
        out.println(" top /");
        out.println(" format /");
        out.println(" inlinecount /");
        out.println(" select /");
        out.println(" skiptoken");
        out.println("");
        out.println("expand = \"$expand=\" expandClause ");
        out.println("");
        out.println("expandClause                            =       expandItem *( \",\" expandItem )");
        out.println("");
        out.println("expandItem                              =       [ qualifiedEntityTypeName \"/\" ] navigationProperty ");
        out.println("                                                                        *([ \"/\" qualifiedEntityTypeName ] \"/\" navigationProperty) ");
        out.println("");
        out.println("count                                           =       \"/$count\" ");
        out.println("");
        out.println("filter                                          =       \"$filter\" [ WSP ] \"=\" [ WSP] boolCommonExpr");
        out.println("        ");
        out.println("orderby                                         =       \"$orderby\" [ WSP ] \"=\" [ WSP] ");
        out.println("                                                                        orderExpr [WSP] [ \"asc\" / \"desc\" ] *( COMMA [ WSP ]  orderExpr [ WSP ] [ \"asc\" / \"desc\" ])");
        out.println("orderExpr                                       =  primitiveKeyProperty / primitiveNonKeyProperty      ; TODO: originally commonExpr                                                                 ");
        out.println("");
        out.println("skip                                            =   \"$skip=\" 1*DIGIT");
        out.println("");
        out.println("top                                                     =       \"$top=\" 1*DIGIT");
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
        out.println("inlinecount                                     =       \"$inlinecount=\" ( \"allpages\" / \"none\" )");
        out.println("");
        out.println("select                                          =       \"$select=\" selectClause");
        out.println("");
        out.println("selectClause                            =       selectItem *( COMMA selectItem )");
        out.println("");
        out.println("selectItem                              =       star / ");
        out.println("                                                                        [ qualifiedEntityTypeName \"/\" ] (");
        out.println("                                                                                ( navigationProperty [ \"/\" selectItem ] ) /  ");
        out.println("                                                                                propertyName / ");
        out.println("                                                                                qualifiedActionName / ");
        out.println("                                                                                qualifiedFunctionName / ");
        out.println("                                                                                allOperationsInContainer ");
        out.println("                                                                        )");
        out.println("");
        out.println("skiptoken                                       =       \"$skiptoken=\" 1*pchar");
        out.println("");
        out.println("customQueryOption                               =       customName [ WSP ] [ \"=\" [ WSP ] customValue ]");
        out.println("");
        out.println("customName                                      =       ( unreserved / pct-encoded / \":\" / \"@\" / \"!\" / \"'\" / \"(\" / \")\" / \"*\" / \"+\" / \",\" / \";\" ) ");
        out.println("                                                                        *( unreserved / pct-encoded / \":\" / \"@\" / \"!\" / \"$\" / \"'\" / \"(\" / \")\" / \"*\" / \"+\" / \",\" / \";\" )                 ");
        out.println("                                                                        ; MUST not start with '$'");
        out.println("");
        out.println("customValue                                     =       *( unreserved / pct-encoded / \":\" / \"@\" / \"!\" / \"$\" / \"'\" / \"(\" / \")\" / \"*\" / \"+\" / \",\" / \";\" / \"=\" )");
        out.println("");
        out.println("resourcePath                            =                               [ entityContainerName \".\" ] entitySetName [collectionNavigation / keyPredicate [ singleNavigation ] ] /");
        out.println("                                                                        ( entityColServiceOpCall / entityColFunctionCall ) [ collectionNavigation ] /");
        out.println("                                                                        ( entityServiceOpCall   / entityFunctionCall ) [ singleNavigation ] /");
        out.println("                                                                        ( complexColServiceOpCall / complexColFunctionCall ) [ boundOperation ] /");
        out.println("                                                                        ( complexServiceOpCall / complexFunctionCall ) [ boundOperation / complexPropertyPath ] /");
        out.println("                                                                        ( primitiveColServiceOpCall / primitiveColFunctionCall ) [ boundOperation ] /");
        out.println("                                                                        ( primitiveServiceOpCall / primitiveFunctionCall ) [ boundOperation / value ] /");
        out.println("                                                                        actionCall ");
        out.println("");
        out.println("collectionNavigation        =       [ \"/\" qualifiedEntityTypeName ] \"/\" ");
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
        out.println("                                                     complexPropertyPath /");
        out.println("                                                     collectionPropertyPath / ");
        out.println("                                                     primitivePropertyPath / ");
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
        out.println("primitivePropertyPath       =       [ \"/ qualifiedEntityTypeName\" ] \"/\" ( primitiveKeyProperty / primitiveNonKeyProperty ) [ value ]");
        out.println("    ");
        out.println("complexPropertyPath         =       [ \"/ qualifiedEntityTypeName\" ] \"/\" complexProperty ");
        out.println("                                                                        [ ");
        out.println("                                                                                primitivePropertyPath / ");
        out.println("                                                                                complexPropertyPath /");
        out.println("                                                                                collectionPropertyPath /");
        out.println("                                                                                boundOperation");
        out.println("                                                                        ] ");
        out.println("");
        out.println("collectionPropertyPath          =       [ \"/\" qualifiedEntityType ] \"/\" ( primitiveColProperty / complexColProperty ) [ boundOperation ]");
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
        out.println("primitiveColFunctionCall        =       fullPrimitiveFunction functionParameters");
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
        out.println("boundPrimitiveColFuncCall       =       fullPrimitiveFunction functionParameters");
        out.println("                                                                        ; with the added restrictions that the Function MUST support binding, and the binding parameter type ");
        out.println("                                                                        ; MUST match the type of resource identified by Uri immediately preceding (to the left) of the boundPrimitiveColFuncCall");
        out.println("                                                                        ; and the functionParameters MUST NOT include the bindingParameter.");
        out.println("");
        out.println("boundFunctionCall                       =       boundEntityFuncCall / ");
        out.println("                                                                        boundEntityColFuncCall /");
        out.println("                                                                        boundComplexFuncCall / ");
        out.println("                                                                        boundComplexColFuncCall /");
        out.println("                                                                        boundPrimitiveFuncCall /");
        out.println("                                                                        boundPrimitiveColFuncCall");
        out.println("");
        out.println("functionParameters                      =       \"(\" [ functionParameter *( \",\" functionParameter ) ] \")\"");
        out.println("");
        out.println("functionParameter                       =       functionParameterName \"=\" ( primitiveParameterValue / parameterAlias )");
        out.println("");
        out.println("functionParameterName          =       odataIdentifier;");
        out.println("");
        out.println("primitiveParameterValue     =       primitiveLiteral");
        out.println("");
        out.println("parameterAlias                              =       \"@\" *pchar");
        out.println("");
        out.println("aliasAndValue                           =       parameterAlias \"=\" parameterValue");
        out.println("");
        out.println("parameterAndValue                       =       functionParameterName \"=\" parameterValue");
        out.println("");
        out.println("primitivePropInJSONLight        = \"{TODO19}\"       ; arlo JSON Light format");
        out.println("                                                                        ; unreferenced until complexInJSONLight is defined.");
        out.println("");
        out.println("primitivePropertyInVJSON        =       quotation-mark ( primitiveKeyProperty / primitiveNonKeyProperty ) quotation-mark name-separator primitiveLiteralInVJSON");
        out.println("");
        out.println("complexPropertyInJSON           =       complexPropertyInVJSON / complexPropertyInJSONLight");
        out.println("");
        out.println("complexPropertyInVJSON          =       quotation-mark complexProperty quotation-mark name-separator complexInVJSON");
        out.println("");
        out.println("complexPropertyInJSONLight      = \"{TODO20}\"       ; arlo JSON Light format.");
        out.println("");
        out.println("collectionPropertyInJSON        =       colPropertyInJSONLight / collectionPropertyInVJSON");
        out.println("");
        out.println("collectionPropertyInVJSON       =       ( quotation-mark primitiveColProperty quotation-mark name-separator \"[\" [ primitiveVJSONLiteral *( COMMA primitiveLiteralInVJSON ) ] \"]\" ) /");
        out.println("                                                                        ( quotation-mark complexColProperty quotation-mark name-separator \"[\" [ complexInVJSON *( COMMA complexInVJSON ) ] \"]\" )");
        out.println("                ");
        out.println("colPropertyInJSONLight          = \"{TODO21}\"       ; alro JSON Light format");
        out.println("");
        out.println("primitiveLiteralInVJSON         = \"{TODO22}\"       ; arlo VJSON format.");
        out.println("");
        out.println("primitiveLiteralInJSONLight     = \"{TODO23}\"       ; arlo JSON Light format.");
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
        out.println("complexInJSON                           =       complexInVJSON / complexInJSONLight");
        out.println("");
        out.println("complexInJSONLight                      = \"{TODO24}\"       ; arlo JSON light format");
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
        out.println("entityServiceOpCall                     =       [ operationQualifier ] entityServiceOp [ \"()\" ]");
        out.println("        ");
        out.println("entityColServiceOpCall          =       [ operationQualifier ] entityColServiceOp [ \"()\" ]");
        out.println("        ");
        out.println("complexServiceOpCall            =       [ operationQualifier ] complexServiceOp [ \"()\" ]");
        out.println("        ");
        out.println("complexColServiceOpCall         =       [ operationQualifier ] complexColServiceOp [ \"()\" ]");
        out.println("        ");
        out.println("primitiveServiceOpCall          =       [ operationQualifier ] primitiveServiceOp [ \"()\" ]");
        out.println("        ");
        out.println("primitiveColServiceOpCall       =       [ operationQualifier ] primitiveServiceOp [ \"()\" ]");
        out.println("");
        out.println("serviceOperationCall            =       entityServiceOpCall / ");
        out.println("                                                                        entityColServiceOpCall /");
        out.println("                                                                        complexServiceOpCall / ");
        out.println("                                                                        complexColServiceOpCall /");
        out.println("                                                                        primitiveServiceOpCall /");
        out.println("                                                                        primitiveColServiceOpCall ");
        out.println("");
        out.println("serviceOpParameterName          =       odataIdentifier;");
        out.println("                                                                        ; identifies by name a parameter to a ServiceOperation");
        out.println("        ");
        out.println("sopParameterNameAndValue        =       serviceOpParameterName \"=\" primitiveParameterValue");
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
        out.println(" functionCallExpr ");
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
        out.println("functionExpr                            =       (");
        out.println("                                                                                entityColFuncCall [ singleNavigationExpr ] /");
        out.println("                                                                                entityFuncCall [ collectionNavigationExpr ] /");
        out.println("                                                                                primitiveFuncCall [ boundFunctionExpr ] /");
        out.println("                                                                                primitiveColFuncCall [ boundFunctionExpr ] /");
        out.println("                                                                                complexFuncCall [ complexPropertyPath / boundFunctionExpr ] /");
        out.println("                                                                                complexColFuncCall [ boundFunctionExpr ]");
        out.println("                                                                        )");
        out.println("");
        out.println("boolFunctionExpr                        =       functionExpr");
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
        out.println("boolBoundFunctionExpr           =       boundFunctionExpr");
        out.println("                                                                        ; with the added restriction that the boolBoundFunctionExpr MUST return a boolean value");
        out.println("");
        out.println("anyExpr = \"any(\" [ lambdaVariableExpr \":\" lambdaPredicateExpr ] \")\"");
        out.println("");
        out.println("allExpr = \"all(\" lambdaVariableExpr \":\" lambdaPredicateExpr \")\"");
        out.println("");
        out.println("implicitVariableExpr = \"$it\" ; references the unnamed outer variable of the query");
        out.println("");
        out.println("lambdaVariableExpr = odataIdentifier");
        out.println("inscopeVariableExpr = implicitVariableExpr / lambdaVariableExpr");
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
        out.println("substringMethodCallExp = \"substring\" [WSP]");
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
        out.println("complexColFuncCall = \"{TODO29}\"");
        out.println("complexColInJSON = \"{TODO30}\"");
        out.println("complexFuncCall = \"{TODO31}\" ");
        out.println("complexTypeInJSON = \"{TODO32}\"");
        out.println("entityColFuncCall = \"{TODO33}\"");
        out.println("entityFuncCall = \"{TODO34}\"");
        out.println("entityProperty = \"{TODO35}\"");
        out.println("functionCallExpr = \"{TODO42}\"");
        out.println("lambdaPredicatePrefixExpr = \"{TODO45}\"");
        out.println("parameterNameAndValue = \"{TODO47}\"");
        out.println("primitiveColFuncCall = \"{TODO48}\"");
        out.println("primitiveColInJSON = \"{TODO49}\"");
        out.println("primitiveFuncCall = \"{TODO50}\"");
        out.println("primitiveVJSONLiteral = \"{TODO51}\"");
        out.println("quotation-mark = \"{TODO53}\"");
        out.println("substringMethodCallExpr = \"{TODO55}\"");
    }
}
