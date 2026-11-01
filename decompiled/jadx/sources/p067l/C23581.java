package p067l;

import java.util.Iterator;
import java.util.Map;
import java.util.Spliterator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩹ܰۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: YCK3 */
/* JADX INFO: loaded from: classes2.dex */
public final class C23581 extends AbstractC19038 implements InterfaceC19383, InterfaceC10814 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C13523 f75068;

    @Override // p067l.AbstractC13262, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* synthetic */ Spliterator spliterator() {
        return C10143.convert(spliterator());
    }

    public C23581(C13523 c13523) {
        this.f75068 = c13523;
    }

    @Override // p067l.AbstractC13262, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C10170(this);
    }

    @Override // p067l.AbstractC13262, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final InterfaceC13833 iterator() {
        return new C10170(this);
    }

    @Override // p067l.InterfaceC19383
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC13833 mo44126() {
        return new C16874(this);
    }

    @Override // p067l.AbstractC13262, java.util.Collection, java.lang.Iterable, p067l.InterfaceC3456, p067l.InterfaceC21210, p067l.InterfaceC6477, java.util.Set, p067l.InterfaceC10814
    public final InterfaceC9948 spliterator() {
        return new C22911(this, 0, this.f75068.f38006);
    }

    @Override // p067l.AbstractC13262, java.lang.Iterable, p067l.InterfaceC3456, p067l.InterfaceC6477
    public final void forEach(Consumer consumer) {
        C13523 c13523 = this.f75068;
        int i = c13523.f38006;
        for (int i2 = 0; i2 < i; i2++) {
            consumer.accept(new C14863(c13523, i2));
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f75068.f38006;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry.getKey() != null && (entry.getKey() instanceof Character) && entry.getValue() != null && (entry.getValue() instanceof Character)) {
            char cCharValue = ((Character) entry.getKey()).charValue();
            C13523 c13523 = this.f75068;
            if (c13523.mo22105(cCharValue) && c13523.mo22106(cCharValue) == ((Character) entry.getValue()).charValue()) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry.getKey() == null || !(entry.getKey() instanceof Character) || entry.getValue() == null || !(entry.getValue() instanceof Character)) {
            return false;
        }
        char cCharValue = ((Character) entry.getKey()).charValue();
        char cCharValue2 = ((Character) entry.getValue()).charValue();
        C13523 c13523 = this.f75068;
        int iM30688 = c13523.m30688(cCharValue);
        if (iM30688 == -1 || cCharValue2 != c13523.f38005[iM30688]) {
            return false;
        }
        int i = (c13523.f38006 - iM30688) - 1;
        char[] cArr = c13523.f38010;
        int i2 = iM30688 + 1;
        System.arraycopy(cArr, i2, cArr, iM30688, i);
        char[] cArr2 = c13523.f38005;
        System.arraycopy(cArr2, i2, cArr2, iM30688, i);
        c13523.f38006--;
        return true;
    }
}
