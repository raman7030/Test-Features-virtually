package p067l;

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
public final class C23764 extends DefaultHandler2 {

    /* JADX INFO: renamed from: ۗ */
    public final Document f75562;

    /* JADX INFO: renamed from: ۙ */
    public int f75563;

    /* JADX INFO: renamed from: ۛ */
    public final String f75564;

    /* JADX INFO: renamed from: ۬ */
    public Locator f75567;

    /* JADX INFO: renamed from: ᩸ */
    public boolean f75569;

    /* JADX INFO: renamed from: ᩹ */
    public int f75570;

    /* JADX INFO: renamed from: ᩶ */
    public int f75568 = 0;

    /* JADX INFO: renamed from: ۤ */
    public final ArrayList f75565 = new ArrayList();

    /* JADX INFO: renamed from: ۫ */
    public final StringBuilder f75566 = new StringBuilder();

    public C23764(String str) {
        this.f75564 = str;
        Document documentNewDocument = C7000.f18239.newDocumentBuilder().newDocument();
        this.f75562 = documentNewDocument;
        documentNewDocument.setUserData("contents", str, null);
    }

    /* JADX INFO: renamed from: ۧ */
    public final Document m52807() {
        m52806();
        return this.f75562;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m52806() {
        m52804();
        while (true) {
            ArrayList arrayList = this.f75565;
            if (arrayList.isEmpty()) {
                return;
            }
            Element element = (Element) C6406.m14670(arrayList, 1);
            ((C21753) element.getUserData("offsets")).m49038(m52805());
            m52803(element);
        }
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void setDocumentLocator(Locator locator) {
        this.f75567 = locator;
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void startElement(String str, String str2, String str3, Attributes attributes) throws SAXException {
        Document document = this.f75562;
        try {
            m52804();
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
            elementCreateElementNS.setUserData("offsets", m52802(m52805()), null);
            this.f75565.add(elementCreateElementNS);
        } catch (Exception e) {
            throw new SAXException(e);
        }
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void endElement(String str, String str2, String str3) {
        m52804();
        Element element = (Element) C6406.m14670(this.f75565, 1);
        ((C21753) element.getUserData("offsets")).m49038(m52805());
        m52803(element);
    }

    @Override // org.xml.sax.ext.DefaultHandler2, org.xml.sax.ext.LexicalHandler
    public final void comment(char[] cArr, int i, int i2) {
        m52804();
        Comment commentCreateComment = this.f75562.createComment(new String(cArr, i, i2));
        C21753 c21753M52805 = m52805();
        C21753 c21753M52802 = m52802(c21753M52805);
        c21753M52802.m49038(c21753M52805);
        commentCreateComment.setUserData("offsets", c21753M52802, null);
        m52803(commentCreateComment);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m52803(Node node) {
        ArrayList arrayList = this.f75565;
        if (arrayList.isEmpty()) {
            this.f75562.appendChild(node);
        } else {
            ((Element) C20013.m45383(arrayList, 1)).appendChild(node);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private C21753 m52802(C21753 c21753) {
        String str;
        int iM49042 = c21753.m49042();
        do {
            iM49042--;
            if (iM49042 < 0) {
                return c21753;
            }
            str = this.f75564;
        } while (str.charAt(iM49042) != '<');
        int iM49040 = c21753.m49040();
        int iM49043 = c21753.m49042();
        for (int i = iM49042; i < iM49043; i++) {
            if (str.charAt(i) == '\n') {
                iM49040--;
            }
        }
        int i2 = iM49042 - 1;
        int i3 = 0;
        while (i2 >= 0 && str.charAt(i2) != '\n') {
            i2--;
            i3++;
        }
        return new C21753(iM49040, i3, iM49042);
    }

    /* JADX INFO: renamed from: ᩳ */
    private C21753 m52805() {
        int i;
        int i2;
        int lineNumber = this.f75567.getLineNumber() - 1;
        int columnNumber = this.f75567.getColumnNumber() - 1;
        String str = this.f75564;
        int length = str.length();
        while (this.f75568 < lineNumber && (i = this.f75563) < length) {
            char cCharAt = str.charAt(i);
            if (cCharAt != '\r' || (i2 = this.f75563) >= length - 1) {
                if (cCharAt == '\n') {
                    this.f75568++;
                    this.f75570 = 0;
                } else {
                    this.f75570++;
                }
            } else if (str.charAt(i2 + 1) != '\n') {
                this.f75568++;
                this.f75570 = 0;
            }
            this.f75563++;
        }
        for (int i3 = this.f75570; i3 < columnNumber; i3++) {
            int i4 = this.f75563;
            if (i4 == length || str.charAt(i4) == '\n') {
                break;
            }
            this.f75563++;
        }
        if (this.f75563 >= length) {
            this.f75563 = length;
        }
        this.f75570 = columnNumber;
        return new C21753(this.f75568, columnNumber, this.f75563);
    }

    @Override // org.xml.sax.ext.DefaultHandler2, org.xml.sax.ext.LexicalHandler
    public final void startCDATA() {
        m52804();
        this.f75569 = true;
    }

    @Override // org.xml.sax.ext.DefaultHandler2, org.xml.sax.ext.LexicalHandler
    public final void endCDATA() {
        m52804();
        this.f75569 = false;
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void characters(char[] cArr, int i, int i2) {
        this.f75566.append(cArr, i, i2);
    }

    /* JADX INFO: renamed from: ܽ */
    private void m52804() {
        StringBuilder sb = this.f75566;
        if (sb.length() > 0 || this.f75569) {
            ArrayList arrayList = this.f75565;
            if (arrayList.isEmpty()) {
                return;
            }
            Element element = (Element) C20013.m45383(arrayList, 1);
            boolean z = this.f75569;
            Document document = this.f75562;
            element.appendChild(z ? document.createCDATASection(sb.toString()) : document.createTextNode(sb.toString()));
            sb.setLength(0);
        }
    }
}
