package l;

import android.content.DialogInterface;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.StructStat;
import bin.mt.plus.Features;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import com.alipay.sdk.m.m.b;
import com.google.android.material.motion.MotionUtils;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.function.BooleanSupplier;

/* JADX INFO: renamed from: l.ܽܽ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 22BV */
/* JADX INFO: loaded from: classes.dex */
public final class C16773 extends AbstractC16891 {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static C16415 f51514;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static InterfaceC19944 f51515;

    /* JADX INFO: renamed from: ܿ᩶᩷, reason: not valid java name and contains not printable characters */
    private static final short[] f51516;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public static boolean f51517;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final AbstractC10128 f51518;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC10128 f51519;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public String f51520;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public String f51521;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final AbstractC10128 f51522;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final AbstractC10128 f51523;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final AbstractC10128 f51524;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final AbstractC10128 f51525;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final AbstractC10128 f51526;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final AbstractC10128 f51527;

    @Override // l.AbstractC16891
    /* JADX INFO: renamed from: ۗ */
    public final String mo6007() {
        return "local";
    }

    @Override // l.AbstractC16891
    /* JADX INFO: renamed from: ۤ */
    public native List mo6012();

    @Override // l.AbstractC16891
    /* JADX INFO: renamed from: ۧ֫ */
    public final boolean mo6015() {
        return true;
    }

    @Override // l.AbstractC16891
    /* JADX INFO: renamed from: ۫ */
    public final boolean mo6016() {
        return true;
    }

    @Override // l.AbstractC16891
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final AbstractC15440 mo39506() {
        return null;
    }

    @Override // l.AbstractC16891
    /* JADX INFO: renamed from: ᩺ */
    public final void mo6021() {
    }

