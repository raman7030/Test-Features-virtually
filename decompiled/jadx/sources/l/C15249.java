package l;

import android.os.Build;
import bin.mt.plus.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ܶ۬ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: D4TJ */
/* JADX INFO: loaded from: classes4.dex */
public final class C15249 extends C20876 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public String f46799;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public boolean f46800;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public boolean f46802;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public boolean f46803;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final Predicate f46805;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final InterfaceC21601 f46806;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final String f46807;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final InterfaceC19485 f46809;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public static final C2538 f46798 = new C2538(1);

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final C18779 f46797 = new C18779();

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final ArrayList f46804 = new ArrayList();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final ArrayList f46808 = new ArrayList();

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public boolean f46801 = false;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C15249 m36216(String str, C4586 c4586, InterfaceC19485 interfaceC19485) {
        return m36217(str, c4586, interfaceC19485, f46798);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C15249 m36217(String str, InterfaceC21601 interfaceC21601, InterfaceC19485 interfaceC19485, Predicate predicate) {
        boolean z = !C16999.m39887(str) && C19739.m45449(str) == null;
        return new C15249(str, interfaceC21601, z, z, interfaceC19485, predicate);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C15249 m36215(String str, AbstractC3163 abstractC3163, InterfaceC21601 interfaceC21601, InterfaceC19485 interfaceC19485) {
        C15249 c15249 = new C15249(str, interfaceC21601, abstractC3163.mo9708(), false, interfaceC19485, f46798);
        c15249.f46801 = true;
        return c15249;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C15249 m36218(InterfaceC19485 interfaceC19485) {
        return new C15249("", null, true, true, interfaceC19485, f46798);
    }

    public C15249(String str, InterfaceC21601 interfaceC21601, boolean z, boolean z2, InterfaceC19485 interfaceC19485, Predicate predicate) {
        this.f46807 = str;
        this.f46806 = interfaceC21601;
        this.f46802 = z;
        this.f46803 = z2;
        this.f46809 = interfaceC19485;
        this.f46805 = predicate;
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final void m36246() {
        this.f46802 = false;
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final void m36247() {
        this.f46803 = false;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m36249() {
        this.f46800 = true;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final void m36245() {
        this.f46801 = true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36236(String str) {
        this.f46799 = str;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m36228(String[] strArr, AbstractC13921 abstractC13921, boolean z) throws IOException {
        for (String str : strArr) {
            InterfaceC17889 interfaceC17889M33351 = abstractC13921.m33351(str);
            m36227(interfaceC17889M33351, ((C15688) interfaceC17889M33351).getName(), abstractC13921, z);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m36227(InterfaceC17889 interfaceC17889, String str, AbstractC13921 abstractC13921, boolean z) throws IOException {
        boolean z2 = false;
        boolean z3 = z && interfaceC17889.mo36978();
        try {
            if (interfaceC17889.isDirectory() && !z3) {
                z2 = true;
            }
            String strM39860 = C16999.m39860(str, z2);
            if (z3) {
                String strMo36977 = interfaceC17889.mo36977();
                if (strMo36977 == null) {
                    throw new IOException(C20094.m46315("Archive symbolic link target is missing: ", str));
                }
                C16999.m39881(strM39860, strMo36977);
            }
            if (interfaceC17889.isDirectory()) {
                for (InterfaceC17889 interfaceC178810 : abstractC13921.mo7637(interfaceC17889.getPath(), true)) {
                    String name = interfaceC178810.getName();
                    if (!strM39860.isEmpty()) {
                        name = C22870.m50967(strM39860, "/", name);
                    }
                    m36227(interfaceC178810, name, abstractC13921, z);
                }
            }
        } catch (IOException e) {
            String path = interfaceC17889.getPath();
            if (path.startsWith("/")) {
                path = path.substring(1);
            }
            throw new IOException(C20094.m46315("Unsafe archive entry path: ", path), e);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36242(String[] strArr, AbstractC13921 abstractC13921, boolean z, boolean z2) throws IOException {
        AbstractC1139 c5373;
        int i;
        C16477 c16477Mo24428;
        String[] strArr2 = strArr;
        String str = this.f46799;
        if (str != null && strArr2.length != 1) {
            throw new IllegalStateException();
        }
        int length = strArr2.length;
        int i2 = 0;
        while (true) {
            ArrayList<AbstractC1139> arrayList = this.f46804;
            InterfaceC19485 interfaceC19485 = this.f46809;
            if (i2 < length) {
                String str2 = strArr2[i2];
                if (interfaceC19485.mo1526()) {
                    return;
                }
                InterfaceC17889 interfaceC17889M33351 = abstractC13921.m33351(str2);
                String name = str != null ? str : ((C15688) interfaceC17889M33351).getName();
                C15688 c15688 = (C15688) interfaceC17889M33351;
                boolean zIsDirectory = c15688.isDirectory();
                if (z) {
                    name = C16999.m39860(name, zIsDirectory);
                }
                AbstractC15440 abstractC15440M39866 = C16999.m39866(this.f46807, name);
                boolean zMo23120 = abstractC15440M39866.mo23120();
                boolean z3 = this.f46803 && c15688.mo36978();
                boolean z4 = zMo23120 && z3 && this.f46800;
                if (zMo23120 && z3) {
                    if (!this.f46800) {
                        m36230(abstractC15440M39866.mo23554());
                        throw null;
                    }
                }
                if (c15688.isDirectory()) {
                    c5373 = new C0433();
                    if (zMo23120 && !z4) {
                        m36226(abstractC15440M39866);
                    }
                    i = length;
                } else {
                    c5373 = new C5373();
                    if (!zMo23120 || z4) {
                        i = length;
                    } else {
                        m36233(abstractC15440M39866);
                        int iM36214 = m36214(abstractC15440M39866, interfaceC17889M33351, name);
                        i = length;
                        InterfaceC21601 interfaceC21601 = this.f46806;
                        if (interfaceC21601.mo1526()) {
                            interfaceC19485.mo4330();
                            return;
                        }
                        if (iM36214 != 1) {
                            if (iM36214 == 2) {
                                c5373.m3911();
                            } else if (this.f46802) {
                                C17558 c17558 = new C17558();
                                c17558.m41050(abstractC15440M39866);
                                c5373.m3885(c17558.m41049());
                            }
                            if (iM36214 == 0 && interfaceC21601.mo13494() && abstractC15440M39866.mo29016()) {
                                c5373.m3897(true);
                            }
                        }
                        i2++;
                        strArr2 = strArr;
                        str = str;
                        length = i;
                    }
                    c5373.m3881(c15688.getSize());
                    this.f67560 = c5373.m3913() + this.f67560;
                }
                c5373.m3907(name);
                c5373.m3894(c15688.getTime());
                c5373.m3886(z3);
                if (c5373.m3909()) {
                    c5373.m3882(c15688.mo36977());
                }
                if (this.f46802 && c5373.m3904() == null && (c16477Mo24428 = interfaceC17889M33351.mo24428()) != null) {
                    if (interfaceC17889M33351 instanceof C9555) {
                        if (C9555.m24427(c16477Mo24428)) {
                            if (!((C9555) interfaceC17889M33351).mo24433().mo35196()) {
                                try {
                                    c5373.m3885(new C18264(C20402.m46724(((C15688) interfaceC17889M33351).getPath())));
                                } catch (IOException unused) {
                                }
                            }
                        } else {
                            c5373.m3885(new C18264(c16477Mo24428.m38843(), c16477Mo24428.m38840(), c16477Mo24428.m38838()));
                        }
                    } else {
                        c5373.m3885(new C18264(c16477Mo24428.m38843(), -1, -1));
                    }
                }
                c5373.m3902(str2);
                c5373.m3896(abstractC15440M39866);
                c5373.m3895(name);
                c5373.m3903(zMo23120);
                arrayList.add(c5373);
                this.f67559++;
                i2++;
                strArr2 = strArr;
                str = str;
                length = i;
            } else {
                interfaceC19485.mo4331();
                for (AbstractC1139 abstractC1139 : arrayList) {
                    if (interfaceC19485.mo1526()) {
                        return;
                    }
                    if (m36229(abstractC1139)) {
                        m36224(abstractC1139.mo1983(), abstractC13921, z);
                    }
                }
                if (z2) {
                    interfaceC19485.mo4331();
                    for (AbstractC1139 abstractC11310 : arrayList) {
                        if (abstractC11310.m3888()) {
                            m36234(abstractC11310.mo1983());
                        }
                    }
                }
                Collections.sort(arrayList, f46797);
                for (AbstractC1139 abstractC11311 : arrayList) {
                    if (abstractC11311.m3888()) {
                        abstractC11311.mo1983().m1985();
                    }
                }
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m36224(C0433 c0433, AbstractC13921 abstractC13921, boolean z) throws IOException {
        AbstractC1139 c0434;
        C16477 c16477Mo24428;
        String strM3898 = c0433.m3898();
        Iterator it = abstractC13921.mo7637(c0433.m3910(), true).iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            InterfaceC19485 interfaceC19485 = this.f46809;
            if (!zHasNext) {
                interfaceC19485.mo4331();
                for (AbstractC1139 abstractC1139 : c0433.f1916) {
                    if (interfaceC19485.mo1526()) {
                        return;
                    }
                    if (m36229(abstractC1139)) {
                        m36224(abstractC1139.mo1983(), abstractC13921, z);
                    }
                }
                return;
            }
            InterfaceC17889 interfaceC17889 = (InterfaceC17889) it.next();
            if (interfaceC19485.mo1526()) {
                return;
            }
            String name = interfaceC17889.getName();
            if (!strM3898.isEmpty()) {
                name = C22870.m50967(strM3898, "/", name);
            }
            boolean zIsDirectory = interfaceC17889.isDirectory();
            if (z) {
                name = C16999.m39860(name, zIsDirectory);
            }
            AbstractC15440 abstractC15440M39866 = C16999.m39866(this.f46807, name);
            boolean z2 = false;
            boolean z3 = c0433.m3879() && abstractC15440M39866.mo23120();
            boolean z4 = this.f46803 && interfaceC17889.mo36978();
            if (z3 && z4 && this.f46800) {
                z2 = true;
            }
            if (interfaceC17889.isDirectory()) {
                c0434 = new C0433();
                if (z3 && !z2) {
                    m36226(abstractC15440M39866);
                }
            } else {
                C5373 c5373 = new C5373();
                if (z3 && !z2) {
                    m36233(abstractC15440M39866);
                    int iM36214 = m36214(abstractC15440M39866, interfaceC17889, name);
                    InterfaceC21601 interfaceC21601 = this.f46806;
                    if (interfaceC21601.mo1526()) {
                        interfaceC19485.mo4330();
                        return;
                    }
                    if (iM36214 == 1) {
                        c0433.f1917 = true;
                    } else {
                        if (iM36214 == 2) {
                            c5373.m3911();
                        } else {
                            C17558 c17558 = new C17558();
                            c17558.m41050(abstractC15440M39866);
                            c5373.m3885(c17558.m41049());
                        }
                        if (iM36214 == 0 && interfaceC21601.mo13494() && abstractC15440M39866.mo29016()) {
                            c5373.m3897(true);
                        }
                    }
                }
                c5373.m3881(interfaceC17889.getSize());
                this.f67560 = c5373.m3913() + this.f67560;
                c0434 = c5373;
            }
            c0434.m3894(interfaceC17889.getTime());
            c0434.m3886(z4);
            if (c0434.m3909()) {
                c0434.m3882(interfaceC17889.mo36977());
            }
            if (this.f46802 && c0434.m3904() == null && (c16477Mo24428 = interfaceC17889.mo24428()) != null) {
                if (!(interfaceC17889 instanceof C9555)) {
                    c0434.m3885(new C18264(c16477Mo24428.m38843(), -1, -1));
                } else if (!C9555.m24427(c16477Mo24428)) {
                    c0434.m3885(new C18264(c16477Mo24428.m38843(), c16477Mo24428.m38840(), c16477Mo24428.m38838()));
                } else if (!interfaceC17889.mo24433().mo35196()) {
                    try {
                        c0434.m3885(new C18264(C20402.m46724(interfaceC17889.getPath())));
                    } catch (IOException unused) {
                    }
                }
            }
            c0434.m3902(interfaceC17889.getPath());
            c0434.m3896(abstractC15440M39866);
            c0434.m3895(name);
            c0434.m3903(z3);
            c0433.f1916.add(c0434);
            this.f67559++;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m36214(AbstractC15440 abstractC15440, InterfaceC17889 interfaceC17889, String str) {
        boolean zTest = this.f46805.test(abstractC15440);
        if (!this.f46806.mo13492(zTest)) {
            C22306 c22306 = C22306.f72317;
            return this.f46806.mo13490(str, c22306, c22306, false, zTest);
        }
        return this.f46806.mo13490(str, C22306.m50049(interfaceC17889), C22306.m50048(abstractC15440), abstractC15440.mo29016(), zTest);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m36229(AbstractC1139 abstractC1139) {
        if (!abstractC1139.m3888()) {
            return false;
        }
        if (!abstractC1139.m3909() || this.f46801) {
            return (this.f46800 && abstractC1139.m3909() && abstractC1139.m3879()) ? false : true;
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36238(String[] strArr) throws IOException {
        AbstractC1139 c5373;
        int length = strArr.length;
        int i = 0;
        while (true) {
            ArrayList<AbstractC1139> arrayList = this.f46804;
            InterfaceC19485 interfaceC19485 = this.f46809;
            if (i < length) {
                String str = strArr[i];
                if (interfaceC19485.mo1526()) {
                    return;
                }
                AbstractC15440 abstractC15440M39866 = C16999.m39866(str, new String[0]);
                String name = abstractC15440M39866.getName();
                AbstractC15440 abstractC15440M39867 = C16999.m39866(this.f46807, name);
                if (!C16999.m39878(abstractC15440M39866.mo23554(), abstractC15440M39867.mo23554())) {
                    boolean zMo23120 = abstractC15440M39867.mo23120();
                    if (abstractC15440M39866.mo23113()) {
                        if (abstractC15440M39867.m36504(abstractC15440M39866)) {
                            throw new C19401(C4925.m14306(R.string.MT_Protector, abstractC15440M39866.mo23554()));
                        }
                        c5373 = new C0433();
                    } else {
                        c5373 = new C5373();
                        c5373.m3881(abstractC15440M39866.mo23127());
                    }
                    c5373.m3907(abstractC15440M39866.getName());
                    c5373.m3894(abstractC15440M39866.mo23117());
                    c5373.m3886(this.f46803 && abstractC15440M39866.m36533());
                    c5373.m3884(abstractC15440M39866);
                    c5373.m3896(abstractC15440M39867);
                    c5373.m3895(name);
                    c5373.m3903(zMo23120);
                    if (!zMo23120) {
                        interfaceC19485.mo4332(name);
                        if (abstractC15440M39866.mo23551(abstractC15440M39867)) {
                            if (c5373.m3888()) {
                                abstractC15440M39867.mo18537(c5373.m3887());
                            }
                            this.f46808.add(c5373);
                            this.f67559++;
                            m47715();
                        }
                    } else if (c5373.f4125) {
                        if (abstractC15440M39867.mo23113() && !abstractC15440M39867.m36533()) {
                            m36230(abstractC15440M39867.mo23554());
                            throw null;
                        }
                    } else if (c5373.m3888()) {
                        m36226(abstractC15440M39867);
                    } else {
                        m36233(abstractC15440M39867);
                    }
                    if (c5373.f4125 || !c5373.m3888()) {
                        C5373 c5373Mo1987 = c5373.mo1987();
                        if (zMo23120) {
                            c5373Mo1987.m3912();
                            InterfaceC21601 interfaceC21601 = this.f46806;
                            if (interfaceC21601.mo13496()) {
                                interfaceC21601.mo13491(name, C22306.m50048(abstractC15440M39866), C22306.m50048(abstractC15440M39867), abstractC15440M39867.mo29016());
                            }
                            if (interfaceC21601.mo1526()) {
                                interfaceC19485.mo4330();
                                return;
                            }
                            if (interfaceC21601.mo13493() != 1) {
                                if (interfaceC21601.mo13493() == 2) {
                                    c5373Mo1987.m3911();
                                } else if (!c5373.f4125) {
                                    C17558 c17558 = new C17558();
                                    c17558.m41050(abstractC15440M39867);
                                    c5373Mo1987.m3885(c17558.m41049());
                                }
                                if (interfaceC21601.mo13493() == 0 && interfaceC21601.mo13494() && abstractC15440M39867.mo29016()) {
                                    c5373Mo1987.m3897(true);
                                }
                            }
                        }
                        if (!c5373.f4125) {
                            this.f67560 += c5373.f4124;
                        }
                        arrayList.add(c5373);
                        this.f67559++;
                    } else {
                        arrayList.add(c5373);
                        this.f67559++;
                    }
                }
                i++;
            } else {
                interfaceC19485.mo4331();
                for (AbstractC1139 abstractC1139 : arrayList) {
                    if (interfaceC19485.mo1526()) {
                        return;
                    }
                    if (abstractC1139.m3888() && !abstractC1139.m3909()) {
                        m36220(abstractC1139.mo1983());
                    }
                }
                interfaceC19485.mo4331();
                for (AbstractC1139 abstractC11310 : arrayList) {
                    if (abstractC11310.m3888()) {
                        m36234(abstractC11310.mo1983());
                    }
                }
                Collections.sort(arrayList, f46797);
                for (AbstractC1139 abstractC11311 : arrayList) {
                    if (abstractC11311.m3888()) {
                        abstractC11311.mo1983().m1985();
                    }
                }
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m36220(C0433 c0433) throws IOException {
        AbstractC1139 c5373;
        AbstractC15440 abstractC15440M3890 = c0433.m3890();
        String str = c0433.m3898() + "/";
        Iterator it = abstractC15440M3890.mo23549(true).iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            InterfaceC19485 interfaceC19485 = this.f46809;
            if (!zHasNext) {
                interfaceC19485.mo4331();
                for (AbstractC1139 abstractC1139 : c0433.f1916) {
                    if (interfaceC19485.mo1526()) {
                        return;
                    }
                    if (abstractC1139.m3888() && !abstractC1139.m3909()) {
                        m36220(abstractC1139.mo1983());
                    }
                }
                return;
            }
            AbstractC15440 abstractC15440 = (AbstractC15440) it.next();
            if (interfaceC19485.mo1526()) {
                return;
            }
            StringBuilder sbM15339 = C5368.m15339(str);
            sbM15339.append(abstractC15440.getName());
            String string = sbM15339.toString();
            AbstractC15440 abstractC15440M39866 = C16999.m39866(this.f46807, string);
            if (!C16999.m39878(abstractC15440.mo23554(), abstractC15440M39866.mo23554())) {
                boolean z = false;
                boolean z2 = c0433.m3879() && abstractC15440M39866.mo23120();
                if (abstractC15440.mo23113()) {
                    c5373 = new C0433();
                } else {
                    c5373 = new C5373();
                    c5373.m3881(abstractC15440.mo23127());
                }
                c5373.m3894(abstractC15440.mo23117());
                if (this.f46803 && abstractC15440.m36533()) {
                    z = true;
                }
                c5373.m3886(z);
                c5373.m3884(abstractC15440);
                c5373.m3896(abstractC15440M39866);
                c5373.m3895(string);
                c5373.m3903(z2);
                if (c0433.m3879() && !z2) {
                    interfaceC19485.mo4332(string);
                    if (abstractC15440.mo23551(abstractC15440M39866)) {
                        if (c5373.m3888()) {
                            abstractC15440M39866.mo18537(c5373.m3887());
                        }
                        this.f46808.add(c5373);
                        this.f67559++;
                        m47715();
                    }
                }
                if (z2) {
                    if (c5373.f4125) {
                        if (abstractC15440M39866.mo23113() && !abstractC15440M39866.m36533()) {
                            m36230(abstractC15440M39866.mo23554());
                            throw null;
                        }
                    } else if (c5373.m3888()) {
                        m36226(abstractC15440M39866);
                    } else {
                        m36233(abstractC15440M39866);
                    }
                }
                if (c5373.f4125 || !c5373.m3888()) {
                    C5373 c5373Mo1987 = c5373.mo1987();
                    if (z2) {
                        if (c0433.m3879()) {
                            c5373Mo1987.m3912();
                        }
                        InterfaceC21601 interfaceC21601 = this.f46806;
                        if (interfaceC21601.mo13496()) {
                            interfaceC21601.mo13491(string, C22306.m50048(abstractC15440), C22306.m50048(abstractC15440M39866), abstractC15440M39866.mo29016());
                        }
                        if (interfaceC21601.mo1526()) {
                            interfaceC19485.mo4330();
                            return;
                        }
                        if (interfaceC21601.mo13493() == 1) {
                            c0433.f1917 = true;
                        } else {
                            if (interfaceC21601.mo13493() == 2) {
                                c5373Mo1987.m3911();
                            } else if (!c5373.f4125) {
                                C17558 c17558 = new C17558();
                                c17558.m41050(abstractC15440M39866);
                                c5373Mo1987.m3885(c17558.m41049());
                            }
                            if (interfaceC21601.mo13493() == 0 && interfaceC21601.mo13494() && abstractC15440M39866.mo29016()) {
                                c5373Mo1987.m3897(true);
                            }
                        }
                    }
                    if (!c5373.f4125) {
                        this.f67560 += c5373.f4124;
                    }
                }
                c0433.f1916.add(c5373);
                this.f67559++;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36241(String[] strArr, AbstractC13921 abstractC13921, AbstractC3163 abstractC3163, InterfaceC1025 interfaceC1025) {
        AbstractC1139 c0433;
        C16477 c16477Mo24428;
        C22306 c22306M50049;
        C16477 c16477Mo24429;
        String[] strArr2 = strArr;
        int length = strArr2.length;
        int i = 0;
        while (true) {
            ArrayList<AbstractC1139> arrayList = this.f46804;
            InterfaceC19485 interfaceC19485 = this.f46809;
            if (i < length) {
                String str = strArr2[i];
                if (interfaceC19485.mo1526()) {
                    return;
                }
                InterfaceC17889 interfaceC17889M33351 = abstractC13921.m33351(str);
                C15688 c15688 = (C15688) interfaceC17889M33351;
                String name = c15688.getName();
                String strM24393 = C9523.m24393(this.f46807, name);
                boolean zMo9703 = abstractC3163.mo9703(strM24393);
                if (zMo9703 && this.f46803 && c15688.mo36978()) {
                    m36230(strM24393);
                    throw null;
                }
                if (c15688.isDirectory()) {
                    interfaceC1025.setName(name);
                    c0433 = new C0433();
                    if (zMo9703) {
                        m36225(abstractC3163, strM24393);
                    }
                    length = length;
                } else {
                    C5373 c5373 = new C5373();
                    if (zMo9703) {
                        m36232(abstractC3163, strM24393);
                        InterfaceC21601 interfaceC21601 = this.f46806;
                        if (interfaceC21601.mo13496()) {
                            C22306 c22306M500410 = C22306.m50049(interfaceC17889M33351);
                            try {
                                c22306M50049 = C22306.m50049(abstractC3163.m33351(strM24393));
                            } catch (Exception unused) {
                                c22306M50049 = C22306.f72317;
                            }
                            interfaceC21601.mo13491(name, c22306M500410, c22306M50049, false);
                        }
                        if (interfaceC21601.mo1526()) {
                            interfaceC19485.mo4330();
                            return;
                        }
                        if (interfaceC21601.mo13493() != 1) {
                            if (interfaceC21601.mo13493() == 2) {
                                c5373.m3911();
                            } else if (this.f46802 && (c16477Mo24428 = abstractC3163.m33351(strM24393).mo24428()) != null) {
                                c5373.m3885(new C18264(c16477Mo24428.m38843(), -1, -1));
                            }
                        }
                        i++;
                        strArr2 = strArr;
                        length = length;
                    } else {
                        length = length;
                    }
                    c5373.m3881(c15688.getSize());
                    this.f67560 += c5373.m3913();
                    c0433 = c5373;
                }
                c0433.m3907(name);
                c0433.m3894(c15688.getTime());
                c0433.m3886(this.f46803 && c15688.mo36978());
                if (c0433.m3909()) {
                    c0433.m3882(c15688.mo36977());
                }
                if (this.f46802 && c0433.m3904() == null && (c16477Mo24429 = interfaceC17889M33351.mo24428()) != null) {
                    int iM38843 = c16477Mo24429.m38843();
                    if ((interfaceC17889M33351 instanceof C9555) && C9555.m24427(c16477Mo24429) && !((C9555) interfaceC17889M33351).mo24433().mo35196()) {
                        try {
                            iM38843 = C20402.m46724(((C15688) interfaceC17889M33351).getPath()).m41291();
                        } catch (IOException unused2) {
                        }
                    }
                    c0433.m3885(new C18264(iM38843, -1, -1));
                }
                c0433.m3902(c15688.getPath());
                c0433.m3905(strM24393);
                c0433.m3895(name);
                c0433.m3903(zMo9703);
                arrayList.add(c0433);
                this.f67559++;
                i++;
                strArr2 = strArr;
                length = length;
            } else {
                interfaceC19485.mo4331();
                for (AbstractC1139 abstractC1139 : arrayList) {
                    if (interfaceC19485.mo1526()) {
                        return;
                    }
                    if (abstractC1139.m3888() && (!abstractC1139.m3909() || this.f46801)) {
                        m36223(abstractC1139.mo1983(), abstractC13921, abstractC3163, interfaceC1025);
                    }
                }
                interfaceC19485.mo4331();
                for (AbstractC1139 abstractC11310 : arrayList) {
                    if (abstractC11310.m3888()) {
                        m36234(abstractC11310.mo1983());
                    }
                }
                Collections.sort(arrayList, f46797);
                for (AbstractC1139 abstractC11311 : arrayList) {
                    if (abstractC11311.m3888()) {
                        abstractC11311.mo1983().m1985();
                    }
                }
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m36223(C0433 c0433, AbstractC13921 abstractC13921, AbstractC3163 abstractC3163, InterfaceC1025 interfaceC1025) throws IOException {
        AbstractC1139 c0434;
        C16477 c16477Mo24428;
        C16477 c16477Mo24429;
        C22306 c22306M50049;
        String str = c0433.m3898() + "/";
        Iterator it = abstractC13921.mo7637(c0433.m3910(), true).iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            InterfaceC19485 interfaceC19485 = this.f46809;
            if (!zHasNext) {
                interfaceC19485.mo4331();
                for (AbstractC1139 abstractC1139 : c0433.f1916) {
                    if (interfaceC19485.mo1526()) {
                        return;
                    }
                    if (abstractC1139.m3888() && (!abstractC1139.m3909() || this.f46801)) {
                        m36223(abstractC1139.mo1983(), abstractC13921, abstractC3163, interfaceC1025);
                    }
                }
                return;
            }
            InterfaceC17889 interfaceC17889 = (InterfaceC17889) it.next();
            if (interfaceC19485.mo1526()) {
                return;
            }
            StringBuilder sbM15339 = C5368.m15339(str);
            sbM15339.append(interfaceC17889.getName());
            String string = sbM15339.toString();
            String strM24393 = C9523.m24393(this.f46807, string);
            boolean z = false;
            boolean z2 = c0433.m3879() && abstractC3163.mo9703(strM24393);
            if (interfaceC17889.isDirectory()) {
                interfaceC1025.setName(string);
                c0434 = new C0433();
                if (z2) {
                    m36225(abstractC3163, strM24393);
                }
            } else {
                C5373 c5373 = new C5373();
                if (z2) {
                    m36232(abstractC3163, strM24393);
                    InterfaceC21601 interfaceC21601 = this.f46806;
                    if (interfaceC21601.mo13496()) {
                        C22306 c22306M500410 = C22306.m50049(interfaceC17889);
                        try {
                            c22306M50049 = C22306.m50049(abstractC3163.m33351(strM24393));
                        } catch (Exception unused) {
                            c22306M50049 = C22306.f72317;
                        }
                        interfaceC21601.mo13491(string, c22306M500410, c22306M50049, false);
                    }
                    if (interfaceC21601.mo1526()) {
                        interfaceC19485.mo4330();
                        return;
                    } else if (interfaceC21601.mo13493() == 1) {
                        c0433.f1917 = true;
                    } else if (interfaceC21601.mo13493() == 2) {
                        c5373.m3911();
                    } else if (this.f46802 && (c16477Mo24429 = abstractC3163.m33351(strM24393).mo24428()) != null) {
                        c5373.m3885(new C18264(c16477Mo24429.m38843(), -1, -1));
                    }
                }
                c5373.m3881(interfaceC17889.getSize());
                this.f67560 += c5373.m3913();
                c0434 = c5373;
            }
            c0434.m3894(interfaceC17889.getTime());
            if (this.f46803 && interfaceC17889.mo36978()) {
                z = true;
            }
            c0434.m3886(z);
            if (c0434.m3909()) {
                c0434.m3882(interfaceC17889.mo36977());
            }
            if (this.f46802 && c0434.m3904() == null && (c16477Mo24428 = interfaceC17889.mo24428()) != null) {
                int iM38843 = c16477Mo24428.m38843();
                if ((interfaceC17889 instanceof C9555) && C9555.m24427(c16477Mo24428) && !interfaceC17889.mo24433().mo35196()) {
                    try {
                        iM38843 = C20402.m46724(interfaceC17889.getPath()).m41291();
                    } catch (IOException unused2) {
                    }
                }
                c0434.m3885(new C18264(iM38843, -1, -1));
            }
            c0434.m3902(interfaceC17889.getPath());
            c0434.m3905(strM24393);
            c0434.m3895(string);
            c0434.m3903(z2);
            c0433.f1916.add(c0434);
            this.f67559++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:89:0x0192  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36239(String[] strArr, AbstractC3163 abstractC3163, InterfaceC22192 interfaceC22192) throws IOException {
        AbstractC1139 c0433;
        C16477 c16477Mo24428;
        C22306 c22306M50049;
        C16477 c16477Mo24429;
        String[] strArr2 = strArr;
        boolean zMo13919 = abstractC3163.mo13919();
        int length = strArr2.length;
        int i = 0;
        while (true) {
            ArrayList<AbstractC1139> arrayList = this.f46804;
            InterfaceC19485 interfaceC19485 = this.f46809;
            if (i < length) {
                String str = strArr2[i];
                if (interfaceC19485.mo1526()) {
                    return;
                }
                InterfaceC17889 interfaceC17889M33351 = abstractC3163.m33351(str);
                C15688 c15688 = (C15688) interfaceC17889M33351;
                String name = c15688.getName();
                String strM24393 = C9523.m24393(this.f46807, name);
                String path = c15688.getPath();
                if (!zMo13919 ? !path.equals(strM24393) : !path.equalsIgnoreCase(strM24393)) {
                    boolean zMo9703 = abstractC3163.mo9703(strM24393);
                    if (zMo9703 && this.f46803 && c15688.mo36978()) {
                        m36230(strM24393);
                        throw null;
                    }
                    if (c15688.isDirectory()) {
                        interfaceC22192.setName(name);
                        c0433 = new C0433();
                        if (zMo9703) {
                            m36225(abstractC3163, strM24393);
                        }
                        zMo13919 = zMo13919;
                        length = length;
                    } else {
                        C5373 c5373 = new C5373();
                        if (zMo9703) {
                            m36232(abstractC3163, strM24393);
                            InterfaceC21601 interfaceC21601 = this.f46806;
                            if (interfaceC21601.mo13496()) {
                                C22306 c22306M500410 = C22306.m50049(interfaceC17889M33351);
                                try {
                                    c22306M50049 = C22306.m50049(abstractC3163.m33351(strM24393));
                                } catch (Exception unused) {
                                    c22306M50049 = C22306.f72317;
                                }
                                interfaceC21601.mo13491(name, c22306M500410, c22306M50049, false);
                            }
                            if (interfaceC21601.mo1526()) {
                                interfaceC19485.mo4330();
                                return;
                            } else if (interfaceC21601.mo13493() != 1) {
                                if (interfaceC21601.mo13493() == 2) {
                                    c5373.m3911();
                                } else if (this.f46802 && (c16477Mo24428 = abstractC3163.m33351(strM24393).mo24428()) != null) {
                                    c5373.m3885(new C18264(c16477Mo24428.m38843(), -1, -1));
                                }
                            }
                        } else {
                            zMo13919 = zMo13919;
                            length = length;
                        }
                        c5373.m3881(c15688.getSize());
                        this.f67560 = c5373.m3913() + this.f67560;
                        c0433 = c5373;
                    }
                    c0433.m3907(name);
                    c0433.m3894(c15688.getTime());
                    c0433.m3886(this.f46803 && c15688.mo36978());
                    if (c0433.m3909()) {
                        c0433.m3882(c15688.mo36977());
                    }
                    if (this.f46802 && c0433.m3904() == null && (c16477Mo24429 = interfaceC17889M33351.mo24428()) != null) {
                        int iM38843 = c16477Mo24429.m38843();
                        if ((interfaceC17889M33351 instanceof C9555) && C9555.m24427(c16477Mo24429) && !((C9555) interfaceC17889M33351).mo24433().mo35196()) {
                            try {
                                iM38843 = C20402.m46724(((C15688) interfaceC17889M33351).getPath()).m41291();
                            } catch (IOException unused2) {
                            }
                        }
                        c0433.m3885(new C18264(iM38843, -1, -1));
                    }
                    c0433.m3902(path);
                    c0433.m3905(strM24393);
                    c0433.m3895(name);
                    c0433.m3903(zMo9703);
                    if (!zMo9703 && c0433.m3888()) {
                        try {
                            if (abstractC3163.mo9696(c0433.m3910(), c0433.m3900())) {
                                this.f46808.add(c0433);
                                this.f67559++;
                                m47715();
                            } else {
                                arrayList.add(c0433);
                                this.f67559++;
                            }
                        } catch (Exception unused3) {
                        }
                    } else {
                        arrayList.add(c0433);
                        this.f67559++;
                    }
                } else {
                    zMo13919 = zMo13919;
                    length = length;
                }
                i++;
                strArr2 = strArr;
                zMo13919 = zMo13919;
                length = length;
            } else {
                interfaceC19485.mo4331();
                for (AbstractC1139 abstractC1139 : arrayList) {
                    if (interfaceC19485.mo1526()) {
                        return;
                    }
                    if (abstractC1139.m3888() && (!abstractC1139.m3909() || this.f46801)) {
                        m36221(abstractC1139.mo1983(), abstractC3163, interfaceC22192);
                    }
                }
                interfaceC19485.mo4331();
                for (AbstractC1139 abstractC11310 : arrayList) {
                    if (abstractC11310.m3888()) {
                        m36234(abstractC11310.mo1983());
                    }
                }
                Collections.sort(arrayList, f46797);
                for (AbstractC1139 abstractC11311 : arrayList) {
                    if (abstractC11311.m3888()) {
                        abstractC11311.mo1983().m1985();
                    }
                }
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m36221(C0433 c0433, AbstractC3163 abstractC3163, InterfaceC22192 interfaceC22192) throws IOException {
        AbstractC1139 c0434;
        C16477 c16477Mo24428;
        C16477 c16477Mo24429;
        C22306 c22306M50049;
        String str = c0433.m3898() + "/";
        Iterator it = abstractC3163.mo7637(c0433.m3910(), true).iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            InterfaceC19485 interfaceC19485 = this.f46809;
            if (!zHasNext) {
                interfaceC19485.mo4331();
                for (AbstractC1139 abstractC1139 : c0433.f1916) {
                    if (interfaceC19485.mo1526()) {
                        return;
                    }
                    if (abstractC1139.m3888() && (!abstractC1139.m3909() || this.f46801)) {
                        m36221(abstractC1139.mo1983(), abstractC3163, interfaceC22192);
                    }
                }
                return;
            }
            InterfaceC17889 interfaceC17889 = (InterfaceC17889) it.next();
            if (interfaceC19485.mo1526()) {
                return;
            }
            StringBuilder sbM15339 = C5368.m15339(str);
            sbM15339.append(interfaceC17889.getName());
            String string = sbM15339.toString();
            String strM24393 = C9523.m24393(this.f46807, string);
            boolean z = false;
            boolean z2 = c0433.m3879() && abstractC3163.mo9703(strM24393);
            if (interfaceC17889.isDirectory()) {
                interfaceC22192.setName(string);
                c0434 = new C0433();
                if (z2) {
                    m36225(abstractC3163, strM24393);
                }
            } else {
                C5373 c5373 = new C5373();
                if (z2) {
                    m36232(abstractC3163, strM24393);
                    InterfaceC21601 interfaceC21601 = this.f46806;
                    if (interfaceC21601.mo13496()) {
                        C22306 c22306M500410 = C22306.m50049(interfaceC17889);
                        try {
                            c22306M50049 = C22306.m50049(abstractC3163.m33351(strM24393));
                        } catch (Exception unused) {
                            c22306M50049 = C22306.f72317;
                        }
                        interfaceC21601.mo13491(string, c22306M500410, c22306M50049, false);
                    }
                    if (interfaceC21601.mo1526()) {
                        interfaceC19485.mo4330();
                        return;
                    } else if (interfaceC21601.mo13493() == 1) {
                        c0433.f1917 = true;
                    } else if (interfaceC21601.mo13493() == 2) {
                        c5373.m3911();
                    } else if (this.f46802 && (c16477Mo24429 = abstractC3163.m33351(strM24393).mo24428()) != null) {
                        c5373.m3885(new C18264(c16477Mo24429.m38843(), -1, -1));
                    }
                }
                c5373.m3881(interfaceC17889.getSize());
                this.f67560 += c5373.m3913();
                c0434 = c5373;
            }
            c0434.m3894(interfaceC17889.getTime());
            if (this.f46803 && interfaceC17889.mo36978()) {
                z = true;
            }
            c0434.m3886(z);
            if (c0434.m3909()) {
                c0434.m3882(interfaceC17889.mo36977());
            }
            if (this.f46802 && c0434.m3904() == null && (c16477Mo24428 = interfaceC17889.mo24428()) != null) {
                int iM38843 = c16477Mo24428.m38843();
                if ((interfaceC17889 instanceof C9555) && C9555.m24427(c16477Mo24428) && !interfaceC17889.mo24433().mo35196()) {
                    try {
                        iM38843 = C20402.m46724(interfaceC17889.getPath()).m41291();
                    } catch (IOException unused2) {
                    }
                }
                c0434.m3885(new C18264(iM38843, -1, -1));
            }
            c0434.m3902(interfaceC17889.getPath());
            c0434.m3905(strM24393);
            c0434.m3895(string);
            c0434.m3903(z2);
            c0433.f1916.add(c0434);
            this.f67559++;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36240(String[] strArr, AbstractC13921 abstractC13921) {
        AbstractC1139 c5373;
        C16477 c16477Mo24428;
        int length = strArr.length;
        int i = 0;
        while (true) {
            InterfaceC19485 interfaceC19485 = this.f46809;
            ArrayList<AbstractC1139> arrayList = this.f46804;
            if (i < length) {
                String str = strArr[i];
                if (interfaceC19485.mo1526()) {
                    return;
                }
                InterfaceC17889 interfaceC17889M33351 = abstractC13921.m33351(str);
                C15688 c15688 = (C15688) interfaceC17889M33351;
                String name = c15688.getName();
                if (c15688.isDirectory()) {
                    c5373 = new C0433();
                } else {
                    c5373 = new C5373();
                    c5373.m3881(c15688.getSize());
                    this.f67560 = c5373.m3913() + this.f67560;
                }
                c5373.m3907(name);
                c5373.m3894(c15688.getTime());
                c5373.m3886(this.f46803 && c15688.mo36978());
                if (c5373.m3909()) {
                    c5373.m3882(c15688.mo36977());
                }
                if (this.f46802 && (c16477Mo24428 = interfaceC17889M33351.mo24428()) != null) {
                    if (interfaceC17889M33351 instanceof C9555) {
                        if (C9555.m24427(c16477Mo24428)) {
                            if (!((C9555) interfaceC17889M33351).mo24433().mo35196()) {
                                try {
                                    c5373.m3885(new C18264(C20402.m46724(((C15688) interfaceC17889M33351).getPath())));
                                } catch (IOException unused) {
                                }
                            }
                        } else {
                            c5373.m3885(new C18264(c16477Mo24428.m38843(), c16477Mo24428.m38840(), c16477Mo24428.m38838()));
                        }
                    } else {
                        c5373.m3885(new C18264(c16477Mo24428.m38843(), -1, -1));
                    }
                }
                c5373.m3902(str);
                c5373.m3905(this.f46807 + name);
                c5373.m3895(name);
                c5373.m3903(false);
                arrayList.add(c5373);
                this.f67559++;
                i++;
            } else {
                interfaceC19485.mo4331();
                for (AbstractC1139 abstractC1139 : arrayList) {
                    if (interfaceC19485.mo1526()) {
                        return;
                    }
                    if (abstractC1139.m3888() && (!abstractC1139.m3909() || this.f46801)) {
                        m36222(abstractC1139.mo1983(), abstractC13921);
                    }
                }
                Collections.sort(arrayList, f46797);
                for (AbstractC1139 abstractC11310 : arrayList) {
                    if (abstractC11310.m3888()) {
                        abstractC11310.mo1983().m1985();
                    }
                }
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m36222(C0433 c0433, AbstractC13921 abstractC13921) {
        AbstractC1139 c5373;
        C16477 c16477Mo24428;
        String str = c0433.m3898() + "/";
        Iterator it = abstractC13921.mo7637(c0433.m3910(), true).iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            InterfaceC19485 interfaceC19485 = this.f46809;
            if (!zHasNext) {
                interfaceC19485.mo4331();
                for (AbstractC1139 abstractC1139 : c0433.f1916) {
                    if (interfaceC19485.mo1526()) {
                        return;
                    }
                    if (abstractC1139.m3888() && (!abstractC1139.m3909() || this.f46801)) {
                        m36222(abstractC1139.mo1983(), abstractC13921);
                    }
                }
                return;
            }
            InterfaceC17889 interfaceC17889 = (InterfaceC17889) it.next();
            if (interfaceC19485.mo1526()) {
                return;
            }
            String strM37867 = C16014.m37867(str, interfaceC17889.getName());
            if (interfaceC17889.isDirectory()) {
                c5373 = new C0433();
            } else {
                c5373 = new C5373();
                c5373.m3881(interfaceC17889.getSize());
                this.f67560 = c5373.m3913() + this.f67560;
            }
            c5373.m3894(interfaceC17889.getTime());
            c5373.m3886(this.f46803 && interfaceC17889.mo36978());
            if (c5373.m3909()) {
                c5373.m3882(interfaceC17889.mo36977());
            }
            if (this.f46802 && (c16477Mo24428 = interfaceC17889.mo24428()) != null) {
                if (!(interfaceC17889 instanceof C9555)) {
                    c5373.m3885(new C18264(c16477Mo24428.m38843(), -1, -1));
                } else if (!C9555.m24427(c16477Mo24428)) {
                    c5373.m3885(new C18264(c16477Mo24428.m38843(), c16477Mo24428.m38840(), c16477Mo24428.m38838()));
                } else if (!interfaceC17889.mo24433().mo35196()) {
                    try {
                        c5373.m3885(new C18264(C20402.m46724(interfaceC17889.getPath())));
                    } catch (IOException unused) {
                    }
                }
            }
            c5373.m3902(interfaceC17889.getPath());
            c5373.m3905(this.f46807 + strM37867);
            c5373.m3895(strM37867);
            c5373.m3903(false);
            c0433.f1916.add(c5373);
            this.f67559++;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m36230(String str) throws IOException {
        throw new IOException(C20094.m46315("Cannot create symbolic link because it already exists: ", str));
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m36232(AbstractC3163 abstractC3163, String str) throws IOException {
        if (abstractC3163.mo9691(str)) {
            throw new IOException(C4860.m14172("File '", str, "' exists but is a directory"));
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m36225(AbstractC3163 abstractC3163, String str) throws IOException {
        if (!abstractC3163.mo9691(str)) {
            throw new IOException(C4860.m14172("File '", str, "' exists but is not a directory"));
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m36233(AbstractC15440 abstractC15440) throws IOException {
        if (abstractC15440.mo23113()) {
            throw new IOException("File '" + abstractC15440 + "' exists but is a directory");
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m36226(AbstractC15440 abstractC15440) throws IOException {
        if (abstractC15440.mo23113()) {
            return;
        }
        throw new IOException("File '" + abstractC15440 + "' exists but is not a directory");
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m36234(C0433 c0433) {
        if (c0433.m3909()) {
            return;
        }
        if (!c0433.m3879()) {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            c0433.f4129 = countDownLatch;
            Iterator it = c0433.m1988().iterator();
            while (it.hasNext()) {
                ((AbstractC1139) it.next()).mo1984(countDownLatch);
            }
        }
        for (AbstractC1139 abstractC1139 : c0433.m1988()) {
            if (abstractC1139.m3888()) {
                m36234(abstractC1139.mo1983());
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36237(C20323 c20323) {
        m36219(this.f46804, c20323);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m36219(ArrayList arrayList, InterfaceC8195 interfaceC8195) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractC1139 abstractC1139 = (AbstractC1139) it.next();
            C20323 c20323 = (C20323) interfaceC8195;
            String str = c20323.f65628;
            C19247 c19247 = c20323.f65629;
            int i = c20323.f65630;
            int i2 = C13266.f39727;
            if (!abstractC1139.m3888()) {
                StringBuilder sbM15339 = C5368.m15339(str);
                sbM15339.append(abstractC1139.m3898());
                C3545 entry = c19247.getEntry(sbM15339.toString());
                if (entry != null && (i == 2 || abstractC1139.m3887() <= entry.getTime())) {
                    it.remove();
                    this.f67559--;
                    if (abstractC1139.m3888()) {
                        m36231(abstractC1139.mo1983());
                    } else {
                        this.f67560 -= abstractC1139.f4124;
                    }
                }
            }
            if (abstractC1139.m3888()) {
                m36219(abstractC1139.mo1983().f1916, interfaceC8195);
            }
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m36231(C0433 c0433) {
        for (AbstractC1139 abstractC1139 : c0433.f1916) {
            this.f67559--;
            if (abstractC1139.m3888()) {
                m36231(abstractC1139.mo1983());
            } else {
                this.f67560 -= abstractC1139.f4124;
            }
        }
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final List m36248() {
        return C20195.unmodifiableList(this.f46804);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final List m36244() {
        return C20195.unmodifiableList(this.f46808);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m36243(boolean z) {
        if (Build.VERSION.SDK_INT < 30) {
            return true;
        }
        C8055 c8055 = new C8055();
        Iterator it = C20195.unmodifiableList(this.f46804).iterator();
        while (it.hasNext()) {
            ((AbstractC1139) it.next()).m3883(c8055, z);
        }
        return c8055.m21437();
    }
}
