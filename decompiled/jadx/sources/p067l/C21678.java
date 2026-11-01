package p067l;

import com.google.android.material.color.ColorResourcesTableCreator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩶ܿܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 84S9 */
/* JADX INFO: loaded from: classes5.dex */
public final class C21678 extends AbstractC12310 {

    /* JADX INFO: renamed from: ۗ */
    public final ArrayList f68291;

    /* JADX INFO: renamed from: ۬ */
    public final ArrayList f68292;

    public C21678(C10278 c10278, int i) {
        super(c10278, i);
        this.f68291 = new ArrayList();
        this.f68292 = new ArrayList();
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m48942(int i, boolean z) {
        m48932(i);
        m28354(i, z);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m48941(int i, int i2) {
        m48932(i);
        m28353(i, i2);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C4914 m48931(C22999 c22999) {
        ArrayList<C4914> arrayList = this.f68291;
        for (C4914 c4914 : arrayList) {
            if (c4914.mo20693().equals(c22999)) {
                return c4914;
            }
        }
        C4914 c4915 = new C4914(this, c22999);
        arrayList.add(c4915);
        return c4915;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m48936(C4914 c4914, C22999 c22999) {
        if (c4914.getType() != this) {
            throw new RuntimeException("The entry being copied must belong to this type");
        }
        ArrayList arrayList = this.f68291;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((C4914) it.next()).mo20693().equals(c22999)) {
                throw new RuntimeException("Config flags exists: " + c22999.toString());
            }
        }
        C4914 c4915 = new C4914(this, c22999);
        c4915.m10443(c4914.mo4716());
        c4915.m10441(c4914.mo4720());
        arrayList.add(c4915);
        for (InterfaceC22528 interfaceC22528 : c4914.mo20696()) {
            c4915.m10438(interfaceC22528.mo50213()).m45911(interfaceC22528);
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m48947(int i) {
        if (i > 65536) {
            i = 65536;
        }
        ArrayList arrayList = this.f68292;
        if (i < arrayList.size()) {
            return;
        }
        arrayList.ensureCapacity(i);
        for (int size = i - arrayList.size(); size > 0; size--) {
            arrayList.add(null);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m48930(String str) {
        ArrayList arrayList = this.f68292;
        arrayList.add(str);
        return arrayList.size() - 1;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m48934(int i, String str, boolean z) {
        if (i >= 65536) {
            throw new IllegalArgumentException("id > 0xFFFF");
        }
        ArrayList arrayList = this.f68292;
        if (i >= arrayList.size()) {
            for (int size = i - arrayList.size(); size > 0; size--) {
                arrayList.add(null);
            }
            arrayList.add(str);
            return;
        }
        String str2 = (String) arrayList.get(i);
        if (str2 == null) {
            arrayList.set(i, str);
        } else if (!z && !str2.equals(str)) {
            throw new RuntimeException(String.format("There is already a entry with id of 0x%04x, named \"%s\" not \"%s\". (%s)", Integer.valueOf(i), str2, str, getTypeName()));
        }
    }

    /* JADX INFO: renamed from: ᩻ */
    public final void m48949(int i) {
        this.f68291.remove(i);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m48935(C4914 c4914) {
        this.f68291.remove(c4914);
    }

    /* JADX INFO: renamed from: ܳ */
    public final void m48943() {
        this.f68291.clear();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m48933(int i, String str) {
        ArrayList arrayList = this.f68292;
        if (i >= arrayList.size()) {
            throw new RuntimeException(C19768.m44906(i, "Please add entry with id of ", " first"));
        }
        arrayList.set(i, str);
    }

    /* JADX INFO: renamed from: ܽ */
    public final String m48945(int i) {
        return (String) this.f68292.get(i);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m48932(int i) {
        ArrayList arrayList = this.f68292;
        if (i >= arrayList.size() || arrayList.get(i) == null) {
            throw new RuntimeException(C19768.m44906(i, "Please add entry with id of ", " first"));
        }
    }

    /* JADX INFO: renamed from: ۜ */
    public final C14301 m48938() {
        ArrayList arrayList = this.f68292;
        C14301 c14301 = new C14301(arrayList.size());
        for (int i = 0; i < arrayList.size(); i++) {
            String str = (String) arrayList.get(i);
            if (str != null) {
                c14301.put(str, Integer.valueOf(i));
            }
        }
        return c14301;
    }

    @Override // p067l.AbstractC12310, p067l.InterfaceC3080
    /* JADX INFO: renamed from: ֫ */
    public final int mo5196(InterfaceC17161 interfaceC17161) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f68292;
            if (i >= arrayList.size()) {
                return -1;
            }
            String str = (String) arrayList.get(i);
            if (str != null && interfaceC17161.mo12311(str)) {
                return i;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m48937(InterfaceC6631 interfaceC6631, C14301 c14301, C20689 c20689) {
        int size = this.f68292.size();
        interfaceC6631.mo15111(ColorResourcesTableCreator.HEADER_TYPE_TYPE_SPEC);
        interfaceC6631.mo15111((short) 16);
        interfaceC6631.writeInt((size * 4) + 16);
        interfaceC6631.writeByte(mo5199());
        interfaceC6631.writeByte(0);
        ArrayList arrayList = this.f68291;
        interfaceC6631.mo15113(Math.min(arrayList.size(), 65535));
        interfaceC6631.writeInt(size);
        if (c20689 != null) {
            c20689.m46754(1);
        }
        int[] iArr = new int[size];
        C22999[] c22999Arr = new C22999[size];
        for (InterfaceC9116 interfaceC9116 : m28355()) {
            C22999 c22999Mo20693 = interfaceC9116.mo20693();
            for (InterfaceC22528 interfaceC22528 : interfaceC9116.mo20696()) {
                int iMo50213 = interfaceC22528.mo50213();
                C22999 c22999 = c22999Arr[iMo50213];
                if (c22999 == null) {
                    c22999Arr[iMo50213] = c22999Mo20693;
                } else {
                    iArr[iMo50213] = c22999.m51373(c22999Mo20693) | iArr[iMo50213];
                }
                if (interfaceC22528.mo31467()) {
                    iArr[iMo50213] = iArr[iMo50213] | 1073741824;
                }
            }
        }
        for (int i = 0; i < size; i++) {
            if (c22999Arr[i] != null) {
                if ((iArr[i] & 1073741824) != 0 && mo5204(i)) {
                    iArr[i] = iArr[i] | 536870912;
                }
                iArr[i] = iArr[i] | mo5208(i);
            }
        }
        interfaceC6631.mo15112(iArr);
        ArrayList arrayList2 = new ArrayList(arrayList);
        Collections.sort(arrayList2, new C23689());
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            ((C4914) it.next()).m10439(interfaceC6631, c14301, c20689);
        }
    }

    @Override // p067l.InterfaceC3080
    /* JADX INFO: renamed from: ᩷ */
    public final int mo5207() {
        return this.f68292.size();
    }

    @Override // p067l.InterfaceC3080
    /* JADX INFO: renamed from: ۜ֫ */
    public final int mo5200() {
        return this.f68291.size();
    }

    @Override // p067l.InterfaceC3080
    /* JADX INFO: renamed from: ܿ */
    public final C4914 mo5206(int i) {
        return (C4914) this.f68291.get(i);
    }

    /* JADX INFO: renamed from: ܶ */
    public final void m48944() {
        Iterator it = m28355().iterator();
        while (it.hasNext()) {
            Iterator it2 = ((C4914) it.next()).mo20696().iterator();
            while (it2.hasNext()) {
                for (C6925 c6925 : ((C20337) it2.next()).values()) {
                    if (c6925.f18027 != null) {
                        if (c6925.mo7252()) {
                            c6925.f18027.f13489 = true;
                        } else {
                            c6925.f18027 = null;
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᩵ */
    public final int m48948() {
        Iterator it = m28355().iterator();
        int iM10444 = 1;
        while (it.hasNext()) {
            iM10444 += ((C4914) it.next()).m10444();
        }
        return iM10444;
    }

    @Override // p067l.InterfaceC3080
    /* JADX INFO: renamed from: ۢ֫ */
    public final void mo5202() {
        Collections.sort(this.f68291, new C14321());
    }

    @Override // p067l.AbstractC12310, p067l.InterfaceC3080
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC11799 mo5198() {
        return (C10949) super.mo5198();
    }

    /* JADX INFO: renamed from: ۡ */
    public final C10278 m48939() {
        return (C10278) super.mo5203();
    }

    /* JADX INFO: renamed from: ۧ */
    public final C4914 m48940(String str) {
        return m48931(C22999.m51348(str, ((C10278) super.mo5203()).mo14712()));
    }

    @Override // p067l.AbstractC12310, p067l.InterfaceC3080
    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC6434 mo5203() {
        return (C10278) super.mo5203();
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m48946(String str) {
        ((ArrayList) ((C10278) super.mo5203()).mo14717()).set(mo5199() - 1, str);
    }
}
