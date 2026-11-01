package p067l;

import java.io.IOException;
import java.p066io.UncheckedIOException;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.List;

/* JADX INFO: renamed from: l.۟ܿ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: K7QT */
/* JADX INFO: loaded from: classes4.dex */
public final class C9601 extends AbstractC15635 {

    /* JADX INFO: renamed from: ܳ */
    public Collection f26462;

    /* JADX INFO: renamed from: ܿ */
    public final EnumMap f26463;

    /* JADX INFO: renamed from: ᩳ */
    public boolean f26464;

    /* JADX INFO: renamed from: ᩻ */
    public final /* synthetic */ C23603 f26465;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9601(C23603 c23603) {
        super(EnumC22423.PLATFORM_CLASS_PATH, EnumC2483.f3965, EnumC2483.f3921, EnumC2483.f3984, EnumC2483.f3943, EnumC2483.f3918, EnumC2483.f3913, EnumC2483.f3903, EnumC2483.f3968);
        this.f26465 = c23603;
        this.f26463 = new EnumMap(EnumC2483.class);
    }

    @Override // p067l.AbstractC12875
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo22380(EnumC2483 enumC2483, String str) {
        if (!this.f44742.contains(enumC2483)) {
            return false;
        }
        this.f44740 = true;
        int i = C24353.f77125[enumC2483.ordinal()];
        if (i == 1) {
            enumC2483 = EnumC2483.f3965;
        } else if (i == 2) {
            enumC2483 = EnumC2483.f3918;
        } else if (i == 3) {
            enumC2483 = EnumC2483.f3903;
        }
        EnumMap enumMap = this.f26463;
        enumMap.put(enumC2483, str);
        if (enumC2483 == EnumC2483.f3965) {
            enumMap.remove(EnumC2483.f3984);
            enumMap.remove(EnumC2483.f3943);
        }
        this.f26462 = null;
        return true;
    }

    @Override // p067l.AbstractC12875
    /* JADX INFO: renamed from: ֫ */
    public final void mo22379(Iterable iterable) {
        if (iterable == null) {
            this.f26462 = null;
            return;
        }
        this.f26464 = false;
        this.f44740 = true;
        C3486 c3486 = new C3486(this.f26465);
        c3486.m6221(iterable, false);
        this.f26462 = C21562.unmodifiableCollection(c3486);
        this.f26463.clear();
    }

    /* JADX INFO: renamed from: ᩻ */
    public final C3486 m22383() {
        Iterable iterableSingleton;
        C23603 c23603 = this.f26465;
        C3486 c3486 = new C3486(c23603);
        EnumC2483 enumC2483 = EnumC2483.f3965;
        EnumMap enumMap = this.f26463;
        String str = (String) enumMap.get(enumC2483);
        String str2 = (String) enumMap.get(EnumC2483.f3918);
        String str3 = (String) enumMap.get(EnumC2483.f3903);
        String str4 = (String) enumMap.get(EnumC2483.f3984);
        String str5 = (String) enumMap.get(EnumC2483.f3943);
        c3486.m6222(str4);
        boolean z = false;
        if (str2 != null) {
            c3486.m6223(str2, c23603.f75136);
        } else {
            c3486.m6223(System.getProperty("java.endorsed.dirs"), false);
        }
        if (str != null) {
            c3486.m6222(str);
        } else {
            InterfaceC22097 interfaceC22097 = C23603.f75127;
            if (C18743.isRegularFile(interfaceC22097, new EnumC16060[0])) {
                iterableSingleton = Collections.singleton(interfaceC22097);
            } else {
                InterfaceC22097 interfaceC22097Resolve = C23603.f75128.resolve("modules");
                if (C18743.isDirectory(interfaceC22097Resolve.resolve("java.base"), new EnumC16060[0])) {
                    InterfaceC19157 list = C18743.list(interfaceC22097Resolve);
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
                c3486.m6221(iterableSingleton, false);
            } else {
                c3486.m6226(System.getProperty("sun.boot.class.path"), false);
            }
        }
        c3486.m6222(str5);
        if (str3 != null) {
            c3486.m6223(str3, c23603.f75136);
        } else {
            InterfaceC22097 interfaceC22097Resolve2 = C23603.f75128.resolve("lib/jfxrt.jar");
            if (C18743.exists(interfaceC22097Resolve2, new EnumC16060[0])) {
                c3486.m6225(interfaceC22097Resolve2, false);
            }
            c3486.m6223(System.getProperty("java.ext.dirs"), false);
        }
        if (str4 == null && str == null && str5 == null) {
            z = true;
        }
        this.f26464 = z;
        return c3486;
    }

    /* JADX INFO: renamed from: ۜ */
    public final boolean m22382() {
        if (this.f26462 == null) {
            try {
                this.f26462 = C21562.unmodifiableCollection(m22383());
            } catch (IOException e) {
                throw new UncheckedIOException(e);
            }
        }
        return this.f26464;
    }

    @Override // p067l.AbstractC12875
    /* JADX INFO: renamed from: ܽ */
    public final Collection mo8427() {
        if (this.f26462 == null) {
            try {
                this.f26462 = C21562.unmodifiableCollection(m22383());
            } catch (IOException e) {
                throw new UncheckedIOException(e);
            }
        }
        return this.f26462;
    }

    @Override // p067l.AbstractC12875
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo22381(InterfaceC22097 interfaceC22097) {
        return C23603.m52418(this.f26465, this.f26462, interfaceC22097);
    }
}
