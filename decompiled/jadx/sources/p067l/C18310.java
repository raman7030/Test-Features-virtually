package p067l;

import android.content.DialogInterface;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.StructStat;
import bin.p000mt.plus.Features;
import bin.p000mt.plus.Main;
import bin.p000mt.plus.R;
import com.alipay.sdk.p010m.p035m.C0168b;
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
public final class C18310 extends AbstractC18422 {

    /* JADX INFO: renamed from: ۟ */
    public static C17969 f54697;

    /* JADX INFO: renamed from: ܰ */
    public static InterfaceC21323 f54698;

    /* JADX INFO: renamed from: ܿ᩶᩷, reason: not valid java name and contains not printable characters */
    private static final short[] f82269;

    /* JADX INFO: renamed from: ᩺ */
    public static boolean f54699;

    /* JADX INFO: renamed from: ۗ */
    public final AbstractC11994 f54700;

    /* JADX INFO: renamed from: ۙ */
    public final AbstractC11994 f54701;

    /* JADX INFO: renamed from: ۛ */
    public String f54702;

    /* JADX INFO: renamed from: ۤ */
    public String f54703;

    /* JADX INFO: renamed from: ۨ */
    public final AbstractC11994 f54704;

    /* JADX INFO: renamed from: ۫ */
    public final AbstractC11994 f54705;

    /* JADX INFO: renamed from: ۬ */
    public final AbstractC11994 f54706;

    /* JADX INFO: renamed from: ᩶ */
    public final AbstractC11994 f54707;

    /* JADX INFO: renamed from: ᩸ */
    public final AbstractC11994 f54708;

    /* JADX INFO: renamed from: ᩹ */
    public final AbstractC11994 f54709;

    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ۗ */
    public final String mo8204() {
        return "local";
    }

    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ۤ */
    public native List mo8209();

    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ۧ֫ */
    public final boolean mo8212() {
        return true;
    }

    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ۫ */
    public final boolean mo8213() {
        return true;
    }

    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ᩳ */
    public final AbstractC17043 mo41742() {
        return null;
    }

    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ᩺ */
    public final void mo8218() {
    }

    static {
        ApplicationC14266.m56479(128);
        f82269 = new short[]{5018, -16851, -16829, -16788, -16794, -16784, -16787, -16789, -16794, -16851, -16794, -16797, -16778, -16797, -16829, -16788, -16794, -16784, -16787, -16789, -16794, -16851, -16794, -16797, -16778, -16797, -16829, -16788, -16794, -16784, -16787, -16789, -16794, -16851, -16787, -16800, -16800, -10634, 13630, -11338, -16829, -16788, -16794, -16784, -16787, -16789, -16794, -16851, -16787, -16800, -16800};
        new C23519().m22250();
        f54697 = new C17969("local", null);
        f54698 = new C6755();
    }

    /* JADX INFO: renamed from: ۜ */
    public static boolean m41734(String str) {
        InputStream resourceAsStream = C18310.class.getResourceAsStream(str);
        if (resourceAsStream == null) {
            return false;
        }
        C2700.m4192(resourceAsStream);
        return true;
    }

    public C18310(String str) {
        super(0, str);
        InterfaceC21323 interfaceC21323 = f54698;
        this.f54700 = new C5414(this, interfaceC21323);
        this.f54706 = new C14801(this, interfaceC21323);
        this.f54707 = new C14131(this);
        this.f54708 = new C12120(this);
        this.f54705 = new C8096(this);
        this.f54704 = new C12947(this);
        this.f54701 = new C16812(this);
        this.f54709 = new C22849(this);
    }

