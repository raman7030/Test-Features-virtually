package p067l;

import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.֫ܰ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: H4E0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4147 {

    /* JADX INFO: renamed from: ֫ */
    public int f9158 = -1;

    /* JADX INFO: renamed from: ۧ */
    public int f9159 = -1;

    /* JADX INFO: renamed from: ܽ */
    public int f9160 = -1;

    /* JADX INFO: renamed from: ܿ */
    public boolean f9161;

    /* JADX INFO: renamed from: ᩳ */
    public boolean f9162;

    /* JADX INFO: renamed from: ۧ */
    public final void m8400() {
        long seconds = TimeUnit.DAYS.toSeconds(3);
        this.f9158 = seconds > 2147483647L ? Integer.MAX_VALUE : (int) seconds;
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m8401() {
        long seconds = TimeUnit.DAYS.toSeconds(3);
        this.f9160 = seconds > 2147483647L ? Integer.MAX_VALUE : (int) seconds;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C12865 m8399() {
        return new C12865(this);
    }
}
