package l;

/* JADX INFO: renamed from: l.ܶۜۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y4D9 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC15057 implements InterfaceC4475 {
    @Override // java.util.Iterator
    public final Object next() {
        return Byte.valueOf(nextByte());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
