package l;

import java.util.BitSet;

/* JADX INFO: renamed from: l.ۙܿܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 7BB0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4793 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f15191;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C13259 f15192;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C10191 f15193;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C20069 f15194;

    /* JADX INFO: renamed from: ֫ */
    public abstract String mo2080();

    /* JADX INFO: renamed from: ֫ */
    public abstract AbstractC4793 mo3993(C13259 c13259);

    /* JADX INFO: renamed from: ֫ */
    public abstract AbstractC4793 mo2081(C20069 c20069);

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo2082(C18241 c18241);

    /* JADX INFO: renamed from: ۧ */
    public abstract int mo2084();

    /* JADX INFO: renamed from: ۧ */
    public abstract AbstractC4793 mo3994(int i);

    /* JADX INFO: renamed from: ܺ */
    public abstract String mo2085();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C18821 m13979(C10191 c10191, C21480 c21480, C21480 c21481) {
        C13259 c13259;
        boolean z = c21480.m48645() == 1;
        boolean zM20311 = c21480.getType().m20311();
        int iM48652 = c21480.m48652();
        if ((c21481.m48652() | iM48652) < 16) {
            if (zM20311) {
                c13259 = C12554.f37848;
            } else {
                c13259 = z ? C12554.f37773 : C12554.f37814;
            }
        } else if (iM48652 < 256) {
            if (zM20311) {
                c13259 = C12554.f37739;
            } else {
                c13259 = z ? C12554.f37768 : C12554.f37789;
            }
        } else if (zM20311) {
            c13259 = C12554.f37783;
        } else {
            c13259 = z ? C12554.f37758 : C12554.f37809;
        }
        return new C18821(c13259, c10191, C20069.m46250(c21480, c21481));
    }

    public AbstractC4793(C13259 c13259, C10191 c10191, C20069 c20069) {
        if (c13259 == null) {
            throw new NullPointerException("opcode == null");
        }
        if (c10191 == null) {
            throw new NullPointerException("position == null");
        }
        if (c20069 == null) {
            throw new NullPointerException("registers == null");
        }
        this.f15191 = -1;
        this.f15192 = c13259;
        this.f15193 = c10191;
        this.f15194 = c20069;
    }

    public final String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder(100);
        sb.append(m13984());
        sb.append(' ');
        sb.append(this.f15193);
        sb.append(": ");
        sb.append(this.f15192.m32170());
        C20069 c20069 = this.f15194;
        if (c20069.size() != 0) {
            sb.append(c20069.m40980(" ", (String) null));
            z = true;
        } else {
            z = false;
        }
        String strMo2080 = mo2080();
        if (strMo2080 != null) {
            if (z) {
                sb.append(',');
            }
            sb.append(' ');
            sb.append(strMo2080);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final boolean m13985() {
        return this.f15191 >= 0;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int m13990() {
        int i = this.f15191;
        if (i >= 0) {
            return i;
        }
        throw new RuntimeException("address not yet known");
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C13259 m13994() {
        return this.f15192;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C10191 m13983() {
        return this.f15193;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public AbstractC4793 mo13980(C16354 c16354) {
        return mo2081(c16354.m9122(this.f15194));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C20069 m13993() {
        return this.f15194;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C18821 m13986(BitSet bitSet) {
        if (!this.f15192.m32173() || bitSet.get(0)) {
            return null;
        }
        C21480 c21480M41004get = this.f15194.m41004get(0);
        return m13979(this.f15193, c21480M41004get, c21480M41004get.m48646(0));
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final AbstractC4793 m13987() {
        return mo2081(this.f15194.m46256(this.f15192.m32173(), (BitSet) null));
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final AbstractC4793 m13989(BitSet bitSet) {
        return mo2081(this.f15194.m46256(this.f15192.m32173(), bitSet));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v2, types: [int] */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v0, types: [l.ܿᩴܺ, l.᩶ۡܺ] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.util.BitSet] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m13991(BitSet bitSet) {
        ?? M32173 = this.f15192.m32173();
        ?? r1 = this.f15194;
        int size = r1.size();
        int iM48645 = 0;
        int iM48646 = (M32173 == 0 || bitSet.get(0)) ? 0 : r1.m41004get(0).m48645();
        while (M32173 < size) {
            if (!bitSet.get(M32173)) {
                iM48645 = r1.m41004get(M32173).m48645() + iM48645;
            }
            M32173++;
        }
        return Math.max(iM48645, iM48646);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C6204 m13981(BitSet bitSet) {
        boolean z = bitSet.get(0);
        C13259 c13259 = this.f15192;
        if (c13259.m32173()) {
            bitSet.set(0);
        }
        C20069 c20069M46254 = this.f15194.m46254(bitSet);
        if (c13259.m32173()) {
            bitSet.set(0, z);
        }
        if (c20069M46254.size() == 0) {
            return null;
        }
        return new C6204(this.f15193, c20069M46254);
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final String m13984() {
        int i = this.f15191;
        return i != -1 ? String.format("%04x", Integer.valueOf(i)) : C14712.m35008(System.identityHashCode(this));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m13982(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("address < 0");
        }
        this.f15191 = i;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public String mo13992() {
        throw new UnsupportedOperationException("Not supported.");
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public String mo13988() {
        throw new UnsupportedOperationException("Not supported.");
    }
}
