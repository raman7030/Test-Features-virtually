package l;

/* JADX INFO: renamed from: l.ܰۘ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 79ZP */
/* JADX INFO: loaded from: classes4.dex */
public final class C13578 implements InterfaceC14325 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f40509;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f40510;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f40511;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public String f40512;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public String f40513;

    @Override // l.InterfaceC14325
    public final int getAttributes() {
        return 17;
    }

    @Override // l.InterfaceC14325
    public final long length() {
        return 0L;
    }

    @Override // l.InterfaceC14325
    /* JADX INFO: renamed from: ۚ */
    public final long mo3111() {
        return 0L;
    }

    @Override // l.InterfaceC14325
    /* JADX INFO: renamed from: ܽ */
    public final int mo3113() {
        return 0;
    }

    @Override // l.InterfaceC14325
    public final String getName() {
        return this.f40513;
    }

    @Override // l.InterfaceC14325
    public final int getType() {
        return (this.f40511 & Integer.MIN_VALUE) != 0 ? 2 : 4;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ServerInfo1[name=");
        sb.append(this.f40513);
        sb.append(",versionMajor=");
        sb.append(this.f40510);
        sb.append(",versionMinor=");
        sb.append(this.f40509);
        sb.append(",type=0x");
        C19033.m43886(this.f40511, 8, ",commentOrMasterBrowser=", sb);
        return new String(C9045.m23341(sb, this.f40512, "]"));
    }
}
