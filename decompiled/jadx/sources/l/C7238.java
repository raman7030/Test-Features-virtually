package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.۟ۙۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: N660 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7238 extends AbstractC8649 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public ArrayList f22188;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f22189;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f22190;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C22055 f22191;

    @Override // l.AbstractC8649
    /* JADX INFO: renamed from: ֫ */
    public final void mo3237(AbstractC15452 abstractC15452) {
        ArrayList arrayList = this.f22188;
        int size = arrayList.size();
        C1342[] c1342Arr = new C1342[size];
        for (int i = 0; i < size; i++) {
            c1342Arr[i] = ((C22055) arrayList.get(i)).m49617();
        }
        abstractC15452.mo28281(this.f22189, this.f22190, this.f22191.m49617(), c1342Arr);
        m22413(abstractC15452);
    }
}
