package p067l;

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
public final class C6728 extends AbstractC10357 {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ۬ */
    public transient InterfaceC8205 f17462;

    @Override // p067l.AbstractC17970, p067l.AbstractC15958
    /* JADX INFO: renamed from: ܽ */
    public final Set mo4367() {
        return m40904();
    }

    @Override // p067l.AbstractC17970, p067l.AbstractC15958
    /* JADX INFO: renamed from: ۧ */
    public final Map mo4366() {
        return m40902();
    }

    @Override // p067l.AbstractC17970
    /* JADX INFO: renamed from: ᩻ */
    public final Collection mo15386() {
        return (List) this.f17462.get();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.f17462);
        objectOutputStream.writeObject(m40903());
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        Object object = objectInputStream.readObject();
        C12826.requireNonNull(object);
        this.f17462 = (InterfaceC8205) object;
        Object object2 = objectInputStream.readObject();
        C12826.requireNonNull(object2);
        m40901((Map) object2);
    }
}
