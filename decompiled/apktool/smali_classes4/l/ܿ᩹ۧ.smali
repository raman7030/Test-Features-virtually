.class public final Ll/ܿ᩹ۧ;
.super Ljava/lang/Object;
.source "U647"


# instance fields
.field public final ֫:Landroid/content/Context;

.field public ۜ:Ll/ۜ᩹ۧ;

.field public ۢ:Ljava/lang/String;

.field public ۧ:Landroid/content/SharedPreferences$Editor;

.field public ܳ:Ljava/lang/Object;

.field public ܽ:J

.field public ܿ:Ll/ۧ᩹ۧ;

.field public ᩳ:Z

.field public ᩷:Landroid/content/SharedPreferences;

.field public ᩻:Ll/ᩳ᩹ۧ;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 104
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x0

    .line 53
    iput-wide v0, p0, Ll/ܿ᩹ۧ;->ܽ:J

    .line 105
    iput-object p1, p0, Ll/ܿ᩹ۧ;->֫:Landroid/content/Context;

    .line 124
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "_preferences"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 107
    invoke-virtual {p0, p1}, Ll/ܿ᩹ۧ;->֫(Ljava/lang/String;)V

    return-void
.end method

.method public static ֫(Landroid/content/Context;)Landroid/content/SharedPreferences;
    .locals 2

    .line 124
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "_preferences"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    .line 119
    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final ֫()Landroid/content/SharedPreferences$Editor;
    .locals 1

    .line 476
    iget-boolean v0, p0, Ll/ܿ᩹ۧ;->ᩳ:Z

    if-eqz v0, :cond_1

    .line 477
    iget-object v0, p0, Ll/ܿ᩹ۧ;->ۧ:Landroid/content/SharedPreferences$Editor;

    if-nez v0, :cond_0

    .line 478
    invoke-virtual {p0}, Ll/ܿ᩹ۧ;->ܳ()Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    iput-object v0, p0, Ll/ܿ᩹ۧ;->ۧ:Landroid/content/SharedPreferences$Editor;

    .line 481
    :cond_0
    iget-object v0, p0, Ll/ܿ᩹ۧ;->ۧ:Landroid/content/SharedPreferences$Editor;

    return-object v0

    .line 483
    :cond_1
    invoke-virtual {p0}, Ll/ܿ᩹ۧ;->ܳ()Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ljava/lang/CharSequence;)Ll/֫᩸ۧ;
    .locals 1

    .line 454
    iget-object v0, p0, Ll/ܿ᩹ۧ;->ۜ:Ll/ۜ᩹ۧ;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 458
    :cond_0
    invoke-virtual {v0, p1}, Ll/ۗ᩸ۧ;->ۧ(Ljava/lang/CharSequence;)Ll/֫᩸ۧ;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Landroid/content/Context;ILl/ۜ᩹ۧ;)Ll/ۜ᩹ۧ;
    .locals 1

    const/4 v0, 0x1

    .line 504
    iput-boolean v0, p0, Ll/ܿ᩹ۧ;->ᩳ:Z

    .line 216
    new-instance v0, Ll/֫᩹ۧ;

    invoke-direct {v0, p1, p0}, Ll/֫᩹ۧ;-><init>(Landroid/content/Context;Ll/ܿ᩹ۧ;)V

    .line 217
    invoke-virtual {v0, p2, p3}, Ll/֫᩹ۧ;->֫(ILl/ۜ᩹ۧ;)Ll/ۗ᩸ۧ;

    move-result-object p1

    check-cast p1, Ll/ۜ᩹ۧ;

    .line 218
    invoke-virtual {p1, p0}, Ll/֫᩸ۧ;->֫(Ll/ܿ᩹ۧ;)V

    .line 501
    iget-object p2, p0, Ll/ܿ᩹ۧ;->ۧ:Landroid/content/SharedPreferences$Editor;

    if-eqz p2, :cond_0

    .line 502
    invoke-interface {p2}, Landroid/content/SharedPreferences$Editor;->apply()V

    :cond_0
    const/4 p2, 0x0

    .line 504
    iput-boolean p2, p0, Ll/ܿ᩹ۧ;->ᩳ:Z

    return-object p1
.end method

