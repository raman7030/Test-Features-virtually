package p067l;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: l.֨ۘ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: PAHH */
/* JADX INFO: loaded from: classes2.dex */
public final class C3186 extends ReentrantLock {
    public static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: ֫ */
    public final void m5485(Condition condition) {
        C21230.forEach(getWaitingThreads(condition), new C7210());
    }
}
