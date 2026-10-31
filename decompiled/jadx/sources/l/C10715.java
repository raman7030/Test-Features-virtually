package l;

import java.util.Iterator;
import java.util.Map;
import java.util.Spliterator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۧۖᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: GQL */
/* JADX INFO: loaded from: classes4.dex */
public final class C10715 extends AbstractC17539 implements InterfaceC19182, InterfaceC8886 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9304 f32296;

    @Override // l.AbstractC11462, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* synthetic */ Spliterator spliterator() {
        return C8180.convert(spliterator());
    }

    public C10715(C9304 c9304) {
        this.f32296 = c9304;
    }

    @Override // l.AbstractC11462, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C13926(this);
    }

    @Override // l.AbstractC11462, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final InterfaceC12063 iterator() {
        return new C13926(this);
    }

    @Override // l.InterfaceC19182
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC12063 mo26892() {
        return new C7577(this);
    }

    @Override // l.AbstractC11462, java.util.Collection, java.lang.Iterable, l.InterfaceC1144, l.InterfaceC19825, l.InterfaceC4323, java.util.Set, l.InterfaceC8886
    public final InterfaceC7975 spliterator() {
        return new C1542(this, 0, this.f32296.f28192);
    }

    @Override // l.AbstractC11462, java.lang.Iterable, l.InterfaceC1144, l.InterfaceC4323
    public final void forEach(Consumer consumer) {
        C9304 c9304 = this.f32296;
        int i = c9304.f28192;
        for (int i2 = 0; i2 < i; i2++) {
            consumer.accept(new C14241(c9304, i2));
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f32296.f28192;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry.getKey() != null && (entry.getKey() instanceof Long)) {
            long jLongValue = ((Long) entry.getKey()).longValue();
            C9304 c9304 = this.f32296;
            if (c9304.mo7449(jLongValue) && C11003.equals(c9304.mo7450(jLongValue), entry.getValue())) {
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
        if (entry.getKey() == null || !(entry.getKey() instanceof Long)) {
            return false;
        }
        long jLongValue = ((Long) entry.getKey()).longValue();
        Object value = entry.getValue();
        C9304 c9304 = this.f32296;
        int iM23889 = c9304.m23889(jLongValue);
        if (iM23889 == -1 || !C11003.equals(value, c9304.f28191[iM23889])) {
            return false;
        }
        int i = (c9304.f28192 - iM23889) - 1;
        long[] jArr = c9304.f28196;
        int i2 = iM23889 + 1;
        System.arraycopy(jArr, i2, jArr, iM23889, i);
        Object[] objArr = c9304.f28191;
        System.arraycopy(objArr, i2, objArr, iM23889, i);
        int i3 = c9304.f28192 - 1;
        c9304.f28192 = i3;
        c9304.f28191[i3] = null;
        return true;
    }
}
