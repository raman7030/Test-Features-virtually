package l;

import java.io.IOException;
import java.io.StringReader;
import java.util.function.IntConsumer;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.ErrorHandler;
import org.xml.sax.InputSource;
import org.xml.sax.SAXParseException;
import org.xml.sax.XMLReader;

/* JADX INFO: renamed from: l.᩷ܳۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: TBJG */
/* JADX INFO: loaded from: classes4.dex */
public final class C20934 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static ErrorHandler f67695 = new C6200();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C9645 f67696;

    public C20934(C9645 c9645) {
        this.f67696 = c9645;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m47756(StringReader stringReader, C13960 c13960) throws IOException {
        AbstractC1883 abstractC1883M34830 = C14582.m34830(stringReader);
        c13960.f41663 += abstractC1883M34830.mo6231();
        if (!c13960.f41664) {
            boolean z = abstractC1883M34830 instanceof C23755;
            if (!z && c13960.f41665.lastIndexOf("\n") != c13960.f41665.length() - 1 && c13960.f41665.lastIndexOf("\r") != c13960.f41665.length() - 1) {
                c13960.f41665.append("\n");
            }
            if (!z) {
                int i = c13960.f41663;
                final StringBuilder sb = c13960.f41665;
                C13803.range(0, i).forEach(new IntConsumer() { // from class: l.ۤܿۡ
                    @Override // java.util.function.IntConsumer
                    public final void accept(int i2) {
                        sb.append(this.f31347.f67696.m24579());
                    }

                    public /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
                        return C9407.$default$andThen(this, intConsumer);
                    }
                });
            }
        }
        if (abstractC1883M34830 instanceof C6822) {
            final StringBuilder sb2 = new StringBuilder(30);
            C13803.range(0, c13960.f41663).forEach(new IntConsumer() { // from class: l.ۤܿۡ
                @Override // java.util.function.IntConsumer
                public final void accept(int i2) {
                    sb2.append(this.f31347.f67696.m24579());
                }

                public /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
                    return C9407.$default$andThen(this, intConsumer);
                }
            });
            StringBuilder sb3 = c13960.f41665;
            String strM6233 = abstractC1883M34830.m6233();
            String string = sb2.toString();
            if (!strM6233.startsWith("</") && !strM6233.startsWith("<%") && !strM6233.startsWith("<?") && !strM6233.startsWith("<[")) {
                try {
                    strM6233 = new C4000(this.f67696).m12055(new C19523().m44929(strM6233), string);
                } catch (C15993 unused) {
                }
            }
            sb3.append(strM6233);
        } else {
            c13960.f41665.append(abstractC1883M34830.m6233());
        }
        c13960.f41663 += abstractC1883M34830.mo6229();
        c13960.f41664 = abstractC1883M34830.mo6232();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m47758(String str) {
        StringReader stringReader;
        C13960 c13960;
        try {
            SAXParserFactory sAXParserFactoryNewInstance = SAXParserFactory.newInstance();
            sAXParserFactoryNewInstance.setValidating(false);
            sAXParserFactoryNewInstance.setNamespaceAware(true);
            XMLReader xMLReader = sAXParserFactoryNewInstance.newSAXParser().getXMLReader();
            xMLReader.setErrorHandler(f67695);
            xMLReader.parse(new InputSource(new StringReader(str)));
            while (true) {
                try {
                    stringReader.mark(1);
                    int i = stringReader.read();
                    stringReader.reset();
                    if (i == -1) {
                        break;
                    }
                    m47756(stringReader, c13960);
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            }
        } catch (Exception e2) {
            if (e2 instanceof SAXParseException) {
                System.err.println("WARN: " + e2.getMessage());
            } else {
                throw new IllegalArgumentException(e2);
            }
        }
        stringReader = new StringReader(str);
        c13960 = new C13960();
        stringReader.close();
        return c13960.f41665.toString();
    }
}
