package p067l;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Build;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.method.DigitsKeyListener;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ۘۗܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 192I */
/* JADX INFO: loaded from: classes2.dex */
public final class DialogInterfaceOnClickListenerC5863 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ۗ */
    public boolean f14416;

    /* JADX INFO: renamed from: ۙ */
    public final DialogInterfaceC2564 f14417;

    /* JADX INFO: renamed from: ۛ */
    public final EditText f14418;

    /* JADX INFO: renamed from: ۤ */
    public final EditText f14419;

    /* JADX INFO: renamed from: ۨ */
    public final EditText f14420;

    /* JADX INFO: renamed from: ۫ */
    public final EditText f14421;

    /* JADX INFO: renamed from: ۬ */
    public final EditText f14422;

    /* JADX INFO: renamed from: ᩶ */
    public final C12385 f14423;

    /* JADX INFO: renamed from: ᩸ */
    public final boolean f14424;

    /* JADX INFO: renamed from: ᩹ */
    public boolean f14425 = true;

    /* JADX INFO: renamed from: ᩺ */
    public InterfaceC4522 f14426;

    public DialogInterfaceOnClickListenerC5863(Context context, boolean z) {
        this.f14424 = z;
        View viewM12252 = context instanceof AbstractActivityC5549 ? ((AbstractActivityC5549) context).m12252(R.layout.MT_Protector) : LayoutInflater.from(context).inflate(R.layout.MT_Protector, (ViewGroup) null);
        int i = DialogInterfaceC2564.f4230;
        C20671 c20671 = new C20671(context);
        c20671.m46715(viewM12252);
        c20671.m46736(R.string.MT_Protector, this);
        c20671.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        DialogInterfaceC2564 dialogInterfaceC2564M46709 = c20671.m46709();
        this.f14417 = dialogInterfaceC2564M46709;
        C7204.m16545(dialogInterfaceC2564M46709);
        InputMethodManager inputMethodManager = (InputMethodManager) context.getSystemService("input_method");
        C12385 c12385 = (C12385) viewM12252.findViewById(R.id.MT_Protector);
        this.f14423 = c12385;
        c12385.m28500(new C22661(this));
        c12385.setOnFocusChangeListener(new ViewOnFocusChangeListenerC21957(0, inputMethodManager));
        EditText editText = (EditText) viewM12252.findViewById(R.id.MT_Protector);
        this.f14422 = editText;
        EditText editText2 = (EditText) viewM12252.findViewById(R.id.editText2);
        this.f14420 = editText2;
        EditText editText3 = (EditText) viewM12252.findViewById(R.id.editText3);
        this.f14419 = editText3;
        EditText editText4 = (EditText) viewM12252.findViewById(R.id.editText4);
        this.f14421 = editText4;
        EditText editText5 = (EditText) viewM12252.findViewById(R.id.MT_Protector);
        this.f14418 = editText5;
        if (!z) {
            c12385.m28501();
            viewM12252.findViewById(R.id.text1).setVisibility(8);
            editText.setVisibility(8);
        }
        editText5.setFilters(new InputFilter[]{new InputFilter.LengthFilter(z ? 8 : 6), DigitsKeyListener.getInstance("0123456789abcdefABCDEF"), C6801.f17659});
        ViewOnFocusChangeListenerC11228 viewOnFocusChangeListenerC11228 = new ViewOnFocusChangeListenerC11228();
        editText.setOnFocusChangeListener(viewOnFocusChangeListenerC11228);
        editText2.setOnFocusChangeListener(viewOnFocusChangeListenerC11228);
        editText3.setOnFocusChangeListener(viewOnFocusChangeListenerC11228);
        editText4.setOnFocusChangeListener(viewOnFocusChangeListenerC11228);
        editText5.setOnFocusChangeListener(viewOnFocusChangeListenerC11228);
        C10557 c10557 = new C10557(this);
        editText.addTextChangedListener(c10557);
        editText2.addTextChangedListener(c10557);
        editText3.addTextChangedListener(c10557);
        editText4.addTextChangedListener(c10557);
        editText5.addTextChangedListener(new C17261(this));
        if (context instanceof Activity) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            dialogInterfaceC2564M46709.m3858().setType(2038);
        } else {
            dialogInterfaceC2564M46709.m3858().setType(2003);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m13151(DialogInterfaceOnClickListenerC5863 dialogInterfaceOnClickListenerC5863, int i) {
        dialogInterfaceOnClickListenerC5863.m13150(i, true);
        if (dialogInterfaceOnClickListenerC5863.f14425) {
            DialogInterfaceC2564 dialogInterfaceC2564 = dialogInterfaceOnClickListenerC5863.f14417;
            dialogInterfaceOnClickListenerC5863.f14425 = false;
            dialogInterfaceC2564.m3854(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫ */
    public void m13150(int i, boolean z) {
        EditText editText = this.f14422;
        if (z || !editText.isFocused()) {
            String strValueOf = String.valueOf(Math.round((Color.alpha(i) * 100.0f) / 255.0f));
            if (!TextUtils.equals(strValueOf, editText.getText())) {
                this.f14416 = true;
                editText.setText(strValueOf);
                this.f14416 = false;
            }
        }
        EditText editText2 = this.f14420;
        if (z || !editText2.isFocused()) {
            String strValueOf2 = String.valueOf(Color.red(i));
            if (!TextUtils.equals(strValueOf2, editText2.getText())) {
                this.f14416 = true;
                editText2.setText(strValueOf2);
                this.f14416 = false;
            }
        }
        EditText editText3 = this.f14419;
        if (z || !editText3.isFocused()) {
            String strValueOf3 = String.valueOf(Color.green(i));
            if (!TextUtils.equals(strValueOf3, editText3.getText())) {
                this.f14416 = true;
                editText3.setText(strValueOf3);
                this.f14416 = false;
            }
        }
        EditText editText4 = this.f14421;
        if (z || !editText4.isFocused()) {
            String strValueOf4 = String.valueOf(Color.blue(i));
            if (!TextUtils.equals(strValueOf4, editText4.getText())) {
                this.f14416 = true;
                editText4.setText(strValueOf4);
                this.f14416 = false;
            }
        }
        EditText editText5 = this.f14418;
        if (z || !editText5.isFocused()) {
            String strSubstring = String.format("%08X", Integer.valueOf(i));
            if (!this.f14424) {
                strSubstring = strSubstring.substring(2);
            }
            if (TextUtils.equals(strSubstring, editText5.getText())) {
                return;
            }
            this.f14416 = true;
            editText5.setText(strSubstring);
            this.f14416 = false;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m13163(InterfaceC4522 interfaceC4522) {
        this.f14426 = interfaceC4522;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m13162(int i) {
        if (!this.f14424) {
            i |= -16777216;
        }
        this.f14423.m28499(i);
        m13150(i, true);
        this.f14417.m3862();
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        InterfaceC4522 interfaceC4522 = this.f14426;
        if (interfaceC4522 != null) {
            interfaceC4522.mo9575(this.f14423.m28498());
        }
    }
}
