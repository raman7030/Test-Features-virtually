package p067l;

import com.tencent.p062mm.opensdk.modelmsg.WXMediaMessage;
import java.lang.ref.SoftReference;

/* JADX INFO: renamed from: l.ᩴ᩸۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 143Z */
/* JADX INFO: loaded from: classes5.dex */
public final class C20451 extends AbstractC14235 {

    /* JADX INFO: renamed from: ܳ */
    public static C4848 f63167 = C4848.m10283();

    /* JADX INFO: renamed from: ۧ */
    public byte[] f63168;

    /* JADX INFO: renamed from: ܽ */
    public int f63169;

    /* JADX INFO: renamed from: ܿ */
    public int f63170;

    /* JADX INFO: renamed from: ᩳ */
    public C6369[] f63171;

    /* JADX INFO: renamed from: ֫ */
    public static synchronized C20451 m46141(C8200 c8200) {
        while (f63167.m10293()) {
            C20451 c20451 = (C20451) ((SoftReference) f63167.f11034).get();
            f63167 = f63167.f11035;
            if (c20451 != null) {
                return c20451;
            }
        }
        C20451 c20452 = new C20451(c8200);
        c20452.f63170 = 0;
        c20452.f63169 = EnumC8055.f21261;
        c20452.f63171 = new C6369[32768];
        c20452.f63168 = new byte[WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT];
        return c20452;
    }

    @Override // p067l.AbstractC14235
    /* JADX INFO: renamed from: ֫ */
    public final void mo17849() {
        synchronized (C20451.class) {
            C4848 c4848 = f63167;
            SoftReference softReference = new SoftReference(this);
            c4848.getClass();
            f63167 = new C4848(softReference, c4848);
        }
    }

    @Override // p067l.AbstractC14235
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC12224 mo17848(char[] cArr, int i) {
        int i2 = this.f63170;
        byte[] bArrM19514 = C8377.m19514((i * 3) + i2, this.f63168);
        this.f63168 = bArrM19514;
        int iM33171 = C14514.m33171(bArrM19514, i2, i, cArr) - i2;
        int iM32716 = AbstractC14235.m32716(i2, iM33171, bArrM19514) & this.f63169;
        C6369[] c6369Arr = this.f63171;
        C6369 c6369 = c6369Arr[iM32716];
        while (c6369 != null && (c6369.f16493 != iM33171 || !AbstractC14235.m32715(c6369.f16494, bArrM19514, i2, bArrM19514, iM33171))) {
            c6369 = c6369.f16492;
        }
        if (c6369 != null) {
            return c6369;
        }
        C6369 c63610 = new C6369(this);
        c63610.f16494 = i2;
        c63610.f16493 = iM33171;
        c63610.f16492 = c6369Arr[iM32716];
        c6369Arr[iM32716] = c63610;
        int i3 = i2 + iM33171;
        this.f63170 = i3;
        if (iM33171 == 0) {
            this.f63170 = i3 + 1;
        }
        return c63610;
    }

    @Override // p067l.AbstractC14235
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC12224 mo17847(int i, int i2, byte[] bArr) {
        int iM32716 = AbstractC14235.m32716(i, i2, bArr) & this.f63169;
        C6369[] c6369Arr = this.f63171;
        C6369 c6369 = c6369Arr[iM32716];
        byte[] bArr2 = this.f63168;
        while (c6369 != null && (c6369.f16493 != i2 || !AbstractC14235.m32715(c6369.f16494, bArr2, i, bArr, i2))) {
            c6369 = c6369.f16492;
        }
        if (c6369 != null) {
            return c6369;
        }
        int i3 = this.f63170;
        int i4 = i3 + i2;
        byte[] bArrM19514 = C8377.m19514(i4, bArr2);
        this.f63168 = bArrM19514;
        System.arraycopy(bArr, i, bArrM19514, i3, i2);
        C6369 c63610 = new C6369(this);
        c63610.f16494 = i3;
        c63610.f16493 = i2;
        c63610.f16492 = c6369Arr[iM32716];
        c6369Arr[iM32716] = c63610;
        this.f63170 = i4;
        if (i2 == 0) {
            this.f63170 = i4 + 1;
        }
        return c63610;
    }
}
