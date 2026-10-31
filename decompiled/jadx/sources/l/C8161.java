package l;

import java.util.BitSet;
import java.util.Locale;

/* JADX INFO: renamed from: l.۠ۨ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: A8DI */
/* JADX INFO: loaded from: classes3.dex */
public final class C8161 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final BitSet f25158;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f25159;

    public C8161(EnumC1105... enumC1105Arr) {
        this.f25158 = new BitSet(8);
        this.f25159 = 1;
        if (enumC1105Arr != null) {
            for (EnumC1105 enumC1105 : enumC1105Arr) {
                this.f25158.set(enumC1105.f4017);
            }
        }
        m21631();
    }

    public C8161(byte b, int i) {
        this.f25158 = BitSet.valueOf(new byte[]{b});
        this.f25159 = i;
        m21631();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C8161 m21630(byte b) {
        byte b2 = (byte) (b & 192);
        return new C8161((byte) (b ^ b2), b2 >>> 6);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final byte m21632() {
        return (byte) (this.f25158.toByteArray()[0] | ((this.f25159 & 3) << 6));
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m21631() {
        int i = EnumC1105.RESERVED_0.f4017;
        BitSet bitSet = this.f25158;
        if (bitSet.get(i)) {
            throw new RuntimeException("Reserved0 field must be 0");
        }
        if (bitSet.get(EnumC1105.RESERVED_1.f4017)) {
            throw new RuntimeException("Reserved1 field must be 0");
        }
        if (!bitSet.get(EnumC1105.BLOCK_INDEPENDENCE.f4017)) {
            throw new RuntimeException("Dependent block stream is unsupported (BLOCK_INDEPENDENCE must be set)");
        }
        int i2 = this.f25159;
        if (i2 == 1) {
            return;
        }
        Locale locale = Locale.ROOT;
        throw new RuntimeException(C18307.m42645(i2, "Version ", " is unsupported"));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m21633(EnumC1105 enumC1105) {
        return this.f25158.get(enumC1105.f4017);
    }
}
