package l;

import java.util.HashSet;

/* JADX INFO: renamed from: l.ۤۗ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 99SU */
/* JADX INFO: loaded from: classes3.dex */
public final class C10015 implements InterfaceC2959 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22714 f30164;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ HashSet f30165;

    public C10015(C22714 c22714, HashSet hashSet) {
        this.f30164 = c22714;
        this.f30165 = hashSet;
    }

    @Override // l.InterfaceC2959
    /* JADX INFO: renamed from: ܽ */
    public final void mo9041(int i) {
        this.f30165.add(Integer.valueOf(i));
        C22714 c22714 = this.f30164;
        if (c22714.f73383.contains(Integer.valueOf(i))) {
            return;
        }
        c22714.f73385.add(Integer.valueOf(i));
    }

    @Override // l.InterfaceC2959
    /* JADX INFO: renamed from: ֫ */
    public final void mo9039(int i) {
        C22714 c22714 = this.f30164;
        c22714.f73383.add(Integer.valueOf(i));
        if (this.f30165.contains(Integer.valueOf(i))) {
            return;
        }
        c22714.f73390.add(Integer.valueOf(i));
    }

    @Override // l.InterfaceC2959
    /* JADX INFO: renamed from: ۧ */
    public final void mo9040(int i) {
        mo9041(i);
    }

    @Override // l.InterfaceC2959
    /* JADX INFO: renamed from: ᩳ */
    public final void mo9042(int i) {
        mo9039(i);
    }
}
