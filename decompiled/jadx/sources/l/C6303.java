package l;

import java.util.List;

/* JADX INFO: renamed from: l.ۛ᩷ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: A797 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6303 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f19482;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f19483;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public byte f19484;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public byte f19485;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public String f19486;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public String[] f19487 = C7714.f23826;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f19488 = true;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m17347(int i) {
        int i2;
        return (i & (-32)) == 0 && ((i & 8) == 0 || (i & 16) == 0) && (i2 = i & 7) >= 0 && i2 <= 4 && (i2 != 0 || (i & (-8)) == 0);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C6303 m17344(C7980 c7980, String str) {
        C6303 c6303 = new C6303();
        c6303.f19486 = c7980.mo2695();
        List listMo2699 = c7980.mo2699();
        if (!listMo2699.isEmpty()) {
            c6303.f19487 = (String[]) listMo2699.toArray(new String[listMo2699.size()]);
        }
        if (EnumC15657.INTERFACE.m36866(c7980.mo2700())) {
            c6303.f19485 = (byte) 1;
        }
        for (InterfaceC18444 interfaceC18444 : c7980.m21300(true)) {
            if (C15474.m36565(interfaceC18444, str)) {
                c6303.m17346(interfaceC18444.mo3567(), false, C7714.m20642(interfaceC18444));
            }
        }
        for (InterfaceC18444 interfaceC18445 : c7980.m21299(true)) {
            if (C15474.m36565(interfaceC18445, str)) {
                c6303.m17346(interfaceC18445.mo3567(), true, C7714.m20642(interfaceC18445));
            }
        }
        return c6303;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C6303 m17345(C10912 c10912) {
        C6303 c6303 = new C6303();
        c6303.f19486 = c10912.f32781;
        String[] strArr = (String[]) c10912.f32780.clone();
        if (strArr.length == 0) {
            strArr = C7714.f23826;
        }
        c6303.f19487 = strArr;
        int i = c10912.f32779;
        if ((i & (-2)) != 0) {
            throw new IllegalArgumentException("Invalid class flags");
        }
        c6303.f19485 = (byte) i;
        int i2 = c10912.f32783;
        if (!m17347(i2)) {
            throw new IllegalArgumentException("Invalid target method flags");
        }
        c6303.f19484 = (byte) i2;
        c6303.f19483 = true;
        c6303.f19488 = c10912.f32782;
        return c6303;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m17346(int i, boolean z, boolean z2) {
        int i2;
        int i3;
        if (z) {
            i2 = z2 ? 2 : 1;
        } else {
            i2 = z2 ? 4 : 3;
        }
        if (EnumC15657.PUBLIC.m36866(i)) {
            i3 = 8;
        } else {
            i3 = EnumC15657.PROTECTED.m36866(i) ? 16 : 0;
        }
        this.f19484 = (byte) (i3 | i2);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean m17353() {
        return (this.f19485 & 1) != 0;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean m17355() {
        return this.f19483;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m17356() {
        return this.f19483 && !this.f19488;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m17352() {
        int i = this.f19484 & 7;
        return i == 1 || i == 2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m17350() {
        int i = this.f19484 & 7;
        return i == 3 || i == 4;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m17354() {
        int i = this.f19484 & 7;
        return i == 2 || i == 4;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean m17351() {
        return (this.f19484 & 8) != 0;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean m17357() {
        return (this.f19484 & 16) != 0;
    }
}
