package p067l;

import java.net.MalformedURLException;

/* JADX INFO: renamed from: l.ۨۚ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: T9UW */
/* JADX INFO: loaded from: classes4.dex */
public final class C13302 extends C14642 {

    /* JADX INFO: renamed from: ۟ */
    public final int f37358;

    @Override // p067l.C14642
    /* JADX INFO: renamed from: ᩻ */
    public final int mo30373() {
        return 16;
    }

    public C13302(String str, InterfaceC20106 interfaceC20106) throws MalformedURLException {
        super(str, interfaceC20106);
        this.f37358 = 27198979;
        m33456();
        if (!this.f41801.m43770()) {
            throw new MalformedURLException("Named pipes are only valid on IPC$");
        }
        this.f41801.m43762(16);
    }

    @Override // p067l.C14642
    /* JADX INFO: renamed from: ֫ */
    public final void mo30370(C8568 c8568, C21980 c21980) {
        c8568.m19986();
        c21980.m49549();
    }

    /* JADX INFO: renamed from: ᩴ */
    public final int m30371() {
        return this.f37358;
    }

    /* JADX INFO: renamed from: ᩵ */
    public final InterfaceC15312 m30372() {
        return new C24030(this);
    }
}
