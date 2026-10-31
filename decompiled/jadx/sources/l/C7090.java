package l;

import java.io.EOFException;
import org.bouncycastle.i18n.LocalizedMessage;

/* JADX INFO: renamed from: l.ۜ᩻ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: NAGW */
/* JADX INFO: loaded from: classes2.dex */
public final class C7090 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public long f21792;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final byte[] f21793;

    public C7090() {
        this.f21793 = new byte[4];
    }

    public C7090(int i) {
        this.f21793 = new byte[4];
        this.f21792 = 0L;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long m19085() {
        return this.f21792;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m19086(C24023 c24023) throws EOFException {
        byte bM52865 = c24023.m52865();
        byte[] bArr = this.f21793;
        bArr[0] = bM52865;
        bArr[1] = c24023.m52865();
        bArr[2] = c24023.m52865();
        bArr[3] = c24023.m52865();
        c24023.m52867(4L);
        this.f21792 = c24023.m52870();
        c24023.m52870();
        return new String(bArr, LocalizedMessage.DEFAULT_ENCODING);
    }
}
