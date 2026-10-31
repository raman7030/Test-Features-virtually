package l;

import java.util.AbstractCollection;
import java.util.Collection;

/* JADX INFO: renamed from: l.ۚ۠۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 37P4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5226 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C2609 m15019(AbstractCollection abstractCollection) {
        C19338 c19338 = new C19338();
        c19338.f60792 = 0;
        c19338.f60793 = new C18837();
        c19338.f60794 = new C18837();
        return C19338.m44562(c19338, abstractCollection);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m15018(Collection collection, String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append("digraph " + str + " {\n");
        sb.append("label = " + ("\"" + str2 + "\"").replaceAll("\n", "") + ";\n");
        new C15808().m43190(collection, sb);
        sb.append("}\n");
        return sb.toString();
    }
}
