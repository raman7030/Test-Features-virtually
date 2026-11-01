package p067l;

/* JADX INFO: renamed from: l.ۚ᩵֡, reason: contains not printable characters */
/* JADX INFO: compiled from: F925 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7643 extends AbstractC10484 {

    /* JADX INFO: renamed from: ֫ */
    public final C15966 f20002;

    /* JADX INFO: renamed from: ۧ */
    public final char f20003;

    /* JADX INFO: renamed from: ܽ */
    public String f20004;

    /* JADX INFO: renamed from: ܿ */
    public StringBuilder f20005;

    /* JADX INFO: renamed from: ᩳ */
    public final int f20006;

    public C7643(char c, int i, int i2) {
        C15966 c15966 = new C15966();
        this.f20002 = c15966;
        this.f20005 = new StringBuilder();
        this.f20003 = c;
        this.f20006 = i;
        String.valueOf(c);
        c15966.m36276(Integer.valueOf(i));
        c15966.m36271(i2);
    }

    @Override // p067l.InterfaceC4449
    /* JADX INFO: renamed from: ܿ */
    public final AbstractC13147 mo9302() {
        return this.f20002;
    }

    @Override // p067l.InterfaceC4449
    /* JADX INFO: renamed from: ֫ */
    public final C16359 mo9295(InterfaceC20543 interfaceC20543) {
        int iMo46447 = interfaceC20543.mo46447();
        int index = interfaceC20543.getIndex();
        CharSequence charSequenceM40550 = interfaceC20543.getLine().m40550();
        int iMo46445 = interfaceC20543.mo46445();
        C15966 c15966 = this.f20002;
        if (iMo46445 < 4 && iMo46447 < charSequenceM40550.length()) {
            int length = charSequenceM40550.length();
            for (int i = iMo46447; i < length; i++) {
                if (charSequenceM40550.charAt(i) != this.f20003) {
                    length = i;
                    break;
                }
            }
            int i2 = length - iMo46447;
            if (i2 >= this.f20006 && C10685.m24606(iMo46447 + i2, charSequenceM40550.length(), charSequenceM40550) == charSequenceM40550.length()) {
                c15966.m36272(Integer.valueOf(i2));
                return new C16359(-1, -1, true);
            }
        }
        int length2 = charSequenceM40550.length();
        for (int iM36279 = c15966.m36279(); iM36279 > 0 && index < length2 && charSequenceM40550.charAt(index) == ' '; iM36279--) {
            index++;
        }
        return C16359.m37169(index);
    }

    @Override // p067l.AbstractC10484, p067l.InterfaceC4449
    /* JADX INFO: renamed from: ֫ */
    public final void mo9297(C17859 c17859) {
        if (this.f20004 == null) {
            this.f20004 = c17859.m40550().toString();
            return;
        }
        CharSequence charSequenceM40550 = c17859.m40550();
        StringBuilder sb = this.f20005;
        sb.append(charSequenceM40550);
        sb.append('\n');
    }

    @Override // p067l.AbstractC10484, p067l.InterfaceC4449
    /* JADX INFO: renamed from: ۜ */
    public final void mo9300() {
        String strM31482 = C13817.m31482(this.f20004.trim());
        C15966 c15966 = this.f20002;
        c15966.m36273(strM31482);
        c15966.m36277(this.f20005.toString());
    }
}
