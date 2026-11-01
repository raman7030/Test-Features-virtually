package p067l;

import android.text.Layout;
import com.alipay.sdk.p010m.p049t.AbstractC0213e;
import com.umeng.analytics.pro.C0655am;
import com.umeng.analytics.pro.C0698cb;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.bouncycastle.jcajce.provider.config.ProviderConfigurationPermission;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: renamed from: l.ᩴ᩵ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: E8QY */
/* JADX INFO: loaded from: classes5.dex */
public final class C20394 implements InterfaceC11657 {

    /* JADX INFO: renamed from: ֫ */
    public final XmlPullParserFactory f63056;

    /* JADX INFO: renamed from: ܽ */
    public static final Pattern f63051 = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");

    /* JADX INFO: renamed from: ܳ */
    public static final Pattern f63050 = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");

    /* JADX INFO: renamed from: ܿ */
    public static final Pattern f63052 = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");

    /* JADX INFO: renamed from: ᩷ */
    public static final Pattern f63054 = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");

    /* JADX INFO: renamed from: ᩻ */
    public static final Pattern f63055 = Pattern.compile("^([-+]?\\d+\\.?\\d*?)% ([-+]?\\d+\\.?\\d*?)%$");

    /* JADX INFO: renamed from: ۜ */
    public static final Pattern f63048 = Pattern.compile("^([-+]?\\d+\\.?\\d*?)px ([-+]?\\d+\\.?\\d*?)px$");

    /* JADX INFO: renamed from: ۧ */
    public static final Pattern f63049 = Pattern.compile("^(\\d+) (\\d+)$");

    /* JADX INFO: renamed from: ᩳ */
    public static final C4971 f63053 = new C4971(1, 30.0f, 1);

    @Override // p067l.InterfaceC11657
    public final /* synthetic */ void reset() {
    }

