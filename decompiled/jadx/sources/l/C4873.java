package l;

import com.alipay.sdk.m.w.a;
import java.io.IOException;
import java.io.StringReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.w3c.dom.Attr;
import org.w3c.dom.CDATASection;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.Text;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.DefaultHandler;

/* JADX INFO: renamed from: l.ۙ᩶ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: UBKB */
/* JADX INFO: loaded from: classes2.dex */
public final class C4873 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final DocumentBuilderFactory f15408;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final Pattern f15409 = Pattern.compile("encoding=['\"](\\S*)['\"]");

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final SAXParserFactory f15410;

    static {
        DocumentBuilderFactory documentBuilderFactoryNewInstance = DocumentBuilderFactory.newInstance();
        f15408 = documentBuilderFactoryNewInstance;
        documentBuilderFactoryNewInstance.setNamespaceAware(true);
        documentBuilderFactoryNewInstance.setValidating(false);
        SAXParserFactory sAXParserFactoryNewInstance = SAXParserFactory.newInstance();
        f15410 = sAXParserFactoryNewInstance;
        try {
            sAXParserFactoryNewInstance.setNamespaceAware(false);
            sAXParserFactoryNewInstance.setFeature("http://xml.org/sax/features/namespace-prefixes", false);
            sAXParserFactoryNewInstance.setValidating(false);
        } catch (ParserConfigurationException | SAXException unused) {
        }
        SAXParserFactory sAXParserFactoryNewInstance2 = SAXParserFactory.newInstance();
        try {
            sAXParserFactoryNewInstance2.setNamespaceAware(true);
            sAXParserFactoryNewInstance2.setFeature("http://xml.org/sax/features/namespace-prefixes", true);
            sAXParserFactoryNewInstance2.setValidating(false);
        } catch (ParserConfigurationException | SAXException unused2) {
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m14232(String str, DefaultHandler defaultHandler) throws ParserConfigurationException, SAXException, IOException {
        SAXParser sAXParserNewSAXParser = f15410.newSAXParser();
        XMLReader xMLReader = sAXParserNewSAXParser.getXMLReader();
        xMLReader.setFeature("http://xml.org/sax/features/external-general-entities", false);
        xMLReader.setFeature("http://xml.org/sax/features/external-parameter-entities", false);
        sAXParserNewSAXParser.getXMLReader().setProperty("http://xml.org/sax/properties/lexical-handler", defaultHandler);
        sAXParserNewSAXParser.parse(new InputSource(new StringReader(str)), defaultHandler);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x005b  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Document m14231(ArrayList arrayList, byte[] bArr) throws ParserConfigurationException, IOException {
        int i;
        String str;
        String str2;
        String str3;
        boolean z;
        C22512 c22512;
        byte b;
        byte b2;
        byte b3;
        int length = bArr.length;
        String strGroup = a.D;
        if (length > 4) {
            byte b4 = bArr[0];
            i = 3;
            if (b4 == -17 && bArr[1] == -69 && bArr[2] == -65) {
                str2 = a.D;
            } else {
                if (b4 == -2 && bArr[1] == -1) {
                    str2 = "UTF_16";
                } else {
                    if (b4 == 0 && bArr[1] == 0 && bArr[2] == -2 && bArr[3] == -1) {
                        str2 = "UTF_32";
                    } else if (b4 == -1 && bArr[1] == -2 && bArr[2] == 0 && bArr[3] == 0) {
                        str2 = "UTF_32LE";
                    } else if (b4 == -1 && bArr[1] == -2) {
                        str2 = "UTF_16LE";
                    } else {
                        i = 0;
                        str = null;
                        str2 = a.D;
                    }
                    i = 4;
                }
                i = 2;
            }
            str = str2;
        } else {
            i = 0;
            str = null;
            str2 = a.D;
        }
        int length2 = bArr.length - i;
        boolean z2 = false;
        boolean z3 = false;
        int i2 = -1;
        for (int i3 = i; i3 < bArr.length; i3++) {
            byte b5 = bArr[i3];
            if (b5 != 0) {
                if (b5 == 10 || b5 == 13) {
                    break;
                }
                if (b5 != 60) {
                    if (b5 == 62) {
                        int i4 = i3 - 4;
                        while (true) {
                            if (i4 < 0) {
                                strGroup = str;
                                break;
                            }
                            byte b6 = bArr[i4];
                            if ((b6 == 117 || b6 == 85) && (((b = bArr[i4 + 1]) == 116 || b == 84) && (((b2 = bArr[i4 + 2]) == 102 || b2 == 70) && (((b3 = bArr[i4 + 3]) == 45 || b3 == 95) && bArr[i4 + 4] == 56)))) {
                                break;
                            }
                            i4--;
                        }
                        if (strGroup == null) {
                            StringBuilder sb = new StringBuilder();
                            while (i2 <= i3) {
                                byte b7 = bArr[i2];
                                if (b7 != 0) {
                                    sb.append((char) b7);
                                }
                                i2++;
                            }
                            String string = sb.toString();
                            int iIndexOf = string.indexOf("encoding");
                            if (iIndexOf != -1) {
                                Matcher matcher = f15409.matcher(string);
                                if (matcher.find(iIndexOf)) {
                                    strGroup = matcher.group(1);
                                }
                            }
                        }
                        str = strGroup;
                        break;
                    }
                } else {
                    i2 = i3;
                }
            } else if ((i3 - i) % 2 == 0) {
                z3 = true;
            } else {
                z2 = true;
            }
        }
        if (str == null) {
            str = z2 ? "UTF_16LE" : z3 ? "UTF_16" : str2;
        }
        try {
            try {
                str3 = new String(bArr, i, length2, str);
                while (true) {
                    c22512 = new C22512(str3);
                    try {
                        m14232(str3, c22512);
                        break;
                    } catch (SAXException e) {
                        if (z || !e.getMessage().contains("Content is not allowed in prolog")) {
                            arrayList.add(e.getLocalizedMessage());
                            c22512.m50464();
                            break;
                        }
                        str3 = str3.replaceFirst("^([\\W]+)<", "<");
                        z = true;
                    }
                }
            } catch (UnsupportedEncodingException unused) {
            }
        } catch (UnsupportedEncodingException unused2) {
            str3 = !str.equals(str2) ? new String(bArr, i, length2, str2) : null;
        }
        if (str3 == null) {
            str3 = new String(bArr, i, length2);
        }
        if (!str3.isEmpty() && str3.charAt(0) == 65279) {
            str3 = str3.substring(1);
        }
        z = false;
        return c22512.m50465();
    }

    /* JADX WARN: Code duplicated, block: B:84:0x018d  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3462 m14230(Node node) {
        String str;
        C20396 c20396 = null;
        if (node instanceof Attr) {
            Attr attr = (Attr) node;
            C20396 c20397 = (C20396) attr.getOwnerElement().getUserData("offsets");
            if (c20397 != null) {
                int iM46719 = c20397.m46719();
                int iM467110 = c20397.m46716().m46719();
                String str2 = (String) node.getOwnerDocument().getUserData("contents");
                if (str2 != null) {
                    String name = attr.getName();
                    if (attr.getPrefix() != null) {
                        str = String.format("(%1$s\\s*=\\s*((\".*?\")|('.*?')))", name);
                    } else {
                        str = String.format("[^:](%1$s\\s*=\\s*((\".*?\")|('.*?')))", name);
                    }
                    Matcher matcher = Pattern.compile(str).matcher(str2);
                    if (!matcher.find(iM46719) || matcher.start(1) > iM467110) {
                        c20396 = c20397;
                    } else {
                        int iStart = matcher.start(1);
                        int iM46717 = c20397.m46717();
                        int iM46714 = c20397.m46714();
                        for (int iM467111 = c20397.m46719(); iM467111 < iStart; iM467111++) {
                            if (str2.charAt(iM467111) == '\n') {
                                iM46717++;
                                iM46714 = 0;
                            } else {
                                iM46714++;
                            }
                        }
                        C20396 c20398 = new C20396(iM46717, iM46714, iStart);
                        c20398.m46715(new C20396(iM46717, (matcher.end(1) + iM46714) - iStart, matcher.end(1)));
                        c20396 = c20398;
                    }
                }
            } else {
                c20396 = (C20396) node.getUserData("offsets");
            }
        } else if (node instanceof Text) {
            C20396 c20399 = node.getPreviousSibling() != null ? (C20396) node.getPreviousSibling().getUserData("offsets") : null;
            if (c20399 == null) {
                c20399 = (C20396) node.getParentNode().getUserData("offsets");
            }
            if (c20399 != null) {
                int iM467112 = c20399.m46716().m46719();
                int iM46718 = c20399.m46717();
                int iM46715 = c20399.m46714();
                String str3 = (String) node.getOwnerDocument().getUserData("contents");
                if (str3 != null && str3.length() >= iM467112) {
                    boolean z = false;
                    for (int iM467113 = c20399.m46719(); iM467113 <= iM467112; iM467113++) {
                        char cCharAt = str3.charAt(iM467113);
                        if (cCharAt != '>' || z) {
                            if (cCharAt == '\"') {
                                z = !z;
                            } else if (cCharAt == '\n') {
                                iM46718++;
                                iM46715 = -1;
                            }
                            iM46715++;
                        } else {
                            int i = iM467113 + 1;
                            int i2 = iM46715 + 1;
                            if ((node instanceof CDATASection) && str3.regionMatches(i, "<![CDATA[", 0, 9)) {
                                i = iM467113 + 10;
                                i2 = iM46715 + 10;
                            }
                            String nodeValue = node.getNodeValue();
                            int length = nodeValue.length();
                            int i3 = 0;
                            int i4 = i2;
                            int i5 = iM46718;
                            while (i3 < length) {
                                char cCharAt2 = nodeValue.charAt(i3);
                                if (cCharAt2 == '\n') {
                                    i5++;
                                    i4 = 0;
                                } else {
                                    if (!Character.isWhitespace(cCharAt2)) {
                                        break;
                                    }
                                    i4++;
                                }
                                i3++;
                            }
                            if (i3 == nodeValue.length()) {
                                i3 = 0;
                            } else {
                                iM46718 = i5;
                                i2 = i4;
                            }
                            int i6 = i + i3;
                            C20396 c203910 = new C20396(iM46718, i2, i6);
                            for (int i7 = length - 1; i7 >= 0; i7--) {
                                if (!Character.isWhitespace(nodeValue.charAt(i7))) {
                                    length = i7 + 1;
                                    break;
                                }
                            }
                            while (i3 < length) {
                                if (nodeValue.charAt(i3) == '\n') {
                                    iM46718++;
                                    i2 = 0;
                                } else {
                                    i2++;
                                }
                                i6++;
                                i3++;
                            }
                            c203910.m46715(new C20396(iM46718, i2, i6));
                            c20396 = c203910;
                        }
                    }
                    c20396 = c20399;
                }
            } else {
                c20396 = (C20396) node.getUserData("offsets");
            }
        } else {
            c20396 = (C20396) node.getUserData("offsets");
        }
        return c20396 == null ? C3462.f10964 : c20396.m46718();
    }
}
