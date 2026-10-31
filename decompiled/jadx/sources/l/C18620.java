package l;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.stream.BaseStream;

/* JADX INFO: renamed from: l.ᩴ۟ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C18620 implements BaseStream {
    public final /* synthetic */ InterfaceC12393 a;

    public /* synthetic */ C18620(InterfaceC12393 interfaceC12393) {
        this.a = interfaceC12393;
    }

    public static /* synthetic */ BaseStream b(InterfaceC12393 interfaceC12393) {
        if (interfaceC12393 == null) {
            return null;
        }
        if (interfaceC12393 instanceof C17914) {
            return ((C17914) interfaceC12393).a;
        }
        if (interfaceC12393 instanceof InterfaceC0458) {
            return C14569.b((InterfaceC0458) interfaceC12393);
        }
        if (interfaceC12393 instanceof InterfaceC11315) {
            return C2142.convert((InterfaceC11315) interfaceC12393);
        }
        if (interfaceC12393 instanceof InterfaceC18725) {
            return C18019.b((InterfaceC18725) interfaceC12393);
        }
        return interfaceC12393 instanceof InterfaceC17664 ? C18370.convert((InterfaceC17664) interfaceC12393) : new C18620(interfaceC12393);
    }

    @Override // java.util.stream.BaseStream, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.a.close();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC12393 interfaceC12393 = this.a;
        if (obj instanceof C18620) {
            obj = ((C18620) obj).a;
        }
        return interfaceC12393.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ boolean isParallel() {
        return this.a.isParallel();
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ Iterator iterator() {
        return this.a.iterator();
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ BaseStream onClose(Runnable runnable) {
        return b(this.a.onClose(runnable));
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ BaseStream parallel() {
        return b(this.a.parallel());
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ BaseStream sequential() {
        return b(this.a.sequential());
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ Spliterator spliterator() {
        return C8180.convert(this.a.spliterator());
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ BaseStream unordered() {
        return b(this.a.unordered());
    }
}
