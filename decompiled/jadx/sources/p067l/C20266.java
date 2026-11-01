package p067l;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: l.ᩴܶ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: N8HI */
/* JADX INFO: loaded from: classes5.dex */
public final class C20266 implements InterfaceC22753 {

    /* JADX INFO: renamed from: ֫ */
    public long f62634;

    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC22753 f62635;

    /* JADX INFO: renamed from: ܽ */
    public Uri f62636;

    /* JADX INFO: renamed from: ᩳ */
    public Map f62637;

    public C20266(InterfaceC22753 interfaceC22753) {
        interfaceC22753.getClass();
        this.f62635 = interfaceC22753;
        this.f62636 = Uri.EMPTY;
        this.f62637 = Collections.EMPTY_MAP;
    }

    /* JADX INFO: renamed from: ᩷ */
    public final void m45775() {
        this.f62634 = 0L;
    }

    /* JADX INFO: renamed from: ܳ */
    public final long m45774() {
        return this.f62634;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final Uri m45776() {
        return this.f62636;
    }

    /* JADX INFO: renamed from: ۜ */
    public final Map m45773() {
        return this.f62637;
    }

    @Override // p067l.InterfaceC22753
    /* JADX INFO: renamed from: ֫ */
    public final long mo4020(C5318 c5318) {
        InterfaceC22753 interfaceC22753 = this.f62635;
        this.f62636 = c5318.f12514;
        this.f62637 = Collections.EMPTY_MAP;
        try {
            return interfaceC22753.mo4020(c5318);
        } finally {
            Uri uriMo4021 = interfaceC22753.mo4021();
            if (uriMo4021 != null) {
                this.f62636 = uriMo4021;
            }
            this.f62637 = interfaceC22753.mo8131();
        }
    }

    @Override // p067l.InterfaceC11649
    public final int read(byte[] bArr, int i, int i2) {
        int i3 = this.f62635.read(bArr, i, i2);
        if (i3 != -1) {
            this.f62634 += (long) i3;
        }
        return i3;
    }

    @Override // p067l.InterfaceC22753
    /* JADX INFO: renamed from: ܿ */
    public final Uri mo4021() {
        return this.f62635.mo4021();
    }

    @Override // p067l.InterfaceC22753
    /* JADX INFO: renamed from: ֫ */
    public final Map mo8131() {
        return this.f62635.mo8131();
    }

    @Override // p067l.InterfaceC22753
    public final void close() {
        this.f62635.close();
    }

    @Override // p067l.InterfaceC22753
    /* JADX INFO: renamed from: ֫ */
    public final void mo8132(InterfaceC2830 interfaceC2830) {
        interfaceC2830.getClass();
        this.f62635.mo8132(interfaceC2830);
    }
}
