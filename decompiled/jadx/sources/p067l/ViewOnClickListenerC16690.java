package p067l;

import android.content.DialogInterface;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ܶۜᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: P5WS */
/* JADX INFO: loaded from: classes4.dex */
public final class ViewOnClickListenerC16690 implements View.OnClickListener, TextWatcher {

    /* JADX INFO: renamed from: ۗ */
    public EditText f49156;

    /* JADX INFO: renamed from: ۙ */
    public boolean f49157 = true;

    /* JADX INFO: renamed from: ۛ */
    public final C24738 f49158;

    /* JADX INFO: renamed from: ۤ */
    public TextView f49159;

    /* JADX INFO: renamed from: ۫ */
    public View f49160;

    /* JADX INFO: renamed from: ۬ */
    public EditText f49161;

    /* JADX INFO: renamed from: ᩶ */
    public boolean f49162;

    /* JADX INFO: renamed from: ᩸ */
    public final ActivityC8645 f49163;

    /* JADX INFO: renamed from: ᩹ */
    public DialogInterfaceC2564 f49164;

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public ViewOnClickListenerC16690(ActivityC8645 activityC8645) {
        this.f49163 = activityC8645;
        this.f49158 = activityC8645.f23213;
        View viewM12252 = activityC8645.m12252(R.layout.MT_Protector);
        this.f49156 = (EditText) viewM12252.findViewById(R.id.MT_Protector);
        EditText editText = (EditText) viewM12252.findViewById(R.id.editText2);
        this.f49161 = editText;
        this.f49160 = viewM12252.findViewById(R.id.MT_Protector);
        this.f49159 = (TextView) viewM12252.findViewById(R.id.textView2);
        editText.addTextChangedListener(this);
        int i = DialogInterfaceC2564.f4230;
        C20671 c20671 = new C20671(activityC8645);
        c20671.m46715(viewM12252);
        c20671.m46736(R.string.MT_Protector, null);
        c20671.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        this.f49164 = c20671.m46709();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m37828() {
        C24738 c24738 = this.f49158;
        C20337 c20337 = c24738.f78312;
        boolean z = c20337.mo31474() && c24738.f78320.getTypeName().equals("style");
        this.f49162 = z;
        View view = this.f49160;
        EditText editText = this.f49156;
        if (z) {
            view.setVisibility(0);
            editText.setText(c20337.mo31468());
            this.f49161.setText(String.format("%08X", Integer.valueOf(c20337.getParent())));
        } else {
            view.setVisibility(8);
            editText.setText(c20337.mo31468());
        }
        DialogInterfaceC2564 dialogInterfaceC2564 = this.f49164;
        dialogInterfaceC2564.m3862();
        if (this.f49157) {
            this.f49157 = false;
            dialogInterfaceC2564.m3860().setOnClickListener(this);
            ViewOnClickListenerC16447.m37363(this.f49159);
        }
        C7050.m16226(editText);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        EditText editText = this.f49156;
        String string = editText.getText().toString();
        if (string.isEmpty()) {
            editText.requestFocus();
            C22682.m50793(R.string.MT_Protector);
            return;
        }
        C24738 c24738 = this.f49158;
        C20337 c20337 = c24738.f78312;
        if (this.f49162) {
            EditText editText2 = this.f49161;
            String string2 = editText2.getText().toString();
            if (!C11774.m27005(string2)) {
                editText2.requestFocus();
                C22682.m50793(R.string.MT_Protector);
                return;
            }
            c20337.m45904(C11774.m27008(string2));
        }
        if (!string.equals(c20337.mo31468())) {
            c20337.m45907(string);
        }
        this.f49164.dismiss();
        this.f49163.f23216.notifyDataSetChanged();
        c24738.f78333 = true;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String strM32846;
        String string = editable.toString();
        if (C11774.m27005(string)) {
            strM32846 = this.f49158.f78315.m32846(C11774.m27008(string));
        } else {
            strM32846 = null;
        }
        TextView textView = this.f49159;
        if (strM32846 != null) {
            textView.setText(strM32846);
            if (textView.getVisibility() != 0) {
                textView.setVisibility(0);
                return;
            }
            return;
        }
        if (textView.getVisibility() != 8) {
            textView.setVisibility(8);
        }
    }
}
