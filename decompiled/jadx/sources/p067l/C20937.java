package p067l;

import android.net.Uri;
import java.util.Map;

/* JADX INFO: renamed from: l.᩵ܶ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 474M */
/* JADX INFO: loaded from: classes5.dex */
public final class C20937 implements InterfaceC22753 {

    /* JADX INFO: renamed from: ֫ */
    public long f65734;

    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC10012 f65735;

    /* JADX INFO: renamed from: ܽ */
    public boolean f65736;

    /* JADX INFO: renamed from: ᩳ */
    public final InterfaceC22753 f65737;

    public C20937(InterfaceC22753 interfaceC22753, InterfaceC10012 interfaceC10012) {
        this.f65737 = interfaceC22753;
        interfaceC10012.getClass();
        this.f65735 = interfaceC10012;
    }

    @Override // p067l.InterfaceC22753
    /* JADX INFO: renamed from: ֫ */
    public final long mo4020(C5318 c5318) {
        long jMo4020 = this.f65737.mo4020(c5318);
        this.f65734 = jMo4020;
        if (jMo4020 == 0) {
            return 0L;
        }
        if (c5318.f12516 == -1 && jMo4020 != -1) {
            c5318 = c5318.m11509(0L, jMo4020);
        }
        this.f65736 = true;
        this.f65735.mo15697(c5318);
        return this.f65734;
    }

    @Override // p067l.InterfaceC11649
    public final int read(byte[] bArr, int i, int i2) {
        if (this.f65734 == 0) {
            return -1;
        }
        int i3 = this.f65737.read(bArr, i, i2);
        if (i3 > 0) {
            this.f65735.write(bArr, i, i3);
            long j = this.f65734;
            if (j != -1) {
                this.f65734 = j - ((long) i3);
            }
        }
        return i3;
    }

    @Override // p067l.InterfaceC22753
    /* JADX INFO: renamed from: ܿ */
    public final Uri mo4021() {
        return this.f65737.mo4021();
    }

    @Override // p067l.InterfaceC22753
    /* JADX INFO: renamed from: ֫ */
    public final Map mo8131() {
        return this.f65737.mo8131();
    }

    @Override // p067l.InterfaceC22753
    public final void close() {
        InterfaceC10012 interfaceC10012 = this.f65735;
        try {
            this.f65737.close();
        } finally {
            if (this.f65736) {
                this.f65736 = false;
                interfaceC10012.close();
            }
        }
    }

    @Override // p067l.InterfaceC22753
    /* JADX INFO: renamed from: ֫ */
    public final void mo8132(InterfaceC2830 interfaceC2830) {
        interfaceC2830.getClass();
        this.f65737.mo8132(interfaceC2830);
    }
}
