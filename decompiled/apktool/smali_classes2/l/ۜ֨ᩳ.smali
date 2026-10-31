.class public final synthetic Ll/ۜ֨ᩳ;
.super Ljava/lang/Object;
.source "3B3L"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩸:I

.field public final synthetic ᩹:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ۜ֨ᩳ;->᩸:I

    iput-object p2, p0, Ll/ۜ֨ᩳ;->᩹:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 2
    iget v0, p0, Ll/ۜ֨ᩳ;->᩸:I

    packed-switch v0, :pswitch_data_0

    .line 7
    iget-object v0, p0, Ll/ۜ֨ᩳ;->᩹:Ljava/lang/Object;

    .line 9
    check-cast v0, Landroid/content/Context;

    .line 53
    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    const-string v2, "com.android.settings"

    const-string v3, "com.android.settings.Settings$OverlaySettingsActivity"

    .line 54
    invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const/high16 v2, 0x10000000

    .line 55
    invoke-virtual {v1, v2}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 69
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v2

    const/high16 v3, 0x10000

    invoke-virtual {v2, v1, v3}, Landroid/content/pm/PackageManager;->queryIntentActivities(Landroid/content/Intent;I)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-lez v2, :cond_0

    .line 57
    invoke-virtual {v0, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    goto :goto_0

    .line 0
    :pswitch_0
    iget-object v0, p0, Ll/ۜ֨ᩳ;->᩹:Ljava/lang/Object;

    check-cast v0, Landroid/widget/Button;

    const/4 v1, 0x1

    .line 271
    invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V

    return-void

    .line 0
    :pswitch_1
    iget-object v0, p0, Ll/ۜ֨ᩳ;->᩹:Ljava/lang/Object;

    check-cast v0, Ll/ۗۨܿ;

    invoke-static {v0}, Ll/ۗۨܿ;->ܽ(Ll/ۗۨܿ;)V

    return-void

    :pswitch_2
    iget-object v0, p0, Ll/ۜ֨ᩳ;->᩹:Ljava/lang/Object;

    check-cast v0, Ll/ܽܺܿ;

    invoke-static {v0}, Ll/ܽܺܿ;->֫(Ll/ܽܺܿ;)V

    return-void

    :pswitch_3
    iget-object v0, p0, Ll/ۜ֨ᩳ;->᩹:Ljava/lang/Object;

    check-cast v0, Ll/᩹ܶᩳ;

    invoke-static {v0}, Ll/᩹ܶᩳ;->ۧ(Ll/᩹ܶᩳ;)V

    return-void

    :cond_0
    const-string v2, "com.qihoo360.mobilesafe"

    const-string v4, "com.qihoo360.mobilesafe.ui.index.AppEnterActivity"

    .line 59
    invoke-virtual {v1, v2, v4}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 69
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v2

    invoke-virtual {v2, v1, v3}, Landroid/content/pm/PackageManager;->queryIntentActivities(Landroid/content/Intent;I)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-lez v2, :cond_1

    .line 61
    invoke-virtual {v0, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    :goto_0
    return-void

    .line 63
    :cond_1
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "intent is not available!"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
