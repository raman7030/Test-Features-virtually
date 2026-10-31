package l;

import android.content.DialogInterface;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import bin.mt.plus.R;
import com.umeng.analytics.pro.o;

/* JADX INFO: renamed from: l.᩶ۜᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: T5VF */
/* JADX INFO: loaded from: classes4.dex */
public final class ViewOnClickListenerC20010 implements View.OnClickListener, AdapterView.OnItemSelectedListener, TextWatcher {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public DialogInterfaceC0206 f64813;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public EditText f64814;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public Spinner f64815;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public TextView f64816;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public EditText f64817;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public View f64818;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public boolean f64819 = true;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C23537 f64820;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final DialogInterfaceOnClickListenerC3677 f64821;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f64822;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final ActivityC6604 f64823;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public TextView f64824;

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public ViewOnClickListenerC20010(ActivityC6604 activityC6604) {
        this.f64823 = activityC6604;
        this.f64820 = activityC6604.f20336;
        View viewM10216 = activityC6604.m10216(R.layout.MT_Protector);
        this.f64814 = (EditText) viewM10216.findViewById(R.id.MT_Protector);
        EditText editText = (EditText) viewM10216.findViewById(R.id.editText2);
        this.f64817 = editText;
        this.f64824 = (TextView) viewM10216.findViewById(R.id.textView2);
        TextView textView = (TextView) viewM10216.findViewById(R.id.MT_Protector);
        this.f64816 = textView;
        Spinner spinner = (Spinner) viewM10216.findViewById(R.id.spinner);
        this.f64815 = spinner;
        this.f64818 = viewM10216.findViewById(R.id.MT_Protector);
        DialogInterfaceOnClickListenerC3677 dialogInterfaceOnClickListenerC3677 = new DialogInterfaceOnClickListenerC3677(activityC6604, true);
        dialogInterfaceOnClickListenerC3677.m11203(new InterfaceC2266() { // from class: l.᩹ۜᩳ
            @Override // l.InterfaceC2266
            /* JADX INFO: renamed from: ۧ */
            public final void mo7493(int i) {
                this.f71820.f64814.setText(String.format("%08X", Integer.valueOf(i)));
            }
        });
        this.f64821 = dialogInterfaceOnClickListenerC3677;
        C19258 c19258 = new C19258(activityC6604);
        c19258.m44421(viewM10216);
        c19258.m44442(R.string.MT_Protector, null);
        c19258.m44434(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c19258.m44440(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        this.f64813 = c19258.m44415();
        spinner.setOnItemSelectedListener(this);
        editText.addTextChangedListener(this);
        ViewOnClickListenerC14813.m35215(textView);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m46148() {
        m46149(null, 0, 0, false);
        C4925.m14329(this.f64814);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m46149(String str, int i, int i2, boolean z) {
        String strM30772;
        this.f64822 = z;
        C23537 c23537 = this.f64820;
        boolean zMo29412 = c23537.f75566.mo29412();
        View view = this.f64818;
        if (zMo29412) {
            view.setVisibility(0);
            EditText editText = this.f64817;
            if (z) {
                editText.setText(String.format("%08X", Integer.valueOf(i)));
            } else {
                editText.setText(String.format("%08X", Integer.valueOf(c23537.f75576.mo5006())));
            }
        } else {
            view.setVisibility(8);
        }
        DialogInterfaceC0206 dialogInterfaceC0206 = this.f64813;
        dialogInterfaceC0206.m1449();
        if (this.f64819) {
            this.f64819 = false;
            dialogInterfaceC0206.m1447().setOnClickListener(this);
            dialogInterfaceC0206.m1448().setOnClickListener(this);
            C8960.m23097(dialogInterfaceC0206);
            ViewOnClickListenerC14813.m35215(this.f64824);
        }
        TextView textView = this.f64816;
        Spinner spinner = this.f64815;
        EditText editText2 = this.f64814;
        if (!z) {
            EnumC4487 enumC4487M52000 = c23537.m52000();
            if (enumC4487M52000 == EnumC4487.ENTRY || enumC4487M52000 == EnumC4487.SEARCH_BY_ID_IN || enumC4487M52000 == EnumC4487.SEARCH_VALUE_IN) {
                strM30772 = c23537.f75569.m30772(c23537.f75576.mo5006());
            } else {
                strM30772 = c23537.f75566.mo29406();
            }
            textView.setText(strM30772);
            C4794 c4794 = c23537.f75576;
            int iMo5004 = c4794.mo5004();
            switch (iMo5004) {
                case 1:
                    spinner.setSelection(1);
                    editText2.setText(String.format("%08X", Integer.valueOf(c4794.getValue())));
                    break;
                case 2:
                case 8:
                    spinner.setSelection(2);
                    editText2.setText(String.format("%08X", Integer.valueOf(c4794.getValue())));
                    break;
                case 3:
                    spinner.setSelection(0);
                    editText2.setText(c4794.mo5008().getValue());
                    break;
                case 4:
                    spinner.setSelection(7);
                    editText2.setText(C0253.m1519(c4794.getValue()));
                    break;
                case 5:
                    spinner.setSelection(8);
                    editText2.setText(C3213.m9856(c4794.getValue(), 1) + C3213.f10105[c4794.getValue() & 15]);
                    break;
                case 6:
                    spinner.setSelection(9);
                    int value = c4794.getValue() & 15;
                    editText2.setText(C3213.m9856(c4794.getValue(), C3213.f10106[value]) + C3213.f10107[value]);
                    break;
                case 7:
                    spinner.setSelection(10);
                    editText2.setText(String.format("%08X", Integer.valueOf(c4794.getValue())));
                    break;
                default:
                    switch (iMo5004) {
                        case 16:
                            spinner.setSelection(4);
                            editText2.setText(String.valueOf(c4794.getValue()));
                            break;
                        case 17:
                            spinner.setSelection(5);
                            editText2.setText(String.format("%X", Integer.valueOf(c4794.getValue())));
                            break;
                        case 18:
                            spinner.setSelection(6);
                            editText2.setText(c4794.getValue() != 0 ? "true" : "false");
                            break;
                        default:
                            switch (iMo5004) {
                                case 28:
                                case 29:
                                case 30:
                                case 31:
                                    spinner.setSelection(3);
                                    editText2.setText(String.format("%08X", Integer.valueOf(c4794.getValue())));
                                    break;
                                default:
                                    spinner.setSelection(-1);
                                    editText2.setText("Unknown type");
                                    break;
                            }
                            break;
                    }
                    break;
            }
        } else {
            textView.setText(R.string.MT_Protector);
            spinner.setSelection(i2);
            editText2.setText(str);
        }
        editText2.requestFocus();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m46147(String str) {
        if (C9896.m24990(str)) {
            return true;
        }
        this.f64814.requestFocus();
        C21374.m48457(R.string.MT_Protector);
        return false;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int id = view.getId();
        EditText editText = this.f64814;
        if (id == 16908313) {
            String string = editText.getText().toString();
            EditText editText2 = this.f64817;
            String string2 = editText2.getText().toString();
            C23537 c23537 = this.f64820;
            if (c23537.f75566.mo29412() && !C9896.m24990(string2)) {
                editText2.requestFocus();
                C21374.m48457(R.string.MT_Protector);
                return;
            }
            if (this.f64822) {
                c23537.f75576 = new C4794(c23537.f75566, 0, 0, -1);
            }
            C4794 c4794 = c23537.f75576;
            int selectedItemPosition = this.f64815.getSelectedItemPosition();
            DialogInterfaceC0206 dialogInterfaceC0206 = this.f64813;
            switch (selectedItemPosition) {
                case 0:
                    c4794.m13996(string, null);
                    break;
                case 1:
                    if (!m46147(string)) {
                        return;
                    }
                    c4794.m13995(C9896.m24993(string));
                    c4794.m13998(1);
                    break;
                case 2:
                    if (!m46147(string)) {
                        return;
                    }
                    c4794.m13995(C9896.m24993(string));
                    c4794.m13998(2);
                    break;
                case 3:
                    if (!m46147(string)) {
                        return;
                    }
                    c4794.m13995(C9896.m24993(string));
                    c4794.m13998(28);
                    break;
                case 4:
                    try {
                        c4794.m13995(Integer.parseInt(string));
                        c4794.m13998(16);
                    } catch (NumberFormatException unused) {
                        editText.requestFocus();
                        C21374.m48457(R.string.MT_Protector);
                        return;
                    }
                    break;
                case 5:
                    if (!m46147(string)) {
                        return;
                    }
                    c4794.m13995(C9896.m24993(string));
                    c4794.m13998(17);
                    break;
                case 6:
                    if (!string.equals("true") && !string.equals("false")) {
                        editText.requestFocus();
                        C21374.m48457(R.string.MT_Protector);
                        return;
                    } else {
                        c4794.m13995(string.equals("true") ? 1 : 0);
                        c4794.m13998(18);
                    }
                    break;
                case 7:
                    try {
                        c4794.m13995(Float.floatToRawIntBits(Float.parseFloat(string)));
                        c4794.m13998(4);
                    } catch (NumberFormatException unused2) {
                        editText.requestFocus();
                        C21374.m48457(R.string.MT_Protector);
                        return;
                    }
                    break;
                case 8:
                    C7073 c7073 = new C7073();
                    if (C9896.m24995(string, c7073) && c7073.f21767 == 5) {
                        c4794.m13995(c7073.f21766);
                        c4794.m13998(5);
                    } else {
                        editText.requestFocus();
                        C21374.m48457(R.string.MT_Protector);
                        return;
                    }
                    break;
                case 9:
                    C7073 c7074 = new C7073();
                    if (C9896.m24995(string, c7074) && c7074.f21767 == 6) {
                        c4794.m13995(c7074.f21766);
                        c4794.m13998(6);
                    } else {
                        editText.requestFocus();
                        C21374.m48457(R.string.MT_Protector);
                        return;
                    }
                    break;
                case 10:
                    if (!m46147(string)) {
                        return;
                    }
                    c4794.m13995(C9896.m24993(string));
                    c4794.m13998(7);
                    break;
                default:
                    dialogInterfaceC0206.dismiss();
                    return;
            }
            if (c23537.f75566.mo29412()) {
                c4794.m13997(C9896.m24993(string2));
            }
            if (this.f64822) {
                c23537.f75566.m43644(c4794);
            }
            dialogInterfaceC0206.dismiss();
            c23537.f75587 = true;
            this.f64823.f20339.notifyDataSetChanged();
            return;
        }
        String string3 = editText.getText().toString();
        DialogInterfaceOnClickListenerC3677 dialogInterfaceOnClickListenerC3677 = this.f64821;
        dialogInterfaceOnClickListenerC3677.getClass();
        dialogInterfaceOnClickListenerC3677.m11202(C9896.m24990(string3) ? C9896.m24993(string3) : 0);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        EditText editText = this.f64814;
        switch (i) {
            case 0:
                editText.setInputType(131073);
                break;
            case 1:
            case 2:
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
                editText.setInputType(1);
                break;
            case 4:
                editText.setInputType(o.a.b);
                break;
            case 7:
                editText.setInputType(12290);
                break;
            default:
                editText.setEnabled(false);
                break;
        }
        this.f64813.m1448().setVisibility(i != 3 ? 8 : 0);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
        this.f64814.setEnabled(false);
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String string = editable.toString();
        String strM30774 = null;
        try {
            if (C9896.m24990(string)) {
                strM30774 = this.f64820.f75569.m30774(C9896.m24993(string));
            }
        } catch (Exception unused) {
        }
        TextView textView = this.f64824;
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
