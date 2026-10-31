package l;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import bin.mt.plus.Main;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۤ֨᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 673L */
/* JADX INFO: loaded from: classes3.dex */
public final class C9971 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractActivityC3346 f30082;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final DialogInterfaceC0206 f30083;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C10235 f30084;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C19907 f30085;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C5062 f30086;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C10235 f30087;

    public C9971(Main main, C19907 c19907) {
        this.f30082 = main;
        this.f30085 = c19907;
        View viewM10216 = main.m10216(R.layout.MT_Protector);
        int i = DialogInterfaceC0206.f1451;
        C19258 c19258 = new C19258(main);
        c19258.m44421(viewM10216);
        c19258.m44428(false);
        c19258.m44442(R.string.MT_Protector, null);
        c19258.m44434(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        DialogInterfaceC0206 dialogInterfaceC0206M44415 = c19258.m44415();
        this.f30083 = dialogInterfaceC0206M44415;
        dialogInterfaceC0206M44415.m1437(new DialogInterface.OnKeyListener() { // from class: l.ۙ֨᩻
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i2, KeyEvent keyEvent) {
                return C9971.m25136(this.f13919, i2, keyEvent);
            }
        });
        C5062 c5062 = (C5062) viewM10216.findViewById(R.id.MT_Protector);
        this.f30086 = c5062;
        c5062.m14602("rpur", (String) null);
        c5062.m14606();
        c5062.m14599(17);
        C10235 c10235M14607 = c5062.m14607();
        c10235M14607.m25924(6);
        c10235M14607.m30512(2);
        c10235M14607.setOnKeyListener(new View.OnKeyListener() { // from class: l.ۗ֨᩻
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i2, KeyEvent keyEvent) {
                return C9971.m25133(this.f9281, i2, keyEvent);
            }
        });
        C10235 c10235 = (C10235) viewM10216.findViewById(R.id.MT_Protector);
        this.f30084 = c10235;
        c10235.m25924(5);
        String string = ApplicationC20075.f65008.getString("rpua", "MT-RemotePayload/1");
        c10235.mo25910((CharSequence) (C22794.m50882(string) ? string : "MT-RemotePayload/1"));
        C10235 c10236 = (C10235) viewM10216.findViewById(R.id.MT_Protector);
        this.f30087 = c10236;
        c10236.m25924(6);
        int i2 = 4;
        int i3 = ApplicationC20075.f65008.getInt("rpdt", 4);
        if (i3 >= 1 && i3 <= 16) {
            i2 = i3;
        }
        c10236.mo25910((CharSequence) String.valueOf(i2));
        c10236.setOnKeyListener(new View.OnKeyListener() { // from class: l.۬֨᩻
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i4, KeyEvent keyEvent) {
                return C9971.m25135(this.f38412, i4, keyEvent);
            }
        });
        viewM10216.findViewById(R.id.MT_Protector).setOnClickListener(new ViewOnClickListenerC10893(3, main));
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ boolean m25136(C9971 c9971, int i, KeyEvent keyEvent) {
        if (i != 4 || keyEvent.getAction() != 0) {
            return false;
        }
        c9971.f30083.dismiss();
        return true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ boolean m25133(C9971 c9971, int i, KeyEvent keyEvent) {
        if (i != 66 && i != 160) {
            return false;
        }
        if (keyEvent.getAction() == 1) {
            c9971.m25134();
        }
        return true;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ boolean m25135(C9971 c9971, int i, KeyEvent keyEvent) {
        if (i != 66 && i != 160) {
            return false;
        }
        if (keyEvent.getAction() == 1) {
            c9971.m25134();
        }
        return true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m25137() {
        C5062 c5062 = this.f30086;
        c5062.m14615();
        DialogInterfaceC0206 dialogInterfaceC0206 = this.f30083;
        dialogInterfaceC0206.m1449();
        dialogInterfaceC0206.m1447().setOnClickListener(new View.OnClickListener() { // from class: l.۫֨᩻
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f36144.m25134();
            }
        });
        C4925.m14329(c5062.m14607());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public void m25134() {
        C11749 c11749M28763;
        AbstractActivityC3346 abstractActivityC3346 = this.f30082;
        C10235 c10235 = this.f30087;
        C5062 c5062 = this.f30086;
        String strTrim = c5062.m14611().toString().trim();
        try {
            c11749M28763 = C11749.m28763(strTrim);
        } catch (IllegalArgumentException unused) {
            c11749M28763 = null;
        }
        if (c11749M28763 == null || !c11749M28763.m28778().isEmpty() || !c11749M28763.m28769().isEmpty() || c11749M28763.m28773().isEmpty()) {
            c5062.m14607().requestFocus();
            C21374.m48463(R.string.MT_Protector);
            return;
        }
        C10235 c10236 = this.f30084;
        String strTrim2 = c10236.m30436().toString().trim();
        if (!C22794.m50882(strTrim2)) {
            c10236.requestFocus();
            C21374.m48463(R.string.MT_Protector);
            return;
        }
        try {
            int i = Integer.parseInt(c10235.m30436().toString().trim());
            if (i >= 1 && i <= 16) {
                if (strTrim.length() <= 2000) {
                    c5062.m14601(strTrim);
                    c5062.m14610();
                }
                ApplicationC20075.f65008.edit().putString("rpua", strTrim2).mo25853(i, "rpdt").apply();
                this.f30083.dismiss();
                ((C16560) this.f30085.f64320).m39009((InterfaceC18303) new C19849(strTrim, strTrim2, i, new C22670()));
                return;
            }
            c10235.requestFocus();
            c10235.m25900();
            C21374.m48464(abstractActivityC3346.getString(R.string.MT_Protector, 16));
        } catch (NumberFormatException unused2) {
            c10235.requestFocus();
            c10235.m25900();
            C21374.m48464(abstractActivityC3346.getString(R.string.MT_Protector, 16));
        }
    }
}
