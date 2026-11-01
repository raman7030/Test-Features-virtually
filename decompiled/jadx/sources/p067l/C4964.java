package p067l;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: renamed from: l.ۖ᩵ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9OP */
/* JADX INFO: loaded from: classes3.dex */
public final class C4964 extends AbstractC20704 implements InterfaceC6305, RandomAccess {

    /* JADX INFO: renamed from: ᩶ */
    public static final C4964 f11306 = new C4964();

    /* JADX INFO: renamed from: ᩹ */
    public final List f11307;

    public C4964(ArrayList arrayList) {
        super(true);
        this.f11307 = arrayList;
    }

    public C4964(InterfaceC6305 interfaceC6305) {
        super(true);
        this.f11307 = new ArrayList(interfaceC6305.size());
        addAll(interfaceC6305);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        m46786();
        this.f11307.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // p067l.InterfaceC6305
    /* JADX INFO: renamed from: ۟ۧ */
    public final InterfaceC6305 mo10517() {
        return super.mo46785() ? new C20546(this) : this;
    }

    /* JADX INFO: renamed from: ܽ */
    public static C4964 m10513() {
        return f11306;
    }

    public C4964() {
        super(false);
        this.f11307 = Collections.EMPTY_LIST;
    }

    public C4964(int i) {
        this(new ArrayList(i));
    }

    @Override // java.util.AbstractList, java.util.List
    public final String get(int i) {
        List list = this.f11307;
        Object obj = list.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof AbstractC7962) {
            AbstractC7962 abstractC7962 = (AbstractC7962) obj;
            String strM18427 = abstractC7962.m18427();
            if (abstractC7962.mo18426()) {
                list.set(i, strM18427);
            }
            return strM18427;
        }
        byte[] bArr = (byte[]) obj;
        String str = new String(bArr, C15671.f44807);
        if (C13840.m31514(bArr)) {
            list.set(i, str);
        }
        return str;
    }

    @Override // p067l.AbstractC20704, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(this.f11307.size(), collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f11307.size();
    }

    @Override // p067l.InterfaceC24389
    /* JADX INFO: renamed from: ᩷ */
    public final InterfaceC24389 mo10520(int i) {
        List list = this.f11307;
        if (i < list.size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i);
        arrayList.addAll(list);
        return new C4964(arrayList);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: ֫, reason: merged with bridge method [inline-methods] */
    public final String set(int i, String str) {
        m46786();
        Object obj = this.f11307.set(i, str);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (!(obj instanceof AbstractC7962)) {
            return new String((byte[]) obj, C15671.f44807);
        }
        return ((AbstractC7962) obj).m18427();
    }

    @Override // p067l.AbstractC20704, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        m46786();
        if (collection instanceof InterfaceC6305) {
            collection = ((InterfaceC6305) collection).mo10518();
        }
        boolean zAddAll = this.f11307.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // p067l.AbstractC20704, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        m46786();
        Object objRemove = this.f11307.remove(i);
        ((AbstractList) this).modCount++;
        if (objRemove instanceof String) {
            return (String) objRemove;
        }
        if (!(objRemove instanceof AbstractC7962)) {
            return new String((byte[]) objRemove, C15671.f44807);
        }
        return ((AbstractC7962) objRemove).m18427();
    }

    @Override // p067l.AbstractC20704, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        m46786();
        this.f11307.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // p067l.InterfaceC6305
    /* JADX INFO: renamed from: ֫ */
    public final void mo10516(AbstractC7962 abstractC7962) {
        m46786();
        this.f11307.add(abstractC7962);
        ((AbstractList) this).modCount++;
    }

    @Override // p067l.InterfaceC6305
    /* JADX INFO: renamed from: ᩵ */
    public final Object mo10519(int i) {
        return this.f11307.get(i);
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC7962 m10515(int i) {
        AbstractC7962 abstractC7962M18416;
        List list = this.f11307;
        Object obj = list.get(i);
        if (obj instanceof AbstractC7962) {
            abstractC7962M18416 = (AbstractC7962) obj;
        } else if (obj instanceof String) {
            abstractC7962M18416 = AbstractC7962.m18417((String) obj);
        } else {
            byte[] bArr = (byte[]) obj;
            AbstractC7962 abstractC7962 = AbstractC7962.f20935;
            abstractC7962M18416 = AbstractC7962.m18416(0, bArr.length, bArr);
        }
        if (abstractC7962M18416 != obj) {
            list.set(i, abstractC7962M18416);
        }
        return abstractC7962M18416;
    }

    @Override // p067l.InterfaceC6305
    /* JADX INFO: renamed from: ܰ */
    public final List mo10518() {
        return C21562.unmodifiableList(this.f11307);
    }
}
