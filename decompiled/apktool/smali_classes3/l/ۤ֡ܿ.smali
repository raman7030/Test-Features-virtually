.class public final Ll/ۤ֡ܿ;
.super Ljava/lang/Object;
.source "412K"


# instance fields
.field public ֫:Ll/ܶ᩵ܿ;

.field public ۧ:Z

.field public ܽ:Ll/ܶ᩵ܿ;


# direct methods
.method public constructor <init>(Ll/ܶ᩵ܿ;)V
    .locals 4

    .line 15
    sget-object v0, Ll/ۙ᩸᩷;->ܳ:Landroid/content/SharedPreferences;

    const-string v1, "generate_backup_file"

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    iput-object p1, p0, Ll/ۤ֡ܿ;->֫:Ll/ܶ᩵ܿ;

    .line 20
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->֫֫()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v1

    if-eqz v0, :cond_1

    const-string v3, "/dev/"

    .line 23
    invoke-virtual {v1, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_0

    const-string v3, "/proc/"

    invoke-virtual {v1, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->getParent()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_1

    :cond_0
    const/4 v0, 0x0

    :cond_1
    if-eqz v0, :cond_5

    .line 28
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->֡֫()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->ܿ֫()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_5

    .line 29
    iput-boolean v2, p0, Ll/ۤ֡ܿ;->ۧ:Z

    const-string v0, ".tmp"

    .line 899
    invoke-virtual {p1, v0}, Ll/ܶ᩵ܿ;->ܳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v0

    .line 33
    :try_start_0
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->᩶֫()Z

    move-result v1

    if-eqz v1, :cond_2

    instance-of v1, p1, Ll/ۨᩴܿ;

    if-eqz v1, :cond_3

    .line 34
    :cond_2
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->ۗ֫()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->ۢ()Ll/ۧ᩹ܿ;

    move-result-object p1

    invoke-virtual {p1}, Ll/ۧ᩹ܿ;->֫ܽ()Z

    move-result p1

    if-eqz p1, :cond_4

    .line 35
    :cond_3
    iput-object v0, p0, Ll/ۤ֡ܿ;->ܽ:Ll/ܶ᩵ܿ;

    return-void

    .line 36
    :cond_4
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ۗ()Z

    move-result p1

    if-eqz p1, :cond_5

    .line 37
    iput-object v0, p0, Ll/ۤ֡ܿ;->ܽ:Ll/ܶ᩵ܿ;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_5
    return-void
.end method


# virtual methods
.method public final ֫(Ll/ۗ֡ܿ;)V
    .locals 4

    const/4 v0, 0x0

    .line 66
    iget-object v1, p0, Ll/ۤ֡ܿ;->֫:Ll/ܶ᩵ܿ;

    iget-object v2, p0, Ll/ۤ֡ܿ;->ܽ:Ll/ܶ᩵ܿ;

    if-nez v2, :cond_8

    .line 68
    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->ۗ֫()Z

    move-result v2

    if-nez v2, :cond_7

    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->֡֫()Z

    move-result v2

    if-eqz v2, :cond_7

    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->ܿ֫()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_0

    goto :goto_1

    .line 99
    :cond_0
    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->֨֫()Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_0

    :cond_1
    const-string v2, ".rollback"

    .line 101
    invoke-virtual {v1, v2}, Ll/ܶ᩵ܿ;->ܳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v2

    .line 102
    invoke-virtual {v1, v2}, Ll/ܶ᩵ܿ;->ۧ(Ll/ܶ᩵ܿ;)Z

    move-result v3

    if-nez v3, :cond_2

    goto :goto_0

    :cond_2
    move-object v0, v2

    .line 73
    :cond_3
    :goto_0
    :try_start_0
    invoke-interface {p1, v1}, Ll/۫֡ܿ;->֫(Ll/ܶ᩵ܿ;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_4

    .line 126
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->۬()Z

    :cond_4
    return-void

    :catchall_0
    move-exception p1

    if-eqz v0, :cond_6

    .line 112
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v2

    if-eqz v2, :cond_6

    .line 115
    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v2

    if-eqz v2, :cond_5

    .line 116
    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->۬()Z

    .line 118
    :cond_5
    invoke-virtual {v0, v1}, Ll/ܶ᩵ܿ;->ۧ(Ll/ܶ᩵ܿ;)Z

    .line 76
    :cond_6
    throw p1

    .line 69
    :cond_7
    :goto_1
    invoke-interface {p1, v1}, Ll/۫֡ܿ;->֫(Ll/ܶ᩵ܿ;)V

    return-void

    .line 84
    :cond_8
    :try_start_1
    invoke-interface {p1, v2}, Ll/۫֡ܿ;->֫(Ll/ܶ᩵ܿ;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 131
    iget-boolean p1, p0, Ll/ۤ֡ܿ;->ۧ:Z

    if-eqz p1, :cond_9

    .line 132
    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->᩶()V

    goto :goto_2

    .line 134
    :cond_9
    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->۬()Z

    .line 991
    :goto_2
    invoke-virtual {v2, v1, v0}, Ll/ܶ᩵ܿ;->֫(Ll/ܶ᩵ܿ;Ljava/lang/Runnable;)V

    .line 137
    invoke-static {v1}, Ll/ܿ֡ܿ;->֫(Ll/ܶ᩵ܿ;)V

    return-void

    :catchall_1
    move-exception p1

    .line 141
    invoke-virtual {v2}, Ll/ܶ᩵ܿ;->۬()Z

    .line 91
    throw p1
.end method
