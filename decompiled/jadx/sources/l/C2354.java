package l;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.ۖۛ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: A6XJ */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2354 implements Supplier {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f7546;

    public /* synthetic */ C2354(int i) {
        this.f7546 = i;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        switch (this.f7546) {
            case 0:
                return ServiceC19288.f60687;
            default:
                char[] cArr = C14460.f44310;
                try {
                    return MessageDigest.getInstance("SHA-384");
                } catch (NoSuchAlgorithmException e) {
                    throw new RuntimeException(e);
                }
        }
    }
}
