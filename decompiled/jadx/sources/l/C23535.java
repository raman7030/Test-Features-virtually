package l;

import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: renamed from: l.᩻ۜܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: F54P */
/* JADX INFO: loaded from: classes2.dex */
public final class C23535 extends AbstractC10460 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final ArrayList f75561;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f75562;

    public C23535(C17891 c17891, C5896 c5896, C1993 c1993) {
        super(c17891, 0);
        this.f75561 = new ArrayList();
        this.f75562 = m26322(c5896, c1993);
    }

    @Override // l.InterfaceC0748
    /* JADX INFO: renamed from: ᩷ */
    public final int mo2878() {
        return this.f75562;
    }

    @Override // l.InterfaceC0748
    /* JADX INFO: renamed from: ۜ֫ */
    public final int mo2871() {
        return this.f75561.size();
    }

    @Override // l.InterfaceC0748
    /* JADX INFO: renamed from: ܿ */
    public final InterfaceC7099 mo2877(int i) {
        return (C6393) this.f75561.get(i);
    }

    @Override // l.InterfaceC0748
    /* JADX INFO: renamed from: ۢ֫ */
    public final void mo2873() {
        Collections.sort(this.f75561, new C12576());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m51996(C6393 c6393) {
        int iMo2344;
        this.f75561.add(c6393);
        if (!c6393.mo2345() || (iMo2344 = c6393.mo2344() + 1) <= this.f75562) {
            return;
        }
        this.f75562 = iMo2344;
    }

    @Override // l.AbstractC10460, l.InterfaceC0748
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC9922 mo2869() {
        return (C23326) super.mo2869();
    }

    @Override // l.AbstractC10460, l.InterfaceC0748
    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC4277 mo2874() {
        return (C17891) super.mo2874();
    }

    @Override // l.AbstractC10460, l.InterfaceC0748
    /* JADX INFO: renamed from: ۧ */
    public final C17891 mo2874() {
        return (C17891) super.mo2874();
    }
}
