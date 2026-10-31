package l;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Map;

/* JADX INFO: renamed from: l.ܺ۬ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: V656 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC15956 extends AbstractC6079 {
    /* JADX INFO: renamed from: ۢ */
    public abstract C18054 mo6049();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return mo6049().size();
    }

    @Override // l.AbstractC22725, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object obj2 = mo6049().get(entry.getKey());
        return obj2 != null && obj2.equals(entry.getValue());
    }

    @Override // l.AbstractC22725
    /* JADX INFO: renamed from: ܳ */
    public final boolean mo19283() {
        return mo6049().mo18096();
    }

    @Override // l.AbstractC6079
    /* JADX INFO: renamed from: ۜ */
    public final boolean mo16995() {
        mo6049().getClass();
        return false;
    }

    @Override // l.AbstractC6079, java.util.Collection, java.util.Set
    public final int hashCode() {
        return mo6049().hashCode();
    }

    @Override // l.AbstractC6079, l.AbstractC22725
    public Object writeReplace() {
        return new C8902(mo6049());
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use EntrySetSerializedForm");
    }
}
