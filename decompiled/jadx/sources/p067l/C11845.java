package p067l;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import bin.p000mt.plus.Main;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ۤ֨᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 673L */
/* JADX INFO: loaded from: classes3.dex */
public final class C11845 {

    /* JADX INFO: renamed from: ֫ */
    public final AbstractActivityC5549 f33041;

    /* JADX INFO: renamed from: ۧ */
    public final DialogInterfaceC2564 f33042;

    /* JADX INFO: renamed from: ܳ */
    public final C12096 f33043;

    /* JADX INFO: renamed from: ܽ */
    public final C21288 f33044;

    /* JADX INFO: renamed from: ܿ */
    public final C7179 f33045;

    /* JADX INFO: renamed from: ᩳ */
    public final C12096 f33046;

    public C11845(Main main, C21288 c21288) {
        this.f33041 = main;
        this.f33044 = c21288;
        View viewM12252 = main.m12252(R.layout.MT_Protector);
        int i = DialogInterfaceC2564.f4230;
        C20671 c20671 = new C20671(main);
        c20671.m46715(viewM12252);
        c20671.m46722(false);
        c20671.m46736(R.string.MT_Protector, null);
        c20671.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        DialogInterfaceC2564 dialogInterfaceC2564M46709 = c20671.m46709();
        this.f33042 = dialogInterfaceC2564M46709;
        dialogInterfaceC2564M46709.m3850(new DialogInterface.OnKeyListener() { // from class: l.ۙ֨᩻
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i2, KeyEvent keyEvent) {
                return C11845.m27153(this.f16733, i2, keyEvent);
            }
        });
        C7179 c7179 = (C7179) viewM12252.findViewById(R.id.MT_Protector);
        this.f33045 = c7179;
        c7179.m16509("rpur", (String) null);
        c7179.m16513();
        c7179.m16506(17);
        C12096 c12096M16514 = c7179.m16514();
        c12096M16514.m27946(6);
        c12096M16514.m32576(2);
        c12096M16514.setOnKeyListener(new View.OnKeyListener() { // from class: l.ۗ֨᩻
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i2, KeyEvent keyEvent) {
                return C11845.m27150(this.f12080, i2, keyEvent);
            }
        });
        C12096 c12096 = (C12096) viewM12252.findViewById(R.id.MT_Protector);
        this.f33043 = c12096;
        c12096.m27946(5);
        String string = ApplicationC21448.f67649.getString("rpua", "MT-RemotePayload/1");
        c12096.mo27932((CharSequence) (C24032.m53272(string) ? string : "MT-RemotePayload/1"));
        C12096 c12097 = (C12096) viewM12252.findViewById(R.id.MT_Protector);
        this.f33046 = c12097;
        c12097.m27946(6);
        int i2 = 4;
        int i3 = ApplicationC21448.f67649.getInt("rpdt", 4);
        if (i3 >= 1 && i3 <= 16) {
            i2 = i3;
        }
        c12097.mo27932((CharSequence) String.valueOf(i2));
        c12097.setOnKeyListener(new View.OnKeyListener() { // from class: l.۬֨᩻
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i4, KeyEvent keyEvent) {
                return C11845.m27152(this.f41454, i4, keyEvent);
            }
        });
        viewM12252.findViewById(R.id.MT_Protector).setOnClickListener(new ViewOnClickListenerC12721(3, main));
    }

    /* JADX INFO: renamed from: ܽ */
    public static /* synthetic */ boolean m27153(C11845 c11845, int i, KeyEvent keyEvent) {
        if (i != 4 || keyEvent.getAction() != 0) {
            return false;
        }
        c11845.f33042.dismiss();
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ boolean m27150(C11845 c11845, int i, KeyEvent keyEvent) {
        if (i != 66 && i != 160) {
            return false;
        }
        if (keyEvent.getAction() == 1) {
            c11845.m27151();
        }
        return true;
    }

    /* JADX INFO: renamed from: ۧ */
    public static /* synthetic */ boolean m27152(C11845 c11845, int i, KeyEvent keyEvent) {
        if (i != 66 && i != 160) {
            return false;
        }
        if (keyEvent.getAction() == 1) {
            c11845.m27151();
        }
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m27154() {
        C7179 c7179 = this.f33045;
        c7179.m16522();
        DialogInterfaceC2564 dialogInterfaceC2564 = this.f33042;
        dialogInterfaceC2564.m3862();
        dialogInterfaceC2564.m3860().setOnClickListener(new View.OnClickListener() { // from class: l.۫֨᩻
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f39155.m27151();
            }
        });
        C7050.m16226(c7179.m16514());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۧ */
    public void m27151() {
        C13535 c13535M30810;
        AbstractActivityC5549 abstractActivityC5549 = this.f33041;
        C12096 c12096 = this.f33046;
        C7179 c7179 = this.f33045;
        String strTrim = c7179.m16518().toString().trim();
        try {
            c13535M30810 = C13535.m30810(strTrim);
        } catch (IllegalArgumentException unused) {
            c13535M30810 = null;
        }
        if (c13535M30810 == null || !c13535M30810.m30825().isEmpty() || !c13535M30810.m30816().isEmpty() || c13535M30810.m30820().isEmpty()) {
            c7179.m16514().requestFocus();
            C22682.m50799(R.string.MT_Protector);
            return;
        }
        C12096 c12097 = this.f33043;
        String strTrim2 = c12097.m32500().toString().trim();
        if (!C24032.m53272(strTrim2)) {
            c12097.requestFocus();
            C22682.m50799(R.string.MT_Protector);
            return;
        }
        try {
            int i = Integer.parseInt(c12096.m32500().toString().trim());
            if (i >= 1 && i <= 16) {
                if (strTrim.length() <= 2000) {
                    c7179.m16508(strTrim);
                    c7179.m16517();
                }
                ApplicationC21448.f67649.edit().putString("rpua", strTrim2).mo27875(i, "rpdt").apply();
                this.f33042.dismiss();
                ((C18107) this.f33044.f66955).m41235((InterfaceC19764) new C21233(strTrim, strTrim2, i, new C23914()));
                return;
            }
            c12096.requestFocus();
            c12096.m27922();
            C22682.m50800(abstractActivityC5549.getString(R.string.MT_Protector, 16));
        } catch (NumberFormatException unused2) {
            c12096.requestFocus();
            c12096.m27922();
            C22682.m50800(abstractActivityC5549.getString(R.string.MT_Protector, 16));
        }
    }
}
