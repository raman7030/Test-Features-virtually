package p067l;

import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: renamed from: l.᩺ۖ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 57Q8 */
/* JADX INFO: loaded from: classes.dex */
public final class C23936 implements InterfaceC11196 {

    /* JADX INFO: renamed from: ֫ */
    public final C4271 f76053;

    /* JADX INFO: renamed from: ۧ */
    public InterfaceC11196[] f76054 = f76051;

    /* JADX INFO: renamed from: ᩳ */
    public static final C6468 f76052 = new C6468();

    /* JADX INFO: renamed from: ܽ */
    public static final InterfaceC11196[] f76051 = new InterfaceC11196[0];

    /* JADX INFO: renamed from: ֫ */
    public static C23936 m53032(C5127 c5127) {
        C23936 c23936 = (C23936) c5127.m10905(f76052);
        return c23936 == null ? new C23936(c5127) : c23936;
    }

    public C23936(C5127 c5127) {
        c5127.m10908(f76052, this);
        if (((C22596) c5127.m10904(C22596.class)) == null) {
            new HashMap();
        }
        this.f76053 = C4271.m8674(c5127);
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m53034() {
        return this.f76054 == f76051;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m53035(C21925 c21925) {
        C4271 c4271 = this.f76053;
        InterfaceC9223 interfaceC9223M8675 = c4271.m8675(c4271.f9486);
        try {
            for (InterfaceC11196 interfaceC11196 : this.f76054) {
                ((C23936) interfaceC11196).m53035(c21925);
            }
            c4271.m8675(interfaceC9223M8675);
        } catch (Throwable th) {
            c4271.m8675(interfaceC9223M8675);
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m53033(C21925 c21925) {
        C4271 c4271 = this.f76053;
        InterfaceC9223 interfaceC9223M8675 = c4271.m8675(c4271.f9486);
        try {
            for (InterfaceC11196 interfaceC11196 : this.f76054) {
                ((C23936) interfaceC11196).m53033(c21925);
            }
            c4271.m8675(interfaceC9223M8675);
        } catch (Throwable th) {
            c4271.m8675(interfaceC9223M8675);
            throw th;
        }
    }

    public final String toString() {
        return Arrays.toString(this.f76054);
    }
}
