package p067l;

import java.io.IOException;
import java.util.zip.ZipEntry;

/* JADX INFO: renamed from: l.᩸ܶۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: S50A */
/* JADX INFO: loaded from: classes5.dex */
public final class C22949 extends AbstractC25102 {

    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ C23619 f72192;

    /* JADX INFO: renamed from: ܿ */
    public final /* synthetic */ C13561 f72193;

    /* JADX INFO: renamed from: ᩳ */
    public final /* synthetic */ C9009 f72194;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22949(C23619 c23619, C13561 c13561, C13561 c13562, C9009 c9009) {
        super(c13561);
        this.f72192 = c23619;
        this.f72193 = c13562;
        this.f72194 = c9009;
    }

    @Override // p067l.AbstractC25102
    /* JADX INFO: renamed from: ֫ */
    public final void mo20836() {
        super.mo20836();
        String strM30861 = this.f72193.m30861();
        try {
            byte[] bArrM20845 = this.f72194.m20845();
            try {
                synchronized (this.f72192.f75172) {
                    this.f72192.f75172.putNextEntry(new ZipEntry(strM30861 + ".class"));
                    this.f72192.f75172.write(bArrM20845);
                    this.f72192.f75172.closeEntry();
                }
            } catch (IOException e) {
                throw new C8001(e);
            }
        } catch (Throwable th) {
            throw new C8001(C21466.m48631("ASM fail to generate .class file: ", strM30861), th);
        }
    }
}
