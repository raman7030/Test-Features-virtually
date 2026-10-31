.class public final Ll/᩺ܶᩳ;
.super Ljava/lang/Object;
.source "MB3E"


# instance fields
.field public ֫:Ll/ܶ᩵ܿ;

.field public ۧ:Ll/۫ܽܽ;

.field public ܳ:I

.field public ܽ:I

.field public ܿ:Z

.field public ᩳ:Ljava/util/Map;

.field public ᩻:I


# direct methods
.method public constructor <init>(IIZILl/ܶ᩵ܿ;Ll/۫ܽܽ;Ljava/util/Map;)V
    .locals 0

    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 36
    iput p1, p0, Ll/᩺ܶᩳ;->᩻:I

    .line 37
    iput p2, p0, Ll/᩺ܶᩳ;->ܽ:I

    .line 38
    iput-boolean p3, p0, Ll/᩺ܶᩳ;->ܿ:Z

    .line 39
    iput p4, p0, Ll/᩺ܶᩳ;->ܳ:I

    .line 40
    iput-object p6, p0, Ll/᩺ܶᩳ;->ۧ:Ll/۫ܽܽ;

    .line 41
    iput-object p5, p0, Ll/᩺ܶᩳ;->֫:Ll/ܶ᩵ܿ;

    .line 42
    iput-object p7, p0, Ll/᩺ܶᩳ;->ᩳ:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>(Ll/۬ۜܽ;)V
    .locals 13

    .line 45
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 46
    invoke-virtual {p1}, Ll/۬ۜܽ;->readByte()B

    move-result v0

    and-int/lit16 v0, v0, 0xff

    iput v0, p0, Ll/᩺ܶᩳ;->᩻:I

    .line 47
    invoke-virtual {p1}, Ll/۬ۜܽ;->ۛۧ()I

    move-result v0

    iput v0, p0, Ll/᩺ܶᩳ;->ܽ:I

    .line 48
    invoke-virtual {p1}, Ll/۬ۜܽ;->ܳ()Z

    move-result v0

    iput-boolean v0, p0, Ll/᩺ܶᩳ;->ܿ:Z

    const/4 v0, 0x1

    .line 49
    invoke-virtual {p1, v0}, Ll/۬ۜܽ;->skipBytes(I)V

    .line 50
    invoke-virtual {p1}, Ll/۬ۜܽ;->readInt()I

    move-result v0

    iput v0, p0, Ll/᩺ܶᩳ;->ܳ:I

    .line 51
    invoke-virtual {p1}, Ll/۬ۜܽ;->᩵()Ljava/lang/String;

    move-result-object v0

    .line 52
    invoke-virtual {p1}, Ll/۬ۜܽ;->ܳ()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    new-array v2, v2, [Ljava/lang/String;

    .line 54
    invoke-static {v0, v2}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;[Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v0

    iput-object v0, p0, Ll/᩺ܶᩳ;->֫:Ll/ܶ᩵ܿ;

    :cond_0
    if-eqz v1, :cond_2

    .line 57
    iget-object v0, p0, Ll/᩺ܶᩳ;->֫:Ll/ܶ᩵ܿ;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 59
    :try_start_0
    new-instance v0, Ll/۫ܽܽ;

    iget-object v1, p0, Ll/᩺ܶᩳ;->֫:Ll/ܶ᩵ܿ;

    invoke-direct {v0, v1}, Ll/۫ܽܽ;-><init>(Ll/ܶ᩵ܿ;)V

    .line 125
    invoke-virtual {v0}, Ll/۫ܽܽ;->ۧ()Ll/ܿᩳܽ;

    .line 59
    iput-object v0, p0, Ll/᩺ܶᩳ;->ۧ:Ll/۫ܽܽ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    nop

    .line 64
    :cond_1
    :goto_0
    iget-object v0, p0, Ll/᩺ܶᩳ;->ۧ:Ll/۫ܽܽ;

    if-nez v0, :cond_2

    .line 65
    new-instance v0, Ll/۫ܽܽ;

    invoke-direct {v0}, Ll/۫ܽܽ;-><init>()V

    iput-object v0, p0, Ll/᩺ܶᩳ;->ۧ:Ll/۫ܽܽ;

    .line 68
    :cond_2
    invoke-virtual {p1}, Ll/۬ۜܽ;->readInt()I

    move-result v0

    .line 69
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1, v0}, Ljava/util/HashMap;-><init>(I)V

    iput-object v1, p0, Ll/᩺ܶᩳ;->ᩳ:Ljava/util/Map;

    const/4 v1, 0x0

    :goto_1
    if-ge v1, v0, :cond_4

    .line 71
    invoke-virtual {p1}, Ll/۬ۜܽ;->᩶()Ljava/lang/String;

    move-result-object v2

    .line 72
    invoke-virtual {p1}, Ll/۬ۜܽ;->readInt()I

    move-result v3

    .line 73
    invoke-virtual {p1}, Ll/۬ۜܽ;->readInt()I

    move-result v4

    .line 74
    invoke-virtual {p1}, Ll/۬ۜܽ;->᩶()Ljava/lang/String;

    move-result-object v5

    .line 75
    invoke-virtual {p1}, Ll/۬ۜܽ;->readInt()I

    move-result v6

    new-array v7, v6, [Ll/ܳᩳܽ;

    const/4 v8, 0x0

    :goto_2
    if-ge v8, v6, :cond_3

    .line 77
    new-instance v9, Ll/ܳᩳܽ;

    invoke-virtual {p1}, Ll/۬ۜܽ;->readInt()I

    move-result v10

    invoke-virtual {p1}, Ll/۬ۜܽ;->readInt()I

    move-result v11

    invoke-virtual {p1}, Ll/۬ۜܽ;->᩶()Ljava/lang/String;

    move-result-object v12

    invoke-direct {v9, v10, v11, v12}, Ll/ܳᩳܽ;-><init>(IILjava/lang/String;)V

    aput-object v9, v7, v8

    add-int/lit8 v8, v8, 0x1

    goto :goto_2

    .line 79
    :cond_3
    iget-object v6, p0, Ll/᩺ܶᩳ;->ᩳ:Ljava/util/Map;

    new-instance v8, Ll/ܽᩳܽ;

    invoke-direct {v8, v3, v5, v7, v4}, Ll/ܽᩳܽ;-><init>(ILjava/lang/String;[Ll/ܳᩳܽ;I)V

    invoke-interface {v6, v2, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_4
    return-void
.end method

.method public static ֫(IJ)V
    .locals 2

    if-ltz p0, :cond_0

    int-to-long v0, p0

    cmp-long p0, p1, v0

    if-gtz p0, :cond_0

    return-void

    .line 155
    :cond_0
    new-instance p0, Ljava/io/IOException;

    const-string p1, "Text parameters exceed recovery state limit"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public final ֫(I)I
    .locals 14

    const-wide/16 v0, 0x0

    const/4 v2, 0x0

    .line 134
    iget-object v3, p0, Ll/᩺ܶᩳ;->֫:Ll/ܶ᩵ܿ;

    if-eqz v3, :cond_1

    invoke-virtual {v3}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_0

    move-wide v3, v0

    goto :goto_0

    .line 151
    :cond_0
    invoke-static {v3, v2}, Ll/ۛۖܽ;->֫(Ljava/lang/String;Z)J

    move-result-wide v3

    :goto_0
    const-wide/16 v5, 0x10

    add-long/2addr v3, v5

    goto :goto_1

    :cond_1
    const-wide/16 v3, 0xf

    .line 135
    :goto_1
    invoke-static {p1, v3, v4}, Ll/᩺ܶᩳ;->֫(IJ)V

    .line 136
    iget-object v5, p0, Ll/᩺ܶᩳ;->ᩳ:Ljava/util/Map;

    if-eqz v5, :cond_5

    .line 137
    invoke-interface {v5}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_5

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/Map$Entry;

    .line 138
    invoke-interface {v6}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/ܽᩳܽ;

    .line 139
    invoke-interface {v6}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    if-nez v6, :cond_2

    move-wide v8, v0

    goto :goto_3

    .line 151
    :cond_2
    invoke-static {v6, v2}, Ll/ۛۖܽ;->֫(Ljava/lang/String;Z)J

    move-result-wide v8

    :goto_3
    const-wide/16 v10, 0x14

    add-long/2addr v8, v10

    .line 139
    iget-object v6, v7, Ll/ܽᩳܽ;->ۧ:Ljava/lang/String;

    .line 151
    invoke-static {v6, v2}, Ll/ۛۖܽ;->֫(Ljava/lang/String;Z)J

    move-result-wide v10

    add-long/2addr v10, v8

    add-long/2addr v10, v3

    .line 140
    invoke-static {p1, v10, v11}, Ll/᩺ܶᩳ;->֫(IJ)V

    .line 141
    iget-object v3, v7, Ll/ܽᩳܽ;->ܿ:[Ll/ܳᩳܽ;

    array-length v4, v3

    const/4 v6, 0x0

    :goto_4
    if-ge v6, v4, :cond_4

    aget-object v7, v3, v6

    .line 142
    iget-object v7, v7, Ll/ܳᩳܽ;->֫:Ljava/lang/String;

    if-nez v7, :cond_3

    move-wide v7, v0

    goto :goto_5

    .line 151
    :cond_3
    invoke-static {v7, v2}, Ll/ۛۖܽ;->֫(Ljava/lang/String;Z)J

    move-result-wide v7

    :goto_5
    const-wide/16 v12, 0xc

    add-long/2addr v7, v12

    add-long/2addr v10, v7

    .line 143
    invoke-static {p1, v10, v11}, Ll/᩺ܶᩳ;->֫(IJ)V

    add-int/lit8 v6, v6, 0x1

    goto :goto_4

    :cond_4
    move-wide v3, v10

    goto :goto_2

    :cond_5
    long-to-int p1, v3

    return p1
.end method

.method public final ֫()Ll/᩺ܶᩳ;
    .locals 10

    .line 86
    iget-object v0, p0, Ll/᩺ܶᩳ;->ᩳ:Ljava/util/Map;

    if-eqz v0, :cond_0

    .line 87
    new-instance v1, Ljava/util/HashMap;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/HashMap;-><init>(I)V

    .line 88
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    .line 89
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ܽᩳܽ;

    .line 90
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    new-instance v4, Ll/ܽᩳܽ;

    iget v5, v3, Ll/ܽᩳܽ;->ᩳ:I

    iget-object v6, v3, Ll/ܽᩳܽ;->ۧ:Ljava/lang/String;

    iget-object v7, v3, Ll/ܽᩳܽ;->ܿ:[Ll/ܳᩳܽ;

    invoke-virtual {v7}, [Ll/ܳᩳܽ;->clone()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, [Ll/ܳᩳܽ;

    iget v3, v3, Ll/ܽᩳܽ;->֫:I

    invoke-direct {v4, v5, v6, v7, v3}, Ll/ܽᩳܽ;-><init>(ILjava/lang/String;[Ll/ܳᩳܽ;I)V

    invoke-virtual {v1, v2, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :cond_1
    move-object v9, v1

    .line 93
    new-instance v0, Ll/᩺ܶᩳ;

    iget v4, p0, Ll/᩺ܶᩳ;->ܽ:I

    iget-object v7, p0, Ll/᩺ܶᩳ;->֫:Ll/ܶ᩵ܿ;

    iget-object v8, p0, Ll/᩺ܶᩳ;->ۧ:Ll/۫ܽܽ;

    iget v3, p0, Ll/᩺ܶᩳ;->᩻:I

    iget-boolean v5, p0, Ll/᩺ܶᩳ;->ܿ:Z

    iget v6, p0, Ll/᩺ܶᩳ;->ܳ:I

    move-object v2, v0

    invoke-direct/range {v2 .. v9}, Ll/᩺ܶᩳ;-><init>(IIZILl/ܶ᩵ܿ;Ll/۫ܽܽ;Ljava/util/Map;)V

    return-object v0
.end method

.method public final ֫(Ll/ۤۜܽ;)V
    .locals 6

    .line 159
    iget v0, p0, Ll/᩺ܶᩳ;->᩻:I

    invoke-virtual {p1, v0}, Ll/ۤۜܽ;->writeByte(I)V

    .line 160
    iget v0, p0, Ll/᩺ܶᩳ;->ܽ:I

    invoke-virtual {p1, v0}, Ll/ۤۜܽ;->ۡ(I)V

    .line 161
    iget-boolean v0, p0, Ll/᩺ܶᩳ;->ܿ:Z

    invoke-virtual {p1, v0}, Ll/ۤۜܽ;->֫(Z)V

    const/4 v0, 0x0

    .line 91
    invoke-virtual {p1, v0}, Ll/ۤۜܽ;->writeByte(I)V

    .line 163
    iget v1, p0, Ll/᩺ܶᩳ;->ܳ:I

    invoke-virtual {p1, v1}, Ll/ۤۜܽ;->writeInt(I)V

    .line 164
    iget-object v1, p0, Ll/᩺ܶᩳ;->֫:Ll/ܶ᩵ܿ;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v1

    :goto_0
    invoke-virtual {p1, v1}, Ll/ۤۜܽ;->֫(Ljava/lang/String;)V

    .line 165
    iget-object v1, p0, Ll/᩺ܶᩳ;->ۧ:Ll/۫ܽܽ;

    if-eqz v1, :cond_1

    const/4 v1, 0x1

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_1
    invoke-virtual {p1, v1}, Ll/ۤۜܽ;->֫(Z)V

    .line 166
    iget-object v1, p0, Ll/᩺ܶᩳ;->ᩳ:Ljava/util/Map;

    if-nez v1, :cond_2

    .line 167
    invoke-virtual {p1, v0}, Ll/ۤۜܽ;->writeInt(I)V

    return-void

    .line 169
    :cond_2
    invoke-interface {v1}, Ljava/util/Map;->size()I

    move-result v0

    invoke-virtual {p1, v0}, Ll/ۤۜܽ;->writeInt(I)V

    .line 170
    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 171
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/CharSequence;

    invoke-virtual {p1, v2}, Ll/ۤۜܽ;->֫(Ljava/lang/CharSequence;)V

    .line 172
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܽᩳܽ;

    .line 173
    iget v2, v1, Ll/ܽᩳܽ;->ᩳ:I

    invoke-virtual {p1, v2}, Ll/ۤۜܽ;->writeInt(I)V

    .line 174
    iget v2, v1, Ll/ܽᩳܽ;->֫:I

    invoke-virtual {p1, v2}, Ll/ۤۜܽ;->writeInt(I)V

    .line 175
    iget-object v2, v1, Ll/ܽᩳܽ;->ۧ:Ljava/lang/String;

    invoke-virtual {p1, v2}, Ll/ۤۜܽ;->֫(Ljava/lang/CharSequence;)V

    .line 176
    iget-object v1, v1, Ll/ܽᩳܽ;->ܿ:[Ll/ܳᩳܽ;

    .line 177
    array-length v2, v1

    invoke-virtual {p1, v2}, Ll/ۤۜܽ;->writeInt(I)V

    .line 178
    array-length v2, v1

    const/4 v3, 0x0

    :goto_2
    if-ge v3, v2, :cond_3

    aget-object v4, v1, v3

    .line 179
    iget v5, v4, Ll/ܳᩳܽ;->ۧ:I

    invoke-virtual {p1, v5}, Ll/ۤۜܽ;->writeInt(I)V

    .line 180
    iget v5, v4, Ll/ܳᩳܽ;->ܽ:I

    invoke-virtual {p1, v5}, Ll/ۤۜܽ;->writeInt(I)V

    .line 181
    iget-object v4, v4, Ll/ܳᩳܽ;->֫:Ljava/lang/String;

    invoke-virtual {p1, v4}, Ll/ۤۜܽ;->֫(Ljava/lang/CharSequence;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    :cond_4
    return-void
.end method

.method public final ۧ()Z
    .locals 2

    .line 124
    iget v0, p0, Ll/᩺ܶᩳ;->᩻:I

    const/16 v1, 0xfe

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ܽ()Z
    .locals 2

    .line 120
    iget v0, p0, Ll/᩺ܶᩳ;->᩻:I

    const/16 v1, 0xff

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ᩳ()Z
    .locals 2

    .line 128
    iget v0, p0, Ll/᩺ܶᩳ;->᩻:I

    const/16 v1, 0xfd

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
