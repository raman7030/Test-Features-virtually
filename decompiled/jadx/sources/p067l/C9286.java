package p067l;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.stream.Stream;

/* JADX INFO: renamed from: l.۟ۛۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: T7DJ */
/* JADX INFO: loaded from: classes3.dex */
public final class C9286 extends C8792 implements Collection, InterfaceC3456 {

    /* JADX INFO: renamed from: ۙ */
    public final ArrayList f25234;

    /* JADX INFO: renamed from: ᩶ */
    public boolean f25235;

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return false;
    }

    @Override // java.lang.Iterable, p067l.InterfaceC3456, p067l.InterfaceC6477
    public /* synthetic */ void forEach(Consumer consumer) {
        C23241.$default$forEach(this, consumer);
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.util.Collection
    public /* synthetic */ Stream parallelStream() {
        return C19828.convert(mo56527parallelStream());
    }

    @Override // java.util.Collection, p067l.InterfaceC3456
    /* JADX INFO: renamed from: parallelStream */
    public /* synthetic */ InterfaceC19157 mo56527parallelStream() {
        return C16474.stream(C7480.m17261b(this), true);
    }

    @Override // java.util.Collection, p067l.InterfaceC3456
    public /* synthetic */ boolean removeIf(Predicate predicate) {
        return C2785.$default$removeIf(this, predicate);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public /* synthetic */ Spliterator spliterator() {
        return C10143.convert(spliterator());
    }

    @Override // java.util.Collection, java.lang.Iterable, p067l.InterfaceC3456, p067l.InterfaceC21210, p067l.InterfaceC6477, java.util.Set, p067l.InterfaceC10814
    public /* synthetic */ InterfaceC16847 spliterator() {
        return C23554.spliterator(this, 0);
    }

    @Override // java.util.Collection
    public /* synthetic */ Stream stream() {
        return C19828.convert(mo56528stream());
    }

    @Override // java.util.Collection, p067l.InterfaceC3456
    public /* synthetic */ Object[] toArray(IntFunction intFunction) {
        return toArray((Object[]) intFunction.apply(0));
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        return this.f25234.add((InterfaceC4079) obj);
    }

    public C9286(C5263 c5263, EnumC6799 enumC6799, boolean z, ArrayList arrayList) {
        super(c5263, enumC6799);
        this.f25234 = arrayList;
        this.f25235 = z;
    }

    public C9286(C5263 c5263, EnumC6799 enumC6799, ArrayList arrayList) {
        this(c5263, enumC6799, false, arrayList);
    }

    public C9286(C5263 c5263, EnumC6799 enumC6799) {
        this(c5263, enumC6799, false, new ArrayList());
    }

    public C9286(C5263 c5263, EnumC6799 enumC6799, int i) {
        this(c5263, enumC6799, true, new ArrayList());
    }

    public final InterfaceC4079 get(int i) {
        return (InterfaceC4079) this.f25234.get(i);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C18189 m21499(C16109 c16109) {
        return C7480.stream(this.f25234).filter(c16109).findFirst();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m21502(InterfaceC4079 interfaceC4079) {
        this.f25234.add(interfaceC4079);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        return this.f25234.remove(obj);
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.f25234.containsAll(collection);
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        return this.f25234.addAll(collection);
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        return this.f25234.removeAll(collection);
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        return this.f25234.retainAll(collection);
    }

    @Override // java.util.Collection
    public final void clear() {
        this.f25234.clear();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m21503(InterfaceC19157 interfaceC19157) {
        InterfaceC19157 interfaceC19157Filter = interfaceC19157.filter(new C15320());
        ArrayList arrayList = this.f25234;
        C12826.requireNonNull(arrayList);
        interfaceC19157Filter.forEach(new C16875(1, arrayList));
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m21500(int i, C8102 c8102) {
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f25234.size();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m21501(ArrayList arrayList) {
        ArrayList arrayList2 = this.f25234;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
    }

    public final ArrayList getElements() {
        return this.f25234;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.f25234.iterator();
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return this.f25234.toArray();
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return this.f25234.toArray(objArr);
    }

    @Override // java.util.Collection, p067l.InterfaceC3456
    /* JADX INFO: renamed from: stream */
    public final InterfaceC19157 mo56528stream() {
        return C7480.stream(this.f25234);
    }

    @Override // p067l.C8792
    /* JADX INFO: renamed from: ܽ */
    public final int mo7908() {
        return C7480.stream(this.f25234).mapToInt(new C24038()).sum() + (this.f25235 ? 1 : 2);
    }

    @Override // p067l.C8792, p067l.InterfaceC4079
    /* JADX INFO: renamed from: ֫ */
    public final void mo5157(InterfaceC2756 interfaceC2756) throws IOException {
        super.mo5157(interfaceC2756);
        ArrayList arrayList = this.f25234;
        int iCount = (int) C7480.stream(arrayList).filter(new C13310()).count();
        if (this.f25235) {
            ((C8121) interfaceC2756).m18811(iCount);
        } else {
            ((C8121) interfaceC2756).m18818(iCount);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((InterfaceC4079) it.next()).mo5157(interfaceC2756);
        }
    }
}
