package p067l;

import android.net.Uri;
import com.alipay.sdk.p010m.p037n.C0170a;
import com.alipay.sdk.p010m.p037n.C0171b;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: renamed from: l.ۡۗۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 075F */
/* JADX INFO: loaded from: classes4.dex */
public final class C10550 implements InterfaceC22753 {

    /* JADX INFO: renamed from: ֫ */
    public InterfaceC22753 f29227;

    /* JADX INFO: renamed from: ۧ */
    public final ArrayList f29228 = new ArrayList();

    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ C19938 f29229;

    public C10550(C19938 c19938) {
        this.f29229 = c19938;
    }

    @Override // p067l.InterfaceC22753
    /* JADX INFO: renamed from: ֫ */
    public final void mo8132(InterfaceC2830 interfaceC2830) {
        ArrayList arrayList = this.f29228;
        if (arrayList.contains(interfaceC2830)) {
            return;
        }
        arrayList.add(interfaceC2830);
    }

    @Override // p067l.InterfaceC22753
    /* JADX INFO: renamed from: ֫ */
    public final long mo4020(C5318 c5318) throws IOException {
        InterfaceC22753 interfaceC22753Mo8449;
        if (this.f29227 != null) {
            throw new IOException("Data source is already open");
        }
        Uri uri = c5318.f12514;
        String scheme = uri.getScheme();
        String lowerCase = scheme == null ? "" : scheme.toLowerCase(Locale.ROOT);
        boolean zEquals = lowerCase.equals(C0170a.f680s);
        C19938 c19938 = this.f29229;
        if (zEquals || lowerCase.equals(C0171b.f688a)) {
            interfaceC22753Mo8449 = c19938.f60531.mo8449();
        } else if (lowerCase.equals("mt_media") && uri.getAuthority() == null && c19938.f60530 != null) {
            interfaceC22753Mo8449 = c19938.f60530.mo8449();
        } else {
            throw new IOException("Unsupported media URI scheme");
        }
        this.f29227 = interfaceC22753Mo8449;
        Iterator it = this.f29228.iterator();
        while (it.hasNext()) {
            this.f29227.mo8132((InterfaceC2830) it.next());
        }
        return this.f29227.mo4020(c5318);
    }

    @Override // p067l.InterfaceC11649
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        InterfaceC22753 interfaceC22753 = this.f29227;
        if (interfaceC22753 == null) {
            throw new IOException("Data source is not open");
        }
        return interfaceC22753.read(bArr, i, i2);
    }

    @Override // p067l.InterfaceC22753
    /* JADX INFO: renamed from: ܿ */
    public final Uri mo4021() {
        InterfaceC22753 interfaceC22753 = this.f29227;
        if (interfaceC22753 == null) {
            return null;
        }
        return interfaceC22753.mo4021();
    }

    @Override // p067l.InterfaceC22753
    /* JADX INFO: renamed from: ֫ */
    public final Map mo8131() {
        InterfaceC22753 interfaceC22753 = this.f29227;
        return interfaceC22753 == null ? Collections.EMPTY_MAP : interfaceC22753.mo8131();
    }

    @Override // p067l.InterfaceC22753
    public final void close() {
        InterfaceC22753 interfaceC22753 = this.f29227;
        if (interfaceC22753 != null) {
            try {
                interfaceC22753.close();
            } finally {
                this.f29227 = null;
            }
        }
    }
}
