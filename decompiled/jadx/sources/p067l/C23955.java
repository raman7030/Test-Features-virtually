package p067l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/* JADX INFO: renamed from: l.᩺ۗ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 99SU */
/* JADX INFO: loaded from: classes.dex */
public final class C23955 {

    /* JADX INFO: renamed from: ۘ */
    public final C12830 f76107;

    /* JADX INFO: renamed from: ۡ */
    public int f76109;

    /* JADX INFO: renamed from: ܳ */
    public Set f76112;

    /* JADX INFO: renamed from: ܽ */
    public boolean f76114;

    /* JADX INFO: renamed from: ܿ */
    public String f76115;

    /* JADX INFO: renamed from: ᩻ */
    public TreeSet f76120;

    /* JADX INFO: renamed from: ᩳ */
    public ArrayList f76116 = new ArrayList();

    /* JADX INFO: renamed from: ۢ */
    public ArrayList f76110 = new ArrayList();

    /* JADX INFO: renamed from: ᩴ */
    public ArrayList f76117 = new ArrayList();

    /* JADX INFO: renamed from: ᩷ */
    public ArrayList f76119 = new ArrayList();

    /* JADX INFO: renamed from: ֫ */
    public ArrayList f76105 = new ArrayList();

    /* JADX INFO: renamed from: ۜ */
    public TreeSet f76108 = new TreeSet();

    /* JADX INFO: renamed from: ۖ */
    public TreeSet f76106 = new TreeSet();

    /* JADX INFO: renamed from: ܺ */
    public TreeSet f76113 = new TreeSet();

    /* JADX INFO: renamed from: ֡ */
    public int f76104 = -1;

    /* JADX INFO: renamed from: ᩵ */
    public int f76118 = -1;

    /* JADX INFO: renamed from: ۧ */
    public boolean f76111 = false;

    public C23955(C12830 c12830, String str, int i) {
        this.f76107 = c12830;
        this.f76115 = str;
        this.f76109 = i;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m53073(C23955 c23955) {
        ArrayList arrayList = this.f76110;
        if (arrayList.contains(c23955)) {
            return;
        }
        arrayList.add(c23955);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m53074(C23955 c23955, boolean z) {
        if (c23955 == this) {
            return;
        }
        ArrayList arrayList = this.f76117;
        if (!arrayList.contains(c23955)) {
            arrayList.add(c23955);
        }
        if (z) {
            ArrayList arrayList2 = this.f76105;
            if (arrayList2.contains(c23955)) {
                return;
            }
            arrayList2.add(c23955);
            return;
        }
        ArrayList arrayList3 = this.f76119;
        if (arrayList3.contains(c23955)) {
            return;
        }
        arrayList3.add(c23955);
    }

    /* JADX INFO: renamed from: ᩳ */
    public final Set m53078() {
        Set set = this.f76112;
        if (set != null) {
            return set;
        }
        Set setM53070 = m53070();
        this.f76112 = setM53070;
        return setM53070;
    }

    /* JADX INFO: renamed from: ܳ */
    private Set m53070() {
        int i;
        Set set = this.f76112;
        if (set != null) {
            return set;
        }
        if (this.f76111) {
            return Collections.EMPTY_SET;
        }
        C12830 c12830 = this.f76107;
        if (c12830.f36108 > 60 || (i = c12830.f36107) > 25) {
            HashSet hashSet = new HashSet();
            for (int i2 = 0; i2 < this.f76109; i2++) {
                if (!this.f76113.contains(Integer.valueOf(i2))) {
                    hashSet.add(Integer.valueOf(i2));
                }
            }
            this.f76112 = hashSet;
            return hashSet;
        }
        this.f76111 = true;
        c12830.f36107 = i + 1;
        HashSet hashSet2 = new HashSet();
        int i3 = c12830.f36108;
        ArrayList<C23955> arrayList = this.f76117;
        c12830.f36108 = arrayList.size() + i3;
        boolean z = true;
        for (C23955 c23955 : arrayList) {
            hashSet2.addAll(c23955.m53070());
            if (z && c23955.f76112 == null) {
                z = false;
            }
        }
        c12830.f36108 -= arrayList.size();
        if (this.f76105.isEmpty()) {
            hashSet2.removeAll(this.f76106);
        }
        hashSet2.addAll(this.f76108);
        if (z) {
            this.f76112 = hashSet2;
        }
        this.f76111 = false;
        c12830.f36107--;
        return hashSet2;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m53071() {
        if (this.f76120 != null) {
            return;
        }
        m53077();
        Iterator it = this.f76110.iterator();
        while (it.hasNext()) {
            ((C23955) it.next()).m53071();
        }
    }

    /* JADX INFO: renamed from: ܿ */
    public final Set m53077() {
        TreeSet treeSet = this.f76120;
        if (treeSet != null) {
            return treeSet;
        }
        TreeSet treeSet2 = new TreeSet();
        Iterator it = this.f76117.iterator();
        while (it.hasNext()) {
            Set setM53078 = ((C23955) it.next()).m53078();
            C12826.requireNonNull(setM53078);
            treeSet2.addAll(setM53078);
        }
        this.f76120 = treeSet2;
        return treeSet2;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m53072(int i, HashSet hashSet) {
        m53068(i, hashSet, new HashSet());
    }

    /* JADX INFO: renamed from: ֫ */
    private void m53068(int i, HashSet hashSet, HashSet hashSet2) {
        if (hashSet2.add(this)) {
            for (C23955 c23955 : this.f76110) {
                if (c23955.f76119.contains(this)) {
                    c23955.m53069(i, hashSet, hashSet2);
                } else {
                    c23955.m53068(i, hashSet, hashSet2);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۧ */
    private void m53069(int i, HashSet hashSet, HashSet hashSet2) {
        if (!hashSet2.add(this)) {
            return;
        }
        C13227 c13227 = new C13227();
        c13227.f37169 = i;
        ArrayList arrayList = this.f76116;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                InterfaceC23920 interfaceC23920 = (AbstractC9476) arrayList.get(size);
                C14567.m33309(interfaceC23920, false, c13227);
                if (c13227.f37168) {
                    switch (C7862.f20647[interfaceC23920.mo6217().ordinal()]) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                            c13227.f37168 = false;
                            i = ((InterfaceC24846) interfaceC23920).mo9978();
                            c13227.f37169 = i;
                            break;
                        default:
                            hashSet.add(interfaceC23920);
                            return;
                    }
                }
            } else {
                for (C23955 c23955 : this.f76110) {
                    if (c23955.f76119.contains(this)) {
                        c23955.m53069(i, hashSet, hashSet2);
                    } else {
                        c23955.m53068(i, hashSet, hashSet2);
                    }
                }
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final AbstractC9476 m53075() {
        return (AbstractC9476) this.f76116.get(0);
    }

    /* JADX INFO: renamed from: ܽ */
    public final ArrayList m53076() {
        return this.f76116;
    }
}
