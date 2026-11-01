package p067l;

import java.io.IOException;
import java.nio.file.WatchService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.֡᩸ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C3024 implements InterfaceC7344 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ WatchService f5401a;

    public /* synthetic */ C3024(WatchService watchService) {
        this.f5401a = watchService;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ InterfaceC7344 m5116b(WatchService watchService) {
        if (watchService == null) {
            return null;
        }
        return watchService instanceof C3695 ? ((C3695) watchService).f7804a : new C3024(watchService);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final /* synthetic */ void close() throws IOException {
        this.f5401a.close();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        WatchService watchService = this.f5401a;
        if (obj instanceof C3024) {
            obj = ((C3024) obj).f5401a;
        }
        return watchService.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f5401a.hashCode();
    }

    @Override // p067l.InterfaceC7344
    public final /* synthetic */ InterfaceC2649 poll() {
        return C5037.m10742a(this.f5401a.poll());
    }

    @Override // p067l.InterfaceC7344
    public final /* synthetic */ InterfaceC2649 poll(long j, TimeUnit timeUnit) {
        return C5037.m10742a(this.f5401a.poll(j, timeUnit));
    }

    @Override // p067l.InterfaceC7344
    public final /* synthetic */ InterfaceC2649 take() {
        return C5037.m10742a(this.f5401a.take());
    }
}
