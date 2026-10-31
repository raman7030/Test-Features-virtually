.class public Ll/ۢ᩶ۜ;
.super Ll/ۗܺ᩷;
.source "J8V2"


# instance fields
.field public ᩳۧ:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 23
    invoke-direct {p0}, Ll/ۗܺ᩷;-><init>()V

    return-void
.end method


# virtual methods
.method public final onCreate(Landroid/os/Bundle;)V
    .locals 4

    .line 32
    invoke-super {p0, p1}, Ll/ۗܺ᩷;->onCreate(Landroid/os/Bundle;)V

    .line 33
    invoke-virtual {p0}, Ll/ۗܺ᩷;->۬()V

    .line 34
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v0, "fromService"

    const/4 v1, 0x0

    .line 35
    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Ll/ۢ᩶ۜ;->ᩳۧ:Z

    if-eqz v0, :cond_6

    .line 37
    invoke-static {}, Ll/᩷᩶ۜ;->ܿ()Ll/ۜ᩶ۜ;

    move-result-object p1

    if-eqz p1, :cond_5

    .line 990
    iget-object p1, p1, Ll/ۜ᩶ۜ;->᩷:Ll/ۚ᩶ۜ;

    invoke-interface {p1}, Ll/ۚ᩶ۜ;->᩻()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_2

    .line 42
    :cond_0
    invoke-static {}, Ll/ܶ᩹᩷;->֫()Lbin/mt/plus/Main;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 43
    invoke-virtual {p1}, Ll/᩻ܽ;->getLifecycle()Ll/۟ۢ֫;

    move-result-object p1

    invoke-virtual {p1}, Ll/۟ۢ֫;->֫()Ll/ܰۢ֫;

    move-result-object p1

    sget-object v0, Ll/ܰۢ֫;->۬:Ll/ܰۢ֫;

    invoke-virtual {p1, v0}, Ll/ܰۢ֫;->֫(Ll/ܰۢ֫;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 44
    invoke-static {}, Ll/᩷᩶ۜ;->ܳ()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 45
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void

    .line 49
    :cond_1
    invoke-static {}, Ll/᩷᩶ۜ;->ܳ()Z

    move-result p1

    if-eqz p1, :cond_4

    .line 108
    sget-object p1, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v0, "mbp"

    invoke-interface {p1, v0, v1}, Ll/۫ۤۡ;->getBoolean(Ljava/lang/String;Z)Z

    move-result p1

    if-nez p1, :cond_4

    .line 97
    invoke-static {}, Ll/᩷᩶ۜ;->ܳ()Z

    move-result p1

    if-nez p1, :cond_2

    goto :goto_1

    :cond_2
    const-string p1, "activity"

    .line 100
    invoke-virtual {p0, p1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/app/ActivityManager;

    .line 101
    invoke-virtual {p1}, Landroid/app/ActivityManager;->getAppTasks()Ljava/util/List;

    move-result-object p1

    .line 102
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_4

    .line 103
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    :goto_0
    if-ge v1, v0, :cond_4

    .line 104
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/app/ActivityManager$AppTask;

    .line 105
    invoke-static {v2}, Ll/۫ۚ᩷;->֫(Landroid/app/ActivityManager$AppTask;)Z

    move-result v3

    if-eqz v3, :cond_3

    .line 106
    invoke-virtual {v2}, Landroid/app/ActivityManager$AppTask;->moveToFront()V

    .line 51
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void

    :cond_3
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 55
    :cond_4
    :goto_1
    new-instance p1, Ll/᩷᩶ۜ;

    invoke-direct {p1, p0}, Ll/᩷᩶ۜ;-><init>(Ll/ۗܺ᩷;)V

    return-void

    .line 39
    :cond_5
    :goto_2
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void

    :cond_6
    const-string v0, "bin.mt.plus.ACTION_SHORTCUT"

    .line 56
    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    const-string v0, "operation"

    .line 58
    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "tool-music-player"

    .line 57
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_7

    .line 59
    invoke-static {p0}, Ll/᩷᩶ۜ;->ۧ(Ll/ۗܺ᩷;)V

    return-void

    :cond_7
    const-string p1, "audio/"

    .line 61
    invoke-static {p0, p1}, Ll/ۖܶۜ;->֫(Ll/ۗܺ᩷;Ljava/lang/String;)Ll/ۖܶۜ;

    move-result-object p1

    if-nez p1, :cond_8

    .line 63
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void

    .line 66
    :cond_8
    new-instance v0, Ll/᩷᩶ۜ;

    invoke-direct {v0, p0}, Ll/᩷᩶ۜ;-><init>(Ll/ۗܺ᩷;)V

    .line 504
    invoke-virtual {p1}, Ll/ۖܶۜ;->ᩳ()Ll/ܰܺܳ;

    move-result-object v1

    invoke-virtual {p1}, Ll/ۖܶۜ;->ܽ()Ljava/util/List;

    move-result-object v2

    invoke-virtual {p1}, Ll/ۖܶۜ;->֫()I

    move-result p1

    invoke-static {v1, v2, p1}, Ll/᩷᩶ۜ;->֫(Ll/ܰܺܳ;Ljava/util/List;I)V

    .line 68
    invoke-virtual {v0}, Ll/᩷᩶ۜ;->֫()V

    return-void
.end method

.method public final onStop()V
    .locals 1

    .line 86
    invoke-super {p0}, Ll/ۗܺ᩷;->onStop()V

    .line 87
    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 88
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    :cond_0
    return-void
.end method

.method public final ۙ()V
    .locals 1

    .line 78
    invoke-static {}, Ll/ܰۛۡ;->֫()V

    .line 79
    invoke-static {}, Ll/۬ۖ;->֫()V

    .line 80
    invoke-static {p0}, Ll/ܰ᩸᩷;->֫(Ll/ۗܺ᩷;)V

    .line 81
    invoke-static {}, Ll/᩹֡᩷;->ۧ()Z

    move-result v0

    iput-boolean v0, p0, Ll/ۗܺ᩷;->۠֫:Z

    return-void
.end method

.method public final ۚ()Ljava/lang/String;
    .locals 1

    const-string v0, "MusicPlayerActivity"

    return-object v0
.end method

.method public final ۨ()Z
    .locals 1

    .line 93
    iget-boolean v0, p0, Ll/ۢ᩶ۜ;->ᩳۧ:Z

    return v0
.end method
