.class public abstract Ll/֨᩺ۡ;
.super Ljava/lang/Object;
.source "07T7"


# static fields
.field public static ܽ:Ll/ۡ᩺ۘ;


# instance fields
.field public final ֫:Ll/ۢ֡ᩴ;

.field public final ۧ:Ll/ۢ֡ᩴ;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 23
    new-instance v0, Ll/ۖ᩺ۡ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ll/֨᩺ۡ;->ܽ:Ll/ۡ᩺ۘ;

    return-void
.end method

.method public constructor <init>(Ljava/util/Collection;)V
    .locals 20

    move-object/from16 v0, p0

    .line 51
    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    .line 48
    new-instance v1, Ll/ۢ֡ᩴ;

    sget-object v2, Ll/֨᩺ۡ;->ܽ:Ll/ۡ᩺ۘ;

    invoke-direct {v1, v2}, Ll/ۢ֡ᩴ;-><init>(Ll/ۡ᩺ۘ;)V

    iput-object v1, v0, Ll/֨᩺ۡ;->֫:Ll/ۢ֡ᩴ;

    .line 49
    new-instance v1, Ll/ۢ֡ᩴ;

    sget-object v2, Ll/֨᩺ۡ;->ܽ:Ll/ۡ᩺ۘ;

    invoke-direct {v1, v2}, Ll/ۢ֡ᩴ;-><init>(Ll/ۡ᩺ۘ;)V

    iput-object v1, v0, Ll/֨᩺ۡ;->ۧ:Ll/ۢ֡ᩴ;

    .line 79
    new-instance v1, Ll/֡᩺ۡ;

    sget-object v2, Ll/᩸ۛۡ;->ۗ:Ll/᩸ۛۡ;

    invoke-direct {v1, v2, v2}, Ll/֡᩺ۡ;-><init>(Ll/᩸ۛۡ;Ll/᩸ۛۡ;)V

    .line 81
    invoke-interface/range {p1 .. p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v3, :cond_6

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    .line 82
    invoke-virtual {v0, v3}, Ll/֨᩺ۡ;->ۧ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ll/᩸ۛۡ;->ۧ(Ljava/lang/String;)Ll/᩸ۛۡ;

    move-result-object v6

    .line 85
    invoke-virtual {v6}, Ll/᩸ۛۡ;->isEmpty()Z

    move-result v7

    if-eqz v7, :cond_1

    goto :goto_0

    .line 116
    :cond_1
    invoke-virtual {v6, v5}, Ll/᩸ۛۡ;->indexOf(I)I

    move-result v7

    const/4 v8, 0x0

    move-object v9, v1

    :goto_1
    const/4 v10, -0x1

    if-eq v7, v10, :cond_5

    add-int/lit8 v11, v7, 0x1

    .line 94
    invoke-virtual {v6, v8, v11}, Ll/᩸ۛۡ;->ܽ(II)Ll/᩸ۛۡ;

    move-result-object v12

    .line 95
    iget-object v13, v9, Ll/֡᩺ۡ;->֫:Ljava/util/Map;

    invoke-interface {v13, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ll/֡᩺ۡ;

    if-nez v13, :cond_3

    .line 97
    invoke-virtual {v6, v5, v11}, Ll/᩸ۛۡ;->ܽ(II)Ll/᩸ۛۡ;

    move-result-object v13

    .line 98
    new-instance v14, Ll/֡᩺ۡ;

    invoke-direct {v14, v13, v12}, Ll/֡᩺ۡ;-><init>(Ll/᩸ۛۡ;Ll/᩸ۛۡ;)V

    .line 411
    iget-object v13, v9, Ll/֡᩺ۡ;->֫:Ljava/util/Map;

    invoke-interface {v13, v12, v14}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 412
    iget-object v12, v9, Ll/֡᩺ۡ;->֫:Ljava/util/Map;

    invoke-interface {v12}, Ljava/util/Map;->size()I

    move-result v12

    const/16 v13, 0x14

    if-ne v12, v13, :cond_2

    .line 413
    new-instance v12, Ljava/util/HashMap;

    iget-object v13, v9, Ll/֡᩺ۡ;->֫:Ljava/util/Map;

    invoke-direct {v12, v13}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    iput-object v12, v9, Ll/֡᩺ۡ;->֫:Ljava/util/Map;

    :cond_2
    move-object v13, v14

    .line 101
    :cond_3
    invoke-virtual {v6}, Ll/᩸ۛۡ;->length()I

    move-result v12

    sub-int/2addr v12, v4

    if-ne v7, v12, :cond_4

    .line 102
    new-instance v4, Ll/᩵᩺ۡ;

    invoke-direct {v4, v0, v3}, Ll/᩵᩺ۡ;-><init>(Ll/֨᩺ۡ;Ljava/lang/Object;)V

    iput-object v4, v13, Ll/֡᩺ۡ;->ۧ:Ll/ۘ᩺ۡ;

    .line 103
    invoke-virtual {v0, v3}, Ll/֨᩺ۡ;->ᩳ(Ljava/lang/Object;)J

    move-result-wide v4

    iput-wide v4, v13, Ll/֡᩺ۡ;->ᩳ:J

    goto :goto_2

    .line 108
    :cond_4
    invoke-virtual {v6, v11}, Ll/᩸ۛۡ;->indexOf(I)I

    move-result v7

    move v8, v11

    move-object v9, v13

    goto :goto_1

    :cond_5
    :goto_2
    if-ne v7, v10, :cond_0

    .line 112
    invoke-virtual {v6, v8}, Ll/᩸ۛۡ;->ۧ(I)Ll/᩸ۛۡ;

    move-result-object v4

    .line 114
    new-instance v5, Ll/֡᩺ۡ;

    invoke-direct {v5, v6, v4}, Ll/֡᩺ۡ;-><init>(Ll/᩸ۛۡ;Ll/᩸ۛۡ;)V

    .line 115
    new-instance v6, Ll/᩵᩺ۡ;

    invoke-direct {v6, v0, v3}, Ll/᩵᩺ۡ;-><init>(Ll/֨᩺ۡ;Ljava/lang/Object;)V

    iput-object v6, v5, Ll/֡᩺ۡ;->ۧ:Ll/ۘ᩺ۡ;

    .line 116
    invoke-virtual {v0, v3}, Ll/֨᩺ۡ;->ᩳ(Ljava/lang/Object;)J

    move-result-wide v6

    iput-wide v6, v5, Ll/֡᩺ۡ;->ᩳ:J

    .line 118
    invoke-virtual {v9, v4, v5}, Ll/֡᩺ۡ;->֫(Ll/᩸ۛۡ;Ll/֡᩺ۡ;)V

    goto/16 :goto_0

    .line 162
    :cond_6
    new-instance v2, Ll/᩵֡ᩴ;

    invoke-direct {v2}, Ll/᩵֡ᩴ;-><init>()V

    .line 165
    iget-object v3, v1, Ll/֡᩺ۡ;->֫:Ljava/util/Map;

    invoke-interface {v3}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_7
    :goto_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_8

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/֡᩺ۡ;

    .line 166
    invoke-virtual {v5}, Ll/֡᩺ۡ;->֫()Z

    move-result v6

    if-eqz v6, :cond_7

    .line 167
    new-instance v6, Ll/ᩴ᩺ۡ;

    invoke-direct {v6, v5}, Ll/ᩴ᩺ۡ;-><init>(Ll/֡᩺ۡ;)V

    .line 467
    invoke-virtual {v2, v6}, Ll/᩵֡ᩴ;->add(Ljava/lang/Object;)Z

    goto :goto_3

    .line 171
    :cond_8
    :goto_4
    invoke-virtual {v2}, Ll/᩵֡ᩴ;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_12

    .line 484
    invoke-virtual {v2}, Ll/᩵֡ᩴ;->size()I

    move-result v3

    add-int/lit8 v3, v3, -0x1

    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    .line 172
    check-cast v3, Ll/ᩴ᩺ۡ;

    .line 173
    iget-object v5, v3, Ll/ᩴ᩺ۡ;->֫:Ll/֡᩺ۡ;

    .line 175
    iget-boolean v6, v3, Ll/ᩴ᩺ۡ;->ۧ:Z

    if-nez v6, :cond_b

    .line 177
    iput-boolean v4, v3, Ll/ᩴ᩺ۡ;->ۧ:Z

    .line 179
    iget-object v3, v5, Ll/֡᩺ۡ;->֫:Ljava/util/Map;

    invoke-interface {v3}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_9
    :goto_5
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_a

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/֡᩺ۡ;

    .line 180
    invoke-virtual {v4}, Ll/֡᩺ۡ;->֫()Z

    move-result v5

    if-eqz v5, :cond_9

    .line 181
    new-instance v5, Ll/ᩴ᩺ۡ;

    invoke-direct {v5, v4}, Ll/ᩴ᩺ۡ;-><init>(Ll/֡᩺ۡ;)V

    .line 467
    invoke-virtual {v2, v5}, Ll/᩵֡ᩴ;->add(Ljava/lang/Object;)Z

    goto :goto_5

    :cond_a
    move-object v15, v1

    goto/16 :goto_8

    .line 186
    :cond_b
    invoke-virtual {v2}, Ll/ᩳᩴᩴ;->pop()Ljava/lang/Object;

    .line 203
    iget-object v3, v5, Ll/֡᩺ۡ;->ۧ:Ll/ۘ᩺ۡ;

    const-wide/16 v6, 0x0

    if-nez v3, :cond_c

    .line 205
    new-instance v3, Ll/ۚ᩺ۡ;

    iget-object v4, v5, Ll/֡᩺ۡ;->ܽ:Ll/᩸ۛۡ;

    invoke-direct {v3, v0, v4}, Ll/ۚ᩺ۡ;-><init>(Ll/֨᩺ۡ;Ll/᩸ۛۡ;)V

    .line 206
    iget-object v8, v0, Ll/֨᩺ۡ;->ۧ:Ll/ۢ֡ᩴ;

    invoke-virtual {v8, v4, v3}, Ll/ۢ֡ᩴ;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 207
    iput-object v3, v5, Ll/֡᩺ۡ;->ۧ:Ll/ۘ᩺ۡ;

    const/4 v4, 0x1

    move-wide v8, v6

    goto :goto_6

    .line 212
    :cond_c
    invoke-virtual {v3}, Ll/ۘ᩺ۡ;->ᩳ()J

    move-result-wide v8

    const/4 v4, 0x0

    .line 219
    :goto_6
    iget-object v10, v5, Ll/֡᩺ۡ;->֫:Ljava/util/Map;

    invoke-interface {v10}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v10

    invoke-interface {v10}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v10

    move-wide v11, v8

    move-wide v8, v6

    :goto_7
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_10

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ll/֡᩺ۡ;

    .line 220
    iget-object v14, v13, Ll/֡᩺ۡ;->ۧ:Ll/ۘ᩺ۡ;

    move-object v15, v1

    .line 221
    iget-wide v0, v13, Ll/֡᩺ۡ;->ᩳ:J

    .line 223
    invoke-virtual {v14}, Ll/ۘ᩺ۡ;->ܽ()J

    move-result-wide v16

    const-wide/16 v18, -0x1

    cmp-long v13, v16, v18

    if-eqz v13, :cond_d

    add-long v6, v6, v16

    .line 227
    :cond_d
    invoke-virtual {v14}, Ll/ۘ᩺ۡ;->֫()J

    move-result-wide v13

    cmp-long v16, v13, v18

    if-eqz v16, :cond_e

    add-long/2addr v8, v13

    :cond_e
    cmp-long v13, v0, v11

    if-lez v13, :cond_f

    move-wide v11, v0

    :cond_f
    move-object/from16 v0, p0

    move-object v1, v15

    goto :goto_7

    :cond_10
    move-object v15, v1

    .line 238
    invoke-virtual {v3, v6, v7}, Ll/ۘ᩺ۡ;->ۧ(J)V

    .line 239
    invoke-virtual {v3, v8, v9}, Ll/ۘ᩺ۡ;->֫(J)V

    if-eqz v4, :cond_11

    .line 241
    invoke-virtual {v3, v11, v12}, Ll/ۘ᩺ۡ;->ܽ(J)V

    .line 244
    :cond_11
    iput-wide v11, v5, Ll/֡᩺ۡ;->ᩳ:J

    :goto_8
    const/4 v4, 0x1

    move-object/from16 v0, p0

    move-object v1, v15

    goto/16 :goto_4

    :cond_12
    move-object v15, v1

    .line 130
    new-instance v0, Ll/᩵֡ᩴ;

    invoke-direct {v0}, Ll/᩵֡ᩴ;-><init>()V

    .line 467
    invoke-virtual {v0, v1}, Ll/᩵֡ᩴ;->add(Ljava/lang/Object;)Z

    .line 133
    :goto_9
    invoke-virtual {v0}, Ll/᩵֡ᩴ;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_15

    .line 134
    invoke-virtual {v0}, Ll/ᩳᩴᩴ;->pop()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/֡᩺ۡ;

    .line 137
    iget-object v2, v1, Ll/֡᩺ۡ;->֫:Ljava/util/Map;

    invoke-interface {v2}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v2

    .line 138
    new-instance v3, Ljava/util/ArrayList;

    invoke-interface {v2}, Ljava/util/Collection;->size()I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 141
    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_13
    :goto_a
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_14

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/֡᩺ۡ;

    .line 142
    iget-object v5, v4, Ll/֡᩺ۡ;->ۧ:Ll/ۘ᩺ۡ;

    invoke-static {v5}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 145
    invoke-virtual {v4}, Ll/֡᩺ۡ;->֫()Z

    move-result v5

    if-eqz v5, :cond_13

    .line 467
    invoke-virtual {v0, v4}, Ll/᩵֡ᩴ;->add(Ljava/lang/Object;)Z

    goto :goto_a

    :cond_14
    move-object/from16 v4, p0

    .line 151
    iget-object v2, v4, Ll/֨᩺ۡ;->֫:Ll/ۢ֡ᩴ;

    iget-object v1, v1, Ll/֡᩺ۡ;->ܽ:Ll/᩸ۛۡ;

    invoke-virtual {v2, v1, v3}, Ll/ۢ֡ᩴ;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_9

    :cond_15
    move-object/from16 v4, p0

    .line 54
    iget-object v0, v4, Ll/֨᩺ۡ;->֫:Ll/ۢ֡ᩴ;

    invoke-virtual {v0}, Ll/ۢ֡ᩴ;->֫()V

    .line 55
    iget-object v0, v4, Ll/֨᩺ۡ;->ۧ:Ll/ۢ֡ᩴ;

    invoke-virtual {v0}, Ll/ۢ֡ᩴ;->֫()V

    return-void
.end method

.method private ᩳ(Ljava/lang/String;)Ll/ܿ᩺ᩴ;
    .locals 2

    if-nez p1, :cond_0

    const-string p1, ""

    .line 258
    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "/"

    invoke-virtual {p1, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 259
    invoke-virtual {p1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 263
    :cond_1
    iget-object v0, p0, Ll/֨᩺ۡ;->֫:Ll/ۢ֡ᩴ;

    invoke-virtual {v0, p1}, Ll/ۢ֡ᩴ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    if-nez p1, :cond_2

    .line 265
    invoke-static {}, Ll/ܽ᩺ᩴ;->empty()Ll/ܿ᩺ᩴ;

    move-result-object p1

    return-object p1

    .line 267
    :cond_2
    invoke-static {p1}, Ll/ۚ۬ᩴ;->stream(Ljava/util/Collection;)Ll/ܿ᩺ᩴ;

    move-result-object p1

    new-instance v0, Ll/ܺ᩺ۡ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-interface {p1, v0}, Ll/ܿ᩺ᩴ;->map(Ljava/util/function/Function;)Ll/ܿ᩺ᩴ;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public abstract ֫(Ljava/lang/Object;)J
.end method

.method public final ֫(Ljava/lang/String;)Ljava/lang/Object;
    .locals 1

    .line 250
    iget-object v0, p0, Ll/֨᩺ۡ;->ۧ:Ll/ۢ֡ᩴ;

    invoke-virtual {v0, p1}, Ll/ۢ֡ᩴ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۘ᩺ۡ;

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 251
    :cond_0
    invoke-virtual {p1}, Ll/ۘ᩺ۡ;->ۧ()Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ljava/lang/String;Ljava/util/Comparator;)Ljava/util/List;
    .locals 0

    .line 281
    invoke-direct {p0, p1}, Ll/֨᩺ۡ;->ᩳ(Ljava/lang/String;)Ll/ܿ᩺ᩴ;

    move-result-object p1

    invoke-interface {p1, p2}, Ll/ܿ᩺ᩴ;->sorted(Ljava/util/Comparator;)Ll/ܿ᩺ᩴ;

    move-result-object p1

    invoke-static {}, Ll/᩺ۨᩴ;->toUnmodifiableList()Ll/ۨۨᩴ;

    move-result-object p2

    invoke-interface {p1, p2}, Ll/ܿ᩺ᩴ;->collect(Ll/ۨۨᩴ;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    return-object p1
.end method

.method public abstract ֫(JLjava/lang/Object;)V
.end method

.method public abstract ۧ(Ljava/lang/Object;)Ljava/lang/String;
.end method

.method public final ۧ(Ljava/lang/String;)Ljava/util/List;
    .locals 1

    .line 277
    invoke-direct {p0, p1}, Ll/֨᩺ۡ;->ᩳ(Ljava/lang/String;)Ll/ܿ᩺ᩴ;

    move-result-object p1

    invoke-static {}, Ll/᩺ۨᩴ;->toUnmodifiableList()Ll/ۨۨᩴ;

    move-result-object v0

    invoke-interface {p1, v0}, Ll/ܿ᩺ᩴ;->collect(Ll/ۨۨᩴ;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    return-object p1
.end method

.method public abstract ۧ(JLjava/lang/Object;)V
.end method

.method public abstract ܽ(Ljava/lang/Object;)J
.end method

.method public abstract ܽ(Ljava/lang/String;)Ljava/lang/Object;
.end method

.method public abstract ܽ(JLjava/lang/Object;)V
.end method

.method public abstract ᩳ(Ljava/lang/Object;)J
.end method
