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
    public static int ruleCount = 299;
    /** This enum provides easy to remember enum constants for locating the rule identifiers and names.
     * The enum constants have the same spelling as the rule names rendered in all caps with underscores replacing hyphens. */
    public enum RuleNames{
        /** id = <code>74</code>, name = <code>"abstractSpatialTypeName"</code> */
        ABSTRACTSPATIALTYPENAME("abstractSpatialTypeName", 74, 472, 3),
        /** id = <code>111</code>, name = <code>"action"</code> */
        ACTION("action", 111, 543, 8),
        /** id = <code>189</code>, name = <code>"actionCall"</code> */
        ACTIONCALL("actionCall", 189, 1240, 6),
        /** id = <code>241</code>, name = <code>"addExpr"</code> */
        ADDEXPR("addExpr", 241, 1558, 6),
        /** id = <code>209</code>, name = <code>"aliasAndValue"</code> */
        ALIASANDVALUE("aliasAndValue", 209, 1317, 4),
        /** id = <code>259</code>, name = <code>"allExpr"</code> */
        ALLEXPR("allExpr", 259, 1800, 6),
        /** id = <code>288</code>, name = <code>"allMethodCallExpr"</code> */
        ALLMETHODCALLEXPR("allMethodCallExpr", 288, 2173, 1),
        /** id = <code>67</code>, name = <code>"allOperationsInContainer"</code> */
        ALLOPERATIONSINCONTAINER("allOperationsInContainer", 67, 406, 3),
        /** id = <code>5</code>, name = <code>"ALPHA"</code> */
        ALPHA("ALPHA", 5, 38, 3),
        /** id = <code>233</code>, name = <code>"andExpr"</code> */
        ANDEXPR("andExpr", 233, 1510, 6),
        /** id = <code>258</code>, name = <code>"anyExpr"</code> */
        ANYEXPR("anyExpr", 258, 1792, 8),
        /** id = <code>289</code>, name = <code>"anyMethodCallExpr"</code> */
        ANYMETHODCALLEXPR("anyMethodCallExpr", 289, 2174, 1),
        /** id = <code>39</code>, name = <code>"begin-object"</code> */
        BEGIN_OBJECT("begin-object", 39, 298, 1),
        /** id = <code>119</code>, name = <code>"binary"</code> */
        BINARY("binary", 119, 620, 9),
        /** id = <code>250</code>, name = <code>"boolCastExpr"</code> */
        BOOLCASTEXPR("boolCastExpr", 250, 1635, 19),
        /** id = <code>228</code>, name = <code>"boolCommonExpr"</code> */
        BOOLCOMMONEXPR("boolCommonExpr", 228, 1469, 23),
        /** id = <code>120</code>, name = <code>"boolean"</code> */
        BOOLEAN("boolean", 120, 629, 7),
        /** id = <code>290</code>, name = <code>"boolFunctionCallExpr"</code> */
        BOOLFUNCTIONCALLEXPR("boolFunctionCallExpr", 290, 2175, 1),
        /** id = <code>229</code>, name = <code>"boolLiteralExpr"</code> */
        BOOLLITERALEXPR("boolLiteralExpr", 229, 1492, 1),
        /** id = <code>291</code>, name = <code>"boolMethodCallExpr"</code> */
        BOOLMETHODCALLEXPR("boolMethodCallExpr", 291, 2176, 1),
        /** id = <code>263</code>, name = <code>"boolMethodExpr"</code> */
        BOOLMETHODEXPR("boolMethodExpr", 263, 1830, 7),
        /** id = <code>232</code>, name = <code>"boolParenExpr"</code> */
        BOOLPARENEXPR("boolParenExpr", 232, 1502, 8),
        /** id = <code>253</code>, name = <code>"boolPrimitiveMemberExpr"</code> */
        BOOLPRIMITIVEMEMBEREXPR("boolPrimitiveMemberExpr", 253, 1685, 12),
        /** id = <code>190</code>, name = <code>"boundActionCall"</code> */
        BOUNDACTIONCALL("boundActionCall", 190, 1246, 6),
        /** id = <code>201</code>, name = <code>"boundComplexColFuncCall"</code> */
        BOUNDCOMPLEXCOLFUNCCALL("boundComplexColFuncCall", 201, 1286, 3),
        /** id = <code>200</code>, name = <code>"boundComplexFuncCall"</code> */
        BOUNDCOMPLEXFUNCCALL("boundComplexFuncCall", 200, 1283, 3),
        /** id = <code>199</code>, name = <code>"boundEntityColFuncCall"</code> */
        BOUNDENTITYCOLFUNCCALL("boundEntityColFuncCall", 199, 1280, 3),
        /** id = <code>198</code>, name = <code>"boundEntityFuncCall"</code> */
        BOUNDENTITYFUNCCALL("boundEntityFuncCall", 198, 1277, 3),
        /** id = <code>257</code>, name = <code>"boundFunctionExpr"</code> */
        BOUNDFUNCTIONEXPR("boundFunctionExpr", 257, 1759, 33),
        /** id = <code>178</code>, name = <code>"boundOperation"</code> */
        BOUNDOPERATION("boundOperation", 178, 1141, 36),
        /** id = <code>203</code>, name = <code>"boundPrimitiveColFuncCall"</code> */
        BOUNDPRIMITIVECOLFUNCCALL("boundPrimitiveColFuncCall", 203, 1292, 3),
        /** id = <code>202</code>, name = <code>"boundPrimitiveFuncCall"</code> */
        BOUNDPRIMITIVEFUNCCALL("boundPrimitiveFuncCall", 202, 1289, 3),
        /** id = <code>121</code>, name = <code>"byte"</code> */
        BYTE("byte", 121, 636, 2),
        /** id = <code>249</code>, name = <code>"castExpr"</code> */
        CASTEXPR("castExpr", 249, 1616, 19),
        /** id = <code>284</code>, name = <code>"ceilingMethodCallExpr"</code> */
        CEILINGMETHODCALLEXPR("ceilingMethodCallExpr", 284, 2117, 11),
        /** id = <code>176</code>, name = <code>"collectionNavigation"</code> */
        COLLECTIONNAVIGATION("collectionNavigation", 176, 1074, 36),
        /** id = <code>255</code>, name = <code>"collectionNavigationExpr"</code> */
        COLLECTIONNAVIGATIONEXPR("collectionNavigationExpr", 255, 1724, 10),
        /** id = <code>213</code>, name = <code>"collectionPropertyInVJSON"</code> */
        COLLECTIONPROPERTYINVJSON("collectionPropertyInVJSON", 213, 1339, 29),
        /** id = <code>181</code>, name = <code>"collectionPropertyPath"</code> */
        COLLECTIONPROPERTYPATH("collectionPropertyPath", 181, 1201, 11),
        /** id = <code>37</code>, name = <code>"COMMA"</code> */
        COMMA("COMMA", 37, 294, 1),
        /** id = <code>227</code>, name = <code>"commonExpr"</code> */
        COMMONEXPR("commonExpr", 227, 1449, 20),
        /** id = <code>106</code>, name = <code>"complexAction"</code> */
        COMPLEXACTION("complexAction", 106, 538, 1),
        /** id = <code>107</code>, name = <code>"complexColAction"</code> */
        COMPLEXCOLACTION("complexColAction", 107, 539, 1),
        /** id = <code>94</code>, name = <code>"complexColFunction"</code> */
        COMPLEXCOLFUNCTION("complexColFunction", 94, 502, 1),
        /** id = <code>194</code>, name = <code>"complexColFunctionCall"</code> */
        COMPLEXCOLFUNCTIONCALL("complexColFunctionCall", 194, 1261, 3),
        /** id = <code>292</code>, name = <code>"complexColInJSON"</code> */
        COMPLEXCOLINJSON("complexColInJSON", 292, 2177, 1),
        /** id = <code>79</code>, name = <code>"complexColProperty"</code> */
        COMPLEXCOLPROPERTY("complexColProperty", 79, 479, 1),
        /** id = <code>86</code>, name = <code>"complexColServiceOp"</code> */
        COMPLEXCOLSERVICEOP("complexColServiceOp", 86, 492, 1),
        /** id = <code>222</code>, name = <code>"complexColServiceOpCall"</code> */
        COMPLEXCOLSERVICEOPCALL("complexColServiceOpCall", 222, 1426, 6),
        /** id = <code>93</code>, name = <code>"complexFunction"</code> */
        COMPLEXFUNCTION("complexFunction", 93, 501, 1),
        /** id = <code>193</code>, name = <code>"complexFunctionCall"</code> */
        COMPLEXFUNCTIONCALL("complexFunctionCall", 193, 1258, 3),
        /** id = <code>218</code>, name = <code>"complexInVJSON"</code> */
        COMPLEXINVJSON("complexInVJSON", 218, 1391, 17),
        /** id = <code>78</code>, name = <code>"complexProperty"</code> */
        COMPLEXPROPERTY("complexProperty", 78, 478, 1),
        /** id = <code>212</code>, name = <code>"complexPropertyInVJSON"</code> */
        COMPLEXPROPERTYINVJSON("complexPropertyInVJSON", 212, 1333, 6),
        /** id = <code>180</code>, name = <code>"complexPropertyPath"</code> */
        COMPLEXPROPERTYPATH("complexPropertyPath", 180, 1188, 13),
        /** id = <code>85</code>, name = <code>"complexServiceOp"</code> */
        COMPLEXSERVICEOP("complexServiceOp", 85, 491, 1),
        /** id = <code>221</code>, name = <code>"complexServiceOpCall"</code> */
        COMPLEXSERVICEOPCALL("complexServiceOpCall", 221, 1420, 6),
        /** id = <code>293</code>, name = <code>"complexTypeInJSON"</code> */
        COMPLEXTYPEINJSON("complexTypeInJSON", 293, 2178, 1),
        /** id = <code>215</code>, name = <code>"complexTypeMetadataInVJSON"</code> */
        COMPLEXTYPEMETADATAINVJSON("complexTypeMetadataInVJSON", 215, 1369, 9),
        /** id = <code>64</code>, name = <code>"complexTypeName"</code> */
        COMPLEXTYPENAME("complexTypeName", 64, 397, 1),
        /** id = <code>186</code>, name = <code>"compoundKey"</code> */
        COMPOUNDKEY("compoundKey", 186, 1227, 8),
        /** id = <code>273</code>, name = <code>"concatMethodCallExpr"</code> */
        CONCATMETHODCALLEXPR("concatMethodCallExpr", 273, 1988, 19),
        /** id = <code>73</code>, name = <code>"concreteSpatialTypeName"</code> */
        CONCRETESPATIALTYPENAME("concreteSpatialTypeName", 73, 457, 15),
        /** id = <code>160</code>, name = <code>"count"</code> */
        COUNT("count", 160, 871, 1),
        /** id = <code>11</code>, name = <code>"CR"</code> */
        CR("CR", 11, 55, 1),
        /** id = <code>13</code>, name = <code>"CRLF"</code> */
        CRLF("CRLF", 13, 57, 3),
        /** id = <code>173</code>, name = <code>"customName"</code> */
        CUSTOMNAME("customName", 173, 973, 29),
        /** id = <code>172</code>, name = <code>"customQueryOption"</code> */
        CUSTOMQUERYOPTION("customQueryOption", 172, 963, 10),
        /** id = <code>174</code>, name = <code>"customValue"</code> */
        CUSTOMVALUE("customValue", 174, 1002, 16),
        /** id = <code>122</code>, name = <code>"dateTime"</code> */
        DATETIME("dateTime", 122, 638, 5),
        /** id = <code>124</code>, name = <code>"dateTimeBody"</code> */
        DATETIMEBODY("dateTimeBody", 124, 648, 24),
        /** id = <code>123</code>, name = <code>"dateTimeOffset"</code> */
        DATETIMEOFFSET("dateTimeOffset", 123, 643, 5),
        /** id = <code>125</code>, name = <code>"dateTimeOffsetBody"</code> */
        DATETIMEOFFSETBODY("dateTimeOffsetBody", 125, 672, 9),
        /** id = <code>52</code>, name = <code>"day"</code> */
        DAY("day", 52, 349, 12),
        /** id = <code>278</code>, name = <code>"dayMethodCallExpr"</code> */
        DAYMETHODCALLEXPR("dayMethodCallExpr", 278, 2051, 11),
        /** id = <code>23</code>, name = <code>"dec-octet"</code> */
        DEC_OCTET("dec-octet", 23, 199, 16),
        /** id = <code>126</code>, name = <code>"decimal"</code> */
        DECIMAL("decimal", 126, 681, 4),
        /** id = <code>127</code>, name = <code>"decimalBody"</code> */
        DECIMALBODY("decimalBody", 127, 685, 10),
        /** id = <code>6</code>, name = <code>"DIGIT"</code> */
        DIGIT("DIGIT", 6, 41, 1),
        /** id = <code>285</code>, name = <code>"distanceMethodCallExpr"</code> */
        DISTANCEMETHODCALLEXPR("distanceMethodCallExpr", 285, 2128, 17),
        /** id = <code>244</code>, name = <code>"divExpr"</code> */
        DIVEXPR("divExpr", 244, 1576, 6),
        /** id = <code>129</code>, name = <code>"double"</code> */
        DOUBLE("double", 129, 706, 4),
        /** id = <code>128</code>, name = <code>"doubleBody"</code> */
        DOUBLEBODY("doubleBody", 128, 695, 11),
        /** id = <code>40</code>, name = <code>"end-object"</code> */
        END_OBJECT("end-object", 40, 299, 1),
        /** id = <code>264</code>, name = <code>"endsWithMethodCallExpr"</code> */
        ENDSWITHMETHODCALLEXPR("endsWithMethodCallExpr", 264, 1837, 17),
        /** id = <code>104</code>, name = <code>"entityAction"</code> */
        ENTITYACTION("entityAction", 104, 536, 1),
        /** id = <code>105</code>, name = <code>"entityColAction"</code> */
        ENTITYCOLACTION("entityColAction", 105, 537, 1),
        /** id = <code>92</code>, name = <code>"entityColFunction"</code> */
        ENTITYCOLFUNCTION("entityColFunction", 92, 500, 1),
        /** id = <code>192</code>, name = <code>"entityColFunctionCall"</code> */
        ENTITYCOLFUNCTIONCALL("entityColFunctionCall", 192, 1255, 3),
        /** id = <code>89</code>, name = <code>"entityColNavigationProperty"</code> */
        ENTITYCOLNAVIGATIONPROPERTY("entityColNavigationProperty", 89, 495, 1),
        /** id = <code>84</code>, name = <code>"entityColServiceOp"</code> */
        ENTITYCOLSERVICEOP("entityColServiceOp", 84, 490, 1),
        /** id = <code>220</code>, name = <code>"entityColServiceOpCall"</code> */
        ENTITYCOLSERVICEOPCALL("entityColServiceOpCall", 220, 1414, 6),
        /** id = <code>82</code>, name = <code>"entityContainerName"</code> */
        ENTITYCONTAINERNAME("entityContainerName", 82, 488, 1),
        /** id = <code>91</code>, name = <code>"entityFunction"</code> */
        ENTITYFUNCTION("entityFunction", 91, 499, 1),
        /** id = <code>191</code>, name = <code>"entityFunctionCall"</code> */
        ENTITYFUNCTIONCALL("entityFunctionCall", 191, 1252, 3),
        /** id = <code>88</code>, name = <code>"entityNavigationProperty"</code> */
        ENTITYNAVIGATIONPROPERTY("entityNavigationProperty", 88, 494, 1),
        /** id = <code>294</code>, name = <code>"entityProperty"</code> */
        ENTITYPROPERTY("entityProperty", 294, 2179, 1),
        /** id = <code>83</code>, name = <code>"entityServiceOp"</code> */
        ENTITYSERVICEOP("entityServiceOp", 83, 489, 1),
        /** id = <code>219</code>, name = <code>"entityServiceOpCall"</code> */
        ENTITYSERVICEOPCALL("entityServiceOpCall", 219, 1408, 6),
        /** id = <code>62</code>, name = <code>"entitySetName"</code> */
        ENTITYSETNAME("entitySetName", 62, 395, 1),
        /** id = <code>63</code>, name = <code>"entityTypeName"</code> */
        ENTITYTYPENAME("entityTypeName", 63, 396, 1),
        /** id = <code>65</code>, name = <code>"enumerationTypeName"</code> */
        ENUMERATIONTYPENAME("enumerationTypeName", 65, 398, 1),
        /** id = <code>235</code>, name = <code>"eqExpr"</code> */
        EQEXPR("eqExpr", 235, 1522, 6),
        /** id = <code>157</code>, name = <code>"expand"</code> */
        EXPAND("expand", 157, 848, 3),
        /** id = <code>158</code>, name = <code>"expandClause"</code> */
        EXPANDCLAUSE("expandClause", 158, 851, 6),
        /** id = <code>159</code>, name = <code>"expandItem"</code> */
        EXPANDITEM("expandItem", 159, 857, 14),
        /** id = <code>161</code>, name = <code>"filter"</code> */
        FILTER("filter", 161, 872, 8),
        /** id = <code>252</code>, name = <code>"firstBoolPrimitiveMemExpr"</code> */
        FIRSTBOOLPRIMITIVEMEMEXPR("firstBoolPrimitiveMemExpr", 252, 1679, 6),
        /** id = <code>251</code>, name = <code>"firstMemberExpr"</code> */
        FIRSTMEMBEREXPR("firstMemberExpr", 251, 1654, 25),
        /** id = <code>283</code>, name = <code>"floorMethodCallExpr"</code> */
        FLOORMETHODCALLEXPR("floorMethodCallExpr", 283, 2106, 11),
        /** id = <code>166</code>, name = <code>"format"</code> */
        FORMAT("format", 166, 917, 10),
        /** id = <code>56</code>, name = <code>"fractionalSeconds"</code> */
        FRACTIONALSECONDS("fractionalSeconds", 56, 375, 2),
        /** id = <code>112</code>, name = <code>"fullAction"</code> */
        FULLACTION("fullAction", 112, 551, 4),
        /** id = <code>100</code>, name = <code>"fullComplexColFunction"</code> */
        FULLCOMPLEXCOLFUNCTION("fullComplexColFunction", 100, 517, 4),
        /** id = <code>99</code>, name = <code>"fullComplexFunction"</code> */
        FULLCOMPLEXFUNCTION("fullComplexFunction", 99, 513, 4),
        /** id = <code>98</code>, name = <code>"fullEntityColFunction"</code> */
        FULLENTITYCOLFUNCTION("fullEntityColFunction", 98, 509, 4),
        /** id = <code>97</code>, name = <code>"fullEntityFunction"</code> */
        FULLENTITYFUNCTION("fullEntityFunction", 97, 505, 4),
        /** id = <code>103</code>, name = <code>"fullFunction"</code> */
        FULLFUNCTION("fullFunction", 103, 529, 7),
        /** id = <code>102</code>, name = <code>"fullPrimitiveColFunction"</code> */
        FULLPRIMITIVECOLFUNCTION("fullPrimitiveColFunction", 102, 525, 4),
        /** id = <code>101</code>, name = <code>"fullPrimitiveFunction"</code> */
        FULLPRIMITIVEFUNCTION("fullPrimitiveFunction", 101, 521, 4),
        /** id = <code>197</code>, name = <code>"functionCall"</code> */
        FUNCTIONCALL("functionCall", 197, 1270, 7),
        /** id = <code>205</code>, name = <code>"functionParameter"</code> */
        FUNCTIONPARAMETER("functionParameter", 205, 1305, 6),
        /** id = <code>206</code>, name = <code>"functionParameterName"</code> */
        FUNCTIONPARAMETERNAME("functionParameterName", 206, 1311, 1),
        /** id = <code>204</code>, name = <code>"functionParameters"</code> */
        FUNCTIONPARAMETERS("functionParameters", 204, 1295, 10),
        /** id = <code>240</code>, name = <code>"geExpr"</code> */
        GEEXPR("geExpr", 240, 1552, 6),
        /** id = <code>132</code>, name = <code>"geography"</code> */
        GEOGRAPHY("geography", 132, 725, 1),
        /** id = <code>133</code>, name = <code>"geographyCollection"</code> */
        GEOGRAPHYCOLLECTION("geographyCollection", 133, 726, 1),
        /** id = <code>134</code>, name = <code>"geographyLineString"</code> */
        GEOGRAPHYLINESTRING("geographyLineString", 134, 727, 1),
        /** id = <code>135</code>, name = <code>"geographyMultiLineString"</code> */
        GEOGRAPHYMULTILINESTRING("geographyMultiLineString", 135, 728, 1),
        /** id = <code>136</code>, name = <code>"geographyMultiPoint"</code> */
        GEOGRAPHYMULTIPOINT("geographyMultiPoint", 136, 729, 1),
        /** id = <code>137</code>, name = <code>"geographyMultiPolygon"</code> */
        GEOGRAPHYMULTIPOLYGON("geographyMultiPolygon", 137, 730, 1),
        /** id = <code>138</code>, name = <code>"geographyPoint"</code> */
        GEOGRAPHYPOINT("geographyPoint", 138, 731, 1),
        /** id = <code>139</code>, name = <code>"geographyPolygon"</code> */
        GEOGRAPHYPOLYGON("geographyPolygon", 139, 732, 1),
        /** id = <code>286</code>, name = <code>"geoLengthMethodCallExpr"</code> */
        GEOLENGTHMETHODCALLEXPR("geoLengthMethodCallExpr", 286, 2145, 11),
        /** id = <code>140</code>, name = <code>"geometry"</code> */
        GEOMETRY("geometry", 140, 733, 1),
        /** id = <code>141</code>, name = <code>"geometryCollection"</code> */
        GEOMETRYCOLLECTION("geometryCollection", 141, 734, 1),
        /** id = <code>142</code>, name = <code>"geometryLineString"</code> */
        GEOMETRYLINESTRING("geometryLineString", 142, 735, 1),
        /** id = <code>143</code>, name = <code>"geometryMultiLineString"</code> */
        GEOMETRYMULTILINESTRING("geometryMultiLineString", 143, 736, 1),
        /** id = <code>144</code>, name = <code>"geometryMultiPoint"</code> */
        GEOMETRYMULTIPOINT("geometryMultiPoint", 144, 737, 1),
        /** id = <code>145</code>, name = <code>"geometryMultiPolygon"</code> */
        GEOMETRYMULTIPOLYGON("geometryMultiPolygon", 145, 738, 1),
        /** id = <code>146</code>, name = <code>"geometryPoint"</code> */
        GEOMETRYPOINT("geometryPoint", 146, 739, 1),
        /** id = <code>147</code>, name = <code>"geometryPolygon"</code> */
        GEOMETRYPOLYGON("geometryPolygon", 147, 740, 1),
        /** id = <code>275</code>, name = <code>"getTotalOffsetMinutesExpr"</code> */
        GETTOTALOFFSETMINUTESEXPR("getTotalOffsetMinutesExpr", 275, 2018, 11),
        /** id = <code>239</code>, name = <code>"gtExpr"</code> */
        GTEXPR("gtExpr", 239, 1546, 6),
        /** id = <code>148</code>, name = <code>"guid"</code> */
        GUID("guid", 148, 741, 18),
        /** id = <code>20</code>, name = <code>"h16"</code> */
        H16("h16", 20, 183, 2),
        /** id = <code>7</code>, name = <code>"HEXDIG"</code> */
        HEXDIG("HEXDIG", 7, 42, 8),
        /** id = <code>15</code>, name = <code>"host"</code> */
        HOST("host", 15, 69, 4),
        /** id = <code>53</code>, name = <code>"hour"</code> */
        HOUR("hour", 53, 361, 12),
        /** id = <code>279</code>, name = <code>"hourMethodCallExpr"</code> */
        HOURMETHODCALLEXPR("hourMethodCallExpr", 279, 2062, 11),
        /** id = <code>9</code>, name = <code>"HTAB"</code> */
        HTAB("HTAB", 9, 51, 1),
        /** id = <code>59</code>, name = <code>"identifierCharacter"</code> */
        IDENTIFIERCHARACTER("identifierCharacter", 59, 384, 4),
        /** id = <code>58</code>, name = <code>"identifierLeadingCharacter"</code> */
        IDENTIFIERLEADINGCHARACTER("identifierLeadingCharacter", 58, 381, 3),
        /** id = <code>265</code>, name = <code>"indexOfMethodCallExpr"</code> */
        INDEXOFMETHODCALLEXPR("indexOfMethodCallExpr", 265, 1854, 17),
        /** id = <code>167</code>, name = <code>"inlinecount"</code> */
        INLINECOUNT("inlinecount", 167, 927, 5),
        /** id = <code>149</code>, name = <code>"int16"</code> */
        INT16("int16", 149, 759, 5),
        /** id = <code>150</code>, name = <code>"int32"</code> */
        INT32("int32", 150, 764, 5),
        /** id = <code>151</code>, name = <code>"int64"</code> */
        INT64("int64", 151, 769, 8),
        /** id = <code>287</code>, name = <code>"intersectsMethodCallExpr"</code> */
        INTERSECTSMETHODCALLEXPR("intersectsMethodCallExpr", 287, 2156, 17),
        /** id = <code>17</code>, name = <code>"IP-literal"</code> */
        IP_LITERAL("IP-literal", 17, 75, 6),
        /** id = <code>22</code>, name = <code>"IPv4address"</code> */
        IPV4ADDRESS("IPv4address", 22, 191, 8),
        /** id = <code>19</code>, name = <code>"IPv6address"</code> */
        IPV6ADDRESS("IPv6address", 19, 91, 92),
        /** id = <code>18</code>, name = <code>"IPvFuture"</code> */
        IPVFUTURE("IPvFuture", 18, 81, 10),
        /** id = <code>248</code>, name = <code>"isofExpr"</code> */
        ISOFEXPR("isofExpr", 248, 1597, 19),
        /** id = <code>184</code>, name = <code>"keyPredicate"</code> */
        KEYPREDICATE("keyPredicate", 184, 1220, 3),
        /** id = <code>188</code>, name = <code>"keyPropertyValue"</code> */
        KEYPROPERTYVALUE("keyPropertyValue", 188, 1239, 1),
        /** id = <code>187</code>, name = <code>"keyValuePair"</code> */
        KEYVALUEPAIR("keyValuePair", 187, 1235, 4),
        /** id = <code>261</code>, name = <code>"lambdaPredicateExpr"</code> */
        LAMBDAPREDICATEEXPR("lambdaPredicateExpr", 261, 1807, 1),
        /** id = <code>295</code>, name = <code>"lambdaPredicatePrefixExpr"</code> */
        LAMBDAPREDICATEPREFIXEXPR("lambdaPredicatePrefixExpr", 295, 2180, 1),
        /** id = <code>260</code>, name = <code>"lambdaVariableExpr"</code> */
        LAMBDAVARIABLEEXPR("lambdaVariableExpr", 260, 1806, 1),
        /** id = <code>238</code>, name = <code>"leExpr"</code> */
        LEEXPR("leExpr", 238, 1540, 6),
        /** id = <code>274</code>, name = <code>"lengthMethodCallExpr"</code> */
        LENGTHMETHODCALLEXPR("lengthMethodCallExpr", 274, 2007, 11),
        /** id = <code>12</code>, name = <code>"LF"</code> */
        LF("LF", 12, 56, 1),
        /** id = <code>230</code>, name = <code>"literalExpr"</code> */
        LITERALEXPR("literalExpr", 230, 1493, 1),
        /** id = <code>21</code>, name = <code>"ls32"</code> */
        LS32("ls32", 21, 185, 6),
        /** id = <code>237</code>, name = <code>"ltExpr"</code> */
        LTEXPR("ltExpr", 237, 1534, 6),
        /** id = <code>254</code>, name = <code>"memberExpr"</code> */
        MEMBEREXPR("memberExpr", 254, 1697, 27),
        /** id = <code>262</code>, name = <code>"methodCallExpr"</code> */
        METHODCALLEXPR("methodCallExpr", 262, 1808, 22),
        /** id = <code>54</code>, name = <code>"minute"</code> */
        MINUTE("minute", 54, 373, 1),
        /** id = <code>280</code>, name = <code>"minuteMethodCallExpr"</code> */
        MINUTEMETHODCALLEXPR("minuteMethodCallExpr", 280, 2073, 11),
        /** id = <code>245</code>, name = <code>"modExpr"</code> */
        MODEXPR("modExpr", 245, 1582, 6),
        /** id = <code>51</code>, name = <code>"month"</code> */
        MONTH("month", 51, 339, 10),
        /** id = <code>277</code>, name = <code>"monthMethodCallExpr"</code> */
        MONTHMETHODCALLEXPR("monthMethodCallExpr", 277, 2040, 11),
        /** id = <code>243</code>, name = <code>"mulExpr"</code> */
        MULEXPR("mulExpr", 243, 1570, 6),
        /** id = <code>42</code>, name = <code>"name-separator"</code> */
        NAME_SEPARATOR("name-separator", 42, 301, 1),
        /** id = <code>61</code>, name = <code>"namespace"</code> */
        NAMESPACE("namespace", 61, 389, 6),
        /** id = <code>60</code>, name = <code>"namespacePart"</code> */
        NAMESPACEPART("namespacePart", 60, 388, 1),
        /** id = <code>44</code>, name = <code>"nan"</code> */
        NAN("nan", 44, 303, 4),
        /** id = <code>47</code>, name = <code>"nanInfinity"</code> */
        NANINFINITY("nanInfinity", 47, 314, 4),
        /** id = <code>90</code>, name = <code>"navigationProperty"</code> */
        NAVIGATIONPROPERTY("navigationProperty", 90, 496, 3),
        /** id = <code>236</code>, name = <code>"neExpr"</code> */
        NEEXPR("neExpr", 236, 1528, 6),
        /** id = <code>246</code>, name = <code>"negateExpr"</code> */
        NEGATEEXPR("negateExpr", 246, 1588, 5),
        /** id = <code>46</code>, name = <code>"negativeInfinity"</code> */
        NEGATIVEINFINITY("negativeInfinity", 46, 311, 3),
        /** id = <code>247</code>, name = <code>"notExpr"</code> */
        NOTEXPR("notExpr", 247, 1593, 4),
        /** id = <code>118</code>, name = <code>"null"</code> */
        NULL("null", 118, 610, 10),
        /** id = <code>57</code>, name = <code>"odataIdentifier"</code> */
        ODATAIDENTIFIER("odataIdentifier", 57, 377, 4),
        /** id = <code>2</code>, name = <code>"odataRelativeUri"</code> */
        ODATARELATIVEURI("odataRelativeUri", 2, 20, 6),
        /** id = <code>0</code>, name = <code>"odataUri"</code> */
        ODATAURI("odataUri", 0, 0, 14),
        /** id = <code>48</code>, name = <code>"oneToNine"</code> */
        ONETONINE("oneToNine", 48, 318, 10),
        /** id = <code>66</code>, name = <code>"operationQualifier"</code> */
        OPERATIONQUALIFIER("operationQualifier", 66, 399, 7),
        /** id = <code>162</code>, name = <code>"orderby"</code> */
        ORDERBY("orderby", 162, 880, 26),
        /** id = <code>163</code>, name = <code>"orderExpr"</code> */
        ORDEREXPR("orderExpr", 163, 906, 3),
        /** id = <code>234</code>, name = <code>"orExpr"</code> */
        OREXPR("orExpr", 234, 1516, 6),
        /** id = <code>208</code>, name = <code>"parameterAlias"</code> */
        PARAMETERALIAS("parameterAlias", 208, 1313, 4),
        /** id = <code>210</code>, name = <code>"parameterNameAndValue"</code> */
        PARAMETERNAMEANDVALUE("parameterNameAndValue", 210, 1321, 4),
        /** id = <code>116</code>, name = <code>"parameterTypeName"</code> */
        PARAMETERTYPENAME("parameterTypeName", 116, 576, 1),
        /** id = <code>115</code>, name = <code>"parameterTypeNames"</code> */
        PARAMETERTYPENAMES("parameterTypeNames", 115, 569, 7),
        /** id = <code>217</code>, name = <code>"parameterValue"</code> */
        PARAMETERVALUE("parameterValue", 217, 1386, 5),
        /** id = <code>231</code>, name = <code>"parenExpr"</code> */
        PARENEXPR("parenExpr", 231, 1494, 8),
        /** id = <code>26</code>, name = <code>"pchar"</code> */
        PCHAR("pchar", 26, 222, 6),
        /** id = <code>27</code>, name = <code>"pct-encoded"</code> */
        PCT_ENCODED("pct-encoded", 27, 228, 4),
        /** id = <code>16</code>, name = <code>"port"</code> */
        PORT("port", 16, 73, 2),
        /** id = <code>45</code>, name = <code>"positiveInfinity"</code> */
        POSITIVEINFINITY("positiveInfinity", 45, 307, 4),
        /** id = <code>108</code>, name = <code>"primitiveAction"</code> */
        PRIMITIVEACTION("primitiveAction", 108, 540, 1),
        /** id = <code>109</code>, name = <code>"primitiveColAction"</code> */
        PRIMITIVECOLACTION("primitiveColAction", 109, 541, 1),
        /** id = <code>96</code>, name = <code>"primitiveColFunction"</code> */
        PRIMITIVECOLFUNCTION("primitiveColFunction", 96, 504, 1),
        /** id = <code>196</code>, name = <code>"primitiveColFunctionCall"</code> */
        PRIMITIVECOLFUNCTIONCALL("primitiveColFunctionCall", 196, 1267, 3),
        /** id = <code>296</code>, name = <code>"primitiveColInJSON"</code> */
        PRIMITIVECOLINJSON("primitiveColInJSON", 296, 2181, 1),
        /** id = <code>77</code>, name = <code>"primitiveColProperty"</code> */
        PRIMITIVECOLPROPERTY("primitiveColProperty", 77, 477, 1),
        /** id = <code>224</code>, name = <code>"primitiveColServiceOpCall"</code> */
        PRIMITIVECOLSERVICEOPCALL("primitiveColServiceOpCall", 224, 1438, 6),
        /** id = <code>95</code>, name = <code>"primitiveFunction"</code> */
        PRIMITIVEFUNCTION("primitiveFunction", 95, 503, 1),
        /** id = <code>195</code>, name = <code>"primitiveFunctionCall"</code> */
        PRIMITIVEFUNCTIONCALL("primitiveFunctionCall", 195, 1264, 3),
        /** id = <code>75</code>, name = <code>"primitiveKeyProperty"</code> */
        PRIMITIVEKEYPROPERTY("primitiveKeyProperty", 75, 475, 1),
        /** id = <code>117</code>, name = <code>"primitiveLiteral"</code> */
        PRIMITIVELITERAL("primitiveLiteral", 117, 577, 33),
        /** id = <code>214</code>, name = <code>"primitiveLiteralInVJSON"</code> */
        PRIMITIVELITERALINVJSON("primitiveLiteralInVJSON", 214, 1368, 1),
        /** id = <code>76</code>, name = <code>"primitiveNonKeyProperty"</code> */
        PRIMITIVENONKEYPROPERTY("primitiveNonKeyProperty", 76, 476, 1),
        /** id = <code>207</code>, name = <code>"primitiveParameterValue"</code> */
        PRIMITIVEPARAMETERVALUE("primitiveParameterValue", 207, 1312, 1),
        /** id = <code>211</code>, name = <code>"primitivePropertyInVJSON"</code> */
        PRIMITIVEPROPERTYINVJSON("primitivePropertyInVJSON", 211, 1325, 8),
        /** id = <code>179</code>, name = <code>"primitivePropertyPath"</code> */
        PRIMITIVEPROPERTYPATH("primitivePropertyPath", 179, 1177, 11),
        /** id = <code>87</code>, name = <code>"primitiveServiceOp"</code> */
        PRIMITIVESERVICEOP("primitiveServiceOp", 87, 493, 1),
        /** id = <code>223</code>, name = <code>"primitiveServiceOpCall"</code> */
        PRIMITIVESERVICEOPCALL("primitiveServiceOpCall", 223, 1432, 6),
        /** id = <code>72</code>, name = <code>"primitiveTypeName"</code> */
        PRIMITIVETYPENAME("primitiveTypeName", 72, 434, 23),
        /** id = <code>297</code>, name = <code>"primitiveVJSONLiteral"</code> */
        PRIMITIVEVJSONLITERAL("primitiveVJSONLiteral", 297, 2182, 1),
        /** id = <code>81</code>, name = <code>"propertyName"</code> */
        PROPERTYNAME("propertyName", 81, 481, 7),
        /** id = <code>113</code>, name = <code>"qualifiedActionName"</code> */
        QUALIFIEDACTIONNAME("qualifiedActionName", 113, 555, 7),
        /** id = <code>70</code>, name = <code>"qualifiedComplexTypeName"</code> */
        QUALIFIEDCOMPLEXTYPENAME("qualifiedComplexTypeName", 70, 426, 4),
        /** id = <code>69</code>, name = <code>"qualifiedEntityTypeName"</code> */
        QUALIFIEDENTITYTYPENAME("qualifiedEntityTypeName", 69, 422, 4),
        /** id = <code>71</code>, name = <code>"qualifiedEnumerationTypeName"</code> */
        QUALIFIEDENUMERATIONTYPENAME("qualifiedEnumerationTypeName", 71, 430, 4),
        /** id = <code>114</code>, name = <code>"qualifiedFunctionName"</code> */
        QUALIFIEDFUNCTIONNAME("qualifiedFunctionName", 114, 562, 7),
        /** id = <code>68</code>, name = <code>"qualifiedTypeName"</code> */
        QUALIFIEDTYPENAME("qualifiedTypeName", 68, 409, 13),
        /** id = <code>4</code>, name = <code>"queryOption"</code> */
        QUERYOPTION("queryOption", 4, 32, 6),
        /** id = <code>3</code>, name = <code>"queryOptions"</code> */
        QUERYOPTIONS("queryOptions", 3, 26, 6),
        /** id = <code>298</code>, name = <code>"quotation-mark"</code> */
        QUOTATION_MARK("quotation-mark", 298, 2183, 1),
        /** id = <code>24</code>, name = <code>"reg-name"</code> */
        REG_NAME("reg-name", 24, 215, 5),
        /** id = <code>266</code>, name = <code>"replaceMethodCallExpr"</code> */
        REPLACEMETHODCALLEXPR("replaceMethodCallExpr", 266, 1871, 23),
        /** id = <code>175</code>, name = <code>"resourcePath"</code> */
        RESOURCEPATH("resourcePath", 175, 1018, 56),
        /** id = <code>282</code>, name = <code>"roundMethodCallExpr"</code> */
        ROUNDMETHODCALLEXPR("roundMethodCallExpr", 282, 2095, 11),
        /** id = <code>152</code>, name = <code>"sbyte"</code> */
        SBYTE("sbyte", 152, 777, 5),
        /** id = <code>14</code>, name = <code>"scheme"</code> */
        SCHEME("scheme", 14, 60, 9),
        /** id = <code>55</code>, name = <code>"second"</code> */
        SECOND("second", 55, 374, 1),
        /** id = <code>281</code>, name = <code>"secondMethodCallExpr"</code> */
        SECONDMETHODCALLEXPR("secondMethodCallExpr", 281, 2084, 11),
        /** id = <code>25</code>, name = <code>"segment-nz"</code> */
        SEGMENT_NZ("segment-nz", 25, 220, 2),
        /** id = <code>168</code>, name = <code>"select"</code> */
        SELECT("select", 168, 932, 3),
        /** id = <code>169</code>, name = <code>"selectClause"</code> */
        SELECTCLAUSE("selectClause", 169, 935, 6),
        /** id = <code>170</code>, name = <code>"selectItem"</code> */
        SELECTITEM("selectItem", 170, 941, 18),
        /** id = <code>225</code>, name = <code>"serviceOpParameterName"</code> */
        SERVICEOPPARAMETERNAME("serviceOpParameterName", 225, 1444, 1),
        /** id = <code>1</code>, name = <code>"serviceRoot"</code> */
        SERVICEROOT("serviceRoot", 1, 14, 6),
        /** id = <code>38</code>, name = <code>"sign"</code> */
        SIGN("sign", 38, 295, 3),
        /** id = <code>185</code>, name = <code>"simpleKey"</code> */
        SIMPLEKEY("simpleKey", 185, 1223, 4),
        /** id = <code>131</code>, name = <code>"single"</code> */
        SINGLE("single", 131, 721, 4),
        /** id = <code>130</code>, name = <code>"singleBody"</code> */
        SINGLEBODY("singleBody", 130, 710, 11),
        /** id = <code>177</code>, name = <code>"singleNavigation"</code> */
        SINGLENAVIGATION("singleNavigation", 177, 1110, 31),
        /** id = <code>256</code>, name = <code>"singleNavigationExpr"</code> */
        SINGLENAVIGATIONEXPR("singleNavigationExpr", 256, 1734, 25),
        /** id = <code>164</code>, name = <code>"skip"</code> */
        SKIP("skip", 164, 909, 4),
        /** id = <code>171</code>, name = <code>"skiptoken"</code> */
        SKIPTOKEN("skiptoken", 171, 959, 4),
        /** id = <code>226</code>, name = <code>"sopParameterNameAndValue"</code> */
        SOPPARAMETERNAMEANDVALUE("sopParameterNameAndValue", 226, 1445, 4),
        /** id = <code>8</code>, name = <code>"SP"</code> */
        SP("SP", 8, 50, 1),
        /** id = <code>36</code>, name = <code>"SQUOTE"</code> */
        SQUOTE("SQUOTE", 36, 293, 1),
        /** id = <code>154</code>, name = <code>"SQUOTE-in-string"</code> */
        SQUOTE_IN_STRING("SQUOTE-in-string", 154, 790, 3),
        /** id = <code>43</code>, name = <code>"star"</code> */
        STAR("star", 43, 302, 1),
        /** id = <code>267</code>, name = <code>"startsWithMethodCallExpr"</code> */
        STARTSWITHMETHODCALLEXPR("startsWithMethodCallExpr", 267, 1894, 17),
        /** id = <code>80</code>, name = <code>"streamProperty"</code> */
        STREAMPROPERTY("streamProperty", 80, 480, 1),
        /** id = <code>182</code>, name = <code>"streamPropertyPath"</code> */
        STREAMPROPERTYPATH("streamPropertyPath", 182, 1212, 7),
        /** id = <code>153</code>, name = <code>"string"</code> */
        STRING("string", 153, 782, 8),
        /** id = <code>29</code>, name = <code>"sub-delims"</code> */
        SUB_DELIMS("sub-delims", 29, 239, 12),
        /** id = <code>242</code>, name = <code>"subExpr"</code> */
        SUBEXPR("subExpr", 242, 1564, 6),
        /** id = <code>271</code>, name = <code>"substringMethodCallExpr"</code> */
        SUBSTRINGMETHODCALLEXPR("substringMethodCallExpr", 271, 1944, 25),
        /** id = <code>272</code>, name = <code>"substringOfMethodCallExpr"</code> */
        SUBSTRINGOFMETHODCALLEXPR("substringOfMethodCallExpr", 272, 1969, 19),
        /** id = <code>156</code>, name = <code>"systemQueryOption"</code> */
        SYSTEMQUERYOPTION("systemQueryOption", 156, 838, 10),
        /** id = <code>155</code>, name = <code>"time"</code> */
        TIME("time", 155, 793, 45),
        /** id = <code>268</code>, name = <code>"toLowerMethodCallExpr"</code> */
        TOLOWERMETHODCALLEXPR("toLowerMethodCallExpr", 268, 1911, 11),
        /** id = <code>165</code>, name = <code>"top"</code> */
        TOP("top", 165, 913, 4),
        /** id = <code>269</code>, name = <code>"toUpperMethodCallExpr"</code> */
        TOUPPERMETHODCALLEXPR("toUpperMethodCallExpr", 269, 1922, 11),
        /** id = <code>270</code>, name = <code>"trimMethodCallExpr"</code> */
        TRIMMETHODCALLEXPR("trimMethodCallExpr", 270, 1933, 11),
        /** id = <code>216</code>, name = <code>"typeNVPInVJSON"</code> */
        TYPENVPINVJSON("typeNVPInVJSON", 216, 1378, 8),
        /** id = <code>28</code>, name = <code>"unreserved"</code> */
        UNRESERVED("unreserved", 28, 232, 7),
        /** id = <code>31</code>, name = <code>"UTF8-1"</code> */
        UTF8_1("UTF8-1", 31, 256, 1),
        /** id = <code>32</code>, name = <code>"UTF8-2"</code> */
        UTF8_2("UTF8-2", 32, 257, 3),
        /** id = <code>33</code>, name = <code>"UTF8-3"</code> */
        UTF8_3("UTF8-3", 33, 260, 17),
        /** id = <code>34</code>, name = <code>"UTF8-4"</code> */
        UTF8_4("UTF8-4", 34, 277, 15),
        /** id = <code>30</code>, name = <code>"UTF8-char"</code> */
        UTF8_CHAR("UTF8-char", 30, 251, 5),
        /** id = <code>35</code>, name = <code>"UTF8-tail"</code> */
        UTF8_TAIL("UTF8-tail", 35, 292, 1),
        /** id = <code>183</code>, name = <code>"value"</code> */
        VALUE("value", 183, 1219, 1),
        /** id = <code>41</code>, name = <code>"value-separator"</code> */
        VALUE_SEPARATOR("value-separator", 41, 300, 1),
        /** id = <code>110</code>, name = <code>"voidAction"</code> */
        VOIDACTION("voidAction", 110, 542, 1),
        /** id = <code>10</code>, name = <code>"WSP"</code> */
        WSP("WSP", 10, 52, 3),
        /** id = <code>50</code>, name = <code>"year"</code> */
        YEAR("year", 50, 337, 2),
        /** id = <code>276</code>, name = <code>"yearMethodCallExpr"</code> */
        YEARMETHODCALLEXPR("yearMethodCallExpr", 276, 2029, 11),
        /** id = <code>49</code>, name = <code>"zeroToFiftyNine"</code> */
        ZEROTOFIFTYNINE("zeroToFiftyNine", 49, 328, 9);
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
    	Rule[] rules = new Rule[299];
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
    	Opcode[] op = new Opcode[2184];
        {int[] a = {1,2,3,4,8,9}; op[0] = getOpcodeCat(a);}
        op[1] = getOpcodeRnm(14, 60); // scheme
        {char[] a = {58,47,47}; op[2] = getOpcodeTls(a);}
        op[3] = getOpcodeRnm(15, 69); // host
        op[4] = getOpcodeRep((char)0, (char)1, 5);
        {int[] a = {6,7}; op[5] = getOpcodeCat(a);}
        {char[] a = {58}; op[6] = getOpcodeTls(a);}
        op[7] = getOpcodeRnm(16, 73); // port
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
        op[18] = getOpcodeRnm(25, 220); // segment-nz
        {char[] a = {47}; op[19] = getOpcodeTls(a);}
        {int[] a = {21,22}; op[20] = getOpcodeCat(a);}
        op[21] = getOpcodeRnm(175, 1018); // resourcePath
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
        {int[] a = {33,34,35,36,37}; op[32] = getOpcodeAlt(a);}
        op[33] = getOpcodeRnm(156, 838); // systemQueryOption
        op[34] = getOpcodeRnm(172, 963); // customQueryOption
        op[35] = getOpcodeRnm(226, 1445); // sopParameterNameAndValue
        op[36] = getOpcodeRnm(209, 1317); // aliasAndValue
        op[37] = getOpcodeRnm(210, 1321); // parameterNameAndValue
        {int[] a = {39,40}; op[38] = getOpcodeAlt(a);}
        op[39] = getOpcodeTrg((char)65, (char)90);
        op[40] = getOpcodeTrg((char)97, (char)122);
        op[41] = getOpcodeTrg((char)48, (char)57);
        {int[] a = {43,44,45,46,47,48,49}; op[42] = getOpcodeAlt(a);}
        op[43] = getOpcodeRnm(6, 41); // DIGIT
        {char[] a = {65}; op[44] = getOpcodeTls(a);}
        {char[] a = {66}; op[45] = getOpcodeTls(a);}
        {char[] a = {67}; op[46] = getOpcodeTls(a);}
        {char[] a = {68}; op[47] = getOpcodeTls(a);}
        {char[] a = {69}; op[48] = getOpcodeTls(a);}
        {char[] a = {70}; op[49] = getOpcodeTls(a);}
        {char[] a = {32}; op[50] = getOpcodeTbs(a);}
        {char[] a = {9}; op[51] = getOpcodeTbs(a);}
        {int[] a = {53,54}; op[52] = getOpcodeAlt(a);}
        op[53] = getOpcodeRnm(8, 50); // SP
        op[54] = getOpcodeRnm(9, 51); // HTAB
        {char[] a = {13}; op[55] = getOpcodeTbs(a);}
        {char[] a = {10}; op[56] = getOpcodeTbs(a);}
        {int[] a = {58,59}; op[57] = getOpcodeCat(a);}
        op[58] = getOpcodeRnm(11, 55); // CR
        op[59] = getOpcodeRnm(12, 56); // LF
        {int[] a = {61,62}; op[60] = getOpcodeCat(a);}
        op[61] = getOpcodeRnm(5, 38); // ALPHA
        op[62] = getOpcodeRep((char)0, Character.MAX_VALUE, 63);
        {int[] a = {64,65,66,67,68}; op[63] = getOpcodeAlt(a);}
        op[64] = getOpcodeRnm(5, 38); // ALPHA
        op[65] = getOpcodeRnm(6, 41); // DIGIT
        {char[] a = {43}; op[66] = getOpcodeTls(a);}
        {char[] a = {45}; op[67] = getOpcodeTls(a);}
        {char[] a = {46}; op[68] = getOpcodeTls(a);}
        {int[] a = {70,71,72}; op[69] = getOpcodeAlt(a);}
        op[70] = getOpcodeRnm(17, 75); // IP-literal
        op[71] = getOpcodeRnm(22, 191); // IPv4address
        op[72] = getOpcodeRnm(24, 215); // reg-name
        op[73] = getOpcodeRep((char)0, Character.MAX_VALUE, 74);
        op[74] = getOpcodeRnm(6, 41); // DIGIT
        {int[] a = {76,77,80}; op[75] = getOpcodeCat(a);}
        {char[] a = {91}; op[76] = getOpcodeTls(a);}
        {int[] a = {78,79}; op[77] = getOpcodeAlt(a);}
        op[78] = getOpcodeRnm(19, 91); // IPv6address
        op[79] = getOpcodeRnm(18, 81); // IPvFuture
        {char[] a = {93}; op[80] = getOpcodeTls(a);}
        {int[] a = {82,83,85,86}; op[81] = getOpcodeCat(a);}
        {char[] a = {118}; op[82] = getOpcodeTls(a);}
        op[83] = getOpcodeRep((char)1, Character.MAX_VALUE, 84);
        op[84] = getOpcodeRnm(7, 42); // HEXDIG
        {char[] a = {46}; op[85] = getOpcodeTls(a);}
        op[86] = getOpcodeRep((char)1, Character.MAX_VALUE, 87);
        {int[] a = {88,89,90}; op[87] = getOpcodeAlt(a);}
        op[88] = getOpcodeRnm(28, 232); // unreserved
        op[89] = getOpcodeRnm(29, 239); // sub-delims
        {char[] a = {58}; op[90] = getOpcodeTls(a);}
        {int[] a = {92,98,105,114,128,142,154,164,174}; op[91] = getOpcodeAlt(a);}
        {int[] a = {93,97}; op[92] = getOpcodeCat(a);}
        op[93] = getOpcodeRep((char)6, (char)6, 94);
        {int[] a = {95,96}; op[94] = getOpcodeCat(a);}
        op[95] = getOpcodeRnm(20, 183); // h16
        {char[] a = {58}; op[96] = getOpcodeTls(a);}
        op[97] = getOpcodeRnm(21, 185); // ls32
        {int[] a = {99,100,104}; op[98] = getOpcodeCat(a);}
        {char[] a = {58,58}; op[99] = getOpcodeTls(a);}
        op[100] = getOpcodeRep((char)5, (char)5, 101);
        {int[] a = {102,103}; op[101] = getOpcodeCat(a);}
        op[102] = getOpcodeRnm(20, 183); // h16
        {char[] a = {58}; op[103] = getOpcodeTls(a);}
        op[104] = getOpcodeRnm(21, 185); // ls32
        {int[] a = {106,108,109,113}; op[105] = getOpcodeCat(a);}
        op[106] = getOpcodeRep((char)0, (char)1, 107);
        op[107] = getOpcodeRnm(20, 183); // h16
        {char[] a = {58,58}; op[108] = getOpcodeTls(a);}
        op[109] = getOpcodeRep((char)4, (char)4, 110);
        {int[] a = {111,112}; op[110] = getOpcodeCat(a);}
        op[111] = getOpcodeRnm(20, 183); // h16
        {char[] a = {58}; op[112] = getOpcodeTls(a);}
        op[113] = getOpcodeRnm(21, 185); // ls32
        {int[] a = {115,122,123,127}; op[114] = getOpcodeCat(a);}
        op[115] = getOpcodeRep((char)0, (char)1, 116);
        {int[] a = {117,121}; op[116] = getOpcodeCat(a);}
        op[117] = getOpcodeRep((char)0, (char)1, 118);
        {int[] a = {119,120}; op[118] = getOpcodeCat(a);}
        op[119] = getOpcodeRnm(20, 183); // h16
        {char[] a = {58}; op[120] = getOpcodeTls(a);}
        op[121] = getOpcodeRnm(20, 183); // h16
        {char[] a = {58,58}; op[122] = getOpcodeTls(a);}
        op[123] = getOpcodeRep((char)3, (char)3, 124);
        {int[] a = {125,126}; op[124] = getOpcodeCat(a);}
        op[125] = getOpcodeRnm(20, 183); // h16
        {char[] a = {58}; op[126] = getOpcodeTls(a);}
        op[127] = getOpcodeRnm(21, 185); // ls32
        {int[] a = {129,136,137,141}; op[128] = getOpcodeCat(a);}
        op[129] = getOpcodeRep((char)0, (char)1, 130);
        {int[] a = {131,135}; op[130] = getOpcodeCat(a);}
        op[131] = getOpcodeRep((char)0, (char)2, 132);
        {int[] a = {133,134}; op[132] = getOpcodeCat(a);}
        op[133] = getOpcodeRnm(20, 183); // h16
        {char[] a = {58}; op[134] = getOpcodeTls(a);}
        op[135] = getOpcodeRnm(20, 183); // h16
        {char[] a = {58,58}; op[136] = getOpcodeTls(a);}
        op[137] = getOpcodeRep((char)2, (char)2, 138);
        {int[] a = {139,140}; op[138] = getOpcodeCat(a);}
        op[139] = getOpcodeRnm(20, 183); // h16
        {char[] a = {58}; op[140] = getOpcodeTls(a);}
        op[141] = getOpcodeRnm(21, 185); // ls32
        {int[] a = {143,150,151,152,153}; op[142] = getOpcodeCat(a);}
        op[143] = getOpcodeRep((char)0, (char)1, 144);
        {int[] a = {145,149}; op[144] = getOpcodeCat(a);}
        op[145] = getOpcodeRep((char)0, (char)3, 146);
        {int[] a = {147,148}; op[146] = getOpcodeCat(a);}
        op[147] = getOpcodeRnm(20, 183); // h16
        {char[] a = {58}; op[148] = getOpcodeTls(a);}
        op[149] = getOpcodeRnm(20, 183); // h16
        {char[] a = {58,58}; op[150] = getOpcodeTls(a);}
        op[151] = getOpcodeRnm(20, 183); // h16
        {char[] a = {58}; op[152] = getOpcodeTls(a);}
        op[153] = getOpcodeRnm(21, 185); // ls32
        {int[] a = {155,162,163}; op[154] = getOpcodeCat(a);}
        op[155] = getOpcodeRep((char)0, (char)1, 156);
        {int[] a = {157,161}; op[156] = getOpcodeCat(a);}
        op[157] = getOpcodeRep((char)0, (char)4, 158);
        {int[] a = {159,160}; op[158] = getOpcodeCat(a);}
        op[159] = getOpcodeRnm(20, 183); // h16
        {char[] a = {58}; op[160] = getOpcodeTls(a);}
        op[161] = getOpcodeRnm(20, 183); // h16
        {char[] a = {58,58}; op[162] = getOpcodeTls(a);}
        op[163] = getOpcodeRnm(21, 185); // ls32
        {int[] a = {165,172,173}; op[164] = getOpcodeCat(a);}
        op[165] = getOpcodeRep((char)0, (char)1, 166);
        {int[] a = {167,171}; op[166] = getOpcodeCat(a);}
        op[167] = getOpcodeRep((char)0, (char)5, 168);
        {int[] a = {169,170}; op[168] = getOpcodeCat(a);}
        op[169] = getOpcodeRnm(20, 183); // h16
        {char[] a = {58}; op[170] = getOpcodeTls(a);}
        op[171] = getOpcodeRnm(20, 183); // h16
        {char[] a = {58,58}; op[172] = getOpcodeTls(a);}
        op[173] = getOpcodeRnm(20, 183); // h16
        {int[] a = {175,182}; op[174] = getOpcodeCat(a);}
        op[175] = getOpcodeRep((char)0, (char)1, 176);
        {int[] a = {177,181}; op[176] = getOpcodeCat(a);}
        op[177] = getOpcodeRep((char)0, (char)6, 178);
        {int[] a = {179,180}; op[178] = getOpcodeCat(a);}
        op[179] = getOpcodeRnm(20, 183); // h16
        {char[] a = {58}; op[180] = getOpcodeTls(a);}
        op[181] = getOpcodeRnm(20, 183); // h16
        {char[] a = {58,58}; op[182] = getOpcodeTls(a);}
        op[183] = getOpcodeRep((char)1, (char)4, 184);
        op[184] = getOpcodeRnm(7, 42); // HEXDIG
        {int[] a = {186,190}; op[185] = getOpcodeAlt(a);}
        {int[] a = {187,188,189}; op[186] = getOpcodeCat(a);}
        op[187] = getOpcodeRnm(20, 183); // h16
        {char[] a = {58}; op[188] = getOpcodeTls(a);}
        op[189] = getOpcodeRnm(20, 183); // h16
        op[190] = getOpcodeRnm(22, 191); // IPv4address
        {int[] a = {192,193,194,195,196,197,198}; op[191] = getOpcodeCat(a);}
        op[192] = getOpcodeRnm(23, 199); // dec-octet
        {char[] a = {46}; op[193] = getOpcodeTls(a);}
        op[194] = getOpcodeRnm(23, 199); // dec-octet
        {char[] a = {46}; op[195] = getOpcodeTls(a);}
        op[196] = getOpcodeRnm(23, 199); // dec-octet
        {char[] a = {46}; op[197] = getOpcodeTls(a);}
        op[198] = getOpcodeRnm(23, 199); // dec-octet
        {int[] a = {200,204,208,211,214}; op[199] = getOpcodeAlt(a);}
        {int[] a = {201,202}; op[200] = getOpcodeCat(a);}
        {char[] a = {49}; op[201] = getOpcodeTls(a);}
        op[202] = getOpcodeRep((char)2, (char)2, 203);
        op[203] = getOpcodeRnm(6, 41); // DIGIT
        {int[] a = {205,206,207}; op[204] = getOpcodeCat(a);}
        {char[] a = {50}; op[205] = getOpcodeTls(a);}
        op[206] = getOpcodeTrg((char)48, (char)52);
        op[207] = getOpcodeRnm(6, 41); // DIGIT
        {int[] a = {209,210}; op[208] = getOpcodeCat(a);}
        {char[] a = {50,53}; op[209] = getOpcodeTls(a);}
        op[210] = getOpcodeTrg((char)48, (char)53);
        {int[] a = {212,213}; op[211] = getOpcodeCat(a);}
        op[212] = getOpcodeTrg((char)49, (char)57);
        op[213] = getOpcodeRnm(6, 41); // DIGIT
        op[214] = getOpcodeRnm(6, 41); // DIGIT
        op[215] = getOpcodeRep((char)0, Character.MAX_VALUE, 216);
        {int[] a = {217,218,219}; op[216] = getOpcodeAlt(a);}
        op[217] = getOpcodeRnm(28, 232); // unreserved
        op[218] = getOpcodeRnm(27, 228); // pct-encoded
        op[219] = getOpcodeRnm(29, 239); // sub-delims
        op[220] = getOpcodeRep((char)1, Character.MAX_VALUE, 221);
        op[221] = getOpcodeRnm(26, 222); // pchar
        {int[] a = {223,224,225,226,227}; op[222] = getOpcodeAlt(a);}
        op[223] = getOpcodeRnm(28, 232); // unreserved
        op[224] = getOpcodeRnm(27, 228); // pct-encoded
        op[225] = getOpcodeRnm(29, 239); // sub-delims
        {char[] a = {58}; op[226] = getOpcodeTls(a);}
        {char[] a = {64}; op[227] = getOpcodeTls(a);}
        {int[] a = {229,230,231}; op[228] = getOpcodeCat(a);}
        {char[] a = {37}; op[229] = getOpcodeTls(a);}
        op[230] = getOpcodeRnm(7, 42); // HEXDIG
        op[231] = getOpcodeRnm(7, 42); // HEXDIG
        {int[] a = {233,234,235,236,237,238}; op[232] = getOpcodeAlt(a);}
        op[233] = getOpcodeRnm(5, 38); // ALPHA
        op[234] = getOpcodeRnm(6, 41); // DIGIT
        {char[] a = {45}; op[235] = getOpcodeTls(a);}
        {char[] a = {46}; op[236] = getOpcodeTls(a);}
        {char[] a = {95}; op[237] = getOpcodeTls(a);}
        {char[] a = {126}; op[238] = getOpcodeTls(a);}
        {int[] a = {240,241,242,243,244,245,246,247,248,249,250}; op[239] = getOpcodeAlt(a);}
        {char[] a = {33}; op[240] = getOpcodeTls(a);}
        {char[] a = {36}; op[241] = getOpcodeTls(a);}
        {char[] a = {38}; op[242] = getOpcodeTls(a);}
        {char[] a = {39}; op[243] = getOpcodeTls(a);}
        {char[] a = {40}; op[244] = getOpcodeTls(a);}
        {char[] a = {41}; op[245] = getOpcodeTls(a);}
        {char[] a = {42}; op[246] = getOpcodeTls(a);}
        {char[] a = {43}; op[247] = getOpcodeTls(a);}
        {char[] a = {44}; op[248] = getOpcodeTls(a);}
        {char[] a = {59}; op[249] = getOpcodeTls(a);}
        {char[] a = {61}; op[250] = getOpcodeTls(a);}
        {int[] a = {252,253,254,255}; op[251] = getOpcodeAlt(a);}
        op[252] = getOpcodeRnm(31, 256); // UTF8-1
        op[253] = getOpcodeRnm(32, 257); // UTF8-2
        op[254] = getOpcodeRnm(33, 260); // UTF8-3
        op[255] = getOpcodeRnm(34, 277); // UTF8-4
        op[256] = getOpcodeTrg((char)0, (char)127);
        {int[] a = {258,259}; op[257] = getOpcodeCat(a);}
        op[258] = getOpcodeTrg((char)194, (char)223);
        op[259] = getOpcodeRnm(35, 292); // UTF8-tail
        {int[] a = {261,265,269,273}; op[260] = getOpcodeAlt(a);}
        {int[] a = {262,263,264}; op[261] = getOpcodeCat(a);}
        {char[] a = {224}; op[262] = getOpcodeTbs(a);}
        op[263] = getOpcodeTrg((char)160, (char)191);
        op[264] = getOpcodeRnm(35, 292); // UTF8-tail
        {int[] a = {266,267}; op[265] = getOpcodeCat(a);}
        op[266] = getOpcodeTrg((char)225, (char)236);
        op[267] = getOpcodeRep((char)2, (char)2, 268);
        op[268] = getOpcodeRnm(35, 292); // UTF8-tail
        {int[] a = {270,271,272}; op[269] = getOpcodeCat(a);}
        {char[] a = {237}; op[270] = getOpcodeTbs(a);}
        op[271] = getOpcodeTrg((char)128, (char)159);
        op[272] = getOpcodeRnm(35, 292); // UTF8-tail
        {int[] a = {274,275}; op[273] = getOpcodeCat(a);}
        op[274] = getOpcodeTrg((char)238, (char)239);
        op[275] = getOpcodeRep((char)2, (char)2, 276);
        op[276] = getOpcodeRnm(35, 292); // UTF8-tail
        {int[] a = {278,283,287}; op[277] = getOpcodeAlt(a);}
        {int[] a = {279,280,281}; op[278] = getOpcodeCat(a);}
        {char[] a = {240}; op[279] = getOpcodeTbs(a);}
        op[280] = getOpcodeTrg((char)144, (char)191);
        op[281] = getOpcodeRep((char)2, (char)2, 282);
        op[282] = getOpcodeRnm(35, 292); // UTF8-tail
        {int[] a = {284,285}; op[283] = getOpcodeCat(a);}
        op[284] = getOpcodeTrg((char)241, (char)243);
        op[285] = getOpcodeRep((char)3, (char)3, 286);
        op[286] = getOpcodeRnm(35, 292); // UTF8-tail
        {int[] a = {288,289,290}; op[287] = getOpcodeCat(a);}
        {char[] a = {244}; op[288] = getOpcodeTbs(a);}
        op[289] = getOpcodeTrg((char)128, (char)143);
        op[290] = getOpcodeRep((char)2, (char)2, 291);
        op[291] = getOpcodeRnm(35, 292); // UTF8-tail
        op[292] = getOpcodeTrg((char)128, (char)191);
        {char[] a = {39}; op[293] = getOpcodeTbs(a);}
        {char[] a = {44}; op[294] = getOpcodeTbs(a);}
        {int[] a = {296,297}; op[295] = getOpcodeAlt(a);}
        {char[] a = {43}; op[296] = getOpcodeTls(a);}
        {char[] a = {45}; op[297] = getOpcodeTls(a);}
        {char[] a = {123}; op[298] = getOpcodeTls(a);}
        {char[] a = {125}; op[299] = getOpcodeTls(a);}
        op[300] = getOpcodeRnm(37, 294); // COMMA
        {char[] a = {58}; op[301] = getOpcodeTls(a);}
        {char[] a = {42}; op[302] = getOpcodeTls(a);}
        {int[] a = {304,305,306}; op[303] = getOpcodeCat(a);}
        {char[] a = {78}; op[304] = getOpcodeTbs(a);}
        {char[] a = {97}; op[305] = getOpcodeTbs(a);}
        {char[] a = {78}; op[306] = getOpcodeTbs(a);}
        {int[] a = {308,309,310}; op[307] = getOpcodeCat(a);}
        {char[] a = {73}; op[308] = getOpcodeTbs(a);}
        {char[] a = {78}; op[309] = getOpcodeTbs(a);}
        {char[] a = {70}; op[310] = getOpcodeTbs(a);}
        {int[] a = {312,313}; op[311] = getOpcodeCat(a);}
        {char[] a = {45}; op[312] = getOpcodeTls(a);}
        op[313] = getOpcodeRnm(45, 307); // positiveInfinity
        {int[] a = {315,316,317}; op[314] = getOpcodeAlt(a);}
        op[315] = getOpcodeRnm(44, 303); // nan
        op[316] = getOpcodeRnm(46, 311); // negativeInfinity
        op[317] = getOpcodeRnm(45, 307); // positiveInfinity
        {int[] a = {319,320,321,322,323,324,325,326,327}; op[318] = getOpcodeAlt(a);}
        {char[] a = {49}; op[319] = getOpcodeTls(a);}
        {char[] a = {50}; op[320] = getOpcodeTls(a);}
        {char[] a = {51}; op[321] = getOpcodeTls(a);}
        {char[] a = {52}; op[322] = getOpcodeTls(a);}
        {char[] a = {53}; op[323] = getOpcodeTls(a);}
        {char[] a = {54}; op[324] = getOpcodeTls(a);}
        {char[] a = {55}; op[325] = getOpcodeTls(a);}
        {char[] a = {56}; op[326] = getOpcodeTls(a);}
        {char[] a = {57}; op[327] = getOpcodeTls(a);}
        {int[] a = {329,336}; op[328] = getOpcodeCat(a);}
        {int[] a = {330,331,332,333,334,335}; op[329] = getOpcodeAlt(a);}
        {char[] a = {48}; op[330] = getOpcodeTls(a);}
        {char[] a = {49}; op[331] = getOpcodeTls(a);}
        {char[] a = {50}; op[332] = getOpcodeTls(a);}
        {char[] a = {51}; op[333] = getOpcodeTls(a);}
        {char[] a = {52}; op[334] = getOpcodeTls(a);}
        {char[] a = {53}; op[335] = getOpcodeTls(a);}
        op[336] = getOpcodeRnm(6, 41); // DIGIT
        op[337] = getOpcodeRep((char)4, (char)4, 338);
        op[338] = getOpcodeRnm(6, 41); // DIGIT
        {int[] a = {340,343}; op[339] = getOpcodeAlt(a);}
        {int[] a = {341,342}; op[340] = getOpcodeCat(a);}
        {char[] a = {48}; op[341] = getOpcodeTls(a);}
        op[342] = getOpcodeRnm(48, 318); // oneToNine
        {int[] a = {344,345}; op[343] = getOpcodeCat(a);}
        {char[] a = {49}; op[344] = getOpcodeTls(a);}
        {int[] a = {346,347,348}; op[345] = getOpcodeAlt(a);}
        {char[] a = {48}; op[346] = getOpcodeTls(a);}
        {char[] a = {49}; op[347] = getOpcodeTls(a);}
        {char[] a = {50}; op[348] = getOpcodeTls(a);}
        {int[] a = {350,356}; op[349] = getOpcodeAlt(a);}
        {int[] a = {351,355}; op[350] = getOpcodeCat(a);}
        {int[] a = {352,353,354}; op[351] = getOpcodeAlt(a);}
        {char[] a = {48}; op[352] = getOpcodeTls(a);}
        {char[] a = {49}; op[353] = getOpcodeTls(a);}
        {char[] a = {50}; op[354] = getOpcodeTls(a);}
        op[355] = getOpcodeRnm(48, 318); // oneToNine
        {int[] a = {357,358}; op[356] = getOpcodeCat(a);}
        {char[] a = {51}; op[357] = getOpcodeTls(a);}
        {int[] a = {359,360}; op[358] = getOpcodeAlt(a);}
        {char[] a = {48}; op[359] = getOpcodeTls(a);}
        {char[] a = {49}; op[360] = getOpcodeTls(a);}
        {int[] a = {362,367}; op[361] = getOpcodeAlt(a);}
        {int[] a = {363,366}; op[362] = getOpcodeCat(a);}
        {int[] a = {364,365}; op[363] = getOpcodeAlt(a);}
        {char[] a = {48}; op[364] = getOpcodeTls(a);}
        {char[] a = {49}; op[365] = getOpcodeTls(a);}
        op[366] = getOpcodeRnm(6, 41); // DIGIT
        {int[] a = {368,369}; op[367] = getOpcodeCat(a);}
        {char[] a = {50}; op[368] = getOpcodeTls(a);}
        {int[] a = {370,371,372}; op[369] = getOpcodeAlt(a);}
        {char[] a = {49}; op[370] = getOpcodeTls(a);}
        {char[] a = {50}; op[371] = getOpcodeTls(a);}
        {char[] a = {51}; op[372] = getOpcodeTls(a);}
        op[373] = getOpcodeRnm(49, 328); // zeroToFiftyNine
        op[374] = getOpcodeRnm(49, 328); // zeroToFiftyNine
        op[375] = getOpcodeRep((char)1, Character.MAX_VALUE, 376);
        op[376] = getOpcodeRnm(6, 41); // DIGIT
        {int[] a = {378,379}; op[377] = getOpcodeCat(a);}
        op[378] = getOpcodeRnm(58, 381); // identifierLeadingCharacter
        op[379] = getOpcodeRep((char)0, (char)478, 380);
        op[380] = getOpcodeRnm(59, 384); // identifierCharacter
        {int[] a = {382,383}; op[381] = getOpcodeAlt(a);}
        op[382] = getOpcodeRnm(5, 38); // ALPHA
        {char[] a = {95}; op[383] = getOpcodeTls(a);}
        {int[] a = {385,386,387}; op[384] = getOpcodeAlt(a);}
        op[385] = getOpcodeRnm(5, 38); // ALPHA
        op[386] = getOpcodeRnm(6, 41); // DIGIT
        {char[] a = {95}; op[387] = getOpcodeTls(a);}
        op[388] = getOpcodeRnm(57, 377); // odataIdentifier
        {int[] a = {390,391}; op[389] = getOpcodeCat(a);}
        op[390] = getOpcodeRnm(60, 388); // namespacePart
        op[391] = getOpcodeRep((char)0, Character.MAX_VALUE, 392);
        {int[] a = {393,394}; op[392] = getOpcodeCat(a);}
        {char[] a = {46}; op[393] = getOpcodeTls(a);}
        op[394] = getOpcodeRnm(60, 388); // namespacePart
        op[395] = getOpcodeRnm(57, 377); // odataIdentifier
        op[396] = getOpcodeRnm(57, 377); // odataIdentifier
        op[397] = getOpcodeRnm(57, 377); // odataIdentifier
        op[398] = getOpcodeRnm(57, 377); // odataIdentifier
        {int[] a = {400,404,405}; op[399] = getOpcodeCat(a);}
        op[400] = getOpcodeRep((char)0, (char)1, 401);
        {int[] a = {402,403}; op[401] = getOpcodeCat(a);}
        op[402] = getOpcodeRnm(61, 389); // namespace
        {char[] a = {46}; op[403] = getOpcodeTls(a);}
        op[404] = getOpcodeRnm(82, 488); // entityContainerName
        {char[] a = {46}; op[405] = getOpcodeTls(a);}
        {int[] a = {407,408}; op[406] = getOpcodeCat(a);}
        op[407] = getOpcodeRnm(66, 399); // operationQualifier
        {char[] a = {42}; op[408] = getOpcodeTls(a);}
        {int[] a = {410,411,412,413,414}; op[409] = getOpcodeAlt(a);}
        op[410] = getOpcodeRnm(69, 422); // qualifiedEntityTypeName
        op[411] = getOpcodeRnm(70, 426); // qualifiedComplexTypeName
        op[412] = getOpcodeRnm(71, 430); // qualifiedEnumerationTypeName
        op[413] = getOpcodeRnm(72, 434); // primitiveTypeName
        {int[] a = {415,416,421}; op[414] = getOpcodeCat(a);}
        {char[] a = {99,111,108,108,101,99,116,105,111,110,40}; op[415] = getOpcodeTls(a);}
        {int[] a = {417,418,419,420}; op[416] = getOpcodeAlt(a);}
        op[417] = getOpcodeRnm(69, 422); // qualifiedEntityTypeName
        op[418] = getOpcodeRnm(70, 426); // qualifiedComplexTypeName
        op[419] = getOpcodeRnm(71, 430); // qualifiedEnumerationTypeName
        op[420] = getOpcodeRnm(72, 434); // primitiveTypeName
        {char[] a = {41}; op[421] = getOpcodeTls(a);}
        {int[] a = {423,424,425}; op[422] = getOpcodeCat(a);}
        op[423] = getOpcodeRnm(61, 389); // namespace
        {char[] a = {46}; op[424] = getOpcodeTls(a);}
        op[425] = getOpcodeRnm(63, 396); // entityTypeName
        {int[] a = {427,428,429}; op[426] = getOpcodeCat(a);}
        op[427] = getOpcodeRnm(61, 389); // namespace
        {char[] a = {46}; op[428] = getOpcodeTls(a);}
        op[429] = getOpcodeRnm(64, 397); // complexTypeName
        {int[] a = {431,432,433}; op[430] = getOpcodeCat(a);}
        op[431] = getOpcodeRnm(61, 389); // namespace
        {char[] a = {46}; op[432] = getOpcodeTls(a);}
        op[433] = getOpcodeRnm(65, 398); // enumerationTypeName
        {int[] a = {435,437}; op[434] = getOpcodeCat(a);}
        op[435] = getOpcodeRep((char)0, (char)1, 436);
        {char[] a = {101,100,109,46}; op[436] = getOpcodeTls(a);}
        {int[] a = {438,439,440,441,442,443,444,445,446,447,448,449,450,451,452,453,454,455,456}; op[437] = getOpcodeAlt(a);}
        {char[] a = {98,105,110,97,114,121}; op[438] = getOpcodeTls(a);}
        {char[] a = {98,111,111,108,101,97,110}; op[439] = getOpcodeTls(a);}
        {char[] a = {98,121,116,101}; op[440] = getOpcodeTls(a);}
        {char[] a = {100,97,116,101,116,105,109,101}; op[441] = getOpcodeTls(a);}
        {char[] a = {100,101,99,105,109,97,108}; op[442] = getOpcodeTls(a);}
        {char[] a = {100,111,117,98,108,101}; op[443] = getOpcodeTls(a);}
        {char[] a = {115,105,110,103,108,101}; op[444] = getOpcodeTls(a);}
        {char[] a = {102,108,111,97,116}; op[445] = getOpcodeTls(a);}
        {char[] a = {103,117,105,100}; op[446] = getOpcodeTls(a);}
        {char[] a = {105,110,116,49,54}; op[447] = getOpcodeTls(a);}
        {char[] a = {105,110,116,51,50}; op[448] = getOpcodeTls(a);}
        {char[] a = {105,110,116,54,52}; op[449] = getOpcodeTls(a);}
        {char[] a = {115,98,121,116,101}; op[450] = getOpcodeTls(a);}
        {char[] a = {115,116,114,105,110,103}; op[451] = getOpcodeTls(a);}
        {char[] a = {116,105,109,101}; op[452] = getOpcodeTls(a);}
        {char[] a = {100,97,116,101,116,105,109,101,111,102,102,115,101,116}; op[453] = getOpcodeTls(a);}
        {char[] a = {115,116,114,101,97,109}; op[454] = getOpcodeTls(a);}
        op[455] = getOpcodeRnm(73, 457); // concreteSpatialTypeName
        op[456] = getOpcodeRnm(74, 472); // abstractSpatialTypeName
        {int[] a = {458,459,460,461,462,463,464,465,466,467,468,469,470,471}; op[457] = getOpcodeAlt(a);}
        {char[] a = {112,111,105,110,116}; op[458] = getOpcodeTls(a);}
        {char[] a = {108,105,110,101,115,116,114,105,110,103}; op[459] = getOpcodeTls(a);}
        {char[] a = {112,111,108,121,103,111,110}; op[460] = getOpcodeTls(a);}
        {char[] a = {103,101,111,103,114,97,112,104,121,99,111,108,108,101,99,116,105,111,110}; op[461] = getOpcodeTls(a);}
        {char[] a = {109,117,108,116,105,112,111,105,110,116}; op[462] = getOpcodeTls(a);}
        {char[] a = {109,117,108,116,105,108,105,110,101,100,116,114,105,110,103}; op[463] = getOpcodeTls(a);}
        {char[] a = {109,117,108,116,105,112,111,108,121,103,111,110}; op[464] = getOpcodeTls(a);}
        {char[] a = {103,101,111,109,101,116,114,105,99,112,111,105,110,116}; op[465] = getOpcodeTls(a);}
        {char[] a = {103,101,111,109,101,116,114,105,99,108,105,110,101,115,116,114,105,110,103}; op[466] = getOpcodeTls(a);}
        {char[] a = {103,101,111,109,101,116,114,105,99,112,111,108,121,103,111,110}; op[467] = getOpcodeTls(a);}
        {char[] a = {103,101,111,109,101,116,114,121,99,111,108,108,101,99,116,105,111,110}; op[468] = getOpcodeTls(a);}
        {char[] a = {103,101,111,109,101,116,114,105,99,109,117,108,116,105,112,111,105,110,116}; op[469] = getOpcodeTls(a);}
        {char[] a = {103,101,111,109,101,116,114,105,99,109,117,108,116,105,108,105,110,101,115,116,114,105,110,103}; op[470] = getOpcodeTls(a);}
        {char[] a = {103,101,111,109,101,116,114,105,99,109,117,108,116,105,112,111,108,121,103,111,110}; op[471] = getOpcodeTls(a);}
        {int[] a = {473,474}; op[472] = getOpcodeAlt(a);}
        {char[] a = {103,101,111,103,114,97,112,104,121}; op[473] = getOpcodeTls(a);}
        {char[] a = {103,101,111,109,101,116,114,121}; op[474] = getOpcodeTls(a);}
        op[475] = getOpcodeRnm(57, 377); // odataIdentifier
        op[476] = getOpcodeRnm(57, 377); // odataIdentifier
        op[477] = getOpcodeRnm(57, 377); // odataIdentifier
        op[478] = getOpcodeRnm(57, 377); // odataIdentifier
        op[479] = getOpcodeRnm(57, 377); // odataIdentifier
        op[480] = getOpcodeRnm(57, 377); // odataIdentifier
        {int[] a = {482,483,484,485,486,487}; op[481] = getOpcodeAlt(a);}
        op[482] = getOpcodeRnm(75, 475); // primitiveKeyProperty
        op[483] = getOpcodeRnm(76, 476); // primitiveNonKeyProperty
        op[484] = getOpcodeRnm(77, 477); // primitiveColProperty
        op[485] = getOpcodeRnm(78, 478); // complexProperty
        op[486] = getOpcodeRnm(79, 479); // complexColProperty
        op[487] = getOpcodeRnm(80, 480); // streamProperty
        op[488] = getOpcodeRnm(57, 377); // odataIdentifier
        op[489] = getOpcodeRnm(57, 377); // odataIdentifier
        op[490] = getOpcodeRnm(57, 377); // odataIdentifier
        op[491] = getOpcodeRnm(57, 377); // odataIdentifier
        op[492] = getOpcodeRnm(57, 377); // odataIdentifier
        op[493] = getOpcodeRnm(57, 377); // odataIdentifier
        op[494] = getOpcodeRnm(57, 377); // odataIdentifier
        op[495] = getOpcodeRnm(57, 377); // odataIdentifier
        {int[] a = {497,498}; op[496] = getOpcodeAlt(a);}
        op[497] = getOpcodeRnm(88, 494); // entityNavigationProperty
        op[498] = getOpcodeRnm(89, 495); // entityColNavigationProperty
        op[499] = getOpcodeRnm(57, 377); // odataIdentifier
        op[500] = getOpcodeRnm(57, 377); // odataIdentifier
        op[501] = getOpcodeRnm(57, 377); // odataIdentifier
        op[502] = getOpcodeRnm(57, 377); // odataIdentifier
        op[503] = getOpcodeRnm(57, 377); // odataIdentifier
        op[504] = getOpcodeRnm(57, 377); // odataIdentifier
        {int[] a = {506,508}; op[505] = getOpcodeCat(a);}
        op[506] = getOpcodeRep((char)0, (char)1, 507);
        op[507] = getOpcodeRnm(66, 399); // operationQualifier
        op[508] = getOpcodeRnm(91, 499); // entityFunction
        {int[] a = {510,512}; op[509] = getOpcodeCat(a);}
        op[510] = getOpcodeRep((char)0, (char)1, 511);
        op[511] = getOpcodeRnm(66, 399); // operationQualifier
        op[512] = getOpcodeRnm(92, 500); // entityColFunction
        {int[] a = {514,516}; op[513] = getOpcodeCat(a);}
        op[514] = getOpcodeRep((char)0, (char)1, 515);
        op[515] = getOpcodeRnm(66, 399); // operationQualifier
        op[516] = getOpcodeRnm(93, 501); // complexFunction
        {int[] a = {518,520}; op[517] = getOpcodeCat(a);}
        op[518] = getOpcodeRep((char)0, (char)1, 519);
        op[519] = getOpcodeRnm(66, 399); // operationQualifier
        op[520] = getOpcodeRnm(94, 502); // complexColFunction
        {int[] a = {522,524}; op[521] = getOpcodeCat(a);}
        op[522] = getOpcodeRep((char)0, (char)1, 523);
        op[523] = getOpcodeRnm(66, 399); // operationQualifier
        op[524] = getOpcodeRnm(95, 503); // primitiveFunction
        {int[] a = {526,528}; op[525] = getOpcodeCat(a);}
        op[526] = getOpcodeRep((char)0, (char)1, 527);
        op[527] = getOpcodeRnm(66, 399); // operationQualifier
        op[528] = getOpcodeRnm(96, 504); // primitiveColFunction
        {int[] a = {530,531,532,533,534,535}; op[529] = getOpcodeAlt(a);}
        op[530] = getOpcodeRnm(97, 505); // fullEntityFunction
        op[531] = getOpcodeRnm(98, 509); // fullEntityColFunction
        op[532] = getOpcodeRnm(99, 513); // fullComplexFunction
        op[533] = getOpcodeRnm(100, 517); // fullComplexColFunction
        op[534] = getOpcodeRnm(101, 521); // fullPrimitiveFunction
        op[535] = getOpcodeRnm(102, 525); // fullPrimitiveColFunction
        op[536] = getOpcodeRnm(57, 377); // odataIdentifier
        op[537] = getOpcodeRnm(57, 377); // odataIdentifier
        op[538] = getOpcodeRnm(57, 377); // odataIdentifier
        op[539] = getOpcodeRnm(57, 377); // odataIdentifier
        op[540] = getOpcodeRnm(57, 377); // odataIdentifier
        op[541] = getOpcodeRnm(57, 377); // odataIdentifier
        op[542] = getOpcodeRnm(57, 377); // odataIdentifier
        {int[] a = {544,545,546,547,548,549,550}; op[543] = getOpcodeAlt(a);}
        op[544] = getOpcodeRnm(104, 536); // entityAction
        op[545] = getOpcodeRnm(105, 537); // entityColAction
        op[546] = getOpcodeRnm(106, 538); // complexAction
        op[547] = getOpcodeRnm(107, 539); // complexColAction
        op[548] = getOpcodeRnm(108, 540); // primitiveAction
        op[549] = getOpcodeRnm(109, 541); // primitiveColAction
        op[550] = getOpcodeRnm(110, 542); // voidAction
        {int[] a = {552,554}; op[551] = getOpcodeCat(a);}
        op[552] = getOpcodeRep((char)0, (char)1, 553);
        op[553] = getOpcodeRnm(66, 399); // operationQualifier
        op[554] = getOpcodeRnm(111, 543); // action
        {int[] a = {556,557}; op[555] = getOpcodeCat(a);}
        op[556] = getOpcodeRnm(112, 551); // fullAction
        op[557] = getOpcodeRep((char)0, (char)1, 558);
        {int[] a = {559,560,561}; op[558] = getOpcodeCat(a);}
        {char[] a = {40}; op[559] = getOpcodeTls(a);}
        op[560] = getOpcodeRnm(115, 569); // parameterTypeNames
        {char[] a = {41}; op[561] = getOpcodeTls(a);}
        {int[] a = {563,564}; op[562] = getOpcodeCat(a);}
        op[563] = getOpcodeRnm(103, 529); // fullFunction
        op[564] = getOpcodeRep((char)0, (char)1, 565);
        {int[] a = {566,567,568}; op[565] = getOpcodeCat(a);}
        {char[] a = {40}; op[566] = getOpcodeTls(a);}
        op[567] = getOpcodeRnm(115, 569); // parameterTypeNames
        {char[] a = {41}; op[568] = getOpcodeTls(a);}
        op[569] = getOpcodeRep((char)0, (char)1, 570);
        {int[] a = {571,572}; op[570] = getOpcodeCat(a);}
        op[571] = getOpcodeRnm(116, 576); // parameterTypeName
        op[572] = getOpcodeRep((char)0, Character.MAX_VALUE, 573);
        {int[] a = {574,575}; op[573] = getOpcodeCat(a);}
        {char[] a = {44}; op[574] = getOpcodeTls(a);}
        op[575] = getOpcodeRnm(116, 576); // parameterTypeName
        op[576] = getOpcodeRnm(68, 409); // qualifiedTypeName
        {int[] a = {578,579,580,581,582,583,584,585,586,587,588,589,590,591,592,593,594,595,596,597,598,599,600,601,602,603,604,605,606,607,608,609}; op[577] = getOpcodeAlt(a);}
        op[578] = getOpcodeRnm(118, 610); // null
        op[579] = getOpcodeRnm(126, 681); // decimal
        op[580] = getOpcodeRnm(131, 721); // single
        op[581] = getOpcodeRnm(129, 706); // double
        op[582] = getOpcodeRnm(152, 777); // sbyte
        op[583] = getOpcodeRnm(121, 636); // byte
        op[584] = getOpcodeRnm(149, 759); // int16
        op[585] = getOpcodeRnm(150, 764); // int32
        op[586] = getOpcodeRnm(151, 769); // int64
        op[587] = getOpcodeRnm(119, 620); // binary
        op[588] = getOpcodeRnm(122, 638); // dateTime
        op[589] = getOpcodeRnm(123, 643); // dateTimeOffset
        op[590] = getOpcodeRnm(148, 741); // guid
        op[591] = getOpcodeRnm(153, 782); // string
        op[592] = getOpcodeRnm(155, 793); // time
        op[593] = getOpcodeRnm(120, 629); // boolean
        op[594] = getOpcodeRnm(132, 725); // geography
        op[595] = getOpcodeRnm(133, 726); // geographyCollection
        op[596] = getOpcodeRnm(134, 727); // geographyLineString
        op[597] = getOpcodeRnm(135, 728); // geographyMultiLineString
        op[598] = getOpcodeRnm(136, 729); // geographyMultiPoint
        op[599] = getOpcodeRnm(137, 730); // geographyMultiPolygon
        op[600] = getOpcodeRnm(138, 731); // geographyPoint
        op[601] = getOpcodeRnm(139, 732); // geographyPolygon
        op[602] = getOpcodeRnm(140, 733); // geometry
        op[603] = getOpcodeRnm(141, 734); // geometryCollection
        op[604] = getOpcodeRnm(142, 735); // geometryLineString
        op[605] = getOpcodeRnm(143, 736); // geometryMultiLineString
        op[606] = getOpcodeRnm(144, 737); // geometryMultiPoint
        op[607] = getOpcodeRnm(145, 738); // geometryMultiPolygon
        op[608] = getOpcodeRnm(146, 739); // geometryPoint
        op[609] = getOpcodeRnm(147, 740); // geometryPolygon
        {int[] a = {611,612,613,614,615}; op[610] = getOpcodeCat(a);}
        {char[] a = {110}; op[611] = getOpcodeTbs(a);}
        {char[] a = {117}; op[612] = getOpcodeTbs(a);}
        {char[] a = {108}; op[613] = getOpcodeTbs(a);}
        {char[] a = {108}; op[614] = getOpcodeTbs(a);}
        op[615] = getOpcodeRep((char)0, (char)1, 616);
        {int[] a = {617,618,619}; op[616] = getOpcodeCat(a);}
        {char[] a = {39}; op[617] = getOpcodeTls(a);}
        op[618] = getOpcodeRnm(68, 409); // qualifiedTypeName
        {char[] a = {39}; op[619] = getOpcodeTls(a);}
        {int[] a = {621,624,625,628}; op[620] = getOpcodeCat(a);}
        {int[] a = {622,623}; op[621] = getOpcodeAlt(a);}
        {char[] a = {88}; op[622] = getOpcodeTbs(a);}
        {char[] a = {98,105,110,97,114,121}; op[623] = getOpcodeTls(a);}
        op[624] = getOpcodeRnm(36, 293); // SQUOTE
        op[625] = getOpcodeRep((char)0, Character.MAX_VALUE, 626);
        op[626] = getOpcodeRep((char)2, (char)2, 627);
        op[627] = getOpcodeRnm(7, 42); // HEXDIG
        op[628] = getOpcodeRnm(36, 293); // SQUOTE
        {int[] a = {630,633}; op[629] = getOpcodeAlt(a);}
        {int[] a = {631,632}; op[630] = getOpcodeAlt(a);}
        {char[] a = {116,114,117,101}; op[631] = getOpcodeTls(a);}
        {char[] a = {49}; op[632] = getOpcodeTls(a);}
        {int[] a = {634,635}; op[633] = getOpcodeAlt(a);}
        {char[] a = {102,97,108,115,101}; op[634] = getOpcodeTls(a);}
        {char[] a = {48}; op[635] = getOpcodeTls(a);}
        op[636] = getOpcodeRep((char)1, (char)3, 637);
        op[637] = getOpcodeRnm(6, 41); // DIGIT
        {int[] a = {639,640,641,642}; op[638] = getOpcodeCat(a);}
        {char[] a = {100,97,116,101,116,105,109,101}; op[639] = getOpcodeTls(a);}
        op[640] = getOpcodeRnm(36, 293); // SQUOTE
        op[641] = getOpcodeRnm(124, 648); // dateTimeBody
        op[642] = getOpcodeRnm(36, 293); // SQUOTE
        {int[] a = {644,645,646,647}; op[643] = getOpcodeCat(a);}
        {char[] a = {100,97,116,101,116,105,109,101,111,102,102,115,101,116}; op[644] = getOpcodeTls(a);}
        op[645] = getOpcodeRnm(36, 293); // SQUOTE
        op[646] = getOpcodeRnm(125, 672); // dateTimeOffsetBody
        op[647] = getOpcodeRnm(36, 293); // SQUOTE
        {int[] a = {649,650,651,652,653,654,655}; op[648] = getOpcodeCat(a);}
        op[649] = getOpcodeRnm(50, 337); // year
        {char[] a = {45}; op[650] = getOpcodeTls(a);}
        op[651] = getOpcodeRnm(51, 339); // month
        {char[] a = {45}; op[652] = getOpcodeTls(a);}
        op[653] = getOpcodeRnm(52, 349); // day
        {char[] a = {84}; op[654] = getOpcodeTls(a);}
        {int[] a = {656,668}; op[655] = getOpcodeAlt(a);}
        {int[] a = {657,658,659,660}; op[656] = getOpcodeCat(a);}
        op[657] = getOpcodeRnm(53, 361); // hour
        {char[] a = {58}; op[658] = getOpcodeTls(a);}
        op[659] = getOpcodeRnm(54, 373); // minute
        op[660] = getOpcodeRep((char)0, (char)1, 661);
        {int[] a = {662,663,664}; op[661] = getOpcodeCat(a);}
        {char[] a = {58}; op[662] = getOpcodeTls(a);}
        op[663] = getOpcodeRnm(55, 374); // second
        op[664] = getOpcodeRep((char)0, (char)1, 665);
        {int[] a = {666,667}; op[665] = getOpcodeCat(a);}
        {char[] a = {46}; op[666] = getOpcodeTls(a);}
        op[667] = getOpcodeRnm(56, 375); // fractionalSeconds
        {int[] a = {669,670}; op[668] = getOpcodeCat(a);}
        {char[] a = {50,52,58,48,48}; op[669] = getOpcodeTls(a);}
        op[670] = getOpcodeRep((char)0, (char)1, 671);
        {char[] a = {58,48,48}; op[671] = getOpcodeTls(a);}
        {int[] a = {673,674}; op[672] = getOpcodeCat(a);}
        op[673] = getOpcodeRnm(124, 648); // dateTimeBody
        {int[] a = {675,676}; op[674] = getOpcodeAlt(a);}
        {char[] a = {90}; op[675] = getOpcodeTls(a);}
        {int[] a = {677,678,679,680}; op[676] = getOpcodeCat(a);}
        op[677] = getOpcodeRnm(38, 295); // sign
        op[678] = getOpcodeRnm(53, 361); // hour
        {char[] a = {58}; op[679] = getOpcodeTls(a);}
        op[680] = getOpcodeRnm(54, 373); // minute
        {int[] a = {682,683}; op[681] = getOpcodeCat(a);}
        op[682] = getOpcodeRnm(127, 685); // decimalBody
        op[683] = getOpcodeRep((char)0, (char)1, 684);
        {char[] a = {77}; op[684] = getOpcodeTls(a);}
        {int[] a = {686,688,690}; op[685] = getOpcodeCat(a);}
        op[686] = getOpcodeRep((char)0, (char)1, 687);
        op[687] = getOpcodeRnm(38, 295); // sign
        op[688] = getOpcodeRep((char)1, Character.MAX_VALUE, 689);
        op[689] = getOpcodeRnm(6, 41); // DIGIT
        op[690] = getOpcodeRep((char)0, (char)1, 691);
        {int[] a = {692,693}; op[691] = getOpcodeCat(a);}
        {char[] a = {46}; op[692] = getOpcodeTls(a);}
        op[693] = getOpcodeRep((char)1, Character.MAX_VALUE, 694);
        op[694] = getOpcodeRnm(6, 41); // DIGIT
        {int[] a = {696,705}; op[695] = getOpcodeAlt(a);}
        {int[] a = {697,698}; op[696] = getOpcodeCat(a);}
        op[697] = getOpcodeRnm(127, 685); // decimalBody
        op[698] = getOpcodeRep((char)0, (char)1, 699);
        {int[] a = {700,701,703}; op[699] = getOpcodeCat(a);}
        {char[] a = {69}; op[700] = getOpcodeTls(a);}
        op[701] = getOpcodeRep((char)0, (char)1, 702);
        op[702] = getOpcodeRnm(38, 295); // sign
        op[703] = getOpcodeRep((char)1, Character.MAX_VALUE, 704);
        op[704] = getOpcodeRnm(6, 41); // DIGIT
        op[705] = getOpcodeRnm(47, 314); // nanInfinity
        {int[] a = {707,708}; op[706] = getOpcodeCat(a);}
        op[707] = getOpcodeRnm(128, 695); // doubleBody
        op[708] = getOpcodeRep((char)0, (char)1, 709);
        {char[] a = {68}; op[709] = getOpcodeTls(a);}
        {int[] a = {711,720}; op[710] = getOpcodeAlt(a);}
        {int[] a = {712,713}; op[711] = getOpcodeCat(a);}
        op[712] = getOpcodeRnm(127, 685); // decimalBody
        op[713] = getOpcodeRep((char)0, (char)1, 714);
        {int[] a = {715,716,718}; op[714] = getOpcodeCat(a);}
        {char[] a = {69}; op[715] = getOpcodeTls(a);}
        op[716] = getOpcodeRep((char)0, (char)1, 717);
        op[717] = getOpcodeRnm(38, 295); // sign
        op[718] = getOpcodeRep((char)1, Character.MAX_VALUE, 719);
        op[719] = getOpcodeRnm(6, 41); // DIGIT
        op[720] = getOpcodeRnm(47, 314); // nanInfinity
        {int[] a = {722,723}; op[721] = getOpcodeCat(a);}
        op[722] = getOpcodeRnm(130, 710); // singleBody
        op[723] = getOpcodeRep((char)0, (char)1, 724);
        {char[] a = {70}; op[724] = getOpcodeTls(a);}
        {char[] a = {123,84,79,68,79,49,125}; op[725] = getOpcodeTls(a);}
        {char[] a = {123,84,79,68,79,50,125}; op[726] = getOpcodeTls(a);}
        {char[] a = {123,84,79,68,79,51,125}; op[727] = getOpcodeTls(a);}
        {char[] a = {123,84,79,68,79,52,125}; op[728] = getOpcodeTls(a);}
        {char[] a = {123,84,79,68,79,53,125}; op[729] = getOpcodeTls(a);}
        {char[] a = {123,84,79,68,79,54,125}; op[730] = getOpcodeTls(a);}
        {char[] a = {123,84,79,68,79,55,125}; op[731] = getOpcodeTls(a);}
        {char[] a = {123,84,79,68,79,56,125}; op[732] = getOpcodeTls(a);}
        {char[] a = {123,84,79,68,79,57,125}; op[733] = getOpcodeTls(a);}
        {char[] a = {123,84,79,68,79,49,48,125}; op[734] = getOpcodeTls(a);}
        {char[] a = {123,84,79,68,79,49,49,125}; op[735] = getOpcodeTls(a);}
        {char[] a = {123,84,79,68,79,49,50,125}; op[736] = getOpcodeTls(a);}
        {char[] a = {123,84,79,68,79,49,51,125}; op[737] = getOpcodeTls(a);}
        {char[] a = {123,84,79,68,79,49,52,125}; op[738] = getOpcodeTls(a);}
        {char[] a = {123,84,79,68,79,49,53,125}; op[739] = getOpcodeTls(a);}
        {char[] a = {123,84,79,68,79,49,54,125}; op[740] = getOpcodeTls(a);}
        {int[] a = {742,743,744,746,747,749,750,752,753,755,756,758}; op[741] = getOpcodeCat(a);}
        {char[] a = {103,117,105,100}; op[742] = getOpcodeTls(a);}
        op[743] = getOpcodeRnm(36, 293); // SQUOTE
        op[744] = getOpcodeRep((char)8, (char)8, 745);
        op[745] = getOpcodeRnm(7, 42); // HEXDIG
        {char[] a = {45}; op[746] = getOpcodeTls(a);}
        op[747] = getOpcodeRep((char)4, (char)4, 748);
        op[748] = getOpcodeRnm(7, 42); // HEXDIG
        {char[] a = {45}; op[749] = getOpcodeTls(a);}
        op[750] = getOpcodeRep((char)4, (char)4, 751);
        op[751] = getOpcodeRnm(7, 42); // HEXDIG
        {char[] a = {45}; op[752] = getOpcodeTls(a);}
        op[753] = getOpcodeRep((char)4, (char)4, 754);
        op[754] = getOpcodeRnm(7, 42); // HEXDIG
        {char[] a = {45}; op[755] = getOpcodeTls(a);}
        op[756] = getOpcodeRep((char)12, (char)12, 757);
        op[757] = getOpcodeRnm(7, 42); // HEXDIG
        op[758] = getOpcodeRnm(36, 293); // SQUOTE
        {int[] a = {760,762}; op[759] = getOpcodeCat(a);}
        op[760] = getOpcodeRep((char)0, (char)1, 761);
        op[761] = getOpcodeRnm(38, 295); // sign
        op[762] = getOpcodeRep((char)1, (char)5, 763);
        op[763] = getOpcodeRnm(6, 41); // DIGIT
        {int[] a = {765,767}; op[764] = getOpcodeCat(a);}
        op[765] = getOpcodeRep((char)0, (char)1, 766);
        op[766] = getOpcodeRnm(38, 295); // sign
        op[767] = getOpcodeRep((char)1, (char)10, 768);
        op[768] = getOpcodeRnm(6, 41); // DIGIT
        {int[] a = {770,772,774}; op[769] = getOpcodeCat(a);}
        op[770] = getOpcodeRep((char)0, (char)1, 771);
        op[771] = getOpcodeRnm(38, 295); // sign
        op[772] = getOpcodeRep((char)1, (char)19, 773);
        op[773] = getOpcodeRnm(6, 41); // DIGIT
        {int[] a = {775,776}; op[774] = getOpcodeAlt(a);}
        {char[] a = {76}; op[775] = getOpcodeTls(a);}
        {char[] a = {108}; op[776] = getOpcodeTls(a);}
        {int[] a = {778,780}; op[777] = getOpcodeCat(a);}
        op[778] = getOpcodeRep((char)0, (char)1, 779);
        op[779] = getOpcodeRnm(38, 295); // sign
        op[780] = getOpcodeRep((char)1, (char)3, 781);
        op[781] = getOpcodeRnm(6, 41); // DIGIT
        {int[] a = {783,784,789}; op[782] = getOpcodeCat(a);}
        op[783] = getOpcodeRnm(36, 293); // SQUOTE
        op[784] = getOpcodeRep((char)0, Character.MAX_VALUE, 785);
        {int[] a = {786,787,788}; op[785] = getOpcodeAlt(a);}
        op[786] = getOpcodeRnm(28, 232); // unreserved
        op[787] = getOpcodeRnm(27, 228); // pct-encoded
        op[788] = getOpcodeRnm(154, 790); // SQUOTE-in-string
        op[789] = getOpcodeRnm(36, 293); // SQUOTE
        {int[] a = {791,792}; op[790] = getOpcodeCat(a);}
        op[791] = getOpcodeRnm(36, 293); // SQUOTE
        op[792] = getOpcodeRnm(36, 293); // SQUOTE
        {int[] a = {794,795,796,798,799,804,809,814,837}; op[793] = getOpcodeCat(a);}
        {char[] a = {116,105,109,101}; op[794] = getOpcodeTls(a);}
        op[795] = getOpcodeRnm(36, 293); // SQUOTE
        op[796] = getOpcodeRep((char)0, (char)1, 797);
        op[797] = getOpcodeRnm(38, 295); // sign
        {char[] a = {80}; op[798] = getOpcodeTls(a);}
        op[799] = getOpcodeRep((char)0, (char)1, 800);
        {int[] a = {801,803}; op[800] = getOpcodeCat(a);}
        op[801] = getOpcodeRep((char)1, Character.MAX_VALUE, 802);
        op[802] = getOpcodeRnm(6, 41); // DIGIT
        {char[] a = {89}; op[803] = getOpcodeTls(a);}
        op[804] = getOpcodeRep((char)0, (char)1, 805);
        {int[] a = {806,808}; op[805] = getOpcodeCat(a);}
        op[806] = getOpcodeRep((char)1, Character.MAX_VALUE, 807);
        op[807] = getOpcodeRnm(6, 41); // DIGIT
        {char[] a = {77}; op[808] = getOpcodeTls(a);}
        op[809] = getOpcodeRep((char)0, (char)1, 810);
        {int[] a = {811,813}; op[810] = getOpcodeCat(a);}
        op[811] = getOpcodeRep((char)1, Character.MAX_VALUE, 812);
        op[812] = getOpcodeRnm(6, 41); // DIGIT
        {char[] a = {68}; op[813] = getOpcodeTls(a);}
        op[814] = getOpcodeRep((char)0, (char)1, 815);
        {int[] a = {816,817,822,827}; op[815] = getOpcodeCat(a);}
        {char[] a = {84}; op[816] = getOpcodeTls(a);}
        op[817] = getOpcodeRep((char)0, (char)1, 818);
        {int[] a = {819,821}; op[818] = getOpcodeCat(a);}
        op[819] = getOpcodeRep((char)1, Character.MAX_VALUE, 820);
        op[820] = getOpcodeRnm(6, 41); // DIGIT
        {char[] a = {72}; op[821] = getOpcodeTls(a);}
        op[822] = getOpcodeRep((char)0, (char)1, 823);
        {int[] a = {824,826}; op[823] = getOpcodeCat(a);}
        op[824] = getOpcodeRep((char)1, Character.MAX_VALUE, 825);
        op[825] = getOpcodeRnm(6, 41); // DIGIT
        {char[] a = {77}; op[826] = getOpcodeTls(a);}
        op[827] = getOpcodeRep((char)0, (char)1, 828);
        {int[] a = {829,831,836}; op[828] = getOpcodeCat(a);}
        op[829] = getOpcodeRep((char)1, Character.MAX_VALUE, 830);
        op[830] = getOpcodeRnm(6, 41); // DIGIT
        op[831] = getOpcodeRep((char)0, (char)1, 832);
        {int[] a = {833,834}; op[832] = getOpcodeCat(a);}
        {char[] a = {46}; op[833] = getOpcodeTls(a);}
        op[834] = getOpcodeRep((char)1, Character.MAX_VALUE, 835);
        op[835] = getOpcodeRnm(6, 41); // DIGIT
        {char[] a = {83}; op[836] = getOpcodeTls(a);}
        op[837] = getOpcodeRnm(36, 293); // SQUOTE
        {int[] a = {839,840,841,842,843,844,845,846,847}; op[838] = getOpcodeAlt(a);}
        op[839] = getOpcodeRnm(157, 848); // expand
        op[840] = getOpcodeRnm(161, 872); // filter
        op[841] = getOpcodeRnm(162, 880); // orderby
        op[842] = getOpcodeRnm(164, 909); // skip
        op[843] = getOpcodeRnm(165, 913); // top
        op[844] = getOpcodeRnm(166, 917); // format
        op[845] = getOpcodeRnm(167, 927); // inlinecount
        op[846] = getOpcodeRnm(168, 932); // select
        op[847] = getOpcodeRnm(171, 959); // skiptoken
        {int[] a = {849,850}; op[848] = getOpcodeCat(a);}
        {char[] a = {36,101,120,112,97,110,100,61}; op[849] = getOpcodeTls(a);}
        op[850] = getOpcodeRnm(158, 851); // expandClause
        {int[] a = {852,853}; op[851] = getOpcodeCat(a);}
        op[852] = getOpcodeRnm(159, 857); // expandItem
        op[853] = getOpcodeRep((char)0, Character.MAX_VALUE, 854);
        {int[] a = {855,856}; op[854] = getOpcodeCat(a);}
        {char[] a = {44}; op[855] = getOpcodeTls(a);}
        op[856] = getOpcodeRnm(159, 857); // expandItem
        {int[] a = {858,862,863}; op[857] = getOpcodeCat(a);}
        op[858] = getOpcodeRep((char)0, (char)1, 859);
        {int[] a = {860,861}; op[859] = getOpcodeCat(a);}
        op[860] = getOpcodeRnm(69, 422); // qualifiedEntityTypeName
        {char[] a = {47}; op[861] = getOpcodeTls(a);}
        op[862] = getOpcodeRnm(90, 496); // navigationProperty
        op[863] = getOpcodeRep((char)0, Character.MAX_VALUE, 864);
        {int[] a = {865,869,870}; op[864] = getOpcodeCat(a);}
        op[865] = getOpcodeRep((char)0, (char)1, 866);
        {int[] a = {867,868}; op[866] = getOpcodeCat(a);}
        {char[] a = {47}; op[867] = getOpcodeTls(a);}
        op[868] = getOpcodeRnm(69, 422); // qualifiedEntityTypeName
        {char[] a = {47}; op[869] = getOpcodeTls(a);}
        op[870] = getOpcodeRnm(90, 496); // navigationProperty
        {char[] a = {47,36,99,111,117,110,116}; op[871] = getOpcodeTls(a);}
        {int[] a = {873,874,876,877,879}; op[872] = getOpcodeCat(a);}
        {char[] a = {36,102,105,108,116,101,114}; op[873] = getOpcodeTls(a);}
        op[874] = getOpcodeRep((char)0, (char)1, 875);
        op[875] = getOpcodeRnm(10, 52); // WSP
        {char[] a = {61}; op[876] = getOpcodeTls(a);}
        op[877] = getOpcodeRep((char)0, (char)1, 878);
        op[878] = getOpcodeRnm(10, 52); // WSP
        op[879] = getOpcodeRnm(228, 1469); // boolCommonExpr
        {int[] a = {881,882,884,885,887,888,890,894}; op[880] = getOpcodeCat(a);}
        {char[] a = {36,111,114,100,101,114,98,121}; op[881] = getOpcodeTls(a);}
        op[882] = getOpcodeRep((char)0, (char)1, 883);
        op[883] = getOpcodeRnm(10, 52); // WSP
        {char[] a = {61}; op[884] = getOpcodeTls(a);}
        op[885] = getOpcodeRep((char)0, (char)1, 886);
        op[886] = getOpcodeRnm(10, 52); // WSP
        op[887] = getOpcodeRnm(163, 906); // orderExpr
        op[888] = getOpcodeRep((char)0, (char)1, 889);
        op[889] = getOpcodeRnm(10, 52); // WSP
        op[890] = getOpcodeRep((char)0, (char)1, 891);
        {int[] a = {892,893}; op[891] = getOpcodeAlt(a);}
        {char[] a = {97,115,99}; op[892] = getOpcodeTls(a);}
        {char[] a = {100,101,115,99}; op[893] = getOpcodeTls(a);}
        op[894] = getOpcodeRep((char)0, Character.MAX_VALUE, 895);
        {int[] a = {896,897,899,900,902}; op[895] = getOpcodeCat(a);}
        op[896] = getOpcodeRnm(37, 294); // COMMA
        op[897] = getOpcodeRep((char)0, (char)1, 898);
        op[898] = getOpcodeRnm(10, 52); // WSP
        op[899] = getOpcodeRnm(163, 906); // orderExpr
        op[900] = getOpcodeRep((char)0, (char)1, 901);
        op[901] = getOpcodeRnm(10, 52); // WSP
        op[902] = getOpcodeRep((char)0, (char)1, 903);
        {int[] a = {904,905}; op[903] = getOpcodeAlt(a);}
        {char[] a = {97,115,99}; op[904] = getOpcodeTls(a);}
        {char[] a = {100,101,115,99}; op[905] = getOpcodeTls(a);}
        {int[] a = {907,908}; op[906] = getOpcodeAlt(a);}
        op[907] = getOpcodeRnm(75, 475); // primitiveKeyProperty
        op[908] = getOpcodeRnm(76, 476); // primitiveNonKeyProperty
        {int[] a = {910,911}; op[909] = getOpcodeCat(a);}
        {char[] a = {36,115,107,105,112,61}; op[910] = getOpcodeTls(a);}
        op[911] = getOpcodeRep((char)1, Character.MAX_VALUE, 912);
        op[912] = getOpcodeRnm(6, 41); // DIGIT
        {int[] a = {914,915}; op[913] = getOpcodeCat(a);}
        {char[] a = {36,116,111,112,61}; op[914] = getOpcodeTls(a);}
        op[915] = getOpcodeRep((char)1, Character.MAX_VALUE, 916);
        op[916] = getOpcodeRnm(6, 41); // DIGIT
        {int[] a = {918,919}; op[917] = getOpcodeCat(a);}
        {char[] a = {36,102,111,114,109,97,116,61}; op[918] = getOpcodeTls(a);}
        {int[] a = {920,921,922,923}; op[919] = getOpcodeAlt(a);}
        {char[] a = {106,115,111,110}; op[920] = getOpcodeTls(a);}
        {char[] a = {97,116,111,109}; op[921] = getOpcodeTls(a);}
        {char[] a = {120,109,108}; op[922] = getOpcodeTls(a);}
        op[923] = getOpcodeRep((char)1, Character.MAX_VALUE, 924);
        {int[] a = {925,926}; op[924] = getOpcodeAlt(a);}
        op[925] = getOpcodeRnm(26, 222); // pchar
        {char[] a = {47}; op[926] = getOpcodeTls(a);}
        {int[] a = {928,929}; op[927] = getOpcodeCat(a);}
        {char[] a = {36,105,110,108,105,110,101,99,111,117,110,116,61}; op[928] = getOpcodeTls(a);}
        {int[] a = {930,931}; op[929] = getOpcodeAlt(a);}
        {char[] a = {97,108,108,112,97,103,101,115}; op[930] = getOpcodeTls(a);}
        {char[] a = {110,111,110,101}; op[931] = getOpcodeTls(a);}
        {int[] a = {933,934}; op[932] = getOpcodeCat(a);}
        {char[] a = {36,115,101,108,101,99,116,61}; op[933] = getOpcodeTls(a);}
        op[934] = getOpcodeRnm(169, 935); // selectClause
        {int[] a = {936,937}; op[935] = getOpcodeCat(a);}
        op[936] = getOpcodeRnm(170, 941); // selectItem
        op[937] = getOpcodeRep((char)0, Character.MAX_VALUE, 938);
        {int[] a = {939,940}; op[938] = getOpcodeCat(a);}
        op[939] = getOpcodeRnm(37, 294); // COMMA
        op[940] = getOpcodeRnm(170, 941); // selectItem
        {int[] a = {942,943}; op[941] = getOpcodeAlt(a);}
        op[942] = getOpcodeRnm(43, 302); // star
        {int[] a = {944,948}; op[943] = getOpcodeCat(a);}
        op[944] = getOpcodeRep((char)0, (char)1, 945);
        {int[] a = {946,947}; op[945] = getOpcodeCat(a);}
        op[946] = getOpcodeRnm(69, 422); // qualifiedEntityTypeName
        {char[] a = {47}; op[947] = getOpcodeTls(a);}
        {int[] a = {949,955,956,957,958}; op[948] = getOpcodeAlt(a);}
        {int[] a = {950,951}; op[949] = getOpcodeCat(a);}
        op[950] = getOpcodeRnm(90, 496); // navigationProperty
        op[951] = getOpcodeRep((char)0, (char)1, 952);
        {int[] a = {953,954}; op[952] = getOpcodeCat(a);}
        {char[] a = {47}; op[953] = getOpcodeTls(a);}
        op[954] = getOpcodeRnm(170, 941); // selectItem
        op[955] = getOpcodeRnm(81, 481); // propertyName
        op[956] = getOpcodeRnm(113, 555); // qualifiedActionName
        op[957] = getOpcodeRnm(114, 562); // qualifiedFunctionName
        op[958] = getOpcodeRnm(67, 406); // allOperationsInContainer
        {int[] a = {960,961}; op[959] = getOpcodeCat(a);}
        {char[] a = {36,115,107,105,112,116,111,107,101,110,61}; op[960] = getOpcodeTls(a);}
        op[961] = getOpcodeRep((char)1, Character.MAX_VALUE, 962);
        op[962] = getOpcodeRnm(26, 222); // pchar
        {int[] a = {964,965,967}; op[963] = getOpcodeCat(a);}
        op[964] = getOpcodeRnm(173, 973); // customName
        op[965] = getOpcodeRep((char)0, (char)1, 966);
        op[966] = getOpcodeRnm(10, 52); // WSP
        op[967] = getOpcodeRep((char)0, (char)1, 968);
        {int[] a = {969,970,972}; op[968] = getOpcodeCat(a);}
        {char[] a = {61}; op[969] = getOpcodeTls(a);}
        op[970] = getOpcodeRep((char)0, (char)1, 971);
        op[971] = getOpcodeRnm(10, 52); // WSP
        op[972] = getOpcodeRnm(174, 1002); // customValue
        {int[] a = {974,987}; op[973] = getOpcodeCat(a);}
        {int[] a = {975,976,977,978,979,980,981,982,983,984,985,986}; op[974] = getOpcodeAlt(a);}
        op[975] = getOpcodeRnm(28, 232); // unreserved
        op[976] = getOpcodeRnm(27, 228); // pct-encoded
        {char[] a = {58}; op[977] = getOpcodeTls(a);}
        {char[] a = {64}; op[978] = getOpcodeTls(a);}
        {char[] a = {33}; op[979] = getOpcodeTls(a);}
        {char[] a = {39}; op[980] = getOpcodeTls(a);}
        {char[] a = {40}; op[981] = getOpcodeTls(a);}
        {char[] a = {41}; op[982] = getOpcodeTls(a);}
        {char[] a = {42}; op[983] = getOpcodeTls(a);}
        {char[] a = {43}; op[984] = getOpcodeTls(a);}
        {char[] a = {44}; op[985] = getOpcodeTls(a);}
        {char[] a = {59}; op[986] = getOpcodeTls(a);}
        op[987] = getOpcodeRep((char)0, Character.MAX_VALUE, 988);
        {int[] a = {989,990,991,992,993,994,995,996,997,998,999,1000,1001}; op[988] = getOpcodeAlt(a);}
        op[989] = getOpcodeRnm(28, 232); // unreserved
        op[990] = getOpcodeRnm(27, 228); // pct-encoded
        {char[] a = {58}; op[991] = getOpcodeTls(a);}
        {char[] a = {64}; op[992] = getOpcodeTls(a);}
        {char[] a = {33}; op[993] = getOpcodeTls(a);}
        {char[] a = {36}; op[994] = getOpcodeTls(a);}
        {char[] a = {39}; op[995] = getOpcodeTls(a);}
        {char[] a = {40}; op[996] = getOpcodeTls(a);}
        {char[] a = {41}; op[997] = getOpcodeTls(a);}
        {char[] a = {42}; op[998] = getOpcodeTls(a);}
        {char[] a = {43}; op[999] = getOpcodeTls(a);}
        {char[] a = {44}; op[1000] = getOpcodeTls(a);}
        {char[] a = {59}; op[1001] = getOpcodeTls(a);}
        op[1002] = getOpcodeRep((char)0, Character.MAX_VALUE, 1003);
        {int[] a = {1004,1005,1006,1007,1008,1009,1010,1011,1012,1013,1014,1015,1016,1017}; op[1003] = getOpcodeAlt(a);}
        op[1004] = getOpcodeRnm(28, 232); // unreserved
        op[1005] = getOpcodeRnm(27, 228); // pct-encoded
        {char[] a = {58}; op[1006] = getOpcodeTls(a);}
        {char[] a = {64}; op[1007] = getOpcodeTls(a);}
        {char[] a = {33}; op[1008] = getOpcodeTls(a);}
        {char[] a = {36}; op[1009] = getOpcodeTls(a);}
        {char[] a = {39}; op[1010] = getOpcodeTls(a);}
        {char[] a = {40}; op[1011] = getOpcodeTls(a);}
        {char[] a = {41}; op[1012] = getOpcodeTls(a);}
        {char[] a = {42}; op[1013] = getOpcodeTls(a);}
        {char[] a = {43}; op[1014] = getOpcodeTls(a);}
        {char[] a = {44}; op[1015] = getOpcodeTls(a);}
        {char[] a = {59}; op[1016] = getOpcodeTls(a);}
        {char[] a = {61}; op[1017] = getOpcodeTls(a);}
        {int[] a = {1019,1033,1039,1045,1051,1059,1065,1073}; op[1018] = getOpcodeAlt(a);}
        {int[] a = {1020,1024,1025}; op[1019] = getOpcodeCat(a);}
        op[1020] = getOpcodeRep((char)0, (char)1, 1021);
        {int[] a = {1022,1023}; op[1021] = getOpcodeCat(a);}
        op[1022] = getOpcodeRnm(82, 488); // entityContainerName
        {char[] a = {46}; op[1023] = getOpcodeTls(a);}
        op[1024] = getOpcodeRnm(62, 395); // entitySetName
        op[1025] = getOpcodeRep((char)0, (char)1, 1026);
        {int[] a = {1027,1028,1029}; op[1026] = getOpcodeAlt(a);}
        op[1027] = getOpcodeRnm(160, 871); // count
        op[1028] = getOpcodeRnm(176, 1074); // collectionNavigation
        {int[] a = {1030,1031}; op[1029] = getOpcodeCat(a);}
        op[1030] = getOpcodeRnm(184, 1220); // keyPredicate
        op[1031] = getOpcodeRep((char)0, (char)1, 1032);
        op[1032] = getOpcodeRnm(177, 1110); // singleNavigation
        {int[] a = {1034,1037}; op[1033] = getOpcodeCat(a);}
        {int[] a = {1035,1036}; op[1034] = getOpcodeAlt(a);}
        op[1035] = getOpcodeRnm(220, 1414); // entityColServiceOpCall
        op[1036] = getOpcodeRnm(192, 1255); // entityColFunctionCall
        op[1037] = getOpcodeRep((char)0, (char)1, 1038);
        op[1038] = getOpcodeRnm(176, 1074); // collectionNavigation
        {int[] a = {1040,1043}; op[1039] = getOpcodeCat(a);}
        {int[] a = {1041,1042}; op[1040] = getOpcodeAlt(a);}
        op[1041] = getOpcodeRnm(219, 1408); // entityServiceOpCall
        op[1042] = getOpcodeRnm(191, 1252); // entityFunctionCall
        op[1043] = getOpcodeRep((char)0, (char)1, 1044);
        op[1044] = getOpcodeRnm(177, 1110); // singleNavigation
        {int[] a = {1046,1049}; op[1045] = getOpcodeCat(a);}
        {int[] a = {1047,1048}; op[1046] = getOpcodeAlt(a);}
        op[1047] = getOpcodeRnm(222, 1426); // complexColServiceOpCall
        op[1048] = getOpcodeRnm(194, 1261); // complexColFunctionCall
        op[1049] = getOpcodeRep((char)0, (char)1, 1050);
        op[1050] = getOpcodeRnm(178, 1141); // boundOperation
        {int[] a = {1052,1055}; op[1051] = getOpcodeCat(a);}
        {int[] a = {1053,1054}; op[1052] = getOpcodeAlt(a);}
        op[1053] = getOpcodeRnm(221, 1420); // complexServiceOpCall
        op[1054] = getOpcodeRnm(193, 1258); // complexFunctionCall
        op[1055] = getOpcodeRep((char)0, (char)1, 1056);
        {int[] a = {1057,1058}; op[1056] = getOpcodeAlt(a);}
        op[1057] = getOpcodeRnm(178, 1141); // boundOperation
        op[1058] = getOpcodeRnm(180, 1188); // complexPropertyPath
        {int[] a = {1060,1063}; op[1059] = getOpcodeCat(a);}
        {int[] a = {1061,1062}; op[1060] = getOpcodeAlt(a);}
        op[1061] = getOpcodeRnm(224, 1438); // primitiveColServiceOpCall
        op[1062] = getOpcodeRnm(196, 1267); // primitiveColFunctionCall
        op[1063] = getOpcodeRep((char)0, (char)1, 1064);
        op[1064] = getOpcodeRnm(178, 1141); // boundOperation
        {int[] a = {1066,1069}; op[1065] = getOpcodeCat(a);}
        {int[] a = {1067,1068}; op[1066] = getOpcodeAlt(a);}
        op[1067] = getOpcodeRnm(223, 1432); // primitiveServiceOpCall
        op[1068] = getOpcodeRnm(195, 1264); // primitiveFunctionCall
        op[1069] = getOpcodeRep((char)0, (char)1, 1070);
        {int[] a = {1071,1072}; op[1070] = getOpcodeAlt(a);}
        op[1071] = getOpcodeRnm(178, 1141); // boundOperation
        op[1072] = getOpcodeRnm(183, 1219); // value
        op[1073] = getOpcodeRnm(189, 1240); // actionCall
        {int[] a = {1075,1079,1080}; op[1074] = getOpcodeCat(a);}
        op[1075] = getOpcodeRep((char)0, (char)1, 1076);
        {int[] a = {1077,1078}; op[1076] = getOpcodeCat(a);}
        {char[] a = {47}; op[1077] = getOpcodeTls(a);}
        op[1078] = getOpcodeRnm(69, 422); // qualifiedEntityTypeName
        {char[] a = {47}; op[1079] = getOpcodeTls(a);}
        {int[] a = {1081,1085,1089,1095,1099,1105,1109}; op[1080] = getOpcodeAlt(a);}
        {int[] a = {1082,1083}; op[1081] = getOpcodeCat(a);}
        op[1082] = getOpcodeRnm(198, 1277); // boundEntityFuncCall
        op[1083] = getOpcodeRep((char)0, (char)1, 1084);
        op[1084] = getOpcodeRnm(177, 1110); // singleNavigation
        {int[] a = {1086,1087}; op[1085] = getOpcodeCat(a);}
        op[1086] = getOpcodeRnm(199, 1280); // boundEntityColFuncCall
        op[1087] = getOpcodeRep((char)0, (char)1, 1088);
        op[1088] = getOpcodeRnm(176, 1074); // collectionNavigation
        {int[] a = {1090,1091}; op[1089] = getOpcodeCat(a);}
        op[1090] = getOpcodeRnm(202, 1289); // boundPrimitiveFuncCall
        op[1091] = getOpcodeRep((char)0, (char)1, 1092);
        {int[] a = {1093,1094}; op[1092] = getOpcodeAlt(a);}
        op[1093] = getOpcodeRnm(178, 1141); // boundOperation
        op[1094] = getOpcodeRnm(183, 1219); // value
        {int[] a = {1096,1097}; op[1095] = getOpcodeCat(a);}
        op[1096] = getOpcodeRnm(203, 1292); // boundPrimitiveColFuncCall
        op[1097] = getOpcodeRep((char)0, (char)1, 1098);
        op[1098] = getOpcodeRnm(178, 1141); // boundOperation
        {int[] a = {1100,1101}; op[1099] = getOpcodeCat(a);}
        op[1100] = getOpcodeRnm(200, 1283); // boundComplexFuncCall
        op[1101] = getOpcodeRep((char)0, (char)1, 1102);
        {int[] a = {1103,1104}; op[1102] = getOpcodeAlt(a);}
        op[1103] = getOpcodeRnm(180, 1188); // complexPropertyPath
        op[1104] = getOpcodeRnm(178, 1141); // boundOperation
        {int[] a = {1106,1107}; op[1105] = getOpcodeCat(a);}
        op[1106] = getOpcodeRnm(201, 1286); // boundComplexColFuncCall
        op[1107] = getOpcodeRep((char)0, (char)1, 1108);
        op[1108] = getOpcodeRnm(178, 1141); // boundOperation
        op[1109] = getOpcodeRnm(190, 1246); // boundActionCall
        {int[] a = {1111,1115}; op[1110] = getOpcodeCat(a);}
        op[1111] = getOpcodeRep((char)0, (char)1, 1112);
        {int[] a = {1113,1114}; op[1112] = getOpcodeCat(a);}
        {char[] a = {47}; op[1113] = getOpcodeTls(a);}
        op[1114] = getOpcodeRnm(69, 422); // qualifiedEntityTypeName
        {int[] a = {1116,1135,1136,1137,1138,1139,1140}; op[1115] = getOpcodeAlt(a);}
        {int[] a = {1117,1118}; op[1116] = getOpcodeCat(a);}
        {char[] a = {47}; op[1117] = getOpcodeTls(a);}
        {int[] a = {1119,1122,1126}; op[1118] = getOpcodeAlt(a);}
        {int[] a = {1120,1121}; op[1119] = getOpcodeCat(a);}
        {char[] a = {36,108,105,110,107,115,47}; op[1120] = getOpcodeTls(a);}
        op[1121] = getOpcodeRnm(90, 496); // navigationProperty
        {int[] a = {1123,1124}; op[1122] = getOpcodeCat(a);}
        op[1123] = getOpcodeRnm(88, 494); // entityNavigationProperty
        op[1124] = getOpcodeRep((char)0, (char)1, 1125);
        op[1125] = getOpcodeRnm(177, 1110); // singleNavigation
        {int[] a = {1127,1128}; op[1126] = getOpcodeCat(a);}
        op[1127] = getOpcodeRnm(89, 495); // entityColNavigationProperty
        op[1128] = getOpcodeRep((char)0, (char)1, 1129);
        {int[] a = {1130,1131}; op[1129] = getOpcodeAlt(a);}
        op[1130] = getOpcodeRnm(176, 1074); // collectionNavigation
        {int[] a = {1132,1133}; op[1131] = getOpcodeCat(a);}
        op[1132] = getOpcodeRnm(184, 1220); // keyPredicate
        op[1133] = getOpcodeRep((char)0, (char)1, 1134);
        op[1134] = getOpcodeRnm(177, 1110); // singleNavigation
        op[1135] = getOpcodeRnm(179, 1177); // primitivePropertyPath
        op[1136] = getOpcodeRnm(180, 1188); // complexPropertyPath
        op[1137] = getOpcodeRnm(181, 1201); // collectionPropertyPath
        op[1138] = getOpcodeRnm(182, 1212); // streamPropertyPath
        op[1139] = getOpcodeRnm(183, 1219); // value
        op[1140] = getOpcodeRnm(178, 1141); // boundOperation
        {int[] a = {1142,1146,1147}; op[1141] = getOpcodeCat(a);}
        op[1142] = getOpcodeRep((char)0, (char)1, 1143);
        {int[] a = {1144,1145}; op[1143] = getOpcodeCat(a);}
        {char[] a = {47}; op[1144] = getOpcodeTls(a);}
        op[1145] = getOpcodeRnm(69, 422); // qualifiedEntityTypeName
        {char[] a = {47}; op[1146] = getOpcodeTls(a);}
        {int[] a = {1148,1152,1156,1162,1166,1172,1176}; op[1147] = getOpcodeAlt(a);}
        {int[] a = {1149,1150}; op[1148] = getOpcodeCat(a);}
        op[1149] = getOpcodeRnm(199, 1280); // boundEntityColFuncCall
        op[1150] = getOpcodeRep((char)0, (char)1, 1151);
        op[1151] = getOpcodeRnm(177, 1110); // singleNavigation
        {int[] a = {1153,1154}; op[1152] = getOpcodeCat(a);}
        op[1153] = getOpcodeRnm(198, 1277); // boundEntityFuncCall
        op[1154] = getOpcodeRep((char)0, (char)1, 1155);
        op[1155] = getOpcodeRnm(176, 1074); // collectionNavigation
        {int[] a = {1157,1158}; op[1156] = getOpcodeCat(a);}
        op[1157] = getOpcodeRnm(202, 1289); // boundPrimitiveFuncCall
        op[1158] = getOpcodeRep((char)0, (char)1, 1159);
        {int[] a = {1160,1161}; op[1159] = getOpcodeAlt(a);}
        op[1160] = getOpcodeRnm(178, 1141); // boundOperation
        op[1161] = getOpcodeRnm(183, 1219); // value
        {int[] a = {1163,1164}; op[1162] = getOpcodeCat(a);}
        op[1163] = getOpcodeRnm(203, 1292); // boundPrimitiveColFuncCall
        op[1164] = getOpcodeRep((char)0, (char)1, 1165);
        op[1165] = getOpcodeRnm(178, 1141); // boundOperation
        {int[] a = {1167,1168}; op[1166] = getOpcodeCat(a);}
        op[1167] = getOpcodeRnm(200, 1283); // boundComplexFuncCall
        op[1168] = getOpcodeRep((char)0, (char)1, 1169);
        {int[] a = {1170,1171}; op[1169] = getOpcodeAlt(a);}
        op[1170] = getOpcodeRnm(180, 1188); // complexPropertyPath
        op[1171] = getOpcodeRnm(178, 1141); // boundOperation
        {int[] a = {1173,1174}; op[1172] = getOpcodeCat(a);}
        op[1173] = getOpcodeRnm(201, 1286); // boundComplexColFuncCall
        op[1174] = getOpcodeRep((char)0, (char)1, 1175);
        op[1175] = getOpcodeRnm(178, 1141); // boundOperation
        op[1176] = getOpcodeRnm(190, 1246); // boundActionCall
        {int[] a = {1178,1182,1183,1186}; op[1177] = getOpcodeCat(a);}
        op[1178] = getOpcodeRep((char)0, (char)1, 1179);
        {int[] a = {1180,1181}; op[1179] = getOpcodeCat(a);}
        {char[] a = {47}; op[1180] = getOpcodeTls(a);}
        op[1181] = getOpcodeRnm(69, 422); // qualifiedEntityTypeName
        {char[] a = {47}; op[1182] = getOpcodeTls(a);}
        {int[] a = {1184,1185}; op[1183] = getOpcodeAlt(a);}
        op[1184] = getOpcodeRnm(75, 475); // primitiveKeyProperty
        op[1185] = getOpcodeRnm(76, 476); // primitiveNonKeyProperty
        op[1186] = getOpcodeRep((char)0, (char)1, 1187);
        op[1187] = getOpcodeRnm(183, 1219); // value
        {int[] a = {1189,1193,1194,1195}; op[1188] = getOpcodeCat(a);}
        op[1189] = getOpcodeRep((char)0, (char)1, 1190);
        {int[] a = {1191,1192}; op[1190] = getOpcodeCat(a);}
        {char[] a = {47}; op[1191] = getOpcodeTls(a);}
        op[1192] = getOpcodeRnm(69, 422); // qualifiedEntityTypeName
        {char[] a = {47}; op[1193] = getOpcodeTls(a);}
        op[1194] = getOpcodeRnm(78, 478); // complexProperty
        op[1195] = getOpcodeRep((char)0, (char)1, 1196);
        {int[] a = {1197,1198,1199,1200}; op[1196] = getOpcodeAlt(a);}
        op[1197] = getOpcodeRnm(179, 1177); // primitivePropertyPath
        op[1198] = getOpcodeRnm(180, 1188); // complexPropertyPath
        op[1199] = getOpcodeRnm(181, 1201); // collectionPropertyPath
        op[1200] = getOpcodeRnm(178, 1141); // boundOperation
        {int[] a = {1202,1206,1207,1210}; op[1201] = getOpcodeCat(a);}
        op[1202] = getOpcodeRep((char)0, (char)1, 1203);
        {int[] a = {1204,1205}; op[1203] = getOpcodeCat(a);}
        {char[] a = {47}; op[1204] = getOpcodeTls(a);}
        op[1205] = getOpcodeRnm(69, 422); // qualifiedEntityTypeName
        {char[] a = {47}; op[1206] = getOpcodeTls(a);}
        {int[] a = {1208,1209}; op[1207] = getOpcodeAlt(a);}
        op[1208] = getOpcodeRnm(77, 477); // primitiveColProperty
        op[1209] = getOpcodeRnm(79, 479); // complexColProperty
        op[1210] = getOpcodeRep((char)0, (char)1, 1211);
        op[1211] = getOpcodeRnm(178, 1141); // boundOperation
        {int[] a = {1213,1217,1218}; op[1212] = getOpcodeCat(a);}
        op[1213] = getOpcodeRep((char)0, (char)1, 1214);
        {int[] a = {1215,1216}; op[1214] = getOpcodeCat(a);}
        {char[] a = {47}; op[1215] = getOpcodeTls(a);}
        op[1216] = getOpcodeRnm(69, 422); // qualifiedEntityTypeName
        {char[] a = {47}; op[1217] = getOpcodeTls(a);}
        op[1218] = getOpcodeRnm(80, 480); // streamProperty
        {char[] a = {47,36,118,97,108,117,101}; op[1219] = getOpcodeTls(a);}
        {int[] a = {1221,1222}; op[1220] = getOpcodeAlt(a);}
        op[1221] = getOpcodeRnm(185, 1223); // simpleKey
        op[1222] = getOpcodeRnm(186, 1227); // compoundKey
        {int[] a = {1224,1225,1226}; op[1223] = getOpcodeCat(a);}
        {char[] a = {40}; op[1224] = getOpcodeTls(a);}
        op[1225] = getOpcodeRnm(117, 577); // primitiveLiteral
        {char[] a = {41}; op[1226] = getOpcodeTls(a);}
        {int[] a = {1228,1229,1230,1234}; op[1227] = getOpcodeCat(a);}
        {char[] a = {40}; op[1228] = getOpcodeTls(a);}
        op[1229] = getOpcodeRnm(187, 1235); // keyValuePair
        op[1230] = getOpcodeRep((char)0, Character.MAX_VALUE, 1231);
        {int[] a = {1232,1233}; op[1231] = getOpcodeCat(a);}
        {char[] a = {44}; op[1232] = getOpcodeTls(a);}
        op[1233] = getOpcodeRnm(187, 1235); // keyValuePair
        {char[] a = {41}; op[1234] = getOpcodeTls(a);}
        {int[] a = {1236,1237,1238}; op[1235] = getOpcodeCat(a);}
        op[1236] = getOpcodeRnm(75, 475); // primitiveKeyProperty
        {char[] a = {61}; op[1237] = getOpcodeTls(a);}
        op[1238] = getOpcodeRnm(188, 1239); // keyPropertyValue
        op[1239] = getOpcodeRnm(117, 577); // primitiveLiteral
        {int[] a = {1241,1243,1244}; op[1240] = getOpcodeCat(a);}
        op[1241] = getOpcodeRep((char)0, (char)1, 1242);
        op[1242] = getOpcodeRnm(66, 399); // operationQualifier
        op[1243] = getOpcodeRnm(111, 543); // action
        op[1244] = getOpcodeRep((char)0, (char)1, 1245);
        {char[] a = {40,41}; op[1245] = getOpcodeTls(a);}
        {int[] a = {1247,1249,1250}; op[1246] = getOpcodeCat(a);}
        op[1247] = getOpcodeRep((char)0, (char)1, 1248);
        op[1248] = getOpcodeRnm(66, 399); // operationQualifier
        op[1249] = getOpcodeRnm(111, 543); // action
        op[1250] = getOpcodeRep((char)0, (char)1, 1251);
        {char[] a = {40,41}; op[1251] = getOpcodeTls(a);}
        {int[] a = {1253,1254}; op[1252] = getOpcodeCat(a);}
        op[1253] = getOpcodeRnm(97, 505); // fullEntityFunction
        op[1254] = getOpcodeRnm(204, 1295); // functionParameters
        {int[] a = {1256,1257}; op[1255] = getOpcodeCat(a);}
        op[1256] = getOpcodeRnm(98, 509); // fullEntityColFunction
        op[1257] = getOpcodeRnm(204, 1295); // functionParameters
        {int[] a = {1259,1260}; op[1258] = getOpcodeCat(a);}
        op[1259] = getOpcodeRnm(99, 513); // fullComplexFunction
        op[1260] = getOpcodeRnm(204, 1295); // functionParameters
        {int[] a = {1262,1263}; op[1261] = getOpcodeCat(a);}
        op[1262] = getOpcodeRnm(100, 517); // fullComplexColFunction
        op[1263] = getOpcodeRnm(204, 1295); // functionParameters
        {int[] a = {1265,1266}; op[1264] = getOpcodeCat(a);}
        op[1265] = getOpcodeRnm(101, 521); // fullPrimitiveFunction
        op[1266] = getOpcodeRnm(204, 1295); // functionParameters
        {int[] a = {1268,1269}; op[1267] = getOpcodeCat(a);}
        op[1268] = getOpcodeRnm(102, 525); // fullPrimitiveColFunction
        op[1269] = getOpcodeRnm(204, 1295); // functionParameters
        {int[] a = {1271,1272,1273,1274,1275,1276}; op[1270] = getOpcodeAlt(a);}
        op[1271] = getOpcodeRnm(191, 1252); // entityFunctionCall
        op[1272] = getOpcodeRnm(192, 1255); // entityColFunctionCall
        op[1273] = getOpcodeRnm(193, 1258); // complexFunctionCall
        op[1274] = getOpcodeRnm(194, 1261); // complexColFunctionCall
        op[1275] = getOpcodeRnm(195, 1264); // primitiveFunctionCall
        op[1276] = getOpcodeRnm(196, 1267); // primitiveColFunctionCall
        {int[] a = {1278,1279}; op[1277] = getOpcodeCat(a);}
        op[1278] = getOpcodeRnm(97, 505); // fullEntityFunction
        op[1279] = getOpcodeRnm(204, 1295); // functionParameters
        {int[] a = {1281,1282}; op[1280] = getOpcodeCat(a);}
        op[1281] = getOpcodeRnm(98, 509); // fullEntityColFunction
        op[1282] = getOpcodeRnm(204, 1295); // functionParameters
        {int[] a = {1284,1285}; op[1283] = getOpcodeCat(a);}
        op[1284] = getOpcodeRnm(99, 513); // fullComplexFunction
        op[1285] = getOpcodeRnm(204, 1295); // functionParameters
        {int[] a = {1287,1288}; op[1286] = getOpcodeCat(a);}
        op[1287] = getOpcodeRnm(100, 517); // fullComplexColFunction
        op[1288] = getOpcodeRnm(204, 1295); // functionParameters
        {int[] a = {1290,1291}; op[1289] = getOpcodeCat(a);}
        op[1290] = getOpcodeRnm(101, 521); // fullPrimitiveFunction
        op[1291] = getOpcodeRnm(204, 1295); // functionParameters
        {int[] a = {1293,1294}; op[1292] = getOpcodeCat(a);}
        op[1293] = getOpcodeRnm(102, 525); // fullPrimitiveColFunction
        op[1294] = getOpcodeRnm(204, 1295); // functionParameters
        {int[] a = {1296,1297,1304}; op[1295] = getOpcodeCat(a);}
        {char[] a = {40}; op[1296] = getOpcodeTls(a);}
        op[1297] = getOpcodeRep((char)0, (char)1, 1298);
        {int[] a = {1299,1300}; op[1298] = getOpcodeCat(a);}
        op[1299] = getOpcodeRnm(205, 1305); // functionParameter
        op[1300] = getOpcodeRep((char)0, Character.MAX_VALUE, 1301);
        {int[] a = {1302,1303}; op[1301] = getOpcodeCat(a);}
        {char[] a = {44}; op[1302] = getOpcodeTls(a);}
        op[1303] = getOpcodeRnm(205, 1305); // functionParameter
        {char[] a = {41}; op[1304] = getOpcodeTls(a);}
        {int[] a = {1306,1307,1308}; op[1305] = getOpcodeCat(a);}
        op[1306] = getOpcodeRnm(206, 1311); // functionParameterName
        {char[] a = {61}; op[1307] = getOpcodeTls(a);}
        {int[] a = {1309,1310}; op[1308] = getOpcodeAlt(a);}
        op[1309] = getOpcodeRnm(207, 1312); // primitiveParameterValue
        op[1310] = getOpcodeRnm(208, 1313); // parameterAlias
        op[1311] = getOpcodeRnm(57, 377); // odataIdentifier
        op[1312] = getOpcodeRnm(117, 577); // primitiveLiteral
        {int[] a = {1314,1315}; op[1313] = getOpcodeCat(a);}
        {char[] a = {64}; op[1314] = getOpcodeTls(a);}
        op[1315] = getOpcodeRep((char)0, Character.MAX_VALUE, 1316);
        op[1316] = getOpcodeRnm(26, 222); // pchar
        {int[] a = {1318,1319,1320}; op[1317] = getOpcodeCat(a);}
        op[1318] = getOpcodeRnm(208, 1313); // parameterAlias
        {char[] a = {61}; op[1319] = getOpcodeTls(a);}
        op[1320] = getOpcodeRnm(217, 1386); // parameterValue
        {int[] a = {1322,1323,1324}; op[1321] = getOpcodeCat(a);}
        op[1322] = getOpcodeRnm(206, 1311); // functionParameterName
        {char[] a = {61}; op[1323] = getOpcodeTls(a);}
        op[1324] = getOpcodeRnm(217, 1386); // parameterValue
        {int[] a = {1326,1327,1330,1331,1332}; op[1325] = getOpcodeCat(a);}
        op[1326] = getOpcodeRnm(298, 2183); // quotation-mark
        {int[] a = {1328,1329}; op[1327] = getOpcodeAlt(a);}
        op[1328] = getOpcodeRnm(75, 475); // primitiveKeyProperty
        op[1329] = getOpcodeRnm(76, 476); // primitiveNonKeyProperty
        op[1330] = getOpcodeRnm(298, 2183); // quotation-mark
        op[1331] = getOpcodeRnm(42, 301); // name-separator
        op[1332] = getOpcodeRnm(214, 1368); // primitiveLiteralInVJSON
        {int[] a = {1334,1335,1336,1337,1338}; op[1333] = getOpcodeCat(a);}
        op[1334] = getOpcodeRnm(298, 2183); // quotation-mark
        op[1335] = getOpcodeRnm(78, 478); // complexProperty
        op[1336] = getOpcodeRnm(298, 2183); // quotation-mark
        op[1337] = getOpcodeRnm(42, 301); // name-separator
        op[1338] = getOpcodeRnm(218, 1391); // complexInVJSON
        {int[] a = {1340,1354}; op[1339] = getOpcodeAlt(a);}
        {int[] a = {1341,1342,1343,1344,1345,1346,1353}; op[1340] = getOpcodeCat(a);}
        op[1341] = getOpcodeRnm(298, 2183); // quotation-mark
        op[1342] = getOpcodeRnm(77, 477); // primitiveColProperty
        op[1343] = getOpcodeRnm(298, 2183); // quotation-mark
        op[1344] = getOpcodeRnm(42, 301); // name-separator
        {char[] a = {91}; op[1345] = getOpcodeTls(a);}
        op[1346] = getOpcodeRep((char)0, (char)1, 1347);
        {int[] a = {1348,1349}; op[1347] = getOpcodeCat(a);}
        op[1348] = getOpcodeRnm(297, 2182); // primitiveVJSONLiteral
        op[1349] = getOpcodeRep((char)0, Character.MAX_VALUE, 1350);
        {int[] a = {1351,1352}; op[1350] = getOpcodeCat(a);}
        op[1351] = getOpcodeRnm(37, 294); // COMMA
        op[1352] = getOpcodeRnm(214, 1368); // primitiveLiteralInVJSON
        {char[] a = {93}; op[1353] = getOpcodeTls(a);}
        {int[] a = {1355,1356,1357,1358,1359,1360,1367}; op[1354] = getOpcodeCat(a);}
        op[1355] = getOpcodeRnm(298, 2183); // quotation-mark
        op[1356] = getOpcodeRnm(79, 479); // complexColProperty
        op[1357] = getOpcodeRnm(298, 2183); // quotation-mark
        op[1358] = getOpcodeRnm(42, 301); // name-separator
        {char[] a = {91}; op[1359] = getOpcodeTls(a);}
        op[1360] = getOpcodeRep((char)0, (char)1, 1361);
        {int[] a = {1362,1363}; op[1361] = getOpcodeCat(a);}
        op[1362] = getOpcodeRnm(218, 1391); // complexInVJSON
        op[1363] = getOpcodeRep((char)0, Character.MAX_VALUE, 1364);
        {int[] a = {1365,1366}; op[1364] = getOpcodeCat(a);}
        op[1365] = getOpcodeRnm(37, 294); // COMMA
        op[1366] = getOpcodeRnm(218, 1391); // complexInVJSON
        {char[] a = {93}; op[1367] = getOpcodeTls(a);}
        {char[] a = {123,84,79,68,79,50,50,125}; op[1368] = getOpcodeTls(a);}
        {int[] a = {1370,1371,1372,1373,1374,1375,1377}; op[1369] = getOpcodeCat(a);}
        op[1370] = getOpcodeRnm(298, 2183); // quotation-mark
        {char[] a = {95,95,109,101,116,97,100,97,116,97}; op[1371] = getOpcodeTls(a);}
        op[1372] = getOpcodeRnm(298, 2183); // quotation-mark
        op[1373] = getOpcodeRnm(42, 301); // name-separator
        op[1374] = getOpcodeRnm(39, 298); // begin-object
        op[1375] = getOpcodeRep((char)0, (char)1, 1376);
        op[1376] = getOpcodeRnm(216, 1378); // typeNVPInVJSON
        op[1377] = getOpcodeRnm(40, 299); // end-object
        {int[] a = {1379,1380,1381,1382,1383,1384,1385}; op[1378] = getOpcodeCat(a);}
        op[1379] = getOpcodeRnm(298, 2183); // quotation-mark
        {char[] a = {116,121,112,101}; op[1380] = getOpcodeTls(a);}
        op[1381] = getOpcodeRnm(298, 2183); // quotation-mark
        op[1382] = getOpcodeRnm(42, 301); // name-separator
        op[1383] = getOpcodeRnm(298, 2183); // quotation-mark
        op[1384] = getOpcodeRnm(68, 409); // qualifiedTypeName
        op[1385] = getOpcodeRnm(298, 2183); // quotation-mark
        {int[] a = {1387,1388,1389,1390}; op[1386] = getOpcodeAlt(a);}
        op[1387] = getOpcodeRnm(117, 577); // primitiveLiteral
        op[1388] = getOpcodeRnm(293, 2178); // complexTypeInJSON
        op[1389] = getOpcodeRnm(296, 2181); // primitiveColInJSON
        op[1390] = getOpcodeRnm(292, 2177); // complexColInJSON
        {int[] a = {1392,1393,1407}; op[1391] = getOpcodeCat(a);}
        op[1392] = getOpcodeRnm(39, 298); // begin-object
        op[1393] = getOpcodeRep((char)0, (char)1, 1394);
        {int[] a = {1395,1400}; op[1394] = getOpcodeCat(a);}
        {int[] a = {1396,1397,1398,1399}; op[1395] = getOpcodeAlt(a);}
        op[1396] = getOpcodeRnm(215, 1369); // complexTypeMetadataInVJSON
        op[1397] = getOpcodeRnm(211, 1325); // primitivePropertyInVJSON
        op[1398] = getOpcodeRnm(212, 1333); // complexPropertyInVJSON
        op[1399] = getOpcodeRnm(213, 1339); // collectionPropertyInVJSON
        op[1400] = getOpcodeRep((char)0, Character.MAX_VALUE, 1401);
        {int[] a = {1402,1403}; op[1401] = getOpcodeCat(a);}
        op[1402] = getOpcodeRnm(41, 300); // value-separator
        {int[] a = {1404,1405,1406}; op[1403] = getOpcodeAlt(a);}
        op[1404] = getOpcodeRnm(211, 1325); // primitivePropertyInVJSON
        op[1405] = getOpcodeRnm(212, 1333); // complexPropertyInVJSON
        op[1406] = getOpcodeRnm(213, 1339); // collectionPropertyInVJSON
        op[1407] = getOpcodeRnm(40, 299); // end-object
        {int[] a = {1409,1411,1412}; op[1408] = getOpcodeCat(a);}
        op[1409] = getOpcodeRep((char)0, (char)1, 1410);
        op[1410] = getOpcodeRnm(66, 399); // operationQualifier
        op[1411] = getOpcodeRnm(83, 489); // entityServiceOp
        op[1412] = getOpcodeRep((char)0, (char)1, 1413);
        {char[] a = {40,41}; op[1413] = getOpcodeTls(a);}
        {int[] a = {1415,1417,1418}; op[1414] = getOpcodeCat(a);}
        op[1415] = getOpcodeRep((char)0, (char)1, 1416);
        op[1416] = getOpcodeRnm(66, 399); // operationQualifier
        op[1417] = getOpcodeRnm(84, 490); // entityColServiceOp
        op[1418] = getOpcodeRep((char)0, (char)1, 1419);
        {char[] a = {40,41}; op[1419] = getOpcodeTls(a);}
        {int[] a = {1421,1423,1424}; op[1420] = getOpcodeCat(a);}
        op[1421] = getOpcodeRep((char)0, (char)1, 1422);
        op[1422] = getOpcodeRnm(66, 399); // operationQualifier
        op[1423] = getOpcodeRnm(85, 491); // complexServiceOp
        op[1424] = getOpcodeRep((char)0, (char)1, 1425);
        {char[] a = {40,41}; op[1425] = getOpcodeTls(a);}
        {int[] a = {1427,1429,1430}; op[1426] = getOpcodeCat(a);}
        op[1427] = getOpcodeRep((char)0, (char)1, 1428);
        op[1428] = getOpcodeRnm(66, 399); // operationQualifier
        op[1429] = getOpcodeRnm(86, 492); // complexColServiceOp
        op[1430] = getOpcodeRep((char)0, (char)1, 1431);
        {char[] a = {40,41}; op[1431] = getOpcodeTls(a);}
        {int[] a = {1433,1435,1436}; op[1432] = getOpcodeCat(a);}
        op[1433] = getOpcodeRep((char)0, (char)1, 1434);
        op[1434] = getOpcodeRnm(66, 399); // operationQualifier
        op[1435] = getOpcodeRnm(87, 493); // primitiveServiceOp
        op[1436] = getOpcodeRep((char)0, (char)1, 1437);
        {char[] a = {40,41}; op[1437] = getOpcodeTls(a);}
        {int[] a = {1439,1441,1442}; op[1438] = getOpcodeCat(a);}
        op[1439] = getOpcodeRep((char)0, (char)1, 1440);
        op[1440] = getOpcodeRnm(66, 399); // operationQualifier
        op[1441] = getOpcodeRnm(87, 493); // primitiveServiceOp
        op[1442] = getOpcodeRep((char)0, (char)1, 1443);
        {char[] a = {40,41}; op[1443] = getOpcodeTls(a);}
        op[1444] = getOpcodeRnm(57, 377); // odataIdentifier
        {int[] a = {1446,1447,1448}; op[1445] = getOpcodeCat(a);}
        op[1446] = getOpcodeRnm(225, 1444); // serviceOpParameterName
        {char[] a = {61}; op[1447] = getOpcodeTls(a);}
        op[1448] = getOpcodeRnm(207, 1312); // primitiveParameterValue
        {int[] a = {1450,1452,1467}; op[1449] = getOpcodeCat(a);}
        op[1450] = getOpcodeRep((char)0, (char)1, 1451);
        op[1451] = getOpcodeRnm(10, 52); // WSP
        {int[] a = {1453,1454,1455,1456,1457,1458,1459,1460,1461,1462,1463,1464,1465,1466}; op[1452] = getOpcodeAlt(a);}
        op[1453] = getOpcodeRnm(228, 1469); // boolCommonExpr
        op[1454] = getOpcodeRnm(262, 1808); // methodCallExpr
        op[1455] = getOpcodeRnm(231, 1494); // parenExpr
        op[1456] = getOpcodeRnm(230, 1493); // literalExpr
        op[1457] = getOpcodeRnm(241, 1558); // addExpr
        op[1458] = getOpcodeRnm(242, 1564); // subExpr
        op[1459] = getOpcodeRnm(243, 1570); // mulExpr
        op[1460] = getOpcodeRnm(244, 1576); // divExpr
        op[1461] = getOpcodeRnm(245, 1582); // modExpr
        op[1462] = getOpcodeRnm(246, 1588); // negateExpr
        op[1463] = getOpcodeRnm(254, 1697); // memberExpr
        op[1464] = getOpcodeRnm(251, 1654); // firstMemberExpr
        op[1465] = getOpcodeRnm(249, 1616); // castExpr
        op[1466] = getOpcodeRnm(197, 1270); // functionCall
        op[1467] = getOpcodeRep((char)0, (char)1, 1468);
        op[1468] = getOpcodeRnm(10, 52); // WSP
        {int[] a = {1470,1472,1490}; op[1469] = getOpcodeCat(a);}
        op[1470] = getOpcodeRep((char)0, (char)1, 1471);
        op[1471] = getOpcodeRnm(10, 52); // WSP
        {int[] a = {1473,1474,1475,1476,1477,1478,1479,1480,1481,1482,1483,1484,1485,1486,1487,1488,1489}; op[1472] = getOpcodeAlt(a);}
        op[1473] = getOpcodeRnm(229, 1492); // boolLiteralExpr
        op[1474] = getOpcodeRnm(233, 1510); // andExpr
        op[1475] = getOpcodeRnm(234, 1516); // orExpr
        op[1476] = getOpcodeRnm(253, 1685); // boolPrimitiveMemberExpr
        op[1477] = getOpcodeRnm(235, 1522); // eqExpr
        op[1478] = getOpcodeRnm(236, 1528); // neExpr
        op[1479] = getOpcodeRnm(237, 1534); // ltExpr
        op[1480] = getOpcodeRnm(238, 1540); // leExpr
        op[1481] = getOpcodeRnm(239, 1546); // gtExpr
        op[1482] = getOpcodeRnm(240, 1552); // geExpr
        op[1483] = getOpcodeRnm(247, 1593); // notExpr
        op[1484] = getOpcodeRnm(248, 1597); // isofExpr
        op[1485] = getOpcodeRnm(250, 1635); // boolCastExpr
        op[1486] = getOpcodeRnm(291, 2176); // boolMethodCallExpr
        op[1487] = getOpcodeRnm(252, 1679); // firstBoolPrimitiveMemExpr
        op[1488] = getOpcodeRnm(232, 1502); // boolParenExpr
        op[1489] = getOpcodeRnm(290, 2175); // boolFunctionCallExpr
        op[1490] = getOpcodeRep((char)0, (char)1, 1491);
        op[1491] = getOpcodeRnm(10, 52); // WSP
        op[1492] = getOpcodeRnm(120, 629); // boolean
        op[1493] = getOpcodeRnm(117, 577); // primitiveLiteral
        {int[] a = {1495,1496,1498,1499,1501}; op[1494] = getOpcodeCat(a);}
        {char[] a = {40}; op[1495] = getOpcodeTls(a);}
        op[1496] = getOpcodeRep((char)0, (char)1, 1497);
        op[1497] = getOpcodeRnm(10, 52); // WSP
        op[1498] = getOpcodeRnm(227, 1449); // commonExpr
        op[1499] = getOpcodeRep((char)0, (char)1, 1500);
        op[1500] = getOpcodeRnm(10, 52); // WSP
        {char[] a = {41}; op[1501] = getOpcodeTls(a);}
        {int[] a = {1503,1504,1506,1507,1509}; op[1502] = getOpcodeCat(a);}
        {char[] a = {40}; op[1503] = getOpcodeTls(a);}
        op[1504] = getOpcodeRep((char)0, (char)1, 1505);
        op[1505] = getOpcodeRnm(10, 52); // WSP
        op[1506] = getOpcodeRnm(228, 1469); // boolCommonExpr
        op[1507] = getOpcodeRep((char)0, (char)1, 1508);
        op[1508] = getOpcodeRnm(10, 52); // WSP
        {char[] a = {41}; op[1509] = getOpcodeTls(a);}
        {int[] a = {1511,1512,1513,1514,1515}; op[1510] = getOpcodeCat(a);}
        op[1511] = getOpcodeRnm(228, 1469); // boolCommonExpr
        op[1512] = getOpcodeRnm(10, 52); // WSP
        {char[] a = {97,110,100}; op[1513] = getOpcodeTls(a);}
        op[1514] = getOpcodeRnm(10, 52); // WSP
        op[1515] = getOpcodeRnm(228, 1469); // boolCommonExpr
        {int[] a = {1517,1518,1519,1520,1521}; op[1516] = getOpcodeCat(a);}
        op[1517] = getOpcodeRnm(228, 1469); // boolCommonExpr
        op[1518] = getOpcodeRnm(10, 52); // WSP
        {char[] a = {111,114}; op[1519] = getOpcodeTls(a);}
        op[1520] = getOpcodeRnm(10, 52); // WSP
        op[1521] = getOpcodeRnm(228, 1469); // boolCommonExpr
        {int[] a = {1523,1524,1525,1526,1527}; op[1522] = getOpcodeCat(a);}
        op[1523] = getOpcodeRnm(227, 1449); // commonExpr
        op[1524] = getOpcodeRnm(10, 52); // WSP
        {char[] a = {101,113}; op[1525] = getOpcodeTls(a);}
        op[1526] = getOpcodeRnm(10, 52); // WSP
        op[1527] = getOpcodeRnm(227, 1449); // commonExpr
        {int[] a = {1529,1530,1531,1532,1533}; op[1528] = getOpcodeCat(a);}
        op[1529] = getOpcodeRnm(227, 1449); // commonExpr
        op[1530] = getOpcodeRnm(10, 52); // WSP
        {char[] a = {110,101}; op[1531] = getOpcodeTls(a);}
        op[1532] = getOpcodeRnm(10, 52); // WSP
        op[1533] = getOpcodeRnm(227, 1449); // commonExpr
        {int[] a = {1535,1536,1537,1538,1539}; op[1534] = getOpcodeCat(a);}
        op[1535] = getOpcodeRnm(227, 1449); // commonExpr
        op[1536] = getOpcodeRnm(10, 52); // WSP
        {char[] a = {108,116}; op[1537] = getOpcodeTls(a);}
        op[1538] = getOpcodeRnm(10, 52); // WSP
        op[1539] = getOpcodeRnm(227, 1449); // commonExpr
        {int[] a = {1541,1542,1543,1544,1545}; op[1540] = getOpcodeCat(a);}
        op[1541] = getOpcodeRnm(227, 1449); // commonExpr
        op[1542] = getOpcodeRnm(10, 52); // WSP
        {char[] a = {108,101}; op[1543] = getOpcodeTls(a);}
        op[1544] = getOpcodeRnm(10, 52); // WSP
        op[1545] = getOpcodeRnm(227, 1449); // commonExpr
        {int[] a = {1547,1548,1549,1550,1551}; op[1546] = getOpcodeCat(a);}
        op[1547] = getOpcodeRnm(227, 1449); // commonExpr
        op[1548] = getOpcodeRnm(10, 52); // WSP
        {char[] a = {103,116}; op[1549] = getOpcodeTls(a);}
        op[1550] = getOpcodeRnm(10, 52); // WSP
        op[1551] = getOpcodeRnm(227, 1449); // commonExpr
        {int[] a = {1553,1554,1555,1556,1557}; op[1552] = getOpcodeCat(a);}
        op[1553] = getOpcodeRnm(227, 1449); // commonExpr
        op[1554] = getOpcodeRnm(10, 52); // WSP
        {char[] a = {103,101}; op[1555] = getOpcodeTls(a);}
        op[1556] = getOpcodeRnm(10, 52); // WSP
        op[1557] = getOpcodeRnm(227, 1449); // commonExpr
        {int[] a = {1559,1560,1561,1562,1563}; op[1558] = getOpcodeCat(a);}
        op[1559] = getOpcodeRnm(227, 1449); // commonExpr
        op[1560] = getOpcodeRnm(10, 52); // WSP
        {char[] a = {97,100,100}; op[1561] = getOpcodeTls(a);}
        op[1562] = getOpcodeRnm(10, 52); // WSP
        op[1563] = getOpcodeRnm(227, 1449); // commonExpr
        {int[] a = {1565,1566,1567,1568,1569}; op[1564] = getOpcodeCat(a);}
        op[1565] = getOpcodeRnm(227, 1449); // commonExpr
        op[1566] = getOpcodeRnm(10, 52); // WSP
        {char[] a = {115,117,98}; op[1567] = getOpcodeTls(a);}
        op[1568] = getOpcodeRnm(10, 52); // WSP
        op[1569] = getOpcodeRnm(227, 1449); // commonExpr
        {int[] a = {1571,1572,1573,1574,1575}; op[1570] = getOpcodeCat(a);}
        op[1571] = getOpcodeRnm(227, 1449); // commonExpr
        op[1572] = getOpcodeRnm(10, 52); // WSP
        {char[] a = {109,117,108}; op[1573] = getOpcodeTls(a);}
        op[1574] = getOpcodeRnm(10, 52); // WSP
        op[1575] = getOpcodeRnm(227, 1449); // commonExpr
        {int[] a = {1577,1578,1579,1580,1581}; op[1576] = getOpcodeCat(a);}
        op[1577] = getOpcodeRnm(227, 1449); // commonExpr
        op[1578] = getOpcodeRnm(10, 52); // WSP
        {char[] a = {100,105,118}; op[1579] = getOpcodeTls(a);}
        op[1580] = getOpcodeRnm(10, 52); // WSP
        op[1581] = getOpcodeRnm(227, 1449); // commonExpr
        {int[] a = {1583,1584,1585,1586,1587}; op[1582] = getOpcodeCat(a);}
        op[1583] = getOpcodeRnm(227, 1449); // commonExpr
        op[1584] = getOpcodeRnm(10, 52); // WSP
        {char[] a = {109,111,100}; op[1585] = getOpcodeTls(a);}
        op[1586] = getOpcodeRnm(10, 52); // WSP
        op[1587] = getOpcodeRnm(227, 1449); // commonExpr
        {int[] a = {1589,1590,1592}; op[1588] = getOpcodeCat(a);}
        {char[] a = {45}; op[1589] = getOpcodeTls(a);}
        op[1590] = getOpcodeRep((char)0, (char)1, 1591);
        op[1591] = getOpcodeRnm(10, 52); // WSP
        op[1592] = getOpcodeRnm(227, 1449); // commonExpr
        {int[] a = {1594,1595,1596}; op[1593] = getOpcodeCat(a);}
        {char[] a = {110,111,116}; op[1594] = getOpcodeTls(a);}
        op[1595] = getOpcodeRnm(10, 52); // WSP
        op[1596] = getOpcodeRnm(227, 1449); // commonExpr
        {int[] a = {1598,1599,1601,1602,1610,1612,1613,1615}; op[1597] = getOpcodeCat(a);}
        {char[] a = {105,115,111,102}; op[1598] = getOpcodeTls(a);}
        op[1599] = getOpcodeRep((char)0, (char)1, 1600);
        op[1600] = getOpcodeRnm(10, 52); // WSP
        {char[] a = {40}; op[1601] = getOpcodeTls(a);}
        op[1602] = getOpcodeRep((char)0, (char)1, 1603);
        {int[] a = {1604,1606,1607,1609}; op[1603] = getOpcodeCat(a);}
        op[1604] = getOpcodeRep((char)0, (char)1, 1605);
        op[1605] = getOpcodeRnm(10, 52); // WSP
        op[1606] = getOpcodeRnm(227, 1449); // commonExpr
        op[1607] = getOpcodeRep((char)0, (char)1, 1608);
        op[1608] = getOpcodeRnm(10, 52); // WSP
        {char[] a = {44}; op[1609] = getOpcodeTls(a);}
        op[1610] = getOpcodeRep((char)0, (char)1, 1611);
        op[1611] = getOpcodeRnm(10, 52); // WSP
        op[1612] = getOpcodeRnm(68, 409); // qualifiedTypeName
        op[1613] = getOpcodeRep((char)0, (char)1, 1614);
        op[1614] = getOpcodeRnm(10, 52); // WSP
        {char[] a = {41}; op[1615] = getOpcodeTls(a);}
        {int[] a = {1617,1618,1620,1621,1629,1631,1632,1634}; op[1616] = getOpcodeCat(a);}
        {char[] a = {99,97,115,116}; op[1617] = getOpcodeTls(a);}
        op[1618] = getOpcodeRep((char)0, (char)1, 1619);
        op[1619] = getOpcodeRnm(10, 52); // WSP
        {char[] a = {40}; op[1620] = getOpcodeTls(a);}
        op[1621] = getOpcodeRep((char)0, (char)1, 1622);
        {int[] a = {1623,1625,1626,1628}; op[1622] = getOpcodeCat(a);}
        op[1623] = getOpcodeRep((char)0, (char)1, 1624);
        op[1624] = getOpcodeRnm(10, 52); // WSP
        op[1625] = getOpcodeRnm(227, 1449); // commonExpr
        op[1626] = getOpcodeRep((char)0, (char)1, 1627);
        op[1627] = getOpcodeRnm(10, 52); // WSP
        {char[] a = {44}; op[1628] = getOpcodeTls(a);}
        op[1629] = getOpcodeRep((char)0, (char)1, 1630);
        op[1630] = getOpcodeRnm(10, 52); // WSP
        op[1631] = getOpcodeRnm(68, 409); // qualifiedTypeName
        op[1632] = getOpcodeRep((char)0, (char)1, 1633);
        op[1633] = getOpcodeRnm(10, 52); // WSP
        {char[] a = {41}; op[1634] = getOpcodeTls(a);}
        {int[] a = {1636,1637,1639,1640,1648,1650,1651,1653}; op[1635] = getOpcodeCat(a);}
        {char[] a = {99,97,115,116}; op[1636] = getOpcodeTls(a);}
        op[1637] = getOpcodeRep((char)0, (char)1, 1638);
        op[1638] = getOpcodeRnm(10, 52); // WSP
        {char[] a = {40}; op[1639] = getOpcodeTls(a);}
        op[1640] = getOpcodeRep((char)0, (char)1, 1641);
        {int[] a = {1642,1644,1645,1647}; op[1641] = getOpcodeCat(a);}
        op[1642] = getOpcodeRep((char)0, (char)1, 1643);
        op[1643] = getOpcodeRnm(10, 52); // WSP
        op[1644] = getOpcodeRnm(227, 1449); // commonExpr
        op[1645] = getOpcodeRep((char)0, (char)1, 1646);
        op[1646] = getOpcodeRnm(10, 52); // WSP
        {char[] a = {44}; op[1647] = getOpcodeTls(a);}
        op[1648] = getOpcodeRep((char)0, (char)1, 1649);
        op[1649] = getOpcodeRnm(10, 52); // WSP
        {char[] a = {69,100,109,46,66,111,111,108,101,97,110}; op[1650] = getOpcodeTls(a);}
        op[1651] = getOpcodeRep((char)0, (char)1, 1652);
        op[1652] = getOpcodeRnm(10, 52); // WSP
        {char[] a = {41}; op[1653] = getOpcodeTls(a);}
        {int[] a = {1655,1667,1671,1672,1673}; op[1654] = getOpcodeAlt(a);}
        {int[] a = {1656,1658,1662,1664,1665}; op[1655] = getOpcodeCat(a);}
        op[1656] = getOpcodeRep((char)0, (char)1, 1657);
        op[1657] = getOpcodeRnm(10, 52); // WSP
        op[1658] = getOpcodeRep((char)0, (char)1, 1659);
        {int[] a = {1660,1661}; op[1659] = getOpcodeCat(a);}
        op[1660] = getOpcodeRnm(69, 422); // qualifiedEntityTypeName
        {char[] a = {47}; op[1661] = getOpcodeTls(a);}
        op[1662] = getOpcodeRep((char)0, (char)1, 1663);
        op[1663] = getOpcodeRnm(295, 2180); // lambdaPredicatePrefixExpr
        op[1664] = getOpcodeRnm(89, 495); // entityColNavigationProperty
        op[1665] = getOpcodeRep((char)0, (char)1, 1666);
        op[1666] = getOpcodeRnm(255, 1724); // collectionNavigationExpr
        {int[] a = {1668,1669}; op[1667] = getOpcodeCat(a);}
        op[1668] = getOpcodeRnm(88, 494); // entityNavigationProperty
        op[1669] = getOpcodeRep((char)0, (char)1, 1670);
        op[1670] = getOpcodeRnm(256, 1734); // singleNavigationExpr
        op[1671] = getOpcodeRnm(179, 1177); // primitivePropertyPath
        op[1672] = getOpcodeRnm(180, 1188); // complexPropertyPath
        {int[] a = {1674,1675}; op[1673] = getOpcodeCat(a);}
        op[1674] = getOpcodeRnm(181, 1201); // collectionPropertyPath
        op[1675] = getOpcodeRep((char)0, (char)1, 1676);
        {int[] a = {1677,1678}; op[1676] = getOpcodeAlt(a);}
        op[1677] = getOpcodeRnm(258, 1792); // anyExpr
        op[1678] = getOpcodeRnm(259, 1800); // allExpr
        {int[] a = {1680,1684}; op[1679] = getOpcodeCat(a);}
        op[1680] = getOpcodeRep((char)0, (char)1, 1681);
        {int[] a = {1682,1683}; op[1681] = getOpcodeCat(a);}
        op[1682] = getOpcodeRnm(69, 422); // qualifiedEntityTypeName
        {char[] a = {47}; op[1683] = getOpcodeTls(a);}
        op[1684] = getOpcodeRnm(294, 2179); // entityProperty
        {int[] a = {1686,1687,1689,1690,1692,1696}; op[1685] = getOpcodeCat(a);}
        op[1686] = getOpcodeRnm(227, 1449); // commonExpr
        op[1687] = getOpcodeRep((char)0, (char)1, 1688);
        op[1688] = getOpcodeRnm(10, 52); // WSP
        {char[] a = {47}; op[1689] = getOpcodeTls(a);}
        op[1690] = getOpcodeRep((char)0, (char)1, 1691);
        op[1691] = getOpcodeRnm(10, 52); // WSP
        op[1692] = getOpcodeRep((char)0, (char)1, 1693);
        {int[] a = {1694,1695}; op[1693] = getOpcodeCat(a);}
        op[1694] = getOpcodeRnm(69, 422); // qualifiedEntityTypeName
        {char[] a = {47}; op[1695] = getOpcodeTls(a);}
        op[1696] = getOpcodeRnm(179, 1177); // primitivePropertyPath
        {int[] a = {1698,1712,1716,1717,1718}; op[1697] = getOpcodeAlt(a);}
        {int[] a = {1699,1700,1702,1703,1705,1709,1710}; op[1698] = getOpcodeCat(a);}
        op[1699] = getOpcodeRnm(227, 1449); // commonExpr
        op[1700] = getOpcodeRep((char)0, (char)1, 1701);
        op[1701] = getOpcodeRnm(10, 52); // WSP
        {char[] a = {47}; op[1702] = getOpcodeTls(a);}
        op[1703] = getOpcodeRep((char)0, (char)1, 1704);
        op[1704] = getOpcodeRnm(10, 52); // WSP
        op[1705] = getOpcodeRep((char)0, (char)1, 1706);
        {int[] a = {1707,1708}; op[1706] = getOpcodeCat(a);}
        op[1707] = getOpcodeRnm(69, 422); // qualifiedEntityTypeName
        {char[] a = {47}; op[1708] = getOpcodeTls(a);}
        op[1709] = getOpcodeRnm(89, 495); // entityColNavigationProperty
        op[1710] = getOpcodeRep((char)0, (char)1, 1711);
        op[1711] = getOpcodeRnm(255, 1724); // collectionNavigationExpr
        {int[] a = {1713,1714}; op[1712] = getOpcodeCat(a);}
        op[1713] = getOpcodeRnm(88, 494); // entityNavigationProperty
        op[1714] = getOpcodeRep((char)0, (char)1, 1715);
        op[1715] = getOpcodeRnm(256, 1734); // singleNavigationExpr
        op[1716] = getOpcodeRnm(179, 1177); // primitivePropertyPath
        op[1717] = getOpcodeRnm(180, 1188); // complexPropertyPath
        {int[] a = {1719,1720}; op[1718] = getOpcodeCat(a);}
        op[1719] = getOpcodeRnm(181, 1201); // collectionPropertyPath
        op[1720] = getOpcodeRep((char)0, (char)1, 1721);
        {int[] a = {1722,1723}; op[1721] = getOpcodeAlt(a);}
        op[1722] = getOpcodeRnm(258, 1792); // anyExpr
        op[1723] = getOpcodeRnm(259, 1800); // allExpr
        {int[] a = {1725,1729,1730}; op[1724] = getOpcodeCat(a);}
        op[1725] = getOpcodeRep((char)0, (char)1, 1726);
        {int[] a = {1727,1728}; op[1726] = getOpcodeCat(a);}
        {char[] a = {47}; op[1727] = getOpcodeTls(a);}
        op[1728] = getOpcodeRnm(69, 422); // qualifiedEntityTypeName
        {char[] a = {47}; op[1729] = getOpcodeTls(a);}
        {int[] a = {1731,1732,1733}; op[1730] = getOpcodeAlt(a);}
        op[1731] = getOpcodeRnm(257, 1759); // boundFunctionExpr
        op[1732] = getOpcodeRnm(258, 1792); // anyExpr
        op[1733] = getOpcodeRnm(259, 1800); // allExpr
        {int[] a = {1735,1739,1740}; op[1734] = getOpcodeCat(a);}
        op[1735] = getOpcodeRep((char)0, (char)1, 1736);
        {int[] a = {1737,1738}; op[1736] = getOpcodeCat(a);}
        {char[] a = {47}; op[1737] = getOpcodeTls(a);}
        op[1738] = getOpcodeRnm(69, 422); // qualifiedEntityTypeName
        {char[] a = {47}; op[1739] = getOpcodeTls(a);}
        {int[] a = {1741,1745,1749,1750,1751,1757,1758}; op[1740] = getOpcodeAlt(a);}
        {int[] a = {1742,1743}; op[1741] = getOpcodeCat(a);}
        op[1742] = getOpcodeRnm(89, 495); // entityColNavigationProperty
        op[1743] = getOpcodeRep((char)0, (char)1, 1744);
        op[1744] = getOpcodeRnm(255, 1724); // collectionNavigationExpr
        {int[] a = {1746,1747}; op[1745] = getOpcodeCat(a);}
        op[1746] = getOpcodeRnm(88, 494); // entityNavigationProperty
        op[1747] = getOpcodeRep((char)0, (char)1, 1748);
        op[1748] = getOpcodeRnm(256, 1734); // singleNavigationExpr
        op[1749] = getOpcodeRnm(179, 1177); // primitivePropertyPath
        op[1750] = getOpcodeRnm(180, 1188); // complexPropertyPath
        {int[] a = {1752,1753}; op[1751] = getOpcodeCat(a);}
        op[1752] = getOpcodeRnm(181, 1201); // collectionPropertyPath
        op[1753] = getOpcodeRep((char)0, (char)1, 1754);
        {int[] a = {1755,1756}; op[1754] = getOpcodeAlt(a);}
        op[1755] = getOpcodeRnm(258, 1792); // anyExpr
        op[1756] = getOpcodeRnm(259, 1800); // allExpr
        op[1757] = getOpcodeRnm(182, 1212); // streamPropertyPath
        op[1758] = getOpcodeRnm(257, 1759); // boundFunctionExpr
        {int[] a = {1760,1764,1765}; op[1759] = getOpcodeCat(a);}
        op[1760] = getOpcodeRep((char)0, (char)1, 1761);
        {int[] a = {1762,1763}; op[1761] = getOpcodeCat(a);}
        {char[] a = {47}; op[1762] = getOpcodeTls(a);}
        op[1763] = getOpcodeRnm(69, 422); // qualifiedEntityTypeName
        {char[] a = {47}; op[1764] = getOpcodeTls(a);}
        {int[] a = {1766,1770,1774,1778,1782,1788}; op[1765] = getOpcodeAlt(a);}
        {int[] a = {1767,1768}; op[1766] = getOpcodeCat(a);}
        op[1767] = getOpcodeRnm(199, 1280); // boundEntityColFuncCall
        op[1768] = getOpcodeRep((char)0, (char)1, 1769);
        op[1769] = getOpcodeRnm(256, 1734); // singleNavigationExpr
        {int[] a = {1771,1772}; op[1770] = getOpcodeCat(a);}
        op[1771] = getOpcodeRnm(198, 1277); // boundEntityFuncCall
        op[1772] = getOpcodeRep((char)0, (char)1, 1773);
        op[1773] = getOpcodeRnm(255, 1724); // collectionNavigationExpr
        {int[] a = {1775,1776}; op[1774] = getOpcodeCat(a);}
        op[1775] = getOpcodeRnm(202, 1289); // boundPrimitiveFuncCall
        op[1776] = getOpcodeRep((char)0, (char)1, 1777);
        op[1777] = getOpcodeRnm(257, 1759); // boundFunctionExpr
        {int[] a = {1779,1780}; op[1778] = getOpcodeCat(a);}
        op[1779] = getOpcodeRnm(203, 1292); // boundPrimitiveColFuncCall
        op[1780] = getOpcodeRep((char)0, (char)1, 1781);
        op[1781] = getOpcodeRnm(257, 1759); // boundFunctionExpr
        {int[] a = {1783,1784}; op[1782] = getOpcodeCat(a);}
        op[1783] = getOpcodeRnm(200, 1283); // boundComplexFuncCall
        op[1784] = getOpcodeRep((char)0, (char)1, 1785);
        {int[] a = {1786,1787}; op[1785] = getOpcodeAlt(a);}
        op[1786] = getOpcodeRnm(180, 1188); // complexPropertyPath
        op[1787] = getOpcodeRnm(257, 1759); // boundFunctionExpr
        {int[] a = {1789,1790}; op[1788] = getOpcodeCat(a);}
        op[1789] = getOpcodeRnm(201, 1286); // boundComplexColFuncCall
        op[1790] = getOpcodeRep((char)0, (char)1, 1791);
        op[1791] = getOpcodeRnm(257, 1759); // boundFunctionExpr
        {int[] a = {1793,1794,1799}; op[1792] = getOpcodeCat(a);}
        {char[] a = {97,110,121,40}; op[1793] = getOpcodeTls(a);}
        op[1794] = getOpcodeRep((char)0, (char)1, 1795);
        {int[] a = {1796,1797,1798}; op[1795] = getOpcodeCat(a);}
        op[1796] = getOpcodeRnm(260, 1806); // lambdaVariableExpr
        {char[] a = {58}; op[1797] = getOpcodeTls(a);}
        op[1798] = getOpcodeRnm(261, 1807); // lambdaPredicateExpr
        {char[] a = {41}; op[1799] = getOpcodeTls(a);}
        {int[] a = {1801,1802,1803,1804,1805}; op[1800] = getOpcodeCat(a);}
        {char[] a = {97,108,108,40}; op[1801] = getOpcodeTls(a);}
        op[1802] = getOpcodeRnm(260, 1806); // lambdaVariableExpr
        {char[] a = {58}; op[1803] = getOpcodeTls(a);}
        op[1804] = getOpcodeRnm(261, 1807); // lambdaPredicateExpr
        {char[] a = {41}; op[1805] = getOpcodeTls(a);}
        op[1806] = getOpcodeRnm(57, 377); // odataIdentifier
        op[1807] = getOpcodeRnm(228, 1469); // boolCommonExpr
        {int[] a = {1809,1810,1811,1812,1813,1814,1815,1816,1817,1818,1819,1820,1821,1822,1823,1824,1825,1826,1827,1828,1829}; op[1808] = getOpcodeAlt(a);}
        op[1809] = getOpcodeRnm(263, 1830); // boolMethodExpr
        op[1810] = getOpcodeRnm(265, 1854); // indexOfMethodCallExpr
        op[1811] = getOpcodeRnm(266, 1871); // replaceMethodCallExpr
        op[1812] = getOpcodeRnm(268, 1911); // toLowerMethodCallExpr
        op[1813] = getOpcodeRnm(269, 1922); // toUpperMethodCallExpr
        op[1814] = getOpcodeRnm(270, 1933); // trimMethodCallExpr
        op[1815] = getOpcodeRnm(271, 1944); // substringMethodCallExpr
        op[1816] = getOpcodeRnm(273, 1988); // concatMethodCallExpr
        op[1817] = getOpcodeRnm(274, 2007); // lengthMethodCallExpr
        op[1818] = getOpcodeRnm(276, 2029); // yearMethodCallExpr
        op[1819] = getOpcodeRnm(277, 2040); // monthMethodCallExpr
        op[1820] = getOpcodeRnm(278, 2051); // dayMethodCallExpr
        op[1821] = getOpcodeRnm(279, 2062); // hourMethodCallExpr
        op[1822] = getOpcodeRnm(280, 2073); // minuteMethodCallExpr
        op[1823] = getOpcodeRnm(281, 2084); // secondMethodCallExpr
        op[1824] = getOpcodeRnm(282, 2095); // roundMethodCallExpr
        op[1825] = getOpcodeRnm(283, 2106); // floorMethodCallExpr
        op[1826] = getOpcodeRnm(284, 2117); // ceilingMethodCallExpr
        op[1827] = getOpcodeRnm(285, 2128); // distanceMethodCallExpr
        op[1828] = getOpcodeRnm(286, 2145); // geoLengthMethodCallExpr
        op[1829] = getOpcodeRnm(275, 2018); // getTotalOffsetMinutesExpr
        {int[] a = {1831,1832,1833,1834,1835,1836}; op[1830] = getOpcodeAlt(a);}
        op[1831] = getOpcodeRnm(264, 1837); // endsWithMethodCallExpr
        op[1832] = getOpcodeRnm(267, 1894); // startsWithMethodCallExpr
        op[1833] = getOpcodeRnm(272, 1969); // substringOfMethodCallExpr
        op[1834] = getOpcodeRnm(287, 2156); // intersectsMethodCallExpr
        op[1835] = getOpcodeRnm(289, 2174); // anyMethodCallExpr
        op[1836] = getOpcodeRnm(288, 2173); // allMethodCallExpr
        {int[] a = {1838,1839,1841,1842,1844,1845,1847,1848,1850,1851,1853}; op[1837] = getOpcodeCat(a);}
        {char[] a = {101,110,100,115,119,105,116,104}; op[1838] = getOpcodeTls(a);}
        op[1839] = getOpcodeRep((char)0, (char)1, 1840);
        op[1840] = getOpcodeRnm(10, 52); // WSP
        {char[] a = {40}; op[1841] = getOpcodeTls(a);}
        op[1842] = getOpcodeRep((char)0, (char)1, 1843);
        op[1843] = getOpcodeRnm(10, 52); // WSP
        op[1844] = getOpcodeRnm(227, 1449); // commonExpr
        op[1845] = getOpcodeRep((char)0, (char)1, 1846);
        op[1846] = getOpcodeRnm(10, 52); // WSP
        {char[] a = {44}; op[1847] = getOpcodeTls(a);}
        op[1848] = getOpcodeRep((char)0, (char)1, 1849);
        op[1849] = getOpcodeRnm(10, 52); // WSP
        op[1850] = getOpcodeRnm(227, 1449); // commonExpr
        op[1851] = getOpcodeRep((char)0, (char)1, 1852);
        op[1852] = getOpcodeRnm(10, 52); // WSP
        {char[] a = {41}; op[1853] = getOpcodeTls(a);}
        {int[] a = {1855,1856,1858,1859,1861,1862,1864,1865,1867,1868,1870}; op[1854] = getOpcodeCat(a);}
        {char[] a = {105,110,100,101,120,111,102}; op[1855] = getOpcodeTls(a);}
        op[1856] = getOpcodeRep((char)0, (char)1, 1857);
        op[1857] = getOpcodeRnm(10, 52); // WSP
        {char[] a = {40}; op[1858] = getOpcodeTls(a);}
        op[1859] = getOpcodeRep((char)0, (char)1, 1860);
        op[1860] = getOpcodeRnm(10, 52); // WSP
        op[1861] = getOpcodeRnm(227, 1449); // commonExpr
        op[1862] = getOpcodeRep((char)0, (char)1, 1863);
        op[1863] = getOpcodeRnm(10, 52); // WSP
        {char[] a = {44}; op[1864] = getOpcodeTls(a);}
        op[1865] = getOpcodeRep((char)0, (char)1, 1866);
        op[1866] = getOpcodeRnm(10, 52); // WSP
        op[1867] = getOpcodeRnm(227, 1449); // commonExpr
        op[1868] = getOpcodeRep((char)0, (char)1, 1869);
        op[1869] = getOpcodeRnm(10, 52); // WSP
        {char[] a = {41}; op[1870] = getOpcodeTls(a);}
        {int[] a = {1872,1873,1875,1876,1878,1879,1881,1882,1884,1885,1887,1888,1890,1891,1893}; op[1871] = getOpcodeCat(a);}
        {char[] a = {114,101,112,108,97,99,101}; op[1872] = getOpcodeTls(a);}
        op[1873] = getOpcodeRep((char)0, (char)1, 1874);
        op[1874] = getOpcodeRnm(10, 52); // WSP
        {char[] a = {40}; op[1875] = getOpcodeTls(a);}
        op[1876] = getOpcodeRep((char)0, (char)1, 1877);
        op[1877] = getOpcodeRnm(10, 52); // WSP
        op[1878] = getOpcodeRnm(227, 1449); // commonExpr
        op[1879] = getOpcodeRep((char)0, (char)1, 1880);
        op[1880] = getOpcodeRnm(10, 52); // WSP
        {char[] a = {44}; op[1881] = getOpcodeTls(a);}
        op[1882] = getOpcodeRep((char)0, (char)1, 1883);
        op[1883] = getOpcodeRnm(10, 52); // WSP
        op[1884] = getOpcodeRnm(227, 1449); // commonExpr
        op[1885] = getOpcodeRep((char)0, (char)1, 1886);
        op[1886] = getOpcodeRnm(10, 52); // WSP
        {char[] a = {44}; op[1887] = getOpcodeTls(a);}
        op[1888] = getOpcodeRep((char)0, (char)1, 1889);
        op[1889] = getOpcodeRnm(10, 52); // WSP
        op[1890] = getOpcodeRnm(227, 1449); // commonExpr
        op[1891] = getOpcodeRep((char)0, (char)1, 1892);
        op[1892] = getOpcodeRnm(10, 52); // WSP
        {char[] a = {41}; op[1893] = getOpcodeTls(a);}
        {int[] a = {1895,1896,1898,1899,1901,1902,1904,1905,1907,1908,1910}; op[1894] = getOpcodeCat(a);}
        {char[] a = {115,116,97,114,116,115,119,105,116,104}; op[1895] = getOpcodeTls(a);}
        op[1896] = getOpcodeRep((char)0, (char)1, 1897);
        op[1897] = getOpcodeRnm(10, 52); // WSP
        {char[] a = {40}; op[1898] = getOpcodeTls(a);}
        op[1899] = getOpcodeRep((char)0, (char)1, 1900);
        op[1900] = getOpcodeRnm(10, 52); // WSP
        op[1901] = getOpcodeRnm(227, 1449); // commonExpr
        op[1902] = getOpcodeRep((char)0, (char)1, 1903);
        op[1903] = getOpcodeRnm(10, 52); // WSP
        {char[] a = {44}; op[1904] = getOpcodeTls(a);}
        op[1905] = getOpcodeRep((char)0, (char)1, 1906);
        op[1906] = getOpcodeRnm(10, 52); // WSP
        op[1907] = getOpcodeRnm(227, 1449); // commonExpr
        op[1908] = getOpcodeRep((char)0, (char)1, 1909);
        op[1909] = getOpcodeRnm(10, 52); // WSP
        {char[] a = {41}; op[1910] = getOpcodeTls(a);}
        {int[] a = {1912,1913,1915,1916,1918,1919,1921}; op[1911] = getOpcodeCat(a);}
        {char[] a = {116,111,108,111,119,101,114}; op[1912] = getOpcodeTls(a);}
        op[1913] = getOpcodeRep((char)0, (char)1, 1914);
        op[1914] = getOpcodeRnm(10, 52); // WSP
        {char[] a = {40}; op[1915] = getOpcodeTls(a);}
        op[1916] = getOpcodeRep((char)0, (char)1, 1917);
        op[1917] = getOpcodeRnm(10, 52); // WSP
        op[1918] = getOpcodeRnm(227, 1449); // commonExpr
        op[1919] = getOpcodeRep((char)0, (char)1, 1920);
        op[1920] = getOpcodeRnm(10, 52); // WSP
        {char[] a = {41}; op[1921] = getOpcodeTls(a);}
        {int[] a = {1923,1924,1926,1927,1929,1930,1932}; op[1922] = getOpcodeCat(a);}
        {char[] a = {116,111,117,112,112,101,114}; op[1923] = getOpcodeTls(a);}
        op[1924] = getOpcodeRep((char)0, (char)1, 1925);
        op[1925] = getOpcodeRnm(10, 52); // WSP
        {char[] a = {40}; op[1926] = getOpcodeTls(a);}
        op[1927] = getOpcodeRep((char)0, (char)1, 1928);
        op[1928] = getOpcodeRnm(10, 52); // WSP
        op[1929] = getOpcodeRnm(227, 1449); // commonExpr
        op[1930] = getOpcodeRep((char)0, (char)1, 1931);
        op[1931] = getOpcodeRnm(10, 52); // WSP
        {char[] a = {41}; op[1932] = getOpcodeTls(a);}
        {int[] a = {1934,1935,1937,1938,1940,1941,1943}; op[1933] = getOpcodeCat(a);}
        {char[] a = {116,114,105,109}; op[1934] = getOpcodeTls(a);}
        op[1935] = getOpcodeRep((char)0, (char)1, 1936);
        op[1936] = getOpcodeRnm(10, 52); // WSP
        {char[] a = {40}; op[1937] = getOpcodeTls(a);}
        op[1938] = getOpcodeRep((char)0, (char)1, 1939);
        op[1939] = getOpcodeRnm(10, 52); // WSP
        op[1940] = getOpcodeRnm(227, 1449); // commonExpr
        op[1941] = getOpcodeRep((char)0, (char)1, 1942);
        op[1942] = getOpcodeRnm(10, 52); // WSP
        {char[] a = {41}; op[1943] = getOpcodeTls(a);}
        {int[] a = {1945,1946,1948,1949,1951,1952,1954,1955,1957,1958,1960,1968}; op[1944] = getOpcodeCat(a);}
        {char[] a = {115,117,98,115,116,114,105,110,103}; op[1945] = getOpcodeTls(a);}
        op[1946] = getOpcodeRep((char)0, (char)1, 1947);
        op[1947] = getOpcodeRnm(10, 52); // WSP
        {char[] a = {40}; op[1948] = getOpcodeTls(a);}
        op[1949] = getOpcodeRep((char)0, (char)1, 1950);
        op[1950] = getOpcodeRnm(10, 52); // WSP
        op[1951] = getOpcodeRnm(227, 1449); // commonExpr
        op[1952] = getOpcodeRep((char)0, (char)1, 1953);
        op[1953] = getOpcodeRnm(10, 52); // WSP
        {char[] a = {44}; op[1954] = getOpcodeTls(a);}
        op[1955] = getOpcodeRep((char)0, (char)1, 1956);
        op[1956] = getOpcodeRnm(10, 52); // WSP
        op[1957] = getOpcodeRnm(227, 1449); // commonExpr
        op[1958] = getOpcodeRep((char)0, (char)1, 1959);
        op[1959] = getOpcodeRnm(10, 52); // WSP
        op[1960] = getOpcodeRep((char)0, (char)1, 1961);
        {int[] a = {1962,1963,1965,1966}; op[1961] = getOpcodeCat(a);}
        {char[] a = {44}; op[1962] = getOpcodeTls(a);}
        op[1963] = getOpcodeRep((char)0, (char)1, 1964);
        op[1964] = getOpcodeRnm(10, 52); // WSP
        op[1965] = getOpcodeRnm(227, 1449); // commonExpr
        op[1966] = getOpcodeRep((char)0, (char)1, 1967);
        op[1967] = getOpcodeRnm(10, 52); // WSP
        {char[] a = {41}; op[1968] = getOpcodeTls(a);}
        {int[] a = {1970,1971,1973,1974,1976,1977,1979,1987}; op[1969] = getOpcodeCat(a);}
        {char[] a = {115,117,98,115,116,114,105,110,103,111,102}; op[1970] = getOpcodeTls(a);}
        op[1971] = getOpcodeRep((char)0, (char)1, 1972);
        op[1972] = getOpcodeRnm(10, 52); // WSP
        {char[] a = {40}; op[1973] = getOpcodeTls(a);}
        op[1974] = getOpcodeRep((char)0, (char)1, 1975);
        op[1975] = getOpcodeRnm(10, 52); // WSP
        op[1976] = getOpcodeRnm(227, 1449); // commonExpr
        op[1977] = getOpcodeRep((char)0, (char)1, 1978);
        op[1978] = getOpcodeRnm(10, 52); // WSP
        op[1979] = getOpcodeRep((char)0, (char)1, 1980);
        {int[] a = {1981,1982,1984,1985}; op[1980] = getOpcodeCat(a);}
        {char[] a = {44}; op[1981] = getOpcodeTls(a);}
        op[1982] = getOpcodeRep((char)0, (char)1, 1983);
        op[1983] = getOpcodeRnm(10, 52); // WSP
        op[1984] = getOpcodeRnm(227, 1449); // commonExpr
        op[1985] = getOpcodeRep((char)0, (char)1, 1986);
        op[1986] = getOpcodeRnm(10, 52); // WSP
        {char[] a = {41}; op[1987] = getOpcodeTls(a);}
        {int[] a = {1989,1990,1992,1993,1995,1996,1998,2006}; op[1988] = getOpcodeCat(a);}
        {char[] a = {99,111,110,99,97,116}; op[1989] = getOpcodeTls(a);}
        op[1990] = getOpcodeRep((char)0, (char)1, 1991);
        op[1991] = getOpcodeRnm(10, 52); // WSP
        {char[] a = {40}; op[1992] = getOpcodeTls(a);}
        op[1993] = getOpcodeRep((char)0, (char)1, 1994);
        op[1994] = getOpcodeRnm(10, 52); // WSP
        op[1995] = getOpcodeRnm(227, 1449); // commonExpr
        op[1996] = getOpcodeRep((char)0, (char)1, 1997);
        op[1997] = getOpcodeRnm(10, 52); // WSP
        op[1998] = getOpcodeRep((char)0, (char)1, 1999);
        {int[] a = {2000,2001,2003,2004}; op[1999] = getOpcodeCat(a);}
        {char[] a = {44}; op[2000] = getOpcodeTls(a);}
        op[2001] = getOpcodeRep((char)0, (char)1, 2002);
        op[2002] = getOpcodeRnm(10, 52); // WSP
        op[2003] = getOpcodeRnm(227, 1449); // commonExpr
        op[2004] = getOpcodeRep((char)0, (char)1, 2005);
        op[2005] = getOpcodeRnm(10, 52); // WSP
        {char[] a = {41}; op[2006] = getOpcodeTls(a);}
        {int[] a = {2008,2009,2011,2012,2014,2015,2017}; op[2007] = getOpcodeCat(a);}
        {char[] a = {108,101,110,103,116,104}; op[2008] = getOpcodeTls(a);}
        op[2009] = getOpcodeRep((char)0, (char)1, 2010);
        op[2010] = getOpcodeRnm(10, 52); // WSP
        {char[] a = {40}; op[2011] = getOpcodeTls(a);}
        op[2012] = getOpcodeRep((char)0, (char)1, 2013);
        op[2013] = getOpcodeRnm(10, 52); // WSP
        op[2014] = getOpcodeRnm(227, 1449); // commonExpr
        op[2015] = getOpcodeRep((char)0, (char)1, 2016);
        op[2016] = getOpcodeRnm(10, 52); // WSP
        {char[] a = {41}; op[2017] = getOpcodeTls(a);}
        {int[] a = {2019,2020,2022,2023,2025,2026,2028}; op[2018] = getOpcodeCat(a);}
        {char[] a = {103,101,116,116,111,116,97,108,111,102,102,115,101,116,109,105,110,117,116,101,115}; op[2019] = getOpcodeTls(a);}
        op[2020] = getOpcodeRep((char)0, (char)1, 2021);
        op[2021] = getOpcodeRnm(10, 52); // WSP
        {char[] a = {40}; op[2022] = getOpcodeTls(a);}
        op[2023] = getOpcodeRep((char)0, (char)1, 2024);
        op[2024] = getOpcodeRnm(10, 52); // WSP
        op[2025] = getOpcodeRnm(227, 1449); // commonExpr
        op[2026] = getOpcodeRep((char)0, (char)1, 2027);
        op[2027] = getOpcodeRnm(10, 52); // WSP
        {char[] a = {41}; op[2028] = getOpcodeTls(a);}
        {int[] a = {2030,2031,2033,2034,2036,2037,2039}; op[2029] = getOpcodeCat(a);}
        {char[] a = {121,101,97,114}; op[2030] = getOpcodeTls(a);}
        op[2031] = getOpcodeRep((char)0, (char)1, 2032);
        op[2032] = getOpcodeRnm(10, 52); // WSP
        {char[] a = {40}; op[2033] = getOpcodeTls(a);}
        op[2034] = getOpcodeRep((char)0, (char)1, 2035);
        op[2035] = getOpcodeRnm(10, 52); // WSP
        op[2036] = getOpcodeRnm(227, 1449); // commonExpr
        op[2037] = getOpcodeRep((char)0, (char)1, 2038);
        op[2038] = getOpcodeRnm(10, 52); // WSP
        {char[] a = {41}; op[2039] = getOpcodeTls(a);}
        {int[] a = {2041,2042,2044,2045,2047,2048,2050}; op[2040] = getOpcodeCat(a);}
        {char[] a = {109,111,110,116,104}; op[2041] = getOpcodeTls(a);}
        op[2042] = getOpcodeRep((char)0, (char)1, 2043);
        op[2043] = getOpcodeRnm(10, 52); // WSP
        {char[] a = {40}; op[2044] = getOpcodeTls(a);}
        op[2045] = getOpcodeRep((char)0, (char)1, 2046);
        op[2046] = getOpcodeRnm(10, 52); // WSP
        op[2047] = getOpcodeRnm(227, 1449); // commonExpr
        op[2048] = getOpcodeRep((char)0, (char)1, 2049);
        op[2049] = getOpcodeRnm(10, 52); // WSP
        {char[] a = {41}; op[2050] = getOpcodeTls(a);}
        {int[] a = {2052,2053,2055,2056,2058,2059,2061}; op[2051] = getOpcodeCat(a);}
        {char[] a = {100,97,121}; op[2052] = getOpcodeTls(a);}
        op[2053] = getOpcodeRep((char)0, (char)1, 2054);
        op[2054] = getOpcodeRnm(10, 52); // WSP
        {char[] a = {40}; op[2055] = getOpcodeTls(a);}
        op[2056] = getOpcodeRep((char)0, (char)1, 2057);
        op[2057] = getOpcodeRnm(10, 52); // WSP
        op[2058] = getOpcodeRnm(227, 1449); // commonExpr
        op[2059] = getOpcodeRep((char)0, (char)1, 2060);
        op[2060] = getOpcodeRnm(10, 52); // WSP
        {char[] a = {41}; op[2061] = getOpcodeTls(a);}
        {int[] a = {2063,2064,2066,2067,2069,2070,2072}; op[2062] = getOpcodeCat(a);}
        {char[] a = {104,111,117,114}; op[2063] = getOpcodeTls(a);}
        op[2064] = getOpcodeRep((char)0, (char)1, 2065);
        op[2065] = getOpcodeRnm(10, 52); // WSP
        {char[] a = {40}; op[2066] = getOpcodeTls(a);}
        op[2067] = getOpcodeRep((char)0, (char)1, 2068);
        op[2068] = getOpcodeRnm(10, 52); // WSP
        op[2069] = getOpcodeRnm(227, 1449); // commonExpr
        op[2070] = getOpcodeRep((char)0, (char)1, 2071);
        op[2071] = getOpcodeRnm(10, 52); // WSP
        {char[] a = {41}; op[2072] = getOpcodeTls(a);}
        {int[] a = {2074,2075,2077,2078,2080,2081,2083}; op[2073] = getOpcodeCat(a);}
        {char[] a = {109,105,110,117,116,101}; op[2074] = getOpcodeTls(a);}
        op[2075] = getOpcodeRep((char)0, (char)1, 2076);
        op[2076] = getOpcodeRnm(10, 52); // WSP
        {char[] a = {40}; op[2077] = getOpcodeTls(a);}
        op[2078] = getOpcodeRep((char)0, (char)1, 2079);
        op[2079] = getOpcodeRnm(10, 52); // WSP
        op[2080] = getOpcodeRnm(227, 1449); // commonExpr
        op[2081] = getOpcodeRep((char)0, (char)1, 2082);
        op[2082] = getOpcodeRnm(10, 52); // WSP
        {char[] a = {41}; op[2083] = getOpcodeTls(a);}
        {int[] a = {2085,2086,2088,2089,2091,2092,2094}; op[2084] = getOpcodeCat(a);}
        {char[] a = {115,101,99,111,110,100}; op[2085] = getOpcodeTls(a);}
        op[2086] = getOpcodeRep((char)0, (char)1, 2087);
        op[2087] = getOpcodeRnm(10, 52); // WSP
        {char[] a = {40}; op[2088] = getOpcodeTls(a);}
        op[2089] = getOpcodeRep((char)0, (char)1, 2090);
        op[2090] = getOpcodeRnm(10, 52); // WSP
        op[2091] = getOpcodeRnm(227, 1449); // commonExpr
        op[2092] = getOpcodeRep((char)0, (char)1, 2093);
        op[2093] = getOpcodeRnm(10, 52); // WSP
        {char[] a = {41}; op[2094] = getOpcodeTls(a);}
        {int[] a = {2096,2097,2099,2100,2102,2103,2105}; op[2095] = getOpcodeCat(a);}
        {char[] a = {114,111,117,110,100}; op[2096] = getOpcodeTls(a);}
        op[2097] = getOpcodeRep((char)0, (char)1, 2098);
        op[2098] = getOpcodeRnm(10, 52); // WSP
        {char[] a = {40}; op[2099] = getOpcodeTls(a);}
        op[2100] = getOpcodeRep((char)0, (char)1, 2101);
        op[2101] = getOpcodeRnm(10, 52); // WSP
        op[2102] = getOpcodeRnm(227, 1449); // commonExpr
        op[2103] = getOpcodeRep((char)0, (char)1, 2104);
        op[2104] = getOpcodeRnm(10, 52); // WSP
        {char[] a = {41}; op[2105] = getOpcodeTls(a);}
        {int[] a = {2107,2108,2110,2111,2113,2114,2116}; op[2106] = getOpcodeCat(a);}
        {char[] a = {102,108,111,111,114}; op[2107] = getOpcodeTls(a);}
        op[2108] = getOpcodeRep((char)0, (char)1, 2109);
        op[2109] = getOpcodeRnm(10, 52); // WSP
        {char[] a = {40}; op[2110] = getOpcodeTls(a);}
        op[2111] = getOpcodeRep((char)0, (char)1, 2112);
        op[2112] = getOpcodeRnm(10, 52); // WSP
        op[2113] = getOpcodeRnm(227, 1449); // commonExpr
        op[2114] = getOpcodeRep((char)0, (char)1, 2115);
        op[2115] = getOpcodeRnm(10, 52); // WSP
        {char[] a = {41}; op[2116] = getOpcodeTls(a);}
        {int[] a = {2118,2119,2121,2122,2124,2125,2127}; op[2117] = getOpcodeCat(a);}
        {char[] a = {99,101,105,108,105,110,103}; op[2118] = getOpcodeTls(a);}
        op[2119] = getOpcodeRep((char)0, (char)1, 2120);
        op[2120] = getOpcodeRnm(10, 52); // WSP
        {char[] a = {40}; op[2121] = getOpcodeTls(a);}
        op[2122] = getOpcodeRep((char)0, (char)1, 2123);
        op[2123] = getOpcodeRnm(10, 52); // WSP
        op[2124] = getOpcodeRnm(227, 1449); // commonExpr
        op[2125] = getOpcodeRep((char)0, (char)1, 2126);
        op[2126] = getOpcodeRnm(10, 52); // WSP
        {char[] a = {41}; op[2127] = getOpcodeTls(a);}
        {int[] a = {2129,2130,2132,2133,2135,2136,2138,2139,2141,2142,2144}; op[2128] = getOpcodeCat(a);}
        {char[] a = {103,101,111,46,100,105,115,116,97,110,99,101}; op[2129] = getOpcodeTls(a);}
        op[2130] = getOpcodeRep((char)0, (char)1, 2131);
        op[2131] = getOpcodeRnm(10, 52); // WSP
        {char[] a = {40}; op[2132] = getOpcodeTls(a);}
        op[2133] = getOpcodeRep((char)0, (char)1, 2134);
        op[2134] = getOpcodeRnm(10, 52); // WSP
        op[2135] = getOpcodeRnm(227, 1449); // commonExpr
        op[2136] = getOpcodeRep((char)0, (char)1, 2137);
        op[2137] = getOpcodeRnm(10, 52); // WSP
        {char[] a = {44}; op[2138] = getOpcodeTls(a);}
        op[2139] = getOpcodeRep((char)0, (char)1, 2140);
        op[2140] = getOpcodeRnm(10, 52); // WSP
        op[2141] = getOpcodeRnm(227, 1449); // commonExpr
        op[2142] = getOpcodeRep((char)0, (char)1, 2143);
        op[2143] = getOpcodeRnm(10, 52); // WSP
        {char[] a = {41}; op[2144] = getOpcodeTls(a);}
        {int[] a = {2146,2147,2149,2150,2152,2153,2155}; op[2145] = getOpcodeCat(a);}
        {char[] a = {103,101,111,46,108,101,110,103,116,104}; op[2146] = getOpcodeTls(a);}
        op[2147] = getOpcodeRep((char)0, (char)1, 2148);
        op[2148] = getOpcodeRnm(10, 52); // WSP
        {char[] a = {40}; op[2149] = getOpcodeTls(a);}
        op[2150] = getOpcodeRep((char)0, (char)1, 2151);
        op[2151] = getOpcodeRnm(10, 52); // WSP
        op[2152] = getOpcodeRnm(227, 1449); // commonExpr
        op[2153] = getOpcodeRep((char)0, (char)1, 2154);
        op[2154] = getOpcodeRnm(10, 52); // WSP
        {char[] a = {41}; op[2155] = getOpcodeTls(a);}
        {int[] a = {2157,2158,2160,2161,2163,2164,2166,2167,2169,2170,2172}; op[2156] = getOpcodeCat(a);}
        {char[] a = {103,101,111,46,105,110,116,101,114,115,101,99,116,115}; op[2157] = getOpcodeTls(a);}
        op[2158] = getOpcodeRep((char)0, (char)1, 2159);
        op[2159] = getOpcodeRnm(10, 52); // WSP
        {char[] a = {40}; op[2160] = getOpcodeTls(a);}
        op[2161] = getOpcodeRep((char)0, (char)1, 2162);
        op[2162] = getOpcodeRnm(10, 52); // WSP
        op[2163] = getOpcodeRnm(227, 1449); // commonExpr
        op[2164] = getOpcodeRep((char)0, (char)1, 2165);
        op[2165] = getOpcodeRnm(10, 52); // WSP
        {char[] a = {44}; op[2166] = getOpcodeTls(a);}
        op[2167] = getOpcodeRep((char)0, (char)1, 2168);
        op[2168] = getOpcodeRnm(10, 52); // WSP
        op[2169] = getOpcodeRnm(227, 1449); // commonExpr
        op[2170] = getOpcodeRep((char)0, (char)1, 2171);
        op[2171] = getOpcodeRnm(10, 52); // WSP
        {char[] a = {41}; op[2172] = getOpcodeTls(a);}
        {char[] a = {123,84,79,68,79,50,53,125}; op[2173] = getOpcodeTls(a);}
        {char[] a = {123,84,79,68,79,50,54,125}; op[2174] = getOpcodeTls(a);}
        {char[] a = {123,84,79,68,79,50,55,125}; op[2175] = getOpcodeTls(a);}
        {char[] a = {123,84,79,68,79,50,56,125}; op[2176] = getOpcodeTls(a);}
        {char[] a = {123,84,79,68,79,51,48,125}; op[2177] = getOpcodeTls(a);}
        {char[] a = {123,84,79,68,79,51,50,125}; op[2178] = getOpcodeTls(a);}
        {char[] a = {123,84,79,68,79,51,53,125}; op[2179] = getOpcodeTls(a);}
        {char[] a = {123,84,79,68,79,52,53,125}; op[2180] = getOpcodeTls(a);}
        {char[] a = {123,84,79,68,79,52,57,125}; op[2181] = getOpcodeTls(a);}
        {char[] a = {123,84,79,68,79,53,49,125}; op[2182] = getOpcodeTls(a);}
        {char[] a = {123,84,79,68,79,53,51,125}; op[2183] = getOpcodeTls(a);}
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
        out.println("serviceRoot      = \"/\" *( segment-nz \"/\" )");
        out.println("odataRelativeUri = resourcePath [\"?\" queryOptions ]");
        out.println("");
        out.println("queryOptions = queryOption *(\"&\" queryOption)        ");
        out.println("queryOption  = systemQueryOption  ");
        out.println("             / customQueryOption  ");
        out.println("             / sopParameterNameAndValue  ");
        out.println("             / aliasAndValue ");
        out.println("             / parameterNameAndValue");
        out.println("");
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
        out.println("nan              = %x4e %x61 %x4e ; NaN (upper lower upper case)");
        out.println("positiveInfinity = %x49 %x4e %x46 ; INF (all upper case)");
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
        out.println("; Names and identifiers");
        out.println("odataIdentifier             = identifierLeadingCharacter *478identifierCharacter");
        out.println("identifierLeadingCharacter  = ALPHA / \"_\"            ; TODO: Any character from the Unicode classes L or Nl");
        out.println("identifierCharacter         = ALPHA / DIGIT / \"_\"    ; TODO: Any character from the Unicode classes L, Nl, Nd, Mn, Mc, Pc or Cf");
        out.println("namespacePart = odataIdentifier");
        out.println("namespace = namespacePart *(\".\" namespacePart)");
        out.println("entitySetName = odataIdentifier");
        out.println("entityTypeName = odataIdentifier");
        out.println("complexTypeName = odataIdentifier ");
        out.println("enumerationTypeName = odataIdentifier");
        out.println("operationQualifier = [ namespace \".\" ] entityContainerName \".\"");
        out.println("allOperationsInContainer = operationQualifier \"*\"                  ");
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
        out.println("qualifiedEntityTypeName = namespace \".\" entityTypeName");
        out.println("qualifiedComplexTypeName = namespace \".\" complexTypeName");
        out.println("qualifiedEnumerationTypeName = namespace \".\" enumerationTypeName");
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
        out.println(";serviceOperation = entityServiceOp  ");
        out.println(";                 / entityColServiceOp ");
        out.println(";                 / complexServiceOp  ");
        out.println(";                 / complexColServiceOp ");
        out.println(";                 / primitiveServiceOp ");
        out.println(";                 / primitiveColServiceOp ");
        out.println("entityServiceOp = odataIdentifier        ");
        out.println("entityColServiceOp = odataIdentifier        ");
        out.println("complexServiceOp = odataIdentifier        ");
        out.println("complexColServiceOp = odataIdentifier        ");
        out.println("primitiveServiceOp = odataIdentifier        ");
        out.println(";primitiveColServiceOp = odataIdentifier");
        out.println("entityNavigationProperty = odataIdentifier");
        out.println("entityColNavigationProperty = odataIdentifier");
        out.println("navigationProperty = entityNavigationProperty / entityColNavigationProperty  ");
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
        out.println("action = entityAction / ");
        out.println(" entityColAction /");
        out.println(" complexAction /");
        out.println(" complexColAction /");
        out.println(" primitiveAction / ");
        out.println(" primitiveColAction / ");
        out.println(" voidAction");
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
        out.println("null = %x6e %x75 %x6c %x6c            ; null (all lower case)");
        out.println("       [ \"'\" qualifiedTypeName \"'\" ] ");
        out.println(" ; The optional qualifiedTypeName is used to specify what type this null value should be considered. ");
        out.println(" ; Knowing the type is useful for function overload resolution purposes. ");
        out.println("                                                ");
        out.println("binary = ( %d88 / \"binary\" ) SQUOTE *(2HEXDIG) SQUOTE ; note: \"X\" is case sensitive \"binary\" is not hence using the character code.");
        out.println("boolean = ( \"true\" / \"1\" ) / ( \"false\" / \"0\" )");
        out.println("byte = 1*3DIGIT ; numbers in the range from 0 to 257");
        out.println("dateTime = \"datetime\" SQUOTE dateTimeBody SQUOTE");
        out.println("dateTimeOffset = \"datetimeoffset\" SQUOTE dateTimeOffsetBody SQUOTE");
        out.println("dateTimeBody = year \"-\" month \"-\" day \"T\" ");
        out.println("               ( hour \":\" minute [ \":\" second [ \".\" fractionalSeconds ] ]");
        out.println("               / \"24:00\" [ \":00\" ] ; the first instant of the following day");
        out.println("               ) ");
        out.println("dateTimeOffsetBody = dateTimeBody ( \"Z\" / sign hour \":\" minute )");
        out.println("decimal = decimalBody [ \"M\" ]");
        out.println("decimalBody = [sign] 1*DIGIT [\".\" 1*DIGIT]");
        out.println("            ; / [sign] \".\" 1*DIGIT ;TODO: allow also this pattern?");
        out.println("doubleBody = decimalBody [ \"E\" [sign] 1*DIGIT ] ; TODO: restrict range");
        out.println("           / nanInfinity");
        out.println("double = doubleBody [ \"D\" ]");
        out.println("singleBody = decimalBody [ \"E\" [sign] 1*DIGIT ] ; TODO: restrict range");
        out.println("           / nanInfinity");
        out.println("single = singleBody [ \"F\" ]");
        out.println(" ");
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
        out.println("");
        out.println("string = SQUOTE *( unreserved / pct-encoded / SQUOTE-in-string ) SQUOTE ; TODO; was SQUOTE *UTF8-char SQUOTE, but that's not sufficient for use in URLs");
        out.println("SQUOTE-in-string = SQUOTE SQUOTE ; two quotes represent one within string literal in quotes");
        out.println("time = \"time\" SQUOTE [ sign ] \"P\" [ 1*DIGIT \"Y\" ] [ 1*DIGIT \"M\" ] [ 1*DIGIT \"D\" ] [ \"T\" [ 1*DIGIT \"H\" ] [ 1*DIGIT \"M\" ] [ 1*DIGIT [ \".\" 1*DIGIT ] \"S\" ] ] SQUOTE");
        out.println(" ; the above is an approximation of the rules for an xml duration.");
        out.println(" ; see the lexical representation for duration in http://www.w3.org/TR/xmlschema-2 for more information");
        out.println("");
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
        out.println("                                                                                propertyName / ; TODO: also allow properties of complex properties");
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
        out.println("resourcePath = [ entityContainerName \".\" ] entitySetName [count / collectionNavigation / keyPredicate [ singleNavigation ] ] /");
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
        out.println("parameterNameAndValue                       =       functionParameterName \"=\" parameterValue");
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
        out.println(";serviceOperationCall            =       entityServiceOpCall / ");
        out.println(";                                                                        entityColServiceOpCall /");
        out.println(";                                                                        complexServiceOpCall / ");
        out.println(";                                                                        complexColServiceOpCall /");
        out.println(";                                                                        primitiveServiceOpCall /");
        out.println(";                                                                        primitiveColServiceOpCall ");
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
