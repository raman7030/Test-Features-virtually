package l;

import android.net.Uri;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: l.ۖۗۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 075F */
/* JADX INFO: loaded from: classes3.dex */
public final class C2259 implements InterfaceC21449 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public volatile boolean f7340;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public InterfaceC21449 f7341;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C21453 f7342;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3670 f7343;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final ArrayList f7344 = new ArrayList();

    public C2259(C3670 c3670) {
        this.f7343 = c3670;
    }

    @Override // l.InterfaceC21449
    /* JADX INFO: renamed from: ֫ */
    public final void mo5937(InterfaceC0486 interfaceC0486) {
        ArrayList arrayList = this.f7344;
        if (arrayList.contains(interfaceC0486)) {
            return;
        }
        arrayList.add(interfaceC0486);
    }

    @Override // l.InterfaceC21449
    /* JADX INFO: renamed from: ֫ */
    public final long mo1620(C3104 c3104) throws IOException {
        InterfaceC21449 c20604;
        if (this.f7341 != null || this.f7340) {
            throw new IOException("Data source is already open");
        }
        C21453 c21453M9475 = C3108.m9475(this.f7343.f11602, c3104.f9711, this.f7343.f11603, new C15663(this));
        this.f7342 = c21453M9475;
        if (this.f7340) {
            c21453M9475.close();
            throw new InterruptedIOException("HTTP media open was canceled");
        }
        String strM48603 = c21453M9475.m48603();
        if (strM48603 != null) {
            c20604 = new C20604(new C9315(this.f7343.f11602, this.f7343.f11603, new C7037(strM48603)));
        } else {
            c20604 = this.f7343.f11603.mo6247();
        }
        this.f7341 = c20604;
        if (this.f7340) {
            this.f7341 = null;
            c20604.close();
            c21453M9475.close();
            throw new InterruptedIOException("HTTP media open was canceled");
        }
        Iterator it = this.f7344.iterator();
        while (it.hasNext()) {
            c20604.mo5937((InterfaceC0486) it.next());
        }
        return c20604.mo1620(c3104);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m7462(C2259 c2259, C21453 c21453) {
        c2259.f7342 = c21453;
        if (c2259.f7340) {
            c21453.close();
        }
    }

    @Override // l.InterfaceC9765
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        InterfaceC21449 interfaceC21449 = this.f7341;
        if (interfaceC21449 == null) {
            throw new IOException("Data source is not open");
        }
        return interfaceC21449.read(bArr, i, i2);
    }

    @Override // l.InterfaceC21449
    /* JADX INFO: renamed from: ܿ */
    public final Uri mo1621() {
        InterfaceC21449 interfaceC21449 = this.f7341;
        if (interfaceC21449 == null) {
            return null;
        }
        return interfaceC21449.mo1621();
    }

    @Override // l.InterfaceC21449
    /* JADX INFO: renamed from: ֫ */
    public final Map mo5936() {
        InterfaceC21449 interfaceC21449 = this.f7341;
        return interfaceC21449 == null ? Collections.EMPTY_MAP : interfaceC21449.mo5936();
    }

    @Override // l.InterfaceC21449
    public final void close() {
        this.f7340 = true;
        InterfaceC21449 interfaceC21449 = this.f7341;
        this.f7341 = null;
        if (interfaceC21449 != null) {
            try {
                interfaceC21449.close();
            } finally {
                C21453 c21453 = this.f7342;
                this.f7342 = null;
                if (c21453 != null) {
                    c21453.close();
                }
            }
        }
    }
}
