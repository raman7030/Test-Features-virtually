package p067l;

import android.app.Activity;
import android.view.View;
import bin.p000mt.json.JSONObject;
import bin.p000mt.plus.R;
import com.umeng.analytics.pro.C0655am;

/* JADX INFO: renamed from: l.᩹ᩳܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: N7PP */
/* JADX INFO: loaded from: classes.dex */
public final class C23710 extends C12962 {

    /* JADX INFO: renamed from: ۜ */
    public static final C23040 f75458 = new C23040();

    /* JADX INFO: renamed from: ܳ */
    public final JSONObject f75459;

    /* JADX INFO: renamed from: ᩻ */
    public boolean f75460;

    @Override // p067l.C12962
    /* JADX INFO: renamed from: ᩻ */
    public final boolean mo15922() {
        return false;
    }

    public C23710(JSONObject jSONObject) {
        super(27);
        this.f75459 = jSONObject;
    }

    @Override // p067l.C12962
    /* JADX INFO: renamed from: ᩳ */
    public final JSONObject mo29726() {
        return this.f75459;
    }

    @Override // p067l.C12962
    /* JADX INFO: renamed from: ֫ */
    public final void mo15920(View view, InterfaceC4244 interfaceC4244) {
        C14146 c14146Mo8623;
        C13259 c13259M30303;
        if (this.f75460 || (c14146Mo8623 = interfaceC4244.mo8623()) == null) {
            return;
        }
        JSONObject jSONObject = this.f75459;
        String string = jSONObject.getString(C0655am.f2320av);
        String string2 = jSONObject.getString("b");
        boolean z = jSONObject.getBoolean(C0655am.f2278aF);
        int i = jSONObject.getInt("d");
        int i2 = jSONObject.getInt("e");
        boolean z2 = jSONObject.getBoolean("f", true);
        if (string.isEmpty()) {
            return;
        }
        if (!z2) {
            string = C6112.m13905(string);
        }
        try {
            if (z) {
                c13259M30303 = C13259.m30303(8, string);
            } else {
                c13259M30303 = C13259.m30303(74, string);
            }
            C13259 c13259 = c13259M30303;
            if (z2) {
                C15269.m34740(c13259, string2);
            }
            int[] iArrM32433 = c14146Mo8623.m32433();
            if (i == 0 && iArrM32433[0] == iArrM32433[1]) {
                C22682.m50793(R.string.MT_Protector);
                return;
            }
            boolean z3 = i == 2;
            Activity activityM17221 = C7453.m17221(c14146Mo8623.getContext());
            C12826.requireNonNull(activityM17221);
            AbstractActivityC5549 abstractActivityC5549 = (AbstractActivityC5549) activityM17221;
            InterfaceC9768 interfaceC9768M32500 = c14146Mo8623.m32500();
            new C3593(this, new C15802(c14146Mo8623, abstractActivityC5549, R.string.MT_Protector, new C2922()), interfaceC9768M32500, interfaceC9768M32500.mo28581(), c13259, i, iArrM32433, string2, z2, i2, z3, C9829.toPath(c14146Mo8623.getContext().getCacheDir()).resolve("replace-output"), c14146Mo8623, abstractActivityC5549).m22250();
        } catch (Exception e) {
            C22682.m50795((CharSequence) e.toString());
        }
    }
}
