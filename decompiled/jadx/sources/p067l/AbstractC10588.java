package p067l;

import java.util.List;

/* JADX INFO: renamed from: l.ۡۙۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: L62N */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC10588 {

    /* JADX INFO: renamed from: ֫ */
    public int f29316 = -1;

    /* JADX INFO: renamed from: ۧ */
    public List f29317;

    /* JADX INFO: renamed from: ܳ */
    public List f29318;

    /* JADX INFO: renamed from: ܽ */
    public AbstractC10588 f29319;

    /* JADX INFO: renamed from: ܿ */
    public AbstractC10588 f29320;

    /* JADX INFO: renamed from: ᩳ */
    public int f29321;

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo5551(AbstractC17054 abstractC17054);

    public AbstractC10588(int i) {
        this.f29321 = i;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m24382(AbstractC17054 abstractC17054) {
        List list = this.f29318;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                C12561 c12561 = (C12561) this.f29318.get(i);
                c12561.m39204(abstractC17054.mo29010(c12561.f35284, c12561.f35285, c12561.f51590, true));
            }
        }
        List list2 = this.f29317;
        if (list2 != null) {
            int size2 = list2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                C12561 c12562 = (C12561) this.f29317.get(i2);
                c12562.m39204(abstractC17054.mo29010(c12562.f35284, c12562.f35285, c12562.f51590, false));
            }
        }
    }
}
