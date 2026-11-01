package p067l;

import java.io.IOException;

/* JADX INFO: renamed from: l.᩻ܳۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: TBJG */
/* JADX INFO: loaded from: classes.dex */
public final class C24945 extends AbstractC4158 {

    /* JADX INFO: renamed from: ܽ */
    public boolean f79653;

    /* JADX INFO: renamed from: ᩳ */
    public boolean f79654;

    @Override // p067l.AbstractC4158
    /* JADX INFO: renamed from: ֫ */
    public final void mo8429() {
        this.f79653 = false;
    }

    @Override // p067l.AbstractC4158
    /* JADX INFO: renamed from: ܿ */
    public final boolean mo8434() {
        return this.f79654;
    }

    @Override // p067l.AbstractC4158
    /* JADX INFO: renamed from: ܳ */
    public final String mo8432() throws IOException {
        StringBuilder sb = new StringBuilder();
        while (!this.f79653) {
            this.f9175.mark(1);
            int i = this.f9175.read();
            if (i == -1) {
                break;
            }
            char c = (char) i;
            if (c == '<') {
                this.f9175.reset();
                this.f79653 = true;
            } else {
                sb.append(c);
            }
        }
        if (sb.length() < 1) {
            this.f79654 = false;
        } else if (sb.toString().trim().length() == 0) {
            String string = sb.toString();
            StringBuilder sb2 = new StringBuilder();
            for (int i2 = 0; i2 < string.length(); i2++) {
                char cCharAt = string.charAt(i2);
                if (cCharAt == '\n' || cCharAt == '\r') {
                    sb2.append(cCharAt);
                }
            }
            this.f79654 = false;
            sb = sb2;
        } else {
            this.f79654 = true;
        }
        return sb.toString();
    }
}
