.class public final Ll/᩶ᩳۖ;
.super Ljava/lang/Object;
.source "W8AM"


# instance fields
.field public final ֫:Ljava/util/Map;

.field public final ۧ:Ljava/util/List;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 2
    sget-object v0, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 4
    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 53
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 54
    iput-object v0, p0, Ll/᩶ᩳۖ;->֫:Ljava/util/Map;

    .line 56
    iput-object v1, p0, Ll/᩶ᩳۖ;->ۧ:Ljava/util/List;

    return-void
.end method

.method public static ֫(Ljava/lang/Class;)Ljava/lang/String;
    .locals 2

    .line 67
    invoke-virtual {p0}, Ljava/lang/Class;->getModifiers()I

    move-result v0

    .line 68
    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isInterface(I)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 71
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p0

    const-string v0, "Interfaces can\'t be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: "

    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 73
    :cond_0
    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isAbstract(I)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 82
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Abstract classes can\'t be instantiated! Adjust the R8 configuration or register an InstanceCreator or a TypeAdapter for this type. Class name: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 84
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "\nSee "

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "r8-abstract-class"

    const-string v1, "https://github.com/google/gson/blob/main/Troubleshooting.md#"

    .line 8
    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 86
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    .line 445
    iget-object v0, p0, Ll/᩶ᩳۖ;->֫:Ljava/util/Map;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/ܽۜۖ;Z)Ll/᩷ܿۖ;
    .locals 6

    .line 104
    invoke-virtual {p1}, Ll/ܽۜۖ;->ۧ()Ljava/lang/reflect/Type;

    move-result-object v0

    .line 105
    invoke-virtual {p1}, Ll/ܽۜۖ;->֫()Ljava/lang/Class;

    move-result-object p1

    .line 110
    sget-object v1, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۤܽۖ;

    if-eqz v2, :cond_0

    .line 112
    new-instance p1, Ll/ܰܿ᩷;

    invoke-direct {p1, v2, v0}, Ll/ܰܿ᩷;-><init>(Ll/ۤܽۖ;Ljava/lang/reflect/Type;)V

    return-object p1

    .line 117
    :cond_0
    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۤܽۖ;

    if-eqz v1, :cond_1

    .line 119
    new-instance p1, Ll/ۚᩴᩳ;

    invoke-direct {p1, v1, v0}, Ll/ۚᩴᩳ;-><init>(Ll/ۤܽۖ;Ljava/lang/reflect/Type;)V

    return-object p1

    .line 185
    :cond_1
    const-class v1, Ljava/util/EnumSet;

    invoke-virtual {v1, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    .line 186
    new-instance v1, Ll/ۨۚ᩷;

    invoke-direct {v1, v0}, Ll/ۨۚ᩷;-><init>(Ljava/lang/Object;)V

    goto :goto_0

    .line 203
    :cond_2
    const-class v1, Ljava/util/EnumMap;

    if-ne p1, v1, :cond_3

    .line 204
    new-instance v1, Ll/ᩳۜۢ;

    invoke-direct {v1, v0}, Ll/ᩳۜۢ;-><init>(Ljava/lang/Object;)V

    goto :goto_0

    :cond_3
    move-object v1, v2

    :goto_0
    if-eqz v1, :cond_4

    return-object v1

    .line 130
    :cond_4
    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 131
    invoke-static {p1}, Ll/ۖܿۖ;->֫(Ljava/lang/Class;)Ll/ۢᩳۖ;

    move-result-object v1

    .line 226
    invoke-virtual {p1}, Ljava/lang/Class;->getModifiers()I

    move-result v3

    invoke-static {v3}, Ljava/lang/reflect/Modifier;->isAbstract(I)Z

    move-result v3

    if-eqz v3, :cond_5

    goto :goto_2

    .line 232
    :cond_5
    :try_start_0
    invoke-virtual {p1, v2}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v3
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    .line 237
    sget-object v4, Ll/ۢᩳۖ;->᩹:Ll/ۢᩳۖ;

    if-eq v1, v4, :cond_7

    .line 77
    sget-object v5, Ll/ܺܿۖ;->֫:Ll/ܺܿۖ;

    invoke-virtual {v5, v2, v3}, Ll/ܺܿۖ;->֫(Ljava/lang/Object;Ljava/lang/reflect/AccessibleObject;)Z

    move-result v5

    if-eqz v5, :cond_6

    .line 239
    sget-object v5, Ll/ۢᩳۖ;->᩶:Ll/ۢᩳۖ;

    if-ne v1, v5, :cond_7

    .line 243
    invoke-virtual {v3}, Ljava/lang/reflect/Constructor;->getModifiers()I

    move-result v5

    invoke-static {v5}, Ljava/lang/reflect/Modifier;->isPublic(I)Z

    move-result v5

    if-eqz v5, :cond_6

    goto :goto_1

    :cond_6
    const-string v3, "Unable to invoke no-args constructor of "

    const-string v4, "; constructor is not accessible and ReflectionAccessFilter does not permit making it accessible. Register an InstanceCreator or a TypeAdapter for this type, change the visibility of the constructor or adjust the access filter."

    .line 0
    invoke-static {p1, v3, v4}, Ll/᩸ܳۡ;->֫(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 253
    new-instance v4, Ll/᩶᩵ܳ;

    invoke-direct {v4, v3}, Ll/᩶᩵ܳ;-><init>(Ljava/lang/Object;)V

    goto :goto_3

    :cond_7
    :goto_1
    if-ne v1, v4, :cond_8

    .line 261
    invoke-static {v3}, Ll/۬᩻ۖ;->ۧ(Ljava/lang/reflect/Constructor;)Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_8

    .line 271
    new-instance v3, Ll/᩸ۜۢ;

    invoke-direct {v3, v4}, Ll/᩸ۜۢ;-><init>(Ljava/lang/Object;)V

    move-object v4, v3

    goto :goto_3

    .line 280
    :cond_8
    new-instance v4, Ll/ۛۤᩳ;

    const/16 v5, 0x8

    invoke-direct {v4, v5, v3}, Ll/ۛۤᩳ;-><init>(ILjava/lang/Object;)V

    goto :goto_3

    :catch_0
    :goto_2
    move-object v4, v2

    :goto_3
    if-eqz v4, :cond_9

    return-object v4

    .line 320
    :cond_9
    const-class v3, Ljava/util/Collection;

    invoke-virtual {v3, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v3

    if-eqz v3, :cond_d

    .line 340
    const-class v0, Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_a

    .line 341
    new-instance v2, Ll/ܰۗ;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    goto/16 :goto_6

    .line 344
    :cond_a
    const-class v0, Ljava/util/LinkedHashSet;

    invoke-virtual {p1, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_b

    .line 345
    new-instance v2, Ll/ۘ᩺ۘ;

    const/16 v0, 0xa

    invoke-direct {v2, v0}, Ll/ۘ᩺ۘ;-><init>(I)V

    goto/16 :goto_6

    .line 348
    :cond_b
    const-class v0, Ljava/util/TreeSet;

    invoke-virtual {p1, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_c

    .line 349
    new-instance v2, Ll/᩶ᩴᩳ;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    goto/16 :goto_6

    .line 352
    :cond_c
    const-class v0, Ljava/util/ArrayDeque;

    invoke-virtual {p1, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_14

    .line 353
    new-instance v2, Ll/ۛۙܽ;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    goto/16 :goto_6

    .line 326
    :cond_d
    const-class v3, Ljava/util/Map;

    invoke-virtual {v3, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v3

    if-eqz v3, :cond_14

    .line 380
    const-class v3, Ll/᩻ܿۖ;

    invoke-virtual {p1, v3}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v3

    if-eqz v3, :cond_10

    .line 362
    instance-of v3, v0, Ljava/lang/reflect/ParameterizedType;

    if-nez v3, :cond_e

    goto :goto_4

    .line 366
    :cond_e
    check-cast v0, Ljava/lang/reflect/ParameterizedType;

    invoke-interface {v0}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    move-result-object v0

    .line 367
    array-length v3, v0

    if-nez v3, :cond_f

    goto :goto_5

    :cond_f
    const/4 v3, 0x0

    .line 370
    aget-object v0, v0, v3

    invoke-static {v0}, Ll/ۛᩳۖ;->ܽ(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object v0

    const-class v3, Ljava/lang/String;

    if-ne v0, v3, :cond_10

    .line 381
    :goto_4
    new-instance v2, Ll/۟ۤ᩻;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    goto :goto_6

    .line 382
    :cond_10
    :goto_5
    const-class v0, Ljava/util/LinkedHashMap;

    invoke-virtual {p1, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_11

    .line 383
    new-instance v2, Ll/ܶ᩷ۘ;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    goto :goto_6

    .line 386
    :cond_11
    const-class v0, Ljava/util/TreeMap;

    invoke-virtual {p1, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_12

    .line 387
    new-instance v2, Ll/᩵ۢ֡;

    const/4 v0, 0x7

    invoke-direct {v2, v0}, Ll/᩵ۢ֡;-><init>(I)V

    goto :goto_6

    .line 390
    :cond_12
    const-class v0, Ll/ۧۤᩴ;

    invoke-virtual {p1, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_13

    .line 391
    new-instance v2, Ll/ܿ᩺᩵;

    const/4 v0, 0x7

    invoke-direct {v2, v0}, Ll/ܿ᩺᩵;-><init>(I)V

    goto :goto_6

    .line 394
    :cond_13
    const-class v0, Ljava/util/concurrent/ConcurrentSkipListMap;

    invoke-virtual {p1, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_14

    .line 395
    new-instance v2, Ll/᩶ۢۢ;

    const/16 v0, 0x9

    invoke-direct {v2, v0}, Ll/᩶ۢۢ;-><init>(I)V

    :cond_14
    :goto_6
    if-eqz v2, :cond_15

    return-object v2

    .line 144
    :cond_15
    invoke-static {p1}, Ll/᩶ᩳۖ;->֫(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_16

    .line 146
    new-instance p1, Ll/۫᩸ۢ;

    const/4 p2, 0x4

    invoke-direct {p1, p2, v0}, Ll/۫᩸ۢ;-><init>(ILjava/lang/Object;)V

    return-object p1

    :cond_16
    const-string v0, "Unable to create instance of "

    if-nez p2, :cond_17

    const-string p2, "; Register an InstanceCreator or a TypeAdapter for this type."

    .line 0
    invoke-static {p1, v0, p2}, Ll/᩸ܳۡ;->֫(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 156
    new-instance p2, Ll/ܿۡܳ;

    const/4 v0, 0x4

    invoke-direct {p2, v0, p1}, Ll/ܿۡܳ;-><init>(ILjava/lang/Object;)V

    return-object p2

    .line 163
    :cond_17
    sget-object p2, Ll/ۢᩳۖ;->᩹:Ll/ۢᩳۖ;

    if-eq v1, p2, :cond_18

    const-string p2, "; ReflectionAccessFilter does not permit using reflection or Unsafe. Register an InstanceCreator or a TypeAdapter for this type or adjust the access filter to allow using reflection."

    .line 0
    invoke-static {p1, v0, p2}, Ll/᩸ܳۡ;->֫(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 170
    new-instance p2, Ll/ۛۢۢ;

    const/4 v0, 0x3

    invoke-direct {p2, v0, p1}, Ll/ۛۢۢ;-><init>(ILjava/lang/Object;)V

    return-object p2

    .line 404
    :cond_18
    new-instance p2, Ll/᩻ۡܳ;

    invoke-direct {p2, p1}, Ll/᩻ۡܳ;-><init>(Ljava/lang/Object;)V

    return-object p2
.end method
