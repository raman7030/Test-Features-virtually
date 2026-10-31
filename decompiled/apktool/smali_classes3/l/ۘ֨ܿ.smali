.class public Ll/ۘ֨ܿ;
.super Ll/۟᩸᩷;
.source "KAQG"


# static fields
.field public static final synthetic ᩶:I


# instance fields
.field public ᩸:Z

.field public ᩹:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 11
    invoke-direct {p0}, Ll/۟᩸᩷;-><init>()V

    const/4 v0, 0x0

    .line 14
    iput-boolean v0, p0, Ll/ۘ֨ܿ;->᩸:Z

    const/4 v0, -0x1

    .line 15
    iput v0, p0, Ll/ۘ֨ܿ;->᩹:I

    return-void
.end method


# virtual methods
.method public final onActivityResult(IILandroid/content/Intent;)V
    .locals 3

    .line 34
    invoke-super {p0, p1, p2, p3}, Landroid/app/Activity;->onActivityResult(IILandroid/content/Intent;)V

    .line 35
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    const-string v1, "onActivityResult "

    const-string v2, " "

    .line 0
    invoke-static {v1, p1, v2, v2, p2}, Ll/᩶ᩴᩳ;->֫(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)Ljava/lang/StringBuilder;

    move-result-object p2

    .line 35
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    const/16 p2, 0x142

    if-ne p1, p2, :cond_0

    const/4 p1, 0x1

    .line 37
    iput-boolean p1, p0, Ll/ۘ֨ܿ;->᩸:Z

    .line 42
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    :cond_0
    return-void
.end method

.method public final onCreate(Landroid/os/Bundle;)V
    .locals 2

    .line 19
    invoke-super {p0, p1}, Ll/۟᩸᩷;->onCreate(Landroid/os/Bundle;)V

    .line 20
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v0, "sessionID"

    const/4 v1, -0x1

    .line 21
    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Ll/ۘ֨ܿ;->᩹:I

    const-string v0, "confirmationIntent"

    .line 22
    invoke-virtual {p1, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Landroid/content/Intent;

    const/16 v0, 0x142

    .line 24
    :try_start_0
    invoke-virtual {p0, p1, v0}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 27
    iget v0, p0, Ll/ۘ֨ܿ;->᩹:I

    const/4 v1, 0x3

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, v1, p1}, Ll/᩵֨ܿ;->֫(IILjava/lang/String;)V

    .line 28
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method public final onDestroy()V
    .locals 3

    .line 48
    invoke-super {p0}, Landroid/app/Activity;->onDestroy()V

    .line 49
    iget-boolean v0, p0, Ll/ۘ֨ܿ;->᩸:Z

    if-nez v0, :cond_0

    .line 50
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    const-string v1, "Installation canceled"

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 51
    iget v0, p0, Ll/ۘ֨ܿ;->᩹:I

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Ll/᩵֨ܿ;->֫(IILjava/lang/String;)V

    :cond_0
    return-void
.end method
