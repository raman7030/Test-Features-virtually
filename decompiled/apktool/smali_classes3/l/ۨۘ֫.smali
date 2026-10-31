.class public Ll/ۨۘ֫;
.super Landroid/content/BroadcastReceiver;
.source "X59Z"


# static fields
.field public static final synthetic ֫:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 104
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method

.method public static ֫(Landroid/content/Context;Ljava/lang/String;)Landroid/content/ComponentName;
    .locals 3

    .line 349
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    .line 350
    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1, p1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 351
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    const/4 p0, 0x0

    .line 352
    invoke-virtual {v0, v1, p0}, Landroid/content/pm/PackageManager;->queryIntentServices(Landroid/content/Intent;I)Ljava/util/List;

    move-result-object v0

    .line 353
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    .line 354
    invoke-interface {v0, p0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/content/pm/ResolveInfo;

    .line 355
    new-instance p1, Landroid/content/ComponentName;

    iget-object p0, p0, Landroid/content/pm/ResolveInfo;->serviceInfo:Landroid/content/pm/ServiceInfo;

    iget-object v0, p0, Landroid/content/pm/ServiceInfo;->packageName:Ljava/lang/String;

    iget-object p0, p0, Landroid/content/pm/ServiceInfo;->name:Ljava/lang/String;

    invoke-direct {p1, v0, p0}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object p1

    .line 357
    :cond_0
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result p0

    if-eqz p0, :cond_1

    const/4 p0, 0x0

    return-object p0

    .line 360
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v1, "Expected 1 service that handles "

    const-string v2, ", found "

    .line 0
    invoke-static {v1, p1, v2}, Ll/ۗۧᩳ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    .line 361
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 3

    if-eqz p2, :cond_4

    .line 110
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    const-string v1, "android.intent.action.MEDIA_BUTTON"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    const-string v0, "android.intent.extra.KEY_EVENT"

    .line 111
    invoke-virtual {p2, v0}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 116
    :cond_0
    invoke-static {p1, v1}, Ll/ۨۘ֫;->֫(Landroid/content/Context;Ljava/lang/String;)Landroid/content/ComponentName;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 118
    invoke-virtual {p2, v0}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 120
    :try_start_0
    invoke-static {p1, p2}, Ll/֨ۙ;->֫(Landroid/content/Context;Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 122
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x1f

    if-lt p2, v0, :cond_1

    .line 123
    invoke-static {p1}, Ll/ۤۘ֫;->ۧ(Ljava/lang/IllegalStateException;)Z

    move-result p2

    if-eqz p2, :cond_1

    .line 125
    invoke-static {p1}, Ll/ۤۘ֫;->֫(Ljava/lang/IllegalStateException;)Landroid/app/ForegroundServiceStartNotAllowedException;

    move-result-object p1

    .line 181
    invoke-virtual {p1}, Landroid/app/ForegroundServiceStartNotAllowedException;->getMessage()Ljava/lang/String;

    return-void

    .line 127
    :cond_1
    throw p1

    :cond_2
    const-string v0, "android.media.browse.MediaBrowserService"

    .line 132
    invoke-static {p1, v0}, Ll/ۨۘ֫;->֫(Landroid/content/Context;Ljava/lang/String;)Landroid/content/ComponentName;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 135
    invoke-virtual {p0}, Landroid/content/BroadcastReceiver;->goAsync()Landroid/content/BroadcastReceiver$PendingResult;

    move-result-object v1

    .line 136
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    .line 137
    new-instance v2, Ll/ۛۘ֫;

    invoke-direct {v2, p1, p2, v1}, Ll/ۛۘ֫;-><init>(Landroid/content/Context;Landroid/content/Intent;Landroid/content/BroadcastReceiver$PendingResult;)V

    .line 139
    new-instance p2, Ll/۫;

    invoke-direct {p2, p1, v0, v2}, Ll/۫;-><init>(Landroid/content/Context;Landroid/content/ComponentName;Ll/ۖ;)V

    .line 141
    invoke-virtual {v2, p2}, Ll/ۛۘ֫;->֫(Ll/۫;)V

    .line 142
    invoke-virtual {p2}, Ll/۫;->֫()V

    return-void

    .line 145
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Could not find any Service that handles android.intent.action.MEDIA_BUTTON or implements a media browser service."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 112
    :cond_4
    :goto_0
    invoke-static {p2}, Ll/ۧ۫ᩴ;->toString(Ljava/lang/Object;)Ljava/lang/String;

    return-void
.end method
