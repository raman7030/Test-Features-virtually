package l;

/* JADX INFO: renamed from: l.᩸ܶܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: C1ZO */
/* JADX INFO: loaded from: classes4.dex */
public final class C21663 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public AbstractViewOnLongClickListenerC14606 f69516;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f69517;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f69518;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f69519;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m48928(AbstractViewOnLongClickListenerC14606 abstractViewOnLongClickListenerC14606) {
        this.f69516 = abstractViewOnLongClickListenerC14606;
        this.f69517 = 0;
        this.f69519 = false;
        this.f69518 = 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m48929(C16723 c16723, int i) {
        if (this.f69516 != c16723) {
            m48928((AbstractViewOnLongClickListenerC14606) c16723);
        }
        this.f69517 = i;
        this.f69519 = true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m48926(C16723 c16723) {
        if (this.f69516 != c16723) {
            return -1;
        }
        int i = this.f69518 + 1;
        this.f69518 = i;
        return i;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m48931(AbstractC3255 abstractC3255) {
        if (this.f69516 != abstractC3255 || !this.f69519) {
            return false;
        }
        this.f69519 = false;
        return true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m48930(int i, Object obj) {
        return this.f69516 == obj && this.f69518 == i;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m48933() {
        return this.f69517;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m48927() {
        this.f69516 = null;
        this.f69517 = 0;
        this.f69519 = false;
        this.f69518 = 0;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Object m48932() {
        return this.f69516;
    }
}
