package l;

import android.os.Build;

/* JADX INFO: renamed from: l.᩶ۤ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: P8OZ */
/* JADX INFO: loaded from: classes5.dex */
public final class C20101 implements InterfaceC21573 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4578 f65099;

    public C20101(C4578 c4578) {
        this.f65099 = c4578;
    }

    @Override // l.InterfaceC21573
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void mo46356() {
        this.f65099.m13459();
    }

    @Override // l.InterfaceC21573
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo46345() {
        this.f65099.f14615 = true;
    }

    @Override // l.InterfaceC21573
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo46347(long j) {
        this.f65099.f14614.m1911(j);
    }

    @Override // l.InterfaceC21573
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo46348(long j, int i, long j2) {
        this.f65099.f14614.m1912(j, i, j2);
    }

    @Override // l.InterfaceC21573
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo46351(boolean z) {
        this.f65099.f14614.m1919(z);
    }

    @Override // l.InterfaceC21573
    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void mo46355() {
        InterfaceC7194 interfaceC7194M37228 = this.f65099.m37228();
        if (interfaceC7194M37228 != null) {
            interfaceC7194M37228.mo1317();
        }
    }

    @Override // l.InterfaceC21573
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void mo46352() {
        InterfaceC7194 interfaceC7194M37228 = this.f65099.m37228();
        if (interfaceC7194M37228 != null) {
            interfaceC7194M37228.mo1316();
        }
    }

    @Override // l.InterfaceC21573
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo46349(Exception exc) {
        C19956.m46034("Audio sink error", exc);
        this.f65099.f14614.m1920(exc);
    }

    @Override // l.InterfaceC21573
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void mo46354() {
        this.f65099.m14364();
    }

    @Override // l.InterfaceC21573
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo46350(C1111 c1111) {
        this.f65099.f14614.m1916(c1111);
    }

    @Override // l.InterfaceC21573
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void mo46353(C1111 c1111) {
        this.f65099.f14614.m1921(c1111);
    }

    @Override // l.InterfaceC21573
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo46346(int i) {
        int i2 = Build.VERSION.SDK_INT;
        C4578 c4578 = this.f65099;
        if (i2 >= 35 && c4578.f14603 != null) {
            c4578.f14603.m28636(i);
        }
        c4578.f14614.m1910(i);
    }
}
