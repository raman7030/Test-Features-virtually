package l;

import java.util.stream.Stream;

/* JADX INFO: renamed from: l.֡ۚᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: U5 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0213 extends C2891 implements InterfaceC18559, InterfaceC8886 {
    public static final long serialVersionUID = -7046029254386353129L;

    @Override // l.C2891, java.util.Collection
    public /* synthetic */ Stream parallelStream() {
        return C18370.convert(mo42463parallelStream());
    }

    @Override // l.C2891, java.util.Collection
    public /* synthetic */ Stream stream() {
        return C18370.convert(mo42464stream());
    }

    @Override // l.C2891, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        boolean zRemove;
        synchronized (this.f9231) {
            zRemove = this.f9230.remove(obj);
        }
        return zRemove;
    }

    @Override // l.C2891, l.InterfaceC19825, java.util.Collection, java.lang.Iterable, l.InterfaceC18559, java.util.Set
    public final InterfaceC12063 iterator() {
        return this.f9230.iterator();
    }

    @Override // l.C2891, java.util.Collection, l.InterfaceC1144
    /* JADX INFO: renamed from: stream */
    public final InterfaceC17664 mo42464stream() {
        return C5378.stream(this.f9230);
    }

    @Override // l.C2891, java.util.Collection, l.InterfaceC1144
    /* JADX INFO: renamed from: parallelStream */
    public final InterfaceC17664 mo42463parallelStream() {
        return C5378.parallelStream(this.f9230);
    }
}
