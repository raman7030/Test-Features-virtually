package p067l;

import android.text.TextUtils;
import com.alipay.sdk.p010m.p055w.C0233a;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import org.bouncycastle.crypto.params.DHParameters;
import org.bouncycastle.pqc.crypto.picnic.PicnicEngine;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: l.ܺܽܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: DAO9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C17633 implements XmlPullParser {

    /* JADX INFO: renamed from: ۤ */
    public static final char[] f52686 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* JADX INFO: renamed from: ۗ */
    public String f52687;

    /* JADX INFO: renamed from: ۙ */
    public String f52688;

    /* JADX INFO: renamed from: ۫ */
    public C6235 f52689;

    /* JADX INFO: renamed from: ۬ */
    public int f52690 = 0;

    /* JADX INFO: renamed from: ᩶ */
    public int f52691 = 0;

    /* JADX INFO: renamed from: ᩸ */
    public int f52692 = 0;

    /* JADX INFO: renamed from: ᩹ */
    public C10929[] f52693;

    @Override // org.xmlpull.v1.XmlPullParser
    public final String getAttributeNamespace(int i) {
        return "";
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final String getAttributePrefix(int i) {
        return null;
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
    public final int getLineNumber() {
        return -1;
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final int getNamespaceCount(int i) {
        return 0;
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final String getPrefix() {
        return null;
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final boolean isAttributeDefault(int i) {
        return false;
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final void setInput(InputStream inputStream, String str) throws XmlPullParserException {
        if (str != null && !StandardCharsets.UTF_8.name().equalsIgnoreCase(str)) {
            throw new UnsupportedOperationException();
        }
        this.f52689 = new C6235(inputStream);
        this.f52690 = 0;
        this.f52691 = 0;
        this.f52688 = null;
        this.f52687 = null;
        this.f52692 = 0;
        this.f52693 = new C10929[8];
        int i = 0;
        while (true) {
            C10929[] c10929Arr = this.f52693;
            if (i >= c10929Arr.length) {
                break;
            }
            c10929Arr[i] = new C10929(0);
            i++;
        }
        try {
            byte[] bArr = new byte[4];
            C6235 c6235 = this.f52689;
            c6235.getClass();
            c6235.readFully(bArr, 0, 4);
            if (!Arrays.equals(bArr, C4894.f11151)) {
                throw new IOException("Unexpected magic " + m40158(bArr));
            }
            if (m40160() == 0) {
                m40159();
            }
        } catch (IOException e) {
            throw new XmlPullParserException(e.toString());
        }
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final void setInput(Reader reader) {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final int next() throws XmlPullParserException, IOException {
        int iNextToken;
        while (true) {
            iNextToken = nextToken();
            if (iNextToken == 1 || iNextToken == 2 || iNextToken == 3) {
                break;
            }
            if (iNextToken == 4) {
                String string = this.f52687;
                while (true) {
                    int iM40160 = m40160();
                    if (iM40160 != 4 && iM40160 != 5 && iM40160 != 6) {
                        if (iM40160 != 8 && iM40160 != 9) {
                            break;
                        }
                        m40159();
                    } else {
                        m40159();
                        StringBuilder sbM17248 = C7470.m17248(string);
                        sbM17248.append(this.f52687);
                        string = sbM17248.toString();
                    }
                }
                this.f52690 = 4;
                this.f52688 = null;
                this.f52687 = string;
                if (string != null && string.length() != 0) {
                    return 4;
                }
            }
        }
        return iNextToken;
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final int nextToken() throws XmlPullParserException, IOException {
        int iM40160;
        if (this.f52690 == 3) {
            this.f52691--;
        }
        try {
            iM40160 = m40160();
            m40159();
        } catch (EOFException unused) {
            iM40160 = 1;
        }
        if (iM40160 == 2) {
            m40160();
            this.f52691++;
        }
        this.f52690 = iM40160;
        return iM40160;
    }

    /* JADX INFO: renamed from: ۧ */
    private int m40160() throws XmlPullParserException, IOException {
        while (true) {
            int iM14146 = this.f52689.m14146() & 15;
            if (iM14146 != 15) {
                return iM14146;
            }
            m40159();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m40159() throws XmlPullParserException, IOException {
        String str;
        byte b = this.f52689.readByte();
        int i = b & 15;
        int i2 = b & 240;
        if (i == 15) {
            int i3 = this.f52692;
            C10929[] c10929Arr = this.f52693;
            if (i3 == c10929Arr.length) {
                int length = c10929Arr.length;
                int i4 = (length >> 1) + length;
                this.f52693 = (C10929[]) Arrays.copyOf(c10929Arr, i4);
                while (length < i4) {
                    this.f52693[length] = new C10929(0);
                    length++;
                }
            }
            C10929[] c10929Arr2 = this.f52693;
            int i5 = this.f52692;
            this.f52692 = i5 + 1;
            C10929 c10929 = c10929Arr2[i5];
            c10929.f30292 = this.f52689.m14147();
            c10929.f30294 = i2;
            switch (i2) {
                case 16:
                case 192:
                case 208:
                    return;
                case 32:
                    c10929.f30293 = this.f52689.readUTF();
                    return;
                case 48:
                    c10929.f30293 = this.f52689.m14147();
                    return;
                case 64:
                case 80:
                    int unsignedShort = this.f52689.readUnsignedShort();
                    byte[] bArr = new byte[unsignedShort];
                    C6235 c6235 = this.f52689;
                    c6235.getClass();
                    c6235.readFully(bArr, 0, unsignedShort);
                    c10929.f30296 = bArr;
                    return;
                case 96:
                case UMErrorCode.E_UM_BE_DEFLATE_FAILED /* 112 */:
                    c10929.f30295 = this.f52689.readInt();
                    return;
                case 128:
                case 144:
                    c10929.f30299 = this.f52689.readLong();
                    return;
                case DHParameters.DEFAULT_MINIMUM_LENGTH /* 160 */:
                    c10929.f30297 = this.f52689.readFloat();
                    return;
                case PicnicEngine.MAX_AUX_BYTES /* 176 */:
                    c10929.f30298 = this.f52689.readDouble();
                    return;
                default:
                    throw new IOException(C20778.m46922(i2, "Unexpected data type "));
            }
        }
        switch (i) {
            case 0:
                this.f52688 = null;
                this.f52687 = null;
                if (this.f52692 > 0) {
                    m40161();
                    return;
                }
                return;
            case 1:
                this.f52688 = null;
                this.f52687 = null;
                if (this.f52692 > 0) {
                    m40161();
                    return;
                }
                return;
            case 2:
                this.f52688 = this.f52689.m14147();
                this.f52687 = null;
                if (this.f52692 > 0) {
                    m40161();
                    return;
                }
                return;
            case 3:
                this.f52688 = this.f52689.m14147();
                this.f52687 = null;
                if (this.f52692 > 0) {
                    m40161();
                    return;
                }
                return;
            case 4:
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
                this.f52688 = null;
                this.f52687 = this.f52689.readUTF();
                if (this.f52692 > 0) {
                    m40161();
                    return;
                }
                return;
            case 6:
                String utf = this.f52689.readUTF();
                this.f52688 = utf;
                switch (utf) {
                    case "gt":
                        str = ">";
                        break;
                    case "lt":
                        str = "<";
                        break;
                    case "amp":
                        str = C0233a.f1084p;
                        break;
                    case "apos":
                        str = "'";
                        break;
                    case "quot":
                        str = "\"";
                        break;
                    default:
                        if (utf.length() > 1 && utf.charAt(0) == '#') {
                            str = new String(new char[]{(char) Integer.parseInt(utf.substring(1))});
                            break;
                        } else {
                            throw new XmlPullParserException("Unknown entity ".concat(utf));
                        }
                        break;
                }
                this.f52687 = str;
                if (this.f52692 > 0) {
                    m40161();
                    return;
                }
                return;
            default:
                throw new IOException(C19768.m44907("Unknown token ", i, i2, " with type "));
        }
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final void require(int i, String str, String str2) throws XmlPullParserException {
        if (str == null || str.isEmpty()) {
            if (this.f52690 != i || !C12826.equals(this.f52688, str2)) {
                throw new XmlPullParserException(getPositionDescription());
            }
            return;
        }
        throw new IllegalArgumentException("Namespaces are not supported");
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final int nextTag() throws XmlPullParserException, IOException {
        int next = next();
        if (next == 4 && isWhitespace()) {
            next = next();
        }
        if (next == 2 || next == 3) {
            return next;
        }
        throw new XmlPullParserException(getPositionDescription());
    }

    /* JADX INFO: renamed from: ܽ */
    private void m40161() {
        for (int i = 0; i < this.f52692; i++) {
            C10929 c10929 = this.f52693[i];
            c10929.f30292 = null;
            c10929.f30293 = null;
            c10929.f30296 = null;
        }
        this.f52692 = 0;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x002a  */
    /* JADX WARN: Code duplicated, block: B:19:0x0033 A[RETURN] */
    @Override // org.xmlpull.v1.XmlPullParser
    public final String getAttributeValue(String str, String str2) {
        if (str == null || str.isEmpty()) {
            int i = 0;
            while (i < this.f52692) {
                if (C12826.equals(this.f52693[i].f30292, str2)) {
                    if (i != -1) {
                        return this.f52693[i].m25193();
                    }
                    return null;
                }
                i++;
            }
            i = -1;
            if (i != -1) {
                return this.f52693[i].m25193();
            }
            return null;
        }
        throw new IllegalArgumentException("Namespaces are not supported");
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m40162(int i) {
        return this.f52693[i].f30294;
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final String getAttributeValue(int i) {
        return this.f52693[i].m25193();
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final String getText() {
        return this.f52687;
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final char[] getTextCharacters(int[] iArr) {
        char[] charArray = this.f52687.toCharArray();
        iArr[0] = 0;
        iArr[1] = charArray.length;
        return charArray;
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final String getInputEncoding() {
        return StandardCharsets.UTF_8.name();
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final int getDepth() {
        return this.f52691;
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final String getPositionDescription() {
        return "Token " + this.f52690 + " at depth " + this.f52691;
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final boolean isWhitespace() throws XmlPullParserException {
        int i = this.f52690;
        if (i == 4 || i == 5) {
            return !TextUtils.isGraphic(this.f52687);
        }
        if (i == 7) {
            return true;
        }
        throw new XmlPullParserException("Not applicable for token " + this.f52690);
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final String getNamespace() {
        int i = this.f52690;
        if (i == 2 || i == 3) {
            return "";
        }
        return null;
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final String getName() {
        return this.f52688;
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final boolean isEmptyElementTag() throws XmlPullParserException {
        if (this.f52690 == 2) {
            try {
                return m40160() == 3;
            } catch (IOException e) {
                throw new XmlPullParserException(e.toString());
            }
        }
        throw new XmlPullParserException("Not at START_TAG");
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final int getAttributeCount() {
        return this.f52692;
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final String getAttributeName(int i) {
        return this.f52693[i].f30292;
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final int getEventType() {
        return this.f52690;
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final String nextText() throws XmlPullParserException, IOException {
        if (this.f52690 != 2) {
            throw new XmlPullParserException(getPositionDescription());
        }
        int next = next();
        if (next != 4) {
            if (next == 3) {
                return "";
            }
            throw new XmlPullParserException(getPositionDescription());
        }
        String str = this.f52687;
        if (next() == 3) {
            return str;
        }
        throw new XmlPullParserException(getPositionDescription());
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final String getNamespacePrefix(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final String getNamespaceUri(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final String getNamespace(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final void defineEntityReplacementText(String str, String str2) {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final void setFeature(String str, boolean z) {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final boolean getFeature(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final void setProperty(String str, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final Object getProperty(String str) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m40158(byte[] bArr) {
        char[] cArr = new char[bArr.length * 2];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            char[] cArr2 = f52686;
            cArr[i] = cArr2[(b >>> 4) & 15];
            i += 2;
            cArr[i2] = cArr2[b & 15];
        }
        return new String(cArr);
    }
}
