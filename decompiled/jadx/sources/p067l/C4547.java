package p067l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import bin.p000mt.json.JSONObject;
import bin.p000mt.plus.R;
import com.google.android.material.textfield.TextInputLayout;
import com.umeng.commonsdk.framework.UMModuleRegister;

/* JADX INFO: renamed from: l.ۖۘ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 27JL */
/* JADX INFO: loaded from: classes2.dex */
public final class C4547 extends AbstractC5769 {

    /* JADX INFO: renamed from: ֫֫ */
    public String f10195;

    /* JADX INFO: renamed from: ۧ֫ */
    public String f10196;

    /* JADX INFO: renamed from: ܳ֫ */
    public int f10197;

    /* JADX INFO: renamed from: ܽ֫ */
    public String f10198;

    /* JADX INFO: renamed from: ܿ֫ */
    public String f10199;

    /* JADX INFO: renamed from: ᩳ֫ */
    public boolean f10200;

    /* JADX INFO: renamed from: ᩻֫ */
    public String f10201;

    public C4547(int i) {
        super(i);
        this.f10195 = "";
        this.f10197 = 22;
        this.f10201 = "root";
        this.f10199 = "";
        this.f10196 = "";
        this.f10198 = "";
        this.f10200 = false;
    }

    public C4547(JSONObject jSONObject) {
        super(jSONObject);
        this.f10195 = "";
        this.f10197 = 22;
        this.f10201 = "root";
        this.f10199 = "";
        this.f10196 = "";
        this.f10198 = "";
        this.f10200 = false;
        this.f10195 = jSONObject.getString("1");
        this.f10197 = jSONObject.getInt("2");
        this.f10201 = jSONObject.getString("3");
        this.f10199 = jSONObject.getString("4");
        this.f10196 = jSONObject.getString("5");
        this.f10198 = jSONObject.getString("6", "");
        this.f10200 = jSONObject.getBoolean("7");
    }

    @Override // p067l.AbstractC5769
    /* JADX INFO: renamed from: ֫ */
    public final String mo8538() {
        if (this.f10197 == 22) {
            return "sshj://" + this.f10201 + "@" + this.f10195;
        }
        return "sshj://" + this.f10201 + "@" + this.f10195 + ":" + this.f10197;
    }

    @Override // p067l.AbstractC5769
    /* JADX INFO: renamed from: ܳ */
    public final JSONObject mo8542() {
        JSONObject jSONObjectMo8542 = super.mo8542();
        jSONObjectMo8542.put("1", this.f10195);
        jSONObjectMo8542.put("2", this.f10197);
        jSONObjectMo8542.put("3", this.f10201);
        jSONObjectMo8542.put("4", this.f10199);
        jSONObjectMo8542.put("5", this.f10196);
        jSONObjectMo8542.put("6", this.f10198);
        jSONObjectMo8542.put("7", this.f10200);
        return jSONObjectMo8542;
    }

    /* JADX INFO: renamed from: ۢ */
    public final String m9624() {
        if (this.f10198.isEmpty()) {
            return null;
        }
        return this.f10198;
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
    /* JADX INFO: renamed from: ֫ */
    public final void mo8541(AbstractC5769 abstractC5769) {
        super.mo8541(abstractC5769);
        if (abstractC5769 instanceof C4547) {
            C4547 c4547 = (C4547) abstractC5769;
            this.f10195 = c4547.f10195;
            this.f10197 = c4547.f10197;
            this.f10201 = c4547.f10201;
            this.f10199 = c4547.f10199;
            this.f10196 = c4547.f10196;
            this.f10198 = c4547.f10198;
            this.f10200 = c4547.f10200;
        }
    }

    @Override // p067l.AbstractC5769
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4547.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        C4547 c4547 = (C4547) obj;
        return this.f10197 == c4547.f10197 && this.f10200 == c4547.f10200 && C12826.equals(this.f10195, c4547.f10195) && C12826.equals(this.f10201, c4547.f10201) && C12826.equals(this.f10199, c4547.f10199) && C12826.equals(this.f10196, c4547.f10196) && C12826.equals(this.f10198, c4547.f10198);
    }

    @Override // p067l.AbstractC5769
    public final int hashCode() {
        return C21720.m49003(C21720.m49003(C21720.m49003(C21720.m49003((C21720.m49003(super.hashCode() * 31, 31, this.f10195) + this.f10197) * 31, 31, this.f10201), 31, this.f10199), 31, this.f10196), 31, this.f10198) + (this.f10200 ? 1231 : 1237);
    }

    @Override // p067l.AbstractC5769
    /* JADX INFO: renamed from: ܽ */
    public final String mo8543() {
        throw new UnsupportedOperationException();
    }

