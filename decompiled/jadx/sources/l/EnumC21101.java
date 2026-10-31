package l;

import java.util.concurrent.ConcurrentMap;

/* JADX INFO: renamed from: l.᩷᩶۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 742G */
/* JADX INFO: loaded from: classes5.dex */
public enum EnumC21101 implements InterfaceC2050 {
    CLASS_OUTPUT,
    SOURCE_OUTPUT,
    CLASS_PATH,
    SOURCE_PATH,
    ANNOTATION_PROCESSOR_PATH,
    ANNOTATION_PROCESSOR_MODULE_PATH,
    PLATFORM_CLASS_PATH,
    NATIVE_HEADER_OUTPUT,
    MODULE_SOURCE_PATH,
    UPGRADE_MODULE_PATH,
    SYSTEM_MODULES,
    MODULE_PATH,
    PATCH_MODULE_PATH;


    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public static final ConcurrentMap f68070 = new ConcurrentMapC10942();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InterfaceC2050 m48046(String str) {
        if (f68070.isEmpty()) {
            for (EnumC21101 enumC21101 : values()) {
                f68070.putIfAbsent(enumC21101.getName(), enumC21101);
            }
        }
        str.getClass();
        ConcurrentMap concurrentMap = f68070;
        concurrentMap.putIfAbsent(str, new C6989(str));
        return (InterfaceC2050) concurrentMap.get(str);
    }

    @Override // l.InterfaceC2050
    public String getName() {
        return name();
    }

    @Override // l.InterfaceC2050
    /* JADX INFO: renamed from: ۧ */
    public boolean mo6727() {
        int iOrdinal = ordinal();
        return iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 7;
    }

    @Override // l.InterfaceC2050
    /* JADX INFO: renamed from: ֫ */
    public boolean mo6726() {
        int iOrdinal = ordinal();
        if (iOrdinal == 5) {
            return true;
        }
        switch (iOrdinal) {
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                return true;
            default:
                return false;
        }
    }
}
