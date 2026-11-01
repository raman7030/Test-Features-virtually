package p067l;

/* JADX INFO: renamed from: l.ܽ᩶֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 85GM */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC18391 extends AbstractC4310 {

    /* JADX INFO: renamed from: ۧ */
    public AbstractC7230 f54917;

    public AbstractC18391(EnumC25097 enumC25097, AbstractC7230 abstractC7230) {
        super(enumC25097);
        this.f54917 = abstractC7230;
        int i = C13028.f36654[enumC25097.f80335.ordinal()];
        if (i == 1) {
            if (this.f54917 instanceof C19971) {
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(this.f54917.getClass().getSimpleName());
            sb.append(" is the wrong item type for opcode ");
            throw new RuntimeException(C10965.m25286(sb, enumC25097.f80336, ". Expecting FieldIdItem."));
        }
        if (i == 2) {
            if (this.f54917 instanceof C23324) {
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f54917.getClass().getSimpleName());
            sb2.append(" is the wrong item type for opcode ");
            throw new RuntimeException(C10965.m25286(sb2, enumC25097.f80336, ". Expecting MethodIdItem."));
        }
        if (i == 3) {
            if (this.f54917 instanceof C23994) {
                return;
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append(this.f54917.getClass().getSimpleName());
            sb3.append(" is the wrong item type for opcode ");
            throw new RuntimeException(C10965.m25286(sb3, enumC25097.f80336, ". Expecting TypeIdItem."));
        }
        if (i != 4) {
            if (this.f54917 == null) {
                return;
            }
            StringBuilder sb4 = new StringBuilder();
            sb4.append(this.f54917.getClass().getSimpleName());
            sb4.append(" is invalid for opcode ");
            throw new RuntimeException(C10965.m25286(sb4, enumC25097.f80336, ". This opcode does not reference an item"));
        }
        if (this.f54917 instanceof C13266) {
            return;
        }
        StringBuilder sb5 = new StringBuilder();
        sb5.append(this.f54917.getClass().getSimpleName());
        sb5.append(" is the wrong item type for opcode ");
        throw new RuntimeException(C10965.m25286(sb5, enumC25097.f80336, ". Expecting StringIdItem."));
    }

    public AbstractC18391(C5651 c5651, EnumC25097 enumC25097, byte[] bArr, int i) {
        super(enumC25097);
        int iMo25523 = mo25523(i, bArr);
        int i2 = C13028.f36654[enumC25097.f80335.ordinal()];
        if (i2 == 1) {
            this.f54917 = c5651.f13738.m3722(iMo25523);
            return;
        }
        if (i2 == 2) {
            this.f54917 = c5651.f13730.m3722(iMo25523);
        } else if (i2 == 3) {
            this.f54917 = c5651.f13727.m3722(iMo25523);
        } else {
            if (i2 != 4) {
                return;
            }
            this.f54917 = c5651.f13748.m3722(iMo25523);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public int mo25523(int i, byte[] bArr) {
        return C13590.m30920(i + 2, bArr);
    }

    /* JADX INFO: renamed from: ۡ */
    public final AbstractC7230 m41867() {
        return this.f54917;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m41866(AbstractC7230 abstractC7230) {
        this.f54917 = abstractC7230;
    }
}