    @Override // p067l.AbstractC5769
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC5375 mo8539(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // p067l.AbstractC5769
    public final C21265 getIcon() {
        throw new UnsupportedOperationException();
    }

    @Override // p067l.AbstractC5769
    /* JADX INFO: renamed from: ܿ */
    public final String mo8544() {
        throw new UnsupportedOperationException();
    }

    @Override // p067l.AbstractC5769
    /* JADX INFO: renamed from: ֫ */
    public final void mo8540(AbstractActivityC5549 abstractActivityC5549) {
        m9620(abstractActivityC5549, this);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m9622(ActivityC21312 activityC21312) {
        m9620(activityC21312, new C4547(-1));
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m9620(final AbstractActivityC5549 abstractActivityC5549, final C4547 c4547) {
        View viewM12252 = abstractActivityC5549.m12252(R.layout.MT_Protector);
        viewM12252.findViewById(R.id.MT_Protector).setVisibility(8);
        viewM12252.findViewById(R.id.MT_Protector).setVisibility(8);
        viewM12252.findViewById(R.id.MT_Protector).setVisibility(8);
        viewM12252.findViewById(R.id.MT_Protector).setVisibility(8);
        viewM12252.findViewById(R.id.MT_Protector).setVisibility(8);
        viewM12252.findViewById(R.id.MT_Protector).setVisibility(8);
        viewM12252.findViewById(R.id.MT_Protector).setVisibility(8);
        TextView textView = (TextView) viewM12252.findViewById(R.id.MT_Protector);
        final EditText editText = (EditText) viewM12252.findViewById(R.id.MT_Protector);
        final EditText editText2 = (EditText) viewM12252.findViewById(R.id.MT_Protector);
        EditText editText3 = (EditText) viewM12252.findViewById(R.id.MT_Protector);
        EditText editText4 = (EditText) viewM12252.findViewById(R.id.MT_Protector);
        final EditText editText5 = (EditText) viewM12252.findViewById(R.id.MT_Protector);
        EditText editText6 = (EditText) viewM12252.findViewById(R.id.MT_Protector);
        final EditText editText7 = (EditText) viewM12252.findViewById(R.id.MT_Protector);
        C0990 c0990 = (C0990) viewM12252.findViewById(R.id.MT_Protector);
        ((TextInputLayout) viewM12252.findViewById(R.id.MT_Protector)).setEndIconOnClickListener(new View.OnClickListener() { // from class: l.ܽۘ᩻
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                final EditText editText8 = editText;
                final EditText editText9 = editText2;
                final EditText editText10 = editText7;
                C22395.m50286(abstractActivityC5549, new InterfaceC1489() { // from class: l.᩷ۘ᩻
                    @Override // p067l.InterfaceC1489
                    public final void accept(Object obj) {
                        C8983 c8983 = (C8983) obj;
                        editText8.setText(c8983.m20753());
                        editText9.setText(String.valueOf(c8983.m20755()));
                        editText10.setText(c8983.m20754());
                    }
                });
            }
        });
        View viewFindViewById = viewM12252.findViewById(R.id.button1);
        final View viewFindViewById2 = viewM12252.findViewById(R.id.MT_Protector);
        final View viewFindViewById3 = viewM12252.findViewById(R.id.textInputLayout4);
        StringBuilder sb = new StringBuilder();
        sb.append(C7050.m16224(c4547.f14161 == -1 ? R.string.MT_Protector : R.string.MT_Protector));
        sb.append(" ");
        sb.append(C7050.m16224(R.string.MT_Protector));
        textView.setText(sb.toString());
        editText.setText(c4547.f10195);
        editText2.setText(String.valueOf(c4547.f10197));
        editText3.setText(c4547.f10201);
        editText4.setText(c4547.f10199);
        editText5.setText(c4547.f10196);
        editText6.setText(c4547.f10198);
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener = new CompoundButton.OnCheckedChangeListener() { // from class: l.ᩳۘ᩻
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                View view = viewFindViewById2;
                View view2 = viewFindViewById3;
                if (z) {
                    view.setVisibility(0);
                    view2.setVisibility(8);
                } else {
                    view.setVisibility(8);
                    view2.setVisibility(0);
                }
            }
        };
        onCheckedChangeListener.onCheckedChanged(c0990, c4547.f10200);
        c0990.setChecked(c4547.f10200);
        c0990.setOnCheckedChangeListener(onCheckedChangeListener);
        editText7.setText(c4547.f14164);
        AbstractC5769.m12911(editText, editText7);
        C20671 c20671BuildDialog = abstractActivityC5549.buildDialog();
        c20671BuildDialog.m46715(viewM12252);
        c20671BuildDialog.m46736(R.string.MT_Protector, null);
        c20671BuildDialog.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c20671BuildDialog.m46734(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c20671BuildDialog.m46722(false);
        final DialogInterfaceC2564 dialogInterfaceC2564M46732 = c20671BuildDialog.m46732();
        C7204.m16545(dialogInterfaceC2564M46732);
        if (abstractActivityC5549 instanceof ActivityC21312) {
            ActivityC21312 activityC21312 = (ActivityC21312) abstractActivityC5549;
            C7350 c7350M48227 = activityC21312.m48227();
            C8331 c8331M48225 = activityC21312.m48225();
            c7350M48227.m4065((InterfaceC24784) dialogInterfaceC2564M46732);
            c7350M48227.mo4067((Object) null);
            c7350M48227.m4066(dialogInterfaceC2564M46732, new InterfaceC3326() { // from class: l.ܿۘ᩻
                @Override // p067l.InterfaceC3326
                /* JADX INFO: renamed from: ֫ */
                public final void mo4017(Object obj) {
                    String str = (String) obj;
                    if (str != null) {
                        new C11253(abstractActivityC5549, str, editText5).m22250();
                    }
                }
            });
            viewFindViewById.setOnClickListener(new ViewOnClickListenerC15087(4, c8331M48225));
        } else {
            viewFindViewById.setEnabled(false);
            viewFindViewById.setAlpha(0.0f);
        }
        C7050.m16226(editText);
        final C15945 c15945 = new C15945(editText, editText3, c0990, editText5, editText4, editText2, editText6, editText7);
        dialogInterfaceC2564M46732.m3860().setOnClickListener(new View.OnClickListener() { // from class: l.᩻ۘ᩻
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C4547.m9623(c15945, c4547, abstractActivityC5549, dialogInterfaceC2564M46732);
            }
        });
        dialogInterfaceC2564M46732.m3861().setOnClickListener(new View.OnClickListener() { // from class: l.ۜۘ᩻
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C4547 c4548 = (C4547) c15945.get();
                if (c4548 == null) {
                    return;
                }
                AbstractActivityC5549 abstractActivityC55410 = abstractActivityC5549;
                if (C8381.m19540(abstractActivityC55410, c4548)) {
                    new C17286(abstractActivityC55410, c4548).m22250();
                }
            }
        });
    }

