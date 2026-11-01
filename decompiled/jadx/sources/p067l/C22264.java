package p067l;

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
public final class C22264 {

    /* JADX INFO: renamed from: ۧ */
    public static ErrorHandler f70380 = new C8261();

    /* JADX INFO: renamed from: ֫ */
    public final C11535 f70381;

    public C22264(C11535 c11535) {
        this.f70381 = c11535;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m50086(StringReader stringReader, C15636 c15636) throws IOException {
        AbstractC4158 abstractC4158M36981 = C16227.m36981(stringReader);
        c15636.f44743 += abstractC4158M36981.mo8433();
        if (!c15636.f44744) {
            boolean z = abstractC4158M36981 instanceof C24945;
            if (!z && c15636.f44745.lastIndexOf("\n") != c15636.f44745.length() - 1 && c15636.f44745.lastIndexOf("\r") != c15636.f44745.length() - 1) {
                c15636.f44745.append("\n");
            }
            if (!z) {
                int i = c15636.f44743;
                final StringBuilder sb = c15636.f44745;
                C15487.range(0, i).forEach(new IntConsumer() { // from class: l.ۤܿۡ
                    @Override // java.util.function.IntConsumer
                    public final void accept(int i2) {
                        sb.append(this.f34311.f70381.m26593());
                    }

                    public /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
                        return C11309.$default$andThen(this, intConsumer);
                    }
                });
            }
        }
        if (abstractC4158M36981 instanceof C8852) {
            final StringBuilder sb2 = new StringBuilder(30);
            C15487.range(0, c15636.f44743).forEach(new IntConsumer() { // from class: l.ۤܿۡ
                @Override // java.util.function.IntConsumer
                public final void accept(int i2) {
                    sb2.append(this.f34311.f70381.m26593());
                }

                public /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
                    return C11309.$default$andThen(this, intConsumer);
                }
            });
            StringBuilder sb3 = c15636.f44745;
            String strM8435 = abstractC4158M36981.m8435();
            String string = sb2.toString();
            if (!strM8435.startsWith("</") && !strM8435.startsWith("<%") && !strM8435.startsWith("<?") && !strM8435.startsWith("<[")) {
                try {
                    strM8435 = new C6170(this.f70381).m13975(new C20923().m47227(strM8435), string);
                } catch (C17568 unused) {
                }
            }
            sb3.append(strM8435);
        } else {
            c15636.f44745.append(abstractC4158M36981.m8435());
        }
        c15636.f44743 += abstractC4158M36981.mo8431();
        c15636.f44744 = abstractC4158M36981.mo8434();
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m50088(String str) {
        StringReader stringReader;
        C15636 c15636;
        try {
            SAXParserFactory sAXParserFactoryNewInstance = SAXParserFactory.newInstance();
            sAXParserFactoryNewInstance.setValidating(false);
            sAXParserFactoryNewInstance.setNamespaceAware(true);
            XMLReader xMLReader = sAXParserFactoryNewInstance.newSAXParser().getXMLReader();
            xMLReader.setErrorHandler(f70380);
            xMLReader.parse(new InputSource(new StringReader(str)));
            while (true) {
                try {
                    stringReader.mark(1);
                    int i = stringReader.read();
                    stringReader.reset();
                    if (i == -1) {
                        break;
                    }
                    m50086(stringReader, c15636);
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
        c15636 = new C15636();
        stringReader.close();
        return c15636.f44745.toString();
    }
}
