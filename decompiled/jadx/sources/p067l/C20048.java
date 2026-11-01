package p067l;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ScrollView;
import bin.p000mt.plugin.api.p002ui.PluginButton;
import bin.p000mt.plugin.api.p002ui.PluginUI;
import bin.p000mt.plugin.api.p002ui.PluginView;
import bin.p000mt.plugin.api.p002ui.PluginViewGroup;
import bin.p000mt.plugin.api.p002ui.dialog.PluginDialog;

/* JADX INFO: renamed from: l.ᩴۜ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 57RA */
/* JADX INFO: loaded from: classes5.dex */
public final class C20048 implements PluginDialog {

    /* JADX INFO: renamed from: ֫ */
    public C13342 f60920;

    /* JADX INFO: renamed from: ۧ */
    public DialogInterfaceC2564 f60921;

    /* JADX INFO: renamed from: ܳ */
    public volatile C18706 f60922;

    /* JADX INFO: renamed from: ܽ */
    public volatile C18706 f60923;

    /* JADX INFO: renamed from: ܿ */
    public final C19456 f60924;

    /* JADX INFO: renamed from: ᩳ */
    public volatile C18706 f60925;

    public C20048(C19456 c19456) {
        this.f60924 = c19456;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m45405(DialogInterfaceC2564 dialogInterfaceC2564) {
        this.f60921 = dialogInterfaceC2564;
        C10884.m25071(dialogInterfaceC2564);
    }

    @Override // bin.p000mt.plugin.api.p002ui.dialog.PluginDialog
    public final PluginUI getPluginUI() {
        return this.f60924;
    }

    @Override // bin.p000mt.plugin.api.p002ui.dialog.PluginDialog
    public final void show() {
        this.f60921.m3862();
    }

    @Override // bin.p000mt.plugin.api.p002ui.dialog.PluginDialog
    public final void dismiss() {
        this.f60921.dismiss();
    }

    @Override // bin.p000mt.plugin.api.p002ui.dialog.PluginDialog
    public final void cancel() {
        this.f60921.cancel();
    }

    /* JADX INFO: renamed from: ֫ */
    private PluginViewGroup m45403(Button button) {
        if (this.f60920 == null) {
            C13342 c13342 = new C13342(this.f60924, null);
            c13342.f25339 = (ViewGroup) button.getParent();
            this.f60920 = c13342;
        }
        return this.f60920;
    }

    @Override // bin.p000mt.plugin.api.p002ui.dialog.PluginDialog
    public final PluginButton getPositiveButton() {
        if (this.f60922 != null) {
            return this.f60922;
        }
        Button buttonM3860 = this.f60921.m3860();
        if (buttonM3860 == null) {
            return null;
        }
        synchronized (this.f60921) {
            if (this.f60922 != null) {
                return this.f60922;
            }
            C18706 c18706 = new C18706(this.f60924, m45403(buttonM3860), PluginButton.Style.DEFAULT);
            c18706.f25339 = buttonM3860;
            this.f60922 = c18706;
            return c18706;
        }
    }

    @Override // bin.p000mt.plugin.api.p002ui.dialog.PluginDialog
    public final PluginButton getNegativeButton() {
        if (this.f60923 != null) {
            return this.f60923;
        }
        Button buttonM3859 = this.f60921.m3859();
        if (buttonM3859 == null) {
            return null;
        }
        synchronized (this.f60921) {
            if (this.f60923 != null) {
                return this.f60923;
            }
            C18706 c18706 = new C18706(this.f60924, m45403(buttonM3859), PluginButton.Style.DEFAULT);
            c18706.f25339 = buttonM3859;
            this.f60923 = c18706;
            return c18706;
        }
    }

    @Override // bin.p000mt.plugin.api.p002ui.dialog.PluginDialog
    public final PluginButton getNeutralButton() {
        if (this.f60925 != null) {
            return this.f60925;
        }
        Button buttonM3861 = this.f60921.m3861();
        if (buttonM3861 == null) {
            return null;
        }
        synchronized (this.f60921) {
            if (this.f60925 != null) {
                return this.f60925;
            }
            C18706 c18706 = new C18706(this.f60924, m45403(buttonM3861), PluginButton.Style.DEFAULT);
            c18706.f25339 = buttonM3861;
            this.f60925 = c18706;
            return c18706;
        }
    }

    @Override // bin.p000mt.plugin.api.p002ui.dialog.PluginDialog
    public final void setPositiveButton(CharSequence charSequence, PluginDialog.OnClickListener onClickListener) {
        this.f60921.m3847(-1, m45404(charSequence), onClickListener == null ? null : new DialogInterfaceOnClickListenerC7319(1, this, onClickListener));
    }

    @Override // bin.p000mt.plugin.api.p002ui.dialog.PluginDialog
    public final void setNegativeButton(CharSequence charSequence, final PluginDialog.OnClickListener onClickListener) {
        this.f60921.m3847(-2, m45404(charSequence), onClickListener == null ? null : new DialogInterface.OnClickListener() { // from class: l.᩷ۜ᩷
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                C20048 c20048 = this.f69395;
                c20048.getClass();
                onClickListener.onClick(c20048, i);
            }
        });
    }

