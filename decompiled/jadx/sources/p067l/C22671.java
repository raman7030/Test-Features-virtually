package p067l;

import android.content.Context;
import android.content.DialogInterface;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.᩸ۙ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: N9TB */
/* JADX INFO: loaded from: classes5.dex */
public class C22671 extends AbstractC5907 {
    public C22671(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m9024((InterfaceC9544) new C8618(this));
    }

    public C22671(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m9024((InterfaceC9544) new C8618(this));
    }

    public C22671(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m9024((InterfaceC9544) new C8618(this));
    }

    public C22671(Context context) {
        super(context);
        m9024((InterfaceC9544) new C8618(this));
    }

    @Override // p067l.AbstractC5907
    /* JADX INFO: renamed from: ֫ */
    public final void mo8363(AbstractActivityC5549 abstractActivityC5549) {
        m50736(abstractActivityC5549, m9035(), m13265().getString(m9037(), "10MB"), new C13799(2, this));
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m50737(C22671 c22671, String str) {
        try {
            c22671.m13265().edit().putString(c22671.m9037(), str).apply();
            c22671.mo9048();
            C19378.m44121();
        } catch (NumberFormatException unused) {
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m50736(AbstractActivityC5549 abstractActivityC5549, CharSequence charSequence, String str, InterfaceC1489 interfaceC1489) {
        View viewM12252 = abstractActivityC5549.m12252(R.layout.MT_Protector);
        EditText editText = (EditText) viewM12252.findViewById(R.id.MT_Protector);
        Spinner spinner = (Spinner) viewM12252.findViewById(R.id.spinner);
        spinner.setAdapter((SpinnerAdapter) new C21438(abstractActivityC5549, new String[]{"MB", "KB"}));
        if (str.endsWith("KB")) {
            spinner.setSelection(1);
        }
        try {
            editText.setText(String.valueOf(Integer.parseInt(str.substring(0, str.length() - 2))));
        } catch (NumberFormatException unused) {
            editText.setText("10");
            spinner.setSelection(0);
        }
        editText.selectAll();
        C20671 c20671BuildDialog = abstractActivityC5549.buildDialog();
        c20671BuildDialog.m46730(charSequence);
        c20671BuildDialog.m46715(viewM12252);
        c20671BuildDialog.m46736(R.string.MT_Protector, new DialogInterfaceOnClickListenerC4006(editText, spinner, interfaceC1489, 1));
        c20671BuildDialog.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c20671BuildDialog.m46732();
        C7050.m16226(editText);
    }
}
