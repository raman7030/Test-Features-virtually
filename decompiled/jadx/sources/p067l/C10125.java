package p067l;

import java.util.BitSet;
import java.util.Locale;

/* JADX INFO: renamed from: l.۠ۨ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: A8DI */
/* JADX INFO: loaded from: classes3.dex */
public final class C10125 {

    /* JADX INFO: renamed from: ֫ */
    public final BitSet f28069;

    /* JADX INFO: renamed from: ۧ */
    public final int f28070;

    public C10125(EnumC3419... enumC3419Arr) {
        this.f28069 = new BitSet(8);
        this.f28070 = 1;
        if (enumC3419Arr != null) {
            for (EnumC3419 enumC3419 : enumC3419Arr) {
                this.f28069.set(enumC3419.f6789);
            }
        }
        m23600();
    }

    public C10125(byte b, int i) {
        this.f28069 = BitSet.valueOf(new byte[]{b});
        this.f28070 = i;
        m23600();
    }

    /* JADX INFO: renamed from: ֫ */
    public static C10125 m23599(byte b) {
        byte b2 = (byte) (b & 192);
        return new C10125((byte) (b ^ b2), b2 >>> 6);
    }

    /* JADX INFO: renamed from: ֫ */
    public final byte m23601() {
        return (byte) (this.f28069.toByteArray()[0] | ((this.f28070 & 3) << 6));
    }

    /* JADX INFO: renamed from: ۧ */
    private void m23600() {
        int i = EnumC3419.RESERVED_0.f6789;
        BitSet bitSet = this.f28069;
        if (bitSet.get(i)) {
            throw new RuntimeException("Reserved0 field must be 0");
        }
        if (bitSet.get(EnumC3419.RESERVED_1.f6789)) {
            throw new RuntimeException("Reserved1 field must be 0");
        }
        if (!bitSet.get(EnumC3419.BLOCK_INDEPENDENCE.f6789)) {
            throw new RuntimeException("Dependent block stream is unsupported (BLOCK_INDEPENDENCE must be set)");
        }
        int i2 = this.f28070;
        if (i2 == 1) {
            return;
        }
        Locale locale = Locale.ROOT;
        throw new RuntimeException(C19768.m44906(i2, "Version ", " is unsupported"));
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m23602(EnumC3419 enumC3419) {
        return this.f28069.get(enumC3419.f6789);
    }
}
