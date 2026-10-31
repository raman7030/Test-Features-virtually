package l;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: l.ۖۗۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: C1V2 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2260 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final HashMap f7345 = new HashMap();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f7346;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String f7347;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC18877 m7466(C16696 c16696, InterfaceC18877 interfaceC18877, C22016 c22016) {
        String str = (String) this.f7345.get(new C5124(interfaceC18877.getName(), AbstractC16412.m38673(interfaceC18877, c22016), false));
        if (str == null) {
            return null;
        }
        return new C8610(c16696, interfaceC18877, str);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC5471 m7465(C16696 c16696, InterfaceC5471 interfaceC5471, C22016 c22016) {
        String str = (String) this.f7345.get(new C5124(interfaceC5471.getName(), AbstractC16412.m38672(interfaceC5471, c22016), true));
        if (str == null) {
            return null;
        }
        return new C15664(c16696, interfaceC5471, str);
    }

    public C2260(String str, String str2) {
        this.f7347 = str;
        this.f7346 = str2;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String m7469() {
        return this.f7347;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m7463() {
        return this.f7346;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m7464(String str) {
        for (Map.Entry entry : this.f7345.entrySet()) {
            C5124 c5124 = (C5124) entry.getKey();
            if (!c5124.m14673() && c5124.m14674().equals(str)) {
                return (String) entry.getValue();
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String m7470(String str) {
        for (Map.Entry entry : this.f7345.entrySet()) {
            C5124 c5124 = (C5124) entry.getKey();
            if (c5124.m14673() && c5124.m14674().equals(str)) {
                return (String) entry.getValue();
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m7467(C5124 c5124, String str) {
        this.f7345.put(c5124, str);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m7468(C5124 c5124) {
        return this.f7345.containsKey(c5124);
    }
}
