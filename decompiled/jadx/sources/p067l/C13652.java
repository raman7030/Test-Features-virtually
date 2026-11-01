package p067l;

import android.content.DialogInterface;
import android.view.View;
import bin.p000mt.json.JSONObject;
import bin.p000mt.plugin.api.PluginContext;
import bin.p000mt.plugin.api.editor.TextEditorFunction;
import bin.p000mt.plus.R;
import com.umeng.analytics.pro.C0655am;

/* JADX INFO: renamed from: l.ۨᩳܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: J7R3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13652 extends C12962 {

    /* JADX INFO: renamed from: ۘ */
    public static final C12311 f38416 = new C12311();

    /* JADX INFO: renamed from: ۖ */
    public boolean f38417;

    /* JADX INFO: renamed from: ۜ */
    public String f38418;

    /* JADX INFO: renamed from: ۡ */
    public int f38419;

    /* JADX INFO: renamed from: ۢ */
    public String f38420;

    /* JADX INFO: renamed from: ܳ */
    public final JSONObject f38421;

    /* JADX INFO: renamed from: ܺ */
    public boolean f38422;

    /* JADX INFO: renamed from: ᩷ */
    public C1349 f38423;

    /* JADX INFO: renamed from: ᩻ */
    public String f38424;

    /* JADX INFO: renamed from: ۢ */
    private synchronized C1349 m31047() {
        String stringNullable;
        String string = this.f38421.getString(C0655am.f2320av);
        String string2 = this.f38421.getString("b");
        C18249 c18249M34318 = C14976.m34318(string);
        if (c18249M34318 == null) {
            throw new C16150(C7050.m16203(R.string.MT_Protector, string));
        }
        if (!c18249M34318.m41537()) {
            throw new C16150(C7050.m16203(R.string.MT_Protector, c18249M34318.m41538()));
        }
        if (!c18249M34318.m41557()) {
            throw new C16150(C7050.m16203(R.string.MT_Protector, c18249M34318.m41538()));
        }
        C1349 c1349 = this.f38423;
        if (c1349 != null && c1349.f33658 == c18249M34318 && ((TextEditorFunction) c1349.f33659).getContext() == c18249M34318.m41540()) {
            return this.f38423;
        }
        Class clsM41541 = c18249M34318.m41541(string2);
        if (clsM41541 == null) {
            throw new C16150(C7050.m16203(R.string.MT_Protector, "[" + c18249M34318.m41538() + "] " + string2));
        }
        try {
            TextEditorFunction textEditorFunction = (TextEditorFunction) clsM41541.newInstance();
            textEditorFunction.init(c18249M34318.m41540());
            if (textEditorFunction.isEnabled()) {
                C1349 c13410 = new C1349(c18249M34318, textEditorFunction);
                this.f38423 = c13410;
                return c13410;
            }
            PluginContext pluginContextM41540 = c18249M34318.m41540();
            String strName = textEditorFunction.name();
            if (strName.length() >= 3 && strName.charAt(0) == '{' && strName.charAt(strName.length() - 1) == '}' && (stringNullable = ((C12474) pluginContextM41540).getStringNullable(strName)) != null) {
                strName = stringNullable;
            }
            throw new C16150(C7050.m16203(R.string.MT_Protector, "[" + c18249M34318.m41538() + "] " + strName));
        } catch (Exception e) {
            if (e instanceof C16150) {
                throw ((C16150) e);
            }
            c18249M34318.m41526(e);
            throw new C16150(C7050.m16203(R.string.MT_Protector, c18249M34318.m41538()));
        }
    }

    public C13652(JSONObject jSONObject, C1349 c1349) {
        boolean zSupportRepeat;
        boolean zSupportEditTextView;
        String stringNullable;
        super(34);
        this.f38421 = jSONObject;
        this.f38423 = c1349;
        boolean z = false;
        if (c1349 == null) {
            try {
                c1349 = m31047();
            } catch (C16150 e) {
                e = e;
                zSupportRepeat = false;
                zSupportEditTextView = z;
                this.f38418 = e.getMessage();
                this.f38424 = "❌ " + this.f38418;
                this.f38420 = C16907.m38480();
                this.f38419 = C14976.m34317();
                this.f38422 = zSupportEditTextView;
                this.f38417 = zSupportRepeat;
            } catch (Throwable th) {
                th = th;
                zSupportRepeat = false;
                zSupportEditTextView = z;
                this.f38418 = th.toString();
                this.f38424 = "❌ " + this.f38418;
                this.f38420 = C16907.m38480();
                this.f38419 = C14976.m34317();
                this.f38422 = zSupportEditTextView;
                this.f38417 = zSupportRepeat;
            }
        }
        C18249 c18249 = (C18249) c1349.f33658;
        TextEditorFunction textEditorFunction = (TextEditorFunction) c1349.f33659;
        zSupportEditTextView = textEditorFunction.supportEditTextView();
        try {
            zSupportRepeat = textEditorFunction.supportRepeat();
            try {
                PluginContext pluginContextM41540 = c18249.m41540();
                String strName = textEditorFunction.name();
                if (strName.length() >= 3 && strName.charAt(0) == '{' && strName.charAt(strName.length() - 1) == '}' && (stringNullable = ((C12474) pluginContextM41540).getStringNullable(strName)) != null) {
                    strName = stringNullable;
                }
                this.f38418 = strName;
                this.f38424 = "⚡ [" + c18249.m41538() + "] " + this.f38418;
            } catch (C16150 e2) {
                e = e2;
                this.f38418 = e.getMessage();
                this.f38424 = "❌ " + this.f38418;
            } catch (Throwable th2) {
                th = th2;
                this.f38418 = th.toString();
                this.f38424 = "❌ " + this.f38418;
            }
        } catch (C16150 e3) {
            e = e3;
            z = zSupportEditTextView;
            zSupportRepeat = false;
            zSupportEditTextView = z;
            this.f38418 = e.getMessage();
            this.f38424 = "❌ " + this.f38418;
            this.f38420 = C16907.m38480();
            this.f38419 = C14976.m34317();
            this.f38422 = zSupportEditTextView;
            this.f38417 = zSupportRepeat;
        } catch (Throwable th3) {
            th = th3;
            z = zSupportEditTextView;
            zSupportRepeat = false;
            zSupportEditTextView = z;
            this.f38418 = th.toString();
            this.f38424 = "❌ " + this.f38418;
            this.f38420 = C16907.m38480();
            this.f38419 = C14976.m34317();
            this.f38422 = zSupportEditTextView;
            this.f38417 = zSupportRepeat;
        }
        this.f38420 = C16907.m38480();
        this.f38419 = C14976.m34317();
        this.f38422 = zSupportEditTextView;
        this.f38417 = zSupportRepeat;
    }

    @Override // p067l.C12962
    /* JADX INFO: renamed from: ۧ */
    public final String mo29722() {
        m31048();
        return this.f38418;
    }

    /* JADX INFO: renamed from: ۜ */
    public final String m31049() {
        m31048();
        return this.f38424;
    }

    /* JADX INFO: renamed from: ᩷ */
    private void m31048() {
        String stringNullable;
        String strM38480 = C16907.m38480();
        int iM34317 = C14976.m34317();
        if (strM38480.equals(this.f38420) && iM34317 == this.f38419) {
            return;
        }
        C18249 c18249 = null;
        try {
            try {
                C1349 c1349M31047 = m31047();
                C18249 c182410 = (C18249) c1349M31047.f33658;
                try {
                    TextEditorFunction textEditorFunction = (TextEditorFunction) c1349M31047.f33659;
                    this.f38422 = textEditorFunction.supportEditTextView();
                    this.f38417 = textEditorFunction.supportRepeat();
                    PluginContext pluginContextM41540 = c182410.m41540();
                    String strName = textEditorFunction.name();
                    if (strName.length() >= 3 && strName.charAt(0) == '{' && strName.charAt(strName.length() - 1) == '}' && (stringNullable = ((C12474) pluginContextM41540).getStringNullable(strName)) != null) {
                        strName = stringNullable;
                    }
                    this.f38418 = strName;
                    this.f38424 = "⚡ [" + c182410.m41538() + "] " + this.f38418;
                } catch (Throwable th) {
                    th = th;
                    c18249 = c182410;
                    String string = th.toString();
                    this.f38424 = string;
                    this.f38418 = string;
                    if (c18249 != null) {
                        c18249.m41526(th);
                    }
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (C16150 e) {
            String message = e.getMessage();
            this.f38424 = message;
            this.f38418 = message;
        }
        this.f38420 = strM38480;
        this.f38419 = iM34317;
    }

    @Override // p067l.C12962
    /* JADX INFO: renamed from: ᩳ */
    public final JSONObject mo29726() {
        return this.f38421;
    }

    @Override // p067l.C12962
    /* JADX INFO: renamed from: ܳ */
    public final boolean mo29723() {
        if (this.f38419 != C14976.m34317()) {
            m31048();
        }
        return this.f38422;
    }

    @Override // p067l.C12962
    /* JADX INFO: renamed from: ᩻ */
    public final boolean mo15922() {
        if (this.f38419 != C14976.m34317()) {
            m31048();
        }
        return this.f38417;
    }

    @Override // p067l.C12962
    /* JADX INFO: renamed from: ֫ */
    public final void mo15920(View view, InterfaceC4244 interfaceC4244) {
        C18249 c18249;
        if (interfaceC4244.mo8623() == null) {
            return;
        }
        AbstractActivityC5549 abstractActivityC5549 = (AbstractActivityC5549) C7453.m17221(view.getContext());
        if (abstractActivityC5549 == null) {
            C22682.m50800("Cannot get the activity");
            return;
        }
        try {
            try {
                C1349 c1349M31047 = m31047();
                c18249 = (C18249) c1349M31047.f33658;
                try {
                    ((TextEditorFunction) c1349M31047.f33659).doFunction(new C19456(c18249.m41540(), abstractActivityC5549), new C18859(interfaceC4244.mo8623()), this.f38421.getJSONObject(C0655am.f2278aF));
                } catch (Throwable th) {
                    th = th;
                    abstractActivityC5549.m12259(th, (DialogInterface.OnDismissListener) null);
                    if (c18249 != null) {
                        c18249.m41526(th);
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                c18249 = null;
            }
        } catch (C16150 e) {
            C22682.m50795((CharSequence) e.getMessage());
        }
    }

    @Override // p067l.C12962
    /* JADX INFO: renamed from: ֫ */
    public final void mo15921(View view, C12096 c12096) {
        if (!this.f38422) {
            throw new IllegalStateException();
        }
        AbstractActivityC5549 abstractActivityC5549 = (AbstractActivityC5549) C7453.m17221(view.getContext());
        if (abstractActivityC5549 == null) {
            C22682.m50800("Cannot get the activity");
            return;
        }
        try {
            C1349 c1349M31047 = m31047();
            ((TextEditorFunction) c1349M31047.f33659).doFunction(new C19456(((C18249) c1349M31047.f33658).m41540(), abstractActivityC5549), new C18859(c12096), this.f38421.getJSONObject(C0655am.f2278aF));
        } catch (C16150 e) {
            C22682.m50795((CharSequence) e.getMessage());
        } catch (Throwable th) {
            abstractActivityC5549.m12259(th, (DialogInterface.OnDismissListener) null);
        }
    }
}
