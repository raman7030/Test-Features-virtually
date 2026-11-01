package p067l;

import org.bouncycastle.crypto.modes.GCMSIVBlockCipher;

/* JADX INFO: renamed from: l.ܶ֡ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: S8S4 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16508 {

    /* JADX INFO: renamed from: ֫ */
    public boolean f48513;

    /* JADX INFO: renamed from: ۖ */
    public long f48514;

    /* JADX INFO: renamed from: ۜ */
    public final InterfaceC20790 f48515;

    /* JADX INFO: renamed from: ۡ */
    public boolean f48516;

    /* JADX INFO: renamed from: ۢ */
    public boolean f48517;

    /* JADX INFO: renamed from: ۧ */
    public boolean f48518;

    /* JADX INFO: renamed from: ܳ */
    public long f48519;

    /* JADX INFO: renamed from: ܺ */
    public long f48520;

    /* JADX INFO: renamed from: ܽ */
    public boolean f48521;

    /* JADX INFO: renamed from: ܿ */
    public boolean f48522;

    /* JADX INFO: renamed from: ᩳ */
    public int f48523;

    /* JADX INFO: renamed from: ᩷ */
    public boolean f48524;

    /* JADX INFO: renamed from: ᩻ */
    public long f48525;

    public C16508(InterfaceC20790 interfaceC20790) {
        this.f48515 = interfaceC20790;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m37463() {
        this.f48521 = false;
        this.f48518 = false;
        this.f48513 = false;
        this.f48517 = false;
        this.f48524 = false;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m37464(int i, int i2, long j, long j2, boolean z) {
        this.f48518 = false;
        this.f48513 = false;
        this.f48525 = j2;
        this.f48523 = 0;
        this.f48519 = j;
        if (i2 >= 32 && i2 != 40) {
            if (this.f48517 && !this.f48524) {
                if (z) {
                    m37462(i);
                }
                this.f48517 = false;
            }
            if ((32 <= i2 && i2 <= 35) || i2 == 39) {
                this.f48513 = !this.f48524;
                this.f48524 = true;
            }
        }
        boolean z2 = i2 >= 16 && i2 <= 21;
        this.f48522 = z2;
        this.f48521 = z2 || i2 <= 9;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m37465(int i, int i2, byte[] bArr) {
        if (this.f48521) {
            int i3 = this.f48523;
            int i4 = (i + 2) - i3;
            if (i4 < i2) {
                this.f48518 = (bArr[i4] & GCMSIVBlockCipher.MASK) != 0;
                this.f48521 = false;
            } else {
                this.f48523 = (i2 - i) + i3;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m37466(long j, int i, boolean z) {
        if (this.f48524 && this.f48518) {
            this.f48516 = this.f48522;
            this.f48524 = false;
        } else if (this.f48513 || this.f48518) {
            if (z && this.f48517) {
                m37462(i + ((int) (j - this.f48519)));
            }
            this.f48520 = this.f48519;
            this.f48514 = this.f48525;
            this.f48516 = this.f48522;
            this.f48517 = true;
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
    /* JADX INFO: renamed from: ֫ */
    private void m37462(int i) {
        long j = this.f48514;
        if (j != -9223372036854775807L) {
            long j2 = this.f48519;
            long j3 = this.f48520;
            if (j2 == j3) {
                return;
            }
            boolean z = this.f48516;
            this.f48515.mo10502(j, z ? 1 : 0, (int) (j2 - j3), i, null);
        }
    }
}
