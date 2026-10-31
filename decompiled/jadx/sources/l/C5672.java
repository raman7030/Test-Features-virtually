package l;

/* JADX INFO: renamed from: l.ۚ᩺᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: U1FZ */
/* JADX INFO: loaded from: classes2.dex */
public final class C5672 extends Exception {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public String f17512;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f17513;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f17514;

    /* JADX WARN: Illegal instructions before constructor call */
    public C5672(String str, C1580 c1580) {
        StringBuilder sbM19190 = C7166.m19190(str, ": ");
        sbM19190.append(c1580.getMessage());
        super(sbM19190.toString(), c1580);
        this.f17512 = str;
        this.f17514 = c1580.m5400().m38634();
        this.f17513 = c1580.m5400().m38625() - 1;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m15979() {
        return this.f17512;
    }
}