.method public final ֫(Ljava/lang/String;)V
    .locals 0

    .line 266
    iput-object p1, p0, Ll/ܿ᩹ۧ;->ۢ:Ljava/lang/String;

    const/4 p1, 0x0

    .line 267
    iput-object p1, p0, Ll/ܿ᩹ۧ;->᩷:Landroid/content/SharedPreferences;

    return-void
.end method

.method public final ֫(Ll/ۧܶۧ;)V
    .locals 1

    .line 543
    iget-object v0, p0, Ll/ܿ᩹ۧ;->ܿ:Ll/ۧ᩹ۧ;

    if-eqz v0, :cond_0

    .line 544
    invoke-interface {v0, p1}, Ll/ۧ᩹ۧ;->֫(Ll/ۧܶۧ;)V

    :cond_0
    return-void
.end method

.method public final ֫(Ll/ۧ᩹ۧ;)V
    .locals 0

    .line 534
    iput-object p1, p0, Ll/ܿ᩹ۧ;->ܿ:Ll/ۧ᩹ۧ;

    return-void
.end method

.method public final ֫(Ll/ܽ᩹ۧ;)V
    .locals 0

    .line 571
    iput-object p1, p0, Ll/ܿ᩹ۧ;->ܳ:Ljava/lang/Object;

    return-void
.end method

.method public final ֫(Ll/ᩳ᩹ۧ;)V
    .locals 0

    .line 556
    iput-object p1, p0, Ll/ܿ᩹ۧ;->᩻:Ll/ᩳ᩹ۧ;

    return-void
.end method

.method public final ֫(Ll/ۜ᩹ۧ;)Z
    .locals 1

    .line 432
    iget-object v0, p0, Ll/ܿ᩹ۧ;->ۜ:Ll/ۜ᩹ۧ;

    if-eq p1, v0, :cond_1

    if-eqz v0, :cond_0

    .line 434
    invoke-virtual {v0}, Ll/ۗ᩸ۧ;->ۨ()V

    .line 436
    :cond_0
    iput-object p1, p0, Ll/ܿ᩹ۧ;->ۜ:Ll/ۜ᩹ۧ;

    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public final ۧ()J
    .locals 5

    move-object v0, p0

    .line 239
    monitor-enter v0

    .line 240
    :try_start_0
    iget-wide v1, p0, Ll/ܿ᩹ۧ;->ܽ:J

    const-wide/16 v3, 0x1

    add-long/2addr v3, v1

    iput-wide v3, p0, Ll/ܿ᩹ۧ;->ܽ:J

    monitor-exit v0

    return-wide v1

    :catchall_0
    move-exception v1

    .line 241
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final ܳ()Landroid/content/SharedPreferences;
    .locals 3

    .line 398
    iget-object v0, p0, Ll/ܿ᩹ۧ;->᩷:Landroid/content/SharedPreferences;

    if-nez v0, :cond_0

    .line 409
    iget-object v0, p0, Ll/ܿ᩹ۧ;->ۢ:Ljava/lang/String;

    const/4 v1, 0x0

    iget-object v2, p0, Ll/ܿ᩹ۧ;->֫:Landroid/content/Context;

    invoke-virtual {v2, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    iput-object v0, p0, Ll/ܿ᩹ۧ;->᩷:Landroid/content/SharedPreferences;

    .line 413
    :cond_0
    iget-object v0, p0, Ll/ܿ᩹ۧ;->᩷:Landroid/content/SharedPreferences;

    return-object v0
.end method

.method public final ܽ()Ll/ܽ᩹ۧ;
    .locals 1

    .line 579
    iget-object v0, p0, Ll/ܿ᩹ۧ;->ܳ:Ljava/lang/Object;

    return-object v0
.end method

.method public final ܿ()Ll/ۜ᩹ۧ;
    .locals 1

    .line 422
    iget-object v0, p0, Ll/ܿ᩹ۧ;->ۜ:Ll/ۜ᩹ۧ;

    return-object v0
.end method

.method public final ᩳ()Ll/ᩳ᩹ۧ;
    .locals 1

    .line 561
    iget-object v0, p0, Ll/ܿ᩹ۧ;->᩻:Ll/ᩳ᩹ۧ;

    return-object v0
.end method

.method public final ᩻()Z
    .locals 1

    .line 497
    iget-boolean v0, p0, Ll/ܿ᩹ۧ;->ᩳ:Z

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method
