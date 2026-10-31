package l;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: renamed from: l.ۖ᩵ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9OP */
/* JADX INFO: loaded from: classes3.dex */
public final class C2731 extends AbstractC19293 implements InterfaceC4142, RandomAccess {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final C2731 f8511 = new C2731();

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final List f8512;

    public C2731(ArrayList arrayList) {
        super(true);
        this.f8512 = arrayList;
    }

    public C2731(InterfaceC4142 interfaceC4142) {
        super(true);
        this.f8512 = new ArrayList(interfaceC4142.size());
        addAll(interfaceC4142);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        m44492();
        this.f8512.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // l.InterfaceC4142
    /* JADX INFO: renamed from: ۟ۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC4142 mo8470() {
        return super.mo44491() ? new C19127(this) : this;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static C2731 m8466() {
        return f8511;
    }

    public C2731() {
        super(false);
        this.f8512 = Collections.EMPTY_LIST;
    }

    public C2731(int i) {
        this(new ArrayList(i));
    }

    @Override // java.util.AbstractList, java.util.List
    public final String get(int i) {
        List list = this.f8512;
        Object obj = list.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof AbstractC5886) {
            AbstractC5886 abstractC5886 = (AbstractC5886) obj;
            String strM16501 = abstractC5886.m16501();
            if (abstractC5886.mo16500()) {
                list.set(i, strM16501);
            }
            return strM16501;
        }
        byte[] bArr = (byte[]) obj;
        String str = new String(bArr, C13997.f41724);
        if (C12071.m29452(bArr)) {
            list.set(i, str);
        }
        return str;
    }

    @Override // l.AbstractC19293, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(this.f8512.size(), collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f8512.size();
    }

    @Override // l.InterfaceC23170
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final InterfaceC23170 mo8473(int i) {
        List list = this.f8512;
        if (i < list.size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i);
        arrayList.addAll(list);
        return new C2731(arrayList);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final String set(int i, String str) {
        m44492();
        Object obj = this.f8512.set(i, str);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (!(obj instanceof AbstractC5886)) {
            return new String((byte[]) obj, C13997.f41724);
        }
        return ((AbstractC5886) obj).m16501();
    }

    @Override // l.AbstractC19293, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        m44492();
        if (collection instanceof InterfaceC4142) {
            collection = ((InterfaceC4142) collection).mo8471();
        }
        boolean zAddAll = this.f8512.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // l.AbstractC19293, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        m44492();
        Object objRemove = this.f8512.remove(i);
        ((AbstractList) this).modCount++;
        if (objRemove instanceof String) {
            return (String) objRemove;
        }
        if (!(objRemove instanceof AbstractC5886)) {
            return new String((byte[]) objRemove, C13997.f41724);
        }
        return ((AbstractC5886) objRemove).m16501();
    }

    @Override // l.AbstractC19293, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        m44492();
        this.f8512.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // l.InterfaceC4142
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo8469(AbstractC5886 abstractC5886) {
        m44492();
        this.f8512.add(abstractC5886);
        ((AbstractList) this).modCount++;
    }

    @Override // l.InterfaceC4142
    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final Object mo8472(int i) {
        return this.f8512.get(i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC5886 m8468(int i) {
        AbstractC5886 abstractC5886M16490;
        List list = this.f8512;
        Object obj = list.get(i);
        if (obj instanceof AbstractC5886) {
            abstractC5886M16490 = (AbstractC5886) obj;
        } else if (obj instanceof String) {
            abstractC5886M16490 = AbstractC5886.m16491((String) obj);
        } else {
            byte[] bArr = (byte[]) obj;
            AbstractC5886 abstractC5886 = AbstractC5886.f18080;
            abstractC5886M16490 = AbstractC5886.m16490(0, bArr.length, bArr);
        }
        if (abstractC5886M16490 != obj) {
            list.set(i, abstractC5886M16490);
        }
        return abstractC5886M16490;
    }

    @Override // l.InterfaceC4142
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final List mo8471() {
        return C20195.unmodifiableList(this.f8512);
    }
}
