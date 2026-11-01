package p067l;

import bin.p000mt.json.JSON;
import bin.p000mt.json.JSONObject;

/* JADX INFO: renamed from: l.᩵֫ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: I76C */
/* JADX INFO: loaded from: classes4.dex */
public final class C20569 {
    /* JADX INFO: renamed from: ֫ */
    public static String m46511(C13362 c13362, final C20068 c20068) {
        return m46509(c13362, c20068.f60980, c20068.f60974, c20068.f60979, new InterfaceC19898() { // from class: l.ۖ֫ۜ
            @Override // p067l.InterfaceC19898
            public final C5276 get() {
                return C8498.m19771(c20068);
            }
        }, new InterfaceC19898() { // from class: l.ۘ֫ۜ
            @Override // p067l.InterfaceC19898
            public final C5276 get() {
                return C8498.m19767(c20068);
            }
        });
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m46510(C13362 c13362, final C10009 c10009) {
        return m46509(c13362, c10009.f27702, c10009.f27695, c10009.f27696, new InterfaceC19898() { // from class: l.ۡ֫ۜ
            @Override // p067l.InterfaceC19898
            public final C5276 get() {
                return C8498.m19770(c10009);
            }
        }, new InterfaceC19898() { // from class: l.ܺ֫ۜ
            @Override // p067l.InterfaceC19898
            public final C5276 get() {
                return C8498.m19766(c10009);
            }
        });
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m46512(C13362 c13362, final C20739 c20739) {
        return m46509(c13362, c20739.f64007, c20739.f64000, c20739.f64005, new InterfaceC19898() { // from class: l.᩷֫ۜ
            @Override // p067l.InterfaceC19898
            public final C5276 get() {
                return C8498.m19772(c20739);
            }
        }, new InterfaceC19898() { // from class: l.ۢ֫ۜ
            @Override // p067l.InterfaceC19898
            public final C5276 get() {
                return C8498.m19768(c20739);
            }
        });
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m46509(C13362 c13362, String str, long j, String str2, InterfaceC19898 interfaceC19898, InterfaceC19898 interfaceC19899) throws C5276 {
        if (c13362.f37508 != 40) {
            if ("auto".equals(str2)) {
                return "auto";
            }
            throw C5276.m11406("instructionMode must be auto for non-ARM ELF", "instructionMode", JSON.value(str2), JSON.array("auto"), (JSONObject) null);
        }
        boolean z = "virtual".equals(str) && (j & 1) == 1;
        if ("arm".equals(str2)) {
            if (z) {
                throw interfaceC19898.get();
            }
            return "arm";
        }
        if ("thumb".equals(str2) || z) {
            return "thumb";
        }
        throw interfaceC19899.get();
    }
}
