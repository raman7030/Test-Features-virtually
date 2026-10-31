package l;

import android.content.res.XmlResourceParser;
import android.text.TextUtils;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.util.Stack;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: l.ۤۨۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: K50I */
/* JADX INFO: loaded from: classes3.dex */
public final class XmlResourceParserC10269 implements XmlResourceParser {

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public InterfaceC12743 f30925;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f30926;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f30927;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public int f30928;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int[] f30929;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f30930;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public int f30931;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f30933;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f30934;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C12951 f30935;

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public int f30936;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f30938;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f30939;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int[] f30940;

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public Stack f30937 = new Stack();

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public boolean f30941 = false;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C13090 f30932 = new C13090();

    @Override // android.util.AttributeSet
    public final int getAttributeListValue(int i, String[] strArr, int i2) {
        return 0;
    }

    @Override // android.util.AttributeSet
    public final int getAttributeListValue(String str, String str2, String[] strArr, int i) {
        return 0;
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final String getAttributeType(int i) {
        return "CDATA";
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final int getColumnNumber() {
        return -1;
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final boolean getFeature(String str) {
        return false;
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final String getInputEncoding() {
        return null;
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final Object getProperty(String str) {
        return null;
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final boolean isAttributeDefault(int i) {
        return false;
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final boolean isEmptyElementTag() {
        return false;
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final boolean isWhitespace() {
        return false;
    }

    public XmlResourceParserC10269() {
        m26006();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m26009(ByteArrayInputStream byteArrayInputStream, InterfaceC12743 interfaceC12743) {
        close();
        this.f30935 = new C12951(byteArrayInputStream);
        this.f30925 = interfaceC12743;
        this.f30932.m31731();
        this.f30941 = true;
    }

    @Override // android.content.res.XmlResourceParser, java.lang.AutoCloseable
    public final void close() {
        if (this.f30941) {
            this.f30937.clear();
            this.f30941 = false;
            this.f30935 = null;
            this.f30925 = null;
            this.f30929 = null;
            this.f30932.m31732();
            this.f30936 = 0;
            m26006();
        }
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final int next() {
        if (this.f30935 == null) {
            throw new XmlPullParserException("Parser is not opened.", this, null);
        }
        try {
            m26003();
            return this.f30926;
        } catch (IOException e) {
            close();
            throw e;
        }
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final int nextToken() {
        return next();
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final int nextTag() throws XmlPullParserException {
        int next = next();
        if (next == 2 || next == 3) {
            return next;
        }
        throw new XmlPullParserException("Expected start or end tag.", this, null);
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final int getDepth() {
        return this.f30932.m31728() - 1;
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final int getEventType() {
        return this.f30926;
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final String nextText() throws XmlPullParserException {
        if (this.f30926 != 2) {
            throw new XmlPullParserException("Parser must be on START_TAG to read next text.", this, null);
        }
        int next = next();
        if (next != 4) {
            if (next == 3) {
                return "";
            }
            throw new XmlPullParserException("Parser must be on START_TAG or TEXT to read text.", this, null);
        }
        String text = getText();
        if (next() == 3) {
            return text;
        }
        throw new XmlPullParserException("Event TEXT must be immediately followed by END_TAG.", this, null);
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final void require(int i, String str, String str2) throws XmlPullParserException {
        if (i != this.f30926 || ((str != null && !str.equals(getNamespace())) || (str2 != null && !str2.equals(getName())))) {
            throw new XmlPullParserException(C9045.m23341(new StringBuilder(), XmlResourceParser.TYPES[i], " is expected."), this, null);
        }
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final int getLineNumber() {
        return this.f30933;
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final String getName() {
        int i = this.f30930;
        if (i == -1) {
            return null;
        }
        int i2 = this.f30926;
        if (i2 == 2 || i2 == 3) {
            return ((AbstractC21023) this.f30925).m47858(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String m26016() {
        String prefix = getPrefix();
        if (TextUtils.isEmpty(prefix)) {
            return getName();
        }
        StringBuilder sbM19190 = C7166.m19190(prefix, ":");
        sbM19190.append(getName());
        return sbM19190.toString();
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m26019() {
        return this.f30930;
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final String getText() {
        int i = this.f30930;
        if (i == -1 || this.f30926 != 4) {
            return null;
        }
        return ((AbstractC21023) this.f30925).m47858(i);
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final char[] getTextCharacters(int[] iArr) {
        String text = getText();
        if (text == null) {
            return null;
        }
        iArr[0] = 0;
        iArr[1] = text.length();
        char[] cArr = new char[text.length()];
        text.getChars(0, text.length(), cArr, 0);
        return cArr;
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final String getNamespace() {
        int i = this.f30928;
        if (i == -1) {
            return null;
        }
        return ((AbstractC21023) this.f30925).m47858(i);
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final String getPrefix() {
        int iM31725 = this.f30932.m31725(this.f30928);
        if (iM31725 == -1) {
            return null;
        }
        return ((AbstractC21023) this.f30925).m47858(iM31725);
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int m26022() {
        return this.f30932.m31725(this.f30928);
    }

    @Override // org.xmlpull.v1.XmlPullParser, android.util.AttributeSet
    public final String getPositionDescription() {
        return "XML line #" + this.f30933;
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final int getNamespaceCount(int i) {
        return this.f30932.m31729(i);
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final String getNamespacePrefix(int i) {
        return ((AbstractC21023) this.f30925).m47858(this.f30932.m31730(i));
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int m26011(int i) {
        return this.f30932.m31730(i);
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final String getNamespaceUri(int i) {
        return ((AbstractC21023) this.f30925).m47858(this.f30932.m31733(i));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m26021(int i) {
        return this.f30932.m31733(i);
    }

    @Override // android.util.AttributeSet
    public final String getClassAttribute() {
        int i = this.f30938;
        if (i == -1) {
            return null;
        }
        return ((AbstractC21023) this.f30925).m47858(this.f30940[m26004(i) + 2]);
    }

    @Override // android.util.AttributeSet
    public final String getIdAttribute() {
        int i = this.f30934;
        if (i == -1) {
            return null;
        }
        return ((AbstractC21023) this.f30925).m47858(this.f30940[m26004(i) + 2]);
    }

    @Override // android.util.AttributeSet
    public final int getIdAttributeResourceValue(int i) {
        int i2 = this.f30934;
        if (i2 != -1) {
            int iM26004 = m26004(i2);
            int[] iArr = this.f30940;
            if (iArr[iM26004 + 3] == 1) {
                return iArr[iM26004 + 4];
            }
        }
        return i;
    }

    @Override // android.util.AttributeSet
    public final int getStyleAttribute() {
        int i = this.f30931;
        if (i == -1) {
            return 0;
        }
        return this.f30940[m26004(i) + 4];
    }

    @Override // org.xmlpull.v1.XmlPullParser, android.util.AttributeSet
    public final int getAttributeCount() {
        if (this.f30926 != 2) {
            return -1;
        }
        return this.f30940.length / 5;
    }

    @Override // android.content.res.XmlResourceParser, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet
    public final String getAttributeNamespace(int i) {
        int i2 = this.f30940[m26004(i)];
        return i2 == -1 ? "" : ((AbstractC21023) this.f30925).m47858(i2);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m26014(int i) {
        return this.f30940[m26004(i)];
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final String getAttributePrefix(int i) {
        int iM31725 = this.f30932.m31725(this.f30940[m26004(i)]);
        return iM31725 == -1 ? "" : ((AbstractC21023) this.f30925).m47858(iM31725);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m26017(int i) {
        return this.f30932.m31725(this.f30940[m26004(i)]);
    }

    @Override // org.xmlpull.v1.XmlPullParser, android.util.AttributeSet
    public final String getAttributeName(int i) {
        int i2 = this.f30940[m26004(i) + 1];
        return i2 == -1 ? "" : ((AbstractC21023) this.f30925).m47858(i2);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m26008(int i) {
        return this.f30940[m26004(i) + 1];
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final String m26013(int i) {
        return ((AbstractC21023) this.f30925).m47858(i);
    }

    @Override // android.util.AttributeSet
    public final int getAttributeNameResource(int i) {
        int i2 = this.f30940[m26004(i) + 1];
        int[] iArr = this.f30929;
        if (iArr == null || i2 < 0 || i2 >= iArr.length) {
            return 0;
        }
        return iArr[i2];
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m26007() {
        if (this.f30929 == null) {
            return -1;
        }
        int i = 0;
        while (true) {
            int[] iArr = this.f30929;
            if (i >= iArr.length) {
                return -1;
            }
            if (iArr[i] == 16842755) {
                return i;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int[] m26012() {
        return this.f30929;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int m26023(int i) {
        return this.f30940[m26004(i) + 3];
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m26020(int i) {
        return this.f30940[m26004(i) + 4];
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int m26015(int i) {
        return this.f30940[m26004(i) + 2];
    }

    @Override // org.xmlpull.v1.XmlPullParser, android.util.AttributeSet
    public final String getAttributeValue(int i) {
        int iM26004 = m26004(i);
        int[] iArr = this.f30940;
        if (iArr[iM26004 + 3] != 3) {
            return "";
        }
        return ((AbstractC21023) this.f30925).m47858(iArr[iM26004 + 2]);
    }

    @Override // android.util.AttributeSet
    public final boolean getAttributeBooleanValue(int i, boolean z) {
        return getAttributeIntValue(i, z ? 1 : 0) != 0;
    }

    @Override // android.util.AttributeSet
    public final float getAttributeFloatValue(int i, float f) {
        int iM26004 = m26004(i);
        int[] iArr = this.f30940;
        return iArr[iM26004 + 3] == 4 ? Float.intBitsToFloat(iArr[iM26004 + 4]) : f;
    }

    @Override // android.util.AttributeSet
    public final int getAttributeIntValue(int i, int i2) {
        int iM26004 = m26004(i);
        int[] iArr = this.f30940;
        int i3 = iArr[iM26004 + 3];
        return (i3 < 16 || i3 > 31) ? i2 : iArr[iM26004 + 4];
    }

    @Override // android.util.AttributeSet
    public final int getAttributeUnsignedIntValue(int i, int i2) {
        return getAttributeIntValue(i, i2);
    }

    @Override // android.util.AttributeSet
    public final int getAttributeResourceValue(int i, int i2) {
        int iM26004 = m26004(i);
        int[] iArr = this.f30940;
        return iArr[iM26004 + 3] == 1 ? iArr[iM26004 + 4] : i2;
    }

    @Override // org.xmlpull.v1.XmlPullParser, android.util.AttributeSet
    public final String getAttributeValue(String str, String str2) {
        int iM26002 = m26002(str, str2);
        if (iM26002 == -1) {
            return null;
        }
        return getAttributeValue(iM26002);
    }

    @Override // android.util.AttributeSet
    public final boolean getAttributeBooleanValue(String str, String str2, boolean z) {
        int iM26002 = m26002(str, str2);
        return iM26002 == -1 ? z : getAttributeBooleanValue(iM26002, z);
    }

    @Override // android.util.AttributeSet
    public final float getAttributeFloatValue(String str, String str2, float f) {
        int iM26002 = m26002(str, str2);
        return iM26002 == -1 ? f : getAttributeFloatValue(iM26002, f);
    }

    @Override // android.util.AttributeSet
    public final int getAttributeIntValue(String str, String str2, int i) {
        int iM26002 = m26002(str, str2);
        return iM26002 == -1 ? i : getAttributeIntValue(iM26002, i);
    }

    @Override // android.util.AttributeSet
    public final int getAttributeUnsignedIntValue(String str, String str2, int i) {
        int iM26002 = m26002(str, str2);
        return iM26002 == -1 ? i : getAttributeIntValue(iM26002, i);
    }

    @Override // android.util.AttributeSet
    public final int getAttributeResourceValue(String str, String str2, int i) {
        int iM26002 = m26002(str, str2);
        return iM26002 == -1 ? i : getAttributeResourceValue(iM26002, i);
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final void setInput(InputStream inputStream, String str) throws XmlPullParserException {
        throw new XmlPullParserException("Method is not supported.");
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final void setInput(Reader reader) throws XmlPullParserException {
        throw new XmlPullParserException("Method is not supported.");
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final void defineEntityReplacementText(String str, String str2) throws XmlPullParserException {
        throw new XmlPullParserException("Method is not supported.");
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final String getNamespace(String str) {
        throw new RuntimeException("Method is not supported.");
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final void setProperty(String str, Object obj) throws XmlPullParserException {
        throw new XmlPullParserException("Method is not supported.");
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final void setFeature(String str, boolean z) throws XmlPullParserException {
        throw new XmlPullParserException("Method is not supported.");
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final InterfaceC12743 m26010() {
        return this.f30925;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C13260 m26018() {
        InterfaceC12743 interfaceC12743 = this.f30925;
        if (interfaceC12743 == null) {
            throw new RuntimeException();
        }
        if (interfaceC12743 instanceof C13260) {
            return (C13260) interfaceC12743;
        }
        C13260 c13260M32176 = C13260.m32176(interfaceC12743);
        this.f30925 = c13260M32176;
        return c13260M32176;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    private final int m26004(int i) {
        if (this.f30926 != 2) {
            throw new IndexOutOfBoundsException("Current event is not START_TAG.");
        }
        int i2 = i * 5;
        if (i2 < this.f30940.length) {
            return i2;
        }
        throw new IndexOutOfBoundsException(C18307.m42645(i, "Invalid attribute index (", ")."));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private final int m26002(String str, String str2) {
        int iM47854;
        InterfaceC12743 interfaceC12743 = this.f30925;
        if (interfaceC12743 == null || str2 == null || (iM47854 = ((AbstractC21023) interfaceC12743).m47854(str2)) == -1) {
            return -1;
        }
        int iM47855 = str != null ? ((AbstractC21023) this.f30925).m47854(str) : -1;
        int i = 0;
        while (true) {
            int[] iArr = this.f30940;
            if (i == iArr.length) {
                return -1;
            }
            if (iM47854 == iArr[i + 1] && (iM47855 == -1 || iM47855 == iArr[i])) {
                break;
            }
            i += 5;
        }
        return i / 5;
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    private final void m26006() {
        this.f30926 = -1;
        this.f30933 = -1;
        this.f30930 = -1;
        this.f30928 = -1;
        this.f30940 = null;
        this.f30934 = -1;
        this.f30938 = -1;
        this.f30931 = -1;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private void m26005() throws IOException {
        C1993 c1993M6525 = C1993.m6525(this.f30935);
        int i = c1993M6525.f6673;
        int i2 = c1993M6525.f6674;
        int i3 = i - i2;
        if (i3 % 4 == 0) {
            this.f30935.seek(c1993M6525.f6675 + i2);
            C12951 c12951 = this.f30935;
            int i4 = i3 / 4;
            c12951.getClass();
            int[] iArr = new int[i4];
            for (int i5 = 0; i5 < i4; i5++) {
                iArr[i5] = c12951.readInt();
            }
            this.f30929 = iArr;
            c1993M6525.m6527(this.f30935);
            return;
        }
        throw new IOException("Invalid resource ids size.");
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    private void m26003() throws IOException {
        short s;
        int i;
        InterfaceC12743 interfaceC12743 = this.f30925;
        short s2 = 384;
        C13090 c13090 = this.f30932;
        if (interfaceC12743 == null) {
            C1993.m6525(this.f30935).m6526(3);
            if (this.f30935.m31501() == 384) {
                m26005();
            }
            this.f30925 = C9425.m24255(this.f30935);
            c13090.m31731();
            this.f30941 = true;
        }
        int i2 = this.f30926;
        if (i2 == 1) {
            return;
        }
        m26006();
        while (true) {
            int i3 = 0;
            if (this.f30927) {
                this.f30927 = false;
                c13090.m31726();
            }
            if (i2 == 3 && this.f30936 == 0) {
                this.f30926 = 1;
                return;
            }
            long jAvailable = this.f30935.available();
            Stack stack = this.f30937;
            if (jAvailable < 8) {
                if (stack.isEmpty()) {
                    this.f30926 = 1;
                    return;
                }
                C12385 c12385 = (C12385) stack.pop();
                this.f30928 = c12385.f37152;
                this.f30930 = c12385.f37151;
                this.f30926 = 3;
                this.f30927 = true;
                this.f30936--;
                return;
            }
            C1993 c1993M6525 = C1993.m6525(this.f30935);
            int i4 = c1993M6525.f6675;
            short s3 = c1993M6525.f6676;
            if (s3 == s2) {
                this.f30935.seek(i4);
                m26005();
            } else {
                if (s3 == 258 && i2 == -1) {
                    this.f30926 = 0;
                    this.f30935.seek(i4);
                    return;
                }
                int i5 = this.f30935.readInt();
                this.f30935.seek(i4 + c1993M6525.f6674);
                while (true) {
                    s = c1993M6525.f6676;
                    if (s >= 256 && s <= 260) {
                        break;
                    }
                    int i6 = c1993M6525.f6673;
                    int i7 = 16;
                    if (i6 > 16) {
                        i7 = ((4 - (i6 % 4)) % 4) + i6;
                    }
                    this.f30935.seek(c1993M6525.f6675 + i7);
                    c1993M6525 = C1993.m6525(this.f30935);
                    i5 = this.f30935.readInt();
                    this.f30935.skipBytes(4);
                    s2 = 384;
                }
                if (s == 256) {
                    c13090.m31727(this.f30935.readInt(), this.f30935.readInt());
                    c1993M6525.m6527(this.f30935);
                } else if (s == 257) {
                    this.f30935.skipBytes(4);
                    this.f30935.skipBytes(4);
                    c13090.m31734();
                    c1993M6525.m6527(this.f30935);
                } else {
                    this.f30933 = i5;
                    if (s != 258) {
                        if (s != 259) {
                            this.f30930 = this.f30935.readInt();
                            this.f30935.skipBytes(4);
                            this.f30935.skipBytes(4);
                            this.f30926 = 4;
                            c1993M6525.m6527(this.f30935);
                            return;
                        }
                        stack.pop();
                        this.f30928 = this.f30935.readInt();
                        this.f30930 = this.f30935.readInt();
                        this.f30926 = 3;
                        this.f30927 = true;
                        this.f30936--;
                        c1993M6525.m6527(this.f30935);
                        return;
                    }
                    this.f30928 = this.f30935.readInt();
                    int i8 = this.f30935.readInt();
                    this.f30930 = i8;
                    stack.push(new C12385(this.f30928, i8));
                    int iM31494 = this.f30935.m31494();
                    int iM31495 = this.f30935.m31494();
                    int i9 = this.f30935.readInt();
                    this.f30934 = (i9 >>> 16) - 1;
                    int i10 = i9 & 65535;
                    int i11 = this.f30935.readInt();
                    this.f30931 = (i11 >>> 16) - 1;
                    this.f30938 = (65535 & i11) - 1;
                    if (iM31494 > 20) {
                        this.f30935.skipBytes(iM31494 - 20);
                    }
                    this.f30939 = this.f30935.m31488();
                    if (iM31495 <= 20) {
                        C12951 c12951 = this.f30935;
                        int i12 = i10 * 5;
                        c12951.getClass();
                        int[] iArr = new int[i12];
                        for (int i13 = 0; i13 < i12; i13++) {
                            iArr[i13] = c12951.readInt();
                        }
                        this.f30940 = iArr;
                    } else {
                        this.f30940 = new int[i10 * 5];
                        int i14 = 0;
                        while (i10 > 0) {
                            int i15 = 0;
                            while (i15 < 5) {
                                this.f30940[i14] = this.f30935.readInt();
                                i15++;
                                i14++;
                            }
                            this.f30935.skipBytes(iM31495 - 20);
                            i10--;
                        }
                    }
                    while (true) {
                        int[] iArr2 = this.f30940;
                        if (i3 >= iArr2.length) {
                            c13090.m31731();
                            this.f30926 = 2;
                            this.f30936++;
                            c1993M6525.m6527(this.f30935);
                            return;
                        }
                        int i16 = i3 + 3;
                        int i17 = iArr2[i16] >>> 24;
                        iArr2[i16] = i17;
                        if (i17 == 3) {
                            int i18 = i3 + 2;
                            if (iArr2[i18] == -1 && (i = iArr2[i3 + 4]) >= 0 && i < this.f30925.size()) {
                                this.f30940[i18] = i;
                            }
                        }
                        i3 += 5;
                    }
                }
            }
        }
    }
}
