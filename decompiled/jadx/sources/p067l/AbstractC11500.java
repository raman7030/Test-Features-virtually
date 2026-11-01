package p067l;

import com.alipay.sdk.p010m.p055w.C0233a;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ۢ۬ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 866M */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC11500 implements Map, Serializable, InterfaceC4108 {
    public static final long serialVersionUID = 912559;

    /* JADX INFO: renamed from: ۙ */
    public static final Map.Entry[] f32091 = new Map.Entry[0];

    /* JADX INFO: renamed from: ᩶ */
    public transient AbstractC23966 f32092;

    /* JADX INFO: renamed from: ᩸ */
    public transient AbstractC8146 f32093;

    /* JADX INFO: renamed from: ᩹ */
    public transient AbstractC8146 f32094;

    @Override // java.util.Map, p067l.InterfaceC4108
    public /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        return C24243.$default$compute(this, obj, biFunction);
    }

    @Override // java.util.Map, p067l.InterfaceC4108
    public /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        return C24243.$default$computeIfAbsent(this, obj, function);
    }

    @Override // java.util.Map, p067l.InterfaceC4108
    public /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        return C24243.$default$computeIfPresent(this, obj, biFunction);
    }

    @Override // java.util.Map, p067l.InterfaceC4108
    public /* synthetic */ void forEach(BiConsumer biConsumer) {
        C24243.$default$forEach(this, biConsumer);
    }

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map, p067l.InterfaceC4108
    public /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return C24243.$default$merge(this, obj, obj2, biFunction);
    }

    @Override // java.util.Map, p067l.InterfaceC4108
    public /* synthetic */ Object putIfAbsent(Object obj, Object obj2) {
        return C24243.$default$putIfAbsent(this, obj, obj2);
    }

    @Override // java.util.Map, p067l.InterfaceC4108
    public /* synthetic */ boolean remove(Object obj, Object obj2) {
        return C24243.$default$remove(this, obj, obj2);
    }

    @Override // java.util.Map, p067l.InterfaceC4108
    public /* synthetic */ Object replace(Object obj, Object obj2) {
        return C24243.$default$replace(this, obj, obj2);
    }

    @Override // java.util.Map, p067l.InterfaceC4108
    public /* synthetic */ boolean replace(Object obj, Object obj2, Object obj3) {
        return C24243.$default$replace(this, obj, obj2, obj3);
    }

    @Override // java.util.Map, p067l.InterfaceC4108
    public /* synthetic */ void replaceAll(BiFunction biFunction) {
        C24243.$default$replaceAll(this, biFunction);
    }

    /* JADX INFO: renamed from: ֫ */
    public abstract AbstractC8146 mo20044();

    /* JADX INFO: renamed from: ۧ */
    public abstract AbstractC8146 mo20045();

    /* JADX INFO: renamed from: ܽ */
    public abstract AbstractC23966 mo20046();

    /* JADX INFO: renamed from: ܿ */
    public abstract boolean mo20047();

    /* JADX INFO: renamed from: ᩷ */
    public static AbstractC11500 m26549() {
        return C8622.m20042(5, new Object[]{"amp", C0233a.f1084p, "apos", "'", "gt", ">", "lt", "<", "quot", "\""}, null);
    }

    /* JADX INFO: renamed from: of */
    public static AbstractC11500 m26548of() {
        return C8622.f23161;
    }

    /* JADX INFO: renamed from: ᩻ */
    public static C8817 m26550() {
        return new C8817(4);
    }

    public static AbstractC11500 copyOf(Map map) {
        if ((map instanceof AbstractC11500) && !(map instanceof SortedMap)) {
            AbstractC11500 abstractC11500 = (AbstractC11500) map;
            if (!abstractC11500.mo20047()) {
                return abstractC11500;
            }
        }
        Set<Map.Entry> setEntrySet = map.entrySet();
        C8817 c8817 = new C8817(setEntrySet != null ? setEntrySet.size() : 4);
        if (C14110.m32033(setEntrySet)) {
            int size = (setEntrySet.size() + c8817.f23935) * 2;
            Object[] objArr = c8817.f23933;
            if (size > objArr.length) {
                c8817.f23933 = Arrays.copyOf(objArr, AbstractC13238.m30297(objArr.length, size));
            }
        }
        for (Map.Entry entry : setEntrySet) {
            c8817.mo20376(entry.getKey(), entry.getValue());
        }
        return c8817.mo20378();
    }

    @Override // java.util.Map
    @Deprecated
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    @Override // java.util.Map, p067l.InterfaceC4108
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public AbstractC8146 entrySet() {
        AbstractC8146 abstractC8146 = this.f32093;
        if (abstractC8146 != null) {
            return abstractC8146;
        }
        AbstractC8146 abstractC8146Mo20044 = mo20044();
        this.f32093 = abstractC8146Mo20044;
        return abstractC8146Mo20044;
    }

    @Override // java.util.Map
    public AbstractC8146 keySet() {
        AbstractC8146 abstractC8146 = this.f32094;
        if (abstractC8146 != null) {
            return abstractC8146;
        }
        AbstractC8146 abstractC8146Mo20045 = mo20045();
        this.f32094 = abstractC8146Mo20045;
        return abstractC8146Mo20045;
    }

    @Override // java.util.Map
    public AbstractC23966 values() {
        AbstractC23966 abstractC23966 = this.f32092;
        if (abstractC23966 != null) {
            return abstractC23966;
        }
        AbstractC23966 abstractC23966Mo20046 = mo20046();
        this.f32092 = abstractC23966Mo20046;
        return abstractC23966Mo20046;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return C20811.m46983(this, obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return C16667.m37742(entrySet());
    }

    public final String toString() {
        return C20811.m46982(this);
    }

    public Object writeReplace() {
        return new C22229(this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }
}
