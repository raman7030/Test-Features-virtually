package l;

import android.content.DialogInterface;

/* JADX INFO: renamed from: l.ܽ۬ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: S5I2 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16664 extends AbstractDialogInterfaceOnClickListenerC1828 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC17370 f51161;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4554 f51162;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4554 f51163;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4554 f51164;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC3346 f51165;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16664(AbstractC17370 abstractC17370, AbstractActivityC3346 abstractActivityC3346, String str, int i, C4554 c4554, C4554 c4555, C4554 c4556, AbstractActivityC3346 abstractActivityC3347) {
        super(i, abstractActivityC3346, str);
        this.f51161 = abstractC17370;
        this.f51162 = c4554;
        this.f51164 = c4555;
        this.f51163 = c4556;
        this.f51165 = abstractActivityC3347;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC1828
    /* JADX INFO: renamed from: ܿ */
    public final void mo6058() {
        String strSubstring;
        String str;
        int i;
        String strM6057 = m6057();
        AbstractC17370 abstractC17370 = this.f51161;
        if (abstractC17370.mo21345(strM6057)) {
            m6056();
            m6051();
            return;
        }
        if (strM6057.isEmpty()) {
            abstractC17370.mo5651();
            m6051();
            return;
        }
        boolean zIsChecked = this.f51162.isChecked();
        C4554 c4554 = this.f51164;
        if (zIsChecked) {
            if (c4554.isChecked()) {
                strSubstring = strM6057;
            } else {
                strSubstring = strM6057;
                while (strSubstring.startsWith(".*") && strSubstring.length() > 2) {
                    strSubstring = strSubstring.substring(2);
                }
            }
            str = strSubstring;
            i = 0;
        } else {
            i = 16;
            str = strM6057;
        }
        if (!this.f51163.isChecked()) {
            i |= 66;
        }
        try {
            C11459 c11459M28259 = C11459.m28259(i, str);
            m6056();
            m6051();
            abstractC17370.mo5652(new C18076(c11459M28259, c4554.isChecked()), strM6057);
        } catch (Exception e) {
            this.f51165.m10223(e, (DialogInterface.OnDismissListener) null);
        }
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC1828
    /* JADX INFO: renamed from: ᩳ */
    public final void mo6059() {
        this.f51161.mo5651();
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC1828, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        InterfaceC13049 interfaceC13049Edit = ApplicationC20075.f65008.edit();
        for (C4554 c4554 : this.f51161.f53182) {
            if (c4554.getTag() != null) {
                interfaceC13049Edit.putBoolean((String) c4554.getTag(), c4554.isChecked());
            }
        }
        interfaceC13049Edit.apply();
    }
}
