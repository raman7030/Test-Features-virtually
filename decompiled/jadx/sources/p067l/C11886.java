package p067l;

import java.util.HashSet;

/* JADX INFO: renamed from: l.ۤۗ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 99SU */
/* JADX INFO: loaded from: classes3.dex */
public final class C11886 implements InterfaceC5180 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C23955 f33123;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ HashSet f33124;

    public C11886(C23955 c23955, HashSet hashSet) {
        this.f33123 = c23955;
        this.f33124 = hashSet;
    }

    @Override // p067l.InterfaceC5180
    /* JADX INFO: renamed from: ܽ */
    public final void mo11093(int i) {
        this.f33124.add(Integer.valueOf(i));
        C23955 c23955 = this.f33123;
        if (c23955.f76106.contains(Integer.valueOf(i))) {
            return;
        }
        c23955.f76108.add(Integer.valueOf(i));
    }

    @Override // p067l.InterfaceC5180
    /* JADX INFO: renamed from: ֫ */
    public final void mo11091(int i) {
        C23955 c23955 = this.f33123;
        c23955.f76106.add(Integer.valueOf(i));
        if (this.f33124.contains(Integer.valueOf(i))) {
            return;
        }
        c23955.f76113.add(Integer.valueOf(i));
    }

    @Override // p067l.InterfaceC5180
    /* JADX INFO: renamed from: ۧ */
    public final void mo11092(int i) {
        mo11093(i);
    }

    @Override // p067l.InterfaceC5180
    /* JADX INFO: renamed from: ᩳ */
    public final void mo11094(int i) {
        mo11091(i);
    }
}
