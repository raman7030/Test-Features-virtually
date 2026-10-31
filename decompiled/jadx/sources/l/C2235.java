package l;

import java.util.Comparator;

/* JADX INFO: renamed from: l.ۖۖۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 99PI */
/* JADX INFO: loaded from: classes2.dex */
public final class C2235 extends AbstractC0823 implements InterfaceC3415 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final Comparator f7298 = new C8585();

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public C17964 f7299;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f7300;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C9291 f7301;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final String f7302;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int m7418() {
        return this.f7300;
    }

    @Override // l.AbstractC0823
    /* JADX INFO: renamed from: ۢ */
    public final InterfaceC23338 mo1132() {
        return this.f7299;
    }

    @Override // l.AbstractC0823
    public final String getName() {
        return this.f7299.getName();
    }

    @Override // l.InterfaceC3415
    public final int getNumber() {
        return this.f7299.m41962();
    }

    public final String toString() {
        return this.f7299.getName();
    }

    @Override // l.AbstractC0823
    /* JADX INFO: renamed from: ܿ */
    public final String mo1141() {
        return this.f7302;
    }

    @Override // l.AbstractC0823
    /* JADX INFO: renamed from: ۧ */
    public final C5057 mo1134() {
        return this.f7301.f28162;
    }

    public final C9291 getType() {
        return this.f7301;
    }

    public C2235(C17964 c17964, C5057 c5057, C9291 c9291, int i) {
        super(0);
        this.f2993 = c9291;
        this.f7300 = i;
        this.f7299 = c17964;
        this.f7301 = c9291;
        this.f7302 = c9291.mo1141() + '.' + c17964.getName();
        c5057.f15895.m51849(this);
    }

    public C2235(C9291 c9291, Integer num) {
        super(0);
        String str = "UNKNOWN_ENUM_VALUE_" + c9291.getName() + "_" + num;
        C16552 c16552NewBuilder = C17964.newBuilder();
        c16552NewBuilder.m38935(str);
        c16552NewBuilder.m38934(num.intValue());
        C17964 c17964BuildPartial = c16552NewBuilder.buildPartial();
        if (c17964BuildPartial.isInitialized()) {
            this.f2993 = c9291;
            this.f7300 = -1;
            this.f7299 = c17964BuildPartial;
            this.f7301 = c9291;
            this.f7302 = c9291.mo1141() + '.' + c17964BuildPartial.getName();
            return;
        }
        throw AbstractC20704.m47318((InterfaceC23338) c17964BuildPartial);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m7417(C2235 c2235) {
        c2235.m3070(c2235.f7299.m41965().m52096());
    }
}