    static {
        ApplicationC12518.m30701(128);
        f51516 = new short[]{5018, -16851, -16829, -16788, -16794, -16784, -16787, -16789, -16794, -16851, -16794, -16797, -16778, -16797, -16829, -16788, -16794, -16784, -16787, -16789, -16794, -16851, -16794, -16797, -16778, -16797, -16829, -16788, -16794, -16784, -16787, -16789, -16794, -16851, -16787, -16800, -16800, -10634, 13630, -11338, -16829, -16788, -16794, -16784, -16787, -16789, -16794, -16851, -16787, -16800, -16800};
        new C22254().m20274();
        f51514 = new C16415("local", null);
        f51515 = new C4615();
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static boolean m39498(String str) {
        InputStream resourceAsStream = C16773.class.getResourceAsStream(str);
        if (resourceAsStream == null) {
            return false;
        }
        C0349.m1793(resourceAsStream);
        return true;
    }

    public C16773(String str) {
        super(0, str);
        InterfaceC19944 interfaceC19944 = f51515;
        this.f51518 = new C3204(this, interfaceC19944);
        this.f51524 = new C13081(this, interfaceC19944);
        this.f51525 = new C12376(this);
        this.f51526 = new C10260(this);
        this.f51523 = new C6026(this);
        this.f51522 = new C11130(this);
        this.f51519 = new C15197(this);
        this.f51527 = new C21549(this);
    }

    public C16773(C12951 c12951) {
        super(c12951);
        InterfaceC19944 interfaceC19944 = f51515;
        this.f51518 = new C3204(this, interfaceC19944);
        this.f51524 = new C13081(this, interfaceC19944);
        this.f51525 = new C12376(this);
        this.f51526 = new C10260(this);
        this.f51523 = new C6026(this);
        this.f51522 = new C11130(this);
        this.f51519 = new C15197(this);
        this.f51527 = new C21549(this);
    }

    @Override // l.AbstractC16891
    /* JADX INFO: renamed from: ֫ */
    public final void mo6004(C10130 c10130) {
        super.mo6004(c10130);
    }

    @Override // l.AbstractC16891
    /* JADX INFO: renamed from: ܿ */
    public final void mo35230(String str) {
        super.mo35230(str);
        if (mo39505()) {
            C11003.requireNonNull(f51514.f50494);
            str = AbstractC16891.m39731(f51514.f50494);
            this.f51520 = str;
        } else {
            this.f51520 = null;
        }
        try {
            this.f51521 = C20402.m46728(str);
        } catch (IOException unused) {
            this.f51521 = str;
        }
    }

    @Override // l.AbstractC16891
    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final String mo39508() {
        return this.f51520;
    }

    @Override // l.AbstractC16891
    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final boolean mo39505() {
        return m39741().startsWith("//SEARCH//");
    }

    @Override // l.AbstractC16891
    /* JADX INFO: renamed from: ۟ */
    public final boolean mo6011() {
        return (this.f51521.startsWith("/proc/") || this.f51521.startsWith("/dev/")) ? false : true;
    }

    @Override // l.AbstractC16891
    /* JADX INFO: renamed from: ۧ */
    public final String mo35228(C16560 c16560) {
        try {
            C5292 c5292 = new C5292(this.f51521);
            long jM15219 = c5292.m15219();
            long jM15220 = c5292.m15220();
            if (jM15220 == 0) {
                return null;
            }
            return C4925.m14306(R.string.MT_Protector, C22927.m51020(jM15220 - jM15219), C22927.m51020(jM15220));
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // l.AbstractC16891
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String mo39507() {
        return this.f51521;
    }

    @Override // l.AbstractC16891
    /* JADX INFO: renamed from: ۙ */
    public final String mo6009() {
        if (mo39505()) {
            return AbstractC16891.m39728(this.f51520) + " - " + C4925.m14327(R.string.MT_Protector);
        }
        return super.mo6009();
    }

    @Override // l.AbstractC16891
    /* JADX INFO: renamed from: ᩶ */
    public final AbstractC13921 mo6020() {
        return C2499.f7958;
    }

    @Override // l.AbstractC16891
    /* JADX INFO: renamed from: ۧ */
    public final void mo14824(boolean z) {
        ArrayList arrayList;
        super.mo14824(z);
        C18838.m43521();
        if (mo39505()) {
            C16415 c16415 = f51514;
            synchronized (c16415) {
                arrayList = new ArrayList(c16415.f50492);
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((C9555) ((C12182) it.next()).m29658()).m24432();
            }
        }
    }

    @Override // l.AbstractC16891
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC1661 mo39503(C2450 c2450) {
        AbstractC1661 abstractC1661M23655 = C9214.m23655(c2450);
        if (abstractC1661M23655 == C22081.m49676()) {
            abstractC1661M23655 = new C22081();
        }
        return abstractC1661M23655.mo5603(new C1431());
    }

    @Override // l.AbstractC16891
    /* JADX INFO: renamed from: ۧ */
    public final AbstractC1661 mo15165(C2450 c2450) {
        AbstractC1661 c17909;
        if (!c2450.m7919().m39035(b.k)) {
            c17909 = new C17909(R.string.MT_Protector, R.drawable.MT_Protector);
            c17909.m5604();
        } else {
            c17909 = new C1894("local");
        }
        return c17909.mo5603(new C14380());
    }

    @Override // l.AbstractC16891
    /* JADX INFO: renamed from: ֡ */
    public final AbstractC1661 mo15159() {
        return new C8031();
    }

    @Override // l.AbstractC16891
    /* JADX INFO: renamed from: ᩴ */
    public final AbstractC1661 mo15172() {
        if (mo39505()) {
            C12448 c12448 = new C12448(R.string.MT_Protector, R.drawable.MT_Protector);
            c12448.m5604();
            return c12448;
        }
        return new C18615();
    }

    @Override // l.AbstractC16891
    /* JADX INFO: renamed from: ܺ */
    public final AbstractC1661 mo15169() {
        C12720 c12720 = new C12720(R.string.MT_Protector, R.drawable.MT_Protector);
        c12720.f38273 = new ArrayList();
        return c12720;
    }

    @Override // l.AbstractC16891
    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final AbstractC1661 mo39504() {
        if (mo39505()) {
            return new C10332(R.string.MT_Protector, R.drawable.MT_Protector);
        }
        return new C24009(R.string.MT_Protector, R.drawable.MT_Protector);
    }

    @Override // l.AbstractC16891
    /* JADX INFO: renamed from: ۘ */
    public final AbstractC1661 mo6008() {
        return new DialogInterfaceOnDismissListenerC8215();
    }

    @Override // l.AbstractC16891
    /* JADX INFO: renamed from: ۢ */
    public final AbstractC1661 mo15164() {
        return new C1099(R.string.MT_Protector, R.drawable.MT_Protector);
    }

    @Override // l.AbstractC16891
    /* JADX INFO: renamed from: ֫ */
    public final void mo35226(final C16560 c16560, InterfaceC17889 interfaceC17889) {
        C18739 c18739;
        if (!C9255.m23780()) {
            AbstractC15440 abstractC15440Mo24433 = interfaceC17889.mo24433();
            if (abstractC15440Mo24433 instanceof C12993) {
                final C12993 c12993 = (C12993) abstractC15440Mo24433;
                if (C9255.m23770()) {
                    final C16477 c16477Mo24428 = interfaceC17889.mo24428();
                    int iM38842 = c16477Mo24428.m38842();
                    if ((c16477Mo24428.m38838() < 10000 || (iM38842 & 4) == 0) && (iM38842 & 36) == 0) {
                        c18739 = new C18739(c16560, new BooleanSupplier() { // from class: l.ᩴۧ᩻
                            @Override // java.util.function.BooleanSupplier
                            public final boolean getAsBoolean() {
                                C12993 c12994 = c12993;
                                C16477 c16477 = c16477Mo24428;
                                int iM38843 = c16477.m38842();
                                boolean z = false;
                                if ((c16477.m38838() < 10000 || (iM38843 & 4) == 0) && (iM38843 & 36) == 0) {
                                    try {
                                        c12994.mo27926().close();
                                    } catch (IOException unused) {
                                        z = true;
                                    }
                                }
                                return !z;
                            }
                        }, interfaceC17889, new Runnable() { // from class: l.᩵ۧ᩻
                            @Override // java.lang.Runnable
                            public final void run() {
                                Main mainM39056 = c16560.m39056();
                                C16477 c16477 = c16477Mo24428;
                                C19445.m44786(mainM39056, c12993.mo23554(), C10881.m27180(c16477.m38842()), c16477.m38837(), c16477.m38833());
                            }
                        });
                    } else {
                        C19568.m45012(c16560, interfaceC17889);
                        return;
                    }
                } else if (Build.VERSION.SDK_INT >= 30 && c12993.mo31568()) {
                    final Uri uriMo31567 = c12993.mo31567();
                    c18739 = new C18739(c16560, new BooleanSupplier() { // from class: l.֡ۧ᩻
                        @Override // java.util.function.BooleanSupplier
                        public final boolean getAsBoolean() {
                            try {
                                ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = C4925.m14336().openFileDescriptor(uriMo31567, "r");
                                if (parcelFileDescriptorOpenFileDescriptor != null) {
                                    parcelFileDescriptorOpenFileDescriptor.close();
                                }
                                return true;
                            } catch (Exception e) {
                                String message = e.getMessage();
                                return message == null || !message.contains("Permission denied");
                            }
                        }
                    }, interfaceC17889, new Runnable() { // from class: l.ۚۧ᩻
                        @Override // java.lang.Runnable
                        public final void run() {
                            C19445.m44786(c16560.m39056(), c12993.mo23554(), "unknown", "unknown", "unknown");
                        }
                    });
                }
                c18739.m20274();
                return;
            }
            if (abstractC15440Mo24433 instanceof C11893) {
                C11893 c11893 = (C11893) abstractC15440Mo24433;
                try {
                    StructStat structStatLstat = Os.lstat(c11893.m29018());
                    int i = structStatLstat.st_mode;
                    boolean z = false;
                    if ((structStatLstat.st_gid < 10000 || (i & 4) == 0) && (i & 36) == 0) {
                        try {
                            c11893.mo27926().close();
                        } catch (IOException unused) {
                            z = true;
                        }
                    }
                    if (z) {
                        C19445.m44786(c16560.m39056(), c11893.mo23554(), C10881.m27180(structStatLstat.st_mode), Features.m56(structStatLstat.st_uid), Features.m56(structStatLstat.st_gid));
                        return;
                    }
                } catch (ErrnoException unused2) {
                }
            }
        }
        C19568.m45012(c16560, interfaceC17889);
    }

    @Override // l.AbstractC16891
    /* JADX INFO: renamed from: ֫ */
    public final void mo15162(InterfaceC17889 interfaceC17889) {
        String path = interfaceC17889.getPath();
        C9068 c9068 = C9068.f27496;
        C11233.m27805(path, MotionUtils.EASING_TYPE_PATH);
        C9068.m23402(path, (C17534) null);
    }

    @Override // l.AbstractC16891
    /* JADX INFO: renamed from: ֫ */
    public final void mo15160(String str, boolean z) {
        C9068 c9068 = C9068.f27496;
        C11233.m27805(str, MotionUtils.EASING_TYPE_PATH);
        C9068.m23402(str, (C17534) null);
    }

    /* JADX WARN: Code duplicated, block: B:73:0x015c  */
    /* JADX WARN: Switch 'out' block B:33:0x0073 for B:30:0x0064 already processed. Defaulting to fallback option. */
    @Override // l.AbstractC16891
    /* JADX INFO: renamed from: ֫ */
    public final void mo26935(C2450 c2450, ArrayList arrayList) {
        boolean z;
        boolean z2;
        if (c2450.m7923()) {
            z = false;
            z2 = false;
        } else {
            Iterator it = c2450.m7909().iterator();
            z2 = true;
            while (true) {
                if (it.hasNext()) {
                    InterfaceC17889 interfaceC17889 = (InterfaceC17889) it.next();
                    if (interfaceC17889.mo36969()) {
                        C2204 c2204Mo36973 = interfaceC17889.mo36973();
                        String strM7315 = c2204Mo36973.m7315();
                        strM7315.getClass();
                        switch (strM7315) {
                            case "application/vnd.android.package-archives":
                            case "application/x-jar":
                            case "application/zip":
                            case "application/vnd.android.package-archive":
                                continue;
                                break;
                            default:
                                if (!c2204Mo36973.m7312(4, 5)) {
                                    break;
                                } else {
                                    z2 = false;
                                    break;
                                }
                                break;
                        }
                    }
                    z = false;
                    z2 = false;
                } else {
                    z = true;
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        if (C13858.m33214(c2450)) {
            arrayList2.add(new C13858());
            arrayList2.add(new C13153());
        }
        C14173 c14173 = this.f51866;
        if (c14173 != null) {
            if (c14173.m33824("arsc")) {
                arrayList2.add(new C15584());
            } else if (this.f51866.m33824("dex")) {
                arrayList2.add(new C19114());
            } else if (this.f51866.m33824("folder")) {
                arrayList2.add(new C9942());
            } else if (this.f51866.m33824("zip") || this.f51866.m33823()) {
                arrayList2.add(new C15730());
                C14173 c14174 = this.f51866;
                if (!"jar".equals(c14174.f42798) || !"jar".equals(c14174.f42799)) {
                    C14173 c14175 = this.f51866;
                    String str = c14175.f42799;
                    String str2 = c14175.f42798;
                    if (("jar".equals(str2) && "apk".equals(str)) || ("apk".equals(str2) && "jar".equals(str))) {
                        arrayList2.add(new C19114());
                    }
                } else {
                    arrayList2.add(new C19114());
                }
            } else if (this.f51866.m33824("apk")) {
                arrayList2.add(new C15730(R.string.MT_Protector, R.drawable.MT_Protector));
                arrayList2.add(new C19114());
                arrayList2.add(new C15584());
                arrayList2.add(new C9236());
            } else if (!z) {
                arrayList2.add(new C16436());
            }
            if (!this.f51866.m33824("folder")) {
                C14173 c14176 = this.f51866;
                if (c14176.f42801 == c14176.f42803) {
                    if (arrayList2.size() % 2 == 0) {
                        arrayList2.add(0, new C7119());
                    } else {
                        arrayList2.add(new C7119());
                    }
                }
            }
        }
        int iM39730 = AbstractC16891.m39730();
        if (z && z2) {
            int i = iM39730 % 2 != 0 ? iM39730 - 1 : iM39730;
            arrayList.add(i, new C2571());
            arrayList.add(i + 1, new C0269(R.string.MT_Protector, R.drawable.MT_Protector));
            iM39730 += 2;
        } else if (z) {
            arrayList2.add(new C2571());
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        if (arrayList2.size() % 2 != 0 && !C2326.m7584().mo1456(c2450)) {
            arrayList.set(iM39730, (AbstractC1661) arrayList2.remove(0));
        }
        arrayList.addAll(arrayList2);
    }

    @Override // l.AbstractC16891
    /* JADX INFO: renamed from: ᩻ */
    public final InterfaceC10834 mo14827() {
        return C20844.f67485;
    }

    @Override // l.AbstractC16891
    /* JADX INFO: renamed from: ܳ */
    public final C12244 mo6017() {
        if (mo39505()) {
            return new C12244(C4925.m14327(R.string.MT_Protector), this.f51520, C19883.f64194);
        }
        String strM39741 = m39741();
        return new C12244(C9523.m24392(strM39741), strM39741, C19883.f64181);
    }

    @Override // l.AbstractC16891
    /* JADX INFO: renamed from: ۧ */
    public final AbstractC15440 mo6013(InterfaceC17889 interfaceC17889) {
        return interfaceC17889.mo24433();
    }

    @Override // l.AbstractC16891
    /* JADX INFO: renamed from: ֫ */
    public final void mo6005(C16560 c16560, List list, Runnable runnable) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C10211 c10211 = (C10211) it.next();
            AbstractC15440 abstractC15440M39866 = C16999.m39866(c10211.m25623(), new String[0]);
            c10211.m25620(abstractC15440M39866);
            arrayList.add(new C5977(abstractC15440M39866, abstractC15440M39866.getName(), abstractC15440M39866.mo23554()));
        }
        m39736((List) arrayList);
        try {
            runnable.run();
        } catch (Throwable th) {
            c16560.m39056().m10223(th, (DialogInterface.OnDismissListener) null);
        }
    }

    @Override // l.AbstractC16891
    /* JADX INFO: renamed from: ֫֫ */
    public final boolean mo15163() {
        return (C15871.m37616() || mo39505()) ? false : true;
    }

    @Override // l.AbstractC16891
    /* JADX INFO: renamed from: ֫ */
    public final void mo15161(C16560 c16560, String str, boolean z) throws C1637 {
        boolean zMo23546;
        Main mainM39056;
        String strConcat;
        if (mo39505()) {
            return;
        }
        try {
            C17721.m41503(this.f51521, EnumC16309.MODIFY_DIRECTORY_LINKED);
            AbstractC15440 abstractC15440M39866 = str.startsWith("/") ? C16999.m39866(str, new String[0]) : C16999.m39866(m39741(), str);
            if (abstractC15440M39866.mo23120()) {
                if (abstractC15440M39866.mo23113()) {
                    throw new C1637(R.string.MT_Protector);
                }
                throw new C1637(R.string.MT_Protector);
            }
            if (z) {
                zMo23546 = abstractC15440M39866.mo23546();
            } else {
                AbstractC15440 abstractC15440M36536 = abstractC15440M39866.m36536();
                zMo23546 = (abstractC15440M36536 == null || abstractC15440M36536.mo23120() || abstractC15440M36536.mo23546()) && abstractC15440M39866.mo23545();
            }
            if (!zMo23546) {
                if (z) {
                    mainM39056 = c16560.m39056();
                    strConcat = "Failed to create directory: ".concat(str);
                } else {
                    mainM39056 = c16560.m39056();
                    strConcat = "Failed to create file: ".concat(str);
                }
                mainM39056.m10221(strConcat, false);
                C15528.m36596();
                return;
            }
            c16560.m39053(abstractC15440M39866.getName());
            if (str.indexOf(47) == -1) {
                C15528.m36596();
            } else {
                c16560.m39033(abstractC15440M39866.getParent(), true);
            }
        } catch (C1637 e) {
            c16560.m39056().m10223(e, (DialogInterface.OnDismissListener) null);
        }
    }

    @Override // l.AbstractC16891
    /* JADX INFO: renamed from: ֫ */
    public final void mo6006(C16560 c16560, C16560 c16561) {
        c16560.m38998("local");
        if (!c16561.m39035("local")) {
            C9340 c9340M39016 = c16560.m39016();
            c9340M39016.m24060(c16561, c9340M39016.m24080(), false);
        }
        c16560.m39018();
    }

    @Override // l.AbstractC16891
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo6014(String str) {
        AbstractC15440 abstractC15440M39866 = C16999.m39866(str, new String[0]);
        return abstractC15440M39866.mo23120() && !abstractC15440M39866.mo23113();
    }

    @Override // l.AbstractC16891
    /* JADX INFO: renamed from: ܽ */
    public final void mo6018(C16560 c16560) {
        if (c16560.m39037()) {
            return;
        }
        List<C5977> listM39739 = m39739();
        if (listM39739.isEmpty()) {
            return;
        }
        m39736((List) null);
        boolean zMo39505 = mo39505();
        ArrayList arrayList = new ArrayList();
        for (C5977 c5977 : listM39739) {
            if (c5977.m16773()) {
                arrayList.add(zMo39505 ? c5977.m16770() : c5977.m16774());
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        if (zMo39505) {
            c16560.m38999(arrayList);
        } else {
            c16560.m39000((Collection) arrayList);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m39495(C12951 c12951) {
        C16415 c16415 = new C16415("local", c12951.m31503());
        c16415.f50491 = c12951.readInt();
        int i = c12951.readInt();
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            String strM31506 = c12951.m31506();
            String strM31507 = c12951.m31506();
            AbstractC15440 abstractC15440M39866 = C16999.m39866(strM31506, new String[0]);
            if (abstractC15440M39866 instanceof InterfaceC21855) {
                abstractC15440M39866 = ((InterfaceC21855) abstractC15440M39866).mo27913();
            }
            arrayList.add(new C12182(new C9555(abstractC15440M39866), strM31507));
        }
        BitSet bitSetValueOf = BitSet.valueOf(c12951.m31496());
        for (int i3 = 0; i3 < i; i3++) {
            if (bitSetValueOf.get(i3)) {
                ((C12182) arrayList.get(i3)).f36324 = true;
            }
        }
        c16415.f50492 = arrayList;
        f51514 = c16415;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m39499(C10130 c10130) {
        ArrayList arrayList;
        C16415 c16415 = f51514;
        c10130.m25424(c16415.f50494);
        c10130.writeInt(c16415.f50491);
        synchronized (c16415) {
            arrayList = new ArrayList(c16415.f50492);
        }
        c10130.writeInt(arrayList.size());
        BitSet bitSet = new BitSet(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C12182 c12182 = (C12182) arrayList.get(i);
            c10130.m25439(c12182.m29658().getPath());
            c10130.m25439(c12182.m29662());
            bitSet.set(i, c12182.f36324);
        }
        c10130.m25434(bitSet.toByteArray());
    }

    @Override // l.AbstractC16891
    /* JADX INFO: renamed from: ۛ */
    public final List mo6010() {
        return Arrays.asList(AbstractC16891.f51864, this.f51518, this.f51524, this.f51525, AbstractC16891.f51865, AbstractC16891.f51860, AbstractC16891.f51857, this.f51519, this.f51522, this.f51526, this.f51523, this.f51527);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m39496(final C16560 c16560, final int i) {
        C13698 c13698M27502 = C11083.m27502();
        boolean z = false;
        if (!c13698M27502.m32947()) {
            C11083 c11083M128 = c16560.m39056().m128();
            String str = C16999.m39866(m39741(), new String[0]).mo31566().m31565() + "/*";
            if (c13698M27502.m32949()) {
                c11083M128.m27513(str, false, c13698M27502, new Runnable() { // from class: l.֨ۧ᩻
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f3982.m39496(c16560, i);
                    }
                });
                return;
            } else {
                c11083M128.m27515(str);
                return;
            }
        }
        C8055 c8055 = new C8055();
        List<PackageInfo> installedPackages = C4925.m14320().getInstalledPackages(0);
        HashMap map = new HashMap(installedPackages.size());
        for (PackageInfo packageInfo : installedPackages) {
            map.put(packageInfo.packageName, packageInfo);
        }
        if (Build.VERSION.SDK_INT == 33) {
            Iterator it = C16999.m39866(c16560.m39058(), new String[0]).mo23549(true).iterator();
            while (it.hasNext()) {
                c8055.m21436((AbstractC15440) it.next());
            }
        } else {
            Iterator<PackageInfo> it2 = installedPackages.iterator();
            while (it2.hasNext()) {
                String str2 = it2.next().packageName;
                if (!str2.equals("android")) {
                    c8055.m21436(C16999.m39866(c16560.m39058(), str2));
                }
            }
            z = true;
        }
        List listM21438 = c8055.m21438();
        if (listM21438.isEmpty()) {
            C21374.m48457(R.string.MT_Protector);
            return;
        }
        ArrayList arrayList = new ArrayList(listM21438.size());
        Iterator it3 = listM21438.iterator();
        while (it3.hasNext()) {
            PackageInfo packageInfo2 = (PackageInfo) map.get(((C12993) it3.next()).getName());
            if (packageInfo2 != null) {
                arrayList.add(packageInfo2);
            }
        }
        Collections.sort(arrayList, new C4636(1));
        C9719 c9719 = new C9719(c16560.m39056(), arrayList);
        c9719.m24712(i);
        c9719.m24713(new C21597(listM21438, c16560));
        if (z) {
            c9719.m24714(new ViewOnClickListenerC22302(1, c16560));
        }
        c9719.m24711();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m39494(List list, C16560 c16560, ArrayList arrayList) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Set set = (Set) C5378.stream(arrayList).map(new C7915(2)).collect(C22976.toSet());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C12993 c12993 = (C12993) it.next();
            if (set.contains(c12993.getName())) {
                linkedHashSet.add(c12993.m31565());
            }
        }
        if (linkedHashSet.isEmpty()) {
            return;
        }
        c16560.m39056().m128().m27514(linkedHashSet);
    }
}
