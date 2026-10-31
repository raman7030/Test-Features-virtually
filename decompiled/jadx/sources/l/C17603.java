package l;

import java.io.ByteArrayOutputStream;
import org.bouncycastle.asn1.BERTags;

/* JADX INFO: renamed from: l.ܿ᩷᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 6A0Y */
/* JADX INFO: loaded from: classes4.dex */
public final class C17603 extends ByteArrayOutputStream {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f53790;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C14780 f53791;

    public C17603(int i, C14780 c14780, int i2) {
        super(i);
        this.f53791 = c14780;
        this.f53790 = i2;
    }

    public final void writeByte(int i) {
        write(i & 255);
    }

    @Override // java.io.ByteArrayOutputStream
    public final void writeBytes(byte[] bArr) {
        if (bArr != null) {
            m41142(bArr.length, bArr);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m41142(int i, byte[] bArr) {
        for (int i2 = 0; i2 < i; i2++) {
            writeByte(bArr[i2]);
        }
    }

    public final void writeShort(int i) {
        writeByte(i >> 8);
        writeByte(i);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m41145(int i, String str) {
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            char cCharAt = str.charAt(i3);
            i2 = (cCharAt < 1 || cCharAt > 127) ? cCharAt > 2047 ? i2 + 3 : i2 + 2 : i2 + 1;
        }
        writeByte(i2);
        for (int i4 = 0; i4 < i; i4++) {
            char cCharAt2 = str.charAt(i4);
            if (cCharAt2 >= 1 && cCharAt2 <= 127) {
                writeByte(cCharAt2);
            } else if (cCharAt2 > 2047) {
                writeByte(((cCharAt2 >> '\f') & 15) | BERTags.FLAGS);
                writeByte(((cCharAt2 >> 6) & 63) | 128);
                writeByte((cCharAt2 & '?') | 128);
            } else {
                writeByte(((cCharAt2 >> 6) & 31) | 192);
                writeByte((cCharAt2 & '?') | 128);
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m41143(String str) {
        int iIndexOf;
        while (true) {
            int i = 0;
            while (true) {
                iIndexOf = str.indexOf(46, i);
                if (iIndexOf < 0) {
                    iIndexOf = -1;
                    break;
                } else if (iIndexOf == 0 || str.charAt(iIndexOf - 1) != '\\') {
                    break;
                } else {
                    i = iIndexOf + 1;
                }
            }
            if (iIndexOf < 0) {
                iIndexOf = str.length();
            }
            if (iIndexOf <= 0) {
                writeByte(0);
                return;
            }
            String strReplace = str.substring(0, iIndexOf).replace("\\.", ".");
            C14780 c14780 = this.f53791;
            Integer num = (Integer) c14780.f45144.get(str);
            if (num != null) {
                int iIntValue = num.intValue();
                writeByte((iIntValue >> 8) | 192);
                writeByte(iIntValue & 255);
                return;
            } else {
                c14780.f45144.put(str, Integer.valueOf(size() + this.f53790));
                m41145(strReplace.length(), strReplace);
                str = str.substring(iIndexOf);
                if (str.startsWith(".")) {
                    str = str.substring(1);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m41144(AbstractC22542 abstractC22542, long j) {
        int iMax;
        m41143(abstractC22542.m32828());
        writeShort(abstractC22542.m32832().m28522());
        int iM16802 = abstractC22542.m32830().m16802();
        boolean zM32833 = abstractC22542.m32833();
        C14780 c14780 = this.f53791;
        writeShort(iM16802 | ((zM32833 && c14780.f56918) ? 32768 : 0));
        if (j != 0) {
            iMax = (int) Math.max(0L, (abstractC22542.m50537(100) - j) / 1000);
        } else {
            iMax = abstractC22542.m50540();
        }
        writeShort(iMax >> 16);
        writeShort(iMax);
        C17603 c17603 = new C17603(512, c14780, size() + this.f53790 + 2);
        abstractC22542.mo2717(c17603);
        byte[] byteArray = c17603.toByteArray();
        writeShort(byteArray.length);
        write(byteArray, 0, byteArray.length);
    }
}
