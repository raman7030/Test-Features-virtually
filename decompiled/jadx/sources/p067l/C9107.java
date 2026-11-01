package p067l;

import java.io.EOFException;
import org.bouncycastle.i18n.LocalizedMessage;

/* JADX INFO: renamed from: l.ۜ᩻ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: NAGW */
/* JADX INFO: loaded from: classes2.dex */
public final class C9107 {

    /* JADX INFO: renamed from: ֫ */
    public long f24673;

    /* JADX INFO: renamed from: ۧ */
    public final byte[] f24674;

    public C9107() {
        this.f24674 = new byte[4];
    }

    public C9107(int i) {
        this.f24674 = new byte[4];
        this.f24673 = 0L;
    }

    /* JADX INFO: renamed from: ֫ */
    public final long m21043() {
        return this.f24673;
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m21044(C25200 c25200) throws EOFException {
        byte bM55271 = c25200.m55271();
        byte[] bArr = this.f24674;
        bArr[0] = bM55271;
        bArr[1] = c25200.m55271();
        bArr[2] = c25200.m55271();
        bArr[3] = c25200.m55271();
        c25200.m55273(4L);
        this.f24673 = c25200.m55276();
        c25200.m55276();
        return new String(bArr, LocalizedMessage.DEFAULT_ENCODING);
    }
}
