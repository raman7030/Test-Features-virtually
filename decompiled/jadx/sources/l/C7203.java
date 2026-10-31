package l;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.۟ۗܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: A5TB */
/* JADX INFO: loaded from: classes3.dex */
public final class C7203 extends AbstractC6079 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public transient int f22049;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final transient EnumSet f22050;

    @Override // l.AbstractC22725
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean mo19283() {
        return false;
    }

    public /* synthetic */ C7203(EnumSet enumSet, int i) {
        this(enumSet);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC6079 m19282(EnumSet enumSet) {
        int size = enumSet.size();
        if (size == 0) {
            return C20692.f66656;
        }
        if (size != 1) {
            return new C7203(enumSet);
        }
        return new C21397((Enum) C8882.m22950((Collection) enumSet));
    }

    public C7203(EnumSet enumSet) {
        this.f22050 = enumSet;
    }

    @Override // l.AbstractC6079, l.AbstractC22725, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final AbstractC20151 iterator() {
        Iterator it = this.f22050.iterator();
        it.getClass();
        if (it instanceof AbstractC20151) {
            return (AbstractC20151) it;
        }
        return new C15936(it);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f22050.size();
    }

    @Override // l.AbstractC22725, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f22050.contains(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        if (collection instanceof C7203) {
            collection = ((C7203) collection).f22050;
        }
        return this.f22050.containsAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f22050.isEmpty();
    }

    @Override // l.AbstractC6079, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C7203) {
            obj = ((C7203) obj).f22050;
        }
        return this.f22050.equals(obj);
    }

    @Override // l.AbstractC6079, java.util.Collection, java.util.Set
    public final int hashCode() {
        int i = this.f22049;
        if (i != 0) {
            return i;
        }
        int iHashCode = this.f22050.hashCode();
        this.f22049 = iHashCode;
        return iHashCode;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return this.f22050.toString();
    }

    @Override // l.AbstractC6079, l.AbstractC22725
    public Object writeReplace() {
        return new C13552(this.f22050);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }
}
