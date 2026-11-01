package p067l;

import android.content.DialogInterface;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ۨ۬ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: A5PU */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractViewOnClickListenerC13513 implements View.OnClickListener {

    /* JADX INFO: renamed from: ۙ */
    public final TextView f37984;

    /* JADX INFO: renamed from: ᩶ */
    public final TextView f37985;

    /* JADX INFO: renamed from: ᩸ */
    public final DialogInterfaceC2564 f37986;

    /* JADX INFO: renamed from: ᩹ */
    public final EditText f37987;

    /* JADX INFO: renamed from: ܽ */
    public void mo18362() {
    }

    /* JADX INFO: renamed from: ܿ */
    public abstract void mo18363();

    /* JADX INFO: renamed from: ᩳ */
    public void mo30674() {
    }

    public AbstractViewOnClickListenerC13513(AbstractActivityC5549 abstractActivityC5549, int i) {
        View viewM12252 = abstractActivityC5549.m12252(R.layout.MT_Protector);
        this.f37984 = (TextView) viewM12252.findViewById(R.id.MT_Protector);
        this.f37985 = (TextView) viewM12252.findViewById(R.id.MT_Protector);
        EditText editText = (EditText) viewM12252.findViewById(R.id.MT_Protector);
        this.f37987 = editText;
        int i2 = DialogInterfaceC2564.f4230;
        C20671 c20671 = new C20671(abstractActivityC5549);
        c20671.m46715(viewM12252);
        c20671.m46722(false);
        c20671.m46736(R.string.MT_Protector, null);
        c20671.m46728(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۤ۬ܿ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i3) {
                this.f34022.mo18362();
            }
        });
        if (i != -1) {
            c20671.m46734(i, (DialogInterface.OnClickListener) null);
        }
        DialogInterfaceC2564 dialogInterfaceC2564M46709 = c20671.m46709();
        this.f37986 = dialogInterfaceC2564M46709;
        dialogInterfaceC2564M46709.m3848(new DialogInterface.OnCancelListener() { // from class: l.ۛ۬ܿ
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                this.f21511.mo18362();
            }
        });
        C7204.m16545(dialogInterfaceC2564M46709);
        C10884.m25071(dialogInterfaceC2564M46709);
        editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m30668() {
        this.f37986.dismiss();
    }

    /* JADX INFO: renamed from: ۧ */
    public final String m30671() {
        return this.f37987.getText().toString();
    }

    /* JADX INFO: renamed from: ۜ */
    public final void m30670() {
        DialogInterfaceC2564 dialogInterfaceC2564 = this.f37986;
        dialogInterfaceC2564.m3862();
        dialogInterfaceC2564.m3860().setOnClickListener(this);
        Button buttonM3861 = dialogInterfaceC2564.m3861();
        if (buttonM3861 != null) {
            buttonM3861.setOnClickListener(new View.OnClickListener() { // from class: l.۫۬ܿ
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f40442.mo30674();
                }
            });
        }
        C7050.m16226(this.f37987);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m30672(String str) {
        this.f37987.setText(str);
    }

    /* JADX INFO: renamed from: ܳ */
    public final void m30673() {
        this.f37987.selectAll();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m30669(String str) {
        TextView textView = this.f37985;
        if (str == null) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            textView.setText(str);
        }
    }

    /* JADX INFO: renamed from: ᩻ */
    public final void m30675() {
        this.f37984.setText(R.string.MT_Protector);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        mo18363();
    }
}
