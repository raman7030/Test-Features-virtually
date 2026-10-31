package l;

import java.util.List;

/* JADX INFO: renamed from: l.ۡۙۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: L62N */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC8649 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f26398 = -1;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public List f26399;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public List f26400;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public AbstractC8649 f26401;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public AbstractC8649 f26402;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f26403;

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo3237(AbstractC15452 abstractC15452);

    public AbstractC8649(int i) {
        this.f26403 = i;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m22413(AbstractC15452 abstractC15452) {
        List list = this.f26400;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                C10725 c10725 = (C10725) this.f26400.get(i);
                c10725.m37037(abstractC15452.mo26965(c10725.f32310, c10725.f32311, c10725.f48452, true));
            }
        }
        List list2 = this.f26399;
        if (list2 != null) {
            int size2 = list2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                C10725 c10726 = (C10725) this.f26399.get(i2);
                c10726.m37037(abstractC15452.mo26965(c10726.f32310, c10726.f32311, c10726.f48452, false));
            }
        }
    }
}
