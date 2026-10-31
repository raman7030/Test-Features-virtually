package l;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.UUID;

/* JADX INFO: renamed from: l.ܶۤ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: M6WW */
/* JADX INFO: loaded from: classes4.dex */
public final class C15176 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractActivityC3346 f46358;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C6273 f46359;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public String f46360;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f46362;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f46363;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public Runnable f46364;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public DialogInterfaceC0206 f46365;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C1556 f46367;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final ArrayList f46366 = new ArrayList();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C0360 f46361 = new C0360(this);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m35882(C15176 c15176, int i) {
        c15176.getClass();
        boolean z = i == 0;
        AbstractActivityC3346 abstractActivityC3346 = c15176.f46358;
        if (c15176.m35898() && c15176.f46359 == null && !c15176.f46362) {
            c15176.f46359 = ViewOnClickListenerC19121.m44074(abstractActivityC3346.mo2322(), "mcp-file-rule-" + UUID.randomUUID(), new C15882(c15176, z));
            if (abstractActivityC3346 instanceof ActivityC8411) {
                ((ActivityC8411) abstractActivityC3346).m22015(true);
            }
            try {
                if (z) {
                    C6273 c6273 = c15176.f46359;
                    c6273.getClass();
                    c6273.m36540(0, R.string.MT_Protector, (String) null, (String) null, (String[]) null, (Bundle) null);
                } else {
                    C6273 c6274 = c15176.f46359;
                    c6274.getClass();
                    C6273.m17283(c6274, R.string.MT_Protector, null, null, 14);
                }
            } catch (RuntimeException e) {
                c15176.m35892();
                throw e;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m35885(C15176 c15176, C13732 c13732) {
        c15176.getClass();
        C21404.m48496(c13732.f41009);
        c15176.m35896();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m35888(final C15176 c15176, int[] iArr, final C13732 c13732, String str, final boolean z) {
        c15176.getClass();
        final EnumC5972 enumC5972 = EnumC5972.values()[iArr[0]];
        EnumC5972 enumC5973 = ((C13732) C7166.m19188(1, C21404.m48491().f22728)).f41007;
        if (!c13732.m33034() || enumC5972 != EnumC5972.READ_WRITE || enumC5973 == enumC5972) {
            try {
                if (z) {
                    C21404.m48488(c13732, enumC5972);
                } else {
                    C21404.m48487(c13732.f41009, enumC5972);
                }
                c15176.m35896();
                return;
            } catch (IllegalArgumentException unused) {
                C21374.m48457(R.string.MT_Protector);
                return;
            }
        }
        AbstractActivityC3346 abstractActivityC3346 = c15176.f46358;
        int i = DialogInterfaceC0206.f1451;
        C19258 c19258 = new C19258(abstractActivityC3346);
        c19258.m44436(str);
        c19258.m44416(R.string.MT_Protector);
        c19258.m44442(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۢۤ᩻
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                C15176.m35886(this.f28934, c13732, enumC5972, z);
            }
        });
        c19258.m44434(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c19258.m44438();
    }

    public C15176(AbstractActivityC3346 abstractActivityC3346) {
        this.f46358 = abstractActivityC3346;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C15176 m35881(View view, AbstractActivityC3346 abstractActivityC3346, DialogInterfaceC0206 dialogInterfaceC0206) {
        C15176 c15176 = new C15176(abstractActivityC3346);
        c15176.f46365 = dialogInterfaceC0206;
        C2447 c2447 = (C2447) view.findViewById(R.id.MT_Protector);
        c2447.m7898();
        c2447.setAdapter(c15176.f46361);
        C1556 c1556 = new C1556(new C8828(c15176));
        c15176.f46367 = c1556;
        c1556.m5322((C13132) c2447);
        c15176.m35896();
        return c15176;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m35891(C15176 c15176, int i) {
        return i > 0 && i < c15176.f46366.size();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m35902() {
        m35896();
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private void m35896() {
        String str;
        C7383 c7383M48491 = C21404.m48491();
        StringBuilder sb = new StringBuilder();
        AbstractActivityC3346 abstractActivityC3346 = this.f46358;
        sb.append(abstractActivityC3346.getString(R.string.MT_Protector));
        if (C21404.m48498()) {
            str = "\n\n" + abstractActivityC3346.getString(R.string.MT_Protector);
        } else {
            str = "";
        }
        sb.append(str);
        this.f46360 = sb.toString();
        ArrayList arrayList = this.f46366;
        arrayList.clear();
        arrayList.addAll(c7383M48491.f22728);
        this.f46361.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m35900() {
        if (m35898() && this.f46359 == null && !this.f46362) {
            int i = DialogInterfaceC0206.f1451;
            AbstractActivityC3346 abstractActivityC3346 = this.f46358;
            C19258 c19258 = new C19258(abstractActivityC3346);
            c19258.m44433(R.string.MT_Protector);
            c19258.m44430(new String[]{abstractActivityC3346.getString(R.string.MT_Protector), abstractActivityC3346.getString(R.string.MT_Protector)}, new DialogInterface.OnClickListener() { // from class: l.᩻ۤ᩻
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    C15176.m35882(this.f76591, i2);
                }
            });
            c19258.m44438();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m35883(C15176 c15176, String str, boolean z) {
        c15176.f46362 = true;
        new C3889(c15176, str, z).m20274();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean m35898() {
        if (this.f46363 || !this.f46365.m1442()) {
            return false;
        }
        AbstractActivityC3346 abstractActivityC3346 = this.f46358;
        return (abstractActivityC3346.isFinishing() || abstractActivityC3346.isDestroyed()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public void m35892() {
        C6273 c6273 = this.f46359;
        if (c6273 != null) {
            c6273.m36539();
            this.f46359 = null;
            AbstractActivityC3346 abstractActivityC3346 = this.f46358;
            if (abstractActivityC3346 instanceof ActivityC8411) {
                ((ActivityC8411) abstractActivityC3346).m22015(false);
            }
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m35901() {
        this.f46363 = true;
        m35892();
        Runnable runnable = this.f46364;
        if (runnable != null) {
            runnable.run();
            this.f46364 = null;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m35887(final C15176 c15176, final C13732 c13732, final boolean z) {
        AbstractActivityC3346 abstractActivityC3346 = c15176.f46358;
        final int[] iArr = {(z ? EnumC5972.READ_ONLY : c13732.f41007).ordinal()};
        final String string = c13732.m33034() ? abstractActivityC3346.getString(R.string.MT_Protector) : c13732.f41009;
        int i = DialogInterfaceC0206.f1451;
        C19258 c19258 = new C19258(abstractActivityC3346);
        c19258.m44436(string);
        c19258.m44429(new String[]{c15176.m35878(EnumC5972.READ_ONLY), c15176.m35878(EnumC5972.READ_WRITE), c15176.m35878(EnumC5972.DENY)}, iArr[0], new DialogInterfaceOnClickListenerC21028(2, iArr));
        c19258.m44442(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۜۤ᩻
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                C15176.m35888(this.f20828, iArr, c13732, string, z);
            }
        });
        c19258.m44434(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        if (!z && !c13732.m33034()) {
            c19258.m44440(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.᩷ۤ᩻
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    C15176.m35885(this.f67394, c13732);
                }
            });
        }
        c19258.m44438();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m35886(C15176 c15176, C13732 c13732, EnumC5972 enumC5972, boolean z) {
        c15176.getClass();
        try {
            if (z) {
                C21404.m48488(c13732, enumC5972);
            } else {
                C21404.m48487(c13732.f41009, enumC5972);
            }
            c15176.m35896();
        } catch (IllegalArgumentException unused) {
            C21374.m48457(R.string.MT_Protector);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public String m35878(EnumC5972 enumC5972) {
        int i;
        int i2 = C18706.f59142[enumC5972.ordinal()];
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
        return this.f46358.getString(i);
    }
}
