package p067l;

import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: renamed from: l.֫֫ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: XSY */
/* JADX INFO: loaded from: classes3.dex */
public final class C3814 extends C12007 implements InterfaceC15358, InterfaceC4108 {
    public static final long serialVersionUID = -7046029254386353129L;

    /* JADX INFO: renamed from: ۗ */
    public final C6642 f8171;

    /* JADX INFO: renamed from: ۙ */
    public transient C15468 f8172;

    /* JADX INFO: renamed from: ۬ */
    public transient InterfaceC21210 f8173;

    /* JADX INFO: renamed from: ᩶ */
    public transient C2571 f8174;

    @Override // java.util.Map, p067l.InterfaceC4108
    public final void forEach(BiConsumer biConsumer) {
        C24243.$default$forEach(this, biConsumer);
    }

    @Override // java.util.Map, p067l.InterfaceC4108
    @Deprecated
    public final Object compute(Object obj, BiFunction biFunction) {
        Object objCompute;
        Character ch = (Character) obj;
        synchronized (this.f33482) {
            objCompute = C15525.compute(this.f8171, ch, biFunction);
        }
        return objCompute;
    }

    @Override // java.util.Map, p067l.InterfaceC4108
    @Deprecated
    public final Object computeIfAbsent(Object obj, Function function) {
        Object objComputeIfAbsent;
        Character ch = (Character) obj;
        synchronized (this.f33482) {
            objComputeIfAbsent = C15525.computeIfAbsent(this.f8171, ch, function);
        }
        return objComputeIfAbsent;
    }

    @Override // java.util.Map, p067l.InterfaceC4108
    @Deprecated
    public final Object computeIfPresent(Object obj, BiFunction biFunction) {
        Object objComputeIfPresent;
        Character ch = (Character) obj;
        synchronized (this.f33482) {
            objComputeIfPresent = C15525.computeIfPresent(this.f8171, ch, biFunction);
        }
        return objComputeIfPresent;
    }

    @Override // java.util.Map, p067l.InterfaceC4108
    @Deprecated
    public final Object merge(Object obj, Object obj2, BiFunction biFunction) {
        Object objMerge;
        Character ch = (Character) obj;
        synchronized (this.f33482) {
            objMerge = C15525.merge(this.f8171, ch, obj2, biFunction);
        }
        return objMerge;
    }

    @Override // java.util.Map, p067l.InterfaceC4108
    @Deprecated
    public final Object putIfAbsent(Object obj, Object obj2) {
        Object objPutIfAbsent;
        Character ch = (Character) obj;
        synchronized (this.f33482) {
            objPutIfAbsent = C15525.putIfAbsent(this.f8171, ch, obj2);
        }
        return objPutIfAbsent;
    }

    @Override // java.util.Map, p067l.InterfaceC4108
    @Deprecated
    public final Object replace(Object obj, Object obj2) {
        Object objReplace;
        Character ch = (Character) obj;
        synchronized (this.f33482) {
            objReplace = C15525.replace(this.f8171, ch, obj2);
        }
        return objReplace;
    }

    @Override // java.util.Map, p067l.InterfaceC4108
    @Deprecated
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        boolean zReplace;
        Character ch = (Character) obj;
        synchronized (this.f33482) {
            zReplace = C15525.replace(this.f8171, ch, obj2, obj3);
        }
        return zReplace;
    }

    public C3814(C6642 c6642) {
        super(c6642);
        this.f8171 = c6642;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        boolean zContainsValue;
        synchronized (this.f33482) {
            zContainsValue = this.f8171.containsValue(obj);
        }
        return zContainsValue;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        synchronized (this.f33482) {
            this.f8171.putAll(map);
        }
    }

    @Override // p067l.InterfaceC15358
    /* JADX INFO: renamed from: ܳ */
    public final InterfaceC20007 mo3493() {
        C2571 c2571;
        synchronized (this.f33482) {
            if (this.f8174 == null) {
                this.f8174 = C7266.m16619(this.f8171.mo3493(), this.f33482);
            }
            c2571 = this.f8174;
        }
        return c2571;
    }

    @Override // java.util.Map
    @Deprecated
    public final Set entrySet() {
        return mo3493();
    }

    @Override // p067l.InterfaceC15358, java.util.Map
    @Deprecated
    public final InterfaceC20007 entrySet() {
        return mo3493();
    }

    @Override // java.util.Map
    public final Set keySet() {
        C15468 c15468;
        synchronized (this.f33482) {
            if (this.f8172 == null) {
                InterfaceC4226 interfaceC4226KeySet = this.f8171.keySet();
                C12007 c12007 = this.f33482;
                C24186 c24186 = C9434.f25764;
                this.f8172 = new C15468(interfaceC4226KeySet, c12007);
            }
            c15468 = this.f8172;
        }
        return c15468;
    }

    @Override // java.util.Map
    public final Collection values() {
        InterfaceC21210 interfaceC21210;
        synchronized (this.f33482) {
            if (this.f8173 == null) {
                this.f8173 = C14503.m33149(this.f8171.values(), this.f33482);
            }
            interfaceC21210 = this.f8173;
        }
        return interfaceC21210;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        boolean zIsEmpty;
        synchronized (this.f33482) {
            zIsEmpty = this.f8171.isEmpty();
        }
        return zIsEmpty;
    }

    @Override // p067l.C12007, java.util.Map
    public final int hashCode() {
        int iHashCode;
        synchronized (this.f33482) {
            iHashCode = this.f8171.hashCode();
        }
        return iHashCode;
    }

    @Override // p067l.C12007, java.util.Map
    public final boolean equals(Object obj) {
        boolean zEquals;
        if (obj == this) {
            return true;
        }
        synchronized (this.f33482) {
            zEquals = this.f8171.equals(obj);
        }
        return zEquals;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        synchronized (this.f33482) {
            objectOutputStream.defaultWriteObject();
        }
    }

    @Override // java.util.Map, p067l.InterfaceC4108
    public final void replaceAll(BiFunction biFunction) {
        synchronized (this.f33482) {
            C15525.replaceAll(this.f8171, biFunction);
        }
    }

    @Override // java.util.Map, p067l.InterfaceC4108
    @Deprecated
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj$default$getOrDefault;
        synchronized (this.f33482) {
            C6642 c6642 = this.f8171;
            c6642.getClass();
            obj$default$getOrDefault = C24243.$default$getOrDefault(c6642, obj, obj2);
        }
        return obj$default$getOrDefault;
    }

    @Override // java.util.Map, p067l.InterfaceC4108
    @Deprecated
    public final boolean remove(Object obj, Object obj2) {
        boolean zRemove;
        synchronized (this.f33482) {
            zRemove = C15525.remove(this.f8171, obj, obj2);
        }
        return zRemove;
    }
}
