package p067l;

import android.text.TextWatcher;
import android.view.ViewParent;
import android.widget.EditText;
import bin.p000mt.json.JSONArray;
import bin.p000mt.json.JSONObject;
import bin.p000mt.plus.R;
import com.google.android.material.textfield.TextInputLayout;
import com.tencent.p062mm.opensdk.constants.ConstantsAPI;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ۗ᩻᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 5AG9 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5769 implements Cloneable {

    /* JADX INFO: renamed from: ۗ */
    public long f14152;

    /* JADX INFO: renamed from: ۙ */
    public String f14153;

    /* JADX INFO: renamed from: ۛ */
    public boolean f14154;

    /* JADX INFO: renamed from: ۟ */
    public boolean f14155;

    /* JADX INFO: renamed from: ۤ */
    public int f14156;

    /* JADX INFO: renamed from: ۨ */
    public boolean f14157;

    /* JADX INFO: renamed from: ۫ */
    public boolean f14158;

    /* JADX INFO: renamed from: ۬ */
    public String f14159;

    /* JADX INFO: renamed from: ܰ */
    public HashMap f14160;

    /* JADX INFO: renamed from: ᩶ */
    public final int f14161;

    /* JADX INFO: renamed from: ᩸ */
    public boolean f14162;

    /* JADX INFO: renamed from: ᩹ */
    public boolean f14163;

    /* JADX INFO: renamed from: ᩺ */
    public String f14164;

    public abstract C21265 getIcon();

    public abstract String getName();

    /* JADX INFO: renamed from: ֫ */
    public abstract String mo8538();

    /* JADX INFO: renamed from: ֫ */
    public abstract AbstractC5375 mo8539(int i);

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo8540(AbstractActivityC5549 abstractActivityC5549);

    /* JADX INFO: renamed from: ۜ */
    public boolean mo12921() {
        return this instanceof C4209;
    }

    /* JADX INFO: renamed from: ܽ */
    public abstract String mo8543();

    /* JADX INFO: renamed from: ܿ */
    public abstract String mo8544();

    /* JADX INFO: renamed from: ᩳ */
    public abstract String mo8545();

    public AbstractC5769(int i) {
        this.f14164 = "";
        this.f14159 = "";
        this.f14163 = false;
        this.f14154 = true;
        this.f14162 = true;
        this.f14158 = true;
        this.f14157 = true;
        this.f14153 = "10MB";
        this.f14152 = m12909("10MB");
        this.f14156 = 10;
        this.f14155 = false;
        this.f14160 = new HashMap();
        this.f14161 = i;
    }

    public AbstractC5769(JSONObject jSONObject) {
        this.f14164 = "";
        this.f14159 = "";
        this.f14163 = false;
        this.f14154 = true;
        this.f14162 = true;
        this.f14158 = true;
        this.f14157 = true;
        this.f14153 = "10MB";
        this.f14152 = m12909("10MB");
        this.f14156 = 10;
        this.f14155 = false;
        this.f14160 = new HashMap();
        this.f14161 = jSONObject.getInt("id");
        this.f14164 = jSONObject.getString("rk");
        this.f14159 = jSONObject.getString("ip");
        if (jSONObject.contains("hs")) {
            this.f14163 = jSONObject.getBoolean("hs");
        }
        if (jSONObject.contains("mt")) {
            this.f14154 = jSONObject.getBoolean("mt");
        }
        if (jSONObject.contains("fg")) {
            this.f14162 = jSONObject.getBoolean("fg");
        }
        if (jSONObject.contains("lt")) {
            this.f14158 = jSONObject.getBoolean("lt");
        }
        if (jSONObject.contains("ow")) {
            this.f14157 = jSONObject.getBoolean("ow");
        }
        if (jSONObject.contains("il")) {
            String string = jSONObject.getString("il");
            this.f14153 = string;
            this.f14152 = m12909(string);
        }
        if (jSONObject.contains("tl")) {
            this.f14156 = jSONObject.getInt("tl");
        }
        if (mo12921() && jSONObject.contains("sp")) {
            this.f14155 = jSONObject.getBoolean("sp");
        }
        if (jSONObject.contains("sm")) {
            JSONArray jSONArray = jSONObject.getJSONArray("sm");
            int size = jSONArray.size();
            for (int i = 0; i < size; i += 2) {
                this.f14160.put(jSONArray.getString(i), Integer.valueOf(jSONArray.getInt(i + 1)));
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo8541(AbstractC5769 abstractC5769) {
        this.f14164 = abstractC5769.f14164;
        this.f14159 = abstractC5769.f14159;
        this.f14163 = abstractC5769.f14163;
        this.f14154 = abstractC5769.f14154;
        this.f14155 = abstractC5769.f14155;
        HashMap map = this.f14160;
        map.clear();
        map.putAll(abstractC5769.f14160);
        m12922(abstractC5769);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m12922(AbstractC5769 abstractC5769) {
        this.f14162 = abstractC5769.f14162;
        this.f14158 = abstractC5769.f14158;
        this.f14157 = abstractC5769.f14157;
        String str = abstractC5769.f14153;
        this.f14153 = str;
        this.f14156 = abstractC5769.f14156;
        this.f14152 = m12909(str);
    }

    /* JADX INFO: renamed from: ܳ */
    public JSONObject mo8542() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", this.f14161);
        jSONObject.put("rk", this.f14164);
        jSONObject.put("ip", this.f14159);
        jSONObject.put("hs", this.f14163);
        jSONObject.put("mt", this.f14154);
        jSONObject.put("fg", this.f14162);
        jSONObject.put("lt", this.f14158);
        jSONObject.put("ow", this.f14157);
        jSONObject.put("il", this.f14153);
        jSONObject.put("tl", this.f14156);
        if (mo12921()) {
            jSONObject.put("sp", this.f14155);
        }
        HashMap map = this.f14160;
        if (!map.isEmpty()) {
            JSONArray jSONArray = new JSONArray();
            for (Map.Entry entry : map.entrySet()) {
                jSONArray.add((String) entry.getKey());
                jSONArray.add(((Integer) entry.getValue()).intValue());
            }
            jSONObject.put("sm", jSONArray);
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m12910(EditText editText, String str) {
        return editText.length() > 0 ? editText.getText().toString() : str;
    }

    /* JADX INFO: renamed from: ᩷ */
    public static int m12920() {
        return C14486.m33124();
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m12915(EditText editText) {
        if (editText.length() <= 0) {
            return true;
        }
        try {
            Charset.forName(editText.getText().toString());
            return true;
        } catch (Exception unused) {
            C22682.m50793(R.string.MT_Protector);
            editText.requestFocus();
            return false;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static boolean m12919(EditText editText) {
        if (!m12916(editText, R.string.MT_Protector)) {
            return false;
        }
        String string = editText.getText().toString();
        int iIndexOf = string.indexOf("://");
        if (iIndexOf != -1) {
            editText.getText().delete(0, iIndexOf + 3);
            string = editText.getText().toString();
        }
        int iIndexOf2 = string.indexOf(47, iIndexOf);
        if (iIndexOf2 <= 0) {
            return true;
        }
        m12917(editText, R.string.MT_Protector);
        editText.setSelection(iIndexOf2, editText.length());
        return false;
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m12916(EditText editText, int i) {
        if (editText.length() != 0) {
            return true;
        }
        m12917(editText, i);
        return false;
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m12917(EditText editText, int i) {
        TextInputLayout textInputLayout;
        editText.requestFocus();
        ViewParent parent = editText.getParent();
        while (true) {
            if (parent == null) {
                textInputLayout = null;
                break;
            } else {
                if (parent instanceof TextInputLayout) {
                    textInputLayout = (TextInputLayout) parent;
                    break;
                }
                parent = parent.getParent();
            }
        }
        C12826.requireNonNull(textInputLayout);
        textInputLayout.setErrorEnabled(true);
        textInputLayout.setError(C7050.m16230(i));
        if (textInputLayout.getTag() instanceof TextWatcher) {
            return;
        }
        C6440 c6440 = new C6440(textInputLayout);
        textInputLayout.setTag(c6440);
        editText.addTextChangedListener(c6440);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m12913(EditText editText, AbstractActivityC5549 abstractActivityC5549) {
        TextInputLayout textInputLayout;
        for (ViewParent parent = editText.getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                textInputLayout = (TextInputLayout) parent;
                C12826.requireNonNull(textInputLayout);
                textInputLayout.setEndIconMode(-1);
                textInputLayout.setEndIconDrawable(R.drawable.MT_Protector);
                textInputLayout.setEndIconOnClickListener(new ViewOnClickListenerC24898(editText, abstractActivityC5549));
            }
        }
        textInputLayout = null;
        C12826.requireNonNull(textInputLayout);
        textInputLayout.setEndIconMode(-1);
        textInputLayout.setEndIconDrawable(R.drawable.MT_Protector);
        textInputLayout.setEndIconOnClickListener(new ViewOnClickListenerC24898(editText, abstractActivityC5549));
    }

    @Override // 
    public final AbstractC5769 clone() {
        try {
            return (AbstractC5769) super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new AssertionError();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            AbstractC5769 abstractC5769 = (AbstractC5769) obj;
            if (this.f14161 == abstractC5769.f14161 && C12826.equals(this.f14164, abstractC5769.f14164) && C12826.equals(this.f14159, abstractC5769.f14159) && this.f14163 == abstractC5769.f14163 && this.f14154 == abstractC5769.f14154 && this.f14155 == abstractC5769.f14155 && this.f14162 == abstractC5769.f14162 && this.f14158 == abstractC5769.f14158 && this.f14157 == abstractC5769.f14157 && this.f14152 == abstractC5769.f14152 && this.f14156 == abstractC5769.f14156) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iM49003 = (((((((((C21720.m49003(C21720.m49003(this.f14161 * 31, 31, this.f14164), 31, this.f14159) + (this.f14163 ? 1231 : 1237)) * 31) + (this.f14154 ? 1231 : 1237)) * 31) + (this.f14155 ? 1231 : 1237)) * 31) + (this.f14162 ? 1231 : 1237)) * 31) + (this.f14158 ? 1231 : 1237)) * 31;
        int i = this.f14157 ? 1231 : 1237;
        long j = this.f14152;
        return ((((iM49003 + i) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.f14156;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m12911(EditText editText, EditText editText2) {
        m12912(editText, editText2, new C13335(3));
    }

    /* JADX INFO: renamed from: ֫ */
    public static long m12909(String str) {
        long j;
        long j2 = str.endsWith("KB") ? ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS : 1048576L;
        try {
            j = Integer.parseInt(str.substring(0, str.length() - 2));
        } catch (NumberFormatException unused) {
            j = 10;
        }
        return j2 * j;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m12912(EditText editText, EditText editText2, Function function) {
        editText2.setHint(((CharSequence) function.apply(editText.getText())).toString());
        editText.addTextChangedListener(new C20522(editText2, function));
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m12914(JSONObject jSONObject, String str, String str2) {
        if (jSONObject.contains(str) || !jSONObject.contains(str2)) {
            return;
        }
        jSONObject.put(str, jSONObject.getBoolean(str2));
        jSONObject.remove(str2);
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m12918(JSONObject jSONObject, String str, String str2) {
        if (jSONObject.contains(str) || !jSONObject.contains(str2)) {
            return;
        }
        jSONObject.put(str, jSONObject.getString(str2));
        jSONObject.remove(str2);
    }
}
