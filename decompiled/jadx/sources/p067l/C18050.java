package p067l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ܽ۟ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: V717 */
/* JADX INFO: loaded from: classes4.dex */
public final class C18050 {

    /* JADX INFO: renamed from: ֫ */
    public C15801 f53887;

    /* JADX INFO: renamed from: ۧ */
    public C11598 f53888;

    /* JADX INFO: renamed from: ֫ */
    public final void m41090() {
        C11598 c11598 = this.f53888;
        if (c11598 != null) {
            try {
                c11598.close();
            } catch (IOException unused) {
            }
        }
        C15801 c15801 = this.f53887;
        if (c15801 != null) {
            try {
                c15801.close();
            } catch (IOException unused2) {
            }
        }
    }
}
