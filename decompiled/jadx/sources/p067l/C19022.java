package p067l;

import java.io.IOException;
import java.io.StringWriter;

/* JADX INFO: renamed from: l.ܿᩴ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: V2E3 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19022 extends AbstractC23974 {

    /* JADX INFO: renamed from: ۧ */
    public final boolean f56710 = true;

    /* JADX INFO: renamed from: ܽ */
    public final C22296 f56711;

    public C19022(int i, int i2) {
        this.f56711 = C22296.m50114(Integer.valueOf(i), Integer.valueOf(i2));
    }

    /* JADX INFO: renamed from: ֫ */
    public static C19022 m43219(int i, int i2) {
        return new C19022(i, i2);
    }

    @Override // p067l.AbstractC23974
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo25330(int i, StringWriter stringWriter) throws IOException {
        if (this.f56710 != this.f56711.m50115(Integer.valueOf(i))) {
            return false;
        }
        stringWriter.write("&#");
        stringWriter.write(Integer.toString(i, 10));
        stringWriter.write(59);
        return true;
    }
}
