package p067l;

import java.util.stream.Stream;

/* JADX INFO: renamed from: l.֡ۚᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: U5 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2571 extends C5116 implements InterfaceC20007, InterfaceC10814 {
    public static final long serialVersionUID = -7046029254386353129L;

    @Override // p067l.C5116, java.util.Collection
    public /* synthetic */ Stream parallelStream() {
        return C19828.convert(mo56527parallelStream());
    }

    @Override // p067l.C5116, java.util.Collection
    public /* synthetic */ Stream stream() {
        return C19828.convert(mo56528stream());
    }

    @Override // p067l.C5116, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        boolean zRemove;
        synchronized (this.f12029) {
            zRemove = this.f12028.remove(obj);
        }
        return zRemove;
    }

    @Override // p067l.C5116, p067l.InterfaceC21210, java.util.Collection, java.lang.Iterable, p067l.InterfaceC20007, java.util.Set
    public final InterfaceC13833 iterator() {
        return this.f12028.iterator();
    }

    @Override // p067l.C5116, java.util.Collection, p067l.InterfaceC3456
    /* JADX INFO: renamed from: stream */
    public final InterfaceC19157 mo56528stream() {
        return C7480.stream(this.f12028);
    }

    @Override // p067l.C5116, java.util.Collection, p067l.InterfaceC3456
    /* JADX INFO: renamed from: parallelStream */
    public final InterfaceC19157 mo56527parallelStream() {
        return C7480.parallelStream(this.f12028);
    }
}
