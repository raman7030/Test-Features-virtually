package l;

/* JADX INFO: renamed from: l.᩻ۨۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y9CS */
/* JADX INFO: loaded from: classes.dex */
public final class C23670 implements InterfaceC5037 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public long f76665;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public byte[] f76666;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public long f76667;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public EnumC22799 f76668;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f76669;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public long f76670;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f76671 = 1;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public long f76672;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public long f76673;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f76674;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public EnumC22094 f76675;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f76676;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public long f76677;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f76678;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f76679;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public static final byte[] f76664 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final byte[] f76663 = {-2, 83, 77, 66};

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m52206(C0097 c0097) {
        this.f76679 = c0097.m26091();
        c0097.m26077(4, f76663);
        c0097.m26086(64);
        int i = C14497.f44400[this.f76675.ordinal()];
        if (i == 1 || i == 2) {
            c0097.m1082(2);
        } else {
            c0097.m26086(this.f76671);
        }
        if (this.f76675.m49681()) {
            c0097.m1080();
            c0097.m1080();
        } else {
            c0097.m1081();
        }
        c0097.m26086(this.f76668.getValue());
        c0097.m26086(this.f76674 + this.f76671);
        c0097.m26088(this.f76672);
        c0097.m26088(this.f76669);
        c0097.m26078(this.f76670);
        if (C15262.m36280(this.f76672, EnumC1798.SMB2_FLAGS_ASYNC_COMMAND)) {
            c0097.m26078(this.f76665);
        } else {
            c0097.m1081();
            c0097.m26088(this.f76677);
        }
        c0097.m26078(this.f76673);
        c0097.m26077(16, f76664);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m52205(long j) {
        this.f76670 = j;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m52199(EnumC22799 enumC22799) {
        this.f76668 = enumC22799;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final EnumC22799 m52217() {
        return this.f76668;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final long m52209() {
        return this.f76677;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m52215(long j) {
        this.f76677 = j;
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final long m52203() {
        return this.f76673;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m52212(long j) {
        this.f76673 = j;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m52198(EnumC22094 enumC22094) {
        this.f76675 = enumC22094;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m52200(EnumC1798 enumC1798) {
        return C15262.m36280(this.f76672, enumC1798);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m52207(EnumC1798 enumC1798) {
        this.f76672 |= enumC1798.getValue();
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final long m52201() {
        return this.f76670;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m52204(int i) {
        this.f76674 = i;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int m52213() {
        return this.f76676;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m52197(long j) {
        this.f76665 = j;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final long m52210() {
        return this.f76665;
    }

    @Override // l.InterfaceC5037
    /* JADX INFO: renamed from: ֫ */
    public final void mo14553(C0097 c0097) throws C13146 {
        this.f76679 = c0097.m26083();
        m52193(c0097, f76663);
        c0097.m26096(2);
        c0097.m26100();
        this.f76667 = c0097.m26082();
        this.f76668 = EnumC22799.m50888(c0097.m26100());
        this.f76676 = c0097.m26100();
        this.f76672 = c0097.m26082();
        this.f76669 = c0097.m26099();
        this.f76670 = c0097.m26090();
        if (C15262.m36280(this.f76672, EnumC1798.SMB2_FLAGS_ASYNC_COMMAND)) {
            this.f76665 = c0097.m26090();
        } else {
            c0097.m26096(4);
            this.f76677 = c0097.m26082();
        }
        this.f76673 = c0097.m26090();
        byte[] bArr = this.f76666;
        if (bArr == null || bArr.length != 16) {
            this.f76666 = new byte[16];
        }
        byte[] bArr2 = this.f76666;
        c0097.m26087(bArr2.length, bArr2);
        int i = this.f76669;
        if (i != 0) {
            this.f76678 = this.f76679 + i;
        } else {
            this.f76678 = c0097.m26091();
        }
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final long m52202() {
        return this.f76667;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final long m52208() {
        return this.f76672;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m52216() {
        return this.f76669;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m52196(int i) {
        this.f76671 = i;
    }

    public final String toString() {
        return String.format("dialect=%s, creditCharge=%s, creditRequest=%s, creditResponse=%s, message=%s, messageId=%s, asyncId=%s, sessionId=%s, treeId=%s, status=0x%08x, flags=%s, nextCommandOffset=%s", this.f76675, Integer.valueOf(this.f76671), Integer.valueOf(this.f76674), Integer.valueOf(this.f76676), this.f76668, Long.valueOf(this.f76670), Long.valueOf(this.f76665), Long.valueOf(this.f76673), Long.valueOf(this.f76677), Long.valueOf(this.f76667), Long.valueOf(this.f76672), Integer.valueOf(this.f76669));
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m52214() {
        return this.f76671;
    }

    @Override // l.InterfaceC5037
    /* JADX INFO: renamed from: ֫ */
    public final int mo14552() {
        return this.f76679;
    }

    @Override // l.InterfaceC5037
    /* JADX INFO: renamed from: ۧ */
    public final int mo14554() {
        return this.f76678;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m52211(int i) {
        this.f76678 = i;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m52194(byte[] bArr) {
        return m52195(bArr, f76663);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m52193(C10325 c10325, byte[] bArr) {
        for (byte b : bArr) {
            if (c10325.m26095() != b) {
                throw new IllegalArgumentException("Could not find SMB2 Packet header");
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m52195(byte[] bArr, byte[] bArr2) {
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
