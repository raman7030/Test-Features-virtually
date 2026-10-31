package l;

import android.content.DialogInterface;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܶۜᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: P5WS */
/* JADX INFO: loaded from: classes4.dex */
public final class ViewOnClickListenerC15069 implements View.OnClickListener, TextWatcher {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public EditText f46038;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f46039 = true;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final C23537 f46040;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public TextView f46041;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public View f46042;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public EditText f46043;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f46044;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final ActivityC6604 f46045;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public DialogInterfaceC0206 f46046;

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public ViewOnClickListenerC15069(ActivityC6604 activityC6604) {
        this.f46045 = activityC6604;
        this.f46040 = activityC6604.f20336;
        View viewM10216 = activityC6604.m10216(R.layout.MT_Protector);
        this.f46038 = (EditText) viewM10216.findViewById(R.id.MT_Protector);
        EditText editText = (EditText) viewM10216.findViewById(R.id.editText2);
        this.f46043 = editText;
        this.f46042 = viewM10216.findViewById(R.id.MT_Protector);
        this.f46041 = (TextView) viewM10216.findViewById(R.id.textView2);
        editText.addTextChangedListener(this);
        int i = DialogInterfaceC0206.f1451;
        C19258 c19258 = new C19258(activityC6604);
        c19258.m44421(viewM10216);
        c19258.m44442(R.string.MT_Protector, null);
        c19258.m44434(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        this.f46046 = c19258.m44415();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m35670() {
        C23537 c23537 = this.f46040;
        C18906 c18906 = c23537.f75566;
        boolean z = c18906.mo29412() && c23537.f75574.getTypeName().equals("style");
        this.f46044 = z;
        View view = this.f46042;
        EditText editText = this.f46038;
        if (z) {
            view.setVisibility(0);
            editText.setText(c18906.mo29406());
            this.f46043.setText(String.format("%08X", Integer.valueOf(c18906.getParent())));
        } else {
            view.setVisibility(8);
            editText.setText(c18906.mo29406());
        }
        DialogInterfaceC0206 dialogInterfaceC0206 = this.f46046;
        dialogInterfaceC0206.m1449();
        if (this.f46039) {
            this.f46039 = false;
            dialogInterfaceC0206.m1447().setOnClickListener(this);
            ViewOnClickListenerC14813.m35215(this.f46041);
        }
        C4925.m14329(editText);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        EditText editText = this.f46038;
        String string = editText.getText().toString();
        if (string.isEmpty()) {
            editText.requestFocus();
            C21374.m48457(R.string.MT_Protector);
            return;
        }
        C23537 c23537 = this.f46040;
        C18906 c18906 = c23537.f75566;
        if (this.f46044) {
            EditText editText2 = this.f46043;
            String string2 = editText2.getText().toString();
            if (!C9896.m24990(string2)) {
                editText2.requestFocus();
                C21374.m48457(R.string.MT_Protector);
                return;
            }
            c18906.m43638(C9896.m24993(string2));
        }
        if (!string.equals(c18906.mo29406())) {
            c18906.m43641(string);
        }
        this.f46046.dismiss();
        this.f46045.f20339.notifyDataSetChanged();
        c23537.f75587 = true;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String strM30774;
        String string = editable.toString();
        if (C9896.m24990(string)) {
            strM30774 = this.f46040.f75569.m30774(C9896.m24993(string));
        } else {
            strM30774 = null;
        }
        TextView textView = this.f46041;
        if (strM30774 != null) {
            textView.setText(strM30774);
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
