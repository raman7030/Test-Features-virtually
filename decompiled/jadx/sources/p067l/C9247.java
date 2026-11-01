package p067l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.۟ۙۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: N660 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9247 extends AbstractC10588 {

    /* JADX INFO: renamed from: ۜ */
    public ArrayList f25071;

    /* JADX INFO: renamed from: ۢ */
    public int f25072;

    /* JADX INFO: renamed from: ᩷ */
    public int f25073;

    /* JADX INFO: renamed from: ᩻ */
    public C23329 f25074;

    @Override // p067l.AbstractC10588
    /* JADX INFO: renamed from: ֫ */
    public final void mo5551(AbstractC17054 abstractC17054) {
        ArrayList arrayList = this.f25071;
        int size = arrayList.size();
        C3644[] c3644Arr = new C3644[size];
        for (int i = 0; i < size; i++) {
            c3644Arr[i] = ((C23329) arrayList.get(i)).m51953();
        }
        abstractC17054.mo30325(this.f25072, this.f25073, this.f25074.m51953(), c3644Arr);
        m24382(abstractC17054);
    }
}
