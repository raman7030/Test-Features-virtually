package p067l;

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
public final class C4346 extends C11999 implements InterfaceC15350, InterfaceC4108 {
    public static final long serialVersionUID = -7046029254386353129L;

    /* JADX INFO: renamed from: ۗ */
    public final C4623 f9723;

    /* JADX INFO: renamed from: ۙ */
    public transient C15409 f9724;

    /* JADX INFO: renamed from: ۬ */
    public transient InterfaceC21210 f9725;

    /* JADX INFO: renamed from: ᩶ */
    public transient C2571 f9726;

    @Override // java.util.Map, p067l.InterfaceC4108
    public final void forEach(BiConsumer biConsumer) {
        C24243.$default$forEach(this, biConsumer);
    }

    @Override // java.util.Map, p067l.InterfaceC4108
    @Deprecated
    public final Object compute(Object obj, BiFunction biFunction) {
        Object objCompute;
        Integer num = (Integer) obj;
        synchronized (this.f33458) {
            objCompute = C15525.compute(this.f9723, num, biFunction);
        }
        return objCompute;
    }

    @Override // java.util.Map, p067l.InterfaceC4108
    @Deprecated
    public final Object computeIfAbsent(Object obj, Function function) {
        Object objComputeIfAbsent;
        Integer num = (Integer) obj;
        synchronized (this.f33458) {
            objComputeIfAbsent = C15525.computeIfAbsent(this.f9723, num, function);
        }
        return objComputeIfAbsent;
    }

    @Override // java.util.Map, p067l.InterfaceC4108
    @Deprecated
    public final Object computeIfPresent(Object obj, BiFunction biFunction) {
        Object objComputeIfPresent;
        Integer num = (Integer) obj;
        synchronized (this.f33458) {
            objComputeIfPresent = C15525.computeIfPresent(this.f9723, num, biFunction);
        }
        return objComputeIfPresent;
    }

    @Override // java.util.Map, p067l.InterfaceC4108
    @Deprecated
    public final Object merge(Object obj, Object obj2, BiFunction biFunction) {
        Object objMerge;
        Integer num = (Integer) obj;
        synchronized (this.f33458) {
            objMerge = C15525.merge(this.f9723, num, obj2, biFunction);
        }
        return objMerge;
    }

    @Override // java.util.Map, p067l.InterfaceC4108
    @Deprecated
    public final Object putIfAbsent(Object obj, Object obj2) {
        Object objPutIfAbsent;
        Integer num = (Integer) obj;
        synchronized (this.f33458) {
            objPutIfAbsent = C15525.putIfAbsent(this.f9723, num, obj2);
        }
        return objPutIfAbsent;
    }

    @Override // java.util.Map, p067l.InterfaceC4108
    @Deprecated
    public final Object replace(Object obj, Object obj2) {
        Object objReplace;
        Integer num = (Integer) obj;
        synchronized (this.f33458) {
            objReplace = C15525.replace(this.f9723, num, obj2);
        }
        return objReplace;
    }

    @Override // java.util.Map, p067l.InterfaceC4108
    @Deprecated
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        boolean zReplace;
        Integer num = (Integer) obj;
        synchronized (this.f33458) {
            zReplace = C15525.replace(this.f9723, num, obj2, obj3);
        }
        return zReplace;
    }

    public C4346(C4623 c4623) {
        super(c4623);
        this.f9723 = c4623;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        boolean zContainsValue;
        synchronized (this.f33458) {
            zContainsValue = this.f9723.containsValue(obj);
        }
        return zContainsValue;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        synchronized (this.f33458) {
            this.f9723.putAll(map);
        }
    }

    @Override // p067l.InterfaceC15350
    /* JADX INFO: renamed from: ۜ */
    public final InterfaceC20007 mo8079() {
        C2571 c2571;
        synchronized (this.f33458) {
            if (this.f9726 == null) {
                this.f9726 = C7266.m16619(this.f9723.mo8079(), this.f33458);
            }
            c2571 = this.f9726;
        }
        return c2571;
    }

    @Override // java.util.Map
    @Deprecated
    public final Set entrySet() {
        return mo8079();
    }

    @Override // p067l.InterfaceC15350, java.util.Map
    @Deprecated
    public final InterfaceC20007 entrySet() {
        return mo8079();
    }

    @Override // java.util.Map
    public final Set keySet() {
        C15409 c15409;
        synchronized (this.f33458) {
            if (this.f9724 == null) {
                InterfaceC4206 interfaceC4206KeySet = this.f9723.keySet();
                C11999 c11999 = this.f33458;
                C24127 c24127 = C9375.f25556;
                this.f9724 = new C15409(interfaceC4206KeySet, c11999);
            }
            c15409 = this.f9724;
        }
        return c15409;
    }

    @Override // java.util.Map
    public final Collection values() {
        InterfaceC21210 interfaceC21210;
        synchronized (this.f33458) {
            if (this.f9725 == null) {
                this.f9725 = C14503.m33149(this.f9723.values(), this.f33458);
            }
            interfaceC21210 = this.f9725;
        }
        return interfaceC21210;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        boolean zIsEmpty;
        synchronized (this.f33458) {
            zIsEmpty = this.f9723.isEmpty();
        }
        return zIsEmpty;
    }

    @Override // p067l.C11999, java.util.Map
    public final int hashCode() {
        int iHashCode;
        synchronized (this.f33458) {
            iHashCode = this.f9723.hashCode();
        }
        return iHashCode;
    }

    @Override // p067l.C11999, java.util.Map
    public final boolean equals(Object obj) {
        boolean zEquals;
        if (obj == this) {
            return true;
        }
        synchronized (this.f33458) {
            zEquals = this.f9723.equals(obj);
        }
        return zEquals;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        synchronized (this.f33458) {
            objectOutputStream.defaultWriteObject();
        }
    }

    @Override // java.util.Map, p067l.InterfaceC4108
    public final void replaceAll(BiFunction biFunction) {
        synchronized (this.f33458) {
            C15525.replaceAll(this.f9723, biFunction);
        }
    }

    @Override // java.util.Map, p067l.InterfaceC4108
    @Deprecated
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj$default$getOrDefault;
        synchronized (this.f33458) {
            C4623 c4623 = this.f9723;
            c4623.getClass();
            obj$default$getOrDefault = C24243.$default$getOrDefault(c4623, obj, obj2);
        }
        return obj$default$getOrDefault;
    }

    @Override // java.util.Map, p067l.InterfaceC4108
    @Deprecated
    public final boolean remove(Object obj, Object obj2) {
        boolean zRemove;
        synchronized (this.f33458) {
            zRemove = C15525.remove(this.f9723, obj, obj2);
        }
        return zRemove;
    }
}
