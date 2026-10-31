package l;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ۖ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: J5WP */
/* JADX INFO: loaded from: classes2.dex */
public class C2727 extends C3432 implements Map, InterfaceC1830 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C16131 f8502;

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

    @Override // java.util.Map, l.InterfaceC1830
    public /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return C23016.$default$merge(this, obj, obj2, biFunction);
    }

    @Override // java.util.Map, l.InterfaceC1830
    public /* synthetic */ void replaceAll(BiFunction biFunction) {
        C23016.$default$replaceAll(this, biFunction);
    }

    public C2727() {
    }

    @Override // java.util.Map
    public final Set entrySet() {
        if (this.f8502 == null) {
            this.f8502 = new C16131(this);
        }
        C16131 c16131 = this.f8502;
        if (c16131.f15300 == null) {
            c16131.f15300 = new C15425(c16131);
        }
        return c16131.f15300;
    }

    @Override // java.util.Map
    public final Set keySet() {
        if (this.f8502 == null) {
            this.f8502 = new C16131(this);
        }
        C16131 c16131 = this.f8502;
        if (c16131.f15301 == null) {
            c16131.f15301 = new C21777(c16131);
        }
        return c16131.f15301;
    }

    @Override // java.util.Map
    public final Collection values() {
        if (this.f8502 == null) {
            this.f8502 = new C16131(this);
        }
        C16131 c16131 = this.f8502;
        if (c16131.f15302 == null) {
            c16131.f15302 = new C20366(c16131);
        }
        return c16131.f15302;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        m10497(map.size() + this.f10850);
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m8463(Collection collection) {
        AbstractC4843.m14086((Map) this, collection);
    }

    public C2727(C2727 c2727) {
        if (c2727 != null) {
            int i = c2727.f10850;
            m10497(this.f10850 + i);
            if (this.f10850 != 0) {
                for (int i2 = 0; i2 < i; i2++) {
                    put(c2727.m10499(i2), c2727.m10498(i2));
                }
            } else if (i > 0) {
                System.arraycopy(c2727.f10852, 0, this.f10852, 0, i);
                System.arraycopy(c2727.f10851, 0, this.f10851, 0, i << 1);
                this.f10850 = i;
            }
        }
    }
}
