package p067l;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.stream.BaseStream;

/* JADX INFO: renamed from: l.ᩴ۟ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C20065 implements BaseStream {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC14147 f60957a;

    public /* synthetic */ C20065(InterfaceC14147 interfaceC14147) {
        this.f60957a = interfaceC14147;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ BaseStream m45433b(InterfaceC14147 interfaceC14147) {
        if (interfaceC14147 == null) {
            return null;
        }
        if (interfaceC14147 instanceof C19394) {
            return ((C19394) interfaceC14147).f57883a;
        }
        if (interfaceC14147 instanceof InterfaceC2804) {
            return C16215.m36972b((InterfaceC2804) interfaceC14147);
        }
        if (interfaceC14147 instanceof InterfaceC13123) {
            return C4405.convert((InterfaceC13123) interfaceC14147);
        }
        if (interfaceC14147 instanceof InterfaceC20165) {
            return C19494.m44322b((InterfaceC20165) interfaceC14147);
        }
        return interfaceC14147 instanceof InterfaceC19157 ? C19828.convert((InterfaceC19157) interfaceC14147) : new C20065(interfaceC14147);
    }

    @Override // java.util.stream.BaseStream, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.f60957a.close();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC14147 interfaceC14147 = this.f60957a;
        if (obj instanceof C20065) {
            obj = ((C20065) obj).f60957a;
        }
        return interfaceC14147.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f60957a.hashCode();
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ boolean isParallel() {
        return this.f60957a.isParallel();
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ Iterator iterator() {
        return this.f60957a.iterator();
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ BaseStream onClose(Runnable runnable) {
        return m45433b(this.f60957a.onClose(runnable));
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ BaseStream parallel() {
        return m45433b(this.f60957a.parallel());
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ BaseStream sequential() {
        return m45433b(this.f60957a.sequential());
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ Spliterator spliterator() {
        return C10143.convert(this.f60957a.spliterator());
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ BaseStream unordered() {
        return m45433b(this.f60957a.unordered());
    }
}
