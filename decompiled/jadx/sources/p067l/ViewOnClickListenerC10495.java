package p067l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.TextView;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ۡ֨ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: D1Y9 */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewOnClickListenerC10495 implements View.OnClickListener {

    /* JADX INFO: renamed from: ۙ */
    public C18107 f29059;

    /* JADX INFO: renamed from: ᩶ */
    public TextView f29060;

    /* JADX INFO: renamed from: ᩸ */
    public DialogInterfaceC2564 f29061;

    /* JADX INFO: renamed from: ᩹ */
    public C12096 f29062;

    public ViewOnClickListenerC10495(C18107 c18107) {
        this.f29059 = c18107;
        View viewM12252 = c18107.m41282().m12252(R.layout.MT_Protector);
        ((TextView) viewM12252.findViewById(R.id.MT_Protector)).setText(R.string.MT_Protector);
        C12096 c12096 = (C12096) viewM12252.findViewById(R.id.MT_Protector);
        this.f29062 = c12096;
        this.f29060 = (TextView) viewM12252.findViewById(R.id.MT_Protector);
        c12096.m32377(new C11166(this));
        C20671 c20671BuildDialog = c18107.m41282().buildDialog();
        c20671BuildDialog.m46715(viewM12252);
        c20671BuildDialog.m46736(R.string.MT_Protector, null);
        c20671BuildDialog.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c20671BuildDialog.m46734(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c20671BuildDialog.m46722(false);
        DialogInterfaceC2564 dialogInterfaceC2564M46709 = c20671BuildDialog.m46709();
        this.f29061 = dialogInterfaceC2564M46709;
        C7204.m16545(dialogInterfaceC2564M46709);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m24241() {
        DialogInterfaceC2564 dialogInterfaceC2564 = this.f29061;
        dialogInterfaceC2564.m3862();
        dialogInterfaceC2564.m3860().setOnClickListener(this);
        dialogInterfaceC2564.m3859().setOnClickListener(this);
        C7050.m16226(this.f29062);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String string = this.f29062.m32500().toString();
        if (string.isEmpty()) {
            return;
        }
        boolean zContains = string.contains("/");
        boolean z = view.getId() == 16908313;
        boolean zContains2 = string.contains("\\");
        TextView textView = this.f29060;
        if (zContains2 || string.equals("/")) {
            textView.setVisibility(0);
            textView.setText(R.string.MT_Protector);
            return;
        }
        C18107 c18107 = this.f29059;
        if (!zContains) {
            boolean zMo15799 = c18107.m41270().mo8217().mo15799();
            for (InterfaceC19370 interfaceC19370 : c18107.m41254()) {
                String name = interfaceC19370.getName();
                if (zMo15799 ? name.equalsIgnoreCase(string) : name.equals(string)) {
                    if (interfaceC19370.isDirectory()) {
                        if (z) {
                            textView.setVisibility(0);
                            textView.setText(R.string.MT_Protector);
                            return;
                        } else {
                            textView.setVisibility(0);
                            textView.setText(R.string.MT_Protector);
                            return;
                        }
                    }
                    if (z) {
                        textView.setVisibility(0);
                        textView.setText(R.string.MT_Protector);
                        return;
                    } else {
                        textView.setVisibility(0);
                        textView.setText(R.string.MT_Protector);
                        return;
                    }
                }
            }
        }
        try {
            c18107.m41270().mo17064(c18107, string, z);
            this.f29061.dismiss();
        } catch (C3924 e) {
            String message = e.getMessage();
            textView.setVisibility(0);
            textView.setText(message);
        }
    }
}
