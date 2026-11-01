package p067l;

import java.util.List;

/* JADX INFO: renamed from: l.ۛ᩷ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: A797 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8359 {

    /* JADX INFO: renamed from: ֫ */
    public boolean f22353;

    /* JADX INFO: renamed from: ۧ */
    public boolean f22354;

    /* JADX INFO: renamed from: ܳ */
    public byte f22355;

    /* JADX INFO: renamed from: ܽ */
    public byte f22356;

    /* JADX INFO: renamed from: ܿ */
    public String f22357;

    /* JADX INFO: renamed from: ᩳ */
    public String[] f22358 = C9700.f26740;

    /* JADX INFO: renamed from: ᩻ */
    public boolean f22359 = true;

    /* JADX INFO: renamed from: ֫ */
    public static boolean m19287(int i) {
        int i2;
        return (i & (-32)) == 0 && ((i & 8) == 0 || (i & 16) == 0) && (i2 = i & 7) >= 0 && i2 <= 4 && (i2 != 0 || (i & (-8)) == 0);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C8359 m19284(C9952 c9952, String str) {
        C8359 c8359 = new C8359();
        c8359.f22357 = c9952.mo5034();
        List listMo5038 = c9952.mo5038();
        if (!listMo5038.isEmpty()) {
            c8359.f22358 = (String[]) listMo5038.toArray(new String[listMo5038.size()]);
        }
        if (EnumC17248.INTERFACE.m39032(c9952.mo5039())) {
            c8359.f22356 = (byte) 1;
        }
        for (InterfaceC19897 interfaceC19897 : c9952.m23266(true)) {
            if (C17075.m38724(interfaceC19897, str)) {
                c8359.m19286(interfaceC19897.mo5854(), false, C9700.m22622(interfaceC19897));
            }
        }
        for (InterfaceC19897 interfaceC19898 : c9952.m23265(true)) {
            if (C17075.m38724(interfaceC19898, str)) {
                c8359.m19286(interfaceC19898.mo5854(), true, C9700.m22622(interfaceC19898));
            }
        }
        return c8359;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C8359 m19285(C12739 c12739) {
        C8359 c8359 = new C8359();
        c8359.f22357 = c12739.f35759;
        String[] strArr = (String[]) c12739.f35758.clone();
        if (strArr.length == 0) {
            strArr = C9700.f26740;
        }
        c8359.f22358 = strArr;
        int i = c12739.f35757;
        if ((i & (-2)) != 0) {
            throw new IllegalArgumentException("Invalid class flags");
        }
        c8359.f22356 = (byte) i;
        int i2 = c12739.f35761;
        if (!m19287(i2)) {
            throw new IllegalArgumentException("Invalid target method flags");
        }
        c8359.f22355 = (byte) i2;
        c8359.f22354 = true;
        c8359.f22359 = c12739.f35760;
        return c8359;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m19286(int i, boolean z, boolean z2) {
        int i2;
        int i3;
        if (z) {
            i2 = z2 ? 2 : 1;
        } else {
            i2 = z2 ? 4 : 3;
        }
        if (EnumC17248.PUBLIC.m39032(i)) {
            i3 = 8;
        } else {
            i3 = EnumC17248.PROTECTED.m39032(i) ? 16 : 0;
        }
        this.f22355 = (byte) (i3 | i2);
    }

    /* JADX INFO: renamed from: ܳ */
    public final boolean m19293() {
        return (this.f22356 & 1) != 0;
    }

    /* JADX INFO: renamed from: ܿ */
    public final boolean m19295() {
        return this.f22354;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final boolean m19296() {
        return this.f22354 && !this.f22359;
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m19292() {
        int i = this.f22355 & 7;
        return i == 1 || i == 2;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m19290() {
        int i = this.f22355 & 7;
        return i == 3 || i == 4;
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m19294() {
        int i = this.f22355 & 7;
        return i == 2 || i == 4;
    }

    /* JADX INFO: renamed from: ۜ */
    public final boolean m19291() {
        return (this.f22355 & 8) != 0;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final boolean m19297() {
        return (this.f22355 & 16) != 0;
    }
}
