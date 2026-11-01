package p067l;

import android.os.ParcelFileDescriptor;
import java.io.File;
import java.io.IOException;

/* JADX INFO: renamed from: l.᩸᩶ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: N17O */
/* JADX INFO: loaded from: classes.dex */
public final class C23100 extends AbstractC8525 {

    /* JADX INFO: renamed from: ۗ */
    public final String f72598;

    /* JADX INFO: renamed from: ۙ */
    public final boolean f72599;

    /* JADX INFO: renamed from: ۬ */
    public final String f72600;

    public C23100(ParcelFileDescriptor parcelFileDescriptor, String str, String str2, boolean z) {
        super(parcelFileDescriptor);
        this.f72600 = str;
        this.f72598 = str2;
        this.f72599 = z;
    }

    @Override // p067l.InterfaceC4502
    public final String getName() {
        return new File(this.f72600).getName();
    }

    @Override // p067l.InterfaceC4502
    /* JADX INFO: renamed from: ۡ */
    public final InterfaceC4502 mo9519() {
        return C5665.m12615(this.f72599).m47685(this.f72600, this.f72598);
    }

    @Override // p067l.AbstractC8525, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f72598.equals("r")) {
            try {
                super.close();
            } catch (IOException unused) {
            }
        } else {
            super.close();
        }
    }
}
