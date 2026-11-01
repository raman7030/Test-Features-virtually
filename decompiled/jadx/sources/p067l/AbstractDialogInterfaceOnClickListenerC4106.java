package p067l;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.֫۫ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: P5BR */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractDialogInterfaceOnClickListenerC4106 implements DialogInterface.OnClickListener, View.OnClickListener, DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: ۙ */
    public final TextView f9042;

    /* JADX INFO: renamed from: ᩶ */
    public final LinearLayout f9043;

    /* JADX INFO: renamed from: ᩸ */
    public final DialogInterfaceC2564 f9044;

    /* JADX INFO: renamed from: ᩹ */
    public final C7179 f9045;

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
    }

    /* JADX INFO: renamed from: ܿ */
    public abstract void mo8256();

    /* JADX INFO: renamed from: ᩳ */
    public void mo8257() {
    }

    public AbstractDialogInterfaceOnClickListenerC4106(AbstractActivityC5549 abstractActivityC5549, String str) {
        this(-1, abstractActivityC5549, str);
    }

    public AbstractDialogInterfaceOnClickListenerC4106(int i, AbstractActivityC5549 abstractActivityC5549, String str) {
        View viewM12252 = abstractActivityC5549.m12252(R.layout.MT_Protector);
        this.f9043 = (LinearLayout) viewM12252.findViewById(R.id.MT_Protector);
        this.f9042 = (TextView) viewM12252.findViewById(R.id.MT_Protector);
        C7179 c7179 = (C7179) viewM12252.findViewById(R.id.MT_Protector);
        this.f9045 = c7179;
        int i2 = DialogInterfaceC2564.f4230;
        C20671 c20671 = new C20671(abstractActivityC5549);
        c20671.m46715(viewM12252);
        c20671.m46722(false);
        c20671.m46736(R.string.MT_Protector, null);
        c20671.m46728(R.string.MT_Protector, this);
        if (i != -1) {
            c20671.m46734(i, this);
        }
        DialogInterfaceC2564 dialogInterfaceC2564M46709 = c20671.m46709();
        this.f9044 = dialogInterfaceC2564M46709;
        dialogInterfaceC2564M46709.m3850(new DialogInterface.OnKeyListener() { // from class: l.۟۬ܿ
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i3, KeyEvent keyEvent) {
                this.f25991.getClass();
                if (keyEvent.getAction() != 0 || i3 != 4) {
                    return false;
                }
                dialogInterface.dismiss();
                return true;
            }
        });
        dialogInterfaceC2564M46709.m3849(this);
        c7179.m16509(str, (String) null);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m8251(View view) {
        this.f9043.addView(view);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m8252(View view, int i) {
        this.f9043.addView(view, i);
    }

    /* JADX INFO: renamed from: ܳ */
    public final void m8254() {
        this.f9045.m16517();
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        if (i == -2) {
            return;
        }
        mo8257();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m8249() {
        this.f9044.dismiss();
    }

    /* JADX INFO: renamed from: ܽ */
    public final String m8255() {
        return this.f9045.m16518().toString();
    }

    /* JADX INFO: renamed from: ᩻ */
    public final void m8258() {
        C7179 c7179 = this.f9045;
        c7179.m16522();
        DialogInterfaceC2564 dialogInterfaceC2564 = this.f9044;
        dialogInterfaceC2564.m3862();
        dialogInterfaceC2564.m3860().setOnClickListener(this);
        C7050.m16226(c7179.m16514());
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m8250(int i) {
        this.f9042.setText(i);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        mo8256();
    }

    /* JADX INFO: renamed from: ۧ */
    public final C7179 m8253() {
        return this.f9045;
    }
}
