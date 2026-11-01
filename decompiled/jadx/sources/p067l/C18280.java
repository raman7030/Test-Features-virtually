package p067l;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

/* JADX INFO: renamed from: l.ܽܺۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: W1P7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C18280 implements Comparable {

    /* JADX INFO: renamed from: ۗ */
    public String f54570;

    /* JADX INFO: renamed from: ۛ */
    public long f54572;

    /* JADX INFO: renamed from: ۤ */
    public String f54573;

    /* JADX INFO: renamed from: ۨ */
    public String f54574;

    /* JADX INFO: renamed from: ۬ */
    public String f54576;

    /* JADX INFO: renamed from: ᩶ */
    public Bitmap f54577;

    /* JADX INFO: renamed from: ᩸ */
    public String f54578;

    /* JADX INFO: renamed from: ᩺ */
    public String f54580;

    /* JADX INFO: renamed from: ۙ */
    public int f54571 = -1;

    /* JADX INFO: renamed from: ᩹ */
    public C12917 f54579 = new C12917();

    /* JADX INFO: renamed from: ۫ */
    public int f54575 = Integer.MIN_VALUE;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j = this.f54572 - ((C18280) obj).f54572;
        if (j == 0) {
            return 0;
        }
        return j > 0 ? -1 : 1;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C18280 m41619(byte[] bArr) {
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            bArr[i] = (byte) (bArr[i] ^ (i ^ length));
        }
        C14677 c14677M33573 = C14677.m33573(bArr);
        C18280 c18280 = new C18280();
        c18280.f54573 = c14677M33573.m33593();
        c18280.f54574 = c14677M33573.m33593();
        c18280.f54578 = c14677M33573.m33593();
        c18280.f54576 = c14677M33573.m33593();
        c18280.f54580 = c14677M33573.m33593();
        c18280.f54570 = c14677M33573.m33593();
        byte[] bArrM33583 = c14677M33573.m33583();
        c18280.f54577 = BitmapFactory.decodeByteArray(bArrM33583, 0, bArrM33583.length);
        c18280.f54572 = c14677M33573.readLong();
        c18280.f54579.m29595(c14677M33573.m33593());
        return c18280;
    }
}
