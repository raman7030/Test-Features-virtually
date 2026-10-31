.class public final Ll/ۡۧ۠;
.super Ll/ۜۧ۠;
.source "A451"


# instance fields
.field public final synthetic ۟:Ll/᩹ܽ۠;


# direct methods
.method public constructor <init>(Ll/᩹ܽ۠;Ll/۫ۧ۠;)V
    .locals 2

    .line 4185
    iput-object p1, p0, Ll/ۡۧ۠;->۟:Ll/᩹ܽ۠;

    .line 4186
    sget-object v0, Ll/֨ᩴ֨;->ۢ֫:Ll/֨ᩴ֨;

    const-string v1, "inapplicable symbols"

    invoke-direct {p0, p1, v0, v1, p2}, Ll/ۜۧ۠;-><init>(Ll/᩹ܽ۠;Ll/֨ᩴ֨;Ljava/lang/String;Ll/۫ۧ۠;)V

    return-void
.end method

.method public static ֫(Ljava/util/Map;)Ljava/util/LinkedHashMap;
    .locals 8

    .line 4270
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 4271
    check-cast p0, Ljava/util/LinkedHashMap;

    invoke-virtual {p0}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 4272
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܽܶ۠;

    .line 4273
    sget-object v3, Ll/᩸ۧ۠;->ۗ:Ll/᩸ۧ۠;

    invoke-virtual {v3}, Ll/᩸ۧ۠;->֫()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    new-array v5, v4, [Ll/۟ۧ۠;

    .line 4761
    invoke-virtual {v2}, Ll/ܽܶ۠;->ܽ()[Ljava/lang/Object;

    move-result-object v6

    .line 4762
    invoke-virtual {v2}, Ll/ܽܶ۠;->ۧ()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v7, v3}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_3

    .line 4763
    invoke-virtual {v2}, Ll/ܽܶ۠;->ܽ()[Ljava/lang/Object;

    move-result-object v3

    array-length v3, v3

    if-eqz v3, :cond_1

    goto :goto_2

    .line 4766
    :cond_1
    :goto_1
    array-length v3, v6

    if-ge v4, v3, :cond_0

    .line 4767
    aget-object v3, v5, v4

    aget-object v7, v6, v4

    invoke-virtual {v3, v7}, Ll/۟ۧ۠;->֫(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2

    goto :goto_2

    :cond_2
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    .line 4274
    :cond_3
    :goto_2
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۛ֡֨;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_4
    return-object v0
.end method

.method public static bridge synthetic ֫(Ll/ۡۧ۠;)Ljava/util/Map;
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/ۡۧ۠;->᩶֫()Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method private ᩶֫()Ljava/util/Map;
    .locals 11

    .line 4240
    new-instance v0, Ll/ۢۧ۠;

    invoke-direct {v0, p0}, Ll/ۢۧ۠;-><init>(Ll/ۡۧ۠;)V

    .line 4241
    iget-object v1, p0, Ll/ۜۧ۠;->᩺:Ll/۫ۧ۠;

    invoke-static {v1}, Ll/۫ۧ۠;->֫(Ll/۫ۧ۠;)Ll/ۖܶ۠;

    move-result-object v1

    invoke-virtual {v1}, Ll/ۖܶ۠;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/۬ۧ۠;

    .line 4242
    invoke-virtual {v2}, Ll/۬ۧ۠;->֫()Z

    move-result v3

    iget-object v4, v2, Ll/۬ۧ۠;->ᩳ:Ll/ۛ֡֨;

    if-eqz v3, :cond_0

    goto :goto_0

    .line 4251
    :cond_0
    iget-object v3, v0, Ll/ۢۧ۠;->᩸:Ll/ۡۧ۠;

    iget-object v3, v3, Ll/ۡۧ۠;->۟:Ll/᩹ܽ۠;

    new-instance v5, Ll/ᩴܶ۠;

    invoke-direct {v5}, Ll/ᩴܶ۠;-><init>()V

    .line 4252
    invoke-virtual {v0}, Ljava/util/AbstractMap;->keySet()Ljava/util/Set;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_1
    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_4

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/ۛ֡֨;

    if-ne v7, v4, :cond_2

    goto :goto_1

    .line 4256
    :cond_2
    iget-object v8, v7, Ll/ۛ֡֨;->۫:Ll/ۛ֡֨;

    check-cast v8, Ll/᩶֡֨;

    iget-object v9, v3, Ll/᩹ܽ۠;->ܳ֫:Ll/ۛ᩸֨;

    const/4 v10, 0x0

    invoke-virtual {v4, v7, v8, v9, v10}, Ll/ۛ֡֨;->֫(Ll/ۛ֡֨;Ll/᩶֡֨;Ll/ۛ᩸֨;Z)Z

    move-result v8

    if-eqz v8, :cond_3

    .line 227
    invoke-virtual {v5, v7}, Ll/ᩴܶ۠;->֫(Ljava/lang/Object;)V

    goto :goto_1

    .line 4258
    :cond_3
    iget-object v8, v4, Ll/ۛ֡֨;->۫:Ll/ۛ֡֨;

    check-cast v8, Ll/᩶֡֨;

    iget-object v9, v3, Ll/᩹ܽ۠;->ܳ֫:Ll/ۛ᩸֨;

    invoke-virtual {v7, v4, v8, v9, v10}, Ll/ۛ֡֨;->֫(Ll/ۛ֡֨;Ll/᩶֡֨;Ll/ۛ᩸֨;Z)Z

    move-result v7

    if-eqz v7, :cond_1

    goto :goto_0

    .line 4262
    :cond_4
    invoke-virtual {v5}, Ll/ᩴܶ۠;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_5

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ۛ֡֨;

    .line 4263
    invoke-virtual {v0, v5}, Ljava/util/AbstractMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    .line 4265
    :cond_5
    iget-object v2, v2, Ll/۬ۧ۠;->֫:Ll/ܽܶ۠;

    invoke-virtual {v0, v4, v2}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_6
    return-object v0
.end method


# virtual methods
.method public final ֫(Ll/۬۠۠;Ll/ۗ۠۠;Ll/ۛ֡֨;Ll/ۙ֨֨;Ll/ۤܶ۠;Ll/ۖܶ۠;Ll/ۖܶ۠;)Ll/ܽܶ۠;
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    .line 4197
    invoke-direct/range {p0 .. p0}, Ll/ۡۧ۠;->᩶֫()Ljava/util/Map;

    move-result-object v1

    .line 4198
    iget-object v2, v0, Ll/ۡۧ۠;->۟:Ll/᩹ܽ۠;

    iget-object v3, v2, Ll/᩹ܽ۠;->۬:Ll/ۛܶ۠;

    invoke-static {v2}, Ll/᩹ܽ۠;->֫(Ll/᩹ܽ۠;)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 4199
    invoke-static {v1}, Ll/ۡۧ۠;->֫(Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v4

    goto :goto_0

    .line 4200
    :cond_0
    invoke-direct/range {p0 .. p0}, Ll/ۡۧ۠;->᩶֫()Ljava/util/Map;

    move-result-object v4

    .line 4201
    :goto_0
    invoke-interface {v4}, Ljava/util/Map;->isEmpty()Z

    move-result v7

    if-eqz v7, :cond_1

    move-object v4, v1

    .line 4204
    :cond_1
    check-cast v1, Ljava/util/HashMap;

    invoke-virtual {v1}, Ljava/util/HashMap;->size()I

    move-result v1

    invoke-interface {v4}, Ljava/util/Map;->size()I

    move-result v7

    const/4 v8, 0x0

    const/4 v9, 0x1

    if-eq v1, v7, :cond_2

    const/4 v1, 0x1

    const/4 v10, 0x1

    goto :goto_1

    :cond_2
    const/4 v1, 0x0

    const/4 v10, 0x0

    .line 4205
    :goto_1
    invoke-interface {v4}, Ljava/util/Map;->size()I

    move-result v1

    if-le v1, v9, :cond_7

    .line 4206
    iget-object v11, v2, Ll/᩹ܽ۠;->᩵:Ll/ۛ۠۠;

    if-eqz v10, :cond_3

    .line 4209
    sget-object v1, Ll/᩶۠۠;->᩶:Ll/᩶۠۠;

    invoke-static {v1}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v1

    goto :goto_2

    .line 4210
    :cond_3
    const-class v1, Ll/᩶۠۠;

    invoke-static {v1}, Ljava/util/EnumSet;->noneOf(Ljava/lang/Class;)Ljava/util/EnumSet;

    move-result-object v1

    :goto_2
    move-object v13, v1

    iget-object v1, v2, Ll/᩹ܽ۠;->ܶ:Ll/᩹ܶ۠;

    .line 4211
    invoke-virtual {v1}, Ll/ۖ֨۠;->֫()Ll/ܳ۠۠;

    move-result-object v14

    .line 4214
    iget-object v1, v3, Ll/ۛܶ۠;->ᩴۧ:Ll/ۤܶ۠;

    if-ne v6, v1, :cond_4

    sget-object v1, Ll/۠ᩴ֨;->۬:Ll/۠ᩴ֨;

    goto :goto_3

    :cond_4
    iget-object v1, v0, Ll/ۛ֡֨;->ۙ:Ll/֨ᩴ֨;

    invoke-virtual {v1}, Ll/֨ᩴ֨;->֫()Ll/۠ᩴ֨;

    move-result-object v1

    .line 4215
    :goto_3
    iget-object v3, v3, Ll/ۛܶ۠;->ᩴۧ:Ll/ۤܶ۠;

    if-ne v6, v3, :cond_5

    iget-object v3, v5, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    iget-object v3, v3, Ll/ۛ֡֨;->۬:Ll/ۤܶ۠;

    goto :goto_4

    :cond_5
    move-object v3, v6

    :goto_4
    move-object/from16 v7, p6

    .line 4216
    invoke-virtual {v2, v7}, Ll/᩹ܽ۠;->֫(Ll/ۖܶ۠;)Ljava/lang/Object;

    move-result-object v6

    const/4 v7, 0x3

    new-array v10, v7, [Ljava/lang/Object;

    aput-object v1, v10, v8

    aput-object v3, v10, v9

    const/4 v1, 0x2

    aput-object v6, v10, v1

    move-object/from16 v12, p1

    move-object/from16 v15, p2

    move-object/from16 v16, v10

    .line 4206
    invoke-virtual/range {v11 .. v16}, Ll/ۛ۠۠;->֫(Ll/۬۠۠;Ljava/util/EnumSet;Ll/ܳ۠۠;Ll/ۗ۠۠;[Ljava/lang/Object;)Ll/ܽܶ۠;

    move-result-object v1

    .line 4217
    new-instance v3, Ll/᩺۠۠;

    .line 4281
    invoke-static {}, Ll/ۖܶ۠;->ܳ()Ll/ۖܶ۠;

    move-result-object v6

    .line 4282
    invoke-interface {v4}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_5
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_6

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/util/Map$Entry;

    .line 4283
    invoke-interface {v10}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ll/ۛ֡֨;

    .line 4284
    iget-object v12, v2, Ll/᩹ܽ۠;->᩵:Ll/ۛ۠۠;

    iget-object v13, v2, Ll/᩹ܽ۠;->ܳ֫:Ll/ۛ᩸֨;

    .line 4285
    invoke-static {v11}, Ll/᩸ᩴ֨;->֫(Ll/ۛ֡֨;)Ll/۠ᩴ֨;

    move-result-object v14

    .line 4286
    invoke-virtual {v11, v5, v13}, Ll/ۛ֡֨;->ۧ(Ll/ۙ֨֨;Ll/ۛ᩸֨;)Ll/ۛ֡֨;

    move-result-object v15

    .line 4287
    invoke-virtual {v11, v5, v13}, Ll/ۛ֡֨;->֫(Ll/ۙ֨֨;Ll/ۛ᩸֨;)Ll/ۛ֡֨;

    move-result-object v11

    .line 4288
    invoke-interface {v10}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ll/ܽܶ۠;

    .line 4285
    sget-object v13, Ll/ۨᩴ۠;->֫:Ll/ۨ۠۠;

    .line 7112
    new-instance v13, Ll/ۨ۠۠;

    const/16 v16, 0x2

    const/4 v7, 0x4

    new-array v7, v7, [Ljava/lang/Object;

    aput-object v14, v7, v8

    aput-object v15, v7, v9

    aput-object v11, v7, v16

    const/4 v11, 0x3

    aput-object v10, v7, v11

    const-string v10, "compiler"

    const-string v14, "inapplicable.method"

    invoke-direct {v13, v10, v14, v7}, Ll/ۨ۠۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4285
    invoke-virtual {v12, v13}, Ll/ۛ۠۠;->֫(Ll/ۨ۠۠;)Ll/ܽܶ۠;

    move-result-object v7

    .line 4289
    invoke-virtual {v6, v7}, Ll/ۖܶ۠;->ۧ(Ljava/lang/Object;)Ll/ۖܶ۠;

    move-result-object v6

    const/4 v7, 0x3

    goto :goto_5

    .line 4217
    :cond_6
    invoke-direct {v3, v1, v6}, Ll/᩺۠۠;-><init>(Ll/ܽܶ۠;Ll/ۖܶ۠;)V

    return-object v3

    :cond_7
    move-object/from16 v7, p6

    .line 4218
    invoke-interface {v4}, Ljava/util/Map;->size()I

    move-result v1

    if-ne v1, v9, :cond_9

    .line 4220
    invoke-interface {v4}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 4221
    new-instance v2, Ll/᩺ܶ۠;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۛ֡֨;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܽܶ۠;

    invoke-direct {v2, v3, v1}, Ll/᩺ܶ۠;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 4222
    new-instance v1, Ll/᩷ۧ۠;

    iget-object v3, v0, Ll/ۜۧ۠;->᩺:Ll/۫ۧ۠;

    invoke-direct {v1, v0, v3, v2}, Ll/᩷ۧ۠;-><init>(Ll/ۡۧ۠;Ll/۫ۧ۠;Ll/᩺ܶ۠;)V

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    .line 4227
    invoke-virtual/range {v1 .. v8}, Ll/ۜۧ۠;->֫(Ll/۬۠۠;Ll/ۗ۠۠;Ll/ۛ֡֨;Ll/ۙ֨֨;Ll/ۤܶ۠;Ll/ۖܶ۠;Ll/ۖܶ۠;)Ll/ܽܶ۠;

    move-result-object v1

    if-eqz v10, :cond_8

    .line 4230
    sget-object v2, Ll/᩶۠۠;->᩶:Ll/᩶۠۠;

    invoke-virtual {v1, v2}, Ll/ܽܶ۠;->ۧ(Ll/᩶۠۠;)V

    :cond_8
    return-object v1

    .line 4234
    :cond_9
    new-instance v1, Ll/۠ܽ۠;

    sget-object v3, Ll/֨ᩴ֨;->۬:Ll/֨ᩴ֨;

    invoke-direct {v1, v2, v3}, Ll/۠ܽ۠;-><init>(Ll/᩹ܽ۠;Ll/֨ᩴ֨;)V

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    invoke-virtual/range {v1 .. v8}, Ll/۠ܽ۠;->֫(Ll/۬۠۠;Ll/ۗ۠۠;Ll/ۛ֡֨;Ll/ۙ֨֨;Ll/ۤܶ۠;Ll/ۖܶ۠;Ll/ۖܶ۠;)Ll/ܽܶ۠;

    move-result-object v1

    return-object v1
.end method

.method public final ᩹֫()Ll/᩺ܶ۠;
    .locals 3

    .line 4299
    invoke-direct {p0}, Ll/ۡۧ۠;->᩶֫()Ljava/util/Map;

    move-result-object v0

    .line 4300
    invoke-static {v0}, Ll/ۡۧ۠;->֫(Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v0

    .line 4301
    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    .line 4302
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۛ֡֨;

    .line 4303
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܽܶ۠;

    .line 64
    new-instance v2, Ll/᩺ܶ۠;

    invoke-direct {v2, v1, v0}, Ll/᩺ܶ۠;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v2

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method
