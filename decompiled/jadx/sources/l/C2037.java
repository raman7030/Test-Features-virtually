package l;

import java.io.Closeable;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.֫᩵ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: A6S3 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2037 implements InterfaceC17066 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final HashSet f6792 = new HashSet();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public volatile boolean f6793;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f6794;

    public final synchronized void cancel() {
        this.f6793 = true;
        Iterator it = this.f6792.iterator();
        while (it.hasNext()) {
            ((C7660) it.next()).m20460();
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final synchronized void m6626() {
        if (this.f6793) {
            throw new IllegalStateException("Canceled input cannot be handed off");
        }
        this.f6794 = true;
        this.f6792.clear();
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final synchronized boolean m6627() {
        return this.f6792.isEmpty();
    }

    @Override // l.InterfaceC17066
    /* JADX INFO: renamed from: ᩻ */
    public final boolean mo1526() {
        return this.f6793;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m6625(C2037 c2037, C7660 c7660) {
        synchronized (c2037) {
            c2037.f6792.remove(c7660);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Closeable m6624(Closeable closeable, InterfaceC17066 interfaceC17066) {
        if (!(interfaceC17066 instanceof C2037)) {
            return closeable;
        }
        C2037 c2037 = (C2037) interfaceC17066;
        C7660 c7660 = new C7660(c2037, closeable);
        synchronized (c2037) {
            if (c2037.f6794) {
                return c7660;
            }
            c2037.f6792.add(c7660);
            if (c2037.f6793) {
                c7660.m20460();
            }
            return c7660;
        }
    }
}
