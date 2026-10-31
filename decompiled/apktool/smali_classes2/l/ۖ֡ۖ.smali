.class public final Ll/ۖ֡ۖ;
.super Ljava/lang/Object;
.source "99OR"


# static fields
.field public static final ֫:[C


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const/16 v0, 0x50

    new-array v0, v0, [C

    .line 29
    sput-object v0, Ll/ۖ֡ۖ;->֫:[C

    const/16 v1, 0x20

    .line 32
    invoke-static {v0, v1}, Ljava/util/Arrays;->fill([CC)V

    return-void
.end method

.method public static ֫(Ll/᩸ᩴۖ;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    const-string v0, "# "

    .line 0
    invoke-static {v0, p1}, Ll/۟֫ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    const/4 v0, 0x0

    .line 49
    invoke-static {p0, p1, v0}, Ll/ۖ֡ۖ;->֫(Ll/᩸ᩴۖ;Ljava/lang/StringBuilder;I)V

    .line 50
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ljava/lang/StringBuilder;I)V
    .locals 3

    :goto_0
    if-lez p1, :cond_1

    const/16 v0, 0x50

    if-le p1, v0, :cond_0

    goto :goto_1

    :cond_0
    move v0, p1

    :goto_1
    const/4 v1, 0x0

    .line 265
    sget-object v2, Ll/ۖ֡ۖ;->֫:[C

    invoke-virtual {p0, v2, v1, v0}, Ljava/lang/StringBuilder;->append([CII)Ljava/lang/StringBuilder;

    sub-int/2addr p1, v0

    goto :goto_0

    :cond_1
    return-void
.end method

.method public static ֫(Ljava/lang/StringBuilder;ILjava/lang/String;Ljava/lang/Object;)V
    .locals 4

    .line 217
    instance-of v0, p3, Ljava/util/List;

    if-eqz v0, :cond_0

    .line 218
    check-cast p3, Ljava/util/List;

    .line 219
    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    .line 220
    invoke-static {p0, p1, p2, v0}, Ll/ۖ֡ۖ;->֫(Ljava/lang/StringBuilder;ILjava/lang/String;Ljava/lang/Object;)V

    goto :goto_0

    .line 224
    :cond_0
    instance-of v0, p3, Ljava/util/Map;

    if-eqz v0, :cond_2

    .line 225
    check-cast p3, Ljava/util/Map;

    .line 226
    invoke-interface {p3}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p3

    invoke-interface {p3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :goto_1
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 227
    invoke-static {p0, p1, p2, v0}, Ll/ۖ֡ۖ;->֫(Ljava/lang/StringBuilder;ILjava/lang/String;Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    return-void

    :cond_2
    const/16 v0, 0xa

    .line 232
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 233
    invoke-static {p0, p1}, Ll/ۖ֡ۖ;->֫(Ljava/lang/StringBuilder;I)V

    .line 271
    invoke-virtual {p2}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_3

    goto :goto_3

    .line 275
    :cond_3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, 0x0

    .line 276
    invoke-virtual {p2, v1}, Ljava/lang/String;->charAt(I)C

    move-result v1

    invoke-static {v1}, Ljava/lang/Character;->toLowerCase(C)C

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/4 v1, 0x1

    .line 277
    :goto_2
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v2

    if-ge v1, v2, :cond_5

    .line 278
    invoke-virtual {p2, v1}, Ljava/lang/String;->charAt(I)C

    move-result v2

    .line 279
    invoke-static {v2}, Ljava/lang/Character;->isUpperCase(C)Z

    move-result v3

    if-eqz v3, :cond_4

    const-string v3, "_"

    .line 280
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 282
    :cond_4
    invoke-static {v2}, Ljava/lang/Character;->toLowerCase(C)C

    move-result v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    .line 284
    :cond_5
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    .line 234
    :goto_3
    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 236
    instance-of p2, p3, Ljava/lang/String;

    const/16 v0, 0x22

    const-string v1, ": \""

    if-eqz p2, :cond_6

    .line 237
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    check-cast p3, Ljava/lang/String;

    .line 130
    invoke-static {p3}, Ll/ۛۜۖ;->֫(Ljava/lang/String;)Ll/ۛۜۖ;

    move-result-object p1

    invoke-static {p1}, Ll/֫֨ۖ;->֫(Ll/ۛۜۖ;)Ljava/lang/String;

    move-result-object p1

    .line 237
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    return-void

    .line 238
    :cond_6
    instance-of p2, p3, Ll/ۛۜۖ;

    if-eqz p2, :cond_7

    .line 239
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    check-cast p3, Ll/ۛۜۖ;

    invoke-static {p3}, Ll/֫֨ۖ;->֫(Ll/ۛۜۖ;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    return-void

    .line 240
    :cond_7
    instance-of p2, p3, Ll/᩸ᩴۖ;

    const-string v0, "}"

    const-string v1, "\n"

    const-string v2, " {"

    if-eqz p2, :cond_8

    .line 241
    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 242
    check-cast p3, Ll/᩸ᩴۖ;

    add-int/lit8 p2, p1, 0x2

    invoke-static {p3, p0, p2}, Ll/ۖ֡ۖ;->֫(Ll/᩸ᩴۖ;Ljava/lang/StringBuilder;I)V

    .line 243
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 244
    invoke-static {p0, p1}, Ll/ۖ֡ۖ;->֫(Ljava/lang/StringBuilder;I)V

    .line 245
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void

    .line 246
    :cond_8
    instance-of p2, p3, Ljava/util/Map$Entry;

    if-eqz p2, :cond_9

    .line 247
    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 248
    check-cast p3, Ljava/util/Map$Entry;

    add-int/lit8 p2, p1, 0x2

    const-string v2, "key"

    .line 249
    invoke-interface {p3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    invoke-static {p0, p2, v2, v3}, Ll/ۖ֡ۖ;->֫(Ljava/lang/StringBuilder;ILjava/lang/String;Ljava/lang/Object;)V

    const-string v2, "value"

    .line 250
    invoke-interface {p3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p3

    invoke-static {p0, p2, v2, p3}, Ll/ۖ֡ۖ;->֫(Ljava/lang/StringBuilder;ILjava/lang/String;Ljava/lang/Object;)V

    .line 251
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 252
    invoke-static {p0, p1}, Ll/ۖ֡ۖ;->֫(Ljava/lang/StringBuilder;I)V

    .line 253
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void

    :cond_9
    const-string p1, ": "

    .line 255
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    return-void
.end method

.method public static ֫(Ll/᩸ᩴۖ;Ljava/lang/StringBuilder;I)V
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p2

    .line 64
    new-instance v3, Ljava/util/HashSet;

    invoke-direct {v3}, Ljava/util/HashSet;-><init>()V

    .line 65
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 66
    new-instance v5, Ljava/util/TreeMap;

    invoke-direct {v5}, Ljava/util/TreeMap;-><init>()V

    .line 67
    invoke-virtual/range {p0 .. p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    move-result-object v6

    array-length v7, v6

    const/4 v8, 0x0

    const/4 v9, 0x0

    :goto_0
    const-string v10, "get"

    const-string v11, "has"

    const-string v12, "set"

    const/4 v13, 0x3

    if-ge v9, v7, :cond_7

    aget-object v14, v6, v9

    .line 68
    invoke-virtual {v14}, Ljava/lang/reflect/Method;->getModifiers()I

    move-result v15

    invoke-static {v15}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    move-result v15

    if-eqz v15, :cond_0

    goto :goto_1

    .line 71
    :cond_0
    invoke-virtual {v14}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v15}, Ljava/lang/String;->length()I

    move-result v15

    if-ge v15, v13, :cond_1

    goto :goto_1

    .line 75
    :cond_1
    invoke-virtual {v14}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v13, v12}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v12

    if-eqz v12, :cond_2

    .line 76
    invoke-virtual {v14}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v3, v10}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 80
    :cond_2
    invoke-virtual {v14}, Ljava/lang/reflect/Method;->getModifiers()I

    move-result v12

    invoke-static {v12}, Ljava/lang/reflect/Modifier;->isPublic(I)Z

    move-result v12

    if-nez v12, :cond_3

    goto :goto_1

    .line 84
    :cond_3
    invoke-virtual {v14}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v12

    array-length v12, v12

    if-eqz v12, :cond_4

    goto :goto_1

    .line 88
    :cond_4
    invoke-virtual {v14}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v12, v11}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v11

    if-eqz v11, :cond_5

    .line 89
    invoke-virtual {v14}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v4, v10, v14}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 90
    :cond_5
    invoke-virtual {v14}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v11, v10}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v10

    if-eqz v10, :cond_6

    .line 91
    invoke-virtual {v14}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v5, v10, v14}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_6
    :goto_1
    add-int/lit8 v9, v9, 0x1

    goto :goto_0

    .line 95
    :cond_7
    invoke-virtual {v5}, Ljava/util/TreeMap;->entrySet()Ljava/util/Set;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_2
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_17

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/Map$Entry;

    .line 96
    invoke-interface {v7}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/String;

    invoke-virtual {v9, v13}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v9

    const-string v13, "List"

    .line 97
    invoke-virtual {v9, v13}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v14

    if-eqz v14, :cond_8

    const-string v14, "OrBuilderList"

    .line 98
    invoke-virtual {v9, v14}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v14

    if-nez v14, :cond_8

    .line 100
    invoke-virtual {v9, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_8

    .line 103
    invoke-interface {v7}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/lang/reflect/Method;

    if-eqz v13, :cond_8

    .line 104
    invoke-virtual {v13}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object v14

    const-class v15, Ljava/util/List;

    invoke-virtual {v14, v15}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_8

    const/4 v7, 0x4

    .line 0
    invoke-static {v7, v8, v9}, Ll/ܶ᩷ۘ;->֫(IILjava/lang/String;)Ljava/lang/String;

    move-result-object v7

    new-array v9, v8, [Ljava/lang/Object;

    .line 109
    invoke-static {v13, v0, v9}, Ll/᩸ᩴۖ;->֫(Ljava/lang/reflect/Method;Ll/᩸ᩴۖ;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    .line 105
    invoke-static {v1, v2, v7, v9}, Ll/ۖ֡ۖ;->֫(Ljava/lang/StringBuilder;ILjava/lang/String;Ljava/lang/Object;)V

    goto/16 :goto_6

    :cond_8
    const-string v13, "Map"

    .line 113
    invoke-virtual {v9, v13}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v14

    if-eqz v14, :cond_9

    .line 115
    invoke-virtual {v9, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_9

    .line 118
    invoke-interface {v7}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/lang/reflect/Method;

    if-eqz v13, :cond_9

    .line 120
    invoke-virtual {v13}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object v14

    const-class v15, Ljava/util/Map;

    invoke-virtual {v14, v15}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_9

    const-class v14, Ljava/lang/Deprecated;

    .line 123
    invoke-virtual {v13, v14}, Ljava/lang/reflect/AccessibleObject;->isAnnotationPresent(Ljava/lang/Class;)Z

    move-result v14

    if-nez v14, :cond_9

    .line 125
    invoke-virtual {v13}, Ljava/lang/reflect/Method;->getModifiers()I

    move-result v14

    invoke-static {v14}, Ljava/lang/reflect/Modifier;->isPublic(I)Z

    move-result v14

    if-eqz v14, :cond_9

    const/4 v7, 0x3

    .line 0
    invoke-static {v7, v8, v9}, Ll/ܶ᩷ۘ;->֫(IILjava/lang/String;)Ljava/lang/String;

    move-result-object v7

    new-array v9, v8, [Ljava/lang/Object;

    .line 130
    invoke-static {v13, v0, v9}, Ll/᩸ᩴۖ;->֫(Ljava/lang/reflect/Method;Ll/᩸ᩴۖ;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    .line 126
    invoke-static {v1, v2, v7, v9}, Ll/ۖ֡ۖ;->֫(Ljava/lang/StringBuilder;ILjava/lang/String;Ljava/lang/Object;)V

    goto/16 :goto_6

    .line 135
    :cond_9
    invoke-virtual {v12, v9}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v3, v13}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_a

    goto/16 :goto_6

    :cond_a
    const-string v13, "Bytes"

    .line 138
    invoke-virtual {v9, v13}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v13

    if-eqz v13, :cond_b

    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 139
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    move-result v14

    add-int/lit8 v14, v14, -0x5

    invoke-virtual {v9, v8, v14}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v5, v13}, Ljava/util/TreeMap;->containsKey(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_b

    goto/16 :goto_6

    .line 146
    :cond_b
    invoke-interface {v7}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/reflect/Method;

    .line 147
    invoke-virtual {v11, v9}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v4, v13}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/lang/reflect/Method;

    if-eqz v7, :cond_16

    new-array v14, v8, [Ljava/lang/Object;

    .line 150
    invoke-static {v7, v0, v14}, Ll/᩸ᩴۖ;->֫(Ljava/lang/reflect/Method;Ll/᩸ᩴۖ;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    if-nez v13, :cond_15

    .line 178
    instance-of v13, v7, Ljava/lang/Boolean;

    const/4 v14, 0x1

    if-eqz v13, :cond_c

    .line 179
    move-object v13, v7

    check-cast v13, Ljava/lang/Boolean;

    invoke-virtual {v13}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v13

    xor-int/2addr v13, v14

    goto/16 :goto_4

    .line 181
    :cond_c
    instance-of v13, v7, Ljava/lang/Integer;

    if-eqz v13, :cond_d

    .line 182
    move-object v13, v7

    check-cast v13, Ljava/lang/Integer;

    invoke-virtual {v13}, Ljava/lang/Integer;->intValue()I

    move-result v13

    if-nez v13, :cond_13

    goto :goto_3

    .line 184
    :cond_d
    instance-of v13, v7, Ljava/lang/Float;

    if-eqz v13, :cond_e

    .line 185
    move-object v13, v7

    check-cast v13, Ljava/lang/Float;

    invoke-virtual {v13}, Ljava/lang/Float;->floatValue()F

    move-result v13

    invoke-static {v13}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v13

    if-nez v13, :cond_13

    goto :goto_3

    .line 187
    :cond_e
    instance-of v13, v7, Ljava/lang/Double;

    if-eqz v13, :cond_f

    .line 188
    move-object v13, v7

    check-cast v13, Ljava/lang/Double;

    invoke-virtual {v13}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v15

    invoke-static/range {v15 .. v16}, Ljava/lang/Double;->doubleToRawLongBits(D)J

    move-result-wide v15

    const-wide/16 v17, 0x0

    cmp-long v13, v15, v17

    if-nez v13, :cond_13

    goto :goto_3

    .line 190
    :cond_f
    instance-of v13, v7, Ljava/lang/String;

    if-eqz v13, :cond_10

    const-string v13, ""

    .line 191
    invoke-virtual {v7, v13}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v13

    goto :goto_4

    .line 193
    :cond_10
    instance-of v13, v7, Ll/ۛۜۖ;

    if-eqz v13, :cond_11

    .line 194
    sget-object v13, Ll/ۛۜۖ;->᩹:Ll/ۛۜۖ;

    invoke-virtual {v7, v13}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v13

    goto :goto_4

    .line 196
    :cond_11
    instance-of v13, v7, Ll/ۡ֡ۖ;

    if-eqz v13, :cond_12

    .line 197
    move-object v13, v7

    check-cast v13, Ll/ۡ֡ۖ;

    invoke-interface {v13}, Ll/ܺ֡ۖ;->getDefaultInstanceForType()Ll/ۡ֡ۖ;

    move-result-object v13

    if-ne v7, v13, :cond_13

    goto :goto_3

    .line 199
    :cond_12
    instance-of v13, v7, Ljava/lang/Enum;

    if-eqz v13, :cond_13

    .line 200
    move-object v13, v7

    check-cast v13, Ljava/lang/Enum;

    invoke-virtual {v13}, Ljava/lang/Enum;->ordinal()I

    move-result v13

    if-nez v13, :cond_13

    :goto_3
    const/4 v13, 0x1

    goto :goto_4

    :cond_13
    const/4 v13, 0x0

    :goto_4
    if-nez v13, :cond_14

    goto :goto_5

    :cond_14
    const/4 v14, 0x0

    goto :goto_5

    :cond_15
    new-array v14, v8, [Ljava/lang/Object;

    .line 154
    invoke-static {v13, v0, v14}, Ll/᩸ᩴۖ;->֫(Ljava/lang/reflect/Method;Ll/᩸ᩴۖ;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/lang/Boolean;

    invoke-virtual {v13}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v14

    :goto_5
    if-eqz v14, :cond_16

    .line 157
    invoke-static {v1, v2, v9, v7}, Ll/ۖ֡ۖ;->֫(Ljava/lang/StringBuilder;ILjava/lang/String;Ljava/lang/Object;)V

    :cond_16
    :goto_6
    const/4 v13, 0x3

    goto/16 :goto_2

    .line 163
    :cond_17
    instance-of v3, v0, Ll/֡ᩴۖ;

    if-eqz v3, :cond_18

    .line 164
    move-object v3, v0

    check-cast v3, Ll/֡ᩴۖ;

    iget-object v3, v3, Ll/֡ᩴۖ;->ۙ:Ll/᩵ۘۖ;

    .line 165
    invoke-virtual {v3}, Ll/᩵ۘۖ;->ۜ()Ljava/util/Iterator;

    move-result-object v3

    .line 166
    :goto_7
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_18

    .line 167
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Map$Entry;

    .line 168
    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ۚᩴۖ;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v5, "[0]"

    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v1, v2, v5, v4}, Ll/ۖ֡ۖ;->֫(Ljava/lang/StringBuilder;ILjava/lang/String;Ljava/lang/Object;)V

    goto :goto_7

    .line 172
    :cond_18
    iget-object v0, v0, Ll/᩸ᩴۖ;->᩹:Ll/ۡ֨ۖ;

    if-eqz v0, :cond_19

    .line 173
    invoke-virtual {v0, v1, v2}, Ll/ۡ֨ۖ;->֫(Ljava/lang/StringBuilder;I)V

    :cond_19
    return-void
.end method
