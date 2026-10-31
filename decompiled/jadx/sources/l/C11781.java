package l;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

/* JADX INFO: renamed from: l.ۨܶ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: Q3ZI */
/* JADX INFO: loaded from: classes3.dex */
public final class C11781 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final C4314 f35158 = new C4314();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C2609 f35159;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public LinkedHashMap f35160;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C11781 m28823(C2903 c2903) {
        C4314 c4314 = f35158;
        C11781 c11781 = (C11781) c2903.m8838(c4314);
        if (c11781 != null) {
            return c11781;
        }
        C11781 c11782 = new C11781();
        c11782.f35159 = C2609.m8239();
        c11782.f35160 = new LinkedHashMap();
        c2903.m8841(c4314, c11782);
        return c11782;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m28824(String str) {
        return (String) this.f35160.get(str);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m28825(EnumC0121 enumC0121) {
        return (String) this.f35160.get(enumC0121.f1214);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m28831(String str) {
        return this.f35160.get(str) != null;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m28832(EnumC0121 enumC0121) {
        return this.f35160.get(enumC0121.f1214) != null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m28829(EnumC0121 enumC0121, String str) {
        LinkedHashMap linkedHashMap = this.f35160;
        StringBuilder sb = new StringBuilder();
        sb.append(enumC0121.f1214);
        sb.append(str);
        return linkedHashMap.get(sb.toString()) != null;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m28835(String str) {
        return this.f35160.get(str) == null;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m28836(EnumC0121 enumC0121) {
        return this.f35160.get(enumC0121.f1214) == null;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m28833(EnumC0121 enumC0121, String str) {
        LinkedHashMap linkedHashMap = this.f35160;
        StringBuilder sb = new StringBuilder();
        sb.append(enumC0121.f1214);
        sb.append(str);
        return linkedHashMap.get(sb.toString()) == null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m28828(String str, String str2) {
        this.f35160.put(str, str2);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m28834(EnumC0121 enumC0121, String str) {
        this.f35160.put(enumC0121.f1214, str);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m28837(String str) {
        this.f35160.remove(str);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Set m28826() {
        return this.f35160.keySet();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m28827(Runnable runnable) {
        C2609 c2609 = this.f35159;
        c2609.getClass();
        this.f35159 = new C2609(runnable, c2609);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m28830() {
        Iterator it = this.f35159.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }
}
