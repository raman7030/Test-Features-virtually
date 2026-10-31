package l;

import android.net.Uri;
import com.alipay.sdk.m.n.a;
import com.alipay.sdk.m.n.b;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: renamed from: l.ۡۗۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 075F */
/* JADX INFO: loaded from: classes4.dex */
public final class C8609 implements InterfaceC21449 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public InterfaceC21449 f26311;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ArrayList f26312 = new ArrayList();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18487 f26313;

    public C8609(C18487 c18487) {
        this.f26313 = c18487;
    }

    @Override // l.InterfaceC21449
    /* JADX INFO: renamed from: ֫ */
    public final void mo5937(InterfaceC0486 interfaceC0486) {
        ArrayList arrayList = this.f26312;
        if (arrayList.contains(interfaceC0486)) {
            return;
        }
        arrayList.add(interfaceC0486);
    }

    @Override // l.InterfaceC21449
    /* JADX INFO: renamed from: ֫ */
    public final long mo1620(C3104 c3104) throws IOException {
        InterfaceC21449 interfaceC21449Mo6247;
        if (this.f26311 != null) {
            throw new IOException("Data source is already open");
        }
        Uri uri = c3104.f9711;
        String scheme = uri.getScheme();
        String lowerCase = scheme == null ? "" : scheme.toLowerCase(Locale.ROOT);
        boolean zEquals = lowerCase.equals(a.s);
        C18487 c18487 = this.f26313;
        if (zEquals || lowerCase.equals(b.a)) {
            interfaceC21449Mo6247 = c18487.f57312.mo6247();
        } else if (lowerCase.equals("mt_media") && uri.getAuthority() == null && c18487.f57311 != null) {
            interfaceC21449Mo6247 = c18487.f57311.mo6247();
        } else {
            throw new IOException("Unsupported media URI scheme");
        }
        this.f26311 = interfaceC21449Mo6247;
        Iterator it = this.f26312.iterator();
        while (it.hasNext()) {
            this.f26311.mo5937((InterfaceC0486) it.next());
        }
        return this.f26311.mo1620(c3104);
    }

    @Override // l.InterfaceC9765
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        InterfaceC21449 interfaceC21449 = this.f26311;
        if (interfaceC21449 == null) {
            throw new IOException("Data source is not open");
        }
        return interfaceC21449.read(bArr, i, i2);
    }

    @Override // l.InterfaceC21449
    /* JADX INFO: renamed from: ܿ */
    public final Uri mo1621() {
        InterfaceC21449 interfaceC21449 = this.f26311;
        if (interfaceC21449 == null) {
            return null;
        }
        return interfaceC21449.mo1621();
    }

    @Override // l.InterfaceC21449
    /* JADX INFO: renamed from: ֫ */
    public final Map mo5936() {
        InterfaceC21449 interfaceC21449 = this.f26311;
        return interfaceC21449 == null ? Collections.EMPTY_MAP : interfaceC21449.mo5936();
    }

    @Override // l.InterfaceC21449
    public final void close() {
        InterfaceC21449 interfaceC21449 = this.f26311;
        if (interfaceC21449 != null) {
            try {
                interfaceC21449.close();
            } finally {
                this.f26311 = null;
            }
        }
    }
}
