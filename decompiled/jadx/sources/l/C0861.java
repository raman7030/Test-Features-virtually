package l;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: l.֨ۘ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: PAHH */
/* JADX INFO: loaded from: classes2.dex */
public final class C0861 extends ReentrantLock {
    public static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m3171(Condition condition) {
        C19846.forEach(getWaitingThreads(condition), new C5095());
    }
}
