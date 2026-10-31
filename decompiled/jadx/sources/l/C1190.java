package l;

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
public final class C1190 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList f4288;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C22357 f4289;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C23193 f4290;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C15300 f4291;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C10828 f4292;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final InterfaceC19150 f4293;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final ArrayList f4294;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final InterfaceC18444 f4295;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C5424 f4296;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C23193 f4297;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final AbstractC14545 f4298;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final C1116 f4285 = new C1116();

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static final C1116 f4287 = new C1116();

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static final C0225 f4286 = new C0225();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m4018() {
        C23193 c23193 = this.f4297;
        C0225 c0225 = f4286;
        c0225.m1477(c23193);
        c0225.m1477(this.f4290);
        ArrayList<InterfaceC22677> arrayList = this.f4294;
        for (InterfaceC22677 interfaceC22677 : arrayList) {
            if (interfaceC22677 instanceof C1855) {
                C1855 c1855 = (C1855) interfaceC22677;
                c1855.f29163.m31388(c1855);
            } else if (interfaceC22677 instanceof C20472) {
                C20472 c20472 = (C20472) interfaceC22677;
                c20472.f29163.m31390(c20472);
            } else if (interfaceC22677 instanceof C2833) {
                C2833 c2833 = (C2833) interfaceC22677;
                c2833.f29163.m31389(c2833);
            }
        }
        ArrayList arrayList2 = this.f4288;
        C1116 c1116 = f4287;
        c1116.m3827(arrayList2);
        c1116.m3827(arrayList);
    }

    public C1190(C22357 c22357, InterfaceC18444 interfaceC18444, InterfaceC19150 interfaceC19150) {
        boolean z;
        int iMo3974;
        boolean z2;
        C5424 c5424 = new C5424();
        c5424.f16915 = new HashMap();
        this.f4296 = c5424;
        this.f4289 = c22357;
        this.f4295 = interfaceC18444;
        this.f4293 = interfaceC19150;
        try {
            C1116 c1116 = f4287;
            ArrayList arrayListM3828 = c1116.m3828();
            ArrayList arrayListM3829 = c1116.m3828();
            for (InterfaceC22677 interfaceC22677 : interfaceC19150.mo3817()) {
                arrayListM3828.add(interfaceC22677);
                arrayListM3829.add(interfaceC22677);
            }
            this.f4294 = arrayListM3828;
            this.f4288 = arrayListM3829;
            this.f4298 = AbstractC14545.copyOf((Collection) interfaceC18444.getParameters());
            C0225 c0225 = f4286;
            C23193 c23193 = (C23193) c0225.m1479();
            if (c23193 == null) {
                c23193 = new C23193();
            } else {
                c23193.m51447();
            }
            this.f4297 = c23193;
            C23193 c23194 = (C23193) c0225.m1479();
            if (c23194 == null) {
                c23194 = new C23193();
            } else {
                c23194.m51447();
            }
            this.f4290 = c23194;
            C10828 c10828 = new C10828(arrayListM3828);
            this.f4292 = c10828;
            int iM27072 = c10828.m27072(arrayListM3828.size() - 1) + ((InterfaceC22677) arrayListM3828.get(arrayListM3828.size() - 1)).mo3974();
            for (int i = 0; i < arrayListM3828.size(); i++) {
                InterfaceC22677 interfaceC22678 = (InterfaceC22677) arrayListM3828.get(i);
                EnumC0841 enumC0841Mo3975 = interfaceC22678.mo3975();
                if (enumC0841Mo3975 == EnumC0841.f3293) {
                    int iM27073 = this.f4292.m27072(i);
                    int iMo2818 = ((InterfaceC7155) interfaceC22678).mo2818() + iM27073;
                    try {
                        iMo2818 = m4013(iMo2818, EnumC0841.f3269);
                        z2 = true;
                    } catch (C0484 unused) {
                        z2 = false;
                    }
                    if (z2) {
                        if (this.f4297.m51446(iMo2818) != -1) {
                            InterfaceC22677 interfaceC22677M4017 = m4017(iMo2818, EnumC0841.f3269);
                            arrayListM3829.set(i, new C15389(enumC0841Mo3975, ((InterfaceC7423) interfaceC22678).mo1790(), iM27072 - iM27073));
                            arrayListM3829.add(interfaceC22677M4017);
                            iMo3974 = interfaceC22677M4017.mo3974() + iM27072;
                        } else {
                            iMo3974 = iM27072;
                            iM27072 = iMo2818;
                        }
                        this.f4297.m51448(iM27072, iM27073);
                        iM27072 = iMo3974;
                    }
                } else if (enumC0841Mo3975 == EnumC0841.f3201) {
                    int iM27074 = this.f4292.m27072(i);
                    int iMo2819 = ((InterfaceC7155) interfaceC22678).mo2818() + iM27074;
                    try {
                        iMo2819 = m4013(iMo2819, EnumC0841.f3126);
                        z = true;
                    } catch (C0484 unused2) {
                        z = false;
                    }
                    if (z) {
                        if (this.f4290.m51446(iMo2819) != -1) {
                            InterfaceC22677 interfaceC22677M4018 = m4017(iMo2819, EnumC0841.f3126);
                            arrayListM3829.set(i, new C15389(enumC0841Mo3975, ((InterfaceC7423) interfaceC22678).mo1790(), iM27072 - iM27074));
                            arrayListM3829.add(interfaceC22677M4018);
                            iMo3974 = interfaceC22677M4018.mo3974() + iM27072;
                        } else {
                            iMo3974 = iM27072;
                            iM27072 = iMo2819;
                        }
                        this.f4290.m51448(iM27072, iM27074);
                        iM27072 = iMo3974;
                    }
                }
            }
        } catch (Exception e) {
            try {
                throw C15431.m36467(e, "Error while processing method %s", C14354.m34249((InterfaceC5471) interfaceC18444, false));
            } catch (Exception unused3) {
                throw C15431.m36467(e, "Error while processing method", new Object[0]);
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m4011(C3438 c3438, InterfaceC18444 interfaceC18444, C22357 c22357) throws IOException {
        c3438.getClass();
        c3438.write(".method ", 0, 8);
        m4009(c3438, interfaceC18444.mo3567(), interfaceC18444.mo3569());
        c3438.write(interfaceC18444.getName());
        c3438.write(MotionUtils.EASING_TYPE_FORMAT_START, 0, 1);
        AbstractC14545 abstractC14545CopyOf = AbstractC14545.copyOf((Collection) interfaceC18444.getParameters());
        AbstractC4628 abstractC4628ListIterator = abstractC14545CopyOf.listIterator(0);
        while (abstractC4628ListIterator.hasNext()) {
            c3438.write(((InterfaceC0098) abstractC4628ListIterator.next()).getType());
        }
        c3438.write(MotionUtils.EASING_TYPE_FORMAT_END, 0, 1);
        c3438.write(interfaceC18444.mo3568());
        c3438.write(10);
        c3438.m10512();
        m4010(c3438, interfaceC18444, abstractC14545CopyOf, c22357);
        c22357.getClass();
        C18625.m43182(c3438, interfaceC18444.getAnnotations());
        c3438.m10508();
        c3438.write(".end method\n", 0, 12);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m4009(C3438 c3438, int i, Set set) throws IOException {
        for (EnumC15657 enumC15657 : EnumC15657.m36858(i)) {
            c3438.write(enumC15657.toString());
            c3438.write(32);
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            c3438.write(((EnumC18481) it.next()).toString());
            c3438.write(32);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m4010(C3438 c3438, InterfaceC18444 interfaceC18444, List list, C22357 c22357) throws IOException {
        int i = !EnumC15657.STATIC.m36866(interfaceC18444.mo3567()) ? 1 : 0;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC0098 interfaceC0098 = (InterfaceC0098) it.next();
            String type = interfaceC0098.getType();
            String name = interfaceC0098.getName();
            Set annotations = interfaceC0098.getAnnotations();
            if ((c22357.f72440 && name != null) || annotations.size() != 0) {
                c3438.getClass();
                c3438.write(".param p", 0, 8);
                c3438.m10510(i);
                if (name != null && c22357.f72440) {
                    c3438.write(", ", 0, 2);
                    c3438.write(34);
                    C14020.m33624(c3438, name);
                    c3438.write(34);
                }
                c3438.write("  # ", 0, 4);
                c3438.write(type);
                c3438.write("\n", 0, 1);
                if (annotations.size() > 0) {
                    c3438.m10512();
                    C18625.m43182(c3438, annotations);
                    c3438.m10508();
                    c3438.write(".end param\n", 0, 11);
                }
            }
            i = C11250.m27832(type) ? i + 2 : i + 1;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m4015(C3438 c3438) {
        int iMo3974;
        EnumC15657 enumC15657 = EnumC15657.STATIC;
        InterfaceC18444 interfaceC18444 = this.f4295;
        int i = 1;
        int i2 = !enumC15657.m36866(interfaceC18444.mo3567()) ? 1 : 0;
        c3438.getClass();
        boolean z = false;
        c3438.write(".method ", 0, 8);
        m4009(c3438, interfaceC18444.mo3567(), interfaceC18444.mo3569());
        C14354.m34253((Writer) c3438, (InterfaceC5471) interfaceC18444, true);
        AbstractC14545 abstractC14545 = this.f4298;
        AbstractC4628 abstractC4628ListIterator = abstractC14545.listIterator(0);
        while (abstractC4628ListIterator.hasNext()) {
            i2 = C11250.m27832(((InterfaceC0098) abstractC4628ListIterator.next()).getType()) ? i2 + 2 : i2 + 1;
        }
        c3438.write(10);
        c3438.m10512();
        C22357 c22357 = this.f4289;
        c22357.getClass();
        boolean z2 = c22357.f72437;
        InterfaceC19150 interfaceC19150 = this.f4293;
        if (!z2) {
            c3438.write(".registers ", 0, 11);
            c3438.m10510(interfaceC19150.mo3818());
        }
        c3438.write(10);
        m4010(c3438, interfaceC18444, abstractC14545, c22357);
        if (this.f4291 == null) {
            this.f4291 = new C15300(c22357, interfaceC19150.mo3818(), i2);
        }
        C18625.m43182(c3438, interfaceC18444.getAnnotations());
        c3438.write(10);
        C1116 c1116 = f4285;
        ArrayList<AbstractC8246> arrayListM3828 = c1116.m3828();
        int i3 = 0;
        int i4 = 0;
        while (true) {
            ArrayList arrayList = this.f4288;
            if (i3 >= arrayList.size()) {
                break;
            }
            InterfaceC22677 interfaceC22677 = (InterfaceC22677) arrayList.get(i3);
            if (c22357.f72441 && interfaceC22677.mo3975() == EnumC0841.f3065) {
                iMo3974 = interfaceC22677.mo3974();
            } else {
                arrayListM3828.add(C18124.m42247(this, i4, interfaceC22677));
                if (!c22357.f72439 && i3 != arrayList.size() - 1) {
                    arrayListM3828.add(C19331.m44549(i4));
                }
                iMo3974 = interfaceC22677.mo3974();
            }
            i4 += iMo3974;
            i3++;
        }
        List<InterfaceC5038> listMo3811 = interfaceC19150.mo3811();
        if (listMo3811.size() != 0) {
            if (c22357.f72443) {
                listMo3811 = C18150.m42257(listMo3811);
            }
            ArrayList arrayList2 = this.f4294;
            int size = arrayList2.size() - 1;
            C10828 c10828 = this.f4292;
            int iMo3975 = ((InterfaceC22677) C18566.m43105(arrayList2, 1)).mo3974() + c10828.m27072(size);
            for (InterfaceC5038 interfaceC5038 : listMo3811) {
                int iMo14555 = interfaceC5038.mo14555();
                int iMo14557 = interfaceC5038.mo14557() + iMo14555;
                if (iMo14555 >= iMo3975) {
                    Object[] objArr = new Object[i];
                    objArr[0] = Integer.valueOf(iMo14555);
                    throw new RuntimeException(String.format("Try start offset %d is past the end of the code block.", objArr));
                }
                if (iMo14557 > iMo3975) {
                    Object[] objArr2 = new Object[i];
                    objArr2[0] = Integer.valueOf(iMo14557);
                    throw new RuntimeException(String.format("Try end offset %d is past the end of the code block.", objArr2));
                }
                int iM27072 = c10828.m27072(c10828.m27073(iMo14557 - 1, z));
                for (InterfaceC2216 interfaceC2216 : interfaceC5038.mo14556()) {
                    int iMo7391 = interfaceC2216.mo7391();
                    if (iMo7391 >= iMo3975) {
                        throw new C15431(null, "Exception handler offset %d is past the end of the code block.", Integer.valueOf(iMo7391));
                    }
                    C5424 c5424 = this.f4296;
                    String strMo7393 = interfaceC2216.mo7393();
                    int i5 = iMo14557;
                    int i6 = iMo14555;
                    arrayListM3828.add(new C0279(this.f4289, c5424, iM27072, strMo7393, i6, i5, iMo7391));
                    iMo14555 = i6;
                    iMo14557 = i5;
                    i = 1;
                    z = false;
                }
            }
        }
        if (c22357.f72440) {
            Iterator it = interfaceC19150.mo3812().iterator();
            while (it.hasNext()) {
                arrayListM3828.add(AbstractC21447.m48582(this.f4291, (InterfaceC7860) it.next()));
            }
        }
        boolean z3 = c22357.f72442;
        C5424 c5425 = this.f4296;
        if (z3) {
            HashMap map = new HashMap();
            ArrayList<C19536> arrayList3 = new ArrayList(c5425.f16915.values());
            Collections.sort(arrayList3);
            for (C19536 c19536 : arrayList3) {
                Integer num = (Integer) map.get(c19536.m44937());
                if (num == null) {
                    num = 0;
                }
                c19536.m44934(num.intValue());
                map.put(c19536.m44937(), Integer.valueOf(num.intValue() + 1));
            }
        }
        Collection collectionValues = c5425.f16915.values();
        arrayListM3828.ensureCapacity(collectionValues.size() + arrayListM3828.size());
        Iterator it2 = collectionValues.iterator();
        while (it2.hasNext()) {
            arrayListM3828.add((C19536) it2.next());
        }
        Collections.sort(arrayListM3828);
        for (AbstractC8246 abstractC8246 : arrayListM3828) {
            if (abstractC8246.mo1618(c3438)) {
                c3438.write(10);
            }
            abstractC8246.mo12088();
        }
        c1116.m3827(arrayListM3828);
        c3438.m10508();
        c3438.write(".end method\n", 0, 12);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC22677 m4017(int i, EnumC0841 enumC0841) {
        int i2;
        try {
            int iM27073 = this.f4292.m27073(i, true);
            ArrayList arrayList = this.f4294;
            InterfaceC22677 interfaceC22677 = (InterfaceC22677) arrayList.get(iM27073);
            if (interfaceC22677.mo3975() == enumC0841) {
                return interfaceC22677;
            }
            if (interfaceC22677.mo3975() == EnumC0841.f3065 && (i2 = iM27073 + 1) < arrayList.size()) {
                InterfaceC22677 interfaceC22678 = (InterfaceC22677) arrayList.get(i2);
                if (interfaceC22678.mo3975() == enumC0841) {
                    return interfaceC22678;
                }
            }
            throw new C0484(i);
        } catch (C1655 unused) {
            throw new C0484(i);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m4013(int i, EnumC0841 enumC0841) {
        int i2;
        C10828 c10828 = this.f4292;
        try {
            int iM27073 = c10828.m27073(i, true);
            ArrayList arrayList = this.f4294;
            InterfaceC22677 interfaceC22677 = (InterfaceC22677) arrayList.get(iM27073);
            if (interfaceC22677.mo3975() == enumC0841) {
                return i;
            }
            if (interfaceC22677.mo3975() == EnumC0841.f3065 && (i2 = iM27073 + 1) < arrayList.size() && ((InterfaceC22677) arrayList.get(i2)).mo3975() == enumC0841) {
                return c10828.m27072(i2);
            }
            throw new C0484(i);
        } catch (C1655 unused) {
            throw new C0484(i);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C5424 m4014() {
        return this.f4296;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m4012(int i) {
        return this.f4297.m51446(i);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m4016(int i) {
        return this.f4290.m51446(i);
    }
}
