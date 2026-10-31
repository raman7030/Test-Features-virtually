package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ܳ᩵᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: R8AK */
/* JADX INFO: loaded from: classes4.dex */
public final class C14740 implements InterfaceC18975 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4863 f45016;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7586 f45017;

    public C14740(C4863 c4863, C7586 c7586) {
        this.f45016 = c4863;
        this.f45017 = c7586;
    }

    @Override // l.InterfaceC18975
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int mo35043(long j, byte[] bArr, int i, int i2) {
        int iM20335 = this.f45017.m20335(j, bArr, i, i2);
        if (i2 == 0) {
            return 0;
        }
        if (iM20335 == 0) {
            return -1;
        }
        return iM20335;
    }

    @Override // l.InterfaceC18975
    public final void close() throws IOException {
        IOException iOExceptionM14185 = this.f45016.m14185(this.f45017, (IOException) null);
        if (iOExceptionM14185 != null) {
            throw iOExceptionM14185;
        }
    }
}
