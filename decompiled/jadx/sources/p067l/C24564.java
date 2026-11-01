package p067l;

import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import bin.p000mt.json.JSONObject;
import bin.p000mt.plus.R;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: renamed from: l.᩻֡᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: QA0A */
/* JADX INFO: loaded from: classes.dex */
public final class C24564 extends AbstractC5769 {

    /* JADX INFO: renamed from: ֫֫ */
    public String f77776;

    /* JADX INFO: renamed from: ۧ֫ */
    public String f77777;

    /* JADX INFO: renamed from: ܽ֫ */
    public String f77778;

    /* JADX INFO: renamed from: ܿ֫ */
    public String f77779;

    /* JADX INFO: renamed from: ᩳ֫ */
    public int f77780;

    @Override // p067l.AbstractC5769
    /* JADX INFO: renamed from: ᩳ */
    public final String mo8545() {
        return "SMB";
    }

    public C24564(int i) {
        super(i);
        this.f77777 = "";
        this.f77780 = 445;
        this.f77776 = "";
        this.f77779 = "";
        this.f77778 = "";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24564(JSONObject jSONObject) {
        super(jSONObject);
        AbstractC5769.m12918(jSONObject, "rk", "7");
        AbstractC5769.m12918(jSONObject, "ip", "6");
        AbstractC5769.m12914(jSONObject, "hs", "8");
        AbstractC5769.m12914(jSONObject, "mt", "9");
        this.f77777 = "";
        this.f77780 = 445;
        this.f77776 = "";
        this.f77779 = "";
        this.f77778 = "";
        this.f77777 = jSONObject.getString("1");
        this.f77780 = jSONObject.getInt("2");
        this.f77776 = jSONObject.getString("3");
        this.f77779 = jSONObject.getString("4");
        this.f77778 = jSONObject.getString("5");
    }

    @Override // p067l.AbstractC5769
    /* JADX INFO: renamed from: ֫ */
    public final String mo8538() {
        StringBuilder sb = new StringBuilder("smb://");
        sb.append(this.f77779);
        if (!TextUtils.isEmpty(this.f77776)) {
            sb.append(":");
            sb.append(this.f77776);
        }
        sb.append("@");
        sb.append(this.f77777);
        if (this.f77780 != 445) {
            sb.append(":");
            sb.append(this.f77780);
        }
        return sb.toString();
    }

    @Override // p067l.AbstractC5769
    /* JADX INFO: renamed from: ܳ */
    public final JSONObject mo8542() {
        JSONObject jSONObjectMo8542 = super.mo8542();
        jSONObjectMo8542.put("1", this.f77777);
        jSONObjectMo8542.put("2", this.f77780);
        jSONObjectMo8542.put("3", this.f77776);
        jSONObjectMo8542.put("4", this.f77779);
        jSONObjectMo8542.put("5", this.f77778);
        return jSONObjectMo8542;
    }

    @Override // p067l.AbstractC5769
    public final String getName() {
        return this.f14164;
    }

    @Override // p067l.AbstractC5769
    /* JADX INFO: renamed from: ܽ */
    public final String mo8543() {
        String str = "smb://" + this.f77779 + "@" + this.f77777;
        return str.endsWith("/") ? C17073.m38720(1, 0, str) : str;
    }

    @Override // p067l.AbstractC5769
    /* JADX INFO: renamed from: ֫ */
    public final void mo8541(AbstractC5769 abstractC5769) {
        super.mo8541(abstractC5769);
        if (abstractC5769 instanceof C24564) {
            C24564 c24564 = (C24564) abstractC5769;
            this.f77777 = c24564.f77777;
            this.f77780 = c24564.f77780;
            this.f77776 = c24564.f77776;
            this.f77779 = c24564.f77779;
            this.f77778 = c24564.f77778;
        }
    }

    @Override // p067l.AbstractC5769
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C24564.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        C24564 c24564 = (C24564) obj;
        return this.f77780 == c24564.f77780 && C12826.equals(this.f77777, c24564.f77777) && C12826.equals(this.f77776, c24564.f77776) && C12826.equals(this.f77779, c24564.f77779) && C12826.equals(this.f77778, c24564.f77778);
    }

    @Override // p067l.AbstractC5769
    public final int hashCode() {
        return C12826.hashCode(this.f77778) + C21720.m49003(C21720.m49003((C21720.m49003(super.hashCode() * 31, 31, this.f77777) + this.f77780) * 31, 31, this.f77776), 31, this.f77779);
    }

    @Override // p067l.AbstractC5769
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC5375 mo8539(int i) {
        return new C14506(i, clone());
    }

