package l;

import java.util.BitSet;

/* JADX INFO: renamed from: l.᩶ۡܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: ZBH4 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20069 extends C17535 implements InterfaceC10711 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final C20069 f65002 = new C20069(0);

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C20069 m46252(C21480 c21480) {
        C20069 c20069 = new C20069(1);
        c20069.m40981(0, (Object) c21480);
        return c20069;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C20069 m46250(C21480 c21480, C21480 c21481) {
        C20069 c20069 = new C20069(2);
        c20069.m40981(0, (Object) c21480);
        c20069.m40981(1, (Object) c21481);
        return c20069;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int m46253() {
        int size = size();
        int iM20314 = 0;
        for (int i = 0; i < size; i++) {
            iM20314 += getType(i).m20314();
        }
        return iM20314;
    }

    @Override // l.InterfaceC10711
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC10711 mo26890(C7573 c7573) {
        throw new UnsupportedOperationException("unsupported");
    }

    @Override // l.C17535, l.InterfaceC10711
    public final C7573 getType(int i) {
        C7573 type = ((C21480) m40978(i)).getType();
        type.getClass();
        return type;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m46260(int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((C21480) m40978(i2)).m48652() == i) {
                return i2;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C20069 m46255(C21480 c21480) {
        int size = size();
        C20069 c20069 = new C20069(size + 1);
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            c20069.m40981(i2, m40978(i));
            i = i2;
        }
        c20069.m40981(0, (Object) c21480);
        if (m43735()) {
            c20069.mo20349();
        }
        return c20069;
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final C20069 m46257() {
        int size = size() - 1;
        if (size != 0) {
            C20069 c20069 = new C20069(size);
            int i = 0;
            while (i < size) {
                int i2 = i + 1;
                c20069.m40981(i, m40978(i2));
                i = i2;
            }
            if (m43735()) {
                c20069.mo20349();
            }
            return c20069;
        }
        return f65002;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final C20069 m46258() {
        int size = size() - 1;
        if (size != 0) {
            C20069 c20069 = new C20069(size);
            for (int i = 0; i < size; i++) {
                c20069.m40981(i, m40978(i));
            }
            if (m43735()) {
                c20069.mo20349();
            }
            return c20069;
        }
        return f65002;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C20069 m46254(BitSet bitSet) {
        int size = size() - bitSet.cardinality();
        if (size != 0) {
            C20069 c20069 = new C20069(size);
            int i = 0;
            for (int i2 = 0; i2 < size(); i2++) {
                if (!bitSet.get(i2)) {
                    c20069.m40981(i, m40978(i2));
                    i++;
                }
            }
            if (m43735()) {
                c20069.mo20349();
            }
            return c20069;
        }
        return f65002;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C20069 m46259(int i) {
        int size = size();
        if (size == 0) {
            return this;
        }
        C20069 c20069 = new C20069(size);
        for (int i2 = 0; i2 < size; i2++) {
            c20069.m40981(i2, (Object) ((C21480) m40978(i2)).m48640(i));
        }
        if (m43735()) {
            c20069.mo20349();
        }
        return c20069;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C20069 m46256(boolean z, BitSet bitSet) {
        int size = size();
        if (size == 0) {
            return this;
        }
        C22185 c22185 = new C22185(this, bitSet, z);
        for (int i = 0; i < size; i++) {
            C22185.m49827(c22185, i);
        }
        return C22185.m49826(c22185);
    }
}
