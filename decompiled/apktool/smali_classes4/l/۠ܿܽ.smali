.class public final Ll/۠ܿܽ;
.super Ll/۠ᩳܽ;
.source "04V0"


# instance fields
.field public final ۗ:Ljava/util/ArrayList;

.field public final ۛ:Ljava/util/ArrayList;

.field public final ۤ:Ljava/util/ArrayList;

.field public final ۫:Ljava/util/ArrayList;

.field public final ۬:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Ll/ۡܿܽ;ILjava/lang/String;)V
    .locals 0

    .line 29
    invoke-direct {p0, p1}, Ll/۠ᩳܽ;-><init>(Ll/ۡᩳܽ;)V

    .line 22
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Ll/۠ܿܽ;->ۤ:Ljava/util/ArrayList;

    .line 23
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Ll/۠ܿܽ;->ۛ:Ljava/util/ArrayList;

    .line 24
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Ll/۠ܿܽ;->ۗ:Ljava/util/ArrayList;

    .line 25
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Ll/۠ܿܽ;->۫:Ljava/util/ArrayList;

    .line 26
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Ll/۠ܿܽ;->۬:Ljava/util/ArrayList;

    .line 30
    iput p2, p0, Ll/۠ᩳܽ;->᩶:I

    .line 31
    iput-object p3, p0, Ll/۠ᩳܽ;->ۙ:Ljava/lang/String;

    return-void
.end method

.method public static synthetic ֫(Ll/᩶ܿܽ;)Ll/ܿ᩺ᩴ;
    .locals 0

    .line 224
    iget-object p0, p0, Ll/᩶ܿܽ;->۬:Ljava/util/ArrayList;

    invoke-static {p0}, Ll/ۚ۬ᩴ;->stream(Ljava/util/Collection;)Ll/ܿ᩺ᩴ;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final bridge synthetic getType(I)Ll/֡᩻ܽ;
    .locals 0

    .line 21
    invoke-virtual {p0, p1}, Ll/۠ܿܽ;->getType(I)Ll/᩶ܿܽ;

    move-result-object p1

    return-object p1
.end method

.method public final getType(Ljava/lang/String;)Ll/֡᩻ܽ;
    .locals 0

    .line 300
    invoke-super {p0, p1}, Ll/۠ᩳܽ;->getType(Ljava/lang/String;)Ll/֡᩻ܽ;

    move-result-object p1

    check-cast p1, Ll/᩶ܿܽ;

    return-object p1
.end method

.method public final getType(I)Ll/᩶ܿܽ;
    .locals 1

    .line 295
    iget-object v0, p0, Ll/۠ܿܽ;->ۛ:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/᩶ܿܽ;

    return-object p1
.end method

