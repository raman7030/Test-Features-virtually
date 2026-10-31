.class public final synthetic Ll/᩷۫᩻;
.super Ljava/lang/Object;
.source "Y6Y9"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ۗ:Ll/ۜ۫᩻;

.field public final synthetic ۙ:Landroid/widget/EditText;

.field public final synthetic ᩶:Ll/ۛ᩵᩷;

.field public final synthetic ᩸:Ll/֡ۚۢ;

.field public final synthetic ᩹:Ll/ۗܺ᩷;


# direct methods
.method public synthetic constructor <init>(Ll/֡ۚۢ;Ll/ۗܺ᩷;Ll/ۛ᩵᩷;Landroid/widget/EditText;Ll/ۜ۫᩻;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩷۫᩻;->᩸:Ll/֡ۚۢ;

    iput-object p2, p0, Ll/᩷۫᩻;->᩹:Ll/ۗܺ᩷;

    iput-object p3, p0, Ll/᩷۫᩻;->᩶:Ll/ۛ᩵᩷;

    iput-object p4, p0, Ll/᩷۫᩻;->ۙ:Landroid/widget/EditText;

    iput-object p5, p0, Ll/᩷۫᩻;->ۗ:Ll/ۜ۫᩻;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    .line 2
    iget-object v0, p0, Ll/᩷۫᩻;->᩶:Ll/ۛ᩵᩷;

    .line 4
    iget-object v1, p0, Ll/᩷۫᩻;->ۙ:Landroid/widget/EditText;

    .line 415
    iget-object v2, p0, Ll/᩷۫᩻;->᩸:Ll/֡ۚۢ;

    invoke-virtual {v2}, Ll/֡ۚۢ;->ۜ()Z

    move-result v2

    if-eqz v2, :cond_1

    iget-object v2, p0, Ll/᩷۫᩻;->᩹:Ll/ۗܺ᩷;

    invoke-virtual {v2}, Landroid/app/Activity;->isFinishing()Z

    move-result v3

    if-nez v3, :cond_1

    invoke-virtual {v2}, Landroid/app/Activity;->isDestroyed()Z

    move-result v3

    if-nez v3, :cond_1

    .line 416
    instance-of v3, v2, Ll/۠᩶᩷;

    if-eqz v3, :cond_0

    check-cast v2, Ll/۠᩶᩷;

    const/4 v3, 0x1

    .line 417
    invoke-virtual {v2, v3}, Ll/۠᩶᩷;->֫(Z)V

    .line 420
    :cond_0
    :try_start_0
    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v5, 0x0

    const/4 v6, 0x0

    const v2, 0x7f12059b

    const/4 v1, 0x0

    const/4 v4, 0x0

    .line 1630
    invoke-virtual/range {v0 .. v6}, Ll/ܶ᩵᩷;->֫(IILjava/lang/String;Ljava/lang/String;[Ljava/lang/String;Landroid/os/Bundle;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    .line 422
    iget-object v1, p0, Ll/᩷۫᩻;->ۗ:Ll/ۜ۫᩻;

    invoke-virtual {v1}, Ll/ۜ۫᩻;->run()V

    .line 423
    throw v0

    :cond_1
    return-void
.end method
