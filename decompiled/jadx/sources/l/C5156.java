package l;

import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import bin.mt.json.JSONObject;
import bin.mt.plus.R;
import java.security.SecureRandom;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: renamed from: l.ۚۚ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: NA5M */
/* JADX INFO: loaded from: classes3.dex */
public final class C5156 extends AbstractC3577 {

    /* JADX INFO: renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public static final C17209 f16117;

    /* JADX INFO: renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public static final C17209 f16118;

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public String f16119;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public boolean f16120;

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public String f16121;

    /* JADX INFO: renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public String f16122;

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public String f16123;

    @Override // l.AbstractC3577
    /* JADX INFO: renamed from: ᩳ */
    public final String mo6372() {
        return "WebDav";
    }

    public C5156(int i) {
        super(i);
        this.f16123 = "";
        this.f16122 = "";
        this.f16119 = "";
        this.f16121 = "";
        this.f16120 = false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5156(JSONObject jSONObject) {
        super(jSONObject);
        AbstractC3577.m10941(jSONObject, "rk", "2");
        AbstractC3577.m10941(jSONObject, "ip", "5");
        AbstractC3577.m10937(jSONObject, "hs", "7");
        AbstractC3577.m10937(jSONObject, "mt", "8");
        this.f16123 = "";
        this.f16122 = "";
        this.f16119 = "";
        this.f16121 = "";
        this.f16120 = false;
        this.f16123 = m14737(jSONObject.getString("1"));
        this.f16122 = jSONObject.getString("3");
        this.f16119 = jSONObject.getString("4");
        this.f16121 = jSONObject.getString("9", "");
        this.f16120 = jSONObject.getBoolean("6");
    }

    @Override // l.AbstractC3577
    /* JADX INFO: renamed from: ֫ */
    public final String mo6365() {
        if (TextUtils.isEmpty(this.f16122)) {
            return "adv:" + this.f16123;
        }
        return "adv:" + this.f16122 + "@" + this.f16123;
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C17209 m14739() {
        return this.f16120 ? f16118 : f16117;
    }

    @Override // l.AbstractC3577
    /* JADX INFO: renamed from: ܳ */
    public final JSONObject mo6369() {
        JSONObject jSONObjectMo6369 = super.mo6369();
        jSONObjectMo6369.put("1", this.f16123);
        jSONObjectMo6369.put("3", this.f16122);
        jSONObjectMo6369.put("4", this.f16119);
        jSONObjectMo6369.put("6", this.f16120);
        jSONObjectMo6369.put("9", this.f16121);
        return jSONObjectMo6369;
    }

    @Override // l.AbstractC3577
    public final String getName() {
        return this.f11359;
    }

    @Override // l.AbstractC3577
    /* JADX INFO: renamed from: ܽ */
    public final String mo6370() {
        return this.f16123;
    }

    @Override // l.AbstractC3577
    /* JADX INFO: renamed from: ֫ */
    public final void mo6368(AbstractC3577 abstractC3577) {
        super.mo6368(abstractC3577);
        if (abstractC3577 instanceof C5156) {
            C5156 c5156 = (C5156) abstractC3577;
            this.f16123 = c5156.f16123;
            this.f16122 = c5156.f16122;
            this.f16119 = c5156.f16119;
            this.f16121 = c5156.f16121;
            this.f16120 = c5156.f16120;
        }
    }

    @Override // l.AbstractC3577
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5156.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        C5156 c5156 = (C5156) obj;
        return this.f16120 == c5156.f16120 && C11003.equals(this.f16123, c5156.f16123) && C11003.equals(this.f16122, c5156.f16122) && C11003.equals(this.f16119, c5156.f16119) && C11003.equals(this.f16121, c5156.f16121);
    }

    @Override // l.AbstractC3577
    public final int hashCode() {
        return C20361.m46680(C20361.m46680(C20361.m46680(C20361.m46680(super.hashCode() * 31, 31, this.f16123), 31, this.f16122), 31, this.f16119), 31, this.f16121) + (this.f16120 ? 1231 : 1237);
    }

    @Override // l.AbstractC3577
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC3163 mo6366(int i) {
        return new C7978(i, clone());
    }

    @Override // l.AbstractC3577
    public final C19883 getIcon() {
        return C19883.f64216;
    }

    @Override // l.AbstractC3577
    /* JADX INFO: renamed from: ܿ */
    public final String mo6371() {
        return C9045.m23341(new StringBuilder("webdav@"), this.f11359, " ");
    }

    @Override // l.AbstractC3577
    /* JADX INFO: renamed from: ֫ */
    public final void mo6367(AbstractActivityC3346 abstractActivityC3346) {
        m14735(abstractActivityC3346, this);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m14738(AbstractActivityC3346 abstractActivityC3346) {
        m14735(abstractActivityC3346, new C5156(-1));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m14735(final AbstractActivityC3346 abstractActivityC3346, C5156 c5156) {
        View viewM10216 = abstractActivityC3346.m10216(R.layout.MT_Protector);
        TextView textView = (TextView) viewM10216.findViewById(R.id.MT_Protector);
        EditText editText = (EditText) viewM10216.findViewById(R.id.MT_Protector);
        EditText editText2 = (EditText) viewM10216.findViewById(R.id.MT_Protector);
        EditText editText3 = (EditText) viewM10216.findViewById(R.id.MT_Protector);
        EditText editText4 = (EditText) viewM10216.findViewById(R.id.MT_Protector);
        EditText editText5 = (EditText) viewM10216.findViewById(R.id.MT_Protector);
        EditText editText6 = (EditText) viewM10216.findViewById(R.id.MT_Protector);
        C2978 c2978 = (C2978) viewM10216.findViewById(R.id.MT_Protector);
        C2978 c2979 = (C2978) viewM10216.findViewById(R.id.MT_Protector);
        C2978 c29710 = (C2978) viewM10216.findViewById(R.id.MT_Protector);
        C4988 c4988M14473 = C4988.m14473(abstractActivityC3346, (TextView) viewM10216.findViewById(R.id.MT_Protector), c5156);
        textView.setText(C4925.m14327(c5156.f11356 == -1 ? R.string.MT_Protector : R.string.MT_Protector).concat(" WebDav"));
        editText.setText(c5156.f16123);
        editText2.setText(c5156.f16122);
        editText3.setText(c5156.f16119);
        editText4.setText(c5156.f16121);
        editText5.setText(c5156.f11354);
        editText6.setText(c5156.f11359);
        c2978.setChecked(c5156.f16120);
        c2979.setChecked(c5156.f11358);
        c29710.setChecked(c5156.f11349);
        c29710.setOnCheckedChangeListener(new C1845(1));
        editText.setOnFocusChangeListener(new ViewOnFocusChangeListenerC20611(1, editText));
        editText.addTextChangedListener(new C18562(c2978));
        AbstractC3577.m10935(editText, editText6, new C10985(2));
        C19258 c19258BuildDialog = abstractActivityC3346.buildDialog();
        c19258BuildDialog.m44421(viewM10216);
        c19258BuildDialog.m44442(R.string.MT_Protector, null);
        c19258BuildDialog.m44434(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c19258BuildDialog.m44440(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c19258BuildDialog.m44428(false);
        DialogInterfaceC0206 dialogInterfaceC0206M44438 = c19258BuildDialog.m44438();
        C5088.m14637(dialogInterfaceC0206M44438);
        C4925.m14329(editText);
        final C2334 c2334 = new C2334(editText, editText2, editText3, editText4, editText5, editText6, c2978, c2979, c29710, c4988M14473);
        dialogInterfaceC0206M44438.m1447().setOnClickListener(new ViewOnClickListenerC9777(c2334, c5156, dialogInterfaceC0206M44438, 1));
        dialogInterfaceC0206M44438.m1448().setOnClickListener(new View.OnClickListener() { // from class: l.ۘۚ᩻
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C5156 c5157 = (C5156) c2334.get();
                if (c5157 == null) {
                    return;
                }
                AbstractActivityC3346 abstractActivityC3347 = abstractActivityC3346;
                if (C6326.m17600(abstractActivityC3347, c5157)) {
                    new C19268(abstractActivityC3347, c5157).m20274();
                }
            }
        });
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m14734(C2334 c2334, C5156 c5156, DialogInterfaceC0206 dialogInterfaceC0206) {
        C5156 c5157 = (C5156) c2334.get();
        if (c5157 == null) {
            return;
        }
        if (c5156.f11356 == -1) {
            C5156 c5158 = new C5156(AbstractC3577.m10943());
            c5158.mo6368(c5157);
            C12749.m31039(c5158);
        } else {
            c5156.mo6368(c5157);
            C12749.m31032();
        }
        dialogInterfaceC0206.dismiss();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m14737(String str) {
        String strTrim = str.trim();
        if (strTrim.isEmpty()) {
            return "";
        }
        if (!C9679.m24619("http://", strTrim) && !C9679.m24619("https://", strTrim)) {
            strTrim = "http://" + C9679.m24618(strTrim);
        }
        return (strTrim.equalsIgnoreCase("http://") || strTrim.equalsIgnoreCase("https://")) ? "" : C9679.m24610(strTrim);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static CharSequence m14736(CharSequence charSequence) {
        int iIndexOf;
        int iIndexOf2;
        int i;
        int iIndexOf3;
        String str = ((Object) charSequence) + "/";
        String strSubstring = null;
        if (str != null && (iIndexOf2 = str.indexOf("//")) != -1 && (iIndexOf3 = str.indexOf("/", (i = iIndexOf2 + 2))) != -1) {
            strSubstring = str.substring(i, iIndexOf3);
        }
        if (strSubstring != null && (iIndexOf = strSubstring.indexOf(58)) != -1) {
            strSubstring = strSubstring.substring(0, iIndexOf);
        }
        return strSubstring == null ? charSequence : strSubstring;
    }

    static {
        C17915 c17915 = new C17915();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        c17915.m41896(20000L, timeUnit);
        c17915.m41904(60000L, timeUnit);
        c17915.m41906(120000L, timeUnit);
        c17915.m41898(new C7138());
        c17915.m41903(new C5860());
        C17209 c17209M41894 = c17915.m41894();
        f16117 = c17209M41894;
        try {
            TrustManager[] trustManagerArr = {new C0216()};
            SSLContext sSLContext = SSLContext.getInstance("SSL");
            sSLContext.init(null, trustManagerArr, new SecureRandom());
            C17915 c17915M40470 = c17209M41894.m40470();
            c17915M40470.m41899(new C13487(sSLContext.getSocketFactory()), (X509TrustManager) trustManagerArr[0]);
            c17915M40470.m41902(new C15738());
            f16118 = c17915M40470.m41894();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C5156 m14732(EditText editText, EditText editText2, EditText editText3, EditText editText4, EditText editText5, EditText editText6, C2978 c2978, C2978 c2979, C2978 c29710, C4988 c4988) {
        editText.setText(m14737(editText.getText().toString()));
        if (!AbstractC3577.m10939(editText, R.string.MT_Protector)) {
            return null;
        }
        C5156 c5156 = new C5156(-1);
        c5156.f16123 = editText.getText().toString();
        c5156.f16122 = editText2.getText().toString();
        c5156.f16119 = editText3.getText().toString();
        c5156.f16121 = editText4.getText().toString();
        c5156.f11354 = editText5.getText().toString();
        c5156.f11359 = editText6.length() > 0 ? editText6.getText().toString() : m14736((CharSequence) c5156.f16123).toString();
        c5156.f16120 = c2978.isChecked();
        c5156.f11358 = c2979.isChecked();
        c5156.f11349 = c29710.isChecked();
        c5156.m10945(c4988);
        return c5156;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m14733(EditText editText, boolean z) {
        if (z) {
            return;
        }
        editText.setText(m14737(editText.getText().toString()));
    }
}
