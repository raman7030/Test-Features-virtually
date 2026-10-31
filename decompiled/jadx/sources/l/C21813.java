package l;

import android.os.ParcelFileDescriptor;
import java.io.File;
import java.io.IOException;

/* JADX INFO: renamed from: l.᩸᩶ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: N17O */
/* JADX INFO: loaded from: classes.dex */
public final class C21813 extends AbstractC6478 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final String f69890;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f69891;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final String f69892;

    public C21813(ParcelFileDescriptor parcelFileDescriptor, String str, String str2, boolean z) {
        super(parcelFileDescriptor);
        this.f69892 = str;
        this.f69890 = str2;
        this.f69891 = z;
    }

    @Override // l.InterfaceC2245
    public final String getName() {
        return new File(this.f69892).getName();
    }

    @Override // l.InterfaceC2245
    /* JADX INFO: renamed from: ۡ */
    public final InterfaceC2245 mo7437() {
        return C3468.m10607(this.f69891).m45388(this.f69892, this.f69890);
    }

    @Override // l.AbstractC6478, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f69890.equals("r")) {
            try {
                super.close();
            } catch (IOException unused) {
            }
        } else {
            super.close();
        }
    }
}
