package l;

import android.os.Looper;

/* JADX INFO: renamed from: l.ۨۗ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: Z8PT */
/* JADX INFO: loaded from: classes3.dex */
public final class C11428 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f34177;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public Looper f34178;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f34179;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public Object f34180;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final InterfaceC5783 f34181;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final InterfaceC10017 f34182;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m28237(boolean z) {
        notifyAll();
    }

    public C11428(InterfaceC10017 interfaceC10017, InterfaceC5783 interfaceC5783, AbstractC4846 abstractC4846, int i, C14185 c14185, Looper looper) {
        this.f34182 = interfaceC10017;
        this.f34181 = interfaceC5783;
        this.f34178 = looper;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final InterfaceC5783 m28239() {
        return this.f34181;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m28235(int i) {
        C22632.m50634(!this.f34177);
        this.f34179 = i;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m28241() {
        return this.f34179;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m28236(Object obj) {
        C22632.m50634(!this.f34177);
        this.f34180 = obj;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Object m28238() {
        return this.f34180;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Looper m28234() {
        return this.f34178;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m28240() {
        C22632.m50634(!this.f34177);
        this.f34177 = true;
        ((C19936) this.f34182).m46004(this);
    }
}
