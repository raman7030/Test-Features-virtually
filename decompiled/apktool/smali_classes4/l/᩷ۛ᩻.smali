.class public final synthetic Ll/᩷ۛ᩻;
.super Ljava/lang/Object;
.source "A6XJ"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩸:I

.field public final synthetic ᩹:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 0
    iput p1, p0, Ll/᩷ۛ᩻;->᩸:I

    iput-object p2, p0, Ll/᩷ۛ᩻;->᩹:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 2
    iget v0, p0, Ll/᩷ۛ᩻;->᩸:I

    .line 4
    iget-object v1, p0, Ll/᩷ۛ᩻;->᩹:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    .line 9
    check-cast v1, Lcom/google/android/material/search/SearchView;

    .line 12
    invoke-static {v1}, Lcom/google/android/material/search/SearchView;->$r8$lambda$bnspkZFwTlQzgGY9VlFfpkzFBmQ(Lcom/google/android/material/search/SearchView;)V

    return-void

    .line 15
    :pswitch_0
    check-cast v1, Landroid/content/Context;

    .line 60
    :try_start_0
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    const/high16 v2, 0x10000000

    .line 61
    invoke-virtual {v0, v2}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 63
    new-instance v2, Landroid/content/ComponentName;

    const-string v3, "com.coloros.safecenter"

    const-string v4, "com.coloros.safecenter.sysfloatwindow.FloatWindowListActivity"

    invoke-direct {v2, v3, v4}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 64
    invoke-virtual {v0, v2}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 65
    invoke-virtual {v1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    .line 67
    new-instance v1, Ljava/lang/RuntimeException;

    const-string v2, "Unable to open OPPO floating window settings"

    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    .line 0
    :pswitch_1
    check-cast v1, Ll/۟᩸ۢ;

    sget v0, Ll/۟᩸ۢ;->ۖۧ:I

    .line 372
    sget-boolean v0, Ll/֫᩸ۢ;->ۧ:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    const v2, 0x7f120a34

    .line 24
    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    const-string v3, "term_api29_limit"

    invoke-static {v1, v3, v2, v0}, Ll/ۧۛܿ;->֫(Ll/ۗܺ᩷;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 375
    :cond_0
    new-instance v0, Ll/ۖ۫᩻;

    const/4 v2, 0x4

    invoke-direct {v0, v2, v1}, Ll/ۖ۫᩻;-><init>(ILjava/lang/Object;)V

    .line 443
    new-instance v2, Ll/ᩳ᩹᩷;

    const/4 v3, 0x3

    invoke-direct {v2, v3, v1, v0}, Ll/ᩳ᩹᩷;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v1, v2}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void

    .line 0
    :pswitch_2
    check-cast v1, Ll/֡ۖۢ;

    invoke-static {v1}, Ll/֡ۖۢ;->֫(Ll/֡ۖۢ;)V

    return-void

    :pswitch_3
    check-cast v1, Ll/ܰܳۡ;

    invoke-virtual {v1}, Ll/᩶ۗۧ;->notifyDataSetChanged()V

    return-void

    :pswitch_4
    check-cast v1, Ll/ۤۤۜ;

    sget v0, Ll/ۤۤۜ;->᩻ܿ:I

    .line 1779
    new-instance v0, Ll/ۧ۫ۜ;

    invoke-direct {v0, v1}, Ll/ۧ۫ۜ;-><init>(Ll/ۤۤۜ;)V

    invoke-static {v0}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;)V

    return-void

    .line 0
    :pswitch_5
    check-cast v1, Ll/ۨ۬ܿ;

    invoke-virtual {v1}, Ll/ۨ۬ܿ;->֫()V

    return-void

    :pswitch_6
    check-cast v1, Ll/֡ܳܿ;

    invoke-static {v1}, Ll/֡ܳܿ;->֫(Ll/֡ܳܿ;)V

    return-void

    :pswitch_7
    check-cast v1, Ll/۫۟ܽ;

    invoke-static {v1}, Ll/۫۟ܽ;->ܽ(Ll/۫۟ܽ;)V

    return-void

    :pswitch_8
    check-cast v1, Ll/᩶۬֫;

    invoke-static {v1}, Ll/᩶۬֫;->֫(Ll/᩶۬֫;)V

    return-void

    :pswitch_9
    check-cast v1, Ll/᩵ۛ᩻;

    invoke-static {v1}, Ll/᩵ۛ᩻;->֫(Ll/᩵ۛ᩻;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
