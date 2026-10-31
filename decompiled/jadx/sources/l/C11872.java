package l;

import android.content.DialogInterface;
import android.view.View;
import bin.mt.json.JSONObject;
import bin.mt.plugin.api.PluginContext;
import bin.mt.plugin.api.editor.TextEditorFunction;
import bin.mt.plus.R;
import com.umeng.analytics.pro.am;

/* JADX INFO: renamed from: l.ۨᩳܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: J7R3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11872 extends C11146 {

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static final C10461 f35407 = new C10461();

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f35408;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public String f35409;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f35410;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public String f35411;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final JSONObject f35412;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f35413;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C10220 f35414;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public String f35415;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    private synchronized C10220 m28996() {
        String stringNullable;
        String string = this.f35412.getString(am.av);
        String string2 = this.f35412.getString("b");
        C16709 c16709M32219 = C13265.m32219(string);
        if (c16709M32219 == null) {
            throw new C14501(C4925.m14306(R.string.MT_Protector, string));
        }
        if (!c16709M32219.m39301()) {
            throw new C14501(C4925.m14306(R.string.MT_Protector, c16709M32219.m39302()));
        }
        if (!c16709M32219.m39321()) {
            throw new C14501(C4925.m14306(R.string.MT_Protector, c16709M32219.m39302()));
        }
        C10220 c10220 = this.f35414;
        if (c10220 != null && c10220.f30697 == c16709M32219 && ((TextEditorFunction) c10220.f30698).getContext() == c16709M32219.m39304()) {
            return this.f35414;
        }
        Class clsM39305 = c16709M32219.m39305(string2);
        if (clsM39305 == null) {
            throw new C14501(C4925.m14306(R.string.MT_Protector, "[" + c16709M32219.m39302() + "] " + string2));
        }
        try {
            TextEditorFunction textEditorFunction = (TextEditorFunction) clsM39305.newInstance();
            textEditorFunction.init(c16709M32219.m39304());
            if (textEditorFunction.isEnabled()) {
                C10220 c10221 = new C10220(c16709M32219, textEditorFunction);
                this.f35414 = c10221;
                return c10221;
            }
            PluginContext pluginContextM39304 = c16709M32219.m39304();
            String strName = textEditorFunction.name();
            if (strName.length() >= 3 && strName.charAt(0) == '{' && strName.charAt(strName.length() - 1) == '}' && (stringNullable = ((C10632) pluginContextM39304).getStringNullable(strName)) != null) {
                strName = stringNullable;
            }
            throw new C14501(C4925.m14306(R.string.MT_Protector, "[" + c16709M32219.m39302() + "] " + strName));
        } catch (Exception e) {
            if (e instanceof C14501) {
                throw ((C14501) e);
            }
            c16709M32219.m39290(e);
            throw new C14501(C4925.m14306(R.string.MT_Protector, c16709M32219.m39302()));
        }
    }

    public C11872(JSONObject jSONObject, C10220 c10220) {
        boolean zSupportRepeat;
        boolean zSupportEditTextView;
        String stringNullable;
        super(34);
        this.f35412 = jSONObject;
        this.f35414 = c10220;
        boolean z = false;
        if (c10220 == null) {
            try {
                c10220 = m28996();
            } catch (C14501 e) {
                e = e;
                zSupportRepeat = false;
                zSupportEditTextView = z;
                this.f35409 = e.getMessage();
                this.f35415 = "❌ " + this.f35409;
                this.f35411 = C15297.m36319();
                this.f35410 = C13265.m32218();
                this.f35413 = zSupportEditTextView;
                this.f35408 = zSupportRepeat;
            } catch (Throwable th) {
                th = th;
                zSupportRepeat = false;
                zSupportEditTextView = z;
                this.f35409 = th.toString();
                this.f35415 = "❌ " + this.f35409;
                this.f35411 = C15297.m36319();
                this.f35410 = C13265.m32218();
                this.f35413 = zSupportEditTextView;
                this.f35408 = zSupportRepeat;
            }
        }
        C16709 c16709 = (C16709) c10220.f30697;
        TextEditorFunction textEditorFunction = (TextEditorFunction) c10220.f30698;
        zSupportEditTextView = textEditorFunction.supportEditTextView();
        try {
            zSupportRepeat = textEditorFunction.supportRepeat();
            try {
                PluginContext pluginContextM39304 = c16709.m39304();
                String strName = textEditorFunction.name();
                if (strName.length() >= 3 && strName.charAt(0) == '{' && strName.charAt(strName.length() - 1) == '}' && (stringNullable = ((C10632) pluginContextM39304).getStringNullable(strName)) != null) {
                    strName = stringNullable;
                }
                this.f35409 = strName;
                this.f35415 = "⚡ [" + c16709.m39302() + "] " + this.f35409;
            } catch (C14501 e2) {
                e = e2;
                this.f35409 = e.getMessage();
                this.f35415 = "❌ " + this.f35409;
            } catch (Throwable th2) {
                th = th2;
                this.f35409 = th.toString();
                this.f35415 = "❌ " + this.f35409;
            }
        } catch (C14501 e3) {
            e = e3;
            z = zSupportEditTextView;
            zSupportRepeat = false;
            zSupportEditTextView = z;
            this.f35409 = e.getMessage();
            this.f35415 = "❌ " + this.f35409;
            this.f35411 = C15297.m36319();
            this.f35410 = C13265.m32218();
            this.f35413 = zSupportEditTextView;
            this.f35408 = zSupportRepeat;
        } catch (Throwable th3) {
            th = th3;
            z = zSupportEditTextView;
            zSupportRepeat = false;
            zSupportEditTextView = z;
            this.f35409 = th.toString();
            this.f35415 = "❌ " + this.f35409;
            this.f35411 = C15297.m36319();
            this.f35410 = C13265.m32218();
            this.f35413 = zSupportEditTextView;
            this.f35408 = zSupportRepeat;
        }
        this.f35411 = C15297.m36319();
        this.f35410 = C13265.m32218();
        this.f35413 = zSupportEditTextView;
        this.f35408 = zSupportRepeat;
    }

    @Override // l.C11146
    /* JADX INFO: renamed from: ۧ */
    public final String mo27660() {
        m28997();
        return this.f35409;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final String m28998() {
        m28997();
        return this.f35415;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m28997() {
        String stringNullable;
        String strM36319 = C15297.m36319();
        int iM32218 = C13265.m32218();
        if (strM36319.equals(this.f35411) && iM32218 == this.f35410) {
            return;
        }
        C16709 c16709 = null;
        try {
            try {
                C10220 c10220M28996 = m28996();
                C16709 c167010 = (C16709) c10220M28996.f30697;
                try {
                    TextEditorFunction textEditorFunction = (TextEditorFunction) c10220M28996.f30698;
                    this.f35413 = textEditorFunction.supportEditTextView();
                    this.f35408 = textEditorFunction.supportRepeat();
                    PluginContext pluginContextM39304 = c167010.m39304();
                    String strName = textEditorFunction.name();
                    if (strName.length() >= 3 && strName.charAt(0) == '{' && strName.charAt(strName.length() - 1) == '}' && (stringNullable = ((C10632) pluginContextM39304).getStringNullable(strName)) != null) {
                        strName = stringNullable;
                    }
                    this.f35409 = strName;
                    this.f35415 = "⚡ [" + c167010.m39302() + "] " + this.f35409;
                } catch (Throwable th) {
                    th = th;
                    c16709 = c167010;
                    String string = th.toString();
                    this.f35415 = string;
                    this.f35409 = string;
                    if (c16709 != null) {
                        c16709.m39290(th);
                    }
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (C14501 e) {
            String message = e.getMessage();
            this.f35415 = message;
            this.f35409 = message;
        }
        this.f35411 = strM36319;
        this.f35410 = iM32218;
    }

    @Override // l.C11146
    /* JADX INFO: renamed from: ᩳ */
    public final JSONObject mo27664() {
        return this.f35412;
    }

    @Override // l.C11146
    /* JADX INFO: renamed from: ܳ */
    public final boolean mo27661() {
        if (this.f35410 != C13265.m32218()) {
            m28997();
        }
        return this.f35413;
    }

    @Override // l.C11146
    /* JADX INFO: renamed from: ᩻ */
    public final boolean mo14042() {
        if (this.f35410 != C13265.m32218()) {
            m28997();
        }
        return this.f35408;
    }

    @Override // l.C11146
    /* JADX INFO: renamed from: ֫ */
    public final void mo14040(View view, InterfaceC1973 interfaceC1973) {
        C16709 c16709;
        if (interfaceC1973.mo6482() == null) {
            return;
        }
        AbstractActivityC3346 abstractActivityC3346 = (AbstractActivityC3346) C5350.m15313(view.getContext());
        if (abstractActivityC3346 == null) {
            C21374.m48464("Cannot get the activity");
            return;
        }
        try {
            try {
                C10220 c10220M28996 = m28996();
                c16709 = (C16709) c10220M28996.f30697;
                try {
                    ((TextEditorFunction) c10220M28996.f30698).doFunction(new C17979(c16709.m39304(), abstractActivityC3346), new C17351(interfaceC1973.mo6482()), this.f35412.getJSONObject(am.aF));
                } catch (Throwable th) {
                    th = th;
                    abstractActivityC3346.m10223(th, (DialogInterface.OnDismissListener) null);
                    if (c16709 != null) {
                        c16709.m39290(th);
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                c16709 = null;
            }
        } catch (C14501 e) {
            C21374.m48459((CharSequence) e.getMessage());
        }
    }

    @Override // l.C11146
    /* JADX INFO: renamed from: ֫ */
    public final void mo14041(View view, C10235 c10235) {
        if (!this.f35413) {
            throw new IllegalStateException();
        }
        AbstractActivityC3346 abstractActivityC3346 = (AbstractActivityC3346) C5350.m15313(view.getContext());
        if (abstractActivityC3346 == null) {
            C21374.m48464("Cannot get the activity");
            return;
        }
        try {
            C10220 c10220M28996 = m28996();
            ((TextEditorFunction) c10220M28996.f30698).doFunction(new C17979(((C16709) c10220M28996.f30697).m39304(), abstractActivityC3346), new C17351(c10235), this.f35412.getJSONObject(am.aF));
        } catch (C14501 e) {
            C21374.m48459((CharSequence) e.getMessage());
        } catch (Throwable th) {
            abstractActivityC3346.m10223(th, (DialogInterface.OnDismissListener) null);
        }
    }
}
