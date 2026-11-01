package p067l;

import java.io.IOException;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.֨᩸ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C3695 implements WatchService {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC7344 f7804a;

    public /* synthetic */ C3695(InterfaceC7344 interfaceC7344) {
        this.f7804a = interfaceC7344;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ WatchService m7126b(InterfaceC7344 interfaceC7344) {
        if (interfaceC7344 == null) {
            return null;
        }
        return interfaceC7344 instanceof C3024 ? ((C3024) interfaceC7344).f5401a : new C3695(interfaceC7344);
    }

    @Override // java.nio.file.WatchService, java.io.Closeable, java.lang.AutoCloseable
    public final /* synthetic */ void close() throws IOException {
        this.f7804a.close();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC7344 interfaceC7344 = this.f7804a;
        if (obj instanceof C3695) {
            obj = ((C3695) obj).f7804a;
        }
        return interfaceC7344.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f7804a.hashCode();
    }

    @Override // java.nio.file.WatchService
    public final /* synthetic */ WatchKey poll() {
        return C20460.m46155a(this.f7804a.poll());
    }

    @Override // java.nio.file.WatchService
    public final /* synthetic */ WatchKey poll(long j, TimeUnit timeUnit) {
        return C20460.m46155a(this.f7804a.poll(j, timeUnit));
    }

    @Override // java.nio.file.WatchService
    public final /* synthetic */ WatchKey take() {
        return C20460.m46155a(this.f7804a.take());
    }
}
