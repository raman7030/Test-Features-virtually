package p067l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۚ᩶֡, reason: contains not printable characters */
/* JADX INFO: compiled from: F5QL */
/* JADX INFO: loaded from: classes3.dex */
public final class C7663 extends C20404 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C23086 f20097;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ ArrayList f20098;

    @Override // p067l.C20404
    /* JADX INFO: renamed from: ֫ */
    public final void mo17731(int i, int i2, int i3, boolean z) {
        C5651 c5651 = this.f20097.f18865;
        ArrayList arrayList = this.f20098;
        if (i2 != -1) {
            arrayList.add(c5651.f13748.m3722(i2));
        }
        if (i3 != -1) {
            arrayList.add(c5651.f13727.m3722(i3));
        }
    }

    @Override // p067l.C20404
    /* JADX INFO: renamed from: ֫ */
    public final void mo17730(int i, int i2, int i3, int i4, boolean z) {
        C5651 c5651 = this.f20097.f18865;
        ArrayList arrayList = this.f20098;
        if (i2 != -1) {
            arrayList.add(c5651.f13748.m3722(i2));
        }
        if (i3 != -1) {
            arrayList.add(c5651.f13727.m3722(i3));
        }
        if (i4 != -1) {
            arrayList.add(c5651.f13748.m3722(i4));
        }
    }

    @Override // p067l.C20404
    /* JADX INFO: renamed from: ֫ */
    public final void mo17729(int i) {
        if (i != -1) {
            this.f20098.add(this.f20097.f18865.f13748.m3722(i));
        }
    }

    public C7663(C23086 c23086, ArrayList arrayList) {
        this.f20097 = c23086;
        this.f20098 = arrayList;
    }
}
