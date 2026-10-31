.class public final Ll/֫ۗᩳ;
.super Ljava/lang/Object;
.source "C6RP"

# interfaces
.implements Ljava/lang/AutoCloseable;


# instance fields
.field public final ᩶:Ll/᩸۬ᩳ;

.field public ᩸:Z

.field public final ᩹:Ll/ۚ᩹ᩳ;


# direct methods
.method public constructor <init>(Ll/᩸۬ᩳ;Ll/᩸۬ᩳ;)V
    .locals 1

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    iput-object p1, p0, Ll/֫ۗᩳ;->᩶:Ll/᩸۬ᩳ;

    .line 22
    new-instance v0, Ll/ۚ᩹ᩳ;

    invoke-direct {v0, p1, p2}, Ll/ۚ᩹ᩳ;-><init>(Ll/᩸۬ᩳ;Ll/᩸۬ᩳ;)V

    iput-object v0, p0, Ll/֫ۗᩳ;->᩹:Ll/ۚ᩹ᩳ;

    return-void
.end method

.method public constructor <init>(Ll/᩸۬ᩳ;Ll/᩸۬ᩳ;I)V
    .locals 0

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    iput-object p1, p0, Ll/֫ۗᩳ;->᩶:Ll/᩸۬ᩳ;

    .line 28
    invoke-static {p1, p2}, Ll/ۚ᩹ᩳ;->֫(Ll/᩸۬ᩳ;Ll/᩸۬ᩳ;)Ll/ۚ᩹ᩳ;

    move-result-object p1

    iput-object p1, p0, Ll/֫ۗᩳ;->᩹:Ll/ۚ᩹ᩳ;

    return-void
.end method

