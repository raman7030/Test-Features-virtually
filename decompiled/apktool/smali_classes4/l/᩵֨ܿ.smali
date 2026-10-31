.class public Ll/᩵֨ܿ;
.super Landroid/content/BroadcastReceiver;
.source "F7HH"


# static fields
.field public static final ֫:Ll/ۙۜᩴ;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 12
    new-instance v0, Ll/ۙۜᩴ;

    invoke-direct {v0}, Ll/ۙۜᩴ;-><init>()V

    sput-object v0, Ll/᩵֨ܿ;->֫:Ll/ۙۜᩴ;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 11
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method

.method public static bridge synthetic ֫()Ll/ۙۜᩴ;
    .locals 1

    .line 0
    sget-object v0, Ll/᩵֨ܿ;->֫:Ll/ۙۜᩴ;

    return-object v0
.end method

.method public static ֫(I)Ll/ᩴ֨ܿ;
    .locals 4

    .line 20
    sget-object v1, Ll/᩵֨ܿ;->֫:Ll/ۙۜᩴ;

    move-object v0, v1

    monitor-enter v0

    .line 447
    :try_start_0
    invoke-interface {v1, p0}, Ll/۬ۜᩴ;->get(I)Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_1

    .line 448
    invoke-interface {v1, p0}, Ll/ܰۜᩴ;->֫(I)Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_0

    .line 450
    :cond_0
    new-instance v2, Ll/ᩴ֨ܿ;

    invoke-direct {v2, p0}, Ll/ᩴ֨ܿ;-><init>(I)V

    .line 451
    invoke-interface {v1, p0, v2}, Ll/۬ۜᩴ;->֫(ILjava/lang/Object;)Ljava/lang/Object;

    .line 21
    :cond_1
    :goto_0
    check-cast v2, Ll/ᩴ֨ܿ;

    monitor-exit v0

    return-object v2

    :catchall_0
    move-exception p0

    .line 22
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public static ֫(IILjava/lang/String;)V
    .locals 2

    .line 27
    sget-object v1, Ll/᩵֨ܿ;->֫:Ll/ۙۜᩴ;

    move-object v0, v1

    monitor-enter v0

    .line 28
    :try_start_0
    invoke-virtual {v1, p0}, Ll/ۙۜᩴ;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/ᩴ֨ܿ;

    .line 29
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p0, :cond_0

    .line 31
    invoke-static {p0, p1, p2}, Ll/ᩴ֨ܿ;->֫(Ll/ᩴ֨ܿ;ILjava/lang/String;)V

    :cond_0
    return-void

    :catchall_0
    move-exception p0

    .line 29
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method


# virtual methods
.method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 4

    const-string v0, "android.content.pm.extra.SESSION_ID"

    const/4 v1, -0x1

    .line 37
    invoke-virtual {p2, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    const-string v2, "android.content.pm.extra.STATUS"

    const/16 v3, -0x3e7

    .line 38
    invoke-virtual {p2, v2, v3}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v2

    const-string v3, "android.content.pm.extra.PACKAGE_NAME"

    if-eq v2, v1, :cond_2

    if-eqz v2, :cond_1

    const/4 p1, 0x3

    if-eq v2, p1, :cond_0

    .line 55
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    const-string v2, "Installation failed"

    invoke-virtual {v1, v2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    const-string v1, "android.content.pm.extra.STATUS_MESSAGE"

    .line 56
    invoke-virtual {p2, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-static {v0, p1, p2}, Ll/᩵֨ܿ;->֫(IILjava/lang/String;)V

    return-void

    .line 51
    :cond_0
    sget-object p1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    const-string p2, "Installation canceled"

    invoke-virtual {p1, p2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    const/4 p1, 0x2

    const/4 p2, 0x0

    .line 52
    invoke-static {v0, p1, p2}, Ll/᩵֨ܿ;->֫(IILjava/lang/String;)V

    return-void

    .line 47
    :cond_1
    sget-object p1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    const-string v1, "Installation succeed"

    invoke-virtual {p1, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    const/4 p1, 0x0

    .line 48
    invoke-virtual {p2, v3}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-static {v0, p1, p2}, Ll/᩵֨ܿ;->֫(IILjava/lang/String;)V

    return-void

    .line 42
    :cond_2
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    const-string v2, "Requesting user confirmation for installation"

    invoke-virtual {v1, v2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    const/4 v1, 0x1

    .line 43
    invoke-virtual {p2, v3}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, v2}, Ll/᩵֨ܿ;->֫(IILjava/lang/String;)V

    const-string v1, "android.intent.extra.INTENT"

    .line 44
    invoke-virtual {p2, v1}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p2

    check-cast p2, Landroid/content/Intent;

    sget v1, Ll/ۘ֨ܿ;->᩶:I

    .line 56
    new-instance v1, Landroid/content/Intent;

    const-class v2, Ll/ۘ֨ܿ;

    invoke-direct {v1, p1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v2, "confirmationIntent"

    .line 57
    invoke-virtual {v1, v2, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    const-string p2, "sessionID"

    .line 58
    invoke-virtual {v1, p2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    const/high16 p2, 0x10000000

    .line 59
    invoke-virtual {v1, p2}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 60
    invoke-virtual {p1, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    return-void
.end method
