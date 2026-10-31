package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import bin.mt.json.JSONObject;
import bin.mt.plus.R;
import com.google.android.material.textfield.TextInputLayout;
import com.umeng.commonsdk.framework.UMModuleRegister;

/* JADX INFO: renamed from: l.ۖۘ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 27JL */
/* JADX INFO: loaded from: classes2.dex */
public final class C2292 extends AbstractC3577 {

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public String f7409;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public String f7410;

    /* JADX INFO: renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public int f7411;

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public String f7412;

    /* JADX INFO: renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public String f7413;

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public boolean f7414;

    /* JADX INFO: renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public String f7415;

    public C2292(int i) {
        super(i);
        this.f7409 = "";
        this.f7411 = 22;
        this.f7415 = "root";
        this.f7413 = "";
        this.f7410 = "";
        this.f7412 = "";
        this.f7414 = false;
    }

    public C2292(JSONObject jSONObject) {
        super(jSONObject);
        this.f7409 = "";
        this.f7411 = 22;
        this.f7415 = "root";
        this.f7413 = "";
        this.f7410 = "";
        this.f7412 = "";
        this.f7414 = false;
        this.f7409 = jSONObject.getString("1");
        this.f7411 = jSONObject.getInt("2");
        this.f7415 = jSONObject.getString("3");
        this.f7413 = jSONObject.getString("4");
        this.f7410 = jSONObject.getString("5");
        this.f7412 = jSONObject.getString("6", "");
        this.f7414 = jSONObject.getBoolean("7");
    }

    @Override // l.AbstractC3577
    /* JADX INFO: renamed from: ֫ */
    public final String mo6365() {
        if (this.f7411 == 22) {
            return "sshj://" + this.f7415 + "@" + this.f7409;
        }
        return "sshj://" + this.f7415 + "@" + this.f7409 + ":" + this.f7411;
    }

    @Override // l.AbstractC3577
    /* JADX INFO: renamed from: ܳ */
    public final JSONObject mo6369() {
        JSONObject jSONObjectMo6369 = super.mo6369();
        jSONObjectMo6369.put("1", this.f7409);
        jSONObjectMo6369.put("2", this.f7411);
        jSONObjectMo6369.put("3", this.f7415);
        jSONObjectMo6369.put("4", this.f7413);
        jSONObjectMo6369.put("5", this.f7410);
        jSONObjectMo6369.put("6", this.f7412);
        jSONObjectMo6369.put("7", this.f7414);
        return jSONObjectMo6369;
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final String m7556() {
        if (this.f7412.isEmpty()) {
            return null;
        }
        return this.f7412;
    }

    @Override // l.AbstractC3577
    /* JADX INFO: renamed from: ᩳ */
    public final String mo6372() {
        return C4925.m14327(R.string.MT_Protector);
    }

    @Override // l.AbstractC3577
    public final String getName() {
        return this.f11359;
    }

    @Override // l.AbstractC3577
    /* JADX INFO: renamed from: ֫ */
    public final void mo6368(AbstractC3577 abstractC3577) {
        super.mo6368(abstractC3577);
        if (abstractC3577 instanceof C2292) {
            C2292 c2292 = (C2292) abstractC3577;
            this.f7409 = c2292.f7409;
            this.f7411 = c2292.f7411;
            this.f7415 = c2292.f7415;
            this.f7413 = c2292.f7413;
            this.f7410 = c2292.f7410;
            this.f7412 = c2292.f7412;
            this.f7414 = c2292.f7414;
        }
    }

    @Override // l.AbstractC3577
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2292.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        C2292 c2292 = (C2292) obj;
        return this.f7411 == c2292.f7411 && this.f7414 == c2292.f7414 && C11003.equals(this.f7409, c2292.f7409) && C11003.equals(this.f7415, c2292.f7415) && C11003.equals(this.f7413, c2292.f7413) && C11003.equals(this.f7410, c2292.f7410) && C11003.equals(this.f7412, c2292.f7412);
    }

    @Override // l.AbstractC3577
    public final int hashCode() {
        return C20361.m46680(C20361.m46680(C20361.m46680(C20361.m46680((C20361.m46680(super.hashCode() * 31, 31, this.f7409) + this.f7411) * 31, 31, this.f7415), 31, this.f7413), 31, this.f7410), 31, this.f7412) + (this.f7414 ? 1231 : 1237);
    }

