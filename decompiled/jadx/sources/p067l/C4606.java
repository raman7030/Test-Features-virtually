package p067l;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.ۖۛ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: A6XJ */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C4606 implements Supplier {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f10337;

    public /* synthetic */ C4606(int i) {
        this.f10337 = i;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        switch (this.f10337) {
            case 0:
                return ServiceC20700.f63917;
            default:
                char[] cArr = C16111.f47404;
                try {
                    return MessageDigest.getInstance("SHA-384");
                } catch (NoSuchAlgorithmException e) {
                    throw new RuntimeException(e);
                }
        }
    }
}
