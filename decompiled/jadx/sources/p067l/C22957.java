package p067l;

/* JADX INFO: renamed from: l.᩸ܶܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: C1ZO */
/* JADX INFO: loaded from: classes4.dex */
public final class C22957 {

    /* JADX INFO: renamed from: ֫ */
    public AbstractViewOnLongClickListenerC16250 f72220;

    /* JADX INFO: renamed from: ۧ */
    public int f72221;

    /* JADX INFO: renamed from: ܽ */
    public int f72222;

    /* JADX INFO: renamed from: ᩳ */
    public boolean f72223;

    /* JADX INFO: renamed from: ֫ */
    public final void m51277(AbstractViewOnLongClickListenerC16250 abstractViewOnLongClickListenerC16250) {
        this.f72220 = abstractViewOnLongClickListenerC16250;
        this.f72221 = 0;
        this.f72223 = false;
        this.f72222 = 0;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m51278(C18262 c18262, int i) {
        if (this.f72220 != c18262) {
            m51277((AbstractViewOnLongClickListenerC16250) c18262);
        }
        this.f72221 = i;
        this.f72223 = true;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m51275(C18262 c18262) {
        if (this.f72220 != c18262) {
            return -1;
        }
        int i = this.f72222 + 1;
        this.f72222 = i;
        return i;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m51280(AbstractC5462 abstractC5462) {
        if (this.f72220 != abstractC5462 || !this.f72223) {
            return false;
        }
        this.f72223 = false;
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m51279(int i, Object obj) {
        return this.f72220 == obj && this.f72222 == i;
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m51282() {
        return this.f72221;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m51276() {
        this.f72220 = null;
        this.f72221 = 0;
        this.f72223 = false;
        this.f72222 = 0;
    }

    /* JADX INFO: renamed from: ۧ */
    public final Object m51281() {
        return this.f72220;
    }
}
