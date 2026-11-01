package p067l;

/* JADX INFO: renamed from: l.ܰۘ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 79ZP */
/* JADX INFO: loaded from: classes4.dex */
public final class C15273 implements InterfaceC15983 {

    /* JADX INFO: renamed from: ۗ */
    public int f43586;

    /* JADX INFO: renamed from: ۙ */
    public int f43587;

    /* JADX INFO: renamed from: ᩶ */
    public int f43588;

    /* JADX INFO: renamed from: ᩸ */
    public String f43589;

    /* JADX INFO: renamed from: ᩹ */
    public String f43590;

    @Override // p067l.InterfaceC15983
    public final int getAttributes() {
        return 17;
    }

    @Override // p067l.InterfaceC15983
    public final long length() {
        return 0L;
    }

    @Override // p067l.InterfaceC15983
    /* JADX INFO: renamed from: ۚ */
    public final long mo5425() {
        return 0L;
    }

    @Override // p067l.InterfaceC15983
    /* JADX INFO: renamed from: ܽ */
    public final int mo5427() {
        return 0;
    }

    @Override // p067l.InterfaceC15983
    public final String getName() {
        return this.f43590;
    }

    @Override // p067l.InterfaceC15983
    public final int getType() {
        return (this.f43588 & Integer.MIN_VALUE) != 0 ? 2 : 4;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ServerInfo1[name=");
        sb.append(this.f43590);
        sb.append(",versionMajor=");
        sb.append(this.f43587);
        sb.append(",versionMinor=");
        sb.append(this.f43586);
        sb.append(",type=0x");
        C20458.m46154(this.f43588, 8, ",commentOrMasterBrowser=", sb);
        return new String(C10965.m25286(sb, this.f43589, "]"));
    }
}
