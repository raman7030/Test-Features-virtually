package p067l;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: renamed from: l.ۖ֨֫, reason: contains not printable characters */
/* JADX INFO: compiled from: R5PD */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ThreadFactoryC4451 implements ThreadFactory {
    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "ExoPlayer:AudioTrackReleaseThread");
    }
}
