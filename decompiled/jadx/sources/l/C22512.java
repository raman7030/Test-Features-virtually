package l;

import java.util.ArrayList;
import org.w3c.dom.Attr;
import org.w3c.dom.Comment;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.xml.sax.Attributes;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;
import org.xml.sax.ext.DefaultHandler2;

/* JADX INFO: renamed from: l.᩹᩶ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: UBKB */
/* JADX INFO: loaded from: classes.dex */
public final class C22512 extends DefaultHandler2 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final Document f72836;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f72837;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final String f72838;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public Locator f72841;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f72843;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f72844;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f72842 = 0;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final ArrayList f72839 = new ArrayList();

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final StringBuilder f72840 = new StringBuilder();

    public C22512(String str) {
        this.f72838 = str;
        Document documentNewDocument = C4873.f15408.newDocumentBuilder().newDocument();
        this.f72836 = documentNewDocument;
        documentNewDocument.setUserData("contents", str, null);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Document m50465() {
        m50464();
        return this.f72836;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m50464() {
        m50462();
        while (true) {
            ArrayList arrayList = this.f72839;
            if (arrayList.isEmpty()) {
                return;
            }
            Element element = (Element) C4248.m12790(arrayList, 1);
            ((C20396) element.getUserData("offsets")).m46715(m50463());
            m50461(element);
        }
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void setDocumentLocator(Locator locator) {
        this.f72841 = locator;
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void startElement(String str, String str2, String str3, Attributes attributes) throws SAXException {
        Document document = this.f72836;
        try {
            m50462();
            Element elementCreateElementNS = document.createElementNS(str, str3);
            for (int i = 0; i < attributes.getLength(); i++) {
                if (attributes.getURI(i) != null && !attributes.getURI(i).isEmpty()) {
                    Attr attrCreateAttributeNS = document.createAttributeNS(attributes.getURI(i), attributes.getQName(i));
                    attrCreateAttributeNS.setValue(attributes.getValue(i));
                    elementCreateElementNS.setAttributeNodeNS(attrCreateAttributeNS);
                } else {
                    Attr attrCreateAttribute = document.createAttribute(attributes.getQName(i));
                    attrCreateAttribute.setValue(attributes.getValue(i));
                    elementCreateElementNS.setAttributeNode(attrCreateAttribute);
                }
            }
            elementCreateElementNS.setUserData("offsets", m50460(m50463()), null);
            this.f72839.add(elementCreateElementNS);
        } catch (Exception e) {
            throw new SAXException(e);
        }
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void endElement(String str, String str2, String str3) {
        m50462();
        Element element = (Element) C4248.m12790(this.f72839, 1);
        ((C20396) element.getUserData("offsets")).m46715(m50463());
        m50461(element);
    }

    @Override // org.xml.sax.ext.DefaultHandler2, org.xml.sax.ext.LexicalHandler
    public final void comment(char[] cArr, int i, int i2) {
        m50462();
        Comment commentCreateComment = this.f72836.createComment(new String(cArr, i, i2));
        C20396 c20396M50463 = m50463();
        C20396 c20396M50460 = m50460(c20396M50463);
        c20396M50460.m46715(c20396M50463);
        commentCreateComment.setUserData("offsets", c20396M50460, null);
        m50461(commentCreateComment);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m50461(Node node) {
        ArrayList arrayList = this.f72839;
        if (arrayList.isEmpty()) {
            this.f72836.appendChild(node);
        } else {
            ((Element) C18566.m43105(arrayList, 1)).appendChild(node);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C20396 m50460(C20396 c20396) {
        String str;
        int iM46719 = c20396.m46719();
        do {
            iM46719--;
            if (iM46719 < 0) {
                return c20396;
            }
            str = this.f72838;
        } while (str.charAt(iM46719) != '<');
        int iM46717 = c20396.m46717();
        int iM467110 = c20396.m46719();
        for (int i = iM46719; i < iM467110; i++) {
            if (str.charAt(i) == '\n') {
                iM46717--;
            }
        }
        int i2 = iM46719 - 1;
        int i3 = 0;
        while (i2 >= 0 && str.charAt(i2) != '\n') {
            i2--;
            i3++;
        }
        return new C20396(iM46717, i3, iM46719);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private C20396 m50463() {
        int i;
        int i2;
        int lineNumber = this.f72841.getLineNumber() - 1;
        int columnNumber = this.f72841.getColumnNumber() - 1;
        String str = this.f72838;
        int length = str.length();
        while (this.f72842 < lineNumber && (i = this.f72837) < length) {
            char cCharAt = str.charAt(i);
            if (cCharAt != '\r' || (i2 = this.f72837) >= length - 1) {
                if (cCharAt == '\n') {
                    this.f72842++;
                    this.f72844 = 0;
                } else {
                    this.f72844++;
                }
            } else if (str.charAt(i2 + 1) != '\n') {
                this.f72842++;
                this.f72844 = 0;
            }
            this.f72837++;
        }
        for (int i3 = this.f72844; i3 < columnNumber; i3++) {
            int i4 = this.f72837;
            if (i4 == length || str.charAt(i4) == '\n') {
                break;
            }
            this.f72837++;
        }
        if (this.f72837 >= length) {
            this.f72837 = length;
        }
        this.f72844 = columnNumber;
        return new C20396(this.f72842, columnNumber, this.f72837);
    }

    @Override // org.xml.sax.ext.DefaultHandler2, org.xml.sax.ext.LexicalHandler
    public final void startCDATA() {
        m50462();
        this.f72843 = true;
    }

    @Override // org.xml.sax.ext.DefaultHandler2, org.xml.sax.ext.LexicalHandler
    public final void endCDATA() {
        m50462();
        this.f72843 = false;
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void characters(char[] cArr, int i, int i2) {
        this.f72840.append(cArr, i, i2);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m50462() {
        StringBuilder sb = this.f72840;
        if (sb.length() > 0 || this.f72843) {
            ArrayList arrayList = this.f72839;
            if (arrayList.isEmpty()) {
                return;
            }
            Element element = (Element) C18566.m43105(arrayList, 1);
            boolean z = this.f72843;
            Document document = this.f72836;
            element.appendChild(z ? document.createCDATASection(sb.toString()) : document.createTextNode(sb.toString()));
            sb.setLength(0);
        }
    }
}
