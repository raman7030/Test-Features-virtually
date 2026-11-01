package p067l;

/* JADX INFO: renamed from: l.ۨܳۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: N1MQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C13542 {

    /* JADX INFO: renamed from: ֫ */
    public C8177 f38091;

    /* JADX INFO: renamed from: ۧ */
    public int f38092;

    /* JADX INFO: renamed from: ܽ */
    public int f38093;

    /* JADX INFO: renamed from: ᩳ */
    public C8177 f38094;

    public C13542(int i) {
        this.f38092 = i;
        this.f38093 = i;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m30832(int i, int i2) {
        int i3 = this.f38092;
        int i4 = this.f38093;
        C8177 c8177 = new C8177(i3, i4, i, i2);
        C8177 c8178 = this.f38094;
        if (c8178 != null) {
            c8178.f21586 = c8177;
        } else {
            this.f38091 = c8177;
        }
        this.f38094 = c8177;
        this.f38092 = i3 + i;
        this.f38093 = i4 + i2;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m30831(int i) {
        this.f38092 += i;
        this.f38093 += i;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C8177 m30830() {
        return this.f38091;
    }
}
