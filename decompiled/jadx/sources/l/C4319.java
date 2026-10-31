package l;

import org.xml.sax.Attributes;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: renamed from: l.ۙ֨ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: KB7N */
/* JADX INFO: loaded from: classes2.dex */
public final class C4319 implements Attributes {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public XmlPullParser f13909;

    @Override // org.xml.sax.Attributes
    public final int getIndex(String str) {
        return -1;
    }

    @Override // org.xml.sax.Attributes
    public final int getIndex(String str, String str2) {
        return -1;
    }

    @Override // org.xml.sax.Attributes
    public final String getType(int i) {
        return null;
    }

    @Override // org.xml.sax.Attributes
    public final String getType(String str) {
        return null;
    }

    @Override // org.xml.sax.Attributes
    public final String getType(String str, String str2) {
        return null;
    }

    @Override // org.xml.sax.Attributes
    public final String getValue(String str) {
        return null;
    }

    @Override // org.xml.sax.Attributes
    public final String getValue(String str, String str2) {
        return null;
    }

    public C4319(XmlPullParser xmlPullParser) {
        this.f13909 = xmlPullParser;
    }

    @Override // org.xml.sax.Attributes
    public final int getLength() {
        return this.f13909.getAttributeCount();
    }

    @Override // org.xml.sax.Attributes
    public final String getURI(int i) {
        return this.f13909.getAttributeNamespace(i);
    }

    @Override // org.xml.sax.Attributes
    public final String getLocalName(int i) {
        return this.f13909.getAttributeName(i);
    }

    @Override // org.xml.sax.Attributes
    public final String getQName(int i) {
        XmlPullParser xmlPullParser = this.f13909;
        String attributeName = xmlPullParser.getAttributeName(i);
        if (xmlPullParser.getAttributePrefix(i) == null) {
            return attributeName;
        }
        return xmlPullParser.getAttributePrefix(i) + ':' + attributeName;
    }

    @Override // org.xml.sax.Attributes
    public final String getValue(int i) {
        return this.f13909.getAttributeValue(i);
    }
}
