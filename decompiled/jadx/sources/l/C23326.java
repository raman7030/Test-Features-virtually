package l;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩺᩻ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 24MP */
/* JADX INFO: loaded from: classes2.dex */
public final class C23326 extends AbstractC9049 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C9425 f74979;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C17891[] f74980;

    public C23326(AbstractC15440 abstractC15440) {
        this(abstractC15440.m36506());
    }

    public C23326(InputStream inputStream) {
        this(new C3074(C0349.m1795(inputStream, 0)));
    }

    public C23326(byte[] bArr) {
        this(new C3074(bArr));
    }

    public C23326(C3074 c3074) throws Exception {
        int i;
        C5896 c5896M9403 = c3074.m9403(C1993.m6523(c3074.m9403(0)).f6674);
        while (c5896M9403.m16525() >= 8) {
            C1993 c1993M6523 = C1993.m6523(c5896M9403);
            int i2 = c1993M6523.f6673;
            if (c1993M6523.f6676 == 1) {
                c5896M9403.m16536(-8);
                break;
            }
            int i3 = c1993M6523.f6674;
            if (i3 < 8 || i2 < i3 || (i = i2 - 8) > c5896M9403.m16525()) {
                throw new IOException("Invalid chunk size before string pool at offset " + c1993M6523.f6675);
            }
            c5896M9403.m16536(i);
        }
        this.f74979 = new C9425(c5896M9403);
        this.f27446 = C13944.m33385(c3074, c5896M9403.m16529());
        int iM9400 = c3074.m9400(8);
        iM9400 = iM9400 < 0 ? 10 : iM9400;
        ArrayList arrayList = new ArrayList(iM9400);
        for (int i4 = 0; i4 < iM9400; i4++) {
            try {
                arrayList.add(new C17891(this, c5896M9403));
            } catch (Exception e) {
                if (i4 == 0) {
                    throw e;
                }
                if (c5896M9403.m16525() <= 0) {
                    this.f74980 = (C17891[]) arrayList.toArray(new C17891[0]);
                }
            }
        }
        this.f74980 = (C17891[]) arrayList.toArray(new C17891[0]);
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final void m51731() {
        this.f74979.m24259();
        for (C17891 c17891 : this.f74980) {
            c17891.f54630.m24259();
        }
    }

    @Override // l.InterfaceC9922
    /* JADX INFO: renamed from: ᩻ۧ */
    public final C9425 mo14959() {
        return this.f74979;
    }

    @Override // l.InterfaceC9922
    /* JADX INFO: renamed from: ᩻ۧ */
    public final InterfaceC12743 mo14959() {
        return this.f74979;
    }

    @Override // l.InterfaceC9922
    /* JADX INFO: renamed from: ۚ */
    public final int mo14956() {
        return this.f74980.length;
    }

    @Override // l.InterfaceC9922
    /* JADX INFO: renamed from: ۢ */
    public final InterfaceC4277 mo14957(int i) {
        return this.f74980[i];
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m51732() {
        C9028 c9028M23280 = C9028.m23280();
        for (C17891 c17891 : this.f74980) {
            c9028M23280.m23281(c17891.mo12858(), c17891.getPackageName());
        }
    }
}
