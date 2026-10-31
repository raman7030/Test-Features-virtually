package l;

import java.io.DataOutputStream;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۡۧܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: D70T */
/* JADX INFO: loaded from: classes3.dex */
public final class C8841 implements AutoCloseable {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final C16059 f26920;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long f26921;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18177 f26922;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final boolean f26923;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final InterfaceC18883 f26924;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final InterfaceC18883 f26925;

    public C8841(C18177 c18177, InterfaceC18883 interfaceC18883, InterfaceC18883 interfaceC18884, C16059 c16059, boolean z, long j) {
        this.f26922 = c18177;
        this.f26925 = interfaceC18883;
        this.f26924 = interfaceC18884;
        this.f26920 = c16059;
        this.f26923 = z;
        this.f26921 = j;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long m22843() {
        return this.f26920.m37965();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m22844(DataOutputStream dataOutputStream) {
        C16059 c16059 = this.f26920;
        c16059.m37969();
        C18177.m42319(dataOutputStream, this.f26925, c16059, this.f26923);
        c16059.m37969();
        C18177.m42327(this.f26922, this);
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws IOException {
        try {
            this.f26920.close();
            e = null;
        } catch (IOException e) {
            e = e;
        }
        try {
            this.f26924.close();
        } catch (IOException e2) {
            if (e == null) {
                e = e2;
            } else {
                e.addSuppressed(e2);
            }
        }
        if (e != null) {
            throw e;
        }
    }
}
