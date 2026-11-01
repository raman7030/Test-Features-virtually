package p067l;

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
public abstract class AbstractC18091 extends AbstractC24797 {

    /* JADX INFO: renamed from: ۜ */
    public boolean f54006;

    /* JADX INFO: renamed from: ۢ */
    public ArrayList f54007;

    /* JADX INFO: renamed from: ܳ */
    public C12252 f54008;

    /* JADX INFO: renamed from: ܽ */
    public ArrayList f54009;

    /* JADX INFO: renamed from: ܿ */
    public ArrayList f54010;

    /* JADX INFO: renamed from: ᩳ */
    public ArrayList f54011;

    /* JADX INFO: renamed from: ᩷ */
    public ArrayList f54012;

    /* JADX INFO: renamed from: ᩻ */
    public EnumC13593 f54013;

    /* JADX INFO: renamed from: ֫ */
    public String mo17051(int i, String str) {
        return str;
    }

    /* JADX INFO: renamed from: ֫ */
    public abstract List mo5822(C18762 c18762);

    public AbstractC18091(C18762 c18762, InterfaceC7383 interfaceC7383) {
        super(c18762, interfaceC7383);
        this.f54013 = EnumC13593.STATIC;
        this.f54006 = true;
        this.f54007 = new ArrayList();
        this.f54009 = new ArrayList();
        this.f54012 = new ArrayList();
        this.f54011 = new ArrayList();
        this.f54010 = new ArrayList();
    }