    /* JADX INFO: renamed from: ֫ */
    public static InterfaceC20106 m54160(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3)) {
            return C18959.m43083().mo8531();
        }
        if (!str2.equals("guest") || !TextUtils.isEmpty(str3)) {
            C20008 c20008 = new C20008(str, str2, str3, EnumC5926.USER);
            C18959 c18959M43083 = C18959.m43083();
            c18959M43083.getClass();
            return new C18288(c18959M43083, c20008);
        }
        return C18959.m43083().m8532();
    }

    @Override // p067l.AbstractC5769
    public final C21265 getIcon() {
        return C21265.f66838;
    }

    @Override // p067l.AbstractC5769
    /* JADX INFO: renamed from: ܿ */
    public final String mo8544() {
        return C10965.m25286(new StringBuilder("smb@"), this.f14164, " ");
    }

    @Override // p067l.AbstractC5769
    /* JADX INFO: renamed from: ֫ */
    public final void mo8540(AbstractActivityC5549 abstractActivityC5549) {
        m54162(abstractActivityC5549, this);
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m54164(AbstractActivityC5549 abstractActivityC5549) {
        m54162(abstractActivityC5549, new C24564(-1));
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m54162(final AbstractActivityC5549 abstractActivityC5549, C24564 c24564) {
        View viewM12252 = abstractActivityC5549.m12252(R.layout.MT_Protector);
        TextView textView = (TextView) viewM12252.findViewById(R.id.MT_Protector);
        final EditText editText = (EditText) viewM12252.findViewById(R.id.MT_Protector);
        final EditText editText2 = (EditText) viewM12252.findViewById(R.id.MT_Protector);
        EditText editText3 = (EditText) viewM12252.findViewById(R.id.MT_Protector);
        final EditText editText4 = (EditText) viewM12252.findViewById(R.id.MT_Protector);
        EditText editText5 = (EditText) viewM12252.findViewById(R.id.MT_Protector);
        EditText editText6 = (EditText) viewM12252.findViewById(R.id.MT_Protector);
        final EditText editText7 = (EditText) viewM12252.findViewById(R.id.MT_Protector);
        C0990 c0990 = (C0990) viewM12252.findViewById(R.id.MT_Protector);
        C0990 c0991 = (C0990) viewM12252.findViewById(R.id.MT_Protector);
        ((TextInputLayout) viewM12252.findViewById(R.id.MT_Protector)).setEndIconOnClickListener(new View.OnClickListener() { // from class: l.ۧ֡᩻
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C20542.m46439(abstractActivityC5549, new C18529(editText, editText2, editText7));
            }
        });
        C7110 c7110M16377 = C7110.m16377(abstractActivityC5549, (TextView) viewM12252.findViewById(R.id.MT_Protector), c24564);
        textView.setText(C7050.m16224(c24564.f14161 == -1 ? R.string.MT_Protector : R.string.MT_Protector).concat(" SMB"));
        editText.setText(c24564.f77777);
        editText2.setText(String.valueOf(c24564.f77780));
        editText3.setText(c24564.f77776);
        editText4.setText(c24564.f77779);
        editText5.setText(c24564.f77778);
        editText6.setText(c24564.f14159);
        editText7.setText(c24564.f14164);
        c0990.setChecked(c24564.f14163);
        c0991.setChecked(c24564.f14154);
        c0991.setOnCheckedChangeListener(new C4122(1));
        int i = 2;
        AbstractC5769.m12912(editText, editText7, new C7977(i, editText3));
        AbstractC5769.m12912(editText3, editText7, new C6263(i, editText));
        C20671 c20671BuildDialog = abstractActivityC5549.buildDialog();
        c20671BuildDialog.m46715(viewM12252);
        c20671BuildDialog.m46736(R.string.MT_Protector, null);
        c20671BuildDialog.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c20671BuildDialog.m46734(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c20671BuildDialog.m46722(false);
        DialogInterfaceC2564 dialogInterfaceC2564M46732 = c20671BuildDialog.m46732();
        C7204.m16545(dialogInterfaceC2564M46732);
        C7050.m16226(editText);
        final C17858 c17858 = new C17858(editText, editText2, editText3, editText4, editText5, editText6, editText7, c0990, c0991, c7110M16377);
        dialogInterfaceC2564M46732.m3860().setOnClickListener(new ViewOnClickListenerC13805(c17858, c24564, dialogInterfaceC2564M46732, 1));
        dialogInterfaceC2564M46732.m3861().setOnClickListener(new View.OnClickListener() { // from class: l.ᩳ֡᩻
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C24564 c24565 = (C24564) c17858.get();
                if (c24565 == null) {
                    return;
                }
                AbstractActivityC5549 abstractActivityC55410 = abstractActivityC5549;
                if (C8381.m19540(abstractActivityC55410, c24565)) {
                    new C15846(abstractActivityC55410, c24565, editText4).m22250();
                }
            }
        });
    }

    /* JADX INFO: renamed from: ֫ */
    public static C24564 m54161(EditText editText, EditText editText2, EditText editText3, EditText editText4, EditText editText5, EditText editText6, EditText editText7, C0990 c0990, C0990 c0991, C7110 c7110) {
        int i;
        if (!AbstractC5769.m12919(editText)) {
            return null;
        }
        C24564 c24564 = new C24564(-1);
        c24564.f77777 = editText.getText().toString();
        try {
            i = Integer.parseInt(editText2.getText().toString());
        } catch (NumberFormatException unused) {
            i = 445;
        }
        c24564.f77780 = i;
        c24564.f77776 = editText3.getText().toString();
        c24564.f77779 = editText4.getText().toString();
        c24564.f77778 = editText5.getText().toString();
        c24564.f14159 = editText6.getText().toString();
        c24564.f14164 = AbstractC5769.m12910(editText7, TextUtils.isEmpty(c24564.f77776) ? c24564.f77777 : c24564.f77776);
        c24564.f14163 = c0990.isChecked();
        c24564.f14154 = c0991.isChecked();
        c24564.m12922(c7110);
        return c24564;
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m54163(C17858 c17858, C24564 c24564, DialogInterfaceC2564 dialogInterfaceC2564) {
        C24564 c24565 = (C24564) c17858.get();
        if (c24565 == null) {
            return;
        }
        if (c24564.f14161 == -1) {
            C24564 c24566 = new C24564(AbstractC5769.m12920());
            c24566.mo8541(c24565);
            C14486.m33123(c24566);
        } else {
            c24564.mo8541(c24565);
            C14486.m33116();
        }
        dialogInterfaceC2564.dismiss();
    }
}
