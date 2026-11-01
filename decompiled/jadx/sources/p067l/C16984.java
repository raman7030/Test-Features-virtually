package p067l;

import bin.p000mt.plus.R;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: l.ܶܿᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 45AX */
/* JADX INFO: loaded from: classes4.dex */
public final class C16984 extends AbstractC14973 {
    public /* synthetic */ C16984(int i) {
        this();
    }

    /* JADX INFO: renamed from: ۚ */
    public static C16984 m38573() {
        return C10280.f28450;
    }

    public C16984() {
    }

    @Override // p067l.AbstractC14973
    /* JADX INFO: renamed from: ۘ */
    public final String mo12362() {
        return C7050.m16224(R.string.MT_Protector);
    }

    @Override // p067l.AbstractC14973
    /* JADX INFO: renamed from: ۜ */
    public final byte[] mo12363() throws IOException {
        InputStream resourceAsStream = C16984.class.getResourceAsStream("/assets/".concat("testkey.x509.pem"));
        if (resourceAsStream == null) {
            resourceAsStream = C7050.m16222().open("testkey.x509.pem");
        }
        return C2700.m4194(resourceAsStream, 0);
    }

    @Override // p067l.AbstractC14973
    /* JADX INFO: renamed from: ᩷ */
    public final byte[] mo12364() throws IOException {
        InputStream resourceAsStream = C16984.class.getResourceAsStream("/assets/".concat("testkey.pk8"));
        if (resourceAsStream == null) {
            resourceAsStream = C7050.m16222().open("testkey.pk8");
        }
        return C2700.m4194(resourceAsStream, 0);
    }
}
