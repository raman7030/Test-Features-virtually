.class public final Ll/᩹ۨ᩻;
.super Ljava/lang/Object;
.source "4778"


# instance fields
.field public final ֫:Ll/ܶ᩵ܿ;

.field public ۧ:Z

.field public final ܽ:J

.field public final ܿ:[B

.field public final ᩳ:Ljava/util/HashMap;


# direct methods
.method public constructor <init>(Ll/ܶ᩵ܿ;J[BLjava/util/HashMap;)V
    .locals 0

    .line 52
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 53
    iput-object p1, p0, Ll/᩹ۨ᩻;->֫:Ll/ܶ᩵ܿ;

    .line 54
    iput-wide p2, p0, Ll/᩹ۨ᩻;->ܽ:J

    .line 55
    iput-object p4, p0, Ll/᩹ۨ᩻;->ܿ:[B

    .line 56
    iput-object p5, p0, Ll/᩹ۨ᩻;->ᩳ:Ljava/util/HashMap;

    return-void
.end method

.method public static ֫(JJ)J
    .locals 3

    const/4 v0, 0x0

    :goto_0
    const/16 v1, 0x8

    if-ge v0, v1, :cond_0

    mul-int/lit8 v1, v0, 0x8

    ushr-long v1, p2, v1

    long-to-int v2, v1

    and-int/lit16 v1, v2, 0xff

    int-to-long v1, v1

    xor-long/2addr p0, v1

    const-wide v1, 0x100000001b3L

    mul-long p0, p0, v1

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-wide p0
.end method

.method public static ֫(Ll/ܶ᩵ܿ;Ljava/util/ArrayList;)Ll/᩹ۨ᩻;
    .locals 17

    .line 217
    invoke-virtual/range {p1 .. p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    int-to-long v0, v0

    const-wide v2, -0x340d631b7bdddcdbL    # -7.302176725335867E57

    invoke-static {v2, v3, v0, v1}, Ll/᩹ۨ᩻;->֫(JJ)J

    move-result-wide v0

    .line 218
    invoke-virtual/range {p1 .. p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    move-wide v5, v0

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܰܳۜ;

    .line 219
    iget-object v3, v0, Ll/ܰܳۜ;->֫:Ljava/lang/String;

    .line 229
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v4

    int-to-long v7, v4

    invoke-static {v5, v6, v7, v8}, Ll/᩹ۨ᩻;->֫(JJ)J

    move-result-wide v4

    .line 230
    :goto_1
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v6

    if-ge v1, v6, :cond_0

    .line 231
    invoke-virtual {v3, v1}, Ljava/lang/String;->charAt(I)C

    move-result v6

    and-int/lit16 v7, v6, 0xff

    int-to-long v7, v7

    xor-long/2addr v4, v7

    const-wide v7, 0x100000001b3L

    mul-long v4, v4, v7

    ushr-int/lit8 v6, v6, 0x8

    int-to-long v9, v6

    xor-long/2addr v4, v9

    mul-long v4, v4, v7

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 220
    :cond_0
    iget-object v0, v0, Ll/ܰܳۜ;->ۧ:Ljava/lang/Long;

    if-nez v0, :cond_1

    const-wide/high16 v0, -0x8000000000000000L

    goto :goto_2

    :cond_1
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    :goto_2
    invoke-static {v4, v5, v0, v1}, Ll/᩹ۨ᩻;->֫(JJ)J

    move-result-wide v5

    goto :goto_0

    .line 206
    :cond_2
    new-instance v8, Ljava/util/HashMap;

    invoke-virtual/range {p1 .. p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v2, 0x2

    mul-int/lit8 v0, v0, 0x2

    invoke-direct {v8, v0}, Ljava/util/HashMap;-><init>(I)V

    const/4 v0, 0x0

    .line 207
    :goto_3
    invoke-virtual/range {p1 .. p1}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ge v0, v3, :cond_3

    move-object/from16 v3, p1

    .line 208
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ܰܳۜ;

    iget-object v4, v4, Ll/ܰܳۜ;->֫:Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-virtual {v8, v4, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v0, v0, 0x1

    goto :goto_3

    :cond_3
    move-object/from16 v3, p1

    const-string v0, "axml_kind.bin"

    move-object/from16 v4, p0

    .line 41
    invoke-virtual {v4, v0}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v0

    invoke-virtual/range {p1 .. p1}, Ljava/util/ArrayList;->size()I

    move-result v7

    .line 163
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->۠֫()Z

    move-result v9

    const/4 v10, 0x0

    if-nez v9, :cond_4

    goto :goto_5

    .line 167
    :cond_4
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->᩺֫()J

    move-result-wide v11

    int-to-long v13, v7

    const-wide/16 v15, 0x18

    add-long/2addr v15, v13

    cmp-long v9, v11, v15

    if-eqz v9, :cond_5

    goto :goto_5

    .line 171
    :cond_5
    :try_start_0
    new-instance v9, Ll/۬ۜܽ;

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ۘۧ()[B

    move-result-object v0

    invoke-direct {v9, v0}, Ll/۬ۜܽ;-><init>([B)V

    .line 172
    invoke-virtual {v9}, Ll/۬ۜܽ;->readInt()I

    move-result v0

    const v11, 0x4d415843    # 2.02736688E8f

    if-ne v0, v11, :cond_a

    invoke-virtual {v9}, Ll/۬ۜܽ;->readInt()I

    move-result v0

    const/4 v11, 0x1

    if-ne v0, v11, :cond_a

    .line 173
    invoke-virtual {v9}, Ll/۬ۜܽ;->readInt()I

    move-result v0

    if-ne v0, v7, :cond_a

    invoke-virtual {v9}, Ll/۬ۜܽ;->readLong()J

    move-result-wide v15

    cmp-long v0, v15, v5

    if-eqz v0, :cond_6

    goto :goto_5

    .line 176
    :cond_6
    invoke-virtual {v9}, Ll/۬ۜܽ;->readInt()I

    move-result v0

    if-ne v0, v7, :cond_a

    .line 177
    invoke-virtual {v9}, Ll/۬ۜܽ;->available()J

    move-result-wide v15

    cmp-long v0, v15, v13

    if-eqz v0, :cond_7

    goto :goto_5

    .line 211
    :cond_7
    new-array v0, v7, [B

    .line 212
    invoke-virtual {v9, v7, v0}, Ll/۬ۜܽ;->֫(I[B)V

    :goto_4
    if-ge v1, v7, :cond_9

    .line 194
    aget-byte v9, v0, v1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v9, :cond_8

    if-eq v9, v11, :cond_8

    if-eq v9, v2, :cond_8

    goto :goto_5

    :cond_8
    add-int/lit8 v1, v1, 0x1

    goto :goto_4

    :cond_9
    move-object v10, v0

    goto :goto_5

    :catch_0
    nop

    :cond_a
    :goto_5
    if-nez v10, :cond_b

    .line 43
    invoke-virtual/range {p1 .. p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    new-array v0, v0, [B

    move-object v7, v0

    goto :goto_6

    :cond_b
    move-object v7, v10

    .line 45
    :goto_6
    new-instance v0, Ll/᩹ۨ᩻;

    move-object v3, v0

    move-object/from16 v4, p0

    invoke-direct/range {v3 .. v8}, Ll/᩹ۨ᩻;-><init>(Ll/ܶ᩵ܿ;J[BLjava/util/HashMap;)V

    return-object v0
.end method


# virtual methods
.method public final declared-synchronized ֫(Ljava/lang/String;)I
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 63
    :try_start_0
    iget-object v1, p0, Ll/᩹ۨ᩻;->ᩳ:Ljava/util/HashMap;

    invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    .line 64
    :cond_0
    iget-object v1, p0, Ll/᩹ۨ᩻;->ܿ:[B

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    aget-byte p1, v1, p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    and-int/lit16 p1, p1, 0xff

    :goto_0
    monitor-exit v0

    return p1

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final declared-synchronized ֫()V
    .locals 7

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 86
    :try_start_0
    iget-boolean v1, p0, Ll/᩹ۨ᩻;->ۧ:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    if-nez v1, :cond_0

    .line 87
    monitor-exit v0

    return-void

    .line 89
    :cond_0
    :try_start_1
    iget-object v1, p0, Ll/᩹ۨ᩻;->֫:Ll/ܶ᩵ܿ;

    const-string v2, ".axml_kind.bin.tmp"

    invoke-virtual {v1, v2}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v1

    .line 90
    iget-object v2, p0, Ll/᩹ۨ᩻;->֫:Ll/ܶ᩵ܿ;

    const-string v3, "axml_kind.bin"

    invoke-virtual {v2, v3}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    const/4 v3, 0x0

    .line 93
    :try_start_2
    iget-object v4, p0, Ll/᩹ۨ᩻;->֫:Ll/ܶ᩵ܿ;

    invoke-virtual {v4}, Ll/ܶ᩵ܿ;->ۛ()V

    .line 94
    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->۬()Z

    .line 95
    new-instance v4, Ll/ۤۜܽ;

    iget-object v5, p0, Ll/᩹ۨ᩻;->ܿ:[B

    array-length v5, v5

    add-int/lit8 v5, v5, 0x10

    invoke-direct {v4, v5}, Ll/ۤۜܽ;-><init>(I)V

    const v5, 0x4d415843    # 2.02736688E8f

    .line 96
    invoke-virtual {v4, v5}, Ll/ۤۜܽ;->writeInt(I)V

    const/4 v5, 0x1

    .line 97
    invoke-virtual {v4, v5}, Ll/ۤۜܽ;->writeInt(I)V

    .line 98
    iget-object v5, p0, Ll/᩹ۨ᩻;->ܿ:[B

    array-length v5, v5

    invoke-virtual {v4, v5}, Ll/ۤۜܽ;->writeInt(I)V

    .line 99
    iget-wide v5, p0, Ll/᩹ۨ᩻;->ܽ:J

    invoke-virtual {v4, v5, v6}, Ll/ۤۜܽ;->ۧ(J)V

    .line 100
    iget-object v5, p0, Ll/᩹ۨ᩻;->ܿ:[B

    invoke-virtual {v4, v5}, Ll/ۤۜܽ;->ۧ([B)V

    .line 101
    invoke-virtual {v1, v4}, Ll/ܶ᩵ܿ;->֫(Ll/ۤۜܽ;)V

    .line 102
    invoke-virtual {v2}, Ll/ܶ᩵ܿ;->۬()Z

    .line 103
    invoke-virtual {v1, v2}, Ll/ܶ᩵ܿ;->ۧ(Ll/ܶ᩵ܿ;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 106
    iput-boolean v3, p0, Ll/᩹ۨ᩻;->ۧ:Z
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 108
    :try_start_3
    invoke-static {}, Ll/ܺܰۡ;->ۢ()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v2

    const/4 v3, 0x1

    goto :goto_0

    .line 104
    :cond_1
    :try_start_4
    new-instance v2, Ljava/io/IOException;

    const-string v4, "Failed to publish AXML kind cache"

    invoke-direct {v2, v4}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v2
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0
    .catch Ljava/lang/RuntimeException; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :catchall_1
    move-exception v2

    :goto_0
    if-nez v3, :cond_2

    .line 113
    :try_start_5
    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->۬()Z

    .line 115
    :cond_2
    throw v2

    .line 113
    :catch_0
    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->۬()Z
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 116
    :catch_1
    :goto_1
    monitor-exit v0

    return-void

    :catchall_2
    move-exception v1

    :try_start_6
    monitor-exit v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    throw v1
.end method

.method public final declared-synchronized ֫(Ljava/lang/String;Z)V
    .locals 4

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 71
    :try_start_0
    iget-object v1, p0, Ll/᩹ۨ᩻;->ᩳ:Ljava/util/HashMap;

    invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez p1, :cond_0

    .line 73
    monitor-exit v0

    return-void

    :cond_0
    const/4 v1, 0x1

    if-eqz p2, :cond_1

    const/4 p2, 0x2

    goto :goto_0

    :cond_1
    const/4 p2, 0x1

    :goto_0
    int-to-byte p2, p2

    .line 76
    :try_start_1
    iget-object v2, p0, Ll/᩹ۨ᩻;->ܿ:[B

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v3

    aget-byte v2, v2, v3

    if-eq v2, p2, :cond_2

    .line 77
    iget-object v2, p0, Ll/᩹ۨ᩻;->ܿ:[B

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    aput-byte p2, v2, p1

    .line 78
    iput-boolean v1, p0, Ll/᩹ۨ᩻;->ۧ:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 80
    :cond_2
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public final ۧ()Ll/᩸ۨ᩻;
    .locals 1

    .line 122
    new-instance v0, Ll/᩸ۨ᩻;

    invoke-direct {v0, p0}, Ll/᩸ۨ᩻;-><init>(Ll/᩹ۨ᩻;)V

    return-object v0
.end method
