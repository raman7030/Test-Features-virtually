package p067l;

import com.alipay.sdk.p010m.p055w.C0233a;
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
public final class C7000 {

    /* JADX INFO: renamed from: ֫ */
    public static final DocumentBuilderFactory f18239;

    /* JADX INFO: renamed from: ۧ */
    public static final Pattern f18240 = Pattern.compile("encoding=['\"](\\S*)['\"]");

    /* JADX INFO: renamed from: ܽ */
    public static final SAXParserFactory f18241;

    static {
        DocumentBuilderFactory documentBuilderFactoryNewInstance = DocumentBuilderFactory.newInstance();
        f18239 = documentBuilderFactoryNewInstance;
        documentBuilderFactoryNewInstance.setNamespaceAware(true);
        documentBuilderFactoryNewInstance.setValidating(false);
        SAXParserFactory sAXParserFactoryNewInstance = SAXParserFactory.newInstance();
        f18241 = sAXParserFactoryNewInstance;
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

    /* JADX INFO: renamed from: ֫ */
    public static void m16114(String str, DefaultHandler defaultHandler) throws ParserConfigurationException, SAXException, IOException {
        SAXParser sAXParserNewSAXParser = f18241.newSAXParser();
        XMLReader xMLReader = sAXParserNewSAXParser.getXMLReader();
        xMLReader.setFeature("http://xml.org/sax/features/external-general-entities", false);
        xMLReader.setFeature("http://xml.org/sax/features/external-parameter-entities", false);
        sAXParserNewSAXParser.getXMLReader().setProperty("http://xml.org/sax/properties/lexical-handler", defaultHandler);
        sAXParserNewSAXParser.parse(new InputSource(new StringReader(str)), defaultHandler);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x005b  */
    /* JADX INFO: renamed from: ֫ */
    public static Document m16113(ArrayList arrayList, byte[] bArr) throws ParserConfigurationException, IOException {
        int i;
        String str;
        String str2;
        String str3;
        boolean z;
        C23764 c23764;
        byte b;
        byte b2;
        byte b3;
        int length = bArr.length;
        String strGroup = C0233a.f1077D;
        if (length > 4) {
            byte b4 = bArr[0];
            i = 3;
            if (b4 == -17 && bArr[1] == -69 && bArr[2] == -65) {
                str2 = C0233a.f1077D;
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
                        str2 = C0233a.f1077D;
                    }
                    i = 4;
                }
                i = 2;
            }
            str = str2;
        } else {
            i = 0;
            str = null;
            str2 = C0233a.f1077D;
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
                                Matcher matcher = f18240.matcher(string);
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
                    c23764 = new C23764(str3);
                    try {
                        m16114(str3, c23764);
                        break;
                    } catch (SAXException e) {
                        if (z || !e.getMessage().contains("Content is not allowed in prolog")) {
                            arrayList.add(e.getLocalizedMessage());
                            c23764.m52806();
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
        return c23764.m52807();
    }

    /* JADX WARN: Code duplicated, block: B:84:0x018d  */
    /* JADX INFO: renamed from: ֫ */
    public static C5659 m16112(Node node) {
        String str;
        C21753 c21753 = null;
        if (node instanceof Attr) {
            Attr attr = (Attr) node;
            C21753 c21754 = (C21753) attr.getOwnerElement().getUserData("offsets");
            if (c21754 != null) {
                int iM49042 = c21754.m49042();
                int iM49043 = c21754.m49039().m49042();
                String str2 = (String) node.getOwnerDocument().getUserData("contents");
                if (str2 != null) {
                    String name = attr.getName();
                    if (attr.getPrefix() != null) {
                        str = String.format("(%1$s\\s*=\\s*((\".*?\")|('.*?')))", name);
                    } else {
                        str = String.format("[^:](%1$s\\s*=\\s*((\".*?\")|('.*?')))", name);
                    }
                    Matcher matcher = Pattern.compile(str).matcher(str2);
                    if (!matcher.find(iM49042) || matcher.start(1) > iM49043) {
                        c21753 = c21754;
                    } else {
                        int iStart = matcher.start(1);
                        int iM49040 = c21754.m49040();
                        int iM49037 = c21754.m49037();
                        for (int iM49044 = c21754.m49042(); iM49044 < iStart; iM49044++) {
                            if (str2.charAt(iM49044) == '\n') {
                                iM49040++;
                                iM49037 = 0;
                            } else {
                                iM49037++;
                            }
                        }
                        C21753 c21755 = new C21753(iM49040, iM49037, iStart);
                        c21755.m49038(new C21753(iM49040, (matcher.end(1) + iM49037) - iStart, matcher.end(1)));
                        c21753 = c21755;
                    }
                }
            } else {
                c21753 = (C21753) node.getUserData("offsets");
            }
        } else if (node instanceof Text) {
            C21753 c21756 = node.getPreviousSibling() != null ? (C21753) node.getPreviousSibling().getUserData("offsets") : null;
            if (c21756 == null) {
                c21756 = (C21753) node.getParentNode().getUserData("offsets");
            }
            if (c21756 != null) {
                int iM49045 = c21756.m49039().m49042();
                int iM49041 = c21756.m49040();
                int iM49038 = c21756.m49037();
                String str3 = (String) node.getOwnerDocument().getUserData("contents");
                if (str3 != null && str3.length() >= iM49045) {
                    boolean z = false;
                    for (int iM49046 = c21756.m49042(); iM49046 <= iM49045; iM49046++) {
                        char cCharAt = str3.charAt(iM49046);
                        if (cCharAt != '>' || z) {
                            if (cCharAt == '\"') {
                                z = !z;
                            } else if (cCharAt == '\n') {
                                iM49041++;
                                iM49038 = -1;
                            }
                            iM49038++;
                        } else {
                            int i = iM49046 + 1;
                            int i2 = iM49038 + 1;
                            if ((node instanceof CDATASection) && str3.regionMatches(i, "<![CDATA[", 0, 9)) {
                                i = iM49046 + 10;
                                i2 = iM49038 + 10;
                            }
                            String nodeValue = node.getNodeValue();
                            int length = nodeValue.length();
                            int i3 = 0;
                            int i4 = i2;
                            int i5 = iM49041;
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
                                iM49041 = i5;
                                i2 = i4;
                            }
                            int i6 = i + i3;
                            C21753 c21757 = new C21753(iM49041, i2, i6);
                            for (int i7 = length - 1; i7 >= 0; i7--) {
                                if (!Character.isWhitespace(nodeValue.charAt(i7))) {
                                    length = i7 + 1;
                                    break;
                                }
                            }
                            while (i3 < length) {
                                if (nodeValue.charAt(i3) == '\n') {
                                    iM49041++;
                                    i2 = 0;
                                } else {
                                    i2++;
                                }
                                i6++;
                                i3++;
                            }
                            c21757.m49038(new C21753(iM49041, i2, i6));
                            c21753 = c21757;
                        }
                    }
                    c21753 = c21756;
                }
            } else {
                c21753 = (C21753) node.getUserData("offsets");
            }
        } else {
            c21753 = (C21753) node.getUserData("offsets");
        }
        return c21753 == null ? C5659.f13765 : c21753.m49041();
    }
}
