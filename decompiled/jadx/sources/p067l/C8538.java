package p067l;

import android.net.Uri;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import org.bouncycastle.crypto.prng.X931RNG;

/* JADX INFO: renamed from: l.ۜۗۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 274A */
/* JADX INFO: loaded from: classes3.dex */
public final class C8538 implements InterfaceC22753 {

    /* JADX INFO: renamed from: ֫ */
    public final boolean f22918;

    /* JADX INFO: renamed from: ۧ */
    public final String f22919;

    /* JADX INFO: renamed from: ܳ */
    public final ArrayList f22920 = new ArrayList();

    /* JADX INFO: renamed from: ܽ */
    public final C11221 f22921;

    /* JADX INFO: renamed from: ܿ */
    public final C24905 f22922;

    /* JADX INFO: renamed from: ᩳ */
    public InterfaceC22753 f22923;

    public C8538(C24905 c24905, C11221 c11221, String str, boolean z) {
        this.f22922 = c24905;
        this.f22921 = c11221;
        this.f22919 = str;
        this.f22918 = z;
    }

    @Override // p067l.InterfaceC22753
    /* JADX INFO: renamed from: ֫ */
    public final void mo8132(InterfaceC2830 interfaceC2830) {
        ArrayList arrayList = this.f22920;
        if (arrayList.contains(interfaceC2830)) {
            return;
        }
        arrayList.add(interfaceC2830);
    }

    @Override // p067l.InterfaceC22753
    /* JADX INFO: renamed from: ֫ */
    public final long mo4020(C5318 c5318) throws IOException {
        if (this.f22923 != null) {
            throw new IOException("Data source is already open");
        }
        C6659 c6659M11510 = c5318.m11510();
        c6659M11510.m15165(this.f22919);
        C5318 c5318M15161 = c6659M11510.m15161();
        long j = c5318.f12516;
        if (j == -1) {
            j = C14849.FOREVER_NS;
        }
        long jMin = Math.min(X931RNG.BLOCK64_RESEED_MAX, j);
        C24905 c24905 = this.f22922;
        C17762 c17762M54688 = c24905.m54688();
        InterfaceC16716 interfaceC16716M25970 = C11221.m25970(c24905);
        long jMo40364 = c17762M54688 != null ? c17762M54688.mo40364(this.f22919, c5318.f12521, j) : -1L;
        if (jMo40364 >= jMin) {
            if (jMo40364 < j) {
                j = (jMo40364 / X931RNG.BLOCK64_RESEED_MAX) * X931RNG.BLOCK64_RESEED_MAX;
            }
            c5318M15161 = c5318M15161.m11509(0L, j);
            this.f22923 = interfaceC16716M25970.mo8449();
        } else {
            if (this.f22918) {
                interfaceC16716M25970 = this.f22921;
            }
            this.f22923 = interfaceC16716M25970.mo8449();
        }
        Iterator it = this.f22920.iterator();
        while (it.hasNext()) {
            this.f22923.mo8132((InterfaceC2830) it.next());
        }
        return this.f22923.mo4020(c5318M15161);
    }

    @Override // p067l.InterfaceC11649
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        InterfaceC22753 interfaceC22753 = this.f22923;
        if (interfaceC22753 == null) {
            throw new IOException("Data source is not open");
        }
        return interfaceC22753.read(bArr, i, i2);
    }

    @Override // p067l.InterfaceC22753
    /* JADX INFO: renamed from: ܿ */
    public final Uri mo4021() {
        InterfaceC22753 interfaceC22753 = this.f22923;
        if (interfaceC22753 == null) {
            return null;
        }
        return interfaceC22753.mo4021();
    }

    @Override // p067l.InterfaceC22753
    /* JADX INFO: renamed from: ֫ */
    public final Map mo8131() {
        InterfaceC22753 interfaceC22753 = this.f22923;
        return interfaceC22753 == null ? Collections.EMPTY_MAP : interfaceC22753.mo8131();
    }

    @Override // p067l.InterfaceC22753
    public final void close() {
        InterfaceC22753 interfaceC22753 = this.f22923;
        if (interfaceC22753 != null) {
            try {
                interfaceC22753.close();
            } finally {
                this.f22923 = null;
            }
        }
    }
}
