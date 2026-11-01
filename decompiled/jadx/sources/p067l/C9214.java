package p067l;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.۟ۗܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: A5TB */
/* JADX INFO: loaded from: classes3.dex */
public final class C9214 extends AbstractC8146 {

    /* JADX INFO: renamed from: ۗ */
    public transient int f24927;

    /* JADX INFO: renamed from: ۙ */
    public final transient EnumSet f24928;

    @Override // p067l.AbstractC23966
    /* JADX INFO: renamed from: ܳ */
    public final boolean mo21230() {
        return false;
    }

    public /* synthetic */ C9214(EnumSet enumSet, int i) {
        this(enumSet);
    }

    /* JADX INFO: renamed from: ֫ */
    public static AbstractC8146 m21229(EnumSet enumSet) {
        int size = enumSet.size();
        if (size == 0) {
            return C22034.f69338;
        }
        if (size != 1) {
            return new C9214(enumSet);
        }
        return new C22704((Enum) C10810.m24921((Collection) enumSet));
    }

    public C9214(EnumSet enumSet) {
        this.f24928 = enumSet;
    }

    @Override // p067l.AbstractC8146, p067l.AbstractC23966, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final AbstractC21520 iterator() {
        Iterator it = this.f24928.iterator();
        it.getClass();
        if (it instanceof AbstractC21520) {
            return (AbstractC21520) it;
        }
        return new C17514(it);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f24928.size();
    }

    @Override // p067l.AbstractC23966, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f24928.contains(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        if (collection instanceof C9214) {
            collection = ((C9214) collection).f24928;
        }
        return this.f24928.containsAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f24928.isEmpty();
    }

    @Override // p067l.AbstractC8146, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C9214) {
            obj = ((C9214) obj).f24928;
        }
        return this.f24928.equals(obj);
    }

    @Override // p067l.AbstractC8146, java.util.Collection, java.util.Set
    public final int hashCode() {
        int i = this.f24927;
        if (i != 0) {
            return i;
        }
        int iHashCode = this.f24928.hashCode();
        this.f24927 = iHashCode;
        return iHashCode;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return this.f24928.toString();
    }

    @Override // p067l.AbstractC8146, p067l.AbstractC23966
    public Object writeReplace() {
        return new C15248(this.f24928);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }
}
