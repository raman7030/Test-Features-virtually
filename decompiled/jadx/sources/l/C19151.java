package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONObject;

/* JADX INFO: renamed from: l.᩵֫ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: I76C */
/* JADX INFO: loaded from: classes4.dex */
public final class C19151 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m44217(C11567 c11567, final C18623 c18623) {
        return m44215(c11567, c18623.f57757, c18623.f57751, c18623.f57756, new InterfaceC18445() { // from class: l.ۖ֫ۜ
            @Override // l.InterfaceC18445
            public final C3059 get() {
                return C6450.m17824(c18623);
            }
        }, new InterfaceC18445() { // from class: l.ۘ֫ۜ
            @Override // l.InterfaceC18445
            public final C3059 get() {
                return C6450.m17820(c18623);
            }
        });
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m44216(C11567 c11567, final C8039 c8039) {
        return m44215(c11567, c8039.f24788, c8039.f24781, c8039.f24782, new InterfaceC18445() { // from class: l.ۡ֫ۜ
            @Override // l.InterfaceC18445
            public final C3059 get() {
                return C6450.m17823(c8039);
            }
        }, new InterfaceC18445() { // from class: l.ܺ֫ۜ
            @Override // l.InterfaceC18445
            public final C3059 get() {
                return C6450.m17819(c8039);
            }
        });
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m44218(C11567 c11567, final C19329 c19329) {
        return m44215(c11567, c19329.f60775, c19329.f60768, c19329.f60773, new InterfaceC18445() { // from class: l.᩷֫ۜ
            @Override // l.InterfaceC18445
            public final C3059 get() {
                return C6450.m17825(c19329);
            }
        }, new InterfaceC18445() { // from class: l.ۢ֫ۜ
            @Override // l.InterfaceC18445
            public final C3059 get() {
                return C6450.m17821(c19329);
            }
        });
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m44215(C11567 c11567, String str, long j, String str2, InterfaceC18445 interfaceC18445, InterfaceC18445 interfaceC18446) throws C3059 {
        if (c11567.f34509 != 40) {
            if ("auto".equals(str2)) {
                return "auto";
            }
            throw C3059.m9364("instructionMode must be auto for non-ARM ELF", "instructionMode", JSON.value(str2), JSON.array("auto"), (JSONObject) null);
        }
        boolean z = "virtual".equals(str) && (j & 1) == 1;
        if ("arm".equals(str2)) {
            if (z) {
                throw interfaceC18445.get();
            }
            return "arm";
        }
        if ("thumb".equals(str2) || z) {
            return "thumb";
        }
        throw interfaceC18446.get();
    }
}
