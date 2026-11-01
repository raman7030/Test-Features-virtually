package p067l;

import java.util.concurrent.ConcurrentMap;

/* JADX INFO: renamed from: l.᩷᩶۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 742G */
/* JADX INFO: loaded from: classes5.dex */
public enum EnumC22423 implements InterfaceC4317 {
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


    /* JADX INFO: renamed from: ۧ֫ */
    public static final ConcurrentMap f70752 = new ConcurrentMapC12768();

    /* JADX INFO: renamed from: ֫ */
    public static InterfaceC4317 m50376(String str) {
        if (f70752.isEmpty()) {
            for (EnumC22423 enumC22423 : values()) {
                f70752.putIfAbsent(enumC22423.getName(), enumC22423);
            }
        }
        str.getClass();
        ConcurrentMap concurrentMap = f70752;
        concurrentMap.putIfAbsent(str, new C9011(str));
        return (InterfaceC4317) concurrentMap.get(str);
    }

    @Override // p067l.InterfaceC4317
    public String getName() {
        return name();
    }

    @Override // p067l.InterfaceC4317
    /* JADX INFO: renamed from: ۧ */
    public boolean mo8853() {
        int iOrdinal = ordinal();
        return iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 7;
    }

    @Override // p067l.InterfaceC4317
    /* JADX INFO: renamed from: ֫ */
    public boolean mo8852() {
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
