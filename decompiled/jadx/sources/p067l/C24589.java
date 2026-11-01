package p067l;

import java.util.HashMap;
import org.bouncycastle.crypto.Mac;
import org.bouncycastle.crypto.params.KeyParameter;

/* JADX INFO: renamed from: l.᩻֫ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: L9KD */
/* JADX INFO: loaded from: classes.dex */
public final class C24589 implements InterfaceC7312 {

    /* JADX INFO: renamed from: ۧ */
    public static HashMap f77867;

    /* JADX INFO: renamed from: ֫ */
    public final Mac f77868;

    static {
        HashMap map = new HashMap();
        f77867 = map;
        map.put("HMACSHA256", new C19225());
        map.put("HMACMD5", new C18554());
        map.put("AESCMAC", new C15871());
    }

    public C24589(String str) {
        InterfaceC21569 interfaceC21569 = (InterfaceC21569) f77867.get(str.toUpperCase());
        if (interfaceC21569 != null) {
            this.f77868 = (Mac) interfaceC21569.create();
            return;
        }
        throw new IllegalArgumentException("No Mac defined for ".concat(str));
    }

    @Override // p067l.InterfaceC7312
    public final void init(byte[] bArr) {
        this.f77868.init(new KeyParameter(bArr));
    }

    @Override // p067l.InterfaceC7312
    public final void update(byte[] bArr) {
        this.f77868.update(bArr, 0, bArr.length);
    }

    @Override // p067l.InterfaceC7312
    public final void update(byte[] bArr, int i, int i2) {
        this.f77868.update(bArr, i, i2);
    }

    @Override // p067l.InterfaceC7312
    /* JADX INFO: renamed from: ֫ */
    public final byte[] mo16885() {
        Mac mac = this.f77868;
        byte[] bArr = new byte[mac.getMacSize()];
        mac.doFinal(bArr, 0);
        return bArr;
    }
}
