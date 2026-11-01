package p067l;

import java.util.BitSet;

/* JADX INFO: renamed from: l.᩶ۡܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: ZBH4 */
/* JADX INFO: loaded from: classes5.dex */
public final class C21442 extends C19034 implements InterfaceC12548 {

    /* JADX INFO: renamed from: ᩶ */
    public static final C21442 f67643 = new C21442(0);

    /* JADX INFO: renamed from: ۧ */
    public static C21442 m48568(C22783 c22783) {
        C21442 c21442 = new C21442(1);
        c21442.m43241(0, (Object) c22783);
        return c21442;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C21442 m48566(C22783 c22783, C22783 c22784) {
        C21442 c21442 = new C21442(2);
        c21442.m43241(0, (Object) c22783);
        c21442.m43241(1, (Object) c22784);
        return c21442;
    }

    /* JADX INFO: renamed from: ֨ */
    public final int m48569() {
        int size = size();
        int iM22291 = 0;
        for (int i = 0; i < size; i++) {
            iM22291 += getType(i).m22291();
        }
        return iM22291;
    }

    @Override // p067l.InterfaceC12548
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC12548 mo28930(C9566 c9566) {
        throw new UnsupportedOperationException("unsupported");
    }

    @Override // p067l.C19034, p067l.InterfaceC12548
    public final C9566 getType(int i) {
        C9566 type = ((C22783) m43238(i)).getType();
        type.getClass();
        return type;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final int m48576(int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((C22783) m43238(i2)).m50989() == i) {
                return i2;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C21442 m48571(C22783 c22783) {
        int size = size();
        C21442 c21442 = new C21442(size + 1);
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            c21442.m43241(i2, m43238(i));
            i = i2;
        }
        c21442.m43241(0, (Object) c22783);
        if (m46002()) {
            c21442.mo22326();
        }
        return c21442;
    }

    /* JADX INFO: renamed from: ۠ */
    public final C21442 m48573() {
        int size = size() - 1;
        if (size != 0) {
            C21442 c21442 = new C21442(size);
            int i = 0;
            while (i < size) {
                int i2 = i + 1;
                c21442.m43241(i, m43238(i2));
                i = i2;
            }
            if (m46002()) {
                c21442.mo22326();
            }
            return c21442;
        }
        return f67643;
    }

    /* JADX INFO: renamed from: ܶ */
    public final C21442 m48574() {
        int size = size() - 1;
        if (size != 0) {
            C21442 c21442 = new C21442(size);
            for (int i = 0; i < size; i++) {
                c21442.m43241(i, m43238(i));
            }
            if (m46002()) {
                c21442.mo22326();
            }
            return c21442;
        }
        return f67643;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C21442 m48570(BitSet bitSet) {
        int size = size() - bitSet.cardinality();
        if (size != 0) {
            C21442 c21442 = new C21442(size);
            int i = 0;
            for (int i2 = 0; i2 < size(); i2++) {
                if (!bitSet.get(i2)) {
                    c21442.m43241(i, m43238(i2));
                    i++;
                }
            }
            if (m46002()) {
                c21442.mo22326();
            }
            return c21442;
        }
        return f67643;
    }

    /* JADX INFO: renamed from: ܿ */
    public final C21442 m48575(int i) {
        int size = size();
        if (size == 0) {
            return this;
        }
        C21442 c21442 = new C21442(size);
        for (int i2 = 0; i2 < size; i2++) {
            c21442.m43241(i2, (Object) ((C22783) m43238(i2)).m50977(i));
        }
        if (m46002()) {
            c21442.mo22326();
        }
        return c21442;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C21442 m48572(boolean z, BitSet bitSet) {
        int size = size();
        if (size == 0) {
            return this;
        }
        C23453 c23453 = new C23453(this, bitSet, z);
        for (int i = 0; i < size; i++) {
            C23453.m52154(c23453, i);
        }
        return C23453.m52153(c23453);
    }
}
