package l;

/* JADX INFO: renamed from: l.ܽᩴ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 09W2 */
/* JADX INFO: loaded from: classes4.dex */
public class C16834 implements InterfaceC14325 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f51685;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public String f51686;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public String f51687;

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

    public C16834() {
    }

    public C16834(String str) {
        this.f51686 = str;
        this.f51685 = 0;
        this.f51687 = null;
    }

    @Override // l.InterfaceC14325
    public final String getName() {
        return this.f51686;
    }

    @Override // l.InterfaceC14325
    public final int getType() {
        int i = this.f51685 & 65535;
        if (i != 1) {
            return i != 3 ? 8 : 16;
        }
        return 32;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C16834) {
            return C11003.equals(this.f51686, ((C16834) obj).f51686);
        }
        return false;
    }

    public final int hashCode() {
        return C11003.hashCode(this.f51686);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SmbShareInfo[netName=");
        sb.append(this.f51686);
        sb.append(",type=0x");
        C19033.m43886(this.f51685, 8, ",remark=", sb);
        return new String(C9045.m23341(sb, this.f51687, "]"));
    }
}
