package l;

import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: renamed from: l.᩵ۜܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: F54P */
/* JADX INFO: loaded from: classes5.dex */
public final class C19303 extends AbstractC10460 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final ArrayList f60713;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f60714;

    public C19303(C18597 c18597, C5896 c5896, C1993 c1993) {
        super(c18597, 0);
        this.f60713 = new ArrayList();
        this.f60714 = m26322(c5896, c1993);
    }

    @Override // l.InterfaceC0748
    /* JADX INFO: renamed from: ᩷ */
    public final int mo2878() {
        return this.f60714;
    }

    @Override // l.InterfaceC0748
    /* JADX INFO: renamed from: ۜ֫ */
    public final int mo2871() {
        return this.f60713.size();
    }

    @Override // l.InterfaceC0748
    /* JADX INFO: renamed from: ܿ */
    public final InterfaceC7099 mo2877(int i) {
        return (C8719) this.f60713.get(i);
    }

    @Override // l.InterfaceC0748
    /* JADX INFO: renamed from: ۢ֫ */
    public final void mo2873() {
        Collections.sort(this.f60713, new C12576());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m44495(C8719 c8719) {
        int iMo2344;
        this.f60713.add(c8719);
        if (!c8719.mo2345() || (iMo2344 = c8719.mo2344() + 1) <= this.f60714) {
            return;
        }
        this.f60714 = iMo2344;
    }

    @Override // l.AbstractC10460, l.InterfaceC0748
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC9922 mo2869() {
        return (C5191) super.mo2869();
    }

    @Override // l.AbstractC10460, l.InterfaceC0748
    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC4277 mo2874() {
        return (C18597) super.mo2874();
    }

    @Override // l.AbstractC10460, l.InterfaceC0748
    /* JADX INFO: renamed from: ۧ */
    public final C18597 mo2874() {
        return (C18597) super.mo2874();
    }
}
