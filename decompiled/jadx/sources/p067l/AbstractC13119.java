package p067l;

import java.io.IOException;
import java.math.RoundingMode;

/* JADX INFO: renamed from: l.ۧ᩺ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: L3BC */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC13119 {

    /* JADX INFO: renamed from: ֫ */
    public static final AbstractC13119 f36859;

    /* JADX INFO: renamed from: ۧ */
    public static final AbstractC13119 f36860;

    /* JADX INFO: renamed from: ֫ */
    public abstract int mo9155(byte[] bArr, CharSequence charSequence);

    /* JADX INFO: renamed from: ֫ */
    public abstract CharSequence mo9156(CharSequence charSequence);

    /* JADX INFO: renamed from: ֫ */
    public abstract AbstractC13119 mo9157();

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo9159(StringBuilder sb, byte[] bArr, int i);

    /* JADX INFO: renamed from: ۧ */
    public abstract AbstractC13119 mo9161();

    /* JADX INFO: renamed from: ֫ */
    public final String m30014(byte[] bArr) {
        int length = bArr.length;
        C6194.m14024(0, length, bArr.length);
        C13473 c13473 = ((C4401) this).f9888;
        int i = c13473.f37823;
        int i2 = c13473.f37819;
        RoundingMode roundingMode = RoundingMode.CEILING;
        StringBuilder sb = new StringBuilder(C7754.m17907(length, i2) * i);
        try {
            mo9159(sb, bArr, length);
            return sb.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final byte[] m30015(String str) {
        try {
            CharSequence charSequenceMo9156 = mo9156((CharSequence) str);
            int length = (int) (((((long) ((C4401) this).f9888.f37817) * ((long) charSequenceMo9156.length())) + 7) / 8);
            byte[] bArr = new byte[length];
            int iMo9155 = mo9155(bArr, charSequenceMo9156);
            if (iMo9155 == length) {
                return bArr;
            }
            byte[] bArr2 = new byte[iMo9155];
            System.arraycopy(bArr, 0, bArr2, 0, iMo9155);
            return bArr2;
        } catch (C9449 e) {
            throw new IllegalArgumentException(e);
        }
    }

    static {
        new C15483("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");
        new C15483("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_");
        f36860 = new C4401("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567");
        new C4401("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV");
        f36859 = new C24201();
    }

    /* JADX INFO: renamed from: ᩳ */
    public static AbstractC13119 m30013() {
        return f36860;
    }

    /* JADX INFO: renamed from: ܽ */
    public static AbstractC13119 m30012() {
        return f36859;
    }
}
