package l;

/* JADX INFO: renamed from: l.ۧ᩶ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 95AM */
/* JADX INFO: loaded from: classes4.dex */
public final class C11219 extends AbstractC13397 {

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C7338 f33657;

    public C11219(EnumC1340 enumC1340, AbstractC8396[] abstractC8396Arr, String str, String str2, String[] strArr, String str3) {
        super(enumC1340, abstractC8396Arr);
        this.f33657 = new C7338(str, str2, strArr, str3);
    }

    public C11219(EnumC1340 enumC1340, AbstractC8396[] abstractC8396Arr, C7338 c7338) {
        super(enumC1340, abstractC8396Arr);
        this.f33657 = c7338;
    }

    @Override // l.AbstractC13397
    /* JADX INFO: renamed from: ᩷ */
    public final C11072 mo6720() {
        return this.f33657.m19703();
    }

    @Override // l.AbstractC5574, l.AbstractC8396
    public final AbstractC8396 clone() {
        return new C11219(this.f25745, m15836(), this.f33657);
    }

    @Override // l.AbstractC8396
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC8396 mo6718(C1403 c1403) {
        return new C11219(this.f25745, m15837(c1403), this.f33657);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0059 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:14:0x005b  */
    /* JADX WARN: Code duplicated, block: B:15:0x005d  */
    @Override // l.AbstractC8396
    /* JADX INFO: renamed from: ܳ */
    public final String mo6719() {
        int i;
        StringBuilder sb = new StringBuilder();
        EnumC1340 enumC1340 = EnumC1340.INVOKE_NEW;
        boolean z = true;
        C7338 c7338 = this.f33657;
        EnumC1340 enumC1341 = this.f25745;
        if (enumC1341 == enumC1340) {
            sb.append("new ");
            sb.append(C0459.m2045(c7338.m19702()));
        } else {
            if (enumC1341 == EnumC1340.INVOKE_STATIC) {
                sb.append(C0459.m2045(c7338.m19702()));
                sb.append('.');
                sb.append(c7338.m19700());
            } else {
                sb.append(this.f17269[0]);
                sb.append('.');
                sb.append(c7338.m19700());
                i = 1;
            }
            sb.append('(');
            while (i < this.f17269.length) {
                if (z) {
                    z = false;
                } else {
                    sb.append(',');
                }
                sb.append(this.f17269[i]);
                i++;
            }
            sb.append(')');
            return sb.toString();
        }
        i = 0;
        sb.append('(');
        while (i < this.f17269.length) {
            if (z) {
                z = false;
            } else {
                sb.append(',');
            }
            sb.append(this.f17269[i]);
            i++;
        }
        sb.append(')');
        return sb.toString();
    }
}
