package l;

import android.app.Activity;
import android.view.View;
import bin.mt.json.JSONObject;
import bin.mt.plus.R;
import com.umeng.analytics.pro.am;

/* JADX INFO: renamed from: l.᩹ᩳܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: N7PP */
/* JADX INFO: loaded from: classes.dex */
public final class C22455 extends C11146 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final C21750 f72732 = new C21750();

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final JSONObject f72733;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f72734;

    @Override // l.C11146
    /* JADX INFO: renamed from: ᩻ */
    public final boolean mo14042() {
        return false;
    }

    public C22455(JSONObject jSONObject) {
        super(27);
        this.f72733 = jSONObject;
    }

    @Override // l.C11146
    /* JADX INFO: renamed from: ᩳ */
    public final JSONObject mo27664() {
        return this.f72733;
    }

    @Override // l.C11146
    /* JADX INFO: renamed from: ֫ */
    public final void mo14040(View view, InterfaceC1973 interfaceC1973) {
        C12392 c12392Mo6482;
        C11459 c11459M28259;
        if (this.f72734 || (c12392Mo6482 = interfaceC1973.mo6482()) == null) {
            return;
        }
        JSONObject jSONObject = this.f72733;
        String string = jSONObject.getString(am.av);
        String string2 = jSONObject.getString("b");
        boolean z = jSONObject.getBoolean(am.aF);
        int i = jSONObject.getInt("d");
        int i2 = jSONObject.getInt("e");
        boolean z2 = jSONObject.getBoolean("f", true);
        if (string.isEmpty()) {
            return;
        }
        if (!z2) {
            string = C3939.m11985(string);
        }
        try {
            if (z) {
                c11459M28259 = C11459.m28259(8, string);
            } else {
                c11459M28259 = C11459.m28259(74, string);
            }
            C11459 c11459 = c11459M28259;
            if (z2) {
                C13574.m32628(c11459, string2);
            }
            int[] iArrM30369 = c12392Mo6482.m30369();
            if (i == 0 && iArrM30369[0] == iArrM30369[1]) {
                C21374.m48457(R.string.MT_Protector);
                return;
            }
            boolean z3 = i == 2;
            Activity activityM15313 = C5350.m15313(c12392Mo6482.getContext());
            C11003.requireNonNull(activityM15313);
            AbstractActivityC3346 abstractActivityC3346 = (AbstractActivityC3346) activityM15313;
            InterfaceC7785 interfaceC7785M30436 = c12392Mo6482.m30436();
            new C1288(this, new C14134(c12392Mo6482, abstractActivityC3346, R.string.MT_Protector, new C0582()), interfaceC7785M30436, interfaceC7785M30436.mo26548(), c11459, i, iArrM30369, string2, z2, i2, z3, C7850.toPath(c12392Mo6482.getContext().getCacheDir()).resolve("replace-output"), c12392Mo6482, abstractActivityC3346).m20274();
        } catch (Exception e) {
            C21374.m48459((CharSequence) e.toString());
        }
    }
}
