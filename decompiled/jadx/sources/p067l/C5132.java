package p067l;

import android.graphics.Matrix;
import android.util.Xml;
import com.alipay.sdk.p010m.p041p.C0184a;
import com.alipay.sdk.p010m.p058y.C0254q;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.slider.BaseSlider;
import com.google.android.material.textfield.TextInputLayout;
import com.tencent.p062mm.opensdk.constants.ConstantsAPI;
import com.tencent.p062mm.opensdk.modelmsg.WXMediaMessage;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.zip.GZIPInputStream;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParserFactory;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import org.bouncycastle.crypto.engines.ThreefishEngine;
import org.bouncycastle.crypto.prng.X931RNG;
import org.bouncycastle.jcajce.provider.config.ProviderConfigurationPermission;
import org.bouncycastle.pqc.math.ntru.HRSS1373Polynomial;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: l.ۗ֨ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: KB7N */
/* JADX INFO: loaded from: classes2.dex */
public final class C5132 {

    /* JADX INFO: renamed from: ۜ */
    public boolean f12057;

    /* JADX INFO: renamed from: ۧ */
    public int f12060;

    /* JADX INFO: renamed from: ᩷ */
    public boolean f12065;

    /* JADX INFO: renamed from: ۡ */
    public C17871 f12058 = null;

    /* JADX INFO: renamed from: ֫ */
    public InterfaceC5921 f12056 = null;

    /* JADX INFO: renamed from: ܽ */
    public boolean f12062 = false;

    /* JADX INFO: renamed from: ᩳ */
    public boolean f12064 = false;

    /* JADX INFO: renamed from: ᩻ */
    public EnumC23237 f12066 = null;

    /* JADX INFO: renamed from: ܳ */
    public StringBuilder f12061 = null;

    /* JADX INFO: renamed from: ܿ */
    public boolean f12063 = false;

    /* JADX INFO: renamed from: ۢ */
    public StringBuilder f12059 = null;

