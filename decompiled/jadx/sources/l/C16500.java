package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ܽ۟ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: V717 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16500 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C14133 f50710;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C9711 f50711;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m38864() {
        C9711 c9711 = this.f50711;
        if (c9711 != null) {
            try {
                c9711.close();
            } catch (IOException unused) {
            }
        }
        C14133 c14133 = this.f50710;
        if (c14133 != null) {
            try {
                c14133.close();
            } catch (IOException unused2) {
            }
        }
    }
}
