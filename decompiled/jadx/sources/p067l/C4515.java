package p067l;

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
public final class C4515 implements InterfaceC22753 {

    /* JADX INFO: renamed from: ֫ */
    public volatile boolean f10128;

    /* JADX INFO: renamed from: ۧ */
    public InterfaceC22753 f10129;

    /* JADX INFO: renamed from: ܽ */
    public C22757 f10130;

    /* JADX INFO: renamed from: ܿ */
    public final /* synthetic */ C5856 f10131;

    /* JADX INFO: renamed from: ᩳ */
    public final ArrayList f10132 = new ArrayList();

    public C4515(C5856 c5856) {
        this.f10131 = c5856;
    }

    @Override // p067l.InterfaceC22753
    /* JADX INFO: renamed from: ֫ */
    public final void mo8132(InterfaceC2830 interfaceC2830) {
        ArrayList arrayList = this.f10132;
        if (arrayList.contains(interfaceC2830)) {
            return;
        }
        arrayList.add(interfaceC2830);
    }

    @Override // p067l.InterfaceC22753
    /* JADX INFO: renamed from: ֫ */
    public final long mo4020(C5318 c5318) throws IOException {
        InterfaceC22753 c21950;
        if (this.f10129 != null || this.f10128) {
            throw new IOException("Data source is already open");
        }
        C22757 c22757M11518 = C5322.m11518(this.f10131.f14406, c5318.f12514, this.f10131.f14407, new C17254(this));
        this.f10130 = c22757M11518;
        if (this.f10128) {
            c22757M11518.close();
            throw new InterruptedIOException("HTTP media open was canceled");
        }
        String strM50940 = c22757M11518.m50940();
        if (strM50940 != null) {
            c21950 = new C21950(new C11221(this.f10131.f14406, this.f10131.f14407, new C9057(strM50940)));
        } else {
            c21950 = this.f10131.f14407.mo8449();
        }
        this.f10129 = c21950;
        if (this.f10128) {
            this.f10129 = null;
            c21950.close();
            c22757M11518.close();
            throw new InterruptedIOException("HTTP media open was canceled");
        }
        Iterator it = this.f10132.iterator();
        while (it.hasNext()) {
            c21950.mo8132((InterfaceC2830) it.next());
        }
        return c21950.mo4020(c5318);
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m9544(C4515 c4515, C22757 c22757) {
        c4515.f10130 = c22757;
        if (c4515.f10128) {
            c22757.close();
        }
    }

    @Override // p067l.InterfaceC11649
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        InterfaceC22753 interfaceC22753 = this.f10129;
        if (interfaceC22753 == null) {
            throw new IOException("Data source is not open");
        }
        return interfaceC22753.read(bArr, i, i2);
    }

    @Override // p067l.InterfaceC22753
    /* JADX INFO: renamed from: ܿ */
    public final Uri mo4021() {
        InterfaceC22753 interfaceC22753 = this.f10129;
        if (interfaceC22753 == null) {
            return null;
        }
        return interfaceC22753.mo4021();
    }

    @Override // p067l.InterfaceC22753
    /* JADX INFO: renamed from: ֫ */
    public final Map mo8131() {
        InterfaceC22753 interfaceC22753 = this.f10129;
        return interfaceC22753 == null ? Collections.EMPTY_MAP : interfaceC22753.mo8131();
    }

    @Override // p067l.InterfaceC22753
    public final void close() {
        this.f10128 = true;
        InterfaceC22753 interfaceC22753 = this.f10129;
        this.f10129 = null;
        if (interfaceC22753 != null) {
            try {
                interfaceC22753.close();
            } finally {
                C22757 c22757 = this.f10130;
                this.f10130 = null;
                if (c22757 != null) {
                    c22757.close();
                }
            }
        }
    }
}