    /* JADX INFO: renamed from: ֫ */
    public static C4547 m9619(EditText editText, EditText editText2, C0990 c0990, EditText editText3, EditText editText4, EditText editText5, EditText editText6, EditText editText7) {
        int i;
        if (!AbstractC5769.m12919(editText) || !AbstractC5769.m12916(editText2, R.string.MT_Protector)) {
            return null;
        }
        if (c0990.isChecked()) {
            if (!AbstractC5769.m12916(editText3, R.string.MT_Protector)) {
                return null;
            }
        } else if (!AbstractC5769.m12916(editText4, R.string.MT_Protector)) {
            return null;
        }
        C4547 c4547 = new C4547(-1);
        c4547.f10195 = editText.getText().toString();
        try {
            i = Integer.parseInt(editText5.getText().toString());
        } catch (NumberFormatException unused) {
            i = 22;
        }
        c4547.f10197 = i;
        c4547.f10201 = editText2.getText().toString();
        c4547.f10199 = editText4.getText().toString();
        c4547.f10196 = editText3.getText().toString();
        c4547.f10198 = editText6.getText().toString();
        if (c4547.f10196.length() > 20480) {
            c4547.f10196 = c4547.f10196.substring(0, UMModuleRegister.PUSH_EVENT_VALUE_HIGH);
        }
        c4547.f10200 = c0990.isChecked();
        c4547.f14164 = AbstractC5769.m12910(editText7, c4547.f10195);
        return c4547;
    }

    /* JADX INFO: renamed from: ۧ */
    public static /* synthetic */ void m9623(C15945 c15945, C4547 c4547, AbstractActivityC5549 abstractActivityC5549, DialogInterfaceC2564 dialogInterfaceC2564) {
        C4547 c4548 = (C4547) c15945.get();
        if (c4548 == null) {
            return;
        }
        if (c4547.f14161 == -1) {
            C4547 c4549 = new C4547(AbstractC5769.m12920());
            c4549.mo8541(c4548);
            C14486.m33123(c4549);
            if (abstractActivityC5549 instanceof ActivityC21312) {
                ((ActivityC21312) abstractActivityC5549).m48226();
            }
        } else {
            c4547.mo8541(c4548);
            C14486.m33116();
            if (abstractActivityC5549 instanceof ActivityC21312) {
                ((ActivityC21312) abstractActivityC5549).m48224();
            }
        }
        dialogInterfaceC2564.dismiss();
    }
}
