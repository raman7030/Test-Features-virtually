package p067l;

/* JADX INFO: renamed from: l.ܶ᩺ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 38C6 */
/* JADX INFO: loaded from: classes4.dex */
public final class C17136 {

    /* JADX INFO: renamed from: ֫ */
    public String f51018;

    /* JADX INFO: renamed from: ۧ */
    public Integer f51019;

    /* JADX INFO: renamed from: ܿ */
    public final boolean m38800() {
        String str = this.f51018;
        return (str == null || str.isEmpty()) ? false : true;
    }

    /* JADX INFO: renamed from: ۧ */
    public final String m38798() {
        return this.f51018;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m38795(String str) {
        this.f51018 = str;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m38794(Integer num) {
        this.f51019 = num;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final boolean m38801() {
        return this.f51019 != null;
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m38799() {
        Integer num = this.f51019;
        C12826.requireNonNull(num);
        return num.intValue();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m38796(byte[] bArr) {
        C14677 c14677 = new C14677(bArr);
        byte b = c14677.readByte();
        if ((b & 1) != 0) {
            this.f51018 = c14677.m33593();
        } else {
            this.f51018 = null;
        }
        if ((b & 2) != 0) {
            this.f51019 = Integer.valueOf(c14677.m33581() & 4095);
        } else {
            this.f51019 = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ֫ */
    public final byte[] m38797() {
        C11996 c11996 = new C11996();
        boolean zM38800 = m38800();
        int i = zM38800;
        if (m38801()) {
            i = (zM38800 ? 1 : 0) | 2;
        }
        c11996.writeByte(i);
        if (m38800()) {
            c11996.m27459(this.f51018);
        }
        if (m38801()) {
            c11996.mo15113(m38799() & 4095);
        }
        return c11996.m27464();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MTUnixExtraData{link='");
        sb.append(this.f51018);
        sb.append("', permissions=");
        Integer num = this.f51019;
        sb.append(num == null ? null : Integer.toOctalString(num.intValue()));
        sb.append('}');
        return sb.toString();
    }
}
