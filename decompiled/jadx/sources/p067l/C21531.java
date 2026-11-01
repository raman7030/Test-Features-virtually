package p067l;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: renamed from: l.᩶۫ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 39IB */
/* JADX INFO: loaded from: classes5.dex */
public final class C21531 extends AbstractC6127 {
    @Override // p067l.AbstractC6127
    /* JADX INFO: renamed from: ֫ */
    public final C5437 mo4315(AbstractC13503 abstractC13503, byte[] bArr) {
        if (abstractC13503.m30661()) {
            try {
                C10821 c10821 = new C10821(this.f15388, bArr);
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    byte b = 0;
                    while (c10821.available() > 0) {
                        AbstractC13503 abstractC13503M24942 = c10821.m24942();
                        Object[] objArr = {abstractC13503M24942};
                        if (!(abstractC13503M24942.m30660() == abstractC13503.m30660())) {
                            throw new IllegalStateException(String.format("Expected an ASN.1 BIT STRING as Constructed object, got: %s", objArr));
                        }
                        byte[] bArrM24940 = c10821.m24940(c10821.m24941());
                        byteArrayOutputStream.write(bArrM24940, 1, bArrM24940.length - 1);
                        if (c10821.available() <= 0) {
                            b = bArrM24940[0];
                        }
                    }
                    C5437 c5437 = new C5437(abstractC13503, byteArrayOutputStream.toByteArray(), b);
                    c10821.close();
                    return c5437;
                } catch (Throwable th) {
                    try {
                        c10821.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (IOException e) {
                throw new C4786(e, "Unable to parse Constructed ASN.1 BIT STRING", new Object[0]);
            }
        }
        return new C5437(abstractC13503, Arrays.copyOfRange(bArr, 1, bArr.length), bArr[0]);
    }
}
