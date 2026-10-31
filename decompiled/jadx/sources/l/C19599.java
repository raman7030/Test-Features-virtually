package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩵ܿ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: K6AA */
/* JADX INFO: loaded from: classes5.dex */
public final class C19599 extends AbstractC16069 implements InterfaceC4781, InterfaceC0547 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public Object f63288;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public C13268 f63289;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C6322 f63290;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f63291;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C20304 f63292;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public Object f63293;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f63294;

    public C19599(C18893 c18893) {
        C6322 c6322 = new C6322();
        this.f63294 = false;
        this.f63291 = 0;
        this.f63288 = c18893;
        this.f63290 = c6322;
        C20304 c20304 = new C20304();
        c20304.f65566 = true;
        c20304.f65565 = c18893;
        c20304.f65562 = c18893;
        c20304.f65563 = new C9015();
        c20304.f65567 = c6322.m17584(2, "DOWN");
        c20304.f65564 = c6322.m17584(3, "UP");
        c20304.f65568 = c6322.m17584(-1, "EOF");
        this.f63292 = c20304;
    }

    @Override // l.AbstractC16069
    /* JADX INFO: renamed from: ۜ */
    public final Object mo37976() {
        C20304 c20304 = this.f63292;
        Object next = c20304.next();
        if (next == c20304.f65564) {
            int i = this.f63291 - 1;
            this.f63291 = i;
            if (i == 0 && this.f63294) {
                return c20304.next();
            }
        } else if (next == c20304.f65567) {
            this.f63291++;
        }
        if (this.f63291 == 0) {
            this.f63290.getClass();
            if (((InterfaceC22420) next).mo8355()) {
                this.f63294 = true;
                c20304.next();
                this.f63291++;
                return c20304.next();
            }
        }
        return next;
    }

    @Override // l.AbstractC16069, l.C9015
    /* JADX INFO: renamed from: ܿ */
    public final Object mo23262() {
        Object objMo23262 = super.mo23262();
        if (this.f27374 == 0 && m45040(this.f49540)) {
            this.f63293 = this.f49540;
        }
        return objMo23262;
    }

    @Override // l.AbstractC16069
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo37975(Object obj) {
        this.f63290.getClass();
        return (obj == null ? 0 : ((InterfaceC22420) obj).getType()) == -1;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final InterfaceC21010 m45041() {
        return this.f63289;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m45039(C13268 c13268) {
        this.f63289 = c13268;
    }

    @Override // l.InterfaceC4781
    /* JADX INFO: renamed from: ܽ */
    public final C6322 mo13965() {
        return this.f63290;
    }

    @Override // l.InterfaceC11858
    /* JADX INFO: renamed from: ۧ */
    public final int mo28964(int i) {
        Object objM37979 = m37979(i);
        this.f63290.getClass();
        if (objM37979 == null) {
            return 0;
        }
        return ((InterfaceC22420) objM37979).getType();
    }

    @Override // l.InterfaceC0547
    /* JADX INFO: renamed from: ֫ */
    public final Object mo2293(boolean z) {
        Object obj;
        int i = this.f27374;
        ArrayList arrayList = this.f27373;
        Object obj2 = arrayList.get(i);
        if (m45040(obj2)) {
            return obj2;
        }
        if (!z) {
            return null;
        }
        int i2 = this.f27374;
        do {
            i2--;
            if (i2 >= 0) {
                obj = arrayList.get(i2);
            } else {
                return this.f63293;
            }
        } while (!m45040(obj));
        return obj;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m45040(Object obj) {
        this.f63290.getClass();
        InterfaceC6898 interfaceC6898 = obj instanceof C18893 ? ((C18893) obj).f59554 : null;
        return interfaceC6898 != null && interfaceC6898.getLine() > 0;
    }
}
