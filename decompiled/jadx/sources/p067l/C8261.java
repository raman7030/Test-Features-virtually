package p067l;

import org.xml.sax.ErrorHandler;
import org.xml.sax.SAXParseException;

/* JADX INFO: renamed from: l.ۛܿۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: TBJG */
/* JADX INFO: loaded from: classes2.dex */
public final class C8261 implements ErrorHandler {
    @Override // org.xml.sax.ErrorHandler
    public final void warning(SAXParseException sAXParseException) {
    }

    @Override // org.xml.sax.ErrorHandler
    public final void error(SAXParseException sAXParseException) throws SAXParseException {
        throw sAXParseException;
    }

    @Override // org.xml.sax.ErrorHandler
    public final void fatalError(SAXParseException sAXParseException) throws SAXParseException {
        throw sAXParseException;
    }
}
