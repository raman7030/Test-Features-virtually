package p067l;

import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import bin.p000mt.json.JSONObject;
import bin.p000mt.plus.R;
import java.security.SecureRandom;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: renamed from: l.ۚۚ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: NA5M */
/* JADX INFO: loaded from: classes3.dex */
public final class C7269 extends AbstractC5769 {

    /* JADX INFO: renamed from: ܳ֫ */
    public static final C18724 f18956;

    /* JADX INFO: renamed from: ᩻֫ */
    public static final C18724 f18957;

    /* JADX INFO: renamed from: ֫֫ */
    public String f18958;

    /* JADX INFO: renamed from: ۧ֫ */
    public boolean f18959;

    /* JADX INFO: renamed from: ܽ֫ */
    public String f18960;

    /* JADX INFO: renamed from: ܿ֫ */
    public String f18961;

    /* JADX INFO: renamed from: ᩳ֫ */
    public String f18962;

    @Override // p067l.AbstractC5769
    /* JADX INFO: renamed from: ᩳ */
    public final String mo8545() {
        return "WebDav";
    }

    public C7269(int i) {
        super(i);
        this.f18962 = "";
        this.f18961 = "";
        this.f18958 = "";
        this.f18960 = "";
        this.f18959 = false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7269(JSONObject jSONObject) {
        super(jSONObject);
        AbstractC5769.m12918(jSONObject, "rk", "2");
        AbstractC5769.m12918(jSONObject, "ip", "5");
        AbstractC5769.m12914(jSONObject, "hs", "7");
        AbstractC5769.m12914(jSONObject, "mt", "8");
        this.f18962 = "";
        this.f18961 = "";
        this.f18958 = "";
        this.f18960 = "";
        this.f18959 = false;
        this.f18962 = m16645(jSONObject.getString("1"));
        this.f18961 = jSONObject.getString("3");
        this.f18958 = jSONObject.getString("4");
        this.f18960 = jSONObject.getString("9", "");
        this.f18959 = jSONObject.getBoolean("6");
    }

    @Override // p067l.AbstractC5769
    /* JADX INFO: renamed from: ֫ */
    public final String mo8538() {
        if (TextUtils.isEmpty(this.f18961)) {
            return "adv:" + this.f18962;
        }
        return "adv:" + this.f18961 + "@" + this.f18962;
    }

    /* JADX INFO: renamed from: ۢ */
    public final C18724 m16647() {
        return this.f18959 ? f18957 : f18956;
    }

    @Override // p067l.AbstractC5769
    /* JADX INFO: renamed from: ܳ */
    public final JSONObject mo8542() {
        JSONObject jSONObjectMo8542 = super.mo8542();
        jSONObjectMo8542.put("1", this.f18962);
        jSONObjectMo8542.put("3", this.f18961);
        jSONObjectMo8542.put("4", this.f18958);
        jSONObjectMo8542.put("6", this.f18959);
        jSONObjectMo8542.put("9", this.f18960);
        return jSONObjectMo8542;
    }

    @Override // p067l.AbstractC5769
    public final String getName() {
        return this.f14164;
    }

    @Override // p067l.AbstractC5769
    /* JADX INFO: renamed from: ܽ */
    public final String mo8543() {
        return this.f18962;
    }

    @Override // p067l.AbstractC5769
    /* JADX INFO: renamed from: ֫ */
    public final void mo8541(AbstractC5769 abstractC5769) {
        super.mo8541(abstractC5769);
        if (abstractC5769 instanceof C7269) {
            C7269 c7269 = (C7269) abstractC5769;
            this.f18962 = c7269.f18962;
            this.f18961 = c7269.f18961;
            this.f18958 = c7269.f18958;
            this.f18960 = c7269.f18960;
            this.f18959 = c7269.f18959;
        }
    }

    @Override // p067l.AbstractC5769
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C7269.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        C7269 c7269 = (C7269) obj;
        return this.f18959 == c7269.f18959 && C12826.equals(this.f18962, c7269.f18962) && C12826.equals(this.f18961, c7269.f18961) && C12826.equals(this.f18958, c7269.f18958) && C12826.equals(this.f18960, c7269.f18960);
    }