.method public final ֡()I
    .locals 1

    .line 315
    iget-object v0, p0, Ll/۠ܿܽ;->۬:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public final ֨֫()I
    .locals 1

    .line 325
    iget-object v0, p0, Ll/۠ܿܽ;->۫:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public final ֫(Ljava/lang/String;Ljava/lang/String;)Ll/֡ܿܽ;
    .locals 5

    .line 126
    iget-object v0, p0, Ll/۠ܿܽ;->۬:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/֡ܿܽ;

    .line 127
    invoke-virtual {v2}, Ll/ۘᩳܽ;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 128
    invoke-virtual {v2}, Ll/ۘᩳܽ;->ᩴۧ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    return-object v2

    .line 130
    :cond_1
    invoke-virtual {v2}, Ll/ۘᩳܽ;->ᩴۧ()Ljava/lang/String;

    move-result-object v0

    .line 17
    new-instance v1, Ljava/lang/RuntimeException;

    const-string v2, "\", whose actor is \""

    const-string v3, "\" not \""

    const-string v4, "There is already a overlay with name \""

    .line 0
    invoke-static {v4, p1, v2, v0, v3}, Ll/ۗ᩵֫;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    const-string v0, "\""

    invoke-static {p1, p2, v0}, Ll/ۡᩳۢ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 17
    invoke-direct {v1, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 135
    :cond_2
    new-instance v1, Ll/֡ܿܽ;

    invoke-direct {v1, p1, p2}, Ll/֡ܿܽ;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 136
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object v1
.end method

.method public final ֫()Ll/ۢ᩻ܽ;
    .locals 1

    .line 360
    invoke-super {p0}, Ll/۠ᩳܽ;->֫()Ll/ۢ᩻ܽ;

    move-result-object v0

    check-cast v0, Ll/ۡܿܽ;

    return-object v0
.end method

.method public final ֫(I)V
    .locals 5

    const/4 v0, 0x0

    .line 90
    :goto_0
    iget-object v1, p0, Ll/۠ܿܽ;->ۛ:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v0, v2, :cond_2

    .line 91
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩶ܿܽ;

    invoke-virtual {v2}, Ll/ۤᩳܽ;->ۘ֫()I

    move-result v2

    if-ne v2, p1, :cond_1

    .line 92
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 93
    iget-object v0, p0, Ll/۠ܿܽ;->ۤ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    const-string v2, "?"

    if-ne p1, v1, :cond_0

    .line 94
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result p1

    add-int/lit8 p1, p1, -0x1

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 95
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result p1

    :goto_1
    add-int/lit8 p1, p1, -0x1

    if-ltz p1, :cond_2

    .line 96
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    add-int/lit8 v4, p1, 0x1

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 97
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    goto :goto_1

    :cond_0
    add-int/lit8 v1, p1, -0x1

    .line 102
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method public final ֫(ILjava/lang/String;)V
    .locals 4

    .line 111
    iget-object v0, p0, Ll/۠ܿܽ;->ۗ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩵ܿܽ;

    .line 112
    invoke-virtual {v2}, Ll/ܺᩳܽ;->᩻()I

    move-result v3

    if-ne v3, p1, :cond_0

    .line 113
    invoke-virtual {v2}, Ll/ܺᩳܽ;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    return-void

    .line 115
    :cond_1
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v2}, Ll/ܺᩳܽ;->getPackageName()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const/4 p1, 0x1

    aput-object v0, v1, p1

    const/4 p1, 0x2

    aput-object p2, v1, p1

    .line 17
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "There is already a library with id of 0x%02x, named \"%s\" not \"%s\""

    invoke-static {p2, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 120
    :cond_2
    new-instance v1, Ll/᩵ܿܽ;

    .line 10
    invoke-direct {v1, p1, p2}, Ll/ܺᩳܽ;-><init>(ILjava/lang/String;)V

    .line 121
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final ֫(Ljava/lang/String;)V
    .locals 0

    .line 35
    iput-object p1, p0, Ll/۠ᩳܽ;->ۙ:Ljava/lang/String;

    return-void
.end method

.method public final ֫(Ll/ۙۜܽ;Ll/᩵ۛۡ;Ll/ۨܿܽ;)V
    .locals 16

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    move-object/from16 v2, p3

    .line 164
    iget-object v2, v2, Ll/ۨܿܽ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_c

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۛܿܽ;

    const/16 v4, 0x200

    .line 172
    invoke-interface {v0, v4}, Ll/ۙۜܽ;->֫(S)V

    const/16 v4, 0x120

    .line 173
    invoke-interface {v0, v4}, Ll/ۙۜܽ;->֫(S)V

    .line 176
    invoke-interface/range {p1 .. p1}, Ll/ۙۜܽ;->getPosition()J

    move-result-wide v5

    .line 177
    invoke-interface/range {p1 .. p1}, Ll/ۙۜܽ;->᩷ܽ()V

    .line 179
    invoke-virtual/range {p0 .. p0}, Ll/۠ᩳܽ;->᩻()I

    move-result v7

    invoke-interface {v0, v7}, Ll/ۙۜܽ;->writeInt(I)V

    .line 180
    invoke-virtual/range {p0 .. p0}, Ll/۠ᩳܽ;->getPackageName()Ljava/lang/String;

    move-result-object v7

    const/16 v8, 0x80

    invoke-interface {v0, v8, v7}, Ll/ۙۜܽ;->֫(ILjava/lang/String;)V

    const/4 v7, 0x1

    if-eqz v1, :cond_0

    .line 41
    invoke-virtual {v1, v7}, Ll/᩵ۛۡ;->֫(I)Z

    .line 187
    :cond_0
    invoke-interface {v0, v4}, Ll/ۙۜܽ;->writeInt(I)V

    const/4 v4, 0x0

    .line 189
    invoke-interface {v0, v4}, Ll/ۙۜܽ;->writeInt(I)V

    .line 191
    invoke-interface/range {p1 .. p1}, Ll/ۙۜܽ;->getPosition()J

    move-result-wide v8

    .line 192
    invoke-interface/range {p1 .. p1}, Ll/ۙۜܽ;->᩷ܽ()V

    .line 193
    invoke-interface {v0, v4}, Ll/ۙۜܽ;->writeInt(I)V

    .line 194
    invoke-interface {v0, v4}, Ll/ۙۜܽ;->writeInt(I)V

    .line 197
    new-instance v4, Ll/۬ܿܽ;

    invoke-direct {v4}, Ll/۬ܿܽ;-><init>()V

    .line 198
    invoke-virtual {v4, v7}, Ll/۬ܿܽ;->֫(Z)V

    .line 199
    new-instance v7, Ljava/util/HashSet;

    invoke-direct {v7}, Ljava/util/HashSet;-><init>()V

    .line 200
    iget-object v10, v3, Ll/ۛܿܽ;->ܽ:Ljava/util/ArrayList;

    invoke-virtual {v10}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :goto_1
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_1

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ll/᩶ܿܽ;

    invoke-virtual {v12}, Ll/ۤᩳܽ;->getTypeName()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v7, v12}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 201
    :cond_1
    invoke-virtual {v10}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :goto_2
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_4

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ll/᩶ܿܽ;

    .line 202
    :goto_3
    invoke-virtual {v4}, Ll/۬ܿܽ;->size()I

    move-result v13

    invoke-virtual {v12}, Ll/ۤᩳܽ;->ۘ֫()I

    move-result v14

    add-int/lit8 v14, v14, -0x1

    if-ge v13, v14, :cond_3

    .line 203
    new-instance v13, Ljava/lang/StringBuilder;

    const-string v14, "?"

    invoke-direct {v13, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4}, Ll/۬ܿܽ;->size()I

    move-result v15

    add-int/lit8 v15, v15, 0x1

    invoke-virtual {v13, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    .line 205
    :goto_4
    invoke-virtual {v7, v13}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_2

    .line 0
    invoke-static {v13, v14}, Ll/ܺܶۡ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    goto :goto_4

    .line 206
    :cond_2
    invoke-virtual {v4, v13}, Ll/۬ܿܽ;->ۧ(Ljava/lang/String;)V

    goto :goto_3

    .line 208
    :cond_3
    invoke-virtual {v12}, Ll/ۤᩳܽ;->getTypeName()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v4, v12}, Ll/۬ܿܽ;->ۧ(Ljava/lang/String;)V

    goto :goto_2

    :cond_4
    const/4 v7, 0x0

    const/4 v11, 0x0

    .line 209
    invoke-virtual {v4, v0, v11, v7}, Ll/۬ܿܽ;->֫(Ll/ۙۜܽ;ZLl/᩵ۛۡ;)V

    if-eqz v1, :cond_5

    const/4 v4, 0x1

    .line 41
    invoke-virtual {v1, v4}, Ll/᩵ۛۡ;->֫(I)Z

    .line 217
    :cond_5
    invoke-interface/range {p1 .. p1}, Ll/ۙۜܽ;->getPosition()J

    move-result-wide v11

    .line 218
    invoke-interface {v0, v8, v9}, Ll/ۙۜܽ;->seek(J)V

    sub-long v8, v11, v5

    const-wide/16 v13, 0x4

    add-long/2addr v8, v13

    long-to-int v4, v8

    .line 219
    invoke-interface {v0, v4}, Ll/ۙۜܽ;->writeInt(I)V

    .line 220
    invoke-interface {v0, v11, v12}, Ll/ۙۜܽ;->seek(J)V

    .line 223
    invoke-static {v10}, Ll/ۚ۬ᩴ;->stream(Ljava/util/Collection;)Ll/ܿ᩺ᩴ;

    move-result-object v4

    new-instance v8, Ll/ۨۜܳ;

    const/4 v9, 0x1

    invoke-direct {v8, v9}, Ll/ۨۜܳ;-><init>(I)V

    .line 224
    invoke-interface {v4, v8}, Ll/ܿ᩺ᩴ;->flatMap(Ljava/util/function/Function;)Ll/ܿ᩺ᩴ;

    move-result-object v4

    new-instance v8, Ll/֨ܿܽ;

    const/4 v9, 0x0

    invoke-direct {v8, v9}, Ll/֨ܿܽ;-><init>(I)V

    .line 225
    invoke-interface {v4, v8}, Ll/ܿ᩺ᩴ;->filter(Ljava/util/function/Predicate;)Ll/ܿ᩺ᩴ;

    move-result-object v4

    .line 226
    invoke-interface {v4}, Ll/ܿ᩺ᩴ;->distinct()Ll/ܿ᩺ᩴ;

    move-result-object v4

    .line 227
    invoke-static {}, Ll/᩺ۨᩴ;->toList()Ll/ۨۨᩴ;

    move-result-object v8

    invoke-interface {v4, v8}, Ll/ܿ᩺ᩴ;->collect(Ll/ۨۨᩴ;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    .line 228
    new-instance v8, Ll/۫ܿܽ;

    invoke-direct {v8}, Ll/۫ܿܽ;-><init>()V

    .line 229
    new-instance v9, Ll/۬ܿܽ;

    invoke-direct {v9}, Ll/۬ܿܽ;-><init>()V

    const/4 v11, 0x1

    .line 230
    invoke-virtual {v9, v11}, Ll/۬ܿܽ;->֫(Z)V

    .line 232
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    const/4 v11, 0x0

    :goto_5
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_6

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/String;

    .line 233
    invoke-virtual {v9, v12}, Ll/۬ܿܽ;->ۧ(Ljava/lang/String;)V

    add-int/lit8 v15, v11, 0x1

    .line 234
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-virtual {v8, v12, v11}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move v11, v15

    goto :goto_5

    :cond_6
    const/4 v4, 0x0

    .line 209
    invoke-virtual {v9, v0, v4, v7}, Ll/۬ܿܽ;->֫(Ll/ۙۜܽ;ZLl/᩵ۛۡ;)V

    if-eqz v1, :cond_7

    const/4 v4, 0x1

    .line 41
    invoke-virtual {v1, v4}, Ll/᩵ۛۡ;->֫(I)Z

    .line 243
    :cond_7
    invoke-virtual {v10}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_6
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_8

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/᩶ܿܽ;

    .line 244
    invoke-virtual {v7, v0, v8, v1}, Ll/᩶ܿܽ;->֫(Ll/ۙۜܽ;Ll/۫ܿܽ;Ll/᩵ۛۡ;)V

    goto :goto_6

    :cond_8
    move-object/from16 v7, p0

    .line 305
    iget-object v4, v7, Ll/۠ܿܽ;->ۗ:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v8

    if-lez v8, :cond_9

    const/16 v8, 0x203

    .line 249
    invoke-interface {v0, v8}, Ll/ۙۜܽ;->֫(S)V

    const/16 v8, 0xc

    .line 250
    invoke-interface {v0, v8}, Ll/ۙۜܽ;->֫(S)V

    .line 305
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v9

    mul-int/lit16 v9, v9, 0x104

    add-int/2addr v9, v8

    .line 251
    invoke-interface {v0, v9}, Ll/ۙۜܽ;->writeInt(I)V

    .line 305
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v4

    .line 252
    invoke-interface {v0, v4}, Ll/ۙۜܽ;->writeInt(I)V

    .line 345
    invoke-virtual/range {p0 .. p0}, Ll/۠ᩳܽ;->ܽ()Ljava/lang/Iterable;

    move-result-object v4

    .line 253
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_7
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_9

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll/᩵ܿܽ;

    .line 22
    invoke-virtual {v8}, Ll/ܺᩳܽ;->᩻()I

    move-result v9

    invoke-interface {v0, v9}, Ll/ۙۜܽ;->writeInt(I)V

    .line 23
    invoke-virtual {v8}, Ll/ܺᩳܽ;->getPackageName()Ljava/lang/String;

    move-result-object v8

    const/16 v9, 0x80

    invoke-interface {v0, v9, v8}, Ll/ۙۜܽ;->֫(ILjava/lang/String;)V

    goto :goto_7

    .line 259
    :cond_9
    iget-object v4, v3, Ll/ۛܿܽ;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_8
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_a

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll/֡ܿܽ;

    .line 260
    invoke-virtual {v8, v0}, Ll/֡ܿܽ;->֫(Ll/ۙۜܽ;)V

    goto :goto_8

    .line 264
    :cond_a
    iget-object v3, v3, Ll/ۛܿܽ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_9
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_b

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ܶܿܽ;

    .line 265
    invoke-virtual {v4, v0}, Ll/ܶܿܽ;->֫(Ll/ۙۜܽ;)V

    goto :goto_9

    .line 268
    :cond_b
    invoke-interface/range {p1 .. p1}, Ll/ۙۜܽ;->getPosition()J

    move-result-wide v3

    .line 269
    invoke-interface {v0, v5, v6}, Ll/ۙۜܽ;->seek(J)V

    sub-long v5, v3, v5

    add-long/2addr v5, v13

    long-to-int v6, v5

    .line 270
    invoke-interface {v0, v6}, Ll/ۙۜܽ;->writeInt(I)V

    .line 271
    invoke-interface {v0, v3, v4}, Ll/ۙۜܽ;->seek(J)V

    goto/16 :goto_0

    :cond_c
    move-object/from16 v7, p0

    return-void
.end method

.method public final ֫(Ll/ۤܽܽ;)V
    .locals 1

    .line 283
    iget-object v0, p0, Ll/۠ᩳܽ;->᩹:Ll/ۤܽܽ;

    if-eq p1, v0, :cond_1

    .line 290
    iget-object v0, p0, Ll/۠ܿܽ;->ۛ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 284
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Cannot change config layout of populated package"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 285
    :cond_1
    :goto_0
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Ll/۠ᩳܽ;->᩹:Ll/ۤܽܽ;

    return-void
.end method

.method public final ۖ(I)Ll/ۡ᩻ܽ;
    .locals 1

    .line 310
    iget-object v0, p0, Ll/۠ܿܽ;->ۗ:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/᩵ܿܽ;

    return-object p1
.end method

.method public final ۗ()I
    .locals 1

    .line 290
    iget-object v0, p0, Ll/۠ܿܽ;->ۛ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public final ۜ()Ll/ܶܿܽ;
    .locals 2

    .line 141
    new-instance v0, Ll/ܶܿܽ;

    invoke-direct {v0}, Ll/ܶܿܽ;-><init>()V

    .line 142
    iget-object v1, p0, Ll/۠ܿܽ;->۫:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method public final ۜ(I)Ll/ᩴ᩻ܽ;
    .locals 1

    .line 330
    iget-object v0, p0, Ll/۠ܿܽ;->۫:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ܶܿܽ;

    return-object p1
.end method

.method public final ۜۧ()Ljava/util/List;
    .locals 1

    .line 335
    iget-object v0, p0, Ll/۠ܿܽ;->ۤ:Ljava/util/ArrayList;

    return-object v0
.end method

.method public final ۠֫()I
    .locals 1

    .line 305
    iget-object v0, p0, Ll/۠ܿܽ;->ۗ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public final ۡ()V
    .locals 1

    .line 147
    iget-object v0, p0, Ll/۠ܿܽ;->۬:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    return-void
.end method

.method public final ۧ(ILjava/lang/String;)Ll/᩶ܿܽ;
    .locals 7

    .line 44
    iget-object v0, p0, Ll/۠ܿܽ;->ۛ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩶ܿܽ;

    .line 45
    invoke-virtual {v2}, Ll/ۤᩳܽ;->ۘ֫()I

    move-result v5

    if-ne v5, p1, :cond_0

    .line 46
    invoke-virtual {v2}, Ll/ۤᩳܽ;->getTypeName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    return-object v2

    .line 49
    :cond_1
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v2}, Ll/ۤᩳܽ;->getTypeName()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    aput-object p1, v1, v3

    aput-object v0, v1, v4

    const/4 p1, 0x2

    aput-object p2, v1, p1

    .line 17
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "There is already a type with id of 0x%02x, named \"%s\" not \"%s\""

    invoke-static {p2, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    add-int/lit8 v1, p1, -0x1

    .line 54
    iget-object v2, p0, Ll/۠ܿܽ;->ۤ:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v5

    if-ge v1, v5, :cond_3

    .line 55
    invoke-virtual {v2, v1, p2}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 59
    :cond_3
    :goto_0
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v5

    if-le v1, v5, :cond_4

    .line 60
    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "?"

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v6

    add-int/2addr v6, v4

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 62
    :cond_4
    invoke-virtual {v2, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 64
    :goto_1
    new-instance p2, Ll/᩶ܿܽ;

    invoke-direct {p2, p0, p1}, Ll/᩶ܿܽ;-><init>(Ll/۠ܿܽ;I)V

    .line 66
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    sub-int/2addr v1, v4

    :goto_2
    if-ltz v1, :cond_6

    .line 67
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩶ܿܽ;

    invoke-virtual {v2}, Ll/ۤᩳܽ;->ۘ֫()I

    move-result v2

    if-ge v2, p1, :cond_5

    add-int/2addr v1, v4

    .line 68
    invoke-virtual {v0, v1, p2}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    return-object p2

    :cond_5
    add-int/lit8 v1, v1, -0x1

    goto :goto_2

    .line 74
    :cond_6
    invoke-virtual {v0, v3, p2}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    return-object p2
.end method

.method public final ۬()V
    .locals 2

    .line 340
    invoke-virtual {p0}, Ll/۠ᩳܽ;->ܳ()Ljava/lang/Iterable;

    move-result-object v0

    .line 275
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩶ܿܽ;

    .line 276
    invoke-virtual {v1}, Ll/᩶ܿܽ;->ܶ()V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final ܶ()Ll/᩶ܿܽ;
    .locals 1

    const-string v0, "id"

    .line 300
    invoke-super {p0, v0}, Ll/۠ᩳܽ;->getType(Ljava/lang/String;)Ll/֡᩻ܽ;

    move-result-object v0

    check-cast v0, Ll/᩶ܿܽ;

    return-object v0
.end method

.method public final ᩴ(I)Ll/ܺ᩻ܽ;
    .locals 1

    .line 320
    iget-object v0, p0, Ll/۠ܿܽ;->۬:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/֡ܿܽ;

    return-object p1
.end method

.method public final ᩵()V
    .locals 1

    .line 151
    iget-object v0, p0, Ll/۠ܿܽ;->۫:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    return-void
.end method

.method public final ᩶()Ll/᩶ܿܽ;
    .locals 5

    .line 79
    iget-object v0, p0, Ll/۠ܿܽ;->ۛ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const-string v3, "c"

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩶ܿܽ;

    .line 80
    invoke-virtual {v2}, Ll/ۤᩳܽ;->getTypeName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    return-object v2

    .line 83
    :cond_1
    iget-object v1, p0, Ll/۠ܿܽ;->ۤ:Ljava/util/ArrayList;

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 84
    new-instance v2, Ll/᩶ܿܽ;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-direct {v2, p0, v1}, Ll/᩶ܿܽ;-><init>(Ll/۠ܿܽ;I)V

    .line 85
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object v2
.end method
