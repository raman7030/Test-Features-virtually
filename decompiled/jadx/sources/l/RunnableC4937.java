package l;

/* JADX INFO: renamed from: l.ۙ᩹ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q1R8 */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC4937 implements Runnable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC10582 f15569;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f15570;

    public RunnableC4937(ActivityC10582 activityC10582, String str) {
        this.f15569 = activityC10582;
        this.f15570 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ActivityC10582 activityC10582 = this.f15569;
        if (activityC10582.isFinishing()) {
            return;
        }
        C17637 c17637M41100 = activityC10582.f31764.f38219.m41100();
        if (c17637M41100 == null || c17637M41100.m41257() == 0) {
            C4925.m14315(this);
        } else {
            activityC10582.f31764.f38219.m8717(this.f15570.toString());
        }
    }
}
