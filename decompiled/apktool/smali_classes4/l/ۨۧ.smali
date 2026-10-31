.class public final Ll/ۨۧ;
.super Ll/᩵ᩳ;
.source "V22O"


# instance fields
.field public final synthetic ۜ:Ll/᩻ܽ;


# direct methods
.method public constructor <init>(Ll/᩻ܽ;)V
    .locals 0

    .line 172
    iput-object p1, p0, Ll/ۨۧ;->ۜ:Ll/᩻ܽ;

    invoke-direct {p0}, Ll/᩵ᩳ;-><init>()V

    return-void
.end method


# virtual methods
.method public final ֫(ILl/᩸ᩳ;Ljava/lang/Object;)V
    .locals 8

    .line 185
    iget-object v0, p0, Ll/ۨۧ;->ۜ:Ll/᩻ܽ;

    invoke-virtual {p2, v0, p3}, Ll/᩸ᩳ;->ۧ(Landroid/content/Context;Ljava/lang/Object;)Ll/ܶᩳ;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 187
    new-instance p2, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p3

    invoke-direct {p2, p3}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance p3, Ll/ۤۧ;

    invoke-direct {p3, p0, p1, v1}, Ll/ۤۧ;-><init>(Ll/ۨۧ;ILl/ܶᩳ;)V

    invoke-virtual {p2, p3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void

    .line 197
    :cond_0
    invoke-virtual {p2, v0, p3}, Ll/᩸ᩳ;->֫(Landroid/content/Context;Ljava/lang/Object;)Landroid/content/Intent;

    move-result-object p2

    .line 200
    invoke-virtual {p2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object p3

    if-eqz p3, :cond_1

    invoke-virtual {p2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object p3

    invoke-virtual {p3}, Landroid/os/Bundle;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object p3

    if-nez p3, :cond_1

    .line 201
    invoke-virtual {v0}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object p3

    invoke-virtual {p2, p3}, Landroid/content/Intent;->setExtrasClassLoader(Ljava/lang/ClassLoader;)V

    :cond_1
    const-string p3, "androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE"

    .line 203
    invoke-virtual {p2, p3}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 204
    invoke-virtual {p2, p3}, Landroid/content/Intent;->getBundleExtra(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v1

    .line 205
    invoke-virtual {p2, p3}, Landroid/content/Intent;->removeExtra(Ljava/lang/String;)V

    move-object v7, v1

    goto :goto_0

    :cond_2
    const/4 p3, 0x0

    move-object v7, p3

    :goto_0
    const-string p3, "androidx.activity.result.contract.action.REQUEST_PERMISSIONS"

    .line 209
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_4

    const-string p3, "androidx.activity.result.contract.extra.PERMISSIONS"

    .line 212
    invoke-virtual {p2, p3}, Landroid/content/Intent;->getStringArrayExtra(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p2

    if-nez p2, :cond_3

    const/4 p2, 0x0

    new-array p2, p2, [Ljava/lang/String;

    .line 218
    :cond_3
    invoke-static {v0, p2, p1}, Ll/ᩴ᩹;->֫(Landroid/app/Activity;[Ljava/lang/String;I)V

    return-void

    :cond_4
    const-string p3, "androidx.activity.result.contract.action.INTENT_SENDER_REQUEST"

    .line 219
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_5

    const-string p3, "androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST"

    .line 221
    invoke-virtual {p2, p3}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p2

    check-cast p2, Ll/۠ᩳ;

    .line 224
    :try_start_0
    invoke-virtual {p2}, Ll/۠ᩳ;->ᩳ()Landroid/content/IntentSender;

    move-result-object v1

    .line 225
    invoke-virtual {p2}, Ll/۠ᩳ;->֫()Landroid/content/Intent;

    move-result-object v3

    invoke-virtual {p2}, Ll/۠ᩳ;->ۧ()I

    move-result v4

    .line 226
    invoke-virtual {p2}, Ll/۠ᩳ;->ܽ()I

    move-result v5

    const/4 v6, 0x0

    move v2, p1

    .line 277
    invoke-virtual/range {v0 .. v7}, Landroid/app/Activity;->startIntentSenderForResult(Landroid/content/IntentSender;ILandroid/content/Intent;IIILandroid/os/Bundle;)V
    :try_end_0
    .catch Landroid/content/IntentSender$SendIntentException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p2

    .line 228
    new-instance p3, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {p3, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v0, Ll/ۛۧ;

    invoke-direct {v0, p0, p1, p2}, Ll/ۛۧ;-><init>(Ll/ۨۧ;ILandroid/content/IntentSender$SendIntentException;)V

    invoke-virtual {p3, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void

    .line 244
    :cond_5
    invoke-virtual {v0, p2, p1, v7}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;ILandroid/os/Bundle;)V

    return-void
.end method
