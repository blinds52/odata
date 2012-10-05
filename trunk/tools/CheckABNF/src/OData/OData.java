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
    public static int ruleCount = 276;
    /** This enum provides easy to remember enum constants for locating the rule identifiers and names.
     * The enum constants have the same spelling as the rule names rendered in all caps with underscores replacing hyphens. */
    public enum RuleNames{
        /** id = <code>120</code>, name = <code>"abstractSpatialTypeName"</code> */
        ABSTRACTSPATIALTYPENAME("abstractSpatialTypeName", 120, 838, 3),
        /** id = <code>134</code>, name = <code>"action"</code> */
        ACTION("action", 134, 870, 1),
        /** id = <code>157</code>, name = <code>"actionCall"</code> */
        ACTIONCALL("actionCall", 157, 1045, 6),
        /** id = <code>262</code>, name = <code>"addExpr"</code> */
        ADDEXPR("addExpr", 262, 1897, 8),
        /** id = <code>176</code>, name = <code>"aliasAndValue"</code> */
        ALIASANDVALUE("aliasAndValue", 176, 1109, 4),
        /** id = <code>225</code>, name = <code>"allExpr"</code> */
        ALLEXPR("allExpr", 225, 1519, 6),
        /** id = <code>221</code>, name = <code>"allMethodCallExpr"</code> */
        ALLMETHODCALLEXPR("allMethodCallExpr", 221, 1495, 4),
        /** id = <code>18</code>, name = <code>"allOperationsInContainer"</code> */
        ALLOPERATIONSINCONTAINER("allOperationsInContainer", 18, 151, 3),
        /** id = <code>28</code>, name = <code>"ALPHA"</code> */
        ALPHA("ALPHA", 28, 228, 3),
        /** id = <code>254</code>, name = <code>"andExpr"</code> */
        ANDEXPR("andExpr", 254, 1833, 8),
        /** id = <code>224</code>, name = <code>"anyExpr"</code> */
        ANYEXPR("anyExpr", 224, 1511, 8),
        /** id = <code>222</code>, name = <code>"anyMethodCallExpr"</code> */
        ANYMETHODCALLEXPR("anyMethodCallExpr", 222, 1499, 4),
        /** id = <code>184</code>, name = <code>"begin-array"</code> */
        BEGIN_ARRAY("begin-array", 184, 1161, 1),
        /** id = <code>182</code>, name = <code>"begin-object"</code> */
        BEGIN_OBJECT("begin-object", 182, 1159, 1),
        /** id = <code>71</code>, name = <code>"binary"</code> */
        BINARY("binary", 71, 551, 9),
        /** id = <code>271</code>, name = <code>"boolCastExpr"</code> */
        BOOLCASTEXPR("boolCastExpr", 271, 1977, 15),
        /** id = <code>202</code>, name = <code>"boolCommonExpr"</code> */
        BOOLCOMMONEXPR("boolCommonExpr", 202, 1261, 18),
        /** id = <code>72</code>, name = <code>"boolean"</code> */
        BOOLEAN("boolean", 72, 560, 7),
        /** id = <code>208</code>, name = <code>"boolFunctionCall"</code> */
        BOOLFUNCTIONCALL("boolFunctionCall", 208, 1346, 1),
        /** id = <code>220</code>, name = <code>"boolMethodCallExpr"</code> */
        BOOLMETHODCALLEXPR("boolMethodCallExpr", 220, 1488, 7),
        /** id = <code>253</code>, name = <code>"boolParenExpr"</code> */
        BOOLPARENEXPR("boolParenExpr", 253, 1825, 8),
        /** id = <code>204</code>, name = <code>"boolPrimitiveMemberExpr"</code> */
        BOOLPRIMITIVEMEMBEREXPR("boolPrimitiveMemberExpr", 204, 1285, 8),
        /** id = <code>158</code>, name = <code>"boundActionCall"</code> */
        BOUNDACTIONCALL("boundActionCall", 158, 1051, 1),
        /** id = <code>168</code>, name = <code>"boundComplexColFuncCall"</code> */
        BOUNDCOMPLEXCOLFUNCCALL("boundComplexColFuncCall", 168, 1085, 1),
        /** id = <code>167</code>, name = <code>"boundComplexFuncCall"</code> */
        BOUNDCOMPLEXFUNCCALL("boundComplexFuncCall", 167, 1084, 1),
        /** id = <code>166</code>, name = <code>"boundEntityColFuncCall"</code> */
        BOUNDENTITYCOLFUNCCALL("boundEntityColFuncCall", 166, 1083, 1),
        /** id = <code>165</code>, name = <code>"boundEntityFuncCall"</code> */
        BOUNDENTITYFUNCCALL("boundEntityFuncCall", 165, 1082, 1),
        /** id = <code>218</code>, name = <code>"boundFunctionExpr"</code> */
        BOUNDFUNCTIONEXPR("boundFunctionExpr", 218, 1428, 33),
        /** id = <code>156</code>, name = <code>"boundOperation"</code> */
        BOUNDOPERATION("boundOperation", 156, 1017, 28),
        /** id = <code>170</code>, name = <code>"boundPrimitiveColFuncCall"</code> */
        BOUNDPRIMITIVECOLFUNCCALL("boundPrimitiveColFuncCall", 170, 1087, 1),
        /** id = <code>169</code>, name = <code>"boundPrimitiveFuncCall"</code> */
        BOUNDPRIMITIVEFUNCCALL("boundPrimitiveFuncCall", 169, 1086, 1),
        /** id = <code>84</code>, name = <code>"byte"</code> */
        BYTE("byte", 84, 672, 2),
        /** id = <code>270</code>, name = <code>"castExpr"</code> */
        CASTEXPR("castExpr", 270, 1962, 15),
        /** id = <code>251</code>, name = <code>"ceilingMethodCallExpr"</code> */
        CEILINGMETHODCALLEXPR("ceilingMethodCallExpr", 251, 1806, 11),
        /** id = <code>194</code>, name = <code>"charInJSON"</code> */
        CHARINJSON("charInJSON", 194, 1200, 1),
        /** id = <code>143</code>, name = <code>"collectionNavigation"</code> */
        COLLECTIONNAVIGATION("collectionNavigation", 143, 918, 11),
        /** id = <code>216</code>, name = <code>"collectionNavigationExpr"</code> */
        COLLECTIONNAVIGATIONEXPR("collectionNavigationExpr", 216, 1390, 10),
        /** id = <code>150</code>, name = <code>"collectionPath"</code> */
        COLLECTIONPATH("collectionPath", 150, 990, 3),
        /** id = <code>200</code>, name = <code>"collectionPropertyInUri"</code> */
        COLLECTIONPROPERTYINURI("collectionPropertyInUri", 200, 1233, 13),
        /** id = <code>214</code>, name = <code>"collectionPropertyPath"</code> */
        COLLECTIONPROPERTYPATH("collectionPropertyPath", 214, 1366, 11),
        /** id = <code>53</code>, name = <code>"COMMA"</code> */
        COMMA("COMMA", 53, 440, 1),
        /** id = <code>201</code>, name = <code>"commonExpr"</code> */
        COMMONEXPR("commonExpr", 201, 1246, 15),
        /** id = <code>139</code>, name = <code>"complexColFunction"</code> */
        COMPLEXCOLFUNCTION("complexColFunction", 139, 881, 1),
        /** id = <code>162</code>, name = <code>"complexColFunctionCall"</code> */
        COMPLEXCOLFUNCTIONCALL("complexColFunctionCall", 162, 1067, 5),
        /** id = <code>180</code>, name = <code>"complexColInUri"</code> */
        COMPLEXCOLINURI("complexColInUri", 180, 1139, 10),
        /** id = <code>128</code>, name = <code>"complexColProperty"</code> */
        COMPLEXCOLPROPERTY("complexColProperty", 128, 862, 1),
        /** id = <code>138</code>, name = <code>"complexFunction"</code> */
        COMPLEXFUNCTION("complexFunction", 138, 880, 1),
        /** id = <code>161</code>, name = <code>"complexFunctionCall"</code> */
        COMPLEXFUNCTIONCALL("complexFunctionCall", 161, 1062, 5),
        /** id = <code>179</code>, name = <code>"complexInUri"</code> */
        COMPLEXINURI("complexInUri", 179, 1122, 17),
        /** id = <code>152</code>, name = <code>"complexPath"</code> */
        COMPLEXPATH("complexPath", 152, 996, 18),
        /** id = <code>127</code>, name = <code>"complexProperty"</code> */
        COMPLEXPROPERTY("complexProperty", 127, 861, 1),
        /** id = <code>199</code>, name = <code>"complexPropertyInUri"</code> */
        COMPLEXPROPERTYINURI("complexPropertyInUri", 199, 1227, 6),
        /** id = <code>215</code>, name = <code>"complexPropertyPath"</code> */
        COMPLEXPROPERTYPATH("complexPropertyPath", 215, 1377, 13),
        /** id = <code>189</code>, name = <code>"complexTypeMetadataInUri"</code> */
        COMPLEXTYPEMETADATAINURI("complexTypeMetadataInUri", 189, 1166, 9),
        /** id = <code>113</code>, name = <code>"complexTypeName"</code> */
        COMPLEXTYPENAME("complexTypeName", 113, 786, 1),
        /** id = <code>146</code>, name = <code>"compoundKey"</code> */
        COMPOUNDKEY("compoundKey", 146, 936, 8),
        /** id = <code>236</code>, name = <code>"concatMethodCallExpr"</code> */
        CONCATMETHODCALLEXPR("concatMethodCallExpr", 236, 1639, 13),
        /** id = <code>121</code>, name = <code>"concreteSpatialTypeName"</code> */
        CONCRETESPATIALTYPENAME("concreteSpatialTypeName", 121, 841, 8),
        /** id = <code>153</code>, name = <code>"count"</code> */
        COUNT("count", 153, 1014, 1),
        /** id = <code>26</code>, name = <code>"customName"</code> */
        CUSTOMNAME("customName", 26, 204, 15),
        /** id = <code>25</code>, name = <code>"customQueryOption"</code> */
        CUSTOMQUERYOPTION("customQueryOption", 25, 198, 6),
        /** id = <code>27</code>, name = <code>"customValue"</code> */
        CUSTOMVALUE("customValue", 27, 219, 9),
        /** id = <code>73</code>, name = <code>"dateTime"</code> */
        DATETIME("dateTime", 73, 567, 5),
        /** id = <code>75</code>, name = <code>"dateTimeBody"</code> */
        DATETIMEBODY("dateTimeBody", 75, 577, 24),
        /** id = <code>74</code>, name = <code>"dateTimeOffset"</code> */
        DATETIMEOFFSET("dateTimeOffset", 74, 572, 5),
        /** id = <code>76</code>, name = <code>"dateTimeOffsetBody"</code> */
        DATETIMEOFFSETBODY("dateTimeOffsetBody", 76, 601, 9),
        /** id = <code>64</code>, name = <code>"day"</code> */
        DAY("day", 64, 485, 12),
        /** id = <code>241</code>, name = <code>"dayMethodCallExpr"</code> */
        DAYMETHODCALLEXPR("dayMethodCallExpr", 241, 1696, 11),
        /** id = <code>242</code>, name = <code>"daysMethodCallExpr"</code> */
        DAYSMETHODCALLEXPR("daysMethodCallExpr", 242, 1707, 11),
        /** id = <code>44</code>, name = <code>"dec-octet"</code> */
        DEC_OCTET("dec-octet", 44, 385, 16),
        /** id = <code>77</code>, name = <code>"decimal"</code> */
        DECIMAL("decimal", 77, 610, 4),
        /** id = <code>78</code>, name = <code>"decimalBody"</code> */
        DECIMALBODY("decimalBody", 78, 614, 10),
        /** id = <code>29</code>, name = <code>"DIGIT"</code> */
        DIGIT("DIGIT", 29, 231, 1),
        /** id = <code>273</code>, name = <code>"distanceMethodCallExpr"</code> */
        DISTANCEMETHODCALLEXPR("distanceMethodCallExpr", 273, 2003, 13),
        /** id = <code>265</code>, name = <code>"divExpr"</code> */
        DIVEXPR("divExpr", 265, 1921, 8),
        /** id = <code>80</code>, name = <code>"double"</code> */
        DOUBLE("double", 80, 635, 4),
        /** id = <code>79</code>, name = <code>"doubleBody"</code> */
        DOUBLEBODY("doubleBody", 79, 624, 11),
        /** id = <code>31</code>, name = <code>"DQUOTE"</code> */
        DQUOTE("DQUOTE", 31, 240, 1),
        /** id = <code>185</code>, name = <code>"end-array"</code> */
        END_ARRAY("end-array", 185, 1162, 1),
        /** id = <code>183</code>, name = <code>"end-object"</code> */
        END_OBJECT("end-object", 183, 1160, 1),
        /** id = <code>229</code>, name = <code>"endsWithMethodCallExpr"</code> */
        ENDSWITHMETHODCALLEXPR("endsWithMethodCallExpr", 229, 1552, 13),
        /** id = <code>137</code>, name = <code>"entityColFunction"</code> */
        ENTITYCOLFUNCTION("entityColFunction", 137, 879, 1),
        /** id = <code>160</code>, name = <code>"entityColFunctionCall"</code> */
        ENTITYCOLFUNCTIONCALL("entityColFunctionCall", 160, 1057, 5),
        /** id = <code>132</code>, name = <code>"entityColNavigationProperty"</code> */
        ENTITYCOLNAVIGATIONPROPERTY("entityColNavigationProperty", 132, 868, 1),
        /** id = <code>133</code>, name = <code>"entityContainerName"</code> */
        ENTITYCONTAINERNAME("entityContainerName", 133, 869, 1),
        /** id = <code>136</code>, name = <code>"entityFunction"</code> */
        ENTITYFUNCTION("entityFunction", 136, 878, 1),
        /** id = <code>159</code>, name = <code>"entityFunctionCall"</code> */
        ENTITYFUNCTIONCALL("entityFunctionCall", 159, 1052, 5),
        /** id = <code>131</code>, name = <code>"entityNavigationProperty"</code> */
        ENTITYNAVIGATIONPROPERTY("entityNavigationProperty", 131, 867, 1),
        /** id = <code>111</code>, name = <code>"entitySetName"</code> */
        ENTITYSETNAME("entitySetName", 111, 784, 1),
        /** id = <code>112</code>, name = <code>"entityTypeName"</code> */
        ENTITYTYPENAME("entityTypeName", 112, 785, 1),
        /** id = <code>114</code>, name = <code>"enumerationTypeName"</code> */
        ENUMERATIONTYPENAME("enumerationTypeName", 114, 787, 1),
        /** id = <code>256</code>, name = <code>"eqExpr"</code> */
        EQEXPR("eqExpr", 256, 1849, 8),
        /** id = <code>198</code>, name = <code>"exp"</code> */
        EXP("exp", 198, 1219, 8),
        /** id = <code>6</code>, name = <code>"expand"</code> */
        EXPAND("expand", 6, 47, 3),
        /** id = <code>7</code>, name = <code>"expandClause"</code> */
        EXPANDCLAUSE("expandClause", 7, 50, 6),
        /** id = <code>8</code>, name = <code>"expandItem"</code> */
        EXPANDITEM("expandItem", 8, 56, 14),
        /** id = <code>9</code>, name = <code>"filter"</code> */
        FILTER("filter", 9, 70, 3),
        /** id = <code>203</code>, name = <code>"firstBoolPrimitiveMemExpr"</code> */
        FIRSTBOOLPRIMITIVEMEMEXPR("firstBoolPrimitiveMemExpr", 203, 1279, 6),
        /** id = <code>206</code>, name = <code>"firstMemberExpr"</code> */
        FIRSTMEMBEREXPR("firstMemberExpr", 206, 1316, 23),
        /** id = <code>250</code>, name = <code>"floorMethodCallExpr"</code> */
        FLOORMETHODCALLEXPR("floorMethodCallExpr", 250, 1795, 11),
        /** id = <code>13</code>, name = <code>"format"</code> */
        FORMAT("format", 13, 102, 10),
        /** id = <code>197</code>, name = <code>"frac"</code> */
        FRAC("frac", 197, 1215, 4),
        /** id = <code>68</code>, name = <code>"fractionalSeconds"</code> */
        FRACTIONALSECONDS("fractionalSeconds", 68, 511, 2),
        /** id = <code>135</code>, name = <code>"function"</code> */
        FUNCTION("function", 135, 871, 7),
        /** id = <code>207</code>, name = <code>"functionCall"</code> */
        FUNCTIONCALL("functionCall", 207, 1339, 7),
        /** id = <code>172</code>, name = <code>"functionParameter"</code> */
        FUNCTIONPARAMETER("functionParameter", 172, 1098, 6),
        /** id = <code>173</code>, name = <code>"functionParameterName"</code> */
        FUNCTIONPARAMETERNAME("functionParameterName", 173, 1104, 1),
        /** id = <code>171</code>, name = <code>"functionParameters"</code> */
        FUNCTIONPARAMETERS("functionParameters", 171, 1088, 10),
        /** id = <code>261</code>, name = <code>"geExpr"</code> */
        GEEXPR("geExpr", 261, 1889, 8),
        /** id = <code>92</code>, name = <code>"geographyCollection"</code> */
        GEOGRAPHYCOLLECTION("geographyCollection", 92, 752, 1),
        /** id = <code>93</code>, name = <code>"geographyLineString"</code> */
        GEOGRAPHYLINESTRING("geographyLineString", 93, 753, 1),
        /** id = <code>94</code>, name = <code>"geographyMultiLineString"</code> */
        GEOGRAPHYMULTILINESTRING("geographyMultiLineString", 94, 754, 1),
        /** id = <code>95</code>, name = <code>"geographyMultiPoint"</code> */
        GEOGRAPHYMULTIPOINT("geographyMultiPoint", 95, 755, 1),
        /** id = <code>96</code>, name = <code>"geographyMultiPolygon"</code> */
        GEOGRAPHYMULTIPOLYGON("geographyMultiPolygon", 96, 756, 1),
        /** id = <code>97</code>, name = <code>"geographyPoint"</code> */
        GEOGRAPHYPOINT("geographyPoint", 97, 757, 1),
        /** id = <code>98</code>, name = <code>"geographyPolygon"</code> */
        GEOGRAPHYPOLYGON("geographyPolygon", 98, 758, 1),
        /** id = <code>274</code>, name = <code>"geoLengthMethodCallExpr"</code> */
        GEOLENGTHMETHODCALLEXPR("geoLengthMethodCallExpr", 274, 2016, 11),
        /** id = <code>99</code>, name = <code>"geometryCollection"</code> */
        GEOMETRYCOLLECTION("geometryCollection", 99, 759, 1),
        /** id = <code>100</code>, name = <code>"geometryLineString"</code> */
        GEOMETRYLINESTRING("geometryLineString", 100, 760, 1),
        /** id = <code>101</code>, name = <code>"geometryMultiLineString"</code> */
        GEOMETRYMULTILINESTRING("geometryMultiLineString", 101, 761, 1),
        /** id = <code>102</code>, name = <code>"geometryMultiPoint"</code> */
        GEOMETRYMULTIPOINT("geometryMultiPoint", 102, 762, 1),
        /** id = <code>103</code>, name = <code>"geometryMultiPolygon"</code> */
        GEOMETRYMULTIPOLYGON("geometryMultiPolygon", 103, 763, 1),
        /** id = <code>104</code>, name = <code>"geometryPoint"</code> */
        GEOMETRYPOINT("geometryPoint", 104, 764, 1),
        /** id = <code>105</code>, name = <code>"geometryPolygon"</code> */
        GEOMETRYPOLYGON("geometryPolygon", 105, 765, 1),
        /** id = <code>272</code>, name = <code>"getTotalOffsetMinutesExpr"</code> */
        GETTOTALOFFSETMINUTESEXPR("getTotalOffsetMinutesExpr", 272, 1992, 11),
        /** id = <code>260</code>, name = <code>"gtExpr"</code> */
        GTEXPR("gtExpr", 260, 1881, 8),
        /** id = <code>83</code>, name = <code>"guid"</code> */
        GUID("guid", 83, 654, 18),
        /** id = <code>41</code>, name = <code>"h16"</code> */
        H16("h16", 41, 369, 2),
        /** id = <code>30</code>, name = <code>"HEXDIG"</code> */
        HEXDIG("HEXDIG", 30, 232, 8),
        /** id = <code>36</code>, name = <code>"host"</code> */
        HOST("host", 36, 255, 4),
        /** id = <code>65</code>, name = <code>"hour"</code> */
        HOUR("hour", 65, 497, 12),
        /** id = <code>243</code>, name = <code>"hourMethodCallExpr"</code> */
        HOURMETHODCALLEXPR("hourMethodCallExpr", 243, 1718, 11),
        /** id = <code>244</code>, name = <code>"hoursMethodCallExpr"</code> */
        HOURSMETHODCALLEXPR("hoursMethodCallExpr", 244, 1729, 11),
        /** id = <code>33</code>, name = <code>"HTAB"</code> */
        HTAB("HTAB", 33, 242, 1),
        /** id = <code>108</code>, name = <code>"identifierCharacter"</code> */
        IDENTIFIERCHARACTER("identifierCharacter", 108, 773, 4),
        /** id = <code>107</code>, name = <code>"identifierLeadingCharacter"</code> */
        IDENTIFIERLEADINGCHARACTER("identifierLeadingCharacter", 107, 770, 3),
        /** id = <code>211</code>, name = <code>"implicitVariableExpr"</code> */
        IMPLICITVARIABLEEXPR("implicitVariableExpr", 211, 1353, 1),
        /** id = <code>231</code>, name = <code>"indexOfMethodCallExpr"</code> */
        INDEXOFMETHODCALLEXPR("indexOfMethodCallExpr", 231, 1576, 13),
        /** id = <code>14</code>, name = <code>"inlinecount"</code> */
        INLINECOUNT("inlinecount", 14, 112, 5),
        /** id = <code>210</code>, name = <code>"inscopeVariableExpr"</code> */
        INSCOPEVARIABLEEXPR("inscopeVariableExpr", 210, 1350, 3),
        /** id = <code>196</code>, name = <code>"int"</code> */
        INT("int", 196, 1209, 6),
        /** id = <code>86</code>, name = <code>"int16"</code> */
        INT16("int16", 86, 679, 5),
        /** id = <code>87</code>, name = <code>"int32"</code> */
        INT32("int32", 87, 684, 5),
        /** id = <code>88</code>, name = <code>"int64"</code> */
        INT64("int64", 88, 689, 7),
        /** id = <code>275</code>, name = <code>"intersectsMethodCallExpr"</code> */
        INTERSECTSMETHODCALLEXPR("intersectsMethodCallExpr", 275, 2027, 13),
        /** id = <code>38</code>, name = <code>"IP-literal"</code> */
        IP_LITERAL("IP-literal", 38, 261, 6),
        /** id = <code>43</code>, name = <code>"IPv4address"</code> */
        IPV4ADDRESS("IPv4address", 43, 377, 8),
        /** id = <code>40</code>, name = <code>"IPv6address"</code> */
        IPV6ADDRESS("IPv6address", 40, 277, 92),
        /** id = <code>39</code>, name = <code>"IPvFuture"</code> */
        IPVFUTURE("IPvFuture", 39, 267, 10),
        /** id = <code>269</code>, name = <code>"isofExpr"</code> */
        ISOFEXPR("isofExpr", 269, 1947, 15),
        /** id = <code>144</code>, name = <code>"keyPredicate"</code> */
        KEYPREDICATE("keyPredicate", 144, 929, 3),
        /** id = <code>148</code>, name = <code>"keyPropertyValue"</code> */
        KEYPROPERTYVALUE("keyPropertyValue", 148, 948, 1),
        /** id = <code>147</code>, name = <code>"keyValuePair"</code> */
        KEYVALUEPAIR("keyValuePair", 147, 944, 4),
        /** id = <code>226</code>, name = <code>"lambdaPredicateExpr"</code> */
        LAMBDAPREDICATEEXPR("lambdaPredicateExpr", 226, 1525, 1),
        /** id = <code>209</code>, name = <code>"lambdaPredicatePrefixExpr"</code> */
        LAMBDAPREDICATEPREFIXEXPR("lambdaPredicatePrefixExpr", 209, 1347, 3),
        /** id = <code>212</code>, name = <code>"lambdaVariableExpr"</code> */
        LAMBDAVARIABLEEXPR("lambdaVariableExpr", 212, 1354, 1),
        /** id = <code>259</code>, name = <code>"leExpr"</code> */
        LEEXPR("leExpr", 259, 1873, 8),
        /** id = <code>230</code>, name = <code>"lengthMethodCallExpr"</code> */
        LENGTHMETHODCALLEXPR("lengthMethodCallExpr", 230, 1565, 11),
        /** id = <code>155</code>, name = <code>"links"</code> */
        LINKS("links", 155, 1016, 1),
        /** id = <code>42</code>, name = <code>"ls32"</code> */
        LS32("ls32", 42, 371, 6),
        /** id = <code>258</code>, name = <code>"ltExpr"</code> */
        LTEXPR("ltExpr", 258, 1865, 8),
        /** id = <code>205</code>, name = <code>"memberExpr"</code> */
        MEMBEREXPR("memberExpr", 205, 1293, 23),
        /** id = <code>219</code>, name = <code>"methodCallExpr"</code> */
        METHODCALLEXPR("methodCallExpr", 219, 1461, 27),
        /** id = <code>66</code>, name = <code>"minute"</code> */
        MINUTE("minute", 66, 509, 1),
        /** id = <code>245</code>, name = <code>"minuteMethodCallExpr"</code> */
        MINUTEMETHODCALLEXPR("minuteMethodCallExpr", 245, 1740, 11),
        /** id = <code>246</code>, name = <code>"minutesMethodCallExpr"</code> */
        MINUTESMETHODCALLEXPR("minutesMethodCallExpr", 246, 1751, 11),
        /** id = <code>266</code>, name = <code>"modExpr"</code> */
        MODEXPR("modExpr", 266, 1929, 8),
        /** id = <code>63</code>, name = <code>"month"</code> */
        MONTH("month", 63, 475, 10),
        /** id = <code>239</code>, name = <code>"monthMethodCallExpr"</code> */
        MONTHMETHODCALLEXPR("monthMethodCallExpr", 239, 1674, 11),
        /** id = <code>240</code>, name = <code>"monthsMethodCallExpr"</code> */
        MONTHSMETHODCALLEXPR("monthsMethodCallExpr", 240, 1685, 11),
        /** id = <code>264</code>, name = <code>"mulExpr"</code> */
        MULEXPR("mulExpr", 264, 1913, 8),
        /** id = <code>188</code>, name = <code>"name-separator"</code> */
        NAME_SEPARATOR("name-separator", 188, 1165, 1),
        /** id = <code>109</code>, name = <code>"namespace"</code> */
        NAMESPACE("namespace", 109, 777, 6),
        /** id = <code>110</code>, name = <code>"namespacePart"</code> */
        NAMESPACEPART("namespacePart", 110, 783, 1),
        /** id = <code>56</code>, name = <code>"nan"</code> */
        NAN("nan", 56, 445, 1),
        /** id = <code>59</code>, name = <code>"nanInfinity"</code> */
        NANINFINITY("nanInfinity", 59, 450, 4),
        /** id = <code>130</code>, name = <code>"navigationProperty"</code> */
        NAVIGATIONPROPERTY("navigationProperty", 130, 864, 3),
        /** id = <code>257</code>, name = <code>"neExpr"</code> */
        NEEXPR("neExpr", 257, 1857, 8),
        /** id = <code>267</code>, name = <code>"negateExpr"</code> */
        NEGATEEXPR("negateExpr", 267, 1937, 5),
        /** id = <code>58</code>, name = <code>"negativeInfinity"</code> */
        NEGATIVEINFINITY("negativeInfinity", 58, 447, 3),
        /** id = <code>268</code>, name = <code>"notExpr"</code> */
        NOTEXPR("notExpr", 268, 1942, 5),
        /** id = <code>70</code>, name = <code>"null"</code> */
        NULL("null", 70, 544, 7),
        /** id = <code>195</code>, name = <code>"numberInJSON"</code> */
        NUMBERINJSON("numberInJSON", 195, 1201, 8),
        /** id = <code>106</code>, name = <code>"odataIdentifier"</code> */
        ODATAIDENTIFIER("odataIdentifier", 106, 766, 4),
        /** id = <code>2</code>, name = <code>"odataRelativeUri"</code> */
        ODATARELATIVEURI("odataRelativeUri", 2, 20, 6),
        /** id = <code>0</code>, name = <code>"odataUri"</code> */
        ODATAURI("odataUri", 0, 0, 14),
        /** id = <code>60</code>, name = <code>"oneToNine"</code> */
        ONETONINE("oneToNine", 60, 454, 10),
        /** id = <code>19</code>, name = <code>"operationQualifier"</code> */
        OPERATIONQUALIFIER("operationQualifier", 19, 154, 7),
        /** id = <code>10</code>, name = <code>"orderby"</code> */
        ORDERBY("orderby", 10, 73, 21),
        /** id = <code>255</code>, name = <code>"orExpr"</code> */
        OREXPR("orExpr", 255, 1841, 8),
        /** id = <code>51</code>, name = <code>"other-delims"</code> */
        OTHER_DELIMS("other-delims", 51, 430, 9),
        /** id = <code>175</code>, name = <code>"parameterAlias"</code> */
        PARAMETERALIAS("parameterAlias", 175, 1106, 3),
        /** id = <code>177</code>, name = <code>"parameterNameAndValue"</code> */
        PARAMETERNAMEANDVALUE("parameterNameAndValue", 177, 1113, 4),
        /** id = <code>23</code>, name = <code>"parameterTypeName"</code> */
        PARAMETERTYPENAME("parameterTypeName", 23, 186, 1),
        /** id = <code>22</code>, name = <code>"parameterTypeNames"</code> */
        PARAMETERTYPENAMES("parameterTypeNames", 22, 179, 7),
        /** id = <code>178</code>, name = <code>"parameterValue"</code> */
        PARAMETERVALUE("parameterValue", 178, 1117, 5),
        /** id = <code>252</code>, name = <code>"parenExpr"</code> */
        PARENEXPR("parenExpr", 252, 1817, 8),
        /** id = <code>223</code>, name = <code>"pathExpression-collection"</code> */
        PATHEXPRESSION_COLLECTION("pathExpression-collection", 223, 1503, 8),
        /** id = <code>47</code>, name = <code>"pchar"</code> */
        PCHAR("pchar", 47, 408, 6),
        /** id = <code>48</code>, name = <code>"pct-encoded"</code> */
        PCT_ENCODED("pct-encoded", 48, 414, 4),
        /** id = <code>37</code>, name = <code>"port"</code> */
        PORT("port", 37, 259, 2),
        /** id = <code>57</code>, name = <code>"positiveInfinity"</code> */
        POSITIVEINFINITY("positiveInfinity", 57, 446, 1),
        /** id = <code>141</code>, name = <code>"primitiveColFunction"</code> */
        PRIMITIVECOLFUNCTION("primitiveColFunction", 141, 883, 1),
        /** id = <code>164</code>, name = <code>"primitiveColFunctionCall"</code> */
        PRIMITIVECOLFUNCTIONCALL("primitiveColFunctionCall", 164, 1077, 5),
        /** id = <code>181</code>, name = <code>"primitiveColInUri"</code> */
        PRIMITIVECOLINURI("primitiveColInUri", 181, 1149, 10),
        /** id = <code>126</code>, name = <code>"primitiveColProperty"</code> */
        PRIMITIVECOLPROPERTY("primitiveColProperty", 126, 860, 1),
        /** id = <code>140</code>, name = <code>"primitiveFunction"</code> */
        PRIMITIVEFUNCTION("primitiveFunction", 140, 882, 1),
        /** id = <code>163</code>, name = <code>"primitiveFunctionCall"</code> */
        PRIMITIVEFUNCTIONCALL("primitiveFunctionCall", 163, 1072, 5),
        /** id = <code>124</code>, name = <code>"primitiveKeyProperty"</code> */
        PRIMITIVEKEYPROPERTY("primitiveKeyProperty", 124, 858, 1),
        /** id = <code>69</code>, name = <code>"primitiveLiteral"</code> */
        PRIMITIVELITERAL("primitiveLiteral", 69, 513, 31),
        /** id = <code>192</code>, name = <code>"primitiveLiteralInJSON"</code> */
        PRIMITIVELITERALINJSON("primitiveLiteralInJSON", 192, 1189, 6),
        /** id = <code>125</code>, name = <code>"primitiveNonKeyProperty"</code> */
        PRIMITIVENONKEYPROPERTY("primitiveNonKeyProperty", 125, 859, 1),
        /** id = <code>174</code>, name = <code>"primitiveParameterValue"</code> */
        PRIMITIVEPARAMETERVALUE("primitiveParameterValue", 174, 1105, 1),
        /** id = <code>123</code>, name = <code>"primitiveProperty"</code> */
        PRIMITIVEPROPERTY("primitiveProperty", 123, 855, 3),
        /** id = <code>191</code>, name = <code>"primitivePropertyInUri"</code> */
        PRIMITIVEPROPERTYINURI("primitivePropertyInUri", 191, 1183, 6),
        /** id = <code>213</code>, name = <code>"primitivePropertyPath"</code> */
        PRIMITIVEPROPERTYPATH("primitivePropertyPath", 213, 1355, 11),
        /** id = <code>119</code>, name = <code>"primitiveTypeName"</code> */
        PRIMITIVETYPENAME("primitiveTypeName", 119, 813, 25),
        /** id = <code>122</code>, name = <code>"property"</code> */
        PROPERTY("property", 122, 849, 6),
        /** id = <code>20</code>, name = <code>"qualifiedActionName"</code> */
        QUALIFIEDACTIONNAME("qualifiedActionName", 20, 161, 9),
        /** id = <code>117</code>, name = <code>"qualifiedComplexTypeName"</code> */
        QUALIFIEDCOMPLEXTYPENAME("qualifiedComplexTypeName", 117, 805, 4),
        /** id = <code>116</code>, name = <code>"qualifiedEntityTypeName"</code> */
        QUALIFIEDENTITYTYPENAME("qualifiedEntityTypeName", 116, 801, 4),
        /** id = <code>118</code>, name = <code>"qualifiedEnumerationTypeName"</code> */
        QUALIFIEDENUMERATIONTYPENAME("qualifiedEnumerationTypeName", 118, 809, 4),
        /** id = <code>21</code>, name = <code>"qualifiedFunctionName"</code> */
        QUALIFIEDFUNCTIONNAME("qualifiedFunctionName", 21, 170, 9),
        /** id = <code>115</code>, name = <code>"qualifiedTypeName"</code> */
        QUALIFIEDTYPENAME("qualifiedTypeName", 115, 788, 13),
        /** id = <code>4</code>, name = <code>"queryOption"</code> */
        QUERYOPTION("queryOption", 4, 32, 5),
        /** id = <code>3</code>, name = <code>"queryOptions"</code> */
        QUERYOPTIONS("queryOptions", 3, 26, 6),
        /** id = <code>186</code>, name = <code>"quotation-mark"</code> */
        QUOTATION_MARK("quotation-mark", 186, 1163, 1),
        /** id = <code>45</code>, name = <code>"reg-name"</code> */
        REG_NAME("reg-name", 45, 401, 5),
        /** id = <code>142</code>, name = <code>"resourcePath"</code> */
        RESOURCEPATH("resourcePath", 142, 884, 34),
        /** id = <code>249</code>, name = <code>"roundMethodCallExpr"</code> */
        ROUNDMETHODCALLEXPR("roundMethodCallExpr", 249, 1784, 11),
        /** id = <code>85</code>, name = <code>"sbyte"</code> */
        SBYTE("sbyte", 85, 674, 5),
        /** id = <code>35</code>, name = <code>"scheme"</code> */
        SCHEME("scheme", 35, 246, 9),
        /** id = <code>67</code>, name = <code>"second"</code> */
        SECOND("second", 67, 510, 1),
        /** id = <code>247</code>, name = <code>"secondMethodCallExpr"</code> */
        SECONDMETHODCALLEXPR("secondMethodCallExpr", 247, 1762, 11),
        /** id = <code>248</code>, name = <code>"secondsMethodCallExpr"</code> */
        SECONDSMETHODCALLEXPR("secondsMethodCallExpr", 248, 1773, 11),
        /** id = <code>46</code>, name = <code>"segment-nz"</code> */
        SEGMENT_NZ("segment-nz", 46, 406, 2),
        /** id = <code>15</code>, name = <code>"select"</code> */
        SELECT("select", 15, 117, 3),
        /** id = <code>16</code>, name = <code>"selectClause"</code> */
        SELECTCLAUSE("selectClause", 16, 120, 6),
        /** id = <code>17</code>, name = <code>"selectItem"</code> */
        SELECTITEM("selectItem", 17, 126, 25),
        /** id = <code>1</code>, name = <code>"serviceRoot"</code> */
        SERVICEROOT("serviceRoot", 1, 14, 6),
        /** id = <code>54</code>, name = <code>"sign"</code> */
        SIGN("sign", 54, 441, 3),
        /** id = <code>145</code>, name = <code>"simpleKey"</code> */
        SIMPLEKEY("simpleKey", 145, 932, 4),
        /** id = <code>82</code>, name = <code>"single"</code> */
        SINGLE("single", 82, 650, 4),
        /** id = <code>81</code>, name = <code>"singleBody"</code> */
        SINGLEBODY("singleBody", 81, 639, 11),
        /** id = <code>149</code>, name = <code>"singleNavigation"</code> */
        SINGLENAVIGATION("singleNavigation", 149, 949, 41),
        /** id = <code>217</code>, name = <code>"singleNavigationExpr"</code> */
        SINGLENAVIGATIONEXPR("singleNavigationExpr", 217, 1400, 28),
        /** id = <code>151</code>, name = <code>"singlePath"</code> */
        SINGLEPATH("singlePath", 151, 993, 3),
        /** id = <code>11</code>, name = <code>"skip"</code> */
        SKIP("skip", 11, 94, 4),
        /** id = <code>24</code>, name = <code>"skiptoken"</code> */
        SKIPTOKEN("skiptoken", 24, 187, 11),
        /** id = <code>32</code>, name = <code>"SP"</code> */
        SP("SP", 32, 241, 1),
        /** id = <code>52</code>, name = <code>"SQUOTE"</code> */
        SQUOTE("SQUOTE", 52, 439, 1),
        /** id = <code>90</code>, name = <code>"SQUOTE-in-string"</code> */
        SQUOTE_IN_STRING("SQUOTE-in-string", 90, 704, 3),
        /** id = <code>55</code>, name = <code>"star"</code> */
        STAR("star", 55, 444, 1),
        /** id = <code>228</code>, name = <code>"startsWithMethodCallExpr"</code> */
        STARTSWITHMETHODCALLEXPR("startsWithMethodCallExpr", 228, 1539, 13),
        /** id = <code>129</code>, name = <code>"streamProperty"</code> */
        STREAMPROPERTY("streamProperty", 129, 863, 1),
        /** id = <code>89</code>, name = <code>"string"</code> */
        STRING("string", 89, 696, 8),
        /** id = <code>193</code>, name = <code>"stringInJSON"</code> */
        STRINGINJSON("stringInJSON", 193, 1195, 5),
        /** id = <code>50</code>, name = <code>"sub-delims"</code> */
        SUB_DELIMS("sub-delims", 50, 425, 5),
        /** id = <code>263</code>, name = <code>"subExpr"</code> */
        SUBEXPR("subExpr", 263, 1905, 8),
        /** id = <code>232</code>, name = <code>"substringMethodCallExpr"</code> */
        SUBSTRINGMETHODCALLEXPR("substringMethodCallExpr", 232, 1589, 17),
        /** id = <code>227</code>, name = <code>"substringOfMethodCallExpr"</code> */
        SUBSTRINGOFMETHODCALLEXPR("substringOfMethodCallExpr", 227, 1526, 13),
        /** id = <code>5</code>, name = <code>"systemQueryOption"</code> */
        SYSTEMQUERYOPTION("systemQueryOption", 5, 37, 10),
        /** id = <code>91</code>, name = <code>"time"</code> */
        TIME("time", 91, 707, 45),
        /** id = <code>233</code>, name = <code>"toLowerMethodCallExpr"</code> */
        TOLOWERMETHODCALLEXPR("toLowerMethodCallExpr", 233, 1606, 11),
        /** id = <code>12</code>, name = <code>"top"</code> */
        TOP("top", 12, 98, 4),
        /** id = <code>234</code>, name = <code>"toUpperMethodCallExpr"</code> */
        TOUPPERMETHODCALLEXPR("toUpperMethodCallExpr", 234, 1617, 11),
        /** id = <code>235</code>, name = <code>"trimMethodCallExpr"</code> */
        TRIMMETHODCALLEXPR("trimMethodCallExpr", 235, 1628, 11),
        /** id = <code>190</code>, name = <code>"typeNVPInUri"</code> */
        TYPENVPINURI("typeNVPInUri", 190, 1175, 8),
        /** id = <code>49</code>, name = <code>"unreserved"</code> */
        UNRESERVED("unreserved", 49, 418, 7),
        /** id = <code>154</code>, name = <code>"value"</code> */
        VALUE("value", 154, 1015, 1),
        /** id = <code>187</code>, name = <code>"value-separator"</code> */
        VALUE_SEPARATOR("value-separator", 187, 1164, 1),
        /** id = <code>34</code>, name = <code>"WSP"</code> */
        WSP("WSP", 34, 243, 3),
        /** id = <code>62</code>, name = <code>"year"</code> */
        YEAR("year", 62, 473, 2),
        /** id = <code>237</code>, name = <code>"yearMethodCallExpr"</code> */
        YEARMETHODCALLEXPR("yearMethodCallExpr", 237, 1652, 11),
        /** id = <code>238</code>, name = <code>"yearsMethodCallExpr"</code> */
        YEARSMETHODCALLEXPR("yearsMethodCallExpr", 238, 1663, 11),
        /** id = <code>61</code>, name = <code>"zeroToFiftyNine"</code> */
        ZEROTOFIFTYNINE("zeroToFiftyNine", 61, 464, 9);
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
    	Rule[] rules = new Rule[276];
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
    	Opcode[] op = new Opcode[2040];
        {int[] a = {1,2,3,4,8,9}; op[0] = getOpcodeCat(a);}
        op[1] = getOpcodeRnm(35, 246); // scheme
        {char[] a = {58,47,47}; op[2] = getOpcodeTls(a);}
        op[3] = getOpcodeRnm(36, 255); // host
        op[4] = getOpcodeRep((char)0, (char)1, 5);
        {int[] a = {6,7}; op[5] = getOpcodeCat(a);}
        {char[] a = {58}; op[6] = getOpcodeTls(a);}
        op[7] = getOpcodeRnm(37, 259); // port
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
        op[18] = getOpcodeRnm(46, 406); // segment-nz
        {char[] a = {47}; op[19] = getOpcodeTls(a);}
        {int[] a = {21,22}; op[20] = getOpcodeCat(a);}
        op[21] = getOpcodeRnm(142, 884); // resourcePath
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
        op[34] = getOpcodeRnm(176, 1109); // aliasAndValue
        op[35] = getOpcodeRnm(177, 1113); // parameterNameAndValue
        op[36] = getOpcodeRnm(25, 198); // customQueryOption
        {int[] a = {38,39,40,41,42,43,44,45,46}; op[37] = getOpcodeAlt(a);}
        op[38] = getOpcodeRnm(6, 47); // expand
        op[39] = getOpcodeRnm(9, 70); // filter
        op[40] = getOpcodeRnm(10, 73); // orderby
        op[41] = getOpcodeRnm(11, 94); // skip
        op[42] = getOpcodeRnm(12, 98); // top
        op[43] = getOpcodeRnm(13, 102); // format
        op[44] = getOpcodeRnm(14, 112); // inlinecount
        op[45] = getOpcodeRnm(15, 117); // select
        op[46] = getOpcodeRnm(24, 187); // skiptoken
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
        op[59] = getOpcodeRnm(116, 801); // qualifiedEntityTypeName
        {char[] a = {47}; op[60] = getOpcodeTls(a);}
        op[61] = getOpcodeRnm(130, 864); // navigationProperty
        op[62] = getOpcodeRep((char)0, Character.MAX_VALUE, 63);
        {int[] a = {64,65,69}; op[63] = getOpcodeCat(a);}
        {char[] a = {47}; op[64] = getOpcodeTls(a);}
        op[65] = getOpcodeRep((char)0, (char)1, 66);
        {int[] a = {67,68}; op[66] = getOpcodeCat(a);}
        op[67] = getOpcodeRnm(116, 801); // qualifiedEntityTypeName
        {char[] a = {47}; op[68] = getOpcodeTls(a);}
        op[69] = getOpcodeRnm(130, 864); // navigationProperty
        {int[] a = {71,72}; op[70] = getOpcodeCat(a);}
        {char[] a = {36,102,105,108,116,101,114,61}; op[71] = getOpcodeTls(a);}
        op[72] = getOpcodeRnm(202, 1261); // boolCommonExpr
        {int[] a = {74,75,76,83}; op[73] = getOpcodeCat(a);}
        {char[] a = {36,111,114,100,101,114,98,121,61}; op[74] = getOpcodeTls(a);}
        op[75] = getOpcodeRnm(201, 1246); // commonExpr
        op[76] = getOpcodeRep((char)0, (char)1, 77);
        {int[] a = {78,80}; op[77] = getOpcodeCat(a);}
        op[78] = getOpcodeRep((char)1, Character.MAX_VALUE, 79);
        op[79] = getOpcodeRnm(34, 243); // WSP
        {int[] a = {81,82}; op[80] = getOpcodeAlt(a);}
        {char[] a = {97,115,99}; op[81] = getOpcodeTls(a);}
        {char[] a = {100,101,115,99}; op[82] = getOpcodeTls(a);}
        op[83] = getOpcodeRep((char)0, Character.MAX_VALUE, 84);
        {int[] a = {85,86,87}; op[84] = getOpcodeCat(a);}
        op[85] = getOpcodeRnm(53, 440); // COMMA
        op[86] = getOpcodeRnm(201, 1246); // commonExpr
        op[87] = getOpcodeRep((char)0, (char)1, 88);
        {int[] a = {89,91}; op[88] = getOpcodeCat(a);}
        op[89] = getOpcodeRep((char)1, Character.MAX_VALUE, 90);
        op[90] = getOpcodeRnm(34, 243); // WSP
        {int[] a = {92,93}; op[91] = getOpcodeAlt(a);}
        {char[] a = {97,115,99}; op[92] = getOpcodeTls(a);}
        {char[] a = {100,101,115,99}; op[93] = getOpcodeTls(a);}
        {int[] a = {95,96}; op[94] = getOpcodeCat(a);}
        {char[] a = {36,115,107,105,112,61}; op[95] = getOpcodeTls(a);}
        op[96] = getOpcodeRep((char)1, Character.MAX_VALUE, 97);
        op[97] = getOpcodeRnm(29, 231); // DIGIT
        {int[] a = {99,100}; op[98] = getOpcodeCat(a);}
        {char[] a = {36,116,111,112,61}; op[99] = getOpcodeTls(a);}
        op[100] = getOpcodeRep((char)1, Character.MAX_VALUE, 101);
        op[101] = getOpcodeRnm(29, 231); // DIGIT
        {int[] a = {103,104}; op[102] = getOpcodeCat(a);}
        {char[] a = {36,102,111,114,109,97,116,61}; op[103] = getOpcodeTls(a);}
        {int[] a = {105,106,107,108}; op[104] = getOpcodeAlt(a);}
        {char[] a = {106,115,111,110}; op[105] = getOpcodeTls(a);}
        {char[] a = {97,116,111,109}; op[106] = getOpcodeTls(a);}
        {char[] a = {120,109,108}; op[107] = getOpcodeTls(a);}
        op[108] = getOpcodeRep((char)1, Character.MAX_VALUE, 109);
        {int[] a = {110,111}; op[109] = getOpcodeAlt(a);}
        op[110] = getOpcodeRnm(47, 408); // pchar
        {char[] a = {47}; op[111] = getOpcodeTls(a);}
        {int[] a = {113,114}; op[112] = getOpcodeCat(a);}
        {char[] a = {36,105,110,108,105,110,101,99,111,117,110,116,61}; op[113] = getOpcodeTls(a);}
        {int[] a = {115,116}; op[114] = getOpcodeAlt(a);}
        {char[] a = {97,108,108,112,97,103,101,115}; op[115] = getOpcodeTls(a);}
        {char[] a = {110,111,110,101}; op[116] = getOpcodeTls(a);}
        {int[] a = {118,119}; op[117] = getOpcodeCat(a);}
        {char[] a = {36,115,101,108,101,99,116,61}; op[118] = getOpcodeTls(a);}
        op[119] = getOpcodeRnm(16, 120); // selectClause
        {int[] a = {121,122}; op[120] = getOpcodeCat(a);}
        op[121] = getOpcodeRnm(17, 126); // selectItem
        op[122] = getOpcodeRep((char)0, Character.MAX_VALUE, 123);
        {int[] a = {124,125}; op[123] = getOpcodeCat(a);}
        op[124] = getOpcodeRnm(53, 440); // COMMA
        op[125] = getOpcodeRnm(17, 126); // selectItem
        {int[] a = {127,128,129}; op[126] = getOpcodeAlt(a);}
        op[127] = getOpcodeRnm(55, 444); // star
        op[128] = getOpcodeRnm(18, 151); // allOperationsInContainer
        {int[] a = {130,134}; op[129] = getOpcodeCat(a);}
        op[130] = getOpcodeRep((char)0, (char)1, 131);
        {int[] a = {132,133}; op[131] = getOpcodeCat(a);}
        op[132] = getOpcodeRnm(116, 801); // qualifiedEntityTypeName
        {char[] a = {47}; op[133] = getOpcodeTls(a);}
        {int[] a = {135,141,149,150}; op[134] = getOpcodeAlt(a);}
        {int[] a = {136,137}; op[135] = getOpcodeCat(a);}
        op[136] = getOpcodeRnm(130, 864); // navigationProperty
        op[137] = getOpcodeRep((char)0, (char)1, 138);
        {int[] a = {139,140}; op[138] = getOpcodeCat(a);}
        {char[] a = {47}; op[139] = getOpcodeTls(a);}
        op[140] = getOpcodeRnm(17, 126); // selectItem
        {int[] a = {142,148}; op[141] = getOpcodeCat(a);}
        op[142] = getOpcodeRep((char)0, Character.MAX_VALUE, 143);
        {int[] a = {144,147}; op[143] = getOpcodeCat(a);}
        {int[] a = {145,146}; op[144] = getOpcodeAlt(a);}
        op[145] = getOpcodeRnm(127, 861); // complexProperty
        op[146] = getOpcodeRnm(128, 862); // complexColProperty
        {char[] a = {47}; op[147] = getOpcodeTls(a);}
        op[148] = getOpcodeRnm(122, 849); // property
        op[149] = getOpcodeRnm(20, 161); // qualifiedActionName
        op[150] = getOpcodeRnm(21, 170); // qualifiedFunctionName
        {int[] a = {152,153}; op[151] = getOpcodeCat(a);}
        op[152] = getOpcodeRnm(19, 154); // operationQualifier
        op[153] = getOpcodeRnm(55, 444); // star
        {int[] a = {155,159,160}; op[154] = getOpcodeCat(a);}
        op[155] = getOpcodeRep((char)0, (char)1, 156);
        {int[] a = {157,158}; op[156] = getOpcodeCat(a);}
        op[157] = getOpcodeRnm(109, 777); // namespace
        {char[] a = {46}; op[158] = getOpcodeTls(a);}
        op[159] = getOpcodeRnm(133, 869); // entityContainerName
        {char[] a = {46}; op[160] = getOpcodeTls(a);}
        {int[] a = {162,164,165}; op[161] = getOpcodeCat(a);}
        op[162] = getOpcodeRep((char)0, (char)1, 163);
        op[163] = getOpcodeRnm(19, 154); // operationQualifier
        op[164] = getOpcodeRnm(134, 870); // action
        op[165] = getOpcodeRep((char)0, (char)1, 166);
        {int[] a = {167,168,169}; op[166] = getOpcodeCat(a);}
        {char[] a = {40}; op[167] = getOpcodeTls(a);}
        op[168] = getOpcodeRnm(22, 179); // parameterTypeNames
        {char[] a = {41}; op[169] = getOpcodeTls(a);}
        {int[] a = {171,173,174}; op[170] = getOpcodeCat(a);}
        op[171] = getOpcodeRep((char)0, (char)1, 172);
        op[172] = getOpcodeRnm(19, 154); // operationQualifier
        op[173] = getOpcodeRnm(135, 871); // function
        op[174] = getOpcodeRep((char)0, (char)1, 175);
        {int[] a = {176,177,178}; op[175] = getOpcodeCat(a);}
        {char[] a = {40}; op[176] = getOpcodeTls(a);}
        op[177] = getOpcodeRnm(22, 179); // parameterTypeNames
        {char[] a = {41}; op[178] = getOpcodeTls(a);}
        op[179] = getOpcodeRep((char)0, (char)1, 180);
        {int[] a = {181,182}; op[180] = getOpcodeCat(a);}
        op[181] = getOpcodeRnm(23, 186); // parameterTypeName
        op[182] = getOpcodeRep((char)0, Character.MAX_VALUE, 183);
        {int[] a = {184,185}; op[183] = getOpcodeCat(a);}
        {char[] a = {44}; op[184] = getOpcodeTls(a);}
        op[185] = getOpcodeRnm(23, 186); // parameterTypeName
        op[186] = getOpcodeRnm(115, 788); // qualifiedTypeName
        {int[] a = {188,189}; op[187] = getOpcodeCat(a);}
        {char[] a = {36,115,107,105,112,116,111,107,101,110,61}; op[188] = getOpcodeTls(a);}
        op[189] = getOpcodeRep((char)1, Character.MAX_VALUE, 190);
        {int[] a = {191,192,193,194,195,196,197}; op[190] = getOpcodeAlt(a);}
        op[191] = getOpcodeRnm(49, 418); // unreserved
        op[192] = getOpcodeRnm(48, 414); // pct-encoded
        op[193] = getOpcodeRnm(51, 430); // other-delims
        {char[] a = {58}; op[194] = getOpcodeTls(a);}
        {char[] a = {64}; op[195] = getOpcodeTls(a);}
        {char[] a = {36}; op[196] = getOpcodeTls(a);}
        {char[] a = {61}; op[197] = getOpcodeTls(a);}
        {int[] a = {199,200}; op[198] = getOpcodeCat(a);}
        op[199] = getOpcodeRnm(26, 204); // customName
        op[200] = getOpcodeRep((char)0, (char)1, 201);
        {int[] a = {202,203}; op[201] = getOpcodeCat(a);}
        {char[] a = {61}; op[202] = getOpcodeTls(a);}
        op[203] = getOpcodeRnm(27, 219); // customValue
        {int[] a = {205,211}; op[204] = getOpcodeCat(a);}
        {int[] a = {206,207,208,209,210}; op[205] = getOpcodeAlt(a);}
        op[206] = getOpcodeRnm(49, 418); // unreserved
        op[207] = getOpcodeRnm(48, 414); // pct-encoded
        op[208] = getOpcodeRnm(51, 430); // other-delims
        {char[] a = {58}; op[209] = getOpcodeTls(a);}
        {char[] a = {64}; op[210] = getOpcodeTls(a);}
        op[211] = getOpcodeRep((char)0, Character.MAX_VALUE, 212);
        {int[] a = {213,214,215,216,217,218}; op[212] = getOpcodeAlt(a);}
        op[213] = getOpcodeRnm(49, 418); // unreserved
        op[214] = getOpcodeRnm(48, 414); // pct-encoded
        op[215] = getOpcodeRnm(51, 430); // other-delims
        {char[] a = {58}; op[216] = getOpcodeTls(a);}
        {char[] a = {64}; op[217] = getOpcodeTls(a);}
        {char[] a = {36}; op[218] = getOpcodeTls(a);}
        op[219] = getOpcodeRep((char)0, Character.MAX_VALUE, 220);
        {int[] a = {221,222,223,224,225,226,227}; op[220] = getOpcodeAlt(a);}
        op[221] = getOpcodeRnm(49, 418); // unreserved
        op[222] = getOpcodeRnm(48, 414); // pct-encoded
        op[223] = getOpcodeRnm(51, 430); // other-delims
        {char[] a = {58}; op[224] = getOpcodeTls(a);}
        {char[] a = {64}; op[225] = getOpcodeTls(a);}
        {char[] a = {36}; op[226] = getOpcodeTls(a);}
        {char[] a = {61}; op[227] = getOpcodeTls(a);}
        {int[] a = {229,230}; op[228] = getOpcodeAlt(a);}
        op[229] = getOpcodeTrg((char)65, (char)90);
        op[230] = getOpcodeTrg((char)97, (char)122);
        op[231] = getOpcodeTrg((char)48, (char)57);
        {int[] a = {233,234,235,236,237,238,239}; op[232] = getOpcodeAlt(a);}
        op[233] = getOpcodeRnm(29, 231); // DIGIT
        {char[] a = {65}; op[234] = getOpcodeTls(a);}
        {char[] a = {66}; op[235] = getOpcodeTls(a);}
        {char[] a = {67}; op[236] = getOpcodeTls(a);}
        {char[] a = {68}; op[237] = getOpcodeTls(a);}
        {char[] a = {69}; op[238] = getOpcodeTls(a);}
        {char[] a = {70}; op[239] = getOpcodeTls(a);}
        {char[] a = {34}; op[240] = getOpcodeTbs(a);}
        {char[] a = {32}; op[241] = getOpcodeTbs(a);}
        {char[] a = {9}; op[242] = getOpcodeTbs(a);}
        {int[] a = {244,245}; op[243] = getOpcodeAlt(a);}
        op[244] = getOpcodeRnm(32, 241); // SP
        op[245] = getOpcodeRnm(33, 242); // HTAB
        {int[] a = {247,248}; op[246] = getOpcodeCat(a);}
        op[247] = getOpcodeRnm(28, 228); // ALPHA
        op[248] = getOpcodeRep((char)0, Character.MAX_VALUE, 249);
        {int[] a = {250,251,252,253,254}; op[249] = getOpcodeAlt(a);}
        op[250] = getOpcodeRnm(28, 228); // ALPHA
        op[251] = getOpcodeRnm(29, 231); // DIGIT
        {char[] a = {43}; op[252] = getOpcodeTls(a);}
        {char[] a = {45}; op[253] = getOpcodeTls(a);}
        {char[] a = {46}; op[254] = getOpcodeTls(a);}
        {int[] a = {256,257,258}; op[255] = getOpcodeAlt(a);}
        op[256] = getOpcodeRnm(38, 261); // IP-literal
        op[257] = getOpcodeRnm(43, 377); // IPv4address
        op[258] = getOpcodeRnm(45, 401); // reg-name
        op[259] = getOpcodeRep((char)0, Character.MAX_VALUE, 260);
        op[260] = getOpcodeRnm(29, 231); // DIGIT
        {int[] a = {262,263,266}; op[261] = getOpcodeCat(a);}
        {char[] a = {91}; op[262] = getOpcodeTls(a);}
        {int[] a = {264,265}; op[263] = getOpcodeAlt(a);}
        op[264] = getOpcodeRnm(40, 277); // IPv6address
        op[265] = getOpcodeRnm(39, 267); // IPvFuture
        {char[] a = {93}; op[266] = getOpcodeTls(a);}
        {int[] a = {268,269,271,272}; op[267] = getOpcodeCat(a);}
        {char[] a = {118}; op[268] = getOpcodeTls(a);}
        op[269] = getOpcodeRep((char)1, Character.MAX_VALUE, 270);
        op[270] = getOpcodeRnm(30, 232); // HEXDIG
        {char[] a = {46}; op[271] = getOpcodeTls(a);}
        op[272] = getOpcodeRep((char)1, Character.MAX_VALUE, 273);
        {int[] a = {274,275,276}; op[273] = getOpcodeAlt(a);}
        op[274] = getOpcodeRnm(49, 418); // unreserved
        op[275] = getOpcodeRnm(50, 425); // sub-delims
        {char[] a = {58}; op[276] = getOpcodeTls(a);}
        {int[] a = {278,284,291,300,314,328,340,350,360}; op[277] = getOpcodeAlt(a);}
        {int[] a = {279,283}; op[278] = getOpcodeCat(a);}
        op[279] = getOpcodeRep((char)6, (char)6, 280);
        {int[] a = {281,282}; op[280] = getOpcodeCat(a);}
        op[281] = getOpcodeRnm(41, 369); // h16
        {char[] a = {58}; op[282] = getOpcodeTls(a);}
        op[283] = getOpcodeRnm(42, 371); // ls32
        {int[] a = {285,286,290}; op[284] = getOpcodeCat(a);}
        {char[] a = {58,58}; op[285] = getOpcodeTls(a);}
        op[286] = getOpcodeRep((char)5, (char)5, 287);
        {int[] a = {288,289}; op[287] = getOpcodeCat(a);}
        op[288] = getOpcodeRnm(41, 369); // h16
        {char[] a = {58}; op[289] = getOpcodeTls(a);}
        op[290] = getOpcodeRnm(42, 371); // ls32
        {int[] a = {292,294,295,299}; op[291] = getOpcodeCat(a);}
        op[292] = getOpcodeRep((char)0, (char)1, 293);
        op[293] = getOpcodeRnm(41, 369); // h16
        {char[] a = {58,58}; op[294] = getOpcodeTls(a);}
        op[295] = getOpcodeRep((char)4, (char)4, 296);
        {int[] a = {297,298}; op[296] = getOpcodeCat(a);}
        op[297] = getOpcodeRnm(41, 369); // h16
        {char[] a = {58}; op[298] = getOpcodeTls(a);}
        op[299] = getOpcodeRnm(42, 371); // ls32
        {int[] a = {301,308,309,313}; op[300] = getOpcodeCat(a);}
        op[301] = getOpcodeRep((char)0, (char)1, 302);
        {int[] a = {303,307}; op[302] = getOpcodeCat(a);}
        op[303] = getOpcodeRep((char)0, (char)1, 304);
        {int[] a = {305,306}; op[304] = getOpcodeCat(a);}
        op[305] = getOpcodeRnm(41, 369); // h16
        {char[] a = {58}; op[306] = getOpcodeTls(a);}
        op[307] = getOpcodeRnm(41, 369); // h16
        {char[] a = {58,58}; op[308] = getOpcodeTls(a);}
        op[309] = getOpcodeRep((char)3, (char)3, 310);
        {int[] a = {311,312}; op[310] = getOpcodeCat(a);}
        op[311] = getOpcodeRnm(41, 369); // h16
        {char[] a = {58}; op[312] = getOpcodeTls(a);}
        op[313] = getOpcodeRnm(42, 371); // ls32
        {int[] a = {315,322,323,327}; op[314] = getOpcodeCat(a);}
        op[315] = getOpcodeRep((char)0, (char)1, 316);
        {int[] a = {317,321}; op[316] = getOpcodeCat(a);}
        op[317] = getOpcodeRep((char)0, (char)2, 318);
        {int[] a = {319,320}; op[318] = getOpcodeCat(a);}
        op[319] = getOpcodeRnm(41, 369); // h16
        {char[] a = {58}; op[320] = getOpcodeTls(a);}
        op[321] = getOpcodeRnm(41, 369); // h16
        {char[] a = {58,58}; op[322] = getOpcodeTls(a);}
        op[323] = getOpcodeRep((char)2, (char)2, 324);
        {int[] a = {325,326}; op[324] = getOpcodeCat(a);}
        op[325] = getOpcodeRnm(41, 369); // h16
        {char[] a = {58}; op[326] = getOpcodeTls(a);}
        op[327] = getOpcodeRnm(42, 371); // ls32
        {int[] a = {329,336,337,338,339}; op[328] = getOpcodeCat(a);}
        op[329] = getOpcodeRep((char)0, (char)1, 330);
        {int[] a = {331,335}; op[330] = getOpcodeCat(a);}
        op[331] = getOpcodeRep((char)0, (char)3, 332);
        {int[] a = {333,334}; op[332] = getOpcodeCat(a);}
        op[333] = getOpcodeRnm(41, 369); // h16
        {char[] a = {58}; op[334] = getOpcodeTls(a);}
        op[335] = getOpcodeRnm(41, 369); // h16
        {char[] a = {58,58}; op[336] = getOpcodeTls(a);}
        op[337] = getOpcodeRnm(41, 369); // h16
        {char[] a = {58}; op[338] = getOpcodeTls(a);}
        op[339] = getOpcodeRnm(42, 371); // ls32
        {int[] a = {341,348,349}; op[340] = getOpcodeCat(a);}
        op[341] = getOpcodeRep((char)0, (char)1, 342);
        {int[] a = {343,347}; op[342] = getOpcodeCat(a);}
        op[343] = getOpcodeRep((char)0, (char)4, 344);
        {int[] a = {345,346}; op[344] = getOpcodeCat(a);}
        op[345] = getOpcodeRnm(41, 369); // h16
        {char[] a = {58}; op[346] = getOpcodeTls(a);}
        op[347] = getOpcodeRnm(41, 369); // h16
        {char[] a = {58,58}; op[348] = getOpcodeTls(a);}
        op[349] = getOpcodeRnm(42, 371); // ls32
        {int[] a = {351,358,359}; op[350] = getOpcodeCat(a);}
        op[351] = getOpcodeRep((char)0, (char)1, 352);
        {int[] a = {353,357}; op[352] = getOpcodeCat(a);}
        op[353] = getOpcodeRep((char)0, (char)5, 354);
        {int[] a = {355,356}; op[354] = getOpcodeCat(a);}
        op[355] = getOpcodeRnm(41, 369); // h16
        {char[] a = {58}; op[356] = getOpcodeTls(a);}
        op[357] = getOpcodeRnm(41, 369); // h16
        {char[] a = {58,58}; op[358] = getOpcodeTls(a);}
        op[359] = getOpcodeRnm(41, 369); // h16
        {int[] a = {361,368}; op[360] = getOpcodeCat(a);}
        op[361] = getOpcodeRep((char)0, (char)1, 362);
        {int[] a = {363,367}; op[362] = getOpcodeCat(a);}
        op[363] = getOpcodeRep((char)0, (char)6, 364);
        {int[] a = {365,366}; op[364] = getOpcodeCat(a);}
        op[365] = getOpcodeRnm(41, 369); // h16
        {char[] a = {58}; op[366] = getOpcodeTls(a);}
        op[367] = getOpcodeRnm(41, 369); // h16
        {char[] a = {58,58}; op[368] = getOpcodeTls(a);}
        op[369] = getOpcodeRep((char)1, (char)4, 370);
        op[370] = getOpcodeRnm(30, 232); // HEXDIG
        {int[] a = {372,376}; op[371] = getOpcodeAlt(a);}
        {int[] a = {373,374,375}; op[372] = getOpcodeCat(a);}
        op[373] = getOpcodeRnm(41, 369); // h16
        {char[] a = {58}; op[374] = getOpcodeTls(a);}
        op[375] = getOpcodeRnm(41, 369); // h16
        op[376] = getOpcodeRnm(43, 377); // IPv4address
        {int[] a = {378,379,380,381,382,383,384}; op[377] = getOpcodeCat(a);}
        op[378] = getOpcodeRnm(44, 385); // dec-octet
        {char[] a = {46}; op[379] = getOpcodeTls(a);}
        op[380] = getOpcodeRnm(44, 385); // dec-octet
        {char[] a = {46}; op[381] = getOpcodeTls(a);}
        op[382] = getOpcodeRnm(44, 385); // dec-octet
        {char[] a = {46}; op[383] = getOpcodeTls(a);}
        op[384] = getOpcodeRnm(44, 385); // dec-octet
        {int[] a = {386,390,394,397,400}; op[385] = getOpcodeAlt(a);}
        {int[] a = {387,388}; op[386] = getOpcodeCat(a);}
        {char[] a = {49}; op[387] = getOpcodeTls(a);}
        op[388] = getOpcodeRep((char)2, (char)2, 389);
        op[389] = getOpcodeRnm(29, 231); // DIGIT
        {int[] a = {391,392,393}; op[390] = getOpcodeCat(a);}
        {char[] a = {50}; op[391] = getOpcodeTls(a);}
        op[392] = getOpcodeTrg((char)48, (char)52);
        op[393] = getOpcodeRnm(29, 231); // DIGIT
        {int[] a = {395,396}; op[394] = getOpcodeCat(a);}
        {char[] a = {50,53}; op[395] = getOpcodeTls(a);}
        op[396] = getOpcodeTrg((char)48, (char)53);
        {int[] a = {398,399}; op[397] = getOpcodeCat(a);}
        op[398] = getOpcodeTrg((char)49, (char)57);
        op[399] = getOpcodeRnm(29, 231); // DIGIT
        op[400] = getOpcodeRnm(29, 231); // DIGIT
        op[401] = getOpcodeRep((char)0, Character.MAX_VALUE, 402);
        {int[] a = {403,404,405}; op[402] = getOpcodeAlt(a);}
        op[403] = getOpcodeRnm(49, 418); // unreserved
        op[404] = getOpcodeRnm(48, 414); // pct-encoded
        op[405] = getOpcodeRnm(50, 425); // sub-delims
        op[406] = getOpcodeRep((char)1, Character.MAX_VALUE, 407);
        op[407] = getOpcodeRnm(47, 408); // pchar
        {int[] a = {409,410,411,412,413}; op[408] = getOpcodeAlt(a);}
        op[409] = getOpcodeRnm(49, 418); // unreserved
        op[410] = getOpcodeRnm(48, 414); // pct-encoded
        op[411] = getOpcodeRnm(50, 425); // sub-delims
        {char[] a = {58}; op[412] = getOpcodeTls(a);}
        {char[] a = {64}; op[413] = getOpcodeTls(a);}
        {int[] a = {415,416,417}; op[414] = getOpcodeCat(a);}
        {char[] a = {37}; op[415] = getOpcodeTls(a);}
        op[416] = getOpcodeRnm(30, 232); // HEXDIG
        op[417] = getOpcodeRnm(30, 232); // HEXDIG
        {int[] a = {419,420,421,422,423,424}; op[418] = getOpcodeAlt(a);}
        op[419] = getOpcodeRnm(28, 228); // ALPHA
        op[420] = getOpcodeRnm(29, 231); // DIGIT
        {char[] a = {45}; op[421] = getOpcodeTls(a);}
        {char[] a = {46}; op[422] = getOpcodeTls(a);}
        {char[] a = {95}; op[423] = getOpcodeTls(a);}
        {char[] a = {126}; op[424] = getOpcodeTls(a);}
        {int[] a = {426,427,428,429}; op[425] = getOpcodeAlt(a);}
        {char[] a = {38}; op[426] = getOpcodeTls(a);}
        {char[] a = {61}; op[427] = getOpcodeTls(a);}
        {char[] a = {36}; op[428] = getOpcodeTls(a);}
        op[429] = getOpcodeRnm(51, 430); // other-delims
        {int[] a = {431,432,433,434,435,436,437,438}; op[430] = getOpcodeAlt(a);}
        {char[] a = {33}; op[431] = getOpcodeTls(a);}
        {char[] a = {39}; op[432] = getOpcodeTls(a);}
        {char[] a = {40}; op[433] = getOpcodeTls(a);}
        {char[] a = {41}; op[434] = getOpcodeTls(a);}
        {char[] a = {42}; op[435] = getOpcodeTls(a);}
        {char[] a = {43}; op[436] = getOpcodeTls(a);}
        {char[] a = {44}; op[437] = getOpcodeTls(a);}
        {char[] a = {59}; op[438] = getOpcodeTls(a);}
        {char[] a = {39}; op[439] = getOpcodeTbs(a);}
        {char[] a = {44}; op[440] = getOpcodeTbs(a);}
        {int[] a = {442,443}; op[441] = getOpcodeAlt(a);}
        {char[] a = {43}; op[442] = getOpcodeTls(a);}
        {char[] a = {45}; op[443] = getOpcodeTls(a);}
        {char[] a = {42}; op[444] = getOpcodeTls(a);}
        {char[] a = {78,97,78}; op[445] = getOpcodeTbs(a);}
        {char[] a = {73,78,70}; op[446] = getOpcodeTbs(a);}
        {int[] a = {448,449}; op[447] = getOpcodeCat(a);}
        {char[] a = {45}; op[448] = getOpcodeTls(a);}
        op[449] = getOpcodeRnm(57, 446); // positiveInfinity
        {int[] a = {451,452,453}; op[450] = getOpcodeAlt(a);}
        op[451] = getOpcodeRnm(56, 445); // nan
        op[452] = getOpcodeRnm(58, 447); // negativeInfinity
        op[453] = getOpcodeRnm(57, 446); // positiveInfinity
        {int[] a = {455,456,457,458,459,460,461,462,463}; op[454] = getOpcodeAlt(a);}
        {char[] a = {49}; op[455] = getOpcodeTls(a);}
        {char[] a = {50}; op[456] = getOpcodeTls(a);}
        {char[] a = {51}; op[457] = getOpcodeTls(a);}
        {char[] a = {52}; op[458] = getOpcodeTls(a);}
        {char[] a = {53}; op[459] = getOpcodeTls(a);}
        {char[] a = {54}; op[460] = getOpcodeTls(a);}
        {char[] a = {55}; op[461] = getOpcodeTls(a);}
        {char[] a = {56}; op[462] = getOpcodeTls(a);}
        {char[] a = {57}; op[463] = getOpcodeTls(a);}
        {int[] a = {465,472}; op[464] = getOpcodeCat(a);}
        {int[] a = {466,467,468,469,470,471}; op[465] = getOpcodeAlt(a);}
        {char[] a = {48}; op[466] = getOpcodeTls(a);}
        {char[] a = {49}; op[467] = getOpcodeTls(a);}
        {char[] a = {50}; op[468] = getOpcodeTls(a);}
        {char[] a = {51}; op[469] = getOpcodeTls(a);}
        {char[] a = {52}; op[470] = getOpcodeTls(a);}
        {char[] a = {53}; op[471] = getOpcodeTls(a);}
        op[472] = getOpcodeRnm(29, 231); // DIGIT
        op[473] = getOpcodeRep((char)4, (char)4, 474);
        op[474] = getOpcodeRnm(29, 231); // DIGIT
        {int[] a = {476,479}; op[475] = getOpcodeAlt(a);}
        {int[] a = {477,478}; op[476] = getOpcodeCat(a);}
        {char[] a = {48}; op[477] = getOpcodeTls(a);}
        op[478] = getOpcodeRnm(60, 454); // oneToNine
        {int[] a = {480,481}; op[479] = getOpcodeCat(a);}
        {char[] a = {49}; op[480] = getOpcodeTls(a);}
        {int[] a = {482,483,484}; op[481] = getOpcodeAlt(a);}
        {char[] a = {48}; op[482] = getOpcodeTls(a);}
        {char[] a = {49}; op[483] = getOpcodeTls(a);}
        {char[] a = {50}; op[484] = getOpcodeTls(a);}
        {int[] a = {486,492}; op[485] = getOpcodeAlt(a);}
        {int[] a = {487,491}; op[486] = getOpcodeCat(a);}
        {int[] a = {488,489,490}; op[487] = getOpcodeAlt(a);}
        {char[] a = {48}; op[488] = getOpcodeTls(a);}
        {char[] a = {49}; op[489] = getOpcodeTls(a);}
        {char[] a = {50}; op[490] = getOpcodeTls(a);}
        op[491] = getOpcodeRnm(60, 454); // oneToNine
        {int[] a = {493,494}; op[492] = getOpcodeCat(a);}
        {char[] a = {51}; op[493] = getOpcodeTls(a);}
        {int[] a = {495,496}; op[494] = getOpcodeAlt(a);}
        {char[] a = {48}; op[495] = getOpcodeTls(a);}
        {char[] a = {49}; op[496] = getOpcodeTls(a);}
        {int[] a = {498,503}; op[497] = getOpcodeAlt(a);}
        {int[] a = {499,502}; op[498] = getOpcodeCat(a);}
        {int[] a = {500,501}; op[499] = getOpcodeAlt(a);}
        {char[] a = {48}; op[500] = getOpcodeTls(a);}
        {char[] a = {49}; op[501] = getOpcodeTls(a);}
        op[502] = getOpcodeRnm(29, 231); // DIGIT
        {int[] a = {504,505}; op[503] = getOpcodeCat(a);}
        {char[] a = {50}; op[504] = getOpcodeTls(a);}
        {int[] a = {506,507,508}; op[505] = getOpcodeAlt(a);}
        {char[] a = {49}; op[506] = getOpcodeTls(a);}
        {char[] a = {50}; op[507] = getOpcodeTls(a);}
        {char[] a = {51}; op[508] = getOpcodeTls(a);}
        op[509] = getOpcodeRnm(61, 464); // zeroToFiftyNine
        op[510] = getOpcodeRnm(61, 464); // zeroToFiftyNine
        op[511] = getOpcodeRep((char)1, Character.MAX_VALUE, 512);
        op[512] = getOpcodeRnm(29, 231); // DIGIT
        {int[] a = {514,515,516,517,518,519,520,521,522,523,524,525,526,527,528,529,530,531,532,533,534,535,536,537,538,539,540,541,542,543}; op[513] = getOpcodeAlt(a);}
        op[514] = getOpcodeRnm(70, 544); // null
        op[515] = getOpcodeRnm(77, 610); // decimal
        op[516] = getOpcodeRnm(82, 650); // single
        op[517] = getOpcodeRnm(80, 635); // double
        op[518] = getOpcodeRnm(85, 674); // sbyte
        op[519] = getOpcodeRnm(84, 672); // byte
        op[520] = getOpcodeRnm(86, 679); // int16
        op[521] = getOpcodeRnm(87, 684); // int32
        op[522] = getOpcodeRnm(88, 689); // int64
        op[523] = getOpcodeRnm(71, 551); // binary
        op[524] = getOpcodeRnm(73, 567); // dateTime
        op[525] = getOpcodeRnm(74, 572); // dateTimeOffset
        op[526] = getOpcodeRnm(83, 654); // guid
        op[527] = getOpcodeRnm(89, 696); // string
        op[528] = getOpcodeRnm(91, 707); // time
        op[529] = getOpcodeRnm(72, 560); // boolean
        op[530] = getOpcodeRnm(92, 752); // geographyCollection
        op[531] = getOpcodeRnm(93, 753); // geographyLineString
        op[532] = getOpcodeRnm(94, 754); // geographyMultiLineString
        op[533] = getOpcodeRnm(95, 755); // geographyMultiPoint
        op[534] = getOpcodeRnm(96, 756); // geographyMultiPolygon
        op[535] = getOpcodeRnm(97, 757); // geographyPoint
        op[536] = getOpcodeRnm(98, 758); // geographyPolygon
        op[537] = getOpcodeRnm(99, 759); // geometryCollection
        op[538] = getOpcodeRnm(100, 760); // geometryLineString
        op[539] = getOpcodeRnm(101, 761); // geometryMultiLineString
        op[540] = getOpcodeRnm(102, 762); // geometryMultiPoint
        op[541] = getOpcodeRnm(103, 763); // geometryMultiPolygon
        op[542] = getOpcodeRnm(104, 764); // geometryPoint
        op[543] = getOpcodeRnm(105, 765); // geometryPolygon
        {int[] a = {545,546}; op[544] = getOpcodeCat(a);}
        {char[] a = {110,117,108,108}; op[545] = getOpcodeTbs(a);}
        op[546] = getOpcodeRep((char)0, (char)1, 547);
        {int[] a = {548,549,550}; op[547] = getOpcodeCat(a);}
        {char[] a = {39}; op[548] = getOpcodeTls(a);}
        op[549] = getOpcodeRnm(115, 788); // qualifiedTypeName
        {char[] a = {39}; op[550] = getOpcodeTls(a);}
        {int[] a = {552,555,556,559}; op[551] = getOpcodeCat(a);}
        {int[] a = {553,554}; op[552] = getOpcodeAlt(a);}
        {char[] a = {88}; op[553] = getOpcodeTbs(a);}
        {char[] a = {98,105,110,97,114,121}; op[554] = getOpcodeTls(a);}
        op[555] = getOpcodeRnm(52, 439); // SQUOTE
        op[556] = getOpcodeRep((char)0, Character.MAX_VALUE, 557);
        op[557] = getOpcodeRep((char)2, (char)2, 558);
        op[558] = getOpcodeRnm(30, 232); // HEXDIG
        op[559] = getOpcodeRnm(52, 439); // SQUOTE
        {int[] a = {561,564}; op[560] = getOpcodeAlt(a);}
        {int[] a = {562,563}; op[561] = getOpcodeAlt(a);}
        {char[] a = {116,114,117,101}; op[562] = getOpcodeTls(a);}
        {char[] a = {49}; op[563] = getOpcodeTls(a);}
        {int[] a = {565,566}; op[564] = getOpcodeAlt(a);}
        {char[] a = {102,97,108,115,101}; op[565] = getOpcodeTls(a);}
        {char[] a = {48}; op[566] = getOpcodeTls(a);}
        {int[] a = {568,569,570,571}; op[567] = getOpcodeCat(a);}
        {char[] a = {100,97,116,101,116,105,109,101}; op[568] = getOpcodeTls(a);}
        op[569] = getOpcodeRnm(52, 439); // SQUOTE
        op[570] = getOpcodeRnm(75, 577); // dateTimeBody
        op[571] = getOpcodeRnm(52, 439); // SQUOTE
        {int[] a = {573,574,575,576}; op[572] = getOpcodeCat(a);}
        {char[] a = {100,97,116,101,116,105,109,101,111,102,102,115,101,116}; op[573] = getOpcodeTls(a);}
        op[574] = getOpcodeRnm(52, 439); // SQUOTE
        op[575] = getOpcodeRnm(76, 601); // dateTimeOffsetBody
        op[576] = getOpcodeRnm(52, 439); // SQUOTE
        {int[] a = {578,579,580,581,582,583,584}; op[577] = getOpcodeCat(a);}
        op[578] = getOpcodeRnm(62, 473); // year
        {char[] a = {45}; op[579] = getOpcodeTls(a);}
        op[580] = getOpcodeRnm(63, 475); // month
        {char[] a = {45}; op[581] = getOpcodeTls(a);}
        op[582] = getOpcodeRnm(64, 485); // day
        {char[] a = {84}; op[583] = getOpcodeTls(a);}
        {int[] a = {585,597}; op[584] = getOpcodeAlt(a);}
        {int[] a = {586,587,588,589}; op[585] = getOpcodeCat(a);}
        op[586] = getOpcodeRnm(65, 497); // hour
        {char[] a = {58}; op[587] = getOpcodeTls(a);}
        op[588] = getOpcodeRnm(66, 509); // minute
        op[589] = getOpcodeRep((char)0, (char)1, 590);
        {int[] a = {591,592,593}; op[590] = getOpcodeCat(a);}
        {char[] a = {58}; op[591] = getOpcodeTls(a);}
        op[592] = getOpcodeRnm(67, 510); // second
        op[593] = getOpcodeRep((char)0, (char)1, 594);
        {int[] a = {595,596}; op[594] = getOpcodeCat(a);}
        {char[] a = {46}; op[595] = getOpcodeTls(a);}
        op[596] = getOpcodeRnm(68, 511); // fractionalSeconds
        {int[] a = {598,599}; op[597] = getOpcodeCat(a);}
        {char[] a = {50,52,58,48,48}; op[598] = getOpcodeTls(a);}
        op[599] = getOpcodeRep((char)0, (char)1, 600);
        {char[] a = {58,48,48}; op[600] = getOpcodeTls(a);}
        {int[] a = {602,603}; op[601] = getOpcodeCat(a);}
        op[602] = getOpcodeRnm(75, 577); // dateTimeBody
        {int[] a = {604,605}; op[603] = getOpcodeAlt(a);}
        {char[] a = {90}; op[604] = getOpcodeTls(a);}
        {int[] a = {606,607,608,609}; op[605] = getOpcodeCat(a);}
        op[606] = getOpcodeRnm(54, 441); // sign
        op[607] = getOpcodeRnm(65, 497); // hour
        {char[] a = {58}; op[608] = getOpcodeTls(a);}
        op[609] = getOpcodeRnm(66, 509); // minute
        {int[] a = {611,612}; op[610] = getOpcodeCat(a);}
        op[611] = getOpcodeRnm(78, 614); // decimalBody
        op[612] = getOpcodeRep((char)0, (char)1, 613);
        {char[] a = {77}; op[613] = getOpcodeTls(a);}
        {int[] a = {615,617,619}; op[614] = getOpcodeCat(a);}
        op[615] = getOpcodeRep((char)0, (char)1, 616);
        op[616] = getOpcodeRnm(54, 441); // sign
        op[617] = getOpcodeRep((char)1, Character.MAX_VALUE, 618);
        op[618] = getOpcodeRnm(29, 231); // DIGIT
        op[619] = getOpcodeRep((char)0, (char)1, 620);
        {int[] a = {621,622}; op[620] = getOpcodeCat(a);}
        {char[] a = {46}; op[621] = getOpcodeTls(a);}
        op[622] = getOpcodeRep((char)1, Character.MAX_VALUE, 623);
        op[623] = getOpcodeRnm(29, 231); // DIGIT
        {int[] a = {625,634}; op[624] = getOpcodeAlt(a);}
        {int[] a = {626,627}; op[625] = getOpcodeCat(a);}
        op[626] = getOpcodeRnm(78, 614); // decimalBody
        op[627] = getOpcodeRep((char)0, (char)1, 628);
        {int[] a = {629,630,632}; op[628] = getOpcodeCat(a);}
        {char[] a = {69}; op[629] = getOpcodeTls(a);}
        op[630] = getOpcodeRep((char)0, (char)1, 631);
        op[631] = getOpcodeRnm(54, 441); // sign
        op[632] = getOpcodeRep((char)1, Character.MAX_VALUE, 633);
        op[633] = getOpcodeRnm(29, 231); // DIGIT
        op[634] = getOpcodeRnm(59, 450); // nanInfinity
        {int[] a = {636,637}; op[635] = getOpcodeCat(a);}
        op[636] = getOpcodeRnm(79, 624); // doubleBody
        op[637] = getOpcodeRep((char)0, (char)1, 638);
        {char[] a = {68}; op[638] = getOpcodeTls(a);}
        {int[] a = {640,649}; op[639] = getOpcodeAlt(a);}
        {int[] a = {641,642}; op[640] = getOpcodeCat(a);}
        op[641] = getOpcodeRnm(78, 614); // decimalBody
        op[642] = getOpcodeRep((char)0, (char)1, 643);
        {int[] a = {644,645,647}; op[643] = getOpcodeCat(a);}
        {char[] a = {69}; op[644] = getOpcodeTls(a);}
        op[645] = getOpcodeRep((char)0, (char)1, 646);
        op[646] = getOpcodeRnm(54, 441); // sign
        op[647] = getOpcodeRep((char)1, Character.MAX_VALUE, 648);
        op[648] = getOpcodeRnm(29, 231); // DIGIT
        op[649] = getOpcodeRnm(59, 450); // nanInfinity
        {int[] a = {651,652}; op[650] = getOpcodeCat(a);}
        op[651] = getOpcodeRnm(81, 639); // singleBody
        op[652] = getOpcodeRep((char)0, (char)1, 653);
        {char[] a = {70}; op[653] = getOpcodeTls(a);}
        {int[] a = {655,656,657,659,660,662,663,665,666,668,669,671}; op[654] = getOpcodeCat(a);}
        {char[] a = {103,117,105,100}; op[655] = getOpcodeTls(a);}
        op[656] = getOpcodeRnm(52, 439); // SQUOTE
        op[657] = getOpcodeRep((char)8, (char)8, 658);
        op[658] = getOpcodeRnm(30, 232); // HEXDIG
        {char[] a = {45}; op[659] = getOpcodeTls(a);}
        op[660] = getOpcodeRep((char)4, (char)4, 661);
        op[661] = getOpcodeRnm(30, 232); // HEXDIG
        {char[] a = {45}; op[662] = getOpcodeTls(a);}
        op[663] = getOpcodeRep((char)4, (char)4, 664);
        op[664] = getOpcodeRnm(30, 232); // HEXDIG
        {char[] a = {45}; op[665] = getOpcodeTls(a);}
        op[666] = getOpcodeRep((char)4, (char)4, 667);
        op[667] = getOpcodeRnm(30, 232); // HEXDIG
        {char[] a = {45}; op[668] = getOpcodeTls(a);}
        op[669] = getOpcodeRep((char)12, (char)12, 670);
        op[670] = getOpcodeRnm(30, 232); // HEXDIG
        op[671] = getOpcodeRnm(52, 439); // SQUOTE
        op[672] = getOpcodeRep((char)1, (char)3, 673);
        op[673] = getOpcodeRnm(29, 231); // DIGIT
        {int[] a = {675,677}; op[674] = getOpcodeCat(a);}
        op[675] = getOpcodeRep((char)0, (char)1, 676);
        op[676] = getOpcodeRnm(54, 441); // sign
        op[677] = getOpcodeRep((char)1, (char)3, 678);
        op[678] = getOpcodeRnm(29, 231); // DIGIT
        {int[] a = {680,682}; op[679] = getOpcodeCat(a);}
        op[680] = getOpcodeRep((char)0, (char)1, 681);
        op[681] = getOpcodeRnm(54, 441); // sign
        op[682] = getOpcodeRep((char)1, (char)5, 683);
        op[683] = getOpcodeRnm(29, 231); // DIGIT
        {int[] a = {685,687}; op[684] = getOpcodeCat(a);}
        op[685] = getOpcodeRep((char)0, (char)1, 686);
        op[686] = getOpcodeRnm(54, 441); // sign
        op[687] = getOpcodeRep((char)1, (char)10, 688);
        op[688] = getOpcodeRnm(29, 231); // DIGIT
        {int[] a = {690,692,694}; op[689] = getOpcodeCat(a);}
        op[690] = getOpcodeRep((char)0, (char)1, 691);
        op[691] = getOpcodeRnm(54, 441); // sign
        op[692] = getOpcodeRep((char)1, (char)19, 693);
        op[693] = getOpcodeRnm(29, 231); // DIGIT
        op[694] = getOpcodeRep((char)0, (char)1, 695);
        {char[] a = {76}; op[695] = getOpcodeTls(a);}
        {int[] a = {697,698,703}; op[696] = getOpcodeCat(a);}
        op[697] = getOpcodeRnm(52, 439); // SQUOTE
        op[698] = getOpcodeRep((char)0, Character.MAX_VALUE, 699);
        {int[] a = {700,701,702}; op[699] = getOpcodeAlt(a);}
        op[700] = getOpcodeRnm(49, 418); // unreserved
        op[701] = getOpcodeRnm(48, 414); // pct-encoded
        op[702] = getOpcodeRnm(90, 704); // SQUOTE-in-string
        op[703] = getOpcodeRnm(52, 439); // SQUOTE
        {int[] a = {705,706}; op[704] = getOpcodeCat(a);}
        op[705] = getOpcodeRnm(52, 439); // SQUOTE
        op[706] = getOpcodeRnm(52, 439); // SQUOTE
        {int[] a = {708,709,710,712,713,718,723,728,751}; op[707] = getOpcodeCat(a);}
        {char[] a = {116,105,109,101}; op[708] = getOpcodeTls(a);}
        op[709] = getOpcodeRnm(52, 439); // SQUOTE
        op[710] = getOpcodeRep((char)0, (char)1, 711);
        op[711] = getOpcodeRnm(54, 441); // sign
        {char[] a = {80}; op[712] = getOpcodeTls(a);}
        op[713] = getOpcodeRep((char)0, (char)1, 714);
        {int[] a = {715,717}; op[714] = getOpcodeCat(a);}
        op[715] = getOpcodeRep((char)1, Character.MAX_VALUE, 716);
        op[716] = getOpcodeRnm(29, 231); // DIGIT
        {char[] a = {89}; op[717] = getOpcodeTls(a);}
        op[718] = getOpcodeRep((char)0, (char)1, 719);
        {int[] a = {720,722}; op[719] = getOpcodeCat(a);}
        op[720] = getOpcodeRep((char)1, Character.MAX_VALUE, 721);
        op[721] = getOpcodeRnm(29, 231); // DIGIT
        {char[] a = {77}; op[722] = getOpcodeTls(a);}
        op[723] = getOpcodeRep((char)0, (char)1, 724);
        {int[] a = {725,727}; op[724] = getOpcodeCat(a);}
        op[725] = getOpcodeRep((char)1, Character.MAX_VALUE, 726);
        op[726] = getOpcodeRnm(29, 231); // DIGIT
        {char[] a = {68}; op[727] = getOpcodeTls(a);}
        op[728] = getOpcodeRep((char)0, (char)1, 729);
        {int[] a = {730,731,736,741}; op[729] = getOpcodeCat(a);}
        {char[] a = {84}; op[730] = getOpcodeTls(a);}
        op[731] = getOpcodeRep((char)0, (char)1, 732);
        {int[] a = {733,735}; op[732] = getOpcodeCat(a);}
        op[733] = getOpcodeRep((char)1, Character.MAX_VALUE, 734);
        op[734] = getOpcodeRnm(29, 231); // DIGIT
        {char[] a = {72}; op[735] = getOpcodeTls(a);}
        op[736] = getOpcodeRep((char)0, (char)1, 737);
        {int[] a = {738,740}; op[737] = getOpcodeCat(a);}
        op[738] = getOpcodeRep((char)1, Character.MAX_VALUE, 739);
        op[739] = getOpcodeRnm(29, 231); // DIGIT
        {char[] a = {77}; op[740] = getOpcodeTls(a);}
        op[741] = getOpcodeRep((char)0, (char)1, 742);
        {int[] a = {743,745,750}; op[742] = getOpcodeCat(a);}
        op[743] = getOpcodeRep((char)1, Character.MAX_VALUE, 744);
        op[744] = getOpcodeRnm(29, 231); // DIGIT
        op[745] = getOpcodeRep((char)0, (char)1, 746);
        {int[] a = {747,748}; op[746] = getOpcodeCat(a);}
        {char[] a = {46}; op[747] = getOpcodeTls(a);}
        op[748] = getOpcodeRep((char)1, Character.MAX_VALUE, 749);
        op[749] = getOpcodeRnm(29, 231); // DIGIT
        {char[] a = {83}; op[750] = getOpcodeTls(a);}
        op[751] = getOpcodeRnm(52, 439); // SQUOTE
        {char[] a = {123,84,79,68,79,50,125}; op[752] = getOpcodeTls(a);}
        {char[] a = {123,84,79,68,79,51,125}; op[753] = getOpcodeTls(a);}
        {char[] a = {123,84,79,68,79,52,125}; op[754] = getOpcodeTls(a);}
        {char[] a = {123,84,79,68,79,53,125}; op[755] = getOpcodeTls(a);}
        {char[] a = {123,84,79,68,79,54,125}; op[756] = getOpcodeTls(a);}
        {char[] a = {123,84,79,68,79,55,125}; op[757] = getOpcodeTls(a);}
        {char[] a = {123,84,79,68,79,56,125}; op[758] = getOpcodeTls(a);}
        {char[] a = {123,84,79,68,79,49,48,125}; op[759] = getOpcodeTls(a);}
        {char[] a = {123,84,79,68,79,49,49,125}; op[760] = getOpcodeTls(a);}
        {char[] a = {123,84,79,68,79,49,50,125}; op[761] = getOpcodeTls(a);}
        {char[] a = {123,84,79,68,79,49,51,125}; op[762] = getOpcodeTls(a);}
        {char[] a = {123,84,79,68,79,49,52,125}; op[763] = getOpcodeTls(a);}
        {char[] a = {123,84,79,68,79,49,53,125}; op[764] = getOpcodeTls(a);}
        {char[] a = {123,84,79,68,79,49,54,125}; op[765] = getOpcodeTls(a);}
        {int[] a = {767,768}; op[766] = getOpcodeCat(a);}
        op[767] = getOpcodeRnm(107, 770); // identifierLeadingCharacter
        op[768] = getOpcodeRep((char)0, (char)478, 769);
        op[769] = getOpcodeRnm(108, 773); // identifierCharacter
        {int[] a = {771,772}; op[770] = getOpcodeAlt(a);}
        op[771] = getOpcodeRnm(28, 228); // ALPHA
        {char[] a = {95}; op[772] = getOpcodeTls(a);}
        {int[] a = {774,775,776}; op[773] = getOpcodeAlt(a);}
        op[774] = getOpcodeRnm(28, 228); // ALPHA
        op[775] = getOpcodeRnm(29, 231); // DIGIT
        {char[] a = {95}; op[776] = getOpcodeTls(a);}
        {int[] a = {778,779}; op[777] = getOpcodeCat(a);}
        op[778] = getOpcodeRnm(110, 783); // namespacePart
        op[779] = getOpcodeRep((char)0, Character.MAX_VALUE, 780);
        {int[] a = {781,782}; op[780] = getOpcodeCat(a);}
        {char[] a = {46}; op[781] = getOpcodeTls(a);}
        op[782] = getOpcodeRnm(110, 783); // namespacePart
        op[783] = getOpcodeRnm(106, 766); // odataIdentifier
        op[784] = getOpcodeRnm(106, 766); // odataIdentifier
        op[785] = getOpcodeRnm(106, 766); // odataIdentifier
        op[786] = getOpcodeRnm(106, 766); // odataIdentifier
        op[787] = getOpcodeRnm(106, 766); // odataIdentifier
        {int[] a = {789,790,791,792,793}; op[788] = getOpcodeAlt(a);}
        op[789] = getOpcodeRnm(116, 801); // qualifiedEntityTypeName
        op[790] = getOpcodeRnm(117, 805); // qualifiedComplexTypeName
        op[791] = getOpcodeRnm(118, 809); // qualifiedEnumerationTypeName
        op[792] = getOpcodeRnm(119, 813); // primitiveTypeName
        {int[] a = {794,795,800}; op[793] = getOpcodeCat(a);}
        {char[] a = {99,111,108,108,101,99,116,105,111,110,40}; op[794] = getOpcodeTls(a);}
        {int[] a = {796,797,798,799}; op[795] = getOpcodeAlt(a);}
        op[796] = getOpcodeRnm(116, 801); // qualifiedEntityTypeName
        op[797] = getOpcodeRnm(117, 805); // qualifiedComplexTypeName
        op[798] = getOpcodeRnm(118, 809); // qualifiedEnumerationTypeName
        op[799] = getOpcodeRnm(119, 813); // primitiveTypeName
        {char[] a = {41}; op[800] = getOpcodeTls(a);}
        {int[] a = {802,803,804}; op[801] = getOpcodeCat(a);}
        op[802] = getOpcodeRnm(109, 777); // namespace
        {char[] a = {46}; op[803] = getOpcodeTls(a);}
        op[804] = getOpcodeRnm(112, 785); // entityTypeName
        {int[] a = {806,807,808}; op[805] = getOpcodeCat(a);}
        op[806] = getOpcodeRnm(109, 777); // namespace
        {char[] a = {46}; op[807] = getOpcodeTls(a);}
        op[808] = getOpcodeRnm(113, 786); // complexTypeName
        {int[] a = {810,811,812}; op[809] = getOpcodeCat(a);}
        op[810] = getOpcodeRnm(109, 777); // namespace
        {char[] a = {46}; op[811] = getOpcodeTls(a);}
        op[812] = getOpcodeRnm(114, 787); // enumerationTypeName
        {int[] a = {814,816}; op[813] = getOpcodeCat(a);}
        op[814] = getOpcodeRep((char)0, (char)1, 815);
        {char[] a = {101,100,109,46}; op[815] = getOpcodeTls(a);}
        {int[] a = {817,818,819,820,821,822,823,824,825,826,827,828,829,830,831,832,833,834}; op[816] = getOpcodeAlt(a);}
        {char[] a = {98,105,110,97,114,121}; op[817] = getOpcodeTls(a);}
        {char[] a = {98,111,111,108,101,97,110}; op[818] = getOpcodeTls(a);}
        {char[] a = {98,121,116,101}; op[819] = getOpcodeTls(a);}
        {char[] a = {100,97,116,101,116,105,109,101}; op[820] = getOpcodeTls(a);}
        {char[] a = {100,97,116,101,116,105,109,101,111,102,102,115,101,116}; op[821] = getOpcodeTls(a);}
        {char[] a = {100,101,99,105,109,97,108}; op[822] = getOpcodeTls(a);}
        {char[] a = {100,111,117,98,108,101}; op[823] = getOpcodeTls(a);}
        {char[] a = {115,105,110,103,108,101}; op[824] = getOpcodeTls(a);}
        {char[] a = {102,108,111,97,116}; op[825] = getOpcodeTls(a);}
        {char[] a = {103,117,105,100}; op[826] = getOpcodeTls(a);}
        {char[] a = {105,110,116,49,54}; op[827] = getOpcodeTls(a);}
        {char[] a = {105,110,116,51,50}; op[828] = getOpcodeTls(a);}
        {char[] a = {105,110,116,54,52}; op[829] = getOpcodeTls(a);}
        {char[] a = {115,98,121,116,101}; op[830] = getOpcodeTls(a);}
        {char[] a = {115,116,114,101,97,109}; op[831] = getOpcodeTls(a);}
        {char[] a = {115,116,114,105,110,103}; op[832] = getOpcodeTls(a);}
        {char[] a = {116,105,109,101}; op[833] = getOpcodeTls(a);}
        {int[] a = {835,836}; op[834] = getOpcodeCat(a);}
        op[835] = getOpcodeRnm(120, 838); // abstractSpatialTypeName
        op[836] = getOpcodeRep((char)0, (char)1, 837);
        op[837] = getOpcodeRnm(121, 841); // concreteSpatialTypeName
        {int[] a = {839,840}; op[838] = getOpcodeAlt(a);}
        {char[] a = {71,101,111,103,114,97,112,104,121}; op[839] = getOpcodeTls(a);}
        {char[] a = {71,101,111,109,101,116,114,121}; op[840] = getOpcodeTls(a);}
        {int[] a = {842,843,844,845,846,847,848}; op[841] = getOpcodeAlt(a);}
        {char[] a = {67,111,108,108,101,99,116,105,111,110}; op[842] = getOpcodeTls(a);}
        {char[] a = {76,105,110,101,115,116,114,105,110,103}; op[843] = getOpcodeTls(a);}
        {char[] a = {77,117,108,116,105,76,105,110,101,83,116,114,105,110,103}; op[844] = getOpcodeTls(a);}
        {char[] a = {77,117,108,116,105,80,111,105,110,116}; op[845] = getOpcodeTls(a);}
        {char[] a = {77,117,108,116,105,80,111,108,121,103,111,110}; op[846] = getOpcodeTls(a);}
        {char[] a = {80,111,105,110,116}; op[847] = getOpcodeTls(a);}
        {char[] a = {80,111,108,121,103,111,110}; op[848] = getOpcodeTls(a);}
        {int[] a = {850,851,852,853,854}; op[849] = getOpcodeAlt(a);}
        op[850] = getOpcodeRnm(123, 855); // primitiveProperty
        op[851] = getOpcodeRnm(126, 860); // primitiveColProperty
        op[852] = getOpcodeRnm(127, 861); // complexProperty
        op[853] = getOpcodeRnm(128, 862); // complexColProperty
        op[854] = getOpcodeRnm(129, 863); // streamProperty
        {int[] a = {856,857}; op[855] = getOpcodeAlt(a);}
        op[856] = getOpcodeRnm(124, 858); // primitiveKeyProperty
        op[857] = getOpcodeRnm(125, 859); // primitiveNonKeyProperty
        op[858] = getOpcodeRnm(106, 766); // odataIdentifier
        op[859] = getOpcodeRnm(106, 766); // odataIdentifier
        op[860] = getOpcodeRnm(106, 766); // odataIdentifier
        op[861] = getOpcodeRnm(106, 766); // odataIdentifier
        op[862] = getOpcodeRnm(106, 766); // odataIdentifier
        op[863] = getOpcodeRnm(106, 766); // odataIdentifier
        {int[] a = {865,866}; op[864] = getOpcodeAlt(a);}
        op[865] = getOpcodeRnm(131, 867); // entityNavigationProperty
        op[866] = getOpcodeRnm(132, 868); // entityColNavigationProperty
        op[867] = getOpcodeRnm(106, 766); // odataIdentifier
        op[868] = getOpcodeRnm(106, 766); // odataIdentifier
        op[869] = getOpcodeRnm(106, 766); // odataIdentifier
        op[870] = getOpcodeRnm(106, 766); // odataIdentifier
        {int[] a = {872,873,874,875,876,877}; op[871] = getOpcodeAlt(a);}
        op[872] = getOpcodeRnm(136, 878); // entityFunction
        op[873] = getOpcodeRnm(137, 879); // entityColFunction
        op[874] = getOpcodeRnm(138, 880); // complexFunction
        op[875] = getOpcodeRnm(139, 881); // complexColFunction
        op[876] = getOpcodeRnm(140, 882); // primitiveFunction
        op[877] = getOpcodeRnm(141, 883); // primitiveColFunction
        op[878] = getOpcodeRnm(106, 766); // odataIdentifier
        op[879] = getOpcodeRnm(106, 766); // odataIdentifier
        op[880] = getOpcodeRnm(106, 766); // odataIdentifier
        op[881] = getOpcodeRnm(106, 766); // odataIdentifier
        op[882] = getOpcodeRnm(106, 766); // odataIdentifier
        op[883] = getOpcodeRnm(106, 766); // odataIdentifier
        {int[] a = {885,893,894,898,902,906,910,914}; op[884] = getOpcodeAlt(a);}
        {int[] a = {886,890,891}; op[885] = getOpcodeCat(a);}
        op[886] = getOpcodeRep((char)0, (char)1, 887);
        {int[] a = {888,889}; op[887] = getOpcodeCat(a);}
        op[888] = getOpcodeRnm(133, 869); // entityContainerName
        {char[] a = {46}; op[889] = getOpcodeTls(a);}
        op[890] = getOpcodeRnm(111, 784); // entitySetName
        op[891] = getOpcodeRep((char)0, (char)1, 892);
        op[892] = getOpcodeRnm(143, 918); // collectionNavigation
        op[893] = getOpcodeRnm(157, 1045); // actionCall
        {int[] a = {895,896}; op[894] = getOpcodeCat(a);}
        op[895] = getOpcodeRnm(160, 1057); // entityColFunctionCall
        op[896] = getOpcodeRep((char)0, (char)1, 897);
        op[897] = getOpcodeRnm(143, 918); // collectionNavigation
        {int[] a = {899,900}; op[898] = getOpcodeCat(a);}
        op[899] = getOpcodeRnm(159, 1052); // entityFunctionCall
        op[900] = getOpcodeRep((char)0, (char)1, 901);
        op[901] = getOpcodeRnm(149, 949); // singleNavigation
        {int[] a = {903,904}; op[902] = getOpcodeCat(a);}
        op[903] = getOpcodeRnm(162, 1067); // complexColFunctionCall
        op[904] = getOpcodeRep((char)0, (char)1, 905);
        op[905] = getOpcodeRnm(150, 990); // collectionPath
        {int[] a = {907,908}; op[906] = getOpcodeCat(a);}
        op[907] = getOpcodeRnm(161, 1062); // complexFunctionCall
        op[908] = getOpcodeRep((char)0, (char)1, 909);
        op[909] = getOpcodeRnm(152, 996); // complexPath
        {int[] a = {911,912}; op[910] = getOpcodeCat(a);}
        op[911] = getOpcodeRnm(164, 1077); // primitiveColFunctionCall
        op[912] = getOpcodeRep((char)0, (char)1, 913);
        op[913] = getOpcodeRnm(150, 990); // collectionPath
        {int[] a = {915,916}; op[914] = getOpcodeCat(a);}
        op[915] = getOpcodeRnm(163, 1072); // primitiveFunctionCall
        op[916] = getOpcodeRep((char)0, (char)1, 917);
        op[917] = getOpcodeRnm(151, 993); // singlePath
        {int[] a = {919,923}; op[918] = getOpcodeCat(a);}
        op[919] = getOpcodeRep((char)0, (char)1, 920);
        {int[] a = {921,922}; op[920] = getOpcodeCat(a);}
        {char[] a = {47}; op[921] = getOpcodeTls(a);}
        op[922] = getOpcodeRnm(116, 801); // qualifiedEntityTypeName
        {int[] a = {924,928}; op[923] = getOpcodeAlt(a);}
        {int[] a = {925,926}; op[924] = getOpcodeCat(a);}
        op[925] = getOpcodeRnm(144, 929); // keyPredicate
        op[926] = getOpcodeRep((char)0, (char)1, 927);
        op[927] = getOpcodeRnm(149, 949); // singleNavigation
        op[928] = getOpcodeRnm(150, 990); // collectionPath
        {int[] a = {930,931}; op[929] = getOpcodeAlt(a);}
        op[930] = getOpcodeRnm(145, 932); // simpleKey
        op[931] = getOpcodeRnm(146, 936); // compoundKey
        {int[] a = {933,934,935}; op[932] = getOpcodeCat(a);}
        {char[] a = {40}; op[933] = getOpcodeTls(a);}
        op[934] = getOpcodeRnm(69, 513); // primitiveLiteral
        {char[] a = {41}; op[935] = getOpcodeTls(a);}
        {int[] a = {937,938,939,943}; op[936] = getOpcodeCat(a);}
        {char[] a = {40}; op[937] = getOpcodeTls(a);}
        op[938] = getOpcodeRnm(147, 944); // keyValuePair
        op[939] = getOpcodeRep((char)0, Character.MAX_VALUE, 940);
        {int[] a = {941,942}; op[940] = getOpcodeCat(a);}
        {char[] a = {44}; op[941] = getOpcodeTls(a);}
        op[942] = getOpcodeRnm(147, 944); // keyValuePair
        {char[] a = {41}; op[943] = getOpcodeTls(a);}
        {int[] a = {945,946,947}; op[944] = getOpcodeCat(a);}
        op[945] = getOpcodeRnm(124, 858); // primitiveKeyProperty
        {char[] a = {61}; op[946] = getOpcodeTls(a);}
        op[947] = getOpcodeRnm(148, 948); // keyPropertyValue
        op[948] = getOpcodeRnm(69, 513); // primitiveLiteral
        {int[] a = {950,954}; op[949] = getOpcodeCat(a);}
        op[950] = getOpcodeRep((char)0, (char)1, 951);
        {int[] a = {952,953}; op[951] = getOpcodeCat(a);}
        {char[] a = {47}; op[952] = getOpcodeTls(a);}
        op[953] = getOpcodeRnm(116, 801); // qualifiedEntityTypeName
        {int[] a = {955,956,960,988,989}; op[954] = getOpcodeAlt(a);}
        op[955] = getOpcodeRnm(154, 1015); // value
        {int[] a = {957,958,959}; op[956] = getOpcodeCat(a);}
        op[957] = getOpcodeRnm(155, 1016); // links
        {char[] a = {47}; op[958] = getOpcodeTls(a);}
        op[959] = getOpcodeRnm(130, 864); // navigationProperty
        {int[] a = {961,962}; op[960] = getOpcodeCat(a);}
        {char[] a = {47}; op[961] = getOpcodeTls(a);}
        {int[] a = {963,964,968,972,976,980,984}; op[962] = getOpcodeAlt(a);}
        op[963] = getOpcodeRnm(129, 863); // streamProperty
        {int[] a = {965,966}; op[964] = getOpcodeCat(a);}
        op[965] = getOpcodeRnm(126, 860); // primitiveColProperty
        op[966] = getOpcodeRep((char)0, (char)1, 967);
        op[967] = getOpcodeRnm(150, 990); // collectionPath
        {int[] a = {969,970}; op[968] = getOpcodeCat(a);}
        op[969] = getOpcodeRnm(123, 855); // primitiveProperty
        op[970] = getOpcodeRep((char)0, (char)1, 971);
        op[971] = getOpcodeRnm(151, 993); // singlePath
        {int[] a = {973,974}; op[972] = getOpcodeCat(a);}
        op[973] = getOpcodeRnm(128, 862); // complexColProperty
        op[974] = getOpcodeRep((char)0, (char)1, 975);
        op[975] = getOpcodeRnm(150, 990); // collectionPath
        {int[] a = {977,978}; op[976] = getOpcodeCat(a);}
        op[977] = getOpcodeRnm(127, 861); // complexProperty
        op[978] = getOpcodeRep((char)0, (char)1, 979);
        op[979] = getOpcodeRnm(152, 996); // complexPath
        {int[] a = {981,982}; op[980] = getOpcodeCat(a);}
        op[981] = getOpcodeRnm(132, 868); // entityColNavigationProperty
        op[982] = getOpcodeRep((char)0, (char)1, 983);
        op[983] = getOpcodeRnm(143, 918); // collectionNavigation
        {int[] a = {985,986}; op[984] = getOpcodeCat(a);}
        op[985] = getOpcodeRnm(131, 867); // entityNavigationProperty
        op[986] = getOpcodeRep((char)0, (char)1, 987);
        op[987] = getOpcodeRnm(149, 949); // singleNavigation
        op[988] = getOpcodeRnm(156, 1017); // boundOperation
        {char[] a = {}; op[989] = getOpcodeTls(a);}
        {int[] a = {991,992}; op[990] = getOpcodeAlt(a);}
        op[991] = getOpcodeRnm(153, 1014); // count
        op[992] = getOpcodeRnm(156, 1017); // boundOperation
        {int[] a = {994,995}; op[993] = getOpcodeAlt(a);}
        op[994] = getOpcodeRnm(154, 1015); // value
        op[995] = getOpcodeRnm(156, 1017); // boundOperation
        {int[] a = {997,1001}; op[996] = getOpcodeCat(a);}
        op[997] = getOpcodeRep((char)0, (char)1, 998);
        {int[] a = {999,1000}; op[998] = getOpcodeCat(a);}
        {char[] a = {47}; op[999] = getOpcodeTls(a);}
        op[1000] = getOpcodeRnm(117, 805); // qualifiedComplexTypeName
        {int[] a = {1002,1013}; op[1001] = getOpcodeAlt(a);}
        {int[] a = {1003,1004}; op[1002] = getOpcodeCat(a);}
        {char[] a = {47}; op[1003] = getOpcodeTls(a);}
        {int[] a = {1005,1009}; op[1004] = getOpcodeAlt(a);}
        {int[] a = {1006,1007}; op[1005] = getOpcodeCat(a);}
        op[1006] = getOpcodeRnm(123, 855); // primitiveProperty
        op[1007] = getOpcodeRep((char)0, (char)1, 1008);
        op[1008] = getOpcodeRnm(151, 993); // singlePath
        {int[] a = {1010,1011}; op[1009] = getOpcodeCat(a);}
        op[1010] = getOpcodeRnm(127, 861); // complexProperty
        op[1011] = getOpcodeRep((char)0, (char)1, 1012);
        op[1012] = getOpcodeRnm(152, 996); // complexPath
        op[1013] = getOpcodeRnm(156, 1017); // boundOperation
        {char[] a = {47,36,99,111,117,110,116}; op[1014] = getOpcodeTls(a);}
        {char[] a = {47,36,118,97,108,117,101}; op[1015] = getOpcodeTls(a);}
        {char[] a = {47,36,108,105,110,107,115}; op[1016] = getOpcodeTls(a);}
        {int[] a = {1018,1019}; op[1017] = getOpcodeCat(a);}
        {char[] a = {47}; op[1018] = getOpcodeTls(a);}
        {int[] a = {1020,1021,1025,1029,1033,1037,1041}; op[1019] = getOpcodeAlt(a);}
        op[1020] = getOpcodeRnm(158, 1051); // boundActionCall
        {int[] a = {1022,1023}; op[1021] = getOpcodeCat(a);}
        op[1022] = getOpcodeRnm(166, 1083); // boundEntityColFuncCall
        op[1023] = getOpcodeRep((char)0, (char)1, 1024);
        op[1024] = getOpcodeRnm(143, 918); // collectionNavigation
        {int[] a = {1026,1027}; op[1025] = getOpcodeCat(a);}
        op[1026] = getOpcodeRnm(165, 1082); // boundEntityFuncCall
        op[1027] = getOpcodeRep((char)0, (char)1, 1028);
        op[1028] = getOpcodeRnm(149, 949); // singleNavigation
        {int[] a = {1030,1031}; op[1029] = getOpcodeCat(a);}
        op[1030] = getOpcodeRnm(168, 1085); // boundComplexColFuncCall
        op[1031] = getOpcodeRep((char)0, (char)1, 1032);
        op[1032] = getOpcodeRnm(150, 990); // collectionPath
        {int[] a = {1034,1035}; op[1033] = getOpcodeCat(a);}
        op[1034] = getOpcodeRnm(167, 1084); // boundComplexFuncCall
        op[1035] = getOpcodeRep((char)0, (char)1, 1036);
        op[1036] = getOpcodeRnm(152, 996); // complexPath
        {int[] a = {1038,1039}; op[1037] = getOpcodeCat(a);}
        op[1038] = getOpcodeRnm(170, 1087); // boundPrimitiveColFuncCall
        op[1039] = getOpcodeRep((char)0, (char)1, 1040);
        op[1040] = getOpcodeRnm(150, 990); // collectionPath
        {int[] a = {1042,1043}; op[1041] = getOpcodeCat(a);}
        op[1042] = getOpcodeRnm(169, 1086); // boundPrimitiveFuncCall
        op[1043] = getOpcodeRep((char)0, (char)1, 1044);
        op[1044] = getOpcodeRnm(151, 993); // singlePath
        {int[] a = {1046,1048,1049}; op[1045] = getOpcodeCat(a);}
        op[1046] = getOpcodeRep((char)0, (char)1, 1047);
        op[1047] = getOpcodeRnm(19, 154); // operationQualifier
        op[1048] = getOpcodeRnm(134, 870); // action
        op[1049] = getOpcodeRep((char)0, (char)1, 1050);
        {char[] a = {40,41}; op[1050] = getOpcodeTls(a);}
        op[1051] = getOpcodeRnm(157, 1045); // actionCall
        {int[] a = {1053,1055,1056}; op[1052] = getOpcodeCat(a);}
        op[1053] = getOpcodeRep((char)0, (char)1, 1054);
        op[1054] = getOpcodeRnm(19, 154); // operationQualifier
        op[1055] = getOpcodeRnm(136, 878); // entityFunction
        op[1056] = getOpcodeRnm(171, 1088); // functionParameters
        {int[] a = {1058,1060,1061}; op[1057] = getOpcodeCat(a);}
        op[1058] = getOpcodeRep((char)0, (char)1, 1059);
        op[1059] = getOpcodeRnm(19, 154); // operationQualifier
        op[1060] = getOpcodeRnm(137, 879); // entityColFunction
        op[1061] = getOpcodeRnm(171, 1088); // functionParameters
        {int[] a = {1063,1065,1066}; op[1062] = getOpcodeCat(a);}
        op[1063] = getOpcodeRep((char)0, (char)1, 1064);
        op[1064] = getOpcodeRnm(19, 154); // operationQualifier
        op[1065] = getOpcodeRnm(138, 880); // complexFunction
        op[1066] = getOpcodeRnm(171, 1088); // functionParameters
        {int[] a = {1068,1070,1071}; op[1067] = getOpcodeCat(a);}
        op[1068] = getOpcodeRep((char)0, (char)1, 1069);
        op[1069] = getOpcodeRnm(19, 154); // operationQualifier
        op[1070] = getOpcodeRnm(139, 881); // complexColFunction
        op[1071] = getOpcodeRnm(171, 1088); // functionParameters
        {int[] a = {1073,1075,1076}; op[1072] = getOpcodeCat(a);}
        op[1073] = getOpcodeRep((char)0, (char)1, 1074);
        op[1074] = getOpcodeRnm(19, 154); // operationQualifier
        op[1075] = getOpcodeRnm(140, 882); // primitiveFunction
        op[1076] = getOpcodeRnm(171, 1088); // functionParameters
        {int[] a = {1078,1080,1081}; op[1077] = getOpcodeCat(a);}
        op[1078] = getOpcodeRep((char)0, (char)1, 1079);
        op[1079] = getOpcodeRnm(19, 154); // operationQualifier
        op[1080] = getOpcodeRnm(141, 883); // primitiveColFunction
        op[1081] = getOpcodeRnm(171, 1088); // functionParameters
        op[1082] = getOpcodeRnm(159, 1052); // entityFunctionCall
        op[1083] = getOpcodeRnm(160, 1057); // entityColFunctionCall
        op[1084] = getOpcodeRnm(161, 1062); // complexFunctionCall
        op[1085] = getOpcodeRnm(162, 1067); // complexColFunctionCall
        op[1086] = getOpcodeRnm(163, 1072); // primitiveFunctionCall
        op[1087] = getOpcodeRnm(164, 1077); // primitiveColFunctionCall
        {int[] a = {1089,1090,1097}; op[1088] = getOpcodeCat(a);}
        {char[] a = {40}; op[1089] = getOpcodeTls(a);}
        op[1090] = getOpcodeRep((char)0, (char)1, 1091);
        {int[] a = {1092,1093}; op[1091] = getOpcodeCat(a);}
        op[1092] = getOpcodeRnm(172, 1098); // functionParameter
        op[1093] = getOpcodeRep((char)0, Character.MAX_VALUE, 1094);
        {int[] a = {1095,1096}; op[1094] = getOpcodeCat(a);}
        {char[] a = {44}; op[1095] = getOpcodeTls(a);}
        op[1096] = getOpcodeRnm(172, 1098); // functionParameter
        {char[] a = {41}; op[1097] = getOpcodeTls(a);}
        {int[] a = {1099,1100,1101}; op[1098] = getOpcodeCat(a);}
        op[1099] = getOpcodeRnm(173, 1104); // functionParameterName
        {char[] a = {61}; op[1100] = getOpcodeTls(a);}
        {int[] a = {1102,1103}; op[1101] = getOpcodeAlt(a);}
        op[1102] = getOpcodeRnm(174, 1105); // primitiveParameterValue
        op[1103] = getOpcodeRnm(175, 1106); // parameterAlias
        op[1104] = getOpcodeRnm(106, 766); // odataIdentifier
        op[1105] = getOpcodeRnm(69, 513); // primitiveLiteral
        {int[] a = {1107,1108}; op[1106] = getOpcodeCat(a);}
        {char[] a = {64}; op[1107] = getOpcodeTls(a);}
        op[1108] = getOpcodeRnm(106, 766); // odataIdentifier
        {int[] a = {1110,1111,1112}; op[1109] = getOpcodeCat(a);}
        op[1110] = getOpcodeRnm(175, 1106); // parameterAlias
        {char[] a = {61}; op[1111] = getOpcodeTls(a);}
        op[1112] = getOpcodeRnm(178, 1117); // parameterValue
        {int[] a = {1114,1115,1116}; op[1113] = getOpcodeCat(a);}
        op[1114] = getOpcodeRnm(173, 1104); // functionParameterName
        {char[] a = {61}; op[1115] = getOpcodeTls(a);}
        op[1116] = getOpcodeRnm(178, 1117); // parameterValue
        {int[] a = {1118,1119,1120,1121}; op[1117] = getOpcodeAlt(a);}
        op[1118] = getOpcodeRnm(69, 513); // primitiveLiteral
        op[1119] = getOpcodeRnm(179, 1122); // complexInUri
        op[1120] = getOpcodeRnm(180, 1139); // complexColInUri
        op[1121] = getOpcodeRnm(181, 1149); // primitiveColInUri
        {int[] a = {1123,1124,1138}; op[1122] = getOpcodeCat(a);}
        op[1123] = getOpcodeRnm(182, 1159); // begin-object
        op[1124] = getOpcodeRep((char)0, (char)1, 1125);
        {int[] a = {1126,1131}; op[1125] = getOpcodeCat(a);}
        {int[] a = {1127,1128,1129,1130}; op[1126] = getOpcodeAlt(a);}
        op[1127] = getOpcodeRnm(189, 1166); // complexTypeMetadataInUri
        op[1128] = getOpcodeRnm(191, 1183); // primitivePropertyInUri
        op[1129] = getOpcodeRnm(199, 1227); // complexPropertyInUri
        op[1130] = getOpcodeRnm(200, 1233); // collectionPropertyInUri
        op[1131] = getOpcodeRep((char)0, Character.MAX_VALUE, 1132);
        {int[] a = {1133,1134}; op[1132] = getOpcodeCat(a);}
        op[1133] = getOpcodeRnm(187, 1164); // value-separator
        {int[] a = {1135,1136,1137}; op[1134] = getOpcodeAlt(a);}
        op[1135] = getOpcodeRnm(191, 1183); // primitivePropertyInUri
        op[1136] = getOpcodeRnm(199, 1227); // complexPropertyInUri
        op[1137] = getOpcodeRnm(200, 1233); // collectionPropertyInUri
        op[1138] = getOpcodeRnm(183, 1160); // end-object
        {int[] a = {1140,1141,1148}; op[1139] = getOpcodeCat(a);}
        op[1140] = getOpcodeRnm(184, 1161); // begin-array
        op[1141] = getOpcodeRep((char)0, (char)1, 1142);
        {int[] a = {1143,1144}; op[1142] = getOpcodeCat(a);}
        op[1143] = getOpcodeRnm(179, 1122); // complexInUri
        op[1144] = getOpcodeRep((char)0, Character.MAX_VALUE, 1145);
        {int[] a = {1146,1147}; op[1145] = getOpcodeCat(a);}
        op[1146] = getOpcodeRnm(187, 1164); // value-separator
        op[1147] = getOpcodeRnm(179, 1122); // complexInUri
        op[1148] = getOpcodeRnm(185, 1162); // end-array
        {int[] a = {1150,1151,1158}; op[1149] = getOpcodeCat(a);}
        op[1150] = getOpcodeRnm(184, 1161); // begin-array
        op[1151] = getOpcodeRep((char)0, (char)1, 1152);
        {int[] a = {1153,1154}; op[1152] = getOpcodeCat(a);}
        op[1153] = getOpcodeRnm(192, 1189); // primitiveLiteralInJSON
        op[1154] = getOpcodeRep((char)0, Character.MAX_VALUE, 1155);
        {int[] a = {1156,1157}; op[1155] = getOpcodeCat(a);}
        op[1156] = getOpcodeRnm(187, 1164); // value-separator
        op[1157] = getOpcodeRnm(192, 1189); // primitiveLiteralInJSON
        op[1158] = getOpcodeRnm(185, 1162); // end-array
        {char[] a = {123}; op[1159] = getOpcodeTls(a);}
        {char[] a = {125}; op[1160] = getOpcodeTls(a);}
        {char[] a = {91}; op[1161] = getOpcodeTls(a);}
        {char[] a = {93}; op[1162] = getOpcodeTls(a);}
        op[1163] = getOpcodeRnm(31, 240); // DQUOTE
        op[1164] = getOpcodeRnm(53, 440); // COMMA
        {char[] a = {58}; op[1165] = getOpcodeTls(a);}
        {int[] a = {1167,1168,1169,1170,1171,1172,1174}; op[1166] = getOpcodeCat(a);}
        op[1167] = getOpcodeRnm(186, 1163); // quotation-mark
        {char[] a = {95,95,109,101,116,97,100,97,116,97}; op[1168] = getOpcodeTls(a);}
        op[1169] = getOpcodeRnm(186, 1163); // quotation-mark
        op[1170] = getOpcodeRnm(188, 1165); // name-separator
        op[1171] = getOpcodeRnm(182, 1159); // begin-object
        op[1172] = getOpcodeRep((char)0, (char)1, 1173);
        op[1173] = getOpcodeRnm(190, 1175); // typeNVPInUri
        op[1174] = getOpcodeRnm(183, 1160); // end-object
        {int[] a = {1176,1177,1178,1179,1180,1181,1182}; op[1175] = getOpcodeCat(a);}
        op[1176] = getOpcodeRnm(186, 1163); // quotation-mark
        {char[] a = {116,121,112,101}; op[1177] = getOpcodeTls(a);}
        op[1178] = getOpcodeRnm(186, 1163); // quotation-mark
        op[1179] = getOpcodeRnm(188, 1165); // name-separator
        op[1180] = getOpcodeRnm(186, 1163); // quotation-mark
        op[1181] = getOpcodeRnm(115, 788); // qualifiedTypeName
        op[1182] = getOpcodeRnm(186, 1163); // quotation-mark
        {int[] a = {1184,1185,1186,1187,1188}; op[1183] = getOpcodeCat(a);}
        op[1184] = getOpcodeRnm(186, 1163); // quotation-mark
        op[1185] = getOpcodeRnm(123, 855); // primitiveProperty
        op[1186] = getOpcodeRnm(186, 1163); // quotation-mark
        op[1187] = getOpcodeRnm(188, 1165); // name-separator
        op[1188] = getOpcodeRnm(192, 1189); // primitiveLiteralInJSON
        {int[] a = {1190,1191,1192,1193,1194}; op[1189] = getOpcodeAlt(a);}
        op[1190] = getOpcodeRnm(193, 1195); // stringInJSON
        op[1191] = getOpcodeRnm(195, 1201); // numberInJSON
        {char[] a = {116,114,117,101}; op[1192] = getOpcodeTbs(a);}
        {char[] a = {102,97,108,115,101}; op[1193] = getOpcodeTbs(a);}
        {char[] a = {110,117,108,108}; op[1194] = getOpcodeTbs(a);}
        {int[] a = {1196,1197,1199}; op[1195] = getOpcodeCat(a);}
        op[1196] = getOpcodeRnm(186, 1163); // quotation-mark
        op[1197] = getOpcodeRep((char)0, Character.MAX_VALUE, 1198);
        op[1198] = getOpcodeRnm(194, 1200); // charInJSON
        op[1199] = getOpcodeRnm(186, 1163); // quotation-mark
        op[1200] = getOpcodeRnm(47, 408); // pchar
        {int[] a = {1202,1204,1205,1207}; op[1201] = getOpcodeCat(a);}
        op[1202] = getOpcodeRep((char)0, (char)1, 1203);
        {char[] a = {45}; op[1203] = getOpcodeTls(a);}
        op[1204] = getOpcodeRnm(196, 1209); // int
        op[1205] = getOpcodeRep((char)0, (char)1, 1206);
        op[1206] = getOpcodeRnm(197, 1215); // frac
        op[1207] = getOpcodeRep((char)0, (char)1, 1208);
        op[1208] = getOpcodeRnm(198, 1219); // exp
        {int[] a = {1210,1211}; op[1209] = getOpcodeAlt(a);}
        {char[] a = {48}; op[1210] = getOpcodeTls(a);}
        {int[] a = {1212,1213}; op[1211] = getOpcodeCat(a);}
        op[1212] = getOpcodeRnm(60, 454); // oneToNine
        op[1213] = getOpcodeRep((char)0, Character.MAX_VALUE, 1214);
        op[1214] = getOpcodeRnm(29, 231); // DIGIT
        {int[] a = {1216,1217}; op[1215] = getOpcodeCat(a);}
        {char[] a = {46}; op[1216] = getOpcodeTls(a);}
        op[1217] = getOpcodeRep((char)1, Character.MAX_VALUE, 1218);
        op[1218] = getOpcodeRnm(29, 231); // DIGIT
        {int[] a = {1220,1221,1225}; op[1219] = getOpcodeCat(a);}
        {char[] a = {101}; op[1220] = getOpcodeTls(a);}
        op[1221] = getOpcodeRep((char)0, (char)1, 1222);
        {int[] a = {1223,1224}; op[1222] = getOpcodeAlt(a);}
        {char[] a = {45}; op[1223] = getOpcodeTls(a);}
        {char[] a = {43}; op[1224] = getOpcodeTls(a);}
        op[1225] = getOpcodeRep((char)1, Character.MAX_VALUE, 1226);
        op[1226] = getOpcodeRnm(29, 231); // DIGIT
        {int[] a = {1228,1229,1230,1231,1232}; op[1227] = getOpcodeCat(a);}
        op[1228] = getOpcodeRnm(186, 1163); // quotation-mark
        op[1229] = getOpcodeRnm(127, 861); // complexProperty
        op[1230] = getOpcodeRnm(186, 1163); // quotation-mark
        op[1231] = getOpcodeRnm(188, 1165); // name-separator
        op[1232] = getOpcodeRnm(179, 1122); // complexInUri
        {int[] a = {1234,1240}; op[1233] = getOpcodeAlt(a);}
        {int[] a = {1235,1236,1237,1238,1239}; op[1234] = getOpcodeCat(a);}
        op[1235] = getOpcodeRnm(186, 1163); // quotation-mark
        op[1236] = getOpcodeRnm(126, 860); // primitiveColProperty
        op[1237] = getOpcodeRnm(186, 1163); // quotation-mark
        op[1238] = getOpcodeRnm(188, 1165); // name-separator
        op[1239] = getOpcodeRnm(181, 1149); // primitiveColInUri
        {int[] a = {1241,1242,1243,1244,1245}; op[1240] = getOpcodeCat(a);}
        op[1241] = getOpcodeRnm(186, 1163); // quotation-mark
        op[1242] = getOpcodeRnm(128, 862); // complexColProperty
        op[1243] = getOpcodeRnm(186, 1163); // quotation-mark
        op[1244] = getOpcodeRnm(188, 1165); // name-separator
        op[1245] = getOpcodeRnm(180, 1139); // complexColInUri
        {int[] a = {1247,1248,1249,1250,1251,1252,1253,1254,1255,1256,1257,1258,1259,1260}; op[1246] = getOpcodeAlt(a);}
        op[1247] = getOpcodeRnm(69, 513); // primitiveLiteral
        op[1248] = getOpcodeRnm(206, 1316); // firstMemberExpr
        op[1249] = getOpcodeRnm(202, 1261); // boolCommonExpr
        op[1250] = getOpcodeRnm(219, 1461); // methodCallExpr
        op[1251] = getOpcodeRnm(252, 1817); // parenExpr
        op[1252] = getOpcodeRnm(262, 1897); // addExpr
        op[1253] = getOpcodeRnm(263, 1905); // subExpr
        op[1254] = getOpcodeRnm(264, 1913); // mulExpr
        op[1255] = getOpcodeRnm(265, 1921); // divExpr
        op[1256] = getOpcodeRnm(266, 1929); // modExpr
        op[1257] = getOpcodeRnm(267, 1937); // negateExpr
        op[1258] = getOpcodeRnm(205, 1293); // memberExpr
        op[1259] = getOpcodeRnm(270, 1962); // castExpr
        op[1260] = getOpcodeRnm(207, 1339); // functionCall
        {int[] a = {1262,1263,1264,1265,1266,1267,1268,1269,1270,1271,1272,1273,1274,1275,1276,1277,1278}; op[1261] = getOpcodeAlt(a);}
        op[1262] = getOpcodeRnm(72, 560); // boolean
        op[1263] = getOpcodeRnm(203, 1279); // firstBoolPrimitiveMemExpr
        op[1264] = getOpcodeRnm(204, 1285); // boolPrimitiveMemberExpr
        op[1265] = getOpcodeRnm(256, 1849); // eqExpr
        op[1266] = getOpcodeRnm(257, 1857); // neExpr
        op[1267] = getOpcodeRnm(258, 1865); // ltExpr
        op[1268] = getOpcodeRnm(259, 1873); // leExpr
        op[1269] = getOpcodeRnm(260, 1881); // gtExpr
        op[1270] = getOpcodeRnm(261, 1889); // geExpr
        op[1271] = getOpcodeRnm(268, 1942); // notExpr
        op[1272] = getOpcodeRnm(254, 1833); // andExpr
        op[1273] = getOpcodeRnm(255, 1841); // orExpr
        op[1274] = getOpcodeRnm(269, 1947); // isofExpr
        op[1275] = getOpcodeRnm(271, 1977); // boolCastExpr
        op[1276] = getOpcodeRnm(220, 1488); // boolMethodCallExpr
        op[1277] = getOpcodeRnm(253, 1825); // boolParenExpr
        op[1278] = getOpcodeRnm(208, 1346); // boolFunctionCall
        {int[] a = {1280,1284}; op[1279] = getOpcodeCat(a);}
        op[1280] = getOpcodeRep((char)0, (char)1, 1281);
        {int[] a = {1282,1283}; op[1281] = getOpcodeCat(a);}
        op[1282] = getOpcodeRnm(116, 801); // qualifiedEntityTypeName
        {char[] a = {47}; op[1283] = getOpcodeTls(a);}
        op[1284] = getOpcodeRnm(123, 855); // primitiveProperty
        {int[] a = {1286,1287,1288,1292}; op[1285] = getOpcodeCat(a);}
        op[1286] = getOpcodeRnm(201, 1246); // commonExpr
        {char[] a = {47}; op[1287] = getOpcodeTls(a);}
        op[1288] = getOpcodeRep((char)0, (char)1, 1289);
        {int[] a = {1290,1291}; op[1289] = getOpcodeCat(a);}
        op[1290] = getOpcodeRnm(116, 801); // qualifiedEntityTypeName
        {char[] a = {47}; op[1291] = getOpcodeTls(a);}
        op[1292] = getOpcodeRnm(213, 1355); // primitivePropertyPath
        {int[] a = {1294,1295,1296,1300,1310}; op[1293] = getOpcodeAlt(a);}
        op[1294] = getOpcodeRnm(213, 1355); // primitivePropertyPath
        op[1295] = getOpcodeRnm(215, 1377); // complexPropertyPath
        {int[] a = {1297,1298}; op[1296] = getOpcodeCat(a);}
        op[1297] = getOpcodeRnm(131, 867); // entityNavigationProperty
        op[1298] = getOpcodeRep((char)0, (char)1, 1299);
        op[1299] = getOpcodeRnm(217, 1400); // singleNavigationExpr
        {int[] a = {1301,1302,1303,1307,1308}; op[1300] = getOpcodeCat(a);}
        op[1301] = getOpcodeRnm(201, 1246); // commonExpr
        {char[] a = {47}; op[1302] = getOpcodeTls(a);}
        op[1303] = getOpcodeRep((char)0, (char)1, 1304);
        {int[] a = {1305,1306}; op[1304] = getOpcodeCat(a);}
        op[1305] = getOpcodeRnm(116, 801); // qualifiedEntityTypeName
        {char[] a = {47}; op[1306] = getOpcodeTls(a);}
        op[1307] = getOpcodeRnm(132, 868); // entityColNavigationProperty
        op[1308] = getOpcodeRep((char)0, (char)1, 1309);
        op[1309] = getOpcodeRnm(216, 1390); // collectionNavigationExpr
        {int[] a = {1311,1312}; op[1310] = getOpcodeCat(a);}
        op[1311] = getOpcodeRnm(214, 1366); // collectionPropertyPath
        op[1312] = getOpcodeRep((char)0, (char)1, 1313);
        {int[] a = {1314,1315}; op[1313] = getOpcodeAlt(a);}
        op[1314] = getOpcodeRnm(224, 1511); // anyExpr
        op[1315] = getOpcodeRnm(225, 1519); // allExpr
        {int[] a = {1317,1327,1331,1332,1333}; op[1316] = getOpcodeAlt(a);}
        {int[] a = {1318,1322,1324,1325}; op[1317] = getOpcodeCat(a);}
        op[1318] = getOpcodeRep((char)0, (char)1, 1319);
        {int[] a = {1320,1321}; op[1319] = getOpcodeCat(a);}
        op[1320] = getOpcodeRnm(116, 801); // qualifiedEntityTypeName
        {char[] a = {47}; op[1321] = getOpcodeTls(a);}
        op[1322] = getOpcodeRep((char)0, (char)1, 1323);
        op[1323] = getOpcodeRnm(209, 1347); // lambdaPredicatePrefixExpr
        op[1324] = getOpcodeRnm(132, 868); // entityColNavigationProperty
        op[1325] = getOpcodeRep((char)0, (char)1, 1326);
        op[1326] = getOpcodeRnm(216, 1390); // collectionNavigationExpr
        {int[] a = {1328,1329}; op[1327] = getOpcodeCat(a);}
        op[1328] = getOpcodeRnm(131, 867); // entityNavigationProperty
        op[1329] = getOpcodeRep((char)0, (char)1, 1330);
        op[1330] = getOpcodeRnm(217, 1400); // singleNavigationExpr
        op[1331] = getOpcodeRnm(213, 1355); // primitivePropertyPath
        op[1332] = getOpcodeRnm(215, 1377); // complexPropertyPath
        {int[] a = {1334,1335}; op[1333] = getOpcodeCat(a);}
        op[1334] = getOpcodeRnm(214, 1366); // collectionPropertyPath
        op[1335] = getOpcodeRep((char)0, (char)1, 1336);
        {int[] a = {1337,1338}; op[1336] = getOpcodeAlt(a);}
        op[1337] = getOpcodeRnm(224, 1511); // anyExpr
        op[1338] = getOpcodeRnm(225, 1519); // allExpr
        {int[] a = {1340,1341,1342,1343,1344,1345}; op[1339] = getOpcodeAlt(a);}
        op[1340] = getOpcodeRnm(159, 1052); // entityFunctionCall
        op[1341] = getOpcodeRnm(160, 1057); // entityColFunctionCall
        op[1342] = getOpcodeRnm(161, 1062); // complexFunctionCall
        op[1343] = getOpcodeRnm(162, 1067); // complexColFunctionCall
        op[1344] = getOpcodeRnm(163, 1072); // primitiveFunctionCall
        op[1345] = getOpcodeRnm(164, 1077); // primitiveColFunctionCall
        op[1346] = getOpcodeRnm(163, 1072); // primitiveFunctionCall
        {int[] a = {1348,1349}; op[1347] = getOpcodeCat(a);}
        op[1348] = getOpcodeRnm(210, 1350); // inscopeVariableExpr
        {char[] a = {47}; op[1349] = getOpcodeTls(a);}
        {int[] a = {1351,1352}; op[1350] = getOpcodeAlt(a);}
        op[1351] = getOpcodeRnm(211, 1353); // implicitVariableExpr
        op[1352] = getOpcodeRnm(212, 1354); // lambdaVariableExpr
        {char[] a = {36,105,116}; op[1353] = getOpcodeTls(a);}
        op[1354] = getOpcodeRnm(106, 766); // odataIdentifier
        {int[] a = {1356,1360,1361,1364}; op[1355] = getOpcodeCat(a);}
        op[1356] = getOpcodeRep((char)0, (char)1, 1357);
        {int[] a = {1358,1359}; op[1357] = getOpcodeCat(a);}
        {char[] a = {47}; op[1358] = getOpcodeTls(a);}
        op[1359] = getOpcodeRnm(116, 801); // qualifiedEntityTypeName
        {char[] a = {47}; op[1360] = getOpcodeTls(a);}
        {int[] a = {1362,1363}; op[1361] = getOpcodeAlt(a);}
        op[1362] = getOpcodeRnm(124, 858); // primitiveKeyProperty
        op[1363] = getOpcodeRnm(125, 859); // primitiveNonKeyProperty
        op[1364] = getOpcodeRep((char)0, (char)1, 1365);
        op[1365] = getOpcodeRnm(154, 1015); // value
        {int[] a = {1367,1371,1372,1375}; op[1366] = getOpcodeCat(a);}
        op[1367] = getOpcodeRep((char)0, (char)1, 1368);
        {int[] a = {1369,1370}; op[1368] = getOpcodeCat(a);}
        {char[] a = {47}; op[1369] = getOpcodeTls(a);}
        op[1370] = getOpcodeRnm(116, 801); // qualifiedEntityTypeName
        {char[] a = {47}; op[1371] = getOpcodeTls(a);}
        {int[] a = {1373,1374}; op[1372] = getOpcodeAlt(a);}
        op[1373] = getOpcodeRnm(126, 860); // primitiveColProperty
        op[1374] = getOpcodeRnm(128, 862); // complexColProperty
        op[1375] = getOpcodeRep((char)0, (char)1, 1376);
        op[1376] = getOpcodeRnm(156, 1017); // boundOperation
        {int[] a = {1378,1382,1383,1384}; op[1377] = getOpcodeCat(a);}
        op[1378] = getOpcodeRep((char)0, (char)1, 1379);
        {int[] a = {1380,1381}; op[1379] = getOpcodeCat(a);}
        {char[] a = {47}; op[1380] = getOpcodeTls(a);}
        op[1381] = getOpcodeRnm(116, 801); // qualifiedEntityTypeName
        {char[] a = {47}; op[1382] = getOpcodeTls(a);}
        op[1383] = getOpcodeRnm(127, 861); // complexProperty
        op[1384] = getOpcodeRep((char)0, (char)1, 1385);
        {int[] a = {1386,1387,1388,1389}; op[1385] = getOpcodeAlt(a);}
        op[1386] = getOpcodeRnm(213, 1355); // primitivePropertyPath
        op[1387] = getOpcodeRnm(215, 1377); // complexPropertyPath
        op[1388] = getOpcodeRnm(214, 1366); // collectionPropertyPath
        op[1389] = getOpcodeRnm(156, 1017); // boundOperation
        {int[] a = {1391,1392,1396}; op[1390] = getOpcodeCat(a);}
        {char[] a = {47}; op[1391] = getOpcodeTls(a);}
        op[1392] = getOpcodeRep((char)0, (char)1, 1393);
        {int[] a = {1394,1395}; op[1393] = getOpcodeCat(a);}
        op[1394] = getOpcodeRnm(116, 801); // qualifiedEntityTypeName
        {char[] a = {47}; op[1395] = getOpcodeTls(a);}
        {int[] a = {1397,1398,1399}; op[1396] = getOpcodeAlt(a);}
        op[1397] = getOpcodeRnm(218, 1428); // boundFunctionExpr
        op[1398] = getOpcodeRnm(224, 1511); // anyExpr
        op[1399] = getOpcodeRnm(225, 1519); // allExpr
        {int[] a = {1401,1405}; op[1400] = getOpcodeCat(a);}
        op[1401] = getOpcodeRep((char)0, (char)1, 1402);
        {int[] a = {1403,1404}; op[1402] = getOpcodeCat(a);}
        {char[] a = {47}; op[1403] = getOpcodeTls(a);}
        op[1404] = getOpcodeRnm(116, 801); // qualifiedEntityTypeName
        {int[] a = {1406,1411,1416,1417,1418,1424,1427}; op[1405] = getOpcodeAlt(a);}
        {int[] a = {1407,1408,1409}; op[1406] = getOpcodeCat(a);}
        {char[] a = {47}; op[1407] = getOpcodeTls(a);}
        op[1408] = getOpcodeRnm(132, 868); // entityColNavigationProperty
        op[1409] = getOpcodeRep((char)0, (char)1, 1410);
        op[1410] = getOpcodeRnm(216, 1390); // collectionNavigationExpr
        {int[] a = {1412,1413,1414}; op[1411] = getOpcodeCat(a);}
        {char[] a = {47}; op[1412] = getOpcodeTls(a);}
        op[1413] = getOpcodeRnm(131, 867); // entityNavigationProperty
        op[1414] = getOpcodeRep((char)0, (char)1, 1415);
        op[1415] = getOpcodeRnm(217, 1400); // singleNavigationExpr
        op[1416] = getOpcodeRnm(213, 1355); // primitivePropertyPath
        op[1417] = getOpcodeRnm(215, 1377); // complexPropertyPath
        {int[] a = {1419,1420}; op[1418] = getOpcodeCat(a);}
        op[1419] = getOpcodeRnm(214, 1366); // collectionPropertyPath
        op[1420] = getOpcodeRep((char)0, (char)1, 1421);
        {int[] a = {1422,1423}; op[1421] = getOpcodeAlt(a);}
        op[1422] = getOpcodeRnm(224, 1511); // anyExpr
        op[1423] = getOpcodeRnm(225, 1519); // allExpr
        {int[] a = {1425,1426}; op[1424] = getOpcodeCat(a);}
        {char[] a = {47}; op[1425] = getOpcodeTls(a);}
        op[1426] = getOpcodeRnm(129, 863); // streamProperty
        op[1427] = getOpcodeRnm(218, 1428); // boundFunctionExpr
        {int[] a = {1429,1433,1434}; op[1428] = getOpcodeCat(a);}
        op[1429] = getOpcodeRep((char)0, (char)1, 1430);
        {int[] a = {1431,1432}; op[1430] = getOpcodeCat(a);}
        {char[] a = {47}; op[1431] = getOpcodeTls(a);}
        op[1432] = getOpcodeRnm(116, 801); // qualifiedEntityTypeName
        {char[] a = {47}; op[1433] = getOpcodeTls(a);}
        {int[] a = {1435,1439,1443,1447,1451,1457}; op[1434] = getOpcodeAlt(a);}
        {int[] a = {1436,1437}; op[1435] = getOpcodeCat(a);}
        op[1436] = getOpcodeRnm(166, 1083); // boundEntityColFuncCall
        op[1437] = getOpcodeRep((char)0, (char)1, 1438);
        op[1438] = getOpcodeRnm(217, 1400); // singleNavigationExpr
        {int[] a = {1440,1441}; op[1439] = getOpcodeCat(a);}
        op[1440] = getOpcodeRnm(165, 1082); // boundEntityFuncCall
        op[1441] = getOpcodeRep((char)0, (char)1, 1442);
        op[1442] = getOpcodeRnm(216, 1390); // collectionNavigationExpr
        {int[] a = {1444,1445}; op[1443] = getOpcodeCat(a);}
        op[1444] = getOpcodeRnm(169, 1086); // boundPrimitiveFuncCall
        op[1445] = getOpcodeRep((char)0, (char)1, 1446);
        op[1446] = getOpcodeRnm(218, 1428); // boundFunctionExpr
        {int[] a = {1448,1449}; op[1447] = getOpcodeCat(a);}
        op[1448] = getOpcodeRnm(170, 1087); // boundPrimitiveColFuncCall
        op[1449] = getOpcodeRep((char)0, (char)1, 1450);
        op[1450] = getOpcodeRnm(218, 1428); // boundFunctionExpr
        {int[] a = {1452,1453}; op[1451] = getOpcodeCat(a);}
        op[1452] = getOpcodeRnm(167, 1084); // boundComplexFuncCall
        op[1453] = getOpcodeRep((char)0, (char)1, 1454);
        {int[] a = {1455,1456}; op[1454] = getOpcodeAlt(a);}
        op[1455] = getOpcodeRnm(215, 1377); // complexPropertyPath
        op[1456] = getOpcodeRnm(218, 1428); // boundFunctionExpr
        {int[] a = {1458,1459}; op[1457] = getOpcodeCat(a);}
        op[1458] = getOpcodeRnm(168, 1085); // boundComplexColFuncCall
        op[1459] = getOpcodeRep((char)0, (char)1, 1460);
        op[1460] = getOpcodeRnm(218, 1428); // boundFunctionExpr
        {int[] a = {1462,1463,1464,1465,1466,1467,1468,1469,1470,1471,1472,1473,1474,1475,1476,1477,1478,1479,1480,1481,1482,1483,1484,1485,1486,1487}; op[1461] = getOpcodeAlt(a);}
        op[1462] = getOpcodeRnm(220, 1488); // boolMethodCallExpr
        op[1463] = getOpcodeRnm(231, 1576); // indexOfMethodCallExpr
        op[1464] = getOpcodeRnm(233, 1606); // toLowerMethodCallExpr
        op[1465] = getOpcodeRnm(234, 1617); // toUpperMethodCallExpr
        op[1466] = getOpcodeRnm(235, 1628); // trimMethodCallExpr
        op[1467] = getOpcodeRnm(232, 1589); // substringMethodCallExpr
        op[1468] = getOpcodeRnm(236, 1639); // concatMethodCallExpr
        op[1469] = getOpcodeRnm(230, 1565); // lengthMethodCallExpr
        op[1470] = getOpcodeRnm(237, 1652); // yearMethodCallExpr
        op[1471] = getOpcodeRnm(238, 1663); // yearsMethodCallExpr
        op[1472] = getOpcodeRnm(239, 1674); // monthMethodCallExpr
        op[1473] = getOpcodeRnm(240, 1685); // monthsMethodCallExpr
        op[1474] = getOpcodeRnm(241, 1696); // dayMethodCallExpr
        op[1475] = getOpcodeRnm(242, 1707); // daysMethodCallExpr
        op[1476] = getOpcodeRnm(243, 1718); // hourMethodCallExpr
        op[1477] = getOpcodeRnm(244, 1729); // hoursMethodCallExpr
        op[1478] = getOpcodeRnm(245, 1740); // minuteMethodCallExpr
        op[1479] = getOpcodeRnm(246, 1751); // minutesMethodCallExpr
        op[1480] = getOpcodeRnm(247, 1762); // secondMethodCallExpr
        op[1481] = getOpcodeRnm(248, 1773); // secondsMethodCallExpr
        op[1482] = getOpcodeRnm(249, 1784); // roundMethodCallExpr
        op[1483] = getOpcodeRnm(250, 1795); // floorMethodCallExpr
        op[1484] = getOpcodeRnm(251, 1806); // ceilingMethodCallExpr
        op[1485] = getOpcodeRnm(273, 2003); // distanceMethodCallExpr
        op[1486] = getOpcodeRnm(274, 2016); // geoLengthMethodCallExpr
        op[1487] = getOpcodeRnm(272, 1992); // getTotalOffsetMinutesExpr
        {int[] a = {1489,1490,1491,1492,1493,1494}; op[1488] = getOpcodeAlt(a);}
        op[1489] = getOpcodeRnm(229, 1552); // endsWithMethodCallExpr
        op[1490] = getOpcodeRnm(228, 1539); // startsWithMethodCallExpr
        op[1491] = getOpcodeRnm(227, 1526); // substringOfMethodCallExpr
        op[1492] = getOpcodeRnm(275, 2027); // intersectsMethodCallExpr
        op[1493] = getOpcodeRnm(222, 1499); // anyMethodCallExpr
        op[1494] = getOpcodeRnm(221, 1495); // allMethodCallExpr
        {int[] a = {1496,1497,1498}; op[1495] = getOpcodeCat(a);}
        op[1496] = getOpcodeRnm(223, 1503); // pathExpression-collection
        {char[] a = {47}; op[1497] = getOpcodeTls(a);}
        op[1498] = getOpcodeRnm(225, 1519); // allExpr
        {int[] a = {1500,1501,1502}; op[1499] = getOpcodeCat(a);}
        op[1500] = getOpcodeRnm(223, 1503); // pathExpression-collection
        {char[] a = {47}; op[1501] = getOpcodeTls(a);}
        op[1502] = getOpcodeRnm(224, 1511); // anyExpr
        {int[] a = {1504,1508}; op[1503] = getOpcodeCat(a);}
        op[1504] = getOpcodeRep((char)0, Character.MAX_VALUE, 1505);
        {int[] a = {1506,1507}; op[1505] = getOpcodeCat(a);}
        op[1506] = getOpcodeRnm(131, 867); // entityNavigationProperty
        {char[] a = {47}; op[1507] = getOpcodeTls(a);}
        {int[] a = {1509,1510}; op[1508] = getOpcodeAlt(a);}
        op[1509] = getOpcodeRnm(132, 868); // entityColNavigationProperty
        op[1510] = getOpcodeRnm(128, 862); // complexColProperty
        {int[] a = {1512,1513,1518}; op[1511] = getOpcodeCat(a);}
        {char[] a = {97,110,121,40}; op[1512] = getOpcodeTls(a);}
        op[1513] = getOpcodeRep((char)0, (char)1, 1514);
        {int[] a = {1515,1516,1517}; op[1514] = getOpcodeCat(a);}
        op[1515] = getOpcodeRnm(212, 1354); // lambdaVariableExpr
        {char[] a = {58}; op[1516] = getOpcodeTls(a);}
        op[1517] = getOpcodeRnm(226, 1525); // lambdaPredicateExpr
        {char[] a = {41}; op[1518] = getOpcodeTls(a);}
        {int[] a = {1520,1521,1522,1523,1524}; op[1519] = getOpcodeCat(a);}
        {char[] a = {97,108,108,40}; op[1520] = getOpcodeTls(a);}
        op[1521] = getOpcodeRnm(212, 1354); // lambdaVariableExpr
        {char[] a = {58}; op[1522] = getOpcodeTls(a);}
        op[1523] = getOpcodeRnm(226, 1525); // lambdaPredicateExpr
        {char[] a = {41}; op[1524] = getOpcodeTls(a);}
        op[1525] = getOpcodeRnm(202, 1261); // boolCommonExpr
        {int[] a = {1527,1528,1530,1531,1533,1534,1535,1536,1538}; op[1526] = getOpcodeCat(a);}
        {char[] a = {115,117,98,115,116,114,105,110,103,111,102}; op[1527] = getOpcodeTls(a);}
        op[1528] = getOpcodeRep((char)0, Character.MAX_VALUE, 1529);
        op[1529] = getOpcodeRnm(34, 243); // WSP
        {char[] a = {40}; op[1530] = getOpcodeTls(a);}
        op[1531] = getOpcodeRep((char)0, Character.MAX_VALUE, 1532);
        op[1532] = getOpcodeRnm(34, 243); // WSP
        op[1533] = getOpcodeRnm(201, 1246); // commonExpr
        {char[] a = {44}; op[1534] = getOpcodeTls(a);}
        op[1535] = getOpcodeRnm(201, 1246); // commonExpr
        op[1536] = getOpcodeRep((char)0, Character.MAX_VALUE, 1537);
        op[1537] = getOpcodeRnm(34, 243); // WSP
        {char[] a = {41}; op[1538] = getOpcodeTls(a);}
        {int[] a = {1540,1541,1543,1544,1546,1547,1548,1549,1551}; op[1539] = getOpcodeCat(a);}
        {char[] a = {115,116,97,114,116,115,119,105,116,104}; op[1540] = getOpcodeTls(a);}
        op[1541] = getOpcodeRep((char)0, Character.MAX_VALUE, 1542);
        op[1542] = getOpcodeRnm(34, 243); // WSP
        {char[] a = {40}; op[1543] = getOpcodeTls(a);}
        op[1544] = getOpcodeRep((char)0, Character.MAX_VALUE, 1545);
        op[1545] = getOpcodeRnm(34, 243); // WSP
        op[1546] = getOpcodeRnm(201, 1246); // commonExpr
        {char[] a = {44}; op[1547] = getOpcodeTls(a);}
        op[1548] = getOpcodeRnm(201, 1246); // commonExpr
        op[1549] = getOpcodeRep((char)0, Character.MAX_VALUE, 1550);
        op[1550] = getOpcodeRnm(34, 243); // WSP
        {char[] a = {41}; op[1551] = getOpcodeTls(a);}
        {int[] a = {1553,1554,1556,1557,1559,1560,1561,1562,1564}; op[1552] = getOpcodeCat(a);}
        {char[] a = {101,110,100,115,119,105,116,104}; op[1553] = getOpcodeTls(a);}
        op[1554] = getOpcodeRep((char)0, Character.MAX_VALUE, 1555);
        op[1555] = getOpcodeRnm(34, 243); // WSP
        {char[] a = {40}; op[1556] = getOpcodeTls(a);}
        op[1557] = getOpcodeRep((char)0, Character.MAX_VALUE, 1558);
        op[1558] = getOpcodeRnm(34, 243); // WSP
        op[1559] = getOpcodeRnm(201, 1246); // commonExpr
        {char[] a = {44}; op[1560] = getOpcodeTls(a);}
        op[1561] = getOpcodeRnm(201, 1246); // commonExpr
        op[1562] = getOpcodeRep((char)0, Character.MAX_VALUE, 1563);
        op[1563] = getOpcodeRnm(34, 243); // WSP
        {char[] a = {41}; op[1564] = getOpcodeTls(a);}
        {int[] a = {1566,1567,1569,1570,1572,1573,1575}; op[1565] = getOpcodeCat(a);}
        {char[] a = {108,101,110,103,116,104}; op[1566] = getOpcodeTls(a);}
        op[1567] = getOpcodeRep((char)0, Character.MAX_VALUE, 1568);
        op[1568] = getOpcodeRnm(34, 243); // WSP
        {char[] a = {40}; op[1569] = getOpcodeTls(a);}
        op[1570] = getOpcodeRep((char)0, Character.MAX_VALUE, 1571);
        op[1571] = getOpcodeRnm(34, 243); // WSP
        op[1572] = getOpcodeRnm(201, 1246); // commonExpr
        op[1573] = getOpcodeRep((char)0, Character.MAX_VALUE, 1574);
        op[1574] = getOpcodeRnm(34, 243); // WSP
        {char[] a = {41}; op[1575] = getOpcodeTls(a);}
        {int[] a = {1577,1578,1580,1581,1583,1584,1585,1586,1588}; op[1576] = getOpcodeCat(a);}
        {char[] a = {105,110,100,101,120,111,102}; op[1577] = getOpcodeTls(a);}
        op[1578] = getOpcodeRep((char)0, Character.MAX_VALUE, 1579);
        op[1579] = getOpcodeRnm(34, 243); // WSP
        {char[] a = {40}; op[1580] = getOpcodeTls(a);}
        op[1581] = getOpcodeRep((char)0, Character.MAX_VALUE, 1582);
        op[1582] = getOpcodeRnm(34, 243); // WSP
        op[1583] = getOpcodeRnm(201, 1246); // commonExpr
        {char[] a = {44}; op[1584] = getOpcodeTls(a);}
        op[1585] = getOpcodeRnm(201, 1246); // commonExpr
        op[1586] = getOpcodeRep((char)0, Character.MAX_VALUE, 1587);
        op[1587] = getOpcodeRnm(34, 243); // WSP
        {char[] a = {41}; op[1588] = getOpcodeTls(a);}
        {int[] a = {1590,1591,1593,1594,1596,1597,1598,1599,1605}; op[1589] = getOpcodeCat(a);}
        {char[] a = {115,117,98,115,116,114,105,110,103}; op[1590] = getOpcodeTls(a);}
        op[1591] = getOpcodeRep((char)0, Character.MAX_VALUE, 1592);
        op[1592] = getOpcodeRnm(34, 243); // WSP
        {char[] a = {40}; op[1593] = getOpcodeTls(a);}
        op[1594] = getOpcodeRep((char)0, Character.MAX_VALUE, 1595);
        op[1595] = getOpcodeRnm(34, 243); // WSP
        op[1596] = getOpcodeRnm(201, 1246); // commonExpr
        {char[] a = {44}; op[1597] = getOpcodeTls(a);}
        op[1598] = getOpcodeRnm(201, 1246); // commonExpr
        op[1599] = getOpcodeRep((char)0, (char)1, 1600);
        {int[] a = {1601,1602,1603}; op[1600] = getOpcodeCat(a);}
        {char[] a = {44}; op[1601] = getOpcodeTls(a);}
        op[1602] = getOpcodeRnm(201, 1246); // commonExpr
        op[1603] = getOpcodeRep((char)0, Character.MAX_VALUE, 1604);
        op[1604] = getOpcodeRnm(34, 243); // WSP
        {char[] a = {41}; op[1605] = getOpcodeTls(a);}
        {int[] a = {1607,1608,1610,1611,1613,1614,1616}; op[1606] = getOpcodeCat(a);}
        {char[] a = {116,111,108,111,119,101,114}; op[1607] = getOpcodeTls(a);}
        op[1608] = getOpcodeRep((char)0, Character.MAX_VALUE, 1609);
        op[1609] = getOpcodeRnm(34, 243); // WSP
        {char[] a = {40}; op[1610] = getOpcodeTls(a);}
        op[1611] = getOpcodeRep((char)0, Character.MAX_VALUE, 1612);
        op[1612] = getOpcodeRnm(34, 243); // WSP
        op[1613] = getOpcodeRnm(201, 1246); // commonExpr
        op[1614] = getOpcodeRep((char)0, Character.MAX_VALUE, 1615);
        op[1615] = getOpcodeRnm(34, 243); // WSP
        {char[] a = {41}; op[1616] = getOpcodeTls(a);}
        {int[] a = {1618,1619,1621,1622,1624,1625,1627}; op[1617] = getOpcodeCat(a);}
        {char[] a = {116,111,117,112,112,101,114}; op[1618] = getOpcodeTls(a);}
        op[1619] = getOpcodeRep((char)0, Character.MAX_VALUE, 1620);
        op[1620] = getOpcodeRnm(34, 243); // WSP
        {char[] a = {40}; op[1621] = getOpcodeTls(a);}
        op[1622] = getOpcodeRep((char)0, Character.MAX_VALUE, 1623);
        op[1623] = getOpcodeRnm(34, 243); // WSP
        op[1624] = getOpcodeRnm(201, 1246); // commonExpr
        op[1625] = getOpcodeRep((char)0, Character.MAX_VALUE, 1626);
        op[1626] = getOpcodeRnm(34, 243); // WSP
        {char[] a = {41}; op[1627] = getOpcodeTls(a);}
        {int[] a = {1629,1630,1632,1633,1635,1636,1638}; op[1628] = getOpcodeCat(a);}
        {char[] a = {116,114,105,109}; op[1629] = getOpcodeTls(a);}
        op[1630] = getOpcodeRep((char)0, Character.MAX_VALUE, 1631);
        op[1631] = getOpcodeRnm(34, 243); // WSP
        {char[] a = {40}; op[1632] = getOpcodeTls(a);}
        op[1633] = getOpcodeRep((char)0, Character.MAX_VALUE, 1634);
        op[1634] = getOpcodeRnm(34, 243); // WSP
        op[1635] = getOpcodeRnm(201, 1246); // commonExpr
        op[1636] = getOpcodeRep((char)0, Character.MAX_VALUE, 1637);
        op[1637] = getOpcodeRnm(34, 243); // WSP
        {char[] a = {41}; op[1638] = getOpcodeTls(a);}
        {int[] a = {1640,1641,1643,1644,1646,1647,1648,1649,1651}; op[1639] = getOpcodeCat(a);}
        {char[] a = {99,111,110,99,97,116}; op[1640] = getOpcodeTls(a);}
        op[1641] = getOpcodeRep((char)0, Character.MAX_VALUE, 1642);
        op[1642] = getOpcodeRnm(34, 243); // WSP
        {char[] a = {40}; op[1643] = getOpcodeTls(a);}
        op[1644] = getOpcodeRep((char)0, Character.MAX_VALUE, 1645);
        op[1645] = getOpcodeRnm(34, 243); // WSP
        op[1646] = getOpcodeRnm(201, 1246); // commonExpr
        {char[] a = {44}; op[1647] = getOpcodeTls(a);}
        op[1648] = getOpcodeRnm(201, 1246); // commonExpr
        op[1649] = getOpcodeRep((char)0, Character.MAX_VALUE, 1650);
        op[1650] = getOpcodeRnm(34, 243); // WSP
        {char[] a = {41}; op[1651] = getOpcodeTls(a);}
        {int[] a = {1653,1654,1656,1657,1659,1660,1662}; op[1652] = getOpcodeCat(a);}
        {char[] a = {121,101,97,114}; op[1653] = getOpcodeTls(a);}
        op[1654] = getOpcodeRep((char)0, Character.MAX_VALUE, 1655);
        op[1655] = getOpcodeRnm(34, 243); // WSP
        {char[] a = {40}; op[1656] = getOpcodeTls(a);}
        op[1657] = getOpcodeRep((char)0, Character.MAX_VALUE, 1658);
        op[1658] = getOpcodeRnm(34, 243); // WSP
        op[1659] = getOpcodeRnm(201, 1246); // commonExpr
        op[1660] = getOpcodeRep((char)0, Character.MAX_VALUE, 1661);
        op[1661] = getOpcodeRnm(34, 243); // WSP
        {char[] a = {41}; op[1662] = getOpcodeTls(a);}
        {int[] a = {1664,1665,1667,1668,1670,1671,1673}; op[1663] = getOpcodeCat(a);}
        {char[] a = {121,101,97,114,115}; op[1664] = getOpcodeTls(a);}
        op[1665] = getOpcodeRep((char)0, Character.MAX_VALUE, 1666);
        op[1666] = getOpcodeRnm(34, 243); // WSP
        {char[] a = {40}; op[1667] = getOpcodeTls(a);}
        op[1668] = getOpcodeRep((char)0, Character.MAX_VALUE, 1669);
        op[1669] = getOpcodeRnm(34, 243); // WSP
        op[1670] = getOpcodeRnm(201, 1246); // commonExpr
        op[1671] = getOpcodeRep((char)0, Character.MAX_VALUE, 1672);
        op[1672] = getOpcodeRnm(34, 243); // WSP
        {char[] a = {41}; op[1673] = getOpcodeTls(a);}
        {int[] a = {1675,1676,1678,1679,1681,1682,1684}; op[1674] = getOpcodeCat(a);}
        {char[] a = {109,111,110,116,104}; op[1675] = getOpcodeTls(a);}
        op[1676] = getOpcodeRep((char)0, Character.MAX_VALUE, 1677);
        op[1677] = getOpcodeRnm(34, 243); // WSP
        {char[] a = {40}; op[1678] = getOpcodeTls(a);}
        op[1679] = getOpcodeRep((char)0, Character.MAX_VALUE, 1680);
        op[1680] = getOpcodeRnm(34, 243); // WSP
        op[1681] = getOpcodeRnm(201, 1246); // commonExpr
        op[1682] = getOpcodeRep((char)0, Character.MAX_VALUE, 1683);
        op[1683] = getOpcodeRnm(34, 243); // WSP
        {char[] a = {41}; op[1684] = getOpcodeTls(a);}
        {int[] a = {1686,1687,1689,1690,1692,1693,1695}; op[1685] = getOpcodeCat(a);}
        {char[] a = {109,111,110,116,104,115}; op[1686] = getOpcodeTls(a);}
        op[1687] = getOpcodeRep((char)0, Character.MAX_VALUE, 1688);
        op[1688] = getOpcodeRnm(34, 243); // WSP
        {char[] a = {40}; op[1689] = getOpcodeTls(a);}
        op[1690] = getOpcodeRep((char)0, Character.MAX_VALUE, 1691);
        op[1691] = getOpcodeRnm(34, 243); // WSP
        op[1692] = getOpcodeRnm(201, 1246); // commonExpr
        op[1693] = getOpcodeRep((char)0, Character.MAX_VALUE, 1694);
        op[1694] = getOpcodeRnm(34, 243); // WSP
        {char[] a = {41}; op[1695] = getOpcodeTls(a);}
        {int[] a = {1697,1698,1700,1701,1703,1704,1706}; op[1696] = getOpcodeCat(a);}
        {char[] a = {100,97,121}; op[1697] = getOpcodeTls(a);}
        op[1698] = getOpcodeRep((char)0, Character.MAX_VALUE, 1699);
        op[1699] = getOpcodeRnm(34, 243); // WSP
        {char[] a = {40}; op[1700] = getOpcodeTls(a);}
        op[1701] = getOpcodeRep((char)0, Character.MAX_VALUE, 1702);
        op[1702] = getOpcodeRnm(34, 243); // WSP
        op[1703] = getOpcodeRnm(201, 1246); // commonExpr
        op[1704] = getOpcodeRep((char)0, Character.MAX_VALUE, 1705);
        op[1705] = getOpcodeRnm(34, 243); // WSP
        {char[] a = {41}; op[1706] = getOpcodeTls(a);}
        {int[] a = {1708,1709,1711,1712,1714,1715,1717}; op[1707] = getOpcodeCat(a);}
        {char[] a = {100,97,121,115}; op[1708] = getOpcodeTls(a);}
        op[1709] = getOpcodeRep((char)0, Character.MAX_VALUE, 1710);
        op[1710] = getOpcodeRnm(34, 243); // WSP
        {char[] a = {40}; op[1711] = getOpcodeTls(a);}
        op[1712] = getOpcodeRep((char)0, Character.MAX_VALUE, 1713);
        op[1713] = getOpcodeRnm(34, 243); // WSP
        op[1714] = getOpcodeRnm(201, 1246); // commonExpr
        op[1715] = getOpcodeRep((char)0, Character.MAX_VALUE, 1716);
        op[1716] = getOpcodeRnm(34, 243); // WSP
        {char[] a = {41}; op[1717] = getOpcodeTls(a);}
        {int[] a = {1719,1720,1722,1723,1725,1726,1728}; op[1718] = getOpcodeCat(a);}
        {char[] a = {104,111,117,114}; op[1719] = getOpcodeTls(a);}
        op[1720] = getOpcodeRep((char)0, Character.MAX_VALUE, 1721);
        op[1721] = getOpcodeRnm(34, 243); // WSP
        {char[] a = {40}; op[1722] = getOpcodeTls(a);}
        op[1723] = getOpcodeRep((char)0, Character.MAX_VALUE, 1724);
        op[1724] = getOpcodeRnm(34, 243); // WSP
        op[1725] = getOpcodeRnm(201, 1246); // commonExpr
        op[1726] = getOpcodeRep((char)0, Character.MAX_VALUE, 1727);
        op[1727] = getOpcodeRnm(34, 243); // WSP
        {char[] a = {41}; op[1728] = getOpcodeTls(a);}
        {int[] a = {1730,1731,1733,1734,1736,1737,1739}; op[1729] = getOpcodeCat(a);}
        {char[] a = {104,111,117,114,115}; op[1730] = getOpcodeTls(a);}
        op[1731] = getOpcodeRep((char)0, Character.MAX_VALUE, 1732);
        op[1732] = getOpcodeRnm(34, 243); // WSP
        {char[] a = {40}; op[1733] = getOpcodeTls(a);}
        op[1734] = getOpcodeRep((char)0, Character.MAX_VALUE, 1735);
        op[1735] = getOpcodeRnm(34, 243); // WSP
        op[1736] = getOpcodeRnm(201, 1246); // commonExpr
        op[1737] = getOpcodeRep((char)0, Character.MAX_VALUE, 1738);
        op[1738] = getOpcodeRnm(34, 243); // WSP
        {char[] a = {41}; op[1739] = getOpcodeTls(a);}
        {int[] a = {1741,1742,1744,1745,1747,1748,1750}; op[1740] = getOpcodeCat(a);}
        {char[] a = {109,105,110,117,116,101}; op[1741] = getOpcodeTls(a);}
        op[1742] = getOpcodeRep((char)0, Character.MAX_VALUE, 1743);
        op[1743] = getOpcodeRnm(34, 243); // WSP
        {char[] a = {40}; op[1744] = getOpcodeTls(a);}
        op[1745] = getOpcodeRep((char)0, Character.MAX_VALUE, 1746);
        op[1746] = getOpcodeRnm(34, 243); // WSP
        op[1747] = getOpcodeRnm(201, 1246); // commonExpr
        op[1748] = getOpcodeRep((char)0, Character.MAX_VALUE, 1749);
        op[1749] = getOpcodeRnm(34, 243); // WSP
        {char[] a = {41}; op[1750] = getOpcodeTls(a);}
        {int[] a = {1752,1753,1755,1756,1758,1759,1761}; op[1751] = getOpcodeCat(a);}
        {char[] a = {109,105,110,117,116,101,115}; op[1752] = getOpcodeTls(a);}
        op[1753] = getOpcodeRep((char)0, Character.MAX_VALUE, 1754);
        op[1754] = getOpcodeRnm(34, 243); // WSP
        {char[] a = {40}; op[1755] = getOpcodeTls(a);}
        op[1756] = getOpcodeRep((char)0, Character.MAX_VALUE, 1757);
        op[1757] = getOpcodeRnm(34, 243); // WSP
        op[1758] = getOpcodeRnm(201, 1246); // commonExpr
        op[1759] = getOpcodeRep((char)0, Character.MAX_VALUE, 1760);
        op[1760] = getOpcodeRnm(34, 243); // WSP
        {char[] a = {41}; op[1761] = getOpcodeTls(a);}
        {int[] a = {1763,1764,1766,1767,1769,1770,1772}; op[1762] = getOpcodeCat(a);}
        {char[] a = {115,101,99,111,110,100}; op[1763] = getOpcodeTls(a);}
        op[1764] = getOpcodeRep((char)0, Character.MAX_VALUE, 1765);
        op[1765] = getOpcodeRnm(34, 243); // WSP
        {char[] a = {40}; op[1766] = getOpcodeTls(a);}
        op[1767] = getOpcodeRep((char)0, Character.MAX_VALUE, 1768);
        op[1768] = getOpcodeRnm(34, 243); // WSP
        op[1769] = getOpcodeRnm(201, 1246); // commonExpr
        op[1770] = getOpcodeRep((char)0, Character.MAX_VALUE, 1771);
        op[1771] = getOpcodeRnm(34, 243); // WSP
        {char[] a = {41}; op[1772] = getOpcodeTls(a);}
        {int[] a = {1774,1775,1777,1778,1780,1781,1783}; op[1773] = getOpcodeCat(a);}
        {char[] a = {115,101,99,111,110,100,115}; op[1774] = getOpcodeTls(a);}
        op[1775] = getOpcodeRep((char)0, Character.MAX_VALUE, 1776);
        op[1776] = getOpcodeRnm(34, 243); // WSP
        {char[] a = {40}; op[1777] = getOpcodeTls(a);}
        op[1778] = getOpcodeRep((char)0, Character.MAX_VALUE, 1779);
        op[1779] = getOpcodeRnm(34, 243); // WSP
        op[1780] = getOpcodeRnm(201, 1246); // commonExpr
        op[1781] = getOpcodeRep((char)0, Character.MAX_VALUE, 1782);
        op[1782] = getOpcodeRnm(34, 243); // WSP
        {char[] a = {41}; op[1783] = getOpcodeTls(a);}
        {int[] a = {1785,1786,1788,1789,1791,1792,1794}; op[1784] = getOpcodeCat(a);}
        {char[] a = {114,111,117,110,100}; op[1785] = getOpcodeTls(a);}
        op[1786] = getOpcodeRep((char)0, Character.MAX_VALUE, 1787);
        op[1787] = getOpcodeRnm(34, 243); // WSP
        {char[] a = {40}; op[1788] = getOpcodeTls(a);}
        op[1789] = getOpcodeRep((char)0, Character.MAX_VALUE, 1790);
        op[1790] = getOpcodeRnm(34, 243); // WSP
        op[1791] = getOpcodeRnm(201, 1246); // commonExpr
        op[1792] = getOpcodeRep((char)0, Character.MAX_VALUE, 1793);
        op[1793] = getOpcodeRnm(34, 243); // WSP
        {char[] a = {41}; op[1794] = getOpcodeTls(a);}
        {int[] a = {1796,1797,1799,1800,1802,1803,1805}; op[1795] = getOpcodeCat(a);}
        {char[] a = {102,108,111,111,114}; op[1796] = getOpcodeTls(a);}
        op[1797] = getOpcodeRep((char)0, Character.MAX_VALUE, 1798);
        op[1798] = getOpcodeRnm(34, 243); // WSP
        {char[] a = {40}; op[1799] = getOpcodeTls(a);}
        op[1800] = getOpcodeRep((char)0, Character.MAX_VALUE, 1801);
        op[1801] = getOpcodeRnm(34, 243); // WSP
        op[1802] = getOpcodeRnm(201, 1246); // commonExpr
        op[1803] = getOpcodeRep((char)0, Character.MAX_VALUE, 1804);
        op[1804] = getOpcodeRnm(34, 243); // WSP
        {char[] a = {41}; op[1805] = getOpcodeTls(a);}
        {int[] a = {1807,1808,1810,1811,1813,1814,1816}; op[1806] = getOpcodeCat(a);}
        {char[] a = {99,101,105,108,105,110,103}; op[1807] = getOpcodeTls(a);}
        op[1808] = getOpcodeRep((char)0, Character.MAX_VALUE, 1809);
        op[1809] = getOpcodeRnm(34, 243); // WSP
        {char[] a = {40}; op[1810] = getOpcodeTls(a);}
        op[1811] = getOpcodeRep((char)0, Character.MAX_VALUE, 1812);
        op[1812] = getOpcodeRnm(34, 243); // WSP
        op[1813] = getOpcodeRnm(201, 1246); // commonExpr
        op[1814] = getOpcodeRep((char)0, Character.MAX_VALUE, 1815);
        op[1815] = getOpcodeRnm(34, 243); // WSP
        {char[] a = {41}; op[1816] = getOpcodeTls(a);}
        {int[] a = {1818,1819,1821,1822,1824}; op[1817] = getOpcodeCat(a);}
        {char[] a = {40}; op[1818] = getOpcodeTls(a);}
        op[1819] = getOpcodeRep((char)0, Character.MAX_VALUE, 1820);
        op[1820] = getOpcodeRnm(34, 243); // WSP
        op[1821] = getOpcodeRnm(201, 1246); // commonExpr
        op[1822] = getOpcodeRep((char)0, Character.MAX_VALUE, 1823);
        op[1823] = getOpcodeRnm(34, 243); // WSP
        {char[] a = {41}; op[1824] = getOpcodeTls(a);}
        {int[] a = {1826,1827,1829,1830,1832}; op[1825] = getOpcodeCat(a);}
        {char[] a = {40}; op[1826] = getOpcodeTls(a);}
        op[1827] = getOpcodeRep((char)0, Character.MAX_VALUE, 1828);
        op[1828] = getOpcodeRnm(34, 243); // WSP
        op[1829] = getOpcodeRnm(202, 1261); // boolCommonExpr
        op[1830] = getOpcodeRep((char)0, Character.MAX_VALUE, 1831);
        op[1831] = getOpcodeRnm(34, 243); // WSP
        {char[] a = {41}; op[1832] = getOpcodeTls(a);}
        {int[] a = {1834,1835,1837,1838,1840}; op[1833] = getOpcodeCat(a);}
        op[1834] = getOpcodeRnm(202, 1261); // boolCommonExpr
        op[1835] = getOpcodeRep((char)1, Character.MAX_VALUE, 1836);
        op[1836] = getOpcodeRnm(34, 243); // WSP
        {char[] a = {97,110,100}; op[1837] = getOpcodeTls(a);}
        op[1838] = getOpcodeRep((char)1, Character.MAX_VALUE, 1839);
        op[1839] = getOpcodeRnm(34, 243); // WSP
        op[1840] = getOpcodeRnm(202, 1261); // boolCommonExpr
        {int[] a = {1842,1843,1845,1846,1848}; op[1841] = getOpcodeCat(a);}
        op[1842] = getOpcodeRnm(202, 1261); // boolCommonExpr
        op[1843] = getOpcodeRep((char)1, Character.MAX_VALUE, 1844);
        op[1844] = getOpcodeRnm(34, 243); // WSP
        {char[] a = {111,114}; op[1845] = getOpcodeTls(a);}
        op[1846] = getOpcodeRep((char)1, Character.MAX_VALUE, 1847);
        op[1847] = getOpcodeRnm(34, 243); // WSP
        op[1848] = getOpcodeRnm(202, 1261); // boolCommonExpr
        {int[] a = {1850,1851,1853,1854,1856}; op[1849] = getOpcodeCat(a);}
        op[1850] = getOpcodeRnm(201, 1246); // commonExpr
        op[1851] = getOpcodeRep((char)1, Character.MAX_VALUE, 1852);
        op[1852] = getOpcodeRnm(34, 243); // WSP
        {char[] a = {101,113}; op[1853] = getOpcodeTls(a);}
        op[1854] = getOpcodeRep((char)1, Character.MAX_VALUE, 1855);
        op[1855] = getOpcodeRnm(34, 243); // WSP
        op[1856] = getOpcodeRnm(201, 1246); // commonExpr
        {int[] a = {1858,1859,1861,1862,1864}; op[1857] = getOpcodeCat(a);}
        op[1858] = getOpcodeRnm(201, 1246); // commonExpr
        op[1859] = getOpcodeRep((char)1, Character.MAX_VALUE, 1860);
        op[1860] = getOpcodeRnm(34, 243); // WSP
        {char[] a = {110,101}; op[1861] = getOpcodeTls(a);}
        op[1862] = getOpcodeRep((char)1, Character.MAX_VALUE, 1863);
        op[1863] = getOpcodeRnm(34, 243); // WSP
        op[1864] = getOpcodeRnm(201, 1246); // commonExpr
        {int[] a = {1866,1867,1869,1870,1872}; op[1865] = getOpcodeCat(a);}
        op[1866] = getOpcodeRnm(201, 1246); // commonExpr
        op[1867] = getOpcodeRep((char)1, Character.MAX_VALUE, 1868);
        op[1868] = getOpcodeRnm(34, 243); // WSP
        {char[] a = {108,116}; op[1869] = getOpcodeTls(a);}
        op[1870] = getOpcodeRep((char)1, Character.MAX_VALUE, 1871);
        op[1871] = getOpcodeRnm(34, 243); // WSP
        op[1872] = getOpcodeRnm(201, 1246); // commonExpr
        {int[] a = {1874,1875,1877,1878,1880}; op[1873] = getOpcodeCat(a);}
        op[1874] = getOpcodeRnm(201, 1246); // commonExpr
        op[1875] = getOpcodeRep((char)1, Character.MAX_VALUE, 1876);
        op[1876] = getOpcodeRnm(34, 243); // WSP
        {char[] a = {108,101}; op[1877] = getOpcodeTls(a);}
        op[1878] = getOpcodeRep((char)1, Character.MAX_VALUE, 1879);
        op[1879] = getOpcodeRnm(34, 243); // WSP
        op[1880] = getOpcodeRnm(201, 1246); // commonExpr
        {int[] a = {1882,1883,1885,1886,1888}; op[1881] = getOpcodeCat(a);}
        op[1882] = getOpcodeRnm(201, 1246); // commonExpr
        op[1883] = getOpcodeRep((char)1, Character.MAX_VALUE, 1884);
        op[1884] = getOpcodeRnm(34, 243); // WSP
        {char[] a = {103,116}; op[1885] = getOpcodeTls(a);}
        op[1886] = getOpcodeRep((char)1, Character.MAX_VALUE, 1887);
        op[1887] = getOpcodeRnm(34, 243); // WSP
        op[1888] = getOpcodeRnm(201, 1246); // commonExpr
        {int[] a = {1890,1891,1893,1894,1896}; op[1889] = getOpcodeCat(a);}
        op[1890] = getOpcodeRnm(201, 1246); // commonExpr
        op[1891] = getOpcodeRep((char)1, Character.MAX_VALUE, 1892);
        op[1892] = getOpcodeRnm(34, 243); // WSP
        {char[] a = {103,101}; op[1893] = getOpcodeTls(a);}
        op[1894] = getOpcodeRep((char)1, Character.MAX_VALUE, 1895);
        op[1895] = getOpcodeRnm(34, 243); // WSP
        op[1896] = getOpcodeRnm(201, 1246); // commonExpr
        {int[] a = {1898,1899,1901,1902,1904}; op[1897] = getOpcodeCat(a);}
        op[1898] = getOpcodeRnm(201, 1246); // commonExpr
        op[1899] = getOpcodeRep((char)1, Character.MAX_VALUE, 1900);
        op[1900] = getOpcodeRnm(34, 243); // WSP
        {char[] a = {97,100,100}; op[1901] = getOpcodeTls(a);}
        op[1902] = getOpcodeRep((char)1, Character.MAX_VALUE, 1903);
        op[1903] = getOpcodeRnm(34, 243); // WSP
        op[1904] = getOpcodeRnm(201, 1246); // commonExpr
        {int[] a = {1906,1907,1909,1910,1912}; op[1905] = getOpcodeCat(a);}
        op[1906] = getOpcodeRnm(201, 1246); // commonExpr
        op[1907] = getOpcodeRep((char)1, Character.MAX_VALUE, 1908);
        op[1908] = getOpcodeRnm(34, 243); // WSP
        {char[] a = {115,117,98}; op[1909] = getOpcodeTls(a);}
        op[1910] = getOpcodeRep((char)1, Character.MAX_VALUE, 1911);
        op[1911] = getOpcodeRnm(34, 243); // WSP
        op[1912] = getOpcodeRnm(201, 1246); // commonExpr
        {int[] a = {1914,1915,1917,1918,1920}; op[1913] = getOpcodeCat(a);}
        op[1914] = getOpcodeRnm(201, 1246); // commonExpr
        op[1915] = getOpcodeRep((char)1, Character.MAX_VALUE, 1916);
        op[1916] = getOpcodeRnm(34, 243); // WSP
        {char[] a = {109,117,108}; op[1917] = getOpcodeTls(a);}
        op[1918] = getOpcodeRep((char)1, Character.MAX_VALUE, 1919);
        op[1919] = getOpcodeRnm(34, 243); // WSP
        op[1920] = getOpcodeRnm(201, 1246); // commonExpr
        {int[] a = {1922,1923,1925,1926,1928}; op[1921] = getOpcodeCat(a);}
        op[1922] = getOpcodeRnm(201, 1246); // commonExpr
        op[1923] = getOpcodeRep((char)1, Character.MAX_VALUE, 1924);
        op[1924] = getOpcodeRnm(34, 243); // WSP
        {char[] a = {100,105,118}; op[1925] = getOpcodeTls(a);}
        op[1926] = getOpcodeRep((char)1, Character.MAX_VALUE, 1927);
        op[1927] = getOpcodeRnm(34, 243); // WSP
        op[1928] = getOpcodeRnm(201, 1246); // commonExpr
        {int[] a = {1930,1931,1933,1934,1936}; op[1929] = getOpcodeCat(a);}
        op[1930] = getOpcodeRnm(201, 1246); // commonExpr
        op[1931] = getOpcodeRep((char)1, Character.MAX_VALUE, 1932);
        op[1932] = getOpcodeRnm(34, 243); // WSP
        {char[] a = {109,111,100}; op[1933] = getOpcodeTls(a);}
        op[1934] = getOpcodeRep((char)1, Character.MAX_VALUE, 1935);
        op[1935] = getOpcodeRnm(34, 243); // WSP
        op[1936] = getOpcodeRnm(201, 1246); // commonExpr
        {int[] a = {1938,1939,1941}; op[1937] = getOpcodeCat(a);}
        {char[] a = {45}; op[1938] = getOpcodeTls(a);}
        op[1939] = getOpcodeRep((char)0, Character.MAX_VALUE, 1940);
        op[1940] = getOpcodeRnm(34, 243); // WSP
        op[1941] = getOpcodeRnm(201, 1246); // commonExpr
        {int[] a = {1943,1944,1946}; op[1942] = getOpcodeCat(a);}
        {char[] a = {110,111,116}; op[1943] = getOpcodeTls(a);}
        op[1944] = getOpcodeRep((char)1, Character.MAX_VALUE, 1945);
        op[1945] = getOpcodeRnm(34, 243); // WSP
        op[1946] = getOpcodeRnm(202, 1261); // boolCommonExpr
        {int[] a = {1948,1949,1951,1952,1954,1958,1959,1961}; op[1947] = getOpcodeCat(a);}
        {char[] a = {105,115,111,102}; op[1948] = getOpcodeTls(a);}
        op[1949] = getOpcodeRep((char)0, Character.MAX_VALUE, 1950);
        op[1950] = getOpcodeRnm(34, 243); // WSP
        {char[] a = {40}; op[1951] = getOpcodeTls(a);}
        op[1952] = getOpcodeRep((char)0, Character.MAX_VALUE, 1953);
        op[1953] = getOpcodeRnm(34, 243); // WSP
        op[1954] = getOpcodeRep((char)0, (char)1, 1955);
        {int[] a = {1956,1957}; op[1955] = getOpcodeCat(a);}
        op[1956] = getOpcodeRnm(201, 1246); // commonExpr
        {char[] a = {44}; op[1957] = getOpcodeTls(a);}
        op[1958] = getOpcodeRnm(115, 788); // qualifiedTypeName
        op[1959] = getOpcodeRep((char)0, Character.MAX_VALUE, 1960);
        op[1960] = getOpcodeRnm(34, 243); // WSP
        {char[] a = {41}; op[1961] = getOpcodeTls(a);}
        {int[] a = {1963,1964,1966,1967,1969,1973,1974,1976}; op[1962] = getOpcodeCat(a);}
        {char[] a = {99,97,115,116}; op[1963] = getOpcodeTls(a);}
        op[1964] = getOpcodeRep((char)0, Character.MAX_VALUE, 1965);
        op[1965] = getOpcodeRnm(34, 243); // WSP
        {char[] a = {40}; op[1966] = getOpcodeTls(a);}
        op[1967] = getOpcodeRep((char)0, Character.MAX_VALUE, 1968);
        op[1968] = getOpcodeRnm(34, 243); // WSP
        op[1969] = getOpcodeRep((char)0, (char)1, 1970);
        {int[] a = {1971,1972}; op[1970] = getOpcodeCat(a);}
        op[1971] = getOpcodeRnm(201, 1246); // commonExpr
        {char[] a = {44}; op[1972] = getOpcodeTls(a);}
        op[1973] = getOpcodeRnm(115, 788); // qualifiedTypeName
        op[1974] = getOpcodeRep((char)0, Character.MAX_VALUE, 1975);
        op[1975] = getOpcodeRnm(34, 243); // WSP
        {char[] a = {41}; op[1976] = getOpcodeTls(a);}
        {int[] a = {1978,1979,1981,1982,1984,1988,1989,1991}; op[1977] = getOpcodeCat(a);}
        {char[] a = {99,97,115,116}; op[1978] = getOpcodeTls(a);}
        op[1979] = getOpcodeRep((char)0, Character.MAX_VALUE, 1980);
        op[1980] = getOpcodeRnm(34, 243); // WSP
        {char[] a = {40}; op[1981] = getOpcodeTls(a);}
        op[1982] = getOpcodeRep((char)0, Character.MAX_VALUE, 1983);
        op[1983] = getOpcodeRnm(34, 243); // WSP
        op[1984] = getOpcodeRep((char)0, (char)1, 1985);
        {int[] a = {1986,1987}; op[1985] = getOpcodeCat(a);}
        op[1986] = getOpcodeRnm(201, 1246); // commonExpr
        {char[] a = {44}; op[1987] = getOpcodeTls(a);}
        {char[] a = {69,100,109,46,66,111,111,108,101,97,110}; op[1988] = getOpcodeTls(a);}
        op[1989] = getOpcodeRep((char)0, Character.MAX_VALUE, 1990);
        op[1990] = getOpcodeRnm(34, 243); // WSP
        {char[] a = {41}; op[1991] = getOpcodeTls(a);}
        {int[] a = {1993,1994,1996,1997,1999,2000,2002}; op[1992] = getOpcodeCat(a);}
        {char[] a = {103,101,116,116,111,116,97,108,111,102,102,115,101,116,109,105,110,117,116,101,115}; op[1993] = getOpcodeTls(a);}
        op[1994] = getOpcodeRep((char)0, Character.MAX_VALUE, 1995);
        op[1995] = getOpcodeRnm(34, 243); // WSP
        {char[] a = {40}; op[1996] = getOpcodeTls(a);}
        op[1997] = getOpcodeRep((char)0, Character.MAX_VALUE, 1998);
        op[1998] = getOpcodeRnm(34, 243); // WSP
        op[1999] = getOpcodeRnm(201, 1246); // commonExpr
        op[2000] = getOpcodeRep((char)0, Character.MAX_VALUE, 2001);
        op[2001] = getOpcodeRnm(34, 243); // WSP
        {char[] a = {41}; op[2002] = getOpcodeTls(a);}
        {int[] a = {2004,2005,2007,2008,2010,2011,2012,2013,2015}; op[2003] = getOpcodeCat(a);}
        {char[] a = {103,101,111,46,100,105,115,116,97,110,99,101}; op[2004] = getOpcodeTls(a);}
        op[2005] = getOpcodeRep((char)0, Character.MAX_VALUE, 2006);
        op[2006] = getOpcodeRnm(34, 243); // WSP
        {char[] a = {40}; op[2007] = getOpcodeTls(a);}
        op[2008] = getOpcodeRep((char)0, Character.MAX_VALUE, 2009);
        op[2009] = getOpcodeRnm(34, 243); // WSP
        op[2010] = getOpcodeRnm(201, 1246); // commonExpr
        {char[] a = {44}; op[2011] = getOpcodeTls(a);}
        op[2012] = getOpcodeRnm(201, 1246); // commonExpr
        op[2013] = getOpcodeRep((char)0, Character.MAX_VALUE, 2014);
        op[2014] = getOpcodeRnm(34, 243); // WSP
        {char[] a = {41}; op[2015] = getOpcodeTls(a);}
        {int[] a = {2017,2018,2020,2021,2023,2024,2026}; op[2016] = getOpcodeCat(a);}
        {char[] a = {103,101,111,46,108,101,110,103,116,104}; op[2017] = getOpcodeTls(a);}
        op[2018] = getOpcodeRep((char)0, Character.MAX_VALUE, 2019);
        op[2019] = getOpcodeRnm(34, 243); // WSP
        {char[] a = {40}; op[2020] = getOpcodeTls(a);}
        op[2021] = getOpcodeRep((char)0, Character.MAX_VALUE, 2022);
        op[2022] = getOpcodeRnm(34, 243); // WSP
        op[2023] = getOpcodeRnm(201, 1246); // commonExpr
        op[2024] = getOpcodeRep((char)0, Character.MAX_VALUE, 2025);
        op[2025] = getOpcodeRnm(34, 243); // WSP
        {char[] a = {41}; op[2026] = getOpcodeTls(a);}
        {int[] a = {2028,2029,2031,2032,2034,2035,2036,2037,2039}; op[2027] = getOpcodeCat(a);}
        {char[] a = {103,101,111,46,105,110,116,101,114,115,101,99,116,115}; op[2028] = getOpcodeTls(a);}
        op[2029] = getOpcodeRep((char)0, Character.MAX_VALUE, 2030);
        op[2030] = getOpcodeRnm(34, 243); // WSP
        {char[] a = {40}; op[2031] = getOpcodeTls(a);}
        op[2032] = getOpcodeRep((char)0, Character.MAX_VALUE, 2033);
        op[2033] = getOpcodeRnm(34, 243); // WSP
        op[2034] = getOpcodeRnm(201, 1246); // commonExpr
        {char[] a = {44}; op[2035] = getOpcodeTls(a);}
        op[2036] = getOpcodeRnm(201, 1246); // commonExpr
        op[2037] = getOpcodeRep((char)0, Character.MAX_VALUE, 2038);
        op[2038] = getOpcodeRnm(34, 243); // WSP
        {char[] a = {41}; op[2039] = getOpcodeTls(a);}
        return op;
    }

    /** Displays the original SABNF grammar on the output device.
     * @param out the output device to display on.*/
    public static void display(PrintStream out){
        out.println(";");
        out.println("; OData.OData");
        out.println(";");
        out.println("; odata-v1.0-abnf for URI conventions");
        out.println("; TODO: and action request payloads? They are specified in the core part, not a format specification");
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
        out.println("; TODO: use peWS = \"%20\" / \"%09\" instead in URL fragments (ODATA-127) ");
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
        out.println("; TODO: restrict to http[s]? (ODATA-128)");
        out.println("scheme        = ALPHA *( ALPHA / DIGIT / \"+\" / \"-\" / \".\" )");
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
        out.println(";EQ = %x3D              ");
        out.println(";SEMI = %x3B              ");
        out.println("COMMA = %x2C");
        out.println("sign = \"+\" / \"-\"");
        out.println("star = \"*\"");
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
        out.println("geographyCollection      = \"{TODO2}\"       ; Format specific");
        out.println("geographyLineString      = \"{TODO3}\"       ; Format specific");
        out.println("geographyMultiLineString = \"{TODO4}\"       ; Format specific");
        out.println("geographyMultiPoint      = \"{TODO5}\"       ; Format specific");
        out.println("geographyMultiPolygon    = \"{TODO6}\"       ; Format specific");
        out.println("geographyPoint           = \"{TODO7}\"       ; Format specific");
        out.println("geographyPolygon         = \"{TODO8}\"       ; Format specific");
        out.println("");
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
        out.println(";collectionNavigation = keyPredicate [ singleNavigation ]");
        out.println(";                     / [ \"/\" qualifiedEntityTypeName ] collectionPath");
        out.println("collectionNavigation = [ \"/\" qualifiedEntityTypeName ]");
        out.println("                       ( keyPredicate [ singleNavigation ]");
        out.println("                       / collectionPath");
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
        out.println("functionParameters      = \"(\" [ functionParameter *( \",\" functionParameter ) ] \")\"");
        out.println("functionParameter       = functionParameterName \"=\" ( primitiveParameterValue / parameterAlias )");
        out.println("functionParameterName   = odataIdentifier;");
        out.println("primitiveParameterValue = primitiveLiteral");
        out.println("parameterAlias          = \"@\" odataIdentifier");
        out.println("");
        out.println("aliasAndValue         = parameterAlias        \"=\" parameterValue");
        out.println("parameterNameAndValue = functionParameterName \"=\" parameterValue");
        out.println("");
        out.println("parameterValue = primitiveLiteral     ; note this is a Uri literal, not a JSON literal");
        out.println("               / complexInUri  ");
        out.println("               / complexColInUri");
        out.println("               / primitiveColInUri");
        out.println("");
        out.println("; The following rules define a URL-encoded JSON format for function parameters");
        out.println("; TODO: duplicate rules for unencoded action request body format");
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
        out.println("begin-object    = \"{\" ");
        out.println("end-object      = \"}\"");
        out.println(";begin-object-pe = \"%7B\"");
        out.println(";end-object-pe   = \"%7D\"");
        out.println("");
        out.println("begin-array    = \"[\" ");
        out.println("end-array      = \"]\" ");
        out.println(";begin-array-pe = \"%5B\"");
        out.println(";end-array-pe   = \"%5D\"");
        out.println("");
        out.println("quotation-mark    = DQUOTE");
        out.println(";quotation-mark-pe = \"%22\"");
        out.println("value-separator = COMMA");
        out.println("name-separator  = \":\"");
        out.println("");
        out.println("; TODO: use -pe alternative");
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
        out.println("; TODO: not complete");
        out.println("; JSON syntay [ RFC4627 ]                 ");
        out.println("primitiveLiteralInJSON = stringInJSON");
        out.println("                       / numberInJSON");
        out.println("                       / %x74.72.75.65    ; true ");
        out.println("                       / %x66.61.6c.73.65 ; false");
        out.println("                       / %x6e.75.6c.6c    ; null");
        out.println("stringInJSON = quotation-mark *charInJSON quotation-mark");
        out.println("charInJSON = pchar   ; TODO: more specific, following RFC4627?");
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
        out.println("; Here be dragons! ");
        out.println(";------------------------------------------------------------------------------");
        out.println("");
        out.println("commonExpr = primitiveLiteral");
        out.println("           / firstMemberExpr ");
        out.println("           / boolCommonExpr ");
        out.println("           / methodCallExpr ");
        out.println("           / parenExpr ");
        out.println("           / addExpr ");
        out.println("           / subExpr ");
        out.println("           / mulExpr ");
        out.println("           / divExpr ");
        out.println("           / modExpr ");
        out.println("           / negateExpr ");
        out.println("           / memberExpr ");
        out.println("           / castExpr ");
        out.println("           / functionCall ; TODO: rather boundFunctionExpr?");
        out.println("");
        out.println("boolCommonExpr = boolean  ");
        out.println("               / firstBoolPrimitiveMemExpr  ; TODO: why \"Primitive\"?");
        out.println("               / boolPrimitiveMemberExpr    ; TODO: why \"Primitive\"?");
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
        out.println("               / boolFunctionCall ; TODO: rather boolBoundFunctionExpr?");
        out.println("");
        out.println("firstBoolPrimitiveMemExpr = [ qualifiedEntityTypeName \"/\"] ");
        out.println("                            primitiveProperty ; with a binary property");
        out.println("");
        out.println("boolPrimitiveMemberExpr = commonExpr \"/\" [ qualifiedEntityTypeName \"/\" ] primitivePropertyPath");
        out.println("");
        out.println("memberExpr = primitivePropertyPath ");
        out.println("           / complexPropertyPath ");
        out.println("           / entityNavigationProperty [ singleNavigationExpr ] ");
        out.println("           / commonExpr \"/\" [ qualifiedEntityTypeName \"/\" ] entityColNavigationProperty [ collectionNavigationExpr ] ");
        out.println("           / collectionPropertyPath [ anyExpr / allExpr ] ; TODO: this alternative seems unnecessary as anyExpr and allExpr are reachable via boolCommonExpr and thus commonExpr");
        out.println("");
        out.println("firstMemberExpr = [ qualifiedEntityTypeName \"/\"]");
        out.println("                  [ lambdaPredicatePrefixExpr ] ; A lambdaPredicatePrefixExpr is only defined inside a ");
        out.println("                                                ; lambdaPredicateExpr. A lambdaPredicatePrefixExpr is required   ");
        out.println("                                                ; inside a lambdaPredicateExpr.");
        out.println("                  entityColNavigationProperty [ collectionNavigationExpr ] ");
        out.println("                / entityNavigationProperty [ singleNavigationExpr ] ");
        out.println("                / primitivePropertyPath ");
        out.println("                / complexPropertyPath ");
        out.println("                / collectionPropertyPath [ anyExpr / allExpr ] ; TODO: seems to be unnecessary as any/all are reachable via (bool)commonExpr");
        out.println("");
        out.println("functionCall = entityFunctionCall  ");
        out.println("             / entityColFunctionCall");
        out.println("             / complexFunctionCall  ");
        out.println("             / complexColFunctionCall ");
        out.println("             / primitiveFunctionCall ");
        out.println("             / primitiveColFunctionCall");
        out.println("");
        out.println("boolFunctionCall = primitiveFunctionCall ; with the added restriction that the return type is Edm.Boolean");
        out.println("");
        out.println("lambdaPredicatePrefixExpr = inscopeVariableExpr \"/\"");
        out.println("");
        out.println("inscopeVariableExpr  = implicitVariableExpr / lambdaVariableExpr");
        out.println("implicitVariableExpr = \"$it\" ; references the unnamed outer variable of the query");
        out.println("lambdaVariableExpr   = odataIdentifier");
        out.println("");
        out.println("primitivePropertyPath  = [ \"/\" qualifiedEntityTypeName ] \"/\" ( primitiveKeyProperty / primitiveNonKeyProperty ) [ value ]");
        out.println("collectionPropertyPath = [ \"/\" qualifiedEntityTypeName ] \"/\" ( primitiveColProperty / complexColProperty ) [ boundOperation ]");
        out.println("complexPropertyPath    = [ \"/\" qualifiedEntityTypeName ] \"/\" complexProperty ");
        out.println("                         [ primitivePropertyPath  ");
        out.println("                         / complexPropertyPath ");
        out.println("                         / collectionPropertyPath ");
        out.println("                         / boundOperation");
        out.println("                         ] ");
        out.println("");
        out.println("collectionNavigationExpr = \"/\" [ qualifiedEntityTypeName \"/\" ] ");
        out.println("                           ( boundFunctionExpr ");
        out.println("                           / anyExpr ; TODO: this alternative seems unnecessary as anyExpr and allExpr are reachable via boolCommonExpr and thus commonExpr");
        out.println("                           / allExpr ");
        out.println("                           )");
        out.println("");
        out.println("singleNavigationExpr = [ \"/\" qualifiedEntityTypeName ]");
        out.println("                       ( \"/\" entityColNavigationProperty [ collectionNavigationExpr ] ");
        out.println("                       / \"/\" entityNavigationProperty [ singleNavigationExpr ] ");
        out.println("                       / primitivePropertyPath ");
        out.println("                       / complexPropertyPath ");
        out.println("                       / collectionPropertyPath [ anyExpr / allExpr ] ");
        out.println("                       / \"/\" streamProperty ");
        out.println("                       / boundFunctionExpr ");
        out.println("                       )");
        out.println("        ");
        out.println("; TODO: should probably replace functionCall in commonExpr");
        out.println("boundFunctionExpr = [ \"/\" qualifiedEntityTypeName ] \"/\" ");
        out.println("                    ( boundEntityColFuncCall [ singleNavigationExpr ] ");
        out.println("                    / boundEntityFuncCall [ collectionNavigationExpr ] ");
        out.println("                    / boundPrimitiveFuncCall [ boundFunctionExpr ] ");
        out.println("                    / boundPrimitiveColFuncCall [ boundFunctionExpr ] ");
        out.println("                    / boundComplexFuncCall [ complexPropertyPath / boundFunctionExpr ] ");
        out.println("                    / boundComplexColFuncCall [ boundFunctionExpr ]");
        out.println("                    )");
        out.println("                    ; boundOperation segments can only be composed if the type of the previous segment matches ");
        out.println("                    ; the type of the first parameter of the action or function being called.");
        out.println("                    ; NOTE: the qualifiedEntityTypeName is only permitted if the previous segment is an Entity or Collection of Entities.");
        out.println("                    ; TOOD: roll this restriction into the ABNF");
        out.println("");
        out.println(";boolBoundFunctionExpr = boundFunctionExpr");
        out.println("                         ; with the added restriction that the boolBoundFunctionExpr MUST return a boolean value");
        out.println(" ");
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
        out.println("                   / anyMethodCallExpr ");
        out.println("                   / allMethodCallExpr");
        out.println("");
        out.println("allMethodCallExpr = pathExpression-collection \"/\" allExpr");
        out.println("anyMethodCallExpr = pathExpression-collection \"/\" anyExpr");
        out.println("");
        out.println("pathExpression-collection = *( entityNavigationProperty \"/\" )");
        out.println("                             ( entityColNavigationProperty / complexColProperty ) ; TODO: check if other path segments can be \"prepended\" by other rules");
        out.println("");
        out.println("anyExpr = \"any(\" [ lambdaVariableExpr \":\" lambdaPredicateExpr ] \")\"");
        out.println("allExpr = \"all(\" lambdaVariableExpr \":\" lambdaPredicateExpr \")\"");
        out.println("lambdaPredicateExpr = boolCommonExpr");
        out.println("");
        out.println("substringOfMethodCallExpr = \"substringof\" *WSP \"(\" *WSP commonExpr \",\" commonExpr *WSP \")\"");
        out.println("startsWithMethodCallExpr  = \"startswith\"  *WSP \"(\" *WSP commonExpr \",\" commonExpr *WSP \")\"");
        out.println("endsWithMethodCallExpr    = \"endswith\"    *WSP \"(\" *WSP commonExpr \",\" commonExpr *WSP \")\"");
        out.println("lengthMethodCallExpr      = \"length\"      *WSP \"(\" *WSP commonExpr *WSP \")\"");
        out.println("indexOfMethodCallExpr     = \"indexof\"     *WSP \"(\" *WSP commonExpr \",\" commonExpr *WSP \")\"");
        out.println("substringMethodCallExpr   = \"substring\"   *WSP \"(\" *WSP commonExpr \",\" commonExpr [ \",\" commonExpr *WSP ] \")\"");
        out.println("toLowerMethodCallExpr     = \"tolower\"     *WSP \"(\" *WSP commonExpr *WSP \")\"");
        out.println("toUpperMethodCallExpr     = \"toupper\"     *WSP \"(\" *WSP commonExpr *WSP \")\"");
        out.println("trimMethodCallExpr        = \"trim\"        *WSP \"(\" *WSP commonExpr *WSP \")\"");
        out.println("concatMethodCallExpr      = \"concat\"      *WSP \"(\" *WSP commonExpr \",\" commonExpr *WSP \")\"");
        out.println("yearMethodCallExpr        = \"year\"        *WSP \"(\" *WSP commonExpr *WSP \")\"");
        out.println("yearsMethodCallExpr       = \"years\"       *WSP \"(\" *WSP commonExpr *WSP \")\"");
        out.println("monthMethodCallExpr       = \"month\"       *WSP \"(\" *WSP commonExpr *WSP \")\"");
        out.println("monthsMethodCallExpr      = \"months\"      *WSP \"(\" *WSP commonExpr *WSP \")\"");
        out.println("dayMethodCallExpr         = \"day\"         *WSP \"(\" *WSP commonExpr *WSP \")\"");
        out.println("daysMethodCallExpr        = \"days\"        *WSP \"(\" *WSP commonExpr *WSP \")\"");
        out.println("hourMethodCallExpr        = \"hour\"        *WSP \"(\" *WSP commonExpr *WSP \")\"");
        out.println("hoursMethodCallExpr       = \"hours\"       *WSP \"(\" *WSP commonExpr *WSP \")\"");
        out.println("minuteMethodCallExpr      = \"minute\"      *WSP \"(\" *WSP commonExpr *WSP \")\"");
        out.println("minutesMethodCallExpr     = \"minutes\"     *WSP \"(\" *WSP commonExpr *WSP \")\"");
        out.println("secondMethodCallExpr      = \"second\"      *WSP \"(\" *WSP commonExpr *WSP \")\"");
        out.println("secondsMethodCallExpr     = \"seconds\"     *WSP \"(\" *WSP commonExpr *WSP \")\"");
        out.println("roundMethodCallExpr       = \"round\"       *WSP \"(\" *WSP commonExpr *WSP \")\"");
        out.println("floorMethodCallExpr       = \"floor\"       *WSP \"(\" *WSP commonExpr *WSP \")\"");
        out.println("ceilingMethodCallExpr     = \"ceiling\"     *WSP \"(\" *WSP commonExpr *WSP \")\"");
        out.println("");
        out.println("parenExpr     = \"(\" *WSP commonExpr     *WSP \")\"");
        out.println("boolParenExpr = \"(\" *WSP boolCommonExpr *WSP \")\"");
        out.println("");
        out.println("; TODO: case-insensitive? (ODATA-117)");
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
        out.println("; TODO: case-insensitive? (ODATA-117)");
        out.println("notExpr = \"not\" 1*WSP boolCommonExpr");
        out.println("");
        out.println("; TODO: isn't this rather singleNavigation (once the leading slash has been removed)?");
        out.println("isofExpr     = \"isof\" *WSP \"(\" *WSP [ commonExpr \",\" ] qualifiedTypeName *WSP \")\"");
        out.println("castExpr     = \"cast\" *WSP \"(\" *WSP [ commonExpr \",\" ] qualifiedTypeName *WSP \")\"");
        out.println("boolCastExpr = \"cast\" *WSP \"(\" *WSP [ commonExpr \",\" ] \"Edm.Boolean\"     *WSP \")\"");
        out.println("");
        out.println("; TODO: what are these? They are not mentioned in the URL conventions");
        out.println("getTotalOffsetMinutesExpr = \"gettotaloffsetminutes\" *WSP \"(\" *WSP commonExpr *WSP \")\" ");
        out.println("distanceMethodCallExpr    = \"geo.distance\"          *WSP \"(\" *WSP commonExpr \",\" commonExpr *WSP \")\"");
        out.println("geoLengthMethodCallExpr   = \"geo.length\"            *WSP \"(\" *WSP commonExpr *WSP \")\"");
        out.println("intersectsMethodCallExpr  = \"geo.intersects\"        *WSP \"(\" *WSP commonExpr \",\" commonExpr *WSP \")\"");
        out.println("");
        out.println("; End of odata-v1.0-abnf");
    }
}
