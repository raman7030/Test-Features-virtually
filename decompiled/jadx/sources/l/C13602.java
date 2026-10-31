package l;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: renamed from: l.ܰۚ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 64JA */
/* JADX INFO: loaded from: classes3.dex */
public final class C13602 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C13258 f40579;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList f40574 = new ArrayList();

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final ArrayList f40581 = new ArrayList();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ArrayList f40578 = new ArrayList();

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final ArrayList f40575 = new ArrayList();

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final ArrayList f40576 = new ArrayList();

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final HashSet f40584 = new HashSet();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public LinkedHashSet f40580 = C19662.m45204();

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public EnumC5842 f40582 = EnumC5842.NONE;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f40577 = 100;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f40583 = 100;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C1484 m32710() {
        return new C1484(this);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m32711(Iterable iterable) {
        C11003.requireNonNull(iterable, "extensions must not be null");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            InterfaceC2707 interfaceC2707 = (InterfaceC2707) it.next();
            if (interfaceC2707 instanceof InterfaceC7253) {
                ((InterfaceC7253) interfaceC2707).mo6577(this);
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m32713(EnumC5842 enumC5842) {
        this.f40582 = enumC5842;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m32716(AbstractC15594 abstractC15594) {
        this.f40574.add(abstractC15594);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m32715(InterfaceC14183 interfaceC14183) {
        this.f40581.add(interfaceC14183);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m32712(C0589 c0589) {
        this.f40578.add(c0589);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m32717(C18250 c18250) {
        this.f40576.add(c18250);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m32714(C13258 c13258) {
        this.f40579 = c13258;
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static InterfaceC22775 m32701(C13602 c13602) {
        C13258 c13258 = c13602.f40579;
        return c13258 != null ? c13258 : new C20094(9);
    }
}
