package p067l;

import java.util.AbstractCollection;
import java.util.Collection;

/* JADX INFO: renamed from: l.ۚ۠۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 37P4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7335 {
    /* JADX INFO: renamed from: ֫ */
    public static C4848 m16929(AbstractCollection abstractCollection) {
        C20747 c20747 = new C20747();
        c20747.f64024 = 0;
        c20747.f64025 = new C20271();
        c20747.f64026 = new C20271();
        return C20747.m46856(c20747, abstractCollection);
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m16928(Collection collection, String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append("digraph " + str + " {\n");
        sb.append("label = " + ("\"" + str2 + "\"").replaceAll("\n", "") + ";\n");
        new C17392().m45456(collection, sb);
        sb.append("}\n");
        return sb.toString();
    }
}
