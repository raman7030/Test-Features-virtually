package p067l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.TextView;
import bin.p000mt.json.JSONObject;
import bin.p000mt.plus.R;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.Protocol;
import com.google.android.material.textfield.TextInputLayout;
import com.umeng.analytics.pro.C0655am;

/* JADX INFO: renamed from: l.۬ۖ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: V89B */
/* JADX INFO: loaded from: classes4.dex */
public final class C14566 extends AbstractC5769 {

    /* JADX INFO: renamed from: ֫֫ */
    public String f41581;

    /* JADX INFO: renamed from: ۧ֫ */
    public String f41582;

    /* JADX INFO: renamed from: ܳ֫ */
    public String f41583;

    /* JADX INFO: renamed from: ܽ֫ */
    public String f41584;

    /* JADX INFO: renamed from: ܿ֫ */
    public boolean f41585;

    /* JADX INFO: renamed from: ᩳ֫ */
    public String f41586;

    /* JADX INFO: renamed from: ᩻֫ */
    public int f41587;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14566(JSONObject jSONObject) {
        super(jSONObject);
        AbstractC5769.m12918(jSONObject, "rk", "6");
        AbstractC5769.m12918(jSONObject, "ip", "7");
        AbstractC5769.m12914(jSONObject, "hs", "8");
        this.f41587 = jSONObject.getInt("1", 0);
        this.f41581 = jSONObject.getString("2");
        this.f41583 = jSONObject.getString("3");
        this.f41586 = jSONObject.getString("4");
        this.f41582 = jSONObject.getString("5");
        this.f41584 = jSONObject.getString("9", "");
        this.f41585 = jSONObject.getBoolean(C0655am.f2320av, false);
    }

    @Override // p067l.AbstractC5769
    /* JADX INFO: renamed from: ֫ */
    public final String mo8538() {
        return AbstractC7190.m16526(this.f41587).mo3611() + "://" + this.f41586 + ":" + this.f41582;
    }

    @Override // p067l.AbstractC5769
    /* JADX INFO: renamed from: ܳ */
    public final JSONObject mo8542() {
        JSONObject jSONObjectMo8542 = super.mo8542();
        jSONObjectMo8542.put("1", this.f41587);
        jSONObjectMo8542.put("2", this.f41581);
        jSONObjectMo8542.put("3", this.f41583);
        jSONObjectMo8542.put("4", this.f41586);
        jSONObjectMo8542.put("5", this.f41582);
        jSONObjectMo8542.put("9", this.f41584);
        jSONObjectMo8542.put(C0655am.f2320av, this.f41585);
        return jSONObjectMo8542;
    }

    @Override // p067l.AbstractC5769
    /* JADX INFO: renamed from: ᩳ */
    public final String mo8545() {
        return C7050.m16224(R.string.MT_Protector);
    }

    @Override // p067l.AbstractC5769
    public final String getName() {
        return this.f14164;
    }

    @Override // p067l.AbstractC5769
    /* JADX INFO: renamed from: ܽ */
    public final String mo8543() {
        return AbstractC7190.m16526(this.f41587).mo3611() + "://" + this.f41582;
    }

    @Override // p067l.AbstractC5769
    /* JADX INFO: renamed from: ֫ */
    public final void mo8541(AbstractC5769 abstractC5769) {
        super.mo8541(abstractC5769);
        if (abstractC5769 instanceof C14566) {
            C14566 c14566 = (C14566) abstractC5769;
            this.f41587 = c14566.f41587;
            this.f41581 = c14566.f41581;
            this.f41583 = c14566.f41583;
            this.f41586 = c14566.f41586;
            this.f41582 = c14566.f41582;
            this.f41584 = c14566.f41584;
            this.f41585 = c14566.f41585;
        }
    }

