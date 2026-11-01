package p067l;

/* JADX INFO: renamed from: l.᩻ۨۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y9CS */
/* JADX INFO: loaded from: classes.dex */
public final class C24864 implements InterfaceC7155 {

    /* JADX INFO: renamed from: ֫ */
    public long f79415;

    /* JADX INFO: renamed from: ۖ */
    public byte[] f79416;

    /* JADX INFO: renamed from: ۘ */
    public long f79417;

    /* JADX INFO: renamed from: ۜ */
    public EnumC24036 f79418;

    /* JADX INFO: renamed from: ۡ */
    public int f79419;

    /* JADX INFO: renamed from: ۢ */
    public long f79420;

    /* JADX INFO: renamed from: ۧ */
    public int f79421 = 1;

    /* JADX INFO: renamed from: ܳ */
    public long f79422;

    /* JADX INFO: renamed from: ܺ */
    public long f79423;

    /* JADX INFO: renamed from: ܽ */
    public int f79424;

    /* JADX INFO: renamed from: ܿ */
    public EnumC23366 f79425;

    /* JADX INFO: renamed from: ᩳ */
    public int f79426;

    /* JADX INFO: renamed from: ᩴ */
    public long f79427;

    /* JADX INFO: renamed from: ᩷ */
    public int f79428;

    /* JADX INFO: renamed from: ᩻ */
    public int f79429;

    /* JADX INFO: renamed from: ᩵ */
    public static final byte[] f79414 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    /* JADX INFO: renamed from: ֡ */
    public static final byte[] f79413 = {-2, 83, 77, 66};

    /* JADX INFO: renamed from: ۧ */
    public final void m54609(C2460 c2460) {
        this.f79429 = c2460.m28116();
        c2460.m28102(4, f79413);
        c2460.m28111(64);
        int i = C16146.f47501[this.f79425.ordinal()];
        if (i == 1 || i == 2) {
            c2460.m3478(2);
        } else {
            c2460.m28111(this.f79421);
        }
        if (this.f79425.m52019()) {
            c2460.m3476();
            c2460.m3476();
        } else {
            c2460.m3477();
        }
        c2460.m28111(this.f79418.getValue());
        c2460.m28111(this.f79424 + this.f79421);
        c2460.m28113(this.f79422);
        c2460.m28113(this.f79419);
        c2460.m28103(this.f79420);
        if (C16873.m38441(this.f79422, EnumC4077.SMB2_FLAGS_ASYNC_COMMAND)) {
            c2460.m28103(this.f79415);
        } else {
            c2460.m3477();
            c2460.m28113(this.f79427);
        }
        c2460.m28103(this.f79423);
        c2460.m28102(16, f79414);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m54608(long j) {
        this.f79420 = j;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m54602(EnumC24036 enumC24036) {
        this.f79418 = enumC24036;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final EnumC24036 m54620() {
        return this.f79418;
    }

    /* JADX INFO: renamed from: ܺ */
    public final long m54612() {
        return this.f79427;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m54618(long j) {
        this.f79427 = j;
    }

    /* JADX INFO: renamed from: ۢ */
    public final long m54606() {
        return this.f79423;
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m54615(long j) {
        this.f79423 = j;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m54601(EnumC23366 enumC23366) {
        this.f79425 = enumC23366;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m54603(EnumC4077 enumC4077) {
        return C16873.m38441(this.f79422, enumC4077);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m54610(EnumC4077 enumC4077) {
        this.f79422 |= enumC4077.getValue();
    }

    /* JADX INFO: renamed from: ۜ */
    public final long m54604() {
        return this.f79420;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m54607(int i) {
        this.f79424 = i;
    }

    /* JADX INFO: renamed from: ܿ */
    public final int m54616() {
        return this.f79426;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m54600(long j) {
        this.f79415 = j;
    }

    /* JADX INFO: renamed from: ܽ */
    public final long m54613() {
        return this.f79415;
    }

    @Override // p067l.InterfaceC7155
    /* JADX INFO: renamed from: ֫ */
    public final void mo16457(C2460 c2460) throws C14862 {
        this.f79429 = c2460.m28108();
        m54596(c2460, f79413);
        c2460.m28121(2);
        c2460.m28125();
        this.f79417 = c2460.m28107();
        this.f79418 = EnumC24036.m53278(c2460.m28125());
        this.f79426 = c2460.m28125();
        this.f79422 = c2460.m28107();
        this.f79419 = c2460.m28124();
        this.f79420 = c2460.m28115();
        if (C16873.m38441(this.f79422, EnumC4077.SMB2_FLAGS_ASYNC_COMMAND)) {
            this.f79415 = c2460.m28115();
        } else {
            c2460.m28121(4);
            this.f79427 = c2460.m28107();
        }
        this.f79423 = c2460.m28115();
        byte[] bArr = this.f79416;
        if (bArr == null || bArr.length != 16) {
            this.f79416 = new byte[16];
        }
        byte[] bArr2 = this.f79416;
        c2460.m28112(bArr2.length, bArr2);
        int i = this.f79419;
        if (i != 0) {
            this.f79428 = this.f79429 + i;
        } else {
            this.f79428 = c2460.m28116();
        }
    }

    /* JADX INFO: renamed from: ۡ */
    public final long m54605() {
        return this.f79417;
    }

    /* JADX INFO: renamed from: ܳ */
    public final long m54611() {
        return this.f79422;
    }

    /* JADX INFO: renamed from: ᩷ */
    public final int m54619() {
        return this.f79419;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m54599(int i) {
        this.f79421 = i;
    }

    public final String toString() {
        return String.format("dialect=%s, creditCharge=%s, creditRequest=%s, creditResponse=%s, message=%s, messageId=%s, asyncId=%s, sessionId=%s, treeId=%s, status=0x%08x, flags=%s, nextCommandOffset=%s", this.f79425, Integer.valueOf(this.f79421), Integer.valueOf(this.f79424), Integer.valueOf(this.f79426), this.f79418, Long.valueOf(this.f79420), Long.valueOf(this.f79415), Long.valueOf(this.f79423), Long.valueOf(this.f79427), Long.valueOf(this.f79417), Long.valueOf(this.f79422), Integer.valueOf(this.f79419));
    }

    /* JADX INFO: renamed from: ᩳ */
    public final int m54617() {
        return this.f79421;
    }

    @Override // p067l.InterfaceC7155
    /* JADX INFO: renamed from: ֫ */
    public final int mo16456() {
        return this.f79429;
    }

    @Override // p067l.InterfaceC7155
    /* JADX INFO: renamed from: ۧ */
    public final int mo16458() {
        return this.f79428;
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m54614(int i) {
        this.f79428 = i;
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m54597(byte[] bArr) {
        return m54598(bArr, f79413);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m54596(C12181 c12181, byte[] bArr) {
        for (byte b : bArr) {
            if (c12181.m28120() != b) {
                throw new IllegalArgumentException("Could not find SMB2 Packet header");
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m54598(byte[] bArr, byte[] bArr2) {
        if (bArr != null && bArr.length >= bArr2.length) {
            for (int i = 0; i < bArr2.length; i++) {
                if (bArr[i] == bArr2[i]) {
                }
            }
            return true;
        }
        return false;
    }
}
