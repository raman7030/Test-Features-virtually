package p067l;

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
public final class XmlResourceParserC12128 implements XmlResourceParser {

    /* JADX INFO: renamed from: ֫֫ */
    public InterfaceC14480 f33889;

    /* JADX INFO: renamed from: ۗ */
    public int f33890;

    /* JADX INFO: renamed from: ۙ */
    public boolean f33891;

    /* JADX INFO: renamed from: ۛ */
    public int f33892;

    /* JADX INFO: renamed from: ۟ */
    public int[] f33893;

    /* JADX INFO: renamed from: ۤ */
    public int f33894;

    /* JADX INFO: renamed from: ۧ֫ */
    public int f33895;

    /* JADX INFO: renamed from: ۫ */
    public int f33897;

    /* JADX INFO: renamed from: ۬ */
    public int f33898;

    /* JADX INFO: renamed from: ܰ */
    public C14677 f33899;

    /* JADX INFO: renamed from: ܽ֫ */
    public int f33900;

    /* JADX INFO: renamed from: ᩶ */
    public int f33902;

    /* JADX INFO: renamed from: ᩸ */
    public int f33903;

    /* JADX INFO: renamed from: ᩹ */
    public int[] f33904;

    /* JADX INFO: renamed from: ᩳ֫ */
    public Stack f33901 = new Stack();

    /* JADX INFO: renamed from: ᩺ */
    public boolean f33905 = false;

    /* JADX INFO: renamed from: ۨ */
    public C14809 f33896 = new C14809();

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

