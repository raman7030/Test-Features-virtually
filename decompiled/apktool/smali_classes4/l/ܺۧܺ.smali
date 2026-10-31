.class public final Ll/ܺۧܺ;
.super Ljava/lang/Object;
.source "HAVQ"

# interfaces
.implements Ljava/lang/Comparable;


# instance fields
.field public ֫֫:I

.field public final ۗ:Ljava/lang/Class;

.field public final ۙ:Z

.field public final ۛ:Z

.field public final ۟:J

.field public final ۤ:Ljava/lang/String;

.field public final ۧ֫:I

.field public final ۨ:Z

.field public final ۫:Ljava/lang/reflect/Type;

.field public final ۬:Z

.field public final ܰ:Ljava/lang/String;

.field public final ᩶:Ljava/lang/reflect/Field;

.field public final ᩸:[Ljava/lang/String;

.field public final ᩹:Ljava/lang/Class;

.field public final ᩺:Ljava/lang/reflect/Method;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/lang/reflect/Field;II)V
    .locals 1

    .line 52
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 27
    iput v0, p0, Ll/ܺۧܺ;->֫֫:I

    if-gez p6, :cond_0

    const/4 p6, 0x0

    .line 57
    :cond_0
    iput-object p1, p0, Ll/ܺۧܺ;->ܰ:Ljava/lang/String;

    .line 58
    iput-object p2, p0, Ll/ܺۧܺ;->᩹:Ljava/lang/Class;

    .line 59
    iput-object p3, p0, Ll/ܺۧܺ;->ۗ:Ljava/lang/Class;

    .line 60
    iput-object p4, p0, Ll/ܺۧܺ;->۫:Ljava/lang/reflect/Type;

    const/4 p2, 0x0

    .line 61
    iput-object p2, p0, Ll/ܺۧܺ;->᩺:Ljava/lang/reflect/Method;

    .line 62
    iput-object p5, p0, Ll/ܺۧܺ;->᩶:Ljava/lang/reflect/Field;

    .line 63
    iput p6, p0, Ll/ܺۧܺ;->֫֫:I

    .line 64
    iput p7, p0, Ll/ܺۧܺ;->ۧ֫:I

    .line 66
    invoke-virtual {p3}, Ljava/lang/Class;->isEnum()Z

    move-result p4

    const/4 p6, 0x1

    if-eqz p4, :cond_1

    const-class p4, Ll/۠۟ۡ;

    invoke-virtual {p4, p3}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result p3

    if-nez p3, :cond_1

    const/4 p3, 0x1

    goto :goto_0

    :cond_1
    const/4 p3, 0x0

    :goto_0
    iput-boolean p3, p0, Ll/ܺۧܺ;->ۨ:Z

    if-eqz p5, :cond_2

    .line 72
    invoke-virtual {p5}, Ljava/lang/reflect/Field;->getModifiers()I

    move-result p3

    .line 73
    iput-boolean p6, p0, Ll/ܺۧܺ;->ۙ:Z

    .line 74
    invoke-static {p3}, Ljava/lang/reflect/Modifier;->isTransient(I)Z

    move-result p3

    iput-boolean p3, p0, Ll/ܺۧܺ;->۬:Z

    goto :goto_1

    .line 76
    :cond_2
    iput-boolean v0, p0, Ll/ܺۧܺ;->ۙ:Z

    .line 77
    iput-boolean v0, p0, Ll/ܺۧܺ;->۬:Z

    .line 79
    :goto_1
    iput-boolean v0, p0, Ll/ܺۧܺ;->ۛ:Z

    const-wide p3, -0x340d631b7bdddcdbL    # -7.302176725335867E57

    const/4 p5, 0x0

    .line 82
    :goto_2
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p6

    if-ge p5, p6, :cond_3

    .line 83
    invoke-virtual {p1, p5}, Ljava/lang/String;->charAt(I)C

    move-result p6

    int-to-long p6, p6

    xor-long/2addr p3, p6

    const-wide p6, 0x100000001b3L

    mul-long p3, p3, p6

    add-int/lit8 p5, p5, 0x1

    goto :goto_2

    .line 87
    :cond_3
    iput-wide p3, p0, Ll/ܺۧܺ;->۟:J

    .line 89
    iput-object p2, p0, Ll/ܺۧܺ;->ۤ:Ljava/lang/String;

    new-array p1, v0, [Ljava/lang/String;

    .line 90
    iput-object p1, p0, Ll/ܺۧܺ;->᩸:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/reflect/Method;Ljava/lang/reflect/Field;Ljava/lang/Class;Ljava/lang/reflect/Type;IILl/۬۟ۡ;Ll/۬۟ۡ;)V
    .locals 4

    .line 102
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p8, 0x0

    .line 27
    iput p8, p0, Ll/ܺۧܺ;->֫֫:I

    if-gez p6, :cond_0

    const/4 p6, 0x0

    .line 107
    :cond_0
    iput-object p1, p0, Ll/ܺۧܺ;->ܰ:Ljava/lang/String;

    .line 108
    iput-object p2, p0, Ll/ܺۧܺ;->᩺:Ljava/lang/reflect/Method;

    .line 109
    iput-object p3, p0, Ll/ܺۧܺ;->᩶:Ljava/lang/reflect/Field;

    .line 110
    iput p6, p0, Ll/ܺۧܺ;->֫֫:I

    .line 113
    iput p7, p0, Ll/ܺۧܺ;->ۧ֫:I

    .line 115
    invoke-virtual {p0}, Ll/ܺۧܺ;->֫()Ll/۬۟ۡ;

    move-result-object p6

    const/4 p7, 0x0

    if-eqz p6, :cond_2

    .line 118
    invoke-interface {p6}, Ll/۬۟ۡ;->format()Ljava/lang/String;

    move-result-object p9

    .line 120
    invoke-virtual {p9}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_1

    move-object p9, p7

    .line 124
    :cond_1
    invoke-interface {p6}, Ll/۬۟ۡ;->alternateNames()[Ljava/lang/String;

    move-result-object p6

    iput-object p6, p0, Ll/ܺۧܺ;->᩸:[Ljava/lang/String;

    goto :goto_0

    :cond_2
    new-array p6, p8, [Ljava/lang/String;

    .line 126
    iput-object p6, p0, Ll/ܺۧܺ;->᩸:[Ljava/lang/String;

    move-object p9, p7

    .line 128
    :goto_0
    iput-object p9, p0, Ll/ܺۧܺ;->ۤ:Ljava/lang/String;

    const/4 p6, 0x1

    if-eqz p3, :cond_6

    .line 131
    invoke-virtual {p3}, Ljava/lang/reflect/Field;->getModifiers()I

    move-result p9

    if-eqz p2, :cond_4

    and-int/lit8 v0, p9, 0x1

    if-eqz v0, :cond_3

    .line 132
    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p3}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v1

    if-ne v0, v1, :cond_3

    goto :goto_1

    :cond_3
    const/4 v0, 0x0

    goto :goto_2

    :cond_4
    :goto_1
    const/4 v0, 0x1

    :goto_2
    iput-boolean v0, p0, Ll/ܺۧܺ;->ۙ:Z

    and-int/lit16 p9, p9, 0x80

    if-eqz p9, :cond_5

    const/4 p9, 0x1

    goto :goto_3

    :cond_5
    const/4 p9, 0x0

    .line 133
    :goto_3
    iput-boolean p9, p0, Ll/ܺۧܺ;->۬:Z

    goto :goto_4

    .line 135
    :cond_6
    iput-boolean p8, p0, Ll/ܺۧܺ;->ۙ:Z

    .line 136
    iput-boolean p8, p0, Ll/ܺۧܺ;->۬:Z

    :goto_4
    const-wide v0, -0x340d631b7bdddcdbL    # -7.302176725335867E57

    const/4 p9, 0x0

    .line 140
    :goto_5
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    if-ge p9, v2, :cond_7

    .line 141
    invoke-virtual {p1, p9}, Ljava/lang/String;->charAt(I)C

    move-result v2

    int-to-long v2, v2

    xor-long/2addr v0, v2

    const-wide v2, 0x100000001b3L

    mul-long v0, v0, v2

    add-int/lit8 p9, p9, 0x1

    goto :goto_5

    .line 145
    :cond_7
    iput-wide v0, p0, Ll/ܺۧܺ;->۟:J

    .line 149
    const-class p1, Ljava/lang/String;

    if-eqz p2, :cond_c

    .line 150
    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object p3

    .line 151
    array-length p9, p3

    const-class v0, Ljava/lang/Class;

    if-ne p9, p6, :cond_a

    .line 152
    aget-object p3, p3, p8

    if-eq p3, v0, :cond_9

    if-eq p3, p1, :cond_9

    .line 155
    invoke-virtual {p3}, Ljava/lang/Class;->isPrimitive()Z

    move-result p1

    if-eqz p1, :cond_8

    goto :goto_6

    .line 158
    :cond_8
    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getGenericParameterTypes()[Ljava/lang/reflect/Type;

    move-result-object p1

    aget-object p1, p1, p8

    goto :goto_7

    :cond_9
    :goto_6
    move-object p1, p3

    .line 160
    :goto_7
    iput-boolean p8, p0, Ll/ܺۧܺ;->ۛ:Z

    goto :goto_9

    .line 162
    :cond_a
    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object p3

    if-ne p3, v0, :cond_b

    move-object p1, p3

    goto :goto_8

    .line 166
    :cond_b
    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getGenericReturnType()Ljava/lang/reflect/Type;

    move-result-object p1

    .line 168
    :goto_8
    iput-boolean p6, p0, Ll/ܺۧܺ;->ۛ:Z

    .line 170
    :goto_9
    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    move-result-object p2

    iput-object p2, p0, Ll/ܺۧܺ;->᩹:Ljava/lang/Class;

    goto :goto_c

    .line 172
    :cond_c
    invoke-virtual {p3}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object p2

    .line 173
    invoke-virtual {p2}, Ljava/lang/Class;->isPrimitive()Z

    move-result p6

    if-nez p6, :cond_e

    if-eq p2, p1, :cond_e

    .line 175
    invoke-virtual {p2}, Ljava/lang/Class;->isEnum()Z

    move-result p1

    if-eqz p1, :cond_d

    goto :goto_a

    .line 178
    :cond_d
    invoke-virtual {p3}, Ljava/lang/reflect/Field;->getGenericType()Ljava/lang/reflect/Type;

    move-result-object p1

    goto :goto_b

    :cond_e
    :goto_a
    move-object p1, p2

    .line 181
    :goto_b
    invoke-virtual {p3}, Ljava/lang/reflect/Field;->getDeclaringClass()Ljava/lang/Class;

    move-result-object p6

    iput-object p6, p0, Ll/ܺۧܺ;->᩹:Ljava/lang/Class;

    .line 182
    invoke-virtual {p3}, Ljava/lang/reflect/Field;->getModifiers()I

    move-result p3

    invoke-static {p3}, Ljava/lang/reflect/Modifier;->isFinal(I)Z

    move-result p3

    iput-boolean p3, p0, Ll/ܺۧܺ;->ۛ:Z

    move-object p3, p2

    .line 185
    :goto_c
    const-class p2, Ll/۠۟ۡ;

    const-class p6, Ljava/lang/Object;

    if-ne p3, p6, :cond_15

    instance-of p9, p1, Ljava/lang/reflect/TypeVariable;

    if-eqz p9, :cond_15

    .line 189
    move-object p9, p1

    check-cast p9, Ljava/lang/reflect/TypeVariable;

    .line 193
    instance-of v0, p5, Ljava/lang/reflect/ParameterizedType;

    if-eqz v0, :cond_f

    .line 194
    move-object v0, p5

    check-cast v0, Ljava/lang/reflect/ParameterizedType;

    .line 195
    invoke-interface {v0}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    move-result-object v0

    goto :goto_d

    :cond_f
    move-object v0, p7

    :goto_d
    move-object v1, p4

    :goto_e
    if-eqz v1, :cond_11

    if-eq v1, p6, :cond_11

    .line 198
    iget-object v2, p0, Ll/ܺۧܺ;->᩹:Ljava/lang/Class;

    if-eq v1, v2, :cond_11

    .line 199
    invoke-virtual {v1}, Ljava/lang/Class;->getGenericSuperclass()Ljava/lang/reflect/Type;

    move-result-object v2

    .line 201
    instance-of v3, v2, Ljava/lang/reflect/ParameterizedType;

    if-eqz v3, :cond_10

    .line 202
    check-cast v2, Ljava/lang/reflect/ParameterizedType;

    .line 203
    invoke-interface {v2}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    move-result-object v2

    .line 204
    invoke-virtual {v1}, Ljava/lang/Class;->getTypeParameters()[Ljava/lang/reflect/TypeVariable;

    move-result-object v3

    invoke-static {v2, v3, v0}, Ll/᩵ۧܺ;->֫([Ljava/lang/reflect/Type;[Ljava/lang/reflect/TypeVariable;[Ljava/lang/reflect/Type;)Z

    move-object v0, v2

    .line 198
    :cond_10
    invoke-virtual {v1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object v1

    goto :goto_e

    :cond_11
    if-eqz v0, :cond_13

    .line 210
    iget-object p6, p0, Ll/ܺۧܺ;->᩹:Ljava/lang/Class;

    invoke-virtual {p6}, Ljava/lang/Class;->getTypeParameters()[Ljava/lang/reflect/TypeVariable;

    move-result-object p6

    const/4 v1, 0x0

    .line 211
    :goto_f
    array-length v2, p6

    if-ge v1, v2, :cond_13

    .line 212
    aget-object v2, p6, v1

    invoke-virtual {p9, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_12

    .line 213
    aget-object p7, v0, v1

    goto :goto_10

    :cond_12
    add-int/lit8 v1, v1, 0x1

    goto :goto_f

    :cond_13
    :goto_10
    if-eqz p7, :cond_15

    .line 221
    invoke-static {p7}, Ll/᩵ۧܺ;->֫(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object p1

    iput-object p1, p0, Ll/ܺۧܺ;->ۗ:Ljava/lang/Class;

    .line 222
    iput-object p7, p0, Ll/ܺۧܺ;->۫:Ljava/lang/reflect/Type;

    .line 224
    invoke-virtual {p3}, Ljava/lang/Class;->isEnum()Z

    move-result p1

    if-eqz p1, :cond_14

    invoke-virtual {p2, p3}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result p1

    if-nez p1, :cond_14

    const/4 p8, 0x1

    :cond_14
    iput-boolean p8, p0, Ll/ܺۧܺ;->ۨ:Z

    return-void

    .line 231
    :cond_15
    instance-of p6, p1, Ljava/lang/Class;

    if-nez p6, :cond_19

    if-eqz p5, :cond_16

    goto :goto_11

    :cond_16
    move-object p5, p4

    .line 232
    :goto_11
    invoke-static {p4, p5, p1}, Ll/ܺۧܺ;->֫(Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;

    move-result-object p4

    if-eq p4, p1, :cond_18

    .line 234
    instance-of p1, p4, Ljava/lang/reflect/ParameterizedType;

    if-eqz p1, :cond_17

    .line 235
    invoke-static {p4}, Ll/᩵ۧܺ;->֫(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object p1

    :goto_12
    move-object p3, p1

    goto :goto_13

    .line 236
    :cond_17
    instance-of p1, p4, Ljava/lang/Class;

    if-eqz p1, :cond_18

    .line 237
    invoke-static {p4}, Ll/᩵ۧܺ;->֫(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object p1

    goto :goto_12

    :cond_18
    :goto_13
    move-object p1, p4

    .line 242
    :cond_19
    iput-object p1, p0, Ll/ܺۧܺ;->۫:Ljava/lang/reflect/Type;

    .line 243
    iput-object p3, p0, Ll/ܺۧܺ;->ۗ:Ljava/lang/Class;

    .line 245
    invoke-virtual {p3}, Ljava/lang/Class;->isArray()Z

    move-result p1

    if-nez p1, :cond_1a

    .line 246
    invoke-virtual {p3}, Ljava/lang/Class;->isEnum()Z

    move-result p1

    if-eqz p1, :cond_1a

    .line 247
    invoke-virtual {p2, p3}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result p1

    if-nez p1, :cond_1a

    const/4 p8, 0x1

    :cond_1a
    iput-boolean p8, p0, Ll/ܺۧܺ;->ۨ:Z

    return-void
.end method

.method public static ֫(Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;
    .locals 9

    if-eqz p0, :cond_c

    if-nez p1, :cond_0

    goto/16 :goto_4

    .line 255
    :cond_0
    instance-of v0, p2, Ljava/lang/reflect/GenericArrayType;

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    .line 256
    move-object v0, p2

    check-cast v0, Ljava/lang/reflect/GenericArrayType;

    .line 257
    invoke-interface {v0}, Ljava/lang/reflect/GenericArrayType;->getGenericComponentType()Ljava/lang/reflect/Type;

    move-result-object v0

    .line 258
    invoke-static {p0, p1, v0}, Ll/ܺۧܺ;->֫(Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;

    move-result-object p0

    if-eq v0, p0, :cond_1

    .line 260
    invoke-static {p0}, Ll/᩵ۧܺ;->֫(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object p0

    invoke-static {p0, v1}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    return-object p0

    :cond_1
    return-object p2

    .line 267
    :cond_2
    invoke-static {p1}, Ll/᩵ۧܺ;->ᩳ(Ljava/lang/reflect/Type;)Z

    move-result v0

    if-nez v0, :cond_3

    goto/16 :goto_4

    .line 271
    :cond_3
    instance-of v0, p2, Ljava/lang/reflect/TypeVariable;

    if-eqz v0, :cond_5

    .line 272
    invoke-static {p1}, Ll/᩵ۧܺ;->ܽ(Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;

    move-result-object v0

    check-cast v0, Ljava/lang/reflect/ParameterizedType;

    .line 273
    invoke-static {v0}, Ll/᩵ۧܺ;->֫(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object v1

    .line 274
    move-object v2, p2

    check-cast v2, Ljava/lang/reflect/TypeVariable;

    const/4 v3, 0x0

    .line 276
    :goto_0
    invoke-virtual {v1}, Ljava/lang/Class;->getTypeParameters()[Ljava/lang/reflect/TypeVariable;

    move-result-object v4

    array-length v4, v4

    if-ge v3, v4, :cond_5

    .line 277
    invoke-virtual {v1}, Ljava/lang/Class;->getTypeParameters()[Ljava/lang/reflect/TypeVariable;

    move-result-object v4

    aget-object v4, v4, v3

    invoke-interface {v4}, Ljava/lang/reflect/TypeVariable;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v2}, Ljava/lang/reflect/TypeVariable;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    .line 278
    invoke-interface {v0}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    move-result-object p0

    aget-object p0, p0, v3

    return-object p0

    :cond_4
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 284
    :cond_5
    instance-of v0, p2, Ljava/lang/reflect/ParameterizedType;

    if-eqz v0, :cond_c

    .line 285
    move-object v0, p2

    check-cast v0, Ljava/lang/reflect/ParameterizedType;

    .line 287
    invoke-interface {v0}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    move-result-object v1

    .line 293
    instance-of v2, p1, Ljava/lang/reflect/ParameterizedType;

    const/4 v3, 0x0

    if-eqz v2, :cond_6

    .line 294
    check-cast p1, Ljava/lang/reflect/ParameterizedType;

    .line 295
    invoke-virtual {p0}, Ljava/lang/Class;->getTypeParameters()[Ljava/lang/reflect/TypeVariable;

    move-result-object p0

    goto :goto_1

    .line 296
    :cond_6
    invoke-virtual {p0}, Ljava/lang/Class;->getGenericSuperclass()Ljava/lang/reflect/Type;

    move-result-object p1

    instance-of p1, p1, Ljava/lang/reflect/ParameterizedType;

    if-eqz p1, :cond_7

    .line 297
    invoke-virtual {p0}, Ljava/lang/Class;->getGenericSuperclass()Ljava/lang/reflect/Type;

    move-result-object p1

    check-cast p1, Ljava/lang/reflect/ParameterizedType;

    .line 298
    invoke-virtual {p0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Class;->getTypeParameters()[Ljava/lang/reflect/TypeVariable;

    move-result-object p0

    goto :goto_1

    :cond_7
    move-object p0, v3

    move-object p1, p0

    :goto_1
    const/4 v2, 0x0

    const/4 v4, 0x0

    .line 301
    :goto_2
    array-length v5, v1

    if-ge v2, v5, :cond_b

    if-eqz p1, :cond_b

    .line 302
    aget-object v5, v1, v2

    .line 303
    instance-of v6, v5, Ljava/lang/reflect/TypeVariable;

    if-eqz v6, :cond_a

    .line 304
    check-cast v5, Ljava/lang/reflect/TypeVariable;

    const/4 v6, 0x0

    .line 306
    :goto_3
    array-length v7, p0

    if-ge v6, v7, :cond_a

    .line 307
    aget-object v7, p0, v6

    invoke-interface {v7}, Ljava/lang/reflect/TypeVariable;->getName()Ljava/lang/String;

    move-result-object v7

    invoke-interface {v5}, Ljava/lang/reflect/TypeVariable;->getName()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_9

    if-nez v3, :cond_8

    .line 309
    invoke-interface {p1}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    move-result-object v3

    .line 311
    :cond_8
    aget-object v4, v3, v6

    aput-object v4, v1, v2

    const/4 v4, 0x1

    :cond_9
    add-int/lit8 v6, v6, 0x1

    goto :goto_3

    :cond_a
    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_b
    if-eqz v4, :cond_c

    .line 318
    new-instance p0, Ll/ᩴۧܺ;

    invoke-interface {v0}, Ljava/lang/reflect/ParameterizedType;->getOwnerType()Ljava/lang/reflect/Type;

    move-result-object p1

    .line 319
    invoke-interface {v0}, Ljava/lang/reflect/ParameterizedType;->getRawType()Ljava/lang/reflect/Type;

    move-result-object p2

    invoke-direct {p0, v1, p1, p2}, Ll/ᩴۧܺ;-><init>([Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;)V

    return-object p0

    :cond_c
    :goto_4
    return-object p2
.end method


# virtual methods
.method public final bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 18
    check-cast p1, Ll/ܺۧܺ;

    invoke-virtual {p0, p1}, Ll/ܺۧܺ;->֫(Ll/ܺۧܺ;)I

    move-result p1

    return p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 328
    iget-object v0, p0, Ll/ܺۧܺ;->ܰ:Ljava/lang/String;

    return-object v0
.end method

.method public final ֫(Ll/ܺۧܺ;)I
    .locals 2

    .line 332
    iget v0, p1, Ll/ܺۧܺ;->֫֫:I

    iget v1, p0, Ll/ܺۧܺ;->֫֫:I

    if-ge v1, v0, :cond_0

    const/4 p1, -0x1

    return p1

    :cond_0
    if-le v1, v0, :cond_1

    const/4 p1, 0x1

    return p1

    .line 340
    :cond_1
    iget-object v0, p0, Ll/ܺۧܺ;->ܰ:Ljava/lang/String;

    iget-object p1, p1, Ll/ܺۧܺ;->ܰ:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result p1

    return p1
.end method

.method public final ֫()Ll/۬۟ۡ;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method
