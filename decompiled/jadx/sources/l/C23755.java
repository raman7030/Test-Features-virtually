package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.᩻ܳۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: TBJG */
/* JADX INFO: loaded from: classes.dex */
public final class C23755 extends AbstractC1883 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f76901;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f76902;

    @Override // l.AbstractC1883
    /* JADX INFO: renamed from: ֫ */
    public final void mo6227() {
        this.f76901 = false;
    }

    @Override // l.AbstractC1883
    /* JADX INFO: renamed from: ܿ */
    public final boolean mo6232() {
        return this.f76902;
    }

    @Override // l.AbstractC1883
    /* JADX INFO: renamed from: ܳ */
    public final String mo6230() throws IOException {
        StringBuilder sb = new StringBuilder();
        while (!this.f76901) {
            this.f6393.mark(1);
            int i = this.f6393.read();
            if (i == -1) {
                break;
            }
            char c = (char) i;
            if (c == '<') {
                this.f6393.reset();
                this.f76901 = true;
            } else {
                sb.append(c);
            }
        }
        if (sb.length() < 1) {
            this.f76902 = false;
        } else if (sb.toString().trim().length() == 0) {
            String string = sb.toString();
            StringBuilder sb2 = new StringBuilder();
            for (int i2 = 0; i2 < string.length(); i2++) {
                char cCharAt = string.charAt(i2);
                if (cCharAt == '\n' || cCharAt == '\r') {
                    sb2.append(cCharAt);
                }
            }
            this.f76902 = false;
            sb = sb2;
        } else {
            this.f76902 = true;
        }
        return sb.toString();
    }
}
