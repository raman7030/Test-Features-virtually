package p067l;

import android.content.DialogInterface;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import bin.p000mt.plus.R;
import com.umeng.analytics.pro.C0719o;

/* JADX INFO: renamed from: l.᩶ۜᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: T5VF */
/* JADX INFO: loaded from: classes4.dex */
public final class ViewOnClickListenerC21386 implements View.OnClickListener, AdapterView.OnItemSelectedListener, TextWatcher {

    /* JADX INFO: renamed from: ۗ */
    public DialogInterfaceC2564 f67455;

    /* JADX INFO: renamed from: ۙ */
    public EditText f67456;

    /* JADX INFO: renamed from: ۛ */
    public Spinner f67457;

    /* JADX INFO: renamed from: ۤ */
    public TextView f67458;

    /* JADX INFO: renamed from: ۨ */
    public EditText f67459;

    /* JADX INFO: renamed from: ۫ */
    public View f67460;

    /* JADX INFO: renamed from: ۬ */
    public boolean f67461 = true;

    /* JADX INFO: renamed from: ܰ */
    public final C24738 f67462;

    /* JADX INFO: renamed from: ᩶ */
    public final DialogInterfaceOnClickListenerC5863 f67463;

    /* JADX INFO: renamed from: ᩸ */
    public boolean f67464;

    /* JADX INFO: renamed from: ᩹ */
    public final ActivityC8645 f67465;