    public C18310(C14677 c14677) {
        super(c14677);
        InterfaceC21323 interfaceC21323 = f54698;
        this.f54700 = new C5414(this, interfaceC21323);
        this.f54706 = new C14801(this, interfaceC21323);
        this.f54707 = new C14131(this);
        this.f54708 = new C12120(this);
        this.f54705 = new C8096(this);
        this.f54704 = new C12947(this);
        this.f54701 = new C16812(this);
        this.f54709 = new C22849(this);
    }

    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ֫ */
    public final void mo8201(C11996 c11996) {
        super.mo8201(c11996);
    }

    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ܿ */
    public final void mo37385(String str) {
        super.mo37385(str);
        if (mo41741()) {
            C12826.requireNonNull(f54697.f53666);
            str = AbstractC18422.m41972(f54697.f53666);
            this.f54702 = str;
        } else {
            this.f54702 = null;
        }
        try {
            this.f54703 = C21759.m49051(str);
        } catch (IOException unused) {
            this.f54703 = str;
        }
    }

    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ᩹ */
    public final String mo41744() {
        return this.f54702;
    }

    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ۬ */
    public final boolean mo41741() {
        return m41982().startsWith("//SEARCH//");
    }

    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ۟ */
    public final boolean mo8208() {
        return (this.f54703.startsWith("/proc/") || this.f54703.startsWith("/dev/")) ? false : true;
    }

    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ۧ */
    public final String mo37383(C18107 c18107) {
        try {
            C7398 c7398 = new C7398(this.f54703);
            long jM17122 = c7398.m17122();
            long jM17123 = c7398.m17123();
            if (jM17123 == 0) {
                return null;
            }
            return C7050.m16203(R.string.MT_Protector, C24158.m53411(jM17123 - jM17122), C24158.m53411(jM17123));
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ᩸ */
    public final String mo41743() {
        return this.f54703;
    }

    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ۙ */
    public final String mo8206() {
        if (mo41741()) {
            return AbstractC18422.m41969(this.f54702) + " - " + C7050.m16224(R.string.MT_Protector);
        }
        return super.mo8206();
    }

    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ᩶ */
    public final AbstractC15599 mo8217() {
        return C4744.f10749;
    }

    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ۧ */
    public final void mo16732(boolean z) {
        ArrayList arrayList;
        super.mo16732(z);
        C20272.m45787();
        if (mo41741()) {
            C17969 c17969 = f54697;
            synchronized (c17969) {
                arrayList = new ArrayList(c17969.f53664);
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((C11450) ((C13946) it.next()).m31720()).m26444();
            }
        }
    }

    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC3947 mo41739(C4697 c4697) {
        AbstractC3947 abstractC3947M25654 = C11126.m25654(c4697);
        if (abstractC3947M25654 == C23354.m52014()) {
            abstractC3947M25654 = new C23354();
        }
        return abstractC3947M25654.mo7833(new C3729());
    }

    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ۧ */
    public final AbstractC3947 mo17068(C4697 c4697) {
        AbstractC3947 c19389;
        if (!c4697.m9967().m41261(C0168b.f616k)) {
            c19389 = new C19389(R.string.MT_Protector, R.drawable.MT_Protector);
            c19389.m7834();
        } else {
            c19389 = new C4169("local");
        }
        return c19389.mo7833(new C16035());
    }

    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ֡ */
    public final AbstractC3947 mo17062() {
        return new C10001();
    }

    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ᩴ */
    public final AbstractC3947 mo17075() {
        if (mo41741()) {
            C14199 c14199 = new C14199(R.string.MT_Protector, R.drawable.MT_Protector);
            c14199.m7834();
            return c14199;
        }
        return new C20060();
    }

    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ܺ */
    public final AbstractC3947 mo17072() {
        C14458 c14458 = new C14458(R.string.MT_Protector, R.drawable.MT_Protector);
        c14458.f41302 = new ArrayList();
        return c14458;
    }

    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ۡ */
    public final AbstractC3947 mo41740() {
        if (mo41741()) {
            return new C12188(R.string.MT_Protector, R.drawable.MT_Protector);
        }
        return new C25187(R.string.MT_Protector, R.drawable.MT_Protector);
    }

    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ۘ */
    public final AbstractC3947 mo8205() {
        return new DialogInterfaceOnDismissListenerC10176();
    }

    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ۢ */
    public final AbstractC3947 mo17067() {
        return new C3413(R.string.MT_Protector, R.drawable.MT_Protector);
    }

    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ֫ */
    public final void mo37381(final C18107 c18107, InterfaceC19370 interfaceC19370) {
        C20178 c20178;
        if (!C11164.m25781()) {
            AbstractC17043 abstractC17043Mo26445 = interfaceC19370.mo26445();
            if (abstractC17043Mo26445 instanceof C14717) {
                final C14717 c14717 = (C14717) abstractC17043Mo26445;
                if (C11164.m25771()) {
                    final C18028 c18028Mo26440 = interfaceC19370.mo26440();
                    int iM41068 = c18028Mo26440.m41068();
                    if ((c18028Mo26440.m41064() < 10000 || (iM41068 & 4) == 0) && (iM41068 & 36) == 0) {
                        c20178 = new C20178(c18107, new BooleanSupplier() { // from class: l.ᩴۧ᩻
                            @Override // java.util.function.BooleanSupplier
                            public final boolean getAsBoolean() {
                                C14717 c14718 = c14717;
                                C18028 c18028 = c18028Mo26440;
                                int iM41069 = c18028.m41068();
                                boolean z = false;
                                if ((c18028.m41064() < 10000 || (iM41069 & 4) == 0) && (iM41069 & 36) == 0) {
                                    try {
                                        c14718.mo29987().close();
                                    } catch (IOException unused) {
                                        z = true;
                                    }
                                }
                                return !z;
                            }
                        }, interfaceC19370, new Runnable() { // from class: l.᩵ۧ᩻
                            @Override // java.lang.Runnable
                            public final void run() {
                                Main mainM41282 = c18107.m41282();
                                C18028 c18028 = c18028Mo26440;
                                C20849.m47081(mainM41282, c14717.mo25505(), C12710.m29225(c18028.m41068()), c18028.m41063(), c18028.m41059());
                            }
                        });
                    } else {
                        C20966.m47307(c18107, interfaceC19370);
                        return;
                    }
                } else if (Build.VERSION.SDK_INT >= 30 && c14717.mo33653()) {
                    final Uri uriMo33652 = c14717.mo33652();
                    c20178 = new C20178(c18107, new BooleanSupplier() { // from class: l.֡ۧ᩻
                        @Override // java.util.function.BooleanSupplier
                        public final boolean getAsBoolean() {
                            try {
                                ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = C7050.m16233().openFileDescriptor(uriMo33652, "r");
                                if (parcelFileDescriptorOpenFileDescriptor != null) {
                                    parcelFileDescriptorOpenFileDescriptor.close();
                                }
                                return true;
                            } catch (Exception e) {
                                String message = e.getMessage();
                                return message == null || !message.contains("Permission denied");
                            }
                        }
                    }, interfaceC19370, new Runnable() { // from class: l.ۚۧ᩻
                        @Override // java.lang.Runnable
                        public final void run() {
                            C20849.m47081(c18107.m41282(), c14717.mo25505(), "unknown", "unknown", "unknown");
                        }
                    });
                }
                c20178.m22250();
                return;
            }
            if (abstractC17043Mo26445 instanceof C13672) {
                C13672 c13672 = (C13672) abstractC17043Mo26445;
                try {
                    StructStat structStatLstat = Os.lstat(c13672.m31070());
                    int i = structStatLstat.st_mode;
                    boolean z = false;
                    if ((structStatLstat.st_gid < 10000 || (i & 4) == 0) && (i & 36) == 0) {
                        try {
                            c13672.mo29987().close();
                        } catch (IOException unused) {
                            z = true;
                        }
                    }
                    if (z) {
                        C20849.m47081(c18107.m41282(), c13672.mo25505(), C12710.m29225(structStatLstat.st_mode), Features.m54(structStatLstat.st_uid), Features.m54(structStatLstat.st_gid));
                        return;
                    }
                } catch (ErrnoException unused2) {
                }
            }
        }
        C20966.m47307(c18107, interfaceC19370);
    }

    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ֫ */
    public final void mo17065(InterfaceC19370 interfaceC19370) {
        String path = interfaceC19370.getPath();
        C10987 c10987 = C10987.f30433;
        C13045.m29867(path, MotionUtils.EASING_TYPE_PATH);
        C10987.m25348(path, (C19033) null);
    }

    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ֫ */
    public final void mo17063(String str, boolean z) {
        C10987 c10987 = C10987.f30433;
        C13045.m29867(str, MotionUtils.EASING_TYPE_PATH);
        C10987.m25348(str, (C19033) null);
    }

    /* JADX WARN: Code duplicated, block: B:73:0x015c  */
    /* JADX WARN: Switch 'out' block B:33:0x0073 for B:30:0x0064 already processed. Defaulting to fallback option. */
    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ֫ */
    public final void mo28979(C4697 c4697, ArrayList arrayList) {
        boolean z;
        boolean z2;
        if (c4697.m9971()) {
            z = false;
            z2 = false;
        } else {
            Iterator it = c4697.m9957().iterator();
            z2 = true;
            while (true) {
                if (it.hasNext()) {
                    InterfaceC19370 interfaceC19370 = (InterfaceC19370) it.next();
                    if (interfaceC19370.mo39135()) {
                        C4463 c4463Mo39139 = interfaceC19370.mo39139();
                        String strM9394 = c4463Mo39139.m9394();
                        strM9394.getClass();
                        switch (strM9394) {
                            case "application/vnd.android.package-archives":
                            case "application/x-jar":
                            case "application/zip":
                            case "application/vnd.android.package-archive":
                                continue;
                                break;
                            default:
                                if (!c4463Mo39139.m9391(4, 5)) {
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
        if (C15539.m35333(c4697)) {
            arrayList2.add(new C15539());
            arrayList2.add(new C14869());
        }
        C15838 c15838 = this.f55046;
        if (c15838 != null) {
            if (c15838.m35956("arsc")) {
                arrayList2.add(new C17179());
            } else if (this.f55046.m35956("dex")) {
                arrayList2.add(new C20534());
            } else if (this.f55046.m35956("folder")) {
                arrayList2.add(new C11817());
            } else if (this.f55046.m35956("zip") || this.f55046.m35955()) {
                arrayList2.add(new C17318());
                C15838 c15839 = this.f55046;
                if (!"jar".equals(c15839.f45885) || !"jar".equals(c15839.f45886)) {
                    C15838 c158310 = this.f55046;
                    String str = c158310.f45886;
                    String str2 = c158310.f45885;
                    if (("jar".equals(str2) && "apk".equals(str)) || ("apk".equals(str2) && "jar".equals(str))) {
                        arrayList2.add(new C20534());
                    }
                } else {
                    arrayList2.add(new C20534());
                }
            } else if (this.f55046.m35956("apk")) {
                arrayList2.add(new C17318(R.string.MT_Protector, R.drawable.MT_Protector));
                arrayList2.add(new C20534());
                arrayList2.add(new C17179());
                arrayList2.add(new C11146());
            } else if (!z) {
                arrayList2.add(new C17989());
            }
            if (!this.f55046.m35956("folder")) {
                C15838 c158311 = this.f55046;
                if (c158311.f45888 == c158311.f45890) {
                    if (arrayList2.size() % 2 == 0) {
                        arrayList2.add(0, new C9134());
                    } else {
                        arrayList2.add(new C9134());
                    }
                }
            }
        }
        int iM41971 = AbstractC18422.m41971();
        if (z && z2) {
            int i = iM41971 % 2 != 0 ? iM41971 - 1 : iM41971;
            arrayList.add(i, new C4812());
            arrayList.add(i + 1, new C2624(R.string.MT_Protector, R.drawable.MT_Protector));
            iM41971 += 2;
        } else if (z) {
            arrayList2.add(new C4812());
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        if (arrayList2.size() % 2 != 0 && !C4579.m9654().mo3869(c4697)) {
            arrayList.set(iM41971, (AbstractC3947) arrayList2.remove(0));
        }
        arrayList.addAll(arrayList2);
    }

    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ᩻ */
    public final InterfaceC12665 mo16735() {
        return C22179.f70167;
    }

    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ܳ */
    public final C14005 mo8214() {
        if (mo41741()) {
            return new C14005(C7050.m16224(R.string.MT_Protector), this.f54702, C21265.f66830);
        }
        String strM41982 = m41982();
        return new C14005(C11419.m26402(strM41982), strM41982, C21265.f66817);
    }

    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ۧ */
    public final AbstractC17043 mo8210(InterfaceC19370 interfaceC19370) {
        return interfaceC19370.mo26445();
    }

    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ֫ */
    public final void mo8202(C18107 c18107, List list, Runnable runnable) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C12073 c12073 = (C12073) it.next();
            AbstractC17043 abstractC17043M42109 = C18524.m42109(c12073.m27645(), new String[0]);
            c12073.m27642(abstractC17043M42109);
            arrayList.add(new C8049(abstractC17043M42109, abstractC17043M42109.getName(), abstractC17043M42109.mo25505()));
        }
        m41977((List) arrayList);
        try {
            runnable.run();
        } catch (Throwable th) {
            c18107.m41282().m12259(th, (DialogInterface.OnDismissListener) null);
        }
    }

    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ֫֫ */
    public final boolean mo17066() {
        return (C17452.m39788() || mo41741()) ? false : true;
    }

    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ֫ */
    public final void mo17064(C18107 c18107, String str, boolean z) throws C3924 {
        boolean zMo25497;
        Main mainM41282;
        String strConcat;
        if (mo41741()) {
            return;
        }
        try {
            C19210.m43749(this.f54703, EnumC17868.MODIFY_DIRECTORY_LINKED);
            AbstractC17043 abstractC17043M42109 = str.startsWith("/") ? C18524.m42109(str, new String[0]) : C18524.m42109(m41982(), str);
            if (abstractC17043M42109.mo25094()) {
                if (abstractC17043M42109.mo25087()) {
                    throw new C3924(R.string.MT_Protector);
                }
                throw new C3924(R.string.MT_Protector);
            }
            if (z) {
                zMo25497 = abstractC17043M42109.mo25497();
            } else {
                AbstractC17043 abstractC17043M38694 = abstractC17043M42109.m38694();
                zMo25497 = (abstractC17043M38694 == null || abstractC17043M38694.mo25094() || abstractC17043M38694.mo25497()) && abstractC17043M42109.mo25496();
            }
            if (!zMo25497) {
                if (z) {
                    mainM41282 = c18107.m41282();
                    strConcat = "Failed to create directory: ".concat(str);
                } else {
                    mainM41282 = c18107.m41282();
                    strConcat = "Failed to create file: ".concat(str);
                }
                mainM41282.m12257(strConcat, false);
                C17127.m38756();
                return;
            }
            c18107.m41279(abstractC17043M42109.getName());
            if (str.indexOf(47) == -1) {
                C17127.m38756();
            } else {
                c18107.m41259(abstractC17043M42109.getParent(), true);
            }
        } catch (C3924 e) {
            c18107.m41282().m12259(e, (DialogInterface.OnDismissListener) null);
        }
    }

    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ֫ */
    public final void mo8203(C18107 c18107, C18107 c18108) {
        c18107.m41224("local");
        if (!c18108.m41261("local")) {
            C11245 c11245M41242 = c18107.m41242();
            c11245M41242.m26069(c18108, c11245M41242.m26089(), false);
        }
        c18107.m41244();
    }

    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo8211(String str) {
        AbstractC17043 abstractC17043M42109 = C18524.m42109(str, new String[0]);
        return abstractC17043M42109.mo25094() && !abstractC17043M42109.mo25087();
    }

    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ܽ */
    public final void mo8215(C18107 c18107) {
        if (c18107.m41263()) {
            return;
        }
        List<C8049> listM41980 = m41980();
        if (listM41980.isEmpty()) {
            return;
        }
        m41977((List) null);
        boolean zMo41741 = mo41741();
        ArrayList arrayList = new ArrayList();
        for (C8049 c8049 : listM41980) {
            if (c8049.m18699()) {
                arrayList.add(zMo41741 ? c8049.m18696() : c8049.m18700());
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        if (zMo41741) {
            c18107.m41225(arrayList);
        } else {
            c18107.m41226((Collection) arrayList);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ֫ */
    public static void m41731(C14677 c14677) {
        C17969 c17969 = new C17969("local", c14677.m33590());
        c17969.f53663 = c14677.readInt();
        int i = c14677.readInt();
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            String strM33593 = c14677.m33593();
            String strM33594 = c14677.m33593();
            AbstractC17043 abstractC17043M42109 = C18524.m42109(strM33593, new String[0]);
            if (abstractC17043M42109 instanceof InterfaceC23140) {
                abstractC17043M42109 = ((InterfaceC23140) abstractC17043M42109).mo29974();
            }
            arrayList.add(new C13946(new C11450(abstractC17043M42109), strM33594));
        }
        BitSet bitSetValueOf = BitSet.valueOf(c14677.m33583());
        for (int i3 = 0; i3 < i; i3++) {
            if (bitSetValueOf.get(i3)) {
                ((C13946) arrayList.get(i3)).f39335 = true;
            }
        }
        c17969.f53664 = arrayList;
        f54697 = c17969;
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m41735(C11996 c11996) {
        ArrayList arrayList;
        C17969 c17969 = f54697;
        c11996.m27444(c17969.f53666);
        c11996.writeInt(c17969.f53663);
        synchronized (c17969) {
            arrayList = new ArrayList(c17969.f53664);
        }
        c11996.writeInt(arrayList.size());
        BitSet bitSet = new BitSet(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C13946 c13946 = (C13946) arrayList.get(i);
            c11996.m27459(c13946.m31720().getPath());
            c11996.m27459(c13946.m31724());
            bitSet.set(i, c13946.f39335);
        }
        c11996.m27454(bitSet.toByteArray());
    }

    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ۛ */
    public final List mo8207() {
        return Arrays.asList(AbstractC18422.f55044, this.f54700, this.f54706, this.f54707, AbstractC18422.f55045, AbstractC18422.f55040, AbstractC18422.f55038, this.f54701, this.f54704, this.f54708, this.f54705, this.f54709);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫ */
    public void m41732(final C18107 c18107, final int i) {
        C15387 c15387M29564 = C12902.m29564();
        boolean z = false;
        if (!c15387M29564.m35062()) {
            C12902 c12902M126 = c18107.m41282().m126();
            String str = C18524.m42109(m41982(), new String[0]).mo33651().m33650() + "/*";
            if (c15387M29564.m35064()) {
                c12902M126.m29575(str, false, c15387M29564, new Runnable() { // from class: l.֨ۧ᩻
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f6753.m41732(c18107, i);
                    }
                });
                return;
            } else {
                c12902M126.m29577(str);
                return;
            }
        }
        C10024 c10024 = new C10024();
        List<PackageInfo> installedPackages = C7050.m16217().getInstalledPackages(0);
        HashMap map = new HashMap(installedPackages.size());
        for (PackageInfo packageInfo : installedPackages) {
            map.put(packageInfo.packageName, packageInfo);
        }
        if (Build.VERSION.SDK_INT == 33) {
            Iterator it = C18524.m42109(c18107.m41284(), new String[0]).mo25500(true).iterator();
            while (it.hasNext()) {
                c10024.m23403((AbstractC17043) it.next());
            }
        } else {
            Iterator<PackageInfo> it2 = installedPackages.iterator();
            while (it2.hasNext()) {
                String str2 = it2.next().packageName;
                if (!str2.equals("android")) {
                    c10024.m23403(C18524.m42109(c18107.m41284(), str2));
                }
            }
            z = true;
        }
        List listM23405 = c10024.m23405();
        if (listM23405.isEmpty()) {
            C22682.m50793(R.string.MT_Protector);
            return;
        }
        ArrayList arrayList = new ArrayList(listM23405.size());
        Iterator it3 = listM23405.iterator();
        while (it3.hasNext()) {
            PackageInfo packageInfo2 = (PackageInfo) map.get(((C14717) it3.next()).getName());
            if (packageInfo2 != null) {
                arrayList.add(packageInfo2);
            }
        }
        Collections.sort(arrayList, new C1072(1));
        C11606 c11606 = new C11606(c18107.m41282(), arrayList);
        c11606.m26726(i);
        c11606.m26727(new C22894(listM23405, c18107));
        if (z) {
            c11606.m26728(new ViewOnClickListenerC23564(1, c18107));
        }
        c11606.m26725();
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m41730(List list, C18107 c18107, ArrayList arrayList) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Set set = (Set) C7480.stream(arrayList).map(new C9891(2)).collect(C24205.toSet());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C14717 c14717 = (C14717) it.next();
            if (set.contains(c14717.getName())) {
                linkedHashSet.add(c14717.m33650());
            }
        }
        if (linkedHashSet.isEmpty()) {
            return;
        }
        c18107.m41282().m126().m29576(linkedHashSet);
    }
}
