package p067l;

import java.util.BitSet;

/* JADX INFO: renamed from: l.ۙܿܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 7BB0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6924 {

    /* JADX INFO: renamed from: ֫ */
    public int f18023;

    /* JADX INFO: renamed from: ۧ */
    public final C14970 f18024;

    /* JADX INFO: renamed from: ܽ */
    public final C12054 f18025;

    /* JADX INFO: renamed from: ᩳ */
    public final C21442 f18026;

    /* JADX INFO: renamed from: ֫ */
    public abstract String mo4461();

    /* JADX INFO: renamed from: ֫ */
    public abstract AbstractC6924 mo6235(C14970 c14970);

    /* JADX INFO: renamed from: ֫ */
    public abstract AbstractC6924 mo4462(C21442 c21442);

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo4463(C19705 c19705);

    /* JADX INFO: renamed from: ۧ */
    public abstract int mo4465();

    /* JADX INFO: renamed from: ۧ */
    public abstract AbstractC6924 mo6236(int i);

    /* JADX INFO: renamed from: ܺ */
    public abstract String mo4466();

    /* JADX INFO: renamed from: ֫ */
    public static C20256 m15859(C12054 c12054, C22783 c22783, C22783 c22784) {
        C14970 c14970;
        boolean z = c22783.m50982() == 1;
        boolean zM22288 = c22783.getType().m22288();
        int iM50989 = c22783.m50989();
        if ((c22784.m50989() | iM50989) < 16) {
            if (zM22288) {
                c14970 = C14300.f40874;
            } else {
                c14970 = z ? C14300.f40799 : C14300.f40840;
            }
        } else if (iM50989 < 256) {
            if (zM22288) {
                c14970 = C14300.f40765;
            } else {
                c14970 = z ? C14300.f40794 : C14300.f40815;
            }
        } else if (zM22288) {
            c14970 = C14300.f40809;
        } else {
            c14970 = z ? C14300.f40784 : C14300.f40835;
        }
        return new C20256(c14970, c12054, C21442.m48566(c22783, c22784));
    }

    public AbstractC6924(C14970 c14970, C12054 c12054, C21442 c21442) {
        if (c14970 == null) {
            throw new NullPointerException("opcode == null");
        }
        if (c12054 == null) {
            throw new NullPointerException("position == null");
        }
        if (c21442 == null) {
            throw new NullPointerException("registers == null");
        }
        this.f18023 = -1;
        this.f18024 = c14970;
        this.f18025 = c12054;
        this.f18026 = c21442;
    }

    public final String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder(100);
        sb.append(m15864());
        sb.append(' ');
        sb.append(this.f18025);
        sb.append(": ");
        sb.append(this.f18024.m34269());
        C21442 c21442 = this.f18026;
        if (c21442.size() != 0) {
            sb.append(c21442.m43240(" ", (String) null));
            z = true;
        } else {
            z = false;
        }
        String strMo4461 = mo4461();
        if (strMo4461 != null) {
            if (z) {
                sb.append(',');
            }
            sb.append(' ');
            sb.append(strMo4461);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۢ */
    public final boolean m15865() {
        return this.f18023 >= 0;
    }

    /* JADX INFO: renamed from: ܿ */
    public final int m15870() {
        int i = this.f18023;
        if (i >= 0) {
            return i;
        }
        throw new RuntimeException("address not yet known");
    }

    /* JADX INFO: renamed from: ᩻ */
    public final C14970 m15874() {
        return this.f18024;
    }

    /* JADX INFO: renamed from: ۜ */
    public final C12054 m15863() {
        return this.f18025;
    }

    /* JADX INFO: renamed from: ֫ */
    public AbstractC6924 mo15860(C17911 c17911) {
        return mo4462(c17911.m11173(this.f18026));
    }

    /* JADX INFO: renamed from: ᩷ */
    public final C21442 m15873() {
        return this.f18026;
    }

    /* JADX INFO: renamed from: ۧ */
    public final C20256 m15866(BitSet bitSet) {
        if (!this.f18024.m34272() || bitSet.get(0)) {
            return null;
        }
        C22783 c22783M56524get = this.f18026.m56524get(0);
        return m15859(this.f18025, c22783M56524get, c22783M56524get.m50983(0));
    }

    /* JADX INFO: renamed from: ܳ */
    public final AbstractC6924 m15867() {
        return mo4462(this.f18026.m48572(this.f18024.m34272(), (BitSet) null));
    }

    /* JADX INFO: renamed from: ܽ */
    public final AbstractC6924 m15869(BitSet bitSet) {
        return mo4462(this.f18026.m48572(this.f18024.m34272(), bitSet));
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
    /* JADX INFO: renamed from: ᩳ */
    public final int m15871(BitSet bitSet) {
        ?? M34272 = this.f18024.m34272();
        ?? r1 = this.f18026;
        int size = r1.size();
        int iM50982 = 0;
        int iM50983 = (M34272 == 0 || bitSet.get(0)) ? 0 : r1.m56524get(0).m50982();
        while (M34272 < size) {
            if (!bitSet.get(M34272)) {
                iM50982 = r1.m56524get(M34272).m50982() + iM50982;
            }
            M34272++;
        }
        return Math.max(iM50982, iM50983);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C8265 m15861(BitSet bitSet) {
        boolean z = bitSet.get(0);
        C14970 c14970 = this.f18024;
        if (c14970.m34272()) {
            bitSet.set(0);
        }
        C21442 c21442M48570 = this.f18026.m48570(bitSet);
        if (c14970.m34272()) {
            bitSet.set(0, z);
        }
        if (c21442M48570.size() == 0) {
            return null;
        }
        return new C8265(this.f18025, c21442M48570);
    }

    /* JADX INFO: renamed from: ۡ */
    public final String m15864() {
        int i = this.f18023;
        return i != -1 ? String.format("%04x", Integer.valueOf(i)) : C16351.m37155(System.identityHashCode(this));
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m15862(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("address < 0");
        }
        this.f18023 = i;
    }

    /* JADX INFO: renamed from: ᩳ */
    public String mo15872() {
        throw new UnsupportedOperationException("Not supported.");
    }

    /* JADX INFO: renamed from: ܽ */
    public String mo15868() {
        throw new UnsupportedOperationException("Not supported.");
    }
}
