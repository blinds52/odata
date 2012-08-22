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
    public static int ruleCount = 360;
    /** This enum provides easy to remember enum constants for locating the rule identifiers and names.
     * The enum constants have the same spelling as the rule names rendered in all caps with underscores replacing hyphens. */
    public enum RuleNames{
        /** id = <code>19</code>, name = <code>"absolute-URI"</code> */
        ABSOLUTE_URI("absolute-URI", 19, 61, 8),
        /** id = <code>101</code>, name = <code>"abstractSpatialTypeName"</code> */
        ABSTRACTSPATIALTYPENAME("abstractSpatialTypeName", 101, 580, 3),
        /** id = <code>141</code>, name = <code>"action"</code> */
        ACTION("action", 141, 666, 8),
        /** id = <code>220</code>, name = <code>"actionCall"</code> */
        ACTIONCALL("actionCall", 220, 1423, 6),
        /** id = <code>281</code>, name = <code>"addExpr"</code> */
        ADDEXPR("addExpr", 281, 1768, 6),
        /** id = <code>240</code>, name = <code>"aliasAndValue"</code> */
        ALIASANDVALUE("aliasAndValue", 240, 1506, 4),
        /** id = <code>302</code>, name = <code>"allExpr"</code> */
        ALLEXPR("allExpr", 302, 2039, 6),
        /** id = <code>333</code>, name = <code>"allMethodCallExpr"</code> */
        ALLMETHODCALLEXPR("allMethodCallExpr", 333, 2416, 1),
        /** id = <code>95</code>, name = <code>"allOperationsInContainer"</code> */
        ALLOPERATIONSINCONTAINER("allOperationsInContainer", 95, 520, 3),
        /** id = <code>0</code>, name = <code>"ALPHA"</code> */
        ALPHA("ALPHA", 0, 0, 3),
        /** id = <code>273</code>, name = <code>"andExpr"</code> */
        ANDEXPR("andExpr", 273, 1720, 6),
        /** id = <code>301</code>, name = <code>"anyExpr"</code> */
        ANYEXPR("anyExpr", 301, 2031, 8),
        /** id = <code>334</code>, name = <code>"anyMethodCallExpr"</code> */
        ANYMETHODCALLEXPR("anyMethodCallExpr", 334, 2417, 1),
        /** id = <code>23</code>, name = <code>"authority"</code> */
        AUTHORITY("authority", 23, 96, 10),
        /** id = <code>64</code>, name = <code>"begin-object"</code> */
        BEGIN_OBJECT("begin-object", 64, 406, 1),
        /** id = <code>150</code>, name = <code>"binary"</code> */
        BINARY("binary", 150, 741, 8),
        /** id = <code>15</code>, name = <code>"BIT"</code> */
        BIT("BIT", 15, 35, 3),
        /** id = <code>300</code>, name = <code>"boolBoundFunctionExpr"</code> */
        BOOLBOUNDFUNCTIONEXPR("boolBoundFunctionExpr", 300, 2030, 1),
        /** id = <code>290</code>, name = <code>"boolCastExpr"</code> */
        BOOLCASTEXPR("boolCastExpr", 290, 1845, 19),
        /** id = <code>268</code>, name = <code>"boolCommonExpr"</code> */
        BOOLCOMMONEXPR("boolCommonExpr", 268, 1679, 23),
        /** id = <code>151</code>, name = <code>"boolean"</code> */
        BOOLEAN("boolean", 151, 749, 7),
        /** id = <code>335</code>, name = <code>"boolFunctionCallExpr"</code> */
        BOOLFUNCTIONCALLEXPR("boolFunctionCallExpr", 335, 2418, 1),
        /** id = <code>298</code>, name = <code>"boolFunctionExpr"</code> */
        BOOLFUNCTIONEXPR("boolFunctionExpr", 298, 1996, 1),
        /** id = <code>269</code>, name = <code>"boolLiteralExpr"</code> */
        BOOLLITERALEXPR("boolLiteralExpr", 269, 1702, 1),
        /** id = <code>336</code>, name = <code>"boolMethodCallExpr"</code> */
        BOOLMETHODCALLEXPR("boolMethodCallExpr", 336, 2419, 1),
        /** id = <code>308</code>, name = <code>"boolMethodExpr"</code> */
        BOOLMETHODEXPR("boolMethodExpr", 308, 2073, 7),
        /** id = <code>272</code>, name = <code>"boolParenExpr"</code> */
        BOOLPARENEXPR("boolParenExpr", 272, 1712, 8),
        /** id = <code>293</code>, name = <code>"boolPrimitiveMemberExpr"</code> */
        BOOLPRIMITIVEMEMBEREXPR("boolPrimitiveMemberExpr", 293, 1895, 12),
        /** id = <code>143</code>, name = <code>"boundAction"</code> */
        BOUNDACTION("boundAction", 143, 678, 1),
        /** id = <code>221</code>, name = <code>"boundActionCall"</code> */
        BOUNDACTIONCALL("boundActionCall", 221, 1429, 6),
        /** id = <code>232</code>, name = <code>"boundComplexColFuncCall"</code> */
        BOUNDCOMPLEXCOLFUNCCALL("boundComplexColFuncCall", 232, 1469, 3),
        /** id = <code>231</code>, name = <code>"boundComplexFuncCall"</code> */
        BOUNDCOMPLEXFUNCCALL("boundComplexFuncCall", 231, 1466, 3),
        /** id = <code>230</code>, name = <code>"boundEntityColFuncCall"</code> */
        BOUNDENTITYCOLFUNCCALL("boundEntityColFuncCall", 230, 1463, 3),
        /** id = <code>229</code>, name = <code>"boundEntityFuncCall"</code> */
        BOUNDENTITYFUNCCALL("boundEntityFuncCall", 229, 1460, 3),
        /** id = <code>235</code>, name = <code>"boundFunctionCall"</code> */
        BOUNDFUNCTIONCALL("boundFunctionCall", 235, 1478, 7),
        /** id = <code>299</code>, name = <code>"boundFunctionExpr"</code> */
        BOUNDFUNCTIONEXPR("boundFunctionExpr", 299, 1997, 33),
        /** id = <code>209</code>, name = <code>"boundOperation"</code> */
        BOUNDOPERATION("boundOperation", 209, 1328, 36),
        /** id = <code>234</code>, name = <code>"boundPrimitiveColFuncCall"</code> */
        BOUNDPRIMITIVECOLFUNCCALL("boundPrimitiveColFuncCall", 234, 1475, 3),
        /** id = <code>233</code>, name = <code>"boundPrimitiveFuncCall"</code> */
        BOUNDPRIMITIVEFUNCCALL("boundPrimitiveFuncCall", 233, 1472, 3),
        /** id = <code>152</code>, name = <code>"byte"</code> */
        BYTE("byte", 152, 756, 2),
        /** id = <code>289</code>, name = <code>"castExpr"</code> */
        CASTEXPR("castExpr", 289, 1826, 19),
        /** id = <code>329</code>, name = <code>"ceilingMethodCallExpr"</code> */
        CEILINGMETHODCALLEXPR("ceilingMethodCallExpr", 329, 2360, 11),
        /** id = <code>9</code>, name = <code>"CHAR"</code> */
        CHAR("CHAR", 9, 25, 1),
        /** id = <code>207</code>, name = <code>"collectionNavigation"</code> */
        COLLECTIONNAVIGATION("collectionNavigation", 207, 1266, 36),
        /** id = <code>295</code>, name = <code>"collectionNavigationExpr"</code> */
        COLLECTIONNAVIGATIONEXPR("collectionNavigationExpr", 295, 1934, 10),
        /** id = <code>247</code>, name = <code>"collectionPropertyInJSON"</code> */
        COLLECTIONPROPERTYINJSON("collectionPropertyInJSON", 247, 1533, 3),
        /** id = <code>248</code>, name = <code>"collectionPropertyInVJSON"</code> */
        COLLECTIONPROPERTYINVJSON("collectionPropertyInVJSON", 248, 1536, 29),
        /** id = <code>212</code>, name = <code>"collectionPropertyPath"</code> */
        COLLECTIONPROPERTYPATH("collectionPropertyPath", 212, 1384, 11),
        /** id = <code>249</code>, name = <code>"colPropertyInJSONLight"</code> */
        COLPROPERTYINJSONLIGHT("colPropertyInJSONLight", 249, 1565, 1),
        /** id = <code>62</code>, name = <code>"COMMA"</code> */
        COMMA("COMMA", 62, 402, 1),
        /** id = <code>267</code>, name = <code>"commonExpr"</code> */
        COMMONEXPR("commonExpr", 267, 1659, 20),
        /** id = <code>136</code>, name = <code>"complexAction"</code> */
        COMPLEXACTION("complexAction", 136, 661, 1),
        /** id = <code>137</code>, name = <code>"complexColAction"</code> */
        COMPLEXCOLACTION("complexColAction", 137, 662, 1),
        /** id = <code>337</code>, name = <code>"complexColFuncCall"</code> */
        COMPLEXCOLFUNCCALL("complexColFuncCall", 337, 2420, 1),
        /** id = <code>123</code>, name = <code>"complexColFunction"</code> */
        COMPLEXCOLFUNCTION("complexColFunction", 123, 618, 1),
        /** id = <code>225</code>, name = <code>"complexColFunctionCall"</code> */
        COMPLEXCOLFUNCTIONCALL("complexColFunctionCall", 225, 1444, 3),
        /** id = <code>338</code>, name = <code>"complexColInJSON"</code> */
        COMPLEXCOLINJSON("complexColInJSON", 338, 2421, 1),
        /** id = <code>106</code>, name = <code>"complexColProperty"</code> */
        COMPLEXCOLPROPERTY("complexColProperty", 106, 587, 1),
        /** id = <code>114</code>, name = <code>"complexColServiceOp"</code> */
        COMPLEXCOLSERVICEOP("complexColServiceOp", 114, 607, 1),
        /** id = <code>261</code>, name = <code>"complexColServiceOpCall"</code> */
        COMPLEXCOLSERVICEOPCALL("complexColServiceOpCall", 261, 1629, 6),
        /** id = <code>339</code>, name = <code>"complexFuncCall"</code> */
        COMPLEXFUNCCALL("complexFuncCall", 339, 2422, 1),
        /** id = <code>122</code>, name = <code>"complexFunction"</code> */
        COMPLEXFUNCTION("complexFunction", 122, 617, 1),
        /** id = <code>224</code>, name = <code>"complexFunctionCall"</code> */
        COMPLEXFUNCTIONCALL("complexFunctionCall", 224, 1441, 3),
        /** id = <code>255</code>, name = <code>"complexInJSON"</code> */
        COMPLEXINJSON("complexInJSON", 255, 1590, 3),
        /** id = <code>256</code>, name = <code>"complexInJSONLight"</code> */
        COMPLEXINJSONLIGHT("complexInJSONLight", 256, 1593, 1),
        /** id = <code>257</code>, name = <code>"complexInVJSON"</code> */
        COMPLEXINVJSON("complexInVJSON", 257, 1594, 17),
        /** id = <code>105</code>, name = <code>"complexProperty"</code> */
        COMPLEXPROPERTY("complexProperty", 105, 586, 1),
        /** id = <code>244</code>, name = <code>"complexPropertyInJSON"</code> */
        COMPLEXPROPERTYINJSON("complexPropertyInJSON", 244, 1523, 3),
        /** id = <code>246</code>, name = <code>"complexPropertyInJSONLight"</code> */
        COMPLEXPROPERTYINJSONLIGHT("complexPropertyInJSONLight", 246, 1532, 1),
        /** id = <code>245</code>, name = <code>"complexPropertyInVJSON"</code> */
        COMPLEXPROPERTYINVJSON("complexPropertyInVJSON", 245, 1526, 6),
        /** id = <code>211</code>, name = <code>"complexPropertyPath"</code> */
        COMPLEXPROPERTYPATH("complexPropertyPath", 211, 1373, 11),
        /** id = <code>113</code>, name = <code>"complexServiceOp"</code> */
        COMPLEXSERVICEOP("complexServiceOp", 113, 606, 1),
        /** id = <code>260</code>, name = <code>"complexServiceOpCall"</code> */
        COMPLEXSERVICEOPCALL("complexServiceOpCall", 260, 1623, 6),
        /** id = <code>340</code>, name = <code>"complexTypeInJSON"</code> */
        COMPLEXTYPEINJSON("complexTypeInJSON", 340, 2423, 1),
        /** id = <code>252</code>, name = <code>"complexTypeMetadataInVJSON"</code> */
        COMPLEXTYPEMETADATAINVJSON("complexTypeMetadataInVJSON", 252, 1568, 9),
        /** id = <code>93</code>, name = <code>"complexTypeName"</code> */
        COMPLEXTYPENAME("complexTypeName", 93, 512, 1),
        /** id = <code>217</code>, name = <code>"compoundKey"</code> */
        COMPOUNDKEY("compoundKey", 217, 1410, 8),
        /** id = <code>318</code>, name = <code>"concatMethodCallExpr"</code> */
        CONCATMETHODCALLEXPR("concatMethodCallExpr", 318, 2231, 19),
        /** id = <code>100</code>, name = <code>"concreteSpatialTypeName"</code> */
        CONCRETESPATIALTYPENAME("concreteSpatialTypeName", 100, 565, 15),
        /** id = <code>192</code>, name = <code>"count"</code> */
        COUNT("count", 192, 1069, 1),
        /** id = <code>12</code>, name = <code>"CR"</code> */
        CR("CR", 12, 30, 1),
        /** id = <code>14</code>, name = <code>"CRLF"</code> */
        CRLF("CRLF", 14, 32, 3),
        /** id = <code>11</code>, name = <code>"CTL"</code> */
        CTL("CTL", 11, 27, 3),
        /** id = <code>204</code>, name = <code>"customName"</code> */
        CUSTOMNAME("customName", 204, 1166, 29),
        /** id = <code>203</code>, name = <code>"customQueryOption"</code> */
        CUSTOMQUERYOPTION("customQueryOption", 203, 1156, 10),
        /** id = <code>205</code>, name = <code>"customValue"</code> */
        CUSTOMVALUE("customValue", 205, 1195, 16),
        /** id = <code>153</code>, name = <code>"dateTime"</code> */
        DATETIME("dateTime", 153, 758, 5),
        /** id = <code>155</code>, name = <code>"dateTimeBody"</code> */
        DATETIMEBODY("dateTimeBody", 155, 768, 18),
        /** id = <code>154</code>, name = <code>"dateTimeOffset"</code> */
        DATETIMEOFFSET("dateTimeOffset", 154, 763, 5),
        /** id = <code>156</code>, name = <code>"dateTimeOffsetBody"</code> */
        DATETIMEOFFSETBODY("dateTimeOffsetBody", 156, 786, 18),
        /** id = <code>81</code>, name = <code>"day"</code> */
        DAY("day", 81, 486, 1),
        /** id = <code>323</code>, name = <code>"dayMethodCallExpr"</code> */
        DAYMETHODCALLEXPR("dayMethodCallExpr", 323, 2294, 11),
        /** id = <code>33</code>, name = <code>"dec-octet"</code> */
        DEC_OCTET("dec-octet", 33, 242, 16),
        /** id = <code>157</code>, name = <code>"decimal"</code> */
        DECIMAL("decimal", 157, 804, 12),
        /** id = <code>1</code>, name = <code>"DIGIT"</code> */
        DIGIT("DIGIT", 1, 3, 1),
        /** id = <code>330</code>, name = <code>"distanceMethodCallExpr"</code> */
        DISTANCEMETHODCALLEXPR("distanceMethodCallExpr", 330, 2371, 17),
        /** id = <code>284</code>, name = <code>"divExpr"</code> */
        DIVEXPR("divExpr", 284, 1786, 6),
        /** id = <code>158</code>, name = <code>"double"</code> */
        DOUBLE("double", 158, 816, 36),
        /** id = <code>3</code>, name = <code>"DQUOTE"</code> */
        DQUOTE("DQUOTE", 3, 12, 1),
        /** id = <code>65</code>, name = <code>"end-object"</code> */
        END_OBJECT("end-object", 65, 407, 1),
        /** id = <code>309</code>, name = <code>"endsWithMethodCallExpr"</code> */
        ENDSWITHMETHODCALLEXPR("endsWithMethodCallExpr", 309, 2080, 17),
        /** id = <code>134</code>, name = <code>"entityAction"</code> */
        ENTITYACTION("entityAction", 134, 659, 1),
        /** id = <code>135</code>, name = <code>"entityColAction"</code> */
        ENTITYCOLACTION("entityColAction", 135, 660, 1),
        /** id = <code>341</code>, name = <code>"entityColFuncCall"</code> */
        ENTITYCOLFUNCCALL("entityColFuncCall", 341, 2424, 1),
        /** id = <code>121</code>, name = <code>"entityColFunction"</code> */
        ENTITYCOLFUNCTION("entityColFunction", 121, 616, 1),
        /** id = <code>223</code>, name = <code>"entityColFunctionCall"</code> */
        ENTITYCOLFUNCTIONCALL("entityColFunctionCall", 223, 1438, 3),
        /** id = <code>118</code>, name = <code>"entityColNavigationProperty"</code> */
        ENTITYCOLNAVIGATIONPROPERTY("entityColNavigationProperty", 118, 611, 1),
        /** id = <code>112</code>, name = <code>"entityColServiceOp"</code> */
        ENTITYCOLSERVICEOP("entityColServiceOp", 112, 605, 1),
        /** id = <code>259</code>, name = <code>"entityColServiceOpCall"</code> */
        ENTITYCOLSERVICEOPCALL("entityColServiceOpCall", 259, 1617, 6),
        /** id = <code>109</code>, name = <code>"entityContainerName"</code> */
        ENTITYCONTAINERNAME("entityContainerName", 109, 596, 1),
        /** id = <code>342</code>, name = <code>"entityFuncCall"</code> */
        ENTITYFUNCCALL("entityFuncCall", 342, 2425, 1),
        /** id = <code>120</code>, name = <code>"entityFunction"</code> */
        ENTITYFUNCTION("entityFunction", 120, 615, 1),
        /** id = <code>222</code>, name = <code>"entityFunctionCall"</code> */
        ENTITYFUNCTIONCALL("entityFunctionCall", 222, 1435, 3),
        /** id = <code>117</code>, name = <code>"entityNavigationProperty"</code> */
        ENTITYNAVIGATIONPROPERTY("entityNavigationProperty", 117, 610, 1),
        /** id = <code>343</code>, name = <code>"entityProperty"</code> */
        ENTITYPROPERTY("entityProperty", 343, 2426, 1),
        /** id = <code>111</code>, name = <code>"entityServiceOp"</code> */
        ENTITYSERVICEOP("entityServiceOp", 111, 604, 1),
        /** id = <code>258</code>, name = <code>"entityServiceOpCall"</code> */
        ENTITYSERVICEOPCALL("entityServiceOpCall", 258, 1611, 6),
        /** id = <code>91</code>, name = <code>"entitySetName"</code> */
        ENTITYSETNAME("entitySetName", 91, 510, 1),
        /** id = <code>92</code>, name = <code>"entityTypeName"</code> */
        ENTITYTYPENAME("entityTypeName", 92, 511, 1),
        /** id = <code>60</code>, name = <code>"EQ"</code> */
        EQ("EQ", 60, 400, 1),
        /** id = <code>275</code>, name = <code>"eqExpr"</code> */
        EQEXPR("eqExpr", 275, 1732, 6),
        /** id = <code>189</code>, name = <code>"expand"</code> */
        EXPAND("expand", 189, 1046, 3),
        /** id = <code>190</code>, name = <code>"expandClause"</code> */
        EXPANDCLAUSE("expandClause", 190, 1049, 6),
        /** id = <code>191</code>, name = <code>"expandItem"</code> */
        EXPANDITEM("expandItem", 191, 1055, 14),
        /** id = <code>193</code>, name = <code>"filter"</code> */
        FILTER("filter", 193, 1070, 8),
        /** id = <code>292</code>, name = <code>"firstBoolPrimitiveMemExpr"</code> */
        FIRSTBOOLPRIMITIVEMEMEXPR("firstBoolPrimitiveMemExpr", 292, 1889, 6),
        /** id = <code>291</code>, name = <code>"firstMemberExpr"</code> */
        FIRSTMEMBEREXPR("firstMemberExpr", 291, 1864, 25),
        /** id = <code>328</code>, name = <code>"floorMethodCallExpr"</code> */
        FLOORMETHODCALLEXPR("floorMethodCallExpr", 328, 2349, 11),
        /** id = <code>197</code>, name = <code>"format"</code> */
        FORMAT("format", 197, 1112, 8),
        /** id = <code>46</code>, name = <code>"fragment"</code> */
        FRAGMENT("fragment", 46, 316, 5),
        /** id = <code>142</code>, name = <code>"fullAction"</code> */
        FULLACTION("fullAction", 142, 674, 4),
        /** id = <code>130</code>, name = <code>"fullComplexColFunction"</code> */
        FULLCOMPLEXCOLFUNCTION("fullComplexColFunction", 130, 640, 4),
        /** id = <code>344</code>, name = <code>"fullComplexColFunctionCall"</code> */
        FULLCOMPLEXCOLFUNCTIONCALL("fullComplexColFunctionCall", 344, 2427, 1),
        /** id = <code>129</code>, name = <code>"fullComplexFunction"</code> */
        FULLCOMPLEXFUNCTION("fullComplexFunction", 129, 636, 4),
        /** id = <code>345</code>, name = <code>"fullComplexFunctionCall"</code> */
        FULLCOMPLEXFUNCTIONCALL("fullComplexFunctionCall", 345, 2428, 1),
        /** id = <code>128</code>, name = <code>"fullEntityColFunction"</code> */
        FULLENTITYCOLFUNCTION("fullEntityColFunction", 128, 632, 4),
        /** id = <code>346</code>, name = <code>"fullEntityColFunctionCall"</code> */
        FULLENTITYCOLFUNCTIONCALL("fullEntityColFunctionCall", 346, 2429, 1),
        /** id = <code>127</code>, name = <code>"fullEntityFunction"</code> */
        FULLENTITYFUNCTION("fullEntityFunction", 127, 628, 4),
        /** id = <code>347</code>, name = <code>"fullEntityFunctionCall"</code> */
        FULLENTITYFUNCTIONCALL("fullEntityFunctionCall", 347, 2430, 1),
        /** id = <code>133</code>, name = <code>"fullFunction"</code> */
        FULLFUNCTION("fullFunction", 133, 652, 7),
        /** id = <code>132</code>, name = <code>"fullPrimitiveColFunction"</code> */
        FULLPRIMITIVECOLFUNCTION("fullPrimitiveColFunction", 132, 648, 4),
        /** id = <code>131</code>, name = <code>"fullPrimitiveFunction"</code> */
        FULLPRIMITIVEFUNCTION("fullPrimitiveFunction", 131, 644, 4),
        /** id = <code>348</code>, name = <code>"fullPrimitiveFunctionCall"</code> */
        FULLPRIMITIVEFUNCTIONCALL("fullPrimitiveFunctionCall", 348, 2431, 1),
        /** id = <code>126</code>, name = <code>"function"</code> */
        FUNCTION("function", 126, 621, 7),
        /** id = <code>228</code>, name = <code>"functionCall"</code> */
        FUNCTIONCALL("functionCall", 228, 1453, 7),
        /** id = <code>349</code>, name = <code>"functionCallExpr"</code> */
        FUNCTIONCALLEXPR("functionCallExpr", 349, 2432, 1),
        /** id = <code>297</code>, name = <code>"functionExpr"</code> */
        FUNCTIONEXPR("functionExpr", 297, 1969, 27),
        /** id = <code>237</code>, name = <code>"functionParameter"</code> */
        FUNCTIONPARAMETER("functionParameter", 237, 1495, 6),
        /** id = <code>350</code>, name = <code>"functionParameterName"</code> */
        FUNCTIONPARAMETERNAME("functionParameterName", 350, 2433, 1),
        /** id = <code>236</code>, name = <code>"functionParameters"</code> */
        FUNCTIONPARAMETERS("functionParameters", 236, 1485, 10),
        /** id = <code>280</code>, name = <code>"geExpr"</code> */
        GEEXPR("geExpr", 280, 1762, 6),
        /** id = <code>50</code>, name = <code>"gen-delims"</code> */
        GEN_DELIMS("gen-delims", 50, 335, 8),
        /** id = <code>159</code>, name = <code>"geography"</code> */
        GEOGRAPHY("geography", 159, 852, 1),
        /** id = <code>160</code>, name = <code>"geographyCollection"</code> */
        GEOGRAPHYCOLLECTION("geographyCollection", 160, 853, 1),
        /** id = <code>161</code>, name = <code>"geographyLineString"</code> */
        GEOGRAPHYLINESTRING("geographyLineString", 161, 854, 1),
        /** id = <code>162</code>, name = <code>"geographyMultiLineString"</code> */
        GEOGRAPHYMULTILINESTRING("geographyMultiLineString", 162, 855, 1),
        /** id = <code>163</code>, name = <code>"geographyMultiPoint"</code> */
        GEOGRAPHYMULTIPOINT("geographyMultiPoint", 163, 856, 1),
        /** id = <code>164</code>, name = <code>"geographyMultiPolygon"</code> */
        GEOGRAPHYMULTIPOLYGON("geographyMultiPolygon", 164, 857, 1),
        /** id = <code>165</code>, name = <code>"geographyPoint"</code> */
        GEOGRAPHYPOINT("geographyPoint", 165, 858, 1),
        /** id = <code>166</code>, name = <code>"geographyPolygon"</code> */
        GEOGRAPHYPOLYGON("geographyPolygon", 166, 859, 1),
        /** id = <code>331</code>, name = <code>"geoLengthMethodCallExpr"</code> */
        GEOLENGTHMETHODCALLEXPR("geoLengthMethodCallExpr", 331, 2388, 11),
        /** id = <code>167</code>, name = <code>"geometry"</code> */
        GEOMETRY("geometry", 167, 860, 1),
        /** id = <code>168</code>, name = <code>"geometryCollection"</code> */
        GEOMETRYCOLLECTION("geometryCollection", 168, 861, 1),
        /** id = <code>169</code>, name = <code>"geometryLineString"</code> */
        GEOMETRYLINESTRING("geometryLineString", 169, 862, 1),
        /** id = <code>170</code>, name = <code>"geometryMultiLineString"</code> */
        GEOMETRYMULTILINESTRING("geometryMultiLineString", 170, 863, 1),
        /** id = <code>171</code>, name = <code>"geometryMultiPoint"</code> */
        GEOMETRYMULTIPOINT("geometryMultiPoint", 171, 864, 1),
        /** id = <code>172</code>, name = <code>"geometryMultiPolygon"</code> */
        GEOMETRYMULTIPOLYGON("geometryMultiPolygon", 172, 865, 1),
        /** id = <code>173</code>, name = <code>"geometryPoint"</code> */
        GEOMETRYPOINT("geometryPoint", 173, 866, 1),
        /** id = <code>174</code>, name = <code>"geometryPolygon"</code> */
        GEOMETRYPOLYGON("geometryPolygon", 174, 867, 1),
        /** id = <code>320</code>, name = <code>"getTotalOffsetMinutesExpr"</code> */
        GETTOTALOFFSETMINUTESEXPR("getTotalOffsetMinutesExpr", 320, 2261, 11),
        /** id = <code>279</code>, name = <code>"gtExpr"</code> */
        GTEXPR("gtExpr", 279, 1756, 6),
        /** id = <code>175</code>, name = <code>"guid"</code> */
        GUID("guid", 175, 868, 18),
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
        /** id = <code>324</code>, name = <code>"hourMethodCallExpr"</code> */
        HOURMETHODCALLEXPR("hourMethodCallExpr", 324, 2305, 11),
        /** id = <code>5</code>, name = <code>"HTAB"</code> */
        HTAB("HTAB", 5, 14, 1),
        /** id = <code>88</code>, name = <code>"identifierCharacter"</code> */
        IDENTIFIERCHARACTER("identifierCharacter", 88, 499, 4),
        /** id = <code>87</code>, name = <code>"identifierLeadingCharacter"</code> */
        IDENTIFIERLEADINGCHARACTER("identifierLeadingCharacter", 87, 496, 3),
        /** id = <code>303</code>, name = <code>"implicitVariableExpr"</code> */
        IMPLICITVARIABLEEXPR("implicitVariableExpr", 303, 2045, 1),
        /** id = <code>310</code>, name = <code>"indexOfMethodCallExpr"</code> */
        INDEXOFMETHODCALLEXPR("indexOfMethodCallExpr", 310, 2097, 17),
        /** id = <code>198</code>, name = <code>"inlinecount"</code> */
        INLINECOUNT("inlinecount", 198, 1120, 5),
        /** id = <code>305</code>, name = <code>"inscopeVariableExpr"</code> */
        INSCOPEVARIABLEEXPR("inscopeVariableExpr", 305, 2047, 3),
        /** id = <code>176</code>, name = <code>"int16"</code> */
        INT16("int16", 176, 886, 5),
        /** id = <code>177</code>, name = <code>"int32"</code> */
        INT32("int32", 177, 891, 5),
        /** id = <code>178</code>, name = <code>"int64"</code> */
        INT64("int64", 178, 896, 8),
        /** id = <code>332</code>, name = <code>"intersectsMethodCallExpr"</code> */
        INTERSECTSMETHODCALLEXPR("intersectsMethodCallExpr", 332, 2399, 17),
        /** id = <code>27</code>, name = <code>"IP-literal"</code> */
        IP_LITERAL("IP-literal", 27, 118, 6),
        /** id = <code>32</code>, name = <code>"IPv4address"</code> */
        IPV4ADDRESS("IPv4address", 32, 234, 8),
        /** id = <code>29</code>, name = <code>"IPv6address"</code> */
        IPV6ADDRESS("IPv6address", 29, 134, 92),
        /** id = <code>28</code>, name = <code>"IPvFuture"</code> */
        IPVFUTURE("IPvFuture", 28, 124, 10),
        /** id = <code>288</code>, name = <code>"isofExpr"</code> */
        ISOFEXPR("isofExpr", 288, 1807, 19),
        /** id = <code>215</code>, name = <code>"keyPredicate"</code> */
        KEYPREDICATE("keyPredicate", 215, 1403, 3),
        /** id = <code>219</code>, name = <code>"keyPropertyValue"</code> */
        KEYPROPERTYVALUE("keyPropertyValue", 219, 1422, 1),
        /** id = <code>218</code>, name = <code>"keyValuePair"</code> */
        KEYVALUEPAIR("keyValuePair", 218, 1418, 4),
        /** id = <code>306</code>, name = <code>"lambdaPredicateExpr"</code> */
        LAMBDAPREDICATEEXPR("lambdaPredicateExpr", 306, 2050, 1),
        /** id = <code>351</code>, name = <code>"lambdaPredicatePrefixExpr"</code> */
        LAMBDAPREDICATEPREFIXEXPR("lambdaPredicatePrefixExpr", 351, 2434, 1),
        /** id = <code>304</code>, name = <code>"lambdaVariableExpr"</code> */
        LAMBDAVARIABLEEXPR("lambdaVariableExpr", 304, 2046, 1),
        /** id = <code>278</code>, name = <code>"leExpr"</code> */
        LEEXPR("leExpr", 278, 1750, 6),
        /** id = <code>319</code>, name = <code>"lengthMethodCallExpr"</code> */
        LENGTHMETHODCALLEXPR("lengthMethodCallExpr", 319, 2250, 11),
        /** id = <code>13</code>, name = <code>"LF"</code> */
        LF("LF", 13, 31, 1),
        /** id = <code>270</code>, name = <code>"literalExpr"</code> */
        LITERALEXPR("literalExpr", 270, 1703, 1),
        /** id = <code>31</code>, name = <code>"ls32"</code> */
        LS32("ls32", 31, 228, 6),
        /** id = <code>277</code>, name = <code>"ltExpr"</code> */
        LTEXPR("ltExpr", 277, 1744, 6),
        /** id = <code>7</code>, name = <code>"LWSP"</code> */
        LWSP("LWSP", 7, 18, 6),
        /** id = <code>294</code>, name = <code>"memberExpr"</code> */
        MEMBEREXPR("memberExpr", 294, 1907, 27),
        /** id = <code>307</code>, name = <code>"methodCallExpr"</code> */
        METHODCALLEXPR("methodCallExpr", 307, 2051, 22),
        /** id = <code>83</code>, name = <code>"minute"</code> */
        MINUTE("minute", 83, 488, 1),
        /** id = <code>325</code>, name = <code>"minuteMethodCallExpr"</code> */
        MINUTEMETHODCALLEXPR("minuteMethodCallExpr", 325, 2316, 11),
        /** id = <code>285</code>, name = <code>"modExpr"</code> */
        MODEXPR("modExpr", 285, 1792, 6),
        /** id = <code>80</code>, name = <code>"month"</code> */
        MONTH("month", 80, 485, 1),
        /** id = <code>322</code>, name = <code>"monthMethodCallExpr"</code> */
        MONTHMETHODCALLEXPR("monthMethodCallExpr", 322, 2283, 11),
        /** id = <code>283</code>, name = <code>"mulExpr"</code> */
        MULEXPR("mulExpr", 283, 1780, 6),
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
        /** id = <code>276</code>, name = <code>"neExpr"</code> */
        NEEXPR("neExpr", 276, 1738, 6),
        /** id = <code>286</code>, name = <code>"negateExpr"</code> */
        NEGATEEXPR("negateExpr", 286, 1798, 5),
        /** id = <code>70</code>, name = <code>"negativeInfinity"</code> */
        NEGATIVEINFINITY("negativeInfinity", 70, 412, 1),
        /** id = <code>287</code>, name = <code>"notExpr"</code> */
        NOTEXPR("notExpr", 287, 1803, 4),
        /** id = <code>149</code>, name = <code>"null"</code> */
        NULL("null", 149, 734, 7),
        /** id = <code>10</code>, name = <code>"OCTET"</code> */
        OCTET("OCTET", 10, 26, 1),
        /** id = <code>86</code>, name = <code>"odataIdentifier"</code> */
        ODATAIDENTIFIER("odataIdentifier", 86, 492, 4),
        /** id = <code>185</code>, name = <code>"odataRelativeUri"</code> */
        ODATARELATIVEURI("odataRelativeUri", 185, 1018, 6),
        /** id = <code>183</code>, name = <code>"odataUri"</code> */
        ODATAURI("odataUri", 183, 998, 14),
        /** id = <code>74</code>, name = <code>"oneToNine"</code> */
        ONETONINE("oneToNine", 74, 420, 10),
        /** id = <code>94</code>, name = <code>"operationQualifier"</code> */
        OPERATIONQUALIFIER("operationQualifier", 94, 513, 7),
        /** id = <code>194</code>, name = <code>"orderby"</code> */
        ORDERBY("orderby", 194, 1078, 26),
        /** id = <code>274</code>, name = <code>"orExpr"</code> */
        OREXPR("orExpr", 274, 1726, 6),
        /** id = <code>239</code>, name = <code>"parameterAlias"</code> */
        PARAMETERALIAS("parameterAlias", 239, 1502, 4),
        /** id = <code>241</code>, name = <code>"parameterAndValue"</code> */
        PARAMETERANDVALUE("parameterAndValue", 241, 1510, 4),
        /** id = <code>352</code>, name = <code>"parameterNameAndValue"</code> */
        PARAMETERNAMEANDVALUE("parameterNameAndValue", 352, 2435, 1),
        /** id = <code>147</code>, name = <code>"parameterTypeName"</code> */
        PARAMETERTYPENAME("parameterTypeName", 147, 700, 1),
        /** id = <code>146</code>, name = <code>"parameterTypeNames"</code> */
        PARAMETERTYPENAMES("parameterTypeNames", 146, 693, 7),
        /** id = <code>254</code>, name = <code>"parameterValue"</code> */
        PARAMETERVALUE("parameterValue", 254, 1585, 5),
        /** id = <code>271</code>, name = <code>"parenExpr"</code> */
        PARENEXPR("parenExpr", 271, 1704, 8),
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
        /** id = <code>353</code>, name = <code>"primitiveColFuncCall"</code> */
        PRIMITIVECOLFUNCCALL("primitiveColFuncCall", 353, 2436, 1),
        /** id = <code>125</code>, name = <code>"primitiveColFunction"</code> */
        PRIMITIVECOLFUNCTION("primitiveColFunction", 125, 620, 1),
        /** id = <code>227</code>, name = <code>"primitiveColFunctionCall"</code> */
        PRIMITIVECOLFUNCTIONCALL("primitiveColFunctionCall", 227, 1450, 3),
        /** id = <code>354</code>, name = <code>"primitiveColInJSON"</code> */
        PRIMITIVECOLINJSON("primitiveColInJSON", 354, 2437, 1),
        /** id = <code>104</code>, name = <code>"primitiveColProperty"</code> */
        PRIMITIVECOLPROPERTY("primitiveColProperty", 104, 585, 1),
        /** id = <code>116</code>, name = <code>"primitiveColServiceOp"</code> */
        PRIMITIVECOLSERVICEOP("primitiveColServiceOp", 116, 609, 1),
        /** id = <code>263</code>, name = <code>"primitiveColServiceOpCall"</code> */
        PRIMITIVECOLSERVICEOPCALL("primitiveColServiceOpCall", 263, 1641, 6),
        /** id = <code>355</code>, name = <code>"primitiveFuncCall"</code> */
        PRIMITIVEFUNCCALL("primitiveFuncCall", 355, 2438, 1),
        /** id = <code>124</code>, name = <code>"primitiveFunction"</code> */
        PRIMITIVEFUNCTION("primitiveFunction", 124, 619, 1),
        /** id = <code>226</code>, name = <code>"primitiveFunctionCall"</code> */
        PRIMITIVEFUNCTIONCALL("primitiveFunctionCall", 226, 1447, 3),
        /** id = <code>102</code>, name = <code>"primitiveKeyProperty"</code> */
        PRIMITIVEKEYPROPERTY("primitiveKeyProperty", 102, 583, 1),
        /** id = <code>148</code>, name = <code>"primitiveLiteral"</code> */
        PRIMITIVELITERAL("primitiveLiteral", 148, 701, 33),
        /** id = <code>251</code>, name = <code>"primitiveLiteralInJSONLight"</code> */
        PRIMITIVELITERALINJSONLIGHT("primitiveLiteralInJSONLight", 251, 1567, 1),
        /** id = <code>250</code>, name = <code>"primitiveLiteralInVJSON"</code> */
        PRIMITIVELITERALINVJSON("primitiveLiteralInVJSON", 250, 1566, 1),
        /** id = <code>103</code>, name = <code>"primitiveNonKeyProperty"</code> */
        PRIMITIVENONKEYPROPERTY("primitiveNonKeyProperty", 103, 584, 1),
        /** id = <code>238</code>, name = <code>"primitiveParameterValue"</code> */
        PRIMITIVEPARAMETERVALUE("primitiveParameterValue", 238, 1501, 1),
        /** id = <code>243</code>, name = <code>"primitivePropertyInVJSON"</code> */
        PRIMITIVEPROPERTYINVJSON("primitivePropertyInVJSON", 243, 1515, 8),
        /** id = <code>210</code>, name = <code>"primitivePropertyPath"</code> */
        PRIMITIVEPROPERTYPATH("primitivePropertyPath", 210, 1364, 9),
        /** id = <code>242</code>, name = <code>"primitivePropInJSONLight"</code> */
        PRIMITIVEPROPINJSONLIGHT("primitivePropInJSONLight", 242, 1514, 1),
        /** id = <code>115</code>, name = <code>"primitiveServiceOp"</code> */
        PRIMITIVESERVICEOP("primitiveServiceOp", 115, 608, 1),
        /** id = <code>262</code>, name = <code>"primitiveServiceOpCall"</code> */
        PRIMITIVESERVICEOPCALL("primitiveServiceOpCall", 262, 1635, 6),
        /** id = <code>99</code>, name = <code>"primitiveTypeName"</code> */
        PRIMITIVETYPENAME("primitiveTypeName", 99, 542, 23),
        /** id = <code>356</code>, name = <code>"primitiveVJSONLiteral"</code> */
        PRIMITIVEVJSONLITERAL("primitiveVJSONLiteral", 356, 2439, 1),
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
        /** id = <code>187</code>, name = <code>"queryOption"</code> */
        QUERYOPTION("queryOption", 187, 1030, 6),
        /** id = <code>186</code>, name = <code>"queryOptions"</code> */
        QUERYOPTIONS("queryOptions", 186, 1024, 6),
        /** id = <code>357</code>, name = <code>"quotation-mark"</code> */
        QUOTATION_MARK("quotation-mark", 357, 2440, 1),
        /** id = <code>34</code>, name = <code>"reg-name"</code> */
        REG_NAME("reg-name", 34, 258, 5),
        /** id = <code>21</code>, name = <code>"relative-part"</code> */
        RELATIVE_PART("relative-part", 21, 79, 8),
        /** id = <code>20</code>, name = <code>"relative-ref"</code> */
        RELATIVE_REF("relative-ref", 20, 69, 10),
        /** id = <code>311</code>, name = <code>"replaceMethodCallExpr"</code> */
        REPLACEMETHODCALLEXPR("replaceMethodCallExpr", 311, 2114, 23),
        /** id = <code>49</code>, name = <code>"reserved"</code> */
        RESERVED("reserved", 49, 332, 3),
        /** id = <code>206</code>, name = <code>"resourcePath"</code> */
        RESOURCEPATH("resourcePath", 206, 1211, 55),
        /** id = <code>327</code>, name = <code>"roundMethodCallExpr"</code> */
        ROUNDMETHODCALLEXPR("roundMethodCallExpr", 327, 2338, 11),
        /** id = <code>179</code>, name = <code>"sbyte"</code> */
        SBYTE("sbyte", 179, 904, 5),
        /** id = <code>22</code>, name = <code>"scheme"</code> */
        SCHEME("scheme", 22, 87, 9),
        /** id = <code>84</code>, name = <code>"second"</code> */
        SECOND("second", 84, 489, 1),
        /** id = <code>326</code>, name = <code>"secondMethodCallExpr"</code> */
        SECONDMETHODCALLEXPR("secondMethodCallExpr", 326, 2327, 11),
        /** id = <code>41</code>, name = <code>"segment"</code> */
        SEGMENT("segment", 41, 295, 2),
        /** id = <code>42</code>, name = <code>"segment-nz"</code> */
        SEGMENT_NZ("segment-nz", 42, 297, 2),
        /** id = <code>43</code>, name = <code>"segment-nz-nc"</code> */
        SEGMENT_NZ_NC("segment-nz-nc", 43, 299, 6),
        /** id = <code>199</code>, name = <code>"select"</code> */
        SELECT("select", 199, 1125, 3),
        /** id = <code>200</code>, name = <code>"selectClause"</code> */
        SELECTCLAUSE("selectClause", 200, 1128, 6),
        /** id = <code>201</code>, name = <code>"selectItem"</code> */
        SELECTITEM("selectItem", 201, 1134, 18),
        /** id = <code>61</code>, name = <code>"SEMI"</code> */
        SEMI("SEMI", 61, 401, 1),
        /** id = <code>110</code>, name = <code>"serviceOperation"</code> */
        SERVICEOPERATION("serviceOperation", 110, 597, 7),
        /** id = <code>264</code>, name = <code>"serviceOperationCall"</code> */
        SERVICEOPERATIONCALL("serviceOperationCall", 264, 1647, 7),
        /** id = <code>358</code>, name = <code>"serviceOperationParameterName"</code> */
        SERVICEOPERATIONPARAMETERNAME("serviceOperationParameterName", 358, 2441, 1),
        /** id = <code>265</code>, name = <code>"serviceOpParameterName"</code> */
        SERVICEOPPARAMETERNAME("serviceOpParameterName", 265, 1654, 1),
        /** id = <code>184</code>, name = <code>"serviceRoot"</code> */
        SERVICEROOT("serviceRoot", 184, 1012, 6),
        /** id = <code>63</code>, name = <code>"sign"</code> */
        SIGN("sign", 63, 403, 3),
        /** id = <code>216</code>, name = <code>"simpleKey"</code> */
        SIMPLEKEY("simpleKey", 216, 1406, 4),
        /** id = <code>180</code>, name = <code>"single"</code> */
        SINGLE("single", 180, 909, 36),
        /** id = <code>208</code>, name = <code>"singleNavigation"</code> */
        SINGLENAVIGATION("singleNavigation", 208, 1302, 26),
        /** id = <code>296</code>, name = <code>"singleNavigationExpr"</code> */
        SINGLENAVIGATIONEXPR("singleNavigationExpr", 296, 1944, 25),
        /** id = <code>195</code>, name = <code>"skip"</code> */
        SKIP("skip", 195, 1104, 4),
        /** id = <code>202</code>, name = <code>"skiptoken"</code> */
        SKIPTOKEN("skiptoken", 202, 1152, 4),
        /** id = <code>266</code>, name = <code>"sopParameterNameAndValue"</code> */
        SOPPARAMETERNAMEANDVALUE("sopParameterNameAndValue", 266, 1655, 4),
        /** id = <code>4</code>, name = <code>"SP"</code> */
        SP("SP", 4, 13, 1),
        /** id = <code>59</code>, name = <code>"SQUOTE"</code> */
        SQUOTE("SQUOTE", 59, 399, 1),
        /** id = <code>68</code>, name = <code>"star"</code> */
        STAR("star", 68, 410, 1),
        /** id = <code>312</code>, name = <code>"startsWithMethodCallExpr"</code> */
        STARTSWITHMETHODCALLEXPR("startsWithMethodCallExpr", 312, 2137, 17),
        /** id = <code>107</code>, name = <code>"streamProperty"</code> */
        STREAMPROPERTY("streamProperty", 107, 588, 1),
        /** id = <code>213</code>, name = <code>"streamPropertyPath"</code> */
        STREAMPROPERTYPATH("streamPropertyPath", 213, 1395, 7),
        /** id = <code>181</code>, name = <code>"string"</code> */
        STRING("string", 181, 945, 8),
        /** id = <code>51</code>, name = <code>"sub-delims"</code> */
        SUB_DELIMS("sub-delims", 51, 343, 12),
        /** id = <code>282</code>, name = <code>"subExpr"</code> */
        SUBEXPR("subExpr", 282, 1774, 6),
        /** id = <code>316</code>, name = <code>"substringMethodCallExp"</code> */
        SUBSTRINGMETHODCALLEXP("substringMethodCallExp", 316, 2187, 25),
        /** id = <code>359</code>, name = <code>"substringMethodCallExpr"</code> */
        SUBSTRINGMETHODCALLEXPR("substringMethodCallExpr", 359, 2442, 1),
        /** id = <code>317</code>, name = <code>"substringOfMethodCallExpr"</code> */
        SUBSTRINGOFMETHODCALLEXPR("substringOfMethodCallExpr", 317, 2212, 19),
        /** id = <code>188</code>, name = <code>"systemQueryOption"</code> */
        SYSTEMQUERYOPTION("systemQueryOption", 188, 1036, 10),
        /** id = <code>182</code>, name = <code>"time"</code> */
        TIME("time", 182, 953, 45),
        /** id = <code>313</code>, name = <code>"toLowerMethodCallExpr"</code> */
        TOLOWERMETHODCALLEXPR("toLowerMethodCallExpr", 313, 2154, 11),
        /** id = <code>196</code>, name = <code>"top"</code> */
        TOP("top", 196, 1108, 4),
        /** id = <code>314</code>, name = <code>"toUpperMethodCallExpr"</code> */
        TOUPPERMETHODCALLEXPR("toUpperMethodCallExpr", 314, 2165, 11),
        /** id = <code>315</code>, name = <code>"trimMethodCallExpr"</code> */
        TRIMMETHODCALLEXPR("trimMethodCallExpr", 315, 2176, 11),
        /** id = <code>253</code>, name = <code>"typeNVPInVJSON"</code> */
        TYPENVPINVJSON("typeNVPInVJSON", 253, 1577, 8),
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
        /** id = <code>214</code>, name = <code>"value"</code> */
        VALUE("value", 214, 1402, 1),
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
        /** id = <code>321</code>, name = <code>"yearMethodCallExpr"</code> */
        YEARMETHODCALLEXPR("yearMethodCallExpr", 321, 2272, 11),
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
    	Rule[] rules = new Rule[360];
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
    	Opcode[] op = new Opcode[2443];
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
        op[703] = getOpcodeRnm(150, 741); // binary
        op[704] = getOpcodeRnm(153, 758); // dateTime
        op[705] = getOpcodeRnm(154, 763); // dateTimeOffset
        op[706] = getOpcodeRnm(157, 804); // decimal
        op[707] = getOpcodeRnm(158, 816); // double
        op[708] = getOpcodeRnm(159, 852); // geography
        op[709] = getOpcodeRnm(160, 853); // geographyCollection
        op[710] = getOpcodeRnm(161, 854); // geographyLineString
        op[711] = getOpcodeRnm(162, 855); // geographyMultiLineString
        op[712] = getOpcodeRnm(163, 856); // geographyMultiPoint
        op[713] = getOpcodeRnm(164, 857); // geographyMultiPolygon
        op[714] = getOpcodeRnm(165, 858); // geographyPoint
        op[715] = getOpcodeRnm(166, 859); // geographyPolygon
        op[716] = getOpcodeRnm(167, 860); // geometry
        op[717] = getOpcodeRnm(168, 861); // geometryCollection
        op[718] = getOpcodeRnm(169, 862); // geometryLineString
        op[719] = getOpcodeRnm(170, 863); // geometryMultiLineString
        op[720] = getOpcodeRnm(171, 864); // geometryMultiPoint
        op[721] = getOpcodeRnm(172, 865); // geometryMultiPolygon
        op[722] = getOpcodeRnm(173, 866); // geometryPoint
        op[723] = getOpcodeRnm(174, 867); // geometryPolygon
        op[724] = getOpcodeRnm(175, 868); // guid
        op[725] = getOpcodeRnm(176, 886); // int16
        op[726] = getOpcodeRnm(177, 891); // int32
        op[727] = getOpcodeRnm(178, 896); // int64
        op[728] = getOpcodeRnm(179, 904); // sbyte
        op[729] = getOpcodeRnm(152, 756); // byte
        op[730] = getOpcodeRnm(180, 909); // single
        op[731] = getOpcodeRnm(181, 945); // string
        op[732] = getOpcodeRnm(182, 953); // time
        op[733] = getOpcodeRnm(151, 749); // boolean
        {int[] a = {735,736}; op[734] = getOpcodeCat(a);}
        {char[] a = {110,117,108,108}; op[735] = getOpcodeTls(a);}
        op[736] = getOpcodeRep((char)0, (char)1, 737);
        {int[] a = {738,739,740}; op[737] = getOpcodeCat(a);}
        {char[] a = {39}; op[738] = getOpcodeTls(a);}
        op[739] = getOpcodeRnm(96, 523); // qualifiedTypeName
        {char[] a = {39}; op[740] = getOpcodeTls(a);}
        {int[] a = {742,745,746,748}; op[741] = getOpcodeCat(a);}
        {int[] a = {743,744}; op[742] = getOpcodeAlt(a);}
        {char[] a = {88}; op[743] = getOpcodeTbs(a);}
        {char[] a = {98,105,110,97,114,121}; op[744] = getOpcodeTls(a);}
        op[745] = getOpcodeRnm(59, 399); // SQUOTE
        op[746] = getOpcodeRep((char)2, Character.MAX_VALUE, 747);
        op[747] = getOpcodeRnm(2, 4); // HEXDIG
        op[748] = getOpcodeRnm(59, 399); // SQUOTE
        {int[] a = {750,753}; op[749] = getOpcodeAlt(a);}
        {int[] a = {751,752}; op[750] = getOpcodeAlt(a);}
        {char[] a = {116,114,117,101}; op[751] = getOpcodeTls(a);}
        {char[] a = {49}; op[752] = getOpcodeTls(a);}
        {int[] a = {754,755}; op[753] = getOpcodeAlt(a);}
        {char[] a = {102,97,108,115,101}; op[754] = getOpcodeTls(a);}
        {char[] a = {48}; op[755] = getOpcodeTls(a);}
        op[756] = getOpcodeRep((char)1, (char)3, 757);
        op[757] = getOpcodeRnm(1, 3); // DIGIT
        {int[] a = {759,760,761,762}; op[758] = getOpcodeCat(a);}
        {char[] a = {100,97,116,101,116,105,109,101}; op[759] = getOpcodeTls(a);}
        op[760] = getOpcodeRnm(59, 399); // SQUOTE
        op[761] = getOpcodeRnm(155, 768); // dateTimeBody
        op[762] = getOpcodeRnm(59, 399); // SQUOTE
        {int[] a = {764,765,766,767}; op[763] = getOpcodeCat(a);}
        {char[] a = {100,97,116,101,116,105,109,101,111,102,102,115,101,116}; op[764] = getOpcodeTls(a);}
        op[765] = getOpcodeRnm(59, 399); // SQUOTE
        op[766] = getOpcodeRnm(156, 786); // dateTimeOffsetBody
        op[767] = getOpcodeRnm(59, 399); // SQUOTE
        {int[] a = {769,770,771,772,773,774,775,776,777,778}; op[768] = getOpcodeCat(a);}
        op[769] = getOpcodeRnm(73, 418); // year
        {char[] a = {45}; op[770] = getOpcodeTls(a);}
        op[771] = getOpcodeRnm(80, 485); // month
        {char[] a = {45}; op[772] = getOpcodeTls(a);}
        op[773] = getOpcodeRnm(81, 486); // day
        {char[] a = {84}; op[774] = getOpcodeTls(a);}
        op[775] = getOpcodeRnm(82, 487); // hour
        {char[] a = {58}; op[776] = getOpcodeTls(a);}
        op[777] = getOpcodeRnm(83, 488); // minute
        op[778] = getOpcodeRep((char)0, (char)1, 779);
        {int[] a = {780,781,782}; op[779] = getOpcodeCat(a);}
        {char[] a = {58}; op[780] = getOpcodeTls(a);}
        op[781] = getOpcodeRnm(84, 489); // second
        op[782] = getOpcodeRep((char)0, (char)1, 783);
        {int[] a = {784,785}; op[783] = getOpcodeCat(a);}
        {char[] a = {46}; op[784] = getOpcodeTls(a);}
        op[785] = getOpcodeRnm(85, 490); // nanoSeconds
        {int[] a = {787,790,796}; op[786] = getOpcodeAlt(a);}
        {int[] a = {788,789}; op[787] = getOpcodeCat(a);}
        op[788] = getOpcodeRnm(155, 768); // dateTimeBody
        {char[] a = {90}; op[789] = getOpcodeTls(a);}
        {int[] a = {791,792,793,794}; op[790] = getOpcodeCat(a);}
        op[791] = getOpcodeRnm(155, 768); // dateTimeBody
        op[792] = getOpcodeRnm(63, 403); // sign
        op[793] = getOpcodeRnm(76, 441); // zeroToThirteen
        op[794] = getOpcodeRep((char)0, (char)1, 795);
        {char[] a = {58,48,48}; op[795] = getOpcodeTls(a);}
        {int[] a = {797,798,799,800}; op[796] = getOpcodeCat(a);}
        op[797] = getOpcodeRnm(155, 768); // dateTimeBody
        op[798] = getOpcodeRnm(63, 403); // sign
        op[799] = getOpcodeRnm(75, 430); // zeroToTwelve
        op[800] = getOpcodeRep((char)0, (char)1, 801);
        {int[] a = {802,803}; op[801] = getOpcodeCat(a);}
        {char[] a = {58}; op[802] = getOpcodeTls(a);}
        op[803] = getOpcodeRnm(77, 444); // zeroToSixty
        {int[] a = {805,806,808,813}; op[804] = getOpcodeCat(a);}
        op[805] = getOpcodeRnm(63, 403); // sign
        op[806] = getOpcodeRep((char)1, (char)29, 807);
        op[807] = getOpcodeRnm(1, 3); // DIGIT
        op[808] = getOpcodeRep((char)0, (char)1, 809);
        {int[] a = {810,811}; op[809] = getOpcodeCat(a);}
        {char[] a = {46}; op[810] = getOpcodeTls(a);}
        op[811] = getOpcodeRep((char)1, (char)29, 812);
        op[812] = getOpcodeRnm(1, 3); // DIGIT
        {int[] a = {814,815}; op[813] = getOpcodeAlt(a);}
        {char[] a = {77}; op[814] = getOpcodeTls(a);}
        {char[] a = {109}; op[815] = getOpcodeTls(a);}
        {int[] a = {817,846}; op[816] = getOpcodeAlt(a);}
        {int[] a = {818,843}; op[817] = getOpcodeCat(a);}
        {int[] a = {819,823,830}; op[818] = getOpcodeAlt(a);}
        {int[] a = {820,821}; op[819] = getOpcodeCat(a);}
        op[820] = getOpcodeRnm(63, 403); // sign
        op[821] = getOpcodeRep((char)1, (char)17, 822);
        op[822] = getOpcodeRnm(1, 3); // DIGIT
        {int[] a = {824,825,827,828}; op[823] = getOpcodeCat(a);}
        op[824] = getOpcodeRnm(63, 403); // sign
        op[825] = getOpcodeRep((char)0, Character.MAX_VALUE, 826);
        op[826] = getOpcodeRnm(1, 3); // DIGIT
        {char[] a = {46}; op[827] = getOpcodeTls(a);}
        op[828] = getOpcodeRep((char)0, Character.MAX_VALUE, 829);
        op[829] = getOpcodeRnm(1, 3); // DIGIT
        {int[] a = {831,832,834,835,837,840,841}; op[830] = getOpcodeCat(a);}
        op[831] = getOpcodeRnm(63, 403); // sign
        op[832] = getOpcodeRep((char)1, Character.MAX_VALUE, 833);
        op[833] = getOpcodeRnm(1, 3); // DIGIT
        {char[] a = {46}; op[834] = getOpcodeTls(a);}
        op[835] = getOpcodeRep((char)16, Character.MAX_VALUE, 836);
        op[836] = getOpcodeRnm(1, 3); // DIGIT
        {int[] a = {838,839}; op[837] = getOpcodeAlt(a);}
        {char[] a = {101}; op[838] = getOpcodeTls(a);}
        {char[] a = {69}; op[839] = getOpcodeTls(a);}
        op[840] = getOpcodeRnm(63, 403); // sign
        op[841] = getOpcodeRep((char)1, (char)3, 842);
        op[842] = getOpcodeRnm(1, 3); // DIGIT
        {int[] a = {844,845}; op[843] = getOpcodeAlt(a);}
        {char[] a = {68}; op[844] = getOpcodeTls(a);}
        {char[] a = {100}; op[845] = getOpcodeTls(a);}
        {int[] a = {847,848}; op[846] = getOpcodeCat(a);}
        op[847] = getOpcodeRnm(72, 414); // nanInfinity
        op[848] = getOpcodeRep((char)0, (char)1, 849);
        {int[] a = {850,851}; op[849] = getOpcodeAlt(a);}
        {char[] a = {68}; op[850] = getOpcodeTls(a);}
        {char[] a = {100}; op[851] = getOpcodeTls(a);}
        {char[] a = {123,84,79,68,79,49,125}; op[852] = getOpcodeTls(a);}
        {char[] a = {123,84,79,68,79,50,125}; op[853] = getOpcodeTls(a);}
        {char[] a = {123,84,79,68,79,51,125}; op[854] = getOpcodeTls(a);}
        {char[] a = {123,84,79,68,79,52,125}; op[855] = getOpcodeTls(a);}
        {char[] a = {123,84,79,68,79,53,125}; op[856] = getOpcodeTls(a);}
        {char[] a = {123,84,79,68,79,54,125}; op[857] = getOpcodeTls(a);}
        {char[] a = {123,84,79,68,79,55,125}; op[858] = getOpcodeTls(a);}
        {char[] a = {123,84,79,68,79,56,125}; op[859] = getOpcodeTls(a);}
        {char[] a = {123,84,79,68,79,57,125}; op[860] = getOpcodeTls(a);}
        {char[] a = {123,84,79,68,79,49,48,125}; op[861] = getOpcodeTls(a);}
        {char[] a = {123,84,79,68,79,49,49,125}; op[862] = getOpcodeTls(a);}
        {char[] a = {123,84,79,68,79,49,50,125}; op[863] = getOpcodeTls(a);}
        {char[] a = {123,84,79,68,79,49,51,125}; op[864] = getOpcodeTls(a);}
        {char[] a = {123,84,79,68,79,49,52,125}; op[865] = getOpcodeTls(a);}
        {char[] a = {123,84,79,68,79,49,53,125}; op[866] = getOpcodeTls(a);}
        {char[] a = {123,84,79,68,79,49,54,125}; op[867] = getOpcodeTls(a);}
        {int[] a = {869,870,871,873,874,876,877,879,880,882,883,885}; op[868] = getOpcodeCat(a);}
        {char[] a = {103,117,105,100}; op[869] = getOpcodeTls(a);}
        op[870] = getOpcodeRnm(59, 399); // SQUOTE
        op[871] = getOpcodeRep((char)8, (char)8, 872);
        op[872] = getOpcodeRnm(2, 4); // HEXDIG
        {char[] a = {45}; op[873] = getOpcodeTls(a);}
        op[874] = getOpcodeRep((char)4, (char)4, 875);
        op[875] = getOpcodeRnm(2, 4); // HEXDIG
        {char[] a = {45}; op[876] = getOpcodeTls(a);}
        op[877] = getOpcodeRep((char)4, (char)4, 878);
        op[878] = getOpcodeRnm(2, 4); // HEXDIG
        {char[] a = {45}; op[879] = getOpcodeTls(a);}
        op[880] = getOpcodeRep((char)4, (char)4, 881);
        op[881] = getOpcodeRnm(2, 4); // HEXDIG
        {char[] a = {45}; op[882] = getOpcodeTls(a);}
        op[883] = getOpcodeRep((char)12, (char)12, 884);
        op[884] = getOpcodeRnm(2, 4); // HEXDIG
        op[885] = getOpcodeRnm(59, 399); // SQUOTE
        {int[] a = {887,889}; op[886] = getOpcodeCat(a);}
        op[887] = getOpcodeRep((char)0, (char)1, 888);
        op[888] = getOpcodeRnm(63, 403); // sign
        op[889] = getOpcodeRep((char)1, (char)5, 890);
        op[890] = getOpcodeRnm(1, 3); // DIGIT
        {int[] a = {892,894}; op[891] = getOpcodeCat(a);}
        op[892] = getOpcodeRep((char)0, (char)1, 893);
        op[893] = getOpcodeRnm(63, 403); // sign
        op[894] = getOpcodeRep((char)1, (char)10, 895);
        op[895] = getOpcodeRnm(1, 3); // DIGIT
        {int[] a = {897,899,901}; op[896] = getOpcodeCat(a);}
        op[897] = getOpcodeRep((char)0, (char)1, 898);
        op[898] = getOpcodeRnm(63, 403); // sign
        op[899] = getOpcodeRep((char)1, (char)19, 900);
        op[900] = getOpcodeRnm(1, 3); // DIGIT
        {int[] a = {902,903}; op[901] = getOpcodeAlt(a);}
        {char[] a = {76}; op[902] = getOpcodeTls(a);}
        {char[] a = {108}; op[903] = getOpcodeTls(a);}
        {int[] a = {905,907}; op[904] = getOpcodeCat(a);}
        op[905] = getOpcodeRep((char)0, (char)1, 906);
        op[906] = getOpcodeRnm(63, 403); // sign
        op[907] = getOpcodeRep((char)1, (char)3, 908);
        op[908] = getOpcodeRnm(1, 3); // DIGIT
        {int[] a = {910,939}; op[909] = getOpcodeAlt(a);}
        {int[] a = {911,936}; op[910] = getOpcodeCat(a);}
        {int[] a = {912,916,923}; op[911] = getOpcodeAlt(a);}
        {int[] a = {913,914}; op[912] = getOpcodeCat(a);}
        op[913] = getOpcodeRnm(63, 403); // sign
        op[914] = getOpcodeRep((char)1, (char)8, 915);
        op[915] = getOpcodeRnm(1, 3); // DIGIT
        {int[] a = {917,918,920,921}; op[916] = getOpcodeCat(a);}
        op[917] = getOpcodeRnm(63, 403); // sign
        op[918] = getOpcodeRep((char)0, Character.MAX_VALUE, 919);
        op[919] = getOpcodeRnm(1, 3); // DIGIT
        {char[] a = {46}; op[920] = getOpcodeTls(a);}
        op[921] = getOpcodeRep((char)0, Character.MAX_VALUE, 922);
        op[922] = getOpcodeRnm(1, 3); // DIGIT
        {int[] a = {924,925,927,928,930,933,934}; op[923] = getOpcodeCat(a);}
        op[924] = getOpcodeRnm(63, 403); // sign
        op[925] = getOpcodeRep((char)1, Character.MAX_VALUE, 926);
        op[926] = getOpcodeRnm(1, 3); // DIGIT
        {char[] a = {46}; op[927] = getOpcodeTls(a);}
        op[928] = getOpcodeRep((char)8, Character.MAX_VALUE, 929);
        op[929] = getOpcodeRnm(1, 3); // DIGIT
        {int[] a = {931,932}; op[930] = getOpcodeAlt(a);}
        {char[] a = {101}; op[931] = getOpcodeTls(a);}
        {char[] a = {69}; op[932] = getOpcodeTls(a);}
        op[933] = getOpcodeRnm(63, 403); // sign
        op[934] = getOpcodeRep((char)1, (char)2, 935);
        op[935] = getOpcodeRnm(1, 3); // DIGIT
        {int[] a = {937,938}; op[936] = getOpcodeAlt(a);}
        {char[] a = {70}; op[937] = getOpcodeTls(a);}
        {char[] a = {102}; op[938] = getOpcodeTls(a);}
        {int[] a = {940,941}; op[939] = getOpcodeCat(a);}
        op[940] = getOpcodeRnm(72, 414); // nanInfinity
        op[941] = getOpcodeRep((char)0, (char)1, 942);
        {int[] a = {943,944}; op[942] = getOpcodeAlt(a);}
        {char[] a = {70}; op[943] = getOpcodeTls(a);}
        {char[] a = {102}; op[944] = getOpcodeTls(a);}
        {int[] a = {946,947,952}; op[945] = getOpcodeCat(a);}
        op[946] = getOpcodeRnm(59, 399); // SQUOTE
        op[947] = getOpcodeRep((char)0, Character.MAX_VALUE, 948);
        {int[] a = {949,950,951}; op[948] = getOpcodeAlt(a);}
        op[949] = getOpcodeRnm(48, 325); // unreserved
        op[950] = getOpcodeRnm(47, 321); // pct-encoded
        {char[] a = {39,39}; op[951] = getOpcodeTls(a);}
        op[952] = getOpcodeRnm(59, 399); // SQUOTE
        {int[] a = {954,955,956,958,959,964,969,974,997}; op[953] = getOpcodeCat(a);}
        {char[] a = {116,105,109,101}; op[954] = getOpcodeTls(a);}
        op[955] = getOpcodeRnm(59, 399); // SQUOTE
        op[956] = getOpcodeRep((char)0, (char)1, 957);
        op[957] = getOpcodeRnm(63, 403); // sign
        {char[] a = {80}; op[958] = getOpcodeTls(a);}
        op[959] = getOpcodeRep((char)0, (char)1, 960);
        {int[] a = {961,963}; op[960] = getOpcodeCat(a);}
        op[961] = getOpcodeRep((char)1, Character.MAX_VALUE, 962);
        op[962] = getOpcodeRnm(1, 3); // DIGIT
        {char[] a = {89}; op[963] = getOpcodeTls(a);}
        op[964] = getOpcodeRep((char)0, (char)1, 965);
        {int[] a = {966,968}; op[965] = getOpcodeCat(a);}
        op[966] = getOpcodeRep((char)1, Character.MAX_VALUE, 967);
        op[967] = getOpcodeRnm(1, 3); // DIGIT
        {char[] a = {77}; op[968] = getOpcodeTls(a);}
        op[969] = getOpcodeRep((char)0, (char)1, 970);
        {int[] a = {971,973}; op[970] = getOpcodeCat(a);}
        op[971] = getOpcodeRep((char)1, Character.MAX_VALUE, 972);
        op[972] = getOpcodeRnm(1, 3); // DIGIT
        {char[] a = {68}; op[973] = getOpcodeTls(a);}
        op[974] = getOpcodeRep((char)0, (char)1, 975);
        {int[] a = {976,977,982,987}; op[975] = getOpcodeCat(a);}
        {char[] a = {84}; op[976] = getOpcodeTls(a);}
        op[977] = getOpcodeRep((char)0, (char)1, 978);
        {int[] a = {979,981}; op[978] = getOpcodeCat(a);}
        op[979] = getOpcodeRep((char)1, Character.MAX_VALUE, 980);
        op[980] = getOpcodeRnm(1, 3); // DIGIT
        {char[] a = {72}; op[981] = getOpcodeTls(a);}
        op[982] = getOpcodeRep((char)0, (char)1, 983);
        {int[] a = {984,986}; op[983] = getOpcodeCat(a);}
        op[984] = getOpcodeRep((char)1, Character.MAX_VALUE, 985);
        op[985] = getOpcodeRnm(1, 3); // DIGIT
        {char[] a = {77}; op[986] = getOpcodeTls(a);}
        op[987] = getOpcodeRep((char)0, (char)1, 988);
        {int[] a = {989,991,996}; op[988] = getOpcodeCat(a);}
        op[989] = getOpcodeRep((char)1, Character.MAX_VALUE, 990);
        op[990] = getOpcodeRnm(1, 3); // DIGIT
        op[991] = getOpcodeRep((char)0, (char)1, 992);
        {int[] a = {993,994}; op[992] = getOpcodeCat(a);}
        {char[] a = {46}; op[993] = getOpcodeTls(a);}
        op[994] = getOpcodeRep((char)1, Character.MAX_VALUE, 995);
        op[995] = getOpcodeRnm(1, 3); // DIGIT
        {char[] a = {83}; op[996] = getOpcodeTls(a);}
        op[997] = getOpcodeRnm(59, 399); // SQUOTE
        {int[] a = {999,1000,1001,1002,1006,1007}; op[998] = getOpcodeCat(a);}
        op[999] = getOpcodeRnm(22, 87); // scheme
        {char[] a = {58,47,47}; op[1000] = getOpcodeTls(a);}
        op[1001] = getOpcodeRnm(25, 112); // host
        op[1002] = getOpcodeRep((char)0, (char)1, 1003);
        {int[] a = {1004,1005}; op[1003] = getOpcodeCat(a);}
        {char[] a = {58}; op[1004] = getOpcodeTls(a);}
        op[1005] = getOpcodeRnm(26, 116); // port
        op[1006] = getOpcodeRnm(184, 1012); // serviceRoot
        op[1007] = getOpcodeRep((char)0, (char)1, 1008);
        {int[] a = {1009,1010,1011}; op[1008] = getOpcodeAlt(a);}
        {char[] a = {36,109,101,116,97,100,97,116,97}; op[1009] = getOpcodeTls(a);}
        {char[] a = {36,98,97,116,99,104}; op[1010] = getOpcodeTls(a);}
        op[1011] = getOpcodeRnm(185, 1018); // odataRelativeUri
        {int[] a = {1013,1017}; op[1012] = getOpcodeCat(a);}
        op[1013] = getOpcodeRep((char)0, Character.MAX_VALUE, 1014);
        {int[] a = {1015,1016}; op[1014] = getOpcodeCat(a);}
        {char[] a = {47}; op[1015] = getOpcodeTls(a);}
        op[1016] = getOpcodeRnm(42, 297); // segment-nz
        {char[] a = {47}; op[1017] = getOpcodeTls(a);}
        {int[] a = {1019,1020}; op[1018] = getOpcodeCat(a);}
        op[1019] = getOpcodeRnm(206, 1211); // resourcePath
        op[1020] = getOpcodeRep((char)0, (char)1, 1021);
        {int[] a = {1022,1023}; op[1021] = getOpcodeCat(a);}
        {char[] a = {63}; op[1022] = getOpcodeTls(a);}
        op[1023] = getOpcodeRnm(186, 1024); // queryOptions
        {int[] a = {1025,1026}; op[1024] = getOpcodeCat(a);}
        op[1025] = getOpcodeRnm(187, 1030); // queryOption
        op[1026] = getOpcodeRep((char)0, Character.MAX_VALUE, 1027);
        {int[] a = {1028,1029}; op[1027] = getOpcodeCat(a);}
        {char[] a = {38}; op[1028] = getOpcodeTls(a);}
        op[1029] = getOpcodeRnm(187, 1030); // queryOption
        {int[] a = {1031,1032,1033,1034,1035}; op[1030] = getOpcodeAlt(a);}
        op[1031] = getOpcodeRnm(188, 1036); // systemQueryOption
        op[1032] = getOpcodeRnm(203, 1156); // customQueryOption
        op[1033] = getOpcodeRnm(266, 1655); // sopParameterNameAndValue
        op[1034] = getOpcodeRnm(240, 1506); // aliasAndValue
        op[1035] = getOpcodeRnm(352, 2435); // parameterNameAndValue
        {int[] a = {1037,1038,1039,1040,1041,1042,1043,1044,1045}; op[1036] = getOpcodeAlt(a);}
        op[1037] = getOpcodeRnm(189, 1046); // expand
        op[1038] = getOpcodeRnm(193, 1070); // filter
        op[1039] = getOpcodeRnm(194, 1078); // orderby
        op[1040] = getOpcodeRnm(195, 1104); // skip
        op[1041] = getOpcodeRnm(196, 1108); // top
        op[1042] = getOpcodeRnm(197, 1112); // format
        op[1043] = getOpcodeRnm(198, 1120); // inlinecount
        op[1044] = getOpcodeRnm(199, 1125); // select
        op[1045] = getOpcodeRnm(202, 1152); // skiptoken
        {int[] a = {1047,1048}; op[1046] = getOpcodeCat(a);}
        {char[] a = {36,101,120,112,97,110,100,61}; op[1047] = getOpcodeTls(a);}
        op[1048] = getOpcodeRnm(190, 1049); // expandClause
        {int[] a = {1050,1051}; op[1049] = getOpcodeCat(a);}
        op[1050] = getOpcodeRnm(191, 1055); // expandItem
        op[1051] = getOpcodeRep((char)0, Character.MAX_VALUE, 1052);
        {int[] a = {1053,1054}; op[1052] = getOpcodeCat(a);}
        {char[] a = {44}; op[1053] = getOpcodeTls(a);}
        op[1054] = getOpcodeRnm(191, 1055); // expandItem
        {int[] a = {1056,1060,1061}; op[1055] = getOpcodeCat(a);}
        op[1056] = getOpcodeRep((char)0, (char)1, 1057);
        {int[] a = {1058,1059}; op[1057] = getOpcodeCat(a);}
        op[1058] = getOpcodeRnm(97, 534); // qualifiedEntityTypeName
        {char[] a = {47}; op[1059] = getOpcodeTls(a);}
        op[1060] = getOpcodeRnm(119, 612); // navigationProperty
        op[1061] = getOpcodeRep((char)0, Character.MAX_VALUE, 1062);
        {int[] a = {1063,1067,1068}; op[1062] = getOpcodeCat(a);}
        op[1063] = getOpcodeRep((char)0, (char)1, 1064);
        {int[] a = {1065,1066}; op[1064] = getOpcodeCat(a);}
        {char[] a = {47}; op[1065] = getOpcodeTls(a);}
        op[1066] = getOpcodeRnm(97, 534); // qualifiedEntityTypeName
        {char[] a = {47}; op[1067] = getOpcodeTls(a);}
        op[1068] = getOpcodeRnm(119, 612); // navigationProperty
        {char[] a = {47,36,99,111,117,110,116}; op[1069] = getOpcodeTls(a);}
        {int[] a = {1071,1072,1074,1075,1077}; op[1070] = getOpcodeCat(a);}
        {char[] a = {36,102,105,108,116,101,114}; op[1071] = getOpcodeTls(a);}
        op[1072] = getOpcodeRep((char)0, (char)1, 1073);
        op[1073] = getOpcodeRnm(6, 15); // WSP
        {char[] a = {61}; op[1074] = getOpcodeTls(a);}
        op[1075] = getOpcodeRep((char)0, (char)1, 1076);
        op[1076] = getOpcodeRnm(6, 15); // WSP
        op[1077] = getOpcodeRnm(268, 1679); // boolCommonExpr
        {int[] a = {1079,1080,1082,1083,1085,1086,1088,1092}; op[1078] = getOpcodeCat(a);}
        {char[] a = {36,111,114,100,101,114,98,121}; op[1079] = getOpcodeTls(a);}
        op[1080] = getOpcodeRep((char)0, (char)1, 1081);
        op[1081] = getOpcodeRnm(6, 15); // WSP
        {char[] a = {61}; op[1082] = getOpcodeTls(a);}
        op[1083] = getOpcodeRep((char)0, (char)1, 1084);
        op[1084] = getOpcodeRnm(6, 15); // WSP
        op[1085] = getOpcodeRnm(267, 1659); // commonExpr
        op[1086] = getOpcodeRep((char)0, (char)1, 1087);
        op[1087] = getOpcodeRnm(6, 15); // WSP
        op[1088] = getOpcodeRep((char)0, (char)1, 1089);
        {int[] a = {1090,1091}; op[1089] = getOpcodeAlt(a);}
        {char[] a = {97,115,99}; op[1090] = getOpcodeTls(a);}
        {char[] a = {100,101,115,99}; op[1091] = getOpcodeTls(a);}
        op[1092] = getOpcodeRep((char)0, Character.MAX_VALUE, 1093);
        {int[] a = {1094,1095,1097,1098,1100}; op[1093] = getOpcodeCat(a);}
        op[1094] = getOpcodeRnm(62, 402); // COMMA
        op[1095] = getOpcodeRep((char)0, (char)1, 1096);
        op[1096] = getOpcodeRnm(6, 15); // WSP
        op[1097] = getOpcodeRnm(267, 1659); // commonExpr
        op[1098] = getOpcodeRep((char)0, (char)1, 1099);
        op[1099] = getOpcodeRnm(6, 15); // WSP
        op[1100] = getOpcodeRep((char)0, (char)1, 1101);
        {int[] a = {1102,1103}; op[1101] = getOpcodeAlt(a);}
        {char[] a = {97,115,99}; op[1102] = getOpcodeTls(a);}
        {char[] a = {100,101,115,99}; op[1103] = getOpcodeTls(a);}
        {int[] a = {1105,1106}; op[1104] = getOpcodeCat(a);}
        {char[] a = {36,115,107,105,112,61}; op[1105] = getOpcodeTls(a);}
        op[1106] = getOpcodeRep((char)1, Character.MAX_VALUE, 1107);
        op[1107] = getOpcodeRnm(1, 3); // DIGIT
        {int[] a = {1109,1110}; op[1108] = getOpcodeCat(a);}
        {char[] a = {36,116,111,112,61}; op[1109] = getOpcodeTls(a);}
        op[1110] = getOpcodeRep((char)1, Character.MAX_VALUE, 1111);
        op[1111] = getOpcodeRnm(1, 3); // DIGIT
        {int[] a = {1113,1114}; op[1112] = getOpcodeCat(a);}
        {char[] a = {36,102,111,114,109,97,116,61}; op[1113] = getOpcodeTls(a);}
        {int[] a = {1115,1116,1117,1118,1119}; op[1114] = getOpcodeAlt(a);}
        {char[] a = {106,115,111,110}; op[1115] = getOpcodeTls(a);}
        {char[] a = {97,116,111,109}; op[1116] = getOpcodeTls(a);}
        {char[] a = {120,109,108}; op[1117] = getOpcodeTls(a);}
        {char[] a = {123,84,79,68,79,49,55,125}; op[1118] = getOpcodeTls(a);}
        {char[] a = {123,84,79,68,79,49,56,125}; op[1119] = getOpcodeTls(a);}
        {int[] a = {1121,1122}; op[1120] = getOpcodeCat(a);}
        {char[] a = {36,105,110,108,105,110,101,99,111,117,110,116,61}; op[1121] = getOpcodeTls(a);}
        {int[] a = {1123,1124}; op[1122] = getOpcodeAlt(a);}
        {char[] a = {97,108,108,112,97,103,101,115}; op[1123] = getOpcodeTls(a);}
        {char[] a = {110,111,110,101}; op[1124] = getOpcodeTls(a);}
        {int[] a = {1126,1127}; op[1125] = getOpcodeCat(a);}
        {char[] a = {36,115,101,108,101,99,116,61}; op[1126] = getOpcodeTls(a);}
        op[1127] = getOpcodeRnm(200, 1128); // selectClause
        {int[] a = {1129,1130}; op[1128] = getOpcodeCat(a);}
        op[1129] = getOpcodeRnm(201, 1134); // selectItem
        op[1130] = getOpcodeRep((char)0, Character.MAX_VALUE, 1131);
        {int[] a = {1132,1133}; op[1131] = getOpcodeCat(a);}
        op[1132] = getOpcodeRnm(62, 402); // COMMA
        op[1133] = getOpcodeRnm(201, 1134); // selectItem
        {int[] a = {1135,1136}; op[1134] = getOpcodeAlt(a);}
        op[1135] = getOpcodeRnm(68, 410); // star
        {int[] a = {1137,1141}; op[1136] = getOpcodeCat(a);}
        op[1137] = getOpcodeRep((char)0, (char)1, 1138);
        {int[] a = {1139,1140}; op[1138] = getOpcodeCat(a);}
        op[1139] = getOpcodeRnm(97, 534); // qualifiedEntityTypeName
        {char[] a = {47}; op[1140] = getOpcodeTls(a);}
        {int[] a = {1142,1143,1144,1145,1146}; op[1141] = getOpcodeAlt(a);}
        op[1142] = getOpcodeRnm(108, 589); // propertyName
        op[1143] = getOpcodeRnm(144, 679); // qualifiedActionName
        op[1144] = getOpcodeRnm(145, 686); // qualifiedFunctionName
        op[1145] = getOpcodeRnm(95, 520); // allOperationsInContainer
        {int[] a = {1147,1148}; op[1146] = getOpcodeCat(a);}
        op[1147] = getOpcodeRnm(119, 612); // navigationProperty
        op[1148] = getOpcodeRep((char)0, (char)1, 1149);
        {int[] a = {1150,1151}; op[1149] = getOpcodeCat(a);}
        {char[] a = {47}; op[1150] = getOpcodeTls(a);}
        op[1151] = getOpcodeRnm(201, 1134); // selectItem
        {int[] a = {1153,1154}; op[1152] = getOpcodeCat(a);}
        {char[] a = {36,115,107,105,112,116,111,107,101,110,61}; op[1153] = getOpcodeTls(a);}
        op[1154] = getOpcodeRep((char)1, Character.MAX_VALUE, 1155);
        op[1155] = getOpcodeRnm(44, 305); // pchar
        {int[] a = {1157,1158,1160}; op[1156] = getOpcodeCat(a);}
        op[1157] = getOpcodeRnm(204, 1166); // customName
        op[1158] = getOpcodeRep((char)0, (char)1, 1159);
        op[1159] = getOpcodeRnm(6, 15); // WSP
        op[1160] = getOpcodeRep((char)0, (char)1, 1161);
        {int[] a = {1162,1163,1165}; op[1161] = getOpcodeCat(a);}
        {char[] a = {61}; op[1162] = getOpcodeTls(a);}
        op[1163] = getOpcodeRep((char)0, (char)1, 1164);
        op[1164] = getOpcodeRnm(6, 15); // WSP
        op[1165] = getOpcodeRnm(205, 1195); // customValue
        {int[] a = {1167,1180}; op[1166] = getOpcodeCat(a);}
        {int[] a = {1168,1169,1170,1171,1172,1173,1174,1175,1176,1177,1178,1179}; op[1167] = getOpcodeAlt(a);}
        op[1168] = getOpcodeRnm(48, 325); // unreserved
        op[1169] = getOpcodeRnm(47, 321); // pct-encoded
        {char[] a = {58}; op[1170] = getOpcodeTls(a);}
        {char[] a = {64}; op[1171] = getOpcodeTls(a);}
        {char[] a = {33}; op[1172] = getOpcodeTls(a);}
        {char[] a = {39}; op[1173] = getOpcodeTls(a);}
        {char[] a = {40}; op[1174] = getOpcodeTls(a);}
        {char[] a = {41}; op[1175] = getOpcodeTls(a);}
        {char[] a = {42}; op[1176] = getOpcodeTls(a);}
        {char[] a = {43}; op[1177] = getOpcodeTls(a);}
        {char[] a = {44}; op[1178] = getOpcodeTls(a);}
        {char[] a = {59}; op[1179] = getOpcodeTls(a);}
        op[1180] = getOpcodeRep((char)0, Character.MAX_VALUE, 1181);
        {int[] a = {1182,1183,1184,1185,1186,1187,1188,1189,1190,1191,1192,1193,1194}; op[1181] = getOpcodeAlt(a);}
        op[1182] = getOpcodeRnm(48, 325); // unreserved
        op[1183] = getOpcodeRnm(47, 321); // pct-encoded
        {char[] a = {58}; op[1184] = getOpcodeTls(a);}
        {char[] a = {64}; op[1185] = getOpcodeTls(a);}
        {char[] a = {33}; op[1186] = getOpcodeTls(a);}
        {char[] a = {36}; op[1187] = getOpcodeTls(a);}
        {char[] a = {39}; op[1188] = getOpcodeTls(a);}
        {char[] a = {40}; op[1189] = getOpcodeTls(a);}
        {char[] a = {41}; op[1190] = getOpcodeTls(a);}
        {char[] a = {42}; op[1191] = getOpcodeTls(a);}
        {char[] a = {43}; op[1192] = getOpcodeTls(a);}
        {char[] a = {44}; op[1193] = getOpcodeTls(a);}
        {char[] a = {59}; op[1194] = getOpcodeTls(a);}
        op[1195] = getOpcodeRep((char)0, Character.MAX_VALUE, 1196);
        {int[] a = {1197,1198,1199,1200,1201,1202,1203,1204,1205,1206,1207,1208,1209,1210}; op[1196] = getOpcodeAlt(a);}
        op[1197] = getOpcodeRnm(48, 325); // unreserved
        op[1198] = getOpcodeRnm(47, 321); // pct-encoded
        {char[] a = {58}; op[1199] = getOpcodeTls(a);}
        {char[] a = {64}; op[1200] = getOpcodeTls(a);}
        {char[] a = {33}; op[1201] = getOpcodeTls(a);}
        {char[] a = {36}; op[1202] = getOpcodeTls(a);}
        {char[] a = {39}; op[1203] = getOpcodeTls(a);}
        {char[] a = {40}; op[1204] = getOpcodeTls(a);}
        {char[] a = {41}; op[1205] = getOpcodeTls(a);}
        {char[] a = {42}; op[1206] = getOpcodeTls(a);}
        {char[] a = {43}; op[1207] = getOpcodeTls(a);}
        {char[] a = {44}; op[1208] = getOpcodeTls(a);}
        {char[] a = {59}; op[1209] = getOpcodeTls(a);}
        {char[] a = {61}; op[1210] = getOpcodeTls(a);}
        {int[] a = {1212,1225,1231,1237,1243,1251,1257,1265}; op[1211] = getOpcodeAlt(a);}
        {int[] a = {1213,1217,1218}; op[1212] = getOpcodeCat(a);}
        op[1213] = getOpcodeRep((char)0, (char)1, 1214);
        {int[] a = {1215,1216}; op[1214] = getOpcodeCat(a);}
        op[1215] = getOpcodeRnm(109, 596); // entityContainerName
        {char[] a = {46}; op[1216] = getOpcodeTls(a);}
        op[1217] = getOpcodeRnm(91, 510); // entitySetName
        op[1218] = getOpcodeRep((char)0, (char)1, 1219);
        {int[] a = {1220,1221}; op[1219] = getOpcodeAlt(a);}
        op[1220] = getOpcodeRnm(207, 1266); // collectionNavigation
        {int[] a = {1222,1223}; op[1221] = getOpcodeCat(a);}
        op[1222] = getOpcodeRnm(215, 1403); // keyPredicate
        op[1223] = getOpcodeRep((char)0, (char)1, 1224);
        op[1224] = getOpcodeRnm(208, 1302); // singleNavigation
        {int[] a = {1226,1229}; op[1225] = getOpcodeCat(a);}
        {int[] a = {1227,1228}; op[1226] = getOpcodeAlt(a);}
        op[1227] = getOpcodeRnm(259, 1617); // entityColServiceOpCall
        op[1228] = getOpcodeRnm(223, 1438); // entityColFunctionCall
        op[1229] = getOpcodeRep((char)0, (char)1, 1230);
        op[1230] = getOpcodeRnm(207, 1266); // collectionNavigation
        {int[] a = {1232,1235}; op[1231] = getOpcodeCat(a);}
        {int[] a = {1233,1234}; op[1232] = getOpcodeAlt(a);}
        op[1233] = getOpcodeRnm(258, 1611); // entityServiceOpCall
        op[1234] = getOpcodeRnm(222, 1435); // entityFunctionCall
        op[1235] = getOpcodeRep((char)0, (char)1, 1236);
        op[1236] = getOpcodeRnm(208, 1302); // singleNavigation
        {int[] a = {1238,1241}; op[1237] = getOpcodeCat(a);}
        {int[] a = {1239,1240}; op[1238] = getOpcodeAlt(a);}
        op[1239] = getOpcodeRnm(261, 1629); // complexColServiceOpCall
        op[1240] = getOpcodeRnm(225, 1444); // complexColFunctionCall
        op[1241] = getOpcodeRep((char)0, (char)1, 1242);
        op[1242] = getOpcodeRnm(209, 1328); // boundOperation
        {int[] a = {1244,1247}; op[1243] = getOpcodeCat(a);}
        {int[] a = {1245,1246}; op[1244] = getOpcodeAlt(a);}
        op[1245] = getOpcodeRnm(260, 1623); // complexServiceOpCall
        op[1246] = getOpcodeRnm(224, 1441); // complexFunctionCall
        op[1247] = getOpcodeRep((char)0, (char)1, 1248);
        {int[] a = {1249,1250}; op[1248] = getOpcodeAlt(a);}
        op[1249] = getOpcodeRnm(209, 1328); // boundOperation
        op[1250] = getOpcodeRnm(211, 1373); // complexPropertyPath
        {int[] a = {1252,1255}; op[1251] = getOpcodeCat(a);}
        {int[] a = {1253,1254}; op[1252] = getOpcodeAlt(a);}
        op[1253] = getOpcodeRnm(263, 1641); // primitiveColServiceOpCall
        op[1254] = getOpcodeRnm(227, 1450); // primitiveColFunctionCall
        op[1255] = getOpcodeRep((char)0, (char)1, 1256);
        op[1256] = getOpcodeRnm(209, 1328); // boundOperation
        {int[] a = {1258,1261}; op[1257] = getOpcodeCat(a);}
        {int[] a = {1259,1260}; op[1258] = getOpcodeAlt(a);}
        op[1259] = getOpcodeRnm(262, 1635); // primitiveServiceOpCall
        op[1260] = getOpcodeRnm(226, 1447); // primitiveFunctionCall
        op[1261] = getOpcodeRep((char)0, (char)1, 1262);
        {int[] a = {1263,1264}; op[1262] = getOpcodeAlt(a);}
        op[1263] = getOpcodeRnm(209, 1328); // boundOperation
        op[1264] = getOpcodeRnm(214, 1402); // value
        op[1265] = getOpcodeRnm(220, 1423); // actionCall
        {int[] a = {1267,1271,1272}; op[1266] = getOpcodeCat(a);}
        op[1267] = getOpcodeRep((char)0, (char)1, 1268);
        {int[] a = {1269,1270}; op[1268] = getOpcodeCat(a);}
        {char[] a = {47}; op[1269] = getOpcodeTls(a);}
        op[1270] = getOpcodeRnm(97, 534); // qualifiedEntityTypeName
        {char[] a = {47}; op[1271] = getOpcodeTls(a);}
        {int[] a = {1273,1277,1281,1287,1291,1297,1301}; op[1272] = getOpcodeAlt(a);}
        {int[] a = {1274,1275}; op[1273] = getOpcodeCat(a);}
        op[1274] = getOpcodeRnm(229, 1460); // boundEntityFuncCall
        op[1275] = getOpcodeRep((char)0, (char)1, 1276);
        op[1276] = getOpcodeRnm(208, 1302); // singleNavigation
        {int[] a = {1278,1279}; op[1277] = getOpcodeCat(a);}
        op[1278] = getOpcodeRnm(230, 1463); // boundEntityColFuncCall
        op[1279] = getOpcodeRep((char)0, (char)1, 1280);
        op[1280] = getOpcodeRnm(207, 1266); // collectionNavigation
        {int[] a = {1282,1283}; op[1281] = getOpcodeCat(a);}
        op[1282] = getOpcodeRnm(233, 1472); // boundPrimitiveFuncCall
        op[1283] = getOpcodeRep((char)0, (char)1, 1284);
        {int[] a = {1285,1286}; op[1284] = getOpcodeAlt(a);}
        op[1285] = getOpcodeRnm(209, 1328); // boundOperation
        op[1286] = getOpcodeRnm(214, 1402); // value
        {int[] a = {1288,1289}; op[1287] = getOpcodeCat(a);}
        op[1288] = getOpcodeRnm(234, 1475); // boundPrimitiveColFuncCall
        op[1289] = getOpcodeRep((char)0, (char)1, 1290);
        op[1290] = getOpcodeRnm(209, 1328); // boundOperation
        {int[] a = {1292,1293}; op[1291] = getOpcodeCat(a);}
        op[1292] = getOpcodeRnm(231, 1466); // boundComplexFuncCall
        op[1293] = getOpcodeRep((char)0, (char)1, 1294);
        {int[] a = {1295,1296}; op[1294] = getOpcodeAlt(a);}
        op[1295] = getOpcodeRnm(211, 1373); // complexPropertyPath
        op[1296] = getOpcodeRnm(209, 1328); // boundOperation
        {int[] a = {1298,1299}; op[1297] = getOpcodeCat(a);}
        op[1298] = getOpcodeRnm(232, 1469); // boundComplexColFuncCall
        op[1299] = getOpcodeRep((char)0, (char)1, 1300);
        op[1300] = getOpcodeRnm(209, 1328); // boundOperation
        op[1301] = getOpcodeRnm(221, 1429); // boundActionCall
        {int[] a = {1303,1307}; op[1302] = getOpcodeCat(a);}
        op[1303] = getOpcodeRep((char)0, (char)1, 1304);
        {int[] a = {1305,1306}; op[1304] = getOpcodeCat(a);}
        {char[] a = {47}; op[1305] = getOpcodeTls(a);}
        op[1306] = getOpcodeRnm(97, 534); // qualifiedEntityTypeName
        {int[] a = {1308,1309}; op[1307] = getOpcodeAlt(a);}
        op[1308] = getOpcodeRnm(209, 1328); // boundOperation
        {int[] a = {1310,1311}; op[1309] = getOpcodeCat(a);}
        {char[] a = {47}; op[1310] = getOpcodeTls(a);}
        {int[] a = {1312,1315,1319,1323,1324,1325,1326,1327}; op[1311] = getOpcodeAlt(a);}
        {int[] a = {1313,1314}; op[1312] = getOpcodeCat(a);}
        {char[] a = {36,108,105,110,107,115,47}; op[1313] = getOpcodeTls(a);}
        op[1314] = getOpcodeRnm(119, 612); // navigationProperty
        {int[] a = {1316,1317}; op[1315] = getOpcodeCat(a);}
        op[1316] = getOpcodeRnm(118, 611); // entityColNavigationProperty
        op[1317] = getOpcodeRep((char)0, (char)1, 1318);
        op[1318] = getOpcodeRnm(207, 1266); // collectionNavigation
        {int[] a = {1320,1321}; op[1319] = getOpcodeCat(a);}
        op[1320] = getOpcodeRnm(117, 610); // entityNavigationProperty
        op[1321] = getOpcodeRep((char)0, (char)1, 1322);
        op[1322] = getOpcodeRnm(208, 1302); // singleNavigation
        op[1323] = getOpcodeRnm(210, 1364); // primitivePropertyPath
        op[1324] = getOpcodeRnm(211, 1373); // complexPropertyPath
        op[1325] = getOpcodeRnm(212, 1384); // collectionPropertyPath
        op[1326] = getOpcodeRnm(213, 1395); // streamPropertyPath
        op[1327] = getOpcodeRnm(214, 1402); // value
        {int[] a = {1329,1333,1334}; op[1328] = getOpcodeCat(a);}
        op[1329] = getOpcodeRep((char)0, (char)1, 1330);
        {int[] a = {1331,1332}; op[1330] = getOpcodeCat(a);}
        {char[] a = {47}; op[1331] = getOpcodeTls(a);}
        op[1332] = getOpcodeRnm(97, 534); // qualifiedEntityTypeName
        {char[] a = {47}; op[1333] = getOpcodeTls(a);}
        {int[] a = {1335,1336,1340,1344,1350,1354,1360}; op[1334] = getOpcodeAlt(a);}
        op[1335] = getOpcodeRnm(221, 1429); // boundActionCall
        {int[] a = {1337,1338}; op[1336] = getOpcodeCat(a);}
        op[1337] = getOpcodeRnm(230, 1463); // boundEntityColFuncCall
        op[1338] = getOpcodeRep((char)0, (char)1, 1339);
        op[1339] = getOpcodeRnm(208, 1302); // singleNavigation
        {int[] a = {1341,1342}; op[1340] = getOpcodeCat(a);}
        op[1341] = getOpcodeRnm(229, 1460); // boundEntityFuncCall
        op[1342] = getOpcodeRep((char)0, (char)1, 1343);
        op[1343] = getOpcodeRnm(207, 1266); // collectionNavigation
        {int[] a = {1345,1346}; op[1344] = getOpcodeCat(a);}
        op[1345] = getOpcodeRnm(233, 1472); // boundPrimitiveFuncCall
        op[1346] = getOpcodeRep((char)0, (char)1, 1347);
        {int[] a = {1348,1349}; op[1347] = getOpcodeAlt(a);}
        op[1348] = getOpcodeRnm(209, 1328); // boundOperation
        op[1349] = getOpcodeRnm(214, 1402); // value
        {int[] a = {1351,1352}; op[1350] = getOpcodeCat(a);}
        op[1351] = getOpcodeRnm(234, 1475); // boundPrimitiveColFuncCall
        op[1352] = getOpcodeRep((char)0, (char)1, 1353);
        op[1353] = getOpcodeRnm(209, 1328); // boundOperation
        {int[] a = {1355,1356}; op[1354] = getOpcodeCat(a);}
        op[1355] = getOpcodeRnm(231, 1466); // boundComplexFuncCall
        op[1356] = getOpcodeRep((char)0, (char)1, 1357);
        {int[] a = {1358,1359}; op[1357] = getOpcodeAlt(a);}
        op[1358] = getOpcodeRnm(211, 1373); // complexPropertyPath
        op[1359] = getOpcodeRnm(209, 1328); // boundOperation
        {int[] a = {1361,1362}; op[1360] = getOpcodeCat(a);}
        op[1361] = getOpcodeRnm(232, 1469); // boundComplexColFuncCall
        op[1362] = getOpcodeRep((char)0, (char)1, 1363);
        op[1363] = getOpcodeRnm(209, 1328); // boundOperation
        {int[] a = {1365,1367,1368,1371}; op[1364] = getOpcodeCat(a);}
        op[1365] = getOpcodeRep((char)0, (char)1, 1366);
        {char[] a = {47,32,113,117,97,108,105,102,105,101,100,69,110,116,105,116,121,84,121,112,101,78,97,109,101}; op[1366] = getOpcodeTls(a);}
        {char[] a = {47}; op[1367] = getOpcodeTls(a);}
        {int[] a = {1369,1370}; op[1368] = getOpcodeAlt(a);}
        op[1369] = getOpcodeRnm(102, 583); // primitiveKeyProperty
        op[1370] = getOpcodeRnm(103, 584); // primitiveNonKeyProperty
        op[1371] = getOpcodeRep((char)0, (char)1, 1372);
        op[1372] = getOpcodeRnm(214, 1402); // value
        {int[] a = {1374,1376,1377,1378}; op[1373] = getOpcodeCat(a);}
        op[1374] = getOpcodeRep((char)0, (char)1, 1375);
        {char[] a = {47,32,113,117,97,108,105,102,105,101,100,69,110,116,105,116,121,84,121,112,101,78,97,109,101}; op[1375] = getOpcodeTls(a);}
        {char[] a = {47}; op[1376] = getOpcodeTls(a);}
        op[1377] = getOpcodeRnm(105, 586); // complexProperty
        op[1378] = getOpcodeRep((char)0, (char)1, 1379);
        {int[] a = {1380,1381,1382,1383}; op[1379] = getOpcodeAlt(a);}
        op[1380] = getOpcodeRnm(210, 1364); // primitivePropertyPath
        op[1381] = getOpcodeRnm(211, 1373); // complexPropertyPath
        op[1382] = getOpcodeRnm(212, 1384); // collectionPropertyPath
        op[1383] = getOpcodeRnm(209, 1328); // boundOperation
        {int[] a = {1385,1389,1390,1393}; op[1384] = getOpcodeCat(a);}
        op[1385] = getOpcodeRep((char)0, (char)1, 1386);
        {int[] a = {1387,1388}; op[1386] = getOpcodeCat(a);}
        {char[] a = {47}; op[1387] = getOpcodeTls(a);}
        op[1388] = getOpcodeRnm(0, 0); // ALPHA
        {char[] a = {47}; op[1389] = getOpcodeTls(a);}
        {int[] a = {1391,1392}; op[1390] = getOpcodeAlt(a);}
        op[1391] = getOpcodeRnm(104, 585); // primitiveColProperty
        op[1392] = getOpcodeRnm(106, 587); // complexColProperty
        op[1393] = getOpcodeRep((char)0, (char)1, 1394);
        op[1394] = getOpcodeRnm(209, 1328); // boundOperation
        {int[] a = {1396,1400,1401}; op[1395] = getOpcodeCat(a);}
        op[1396] = getOpcodeRep((char)0, (char)1, 1397);
        {int[] a = {1398,1399}; op[1397] = getOpcodeCat(a);}
        {char[] a = {47}; op[1398] = getOpcodeTls(a);}
        op[1399] = getOpcodeRnm(97, 534); // qualifiedEntityTypeName
        {char[] a = {47}; op[1400] = getOpcodeTls(a);}
        op[1401] = getOpcodeRnm(107, 588); // streamProperty
        {char[] a = {47,36,118,97,108,117,101}; op[1402] = getOpcodeTls(a);}
        {int[] a = {1404,1405}; op[1403] = getOpcodeAlt(a);}
        op[1404] = getOpcodeRnm(216, 1406); // simpleKey
        op[1405] = getOpcodeRnm(217, 1410); // compoundKey
        {int[] a = {1407,1408,1409}; op[1406] = getOpcodeCat(a);}
        {char[] a = {40}; op[1407] = getOpcodeTls(a);}
        op[1408] = getOpcodeRnm(148, 701); // primitiveLiteral
        {char[] a = {41}; op[1409] = getOpcodeTls(a);}
        {int[] a = {1411,1412,1413,1417}; op[1410] = getOpcodeCat(a);}
        {char[] a = {40}; op[1411] = getOpcodeTls(a);}
        op[1412] = getOpcodeRnm(218, 1418); // keyValuePair
        op[1413] = getOpcodeRep((char)0, Character.MAX_VALUE, 1414);
        {int[] a = {1415,1416}; op[1414] = getOpcodeCat(a);}
        {char[] a = {44}; op[1415] = getOpcodeTls(a);}
        op[1416] = getOpcodeRnm(218, 1418); // keyValuePair
        {char[] a = {41}; op[1417] = getOpcodeTls(a);}
        {int[] a = {1419,1420,1421}; op[1418] = getOpcodeCat(a);}
        op[1419] = getOpcodeRnm(102, 583); // primitiveKeyProperty
        {char[] a = {61}; op[1420] = getOpcodeTls(a);}
        op[1421] = getOpcodeRnm(219, 1422); // keyPropertyValue
        op[1422] = getOpcodeRnm(148, 701); // primitiveLiteral
        {int[] a = {1424,1426,1427}; op[1423] = getOpcodeCat(a);}
        op[1424] = getOpcodeRep((char)0, (char)1, 1425);
        op[1425] = getOpcodeRnm(94, 513); // operationQualifier
        op[1426] = getOpcodeRnm(141, 666); // action
        op[1427] = getOpcodeRep((char)0, (char)1, 1428);
        {char[] a = {40,41}; op[1428] = getOpcodeTls(a);}
        {int[] a = {1430,1432,1433}; op[1429] = getOpcodeCat(a);}
        op[1430] = getOpcodeRep((char)0, (char)1, 1431);
        op[1431] = getOpcodeRnm(94, 513); // operationQualifier
        op[1432] = getOpcodeRnm(141, 666); // action
        op[1433] = getOpcodeRep((char)0, (char)1, 1434);
        {char[] a = {40,41}; op[1434] = getOpcodeTls(a);}
        {int[] a = {1436,1437}; op[1435] = getOpcodeCat(a);}
        op[1436] = getOpcodeRnm(347, 2430); // fullEntityFunctionCall
        op[1437] = getOpcodeRnm(236, 1485); // functionParameters
        {int[] a = {1439,1440}; op[1438] = getOpcodeCat(a);}
        op[1439] = getOpcodeRnm(346, 2429); // fullEntityColFunctionCall
        op[1440] = getOpcodeRnm(236, 1485); // functionParameters
        {int[] a = {1442,1443}; op[1441] = getOpcodeCat(a);}
        op[1442] = getOpcodeRnm(345, 2428); // fullComplexFunctionCall
        op[1443] = getOpcodeRnm(236, 1485); // functionParameters
        {int[] a = {1445,1446}; op[1444] = getOpcodeCat(a);}
        op[1445] = getOpcodeRnm(344, 2427); // fullComplexColFunctionCall
        op[1446] = getOpcodeRnm(236, 1485); // functionParameters
        {int[] a = {1448,1449}; op[1447] = getOpcodeCat(a);}
        op[1448] = getOpcodeRnm(348, 2431); // fullPrimitiveFunctionCall
        op[1449] = getOpcodeRnm(236, 1485); // functionParameters
        {int[] a = {1451,1452}; op[1450] = getOpcodeCat(a);}
        op[1451] = getOpcodeRnm(348, 2431); // fullPrimitiveFunctionCall
        op[1452] = getOpcodeRnm(236, 1485); // functionParameters
        {int[] a = {1454,1455,1456,1457,1458,1459}; op[1453] = getOpcodeAlt(a);}
        op[1454] = getOpcodeRnm(222, 1435); // entityFunctionCall
        op[1455] = getOpcodeRnm(223, 1438); // entityColFunctionCall
        op[1456] = getOpcodeRnm(224, 1441); // complexFunctionCall
        op[1457] = getOpcodeRnm(225, 1444); // complexColFunctionCall
        op[1458] = getOpcodeRnm(226, 1447); // primitiveFunctionCall
        op[1459] = getOpcodeRnm(227, 1450); // primitiveColFunctionCall
        {int[] a = {1461,1462}; op[1460] = getOpcodeCat(a);}
        op[1461] = getOpcodeRnm(347, 2430); // fullEntityFunctionCall
        op[1462] = getOpcodeRnm(236, 1485); // functionParameters
        {int[] a = {1464,1465}; op[1463] = getOpcodeCat(a);}
        op[1464] = getOpcodeRnm(346, 2429); // fullEntityColFunctionCall
        op[1465] = getOpcodeRnm(236, 1485); // functionParameters
        {int[] a = {1467,1468}; op[1466] = getOpcodeCat(a);}
        op[1467] = getOpcodeRnm(345, 2428); // fullComplexFunctionCall
        op[1468] = getOpcodeRnm(236, 1485); // functionParameters
        {int[] a = {1470,1471}; op[1469] = getOpcodeCat(a);}
        op[1470] = getOpcodeRnm(344, 2427); // fullComplexColFunctionCall
        op[1471] = getOpcodeRnm(236, 1485); // functionParameters
        {int[] a = {1473,1474}; op[1472] = getOpcodeCat(a);}
        op[1473] = getOpcodeRnm(348, 2431); // fullPrimitiveFunctionCall
        op[1474] = getOpcodeRnm(236, 1485); // functionParameters
        {int[] a = {1476,1477}; op[1475] = getOpcodeCat(a);}
        op[1476] = getOpcodeRnm(348, 2431); // fullPrimitiveFunctionCall
        op[1477] = getOpcodeRnm(236, 1485); // functionParameters
        {int[] a = {1479,1480,1481,1482,1483,1484}; op[1478] = getOpcodeAlt(a);}
        op[1479] = getOpcodeRnm(229, 1460); // boundEntityFuncCall
        op[1480] = getOpcodeRnm(230, 1463); // boundEntityColFuncCall
        op[1481] = getOpcodeRnm(231, 1466); // boundComplexFuncCall
        op[1482] = getOpcodeRnm(232, 1469); // boundComplexColFuncCall
        op[1483] = getOpcodeRnm(233, 1472); // boundPrimitiveFuncCall
        op[1484] = getOpcodeRnm(234, 1475); // boundPrimitiveColFuncCall
        {int[] a = {1486,1487,1494}; op[1485] = getOpcodeCat(a);}
        {char[] a = {40}; op[1486] = getOpcodeTls(a);}
        op[1487] = getOpcodeRep((char)0, (char)1, 1488);
        {int[] a = {1489,1490}; op[1488] = getOpcodeCat(a);}
        op[1489] = getOpcodeRnm(237, 1495); // functionParameter
        op[1490] = getOpcodeRep((char)0, Character.MAX_VALUE, 1491);
        {int[] a = {1492,1493}; op[1491] = getOpcodeCat(a);}
        {char[] a = {44}; op[1492] = getOpcodeTls(a);}
        op[1493] = getOpcodeRnm(237, 1495); // functionParameter
        {char[] a = {41}; op[1494] = getOpcodeTls(a);}
        {int[] a = {1496,1497,1498}; op[1495] = getOpcodeCat(a);}
        op[1496] = getOpcodeRnm(350, 2433); // functionParameterName
        {char[] a = {61}; op[1497] = getOpcodeTls(a);}
        {int[] a = {1499,1500}; op[1498] = getOpcodeAlt(a);}
        op[1499] = getOpcodeRnm(238, 1501); // primitiveParameterValue
        op[1500] = getOpcodeRnm(239, 1502); // parameterAlias
        op[1501] = getOpcodeRnm(148, 701); // primitiveLiteral
        {int[] a = {1503,1504}; op[1502] = getOpcodeCat(a);}
        {char[] a = {64}; op[1503] = getOpcodeTls(a);}
        op[1504] = getOpcodeRep((char)0, Character.MAX_VALUE, 1505);
        op[1505] = getOpcodeRnm(44, 305); // pchar
        {int[] a = {1507,1508,1509}; op[1506] = getOpcodeCat(a);}
        op[1507] = getOpcodeRnm(239, 1502); // parameterAlias
        {char[] a = {61}; op[1508] = getOpcodeTls(a);}
        op[1509] = getOpcodeRnm(254, 1585); // parameterValue
        {int[] a = {1511,1512,1513}; op[1510] = getOpcodeCat(a);}
        op[1511] = getOpcodeRnm(350, 2433); // functionParameterName
        {char[] a = {61}; op[1512] = getOpcodeTls(a);}
        op[1513] = getOpcodeRnm(254, 1585); // parameterValue
        {char[] a = {123,84,79,68,79,49,57,125}; op[1514] = getOpcodeTls(a);}
        {int[] a = {1516,1517,1520,1521,1522}; op[1515] = getOpcodeCat(a);}
        op[1516] = getOpcodeRnm(357, 2440); // quotation-mark
        {int[] a = {1518,1519}; op[1517] = getOpcodeAlt(a);}
        op[1518] = getOpcodeRnm(102, 583); // primitiveKeyProperty
        op[1519] = getOpcodeRnm(103, 584); // primitiveNonKeyProperty
        op[1520] = getOpcodeRnm(357, 2440); // quotation-mark
        op[1521] = getOpcodeRnm(67, 409); // name-separator
        op[1522] = getOpcodeRnm(250, 1566); // primitiveLiteralInVJSON
        {int[] a = {1524,1525}; op[1523] = getOpcodeAlt(a);}
        op[1524] = getOpcodeRnm(245, 1526); // complexPropertyInVJSON
        op[1525] = getOpcodeRnm(246, 1532); // complexPropertyInJSONLight
        {int[] a = {1527,1528,1529,1530,1531}; op[1526] = getOpcodeCat(a);}
        op[1527] = getOpcodeRnm(357, 2440); // quotation-mark
        op[1528] = getOpcodeRnm(105, 586); // complexProperty
        op[1529] = getOpcodeRnm(357, 2440); // quotation-mark
        op[1530] = getOpcodeRnm(67, 409); // name-separator
        op[1531] = getOpcodeRnm(257, 1594); // complexInVJSON
        {char[] a = {123,84,79,68,79,50,48,125}; op[1532] = getOpcodeTls(a);}
        {int[] a = {1534,1535}; op[1533] = getOpcodeAlt(a);}
        op[1534] = getOpcodeRnm(249, 1565); // colPropertyInJSONLight
        op[1535] = getOpcodeRnm(248, 1536); // collectionPropertyInVJSON
        {int[] a = {1537,1551}; op[1536] = getOpcodeAlt(a);}
        {int[] a = {1538,1539,1540,1541,1542,1543,1550}; op[1537] = getOpcodeCat(a);}
        op[1538] = getOpcodeRnm(357, 2440); // quotation-mark
        op[1539] = getOpcodeRnm(104, 585); // primitiveColProperty
        op[1540] = getOpcodeRnm(357, 2440); // quotation-mark
        op[1541] = getOpcodeRnm(67, 409); // name-separator
        {char[] a = {91}; op[1542] = getOpcodeTls(a);}
        op[1543] = getOpcodeRep((char)0, (char)1, 1544);
        {int[] a = {1545,1546}; op[1544] = getOpcodeCat(a);}
        op[1545] = getOpcodeRnm(356, 2439); // primitiveVJSONLiteral
        op[1546] = getOpcodeRep((char)0, Character.MAX_VALUE, 1547);
        {int[] a = {1548,1549}; op[1547] = getOpcodeCat(a);}
        op[1548] = getOpcodeRnm(62, 402); // COMMA
        op[1549] = getOpcodeRnm(250, 1566); // primitiveLiteralInVJSON
        {char[] a = {93}; op[1550] = getOpcodeTls(a);}
        {int[] a = {1552,1553,1554,1555,1556,1557,1564}; op[1551] = getOpcodeCat(a);}
        op[1552] = getOpcodeRnm(357, 2440); // quotation-mark
        op[1553] = getOpcodeRnm(106, 587); // complexColProperty
        op[1554] = getOpcodeRnm(357, 2440); // quotation-mark
        op[1555] = getOpcodeRnm(67, 409); // name-separator
        {char[] a = {91}; op[1556] = getOpcodeTls(a);}
        op[1557] = getOpcodeRep((char)0, (char)1, 1558);
        {int[] a = {1559,1560}; op[1558] = getOpcodeCat(a);}
        op[1559] = getOpcodeRnm(257, 1594); // complexInVJSON
        op[1560] = getOpcodeRep((char)0, Character.MAX_VALUE, 1561);
        {int[] a = {1562,1563}; op[1561] = getOpcodeCat(a);}
        op[1562] = getOpcodeRnm(62, 402); // COMMA
        op[1563] = getOpcodeRnm(257, 1594); // complexInVJSON
        {char[] a = {93}; op[1564] = getOpcodeTls(a);}
        {char[] a = {123,84,79,68,79,50,49,125}; op[1565] = getOpcodeTls(a);}
        {char[] a = {123,84,79,68,79,50,50,125}; op[1566] = getOpcodeTls(a);}
        {char[] a = {123,84,79,68,79,50,51,125}; op[1567] = getOpcodeTls(a);}
        {int[] a = {1569,1570,1571,1572,1573,1574,1576}; op[1568] = getOpcodeCat(a);}
        op[1569] = getOpcodeRnm(357, 2440); // quotation-mark
        {char[] a = {95,95,109,101,116,97,100,97,116,97}; op[1570] = getOpcodeTls(a);}
        op[1571] = getOpcodeRnm(357, 2440); // quotation-mark
        op[1572] = getOpcodeRnm(67, 409); // name-separator
        op[1573] = getOpcodeRnm(64, 406); // begin-object
        op[1574] = getOpcodeRep((char)0, (char)1, 1575);
        op[1575] = getOpcodeRnm(253, 1577); // typeNVPInVJSON
        op[1576] = getOpcodeRnm(65, 407); // end-object
        {int[] a = {1578,1579,1580,1581,1582,1583,1584}; op[1577] = getOpcodeCat(a);}
        op[1578] = getOpcodeRnm(357, 2440); // quotation-mark
        {char[] a = {116,121,112,101}; op[1579] = getOpcodeTls(a);}
        op[1580] = getOpcodeRnm(357, 2440); // quotation-mark
        op[1581] = getOpcodeRnm(67, 409); // name-separator
        op[1582] = getOpcodeRnm(357, 2440); // quotation-mark
        op[1583] = getOpcodeRnm(96, 523); // qualifiedTypeName
        op[1584] = getOpcodeRnm(357, 2440); // quotation-mark
        {int[] a = {1586,1587,1588,1589}; op[1585] = getOpcodeAlt(a);}
        op[1586] = getOpcodeRnm(148, 701); // primitiveLiteral
        op[1587] = getOpcodeRnm(340, 2423); // complexTypeInJSON
        op[1588] = getOpcodeRnm(354, 2437); // primitiveColInJSON
        op[1589] = getOpcodeRnm(338, 2421); // complexColInJSON
        {int[] a = {1591,1592}; op[1590] = getOpcodeAlt(a);}
        op[1591] = getOpcodeRnm(257, 1594); // complexInVJSON
        op[1592] = getOpcodeRnm(256, 1593); // complexInJSONLight
        {char[] a = {123,84,79,68,79,50,52,125}; op[1593] = getOpcodeTls(a);}
        {int[] a = {1595,1596,1610}; op[1594] = getOpcodeCat(a);}
        op[1595] = getOpcodeRnm(64, 406); // begin-object
        op[1596] = getOpcodeRep((char)0, (char)1, 1597);
        {int[] a = {1598,1603}; op[1597] = getOpcodeCat(a);}
        {int[] a = {1599,1600,1601,1602}; op[1598] = getOpcodeAlt(a);}
        op[1599] = getOpcodeRnm(252, 1568); // complexTypeMetadataInVJSON
        op[1600] = getOpcodeRnm(243, 1515); // primitivePropertyInVJSON
        op[1601] = getOpcodeRnm(245, 1526); // complexPropertyInVJSON
        op[1602] = getOpcodeRnm(248, 1536); // collectionPropertyInVJSON
        op[1603] = getOpcodeRep((char)0, Character.MAX_VALUE, 1604);
        {int[] a = {1605,1606}; op[1604] = getOpcodeCat(a);}
        op[1605] = getOpcodeRnm(66, 408); // value-separator
        {int[] a = {1607,1608,1609}; op[1606] = getOpcodeAlt(a);}
        op[1607] = getOpcodeRnm(243, 1515); // primitivePropertyInVJSON
        op[1608] = getOpcodeRnm(245, 1526); // complexPropertyInVJSON
        op[1609] = getOpcodeRnm(248, 1536); // collectionPropertyInVJSON
        op[1610] = getOpcodeRnm(65, 407); // end-object
        {int[] a = {1612,1614,1615}; op[1611] = getOpcodeCat(a);}
        op[1612] = getOpcodeRep((char)0, (char)1, 1613);
        op[1613] = getOpcodeRnm(94, 513); // operationQualifier
        op[1614] = getOpcodeRnm(111, 604); // entityServiceOp
        op[1615] = getOpcodeRep((char)0, (char)1, 1616);
        {char[] a = {40,41}; op[1616] = getOpcodeTls(a);}
        {int[] a = {1618,1620,1621}; op[1617] = getOpcodeCat(a);}
        op[1618] = getOpcodeRep((char)0, (char)1, 1619);
        op[1619] = getOpcodeRnm(94, 513); // operationQualifier
        op[1620] = getOpcodeRnm(112, 605); // entityColServiceOp
        op[1621] = getOpcodeRep((char)0, (char)1, 1622);
        {char[] a = {40,41}; op[1622] = getOpcodeTls(a);}
        {int[] a = {1624,1626,1627}; op[1623] = getOpcodeCat(a);}
        op[1624] = getOpcodeRep((char)0, (char)1, 1625);
        op[1625] = getOpcodeRnm(94, 513); // operationQualifier
        op[1626] = getOpcodeRnm(113, 606); // complexServiceOp
        op[1627] = getOpcodeRep((char)0, (char)1, 1628);
        {char[] a = {40,41}; op[1628] = getOpcodeTls(a);}
        {int[] a = {1630,1632,1633}; op[1629] = getOpcodeCat(a);}
        op[1630] = getOpcodeRep((char)0, (char)1, 1631);
        op[1631] = getOpcodeRnm(94, 513); // operationQualifier
        op[1632] = getOpcodeRnm(114, 607); // complexColServiceOp
        op[1633] = getOpcodeRep((char)0, (char)1, 1634);
        {char[] a = {40,41}; op[1634] = getOpcodeTls(a);}
        {int[] a = {1636,1638,1639}; op[1635] = getOpcodeCat(a);}
        op[1636] = getOpcodeRep((char)0, (char)1, 1637);
        op[1637] = getOpcodeRnm(94, 513); // operationQualifier
        op[1638] = getOpcodeRnm(115, 608); // primitiveServiceOp
        op[1639] = getOpcodeRep((char)0, (char)1, 1640);
        {char[] a = {40,41}; op[1640] = getOpcodeTls(a);}
        {int[] a = {1642,1644,1645}; op[1641] = getOpcodeCat(a);}
        op[1642] = getOpcodeRep((char)0, (char)1, 1643);
        op[1643] = getOpcodeRnm(94, 513); // operationQualifier
        op[1644] = getOpcodeRnm(115, 608); // primitiveServiceOp
        op[1645] = getOpcodeRep((char)0, (char)1, 1646);
        {char[] a = {40,41}; op[1646] = getOpcodeTls(a);}
        {int[] a = {1648,1649,1650,1651,1652,1653}; op[1647] = getOpcodeAlt(a);}
        op[1648] = getOpcodeRnm(258, 1611); // entityServiceOpCall
        op[1649] = getOpcodeRnm(259, 1617); // entityColServiceOpCall
        op[1650] = getOpcodeRnm(260, 1623); // complexServiceOpCall
        op[1651] = getOpcodeRnm(261, 1629); // complexColServiceOpCall
        op[1652] = getOpcodeRnm(262, 1635); // primitiveServiceOpCall
        op[1653] = getOpcodeRnm(263, 1641); // primitiveColServiceOpCall
        op[1654] = getOpcodeRnm(86, 492); // odataIdentifier
        {int[] a = {1656,1657,1658}; op[1655] = getOpcodeCat(a);}
        op[1656] = getOpcodeRnm(358, 2441); // serviceOperationParameterName
        {char[] a = {61}; op[1657] = getOpcodeTls(a);}
        op[1658] = getOpcodeRnm(238, 1501); // primitiveParameterValue
        {int[] a = {1660,1662,1677}; op[1659] = getOpcodeCat(a);}
        op[1660] = getOpcodeRep((char)0, (char)1, 1661);
        op[1661] = getOpcodeRnm(6, 15); // WSP
        {int[] a = {1663,1664,1665,1666,1667,1668,1669,1670,1671,1672,1673,1674,1675,1676}; op[1662] = getOpcodeAlt(a);}
        op[1663] = getOpcodeRnm(268, 1679); // boolCommonExpr
        op[1664] = getOpcodeRnm(307, 2051); // methodCallExpr
        op[1665] = getOpcodeRnm(271, 1704); // parenExpr
        op[1666] = getOpcodeRnm(270, 1703); // literalExpr
        op[1667] = getOpcodeRnm(281, 1768); // addExpr
        op[1668] = getOpcodeRnm(282, 1774); // subExpr
        op[1669] = getOpcodeRnm(283, 1780); // mulExpr
        op[1670] = getOpcodeRnm(284, 1786); // divExpr
        op[1671] = getOpcodeRnm(285, 1792); // modExpr
        op[1672] = getOpcodeRnm(286, 1798); // negateExpr
        op[1673] = getOpcodeRnm(294, 1907); // memberExpr
        op[1674] = getOpcodeRnm(291, 1864); // firstMemberExpr
        op[1675] = getOpcodeRnm(289, 1826); // castExpr
        op[1676] = getOpcodeRnm(349, 2432); // functionCallExpr
        op[1677] = getOpcodeRep((char)0, (char)1, 1678);
        op[1678] = getOpcodeRnm(6, 15); // WSP
        {int[] a = {1680,1682,1700}; op[1679] = getOpcodeCat(a);}
        op[1680] = getOpcodeRep((char)0, (char)1, 1681);
        op[1681] = getOpcodeRnm(6, 15); // WSP
        {int[] a = {1683,1684,1685,1686,1687,1688,1689,1690,1691,1692,1693,1694,1695,1696,1697,1698,1699}; op[1682] = getOpcodeAlt(a);}
        op[1683] = getOpcodeRnm(269, 1702); // boolLiteralExpr
        op[1684] = getOpcodeRnm(273, 1720); // andExpr
        op[1685] = getOpcodeRnm(274, 1726); // orExpr
        op[1686] = getOpcodeRnm(293, 1895); // boolPrimitiveMemberExpr
        op[1687] = getOpcodeRnm(275, 1732); // eqExpr
        op[1688] = getOpcodeRnm(276, 1738); // neExpr
        op[1689] = getOpcodeRnm(277, 1744); // ltExpr
        op[1690] = getOpcodeRnm(278, 1750); // leExpr
        op[1691] = getOpcodeRnm(279, 1756); // gtExpr
        op[1692] = getOpcodeRnm(280, 1762); // geExpr
        op[1693] = getOpcodeRnm(287, 1803); // notExpr
        op[1694] = getOpcodeRnm(288, 1807); // isofExpr
        op[1695] = getOpcodeRnm(290, 1845); // boolCastExpr
        op[1696] = getOpcodeRnm(336, 2419); // boolMethodCallExpr
        op[1697] = getOpcodeRnm(292, 1889); // firstBoolPrimitiveMemExpr
        op[1698] = getOpcodeRnm(272, 1712); // boolParenExpr
        op[1699] = getOpcodeRnm(335, 2418); // boolFunctionCallExpr
        op[1700] = getOpcodeRep((char)0, (char)1, 1701);
        op[1701] = getOpcodeRnm(6, 15); // WSP
        op[1702] = getOpcodeRnm(151, 749); // boolean
        op[1703] = getOpcodeRnm(148, 701); // primitiveLiteral
        {int[] a = {1705,1706,1708,1709,1711}; op[1704] = getOpcodeCat(a);}
        {char[] a = {40}; op[1705] = getOpcodeTls(a);}
        op[1706] = getOpcodeRep((char)0, (char)1, 1707);
        op[1707] = getOpcodeRnm(6, 15); // WSP
        op[1708] = getOpcodeRnm(267, 1659); // commonExpr
        op[1709] = getOpcodeRep((char)0, (char)1, 1710);
        op[1710] = getOpcodeRnm(6, 15); // WSP
        {char[] a = {41}; op[1711] = getOpcodeTls(a);}
        {int[] a = {1713,1714,1716,1717,1719}; op[1712] = getOpcodeCat(a);}
        {char[] a = {40}; op[1713] = getOpcodeTls(a);}
        op[1714] = getOpcodeRep((char)0, (char)1, 1715);
        op[1715] = getOpcodeRnm(6, 15); // WSP
        op[1716] = getOpcodeRnm(268, 1679); // boolCommonExpr
        op[1717] = getOpcodeRep((char)0, (char)1, 1718);
        op[1718] = getOpcodeRnm(6, 15); // WSP
        {char[] a = {41}; op[1719] = getOpcodeTls(a);}
        {int[] a = {1721,1722,1723,1724,1725}; op[1720] = getOpcodeCat(a);}
        op[1721] = getOpcodeRnm(268, 1679); // boolCommonExpr
        op[1722] = getOpcodeRnm(6, 15); // WSP
        {char[] a = {97,110,100}; op[1723] = getOpcodeTls(a);}
        op[1724] = getOpcodeRnm(6, 15); // WSP
        op[1725] = getOpcodeRnm(268, 1679); // boolCommonExpr
        {int[] a = {1727,1728,1729,1730,1731}; op[1726] = getOpcodeCat(a);}
        op[1727] = getOpcodeRnm(268, 1679); // boolCommonExpr
        op[1728] = getOpcodeRnm(6, 15); // WSP
        {char[] a = {111,114}; op[1729] = getOpcodeTls(a);}
        op[1730] = getOpcodeRnm(6, 15); // WSP
        op[1731] = getOpcodeRnm(268, 1679); // boolCommonExpr
        {int[] a = {1733,1734,1735,1736,1737}; op[1732] = getOpcodeCat(a);}
        op[1733] = getOpcodeRnm(267, 1659); // commonExpr
        op[1734] = getOpcodeRnm(6, 15); // WSP
        {char[] a = {101,113}; op[1735] = getOpcodeTls(a);}
        op[1736] = getOpcodeRnm(6, 15); // WSP
        op[1737] = getOpcodeRnm(267, 1659); // commonExpr
        {int[] a = {1739,1740,1741,1742,1743}; op[1738] = getOpcodeCat(a);}
        op[1739] = getOpcodeRnm(267, 1659); // commonExpr
        op[1740] = getOpcodeRnm(6, 15); // WSP
        {char[] a = {110,101}; op[1741] = getOpcodeTls(a);}
        op[1742] = getOpcodeRnm(6, 15); // WSP
        op[1743] = getOpcodeRnm(267, 1659); // commonExpr
        {int[] a = {1745,1746,1747,1748,1749}; op[1744] = getOpcodeCat(a);}
        op[1745] = getOpcodeRnm(267, 1659); // commonExpr
        op[1746] = getOpcodeRnm(6, 15); // WSP
        {char[] a = {108,116}; op[1747] = getOpcodeTls(a);}
        op[1748] = getOpcodeRnm(6, 15); // WSP
        op[1749] = getOpcodeRnm(267, 1659); // commonExpr
        {int[] a = {1751,1752,1753,1754,1755}; op[1750] = getOpcodeCat(a);}
        op[1751] = getOpcodeRnm(267, 1659); // commonExpr
        op[1752] = getOpcodeRnm(6, 15); // WSP
        {char[] a = {108,101}; op[1753] = getOpcodeTls(a);}
        op[1754] = getOpcodeRnm(6, 15); // WSP
        op[1755] = getOpcodeRnm(267, 1659); // commonExpr
        {int[] a = {1757,1758,1759,1760,1761}; op[1756] = getOpcodeCat(a);}
        op[1757] = getOpcodeRnm(267, 1659); // commonExpr
        op[1758] = getOpcodeRnm(6, 15); // WSP
        {char[] a = {103,116}; op[1759] = getOpcodeTls(a);}
        op[1760] = getOpcodeRnm(6, 15); // WSP
        op[1761] = getOpcodeRnm(267, 1659); // commonExpr
        {int[] a = {1763,1764,1765,1766,1767}; op[1762] = getOpcodeCat(a);}
        op[1763] = getOpcodeRnm(267, 1659); // commonExpr
        op[1764] = getOpcodeRnm(6, 15); // WSP
        {char[] a = {103,101}; op[1765] = getOpcodeTls(a);}
        op[1766] = getOpcodeRnm(6, 15); // WSP
        op[1767] = getOpcodeRnm(267, 1659); // commonExpr
        {int[] a = {1769,1770,1771,1772,1773}; op[1768] = getOpcodeCat(a);}
        op[1769] = getOpcodeRnm(267, 1659); // commonExpr
        op[1770] = getOpcodeRnm(6, 15); // WSP
        {char[] a = {97,100,100}; op[1771] = getOpcodeTls(a);}
        op[1772] = getOpcodeRnm(6, 15); // WSP
        op[1773] = getOpcodeRnm(267, 1659); // commonExpr
        {int[] a = {1775,1776,1777,1778,1779}; op[1774] = getOpcodeCat(a);}
        op[1775] = getOpcodeRnm(267, 1659); // commonExpr
        op[1776] = getOpcodeRnm(6, 15); // WSP
        {char[] a = {115,117,98}; op[1777] = getOpcodeTls(a);}
        op[1778] = getOpcodeRnm(6, 15); // WSP
        op[1779] = getOpcodeRnm(267, 1659); // commonExpr
        {int[] a = {1781,1782,1783,1784,1785}; op[1780] = getOpcodeCat(a);}
        op[1781] = getOpcodeRnm(267, 1659); // commonExpr
        op[1782] = getOpcodeRnm(6, 15); // WSP
        {char[] a = {109,117,108}; op[1783] = getOpcodeTls(a);}
        op[1784] = getOpcodeRnm(6, 15); // WSP
        op[1785] = getOpcodeRnm(267, 1659); // commonExpr
        {int[] a = {1787,1788,1789,1790,1791}; op[1786] = getOpcodeCat(a);}
        op[1787] = getOpcodeRnm(267, 1659); // commonExpr
        op[1788] = getOpcodeRnm(6, 15); // WSP
        {char[] a = {100,105,118}; op[1789] = getOpcodeTls(a);}
        op[1790] = getOpcodeRnm(6, 15); // WSP
        op[1791] = getOpcodeRnm(267, 1659); // commonExpr
        {int[] a = {1793,1794,1795,1796,1797}; op[1792] = getOpcodeCat(a);}
        op[1793] = getOpcodeRnm(267, 1659); // commonExpr
        op[1794] = getOpcodeRnm(6, 15); // WSP
        {char[] a = {109,111,100}; op[1795] = getOpcodeTls(a);}
        op[1796] = getOpcodeRnm(6, 15); // WSP
        op[1797] = getOpcodeRnm(267, 1659); // commonExpr
        {int[] a = {1799,1800,1802}; op[1798] = getOpcodeCat(a);}
        {char[] a = {45}; op[1799] = getOpcodeTls(a);}
        op[1800] = getOpcodeRep((char)0, (char)1, 1801);
        op[1801] = getOpcodeRnm(6, 15); // WSP
        op[1802] = getOpcodeRnm(267, 1659); // commonExpr
        {int[] a = {1804,1805,1806}; op[1803] = getOpcodeCat(a);}
        {char[] a = {110,111,116}; op[1804] = getOpcodeTls(a);}
        op[1805] = getOpcodeRnm(6, 15); // WSP
        op[1806] = getOpcodeRnm(267, 1659); // commonExpr
        {int[] a = {1808,1809,1811,1812,1820,1822,1823,1825}; op[1807] = getOpcodeCat(a);}
        {char[] a = {105,115,111,102}; op[1808] = getOpcodeTls(a);}
        op[1809] = getOpcodeRep((char)0, (char)1, 1810);
        op[1810] = getOpcodeRnm(6, 15); // WSP
        {char[] a = {40}; op[1811] = getOpcodeTls(a);}
        op[1812] = getOpcodeRep((char)0, (char)1, 1813);
        {int[] a = {1814,1816,1817,1819}; op[1813] = getOpcodeCat(a);}
        op[1814] = getOpcodeRep((char)0, (char)1, 1815);
        op[1815] = getOpcodeRnm(6, 15); // WSP
        op[1816] = getOpcodeRnm(267, 1659); // commonExpr
        op[1817] = getOpcodeRep((char)0, (char)1, 1818);
        op[1818] = getOpcodeRnm(6, 15); // WSP
        {char[] a = {44}; op[1819] = getOpcodeTls(a);}
        op[1820] = getOpcodeRep((char)0, (char)1, 1821);
        op[1821] = getOpcodeRnm(6, 15); // WSP
        op[1822] = getOpcodeRnm(96, 523); // qualifiedTypeName
        op[1823] = getOpcodeRep((char)0, (char)1, 1824);
        op[1824] = getOpcodeRnm(6, 15); // WSP
        {char[] a = {41}; op[1825] = getOpcodeTls(a);}
        {int[] a = {1827,1828,1830,1831,1839,1841,1842,1844}; op[1826] = getOpcodeCat(a);}
        {char[] a = {99,97,115,116}; op[1827] = getOpcodeTls(a);}
        op[1828] = getOpcodeRep((char)0, (char)1, 1829);
        op[1829] = getOpcodeRnm(6, 15); // WSP
        {char[] a = {40}; op[1830] = getOpcodeTls(a);}
        op[1831] = getOpcodeRep((char)0, (char)1, 1832);
        {int[] a = {1833,1835,1836,1838}; op[1832] = getOpcodeCat(a);}
        op[1833] = getOpcodeRep((char)0, (char)1, 1834);
        op[1834] = getOpcodeRnm(6, 15); // WSP
        op[1835] = getOpcodeRnm(267, 1659); // commonExpr
        op[1836] = getOpcodeRep((char)0, (char)1, 1837);
        op[1837] = getOpcodeRnm(6, 15); // WSP
        {char[] a = {44}; op[1838] = getOpcodeTls(a);}
        op[1839] = getOpcodeRep((char)0, (char)1, 1840);
        op[1840] = getOpcodeRnm(6, 15); // WSP
        op[1841] = getOpcodeRnm(96, 523); // qualifiedTypeName
        op[1842] = getOpcodeRep((char)0, (char)1, 1843);
        op[1843] = getOpcodeRnm(6, 15); // WSP
        {char[] a = {41}; op[1844] = getOpcodeTls(a);}
        {int[] a = {1846,1847,1849,1850,1858,1860,1861,1863}; op[1845] = getOpcodeCat(a);}
        {char[] a = {99,97,115,116}; op[1846] = getOpcodeTls(a);}
        op[1847] = getOpcodeRep((char)0, (char)1, 1848);
        op[1848] = getOpcodeRnm(6, 15); // WSP
        {char[] a = {40}; op[1849] = getOpcodeTls(a);}
        op[1850] = getOpcodeRep((char)0, (char)1, 1851);
        {int[] a = {1852,1854,1855,1857}; op[1851] = getOpcodeCat(a);}
        op[1852] = getOpcodeRep((char)0, (char)1, 1853);
        op[1853] = getOpcodeRnm(6, 15); // WSP
        op[1854] = getOpcodeRnm(267, 1659); // commonExpr
        op[1855] = getOpcodeRep((char)0, (char)1, 1856);
        op[1856] = getOpcodeRnm(6, 15); // WSP
        {char[] a = {44}; op[1857] = getOpcodeTls(a);}
        op[1858] = getOpcodeRep((char)0, (char)1, 1859);
        op[1859] = getOpcodeRnm(6, 15); // WSP
        {char[] a = {69,100,109,46,66,111,111,108,101,97,110}; op[1860] = getOpcodeTls(a);}
        op[1861] = getOpcodeRep((char)0, (char)1, 1862);
        op[1862] = getOpcodeRnm(6, 15); // WSP
        {char[] a = {41}; op[1863] = getOpcodeTls(a);}
        {int[] a = {1865,1877,1881,1882,1883}; op[1864] = getOpcodeAlt(a);}
        {int[] a = {1866,1868,1872,1874,1875}; op[1865] = getOpcodeCat(a);}
        op[1866] = getOpcodeRep((char)0, (char)1, 1867);
        op[1867] = getOpcodeRnm(6, 15); // WSP
        op[1868] = getOpcodeRep((char)0, (char)1, 1869);
        {int[] a = {1870,1871}; op[1869] = getOpcodeCat(a);}
        op[1870] = getOpcodeRnm(97, 534); // qualifiedEntityTypeName
        {char[] a = {47}; op[1871] = getOpcodeTls(a);}
        op[1872] = getOpcodeRep((char)0, (char)1, 1873);
        op[1873] = getOpcodeRnm(351, 2434); // lambdaPredicatePrefixExpr
        op[1874] = getOpcodeRnm(118, 611); // entityColNavigationProperty
        op[1875] = getOpcodeRep((char)0, (char)1, 1876);
        op[1876] = getOpcodeRnm(295, 1934); // collectionNavigationExpr
        {int[] a = {1878,1879}; op[1877] = getOpcodeCat(a);}
        op[1878] = getOpcodeRnm(117, 610); // entityNavigationProperty
        op[1879] = getOpcodeRep((char)0, (char)1, 1880);
        op[1880] = getOpcodeRnm(296, 1944); // singleNavigationExpr
        op[1881] = getOpcodeRnm(210, 1364); // primitivePropertyPath
        op[1882] = getOpcodeRnm(211, 1373); // complexPropertyPath
        {int[] a = {1884,1885}; op[1883] = getOpcodeCat(a);}
        op[1884] = getOpcodeRnm(212, 1384); // collectionPropertyPath
        op[1885] = getOpcodeRep((char)0, (char)1, 1886);
        {int[] a = {1887,1888}; op[1886] = getOpcodeAlt(a);}
        op[1887] = getOpcodeRnm(301, 2031); // anyExpr
        op[1888] = getOpcodeRnm(302, 2039); // allExpr
        {int[] a = {1890,1894}; op[1889] = getOpcodeCat(a);}
        op[1890] = getOpcodeRep((char)0, (char)1, 1891);
        {int[] a = {1892,1893}; op[1891] = getOpcodeCat(a);}
        op[1892] = getOpcodeRnm(97, 534); // qualifiedEntityTypeName
        {char[] a = {47}; op[1893] = getOpcodeTls(a);}
        op[1894] = getOpcodeRnm(343, 2426); // entityProperty
        {int[] a = {1896,1897,1899,1900,1902,1906}; op[1895] = getOpcodeCat(a);}
        op[1896] = getOpcodeRnm(267, 1659); // commonExpr
        op[1897] = getOpcodeRep((char)0, (char)1, 1898);
        op[1898] = getOpcodeRnm(6, 15); // WSP
        {char[] a = {47}; op[1899] = getOpcodeTls(a);}
        op[1900] = getOpcodeRep((char)0, (char)1, 1901);
        op[1901] = getOpcodeRnm(6, 15); // WSP
        op[1902] = getOpcodeRep((char)0, (char)1, 1903);
        {int[] a = {1904,1905}; op[1903] = getOpcodeCat(a);}
        op[1904] = getOpcodeRnm(97, 534); // qualifiedEntityTypeName
        {char[] a = {47}; op[1905] = getOpcodeTls(a);}
        op[1906] = getOpcodeRnm(210, 1364); // primitivePropertyPath
        {int[] a = {1908,1922,1926,1927,1928}; op[1907] = getOpcodeAlt(a);}
        {int[] a = {1909,1910,1912,1913,1915,1919,1920}; op[1908] = getOpcodeCat(a);}
        op[1909] = getOpcodeRnm(267, 1659); // commonExpr
        op[1910] = getOpcodeRep((char)0, (char)1, 1911);
        op[1911] = getOpcodeRnm(6, 15); // WSP
        {char[] a = {47}; op[1912] = getOpcodeTls(a);}
        op[1913] = getOpcodeRep((char)0, (char)1, 1914);
        op[1914] = getOpcodeRnm(6, 15); // WSP
        op[1915] = getOpcodeRep((char)0, (char)1, 1916);
        {int[] a = {1917,1918}; op[1916] = getOpcodeCat(a);}
        op[1917] = getOpcodeRnm(97, 534); // qualifiedEntityTypeName
        {char[] a = {47}; op[1918] = getOpcodeTls(a);}
        op[1919] = getOpcodeRnm(118, 611); // entityColNavigationProperty
        op[1920] = getOpcodeRep((char)0, (char)1, 1921);
        op[1921] = getOpcodeRnm(295, 1934); // collectionNavigationExpr
        {int[] a = {1923,1924}; op[1922] = getOpcodeCat(a);}
        op[1923] = getOpcodeRnm(117, 610); // entityNavigationProperty
        op[1924] = getOpcodeRep((char)0, (char)1, 1925);
        op[1925] = getOpcodeRnm(296, 1944); // singleNavigationExpr
        op[1926] = getOpcodeRnm(210, 1364); // primitivePropertyPath
        op[1927] = getOpcodeRnm(211, 1373); // complexPropertyPath
        {int[] a = {1929,1930}; op[1928] = getOpcodeCat(a);}
        op[1929] = getOpcodeRnm(212, 1384); // collectionPropertyPath
        op[1930] = getOpcodeRep((char)0, (char)1, 1931);
        {int[] a = {1932,1933}; op[1931] = getOpcodeAlt(a);}
        op[1932] = getOpcodeRnm(301, 2031); // anyExpr
        op[1933] = getOpcodeRnm(302, 2039); // allExpr
        {int[] a = {1935,1939,1940}; op[1934] = getOpcodeCat(a);}
        op[1935] = getOpcodeRep((char)0, (char)1, 1936);
        {int[] a = {1937,1938}; op[1936] = getOpcodeCat(a);}
        {char[] a = {47}; op[1937] = getOpcodeTls(a);}
        op[1938] = getOpcodeRnm(97, 534); // qualifiedEntityTypeName
        {char[] a = {47}; op[1939] = getOpcodeTls(a);}
        {int[] a = {1941,1942,1943}; op[1940] = getOpcodeAlt(a);}
        op[1941] = getOpcodeRnm(299, 1997); // boundFunctionExpr
        op[1942] = getOpcodeRnm(301, 2031); // anyExpr
        op[1943] = getOpcodeRnm(302, 2039); // allExpr
        {int[] a = {1945,1949,1950}; op[1944] = getOpcodeCat(a);}
        op[1945] = getOpcodeRep((char)0, (char)1, 1946);
        {int[] a = {1947,1948}; op[1946] = getOpcodeCat(a);}
        {char[] a = {47}; op[1947] = getOpcodeTls(a);}
        op[1948] = getOpcodeRnm(97, 534); // qualifiedEntityTypeName
        {char[] a = {47}; op[1949] = getOpcodeTls(a);}
        {int[] a = {1951,1955,1959,1960,1961,1967,1968}; op[1950] = getOpcodeAlt(a);}
        {int[] a = {1952,1953}; op[1951] = getOpcodeCat(a);}
        op[1952] = getOpcodeRnm(118, 611); // entityColNavigationProperty
        op[1953] = getOpcodeRep((char)0, (char)1, 1954);
        op[1954] = getOpcodeRnm(295, 1934); // collectionNavigationExpr
        {int[] a = {1956,1957}; op[1955] = getOpcodeCat(a);}
        op[1956] = getOpcodeRnm(117, 610); // entityNavigationProperty
        op[1957] = getOpcodeRep((char)0, (char)1, 1958);
        op[1958] = getOpcodeRnm(296, 1944); // singleNavigationExpr
        op[1959] = getOpcodeRnm(210, 1364); // primitivePropertyPath
        op[1960] = getOpcodeRnm(211, 1373); // complexPropertyPath
        {int[] a = {1962,1963}; op[1961] = getOpcodeCat(a);}
        op[1962] = getOpcodeRnm(212, 1384); // collectionPropertyPath
        op[1963] = getOpcodeRep((char)0, (char)1, 1964);
        {int[] a = {1965,1966}; op[1964] = getOpcodeAlt(a);}
        op[1965] = getOpcodeRnm(301, 2031); // anyExpr
        op[1966] = getOpcodeRnm(302, 2039); // allExpr
        op[1967] = getOpcodeRnm(213, 1395); // streamPropertyPath
        op[1968] = getOpcodeRnm(299, 1997); // boundFunctionExpr
        {int[] a = {1970,1974,1978,1982,1986,1992}; op[1969] = getOpcodeAlt(a);}
        {int[] a = {1971,1972}; op[1970] = getOpcodeCat(a);}
        op[1971] = getOpcodeRnm(341, 2424); // entityColFuncCall
        op[1972] = getOpcodeRep((char)0, (char)1, 1973);
        op[1973] = getOpcodeRnm(296, 1944); // singleNavigationExpr
        {int[] a = {1975,1976}; op[1974] = getOpcodeCat(a);}
        op[1975] = getOpcodeRnm(342, 2425); // entityFuncCall
        op[1976] = getOpcodeRep((char)0, (char)1, 1977);
        op[1977] = getOpcodeRnm(295, 1934); // collectionNavigationExpr
        {int[] a = {1979,1980}; op[1978] = getOpcodeCat(a);}
        op[1979] = getOpcodeRnm(355, 2438); // primitiveFuncCall
        op[1980] = getOpcodeRep((char)0, (char)1, 1981);
        op[1981] = getOpcodeRnm(299, 1997); // boundFunctionExpr
        {int[] a = {1983,1984}; op[1982] = getOpcodeCat(a);}
        op[1983] = getOpcodeRnm(353, 2436); // primitiveColFuncCall
        op[1984] = getOpcodeRep((char)0, (char)1, 1985);
        op[1985] = getOpcodeRnm(299, 1997); // boundFunctionExpr
        {int[] a = {1987,1988}; op[1986] = getOpcodeCat(a);}
        op[1987] = getOpcodeRnm(339, 2422); // complexFuncCall
        op[1988] = getOpcodeRep((char)0, (char)1, 1989);
        {int[] a = {1990,1991}; op[1989] = getOpcodeAlt(a);}
        op[1990] = getOpcodeRnm(211, 1373); // complexPropertyPath
        op[1991] = getOpcodeRnm(299, 1997); // boundFunctionExpr
        {int[] a = {1993,1994}; op[1992] = getOpcodeCat(a);}
        op[1993] = getOpcodeRnm(337, 2420); // complexColFuncCall
        op[1994] = getOpcodeRep((char)0, (char)1, 1995);
        op[1995] = getOpcodeRnm(299, 1997); // boundFunctionExpr
        op[1996] = getOpcodeRnm(297, 1969); // functionExpr
        {int[] a = {1998,2002,2003}; op[1997] = getOpcodeCat(a);}
        op[1998] = getOpcodeRep((char)0, (char)1, 1999);
        {int[] a = {2000,2001}; op[1999] = getOpcodeCat(a);}
        {char[] a = {47}; op[2000] = getOpcodeTls(a);}
        op[2001] = getOpcodeRnm(97, 534); // qualifiedEntityTypeName
        {char[] a = {47}; op[2002] = getOpcodeTls(a);}
        {int[] a = {2004,2008,2012,2016,2020,2026}; op[2003] = getOpcodeAlt(a);}
        {int[] a = {2005,2006}; op[2004] = getOpcodeCat(a);}
        op[2005] = getOpcodeRnm(230, 1463); // boundEntityColFuncCall
        op[2006] = getOpcodeRep((char)0, (char)1, 2007);
        op[2007] = getOpcodeRnm(296, 1944); // singleNavigationExpr
        {int[] a = {2009,2010}; op[2008] = getOpcodeCat(a);}
        op[2009] = getOpcodeRnm(229, 1460); // boundEntityFuncCall
        op[2010] = getOpcodeRep((char)0, (char)1, 2011);
        op[2011] = getOpcodeRnm(295, 1934); // collectionNavigationExpr
        {int[] a = {2013,2014}; op[2012] = getOpcodeCat(a);}
        op[2013] = getOpcodeRnm(233, 1472); // boundPrimitiveFuncCall
        op[2014] = getOpcodeRep((char)0, (char)1, 2015);
        op[2015] = getOpcodeRnm(299, 1997); // boundFunctionExpr
        {int[] a = {2017,2018}; op[2016] = getOpcodeCat(a);}
        op[2017] = getOpcodeRnm(234, 1475); // boundPrimitiveColFuncCall
        op[2018] = getOpcodeRep((char)0, (char)1, 2019);
        op[2019] = getOpcodeRnm(299, 1997); // boundFunctionExpr
        {int[] a = {2021,2022}; op[2020] = getOpcodeCat(a);}
        op[2021] = getOpcodeRnm(231, 1466); // boundComplexFuncCall
        op[2022] = getOpcodeRep((char)0, (char)1, 2023);
        {int[] a = {2024,2025}; op[2023] = getOpcodeAlt(a);}
        op[2024] = getOpcodeRnm(211, 1373); // complexPropertyPath
        op[2025] = getOpcodeRnm(299, 1997); // boundFunctionExpr
        {int[] a = {2027,2028}; op[2026] = getOpcodeCat(a);}
        op[2027] = getOpcodeRnm(232, 1469); // boundComplexColFuncCall
        op[2028] = getOpcodeRep((char)0, (char)1, 2029);
        op[2029] = getOpcodeRnm(299, 1997); // boundFunctionExpr
        op[2030] = getOpcodeRnm(299, 1997); // boundFunctionExpr
        {int[] a = {2032,2033,2038}; op[2031] = getOpcodeCat(a);}
        {char[] a = {97,110,121,40}; op[2032] = getOpcodeTls(a);}
        op[2033] = getOpcodeRep((char)0, (char)1, 2034);
        {int[] a = {2035,2036,2037}; op[2034] = getOpcodeCat(a);}
        op[2035] = getOpcodeRnm(304, 2046); // lambdaVariableExpr
        {char[] a = {58}; op[2036] = getOpcodeTls(a);}
        op[2037] = getOpcodeRnm(306, 2050); // lambdaPredicateExpr
        {char[] a = {41}; op[2038] = getOpcodeTls(a);}
        {int[] a = {2040,2041,2042,2043,2044}; op[2039] = getOpcodeCat(a);}
        {char[] a = {97,108,108,40}; op[2040] = getOpcodeTls(a);}
        op[2041] = getOpcodeRnm(304, 2046); // lambdaVariableExpr
        {char[] a = {58}; op[2042] = getOpcodeTls(a);}
        op[2043] = getOpcodeRnm(306, 2050); // lambdaPredicateExpr
        {char[] a = {41}; op[2044] = getOpcodeTls(a);}
        {char[] a = {36,105,116}; op[2045] = getOpcodeTls(a);}
        op[2046] = getOpcodeRnm(86, 492); // odataIdentifier
        {int[] a = {2048,2049}; op[2047] = getOpcodeAlt(a);}
        op[2048] = getOpcodeRnm(303, 2045); // implicitVariableExpr
        op[2049] = getOpcodeRnm(304, 2046); // lambdaVariableExpr
        op[2050] = getOpcodeRnm(268, 1679); // boolCommonExpr
        {int[] a = {2052,2053,2054,2055,2056,2057,2058,2059,2060,2061,2062,2063,2064,2065,2066,2067,2068,2069,2070,2071,2072}; op[2051] = getOpcodeAlt(a);}
        op[2052] = getOpcodeRnm(308, 2073); // boolMethodExpr
        op[2053] = getOpcodeRnm(310, 2097); // indexOfMethodCallExpr
        op[2054] = getOpcodeRnm(311, 2114); // replaceMethodCallExpr
        op[2055] = getOpcodeRnm(313, 2154); // toLowerMethodCallExpr
        op[2056] = getOpcodeRnm(314, 2165); // toUpperMethodCallExpr
        op[2057] = getOpcodeRnm(315, 2176); // trimMethodCallExpr
        op[2058] = getOpcodeRnm(359, 2442); // substringMethodCallExpr
        op[2059] = getOpcodeRnm(318, 2231); // concatMethodCallExpr
        op[2060] = getOpcodeRnm(319, 2250); // lengthMethodCallExpr
        op[2061] = getOpcodeRnm(321, 2272); // yearMethodCallExpr
        op[2062] = getOpcodeRnm(322, 2283); // monthMethodCallExpr
        op[2063] = getOpcodeRnm(323, 2294); // dayMethodCallExpr
        op[2064] = getOpcodeRnm(324, 2305); // hourMethodCallExpr
        op[2065] = getOpcodeRnm(325, 2316); // minuteMethodCallExpr
        op[2066] = getOpcodeRnm(326, 2327); // secondMethodCallExpr
        op[2067] = getOpcodeRnm(327, 2338); // roundMethodCallExpr
        op[2068] = getOpcodeRnm(328, 2349); // floorMethodCallExpr
        op[2069] = getOpcodeRnm(329, 2360); // ceilingMethodCallExpr
        op[2070] = getOpcodeRnm(330, 2371); // distanceMethodCallExpr
        op[2071] = getOpcodeRnm(331, 2388); // geoLengthMethodCallExpr
        op[2072] = getOpcodeRnm(320, 2261); // getTotalOffsetMinutesExpr
        {int[] a = {2074,2075,2076,2077,2078,2079}; op[2073] = getOpcodeAlt(a);}
        op[2074] = getOpcodeRnm(309, 2080); // endsWithMethodCallExpr
        op[2075] = getOpcodeRnm(312, 2137); // startsWithMethodCallExpr
        op[2076] = getOpcodeRnm(317, 2212); // substringOfMethodCallExpr
        op[2077] = getOpcodeRnm(332, 2399); // intersectsMethodCallExpr
        op[2078] = getOpcodeRnm(334, 2417); // anyMethodCallExpr
        op[2079] = getOpcodeRnm(333, 2416); // allMethodCallExpr
        {int[] a = {2081,2082,2084,2085,2087,2088,2090,2091,2093,2094,2096}; op[2080] = getOpcodeCat(a);}
        {char[] a = {101,110,100,115,119,105,116,104}; op[2081] = getOpcodeTls(a);}
        op[2082] = getOpcodeRep((char)0, (char)1, 2083);
        op[2083] = getOpcodeRnm(6, 15); // WSP
        {char[] a = {40}; op[2084] = getOpcodeTls(a);}
        op[2085] = getOpcodeRep((char)0, (char)1, 2086);
        op[2086] = getOpcodeRnm(6, 15); // WSP
        op[2087] = getOpcodeRnm(267, 1659); // commonExpr
        op[2088] = getOpcodeRep((char)0, (char)1, 2089);
        op[2089] = getOpcodeRnm(6, 15); // WSP
        {char[] a = {44}; op[2090] = getOpcodeTls(a);}
        op[2091] = getOpcodeRep((char)0, (char)1, 2092);
        op[2092] = getOpcodeRnm(6, 15); // WSP
        op[2093] = getOpcodeRnm(267, 1659); // commonExpr
        op[2094] = getOpcodeRep((char)0, (char)1, 2095);
        op[2095] = getOpcodeRnm(6, 15); // WSP
        {char[] a = {41}; op[2096] = getOpcodeTls(a);}
        {int[] a = {2098,2099,2101,2102,2104,2105,2107,2108,2110,2111,2113}; op[2097] = getOpcodeCat(a);}
        {char[] a = {105,110,100,101,120,111,102}; op[2098] = getOpcodeTls(a);}
        op[2099] = getOpcodeRep((char)0, (char)1, 2100);
        op[2100] = getOpcodeRnm(6, 15); // WSP
        {char[] a = {40}; op[2101] = getOpcodeTls(a);}
        op[2102] = getOpcodeRep((char)0, (char)1, 2103);
        op[2103] = getOpcodeRnm(6, 15); // WSP
        op[2104] = getOpcodeRnm(267, 1659); // commonExpr
        op[2105] = getOpcodeRep((char)0, (char)1, 2106);
        op[2106] = getOpcodeRnm(6, 15); // WSP
        {char[] a = {44}; op[2107] = getOpcodeTls(a);}
        op[2108] = getOpcodeRep((char)0, (char)1, 2109);
        op[2109] = getOpcodeRnm(6, 15); // WSP
        op[2110] = getOpcodeRnm(267, 1659); // commonExpr
        op[2111] = getOpcodeRep((char)0, (char)1, 2112);
        op[2112] = getOpcodeRnm(6, 15); // WSP
        {char[] a = {41}; op[2113] = getOpcodeTls(a);}
        {int[] a = {2115,2116,2118,2119,2121,2122,2124,2125,2127,2128,2130,2131,2133,2134,2136}; op[2114] = getOpcodeCat(a);}
        {char[] a = {114,101,112,108,97,99,101}; op[2115] = getOpcodeTls(a);}
        op[2116] = getOpcodeRep((char)0, (char)1, 2117);
        op[2117] = getOpcodeRnm(6, 15); // WSP
        {char[] a = {40}; op[2118] = getOpcodeTls(a);}
        op[2119] = getOpcodeRep((char)0, (char)1, 2120);
        op[2120] = getOpcodeRnm(6, 15); // WSP
        op[2121] = getOpcodeRnm(267, 1659); // commonExpr
        op[2122] = getOpcodeRep((char)0, (char)1, 2123);
        op[2123] = getOpcodeRnm(6, 15); // WSP
        {char[] a = {44}; op[2124] = getOpcodeTls(a);}
        op[2125] = getOpcodeRep((char)0, (char)1, 2126);
        op[2126] = getOpcodeRnm(6, 15); // WSP
        op[2127] = getOpcodeRnm(267, 1659); // commonExpr
        op[2128] = getOpcodeRep((char)0, (char)1, 2129);
        op[2129] = getOpcodeRnm(6, 15); // WSP
        {char[] a = {44}; op[2130] = getOpcodeTls(a);}
        op[2131] = getOpcodeRep((char)0, (char)1, 2132);
        op[2132] = getOpcodeRnm(6, 15); // WSP
        op[2133] = getOpcodeRnm(267, 1659); // commonExpr
        op[2134] = getOpcodeRep((char)0, (char)1, 2135);
        op[2135] = getOpcodeRnm(6, 15); // WSP
        {char[] a = {41}; op[2136] = getOpcodeTls(a);}
        {int[] a = {2138,2139,2141,2142,2144,2145,2147,2148,2150,2151,2153}; op[2137] = getOpcodeCat(a);}
        {char[] a = {115,116,97,114,116,115,119,105,116,104}; op[2138] = getOpcodeTls(a);}
        op[2139] = getOpcodeRep((char)0, (char)1, 2140);
        op[2140] = getOpcodeRnm(6, 15); // WSP
        {char[] a = {40}; op[2141] = getOpcodeTls(a);}
        op[2142] = getOpcodeRep((char)0, (char)1, 2143);
        op[2143] = getOpcodeRnm(6, 15); // WSP
        op[2144] = getOpcodeRnm(267, 1659); // commonExpr
        op[2145] = getOpcodeRep((char)0, (char)1, 2146);
        op[2146] = getOpcodeRnm(6, 15); // WSP
        {char[] a = {44}; op[2147] = getOpcodeTls(a);}
        op[2148] = getOpcodeRep((char)0, (char)1, 2149);
        op[2149] = getOpcodeRnm(6, 15); // WSP
        op[2150] = getOpcodeRnm(267, 1659); // commonExpr
        op[2151] = getOpcodeRep((char)0, (char)1, 2152);
        op[2152] = getOpcodeRnm(6, 15); // WSP
        {char[] a = {41}; op[2153] = getOpcodeTls(a);}
        {int[] a = {2155,2156,2158,2159,2161,2162,2164}; op[2154] = getOpcodeCat(a);}
        {char[] a = {116,111,108,111,119,101,114}; op[2155] = getOpcodeTls(a);}
        op[2156] = getOpcodeRep((char)0, (char)1, 2157);
        op[2157] = getOpcodeRnm(6, 15); // WSP
        {char[] a = {40}; op[2158] = getOpcodeTls(a);}
        op[2159] = getOpcodeRep((char)0, (char)1, 2160);
        op[2160] = getOpcodeRnm(6, 15); // WSP
        op[2161] = getOpcodeRnm(267, 1659); // commonExpr
        op[2162] = getOpcodeRep((char)0, (char)1, 2163);
        op[2163] = getOpcodeRnm(6, 15); // WSP
        {char[] a = {41}; op[2164] = getOpcodeTls(a);}
        {int[] a = {2166,2167,2169,2170,2172,2173,2175}; op[2165] = getOpcodeCat(a);}
        {char[] a = {116,111,117,112,112,101,114}; op[2166] = getOpcodeTls(a);}
        op[2167] = getOpcodeRep((char)0, (char)1, 2168);
        op[2168] = getOpcodeRnm(6, 15); // WSP
        {char[] a = {40}; op[2169] = getOpcodeTls(a);}
        op[2170] = getOpcodeRep((char)0, (char)1, 2171);
        op[2171] = getOpcodeRnm(6, 15); // WSP
        op[2172] = getOpcodeRnm(267, 1659); // commonExpr
        op[2173] = getOpcodeRep((char)0, (char)1, 2174);
        op[2174] = getOpcodeRnm(6, 15); // WSP
        {char[] a = {41}; op[2175] = getOpcodeTls(a);}
        {int[] a = {2177,2178,2180,2181,2183,2184,2186}; op[2176] = getOpcodeCat(a);}
        {char[] a = {116,114,105,109}; op[2177] = getOpcodeTls(a);}
        op[2178] = getOpcodeRep((char)0, (char)1, 2179);
        op[2179] = getOpcodeRnm(6, 15); // WSP
        {char[] a = {40}; op[2180] = getOpcodeTls(a);}
        op[2181] = getOpcodeRep((char)0, (char)1, 2182);
        op[2182] = getOpcodeRnm(6, 15); // WSP
        op[2183] = getOpcodeRnm(267, 1659); // commonExpr
        op[2184] = getOpcodeRep((char)0, (char)1, 2185);
        op[2185] = getOpcodeRnm(6, 15); // WSP
        {char[] a = {41}; op[2186] = getOpcodeTls(a);}
        {int[] a = {2188,2189,2191,2192,2194,2195,2197,2198,2200,2201,2203,2211}; op[2187] = getOpcodeCat(a);}
        {char[] a = {115,117,98,115,116,114,105,110,103}; op[2188] = getOpcodeTls(a);}
        op[2189] = getOpcodeRep((char)0, (char)1, 2190);
        op[2190] = getOpcodeRnm(6, 15); // WSP
        {char[] a = {40}; op[2191] = getOpcodeTls(a);}
        op[2192] = getOpcodeRep((char)0, (char)1, 2193);
        op[2193] = getOpcodeRnm(6, 15); // WSP
        op[2194] = getOpcodeRnm(267, 1659); // commonExpr
        op[2195] = getOpcodeRep((char)0, (char)1, 2196);
        op[2196] = getOpcodeRnm(6, 15); // WSP
        {char[] a = {44}; op[2197] = getOpcodeTls(a);}
        op[2198] = getOpcodeRep((char)0, (char)1, 2199);
        op[2199] = getOpcodeRnm(6, 15); // WSP
        op[2200] = getOpcodeRnm(267, 1659); // commonExpr
        op[2201] = getOpcodeRep((char)0, (char)1, 2202);
        op[2202] = getOpcodeRnm(6, 15); // WSP
        op[2203] = getOpcodeRep((char)0, (char)1, 2204);
        {int[] a = {2205,2206,2208,2209}; op[2204] = getOpcodeCat(a);}
        {char[] a = {44}; op[2205] = getOpcodeTls(a);}
        op[2206] = getOpcodeRep((char)0, (char)1, 2207);
        op[2207] = getOpcodeRnm(6, 15); // WSP
        op[2208] = getOpcodeRnm(267, 1659); // commonExpr
        op[2209] = getOpcodeRep((char)0, (char)1, 2210);
        op[2210] = getOpcodeRnm(6, 15); // WSP
        {char[] a = {41}; op[2211] = getOpcodeTls(a);}
        {int[] a = {2213,2214,2216,2217,2219,2220,2222,2230}; op[2212] = getOpcodeCat(a);}
        {char[] a = {115,117,98,115,116,114,105,110,103,111,102}; op[2213] = getOpcodeTls(a);}
        op[2214] = getOpcodeRep((char)0, (char)1, 2215);
        op[2215] = getOpcodeRnm(6, 15); // WSP
        {char[] a = {40}; op[2216] = getOpcodeTls(a);}
        op[2217] = getOpcodeRep((char)0, (char)1, 2218);
        op[2218] = getOpcodeRnm(6, 15); // WSP
        op[2219] = getOpcodeRnm(267, 1659); // commonExpr
        op[2220] = getOpcodeRep((char)0, (char)1, 2221);
        op[2221] = getOpcodeRnm(6, 15); // WSP
        op[2222] = getOpcodeRep((char)0, (char)1, 2223);
        {int[] a = {2224,2225,2227,2228}; op[2223] = getOpcodeCat(a);}
        {char[] a = {44}; op[2224] = getOpcodeTls(a);}
        op[2225] = getOpcodeRep((char)0, (char)1, 2226);
        op[2226] = getOpcodeRnm(6, 15); // WSP
        op[2227] = getOpcodeRnm(267, 1659); // commonExpr
        op[2228] = getOpcodeRep((char)0, (char)1, 2229);
        op[2229] = getOpcodeRnm(6, 15); // WSP
        {char[] a = {41}; op[2230] = getOpcodeTls(a);}
        {int[] a = {2232,2233,2235,2236,2238,2239,2241,2249}; op[2231] = getOpcodeCat(a);}
        {char[] a = {99,111,110,99,97,116}; op[2232] = getOpcodeTls(a);}
        op[2233] = getOpcodeRep((char)0, (char)1, 2234);
        op[2234] = getOpcodeRnm(6, 15); // WSP
        {char[] a = {40}; op[2235] = getOpcodeTls(a);}
        op[2236] = getOpcodeRep((char)0, (char)1, 2237);
        op[2237] = getOpcodeRnm(6, 15); // WSP
        op[2238] = getOpcodeRnm(267, 1659); // commonExpr
        op[2239] = getOpcodeRep((char)0, (char)1, 2240);
        op[2240] = getOpcodeRnm(6, 15); // WSP
        op[2241] = getOpcodeRep((char)0, (char)1, 2242);
        {int[] a = {2243,2244,2246,2247}; op[2242] = getOpcodeCat(a);}
        {char[] a = {44}; op[2243] = getOpcodeTls(a);}
        op[2244] = getOpcodeRep((char)0, (char)1, 2245);
        op[2245] = getOpcodeRnm(6, 15); // WSP
        op[2246] = getOpcodeRnm(267, 1659); // commonExpr
        op[2247] = getOpcodeRep((char)0, (char)1, 2248);
        op[2248] = getOpcodeRnm(6, 15); // WSP
        {char[] a = {41}; op[2249] = getOpcodeTls(a);}
        {int[] a = {2251,2252,2254,2255,2257,2258,2260}; op[2250] = getOpcodeCat(a);}
        {char[] a = {108,101,110,103,116,104}; op[2251] = getOpcodeTls(a);}
        op[2252] = getOpcodeRep((char)0, (char)1, 2253);
        op[2253] = getOpcodeRnm(6, 15); // WSP
        {char[] a = {40}; op[2254] = getOpcodeTls(a);}
        op[2255] = getOpcodeRep((char)0, (char)1, 2256);
        op[2256] = getOpcodeRnm(6, 15); // WSP
        op[2257] = getOpcodeRnm(267, 1659); // commonExpr
        op[2258] = getOpcodeRep((char)0, (char)1, 2259);
        op[2259] = getOpcodeRnm(6, 15); // WSP
        {char[] a = {41}; op[2260] = getOpcodeTls(a);}
        {int[] a = {2262,2263,2265,2266,2268,2269,2271}; op[2261] = getOpcodeCat(a);}
        {char[] a = {103,101,116,116,111,116,97,108,111,102,102,115,101,116,109,105,110,117,116,101,115}; op[2262] = getOpcodeTls(a);}
        op[2263] = getOpcodeRep((char)0, (char)1, 2264);
        op[2264] = getOpcodeRnm(6, 15); // WSP
        {char[] a = {40}; op[2265] = getOpcodeTls(a);}
        op[2266] = getOpcodeRep((char)0, (char)1, 2267);
        op[2267] = getOpcodeRnm(6, 15); // WSP
        op[2268] = getOpcodeRnm(267, 1659); // commonExpr
        op[2269] = getOpcodeRep((char)0, (char)1, 2270);
        op[2270] = getOpcodeRnm(6, 15); // WSP
        {char[] a = {41}; op[2271] = getOpcodeTls(a);}
        {int[] a = {2273,2274,2276,2277,2279,2280,2282}; op[2272] = getOpcodeCat(a);}
        {char[] a = {121,101,97,114}; op[2273] = getOpcodeTls(a);}
        op[2274] = getOpcodeRep((char)0, (char)1, 2275);
        op[2275] = getOpcodeRnm(6, 15); // WSP
        {char[] a = {40}; op[2276] = getOpcodeTls(a);}
        op[2277] = getOpcodeRep((char)0, (char)1, 2278);
        op[2278] = getOpcodeRnm(6, 15); // WSP
        op[2279] = getOpcodeRnm(267, 1659); // commonExpr
        op[2280] = getOpcodeRep((char)0, (char)1, 2281);
        op[2281] = getOpcodeRnm(6, 15); // WSP
        {char[] a = {41}; op[2282] = getOpcodeTls(a);}
        {int[] a = {2284,2285,2287,2288,2290,2291,2293}; op[2283] = getOpcodeCat(a);}
        {char[] a = {109,111,110,116,104}; op[2284] = getOpcodeTls(a);}
        op[2285] = getOpcodeRep((char)0, (char)1, 2286);
        op[2286] = getOpcodeRnm(6, 15); // WSP
        {char[] a = {40}; op[2287] = getOpcodeTls(a);}
        op[2288] = getOpcodeRep((char)0, (char)1, 2289);
        op[2289] = getOpcodeRnm(6, 15); // WSP
        op[2290] = getOpcodeRnm(267, 1659); // commonExpr
        op[2291] = getOpcodeRep((char)0, (char)1, 2292);
        op[2292] = getOpcodeRnm(6, 15); // WSP
        {char[] a = {41}; op[2293] = getOpcodeTls(a);}
        {int[] a = {2295,2296,2298,2299,2301,2302,2304}; op[2294] = getOpcodeCat(a);}
        {char[] a = {100,97,121}; op[2295] = getOpcodeTls(a);}
        op[2296] = getOpcodeRep((char)0, (char)1, 2297);
        op[2297] = getOpcodeRnm(6, 15); // WSP
        {char[] a = {40}; op[2298] = getOpcodeTls(a);}
        op[2299] = getOpcodeRep((char)0, (char)1, 2300);
        op[2300] = getOpcodeRnm(6, 15); // WSP
        op[2301] = getOpcodeRnm(267, 1659); // commonExpr
        op[2302] = getOpcodeRep((char)0, (char)1, 2303);
        op[2303] = getOpcodeRnm(6, 15); // WSP
        {char[] a = {41}; op[2304] = getOpcodeTls(a);}
        {int[] a = {2306,2307,2309,2310,2312,2313,2315}; op[2305] = getOpcodeCat(a);}
        {char[] a = {104,111,117,114}; op[2306] = getOpcodeTls(a);}
        op[2307] = getOpcodeRep((char)0, (char)1, 2308);
        op[2308] = getOpcodeRnm(6, 15); // WSP
        {char[] a = {40}; op[2309] = getOpcodeTls(a);}
        op[2310] = getOpcodeRep((char)0, (char)1, 2311);
        op[2311] = getOpcodeRnm(6, 15); // WSP
        op[2312] = getOpcodeRnm(267, 1659); // commonExpr
        op[2313] = getOpcodeRep((char)0, (char)1, 2314);
        op[2314] = getOpcodeRnm(6, 15); // WSP
        {char[] a = {41}; op[2315] = getOpcodeTls(a);}
        {int[] a = {2317,2318,2320,2321,2323,2324,2326}; op[2316] = getOpcodeCat(a);}
        {char[] a = {109,105,110,117,116,101}; op[2317] = getOpcodeTls(a);}
        op[2318] = getOpcodeRep((char)0, (char)1, 2319);
        op[2319] = getOpcodeRnm(6, 15); // WSP
        {char[] a = {40}; op[2320] = getOpcodeTls(a);}
        op[2321] = getOpcodeRep((char)0, (char)1, 2322);
        op[2322] = getOpcodeRnm(6, 15); // WSP
        op[2323] = getOpcodeRnm(267, 1659); // commonExpr
        op[2324] = getOpcodeRep((char)0, (char)1, 2325);
        op[2325] = getOpcodeRnm(6, 15); // WSP
        {char[] a = {41}; op[2326] = getOpcodeTls(a);}
        {int[] a = {2328,2329,2331,2332,2334,2335,2337}; op[2327] = getOpcodeCat(a);}
        {char[] a = {115,101,99,111,110,100}; op[2328] = getOpcodeTls(a);}
        op[2329] = getOpcodeRep((char)0, (char)1, 2330);
        op[2330] = getOpcodeRnm(6, 15); // WSP
        {char[] a = {40}; op[2331] = getOpcodeTls(a);}
        op[2332] = getOpcodeRep((char)0, (char)1, 2333);
        op[2333] = getOpcodeRnm(6, 15); // WSP
        op[2334] = getOpcodeRnm(267, 1659); // commonExpr
        op[2335] = getOpcodeRep((char)0, (char)1, 2336);
        op[2336] = getOpcodeRnm(6, 15); // WSP
        {char[] a = {41}; op[2337] = getOpcodeTls(a);}
        {int[] a = {2339,2340,2342,2343,2345,2346,2348}; op[2338] = getOpcodeCat(a);}
        {char[] a = {114,111,117,110,100}; op[2339] = getOpcodeTls(a);}
        op[2340] = getOpcodeRep((char)0, (char)1, 2341);
        op[2341] = getOpcodeRnm(6, 15); // WSP
        {char[] a = {40}; op[2342] = getOpcodeTls(a);}
        op[2343] = getOpcodeRep((char)0, (char)1, 2344);
        op[2344] = getOpcodeRnm(6, 15); // WSP
        op[2345] = getOpcodeRnm(267, 1659); // commonExpr
        op[2346] = getOpcodeRep((char)0, (char)1, 2347);
        op[2347] = getOpcodeRnm(6, 15); // WSP
        {char[] a = {41}; op[2348] = getOpcodeTls(a);}
        {int[] a = {2350,2351,2353,2354,2356,2357,2359}; op[2349] = getOpcodeCat(a);}
        {char[] a = {102,108,111,111,114}; op[2350] = getOpcodeTls(a);}
        op[2351] = getOpcodeRep((char)0, (char)1, 2352);
        op[2352] = getOpcodeRnm(6, 15); // WSP
        {char[] a = {40}; op[2353] = getOpcodeTls(a);}
        op[2354] = getOpcodeRep((char)0, (char)1, 2355);
        op[2355] = getOpcodeRnm(6, 15); // WSP
        op[2356] = getOpcodeRnm(267, 1659); // commonExpr
        op[2357] = getOpcodeRep((char)0, (char)1, 2358);
        op[2358] = getOpcodeRnm(6, 15); // WSP
        {char[] a = {41}; op[2359] = getOpcodeTls(a);}
        {int[] a = {2361,2362,2364,2365,2367,2368,2370}; op[2360] = getOpcodeCat(a);}
        {char[] a = {99,101,105,108,105,110,103}; op[2361] = getOpcodeTls(a);}
        op[2362] = getOpcodeRep((char)0, (char)1, 2363);
        op[2363] = getOpcodeRnm(6, 15); // WSP
        {char[] a = {40}; op[2364] = getOpcodeTls(a);}
        op[2365] = getOpcodeRep((char)0, (char)1, 2366);
        op[2366] = getOpcodeRnm(6, 15); // WSP
        op[2367] = getOpcodeRnm(267, 1659); // commonExpr
        op[2368] = getOpcodeRep((char)0, (char)1, 2369);
        op[2369] = getOpcodeRnm(6, 15); // WSP
        {char[] a = {41}; op[2370] = getOpcodeTls(a);}
        {int[] a = {2372,2373,2375,2376,2378,2379,2381,2382,2384,2385,2387}; op[2371] = getOpcodeCat(a);}
        {char[] a = {103,101,111,46,100,105,115,116,97,110,99,101}; op[2372] = getOpcodeTls(a);}
        op[2373] = getOpcodeRep((char)0, (char)1, 2374);
        op[2374] = getOpcodeRnm(6, 15); // WSP
        {char[] a = {40}; op[2375] = getOpcodeTls(a);}
        op[2376] = getOpcodeRep((char)0, (char)1, 2377);
        op[2377] = getOpcodeRnm(6, 15); // WSP
        op[2378] = getOpcodeRnm(267, 1659); // commonExpr
        op[2379] = getOpcodeRep((char)0, (char)1, 2380);
        op[2380] = getOpcodeRnm(6, 15); // WSP
        {char[] a = {44}; op[2381] = getOpcodeTls(a);}
        op[2382] = getOpcodeRep((char)0, (char)1, 2383);
        op[2383] = getOpcodeRnm(6, 15); // WSP
        op[2384] = getOpcodeRnm(267, 1659); // commonExpr
        op[2385] = getOpcodeRep((char)0, (char)1, 2386);
        op[2386] = getOpcodeRnm(6, 15); // WSP
        {char[] a = {41}; op[2387] = getOpcodeTls(a);}
        {int[] a = {2389,2390,2392,2393,2395,2396,2398}; op[2388] = getOpcodeCat(a);}
        {char[] a = {103,101,111,46,108,101,110,103,116,104}; op[2389] = getOpcodeTls(a);}
        op[2390] = getOpcodeRep((char)0, (char)1, 2391);
        op[2391] = getOpcodeRnm(6, 15); // WSP
        {char[] a = {40}; op[2392] = getOpcodeTls(a);}
        op[2393] = getOpcodeRep((char)0, (char)1, 2394);
        op[2394] = getOpcodeRnm(6, 15); // WSP
        op[2395] = getOpcodeRnm(267, 1659); // commonExpr
        op[2396] = getOpcodeRep((char)0, (char)1, 2397);
        op[2397] = getOpcodeRnm(6, 15); // WSP
        {char[] a = {41}; op[2398] = getOpcodeTls(a);}
        {int[] a = {2400,2401,2403,2404,2406,2407,2409,2410,2412,2413,2415}; op[2399] = getOpcodeCat(a);}
        {char[] a = {103,101,111,46,105,110,116,101,114,115,101,99,116,115}; op[2400] = getOpcodeTls(a);}
        op[2401] = getOpcodeRep((char)0, (char)1, 2402);
        op[2402] = getOpcodeRnm(6, 15); // WSP
        {char[] a = {40}; op[2403] = getOpcodeTls(a);}
        op[2404] = getOpcodeRep((char)0, (char)1, 2405);
        op[2405] = getOpcodeRnm(6, 15); // WSP
        op[2406] = getOpcodeRnm(267, 1659); // commonExpr
        op[2407] = getOpcodeRep((char)0, (char)1, 2408);
        op[2408] = getOpcodeRnm(6, 15); // WSP
        {char[] a = {44}; op[2409] = getOpcodeTls(a);}
        op[2410] = getOpcodeRep((char)0, (char)1, 2411);
        op[2411] = getOpcodeRnm(6, 15); // WSP
        op[2412] = getOpcodeRnm(267, 1659); // commonExpr
        op[2413] = getOpcodeRep((char)0, (char)1, 2414);
        op[2414] = getOpcodeRnm(6, 15); // WSP
        {char[] a = {41}; op[2415] = getOpcodeTls(a);}
        {char[] a = {123,84,79,68,79,50,53,125}; op[2416] = getOpcodeTls(a);}
        {char[] a = {123,84,79,68,79,50,54,125}; op[2417] = getOpcodeTls(a);}
        {char[] a = {123,84,79,68,79,50,55,125}; op[2418] = getOpcodeTls(a);}
        {char[] a = {123,84,79,68,79,50,56,125}; op[2419] = getOpcodeTls(a);}
        {char[] a = {123,84,79,68,79,50,57,125}; op[2420] = getOpcodeTls(a);}
        {char[] a = {123,84,79,68,79,51,48,125}; op[2421] = getOpcodeTls(a);}
        {char[] a = {123,84,79,68,79,51,49,125}; op[2422] = getOpcodeTls(a);}
        {char[] a = {123,84,79,68,79,51,50,125}; op[2423] = getOpcodeTls(a);}
        {char[] a = {123,84,79,68,79,51,51,125}; op[2424] = getOpcodeTls(a);}
        {char[] a = {123,84,79,68,79,51,52,125}; op[2425] = getOpcodeTls(a);}
        {char[] a = {123,84,79,68,79,51,53,125}; op[2426] = getOpcodeTls(a);}
        {char[] a = {123,84,79,68,79,51,55,125}; op[2427] = getOpcodeTls(a);}
        {char[] a = {123,84,79,68,79,51,56,125}; op[2428] = getOpcodeTls(a);}
        {char[] a = {123,84,79,68,79,51,57,125}; op[2429] = getOpcodeTls(a);}
        {char[] a = {123,84,79,68,79,52,48,125}; op[2430] = getOpcodeTls(a);}
        {char[] a = {123,84,79,68,79,52,49,125}; op[2431] = getOpcodeTls(a);}
        {char[] a = {123,84,79,68,79,52,50,125}; op[2432] = getOpcodeTls(a);}
        {char[] a = {123,84,79,68,79,52,51,125}; op[2433] = getOpcodeTls(a);}
        {char[] a = {123,84,79,68,79,52,53,125}; op[2434] = getOpcodeTls(a);}
        {char[] a = {123,84,79,68,79,52,55,125}; op[2435] = getOpcodeTls(a);}
        {char[] a = {123,84,79,68,79,52,56,125}; op[2436] = getOpcodeTls(a);}
        {char[] a = {123,84,79,68,79,52,57,125}; op[2437] = getOpcodeTls(a);}
        {char[] a = {123,84,79,68,79,53,48,125}; op[2438] = getOpcodeTls(a);}
        {char[] a = {123,84,79,68,79,53,49,125}; op[2439] = getOpcodeTls(a);}
        {char[] a = {123,84,79,68,79,53,51,125}; op[2440] = getOpcodeTls(a);}
        {char[] a = {123,84,79,68,79,53,52,125}; op[2441] = getOpcodeTls(a);}
        {char[] a = {123,84,79,68,79,53,53,125}; op[2442] = getOpcodeTls(a);}
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
        out.println(" binary / ");
        out.println(" dateTime /");
        out.println(" dateTimeOffset /");
        out.println(" decimal /");
        out.println(" double /");
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
        out.println(" geometryPolygon /");
        out.println(" guid / ");
        out.println(" int16 /");
        out.println(" int32 /");
        out.println(" int64 / ");
        out.println(" sbyte /");
        out.println(" byte /");
        out.println(" single /");
        out.println(" string / ");
        out.println(" time /");
        out.println(" boolean");
        out.println("");
        out.println("null = \"null\" [ \"'\" qualifiedTypeName \"'\" ] ");
        out.println(" ; The optional qualifiedTypeName is used to specify what type this null value should be considered. ");
        out.println(" ; Knowing the type is useful for function overload resolution purposes. ");
        out.println("                                                ");
        out.println("binary = ( %d88 / \"binary\" ) SQUOTE 2*HEXDIG SQUOTE ; note: \"X\" is case sensitive \"binary\" is not hence using the character code.");
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
        out.println("string = SQUOTE *( unreserved / pct-encoded / \"''\") SQUOTE ; TODO; was SQUOTE *UTF8-char SQUOTE, but that's not sufficient for use in URLs");
        out.println("time = \"time\" SQUOTE [ sign ] \"P\" [ 1*DIGIT \"Y\" ] [ 1*DIGIT \"M\" ] [ 1*DIGIT \"D\" ] [ \"T\" [ 1*DIGIT \"H\" ] [ 1*DIGIT \"M\" ] [ 1*DIGIT [ \".\" 1*DIGIT ] \"S\" ] ] SQUOTE");
        out.println(" ; the above is an approximation of the rules for an xml duration.");
        out.println(" ; see the lexical representation for duration in http://www.w3.org/TR/xmlschema-2 for more information");
        out.println("");
        out.println("odataUri = scheme \"://\" host [ \":\" port ] serviceRoot [ \"$metadata\" / \"$batch\" / odataRelativeUri ]  ");
        out.println("");
        out.println("serviceRoot = *( \"/\" segment-nz ) \"/\"");
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
        out.println("                                                                        commonExpr [WSP] [ \"asc\" / \"desc\" ] *( COMMA [ WSP ]  commonExpr [ WSP ] [ \"asc\" / \"desc\" ])");
        out.println("");
        out.println("skip                                            =   \"$skip=\" 1*DIGIT");
        out.println("");
        out.println("top                                                     =       \"$top=\" 1*DIGIT");
        out.println("");
        out.println("format = \"$format=\" (");
        out.println(" \"json\" / ");
        out.println(" \"atom\" / ");
        out.println(" \"xml\" / ");
        out.println(" \"{TODO17}\" / ; <a data service specific value indicating a format specific to the specific data service>");
        out.println(" \"{TODO18}\" ; <An IANA-defined [IANA-MMT] content type>");
        out.println(" )");
        out.println("        ");
        out.println("inlinecount                                     =       \"$inlinecount=\" ( \"allpages\" / \"none\" )");
        out.println("");
        out.println("select                                          =       \"$select=\" selectClause");
        out.println("");
        out.println("selectClause                            =       selectItem *( COMMA selectItem )");
        out.println("");
        out.println("selectItem                              =       star / ");
        out.println("                                                                        [ qualifiedEntityTypeName \"/\" ] (");
        out.println("                                                                                propertyName / ");
        out.println("                                                                                qualifiedActionName / ");
        out.println("                                                                                qualifiedFunctionName / ");
        out.println("                                                                                allOperationsInContainer /");
        out.println("                                                                                ( navigationProperty [ \"/\" selectItem ] )");
        out.println("                                                                        )");
        out.println("");
        out.println("skiptoken                                       =       \"$skiptoken=\" 1*pchar");
        out.println("");
        out.println("customQueryOption               =       customName [ WSP ] [ \"=\" [ WSP ] customValue ]");
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
        out.println("                                             ( boundOperation  /");
        out.println("                                             \"/\" ( ");
        out.println("                                                ( \"$links/\" navigationProperty ) / ");
        out.println("                                        ( entityColNavigationProperty [ collectionNavigation ] ) /");
        out.println("                                        ( entityNavigationProperty [ singleNavigation ] ) /");
        out.println("                                                                                primitivePropertyPath / ");
        out.println("                                        complexPropertyPath /");
        out.println("                                                                                collectionPropertyPath / ");
        out.println("                                        streamPropertyPath / ");
        out.println("                                        value");
        out.println("                                        ) )");
        out.println("                        ");
        out.println("boundOperation              =       [ \"/\" qualifiedEntityTypeName ] ");
        out.println("                                                                        \"/\" ");
        out.println("                                                                        (");
        out.println("                                                                                boundActionCall / ");
        out.println("                                                                                boundEntityColFuncCall [ singleNavigation ] /");
        out.println("                                                                                boundEntityFuncCall [ collectionNavigation ] /");
        out.println("                                                                                boundPrimitiveFuncCall [ boundOperation / value ] /");
        out.println("                                                                                boundPrimitiveColFuncCall [ boundOperation ] /");
        out.println("                                                                                boundComplexFuncCall [ complexPropertyPath / boundOperation ] /");
        out.println("                                                                                boundComplexColFuncCall [ boundOperation ]");
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
        out.println("entityFunctionCall                      =       fullEntityFunctionCall functionParameters");
        out.println("");
        out.println("entityColFunctionCall           =       fullEntityColFunctionCall functionParameters");
        out.println("");
        out.println("complexFunctionCall                     =       fullComplexFunctionCall functionParameters");
        out.println("");
        out.println("complexColFunctionCall          =       fullComplexColFunctionCall functionParameters");
        out.println("");
        out.println("primitiveFunctionCall           =       fullPrimitiveFunctionCall functionParameters");
        out.println("");
        out.println("primitiveColFunctionCall        =       fullPrimitiveFunctionCall functionParameters");
        out.println("");
        out.println("functionCall                            =       entityFunctionCall / ");
        out.println("                                                                        entityColFunctionCall /");
        out.println("                                                                        complexFunctionCall / ");
        out.println("                                                                        complexColFunctionCall /");
        out.println("                                                                        primitiveFunctionCall /");
        out.println("                                                                        primitiveColFunctionCall");
        out.println("");
        out.println("boundEntityFuncCall                     =       fullEntityFunctionCall functionParameters");
        out.println("                                                                        ; with the added restrictions that the Function MUST support binding, and the binding parameter type ");
        out.println("                                                                        ; MUST match the type of resource identified by Uri immediately preceding (to the left) of the boundEntityFuncCall");
        out.println("                                                                        ; and the functionParameters MUST NOT include the bindingParameter.");
        out.println("");
        out.println("boundEntityColFuncCall          =       fullEntityColFunctionCall functionParameters");
        out.println("                                                                        ; with the added restrictions that the Function MUST support binding, and the binding parameter type ");
        out.println("                                                                        ; MUST match the type of resource identified by Uri immediately preceding (to the left) of the boundEntityColFuncCall");
        out.println("                                                                        ; and the functionParameters MUST NOT include the bindingParameter.");
        out.println("");
        out.println("boundComplexFuncCall            =       fullComplexFunctionCall functionParameters");
        out.println("                                                                        ; with the added restrictions that the Function MUST support binding, and the binding parameter type ");
        out.println("                                                                        ; MUST match the type of resource identified by Uri immediately preceding (to the left) of the boundComplexFuncCall");
        out.println("                                                                        ; and the functionParameters MUST NOT include the bindingParameter.");
        out.println("");
        out.println("boundComplexColFuncCall         =       fullComplexColFunctionCall functionParameters");
        out.println("                                                                        ; with the added restrictions that the Function MUST support binding, and the binding parameter type ");
        out.println("                                                                        ; MUST match the type of resource identified by Uri immediately preceding (to the left) of the boundComplexColFuncCall");
        out.println("                                                                        ; and the functionParameters MUST NOT include the bindingParameter.");
        out.println("");
        out.println("boundPrimitiveFuncCall          =       fullPrimitiveFunctionCall functionParameters");
        out.println("                                                                        ; with the added restrictions that the Function MUST support binding, and the binding parameter type ");
        out.println("                                                                        ; MUST match the type of resource identified by Uri immediately preceding (to the left) of the boundPrimitiveFuncCall");
        out.println("                                                                        ; and the functionParameters MUST NOT include the bindingParameter.");
        out.println("");
        out.println("boundPrimitiveColFuncCall       =       fullPrimitiveFunctionCall functionParameters");
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
        out.println("sopParameterNameAndValue        =       serviceOperationParameterName \"=\" primitiveParameterValue");
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
        out.println("fullComplexColFunctionCall = \"{TODO37}\"");
        out.println("fullComplexFunctionCall = \"{TODO38}\"");
        out.println("fullEntityColFunctionCall = \"{TODO39}\"");
        out.println("fullEntityFunctionCall = \"{TODO40}\"");
        out.println("fullPrimitiveFunctionCall = \"{TODO41}\"");
        out.println("functionCallExpr = \"{TODO42}\"");
        out.println("functionParameterName = \"{TODO43}\"");
        out.println("lambdaPredicatePrefixExpr = \"{TODO45}\"");
        out.println("parameterNameAndValue = \"{TODO47}\"");
        out.println("primitiveColFuncCall = \"{TODO48}\"");
        out.println("primitiveColInJSON = \"{TODO49}\"");
        out.println("primitiveFuncCall = \"{TODO50}\"");
        out.println("primitiveVJSONLiteral = \"{TODO51}\"");
        out.println("quotation-mark = \"{TODO53}\"");
        out.println("serviceOperationParameterName = \"{TODO54}\"");
        out.println("substringMethodCallExpr = \"{TODO55}\"");
    }
}
