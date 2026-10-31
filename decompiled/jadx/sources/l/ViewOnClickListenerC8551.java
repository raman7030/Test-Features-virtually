package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۡ֨ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: D1Y9 */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewOnClickListenerC8551 implements View.OnClickListener {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C16560 f26144;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public TextView f26145;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public DialogInterfaceC0206 f26146;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C10235 f26147;

    public ViewOnClickListenerC8551(C16560 c16560) {
        this.f26144 = c16560;
        View viewM10216 = c16560.m39056().m10216(R.layout.MT_Protector);
        ((TextView) viewM10216.findViewById(R.id.MT_Protector)).setText(R.string.MT_Protector);
        C10235 c10235 = (C10235) viewM10216.findViewById(R.id.MT_Protector);
        this.f26147 = c10235;
        this.f26145 = (TextView) viewM10216.findViewById(R.id.MT_Protector);
        c10235.m30313(new C9257(this));
        C19258 c19258BuildDialog = c16560.m39056().buildDialog();
        c19258BuildDialog.m44421(viewM10216);
        c19258BuildDialog.m44442(R.string.MT_Protector, null);
        c19258BuildDialog.m44434(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c19258BuildDialog.m44440(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c19258BuildDialog.m44428(false);
        DialogInterfaceC0206 dialogInterfaceC0206M44415 = c19258BuildDialog.m44415();
        this.f26146 = dialogInterfaceC0206M44415;
        C5088.m14637(dialogInterfaceC0206M44415);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m22273() {
        DialogInterfaceC0206 dialogInterfaceC0206 = this.f26146;
        dialogInterfaceC0206.m1449();
        dialogInterfaceC0206.m1447().setOnClickListener(this);
        dialogInterfaceC0206.m1446().setOnClickListener(this);
        C4925.m14329(this.f26147);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String string = this.f26147.m30436().toString();
        if (string.isEmpty()) {
            return;
        }
        boolean zContains = string.contains("/");
        boolean z = view.getId() == 16908313;
        boolean zContains2 = string.contains("\\");
        TextView textView = this.f26145;
        if (zContains2 || string.equals("/")) {
            textView.setVisibility(0);
            textView.setText(R.string.MT_Protector);
            return;
        }
        C16560 c16560 = this.f26144;
        if (!zContains) {
            boolean zMo13919 = c16560.m39044().mo6020().mo13919();
            for (InterfaceC17889 interfaceC17889 : c16560.m39028()) {
                String name = interfaceC17889.getName();
                if (zMo13919 ? name.equalsIgnoreCase(string) : name.equals(string)) {
                    if (interfaceC17889.isDirectory()) {
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
            c16560.m39044().mo15161(c16560, string, z);
            this.f26146.dismiss();
        } catch (C1637 e) {
            String message = e.getMessage();
            textView.setVisibility(0);
            textView.setText(message);
        }
    }
}