    public C20394() {
        try {
            XmlPullParserFactory xmlPullParserFactoryNewInstance = XmlPullParserFactory.newInstance();
            this.f63056 = xmlPullParserFactoryNewInstance;
            xmlPullParserFactoryNewInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e);
        }
    }

    @Override // p067l.InterfaceC11657
    /* JADX INFO: renamed from: ֫ */
    public final void mo8744(byte[] bArr, int i, int i2, C22386 c22386, InterfaceC24686 interfaceC24686) {
        C7891.m18239(mo8743(i, i2, bArr), c22386, interfaceC24686);
    }

    @Override // p067l.InterfaceC11657
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC15266 mo8743(int i, int i2, byte[] bArr) {
        C4971 c4971;
        try {
            XmlPullParser xmlPullParserNewPullParser = this.f63056.newPullParser();
            HashMap map = new HashMap();
            HashMap map2 = new HashMap();
            HashMap map3 = new HashMap();
            map2.put("", new C21065("", -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE));
            C6312 c6312M46063 = null;
            xmlPullParserNewPullParser.setInput(new ByteArrayInputStream(bArr, i, i2), null);
            ArrayDeque arrayDeque = new ArrayDeque();
            C4971 c4971M46062 = f63053;
            int iM46054 = 15;
            C3629 c3629 = null;
            int i3 = 0;
            for (int eventType = xmlPullParserNewPullParser.getEventType(); eventType != 1; eventType = xmlPullParserNewPullParser.getEventType()) {
                C17710 c17710 = (C17710) arrayDeque.peek();
                if (i3 == 0) {
                    String name = xmlPullParserNewPullParser.getName();
                    if (eventType == 2) {
                        if ("tt".equals(name)) {
                            c4971M46062 = m46062(xmlPullParserNewPullParser);
                            iM46054 = m46054(xmlPullParserNewPullParser);
                            c6312M46063 = m46063(xmlPullParserNewPullParser);
                        }
                        C6312 c6312 = c6312M46063;
                        C4971 c4972 = c4971M46062;
                        int i4 = iM46054;
                        if (m46061(name)) {
                            if ("head".equals(name)) {
                                c4971 = c4972;
                                m46060(xmlPullParserNewPullParser, map, i4, c6312, map2, map3);
                            } else {
                                c4971 = c4972;
                                try {
                                    C17710 c17710M46058 = m46058(xmlPullParserNewPullParser, c17710, map2, c4971);
                                    arrayDeque.push(c17710M46058);
                                    if (c17710 != null) {
                                        c17710.m40256(c17710M46058);
                                    }
                                } catch (C4280 e) {
                                    C21334.m48350("Suppressing parser error", e);
                                    i3++;
                                }
                            }
                            c4971M46062 = c4971;
                            c6312M46063 = c6312;
                            iM46054 = i4;
                        } else {
                            C21334.m48349("Ignoring unsupported tag: " + xmlPullParserNewPullParser.getName());
                            c4971 = c4972;
                        }
                        i3++;
                        c4971M46062 = c4971;
                        c6312M46063 = c6312;
                        iM46054 = i4;
                    } else if (eventType == 4) {
                        c17710.getClass();
                        c17710.m40256(C17710.m40247(xmlPullParserNewPullParser.getText()));
                    } else if (eventType == 3) {
                        if (xmlPullParserNewPullParser.getName().equals("tt")) {
                            C17710 c17711 = (C17710) arrayDeque.peek();
                            c17711.getClass();
                            c3629 = new C3629(c17711, map, map2, map3);
                        }
                        arrayDeque.pop();
                    }
                } else if (eventType == 2) {
                    i3++;
                } else if (eventType == 3) {
                    i3--;
                }
                xmlPullParserNewPullParser.next();
            }
            c3629.getClass();
            return c3629;
        } catch (IOException e2) {
            throw new IllegalStateException("Unexpected error when reading input.", e2);
        } catch (XmlPullParserException e3) {
            throw new IllegalStateException("Unable to decode source", e3);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static C4971 m46062(XmlPullParser xmlPullParser) {
        float f;
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        int i = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            String str = C5792.f14228;
            String[] strArrSplit = attributeValue2.split(" ", -1);
            C23877.m52956("frameRateMultiplier doesn't have 2 parts", strArrSplit.length == 2);
            f = Integer.parseInt(strArrSplit[0]) / Integer.parseInt(strArrSplit[1]);
        } else {
            f = 1.0f;
        }
        C4971 c4971 = f63053;
        int i2 = c4971.f11324;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i2 = Integer.parseInt(attributeValue3);
        }
        int i3 = c4971.f11325;
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        if (attributeValue4 != null) {
            i3 = Integer.parseInt(attributeValue4);
        }
        return new C4971(i2, i * f, i3);
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m46054(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return 15;
        }
        Matcher matcher = f63049.matcher(attributeValue);
        if (!matcher.matches()) {
            C21334.m48351("Ignoring malformed cell resolution: ".concat(attributeValue));
            return 15;
        }
        boolean z = true;
        try {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            int i = Integer.parseInt(strGroup);
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            int i2 = Integer.parseInt(strGroup2);
            if (i == 0 || i2 == 0) {
                z = false;
            }
            C23877.m52956("Invalid cell resolution " + i + " " + i2, z);
            return i2;
        } catch (NumberFormatException unused) {
            C21334.m48351("Ignoring malformed cell resolution: ".concat(attributeValue));
            return 15;
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public static C6312 m46063(XmlPullParser xmlPullParser) {
        String strM45114 = C19874.m45114(xmlPullParser, "extent");
        if (strM45114 == null) {
            return null;
        }
        Matcher matcher = f63048.matcher(strM45114);
        if (!matcher.matches()) {
            C21334.m48351("Ignoring non-pixel tts extent: ".concat(strM45114));
            return null;
        }
        try {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            int i = Integer.parseInt(strGroup);
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            return new C6312(i, Integer.parseInt(strGroup2));
        } catch (NumberFormatException unused) {
            C21334.m48351("Ignoring malformed tts extent: ".concat(strM45114));
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:102:0x020d  */
    /* JADX WARN: Code duplicated, block: B:79:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:97:0x0200  */
    /* JADX INFO: renamed from: ֫ */
    public static void m46060(XmlPullParser xmlPullParser, HashMap map, int i, C6312 c6312, HashMap map2, HashMap map3) throws XmlPullParserException, IOException {
        String strM45114;
        C21065 c21065;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        int i2;
        int i3;
        float f6;
        float f7;
        String strM45115;
        C7653 c7653;
        String strM45116;
        C7653 c7654;
        String[] strArrSplit;
        do {
            xmlPullParser.next();
            if (C19874.m45116(xmlPullParser, "style")) {
                String strM45117 = C19874.m45114(xmlPullParser, "style");
                C7653 c7653M46057 = m46057(xmlPullParser, new C7653());
                if (strM45117 != null) {
                    String strTrim = strM45117.trim();
                    if (strTrim.isEmpty()) {
                        strArrSplit = new String[0];
                    } else {
                        String str = C5792.f14228;
                        strArrSplit = strTrim.split("\\s+", -1);
                    }
                    for (String str2 : strArrSplit) {
                        c7653M46057.m17643((C7653) map.get(str2));
                    }
                }
                String strM17675 = c7653M46057.m17675();
                if (strM17675 != null) {
                    map.put(strM17675, c7653M46057);
                }
            } else if (C19874.m45116(xmlPullParser, "region")) {
                String strM45118 = C19874.m45114(xmlPullParser, "id");
                if (strM45118 != null) {
                    String strM45119 = C19874.m45114(xmlPullParser, "origin");
                    if (strM45119 == null && (strM45116 = C19874.m45114(xmlPullParser, "style")) != null && (c7654 = (C7653) map.get(strM45116)) != null) {
                        strM45119 = c7654.m17674();
                    }
                    Pattern pattern = f63048;
                    Pattern pattern2 = f63055;
                    if (strM45119 != null) {
                        Matcher matcher = pattern2.matcher(strM45119);
                        Matcher matcher2 = pattern.matcher(strM45119);
                        if (matcher.matches()) {
                            try {
                                String strGroup = matcher.group(1);
                                strGroup.getClass();
                                float f8 = Float.parseFloat(strGroup) / 100.0f;
                                String strGroup2 = matcher.group(2);
                                strGroup2.getClass();
                                f2 = Float.parseFloat(strGroup2) / 100.0f;
                                f = f8;
                            } catch (NumberFormatException unused) {
                                C21334.m48351("Ignoring region with malformed origin: ".concat(strM45119));
                            }
                        } else if (!matcher2.matches()) {
                            C21334.m48351("Ignoring region with unsupported origin: ".concat(strM45119));
                        } else if (c6312 == null) {
                            C21334.m48351("Ignoring region with missing tts:extent: ".concat(strM45119));
                        } else {
                            try {
                                String strGroup3 = matcher2.group(1);
                                strGroup3.getClass();
                                int i4 = Integer.parseInt(strGroup3);
                                String strGroup4 = matcher2.group(2);
                                strGroup4.getClass();
                                int i5 = Integer.parseInt(strGroup4);
                                f = i4 / c6312.f16368;
                                f2 = i5 / c6312.f16367;
                            } catch (NumberFormatException unused2) {
                                C21334.m48351("Ignoring region with malformed origin: ".concat(strM45119));
                            }
                        }
                        c21065 = null;
                    } else {
                        f = 0.0f;
                        f2 = 0.0f;
                    }
                    String strM451110 = C19874.m45114(xmlPullParser, "extent");
                    if (strM451110 == null && (strM45115 = C19874.m45114(xmlPullParser, "style")) != null && (c7653 = (C7653) map.get(strM45115)) != null) {
                        strM451110 = c7653.m17653();
                    }
                    if (strM451110 != null) {
                        Matcher matcher3 = pattern2.matcher(strM451110);
                        Matcher matcher4 = pattern.matcher(strM451110);
                        if (matcher3.matches()) {
                            try {
                                String strGroup5 = matcher3.group(1);
                                strGroup5.getClass();
                                f6 = Float.parseFloat(strGroup5) / 100.0f;
                                String strGroup6 = matcher3.group(2);
                                strGroup6.getClass();
                                f7 = Float.parseFloat(strGroup6) / 100.0f;
                            } catch (NumberFormatException unused3) {
                                C6988.m16054("Ignoring region with malformed extent: ", strM45119);
                                c21065 = null;
                            }
                        } else {
                            if (!matcher4.matches()) {
                                C6988.m16054("Ignoring region with unsupported extent: ", strM45119);
                            } else if (c6312 == null) {
                                C6988.m16054("Ignoring region with missing tts:extent: ", strM45119);
                            } else {
                                String strGroup7 = matcher4.group(1);
                                strGroup7.getClass();
                                int i6 = Integer.parseInt(strGroup7);
                                String strGroup8 = matcher4.group(2);
                                strGroup8.getClass();
                                int i7 = Integer.parseInt(strGroup8);
                                f6 = i6 / c6312.f16368;
                                f7 = i7 / c6312.f16367;
                            }
                            c21065 = null;
                        }
                        f4 = f7;
                        f3 = f6;
                    } else {
                        f3 = 1.0f;
                        f4 = 1.0f;
                    }
                    String strM451111 = C19874.m45114(xmlPullParser, "displayAlign");
                    if (strM451111 != null) {
                        String strM37957 = C16726.m37957(strM451111);
                        strM37957.getClass();
                        if (strM37957.equals("center")) {
                            f5 = f2 + (f4 / 2.0f);
                            i2 = 1;
                        } else if (strM37957.equals("after")) {
                            f5 = f2 + f4;
                            i2 = 2;
                        } else {
                            f5 = f2;
                            i2 = 0;
                        }
                    } else {
                        f5 = f2;
                        i2 = 0;
                    }
                    float f9 = 1.0f / i;
                    String strM451112 = C19874.m45114(xmlPullParser, "writingMode");
                    if (strM451112 != null) {
                        String strM37958 = C16726.m37957(strM451112);
                        strM37958.getClass();
                        switch (strM37958) {
                            case "tb":
                            case "tblr":
                                i3 = 2;
                                break;
                            case "tbrl":
                                i3 = 1;
                                break;
                            default:
                                i3 = Integer.MIN_VALUE;
                                break;
                        }
                    } else {
                        i3 = Integer.MIN_VALUE;
                    }
                    c21065 = new C21065(strM45118, f, f5, 0, i2, f3, f4, 1, f9, i3);
                } else {
                    c21065 = null;
                }
                if (c21065 != null) {
                    map2.put(c21065.f66152, c21065);
                }
            } else if (C19874.m45116(xmlPullParser, "metadata")) {
                do {
                    xmlPullParser.next();
                    if (C19874.m45116(xmlPullParser, "image") && (strM45114 = C19874.m45114(xmlPullParser, "id")) != null) {
                        map3.put(strM45114, xmlPullParser.nextText());
                    }
                } while (!C19874.m45115(xmlPullParser, "metadata"));
            }
        } while (!C19874.m45115(xmlPullParser, "head"));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:101:0x014b  */
    /* JADX WARN: Code duplicated, block: B:170:0x028e  */
    /* JADX WARN: Code duplicated, block: B:200:0x0317  */
    /* JADX WARN: Code duplicated, block: B:230:0x0388  */
    /* JADX WARN: Code duplicated, block: B:75:0x00fb  */
    /* JADX INFO: renamed from: ֫ */
    public static C7653 m46057(XmlPullParser xmlPullParser, C7653 c7653) {
        byte b;
        String str;
        int attributeCount = xmlPullParser.getAttributeCount();
        C7653 c7653M46056 = c7653;
        for (int i = 0; i < attributeCount; i++) {
            String attributeValue = xmlPullParser.getAttributeValue(i);
            String attributeName = xmlPullParser.getAttributeName(i);
            attributeName.getClass();
            switch (attributeName) {
                case "fontStyle":
                    b = 0;
                    break;
                case "extent":
                    b = 1;
                    break;
                case "fontFamily":
                    b = 2;
                    break;
                case "textAlign":
                    b = 3;
                    break;
                case "origin":
                    b = 4;
                    break;
                case "textDecoration":
                    b = 5;
                    break;
                case "fontWeight":
                    b = 6;
                    break;
                case "id":
                    b = 7;
                    break;
                case "ruby":
                    b = 8;
                    break;
                case "color":
                    b = 9;
                    break;
                case "shear":
                    b = 10;
                    break;
                case "textCombine":
                    b = 11;
                    break;
                case "fontSize":
                    b = 12;
                    break;
                case "textEmphasis":
                    b = C0698cb.f2569k;
                    break;
                case "rubyPosition":
                    b = C0698cb.f2570l;
                    break;
                case "backgroundColor":
                    b = 15;
                    break;
                case "multiRowAlign":
                    b = 16;
                    break;
                default:
                    b = -1;
                    break;
            }
            Layout.Alignment alignment = null;
            switch (b) {
                case 0:
                    c7653M46056 = m46056(c7653M46056);
                    c7653M46056.m17658("italic".equalsIgnoreCase(attributeValue));
                    continue;
                    break;
                case 1:
                    c7653M46056 = m46056(c7653M46056);
                    c7653M46056.m17642(attributeValue);
                    continue;
                    break;
                case 2:
                    c7653M46056 = m46056(c7653M46056);
                    c7653M46056.m17657(attributeValue);
                    continue;
                    break;
                case 3:
                    c7653M46056 = m46056(c7653M46056);
                    String strM37957 = C16726.m37957(attributeValue);
                    strM37957.getClass();
                    switch (strM37957) {
                        case "center":
                            alignment = Layout.Alignment.ALIGN_CENTER;
                            break;
                        case "end":
                        case "right":
                            alignment = Layout.Alignment.ALIGN_OPPOSITE;
                            break;
                        case "left":
                        case "start":
                            alignment = Layout.Alignment.ALIGN_NORMAL;
                            break;
                    }
                    c7653M46056.m17656(alignment);
                    continue;
                    break;
                case 4:
                    c7653M46056 = m46056(c7653M46056);
                    c7653M46056.m17670(attributeValue);
                    continue;
                    break;
                case 5:
                    String strM37958 = C16726.m37957(attributeValue);
                    strM37958.getClass();
                    switch (strM37958) {
                        case "nounderline":
                            c7653M46056 = m46056(c7653M46056);
                            c7653M46056.m17667(false);
                            break;
                        case "underline":
                            c7653M46056 = m46056(c7653M46056);
                            c7653M46056.m17667(true);
                            break;
                        case "nolinethrough":
                            c7653M46056 = m46056(c7653M46056);
                            c7653M46056.m17664(false);
                            break;
                        case "linethrough":
                            c7653M46056 = m46056(c7653M46056);
                            c7653M46056.m17664(true);
                            continue;
                            break;
                    }
                    break;
                case 6:
                    c7653M46056 = m46056(c7653M46056);
                    c7653M46056.m17645("bold".equalsIgnoreCase(attributeValue));
                    continue;
                    break;
                case 7:
                    if ("style".equals(xmlPullParser.getName())) {
                        c7653M46056 = m46056(c7653M46056);
                        c7653M46056.m17663(attributeValue);
                    } else {
                        continue;
                    }
                    break;
                case 8:
                    String strM37959 = C16726.m37957(attributeValue);
                    strM37959.getClass();
                    switch (strM37959) {
                        case "baseContainer":
                        case "base":
                            c7653M46056 = m46056(c7653M46056);
                            c7653M46056.m17666(2);
                            break;
                        case "container":
                            c7653M46056 = m46056(c7653M46056);
                            c7653M46056.m17666(1);
                            break;
                        case "delimiter":
                            c7653M46056 = m46056(c7653M46056);
                            c7653M46056.m17666(4);
                            break;
                        case "textContainer":
                        case "text":
                            c7653M46056 = m46056(c7653M46056);
                            c7653M46056.m17666(3);
                            continue;
                            break;
                    }
                    break;
                case 9:
                    c7653M46056 = m46056(c7653M46056);
                    try {
                        c7653M46056.m17655(C18651.m42402(attributeValue));
                        continue;
                    } catch (IllegalArgumentException unused) {
                        str = "Failed parsing color value: ";
                        C6988.m16054(str, attributeValue);
                    }
                    break;
                case 10:
                    C7653 c7653M46057 = m46056(c7653M46056);
                    Matcher matcher = f63054.matcher(attributeValue);
                    float fMin = Float.MAX_VALUE;
                    if (matcher.matches()) {
                        try {
                            String strGroup = matcher.group(1);
                            strGroup.getClass();
                            fMin = Math.min(100.0f, Math.max(-100.0f, Float.parseFloat(strGroup)));
                        } catch (NumberFormatException e) {
                            C21334.m48350("Failed to parse shear: " + attributeValue, e);
                        }
                    } else {
                        C6988.m16054("Invalid value for shear: ", attributeValue);
                    }
                    c7653M46057.m17654(fMin);
                    c7653M46056 = c7653M46057;
                    continue;
                    break;
                case 11:
                    String strM379510 = C16726.m37957(attributeValue);
                    strM379510.getClass();
                    if (strM379510.equals(ProviderConfigurationPermission.ALL_STR)) {
                        c7653M46056 = m46056(c7653M46056);
                        c7653M46056.m17671(true);
                    } else if (strM379510.equals("none")) {
                        c7653M46056 = m46056(c7653M46056);
                        c7653M46056.m17671(false);
                        continue;
                    }
                    break;
                case 12:
                    try {
                        c7653M46056 = m46056(c7653M46056);
                        m46059(attributeValue, c7653M46056);
                        continue;
                    } catch (C4280 unused2) {
                        str = "Failed parsing fontSize value: ";
                        C6988.m16054(str, attributeValue);
                    }
                    break;
                case 13:
                    c7653M46056 = m46056(c7653M46056);
                    c7653M46056.m17644(C11006.m25392(attributeValue));
                    continue;
                    break;
                case 14:
                    String strM379511 = C16726.m37957(attributeValue);
                    strM379511.getClass();
                    if (strM379511.equals("before")) {
                        c7653M46056 = m46056(c7653M46056);
                        c7653M46056.m17669(1);
                    } else if (strM379511.equals("after")) {
                        c7653M46056 = m46056(c7653M46056);
                        c7653M46056.m17669(2);
                        continue;
                    }
                    break;
                case 15:
                    c7653M46056 = m46056(c7653M46056);
                    try {
                        c7653M46056.m17640(C18651.m42402(attributeValue));
                        continue;
                    } catch (IllegalArgumentException unused3) {
                        str = "Failed parsing background value: ";
                        C6988.m16054(str, attributeValue);
                    }
                    break;
                case 16:
                    c7653M46056 = m46056(c7653M46056);
                    String strM379512 = C16726.m37957(attributeValue);
                    strM379512.getClass();
                    switch (strM379512.hashCode()) {
                        case -1364013995:
                            if (strM379512.equals("center")) {
                            }
                            break;
                        case 100571:
                            if (strM379512.equals("end")) {
                            }
                            break;
                        case 3317767:
                            if (strM379512.equals("left")) {
                            }
                            break;
                        case 108511772:
                            if (strM379512.equals("right")) {
                            }
                            break;
                        case 109757538:
                            if (!strM379512.equals("start")) {
                            }
                            break;
                        default:
                            break;
                    }
                    /*  JADX ERROR: Method code generation error
                        java.lang.NullPointerException: Switch insn not found in header
                        	at java.base/java.util.Objects.requireNonNull(Objects.java:235)
                        	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:246)
                        	at jadx.core.dex.regions.SwitchRegion.generate(SwitchRegion.java:90)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                        	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:267)
                        	at jadx.core.dex.regions.SwitchRegion.generate(SwitchRegion.java:90)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                        	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:195)
                        	at jadx.core.dex.regions.loops.LoopRegion.generate(LoopRegion.java:173)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                        */
                    /*
                        Method dump skipped, instruction units count: 1210
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: p067l.C20394.m46057(org.xmlpull.v1.XmlPullParser, l.ۚ᩵ۧ):l.ۚ᩵ۧ");
                }

                /* JADX INFO: renamed from: ֫ */
                public static C7653 m46056(C7653 c7653) {
                    return c7653 == null ? new C7653() : c7653;
                }

                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                /* JADX WARN: Code duplicated, block: B:31:0x007c  */
                /* JADX WARN: Code duplicated, block: B:71:0x0109  */
                /* JADX INFO: renamed from: ֫ */
                public static C17710 m46058(XmlPullParser xmlPullParser, C17710 c17710, HashMap map, C4971 c4971) throws C4280 {
                    long j;
                    long j2;
                    String[] strArrSplit;
                    int attributeCount = xmlPullParser.getAttributeCount();
                    C7653 c7653M46057 = m46057(xmlPullParser, (C7653) null);
                    String[] strArr = null;
                    String strSubstring = null;
                    String str = "";
                    long jM46055 = -9223372036854775807L;
                    long jM46056 = -9223372036854775807L;
                    long jM46057 = -9223372036854775807L;
                    for (int i = 0; i < attributeCount; i++) {
                        String attributeName = xmlPullParser.getAttributeName(i);
                        String attributeValue = xmlPullParser.getAttributeValue(i);
                        attributeName.getClass();
                        switch (attributeName) {
                            case "region":
                                if (map.containsKey(attributeValue)) {
                                    str = attributeValue;
                                    continue;
                                }
                                break;
                            case "dur":
                                jM46057 = m46055(attributeValue, c4971);
                                continue;
                                break;
                            case "end":
                                jM46056 = m46055(attributeValue, c4971);
                                continue;
                                break;
                            case "begin":
                                jM46055 = m46055(attributeValue, c4971);
                                continue;
                                break;
                            case "style":
                                String strTrim = attributeValue.trim();
                                if (strTrim.isEmpty()) {
                                    strArrSplit = new String[0];
                                } else {
                                    String str2 = C5792.f14228;
                                    strArrSplit = strTrim.split("\\s+", -1);
                                }
                                if (strArrSplit.length > 0) {
                                    strArr = strArrSplit;
                                    break;
                                }
                                break;
                            case "backgroundImage":
                                if (attributeValue.startsWith("#")) {
                                    strSubstring = attributeValue.substring(1);
                                    break;
                                }
                                break;
                        }
                    }
                    if (c17710 != null) {
                        long j3 = c17710.f52901;
                        j = -9223372036854775807L;
                        if (j3 != -9223372036854775807L) {
                            if (jM46055 != -9223372036854775807L) {
                                jM46055 += j3;
                            }
                            if (jM46056 != -9223372036854775807L) {
                                jM46056 += j3;
                            }
                        }
                    } else {
                        j = -9223372036854775807L;
                    }
                    long j4 = jM46055;
                    if (jM46056 != j) {
                        j2 = jM46056;
                    } else if (jM46057 != j) {
                        j2 = j4 + jM46057;
                    } else if (c17710 != null) {
                        long j5 = c17710.f52895;
                        if (j5 != j) {
                            j2 = j5;
                        } else {
                            j2 = jM46056;
                        }
                    } else {
                        j2 = jM46056;
                    }
                    return C17710.m40248(xmlPullParser.getName(), j4, j2, c7653M46057, strArr, str, strSubstring, c17710);
                }

                /* JADX INFO: renamed from: ֫ */
                public static boolean m46061(String str) {
                    return str.equals("tt") || str.equals("head") || str.equals("body") || str.equals("div") || str.equals(C0655am.f2322ax) || str.equals("span") || str.equals("br") || str.equals("style") || str.equals("styling") || str.equals("layout") || str.equals("region") || str.equals("metadata") || str.equals("image") || str.equals(AbstractC0213e.f989m) || str.equals("information");
                }

                /* JADX INFO: renamed from: ֫ */
                public static void m46059(String str, C7653 c7653) throws C4280 {
                    Matcher matcher;
                    String str2 = C5792.f14228;
                    String[] strArrSplit = str.split("\\s+", -1);
                    int length = strArrSplit.length;
                    Pattern pattern = f63052;
                    if (length == 1) {
                        matcher = pattern.matcher(str);
                    } else {
                        if (strArrSplit.length != 2) {
                            throw new C4280(C5410.m11876(strArrSplit.length, ".", new StringBuilder("Invalid number of entries for fontSize: ")));
                        }
                        matcher = pattern.matcher(strArrSplit[1]);
                        C21334.m48351("Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
                    }
                    if (!matcher.matches()) {
                        throw new C4280(C6988.m16053("Invalid expression for fontSize: '", str, "'."));
                    }
                    String strGroup = matcher.group(3);
                    strGroup.getClass();
                    switch (strGroup) {
                        case "%":
                            c7653.m17662(3);
                            break;
                        case "em":
                            c7653.m17662(2);
                            break;
                        case "px":
                            c7653.m17662(1);
                            break;
                        default:
                            throw new C4280(C6988.m16053("Invalid unit for fontSize: '", strGroup, "'."));
                    }
                    String strGroup2 = matcher.group(1);
                    strGroup2.getClass();
                    c7653.m17639(Float.parseFloat(strGroup2));
                }

                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                /* JADX WARN: Code duplicated, block: B:42:0x00da  */
                /* JADX WARN: Failed to find 'out' block for switch in B:43:0x00db. Please report as an issue. */
                /* JADX INFO: renamed from: ֫ */
                public static long m46055(String str, C4971 c4971) throws C4280 {
                    double d;
                    double d2;
                    double d3;
                    Matcher matcher = f63051.matcher(str);
                    if (matcher.matches()) {
                        String strGroup = matcher.group(1);
                        strGroup.getClass();
                        double d4 = Long.parseLong(strGroup) * 3600;
                        String strGroup2 = matcher.group(2);
                        strGroup2.getClass();
                        double d5 = d4 + (Long.parseLong(strGroup2) * 60);
                        String strGroup3 = matcher.group(3);
                        strGroup3.getClass();
                        double d6 = d5 + Long.parseLong(strGroup3);
                        String strGroup4 = matcher.group(4);
                        double d7 = d6 + (strGroup4 != null ? Double.parseDouble(strGroup4) : 0.0d);
                        String strGroup5 = matcher.group(5);
                        double d8 = d7 + (strGroup5 != null ? Long.parseLong(strGroup5) / c4971.f11323 : 0.0d);
                        String strGroup6 = matcher.group(6);
                        d = d8 + (strGroup6 != null ? (Long.parseLong(strGroup6) / ((double) c4971.f11324)) / ((double) c4971.f11323) : 0.0d);
                    } else {
                        Matcher matcher2 = f63050.matcher(str);
                        if (!matcher2.matches()) {
                            throw new C4280(C21466.m48631("Malformed time expression: ", str));
                        }
                        String strGroup7 = matcher2.group(1);
                        strGroup7.getClass();
                        d = Double.parseDouble(strGroup7);
                        String strGroup8 = matcher2.group(2);
                        strGroup8.getClass();
                        switch (strGroup8) {
                            case "f":
                                d2 = c4971.f11323;
                                d /= d2;
                                break;
                            case "h":
                                d3 = 3600.0d;
                                d *= d3;
                                break;
                            case "m":
                                d3 = 60.0d;
                                d *= d3;
                                break;
                            case "t":
                                d2 = c4971.f11325;
                                d /= d2;
                                break;
                            case "ms":
                                d2 = 1000.0d;
                                d /= d2;
                                break;
                        }
                    }
                    return (long) (d * 1000000.0d);
                }
            }
