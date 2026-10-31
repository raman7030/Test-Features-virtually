.class public final Ll/ۙ֫ܿ;
.super Ll/ۤ᩸ᩳ;
.source "76QP"

# interfaces
.implements Ll/۟᩺ᩳ;


# instance fields
.field public volatile ۜ֫:Z

.field public final ۡ֫:Ll/᩻۬ᩳ;

.field public volatile ۢ֫:J

.field public ܳ֫:I

.field public ᩷֫:Z

.field public final ᩻֫:Ll/֫ۧܿ;


# direct methods
.method public constructor <init>(Ll/᩻۬ᩳ;)V
    .locals 1

    const/4 v0, 0x0

    .line 21
    invoke-direct {p0, p1, v0}, Ll/ۙ֫ܿ;-><init>(Ll/᩻۬ᩳ;Ljava/lang/Long;)V

    return-void
.end method

.method public constructor <init>(Ll/᩻۬ᩳ;J)V
    .locals 0

    .line 26
    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    invoke-direct {p0, p1, p2}, Ll/ۙ֫ܿ;-><init>(Ll/᩻۬ᩳ;Ljava/lang/Long;)V

    return-void
.end method

.method public constructor <init>(Ll/᩻۬ᩳ;Ljava/lang/Long;)V
    .locals 4

    .line 30
    invoke-direct {p0, p1}, Ll/ۤ᩸ᩳ;-><init>(Ll/᩻۬ᩳ;)V

    .line 13
    new-instance v0, Ll/֫ۧܿ;

    new-instance v1, Ll/᩸֫ܿ;

    invoke-direct {v1, p0}, Ll/᩸֫ܿ;-><init>(Ll/ۙ֫ܿ;)V

    invoke-direct {v0, v1}, Ll/֫ۧܿ;-><init>(Ll/۟֫ܿ;)V

    iput-object v0, p0, Ll/ۙ֫ܿ;->᩻֫:Ll/֫ۧܿ;

    .line 31
    iput-object p1, p0, Ll/ۙ֫ܿ;->ۡ֫:Ll/᩻۬ᩳ;

    move-object v0, p1

    .line 32
    monitor-enter v0

    .line 33
    :try_start_0
    invoke-virtual {p1}, Ll/᩻۬ᩳ;->ۗ()[B

    move-result-object v1

    if-nez p2, :cond_0

    .line 35
    array-length v2, v1

    if-nez v2, :cond_0

    invoke-virtual {p1}, Ll/᩻۬ᩳ;->֡()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    .line 34
    :cond_0
    invoke-static {v1, p2}, Ll/۠֫ܿ;->֫([BLjava/lang/Long;)Ll/۠֫ܿ;

    move-result-object p2

    .line 36
    invoke-virtual {p1}, Ll/᩻۬ᩳ;->۟()Ljava/util/UUID;

    move-result-object v1

    invoke-virtual {p2, v1}, Ll/۠֫ܿ;->֫(Ljava/util/UUID;)V

    .line 37
    iget-wide v1, p2, Ll/۠֫ܿ;->ܽ:J

    invoke-virtual {p2, v1, v2}, Ll/۠֫ܿ;->֫(J)[B

    move-result-object v1

    invoke-virtual {p1, v1}, Ll/᩻۬ᩳ;->ۧ([B)V

    .line 38
    iget-wide p1, p2, Ll/۠֫ܿ;->ܽ:J

    iput-wide p1, p0, Ll/ۙ֫ܿ;->ۢ֫:J

    .line 39
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public static synthetic ֫(Ll/ۙ֫ܿ;Ll/ᩴۗᩳ;)Ll/ۚۙᩳ;
    .locals 0

    .line 115
    invoke-super {p0, p1}, Ll/ۤ᩸ᩳ;->֫(Ll/ᩴۗᩳ;)Ll/ۚۙᩳ;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic ֫(Ll/ۙ֫ܿ;)Ll/ܽ۬ᩳ;
    .locals 0

    .line 93
    invoke-super {p0}, Ll/ۤ᩸ᩳ;->ۤ֫()Ll/ܽ۬ᩳ;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic ֫(Ll/ۙ֫ܿ;IILjava/lang/CharSequence;II)V
    .locals 0

    .line 13
    invoke-super/range {p0 .. p5}, Ll/ۤ᩸ᩳ;->replace(IILjava/lang/CharSequence;II)Ll/ۤ᩸ᩳ;

    return-void
.end method

.method public static synthetic ۧ(Ll/ۙ֫ܿ;)Ll/ܽ۬ᩳ;
    .locals 0

    .line 102
    invoke-super {p0}, Ll/ۤ᩸ᩳ;->ۗ֫()Ll/ܽ۬ᩳ;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final close()V
    .locals 1

    .line 127
    iget-boolean v0, p0, Ll/ۙ֫ܿ;->ۜ֫:Z

    if-eqz v0, :cond_0

    return-void

    .line 128
    :cond_0
    invoke-virtual {p0}, Ll/ۙ֫ܿ;->isChanged()Z

    move-result v0

    iput-boolean v0, p0, Ll/ۙ֫ܿ;->᩷֫:Z

    .line 129
    invoke-super {p0}, Ll/ۤ᩸ᩳ;->close()V

    const/4 v0, 0x1

    .line 130
    iput-boolean v0, p0, Ll/ۙ֫ܿ;->ۜ֫:Z

    .line 131
    iget-object v0, p0, Ll/ۙ֫ܿ;->᩻֫:Ll/֫ۧܿ;

    invoke-virtual {v0}, Ll/֫ۧܿ;->ܽ()V

    return-void
.end method

.method public final isChanged()Z
    .locals 5

    .line 66
    invoke-virtual {p0}, Ll/ۤ᩸ᩳ;->֫()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Ll/ۙ֫ܿ;->᩷֫:Z

    return v0

    .line 67
    :cond_0
    :try_start_0
    iget-wide v0, p0, Ll/ۙ֫ܿ;->ۢ֫:J

    iget-object v2, p0, Ll/ۙ֫ܿ;->ۡ֫:Ll/᩻۬ᩳ;

    invoke-virtual {v2}, Ll/᩻۬ᩳ;->֡()J

    move-result-wide v2
    :try_end_0
    .catch Ll/֫᩹ᩳ; {:try_start_0 .. :try_end_0} :catch_0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_1

    const/4 v0, 0x1

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0

    :catch_0
    move-exception v0

    .line 69
    invoke-virtual {p0}, Ll/ۤ᩸ᩳ;->֫()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 70
    iget-boolean v0, p0, Ll/ۙ֫ܿ;->᩷֫:Z

    return v0

    .line 69
    :cond_2
    throw v0
.end method

.method public final bridge synthetic replace(IILjava/lang/CharSequence;II)Landroid/text/Editable;
    .locals 0

    .line 11
    invoke-virtual/range {p0 .. p5}, Ll/ۙ֫ܿ;->ۧ(IILjava/lang/CharSequence;II)V

    return-object p0
.end method

.method public final bridge synthetic replace(IILjava/lang/CharSequence;II)Ll/ۤ᩸ᩳ;
    .locals 0

    .line 11
    invoke-virtual/range {p0 .. p5}, Ll/ۙ֫ܿ;->ۧ(IILjava/lang/CharSequence;II)V

    return-object p0
.end method

.method public final setReadOnly(Z)V
    .locals 1

    .line 45
    iget-object v0, p0, Ll/ۙ֫ܿ;->᩻֫:Ll/֫ۧܿ;

    invoke-virtual {v0, p1}, Ll/֫ۧܿ;->֫(Z)V

    return-void
.end method

.method public final ֡ۧ()I
    .locals 1

    .line 50
    iget v0, p0, Ll/ۙ֫ܿ;->ܳ֫:I

    return v0
.end method

.method public final ֫(Ll/ᩴۗᩳ;)Ll/ۚۙᩳ;
    .locals 1

    .line 115
    new-instance v0, Ll/᩶֫ܿ;

    invoke-direct {v0, p0, p1}, Ll/᩶֫ܿ;-><init>(Ll/ۙ֫ܿ;Ll/ᩴۗᩳ;)V

    iget-object p1, p0, Ll/ۙ֫ܿ;->᩻֫:Ll/֫ۧܿ;

    invoke-virtual {p1, v0}, Ll/֫ۧܿ;->֫(Ll/᩶֫ܿ;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۚۙᩳ;

    if-eqz p1, :cond_0

    return-object p1

    .line 109
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Text load publication is waiting for internal readers"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(I)V
    .locals 0

    .line 49
    iput p1, p0, Ll/ۙ֫ܿ;->ܳ֫:I

    return-void
.end method

.method public final synthetic ֫(Ll/۟᩹ᩳ;)V
    .locals 0

    return-void
.end method

.method public final ֫(Ll/ۤۜܽ;)V
    .locals 1

    .line 39
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Session recovery protocol required"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(Z)V
    .locals 1

    .line 121
    invoke-virtual {p0}, Ll/ۤ᩸ᩳ;->ᩳ()Z

    move-result p1

    if-eqz p1, :cond_0

    new-instance p1, Ll/ۛ᩷ᩳ;

    const/4 v0, 0x2

    invoke-direct {p1, v0, p0}, Ll/ۛ᩷ᩳ;-><init>(ILjava/lang/Object;)V

    invoke-static {p1}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;)V

    return-void

    .line 122
    :cond_0
    invoke-virtual {p0}, Ll/ۙ֫ܿ;->close()V

    return-void
.end method

.method public final ֫(Ljava/lang/Runnable;)Z
    .locals 2

    .line 98
    iget v0, p0, Ll/ۙ֫ܿ;->ܳ֫:I

    if-nez v0, :cond_0

    new-instance v0, Ll/᩹֫ܿ;

    invoke-direct {v0, p0, p1}, Ll/᩹֫ܿ;-><init>(Ll/ۙ֫ܿ;Ljava/lang/Runnable;)V

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iget-object v1, p0, Ll/ۙ֫ܿ;->᩻֫:Ll/֫ۧܿ;

    invoke-virtual {v1, p1, v0}, Ll/֫ۧܿ;->֫(Ljava/lang/Object;Ljava/util/function/Supplier;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ۗ֫()Ll/ܽ۬ᩳ;
    .locals 3

    .line 102
    iget v0, p0, Ll/ۙ֫ܿ;->ܳ֫:I

    if-nez v0, :cond_0

    new-instance v0, Ll/ܶ֫ܿ;

    invoke-direct {v0, p0}, Ll/ܶ֫ܿ;-><init>(Ll/ۙ֫ܿ;)V

    sget-object v1, Ll/ܽ۬ᩳ;->ۙ:Ll/ܽ۬ᩳ;

    iget-object v2, p0, Ll/ۙ֫ܿ;->᩻֫:Ll/֫ۧܿ;

    invoke-virtual {v2, v1, v0}, Ll/֫ۧܿ;->֫(Ljava/lang/Object;Ljava/util/function/Supplier;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܽ۬ᩳ;

    return-object v0

    .line 103
    :cond_0
    sget-object v0, Ll/ܽ۬ᩳ;->ۙ:Ll/ܽ۬ᩳ;

    return-object v0
.end method

.method public final ۘ()Z
    .locals 1

    .line 53
    iget-object v0, p0, Ll/ۙ֫ܿ;->᩻֫:Ll/֫ۧܿ;

    invoke-virtual {v0}, Ll/֫ۧܿ;->֫()Z

    move-result v0

    return v0
.end method

.method public final ۤ֫()Ll/ܽ۬ᩳ;
    .locals 3

    .line 93
    iget v0, p0, Ll/ۙ֫ܿ;->ܳ֫:I

    if-nez v0, :cond_0

    new-instance v0, Ll/ᩳܰᩳ;

    const/4 v1, 0x1

    invoke-direct {v0, v1, p0}, Ll/ᩳܰᩳ;-><init>(ILjava/lang/Object;)V

    sget-object v1, Ll/ܽ۬ᩳ;->ۙ:Ll/ܽ۬ᩳ;

    iget-object v2, p0, Ll/ۙ֫ܿ;->᩻֫:Ll/֫ۧܿ;

    invoke-virtual {v2, v1, v0}, Ll/֫ۧܿ;->֫(Ljava/lang/Object;Ljava/util/function/Supplier;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܽ۬ᩳ;

    return-object v0

    .line 94
    :cond_0
    sget-object v0, Ll/ܽ۬ᩳ;->ۙ:Ll/ܽ۬ᩳ;

    return-object v0
.end method

.method public final ۧ(IILjava/lang/CharSequence;II)V
    .locals 9

    .line 88
    iget v0, p0, Ll/ۙ֫ܿ;->ܳ֫:I

    if-nez v0, :cond_0

    iget-object v0, p0, Ll/ۙ֫ܿ;->᩻֫:Ll/֫ۧܿ;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 91
    new-instance v8, Ll/ܰ֫ܿ;

    move-object v1, v8

    move-object v2, v0

    move v3, p1

    move v4, p2

    move-object v5, p3

    move v6, p4

    move v7, p5

    invoke-direct/range {v1 .. v7}, Ll/ܰ֫ܿ;-><init>(Ll/֫ۧܿ;IILjava/lang/CharSequence;II)V

    const/4 p1, 0x0

    invoke-virtual {v0, p1, v8}, Ll/֫ۧܿ;->֫(Ljava/lang/Object;Ljava/util/function/Supplier;)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public final ۧ(Z)V
    .locals 4

    .line 75
    iget-object v0, p0, Ll/ۙ֫ܿ;->ۡ֫:Ll/᩻۬ᩳ;

    monitor-enter v0

    .line 76
    :try_start_0
    invoke-virtual {p0}, Ll/ۤ᩸ᩳ;->֫()Z

    move-result v1

    if-eqz v1, :cond_0

    monitor-exit v0

    return-void

    .line 77
    :cond_0
    iget-boolean v1, p0, Ll/ۙ֫ܿ;->ۜ֫:Z

    if-nez v1, :cond_2

    if-eqz p1, :cond_1

    const-wide/16 v1, -0x1

    goto :goto_0

    .line 78
    :cond_1
    iget-object p1, p0, Ll/ۙ֫ܿ;->ۡ֫:Ll/᩻۬ᩳ;

    invoke-virtual {p1}, Ll/᩻۬ᩳ;->֡()J

    move-result-wide v1

    .line 79
    :goto_0
    iget-object p1, p0, Ll/ۙ֫ܿ;->ۡ֫:Ll/᩻۬ᩳ;

    invoke-virtual {p1}, Ll/᩻۬ᩳ;->ۗ()[B

    move-result-object p1

    const/4 v3, 0x0

    invoke-static {p1, v3}, Ll/۠֫ܿ;->֫([BLjava/lang/Long;)Ll/۠֫ܿ;

    move-result-object p1

    .line 80
    iget-object v3, p0, Ll/ۙ֫ܿ;->ۡ֫:Ll/᩻۬ᩳ;

    invoke-virtual {v3}, Ll/᩻۬ᩳ;->۟()Ljava/util/UUID;

    move-result-object v3

    invoke-virtual {p1, v3}, Ll/۠֫ܿ;->֫(Ljava/util/UUID;)V

    .line 81
    iget-object v3, p0, Ll/ۙ֫ܿ;->ۡ֫:Ll/᩻۬ᩳ;

    invoke-virtual {p1, v1, v2}, Ll/۠֫ܿ;->֫(J)[B

    move-result-object p1

    invoke-virtual {v3, p1}, Ll/᩻۬ᩳ;->ۧ([B)V

    .line 82
    iput-wide v1, p0, Ll/ۙ֫ܿ;->ۢ֫:J

    .line 83
    monitor-exit v0

    return-void

    .line 77
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v1, "Editable is closed"

    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :catchall_0
    move-exception p1

    .line 83
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final ۬()I
    .locals 2

    .line 40
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Session recovery protocol required"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ܳۧ()Ll/᩻۬ᩳ;
    .locals 1

    .line 43
    iget-object v0, p0, Ll/ۙ֫ܿ;->ۡ֫:Ll/᩻۬ᩳ;

    return-object v0
.end method

.method public final ܺۧ()V
    .locals 1

    .line 136
    iget-object v0, p0, Ll/ۙ֫ܿ;->ۡ֫:Ll/᩻۬ᩳ;

    invoke-virtual {v0}, Ll/᩻۬ᩳ;->۬()V

    return-void
.end method

.method public final ᩳ(J)V
    .locals 3

    .line 56
    iget-object v0, p0, Ll/ۙ֫ܿ;->ۡ֫:Ll/᩻۬ᩳ;

    monitor-enter v0

    .line 57
    :try_start_0
    invoke-virtual {p0}, Ll/ۤ᩸ᩳ;->֫()Z

    move-result v1

    if-eqz v1, :cond_0

    monitor-exit v0

    return-void

    .line 58
    :cond_0
    iget-object v1, p0, Ll/ۙ֫ܿ;->ۡ֫:Ll/᩻۬ᩳ;

    invoke-virtual {v1}, Ll/᩻۬ᩳ;->ۗ()[B

    move-result-object v1

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-static {v1, v2}, Ll/۠֫ܿ;->֫([BLjava/lang/Long;)Ll/۠֫ܿ;

    move-result-object v1

    .line 59
    iget-object v2, p0, Ll/ۙ֫ܿ;->ۡ֫:Ll/᩻۬ᩳ;

    invoke-virtual {v1, p1, p2}, Ll/۠֫ܿ;->֫(J)[B

    move-result-object v1

    invoke-virtual {v2, v1}, Ll/᩻۬ᩳ;->ۧ([B)V

    .line 60
    iput-wide p1, p0, Ll/ۙ֫ܿ;->ۢ֫:J

    .line 61
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final ᩵֫()Z
    .locals 1

    .line 47
    iget-object v0, p0, Ll/ۙ֫ܿ;->᩻֫:Ll/֫ۧܿ;

    invoke-virtual {v0}, Ll/֫ۧܿ;->ۧ()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Ll/ۤ᩸ᩳ;->ᩳ()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public final ᩶()J
    .locals 2

    .line 64
    iget-wide v0, p0, Ll/ۙ֫ܿ;->ۢ֫:J

    return-wide v0
.end method

.method public final synthetic ᩸֫()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final ᩹֫()V
    .locals 1

    const/4 v0, 0x1

    .line 43
    invoke-virtual {p0, v0}, Ll/ۙ֫ܿ;->֫(Z)V

    return-void
.end method