    /* JADX INFO: renamed from: ᩺ */
    public TextView f67466;

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public ViewOnClickListenerC21386(ActivityC8645 activityC8645) {
        this.f67465 = activityC8645;
        this.f67462 = activityC8645.f23213;
        View viewM12252 = activityC8645.m12252(R.layout.MT_Protector);
        this.f67456 = (EditText) viewM12252.findViewById(R.id.MT_Protector);
        EditText editText = (EditText) viewM12252.findViewById(R.id.editText2);
        this.f67459 = editText;
        this.f67466 = (TextView) viewM12252.findViewById(R.id.textView2);
        TextView textView = (TextView) viewM12252.findViewById(R.id.MT_Protector);
        this.f67458 = textView;
        Spinner spinner = (Spinner) viewM12252.findViewById(R.id.spinner);
        this.f67457 = spinner;
        this.f67460 = viewM12252.findViewById(R.id.MT_Protector);
        DialogInterfaceOnClickListenerC5863 dialogInterfaceOnClickListenerC5863 = new DialogInterfaceOnClickListenerC5863(activityC8645, true);
        dialogInterfaceOnClickListenerC5863.m13163(new InterfaceC4522() { // from class: l.᩹ۜᩳ
            @Override // p067l.InterfaceC4522
            /* JADX INFO: renamed from: ۧ */
            public final void mo9575(int i) {
                this.f74542.f67456.setText(String.format("%08X", Integer.valueOf(i)));
            }
        });
        this.f67463 = dialogInterfaceOnClickListenerC5863;
        C20671 c20671 = new C20671(activityC8645);
        c20671.m46715(viewM12252);
        c20671.m46736(R.string.MT_Protector, null);
        c20671.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c20671.m46734(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        this.f67455 = c20671.m46709();
        spinner.setOnItemSelectedListener(this);
        editText.addTextChangedListener(this);
        ViewOnClickListenerC16447.m37363(textView);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m48463() {
        m48464(null, 0, 0, false);
        C7050.m16226(this.f67456);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m48464(String str, int i, int i2, boolean z) {
        String strM32844;
        this.f67464 = z;
        C24738 c24738 = this.f67462;
        boolean zMo31474 = c24738.f78312.mo31474();
        View view = this.f67460;
        if (zMo31474) {
            view.setVisibility(0);
            EditText editText = this.f67459;
            if (z) {
                editText.setText(String.format("%08X", Integer.valueOf(i)));
            } else {
                editText.setText(String.format("%08X", Integer.valueOf(c24738.f78322.mo7249())));
            }
        } else {
            view.setVisibility(8);
        }
        DialogInterfaceC2564 dialogInterfaceC2564 = this.f67455;
        dialogInterfaceC2564.m3862();
        if (this.f67461) {
            this.f67461 = false;
            dialogInterfaceC2564.m3860().setOnClickListener(this);
            dialogInterfaceC2564.m3861().setOnClickListener(this);
            C10884.m25071(dialogInterfaceC2564);
            ViewOnClickListenerC16447.m37363(this.f67466);
        }
        TextView textView = this.f67458;
        Spinner spinner = this.f67457;
        EditText editText2 = this.f67456;
        if (!z) {
            EnumC6633 enumC6633M54402 = c24738.m54402();
            if (enumC6633M54402 == EnumC6633.ENTRY || enumC6633M54402 == EnumC6633.SEARCH_BY_ID_IN || enumC6633M54402 == EnumC6633.SEARCH_VALUE_IN) {
                strM32844 = c24738.f78315.m32844(c24738.f78322.mo7249());
            } else {
                strM32844 = c24738.f78312.mo31468();
            }
            textView.setText(strM32844);
            C6925 c6925 = c24738.f78322;
            int iMo7247 = c6925.mo7247();
            switch (iMo7247) {
                case 1:
                    spinner.setSelection(1);
                    editText2.setText(String.format("%08X", Integer.valueOf(c6925.getValue())));
                    break;
                case 2:
                case 8:
                    spinner.setSelection(2);
                    editText2.setText(String.format("%08X", Integer.valueOf(c6925.getValue())));
                    break;
                case 3:
                    spinner.setSelection(0);
                    editText2.setText(c6925.mo7251().getValue());
                    break;
                case 4:
                    spinner.setSelection(7);
                    editText2.setText(C2609.m3917(c6925.getValue()));
                    break;
                case 5:
                    spinner.setSelection(8);
                    editText2.setText(C5422.m11903(c6925.getValue(), 1) + C5422.f12912[c6925.getValue() & 15]);
                    break;
                case 6:
                    spinner.setSelection(9);
                    int value = c6925.getValue() & 15;
                    editText2.setText(C5422.m11903(c6925.getValue(), C5422.f12913[value]) + C5422.f12914[value]);
                    break;
                case 7:
                    spinner.setSelection(10);
                    editText2.setText(String.format("%08X", Integer.valueOf(c6925.getValue())));
                    break;
                default:
                    switch (iMo7247) {
                        case 16:
                            spinner.setSelection(4);
                            editText2.setText(String.valueOf(c6925.getValue()));
                            break;
                        case 17:
                            spinner.setSelection(5);
                            editText2.setText(String.format("%X", Integer.valueOf(c6925.getValue())));
                            break;
                        case 18:
                            spinner.setSelection(6);
                            editText2.setText(c6925.getValue() != 0 ? "true" : "false");
                            break;
                        default:
                            switch (iMo7247) {
                                case 28:
                                case 29:
                                case 30:
                                case 31:
                                    spinner.setSelection(3);
                                    editText2.setText(String.format("%08X", Integer.valueOf(c6925.getValue())));
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

    /* JADX INFO: renamed from: ֫ */
    private boolean m48462(String str) {
        if (C11774.m27005(str)) {
            return true;
        }
        this.f67456.requestFocus();
        C22682.m50793(R.string.MT_Protector);
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
        EditText editText = this.f67456;
        if (id == 16908313) {
            String string = editText.getText().toString();
            EditText editText2 = this.f67459;
            String string2 = editText2.getText().toString();
            C24738 c24738 = this.f67462;
            if (c24738.f78312.mo31474() && !C11774.m27005(string2)) {
                editText2.requestFocus();
                C22682.m50793(R.string.MT_Protector);
                return;
            }
            if (this.f67464) {
                c24738.f78322 = new C6925(c24738.f78312, 0, 0, -1);
            }
            C6925 c6925 = c24738.f78322;
            int selectedItemPosition = this.f67457.getSelectedItemPosition();
            DialogInterfaceC2564 dialogInterfaceC2564 = this.f67455;
            switch (selectedItemPosition) {
                case 0:
                    c6925.m15876(string, null);
                    break;
                case 1:
                    if (!m48462(string)) {
                        return;
                    }
                    c6925.m15875(C11774.m27008(string));
                    c6925.m15878(1);
                    break;
                case 2:
                    if (!m48462(string)) {
                        return;
                    }
                    c6925.m15875(C11774.m27008(string));
                    c6925.m15878(2);
                    break;
                case 3:
                    if (!m48462(string)) {
                        return;
                    }
                    c6925.m15875(C11774.m27008(string));
                    c6925.m15878(28);
                    break;
                case 4:
                    try {
                        c6925.m15875(Integer.parseInt(string));
                        c6925.m15878(16);
                    } catch (NumberFormatException unused) {
                        editText.requestFocus();
                        C22682.m50793(R.string.MT_Protector);
                        return;
                    }
                    break;
                case 5:
                    if (!m48462(string)) {
                        return;
                    }
                    c6925.m15875(C11774.m27008(string));
                    c6925.m15878(17);
                    break;
                case 6:
                    if (!string.equals("true") && !string.equals("false")) {
                        editText.requestFocus();
                        C22682.m50793(R.string.MT_Protector);
                        return;
                    } else {
                        c6925.m15875(string.equals("true") ? 1 : 0);
                        c6925.m15878(18);
                    }
                    break;
                case 7:
                    try {
                        c6925.m15875(Float.floatToRawIntBits(Float.parseFloat(string)));
                        c6925.m15878(4);
                    } catch (NumberFormatException unused2) {
                        editText.requestFocus();
                        C22682.m50793(R.string.MT_Protector);
                        return;
                    }
                    break;
                case 8:
                    C9091 c9091 = new C9091();
                    if (C11774.m27010(string, c9091) && c9091.f24648 == 5) {
                        c6925.m15875(c9091.f24647);
                        c6925.m15878(5);
                    } else {
                        editText.requestFocus();
                        C22682.m50793(R.string.MT_Protector);
                        return;
                    }
                    break;
                case 9:
                    C9091 c9092 = new C9091();
                    if (C11774.m27010(string, c9092) && c9092.f24648 == 6) {
                        c6925.m15875(c9092.f24647);
                        c6925.m15878(6);
                    } else {
                        editText.requestFocus();
                        C22682.m50793(R.string.MT_Protector);
                        return;
                    }
                    break;
                case 10:
                    if (!m48462(string)) {
                        return;
                    }
                    c6925.m15875(C11774.m27008(string));
                    c6925.m15878(7);
                    break;
                default:
                    dialogInterfaceC2564.dismiss();
                    return;
            }
            if (c24738.f78312.mo31474()) {
                c6925.m15877(C11774.m27008(string2));
            }
            if (this.f67464) {
                c24738.f78312.m45910(c6925);
            }
            dialogInterfaceC2564.dismiss();
            c24738.f78333 = true;
            this.f67465.f23216.notifyDataSetChanged();
            return;
        }
        String string3 = editText.getText().toString();
        DialogInterfaceOnClickListenerC5863 dialogInterfaceOnClickListenerC5863 = this.f67463;
        dialogInterfaceOnClickListenerC5863.getClass();
        dialogInterfaceOnClickListenerC5863.m13162(C11774.m27005(string3) ? C11774.m27008(string3) : 0);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        EditText editText = this.f67456;
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
                editText.setInputType(C0719o.a.f2896b);
                break;
            case 7:
                editText.setInputType(12290);
                break;
            default:
                editText.setEnabled(false);
                break;
        }
        this.f67455.m3861().setVisibility(i != 3 ? 8 : 0);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
        this.f67456.setEnabled(false);
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String string = editable.toString();
        String strM32846 = null;
        try {
            if (C11774.m27005(string)) {
                strM32846 = this.f67462.f78315.m32846(C11774.m27008(string));
            }
        } catch (Exception unused) {
        }
        TextView textView = this.f67466;
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