    @Override // p067l.AbstractC5769
    public final int hashCode() {
        return C21720.m49003(C21720.m49003(C21720.m49003(C21720.m49003(super.hashCode() * 31, 31, this.f18962), 31, this.f18961), 31, this.f18958), 31, this.f18960) + (this.f18959 ? 1231 : 1237);
    }

    @Override // p067l.AbstractC5769
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC5375 mo8539(int i) {
        return new C9951(i, clone());
    }

    @Override // p067l.AbstractC5769
    public final C21265 getIcon() {
        return C21265.f66852;
    }

    @Override // p067l.AbstractC5769
    /* JADX INFO: renamed from: ܿ */
    public final String mo8544() {
        return C10965.m25286(new StringBuilder("webdav@"), this.f14164, " ");
    }

    @Override // p067l.AbstractC5769
    /* JADX INFO: renamed from: ֫ */
    public final void mo8540(AbstractActivityC5549 abstractActivityC5549) {
        m16643(abstractActivityC5549, this);
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m16646(AbstractActivityC5549 abstractActivityC5549) {
        m16643(abstractActivityC5549, new C7269(-1));
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m16643(final AbstractActivityC5549 abstractActivityC5549, C7269 c7269) {
        View viewM12252 = abstractActivityC5549.m12252(R.layout.MT_Protector);
        TextView textView = (TextView) viewM12252.findViewById(R.id.MT_Protector);
        EditText editText = (EditText) viewM12252.findViewById(R.id.MT_Protector);
        EditText editText2 = (EditText) viewM12252.findViewById(R.id.MT_Protector);
        EditText editText3 = (EditText) viewM12252.findViewById(R.id.MT_Protector);
        EditText editText4 = (EditText) viewM12252.findViewById(R.id.MT_Protector);
        EditText editText5 = (EditText) viewM12252.findViewById(R.id.MT_Protector);
        EditText editText6 = (EditText) viewM12252.findViewById(R.id.MT_Protector);
        C0990 c0990 = (C0990) viewM12252.findViewById(R.id.MT_Protector);
        C0990 c0991 = (C0990) viewM12252.findViewById(R.id.MT_Protector);
        C0990 c0992 = (C0990) viewM12252.findViewById(R.id.MT_Protector);
        C7110 c7110M16377 = C7110.m16377(abstractActivityC5549, (TextView) viewM12252.findViewById(R.id.MT_Protector), c7269);
        textView.setText(C7050.m16224(c7269.f14161 == -1 ? R.string.MT_Protector : R.string.MT_Protector).concat(" WebDav"));
        editText.setText(c7269.f18962);
        editText2.setText(c7269.f18961);
        editText3.setText(c7269.f18958);
        editText4.setText(c7269.f18960);
        editText5.setText(c7269.f14159);
        editText6.setText(c7269.f14164);
        c0990.setChecked(c7269.f18959);
        c0991.setChecked(c7269.f14163);
        c0992.setChecked(c7269.f14154);
        c0992.setOnCheckedChangeListener(new C4122(1));
        editText.setOnFocusChangeListener(new ViewOnFocusChangeListenerC21957(1, editText));
        editText.addTextChangedListener(new C20010(c0990));
        AbstractC5769.m12912(editText, editText6, new C12809(2));
        C20671 c20671BuildDialog = abstractActivityC5549.buildDialog();
        c20671BuildDialog.m46715(viewM12252);
        c20671BuildDialog.m46736(R.string.MT_Protector, null);
        c20671BuildDialog.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c20671BuildDialog.m46734(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c20671BuildDialog.m46722(false);
        DialogInterfaceC2564 dialogInterfaceC2564M46732 = c20671BuildDialog.m46732();
        C7204.m16545(dialogInterfaceC2564M46732);
        C7050.m16226(editText);
        final C4587 c4587 = new C4587(editText, editText2, editText3, editText4, editText5, editText6, c0990, c0991, c0992, c7110M16377);
        dialogInterfaceC2564M46732.m3860().setOnClickListener(new ViewOnClickListenerC11661(c4587, c7269, dialogInterfaceC2564M46732, 1));
        dialogInterfaceC2564M46732.m3861().setOnClickListener(new View.OnClickListener() { // from class: l.ۘۚ᩻
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C7269 c72610 = (C7269) c4587.get();
                if (c72610 == null) {
                    return;
                }
                AbstractActivityC5549 abstractActivityC55410 = abstractActivityC5549;
                if (C8381.m19540(abstractActivityC55410, c72610)) {
                    new C20681(abstractActivityC55410, c72610).m22250();
                }
            }
        });
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m16642(C4587 c4587, C7269 c7269, DialogInterfaceC2564 dialogInterfaceC2564) {
        C7269 c72610 = (C7269) c4587.get();
        if (c72610 == null) {
            return;
        }
        if (c7269.f14161 == -1) {
            C7269 c72611 = new C7269(AbstractC5769.m12920());
            c72611.mo8541(c72610);
            C14486.m33123(c72611);
        } else {
            c7269.mo8541(c72610);
            C14486.m33116();
        }
        dialogInterfaceC2564.dismiss();
    }

    /* JADX INFO: renamed from: ۧ */
    public static String m16645(String str) {
        String strTrim = str.trim();
        if (strTrim.isEmpty()) {
            return "";
        }
        if (!C11567.m26633("http://", strTrim) && !C11567.m26633("https://", strTrim)) {
            strTrim = "http://" + C11567.m26632(strTrim);
        }
        return (strTrim.equalsIgnoreCase("http://") || strTrim.equalsIgnoreCase("https://")) ? "" : C11567.m26624(strTrim);
    }

    /* JADX INFO: renamed from: ۧ */
    public static CharSequence m16644(CharSequence charSequence) {
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
        C19395 c19395 = new C19395();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        c19395.m44145(20000L, timeUnit);
        c19395.m44153(60000L, timeUnit);
        c19395.m44155(120000L, timeUnit);
        c19395.m44147(new C9152());
        c19395.m44152(new C7938());
        C18724 c18724M44143 = c19395.m44143();
        f18956 = c18724M44143;
        try {
            TrustManager[] trustManagerArr = {new C2574()};
            SSLContext sSLContext = SSLContext.getInstance("SSL");
            sSLContext.init(null, trustManagerArr, new SecureRandom());
            C19395 c19395M42717 = c18724M44143.m42717();
            c19395M42717.m44148(new C15186(sSLContext.getSocketFactory()), (X509TrustManager) trustManagerArr[0]);
            c19395M42717.m44151(new C17326());
            f18957 = c19395M42717.m44143();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static C7269 m16640(EditText editText, EditText editText2, EditText editText3, EditText editText4, EditText editText5, EditText editText6, C0990 c0990, C0990 c0991, C0990 c0992, C7110 c7110) {
        editText.setText(m16645(editText.getText().toString()));
        if (!AbstractC5769.m12916(editText, R.string.MT_Protector)) {
            return null;
        }
        C7269 c7269 = new C7269(-1);
        c7269.f18962 = editText.getText().toString();
        c7269.f18961 = editText2.getText().toString();
        c7269.f18958 = editText3.getText().toString();
        c7269.f18960 = editText4.getText().toString();
        c7269.f14159 = editText5.getText().toString();
        c7269.f14164 = editText6.length() > 0 ? editText6.getText().toString() : m16644((CharSequence) c7269.f18962).toString();
        c7269.f18959 = c0990.isChecked();
        c7269.f14163 = c0991.isChecked();
        c7269.f14154 = c0992.isChecked();
        c7269.m12922(c7110);
        return c7269;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m16641(EditText editText, boolean z) {
        if (z) {
            return;
        }
        editText.setText(m16645(editText.getText().toString()));
    }
}
