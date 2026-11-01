package p067l;

import bin.p000mt.json.JSON;
import bin.p000mt.json.JSONArray;
import bin.p000mt.json.JSONObject;
import bin.p000mt.json.JSONValue;
import com.alipay.sdk.p010m.p049t.AbstractC0213e;
import com.alipay.sdk.p010m.p052u0.C0226b;
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
public final class C4827 {

    /* JADX INFO: renamed from: ֫ */
    public final C21180 f10975;

    public C4827(C21180 c21180) {
        this.f10975 = c21180;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C14663 m10236(C3942 c3942, C17502 c17502) {
        String str = c3942.f8568;
        String str2 = c3942.f8562;
        C17566 c17566 = new C17566(this, c3942, c17502);
        C21180 c21180 = this.f10975;
        C14663 c14663 = (C14663) c21180.m47822(str, str2, (String) null, c17566);
        c21180.m47844(str);
        return c14663;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C14663 m10235(C4827 c4827, C3942 c3942, C17502 c17502, int i) throws C5276 {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        JSONValue jSONValueAdd;
        JSONObject jSONObjectM48410;
        String str8;
        String str9;
        String str10;
        String str11;
        JSONValue jSONValueAdd2;
        AbstractC5050 abstractC5050M47827 = c4827.f10975.m47827(c3942, c17502);
        int i2 = C10798.f29931;
        String str12 = c3942.f8562;
        if (abstractC5050M47827 instanceof C13054) {
            throw C5276.m11410("UNSUPPORTED_RESOURCE_READ", "Resource reads must use mt_apk_resource_read batch arguments.");
        }
        if (abstractC5050M47827 instanceof C23388) {
            C23388 c23388 = (C23388) abstractC5050M47827;
            long j = c23388.f74530;
            String str13 = c23388.f74533;
            int i3 = c23388.f74531;
            byte[] bArr = c23388.f74528;
            int i4 = c23388.f74529;
            C19365 c19365 = c23388.f74527;
            if (j < 0 || j > 9007199254740991L) {
                j = -1;
            }
            String str14 = "hex";
            JSONObject jSONObjectAdd = C9417.m21913("workspaceId", str13, "editSessionId", str12).add("locator", C14884.m34022(c19365)).add("name", c19365.m44103()).add("maxBytes", i4).add(AbstractC0213e.f989m, JSON.object().add("hex", C15268.m34730(bArr)).add("byteOffset", i3).add("nextByteOffset", ((long) i3) + ((long) bArr.length)).add("totalBytes", j)).add("nextActions", JSON.array());
            if (c23388.f74532) {
                str8 = "nextByteOffset";
                str14 = str14;
                str9 = "byteOffset";
                String strM45665 = C20186.m45665("read", c23388.f74533, str12, i, JSON.object().add("target", C14884.m34022(c19365)).add("format", str14).add("recommendedLimit", i4).add("limitMax", 65536), JSON.object().add("hexOffset", c23388.f74534));
                str10 = "pagination";
                jSONObjectAdd.add(str10, m10232(strM45665, true));
                jSONObjectAdd.getJSONArray("nextActions").add(C11982.m27418(C14884.m34011(str13, i4, str12, strM45665), "mt_apk_continue", "continue", "Continue reading next hex byte page"));
                str11 = null;
            } else {
                str8 = "nextByteOffset";
                str9 = "byteOffset";
                str10 = "pagination";
                jSONObjectAdd.add(str10, m10232((String) null, false));
                str11 = null;
            }
            JSONObject jSONObjectAdd2 = JSON.object().add("workspaceId", jSONObjectAdd.getString("workspaceId", str11)).add("editSessionId", jSONObjectAdd.getString("editSessionId", "")).add("locator", C3223.m5573(jSONObjectAdd.get(r8))).add("name", jSONObjectAdd.getString("name", str11)).add("maxBytes", jSONObjectAdd.get("maxBytes") == null ? JSON.NULL : jSONObjectAdd.get("maxBytes"));
            JSONObject jSONObject = jSONObjectAdd.getJSONObject(AbstractC0213e.f989m);
            if (jSONObject == null) {
                jSONValueAdd2 = JSON.NULL;
            } else {
                String str15 = str14;
                String str16 = str9;
                String str17 = str8;
                jSONValueAdd2 = JSON.object().add(str15, jSONObject.getString(str15, "")).add(str16, jSONObject.get(str16) == null ? JSON.NULL : jSONObject.get(str16)).add(str17, jSONObject.getLong(str17, 0L)).add("totalBytes", jSONObject.getLong("totalBytes", -1L));
            }
            jSONObjectM48410 = C21370.m48410(jSONObjectAdd2.add("byteWindow", jSONValueAdd2).add(str10, jSONObjectAdd.getJSONObject(str10)), jSONObjectAdd.getJSONArray("nextActions"));
        } else {
            C11713 c11713 = (C11713) abstractC5050M47827;
            C3421 c3421 = c11713.f32660;
            int i5 = c11713.f32665;
            String str18 = c11713.f32659;
            Integer num = c11713.f32661;
            C19365 c19366 = c11713.f32666;
            String strM34022 = C14884.m34022(c19366);
            JSONObject jSONObjectObject = JSON.object();
            String str19 = c3421.f6803;
            boolean z = c3421.f6801;
            JSONObject jSONObjectAdd3 = jSONObjectObject.add(TextBundle.TEXT_ENTRY, str19);
            int i6 = c3421.f6806;
            JSONObject jSONObjectAdd4 = jSONObjectAdd3.add("startLine", i6).add("startColumn", c3421.f6805);
            int i7 = c3421.f6808;
            JSONObject jSONObjectAdd5 = jSONObjectAdd4.add("nextLine", i7).add("nextColumn", c3421.f6809).add("returnedLineCount", c3421.f6807);
            String str20 = c3421.f6803;
            JSONObject jSONObjectAdd6 = jSONObjectAdd5.add("returnedCodePoints", str20.codePointCount(0, str20.length()));
            boolean z2 = c11713.f32667;
            JSONObject jSONObjectAdd7 = jSONObjectAdd6.add("totalLineCount", z2 ? -1 : c3421.f6804).add("lineTruncated", c3421.f6811);
            if (num != null) {
                jSONObjectAdd7.add("absoluteStartLine", num.intValue() + i6).add("absoluteEndLine", num.intValue() + i7);
            }
            JSONObject jSONObjectAdd8 = C9417.m21913("workspaceId", str18, "editSessionId", str12).add("locator", strM34022).add("name", c19366.m44103()).add("textSourceKind", c11713.f32662).add("targetVersion", c11713.f32663).add("truncated", z || z2).add("limit", i5).add(AbstractC0213e.f989m, jSONObjectAdd7).add("nextActions", JSON.array());
            String str21 = c11713.f32658;
            if (str21 != null) {
                jSONObjectAdd8.add("truncatedReason", str21);
            } else if (z) {
                jSONObjectAdd8.add("truncatedReason", "window");
            }
            if (!z || c3421.f6810 == null) {
                str = "limit";
                str2 = "truncated";
                str3 = "pagination";
                str4 = TextBundle.TEXT_ENTRY;
                str5 = "";
                str6 = "truncatedReason";
                jSONObjectAdd8.add(str3, m10232((String) null, false));
                str7 = null;
            } else {
                String str22 = c11713.f32659;
                str = "limit";
                JSONObject jSONObjectAdd9 = JSON.object().add("target", C14884.m34022(c19366)).add("format", TextBundle.TEXT_ENTRY).add("recommendedLimit", i5).add("limitMax", 2000).add("maxChars", c11713.f32664);
                JSONObject jSONObjectAdd10 = JSON.object().add("lineOffset", c3421.f6810.intValue());
                Integer num2 = c3421.f6802;
                JSONObject jSONObjectAdd11 = jSONObjectAdd10.add("lineCharOffset", num2 == null ? 0 : num2.intValue());
                str6 = "truncatedReason";
                str2 = "truncated";
                str5 = "";
                str4 = TextBundle.TEXT_ENTRY;
                str3 = "pagination";
                String strM45666 = C20186.m45665("read", str22, str12, i, jSONObjectAdd9, jSONObjectAdd11);
                jSONObjectAdd8.add(str3, m10232(strM45666, true));
                jSONObjectAdd8.getJSONArray("nextActions").add(C11982.m27418(C14884.m34011(str18, i5, str12, strM45666), "mt_apk_continue", "continue", "Continue reading next page"));
                str7 = null;
            }
            String str23 = str;
            String str24 = str2;
            JSONObject jSONObjectAdd12 = JSON.object().add("workspaceId", jSONObjectAdd8.getString("workspaceId", str7)).add("editSessionId", jSONObjectAdd8.getString("editSessionId", str5)).add("locator", C3223.m5573(jSONObjectAdd8.get("locator"))).add("name", jSONObjectAdd8.getString("name", str7)).add("textSourceKind", jSONObjectAdd8.getString("textSourceKind", str7)).add("targetVersion", jSONObjectAdd8.getString("targetVersion", str7)).add(str23, jSONObjectAdd8.get(str23) == null ? JSON.NULL : jSONObjectAdd8.get(str23)).add(str24, jSONObjectAdd8.getBoolean(str24, false));
            String str25 = str6;
            JSONObject jSONObjectAdd13 = jSONObjectAdd12.add(str25, jSONObjectAdd8.getString(str25, str7));
            JSONObject jSONObject2 = jSONObjectAdd8.getJSONObject(AbstractC0213e.f989m);
            if (jSONObject2 == null) {
                jSONValueAdd = JSON.NULL;
            } else {
                String str26 = str4;
                jSONValueAdd = JSON.object().add(str26, jSONObject2.getString(str26, str5)).add("startLine", jSONObject2.getInt("startLine", 0)).add("startColumn", jSONObject2.getInt("startColumn", 0)).add("nextLine", jSONObject2.getInt("nextLine", 0)).add("nextColumn", jSONObject2.getInt("nextColumn", 0)).add("returnedLineCount", jSONObject2.getInt("returnedLineCount", 0)).add("returnedCodePoints", jSONObject2.getInt("returnedCodePoints", 0)).add("totalLineCount", jSONObject2.getInt("totalLineCount", -1)).add("lineTruncated", jSONObject2.getBoolean("lineTruncated", false)).add("absoluteStartLine", C3223.m5574(jSONObject2.get("absoluteStartLine"))).add("absoluteEndLine", C3223.m5574(jSONObject2.get("absoluteEndLine")));
            }
            jSONObjectM48410 = C21370.m48410(jSONObjectAdd13.add("textWindow", jSONValueAdd).add(str3, jSONObjectAdd8.getJSONObject(str3)), jSONObjectAdd8.getJSONArray("nextActions"));
        }
        return new C14663(jSONObjectM48410);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:171:0x03e0  */
    /* JADX WARN: Code duplicated, block: B:172:0x03e3  */
    /* JADX WARN: Code duplicated, block: B:80:0x01af  */
    /* JADX INFO: renamed from: ֫ */
    public final C14663 m10238(C18023 c18023) {
        String str;
        C12974 c12974;
        byte b;
        JSONObject jSONObject;
        C12974 c12975;
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
        C21180 c21180 = this.f10975;
        C15340 c15340M47837 = c21180.m47837(c18023);
        int i = C10798.f29931;
        String str4 = c18023.f53805;
        JSONArray jSONArrayArray = JSON.array();
        Iterator it = c15340M47837.f43797.iterator();
        while (true) {
            str = "locator";
            if (!it.hasNext()) {
                break;
            }
            C18417 c18417 = (C18417) it.next();
            jSONArrayArray.add(JSON.object().add("locator", m10234(c18417.f55001)).add("variants", C3223.m5566(c18417.f55002)));
        }
        JSONArray jSONArrayArray2 = JSON.array();
        Iterator it2 = c15340M47837.f43795.iterator();
        while (it2.hasNext()) {
            C24058 c24058 = (C24058) it2.next();
            String str5 = c24058.f76416;
            String str6 = c24058.f76422;
            String str7 = c24058.f76420;
            int i2 = c24058.f76417;
            C14944 c14944 = c24058.f76419;
            Iterator it3 = it2;
            C21180 c21181 = c21180;
            if (str5 != null) {
                jSONObjectAdd = JSON.object().add("index", i2).add(str, m10234(str7)).add("variant", str6).add("errorCode", str5).add("message", c24058.f76421);
                if (!"RESOURCE_NOT_FOUND".equals(str5)) {
                    if ("RESOURCE_VARIANT_NOT_FOUND".equals(str5) && c14944 != null) {
                        jSONObjectAdd = jSONObjectAdd.add("type", c14944.f42670).add("name", c14944.f42669);
                    } else {
                        throw new IllegalStateException("Unsupported resource read error: ".concat(str5));
                    }
                }
                jSONArray = jSONArrayArray2;
            } else {
                if (c14944 == null || (c12974 = c24058.f76418) == null) {
                    throw new IllegalStateException("Missing successful resource read value");
                }
                JSONObject jSONObjectAdd2 = JSON.object().add("index", i2).add(str, m10234(str7)).add("variant", str6).add("type", c14944.f42670).add("name", c14944.f42669);
                String str8 = c12974.f36502;
                boolean z = c12974.f36490;
                String str9 = c12974.f36491;
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
                        ArrayList arrayList = c12974.f36501;
                        JSONArray jSONArrayArray3 = JSON.array();
                        Iterator it4 = arrayList.iterator();
                        while (it4.hasNext()) {
                            C12974 c12976 = (C12974) it4.next();
                            Iterator it5 = it4;
                            JSONObject jSONObjectObject = JSON.object();
                            C12974 c12977 = c12974;
                            String str13 = c12976.f36497;
                            JSONObject jSONObject2 = jSONObjectAdd3;
                            boolean z2 = c12976.f36490;
                            JSONArray jSONArray3 = jSONArrayArray3;
                            String str14 = c12976.f36491;
                            String str15 = str12;
                            String str16 = c12976.f36502;
                            String str17 = str11;
                            JSONObject jSONObjectAdd4 = jSONObjectObject.add("key", str13);
                            String str18 = c12976.f36505;
                            if (str18 == null) {
                                jSONValueValue = JSON.NULL;
                            } else {
                                jSONValueValue = JSON.value(m10234(str18));
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
                                    jSONObjectAdd6.add(C0226b.f1011d, str14).add("valueTruncated", z2);
                                    jSONArray3.add(jSONObjectAdd6);
                                    jSONArrayArray3 = jSONArray3;
                                    obj4 = obj2;
                                    str11 = str3;
                                    str10 = str2;
                                    c12974 = c12977;
                                    jSONObjectAdd3 = jSONObject2;
                                    obj8 = obj;
                                    it4 = it5;
                                    break;
                                case 2:
                                    JSONObject jSONObjectAdd7 = jSONObjectAdd6.add(C0226b.f1011d, str14).add("valueTruncated", z2);
                                    String str20 = c12976.f36499;
                                    str3 = str17;
                                    str12 = str15;
                                    jSONObjectAdd7.add(str12, C14884.m34069(str3, str20));
                                    jSONArray3.add(jSONObjectAdd6);
                                    jSONArrayArray3 = jSONArray3;
                                    obj4 = obj2;
                                    str11 = str3;
                                    str10 = str2;
                                    c12974 = c12977;
                                    jSONObjectAdd3 = jSONObject2;
                                    obj8 = obj;
                                    it4 = it5;
                                    break;
                                case 5:
                                case 8:
                                    JSONObject jSONObjectAdd8 = jSONObjectAdd6.add(C0226b.f1011d, str14).add("valueTruncated", z2);
                                    String str21 = c12976.f36495;
                                    if (str21 == null) {
                                        jSONValueValue2 = JSON.NULL;
                                    } else {
                                        jSONValueValue2 = JSON.value(m10234(str21));
                                    }
                                    jSONObjectAdd8.add("targetLocator", jSONValueValue2).add("resolvedTarget", m10233(c12976.f36493));
                                    str12 = str15;
                                    str3 = str17;
                                    jSONArray3.add(jSONObjectAdd6);
                                    jSONArrayArray3 = jSONArray3;
                                    obj4 = obj2;
                                    str11 = str3;
                                    str10 = str2;
                                    c12974 = c12977;
                                    jSONObjectAdd3 = jSONObject2;
                                    obj8 = obj;
                                    it4 = it5;
                                    break;
                                default:
                                    throw new IllegalStateException("Unsupported resource child value kind: ".concat(str16));
                            }
                        }
                        jSONObject = jSONObjectAdd3;
                        c12975 = c12974;
                        jSONObject.add("items", jSONArrayArray3).add("itemsTruncated", c12975.f36500).add("totalItemCount", c12975.f36498);
                        JSONObject jSONObjectAdd9 = jSONObject.add("targetVersion", c12975.f36494).add("valueXml", c12975.f36503);
                        num = c12975.f36487;
                        if (num == null) {
                            jSONValueValue3 = JSON.NULL;
                        } else {
                            jSONValueValue3 = JSON.value(num.intValue());
                        }
                        jSONObjectAdd = jSONObjectAdd9.add("valueXmlCharCount", jSONValueValue3).add("valueXmlTruncated", c12975.f36492).add("editable", c12975.f36489).add("editableReason", c12975.f36496);
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
                        jSONObjectAdd3.add(C0226b.f1011d, str9).add("valueTruncated", z);
                        jSONObject = jSONObjectAdd3;
                        c12975 = c12974;
                        JSONObject jSONObjectAdd10 = jSONObject.add("targetVersion", c12975.f36494).add("valueXml", c12975.f36503);
                        num = c12975.f36487;
                        if (num == null) {
                            jSONValueValue3 = JSON.NULL;
                        } else {
                            jSONValueValue3 = JSON.value(num.intValue());
                        }
                        jSONObjectAdd = jSONObjectAdd10.add("valueXmlCharCount", jSONValueValue3).add("valueXmlTruncated", c12975.f36492).add("editable", c12975.f36489).add("editableReason", c12975.f36496);
                        jSONArray = jSONArray2;
                        break;
                    case 3:
                        jSONObjectAdd3.add(C0226b.f1011d, str9).add("valueTruncated", z).add("fileLocator", C14884.m34069("zip_entry", c12974.f36499));
                        jSONObject = jSONObjectAdd3;
                        c12975 = c12974;
                        JSONObject jSONObjectAdd11 = jSONObject.add("targetVersion", c12975.f36494).add("valueXml", c12975.f36503);
                        num = c12975.f36487;
                        if (num == null) {
                            jSONValueValue3 = JSON.NULL;
                        } else {
                            jSONValueValue3 = JSON.value(num.intValue());
                        }
                        jSONObjectAdd = jSONObjectAdd11.add("valueXmlCharCount", jSONValueValue3).add("valueXmlTruncated", c12975.f36492).add("editable", c12975.f36489).add("editableReason", c12975.f36496);
                        jSONArray = jSONArray2;
                        break;
                    case 6:
                    case 9:
                        JSONObject jSONObjectAdd12 = jSONObjectAdd3.add(C0226b.f1011d, str9).add("valueTruncated", z);
                        String str22 = c12974.f36495;
                        if (str22 == null) {
                            jSONValueValue4 = JSON.NULL;
                        } else {
                            jSONValueValue4 = JSON.value(m10234(str22));
                        }
                        jSONObjectAdd12.add("targetLocator", jSONValueValue4).add("resolvedTarget", m10233(c12974.f36493));
                        jSONObject = jSONObjectAdd3;
                        c12975 = c12974;
                        JSONObject jSONObjectAdd13 = jSONObject.add("targetVersion", c12975.f36494).add("valueXml", c12975.f36503);
                        num = c12975.f36487;
                        if (num == null) {
                            jSONValueValue3 = JSON.NULL;
                        } else {
                            jSONValueValue3 = JSON.value(num.intValue());
                        }
                        jSONObjectAdd = jSONObjectAdd13.add("valueXmlCharCount", jSONValueValue3).add("valueXmlTruncated", c12975.f36492).add("editable", c12975.f36489).add("editableReason", c12975.f36496);
                        jSONArray = jSONArray2;
                        break;
                    default:
                        throw new IllegalStateException("Unsupported resource value kind: ".concat(str8));
                }
            }
            jSONArray.add(jSONObjectAdd);
            jSONArrayArray2 = jSONArray;
            it2 = it3;
            c21180 = c21181;
            str = str;
            jSONArrayArray = jSONArrayArray;
            str4 = str4;
            c15340M47837 = c15340M47837;
        }
        JSONObject jSONObjectM20453 = C8850.m20453(JSON.object().add("workspaceId", c15340M47837.f43796).add("editSessionId", str4).add("resourceNamePolicy", c15340M47837.f43794.m40176()).add("variantSets", jSONArrayArray).add("results", jSONArrayArray2).add("nextActions", JSON.array()));
        c21180.m47844(c18023.f53811);
        return new C14663(jSONObjectM20453);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C14663 m10237(C4763 c4763, JSONObject jSONObject, C17502 c17502) throws C5276 {
        C3942 c3942M34073 = C14884.m34073(jSONObject.getString("workspaceId", null), jSONObject.getString("editSessionId", ""), c4763, jSONObject);
        String string = jSONObject.getString("nextCursor", null);
        String str = c3942M34073.f8568;
        String str2 = c3942M34073.f8562;
        C17566 c17566 = new C17566(this, c3942M34073, c17502);
        C21180 c21180 = this.f10975;
        C14663 c14663 = (C14663) c21180.m47822(str, str2, string, c17566);
        c21180.m47844(str);
        return c14663;
    }

    /* JADX INFO: renamed from: ֫ */
    public static JSONObject m10232(String str, boolean z) {
        return JSON.object().add("hasMore", z).add("nextCursor", str);
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m10234(String str) {
        return C14884.m34021("resource", (String) null, (String) null, (String) null, (String) null, str.toLowerCase(Locale.ROOT));
    }

    /* JADX INFO: renamed from: ֫ */
    public static JSONValue m10233(C15614 c15614) {
        if (c15614 == null) {
            return JSON.NULL;
        }
        return JSON.object().add("locator", m10234(c15614.f44695)).add("missing", c15614.f44697).add("type", c15614.f44700).add("name", c15614.f44699).add("variant", c15614.f44696).add("valueKind", c15614.f44698).add("valueSnippet", c15614.f44702).add("valueTruncated", c15614.f44701);
    }
}
