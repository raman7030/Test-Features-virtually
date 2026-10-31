package l;

/* JADX INFO: renamed from: l.ܽ᩶֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 85GM */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC16859 extends AbstractC2043 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public AbstractC5116 f51737;

    public AbstractC16859(EnumC23915 enumC23915, AbstractC5116 abstractC5116) {
        super(enumC23915);
        this.f51737 = abstractC5116;
        int i = C11216.f33655[enumC23915.f77584.ordinal()];
        if (i == 1) {
            if (this.f51737 instanceof C18522) {
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(this.f51737.getClass().getSimpleName());
            sb.append(" is the wrong item type for opcode ");
            throw new RuntimeException(C9045.m23341(sb, enumC23915.f77585, ". Expecting FieldIdItem."));
        }
        if (i == 2) {
            if (this.f51737 instanceof C22050) {
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f51737.getClass().getSimpleName());
            sb2.append(" is the wrong item type for opcode ");
            throw new RuntimeException(C9045.m23341(sb2, enumC23915.f77585, ". Expecting MethodIdItem."));
        }
        if (i == 3) {
            if (this.f51737 instanceof C22755) {
                return;
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append(this.f51737.getClass().getSimpleName());
            sb3.append(" is the wrong item type for opcode ");
            throw new RuntimeException(C9045.m23341(sb3, enumC23915.f77585, ". Expecting TypeIdItem."));
        }
        if (i != 4) {
            if (this.f51737 == null) {
                return;
            }
            StringBuilder sb4 = new StringBuilder();
            sb4.append(this.f51737.getClass().getSimpleName());
            sb4.append(" is invalid for opcode ");
            throw new RuntimeException(C9045.m23341(sb4, enumC23915.f77585, ". This opcode does not reference an item"));
        }
        if (this.f51737 instanceof C11467) {
            return;
        }
        StringBuilder sb5 = new StringBuilder();
        sb5.append(this.f51737.getClass().getSimpleName());
        sb5.append(" is the wrong item type for opcode ");
        throw new RuntimeException(C9045.m23341(sb5, enumC23915.f77585, ". Expecting StringIdItem."));
    }

    public AbstractC16859(C3454 c3454, EnumC23915 enumC23915, byte[] bArr, int i) {
        super(enumC23915);
        int iMo23572 = mo23572(i, bArr);
        int i2 = C11216.f33655[enumC23915.f77584.ordinal()];
        if (i2 == 1) {
            this.f51737 = c3454.f10937.m1314(iMo23572);
            return;
        }
        if (i2 == 2) {
            this.f51737 = c3454.f10929.m1314(iMo23572);
        } else if (i2 == 3) {
            this.f51737 = c3454.f10926.m1314(iMo23572);
        } else {
            if (i2 != 4) {
                return;
            }
            this.f51737 = c3454.f10947.m1314(iMo23572);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public int mo23572(int i, byte[] bArr) {
        return C11807.m28871(i + 2, bArr);
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final AbstractC5116 m39631() {
        return this.f51737;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m39630(AbstractC5116 abstractC5116) {
        this.f51737 = abstractC5116;
    }
}
