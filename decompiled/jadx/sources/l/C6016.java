package l;

/* JADX INFO: renamed from: l.ۛۧۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: K1EG */
/* JADX INFO: loaded from: classes2.dex */
public final class C6016 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public String f18462;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public StringBuilder f18463 = new StringBuilder();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f18464 = true;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m16827(String str, String str2) {
        if (this.f18464) {
            StringBuilder sb = this.f18463;
            if (sb.length() > 5000) {
                this.f18464 = false;
                sb.append("\n......");
                return;
            }
            if (!str.equals(this.f18462)) {
                this.f18462 = str;
                if (sb.length() > 0) {
                    sb.append("\n\n");
                }
                sb.append(">> ");
                sb.append(str);
            }
            sb.append('\n');
            sb.append(str2);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m16828() {
        return this.f18463.length() > 0;
    }

    public final String toString() {
        return this.f18463.toString();
    }
}
