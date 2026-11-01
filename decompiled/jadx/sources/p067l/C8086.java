package p067l;

/* JADX INFO: renamed from: l.ۛۧۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: K1EG */
/* JADX INFO: loaded from: classes2.dex */
public final class C8086 {

    /* JADX INFO: renamed from: ֫ */
    public String f21317;

    /* JADX INFO: renamed from: ۧ */
    public StringBuilder f21318 = new StringBuilder();

    /* JADX INFO: renamed from: ܽ */
    public boolean f21319 = true;

    /* JADX INFO: renamed from: ֫ */
    public final void m18755(String str, String str2) {
        if (this.f21319) {
            StringBuilder sb = this.f21318;
            if (sb.length() > 5000) {
                this.f21319 = false;
                sb.append("\n......");
                return;
            }
            if (!str.equals(this.f21317)) {
                this.f21317 = str;
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

    /* JADX INFO: renamed from: ֫ */
    public final boolean m18756() {
        return this.f21318.length() > 0;
    }

    public final String toString() {
        return this.f21318.toString();
    }
}
