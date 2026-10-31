.class public final Ll/᩵ۘᩳ;
.super Ljava/lang/Object;
.source "Q6TQ"


# instance fields
.field public final ֫:Ljava/util/TreeMap;


# direct methods
.method public constructor <init>(Ljava/util/TreeMap;)V
    .locals 3

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    iput-object p1, p0, Ll/᩵ۘᩳ;->֫:Ljava/util/TreeMap;

    const-string v0, "filePath"

    .line 21
    invoke-virtual {p1, v0}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, Ljava/lang/String;

    if-eqz v0, :cond_4

    const-string v0, "pageMode"

    .line 22
    invoke-virtual {p1, v0}, Ljava/util/TreeMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p1, v0}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, Ljava/lang/Boolean;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Invalid legacy page mode"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 23
    :cond_1
    :goto_0
    invoke-virtual {p0}, Ll/᩵ۘᩳ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_3

    const-string v0, "pageCount"

    .line 24
    invoke-virtual {p1, v0}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Ljava/lang/Integer;

    if-eqz v1, :cond_2

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const/4 v2, 0x1

    if-lt v1, v2, :cond_2

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const/16 v2, 0x400

    if-gt v1, v2, :cond_2

    const-string v1, "currentPageIndex"

    .line 25
    invoke-virtual {p1, v1}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    instance-of v1, p1, Ljava/lang/Integer;

    if-eqz v1, :cond_2

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-ltz v1, :cond_2

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-ge p1, v0, :cond_2

    goto :goto_1

    .line 26
    :cond_2
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Invalid legacy page manifest"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    :goto_1
    return-void

    .line 21
    :cond_4
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Legacy config has no source path"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static ֫(IJLjava/io/InputStream;)Ll/᩵ۘᩳ;
    .locals 6

    .line 95
    invoke-static {p1, p2, p3}, Ll/᩻᩶ᩳ;->֫(JLjava/io/InputStream;)Ll/᩻᩶ᩳ;

    move-result-object p3

    if-ltz p0, :cond_c

    int-to-long v0, p0

    cmp-long v2, p1, v0

    if-gtz v2, :cond_c

    .line 97
    :try_start_0
    invoke-virtual {p3}, Ll/᩻᩶ᩳ;->readInt()I

    move-result p1

    const p2, 0x4d324643    # 1.8693432E8f

    if-ne p1, p2, :cond_b

    invoke-virtual {p3}, Ll/᩻᩶ᩳ;->readInt()I

    move-result p1

    const/4 p2, 0x1

    if-ne p1, p2, :cond_b

    .line 98
    invoke-virtual {p3}, Ll/᩻᩶ᩳ;->readInt()I

    move-result p1

    if-ltz p1, :cond_a

    int-to-long v0, p1

    .line 99
    invoke-virtual {p3}, Ll/᩻᩶ᩳ;->ܽ()J

    move-result-wide v2

    const-wide/16 v4, 0x5

    div-long/2addr v2, v4

    cmp-long v4, v0, v2

    if-gtz v4, :cond_a

    .line 100
    new-instance v0, Ljava/util/TreeMap;

    invoke-direct {v0}, Ljava/util/TreeMap;-><init>()V

    const/4 v1, 0x0

    :goto_0
    if-ge v1, p1, :cond_9

    .line 102
    invoke-virtual {p3, p0}, Ll/᩻᩶ᩳ;->֫(I)Ljava/lang/String;

    move-result-object v2

    .line 103
    invoke-virtual {v0, v2}, Ljava/util/TreeMap;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_8

    .line 105
    invoke-virtual {p3}, Ll/᩻᩶ᩳ;->readByte()I

    move-result v3

    if-eqz v3, :cond_7

    if-eq v3, p2, :cond_6

    const/4 v4, 0x2

    if-eq v3, v4, :cond_2

    const/4 v4, 0x3

    if-eq v3, v4, :cond_1

    const/4 v4, 0x4

    if-ne v3, v4, :cond_0

    .line 113
    invoke-virtual {p3}, Ll/᩻᩶ᩳ;->readLong()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    goto :goto_3

    .line 114
    :cond_0
    new-instance p0, Ljava/io/IOException;

    const-string p1, "Unsupported fragment config value"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 112
    :cond_1
    invoke-virtual {p3}, Ll/᩻᩶ᩳ;->readInt()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    goto :goto_3

    .line 109
    :cond_2
    invoke-virtual {p3}, Ll/᩻᩶ᩳ;->readByte()I

    move-result v3

    if-eqz v3, :cond_4

    const/16 v4, 0xff

    if-ne v3, v4, :cond_3

    goto :goto_1

    .line 110
    :cond_3
    new-instance p0, Ljava/io/IOException;

    const-string p1, "Invalid fragment config boolean"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_4
    :goto_1
    if-eqz v3, :cond_5

    const/4 v3, 0x1

    goto :goto_2

    :cond_5
    const/4 v3, 0x0

    .line 111
    :goto_2
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    goto :goto_3

    .line 107
    :cond_6
    invoke-virtual {p3, p0}, Ll/᩻᩶ᩳ;->֫(I)Ljava/lang/String;

    move-result-object v3

    goto :goto_3

    :cond_7
    const/4 v3, 0x0

    .line 116
    :goto_3
    invoke-virtual {v0, v2, v3}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 103
    :cond_8
    new-instance p0, Ljava/io/IOException;

    const-string p1, "Duplicate fragment config key"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 118
    :cond_9
    invoke-virtual {p3}, Ll/᩻᩶ᩳ;->ᩳ()V

    .line 119
    new-instance p0, Ll/᩵ۘᩳ;

    invoke-direct {p0, v0}, Ll/᩵ۘᩳ;-><init>(Ljava/util/TreeMap;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 120
    invoke-virtual {p3}, Ll/᩻᩶ᩳ;->close()V

    return-object p0

    .line 99
    :cond_a
    :try_start_1
    new-instance p0, Ljava/io/IOException;

    const-string p1, "Invalid fragment config entry count"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 97
    :cond_b
    new-instance p0, Ljava/io/IOException;

    const-string p1, "Unsupported fragment config format"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 96
    :cond_c
    new-instance p0, Ljava/io/IOException;

    const-string p1, "Fragment config exceeds app state limit"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception p0

    .line 95
    :try_start_2
    invoke-virtual {p3}, Ll/᩻᩶ᩳ;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_4

    :catchall_1
    move-exception p1

    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_4
    throw p0
.end method

.method public static ֫(ILandroid/os/Bundle;)Ll/᩵ۘᩳ;
    .locals 5

    .line 46
    new-instance v0, Ljava/util/TreeMap;

    invoke-direct {v0}, Ljava/util/TreeMap;-><init>()V

    .line 48
    :try_start_0
    invoke-virtual {p1}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 49
    invoke-virtual {p1, v2}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    if-eqz v2, :cond_1

    if-eqz v3, :cond_0

    .line 50
    instance-of v4, v3, Ljava/lang/String;

    if-nez v4, :cond_0

    instance-of v4, v3, Ljava/lang/Boolean;

    if-nez v4, :cond_0

    instance-of v4, v3, Ljava/lang/Integer;

    if-nez v4, :cond_0

    instance-of v4, v3, Ljava/lang/Long;

    if-eqz v4, :cond_1

    .line 52
    :cond_0
    invoke-virtual {v0, v2, v3}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 51
    :cond_1
    new-instance p0, Ljava/io/IOException;

    const-string p1, "Unsupported legacy config value type"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 55
    :cond_2
    new-instance p1, Ll/᩵ۘᩳ;

    invoke-direct {p1, v0}, Ll/᩵ۘᩳ;-><init>(Ljava/util/TreeMap;)V

    .line 56
    invoke-direct {p1, p0}, Ll/᩵ۘᩳ;->ۧ(I)I

    return-object p1

    :catch_0
    move-exception p0

    .line 54
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Invalid legacy fragment values"

    invoke-direct {p1, v0, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p1
.end method

.method private ۧ(I)I
    .locals 21

    move-object/from16 v0, p0

    move/from16 v1, p1

    .line 125
    iget-object v2, v0, Ll/᩵ۘᩳ;->֫:Ljava/util/TreeMap;

    invoke-virtual {v2}, Ljava/util/TreeMap;->entrySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    const-wide/16 v3, 0xc

    move-wide v11, v3

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    const-string v4, "Fragment config exceeds app state limit"

    if-eqz v3, :cond_5

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    .line 126
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v5

    int-to-long v5, v5

    const-wide/16 v15, 0x2

    const-wide/16 v9, 0x5

    move-wide v7, v15

    invoke-static/range {v5 .. v12}, Ll/۠ۢ֡;->֫(JJJJ)J

    move-result-wide v19

    .line 127
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    .line 128
    instance-of v5, v3, Ljava/lang/String;

    const-wide/16 v17, 0x4

    if-eqz v5, :cond_0

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    int-to-long v13, v3

    invoke-static/range {v13 .. v20}, Ll/۠ۢ֡;->֫(JJJJ)J

    move-result-wide v5

    move-wide v11, v5

    goto :goto_3

    .line 129
    :cond_0
    instance-of v5, v3, Ljava/lang/Boolean;

    if-eqz v5, :cond_1

    const-wide/16 v5, 0x1

    goto :goto_1

    .line 130
    :cond_1
    instance-of v5, v3, Ljava/lang/Integer;

    if-eqz v5, :cond_2

    add-long v19, v19, v17

    goto :goto_2

    .line 131
    :cond_2
    instance-of v3, v3, Ljava/lang/Long;

    if-eqz v3, :cond_3

    const-wide/16 v5, 0x8

    :goto_1
    add-long v19, v19, v5

    :cond_3
    :goto_2
    move-wide/from16 v11, v19

    :goto_3
    int-to-long v5, v1

    cmp-long v3, v11, v5

    if-gtz v3, :cond_4

    goto :goto_0

    .line 132
    :cond_4
    new-instance v1, Ljava/io/IOException;

    invoke-direct {v1, v4}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_5
    int-to-long v1, v1

    cmp-long v3, v11, v1

    if-gtz v3, :cond_6

    long-to-int v1, v11

    return v1

    .line 134
    :cond_6
    new-instance v1, Ljava/io/IOException;

    invoke-direct {v1, v4}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1
.end method


# virtual methods
.method public final ֫()I
    .locals 2

    .line 62
    invoke-virtual {p0}, Ll/᩵ۘᩳ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/᩵ۘᩳ;->֫:Ljava/util/TreeMap;

    const-string v1, "currentPageIndex"

    invoke-virtual {v0, v1}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ֫(I)[B
    .locals 7

    .line 81
    new-instance v0, Ll/ۤۜܽ;

    invoke-direct {p0, p1}, Ll/᩵ۘᩳ;->ۧ(I)I

    move-result p1

    invoke-direct {v0, p1}, Ll/ۤۜܽ;-><init>(I)V

    const p1, 0x4d324643    # 1.8693432E8f

    .line 82
    invoke-virtual {v0, p1}, Ll/ۤۜܽ;->writeInt(I)V

    const/4 p1, 0x1

    invoke-virtual {v0, p1}, Ll/ۤۜܽ;->writeInt(I)V

    iget-object v1, p0, Ll/᩵ۘᩳ;->֫:Ljava/util/TreeMap;

    invoke-virtual {v1}, Ljava/util/TreeMap;->size()I

    move-result v2

    invoke-virtual {v0, v2}, Ll/ۤۜܽ;->writeInt(I)V

    .line 83
    invoke-virtual {v1}, Ljava/util/TreeMap;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    .line 84
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 139
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v4

    invoke-virtual {v0, v4}, Ll/ۤۜܽ;->writeInt(I)V

    const/4 v4, 0x0

    const/4 v5, 0x0

    .line 140
    :goto_1
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v6

    if-ge v5, v6, :cond_1

    invoke-virtual {v3, v5}, Ljava/lang/String;->charAt(I)C

    move-result v6

    invoke-virtual {v0, v6}, Ll/ۤۜܽ;->ۡ(I)V

    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    .line 84
    :cond_1
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_2

    .line 85
    invoke-virtual {v0, v4}, Ll/ۤۜܽ;->writeByte(I)V

    goto :goto_0

    .line 86
    :cond_2
    instance-of v3, v2, Ljava/lang/String;

    if-eqz v3, :cond_3

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v0, p1}, Ll/ۤۜܽ;->writeByte(I)V

    .line 139
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v3

    invoke-virtual {v0, v3}, Ll/ۤۜܽ;->writeInt(I)V

    .line 140
    :goto_2
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v3

    if-ge v4, v3, :cond_0

    invoke-virtual {v2, v4}, Ljava/lang/String;->charAt(I)C

    move-result v3

    invoke-virtual {v0, v3}, Ll/ۤۜܽ;->ۡ(I)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    .line 87
    :cond_3
    instance-of v3, v2, Ljava/lang/Boolean;

    if-eqz v3, :cond_4

    check-cast v2, Ljava/lang/Boolean;

    const/4 v3, 0x2

    invoke-virtual {v0, v3}, Ll/ۤۜܽ;->writeByte(I)V

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    invoke-virtual {v0, v2}, Ll/ۤۜܽ;->֫(Z)V

    goto :goto_0

    .line 88
    :cond_4
    instance-of v3, v2, Ljava/lang/Integer;

    if-eqz v3, :cond_5

    check-cast v2, Ljava/lang/Integer;

    const/4 v3, 0x3

    invoke-virtual {v0, v3}, Ll/ۤۜܽ;->writeByte(I)V

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-virtual {v0, v2}, Ll/ۤۜܽ;->writeInt(I)V

    goto :goto_0

    :cond_5
    const/4 v3, 0x4

    .line 89
    invoke-virtual {v0, v3}, Ll/ۤۜܽ;->writeByte(I)V

    check-cast v2, Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Ll/ۤۜܽ;->ۧ(J)V

    goto/16 :goto_0

    .line 91
    :cond_6
    invoke-virtual {v0}, Ll/ۤۜܽ;->᩻()[B

    move-result-object p1

    return-object p1
.end method

.method public final ۧ()Z
    .locals 3

    .line 60
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iget-object v1, p0, Ll/᩵ۘᩳ;->֫:Ljava/util/TreeMap;

    const-string v2, "pageMode"

    invoke-virtual {v1, v2}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final ܽ()Landroid/os/Bundle;
    .locals 6

    .line 67
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 68
    iget-object v1, p0, Ll/᩵ۘᩳ;->֫:Ljava/util/TreeMap;

    invoke-virtual {v1}, Ljava/util/TreeMap;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    .line 69
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_3

    .line 70
    instance-of v4, v2, Ljava/lang/String;

    if-eqz v4, :cond_0

    goto :goto_1

    .line 71
    :cond_0
    instance-of v4, v2, Ljava/lang/Boolean;

    if-eqz v4, :cond_1

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    invoke-virtual {v0, v3, v2}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    goto :goto_0

    .line 72
    :cond_1
    instance-of v4, v2, Ljava/lang/Integer;

    if-eqz v4, :cond_2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-virtual {v0, v3, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    goto :goto_0

    .line 73
    :cond_2
    check-cast v2, Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    invoke-virtual {v0, v3, v4, v5}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    goto :goto_0

    .line 70
    :cond_3
    :goto_1
    check-cast v2, Ljava/lang/String;

    invoke-virtual {v0, v3, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_4
    const-string v1, "pageMode"

    .line 75
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    const-string v1, "pageCount"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    const-string v1, "currentPageIndex"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    return-object v0
.end method

.method public final ᩳ()I
    .locals 2

    .line 61
    invoke-virtual {p0}, Ll/᩵ۘᩳ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/᩵ۘᩳ;->֫:Ljava/util/TreeMap;

    const-string v1, "pageCount"

    invoke-virtual {v0, v1}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x1

    return v0
.end method
