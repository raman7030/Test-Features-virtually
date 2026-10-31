package l;

import android.graphics.Matrix;
import android.util.Xml;
import com.alipay.sdk.m.p.a;
import com.alipay.sdk.m.y.q;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.slider.BaseSlider;
import com.google.android.material.textfield.TextInputLayout;
import com.tencent.mm.opensdk.constants.ConstantsAPI;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
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
public final class C2908 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public boolean f9259;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f9262;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f9267;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public C16312 f9260 = null;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public InterfaceC3738 f9258 = null;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f9264 = false;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f9266 = false;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public EnumC21958 f9268 = null;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public StringBuilder f9263 = null;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f9265 = false;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public StringBuilder f9261 = null;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C16312 m8890(InputStream inputStream, boolean z) {
        this.f9259 = z;
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
            m8878(inputStream);
            if (z && !this.f9267) {
                throw new C19136("SVG root element is missing");
            }
            try {
                inputStream.close();
            } catch (IOException unused2) {
            }
            return this.f9260;
        } catch (Throwable th) {
            try {
                inputStream.close();
            } catch (IOException unused3) {
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m8878(InputStream inputStream) throws C19136 {
        String text;
        try {
            try {
                XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
                C4319 c4319 = new C4319(xmlPullParserNewPullParser);
                xmlPullParserNewPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-docdecl", false);
                xmlPullParserNewPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", true);
                xmlPullParserNewPullParser.setInput(inputStream, null);
                for (int eventType = xmlPullParserNewPullParser.getEventType(); eventType != 1; eventType = xmlPullParserNewPullParser.nextToken()) {
                    if (eventType == 0) {
                        this.f9260 = new C16312();
                        this.f9267 = false;
                    } else if (eventType == 8) {
                        xmlPullParserNewPullParser.getText();
                        C19842 c19842 = new C19842(xmlPullParserNewPullParser.getText());
                        String strM45650 = c19842.m45650();
                        m8884(c19842);
                        strM45650.equals("xml-stylesheet");
                    } else if (eventType == 10) {
                        if (this.f9260.m38409() == null && xmlPullParserNewPullParser.getText().contains("<!ENTITY ")) {
                            try {
                                inputStream.reset();
                                m8852(inputStream);
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
                        m8855(xmlPullParserNewPullParser.getNamespace(), xmlPullParserNewPullParser.getName(), name, c4319);
                    } else if (eventType == 3) {
                        String name2 = xmlPullParserNewPullParser.getName();
                        if (xmlPullParserNewPullParser.getPrefix() != null) {
                            name2 = xmlPullParserNewPullParser.getPrefix() + ':' + name2;
                        }
                        m8854(xmlPullParserNewPullParser.getNamespace(), xmlPullParserNewPullParser.getName(), name2);
                    } else if (eventType == 4) {
                        int[] iArr = new int[2];
                        m8871(xmlPullParserNewPullParser.getTextCharacters(iArr), iArr[0], iArr[1]);
                    } else if (eventType == 5) {
                        m8883(xmlPullParserNewPullParser.getText());
                    } else if (eventType == 6 && (text = xmlPullParserNewPullParser.getText()) != null) {
                        m8883(text);
                    }
                }
            } catch (XmlPullParserException e) {
                throw new C19136("XML parser problem", e);
            }
        } catch (IOException e2) {
            throw new C19136("Stream error", e2);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m8852(InputStream inputStream) throws C19136 {
        try {
            SAXParserFactory sAXParserFactoryNewInstance = SAXParserFactory.newInstance();
            if (this.f9259) {
                sAXParserFactoryNewInstance.setNamespaceAware(true);
            }
            sAXParserFactoryNewInstance.setFeature("http://xml.org/sax/features/external-general-entities", false);
            sAXParserFactoryNewInstance.setFeature("http://xml.org/sax/features/external-parameter-entities", false);
            XMLReader xMLReader = sAXParserFactoryNewInstance.newSAXParser().getXMLReader();
            C14901 c14901 = new C14901(this);
            xMLReader.setContentHandler(c14901);
            xMLReader.setProperty("http://xml.org/sax/properties/lexical-handler", c14901);
            xMLReader.parse(new InputSource(inputStream));
        } catch (IOException e) {
            throw new C19136("Stream error", e);
        } catch (ParserConfigurationException e2) {
            throw new C19136("XML parser problem", e2);
        } catch (SAXException e3) {
            throw new C19136("SVG parse error", e3);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m8858(C2908 c2908) {
        c2908.f9260 = new C16312();
        c2908.f9267 = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:463:0x08dd  */
    /* JADX WARN: Code duplicated, block: B:466:0x08e4  */
    /* JADX WARN: Code duplicated, block: B:787:0x0907 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:793:0x0903 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m8855(String str, String str2, String str3, Attributes attributes) throws C19136 {
        int iIntValue;
        float fM45648;
        float f;
        float f2;
        float f3;
        float f4;
        int i;
        char cCharAt;
        boolean z;
        Attributes attributes2 = attributes;
        if (this.f9259 && !this.f9267) {
            if (!"svg".equals(str2.length() > 0 ? str2 : str3) || (!"http://www.w3.org/2000/svg".equals(str) && !"".equals(str))) {
                throw new C19136("Image XML root is not SVG");
            }
            this.f9267 = true;
        }
        if (this.f9264) {
            this.f9262++;
            return;
        }
        if ("http://www.w3.org/2000/svg".equals(str) || "".equals(str)) {
            EnumC21958 enumC21958M49445 = EnumC21958.m49445(str2.length() > 0 ? str2 : str3);
            int i2 = 77;
            switch (enumC21958M49445.ordinal()) {
                case 0:
                    m8880(attributes2);
                    return;
                case 1:
                case 7:
                    if (this.f9258 == null) {
                        throw new C19136("Invalid document. Root element must be <svg>");
                    }
                    C19115 c19115 = new C19115();
                    c19115.f16090 = this.f9260;
                    c19115.f16091 = this.f9258;
                    m8867((AbstractC19261) c19115, attributes2);
                    m8879(c19115, attributes2);
                    m8856((InterfaceC0063) c19115, attributes2);
                    m8863((InterfaceC8677) c19115, attributes2);
                    this.f9258.mo7197(c19115);
                    this.f9258 = c19115;
                    return;
                case 2:
                    m8870(attributes2);
                    return;
                case 3:
                    if (this.f9258 == null) {
                        throw new C19136("Invalid document. Root element must be <svg>");
                    }
                    C6414 c6414 = new C6414();
                    c6414.f16090 = this.f9260;
                    c6414.f16091 = this.f9258;
                    m8867((AbstractC19261) c6414, attributes2);
                    m8879(c6414, attributes2);
                    m8856((InterfaceC0063) c6414, attributes2);
                    m8863((InterfaceC8677) c6414, attributes2);
                    for (int i3 = 0; i3 < attributes.getLength(); i3++) {
                        String strTrim = attributes2.getValue(i3).trim();
                        if (EnumC21253.m48257(attributes2.getLocalName(i3)).ordinal() == 3) {
                            if ("objectBoundingBox".equals(strTrim)) {
                                c6414.f19849 = Boolean.FALSE;
                            } else {
                                if (!"userSpaceOnUse".equals(strTrim)) {
                                    throw new C19136("Invalid value for attribute clipPathUnits");
                                }
                                c6414.f19849 = Boolean.TRUE;
                            }
                        }
                    }
                    this.f9258.mo7197(c6414);
                    this.f9258 = c6414;
                    return;
                case 4:
                    if (this.f9258 == null) {
                        throw new C19136("Invalid document. Root element must be <svg>");
                    }
                    C8531 c8531 = new C8531();
                    c8531.f16090 = this.f9260;
                    c8531.f16091 = this.f9258;
                    m8867((AbstractC19261) c8531, attributes2);
                    m8879(c8531, attributes2);
                    m8856((InterfaceC0063) c8531, attributes2);
                    this.f9258.mo7197(c8531);
                    this.f9258 = c8531;
                    return;
                case 5:
                case 26:
                    this.f9266 = true;
                    this.f9268 = enumC21958M49445;
                    return;
                case 6:
                    if (this.f9258 == null) {
                        throw new C19136("Invalid document. Root element must be <svg>");
                    }
                    C15585 c15585 = new C15585();
                    c15585.f16090 = this.f9260;
                    c15585.f16091 = this.f9258;
                    m8867((AbstractC19261) c15585, attributes2);
                    m8879(c15585, attributes2);
                    m8856((InterfaceC0063) c15585, attributes2);
                    m8863((InterfaceC8677) c15585, attributes2);
                    for (int i4 = 0; i4 < attributes.getLength(); i4++) {
                        String strTrim2 = attributes2.getValue(i4).trim();
                        int iOrdinal = EnumC21253.m48257(attributes2.getLocalName(i4)).ordinal();
                        if (iOrdinal == 6) {
                            c15585.f48016 = m8889(strTrim2);
                        } else if (iOrdinal == 7) {
                            c15585.f48017 = m8889(strTrim2);
                        } else if (iOrdinal == 56) {
                            C0769 c0769M8889 = m8889(strTrim2);
                            c15585.f48014 = c0769M8889;
                            if (c0769M8889.m2931()) {
                                throw new C19136("Invalid <ellipse> element. rx cannot be negative");
                            }
                        } else if (iOrdinal != 57) {
                            continue;
                        } else {
                            C0769 c0769M88810 = m8889(strTrim2);
                            c15585.f48015 = c0769M88810;
                            if (c0769M88810.m2931()) {
                                throw new C19136("Invalid <ellipse> element. ry cannot be negative");
                            }
                        }
                    }
                    this.f9258.mo7197(c15585);
                    return;
                case 8:
                    if (this.f9258 == null) {
                        throw new C19136("Invalid document. Root element must be <svg>");
                    }
                    C5003 c5003 = new C5003();
                    c5003.f16090 = this.f9260;
                    c5003.f16091 = this.f9258;
                    m8867((AbstractC19261) c5003, attributes2);
                    m8879(c5003, attributes2);
                    m8856((InterfaceC0063) c5003, attributes2);
                    m8863((InterfaceC8677) c5003, attributes2);
                    for (int i5 = 0; i5 < attributes.getLength(); i5++) {
                        String strTrim3 = attributes2.getValue(i5).trim();
                        int iOrdinal2 = EnumC21253.m48257(attributes2.getLocalName(i5)).ordinal();
                        if (iOrdinal2 == 25) {
                            C0769 c0769M88811 = m8889(strTrim3);
                            c5003.f15770 = c0769M88811;
                            if (c0769M88811.m2931()) {
                                throw new C19136("Invalid <use> element. height cannot be negative");
                            }
                        } else if (iOrdinal2 != 26) {
                            if (iOrdinal2 != 48) {
                                switch (iOrdinal2) {
                                    case 81:
                                        C0769 c0769M88812 = m8889(strTrim3);
                                        c5003.f15768 = c0769M88812;
                                        if (c0769M88812.m2931()) {
                                            throw new C19136("Invalid <use> element. width cannot be negative");
                                        }
                                        break;
                                        break;
                                    case 82:
                                        c5003.f15767 = m8889(strTrim3);
                                        break;
                                    case BaseSlider.DEFAULT_LABEL_ANIMATION_ENTER_DURATION /* 83 */:
                                        c5003.f15769 = m8889(strTrim3);
                                        break;
                                }
                            } else {
                                m8862(c5003, strTrim3);
                            }
                        } else if ("".equals(attributes2.getURI(i5)) || "http://www.w3.org/1999/xlink".equals(attributes2.getURI(i5))) {
                            c5003.f15771 = strTrim3;
                        }
                    }
                    this.f9258.mo7197(c5003);
                    this.f9258 = c5003;
                    return;
                case 9:
                    if (this.f9258 == null) {
                        throw new C19136("Invalid document. Root element must be <svg>");
                    }
                    C7825 c7825 = new C7825();
                    c7825.f16090 = this.f9260;
                    c7825.f16091 = this.f9258;
                    m8867((AbstractC19261) c7825, attributes2);
                    m8879(c7825, attributes2);
                    m8856((InterfaceC0063) c7825, attributes2);
                    m8863((InterfaceC8677) c7825, attributes2);
                    for (int i6 = 0; i6 < attributes.getLength(); i6++) {
                        String strTrim4 = attributes2.getValue(i6).trim();
                        switch (EnumC21253.m48257(attributes2.getLocalName(i6)).ordinal()) {
                            case 84:
                                c7825.f24225 = m8889(strTrim4);
                                break;
                            case 85:
                                c7825.f24223 = m8889(strTrim4);
                                break;
                            case HRSS1373Polynomial.K /* 86 */:
                                c7825.f24226 = m8889(strTrim4);
                                break;
                            case TextInputLayout.DEFAULT_PLACEHOLDER_FADE_DURATION /* 87 */:
                                c7825.f24224 = m8889(strTrim4);
                                break;
                        }
                    }
                    this.f9258.mo7197(c7825);
                    return;
                case 10:
                    if (this.f9258 == null) {
                        throw new C19136("Invalid document. Root element must be <svg>");
                    }
                    C0209 c0209 = new C0209();
                    c0209.f16090 = this.f9260;
                    c0209.f16091 = this.f9258;
                    m8867((AbstractC19261) c0209, attributes2);
                    m8879(c0209, attributes2);
                    m8857((AbstractC2181) c0209, attributes2);
                    for (int i7 = 0; i7 < attributes.getLength(); i7++) {
                        String strTrim5 = attributes2.getValue(i7).trim();
                        switch (EnumC21253.m48257(attributes2.getLocalName(i7)).ordinal()) {
                            case 84:
                                c0209.f1454 = m8889(strTrim5);
                                break;
                            case 85:
                                c0209.f1456 = m8889(strTrim5);
                                break;
                            case HRSS1373Polynomial.K /* 86 */:
                                c0209.f1455 = m8889(strTrim5);
                                break;
                            case TextInputLayout.DEFAULT_PLACEHOLDER_FADE_DURATION /* 87 */:
                                c0209.f1457 = m8889(strTrim5);
                                break;
                        }
                    }
                    this.f9258.mo7197(c0209);
                    this.f9258 = c0209;
                    return;
                case 11:
                    if (this.f9258 == null) {
                        throw new C19136("Invalid document. Root element must be <svg>");
                    }
                    C14880 c14880 = new C14880();
                    c14880.f16090 = this.f9260;
                    c14880.f16091 = this.f9258;
                    m8867((AbstractC19261) c14880, attributes2);
                    m8879(c14880, attributes2);
                    m8863((InterfaceC8677) c14880, attributes2);
                    m8869((AbstractC21377) c14880, attributes2);
                    for (int i8 = 0; i8 < attributes.getLength(); i8++) {
                        String strTrim6 = attributes2.getValue(i8).trim();
                        int iOrdinal3 = EnumC21253.m48257(attributes2.getLocalName(i8)).ordinal();
                        if (iOrdinal3 != 41) {
                            if (iOrdinal3 == 50) {
                                c14880.f45418 = m8889(strTrim6);
                            } else if (iOrdinal3 != 51) {
                                switch (iOrdinal3) {
                                    case 32:
                                        C0769 c0769M88813 = m8889(strTrim6);
                                        c14880.f45420 = c0769M88813;
                                        if (c0769M88813.m2931()) {
                                            throw new C19136("Invalid <marker> element. markerHeight cannot be negative");
                                        }
                                        break;
                                    case 33:
                                        if (!"strokeWidth".equals(strTrim6)) {
                                            if (!"userSpaceOnUse".equals(strTrim6)) {
                                                throw new C19136("Invalid value for attribute markerUnits");
                                            }
                                            c14880.f45415 = true;
                                        } else {
                                            c14880.f45415 = false;
                                        }
                                        break;
                                    case 34:
                                        C0769 c0769M88814 = m8889(strTrim6);
                                        c14880.f45417 = c0769M88814;
                                        if (c0769M88814.m2931()) {
                                            throw new C19136("Invalid <marker> element. markerWidth cannot be negative");
                                        }
                                        break;
                                }
                            } else {
                                c14880.f45419 = m8889(strTrim6);
                            }
                        } else if ("auto".equals(strTrim6)) {
                            c14880.f45416 = Float.valueOf(Float.NaN);
                        } else {
                            c14880.f45416 = Float.valueOf(m8887(strTrim6));
                        }
                    }
                    this.f9258.mo7197(c14880);
                    this.f9258 = c14880;
                    return;
                case 12:
                    if (this.f9258 == null) {
                        throw new C19136("Invalid document. Root element must be <svg>");
                    }
                    C21232 c21232 = new C21232();
                    c21232.f16090 = this.f9260;
                    c21232.f16091 = this.f9258;
                    m8867((AbstractC19261) c21232, attributes);
                    m8879(c21232, attributes);
                    m8863((InterfaceC8677) c21232, attributes);
                    for (int i9 = 0; i9 < attributes.getLength(); i9++) {
                        String strTrim7 = attributes.getValue(i9).trim();
                        int iOrdinal4 = EnumC21253.m48257(attributes.getLocalName(i9)).ordinal();
                        if (iOrdinal4 == 25) {
                            C0769 c0769M88815 = m8889(strTrim7);
                            c21232.f68439 = c0769M88815;
                            if (c0769M88815.m2931()) {
                                throw new C19136("Invalid <mask> element. height cannot be negative");
                            }
                        } else if (iOrdinal4 != 36) {
                            if (iOrdinal4 != 37) {
                                switch (iOrdinal4) {
                                    case 81:
                                        C0769 c0769M88816 = m8889(strTrim7);
                                        c21232.f68438 = c0769M88816;
                                        if (c0769M88816.m2931()) {
                                            throw new C19136("Invalid <mask> element. width cannot be negative");
                                        }
                                        break;
                                        break;
                                    case 82:
                                        m8889(strTrim7);
                                        break;
                                    case BaseSlider.DEFAULT_LABEL_ANIMATION_ENTER_DURATION /* 83 */:
                                        m8889(strTrim7);
                                        break;
                                }
                            } else if ("objectBoundingBox".equals(strTrim7)) {
                                c21232.f68441 = Boolean.FALSE;
                            } else {
                                if (!"userSpaceOnUse".equals(strTrim7)) {
                                    throw new C19136("Invalid value for attribute maskUnits");
                                }
                                c21232.f68441 = Boolean.TRUE;
                            }
                        } else if ("objectBoundingBox".equals(strTrim7)) {
                            c21232.f68440 = Boolean.FALSE;
                        } else {
                            if (!"userSpaceOnUse".equals(strTrim7)) {
                                throw new C19136("Invalid value for attribute maskContentUnits");
                            }
                            c21232.f68440 = Boolean.TRUE;
                        }
                    }
                    this.f9258.mo7197(c21232);
                    this.f9258 = c21232;
                    return;
                case 13:
                    if (this.f9258 == null) {
                        throw new C19136("Invalid document. Root element must be <svg>");
                    }
                    C4298 c4298 = new C4298();
                    c4298.f16090 = this.f9260;
                    c4298.f16091 = this.f9258;
                    m8867((AbstractC19261) c4298, attributes2);
                    m8879(c4298, attributes2);
                    m8856((InterfaceC0063) c4298, attributes2);
                    m8863((InterfaceC8677) c4298, attributes2);
                    int i10 = 0;
                    while (i10 < attributes.getLength()) {
                        String strTrim8 = attributes2.getValue(i10).trim();
                        int iOrdinal5 = EnumC21253.m48257(attributes2.getLocalName(i10)).ordinal();
                        if (iOrdinal5 == 13) {
                            C19842 c19842 = new C19842(strTrim8);
                            C2887 c2887 = new C2887();
                            if (!c19842.m45644() && ((iIntValue = c19842.m45646().intValue()) == i2 || iIntValue == 109)) {
                                float f5 = 0.0f;
                                float fM45649 = 0.0f;
                                float f6 = 0.0f;
                                float fM45636 = 0.0f;
                                float f7 = 0.0f;
                                float f8 = 0.0f;
                                while (true) {
                                    c19842.m45643();
                                    switch (iIntValue) {
                                        case 65:
                                        case 97:
                                            float fM456410 = c19842.m45648();
                                            float fM45637 = c19842.m45636(fM456410);
                                            float fM45638 = c19842.m45636(fM45637);
                                            Boolean boolM45638 = c19842.m45638(Float.valueOf(fM45638));
                                            Boolean boolM45639 = c19842.m45638(boolM45638);
                                            if (boolM45639 == null) {
                                                fM45648 = Float.NaN;
                                            } else {
                                                c19842.m45649();
                                                fM45648 = c19842.m45648();
                                            }
                                            float fM45639 = c19842.m45636(fM45648);
                                            if (!Float.isNaN(fM45639)) {
                                                if (fM456410 >= 0.0f && fM45637 >= 0.0f) {
                                                    if (iIntValue == 97) {
                                                        fM45648 += f5;
                                                        fM45639 += f6;
                                                    }
                                                    f5 = fM45648;
                                                    float f9 = fM45639;
                                                    c2887.mo8826(fM456410, fM45637, fM45638, boolM45638.booleanValue(), boolM45639.booleanValue(), f5, f9);
                                                    fM45636 = f9;
                                                    fM45649 = f5;
                                                    f6 = fM45636;
                                                    c19842.m45649();
                                                    if (c19842.m45644()) {
                                                        i = c19842.f64103;
                                                        if (i != c19842.f64101 && (((cCharAt = c19842.f64100.charAt(i)) >= 'a' && cCharAt <= 'z') || (cCharAt >= 'A' && cCharAt <= 'Z'))) {
                                                            iIntValue = c19842.m45646().intValue();
                                                        }
                                                    }
                                                }
                                            }
                                            break;
                                        case 67:
                                        case q.f /* 99 */:
                                            float fM456411 = c19842.m45648();
                                            float fM456310 = c19842.m45636(fM456411);
                                            float fM456311 = c19842.m45636(fM456310);
                                            float fM456312 = c19842.m45636(fM456311);
                                            float fM456313 = c19842.m45636(fM456312);
                                            float fM456314 = c19842.m45636(fM456313);
                                            if (!Float.isNaN(fM456314)) {
                                                if (iIntValue == 99) {
                                                    fM456313 += f5;
                                                    fM456314 += f6;
                                                    fM456411 += f5;
                                                    fM456310 += f6;
                                                    fM456311 += f5;
                                                    fM456312 += f6;
                                                }
                                                f = fM456311;
                                                f2 = fM456312;
                                                f3 = fM456313;
                                                f4 = fM456314;
                                                c2887.mo8825(fM456411, fM456310, f, f2, f3, f4);
                                                fM45649 = f;
                                                fM45636 = f2;
                                                f5 = f3;
                                                f6 = f4;
                                                c19842.m45649();
                                                if (c19842.m45644()) {
                                                    i = c19842.f64103;
                                                    if (i != c19842.f64101) {
                                                        iIntValue = c19842.m45646().intValue();
                                                    }
                                                }
                                            }
                                            break;
                                        case 72:
                                        case IShizukuService.Stub.TRANSACTION_isHidden /* 104 */:
                                            fM45649 = c19842.m45648();
                                            if (!Float.isNaN(fM45649)) {
                                                if (iIntValue == 104) {
                                                    fM45649 += f5;
                                                }
                                                c2887.mo8828(fM45649, f6);
                                                f5 = fM45649;
                                                c19842.m45649();
                                                if (c19842.m45644()) {
                                                    i = c19842.f64103;
                                                    if (i != c19842.f64101) {
                                                        iIntValue = c19842.m45646().intValue();
                                                    }
                                                }
                                            }
                                            break;
                                        case WXMediaMessage.IMediaObject.TYPE_MUSIC_VIDEO /* 76 */:
                                        case 108:
                                            float fM456412 = c19842.m45648();
                                            fM45636 = c19842.m45636(fM456412);
                                            if (!Float.isNaN(fM45636)) {
                                                if (iIntValue == 108) {
                                                    fM456412 += f5;
                                                    fM45636 += f6;
                                                }
                                                f5 = fM456412;
                                                c2887.mo8828(f5, fM45636);
                                                fM45649 = f5;
                                                f6 = fM45636;
                                                c19842.m45649();
                                                if (c19842.m45644()) {
                                                    i = c19842.f64103;
                                                    if (i != c19842.f64101) {
                                                        iIntValue = c19842.m45646().intValue();
                                                    }
                                                }
                                            }
                                            break;
                                        case 77:
                                        case 109:
                                            fM45649 = c19842.m45648();
                                            fM45636 = c19842.m45636(fM45649);
                                            if (!Float.isNaN(fM45636)) {
                                                if (iIntValue == 109 && !c2887.m8829()) {
                                                    fM45649 += f5;
                                                    fM45636 += f6;
                                                }
                                                c2887.mo8823(fM45649, fM45636);
                                                iIntValue = iIntValue == 109 ? 108 : 76;
                                                f5 = fM45649;
                                                f7 = f5;
                                                f6 = fM45636;
                                                f8 = f6;
                                                c19842.m45649();
                                                if (c19842.m45644()) {
                                                    i = c19842.f64103;
                                                    if (i != c19842.f64101) {
                                                        iIntValue = c19842.m45646().intValue();
                                                    }
                                                }
                                            }
                                            break;
                                        case 81:
                                        case UMErrorCode.E_UM_BE_RAW_OVERSIZE /* 113 */:
                                            fM45649 = c19842.m45648();
                                            fM45636 = c19842.m45636(fM45649);
                                            float fM456315 = c19842.m45636(fM45636);
                                            float fM456316 = c19842.m45636(fM456315);
                                            if (!Float.isNaN(fM456316)) {
                                                if (iIntValue == 113) {
                                                    fM456315 += f5;
                                                    fM456316 += f6;
                                                    fM45649 += f5;
                                                    fM45636 += f6;
                                                }
                                                c2887.mo8824(fM45649, fM45636, fM456315, fM456316);
                                                f5 = fM456315;
                                                f6 = fM456316;
                                                c19842.m45649();
                                                if (c19842.m45644()) {
                                                    i = c19842.f64103;
                                                    if (i != c19842.f64101) {
                                                        iIntValue = c19842.m45646().intValue();
                                                    }
                                                }
                                            }
                                            break;
                                        case BaseSlider.DEFAULT_LABEL_ANIMATION_ENTER_DURATION /* 83 */:
                                        case 115:
                                            float f10 = (f5 * 2.0f) - fM45649;
                                            float f11 = (2.0f * f6) - fM45636;
                                            float fM456413 = c19842.m45648();
                                            float fM456317 = c19842.m45636(fM456413);
                                            float fM456318 = c19842.m45636(fM456317);
                                            float fM456319 = c19842.m45636(fM456318);
                                            if (!Float.isNaN(fM456319)) {
                                                if (iIntValue == 115) {
                                                    fM456318 += f5;
                                                    fM456319 += f6;
                                                    fM456413 += f5;
                                                    fM456317 += f6;
                                                }
                                                f = fM456413;
                                                f2 = fM456317;
                                                f3 = fM456318;
                                                f4 = fM456319;
                                                c2887.mo8825(f10, f11, f, f2, f3, f4);
                                                fM45649 = f;
                                                fM45636 = f2;
                                                f5 = f3;
                                                f6 = f4;
                                                c19842.m45649();
                                                if (c19842.m45644()) {
                                                    i = c19842.f64103;
                                                    if (i != c19842.f64101) {
                                                        iIntValue = c19842.m45646().intValue();
                                                    }
                                                }
                                            }
                                            break;
                                        case 84:
                                        case 116:
                                            float f12 = (f5 * 2.0f) - fM45649;
                                            float f13 = (2.0f * f6) - fM45636;
                                            float fM456414 = c19842.m45648();
                                            float fM456320 = c19842.m45636(fM456414);
                                            if (!Float.isNaN(fM456320)) {
                                                if (iIntValue == 116) {
                                                    fM456414 += f5;
                                                    fM456320 += f6;
                                                }
                                                c2887.mo8824(f12, f13, fM456414, fM456320);
                                                f5 = fM456414;
                                                f6 = fM456320;
                                                fM45649 = f12;
                                                fM45636 = f13;
                                                c19842.m45649();
                                                if (c19842.m45644()) {
                                                    i = c19842.f64103;
                                                    if (i != c19842.f64101) {
                                                        iIntValue = c19842.m45646().intValue();
                                                    }
                                                }
                                            }
                                            break;
                                        case HRSS1373Polynomial.K /* 86 */:
                                        case 118:
                                            fM45636 = c19842.m45648();
                                            if (!Float.isNaN(fM45636)) {
                                                if (iIntValue == 118) {
                                                    fM45636 += f6;
                                                }
                                                c2887.mo8828(f5, fM45636);
                                                f6 = fM45636;
                                                c19842.m45649();
                                                if (c19842.m45644()) {
                                                    i = c19842.f64103;
                                                    if (i != c19842.f64101) {
                                                        iIntValue = c19842.m45646().intValue();
                                                    }
                                                }
                                            }
                                            break;
                                        case 90:
                                        case 122:
                                            c2887.close();
                                            f5 = f7;
                                            fM45649 = f5;
                                            fM45636 = f8;
                                            f6 = fM45636;
                                            c19842.m45649();
                                            if (c19842.m45644()) {
                                                i = c19842.f64103;
                                                if (i != c19842.f64101) {
                                                    iIntValue = c19842.m45646().intValue();
                                                }
                                            }
                                            break;
                                        default:
                                            break;
                                    }
                                }
                            }
                            c4298.f13865 = c2887;
                        } else if (iOrdinal5 == 43 && m8887(strTrim8) < 0.0f) {
                            throw new C19136("Invalid <path> element. pathLength cannot be negative");
                        }
                        i10++;
                        i2 = 77;
                        attributes2 = attributes;
                    }
                    this.f9258.mo7197(c4298);
                    return;
                case 14:
                    if (this.f9258 == null) {
                        throw new C19136("Invalid document. Root element must be <svg>");
                    }
                    C12059 c12059 = new C12059();
                    c12059.f16090 = this.f9260;
                    c12059.f16091 = this.f9258;
                    m8867((AbstractC19261) c12059, attributes2);
                    m8879(c12059, attributes2);
                    m8863((InterfaceC8677) c12059, attributes2);
                    m8869((AbstractC21377) c12059, attributes2);
                    for (int i11 = 0; i11 < attributes.getLength(); i11++) {
                        String strTrim9 = attributes2.getValue(i11).trim();
                        int iOrdinal6 = EnumC21253.m48257(attributes2.getLocalName(i11)).ordinal();
                        if (iOrdinal6 == 25) {
                            C0769 c0769M88817 = m8889(strTrim9);
                            c12059.f36074 = c0769M88817;
                            if (c0769M88817.m2931()) {
                                throw new C19136("Invalid <pattern> element. height cannot be negative");
                            }
                        } else if (iOrdinal6 != 26) {
                            switch (iOrdinal6) {
                                case 44:
                                    if (!"objectBoundingBox".equals(strTrim9)) {
                                        if (!"userSpaceOnUse".equals(strTrim9)) {
                                            throw new C19136("Invalid value for attribute patternContentUnits");
                                        }
                                        c12059.f36071 = Boolean.TRUE;
                                    } else {
                                        c12059.f36071 = Boolean.FALSE;
                                    }
                                    break;
                                case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                                    c12059.f36070 = m8874(strTrim9);
                                    break;
                                case 46:
                                    if (!"objectBoundingBox".equals(strTrim9)) {
                                        if (!"userSpaceOnUse".equals(strTrim9)) {
                                            throw new C19136("Invalid value for attribute patternUnits");
                                        }
                                        c12059.f36072 = Boolean.TRUE;
                                    } else {
                                        c12059.f36072 = Boolean.FALSE;
                                    }
                                    break;
                                default:
                                    switch (iOrdinal6) {
                                        case 81:
                                            C0769 c0769M88818 = m8889(strTrim9);
                                            c12059.f36073 = c0769M88818;
                                            if (c0769M88818.m2931()) {
                                                throw new C19136("Invalid <pattern> element. width cannot be negative");
                                            }
                                            break;
                                            break;
                                        case 82:
                                            c12059.f36075 = m8889(strTrim9);
                                            break;
                                        case BaseSlider.DEFAULT_LABEL_ANIMATION_ENTER_DURATION /* 83 */:
                                            c12059.f36076 = m8889(strTrim9);
                                            break;
                                    }
                                    break;
                            }
                        } else if ("".equals(attributes2.getURI(i11)) || "http://www.w3.org/1999/xlink".equals(attributes2.getURI(i11))) {
                            c12059.f36069 = strTrim9;
                        }
                    }
                    this.f9258.mo7197(c12059);
                    this.f9258 = c12059;
                    return;
                case 15:
                    if (this.f9258 == null) {
                        throw new C19136("Invalid document. Root element must be <svg>");
                    }
                    C5709 c5709 = new C5709();
                    c5709.f16090 = this.f9260;
                    c5709.f16091 = this.f9258;
                    m8867((AbstractC19261) c5709, attributes2);
                    m8879(c5709, attributes2);
                    m8856((InterfaceC0063) c5709, attributes2);
                    m8863((InterfaceC8677) c5709, attributes2);
                    m8864(c5709, attributes2, "polygon");
                    this.f9258.mo7197(c5709);
                    return;
                case 16:
                    if (this.f9258 == null) {
                        throw new C19136("Invalid document. Root element must be <svg>");
                    }
                    C9943 c9943 = new C9943();
                    c9943.f16090 = this.f9260;
                    c9943.f16091 = this.f9258;
                    m8867((AbstractC19261) c9943, attributes2);
                    m8879(c9943, attributes2);
                    m8856((InterfaceC0063) c9943, attributes2);
                    m8863((InterfaceC8677) c9943, attributes2);
                    m8864(c9943, attributes2, "polyline");
                    this.f9258.mo7197(c9943);
                    return;
                case 17:
                    if (this.f9258 == null) {
                        throw new C19136("Invalid document. Root element must be <svg>");
                    }
                    C15025 c15025 = new C15025();
                    c15025.f16090 = this.f9260;
                    c15025.f16091 = this.f9258;
                    m8867((AbstractC19261) c15025, attributes2);
                    m8879(c15025, attributes2);
                    m8857((AbstractC2181) c15025, attributes2);
                    for (int i12 = 0; i12 < attributes.getLength(); i12++) {
                        String strTrim10 = attributes2.getValue(i12).trim();
                        int iOrdinal7 = EnumC21253.m48257(attributes2.getLocalName(i12)).ordinal();
                        if (iOrdinal7 == 6) {
                            c15025.f45799 = m8889(strTrim10);
                        } else if (iOrdinal7 == 7) {
                            c15025.f45800 = m8889(strTrim10);
                        } else if (iOrdinal7 == 11) {
                            c15025.f45801 = m8889(strTrim10);
                        } else if (iOrdinal7 == 12) {
                            c15025.f45802 = m8889(strTrim10);
                        } else if (iOrdinal7 != 49) {
                            continue;
                        } else {
                            C0769 c0769M88819 = m8889(strTrim10);
                            c15025.f45798 = c0769M88819;
                            if (c0769M88819.m2931()) {
                                throw new C19136("Invalid <radialGradient> element. r cannot be negative");
                            }
                        }
                    }
                    this.f9258.mo7197(c15025);
                    this.f9258 = c15025;
                    return;
                case 18:
                    if (this.f9258 == null) {
                        throw new C19136("Invalid document. Root element must be <svg>");
                    }
                    C11354 c11354 = new C11354();
                    c11354.f16090 = this.f9260;
                    c11354.f16091 = this.f9258;
                    m8867((AbstractC19261) c11354, attributes2);
                    m8879(c11354, attributes2);
                    m8856((InterfaceC0063) c11354, attributes2);
                    m8863((InterfaceC8677) c11354, attributes2);
                    for (int i13 = 0; i13 < attributes.getLength(); i13++) {
                        String strTrim11 = attributes2.getValue(i13).trim();
                        int iOrdinal8 = EnumC21253.m48257(attributes2.getLocalName(i13)).ordinal();
                        if (iOrdinal8 == 25) {
                            C0769 c0769M88820 = m8889(strTrim11);
                            c11354.f33986 = c0769M88820;
                            if (c0769M88820.m2931()) {
                                throw new C19136("Invalid <rect> element. height cannot be negative");
                            }
                        } else if (iOrdinal8 == 56) {
                            C0769 c0769M88821 = m8889(strTrim11);
                            c11354.f33987 = c0769M88821;
                            if (c0769M88821.m2931()) {
                                throw new C19136("Invalid <rect> element. rx cannot be negative");
                            }
                        } else if (iOrdinal8 != 57) {
                            switch (iOrdinal8) {
                                case 81:
                                    C0769 c0769M88822 = m8889(strTrim11);
                                    c11354.f33984 = c0769M88822;
                                    if (c0769M88822.m2931()) {
                                        throw new C19136("Invalid <rect> element. width cannot be negative");
                                    }
                                    break;
                                    break;
                                case 82:
                                    c11354.f33983 = m8889(strTrim11);
                                    break;
                                case BaseSlider.DEFAULT_LABEL_ANIMATION_ENTER_DURATION /* 83 */:
                                    c11354.f33985 = m8889(strTrim11);
                                    break;
                            }
                        } else {
                            C0769 c0769M88823 = m8889(strTrim11);
                            c11354.f33982 = c0769M88823;
                            if (c0769M88823.m2931()) {
                                throw new C19136("Invalid <rect> element. ry cannot be negative");
                            }
                        }
                    }
                    this.f9258.mo7197(c11354);
                    return;
                case 19:
                    if (this.f9258 == null) {
                        throw new C19136("Invalid document. Root element must be <svg>");
                    }
                    C22642 c22642 = new C22642();
                    c22642.f16090 = this.f9260;
                    c22642.f16091 = this.f9258;
                    m8867(c22642, attributes2);
                    m8879(c22642, attributes2);
                    this.f9258.mo7197(c22642);
                    this.f9258 = c22642;
                    return;
                case 20:
                    InterfaceC3738 interfaceC3738 = this.f9258;
                    if (interfaceC3738 == null) {
                        throw new C19136("Invalid document. Root element must be <svg>");
                    }
                    if (!(interfaceC3738 instanceof AbstractC2181)) {
                        throw new C19136("Invalid document. <stop> elements are only valid inside <linearGradient> or <radialGradient> elements.");
                    }
                    C13469 c13469 = new C13469();
                    c13469.f16090 = this.f9260;
                    c13469.f16091 = this.f9258;
                    m8867(c13469, attributes2);
                    m8879(c13469, attributes2);
                    for (int i14 = 0; i14 < attributes.getLength(); i14++) {
                        String strTrim12 = attributes2.getValue(i14).trim();
                        if (EnumC21253.m48257(attributes2.getLocalName(i14)).ordinal() == 39) {
                            if (strTrim12.length() == 0) {
                                throw new C19136("Invalid offset value in <stop> (empty string)");
                            }
                            int length = strTrim12.length();
                            if (C7416.m19937(1, strTrim12) == '%') {
                                length--;
                                z = true;
                            } else {
                                z = false;
                            }
                            try {
                                float fM8848 = m8848(length, strTrim12);
                                float f14 = 100.0f;
                                if (z) {
                                    fM8848 /= 100.0f;
                                }
                                if (fM8848 < 0.0f) {
                                    f14 = 0.0f;
                                } else if (fM8848 <= 100.0f) {
                                    f14 = fM8848;
                                }
                                c13469.f40209 = Float.valueOf(f14);
                            } catch (NumberFormatException e) {
                                throw new C19136("Invalid offset value in <stop>: ".concat(strTrim12), e);
                            }
                        }
                    }
                    this.f9258.mo7197(c13469);
                    this.f9258 = c13469;
                    return;
                case 21:
                    if (this.f9258 == null) {
                        throw new C19136("Invalid document. Root element must be <svg>");
                    }
                    String str4 = ProviderConfigurationPermission.ALL_STR;
                    boolean zEquals = true;
                    for (int i15 = 0; i15 < attributes.getLength(); i15++) {
                        String strTrim13 = attributes2.getValue(i15).trim();
                        int iOrdinal9 = EnumC21253.m48257(attributes2.getLocalName(i15)).ordinal();
                        if (iOrdinal9 == 38) {
                            str4 = strTrim13;
                        } else if (iOrdinal9 == 77) {
                            zEquals = strTrim13.equals("text/css");
                        }
                    }
                    if (zEquals && C23200.m51488(str4, EnumC0622.screen)) {
                        this.f9265 = true;
                        return;
                    } else {
                        this.f9264 = true;
                        this.f9262 = 1;
                        return;
                    }
                case 22:
                    if (this.f9258 == null) {
                        throw new C19136("Invalid document. Root element must be <svg>");
                    }
                    C22082 c22082 = new C22082();
                    c22082.f16090 = this.f9260;
                    c22082.f16091 = this.f9258;
                    m8867((AbstractC19261) c22082, attributes2);
                    m8879(c22082, attributes2);
                    m8856((InterfaceC0063) c22082, attributes2);
                    m8863((InterfaceC8677) c22082, attributes2);
                    this.f9258.mo7197(c22082);
                    this.f9258 = c22082;
                    return;
                case 23:
                    if (this.f9258 == null) {
                        throw new C19136("Invalid document. Root element must be <svg>");
                    }
                    C19966 c19966 = new C19966();
                    c19966.f16090 = this.f9260;
                    c19966.f16091 = this.f9258;
                    m8867((AbstractC19261) c19966, attributes2);
                    m8879(c19966, attributes2);
                    m8863((InterfaceC8677) c19966, attributes2);
                    m8869((AbstractC21377) c19966, attributes2);
                    this.f9258.mo7197(c19966);
                    this.f9258 = c19966;
                    return;
                case 24:
                    if (this.f9258 == null) {
                        throw new C19136("Invalid document. Root element must be <svg>");
                    }
                    C12909 c12909 = new C12909();
                    c12909.f16090 = this.f9260;
                    c12909.f16091 = this.f9258;
                    m8867((AbstractC19261) c12909, attributes2);
                    m8879(c12909, attributes2);
                    m8856((InterfaceC0063) c12909, attributes2);
                    m8863((InterfaceC8677) c12909, attributes2);
                    m8865((AbstractC11499) c12909, attributes2);
                    this.f9258.mo7197(c12909);
                    this.f9258 = c12909;
                    return;
                case 25:
                    if (this.f9258 == null) {
                        throw new C19136("Invalid document. Root element must be <svg>");
                    }
                    C5854 c5854 = new C5854();
                    c5854.f16090 = this.f9260;
                    c5854.f16091 = this.f9258;
                    m8867((AbstractC19261) c5854, attributes2);
                    m8879(c5854, attributes2);
                    m8863((InterfaceC8677) c5854, attributes2);
                    for (int i16 = 0; i16 < attributes.getLength(); i16++) {
                        String strTrim14 = attributes2.getValue(i16).trim();
                        int iOrdinal10 = EnumC21253.m48257(attributes2.getLocalName(i16)).ordinal();
                        if (iOrdinal10 != 26) {
                            if (iOrdinal10 == 61) {
                                c5854.f17956 = m8889(strTrim14);
                            }
                        } else if ("".equals(attributes2.getURI(i16)) || "http://www.w3.org/1999/xlink".equals(attributes2.getURI(i16))) {
                            c5854.f17955 = strTrim14;
                        }
                    }
                    this.f9258.mo7197(c5854);
                    this.f9258 = c5854;
                    InterfaceC3738 interfaceC3739 = c5854.f16091;
                    if (interfaceC3739 instanceof InterfaceC22787) {
                        c5854.m16413((InterfaceC22787) interfaceC3739);
                        return;
                    } else {
                        c5854.m16413(((InterfaceC12204) interfaceC3739).mo9283());
                        return;
                    }
                case 27:
                    InterfaceC3738 interfaceC37310 = this.f9258;
                    if (interfaceC37310 == null) {
                        throw new C19136("Invalid document. Root element must be <svg>");
                    }
                    if (!(interfaceC37310 instanceof AbstractC10088)) {
                        throw new C19136("Invalid document. <tref> elements are only valid inside <text> or <tspan> elements.");
                    }
                    C4443 c4443 = new C4443();
                    c4443.f16090 = this.f9260;
                    c4443.f16091 = this.f9258;
                    m8867((AbstractC19261) c4443, attributes2);
                    m8879(c4443, attributes2);
                    m8863((InterfaceC8677) c4443, attributes2);
                    for (int i17 = 0; i17 < attributes.getLength(); i17++) {
                        String strTrim15 = attributes2.getValue(i17).trim();
                        if (EnumC21253.m48257(attributes2.getLocalName(i17)).ordinal() == 26 && ("".equals(attributes2.getURI(i17)) || "http://www.w3.org/1999/xlink".equals(attributes2.getURI(i17)))) {
                            c4443.f14194 = strTrim15;
                        }
                    }
                    this.f9258.mo7197(c4443);
                    InterfaceC3738 interfaceC37311 = c4443.f16091;
                    if (interfaceC37311 instanceof InterfaceC22787) {
                        c4443.m13194((InterfaceC22787) interfaceC37311);
                        return;
                    } else {
                        c4443.m13194(((InterfaceC12204) interfaceC37311).mo9283());
                        return;
                    }
                case 28:
                    InterfaceC3738 interfaceC37312 = this.f9258;
                    if (interfaceC37312 == null) {
                        throw new C19136("Invalid document. Root element must be <svg>");
                    }
                    if (!(interfaceC37312 instanceof AbstractC10088)) {
                        throw new C19136("Invalid document. <tspan> elements are only valid inside <text> or other <tspan> elements.");
                    }
                    C3032 c3032 = new C3032();
                    c3032.f16090 = this.f9260;
                    c3032.f16091 = this.f9258;
                    m8867((AbstractC19261) c3032, attributes2);
                    m8879(c3032, attributes2);
                    m8863((InterfaceC8677) c3032, attributes2);
                    m8865((AbstractC11499) c3032, attributes2);
                    this.f9258.mo7197(c3032);
                    this.f9258 = c3032;
                    InterfaceC3738 interfaceC37313 = c3032.f16091;
                    if (interfaceC37313 instanceof InterfaceC22787) {
                        c3032.m9282((InterfaceC22787) interfaceC37313);
                        return;
                    } else {
                        c3032.m9282(((InterfaceC12204) interfaceC37313).mo9283());
                        return;
                    }
                case 29:
                    if (this.f9258 == null) {
                        throw new C19136("Invalid document. Root element must be <svg>");
                    }
                    C1496 c1496 = new C1496();
                    c1496.f16090 = this.f9260;
                    c1496.f16091 = this.f9258;
                    m8867((AbstractC19261) c1496, attributes2);
                    m8879(c1496, attributes2);
                    m8856((InterfaceC0063) c1496, attributes2);
                    m8863((InterfaceC8677) c1496, attributes2);
                    for (int i18 = 0; i18 < attributes.getLength(); i18++) {
                        String strTrim16 = attributes2.getValue(i18).trim();
                        int iOrdinal11 = EnumC21253.m48257(attributes2.getLocalName(i18)).ordinal();
                        if (iOrdinal11 == 25) {
                            C0769 c0769M88824 = m8889(strTrim16);
                            c1496.f5340 = c0769M88824;
                            if (c0769M88824.m2931()) {
                                throw new C19136("Invalid <use> element. height cannot be negative");
                            }
                        } else if (iOrdinal11 != 26) {
                            switch (iOrdinal11) {
                                case 81:
                                    C0769 c0769M88825 = m8889(strTrim16);
                                    c1496.f5337 = c0769M88825;
                                    if (c0769M88825.m2931()) {
                                        throw new C19136("Invalid <use> element. width cannot be negative");
                                    }
                                    break;
                                    break;
                                case 82:
                                    c1496.f5339 = m8889(strTrim16);
                                    break;
                                case BaseSlider.DEFAULT_LABEL_ANIMATION_ENTER_DURATION /* 83 */:
                                    c1496.f5338 = m8889(strTrim16);
                                    break;
                            }
                        } else if ("".equals(attributes2.getURI(i18)) || "http://www.w3.org/1999/xlink".equals(attributes2.getURI(i18))) {
                            c1496.f5341 = strTrim16;
                        }
                    }
                    this.f9258.mo7197(c1496);
                    this.f9258 = c1496;
                    return;
                case 30:
                    if (this.f9258 == null) {
                        throw new C19136("Invalid document. Root element must be <svg>");
                    }
                    C10669 c10669 = new C10669();
                    c10669.f16090 = this.f9260;
                    c10669.f16091 = this.f9258;
                    m8867((AbstractC19261) c10669, attributes2);
                    m8863((InterfaceC8677) c10669, attributes2);
                    m8869((AbstractC21377) c10669, attributes2);
                    this.f9258.mo7197(c10669);
                    this.f9258 = c10669;
                    return;
                default:
                    this.f9264 = true;
                    this.f9262 = 1;
                    return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public void m8883(String str) {
        if (this.f9264) {
            return;
        }
        if (this.f9266) {
            if (this.f9263 == null) {
                this.f9263 = new StringBuilder(str.length());
            }
            this.f9263.append(str);
        } else if (this.f9265) {
            if (this.f9261 == null) {
                this.f9261 = new StringBuilder(str.length());
            }
            this.f9261.append(str);
        } else if (this.f9258 instanceof AbstractC10088) {
            m8853(str);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m8871(char[] cArr, int i, int i2) {
        if (this.f9264) {
            return;
        }
        if (this.f9266) {
            if (this.f9263 == null) {
                this.f9263 = new StringBuilder(i2);
            }
            this.f9263.append(cArr, i, i2);
        } else if (this.f9265) {
            if (this.f9261 == null) {
                this.f9261 = new StringBuilder(i2);
            }
            this.f9261.append(cArr, i, i2);
        } else if (this.f9258 instanceof AbstractC10088) {
            m8853(new String(cArr, i, i2));
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m8853(String str) {
        AbstractC15731 abstractC15731 = (AbstractC15731) this.f9258;
        int size = abstractC15731.f48531.size();
        C5149 c5149 = size == 0 ? null : (C5149) abstractC15731.f48531.get(size - 1);
        if (c5149 instanceof C13614) {
            C13614 c13614 = (C13614) c5149;
            c13614.f40613 = C9045.m23341(new StringBuilder(), c13614.f40613, str);
        } else {
            InterfaceC3738 interfaceC3738 = this.f9258;
            C13614 c13615 = new C13614();
            c13615.f40613 = str;
            interfaceC3738.mo7197(c13615);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m8854(String str, String str2, String str3) {
        if (this.f9264) {
            int i = this.f9262 - 1;
            this.f9262 = i;
            if (i == 0) {
                this.f9264 = false;
            }
        }
        if ("http://www.w3.org/2000/svg".equals(str) || "".equals(str)) {
            if (str2.length() <= 0) {
                str2 = str3;
            }
            switch (EnumC21958.m49445(str2).ordinal()) {
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
                    this.f9258 = ((C5149) this.f9258).f16091;
                    break;
                case 5:
                case 26:
                    this.f9266 = false;
                    if (this.f9263 != null) {
                        EnumC21958 enumC21958 = this.f9268;
                        if (enumC21958 == EnumC21958.title || enumC21958 == EnumC21958.desc) {
                            this.f9260.getClass();
                        }
                        this.f9263.setLength(0);
                    }
                    break;
                case 21:
                    StringBuilder sb = this.f9261;
                    if (sb != null) {
                        this.f9265 = false;
                        this.f9260.m38404(new C23200(EnumC0622.screen, EnumC11912.Document).m51495(sb.toString()));
                        this.f9261.setLength(0);
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static HashMap m8884(C19842 c19842) {
        HashMap map = new HashMap();
        c19842.m45643();
        while (true) {
            String strM45639 = c19842.m45639(false, a.h);
            if (strM45639 == null) {
                return map;
            }
            c19842.m45640(a.h);
            map.put(strM45639, c19842.m45645());
            c19842.m45643();
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m8880(Attributes attributes) throws C19136 {
        C9383 c9383 = new C9383();
        c9383.f16090 = this.f9260;
        c9383.f16091 = this.f9258;
        m8867((AbstractC19261) c9383, attributes);
        m8879(c9383, attributes);
        m8863((InterfaceC8677) c9383, attributes);
        m8869((AbstractC21377) c9383, attributes);
        for (int i = 0; i < attributes.getLength(); i++) {
            String strTrim = attributes.getValue(i).trim();
            int iOrdinal = EnumC21253.m48257(attributes.getLocalName(i)).ordinal();
            if (iOrdinal == 25) {
                C0769 c0769M8889 = m8889(strTrim);
                c9383.f28501 = c0769M8889;
                if (c0769M8889.m2931()) {
                    throw new C19136("Invalid <svg> element. height cannot be negative");
                }
            } else if (iOrdinal != 79) {
                switch (iOrdinal) {
                    case 81:
                        C0769 c0769M88810 = m8889(strTrim);
                        c9383.f28498 = c0769M88810;
                        if (c0769M88810.m2931()) {
                            throw new C19136("Invalid <svg> element. width cannot be negative");
                        }
                        break;
                        break;
                    case 82:
                        c9383.f28500 = m8889(strTrim);
                        break;
                    case BaseSlider.DEFAULT_LABEL_ANIMATION_ENTER_DURATION /* 83 */:
                        c9383.f28499 = m8889(strTrim);
                        break;
                }
            } else {
                continue;
            }
        }
        InterfaceC3738 interfaceC3738 = this.f9258;
        if (interfaceC3738 == null) {
            this.f9260.m38403(c9383);
        } else {
            interfaceC3738.mo7197(c9383);
        }
        this.f9258 = c9383;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m8870(Attributes attributes) throws C19136 {
        if (this.f9258 == null) {
            throw new C19136("Invalid document. Root element must be <svg>");
        }
        C23347 c23347 = new C23347();
        c23347.f16090 = this.f9260;
        c23347.f16091 = this.f9258;
        m8867((AbstractC19261) c23347, attributes);
        m8879(c23347, attributes);
        m8856((InterfaceC0063) c23347, attributes);
        m8863((InterfaceC8677) c23347, attributes);
        for (int i = 0; i < attributes.getLength(); i++) {
            String strTrim = attributes.getValue(i).trim();
            int iOrdinal = EnumC21253.m48257(attributes.getLocalName(i)).ordinal();
            if (iOrdinal == 6) {
                c23347.f75015 = m8889(strTrim);
            } else if (iOrdinal == 7) {
                c23347.f75016 = m8889(strTrim);
            } else if (iOrdinal != 49) {
                continue;
            } else {
                C0769 c0769M8889 = m8889(strTrim);
                c23347.f75014 = c0769M8889;
                if (c0769M8889.m2931()) {
                    throw new C19136("Invalid <circle> element. r cannot be negative");
                }
            }
        }
        this.f9258.mo7197(c23347);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m8864(C9943 c9943, Attributes attributes, String str) throws C19136 {
        for (int i = 0; i < attributes.getLength(); i++) {
            if (EnumC21253.m48257(attributes.getLocalName(i)) == EnumC21253.points) {
                C19842 c19842 = new C19842(attributes.getValue(i));
                ArrayList arrayList = new ArrayList();
                c19842.m45643();
                while (!c19842.m45644()) {
                    float fM45648 = c19842.m45648();
                    if (Float.isNaN(fM45648)) {
                        throw new C19136(C4860.m14172("Invalid <", str, "> points attribute. Non-coordinate content found in list."));
                    }
                    c19842.m45649();
                    float fM45649 = c19842.m45648();
                    if (Float.isNaN(fM45649)) {
                        throw new C19136(C4860.m14172("Invalid <", str, "> points attribute. There should be an even number of coordinates."));
                    }
                    c19842.m45649();
                    arrayList.add(Float.valueOf(fM45648));
                    arrayList.add(Float.valueOf(fM45649));
                }
                c9943.f30025 = new float[arrayList.size()];
                Iterator it = arrayList.iterator();
                int i2 = 0;
                while (it.hasNext()) {
                    c9943.f30025[i2] = ((Float) it.next()).floatValue();
                    i2++;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m8865(AbstractC11499 abstractC11499, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String strTrim = attributes.getValue(i).trim();
            int iOrdinal = EnumC21253.m48257(attributes.getLocalName(i)).ordinal();
            if (iOrdinal == 9) {
                abstractC11499.f34356 = m8873(strTrim);
            } else if (iOrdinal == 10) {
                abstractC11499.f34357 = m8873(strTrim);
            } else if (iOrdinal == 82) {
                abstractC11499.f34358 = m8873(strTrim);
            } else if (iOrdinal == 83) {
                abstractC11499.f34355 = m8873(strTrim);
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m8863(InterfaceC8677 interfaceC8677, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String strTrim = attributes.getValue(i).trim();
            int iOrdinal = EnumC21253.m48257(attributes.getLocalName(i)).ordinal();
            if (iOrdinal != 73) {
                switch (iOrdinal) {
                    case 52:
                        C19842 c19842 = new C19842(strTrim);
                        HashSet hashSet = new HashSet();
                        while (!c19842.m45644()) {
                            String strM45650 = c19842.m45650();
                            if (strM45650.startsWith("http://www.w3.org/TR/SVG11/feature#")) {
                                hashSet.add(strM45650.substring(35));
                            } else {
                                hashSet.add("UNSUPPORTED");
                            }
                            c19842.m45643();
                        }
                        interfaceC8677.mo7587(hashSet);
                        break;
                    case 53:
                        interfaceC8677.mo7586(strTrim);
                        break;
                    case ThreefishEngine.Threefish512Cipher.ROTATION_3_2 /* 54 */:
                        C19842 c19843 = new C19842(strTrim);
                        HashSet hashSet2 = new HashSet();
                        while (!c19843.m45644()) {
                            hashSet2.add(c19843.m45650());
                            c19843.m45643();
                        }
                        interfaceC8677.mo7594(hashSet2);
                        break;
                    case ThreefishEngine.Threefish1024Cipher.ROTATION_1_3 /* 55 */:
                        ArrayList arrayListM8886 = m8886(strTrim);
                        interfaceC8677.mo7591(arrayListM8886 != null ? new HashSet(arrayListM8886) : new HashSet(0));
                        break;
                }
            } else {
                C19842 c19844 = new C19842(strTrim);
                HashSet hashSet3 = new HashSet();
                while (!c19844.m45644()) {
                    String strM45651 = c19844.m45650();
                    int iIndexOf = strM45651.indexOf(45);
                    if (iIndexOf != -1) {
                        strM45651 = strM45651.substring(0, iIndexOf);
                    }
                    hashSet3.add(new Locale(strM45651, "", "").getLanguage());
                    c19844.m45643();
                }
                interfaceC8677.mo7589(hashSet3);
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m8857(AbstractC2181 abstractC2181, Attributes attributes) throws C19136 {
        for (int i = 0; i < attributes.getLength(); i++) {
            String strTrim = attributes.getValue(i).trim();
            int iOrdinal = EnumC21253.m48257(attributes.getLocalName(i)).ordinal();
            if (iOrdinal == 23) {
                abstractC2181.f7183 = m8874(strTrim);
            } else if (iOrdinal != 24) {
                if (iOrdinal != 26) {
                    if (iOrdinal != 60) {
                        continue;
                    } else {
                        try {
                            abstractC2181.f7182 = EnumC3592.valueOf(strTrim);
                        } catch (IllegalArgumentException unused) {
                            throw new C19136(C4860.m14172("Invalid spreadMethod attribute. \"", strTrim, "\" is not a valid value."));
                        }
                    }
                } else if ("".equals(attributes.getURI(i)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i))) {
                    abstractC2181.f7180 = strTrim;
                }
            } else if ("objectBoundingBox".equals(strTrim)) {
                abstractC2181.f7181 = Boolean.FALSE;
            } else {
                if (!"userSpaceOnUse".equals(strTrim)) {
                    throw new C19136("Invalid value for attribute gradientUnits");
                }
                abstractC2181.f7181 = Boolean.TRUE;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m8867(AbstractC19261 abstractC19261, Attributes attributes) throws C19136 {
        for (int i = 0; i < attributes.getLength(); i++) {
            String qName = attributes.getQName(i);
            if (qName.equals("id") || qName.equals("xml:id")) {
                abstractC19261.f60633 = attributes.getValue(i).trim();
                return;
            }
            if (qName.equals("xml:space")) {
                String strTrim = attributes.getValue(i).trim();
                if ("default".equals(strTrim)) {
                    abstractC19261.f60631 = Boolean.FALSE;
                    return;
                } else {
                    if (!"preserve".equals(strTrim)) {
                        throw new C19136(C20094.m46315("Invalid value for \"xml:space\" attribute: ", strTrim));
                    }
                    abstractC19261.f60631 = Boolean.TRUE;
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m8879(AbstractC19261 abstractC19261, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String strTrim = attributes.getValue(i).trim();
            if (strTrim.length() != 0) {
                int iOrdinal = EnumC21253.m48257(attributes.getLocalName(i)).ordinal();
                if (iOrdinal == 0) {
                    C18968 c18968 = new C18968(strTrim);
                    ArrayList arrayList = null;
                    while (!c18968.m45644()) {
                        String strM45650 = c18968.m45650();
                        if (strM45650 != null) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(strM45650);
                            c18968.m45643();
                        }
                    }
                    abstractC19261.f60634 = arrayList;
                } else if (iOrdinal != 72) {
                    if (abstractC19261.f60632 == null) {
                        abstractC19261.f60632 = new C20672();
                    }
                    m8868(abstractC19261.f60632, attributes.getLocalName(i), attributes.getValue(i).trim());
                } else {
                    m8866(abstractC19261, strTrim, false);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m8866(AbstractC19261 abstractC19261, String str, boolean z) {
        C19842 c19842 = new C19842(str.replaceAll("/\\*.*?\\*/", ""));
        while (true) {
            String strM45639 = c19842.m45639(false, ':');
            c19842.m45643();
            if (!c19842.m45640(':')) {
                return;
            }
            c19842.m45643();
            String strM456310 = c19842.m45639(true, ';');
            if (strM456310 == null) {
                return;
            }
            c19842.m45643();
            if (c19842.m45644() || c19842.m45640(';')) {
                if (!z || m8881(strM45639)) {
                    if (abstractC19261.f60635 == null) {
                        abstractC19261.f60635 = new C20672();
                    }
                    m8868(abstractC19261.f60635, strM45639, strM456310);
                }
                c19842.m45643();
            }
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m8881(String str) {
        int iOrdinal = EnumC21253.m48257(str).ordinal();
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
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m8868(C20672 c20672, String str, String str2) {
        String strM45639;
        C0769 c0769M2994;
        C0769 c0769M45647;
        if (str2.length() == 0 || str2.equals("inherit")) {
            return;
        }
        int iOrdinal = EnumC21253.m48257(str).ordinal();
        C14174 c14174 = null;
        C0769 c0769M8889 = null;
        EnumC7120 enumC7120 = null;
        EnumC16437 enumC16437 = null;
        EnumC10794 enumC10794 = null;
        c0769Arr = null;
        c0769Arr = null;
        c0769Arr = null;
        c0769Arr = null;
        c0769Arr = null;
        C0769[] c0769Arr = null;
        EnumC17849 enumC17849 = null;
        EnumC1621 enumC1621 = null;
        String strSubstring = null;
        EnumC7120 enumC7121 = null;
        EnumC14320 enumC14320 = null;
        EnumC17143 enumC17143 = null;
        EnumC6560 enumC6560 = null;
        Boolean bool = null;
        EnumC23493 enumC23493 = null;
        c14174 = null;
        c14174 = null;
        if (iOrdinal == 1) {
            if (!"auto".equals(str2) && str2.startsWith("rect(")) {
                C19842 c19842 = new C19842(str2.substring(5));
                c19842.m45643();
                C0769 c0769M8877 = m8877(c19842);
                c19842.m45649();
                C0769 c0769M8878 = m8877(c19842);
                c19842.m45649();
                C0769 c0769M8879 = m8877(c19842);
                c19842.m45649();
                C0769 c0769M88710 = m8877(c19842);
                c19842.m45643();
                if (c19842.m45640(')') || c19842.m45644()) {
                    c14174 = new C14174();
                    c14174.f42807 = c0769M8877;
                    c14174.f42806 = c0769M8878;
                    c14174.f42804 = c0769M8879;
                    c14174.f42805 = c0769M88710;
                }
            }
            c20672.f66609 = c14174;
            if (c14174 != null) {
                c20672.f66591 |= 1048576;
                return;
            }
            return;
        }
        if (iOrdinal == 2) {
            c20672.f66611 = m8882(str2);
            c20672.f66591 |= 268435456;
            return;
        }
        if (iOrdinal == 4) {
            if ("nonzero".equals(str2)) {
                enumC7120 = EnumC7120.NonZero;
            } else if ("evenodd".equals(str2)) {
                enumC7120 = EnumC7120.EvenOdd;
            }
            c20672.f66606 = enumC7120;
            c20672.f66591 |= 536870912;
            return;
        }
        try {
            if (iOrdinal == 5) {
                c20672.f66583 = m8885(str2);
                c20672.f66591 |= ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF;
                return;
            }
            if (iOrdinal == 8) {
                if (str2.equals("ltr")) {
                    enumC23493 = EnumC23493.LTR;
                } else if (str2.equals("rtl")) {
                    enumC23493 = EnumC23493.RTL;
                }
                c20672.f66580 = enumC23493;
                if (enumC23493 != null) {
                    c20672.f66591 |= 68719476736L;
                    return;
                }
                return;
            }
            if (iOrdinal == 35) {
                c20672.f66602 = m8882(str2);
                c20672.f66591 |= 1073741824;
                return;
            }
            if (iOrdinal == 40) {
                c20672.f66598 = m8888(str2);
                c20672.f66591 |= ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLSX;
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
                c20672.f66614 = bool;
                if (bool != null) {
                    c20672.f66591 |= 524288;
                    return;
                }
                return;
            }
            if (iOrdinal == 78) {
                if (str2.equals("none")) {
                    enumC6560 = EnumC6560.None;
                } else if (str2.equals("non-scaling-stroke")) {
                    enumC6560 = EnumC6560.NonScalingStroke;
                }
                c20672.f66612 = enumC6560;
                if (enumC6560 != null) {
                    c20672.f66591 |= 34359738368L;
                    return;
                }
                return;
            }
            if (iOrdinal == 58) {
                if (str2.equals("currentColor")) {
                    c20672.f66587 = C9237.m23679();
                } else {
                    try {
                        c20672.f66587 = m8885(str2);
                    } catch (C19136 e) {
                        e.getMessage();
                        return;
                    }
                }
                c20672.f66591 |= 2147483648L;
                return;
            }
            if (iOrdinal == 59) {
                c20672.f66608 = m8888(str2);
                c20672.f66591 |= Blake2xsDigest.MAX_NUMBER_BLOCKS;
                return;
            }
            if (iOrdinal == 74) {
                switch (str2) {
                    case "middle":
                        enumC17143 = EnumC17143.Middle;
                        break;
                    case "end":
                        enumC17143 = EnumC17143.End;
                        break;
                    case "start":
                        enumC17143 = EnumC17143.Start;
                        break;
                }
                c20672.f66599 = enumC17143;
                if (enumC17143 != null) {
                    c20672.f66591 |= 262144;
                    return;
                }
                return;
            }
            if (iOrdinal != 75) {
                switch (iOrdinal) {
                    case 14:
                        if (str2.indexOf(124) < 0) {
                            if ("|inline|block|list-item|run-in|compact|marker|table|inline-table|table-row-group|table-header-group|table-footer-group|table-row|table-column-group|table-column|table-cell|table-caption|none|".contains("|" + str2 + '|')) {
                                c20672.f66596 = Boolean.valueOf(!str2.equals("none"));
                                c20672.f66591 |= 16777216;
                                break;
                            }
                        }
                        break;
                    case 15:
                        AbstractC0915 abstractC0915M8875 = m8875(str2);
                        c20672.f66595 = abstractC0915M8875;
                        if (abstractC0915M8875 != null) {
                            c20672.f66591 |= 1;
                        }
                        break;
                    case 16:
                        if ("nonzero".equals(str2)) {
                            enumC7121 = EnumC7120.NonZero;
                        } else if ("evenodd".equals(str2)) {
                            enumC7121 = EnumC7120.EvenOdd;
                        }
                        c20672.f66586 = enumC7121;
                        if (enumC7121 != null) {
                            c20672.f66591 |= 2;
                        }
                        break;
                    case 17:
                        Float fM8888 = m8888(str2);
                        c20672.f66592 = fM8888;
                        if (fM8888 != null) {
                            c20672.f66591 |= 4;
                        }
                        break;
                    case 18:
                        if ("|caption|icon|menu|message-box|small-caption|status-bar|".contains("|" + str2 + '|')) {
                            C19842 c19843 = new C19842(str2);
                            Integer numM21029 = null;
                            EnumC1621 enumC1622 = null;
                            String str3 = null;
                            while (true) {
                                strM45639 = c19843.m45639(false, '/');
                                c19843.m45643();
                                if (strM45639 == null) {
                                    break;
                                } else if (numM21029 == null || enumC1622 == null) {
                                    if (!strM45639.equals("normal") && (numM21029 != null || (numM21029 = C7846.m21029(strM45639)) == null)) {
                                        if (enumC1622 == null) {
                                            switch (strM45639) {
                                                case "oblique":
                                                    enumC1622 = EnumC1621.Oblique;
                                                    break;
                                                case "italic":
                                                    enumC1622 = EnumC1621.Italic;
                                                    break;
                                                case "normal":
                                                    enumC1622 = EnumC1621.Normal;
                                                    break;
                                                default:
                                                    enumC1622 = null;
                                                    break;
                                            }
                                            if (enumC1622 != null) {
                                                continue;
                                            }
                                        }
                                        if (str3 == null && strM45639.equals("small-caps")) {
                                            str3 = strM45639;
                                        }
                                    }
                                }
                            }
                            try {
                                c0769M2994 = C0790.m2994(strM45639);
                                if (c0769M2994 == null) {
                                    c0769M2994 = m8889(strM45639);
                                }
                            } catch (C19136 unused) {
                                c0769M2994 = null;
                            }
                            if (c19843.m45640('/')) {
                                c19843.m45643();
                                String strM45650 = c19843.m45650();
                                if (strM45650 != null) {
                                    m8889(strM45650);
                                }
                                c19843.m45643();
                            }
                            if (!c19843.m45644()) {
                                int i = c19843.f64103;
                                c19843.f64103 = c19843.f64101;
                                strSubstring = c19843.f64100.substring(i);
                            }
                            c20672.f66594 = m8886(strSubstring);
                            c20672.f66613 = c0769M2994;
                            c20672.f66588 = Integer.valueOf(numM21029 == null ? 400 : numM21029.intValue());
                            if (enumC1622 == null) {
                                enumC1622 = EnumC1621.Normal;
                            }
                            c20672.f66597 = enumC1622;
                            c20672.f66591 |= 122880;
                            break;
                        }
                        break;
                    case 19:
                        ArrayList arrayListM8886 = m8886(str2);
                        c20672.f66594 = arrayListM8886;
                        if (arrayListM8886 != null) {
                            c20672.f66591 |= 8192;
                        }
                        break;
                    case 20:
                        try {
                            C0769 c0769M2995 = C0790.m2994(str2);
                            c0769M8889 = c0769M2995 == null ? m8889(str2) : c0769M2995;
                            break;
                        } catch (C19136 unused2) {
                        }
                        c20672.f66613 = c0769M8889;
                        if (c0769M8889 != null) {
                            c20672.f66591 |= 16384;
                        }
                        break;
                    case 21:
                        Integer numM210210 = C7846.m21029(str2);
                        c20672.f66588 = numM210210;
                        if (numM210210 != null) {
                            c20672.f66591 |= X931RNG.BLOCK64_RESEED_MAX;
                        }
                        break;
                    case 22:
                        switch (str2) {
                            case "oblique":
                                enumC1621 = EnumC1621.Oblique;
                                break;
                            case "italic":
                                enumC1621 = EnumC1621.Italic;
                                break;
                            case "normal":
                                enumC1621 = EnumC1621.Normal;
                                break;
                        }
                        c20672.f66597 = enumC1621;
                        if (enumC1621 != null) {
                            c20672.f66591 |= 65536;
                        }
                        break;
                    default:
                        switch (iOrdinal) {
                            case 27:
                                switch (str2) {
                                    case "optimizeQuality":
                                        enumC17849 = EnumC17849.optimizeQuality;
                                        break;
                                    case "auto":
                                        enumC17849 = EnumC17849.auto;
                                        break;
                                    case "optimizeSpeed":
                                        enumC17849 = EnumC17849.optimizeSpeed;
                                        break;
                                }
                                c20672.f66578 = enumC17849;
                                if (enumC17849 != null) {
                                    c20672.f66591 |= 137438953472L;
                                }
                                break;
                            case 28:
                                String strM8882 = m8882(str2);
                                c20672.f66603 = strM8882;
                                c20672.f66601 = strM8882;
                                c20672.f66593 = strM8882;
                                c20672.f66591 |= 14680064;
                                break;
                            case 29:
                                c20672.f66603 = m8882(str2);
                                c20672.f66591 |= 2097152;
                                break;
                            case 30:
                                c20672.f66601 = m8882(str2);
                                c20672.f66591 |= 4194304;
                                break;
                            case 31:
                                c20672.f66593 = m8882(str2);
                                c20672.f66591 |= X931RNG.BLOCK128_RESEED_MAX;
                                break;
                            default:
                                switch (iOrdinal) {
                                    case 62:
                                        if (str2.equals("currentColor")) {
                                            c20672.f66590 = C9237.m23679();
                                        } else {
                                            try {
                                                c20672.f66590 = m8885(str2);
                                            } catch (C19136 e2) {
                                                e2.getMessage();
                                                return;
                                            }
                                        }
                                        c20672.f66591 |= 67108864;
                                        break;
                                    case 63:
                                        c20672.f66600 = m8888(str2);
                                        c20672.f66591 |= 134217728;
                                        break;
                                    case 64:
                                        AbstractC0915 abstractC0915M8876 = m8875(str2);
                                        c20672.f66579 = abstractC0915M8876;
                                        if (abstractC0915M8876 != null) {
                                            c20672.f66591 |= 8;
                                        }
                                        break;
                                    case 65:
                                        if ("none".equals(str2)) {
                                            c20672.f66582 = null;
                                            c20672.f66591 |= 512;
                                        } else {
                                            C19842 c19844 = new C19842(str2);
                                            c19844.m45643();
                                            if (!c19844.m45644() && (c0769M45647 = c19844.m45647()) != null && !c0769M45647.m2931()) {
                                                float f = c0769M45647.f2855;
                                                ArrayList arrayList = new ArrayList();
                                                arrayList.add(c0769M45647);
                                                while (true) {
                                                    if (!c19844.m45644()) {
                                                        c19844.m45649();
                                                        C0769 c0769M45648 = c19844.m45647();
                                                        if (c0769M45648 != null && !c0769M45648.m2931()) {
                                                            arrayList.add(c0769M45648);
                                                            f += c0769M45648.f2855;
                                                        }
                                                    } else if (f != 0.0f) {
                                                        c0769Arr = (C0769[]) arrayList.toArray(new C0769[arrayList.size()]);
                                                    }
                                                }
                                            }
                                            c20672.f66582 = c0769Arr;
                                            if (c0769Arr != null) {
                                                c20672.f66591 |= 512;
                                            }
                                        }
                                        break;
                                    case 66:
                                        c20672.f66604 = m8889(str2);
                                        c20672.f66591 |= ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS;
                                        break;
                                    case 67:
                                        if ("butt".equals(str2)) {
                                            enumC10794 = EnumC10794.Butt;
                                        } else if ("round".equals(str2)) {
                                            enumC10794 = EnumC10794.Round;
                                        } else if ("square".equals(str2)) {
                                            enumC10794 = EnumC10794.Square;
                                        }
                                        c20672.f66605 = enumC10794;
                                        if (enumC10794 != null) {
                                            c20672.f66591 |= 64;
                                        }
                                        break;
                                    case 68:
                                        if ("miter".equals(str2)) {
                                            enumC16437 = EnumC16437.Miter;
                                        } else if ("round".equals(str2)) {
                                            enumC16437 = EnumC16437.Round;
                                        } else if ("bevel".equals(str2)) {
                                            enumC16437 = EnumC16437.Bevel;
                                        }
                                        c20672.f66576 = enumC16437;
                                        if (enumC16437 != null) {
                                            c20672.f66591 |= 128;
                                        }
                                        break;
                                    case 69:
                                        c20672.f66585 = Float.valueOf(m8887(str2));
                                        c20672.f66591 |= 256;
                                        break;
                                    case 70:
                                        Float fM8889 = m8888(str2);
                                        c20672.f66577 = fM8889;
                                        if (fM8889 != null) {
                                            c20672.f66591 |= 16;
                                        }
                                        break;
                                    case 71:
                                        c20672.f66589 = m8889(str2);
                                        c20672.f66591 |= 32;
                                        break;
                                    default:
                                        switch (iOrdinal) {
                                            case 88:
                                                if (str2.equals("currentColor")) {
                                                    c20672.f66607 = C9237.m23679();
                                                } else {
                                                    try {
                                                        c20672.f66607 = m8885(str2);
                                                    } catch (C19136 e3) {
                                                        e3.getMessage();
                                                        return;
                                                    }
                                                }
                                                c20672.f66591 |= 8589934592L;
                                                break;
                                            case 89:
                                                c20672.f66584 = m8888(str2);
                                                c20672.f66591 |= 17179869184L;
                                                break;
                                            case 90:
                                                if (str2.indexOf(124) < 0) {
                                                    if ("|visible|hidden|collapse|".contains("|" + str2 + '|')) {
                                                        c20672.f66581 = Boolean.valueOf(str2.equals("visible"));
                                                        c20672.f66591 |= 33554432;
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
                    enumC14320 = EnumC14320.LineThrough;
                    break;
                case "underline":
                    enumC14320 = EnumC14320.Underline;
                    break;
                case "none":
                    enumC14320 = EnumC14320.None;
                    break;
                case "blink":
                    enumC14320 = EnumC14320.Blink;
                    break;
                case "overline":
                    enumC14320 = EnumC14320.Overline;
                    break;
            }
            c20672.f66610 = enumC14320;
            if (enumC14320 != null) {
                c20672.f66591 |= 131072;
            }
        } catch (C19136 unused3) {
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m8869(AbstractC21377 abstractC21377, Attributes attributes) throws C19136 {
        for (int i = 0; i < attributes.getLength(); i++) {
            String strTrim = attributes.getValue(i).trim();
            int iOrdinal = EnumC21253.m48257(attributes.getLocalName(i)).ordinal();
            if (iOrdinal == 48) {
                m8862(abstractC21377, strTrim);
            } else if (iOrdinal != 80) {
                continue;
            } else {
                C19842 c19842 = new C19842(strTrim);
                c19842.m45643();
                float fM45648 = c19842.m45648();
                c19842.m45649();
                float fM45649 = c19842.m45648();
                c19842.m45649();
                float fM456410 = c19842.m45648();
                c19842.m45649();
                float fM456411 = c19842.m45648();
                if (Float.isNaN(fM45648) || Float.isNaN(fM45649) || Float.isNaN(fM456410) || Float.isNaN(fM456411)) {
                    throw new C19136("Invalid viewBox definition - should have four numbers");
                }
                if (fM456410 < 0.0f) {
                    throw new C19136("Invalid viewBox. width cannot be negative");
                }
                if (fM456411 >= 0.0f) {
                    abstractC21377.f68869 = new C16997(fM45648, fM45649, fM456410, fM456411);
                } else {
                    throw new C19136("Invalid viewBox. height cannot be negative");
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m8856(InterfaceC0063 interfaceC0063, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            if (EnumC21253.m48257(attributes.getLocalName(i)) == EnumC21253.transform) {
                interfaceC0063.mo1005(m8874(attributes.getValue(i)));
            }
        }
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static Matrix m8874(String str) throws C19136 {
        Matrix matrix = new Matrix();
        C19842 c19842 = new C19842(str);
        c19842.m45643();
        while (!c19842.m45644()) {
            String str2 = c19842.f64100;
            String strSubstring = null;
            if (!c19842.m45644()) {
                int i = c19842.f64103;
                int iCharAt = str2.charAt(i);
                while (true) {
                    if ((iCharAt >= 97 && iCharAt <= 122) || (iCharAt >= 65 && iCharAt <= 90)) {
                        iCharAt = c19842.m45637();
                    }
                }
                int i2 = c19842.f64103;
                while (C19842.m45635(iCharAt)) {
                    iCharAt = c19842.m45637();
                }
                if (iCharAt == 40) {
                    c19842.f64103++;
                    strSubstring = str2.substring(i, i2);
                } else {
                    c19842.f64103 = i;
                }
            }
            if (strSubstring == null) {
                throw new C19136("Bad transform function encountered in transform list: ".concat(str));
            }
            switch (strSubstring) {
                case "matrix":
                    c19842.m45643();
                    float fM45648 = c19842.m45648();
                    c19842.m45649();
                    float fM45649 = c19842.m45648();
                    c19842.m45649();
                    float fM456410 = c19842.m45648();
                    c19842.m45649();
                    float fM456411 = c19842.m45648();
                    c19842.m45649();
                    float fM456412 = c19842.m45648();
                    c19842.m45649();
                    float fM456413 = c19842.m45648();
                    c19842.m45643();
                    if (Float.isNaN(fM456413) || !c19842.m45640(')')) {
                        throw new C19136("Invalid transform list: ".concat(str));
                    }
                    Matrix matrix2 = new Matrix();
                    matrix2.setValues(new float[]{fM45648, fM456410, fM456412, fM45649, fM456411, fM456413, 0.0f, 0.0f, 1.0f});
                    matrix.preConcat(matrix2);
                    break;
                    break;
                case "rotate":
                    c19842.m45643();
                    float fM456414 = c19842.m45648();
                    c19842.m45649();
                    float fM456415 = c19842.m45648();
                    c19842.m45649();
                    float fM456416 = c19842.m45648();
                    c19842.m45643();
                    if (Float.isNaN(fM456414) || !c19842.m45640(')')) {
                        throw new C19136("Invalid transform list: ".concat(str));
                    }
                    if (Float.isNaN(fM456415)) {
                        matrix.preRotate(fM456414);
                    } else {
                        if (Float.isNaN(fM456416)) {
                            throw new C19136("Invalid transform list: ".concat(str));
                        }
                        matrix.preRotate(fM456414, fM456415, fM456416);
                    }
                    break;
                    break;
                case "scale":
                    c19842.m45643();
                    float fM456417 = c19842.m45648();
                    c19842.m45649();
                    float fM456418 = c19842.m45648();
                    c19842.m45643();
                    if (Float.isNaN(fM456417) || !c19842.m45640(')')) {
                        throw new C19136("Invalid transform list: ".concat(str));
                    }
                    if (!Float.isNaN(fM456418)) {
                        matrix.preScale(fM456417, fM456418);
                    } else {
                        matrix.preScale(fM456417, fM456417);
                    }
                    break;
                    break;
                case "skewX":
                    c19842.m45643();
                    float fM456419 = c19842.m45648();
                    c19842.m45643();
                    if (Float.isNaN(fM456419) || !c19842.m45640(')')) {
                        throw new C19136("Invalid transform list: ".concat(str));
                    }
                    matrix.preSkew((float) Math.tan(Math.toRadians(fM456419)), 0.0f);
                    break;
                    break;
                case "skewY":
                    c19842.m45643();
                    float fM456420 = c19842.m45648();
                    c19842.m45643();
                    if (Float.isNaN(fM456420) || !c19842.m45640(')')) {
                        throw new C19136("Invalid transform list: ".concat(str));
                    }
                    matrix.preSkew(0.0f, (float) Math.tan(Math.toRadians(fM456420)));
                    break;
                    break;
                case "translate":
                    c19842.m45643();
                    float fM456421 = c19842.m45648();
                    c19842.m45649();
                    float fM456422 = c19842.m45648();
                    c19842.m45643();
                    if (Float.isNaN(fM456421) || !c19842.m45640(')')) {
                        throw new C19136("Invalid transform list: ".concat(str));
                    }
                    if (!Float.isNaN(fM456422)) {
                        matrix.preTranslate(fM456421, fM456422);
                    } else {
                        matrix.preTranslate(fM456421, 0.0f);
                    }
                    break;
                    break;
                default:
                    throw new C19136(C4860.m14172("Invalid transform list fn: ", strSubstring, MotionUtils.EASING_TYPE_FORMAT_END));
            }
            if (c19842.m45644()) {
                return matrix;
            }
            c19842.m45649();
        }
        return matrix;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static C0769 m8889(String str) throws C19136 {
        if (str.length() == 0) {
            throw new C19136("Invalid length value (empty string)");
        }
        int length = str.length();
        EnumC7265 enumC7265ValueOf = EnumC7265.px;
        char cCharAt = str.charAt(length - 1);
        if (cCharAt == '%') {
            length--;
            enumC7265ValueOf = EnumC7265.percent;
        } else if (length > 2 && Character.isLetter(cCharAt) && Character.isLetter(str.charAt(length - 2))) {
            length -= 2;
            try {
                enumC7265ValueOf = EnumC7265.valueOf(str.substring(length).toLowerCase(Locale.US));
            } catch (IllegalArgumentException unused) {
                throw new C19136("Invalid length unit specifier: ".concat(str));
            }
        }
        try {
            return new C0769(m8848(length, str), enumC7265ValueOf);
        } catch (NumberFormatException e) {
            throw new C19136("Invalid length value: ".concat(str), e);
        }
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static ArrayList m8873(String str) throws C19136 {
        if (str.length() == 0) {
            throw new C19136("Invalid length list (empty string)");
        }
        ArrayList arrayList = new ArrayList(1);
        C19842 c19842 = new C19842(str);
        c19842.m45643();
        while (!c19842.m45644()) {
            float fM45648 = c19842.m45648();
            if (Float.isNaN(fM45648)) {
                StringBuilder sb = new StringBuilder("Invalid length list value: ");
                String str2 = c19842.f64100;
                int i = c19842.f64103;
                while (!c19842.m45644() && !C19842.m45635((int) str2.charAt(c19842.f64103))) {
                    c19842.f64103++;
                }
                String strSubstring = str2.substring(i, c19842.f64103);
                c19842.f64103 = i;
                sb.append(strSubstring);
                throw new C19136(sb.toString());
            }
            EnumC7265 enumC7265M45642 = c19842.m45642();
            if (enumC7265M45642 == null) {
                enumC7265M45642 = EnumC7265.px;
            }
            arrayList.add(new C0769(fM45648, enumC7265M45642));
            c19842.m45649();
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static float m8887(String str) throws C19136 {
        int length = str.length();
        if (length == 0) {
            throw new C19136("Invalid float value (empty string)");
        }
        return m8848(length, str);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static float m8848(int i, String str) throws C19136 {
        float fM20562 = new C7678().m20562(0, i, 0, str);
        if (Float.isNaN(fM20562)) {
            throw new C19136(C20094.m46315("Invalid float value: ", str));
        }
        return fM20562;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static Float m8888(String str) {
        try {
            float fM8887 = m8887(str);
            if (fM8887 < 0.0f) {
                fM8887 = 0.0f;
            } else if (fM8887 > 1.0f) {
                fM8887 = 1.0f;
            }
            return Float.valueOf(fM8887);
        } catch (C19136 unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m8862(AbstractC7971 abstractC7971, String str) throws C19136 {
        EnumC10648 enumC10648;
        C19842 c19842 = new C19842(str);
        c19842.m45643();
        String strM45650 = c19842.m45650();
        if ("defer".equals(strM45650)) {
            c19842.m45643();
            strM45650 = c19842.m45650();
        }
        EnumC1475 enumC1475M1044 = C0084.m1044(strM45650);
        c19842.m45643();
        if (c19842.m45644()) {
            enumC10648 = null;
        } else {
            String strM45651 = c19842.m45650();
            strM45651.getClass();
            if (strM45651.equals("meet")) {
                enumC10648 = EnumC10648.meet;
            } else if (strM45651.equals("slice")) {
                enumC10648 = EnumC10648.slice;
            } else {
                throw new C19136("Invalid preserveAspectRatio definition: ".concat(str));
            }
        }
        abstractC7971.f24627 = new C16291(enumC1475M1044, enumC10648);
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static AbstractC0915 m8875(String str) {
        boolean zStartsWith = str.startsWith("url(");
        AbstractC0915 abstractC0915M8885 = C20526.f66137;
        AbstractC0915 abstractC0915 = null;
        if (zStartsWith) {
            int iIndexOf = str.indexOf(MotionUtils.EASING_TYPE_FORMAT_END);
            if (iIndexOf != -1) {
                String strTrim = str.substring(4, iIndexOf).trim();
                String strTrim2 = str.substring(iIndexOf + 1).trim();
                if (strTrim2.length() > 0) {
                    if (!strTrim2.equals("none")) {
                        if (strTrim2.equals("currentColor")) {
                            abstractC0915M8885 = C9237.m23679();
                        } else {
                            try {
                                abstractC0915M8885 = m8885(strTrim2);
                            } catch (C19136 unused) {
                                abstractC0915M8885 = null;
                            }
                        }
                    }
                    abstractC0915 = abstractC0915M8885;
                }
                return new C19821(strTrim, abstractC0915);
            }
            return new C19821(str.substring(4).trim(), null);
        }
        if (str.equals("none")) {
            return abstractC0915M8885;
        }
        if (str.equals("currentColor")) {
            return C9237.m23679();
        }
        try {
            return m8885(str);
        } catch (C19136 unused2) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static C20526 m8885(String str) throws C19136 {
        long j;
        int i;
        if (str.charAt(0) == '#') {
            int length = str.length();
            C14027 c14027 = null;
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
                        c14027 = new C14027(i2, j2);
                    }
                }
            }
            if (c14027 == null) {
                throw new C19136("Bad hex colour value: ".concat(str));
            }
            int iM33643 = c14027.m33643();
            if (iM33643 == 4) {
                int iM33644 = c14027.m33644();
                int i3 = iM33644 & 3840;
                int i4 = iM33644 & 240;
                int i5 = iM33644 & 15;
                return new C20526(i5 | (i3 << 8) | (-16777216) | (i3 << 12) | (i4 << 8) | (i4 << 4) | (i5 << 4));
            }
            if (iM33643 != 5) {
                if (iM33643 == 7) {
                    return new C20526(c14027.m33644() | (-16777216));
                }
                if (iM33643 == 9) {
                    return new C20526((c14027.m33644() << 24) | (c14027.m33644() >>> 8));
                }
                throw new C19136("Bad hex colour value: ".concat(str));
            }
            int iM33645 = c14027.m33644();
            int i6 = 61440 & iM33645;
            int i7 = iM33645 & 3840;
            int i8 = iM33645 & 240;
            int i9 = iM33645 & 15;
            return new C20526((i9 << 24) | (i9 << 28) | (i6 << 8) | (i6 << 4) | (i7 << 4) | i7 | i8 | (i8 >> 4));
        }
        boolean zM8872 = m8872(str, "rgba(");
        if (zM8872 || m8872(str, "rgb(")) {
            C19842 c19842 = new C19842(str, zM8872 ? 5 : 4);
            c19842.m45643();
            float fM45648 = c19842.m45648();
            if (!Float.isNaN(fM45648) && c19842.m45640('%')) {
                fM45648 = (fM45648 * 256.0f) / 100.0f;
            }
            float fM45636 = c19842.m45636(fM45648);
            if (!Float.isNaN(fM45636) && c19842.m45640('%')) {
                fM45636 = (fM45636 * 256.0f) / 100.0f;
            }
            float fM45637 = c19842.m45636(fM45636);
            if (!Float.isNaN(fM45637) && c19842.m45640('%')) {
                fM45637 = (fM45637 * 256.0f) / 100.0f;
            }
            if (!zM8872) {
                c19842.m45643();
                if (Float.isNaN(fM45637) || !c19842.m45640(')')) {
                    throw new C19136("Bad rgb() colour value: ".concat(str));
                }
                return new C20526((m8849(fM45648) << 16) | (-16777216) | (m8849(fM45636) << 8) | m8849(fM45637));
            }
            float fM45638 = c19842.m45636(fM45637);
            c19842.m45643();
            if (Float.isNaN(fM45638) || !c19842.m45640(')')) {
                throw new C19136("Bad rgba() colour value: ".concat(str));
            }
            return new C20526((m8849(fM45638 * 256.0f) << 24) | (m8849(fM45648) << 16) | (m8849(fM45636) << 8) | m8849(fM45637));
        }
        boolean zM8873 = m8872(str, "hsla(");
        if (!zM8873 && !m8872(str, "hsl(")) {
            String lowerCase = str.toLowerCase(Locale.US);
            Integer numM14518 = C5024.m14518(lowerCase);
            if (numM14518 != null) {
                return new C20526(numM14518.intValue());
            }
            throw new C19136(C20094.m46315("Invalid colour keyword: ", lowerCase));
        }
        C19842 c19843 = new C19842(str, zM8873 ? 5 : 4);
        c19843.m45643();
        float fM45649 = c19843.m45648();
        float fM45639 = c19843.m45636(fM45649);
        if (!Float.isNaN(fM45639)) {
            c19843.m45640('%');
        }
        float fM456310 = c19843.m45636(fM45639);
        if (!Float.isNaN(fM456310)) {
            c19843.m45640('%');
        }
        if (!zM8873) {
            c19843.m45643();
            if (Float.isNaN(fM456310) || !c19843.m45640(')')) {
                throw new C19136("Bad hsl() colour value: ".concat(str));
            }
            return new C20526(m8850(fM45649, fM45639, fM456310) | (-16777216));
        }
        float fM456311 = c19843.m45636(fM456310);
        c19843.m45643();
        if (Float.isNaN(fM456311) || !c19843.m45640(')')) {
            throw new C19136("Bad hsla() colour value: ".concat(str));
        }
        return new C20526((m8849(fM456311 * 256.0f) << 24) | m8850(fM45649, fM45639, fM456310));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m8872(String str, String str2) {
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

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m8849(float f) {
        if (f < 0.0f) {
            return 0;
        }
        if (f > 255.0f) {
            return 255;
        }
        return Math.round(f);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m8850(float f, float f2, float f3) {
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
        float fM8876 = m8876(f10, f9, f6 + 2.0f);
        float fM8877 = m8876(f10, f9, f6);
        return m8849(m8876(f10, f9, f6 - 2.0f) * 256.0f) | (m8849(fM8876 * 256.0f) << 16) | (m8849(fM8877 * 256.0f) << 8);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static float m8876(float f, float f2, float f3) {
        if (f3 < 0.0f) {
            f3 += 6.0f;
        }
        if (f3 >= 6.0f) {
            f3 -= 6.0f;
        }
        if (f3 < 1.0f) {
            return C20382.m46695(f2, f, f3, f);
        }
        if (f3 < 3.0f) {
            return f2;
        }
        return f3 < 4.0f ? C20382.m46695(4.0f, f3, f2 - f, f) : f;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static ArrayList m8886(String str) {
        C19842 c19842 = new C19842(str);
        ArrayList arrayList = null;
        do {
            String strM45645 = c19842.m45645();
            if (strM45645 == null) {
                strM45645 = c19842.m45639(true, ',');
            }
            if (strM45645 == null) {
                return arrayList;
            }
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            arrayList.add(strM45645);
            c19842.m45649();
        } while (!c19842.m45644());
        return arrayList;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C0769 m8877(C19842 c19842) {
        if (c19842.m45641("auto")) {
            return new C0769(0.0f);
        }
        return c19842.m45647();
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static String m8882(String str) {
        if (str.equals("none") || !str.startsWith("url(")) {
            return null;
        }
        if (str.endsWith(MotionUtils.EASING_TYPE_FORMAT_END)) {
            return str.substring(4, str.length() - 1).trim();
        }
        return str.substring(4).trim();
    }
}
