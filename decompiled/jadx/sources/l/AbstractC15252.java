package l;

import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import bin.mt.plus.R;
import com.google.android.material.textfield.TextInputLayout;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܶ۬ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: H5EO */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC15252 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractActivityC3346 f46822;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final DialogInterfaceC0206 f46823;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final TextView f46824;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final LinearLayout f46826;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final ArrayList f46827 = new ArrayList();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f46825 = true;

    /* JADX INFO: renamed from: ܽ */
    public abstract boolean mo4060();

    public AbstractC15252(AbstractActivityC3346 abstractActivityC3346) {
        this.f46822 = abstractActivityC3346;
        View viewM10216 = abstractActivityC3346.m10216(R.layout.MT_Protector);
        this.f46826 = (LinearLayout) viewM10216.findViewById(R.id.MT_Protector);
        this.f46824 = (TextView) viewM10216.findViewById(R.id.MT_Protector);
        int i = DialogInterfaceC0206.f1451;
        C19258 c19258 = new C19258(abstractActivityC3346);
        c19258.m44421(viewM10216);
        c19258.m44442(R.string.MT_Protector, null);
        c19258.m44434(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        this.f46823 = c19258.m44415();
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m36262() {
        DialogInterfaceC0206 dialogInterfaceC0206 = this.f46823;
        dialogInterfaceC0206.m1449();
        if (this.f46825) {
            this.f46825 = false;
            dialogInterfaceC0206.m1447().setOnClickListener(new ViewOnClickListenerC10940(1, this));
            dialogInterfaceC0206.m1446().setOnClickListener(new ViewOnClickListenerC2205(1, this));
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m36251(AbstractC15252 abstractC15252) {
        if (abstractC15252.mo4060()) {
            abstractC15252.f46823.dismiss();
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m36252(AbstractC15252 abstractC15252) {
        ArrayList arrayList = abstractC15252.f46827;
        if (arrayList.isEmpty()) {
            return;
        }
        EditText editText = ((TextInputLayout) arrayList.get(0)).getEditText();
        C11003.requireNonNull(editText);
        editText.requestFocus();
        InputMethodManager inputMethodManager = (InputMethodManager) editText.getContext().getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(editText, 0);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Button m36258() {
        if (this.f46825) {
            throw new NullPointerException("Please call show la least once");
        }
        return this.f46823.m1447();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m36260(int i) {
        this.f46824.setText(i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36257(int... iArr) {
        for (int i : iArr) {
            m36256(i, null);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36256(int i, String str) {
        AbstractActivityC3346 abstractActivityC3346 = this.f46822;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(abstractActivityC3346);
        ViewGroup viewGroup = this.f46826;
        TextInputLayout textInputLayout = (TextInputLayout) layoutInflaterFrom.inflate(R.layout.MT_Protector, viewGroup, false);
        viewGroup.addView(textInputLayout);
        this.f46827.add(textInputLayout);
        EditText editText = textInputLayout.getEditText();
        if (str != null && editText != null) {
            editText.setText(str);
        }
        textInputLayout.setHint(abstractActivityC3346.getString(i));
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final TextInputLayout m36259(int i) {
        return (TextInputLayout) this.f46827.get(i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final EditText m36254(int i) {
        EditText editText = ((TextInputLayout) this.f46827.get(i)).getEditText();
        C11003.requireNonNull(editText);
        return editText;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int m36261() {
        return this.f46827.size();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36255() {
        this.f46823.dismiss();
    }
}
