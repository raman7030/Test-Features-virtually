package p067l;

/* JADX INFO: renamed from: l.ۧ᩶ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 95AM */
/* JADX INFO: loaded from: classes4.dex */
public final class C13031 extends AbstractC15101 {

    /* JADX INFO: renamed from: ۬ */
    public C9342 f36656;

    public C13031(EnumC3642 enumC3642, AbstractC10348[] abstractC10348Arr, String str, String str2, String[] strArr, String str3) {
        super(enumC3642, abstractC10348Arr);
        this.f36656 = new C9342(str, str2, strArr, str3);
    }

    public C13031(EnumC3642 enumC3642, AbstractC10348[] abstractC10348Arr, C9342 c9342) {
        super(enumC3642, abstractC10348Arr);
        this.f36656 = c9342;
    }

    @Override // p067l.AbstractC15101
    /* JADX INFO: renamed from: ᩷ */
    public final C12891 mo8846() {
        return this.f36656.m21676();
    }

    @Override // p067l.AbstractC7666, p067l.AbstractC10348
    public final AbstractC10348 clone() {
        return new C13031(this.f28658, m17751(), this.f36656);
    }

    @Override // p067l.AbstractC10348
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC10348 mo8844(C3702 c3702) {
        return new C13031(this.f28658, m17752(c3702), this.f36656);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0059 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:14:0x005b  */
    /* JADX WARN: Code duplicated, block: B:15:0x005d  */
    @Override // p067l.AbstractC10348
    /* JADX INFO: renamed from: ܳ */
    public final String mo8845() {
        int i;
        StringBuilder sb = new StringBuilder();
        EnumC3642 enumC3642 = EnumC3642.INVOKE_NEW;
        boolean z = true;
        C9342 c9342 = this.f36656;
        EnumC3642 enumC3643 = this.f28658;
        if (enumC3643 == enumC3642) {
            sb.append("new ");
            sb.append(C2805.m4425(c9342.m21675()));
        } else {
            if (enumC3643 == EnumC3642.INVOKE_STATIC) {
                sb.append(C2805.m4425(c9342.m21675()));
                sb.append('.');
                sb.append(c9342.m21673());
            } else {
                sb.append(this.f20109[0]);
                sb.append('.');
                sb.append(c9342.m21673());
                i = 1;
            }
            sb.append('(');
            while (i < this.f20109.length) {
                if (z) {
                    z = false;
                } else {
                    sb.append(',');
                }
                sb.append(this.f20109[i]);
                i++;
            }
            sb.append(')');
            return sb.toString();
        }
        i = 0;
        sb.append('(');
        while (i < this.f20109.length) {
            if (z) {
                z = false;
            } else {
                sb.append(',');
            }
            sb.append(this.f20109[i]);
            i++;
        }
        sb.append(')');
        return sb.toString();
    }
}
