package l;

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
public final class C7279 extends C6759 implements Collection, InterfaceC1144 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f22343;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f22344;

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return false;
    }

    @Override // java.lang.Iterable, l.InterfaceC1144, l.InterfaceC4323
    public /* synthetic */ void forEach(Consumer consumer) {
        C21962.$default$forEach(this, consumer);
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.util.Collection
    public /* synthetic */ Stream parallelStream() {
        return C18370.convert(mo42463parallelStream());
    }

    @Override // java.util.Collection, l.InterfaceC1144
    /* JADX INFO: renamed from: parallelStream */
    public /* synthetic */ InterfaceC17664 mo42463parallelStream() {
        return C14841.stream(C5378.b(this), true);
    }

    @Override // java.util.Collection, l.InterfaceC1144
    public /* synthetic */ boolean removeIf(Predicate predicate) {
        return C0438.$default$removeIf(this, predicate);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public /* synthetic */ Spliterator spliterator() {
        return C8180.convert(spliterator());
    }

    @Override // java.util.Collection, java.lang.Iterable, l.InterfaceC1144, l.InterfaceC19825, l.InterfaceC4323, java.util.Set, l.InterfaceC8886
    public /* synthetic */ InterfaceC15234 spliterator() {
        return C22291.spliterator(this, 0);
    }

    @Override // java.util.Collection
    public /* synthetic */ Stream stream() {
        return C18370.convert(mo42464stream());
    }

    @Override // java.util.Collection, l.InterfaceC1144
    public /* synthetic */ Object[] toArray(IntFunction intFunction) {
        return toArray((Object[]) intFunction.apply(0));
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        return this.f22343.add((InterfaceC1800) obj);
    }

    public C7279(C3046 c3046, EnumC4662 enumC4662, boolean z, ArrayList arrayList) {
        super(c3046, enumC4662);
        this.f22343 = arrayList;
        this.f22344 = z;
    }

    public C7279(C3046 c3046, EnumC4662 enumC4662, ArrayList arrayList) {
        this(c3046, enumC4662, false, arrayList);
    }

    public C7279(C3046 c3046, EnumC4662 enumC4662) {
        this(c3046, enumC4662, false, new ArrayList());
    }

    public C7279(C3046 c3046, EnumC4662 enumC4662, int i) {
        this(c3046, enumC4662, true, new ArrayList());
    }

    public final InterfaceC1800 get(int i) {
        return (InterfaceC1800) this.f22343.get(i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C16646 m19532(C14458 c14458) {
        return C5378.stream(this.f22343).filter(c14458).findFirst();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m19535(InterfaceC1800 interfaceC1800) {
        this.f22343.add(interfaceC1800);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        return this.f22343.remove(obj);
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.f22343.containsAll(collection);
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        return this.f22343.addAll(collection);
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        return this.f22343.removeAll(collection);
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        return this.f22343.retainAll(collection);
    }

    @Override // java.util.Collection
    public final void clear() {
        this.f22343.clear();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m19536(InterfaceC17664 interfaceC17664) {
        InterfaceC17664 interfaceC17664Filter = interfaceC17664.filter(new C13628());
        ArrayList arrayList = this.f22343;
        C11003.requireNonNull(arrayList);
        interfaceC17664Filter.forEach(new C15264(1, arrayList));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m19533(int i, C6033 c6033) {
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f22343.size();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m19534(ArrayList arrayList) {
        ArrayList arrayList2 = this.f22343;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
    }

    public final ArrayList getElements() {
        return this.f22343;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.f22343.iterator();
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return this.f22343.toArray();
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return this.f22343.toArray(objArr);
    }

    @Override // java.util.Collection, l.InterfaceC1144
    /* JADX INFO: renamed from: stream */
    public final InterfaceC17664 mo42464stream() {
        return C5378.stream(this.f22343);
    }

    @Override // l.C6759
    /* JADX INFO: renamed from: ܽ */
    public final int mo5678() {
        return C5378.stream(this.f22343).mapToInt(new C22801()).sum() + (this.f22344 ? 1 : 2);
    }

    @Override // l.C6759, l.InterfaceC1800
    /* JADX INFO: renamed from: ֫ */
    public final void mo2828(InterfaceC0408 interfaceC0408) throws IOException {
        super.mo2828(interfaceC0408);
        ArrayList arrayList = this.f22343;
        int iCount = (int) C5378.stream(arrayList).filter(new C11513()).count();
        if (this.f22344) {
            ((C6053) interfaceC0408).m16882(iCount);
        } else {
            ((C6053) interfaceC0408).m16889(iCount);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((InterfaceC1800) it.next()).mo2828(interfaceC0408);
        }
    }
}
