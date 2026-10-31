package l;

import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: renamed from: l.᩺ۖ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 57Q8 */
/* JADX INFO: loaded from: classes.dex */
public final class C22694 implements InterfaceC9289 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C2002 f73327;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public InterfaceC9289[] f73328 = f73325;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final C4314 f73326 = new C4314();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC9289[] f73325 = new InterfaceC9289[0];

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C22694 m50706(C2903 c2903) {
        C22694 c22694 = (C22694) c2903.m8838(f73326);
        return c22694 == null ? new C22694(c2903) : c22694;
    }

    public C22694(C2903 c2903) {
        c2903.m8841(f73326, this);
        if (((C21284) c2903.m8837(C21284.class)) == null) {
            new HashMap();
        }
        this.f73327 = C2002.m6532(c2903);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m50708() {
        return this.f73328 == f73325;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m50709(C20578 c20578) {
        C2002 c2002 = this.f73327;
        InterfaceC7213 interfaceC7213M6533 = c2002.m6533(c2002.f6699);
        try {
            for (InterfaceC9289 interfaceC9289 : this.f73328) {
                ((C22694) interfaceC9289).m50709(c20578);
            }
            c2002.m6533(interfaceC7213M6533);
        } catch (Throwable th) {
            c2002.m6533(interfaceC7213M6533);
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m50707(C20578 c20578) {
        C2002 c2002 = this.f73327;
        InterfaceC7213 interfaceC7213M6533 = c2002.m6533(c2002.f6699);
        try {
            for (InterfaceC9289 interfaceC9289 : this.f73328) {
                ((C22694) interfaceC9289).m50707(c20578);
            }
            c2002.m6533(interfaceC7213M6533);
        } catch (Throwable th) {
            c2002.m6533(interfaceC7213M6533);
            throw th;
        }
    }

    public final String toString() {
        return Arrays.toString(this.f73328);
    }
}
