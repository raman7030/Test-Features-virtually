package l;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.view.View;
import bin.mt.plugin.api.PluginContext;
import bin.mt.plugin.api.editor.TextEditorBaseMenu;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۘ᩻ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: L7JF */
/* JADX INFO: loaded from: classes3.dex */
public final class C4278 extends AbstractC2867 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public Drawable f13819;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f13820;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f13821;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String f13822;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean f13823;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C10220 f13824;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String f13825;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public String f13826;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public String f13827;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private synchronized C10220 m12860() {
        String stringNullable;
        C16709 c16709M32219 = C13265.m32219(this.f13822);
        if (c16709M32219 == null) {
            throw new C14501(C4925.m14306(R.string.MT_Protector, this.f13822));
        }
        if (!c16709M32219.m39301()) {
            throw new C14501(C4925.m14306(R.string.MT_Protector, c16709M32219.m39302()));
        }
        if (!c16709M32219.m39321()) {
            throw new C14501(C4925.m14306(R.string.MT_Protector, c16709M32219.m39302()));
        }
        C10220 c10220 = this.f13824;
        if (c10220 != null && c10220.f30697 == c16709M32219 && ((TextEditorBaseMenu) c10220.f30698).getContext() == c16709M32219.m39304()) {
            return this.f13824;
        }
        Class clsM39288 = this.f13823 ? c16709M32219.m39288(this.f13821) : c16709M32219.m39311(this.f13821);
        if (clsM39288 == null) {
            throw new C14501(C4925.m14306(R.string.MT_Protector, "[" + c16709M32219.m39302() + "] " + this.f13821));
        }
        try {
            TextEditorBaseMenu textEditorBaseMenu = (TextEditorBaseMenu) clsM39288.newInstance();
            textEditorBaseMenu.init(c16709M32219.m39304());
            if (textEditorBaseMenu.isEnabled()) {
                C10220 c10221 = new C10220(c16709M32219, textEditorBaseMenu);
                this.f13824 = c10221;
                return c10221;
            }
            PluginContext pluginContextM39304 = c16709M32219.m39304();
            String strName = textEditorBaseMenu.name();
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

    public C4278(String str, boolean z) {
        this.f13825 = str;
        this.f13823 = z;
        String[] strArrSplit = str.split(":", 3);
        this.f13822 = strArrSplit[1];
        this.f13821 = strArrSplit[2];
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String m12862() {
        return this.f13822;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final String m12863() {
        return this.f13821;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    private void m12859() {
        C16709 c16709;
        Throwable th;
        String stringNullable;
        String strM36319 = C15297.m36319();
        int iM32218 = C13265.m32218();
        if (strM36319.equals(this.f13827) && iM32218 == this.f13820) {
            return;
        }
        this.f13826 = null;
        this.f13819 = null;
        try {
            try {
                C10220 c10220M12860 = m12860();
                c16709 = (C16709) c10220M12860.f30697;
                try {
                    TextEditorBaseMenu textEditorBaseMenu = (TextEditorBaseMenu) c10220M12860.f30698;
                    PluginContext pluginContextM39304 = c16709.m39304();
                    String strName = textEditorBaseMenu.name();
                    if (strName.length() >= 3 && strName.charAt(0) == '{' && strName.charAt(strName.length() - 1) == '}' && (stringNullable = ((C10632) pluginContextM39304).getStringNullable(strName)) != null) {
                        strName = stringNullable;
                    }
                    this.f13826 = strName;
                    this.f13819 = textEditorBaseMenu.icon();
                } catch (Throwable th2) {
                    th = th2;
                    if (this.f13826 == null) {
                        this.f13826 = th.toString();
                    }
                    if (c16709 != null) {
                        c16709.m39290(th);
                    }
                }
            } catch (Throwable th3) {
                c16709 = null;
                th = th3;
            }
        } catch (C14501 e) {
            if (this.f13826 == null) {
                this.f13826 = e.getMessage();
            }
        }
        this.f13827 = strM36319;
        this.f13820 = iM32218;
    }

    @Override // l.AbstractC2867
    /* JADX INFO: renamed from: ֫ */
    public final String mo8778() {
        return this.f13825;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean m12864() {
        C16709 c16709 = null;
        try {
            C10220 c10220M12860 = m12860();
            C16709 c167010 = (C16709) c10220M12860.f30697;
            try {
                return ((TextEditorBaseMenu) c10220M12860.f30698).isEnabled();
            } catch (Throwable th) {
                th = th;
                c16709 = c167010;
                if (c16709 == null) {
                    return false;
                }
                c16709.m39290(th);
                return false;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // l.AbstractC2867
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo8780(C12392 c12392, boolean z, boolean z2, int i, int i2) {
        C16709 c16709 = null;
        try {
            C10220 c10220M12860 = m12860();
            C16709 c167010 = (C16709) c10220M12860.f30697;
            try {
                TextEditorBaseMenu textEditorBaseMenu = (TextEditorBaseMenu) c10220M12860.f30698;
                if (textEditorBaseMenu.isEnabled()) {
                    return textEditorBaseMenu.checkVisible(new C17351(c12392));
                }
                return false;
            } catch (Throwable th) {
                th = th;
                c16709 = c167010;
                if (c16709 != null) {
                    c16709.m39290(th);
                }
                return false;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // l.AbstractC2867
    /* JADX INFO: renamed from: ۧ */
    public final C16271 mo8781() {
        m12859();
        return new C16271(this.f13826, this);
    }

    @Override // l.AbstractC2867
    /* JADX INFO: renamed from: ֫ */
    public final Drawable mo8777(Context context) {
        m12859();
        Drawable drawable = this.f13819;
        if (drawable != null) {
            drawable.setTintList(C21943.f70268);
        }
        return drawable;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m12861(View view) {
        AbstractActivityC3346 abstractActivityC3346 = (AbstractActivityC3346) C5350.m15313(view.getContext());
        if (abstractActivityC3346 == null) {
            C21374.m48464("Cannot get the activity");
            return;
        }
        C16709 c16709 = null;
        try {
            C10220 c10220M12860 = m12860();
            C16709 c167010 = (C16709) c10220M12860.f30697;
            try {
                ((TextEditorBaseMenu) c10220M12860.f30698).onPluginButtonClick(new C17979(c167010.m39304(), abstractActivityC3346));
            } catch (Throwable th) {
                th = th;
                c16709 = c167010;
                if (c16709 != null) {
                    c16709.m39290(th);
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // l.AbstractC2867
    /* JADX INFO: renamed from: ֫ */
    public final void mo8779(C12392 c12392) {
        C16709 c16709;
        AbstractActivityC3346 abstractActivityC3346 = (AbstractActivityC3346) C5350.m15313(c12392.getContext());
        if (abstractActivityC3346 == null) {
            C21374.m48464("Cannot get the activity");
            return;
        }
        try {
            try {
                C10220 c10220M12860 = m12860();
                c16709 = (C16709) c10220M12860.f30697;
                try {
                    ((TextEditorBaseMenu) c10220M12860.f30698).onMenuClick(new C17979(c16709.m39304(), abstractActivityC3346), new C17351(c12392));
                } catch (Throwable th) {
                    th = th;
                    abstractActivityC3346.m10223(th, (DialogInterface.OnDismissListener) null);
                    if (c16709 != null) {
                        c16709.m39290(th);
                    }
                }
            } catch (C14501 e) {
                C21374.m48459((CharSequence) e.getMessage());
            }
        } catch (Throwable th2) {
            th = th2;
            c16709 = null;
        }
    }
}
