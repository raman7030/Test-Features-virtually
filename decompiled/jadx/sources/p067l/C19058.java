package p067l;

import java.util.Map;
import java.util.Spliterator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ܿ᩵ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: H1MW */
/* JADX INFO: loaded from: classes5.dex */
public final class C19058 extends AbstractC19038 implements InterfaceC15014, InterfaceC10814 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C11683 f56861;

    @Override // p067l.AbstractC13262, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* synthetic */ Spliterator spliterator() {
        return C10143.convert(spliterator());
    }

    public C19058(C11683 c11683) {
        this.f56861 = c11683;
    }

    @Override // p067l.AbstractC13262, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final InterfaceC13833 iterator() {
        return new C24402(this.f56861);
    }

    @Override // p067l.InterfaceC15014
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC13833 mo34381() {
        return new C9650(this.f56861);
    }

    @Override // p067l.AbstractC13262, java.util.Collection, java.lang.Iterable, p067l.InterfaceC3456, p067l.InterfaceC21210, p067l.InterfaceC6477, java.util.Set, p067l.InterfaceC10814
    public final InterfaceC9948 spliterator() {
        return new C15684(this.f56861);
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
        C11683 c11683 = this.f56861;
        if (key != null) {
            Object[] objArr = c11683.f32577;
            int iM34881 = C15322.m34881(key.hashCode()) & c11683.f32582;
            Object obj3 = objArr[iM34881];
            if (obj3 == null) {
                return false;
            }
            if (!key.equals(obj3)) {
                do {
                    iM34881 = (iM34881 + 1) & c11683.f32582;
                    obj2 = objArr[iM34881];
                    if (obj2 == null) {
                        return false;
                    }
                } while (!key.equals(obj2));
                if (c11683.f32587[iM34881] != iIntValue) {
                    return false;
                }
            } else if (c11683.f32587[iM34881] != iIntValue) {
                return false;
            }
        } else if (!c11683.f32585 || c11683.f32587[c11683.f32578] != iIntValue) {
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
        C11683 c11683 = this.f56861;
        if (key == null) {
            if (!c11683.f32585 || c11683.f32587[c11683.f32578] != iIntValue) {
                return false;
            }
            c11683.m26846();
            return true;
        }
        Object[] objArr = c11683.f32577;
        int iM34881 = C15322.m34881(key.hashCode()) & c11683.f32582;
        Object obj2 = objArr[iM34881];
        if (obj2 == null) {
            return false;
        }
        if (obj2.equals(key)) {
            if (c11683.f32587[iM34881] != iIntValue) {
                return false;
            }
            c11683.m26851(iM34881);
            return true;
        }
        while (true) {
            iM34881 = (iM34881 + 1) & c11683.f32582;
            Object obj3 = objArr[iM34881];
            if (obj3 == null) {
                return false;
            }
            if (obj3.equals(key) && c11683.f32587[iM34881] == iIntValue) {
                c11683.m26851(iM34881);
                return true;
            }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f56861.f32580;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f56861.clear();
    }

    @Override // p067l.AbstractC13262, java.lang.Iterable, p067l.InterfaceC3456, p067l.InterfaceC6477
    public final void forEach(Consumer consumer) {
        C11683 c11683 = this.f56861;
        if (c11683.f32585) {
            consumer.m45213n(new C19729(c11683, c11683.f32578));
        }
        Object[] objArr = c11683.f32577;
        int i = c11683.f32578;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return;
            }
            if (objArr[i2] != null) {
                consumer.m45213n(new C19729(c11683, i2));
            }
            i = i2;
        }
    }
}
