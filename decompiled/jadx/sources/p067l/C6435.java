package p067l;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.view.View;
import bin.p000mt.plugin.api.PluginContext;
import bin.p000mt.plugin.api.editor.TextEditorBaseMenu;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ۘ᩻ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: L7JF */
/* JADX INFO: loaded from: classes3.dex */
public final class C6435 extends AbstractC5094 {

    /* JADX INFO: renamed from: ֫ */
    public Drawable f16636;

    /* JADX INFO: renamed from: ۜ */
    public int f16637;

    /* JADX INFO: renamed from: ۧ */
    public final String f16638;

    /* JADX INFO: renamed from: ܳ */
    public final String f16639;

    /* JADX INFO: renamed from: ܽ */
    public final boolean f16640;

    /* JADX INFO: renamed from: ܿ */
    public C1349 f16641;

    /* JADX INFO: renamed from: ᩳ */
    public final String f16642;

    /* JADX INFO: renamed from: ᩷ */
    public String f16643;

    /* JADX INFO: renamed from: ᩻ */
    public String f16644;

    /* JADX INFO: renamed from: ᩷ */
    private synchronized C1349 m14724() {
        String stringNullable;
        C18249 c18249M34318 = C14976.m34318(this.f16639);
        if (c18249M34318 == null) {
            throw new C16150(C7050.m16203(R.string.MT_Protector, this.f16639));
        }
        if (!c18249M34318.m41537()) {
            throw new C16150(C7050.m16203(R.string.MT_Protector, c18249M34318.m41538()));
        }
        if (!c18249M34318.m41557()) {
            throw new C16150(C7050.m16203(R.string.MT_Protector, c18249M34318.m41538()));
        }
        C1349 c1349 = this.f16641;
        if (c1349 != null && c1349.f33658 == c18249M34318 && ((TextEditorBaseMenu) c1349.f33659).getContext() == c18249M34318.m41540()) {
            return this.f16641;
        }
        Class clsM41524 = this.f16640 ? c18249M34318.m41524(this.f16638) : c18249M34318.m41547(this.f16638);
        if (clsM41524 == null) {
            throw new C16150(C7050.m16203(R.string.MT_Protector, "[" + c18249M34318.m41538() + "] " + this.f16638));
        }
        try {
            TextEditorBaseMenu textEditorBaseMenu = (TextEditorBaseMenu) clsM41524.newInstance();
            textEditorBaseMenu.init(c18249M34318.m41540());
            if (textEditorBaseMenu.isEnabled()) {
                C1349 c13410 = new C1349(c18249M34318, textEditorBaseMenu);
                this.f16641 = c13410;
                return c13410;
            }
            PluginContext pluginContextM41540 = c18249M34318.m41540();
            String strName = textEditorBaseMenu.name();
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

    public C6435(String str, boolean z) {
        this.f16642 = str;
        this.f16640 = z;
        String[] strArrSplit = str.split(":", 3);
        this.f16639 = strArrSplit[1];
        this.f16638 = strArrSplit[2];
    }

    /* JADX INFO: renamed from: ܳ */
    public final String m14726() {
        return this.f16639;
    }

    /* JADX INFO: renamed from: ܿ */
    public final String m14727() {
        return this.f16638;
    }

    /* JADX INFO: renamed from: ۜ */
    private void m14723() {
        C18249 c18249;
        Throwable th;
        String stringNullable;
        String strM38480 = C16907.m38480();
        int iM34317 = C14976.m34317();
        if (strM38480.equals(this.f16644) && iM34317 == this.f16637) {
            return;
        }
        this.f16643 = null;
        this.f16636 = null;
        try {
            try {
                C1349 c1349M14724 = m14724();
                c18249 = (C18249) c1349M14724.f33658;
                try {
                    TextEditorBaseMenu textEditorBaseMenu = (TextEditorBaseMenu) c1349M14724.f33659;
                    PluginContext pluginContextM41540 = c18249.m41540();
                    String strName = textEditorBaseMenu.name();
                    if (strName.length() >= 3 && strName.charAt(0) == '{' && strName.charAt(strName.length() - 1) == '}' && (stringNullable = ((C12474) pluginContextM41540).getStringNullable(strName)) != null) {
                        strName = stringNullable;
                    }
                    this.f16643 = strName;
                    this.f16636 = textEditorBaseMenu.icon();
                } catch (Throwable th2) {
                    th = th2;
                    if (this.f16643 == null) {
                        this.f16643 = th.toString();
                    }
                    if (c18249 != null) {
                        c18249.m41526(th);
                    }
                }
            } catch (Throwable th3) {
                c18249 = null;
                th = th3;
            }
        } catch (C16150 e) {
            if (this.f16643 == null) {
                this.f16643 = e.getMessage();
            }
        }
        this.f16644 = strM38480;
        this.f16637 = iM34317;
    }

    @Override // p067l.AbstractC5094
    /* JADX INFO: renamed from: ֫ */
    public final String mo10845() {
        return this.f16642;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final boolean m14728() {
        C18249 c18249 = null;
        try {
            C1349 c1349M14724 = m14724();
            C18249 c182410 = (C18249) c1349M14724.f33658;
            try {
                return ((TextEditorBaseMenu) c1349M14724.f33659).isEnabled();
            } catch (Throwable th) {
                th = th;
                c18249 = c182410;
                if (c18249 == null) {
                    return false;
                }
                c18249.m41526(th);
                return false;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // p067l.AbstractC5094
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo10847(C14146 c14146, boolean z, boolean z2, int i, int i2) {
        C18249 c18249 = null;
        try {
            C1349 c1349M14724 = m14724();
            C18249 c182410 = (C18249) c1349M14724.f33658;
            try {
                TextEditorBaseMenu textEditorBaseMenu = (TextEditorBaseMenu) c1349M14724.f33659;
                if (textEditorBaseMenu.isEnabled()) {
                    return textEditorBaseMenu.checkVisible(new C18859(c14146));
                }
                return false;
            } catch (Throwable th) {
                th = th;
                c18249 = c182410;
                if (c18249 != null) {
                    c18249.m41526(th);
                }
                return false;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // p067l.AbstractC5094
    /* JADX INFO: renamed from: ۧ */
    public final C17833 mo10848() {
        m14723();
        return new C17833(this.f16643, this);
    }

    @Override // p067l.AbstractC5094
    /* JADX INFO: renamed from: ֫ */
    public final Drawable mo10844(Context context) {
        m14723();
        Drawable drawable = this.f16636;
        if (drawable != null) {
            drawable.setTintList(C23223.f72979);
        }
        return drawable;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m14725(View view) {
        AbstractActivityC5549 abstractActivityC5549 = (AbstractActivityC5549) C7453.m17221(view.getContext());
        if (abstractActivityC5549 == null) {
            C22682.m50800("Cannot get the activity");
            return;
        }
        C18249 c18249 = null;
        try {
            C1349 c1349M14724 = m14724();
            C18249 c182410 = (C18249) c1349M14724.f33658;
            try {
                ((TextEditorBaseMenu) c1349M14724.f33659).onPluginButtonClick(new C19456(c182410.m41540(), abstractActivityC5549));
            } catch (Throwable th) {
                th = th;
                c18249 = c182410;
                if (c18249 != null) {
                    c18249.m41526(th);
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // p067l.AbstractC5094
    /* JADX INFO: renamed from: ֫ */
    public final void mo10846(C14146 c14146) {
        C18249 c18249;
        AbstractActivityC5549 abstractActivityC5549 = (AbstractActivityC5549) C7453.m17221(c14146.getContext());
        if (abstractActivityC5549 == null) {
            C22682.m50800("Cannot get the activity");
            return;
        }
        try {
            try {
                C1349 c1349M14724 = m14724();
                c18249 = (C18249) c1349M14724.f33658;
                try {
                    ((TextEditorBaseMenu) c1349M14724.f33659).onMenuClick(new C19456(c18249.m41540(), abstractActivityC5549), new C18859(c14146));
                } catch (Throwable th) {
                    th = th;
                    abstractActivityC5549.m12259(th, (DialogInterface.OnDismissListener) null);
                    if (c18249 != null) {
                        c18249.m41526(th);
                    }
                }
            } catch (C16150 e) {
                C22682.m50795((CharSequence) e.getMessage());
            }
        } catch (Throwable th2) {
            th = th2;
            c18249 = null;
        }
    }
}
