package l;

import android.net.Uri;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: l.᩷ۚۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: L73O */
/* JADX INFO: loaded from: classes5.dex */
public final class C20666 implements InterfaceC21449 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public long f66551;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public InterfaceC21449 f66552;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C3104 f66554;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9377 f66556;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final ArrayList f66555 = new ArrayList();

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public long f66553 = -1;

    public C20666(C9377 c9377) {
        this.f66556 = c9377;
    }

    @Override // l.InterfaceC21449
    /* JADX INFO: renamed from: ֫ */
    public final void mo5937(InterfaceC0486 interfaceC0486) {
        ArrayList arrayList = this.f66555;
        if (arrayList.contains(interfaceC0486)) {
            return;
        }
        arrayList.add(interfaceC0486);
        InterfaceC21449 interfaceC21449 = this.f66552;
        if (interfaceC21449 != null) {
            interfaceC21449.mo5937(interfaceC0486);
        }
    }

    @Override // l.InterfaceC21449
    /* JADX INFO: renamed from: ֫ */
    public final long mo1620(C3104 c3104) throws IOException {
        if (this.f66552 != null) {
            throw new IOException("Data source is already open");
        }
        C9377 c9377 = this.f66556;
        long jM35345 = c9377.f28479.m35345();
        InterfaceC21449 interfaceC21449Mo6247 = (jM35345 >= 0 ? c9377.f28480 : c9377.f28481).mo6247();
        this.f66552 = interfaceC21449Mo6247;
        this.f66554 = c3104;
        this.f66551 = 0L;
        this.f66553 = jM35345;
        Iterator it = this.f66555.iterator();
        while (it.hasNext()) {
            interfaceC21449Mo6247.mo5937((InterfaceC0486) it.next());
        }
        return (jM35345 < 0 || c9377.f28479.m35344(jM35345)) ? interfaceC21449Mo6247.mo1620(c3104) : m47283();
    }

    @Override // l.InterfaceC9765
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        InterfaceC21449 interfaceC21449 = this.f66552;
        if (interfaceC21449 == null) {
            throw new IOException("Data source is not open");
        }
        if (this.f66553 >= 0 && !this.f66556.f28479.m35344(this.f66553)) {
            C3104 c3104 = this.f66554;
            if (c3104 != null) {
                long j = c3104.f9713;
                if (j != -1 && this.f66551 >= j) {
                    return -1;
                }
            }
            m47283();
            interfaceC21449 = this.f66552;
        }
        int i3 = interfaceC21449.read(bArr, i, i2);
        if (i3 > 0) {
            this.f66551 += (long) i3;
        }
        return i3;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private long m47283() throws IOException {
        C3104 c3104 = this.f66554;
        if (c3104 == null) {
            throw new IOException("HLS media data spec is missing");
        }
        InterfaceC21449 interfaceC21449 = this.f66552;
        if (interfaceC21449 != null) {
            try {
                interfaceC21449.close();
            } catch (IOException | RuntimeException unused) {
            }
        }
        InterfaceC21449 interfaceC21449Mo6247 = this.f66556.f28481.mo6247();
        this.f66552 = interfaceC21449Mo6247;
        this.f66553 = -1L;
        Iterator it = this.f66555.iterator();
        while (it.hasNext()) {
            interfaceC21449Mo6247.mo5937((InterfaceC0486) it.next());
        }
        long j = this.f66551;
        long j2 = c3104.f9713;
        return interfaceC21449Mo6247.mo1620(c3104.m9466(j, j2 != -1 ? j2 - j : -1L));
    }

    @Override // l.InterfaceC21449
    /* JADX INFO: renamed from: ܿ */
    public final Uri mo1621() {
        InterfaceC21449 interfaceC21449 = this.f66552;
        if (interfaceC21449 == null) {
            return null;
        }
        return interfaceC21449.mo1621();
    }

    @Override // l.InterfaceC21449
    /* JADX INFO: renamed from: ֫ */
    public final Map mo5936() {
        InterfaceC21449 interfaceC21449 = this.f66552;
        return interfaceC21449 == null ? Collections.EMPTY_MAP : interfaceC21449.mo5936();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l.InterfaceC21449
    public final void close() {
        InterfaceC21449 interfaceC21449 = this.f66552;
        if (interfaceC21449 != null) {
            try {
                interfaceC21449.close();
            } finally {
                this.f66552 = null;
                this.f66554 = null;
                this.f66551 = 0L;
                this.f66553 = -1L;
            }
        }
    }
}
