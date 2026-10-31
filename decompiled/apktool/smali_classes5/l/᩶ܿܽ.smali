.class public final Ll/᩶ܿܽ;
.super Ll/ۤᩳܽ;
.source "84S9"


# instance fields
.field public final ۗ:Ljava/util/ArrayList;

.field public final ۬:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Ll/۠ܿܽ;I)V
    .locals 0

    .line 24
    invoke-direct {p0, p1, p2}, Ll/ۤᩳܽ;-><init>(Ll/۠ᩳܽ;I)V

    .line 20
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Ll/᩶ܿܽ;->ۗ:Ljava/util/ArrayList;

    .line 25
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Ll/᩶ܿܽ;->۬:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/String;)I
    .locals 1

    .line 97
    iget-object v0, p0, Ll/᩶ܿܽ;->۬:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 98
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result p1

    add-int/lit8 p1, p1, -0x1

    return p1
.end method

.method public final ֫(Ll/ܶ᩻ܽ;)I
    .locals 3

    const/4 v0, 0x0

    .line 183
    :goto_0
    iget-object v1, p0, Ll/᩶ܿܽ;->۬:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v0, v2, :cond_1

    .line 184
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 186
    invoke-interface {p1, v1}, Ll/ܶ᩻ܽ;->֫(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    return v0

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, -0x1

    return p1
.end method

.method public final ֫(Ll/᩸ܽܽ;)Ll/ۖܿܽ;
    .locals 4

    .line 55
    iget-object v0, p0, Ll/᩶ܿܽ;->ۗ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۖܿܽ;

    .line 56
    invoke-virtual {v2}, Ll/ۜᩳܽ;->۟()Ll/᩸ܽܽ;

    move-result-object v3

    invoke-virtual {v3, p1}, Ll/᩸ܽܽ;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    return-object v2

    .line 59
    :cond_1
    new-instance v1, Ll/ۖܿܽ;

    invoke-direct {v1, p0, p1}, Ll/ۖܿܽ;-><init>(Ll/᩶ܿܽ;Ll/᩸ܽܽ;)V

    .line 60
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object v1
.end method

.method public final ֫()Ll/ۢ᩻ܽ;
    .locals 1

    .line 301
    invoke-super {p0}, Ll/ۤᩳܽ;->֫()Ll/ۢ᩻ܽ;

    move-result-object v0

    check-cast v0, Ll/ۡܿܽ;

    return-object v0
.end method

.method public final ֫(I)V
    .locals 2

    .line 165
    iget-object v0, p0, Ll/᩶ܿܽ;->۬:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge p1, v1, :cond_0

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const-string v0, "Please add entry with id of "

    const-string v1, " first"

    .line 0
    invoke-static {p1, v0, v1}, Ll/ᩳ᩷ᩳ;->֫(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 13
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ֫(ILjava/lang/String;)V
    .locals 2

    .line 150
    iget-object v0, p0, Ll/᩶ܿܽ;->۬:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge p1, v1, :cond_0

    .line 153
    invoke-virtual {v0, p1, p2}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_0
    const-string p2, "Please add entry with id of "

    const-string v0, " first"

    .line 0
    invoke-static {p1, p2, v0}, Ll/ᩳ᩷ᩳ;->֫(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 13
    new-instance p2, Ljava/lang/RuntimeException;

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public final ֫(ILjava/lang/String;Z)V
    .locals 3

    const/high16 v0, 0x10000

    if-ge p1, v0, :cond_5

    .line 109
    iget-object v0, p0, Ll/᩶ܿܽ;->۬:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-lt p1, v1, :cond_1

    .line 110
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result p3

    sub-int/2addr p1, p3

    :goto_0
    if-lez p1, :cond_0

    const/4 p3, 0x0

    .line 111
    invoke-virtual {v0, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 p1, p1, -0x1

    goto :goto_0

    .line 112
    :cond_0
    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    .line 114
    :cond_1
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    if-nez v1, :cond_2

    .line 116
    invoke-virtual {v0, p1, p2}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_2
    if-nez p3, :cond_4

    .line 117
    invoke-virtual {v1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_3

    goto :goto_1

    .line 119
    :cond_3
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p0}, Ll/ۤᩳܽ;->getTypeName()Ljava/lang/String;

    move-result-object p3

    const/4 v0, 0x4

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v0, v2

    const/4 p1, 0x1

    aput-object v1, v0, p1

    const/4 p1, 0x2

    aput-object p2, v0, p1

    const/4 p1, 0x3

    aput-object p3, v0, p1

    .line 17
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "There is already a entry with id of 0x%04x, named \"%s\" not \"%s\". (%s)"

    invoke-static {p2, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    :goto_1
    return-void

    .line 107
    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "id > 0xFFFF"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(Ll/ۖܿܽ;)V
    .locals 1

    .line 142
    iget-object v0, p0, Ll/᩶ܿܽ;->ۗ:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public final ֫(Ll/ۖܿܽ;Ll/᩸ܽܽ;)V
    .locals 3

    .line 65
    invoke-virtual {p1}, Ll/ۖܿܽ;->getType()Ll/᩶ܿܽ;

    move-result-object v0

    if-ne v0, p0, :cond_3

    .line 67
    iget-object v0, p0, Ll/᩶ܿܽ;->ۗ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۖܿܽ;

    .line 68
    invoke-virtual {v2}, Ll/ۜᩳܽ;->۟()Ll/᩸ܽܽ;

    move-result-object v2

    invoke-virtual {v2, p2}, Ll/᩸ܽܽ;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    .line 69
    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    const-string v0, "Config flags exists: "

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2}, Ll/᩸ܽܽ;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 13
    new-instance p2, Ljava/lang/RuntimeException;

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p2

    .line 72
    :cond_1
    new-instance v1, Ll/ۖܿܽ;

    invoke-direct {v1, p0, p2}, Ll/ۖܿܽ;-><init>(Ll/᩶ܿܽ;Ll/᩸ܽܽ;)V

    .line 73
    invoke-virtual {p1}, Ll/ۖܿܽ;->ۚ֫()Z

    move-result p2

    invoke-virtual {v1, p2}, Ll/ۖܿܽ;->ۧ(Z)V

    .line 74
    invoke-virtual {p1}, Ll/ۖܿܽ;->᩷ۧ()Z

    move-result p2

    invoke-virtual {v1, p2}, Ll/ۖܿܽ;->֫(Z)V

    .line 75
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 76
    invoke-virtual {p1}, Ll/ۜᩳܽ;->ᩳ()Ljava/lang/Iterable;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/᩷᩻ܽ;

    .line 77
    invoke-interface {p2}, Ll/᩷᩻ܽ;->ۚۧ()I

    move-result v0

    invoke-virtual {v1, v0}, Ll/ۖܿܽ;->֫(I)Ll/ᩴܿܽ;

    move-result-object v0

    invoke-virtual {v0, p2}, Ll/ᩴܿܽ;->֫(Ll/᩷᩻ܽ;)V

    goto :goto_1

    :cond_2
    return-void

    .line 13
    :cond_3
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "The entry being copied must belong to this type"

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(Ll/ۙۜܽ;Ll/۫ܿܽ;Ll/᩵ۛۡ;)V
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p3

    .line 271
    iget-object v3, v0, Ll/᩶ܿܽ;->۬:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    const/16 v4, 0x202

    .line 203
    invoke-interface {v1, v4}, Ll/ۙۜܽ;->֫(S)V

    const/16 v4, 0x10

    .line 204
    invoke-interface {v1, v4}, Ll/ۙۜܽ;->֫(S)V

    mul-int/lit8 v5, v3, 0x4

    add-int/2addr v5, v4

    .line 205
    invoke-interface {v1, v5}, Ll/ۙۜܽ;->writeInt(I)V

    .line 206
    invoke-virtual/range {p0 .. p0}, Ll/ۤᩳܽ;->ۘ֫()I

    move-result v4

    invoke-interface {v1, v4}, Ll/ۙۜܽ;->writeByte(I)V

    const/4 v4, 0x0

    .line 207
    invoke-interface {v1, v4}, Ll/ۙۜܽ;->writeByte(I)V

    .line 276
    iget-object v5, v0, Ll/᩶ܿܽ;->ۗ:Ljava/util/ArrayList;

    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v6

    const v7, 0xffff

    .line 209
    invoke-static {v6, v7}, Ljava/lang/Math;->min(II)I

    move-result v6

    invoke-interface {v1, v6}, Ll/ۙۜܽ;->ۡ(I)V

    .line 210
    invoke-interface {v1, v3}, Ll/ۙۜܽ;->writeInt(I)V

    if-eqz v2, :cond_0

    const/4 v6, 0x1

    .line 41
    invoke-virtual {v2, v6}, Ll/᩵ۛۡ;->֫(I)Z

    .line 217
    :cond_0
    new-array v6, v3, [I

    .line 218
    new-array v7, v3, [Ll/᩸ܽܽ;

    .line 286
    invoke-virtual/range {p0 .. p0}, Ll/ۤᩳܽ;->ܽ()Ljava/lang/Iterable;

    move-result-object v8

    .line 219
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :cond_1
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    const/high16 v10, 0x40000000    # 2.0f

    if-eqz v9, :cond_4

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ll/ۜ᩻ܽ;

    .line 220
    invoke-interface {v9}, Ll/ۜ᩻ܽ;->۟()Ll/᩸ܽܽ;

    move-result-object v11

    .line 221
    invoke-interface {v9}, Ll/ۜ᩻ܽ;->ᩳ()Ljava/lang/Iterable;

    move-result-object v9

    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :cond_2
    :goto_0
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_1

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ll/᩷᩻ܽ;

    .line 222
    invoke-interface {v12}, Ll/᩷᩻ܽ;->ۚۧ()I

    move-result v13

    .line 223
    aget-object v14, v7, v13

    if-nez v14, :cond_3

    .line 225
    aput-object v11, v7, v13

    goto :goto_1

    .line 228
    :cond_3
    aget v15, v6, v13

    invoke-virtual {v14, v11}, Ll/᩸ܽܽ;->ۧ(Ll/᩸ܽܽ;)I

    move-result v14

    or-int/2addr v14, v15

    aput v14, v6, v13

    .line 230
    :goto_1
    invoke-interface {v12}, Ll/᩷᩻ܽ;->ۛ֫()Z

    move-result v12

    if-eqz v12, :cond_2

    .line 231
    aget v12, v6, v13

    or-int/2addr v12, v10

    aput v12, v6, v13

    goto :goto_0

    :cond_4
    :goto_2
    if-ge v4, v3, :cond_7

    .line 237
    aget-object v8, v7, v4

    if-nez v8, :cond_5

    goto :goto_3

    .line 238
    :cond_5
    aget v8, v6, v4

    and-int/2addr v8, v10

    if-eqz v8, :cond_6

    invoke-virtual {v0, v4}, Ll/ۤᩳܽ;->ܳ(I)Z

    move-result v8

    if-eqz v8, :cond_6

    .line 239
    aget v8, v6, v4

    const/high16 v9, 0x20000000

    or-int/2addr v8, v9

    aput v8, v6, v4

    .line 241
    :cond_6
    aget v8, v6, v4

    invoke-virtual {v0, v4}, Ll/ۤᩳܽ;->᩷(I)I

    move-result v9

    or-int/2addr v8, v9

    aput v8, v6, v4

    :goto_3
    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    .line 243
    :cond_7
    invoke-interface {v1, v6}, Ll/ۙۜܽ;->֫([I)V

    .line 246
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3, v5}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 247
    new-instance v4, Ll/᩹ܿܽ;

    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    invoke-static {v3, v4}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 249
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_4
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_8

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ۖܿܽ;

    move-object/from16 v5, p2

    .line 250
    invoke-virtual {v4, v1, v5, v2}, Ll/ۖܿܽ;->֫(Ll/ۙۜܽ;Ll/۫ܿܽ;Ll/᩵ۛۡ;)V

    goto :goto_4

    :cond_8
    return-void
.end method

.method public final ۜ()Ll/۫ܿܽ;
    .locals 5

    .line 171
    new-instance v0, Ll/۫ܿܽ;

    iget-object v1, p0, Ll/᩶ܿܽ;->۬:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    .line 9
    invoke-direct {v0, v2}, Ljava/util/HashMap;-><init>(I)V

    const/4 v2, 0x0

    .line 172
    :goto_0
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ge v2, v3, :cond_1

    .line 173
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    if-eqz v3, :cond_0

    .line 175
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v3, v4}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public final ۜ֫()I
    .locals 1

    .line 276
    iget-object v0, p0, Ll/᩶ܿܽ;->ۗ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public final ۡ()Ll/۠ܿܽ;
    .locals 1

    .line 306
    invoke-super {p0}, Ll/ۤᩳܽ;->ۧ()Ll/ۘ᩻ܽ;

    move-result-object v0

    check-cast v0, Ll/۠ܿܽ;

    return-object v0
.end method

.method public final ۢ֫()V
    .locals 2

    .line 296
    new-instance v0, Ll/۫ᩳܽ;

    .line 179
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 296
    iget-object v1, p0, Ll/᩶ܿܽ;->ۗ:Ljava/util/ArrayList;

    invoke-static {v1, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    return-void
.end method

.method public final ۧ(Ljava/lang/String;)Ll/ۖܿܽ;
    .locals 1

    .line 306
    invoke-super {p0}, Ll/ۤᩳܽ;->ۧ()Ll/ۘ᩻ܽ;

    move-result-object v0

    check-cast v0, Ll/۠ܿܽ;

    .line 51
    invoke-virtual {v0}, Ll/۠ᩳܽ;->֫ۧ()Ll/ۤܽܽ;

    move-result-object v0

    invoke-static {p1, v0}, Ll/᩸ܽܽ;->֫(Ljava/lang/String;Ll/ۤܽܽ;)Ll/᩸ܽܽ;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/᩶ܿܽ;->֫(Ll/᩸ܽܽ;)Ll/ۖܿܽ;

    move-result-object p1

    return-object p1
.end method

.method public final ۧ()Ll/ۘ᩻ܽ;
    .locals 1

    .line 306
    invoke-super {p0}, Ll/ۤᩳܽ;->ۧ()Ll/ۘ᩻ܽ;

    move-result-object v0

    check-cast v0, Ll/۠ܿܽ;

    return-object v0
.end method

.method public final ۧ(II)V
    .locals 0

    .line 36
    invoke-virtual {p0, p1}, Ll/᩶ܿܽ;->֫(I)V

    .line 37
    invoke-virtual {p0, p1, p2}, Ll/ۤᩳܽ;->֫(II)V

    return-void
.end method

.method public final ۧ(IZ)V
    .locals 0

    .line 30
    invoke-virtual {p0, p1}, Ll/᩶ܿܽ;->֫(I)V

    .line 31
    invoke-virtual {p0, p1, p2}, Ll/ۤᩳܽ;->֫(IZ)V

    return-void
.end method

.method public final ܳ()V
    .locals 1

    .line 146
    iget-object v0, p0, Ll/᩶ܿܽ;->ۗ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    return-void
.end method

.method public final ܶ()V
    .locals 5

    .line 286
    invoke-virtual {p0}, Ll/ۤᩳܽ;->ܽ()Ljava/lang/Iterable;

    move-result-object v0

    .line 255
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۖܿܽ;

    .line 256
    invoke-virtual {v1}, Ll/ۜᩳܽ;->ᩳ()Ljava/lang/Iterable;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ᩴܿܽ;

    .line 257
    invoke-virtual {v2}, Ll/᩷ᩳܽ;->values()Ljava/lang/Iterable;

    move-result-object v2

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_2
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۙܿܽ;

    .line 258
    iget-object v4, v3, Ll/ۙܿܽ;->ۗ:Ll/ۗܿܽ;

    if-eqz v4, :cond_2

    .line 259
    invoke-virtual {v3}, Ll/ۛᩳܽ;->ᩳ֫()Z

    move-result v4

    if-eqz v4, :cond_3

    .line 260
    iget-object v3, v3, Ll/ۙܿܽ;->ۗ:Ll/ۗܿܽ;

    const/4 v4, 0x1

    .line 38
    iput-boolean v4, v3, Ll/ۗܿܽ;->ۙ:Z

    goto :goto_0

    :cond_3
    const/4 v4, 0x0

    .line 262
    iput-object v4, v3, Ll/ۙܿܽ;->ۗ:Ll/ۗܿܽ;

    goto :goto_0

    :cond_4
    return-void
.end method

.method public final ܽ(I)Ljava/lang/String;
    .locals 1

    .line 161
    iget-object v0, p0, Ll/᩶ܿܽ;->۬:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    return-object p1
.end method

.method public final ܽ(Ljava/lang/String;)V
    .locals 2

    .line 306
    invoke-super {p0}, Ll/ۤᩳܽ;->ۧ()Ll/ۘ᩻ܽ;

    move-result-object v0

    check-cast v0, Ll/۠ܿܽ;

    .line 157
    invoke-virtual {v0}, Ll/۠ܿܽ;->ۜۧ()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0}, Ll/ۤᩳܽ;->ۘ֫()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0, v1, p1}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final ܿ(I)Ll/ۖܿܽ;
    .locals 1

    .line 281
    iget-object v0, p0, Ll/᩶ܿܽ;->ۗ:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۖܿܽ;

    return-object p1
.end method

.method public final bridge synthetic ܿ(I)Ll/ۜ᩻ܽ;
    .locals 0

    .line 19
    invoke-virtual {p0, p1}, Ll/᩶ܿܽ;->ܿ(I)Ll/ۖܿܽ;

    move-result-object p1

    return-object p1
.end method

.method public final ᩳ(I)V
    .locals 2

    const/high16 v0, 0x10000

    if-le p1, v0, :cond_0

    const/high16 p1, 0x10000

    .line 86
    :cond_0
    iget-object v0, p0, Ll/᩶ܿܽ;->۬:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge p1, v1, :cond_1

    goto :goto_1

    .line 88
    :cond_1
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->ensureCapacity(I)V

    .line 89
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    sub-int/2addr p1, v1

    :goto_0
    if-lez p1, :cond_2

    const/4 v1, 0x0

    .line 90
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 p1, p1, -0x1

    goto :goto_0

    :cond_2
    :goto_1
    return-void
.end method

.method public final ᩵()I
    .locals 3

    .line 286
    invoke-virtual {p0}, Ll/ۤᩳܽ;->ܽ()Ljava/lang/Iterable;

    move-result-object v0

    .line 195
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x1

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۖܿܽ;

    .line 196
    invoke-virtual {v2}, Ll/ۖܿܽ;->ܳ()I

    move-result v2

    add-int/2addr v1, v2

    goto :goto_0

    :cond_0
    return v1
.end method

.method public final ᩷()I
    .locals 1

    .line 271
    iget-object v0, p0, Ll/᩶ܿܽ;->۬:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public final ᩻(I)V
    .locals 1

    .line 138
    iget-object v0, p0, Ll/᩶ܿܽ;->ۗ:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    return-void
.end method
