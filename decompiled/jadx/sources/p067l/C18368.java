package p067l;

/* JADX INFO: renamed from: l.ܽᩴ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 09W2 */
/* JADX INFO: loaded from: classes4.dex */
public class C18368 implements InterfaceC15983 {

    /* JADX INFO: renamed from: ᩶ */
    public int f54865;

    /* JADX INFO: renamed from: ᩸ */
    public String f54866;

    /* JADX INFO: renamed from: ᩹ */
    public String f54867;

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

    public C18368() {
    }

    public C18368(String str) {
        this.f54866 = str;
        this.f54865 = 0;
        this.f54867 = null;
    }

    @Override // p067l.InterfaceC15983
    public final String getName() {
        return this.f54866;
    }

    @Override // p067l.InterfaceC15983
    public final int getType() {
        int i = this.f54865 & 65535;
        if (i != 1) {
            return i != 3 ? 8 : 16;
        }
        return 32;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C18368) {
            return C12826.equals(this.f54866, ((C18368) obj).f54866);
        }
        return false;
    }

    public final int hashCode() {
        return C12826.hashCode(this.f54866);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SmbShareInfo[netName=");
        sb.append(this.f54866);
        sb.append(",type=0x");
        C20458.m46154(this.f54865, 8, ",remark=", sb);
        return new String(C10965.m25286(sb, this.f54867, "]"));
    }
}
