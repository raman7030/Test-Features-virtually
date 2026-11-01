package p067l;

import android.os.ConditionVariable;

/* JADX INFO: renamed from: l.ۡ᩸֫, reason: contains not printable characters */
/* JADX INFO: compiled from: M74O */
/* JADX INFO: loaded from: classes3.dex */
public final class C11058 extends Thread {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C17762 f30623;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ ConditionVariable f30624;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11058(C17762 c17762, ConditionVariable conditionVariable) {
        super("ExoPlayer:SimpleCacheInit");
        this.f30623 = c17762;
        this.f30624 = conditionVariable;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        synchronized (this.f30623) {
            this.f30624.open();
            C17762.m40346(this.f30623);
            this.f30623.f53047.getClass();
        }
    }
}
