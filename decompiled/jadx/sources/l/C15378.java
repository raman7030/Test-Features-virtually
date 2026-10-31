package l;

import bin.mt.plus.R;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: l.ܶܿᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 45AX */
/* JADX INFO: loaded from: classes4.dex */
public final class C15378 extends AbstractC13262 {
    public /* synthetic */ C15378(int i) {
        this();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static C15378 m36415() {
        return C8324.f25539;
    }

    public C15378() {
    }

    @Override // l.AbstractC13262
    /* JADX INFO: renamed from: ۘ */
    public final String mo10324() {
        return C4925.m14327(R.string.MT_Protector);
    }

    @Override // l.AbstractC13262
    /* JADX INFO: renamed from: ۜ */
    public final byte[] mo10325() throws IOException {
        InputStream resourceAsStream = C15378.class.getResourceAsStream("/assets/".concat("testkey.x509.pem"));
        if (resourceAsStream == null) {
            resourceAsStream = C4925.m14325().open("testkey.x509.pem");
        }
        return C0349.m1795(resourceAsStream, 0);
    }

    @Override // l.AbstractC13262
    /* JADX INFO: renamed from: ᩷ */
    public final byte[] mo10326() throws IOException {
        InputStream resourceAsStream = C15378.class.getResourceAsStream("/assets/".concat("testkey.pk8"));
        if (resourceAsStream == null) {
            resourceAsStream = C4925.m14325().open("testkey.pk8");
        }
        return C0349.m1795(resourceAsStream, 0);
    }
}
