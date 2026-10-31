.class public final Ll/ܿۚۜ;
.super Landroid/media/MediaDataSource;
.source "978U"


# static fields
.field public static final ۬:[B


# instance fields
.field public final ۗ:J

.field public final ۙ:J

.field public final ᩶:Ll/۟ܰۜ;

.field public final ᩸:J

.field public final ᩹:J


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x4

    new-array v0, v0, [B

    .line 18
    fill-array-data v0, :array_0

    sput-object v0, Ll/ܿۚۜ;->۬:[B

    return-void

    nop

    :array_0
    .array-data 1
        0x66t
        0x72t
        0x65t
        0x65t
    .end array-data
.end method

.method public constructor <init>(Ll/۟ܰۜ;JJJ)V
    .locals 0

    .line 32
    invoke-direct {p0}, Landroid/media/MediaDataSource;-><init>()V

    .line 33
    iput-object p1, p0, Ll/ܿۚۜ;->᩶:Ll/۟ܰۜ;

    .line 34
    iput-wide p2, p0, Ll/ܿۚۜ;->ۙ:J

    .line 35
    iput-wide p4, p0, Ll/ܿۚۜ;->᩸:J

    sub-long p1, p4, p2

    .line 36
    iput-wide p1, p0, Ll/ܿۚۜ;->᩹:J

    add-long/2addr p4, p6

    .line 37
    iput-wide p4, p0, Ll/ܿۚۜ;->ۗ:J

    return-void
.end method

.method private ܽ(J[BII)V
    .locals 7

    .line 75
    iget-object v0, p0, Ll/ܿۚۜ;->᩶:Ll/۟ܰۜ;

    monitor-enter v0

    .line 76
    :try_start_0
    iget-object v1, p0, Ll/ܿۚۜ;->᩶:Ll/۟ܰۜ;

    move-wide v2, p1

    move-object v4, p3

    move v5, p4

    move v6, p5

    invoke-interface/range {v1 .. v6}, Ll/۟ܰۜ;->ۧ(J[BII)V

    .line 77
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method


# virtual methods
.method public final close()V
    .locals 1

    .line 124
    iget-object v0, p0, Ll/ܿۚۜ;->᩶:Ll/۟ܰۜ;

    invoke-interface {v0}, Ljava/io/Closeable;->close()V

    return-void
.end method

.method public final getSize()J
    .locals 2

    .line 119
    iget-wide v0, p0, Ll/ܿۚۜ;->ۗ:J

    return-wide v0
.end method

.method public final readAt(J[BII)I
    .locals 25

    move-object/from16 v7, p0

    move/from16 v0, p5

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    const-wide/16 v8, 0x0

    cmp-long v1, p1, v8

    if-ltz v1, :cond_d

    .line 46
    iget-wide v1, v7, Ll/ܿۚۜ;->ۗ:J

    cmp-long v3, p1, v1

    if-gez v3, :cond_d

    if-gez v0, :cond_1

    goto/16 :goto_6

    :cond_1
    const/4 v1, 0x0

    move-wide/from16 v17, p1

    const/4 v6, 0x0

    :goto_0
    if-ge v6, v0, :cond_b

    .line 50
    iget-wide v1, v7, Ll/ܿۚۜ;->ۗ:J

    cmp-long v3, v17, v1

    if-gez v3, :cond_b

    .line 51
    iget-wide v3, v7, Ll/ܿۚۜ;->ۙ:J

    cmp-long v5, v17, v3

    if-gez v5, :cond_2

    sub-int v1, v0, v6

    int-to-long v1, v1

    sub-long v3, v3, v17

    .line 52
    invoke-static {v1, v2, v3, v4}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v1

    long-to-int v2, v1

    add-int v14, p4, v6

    .line 75
    iget-object v1, v7, Ll/ܿۚۜ;->᩶:Ll/۟ܰۜ;

    move-object/from16 v16, v1

    monitor-enter v16

    .line 76
    :try_start_0
    iget-object v10, v7, Ll/ܿۚۜ;->᩶:Ll/۟ܰۜ;

    move-wide/from16 v11, v17

    move-object/from16 v13, p3

    move v15, v2

    invoke-interface/range {v10 .. v15}, Ll/۟ܰۜ;->ۧ(J[BII)V

    .line 77
    monitor-exit v16

    goto/16 :goto_5

    :catchall_0
    move-exception v0

    monitor-exit v16
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    .line 56
    :cond_2
    iget-wide v3, v7, Ll/ܿۚۜ;->᩸:J

    cmp-long v5, v17, v3

    if-gez v5, :cond_a

    sub-int v1, v0, v6

    int-to-long v1, v1

    sub-long v3, v3, v17

    .line 57
    invoke-static {v1, v2, v3, v4}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v1

    long-to-int v2, v1

    .line 58
    iget-wide v3, v7, Ll/ܿۚۜ;->ۙ:J

    sub-long v3, v17, v3

    add-int v1, p4, v6

    const/4 v5, 0x0

    :goto_1
    if-ge v5, v2, :cond_9

    add-int v10, v1, v5

    int-to-long v11, v5

    add-long/2addr v11, v3

    .line 93
    sget-object v13, Ll/ܿۚۜ;->۬:[B

    iget-wide v14, v7, Ll/ܿۚۜ;->᩹:J

    cmp-long v16, v14, v8

    if-gtz v16, :cond_3

    goto :goto_3

    :cond_3
    const-wide v19, 0xffffffffL

    const-wide/16 v21, 0x8

    const-wide/16 v23, 0x4

    cmp-long v16, v14, v19

    if-gtz v16, :cond_5

    cmp-long v16, v11, v23

    if-gez v16, :cond_4

    long-to-int v12, v11

    rsub-int/lit8 v11, v12, 0x3

    goto :goto_2

    :cond_4
    cmp-long v14, v11, v21

    if-gez v14, :cond_8

    long-to-int v12, v11

    add-int/lit8 v12, v12, -0x4

    .line 101
    aget-byte v11, v13, v12

    goto :goto_4

    :cond_5
    cmp-long v16, v11, v23

    if-gez v16, :cond_6

    const-wide/16 v13, 0x3

    cmp-long v15, v11, v13

    if-nez v15, :cond_8

    const/4 v11, 0x1

    goto :goto_4

    :cond_6
    cmp-long v16, v11, v21

    if-gez v16, :cond_7

    long-to-int v12, v11

    add-int/lit8 v12, v12, -0x4

    .line 109
    aget-byte v11, v13, v12

    goto :goto_4

    :cond_7
    const-wide/16 v19, 0x10

    cmp-long v13, v11, v19

    if-gez v13, :cond_8

    long-to-int v12, v11

    rsub-int/lit8 v11, v12, 0xf

    :goto_2
    mul-int/lit8 v11, v11, 0x8

    shr-long v11, v14, v11

    long-to-int v12, v11

    int-to-byte v11, v12

    goto :goto_4

    :cond_8
    :goto_3
    const/4 v11, 0x0

    .line 85
    :goto_4
    aput-byte v11, p3, v10

    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_9
    :goto_5
    int-to-long v3, v2

    add-long v17, v17, v3

    add-int/2addr v6, v2

    goto/16 :goto_0

    :cond_a
    sub-int v3, v0, v6

    int-to-long v3, v3

    sub-long v1, v1, v17

    .line 62
    invoke-static {v3, v4, v1, v2}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v1

    long-to-int v10, v1

    add-int v5, p4, v6

    move-object/from16 v1, p0

    move-wide/from16 v2, v17

    move-object/from16 v4, p3

    move v11, v6

    move v6, v10

    .line 63
    invoke-direct/range {v1 .. v6}, Ll/ܿۚۜ;->ܽ(J[BII)V

    int-to-long v1, v10

    add-long v17, v17, v1

    add-int v6, v11, v10

    goto/16 :goto_0

    :cond_b
    move v11, v6

    if-nez v11, :cond_c

    goto :goto_6

    :cond_c
    return v11

    :cond_d
    :goto_6
    const/4 v0, -0x1

    return v0
.end method
