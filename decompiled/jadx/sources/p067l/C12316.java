package p067l;

import java.io.BufferedReader;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۤᩳ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 195F */
/* JADX INFO: loaded from: classes3.dex */
public final class C12316 {

    /* JADX INFO: renamed from: ֫ */
    public final C14997 f34371;

    /* JADX INFO: renamed from: ᩳ */
    public final BufferedReader f34374;

    /* JADX INFO: renamed from: ܽ */
    public int f34373 = -2;

    /* JADX INFO: renamed from: ۧ */
    public int f34372 = -2;

    public C12316(BufferedReader bufferedReader, C14997 c14997) {
        this.f34374 = bufferedReader;
        this.f34371 = c14997;
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m28377() throws IOException {
        int iM28376 = m28376();
        if (iM28376 == -1) {
            return -1;
        }
        char c = (char) iM28376;
        if (Character.isHighSurrogate(c)) {
            int iM28377 = m28376();
            if (iM28377 != -1) {
                char c2 = (char) iM28377;
                if (Character.isLowSurrogate(c2)) {
                    return Character.toCodePoint(c, c2);
                }
            }
            this.f34372 = iM28377;
        }
        return iM28376;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m28376() throws IOException {
        int i = this.f34372;
        if (i != -2) {
            this.f34372 = -2;
            return i;
        }
        int i2 = this.f34373;
        BufferedReader bufferedReader = this.f34374;
        if (i2 != -2) {
            this.f34373 = -2;
        } else {
            i2 = bufferedReader.read();
        }
        if (i2 == -1) {
            return -1;
        }
        C14997 c14997 = this.f34371;
        if (i2 == 13) {
            int i3 = this.f34373;
            if (i3 != -2) {
                this.f34373 = -2;
            } else {
                i3 = bufferedReader.read();
            }
            if (i3 != 10) {
                if (c14997 != null) {
                    c14997.m34350("\r");
                }
                this.f34373 = i3;
                return 10;
            }
            if (c14997 != null) {
                c14997.m34350("\r\n");
                return 10;
            }
        } else {
            if (i2 != 10) {
                return i2;
            }
            if (c14997 != null) {
                c14997.m34350("\n");
            }
        }
        return 10;
    }
}
