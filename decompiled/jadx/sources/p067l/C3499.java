package p067l;

import com.google.android.material.motion.MotionUtils;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: l.֨ܶ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 04UF */
/* JADX INFO: loaded from: classes2.dex */
public final class C3499 {

    /* JADX INFO: renamed from: ֫ */
    public final ArrayList f7057;

    /* JADX INFO: renamed from: ۜ */
    public final C23616 f7058;

    /* JADX INFO: renamed from: ۡ */
    public final C24411 f7059;

    /* JADX INFO: renamed from: ۢ */
    public C16909 f7060;

    /* JADX INFO: renamed from: ۧ */
    public final C12659 f7061;

    /* JADX INFO: renamed from: ܳ */
    public final InterfaceC20568 f7062;

    /* JADX INFO: renamed from: ܽ */
    public final ArrayList f7063;

    /* JADX INFO: renamed from: ܿ */
    public final InterfaceC19897 f7064;

    /* JADX INFO: renamed from: ᩳ */
    public final C7523 f7065;

    /* JADX INFO: renamed from: ᩷ */
    public final C24411 f7066;

    /* JADX INFO: renamed from: ᩻ */
    public final AbstractC16192 f7067;

    /* JADX INFO: renamed from: ۖ */
    public static final C3429 f7054 = new C3429();

    /* JADX INFO: renamed from: ܺ */
    public static final C3429 f7056 = new C3429();

    /* JADX INFO: renamed from: ۘ */
    public static final C2582 f7055 = new C2582();

    /* JADX INFO: renamed from: ۧ */
    public final void m6260() {
        C24411 c24411 = this.f7066;
        C2582 c2582 = f7055;
        c2582.m3890(c24411);
        c2582.m3890(this.f7059);
        ArrayList<InterfaceC23920> arrayList = this.f7063;
        for (InterfaceC23920 interfaceC23920 : arrayList) {
            if (interfaceC23920 instanceof C4131) {
                C4131 c4131 = (C4131) interfaceC23920;
                c4131.f32111.m33474(c4131);
            } else if (interfaceC23920 instanceof C21825) {
                C21825 c21825 = (C21825) interfaceC23920;
                c21825.f32111.m33476(c21825);
            } else if (interfaceC23920 instanceof C5061) {
                C5061 c5061 = (C5061) interfaceC23920;
                c5061.f32111.m33475(c5061);
            }
        }
        ArrayList arrayList2 = this.f7057;
        C3429 c3429 = f7056;
        c3429.m6084(arrayList2);
        c3429.m6084(arrayList);
    }

