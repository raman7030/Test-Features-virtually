package l;

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
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۘۗܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 192I */
/* JADX INFO: loaded from: classes2.dex */
public final class DialogInterfaceOnClickListenerC3677 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public boolean f11612;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final DialogInterfaceC0206 f11613;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final EditText f11614;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final EditText f11615;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final EditText f11616;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final EditText f11617;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final EditText f11618;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C10539 f11619;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean f11620;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f11621 = true;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public InterfaceC2266 f11622;

    public DialogInterfaceOnClickListenerC3677(Context context, boolean z) {
        this.f11620 = z;
        View viewM10216 = context instanceof AbstractActivityC3346 ? ((AbstractActivityC3346) context).m10216(R.layout.MT_Protector) : LayoutInflater.from(context).inflate(R.layout.MT_Protector, (ViewGroup) null);
        int i = DialogInterfaceC0206.f1451;
        C19258 c19258 = new C19258(context);
        c19258.m44421(viewM10216);
        c19258.m44442(R.string.MT_Protector, this);
        c19258.m44434(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        DialogInterfaceC0206 dialogInterfaceC0206M44415 = c19258.m44415();
        this.f11613 = dialogInterfaceC0206M44415;
        C5088.m14637(dialogInterfaceC0206M44415);
        InputMethodManager inputMethodManager = (InputMethodManager) context.getSystemService("input_method");
        C10539 c10539 = (C10539) viewM10216.findViewById(R.id.MT_Protector);
        this.f11619 = c10539;
        c10539.m26467(new C21352(this));
        c10539.setOnFocusChangeListener(new ViewOnFocusChangeListenerC20611(0, inputMethodManager));
        EditText editText = (EditText) viewM10216.findViewById(R.id.MT_Protector);
        this.f11618 = editText;
        EditText editText2 = (EditText) viewM10216.findViewById(R.id.editText2);
        this.f11616 = editText2;
        EditText editText3 = (EditText) viewM10216.findViewById(R.id.editText3);
        this.f11615 = editText3;
        EditText editText4 = (EditText) viewM10216.findViewById(R.id.editText4);
        this.f11617 = editText4;
        EditText editText5 = (EditText) viewM10216.findViewById(R.id.MT_Protector);
        this.f11614 = editText5;
        if (!z) {
            c10539.m26468();
            viewM10216.findViewById(R.id.text1).setVisibility(8);
            editText.setVisibility(8);
        }
        editText5.setFilters(new InputFilter[]{new InputFilter.LengthFilter(z ? 8 : 6), DigitsKeyListener.getInstance("0123456789abcdefABCDEF"), C4664.f14829});
        ViewOnFocusChangeListenerC9322 viewOnFocusChangeListenerC9322 = new ViewOnFocusChangeListenerC9322();
        editText.setOnFocusChangeListener(viewOnFocusChangeListenerC9322);
        editText2.setOnFocusChangeListener(viewOnFocusChangeListenerC9322);
        editText3.setOnFocusChangeListener(viewOnFocusChangeListenerC9322);
        editText4.setOnFocusChangeListener(viewOnFocusChangeListenerC9322);
        editText5.setOnFocusChangeListener(viewOnFocusChangeListenerC9322);
        C8616 c8616 = new C8616(this);
        editText.addTextChangedListener(c8616);
        editText2.addTextChangedListener(c8616);
        editText3.addTextChangedListener(c8616);
        editText4.addTextChangedListener(c8616);
        editText5.addTextChangedListener(new C15670(this));
        if (context instanceof Activity) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            dialogInterfaceC0206M44415.m1445().setType(2038);
        } else {
            dialogInterfaceC0206M44415.m1445().setType(2003);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m11191(DialogInterfaceOnClickListenerC3677 dialogInterfaceOnClickListenerC3677, int i) {
        dialogInterfaceOnClickListenerC3677.m11190(i, true);
        if (dialogInterfaceOnClickListenerC3677.f11621) {
            DialogInterfaceC0206 dialogInterfaceC0206 = dialogInterfaceOnClickListenerC3677.f11613;
            dialogInterfaceOnClickListenerC3677.f11621 = false;
            dialogInterfaceC0206.m1441(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m11190(int i, boolean z) {
        EditText editText = this.f11618;
        if (z || !editText.isFocused()) {
            String strValueOf = String.valueOf(Math.round((Color.alpha(i) * 100.0f) / 255.0f));
            if (!TextUtils.equals(strValueOf, editText.getText())) {
                this.f11612 = true;
                editText.setText(strValueOf);
                this.f11612 = false;
            }
        }
        EditText editText2 = this.f11616;
        if (z || !editText2.isFocused()) {
            String strValueOf2 = String.valueOf(Color.red(i));
            if (!TextUtils.equals(strValueOf2, editText2.getText())) {
                this.f11612 = true;
                editText2.setText(strValueOf2);
                this.f11612 = false;
            }
        }
        EditText editText3 = this.f11615;
        if (z || !editText3.isFocused()) {
            String strValueOf3 = String.valueOf(Color.green(i));
            if (!TextUtils.equals(strValueOf3, editText3.getText())) {
                this.f11612 = true;
                editText3.setText(strValueOf3);
                this.f11612 = false;
            }
        }
        EditText editText4 = this.f11617;
        if (z || !editText4.isFocused()) {
            String strValueOf4 = String.valueOf(Color.blue(i));
            if (!TextUtils.equals(strValueOf4, editText4.getText())) {
                this.f11612 = true;
                editText4.setText(strValueOf4);
                this.f11612 = false;
            }
        }
        EditText editText5 = this.f11614;
        if (z || !editText5.isFocused()) {
            String strSubstring = String.format("%08X", Integer.valueOf(i));
            if (!this.f11620) {
                strSubstring = strSubstring.substring(2);
            }
            if (TextUtils.equals(strSubstring, editText5.getText())) {
                return;
            }
            this.f11612 = true;
            editText5.setText(strSubstring);
            this.f11612 = false;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m11203(InterfaceC2266 interfaceC2266) {
        this.f11622 = interfaceC2266;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m11202(int i) {
        if (!this.f11620) {
            i |= -16777216;
        }
        this.f11619.m26466(i);
        m11190(i, true);
        this.f11613.m1449();
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        InterfaceC2266 interfaceC2266 = this.f11622;
        if (interfaceC2266 != null) {
            interfaceC2266.mo7493(this.f11619.m26465());
        }
    }
}
