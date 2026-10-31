package l;

import java.util.Map;
import java.util.Spliterator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ܿ֡ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: DD2 */
/* JADX INFO: loaded from: classes5.dex */
public final class C17001 extends AbstractC17539 implements InterfaceC13326, InterfaceC8886 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9241 f52158;

    @Override // l.AbstractC11462, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* synthetic */ Spliterator spliterator() {
        return C8180.convert(spliterator());
    }

    public C17001(C9241 c9241) {
        this.f52158 = c9241;
    }

    @Override // l.AbstractC11462, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final InterfaceC12063 iterator() {
        return new C23204(this.f52158);
    }

    @Override // l.InterfaceC13326
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC12063 mo12555() {
        return new C7682(this.f52158);
    }

    @Override // l.AbstractC11462, java.util.Collection, java.lang.Iterable, l.InterfaceC1144, l.InterfaceC19825, l.InterfaceC4323, java.util.Set, l.InterfaceC8886
    public final InterfaceC7975 spliterator() {
        return new C14031(this.f52158);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Object obj2;
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Object value = entry.getValue();
        C9241 c9241 = this.f52158;
        if (c9241.f27987.mo8734(key, null)) {
            return c9241.f27985 && C11003.equals(c9241.f27983[c9241.f27977], value);
        }
        Object[] objArr = c9241.f27976;
        int iM32766 = C13630.m32766(c9241.f27987.mo8733(key)) & c9241.f27982;
        Object obj3 = objArr[iM32766];
        if (obj3 == null) {
            return false;
        }
        if (c9241.f27987.mo8734(key, obj3)) {
            return C11003.equals(c9241.f27983[iM32766], value);
        }
        do {
            iM32766 = (iM32766 + 1) & c9241.f27982;
            obj2 = objArr[iM32766];
            if (obj2 == null) {
                return false;
            }
        } while (!c9241.f27987.mo8734(key, obj2));
        return C11003.equals(c9241.f27983[iM32766], value);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Object value = entry.getValue();
        C9241 c9241 = this.f52158;
        if (c9241.f27987.mo8734(key, null)) {
            if (!c9241.f27985 || !C11003.equals(c9241.f27983[c9241.f27977], value)) {
                return false;
            }
            c9241.m23686();
            return true;
        }
        Object[] objArr = c9241.f27976;
        int iM32766 = C13630.m32766(c9241.f27987.mo8733(key)) & c9241.f27982;
        Object obj2 = objArr[iM32766];
        if (obj2 == null) {
            return false;
        }
        if (c9241.f27987.mo8734(obj2, key)) {
            if (!C11003.equals(c9241.f27983[iM32766], value)) {
                return false;
            }
            c9241.m23687(iM32766);
            return true;
        }
        while (true) {
            iM32766 = (iM32766 + 1) & c9241.f27982;
            Object obj3 = objArr[iM32766];
            if (obj3 == null) {
                return false;
            }
            if (c9241.f27987.mo8734(obj3, key) && C11003.equals(c9241.f27983[iM32766], value)) {
                c9241.m23687(iM32766);
                return true;
            }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f52158.f27980;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f52158.clear();
    }

    @Override // l.AbstractC11462, java.lang.Iterable, l.InterfaceC1144, l.InterfaceC4323
    public final void forEach(Consumer consumer) {
        C9241 c9241 = this.f52158;
        if (c9241.f27985) {
            consumer.n(new C17707(c9241, c9241.f27977));
        }
        Object[] objArr = c9241.f27976;
        int i = c9241.f27977;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return;
            }
            if (objArr[i2] != null) {
                consumer.n(new C17707(c9241, i2));
            }
            i = i2;
        }
    }
}
