.class public final Ll/۠ۜܽ;
.super Ljava/lang/Object;
.source "UAOJ"


# static fields
.field public static final ֫:[C

.field public static final ۧ:[I


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const/high16 v0, 0x656e0000

    const v1, 0x656e8400

    .line 211
    filled-new-array {v0, v1}, [I

    move-result-object v0

    sput-object v0, Ll/۠ۜܽ;->ۧ:[I

    const/4 v0, 0x2

    new-array v0, v0, [C

    .line 216
    fill-array-data v0, :array_0

    sput-object v0, Ll/۠ۜܽ;->֫:[C

    return-void

    :array_0
    .array-data 2
        0x65s
        0x6es
    .end array-data
.end method

.method public static ֫([C[C)I
    .locals 3

    const/4 v0, 0x0

    .line 16
    aget-char v1, p0, v0

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x18

    const/4 v2, 0x1

    aget-char p0, p0, v2

    and-int/lit16 p0, p0, 0xff

    shl-int/lit8 p0, p0, 0x10

    or-int/2addr p0, v1

    aget-char v0, p1, v0

    and-int/lit16 v0, v0, 0xff

    shl-int/lit8 v0, v0, 0x8

    or-int/2addr p0, v0

    aget-char p1, p1, v2

    and-int/lit16 p1, p1, 0xff

    or-int/2addr p0, p1

    return p0
.end method

.method public static ֫([C[C[CLjava/lang/String;[C)I
    .locals 15

    move-object v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v6, p3

    const/4 v3, 0x0

    .line 123
    aget-char v4, v0, v3

    aget-char v5, v1, v3

    const/4 v7, 0x1

    if-ne v4, v5, :cond_0

    aget-char v4, v0, v7

    aget-char v5, v1, v7

    if-ne v4, v5, :cond_0

    return v3

    .line 126
    :cond_0
    invoke-static {v2, p0}, Ll/۠ۜܽ;->֫([C[C)I

    move-result v0

    .line 127
    invoke-static {v2, v1}, Ll/۠ۜܽ;->֫([C[C)I

    move-result v1

    move-object/from16 v4, p4

    .line 128
    invoke-static {v2, v4}, Ll/۠ۜܽ;->֫([C[C)I

    move-result v2

    const v4, 0x65734d58

    const v5, 0x65735553

    if-eq v0, v5, :cond_2

    if-ne v0, v4, :cond_1

    goto :goto_0

    :cond_1
    const/4 v8, 0x0

    goto :goto_1

    :cond_2
    :goto_0
    const/4 v8, 0x1

    :goto_1
    if-eq v1, v5, :cond_3

    if-ne v1, v4, :cond_4

    :cond_3
    const/4 v3, 0x1

    :cond_4
    const v4, 0x6573a424

    if-eqz v8, :cond_5

    if-nez v3, :cond_5

    if-eq v1, v4, :cond_5

    const v0, 0x6573a424

    move v9, v1

    const v8, 0x6573a424

    goto :goto_2

    :cond_5
    if-eqz v3, :cond_6

    if-nez v8, :cond_6

    if-eq v0, v4, :cond_6

    const v1, 0x6573a424

    move v8, v0

    const v9, 0x6573a424

    goto :goto_2

    :cond_6
    move v8, v0

    move v9, v1

    :goto_2
    const/4 v0, 0x4

    new-array v10, v0, [I

    .line 143
    new-instance v11, Ll/᩸ۜܽ;

    invoke-direct {v11}, Ll/᩸ۜܽ;-><init>()V

    const/4 v5, 0x2

    .line 145
    filled-new-array {v8, v9}, [I

    move-result-object v4

    move-object v0, v10

    move-object v1, v11

    move-object/from16 v3, p3

    .line 146
    invoke-static/range {v0 .. v5}, Ll/۠ۜܽ;->֫([ILl/᩸ۜܽ;ILjava/lang/String;[II)I

    move-result v12

    .line 150
    invoke-virtual {v11}, Ll/᩸ۜܽ;->֫()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-nez v4, :cond_7

    return v7

    .line 153
    :cond_7
    invoke-virtual {v11}, Ll/᩸ۜܽ;->֫()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    const-wide/16 v13, 0x1

    cmp-long v2, v0, v13

    if-nez v2, :cond_8

    const/4 v0, -0x1

    return v0

    .line 86
    :cond_8
    new-instance v7, Ll/᩸ۜܽ;

    invoke-direct {v7}, Ll/᩸ۜܽ;-><init>()V

    const/4 v0, 0x0

    move-object v1, v7

    move v2, v8

    move-object/from16 v3, p3

    move-object v4, v10

    move v5, v12

    .line 87
    invoke-static/range {v0 .. v5}, Ll/۠ۜܽ;->֫([ILl/᩸ۜܽ;ILjava/lang/String;[II)I

    move-result v0

    int-to-long v0, v0

    .line 96
    invoke-virtual {v7}, Ll/᩸ۜܽ;->֫()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    add-long/2addr v2, v0

    sub-long/2addr v2, v13

    long-to-int v7, v2

    .line 86
    new-instance v11, Ll/᩸ۜܽ;

    invoke-direct {v11}, Ll/᩸ۜܽ;-><init>()V

    const/4 v0, 0x0

    move-object v1, v11

    move v2, v9

    move-object/from16 v3, p3

    .line 87
    invoke-static/range {v0 .. v5}, Ll/۠ۜܽ;->֫([ILl/᩸ۜܽ;ILjava/lang/String;[II)I

    move-result v0

    int-to-long v0, v0

    .line 96
    invoke-virtual {v11}, Ll/᩸ۜܽ;->֫()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    add-long/2addr v2, v0

    sub-long/2addr v2, v13

    long-to-int v0, v2

    if-eq v7, v0, :cond_9

    sub-int/2addr v0, v7

    return v0

    .line 169
    :cond_9
    invoke-static {v8, v6}, Ll/۠ۜܽ;->֫(ILjava/lang/String;)Z

    move-result v0

    .line 170
    invoke-static {v9, v6}, Ll/۠ۜܽ;->֫(ILjava/lang/String;)Z

    move-result v1

    if-eq v0, v1, :cond_a

    sub-int/2addr v0, v1

    return v0

    :cond_a
    sub-int/2addr v9, v8

    return v9
.end method

.method public static ֫([ILl/᩸ۜܽ;ILjava/lang/String;[II)I
    .locals 4

    const/4 v0, 0x0

    :cond_0
    if-eqz p0, :cond_1

    .line 67
    aput p2, p0, v0

    :cond_1
    add-int/lit8 v0, v0, 0x1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, p5, :cond_3

    .line 71
    aget v2, p4, v1

    if-ne v2, p2, :cond_2

    int-to-long p2, v1

    .line 72
    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p0

    invoke-virtual {p1, p0}, Ll/᩸ۜܽ;->֫(Ljava/lang/Long;)V

    return v0

    :cond_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_3
    const v1, 0xffff

    and-int/2addr v1, p2

    if-eqz v1, :cond_6

    .line 33
    sget-object v1, Ll/ܶۜܽ;->ܳ:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    .line 34
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {p3, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    .line 35
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map;

    .line 36
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    if-eqz v1, :cond_5

    .line 38
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result p2

    goto :goto_1

    :cond_5
    const/high16 v1, -0x10000

    and-int/2addr p2, v1

    goto :goto_1

    :cond_6
    const/4 p2, 0x0

    :goto_1
    if-nez p2, :cond_0

    const-wide/16 p2, -0x1

    .line 78
    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p0

    invoke-virtual {p1, p0}, Ll/᩸ۜܽ;->֫(Ljava/lang/Long;)V

    return v0
.end method

.method public static ֫([C[C[C)V
    .locals 4

    const/4 v0, 0x0

    .line 182
    aget-char v1, p1, v0

    if-nez v1, :cond_0

    .line 184
    invoke-static {p0, v0}, Ljava/util/Arrays;->fill([CC)V

    return-void

    .line 187
    :cond_0
    invoke-static {p1, p2}, Ll/۠ۜܽ;->֫([C[C)I

    move-result p1

    .line 188
    sget-object v1, Ll/ܶۜܽ;->ܽ:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Character;

    const/4 v3, 0x4

    if-nez v2, :cond_2

    .line 191
    aget-char p2, p2, v0

    if-eqz p2, :cond_1

    const/high16 p2, -0x10000

    and-int/2addr p1, p2

    .line 193
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Character;

    if-eqz p1, :cond_1

    .line 196
    sget-object p2, Ll/ܶۜܽ;->ܿ:[[C

    invoke-virtual {p1}, Ljava/lang/Character;->charValue()C

    move-result p1

    aget-object p1, p2, p1

    invoke-static {p1, v0, p0, v0, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-void

    .line 202
    :cond_1
    invoke-static {p0, v0}, Ljava/util/Arrays;->fill([CC)V

    return-void

    .line 207
    :cond_2
    sget-object p1, Ll/ܶۜܽ;->ܿ:[[C

    invoke-virtual {v2}, Ljava/lang/Character;->charValue()C

    move-result p2

    aget-object p1, p1, p2

    invoke-static {p1, v0, p0, v0, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-void
.end method

.method public static ֫(ILjava/lang/String;)Z
    .locals 6

    int-to-long v0, p0

    const/16 p0, 0x20

    shl-long/2addr v0, p0

    const/4 p0, 0x0

    .line 102
    invoke-virtual {p1, p0}, Ljava/lang/String;->charAt(I)C

    move-result p0

    int-to-long v2, p0

    const-wide/16 v4, 0xff

    and-long/2addr v2, v4

    const/16 p0, 0x18

    shl-long/2addr v2, p0

    or-long/2addr v0, v2

    const/4 p0, 0x1

    .line 103
    invoke-virtual {p1, p0}, Ljava/lang/String;->charAt(I)C

    move-result p0

    int-to-long v2, p0

    and-long/2addr v2, v4

    const/16 p0, 0x10

    shl-long/2addr v2, p0

    or-long/2addr v0, v2

    const/4 p0, 0x2

    .line 104
    invoke-virtual {p1, p0}, Ljava/lang/String;->charAt(I)C

    move-result p0

    int-to-long v2, p0

    and-long/2addr v2, v4

    const/16 p0, 0x8

    shl-long/2addr v2, p0

    or-long/2addr v0, v2

    const/4 p0, 0x3

    .line 105
    invoke-virtual {p1, p0}, Ljava/lang/String;->charAt(I)C

    move-result p0

    int-to-long p0, p0

    and-long/2addr p0, v4

    or-long/2addr p0, v0

    .line 106
    sget-object v0, Ll/ܶۜܽ;->ᩳ:Ljava/util/Set;

    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p0

    invoke-interface {v0, p0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static ֫([C)Z
    .locals 7

    .line 221
    sget-object v0, Ll/۠ۜܽ;->֫:[C

    invoke-static {v0, p0}, Ll/۠ۜܽ;->֫([C[C)I

    move-result v3

    .line 222
    new-instance p0, Ll/᩸ۜܽ;

    invoke-direct {p0}, Ll/᩸ۜܽ;-><init>()V

    .line 223
    sget-object v5, Ll/۠ۜܽ;->ۧ:[I

    const/4 v6, 0x2

    const/4 v1, 0x0

    const-string v4, "Latn"

    move-object v2, p0

    invoke-static/range {v1 .. v6}, Ll/۠ۜܽ;->֫([ILl/᩸ۜܽ;ILjava/lang/String;[II)I

    .line 225
    invoke-virtual {p0}, Ll/᩸ۜܽ;->֫()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Long;

    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long p0, v0, v2

    if-nez p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method
