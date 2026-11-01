package p067l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩵ܿ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: K6AA */
/* JADX INFO: loaded from: classes5.dex */
public final class C20995 extends AbstractC17640 implements InterfaceC6912, InterfaceC2888 {

    /* JADX INFO: renamed from: ۖ */
    public Object f65906;

    /* JADX INFO: renamed from: ۘ */
    public C14978 f65907;

    /* JADX INFO: renamed from: ۜ */
    public C8377 f65908;

    /* JADX INFO: renamed from: ۡ */
    public int f65909;

    /* JADX INFO: renamed from: ۢ */
    public C21665 f65910;

    /* JADX INFO: renamed from: ܺ */
    public Object f65911;

    /* JADX INFO: renamed from: ᩷ */
    public boolean f65912;

    public C20995(C20324 c20324) {
        C8377 c8377 = new C8377();
        this.f65912 = false;
        this.f65909 = 0;
        this.f65906 = c20324;
        this.f65908 = c8377;
        C21665 c21665 = new C21665();
        c21665.f68241 = true;
        c21665.f68240 = c20324;
        c21665.f68237 = c20324;
        c21665.f68238 = new C10936();
        c21665.f68242 = c8377.m19524(2, "DOWN");
        c21665.f68239 = c8377.m19524(3, "UP");
        c21665.f68243 = c8377.m19524(-1, "EOF");
        this.f65910 = c21665;
    }

    @Override // p067l.AbstractC17640
    /* JADX INFO: renamed from: ۜ */
    public final Object mo40165() {
        C21665 c21665 = this.f65910;
        Object next = c21665.next();
        if (next == c21665.f68239) {
            int i = this.f65909 - 1;
            this.f65909 = i;
            if (i == 0 && this.f65912) {
                return c21665.next();
            }
        } else if (next == c21665.f68242) {
            this.f65909++;
        }
        if (this.f65909 == 0) {
            this.f65908.getClass();
            if (((InterfaceC23676) next).mo10401()) {
                this.f65912 = true;
                c21665.next();
                this.f65909++;
                return c21665.next();
            }
        }
        return next;
    }

    @Override // p067l.AbstractC17640, p067l.C10936
    /* JADX INFO: renamed from: ܿ */
    public final Object mo25206() {
        Object objMo25206 = super.mo25206();
        if (this.f30310 == 0 && m47335(this.f52703)) {
            this.f65911 = this.f52703;
        }
        return objMo25206;
    }

    @Override // p067l.AbstractC17640
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo40164(Object obj) {
        this.f65908.getClass();
        return (obj == null ? 0 : ((InterfaceC23676) obj).getType()) == -1;
    }

    /* JADX INFO: renamed from: ᩷ */
    public final InterfaceC22336 m47336() {
        return this.f65907;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m47334(C14978 c14978) {
        this.f65907 = c14978;
    }

    @Override // p067l.InterfaceC6912
    /* JADX INFO: renamed from: ܽ */
    public final C8377 mo15845() {
        return this.f65908;
    }

    @Override // p067l.InterfaceC13638
    /* JADX INFO: renamed from: ۧ */
    public final int mo31015(int i) {
        Object objM40168 = m40168(i);
        this.f65908.getClass();
        if (objM40168 == null) {
            return 0;
        }
        return ((InterfaceC23676) objM40168).getType();
    }

    @Override // p067l.InterfaceC2888
    /* JADX INFO: renamed from: ֫ */
    public final Object mo4661(boolean z) {
        Object obj;
        int i = this.f30310;
        ArrayList arrayList = this.f30309;
        Object obj2 = arrayList.get(i);
        if (m47335(obj2)) {
            return obj2;
        }
        if (!z) {
            return null;
        }
        int i2 = this.f30310;
        do {
            i2--;
            if (i2 >= 0) {
                obj = arrayList.get(i2);
            } else {
                return this.f65911;
            }
        } while (!m47335(obj));
        return obj;
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m47335(Object obj) {
        this.f65908.getClass();
        InterfaceC8924 interfaceC8924 = obj instanceof C20324 ? ((C20324) obj).f62784 : null;
        return interfaceC8924 != null && interfaceC8924.getLine() > 0;
    }
}
