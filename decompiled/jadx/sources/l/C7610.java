package l;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.List;

/* JADX INFO: renamed from: l.۟ܿ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: K7QT */
/* JADX INFO: loaded from: classes4.dex */
public final class C7610 extends AbstractC13959 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public Collection f23549;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final EnumMap f23550;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f23551;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22343 f23552;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7610(C22343 c22343) {
        super(EnumC21101.PLATFORM_CLASS_PATH, EnumC0121.f1189, EnumC0121.f1145, EnumC0121.f1208, EnumC0121.f1167, EnumC0121.f1142, EnumC0121.f1137, EnumC0121.f1127, EnumC0121.f1192);
        this.f23552 = c22343;
        this.f23550 = new EnumMap(EnumC0121.class);
    }

    @Override // l.AbstractC11055
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean mo20401(EnumC0121 enumC0121, String str) {
        if (!this.f41662.contains(enumC0121)) {
            return false;
        }
        this.f41660 = true;
        int i = C23132.f74379[enumC0121.ordinal()];
        if (i == 1) {
            enumC0121 = EnumC0121.f1189;
        } else if (i == 2) {
            enumC0121 = EnumC0121.f1142;
        } else if (i == 3) {
            enumC0121 = EnumC0121.f1127;
        }
        EnumMap enumMap = this.f23550;
        enumMap.put(enumC0121, str);
        if (enumC0121 == EnumC0121.f1189) {
            enumMap.remove(EnumC0121.f1208);
            enumMap.remove(EnumC0121.f1167);
        }
        this.f23549 = null;
        return true;
    }

    @Override // l.AbstractC11055
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo20400(Iterable iterable) {
        if (iterable == null) {
            this.f23549 = null;
            return;
        }
        this.f23551 = false;
        this.f41660 = true;
        C1176 c1176 = new C1176(this.f23552);
        c1176.m3979(iterable, false);
        this.f23549 = C20195.unmodifiableCollection(c1176);
        this.f23550.clear();
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C1176 m20404() {
        Iterable iterableSingleton;
        C22343 c22343 = this.f23552;
        C1176 c1176 = new C1176(c22343);
        EnumC0121 enumC0121 = EnumC0121.f1189;
        EnumMap enumMap = this.f23550;
        String str = (String) enumMap.get(enumC0121);
        String str2 = (String) enumMap.get(EnumC0121.f1142);
        String str3 = (String) enumMap.get(EnumC0121.f1127);
        String str4 = (String) enumMap.get(EnumC0121.f1208);
        String str5 = (String) enumMap.get(EnumC0121.f1167);
        c1176.m3980(str4);
        boolean z = false;
        if (str2 != null) {
            c1176.m3981(str2, c22343.f72410);
        } else {
            c1176.m3981(System.getProperty("java.endorsed.dirs"), false);
        }
        if (str != null) {
            c1176.m3980(str);
        } else {
            InterfaceC20758 interfaceC20758 = C22343.f72401;
            if (C17229.isRegularFile(interfaceC20758, new EnumC14406[0])) {
                iterableSingleton = Collections.singleton(interfaceC20758);
            } else {
                InterfaceC20758 interfaceC20758Resolve = C22343.f72402.resolve("modules");
                if (C17229.isDirectory(interfaceC20758Resolve.resolve("java.base"), new EnumC14406[0])) {
                    InterfaceC17664 list = C17229.list(interfaceC20758Resolve);
                    try {
                        List list2 = list.toList();
                        list.close();
                        iterableSingleton = list2;
                    } catch (Throwable th) {
                        if (list != null) {
                            try {
                                list.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                } else {
                    iterableSingleton = null;
                }
            }
            if (iterableSingleton != null) {
                c1176.m3979(iterableSingleton, false);
            } else {
                c1176.m3984(System.getProperty("sun.boot.class.path"), false);
            }
        }
        c1176.m3980(str5);
        if (str3 != null) {
            c1176.m3981(str3, c22343.f72410);
        } else {
            InterfaceC20758 interfaceC20758Resolve2 = C22343.f72402.resolve("lib/jfxrt.jar");
            if (C17229.exists(interfaceC20758Resolve2, new EnumC14406[0])) {
                c1176.m3983(interfaceC20758Resolve2, false);
            }
            c1176.m3981(System.getProperty("java.ext.dirs"), false);
        }
        if (str4 == null && str == null && str5 == null) {
            z = true;
        }
        this.f23551 = z;
        return c1176;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean m20403() {
        if (this.f23549 == null) {
            try {
                this.f23549 = C20195.unmodifiableCollection(m20404());
            } catch (IOException e) {
                throw new UncheckedIOException(e);
            }
        }
        return this.f23551;
    }

    @Override // l.AbstractC11055
    /* JADX INFO: renamed from: ܽ */
    public final Collection mo6225() {
        if (this.f23549 == null) {
            try {
                this.f23549 = C20195.unmodifiableCollection(m20404());
            } catch (IOException e) {
                throw new UncheckedIOException(e);
            }
        }
        return this.f23549;
    }

    @Override // l.AbstractC11055
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean mo20402(InterfaceC20758 interfaceC20758) {
        return C22343.m50079(this.f23552, this.f23549, interfaceC20758);
    }
}
