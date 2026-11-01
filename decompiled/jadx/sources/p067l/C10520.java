package p067l;

import java.util.Map;
import java.util.Spliterator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۡ֫ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 97L */
/* JADX INFO: loaded from: classes4.dex */
public final class C10520 extends AbstractC19038 implements InterfaceC24076, InterfaceC10814 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C20579 f29115;

    @Override // p067l.AbstractC13262, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* synthetic */ Spliterator spliterator() {
        return C10143.convert(spliterator());
    }

    public C10520(C20579 c20579) {
        this.f29115 = c20579;
    }

    @Override // p067l.AbstractC13262, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final InterfaceC13833 iterator() {
        return new C19237(this.f29115);
    }

    @Override // p067l.InterfaceC24076
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC13833 mo24255() {
        return new C15883(this.f29115);
    }

    @Override // p067l.AbstractC13262, java.util.Collection, java.lang.Iterable, p067l.InterfaceC3456, p067l.InterfaceC21210, p067l.InterfaceC6477, java.util.Set, p067l.InterfaceC10814
    public final InterfaceC9948 spliterator() {
        return new C18566(this.f29115);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        char c;
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry.getKey() == null || !(entry.getKey() instanceof Character)) {
            return false;
        }
        char cCharValue = ((Character) entry.getKey()).charValue();
        Object value = entry.getValue();
        C20579 c20579 = this.f29115;
        if (cCharValue == 0) {
            return c20579.f63615 && C12826.equals(c20579.f63617[c20579.f63608], value);
        }
        char[] cArr = c20579.f63607;
        int iM34881 = C15322.m34881((int) cCharValue) & c20579.f63612;
        char c2 = cArr[iM34881];
        if (c2 == 0) {
            return false;
        }
        if (cCharValue == c2) {
            return C12826.equals(c20579.f63617[iM34881], value);
        }
        do {
            iM34881 = (iM34881 + 1) & c20579.f63612;
            c = cArr[iM34881];
            if (c == 0) {
                return false;
            }
        } while (cCharValue != c);
        return C12826.equals(c20579.f63617[iM34881], value);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry.getKey() == null || !(entry.getKey() instanceof Character)) {
            return false;
        }
        char cCharValue = ((Character) entry.getKey()).charValue();
        Object value = entry.getValue();
        C20579 c20579 = this.f29115;
        if (cCharValue == 0) {
            if (!c20579.f63615 || !C12826.equals(c20579.f63617[c20579.f63608], value)) {
                return false;
            }
            c20579.m46534();
            return true;
        }
        char[] cArr = c20579.f63607;
        int iM34881 = C15322.m34881((int) cCharValue) & c20579.f63612;
        char c = cArr[iM34881];
        if (c == 0) {
            return false;
        }
        if (c == cCharValue) {
            if (!C12826.equals(c20579.f63617[iM34881], value)) {
                return false;
            }
            c20579.m46537(iM34881);
            return true;
        }
        while (true) {
            iM34881 = (iM34881 + 1) & c20579.f63612;
            char c2 = cArr[iM34881];
            if (c2 == 0) {
                return false;
            }
            if (c2 == cCharValue && C12826.equals(c20579.f63617[iM34881], value)) {
                c20579.m46537(iM34881);
                return true;
            }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f29115.f63610;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f29115.clear();
    }

    @Override // p067l.AbstractC13262, java.lang.Iterable, p067l.InterfaceC3456, p067l.InterfaceC6477
    public final void forEach(Consumer consumer) {
        C20579 c20579 = this.f29115;
        if (c20579.f63615) {
            consumer.m45213n(new C11191(c20579, c20579.f63608));
        }
        char[] cArr = c20579.f63607;
        int i = c20579.f63608;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return;
            }
            if (cArr[i2] != 0) {
                consumer.m45213n(new C11191(c20579, i2));
            }
            i = i2;
        }
    }
}