.method private ֫(Ll/ۖۙᩳ;)Ll/ۖۙᩳ;
    .locals 13

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 53
    :cond_0
    iget-object v0, p0, Ll/֫ۗᩳ;->᩹:Ll/ۚ᩹ᩳ;

    invoke-virtual {v0, p1}, Ll/ۚ᩹ᩳ;->֫(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۖۙᩳ;

    if-eqz v1, :cond_1

    return-object v1

    .line 95
    :cond_1
    invoke-virtual {v0}, Ll/ۚ᩹ᩳ;->֫()V

    .line 56
    iget-object v1, p1, Ll/ۖۙᩳ;->ۧ:Ll/ۢ۬ᩳ;

    .line 57
    new-instance v8, Ll/ۢ۬ᩳ;

    new-instance v3, Ll/ܺۙᩳ;

    iget-object v2, v1, Ll/ۢ۬ᩳ;->ᩳ:Ll/ܺۙᩳ;

    iget-object v2, v2, Ll/ܺۙᩳ;->᩸:Ll/ۢۙᩳ;

    const/4 v4, 0x1

    invoke-direct {p0, v2, v4}, Ll/֫ۗᩳ;->֫(Ll/ۢۙᩳ;Z)Ll/ۢۙᩳ;

    move-result-object v2

    invoke-direct {v3, v2}, Ll/ܺۙᩳ;-><init>(Ll/ۢۙᩳ;)V

    new-instance v5, Ll/ܺۙᩳ;

    iget-object v2, v1, Ll/ۢ۬ᩳ;->ܽ:Ll/ܺۙᩳ;

    iget-object v2, v2, Ll/ܺۙᩳ;->᩸:Ll/ۢۙᩳ;

    .line 58
    invoke-direct {p0, v2, v4}, Ll/֫ۗᩳ;->֫(Ll/ۢۙᩳ;Z)Ll/ۢۙᩳ;

    move-result-object v2

    invoke-direct {v5, v2}, Ll/ܺۙᩳ;-><init>(Ll/ۢۙᩳ;)V

    iget-wide v6, v1, Ll/ۢ۬ᩳ;->ۧ:J

    iget-boolean v1, v1, Ll/ۢ۬ᩳ;->֫:Z

    move-object v2, v8

    move-object v4, v5

    move-wide v5, v6

    move v7, v1

    invoke-direct/range {v2 .. v7}, Ll/ۢ۬ᩳ;-><init>(Ll/ܺۙᩳ;Ll/ܺۙᩳ;JZ)V

    .line 59
    new-instance v1, Ll/ۖۙᩳ;

    iget-object v4, p1, Ll/ۖۙᩳ;->ܿ:Ll/ۚۗᩳ;

    iget-wide v5, p1, Ll/ۖۙᩳ;->֫:J

    iget-wide v9, p1, Ll/ۖۙᩳ;->ᩳ:J

    iget-wide v11, p1, Ll/ۖۙᩳ;->ܽ:J

    move-object v2, v1

    move-object v3, v8

    move-wide v7, v9

    move-wide v9, v11

    invoke-direct/range {v2 .. v10}, Ll/ۖۙᩳ;-><init>(Ll/ۢ۬ᩳ;Ll/ۚۗᩳ;JJJ)V

    .line 60
    invoke-virtual {v0, p1, v1}, Ll/ۚ᩹ᩳ;->֫(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v1
.end method

.method private ֫(Ll/ۢۙᩳ;Z)Ll/ۢۙᩳ;
    .locals 12

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 67
    :cond_0
    iget-object v0, p0, Ll/֫ۗᩳ;->᩹:Ll/ۚ᩹ᩳ;

    invoke-virtual {v0, p1}, Ll/ۚ᩹ᩳ;->֫(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۢۙᩳ;

    if-eqz v1, :cond_1

    return-object v1

    .line 95
    :cond_1
    invoke-virtual {v0}, Ll/ۚ᩹ᩳ;->֫()V

    .line 70
    iget-object v1, p1, Ll/ۢۙᩳ;->ۧ:Ljava/lang/Object;

    if-nez v1, :cond_2

    .line 71
    new-instance v1, Ll/ۢۙᩳ;

    iget-object v2, p1, Ll/ۢۙᩳ;->ܽ:Ll/ۢۙᩳ;

    invoke-direct {p0, v2, p2}, Ll/֫ۗᩳ;->֫(Ll/ۢۙᩳ;Z)Ll/ۢۙᩳ;

    move-result-object v2

    iget-object v3, p1, Ll/ۢۙᩳ;->ܳ:Ll/ۢۙᩳ;

    invoke-direct {p0, v3, p2}, Ll/֫ۗᩳ;->֫(Ll/ۢۙᩳ;Z)Ll/ۢۙᩳ;

    move-result-object p2

    invoke-direct {v1, v2, p2}, Ll/ۢۙᩳ;-><init>(Ll/ۢۙᩳ;Ll/ۢۙᩳ;)V

    goto :goto_1

    .line 72
    :cond_2
    new-instance v2, Ll/ۢۙᩳ;

    if-eqz p2, :cond_4

    check-cast v1, Ll/ۡ۬ᩳ;

    .line 78
    invoke-virtual {v0, v1}, Ll/ۚ᩹ᩳ;->֫(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/ۡ۬ᩳ;

    if-eqz p2, :cond_3

    goto :goto_0

    .line 95
    :cond_3
    invoke-virtual {v0}, Ll/ۚ᩹ᩳ;->֫()V

    .line 81
    new-instance p2, Ll/ۡ۬ᩳ;

    iget-wide v4, v1, Ll/ۡ۬ᩳ;->ۧ:J

    iget-wide v6, v1, Ll/ۡ۬ᩳ;->ܳ:J

    iget-object v8, v1, Ll/ۡ۬ᩳ;->ܽ:Ll/ܰ᩶ᩳ;

    new-instance v9, Ll/ܺۙᩳ;

    iget-object v3, v1, Ll/ۡ۬ᩳ;->֫:Ll/ܺۙᩳ;

    iget-object v3, v3, Ll/ܺۙᩳ;->᩸:Ll/ۢۙᩳ;

    const/4 v10, 0x0

    invoke-direct {p0, v3, v10}, Ll/֫ۗᩳ;->֫(Ll/ۢۙᩳ;Z)Ll/ۢۙᩳ;

    move-result-object v3

    invoke-direct {v9, v3}, Ll/ܺۙᩳ;-><init>(Ll/ۢۙᩳ;)V

    move-object v3, p2

    invoke-direct/range {v3 .. v9}, Ll/ۡ۬ᩳ;-><init>(JJLl/ܰ᩶ᩳ;Ll/ܺۙᩳ;)V

    .line 82
    invoke-virtual {v0, v1, p2}, Ll/ۚ᩹ᩳ;->֫(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_0

    .line 72
    :cond_4
    check-cast v1, Ll/᩺᩶ᩳ;

    .line 87
    invoke-virtual {v0, v1}, Ll/ۚ᩹ᩳ;->֫(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/᩺᩶ᩳ;

    if-eqz p2, :cond_5

    goto :goto_0

    .line 95
    :cond_5
    invoke-virtual {v0}, Ll/ۚ᩹ᩳ;->֫()V

    .line 90
    new-instance p2, Ll/᩺᩶ᩳ;

    iget v4, v1, Ll/᩺᩶ᩳ;->ۜ:I

    iget-wide v5, v1, Ll/᩺᩶ᩳ;->ܽ:J

    iget-wide v7, v1, Ll/᩺᩶ᩳ;->ۧ:J

    iget-object v9, v1, Ll/᩺᩶ᩳ;->᩻:Ll/ۚۗᩳ;

    iget-object v3, v1, Ll/᩺᩶ᩳ;->ܳ:Ll/ۨ᩹ᩳ;

    .line 49
    invoke-virtual {v0, v3}, Ll/ۚ᩹ᩳ;->֫(Ll/ۨ᩹ᩳ;)Ll/ۨ᩹ᩳ;

    move-result-object v10

    .line 90
    iget-object v3, v1, Ll/᩺᩶ᩳ;->֫:Ll/ۨ᩹ᩳ;

    .line 49
    invoke-virtual {v0, v3}, Ll/ۚ᩹ᩳ;->֫(Ll/ۨ᩹ᩳ;)Ll/ۨ᩹ᩳ;

    move-result-object v11

    move-object v3, p2

    .line 90
    invoke-direct/range {v3 .. v11}, Ll/᩺᩶ᩳ;-><init>(IJJLl/ۚۗᩳ;Ll/ۨ᩹ᩳ;Ll/ۨ᩹ᩳ;)V

    .line 91
    invoke-virtual {v0, v1, p2}, Ll/ۚ᩹ᩳ;->֫(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 72
    :goto_0
    invoke-direct {v2, p2}, Ll/ۢۙᩳ;-><init>(Ljava/lang/Object;)V

    move-object v1, v2

    .line 73
    :goto_1
    invoke-virtual {v0, p1, v1}, Ll/ۚ᩹ᩳ;->֫(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v1
.end method


# virtual methods
.method public final close()V
    .locals 1

    .line 99
    iget-boolean v0, p0, Ll/֫ۗᩳ;->᩸:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    .line 100
    iput-boolean v0, p0, Ll/֫ۗᩳ;->᩸:Z

    .line 101
    iget-object v0, p0, Ll/֫ۗᩳ;->᩹:Ll/ۚ᩹ᩳ;

    invoke-virtual {v0}, Ll/ۚ᩹ᩳ;->close()V

    return-void
.end method

.method public final ֫(Ll/ܶۙᩳ;)Ll/ܶۙᩳ;
    .locals 10

    .line 33
    iget-boolean v0, p0, Ll/֫ۗᩳ;->᩸:Z

    if-nez v0, :cond_1

    .line 34
    iget-object v0, p1, Ll/ܶۙᩳ;->ۗ:Ll/۫᩹ᩳ;

    invoke-virtual {v0}, Ll/۬᩹ᩳ;->ܳ()Ll/ۨ᩹ᩳ;

    move-result-object v1

    iget-object v1, v1, Ll/ۨ᩹ᩳ;->ᩳ:Ll/᩸۬ᩳ;

    iget-object v2, p0, Ll/֫ۗᩳ;->᩶:Ll/᩸۬ᩳ;

    if-ne v1, v2, :cond_0

    .line 36
    :try_start_0
    invoke-virtual {v0}, Ll/۬᩹ᩳ;->ܳ()Ll/ۨ᩹ᩳ;

    move-result-object v1

    .line 49
    iget-object v2, p0, Ll/֫ۗᩳ;->᩹:Ll/ۚ᩹ᩳ;

    invoke-virtual {v2, v1}, Ll/ۚ᩹ᩳ;->֫(Ll/ۨ᩹ᩳ;)Ll/ۨ᩹ᩳ;

    move-result-object v1

    .line 37
    iget-object v2, p1, Ll/ܶۙᩳ;->᩸:Ll/ۖۙᩳ;

    invoke-direct {p0, v2}, Ll/֫ۗᩳ;->֫(Ll/ۖۙᩳ;)Ll/ۖۙᩳ;

    move-result-object v6

    .line 38
    new-instance v2, Ll/۫᩹ᩳ;

    invoke-virtual {v0}, Ll/۫᩹ᩳ;->᩻()J

    move-result-wide v3

    invoke-direct {v2, v1, v3, v4}, Ll/۫᩹ᩳ;-><init>(Ll/ۨ᩹ᩳ;J)V
    :try_end_0
    .catch Ljava/io/UncheckedIOException; {:try_start_0 .. :try_end_0} :catch_2

    .line 39
    :try_start_1
    new-instance v0, Ll/ܶۙᩳ;

    iget-object v5, p1, Ll/ܶۙᩳ;->ۙ:Ll/ۖۗᩳ;

    iget-object v7, p1, Ll/ܶۙᩳ;->᩹:Ll/ۚۙᩳ;

    iget-wide v8, p1, Ll/ܶۙᩳ;->᩶:J

    move-object v3, v0

    move-object v4, v2

    invoke-direct/range {v3 .. v9}, Ll/ܶۙᩳ;-><init>(Ll/۫᩹ᩳ;Ll/ۖۗᩳ;Ll/ۖۙᩳ;Ll/ۚۙᩳ;J)V
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Error; {:try_start_1 .. :try_end_1} :catch_0

    return-object v0

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    .line 40
    :goto_0
    :try_start_2
    invoke-virtual {v2}, Ll/۬᩹ᩳ;->close()V

    throw p1
    :try_end_2
    .catch Ljava/io/UncheckedIOException; {:try_start_2 .. :try_end_2} :catch_2

    :catch_2
    move-exception p1

    .line 41
    invoke-virtual {p1}, Ljava/io/UncheckedIOException;->getCause()Ljava/io/IOException;

    move-result-object p1

    throw p1

    .line 34
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Snapshot belongs to another recovery generation"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 33
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Recovery graph copy is closed"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(Ljava/lang/Runnable;)V
    .locals 1

    .line 44
    iget-object v0, p0, Ll/֫ۗᩳ;->᩹:Ll/ۚ᩹ᩳ;

    invoke-virtual {v0, p1}, Ll/ۚ᩹ᩳ;->֫(Ljava/lang/Runnable;)V

    return-void
.end method
