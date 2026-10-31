package l;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: l.ۙۤܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: C3Y0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4587 extends AbstractC8405 {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public transient InterfaceC6141 f14633;

    @Override // l.AbstractC16416, l.AbstractC14299
    /* JADX INFO: renamed from: ܽ */
    public final Set mo1991() {
        return m38688();
    }

    @Override // l.AbstractC16416, l.AbstractC14299
    /* JADX INFO: renamed from: ۧ */
    public final Map mo1990() {
        return m38686();
    }

    @Override // l.AbstractC16416
    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final Collection mo13497() {
        return (List) this.f14633.get();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.f14633);
        objectOutputStream.writeObject(m38687());
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        Object object = objectInputStream.readObject();
        C11003.requireNonNull(object);
        this.f14633 = (InterfaceC6141) object;
        Object object2 = objectInputStream.readObject();
        C11003.requireNonNull(object2);
        m38685((Map) object2);
    }
}
