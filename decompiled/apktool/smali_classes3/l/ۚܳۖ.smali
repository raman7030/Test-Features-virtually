.class public final Ll/ۚܳۖ;
.super Ljava/lang/Object;
.source "H88J"

# interfaces
.implements Ll/ܶᩳۖ;


# instance fields
.field public final ۗ:Ljava/util/List;

.field public final ۙ:Ll/ܰܿۖ;

.field public final ᩶:Ll/ܶܽۖ;

.field public final ᩸:Ll/᩶ᩳۖ;

.field public final ᩹:Ll/ۗᩳۖ;


# direct methods
.method public constructor <init>(Ll/᩶ᩳۖ;Ll/ܶܽۖ;Ll/ۗᩳۖ;Ll/ܰܿۖ;)V
    .locals 1

    .line 2
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 72
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 73
    iput-object p1, p0, Ll/ۚܳۖ;->᩸:Ll/᩶ᩳۖ;

    .line 74
    iput-object p2, p0, Ll/ۚܳۖ;->᩶:Ll/ܶܽۖ;

    .line 75
    iput-object p3, p0, Ll/ۚܳۖ;->᩹:Ll/ۗᩳۖ;

    .line 76
    iput-object p4, p0, Ll/ۚܳۖ;->ۙ:Ll/ܰܿۖ;

    .line 77
    iput-object v0, p0, Ll/ۚܳۖ;->ۗ:Ljava/util/List;

    return-void
.end method

