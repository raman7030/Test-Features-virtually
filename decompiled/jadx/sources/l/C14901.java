package l;

import org.xml.sax.Attributes;
import org.xml.sax.ext.DefaultHandler2;

/* JADX INFO: renamed from: l.ܶ֨ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: KB7N */
/* JADX INFO: loaded from: classes4.dex */
public final class C14901 extends DefaultHandler2 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2908 f45459;

    public C14901(C2908 c2908) {
        this.f45459 = c2908;
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void startDocument() {
        C2908.m8858(this.f45459);
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void startElement(String str, String str2, String str3, Attributes attributes) throws C19136 {
        this.f45459.m8855(str, str2, str3, attributes);
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void characters(char[] cArr, int i, int i2) {
        this.f45459.m8883(new String(cArr, i, i2));
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void endElement(String str, String str2, String str3) {
        this.f45459.m8854(str, str2, str3);
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void endDocument() {
        this.f45459.getClass();
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void processingInstruction(String str, String str2) {
        C2908.m8884(new C19842(str2));
        str.equals("xml-stylesheet");
    }
}
