package p067l;

import android.content.Context;
import android.content.DialogInterface;
import android.view.KeyEvent;
import bin.p000mt.plugin.api.p002ui.PluginView;
import bin.p000mt.plugin.api.p002ui.dialog.PluginDialog;

/* JADX INFO: renamed from: l.᩸᩷᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: U7QN */
/* JADX INFO: loaded from: classes.dex */
public final class C23124 implements PluginDialog.Builder {

    /* JADX INFO: renamed from: ֫ */
    public final C20671 f72672;

    /* JADX INFO: renamed from: ۧ */
    public final C20048 f72673;

    /* JADX INFO: renamed from: ܽ */
    public final C19456 f72674;

    public C23124(C19456 c19456, Context context) {
        this.f72674 = c19456;
        this.f72673 = new C20048(c19456);
        int i = DialogInterfaceC2564.f4230;
        this.f72672 = new C20671(context);
    }

    @Override // bin.mt.plugin.api.ui.dialog.PluginDialog.Builder
    public final PluginDialog.Builder setTitle(CharSequence charSequence) {
        this.f72672.m46730(m51576(charSequence));
        return this;
    }

    @Override // bin.mt.plugin.api.ui.dialog.PluginDialog.Builder
    public final PluginDialog.Builder setMessage(CharSequence charSequence) {
        this.f72672.m46718(m51576(charSequence));
        return this;
    }

    @Override // bin.mt.plugin.api.ui.dialog.PluginDialog.Builder
    public final PluginDialog.Builder setPositiveButton(CharSequence charSequence, final PluginDialog.OnClickListener onClickListener) {
        this.f72672.m46735(m51576(charSequence), onClickListener == null ? null : new DialogInterface.OnClickListener() { // from class: l.ۚ᩷᩷
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                onClickListener.onClick(this.f20212.f72673, i);
            }
        });
        return this;
    }

    @Override // bin.mt.plugin.api.ui.dialog.PluginDialog.Builder
    public final PluginDialog.Builder setNegativeButton(CharSequence charSequence, PluginDialog.OnClickListener onClickListener) {
        this.f72672.m46719(m51576(charSequence), onClickListener == null ? null : new DialogInterfaceOnClickListenerC19367(1, this, onClickListener));
        return this;
    }

    @Override // bin.mt.plugin.api.ui.dialog.PluginDialog.Builder
    public final PluginDialog.Builder setNeutralButton(CharSequence charSequence, PluginDialog.OnClickListener onClickListener) {
        this.f72672.m46731(m51576(charSequence), onClickListener == null ? null : new DialogInterfaceOnClickListenerC18025(2, this, onClickListener));
        return this;
    }

    @Override // bin.mt.plugin.api.ui.dialog.PluginDialog.Builder
    public final PluginDialog.Builder setCancelable(boolean z) {
        this.f72672.m46722(z);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.dialog.PluginDialog.Builder
    public final PluginDialog.Builder setOnCancelListener(final PluginDialog.OnCancelListener onCancelListener) {
        this.f72672.m46713(onCancelListener == null ? null : new DialogInterface.OnCancelListener() { // from class: l.ܶ᩷᩷
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                onCancelListener.onCancel(this.f50500.f72673);
            }
        });
        return this;
    }

    @Override // bin.mt.plugin.api.ui.dialog.PluginDialog.Builder
    public final PluginDialog.Builder setOnDismissListener(final PluginDialog.OnDismissListener onDismissListener) {
        this.f72672.m46714(onDismissListener == null ? null : new DialogInterface.OnDismissListener() { // from class: l.᩵᩷᩷
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                onDismissListener.onDismiss(this.f66373.f72673);
            }
        });
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // bin.mt.plugin.api.ui.dialog.PluginDialog.Builder
    public final PluginDialog.Builder setOnShowListener(final PluginDialog.OnShowListener onShowListener) {
        this.f72672.m46720(onShowListener == null ? 0 : new DialogInterface.OnShowListener() { // from class: l.֡᩷᩷
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                onShowListener.onShow(this.f5356.f72673);
            }
        });
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // bin.mt.plugin.api.ui.dialog.PluginDialog.Builder
    public final PluginDialog.Builder setOnKeyListener(final PluginDialog.OnKeyListener onKeyListener) {
        this.f72672.m46721(onKeyListener == null ? 0 : new DialogInterface.OnKeyListener() { // from class: l.֨᩷᩷
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                return onKeyListener.onKey(this.f7785.f72673, i, keyEvent);
            }
        });
        return this;
    }

    @Override // bin.mt.plugin.api.ui.dialog.PluginDialog.Builder
    public final PluginDialog.Builder setItems(CharSequence[] charSequenceArr, PluginDialog.OnClickListener onClickListener) {
        this.f72672.m46724(charSequenceArr, onClickListener == null ? null : new DialogInterfaceOnClickListenerC13339(2, this, onClickListener));
        return this;
    }

    @Override // bin.mt.plugin.api.ui.dialog.PluginDialog.Builder
    public final PluginDialog.Builder setMultiChoiceItems(CharSequence[] charSequenceArr, boolean[] zArr, final PluginDialog.OnMultiChoiceClickListener onMultiChoiceClickListener) {
        this.f72672.m46725(charSequenceArr, zArr, onMultiChoiceClickListener == null ? null : new DialogInterface.OnMultiChoiceClickListener() { // from class: l.۠᩷᩷
            @Override // android.content.DialogInterface.OnMultiChoiceClickListener
            public final void onClick(DialogInterface dialogInterface, int i, boolean z) {
                onMultiChoiceClickListener.onClick(this.f28739.f72673, i, z);
            }
        });
        return this;
    }

    @Override // bin.mt.plugin.api.ui.dialog.PluginDialog.Builder
    public final PluginDialog.Builder setSingleChoiceItems(CharSequence[] charSequenceArr, int i, PluginDialog.OnClickListener onClickListener) {
        this.f72672.m46723(charSequenceArr, i, onClickListener == null ? null : new DialogInterfaceOnClickListenerC19334(1, this, onClickListener));
        return this;
    }

    @Override // bin.mt.plugin.api.ui.dialog.PluginDialog.Builder
    public final PluginDialog.Builder setView(PluginView pluginView) {
        this.f72672.m46715(C20048.m45402(pluginView));
        return this;
    }

    @Override // bin.mt.plugin.api.ui.dialog.PluginDialog.Builder
    public final PluginDialog create() {
        DialogInterfaceC2564 dialogInterfaceC2564M46709 = this.f72672.m46709();
        C20048 c20048 = this.f72673;
        c20048.m45405(dialogInterfaceC2564M46709);
        return c20048;
    }

    @Override // bin.mt.plugin.api.ui.dialog.PluginDialog.Builder
    public final PluginDialog show() {
        DialogInterfaceC2564 dialogInterfaceC2564M46732 = this.f72672.m46732();
        C20048 c20048 = this.f72673;
        c20048.m45405(dialogInterfaceC2564M46732);
        return c20048;
    }

    /* JADX INFO: renamed from: ֫ */
    public final CharSequence m51576(CharSequence charSequence) {
        String stringNullable;
        if (charSequence instanceof String) {
            String str = (String) charSequence;
            if (str.length() >= 3 && str.charAt(0) == '{' && C9417.m21911(1, str) == '}' && (stringNullable = this.f72674.getContext().getStringNullable(str)) != null) {
                return stringNullable;
            }
        }
        return charSequence;
    }
}
