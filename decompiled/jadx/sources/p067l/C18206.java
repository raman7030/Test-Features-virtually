package p067l;

import android.content.DialogInterface;

/* JADX INFO: renamed from: l.ܽ۬ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: S5I2 */
/* JADX INFO: loaded from: classes4.dex */
public final class C18206 extends AbstractDialogInterfaceOnClickListenerC4106 {

    /* JADX INFO: renamed from: ۗ */
    public final /* synthetic */ AbstractC18877 f54343;

    /* JADX INFO: renamed from: ۛ */
    public final /* synthetic */ C1068 f54344;

    /* JADX INFO: renamed from: ۤ */
    public final /* synthetic */ C1068 f54345;

    /* JADX INFO: renamed from: ۫ */
    public final /* synthetic */ C1068 f54346;

    /* JADX INFO: renamed from: ۬ */
    public final /* synthetic */ AbstractActivityC5549 f54347;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18206(AbstractC18877 abstractC18877, AbstractActivityC5549 abstractActivityC5549, String str, int i, C1068 c1068, C1068 c1069, C1068 c10610, AbstractActivityC5549 abstractActivityC55410) {
        super(i, abstractActivityC5549, str);
        this.f54343 = abstractC18877;
        this.f54344 = c1068;
        this.f54346 = c1069;
        this.f54345 = c10610;
        this.f54347 = abstractActivityC55410;
    }

    @Override // p067l.AbstractDialogInterfaceOnClickListenerC4106
    /* JADX INFO: renamed from: ܿ */
    public final void mo8256() {
        String strSubstring;
        String str;
        int i;
        String strM8255 = m8255();
        AbstractC18877 abstractC18877 = this.f54343;
        if (abstractC18877.mo23311(strM8255)) {
            m8254();
            m8249();
            return;
        }
        if (strM8255.isEmpty()) {
            abstractC18877.mo7881();
            m8249();
            return;
        }
        boolean zIsChecked = this.f54344.isChecked();
        C1068 c1068 = this.f54346;
        if (zIsChecked) {
            if (c1068.isChecked()) {
                strSubstring = strM8255;
            } else {
                strSubstring = strM8255;
                while (strSubstring.startsWith(".*") && strSubstring.length() > 2) {
                    strSubstring = strSubstring.substring(2);
                }
            }
            str = strSubstring;
            i = 0;
        } else {
            i = 16;
            str = strM8255;
        }
        if (!this.f54345.isChecked()) {
            i |= 66;
        }
        try {
            C13259 c13259M30303 = C13259.m30303(i, str);
            m8254();
            m8249();
            abstractC18877.mo7882(new C19548(c13259M30303, c1068.isChecked()), strM8255);
        } catch (Exception e) {
            this.f54347.m12259(e, (DialogInterface.OnDismissListener) null);
        }
    }

    @Override // p067l.AbstractDialogInterfaceOnClickListenerC4106
    /* JADX INFO: renamed from: ᩳ */
    public final void mo8257() {
        this.f54343.mo7881();
    }

    @Override // p067l.AbstractDialogInterfaceOnClickListenerC4106, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        InterfaceC14770 interfaceC14770Edit = ApplicationC21448.f67649.edit();
        for (C1068 c1068 : this.f54343.f56365) {
            if (c1068.getTag() != null) {
                interfaceC14770Edit.putBoolean((String) c1068.getTag(), c1068.isChecked());
            }
        }
        interfaceC14770Edit.apply();
    }
}
