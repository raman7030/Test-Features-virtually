package l;

import java.io.IOException;
import java.nio.file.WatchService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.֡᩸ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C0689 implements InterfaceC5235 {
    public final /* synthetic */ WatchService a;

    public /* synthetic */ C0689(WatchService watchService) {
        this.a = watchService;
    }

    public static /* synthetic */ InterfaceC5235 b(WatchService watchService) {
        if (watchService == null) {
            return null;
        }
        return watchService instanceof C1395 ? ((C1395) watchService).a : new C0689(watchService);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final /* synthetic */ void close() throws IOException {
        this.a.close();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        WatchService watchService = this.a;
        if (obj instanceof C0689) {
            obj = ((C0689) obj).a;
        }
        return watchService.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // l.InterfaceC5235
    public final /* synthetic */ InterfaceC0295 poll() {
        return C2807.a(this.a.poll());
    }

    @Override // l.InterfaceC5235
    public final /* synthetic */ InterfaceC0295 poll(long j, TimeUnit timeUnit) {
        return C2807.a(this.a.poll(j, timeUnit));
    }

    @Override // l.InterfaceC5235
    public final /* synthetic */ InterfaceC0295 take() {
        return C2807.a(this.a.take());
    }
}
