package l;

import com.google.android.material.color.ColorResourcesTableCreator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩶ܿܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 84S9 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20317 extends AbstractC10460 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final ArrayList f65616;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final ArrayList f65617;

    public C20317(C8322 c8322, int i) {
        super(c8322, i);
        this.f65616 = new ArrayList();
        this.f65617 = new ArrayList();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m46619(int i, boolean z) {
        m46609(i);
        m26324(i, z);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m46618(int i, int i2) {
        m46609(i);
        m26323(i, i2);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C2678 m46608(C21707 c21707) {
        ArrayList<C2678> arrayList = this.f65616;
        for (C2678 c2678 : arrayList) {
            if (c2678.mo18743().equals(c21707)) {
                return c2678;
            }
        }
        C2678 c2679 = new C2678(this, c21707);
        arrayList.add(c2679);
        return c2679;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m46613(C2678 c2678, C21707 c21707) {
        if (c2678.getType() != this) {
            throw new RuntimeException("The entry being copied must belong to this type");
        }
        ArrayList arrayList = this.f65616;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((C2678) it.next()).mo18743().equals(c21707)) {
                throw new RuntimeException("Config flags exists: " + c21707.toString());
            }
        }
        C2678 c2679 = new C2678(this, c21707);
        c2679.m8397(c2678.mo2345());
        c2679.m8395(c2678.mo2349());
        arrayList.add(c2679);
        for (InterfaceC21211 interfaceC21211 : c2678.mo18746()) {
            c2679.m8392(interfaceC21211.mo47883()).m43645(interfaceC21211);
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m46624(int i) {
        if (i > 65536) {
            i = 65536;
        }
        ArrayList arrayList = this.f65617;
        if (i < arrayList.size()) {
            return;
        }
        arrayList.ensureCapacity(i);
        for (int size = i - arrayList.size(); size > 0; size--) {
            arrayList.add(null);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m46607(String str) {
        ArrayList arrayList = this.f65617;
        arrayList.add(str);
        return arrayList.size() - 1;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m46611(int i, String str, boolean z) {
        if (i >= 65536) {
            throw new IllegalArgumentException("id > 0xFFFF");
        }
        ArrayList arrayList = this.f65617;
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

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void m46626(int i) {
        this.f65616.remove(i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m46612(C2678 c2678) {
        this.f65616.remove(c2678);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m46620() {
        this.f65616.clear();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m46610(int i, String str) {
        ArrayList arrayList = this.f65617;
        if (i >= arrayList.size()) {
            throw new RuntimeException(C18307.m42645(i, "Please add entry with id of ", " first"));
        }
        arrayList.set(i, str);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String m46622(int i) {
        return (String) this.f65617.get(i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m46609(int i) {
        ArrayList arrayList = this.f65617;
        if (i >= arrayList.size() || arrayList.get(i) == null) {
            throw new RuntimeException(C18307.m42645(i, "Please add entry with id of ", " first"));
        }
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C12555 m46615() {
        ArrayList arrayList = this.f65617;
        C12555 c12555 = new C12555(arrayList.size());
        for (int i = 0; i < arrayList.size(); i++) {
            String str = (String) arrayList.get(i);
            if (str != null) {
                c12555.put(str, Integer.valueOf(i));
            }
        }
        return c12555;
    }

    @Override // l.AbstractC10460, l.InterfaceC0748
    /* JADX INFO: renamed from: ֫ */
    public final int mo2867(InterfaceC15564 interfaceC15564) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f65617;
            if (i >= arrayList.size()) {
                return -1;
            }
            String str = (String) arrayList.get(i);
            if (str != null && interfaceC15564.mo10274(str)) {
                return i;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m46614(InterfaceC4485 interfaceC4485, C12555 c12555, C19277 c19277) {
        int size = this.f65617.size();
        interfaceC4485.mo13229(ColorResourcesTableCreator.HEADER_TYPE_TYPE_SPEC);
        interfaceC4485.mo13229((short) 16);
        interfaceC4485.writeInt((size * 4) + 16);
        interfaceC4485.writeByte(mo2870());
        interfaceC4485.writeByte(0);
        ArrayList arrayList = this.f65616;
        interfaceC4485.mo13231(Math.min(arrayList.size(), 65535));
        interfaceC4485.writeInt(size);
        if (c19277 != null) {
            c19277.m44460(1);
        }
        int[] iArr = new int[size];
        C21707[] c21707Arr = new C21707[size];
        for (InterfaceC7099 interfaceC7099 : m26325()) {
            C21707 c21707Mo18743 = interfaceC7099.mo18743();
            for (InterfaceC21211 interfaceC21211 : interfaceC7099.mo18746()) {
                int iMo47883 = interfaceC21211.mo47883();
                C21707 c21707 = c21707Arr[iMo47883];
                if (c21707 == null) {
                    c21707Arr[iMo47883] = c21707Mo18743;
                } else {
                    iArr[iMo47883] = c21707.m49024(c21707Mo18743) | iArr[iMo47883];
                }
                if (interfaceC21211.mo29405()) {
                    iArr[iMo47883] = iArr[iMo47883] | 1073741824;
                }
            }
        }
        for (int i = 0; i < size; i++) {
            if (c21707Arr[i] != null) {
                if ((iArr[i] & 1073741824) != 0 && mo2875(i)) {
                    iArr[i] = iArr[i] | 536870912;
                }
                iArr[i] = iArr[i] | mo2879(i);
            }
        }
        interfaceC4485.mo13230(iArr);
        ArrayList arrayList2 = new ArrayList(arrayList);
        Collections.sort(arrayList2, new C22433());
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            ((C2678) it.next()).m8393(interfaceC4485, c12555, c19277);
        }
    }

    @Override // l.InterfaceC0748
    /* JADX INFO: renamed from: ᩷ */
    public final int mo2878() {
        return this.f65617.size();
    }

    @Override // l.InterfaceC0748
    /* JADX INFO: renamed from: ۜ֫ */
    public final int mo2871() {
        return this.f65616.size();
    }

    @Override // l.InterfaceC0748
    /* JADX INFO: renamed from: ܿ */
    public final C2678 mo2877(int i) {
        return (C2678) this.f65616.get(i);
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final void m46621() {
        Iterator it = m26325().iterator();
        while (it.hasNext()) {
            Iterator it2 = ((C2678) it.next()).mo18746().iterator();
            while (it2.hasNext()) {
                for (C4794 c4794 : ((C18906) it2.next()).values()) {
                    if (c4794.f15195 != null) {
                        if (c4794.mo5009()) {
                            c4794.f15195.f10682 = true;
                        } else {
                            c4794.f15195 = null;
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final int m46625() {
        Iterator it = m26325().iterator();
        int iM8398 = 1;
        while (it.hasNext()) {
            iM8398 += ((C2678) it.next()).m8398();
        }
        return iM8398;
    }

    @Override // l.InterfaceC0748
    /* JADX INFO: renamed from: ۢ֫ */
    public final void mo2873() {
        Collections.sort(this.f65616, new C12576());
    }

    @Override // l.AbstractC10460, l.InterfaceC0748
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC9922 mo2869() {
        return (C9028) super.mo2869();
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C8322 m46616() {
        return (C8322) super.mo2874();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C2678 m46617(String str) {
        return m46608(C21707.m48999(str, ((C8322) super.mo2874()).mo12848()));
    }

    @Override // l.AbstractC10460, l.InterfaceC0748
    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC4277 mo2874() {
        return (C8322) super.mo2874();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m46623(String str) {
        ((ArrayList) ((C8322) super.mo2874()).mo12853()).set(mo2870() - 1, str);
    }
}
