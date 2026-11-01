package p067l;

/* JADX INFO: renamed from: l.ۛܳۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: N1MQ */
/* JADX INFO: loaded from: classes2.dex */
public final class C8177 {

    /* JADX INFO: renamed from: ֫ */
    public final int f21583;

    /* JADX INFO: renamed from: ۧ */
    public final int f21584;

    /* JADX INFO: renamed from: ܽ */
    public final int f21585;

    /* JADX INFO: renamed from: ܿ */
    public C8177 f21586 = null;

    /* JADX INFO: renamed from: ᩳ */
    public final int f21587;

    public C8177(int i, int i2, int i3, int i4) {
        this.f21585 = i;
        this.f21587 = i2;
        this.f21584 = i4;
        this.f21583 = i3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("change[inserted=");
        sb.append(this.f21584);
        sb.append(", deleted=");
        sb.append(this.f21583);
        sb.append(", line0=");
        sb.append(this.f21585);
        sb.append(", line1=");
        return C5410.m11876(this.f21587, "]", sb);
    }
}
