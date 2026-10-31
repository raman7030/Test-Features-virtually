package l;

import java.io.IOException;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.֨᩸ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C1395 implements WatchService {
    public final /* synthetic */ InterfaceC5235 a;

    public /* synthetic */ C1395(InterfaceC5235 interfaceC5235) {
        this.a = interfaceC5235;
    }

    public static /* synthetic */ WatchService b(InterfaceC5235 interfaceC5235) {
        if (interfaceC5235 == null) {
            return null;
        }
        return interfaceC5235 instanceof C0689 ? ((C0689) interfaceC5235).a : new C1395(interfaceC5235);
    }

    @Override // java.nio.file.WatchService, java.io.Closeable, java.lang.AutoCloseable
    public final /* synthetic */ void close() throws IOException {
        this.a.close();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC5235 interfaceC5235 = this.a;
        if (obj instanceof C1395) {
            obj = ((C1395) obj).a;
        }
        return interfaceC5235.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.file.WatchService
    public final /* synthetic */ WatchKey poll() {
        return C19035.a(this.a.poll());
    }

    @Override // java.nio.file.WatchService
    public final /* synthetic */ WatchKey poll(long j, TimeUnit timeUnit) {
        return C19035.a(this.a.poll(j, timeUnit));
    }

    @Override // java.nio.file.WatchService
    public final /* synthetic */ WatchKey take() {
        return C19035.a(this.a.take());
    }
}
