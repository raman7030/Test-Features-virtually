package l;

import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: renamed from: l.֫᩷ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: W1Z */
/* JADX INFO: loaded from: classes3.dex */
public final class C2080 extends C10133 implements InterfaceC13659, InterfaceC1830 {
    public static final long serialVersionUID = -7046029254386353129L;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final C2372 f6939;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public transient C13721 f6940;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public transient InterfaceC19825 f6941;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public transient C0213 f6942;

    @Override // java.util.Map, l.InterfaceC1830
    public final void forEach(BiConsumer biConsumer) {
        C23016.$default$forEach(this, biConsumer);
    }

    @Override // java.util.Map, l.InterfaceC1830
    @Deprecated
    public final Object compute(Object obj, BiFunction biFunction) {
        Object objCompute;
        Integer num = (Integer) obj;
        synchronized (this.f30496) {
            objCompute = C13843.compute(this.f6939, num, biFunction);
        }
        return objCompute;
    }

    @Override // java.util.Map, l.InterfaceC1830
    @Deprecated
    public final Object computeIfAbsent(Object obj, Function function) {
        Object objComputeIfAbsent;
        Integer num = (Integer) obj;
        synchronized (this.f30496) {
            objComputeIfAbsent = C13843.computeIfAbsent(this.f6939, num, function);
        }
        return objComputeIfAbsent;
    }

    @Override // java.util.Map, l.InterfaceC1830
    @Deprecated
    public final Object computeIfPresent(Object obj, BiFunction biFunction) {
        Object objComputeIfPresent;
        Integer num = (Integer) obj;
        synchronized (this.f30496) {
            objComputeIfPresent = C13843.computeIfPresent(this.f6939, num, biFunction);
        }
        return objComputeIfPresent;
    }

    @Override // java.util.Map, l.InterfaceC1830
    @Deprecated
    public final Object merge(Object obj, Object obj2, BiFunction biFunction) {
        Object objMerge;
        Integer num = (Integer) obj;
        synchronized (this.f30496) {
            objMerge = C13843.merge(this.f6939, num, obj2, biFunction);
        }
        return objMerge;
    }

    @Override // java.util.Map, l.InterfaceC1830
    @Deprecated
    public final Object putIfAbsent(Object obj, Object obj2) {
        Object objPutIfAbsent;
        Integer num = (Integer) obj;
        synchronized (this.f30496) {
            objPutIfAbsent = C13843.putIfAbsent(this.f6939, num, obj2);
        }
        return objPutIfAbsent;
    }

    @Override // java.util.Map, l.InterfaceC1830
    @Deprecated
    public final Object replace(Object obj, Object obj2) {
        Object objReplace;
        Integer num = (Integer) obj;
        synchronized (this.f30496) {
            objReplace = C13843.replace(this.f6939, num, obj2);
        }
        return objReplace;
    }

    @Override // java.util.Map, l.InterfaceC1830
    @Deprecated
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        boolean zReplace;
        Integer num = (Integer) obj;
        synchronized (this.f30496) {
            zReplace = C13843.replace(this.f6939, num, obj2, obj3);
        }
        return zReplace;
    }

    public C2080(C2372 c2372) {
        super(c2372);
        this.f6939 = c2372;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        boolean zContainsValue;
        synchronized (this.f30496) {
            zContainsValue = this.f6939.containsValue(obj);
        }
        return zContainsValue;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        synchronized (this.f30496) {
            this.f6939.putAll(map);
        }
    }

    @Override // l.InterfaceC13659
    /* JADX INFO: renamed from: ۜ */
    public final InterfaceC18559 mo5869() {
        C0213 c0213;
        synchronized (this.f30496) {
            if (this.f6942 == null) {
                this.f6942 = C5153.m14711(this.f6939.mo5869(), this.f30496);
            }
            c0213 = this.f6942;
        }
        return c0213;
    }

    @Override // java.util.Map
    @Deprecated
    public final Set entrySet() {
        return mo5869();
    }

    @Override // l.InterfaceC13659, java.util.Map
    @Deprecated
    public final InterfaceC18559 entrySet() {
        return mo5869();
    }

    @Override // java.util.Map
    public final Set keySet() {
        C13721 c13721;
        synchronized (this.f30496) {
            if (this.f6940 == null) {
                InterfaceC1933 interfaceC1933KeySet = this.f6939.keySet();
                C10133 c10133 = this.f30496;
                C22894 c22894 = C7372.f22644;
                this.f6940 = new C13721(interfaceC1933KeySet, c10133);
            }
            c13721 = this.f6940;
        }
        return c13721;
    }

    @Override // java.util.Map
    public final Collection values() {
        InterfaceC19825 interfaceC19825;
        synchronized (this.f30496) {
            if (this.f6941 == null) {
                this.f6941 = C12768.m31065(this.f6939.values(), this.f30496);
            }
            interfaceC19825 = this.f6941;
        }
        return interfaceC19825;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        boolean zIsEmpty;
        synchronized (this.f30496) {
            zIsEmpty = this.f6939.isEmpty();
        }
        return zIsEmpty;
    }

    @Override // l.C10133, java.util.Map
    public final int hashCode() {
        int iHashCode;
        synchronized (this.f30496) {
            iHashCode = this.f6939.hashCode();
        }
        return iHashCode;
    }

    @Override // l.C10133, java.util.Map
    public final boolean equals(Object obj) {
        boolean zEquals;
        if (obj == this) {
            return true;
        }
        synchronized (this.f30496) {
            zEquals = this.f6939.equals(obj);
        }
        return zEquals;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        synchronized (this.f30496) {
            objectOutputStream.defaultWriteObject();
        }
    }

    @Override // java.util.Map, l.InterfaceC1830
    public final void replaceAll(BiFunction biFunction) {
        synchronized (this.f30496) {
            C13843.replaceAll(this.f6939, biFunction);
        }
    }

    @Override // java.util.Map, l.InterfaceC1830
    @Deprecated
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj$default$getOrDefault;
        synchronized (this.f30496) {
            C2372 c2372 = this.f6939;
            c2372.getClass();
            obj$default$getOrDefault = C23016.$default$getOrDefault(c2372, obj, obj2);
        }
        return obj$default$getOrDefault;
    }

    @Override // java.util.Map, l.InterfaceC1830
    @Deprecated
    public final boolean remove(Object obj, Object obj2) {
        boolean zRemove;
        synchronized (this.f30496) {
            zRemove = C13843.remove(this.f6939, obj, obj2);
        }
        return zRemove;
    }
}
