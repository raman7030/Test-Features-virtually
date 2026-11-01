package p067l;

import com.google.android.material.color.ColorResourcesTableCreator;
import com.umeng.analytics.pro.C0655am;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.۠ܿܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 04V0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C10278 extends AbstractC10298 {

    /* JADX INFO: renamed from: ۗ */
    public final ArrayList f28445;

    /* JADX INFO: renamed from: ۛ */
    public final ArrayList f28446;

    /* JADX INFO: renamed from: ۤ */
    public final ArrayList f28447;

    /* JADX INFO: renamed from: ۫ */
    public final ArrayList f28448;

    /* JADX INFO: renamed from: ۬ */
    public final ArrayList f28449;

    public C10278(C10949 c10949, int i, String str) {
        super(c10949);
        this.f28447 = new ArrayList();
        this.f28446 = new ArrayList();
        this.f28445 = new ArrayList();
        this.f28448 = new ArrayList();
        this.f28449 = new ArrayList();
        this.f28480 = i;
        this.f28479 = str;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m23890(String str) {
        this.f28479 = str;
    }

    /* JADX INFO: renamed from: ۧ */
    public final C21678 m23895(int i, String str) {
        ArrayList<C21678> arrayList = this.f28446;
        for (C21678 c21678 : arrayList) {
            if (c21678.mo5199() == i) {
                if (c21678.getTypeName().equals(str)) {
                    return c21678;
                }
                throw new RuntimeException(String.format("There is already a type with id of 0x%02x, named \"%s\" not \"%s\"", Integer.valueOf(i), c21678.getTypeName(), str));
            }
        }
        int i2 = i - 1;
        ArrayList arrayList2 = this.f28447;
        if (i2 < arrayList2.size()) {
            arrayList2.set(i2, str);
        } else {
            while (i2 > arrayList2.size()) {
                arrayList2.add("?" + (arrayList2.size() + 1));
            }
            arrayList2.add(str);
        }
        C21678 c21679 = new C21678(this, i);
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (((C21678) arrayList.get(size)).mo5199() < i) {
                arrayList.add(size + 1, c21679);
                return c21679;
            }
        }
        arrayList.add(0, c21679);
        return c21679;
    }

    /* JADX INFO: renamed from: ᩶ */
    public final C21678 m23899() {
        ArrayList<C21678> arrayList = this.f28446;
        for (C21678 c21678 : arrayList) {
            if (c21678.getTypeName().equals(C0655am.f2278aF)) {
                return c21678;
            }
        }
        ArrayList arrayList2 = this.f28447;
        arrayList2.add(C0655am.f2278aF);
        C21678 c21679 = new C21678(this, arrayList2.size());
        arrayList.add(c21679);
        return c21679;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m23888(int i) {
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.f28446;
            if (i2 >= arrayList.size()) {
                return;
            }
            if (((C21678) arrayList.get(i2)).mo5199() == i) {
                arrayList.remove(i2);
                ArrayList arrayList2 = this.f28447;
                if (i == arrayList2.size()) {
                    arrayList2.remove(arrayList2.size() - 1);
                    int size = arrayList2.size();
                    while (true) {
                        size--;
                        if (size < 0) {
                            return;
                        }
                        if (!((String) arrayList2.get(size)).equals("?" + (size + 1))) {
                            return;
                        } else {
                            arrayList2.remove(size);
                        }
                    }
                } else {
                    arrayList2.set(i - 1, "?" + i);
                    return;
                }
            } else {
                i2++;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m23889(int i, String str) {
        ArrayList<C21008> arrayList = this.f28445;
        for (C21008 c21008 : arrayList) {
            if (c21008.mo25656() == i) {
                if (!c21008.getPackageName().equals(str)) {
                    throw new RuntimeException(String.format("There is already a library with id of 0x%02x, named \"%s\" not \"%s\"", Integer.valueOf(i), c21008.getPackageName(), str));
                }
                return;
            }
        }
        arrayList.add(new C21008(i, str));
    }

    /* JADX INFO: renamed from: ֫ */
    public final C2901 m23887(String str, String str2) {
        ArrayList<C2901> arrayList = this.f28449;
        for (C2901 c2901 : arrayList) {
            if (c2901.getName().equals(str)) {
                if (c2901.mo14244().equals(str2)) {
                    return c2901;
                }
                throw new RuntimeException(C10965.m25286(C5633.m12525("There is already a overlay with name \"", str, "\", whose actor is \"", c2901.mo14244(), "\" not \""), str2, "\""));
            }
        }
        C2901 c2902 = new C2901(str, str2);
        arrayList.add(c2902);
        return c2902;
    }

    /* JADX INFO: renamed from: ۜ */
    public final C16982 m23893() {
        C16982 c16982 = new C16982();
        this.f28448.add(c16982);
        return c16982;
    }

    /* JADX INFO: renamed from: ۡ */
    public final void m23894() {
        this.f28449.clear();
    }

    /* JADX INFO: renamed from: ᩵ */
    public final void m23898() {
        this.f28448.clear();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m23891(InterfaceC6631 interfaceC6631, C20689 c20689, C13631 c13631) {
        for (C8266 c8266 : c13631.f38375) {
            interfaceC6631.mo15111(ColorResourcesTableCreator.HEADER_TYPE_PACKAGE);
            interfaceC6631.mo15111(ColorResourcesTableCreator.PackageChunk.HEADER_SIZE);
            long position = interfaceC6631.getPosition();
            interfaceC6631.mo15114();
            interfaceC6631.writeInt(mo14722());
            interfaceC6631.mo15110(128, getPackageName());
            if (c20689 != null) {
                c20689.m46754(1);
            }
            interfaceC6631.writeInt(288);
            interfaceC6631.writeInt(0);
            long position2 = interfaceC6631.getPosition();
            interfaceC6631.mo15114();
            interfaceC6631.writeInt(0);
            interfaceC6631.writeInt(0);
            C14971 c14971 = new C14971();
            c14971.m34280(true);
            HashSet hashSet = new HashSet();
            ArrayList<C21678> arrayList = c8266.f21894;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                hashSet.add(((C21678) it.next()).getTypeName());
            }
            for (C21678 c21678 : arrayList) {
                while (c14971.size() < c21678.mo5199() - 1) {
                    String strM40053 = "?" + (c14971.size() + 1);
                    while (hashSet.contains(strM40053)) {
                        strM40053 = C17588.m40053(strM40053, "?");
                    }
                    c14971.m34281(strM40053);
                }
                c14971.m34281(c21678.getTypeName());
            }
            c14971.m34279(interfaceC6631, false, (C20689) null);
            if (c20689 != null) {
                c20689.m46754(1);
            }
            long position3 = interfaceC6631.getPosition();
            interfaceC6631.seek(position2);
            interfaceC6631.writeInt((int) ((position3 - position) + 4));
            interfaceC6631.seek(position3);
            List<String> list = (List) C7480.stream(arrayList).flatMap(new C13335(1)).filter(new C3572(0)).distinct().collect(C24205.toList());
            C14301 c14301 = new C14301();
            C14971 c14972 = new C14971();
            c14972.m34280(true);
            int i = 0;
            for (String str : list) {
                c14972.m34281(str);
                c14301.put(str, Integer.valueOf(i));
                i++;
            }
            c14972.m34279(interfaceC6631, false, (C20689) null);
            if (c20689 != null) {
                c20689.m46754(1);
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((C21678) it2.next()).m48937(interfaceC6631, c14301, c20689);
            }
            ArrayList arrayList2 = this.f28445;
            if (arrayList2.size() > 0) {
                interfaceC6631.mo15111((short) 515);
                interfaceC6631.mo15111((short) 12);
                interfaceC6631.writeInt((arrayList2.size() * 260) + 12);
                interfaceC6631.writeInt(arrayList2.size());
                for (C21008 c21008 : m23912()) {
                    interfaceC6631.writeInt(c21008.mo25656());
                    interfaceC6631.mo15110(128, c21008.getPackageName());
                }
            }
            Iterator it3 = c8266.f21893.iterator();
            while (it3.hasNext()) {
                ((C2901) it3.next()).m4677(interfaceC6631);
            }
            Iterator it4 = c8266.f21892.iterator();
            while (it4.hasNext()) {
                ((C16982) it4.next()).m38570(interfaceC6631);
            }
            long position4 = interfaceC6631.getPosition();
            interfaceC6631.seek(position);
            interfaceC6631.writeInt((int) ((position4 - position) + 4));
            interfaceC6631.seek(position4);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m23892(EnumC12270 enumC12270) {
        if (enumC12270 != this.f28482 && this.f28446.size() != 0) {
            throw new IllegalStateException("Cannot change config layout of populated package");
        }
        C12826.requireNonNull(enumC12270);
        this.f28482 = enumC12270;
    }

    @Override // p067l.InterfaceC6434
    /* JADX INFO: renamed from: ۗ */
    public final int mo14715() {
        return this.f28446.size();
    }

    @Override // p067l.InterfaceC6434
    public final C21678 getType(int i) {
        return (C21678) this.f28446.get(i);
    }

    @Override // p067l.AbstractC10298, p067l.InterfaceC6434
    public final InterfaceC3080 getType(String str) {
        return (C21678) super.getType(str);
    }

    /* JADX INFO: renamed from: ܶ */
    public final C21678 m23897() {
        return (C21678) super.getType("id");
    }

    @Override // p067l.InterfaceC6434
    /* JADX INFO: renamed from: ۠֫ */
    public final int mo14718() {
        return this.f28445.size();
    }

    @Override // p067l.InterfaceC6434
    /* JADX INFO: renamed from: ۖ */
    public final InterfaceC11128 mo14713(int i) {
        return (C21008) this.f28445.get(i);
    }

    @Override // p067l.InterfaceC6434
    /* JADX INFO: renamed from: ֡ */
    public final int mo14708() {
        return this.f28449.size();
    }

    @Override // p067l.InterfaceC6434
    /* JADX INFO: renamed from: ᩴ */
    public final InterfaceC17832 mo14720(int i) {
        return (C2901) this.f28449.get(i);
    }

    @Override // p067l.InterfaceC6434
    /* JADX INFO: renamed from: ֨֫ */
    public final int mo14710() {
        return this.f28448.size();
    }

    @Override // p067l.InterfaceC6434
    /* JADX INFO: renamed from: ۜ */
    public final InterfaceC20516 mo14716(int i) {
        return (C16982) this.f28448.get(i);
    }

    @Override // p067l.InterfaceC6434
    /* JADX INFO: renamed from: ۜۧ */
    public final List mo14717() {
        return this.f28447;
    }

    /* JADX INFO: renamed from: ۬ */
    public final void m23896() {
        Iterator it = m23911().iterator();
        while (it.hasNext()) {
            ((C21678) it.next()).m48944();
        }
    }

    @Override // p067l.AbstractC10298, p067l.InterfaceC6434
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC11799 mo14711() {
        return (C10949) super.mo14711();
    }
}