    @Override // bin.p000mt.plugin.api.p002ui.dialog.PluginDialog
    public final void setNeutralButton(CharSequence charSequence, PluginDialog.OnClickListener onClickListener) {
        this.f60921.m3847(-3, m45404(charSequence), onClickListener == null ? null : new DialogInterfaceOnClickListenerC5966(0, this, onClickListener));
    }

    @Override // bin.p000mt.plugin.api.p002ui.dialog.PluginDialog
    public final boolean isShowing() {
        return this.f60921.m3855();
    }

    @Override // bin.p000mt.plugin.api.p002ui.dialog.PluginDialog
    public final void setView(PluginView pluginView) {
        this.f60921.m3852((ViewGroup) m45402(pluginView));
    }

    /* JADX INFO: renamed from: ֫ */
    public static ScrollView m45402(PluginView pluginView) {
        View view = ((C9318) pluginView).f25339;
        ScrollView scrollView = new ScrollView(view.getContext());
        scrollView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        scrollView.addView(view);
        return scrollView;
    }

    /* JADX INFO: renamed from: ֫ */
    public final CharSequence m45404(CharSequence charSequence) {
        String stringNullable;
        if (charSequence instanceof String) {
            String str = (String) charSequence;
            if (str.length() >= 3 && str.charAt(0) == '{' && C9417.m21911(1, str) == '}' && (stringNullable = this.f60924.getContext().getStringNullable(str)) != null) {
                return stringNullable;
            }
        }
        return charSequence;
    }

    @Override // bin.p000mt.plugin.api.p002ui.dialog.PluginDialog
    public final void setTitle(CharSequence charSequence) {
        this.f60921.m3857(m45404(charSequence));
    }

    @Override // bin.p000mt.plugin.api.p002ui.dialog.PluginDialog
    public final void setMessage(CharSequence charSequence) {
        this.f60921.m3853(m45404(charSequence));
    }

    @Override // bin.p000mt.plugin.api.p002ui.dialog.PluginDialog
    public final void setCancelable(boolean z) {
        this.f60921.m3854(z);
    }

    @Override // bin.p000mt.plugin.api.p002ui.dialog.PluginDialog
    public final void setOnCancelListener(final PluginDialog.OnCancelListener onCancelListener) {
        this.f60921.m3848(onCancelListener == null ? null : new DialogInterface.OnCancelListener() { // from class: l.ۢۜ᩷
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                C20048 c20048 = this.f31560;
                c20048.getClass();
                onCancelListener.onCancel(c20048);
            }
        });
    }

    @Override // bin.p000mt.plugin.api.p002ui.dialog.PluginDialog
    public final void setOnDismissListener(final PluginDialog.OnDismissListener onDismissListener) {
        this.f60921.m3849(onDismissListener == null ? null : new DialogInterface.OnDismissListener() { // from class: l.ܺۜ᩷
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                C20048 c20048 = this.f51766;
                c20048.getClass();
                onDismissListener.onDismiss(c20048);
            }
        });
    }

    @Override // bin.p000mt.plugin.api.p002ui.dialog.PluginDialog
    public final void setOnShowListener(final PluginDialog.OnShowListener onShowListener) {
        this.f60921.m3851(onShowListener == null ? null : new DialogInterface.OnShowListener() { // from class: l.ۖۜ᩷
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                C20048 c20048 = this.f10372;
                c20048.getClass();
                onShowListener.onShow(c20048);
            }
        });
    }

    @Override // bin.p000mt.plugin.api.p002ui.dialog.PluginDialog
    public final void setOnKeyListener(final PluginDialog.OnKeyListener onKeyListener) {
        this.f60921.m3850(onKeyListener == null ? null : new DialogInterface.OnKeyListener() { // from class: l.ۡۜ᩷
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                C20048 c20048 = this.f29489;
                c20048.getClass();
                return onKeyListener.onKey(c20048, i, keyEvent);
            }
        });
    }
}
