package l;

import com.google.android.material.color.ColorResourcesTableCreator;
import com.umeng.analytics.pro.am;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.۠ܿܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 04V0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8322 extends AbstractC8343 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final ArrayList f25534;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final ArrayList f25535;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final ArrayList f25536;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final ArrayList f25537;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final ArrayList f25538;

    public C8322(C9028 c9028, int i, String str) {
        super(c9028);
        this.f25536 = new ArrayList();
        this.f25535 = new ArrayList();
        this.f25534 = new ArrayList();
        this.f25537 = new ArrayList();
        this.f25538 = new ArrayList();
        this.f25566 = i;
        this.f25565 = str;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m21920(String str) {
        this.f25565 = str;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C20317 m21925(int i, String str) {
        ArrayList<C20317> arrayList = this.f25535;
        for (C20317 c20317 : arrayList) {
            if (c20317.mo2870() == i) {
                if (c20317.getTypeName().equals(str)) {
                    return c20317;
                }
                throw new RuntimeException(String.format("There is already a type with id of 0x%02x, named \"%s\" not \"%s\"", Integer.valueOf(i), c20317.getTypeName(), str));
            }
        }
        int i2 = i - 1;
        ArrayList arrayList2 = this.f25536;
        if (i2 < arrayList2.size()) {
            arrayList2.set(i2, str);
        } else {
            while (i2 > arrayList2.size()) {
                arrayList2.add("?" + (arrayList2.size() + 1));
            }
            arrayList2.add(str);
        }
        C20317 c20318 = new C20317(this, i);
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (((C20317) arrayList.get(size)).mo2870() < i) {
                arrayList.add(size + 1, c20318);
                return c20318;
            }
        }
        arrayList.add(0, c20318);
        return c20318;
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C20317 m21929() {
        ArrayList<C20317> arrayList = this.f25535;
        for (C20317 c20317 : arrayList) {
            if (c20317.getTypeName().equals(am.aF)) {
                return c20317;
            }
        }
        ArrayList arrayList2 = this.f25536;
        arrayList2.add(am.aF);
        C20317 c20318 = new C20317(this, arrayList2.size());
        arrayList.add(c20318);
        return c20318;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m21918(int i) {
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.f25535;
            if (i2 >= arrayList.size()) {
                return;
            }
            if (((C20317) arrayList.get(i2)).mo2870() == i) {
                arrayList.remove(i2);
                ArrayList arrayList2 = this.f25536;
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

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m21919(int i, String str) {
        ArrayList<C19612> arrayList = this.f25534;
        for (C19612 c19612 : arrayList) {
            if (c19612.mo23657() == i) {
                if (!c19612.getPackageName().equals(str)) {
                    throw new RuntimeException(String.format("There is already a library with id of 0x%02x, named \"%s\" not \"%s\"", Integer.valueOf(i), c19612.getPackageName(), str));
                }
                return;
            }
        }
        arrayList.add(new C19612(i, str));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C0560 m21917(String str, String str2) {
        ArrayList<C0560> arrayList = this.f25538;
        for (C0560 c0560 : arrayList) {
            if (c0560.getName().equals(str)) {
                if (c0560.mo12339().equals(str2)) {
                    return c0560;
                }
                throw new RuntimeException(C9045.m23341(C3435.m10501("There is already a overlay with name \"", str, "\", whose actor is \"", c0560.mo12339(), "\" not \""), str2, "\""));
            }
        }
        C0560 c0561 = new C0560(str, str2);
        arrayList.add(c0561);
        return c0561;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C15376 m21923() {
        C15376 c15376 = new C15376();
        this.f25537.add(c15376);
        return c15376;
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final void m21924() {
        this.f25538.clear();
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final void m21928() {
        this.f25537.clear();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m21921(InterfaceC4485 interfaceC4485, C19277 c19277, C11850 c11850) {
        for (C6205 c6205 : c11850.f35370) {
            interfaceC4485.mo13229(ColorResourcesTableCreator.HEADER_TYPE_PACKAGE);
            interfaceC4485.mo13229(ColorResourcesTableCreator.PackageChunk.HEADER_SIZE);
            long position = interfaceC4485.getPosition();
            interfaceC4485.mo13232();
            interfaceC4485.writeInt(mo12858());
            interfaceC4485.mo13228(128, getPackageName());
            if (c19277 != null) {
                c19277.m44460(1);
            }
            interfaceC4485.writeInt(288);
            interfaceC4485.writeInt(0);
            long position2 = interfaceC4485.getPosition();
            interfaceC4485.mo13232();
            interfaceC4485.writeInt(0);
            interfaceC4485.writeInt(0);
            C13260 c13260 = new C13260();
            c13260.m32181(true);
            HashSet hashSet = new HashSet();
            ArrayList<C20317> arrayList = c6205.f19033;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                hashSet.add(((C20317) it.next()).getTypeName());
            }
            for (C20317 c20317 : arrayList) {
                while (c13260.size() < c20317.mo2870() - 1) {
                    String strM37867 = "?" + (c13260.size() + 1);
                    while (hashSet.contains(strM37867)) {
                        strM37867 = C16014.m37867(strM37867, "?");
                    }
                    c13260.m32182(strM37867);
                }
                c13260.m32182(c20317.getTypeName());
            }
            c13260.m32180(interfaceC4485, false, (C19277) null);
            if (c19277 != null) {
                c19277.m44460(1);
            }
            long position3 = interfaceC4485.getPosition();
            interfaceC4485.seek(position2);
            interfaceC4485.writeInt((int) ((position3 - position) + 4));
            interfaceC4485.seek(position3);
            List<String> list = (List) C5378.stream(arrayList).flatMap(new C11539(1)).filter(new C1266(0)).distinct().collect(C22976.toList());
            C12555 c12555 = new C12555();
            C13260 c13261 = new C13260();
            c13261.m32181(true);
            int i = 0;
            for (String str : list) {
                c13261.m32182(str);
                c12555.put(str, Integer.valueOf(i));
                i++;
            }
            c13261.m32180(interfaceC4485, false, (C19277) null);
            if (c19277 != null) {
                c19277.m44460(1);
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((C20317) it2.next()).m46614(interfaceC4485, c12555, c19277);
            }
            ArrayList arrayList2 = this.f25534;
            if (arrayList2.size() > 0) {
                interfaceC4485.mo13229((short) 515);
                interfaceC4485.mo13229((short) 12);
                interfaceC4485.writeInt((arrayList2.size() * 260) + 12);
                interfaceC4485.writeInt(arrayList2.size());
                for (C19612 c19612 : m21942()) {
                    interfaceC4485.writeInt(c19612.mo23657());
                    interfaceC4485.mo13228(128, c19612.getPackageName());
                }
            }
            Iterator it3 = c6205.f19032.iterator();
            while (it3.hasNext()) {
                ((C0560) it3.next()).m2309(interfaceC4485);
            }
            Iterator it4 = c6205.f19031.iterator();
            while (it4.hasNext()) {
                ((C15376) it4.next()).m36412(interfaceC4485);
            }
            long position4 = interfaceC4485.getPosition();
            interfaceC4485.seek(position);
            interfaceC4485.writeInt((int) ((position4 - position) + 4));
            interfaceC4485.seek(position4);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m21922(EnumC10418 enumC10418) {
        if (enumC10418 != this.f25568 && this.f25535.size() != 0) {
            throw new IllegalStateException("Cannot change config layout of populated package");
        }
        C11003.requireNonNull(enumC10418);
        this.f25568 = enumC10418;
    }

    @Override // l.InterfaceC4277
    /* JADX INFO: renamed from: ۗ */
    public final int mo12851() {
        return this.f25535.size();
    }

    @Override // l.InterfaceC4277
    public final C20317 getType(int i) {
        return (C20317) this.f25535.get(i);
    }

    @Override // l.AbstractC8343, l.InterfaceC4277
    public final InterfaceC0748 getType(String str) {
        return (C20317) super.getType(str);
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final C20317 m21927() {
        return (C20317) super.getType("id");
    }

    @Override // l.InterfaceC4277
    /* JADX INFO: renamed from: ۠֫ */
    public final int mo12854() {
        return this.f25534.size();
    }

    @Override // l.InterfaceC4277
    /* JADX INFO: renamed from: ۖ */
    public final InterfaceC9216 mo12849(int i) {
        return (C19612) this.f25534.get(i);
    }

    @Override // l.InterfaceC4277
    /* JADX INFO: renamed from: ֡ */
    public final int mo12844() {
        return this.f25538.size();
    }

    @Override // l.InterfaceC4277
    /* JADX INFO: renamed from: ᩴ */
    public final InterfaceC16270 mo12856(int i) {
        return (C0560) this.f25538.get(i);
    }

    @Override // l.InterfaceC4277
    /* JADX INFO: renamed from: ֨֫ */
    public final int mo12846() {
        return this.f25537.size();
    }

    @Override // l.InterfaceC4277
    /* JADX INFO: renamed from: ۜ */
    public final InterfaceC19094 mo12852(int i) {
        return (C15376) this.f25537.get(i);
    }

    @Override // l.InterfaceC4277
    /* JADX INFO: renamed from: ۜۧ */
    public final List mo12853() {
        return this.f25536;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final void m21926() {
        Iterator it = m21941().iterator();
        while (it.hasNext()) {
            ((C20317) it.next()).m46621();
        }
    }

    @Override // l.AbstractC8343, l.InterfaceC4277
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC9922 mo12847() {
        return (C9028) super.mo12847();
    }
}