    @Override // l.AbstractC3577
    /* JADX INFO: renamed from: ܽ */
    public final String mo6370() {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC3577
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC3163 mo6366(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC3577
    public final C19883 getIcon() {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC3577
    /* JADX INFO: renamed from: ܿ */
    public final String mo6371() {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC3577
    /* JADX INFO: renamed from: ֫ */
    public final void mo6367(AbstractActivityC3346 abstractActivityC3346) {
        m7552(abstractActivityC3346, this);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m7554(ActivityC19932 activityC19932) {
        m7552(activityC19932, new C2292(-1));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m7552(final AbstractActivityC3346 abstractActivityC3346, final C2292 c2292) {
        View viewM10216 = abstractActivityC3346.m10216(R.layout.MT_Protector);
        viewM10216.findViewById(R.id.MT_Protector).setVisibility(8);
        viewM10216.findViewById(R.id.MT_Protector).setVisibility(8);
        viewM10216.findViewById(R.id.MT_Protector).setVisibility(8);
        viewM10216.findViewById(R.id.MT_Protector).setVisibility(8);
        viewM10216.findViewById(R.id.MT_Protector).setVisibility(8);
        viewM10216.findViewById(R.id.MT_Protector).setVisibility(8);
        viewM10216.findViewById(R.id.MT_Protector).setVisibility(8);
        TextView textView = (TextView) viewM10216.findViewById(R.id.MT_Protector);
        final EditText editText = (EditText) viewM10216.findViewById(R.id.MT_Protector);
        final EditText editText2 = (EditText) viewM10216.findViewById(R.id.MT_Protector);
        EditText editText3 = (EditText) viewM10216.findViewById(R.id.MT_Protector);
        EditText editText4 = (EditText) viewM10216.findViewById(R.id.MT_Protector);
        final EditText editText5 = (EditText) viewM10216.findViewById(R.id.MT_Protector);
        EditText editText6 = (EditText) viewM10216.findViewById(R.id.MT_Protector);
        final EditText editText7 = (EditText) viewM10216.findViewById(R.id.MT_Protector);
        C2978 c2978 = (C2978) viewM10216.findViewById(R.id.MT_Protector);
        ((TextInputLayout) viewM10216.findViewById(R.id.MT_Protector)).setEndIconOnClickListener(new View.OnClickListener() { // from class: l.ܽۘ᩻
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                final EditText editText8 = editText;
                final EditText editText9 = editText2;
                final EditText editText10 = editText7;
                C21071.m47956(abstractActivityC3346, new InterfaceC13041() { // from class: l.᩷ۘ᩻
                    @Override // l.InterfaceC13041
                    public final void accept(Object obj) {
                        C6959 c6959 = (C6959) obj;
                        editText8.setText(c6959.m18799());
                        editText9.setText(String.valueOf(c6959.m18801()));
                        editText10.setText(c6959.m18800());
                    }
                });
            }
        });
        View viewFindViewById = viewM10216.findViewById(R.id.button1);
        final View viewFindViewById2 = viewM10216.findViewById(R.id.MT_Protector);
        final View viewFindViewById3 = viewM10216.findViewById(R.id.textInputLayout4);
        StringBuilder sb = new StringBuilder();
        sb.append(C4925.m14327(c2292.f11356 == -1 ? R.string.MT_Protector : R.string.MT_Protector));
        sb.append(" ");
        sb.append(C4925.m14327(R.string.MT_Protector));
        textView.setText(sb.toString());
        editText.setText(c2292.f7409);
        editText2.setText(String.valueOf(c2292.f7411));
        editText3.setText(c2292.f7415);
        editText4.setText(c2292.f7413);
        editText5.setText(c2292.f7410);
        editText6.setText(c2292.f7412);
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
        onCheckedChangeListener.onCheckedChanged(c2978, c2292.f7414);
        c2978.setChecked(c2292.f7414);
        c2978.setOnCheckedChangeListener(onCheckedChangeListener);
        editText7.setText(c2292.f11359);
        AbstractC3577.m10934(editText, editText7);
        C19258 c19258BuildDialog = abstractActivityC3346.buildDialog();
        c19258BuildDialog.m44421(viewM10216);
        c19258BuildDialog.m44442(R.string.MT_Protector, null);
        c19258BuildDialog.m44434(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c19258BuildDialog.m44440(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c19258BuildDialog.m44428(false);
        final DialogInterfaceC0206 dialogInterfaceC0206M44438 = c19258BuildDialog.m44438();
        C5088.m14637(dialogInterfaceC0206M44438);
        if (abstractActivityC3346 instanceof ActivityC19932) {
            ActivityC19932 activityC19932 = (ActivityC19932) abstractActivityC3346;
            C5242 c5242M45914 = activityC19932.m45914();
            C6273 c6273M45912 = activityC19932.m45912();
            c5242M45914.m1667((InterfaceC23586) dialogInterfaceC0206M44438);
            c5242M45914.mo1669((Object) null);
            c5242M45914.m1668(dialogInterfaceC0206M44438, new InterfaceC1008() { // from class: l.ܿۘ᩻
                @Override // l.InterfaceC1008
                /* JADX INFO: renamed from: ֫ */
                public final void mo1617(Object obj) {
                    String str = (String) obj;
                    if (str != null) {
                        new C9348(abstractActivityC3346, str, editText5).m20274();
                    }
                }
            });
            viewFindViewById.setOnClickListener(new ViewOnClickListenerC13382(4, c6273M45912));
        } else {
            viewFindViewById.setEnabled(false);
            viewFindViewById.setAlpha(0.0f);
        }
        C4925.m14329(editText);
        final C14285 c14285 = new C14285(editText, editText3, c2978, editText5, editText4, editText2, editText6, editText7);
        dialogInterfaceC0206M44438.m1447().setOnClickListener(new View.OnClickListener() { // from class: l.᩻ۘ᩻
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C2292.m7555(c14285, c2292, abstractActivityC3346, dialogInterfaceC0206M44438);
            }
        });
        dialogInterfaceC0206M44438.m1448().setOnClickListener(new View.OnClickListener() { // from class: l.ۜۘ᩻
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C2292 c2293 = (C2292) c14285.get();
                if (c2293 == null) {
                    return;
                }
                AbstractActivityC3346 abstractActivityC3347 = abstractActivityC3346;
                if (C6326.m17600(abstractActivityC3347, c2293)) {
                    new C15696(abstractActivityC3347, c2293).m20274();
                }
            }
        });
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C2292 m7551(EditText editText, EditText editText2, C2978 c2978, EditText editText3, EditText editText4, EditText editText5, EditText editText6, EditText editText7) {
        int i;
        if (!AbstractC3577.m10942(editText) || !AbstractC3577.m10939(editText2, R.string.MT_Protector)) {
            return null;
        }
        if (c2978.isChecked()) {
            if (!AbstractC3577.m10939(editText3, R.string.MT_Protector)) {
                return null;
            }
        } else if (!AbstractC3577.m10939(editText4, R.string.MT_Protector)) {
            return null;
        }
        C2292 c2292 = new C2292(-1);
        c2292.f7409 = editText.getText().toString();
        try {
            i = Integer.parseInt(editText5.getText().toString());
        } catch (NumberFormatException unused) {
            i = 22;
        }
        c2292.f7411 = i;
        c2292.f7415 = editText2.getText().toString();
        c2292.f7413 = editText4.getText().toString();
        c2292.f7410 = editText3.getText().toString();
        c2292.f7412 = editText6.getText().toString();
        if (c2292.f7410.length() > 20480) {
            c2292.f7410 = c2292.f7410.substring(0, UMModuleRegister.PUSH_EVENT_VALUE_HIGH);
        }
        c2292.f7414 = c2978.isChecked();
        c2292.f11359 = AbstractC3577.m10933(editText7, c2292.f7409);
        return c2292;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m7555(C14285 c14285, C2292 c2292, AbstractActivityC3346 abstractActivityC3346, DialogInterfaceC0206 dialogInterfaceC0206) {
        C2292 c2293 = (C2292) c14285.get();
        if (c2293 == null) {
            return;
        }
        if (c2292.f11356 == -1) {
            C2292 c2294 = new C2292(AbstractC3577.m10943());
            c2294.mo6368(c2293);
            C12749.m31039(c2294);
            if (abstractActivityC3346 instanceof ActivityC19932) {
                ((ActivityC19932) abstractActivityC3346).m45913();
            }
        } else {
            c2292.mo6368(c2293);
            C12749.m31032();
            if (abstractActivityC3346 instanceof ActivityC19932) {
                ((ActivityC19932) abstractActivityC3346).m45911();
            }
        }
        dialogInterfaceC0206.dismiss();
    }
}
