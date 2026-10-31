package l;

import java.io.IOException;
import java.util.zip.ZipEntry;

/* JADX INFO: renamed from: l.᩸ܶۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: S50A */
/* JADX INFO: loaded from: classes5.dex */
public final class C21655 extends AbstractC23920 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22360 f69488;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11777 f69489;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6987 f69490;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21655(C22360 c22360, C11777 c11777, C11777 c11778, C6987 c6987) {
        super(c11777);
        this.f69488 = c22360;
        this.f69489 = c11778;
        this.f69490 = c6987;
    }

    @Override // l.AbstractC23920
    /* JADX INFO: renamed from: ֫ */
    public final void mo18882() {
        super.mo18882();
        String strM28813 = this.f69489.m28813();
        try {
            byte[] bArrM18891 = this.f69490.m18891();
            try {
                synchronized (this.f69488.f72446) {
                    this.f69488.f72446.putNextEntry(new ZipEntry(strM28813 + ".class"));
                    this.f69488.f72446.write(bArrM18891);
                    this.f69488.f72446.closeEntry();
                }
            } catch (IOException e) {
                throw new C5927(e);
            }
        } catch (Throwable th) {
            throw new C5927(C20094.m46315("ASM fail to generate .class file: ", strM28813), th);
        }
    }
}
