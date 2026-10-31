package l;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.֫ۛܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: M8VR */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractDialogInterfaceOnClickListenerC1643 implements DialogInterface.OnClickListener, View.OnClickListener, DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final TextView f5739;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final DialogInterfaceC0206 f5740;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final EditText f5741;

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public abstract void mo5524();

    public AbstractDialogInterfaceOnClickListenerC1643(AbstractActivityC3346 abstractActivityC3346) {
        View viewM10216 = abstractActivityC3346.m10216(R.layout.MT_Protector);
        this.f5739 = (TextView) viewM10216.findViewById(R.id.MT_Protector);
        EditText editText = (EditText) viewM10216.findViewById(R.id.MT_Protector);
        this.f5741 = editText;
        int i = DialogInterfaceC0206.f1451;
        C19258 c19258 = new C19258(abstractActivityC3346);
        c19258.m44421(viewM10216);
        c19258.m44428(false);
        c19258.m44442(R.string.MT_Protector, null);
        c19258.m44434(R.string.MT_Protector, this);
        DialogInterfaceC0206 dialogInterfaceC0206M44415 = c19258.m44415();
        this.f5740 = dialogInterfaceC0206M44415;
        dialogInterfaceC0206M44415.m1437(new DialogInterface.OnKeyListener() { // from class: l.ܰۤܿ
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i2, KeyEvent keyEvent) {
                this.f41061.getClass();
                if (keyEvent.getAction() != 0 || i2 != 4) {
                    return false;
                }
                dialogInterface.dismiss();
                return true;
            }
        });
        dialogInterfaceC0206M44415.m1436(this);
        editText.setOnKeyListener(new View.OnKeyListener() { // from class: l.۟ۤܿ
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i2, KeyEvent keyEvent) {
                return AbstractDialogInterfaceOnClickListenerC1643.m5517(this.f22788, i2, keyEvent);
            }
        });
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m5517(AbstractDialogInterfaceOnClickListenerC1643 abstractDialogInterfaceOnClickListenerC1643, int i, KeyEvent keyEvent) {
        EditText editText = abstractDialogInterfaceOnClickListenerC1643.f5741;
        int inputType = editText.getInputType();
        int i2 = C10235.f30845;
        if ((inputType & 131087) == 131073) {
            return false;
        }
        if (i != 66 && i != 160) {
            return false;
        }
        int imeOptions = editText.getImeOptions();
        if (imeOptions != 2 && imeOptions != 3 && imeOptions != 4 && imeOptions != 6) {
            return false;
        }
        if (keyEvent.getAction() == 1) {
            abstractDialogInterfaceOnClickListenerC1643.mo5524();
        }
        return true;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m5523() {
        this.f5741.setInputType(2);
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m5525() {
        this.f5741.setImeOptions(6);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m5518() {
        this.f5740.dismiss();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String m5521() {
        return this.f5741.getText().toString();
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void m5527() {
        DialogInterfaceC0206 dialogInterfaceC0206 = this.f5740;
        dialogInterfaceC0206.m1449();
        dialogInterfaceC0206.m1447().setOnClickListener(this);
        C4925.m14329(this.f5741);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m5522(String str) {
        this.f5741.setText(str);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m5520(String str) {
        this.f5741.setHint(str);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m5526() {
        this.f5741.selectAll();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m5519(int i) {
        this.f5739.setText(i);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        mo5524();
    }
}
