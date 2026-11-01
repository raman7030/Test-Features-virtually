package p067l;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: l.ۖۗۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: C1V2 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4516 {

    /* JADX INFO: renamed from: ֫ */
    public final HashMap f10133 = new HashMap();

    /* JADX INFO: renamed from: ۧ */
    public final String f10134;

    /* JADX INFO: renamed from: ܽ */
    public final String f10135;

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC20309 m9548(C18236 c18236, InterfaceC20309 interfaceC20309, C23292 c23292) {
        String str = (String) this.f10133.get(new C7238(interfaceC20309.getName(), AbstractC17966.m40889(interfaceC20309, c23292), false));
        if (str == null) {
            return null;
        }
        return new C10551(c18236, interfaceC20309, str);
    }

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC7568 m9547(C18236 c18236, InterfaceC7568 interfaceC7568, C23292 c23292) {
        String str = (String) this.f10133.get(new C7238(interfaceC7568.getName(), AbstractC17966.m40888(interfaceC7568, c23292), true));
        if (str == null) {
            return null;
        }
        return new C17255(c18236, interfaceC7568, str);
    }

    public C4516(String str, String str2) {
        this.f10135 = str;
        this.f10134 = str2;
    }

    /* JADX INFO: renamed from: ۧ */
    public final String m9551() {
        return this.f10135;
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m9545() {
        return this.f10134;
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m9546(String str) {
        for (Map.Entry entry : this.f10133.entrySet()) {
            C7238 c7238 = (C7238) entry.getKey();
            if (!c7238.m16581() && c7238.m16582().equals(str)) {
                return (String) entry.getValue();
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ */
    public final String m9552(String str) {
        for (Map.Entry entry : this.f10133.entrySet()) {
            C7238 c7238 = (C7238) entry.getKey();
            if (c7238.m16581() && c7238.m16582().equals(str)) {
                return (String) entry.getValue();
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m9549(C7238 c7238, String str) {
        this.f10133.put(c7238, str);
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m9550(C7238 c7238) {
        return this.f10133.containsKey(c7238);
    }
}
