package p067l;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: l.᩸ۖ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: K4X2 */
/* JADX INFO: loaded from: classes4.dex */
public final class C22595 implements Serializable, Iterable {
    public static final long serialVersionUID = -1934227607974228213L;

    /* JADX INFO: renamed from: ᩸ */
    public final CopyOnWriteArrayList f71329 = new CopyOnWriteArrayList();

    public final boolean isEmpty() {
        return this.f71329.size() == 0;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f71329.iterator();
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new UnsupportedOperationException("Serialization is not supported");
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        throw new UnsupportedOperationException("Serialization is not supported");
    }
}
