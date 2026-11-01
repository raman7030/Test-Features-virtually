package p067l;

import java.io.ByteArrayOutputStream;
import org.bouncycastle.asn1.BERTags;

/* JADX INFO: renamed from: l.ܿ᩷᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 6A0Y */
/* JADX INFO: loaded from: classes4.dex */
public final class C19099 extends ByteArrayOutputStream {

    /* JADX INFO: renamed from: ᩸ */
    public final int f56984;

    /* JADX INFO: renamed from: ᩹ */
    public final C16416 f56985;

    public C19099(int i, C16416 c16416, int i2) {
        super(i);
        this.f56985 = c16416;
        this.f56984 = i2;
    }

    public final void writeByte(int i) {
        write(i & 255);
    }

    @Override // java.io.ByteArrayOutputStream
    public final void writeBytes(byte[] bArr) {
        if (bArr != null) {
            m43388(bArr.length, bArr);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m43388(int i, byte[] bArr) {
        for (int i2 = 0; i2 < i; i2++) {
            writeByte(bArr[i2]);
        }
    }

    public final void writeShort(int i) {
        writeByte(i >> 8);
        writeByte(i);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m43391(int i, String str) {
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

    /* JADX INFO: renamed from: ֫ */
    public final void m43389(String str) {
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
            C16416 c16416 = this.f56985;
            Integer num = (Integer) c16416.f48258.get(str);
            if (num != null) {
                int iIntValue = num.intValue();
                writeByte((iIntValue >> 8) | 192);
                writeByte(iIntValue & 255);
                return;
            } else {
                c16416.f48258.put(str, Integer.valueOf(size() + this.f56984));
                m43391(strReplace.length(), strReplace);
                str = str.substring(iIndexOf);
                if (str.startsWith(".")) {
                    str = str.substring(1);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m43390(AbstractC23793 abstractC23793, long j) {
        int iMax;
        m43389(abstractC23793.m34943());
        writeShort(abstractC23793.m34947().m30568());
        int iM18728 = abstractC23793.m34945().m18728();
        boolean zM34948 = abstractC23793.m34948();
        C16416 c16416 = this.f56985;
        writeShort(iM18728 | ((zM34948 && c16416.f60136) ? 32768 : 0));
        if (j != 0) {
            iMax = (int) Math.max(0L, (abstractC23793.m52879(100) - j) / 1000);
        } else {
            iMax = abstractC23793.m52882();
        }
        writeShort(iMax >> 16);
        writeShort(iMax);
        C19099 c19099 = new C19099(512, c16416, size() + this.f56984 + 2);
        abstractC23793.mo5056(c19099);
        byte[] byteArray = c19099.toByteArray();
        writeShort(byteArray.length);
        write(byteArray, 0, byteArray.length);
    }
}
