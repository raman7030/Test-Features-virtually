package p067l;

import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import bin.p000mt.plus.R;
import com.google.android.material.textfield.TextInputLayout;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܶ۬ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: H5EO */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC16864 {

    /* JADX INFO: renamed from: ֫ */
    public final AbstractActivityC5549 f49946;

    /* JADX INFO: renamed from: ۧ */
    public final DialogInterfaceC2564 f49947;

    /* JADX INFO: renamed from: ܳ */
    public final TextView f49948;

    /* JADX INFO: renamed from: ܿ */
    public final LinearLayout f49950;

    /* JADX INFO: renamed from: ᩳ */
    public final ArrayList f49951 = new ArrayList();

    /* JADX INFO: renamed from: ܽ */
    public boolean f49949 = true;

    /* JADX INFO: renamed from: ܽ */
    public abstract boolean mo6304();

    public AbstractC16864(AbstractActivityC5549 abstractActivityC5549) {
        this.f49946 = abstractActivityC5549;
        View viewM12252 = abstractActivityC5549.m12252(R.layout.MT_Protector);
        this.f49950 = (LinearLayout) viewM12252.findViewById(R.id.MT_Protector);
        this.f49948 = (TextView) viewM12252.findViewById(R.id.MT_Protector);
        int i = DialogInterfaceC2564.f4230;
        C20671 c20671 = new C20671(abstractActivityC5549);
        c20671.m46715(viewM12252);
        c20671.m46736(R.string.MT_Protector, null);
        c20671.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        this.f49947 = c20671.m46709();
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m38423() {
        DialogInterfaceC2564 dialogInterfaceC2564 = this.f49947;
        dialogInterfaceC2564.m3862();
        if (this.f49949) {
            this.f49949 = false;
            dialogInterfaceC2564.m3860().setOnClickListener(new ViewOnClickListenerC12766(1, this));
            dialogInterfaceC2564.m3859().setOnClickListener(new ViewOnClickListenerC4464(1, this));
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m38412(AbstractC16864 abstractC16864) {
        if (abstractC16864.mo6304()) {
            abstractC16864.f49947.dismiss();
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static /* synthetic */ void m38413(AbstractC16864 abstractC16864) {
        ArrayList arrayList = abstractC16864.f49951;
        if (arrayList.isEmpty()) {
            return;
        }
        EditText editText = ((TextInputLayout) arrayList.get(0)).getEditText();
        C12826.requireNonNull(editText);
        editText.requestFocus();
        InputMethodManager inputMethodManager = (InputMethodManager) editText.getContext().getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(editText, 0);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final Button m38419() {
        if (this.f49949) {
            throw new NullPointerException("Please call show la least once");
        }
        return this.f49947.m3860();
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m38421(int i) {
        this.f49948.setText(i);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m38418(int... iArr) {
        for (int i : iArr) {
            m38417(i, null);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m38417(int i, String str) {
        AbstractActivityC5549 abstractActivityC5549 = this.f49946;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(abstractActivityC5549);
        ViewGroup viewGroup = this.f49950;
        TextInputLayout textInputLayout = (TextInputLayout) layoutInflaterFrom.inflate(R.layout.MT_Protector, viewGroup, false);
        viewGroup.addView(textInputLayout);
        this.f49951.add(textInputLayout);
        EditText editText = textInputLayout.getEditText();
        if (str != null && editText != null) {
            editText.setText(str);
        }
        textInputLayout.setHint(abstractActivityC5549.getString(i));
    }

    /* JADX INFO: renamed from: ۧ */
    public final TextInputLayout m38420(int i) {
        return (TextInputLayout) this.f49951.get(i);
    }

    /* JADX INFO: renamed from: ֫ */
    public final EditText m38415(int i) {
        EditText editText = ((TextInputLayout) this.f49951.get(i)).getEditText();
        C12826.requireNonNull(editText);
        return editText;
    }

    /* JADX INFO: renamed from: ܿ */
    public final int m38422() {
        return this.f49951.size();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m38416() {
        this.f49947.dismiss();
    }
}
