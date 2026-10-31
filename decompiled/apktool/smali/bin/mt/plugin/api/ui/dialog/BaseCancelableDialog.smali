.class public abstract Lbin/mt/plugin/api/ui/dialog/BaseCancelableDialog;
.super Ljava/lang/Object;
.source "BaseCancelableDialog.java"


# instance fields
.field public cancelable:Z

.field public canceled:Z

.field public needSetKeyListener:Z

.field public onCancelListener:Lbin/mt/plugin/api/util/Consumer;

.field public final pluginUI:Lbin/mt/plugin/api/ui/PluginUI;


# direct methods
.method public constructor <init>(Lbin/mt/plugin/api/ui/PluginUI;)V
    .locals 1

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 10
    iput-boolean v0, p0, Lbin/mt/plugin/api/ui/dialog/BaseCancelableDialog;->needSetKeyListener:Z

    .line 13
    new-instance v0, Ll/ܰۗ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lbin/mt/plugin/api/ui/dialog/BaseCancelableDialog;->onCancelListener:Lbin/mt/plugin/api/util/Consumer;

    .line 16
    iput-object p1, p0, Lbin/mt/plugin/api/ui/dialog/BaseCancelableDialog;->pluginUI:Lbin/mt/plugin/api/ui/PluginUI;

    return-void
.end method

.method public static synthetic access$000(Lbin/mt/plugin/api/ui/dialog/BaseCancelableDialog;)Z
    .locals 0

    .line 8
    iget-boolean p0, p0, Lbin/mt/plugin/api/ui/dialog/BaseCancelableDialog;->cancelable:Z

    return p0
.end method

.method public static synthetic access$100(Lbin/mt/plugin/api/ui/dialog/BaseCancelableDialog;)Z
    .locals 0

    .line 8
    iget-boolean p0, p0, Lbin/mt/plugin/api/ui/dialog/BaseCancelableDialog;->canceled:Z

    return p0
.end method

.method public static synthetic access$102(Lbin/mt/plugin/api/ui/dialog/BaseCancelableDialog;Z)Z
    .locals 0

    .line 8
    iput-boolean p1, p0, Lbin/mt/plugin/api/ui/dialog/BaseCancelableDialog;->canceled:Z

    return p1
.end method

.method public static synthetic access$200(Lbin/mt/plugin/api/ui/dialog/BaseCancelableDialog;)Lbin/mt/plugin/api/util/Consumer;
    .locals 0

    .line 8
    iget-object p0, p0, Lbin/mt/plugin/api/ui/dialog/BaseCancelableDialog;->onCancelListener:Lbin/mt/plugin/api/util/Consumer;

    return-object p0
.end method


# virtual methods
.method public abstract dismiss()V
.end method

.method public abstract getDialog()Lbin/mt/plugin/api/ui/dialog/PluginDialog;
.end method

.method public isCanceled()Z
    .locals 1

    .line 93
    iget-boolean v0, p0, Lbin/mt/plugin/api/ui/dialog/BaseCancelableDialog;->canceled:Z

    return v0
.end method

.method public setCancelable()Lbin/mt/plugin/api/ui/dialog/BaseCancelableDialog;
    .locals 1

    const/4 v0, 0x1

    .line 29
    invoke-virtual {p0, v0}, Lbin/mt/plugin/api/ui/dialog/BaseCancelableDialog;->setCancelable(Z)Lbin/mt/plugin/api/ui/dialog/BaseCancelableDialog;

    move-result-object v0

    return-object v0
.end method

.method public setCancelable(Z)Lbin/mt/plugin/api/ui/dialog/BaseCancelableDialog;
    .locals 1

    .line 41
    iput-boolean p1, p0, Lbin/mt/plugin/api/ui/dialog/BaseCancelableDialog;->cancelable:Z

    if-eqz p1, :cond_0

    .line 42
    iget-boolean p1, p0, Lbin/mt/plugin/api/ui/dialog/BaseCancelableDialog;->needSetKeyListener:Z

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    .line 43
    iput-boolean p1, p0, Lbin/mt/plugin/api/ui/dialog/BaseCancelableDialog;->needSetKeyListener:Z

    .line 44
    invoke-virtual {p0}, Lbin/mt/plugin/api/ui/dialog/BaseCancelableDialog;->getDialog()Lbin/mt/plugin/api/ui/dialog/PluginDialog;

    move-result-object p1

    new-instance v0, Ll/᩺ܳ᩷;

    invoke-direct {v0, p0}, Ll/᩺ܳ᩷;-><init>(Lbin/mt/plugin/api/ui/dialog/BaseCancelableDialog;)V

    invoke-interface {p1, v0}, Lbin/mt/plugin/api/ui/dialog/PluginDialog;->setOnKeyListener(Lbin/mt/plugin/api/ui/dialog/PluginDialog$OnKeyListener;)V

    :cond_0
    return-object p0
.end method

.method public setOnCancelListener(Lbin/mt/plugin/api/util/Consumer;)Lbin/mt/plugin/api/ui/dialog/BaseCancelableDialog;
    .locals 0

    .line 82
    iput-object p1, p0, Lbin/mt/plugin/api/ui/dialog/BaseCancelableDialog;->onCancelListener:Lbin/mt/plugin/api/util/Consumer;

    return-object p0
.end method
