package p067l;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import bin.p000mt.plus.R;
import java.util.ArrayList;
import java.util.UUID;

/* JADX INFO: renamed from: l.ܶۤ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: M6WW */
/* JADX INFO: loaded from: classes4.dex */
public final class C16792 {

    /* JADX INFO: renamed from: ֫ */
    public final AbstractActivityC5549 f49483;

    /* JADX INFO: renamed from: ۜ */
    public C8331 f49484;

    /* JADX INFO: renamed from: ۢ */
    public String f49485;

    /* JADX INFO: renamed from: ܳ */
    public boolean f49487;

    /* JADX INFO: renamed from: ܽ */
    public boolean f49488;

    /* JADX INFO: renamed from: ܿ */
    public Runnable f49489;

    /* JADX INFO: renamed from: ᩳ */
    public DialogInterfaceC2564 f49490;

    /* JADX INFO: renamed from: ᩻ */
    public C3847 f49492;

    /* JADX INFO: renamed from: ᩷ */
    public final ArrayList f49491 = new ArrayList();

    /* JADX INFO: renamed from: ۧ */
    public final C2711 f49486 = new C2711(this);

    /* JADX INFO: renamed from: ֫ */
    public static void m38041(C16792 c16792, int i) {
        c16792.getClass();
        boolean z = i == 0;
        AbstractActivityC5549 abstractActivityC5549 = c16792.f49483;
        if (c16792.m38057() && c16792.f49484 == null && !c16792.f49487) {
            c16792.f49484 = ViewOnClickListenerC20541.m46368(abstractActivityC5549.mo4693(), "mcp-file-rule-" + UUID.randomUUID(), new C17463(c16792, z));
            if (abstractActivityC5549 instanceof ActivityC10363) {
                ((ActivityC10363) abstractActivityC5549).m23985(true);
            }
            try {
                if (z) {
                    C8331 c8331 = c16792.f49484;
                    c8331.getClass();
                    c8331.m38698(0, R.string.MT_Protector, (String) null, (String) null, (String[]) null, (Bundle) null);
                } else {
                    C8331 c8332 = c16792.f49484;
                    c8332.getClass();
                    C8331.m19221(c8332, R.string.MT_Protector, null, null, 14);
                }
            } catch (RuntimeException e) {
                c16792.m38051();
                throw e;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m38044(C16792 c16792, C15419 c15419) {
        c16792.getClass();
        C22711.m50832(c15419.f44088);
        c16792.m38055();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m38047(final C16792 c16792, int[] iArr, final C15419 c15419, String str, final boolean z) {
        c16792.getClass();
        final EnumC8044 enumC8044 = EnumC8044.values()[iArr[0]];
        EnumC8044 enumC8045 = ((C15419) C9179.m21131(1, C22711.m50827().f25640)).f44086;
        if (!c15419.m35148() || enumC8044 != EnumC8044.READ_WRITE || enumC8045 == enumC8044) {
            try {
                if (z) {
                    C22711.m50824(c15419, enumC8044);
                } else {
                    C22711.m50823(c15419.f44088, enumC8044);
                }
                c16792.m38055();
                return;
            } catch (IllegalArgumentException unused) {
                C22682.m50793(R.string.MT_Protector);
                return;
            }
        }
        AbstractActivityC5549 abstractActivityC5549 = c16792.f49483;
        int i = DialogInterfaceC2564.f4230;
        C20671 c20671 = new C20671(abstractActivityC5549);
        c20671.m46730(str);
        c20671.m46710(R.string.MT_Protector);
        c20671.m46736(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۢۤ᩻
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                C16792.m38045(this.f31880, c15419, enumC8044, z);
            }
        });
        c20671.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c20671.m46732();
    }

    public C16792(AbstractActivityC5549 abstractActivityC5549) {
        this.f49483 = abstractActivityC5549;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C16792 m38040(View view, AbstractActivityC5549 abstractActivityC5549, DialogInterfaceC2564 dialogInterfaceC2564) {
        C16792 c16792 = new C16792(abstractActivityC5549);
        c16792.f49490 = dialogInterfaceC2564;
        C4694 c4694 = (C4694) view.findViewById(R.id.MT_Protector);
        c4694.m9946();
        c4694.setAdapter(c16792.f49486);
        C3847 c3847 = new C3847(new C10759(c16792));
        c16792.f49492 = c3847;
        c3847.m7551((C14849) c4694);
        c16792.m38055();
        return c16792;
    }

    /* JADX INFO: renamed from: ۧ */
    public static boolean m38050(C16792 c16792, int i) {
        return i > 0 && i < c16792.f49491.size();
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m38061() {
        m38055();
    }

    /* JADX INFO: renamed from: ܿ */
    private void m38055() {
        String str;
        C9385 c9385M50827 = C22711.m50827();
        StringBuilder sb = new StringBuilder();
        AbstractActivityC5549 abstractActivityC5549 = this.f49483;
        sb.append(abstractActivityC5549.getString(R.string.MT_Protector));
        if (C22711.m50834()) {
            str = "\n\n" + abstractActivityC5549.getString(R.string.MT_Protector);
        } else {
            str = "";
        }
        sb.append(str);
        this.f49485 = sb.toString();
        ArrayList arrayList = this.f49491;
        arrayList.clear();
        arrayList.addAll(c9385M50827.f25640);
        this.f49486.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m38059() {
        if (m38057() && this.f49484 == null && !this.f49487) {
            int i = DialogInterfaceC2564.f4230;
            AbstractActivityC5549 abstractActivityC5549 = this.f49483;
            C20671 c20671 = new C20671(abstractActivityC5549);
            c20671.m46727(R.string.MT_Protector);
            c20671.m46724(new String[]{abstractActivityC5549.getString(R.string.MT_Protector), abstractActivityC5549.getString(R.string.MT_Protector)}, new DialogInterface.OnClickListener() { // from class: l.᩻ۤ᩻
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    C16792.m38041(this.f79337, i2);
                }
            });
            c20671.m46732();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m38042(C16792 c16792, String str, boolean z) {
        c16792.f49487 = true;
        new C6065(c16792, str, z).m22250();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩳ */
    public boolean m38057() {
        if (this.f49488 || !this.f49490.m3855()) {
            return false;
        }
        AbstractActivityC5549 abstractActivityC5549 = this.f49483;
        return (abstractActivityC5549.isFinishing() || abstractActivityC5549.isDestroyed()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܳ */
    public void m38051() {
        C8331 c8331 = this.f49484;
        if (c8331 != null) {
            c8331.m38697();
            this.f49484 = null;
            AbstractActivityC5549 abstractActivityC5549 = this.f49483;
            if (abstractActivityC5549 instanceof ActivityC10363) {
                ((ActivityC10363) abstractActivityC5549).m23985(false);
            }
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m38060() {
        this.f49488 = true;
        m38051();
        Runnable runnable = this.f49489;
        if (runnable != null) {
            runnable.run();
            this.f49489 = null;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m38046(final C16792 c16792, final C15419 c15419, final boolean z) {
        AbstractActivityC5549 abstractActivityC5549 = c16792.f49483;
        final int[] iArr = {(z ? EnumC8044.READ_ONLY : c15419.f44086).ordinal()};
        final String string = c15419.m35148() ? abstractActivityC5549.getString(R.string.MT_Protector) : c15419.f44088;
        int i = DialogInterfaceC2564.f4230;
        C20671 c20671 = new C20671(abstractActivityC5549);
        c20671.m46730(string);
        c20671.m46723(new String[]{c16792.m38037(EnumC8044.READ_ONLY), c16792.m38037(EnumC8044.READ_WRITE), c16792.m38037(EnumC8044.DENY)}, iArr[0], new DialogInterfaceOnClickListenerC22354(2, iArr));
        c20671.m46736(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۜۤ᩻
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                C16792.m38047(this.f23702, iArr, c15419, string, z);
            }
        });
        c20671.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        if (!z && !c15419.m35148()) {
            c20671.m46734(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.᩷ۤ᩻
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    C16792.m38044(this.f70077, c15419);
                }
            });
        }
        c20671.m46732();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m38045(C16792 c16792, C15419 c15419, EnumC8044 enumC8044, boolean z) {
        c16792.getClass();
        try {
            if (z) {
                C22711.m50824(c15419, enumC8044);
            } else {
                C22711.m50823(c15419.f44088, enumC8044);
            }
            c16792.m38055();
        } catch (IllegalArgumentException unused) {
            C22682.m50793(R.string.MT_Protector);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫ */
    public String m38037(EnumC8044 enumC8044) {
        int i;
        int i2 = C20147.f62366[enumC8044.ordinal()];
        if (i2 == 1) {
            i = R.string.MT_Protector;
        } else if (i2 == 2) {
            i = R.string.MT_Protector;
        } else {
            if (i2 != 3) {
                throw new IncompatibleClassChangeError();
            }
            i = R.string.MT_Protector;
        }
        return this.f49483.getString(i);
    }
}
