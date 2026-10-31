package l;

/* JADX INFO: renamed from: l.᩻᩷ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 88UO */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC23946 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f77657;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C2074 f77658;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C16890 f77659;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final InterfaceC14773 f77660;

    public AbstractC23946(InterfaceC18302 interfaceC18302, InterfaceC14773 interfaceC14773, long j, long j2, long j3, long j4, long j5, int i) {
        this.f77660 = interfaceC14773;
        this.f77657 = i;
        this.f77658 = new C2074(interfaceC18302, j, j2, j3, j4, j5);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C2074 m52771() {
        return this.f77658;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m52772(long j) {
        C16890 c16890 = this.f77659;
        if (c16890 == null || C16890.m39724(c16890) != j) {
            C2074 c2074 = this.f77658;
            this.f77659 = new C16890(j, c2074.m6828(j), 0L, c2074.f6921, c2074.f6922, c2074.f6919, c2074.f6918);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m52773() {
        return this.f77659 != null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m52770(InterfaceC8424 interfaceC8424, C23615 c23615) {
        while (true) {
            C16890 c16890 = this.f77659;
            C22632.m50632(c16890);
            long jM39720 = C16890.m39720(c16890);
            long jM39718 = C16890.m39718(c16890);
            long jM39722 = C16890.m39722(c16890);
            long j = jM39718 - jM39720;
            long j2 = this.f77657;
            InterfaceC14773 interfaceC14773 = this.f77660;
            if (j <= j2) {
                this.f77659 = null;
                interfaceC14773.mo27215();
                return m52769(interfaceC8424, jM39720, c23615);
            }
            long position = jM39722 - interfaceC8424.getPosition();
            if (position < 0 || position > 262144) {
                return m52769(interfaceC8424, jM39722, c23615);
            }
            interfaceC8424.mo22070((int) position);
            interfaceC8424.mo22066();
            C17596 c17596Mo27214 = interfaceC14773.mo27214(interfaceC8424, C16890.m39723(c16890));
            int i = c17596Mo27214.f53770;
            if (i == -3) {
                this.f77659 = null;
                interfaceC14773.mo27215();
                return m52769(interfaceC8424, jM39722, c23615);
            }
            if (i == -2) {
                C16890.m39721(c16890, c17596Mo27214.f53769, c17596Mo27214.f53768);
            } else {
                if (i != -1) {
                    if (i != 0) {
                        throw new IllegalStateException("Invalid case");
                    }
                    long position2 = c17596Mo27214.f53768 - interfaceC8424.getPosition();
                    if (position2 >= 0 && position2 <= 262144) {
                        interfaceC8424.mo22070((int) position2);
                    }
                    this.f77659 = null;
                    interfaceC14773.mo27215();
                    return m52769(interfaceC8424, c17596Mo27214.f53768, c23615);
                }
                C16890.m39719(c16890, c17596Mo27214.f53769, c17596Mo27214.f53768);
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m52769(InterfaceC8424 interfaceC8424, long j, C23615 c23615) {
        if (j == interfaceC8424.getPosition()) {
            return 0;
        }
        c23615.f76532 = j;
        return 1;
    }
}
