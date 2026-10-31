.class public final synthetic Ll/᩵ܶܿ;
.super Ljava/lang/Object;
.source "89SC"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic ֫:Ll/ۡܶܿ;

.field public final synthetic ۧ:Ljava/lang/String;

.field public final synthetic ܽ:Landroid/content/pm/PackageManager;


# direct methods
.method public synthetic constructor <init>(Ll/ۡܶܿ;Ljava/lang/String;Landroid/content/pm/PackageManager;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩵ܶܿ;->֫:Ll/ۡܶܿ;

    iput-object p2, p0, Ll/᩵ܶܿ;->ۧ:Ljava/lang/String;

    iput-object p3, p0, Ll/᩵ܶܿ;->ܽ:Landroid/content/pm/PackageManager;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 4

    .line 0
    iget-object v0, p0, Ll/᩵ܶܿ;->֫:Ll/ۡܶܿ;

    instance-of v0, v0, Ll/۬ܶܿ;

    .line 83
    iget-object v1, p0, Ll/᩵ܶܿ;->ۧ:Ljava/lang/String;

    const/high16 v2, 0x10000000

    if-eqz v0, :cond_0

    .line 84
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    const-string v3, "bin.mt.file.content.MTDataFilesWakeUpActivity"

    .line 85
    invoke-virtual {v0, v1, v3}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 86
    invoke-virtual {v0, v2}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 88
    :try_start_0
    invoke-static {}, Ll/ۙ᩸᩷;->ܿ()Landroid/app/Application;

    move-result-object v3

    invoke-virtual {v3, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    nop

    .line 94
    :cond_0
    iget-object v0, p0, Ll/᩵ܶܿ;->ܽ:Landroid/content/pm/PackageManager;

    invoke-virtual {v0, v1}, Landroid/content/pm/PackageManager;->getLaunchIntentForPackage(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 96
    invoke-virtual {v0, v2}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 97
    invoke-static {}, Ll/ۙ᩸᩷;->ܿ()Landroid/app/Application;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    :cond_1
    :goto_0
    const/4 v0, 0x0

    return-object v0
.end method
