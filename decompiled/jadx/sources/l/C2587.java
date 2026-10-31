package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import com.alipay.sdk.m.t.e;
import com.alipay.sdk.m.u0.b;
import com.google.android.material.color.ColorResourcesTableCreator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import org.bouncycastle.i18n.TextBundle;
import org.simpleframework.xml.core.AnnotationHandler;
import org.simpleframework.xml.strategy.Name;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.ۖܳۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q7AJ */
/* JADX INFO: loaded from: classes2.dex */
public final class C2587 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C19793 f8183;

    public C2587(C19793 c19793) {
        this.f8183 = c19793;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C12936 m8197(C1656 c1656, C15923 c15923) {
        String str = c1656.f5788;
        String str2 = c1656.f5782;
        C15991 c15991 = new C15991(this, c1656, c15923);
        C19793 c19793 = this.f8183;
        C12936 c12936 = (C12936) c19793.m45511(str, str2, (String) null, c15991);
        c19793.m45533(str);
        return c12936;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C12936 m8196(C2587 c2587, C1656 c1656, C15923 c15923, int i) throws C3059 {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        JSONValue jSONValueAdd;
        JSONObject jSONObjectM46095;
        String str8;
        String str9;
        String str10;
        String str11;
        JSONValue jSONValueAdd2;
        AbstractC2821 abstractC2821M45516 = c2587.f8183.m45516(c1656, c15923);
        int i2 = C8869.f27007;
        String str12 = c1656.f5782;
        if (abstractC2821M45516 instanceof C11243) {
            throw C3059.m9368("UNSUPPORTED_RESOURCE_READ", "Resource reads must use mt_apk_resource_read batch arguments.");
        }
        if (abstractC2821M45516 instanceof C22117) {
            C22117 c22117 = (C22117) abstractC2821M45516;
            long j = c22117.f71808;
            String str13 = c22117.f71811;
            int i3 = c22117.f71809;
            byte[] bArr = c22117.f71806;
            int i4 = c22117.f71807;
            C17884 c17884 = c22117.f71805;
            if (j < 0 || j > 9007199254740991L) {
                j = -1;
            }
            String str14 = "hex";
            JSONObject jSONObjectAdd = C7416.m19939("workspaceId", str13, "editSessionId", str12).add("locator", C13169.m31926(c17884)).add("name", c17884.m41856()).add("maxBytes", i4).add(e.m, JSON.object().add("hex", C13573.m32618(bArr)).add("byteOffset", i3).add("nextByteOffset", ((long) i3) + ((long) bArr.length)).add("totalBytes", j)).add("nextActions", JSON.array());
            if (c22117.f71810) {
                str8 = "nextByteOffset";
                str14 = str14;
                str9 = "byteOffset";
                String strM43398 = C18747.m43398("read", c22117.f71811, str12, i, JSON.object().add("target", C13169.m31926(c17884)).add("format", str14).add("recommendedLimit", i4).add("limitMax", 65536), JSON.object().add("hexOffset", c22117.f71812));
                str10 = "pagination";
                jSONObjectAdd.add(str10, m8193(strM43398, true));
                jSONObjectAdd.getJSONArray("nextActions").add(C10115.m25398(C13169.m31915(str13, i4, str12, strM43398), "mt_apk_continue", "continue", "Continue reading next hex byte page"));
                str11 = null;
            } else {
                str8 = "nextByteOffset";
                str9 = "byteOffset";
                str10 = "pagination";
                jSONObjectAdd.add(str10, m8193((String) null, false));
                str11 = null;
            }
            JSONObject jSONObjectAdd2 = JSON.object().add("workspaceId", jSONObjectAdd.getString("workspaceId", str11)).add("editSessionId", jSONObjectAdd.getString("editSessionId", "")).add("locator", C0899.m3254(jSONObjectAdd.get(r8))).add("name", jSONObjectAdd.getString("name", str11)).add("maxBytes", jSONObjectAdd.get("maxBytes") == null ? JSON.NULL : jSONObjectAdd.get("maxBytes"));
            JSONObject jSONObject = jSONObjectAdd.getJSONObject(e.m);
            if (jSONObject == null) {
                jSONValueAdd2 = JSON.NULL;
            } else {
                String str15 = str14;
                String str16 = str9;
                String str17 = str8;
                jSONValueAdd2 = JSON.object().add(str15, jSONObject.getString(str15, "")).add(str16, jSONObject.get(str16) == null ? JSON.NULL : jSONObject.get(str16)).add(str17, jSONObject.getLong(str17, 0L)).add("totalBytes", jSONObject.getLong("totalBytes", -1L));
            }
            jSONObjectM46095 = C19993.m46095(jSONObjectAdd2.add("byteWindow", jSONValueAdd2).add(str10, jSONObjectAdd.getJSONObject(str10)), jSONObjectAdd.getJSONArray("nextActions"));
        } else {
            C9832 c9832 = (C9832) abstractC2821M45516;
            C1107 c1107 = c9832.f29707;
            int i5 = c9832.f29712;
            String str18 = c9832.f29706;
            Integer num = c9832.f29708;
            C17884 c17885 = c9832.f29713;
            String strM31926 = C13169.m31926(c17885);
            JSONObject jSONObjectObject = JSON.object();
            String str19 = c1107.f4031;
            boolean z = c1107.f4029;
            JSONObject jSONObjectAdd3 = jSONObjectObject.add(TextBundle.TEXT_ENTRY, str19);
            int i6 = c1107.f4034;
            JSONObject jSONObjectAdd4 = jSONObjectAdd3.add("startLine", i6).add("startColumn", c1107.f4033);
            int i7 = c1107.f4036;
            JSONObject jSONObjectAdd5 = jSONObjectAdd4.add("nextLine", i7).add("nextColumn", c1107.f4037).add("returnedLineCount", c1107.f4035);
            String str20 = c1107.f4031;
            JSONObject jSONObjectAdd6 = jSONObjectAdd5.add("returnedCodePoints", str20.codePointCount(0, str20.length()));
            boolean z2 = c9832.f29714;
            JSONObject jSONObjectAdd7 = jSONObjectAdd6.add("totalLineCount", z2 ? -1 : c1107.f4032).add("lineTruncated", c1107.f4039);
            if (num != null) {
                jSONObjectAdd7.add("absoluteStartLine", num.intValue() + i6).add("absoluteEndLine", num.intValue() + i7);
            }
            JSONObject jSONObjectAdd8 = C7416.m19939("workspaceId", str18, "editSessionId", str12).add("locator", strM31926).add("name", c17885.m41856()).add("textSourceKind", c9832.f29709).add("targetVersion", c9832.f29710).add("truncated", z || z2).add("limit", i5).add(e.m, jSONObjectAdd7).add("nextActions", JSON.array());
            String str21 = c9832.f29705;
            if (str21 != null) {
                jSONObjectAdd8.add("truncatedReason", str21);
            } else if (z) {
                jSONObjectAdd8.add("truncatedReason", "window");
            }
            if (!z || c1107.f4038 == null) {
                str = "limit";
                str2 = "truncated";
                str3 = "pagination";
                str4 = TextBundle.TEXT_ENTRY;
                str5 = "";
                str6 = "truncatedReason";
                jSONObjectAdd8.add(str3, m8193((String) null, false));
                str7 = null;
            } else {
                String str22 = c9832.f29706;
                str = "limit";
                JSONObject jSONObjectAdd9 = JSON.object().add("target", C13169.m31926(c17885)).add("format", TextBundle.TEXT_ENTRY).add("recommendedLimit", i5).add("limitMax", 2000).add("maxChars", c9832.f29711);
                JSONObject jSONObjectAdd10 = JSON.object().add("lineOffset", c1107.f4038.intValue());
                Integer num2 = c1107.f4030;
                JSONObject jSONObjectAdd11 = jSONObjectAdd10.add("lineCharOffset", num2 == null ? 0 : num2.intValue());
                str6 = "truncatedReason";
                str2 = "truncated";
                str5 = "";
                str4 = TextBundle.TEXT_ENTRY;
                str3 = "pagination";
                String strM43399 = C18747.m43398("read", str22, str12, i, jSONObjectAdd9, jSONObjectAdd11);
                jSONObjectAdd8.add(str3, m8193(strM43399, true));
                jSONObjectAdd8.getJSONArray("nextActions").add(C10115.m25398(C13169.m31915(str18, i5, str12, strM43399), "mt_apk_continue", "continue", "Continue reading next page"));
                str7 = null;
            }
            String str23 = str;
            String str24 = str2;
            JSONObject jSONObjectAdd12 = JSON.object().add("workspaceId", jSONObjectAdd8.getString("workspaceId", str7)).add("editSessionId", jSONObjectAdd8.getString("editSessionId", str5)).add("locator", C0899.m3254(jSONObjectAdd8.get("locator"))).add("name", jSONObjectAdd8.getString("name", str7)).add("textSourceKind", jSONObjectAdd8.getString("textSourceKind", str7)).add("targetVersion", jSONObjectAdd8.getString("targetVersion", str7)).add(str23, jSONObjectAdd8.get(str23) == null ? JSON.NULL : jSONObjectAdd8.get(str23)).add(str24, jSONObjectAdd8.getBoolean(str24, false));
            String str25 = str6;
            JSONObject jSONObjectAdd13 = jSONObjectAdd12.add(str25, jSONObjectAdd8.getString(str25, str7));
            JSONObject jSONObject2 = jSONObjectAdd8.getJSONObject(e.m);
            if (jSONObject2 == null) {
                jSONValueAdd = JSON.NULL;
            } else {
                String str26 = str4;
                jSONValueAdd = JSON.object().add(str26, jSONObject2.getString(str26, str5)).add("startLine", jSONObject2.getInt("startLine", 0)).add("startColumn", jSONObject2.getInt("startColumn", 0)).add("nextLine", jSONObject2.getInt("nextLine", 0)).add("nextColumn", jSONObject2.getInt("nextColumn", 0)).add("returnedLineCount", jSONObject2.getInt("returnedLineCount", 0)).add("returnedCodePoints", jSONObject2.getInt("returnedCodePoints", 0)).add("totalLineCount", jSONObject2.getInt("totalLineCount", -1)).add("lineTruncated", jSONObject2.getBoolean("lineTruncated", false)).add("absoluteStartLine", C0899.m3255(jSONObject2.get("absoluteStartLine"))).add("absoluteEndLine", C0899.m3255(jSONObject2.get("absoluteEndLine")));
            }
            jSONObjectM46095 = C19993.m46095(jSONObjectAdd13.add("textWindow", jSONValueAdd).add(str3, jSONObjectAdd8.getJSONObject(str3)), jSONObjectAdd8.getJSONArray("nextActions"));
        }
        return new C12936(jSONObjectM46095);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:171:0x03e0  */
    /* JADX WARN: Code duplicated, block: B:172:0x03e3  */
    /* JADX WARN: Code duplicated, block: B:80:0x01af  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C12936 m8199(C16472 c16472) {
        String str;
        C11159 c11159;
        byte b;
        JSONObject jSONObject;
        C11159 c111510;
        JSONValue jSONValueValue;
        Object obj;
        String str2;
        Object obj2;
        Object obj3;
        byte b2;
        String str3;
        JSONValue jSONValueValue2;
        Integer num;
        JSONValue jSONValueValue3;
        JSONObject jSONObjectAdd;
        JSONArray jSONArray;
        JSONValue jSONValueValue4;
        C19793 c19793 = this.f8183;
        C13649 c13649M45526 = c19793.m45526(c16472);
        int i = C8869.f27007;
        String str4 = c16472.f50627;
        JSONArray jSONArrayArray = JSON.array();
        Iterator it = c13649M45526.f40716.iterator();
        while (true) {
            str = "locator";
            if (!it.hasNext()) {
                break;
            }
            C16886 c16886 = (C16886) it.next();
            jSONArrayArray.add(JSON.object().add("locator", m8195(c16886.f51820)).add("variants", C0899.m3247(c16886.f51821)));
        }
        JSONArray jSONArrayArray2 = JSON.array();
        Iterator it2 = c13649M45526.f40714.iterator();
        while (it2.hasNext()) {
            C22822 c22822 = (C22822) it2.next();
            String str5 = c22822.f73684;
            String str6 = c22822.f73690;
            String str7 = c22822.f73688;
            int i2 = c22822.f73685;
            C13232 c13232 = c22822.f73687;
            Iterator it3 = it2;
            C19793 c19794 = c19793;
            if (str5 != null) {
                jSONObjectAdd = JSON.object().add("index", i2).add(str, m8195(str7)).add("variant", str6).add("errorCode", str5).add("message", c22822.f73689);
                if (!"RESOURCE_NOT_FOUND".equals(str5)) {
                    if ("RESOURCE_VARIANT_NOT_FOUND".equals(str5) && c13232 != null) {
                        jSONObjectAdd = jSONObjectAdd.add("type", c13232.f39606).add("name", c13232.f39605);
                    } else {
                        throw new IllegalStateException("Unsupported resource read error: ".concat(str5));
                    }
                }
                jSONArray = jSONArrayArray2;
            } else {
                if (c13232 == null || (c11159 = c22822.f73686) == null) {
                    throw new IllegalStateException("Missing successful resource read value");
                }
                JSONObject jSONObjectAdd2 = JSON.object().add("index", i2).add(str, m8195(str7)).add("variant", str6).add("type", c13232.f39606).add("name", c13232.f39605);
                String str8 = c11159.f33502;
                boolean z = c11159.f33490;
                String str9 = c11159.f33491;
                JSONObject jSONObjectAdd3 = jSONObjectAdd2.add("valueKind", str8);
                JSONArray jSONArray2 = jSONArrayArray2;
                String str10 = "valueKind";
                switch (str8) {
                    case "item_list":
                        b = 0;
                        break;
                    case "null_value":
                        b = 1;
                        break;
                    case "fraction":
                        b = 2;
                        break;
                    case "file_path":
                        b = 3;
                        break;
                    case "dimension":
                        b = 4;
                        break;
                    case "number":
                        b = 5;
                        break;
                    case "reference":
                        b = 6;
                        break;
                    case "unparsed":
                        b = 7;
                        break;
                    case "text":
                        b = 8;
                        break;
                    case "attribute":
                        b = 9;
                        break;
                    case "boolean":
                        b = 10;
                        break;
                    case "color":
                        b = 11;
                        break;
                    case "styled_text":
                        b = 12;
                        break;
                    default:
                        b = -1;
                        break;
                }
                String str11 = "zip_entry";
                Object obj4 = "null_value";
                String str12 = "fileLocator";
                Object obj5 = "fraction";
                Object obj6 = "file_path";
                Object obj7 = "dimension";
                Object obj8 = "number";
                switch (b) {
                    case 0:
                        ArrayList arrayList = c11159.f33501;
                        JSONArray jSONArrayArray3 = JSON.array();
                        Iterator it4 = arrayList.iterator();
                        while (it4.hasNext()) {
                            C11159 c111511 = (C11159) it4.next();
                            Iterator it5 = it4;
                            JSONObject jSONObjectObject = JSON.object();
                            C11159 c111512 = c11159;
                            String str13 = c111511.f33497;
                            JSONObject jSONObject2 = jSONObjectAdd3;
                            boolean z2 = c111511.f33490;
                            JSONArray jSONArray3 = jSONArrayArray3;
                            String str14 = c111511.f33491;
                            String str15 = str12;
                            String str16 = c111511.f33502;
                            String str17 = str11;
                            JSONObject jSONObjectAdd4 = jSONObjectObject.add("key", str13);
                            String str18 = c111511.f33505;
                            if (str18 == null) {
                                jSONValueValue = JSON.NULL;
                            } else {
                                jSONValueValue = JSON.value(m8195(str18));
                            }
                            JSONObject jSONObjectAdd5 = jSONObjectAdd4.add("keyLocator", jSONValueValue);
                            String str19 = str10;
                            JSONObject jSONObjectAdd6 = jSONObjectAdd5.add(str19, str16);
                            switch (str16.hashCode()) {
                                case -2017576775:
                                    obj = obj8;
                                    str2 = str19;
                                    obj2 = obj4;
                                    b2 = !str16.equals(obj2) ? (byte) -1 : (byte) 0;
                                    break;
                                case -1653751294:
                                    obj = obj8;
                                    str2 = str19;
                                    obj3 = obj5;
                                    if (str16.equals(obj3)) {
                                        b2 = 1;
                                        obj5 = obj3;
                                        obj2 = obj4;
                                    }
                                    obj5 = obj3;
                                    obj2 = obj4;
                                    break;
                                case -1316408056:
                                    obj = obj8;
                                    str2 = str19;
                                    Object obj9 = obj6;
                                    if (!str16.equals(obj9)) {
                                        obj6 = obj9;
                                        obj3 = obj5;
                                        obj5 = obj3;
                                        obj2 = obj4;
                                    } else {
                                        b2 = 2;
                                        obj6 = obj9;
                                        obj2 = obj4;
                                    }
                                    break;
                                case -1095013018:
                                    obj = obj8;
                                    str2 = str19;
                                    Object obj10 = obj7;
                                    if (!str16.equals(obj10)) {
                                        obj7 = obj10;
                                        obj3 = obj5;
                                        obj5 = obj3;
                                        obj2 = obj4;
                                    } else {
                                        b2 = 3;
                                        obj7 = obj10;
                                        obj2 = obj4;
                                    }
                                    break;
                                case -1034364087:
                                    obj = obj8;
                                    if (!str16.equals(obj)) {
                                        str2 = str19;
                                        obj3 = obj5;
                                        obj5 = obj3;
                                        obj2 = obj4;
                                    } else {
                                        b2 = 4;
                                        str2 = str19;
                                        obj2 = obj4;
                                    }
                                    break;
                                case -925155509:
                                    if (str16.equals(Name.REFER)) {
                                        obj = obj8;
                                        b2 = 5;
                                        str2 = str19;
                                        obj2 = obj4;
                                    }
                                    obj = obj8;
                                    str2 = str19;
                                    obj2 = obj4;
                                    break;
                                case -108907542:
                                    if (str16.equals("unparsed")) {
                                        obj = obj8;
                                        b2 = 6;
                                        str2 = str19;
                                        obj2 = obj4;
                                    }
                                    obj = obj8;
                                    str2 = str19;
                                    obj2 = obj4;
                                    break;
                                case 3556653:
                                    if (str16.equals(TextBundle.TEXT_ENTRY)) {
                                        obj = obj8;
                                        b2 = 7;
                                        str2 = str19;
                                        obj2 = obj4;
                                    }
                                    obj = obj8;
                                    str2 = str19;
                                    obj2 = obj4;
                                    break;
                                case 13085340:
                                    if (str16.equals(AnnotationHandler.ATTRIBUTE)) {
                                        obj = obj8;
                                        b2 = 8;
                                        str2 = str19;
                                        obj2 = obj4;
                                    }
                                    obj = obj8;
                                    str2 = str19;
                                    obj2 = obj4;
                                    break;
                                case 64711720:
                                    if (str16.equals(ClassTransform.BOOLEAN)) {
                                        obj = obj8;
                                        b2 = 9;
                                        str2 = str19;
                                        obj2 = obj4;
                                    }
                                    obj = obj8;
                                    str2 = str19;
                                    obj2 = obj4;
                                    break;
                                case 94842723:
                                    if (str16.equals(ColorResourcesTableCreator.RESOURCE_TYPE_NAME_COLOR)) {
                                        obj = obj8;
                                        b2 = 10;
                                        str2 = str19;
                                        obj2 = obj4;
                                    }
                                    obj = obj8;
                                    str2 = str19;
                                    obj2 = obj4;
                                    break;
                                case 172355865:
                                    if (str16.equals("styled_text")) {
                                        obj = obj8;
                                        b2 = 11;
                                        str2 = str19;
                                        obj2 = obj4;
                                    }
                                    obj = obj8;
                                    str2 = str19;
                                    obj2 = obj4;
                                    break;
                                default:
                                    obj = obj8;
                                    str2 = str19;
                                    obj2 = obj4;
                                    break;
                            }
                            switch (b2) {
                                case 0:
                                case 1:
                                case 3:
                                case 4:
                                case 6:
                                case 7:
                                case 9:
                                case 10:
                                case 11:
                                    str12 = str15;
                                    str3 = str17;
                                    jSONObjectAdd6.add(b.d, str14).add("valueTruncated", z2);
                                    jSONArray3.add(jSONObjectAdd6);
                                    jSONArrayArray3 = jSONArray3;
                                    obj4 = obj2;
                                    str11 = str3;
                                    str10 = str2;
                                    c11159 = c111512;
                                    jSONObjectAdd3 = jSONObject2;
                                    obj8 = obj;
                                    it4 = it5;
                                    break;
                                case 2:
                                    JSONObject jSONObjectAdd7 = jSONObjectAdd6.add(b.d, str14).add("valueTruncated", z2);
                                    String str20 = c111511.f33499;
                                    str3 = str17;
                                    str12 = str15;
                                    jSONObjectAdd7.add(str12, C13169.m31973(str3, str20));
                                    jSONArray3.add(jSONObjectAdd6);
                                    jSONArrayArray3 = jSONArray3;
                                    obj4 = obj2;
                                    str11 = str3;
                                    str10 = str2;
                                    c11159 = c111512;
                                    jSONObjectAdd3 = jSONObject2;
                                    obj8 = obj;
                                    it4 = it5;
                                    break;
                                case 5:
                                case 8:
                                    JSONObject jSONObjectAdd8 = jSONObjectAdd6.add(b.d, str14).add("valueTruncated", z2);
                                    String str21 = c111511.f33495;
                                    if (str21 == null) {
                                        jSONValueValue2 = JSON.NULL;
                                    } else {
                                        jSONValueValue2 = JSON.value(m8195(str21));
                                    }
                                    jSONObjectAdd8.add("targetLocator", jSONValueValue2).add("resolvedTarget", m8194(c111511.f33493));
                                    str12 = str15;
                                    str3 = str17;
                                    jSONArray3.add(jSONObjectAdd6);
                                    jSONArrayArray3 = jSONArray3;
                                    obj4 = obj2;
                                    str11 = str3;
                                    str10 = str2;
                                    c11159 = c111512;
                                    jSONObjectAdd3 = jSONObject2;
                                    obj8 = obj;
                                    it4 = it5;
                                    break;
                                default:
                                    throw new IllegalStateException("Unsupported resource child value kind: ".concat(str16));
                            }
                        }
                        jSONObject = jSONObjectAdd3;
                        c111510 = c11159;
                        jSONObject.add("items", jSONArrayArray3).add("itemsTruncated", c111510.f33500).add("totalItemCount", c111510.f33498);
                        JSONObject jSONObjectAdd9 = jSONObject.add("targetVersion", c111510.f33494).add("valueXml", c111510.f33503);
                        num = c111510.f33487;
                        if (num == null) {
                            jSONValueValue3 = JSON.NULL;
                        } else {
                            jSONValueValue3 = JSON.value(num.intValue());
                        }
                        jSONObjectAdd = jSONObjectAdd9.add("valueXmlCharCount", jSONValueValue3).add("valueXmlTruncated", c111510.f33492).add("editable", c111510.f33489).add("editableReason", c111510.f33496);
                        jSONArray = jSONArray2;
                        break;
                    case 1:
                    case 2:
                    case 4:
                    case 5:
                    case 7:
                    case 8:
                    case 10:
                    case 11:
                    case 12:
                        jSONObjectAdd3.add(b.d, str9).add("valueTruncated", z);
                        jSONObject = jSONObjectAdd3;
                        c111510 = c11159;
                        JSONObject jSONObjectAdd10 = jSONObject.add("targetVersion", c111510.f33494).add("valueXml", c111510.f33503);
                        num = c111510.f33487;
                        if (num == null) {
                            jSONValueValue3 = JSON.NULL;
                        } else {
                            jSONValueValue3 = JSON.value(num.intValue());
                        }
                        jSONObjectAdd = jSONObjectAdd10.add("valueXmlCharCount", jSONValueValue3).add("valueXmlTruncated", c111510.f33492).add("editable", c111510.f33489).add("editableReason", c111510.f33496);
                        jSONArray = jSONArray2;
                        break;
                    case 3:
                        jSONObjectAdd3.add(b.d, str9).add("valueTruncated", z).add("fileLocator", C13169.m31973("zip_entry", c11159.f33499));
                        jSONObject = jSONObjectAdd3;
                        c111510 = c11159;
                        JSONObject jSONObjectAdd11 = jSONObject.add("targetVersion", c111510.f33494).add("valueXml", c111510.f33503);
                        num = c111510.f33487;
                        if (num == null) {
                            jSONValueValue3 = JSON.NULL;
                        } else {
                            jSONValueValue3 = JSON.value(num.intValue());
                        }
                        jSONObjectAdd = jSONObjectAdd11.add("valueXmlCharCount", jSONValueValue3).add("valueXmlTruncated", c111510.f33492).add("editable", c111510.f33489).add("editableReason", c111510.f33496);
                        jSONArray = jSONArray2;
                        break;
                    case 6:
                    case 9:
                        JSONObject jSONObjectAdd12 = jSONObjectAdd3.add(b.d, str9).add("valueTruncated", z);
                        String str22 = c11159.f33495;
                        if (str22 == null) {
                            jSONValueValue4 = JSON.NULL;
                        } else {
                            jSONValueValue4 = JSON.value(m8195(str22));
                        }
                        jSONObjectAdd12.add("targetLocator", jSONValueValue4).add("resolvedTarget", m8194(c11159.f33493));
                        jSONObject = jSONObjectAdd3;
                        c111510 = c11159;
                        JSONObject jSONObjectAdd13 = jSONObject.add("targetVersion", c111510.f33494).add("valueXml", c111510.f33503);
                        num = c111510.f33487;
                        if (num == null) {
                            jSONValueValue3 = JSON.NULL;
                        } else {
                            jSONValueValue3 = JSON.value(num.intValue());
                        }
                        jSONObjectAdd = jSONObjectAdd13.add("valueXmlCharCount", jSONValueValue3).add("valueXmlTruncated", c111510.f33492).add("editable", c111510.f33489).add("editableReason", c111510.f33496);
                        jSONArray = jSONArray2;
                        break;
                    default:
                        throw new IllegalStateException("Unsupported resource value kind: ".concat(str8));
                }
            }
            jSONArray.add(jSONObjectAdd);
            jSONArrayArray2 = jSONArray;
            it2 = it3;
            c19793 = c19794;
            str = str;
            jSONArrayArray = jSONArrayArray;
            str4 = str4;
            c13649M45526 = c13649M45526;
        }
        JSONObject jSONObjectM18504 = C6820.m18504(JSON.object().add("workspaceId", c13649M45526.f40715).add("editSessionId", str4).add("resourceNamePolicy", c13649M45526.f40713.m37986()).add("variantSets", jSONArrayArray).add("results", jSONArrayArray2).add("nextActions", JSON.array()));
        c19793.m45533(c16472.f50633);
        return new C12936(jSONObjectM18504);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C12936 m8198(C2519 c2519, JSONObject jSONObject, C15923 c15923) throws C3059 {
        C1656 c1656M31977 = C13169.m31977(jSONObject.getString("workspaceId", null), jSONObject.getString("editSessionId", ""), c2519, jSONObject);
        String string = jSONObject.getString("nextCursor", null);
        String str = c1656M31977.f5788;
        String str2 = c1656M31977.f5782;
        C15991 c15991 = new C15991(this, c1656M31977, c15923);
        C19793 c19793 = this.f8183;
        C12936 c12936 = (C12936) c19793.m45511(str, str2, string, c15991);
        c19793.m45533(str);
        return c12936;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static JSONObject m8193(String str, boolean z) {
        return JSON.object().add("hasMore", z).add("nextCursor", str);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m8195(String str) {
        return C13169.m31925("resource", (String) null, (String) null, (String) null, (String) null, str.toLowerCase(Locale.ROOT));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static JSONValue m8194(C13937 c13937) {
        if (c13937 == null) {
            return JSON.NULL;
        }
        return JSON.object().add("locator", m8195(c13937.f41614)).add("missing", c13937.f41616).add("type", c13937.f41619).add("name", c13937.f41618).add("variant", c13937.f41615).add("valueKind", c13937.f41617).add("valueSnippet", c13937.f41621).add("valueTruncated", c13937.f41620);
    }
}
