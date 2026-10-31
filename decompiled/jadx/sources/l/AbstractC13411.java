package l;

import java.io.Serializable;

/* JADX INFO: renamed from: l.۬᩹᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: Z1DC */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC13411 implements InterfaceC12643, Serializable {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final Object f40078 = C3534.f11222;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public transient InterfaceC12643 f40079;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object f40080;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final String f40081;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final Class f40082;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean f40083;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final String f40084;

    /* JADX INFO: renamed from: ܽ */
    public abstract InterfaceC12643 mo6746();

    public AbstractC13411(Object obj, Class cls, String str, String str2, boolean z) {
        this.f40080 = obj;
        this.f40082 = cls;
        this.f40084 = str;
        this.f40081 = str2;
        this.f40083 = z;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public InterfaceC12643 mo32424() {
        InterfaceC12643 interfaceC12643 = this.f40079;
        if (interfaceC12643 != null) {
            return interfaceC12643;
        }
        InterfaceC12643 interfaceC12643Mo6746 = mo6746();
        this.f40079 = interfaceC12643Mo6746;
        return interfaceC12643Mo6746;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final InterfaceC12706 m32425() {
        Class cls = this.f40082;
        if (cls == null) {
            return null;
        }
        return this.f40083 ? C6999.m18938(cls) : C6999.m18935(cls);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String m32426() {
        return this.f40084;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final String m32427() {
        return this.f40081;
    }
}
