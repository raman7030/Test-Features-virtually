package l;

import java.util.BitSet;

/* JADX INFO: renamed from: l.᩸ۘܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: EBE1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C21336 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object f68759;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Object f68760;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Object f68761;

    public C21336(C13739 c13739, C23650 c23650, InterfaceC9436 interfaceC9436) {
        this.f68761 = c13739;
        this.f68759 = c23650;
        this.f68760 = interfaceC9436;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C13739 m48371() {
        return (C13739) this.f68761;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public InterfaceC8730 m48370() {
        return (C23650) this.f68759;
    }

    public C21336(C13012 c13012) {
        this.f68761 = c13012;
        C17246 c17246M31591 = c13012.m31591();
        this.f68759 = c17246M31591;
        this.f68760 = c17246M31591.m40534();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public InterfaceC9436 m48369() {
        return (InterfaceC9436) this.f68760;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C13012 m48372() {
        C13012 c13012 = (C13012) this.f68761;
        C17246 c17246 = (C17246) this.f68760;
        C17246 c17247 = (C17246) this.f68759;
        int size = c17247.size();
        BitSet bitSet = new BitSet(c17247.m38023());
        int i = 0;
        while (true) {
            int i2 = 1;
            if (i >= size) {
                break;
            }
            C16540 c16540M41002get = c17247.m41002get(i);
            if (!bitSet.get(c16540M41002get.mo2269())) {
                C21064 c21064M31592 = c13012.m31592(c16540M41002get.mo2269());
                int size2 = c21064M31592.size();
                int i3 = 0;
                while (i3 < size2) {
                    int i4 = c21064M31592.get(i3);
                    C16540 c16540M40535 = c17247.m40535(i4);
                    if (!bitSet.get(i4) && c16540M40535.m38911().size() <= i2 && c16540M40535.m38914().m37484().m9562() != 55) {
                        C21064 c21064 = new C21064();
                        int i5 = i3 + 1;
                        while (i5 < size2) {
                            int i6 = c21064M31592.get(i5);
                            C16540 c16540M40536 = c17247.m40535(i6);
                            if (c16540M40536.m38911().size() == i2 && c16540M40535.m38916().m7867(c16540M40536.m38916())) {
                                c21064.add(i6);
                                bitSet.set(i6);
                            }
                            i5++;
                            i2 = 1;
                        }
                        int size3 = c21064.size();
                        int i7 = 0;
                        while (i7 < size3) {
                            int i8 = c21064.get(i7);
                            C21064 c21064M31593 = c13012.m31592(c17247.m40535(i8).mo2269());
                            int size4 = c21064M31593.size();
                            int i9 = size3;
                            int i10 = 0;
                            while (i10 < size4) {
                                C17246 c17248 = c17247;
                                C16540 c16540M40537 = c17246.m40535(c21064M31593.get(i10));
                                C21064 c21065 = c21064M31592;
                                C21064 c21064M47913 = c16540M40537.m38911().m47913();
                                int iM47912 = c21064M47913.m47912(i8);
                                c21064M47913.set(iM47912 >= 0 ? iM47912 : -1, i4);
                                int iM38913 = c16540M40537.m38913();
                                if (iM38913 == i8) {
                                    iM38913 = i4;
                                }
                                c21064M47913.mo20349();
                                c17246.m40531(c17246.m38027(c16540M40537.mo2269()), new C16540(c16540M40537.mo2269(), c16540M40537.m38916(), c21064M47913, iM38913));
                                i10++;
                                c17247 = c17248;
                                i4 = i4;
                                c21064M31592 = c21065;
                                size2 = size2;
                                i8 = i8;
                                c21064 = c21064;
                            }
                            i7++;
                            size3 = i9;
                        }
                    }
                    i3++;
                    i2 = 1;
                    c17247 = c17247;
                    c21064M31592 = c21064M31592;
                    size2 = size2;
                }
            }
            i++;
            c17247 = c17247;
        }
        while (true) {
            size--;
            if (size >= 0) {
                if (bitSet.get(c17246.m41002get(size).mo2269())) {
                    c17246.m40531(size, (C16540) null);
                }
            } else {
                c17246.mo38026();
                c17246.mo20349();
                return new C13012(c17246, c13012.m31593());
            }
        }
    }
}
