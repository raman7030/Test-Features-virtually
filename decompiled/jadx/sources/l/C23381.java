package l;

import java.util.HashMap;
import org.bouncycastle.crypto.Mac;
import org.bouncycastle.crypto.params.KeyParameter;

/* JADX INFO: renamed from: l.᩻֫ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: L9KD */
/* JADX INFO: loaded from: classes.dex */
public final class C23381 implements InterfaceC5202 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static HashMap f75121;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Mac f75122;

    static {
        HashMap map = new HashMap();
        f75121 = map;
        map.put("HMACSHA256", new C17737());
        map.put("HMACMD5", new C17031());
        map.put("AESCMAC", new C14208());
    }

    public C23381(String str) {
        InterfaceC20203 interfaceC20203 = (InterfaceC20203) f75121.get(str.toUpperCase());
        if (interfaceC20203 != null) {
            this.f75122 = (Mac) interfaceC20203.create();
            return;
        }
        throw new IllegalArgumentException("No Mac defined for ".concat(str));
    }

    @Override // l.InterfaceC5202
    public final void init(byte[] bArr) {
        this.f75122.init(new KeyParameter(bArr));
    }

    @Override // l.InterfaceC5202
    public final void update(byte[] bArr) {
        this.f75122.update(bArr, 0, bArr.length);
    }

    @Override // l.InterfaceC5202
    public final void update(byte[] bArr, int i, int i2) {
        this.f75122.update(bArr, i, i2);
    }

    @Override // l.InterfaceC5202
    /* JADX INFO: renamed from: ֫ */
    public final byte[] mo14975() {
        Mac mac = this.f75122;
        byte[] bArr = new byte[mac.getMacSize()];
        mac.doFinal(bArr, 0);
        return bArr;
    }
}
