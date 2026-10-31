package l;

import com.alipay.sdk.m.w.a;
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
public abstract class AbstractC9608 implements Map, Serializable, InterfaceC1830 {
    public static final long serialVersionUID = 912559;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final Map.Entry[] f29144 = new Map.Entry[0];

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public transient AbstractC22725 f29145;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public transient AbstractC6079 f29146;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public transient AbstractC6079 f29147;

    @Override // java.util.Map, l.InterfaceC1830
    public /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        return C23016.$default$compute(this, obj, biFunction);
    }

    @Override // java.util.Map, l.InterfaceC1830
    public /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        return C23016.$default$computeIfAbsent(this, obj, function);
    }

    @Override // java.util.Map, l.InterfaceC1830
    public /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        return C23016.$default$computeIfPresent(this, obj, biFunction);
    }

    @Override // java.util.Map, l.InterfaceC1830
    public /* synthetic */ void forEach(BiConsumer biConsumer) {
        C23016.$default$forEach(this, biConsumer);
    }

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map, l.InterfaceC1830
    public /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return C23016.$default$merge(this, obj, obj2, biFunction);
    }

    @Override // java.util.Map, l.InterfaceC1830
    public /* synthetic */ Object putIfAbsent(Object obj, Object obj2) {
        return C23016.$default$putIfAbsent(this, obj, obj2);
    }

    @Override // java.util.Map, l.InterfaceC1830
    public /* synthetic */ boolean remove(Object obj, Object obj2) {
        return C23016.$default$remove(this, obj, obj2);
    }

    @Override // java.util.Map, l.InterfaceC1830
    public /* synthetic */ Object replace(Object obj, Object obj2) {
        return C23016.$default$replace(this, obj, obj2);
    }

    @Override // java.util.Map, l.InterfaceC1830
    public /* synthetic */ boolean replace(Object obj, Object obj2, Object obj3) {
        return C23016.$default$replace(this, obj, obj2, obj3);
    }

    @Override // java.util.Map, l.InterfaceC1830
    public /* synthetic */ void replaceAll(BiFunction biFunction) {
        C23016.$default$replaceAll(this, biFunction);
    }

    /* JADX INFO: renamed from: ֫ */
    public abstract AbstractC6079 mo18093();

    /* JADX INFO: renamed from: ۧ */
    public abstract AbstractC6079 mo18094();

    /* JADX INFO: renamed from: ܽ */
    public abstract AbstractC22725 mo18095();

    /* JADX INFO: renamed from: ܿ */
    public abstract boolean mo18096();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static AbstractC9608 m24536() {
        return C6580.m18091(5, new Object[]{"amp", a.p, "apos", "'", "gt", ">", "lt", "<", "quot", "\""}, null);
    }

    public static AbstractC9608 of() {
        return C6580.f20283;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static C6785 m24537() {
        return new C6785(4);
    }

    public static AbstractC9608 copyOf(Map map) {
        if ((map instanceof AbstractC9608) && !(map instanceof SortedMap)) {
            AbstractC9608 abstractC9608 = (AbstractC9608) map;
            if (!abstractC9608.mo18096()) {
                return abstractC9608;
            }
        }
        Set<Map.Entry> setEntrySet = map.entrySet();
        C6785 c6785 = new C6785(setEntrySet != null ? setEntrySet.size() : 4);
        if (C12354.m29972(setEntrySet)) {
            int size = (setEntrySet.size() + c6785.f21061) * 2;
            Object[] objArr = c6785.f21059;
            if (size > objArr.length) {
                c6785.f21059 = Arrays.copyOf(objArr, AbstractC11437.m28253(objArr.length, size));
            }
        }
        for (Map.Entry entry : setEntrySet) {
            c6785.mo18428(entry.getKey(), entry.getValue());
        }
        return c6785.mo18430();
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

    @Override // java.util.Map, l.InterfaceC1830
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public AbstractC6079 entrySet() {
        AbstractC6079 abstractC6079 = this.f29146;
        if (abstractC6079 != null) {
            return abstractC6079;
        }
        AbstractC6079 abstractC6079Mo18093 = mo18093();
        this.f29146 = abstractC6079Mo18093;
        return abstractC6079Mo18093;
    }

    @Override // java.util.Map
    public AbstractC6079 keySet() {
        AbstractC6079 abstractC6079 = this.f29147;
        if (abstractC6079 != null) {
            return abstractC6079;
        }
        AbstractC6079 abstractC6079Mo18094 = mo18094();
        this.f29147 = abstractC6079Mo18094;
        return abstractC6079Mo18094;
    }

    @Override // java.util.Map
    public AbstractC22725 values() {
        AbstractC22725 abstractC22725 = this.f29145;
        if (abstractC22725 != null) {
            return abstractC22725;
        }
        AbstractC22725 abstractC22725Mo18095 = mo18095();
        this.f29145 = abstractC22725Mo18095;
        return abstractC22725Mo18095;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return C19405.m44689(this, obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return C15045.m35584(entrySet());
    }

    public final String toString() {
        return C19405.m44688(this);
    }

    public Object writeReplace() {
        return new C20897(this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }
}
