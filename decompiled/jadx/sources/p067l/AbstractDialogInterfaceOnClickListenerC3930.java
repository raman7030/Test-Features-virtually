package p067l;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.֫ۛܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: M8VR */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractDialogInterfaceOnClickListenerC3930 implements DialogInterface.OnClickListener, View.OnClickListener, DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: ᩶ */
    public final TextView f8519;

    /* JADX INFO: renamed from: ᩸ */
    public final DialogInterfaceC2564 f8520;

    /* JADX INFO: renamed from: ᩹ */
    public final EditText f8521;

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
    }

    /* JADX INFO: renamed from: ܽ */
    public abstract void mo7754();

    public AbstractDialogInterfaceOnClickListenerC3930(AbstractActivityC5549 abstractActivityC5549) {
        View viewM12252 = abstractActivityC5549.m12252(R.layout.MT_Protector);
        this.f8519 = (TextView) viewM12252.findViewById(R.id.MT_Protector);
        EditText editText = (EditText) viewM12252.findViewById(R.id.MT_Protector);
        this.f8521 = editText;
        int i = DialogInterfaceC2564.f4230;
        C20671 c20671 = new C20671(abstractActivityC5549);
        c20671.m46715(viewM12252);
        c20671.m46722(false);
        c20671.m46736(R.string.MT_Protector, null);
        c20671.m46728(R.string.MT_Protector, this);
        DialogInterfaceC2564 dialogInterfaceC2564M46709 = c20671.m46709();
        this.f8520 = dialogInterfaceC2564M46709;
        dialogInterfaceC2564M46709.m3850(new DialogInterface.OnKeyListener() { // from class: l.ܰۤܿ
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i2, KeyEvent keyEvent) {
                this.f44138.getClass();
                if (keyEvent.getAction() != 0 || i2 != 4) {
                    return false;
                }
                dialogInterface.dismiss();
                return true;
            }
        });
        dialogInterfaceC2564M46709.m3849(this);
        editText.setOnKeyListener(new View.OnKeyListener() { // from class: l.۟ۤܿ
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i2, KeyEvent keyEvent) {
                return AbstractDialogInterfaceOnClickListenerC3930.m7747(this.f25700, i2, keyEvent);
            }
        });
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m7747(AbstractDialogInterfaceOnClickListenerC3930 abstractDialogInterfaceOnClickListenerC3930, int i, KeyEvent keyEvent) {
        EditText editText = abstractDialogInterfaceOnClickListenerC3930.f8521;
        int inputType = editText.getInputType();
        int i2 = C12096.f33805;
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
            abstractDialogInterfaceOnClickListenerC3930.mo7754();
        }
        return true;
    }

    /* JADX INFO: renamed from: ܳ */
    public final void m7753() {
        this.f8521.setInputType(2);
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m7755() {
        this.f8521.setImeOptions(6);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m7748() {
        this.f8520.dismiss();
    }

    /* JADX INFO: renamed from: ۧ */
    public final String m7751() {
        return this.f8521.getText().toString();
    }

    /* JADX INFO: renamed from: ᩻ */
    public final void m7757() {
        DialogInterfaceC2564 dialogInterfaceC2564 = this.f8520;
        dialogInterfaceC2564.m3862();
        dialogInterfaceC2564.m3860().setOnClickListener(this);
        C7050.m16226(this.f8521);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m7752(String str) {
        this.f8521.setText(str);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m7750(String str) {
        this.f8521.setHint(str);
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m7756() {
        this.f8521.selectAll();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m7749(int i) {
        this.f8519.setText(i);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        mo7754();
    }
}
