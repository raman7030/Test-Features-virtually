package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/* JADX INFO: renamed from: l.᩺ۗ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 99SU */
/* JADX INFO: loaded from: classes.dex */
public final class C22714 {

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C11008 f73384;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f73386;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public Set f73389;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f73391;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public String f73392;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public TreeSet f73397;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public ArrayList f73393 = new ArrayList();

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public ArrayList f73387 = new ArrayList();

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public ArrayList f73394 = new ArrayList();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public ArrayList f73396 = new ArrayList();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public ArrayList f73382 = new ArrayList();

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public TreeSet f73385 = new TreeSet();

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public TreeSet f73383 = new TreeSet();

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public TreeSet f73390 = new TreeSet();

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f73381 = -1;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public int f73395 = -1;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f73388 = false;

    public C22714(C11008 c11008, String str, int i) {
        this.f73384 = c11008;
        this.f73392 = str;
        this.f73386 = i;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m50747(C22714 c22714) {
        ArrayList arrayList = this.f73387;
        if (arrayList.contains(c22714)) {
            return;
        }
        arrayList.add(c22714);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m50748(C22714 c22714, boolean z) {
        if (c22714 == this) {
            return;
        }
        ArrayList arrayList = this.f73394;
        if (!arrayList.contains(c22714)) {
            arrayList.add(c22714);
        }
        if (z) {
            ArrayList arrayList2 = this.f73382;
            if (arrayList2.contains(c22714)) {
                return;
            }
            arrayList2.add(c22714);
            return;
        }
        ArrayList arrayList3 = this.f73396;
        if (arrayList3.contains(c22714)) {
            return;
        }
        arrayList3.add(c22714);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final Set m50752() {
        Set set = this.f73389;
        if (set != null) {
            return set;
        }
        Set setM50744 = m50744();
        this.f73389 = setM50744;
        return setM50744;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private Set m50744() {
        int i;
        Set set = this.f73389;
        if (set != null) {
            return set;
        }
        if (this.f73388) {
            return Collections.EMPTY_SET;
        }
        C11008 c11008 = this.f73384;
        if (c11008.f33114 > 60 || (i = c11008.f33113) > 25) {
            HashSet hashSet = new HashSet();
            for (int i2 = 0; i2 < this.f73386; i2++) {
                if (!this.f73390.contains(Integer.valueOf(i2))) {
                    hashSet.add(Integer.valueOf(i2));
                }
            }
            this.f73389 = hashSet;
            return hashSet;
        }
        this.f73388 = true;
        c11008.f33113 = i + 1;
        HashSet hashSet2 = new HashSet();
        int i3 = c11008.f33114;
        ArrayList<C22714> arrayList = this.f73394;
        c11008.f33114 = arrayList.size() + i3;
        boolean z = true;
        for (C22714 c22714 : arrayList) {
            hashSet2.addAll(c22714.m50744());
            if (z && c22714.f73389 == null) {
                z = false;
            }
        }
        c11008.f33114 -= arrayList.size();
        if (this.f73382.isEmpty()) {
            hashSet2.removeAll(this.f73383);
        }
        hashSet2.addAll(this.f73385);
        if (z) {
            this.f73389 = hashSet2;
        }
        this.f73388 = false;
        c11008.f33113--;
        return hashSet2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m50745() {
        if (this.f73397 != null) {
            return;
        }
        m50751();
        Iterator it = this.f73387.iterator();
        while (it.hasNext()) {
            ((C22714) it.next()).m50745();
        }
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final Set m50751() {
        TreeSet treeSet = this.f73397;
        if (treeSet != null) {
            return treeSet;
        }
        TreeSet treeSet2 = new TreeSet();
        Iterator it = this.f73394.iterator();
        while (it.hasNext()) {
            Set setM50752 = ((C22714) it.next()).m50752();
            C11003.requireNonNull(setM50752);
            treeSet2.addAll(setM50752);
        }
        this.f73397 = treeSet2;
        return treeSet2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m50746(int i, HashSet hashSet) {
        m50742(i, hashSet, new HashSet());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m50742(int i, HashSet hashSet, HashSet hashSet2) {
        if (hashSet2.add(this)) {
            for (C22714 c22714 : this.f73387) {
                if (c22714.f73396.contains(this)) {
                    c22714.m50743(i, hashSet, hashSet2);
                } else {
                    c22714.m50742(i, hashSet, hashSet2);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m50743(int i, HashSet hashSet, HashSet hashSet2) {
        if (!hashSet2.add(this)) {
            return;
        }
        C11426 c11426 = new C11426();
        c11426.f34173 = i;
        ArrayList arrayList = this.f73393;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                InterfaceC22677 interfaceC22677 = (AbstractC7479) arrayList.get(size);
                C12836.m31223(interfaceC22677, false, c11426);
                if (c11426.f34172) {
                    switch (C5781.f17801[interfaceC22677.mo3975().ordinal()]) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                            c11426.f34172 = false;
                            i = ((InterfaceC23651) interfaceC22677).mo7930();
                            c11426.f34173 = i;
                            break;
                        default:
                            hashSet.add(interfaceC22677);
                            return;
                    }
                }
            } else {
                for (C22714 c22714 : this.f73387) {
                    if (c22714.f73396.contains(this)) {
                        c22714.m50743(i, hashSet, hashSet2);
                    } else {
                        c22714.m50742(i, hashSet, hashSet2);
                    }
                }
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC7479 m50749() {
        return (AbstractC7479) this.f73393.get(0);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final ArrayList m50750() {
        return this.f73393;
    }
}
