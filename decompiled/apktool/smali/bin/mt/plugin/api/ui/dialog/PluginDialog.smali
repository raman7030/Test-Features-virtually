.class public interface abstract Lbin/mt/plugin/api/ui/dialog/PluginDialog;
.super Ljava/lang/Object;
.source "PluginDialog.java"


# static fields
.field public static final BUTTON_NEGATIVE:I = -0x2

.field public static final BUTTON_NEUTRAL:I = -0x3

.field public static final BUTTON_POSITIVE:I = -0x1


# virtual methods
.method public abstract cancel()V
.end method

.method public abstract dismiss()V
.end method

.method public abstract getNegativeButton()Lbin/mt/plugin/api/ui/PluginButton;
.end method

.method public abstract getNeutralButton()Lbin/mt/plugin/api/ui/PluginButton;
.end method

.method public abstract getPluginUI()Lbin/mt/plugin/api/ui/PluginUI;
.end method

.method public abstract getPositiveButton()Lbin/mt/plugin/api/ui/PluginButton;
.end method

.method public abstract isShowing()Z
.end method

.method public abstract setCancelable(Z)V
.end method

.method public abstract setMessage(Ljava/lang/CharSequence;)V
.end method

.method public abstract setNegativeButton(Ljava/lang/CharSequence;Lbin/mt/plugin/api/ui/dialog/PluginDialog$OnClickListener;)V
.end method

.method public abstract setNeutralButton(Ljava/lang/CharSequence;Lbin/mt/plugin/api/ui/dialog/PluginDialog$OnClickListener;)V
.end method

.method public abstract setOnCancelListener(Lbin/mt/plugin/api/ui/dialog/PluginDialog$OnCancelListener;)V
.end method

.method public abstract setOnDismissListener(Lbin/mt/plugin/api/ui/dialog/PluginDialog$OnDismissListener;)V
.end method

.method public abstract setOnKeyListener(Lbin/mt/plugin/api/ui/dialog/PluginDialog$OnKeyListener;)V
.end method

.method public abstract setOnShowListener(Lbin/mt/plugin/api/ui/dialog/PluginDialog$OnShowListener;)V
.end method

.method public abstract setPositiveButton(Ljava/lang/CharSequence;Lbin/mt/plugin/api/ui/dialog/PluginDialog$OnClickListener;)V
.end method

.method public abstract setTitle(Ljava/lang/CharSequence;)V
.end method

.method public abstract setView(Lbin/mt/plugin/api/ui/PluginView;)V
.end method

.method public abstract show()V
.end method
