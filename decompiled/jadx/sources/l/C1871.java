package l;

import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.֫ܰ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: H4E0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1871 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f6376 = -1;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f6377 = -1;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f6378 = -1;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f6379;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f6380;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m6198() {
        long seconds = TimeUnit.DAYS.toSeconds(3);
        this.f6376 = seconds > 2147483647L ? Integer.MAX_VALUE : (int) seconds;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m6199() {
        long seconds = TimeUnit.DAYS.toSeconds(3);
        this.f6378 = seconds > 2147483647L ? Integer.MAX_VALUE : (int) seconds;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C11044 m6197() {
        return new C11044(this);
    }
}