    /* JADX WARN: Code duplicated, block: B:108:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:110:0x02ca A[PHI: r3
      0x02ca: PHI (r3v48 boolean) = (r3v7 boolean), (r3v52 boolean) binds: [B:109:0x02c8, B:106:0x02a4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:81:0x021b  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p067l.AbstractC24797
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo41146(InterfaceC1209 interfaceC1209) {
        int i;
        C3422 c3422;
        Iterator it;
        int i2;
        List list;
        C20765 c20765;
        boolean z;
        int i3;
        C2993 c2993;
        Iterator it2;
        InterfaceC7383 interfaceC7383;
        AbstractC18091 abstractC18091;
        C20765 c20766;
        Set set;
        C3422 c3423;
        C20765 c20767;
        AbstractC18091 abstractC18092;
        boolean z2;
        String strMo5821;
        Iterator it3;
        boolean z3;
        InterfaceC7383 interfaceC7384;
        InterfaceC0923 interfaceC0923;
        AbstractC18091 abstractC18093 = this;
        C18762 c18762 = abstractC18093.f79251;
        List listMo5822 = abstractC18093.mo5822(c18762);
        boolean z4 = false;
        if (listMo5822.isEmpty()) {
            return false;
        }
        C20765 c20768 = c18762.f56066;
        int size = c18762.f56062.values().size();
        Iterator it4 = c20768.f71640.m49128().values().iterator();
        int i4 = -1;
        boolean z5 = false;
        int i5 = 0;
        while (it4.hasNext()) {
            C2993 c2994 = (C2993) it4.next();
            i5++;
            int i6 = (i5 * 100) / size;
            InterfaceC7383 interfaceC7385 = abstractC18093.f79252;
            if (i6 != i4) {
                interfaceC7385.mo5868(i6);
                i4 = i6;
            }
            String type = c2994.getType();
            if (interfaceC1209.mo14675(type.substring(1, type.length() - 1).replace('/', '.'))) {
                Iterator it5 = c2994.getMethods().iterator();
                boolean z6 = false;
                while (it5.hasNext()) {
                    C3349 c3349 = (C3349) it5.next();
                    if (interfaceC7385.mo3924()) {
                        return z4;
                    }
                    InterfaceC20568 interfaceC20568Mo5857 = c3349.mo5857();
                    if (interfaceC20568Mo5857 == null) {
                        i = size;
                        c3422 = null;
                    } else {
                        i = size;
                        c3422 = interfaceC20568Mo5857 instanceof C3422 ? (C3422) interfaceC20568Mo5857 : new C3422(interfaceC20568Mo5857);
                    }
                    if (c3422 == null) {
                        list = listMo5822;
                        c20766 = c20768;
                        it = it4;
                        i2 = i4;
                        z = z5;
                        i3 = i5;
                        c2993 = c2994;
                        it2 = it5;
                        interfaceC7383 = interfaceC7385;
                        abstractC18091 = abstractC18093;
                    } else {
                        C16769 c16769 = new C16769(c2994, c3349, c3422);
                        it = it4;
                        i2 = i4;
                        C24321 c24321 = new C24321(listMo5822, abstractC18093.f54013);
                        C15603 c15603 = abstractC18093.f54006 ? new C15603() : null;
                        list = listMo5822;
                        List list2 = c16769.f49421;
                        if (c15603 != null) {
                            while (true) {
                                z = z5;
                                i3 = i5;
                                int i7 = 0;
                                while (true) {
                                    if (i7 >= list2.size()) {
                                        break;
                                    }
                                    if (!c24321.m53678(i7, list2) || c24321.m53681().equals(c3349)) {
                                        it3 = it5;
                                        interfaceC7384 = interfaceC7385;
                                        z3 = z6;
                                    } else {
                                        int i8 = i7 + 1;
                                        if (c15603.m35481(i8, list2)) {
                                            it3 = it5;
                                            AbstractCollection abstractCollection = (AbstractCollection) ((AbstractC9476) list2.get(i7)).m22075().m39880();
                                            if (!abstractCollection.isEmpty()) {
                                                AbstractC9476 abstractC9476 = (AbstractC9476) list2.get(i7);
                                                AbstractC9476 abstractC9477 = (AbstractC9476) list2.get(i8);
                                                interfaceC7384 = interfaceC7385;
                                                if (abstractC9476 instanceof InterfaceC12933) {
                                                    final InterfaceC12933 interfaceC12933 = (InterfaceC12933) abstractC9476;
                                                    c2994 = c2994;
                                                    interfaceC0923 = new InterfaceC0923() { // from class: l.֫ۡᩳ
                                                        @Override // p067l.InterfaceC0923
                                                        public final Object get() {
                                                            InterfaceC12933 interfaceC12934 = interfaceC12933;
                                                            return new C3364(interfaceC12934.mo6217(), interfaceC12934.mo5886(), interfaceC12934.mo5885(), interfaceC12934.mo5883(), interfaceC12934.mo5882(), interfaceC12934.mo5884(), interfaceC12934.mo5881(), interfaceC12934.getReference());
                                                        }
                                                    };
                                                } else {
                                                    c2994 = c2994;
                                                    if (abstractC9476 instanceof InterfaceC18967) {
                                                        final InterfaceC18967 interfaceC18967 = (InterfaceC18967) abstractC9476;
                                                        interfaceC0923 = new InterfaceC0923() { // from class: l.ۧۡᩳ
                                                            @Override // p067l.InterfaceC0923
                                                            public final Object get() {
                                                                InterfaceC18967 interfaceC18968 = interfaceC18967;
                                                                return new C22811(interfaceC18968.mo6217(), interfaceC18968.mo11756(), interfaceC18968.mo5886(), interfaceC18968.getReference());
                                                            }
                                                        };
                                                    }
                                                    c20768 = c20768;
                                                    z3 = z6;
                                                }
                                                if (abstractC9477 instanceof InterfaceC20153) {
                                                    InterfaceC20153 interfaceC20153 = (InterfaceC20153) abstractC9477;
                                                    z3 = z6;
                                                    HashSet hashSet = new HashSet();
                                                    for (AbstractC9476 abstractC9478 : (AbstractList) list2) {
                                                        C20765 c20769 = c20768;
                                                        if (abstractC9478 instanceof AbstractC4093) {
                                                            AbstractC4093 abstractC4093 = (AbstractC4093) abstractC9478;
                                                            if (abstractCollection.contains(abstractC4093.m8235())) {
                                                                hashSet.add(abstractC4093.m22075());
                                                            }
                                                        }
                                                        c20768 = c20769;
                                                    }
                                                    c20768 = c20768;
                                                    if (i7 > 0 && ((AbstractC9476) list2.get(i7 - 1)).mo6217().m5446()) {
                                                        hashSet.add(((AbstractC9476) list2.get(i7)).m22075());
                                                    }
                                                    if (hashSet.size() != 1) {
                                                        Iterator it6 = hashSet.iterator();
                                                        while (it6.hasNext()) {
                                                            int iM39879 = ((C17503) it6.next()).m39879();
                                                            c3422.m6064(iM39879, (AbstractC9476) interfaceC0923.get());
                                                            c3422.m6064(iM39879 + 1, new C24209(interfaceC20153.mo4189(), interfaceC20153.mo6217()));
                                                        }
                                                        c3422.m6070(abstractC9476.m22075().m39879());
                                                        c3422.m6070(abstractC9477.m22075().m39879());
                                                        i5 = i3;
                                                        z5 = z;
                                                        interfaceC7385 = interfaceC7384;
                                                        it5 = it3;
                                                        c2994 = c2994;
                                                        z6 = z3;
                                                        c20768 = c20768;
                                                    }
                                                } else {
                                                    c20768 = c20768;
                                                    z3 = z6;
                                                }
                                            }
                                        } else {
                                            it3 = it5;
                                        }
                                        interfaceC7384 = interfaceC7385;
                                        z3 = z6;
                                    }
                                    i7++;
                                    interfaceC7385 = interfaceC7384;
                                    it5 = it3;
                                    c2994 = c2994;
                                    z6 = z3;
                                    c20768 = c20768;
                                }
                            }
                            c20765 = c20768;
                        } else {
                            c20765 = c20768;
                            z = z5;
                            i3 = i5;
                        }
                        c2993 = c2994;
                        it2 = it5;
                        interfaceC7383 = interfaceC7385;
                        boolean z7 = z6;
                        boolean z8 = false;
                        boolean z9 = false;
                        int iM398710 = 0;
                        while (iM398710 < list2.size()) {
                            if (!c24321.m53678(iM398710, list2) || c24321.m53681().equals(c3349)) {
                                c20767 = c20765;
                            } else if (c15603 == null || c15603.m35481(iM398710 + 1, list2)) {
                                if (!z9) {
                                    try {
                                        String strMo5853 = c3349.mo5853();
                                        c18762.f56064.m15273(strMo5853.substring(1, strMo5853.length() - 1).replace('/', '.'), c3349.getName());
                                        z9 = true;
                                    } catch (Exception unused) {
                                        abstractC18092 = this;
                                        z2 = false;
                                        C16010.m36382((InterfaceC7568) c3349, false);
                                        strMo5821 = null;
                                        if (strMo5821 == null) {
                                            c20767 = c20765;
                                        } else {
                                            C16010.m36382(c3349, z2);
                                            c20767 = c20765;
                                            C2688 c2688 = new C2688(EnumC3167.f5911, abstractC18092.mo26336(c15603), c20767.m46910(strMo5821));
                                            abstractC18092.mo5823(c16769, c2688, c24321, c15603);
                                            iM398710 = c2688.m22075().m39879();
                                            z8 = true;
                                        }
                                        iM398710++;
                                        c20765 = c20767;
                                    }
                                }
                                abstractC18092 = this;
                                try {
                                    strMo5821 = abstractC18092.mo5821(c3349, c16769, c24321, iM398710);
                                    z2 = false;
                                } catch (Exception unused2) {
                                    z2 = false;
                                    C16010.m36382((InterfaceC7568) c3349, false);
                                    strMo5821 = null;
                                }
                                if (strMo5821 == null) {
                                    c20767 = c20765;
                                } else {
                                    C16010.m36382(c3349, z2);
                                    c20767 = c20765;
                                    C2688 c2689 = new C2688(EnumC3167.f5911, abstractC18092.mo26336(c15603), c20767.m46910(strMo5821));
                                    abstractC18092.mo5823(c16769, c2689, c24321, c15603);
                                    iM398710 = c2689.m22075().m39879();
                                    z8 = true;
                                }
                            } else {
                                C16010.m36382((InterfaceC7568) c3349, false);
                                c20767 = c20765;
                            }
                            iM398710++;
                            c20765 = c20767;
                        }
                        abstractC18091 = this;
                        c20766 = c20765;
                        if (z8) {
                            int i9 = 1;
                            while (true) {
                                int size2 = list2.size();
                                set = c16769.f49423;
                                c3423 = c16769.f49420;
                                if (i9 >= size2) {
                                    break;
                                }
                                AbstractC9476 abstractC9479 = (AbstractC9476) list2.get(i9);
                                if (!C6712.m15313(abstractC9479, set)) {
                                    if (C6712.m15316(abstractC9479)) {
                                        AbstractC9476 abstractC94710 = (AbstractC9476) list2.get(i9 - 1);
                                        if (C6712.m15316(abstractC94710) && ((InterfaceC4059) abstractC9479).mo4189() == ((InterfaceC24846) abstractC94710).mo9978() && ((InterfaceC24846) abstractC9479).mo9978() == ((InterfaceC4059) abstractC94710).mo4189()) {
                                            c3423.m6070(i9);
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
                                AbstractC9476 abstractC94711 = (AbstractC9476) list2.get(size3);
                                if (C6712.m15316(abstractC94711) && !C6712.m15315(c16769, ((InterfaceC4059) abstractC94711).mo4189(), size3 + 1)) {
                                    c3423.m6070(size3);
                                }
                            }
                            int size4 = list2.size();
                            while (true) {
                                size4--;
                                if (size4 < 0) {
                                    break;
                                }
                                InterfaceC23920 interfaceC23920 = (AbstractC9476) list2.get(size4);
                                if ((interfaceC23920.mo6217() != EnumC3167.f5912 ? false : ((InterfaceC22991) ((InterfaceC12777) interfaceC23920).getReference()).getType().equals("[B")) && !C6712.m15315(c16769, ((InterfaceC4059) interfaceC23920).mo4189(), size4 + 1)) {
                                    c3423.m6070(size4);
                                }
                            }
                            int i10 = 1;
                            while (i10 < list2.size()) {
                                AbstractC9476 abstractC94712 = (AbstractC9476) list2.get(i10);
                                if (!C6712.m15313(abstractC94712, set)) {
                                    if (C6712.m15314(abstractC94712)) {
                                        AbstractC9476 abstractC94713 = (AbstractC9476) list2.get(i10 - 1);
                                        if (C6712.m15314(abstractC94713) && ((InterfaceC4059) abstractC94712).mo4189() == ((InterfaceC24846) abstractC94713).mo9978() && ((InterfaceC24846) abstractC94712).mo9978() == ((InterfaceC4059) abstractC94713).mo4189()) {
                                            c3423.m6070(i10);
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
                                AbstractC9476 abstractC94714 = (AbstractC9476) list2.get(size5);
                                if (C6712.m15314(abstractC94714) && !C6712.m15315(c16769, ((InterfaceC4059) abstractC94714).mo4189(), size5 + 1)) {
                                    c3423.m6070(size5);
                                }
                            }
                            int size6 = list2.size();
                            while (true) {
                                size6--;
                                if (size6 < 0) {
                                    break;
                                }
                                InterfaceC23920 interfaceC23921 = (AbstractC9476) list2.get(size6);
                                EnumC3167 enumC3167Mo6217 = interfaceC23921.mo6217();
                                if (enumC3167Mo6217 != EnumC3167.f6018 && enumC3167Mo6217 != EnumC3167.f5978 && enumC3167Mo6217 != EnumC3167.f6010 && enumC3167Mo6217 != EnumC3167.f5887) {
                                    EnumC3167 enumC3167Mo6218 = interfaceC23921.mo6217();
                                    if (enumC3167Mo6218 == EnumC3167.f5911 || enumC3167Mo6218 == EnumC3167.f5994) {
                                    }
                                }
                                if (!C6712.m15315(c16769, ((InterfaceC4059) interfaceC23921).mo4189(), size6 + 1)) {
                                    c3423.m6070(size6);
                                }
                            }
                            int i11 = 0;
                            while (i11 < list2.size()) {
                                AbstractC9476 abstractC94715 = (AbstractC9476) list2.get(i11);
                                if (abstractC94715.mo6217() == EnumC3167.f5951 && ((AbstractCollection) abstractC94715.m22075().m39880()).isEmpty()) {
                                    c3423.m6070(i11);
                                    i11--;
                                }
                                i11++;
                            }
                            int size7 = list2.size();
                            while (true) {
                                size7--;
                                if (size7 < 0 || ((AbstractC9476) list2.get(size7)).mo6217() != EnumC3167.f5839) {
                                    break;
                                }
                                c3423.m6070(size7);
                            }
                            c3349.m5851(c3422);
                            z6 = true;
                        } else {
                            z6 = z7;
                        }
                    }
                    z4 = false;
                    abstractC18093 = abstractC18091;
                    c20768 = c20766;
                    size = i;
                    it4 = it;
                    i4 = i2;
                    listMo5822 = list;
                    i5 = i3;
                    z5 = z;
                    interfaceC7385 = interfaceC7383;
                    it5 = it2;
                    c2994 = c2993;
                }
                List list3 = listMo5822;
                C20765 c207610 = c20768;
                int i12 = size;
                Iterator it7 = it4;
                int i13 = i4;
                boolean z10 = z5;
                int i14 = i5;
                C2993 c2995 = c2994;
                AbstractC18091 abstractC18094 = abstractC18093;
                if (z6) {
                    c18762.f56061.add(c2995.getType());
                    z5 = true;
                } else {
                    z5 = z10;
                }
                z4 = false;
                abstractC18093 = abstractC18094;
                c20768 = c207610;
                size = i12;
                it4 = it7;
                i4 = i13;
                listMo5822 = list3;
                i5 = i14;
            }
        }
        return z5;
    }

    /* JADX INFO: renamed from: ֫ */
    public int mo26336(C15603 c15603) {
        if (c15603 == null) {
            throw new NullPointerException("matchMoveObjectResult = false");
        }
        return c15603.m35479();
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
    public String mo5821(C3349 c3349, C16769 c16769, C24321 c24321, int i) throws C5351 {
        byte b;
        String str;
        boolean z;
        int i2;
        int i3;
        short[] sArrM22294;
        int length;
        int i4;
        int i5;
        C17441 c17441;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        AbstractC18091 abstractC18091 = this;
        abstractC18091.f54008 = null;
        ArrayList arrayList5 = abstractC18091.f54007;
        arrayList5.clear();
        ArrayList arrayList6 = abstractC18091.f54009;
        arrayList6.clear();
        ArrayList arrayList7 = abstractC18091.f54012;
        arrayList7.clear();
        ArrayList arrayList8 = abstractC18091.f54011;
        arrayList8.clear();
        ArrayList arrayList9 = abstractC18091.f54010;
        arrayList9.clear();
        InterfaceC7568 interfaceC7568M53681 = c24321.m53681();
        List listMo5852 = interfaceC7568M53681.mo5852();
        C17441 c17442 = new C17441();
        InterfaceC8705 interfaceC8705M53680 = c24321.m53680();
        int i6 = 0;
        while (true) {
            int size = listMo5852.size();
            String str2 = "I";
            InterfaceC7568 interfaceC7568 = interfaceC7568M53681;
            C17441 c17443 = c17442;
            ArrayList arrayList10 = arrayList6;
            String str3 = "C";
            ArrayList arrayList11 = arrayList8;
            String str4 = "B";
            ArrayList arrayList12 = arrayList9;
            ArrayList arrayList13 = arrayList7;
            ArrayList arrayList14 = arrayList5;
            C18762 c18762 = abstractC18091.f79251;
            if (i6 < size) {
                String strMo17051 = abstractC18091.mo17051(i6, ((CharSequence) listMo5852.get(i6)).toString());
                strMo17051.getClass();
                switch (strMo17051) {
                    case "B":
                    case "C":
                    case "F":
                    case "I":
                    case "S":
                    case "Z":
                        c17441 = c17443;
                        arrayList = arrayList10;
                        arrayList2 = arrayList11;
                        arrayList9 = arrayList12;
                        arrayList3 = arrayList13;
                        arrayList4 = arrayList14;
                        c17441.add(interfaceC8705M53680.nextInt());
                        break;
                    case "D":
                    case "J":
                        arrayList = arrayList10;
                        arrayList2 = arrayList11;
                        arrayList9 = arrayList12;
                        arrayList3 = arrayList13;
                        arrayList4 = arrayList14;
                        c17441 = c17443;
                        c17441.add(interfaceC8705M53680.nextInt());
                        c17441.add(interfaceC8705M53680.nextInt());
                        break;
                    case "[B":
                        arrayList2 = arrayList11;
                        arrayList9 = arrayList12;
                        arrayList3 = arrayList13;
                        arrayList4 = arrayList14;
                        C6887 c6887 = new C6887(c18762);
                        if (!c6887.m15782(c16769, i, interfaceC8705M53680.nextInt())) {
                            C12826.toString(c3349);
                            return null;
                        }
                        arrayList = arrayList10;
                        arrayList.add(c6887);
                        c17441 = c17443;
                        break;
                        break;
                    case "[C":
                        arrayList9 = arrayList12;
                        arrayList3 = arrayList13;
                        arrayList4 = arrayList14;
                        C5546 c5546 = new C5546(c18762);
                        if (!c5546.m12240(c16769, i, interfaceC8705M53680.nextInt())) {
                            C12826.toString(c3349);
                            return null;
                        }
                        arrayList2 = arrayList11;
                        arrayList2.add(c5546);
                        c17441 = c17443;
                        arrayList = arrayList10;
                        break;
                        break;
                    case "[I":
                        arrayList3 = arrayList13;
                        arrayList4 = arrayList14;
                        C14933 c14933 = new C14933(c18762);
                        if (!c14933.m34154(c16769, i, interfaceC8705M53680.nextInt())) {
                            C12826.toString(c3349);
                            return null;
                        }
                        arrayList9 = arrayList12;
                        arrayList9.add(c14933);
                        c17441 = c17443;
                        arrayList = arrayList10;
                        arrayList2 = arrayList11;
                        break;
                        break;
                    case "[S":
                        arrayList4 = arrayList14;
                        C9569 c9569 = new C9569(c18762);
                        if (!c9569.m22293(c16769, i, interfaceC8705M53680.nextInt())) {
                            C12826.toString(c3349);
                            return null;
                        }
                        arrayList3 = arrayList13;
                        arrayList3.add(c9569);
                        c17441 = c17443;
                        arrayList = arrayList10;
                        arrayList2 = arrayList11;
                        arrayList9 = arrayList12;
                        break;
                        break;
                    case "Ljava/lang/String;":
                        C3833 c3833 = new C3833(c18762);
                        if (!c3833.m7514(c16769, i, interfaceC8705M53680.nextInt())) {
                            C12826.toString(c3349);
                            return null;
                        }
                        arrayList4 = arrayList14;
                        arrayList4.add(c3833);
                        c17441 = c17443;
                        arrayList = arrayList10;
                        arrayList2 = arrayList11;
                        arrayList9 = arrayList12;
                        arrayList3 = arrayList13;
                        break;
                        break;
                    default:
                        throw new RuntimeException("Unsupported parameter type: ".concat(strMo17051));
                }
                i6++;
                c17442 = c17441;
                arrayList6 = arrayList;
                arrayList5 = arrayList4;
                arrayList7 = arrayList3;
                arrayList8 = arrayList2;
                interfaceC7568M53681 = interfaceC7568;
            } else {
                if (!c17443.isEmpty()) {
                    C12252 c12252 = new C12252();
                    abstractC18091.f54008 = c12252;
                    if (!c12252.m28259(c16769, i, c17443.mo5873())) {
                        C12826.toString(c3349);
                        return null;
                    }
                }
                C12252 c12253 = abstractC18091.f54008;
                Object[] objArrM28260 = c12253 == null ? new Object[0] : c12253.m28260(c18762);
                String strM54478 = AbstractC24797.m54478(interfaceC7568.mo5853());
                String name = interfaceC7568.getName();
                C11996 c11996 = new C11996();
                c11996.m27443((CharSequence) strM54478);
                c11996.m27443((CharSequence) name);
                c11996.writeByte(listMo5852.size());
                InterfaceC8705 interfaceC8705M53681 = c24321.m53680();
                Iterator it = arrayList14.iterator();
                Iterator it2 = arrayList10.iterator();
                Iterator it3 = arrayList13.iterator();
                Iterator it4 = arrayList11.iterator();
                Iterator it5 = arrayList12.iterator();
                Object[] objArr = objArrM28260;
                int i7 = 0;
                while (i7 < listMo5852.size()) {
                    String string = ((CharSequence) listMo5852.get(i7)).toString();
                    List list = listMo5852;
                    String strMo17052 = abstractC18091.mo17051(i7, string);
                    int iNextInt = interfaceC8705M53681.nextInt();
                    strMo17052.getClass();
                    switch (strMo17052.hashCode()) {
                        case 66:
                            str4 = str4;
                            b = !strMo17052.equals(str4) ? (byte) -1 : (byte) 0;
                            switch (b) {
                                case 0:
                                    str = str2;
                                    c11996.writeByte(0);
                                    c11996.writeInt(((Number) objArr[iNextInt]).byteValue());
                                    break;
                                case 1:
                                    str = str2;
                                    c11996.writeByte(2);
                                    c11996.mo15109((char) ((Number) objArr[iNextInt]).shortValue());
                                    break;
                                case 2:
                                    str = str2;
                                    int iNextInt2 = interfaceC8705M53681.nextInt();
                                    c11996.writeByte(6);
                                    c11996.writeInt(((Number) objArr[iNextInt]).intValue());
                                    c11996.writeInt(((Number) objArr[iNextInt2]).intValue());
                                    break;
                                case 3:
                                    str = str2;
                                    c11996.writeByte(5);
                                    c11996.writeInt(((Number) objArr[iNextInt]).intValue());
                                    break;
                                case 4:
                                    str = str2;
                                    c11996.writeByte(3);
                                    c11996.writeInt(((Number) objArr[iNextInt]).intValue());
                                    break;
                                case 5:
                                    str = str2;
                                    int iNextInt3 = interfaceC8705M53681.nextInt();
                                    c11996.writeByte(4);
                                    c11996.writeInt(((Number) objArr[iNextInt]).intValue());
                                    c11996.writeInt(((Number) objArr[iNextInt3]).intValue());
                                    break;
                                case 6:
                                    str = str2;
                                    c11996.writeByte(1);
                                    c11996.writeInt(((Number) objArr[iNextInt]).shortValue());
                                    break;
                                case 7:
                                    str = str2;
                                    c11996.writeByte(7);
                                    if (((Number) objArr[iNextInt]).intValue() != 0) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    c11996.m27445(z);
                                    break;
                                case 8:
                                    str = str2;
                                    if (string.equals("[B")) {
                                        i2 = 10;
                                    } else {
                                        i2 = 11;
                                    }
                                    c11996.writeByte(i2);
                                    c11996.m27454(((C6887) it2.next()).m15783());
                                    break;
                                case 9:
                                    str = str2;
                                    c11996.writeByte(13);
                                    char[] cArrM12241 = ((C5546) it4.next()).m12241();
                                    c11996.writeInt(cArrM12241.length);
                                    for (char c : cArrM12241) {
                                        c11996.mo15109(c);
                                    }
                                    break;
                                case 10:
                                    str = str2;
                                    c11996.writeByte(14);
                                    c11996.m27455(((C14933) it5.next()).m34155());
                                    break;
                                case 11:
                                    c11996.writeByte(12);
                                    sArrM22294 = ((C9569) it3.next()).m22294();
                                    c11996.writeInt(sArrM22294.length);
                                    length = sArrM22294.length;
                                    i4 = 0;
                                    while (true) {
                                        str = str2;
                                        if (i4 < length) {
                                            c11996.mo15111(sArrM22294[i4]);
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
                                    c11996.writeByte(i5);
                                    c11996.m27443((CharSequence) ((C3833) it.next()).m7512());
                                    str = str2;
                                    break;
                                default:
                                    throw new RuntimeException("Unsupported type: ".concat(strMo17052));
                            }
                            i7++;
                            abstractC18091 = this;
                            listMo5852 = list;
                            str2 = str;
                            break;
                        case 67:
                            String str5 = str3;
                            if (strMo17052.equals(str5)) {
                                b = 1;
                                str3 = str5;
                            } else {
                                str3 = str5;
                                str4 = str4;
                                switch (b) {
                                    case 0:
                                        str = str2;
                                        c11996.writeByte(0);
                                        c11996.writeInt(((Number) objArr[iNextInt]).byteValue());
                                        break;
                                    case 1:
                                        str = str2;
                                        c11996.writeByte(2);
                                        c11996.mo15109((char) ((Number) objArr[iNextInt]).shortValue());
                                        break;
                                    case 2:
                                        str = str2;
                                        int iNextInt4 = interfaceC8705M53681.nextInt();
                                        c11996.writeByte(6);
                                        c11996.writeInt(((Number) objArr[iNextInt]).intValue());
                                        c11996.writeInt(((Number) objArr[iNextInt4]).intValue());
                                        break;
                                    case 3:
                                        str = str2;
                                        c11996.writeByte(5);
                                        c11996.writeInt(((Number) objArr[iNextInt]).intValue());
                                        break;
                                    case 4:
                                        str = str2;
                                        c11996.writeByte(3);
                                        c11996.writeInt(((Number) objArr[iNextInt]).intValue());
                                        break;
                                    case 5:
                                        str = str2;
                                        int iNextInt5 = interfaceC8705M53681.nextInt();
                                        c11996.writeByte(4);
                                        c11996.writeInt(((Number) objArr[iNextInt]).intValue());
                                        c11996.writeInt(((Number) objArr[iNextInt5]).intValue());
                                        break;
                                    case 6:
                                        str = str2;
                                        c11996.writeByte(1);
                                        c11996.writeInt(((Number) objArr[iNextInt]).shortValue());
                                        break;
                                    case 7:
                                        str = str2;
                                        c11996.writeByte(7);
                                        if (((Number) objArr[iNextInt]).intValue() != 0) {
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                        c11996.m27445(z);
                                        break;
                                    case 8:
                                        str = str2;
                                        if (string.equals("[B")) {
                                            i2 = 10;
                                        } else {
                                            i2 = 11;
                                        }
                                        c11996.writeByte(i2);
                                        c11996.m27454(((C6887) it2.next()).m15783());
                                        break;
                                    case 9:
                                        str = str2;
                                        c11996.writeByte(13);
                                        char[] cArrM12242 = ((C5546) it4.next()).m12241();
                                        c11996.writeInt(cArrM12242.length);
                                        while (i3 < r1) {
                                            c11996.mo15109(c);
                                        }
                                        break;
                                    case 10:
                                        str = str2;
                                        c11996.writeByte(14);
                                        c11996.m27455(((C14933) it5.next()).m34155());
                                        break;
                                    case 11:
                                        c11996.writeByte(12);
                                        sArrM22294 = ((C9569) it3.next()).m22294();
                                        c11996.writeInt(sArrM22294.length);
                                        length = sArrM22294.length;
                                        i4 = 0;
                                        while (true) {
                                            str = str2;
                                            if (i4 < length) {
                                                c11996.mo15111(sArrM22294[i4]);
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
                                        c11996.writeByte(i5);
                                        c11996.m27443((CharSequence) ((C3833) it.next()).m7512());
                                        str = str2;
                                        break;
                                    default:
                                        throw new RuntimeException("Unsupported type: ".concat(strMo17052));
                                }
                                i7++;
                                abstractC18091 = this;
                                listMo5852 = list;
                                str2 = str;
                            }
                            break;
                        case 68:
                            if (strMo17052.equals("D")) {
                                b = 2;
                            }
                            str4 = str4;
                            switch (b) {
                                case 0:
                                    str = str2;
                                    c11996.writeByte(0);
                                    c11996.writeInt(((Number) objArr[iNextInt]).byteValue());
                                    break;
                                case 1:
                                    str = str2;
                                    c11996.writeByte(2);
                                    c11996.mo15109((char) ((Number) objArr[iNextInt]).shortValue());
                                    break;
                                case 2:
                                    str = str2;
                                    int iNextInt6 = interfaceC8705M53681.nextInt();
                                    c11996.writeByte(6);
                                    c11996.writeInt(((Number) objArr[iNextInt]).intValue());
                                    c11996.writeInt(((Number) objArr[iNextInt6]).intValue());
                                    break;
                                case 3:
                                    str = str2;
                                    c11996.writeByte(5);
                                    c11996.writeInt(((Number) objArr[iNextInt]).intValue());
                                    break;
                                case 4:
                                    str = str2;
                                    c11996.writeByte(3);
                                    c11996.writeInt(((Number) objArr[iNextInt]).intValue());
                                    break;
                                case 5:
                                    str = str2;
                                    int iNextInt7 = interfaceC8705M53681.nextInt();
                                    c11996.writeByte(4);
                                    c11996.writeInt(((Number) objArr[iNextInt]).intValue());
                                    c11996.writeInt(((Number) objArr[iNextInt7]).intValue());
                                    break;
                                case 6:
                                    str = str2;
                                    c11996.writeByte(1);
                                    c11996.writeInt(((Number) objArr[iNextInt]).shortValue());
                                    break;
                                case 7:
                                    str = str2;
                                    c11996.writeByte(7);
                                    if (((Number) objArr[iNextInt]).intValue() != 0) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    c11996.m27445(z);
                                    break;
                                case 8:
                                    str = str2;
                                    if (string.equals("[B")) {
                                        i2 = 10;
                                    } else {
                                        i2 = 11;
                                    }
                                    c11996.writeByte(i2);
                                    c11996.m27454(((C6887) it2.next()).m15783());
                                    break;
                                case 9:
                                    str = str2;
                                    c11996.writeByte(13);
                                    char[] cArrM12243 = ((C5546) it4.next()).m12241();
                                    c11996.writeInt(cArrM12243.length);
                                    while (i3 < r1) {
                                        c11996.mo15109(c);
                                    }
                                    break;
                                case 10:
                                    str = str2;
                                    c11996.writeByte(14);
                                    c11996.m27455(((C14933) it5.next()).m34155());
                                    break;
                                case 11:
                                    c11996.writeByte(12);
                                    sArrM22294 = ((C9569) it3.next()).m22294();
                                    c11996.writeInt(sArrM22294.length);
                                    length = sArrM22294.length;
                                    i4 = 0;
                                    while (true) {
                                        str = str2;
                                        if (i4 < length) {
                                            c11996.mo15111(sArrM22294[i4]);
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
                                    c11996.writeByte(i5);
                                    c11996.m27443((CharSequence) ((C3833) it.next()).m7512());
                                    str = str2;
                                    break;
                                default:
                                    throw new RuntimeException("Unsupported type: ".concat(strMo17052));
                            }
                            i7++;
                            abstractC18091 = this;
                            listMo5852 = list;
                            str2 = str;
                            break;
                        case 70:
                            if (strMo17052.equals("F")) {
                                b = 3;
                            }
                            str4 = str4;
                            switch (b) {
                                case 0:
                                    str = str2;
                                    c11996.writeByte(0);
                                    c11996.writeInt(((Number) objArr[iNextInt]).byteValue());
                                    break;
                                case 1:
                                    str = str2;
                                    c11996.writeByte(2);
                                    c11996.mo15109((char) ((Number) objArr[iNextInt]).shortValue());
                                    break;
                                case 2:
                                    str = str2;
                                    int iNextInt8 = interfaceC8705M53681.nextInt();
                                    c11996.writeByte(6);
                                    c11996.writeInt(((Number) objArr[iNextInt]).intValue());
                                    c11996.writeInt(((Number) objArr[iNextInt8]).intValue());
                                    break;
                                case 3:
                                    str = str2;
                                    c11996.writeByte(5);
                                    c11996.writeInt(((Number) objArr[iNextInt]).intValue());
                                    break;
                                case 4:
                                    str = str2;
                                    c11996.writeByte(3);
                                    c11996.writeInt(((Number) objArr[iNextInt]).intValue());
                                    break;
                                case 5:
                                    str = str2;
                                    int iNextInt9 = interfaceC8705M53681.nextInt();
                                    c11996.writeByte(4);
                                    c11996.writeInt(((Number) objArr[iNextInt]).intValue());
                                    c11996.writeInt(((Number) objArr[iNextInt9]).intValue());
                                    break;
                                case 6:
                                    str = str2;
                                    c11996.writeByte(1);
                                    c11996.writeInt(((Number) objArr[iNextInt]).shortValue());
                                    break;
                                case 7:
                                    str = str2;
                                    c11996.writeByte(7);
                                    if (((Number) objArr[iNextInt]).intValue() != 0) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    c11996.m27445(z);
                                    break;
                                case 8:
                                    str = str2;
                                    if (string.equals("[B")) {
                                        i2 = 10;
                                    } else {
                                        i2 = 11;
                                    }
                                    c11996.writeByte(i2);
                                    c11996.m27454(((C6887) it2.next()).m15783());
                                    break;
                                case 9:
                                    str = str2;
                                    c11996.writeByte(13);
                                    char[] cArrM12244 = ((C5546) it4.next()).m12241();
                                    c11996.writeInt(cArrM12244.length);
                                    while (i3 < r1) {
                                        c11996.mo15109(c);
                                    }
                                    break;
                                case 10:
                                    str = str2;
                                    c11996.writeByte(14);
                                    c11996.m27455(((C14933) it5.next()).m34155());
                                    break;
                                case 11:
                                    c11996.writeByte(12);
                                    sArrM22294 = ((C9569) it3.next()).m22294();
                                    c11996.writeInt(sArrM22294.length);
                                    length = sArrM22294.length;
                                    i4 = 0;
                                    while (true) {
                                        str = str2;
                                        if (i4 < length) {
                                            c11996.mo15111(sArrM22294[i4]);
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
                                    c11996.writeByte(i5);
                                    c11996.m27443((CharSequence) ((C3833) it.next()).m7512());
                                    str = str2;
                                    break;
                                default:
                                    throw new RuntimeException("Unsupported type: ".concat(strMo17052));
                            }
                            i7++;
                            abstractC18091 = this;
                            listMo5852 = list;
                            str2 = str;
                            break;
                        case 73:
                            if (strMo17052.equals(str2)) {
                                b = 4;
                            }
                            str4 = str4;
                            switch (b) {
                                case 0:
                                    str = str2;
                                    c11996.writeByte(0);
                                    c11996.writeInt(((Number) objArr[iNextInt]).byteValue());
                                    break;
                                case 1:
                                    str = str2;
                                    c11996.writeByte(2);
                                    c11996.mo15109((char) ((Number) objArr[iNextInt]).shortValue());
                                    break;
                                case 2:
                                    str = str2;
                                    int iNextInt10 = interfaceC8705M53681.nextInt();
                                    c11996.writeByte(6);
                                    c11996.writeInt(((Number) objArr[iNextInt]).intValue());
                                    c11996.writeInt(((Number) objArr[iNextInt10]).intValue());
                                    break;
                                case 3:
                                    str = str2;
                                    c11996.writeByte(5);
                                    c11996.writeInt(((Number) objArr[iNextInt]).intValue());
                                    break;
                                case 4:
                                    str = str2;
                                    c11996.writeByte(3);
                                    c11996.writeInt(((Number) objArr[iNextInt]).intValue());
                                    break;
                                case 5:
                                    str = str2;
                                    int iNextInt11 = interfaceC8705M53681.nextInt();
                                    c11996.writeByte(4);
                                    c11996.writeInt(((Number) objArr[iNextInt]).intValue());
                                    c11996.writeInt(((Number) objArr[iNextInt11]).intValue());
                                    break;
                                case 6:
                                    str = str2;
                                    c11996.writeByte(1);
                                    c11996.writeInt(((Number) objArr[iNextInt]).shortValue());
                                    break;
                                case 7:
                                    str = str2;
                                    c11996.writeByte(7);
                                    if (((Number) objArr[iNextInt]).intValue() != 0) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    c11996.m27445(z);
                                    break;
                                case 8:
                                    str = str2;
                                    if (string.equals("[B")) {
                                        i2 = 10;
                                    } else {
                                        i2 = 11;
                                    }
                                    c11996.writeByte(i2);
                                    c11996.m27454(((C6887) it2.next()).m15783());
                                    break;
                                case 9:
                                    str = str2;
                                    c11996.writeByte(13);
                                    char[] cArrM12245 = ((C5546) it4.next()).m12241();
                                    c11996.writeInt(cArrM12245.length);
                                    while (i3 < r1) {
                                        c11996.mo15109(c);
                                    }
                                    break;
                                case 10:
                                    str = str2;
                                    c11996.writeByte(14);
                                    c11996.m27455(((C14933) it5.next()).m34155());
                                    break;
                                case 11:
                                    c11996.writeByte(12);
                                    sArrM22294 = ((C9569) it3.next()).m22294();
                                    c11996.writeInt(sArrM22294.length);
                                    length = sArrM22294.length;
                                    i4 = 0;
                                    while (true) {
                                        str = str2;
                                        if (i4 < length) {
                                            c11996.mo15111(sArrM22294[i4]);
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
                                    c11996.writeByte(i5);
                                    c11996.m27443((CharSequence) ((C3833) it.next()).m7512());
                                    str = str2;
                                    break;
                                default:
                                    throw new RuntimeException("Unsupported type: ".concat(strMo17052));
                            }
                            i7++;
                            abstractC18091 = this;
                            listMo5852 = list;
                            str2 = str;
                            break;
                        case 74:
                            if (strMo17052.equals("J")) {
                                b = 5;
                            }
                            str4 = str4;
                            switch (b) {
                                case 0:
                                    str = str2;
                                    c11996.writeByte(0);
                                    c11996.writeInt(((Number) objArr[iNextInt]).byteValue());
                                    break;
                                case 1:
                                    str = str2;
                                    c11996.writeByte(2);
                                    c11996.mo15109((char) ((Number) objArr[iNextInt]).shortValue());
                                    break;
                                case 2:
                                    str = str2;
                                    int iNextInt12 = interfaceC8705M53681.nextInt();
                                    c11996.writeByte(6);
                                    c11996.writeInt(((Number) objArr[iNextInt]).intValue());
                                    c11996.writeInt(((Number) objArr[iNextInt12]).intValue());
                                    break;
                                case 3:
                                    str = str2;
                                    c11996.writeByte(5);
                                    c11996.writeInt(((Number) objArr[iNextInt]).intValue());
                                    break;
                                case 4:
                                    str = str2;
                                    c11996.writeByte(3);
                                    c11996.writeInt(((Number) objArr[iNextInt]).intValue());
                                    break;
                                case 5:
                                    str = str2;
                                    int iNextInt13 = interfaceC8705M53681.nextInt();
                                    c11996.writeByte(4);
                                    c11996.writeInt(((Number) objArr[iNextInt]).intValue());
                                    c11996.writeInt(((Number) objArr[iNextInt13]).intValue());
                                    break;
                                case 6:
                                    str = str2;
                                    c11996.writeByte(1);
                                    c11996.writeInt(((Number) objArr[iNextInt]).shortValue());
                                    break;
                                case 7:
                                    str = str2;
                                    c11996.writeByte(7);
                                    if (((Number) objArr[iNextInt]).intValue() != 0) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    c11996.m27445(z);
                                    break;
                                case 8:
                                    str = str2;
                                    if (string.equals("[B")) {
                                        i2 = 10;
                                    } else {
                                        i2 = 11;
                                    }
                                    c11996.writeByte(i2);
                                    c11996.m27454(((C6887) it2.next()).m15783());
                                    break;
                                case 9:
                                    str = str2;
                                    c11996.writeByte(13);
                                    char[] cArrM12246 = ((C5546) it4.next()).m12241();
                                    c11996.writeInt(cArrM12246.length);
                                    while (i3 < r1) {
                                        c11996.mo15109(c);
                                    }
                                    break;
                                case 10:
                                    str = str2;
                                    c11996.writeByte(14);
                                    c11996.m27455(((C14933) it5.next()).m34155());
                                    break;
                                case 11:
                                    c11996.writeByte(12);
                                    sArrM22294 = ((C9569) it3.next()).m22294();
                                    c11996.writeInt(sArrM22294.length);
                                    length = sArrM22294.length;
                                    i4 = 0;
                                    while (true) {
                                        str = str2;
                                        if (i4 < length) {
                                            c11996.mo15111(sArrM22294[i4]);
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
                                    c11996.writeByte(i5);
                                    c11996.m27443((CharSequence) ((C3833) it.next()).m7512());
                                    str = str2;
                                    break;
                                default:
                                    throw new RuntimeException("Unsupported type: ".concat(strMo17052));
                            }
                            i7++;
                            abstractC18091 = this;
                            listMo5852 = list;
                            str2 = str;
                            break;
                        case BaseSlider.DEFAULT_LABEL_ANIMATION_ENTER_DURATION /* 83 */:
                            if (strMo17052.equals("S")) {
                                b = 6;
                            }
                            str4 = str4;
                            switch (b) {
                                case 0:
                                    str = str2;
                                    c11996.writeByte(0);
                                    c11996.writeInt(((Number) objArr[iNextInt]).byteValue());
                                    break;
                                case 1:
                                    str = str2;
                                    c11996.writeByte(2);
                                    c11996.mo15109((char) ((Number) objArr[iNextInt]).shortValue());
                                    break;
                                case 2:
                                    str = str2;
                                    int iNextInt14 = interfaceC8705M53681.nextInt();
                                    c11996.writeByte(6);
                                    c11996.writeInt(((Number) objArr[iNextInt]).intValue());
                                    c11996.writeInt(((Number) objArr[iNextInt14]).intValue());
                                    break;
                                case 3:
                                    str = str2;
                                    c11996.writeByte(5);
                                    c11996.writeInt(((Number) objArr[iNextInt]).intValue());
                                    break;
                                case 4:
                                    str = str2;
                                    c11996.writeByte(3);
                                    c11996.writeInt(((Number) objArr[iNextInt]).intValue());
                                    break;
                                case 5:
                                    str = str2;
                                    int iNextInt15 = interfaceC8705M53681.nextInt();
                                    c11996.writeByte(4);
                                    c11996.writeInt(((Number) objArr[iNextInt]).intValue());
                                    c11996.writeInt(((Number) objArr[iNextInt15]).intValue());
                                    break;
                                case 6:
                                    str = str2;
                                    c11996.writeByte(1);
                                    c11996.writeInt(((Number) objArr[iNextInt]).shortValue());
                                    break;
                                case 7:
                                    str = str2;
                                    c11996.writeByte(7);
                                    if (((Number) objArr[iNextInt]).intValue() != 0) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    c11996.m27445(z);
                                    break;
                                case 8:
                                    str = str2;
                                    if (string.equals("[B")) {
                                        i2 = 10;
                                    } else {
                                        i2 = 11;
                                    }
                                    c11996.writeByte(i2);
                                    c11996.m27454(((C6887) it2.next()).m15783());
                                    break;
                                case 9:
                                    str = str2;
                                    c11996.writeByte(13);
                                    char[] cArrM12247 = ((C5546) it4.next()).m12241();
                                    c11996.writeInt(cArrM12247.length);
                                    while (i3 < r1) {
                                        c11996.mo15109(c);
                                    }
                                    break;
                                case 10:
                                    str = str2;
                                    c11996.writeByte(14);
                                    c11996.m27455(((C14933) it5.next()).m34155());
                                    break;
                                case 11:
                                    c11996.writeByte(12);
                                    sArrM22294 = ((C9569) it3.next()).m22294();
                                    c11996.writeInt(sArrM22294.length);
                                    length = sArrM22294.length;
                                    i4 = 0;
                                    while (true) {
                                        str = str2;
                                        if (i4 < length) {
                                            c11996.mo15111(sArrM22294[i4]);
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
                                    c11996.writeByte(i5);
                                    c11996.m27443((CharSequence) ((C3833) it.next()).m7512());
                                    str = str2;
                                    break;
                                default:
                                    throw new RuntimeException("Unsupported type: ".concat(strMo17052));
                            }
                            i7++;
                            abstractC18091 = this;
                            listMo5852 = list;
                            str2 = str;
                            break;
                        case 90:
                            if (strMo17052.equals("Z")) {
                                b = 7;
                            }
                            str4 = str4;
                            switch (b) {
                                case 0:
                                    str = str2;
                                    c11996.writeByte(0);
                                    c11996.writeInt(((Number) objArr[iNextInt]).byteValue());
                                    break;
                                case 1:
                                    str = str2;
                                    c11996.writeByte(2);
                                    c11996.mo15109((char) ((Number) objArr[iNextInt]).shortValue());
                                    break;
                                case 2:
                                    str = str2;
                                    int iNextInt16 = interfaceC8705M53681.nextInt();
                                    c11996.writeByte(6);
                                    c11996.writeInt(((Number) objArr[iNextInt]).intValue());
                                    c11996.writeInt(((Number) objArr[iNextInt16]).intValue());
                                    break;
                                case 3:
                                    str = str2;
                                    c11996.writeByte(5);
                                    c11996.writeInt(((Number) objArr[iNextInt]).intValue());
                                    break;
                                case 4:
                                    str = str2;
                                    c11996.writeByte(3);
                                    c11996.writeInt(((Number) objArr[iNextInt]).intValue());
                                    break;
                                case 5:
                                    str = str2;
                                    int iNextInt17 = interfaceC8705M53681.nextInt();
                                    c11996.writeByte(4);
                                    c11996.writeInt(((Number) objArr[iNextInt]).intValue());
                                    c11996.writeInt(((Number) objArr[iNextInt17]).intValue());
                                    break;
                                case 6:
                                    str = str2;
                                    c11996.writeByte(1);
                                    c11996.writeInt(((Number) objArr[iNextInt]).shortValue());
                                    break;
                                case 7:
                                    str = str2;
                                    c11996.writeByte(7);
                                    if (((Number) objArr[iNextInt]).intValue() != 0) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    c11996.m27445(z);
                                    break;
                                case 8:
                                    str = str2;
                                    if (string.equals("[B")) {
                                        i2 = 10;
                                    } else {
                                        i2 = 11;
                                    }
                                    c11996.writeByte(i2);
                                    c11996.m27454(((C6887) it2.next()).m15783());
                                    break;
                                case 9:
                                    str = str2;
                                    c11996.writeByte(13);
                                    char[] cArrM12248 = ((C5546) it4.next()).m12241();
                                    c11996.writeInt(cArrM12248.length);
                                    while (i3 < r1) {
                                        c11996.mo15109(c);
                                    }
                                    break;
                                case 10:
                                    str = str2;
                                    c11996.writeByte(14);
                                    c11996.m27455(((C14933) it5.next()).m34155());
                                    break;
                                case 11:
                                    c11996.writeByte(12);
                                    sArrM22294 = ((C9569) it3.next()).m22294();
                                    c11996.writeInt(sArrM22294.length);
                                    length = sArrM22294.length;
                                    i4 = 0;
                                    while (true) {
                                        str = str2;
                                        if (i4 < length) {
                                            c11996.mo15111(sArrM22294[i4]);
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
                                    c11996.writeByte(i5);
                                    c11996.m27443((CharSequence) ((C3833) it.next()).m7512());
                                    str = str2;
                                    break;
                                default:
                                    throw new RuntimeException("Unsupported type: ".concat(strMo17052));
                            }
                            i7++;
                            abstractC18091 = this;
                            listMo5852 = list;
                            str2 = str;
                            break;
                        case 2887:
                            if (strMo17052.equals("[B")) {
                                b = 8;
                            }
                            str4 = str4;
                            switch (b) {
                                case 0:
                                    str = str2;
                                    c11996.writeByte(0);
                                    c11996.writeInt(((Number) objArr[iNextInt]).byteValue());
                                    break;
                                case 1:
                                    str = str2;
                                    c11996.writeByte(2);
                                    c11996.mo15109((char) ((Number) objArr[iNextInt]).shortValue());
                                    break;
                                case 2:
                                    str = str2;
                                    int iNextInt18 = interfaceC8705M53681.nextInt();
                                    c11996.writeByte(6);
                                    c11996.writeInt(((Number) objArr[iNextInt]).intValue());
                                    c11996.writeInt(((Number) objArr[iNextInt18]).intValue());
                                    break;
                                case 3:
                                    str = str2;
                                    c11996.writeByte(5);
                                    c11996.writeInt(((Number) objArr[iNextInt]).intValue());
                                    break;
                                case 4:
                                    str = str2;
                                    c11996.writeByte(3);
                                    c11996.writeInt(((Number) objArr[iNextInt]).intValue());
                                    break;
                                case 5:
                                    str = str2;
                                    int iNextInt19 = interfaceC8705M53681.nextInt();
                                    c11996.writeByte(4);
                                    c11996.writeInt(((Number) objArr[iNextInt]).intValue());
                                    c11996.writeInt(((Number) objArr[iNextInt19]).intValue());
                                    break;
                                case 6:
                                    str = str2;
                                    c11996.writeByte(1);
                                    c11996.writeInt(((Number) objArr[iNextInt]).shortValue());
                                    break;
                                case 7:
                                    str = str2;
                                    c11996.writeByte(7);
                                    if (((Number) objArr[iNextInt]).intValue() != 0) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    c11996.m27445(z);
                                    break;
                                case 8:
                                    str = str2;
                                    if (string.equals("[B")) {
                                        i2 = 10;
                                    } else {
                                        i2 = 11;
                                    }
                                    c11996.writeByte(i2);
                                    c11996.m27454(((C6887) it2.next()).m15783());
                                    break;
                                case 9:
                                    str = str2;
                                    c11996.writeByte(13);
                                    char[] cArrM12249 = ((C5546) it4.next()).m12241();
                                    c11996.writeInt(cArrM12249.length);
                                    while (i3 < r1) {
                                        c11996.mo15109(c);
                                    }
                                    break;
                                case 10:
                                    str = str2;
                                    c11996.writeByte(14);
                                    c11996.m27455(((C14933) it5.next()).m34155());
                                    break;
                                case 11:
                                    c11996.writeByte(12);
                                    sArrM22294 = ((C9569) it3.next()).m22294();
                                    c11996.writeInt(sArrM22294.length);
                                    length = sArrM22294.length;
                                    i4 = 0;
                                    while (true) {
                                        str = str2;
                                        if (i4 < length) {
                                            c11996.mo15111(sArrM22294[i4]);
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
                                    c11996.writeByte(i5);
                                    c11996.m27443((CharSequence) ((C3833) it.next()).m7512());
                                    str = str2;
                                    break;
                                default:
                                    throw new RuntimeException("Unsupported type: ".concat(strMo17052));
                            }
                            i7++;
                            abstractC18091 = this;
                            listMo5852 = list;
                            str2 = str;
                            break;
                        case 2888:
                            if (strMo17052.equals("[C")) {
                                b = 9;
                            }
                            str4 = str4;
                            switch (b) {
                                case 0:
                                    str = str2;
                                    c11996.writeByte(0);
                                    c11996.writeInt(((Number) objArr[iNextInt]).byteValue());
                                    break;
                                case 1:
                                    str = str2;
                                    c11996.writeByte(2);
                                    c11996.mo15109((char) ((Number) objArr[iNextInt]).shortValue());
                                    break;
                                case 2:
                                    str = str2;
                                    int iNextInt110 = interfaceC8705M53681.nextInt();
                                    c11996.writeByte(6);
                                    c11996.writeInt(((Number) objArr[iNextInt]).intValue());
                                    c11996.writeInt(((Number) objArr[iNextInt110]).intValue());
                                    break;
                                case 3:
                                    str = str2;
                                    c11996.writeByte(5);
                                    c11996.writeInt(((Number) objArr[iNextInt]).intValue());
                                    break;
                                case 4:
                                    str = str2;
                                    c11996.writeByte(3);
                                    c11996.writeInt(((Number) objArr[iNextInt]).intValue());
                                    break;
                                case 5:
                                    str = str2;
                                    int iNextInt111 = interfaceC8705M53681.nextInt();
                                    c11996.writeByte(4);
                                    c11996.writeInt(((Number) objArr[iNextInt]).intValue());
                                    c11996.writeInt(((Number) objArr[iNextInt111]).intValue());
                                    break;
                                case 6:
                                    str = str2;
                                    c11996.writeByte(1);
                                    c11996.writeInt(((Number) objArr[iNextInt]).shortValue());
                                    break;
                                case 7:
                                    str = str2;
                                    c11996.writeByte(7);
                                    if (((Number) objArr[iNextInt]).intValue() != 0) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    c11996.m27445(z);
                                    break;
                                case 8:
                                    str = str2;
                                    if (string.equals("[B")) {
                                        i2 = 10;
                                    } else {
                                        i2 = 11;
                                    }
                                    c11996.writeByte(i2);
                                    c11996.m27454(((C6887) it2.next()).m15783());
                                    break;
                                case 9:
                                    str = str2;
                                    c11996.writeByte(13);
                                    char[] cArrM122410 = ((C5546) it4.next()).m12241();
                                    c11996.writeInt(cArrM122410.length);
                                    while (i3 < r1) {
                                        c11996.mo15109(c);
                                    }
                                    break;
                                case 10:
                                    str = str2;
                                    c11996.writeByte(14);
                                    c11996.m27455(((C14933) it5.next()).m34155());
                                    break;
                                case 11:
                                    c11996.writeByte(12);
                                    sArrM22294 = ((C9569) it3.next()).m22294();
                                    c11996.writeInt(sArrM22294.length);
                                    length = sArrM22294.length;
                                    i4 = 0;
                                    while (true) {
                                        str = str2;
                                        if (i4 < length) {
                                            c11996.mo15111(sArrM22294[i4]);
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
                                    c11996.writeByte(i5);
                                    c11996.m27443((CharSequence) ((C3833) it.next()).m7512());
                                    str = str2;
                                    break;
                                default:
                                    throw new RuntimeException("Unsupported type: ".concat(strMo17052));
                            }
                            i7++;
                            abstractC18091 = this;
                            listMo5852 = list;
                            str2 = str;
                            break;
                        case 2894:
                            if (strMo17052.equals("[I")) {
                                b = 10;
                            }
                            str4 = str4;
                            switch (b) {
                                case 0:
                                    str = str2;
                                    c11996.writeByte(0);
                                    c11996.writeInt(((Number) objArr[iNextInt]).byteValue());
                                    break;
                                case 1:
                                    str = str2;
                                    c11996.writeByte(2);
                                    c11996.mo15109((char) ((Number) objArr[iNextInt]).shortValue());
                                    break;
                                case 2:
                                    str = str2;
                                    int iNextInt112 = interfaceC8705M53681.nextInt();
                                    c11996.writeByte(6);
                                    c11996.writeInt(((Number) objArr[iNextInt]).intValue());
                                    c11996.writeInt(((Number) objArr[iNextInt112]).intValue());
                                    break;
                                case 3:
                                    str = str2;
                                    c11996.writeByte(5);
                                    c11996.writeInt(((Number) objArr[iNextInt]).intValue());
                                    break;
                                case 4:
                                    str = str2;
                                    c11996.writeByte(3);
                                    c11996.writeInt(((Number) objArr[iNextInt]).intValue());
                                    break;
                                case 5:
                                    str = str2;
                                    int iNextInt113 = interfaceC8705M53681.nextInt();
                                    c11996.writeByte(4);
                                    c11996.writeInt(((Number) objArr[iNextInt]).intValue());
                                    c11996.writeInt(((Number) objArr[iNextInt113]).intValue());
                                    break;
                                case 6:
                                    str = str2;
                                    c11996.writeByte(1);
                                    c11996.writeInt(((Number) objArr[iNextInt]).shortValue());
                                    break;
                                case 7:
                                    str = str2;
                                    c11996.writeByte(7);
                                    if (((Number) objArr[iNextInt]).intValue() != 0) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    c11996.m27445(z);
                                    break;
                                case 8:
                                    str = str2;
                                    if (string.equals("[B")) {
                                        i2 = 10;
                                    } else {
                                        i2 = 11;
                                    }
                                    c11996.writeByte(i2);
                                    c11996.m27454(((C6887) it2.next()).m15783());
                                    break;
                                case 9:
                                    str = str2;
                                    c11996.writeByte(13);
                                    char[] cArrM122411 = ((C5546) it4.next()).m12241();
                                    c11996.writeInt(cArrM122411.length);
                                    while (i3 < r1) {
                                        c11996.mo15109(c);
                                    }
                                    break;
                                case 10:
                                    str = str2;
                                    c11996.writeByte(14);
                                    c11996.m27455(((C14933) it5.next()).m34155());
                                    break;
                                case 11:
                                    c11996.writeByte(12);
                                    sArrM22294 = ((C9569) it3.next()).m22294();
                                    c11996.writeInt(sArrM22294.length);
                                    length = sArrM22294.length;
                                    i4 = 0;
                                    while (true) {
                                        str = str2;
                                        if (i4 < length) {
                                            c11996.mo15111(sArrM22294[i4]);
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
                                    c11996.writeByte(i5);
                                    c11996.m27443((CharSequence) ((C3833) it.next()).m7512());
                                    str = str2;
                                    break;
                                default:
                                    throw new RuntimeException("Unsupported type: ".concat(strMo17052));
                            }
                            i7++;
                            abstractC18091 = this;
                            listMo5852 = list;
                            str2 = str;
                            break;
                        case 2904:
                            if (strMo17052.equals("[S")) {
                                b = 11;
                            }
                            str4 = str4;
                            switch (b) {
                                case 0:
                                    str = str2;
                                    c11996.writeByte(0);
                                    c11996.writeInt(((Number) objArr[iNextInt]).byteValue());
                                    break;
                                case 1:
                                    str = str2;
                                    c11996.writeByte(2);
                                    c11996.mo15109((char) ((Number) objArr[iNextInt]).shortValue());
                                    break;
                                case 2:
                                    str = str2;
                                    int iNextInt114 = interfaceC8705M53681.nextInt();
                                    c11996.writeByte(6);
                                    c11996.writeInt(((Number) objArr[iNextInt]).intValue());
                                    c11996.writeInt(((Number) objArr[iNextInt114]).intValue());
                                    break;
                                case 3:
                                    str = str2;
                                    c11996.writeByte(5);
                                    c11996.writeInt(((Number) objArr[iNextInt]).intValue());
                                    break;
                                case 4:
                                    str = str2;
                                    c11996.writeByte(3);
                                    c11996.writeInt(((Number) objArr[iNextInt]).intValue());
                                    break;
                                case 5:
                                    str = str2;
                                    int iNextInt115 = interfaceC8705M53681.nextInt();
                                    c11996.writeByte(4);
                                    c11996.writeInt(((Number) objArr[iNextInt]).intValue());
                                    c11996.writeInt(((Number) objArr[iNextInt115]).intValue());
                                    break;
                                case 6:
                                    str = str2;
                                    c11996.writeByte(1);
                                    c11996.writeInt(((Number) objArr[iNextInt]).shortValue());
                                    break;
                                case 7:
                                    str = str2;
                                    c11996.writeByte(7);
                                    if (((Number) objArr[iNextInt]).intValue() != 0) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    c11996.m27445(z);
                                    break;
                                case 8:
                                    str = str2;
                                    if (string.equals("[B")) {
                                        i2 = 10;
                                    } else {
                                        i2 = 11;
                                    }
                                    c11996.writeByte(i2);
                                    c11996.m27454(((C6887) it2.next()).m15783());
                                    break;
                                case 9:
                                    str = str2;
                                    c11996.writeByte(13);
                                    char[] cArrM122412 = ((C5546) it4.next()).m12241();
                                    c11996.writeInt(cArrM122412.length);
                                    while (i3 < r1) {
                                        c11996.mo15109(c);
                                    }
                                    break;
                                case 10:
                                    str = str2;
                                    c11996.writeByte(14);
                                    c11996.m27455(((C14933) it5.next()).m34155());
                                    break;
                                case 11:
                                    c11996.writeByte(12);
                                    sArrM22294 = ((C9569) it3.next()).m22294();
                                    c11996.writeInt(sArrM22294.length);
                                    length = sArrM22294.length;
                                    i4 = 0;
                                    while (true) {
                                        str = str2;
                                        if (i4 < length) {
                                            c11996.mo15111(sArrM22294[i4]);
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
                                    c11996.writeByte(i5);
                                    c11996.m27443((CharSequence) ((C3833) it.next()).m7512());
                                    str = str2;
                                    break;
                                default:
                                    throw new RuntimeException("Unsupported type: ".concat(strMo17052));
                            }
                            i7++;
                            abstractC18091 = this;
                            listMo5852 = list;
                            str2 = str;
                            break;
                        case 1379658506:
                            if (strMo17052.equals("Ljava/lang/String;")) {
                                b = 12;
                            }
                            str4 = str4;
                            switch (b) {
                                case 0:
                                    str = str2;
                                    c11996.writeByte(0);
                                    c11996.writeInt(((Number) objArr[iNextInt]).byteValue());
                                    break;
                                case 1:
                                    str = str2;
                                    c11996.writeByte(2);
                                    c11996.mo15109((char) ((Number) objArr[iNextInt]).shortValue());
                                    break;
                                case 2:
                                    str = str2;
                                    int iNextInt116 = interfaceC8705M53681.nextInt();
                                    c11996.writeByte(6);
                                    c11996.writeInt(((Number) objArr[iNextInt]).intValue());
                                    c11996.writeInt(((Number) objArr[iNextInt116]).intValue());
                                    break;
                                case 3:
                                    str = str2;
                                    c11996.writeByte(5);
                                    c11996.writeInt(((Number) objArr[iNextInt]).intValue());
                                    break;
                                case 4:
                                    str = str2;
                                    c11996.writeByte(3);
                                    c11996.writeInt(((Number) objArr[iNextInt]).intValue());
                                    break;
                                case 5:
                                    str = str2;
                                    int iNextInt117 = interfaceC8705M53681.nextInt();
                                    c11996.writeByte(4);
                                    c11996.writeInt(((Number) objArr[iNextInt]).intValue());
                                    c11996.writeInt(((Number) objArr[iNextInt117]).intValue());
                                    break;
                                case 6:
                                    str = str2;
                                    c11996.writeByte(1);
                                    c11996.writeInt(((Number) objArr[iNextInt]).shortValue());
                                    break;
                                case 7:
                                    str = str2;
                                    c11996.writeByte(7);
                                    if (((Number) objArr[iNextInt]).intValue() != 0) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    c11996.m27445(z);
                                    break;
                                case 8:
                                    str = str2;
                                    if (string.equals("[B")) {
                                        i2 = 10;
                                    } else {
                                        i2 = 11;
                                    }
                                    c11996.writeByte(i2);
                                    c11996.m27454(((C6887) it2.next()).m15783());
                                    break;
                                case 9:
                                    str = str2;
                                    c11996.writeByte(13);
                                    char[] cArrM122413 = ((C5546) it4.next()).m12241();
                                    c11996.writeInt(cArrM122413.length);
                                    while (i3 < r1) {
                                        c11996.mo15109(c);
                                    }
                                    break;
                                case 10:
                                    str = str2;
                                    c11996.writeByte(14);
                                    c11996.m27455(((C14933) it5.next()).m34155());
                                    break;
                                case 11:
                                    c11996.writeByte(12);
                                    sArrM22294 = ((C9569) it3.next()).m22294();
                                    c11996.writeInt(sArrM22294.length);
                                    length = sArrM22294.length;
                                    i4 = 0;
                                    while (true) {
                                        str = str2;
                                        if (i4 < length) {
                                            c11996.mo15111(sArrM22294[i4]);
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
                                    c11996.writeByte(i5);
                                    c11996.m27443((CharSequence) ((C3833) it.next()).m7512());
                                    str = str2;
                                    break;
                                default:
                                    throw new RuntimeException("Unsupported type: ".concat(strMo17052));
                            }
                            i7++;
                            abstractC18091 = this;
                            listMo5852 = list;
                            str2 = str;
                            break;
                        default:
                            str4 = str4;
                            switch (b) {
                                case 0:
                                    str = str2;
                                    c11996.writeByte(0);
                                    c11996.writeInt(((Number) objArr[iNextInt]).byteValue());
                                    break;
                                case 1:
                                    str = str2;
                                    c11996.writeByte(2);
                                    c11996.mo15109((char) ((Number) objArr[iNextInt]).shortValue());
                                    break;
                                case 2:
                                    str = str2;
                                    int iNextInt118 = interfaceC8705M53681.nextInt();
                                    c11996.writeByte(6);
                                    c11996.writeInt(((Number) objArr[iNextInt]).intValue());
                                    c11996.writeInt(((Number) objArr[iNextInt118]).intValue());
                                    break;
                                case 3:
                                    str = str2;
                                    c11996.writeByte(5);
                                    c11996.writeInt(((Number) objArr[iNextInt]).intValue());
                                    break;
                                case 4:
                                    str = str2;
                                    c11996.writeByte(3);
                                    c11996.writeInt(((Number) objArr[iNextInt]).intValue());
                                    break;
                                case 5:
                                    str = str2;
                                    int iNextInt119 = interfaceC8705M53681.nextInt();
                                    c11996.writeByte(4);
                                    c11996.writeInt(((Number) objArr[iNextInt]).intValue());
                                    c11996.writeInt(((Number) objArr[iNextInt119]).intValue());
                                    break;
                                case 6:
                                    str = str2;
                                    c11996.writeByte(1);
                                    c11996.writeInt(((Number) objArr[iNextInt]).shortValue());
                                    break;
                                case 7:
                                    str = str2;
                                    c11996.writeByte(7);
                                    if (((Number) objArr[iNextInt]).intValue() != 0) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    c11996.m27445(z);
                                    break;
                                case 8:
                                    str = str2;
                                    if (string.equals("[B")) {
                                        i2 = 10;
                                    } else {
                                        i2 = 11;
                                    }
                                    c11996.writeByte(i2);
                                    c11996.m27454(((C6887) it2.next()).m15783());
                                    break;
                                case 9:
                                    str = str2;
                                    c11996.writeByte(13);
                                    char[] cArrM122414 = ((C5546) it4.next()).m12241();
                                    c11996.writeInt(cArrM122414.length);
                                    while (i3 < r1) {
                                        c11996.mo15109(c);
                                    }
                                    break;
                                case 10:
                                    str = str2;
                                    c11996.writeByte(14);
                                    c11996.m27455(((C14933) it5.next()).m34155());
                                    break;
                                case 11:
                                    c11996.writeByte(12);
                                    sArrM22294 = ((C9569) it3.next()).m22294();
                                    c11996.writeInt(sArrM22294.length);
                                    length = sArrM22294.length;
                                    i4 = 0;
                                    while (true) {
                                        str = str2;
                                        if (i4 < length) {
                                            c11996.mo15111(sArrM22294[i4]);
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
                                    c11996.writeByte(i5);
                                    c11996.m27443((CharSequence) ((C3833) it.next()).m7512());
                                    str = str2;
                                    break;
                                default:
                                    throw new RuntimeException("Unsupported type: ".concat(strMo17052));
                            }
                            i7++;
                            abstractC18091 = this;
                            listMo5852 = list;
                            str2 = str;
                            break;
                    }
                    str4 = str4;
                    switch (b) {
                        case 0:
                            str = str2;
                            c11996.writeByte(0);
                            c11996.writeInt(((Number) objArr[iNextInt]).byteValue());
                            break;
                        case 1:
                            str = str2;
                            c11996.writeByte(2);
                            c11996.mo15109((char) ((Number) objArr[iNextInt]).shortValue());
                            break;
                        case 2:
                            str = str2;
                            int iNextInt1110 = interfaceC8705M53681.nextInt();
                            c11996.writeByte(6);
                            c11996.writeInt(((Number) objArr[iNextInt]).intValue());
                            c11996.writeInt(((Number) objArr[iNextInt1110]).intValue());
                            break;
                        case 3:
                            str = str2;
                            c11996.writeByte(5);
                            c11996.writeInt(((Number) objArr[iNextInt]).intValue());
                            break;
                        case 4:
                            str = str2;
                            c11996.writeByte(3);
                            c11996.writeInt(((Number) objArr[iNextInt]).intValue());
                            break;
                        case 5:
                            str = str2;
                            int iNextInt1111 = interfaceC8705M53681.nextInt();
                            c11996.writeByte(4);
                            c11996.writeInt(((Number) objArr[iNextInt]).intValue());
                            c11996.writeInt(((Number) objArr[iNextInt1111]).intValue());
                            break;
                        case 6:
                            str = str2;
                            c11996.writeByte(1);
                            c11996.writeInt(((Number) objArr[iNextInt]).shortValue());
                            break;
                        case 7:
                            str = str2;
                            c11996.writeByte(7);
                            if (((Number) objArr[iNextInt]).intValue() != 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            c11996.m27445(z);
                            break;
                        case 8:
                            str = str2;
                            if (string.equals("[B")) {
                                i2 = 10;
                            } else {
                                i2 = 11;
                            }
                            c11996.writeByte(i2);
                            c11996.m27454(((C6887) it2.next()).m15783());
                            break;
                        case 9:
                            str = str2;
                            c11996.writeByte(13);
                            char[] cArrM122415 = ((C5546) it4.next()).m12241();
                            c11996.writeInt(cArrM122415.length);
                            while (i3 < r1) {
                                c11996.mo15109(c);
                            }
                            break;
                        case 10:
                            str = str2;
                            c11996.writeByte(14);
                            c11996.m27455(((C14933) it5.next()).m34155());
                            break;
                        case 11:
                            c11996.writeByte(12);
                            sArrM22294 = ((C9569) it3.next()).m22294();
                            c11996.writeInt(sArrM22294.length);
                            length = sArrM22294.length;
                            i4 = 0;
                            while (true) {
                                str = str2;
                                if (i4 < length) {
                                    c11996.mo15111(sArrM22294[i4]);
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
                            c11996.writeByte(i5);
                            c11996.m27443((CharSequence) ((C3833) it.next()).m7512());
                            str = str2;
                            break;
                        default:
                            throw new RuntimeException("Unsupported type: ".concat(strMo17052));
                    }
                    i7++;
                    abstractC18091 = this;
                    listMo5852 = list;
                    str2 = str;
                }
                String strM15269 = c18762.f56064.m15269(c11996.m27464());
                if (strM15269 == null) {
                    C12826.toString(c3349);
                }
                return strM15269;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo5823(C16769 c16769, C2688 c2688, C24321 c24321, C15603 c15603) {
        if (c15603 == null) {
            throw new NullPointerException("matchMoveObjectResult = false");
        }
        c16769.f49420.m6071(c24321.m53679(), c2688);
        c15603.m35480(c16769);
        C12252 c12252 = this.f54008;
        if (c12252 != null) {
            c12252.m28258(c16769);
        }
        Iterator it = this.f54007.iterator();
        while (it.hasNext()) {
            ((C3833) it.next()).m7513(c16769);
        }
        Iterator it2 = this.f54009.iterator();
        while (it2.hasNext()) {
            ((C6887) it2.next()).m15781(c16769);
        }
        Iterator it3 = this.f54012.iterator();
        while (it3.hasNext()) {
            ((C9569) it3.next()).m22292(c16769);
        }
        Iterator it4 = this.f54011.iterator();
        while (it4.hasNext()) {
            ((C5546) it4.next()).m12239(c16769);
        }
        Iterator it5 = this.f54010.iterator();
        while (it5.hasNext()) {
            ((C14933) it5.next()).m34153(c16769);
        }
    }
}
