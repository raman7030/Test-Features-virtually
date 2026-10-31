package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۚ᩶֡, reason: contains not printable characters */
/* JADX INFO: compiled from: F5QL */
/* JADX INFO: loaded from: classes3.dex */
public final class C5571 extends C18977 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21799 f17257;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ArrayList f17258;

    @Override // l.C18977
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo15816(int i, int i2, int i3, boolean z) {
        C3454 c3454 = this.f17257.f16031;
        ArrayList arrayList = this.f17258;
        if (i2 != -1) {
            arrayList.add(c3454.f10947.m1314(i2));
        }
        if (i3 != -1) {
            arrayList.add(c3454.f10926.m1314(i3));
        }
    }

    @Override // l.C18977
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo15815(int i, int i2, int i3, int i4, boolean z) {
        C3454 c3454 = this.f17257.f16031;
        ArrayList arrayList = this.f17258;
        if (i2 != -1) {
            arrayList.add(c3454.f10947.m1314(i2));
        }
        if (i3 != -1) {
            arrayList.add(c3454.f10926.m1314(i3));
        }
        if (i4 != -1) {
            arrayList.add(c3454.f10947.m1314(i4));
        }
    }

    @Override // l.C18977
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo15814(int i) {
        if (i != -1) {
            this.f17258.add(this.f17257.f16031.f10947.m1314(i));
        }
    }

    public C5571(C21799 c21799, ArrayList arrayList) {
        this.f17257 = c21799;
        this.f17258 = arrayList;
    }
}
