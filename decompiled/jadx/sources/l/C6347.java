package l;

import android.util.Pair;
import com.alipay.sdk.m.y.l;
import com.google.android.material.motion.MotionUtils;
import com.umeng.analytics.pro.am;
import com.umeng.analytics.pro.cb;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import moe.shizuku.server.IShizukuService;
import net.engio.mbassy.listener.MessageHandler;
import org.bouncycastle.i18n.TextBundle;
import org.simpleframework.xml.strategy.Name;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/* JADX INFO: renamed from: l.ۛ᩹ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: ZBIL */
/* JADX INFO: loaded from: classes2.dex */
public final class C6347 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final Pattern f19659;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final AbstractC9608 f19660;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final Logger f19661 = Logger.getLogger("Svg2Vector");

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final AbstractC6079 f19662;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final AbstractC9608 f19663;

    static {
        C6785 c6785M24537 = AbstractC9608.m24537();
        c6785M24537.mo18428("clip", "android:clip");
        c6785M24537.mo18428("clip-rule", "");
        c6785M24537.mo18428("fill", "android:fillColor");
        c6785M24537.mo18428("fill-rule", "android:fillType");
        c6785M24537.mo18428("fill-opacity", "android:fillAlpha");
        c6785M24537.mo18428("opacity", "");
        c6785M24537.mo18428("stroke", "android:strokeColor");
        c6785M24537.mo18428("stroke-opacity", "android:strokeAlpha");
        c6785M24537.mo18428("stroke-linejoin", "android:strokeLineJoin");
        c6785M24537.mo18428("stroke-linecap", "android:strokeLineCap");
        c6785M24537.mo18428("stroke-width", "android:strokeWidth");
        f19663 = c6785M24537.mo18429();
        C6785 c6785M24538 = AbstractC9608.m24537();
        c6785M24538.mo18428("x1", "android:startX");
        c6785M24538.mo18428("y1", "android:startY");
        c6785M24538.mo18428("x2", "android:endX");
        c6785M24538.mo18428("y2", "android:endY");
        c6785M24538.mo18428("cx", "android:centerX");
        c6785M24538.mo18428("cy", "android:centerY");
        c6785M24538.mo18428("r", "android:gradientRadius");
        c6785M24538.mo18428("spreadMethod", "android:tileMode");
        c6785M24538.mo18428("gradientUnits", "");
        c6785M24538.mo18428("gradientTransform", "");
        c6785M24538.mo18428("gradientType", "android:type");
        f19660 = c6785M24538.mo18429();
        f19662 = AbstractC6079.m16988("animate", "animateColor", "animateMotion", "animateTransform", "mpath", "set", am.av, "glyph", "marker", "missing-glyph", "pattern", "switch", "symbol", "feBlend", "feColorMatrix", "feComponentTransfer", "feComposite", "feConvolveMatrix", "feDiffuseLighting", "feDisplacementMap", "feFlood", "feFuncA", "feFuncB", "feFuncG", "feFuncR", "feGaussianBlur", "feImage", "feMerge", "feMergeNode", "feMorphology", "feOffset", "feSpecularLighting", "feTile", "feTurbulence", "font", "font-face", "font-face-format", "font-face-name", "font-face-src", "font-face-uri", "hkern", "vkern", "stop", "ellipse", "image", TextBundle.TEXT_ENTRY, "feDistantLight", "fePointLight", "feSpotLight", "symbol", "altGlyph", "altGlyphDef", "altGlyphItem", "glyph", "glyphRef", "textPath", TextBundle.TEXT_ENTRY, "tref", "tspan", "altGlyph", "textPath", "tref", "tspan", "color-profile", "cursor", MessageHandler.Properties.Filter, "foreignObject", "script", "view");
        f19659 = Pattern.compile("[\\s,]+");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:20:0x0070  */
    /* JADX WARN: Code duplicated, block: B:46:0x00c3  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m17620(C9813 c9813, C2051 c2051) {
        NodeList nodeList;
        int i;
        NodeList nodeList2;
        NamedNodeMap namedNodeMap;
        int i2;
        String str;
        String str2;
        Element element = c2051.f45035;
        NamedNodeMap attributes = element.getAttributes();
        int length = attributes.getLength();
        for (int i3 = 0; i3 < length; i3++) {
            Node nodeItem = attributes.item(i3);
            String nodeName = nodeItem.getNodeName();
            String nodeValue = nodeItem.getNodeValue();
            if (f19660.containsKey(nodeName)) {
                c2051.mo27792(nodeName, nodeValue);
            }
        }
        NodeList childNodes = element.getChildNodes();
        int i4 = 0;
        double dMax = 0.0d;
        while (i4 < childNodes.getLength()) {
            Node nodeItem2 = childNodes.item(i4);
            if (nodeItem2.getNodeName().equals("stop")) {
                NamedNodeMap attributes2 = nodeItem2.getAttributes();
                String str3 = "rgb(0,0,0)";
                String str4 = "1";
                int i5 = 0;
                while (i5 < attributes2.getLength()) {
                    Node nodeItem3 = attributes2.item(i5);
                    String nodeName2 = nodeItem3.getNodeName();
                    String nodeValue2 = nodeItem3.getNodeValue();
                    try {
                        switch (nodeName2.hashCode()) {
                            case -1388068544:
                                nodeList2 = childNodes;
                                namedNodeMap = attributes2;
                                i2 = i4;
                                if (nodeName2.equals("stop-opacity")) {
                                    str4 = nodeValue2;
                                }
                                break;
                            case -1019779949:
                                nodeList2 = childNodes;
                                namedNodeMap = attributes2;
                                try {
                                    if (nodeName2.equals("offset")) {
                                        i2 = i4;
                                        try {
                                            dMax = Math.max(Math.min(1.0d, Math.max(nodeValue2.endsWith("%") ? Double.parseDouble(nodeValue2.substring(0, nodeValue2.length() - 1)) / 100.0d : Double.parseDouble(nodeValue2), 0.0d)), dMax);
                                        } catch (IllegalArgumentException unused) {
                                            c9813.m24854(C20087.m46306("Invalid attribute value: ", nodeName2, "=\"", nodeValue2, "\""), nodeItem2);
                                        }
                                    } else {
                                        i2 = i4;
                                    }
                                } catch (IllegalArgumentException unused2) {
                                    i2 = i4;
                                    c9813.m24854(C20087.m46306("Invalid attribute value: ", nodeName2, "=\"", nodeValue2, "\""), nodeItem2);
                                    i5++;
                                    i4 = i2;
                                    childNodes = nodeList2;
                                    attributes2 = namedNodeMap;
                                    break;
                                }
                                break;
                            case 109780401:
                                if (nodeName2.equals("style")) {
                                    String[] strArrSplit = nodeValue2.split(l.b);
                                    nodeList2 = childNodes;
                                    try {
                                        int length2 = strArrSplit.length;
                                        namedNodeMap = attributes2;
                                        int i6 = 0;
                                        while (i6 < length2) {
                                            int i7 = length2;
                                            try {
                                                String str5 = strArrSplit[i6];
                                                str = str3;
                                                try {
                                                    String[] strArrSplit2 = str5.split(":");
                                                    str2 = str4;
                                                    try {
                                                        String[] strArr = strArrSplit;
                                                        if (strArrSplit2.length != 2) {
                                                            str3 = str;
                                                            str4 = str2;
                                                        } else if (str5.startsWith("stop-color")) {
                                                            str3 = strArrSplit2[1];
                                                            str4 = str2;
                                                        } else if (str5.startsWith("stop-opacity")) {
                                                            str4 = strArrSplit2[1];
                                                            str3 = str;
                                                        } else {
                                                            str3 = str;
                                                            str4 = str2;
                                                        }
                                                        i6++;
                                                        length2 = i7;
                                                        strArrSplit = strArr;
                                                    } catch (IllegalArgumentException unused3) {
                                                        i2 = i4;
                                                        str3 = str;
                                                        str4 = str2;
                                                        c9813.m24854(C20087.m46306("Invalid attribute value: ", nodeName2, "=\"", nodeValue2, "\""), nodeItem2);
                                                        i5++;
                                                        i4 = i2;
                                                        childNodes = nodeList2;
                                                        attributes2 = namedNodeMap;
                                                    }
                                                } catch (IllegalArgumentException unused4) {
                                                    str2 = str4;
                                                    i2 = i4;
                                                    str3 = str;
                                                    str4 = str2;
                                                    c9813.m24854(C20087.m46306("Invalid attribute value: ", nodeName2, "=\"", nodeValue2, "\""), nodeItem2);
                                                    i5++;
                                                    i4 = i2;
                                                    childNodes = nodeList2;
                                                    attributes2 = namedNodeMap;
                                                }
                                            } catch (IllegalArgumentException unused5) {
                                                str = str3;
                                            }
                                        }
                                    } catch (IllegalArgumentException unused6) {
                                        namedNodeMap = attributes2;
                                        i2 = i4;
                                        c9813.m24854(C20087.m46306("Invalid attribute value: ", nodeName2, "=\"", nodeValue2, "\""), nodeItem2);
                                        i5++;
                                        i4 = i2;
                                        childNodes = nodeList2;
                                        attributes2 = namedNodeMap;
                                    }
                                } else {
                                    nodeList2 = childNodes;
                                    namedNodeMap = attributes2;
                                }
                                i2 = i4;
                                break;
                            case 1842201048:
                                if (nodeName2.equals("stop-color")) {
                                    nodeList2 = childNodes;
                                    namedNodeMap = attributes2;
                                    str3 = nodeValue2;
                                } else {
                                    nodeList2 = childNodes;
                                    namedNodeMap = attributes2;
                                }
                                i2 = i4;
                                break;
                            default:
                                nodeList2 = childNodes;
                                namedNodeMap = attributes2;
                                i2 = i4;
                                break;
                        }
                    } catch (IllegalArgumentException unused7) {
                        nodeList2 = childNodes;
                    }
                    i5++;
                    i4 = i2;
                    childNodes = nodeList2;
                    attributes2 = namedNodeMap;
                }
                nodeList = childNodes;
                i = i4;
                String strM24847 = c9813.m24847(dMax);
                String strM35052 = c2051.m35052(str3, "#000000");
                if (strM35052 != null) {
                    str3 = strM35052;
                }
                c2051.m6732(str3, strM24847, str4);
            } else {
                nodeList = childNodes;
                i = i4;
            }
            i4 = i + 1;
            childNodes = nodeList;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m17622(C9813 c9813, AbstractC14750 abstractC14750) {
        String attribute = abstractC14750.f45035.getAttribute("id");
        if (attribute.isEmpty()) {
            return;
        }
        c9813.m24867(abstractC14750, attribute);
    }

    /* JADX WARN: Code duplicated, block: B:270:0x063e  */
    /* JADX WARN: Code duplicated, block: B:320:0x07ee  */
    /* JADX WARN: Code duplicated, block: B:384:0x09ba  */
    /* JADX WARN: Code duplicated, block: B:434:0x0af0  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m17621(C9813 c9813, C11224 c11224, Element element) {
        NodeList nodeList;
        C11224 c11225;
        C11224 c11226;
        String str;
        boolean z;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        AbstractC9608 abstractC9608;
        String str9;
        String str10;
        String str11;
        float f;
        float f2;
        C9813 c9814;
        String str12;
        String str13;
        float f3;
        AbstractC9608 abstractC9609;
        float f4;
        String str14;
        String str15;
        float f5;
        int i;
        String str16;
        String str17;
        String str18;
        String str19;
        String str20;
        String str21;
        String str22;
        NamedNodeMap namedNodeMap;
        String str23;
        AbstractC9608 abstractC96010;
        int i2;
        String str24;
        String str25;
        String str26;
        String str27;
        String str28;
        C11224 c11227;
        C11224 c11228;
        C11224 c11229 = c11224;
        NodeList childNodes = element.getChildNodes();
        int i3 = 0;
        C9813 c9815 = c9813;
        C11224 c112210 = c11229;
        while (i3 < childNodes.getLength()) {
            Node nodeItem = childNodes.item(i3);
            if (nodeItem.getNodeType() == 1 && (nodeItem.hasChildNodes() || nodeItem.hasAttributes())) {
                Element element2 = (Element) nodeItem;
                String tagName = element2.getTagName();
                tagName.getClass();
                String str29 = "style";
                String str30 = "rect";
                String str31 = "g";
                nodeList = childNodes;
                String str32 = "circle";
                String str33 = "mask";
                byte b = -1;
                switch (tagName.hashCode()) {
                    case -1656480802:
                        if (tagName.equals("ellipse")) {
                            b = 0;
                        }
                        break;
                    case -1360216880:
                        if (tagName.equals("circle")) {
                            b = 1;
                        }
                        break;
                    case -916589195:
                        if (tagName.equals("linearGradient")) {
                            b = 2;
                        }
                        break;
                    case -397519558:
                        if (tagName.equals("polygon")) {
                            b = 3;
                        }
                        break;
                    case IShizukuService.Stub.TRANSACTION_dispatchPackageChanged /* 103 */:
                        if (tagName.equals("g")) {
                            b = 4;
                        }
                        break;
                    case 116103:
                        if (tagName.equals("use")) {
                            b = 5;
                        }
                        break;
                    case 3079438:
                        if (tagName.equals("defs")) {
                            b = 6;
                        }
                        break;
                    case 3321844:
                        if (tagName.equals("line")) {
                            b = 7;
                        }
                        break;
                    case 3344108:
                        if (tagName.equals("mask")) {
                            b = 8;
                        }
                        break;
                    case 3433509:
                        if (tagName.equals(MotionUtils.EASING_TYPE_PATH)) {
                            b = 9;
                        }
                        break;
                    case 3496420:
                        if (tagName.equals("rect")) {
                            b = 10;
                        }
                        break;
                    case 109780401:
                        if (tagName.equals(str29)) {
                            b = 11;
                        }
                        break;
                    case 561938880:
                        if (tagName.equals("polyline")) {
                            b = 12;
                        }
                        break;
                    case 763377263:
                        if (tagName.equals("radialGradient")) {
                            b = cb.k;
                        }
                        break;
                    case 917656469:
                        if (tagName.equals("clipPath")) {
                            b = cb.f77931l;
                        }
                        break;
                }
                String str34 = ".";
                String str35 = "ellipse";
                String str36 = Name.LABEL;
                String str37 = "clip-path";
                String str38 = "";
                switch (b) {
                    case 0:
                    case 1:
                    case 3:
                    case 7:
                    case 9:
                    case 10:
                    case 12:
                        C16867 c16867 = new C16867(c9815, element2, tagName + i3);
                        m17622(c9815, c16867);
                        c112210.mo27790(c16867);
                        Node parentNode = element2.getParentNode();
                        StringBuilder sb = new StringBuilder();
                        boolean z2 = false;
                        i3 = i3;
                        while (true) {
                            Logger logger = f19661;
                            String str39 = str32;
                            if (parentNode == null || !parentNode.getNodeName().equals(str31)) {
                                c11226 = c112210;
                                str = str30;
                                z = false;
                            } else {
                                Level level = Level.FINE;
                                String str40 = str31;
                                logger.log(level, "Printing current parent");
                                m17624(parentNode);
                                NamedNodeMap attributes = parentNode.getAttributes();
                                Node namedItem = attributes.getNamedItem(str29);
                                if (namedItem != null) {
                                    str = str30;
                                    sb.append(namedItem.getTextContent());
                                    sb.append(';');
                                    String string = sb.toString();
                                    c11226 = c112210;
                                    logger.log(level, "styleContent is :" + string + "at number group ");
                                    if (string.contains("display:none")) {
                                        logger.log(level, "Found none style, skip the whole group");
                                        str38 = string;
                                    } else {
                                        str38 = string;
                                        z2 = true;
                                    }
                                    z = true;
                                } else {
                                    c11226 = c112210;
                                    str = str30;
                                }
                                Node namedItem2 = attributes.getNamedItem("display");
                                if (namedItem2 == null || !"none".equals(namedItem2.getNodeValue())) {
                                    parentNode = parentNode.getParentNode();
                                    str32 = str39;
                                    str31 = str40;
                                    sb = sb;
                                    str30 = str;
                                    c112210 = c11226;
                                } else {
                                    logger.log(level, "Found display:none style, skip the whole group");
                                    z = true;
                                }
                            }
                            String str41 = str38;
                            if (z) {
                                c11224 = c11224;
                                c112210 = c11226;
                            } else {
                                Level level2 = Level.FINE;
                                logger.log(level2, "Print current item");
                                m17624(element2);
                                if (z2 && !str41.isEmpty()) {
                                    m17623(c16867, str41);
                                }
                                boolean zEquals = MotionUtils.EASING_TYPE_PATH.equals(element2.getNodeName());
                                AbstractC9608 abstractC96011 = f19663;
                                if (zEquals) {
                                    logger.log(level2, "Path found " + element2.getTextContent());
                                    if (element2.getNodeType() == 1) {
                                        NamedNodeMap attributes2 = element2.getAttributes();
                                        int length = attributes2.getLength();
                                        int i4 = 0;
                                        while (i4 < length) {
                                            Node nodeItem2 = attributes2.item(i4);
                                            String nodeName = nodeItem2.getNodeName();
                                            String nodeValue = nodeItem2.getNodeValue();
                                            if (nodeName.equals(str29)) {
                                                m17623(c16867, nodeValue);
                                            } else if (abstractC96011.containsKey(nodeName)) {
                                                c16867.mo27792(nodeName, nodeValue);
                                            } else {
                                                if (nodeName.equals("clip-path") || nodeName.equals("mask")) {
                                                    c11228 = c11226;
                                                    c9815.m24858(c16867, c11228, nodeValue);
                                                } else if (nodeName.equals("d")) {
                                                    c16867.m39642(Pattern.compile("(\\d)-").matcher(nodeValue).replaceAll("$1,-"));
                                                } else if (nodeName.equals(Name.LABEL)) {
                                                    c9815.m24857(c16867, C20094.m46315("path.", nodeValue));
                                                    c9815.m24857(c16867, C20094.m46315(str34, nodeValue));
                                                }
                                                i4++;
                                                c11226 = c11228;
                                            }
                                            c11228 = c11226;
                                            i4++;
                                            c11226 = c11228;
                                        }
                                    }
                                }
                                C11224 c112211 = c11226;
                                String str42 = "ry";
                                String str43 = "rx";
                                String str44 = "opacity:0;";
                                if (str.equals(element2.getNodeName())) {
                                    C11224 c112212 = c112211;
                                    logger.log(Level.FINE, "Rect found" + element2.getTextContent());
                                    if (element2.getNodeType() == 1) {
                                        NamedNodeMap attributes3 = element2.getAttributes();
                                        int length2 = attributes3.getLength();
                                        double dM24873 = Double.NaN;
                                        int i5 = 0;
                                        boolean z3 = false;
                                        double dM24874 = 0.0d;
                                        double dM24868 = 0.0d;
                                        double dM24875 = 0.0d;
                                        double dM24869 = 0.0d;
                                        double dM248610 = Double.NaN;
                                        while (i5 < length2) {
                                            Node nodeItem3 = attributes3.item(i5);
                                            NamedNodeMap namedNodeMap2 = attributes3;
                                            String nodeName2 = nodeItem3.getNodeName();
                                            int i6 = length2;
                                            String nodeValue2 = nodeItem3.getNodeValue();
                                            try {
                                                if (nodeName2.equals(str29)) {
                                                    m17623(c16867, nodeValue2);
                                                    if (nodeValue2.contains("opacity:0;")) {
                                                        z3 = true;
                                                    }
                                                } else {
                                                    if (abstractC96011.containsKey(nodeName2)) {
                                                        c16867.mo27792(nodeName2, nodeValue2);
                                                    } else if (nodeName2.equals("clip-path") || nodeName2.equals(str33)) {
                                                        str27 = str33;
                                                        str28 = str42;
                                                        c11227 = c112212;
                                                        try {
                                                            c9815.m24858(c16867, c11227, nodeValue2);
                                                        } catch (IllegalArgumentException unused) {
                                                            c112212 = c11227;
                                                            c9815.m24854(C20087.m46306("Invalid attribute value: ", nodeName2, "=\"", nodeValue2, "\""), element2);
                                                        }
                                                    } else {
                                                        str27 = str33;
                                                        try {
                                                            if (nodeName2.equals("x")) {
                                                                dM24875 = c9815.m24873(nodeValue2);
                                                            } else if (nodeName2.equals("y")) {
                                                                dM24869 = c9815.m24868(nodeValue2);
                                                            } else if (nodeName2.equals(str43)) {
                                                                dM24874 = c9815.m24873(nodeValue2);
                                                            } else if (nodeName2.equals(str42)) {
                                                                dM24868 = c9815.m24868(nodeValue2);
                                                            } else if (nodeName2.equals("width")) {
                                                                dM24873 = c9815.m24873(nodeValue2);
                                                            } else if (nodeName2.equals("height")) {
                                                                dM248610 = c9815.m24868(nodeValue2);
                                                            } else {
                                                                if (nodeName2.equals(Name.LABEL)) {
                                                                    StringBuilder sb2 = new StringBuilder();
                                                                    str28 = str42;
                                                                    try {
                                                                        sb2.append("rect.");
                                                                        sb2.append(nodeValue2);
                                                                        c9815.m24857(c16867, sb2.toString());
                                                                        c9815.m24857(c16867, str34 + nodeValue2);
                                                                    } catch (IllegalArgumentException unused2) {
                                                                        c11227 = c112212;
                                                                        c112212 = c11227;
                                                                        c9815.m24854(C20087.m46306("Invalid attribute value: ", nodeName2, "=\"", nodeValue2, "\""), element2);
                                                                    }
                                                                }
                                                                c11227 = c112212;
                                                            }
                                                            str28 = str42;
                                                            c11227 = c112212;
                                                        } catch (IllegalArgumentException unused3) {
                                                            str28 = str42;
                                                            c11227 = c112212;
                                                            c112212 = c11227;
                                                            c9815.m24854(C20087.m46306("Invalid attribute value: ", nodeName2, "=\"", nodeValue2, "\""), element2);
                                                            i5++;
                                                            str33 = str27;
                                                            attributes3 = namedNodeMap2;
                                                            length2 = i6;
                                                            str42 = str28;
                                                            str43 = str43;
                                                        }
                                                    }
                                                    c112212 = c11227;
                                                    i5++;
                                                    str33 = str27;
                                                    attributes3 = namedNodeMap2;
                                                    length2 = i6;
                                                    str42 = str28;
                                                    str43 = str43;
                                                }
                                                str27 = str33;
                                                str28 = str42;
                                                c11227 = c112212;
                                                c112212 = c11227;
                                            } catch (IllegalArgumentException unused4) {
                                                str27 = str33;
                                            }
                                            i5++;
                                            str33 = str27;
                                            attributes3 = namedNodeMap2;
                                            length2 = i6;
                                            str42 = str28;
                                            str43 = str43;
                                            break;
                                        }
                                        str2 = str33;
                                        str3 = str42;
                                        str4 = str43;
                                        if (!z3 && !Double.isNaN(dM24875) && !Double.isNaN(dM24869) && !Double.isNaN(dM24873) && !Double.isNaN(dM248610)) {
                                            C4936 c4936 = new C4936();
                                            if (dM24874 > 0.0d || dM24868 > 0.0d) {
                                                double d = dM24875;
                                                double d2 = dM24869;
                                                if (dM24868 == 0.0d) {
                                                    dM24868 = dM24874;
                                                } else if (dM24874 == 0.0d) {
                                                    dM24874 = dM24868;
                                                }
                                                double d3 = dM24873 / 2.0d;
                                                if (dM24874 <= d3) {
                                                    d3 = dM24874;
                                                }
                                                double d4 = dM248610 / 2.0d;
                                                if (dM24868 <= d4) {
                                                    d4 = dM24868;
                                                }
                                                double d5 = d + d3;
                                                c4936.m14379(d5, d2);
                                                double d6 = d + dM24873;
                                                str36 = Name.LABEL;
                                                double d7 = d6 - d3;
                                                c4936.m14375(d7, d2);
                                                double d8 = d2 + d4;
                                                double d9 = d3;
                                                double d10 = d4;
                                                c4936.m14376(d9, d10, d6, d8);
                                                double d11 = d2 + dM248610;
                                                double d12 = d11 - d4;
                                                c4936.m14375(d6, d12);
                                                c4936.m14376(d9, d10, d7, d11);
                                                c4936.m14375(d5, d11);
                                                double d13 = d3;
                                                double d14 = d4;
                                                c4936.m14376(d13, d14, d, d12);
                                                c4936.m14375(d, d8);
                                                c4936.m14376(d13, d14, d5, d2);
                                            } else {
                                                c4936.m14379(dM24875, dM24869);
                                                double d15 = dM24873;
                                                c4936.m14374(d15);
                                                c4936.m14380(dM248610);
                                                c4936.m14374(-d15);
                                                str36 = Name.LABEL;
                                            }
                                            c4936.m14373();
                                            c16867 = c16867;
                                            c16867.m39642(c4936.toString());
                                        }
                                    } else {
                                        str2 = "mask";
                                        str3 = "ry";
                                        str4 = "rx";
                                    }
                                    str44 = "opacity:0;";
                                    str37 = "clip-path";
                                } else {
                                    str2 = "mask";
                                    str3 = "ry";
                                    str4 = "rx";
                                    str44 = "opacity:0;";
                                    str37 = "clip-path";
                                }
                                String str45 = "cy";
                                String str46 = "cx";
                                if (str39.equals(element2.getNodeName())) {
                                    logger.log(Level.FINE, "circle found" + element2.getTextContent());
                                    if (element2.getNodeType() == 1) {
                                        NamedNodeMap attributes4 = element2.getAttributes();
                                        int length3 = attributes4.getLength();
                                        float f6 = 0.0f;
                                        boolean z4 = false;
                                        int i7 = 0;
                                        float f7 = 0.0f;
                                        float f8 = 0.0f;
                                        while (i7 < length3) {
                                            Node nodeItem4 = attributes4.item(i7);
                                            String nodeName3 = nodeItem4.getNodeName();
                                            String nodeValue3 = nodeItem4.getNodeValue();
                                            String str47 = str29;
                                            if (nodeName3.equals(str47)) {
                                                m17623(c16867, nodeValue3);
                                                String str48 = str44;
                                                if (nodeValue3.contains(str48)) {
                                                    z4 = true;
                                                }
                                                namedNodeMap = attributes4;
                                                str23 = str48;
                                                abstractC96010 = abstractC96011;
                                            } else {
                                                namedNodeMap = attributes4;
                                                str23 = str44;
                                                abstractC96010 = abstractC96011;
                                                if (abstractC96010.containsKey(nodeName3)) {
                                                    c16867.mo27792(nodeName3, nodeValue3);
                                                } else {
                                                    i2 = length3;
                                                    str24 = str37;
                                                    if (nodeName3.equals(str24)) {
                                                        str44 = str23;
                                                        str25 = str2;
                                                    } else {
                                                        str44 = str23;
                                                        String str49 = str2;
                                                        if (nodeName3.equals(str49)) {
                                                            str25 = str49;
                                                        } else {
                                                            if (nodeName3.equals(str46)) {
                                                                f7 = Float.parseFloat(nodeValue3);
                                                            } else {
                                                                if (nodeName3.equals(str45)) {
                                                                    f8 = Float.parseFloat(nodeValue3);
                                                                } else {
                                                                    str26 = str49;
                                                                    if (nodeName3.equals("r")) {
                                                                        f6 = Float.parseFloat(nodeValue3);
                                                                        str36 = str36;
                                                                        str25 = str26;
                                                                    } else {
                                                                        str36 = str36;
                                                                        if (nodeName3.equals(str36)) {
                                                                            str45 = str45;
                                                                            str25 = str26;
                                                                            c9813.m24857(c16867, C20094.m46315("circle.", nodeValue3));
                                                                            str34 = str34;
                                                                            c9813.m24857(c16867, C20094.m46315(str34, nodeValue3));
                                                                        } else {
                                                                            str25 = str26;
                                                                        }
                                                                    }
                                                                }
                                                                str34 = str34;
                                                            }
                                                            str26 = str49;
                                                            str36 = str36;
                                                            str25 = str26;
                                                            str34 = str34;
                                                        }
                                                    }
                                                    str34 = str34;
                                                    c9813.m24858(c16867, c11224, nodeValue3);
                                                }
                                                i7++;
                                                str36 = str36;
                                                str37 = str24;
                                                abstractC96011 = abstractC96010;
                                                str29 = str47;
                                                attributes4 = namedNodeMap;
                                                length3 = i2;
                                                str45 = str45;
                                                str35 = str35;
                                                String str50 = str46;
                                                str2 = str25;
                                                str46 = str50;
                                            }
                                            str44 = str23;
                                            str45 = str45;
                                            i2 = length3;
                                            str36 = str36;
                                            str24 = str37;
                                            String str51 = str2;
                                            str46 = str46;
                                            str25 = str51;
                                            i7++;
                                            str36 = str36;
                                            str37 = str24;
                                            abstractC96011 = abstractC96010;
                                            str29 = str47;
                                            attributes4 = namedNodeMap;
                                            length3 = i2;
                                            str45 = str45;
                                            str35 = str35;
                                            String str52 = str46;
                                            str2 = str25;
                                            str46 = str52;
                                        }
                                        str5 = str45;
                                        str6 = str35;
                                        str7 = str36;
                                        str8 = str37;
                                        abstractC9608 = abstractC96011;
                                        str9 = str29;
                                        String str53 = str2;
                                        str10 = str46;
                                        str11 = str53;
                                        f2 = 2.0f;
                                        if (!z4 && !Float.isNaN(f7) && !Float.isNaN(f8)) {
                                            C4936 c4937 = new C4936();
                                            c4937.m14379(f7, f8);
                                            c4937.m14378(-f6);
                                            double d16 = f6;
                                            c4937.m14377(d16, d16, f6 * 2.0f, true);
                                            c4937.m14377(d16, d16, f6 * (-2.0f), true);
                                            c16867.m39642(c4937.toString());
                                        }
                                        f = -2.0f;
                                    } else {
                                        str5 = "cy";
                                        str6 = str35;
                                        str7 = str36;
                                        str8 = str37;
                                        abstractC9608 = abstractC96011;
                                        str9 = str29;
                                        String str54 = str2;
                                        str10 = "cx";
                                        str11 = str54;
                                        f = -2.0f;
                                        f2 = 2.0f;
                                    }
                                } else {
                                    str5 = "cy";
                                    str6 = str35;
                                    str7 = str36;
                                    str8 = str37;
                                    abstractC9608 = abstractC96011;
                                    str9 = str29;
                                    String str55 = str2;
                                    str10 = "cx";
                                    str11 = str55;
                                    f = -2.0f;
                                    f2 = 2.0f;
                                }
                                float f9 = 0.0f;
                                if ("polygon".equals(element2.getNodeName()) || "polyline".equals(element2.getNodeName())) {
                                    logger.log(Level.FINE, "Polyline or Polygon found" + element2.getTextContent());
                                    if (element2.getNodeType() == 1) {
                                        NamedNodeMap attributes5 = element2.getAttributes();
                                        int length4 = attributes5.getLength();
                                        int i8 = 0;
                                        c9814 = c9813;
                                        while (i8 < length4) {
                                            int i9 = length4;
                                            Node nodeItem5 = attributes5.item(i8);
                                            NamedNodeMap namedNodeMap3 = attributes5;
                                            String nodeName4 = nodeItem5.getNodeName();
                                            float f10 = f2;
                                            String nodeValue4 = nodeItem5.getNodeValue();
                                            try {
                                                if (nodeName4.equals(str9)) {
                                                    m17623(c16867, nodeValue4);
                                                } else {
                                                    if (abstractC9608.containsKey(nodeName4)) {
                                                        c16867.mo27792(nodeName4, nodeValue4);
                                                    } else {
                                                        if (nodeName4.equals(str8) || nodeName4.equals(str11)) {
                                                            str11 = str11;
                                                            str8 = str8;
                                                            abstractC9608 = abstractC9608;
                                                            f5 = f9;
                                                            i = i8;
                                                            str16 = str9;
                                                            str17 = str34;
                                                            try {
                                                                c9814.m24858(c16867, c11224, nodeValue4);
                                                            } catch (ArrayIndexOutOfBoundsException | NumberFormatException unused5) {
                                                                c9814.m24854(C4860.m14172("Invalid value of \"", nodeName4, "\" attribute"), nodeItem5);
                                                            }
                                                        } else {
                                                            f5 = f9;
                                                            try {
                                                                if (!nodeName4.equals("points")) {
                                                                    str11 = str11;
                                                                    str8 = str8;
                                                                    abstractC9608 = abstractC9608;
                                                                    i = i8;
                                                                    str16 = str9;
                                                                    if (nodeName4.equals(str7)) {
                                                                        StringBuilder sb3 = new StringBuilder();
                                                                        str17 = str34;
                                                                        try {
                                                                            sb3.append(str17);
                                                                            sb3.append(nodeValue4);
                                                                            c9813.m24857(c16867, sb3.toString());
                                                                            c9813.m24857(c16867, element2.getNodeName() + str17 + nodeValue4);
                                                                        } catch (ArrayIndexOutOfBoundsException | NumberFormatException unused6) {
                                                                            c9814 = c9813;
                                                                            c9814.m24854(C4860.m14172("Invalid value of \"", nodeName4, "\" attribute"), nodeItem5);
                                                                        }
                                                                    } else {
                                                                        str17 = str34;
                                                                    }
                                                                    break;
                                                                } else {
                                                                    try {
                                                                        C4936 c4938 = new C4936();
                                                                        try {
                                                                            String[] strArrSplit = f19659.split(nodeValue4);
                                                                            float f11 = Float.parseFloat(strArrSplit[0]);
                                                                            str11 = str11;
                                                                            try {
                                                                                float f12 = Float.parseFloat(strArrSplit[1]);
                                                                                i = i8;
                                                                                str16 = str9;
                                                                                abstractC9608 = abstractC9608;
                                                                                try {
                                                                                    c4938.m14379(f11, f12);
                                                                                    int i10 = 2;
                                                                                    float f13 = f11;
                                                                                    while (i10 < strArrSplit.length) {
                                                                                        float f14 = Float.parseFloat(strArrSplit[i10]);
                                                                                        float f15 = Float.parseFloat(strArrSplit[i10 + 1]);
                                                                                        str8 = str8;
                                                                                        try {
                                                                                            c4938.m14381(f14 - f13, f15 - f12);
                                                                                            i10 += 2;
                                                                                            f12 = f15;
                                                                                            f13 = f14;
                                                                                            str8 = str8;
                                                                                        } catch (ArrayIndexOutOfBoundsException | NumberFormatException unused7) {
                                                                                            str17 = str34;
                                                                                            c9814 = c9813;
                                                                                            c9814.m24854(C4860.m14172("Invalid value of \"", nodeName4, "\" attribute"), nodeItem5);
                                                                                            i8 = i + 1;
                                                                                            str34 = str17;
                                                                                            length4 = i9;
                                                                                            attributes5 = namedNodeMap3;
                                                                                            f2 = f10;
                                                                                            f9 = f5;
                                                                                            str11 = str11;
                                                                                            str8 = str8;
                                                                                            abstractC9608 = abstractC9608;
                                                                                            str9 = str16;
                                                                                        }
                                                                                    }
                                                                                    str8 = str8;
                                                                                    if ("polygon".equals(element2.getNodeName())) {
                                                                                        c4938.m14373();
                                                                                    }
                                                                                    c16867.m39642(c4938.toString());
                                                                                    str17 = str34;
                                                                                } catch (ArrayIndexOutOfBoundsException | NumberFormatException unused8) {
                                                                                    str8 = str8;
                                                                                }
                                                                            } catch (ArrayIndexOutOfBoundsException | NumberFormatException unused9) {
                                                                                str8 = str8;
                                                                                abstractC9608 = abstractC9608;
                                                                                i = i8;
                                                                                str16 = str9;
                                                                                str17 = str34;
                                                                                c9814 = c9813;
                                                                                c9814.m24854(C4860.m14172("Invalid value of \"", nodeName4, "\" attribute"), nodeItem5);
                                                                                i8 = i + 1;
                                                                                str34 = str17;
                                                                                length4 = i9;
                                                                                attributes5 = namedNodeMap3;
                                                                                f2 = f10;
                                                                                f9 = f5;
                                                                                str11 = str11;
                                                                                str8 = str8;
                                                                                abstractC9608 = abstractC9608;
                                                                                str9 = str16;
                                                                            }
                                                                        } catch (ArrayIndexOutOfBoundsException | NumberFormatException unused10) {
                                                                            str11 = str11;
                                                                        }
                                                                    } catch (ArrayIndexOutOfBoundsException | NumberFormatException unused11) {
                                                                        str11 = str11;
                                                                    }
                                                                }
                                                                c9814 = c9813;
                                                            } catch (ArrayIndexOutOfBoundsException | NumberFormatException unused12) {
                                                                i = i8;
                                                                str16 = str9;
                                                                str17 = str34;
                                                            }
                                                        }
                                                        c9814.m24854(C4860.m14172("Invalid value of \"", nodeName4, "\" attribute"), nodeItem5);
                                                    }
                                                    i8 = i + 1;
                                                    str34 = str17;
                                                    length4 = i9;
                                                    attributes5 = namedNodeMap3;
                                                    f2 = f10;
                                                    f9 = f5;
                                                    str11 = str11;
                                                    str8 = str8;
                                                    abstractC9608 = abstractC9608;
                                                    str9 = str16;
                                                }
                                                str11 = str11;
                                                str8 = str8;
                                                abstractC9608 = abstractC9608;
                                                f5 = f9;
                                                i = i8;
                                                str16 = str9;
                                                str17 = str34;
                                            } catch (ArrayIndexOutOfBoundsException | NumberFormatException unused13) {
                                                f5 = f9;
                                            }
                                            i8 = i + 1;
                                            str34 = str17;
                                            length4 = i9;
                                            attributes5 = namedNodeMap3;
                                            f2 = f10;
                                            f9 = f5;
                                            str11 = str11;
                                            str8 = str8;
                                            abstractC9608 = abstractC9608;
                                            str9 = str16;
                                        }
                                        str12 = str11;
                                        str13 = str8;
                                        f3 = f2;
                                        abstractC9609 = abstractC9608;
                                        f4 = f9;
                                        str14 = str9;
                                        str15 = str34;
                                    } else {
                                        str12 = str11;
                                        str13 = str8;
                                        f3 = f2;
                                        abstractC9609 = abstractC9608;
                                        f4 = 0.0f;
                                        str14 = str9;
                                        str15 = str34;
                                        c9814 = c9813;
                                    }
                                } else {
                                    str12 = str11;
                                    str13 = str8;
                                    f3 = f2;
                                    abstractC9609 = abstractC9608;
                                    f4 = 0.0f;
                                    str14 = str9;
                                    str15 = str34;
                                    c9814 = c9813;
                                }
                                if ("line".equals(element2.getNodeName())) {
                                    logger.log(Level.FINE, "line found" + element2.getTextContent());
                                    if (element2.getNodeType() == 1) {
                                        NamedNodeMap attributes6 = element2.getAttributes();
                                        int length5 = attributes6.getLength();
                                        boolean z5 = false;
                                        int i11 = 0;
                                        float f16 = 0.0f;
                                        float f17 = 0.0f;
                                        float f18 = 0.0f;
                                        float f19 = 0.0f;
                                        while (i11 < length5) {
                                            Node nodeItem6 = attributes6.item(i11);
                                            String nodeName5 = nodeItem6.getNodeName();
                                            NamedNodeMap namedNodeMap4 = attributes6;
                                            String nodeValue5 = nodeItem6.getNodeValue();
                                            int i12 = length5;
                                            String str56 = str14;
                                            if (nodeName5.equals(str56)) {
                                                m17623(c16867, nodeValue5);
                                                String str57 = str44;
                                                if (nodeValue5.contains(str57)) {
                                                    z5 = true;
                                                }
                                                str22 = str57;
                                                str14 = str56;
                                            } else {
                                                str14 = str56;
                                                str22 = str44;
                                                AbstractC9608 abstractC96012 = abstractC9609;
                                                if (abstractC96012.containsKey(nodeName5)) {
                                                    c16867.mo27792(nodeName5, nodeValue5);
                                                    abstractC9609 = abstractC96012;
                                                } else {
                                                    abstractC9609 = abstractC96012;
                                                    String str58 = str13;
                                                    if (nodeName5.equals(str58)) {
                                                        str13 = str58;
                                                    } else {
                                                        str13 = str58;
                                                        String str59 = str12;
                                                        if (nodeName5.equals(str59)) {
                                                            str12 = str59;
                                                        } else {
                                                            str12 = str59;
                                                            if (nodeName5.equals("x1")) {
                                                                f16 = Float.parseFloat(nodeValue5);
                                                            } else if (nodeName5.equals("y1")) {
                                                                f17 = Float.parseFloat(nodeValue5);
                                                            } else if (nodeName5.equals("x2")) {
                                                                f18 = Float.parseFloat(nodeValue5);
                                                            } else if (nodeName5.equals("y2")) {
                                                                f19 = Float.parseFloat(nodeValue5);
                                                            } else if (nodeName5.equals(str7)) {
                                                                c9814.m24857(c16867, C20094.m46315("line.", nodeValue5));
                                                                c9814.m24857(c16867, C20094.m46315(str15, nodeValue5));
                                                            }
                                                        }
                                                    }
                                                    c9814.m24858(c16867, c11224, nodeValue5);
                                                }
                                            }
                                            i11++;
                                            attributes6 = namedNodeMap4;
                                            length5 = i12;
                                            str44 = str22;
                                        }
                                        str18 = str44;
                                        if (!z5 && !Float.isNaN(f16) && !Float.isNaN(f17) && !Float.isNaN(f18) && !Float.isNaN(f19)) {
                                            C4936 c4939 = new C4936();
                                            c4939.m14379(f16, f17);
                                            c4939.m14375(f18, f19);
                                            c16867.m39642(c4939.toString());
                                        }
                                    } else {
                                        str18 = str44;
                                    }
                                } else {
                                    str18 = str44;
                                }
                                if (str6.equals(element2.getNodeName())) {
                                    logger.log(Level.FINE, "ellipse found" + element2.getTextContent());
                                    if (element2.getNodeType() == 1) {
                                        NamedNodeMap attributes7 = element2.getAttributes();
                                        int length6 = attributes7.getLength();
                                        int i13 = 0;
                                        float f20 = 0.0f;
                                        boolean z6 = false;
                                        float f21 = 0.0f;
                                        float f22 = 0.0f;
                                        float f23 = 0.0f;
                                        while (i13 < length6) {
                                            Node nodeItem7 = attributes7.item(i13);
                                            String nodeName6 = nodeItem7.getNodeName();
                                            String nodeValue6 = nodeItem7.getNodeValue();
                                            NamedNodeMap namedNodeMap5 = attributes7;
                                            String str60 = str14;
                                            if (nodeName6.equals(str60)) {
                                                m17623(c16867, nodeValue6);
                                                String str61 = str18;
                                                if (nodeValue6.contains(str61)) {
                                                    z6 = true;
                                                }
                                                str14 = str60;
                                                str19 = str61;
                                            } else {
                                                str14 = str60;
                                                AbstractC9608 abstractC96013 = abstractC9609;
                                                str19 = str18;
                                                if (abstractC96013.containsKey(nodeName6)) {
                                                    c16867.mo27792(nodeName6, nodeValue6);
                                                    abstractC9609 = abstractC96013;
                                                } else {
                                                    abstractC9609 = abstractC96013;
                                                    String str62 = str13;
                                                    if (nodeName6.equals(str62)) {
                                                        str13 = str62;
                                                    } else {
                                                        str13 = str62;
                                                        String str63 = str12;
                                                        if (nodeName6.equals(str63)) {
                                                            str12 = str63;
                                                        } else {
                                                            str12 = str63;
                                                            String str64 = str10;
                                                            if (nodeName6.equals(str64)) {
                                                                f20 = Float.parseFloat(nodeValue6);
                                                                str10 = str64;
                                                            } else {
                                                                str10 = str64;
                                                                String str65 = str5;
                                                                if (nodeName6.equals(str65)) {
                                                                    f21 = Float.parseFloat(nodeValue6);
                                                                    str5 = str65;
                                                                } else {
                                                                    str5 = str65;
                                                                    str21 = str4;
                                                                    if (nodeName6.equals(str21)) {
                                                                        f22 = Float.parseFloat(nodeValue6);
                                                                        str4 = str21;
                                                                    } else {
                                                                        str4 = str21;
                                                                        str20 = str3;
                                                                        if (nodeName6.equals(str20)) {
                                                                            f23 = Float.parseFloat(nodeValue6);
                                                                        } else if (nodeName6.equals(str7)) {
                                                                            c9814.m24857(c16867, C20094.m46315("ellipse.", nodeValue6));
                                                                            c9814.m24857(c16867, C20094.m46315(str15, nodeValue6));
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        i13++;
                                                        str3 = str20;
                                                        str18 = str19;
                                                        attributes7 = namedNodeMap5;
                                                    }
                                                    str20 = str3;
                                                    c9814.m24858(c16867, c11224, nodeValue6);
                                                    i13++;
                                                    str3 = str20;
                                                    str18 = str19;
                                                    attributes7 = namedNodeMap5;
                                                }
                                                str21 = str4;
                                                str4 = str21;
                                            }
                                            str20 = str3;
                                            i13++;
                                            str3 = str20;
                                            str18 = str19;
                                            attributes7 = namedNodeMap5;
                                        }
                                        if (!z6 && !Float.isNaN(f20) && !Float.isNaN(f21) && f22 > f4 && f23 > f4) {
                                            C4936 c49310 = new C4936();
                                            c49310.m14379(f20 - f22, f21);
                                            double d17 = f22;
                                            double d18 = f23;
                                            c49310.m14377(d17, d18, f22 * f3, false);
                                            c49310.m14377(d17, d18, f22 * f, false);
                                            c49310.m14373();
                                            c16867.m39642(c49310.toString());
                                        }
                                    }
                                }
                                c9814.m24857(c16867, element2.getNodeName());
                                c9815 = c9814;
                                c112210 = c11224;
                            }
                            c9815.m24870();
                            break;
                        }
                        break;
                    case 2:
                        C2051 c2051 = new C2051(c9815, element2, tagName + i3);
                        m17622(c9815, (AbstractC14750) c2051);
                        m17620(c9815, c2051);
                        c2051.mo27792("gradientType", "linear");
                        c9815.m24862();
                        c11224 = c11224;
                        break;
                    case 4:
                        C11224 c112213 = new C11224(c9815, element2, C19370.m44628(i3, "child"));
                        c112210.mo27790((AbstractC14750) c112213);
                        m17622(c9815, c112213);
                        NamedNodeMap attributes8 = c112213.f45035.getAttributes();
                        int length7 = attributes8.getLength();
                        for (int i14 = 0; i14 < length7; i14++) {
                            Node nodeItem8 = attributes8.item(i14);
                            String nodeName7 = nodeItem8.getNodeName();
                            String nodeValue7 = nodeItem8.getNodeValue();
                            if (nodeName7.equals("clip-path") || nodeName7.equals("mask")) {
                                if (!nodeValue7.isEmpty()) {
                                    c9815.m24858(c112213, c112210, nodeValue7);
                                }
                            } else if (nodeName7.equals(Name.LABEL) && !nodeValue7.isEmpty()) {
                                c9815.m24857(c112213, str34.concat(nodeValue7));
                            }
                        }
                        m17621(c9815, c112213, element2);
                        c11224 = c11224;
                        break;
                    case 5:
                        C11224 c112214 = new C11224(c9815, element2, C19370.m44628(i3, "child"));
                        m17622(c9815, c112214);
                        c112210.mo27790((AbstractC14750) c112214);
                        c9815.m24856(c112214);
                        c11224 = c11224;
                        break;
                    case 6:
                        m17621(c9815, new C11224(c9815, element2, C19370.m44628(i3, "child")), element2);
                        c11224 = c11224;
                        break;
                    case 8:
                    case 14:
                        C11992 c11992 = new C11992(c9815, element2, tagName + i3);
                        m17622(c9815, c11992);
                        m17621(c9815, c11992, element2);
                        c11224 = c11224;
                        break;
                    case 11:
                        NodeList childNodes2 = element2.getChildNodes();
                        int length8 = childNodes2.getLength();
                        String nodeValue8 = "";
                        for (int i15 = 0; i15 < length8; i15++) {
                            Node nodeItem9 = childNodes2.item(i15);
                            if (nodeItem9.getNodeType() == 4 || length8 == 1) {
                                nodeValue8 = nodeItem9.getNodeValue();
                            }
                        }
                        if (!nodeValue8.isEmpty()) {
                            for (String str66 : nodeValue8.split("\\}")) {
                                String[] strArrSplit2 = str66.split("\\{");
                                if (strArrSplit2.length >= 2) {
                                    String strTrim = strArrSplit2[0].trim();
                                    String strTrim2 = strArrSplit2[1].trim();
                                    for (String str67 : strTrim.split(",")) {
                                        String strTrim3 = str67.trim();
                                        String strM24864 = c9815.m24864(strTrim3);
                                        c9815.m24853(strTrim3, strM24864 != null ? strTrim2 + ';' + strM24864 : strTrim2);
                                    }
                                }
                            }
                        }
                        c11224 = c11224;
                        break;
                    case 13:
                        C2051 c2052 = new C2051(c9815, element2, tagName + i3);
                        m17622(c9815, (AbstractC14750) c2052);
                        m17620(c9815, c2052);
                        c2052.mo27792("gradientType", "radial");
                        c9815.m24862();
                        c11224 = c11224;
                        break;
                    default:
                        c11224 = c11224;
                        C11224 c112215 = c112210;
                        String attribute = element2.getAttribute("id");
                        if (attribute != null) {
                            c9815.m24852(attribute);
                        }
                        if (f19662.contains(tagName)) {
                            c9815.m24854(C4860.m14172("<", tagName, "> is not supported"), element2);
                        }
                        c11225 = c112215;
                        m17621(c9815, c11225, element2);
                        c112210 = c11225;
                        break;
                }
                i3++;
                c11229 = c11224;
                childNodes = nodeList;
            } else {
                c11224 = c11229;
                nodeList = childNodes;
            }
            c11225 = c112210;
            c112210 = c11225;
            i3++;
            c11229 = c11224;
            childNodes = nodeList;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m17624(Node node) {
        Level level = Level.FINE;
        String str = " nodeName=\"" + node.getNodeName() + "\"";
        Logger logger = f19661;
        logger.log(level, str);
        String namespaceURI = node.getNamespaceURI();
        if (namespaceURI != null) {
            logger.log(level, " uri=\"" + namespaceURI + "\"");
        }
        String prefix = node.getPrefix();
        if (prefix != null) {
            logger.log(level, " pre=\"" + prefix + "\"");
        }
        String localName = node.getLocalName();
        if (localName != null) {
            logger.log(level, " local=\"" + localName + "\"");
        }
        String nodeValue = node.getNodeValue();
        if (nodeValue != null) {
            logger.log(level, " nodeValue=");
            if (nodeValue.trim().isEmpty()) {
                logger.log(level, "[WS]");
                return;
            }
            logger.log(level, "\"" + node.getNodeValue() + "\"");
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m17623(AbstractC14750 abstractC14750, String str) {
        String str2;
        f19661.log(Level.FINE, "Style found is " + str);
        if (str == null) {
            return;
        }
        String[] strArrSplit = str.split(l.b);
        int length = strArrSplit.length;
        while (true) {
            length--;
            if (length < 0) {
                return;
            }
            String[] strArrSplit2 = strArrSplit[length].split(":");
            if (strArrSplit2.length == 2 && (str2 = strArrSplit2[0]) != null && strArrSplit2[1] != null) {
                String strTrim = str2.trim();
                String strTrim2 = strArrSplit2[1].trim();
                if (f19663.containsKey(strTrim)) {
                    abstractC14750.mo27792(strTrim, strTrim2);
                } else if (strTrim.equals("opacity")) {
                    abstractC14750.mo27792("fill-opacity", strArrSplit2[1]);
                }
                if (strTrim.equals("clip-path") || strTrim.equals("mask")) {
                    C11224 c11224M24848 = abstractC14750.f45039.m24848(abstractC14750);
                    if (c11224M24848 != null) {
                        abstractC14750.f45039.m24858(abstractC14750, c11224M24848, strTrim2);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m17619(AbstractC15440 abstractC15440, ByteArrayOutputStream byteArrayOutputStream) throws IOException {
        AbstractC14750 abstractC14750M24872;
        String name = abstractC15440.getName();
        byte[] bArrM36506 = abstractC15440.m36506();
        final C9813 c9813 = new C9813();
        ArrayList arrayList = new ArrayList();
        Document documentM24849 = c9813.m24849(name, arrayList, bArrM36506);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            c9813.m24854((String) it.next(), (Node) null);
        }
        NodeList elementsByTagName = documentM24849.getElementsByTagName("svg");
        if (elementsByTagName.getLength() != 1) {
            throw new IllegalStateException("Not a proper SVG file");
        }
        Element element = (Element) elementsByTagName.item(0);
        c9813.m24859(element);
        if (c9813.m24877() == null) {
            c9813.m24854("Missing \"viewBox\" in <svg> element", element);
        } else {
            C11224 c11224 = new C11224(c9813, element, "root");
            c9813.m24866(c11224);
            m17621(c9813, c11224, element);
            HashSet hashSetM24878 = c9813.m24878();
            while (!hashSetM24878.isEmpty()) {
                if (!C5378.removeIf(hashSetM24878, new Predicate() { // from class: l.ۤ᩹ۡ
                    @Override // java.util.function.Predicate
                    public /* synthetic */ Predicate and(Predicate predicate) {
                        return C19285.$default$and(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    /* JADX INFO: renamed from: negate */
                    public /* synthetic */ Predicate mo4928negate() {
                        return C19285.$default$negate(this);
                    }

                    public /* synthetic */ Predicate or(Predicate predicate) {
                        return C19285.$default$or(this, predicate);
                    }

                    /* JADX WARN: Code duplicated, block: B:10:0x0032  */
                    /* JADX WARN: Code duplicated, block: B:16:0x0047  */
                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj) {
                        C11224 c11225 = (C11224) obj;
                        Element element2 = c11225.f45035;
                        NamedNodeMap attributes = element2.getAttributes();
                        int length = attributes.getLength();
                        float f = 0.0f;
                        float f2 = 0.0f;
                        String strSubstring = null;
                        for (int i = 0; i < length; i++) {
                            Node nodeItem = attributes.item(i);
                            String nodeName = nodeItem.getNodeName();
                            String nodeValue = nodeItem.getNodeValue();
                            if (nodeName.equals("href")) {
                                if (nodeValue.isEmpty()) {
                                    strSubstring = "";
                                } else {
                                    strSubstring = nodeValue.substring(1);
                                }
                            } else if (nodeName.equals("xlink:href") && strSubstring == null) {
                                if (nodeValue.isEmpty()) {
                                    strSubstring = "";
                                } else {
                                    strSubstring = nodeValue.substring(1);
                                }
                            } else if (nodeName.equals("x")) {
                                f = Float.parseFloat(nodeValue);
                            } else if (nodeName.equals("y")) {
                                f2 = Float.parseFloat(nodeValue);
                            } else if (C6347.f19663.containsKey(nodeName)) {
                                c11225.mo27792(nodeName, nodeValue);
                            }
                        }
                        C0639 c0639 = new C0639(f, f2);
                        C9813 c9814 = c9813;
                        AbstractC14750 abstractC14750M24873 = strSubstring != null ? c9814.m24872(strSubstring) : null;
                        if (abstractC14750M24873 == null) {
                            if (strSubstring != null && c9814.m24876(strSubstring)) {
                                return true;
                            }
                            c9814.m24854("Referenced id not found", element2);
                            return true;
                        }
                        if (c9814.m24878().contains(abstractC14750M24873)) {
                            return false;
                        }
                        AbstractC14750 abstractC14750Mo6729 = abstractC14750M24873.mo6729();
                        c11225.mo27790(abstractC14750Mo6729);
                        HashMap map = c11225.f45037;
                        for (Map.Entry entry : map.entrySet()) {
                            abstractC14750Mo6729.mo27792((String) entry.getKey(), (String) entry.getValue());
                        }
                        c11225.m35053(map);
                        c11225.mo6736(c0639);
                        return true;
                    }
                })) {
                    HashMap map = new HashMap();
                    HashMap map2 = new HashMap();
                    Iterator it2 = hashSetM24878.iterator();
                    while (it2.hasNext()) {
                        Element element2 = ((C11224) it2.next()).f45035;
                        String attribute = element2.getAttribute("id");
                        if (!attribute.isEmpty()) {
                            String attribute2 = element2.getAttribute("href");
                            if (attribute2.isEmpty()) {
                                attribute2 = element2.getAttribute("xlink:href");
                            }
                            if (!attribute2.isEmpty()) {
                                map.put(attribute, attribute2.isEmpty() ? "" : attribute2.substring(1));
                                map2.put(attribute, element2);
                            }
                        }
                    }
                    while (!map.isEmpty()) {
                        HashSet hashSet = new HashSet();
                        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
                        String str = (String) entry.getKey();
                        String str2 = (String) entry.getValue();
                        while (str2 != null && hashSet.add(str)) {
                            str = str2;
                            str2 = (String) map.get(str2);
                        }
                        if (str2 != null) {
                            Node node = (Node) map2.get(str);
                            StringBuilder sb = new StringBuilder(str);
                            String str3 = str;
                            while (true) {
                                str3 = (String) map.get(str3);
                                sb.append(" -> ");
                                sb.append(str3);
                                if (str3.equals(str)) {
                                    break;
                                }
                                sb.append(" (line ");
                                sb.append(C4873.m14230((Node) map2.get(str3)).m10600() + 1);
                                sb.append(MotionUtils.EASING_TYPE_FORMAT_END);
                            }
                            c9813.m24854(C20094.m46315("Circular dependency of <use> nodes: ", sb.toString()), node);
                        }
                        map.keySet().removeAll(hashSet);
                    }
                    break;
                }
            }
            for (Map.Entry entry2 : c9813.m24861()) {
                Iterator it3 = ((Set) entry2.getValue()).iterator();
                while (it3.hasNext()) {
                    m17623((AbstractC14750) it3.next(), c9813.m24864((String) entry2.getKey()));
                }
            }
            for (Map.Entry entry3 : c9813.m24871()) {
                AbstractC14750 abstractC14750 = (AbstractC14750) entry3.getKey();
                C11224 c11225 = (C11224) ((Pair) entry3.getValue()).first;
                String str4 = (String) ((Pair) entry3.getValue()).second;
                if (c11225 != null && str4 != null) {
                    int iIndexOf = str4.indexOf(35) + 1;
                    int iIndexOf2 = str4.indexOf(41, iIndexOf);
                    if (iIndexOf2 < 0) {
                        iIndexOf2 = str4.length();
                    }
                    String strTrim = str4.substring(iIndexOf, iIndexOf2).trim();
                    if (strTrim != null && (abstractC14750M24872 = c9813.m24872(strTrim)) != null) {
                        C11992 c11992Mo6729 = ((C11992) abstractC14750M24872).mo6729();
                        ArrayList arrayList2 = c11225.f33663;
                        int iIndexOf3 = arrayList2.indexOf(abstractC14750);
                        if (iIndexOf3 < 0) {
                            throw new IllegalArgumentException("The child being replaced doesn't belong to this group");
                        }
                        arrayList2.set(iIndexOf3, c11992Mo6729);
                        c11992Mo6729.m29300(abstractC14750);
                        c11992Mo6729.m29301();
                    }
                }
            }
            c9813.m24865();
            c9813.m24860();
            c9813.m24850();
        }
        if (c9813.m24874()) {
            c9813.m24851(byteArrayOutputStream);
        }
        return c9813.m24875();
    }
}
