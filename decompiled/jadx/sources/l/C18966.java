package l;

import android.text.Layout;
import com.alipay.sdk.m.t.e;
import com.umeng.analytics.pro.am;
import com.umeng.analytics.pro.cb;
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
public final class C18966 implements InterfaceC9773 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final XmlPullParserFactory f59828;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final Pattern f59823 = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final Pattern f59822 = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final Pattern f59824 = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final Pattern f59826 = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final Pattern f59827 = Pattern.compile("^([-+]?\\d+\\.?\\d*?)% ([-+]?\\d+\\.?\\d*?)%$");

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final Pattern f59820 = Pattern.compile("^([-+]?\\d+\\.?\\d*?)px ([-+]?\\d+\\.?\\d*?)px$");

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final Pattern f59821 = Pattern.compile("^(\\d+) (\\d+)$");

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final C2738 f59825 = new C2738(1, 30.0f, 1);

    @Override // l.InterfaceC9773
    public final /* synthetic */ void reset() {
    }

    public C18966() {
        try {
            XmlPullParserFactory xmlPullParserFactoryNewInstance = XmlPullParserFactory.newInstance();
            this.f59828 = xmlPullParserFactoryNewInstance;
            xmlPullParserFactoryNewInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e);
        }
    }

    @Override // l.InterfaceC9773
    /* JADX INFO: renamed from: ֫ */
    public final void mo6618(byte[] bArr, int i, int i2, C21062 c21062, InterfaceC23483 interfaceC23483) {
        C5811.m16314(mo6617(i, i2, bArr), c21062, interfaceC23483);
    }

    @Override // l.InterfaceC9773
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC13571 mo6617(int i, int i2, byte[] bArr) {
        C2738 c2738;
        try {
            XmlPullParser xmlPullParserNewPullParser = this.f59828.newPullParser();
            HashMap map = new HashMap();
            HashMap map2 = new HashMap();
            HashMap map3 = new HashMap();
            map2.put("", new C19672("", -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE));
            C4149 c4149M43796 = null;
            xmlPullParserNewPullParser.setInput(new ByteArrayInputStream(bArr, i, i2), null);
            ArrayDeque arrayDeque = new ArrayDeque();
            C2738 c2738M43795 = f59825;
            int iM43787 = 15;
            C1326 c1326 = null;
            int i3 = 0;
            for (int eventType = xmlPullParserNewPullParser.getEventType(); eventType != 1; eventType = xmlPullParserNewPullParser.getEventType()) {
                C16142 c16142 = (C16142) arrayDeque.peek();
                if (i3 == 0) {
                    String name = xmlPullParserNewPullParser.getName();
                    if (eventType == 2) {
                        if ("tt".equals(name)) {
                            c2738M43795 = m43795(xmlPullParserNewPullParser);
                            iM43787 = m43787(xmlPullParserNewPullParser);
                            c4149M43796 = m43796(xmlPullParserNewPullParser);
                        }
                        C4149 c4149 = c4149M43796;
                        C2738 c2739 = c2738M43795;
                        int i4 = iM43787;
                        if (m43794(name)) {
                            if ("head".equals(name)) {
                                c2738 = c2739;
                                m43793(xmlPullParserNewPullParser, map, i4, c4149, map2, map3);
                            } else {
                                c2738 = c2739;
                                try {
                                    C16142 c16142M43791 = m43791(xmlPullParserNewPullParser, c16142, map2, c2738);
                                    arrayDeque.push(c16142M43791);
                                    if (c16142 != null) {
                                        c16142.m38064(c16142M43791);
                                    }
                                } catch (C2011 e) {
                                    C19956.m46036("Suppressing parser error", e);
                                    i3++;
                                }
                            }
                            c2738M43795 = c2738;
                            c4149M43796 = c4149;
                            iM43787 = i4;
                        } else {
                            C19956.m46035("Ignoring unsupported tag: " + xmlPullParserNewPullParser.getName());
                            c2738 = c2739;
                        }
                        i3++;
                        c2738M43795 = c2738;
                        c4149M43796 = c4149;
                        iM43787 = i4;
                    } else if (eventType == 4) {
                        c16142.getClass();
                        c16142.m38064(C16142.m38055(xmlPullParserNewPullParser.getText()));
                    } else if (eventType == 3) {
                        if (xmlPullParserNewPullParser.getName().equals("tt")) {
                            C16142 c16143 = (C16142) arrayDeque.peek();
                            c16143.getClass();
                            c1326 = new C1326(c16143, map, map2, map3);
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
            c1326.getClass();
            return c1326;
        } catch (IOException e2) {
            throw new IllegalStateException("Unexpected error when reading input.", e2);
        } catch (XmlPullParserException e3) {
            throw new IllegalStateException("Unable to decode source", e3);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C2738 m43795(XmlPullParser xmlPullParser) {
        float f;
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        int i = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            String str = C3603.f11424;
            String[] strArrSplit = attributeValue2.split(" ", -1);
            C22632.m50630("frameRateMultiplier doesn't have 2 parts", strArrSplit.length == 2);
            f = Integer.parseInt(strArrSplit[0]) / Integer.parseInt(strArrSplit[1]);
        } else {
            f = 1.0f;
        }
        C2738 c2738 = f59825;
        int i2 = c2738.f8530;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i2 = Integer.parseInt(attributeValue3);
        }
        int i3 = c2738.f8531;
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        if (attributeValue4 != null) {
            i3 = Integer.parseInt(attributeValue4);
        }
        return new C2738(i2, i * f, i3);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m43787(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return 15;
        }
        Matcher matcher = f59821.matcher(attributeValue);
        if (!matcher.matches()) {
            C19956.m46037("Ignoring malformed cell resolution: ".concat(attributeValue));
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
            C22632.m50630("Invalid cell resolution " + i + " " + i2, z);
            return i2;
        } catch (NumberFormatException unused) {
            C19956.m46037("Ignoring malformed cell resolution: ".concat(attributeValue));
            return 15;
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static C4149 m43796(XmlPullParser xmlPullParser) {
        String strM42841 = C18420.m42841(xmlPullParser, "extent");
        if (strM42841 == null) {
            return null;
        }
        Matcher matcher = f59820.matcher(strM42841);
        if (!matcher.matches()) {
            C19956.m46037("Ignoring non-pixel tts extent: ".concat(strM42841));
            return null;
        }
        try {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            int i = Integer.parseInt(strGroup);
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            return new C4149(i, Integer.parseInt(strGroup2));
        } catch (NumberFormatException unused) {
            C19956.m46037("Ignoring malformed tts extent: ".concat(strM42841));
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:102:0x020d  */
    /* JADX WARN: Code duplicated, block: B:79:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:97:0x0200  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m43793(XmlPullParser xmlPullParser, HashMap map, int i, C4149 c4149, HashMap map2, HashMap map3) throws XmlPullParserException, IOException {
        String strM42841;
        C19672 c19672;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        int i2;
        int i3;
        float f6;
        float f7;
        String strM42842;
        C5560 c5560;
        String strM42843;
        C5560 c5561;
        String[] strArrSplit;
        do {
            xmlPullParser.next();
            if (C18420.m42843(xmlPullParser, "style")) {
                String strM42844 = C18420.m42841(xmlPullParser, "style");
                C5560 c5560M43790 = m43790(xmlPullParser, new C5560());
                if (strM42844 != null) {
                    String strTrim = strM42844.trim();
                    if (strTrim.isEmpty()) {
                        strArrSplit = new String[0];
                    } else {
                        String str = C3603.f11424;
                        strArrSplit = strTrim.split("\\s+", -1);
                    }
                    for (String str2 : strArrSplit) {
                        c5560M43790.m15728((C5560) map.get(str2));
                    }
                }
                String strM15760 = c5560M43790.m15760();
                if (strM15760 != null) {
                    map.put(strM15760, c5560M43790);
                }
            } else if (C18420.m42843(xmlPullParser, "region")) {
                String strM42845 = C18420.m42841(xmlPullParser, "id");
                if (strM42845 != null) {
                    String strM42846 = C18420.m42841(xmlPullParser, "origin");
                    if (strM42846 == null && (strM42843 = C18420.m42841(xmlPullParser, "style")) != null && (c5561 = (C5560) map.get(strM42843)) != null) {
                        strM42846 = c5561.m15759();
                    }
                    Pattern pattern = f59820;
                    Pattern pattern2 = f59827;
                    if (strM42846 != null) {
                        Matcher matcher = pattern2.matcher(strM42846);
                        Matcher matcher2 = pattern.matcher(strM42846);
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
                                C19956.m46037("Ignoring region with malformed origin: ".concat(strM42846));
                            }
                        } else if (!matcher2.matches()) {
                            C19956.m46037("Ignoring region with unsupported origin: ".concat(strM42846));
                        } else if (c4149 == null) {
                            C19956.m46037("Ignoring region with missing tts:extent: ".concat(strM42846));
                        } else {
                            try {
                                String strGroup3 = matcher2.group(1);
                                strGroup3.getClass();
                                int i4 = Integer.parseInt(strGroup3);
                                String strGroup4 = matcher2.group(2);
                                strGroup4.getClass();
                                int i5 = Integer.parseInt(strGroup4);
                                f = i4 / c4149.f13554;
                                f2 = i5 / c4149.f13553;
                            } catch (NumberFormatException unused2) {
                                C19956.m46037("Ignoring region with malformed origin: ".concat(strM42846));
                            }
                        }
                        c19672 = null;
                    } else {
                        f = 0.0f;
                        f2 = 0.0f;
                    }
                    String strM42847 = C18420.m42841(xmlPullParser, "extent");
                    if (strM42847 == null && (strM42842 = C18420.m42841(xmlPullParser, "style")) != null && (c5560 = (C5560) map.get(strM42842)) != null) {
                        strM42847 = c5560.m15738();
                    }
                    if (strM42847 != null) {
                        Matcher matcher3 = pattern2.matcher(strM42847);
                        Matcher matcher4 = pattern.matcher(strM42847);
                        if (matcher3.matches()) {
                            try {
                                String strGroup5 = matcher3.group(1);
                                strGroup5.getClass();
                                f6 = Float.parseFloat(strGroup5) / 100.0f;
                                String strGroup6 = matcher3.group(2);
                                strGroup6.getClass();
                                f7 = Float.parseFloat(strGroup6) / 100.0f;
                            } catch (NumberFormatException unused3) {
                                C4860.m14173("Ignoring region with malformed extent: ", strM42846);
                                c19672 = null;
                            }
                        } else {
                            if (!matcher4.matches()) {
                                C4860.m14173("Ignoring region with unsupported extent: ", strM42846);
                            } else if (c4149 == null) {
                                C4860.m14173("Ignoring region with missing tts:extent: ", strM42846);
                            } else {
                                String strGroup7 = matcher4.group(1);
                                strGroup7.getClass();
                                int i6 = Integer.parseInt(strGroup7);
                                String strGroup8 = matcher4.group(2);
                                strGroup8.getClass();
                                int i7 = Integer.parseInt(strGroup8);
                                f6 = i6 / c4149.f13554;
                                f7 = i7 / c4149.f13553;
                            }
                            c19672 = null;
                        }
                        f4 = f7;
                        f3 = f6;
                    } else {
                        f3 = 1.0f;
                        f4 = 1.0f;
                    }
                    String strM42848 = C18420.m42841(xmlPullParser, "displayAlign");
                    if (strM42848 != null) {
                        String strM35799 = C15107.m35799(strM42848);
                        strM35799.getClass();
                        if (strM35799.equals("center")) {
                            f5 = f2 + (f4 / 2.0f);
                            i2 = 1;
                        } else if (strM35799.equals("after")) {
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
                    String strM42849 = C18420.m42841(xmlPullParser, "writingMode");
                    if (strM42849 != null) {
                        String strM357910 = C15107.m35799(strM42849);
                        strM357910.getClass();
                        switch (strM357910) {
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
                    c19672 = new C19672(strM42845, f, f5, 0, i2, f3, f4, 1, f9, i3);
                } else {
                    c19672 = null;
                }
                if (c19672 != null) {
                    map2.put(c19672.f63531, c19672);
                }
            } else if (C18420.m42843(xmlPullParser, "metadata")) {
                do {
                    xmlPullParser.next();
                    if (C18420.m42843(xmlPullParser, "image") && (strM42841 = C18420.m42841(xmlPullParser, "id")) != null) {
                        map3.put(strM42841, xmlPullParser.nextText());
                    }
                } while (!C18420.m42842(xmlPullParser, "metadata"));
            }
        } while (!C18420.m42842(xmlPullParser, "head"));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:101:0x014b  */
    /* JADX WARN: Code duplicated, block: B:170:0x028e  */
    /* JADX WARN: Code duplicated, block: B:200:0x0317  */
    /* JADX WARN: Code duplicated, block: B:230:0x0388  */
    /* JADX WARN: Code duplicated, block: B:75:0x00fb  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C5560 m43790(XmlPullParser xmlPullParser, C5560 c5560) {
        byte b;
        String str;
        int attributeCount = xmlPullParser.getAttributeCount();
        C5560 c5560M43789 = c5560;
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
                    b = cb.k;
                    break;
                case "rubyPosition":
                    b = cb.f77931l;
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
                    c5560M43789 = m43789(c5560M43789);
                    c5560M43789.m15743("italic".equalsIgnoreCase(attributeValue));
                    continue;
                    break;
                case 1:
                    c5560M43789 = m43789(c5560M43789);
                    c5560M43789.m15727(attributeValue);
                    continue;
                    break;
                case 2:
                    c5560M43789 = m43789(c5560M43789);
                    c5560M43789.m15742(attributeValue);
                    continue;
                    break;
                case 3:
                    c5560M43789 = m43789(c5560M43789);
                    String strM35799 = C15107.m35799(attributeValue);
                    strM35799.getClass();
                    switch (strM35799) {
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
                    c5560M43789.m15741(alignment);
                    continue;
                    break;
                case 4:
                    c5560M43789 = m43789(c5560M43789);
                    c5560M43789.m15755(attributeValue);
                    continue;
                    break;
                case 5:
                    String strM357910 = C15107.m35799(attributeValue);
                    strM357910.getClass();
                    switch (strM357910) {
                        case "nounderline":
                            c5560M43789 = m43789(c5560M43789);
                            c5560M43789.m15752(false);
                            break;
                        case "underline":
                            c5560M43789 = m43789(c5560M43789);
                            c5560M43789.m15752(true);
                            break;
                        case "nolinethrough":
                            c5560M43789 = m43789(c5560M43789);
                            c5560M43789.m15749(false);
                            break;
                        case "linethrough":
                            c5560M43789 = m43789(c5560M43789);
                            c5560M43789.m15749(true);
                            continue;
                            break;
                    }
                    break;
                case 6:
                    c5560M43789 = m43789(c5560M43789);
                    c5560M43789.m15730("bold".equalsIgnoreCase(attributeValue));
                    continue;
                    break;
                case 7:
                    if ("style".equals(xmlPullParser.getName())) {
                        c5560M43789 = m43789(c5560M43789);
                        c5560M43789.m15748(attributeValue);
                    } else {
                        continue;
                    }
                    break;
                case 8:
                    String strM357911 = C15107.m35799(attributeValue);
                    strM357911.getClass();
                    switch (strM357911) {
                        case "baseContainer":
                        case "base":
                            c5560M43789 = m43789(c5560M43789);
                            c5560M43789.m15751(2);
                            break;
                        case "container":
                            c5560M43789 = m43789(c5560M43789);
                            c5560M43789.m15751(1);
                            break;
                        case "delimiter":
                            c5560M43789 = m43789(c5560M43789);
                            c5560M43789.m15751(4);
                            break;
                        case "textContainer":
                        case "text":
                            c5560M43789 = m43789(c5560M43789);
                            c5560M43789.m15751(3);
                            continue;
                            break;
                    }
                    break;
                case 9:
                    c5560M43789 = m43789(c5560M43789);
                    try {
                        c5560M43789.m15740(C17133.m40157(attributeValue));
                        continue;
                    } catch (IllegalArgumentException unused) {
                        str = "Failed parsing color value: ";
                        C4860.m14173(str, attributeValue);
                    }
                    break;
                case 10:
                    C5560 c5560M437810 = m43789(c5560M43789);
                    Matcher matcher = f59826.matcher(attributeValue);
                    float fMin = Float.MAX_VALUE;
                    if (matcher.matches()) {
                        try {
                            String strGroup = matcher.group(1);
                            strGroup.getClass();
                            fMin = Math.min(100.0f, Math.max(-100.0f, Float.parseFloat(strGroup)));
                        } catch (NumberFormatException e) {
                            C19956.m46036("Failed to parse shear: " + attributeValue, e);
                        }
                    } else {
                        C4860.m14173("Invalid value for shear: ", attributeValue);
                    }
                    c5560M437810.m15739(fMin);
                    c5560M43789 = c5560M437810;
                    continue;
                    break;
                case 11:
                    String strM357912 = C15107.m35799(attributeValue);
                    strM357912.getClass();
                    if (strM357912.equals(ProviderConfigurationPermission.ALL_STR)) {
                        c5560M43789 = m43789(c5560M43789);
                        c5560M43789.m15756(true);
                    } else if (strM357912.equals("none")) {
                        c5560M43789 = m43789(c5560M43789);
                        c5560M43789.m15756(false);
                        continue;
                    }
                    break;
                case 12:
                    try {
                        c5560M43789 = m43789(c5560M43789);
                        m43792(attributeValue, c5560M43789);
                        continue;
                    } catch (C2011 unused2) {
                        str = "Failed parsing fontSize value: ";
                        C4860.m14173(str, attributeValue);
                    }
                    break;
                case 13:
                    c5560M43789 = m43789(c5560M43789);
                    c5560M43789.m15729(C9088.m23445(attributeValue));
                    continue;
                    break;
                case 14:
                    String strM357913 = C15107.m35799(attributeValue);
                    strM357913.getClass();
                    if (strM357913.equals("before")) {
                        c5560M43789 = m43789(c5560M43789);
                        c5560M43789.m15754(1);
                    } else if (strM357913.equals("after")) {
                        c5560M43789 = m43789(c5560M43789);
                        c5560M43789.m15754(2);
                        continue;
                    }
                    break;
                case 15:
                    c5560M43789 = m43789(c5560M43789);
                    try {
                        c5560M43789.m15725(C17133.m40157(attributeValue));
                        continue;
                    } catch (IllegalArgumentException unused3) {
                        str = "Failed parsing background value: ";
                        C4860.m14173(str, attributeValue);
                    }
                    break;
                case 16:
                    c5560M43789 = m43789(c5560M43789);
                    String strM357914 = C15107.m35799(attributeValue);
                    strM357914.getClass();
                    switch (strM357914.hashCode()) {
                        case -1364013995:
                            if (strM357914.equals("center")) {
                            }
                            break;
                        case 100571:
                            if (strM357914.equals("end")) {
                            }
                            break;
                        case 3317767:
                            if (strM357914.equals("left")) {
                            }
                            break;
                        case 108511772:
                            if (strM357914.equals("right")) {
                            }
                            break;
                        case 109757538:
                            if (!strM357914.equals("start")) {
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
                    throw new UnsupportedOperationException("Method not decompiled: l.C18966.m43790(org.xmlpull.v1.XmlPullParser, l.ۚ᩵ۧ):l.ۚ᩵ۧ");
                }

                /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
                public static C5560 m43789(C5560 c5560) {
                    return c5560 == null ? new C5560() : c5560;
                }

                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                /* JADX WARN: Code duplicated, block: B:31:0x007c  */
                /* JADX WARN: Code duplicated, block: B:71:0x0109  */
                /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
                public static C16142 m43791(XmlPullParser xmlPullParser, C16142 c16142, HashMap map, C2738 c2738) throws C2011 {
                    long j;
                    long j2;
                    String[] strArrSplit;
                    int attributeCount = xmlPullParser.getAttributeCount();
                    C5560 c5560M43790 = m43790(xmlPullParser, (C5560) null);
                    String[] strArr = null;
                    String strSubstring = null;
                    String str = "";
                    long jM43788 = -9223372036854775807L;
                    long jM43789 = -9223372036854775807L;
                    long jM437810 = -9223372036854775807L;
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
                                jM437810 = m43788(attributeValue, c2738);
                                continue;
                                break;
                            case "end":
                                jM43789 = m43788(attributeValue, c2738);
                                continue;
                                break;
                            case "begin":
                                jM43788 = m43788(attributeValue, c2738);
                                continue;
                                break;
                            case "style":
                                String strTrim = attributeValue.trim();
                                if (strTrim.isEmpty()) {
                                    strArrSplit = new String[0];
                                } else {
                                    String str2 = C3603.f11424;
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
                    if (c16142 != null) {
                        long j3 = c16142.f49735;
                        j = -9223372036854775807L;
                        if (j3 != -9223372036854775807L) {
                            if (jM43788 != -9223372036854775807L) {
                                jM43788 += j3;
                            }
                            if (jM43789 != -9223372036854775807L) {
                                jM43789 += j3;
                            }
                        }
                    } else {
                        j = -9223372036854775807L;
                    }
                    long j4 = jM43788;
                    if (jM43789 != j) {
                        j2 = jM43789;
                    } else if (jM437810 != j) {
                        j2 = j4 + jM437810;
                    } else if (c16142 != null) {
                        long j5 = c16142.f49729;
                        if (j5 != j) {
                            j2 = j5;
                        } else {
                            j2 = jM43789;
                        }
                    } else {
                        j2 = jM43789;
                    }
                    return C16142.m38056(xmlPullParser.getName(), j4, j2, c5560M43790, strArr, str, strSubstring, c16142);
                }

                /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
                public static boolean m43794(String str) {
                    return str.equals("tt") || str.equals("head") || str.equals("body") || str.equals("div") || str.equals(am.ax) || str.equals("span") || str.equals("br") || str.equals("style") || str.equals("styling") || str.equals("layout") || str.equals("region") || str.equals("metadata") || str.equals("image") || str.equals(e.m) || str.equals("information");
                }

                /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
                public static void m43792(String str, C5560 c5560) throws C2011 {
                    Matcher matcher;
                    String str2 = C3603.f11424;
                    String[] strArrSplit = str.split("\\s+", -1);
                    int length = strArrSplit.length;
                    Pattern pattern = f59824;
                    if (length == 1) {
                        matcher = pattern.matcher(str);
                    } else {
                        if (strArrSplit.length != 2) {
                            throw new C2011(C3200.m9831(strArrSplit.length, ".", new StringBuilder("Invalid number of entries for fontSize: ")));
                        }
                        matcher = pattern.matcher(strArrSplit[1]);
                        C19956.m46037("Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
                    }
                    if (!matcher.matches()) {
                        throw new C2011(C4860.m14172("Invalid expression for fontSize: '", str, "'."));
                    }
                    String strGroup = matcher.group(3);
                    strGroup.getClass();
                    switch (strGroup) {
                        case "%":
                            c5560.m15747(3);
                            break;
                        case "em":
                            c5560.m15747(2);
                            break;
                        case "px":
                            c5560.m15747(1);
                            break;
                        default:
                            throw new C2011(C4860.m14172("Invalid unit for fontSize: '", strGroup, "'."));
                    }
                    String strGroup2 = matcher.group(1);
                    strGroup2.getClass();
                    c5560.m15724(Float.parseFloat(strGroup2));
                }

                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                /* JADX WARN: Code duplicated, block: B:42:0x00da  */
                /* JADX WARN: Failed to find 'out' block for switch in B:43:0x00db. Please report as an issue. */
                /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
                public static long m43788(String str, C2738 c2738) throws C2011 {
                    double d;
                    double d2;
                    double d3;
                    Matcher matcher = f59823.matcher(str);
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
                        double d8 = d7 + (strGroup5 != null ? Long.parseLong(strGroup5) / c2738.f8529 : 0.0d);
                        String strGroup6 = matcher.group(6);
                        d = d8 + (strGroup6 != null ? (Long.parseLong(strGroup6) / ((double) c2738.f8530)) / ((double) c2738.f8529) : 0.0d);
                    } else {
                        Matcher matcher2 = f59822.matcher(str);
                        if (!matcher2.matches()) {
                            throw new C2011(C20094.m46315("Malformed time expression: ", str));
                        }
                        String strGroup7 = matcher2.group(1);
                        strGroup7.getClass();
                        d = Double.parseDouble(strGroup7);
                        String strGroup8 = matcher2.group(2);
                        strGroup8.getClass();
                        switch (strGroup8) {
                            case "f":
                                d2 = c2738.f8529;
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
                                d2 = c2738.f8531;
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