    public XmlResourceParserC12128() {
        m28028();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m28031(ByteArrayInputStream byteArrayInputStream, InterfaceC14480 interfaceC14480) {
        close();
        this.f33899 = new C14677(byteArrayInputStream);
        this.f33889 = interfaceC14480;
        this.f33896.m33821();
        this.f33905 = true;
    }

    @Override // android.content.res.XmlResourceParser, java.lang.AutoCloseable
    public final void close() {
        if (this.f33905) {
            this.f33901.clear();
            this.f33905 = false;
            this.f33899 = null;
            this.f33889 = null;
            this.f33893 = null;
            this.f33896.m33822();
            this.f33900 = 0;
            m28028();
        }
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final int next() {
        if (this.f33899 == null) {
            throw new XmlPullParserException("Parser is not opened.", this, null);
        }
        try {
            m28025();
            return this.f33890;
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
        return this.f33896.m33818() - 1;
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final int getEventType() {
        return this.f33890;
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final String nextText() throws XmlPullParserException {
        if (this.f33890 != 2) {
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
        if (i != this.f33890 || ((str != null && !str.equals(getNamespace())) || (str2 != null && !str2.equals(getName())))) {
            throw new XmlPullParserException(C10965.m25286(new StringBuilder(), XmlResourceParser.TYPES[i], " is expected."), this, null);
        }
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final int getLineNumber() {
        return this.f33897;
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final String getName() {
        int i = this.f33894;
        if (i == -1) {
            return null;
        }
        int i2 = this.f33890;
        if (i2 == 2 || i2 == 3) {
            return ((AbstractC22349) this.f33889).m50188(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ܳ */
    public final String m28038() {
        String prefix = getPrefix();
        if (TextUtils.isEmpty(prefix)) {
            return getName();
        }
        StringBuilder sbM21133 = C9179.m21133(prefix, ":");
        sbM21133.append(getName());
        return sbM21133.toString();
    }

    /* JADX INFO: renamed from: ᩳ */
    public final int m28041() {
        return this.f33894;
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final String getText() {
        int i = this.f33894;
        if (i == -1 || this.f33890 != 4) {
            return null;
        }
        return ((AbstractC22349) this.f33889).m50188(i);
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
        int i = this.f33892;
        if (i == -1) {
            return null;
        }
        return ((AbstractC22349) this.f33889).m50188(i);
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final String getPrefix() {
        int iM33815 = this.f33896.m33815(this.f33892);
        if (iM33815 == -1) {
            return null;
        }
        return ((AbstractC22349) this.f33889).m50188(iM33815);
    }

    /* JADX INFO: renamed from: ᩻ */
    public final int m28044() {
        return this.f33896.m33815(this.f33892);
    }

    @Override // org.xmlpull.v1.XmlPullParser, android.util.AttributeSet
    public final String getPositionDescription() {
        return "XML line #" + this.f33897;
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final int getNamespaceCount(int i) {
        return this.f33896.m33819(i);
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final String getNamespacePrefix(int i) {
        return ((AbstractC22349) this.f33889).m50188(this.f33896.m33820(i));
    }

    /* JADX INFO: renamed from: ۜ */
    public final int m28033(int i) {
        return this.f33896.m33820(i);
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final String getNamespaceUri(int i) {
        return ((AbstractC22349) this.f33889).m50188(this.f33896.m33823(i));
    }

    /* JADX INFO: renamed from: ᩷ */
    public final int m28043(int i) {
        return this.f33896.m33823(i);
    }

    @Override // android.util.AttributeSet
    public final String getClassAttribute() {
        int i = this.f33902;
        if (i == -1) {
            return null;
        }
        return ((AbstractC22349) this.f33889).m50188(this.f33904[m28026(i) + 2]);
    }

    @Override // android.util.AttributeSet
    public final String getIdAttribute() {
        int i = this.f33898;
        if (i == -1) {
            return null;
        }
        return ((AbstractC22349) this.f33889).m50188(this.f33904[m28026(i) + 2]);
    }

    @Override // android.util.AttributeSet
    public final int getIdAttributeResourceValue(int i) {
        int i2 = this.f33898;
        if (i2 != -1) {
            int iM28026 = m28026(i2);
            int[] iArr = this.f33904;
            if (iArr[iM28026 + 3] == 1) {
                return iArr[iM28026 + 4];
            }
        }
        return i;
    }

    @Override // android.util.AttributeSet
    public final int getStyleAttribute() {
        int i = this.f33895;
        if (i == -1) {
            return 0;
        }
        return this.f33904[m28026(i) + 4];
    }

    @Override // org.xmlpull.v1.XmlPullParser, android.util.AttributeSet
    public final int getAttributeCount() {
        if (this.f33890 != 2) {
            return -1;
        }
        return this.f33904.length / 5;
    }

    @Override // android.content.res.XmlResourceParser, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet
    public final String getAttributeNamespace(int i) {
        int i2 = this.f33904[m28026(i)];
        return i2 == -1 ? "" : ((AbstractC22349) this.f33889).m50188(i2);
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m28036(int i) {
        return this.f33904[m28026(i)];
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final String getAttributePrefix(int i) {
        int iM33815 = this.f33896.m33815(this.f33904[m28026(i)]);
        return iM33815 == -1 ? "" : ((AbstractC22349) this.f33889).m50188(iM33815);
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m28039(int i) {
        return this.f33896.m33815(this.f33904[m28026(i)]);
    }

    @Override // org.xmlpull.v1.XmlPullParser, android.util.AttributeSet
    public final String getAttributeName(int i) {
        int i2 = this.f33904[m28026(i) + 1];
        return i2 == -1 ? "" : ((AbstractC22349) this.f33889).m50188(i2);
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m28030(int i) {
        return this.f33904[m28026(i) + 1];
    }

    /* JADX INFO: renamed from: ۢ */
    public final String m28035(int i) {
        return ((AbstractC22349) this.f33889).m50188(i);
    }

    @Override // android.util.AttributeSet
    public final int getAttributeNameResource(int i) {
        int i2 = this.f33904[m28026(i) + 1];
        int[] iArr = this.f33893;
        if (iArr == null || i2 < 0 || i2 >= iArr.length) {
            return 0;
        }
        return iArr[i2];
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m28029() {
        if (this.f33893 == null) {
            return -1;
        }
        int i = 0;
        while (true) {
            int[] iArr = this.f33893;
            if (i >= iArr.length) {
                return -1;
            }
            if (iArr[i] == 16842755) {
                return i;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: ۜ */
    public final int[] m28034() {
        return this.f33893;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final int m28045(int i) {
        return this.f33904[m28026(i) + 3];
    }

    /* JADX INFO: renamed from: ᩳ */
    public final int m28042(int i) {
        return this.f33904[m28026(i) + 4];
    }

    /* JADX INFO: renamed from: ܳ */
    public final int m28037(int i) {
        return this.f33904[m28026(i) + 2];
    }

    @Override // org.xmlpull.v1.XmlPullParser, android.util.AttributeSet
    public final String getAttributeValue(int i) {
        int iM28026 = m28026(i);
        int[] iArr = this.f33904;
        if (iArr[iM28026 + 3] != 3) {
            return "";
        }
        return ((AbstractC22349) this.f33889).m50188(iArr[iM28026 + 2]);
    }

    @Override // android.util.AttributeSet
    public final boolean getAttributeBooleanValue(int i, boolean z) {
        return getAttributeIntValue(i, z ? 1 : 0) != 0;
    }

    @Override // android.util.AttributeSet
    public final float getAttributeFloatValue(int i, float f) {
        int iM28026 = m28026(i);
        int[] iArr = this.f33904;
        return iArr[iM28026 + 3] == 4 ? Float.intBitsToFloat(iArr[iM28026 + 4]) : f;
    }

    @Override // android.util.AttributeSet
    public final int getAttributeIntValue(int i, int i2) {
        int iM28026 = m28026(i);
        int[] iArr = this.f33904;
        int i3 = iArr[iM28026 + 3];
        return (i3 < 16 || i3 > 31) ? i2 : iArr[iM28026 + 4];
    }

    @Override // android.util.AttributeSet
    public final int getAttributeUnsignedIntValue(int i, int i2) {
        return getAttributeIntValue(i, i2);
    }

    @Override // android.util.AttributeSet
    public final int getAttributeResourceValue(int i, int i2) {
        int iM28026 = m28026(i);
        int[] iArr = this.f33904;
        return iArr[iM28026 + 3] == 1 ? iArr[iM28026 + 4] : i2;
    }

    @Override // org.xmlpull.v1.XmlPullParser, android.util.AttributeSet
    public final String getAttributeValue(String str, String str2) {
        int iM28024 = m28024(str, str2);
        if (iM28024 == -1) {
            return null;
        }
        return getAttributeValue(iM28024);
    }

    @Override // android.util.AttributeSet
    public final boolean getAttributeBooleanValue(String str, String str2, boolean z) {
        int iM28024 = m28024(str, str2);
        return iM28024 == -1 ? z : getAttributeBooleanValue(iM28024, z);
    }

    @Override // android.util.AttributeSet
    public final float getAttributeFloatValue(String str, String str2, float f) {
        int iM28024 = m28024(str, str2);
        return iM28024 == -1 ? f : getAttributeFloatValue(iM28024, f);
    }

    @Override // android.util.AttributeSet
    public final int getAttributeIntValue(String str, String str2, int i) {
        int iM28024 = m28024(str, str2);
        return iM28024 == -1 ? i : getAttributeIntValue(iM28024, i);
    }

    @Override // android.util.AttributeSet
    public final int getAttributeUnsignedIntValue(String str, String str2, int i) {
        int iM28024 = m28024(str, str2);
        return iM28024 == -1 ? i : getAttributeIntValue(iM28024, i);
    }

    @Override // android.util.AttributeSet
    public final int getAttributeResourceValue(String str, String str2, int i) {
        int iM28024 = m28024(str, str2);
        return iM28024 == -1 ? i : getAttributeResourceValue(iM28024, i);
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

    /* JADX INFO: renamed from: ۖ */
    public final InterfaceC14480 m28032() {
        return this.f33889;
    }

    /* JADX INFO: renamed from: ܽ */
    public final C14971 m28040() {
        InterfaceC14480 interfaceC14480 = this.f33889;
        if (interfaceC14480 == null) {
            throw new RuntimeException();
        }
        if (interfaceC14480 instanceof C14971) {
            return (C14971) interfaceC14480;
        }
        C14971 c14971M34275 = C14971.m34275(interfaceC14480);
        this.f33889 = c14971M34275;
        return c14971M34275;
    }

    /* JADX INFO: renamed from: ܺ */
    private final int m28026(int i) {
        if (this.f33890 != 2) {
            throw new IndexOutOfBoundsException("Current event is not START_TAG.");
        }
        int i2 = i * 5;
        if (i2 < this.f33904.length) {
            return i2;
        }
        throw new IndexOutOfBoundsException(C19768.m44906(i, "Invalid attribute index (", ")."));
    }

    /* JADX INFO: renamed from: ֫ */
    private final int m28024(String str, String str2) {
        int iM50184;
        InterfaceC14480 interfaceC14480 = this.f33889;
        if (interfaceC14480 == null || str2 == null || (iM50184 = ((AbstractC22349) interfaceC14480).m50184(str2)) == -1) {
            return -1;
        }
        int iM50185 = str != null ? ((AbstractC22349) this.f33889).m50184(str) : -1;
        int i = 0;
        while (true) {
            int[] iArr = this.f33904;
            if (i == iArr.length) {
                return -1;
            }
            if (iM50184 == iArr[i + 1] && (iM50185 == -1 || iM50185 == iArr[i])) {
                break;
            }
            i += 5;
        }
        return i / 5;
    }

    /* JADX INFO: renamed from: ᩵ */
    private final void m28028() {
        this.f33890 = -1;
        this.f33897 = -1;
        this.f33894 = -1;
        this.f33892 = -1;
        this.f33904 = null;
        this.f33898 = -1;
        this.f33902 = -1;
        this.f33895 = -1;
    }

    /* JADX INFO: renamed from: ᩴ */
    private void m28027() throws IOException {
        C4263 c4263M8667 = C4263.m8667(this.f33899);
        int i = c4263M8667.f9453;
        int i2 = c4263M8667.f9454;
        int i3 = i - i2;
        if (i3 % 4 == 0) {
            this.f33899.seek(c4263M8667.f9455 + i2);
            C14677 c14677 = this.f33899;
            int i4 = i3 / 4;
            c14677.getClass();
            int[] iArr = new int[i4];
            for (int i5 = 0; i5 < i4; i5++) {
                iArr[i5] = c14677.readInt();
            }
            this.f33893 = iArr;
            c4263M8667.m8669(this.f33899);
            return;
        }
        throw new IOException("Invalid resource ids size.");
    }

    /* JADX INFO: renamed from: ۘ */
    private void m28025() throws IOException {
        short s;
        int i;
        InterfaceC14480 interfaceC14480 = this.f33889;
        short s2 = 384;
        C14809 c14809 = this.f33896;
        if (interfaceC14480 == null) {
            C4263.m8667(this.f33899).m8668(3);
            if (this.f33899.m33588() == 384) {
                m28027();
            }
            this.f33889 = C11326.m26265(this.f33899);
            c14809.m33821();
            this.f33905 = true;
        }
        int i2 = this.f33890;
        if (i2 == 1) {
            return;
        }
        m28028();
        while (true) {
            int i3 = 0;
            if (this.f33891) {
                this.f33891 = false;
                c14809.m33816();
            }
            if (i2 == 3 && this.f33900 == 0) {
                this.f33890 = 1;
                return;
            }
            long jAvailable = this.f33899.available();
            Stack stack = this.f33901;
            if (jAvailable < 8) {
                if (stack.isEmpty()) {
                    this.f33890 = 1;
                    return;
                }
                C14139 c14139 = (C14139) stack.pop();
                this.f33892 = c14139.f40169;
                this.f33894 = c14139.f40168;
                this.f33890 = 3;
                this.f33891 = true;
                this.f33900--;
                return;
            }
            C4263 c4263M8667 = C4263.m8667(this.f33899);
            int i4 = c4263M8667.f9455;
            short s3 = c4263M8667.f9456;
            if (s3 == s2) {
                this.f33899.seek(i4);
                m28027();
            } else {
                if (s3 == 258 && i2 == -1) {
                    this.f33890 = 0;
                    this.f33899.seek(i4);
                    return;
                }
                int i5 = this.f33899.readInt();
                this.f33899.seek(i4 + c4263M8667.f9454);
                while (true) {
                    s = c4263M8667.f9456;
                    if (s >= 256 && s <= 260) {
                        break;
                    }
                    int i6 = c4263M8667.f9453;
                    int i7 = 16;
                    if (i6 > 16) {
                        i7 = ((4 - (i6 % 4)) % 4) + i6;
                    }
                    this.f33899.seek(c4263M8667.f9455 + i7);
                    c4263M8667 = C4263.m8667(this.f33899);
                    i5 = this.f33899.readInt();
                    this.f33899.skipBytes(4);
                    s2 = 384;
                }
                if (s == 256) {
                    c14809.m33817(this.f33899.readInt(), this.f33899.readInt());
                    c4263M8667.m8669(this.f33899);
                } else if (s == 257) {
                    this.f33899.skipBytes(4);
                    this.f33899.skipBytes(4);
                    c14809.m33824();
                    c4263M8667.m8669(this.f33899);
                } else {
                    this.f33897 = i5;
                    if (s != 258) {
                        if (s != 259) {
                            this.f33894 = this.f33899.readInt();
                            this.f33899.skipBytes(4);
                            this.f33899.skipBytes(4);
                            this.f33890 = 4;
                            c4263M8667.m8669(this.f33899);
                            return;
                        }
                        stack.pop();
                        this.f33892 = this.f33899.readInt();
                        this.f33894 = this.f33899.readInt();
                        this.f33890 = 3;
                        this.f33891 = true;
                        this.f33900--;
                        c4263M8667.m8669(this.f33899);
                        return;
                    }
                    this.f33892 = this.f33899.readInt();
                    int i8 = this.f33899.readInt();
                    this.f33894 = i8;
                    stack.push(new C14139(this.f33892, i8));
                    int iM33581 = this.f33899.m33581();
                    int iM33582 = this.f33899.m33581();
                    int i9 = this.f33899.readInt();
                    this.f33898 = (i9 >>> 16) - 1;
                    int i10 = i9 & 65535;
                    int i11 = this.f33899.readInt();
                    this.f33895 = (i11 >>> 16) - 1;
                    this.f33902 = (65535 & i11) - 1;
                    if (iM33581 > 20) {
                        this.f33899.skipBytes(iM33581 - 20);
                    }
                    this.f33903 = this.f33899.m33575();
                    if (iM33582 <= 20) {
                        C14677 c14677 = this.f33899;
                        int i12 = i10 * 5;
                        c14677.getClass();
                        int[] iArr = new int[i12];
                        for (int i13 = 0; i13 < i12; i13++) {
                            iArr[i13] = c14677.readInt();
                        }
                        this.f33904 = iArr;
                    } else {
                        this.f33904 = new int[i10 * 5];
                        int i14 = 0;
                        while (i10 > 0) {
                            int i15 = 0;
                            while (i15 < 5) {
                                this.f33904[i14] = this.f33899.readInt();
                                i15++;
                                i14++;
                            }
                            this.f33899.skipBytes(iM33582 - 20);
                            i10--;
                        }
                    }
                    while (true) {
                        int[] iArr2 = this.f33904;
                        if (i3 >= iArr2.length) {
                            c14809.m33821();
                            this.f33890 = 2;
                            this.f33900++;
                            c4263M8667.m8669(this.f33899);
                            return;
                        }
                        int i16 = i3 + 3;
                        int i17 = iArr2[i16] >>> 24;
                        iArr2[i16] = i17;
                        if (i17 == 3) {
                            int i18 = i3 + 2;
                            if (iArr2[i18] == -1 && (i = iArr2[i3 + 4]) >= 0 && i < this.f33889.size()) {
                                this.f33904[i18] = i;
                            }
                        }
                        i3 += 5;
                    }
                }
            }
        }
    }
}