    public C3499(C23616 c23616, InterfaceC19897 interfaceC19897, InterfaceC20568 interfaceC20568) {
        boolean z;
        int iMo6216;
        boolean z2;
        C7523 c7523 = new C7523();
        c7523.f19756 = new HashMap();
        this.f7065 = c7523;
        this.f7058 = c23616;
        this.f7064 = interfaceC19897;
        this.f7062 = interfaceC20568;
        try {
            C3429 c3429 = f7056;
            ArrayList arrayListM6085 = c3429.m6085();
            ArrayList arrayListM6086 = c3429.m6085();
            for (InterfaceC23920 interfaceC23920 : interfaceC20568.mo6074()) {
                arrayListM6085.add(interfaceC23920);
                arrayListM6086.add(interfaceC23920);
            }
            this.f7063 = arrayListM6085;
            this.f7057 = arrayListM6086;
            this.f7067 = AbstractC16192.copyOf((Collection) interfaceC19897.getParameters());
            C2582 c2582 = f7055;
            C24411 c24411 = (C24411) c2582.m3892();
            if (c24411 == null) {
                c24411 = new C24411();
            } else {
                c24411.m53843();
            }
            this.f7066 = c24411;
            C24411 c24412 = (C24411) c2582.m3892();
            if (c24412 == null) {
                c24412 = new C24411();
            } else {
                c24412.m53843();
            }
            this.f7059 = c24412;
            C12659 c12659 = new C12659(arrayListM6085);
            this.f7061 = c12659;
            int iM29117 = c12659.m29117(arrayListM6085.size() - 1) + ((InterfaceC23920) arrayListM6085.get(arrayListM6085.size() - 1)).mo6216();
            for (int i = 0; i < arrayListM6085.size(); i++) {
                InterfaceC23920 interfaceC23921 = (InterfaceC23920) arrayListM6085.get(i);
                EnumC3167 enumC3167Mo6217 = interfaceC23921.mo6217();
                if (enumC3167Mo6217 == EnumC3167.f6067) {
                    int iM29118 = this.f7061.m29117(i);
                    int iMo5147 = ((InterfaceC9168) interfaceC23921).mo5147() + iM29118;
                    try {
                        iMo5147 = m6255(iMo5147, EnumC3167.f6043);
                        z2 = true;
                    } catch (C2828 unused) {
                        z2 = false;
                    }
                    if (z2) {
                        if (this.f7066.m53842(iMo5147) != -1) {
                            InterfaceC23920 interfaceC23920M6259 = m6259(iMo5147, EnumC3167.f6043);
                            arrayListM6086.set(i, new C16994(enumC3167Mo6217, ((InterfaceC9423) interfaceC23921).mo4189(), iM29117 - iM29118));
                            arrayListM6086.add(interfaceC23920M6259);
                            iMo6216 = interfaceC23920M6259.mo6216() + iM29117;
                        } else {
                            iMo6216 = iM29117;
                            iM29117 = iMo5147;
                        }
                        this.f7066.m53844(iM29117, iM29118);
                        iM29117 = iMo6216;
                    }
                } else if (enumC3167Mo6217 == EnumC3167.f5975) {
                    int iM29119 = this.f7061.m29117(i);
                    int iMo5148 = ((InterfaceC9168) interfaceC23921).mo5147() + iM29119;
                    try {
                        iMo5148 = m6255(iMo5148, EnumC3167.f5900);
                        z = true;
                    } catch (C2828 unused2) {
                        z = false;
                    }
                    if (z) {
                        if (this.f7059.m53842(iMo5148) != -1) {
                            InterfaceC23920 interfaceC23920M62510 = m6259(iMo5148, EnumC3167.f5900);
                            arrayListM6086.set(i, new C16994(enumC3167Mo6217, ((InterfaceC9423) interfaceC23921).mo4189(), iM29117 - iM29119));
                            arrayListM6086.add(interfaceC23920M62510);
                            iMo6216 = interfaceC23920M62510.mo6216() + iM29117;
                        } else {
                            iMo6216 = iM29117;
                            iM29117 = iMo5148;
                        }
                        this.f7059.m53844(iM29117, iM29119);
                        iM29117 = iMo6216;
                    }
                }
            }
        } catch (Exception e) {
            try {
                throw C17034.m38625(e, "Error while processing method %s", C16010.m36382((InterfaceC7568) interfaceC19897, false));
            } catch (Exception unused3) {
                throw C17034.m38625(e, "Error while processing method", new Object[0]);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m6253(C5636 c5636, InterfaceC19897 interfaceC19897, C23616 c23616) throws IOException {
        c5636.getClass();
        c5636.write(".method ", 0, 8);
        m6251(c5636, interfaceC19897.mo5854(), interfaceC19897.mo5856());
        c5636.write(interfaceC19897.getName());
        c5636.write(MotionUtils.EASING_TYPE_FORMAT_START, 0, 1);
        AbstractC16192 abstractC16192CopyOf = AbstractC16192.copyOf((Collection) interfaceC19897.getParameters());
        AbstractC6767 abstractC6767ListIterator = abstractC16192CopyOf.listIterator(0);
        while (abstractC6767ListIterator.hasNext()) {
            c5636.write(((InterfaceC2461) abstractC6767ListIterator.next()).getType());
        }
        c5636.write(MotionUtils.EASING_TYPE_FORMAT_END, 0, 1);
        c5636.write(interfaceC19897.mo5855());
        c5636.write(10);
        c5636.m12536();
        m6252(c5636, interfaceC19897, abstractC16192CopyOf, c23616);
        c23616.getClass();
        C20069.m45448(c5636, interfaceC19897.getAnnotations());
        c5636.m12532();
        c5636.write(".end method\n", 0, 12);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m6251(C5636 c5636, int i, Set set) throws IOException {
        for (EnumC17248 enumC17248 : EnumC17248.m39024(i)) {
            c5636.write(enumC17248.toString());
            c5636.write(32);
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            c5636.write(((EnumC19932) it.next()).toString());
            c5636.write(32);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m6252(C5636 c5636, InterfaceC19897 interfaceC19897, List list, C23616 c23616) throws IOException {
        int i = !EnumC17248.STATIC.m39032(interfaceC19897.mo5854()) ? 1 : 0;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC2461 interfaceC2461 = (InterfaceC2461) it.next();
            String type = interfaceC2461.getType();
            String name = interfaceC2461.getName();
            Set annotations = interfaceC2461.getAnnotations();
            if ((c23616.f75166 && name != null) || annotations.size() != 0) {
                c5636.getClass();
                c5636.write(".param p", 0, 8);
                c5636.m12534(i);
                if (name != null && c23616.f75166) {
                    c5636.write(", ", 0, 2);
                    c5636.write(34);
                    C15693.m35744(c5636, name);
                    c5636.write(34);
                }
                c5636.write("  # ", 0, 4);
                c5636.write(type);
                c5636.write("\n", 0, 1);
                if (annotations.size() > 0) {
                    c5636.m12536();
                    C20069.m45448(c5636, annotations);
                    c5636.m12532();
                    c5636.write(".end param\n", 0, 11);
                }
            }
            i = C13061.m29894(type) ? i + 2 : i + 1;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m6257(C5636 c5636) {
        int iMo6216;
        EnumC17248 enumC17248 = EnumC17248.STATIC;
        InterfaceC19897 interfaceC19897 = this.f7064;
        int i = 1;
        int i2 = !enumC17248.m39032(interfaceC19897.mo5854()) ? 1 : 0;
        c5636.getClass();
        boolean z = false;
        c5636.write(".method ", 0, 8);
        m6251(c5636, interfaceC19897.mo5854(), interfaceC19897.mo5856());
        C16010.m36386((Writer) c5636, (InterfaceC7568) interfaceC19897, true);
        AbstractC16192 abstractC16192 = this.f7067;
        AbstractC6767 abstractC6767ListIterator = abstractC16192.listIterator(0);
        while (abstractC6767ListIterator.hasNext()) {
            i2 = C13061.m29894(((InterfaceC2461) abstractC6767ListIterator.next()).getType()) ? i2 + 2 : i2 + 1;
        }
        c5636.write(10);
        c5636.m12536();
        C23616 c23616 = this.f7058;
        c23616.getClass();
        boolean z2 = c23616.f75163;
        InterfaceC20568 interfaceC20568 = this.f7062;
        if (!z2) {
            c5636.write(".registers ", 0, 11);
            c5636.m12534(interfaceC20568.mo6075());
        }
        c5636.write(10);
        m6252(c5636, interfaceC19897, abstractC16192, c23616);
        if (this.f7060 == null) {
            this.f7060 = new C16909(c23616, interfaceC20568.mo6075(), i2);
        }
        C20069.m45448(c5636, interfaceC19897.getAnnotations());
        c5636.write(10);
        C3429 c3429 = f7054;
        ArrayList<AbstractC10205> arrayListM6085 = c3429.m6085();
        int i3 = 0;
        int i4 = 0;
        while (true) {
            ArrayList arrayList = this.f7057;
            if (i3 >= arrayList.size()) {
                break;
            }
            InterfaceC23920 interfaceC23920 = (InterfaceC23920) arrayList.get(i3);
            if (c23616.f75167 && interfaceC23920.mo6217() == EnumC3167.f5839) {
                iMo6216 = interfaceC23920.mo6216();
            } else {
                arrayListM6085.add(C19593.m44506(this, i4, interfaceC23920));
                if (!c23616.f75165 && i3 != arrayList.size() - 1) {
                    arrayListM6085.add(C20740.m46843(i4));
                }
                iMo6216 = interfaceC23920.mo6216();
            }
            i4 += iMo6216;
            i3++;
        }
        List<InterfaceC7156> listMo6068 = interfaceC20568.mo6068();
        if (listMo6068.size() != 0) {
            if (c23616.f75169) {
                listMo6068 = C19618.m44518(listMo6068);
            }
            ArrayList arrayList2 = this.f7063;
            int size = arrayList2.size() - 1;
            C12659 c12659 = this.f7061;
            int iMo6217 = ((InterfaceC23920) C20013.m45383(arrayList2, 1)).mo6216() + c12659.m29117(size);
            for (InterfaceC7156 interfaceC7156 : listMo6068) {
                int iMo16459 = interfaceC7156.mo16459();
                int iMo16461 = interfaceC7156.mo16461() + iMo16459;
                if (iMo16459 >= iMo6217) {
                    Object[] objArr = new Object[i];
                    objArr[0] = Integer.valueOf(iMo16459);
                    throw new RuntimeException(String.format("Try start offset %d is past the end of the code block.", objArr));
                }
                if (iMo16461 > iMo6217) {
                    Object[] objArr2 = new Object[i];
                    objArr2[0] = Integer.valueOf(iMo16461);
                    throw new RuntimeException(String.format("Try end offset %d is past the end of the code block.", objArr2));
                }
                int iM29117 = c12659.m29117(c12659.m29118(iMo16461 - 1, z));
                for (InterfaceC4474 interfaceC4474 : interfaceC7156.mo16460()) {
                    int iMo9474 = interfaceC4474.mo9474();
                    if (iMo9474 >= iMo6217) {
                        throw new C17034(null, "Exception handler offset %d is past the end of the code block.", Integer.valueOf(iMo9474));
                    }
                    C7523 c7523 = this.f7065;
                    String strMo9476 = interfaceC4474.mo9476();
                    int i5 = iMo16461;
                    int i6 = iMo16459;
                    arrayListM6085.add(new C2633(this.f7058, c7523, iM29117, strMo9476, i6, i5, iMo9474));
                    iMo16459 = i6;
                    iMo16461 = i5;
                    i = 1;
                    z = false;
                }
            }
        }
        if (c23616.f75166) {
            Iterator it = interfaceC20568.mo6069().iterator();
            while (it.hasNext()) {
                arrayListM6085.add(AbstractC22751.m50919(this.f7060, (InterfaceC9838) it.next()));
            }
        }
        boolean z3 = c23616.f75168;
        C7523 c7524 = this.f7065;
        if (z3) {
            HashMap map = new HashMap();
            ArrayList<C20935> arrayList3 = new ArrayList(c7524.f19756.values());
            Collections.sort(arrayList3);
            for (C20935 c20935 : arrayList3) {
                Integer num = (Integer) map.get(c20935.m47237());
                if (num == null) {
                    num = 0;
                }
                c20935.m47234(num.intValue());
                map.put(c20935.m47237(), Integer.valueOf(num.intValue() + 1));
            }
        }
        Collection collectionValues = c7524.f19756.values();
        arrayListM6085.ensureCapacity(collectionValues.size() + arrayListM6085.size());
        Iterator it2 = collectionValues.iterator();
        while (it2.hasNext()) {
            arrayListM6085.add((C20935) it2.next());
        }
        Collections.sort(arrayListM6085);
        for (AbstractC10205 abstractC10205 : arrayListM6085) {
            if (abstractC10205.mo4018(c5636)) {
                c5636.write(10);
            }
            abstractC10205.mo14008();
        }
        c3429.m6084(arrayListM6085);
        c5636.m12532();
        c5636.write(".end method\n", 0, 12);
    }

    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC23920 m6259(int i, EnumC3167 enumC3167) {
        int i2;
        try {
            int iM29118 = this.f7061.m29118(i, true);
            ArrayList arrayList = this.f7063;
            InterfaceC23920 interfaceC23920 = (InterfaceC23920) arrayList.get(iM29118);
            if (interfaceC23920.mo6217() == enumC3167) {
                return interfaceC23920;
            }
            if (interfaceC23920.mo6217() == EnumC3167.f5839 && (i2 = iM29118 + 1) < arrayList.size()) {
                InterfaceC23920 interfaceC23921 = (InterfaceC23920) arrayList.get(i2);
                if (interfaceC23921.mo6217() == enumC3167) {
                    return interfaceC23921;
                }
            }
            throw new C2828(i);
        } catch (C3941 unused) {
            throw new C2828(i);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m6255(int i, EnumC3167 enumC3167) {
        int i2;
        C12659 c12659 = this.f7061;
        try {
            int iM29118 = c12659.m29118(i, true);
            ArrayList arrayList = this.f7063;
            InterfaceC23920 interfaceC23920 = (InterfaceC23920) arrayList.get(iM29118);
            if (interfaceC23920.mo6217() == enumC3167) {
                return i;
            }
            if (interfaceC23920.mo6217() == EnumC3167.f5839 && (i2 = iM29118 + 1) < arrayList.size() && ((InterfaceC23920) arrayList.get(i2)).mo6217() == enumC3167) {
                return c12659.m29117(i2);
            }
            throw new C2828(i);
        } catch (C3941 unused) {
            throw new C2828(i);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final C7523 m6256() {
        return this.f7065;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m6254(int i) {
        return this.f7066.m53842(i);
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m6258(int i) {
        return this.f7059.m53842(i);
    }
}