    @Override // p067l.AbstractC5769
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C14566.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        C14566 c14566 = (C14566) obj;
        return this.f41587 == c14566.f41587 && C12826.equals(this.f41581, c14566.f41581) && C12826.equals(this.f41583, c14566.f41583) && C12826.equals(this.f41586, c14566.f41586) && C12826.equals(this.f41582, c14566.f41582) && C12826.equals(this.f41584, c14566.f41584) && Boolean.valueOf(this.f41585).equals(Boolean.valueOf(c14566.f41585));
    }

    @Override // p067l.AbstractC5769
    public final int hashCode() {
        return Boolean.valueOf(this.f41585).hashCode() + C21720.m49003(C21720.m49003(C21720.m49003(C21720.m49003(C21720.m49003(((super.hashCode() * 31) + this.f41587) * 31, 31, this.f41581), 31, this.f41583), 31, this.f41586), 31, this.f41582), 31, this.f41584);
    }

    @Override // p067l.AbstractC5769
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC5375 mo8539(int i) {
        return new C9202(i, clone());
    }

    @Override // p067l.AbstractC5769
    public final C21265 getIcon() {
        return C21265.f66882;
    }

    @Override // p067l.AbstractC5769
    /* JADX INFO: renamed from: ܿ */
    public final String mo8544() {
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractC7190.m16526(this.f41587).mo3611());
        sb.append("@");
        return C10965.m25286(sb, this.f14164, " ");
    }

    @Override // p067l.AbstractC5769
    /* JADX INFO: renamed from: ֫ */
    public final void mo8540(AbstractActivityC5549 abstractActivityC5549) {
        m33295(abstractActivityC5549, this);
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m33298(AbstractActivityC5549 abstractActivityC5549) {
        m33295(abstractActivityC5549, new C14566(-1));
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m33295(final AbstractActivityC5549 abstractActivityC5549, C14566 c14566) {
        View viewM12252 = abstractActivityC5549.m12252(R.layout.MT_Protector);
        TextView textView = (TextView) viewM12252.findViewById(R.id.MT_Protector);
        EditText editText = (EditText) viewM12252.findViewById(R.id.MT_Protector);
        EditText editText2 = (EditText) viewM12252.findViewById(R.id.MT_Protector);
        EditText editText3 = (EditText) viewM12252.findViewById(R.id.MT_Protector);
        EditText editText4 = (EditText) viewM12252.findViewById(R.id.MT_Protector);
        EditText editText5 = (EditText) viewM12252.findViewById(R.id.MT_Protector);
        EditText editText6 = (EditText) viewM12252.findViewById(R.id.MT_Protector);
        EditText editText7 = (EditText) viewM12252.findViewById(R.id.MT_Protector);
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) viewM12252.findViewById(R.id.MT_Protector);
        C0990 c0990 = (C0990) viewM12252.findViewById(R.id.MT_Protector);
        C0990 c0991 = (C0990) viewM12252.findViewById(R.id.MT_Protector);
        C0990 c0992 = (C0990) viewM12252.findViewById(R.id.MT_Protector);
        C7110 c7110M16377 = C7110.m16377(abstractActivityC5549, (TextView) viewM12252.findViewById(R.id.MT_Protector), c14566);
        ((TextInputLayout) viewM12252.findViewById(R.id.MT_Protector)).setEndIconOnClickListener(new ViewOnClickListenerC8346(3, abstractActivityC5549));
        StringBuilder sb = new StringBuilder();
        sb.append(C7050.m16224(c14566.f14161 == -1 ? R.string.MT_Protector : R.string.MT_Protector));
        sb.append(" ");
        sb.append(C7050.m16224(R.string.MT_Protector));
        textView.setText(sb.toString());
        editText3.setText(c14566.f41582);
        editText4.setText(c14566.f41586);
        editText5.setText(c14566.f41584);
        editText.setText(c14566.f41581);
        editText2.setText(c14566.f41583);
        editText6.setText(c14566.f14159);
        editText7.setText(c14566.f14164);
        c0991.setChecked(c14566.f14163);
        c0992.setChecked(c14566.f14154);
        c0990.setChecked(c14566.f41585);
        c0992.setOnCheckedChangeListener(new C4122(1));
        AbstractC5769.m12911(editText3, editText7);
        viewM12252.findViewById(R.id.MT_Protector).setOnClickListener(new ViewOnClickListenerC19291(3, abstractActivityC5549));
        final C16577 c16577 = new C16577(c0990, autoCompleteTextView, (TextInputLayout) viewM12252.findViewById(R.id.MT_Protector), (TextInputLayout) viewM12252.findViewById(R.id.MT_Protector), (TextInputLayout) viewM12252.findViewById(R.id.MT_Protector), abstractActivityC5549, editText, editText2, editText3, editText4, editText7);
        final AbstractC7190[] abstractC7190Arr = {C2495.f4023, C4508.f10113, C8531.f22890, C17247.f51318, C21943.f68980, C20602.f63669};
        autoCompleteTextView.setAdapter(new C21438(abstractActivityC5549, abstractC7190Arr));
        AbstractC7190 abstractC7190M16526 = AbstractC7190.m16526(c14566.f41587);
        autoCompleteTextView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: l.᩸ۖ᩻
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
                c16577.accept(abstractC7190Arr[i]);
            }
        });
        autoCompleteTextView.setText((CharSequence) abstractC7190M16526.mo3610(), false);
        autoCompleteTextView.setKeyListener(null);
        c16577.accept(abstractC7190M16526);
        autoCompleteTextView.setPadding(autoCompleteTextView.getPaddingLeft(), autoCompleteTextView.getPaddingTop() + C13076.m29939(6.0f), autoCompleteTextView.getPaddingRight(), autoCompleteTextView.getPaddingBottom());
        C20671 c20671BuildDialog = abstractActivityC5549.buildDialog();
        c20671BuildDialog.m46715(viewM12252);
        c20671BuildDialog.m46736(R.string.MT_Protector, null);
        c20671BuildDialog.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c20671BuildDialog.m46734(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c20671BuildDialog.m46722(false);
        DialogInterfaceC2564 dialogInterfaceC2564M46732 = c20671BuildDialog.m46732();
        C7204.m16545(dialogInterfaceC2564M46732);
        C7050.m16226(editText);
        final C23284 c23284 = new C23284(editText3, editText4, editText, editText2, autoCompleteTextView, editText5, editText6, editText7, c0991, c0992, c0990, c7110M16377);
        dialogInterfaceC2564M46732.m3860().setOnClickListener(new ViewOnClickListenerC10865(c23284, c14566, dialogInterfaceC2564M46732, 1));
        dialogInterfaceC2564M46732.m3861().setOnClickListener(new View.OnClickListener() { // from class: l.᩶ۖ᩻
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C14566 c14567 = (C14566) c23284.get();
                if (c14567 == null) {
                    return;
                }
                AbstractActivityC5549 abstractActivityC55410 = abstractActivityC5549;
                if (C8381.m19540(abstractActivityC55410, c14567)) {
                    new C5179(abstractActivityC55410, c14567).m22250();
                }
            }
        });
    }

    /* JADX INFO: renamed from: ۧ */
    public static C14566 m33297(EditText editText, EditText editText2, EditText editText3, EditText editText4, AutoCompleteTextView autoCompleteTextView, EditText editText5, EditText editText6, EditText editText7, C0990 c0990, C0990 c0991, C0990 c0992, C7110 c7110) {
        if (!AbstractC5769.m12916(editText, R.string.MT_Protector) || !AbstractC5769.m12916(editText2, R.string.MT_Protector) || !AbstractC5769.m12916(editText3, R.string.MT_Protector) || !AbstractC5769.m12916(editText4, R.string.MT_Protector)) {
            return null;
        }
        C14566 c14566 = new C14566(-1);
        c14566.f41587 = ((AbstractC7190) autoCompleteTextView.getTag()).mo3612();
        c14566.f41582 = editText.getText().toString();
        c14566.f41586 = editText2.getText().toString();
        c14566.f41584 = editText5.getText().toString();
        c14566.f41581 = editText3.getText().toString();
        c14566.f41583 = editText4.getText().toString();
        c14566.f14159 = editText6.getText().toString();
        c14566.f14164 = AbstractC5769.m12910(editText7, c14566.f41582);
        c14566.f14163 = c0990.isChecked();
        c14566.f14154 = c0991.isChecked();
        c14566.f41585 = c0992.getVisibility() == 0 && c0992.isChecked();
        c14566.m12922(c7110);
        return c14566;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m33296(C23284 c23284, C14566 c14566, DialogInterfaceC2564 dialogInterfaceC2564) {
        C14566 c14567 = (C14566) c23284.get();
        if (c14567 == null) {
            return;
        }
        if (c14566.f14161 == -1) {
            C14566 c14568 = new C14566(AbstractC5769.m12920());
            c14568.mo8541(c14567);
            C14486.m33123(c14568);
        } else {
            c14566.mo8541(c14567);
            C14486.m33116();
        }
        dialogInterfaceC2564.dismiss();
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m33293(String str, ClientConfiguration clientConfiguration) {
        if (str.toLowerCase().startsWith("https://")) {
            clientConfiguration.m1334(Protocol.HTTPS);
            str = str.substring(8);
        } else if (str.toLowerCase().startsWith("http://")) {
            clientConfiguration.m1334(Protocol.HTTP);
            str = str.substring(7);
        } else {
            clientConfiguration.m1334(Protocol.HTTPS);
        }
        return str.endsWith("/") ? C17073.m38720(1, 0, str) : str;
    }
}