    /* JADX INFO: renamed from: ֫ */
    public final C17871 m10957(InputStream inputStream, boolean z) {
        this.f12057 = z;
        if (!inputStream.markSupported()) {
            inputStream = new BufferedInputStream(inputStream);
        }
        try {
            inputStream.mark(3);
            int i = inputStream.read() + (inputStream.read() << 8);
            inputStream.reset();
            if (i == 35615) {
                inputStream = new BufferedInputStream(new GZIPInputStream(inputStream));
            }
        } catch (IOException unused) {
        }
        try {
            inputStream.mark(4096);
            m10945(inputStream);
            if (z && !this.f12065) {
                throw new C20555("SVG root element is missing");
            }
            try {
                inputStream.close();
            } catch (IOException unused2) {
            }
            return this.f12058;
        } catch (Throwable th) {
            try {
                inputStream.close();
            } catch (IOException unused3) {
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    private void m10945(InputStream inputStream) throws C20555 {
        String text;
        try {
            try {
                XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
                C6473 c6473 = new C6473(xmlPullParserNewPullParser);
                xmlPullParserNewPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-docdecl", false);
                xmlPullParserNewPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", true);
                xmlPullParserNewPullParser.setInput(inputStream, null);
                for (int eventType = xmlPullParserNewPullParser.getEventType(); eventType != 1; eventType = xmlPullParserNewPullParser.nextToken()) {
                    if (eventType == 0) {
                        this.f12058 = new C17871();
                        this.f12065 = false;
                    } else if (eventType == 8) {
                        xmlPullParserNewPullParser.getText();
                        C21226 c21226 = new C21226(xmlPullParserNewPullParser.getText());
                        String strM47961 = c21226.m47961();
                        m10951(c21226);
                        strM47961.equals("xml-stylesheet");
                    } else if (eventType == 10) {
                        if (this.f12058.m40624() == null && xmlPullParserNewPullParser.getText().contains("<!ENTITY ")) {
                            try {
                                inputStream.reset();
                                m10919(inputStream);
                                return;
                            } catch (IOException unused) {
                                return;
                            }
                        }
                    } else if (eventType == 2) {
                        String name = xmlPullParserNewPullParser.getName();
                        if (xmlPullParserNewPullParser.getPrefix() != null) {
                            name = xmlPullParserNewPullParser.getPrefix() + ':' + name;
                        }
                        m10922(xmlPullParserNewPullParser.getNamespace(), xmlPullParserNewPullParser.getName(), name, c6473);
                    } else if (eventType == 3) {
                        String name2 = xmlPullParserNewPullParser.getName();
                        if (xmlPullParserNewPullParser.getPrefix() != null) {
                            name2 = xmlPullParserNewPullParser.getPrefix() + ':' + name2;
                        }
                        m10921(xmlPullParserNewPullParser.getNamespace(), xmlPullParserNewPullParser.getName(), name2);
                    } else if (eventType == 4) {
                        int[] iArr = new int[2];
                        m10938(xmlPullParserNewPullParser.getTextCharacters(iArr), iArr[0], iArr[1]);
                    } else if (eventType == 5) {
                        m10950(xmlPullParserNewPullParser.getText());
                    } else if (eventType == 6 && (text = xmlPullParserNewPullParser.getText()) != null) {
                        m10950(text);
                    }
                }
            } catch (XmlPullParserException e) {
                throw new C20555("XML parser problem", e);
            }
        } catch (IOException e2) {
            throw new C20555("Stream error", e2);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m10919(InputStream inputStream) throws C20555 {
        try {
            SAXParserFactory sAXParserFactoryNewInstance = SAXParserFactory.newInstance();
            if (this.f12057) {
                sAXParserFactoryNewInstance.setNamespaceAware(true);
            }
            sAXParserFactoryNewInstance.setFeature("http://xml.org/sax/features/external-general-entities", false);
            sAXParserFactoryNewInstance.setFeature("http://xml.org/sax/features/external-parameter-entities", false);
            XMLReader xMLReader = sAXParserFactoryNewInstance.newSAXParser().getXMLReader();
            C16530 c16530 = new C16530(this);
            xMLReader.setContentHandler(c16530);
            xMLReader.setProperty("http://xml.org/sax/properties/lexical-handler", c16530);
            xMLReader.parse(new InputSource(inputStream));
        } catch (IOException e) {
            throw new C20555("Stream error", e);
        } catch (ParserConfigurationException e2) {
            throw new C20555("XML parser problem", e2);
        } catch (SAXException e3) {
            throw new C20555("SVG parse error", e3);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m10925(C5132 c5132) {
        c5132.f12058 = new C17871();
        c5132.f12065 = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:463:0x08dd  */
    /* JADX WARN: Code duplicated, block: B:466:0x08e4  */
    /* JADX WARN: Code duplicated, block: B:787:0x0907 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:793:0x0903 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX INFO: renamed from: ֫ */
    public void m10922(String str, String str2, String str3, Attributes attributes) throws C20555 {
        int iIntValue;
        float fM47959;
        float f;
        float f2;
        float f3;
        float f4;
        int i;
        char cCharAt;
        boolean z;
        Attributes attributes2 = attributes;
        if (this.f12057 && !this.f12065) {
            if (!"svg".equals(str2.length() > 0 ? str2 : str3) || (!"http://www.w3.org/2000/svg".equals(str) && !"".equals(str))) {
                throw new C20555("Image XML root is not SVG");
            }
            this.f12065 = true;
        }
        if (this.f12062) {
            this.f12060++;
            return;
        }
        if ("http://www.w3.org/2000/svg".equals(str) || "".equals(str)) {
            EnumC23237 enumC23237M51782 = EnumC23237.m51782(str2.length() > 0 ? str2 : str3);
            int i2 = 77;
            switch (enumC23237M51782.ordinal()) {
                case 0:
                    m10947(attributes2);
                    return;
                case 1:
                case 7:
                    if (this.f12056 == null) {
                        throw new C20555("Invalid document. Root element must be <svg>");
                    }
                    C20535 c20535 = new C20535();
                    c20535.f18929 = this.f12058;
                    c20535.f18930 = this.f12056;
                    m10934((AbstractC20674) c20535, attributes2);
                    m10946(c20535, attributes2);
                    m10923((InterfaceC2428) c20535, attributes2);
                    m10930((InterfaceC10615) c20535, attributes2);
                    this.f12056.mo9276(c20535);
                    this.f12056 = c20535;
                    return;
                case 2:
                    m10937(attributes2);
                    return;
                case 3:
                    if (this.f12056 == null) {
                        throw new C20555("Invalid document. Root element must be <svg>");
                    }
                    C8464 c8464 = new C8464();
                    c8464.f18929 = this.f12058;
                    c8464.f18930 = this.f12056;
                    m10934((AbstractC20674) c8464, attributes2);
                    m10946(c8464, attributes2);
                    m10923((InterfaceC2428) c8464, attributes2);
                    m10930((InterfaceC10615) c8464, attributes2);
                    for (int i3 = 0; i3 < attributes.getLength(); i3++) {
                        String strTrim = attributes2.getValue(i3).trim();
                        if (EnumC22567.m50588(attributes2.getLocalName(i3)).ordinal() == 3) {
                            if ("objectBoundingBox".equals(strTrim)) {
                                c8464.f22721 = Boolean.FALSE;
                            } else {
                                if (!"userSpaceOnUse".equals(strTrim)) {
                                    throw new C20555("Invalid value for attribute clipPathUnits");
                                }
                                c8464.f22721 = Boolean.TRUE;
                            }
                        }
                    }
                    this.f12056.mo9276(c8464);
                    this.f12056 = c8464;
                    return;
                case 4:
                    if (this.f12056 == null) {
                        throw new C20555("Invalid document. Root element must be <svg>");
                    }
                    C10476 c10476 = new C10476();
                    c10476.f18929 = this.f12058;
                    c10476.f18930 = this.f12056;
                    m10934((AbstractC20674) c10476, attributes2);
                    m10946(c10476, attributes2);
                    m10923((InterfaceC2428) c10476, attributes2);
                    this.f12056.mo9276(c10476);
                    this.f12056 = c10476;
                    return;
                case 5:
                case 26:
                    this.f12064 = true;
                    this.f12066 = enumC23237M51782;
                    return;
                case 6:
                    if (this.f12056 == null) {
                        throw new C20555("Invalid document. Root element must be <svg>");
                    }
                    C17180 c17180 = new C17180();
                    c17180.f18929 = this.f12058;
                    c17180.f18930 = this.f12056;
                    m10934((AbstractC20674) c17180, attributes2);
                    m10946(c17180, attributes2);
                    m10923((InterfaceC2428) c17180, attributes2);
                    m10930((InterfaceC10615) c17180, attributes2);
                    for (int i4 = 0; i4 < attributes.getLength(); i4++) {
                        String strTrim2 = attributes2.getValue(i4).trim();
                        int iOrdinal = EnumC22567.m50588(attributes2.getLocalName(i4)).ordinal();
                        if (iOrdinal == 6) {
                            c17180.f51148 = m10956(strTrim2);
                        } else if (iOrdinal == 7) {
                            c17180.f51149 = m10956(strTrim2);
                        } else if (iOrdinal == 56) {
                            C3099 c3099M10956 = m10956(strTrim2);
                            c17180.f51146 = c3099M10956;
                            if (c3099M10956.m5259()) {
                                throw new C20555("Invalid <ellipse> element. rx cannot be negative");
                            }
                        } else if (iOrdinal != 57) {
                            continue;
                        } else {
                            C3099 c3099M10957 = m10956(strTrim2);
                            c17180.f51147 = c3099M10957;
                            if (c3099M10957.m5259()) {
                                throw new C20555("Invalid <ellipse> element. ry cannot be negative");
                            }
                        }
                    }
                    this.f12056.mo9276(c17180);
                    return;
                case 8:
                    if (this.f12056 == null) {
                        throw new C20555("Invalid document. Root element must be <svg>");
                    }
                    C7123 c7123 = new C7123();
                    c7123.f18929 = this.f12058;
                    c7123.f18930 = this.f12056;
                    m10934((AbstractC20674) c7123, attributes2);
                    m10946(c7123, attributes2);
                    m10923((InterfaceC2428) c7123, attributes2);
                    m10930((InterfaceC10615) c7123, attributes2);
                    for (int i5 = 0; i5 < attributes.getLength(); i5++) {
                        String strTrim3 = attributes2.getValue(i5).trim();
                        int iOrdinal2 = EnumC22567.m50588(attributes2.getLocalName(i5)).ordinal();
                        if (iOrdinal2 == 25) {
                            C3099 c3099M10958 = m10956(strTrim3);
                            c7123.f18603 = c3099M10958;
                            if (c3099M10958.m5259()) {
                                throw new C20555("Invalid <use> element. height cannot be negative");
                            }
                        } else if (iOrdinal2 != 26) {
                            if (iOrdinal2 != 48) {
                                switch (iOrdinal2) {
                                    case 81:
                                        C3099 c3099M10959 = m10956(strTrim3);
                                        c7123.f18601 = c3099M10959;
                                        if (c3099M10959.m5259()) {
                                            throw new C20555("Invalid <use> element. width cannot be negative");
                                        }
                                        break;
                                        break;
                                    case 82:
                                        c7123.f18600 = m10956(strTrim3);
                                        break;
                                    case BaseSlider.DEFAULT_LABEL_ANIMATION_ENTER_DURATION /* 83 */:
                                        c7123.f18602 = m10956(strTrim3);
                                        break;
                                }
                            } else {
                                m10929(c7123, strTrim3);
                            }
                        } else if ("".equals(attributes2.getURI(i5)) || "http://www.w3.org/1999/xlink".equals(attributes2.getURI(i5))) {
                            c7123.f18604 = strTrim3;
                        }
                    }
                    this.f12056.mo9276(c7123);
                    this.f12056 = c7123;
                    return;
                case 9:
                    if (this.f12056 == null) {
                        throw new C20555("Invalid document. Root element must be <svg>");
                    }
                    C9805 c9805 = new C9805();
                    c9805.f18929 = this.f12058;
                    c9805.f18930 = this.f12056;
                    m10934((AbstractC20674) c9805, attributes2);
                    m10946(c9805, attributes2);
                    m10923((InterfaceC2428) c9805, attributes2);
                    m10930((InterfaceC10615) c9805, attributes2);
                    for (int i6 = 0; i6 < attributes.getLength(); i6++) {
                        String strTrim4 = attributes2.getValue(i6).trim();
                        switch (EnumC22567.m50588(attributes2.getLocalName(i6)).ordinal()) {
                            case 84:
                                c9805.f27141 = m10956(strTrim4);
                                break;
                            case 85:
                                c9805.f27139 = m10956(strTrim4);
                                break;
                            case HRSS1373Polynomial.f81792K /* 86 */:
                                c9805.f27142 = m10956(strTrim4);
                                break;
                            case TextInputLayout.DEFAULT_PLACEHOLDER_FADE_DURATION /* 87 */:
                                c9805.f27140 = m10956(strTrim4);
                                break;
                        }
                    }
                    this.f12056.mo9276(c9805);
                    return;
                case 10:
                    if (this.f12056 == null) {
                        throw new C20555("Invalid document. Root element must be <svg>");
                    }
                    C2567 c2567 = new C2567();
                    c2567.f18929 = this.f12058;
                    c2567.f18930 = this.f12056;
                    m10934((AbstractC20674) c2567, attributes2);
                    m10946(c2567, attributes2);
                    m10924((AbstractC4441) c2567, attributes2);
                    for (int i7 = 0; i7 < attributes.getLength(); i7++) {
                        String strTrim5 = attributes2.getValue(i7).trim();
                        switch (EnumC22567.m50588(attributes2.getLocalName(i7)).ordinal()) {
                            case 84:
                                c2567.f4233 = m10956(strTrim5);
                                break;
                            case 85:
                                c2567.f4235 = m10956(strTrim5);
                                break;
                            case HRSS1373Polynomial.f81792K /* 86 */:
                                c2567.f4234 = m10956(strTrim5);
                                break;
                            case TextInputLayout.DEFAULT_PLACEHOLDER_FADE_DURATION /* 87 */:
                                c2567.f4236 = m10956(strTrim5);
                                break;
                        }
                    }
                    this.f12056.mo9276(c2567);
                    this.f12056 = c2567;
                    return;
                case 11:
                    if (this.f12056 == null) {
                        throw new C20555("Invalid document. Root element must be <svg>");
                    }
                    C16510 c16510 = new C16510();
                    c16510.f18929 = this.f12058;
                    c16510.f18930 = this.f12056;
                    m10934((AbstractC20674) c16510, attributes2);
                    m10946(c16510, attributes2);
                    m10930((InterfaceC10615) c16510, attributes2);
                    m10936((AbstractC22685) c16510, attributes2);
                    for (int i8 = 0; i8 < attributes.getLength(); i8++) {
                        String strTrim6 = attributes2.getValue(i8).trim();
                        int iOrdinal3 = EnumC22567.m50588(attributes2.getLocalName(i8)).ordinal();
                        if (iOrdinal3 != 41) {
                            if (iOrdinal3 == 50) {
                                c16510.f48533 = m10956(strTrim6);
                            } else if (iOrdinal3 != 51) {
                                switch (iOrdinal3) {
                                    case 32:
                                        C3099 c3099M109510 = m10956(strTrim6);
                                        c16510.f48535 = c3099M109510;
                                        if (c3099M109510.m5259()) {
                                            throw new C20555("Invalid <marker> element. markerHeight cannot be negative");
                                        }
                                        break;
                                    case 33:
                                        if (!"strokeWidth".equals(strTrim6)) {
                                            if (!"userSpaceOnUse".equals(strTrim6)) {
                                                throw new C20555("Invalid value for attribute markerUnits");
                                            }
                                            c16510.f48530 = true;
                                        } else {
                                            c16510.f48530 = false;
                                        }
                                        break;
                                    case 34:
                                        C3099 c3099M109511 = m10956(strTrim6);
                                        c16510.f48532 = c3099M109511;
                                        if (c3099M109511.m5259()) {
                                            throw new C20555("Invalid <marker> element. markerWidth cannot be negative");
                                        }
                                        break;
                                }
                            } else {
                                c16510.f48534 = m10956(strTrim6);
                            }
                        } else if ("auto".equals(strTrim6)) {
                            c16510.f48531 = Float.valueOf(Float.NaN);
                        } else {
                            c16510.f48531 = Float.valueOf(m10954(strTrim6));
                        }
                    }
                    this.f12056.mo9276(c16510);
                    this.f12056 = c16510;
                    return;
                case 12:
                    if (this.f12056 == null) {
                        throw new C20555("Invalid document. Root element must be <svg>");
                    }
                    C22547 c22547 = new C22547();
                    c22547.f18929 = this.f12058;
                    c22547.f18930 = this.f12056;
                    m10934((AbstractC20674) c22547, attributes);
                    m10946(c22547, attributes);
                    m10930((InterfaceC10615) c22547, attributes);
                    for (int i9 = 0; i9 < attributes.getLength(); i9++) {
                        String strTrim7 = attributes.getValue(i9).trim();
                        int iOrdinal4 = EnumC22567.m50588(attributes.getLocalName(i9)).ordinal();
                        if (iOrdinal4 == 25) {
                            C3099 c3099M109512 = m10956(strTrim7);
                            c22547.f71122 = c3099M109512;
                            if (c3099M109512.m5259()) {
                                throw new C20555("Invalid <mask> element. height cannot be negative");
                            }
                        } else if (iOrdinal4 != 36) {
                            if (iOrdinal4 != 37) {
                                switch (iOrdinal4) {
                                    case 81:
                                        C3099 c3099M109513 = m10956(strTrim7);
                                        c22547.f71121 = c3099M109513;
                                        if (c3099M109513.m5259()) {
                                            throw new C20555("Invalid <mask> element. width cannot be negative");
                                        }
                                        break;
                                        break;
                                    case 82:
                                        m10956(strTrim7);
                                        break;
                                    case BaseSlider.DEFAULT_LABEL_ANIMATION_ENTER_DURATION /* 83 */:
                                        m10956(strTrim7);
                                        break;
                                }
                            } else if ("objectBoundingBox".equals(strTrim7)) {
                                c22547.f71124 = Boolean.FALSE;
                            } else {
                                if (!"userSpaceOnUse".equals(strTrim7)) {
                                    throw new C20555("Invalid value for attribute maskUnits");
                                }
                                c22547.f71124 = Boolean.TRUE;
                            }
                        } else if ("objectBoundingBox".equals(strTrim7)) {
                            c22547.f71123 = Boolean.FALSE;
                        } else {
                            if (!"userSpaceOnUse".equals(strTrim7)) {
                                throw new C20555("Invalid value for attribute maskContentUnits");
                            }
                            c22547.f71123 = Boolean.TRUE;
                        }
                    }
                    this.f12056.mo9276(c22547);
                    this.f12056 = c22547;
                    return;
                case 13:
                    if (this.f12056 == null) {
                        throw new C20555("Invalid document. Root element must be <svg>");
                    }
                    C6453 c6453 = new C6453();
                    c6453.f18929 = this.f12058;
                    c6453.f18930 = this.f12056;
                    m10934((AbstractC20674) c6453, attributes2);
                    m10946(c6453, attributes2);
                    m10923((InterfaceC2428) c6453, attributes2);
                    m10930((InterfaceC10615) c6453, attributes2);
                    int i10 = 0;
                    while (i10 < attributes.getLength()) {
                        String strTrim8 = attributes2.getValue(i10).trim();
                        int iOrdinal5 = EnumC22567.m50588(attributes2.getLocalName(i10)).ordinal();
                        if (iOrdinal5 == 13) {
                            C21226 c21226 = new C21226(strTrim8);
                            C5112 c5112 = new C5112();
                            if (!c21226.m47955() && ((iIntValue = c21226.m47957().intValue()) == i2 || iIntValue == 109)) {
                                float f5 = 0.0f;
                                float fM479510 = 0.0f;
                                float f6 = 0.0f;
                                float fM47947 = 0.0f;
                                float f7 = 0.0f;
                                float f8 = 0.0f;
                                while (true) {
                                    c21226.m47954();
                                    switch (iIntValue) {
                                        case 65:
                                        case 97:
                                            float fM479511 = c21226.m47959();
                                            float fM47948 = c21226.m47947(fM479511);
                                            float fM47949 = c21226.m47947(fM47948);
                                            Boolean boolM47949 = c21226.m47949(Float.valueOf(fM47949));
                                            Boolean boolM479410 = c21226.m47949(boolM47949);
                                            if (boolM479410 == null) {
                                                fM47959 = Float.NaN;
                                            } else {
                                                c21226.m47960();
                                                fM47959 = c21226.m47959();
                                            }
                                            float fM479410 = c21226.m47947(fM47959);
                                            if (!Float.isNaN(fM479410)) {
                                                if (fM479511 >= 0.0f && fM47948 >= 0.0f) {
                                                    if (iIntValue == 97) {
                                                        fM47959 += f5;
                                                        fM479410 += f6;
                                                    }
                                                    f5 = fM47959;
                                                    float f9 = fM479410;
                                                    c5112.mo10893(fM479511, fM47948, fM47949, boolM47949.booleanValue(), boolM479410.booleanValue(), f5, f9);
                                                    fM47947 = f9;
                                                    fM479510 = f5;
                                                    f6 = fM47947;
                                                    c21226.m47960();
                                                    if (c21226.m47955()) {
                                                        i = c21226.f66740;
                                                        if (i != c21226.f66738 && (((cCharAt = c21226.f66737.charAt(i)) >= 'a' && cCharAt <= 'z') || (cCharAt >= 'A' && cCharAt <= 'Z'))) {
                                                            iIntValue = c21226.m47957().intValue();
                                                        }
                                                    }
                                                }
                                            }
                                            break;
                                        case 67:
                                        case C0254q.f1216f /* 99 */:
                                            float fM479512 = c21226.m47959();
                                            float fM479411 = c21226.m47947(fM479512);
                                            float fM479412 = c21226.m47947(fM479411);
                                            float fM479413 = c21226.m47947(fM479412);
                                            float fM479414 = c21226.m47947(fM479413);
                                            float fM479415 = c21226.m47947(fM479414);
                                            if (!Float.isNaN(fM479415)) {
                                                if (iIntValue == 99) {
                                                    fM479414 += f5;
                                                    fM479415 += f6;
                                                    fM479512 += f5;
                                                    fM479411 += f6;
                                                    fM479412 += f5;
                                                    fM479413 += f6;
                                                }
                                                f = fM479412;
                                                f2 = fM479413;
                                                f3 = fM479414;
                                                f4 = fM479415;
                                                c5112.mo10892(fM479512, fM479411, f, f2, f3, f4);
                                                fM479510 = f;
                                                fM47947 = f2;
                                                f5 = f3;
                                                f6 = f4;
                                                c21226.m47960();
                                                if (c21226.m47955()) {
                                                    i = c21226.f66740;
                                                    if (i != c21226.f66738) {
                                                        iIntValue = c21226.m47957().intValue();
                                                    }
                                                }
                                            }
                                            break;
                                        case 72:
                                        case IShizukuService.Stub.TRANSACTION_isHidden /* 104 */:
                                            fM479510 = c21226.m47959();
                                            if (!Float.isNaN(fM479510)) {
                                                if (iIntValue == 104) {
                                                    fM479510 += f5;
                                                }
                                                c5112.mo10895(fM479510, f6);
                                                f5 = fM479510;
                                                c21226.m47960();
                                                if (c21226.m47955()) {
                                                    i = c21226.f66740;
                                                    if (i != c21226.f66738) {
                                                        iIntValue = c21226.m47957().intValue();
                                                    }
                                                }
                                            }
                                            break;
                                        case WXMediaMessage.IMediaObject.TYPE_MUSIC_VIDEO /* 76 */:
                                        case 108:
                                            float fM479513 = c21226.m47959();
                                            fM47947 = c21226.m47947(fM479513);
                                            if (!Float.isNaN(fM47947)) {
                                                if (iIntValue == 108) {
                                                    fM479513 += f5;
                                                    fM47947 += f6;
                                                }
                                                f5 = fM479513;
                                                c5112.mo10895(f5, fM47947);
                                                fM479510 = f5;
                                                f6 = fM47947;
                                                c21226.m47960();
                                                if (c21226.m47955()) {
                                                    i = c21226.f66740;
                                                    if (i != c21226.f66738) {
                                                        iIntValue = c21226.m47957().intValue();
                                                    }
                                                }
                                            }
                                            break;
                                        case 77:
                                        case 109:
                                            fM479510 = c21226.m47959();
                                            fM47947 = c21226.m47947(fM479510);
                                            if (!Float.isNaN(fM47947)) {
                                                if (iIntValue == 109 && !c5112.m10896()) {
                                                    fM479510 += f5;
                                                    fM47947 += f6;
                                                }
                                                c5112.mo10890(fM479510, fM47947);
                                                iIntValue = iIntValue == 109 ? 108 : 76;
                                                f5 = fM479510;
                                                f7 = f5;
                                                f6 = fM47947;
                                                f8 = f6;
                                                c21226.m47960();
                                                if (c21226.m47955()) {
                                                    i = c21226.f66740;
                                                    if (i != c21226.f66738) {
                                                        iIntValue = c21226.m47957().intValue();
                                                    }
                                                }
                                            }
                                            break;
                                        case 81:
                                        case UMErrorCode.E_UM_BE_RAW_OVERSIZE /* 113 */:
                                            fM479510 = c21226.m47959();
                                            fM47947 = c21226.m47947(fM479510);
                                            float fM479416 = c21226.m47947(fM47947);
                                            float fM479417 = c21226.m47947(fM479416);
                                            if (!Float.isNaN(fM479417)) {
                                                if (iIntValue == 113) {
                                                    fM479416 += f5;
                                                    fM479417 += f6;
                                                    fM479510 += f5;
                                                    fM47947 += f6;
                                                }
                                                c5112.mo10891(fM479510, fM47947, fM479416, fM479417);
                                                f5 = fM479416;
                                                f6 = fM479417;
                                                c21226.m47960();
                                                if (c21226.m47955()) {
                                                    i = c21226.f66740;
                                                    if (i != c21226.f66738) {
                                                        iIntValue = c21226.m47957().intValue();
                                                    }
                                                }
                                            }
                                            break;
                                        case BaseSlider.DEFAULT_LABEL_ANIMATION_ENTER_DURATION /* 83 */:
                                        case 115:
                                            float f10 = (f5 * 2.0f) - fM479510;
                                            float f11 = (2.0f * f6) - fM47947;
                                            float fM479514 = c21226.m47959();
                                            float fM479418 = c21226.m47947(fM479514);
                                            float fM479419 = c21226.m47947(fM479418);
                                            float fM479420 = c21226.m47947(fM479419);
                                            if (!Float.isNaN(fM479420)) {
                                                if (iIntValue == 115) {
                                                    fM479419 += f5;
                                                    fM479420 += f6;
                                                    fM479514 += f5;
                                                    fM479418 += f6;
                                                }
                                                f = fM479514;
                                                f2 = fM479418;
                                                f3 = fM479419;
                                                f4 = fM479420;
                                                c5112.mo10892(f10, f11, f, f2, f3, f4);
                                                fM479510 = f;
                                                fM47947 = f2;
                                                f5 = f3;
                                                f6 = f4;
                                                c21226.m47960();
                                                if (c21226.m47955()) {
                                                    i = c21226.f66740;
                                                    if (i != c21226.f66738) {
                                                        iIntValue = c21226.m47957().intValue();
                                                    }
                                                }
                                            }
                                            break;
                                        case 84:
                                        case 116:
                                            float f12 = (f5 * 2.0f) - fM479510;
                                            float f13 = (2.0f * f6) - fM47947;
                                            float fM479515 = c21226.m47959();
                                            float fM479421 = c21226.m47947(fM479515);
                                            if (!Float.isNaN(fM479421)) {
                                                if (iIntValue == 116) {
                                                    fM479515 += f5;
                                                    fM479421 += f6;
                                                }
                                                c5112.mo10891(f12, f13, fM479515, fM479421);
                                                f5 = fM479515;
                                                f6 = fM479421;
                                                fM479510 = f12;
                                                fM47947 = f13;
                                                c21226.m47960();
                                                if (c21226.m47955()) {
                                                    i = c21226.f66740;
                                                    if (i != c21226.f66738) {
                                                        iIntValue = c21226.m47957().intValue();
                                                    }
                                                }
                                            }
                                            break;
                                        case HRSS1373Polynomial.f81792K /* 86 */:
                                        case 118:
                                            fM47947 = c21226.m47959();
                                            if (!Float.isNaN(fM47947)) {
                                                if (iIntValue == 118) {
                                                    fM47947 += f6;
                                                }
                                                c5112.mo10895(f5, fM47947);
                                                f6 = fM47947;
                                                c21226.m47960();
                                                if (c21226.m47955()) {
                                                    i = c21226.f66740;
                                                    if (i != c21226.f66738) {
                                                        iIntValue = c21226.m47957().intValue();
                                                    }
                                                }
                                            }
                                            break;
                                        case 90:
                                        case 122:
                                            c5112.close();
                                            f5 = f7;
                                            fM479510 = f5;
                                            fM47947 = f8;
                                            f6 = fM47947;
                                            c21226.m47960();
                                            if (c21226.m47955()) {
                                                i = c21226.f66740;
                                                if (i != c21226.f66738) {
                                                    iIntValue = c21226.m47957().intValue();
                                                }
                                            }
                                            break;
                                        default:
                                            break;
                                    }
                                }
                            }
                            c6453.f16680 = c5112;
                        } else if (iOrdinal5 == 43 && m10954(strTrim8) < 0.0f) {
                            throw new C20555("Invalid <path> element. pathLength cannot be negative");
                        }
                        i10++;
                        i2 = 77;
                        attributes2 = attributes;
                    }
                    this.f12056.mo9276(c6453);
                    return;
                case 14:
                    if (this.f12056 == null) {
                        throw new C20555("Invalid document. Root element must be <svg>");
                    }
                    C13829 c13829 = new C13829();
                    c13829.f18929 = this.f12058;
                    c13829.f18930 = this.f12056;
                    m10934((AbstractC20674) c13829, attributes2);
                    m10946(c13829, attributes2);
                    m10930((InterfaceC10615) c13829, attributes2);
                    m10936((AbstractC22685) c13829, attributes2);
                    for (int i11 = 0; i11 < attributes.getLength(); i11++) {
                        String strTrim9 = attributes2.getValue(i11).trim();
                        int iOrdinal6 = EnumC22567.m50588(attributes2.getLocalName(i11)).ordinal();
                        if (iOrdinal6 == 25) {
                            C3099 c3099M109514 = m10956(strTrim9);
                            c13829.f39085 = c3099M109514;
                            if (c3099M109514.m5259()) {
                                throw new C20555("Invalid <pattern> element. height cannot be negative");
                            }
                        } else if (iOrdinal6 != 26) {
                            switch (iOrdinal6) {
                                case 44:
                                    if (!"objectBoundingBox".equals(strTrim9)) {
                                        if (!"userSpaceOnUse".equals(strTrim9)) {
                                            throw new C20555("Invalid value for attribute patternContentUnits");
                                        }
                                        c13829.f39082 = Boolean.TRUE;
                                    } else {
                                        c13829.f39082 = Boolean.FALSE;
                                    }
                                    break;
                                case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                                    c13829.f39081 = m10941(strTrim9);
                                    break;
                                case 46:
                                    if (!"objectBoundingBox".equals(strTrim9)) {
                                        if (!"userSpaceOnUse".equals(strTrim9)) {
                                            throw new C20555("Invalid value for attribute patternUnits");
                                        }
                                        c13829.f39083 = Boolean.TRUE;
                                    } else {
                                        c13829.f39083 = Boolean.FALSE;
                                    }
                                    break;
                                default:
                                    switch (iOrdinal6) {
                                        case 81:
                                            C3099 c3099M109515 = m10956(strTrim9);
                                            c13829.f39084 = c3099M109515;
                                            if (c3099M109515.m5259()) {
                                                throw new C20555("Invalid <pattern> element. width cannot be negative");
                                            }
                                            break;
                                            break;
                                        case 82:
                                            c13829.f39086 = m10956(strTrim9);
                                            break;
                                        case BaseSlider.DEFAULT_LABEL_ANIMATION_ENTER_DURATION /* 83 */:
                                            c13829.f39087 = m10956(strTrim9);
                                            break;
                                    }
                                    break;
                            }
                        } else if ("".equals(attributes2.getURI(i11)) || "http://www.w3.org/1999/xlink".equals(attributes2.getURI(i11))) {
                            c13829.f39080 = strTrim9;
                        }
                    }
                    this.f12056.mo9276(c13829);
                    this.f12056 = c13829;
                    return;
                case 15:
                    if (this.f12056 == null) {
                        throw new C20555("Invalid document. Root element must be <svg>");
                    }
                    C7794 c7794 = new C7794();
                    c7794.f18929 = this.f12058;
                    c7794.f18930 = this.f12056;
                    m10934((AbstractC20674) c7794, attributes2);
                    m10946(c7794, attributes2);
                    m10923((InterfaceC2428) c7794, attributes2);
                    m10930((InterfaceC10615) c7794, attributes2);
                    m10931(c7794, attributes2, "polygon");
                    this.f12056.mo9276(c7794);
                    return;
                case 16:
                    if (this.f12056 == null) {
                        throw new C20555("Invalid document. Root element must be <svg>");
                    }
                    C11818 c11818 = new C11818();
                    c11818.f18929 = this.f12058;
                    c11818.f18930 = this.f12056;
                    m10934((AbstractC20674) c11818, attributes2);
                    m10946(c11818, attributes2);
                    m10923((InterfaceC2428) c11818, attributes2);
                    m10930((InterfaceC10615) c11818, attributes2);
                    m10931(c11818, attributes2, "polyline");
                    this.f12056.mo9276(c11818);
                    return;
                case 17:
                    if (this.f12056 == null) {
                        throw new C20555("Invalid document. Root element must be <svg>");
                    }
                    C16648 c16648 = new C16648();
                    c16648.f18929 = this.f12058;
                    c16648.f18930 = this.f12056;
                    m10934((AbstractC20674) c16648, attributes2);
                    m10946(c16648, attributes2);
                    m10924((AbstractC4441) c16648, attributes2);
                    for (int i12 = 0; i12 < attributes.getLength(); i12++) {
                        String strTrim10 = attributes2.getValue(i12).trim();
                        int iOrdinal7 = EnumC22567.m50588(attributes2.getLocalName(i12)).ordinal();
                        if (iOrdinal7 == 6) {
                            c16648.f48915 = m10956(strTrim10);
                        } else if (iOrdinal7 == 7) {
                            c16648.f48916 = m10956(strTrim10);
                        } else if (iOrdinal7 == 11) {
                            c16648.f48917 = m10956(strTrim10);
                        } else if (iOrdinal7 == 12) {
                            c16648.f48918 = m10956(strTrim10);
                        } else if (iOrdinal7 != 49) {
                            continue;
                        } else {
                            C3099 c3099M109516 = m10956(strTrim10);
                            c16648.f48914 = c3099M109516;
                            if (c3099M109516.m5259()) {
                                throw new C20555("Invalid <radialGradient> element. r cannot be negative");
                            }
                        }
                    }
                    this.f12056.mo9276(c16648);
                    this.f12056 = c16648;
                    return;
                case 18:
                    if (this.f12056 == null) {
                        throw new C20555("Invalid document. Root element must be <svg>");
                    }
                    C13159 c13159 = new C13159();
                    c13159.f18929 = this.f12058;
                    c13159.f18930 = this.f12056;
                    m10934((AbstractC20674) c13159, attributes2);
                    m10946(c13159, attributes2);
                    m10923((InterfaceC2428) c13159, attributes2);
                    m10930((InterfaceC10615) c13159, attributes2);
                    for (int i13 = 0; i13 < attributes.getLength(); i13++) {
                        String strTrim11 = attributes2.getValue(i13).trim();
                        int iOrdinal8 = EnumC22567.m50588(attributes2.getLocalName(i13)).ordinal();
                        if (iOrdinal8 == 25) {
                            C3099 c3099M109517 = m10956(strTrim11);
                            c13159.f36983 = c3099M109517;
                            if (c3099M109517.m5259()) {
                                throw new C20555("Invalid <rect> element. height cannot be negative");
                            }
                        } else if (iOrdinal8 == 56) {
                            C3099 c3099M109518 = m10956(strTrim11);
                            c13159.f36984 = c3099M109518;
                            if (c3099M109518.m5259()) {
                                throw new C20555("Invalid <rect> element. rx cannot be negative");
                            }
                        } else if (iOrdinal8 != 57) {
                            switch (iOrdinal8) {
                                case 81:
                                    C3099 c3099M109519 = m10956(strTrim11);
                                    c13159.f36981 = c3099M109519;
                                    if (c3099M109519.m5259()) {
                                        throw new C20555("Invalid <rect> element. width cannot be negative");
                                    }
                                    break;
                                    break;
                                case 82:
                                    c13159.f36980 = m10956(strTrim11);
                                    break;
                                case BaseSlider.DEFAULT_LABEL_ANIMATION_ENTER_DURATION /* 83 */:
                                    c13159.f36982 = m10956(strTrim11);
                                    break;
                            }
                        } else {
                            C3099 c3099M109520 = m10956(strTrim11);
                            c13159.f36979 = c3099M109520;
                            if (c3099M109520.m5259()) {
                                throw new C20555("Invalid <rect> element. ry cannot be negative");
                            }
                        }
                    }
                    this.f12056.mo9276(c13159);
                    return;
                case 19:
                    if (this.f12056 == null) {
                        throw new C20555("Invalid document. Root element must be <svg>");
                    }
                    C23887 c23887 = new C23887();
                    c23887.f18929 = this.f12058;
                    c23887.f18930 = this.f12056;
                    m10934(c23887, attributes2);
                    m10946(c23887, attributes2);
                    this.f12056.mo9276(c23887);
                    this.f12056 = c23887;
                    return;
                case 20:
                    InterfaceC5921 interfaceC5921 = this.f12056;
                    if (interfaceC5921 == null) {
                        throw new C20555("Invalid document. Root element must be <svg>");
                    }
                    if (!(interfaceC5921 instanceof AbstractC4441)) {
                        throw new C20555("Invalid document. <stop> elements are only valid inside <linearGradient> or <radialGradient> elements.");
                    }
                    C15169 c15169 = new C15169();
                    c15169.f18929 = this.f12058;
                    c15169.f18930 = this.f12056;
                    m10934(c15169, attributes2);
                    m10946(c15169, attributes2);
                    for (int i14 = 0; i14 < attributes.getLength(); i14++) {
                        String strTrim12 = attributes2.getValue(i14).trim();
                        if (EnumC22567.m50588(attributes2.getLocalName(i14)).ordinal() == 39) {
                            if (strTrim12.length() == 0) {
                                throw new C20555("Invalid offset value in <stop> (empty string)");
                            }
                            int length = strTrim12.length();
                            if (C9417.m21911(1, strTrim12) == '%') {
                                length--;
                                z = true;
                            } else {
                                z = false;
                            }
                            try {
                                float fM10915 = m10915(length, strTrim12);
                                float f14 = 100.0f;
                                if (z) {
                                    fM10915 /= 100.0f;
                                }
                                if (fM10915 < 0.0f) {
                                    f14 = 0.0f;
                                } else if (fM10915 <= 100.0f) {
                                    f14 = fM10915;
                                }
                                c15169.f43279 = Float.valueOf(f14);
                            } catch (NumberFormatException e) {
                                throw new C20555("Invalid offset value in <stop>: ".concat(strTrim12), e);
                            }
                        }
                    }
                    this.f12056.mo9276(c15169);
                    this.f12056 = c15169;
                    return;
                case 21:
                    if (this.f12056 == null) {
                        throw new C20555("Invalid document. Root element must be <svg>");
                    }
                    String str4 = ProviderConfigurationPermission.ALL_STR;
                    boolean zEquals = true;
                    for (int i15 = 0; i15 < attributes.getLength(); i15++) {
                        String strTrim13 = attributes2.getValue(i15).trim();
                        int iOrdinal9 = EnumC22567.m50588(attributes2.getLocalName(i15)).ordinal();
                        if (iOrdinal9 == 38) {
                            str4 = strTrim13;
                        } else if (iOrdinal9 == 77) {
                            zEquals = strTrim13.equals("text/css");
                        }
                    }
                    if (zEquals && C24418.m53884(str4, EnumC2960.screen)) {
                        this.f12063 = true;
                        return;
                    } else {
                        this.f12062 = true;
                        this.f12060 = 1;
                        return;
                    }
                case 22:
                    if (this.f12056 == null) {
                        throw new C20555("Invalid document. Root element must be <svg>");
                    }
                    C23355 c23355 = new C23355();
                    c23355.f18929 = this.f12058;
                    c23355.f18930 = this.f12056;
                    m10934((AbstractC20674) c23355, attributes2);
                    m10946(c23355, attributes2);
                    m10923((InterfaceC2428) c23355, attributes2);
                    m10930((InterfaceC10615) c23355, attributes2);
                    this.f12056.mo9276(c23355);
                    this.f12056 = c23355;
                    return;
                case 23:
                    if (this.f12056 == null) {
                        throw new C20555("Invalid document. Root element must be <svg>");
                    }
                    C21344 c21344 = new C21344();
                    c21344.f18929 = this.f12058;
                    c21344.f18930 = this.f12056;
                    m10934((AbstractC20674) c21344, attributes2);
                    m10946(c21344, attributes2);
                    m10930((InterfaceC10615) c21344, attributes2);
                    m10936((AbstractC22685) c21344, attributes2);
                    this.f12056.mo9276(c21344);
                    this.f12056 = c21344;
                    return;
                case 24:
                    if (this.f12056 == null) {
                        throw new C20555("Invalid document. Root element must be <svg>");
                    }
                    C14637 c14637 = new C14637();
                    c14637.f18929 = this.f12058;
                    c14637.f18930 = this.f12056;
                    m10934((AbstractC20674) c14637, attributes2);
                    m10946(c14637, attributes2);
                    m10923((InterfaceC2428) c14637, attributes2);
                    m10930((InterfaceC10615) c14637, attributes2);
                    m10932((AbstractC13297) c14637, attributes2);
                    this.f12056.mo9276(c14637);
                    this.f12056 = c14637;
                    return;
                case 25:
                    if (this.f12056 == null) {
                        throw new C20555("Invalid document. Root element must be <svg>");
                    }
                    C7932 c7932 = new C7932();
                    c7932.f18929 = this.f12058;
                    c7932.f18930 = this.f12056;
                    m10934((AbstractC20674) c7932, attributes2);
                    m10946(c7932, attributes2);
                    m10930((InterfaceC10615) c7932, attributes2);
                    for (int i16 = 0; i16 < attributes.getLength(); i16++) {
                        String strTrim14 = attributes2.getValue(i16).trim();
                        int iOrdinal10 = EnumC22567.m50588(attributes2.getLocalName(i16)).ordinal();
                        if (iOrdinal10 != 26) {
                            if (iOrdinal10 == 61) {
                                c7932.f20807 = m10956(strTrim14);
                            }
                        } else if ("".equals(attributes2.getURI(i16)) || "http://www.w3.org/1999/xlink".equals(attributes2.getURI(i16))) {
                            c7932.f20806 = strTrim14;
                        }
                    }
                    this.f12056.mo9276(c7932);
                    this.f12056 = c7932;
                    InterfaceC5921 interfaceC5922 = c7932.f18930;
                    if (interfaceC5922 instanceof InterfaceC24025) {
                        c7932.m18338((InterfaceC24025) interfaceC5922);
                        return;
                    } else {
                        c7932.m18338(((InterfaceC13967) interfaceC5922).mo11325());
                        return;
                    }
                case 27:
                    InterfaceC5921 interfaceC5923 = this.f12056;
                    if (interfaceC5923 == null) {
                        throw new C20555("Invalid document. Root element must be <svg>");
                    }
                    if (!(interfaceC5923 instanceof AbstractC11956)) {
                        throw new C20555("Invalid document. <tref> elements are only valid inside <text> or <tspan> elements.");
                    }
                    C6591 c6591 = new C6591();
                    c6591.f18929 = this.f12058;
                    c6591.f18930 = this.f12056;
                    m10934((AbstractC20674) c6591, attributes2);
                    m10946(c6591, attributes2);
                    m10930((InterfaceC10615) c6591, attributes2);
                    for (int i17 = 0; i17 < attributes.getLength(); i17++) {
                        String strTrim15 = attributes2.getValue(i17).trim();
                        if (EnumC22567.m50588(attributes2.getLocalName(i17)).ordinal() == 26 && ("".equals(attributes2.getURI(i17)) || "http://www.w3.org/1999/xlink".equals(attributes2.getURI(i17)))) {
                            c6591.f17018 = strTrim15;
                        }
                    }
                    this.f12056.mo9276(c6591);
                    InterfaceC5921 interfaceC5924 = c6591.f18930;
                    if (interfaceC5924 instanceof InterfaceC24025) {
                        c6591.m15075((InterfaceC24025) interfaceC5924);
                        return;
                    } else {
                        c6591.m15075(((InterfaceC13967) interfaceC5924).mo11325());
                        return;
                    }
                case 28:
                    InterfaceC5921 interfaceC5925 = this.f12056;
                    if (interfaceC5925 == null) {
                        throw new C20555("Invalid document. Root element must be <svg>");
                    }
                    if (!(interfaceC5925 instanceof AbstractC11956)) {
                        throw new C20555("Invalid document. <tspan> elements are only valid inside <text> or other <tspan> elements.");
                    }
                    C5250 c5250 = new C5250();
                    c5250.f18929 = this.f12058;
                    c5250.f18930 = this.f12056;
                    m10934((AbstractC20674) c5250, attributes2);
                    m10946(c5250, attributes2);
                    m10930((InterfaceC10615) c5250, attributes2);
                    m10932((AbstractC13297) c5250, attributes2);
                    this.f12056.mo9276(c5250);
                    this.f12056 = c5250;
                    InterfaceC5921 interfaceC5926 = c5250.f18930;
                    if (interfaceC5926 instanceof InterfaceC24025) {
                        c5250.m11324((InterfaceC24025) interfaceC5926);
                        return;
                    } else {
                        c5250.m11324(((InterfaceC13967) interfaceC5926).mo11325());
                        return;
                    }
                case 29:
                    if (this.f12056 == null) {
                        throw new C20555("Invalid document. Root element must be <svg>");
                    }
                    C3790 c3790 = new C3790();
                    c3790.f18929 = this.f12058;
                    c3790.f18930 = this.f12056;
                    m10934((AbstractC20674) c3790, attributes2);
                    m10946(c3790, attributes2);
                    m10923((InterfaceC2428) c3790, attributes2);
                    m10930((InterfaceC10615) c3790, attributes2);
                    for (int i18 = 0; i18 < attributes.getLength(); i18++) {
                        String strTrim16 = attributes2.getValue(i18).trim();
                        int iOrdinal11 = EnumC22567.m50588(attributes2.getLocalName(i18)).ordinal();
                        if (iOrdinal11 == 25) {
                            C3099 c3099M109521 = m10956(strTrim16);
                            c3790.f8113 = c3099M109521;
                            if (c3099M109521.m5259()) {
                                throw new C20555("Invalid <use> element. height cannot be negative");
                            }
                        } else if (iOrdinal11 != 26) {
                            switch (iOrdinal11) {
                                case 81:
                                    C3099 c3099M109522 = m10956(strTrim16);
                                    c3790.f8110 = c3099M109522;
                                    if (c3099M109522.m5259()) {
                                        throw new C20555("Invalid <use> element. width cannot be negative");
                                    }
                                    break;
                                    break;
                                case 82:
                                    c3790.f8112 = m10956(strTrim16);
                                    break;
                                case BaseSlider.DEFAULT_LABEL_ANIMATION_ENTER_DURATION /* 83 */:
                                    c3790.f8111 = m10956(strTrim16);
                                    break;
                            }
                        } else if ("".equals(attributes2.getURI(i18)) || "http://www.w3.org/1999/xlink".equals(attributes2.getURI(i18))) {
                            c3790.f8114 = strTrim16;
                        }
                    }
                    this.f12056.mo9276(c3790);
                    this.f12056 = c3790;
                    return;
                case 30:
                    if (this.f12056 == null) {
                        throw new C20555("Invalid document. Root element must be <svg>");
                    }
                    C12508 c12508 = new C12508();
                    c12508.f18929 = this.f12058;
                    c12508.f18930 = this.f12056;
                    m10934((AbstractC20674) c12508, attributes2);
                    m10930((InterfaceC10615) c12508, attributes2);
                    m10936((AbstractC22685) c12508, attributes2);
                    this.f12056.mo9276(c12508);
                    this.f12056 = c12508;
                    return;
                default:
                    this.f12062 = true;
                    this.f12060 = 1;
                    return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܺ */
    public void m10950(String str) {
        if (this.f12062) {
            return;
        }
        if (this.f12064) {
            if (this.f12061 == null) {
                this.f12061 = new StringBuilder(str.length());
            }
            this.f12061.append(str);
        } else if (this.f12063) {
            if (this.f12059 == null) {
                this.f12059 = new StringBuilder(str.length());
            }
            this.f12059.append(str);
        } else if (this.f12056 instanceof AbstractC11956) {
            m10920(str);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m10938(char[] cArr, int i, int i2) {
        if (this.f12062) {
            return;
        }
        if (this.f12064) {
            if (this.f12061 == null) {
                this.f12061 = new StringBuilder(i2);
            }
            this.f12061.append(cArr, i, i2);
        } else if (this.f12063) {
            if (this.f12059 == null) {
                this.f12059 = new StringBuilder(i2);
            }
            this.f12059.append(cArr, i, i2);
        } else if (this.f12056 instanceof AbstractC11956) {
            m10920(new String(cArr, i, i2));
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m10920(String str) {
        AbstractC17319 abstractC17319 = (AbstractC17319) this.f12056;
        int size = abstractC17319.f51671.size();
        C7262 c7262 = size == 0 ? null : (C7262) abstractC17319.f51671.get(size - 1);
        if (c7262 instanceof C15307) {
            C15307 c15307 = (C15307) c7262;
            c15307.f43690 = C10965.m25286(new StringBuilder(), c15307.f43690, str);
        } else {
            InterfaceC5921 interfaceC5921 = this.f12056;
            C15307 c15308 = new C15307();
            c15308.f43690 = str;
            interfaceC5921.mo9276(c15308);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫ */
    public void m10921(String str, String str2, String str3) {
        if (this.f12062) {
            int i = this.f12060 - 1;
            this.f12060 = i;
            if (i == 0) {
                this.f12062 = false;
            }
        }
        if ("http://www.w3.org/2000/svg".equals(str) || "".equals(str)) {
            if (str2.length() <= 0) {
                str2 = str3;
            }
            switch (EnumC23237.m51782(str2).ordinal()) {
                case 0:
                case 3:
                case 4:
                case 7:
                case 8:
                case 10:
                case 11:
                case 12:
                case 14:
                case 17:
                case 19:
                case 20:
                case 22:
                case 23:
                case 24:
                case 25:
                case 28:
                case 29:
                case 30:
                    this.f12056 = ((C7262) this.f12056).f18930;
                    break;
                case 5:
                case 26:
                    this.f12064 = false;
                    if (this.f12061 != null) {
                        EnumC23237 enumC23237 = this.f12066;
                        if (enumC23237 == EnumC23237.title || enumC23237 == EnumC23237.desc) {
                            this.f12058.getClass();
                        }
                        this.f12061.setLength(0);
                    }
                    break;
                case 21:
                    StringBuilder sb = this.f12059;
                    if (sb != null) {
                        this.f12063 = false;
                        this.f12058.m40619(new C24418(EnumC2960.screen, EnumC13690.Document).m53891(sb.toString()));
                        this.f12059.setLength(0);
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public static HashMap m10951(C21226 c21226) {
        HashMap map = new HashMap();
        c21226.m47954();
        while (true) {
            String strM47950 = c21226.m47950(false, C0184a.f880h);
            if (strM47950 == null) {
                return map;
            }
            c21226.m47951(C0184a.f880h);
            map.put(strM47950, c21226.m47956());
            c21226.m47954();
        }
    }

    /* JADX INFO: renamed from: ۧ */
    private void m10947(Attributes attributes) throws C20555 {
        C11286 c11286 = new C11286();
        c11286.f18929 = this.f12058;
        c11286.f18930 = this.f12056;
        m10934((AbstractC20674) c11286, attributes);
        m10946(c11286, attributes);
        m10930((InterfaceC10615) c11286, attributes);
        m10936((AbstractC22685) c11286, attributes);
        for (int i = 0; i < attributes.getLength(); i++) {
            String strTrim = attributes.getValue(i).trim();
            int iOrdinal = EnumC22567.m50588(attributes.getLocalName(i)).ordinal();
            if (iOrdinal == 25) {
                C3099 c3099M10956 = m10956(strTrim);
                c11286.f31450 = c3099M10956;
                if (c3099M10956.m5259()) {
                    throw new C20555("Invalid <svg> element. height cannot be negative");
                }
            } else if (iOrdinal != 79) {
                switch (iOrdinal) {
                    case 81:
                        C3099 c3099M10957 = m10956(strTrim);
                        c11286.f31447 = c3099M10957;
                        if (c3099M10957.m5259()) {
                            throw new C20555("Invalid <svg> element. width cannot be negative");
                        }
                        break;
                        break;
                    case 82:
                        c11286.f31449 = m10956(strTrim);
                        break;
                    case BaseSlider.DEFAULT_LABEL_ANIMATION_ENTER_DURATION /* 83 */:
                        c11286.f31448 = m10956(strTrim);
                        break;
                }
            } else {
                continue;
            }
        }
        InterfaceC5921 interfaceC5921 = this.f12056;
        if (interfaceC5921 == null) {
            this.f12058.m40618(c11286);
        } else {
            interfaceC5921.mo9276(c11286);
        }
        this.f12056 = c11286;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m10937(Attributes attributes) throws C20555 {
        if (this.f12056 == null) {
            throw new C20555("Invalid document. Root element must be <svg>");
        }
        C24557 c24557 = new C24557();
        c24557.f18929 = this.f12058;
        c24557.f18930 = this.f12056;
        m10934((AbstractC20674) c24557, attributes);
        m10946(c24557, attributes);
        m10923((InterfaceC2428) c24557, attributes);
        m10930((InterfaceC10615) c24557, attributes);
        for (int i = 0; i < attributes.getLength(); i++) {
            String strTrim = attributes.getValue(i).trim();
            int iOrdinal = EnumC22567.m50588(attributes.getLocalName(i)).ordinal();
            if (iOrdinal == 6) {
                c24557.f77761 = m10956(strTrim);
            } else if (iOrdinal == 7) {
                c24557.f77762 = m10956(strTrim);
            } else if (iOrdinal != 49) {
                continue;
            } else {
                C3099 c3099M10956 = m10956(strTrim);
                c24557.f77760 = c3099M10956;
                if (c3099M10956.m5259()) {
                    throw new C20555("Invalid <circle> element. r cannot be negative");
                }
            }
        }
        this.f12056.mo9276(c24557);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m10931(C11818 c11818, Attributes attributes, String str) throws C20555 {
        for (int i = 0; i < attributes.getLength(); i++) {
            if (EnumC22567.m50588(attributes.getLocalName(i)) == EnumC22567.points) {
                C21226 c21226 = new C21226(attributes.getValue(i));
                ArrayList arrayList = new ArrayList();
                c21226.m47954();
                while (!c21226.m47955()) {
                    float fM47959 = c21226.m47959();
                    if (Float.isNaN(fM47959)) {
                        throw new C20555(C6988.m16053("Invalid <", str, "> points attribute. Non-coordinate content found in list."));
                    }
                    c21226.m47960();
                    float fM479510 = c21226.m47959();
                    if (Float.isNaN(fM479510)) {
                        throw new C20555(C6988.m16053("Invalid <", str, "> points attribute. There should be an even number of coordinates."));
                    }
                    c21226.m47960();
                    arrayList.add(Float.valueOf(fM47959));
                    arrayList.add(Float.valueOf(fM479510));
                }
                c11818.f32982 = new float[arrayList.size()];
                Iterator it = arrayList.iterator();
                int i2 = 0;
                while (it.hasNext()) {
                    c11818.f32982[i2] = ((Float) it.next()).floatValue();
                    i2++;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m10932(AbstractC13297 abstractC13297, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String strTrim = attributes.getValue(i).trim();
            int iOrdinal = EnumC22567.m50588(attributes.getLocalName(i)).ordinal();
            if (iOrdinal == 9) {
                abstractC13297.f37353 = m10940(strTrim);
            } else if (iOrdinal == 10) {
                abstractC13297.f37354 = m10940(strTrim);
            } else if (iOrdinal == 82) {
                abstractC13297.f37355 = m10940(strTrim);
            } else if (iOrdinal == 83) {
                abstractC13297.f37352 = m10940(strTrim);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m10930(InterfaceC10615 interfaceC10615, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String strTrim = attributes.getValue(i).trim();
            int iOrdinal = EnumC22567.m50588(attributes.getLocalName(i)).ordinal();
            if (iOrdinal != 73) {
                switch (iOrdinal) {
                    case 52:
                        C21226 c21226 = new C21226(strTrim);
                        HashSet hashSet = new HashSet();
                        while (!c21226.m47955()) {
                            String strM47961 = c21226.m47961();
                            if (strM47961.startsWith("http://www.w3.org/TR/SVG11/feature#")) {
                                hashSet.add(strM47961.substring(35));
                            } else {
                                hashSet.add("UNSUPPORTED");
                            }
                            c21226.m47954();
                        }
                        interfaceC10615.mo9657(hashSet);
                        break;
                    case 53:
                        interfaceC10615.mo9656(strTrim);
                        break;
                    case ThreefishEngine.Threefish512Cipher.ROTATION_3_2 /* 54 */:
                        C21226 c21227 = new C21226(strTrim);
                        HashSet hashSet2 = new HashSet();
                        while (!c21227.m47955()) {
                            hashSet2.add(c21227.m47961());
                            c21227.m47954();
                        }
                        interfaceC10615.mo9664(hashSet2);
                        break;
                    case ThreefishEngine.Threefish1024Cipher.ROTATION_1_3 /* 55 */:
                        ArrayList arrayListM10953 = m10953(strTrim);
                        interfaceC10615.mo9661(arrayListM10953 != null ? new HashSet(arrayListM10953) : new HashSet(0));
                        break;
                }
            } else {
                C21226 c21228 = new C21226(strTrim);
                HashSet hashSet3 = new HashSet();
                while (!c21228.m47955()) {
                    String strM47962 = c21228.m47961();
                    int iIndexOf = strM47962.indexOf(45);
                    if (iIndexOf != -1) {
                        strM47962 = strM47962.substring(0, iIndexOf);
                    }
                    hashSet3.add(new Locale(strM47962, "", "").getLanguage());
                    c21228.m47954();
                }
                interfaceC10615.mo9659(hashSet3);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m10924(AbstractC4441 abstractC4441, Attributes attributes) throws C20555 {
        for (int i = 0; i < attributes.getLength(); i++) {
            String strTrim = attributes.getValue(i).trim();
            int iOrdinal = EnumC22567.m50588(attributes.getLocalName(i)).ordinal();
            if (iOrdinal == 23) {
                abstractC4441.f9968 = m10941(strTrim);
            } else if (iOrdinal != 24) {
                if (iOrdinal != 26) {
                    if (iOrdinal != 60) {
                        continue;
                    } else {
                        try {
                            abstractC4441.f9967 = EnumC5782.valueOf(strTrim);
                        } catch (IllegalArgumentException unused) {
                            throw new C20555(C6988.m16053("Invalid spreadMethod attribute. \"", strTrim, "\" is not a valid value."));
                        }
                    }
                } else if ("".equals(attributes.getURI(i)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i))) {
                    abstractC4441.f9965 = strTrim;
                }
            } else if ("objectBoundingBox".equals(strTrim)) {
                abstractC4441.f9966 = Boolean.FALSE;
            } else {
                if (!"userSpaceOnUse".equals(strTrim)) {
                    throw new C20555("Invalid value for attribute gradientUnits");
                }
                abstractC4441.f9966 = Boolean.TRUE;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m10934(AbstractC20674 abstractC20674, Attributes attributes) throws C20555 {
        for (int i = 0; i < attributes.getLength(); i++) {
            String qName = attributes.getQName(i);
            if (qName.equals("id") || qName.equals("xml:id")) {
                abstractC20674.f63863 = attributes.getValue(i).trim();
                return;
            }
            if (qName.equals("xml:space")) {
                String strTrim = attributes.getValue(i).trim();
                if ("default".equals(strTrim)) {
                    abstractC20674.f63861 = Boolean.FALSE;
                    return;
                } else {
                    if (!"preserve".equals(strTrim)) {
                        throw new C20555(C21466.m48631("Invalid value for \"xml:space\" attribute: ", strTrim));
                    }
                    abstractC20674.f63861 = Boolean.TRUE;
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m10946(AbstractC20674 abstractC20674, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String strTrim = attributes.getValue(i).trim();
            if (strTrim.length() != 0) {
                int iOrdinal = EnumC22567.m50588(attributes.getLocalName(i)).ordinal();
                if (iOrdinal == 0) {
                    C20396 c20396 = new C20396(strTrim);
                    ArrayList arrayList = null;
                    while (!c20396.m47955()) {
                        String strM47961 = c20396.m47961();
                        if (strM47961 != null) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(strM47961);
                            c20396.m47954();
                        }
                    }
                    abstractC20674.f63864 = arrayList;
                } else if (iOrdinal != 72) {
                    if (abstractC20674.f63862 == null) {
                        abstractC20674.f63862 = new C22015();
                    }
                    m10935(abstractC20674.f63862, attributes.getLocalName(i), attributes.getValue(i).trim());
                } else {
                    m10933(abstractC20674, strTrim, false);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m10933(AbstractC20674 abstractC20674, String str, boolean z) {
        C21226 c21226 = new C21226(str.replaceAll("/\\*.*?\\*/", ""));
        while (true) {
            String strM47950 = c21226.m47950(false, ':');
            c21226.m47954();
            if (!c21226.m47951(':')) {
                return;
            }
            c21226.m47954();
            String strM47951 = c21226.m47950(true, ';');
            if (strM47951 == null) {
                return;
            }
            c21226.m47954();
            if (c21226.m47955() || c21226.m47951(';')) {
                if (!z || m10948(strM47950)) {
                    if (abstractC20674.f63865 == null) {
                        abstractC20674.f63865 = new C22015();
                    }
                    m10935(abstractC20674.f63865, strM47950, strM47951);
                }
                c21226.m47954();
            }
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static boolean m10948(String str) {
        int iOrdinal = EnumC22567.m50588(str).ordinal();
        if (iOrdinal == 2 || iOrdinal == 15 || iOrdinal == 35 || iOrdinal == 64) {
            return true;
        }
        switch (iOrdinal) {
            case 28:
            case 29:
            case 30:
            case 31:
                return true;
            default:
                return false;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:116:0x0152  */
    /* JADX WARN: Code duplicated, block: B:199:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:330:0x04a7  */
    /* JADX WARN: Code duplicated, block: B:357:0x04f0  */
    /* JADX WARN: Code duplicated, block: B:407:0x0592  */
    /* JADX WARN: Code duplicated, block: B:55:0x0095  */
    /* JADX INFO: renamed from: ֫ */
    public static void m10935(C22015 c22015, String str, String str2) {
        String strM47950;
        C3099 c3099M5323;
        C3099 c3099M47958;
        if (str2.length() == 0 || str2.equals("inherit")) {
            return;
        }
        int iOrdinal = EnumC22567.m50588(str).ordinal();
        C15839 c15839 = null;
        C3099 c3099M10956 = null;
        EnumC9135 enumC9135 = null;
        EnumC17990 enumC17990 = null;
        EnumC12627 enumC12627 = null;
        c3099Arr = null;
        c3099Arr = null;
        c3099Arr = null;
        c3099Arr = null;
        c3099Arr = null;
        C3099[] c3099Arr = null;
        EnumC19332 enumC19332 = null;
        EnumC3909 enumC3909 = null;
        String strSubstring = null;
        EnumC9135 enumC9136 = null;
        EnumC15978 enumC15978 = null;
        EnumC18661 enumC18661 = null;
        EnumC8603 enumC8603 = null;
        Boolean bool = null;
        EnumC24696 enumC24696 = null;
        c15839 = null;
        c15839 = null;
        if (iOrdinal == 1) {
            if (!"auto".equals(str2) && str2.startsWith("rect(")) {
                C21226 c21226 = new C21226(str2.substring(5));
                c21226.m47954();
                C3099 c3099M10944 = m10944(c21226);
                c21226.m47960();
                C3099 c3099M10945 = m10944(c21226);
                c21226.m47960();
                C3099 c3099M10946 = m10944(c21226);
                c21226.m47960();
                C3099 c3099M10947 = m10944(c21226);
                c21226.m47954();
                if (c21226.m47951(')') || c21226.m47955()) {
                    c15839 = new C15839();
                    c15839.f45894 = c3099M10944;
                    c15839.f45893 = c3099M10945;
                    c15839.f45891 = c3099M10946;
                    c15839.f45892 = c3099M10947;
                }
            }
            c22015.f69291 = c15839;
            if (c15839 != null) {
                c22015.f69273 |= 1048576;
                return;
            }
            return;
        }
        if (iOrdinal == 2) {
            c22015.f69293 = m10949(str2);
            c22015.f69273 |= 268435456;
            return;
        }
        if (iOrdinal == 4) {
            if ("nonzero".equals(str2)) {
                enumC9135 = EnumC9135.NonZero;
            } else if ("evenodd".equals(str2)) {
                enumC9135 = EnumC9135.EvenOdd;
            }
            c22015.f69288 = enumC9135;
            c22015.f69273 |= 536870912;
            return;
        }
        try {
            if (iOrdinal == 5) {
                c22015.f69265 = m10952(str2);
                c22015.f69273 |= ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF;
                return;
            }
            if (iOrdinal == 8) {
                if (str2.equals("ltr")) {
                    enumC24696 = EnumC24696.LTR;
                } else if (str2.equals("rtl")) {
                    enumC24696 = EnumC24696.RTL;
                }
                c22015.f69262 = enumC24696;
                if (enumC24696 != null) {
                    c22015.f69273 |= 68719476736L;
                    return;
                }
                return;
            }
            if (iOrdinal == 35) {
                c22015.f69284 = m10949(str2);
                c22015.f69273 |= 1073741824;
                return;
            }
            if (iOrdinal == 40) {
                c22015.f69280 = m10955(str2);
                c22015.f69273 |= ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLSX;
                return;
            }
            if (iOrdinal == 42) {
                switch (str2) {
                    case "hidden":
                    case "scroll":
                        bool = Boolean.FALSE;
                        break;
                    case "auto":
                    case "visible":
                        bool = Boolean.TRUE;
                        break;
                }
                c22015.f69296 = bool;
                if (bool != null) {
                    c22015.f69273 |= 524288;
                    return;
                }
                return;
            }
            if (iOrdinal == 78) {
                if (str2.equals("none")) {
                    enumC8603 = EnumC8603.None;
                } else if (str2.equals("non-scaling-stroke")) {
                    enumC8603 = EnumC8603.NonScalingStroke;
                }
                c22015.f69294 = enumC8603;
                if (enumC8603 != null) {
                    c22015.f69273 |= 34359738368L;
                    return;
                }
                return;
            }
            if (iOrdinal == 58) {
                if (str2.equals("currentColor")) {
                    c22015.f69269 = C11147.m25678();
                } else {
                    try {
                        c22015.f69269 = m10952(str2);
                    } catch (C20555 e) {
                        e.getMessage();
                        return;
                    }
                }
                c22015.f69273 |= 2147483648L;
                return;
            }
            if (iOrdinal == 59) {
                c22015.f69290 = m10955(str2);
                c22015.f69273 |= Blake2xsDigest.MAX_NUMBER_BLOCKS;
                return;
            }
            if (iOrdinal == 74) {
                switch (str2) {
                    case "middle":
                        enumC18661 = EnumC18661.Middle;
                        break;
                    case "end":
                        enumC18661 = EnumC18661.End;
                        break;
                    case "start":
                        enumC18661 = EnumC18661.Start;
                        break;
                }
                c22015.f69281 = enumC18661;
                if (enumC18661 != null) {
                    c22015.f69273 |= 262144;
                    return;
                }
                return;
            }
            if (iOrdinal != 75) {
                switch (iOrdinal) {
                    case 14:
                        if (str2.indexOf(124) < 0) {
                            if ("|inline|block|list-item|run-in|compact|marker|table|inline-table|table-row-group|table-header-group|table-footer-group|table-row|table-column-group|table-column|table-cell|table-caption|none|".contains("|" + str2 + '|')) {
                                c22015.f69278 = Boolean.valueOf(!str2.equals("none"));
                                c22015.f69273 |= 16777216;
                                break;
                            }
                        }
                        break;
                    case 15:
                        AbstractC3238 abstractC3238M10942 = m10942(str2);
                        c22015.f69277 = abstractC3238M10942;
                        if (abstractC3238M10942 != null) {
                            c22015.f69273 |= 1;
                        }
                        break;
                    case 16:
                        if ("nonzero".equals(str2)) {
                            enumC9136 = EnumC9135.NonZero;
                        } else if ("evenodd".equals(str2)) {
                            enumC9136 = EnumC9135.EvenOdd;
                        }
                        c22015.f69268 = enumC9136;
                        if (enumC9136 != null) {
                            c22015.f69273 |= 2;
                        }
                        break;
                    case 17:
                        Float fM10955 = m10955(str2);
                        c22015.f69274 = fM10955;
                        if (fM10955 != null) {
                            c22015.f69273 |= 4;
                        }
                        break;
                    case 18:
                        if ("|caption|icon|menu|message-box|small-caption|status-bar|".contains("|" + str2 + '|')) {
                            C21226 c21227 = new C21226(str2);
                            Integer numM22994 = null;
                            EnumC3909 enumC39010 = null;
                            String str3 = null;
                            while (true) {
                                strM47950 = c21227.m47950(false, '/');
                                c21227.m47954();
                                if (strM47950 == null) {
                                    break;
                                } else if (numM22994 == null || enumC39010 == null) {
                                    if (!strM47950.equals("normal") && (numM22994 != null || (numM22994 = C9825.m22994(strM47950)) == null)) {
                                        if (enumC39010 == null) {
                                            switch (strM47950) {
                                                case "oblique":
                                                    enumC39010 = EnumC3909.Oblique;
                                                    break;
                                                case "italic":
                                                    enumC39010 = EnumC3909.Italic;
                                                    break;
                                                case "normal":
                                                    enumC39010 = EnumC3909.Normal;
                                                    break;
                                                default:
                                                    enumC39010 = null;
                                                    break;
                                            }
                                            if (enumC39010 != null) {
                                                continue;
                                            }
                                        }
                                        if (str3 == null && strM47950.equals("small-caps")) {
                                            str3 = strM47950;
                                        }
                                    }
                                }
                            }
                            try {
                                c3099M5323 = C3119.m5323(strM47950);
                                if (c3099M5323 == null) {
                                    c3099M5323 = m10956(strM47950);
                                }
                            } catch (C20555 unused) {
                                c3099M5323 = null;
                            }
                            if (c21227.m47951('/')) {
                                c21227.m47954();
                                String strM47961 = c21227.m47961();
                                if (strM47961 != null) {
                                    m10956(strM47961);
                                }
                                c21227.m47954();
                            }
                            if (!c21227.m47955()) {
                                int i = c21227.f66740;
                                c21227.f66740 = c21227.f66738;
                                strSubstring = c21227.f66737.substring(i);
                            }
                            c22015.f69276 = m10953(strSubstring);
                            c22015.f69295 = c3099M5323;
                            c22015.f69270 = Integer.valueOf(numM22994 == null ? 400 : numM22994.intValue());
                            if (enumC39010 == null) {
                                enumC39010 = EnumC3909.Normal;
                            }
                            c22015.f69279 = enumC39010;
                            c22015.f69273 |= 122880;
                            break;
                        }
                        break;
                    case 19:
                        ArrayList arrayListM10953 = m10953(str2);
                        c22015.f69276 = arrayListM10953;
                        if (arrayListM10953 != null) {
                            c22015.f69273 |= 8192;
                        }
                        break;
                    case 20:
                        try {
                            C3099 c3099M5324 = C3119.m5323(str2);
                            c3099M10956 = c3099M5324 == null ? m10956(str2) : c3099M5324;
                            break;
                        } catch (C20555 unused2) {
                        }
                        c22015.f69295 = c3099M10956;
                        if (c3099M10956 != null) {
                            c22015.f69273 |= 16384;
                        }
                        break;
                    case 21:
                        Integer numM22995 = C9825.m22994(str2);
                        c22015.f69270 = numM22995;
                        if (numM22995 != null) {
                            c22015.f69273 |= X931RNG.BLOCK64_RESEED_MAX;
                        }
                        break;
                    case 22:
                        switch (str2) {
                            case "oblique":
                                enumC3909 = EnumC3909.Oblique;
                                break;
                            case "italic":
                                enumC3909 = EnumC3909.Italic;
                                break;
                            case "normal":
                                enumC3909 = EnumC3909.Normal;
                                break;
                        }
                        c22015.f69279 = enumC3909;
                        if (enumC3909 != null) {
                            c22015.f69273 |= 65536;
                        }
                        break;
                    default:
                        switch (iOrdinal) {
                            case 27:
                                switch (str2) {
                                    case "optimizeQuality":
                                        enumC19332 = EnumC19332.optimizeQuality;
                                        break;
                                    case "auto":
                                        enumC19332 = EnumC19332.auto;
                                        break;
                                    case "optimizeSpeed":
                                        enumC19332 = EnumC19332.optimizeSpeed;
                                        break;
                                }
                                c22015.f69260 = enumC19332;
                                if (enumC19332 != null) {
                                    c22015.f69273 |= 137438953472L;
                                }
                                break;
                            case 28:
                                String strM10949 = m10949(str2);
                                c22015.f69285 = strM10949;
                                c22015.f69283 = strM10949;
                                c22015.f69275 = strM10949;
                                c22015.f69273 |= 14680064;
                                break;
                            case 29:
                                c22015.f69285 = m10949(str2);
                                c22015.f69273 |= 2097152;
                                break;
                            case 30:
                                c22015.f69283 = m10949(str2);
                                c22015.f69273 |= 4194304;
                                break;
                            case 31:
                                c22015.f69275 = m10949(str2);
                                c22015.f69273 |= X931RNG.BLOCK128_RESEED_MAX;
                                break;
                            default:
                                switch (iOrdinal) {
                                    case 62:
                                        if (str2.equals("currentColor")) {
                                            c22015.f69272 = C11147.m25678();
                                        } else {
                                            try {
                                                c22015.f69272 = m10952(str2);
                                            } catch (C20555 e2) {
                                                e2.getMessage();
                                                return;
                                            }
                                        }
                                        c22015.f69273 |= 67108864;
                                        break;
                                    case 63:
                                        c22015.f69282 = m10955(str2);
                                        c22015.f69273 |= 134217728;
                                        break;
                                    case 64:
                                        AbstractC3238 abstractC3238M10943 = m10942(str2);
                                        c22015.f69261 = abstractC3238M10943;
                                        if (abstractC3238M10943 != null) {
                                            c22015.f69273 |= 8;
                                        }
                                        break;
                                    case 65:
                                        if ("none".equals(str2)) {
                                            c22015.f69264 = null;
                                            c22015.f69273 |= 512;
                                        } else {
                                            C21226 c21228 = new C21226(str2);
                                            c21228.m47954();
                                            if (!c21228.m47955() && (c3099M47958 = c21228.m47958()) != null && !c3099M47958.m5259()) {
                                                float f = c3099M47958.f5627;
                                                ArrayList arrayList = new ArrayList();
                                                arrayList.add(c3099M47958);
                                                while (true) {
                                                    if (!c21228.m47955()) {
                                                        c21228.m47960();
                                                        C3099 c3099M47959 = c21228.m47958();
                                                        if (c3099M47959 != null && !c3099M47959.m5259()) {
                                                            arrayList.add(c3099M47959);
                                                            f += c3099M47959.f5627;
                                                        }
                                                    } else if (f != 0.0f) {
                                                        c3099Arr = (C3099[]) arrayList.toArray(new C3099[arrayList.size()]);
                                                    }
                                                }
                                            }
                                            c22015.f69264 = c3099Arr;
                                            if (c3099Arr != null) {
                                                c22015.f69273 |= 512;
                                            }
                                        }
                                        break;
                                    case 66:
                                        c22015.f69286 = m10956(str2);
                                        c22015.f69273 |= ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS;
                                        break;
                                    case 67:
                                        if ("butt".equals(str2)) {
                                            enumC12627 = EnumC12627.Butt;
                                        } else if ("round".equals(str2)) {
                                            enumC12627 = EnumC12627.Round;
                                        } else if ("square".equals(str2)) {
                                            enumC12627 = EnumC12627.Square;
                                        }
                                        c22015.f69287 = enumC12627;
                                        if (enumC12627 != null) {
                                            c22015.f69273 |= 64;
                                        }
                                        break;
                                    case 68:
                                        if ("miter".equals(str2)) {
                                            enumC17990 = EnumC17990.Miter;
                                        } else if ("round".equals(str2)) {
                                            enumC17990 = EnumC17990.Round;
                                        } else if ("bevel".equals(str2)) {
                                            enumC17990 = EnumC17990.Bevel;
                                        }
                                        c22015.f69258 = enumC17990;
                                        if (enumC17990 != null) {
                                            c22015.f69273 |= 128;
                                        }
                                        break;
                                    case 69:
                                        c22015.f69267 = Float.valueOf(m10954(str2));
                                        c22015.f69273 |= 256;
                                        break;
                                    case 70:
                                        Float fM10956 = m10955(str2);
                                        c22015.f69259 = fM10956;
                                        if (fM10956 != null) {
                                            c22015.f69273 |= 16;
                                        }
                                        break;
                                    case 71:
                                        c22015.f69271 = m10956(str2);
                                        c22015.f69273 |= 32;
                                        break;
                                    default:
                                        switch (iOrdinal) {
                                            case 88:
                                                if (str2.equals("currentColor")) {
                                                    c22015.f69289 = C11147.m25678();
                                                } else {
                                                    try {
                                                        c22015.f69289 = m10952(str2);
                                                    } catch (C20555 e3) {
                                                        e3.getMessage();
                                                        return;
                                                    }
                                                }
                                                c22015.f69273 |= 8589934592L;
                                                break;
                                            case 89:
                                                c22015.f69266 = m10955(str2);
                                                c22015.f69273 |= 17179869184L;
                                                break;
                                            case 90:
                                                if (str2.indexOf(124) < 0) {
                                                    if ("|visible|hidden|collapse|".contains("|" + str2 + '|')) {
                                                        c22015.f69263 = Boolean.valueOf(str2.equals("visible"));
                                                        c22015.f69273 |= 33554432;
                                                        break;
                                                    }
                                                }
                                                break;
                                        }
                                        break;
                                }
                                break;
                        }
                        break;
                }
                return;
            }
            switch (str2) {
                case "line-through":
                    enumC15978 = EnumC15978.LineThrough;
                    break;
                case "underline":
                    enumC15978 = EnumC15978.Underline;
                    break;
                case "none":
                    enumC15978 = EnumC15978.None;
                    break;
                case "blink":
                    enumC15978 = EnumC15978.Blink;
                    break;
                case "overline":
                    enumC15978 = EnumC15978.Overline;
                    break;
            }
            c22015.f69292 = enumC15978;
            if (enumC15978 != null) {
                c22015.f69273 |= 131072;
            }
        } catch (C20555 unused3) {
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m10936(AbstractC22685 abstractC22685, Attributes attributes) throws C20555 {
        for (int i = 0; i < attributes.getLength(); i++) {
            String strTrim = attributes.getValue(i).trim();
            int iOrdinal = EnumC22567.m50588(attributes.getLocalName(i)).ordinal();
            if (iOrdinal == 48) {
                m10929(abstractC22685, strTrim);
            } else if (iOrdinal != 80) {
                continue;
            } else {
                C21226 c21226 = new C21226(strTrim);
                c21226.m47954();
                float fM47959 = c21226.m47959();
                c21226.m47960();
                float fM479510 = c21226.m47959();
                c21226.m47960();
                float fM479511 = c21226.m47959();
                c21226.m47960();
                float fM479512 = c21226.m47959();
                if (Float.isNaN(fM47959) || Float.isNaN(fM479510) || Float.isNaN(fM479511) || Float.isNaN(fM479512)) {
                    throw new C20555("Invalid viewBox definition - should have four numbers");
                }
                if (fM479511 < 0.0f) {
                    throw new C20555("Invalid viewBox. width cannot be negative");
                }
                if (fM479512 >= 0.0f) {
                    abstractC22685.f71564 = new C18522(fM47959, fM479510, fM479511, fM479512);
                } else {
                    throw new C20555("Invalid viewBox. height cannot be negative");
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m10923(InterfaceC2428 interfaceC2428, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            if (EnumC22567.m50588(attributes.getLocalName(i)) == EnumC22567.transform) {
                interfaceC2428.mo3400(m10941(attributes.getValue(i)));
            }
        }
    }

    /* JADX INFO: renamed from: ۡ */
    public static Matrix m10941(String str) throws C20555 {
        Matrix matrix = new Matrix();
        C21226 c21226 = new C21226(str);
        c21226.m47954();
        while (!c21226.m47955()) {
            String str2 = c21226.f66737;
            String strSubstring = null;
            if (!c21226.m47955()) {
                int i = c21226.f66740;
                int iCharAt = str2.charAt(i);
                while (true) {
                    if ((iCharAt >= 97 && iCharAt <= 122) || (iCharAt >= 65 && iCharAt <= 90)) {
                        iCharAt = c21226.m47948();
                    }
                }
                int i2 = c21226.f66740;
                while (C21226.m47946(iCharAt)) {
                    iCharAt = c21226.m47948();
                }
                if (iCharAt == 40) {
                    c21226.f66740++;
                    strSubstring = str2.substring(i, i2);
                } else {
                    c21226.f66740 = i;
                }
            }
            if (strSubstring == null) {
                throw new C20555("Bad transform function encountered in transform list: ".concat(str));
            }
            switch (strSubstring) {
                case "matrix":
                    c21226.m47954();
                    float fM47959 = c21226.m47959();
                    c21226.m47960();
                    float fM479510 = c21226.m47959();
                    c21226.m47960();
                    float fM479511 = c21226.m47959();
                    c21226.m47960();
                    float fM479512 = c21226.m47959();
                    c21226.m47960();
                    float fM479513 = c21226.m47959();
                    c21226.m47960();
                    float fM479514 = c21226.m47959();
                    c21226.m47954();
                    if (Float.isNaN(fM479514) || !c21226.m47951(')')) {
                        throw new C20555("Invalid transform list: ".concat(str));
                    }
                    Matrix matrix2 = new Matrix();
                    matrix2.setValues(new float[]{fM47959, fM479511, fM479513, fM479510, fM479512, fM479514, 0.0f, 0.0f, 1.0f});
                    matrix.preConcat(matrix2);
                    break;
                    break;
                case "rotate":
                    c21226.m47954();
                    float fM479515 = c21226.m47959();
                    c21226.m47960();
                    float fM479516 = c21226.m47959();
                    c21226.m47960();
                    float fM479517 = c21226.m47959();
                    c21226.m47954();
                    if (Float.isNaN(fM479515) || !c21226.m47951(')')) {
                        throw new C20555("Invalid transform list: ".concat(str));
                    }
                    if (Float.isNaN(fM479516)) {
                        matrix.preRotate(fM479515);
                    } else {
                        if (Float.isNaN(fM479517)) {
                            throw new C20555("Invalid transform list: ".concat(str));
                        }
                        matrix.preRotate(fM479515, fM479516, fM479517);
                    }
                    break;
                    break;
                case "scale":
                    c21226.m47954();
                    float fM479518 = c21226.m47959();
                    c21226.m47960();
                    float fM479519 = c21226.m47959();
                    c21226.m47954();
                    if (Float.isNaN(fM479518) || !c21226.m47951(')')) {
                        throw new C20555("Invalid transform list: ".concat(str));
                    }
                    if (!Float.isNaN(fM479519)) {
                        matrix.preScale(fM479518, fM479519);
                    } else {
                        matrix.preScale(fM479518, fM479518);
                    }
                    break;
                    break;
                case "skewX":
                    c21226.m47954();
                    float fM479520 = c21226.m47959();
                    c21226.m47954();
                    if (Float.isNaN(fM479520) || !c21226.m47951(')')) {
                        throw new C20555("Invalid transform list: ".concat(str));
                    }
                    matrix.preSkew((float) Math.tan(Math.toRadians(fM479520)), 0.0f);
                    break;
                    break;
                case "skewY":
                    c21226.m47954();
                    float fM479521 = c21226.m47959();
                    c21226.m47954();
                    if (Float.isNaN(fM479521) || !c21226.m47951(')')) {
                        throw new C20555("Invalid transform list: ".concat(str));
                    }
                    matrix.preSkew(0.0f, (float) Math.tan(Math.toRadians(fM479521)));
                    break;
                    break;
                case "translate":
                    c21226.m47954();
                    float fM479522 = c21226.m47959();
                    c21226.m47960();
                    float fM479523 = c21226.m47959();
                    c21226.m47954();
                    if (Float.isNaN(fM479522) || !c21226.m47951(')')) {
                        throw new C20555("Invalid transform list: ".concat(str));
                    }
                    if (!Float.isNaN(fM479523)) {
                        matrix.preTranslate(fM479522, fM479523);
                    } else {
                        matrix.preTranslate(fM479522, 0.0f);
                    }
                    break;
                    break;
                default:
                    throw new C20555(C6988.m16053("Invalid transform list fn: ", strSubstring, MotionUtils.EASING_TYPE_FORMAT_END));
            }
            if (c21226.m47955()) {
                return matrix;
            }
            c21226.m47960();
        }
        return matrix;
    }

    /* JADX INFO: renamed from: ᩻ */
    public static C3099 m10956(String str) throws C20555 {
        if (str.length() == 0) {
            throw new C20555("Invalid length value (empty string)");
        }
        int length = str.length();
        EnumC9273 enumC9273ValueOf = EnumC9273.px;
        char cCharAt = str.charAt(length - 1);
        if (cCharAt == '%') {
            length--;
            enumC9273ValueOf = EnumC9273.percent;
        } else if (length > 2 && Character.isLetter(cCharAt) && Character.isLetter(str.charAt(length - 2))) {
            length -= 2;
            try {
                enumC9273ValueOf = EnumC9273.valueOf(str.substring(length).toLowerCase(Locale.US));
            } catch (IllegalArgumentException unused) {
                throw new C20555("Invalid length unit specifier: ".concat(str));
            }
        }
        try {
            return new C3099(m10915(length, str), enumC9273ValueOf);
        } catch (NumberFormatException e) {
            throw new C20555("Invalid length value: ".concat(str), e);
        }
    }

    /* JADX INFO: renamed from: ۜ */
    public static ArrayList m10940(String str) throws C20555 {
        if (str.length() == 0) {
            throw new C20555("Invalid length list (empty string)");
        }
        ArrayList arrayList = new ArrayList(1);
        C21226 c21226 = new C21226(str);
        c21226.m47954();
        while (!c21226.m47955()) {
            float fM47959 = c21226.m47959();
            if (Float.isNaN(fM47959)) {
                StringBuilder sb = new StringBuilder("Invalid length list value: ");
                String str2 = c21226.f66737;
                int i = c21226.f66740;
                while (!c21226.m47955() && !C21226.m47946((int) str2.charAt(c21226.f66740))) {
                    c21226.f66740++;
                }
                String strSubstring = str2.substring(i, c21226.f66740);
                c21226.f66740 = i;
                sb.append(strSubstring);
                throw new C20555(sb.toString());
            }
            EnumC9273 enumC9273M47953 = c21226.m47953();
            if (enumC9273M47953 == null) {
                enumC9273M47953 = EnumC9273.px;
            }
            arrayList.add(new C3099(fM47959, enumC9273M47953));
            c21226.m47960();
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ᩳ */
    public static float m10954(String str) throws C20555 {
        int length = str.length();
        if (length == 0) {
            throw new C20555("Invalid float value (empty string)");
        }
        return m10915(length, str);
    }

    /* JADX INFO: renamed from: ֫ */
    public static float m10915(int i, String str) throws C20555 {
        float fM22542 = new C9666().m22542(0, i, 0, str);
        if (Float.isNaN(fM22542)) {
            throw new C20555(C21466.m48631("Invalid float value: ", str));
        }
        return fM22542;
    }

    /* JADX INFO: renamed from: ᩷ */
    public static Float m10955(String str) {
        try {
            float fM10954 = m10954(str);
            if (fM10954 < 0.0f) {
                fM10954 = 0.0f;
            } else if (fM10954 > 1.0f) {
                fM10954 = 1.0f;
            }
            return Float.valueOf(fM10954);
        } catch (C20555 unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m10929(AbstractC9944 abstractC9944, String str) throws C20555 {
        EnumC12488 enumC12488;
        C21226 c21226 = new C21226(str);
        c21226.m47954();
        String strM47961 = c21226.m47961();
        if ("defer".equals(strM47961)) {
            c21226.m47954();
            strM47961 = c21226.m47961();
        }
        EnumC3770 enumC3770M3440 = C2448.m3440(strM47961);
        c21226.m47954();
        if (c21226.m47955()) {
            enumC12488 = null;
        } else {
            String strM47962 = c21226.m47961();
            strM47962.getClass();
            if (strM47962.equals("meet")) {
                enumC12488 = EnumC12488.meet;
            } else if (strM47962.equals("slice")) {
                enumC12488 = EnumC12488.slice;
            } else {
                throw new C20555("Invalid preserveAspectRatio definition: ".concat(str));
            }
        }
        abstractC9944.f27540 = new C17851(enumC3770M3440, enumC12488);
    }

    /* JADX INFO: renamed from: ۢ */
    public static AbstractC3238 m10942(String str) {
        boolean zStartsWith = str.startsWith("url(");
        AbstractC3238 abstractC3238M10952 = C21876.f68814;
        AbstractC3238 abstractC3238 = null;
        if (zStartsWith) {
            int iIndexOf = str.indexOf(MotionUtils.EASING_TYPE_FORMAT_END);
            if (iIndexOf != -1) {
                String strTrim = str.substring(4, iIndexOf).trim();
                String strTrim2 = str.substring(iIndexOf + 1).trim();
                if (strTrim2.length() > 0) {
                    if (!strTrim2.equals("none")) {
                        if (strTrim2.equals("currentColor")) {
                            abstractC3238M10952 = C11147.m25678();
                        } else {
                            try {
                                abstractC3238M10952 = m10952(strTrim2);
                            } catch (C20555 unused) {
                                abstractC3238M10952 = null;
                            }
                        }
                    }
                    abstractC3238 = abstractC3238M10952;
                }
                return new C21206(strTrim, abstractC3238);
            }
            return new C21206(str.substring(4).trim(), null);
        }
        if (str.equals("none")) {
            return abstractC3238M10952;
        }
        if (str.equals("currentColor")) {
            return C11147.m25678();
        }
        try {
            return m10952(str);
        } catch (C20555 unused2) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public static C21876 m10952(String str) throws C20555 {
        long j;
        int i;
        if (str.charAt(0) == '#') {
            int length = str.length();
            C15700 c15700 = null;
            if (1 < length) {
                long j2 = 0;
                int i2 = 1;
                while (true) {
                    if (i2 < length) {
                        char cCharAt = str.charAt(i2);
                        if (cCharAt < '0' || cCharAt > '9') {
                            if (cCharAt >= 'A' && cCharAt <= 'F') {
                                j = j2 * 16;
                                i = cCharAt - 'A';
                            } else if (cCharAt >= 'a' && cCharAt <= 'f') {
                                j = j2 * 16;
                                i = cCharAt - 'a';
                            }
                            j2 = j + ((long) i) + 10;
                        } else {
                            j2 = (j2 * 16) + ((long) (cCharAt - '0'));
                        }
                        if (j2 <= 4294967295L) {
                            i2++;
                        }
                    }
                    if (i2 != 1) {
                        c15700 = new C15700(i2, j2);
                    }
                }
            }
            if (c15700 == null) {
                throw new C20555("Bad hex colour value: ".concat(str));
            }
            int iM35763 = c15700.m35763();
            if (iM35763 == 4) {
                int iM35764 = c15700.m35764();
                int i3 = iM35764 & 3840;
                int i4 = iM35764 & 240;
                int i5 = iM35764 & 15;
                return new C21876(i5 | (i3 << 8) | (-16777216) | (i3 << 12) | (i4 << 8) | (i4 << 4) | (i5 << 4));
            }
            if (iM35763 != 5) {
                if (iM35763 == 7) {
                    return new C21876(c15700.m35764() | (-16777216));
                }
                if (iM35763 == 9) {
                    return new C21876((c15700.m35764() << 24) | (c15700.m35764() >>> 8));
                }
                throw new C20555("Bad hex colour value: ".concat(str));
            }
            int iM35765 = c15700.m35764();
            int i6 = 61440 & iM35765;
            int i7 = iM35765 & 3840;
            int i8 = iM35765 & 240;
            int i9 = iM35765 & 15;
            return new C21876((i9 << 24) | (i9 << 28) | (i6 << 8) | (i6 << 4) | (i7 << 4) | i7 | i8 | (i8 >> 4));
        }
        boolean zM10939 = m10939(str, "rgba(");
        if (zM10939 || m10939(str, "rgb(")) {
            C21226 c21226 = new C21226(str, zM10939 ? 5 : 4);
            c21226.m47954();
            float fM47959 = c21226.m47959();
            if (!Float.isNaN(fM47959) && c21226.m47951('%')) {
                fM47959 = (fM47959 * 256.0f) / 100.0f;
            }
            float fM47947 = c21226.m47947(fM47959);
            if (!Float.isNaN(fM47947) && c21226.m47951('%')) {
                fM47947 = (fM47947 * 256.0f) / 100.0f;
            }
            float fM47948 = c21226.m47947(fM47947);
            if (!Float.isNaN(fM47948) && c21226.m47951('%')) {
                fM47948 = (fM47948 * 256.0f) / 100.0f;
            }
            if (!zM10939) {
                c21226.m47954();
                if (Float.isNaN(fM47948) || !c21226.m47951(')')) {
                    throw new C20555("Bad rgb() colour value: ".concat(str));
                }
                return new C21876((m10916(fM47959) << 16) | (-16777216) | (m10916(fM47947) << 8) | m10916(fM47948));
            }
            float fM47949 = c21226.m47947(fM47948);
            c21226.m47954();
            if (Float.isNaN(fM47949) || !c21226.m47951(')')) {
                throw new C20555("Bad rgba() colour value: ".concat(str));
            }
            return new C21876((m10916(fM47949 * 256.0f) << 24) | (m10916(fM47959) << 16) | (m10916(fM47947) << 8) | m10916(fM47948));
        }
        boolean zM109310 = m10939(str, "hsla(");
        if (!zM109310 && !m10939(str, "hsl(")) {
            String lowerCase = str.toLowerCase(Locale.US);
            Integer numM16422 = C7143.m16422(lowerCase);
            if (numM16422 != null) {
                return new C21876(numM16422.intValue());
            }
            throw new C20555(C21466.m48631("Invalid colour keyword: ", lowerCase));
        }
        C21226 c21227 = new C21226(str, zM109310 ? 5 : 4);
        c21227.m47954();
        float fM479510 = c21227.m47959();
        float fM479410 = c21227.m47947(fM479510);
        if (!Float.isNaN(fM479410)) {
            c21227.m47951('%');
        }
        float fM479411 = c21227.m47947(fM479410);
        if (!Float.isNaN(fM479411)) {
            c21227.m47951('%');
        }
        if (!zM109310) {
            c21227.m47954();
            if (Float.isNaN(fM479411) || !c21227.m47951(')')) {
                throw new C20555("Bad hsl() colour value: ".concat(str));
            }
            return new C21876(m10917(fM479510, fM479410, fM479411) | (-16777216));
        }
        float fM479412 = c21227.m47947(fM479411);
        c21227.m47954();
        if (Float.isNaN(fM479412) || !c21227.m47951(')')) {
            throw new C20555("Bad hsla() colour value: ".concat(str));
        }
        return new C21876((m10916(fM479412 * 256.0f) << 24) | m10917(fM479510, fM479410, fM479411));
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m10939(String str, String str2) {
        if (str.length() >= str2.length()) {
            for (int i = 0; i < str2.length(); i++) {
                char cCharAt = str.charAt(i);
                if (cCharAt >= 'A' && cCharAt <= 'Z') {
                    cCharAt = (char) (cCharAt + ' ');
                }
                if (cCharAt == str2.charAt(i)) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m10916(float f) {
        if (f < 0.0f) {
            return 0;
        }
        if (f > 255.0f) {
            return 255;
        }
        return Math.round(f);
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m10917(float f, float f2, float f3) {
        float f4 = 0.0f;
        float f5 = f % 360.0f;
        if (f < 0.0f) {
            f5 += 360.0f;
        }
        float f6 = f5 / 60.0f;
        float f7 = f2 / 100.0f;
        float f8 = f3 / 100.0f;
        if (f7 < 0.0f) {
            f7 = 0.0f;
        } else if (f7 > 1.0f) {
            f7 = 1.0f;
        }
        if (f8 >= 0.0f) {
            f4 = f8 > 1.0f ? 1.0f : f8;
        }
        float f9 = f4 <= 0.5f ? (f7 + 1.0f) * f4 : (f4 + f7) - (f7 * f4);
        float f10 = (f4 * 2.0f) - f9;
        float fM10943 = m10943(f10, f9, f6 + 2.0f);
        float fM10944 = m10943(f10, f9, f6);
        return m10916(m10943(f10, f9, f6 - 2.0f) * 256.0f) | (m10916(fM10943 * 256.0f) << 16) | (m10916(fM10944 * 256.0f) << 8);
    }

    /* JADX INFO: renamed from: ۧ */
    public static float m10943(float f, float f2, float f3) {
        if (f3 < 0.0f) {
            f3 += 6.0f;
        }
        if (f3 >= 6.0f) {
            f3 -= 6.0f;
        }
        if (f3 < 1.0f) {
            return C21740.m49018(f2, f, f3, f);
        }
        if (f3 < 3.0f) {
            return f2;
        }
        return f3 < 4.0f ? C21740.m49018(4.0f, f3, f2 - f, f) : f;
    }

    /* JADX INFO: renamed from: ܿ */
    public static ArrayList m10953(String str) {
        C21226 c21226 = new C21226(str);
        ArrayList arrayList = null;
        do {
            String strM47956 = c21226.m47956();
            if (strM47956 == null) {
                strM47956 = c21226.m47950(true, ',');
            }
            if (strM47956 == null) {
                return arrayList;
            }
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            arrayList.add(strM47956);
            c21226.m47960();
        } while (!c21226.m47955());
        return arrayList;
    }

    /* JADX INFO: renamed from: ۧ */
    public static C3099 m10944(C21226 c21226) {
        if (c21226.m47952("auto")) {
            return new C3099(0.0f);
        }
        return c21226.m47958();
    }

    /* JADX INFO: renamed from: ܳ */
    public static String m10949(String str) {
        if (str.equals("none") || !str.startsWith("url(")) {
            return null;
        }
        if (str.endsWith(MotionUtils.EASING_TYPE_FORMAT_END)) {
            return str.substring(4, str.length() - 1).trim();
        }
        return str.substring(4).trim();
    }
}
