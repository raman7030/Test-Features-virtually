.class public final Ll/ܳۗᩳ;
.super Ljava/lang/Object;
.source "N6TT"


# instance fields
.field public final ֫:Ljava/lang/Runnable;

.field public final ۧ:Ll/᩸۬ᩳ;

.field public final ܽ:Ll/ܳ᩹ᩳ;


# direct methods
.method public constructor <init>(Ll/᩸۬ᩳ;Ll/ܳ᩹ᩳ;Ljava/lang/Runnable;)V
    .locals 0

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    iput-object p1, p0, Ll/ܳۗᩳ;->ۧ:Ll/᩸۬ᩳ;

    .line 38
    iput-object p2, p0, Ll/ܳۗᩳ;->ܽ:Ll/ܳ᩹ᩳ;

    .line 39
    iput-object p3, p0, Ll/ܳۗᩳ;->֫:Ljava/lang/Runnable;

    return-void
.end method

.method private ֫(Ll/ۡ۬ᩳ;)J
    .locals 11

    .line 95
    iget-wide v0, p1, Ll/ۡ۬ᩳ;->ᩳ:J

    iget-object v2, p1, Ll/ۡ۬ᩳ;->ܿ:Ll/᩸۬ᩳ;

    invoke-direct {p0, v0, v1, v2}, Ll/ܳۗᩳ;->֫(JLl/᩸۬ᩳ;)V

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-ltz v4, :cond_0

    return-wide v0

    .line 97
    :cond_0
    iget-object v0, p1, Ll/ۡ۬ᩳ;->֫:Ll/ܺۙᩳ;

    iget-object v0, v0, Ll/ܺۙᩳ;->᩸:Ll/ۢۙᩳ;

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Ll/ܳۗᩳ;->֫(Ll/ۢۙᩳ;Z)J

    move-result-wide v2

    .line 98
    iget-object v0, p0, Ll/ܳۗᩳ;->ۧ:Ll/᩸۬ᩳ;

    iget-object v0, v0, Ll/᩸۬ᩳ;->ۙ:Ll/֨۬ᩳ;

    iget-object v0, v0, Ll/֨۬ᩳ;->ܿ:Ljava/lang/Object;

    monitor-enter v0

    .line 99
    :try_start_0
    new-instance v4, Ll/ۤۜܽ;

    const/16 v5, 0x24

    invoke-direct {v4, v5}, Ll/ۤۜܽ;-><init>(I)V

    const/4 v5, 0x6

    .line 100
    invoke-virtual {v4, v5}, Ll/ۤۜܽ;->writeInt(I)V

    .line 101
    iget-wide v5, p1, Ll/ۡ۬ᩳ;->ۧ:J

    invoke-virtual {v4, v5, v6}, Ll/ۤۜܽ;->ۧ(J)V

    .line 102
    iget-wide v5, p1, Ll/ۡ۬ᩳ;->ܳ:J

    invoke-virtual {v4, v5, v6}, Ll/ۤۜܽ;->ۧ(J)V

    .line 103
    iget-object v5, p1, Ll/ۡ۬ᩳ;->ܽ:Ll/ܰ᩶ᩳ;

    sget-object v6, Ll/ܰ᩶ᩳ;->۫:Ll/ܰ᩶ᩳ;

    if-ne v5, v6, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x1

    :goto_0
    invoke-virtual {v4, v1}, Ll/ۤۜܽ;->writeInt(I)V

    .line 104
    invoke-virtual {v4, v2, v3}, Ll/ۤۜܽ;->ۧ(J)V

    .line 105
    iget-object v1, p1, Ll/ۡ۬ᩳ;->֫:Ll/ܺۙᩳ;

    invoke-virtual {v1}, Ll/ܺۙᩳ;->ۧ()I

    move-result v1

    invoke-virtual {v4, v1}, Ll/ۤۜܽ;->writeInt(I)V

    .line 141
    iget-object v5, p0, Ll/ܳۗᩳ;->ۧ:Ll/᩸۬ᩳ;

    invoke-virtual {v5}, Ll/᩸۬ᩳ;->ᩳ()J

    move-result-wide v6

    .line 494
    invoke-virtual {v4}, Ll/ۤۜܽ;->ܽ()[B

    move-result-object v8

    invoke-virtual {v4}, Ll/ۤۜܽ;->size()I

    move-result v10

    const/4 v9, 0x5

    invoke-virtual/range {v5 .. v10}, Ll/᩸۬ᩳ;->ܽ(J[BII)J

    move-result-wide v1

    .line 107
    iget-object v3, p0, Ll/ܳۗᩳ;->ۧ:Ll/᩸۬ᩳ;

    iput-object v3, p1, Ll/ۡ۬ᩳ;->ܿ:Ll/᩸۬ᩳ;

    .line 108
    iput-wide v1, p1, Ll/ۡ۬ᩳ;->ᩳ:J

    monitor-exit v0

    return-wide v1

    :catchall_0
    move-exception p1

    .line 109
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method private ֫(Ll/ۢۙᩳ;Z)J
    .locals 12

    .line 64
    iget-object v0, p0, Ll/ܳۗᩳ;->֫:Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    const-wide/16 v0, 0x0

    if-nez p1, :cond_0

    return-wide v0

    .line 66
    :cond_0
    iget-wide v2, p1, Ll/ۢۙᩳ;->ᩳ:J

    iget-object v4, p1, Ll/ۢۙᩳ;->ܿ:Ll/᩸۬ᩳ;

    invoke-direct {p0, v2, v3, v4}, Ll/ܳۗᩳ;->֫(JLl/᩸۬ᩳ;)V

    cmp-long v4, v2, v0

    if-ltz v4, :cond_1

    return-wide v2

    .line 68
    :cond_1
    iget-object v0, p1, Ll/ۢۙᩳ;->ۧ:Ljava/lang/Object;

    if-eqz v0, :cond_4

    if-eqz p2, :cond_2

    .line 69
    check-cast v0, Ll/ۡ۬ᩳ;

    invoke-direct {p0, v0}, Ll/ܳۗᩳ;->֫(Ll/ۡ۬ᩳ;)J

    move-result-wide v0

    goto :goto_0

    :cond_2
    check-cast v0, Ll/᩺᩶ᩳ;

    invoke-direct {p0, v0}, Ll/ܳۗᩳ;->֫(Ll/᩺᩶ᩳ;)J

    move-result-wide v0

    :goto_0
    move-wide v1, v0

    .line 70
    iget-object v0, p0, Ll/ܳۗᩳ;->ۧ:Ll/᩸۬ᩳ;

    iget-object v0, v0, Ll/᩸۬ᩳ;->ۙ:Ll/֨۬ᩳ;

    iget-object v0, v0, Ll/֨۬ᩳ;->ܿ:Ljava/lang/Object;

    monitor-enter v0

    .line 71
    :try_start_0
    new-instance v3, Ll/ۤۜܽ;

    const/16 v4, 0xc

    invoke-direct {v3, v4}, Ll/ۤۜܽ;-><init>(I)V

    if-eqz p2, :cond_3

    const/4 p2, 0x2

    goto :goto_1

    :cond_3
    const/4 p2, 0x4

    .line 72
    :goto_1
    invoke-virtual {v3, p2}, Ll/ۤۜܽ;->writeInt(I)V

    .line 73
    invoke-virtual {v3, v1, v2}, Ll/ۤۜܽ;->ۧ(J)V

    .line 141
    iget-object v4, p0, Ll/ܳۗᩳ;->ۧ:Ll/᩸۬ᩳ;

    invoke-virtual {v4}, Ll/᩸۬ᩳ;->ᩳ()J

    move-result-wide v5

    .line 494
    invoke-virtual {v3}, Ll/ۤۜܽ;->ܽ()[B

    move-result-object v7

    invoke-virtual {v3}, Ll/ۤۜܽ;->size()I

    move-result v9

    const/4 v8, 0x5

    invoke-virtual/range {v4 .. v9}, Ll/᩸۬ᩳ;->ܽ(J[BII)J

    move-result-wide v1

    .line 75
    iget-object p2, p0, Ll/ܳۗᩳ;->ۧ:Ll/᩸۬ᩳ;

    iput-object p2, p1, Ll/ۢۙᩳ;->ܿ:Ll/᩸۬ᩳ;

    .line 76
    iput-wide v1, p1, Ll/ۢۙᩳ;->ᩳ:J

    monitor-exit v0

    return-wide v1

    :catchall_0
    move-exception p1

    .line 77
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    .line 79
    :cond_4
    iget-object v0, p1, Ll/ۢۙᩳ;->ܽ:Ll/ۢۙᩳ;

    invoke-direct {p0, v0, p2}, Ll/ܳۗᩳ;->֫(Ll/ۢۙᩳ;Z)J

    move-result-wide v1

    iget-object v0, p1, Ll/ۢۙᩳ;->ܳ:Ll/ۢۙᩳ;

    invoke-direct {p0, v0, p2}, Ll/ܳۗᩳ;->֫(Ll/ۢۙᩳ;Z)J

    move-result-wide v3

    .line 80
    iget-object v0, p0, Ll/ܳۗᩳ;->ۧ:Ll/᩸۬ᩳ;

    iget-object v0, v0, Ll/᩸۬ᩳ;->ۙ:Ll/֨۬ᩳ;

    iget-object v0, v0, Ll/֨۬ᩳ;->ܿ:Ljava/lang/Object;

    monitor-enter v0

    .line 81
    :try_start_1
    new-instance v5, Ll/ۤۜܽ;

    const/16 v6, 0x1c

    invoke-direct {v5, v6}, Ll/ۤۜܽ;-><init>(I)V

    if-eqz p2, :cond_5

    const/4 p2, 0x3

    goto :goto_2

    :cond_5
    const/4 p2, 0x5

    .line 82
    :goto_2
    invoke-virtual {v5, p2}, Ll/ۤۜܽ;->writeInt(I)V

    .line 83
    iget p2, p1, Ll/ۢۙᩳ;->֫:I

    invoke-virtual {v5, p2}, Ll/ۤۜܽ;->writeInt(I)V

    .line 84
    iget p2, p1, Ll/ۢۙᩳ;->᩻:I

    invoke-virtual {v5, p2}, Ll/ۤۜܽ;->writeInt(I)V

    .line 85
    invoke-virtual {v5, v1, v2}, Ll/ۤۜܽ;->ۧ(J)V

    .line 86
    invoke-virtual {v5, v3, v4}, Ll/ۤۜܽ;->ۧ(J)V

    .line 141
    iget-object v6, p0, Ll/ܳۗᩳ;->ۧ:Ll/᩸۬ᩳ;

    invoke-virtual {v6}, Ll/᩸۬ᩳ;->ᩳ()J

    move-result-wide v7

    .line 494
    invoke-virtual {v5}, Ll/ۤۜܽ;->ܽ()[B

    move-result-object v9

    invoke-virtual {v5}, Ll/ۤۜܽ;->size()I

    move-result v11

    const/4 v10, 0x5

    invoke-virtual/range {v6 .. v11}, Ll/᩸۬ᩳ;->ܽ(J[BII)J

    move-result-wide v1

    .line 88
    iget-object p2, p0, Ll/ܳۗᩳ;->ۧ:Ll/᩸۬ᩳ;

    iput-object p2, p1, Ll/ۢۙᩳ;->ܿ:Ll/᩸۬ᩳ;

    .line 89
    iput-wide v1, p1, Ll/ۢۙᩳ;->ᩳ:J

    monitor-exit v0

    return-wide v1

    :catchall_1
    move-exception p1

    .line 90
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    throw p1
.end method

.method private ֫(Ll/᩺᩶ᩳ;)J
    .locals 12

    .line 113
    iget-wide v0, p1, Ll/᩺᩶ᩳ;->ᩳ:J

    iget-object v2, p1, Ll/᩺᩶ᩳ;->ܿ:Ll/᩸۬ᩳ;

    invoke-direct {p0, v0, v1, v2}, Ll/ܳۗᩳ;->֫(JLl/᩸۬ᩳ;)V

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-ltz v4, :cond_0

    return-wide v0

    .line 115
    :cond_0
    iget-object v0, p1, Ll/᩺᩶ᩳ;->ܳ:Ll/ۨ᩹ᩳ;

    iget-object v1, v0, Ll/ۨ᩹ᩳ;->ᩳ:Ll/᩸۬ᩳ;

    iget-object v2, p0, Ll/ܳۗᩳ;->ۧ:Ll/᩸۬ᩳ;

    if-ne v1, v2, :cond_1

    iget-object v1, p1, Ll/᩺᩶ᩳ;->֫:Ll/ۨ᩹ᩳ;

    iget-object v1, v1, Ll/ۨ᩹ᩳ;->ᩳ:Ll/᩸۬ᩳ;

    if-ne v1, v2, :cond_1

    .line 116
    iget-object v1, p0, Ll/ܳۗᩳ;->ܽ:Ll/ܳ᩹ᩳ;

    invoke-virtual {v1, v0}, Ll/ܳ᩹ᩳ;->֫(Ll/ۨ᩹ᩳ;)J

    move-result-wide v1

    iget-object v0, p0, Ll/ܳۗᩳ;->ܽ:Ll/ܳ᩹ᩳ;

    iget-object v3, p1, Ll/᩺᩶ᩳ;->֫:Ll/ۨ᩹ᩳ;

    invoke-virtual {v0, v3}, Ll/ܳ᩹ᩳ;->֫(Ll/ۨ᩹ᩳ;)J

    move-result-wide v3

    .line 117
    iget-object v0, p0, Ll/ܳۗᩳ;->ۧ:Ll/᩸۬ᩳ;

    iget-object v0, v0, Ll/᩸۬ᩳ;->ۙ:Ll/֨۬ᩳ;

    iget-object v0, v0, Ll/֨۬ᩳ;->ܿ:Ljava/lang/Object;

    monitor-enter v0

    .line 118
    :try_start_0
    new-instance v5, Ll/ۤۜܽ;

    const/16 v6, 0x48

    invoke-direct {v5, v6}, Ll/ۤۜܽ;-><init>(I)V

    const/4 v6, 0x7

    .line 119
    invoke-virtual {v5, v6}, Ll/ۤۜܽ;->writeInt(I)V

    .line 120
    iget v6, p1, Ll/᩺᩶ᩳ;->ۜ:I

    invoke-virtual {v5, v6}, Ll/ۤۜܽ;->writeInt(I)V

    .line 121
    iget-wide v6, p1, Ll/᩺᩶ᩳ;->ܽ:J

    invoke-virtual {v5, v6, v7}, Ll/ۤۜܽ;->ۧ(J)V

    .line 122
    iget-wide v6, p1, Ll/᩺᩶ᩳ;->ۧ:J

    invoke-virtual {v5, v6, v7}, Ll/ۤۜܽ;->ۧ(J)V

    .line 123
    iget-object v6, p1, Ll/᩺᩶ᩳ;->᩻:Ll/ۚۗᩳ;

    invoke-virtual {v6}, Ll/ۚۗᩳ;->ܽ()I

    move-result v6

    invoke-virtual {v5, v6}, Ll/ۤۜܽ;->writeInt(I)V

    .line 124
    iget-object v6, p1, Ll/᩺᩶ᩳ;->᩻:Ll/ۚۗᩳ;

    invoke-virtual {v6}, Ll/ۚۗᩳ;->֫()I

    move-result v6

    invoke-virtual {v5, v6}, Ll/ۤۜܽ;->writeInt(I)V

    .line 125
    iget-object v6, p1, Ll/᩺᩶ᩳ;->ܳ:Ll/ۨ᩹ᩳ;

    .line 134
    invoke-virtual {v5, v1, v2}, Ll/ۤۜܽ;->ۧ(J)V

    .line 135
    invoke-virtual {v6}, Ll/ۨ᩹ᩳ;->ۧ()I

    move-result v1

    invoke-virtual {v5, v1}, Ll/ۤۜܽ;->writeInt(I)V

    .line 136
    invoke-virtual {v6}, Ll/ۨ᩹ᩳ;->ܽ()I

    move-result v1

    invoke-virtual {v5, v1}, Ll/ۤۜܽ;->writeInt(I)V

    .line 137
    invoke-virtual {v6}, Ll/ۨ᩹ᩳ;->֫()I

    move-result v1

    invoke-virtual {v5, v1}, Ll/ۤۜܽ;->writeInt(I)V

    .line 126
    iget-object v1, p1, Ll/᩺᩶ᩳ;->֫:Ll/ۨ᩹ᩳ;

    .line 134
    invoke-virtual {v5, v3, v4}, Ll/ۤۜܽ;->ۧ(J)V

    .line 135
    invoke-virtual {v1}, Ll/ۨ᩹ᩳ;->ۧ()I

    move-result v2

    invoke-virtual {v5, v2}, Ll/ۤۜܽ;->writeInt(I)V

    .line 136
    invoke-virtual {v1}, Ll/ۨ᩹ᩳ;->ܽ()I

    move-result v2

    invoke-virtual {v5, v2}, Ll/ۤۜܽ;->writeInt(I)V

    .line 137
    invoke-virtual {v1}, Ll/ۨ᩹ᩳ;->֫()I

    move-result v1

    invoke-virtual {v5, v1}, Ll/ۤۜܽ;->writeInt(I)V

    .line 141
    iget-object v6, p0, Ll/ܳۗᩳ;->ۧ:Ll/᩸۬ᩳ;

    invoke-virtual {v6}, Ll/᩸۬ᩳ;->ᩳ()J

    move-result-wide v7

    .line 494
    invoke-virtual {v5}, Ll/ۤۜܽ;->ܽ()[B

    move-result-object v9

    invoke-virtual {v5}, Ll/ۤۜܽ;->size()I

    move-result v11

    const/4 v10, 0x5

    invoke-virtual/range {v6 .. v11}, Ll/᩸۬ᩳ;->ܽ(J[BII)J

    move-result-wide v1

    .line 128
    iget-object v3, p0, Ll/ܳۗᩳ;->ۧ:Ll/᩸۬ᩳ;

    iput-object v3, p1, Ll/᩺᩶ᩳ;->ܿ:Ll/᩸۬ᩳ;

    .line 129
    iput-wide v1, p1, Ll/᩺᩶ᩳ;->ᩳ:J

    monitor-exit v0

    return-wide v1

    :catchall_0
    move-exception p1

    .line 130
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    .line 115
    :cond_1
    new-instance p1, Ljava/io/IOException;

    const-string v0, "History belongs to another store"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static bridge synthetic ֫(Ll/ܳۗᩳ;)Ljava/lang/Runnable;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܳۗᩳ;->֫:Ljava/lang/Runnable;

    return-object p0
.end method

.method private ֫(JLl/᩸۬ᩳ;)V
    .locals 3

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-ltz v2, :cond_1

    .line 145
    iget-object p1, p0, Ll/ܳۗᩳ;->ۧ:Ll/᩸۬ᩳ;

    if-ne p3, p1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/io/IOException;

    const-string p2, "History offset belongs to another store"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    return-void
.end method

.method public static ֫(Ll/ۢ۬ᩳ;I)V
    .locals 3

    .line 23
    iget-object v0, p0, Ll/ۢ۬ᩳ;->ᩳ:Ll/ܺۙᩳ;

    .line 329
    new-instance v1, Ll/֡᩹ᩳ;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    const/4 v2, 0x0

    invoke-static {v0, p1, v2, v1}, Ll/ᩳۗᩳ;->֫(Ll/ܺۙᩳ;IZLjava/lang/Runnable;)V

    .line 24
    iget-object p0, p0, Ll/ۢ۬ᩳ;->ܽ:Ll/ܺۙᩳ;

    .line 329
    new-instance v0, Ll/֡᩹ᩳ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    const/4 v1, 0x1

    invoke-static {p0, p1, v1, v0}, Ll/ᩳۗᩳ;->֫(Ll/ܺۙᩳ;IZLjava/lang/Runnable;)V

    return-void
.end method

.method public static bridge synthetic ۧ(Ll/ܳۗᩳ;)Ll/᩸۬ᩳ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܳۗᩳ;->ۧ:Ll/᩸۬ᩳ;

    return-object p0
.end method

.method public static bridge synthetic ܽ(Ll/ܳۗᩳ;)Ll/ܳ᩹ᩳ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܳۗᩳ;->ܽ:Ll/ܳ᩹ᩳ;

    return-object p0
.end method


# virtual methods
.method public final ֫(Ll/ۖۙᩳ;)J
    .locals 13

    .line 43
    iget-object v0, p1, Ll/ۖۙᩳ;->ۧ:Ll/ۢ۬ᩳ;

    iget-object v0, v0, Ll/ۢ۬ᩳ;->ᩳ:Ll/ܺۙᩳ;

    iget-object v0, v0, Ll/ܺۙᩳ;->᩸:Ll/ۢۙᩳ;

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1}, Ll/ܳۗᩳ;->֫(Ll/ۢۙᩳ;Z)J

    move-result-wide v2

    .line 44
    iget-object v0, p1, Ll/ۖۙᩳ;->ۧ:Ll/ۢ۬ᩳ;

    iget-object v0, v0, Ll/ۢ۬ᩳ;->ܽ:Ll/ܺۙᩳ;

    iget-object v0, v0, Ll/ܺۙᩳ;->᩸:Ll/ۢۙᩳ;

    invoke-direct {p0, v0, v1}, Ll/ܳۗᩳ;->֫(Ll/ۢۙᩳ;Z)J

    move-result-wide v4

    .line 45
    iget-object v0, p0, Ll/ܳۗᩳ;->ۧ:Ll/᩸۬ᩳ;

    iget-object v0, v0, Ll/᩸۬ᩳ;->ۙ:Ll/֨۬ᩳ;

    iget-object v0, v0, Ll/֨۬ᩳ;->ܿ:Ljava/lang/Object;

    monitor-enter v0

    .line 46
    :try_start_0
    new-instance v6, Ll/ۤۜܽ;

    const/16 v7, 0x48

    invoke-direct {v6, v7}, Ll/ۤۜܽ;-><init>(I)V

    .line 47
    invoke-virtual {v6, v1}, Ll/ۤۜܽ;->writeInt(I)V

    .line 48
    invoke-virtual {v6, v1}, Ll/ۤۜܽ;->writeInt(I)V

    .line 49
    invoke-virtual {v6, v2, v3}, Ll/ۤۜܽ;->ۧ(J)V

    .line 50
    invoke-virtual {v6, v4, v5}, Ll/ۤۜܽ;->ۧ(J)V

    .line 51
    iget-object v1, p1, Ll/ۖۙᩳ;->ۧ:Ll/ۢ۬ᩳ;

    iget-wide v1, v1, Ll/ۢ۬ᩳ;->ۧ:J

    invoke-virtual {v6, v1, v2}, Ll/ۤۜܽ;->ۧ(J)V

    .line 52
    iget-wide v1, p1, Ll/ۖۙᩳ;->֫:J

    invoke-virtual {v6, v1, v2}, Ll/ۤۜܽ;->ۧ(J)V

    .line 53
    iget-wide v1, p1, Ll/ۖۙᩳ;->ᩳ:J

    invoke-virtual {v6, v1, v2}, Ll/ۤۜܽ;->ۧ(J)V

    .line 54
    iget-wide v1, p1, Ll/ۖۙᩳ;->ܽ:J

    invoke-virtual {v6, v1, v2}, Ll/ۤۜܽ;->ۧ(J)V

    .line 55
    iget-object v1, p1, Ll/ۖۙᩳ;->ܿ:Ll/ۚۗᩳ;

    invoke-virtual {v1}, Ll/ۚۗᩳ;->ܽ()I

    move-result v1

    invoke-virtual {v6, v1}, Ll/ۤۜܽ;->writeInt(I)V

    .line 56
    iget-object v1, p1, Ll/ۖۙᩳ;->ܿ:Ll/ۚۗᩳ;

    invoke-virtual {v1}, Ll/ۚۗᩳ;->֫()I

    move-result v1

    invoke-virtual {v6, v1}, Ll/ۤۜܽ;->writeInt(I)V

    .line 57
    iget-object p1, p1, Ll/ۖۙᩳ;->ۧ:Ll/ۢ۬ᩳ;

    iget-boolean p1, p1, Ll/ۢ۬ᩳ;->֫:Z

    invoke-virtual {v6, p1}, Ll/ۤۜܽ;->writeInt(I)V

    const/4 p1, 0x0

    .line 58
    invoke-virtual {v6, p1}, Ll/ۤۜܽ;->writeInt(I)V

    .line 141
    iget-object v7, p0, Ll/ܳۗᩳ;->ۧ:Ll/᩸۬ᩳ;

    invoke-virtual {v7}, Ll/᩸۬ᩳ;->ᩳ()J

    move-result-wide v8

    .line 494
    invoke-virtual {v6}, Ll/ۤۜܽ;->ܽ()[B

    move-result-object v10

    invoke-virtual {v6}, Ll/ۤۜܽ;->size()I

    move-result v12

    const/4 v11, 0x5

    invoke-virtual/range {v7 .. v12}, Ll/᩸۬ᩳ;->ܽ(J[BII)J

    move-result-wide v1

    .line 59
    monitor-exit v0

    return-wide v1

    :catchall_0
    move-exception p1

    .line 60
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final ֫(JJILl/ܿ᩹ᩳ;)Ll/ۖۙᩳ;
    .locals 28

    move-object/from16 v1, p0

    move/from16 v0, p5

    .line 150
    iget-object v2, v1, Ll/ܳۗᩳ;->֫:Ljava/lang/Runnable;

    new-instance v10, Ll/ᩳۗᩳ;

    move-object/from16 v3, p6

    invoke-direct {v10, v1, v3}, Ll/ᩳۗᩳ;-><init>(Ll/ܳۗᩳ;Ll/ܿ᩹ᩳ;)V

    .line 151
    invoke-virtual/range {p6 .. p6}, Ll/ܿ᩹ᩳ;->֫()V

    move-wide/from16 v11, p1

    move-wide/from16 v3, p3

    .line 152
    invoke-virtual {v10, v11, v12, v3, v4}, Ll/ᩳۗᩳ;->ۧ(JJ)Ll/ۧۗᩳ;

    move-result-object v13

    .line 153
    :try_start_0
    iget-object v3, v13, Ll/ۧۗᩳ;->᩸:Ll/۬ۜܽ;

    .line 154
    iget v4, v13, Ll/ۧۗᩳ;->᩶:I

    const/16 v5, 0x48

    if-ne v4, v5, :cond_2

    invoke-virtual {v3}, Ll/۬ۜܽ;->readInt()I

    move-result v4

    const/4 v5, 0x1

    if-ne v4, v5, :cond_2

    invoke-virtual {v3}, Ll/۬ۜܽ;->readInt()I

    move-result v4

    if-ne v4, v5, :cond_2

    .line 155
    invoke-virtual {v3}, Ll/۬ۜܽ;->readLong()J

    move-result-wide v6

    invoke-virtual {v3}, Ll/۬ۜܽ;->readLong()J

    move-result-wide v14

    invoke-virtual {v3}, Ll/۬ۜܽ;->readLong()J

    move-result-wide v16

    .line 156
    invoke-virtual {v3}, Ll/۬ۜܽ;->readLong()J

    move-result-wide v21

    invoke-virtual {v3}, Ll/۬ۜܽ;->readLong()J

    move-result-wide v23

    invoke-virtual {v3}, Ll/۬ۜܽ;->readLong()J

    move-result-wide v25

    .line 157
    invoke-virtual {v10, v3}, Ll/ᩳۗᩳ;->֫(Ll/۬ۜܽ;)Ll/ۚۗᩳ;

    move-result-object v20

    .line 158
    invoke-virtual {v3}, Ll/۬ۜܽ;->readInt()I

    move-result v9

    const-wide/16 v18, 0x0

    cmp-long v4, v16, v18

    if-lez v4, :cond_1

    cmp-long v4, v21, v18

    if-ltz v4, :cond_1

    cmp-long v4, v23, v21

    if-ltz v4, :cond_1

    cmp-long v4, v25, v18

    if-ltz v4, :cond_1

    if-ltz v9, :cond_1

    if-gt v9, v5, :cond_1

    .line 160
    invoke-virtual/range {v20 .. v20}, Ll/ۚۗᩳ;->ܽ()I

    move-result v4

    if-gt v4, v0, :cond_1

    invoke-virtual/range {v20 .. v20}, Ll/ۚۗᩳ;->֫()I

    move-result v4

    if-gt v4, v0, :cond_1

    invoke-virtual {v3}, Ll/۬ۜܽ;->readInt()I

    move-result v4

    if-nez v4, :cond_1

    invoke-virtual {v3}, Ll/۬ۜܽ;->available()J

    move-result-wide v3

    cmp-long v5, v3, v18

    if-nez v5, :cond_1

    .line 198
    new-instance v8, Ll/ܺۙᩳ;

    const/16 v18, 0x1

    const/4 v4, 0x0

    move-object v3, v10

    move-wide v5, v6

    move-object/from16 v27, v8

    move-wide/from16 v7, p1

    move v1, v9

    move/from16 v9, v18

    invoke-virtual/range {v3 .. v9}, Ll/ᩳۗᩳ;->֫(IJJZ)Ll/ۢۙᩳ;

    move-result-object v3

    move-object/from16 v9, v27

    invoke-direct {v9, v3}, Ll/ܺۙᩳ;-><init>(Ll/ۢۙᩳ;)V

    new-instance v7, Ll/ܺۙᩳ;

    const/16 v18, 0x1

    const/4 v4, 0x0

    move-object v3, v10

    move-wide v5, v14

    move-object v14, v7

    move-wide/from16 v7, p1

    move-object v11, v9

    move/from16 v9, v18

    invoke-virtual/range {v3 .. v9}, Ll/ᩳۗᩳ;->֫(IJJZ)Ll/ۢۙᩳ;

    move-result-object v3

    invoke-direct {v14, v3}, Ll/ܺۙᩳ;-><init>(Ll/ۢۙᩳ;)V

    move-object v3, v10

    move-object v4, v11

    move-object v5, v14

    move-wide/from16 v6, v16

    move-wide/from16 v8, v23

    .line 165
    invoke-virtual/range {v3 .. v9}, Ll/ᩳۗᩳ;->֫(Ll/ܺۙᩳ;Ll/ܺۙᩳ;JJ)V

    const/4 v3, 0x0

    .line 166
    invoke-static {v11, v0, v3, v2}, Ll/ᩳۗᩳ;->֫(Ll/ܺۙᩳ;IZLjava/lang/Runnable;)V

    const/4 v3, 0x1

    .line 167
    invoke-static {v14, v0, v3, v2}, Ll/ᩳۗᩳ;->֫(Ll/ܺۙᩳ;IZLjava/lang/Runnable;)V

    .line 168
    new-instance v0, Ll/ۖۙᩳ;

    new-instance v19, Ll/ۢ۬ᩳ;

    if-ne v1, v3, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    move-object/from16 p1, v19

    move-object/from16 p2, v11

    move-object/from16 p3, v14

    move-wide/from16 p4, v16

    move/from16 p6, v1

    invoke-direct/range {p1 .. p6}, Ll/ۢ۬ᩳ;-><init>(Ll/ܺۙᩳ;Ll/ܺۙᩳ;JZ)V

    move-object/from16 v18, v0

    invoke-direct/range {v18 .. v26}, Ll/ۖۙᩳ;-><init>(Ll/ۢ۬ᩳ;Ll/ۚۗᩳ;JJJ)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 169
    invoke-virtual {v13}, Ll/ۧۗᩳ;->close()V

    return-object v0

    .line 161
    :cond_1
    :try_start_1
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Invalid history state metadata"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 154
    :cond_2
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Invalid history state shape"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception v0

    move-object v1, v0

    .line 152
    :try_start_2
    invoke-virtual {v13}, Ll/ۧۗᩳ;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v0

    move-object v2, v0

    invoke-virtual {v1, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_1
    throw v1
.end method
