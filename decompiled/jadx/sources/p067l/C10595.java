package p067l;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.ۡۙܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: I31W */
/* JADX INFO: loaded from: classes4.dex */
public final class C10595 extends AbstractC10357 {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ۬ */
    public transient int f29340;

    @Override // p067l.AbstractC15958, p067l.InterfaceC2704
    public final /* bridge */ /* synthetic */ Collection values() {
        throw null;
    }

    /* JADX INFO: renamed from: ۢ */
    public static C10595 m24388() {
        C10595 c10595 = new C10595(C17930.m40773(12));
        C23335.m51956(3, "expectedValuesPerKey");
        c10595.f29340 = 3;
        return c10595;
    }

    @Override // p067l.AbstractC17970
    /* JADX INFO: renamed from: ᩻ */
    public final Collection mo15386() {
        return new ArrayList(this.f29340);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        C5940.m13317(this, objectOutputStream);
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.f29340 = 3;
        int i = objectInputStream.readInt();
        m40901((Map) C17930.m40778());
        for (int i2 = 0; i2 < i; i2++) {
            List list = get(objectInputStream.readObject());
            int i3 = objectInputStream.readInt();
            for (int i4 = 0; i4 < i3; i4++) {
                list.add(objectInputStream.readObject());
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m24389(Iterable iterable, Object obj) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            return !collection.isEmpty() && get(obj).addAll(collection);
        }
        Iterator it = iterable.iterator();
        return it.hasNext() && C6786.m15489(get(obj), it);
    }
}
