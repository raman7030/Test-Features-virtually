.class public final Ll/۟ۚ᩵;
.super Ll/ۤۚ᩵;
.source "4A2K"


# instance fields
.field public ֫֫:Ll/᩺ۚ᩵;


# direct methods
.method public constructor <init>(Ll/᩺ۚ᩵;Ll/ۘ֨᩵;)V
    .locals 1

    .line 45
    invoke-virtual {p1}, Ll/᩺ۚ᩵;->᩻()Ll/ۨۚ᩵;

    move-result-object v0

    invoke-direct {p0, v0, p2}, Ll/ۤۚ᩵;-><init>(Ll/ۨۚ᩵;Ll/ۘ֨᩵;)V

    .line 46
    iput-object p1, p0, Ll/۟ۚ᩵;->֫֫:Ll/᩺ۚ᩵;

    return-void
.end method


# virtual methods
.method public final available()I
    .locals 8

    .line 70
    iget-object v0, p0, Ll/۟ۚ᩵;->֫֫:Ll/᩺ۚ᩵;

    :try_start_0
    invoke-virtual {v0}, Ll/᩺ۚ᩵;->֫()Ll/۫ۚ᩵;

    move-result-object v1
    :try_end_0
    .catch Ll/ۗۚ᩵; {:try_start_0 .. :try_end_0} :catch_0

    .line 71
    :try_start_1
    invoke-virtual {v1}, Ll/۫ۚ᩵;->᩻()Ll/ۘ֨᩵;

    move-result-object v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 72
    :try_start_2
    invoke-virtual {v2}, Ll/ۘ֨᩵;->᩸()Z

    move-result v3

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-eqz v3, :cond_0

    .line 73
    new-instance v0, Ll/ۖ᩵᩵;

    invoke-virtual {v2}, Ll/ۘ֨᩵;->ܳ()Ll/֨ۡ᩵;

    move-result-object v3

    invoke-virtual {v1}, Ll/۫ۚ᩵;->ܳ()[B

    move-result-object v6

    const v7, 0x11400c

    invoke-direct {v0, v7, v3, v6}, Ll/ۖ᩵᩵;-><init>(ILl/֨ۡ᩵;[B)V

    const/16 v3, 0x10

    .line 74
    invoke-virtual {v0, v3}, Ll/ۖ᩵᩵;->ܺ(I)V

    .line 75
    invoke-virtual {v0}, Ll/ۖ᩵᩵;->ۘ֫()V

    new-array v3, v5, [Ll/֡ۚ᩵;

    .line 76
    sget-object v5, Ll/֡ۚ᩵;->᩶:Ll/֡ۚ᩵;

    aput-object v5, v3, v4

    const/4 v4, 0x0

    .line 115
    invoke-virtual {v2, v0, v4, v3}, Ll/ۘ֨᩵;->֫(Ll/۟ܺ᩵;Ll/֫ۖ᩵;[Ll/֡ۚ᩵;)Ll/֫ۖ᩵;

    move-result-object v0

    .line 76
    check-cast v0, Ll/ۘ᩵᩵;

    .line 77
    invoke-virtual {v0}, Ll/ۘ᩵᩵;->֡֫()Ll/۠ۡ᩵;

    move-result-object v0

    check-cast v0, Ll/᩵᩵᩵;

    invoke-virtual {v0}, Ll/᩵᩵᩵;->ܽ()I

    move-result v0

    goto :goto_0

    .line 79
    :cond_0
    new-instance v3, Ll/ۜᩴ᩵;

    invoke-virtual {v2}, Ll/ۘ֨᩵;->ܳ()Ll/֨ۡ᩵;

    move-result-object v6

    invoke-virtual {v0}, Ll/᩺ۚ᩵;->ۜ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1}, Ll/۫ۚ᩵;->ᩳ()I

    move-result v7

    invoke-direct {v3, v6, v0, v7}, Ll/ۜᩴ᩵;-><init>(Ll/֨ۡ᩵;Ljava/lang/String;I)V

    .line 80
    new-instance v0, Ll/᩷ᩴ᩵;

    invoke-virtual {v2}, Ll/ۘ֨᩵;->ܳ()Ll/֨ۡ᩵;

    move-result-object v6

    invoke-direct {v0, v6}, Ll/᩷ᩴ᩵;-><init>(Ll/֨ۡ᩵;)V

    new-array v6, v5, [Ll/֡ۚ᩵;

    .line 81
    sget-object v7, Ll/֡ۚ᩵;->᩶:Ll/֡ۚ᩵;

    aput-object v7, v6, v4

    invoke-virtual {v2, v3, v0, v6}, Ll/ۘ֨᩵;->֫(Ll/۟ܺ᩵;Ll/֫ۖ᩵;[Ll/֡ۚ᩵;)Ll/֫ۖ᩵;

    .line 82
    invoke-virtual {v0}, Ll/ܿᩴ᩵;->ۘ֫()I

    move-result v3

    if-eq v3, v5, :cond_2

    .line 83
    invoke-virtual {v0}, Ll/ܿᩴ᩵;->ۘ֫()I

    move-result v3

    const/4 v5, 0x4

    if-ne v3, v5, :cond_1

    goto :goto_1

    .line 87
    :cond_1
    invoke-virtual {v0}, Ll/᩷ᩴ᩵;->֡֫()I

    move-result v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 88
    :goto_0
    :try_start_3
    invoke-virtual {v2}, Ll/ۘ֨᩵;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 227
    :try_start_4
    invoke-virtual {v1}, Ll/۫ۚ᩵;->ۘ()V
    :try_end_4
    .catch Ll/ۗۚ᩵; {:try_start_4 .. :try_end_4} :catch_0

    return v0

    .line 84
    :cond_2
    :goto_1
    :try_start_5
    invoke-virtual {v1}, Ll/۫ۚ᩵;->ۖ()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 88
    :try_start_6
    invoke-virtual {v2}, Ll/ۘ֨᩵;->close()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 227
    :try_start_7
    invoke-virtual {v1}, Ll/۫ۚ᩵;->ۘ()V
    :try_end_7
    .catch Ll/ۗۚ᩵; {:try_start_7 .. :try_end_7} :catch_0

    return v4

    :catchall_0
    move-exception v0

    .line 70
    :try_start_8
    invoke-virtual {v2}, Ll/ۘ֨᩵;->close()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception v2

    :try_start_9
    invoke-virtual {v0, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    :catchall_2
    move-exception v0

    .line 227
    :try_start_a
    invoke-virtual {v1}, Ll/۫ۚ᩵;->ۘ()V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_3

    goto :goto_3

    :catchall_3
    move-exception v1

    .line 70
    :try_start_b
    invoke-virtual {v0, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_3
    throw v0
    :try_end_b
    .catch Ll/ۗۚ᩵; {:try_start_b .. :try_end_b} :catch_0

    :catch_0
    move-exception v0

    .line 89
    invoke-static {v0}, Ll/ۤۚ᩵;->֫(Ll/ۗۚ᩵;)Ljava/io/IOException;

    move-result-object v0

    throw v0
.end method

.method public final close()V
    .locals 0

    return-void
.end method

.method public final declared-synchronized ֫()Ll/۫ۚ᩵;
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 57
    :try_start_0
    iget-object v1, p0, Ll/۟ۚ᩵;->֫֫:Ll/᩺ۚ᩵;

    invoke-virtual {v1}, Ll/᩺ۚ᩵;->֫()Ll/۫ۚ᩵;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method
