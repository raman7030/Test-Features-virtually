.class public Ll/᩺ܳ᩷;
.super Ljava/lang/Object;
.source "S7OD"

# interfaces
.implements Lbin/mt/plugin/api/ui/dialog/PluginDialog$OnKeyListener;


# instance fields
.field public ֫:J

.field public final synthetic ۧ:Lbin/mt/plugin/api/ui/dialog/BaseCancelableDialog;


# direct methods
.method public constructor <init>(Lbin/mt/plugin/api/ui/dialog/BaseCancelableDialog;)V
    .locals 2

    .line 44
    iput-object p1, p0, Ll/᩺ܳ᩷;->ۧ:Lbin/mt/plugin/api/ui/dialog/BaseCancelableDialog;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x0

    .line 45
    iput-wide v0, p0, Ll/᩺ܳ᩷;->֫:J

    return-void
.end method


# virtual methods
.method public onKey(Lbin/mt/plugin/api/ui/dialog/PluginDialog;ILandroid/view/KeyEvent;)Z
    .locals 4

    .line 49
    iget-object p1, p0, Ll/᩺ܳ᩷;->ۧ:Lbin/mt/plugin/api/ui/dialog/BaseCancelableDialog;

    invoke-static {p1}, Lbin/mt/plugin/api/ui/dialog/BaseCancelableDialog;->access$000(Lbin/mt/plugin/api/ui/dialog/BaseCancelableDialog;)Z

    move-result p1

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    .line 52
    :cond_0
    invoke-virtual {p3}, Landroid/view/KeyEvent;->getAction()I

    move-result p1

    if-nez p1, :cond_3

    const/4 p1, 0x4

    if-ne p2, p1, :cond_3

    .line 53
    iget-object p1, p0, Ll/᩺ܳ᩷;->ۧ:Lbin/mt/plugin/api/ui/dialog/BaseCancelableDialog;

    invoke-static {p1}, Lbin/mt/plugin/api/ui/dialog/BaseCancelableDialog;->access$100(Lbin/mt/plugin/api/ui/dialog/BaseCancelableDialog;)Z

    move-result p1

    const/4 p2, 0x1

    if-nez p1, :cond_2

    .line 54
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Ll/᩺ܳ᩷;->֫:J

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x7d0

    cmp-long p1, v0, v2

    if-gez p1, :cond_1

    .line 55
    iget-object p1, p0, Ll/᩺ܳ᩷;->ۧ:Lbin/mt/plugin/api/ui/dialog/BaseCancelableDialog;

    invoke-static {p1, p2}, Lbin/mt/plugin/api/ui/dialog/BaseCancelableDialog;->access$102(Lbin/mt/plugin/api/ui/dialog/BaseCancelableDialog;Z)Z

    .line 56
    iget-object p1, p0, Ll/᩺ܳ᩷;->ۧ:Lbin/mt/plugin/api/ui/dialog/BaseCancelableDialog;

    invoke-static {p1}, Lbin/mt/plugin/api/ui/dialog/BaseCancelableDialog;->access$200(Lbin/mt/plugin/api/ui/dialog/BaseCancelableDialog;)Lbin/mt/plugin/api/util/Consumer;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 58
    iget-object p1, p0, Ll/᩺ܳ᩷;->ۧ:Lbin/mt/plugin/api/ui/dialog/BaseCancelableDialog;

    invoke-static {p1}, Lbin/mt/plugin/api/ui/dialog/BaseCancelableDialog;->access$200(Lbin/mt/plugin/api/ui/dialog/BaseCancelableDialog;)Lbin/mt/plugin/api/util/Consumer;

    move-result-object p1

    iget-object p3, p0, Ll/᩺ܳ᩷;->ۧ:Lbin/mt/plugin/api/ui/dialog/BaseCancelableDialog;

    invoke-interface {p1, p3}, Lbin/mt/plugin/api/util/Consumer;->accept(Ljava/lang/Object;)V

    goto :goto_0

    .line 61
    :cond_1
    iget-object p1, p0, Ll/᩺ܳ᩷;->ۧ:Lbin/mt/plugin/api/ui/dialog/BaseCancelableDialog;

    iget-object p1, p1, Lbin/mt/plugin/api/ui/dialog/BaseCancelableDialog;->pluginUI:Lbin/mt/plugin/api/ui/PluginUI;

    const-string p3, "{press_again_to_cancel}"

    invoke-interface {p1, p3}, Lbin/mt/plugin/api/ui/PluginUI;->showToast(Ljava/lang/CharSequence;)V

    .line 62
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Ll/᩺ܳ᩷;->֫:J

    :cond_2
    :goto_0
    return p2

    :cond_3
    return v0
.end method
