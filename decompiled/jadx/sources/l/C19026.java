package l;

import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import java.lang.ref.SoftReference;

/* JADX INFO: renamed from: l.ᩴ᩸۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 143Z */
/* JADX INFO: loaded from: classes5.dex */
public final class C19026 extends AbstractC12486 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static C2609 f59938 = C2609.m8239();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public byte[] f59939;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f59940;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f59941;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C4209[] f59942;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static synchronized C19026 m43873(C6136 c6136) {
        while (f59938.m8249()) {
            C19026 c19026 = (C19026) ((SoftReference) f59938.f8240).get();
            f59938 = f59938.f8241;
            if (c19026 != null) {
                return c19026;
            }
        }
        C19026 c19027 = new C19026(c6136);
        c19027.f59941 = 0;
        c19027.f59940 = EnumC5983.f18409;
        c19027.f59942 = new C4209[32768];
        c19027.f59939 = new byte[WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT];
        return c19027;
    }

    @Override // l.AbstractC12486
    /* JADX INFO: renamed from: ֫ */
    public final void mo15928() {
        synchronized (C19026.class) {
            C2609 c2609 = f59938;
            SoftReference softReference = new SoftReference(this);
            c2609.getClass();
            f59938 = new C2609(softReference, c2609);
        }
    }

    @Override // l.AbstractC12486
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC10370 mo15927(char[] cArr, int i) {
        int i2 = this.f59941;
        byte[] bArrM17574 = C6322.m17574((i * 3) + i2, this.f59939);
        this.f59939 = bArrM17574;
        int iM31087 = C12780.m31087(bArrM17574, i2, i, cArr) - i2;
        int iM30651 = AbstractC12486.m30651(i2, iM31087, bArrM17574) & this.f59940;
        C4209[] c4209Arr = this.f59942;
        C4209 c4209 = c4209Arr[iM30651];
        while (c4209 != null && (c4209.f13680 != iM31087 || !AbstractC12486.m30650(c4209.f13681, bArrM17574, i2, bArrM17574, iM31087))) {
            c4209 = c4209.f13679;
        }
        if (c4209 != null) {
            return c4209;
        }
        C4209 c42010 = new C4209(this);
        c42010.f13681 = i2;
        c42010.f13680 = iM31087;
        c42010.f13679 = c4209Arr[iM30651];
        c4209Arr[iM30651] = c42010;
        int i3 = i2 + iM31087;
        this.f59941 = i3;
        if (iM31087 == 0) {
            this.f59941 = i3 + 1;
        }
        return c42010;
    }

    @Override // l.AbstractC12486
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC10370 mo15926(int i, int i2, byte[] bArr) {
        int iM30651 = AbstractC12486.m30651(i, i2, bArr) & this.f59940;
        C4209[] c4209Arr = this.f59942;
        C4209 c4209 = c4209Arr[iM30651];
        byte[] bArr2 = this.f59939;
        while (c4209 != null && (c4209.f13680 != i2 || !AbstractC12486.m30650(c4209.f13681, bArr2, i, bArr, i2))) {
            c4209 = c4209.f13679;
        }
        if (c4209 != null) {
            return c4209;
        }
        int i3 = this.f59941;
        int i4 = i3 + i2;
        byte[] bArrM17574 = C6322.m17574(i4, bArr2);
        this.f59939 = bArrM17574;
        System.arraycopy(bArr, i, bArrM17574, i3, i2);
        C4209 c42010 = new C4209(this);
        c42010.f13681 = i3;
        c42010.f13680 = i2;
        c42010.f13679 = c4209Arr[iM30651];
        c4209Arr[iM30651] = c42010;
        this.f59941 = i4;
        if (i2 == 0) {
            this.f59941 = i4 + 1;
        }
        return c42010;
    }
}
