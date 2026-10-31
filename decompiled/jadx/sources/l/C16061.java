package l;

import android.text.TextUtils;
import com.alipay.sdk.m.w.a;
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
public final class C16061 implements XmlPullParser {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final char[] f49523 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public String f49524;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String f49525;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C4068 f49526;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f49527 = 0;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f49528 = 0;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f49529 = 0;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C9007[] f49530;

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
        this.f49526 = new C4068(inputStream);
        this.f49527 = 0;
        this.f49528 = 0;
        this.f49525 = null;
        this.f49524 = null;
        this.f49529 = 0;
        this.f49530 = new C9007[8];
        int i = 0;
        while (true) {
            C9007[] c9007Arr = this.f49530;
            if (i >= c9007Arr.length) {
                break;
            }
            c9007Arr[i] = new C9007(0);
            i++;
        }
        try {
            byte[] bArr = new byte[4];
            C4068 c4068 = this.f49526;
            c4068.getClass();
            c4068.readFully(bArr, 0, 4);
            if (!Arrays.equals(bArr, C2657.f8357)) {
                throw new IOException("Unexpected magic " + m37970(bArr));
            }
            if (m37972() == 0) {
                m37971();
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
                String string = this.f49524;
                while (true) {
                    int iM37972 = m37972();
                    if (iM37972 != 4 && iM37972 != 5 && iM37972 != 6) {
                        if (iM37972 != 8 && iM37972 != 9) {
                            break;
                        }
                        m37971();
                    } else {
                        m37971();
                        StringBuilder sbM15339 = C5368.m15339(string);
                        sbM15339.append(this.f49524);
                        string = sbM15339.toString();
                    }
                }
                this.f49527 = 4;
                this.f49525 = null;
                this.f49524 = string;
                if (string != null && string.length() != 0) {
                    return 4;
                }
            }
        }
        return iNextToken;
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final int nextToken() throws XmlPullParserException, IOException {
        int iM37972;
        if (this.f49527 == 3) {
            this.f49528--;
        }
        try {
            iM37972 = m37972();
            m37971();
        } catch (EOFException unused) {
            iM37972 = 1;
        }
        if (iM37972 == 2) {
            m37972();
            this.f49528++;
        }
        this.f49527 = iM37972;
        return iM37972;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private int m37972() throws XmlPullParserException, IOException {
        while (true) {
            int iM12225 = this.f49526.m12225() & 15;
            if (iM12225 != 15) {
                return iM12225;
            }
            m37971();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m37971() throws XmlPullParserException, IOException {
        String str;
        byte b = this.f49526.readByte();
        int i = b & 15;
        int i2 = b & 240;
        if (i == 15) {
            int i3 = this.f49529;
            C9007[] c9007Arr = this.f49530;
            if (i3 == c9007Arr.length) {
                int length = c9007Arr.length;
                int i4 = (length >> 1) + length;
                this.f49530 = (C9007[]) Arrays.copyOf(c9007Arr, i4);
                while (length < i4) {
                    this.f49530[length] = new C9007(0);
                    length++;
                }
            }
            C9007[] c9007Arr2 = this.f49530;
            int i5 = this.f49529;
            this.f49529 = i5 + 1;
            C9007 c9007 = c9007Arr2[i5];
            c9007.f27358 = this.f49526.m12226();
            c9007.f27360 = i2;
            switch (i2) {
                case 16:
                case 192:
                case 208:
                    return;
                case 32:
                    c9007.f27359 = this.f49526.readUTF();
                    return;
                case 48:
                    c9007.f27359 = this.f49526.m12226();
                    return;
                case 64:
                case 80:
                    int unsignedShort = this.f49526.readUnsignedShort();
                    byte[] bArr = new byte[unsignedShort];
                    C4068 c4068 = this.f49526;
                    c4068.getClass();
                    c4068.readFully(bArr, 0, unsignedShort);
                    c9007.f27362 = bArr;
                    return;
                case 96:
                case UMErrorCode.E_UM_BE_DEFLATE_FAILED /* 112 */:
                    c9007.f27361 = this.f49526.readInt();
                    return;
                case 128:
                case 144:
                    c9007.f27365 = this.f49526.readLong();
                    return;
                case DHParameters.DEFAULT_MINIMUM_LENGTH /* 160 */:
                    c9007.f27363 = this.f49526.readFloat();
                    return;
                case PicnicEngine.MAX_AUX_BYTES /* 176 */:
                    c9007.f27364 = this.f49526.readDouble();
                    return;
                default:
                    throw new IOException(C19370.m44628(i2, "Unexpected data type "));
            }
        }
        switch (i) {
            case 0:
                this.f49525 = null;
                this.f49524 = null;
                if (this.f49529 > 0) {
                    m37973();
                    return;
                }
                return;
            case 1:
                this.f49525 = null;
                this.f49524 = null;
                if (this.f49529 > 0) {
                    m37973();
                    return;
                }
                return;
            case 2:
                this.f49525 = this.f49526.m12226();
                this.f49524 = null;
                if (this.f49529 > 0) {
                    m37973();
                    return;
                }
                return;
            case 3:
                this.f49525 = this.f49526.m12226();
                this.f49524 = null;
                if (this.f49529 > 0) {
                    m37973();
                    return;
                }
                return;
            case 4:
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
                this.f49525 = null;
                this.f49524 = this.f49526.readUTF();
                if (this.f49529 > 0) {
                    m37973();
                    return;
                }
                return;
            case 6:
                String utf = this.f49526.readUTF();
                this.f49525 = utf;
                switch (utf) {
                    case "gt":
                        str = ">";
                        break;
                    case "lt":
                        str = "<";
                        break;
                    case "amp":
                        str = a.p;
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
                this.f49524 = str;
                if (this.f49529 > 0) {
                    m37973();
                    return;
                }
                return;
            default:
                throw new IOException(C18307.m42646("Unknown token ", i, i2, " with type "));
        }
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final void require(int i, String str, String str2) throws XmlPullParserException {
        if (str == null || str.isEmpty()) {
            if (this.f49527 != i || !C11003.equals(this.f49525, str2)) {
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

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m37973() {
        for (int i = 0; i < this.f49529; i++) {
            C9007 c9007 = this.f49530[i];
            c9007.f27358 = null;
            c9007.f27359 = null;
            c9007.f27362 = null;
        }
        this.f49529 = 0;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x002a  */
    /* JADX WARN: Code duplicated, block: B:19:0x0033 A[RETURN] */
    @Override // org.xmlpull.v1.XmlPullParser
    public final String getAttributeValue(String str, String str2) {
        if (str == null || str.isEmpty()) {
            int i = 0;
            while (i < this.f49529) {
                if (C11003.equals(this.f49530[i].f27358, str2)) {
                    if (i != -1) {
                        return this.f49530[i].m23249();
                    }
                    return null;
                }
                i++;
            }
            i = -1;
            if (i != -1) {
                return this.f49530[i].m23249();
            }
            return null;
        }
        throw new IllegalArgumentException("Namespaces are not supported");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m37974(int i) {
        return this.f49530[i].f27360;
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final String getAttributeValue(int i) {
        return this.f49530[i].m23249();
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final String getText() {
        return this.f49524;
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final char[] getTextCharacters(int[] iArr) {
        char[] charArray = this.f49524.toCharArray();
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
        return this.f49528;
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final String getPositionDescription() {
        return "Token " + this.f49527 + " at depth " + this.f49528;
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final boolean isWhitespace() throws XmlPullParserException {
        int i = this.f49527;
        if (i == 4 || i == 5) {
            return !TextUtils.isGraphic(this.f49524);
        }
        if (i == 7) {
            return true;
        }
        throw new XmlPullParserException("Not applicable for token " + this.f49527);
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final String getNamespace() {
        int i = this.f49527;
        if (i == 2 || i == 3) {
            return "";
        }
        return null;
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final String getName() {
        return this.f49525;
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final boolean isEmptyElementTag() throws XmlPullParserException {
        if (this.f49527 == 2) {
            try {
                return m37972() == 3;
            } catch (IOException e) {
                throw new XmlPullParserException(e.toString());
            }
        }
        throw new XmlPullParserException("Not at START_TAG");
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final int getAttributeCount() {
        return this.f49529;
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final String getAttributeName(int i) {
        return this.f49530[i].f27358;
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final int getEventType() {
        return this.f49527;
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final String nextText() throws XmlPullParserException, IOException {
        if (this.f49527 != 2) {
            throw new XmlPullParserException(getPositionDescription());
        }
        int next = next();
        if (next != 4) {
            if (next == 3) {
                return "";
            }
            throw new XmlPullParserException(getPositionDescription());
        }
        String str = this.f49524;
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

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m37970(byte[] bArr) {
        char[] cArr = new char[bArr.length * 2];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            char[] cArr2 = f49523;
            cArr[i] = cArr2[(b >>> 4) & 15];
            i += 2;
            cArr[i2] = cArr2[b & 15];
        }
        return new String(cArr);
    }
}
