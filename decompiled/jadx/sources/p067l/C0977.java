package p067l;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ۖ᩵ */
/* JADX INFO: compiled from: J5WP */
/* JADX INFO: loaded from: classes2.dex */
public class C0977 extends C1012 implements Map, InterfaceC4108 {

    /* JADX INFO: renamed from: ۤ */
    public C1642 f11297;

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

    @Override // java.util.Map, p067l.InterfaceC4108
    public /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return C24243.$default$merge(this, obj, obj2, biFunction);
    }

    @Override // java.util.Map, p067l.InterfaceC4108
    public /* synthetic */ void replaceAll(BiFunction biFunction) {
        C24243.$default$replaceAll(this, biFunction);
    }

    public C0977() {
    }

    @Override // java.util.Map
    public final Set entrySet() {
        if (this.f11297 == null) {
            this.f11297 = new C1642(this);
        }
        C1642 c1642 = this.f11297;
        if (c1642.f18132 == null) {
            c1642.f18132 = new C1607(c1642);
        }
        return c1642.f18132;
    }

    @Override // java.util.Map
    public final Set keySet() {
        if (this.f11297 == null) {
            this.f11297 = new C1642(this);
        }
        C1642 c1642 = this.f11297;
        if (c1642.f18133 == null) {
            c1642.f18133 = new C1922(c1642);
        }
        return c1642.f18133;
    }

    @Override // java.util.Map
    public final Collection values() {
        if (this.f11297 == null) {
            this.f11297 = new C1642(this);
        }
        C1642 c1642 = this.f11297;
        if (c1642.f18134 == null) {
            c1642.f18134 = new C1852(c1642);
        }
        return c1642.f18134;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        m12520(map.size() + this.f13653);
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m10510(Collection collection) {
        AbstractC1082.m15966((Map) this, collection);
    }

    public C0977(C0977 c0977) {
        if (c0977 != null) {
            int i = c0977.f13653;
            m12520(this.f13653 + i);
            if (this.f13653 != 0) {
                for (int i2 = 0; i2 < i; i2++) {
                    put(c0977.m12522(i2), c0977.m12521(i2));
                }
            } else if (i > 0) {
                System.arraycopy(c0977.f13655, 0, this.f13655, 0, i);
                System.arraycopy(c0977.f13654, 0, this.f13654, 0, i << 1);
                this.f13653 = i;
            }
        }
    }
}
