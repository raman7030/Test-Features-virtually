package l;

import java.net.MalformedURLException;

/* JADX INFO: renamed from: l.ۨۚ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: T9UW */
/* JADX INFO: loaded from: classes4.dex */
public final class C11504 extends C12914 {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final int f34360;

    @Override // l.C12914
    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int mo28329() {
        return 16;
    }

    public C11504(String str, InterfaceC18663 interfaceC18663) throws MalformedURLException {
        super(str, interfaceC18663);
        this.f34360 = 27198979;
        m31370();
        if (!this.f38759.m41524()) {
            throw new MalformedURLException("Named pipes are only valid on IPC$");
        }
        this.f38759.m41516(16);
    }

    @Override // l.C12914
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo28326(C6523 c6523, C20635 c20635) {
        c6523.m18037();
        c20635.m47222();
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int m28327() {
        return this.f34360;
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final InterfaceC13619 m28328() {
        return new C22792(this);
    }
}
