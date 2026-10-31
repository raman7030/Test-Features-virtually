package l;

import com.google.android.material.slider.BaseSlider;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: l.ܽۡᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: M1X3 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC16543 extends AbstractC23599 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public boolean f50828;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public ArrayList f50829;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C10399 f50830;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public ArrayList f50831;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public ArrayList f50832;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public ArrayList f50833;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public ArrayList f50834;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public EnumC11810 f50835;

    /* JADX INFO: renamed from: ֫ */
    public String mo15148(int i, String str) {
        return str;
    }

    /* JADX INFO: renamed from: ֫ */
    public abstract List mo3535(C17249 c17249);

    public AbstractC16543(C17249 c17249, InterfaceC5276 interfaceC5276) {
        super(c17249, interfaceC5276);
        this.f50835 = EnumC11810.STATIC;
        this.f50828 = true;
        this.f50829 = new ArrayList();
        this.f50831 = new ArrayList();
        this.f50834 = new ArrayList();
        this.f50833 = new ArrayList();
        this.f50832 = new ArrayList();
    }

    /* JADX WARN: Code duplicated, block: B:108:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:110:0x02ca A[PHI: r3
      0x02ca: PHI (r3v48 boolean) = (r3v7 boolean), (r3v52 boolean) binds: [B:109:0x02c8, B:106:0x02a4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:81:0x021b  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // l.AbstractC23599
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean mo38920(InterfaceC7397 interfaceC7397) {
        int i;
        C1109 c1109;
        Iterator it;
        int i2;
        List list;
        C19357 c19357;
        boolean z;
        int i3;
        C0657 c0657;
        Iterator it2;
        InterfaceC5276 interfaceC5276;
        AbstractC16543 abstractC16543;
        C19357 c19358;
        Set set;
        C1109 c11010;
        C19357 c19359;
        AbstractC16543 abstractC16544;
        boolean z2;
        String strMo3534;
        Iterator it3;
        boolean z3;
        InterfaceC5276 interfaceC5277;
        InterfaceC1629 interfaceC1629;
        AbstractC16543 abstractC16545 = this;
        C17249 c17249 = abstractC16545.f76507;
        List listMo3535 = abstractC16545.mo3535(c17249);
        boolean z4 = false;
        if (listMo3535.isEmpty()) {
            return false;
        }
        C19357 c193510 = c17249.f52884;
        int size = c17249.f52880.values().size();
        Iterator it4 = c193510.f68942.m46805().values().iterator();
        int i4 = -1;
        boolean z5 = false;
        int i5 = 0;
        while (it4.hasNext()) {
            C0657 c0658 = (C0657) it4.next();
            i5++;
            int i6 = (i5 * 100) / size;
            InterfaceC5276 interfaceC5278 = abstractC16545.f76508;
            if (i6 != i4) {
                interfaceC5278.mo3581(i6);
                i4 = i6;
            }
            String type = c0658.getType();
            if (interfaceC7397.mo12795(type.substring(1, type.length() - 1).replace('/', '.'))) {
                Iterator it5 = c0658.getMethods().iterator();
                boolean z6 = false;
                while (it5.hasNext()) {
                    C1032 c1032 = (C1032) it5.next();
                    if (interfaceC5278.mo1526()) {
                        return z4;
                    }
                    InterfaceC19150 interfaceC19150Mo3570 = c1032.mo3570();
                    if (interfaceC19150Mo3570 == null) {
                        i = size;
                        c1109 = null;
                    } else {
                        i = size;
                        c1109 = interfaceC19150Mo3570 instanceof C1109 ? (C1109) interfaceC19150Mo3570 : new C1109(interfaceC19150Mo3570);
                    }
                    if (c1109 == null) {
                        list = listMo3535;
                        c19358 = c193510;
                        it = it4;
                        i2 = i4;
                        z = z5;
                        i3 = i5;
                        c0657 = c0658;
                        it2 = it5;
                        interfaceC5276 = interfaceC5278;
                        abstractC16543 = abstractC16545;
                    } else {
                        C15152 c15152 = new C15152(c0658, c1032, c1109);
                        it = it4;
                        i2 = i4;
                        C23098 c23098 = new C23098(listMo3535, abstractC16545.f50835);
                        C13925 c13925 = abstractC16545.f50828 ? new C13925() : null;
                        list = listMo3535;
                        List list2 = c15152.f46302;
                        if (c13925 != null) {
                            while (true) {
                                z = z5;
                                i3 = i5;
                                int i7 = 0;
                                while (true) {
                                    if (i7 >= list2.size()) {
                                        break;
                                    }
                                    if (!c23098.m51284(i7, list2) || c23098.m51287().equals(c1032)) {
                                        it3 = it5;
                                        interfaceC5277 = interfaceC5278;
                                        z3 = z6;
                                    } else {
                                        int i8 = i7 + 1;
                                        if (c13925.m33362(i8, list2)) {
                                            it3 = it5;
                                            AbstractCollection abstractCollection = (AbstractCollection) ((AbstractC7479) list2.get(i7)).m20099().m37705();
                                            if (!abstractCollection.isEmpty()) {
                                                AbstractC7479 abstractC7479 = (AbstractC7479) list2.get(i7);
                                                AbstractC7479 abstractC74710 = (AbstractC7479) list2.get(i8);
                                                interfaceC5277 = interfaceC5278;
                                                if (abstractC7479 instanceof InterfaceC11116) {
                                                    final InterfaceC11116 interfaceC11116 = (InterfaceC11116) abstractC7479;
                                                    c0658 = c0658;
                                                    interfaceC1629 = new InterfaceC1629() { // from class: l.֫ۡᩳ
                                                        @Override // l.InterfaceC1629
                                                        public final Object get() {
                                                            InterfaceC11116 interfaceC11117 = interfaceC11116;
                                                            return new C1048(interfaceC11117.mo3975(), interfaceC11117.mo3615(), interfaceC11117.mo3614(), interfaceC11117.mo3612(), interfaceC11117.mo3611(), interfaceC11117.mo3613(), interfaceC11117.mo3610(), interfaceC11117.getReference());
                                                        }
                                                    };
                                                } else {
                                                    c0658 = c0658;
                                                    if (abstractC7479 instanceof InterfaceC17465) {
                                                        final InterfaceC17465 interfaceC17465 = (InterfaceC17465) abstractC7479;
                                                        interfaceC1629 = new InterfaceC1629() { // from class: l.ۧۡᩳ
                                                            @Override // l.InterfaceC1629
                                                            public final Object get() {
                                                                InterfaceC17465 interfaceC17466 = interfaceC17465;
                                                                return new C21510(interfaceC17466.mo3975(), interfaceC17466.mo9712(), interfaceC17466.mo3615(), interfaceC17466.getReference());
                                                            }
                                                        };
                                                    }
                                                    c193510 = c193510;
                                                    z3 = z6;
                                                }
                                                if (abstractC74710 instanceof InterfaceC18713) {
                                                    InterfaceC18713 interfaceC18713 = (InterfaceC18713) abstractC74710;
                                                    z3 = z6;
                                                    HashSet hashSet = new HashSet();
                                                    for (AbstractC7479 abstractC74711 : (AbstractList) list2) {
                                                        C19357 c193511 = c193510;
                                                        if (abstractC74711 instanceof AbstractC1815) {
                                                            AbstractC1815 abstractC1815 = (AbstractC1815) abstractC74711;
                                                            if (abstractCollection.contains(abstractC1815.m6037())) {
                                                                hashSet.add(abstractC1815.m20099());
                                                            }
                                                        }
                                                        c193510 = c193511;
                                                    }
                                                    c193510 = c193510;
                                                    if (i7 > 0 && ((AbstractC7479) list2.get(i7 - 1)).mo3975().m3132()) {
                                                        hashSet.add(((AbstractC7479) list2.get(i7)).m20099());
                                                    }
                                                    if (hashSet.size() != 1) {
                                                        Iterator it6 = hashSet.iterator();
                                                        while (it6.hasNext()) {
                                                            int iM37704 = ((C15925) it6.next()).m37704();
                                                            c1109.m3807(iM37704, (AbstractC7479) interfaceC1629.get());
                                                            c1109.m3807(iM37704 + 1, new C22981(interfaceC18713.mo1790(), interfaceC18713.mo3975()));
                                                        }
                                                        c1109.m3813(abstractC7479.m20099().m37704());
                                                        c1109.m3813(abstractC74710.m20099().m37704());
                                                        i5 = i3;
                                                        z5 = z;
                                                        interfaceC5278 = interfaceC5277;
                                                        it5 = it3;
                                                        c0658 = c0658;
                                                        z6 = z3;
                                                        c193510 = c193510;
                                                    }
                                                } else {
                                                    c193510 = c193510;
                                                    z3 = z6;
                                                }
                                            }
                                        } else {
                                            it3 = it5;
                                        }
                                        interfaceC5277 = interfaceC5278;
                                        z3 = z6;
                                    }
                                    i7++;
                                    interfaceC5278 = interfaceC5277;
                                    it5 = it3;
                                    c0658 = c0658;
                                    z6 = z3;
                                    c193510 = c193510;
                                }
                            }
                            c19357 = c193510;
                        } else {
                            c19357 = c193510;
                            z = z5;
                            i3 = i5;
                        }
                        c0657 = c0658;
                        it2 = it5;
                        interfaceC5276 = interfaceC5278;
                        boolean z7 = z6;
                        boolean z8 = false;
                        boolean z9 = false;
                        int iM37705 = 0;
                        while (iM37705 < list2.size()) {
                            if (!c23098.m51284(iM37705, list2) || c23098.m51287().equals(c1032)) {
                                c19359 = c19357;
                            } else if (c13925 == null || c13925.m33362(iM37705 + 1, list2)) {
                                if (!z9) {
                                    try {
                                        String strMo3566 = c1032.mo3566();
                                        c17249.f52882.m13385(strMo3566.substring(1, strMo3566.length() - 1).replace('/', '.'), c1032.getName());
                                        z9 = true;
                                    } catch (Exception unused) {
                                        abstractC16544 = this;
                                        z2 = false;
                                        C14354.m34249((InterfaceC5471) c1032, false);
                                        strMo3534 = null;
                                        if (strMo3534 == null) {
                                            c19359 = c19357;
                                        } else {
                                            C14354.m34249(c1032, z2);
                                            c19359 = c19357;
                                            C0336 c0336 = new C0336(EnumC0841.f3137, abstractC16544.mo24326(c13925), c19359.m44616(strMo3534));
                                            abstractC16544.mo3536(c15152, c0336, c23098, c13925);
                                            iM37705 = c0336.m20099().m37704();
                                            z8 = true;
                                        }
                                        iM37705++;
                                        c19357 = c19359;
                                    }
                                }
                                abstractC16544 = this;
                                try {
                                    strMo3534 = abstractC16544.mo3534(c1032, c15152, c23098, iM37705);
                                    z2 = false;
                                } catch (Exception unused2) {
                                    z2 = false;
                                    C14354.m34249((InterfaceC5471) c1032, false);
                                    strMo3534 = null;
                                }
                                if (strMo3534 == null) {
                                    c19359 = c19357;
                                } else {
                                    C14354.m34249(c1032, z2);
                                    c19359 = c19357;
                                    C0336 c0337 = new C0336(EnumC0841.f3137, abstractC16544.mo24326(c13925), c19359.m44616(strMo3534));
                                    abstractC16544.mo3536(c15152, c0337, c23098, c13925);
                                    iM37705 = c0337.m20099().m37704();
                                    z8 = true;
                                }
                            } else {
                                C14354.m34249((InterfaceC5471) c1032, false);
                                c19359 = c19357;
                            }
                            iM37705++;
                            c19357 = c19359;
                        }
                        abstractC16543 = this;
                        c19358 = c19357;
                        if (z8) {
                            int i9 = 1;
                            while (true) {
                                int size2 = list2.size();
                                set = c15152.f46304;
                                c11010 = c15152.f46301;
                                if (i9 >= size2) {
                                    break;
                                }
                                AbstractC7479 abstractC74712 = (AbstractC7479) list2.get(i9);
                                if (!C4570.m13425(abstractC74712, set)) {
                                    if (C4570.m13428(abstractC74712)) {
                                        AbstractC7479 abstractC74713 = (AbstractC7479) list2.get(i9 - 1);
                                        if (C4570.m13428(abstractC74713) && ((InterfaceC1779) abstractC74712).mo1790() == ((InterfaceC23651) abstractC74713).mo7930() && ((InterfaceC23651) abstractC74712).mo7930() == ((InterfaceC1779) abstractC74713).mo1790()) {
                                            c11010.m3813(i9);
                                            i9--;
                                        }
                                    } else {
                                        i9++;
                                    }
                                }
                                i9++;
                            }
                            int size3 = list2.size();
                            while (true) {
                                size3--;
                                if (size3 < 0) {
                                    break;
                                }
                                AbstractC7479 abstractC74714 = (AbstractC7479) list2.get(size3);
                                if (C4570.m13428(abstractC74714) && !C4570.m13427(c15152, ((InterfaceC1779) abstractC74714).mo1790(), size3 + 1)) {
                                    c11010.m3813(size3);
                                }
                            }
                            int size4 = list2.size();
                            while (true) {
                                size4--;
                                if (size4 < 0) {
                                    break;
                                }
                                InterfaceC22677 interfaceC22677 = (AbstractC7479) list2.get(size4);
                                if ((interfaceC22677.mo3975() != EnumC0841.f3138 ? false : ((InterfaceC21699) ((InterfaceC10952) interfaceC22677).getReference()).getType().equals("[B")) && !C4570.m13427(c15152, ((InterfaceC1779) interfaceC22677).mo1790(), size4 + 1)) {
                                    c11010.m3813(size4);
                                }
                            }
                            int i10 = 1;
                            while (i10 < list2.size()) {
                                AbstractC7479 abstractC74715 = (AbstractC7479) list2.get(i10);
                                if (!C4570.m13425(abstractC74715, set)) {
                                    if (C4570.m13426(abstractC74715)) {
                                        AbstractC7479 abstractC74716 = (AbstractC7479) list2.get(i10 - 1);
                                        if (C4570.m13426(abstractC74716) && ((InterfaceC1779) abstractC74715).mo1790() == ((InterfaceC23651) abstractC74716).mo7930() && ((InterfaceC23651) abstractC74715).mo7930() == ((InterfaceC1779) abstractC74716).mo1790()) {
                                            c11010.m3813(i10);
                                            i10--;
                                        }
                                    } else {
                                        i10++;
                                    }
                                }
                                i10++;
                            }
                            int size5 = list2.size();
                            while (true) {
                                size5--;
                                if (size5 < 0) {
                                    break;
                                }
                                AbstractC7479 abstractC74717 = (AbstractC7479) list2.get(size5);
                                if (C4570.m13426(abstractC74717) && !C4570.m13427(c15152, ((InterfaceC1779) abstractC74717).mo1790(), size5 + 1)) {
                                    c11010.m3813(size5);
                                }
                            }
                            int size6 = list2.size();
                            while (true) {
                                size6--;
                                if (size6 < 0) {
                                    break;
                                }
                                InterfaceC22677 interfaceC22678 = (AbstractC7479) list2.get(size6);
                                EnumC0841 enumC0841Mo3975 = interfaceC22678.mo3975();
                                if (enumC0841Mo3975 != EnumC0841.f3244 && enumC0841Mo3975 != EnumC0841.f3204 && enumC0841Mo3975 != EnumC0841.f3236 && enumC0841Mo3975 != EnumC0841.f3113) {
                                    EnumC0841 enumC0841Mo3976 = interfaceC22678.mo3975();
                                    if (enumC0841Mo3976 == EnumC0841.f3137 || enumC0841Mo3976 == EnumC0841.f3220) {
                                    }
                                }
                                if (!C4570.m13427(c15152, ((InterfaceC1779) interfaceC22678).mo1790(), size6 + 1)) {
                                    c11010.m3813(size6);
                                }
                            }
                            int i11 = 0;
                            while (i11 < list2.size()) {
                                AbstractC7479 abstractC74718 = (AbstractC7479) list2.get(i11);
                                if (abstractC74718.mo3975() == EnumC0841.f3177 && ((AbstractCollection) abstractC74718.m20099().m37705()).isEmpty()) {
                                    c11010.m3813(i11);
                                    i11--;
                                }
                                i11++;
                            }
                            int size7 = list2.size();
                            while (true) {
                                size7--;
                                if (size7 < 0 || ((AbstractC7479) list2.get(size7)).mo3975() != EnumC0841.f3065) {
                                    break;
                                }
                                c11010.m3813(size7);
                            }
                            c1032.m3564(c1109);
                            z6 = true;
                        } else {
                            z6 = z7;
                        }
                    }
                    z4 = false;
                    abstractC16545 = abstractC16543;
                    c193510 = c19358;
                    size = i;
                    it4 = it;
                    i4 = i2;
                    listMo3535 = list;
                    i5 = i3;
                    z5 = z;
                    interfaceC5278 = interfaceC5276;
                    it5 = it2;
                    c0658 = c0657;
                }
                List list3 = listMo3535;
                C19357 c193512 = c193510;
                int i12 = size;
                Iterator it7 = it4;
                int i13 = i4;
                boolean z10 = z5;
                int i14 = i5;
                C0657 c0659 = c0658;
                AbstractC16543 abstractC16546 = abstractC16545;
                if (z6) {
                    c17249.f52879.add(c0659.getType());
                    z5 = true;
                } else {
                    z5 = z10;
                }
                z4 = false;
                abstractC16545 = abstractC16546;
                c193510 = c193512;
                size = i12;
                it4 = it7;
                i4 = i13;
                listMo3535 = list3;
                i5 = i14;
            }
        }
        return z5;
    }

    /* JADX INFO: renamed from: ֫ */
    public int mo24326(C13925 c13925) {
        if (c13925 == null) {
            throw new NullPointerException("matchMoveObjectResult = false");
        }
        return c13925.m33360();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:165:0x035a  */
    /* JADX WARN: Code duplicated, block: B:167:0x0360  */
    /* JADX WARN: Code duplicated, block: B:168:0x0363  */
    /* JADX WARN: Code duplicated, block: B:170:0x037b  */
    /* JADX WARN: Code duplicated, block: B:173:0x0398 A[LOOP:2: B:171:0x0394->B:173:0x0398, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:174:0x03a2  */
    /* JADX WARN: Code duplicated, block: B:175:0x03ba  */
    /* JADX WARN: Code duplicated, block: B:177:0x03d5 A[LOOP:3: B:176:0x03d3->B:177:0x03d5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:178:0x03dd  */
    /* JADX WARN: Code duplicated, block: B:180:0x03e7  */
    /* JADX WARN: Code duplicated, block: B:181:0x03ea  */
    /* JADX WARN: Code duplicated, block: B:183:0x03fe  */
    /* JADX WARN: Code duplicated, block: B:185:0x0410  */
    /* JADX WARN: Code duplicated, block: B:186:0x0412  */
    /* JADX WARN: Code duplicated, block: B:188:0x0418  */
    /* JADX WARN: Code duplicated, block: B:189:0x042d  */
    /* JADX WARN: Code duplicated, block: B:190:0x0451  */
    /* JADX WARN: Code duplicated, block: B:191:0x0465  */
    /* JADX WARN: Code duplicated, block: B:192:0x0479  */
    /* JADX WARN: Code duplicated, block: B:193:0x049c  */
    /* JADX WARN: Code duplicated, block: B:194:0x04b1  */
    /* JADX WARN: Code duplicated, block: B:214:0x034e A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:175:0x03ba, please report this as an issue */
    /* JADX INFO: renamed from: ֫ */
    public String mo3534(C1032 c1032, C15152 c15152, C23098 c23098, int i) throws C3138 {
        byte b;
        String str;
        boolean z;
        int i2;
        int i3;
        short[] sArrM20317;
        int length;
        int i4;
        int i5;
        C15859 c15859;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        AbstractC16543 abstractC16543 = this;
        abstractC16543.f50830 = null;
        ArrayList arrayList5 = abstractC16543.f50829;
        arrayList5.clear();
        ArrayList arrayList6 = abstractC16543.f50831;
        arrayList6.clear();
        ArrayList arrayList7 = abstractC16543.f50834;
        arrayList7.clear();
        ArrayList arrayList8 = abstractC16543.f50833;
        arrayList8.clear();
        ArrayList arrayList9 = abstractC16543.f50832;
        arrayList9.clear();
        InterfaceC5471 interfaceC5471M51287 = c23098.m51287();
        List listMo3565 = interfaceC5471M51287.mo3565();
        C15859 c158510 = new C15859();
        InterfaceC6667 interfaceC6667M51286 = c23098.m51286();
        int i6 = 0;
        while (true) {
            int size = listMo3565.size();
            String str2 = "I";
            InterfaceC5471 interfaceC5471 = interfaceC5471M51287;
            C15859 c158511 = c158510;
            ArrayList arrayList10 = arrayList6;
            String str3 = "C";
            ArrayList arrayList11 = arrayList8;
            String str4 = "B";
            ArrayList arrayList12 = arrayList9;
            ArrayList arrayList13 = arrayList7;
            ArrayList arrayList14 = arrayList5;
            C17249 c17249 = abstractC16543.f76507;
            if (i6 < size) {
                String strMo15148 = abstractC16543.mo15148(i6, ((CharSequence) listMo3565.get(i6)).toString());
                strMo15148.getClass();
                switch (strMo15148) {
                    case "B":
                    case "C":
                    case "F":
                    case "I":
                    case "S":
                    case "Z":
                        c15859 = c158511;
                        arrayList = arrayList10;
                        arrayList2 = arrayList11;
                        arrayList9 = arrayList12;
                        arrayList3 = arrayList13;
                        arrayList4 = arrayList14;
                        c15859.add(interfaceC6667M51286.nextInt());
                        break;
                    case "D":
                    case "J":
                        arrayList = arrayList10;
                        arrayList2 = arrayList11;
                        arrayList9 = arrayList12;
                        arrayList3 = arrayList13;
                        arrayList4 = arrayList14;
                        c15859 = c158511;
                        c15859.add(interfaceC6667M51286.nextInt());
                        c15859.add(interfaceC6667M51286.nextInt());
                        break;
                    case "[B":
                        arrayList2 = arrayList11;
                        arrayList9 = arrayList12;
                        arrayList3 = arrayList13;
                        arrayList4 = arrayList14;
                        C4754 c4754 = new C4754(c17249);
                        if (!c4754.m13902(c15152, i, interfaceC6667M51286.nextInt())) {
                            C11003.toString(c1032);
                            return null;
                        }
                        arrayList = arrayList10;
                        arrayList.add(c4754);
                        c15859 = c158511;
                        break;
                        break;
                    case "[C":
                        arrayList9 = arrayList12;
                        arrayList3 = arrayList13;
                        arrayList4 = arrayList14;
                        C3343 c3343 = new C3343(c17249);
                        if (!c3343.m10204(c15152, i, interfaceC6667M51286.nextInt())) {
                            C11003.toString(c1032);
                            return null;
                        }
                        arrayList2 = arrayList11;
                        arrayList2.add(c3343);
                        c15859 = c158511;
                        arrayList = arrayList10;
                        break;
                        break;
                    case "[I":
                        arrayList3 = arrayList13;
                        arrayList4 = arrayList14;
                        C13220 c13220 = new C13220(c17249);
                        if (!c13220.m32056(c15152, i, interfaceC6667M51286.nextInt())) {
                            C11003.toString(c1032);
                            return null;
                        }
                        arrayList9 = arrayList12;
                        arrayList9.add(c13220);
                        c15859 = c158511;
                        arrayList = arrayList10;
                        arrayList2 = arrayList11;
                        break;
                        break;
                    case "[S":
                        arrayList4 = arrayList14;
                        C7576 c7576 = new C7576(c17249);
                        if (!c7576.m20316(c15152, i, interfaceC6667M51286.nextInt())) {
                            C11003.toString(c1032);
                            return null;
                        }
                        arrayList3 = arrayList13;
                        arrayList3.add(c7576);
                        c15859 = c158511;
                        arrayList = arrayList10;
                        arrayList2 = arrayList11;
                        arrayList9 = arrayList12;
                        break;
                        break;
                    case "Ljava/lang/String;":
                        C1541 c1541 = new C1541(c17249);
                        if (!c1541.m5285(c15152, i, interfaceC6667M51286.nextInt())) {
                            C11003.toString(c1032);
                            return null;
                        }
                        arrayList4 = arrayList14;
                        arrayList4.add(c1541);
                        c15859 = c158511;
                        arrayList = arrayList10;
                        arrayList2 = arrayList11;
                        arrayList9 = arrayList12;
                        arrayList3 = arrayList13;
                        break;
                        break;
                    default:
                        throw new RuntimeException("Unsupported parameter type: ".concat(strMo15148));
                }
                i6++;
                c158510 = c15859;
                arrayList6 = arrayList;
                arrayList5 = arrayList4;
                arrayList7 = arrayList3;
                arrayList8 = arrayList2;
                interfaceC5471M51287 = interfaceC5471;
            } else {
                if (!c158511.isEmpty()) {
                    C10399 c10399 = new C10399();
                    abstractC16543.f50830 = c10399;
                    if (!c10399.m26230(c15152, i, c158511.mo3586())) {
                        C11003.toString(c1032);
                        return null;
                    }
                }
                C10399 c103910 = abstractC16543.f50830;
                Object[] objArrM26231 = c103910 == null ? new Object[0] : c103910.m26231(c17249);
                String strM52075 = AbstractC23599.m52075(interfaceC5471.mo3566());
                String name = interfaceC5471.getName();
                C10130 c10130 = new C10130();
                c10130.m25423((CharSequence) strM52075);
                c10130.m25423((CharSequence) name);
                c10130.writeByte(listMo3565.size());
                InterfaceC6667 interfaceC6667M51287 = c23098.m51286();
                Iterator it = arrayList14.iterator();
                Iterator it2 = arrayList10.iterator();
                Iterator it3 = arrayList13.iterator();
                Iterator it4 = arrayList11.iterator();
                Iterator it5 = arrayList12.iterator();
                Object[] objArr = objArrM26231;
                int i7 = 0;
                while (i7 < listMo3565.size()) {
                    String string = ((CharSequence) listMo3565.get(i7)).toString();
                    List list = listMo3565;
                    String strMo15149 = abstractC16543.mo15148(i7, string);
                    int iNextInt = interfaceC6667M51287.nextInt();
                    strMo15149.getClass();
                    switch (strMo15149.hashCode()) {
                        case 66:
                            str4 = str4;
                            b = !strMo15149.equals(str4) ? (byte) -1 : (byte) 0;
                            switch (b) {
                                case 0:
                                    str = str2;
                                    c10130.writeByte(0);
                                    c10130.writeInt(((Number) objArr[iNextInt]).byteValue());
                                    break;
                                case 1:
                                    str = str2;
                                    c10130.writeByte(2);
                                    c10130.mo13227((char) ((Number) objArr[iNextInt]).shortValue());
                                    break;
                                case 2:
                                    str = str2;
                                    int iNextInt2 = interfaceC6667M51287.nextInt();
                                    c10130.writeByte(6);
                                    c10130.writeInt(((Number) objArr[iNextInt]).intValue());
                                    c10130.writeInt(((Number) objArr[iNextInt2]).intValue());
                                    break;
                                case 3:
                                    str = str2;
                                    c10130.writeByte(5);
                                    c10130.writeInt(((Number) objArr[iNextInt]).intValue());
                                    break;
                                case 4:
                                    str = str2;
                                    c10130.writeByte(3);
                                    c10130.writeInt(((Number) objArr[iNextInt]).intValue());
                                    break;
                                case 5:
                                    str = str2;
                                    int iNextInt3 = interfaceC6667M51287.nextInt();
                                    c10130.writeByte(4);
                                    c10130.writeInt(((Number) objArr[iNextInt]).intValue());
                                    c10130.writeInt(((Number) objArr[iNextInt3]).intValue());
                                    break;
                                case 6:
                                    str = str2;
                                    c10130.writeByte(1);
                                    c10130.writeInt(((Number) objArr[iNextInt]).shortValue());
                                    break;
                                case 7:
                                    str = str2;
                                    c10130.writeByte(7);
                                    if (((Number) objArr[iNextInt]).intValue() != 0) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    c10130.m25425(z);
                                    break;
                                case 8:
                                    str = str2;
                                    if (string.equals("[B")) {
                                        i2 = 10;
                                    } else {
                                        i2 = 11;
                                    }
                                    c10130.writeByte(i2);
                                    c10130.m25434(((C4754) it2.next()).m13903());
                                    break;
                                case 9:
                                    str = str2;
                                    c10130.writeByte(13);
                                    char[] cArrM10205 = ((C3343) it4.next()).m10205();
                                    c10130.writeInt(cArrM10205.length);
                                    for (char c : cArrM10205) {
                                        c10130.mo13227(c);
                                    }
                                    break;
                                case 10:
                                    str = str2;
                                    c10130.writeByte(14);
                                    c10130.m25435(((C13220) it5.next()).m32057());
                                    break;
                                case 11:
                                    c10130.writeByte(12);
                                    sArrM20317 = ((C7576) it3.next()).m20317();
                                    c10130.writeInt(sArrM20317.length);
                                    length = sArrM20317.length;
                                    i4 = 0;
                                    while (true) {
                                        str = str2;
                                        if (i4 < length) {
                                            c10130.mo13229(sArrM20317[i4]);
                                            i4++;
                                            str2 = str;
                                        }
                                    }
                                    break;
                                case 12:
                                    if (string.equals("Ljava/lang/String;")) {
                                        i5 = 8;
                                    } else {
                                        i5 = 9;
                                    }
                                    c10130.writeByte(i5);
                                    c10130.m25423((CharSequence) ((C1541) it.next()).m5283());
                                    str = str2;
                                    break;
                                default:
                                    throw new RuntimeException("Unsupported type: ".concat(strMo15149));
                            }
                            i7++;
                            abstractC16543 = this;
                            listMo3565 = list;
                            str2 = str;
                            break;
                        case 67:
                            String str5 = str3;
                            if (strMo15149.equals(str5)) {
                                b = 1;
                                str3 = str5;
                            } else {
                                str3 = str5;
                                str4 = str4;
                                switch (b) {
                                    case 0:
                                        str = str2;
                                        c10130.writeByte(0);
                                        c10130.writeInt(((Number) objArr[iNextInt]).byteValue());
                                        break;
                                    case 1:
                                        str = str2;
                                        c10130.writeByte(2);
                                        c10130.mo13227((char) ((Number) objArr[iNextInt]).shortValue());
                                        break;
                                    case 2:
                                        str = str2;
                                        int iNextInt4 = interfaceC6667M51287.nextInt();
                                        c10130.writeByte(6);
                                        c10130.writeInt(((Number) objArr[iNextInt]).intValue());
                                        c10130.writeInt(((Number) objArr[iNextInt4]).intValue());
                                        break;
                                    case 3:
                                        str = str2;
                                        c10130.writeByte(5);
                                        c10130.writeInt(((Number) objArr[iNextInt]).intValue());
                                        break;
                                    case 4:
                                        str = str2;
                                        c10130.writeByte(3);
                                        c10130.writeInt(((Number) objArr[iNextInt]).intValue());
                                        break;
                                    case 5:
                                        str = str2;
                                        int iNextInt5 = interfaceC6667M51287.nextInt();
                                        c10130.writeByte(4);
                                        c10130.writeInt(((Number) objArr[iNextInt]).intValue());
                                        c10130.writeInt(((Number) objArr[iNextInt5]).intValue());
                                        break;
                                    case 6:
                                        str = str2;
                                        c10130.writeByte(1);
                                        c10130.writeInt(((Number) objArr[iNextInt]).shortValue());
                                        break;
                                    case 7:
                                        str = str2;
                                        c10130.writeByte(7);
                                        if (((Number) objArr[iNextInt]).intValue() != 0) {
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                        c10130.m25425(z);
                                        break;
                                    case 8:
                                        str = str2;
                                        if (string.equals("[B")) {
                                            i2 = 10;
                                        } else {
                                            i2 = 11;
                                        }
                                        c10130.writeByte(i2);
                                        c10130.m25434(((C4754) it2.next()).m13903());
                                        break;
                                    case 9:
                                        str = str2;
                                        c10130.writeByte(13);
                                        char[] cArrM10206 = ((C3343) it4.next()).m10205();
                                        c10130.writeInt(cArrM10206.length);
                                        while (i3 < r1) {
                                            c10130.mo13227(c);
                                        }
                                        break;
                                    case 10:
                                        str = str2;
                                        c10130.writeByte(14);
                                        c10130.m25435(((C13220) it5.next()).m32057());
                                        break;
                                    case 11:
                                        c10130.writeByte(12);
                                        sArrM20317 = ((C7576) it3.next()).m20317();
                                        c10130.writeInt(sArrM20317.length);
                                        length = sArrM20317.length;
                                        i4 = 0;
                                        while (true) {
                                            str = str2;
                                            if (i4 < length) {
                                                c10130.mo13229(sArrM20317[i4]);
                                                i4++;
                                                str2 = str;
                                            }
                                        }
                                        break;
                                    case 12:
                                        if (string.equals("Ljava/lang/String;")) {
                                            i5 = 8;
                                        } else {
                                            i5 = 9;
                                        }
                                        c10130.writeByte(i5);
                                        c10130.m25423((CharSequence) ((C1541) it.next()).m5283());
                                        str = str2;
                                        break;
                                    default:
                                        throw new RuntimeException("Unsupported type: ".concat(strMo15149));
                                }
                                i7++;
                                abstractC16543 = this;
                                listMo3565 = list;
                                str2 = str;
                            }
                            break;
                        case 68:
                            if (strMo15149.equals("D")) {
                                b = 2;
                            }
                            str4 = str4;
                            switch (b) {
                                case 0:
                                    str = str2;
                                    c10130.writeByte(0);
                                    c10130.writeInt(((Number) objArr[iNextInt]).byteValue());
                                    break;
                                case 1:
                                    str = str2;
                                    c10130.writeByte(2);
                                    c10130.mo13227((char) ((Number) objArr[iNextInt]).shortValue());
                                    break;
                                case 2:
                                    str = str2;
                                    int iNextInt6 = interfaceC6667M51287.nextInt();
                                    c10130.writeByte(6);
                                    c10130.writeInt(((Number) objArr[iNextInt]).intValue());
                                    c10130.writeInt(((Number) objArr[iNextInt6]).intValue());
                                    break;
                                case 3:
                                    str = str2;
                                    c10130.writeByte(5);
                                    c10130.writeInt(((Number) objArr[iNextInt]).intValue());
                                    break;
                                case 4:
                                    str = str2;
                                    c10130.writeByte(3);
                                    c10130.writeInt(((Number) objArr[iNextInt]).intValue());
                                    break;
                                case 5:
                                    str = str2;
                                    int iNextInt7 = interfaceC6667M51287.nextInt();
                                    c10130.writeByte(4);
                                    c10130.writeInt(((Number) objArr[iNextInt]).intValue());
                                    c10130.writeInt(((Number) objArr[iNextInt7]).intValue());
                                    break;
                                case 6:
                                    str = str2;
                                    c10130.writeByte(1);
                                    c10130.writeInt(((Number) objArr[iNextInt]).shortValue());
                                    break;
                                case 7:
                                    str = str2;
                                    c10130.writeByte(7);
                                    if (((Number) objArr[iNextInt]).intValue() != 0) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    c10130.m25425(z);
                                    break;
                                case 8:
                                    str = str2;
                                    if (string.equals("[B")) {
                                        i2 = 10;
                                    } else {
                                        i2 = 11;
                                    }
                                    c10130.writeByte(i2);
                                    c10130.m25434(((C4754) it2.next()).m13903());
                                    break;
                                case 9:
                                    str = str2;
                                    c10130.writeByte(13);
                                    char[] cArrM10207 = ((C3343) it4.next()).m10205();
                                    c10130.writeInt(cArrM10207.length);
                                    while (i3 < r1) {
                                        c10130.mo13227(c);
                                    }
                                    break;
                                case 10:
                                    str = str2;
                                    c10130.writeByte(14);
                                    c10130.m25435(((C13220) it5.next()).m32057());
                                    break;
                                case 11:
                                    c10130.writeByte(12);
                                    sArrM20317 = ((C7576) it3.next()).m20317();
                                    c10130.writeInt(sArrM20317.length);
                                    length = sArrM20317.length;
                                    i4 = 0;
                                    while (true) {
                                        str = str2;
                                        if (i4 < length) {
                                            c10130.mo13229(sArrM20317[i4]);
                                            i4++;
                                            str2 = str;
                                        }
                                    }
                                    break;
                                case 12:
                                    if (string.equals("Ljava/lang/String;")) {
                                        i5 = 8;
                                    } else {
                                        i5 = 9;
                                    }
                                    c10130.writeByte(i5);
                                    c10130.m25423((CharSequence) ((C1541) it.next()).m5283());
                                    str = str2;
                                    break;
                                default:
                                    throw new RuntimeException("Unsupported type: ".concat(strMo15149));
                            }
                            i7++;
                            abstractC16543 = this;
                            listMo3565 = list;
                            str2 = str;
                            break;
                        case 70:
                            if (strMo15149.equals("F")) {
                                b = 3;
                            }
                            str4 = str4;
                            switch (b) {
                                case 0:
                                    str = str2;
                                    c10130.writeByte(0);
                                    c10130.writeInt(((Number) objArr[iNextInt]).byteValue());
                                    break;
                                case 1:
                                    str = str2;
                                    c10130.writeByte(2);
                                    c10130.mo13227((char) ((Number) objArr[iNextInt]).shortValue());
                                    break;
                                case 2:
                                    str = str2;
                                    int iNextInt8 = interfaceC6667M51287.nextInt();
                                    c10130.writeByte(6);
                                    c10130.writeInt(((Number) objArr[iNextInt]).intValue());
                                    c10130.writeInt(((Number) objArr[iNextInt8]).intValue());
                                    break;
                                case 3:
                                    str = str2;
                                    c10130.writeByte(5);
                                    c10130.writeInt(((Number) objArr[iNextInt]).intValue());
                                    break;
                                case 4:
                                    str = str2;
                                    c10130.writeByte(3);
                                    c10130.writeInt(((Number) objArr[iNextInt]).intValue());
                                    break;
                                case 5:
                                    str = str2;
                                    int iNextInt9 = interfaceC6667M51287.nextInt();
                                    c10130.writeByte(4);
                                    c10130.writeInt(((Number) objArr[iNextInt]).intValue());
                                    c10130.writeInt(((Number) objArr[iNextInt9]).intValue());
                                    break;
                                case 6:
                                    str = str2;
                                    c10130.writeByte(1);
                                    c10130.writeInt(((Number) objArr[iNextInt]).shortValue());
                                    break;
                                case 7:
                                    str = str2;
                                    c10130.writeByte(7);
                                    if (((Number) objArr[iNextInt]).intValue() != 0) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    c10130.m25425(z);
                                    break;
                                case 8:
                                    str = str2;
                                    if (string.equals("[B")) {
                                        i2 = 10;
                                    } else {
                                        i2 = 11;
                                    }
                                    c10130.writeByte(i2);
                                    c10130.m25434(((C4754) it2.next()).m13903());
                                    break;
                                case 9:
                                    str = str2;
                                    c10130.writeByte(13);
                                    char[] cArrM10208 = ((C3343) it4.next()).m10205();
                                    c10130.writeInt(cArrM10208.length);
                                    while (i3 < r1) {
                                        c10130.mo13227(c);
                                    }
                                    break;
                                case 10:
                                    str = str2;
                                    c10130.writeByte(14);
                                    c10130.m25435(((C13220) it5.next()).m32057());
                                    break;
                                case 11:
                                    c10130.writeByte(12);
                                    sArrM20317 = ((C7576) it3.next()).m20317();
                                    c10130.writeInt(sArrM20317.length);
                                    length = sArrM20317.length;
                                    i4 = 0;
                                    while (true) {
                                        str = str2;
                                        if (i4 < length) {
                                            c10130.mo13229(sArrM20317[i4]);
                                            i4++;
                                            str2 = str;
                                        }
                                    }
                                    break;
                                case 12:
                                    if (string.equals("Ljava/lang/String;")) {
                                        i5 = 8;
                                    } else {
                                        i5 = 9;
                                    }
                                    c10130.writeByte(i5);
                                    c10130.m25423((CharSequence) ((C1541) it.next()).m5283());
                                    str = str2;
                                    break;
                                default:
                                    throw new RuntimeException("Unsupported type: ".concat(strMo15149));
                            }
                            i7++;
                            abstractC16543 = this;
                            listMo3565 = list;
                            str2 = str;
                            break;
                        case 73:
                            if (strMo15149.equals(str2)) {
                                b = 4;
                            }
                            str4 = str4;
                            switch (b) {
                                case 0:
                                    str = str2;
                                    c10130.writeByte(0);
                                    c10130.writeInt(((Number) objArr[iNextInt]).byteValue());
                                    break;
                                case 1:
                                    str = str2;
                                    c10130.writeByte(2);
                                    c10130.mo13227((char) ((Number) objArr[iNextInt]).shortValue());
                                    break;
                                case 2:
                                    str = str2;
                                    int iNextInt10 = interfaceC6667M51287.nextInt();
                                    c10130.writeByte(6);
                                    c10130.writeInt(((Number) objArr[iNextInt]).intValue());
                                    c10130.writeInt(((Number) objArr[iNextInt10]).intValue());
                                    break;
                                case 3:
                                    str = str2;
                                    c10130.writeByte(5);
                                    c10130.writeInt(((Number) objArr[iNextInt]).intValue());
                                    break;
                                case 4:
                                    str = str2;
                                    c10130.writeByte(3);
                                    c10130.writeInt(((Number) objArr[iNextInt]).intValue());
                                    break;
                                case 5:
                                    str = str2;
                                    int iNextInt11 = interfaceC6667M51287.nextInt();
                                    c10130.writeByte(4);
                                    c10130.writeInt(((Number) objArr[iNextInt]).intValue());
                                    c10130.writeInt(((Number) objArr[iNextInt11]).intValue());
                                    break;
                                case 6:
                                    str = str2;
                                    c10130.writeByte(1);
                                    c10130.writeInt(((Number) objArr[iNextInt]).shortValue());
                                    break;
                                case 7:
                                    str = str2;
                                    c10130.writeByte(7);
                                    if (((Number) objArr[iNextInt]).intValue() != 0) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    c10130.m25425(z);
                                    break;
                                case 8:
                                    str = str2;
                                    if (string.equals("[B")) {
                                        i2 = 10;
                                    } else {
                                        i2 = 11;
                                    }
                                    c10130.writeByte(i2);
                                    c10130.m25434(((C4754) it2.next()).m13903());
                                    break;
                                case 9:
                                    str = str2;
                                    c10130.writeByte(13);
                                    char[] cArrM10209 = ((C3343) it4.next()).m10205();
                                    c10130.writeInt(cArrM10209.length);
                                    while (i3 < r1) {
                                        c10130.mo13227(c);
                                    }
                                    break;
                                case 10:
                                    str = str2;
                                    c10130.writeByte(14);
                                    c10130.m25435(((C13220) it5.next()).m32057());
                                    break;
                                case 11:
                                    c10130.writeByte(12);
                                    sArrM20317 = ((C7576) it3.next()).m20317();
                                    c10130.writeInt(sArrM20317.length);
                                    length = sArrM20317.length;
                                    i4 = 0;
                                    while (true) {
                                        str = str2;
                                        if (i4 < length) {
                                            c10130.mo13229(sArrM20317[i4]);
                                            i4++;
                                            str2 = str;
                                        }
                                    }
                                    break;
                                case 12:
                                    if (string.equals("Ljava/lang/String;")) {
                                        i5 = 8;
                                    } else {
                                        i5 = 9;
                                    }
                                    c10130.writeByte(i5);
                                    c10130.m25423((CharSequence) ((C1541) it.next()).m5283());
                                    str = str2;
                                    break;
                                default:
                                    throw new RuntimeException("Unsupported type: ".concat(strMo15149));
                            }
                            i7++;
                            abstractC16543 = this;
                            listMo3565 = list;
                            str2 = str;
                            break;
                        case 74:
                            if (strMo15149.equals("J")) {
                                b = 5;
                            }
                            str4 = str4;
                            switch (b) {
                                case 0:
                                    str = str2;
                                    c10130.writeByte(0);
                                    c10130.writeInt(((Number) objArr[iNextInt]).byteValue());
                                    break;
                                case 1:
                                    str = str2;
                                    c10130.writeByte(2);
                                    c10130.mo13227((char) ((Number) objArr[iNextInt]).shortValue());
                                    break;
                                case 2:
                                    str = str2;
                                    int iNextInt12 = interfaceC6667M51287.nextInt();
                                    c10130.writeByte(6);
                                    c10130.writeInt(((Number) objArr[iNextInt]).intValue());
                                    c10130.writeInt(((Number) objArr[iNextInt12]).intValue());
                                    break;
                                case 3:
                                    str = str2;
                                    c10130.writeByte(5);
                                    c10130.writeInt(((Number) objArr[iNextInt]).intValue());
                                    break;
                                case 4:
                                    str = str2;
                                    c10130.writeByte(3);
                                    c10130.writeInt(((Number) objArr[iNextInt]).intValue());
                                    break;
                                case 5:
                                    str = str2;
                                    int iNextInt13 = interfaceC6667M51287.nextInt();
                                    c10130.writeByte(4);
                                    c10130.writeInt(((Number) objArr[iNextInt]).intValue());
                                    c10130.writeInt(((Number) objArr[iNextInt13]).intValue());
                                    break;
                                case 6:
                                    str = str2;
                                    c10130.writeByte(1);
                                    c10130.writeInt(((Number) objArr[iNextInt]).shortValue());
                                    break;
                                case 7:
                                    str = str2;
                                    c10130.writeByte(7);
                                    if (((Number) objArr[iNextInt]).intValue() != 0) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    c10130.m25425(z);
                                    break;
                                case 8:
                                    str = str2;
                                    if (string.equals("[B")) {
                                        i2 = 10;
                                    } else {
                                        i2 = 11;
                                    }
                                    c10130.writeByte(i2);
                                    c10130.m25434(((C4754) it2.next()).m13903());
                                    break;
                                case 9:
                                    str = str2;
                                    c10130.writeByte(13);
                                    char[] cArrM102010 = ((C3343) it4.next()).m10205();
                                    c10130.writeInt(cArrM102010.length);
                                    while (i3 < r1) {
                                        c10130.mo13227(c);
                                    }
                                    break;
                                case 10:
                                    str = str2;
                                    c10130.writeByte(14);
                                    c10130.m25435(((C13220) it5.next()).m32057());
                                    break;
                                case 11:
                                    c10130.writeByte(12);
                                    sArrM20317 = ((C7576) it3.next()).m20317();
                                    c10130.writeInt(sArrM20317.length);
                                    length = sArrM20317.length;
                                    i4 = 0;
                                    while (true) {
                                        str = str2;
                                        if (i4 < length) {
                                            c10130.mo13229(sArrM20317[i4]);
                                            i4++;
                                            str2 = str;
                                        }
                                    }
                                    break;
                                case 12:
                                    if (string.equals("Ljava/lang/String;")) {
                                        i5 = 8;
                                    } else {
                                        i5 = 9;
                                    }
                                    c10130.writeByte(i5);
                                    c10130.m25423((CharSequence) ((C1541) it.next()).m5283());
                                    str = str2;
                                    break;
                                default:
                                    throw new RuntimeException("Unsupported type: ".concat(strMo15149));
                            }
                            i7++;
                            abstractC16543 = this;
                            listMo3565 = list;
                            str2 = str;
                            break;
                        case BaseSlider.DEFAULT_LABEL_ANIMATION_ENTER_DURATION /* 83 */:
                            if (strMo15149.equals("S")) {
                                b = 6;
                            }
                            str4 = str4;
                            switch (b) {
                                case 0:
                                    str = str2;
                                    c10130.writeByte(0);
                                    c10130.writeInt(((Number) objArr[iNextInt]).byteValue());
                                    break;
                                case 1:
                                    str = str2;
                                    c10130.writeByte(2);
                                    c10130.mo13227((char) ((Number) objArr[iNextInt]).shortValue());
                                    break;
                                case 2:
                                    str = str2;
                                    int iNextInt14 = interfaceC6667M51287.nextInt();
                                    c10130.writeByte(6);
                                    c10130.writeInt(((Number) objArr[iNextInt]).intValue());
                                    c10130.writeInt(((Number) objArr[iNextInt14]).intValue());
                                    break;
                                case 3:
                                    str = str2;
                                    c10130.writeByte(5);
                                    c10130.writeInt(((Number) objArr[iNextInt]).intValue());
                                    break;
                                case 4:
                                    str = str2;
                                    c10130.writeByte(3);
                                    c10130.writeInt(((Number) objArr[iNextInt]).intValue());
                                    break;
                                case 5:
                                    str = str2;
                                    int iNextInt15 = interfaceC6667M51287.nextInt();
                                    c10130.writeByte(4);
                                    c10130.writeInt(((Number) objArr[iNextInt]).intValue());
                                    c10130.writeInt(((Number) objArr[iNextInt15]).intValue());
                                    break;
                                case 6:
                                    str = str2;
                                    c10130.writeByte(1);
                                    c10130.writeInt(((Number) objArr[iNextInt]).shortValue());
                                    break;
                                case 7:
                                    str = str2;
                                    c10130.writeByte(7);
                                    if (((Number) objArr[iNextInt]).intValue() != 0) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    c10130.m25425(z);
                                    break;
                                case 8:
                                    str = str2;
                                    if (string.equals("[B")) {
                                        i2 = 10;
                                    } else {
                                        i2 = 11;
                                    }
                                    c10130.writeByte(i2);
                                    c10130.m25434(((C4754) it2.next()).m13903());
                                    break;
                                case 9:
                                    str = str2;
                                    c10130.writeByte(13);
                                    char[] cArrM102011 = ((C3343) it4.next()).m10205();
                                    c10130.writeInt(cArrM102011.length);
                                    while (i3 < r1) {
                                        c10130.mo13227(c);
                                    }
                                    break;
                                case 10:
                                    str = str2;
                                    c10130.writeByte(14);
                                    c10130.m25435(((C13220) it5.next()).m32057());
                                    break;
                                case 11:
                                    c10130.writeByte(12);
                                    sArrM20317 = ((C7576) it3.next()).m20317();
                                    c10130.writeInt(sArrM20317.length);
                                    length = sArrM20317.length;
                                    i4 = 0;
                                    while (true) {
                                        str = str2;
                                        if (i4 < length) {
                                            c10130.mo13229(sArrM20317[i4]);
                                            i4++;
                                            str2 = str;
                                        }
                                    }
                                    break;
                                case 12:
                                    if (string.equals("Ljava/lang/String;")) {
                                        i5 = 8;
                                    } else {
                                        i5 = 9;
                                    }
                                    c10130.writeByte(i5);
                                    c10130.m25423((CharSequence) ((C1541) it.next()).m5283());
                                    str = str2;
                                    break;
                                default:
                                    throw new RuntimeException("Unsupported type: ".concat(strMo15149));
                            }
                            i7++;
                            abstractC16543 = this;
                            listMo3565 = list;
                            str2 = str;
                            break;
                        case 90:
                            if (strMo15149.equals("Z")) {
                                b = 7;
                            }
                            str4 = str4;
                            switch (b) {
                                case 0:
                                    str = str2;
                                    c10130.writeByte(0);
                                    c10130.writeInt(((Number) objArr[iNextInt]).byteValue());
                                    break;
                                case 1:
                                    str = str2;
                                    c10130.writeByte(2);
                                    c10130.mo13227((char) ((Number) objArr[iNextInt]).shortValue());
                                    break;
                                case 2:
                                    str = str2;
                                    int iNextInt16 = interfaceC6667M51287.nextInt();
                                    c10130.writeByte(6);
                                    c10130.writeInt(((Number) objArr[iNextInt]).intValue());
                                    c10130.writeInt(((Number) objArr[iNextInt16]).intValue());
                                    break;
                                case 3:
                                    str = str2;
                                    c10130.writeByte(5);
                                    c10130.writeInt(((Number) objArr[iNextInt]).intValue());
                                    break;
                                case 4:
                                    str = str2;
                                    c10130.writeByte(3);
                                    c10130.writeInt(((Number) objArr[iNextInt]).intValue());
                                    break;
                                case 5:
                                    str = str2;
                                    int iNextInt17 = interfaceC6667M51287.nextInt();
                                    c10130.writeByte(4);
                                    c10130.writeInt(((Number) objArr[iNextInt]).intValue());
                                    c10130.writeInt(((Number) objArr[iNextInt17]).intValue());
                                    break;
                                case 6:
                                    str = str2;
                                    c10130.writeByte(1);
                                    c10130.writeInt(((Number) objArr[iNextInt]).shortValue());
                                    break;
                                case 7:
                                    str = str2;
                                    c10130.writeByte(7);
                                    if (((Number) objArr[iNextInt]).intValue() != 0) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    c10130.m25425(z);
                                    break;
                                case 8:
                                    str = str2;
                                    if (string.equals("[B")) {
                                        i2 = 10;
                                    } else {
                                        i2 = 11;
                                    }
                                    c10130.writeByte(i2);
                                    c10130.m25434(((C4754) it2.next()).m13903());
                                    break;
                                case 9:
                                    str = str2;
                                    c10130.writeByte(13);
                                    char[] cArrM102012 = ((C3343) it4.next()).m10205();
                                    c10130.writeInt(cArrM102012.length);
                                    while (i3 < r1) {
                                        c10130.mo13227(c);
                                    }
                                    break;
                                case 10:
                                    str = str2;
                                    c10130.writeByte(14);
                                    c10130.m25435(((C13220) it5.next()).m32057());
                                    break;
                                case 11:
                                    c10130.writeByte(12);
                                    sArrM20317 = ((C7576) it3.next()).m20317();
                                    c10130.writeInt(sArrM20317.length);
                                    length = sArrM20317.length;
                                    i4 = 0;
                                    while (true) {
                                        str = str2;
                                        if (i4 < length) {
                                            c10130.mo13229(sArrM20317[i4]);
                                            i4++;
                                            str2 = str;
                                        }
                                    }
                                    break;
                                case 12:
                                    if (string.equals("Ljava/lang/String;")) {
                                        i5 = 8;
                                    } else {
                                        i5 = 9;
                                    }
                                    c10130.writeByte(i5);
                                    c10130.m25423((CharSequence) ((C1541) it.next()).m5283());
                                    str = str2;
                                    break;
                                default:
                                    throw new RuntimeException("Unsupported type: ".concat(strMo15149));
                            }
                            i7++;
                            abstractC16543 = this;
                            listMo3565 = list;
                            str2 = str;
                            break;
                        case 2887:
                            if (strMo15149.equals("[B")) {
                                b = 8;
                            }
                            str4 = str4;
                            switch (b) {
                                case 0:
                                    str = str2;
                                    c10130.writeByte(0);
                                    c10130.writeInt(((Number) objArr[iNextInt]).byteValue());
                                    break;
                                case 1:
                                    str = str2;
                                    c10130.writeByte(2);
                                    c10130.mo13227((char) ((Number) objArr[iNextInt]).shortValue());
                                    break;
                                case 2:
                                    str = str2;
                                    int iNextInt18 = interfaceC6667M51287.nextInt();
                                    c10130.writeByte(6);
                                    c10130.writeInt(((Number) objArr[iNextInt]).intValue());
                                    c10130.writeInt(((Number) objArr[iNextInt18]).intValue());
                                    break;
                                case 3:
                                    str = str2;
                                    c10130.writeByte(5);
                                    c10130.writeInt(((Number) objArr[iNextInt]).intValue());
                                    break;
                                case 4:
                                    str = str2;
                                    c10130.writeByte(3);
                                    c10130.writeInt(((Number) objArr[iNextInt]).intValue());
                                    break;
                                case 5:
                                    str = str2;
                                    int iNextInt19 = interfaceC6667M51287.nextInt();
                                    c10130.writeByte(4);
                                    c10130.writeInt(((Number) objArr[iNextInt]).intValue());
                                    c10130.writeInt(((Number) objArr[iNextInt19]).intValue());
                                    break;
                                case 6:
                                    str = str2;
                                    c10130.writeByte(1);
                                    c10130.writeInt(((Number) objArr[iNextInt]).shortValue());
                                    break;
                                case 7:
                                    str = str2;
                                    c10130.writeByte(7);
                                    if (((Number) objArr[iNextInt]).intValue() != 0) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    c10130.m25425(z);
                                    break;
                                case 8:
                                    str = str2;
                                    if (string.equals("[B")) {
                                        i2 = 10;
                                    } else {
                                        i2 = 11;
                                    }
                                    c10130.writeByte(i2);
                                    c10130.m25434(((C4754) it2.next()).m13903());
                                    break;
                                case 9:
                                    str = str2;
                                    c10130.writeByte(13);
                                    char[] cArrM102013 = ((C3343) it4.next()).m10205();
                                    c10130.writeInt(cArrM102013.length);
                                    while (i3 < r1) {
                                        c10130.mo13227(c);
                                    }
                                    break;
                                case 10:
                                    str = str2;
                                    c10130.writeByte(14);
                                    c10130.m25435(((C13220) it5.next()).m32057());
                                    break;
                                case 11:
                                    c10130.writeByte(12);
                                    sArrM20317 = ((C7576) it3.next()).m20317();
                                    c10130.writeInt(sArrM20317.length);
                                    length = sArrM20317.length;
                                    i4 = 0;
                                    while (true) {
                                        str = str2;
                                        if (i4 < length) {
                                            c10130.mo13229(sArrM20317[i4]);
                                            i4++;
                                            str2 = str;
                                        }
                                    }
                                    break;
                                case 12:
                                    if (string.equals("Ljava/lang/String;")) {
                                        i5 = 8;
                                    } else {
                                        i5 = 9;
                                    }
                                    c10130.writeByte(i5);
                                    c10130.m25423((CharSequence) ((C1541) it.next()).m5283());
                                    str = str2;
                                    break;
                                default:
                                    throw new RuntimeException("Unsupported type: ".concat(strMo15149));
                            }
                            i7++;
                            abstractC16543 = this;
                            listMo3565 = list;
                            str2 = str;
                            break;
                        case 2888:
                            if (strMo15149.equals("[C")) {
                                b = 9;
                            }
                            str4 = str4;
                            switch (b) {
                                case 0:
                                    str = str2;
                                    c10130.writeByte(0);
                                    c10130.writeInt(((Number) objArr[iNextInt]).byteValue());
                                    break;
                                case 1:
                                    str = str2;
                                    c10130.writeByte(2);
                                    c10130.mo13227((char) ((Number) objArr[iNextInt]).shortValue());
                                    break;
                                case 2:
                                    str = str2;
                                    int iNextInt110 = interfaceC6667M51287.nextInt();
                                    c10130.writeByte(6);
                                    c10130.writeInt(((Number) objArr[iNextInt]).intValue());
                                    c10130.writeInt(((Number) objArr[iNextInt110]).intValue());
                                    break;
                                case 3:
                                    str = str2;
                                    c10130.writeByte(5);
                                    c10130.writeInt(((Number) objArr[iNextInt]).intValue());
                                    break;
                                case 4:
                                    str = str2;
                                    c10130.writeByte(3);
                                    c10130.writeInt(((Number) objArr[iNextInt]).intValue());
                                    break;
                                case 5:
                                    str = str2;
                                    int iNextInt111 = interfaceC6667M51287.nextInt();
                                    c10130.writeByte(4);
                                    c10130.writeInt(((Number) objArr[iNextInt]).intValue());
                                    c10130.writeInt(((Number) objArr[iNextInt111]).intValue());
                                    break;
                                case 6:
                                    str = str2;
                                    c10130.writeByte(1);
                                    c10130.writeInt(((Number) objArr[iNextInt]).shortValue());
                                    break;
                                case 7:
                                    str = str2;
                                    c10130.writeByte(7);
                                    if (((Number) objArr[iNextInt]).intValue() != 0) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    c10130.m25425(z);
                                    break;
                                case 8:
                                    str = str2;
                                    if (string.equals("[B")) {
                                        i2 = 10;
                                    } else {
                                        i2 = 11;
                                    }
                                    c10130.writeByte(i2);
                                    c10130.m25434(((C4754) it2.next()).m13903());
                                    break;
                                case 9:
                                    str = str2;
                                    c10130.writeByte(13);
                                    char[] cArrM102014 = ((C3343) it4.next()).m10205();
                                    c10130.writeInt(cArrM102014.length);
                                    while (i3 < r1) {
                                        c10130.mo13227(c);
                                    }
                                    break;
                                case 10:
                                    str = str2;
                                    c10130.writeByte(14);
                                    c10130.m25435(((C13220) it5.next()).m32057());
                                    break;
                                case 11:
                                    c10130.writeByte(12);
                                    sArrM20317 = ((C7576) it3.next()).m20317();
                                    c10130.writeInt(sArrM20317.length);
                                    length = sArrM20317.length;
                                    i4 = 0;
                                    while (true) {
                                        str = str2;
                                        if (i4 < length) {
                                            c10130.mo13229(sArrM20317[i4]);
                                            i4++;
                                            str2 = str;
                                        }
                                    }
                                    break;
                                case 12:
                                    if (string.equals("Ljava/lang/String;")) {
                                        i5 = 8;
                                    } else {
                                        i5 = 9;
                                    }
                                    c10130.writeByte(i5);
                                    c10130.m25423((CharSequence) ((C1541) it.next()).m5283());
                                    str = str2;
                                    break;
                                default:
                                    throw new RuntimeException("Unsupported type: ".concat(strMo15149));
                            }
                            i7++;
                            abstractC16543 = this;
                            listMo3565 = list;
                            str2 = str;
                            break;
                        case 2894:
                            if (strMo15149.equals("[I")) {
                                b = 10;
                            }
                            str4 = str4;
                            switch (b) {
                                case 0:
                                    str = str2;
                                    c10130.writeByte(0);
                                    c10130.writeInt(((Number) objArr[iNextInt]).byteValue());
                                    break;
                                case 1:
                                    str = str2;
                                    c10130.writeByte(2);
                                    c10130.mo13227((char) ((Number) objArr[iNextInt]).shortValue());
                                    break;
                                case 2:
                                    str = str2;
                                    int iNextInt112 = interfaceC6667M51287.nextInt();
                                    c10130.writeByte(6);
                                    c10130.writeInt(((Number) objArr[iNextInt]).intValue());
                                    c10130.writeInt(((Number) objArr[iNextInt112]).intValue());
                                    break;
                                case 3:
                                    str = str2;
                                    c10130.writeByte(5);
                                    c10130.writeInt(((Number) objArr[iNextInt]).intValue());
                                    break;
                                case 4:
                                    str = str2;
                                    c10130.writeByte(3);
                                    c10130.writeInt(((Number) objArr[iNextInt]).intValue());
                                    break;
                                case 5:
                                    str = str2;
                                    int iNextInt113 = interfaceC6667M51287.nextInt();
                                    c10130.writeByte(4);
                                    c10130.writeInt(((Number) objArr[iNextInt]).intValue());
                                    c10130.writeInt(((Number) objArr[iNextInt113]).intValue());
                                    break;
                                case 6:
                                    str = str2;
                                    c10130.writeByte(1);
                                    c10130.writeInt(((Number) objArr[iNextInt]).shortValue());
                                    break;
                                case 7:
                                    str = str2;
                                    c10130.writeByte(7);
                                    if (((Number) objArr[iNextInt]).intValue() != 0) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    c10130.m25425(z);
                                    break;
                                case 8:
                                    str = str2;
                                    if (string.equals("[B")) {
                                        i2 = 10;
                                    } else {
                                        i2 = 11;
                                    }
                                    c10130.writeByte(i2);
                                    c10130.m25434(((C4754) it2.next()).m13903());
                                    break;
                                case 9:
                                    str = str2;
                                    c10130.writeByte(13);
                                    char[] cArrM102015 = ((C3343) it4.next()).m10205();
                                    c10130.writeInt(cArrM102015.length);
                                    while (i3 < r1) {
                                        c10130.mo13227(c);
                                    }
                                    break;
                                case 10:
                                    str = str2;
                                    c10130.writeByte(14);
                                    c10130.m25435(((C13220) it5.next()).m32057());
                                    break;
                                case 11:
                                    c10130.writeByte(12);
                                    sArrM20317 = ((C7576) it3.next()).m20317();
                                    c10130.writeInt(sArrM20317.length);
                                    length = sArrM20317.length;
                                    i4 = 0;
                                    while (true) {
                                        str = str2;
                                        if (i4 < length) {
                                            c10130.mo13229(sArrM20317[i4]);
                                            i4++;
                                            str2 = str;
                                        }
                                    }
                                    break;
                                case 12:
                                    if (string.equals("Ljava/lang/String;")) {
                                        i5 = 8;
                                    } else {
                                        i5 = 9;
                                    }
                                    c10130.writeByte(i5);
                                    c10130.m25423((CharSequence) ((C1541) it.next()).m5283());
                                    str = str2;
                                    break;
                                default:
                                    throw new RuntimeException("Unsupported type: ".concat(strMo15149));
                            }
                            i7++;
                            abstractC16543 = this;
                            listMo3565 = list;
                            str2 = str;
                            break;
                        case 2904:
                            if (strMo15149.equals("[S")) {
                                b = 11;
                            }
                            str4 = str4;
                            switch (b) {
                                case 0:
                                    str = str2;
                                    c10130.writeByte(0);
                                    c10130.writeInt(((Number) objArr[iNextInt]).byteValue());
                                    break;
                                case 1:
                                    str = str2;
                                    c10130.writeByte(2);
                                    c10130.mo13227((char) ((Number) objArr[iNextInt]).shortValue());
                                    break;
                                case 2:
                                    str = str2;
                                    int iNextInt114 = interfaceC6667M51287.nextInt();
                                    c10130.writeByte(6);
                                    c10130.writeInt(((Number) objArr[iNextInt]).intValue());
                                    c10130.writeInt(((Number) objArr[iNextInt114]).intValue());
                                    break;
                                case 3:
                                    str = str2;
                                    c10130.writeByte(5);
                                    c10130.writeInt(((Number) objArr[iNextInt]).intValue());
                                    break;
                                case 4:
                                    str = str2;
                                    c10130.writeByte(3);
                                    c10130.writeInt(((Number) objArr[iNextInt]).intValue());
                                    break;
                                case 5:
                                    str = str2;
                                    int iNextInt115 = interfaceC6667M51287.nextInt();
                                    c10130.writeByte(4);
                                    c10130.writeInt(((Number) objArr[iNextInt]).intValue());
                                    c10130.writeInt(((Number) objArr[iNextInt115]).intValue());
                                    break;
                                case 6:
                                    str = str2;
                                    c10130.writeByte(1);
                                    c10130.writeInt(((Number) objArr[iNextInt]).shortValue());
                                    break;
                                case 7:
                                    str = str2;
                                    c10130.writeByte(7);
                                    if (((Number) objArr[iNextInt]).intValue() != 0) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    c10130.m25425(z);
                                    break;
                                case 8:
                                    str = str2;
                                    if (string.equals("[B")) {
                                        i2 = 10;
                                    } else {
                                        i2 = 11;
                                    }
                                    c10130.writeByte(i2);
                                    c10130.m25434(((C4754) it2.next()).m13903());
                                    break;
                                case 9:
                                    str = str2;
                                    c10130.writeByte(13);
                                    char[] cArrM102016 = ((C3343) it4.next()).m10205();
                                    c10130.writeInt(cArrM102016.length);
                                    while (i3 < r1) {
                                        c10130.mo13227(c);
                                    }
                                    break;
                                case 10:
                                    str = str2;
                                    c10130.writeByte(14);
                                    c10130.m25435(((C13220) it5.next()).m32057());
                                    break;
                                case 11:
                                    c10130.writeByte(12);
                                    sArrM20317 = ((C7576) it3.next()).m20317();
                                    c10130.writeInt(sArrM20317.length);
                                    length = sArrM20317.length;
                                    i4 = 0;
                                    while (true) {
                                        str = str2;
                                        if (i4 < length) {
                                            c10130.mo13229(sArrM20317[i4]);
                                            i4++;
                                            str2 = str;
                                        }
                                    }
                                    break;
                                case 12:
                                    if (string.equals("Ljava/lang/String;")) {
                                        i5 = 8;
                                    } else {
                                        i5 = 9;
                                    }
                                    c10130.writeByte(i5);
                                    c10130.m25423((CharSequence) ((C1541) it.next()).m5283());
                                    str = str2;
                                    break;
                                default:
                                    throw new RuntimeException("Unsupported type: ".concat(strMo15149));
                            }
                            i7++;
                            abstractC16543 = this;
                            listMo3565 = list;
                            str2 = str;
                            break;
                        case 1379658506:
                            if (strMo15149.equals("Ljava/lang/String;")) {
                                b = 12;
                            }
                            str4 = str4;
                            switch (b) {
                                case 0:
                                    str = str2;
                                    c10130.writeByte(0);
                                    c10130.writeInt(((Number) objArr[iNextInt]).byteValue());
                                    break;
                                case 1:
                                    str = str2;
                                    c10130.writeByte(2);
                                    c10130.mo13227((char) ((Number) objArr[iNextInt]).shortValue());
                                    break;
                                case 2:
                                    str = str2;
                                    int iNextInt116 = interfaceC6667M51287.nextInt();
                                    c10130.writeByte(6);
                                    c10130.writeInt(((Number) objArr[iNextInt]).intValue());
                                    c10130.writeInt(((Number) objArr[iNextInt116]).intValue());
                                    break;
                                case 3:
                                    str = str2;
                                    c10130.writeByte(5);
                                    c10130.writeInt(((Number) objArr[iNextInt]).intValue());
                                    break;
                                case 4:
                                    str = str2;
                                    c10130.writeByte(3);
                                    c10130.writeInt(((Number) objArr[iNextInt]).intValue());
                                    break;
                                case 5:
                                    str = str2;
                                    int iNextInt117 = interfaceC6667M51287.nextInt();
                                    c10130.writeByte(4);
                                    c10130.writeInt(((Number) objArr[iNextInt]).intValue());
                                    c10130.writeInt(((Number) objArr[iNextInt117]).intValue());
                                    break;
                                case 6:
                                    str = str2;
                                    c10130.writeByte(1);
                                    c10130.writeInt(((Number) objArr[iNextInt]).shortValue());
                                    break;
                                case 7:
                                    str = str2;
                                    c10130.writeByte(7);
                                    if (((Number) objArr[iNextInt]).intValue() != 0) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    c10130.m25425(z);
                                    break;
                                case 8:
                                    str = str2;
                                    if (string.equals("[B")) {
                                        i2 = 10;
                                    } else {
                                        i2 = 11;
                                    }
                                    c10130.writeByte(i2);
                                    c10130.m25434(((C4754) it2.next()).m13903());
                                    break;
                                case 9:
                                    str = str2;
                                    c10130.writeByte(13);
                                    char[] cArrM102017 = ((C3343) it4.next()).m10205();
                                    c10130.writeInt(cArrM102017.length);
                                    while (i3 < r1) {
                                        c10130.mo13227(c);
                                    }
                                    break;
                                case 10:
                                    str = str2;
                                    c10130.writeByte(14);
                                    c10130.m25435(((C13220) it5.next()).m32057());
                                    break;
                                case 11:
                                    c10130.writeByte(12);
                                    sArrM20317 = ((C7576) it3.next()).m20317();
                                    c10130.writeInt(sArrM20317.length);
                                    length = sArrM20317.length;
                                    i4 = 0;
                                    while (true) {
                                        str = str2;
                                        if (i4 < length) {
                                            c10130.mo13229(sArrM20317[i4]);
                                            i4++;
                                            str2 = str;
                                        }
                                    }
                                    break;
                                case 12:
                                    if (string.equals("Ljava/lang/String;")) {
                                        i5 = 8;
                                    } else {
                                        i5 = 9;
                                    }
                                    c10130.writeByte(i5);
                                    c10130.m25423((CharSequence) ((C1541) it.next()).m5283());
                                    str = str2;
                                    break;
                                default:
                                    throw new RuntimeException("Unsupported type: ".concat(strMo15149));
                            }
                            i7++;
                            abstractC16543 = this;
                            listMo3565 = list;
                            str2 = str;
                            break;
                        default:
                            str4 = str4;
                            switch (b) {
                                case 0:
                                    str = str2;
                                    c10130.writeByte(0);
                                    c10130.writeInt(((Number) objArr[iNextInt]).byteValue());
                                    break;
                                case 1:
                                    str = str2;
                                    c10130.writeByte(2);
                                    c10130.mo13227((char) ((Number) objArr[iNextInt]).shortValue());
                                    break;
                                case 2:
                                    str = str2;
                                    int iNextInt118 = interfaceC6667M51287.nextInt();
                                    c10130.writeByte(6);
                                    c10130.writeInt(((Number) objArr[iNextInt]).intValue());
                                    c10130.writeInt(((Number) objArr[iNextInt118]).intValue());
                                    break;
                                case 3:
                                    str = str2;
                                    c10130.writeByte(5);
                                    c10130.writeInt(((Number) objArr[iNextInt]).intValue());
                                    break;
                                case 4:
                                    str = str2;
                                    c10130.writeByte(3);
                                    c10130.writeInt(((Number) objArr[iNextInt]).intValue());
                                    break;
                                case 5:
                                    str = str2;
                                    int iNextInt119 = interfaceC6667M51287.nextInt();
                                    c10130.writeByte(4);
                                    c10130.writeInt(((Number) objArr[iNextInt]).intValue());
                                    c10130.writeInt(((Number) objArr[iNextInt119]).intValue());
                                    break;
                                case 6:
                                    str = str2;
                                    c10130.writeByte(1);
                                    c10130.writeInt(((Number) objArr[iNextInt]).shortValue());
                                    break;
                                case 7:
                                    str = str2;
                                    c10130.writeByte(7);
                                    if (((Number) objArr[iNextInt]).intValue() != 0) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    c10130.m25425(z);
                                    break;
                                case 8:
                                    str = str2;
                                    if (string.equals("[B")) {
                                        i2 = 10;
                                    } else {
                                        i2 = 11;
                                    }
                                    c10130.writeByte(i2);
                                    c10130.m25434(((C4754) it2.next()).m13903());
                                    break;
                                case 9:
                                    str = str2;
                                    c10130.writeByte(13);
                                    char[] cArrM102018 = ((C3343) it4.next()).m10205();
                                    c10130.writeInt(cArrM102018.length);
                                    while (i3 < r1) {
                                        c10130.mo13227(c);
                                    }
                                    break;
                                case 10:
                                    str = str2;
                                    c10130.writeByte(14);
                                    c10130.m25435(((C13220) it5.next()).m32057());
                                    break;
                                case 11:
                                    c10130.writeByte(12);
                                    sArrM20317 = ((C7576) it3.next()).m20317();
                                    c10130.writeInt(sArrM20317.length);
                                    length = sArrM20317.length;
                                    i4 = 0;
                                    while (true) {
                                        str = str2;
                                        if (i4 < length) {
                                            c10130.mo13229(sArrM20317[i4]);
                                            i4++;
                                            str2 = str;
                                        }
                                    }
                                    break;
                                case 12:
                                    if (string.equals("Ljava/lang/String;")) {
                                        i5 = 8;
                                    } else {
                                        i5 = 9;
                                    }
                                    c10130.writeByte(i5);
                                    c10130.m25423((CharSequence) ((C1541) it.next()).m5283());
                                    str = str2;
                                    break;
                                default:
                                    throw new RuntimeException("Unsupported type: ".concat(strMo15149));
                            }
                            i7++;
                            abstractC16543 = this;
                            listMo3565 = list;
                            str2 = str;
                            break;
                    }
                    str4 = str4;
                    switch (b) {
                        case 0:
                            str = str2;
                            c10130.writeByte(0);
                            c10130.writeInt(((Number) objArr[iNextInt]).byteValue());
                            break;
                        case 1:
                            str = str2;
                            c10130.writeByte(2);
                            c10130.mo13227((char) ((Number) objArr[iNextInt]).shortValue());
                            break;
                        case 2:
                            str = str2;
                            int iNextInt1110 = interfaceC6667M51287.nextInt();
                            c10130.writeByte(6);
                            c10130.writeInt(((Number) objArr[iNextInt]).intValue());
                            c10130.writeInt(((Number) objArr[iNextInt1110]).intValue());
                            break;
                        case 3:
                            str = str2;
                            c10130.writeByte(5);
                            c10130.writeInt(((Number) objArr[iNextInt]).intValue());
                            break;
                        case 4:
                            str = str2;
                            c10130.writeByte(3);
                            c10130.writeInt(((Number) objArr[iNextInt]).intValue());
                            break;
                        case 5:
                            str = str2;
                            int iNextInt1111 = interfaceC6667M51287.nextInt();
                            c10130.writeByte(4);
                            c10130.writeInt(((Number) objArr[iNextInt]).intValue());
                            c10130.writeInt(((Number) objArr[iNextInt1111]).intValue());
                            break;
                        case 6:
                            str = str2;
                            c10130.writeByte(1);
                            c10130.writeInt(((Number) objArr[iNextInt]).shortValue());
                            break;
                        case 7:
                            str = str2;
                            c10130.writeByte(7);
                            if (((Number) objArr[iNextInt]).intValue() != 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            c10130.m25425(z);
                            break;
                        case 8:
                            str = str2;
                            if (string.equals("[B")) {
                                i2 = 10;
                            } else {
                                i2 = 11;
                            }
                            c10130.writeByte(i2);
                            c10130.m25434(((C4754) it2.next()).m13903());
                            break;
                        case 9:
                            str = str2;
                            c10130.writeByte(13);
                            char[] cArrM102019 = ((C3343) it4.next()).m10205();
                            c10130.writeInt(cArrM102019.length);
                            while (i3 < r1) {
                                c10130.mo13227(c);
                            }
                            break;
                        case 10:
                            str = str2;
                            c10130.writeByte(14);
                            c10130.m25435(((C13220) it5.next()).m32057());
                            break;
                        case 11:
                            c10130.writeByte(12);
                            sArrM20317 = ((C7576) it3.next()).m20317();
                            c10130.writeInt(sArrM20317.length);
                            length = sArrM20317.length;
                            i4 = 0;
                            while (true) {
                                str = str2;
                                if (i4 < length) {
                                    c10130.mo13229(sArrM20317[i4]);
                                    i4++;
                                    str2 = str;
                                }
                            }
                            break;
                        case 12:
                            if (string.equals("Ljava/lang/String;")) {
                                i5 = 8;
                            } else {
                                i5 = 9;
                            }
                            c10130.writeByte(i5);
                            c10130.m25423((CharSequence) ((C1541) it.next()).m5283());
                            str = str2;
                            break;
                        default:
                            throw new RuntimeException("Unsupported type: ".concat(strMo15149));
                    }
                    i7++;
                    abstractC16543 = this;
                    listMo3565 = list;
                    str2 = str;
                }
                String strM13381 = c17249.f52882.m13381(c10130.m25444());
                if (strM13381 == null) {
                    C11003.toString(c1032);
                }
                return strM13381;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo3536(C15152 c15152, C0336 c0336, C23098 c23098, C13925 c13925) {
        if (c13925 == null) {
            throw new NullPointerException("matchMoveObjectResult = false");
        }
        c15152.f46301.m3814(c23098.m51285(), c0336);
        c13925.m33361(c15152);
        C10399 c10399 = this.f50830;
        if (c10399 != null) {
            c10399.m26229(c15152);
        }
        Iterator it = this.f50829.iterator();
        while (it.hasNext()) {
            ((C1541) it.next()).m5284(c15152);
        }
        Iterator it2 = this.f50831.iterator();
        while (it2.hasNext()) {
            ((C4754) it2.next()).m13901(c15152);
        }
        Iterator it3 = this.f50834.iterator();
        while (it3.hasNext()) {
            ((C7576) it3.next()).m20315(c15152);
        }
        Iterator it4 = this.f50833.iterator();
        while (it4.hasNext()) {
            ((C3343) it4.next()).m10203(c15152);
        }
        Iterator it5 = this.f50832.iterator();
        while (it5.hasNext()) {
            ((C13220) it5.next()).m32055(c15152);
        }
    }
}