.method private ֫(Ll/۫ܽۖ;Ll/ܽۜۖ;Ljava/lang/Class;ZZ)Ll/᩵ܳۖ;
    .locals 31

    move-object/from16 v0, p0

    move-object/from16 v7, p1

    move-object/from16 v8, p3

    .line 319
    invoke-virtual/range {p3 .. p3}, Ljava/lang/Class;->isInterface()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 320
    sget-object v1, Ll/᩵ܳۖ;->ܽ:Ll/᩵ܳۖ;

    return-object v1

    .line 323
    :cond_0
    new-instance v9, Ljava/util/LinkedHashMap;

    invoke-direct {v9}, Ljava/util/LinkedHashMap;-><init>()V

    .line 326
    new-instance v10, Ljava/util/LinkedHashMap;

    invoke-direct {v10}, Ljava/util/LinkedHashMap;-><init>()V

    move-object/from16 v11, p2

    move/from16 v1, p4

    move-object v12, v8

    .line 329
    :goto_0
    const-class v2, Ljava/lang/Object;

    if-eq v12, v2, :cond_19

    .line 330
    invoke-virtual {v12}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    move-result-object v13

    const/4 v2, 0x1

    const/4 v14, 0x0

    if-eq v12, v8, :cond_3

    .line 333
    array-length v3, v13

    if-lez v3, :cond_3

    .line 334
    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 335
    invoke-static {v12}, Ll/ۖܿۖ;->֫(Ljava/lang/Class;)Ll/ۢᩳۖ;

    move-result-object v1

    .line 336
    sget-object v3, Ll/ۢᩳۖ;->᩶:Ll/ۢᩳۖ;

    if-eq v1, v3, :cond_2

    .line 344
    sget-object v3, Ll/ۢᩳۖ;->ۙ:Ll/ۢᩳۖ;

    if-ne v1, v3, :cond_1

    const/4 v1, 0x1

    const/16 v24, 0x1

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    const/16 v24, 0x0

    goto :goto_1

    .line 337
    :cond_2
    new-instance v1, Ll/ܰܽۖ;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "ReflectionAccessFilter does not permit using reflection for "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, " (supertype of "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, "). Register a TypeAdapter for this type or adjust the access filter."

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 42
    invoke-direct {v1, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 337
    throw v1

    :cond_3
    move/from16 v24, v1

    .line 347
    :goto_1
    array-length v15, v13

    const/4 v1, 0x0

    const/4 v6, 0x0

    :goto_2
    if-ge v6, v15, :cond_18

    aget-object v5, v13, v6

    .line 81
    iget-object v1, v0, Ll/ۚܳۖ;->᩹:Ll/ۗᩳۖ;

    invoke-virtual {v1, v5, v2}, Ll/ۗᩳۖ;->֫(Ljava/lang/reflect/Field;Z)Z

    move-result v25

    invoke-virtual {v1, v5, v14}, Ll/ۗᩳۖ;->֫(Ljava/lang/reflect/Field;Z)Z

    move-result v1

    xor-int/lit8 v2, v1, 0x1

    if-eqz v25, :cond_4

    if-eqz v1, :cond_4

    move/from16 v30, v6

    move v3, v15

    const/16 v28, 0x0

    goto/16 :goto_e

    .line 357
    :cond_4
    const-class v1, Ll/᩹ᩳۖ;

    const/16 v26, 0x0

    if-eqz p5, :cond_9

    .line 363
    invoke-virtual {v5}, Ljava/lang/reflect/Field;->getModifiers()I

    move-result v3

    invoke-static {v3}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    move-result v3

    if-eqz v3, :cond_5

    const/4 v2, 0x0

    move-object/from16 v19, v26

    const/16 v27, 0x0

    goto :goto_4

    .line 366
    :cond_5
    invoke-static {v12, v5}, Ll/۬᩻ۖ;->֫(Ljava/lang/Class;Ljava/lang/reflect/Field;)Ljava/lang/reflect/Method;

    move-result-object v3

    if-nez v24, :cond_6

    .line 369
    invoke-static {v3}, Ll/۬᩻ۖ;->֫(Ljava/lang/reflect/AccessibleObject;)V

    .line 376
    :cond_6
    invoke-virtual {v3, v1}, Ljava/lang/reflect/Method;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v4

    if-eqz v4, :cond_8

    .line 377
    invoke-virtual {v5, v1}, Ljava/lang/reflect/Field;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v4

    if-eqz v4, :cond_7

    goto :goto_3

    .line 379
    :cond_7
    invoke-static {v3, v14}, Ll/۬᩻ۖ;->֫(Ljava/lang/reflect/AccessibleObject;Z)Ljava/lang/String;

    move-result-object v1

    .line 380
    new-instance v2, Ll/ܰܽۖ;

    const-string v3, "@SerializedName on "

    const-string v4, " is not supported"

    .line 0
    invoke-static {v3, v1, v4}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 42
    invoke-direct {v2, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 380
    throw v2

    :cond_8
    :goto_3
    move/from16 v27, v2

    move-object/from16 v19, v3

    goto :goto_4

    :cond_9
    move/from16 v27, v2

    move-object/from16 v19, v26

    :goto_4
    if-nez v24, :cond_a

    if-nez v19, :cond_a

    .line 389
    invoke-static {v5}, Ll/۬᩻ۖ;->֫(Ljava/lang/reflect/AccessibleObject;)V

    .line 392
    :cond_a
    invoke-virtual {v11}, Ll/ܽۜۖ;->ۧ()Ljava/lang/reflect/Type;

    move-result-object v2

    invoke-virtual {v5}, Ljava/lang/reflect/Field;->getGenericType()Ljava/lang/reflect/Type;

    move-result-object v3

    invoke-static {v12, v2, v3}, Ll/ۛᩳۖ;->֫(Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;

    move-result-object v2

    .line 90
    invoke-virtual {v5, v1}, Ljava/lang/reflect/Field;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v1

    check-cast v1, Ll/᩹ᩳۖ;

    if-nez v1, :cond_b

    .line 92
    iget-object v1, v0, Ll/ۚܳۖ;->᩶:Ll/ܶܽۖ;

    invoke-interface {v1, v5}, Ll/ܶܽۖ;->ۧ(Ljava/lang/reflect/Field;)Ljava/lang/String;

    move-result-object v3

    .line 93
    invoke-interface {v1, v5}, Ll/ܶܽۖ;->֫(Ljava/lang/reflect/Field;)Ljava/util/List;

    move-result-object v1

    goto :goto_5

    .line 95
    :cond_b
    invoke-interface {v1}, Ll/᩹ᩳۖ;->value()Ljava/lang/String;

    move-result-object v3

    .line 96
    invoke-interface {v1}, Ll/᩹ᩳۖ;->alternate()[Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    .line 99
    :goto_5
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_c

    .line 100
    invoke-static {v3}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    move-object v14, v1

    goto :goto_6

    .line 103
    :cond_c
    new-instance v4, Ljava/util/ArrayList;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v16

    add-int/lit8 v14, v16, 0x1

    invoke-direct {v4, v14}, Ljava/util/ArrayList;-><init>(I)V

    .line 104
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 105
    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    move-object v14, v4

    :goto_6
    const/4 v4, 0x0

    .line 394
    invoke-interface {v14, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Ljava/lang/String;

    .line 401
    invoke-static {v2}, Ll/ܽۜۖ;->֫(Ljava/lang/reflect/Type;)Ll/ܽۜۖ;

    move-result-object v2

    .line 190
    invoke-virtual {v2}, Ll/ܽۜۖ;->֫()Ljava/lang/Class;

    move-result-object v1

    if-eqz v1, :cond_d

    .line 32
    invoke-virtual {v1}, Ljava/lang/Class;->isPrimitive()Z

    move-result v1

    if-eqz v1, :cond_d

    const/4 v1, 0x1

    const/16 v22, 0x1

    goto :goto_7

    :cond_d
    const/4 v1, 0x0

    const/16 v22, 0x0

    .line 192
    :goto_7
    invoke-virtual {v5}, Ljava/lang/reflect/Field;->getModifiers()I

    move-result v1

    .line 193
    invoke-static {v1}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    move-result v16

    if-eqz v16, :cond_e

    invoke-static {v1}, Ljava/lang/reflect/Modifier;->isFinal(I)Z

    move-result v1

    if-eqz v1, :cond_e

    const/4 v1, 0x1

    const/16 v23, 0x1

    goto :goto_8

    :cond_e
    const/4 v1, 0x0

    const/16 v23, 0x0

    .line 195
    :goto_8
    const-class v1, Ll/᩸ᩳۖ;

    invoke-virtual {v5, v1}, Ljava/lang/reflect/Field;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v1

    move-object/from16 v16, v1

    check-cast v16, Ll/᩸ᩳۖ;

    if-eqz v16, :cond_f

    .line 199
    iget-object v1, v0, Ll/ۚܳۖ;->᩸:Ll/᩶ᩳۖ;

    const/16 v17, 0x0

    .line 200
    iget-object v4, v0, Ll/ۚܳۖ;->ۙ:Ll/ܰܿۖ;

    move-object/from16 v18, v1

    move-object v1, v4

    move-object v4, v2

    move-object/from16 v2, v18

    move-object/from16 p4, v3

    move-object/from16 v3, p1

    move-object/from16 p2, v4

    const/16 v28, 0x0

    move-object/from16 v29, v5

    move-object/from16 v5, v16

    move/from16 v30, v6

    move/from16 v6, v17

    invoke-virtual/range {v1 .. v6}, Ll/ܰܿۖ;->֫(Ll/᩶ᩳۖ;Ll/۫ܽۖ;Ll/ܽۜۖ;Ll/᩸ᩳۖ;Z)Ll/۠ᩳۖ;

    move-result-object v1

    goto :goto_9

    :cond_f
    move-object/from16 p2, v2

    move-object/from16 p4, v3

    move-object/from16 v29, v5

    move/from16 v30, v6

    const/16 v28, 0x0

    move-object/from16 v1, v26

    :goto_9
    if-eqz v1, :cond_10

    const/4 v2, 0x1

    goto :goto_a

    :cond_10
    const/4 v2, 0x0

    :goto_a
    move-object/from16 v3, p2

    if-nez v1, :cond_11

    .line 205
    invoke-virtual {v7, v3}, Ll/۫ܽۖ;->֫(Ll/ܽۜۖ;)Ll/۠ᩳۖ;

    move-result-object v1

    :cond_11
    if-nez v25, :cond_13

    if-eqz v2, :cond_12

    move-object v2, v1

    goto :goto_b

    .line 215
    :cond_12
    new-instance v2, Ll/᩸ܳۖ;

    invoke-virtual {v3}, Ll/ܽۜۖ;->ۧ()Ljava/lang/reflect/Type;

    move-result-object v3

    invoke-direct {v2, v7, v1, v3}, Ll/᩸ܳۖ;-><init>(Ll/۫ܽۖ;Ll/۠ᩳۖ;Ljava/lang/reflect/Type;)V

    :goto_b
    move-object/from16 v20, v2

    goto :goto_c

    :cond_13
    move-object/from16 v20, v1

    .line 220
    :goto_c
    new-instance v2, Ll/ܺܳۖ;

    move v3, v15

    move-object v15, v2

    move-object/from16 v16, p4

    move-object/from16 v17, v29

    move/from16 v18, v24

    move-object/from16 v21, v1

    invoke-direct/range {v15 .. v23}, Ll/ܺܳۖ;-><init>(Ljava/lang/String;Ljava/lang/reflect/Field;ZLjava/lang/reflect/Method;Ll/۠ᩳۖ;Ll/۠ᩳۖ;ZZ)V

    if-eqz v27, :cond_15

    .line 406
    invoke-interface {v14}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_d
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_15

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    .line 407
    invoke-interface {v9, v4, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ۘܳۖ;

    if-nez v5, :cond_14

    goto :goto_d

    .line 410
    :cond_14
    iget-object v1, v5, Ll/ۘܳۖ;->֫:Ljava/lang/reflect/Field;

    move-object/from16 v5, v29

    invoke-static {v8, v4, v1, v5}, Ll/ۚܳۖ;->֫(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/reflect/Field;Ljava/lang/reflect/Field;)V

    throw v26

    :cond_15
    move-object/from16 v5, v29

    if-nez v25, :cond_17

    move-object/from16 v1, p4

    .line 416
    invoke-interface {v10, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۘܳۖ;

    if-nez v2, :cond_16

    goto :goto_e

    .line 418
    :cond_16
    iget-object v2, v2, Ll/ۘܳۖ;->֫:Ljava/lang/reflect/Field;

    invoke-static {v8, v1, v2, v5}, Ll/ۚܳۖ;->֫(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/reflect/Field;Ljava/lang/reflect/Field;)V

    throw v26

    :cond_17
    :goto_e
    add-int/lit8 v6, v30, 0x1

    const/4 v2, 0x1

    move v15, v3

    const/4 v14, 0x0

    goto/16 :goto_2

    .line 422
    :cond_18
    invoke-virtual {v11}, Ll/ܽۜۖ;->ۧ()Ljava/lang/reflect/Type;

    move-result-object v1

    invoke-virtual {v12}, Ljava/lang/Class;->getGenericSuperclass()Ljava/lang/reflect/Type;

    move-result-object v2

    invoke-static {v12, v1, v2}, Ll/ۛᩳۖ;->֫(Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;

    move-result-object v1

    invoke-static {v1}, Ll/ܽۜۖ;->֫(Ljava/lang/reflect/Type;)Ll/ܽۜۖ;

    move-result-object v11

    .line 423
    invoke-virtual {v11}, Ll/ܽۜۖ;->֫()Ljava/lang/Class;

    move-result-object v12

    move/from16 v1, v24

    goto/16 :goto_0

    .line 425
    :cond_19
    new-instance v1, Ll/᩵ܳۖ;

    new-instance v2, Ljava/util/ArrayList;

    invoke-virtual {v10}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-direct {v1, v2, v9}, Ll/᩵ܳۖ;-><init>(Ljava/util/List;Ljava/util/Map;)V

    return-object v1
.end method

.method public static ֫(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/reflect/Field;Ljava/lang/reflect/Field;)V
    .locals 3

    .line 304
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Class "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 306
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, " declares multiple JSON fields named \'"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "\'; conflict is caused by fields "

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 310
    invoke-static {p2}, Ll/۬᩻ۖ;->֫(Ljava/lang/reflect/Field;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, " and "

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 312
    invoke-static {p3}, Ll/۬᩻ۖ;->֫(Ljava/lang/reflect/Field;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "\nSee "

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "duplicate-fields"

    const-string p1, "https://github.com/google/gson/blob/main/Troubleshooting.md#"

    .line 8
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 314
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static ֫(Ljava/lang/Object;Ljava/lang/reflect/AccessibleObject;)V
    .locals 1

    .line 171
    move-object v0, p1

    check-cast v0, Ljava/lang/reflect/Member;

    invoke-interface {v0}, Ljava/lang/reflect/Member;->getModifiers()I

    move-result v0

    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p0, 0x0

    .line 170
    :cond_0
    invoke-static {p0, p1}, Ll/ۖܿۖ;->֫(Ljava/lang/Object;Ljava/lang/reflect/AccessibleObject;)Z

    move-result p0

    if-eqz p0, :cond_1

    return-void

    :cond_1
    const/4 p0, 0x1

    .line 172
    invoke-static {p1, p0}, Ll/۬᩻ۖ;->֫(Ljava/lang/reflect/AccessibleObject;Z)Ljava/lang/String;

    move-result-object p0

    .line 173
    new-instance p1, Ll/ܰܽۖ;

    const-string v0, " is not accessible and ReflectionAccessFilter does not permit making it accessible. Register a TypeAdapter for the declaring type, adjust the access filter or increase the visibility of the element and its declaring type."

    .line 0
    invoke-static {p0, v0}, Ll/ܺܶۡ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 42
    invoke-direct {p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 173
    throw p1
.end method


# virtual methods
.method public final ֫(Ll/۫ܽۖ;Ll/ܽۜۖ;)Ll/۠ᩳۖ;
    .locals 10

    .line 111
    invoke-virtual {p2}, Ll/ܽۜۖ;->֫()Ljava/lang/Class;

    move-result-object v6

    .line 113
    const-class v0, Ljava/lang/Object;

    invoke-virtual {v0, v6}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 119
    :cond_0
    sget v0, Ll/۬᩻ۖ;->֫:I

    .line 152
    invoke-virtual {v6}, Ljava/lang/Class;->getModifiers()I

    move-result v0

    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    move-result v0

    if-nez v0, :cond_2

    .line 157
    invoke-virtual {v6}, Ljava/lang/Class;->isAnonymousClass()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {v6}, Ljava/lang/Class;->isLocalClass()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 123
    :cond_1
    new-instance p1, Ll/ۡܳۖ;

    invoke-direct {p1}, Ll/۠ᩳۖ;-><init>()V

    return-object p1

    .line 142
    :cond_2
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 143
    invoke-static {v6}, Ll/ۖܿۖ;->֫(Ljava/lang/Class;)Ll/ۢᩳۖ;

    move-result-object v0

    .line 144
    sget-object v1, Ll/ۢᩳۖ;->᩶:Ll/ۢᩳۖ;

    if-eq v0, v1, :cond_5

    .line 150
    sget-object v1, Ll/ۢᩳۖ;->ۙ:Ll/ۢᩳۖ;

    if-ne v0, v1, :cond_3

    const/4 v0, 0x1

    const/4 v7, 0x1

    goto :goto_0

    :cond_3
    const/4 v0, 0x0

    const/4 v7, 0x0

    .line 154
    :goto_0
    invoke-static {v6}, Ll/۬᩻ۖ;->ܽ(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 156
    new-instance v8, Ll/֡ܳۖ;

    const/4 v5, 0x1

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, v6

    move v4, v7

    .line 159
    invoke-direct/range {v0 .. v5}, Ll/ۚܳۖ;->֫(Ll/۫ܽۖ;Ll/ܽۜۖ;Ljava/lang/Class;ZZ)Ll/᩵ܳۖ;

    move-result-object p1

    invoke-direct {v8, v6, p1, v7}, Ll/֡ܳۖ;-><init>(Ljava/lang/Class;Ll/᩵ܳۖ;Z)V

    return-object v8

    :cond_4
    const/4 v0, 0x1

    .line 163
    iget-object v1, p0, Ll/ۚܳۖ;->᩸:Ll/᩶ᩳۖ;

    invoke-virtual {v1, p2, v0}, Ll/᩶ᩳۖ;->֫(Ll/ܽۜۖ;Z)Ll/᩷ܿۖ;

    move-result-object v8

    .line 164
    new-instance v9, Ll/ᩴܳۖ;

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, v6

    move v4, v7

    .line 165
    invoke-direct/range {v0 .. v5}, Ll/ۚܳۖ;->֫(Ll/۫ܽۖ;Ll/ܽۜۖ;Ljava/lang/Class;ZZ)Ll/᩵ܳۖ;

    move-result-object p1

    invoke-direct {v9, v8, p1}, Ll/ᩴܳۖ;-><init>(Ll/᩷ܿۖ;Ll/᩵ܳۖ;)V

    return-object v9

    .line 145
    :cond_5
    new-instance p1, Ll/ܰܽۖ;

    const-string p2, "ReflectionAccessFilter does not permit using reflection for "

    const-string v0, ". Register a TypeAdapter for this type or adjust the access filter."

    .line 0
    invoke-static {v6, p2, v0}, Ll/᩸ܳۡ;->֫(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 42
    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 145
    throw p1
.end method
