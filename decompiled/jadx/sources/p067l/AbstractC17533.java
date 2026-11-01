package p067l;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Map;

/* JADX INFO: renamed from: l.ܺ۬ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: V656 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC17533 extends AbstractC8146 {
    /* JADX INFO: renamed from: ۢ */
    public abstract C19527 mo8247();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return mo8247().size();
    }

    @Override // p067l.AbstractC23966, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object obj2 = mo8247().get(entry.getKey());
        return obj2 != null && obj2.equals(entry.getValue());
    }

    @Override // p067l.AbstractC23966
    /* JADX INFO: renamed from: ܳ */
    public final boolean mo21230() {
        return mo8247().mo20047();
    }

    @Override // p067l.AbstractC8146
    /* JADX INFO: renamed from: ۜ */
    public final boolean mo18926() {
        mo8247().getClass();
        return false;
    }

    @Override // p067l.AbstractC8146, java.util.Collection, java.util.Set
    public final int hashCode() {
        return mo8247().hashCode();
    }

    @Override // p067l.AbstractC8146, p067l.AbstractC23966
    public Object writeReplace() {
        return new C10829(mo8247());
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use EntrySetSerializedForm");
    }
}
