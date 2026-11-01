package p067l;

import java.util.Iterator;
import java.util.stream.BaseStream;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

/* JADX INFO: renamed from: l.ᩳ۟ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C19394 implements InterfaceC14147 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ BaseStream f57883a;

    public /* synthetic */ C19394(BaseStream baseStream) {
        this.f57883a = baseStream;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ InterfaceC14147 m44142b(BaseStream baseStream) {
        if (baseStream == null) {
            return null;
        }
        if (baseStream instanceof C20065) {
            return ((C20065) baseStream).f60957a;
        }
        if (baseStream instanceof DoubleStream) {
            return C12452.m28669b((DoubleStream) baseStream);
        }
        if (baseStream instanceof IntStream) {
            return C9453.convert((IntStream) baseStream);
        }
        if (baseStream instanceof LongStream) {
            return C14544.m33214b((LongStream) baseStream);
        }
        return baseStream instanceof Stream ? C3971.m7917b((Stream) baseStream) : new C19394(baseStream);
    }

    @Override // p067l.InterfaceC14147, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.f57883a.close();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        BaseStream baseStream = this.f57883a;
        if (obj instanceof C19394) {
            obj = ((C19394) obj).f57883a;
        }
        return baseStream.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f57883a.hashCode();
    }

    @Override // p067l.InterfaceC14147
    public final /* synthetic */ boolean isParallel() {
        return this.f57883a.isParallel();
    }

    @Override // p067l.InterfaceC14147
    public final /* synthetic */ Iterator iterator() {
        return this.f57883a.iterator();
    }

    @Override // p067l.InterfaceC14147
    public final /* synthetic */ InterfaceC14147 onClose(Runnable runnable) {
        return m44142b(this.f57883a.onClose(runnable));
    }

    @Override // p067l.InterfaceC14147, p067l.InterfaceC20165
    public final /* synthetic */ InterfaceC14147 parallel() {
        return m44142b(this.f57883a.parallel());
    }

    @Override // p067l.InterfaceC14147, p067l.InterfaceC20165
    public final /* synthetic */ InterfaceC14147 sequential() {
        return m44142b(this.f57883a.sequential());
    }

    @Override // p067l.InterfaceC14147
    public final /* synthetic */ InterfaceC16847 spliterator() {
        return C5508.m12135a(this.f57883a.spliterator());
    }

    @Override // p067l.InterfaceC14147
    public final /* synthetic */ InterfaceC14147 unordered() {
        return m44142b(this.f57883a.unordered());
    }
}
