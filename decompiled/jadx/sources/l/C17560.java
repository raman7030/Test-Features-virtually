package l;

import java.util.Map;
import java.util.Spliterator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ܿ᩵ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: H1MW */
/* JADX INFO: loaded from: classes5.dex */
public final class C17560 extends AbstractC17539 implements InterfaceC13305, InterfaceC8886 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9800 f53671;

    @Override // l.AbstractC11462, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* synthetic */ Spliterator spliterator() {
        return C8180.convert(spliterator());
    }

    public C17560(C9800 c9800) {
        this.f53671 = c9800;
    }

    @Override // l.AbstractC11462, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final InterfaceC12063 iterator() {
        return new C23183(this.f53671);
    }

    @Override // l.InterfaceC13305
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC12063 mo32280() {
        return new C7661(this.f53671);
    }

    @Override // l.AbstractC11462, java.util.Collection, java.lang.Iterable, l.InterfaceC1144, l.InterfaceC19825, l.InterfaceC4323, java.util.Set, l.InterfaceC8886
    public final InterfaceC7975 spliterator() {
        return new C14010(this.f53671);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Object obj2;
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry.getValue() == null || !(entry.getValue() instanceof Integer)) {
            return false;
        }
        Object key = entry.getKey();
        int iIntValue = ((Integer) entry.getValue()).intValue();
        C9800 c9800 = this.f53671;
        if (key != null) {
            Object[] objArr = c9800.f29626;
            int iM32766 = C13630.m32766(key.hashCode()) & c9800.f29631;
            Object obj3 = objArr[iM32766];
            if (obj3 == null) {
                return false;
            }
            if (!key.equals(obj3)) {
                do {
                    iM32766 = (iM32766 + 1) & c9800.f29631;
                    obj2 = objArr[iM32766];
                    if (obj2 == null) {
                        return false;
                    }
                } while (!key.equals(obj2));
                if (c9800.f29636[iM32766] != iIntValue) {
                    return false;
                }
            } else if (c9800.f29636[iM32766] != iIntValue) {
                return false;
            }
        } else if (!c9800.f29634 || c9800.f29636[c9800.f29627] != iIntValue) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry.getValue() == null || !(entry.getValue() instanceof Integer)) {
            return false;
        }
        Object key = entry.getKey();
        int iIntValue = ((Integer) entry.getValue()).intValue();
        C9800 c9800 = this.f53671;
        if (key == null) {
            if (!c9800.f29634 || c9800.f29636[c9800.f29627] != iIntValue) {
                return false;
            }
            c9800.m24831();
            return true;
        }
        Object[] objArr = c9800.f29626;
        int iM32766 = C13630.m32766(key.hashCode()) & c9800.f29631;
        Object obj2 = objArr[iM32766];
        if (obj2 == null) {
            return false;
        }
        if (obj2.equals(key)) {
            if (c9800.f29636[iM32766] != iIntValue) {
                return false;
            }
            c9800.m24836(iM32766);
            return true;
        }
        while (true) {
            iM32766 = (iM32766 + 1) & c9800.f29631;
            Object obj3 = objArr[iM32766];
            if (obj3 == null) {
                return false;
            }
            if (obj3.equals(key) && c9800.f29636[iM32766] == iIntValue) {
                c9800.m24836(iM32766);
                return true;
            }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f53671.f29629;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f53671.clear();
    }

    @Override // l.AbstractC11462, java.lang.Iterable, l.InterfaceC1144, l.InterfaceC4323
    public final void forEach(Consumer consumer) {
        C9800 c9800 = this.f53671;
        if (c9800.f29634) {
            consumer.n(new C18266(c9800, c9800.f29627));
        }
        Object[] objArr = c9800.f29626;
        int i = c9800.f29627;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return;
            }
            if (objArr[i2] != null) {
                consumer.n(new C18266(c9800, i2));
            }
            i = i2;
        }
    }
}
