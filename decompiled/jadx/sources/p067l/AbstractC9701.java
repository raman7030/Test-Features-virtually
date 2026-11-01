package p067l;

/* JADX INFO: renamed from: l.۟᩷۠, reason: contains not printable characters */
/* JADX INFO: compiled from: O44L */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC9701 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C16091 f26758;

    /* JADX INFO: renamed from: ۧ */
    public int f26759;

    /* JADX INFO: renamed from: ֫ */
    public void mo19298() {
    }

    /* JADX INFO: renamed from: ۧ */
    public void mo19301() {
    }

    /* JADX INFO: renamed from: ᩻ */
    public int mo19305() {
        return 0;
    }

    public AbstractC9701(C16091 c16091, int i) {
        this.f26758 = c16091;
        this.f26759 = i;
    }

    /* JADX INFO: renamed from: ᩳ */
    public AbstractC9701 mo8027() {
        throw new AssertionError();
    }

    /* JADX INFO: renamed from: ܳ */
    public void mo8025() {
        throw new AssertionError("store unsupported: " + this);
    }

    /* JADX INFO: renamed from: ܽ */
    public AbstractC9701 mo22646() {
        throw new AssertionError(this);
    }

    /* JADX INFO: renamed from: ۧ */
    public void mo19302(int i) {
        this.f26758.f47349[i].mo19301();
    }

    /* JADX INFO: renamed from: ܿ */
    public C8360 mo19303() {
        mo8027();
        return this.f26758.m36600(EnumC19222.f57460);
    }

    /* JADX INFO: renamed from: ֫ */
    public AbstractC9701 mo22645(int i) {
        int i2 = this.f26759;
        if (i2 == i) {
            return this;
        }
        mo8027();
        int iM7033 = C3666.m7033(i2);
        int iM7034 = C3666.m7033(i);
        C16091 c16091 = this.f26758;
        if (iM7033 != iM7034) {
            c16091.f47348.m7062((iM7033 * 3) + 133 + (iM7034 > iM7033 ? iM7034 - 1 : iM7034));
        }
        if (i != iM7034) {
            c16091.f47348.m7062(i + 140);
        }
        return c16091.f47349[i];
    }
}
