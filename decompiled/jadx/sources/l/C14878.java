package l;

import org.bouncycastle.crypto.modes.GCMSIVBlockCipher;

/* JADX INFO: renamed from: l.ܶ֡ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: S8S4 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14878 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f45398;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public long f45399;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final InterfaceC19383 f45400;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public boolean f45401;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public boolean f45402;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f45403;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public long f45404;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public long f45405;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f45406;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f45407;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f45408;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f45409;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public long f45410;

    public C14878(InterfaceC19383 interfaceC19383) {
        this.f45400 = interfaceC19383;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m35311() {
        this.f45406 = false;
        this.f45403 = false;
        this.f45398 = false;
        this.f45402 = false;
        this.f45409 = false;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m35312(int i, int i2, long j, long j2, boolean z) {
        this.f45403 = false;
        this.f45398 = false;
        this.f45410 = j2;
        this.f45408 = 0;
        this.f45404 = j;
        if (i2 >= 32 && i2 != 40) {
            if (this.f45402 && !this.f45409) {
                if (z) {
                    m35310(i);
                }
                this.f45402 = false;
            }
            if ((32 <= i2 && i2 <= 35) || i2 == 39) {
                this.f45398 = !this.f45409;
                this.f45409 = true;
            }
        }
        boolean z2 = i2 >= 16 && i2 <= 21;
        this.f45407 = z2;
        this.f45406 = z2 || i2 <= 9;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m35313(int i, int i2, byte[] bArr) {
        if (this.f45406) {
            int i3 = this.f45408;
            int i4 = (i + 2) - i3;
            if (i4 < i2) {
                this.f45403 = (bArr[i4] & GCMSIVBlockCipher.MASK) != 0;
                this.f45406 = false;
            } else {
                this.f45408 = (i2 - i) + i3;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m35314(long j, int i, boolean z) {
        if (this.f45409 && this.f45403) {
            this.f45401 = this.f45407;
            this.f45409 = false;
        } else if (this.f45398 || this.f45403) {
            if (z && this.f45402) {
                m35310(i + ((int) (j - this.f45404)));
            }
            this.f45405 = this.f45404;
            this.f45399 = this.f45410;
            this.f45401 = this.f45407;
            this.f45402 = true;
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m35310(int i) {
        long j = this.f45399;
        if (j != -9223372036854775807L) {
            long j2 = this.f45404;
            long j3 = this.f45405;
            if (j2 == j3) {
                return;
            }
            boolean z = this.f45401;
            this.f45400.mo8455(j, z ? 1 : 0, (int) (j2 - j3), i, null);
        }
    }
}
