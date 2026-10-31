package l;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: l.᩵ܰܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 92JP */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC19506 implements Executor {
    INSTANCE;

    @Override // java.lang.Enum
    public String toString() {
        return "MoreExecutors.directExecutor()";
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        runnable.run();
    }
}
