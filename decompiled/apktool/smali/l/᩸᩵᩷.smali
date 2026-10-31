.class public final synthetic Ll/᩸᩵᩷;
.super Ljava/lang/Object;
.source "6AY4"

# interfaces
.implements Ll/᩵᩹᩷;


# instance fields
.field public final synthetic ᩸:Ll/ۨ᩵᩷;


# direct methods
.method public synthetic constructor <init>(Ll/ۨ᩵᩷;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩸᩵᩷;->᩸:Ll/ۨ᩵᩷;

    return-void
.end method


# virtual methods
.method public final ֫(Landroid/content/Intent;I)V
    .locals 2

    .line 1571
    iget-object v0, p0, Ll/᩸᩵᩷;->᩸:Ll/ۨ᩵᩷;

    if-nez p2, :cond_0

    .line 1572
    invoke-interface {v0}, Ll/ۨ᩵᩷;->onCanceled()V

    return-void

    :cond_0
    const/4 v1, -0x1

    if-ne p2, v1, :cond_1

    if-eqz p1, :cond_1

    const-string p2, "path"

    .line 1574
    invoke-virtual {p1, p2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_1

    const-string v1, "extra"

    .line 1575
    invoke-virtual {p1, v1}, Landroid/content/Intent;->getBundleExtra(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object p1

    invoke-static {p1}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;)V

    invoke-interface {v0, p1, p2}, Ll/ۨ᩵᩷;->onGetPath(Landroid/os/Bundle;Ljava/lang/String;)V

    :cond_1
    return-void
.end method
