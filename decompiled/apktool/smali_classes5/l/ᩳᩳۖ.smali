.class public final Ll/ᩳᩳۖ;
.super Ll/᩺ܽۖ;
.source "8B0A"


# instance fields
.field public final ֫:Ljava/io/Serializable;


# direct methods
.method public constructor <init>(Ljava/lang/Boolean;)V
    .locals 0

    .line 48
    invoke-direct {p0}, Ll/᩺ܽۖ;-><init>()V

    .line 49
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Ll/ᩳᩳۖ;->֫:Ljava/io/Serializable;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Number;)V
    .locals 0

    .line 58
    invoke-direct {p0}, Ll/᩺ܽۖ;-><init>()V

    .line 59
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Ll/ᩳᩳۖ;->֫:Ljava/io/Serializable;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 68
    invoke-direct {p0}, Ll/᩺ܽۖ;-><init>()V

    .line 69
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Ll/ᩳᩳۖ;->֫:Ljava/io/Serializable;

    return-void
.end method

.method public static ֫(Ll/ᩳᩳۖ;)Z
    .locals 1

    .line 318
    iget-object p0, p0, Ll/ᩳᩳۖ;->֫:Ljava/io/Serializable;

    instance-of v0, p0, Ljava/lang/Number;

    if-eqz v0, :cond_1

    .line 319
    check-cast p0, Ljava/lang/Number;

    .line 320
    instance-of v0, p0, Ljava/math/BigInteger;

    if-nez v0, :cond_0

    instance-of v0, p0, Ljava/lang/Long;

    if-nez v0, :cond_0

    instance-of v0, p0, Ljava/lang/Integer;

    if-nez v0, :cond_0

    instance-of v0, p0, Ljava/lang/Short;

    if-nez v0, :cond_0

    instance-of p0, p0, Ljava/lang/Byte;

    if-eqz p0, :cond_1

    :cond_0
    const/4 p0, 0x1

    return p0

    :cond_1
    const/4 p0, 0x0

    return p0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    if-ne p0, p1, :cond_0

    goto/16 :goto_3

    :cond_0
    if-eqz p1, :cond_b

    .line 286
    const-class v0, Ll/ᩳᩳۖ;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    if-eq v0, v1, :cond_1

    goto/16 :goto_4

    .line 289
    :cond_1
    check-cast p1, Ll/ᩳᩳۖ;

    iget-object v0, p1, Ll/ᩳᩳۖ;->֫:Ljava/io/Serializable;

    .line 290
    iget-object v1, p0, Ll/ᩳᩳۖ;->֫:Ljava/io/Serializable;

    if-nez v1, :cond_2

    if-nez v0, :cond_b

    goto/16 :goto_3

    .line 293
    :cond_2
    invoke-static {p0}, Ll/ᩳᩳۖ;->֫(Ll/ᩳᩳۖ;)Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-static {p1}, Ll/ᩳᩳۖ;->֫(Ll/ᩳᩳۖ;)Z

    move-result v2

    if-eqz v2, :cond_5

    .line 294
    instance-of v1, v1, Ljava/math/BigInteger;

    if-nez v1, :cond_4

    instance-of v0, v0, Ljava/math/BigInteger;

    if-eqz v0, :cond_3

    goto :goto_0

    .line 296
    :cond_3
    invoke-virtual {p0}, Ll/ᩳᩳۖ;->᩻()Ljava/lang/Number;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    invoke-virtual {p1}, Ll/ᩳᩳۖ;->᩻()Ljava/lang/Number;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide v2

    cmp-long p1, v0, v2

    if-nez p1, :cond_b

    goto :goto_3

    .line 295
    :cond_4
    :goto_0
    invoke-virtual {p0}, Ll/ᩳᩳۖ;->ᩳ()Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {p1}, Ll/ᩳᩳۖ;->ᩳ()Ljava/math/BigInteger;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/math/BigInteger;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    .line 298
    :cond_5
    instance-of v2, v1, Ljava/lang/Number;

    if-eqz v2, :cond_a

    instance-of v2, v0, Ljava/lang/Number;

    if-eqz v2, :cond_a

    .line 299
    instance-of v2, v1, Ljava/math/BigDecimal;

    if-eqz v2, :cond_8

    instance-of v2, v0, Ljava/math/BigDecimal;

    if-eqz v2, :cond_8

    .line 183
    instance-of v2, v1, Ljava/math/BigDecimal;

    if-eqz v2, :cond_6

    .line 184
    check-cast v1, Ljava/math/BigDecimal;

    goto :goto_1

    .line 185
    :cond_6
    invoke-virtual {p0}, Ll/ᩳᩳۖ;->ܽ()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ll/ۜܿۖ;->ۧ(Ljava/lang/String;)Ljava/math/BigDecimal;

    move-result-object v1

    .line 183
    :goto_1
    instance-of v2, v0, Ljava/math/BigDecimal;

    if-eqz v2, :cond_7

    .line 184
    check-cast v0, Ljava/math/BigDecimal;

    goto :goto_2

    .line 185
    :cond_7
    invoke-virtual {p1}, Ll/ᩳᩳۖ;->ܽ()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ll/ۜܿۖ;->ۧ(Ljava/lang/String;)Ljava/math/BigDecimal;

    move-result-object v0

    .line 301
    :goto_2
    invoke-virtual {v1, v0}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    move-result p1

    if-nez p1, :cond_b

    goto :goto_3

    .line 304
    :cond_8
    invoke-virtual {p0}, Ll/ᩳᩳۖ;->ܳ()D

    move-result-wide v0

    .line 305
    invoke-virtual {p1}, Ll/ᩳᩳۖ;->ܳ()D

    move-result-wide v2

    cmpl-double p1, v0, v2

    if-eqz p1, :cond_9

    .line 308
    invoke-static {v0, v1}, Ljava/lang/Double;->isNaN(D)Z

    move-result p1

    if-eqz p1, :cond_b

    invoke-static {v2, v3}, Ljava/lang/Double;->isNaN(D)Z

    move-result p1

    if-eqz p1, :cond_b

    :cond_9
    :goto_3
    const/4 p1, 0x1

    return p1

    .line 310
    :cond_a
    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_b
    :goto_4
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 4

    .line 262
    iget-object v0, p0, Ll/ᩳᩳۖ;->֫:Ljava/io/Serializable;

    if-nez v0, :cond_0

    const/16 v0, 0x1f

    return v0

    .line 266
    :cond_0
    invoke-static {p0}, Ll/ᩳᩳۖ;->֫(Ll/ᩳᩳۖ;)Z

    move-result v1

    const/16 v2, 0x20

    if-eqz v1, :cond_1

    .line 267
    invoke-virtual {p0}, Ll/ᩳᩳۖ;->᩻()Ljava/lang/Number;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    goto :goto_0

    .line 270
    :cond_1
    instance-of v1, v0, Ljava/lang/Number;

    if-eqz v1, :cond_2

    .line 271
    invoke-virtual {p0}, Ll/ᩳᩳۖ;->᩻()Ljava/lang/Number;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v0

    :goto_0
    ushr-long v2, v0, v2

    xor-long/2addr v0, v2

    long-to-int v1, v0

    return v1

    .line 274
    :cond_2
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public final ۜ()Z
    .locals 1

    .line 104
    iget-object v0, p0, Ll/ᩳᩳۖ;->֫:Ljava/io/Serializable;

    instance-of v0, v0, Ljava/lang/Boolean;

    return v0
.end method

.method public final ۢ()Z
    .locals 1

    .line 154
    iget-object v0, p0, Ll/ᩳᩳۖ;->֫:Ljava/io/Serializable;

    instance-of v0, v0, Ljava/lang/String;

    return v0
.end method

.method public final ܳ()D
    .locals 2

    .line 128
    iget-object v0, p0, Ll/ᩳᩳۖ;->֫:Ljava/io/Serializable;

    instance-of v0, v0, Ljava/lang/Number;

    if-eqz v0, :cond_0

    .line 175
    invoke-virtual {p0}, Ll/ᩳᩳۖ;->᩻()Ljava/lang/Number;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v0

    return-wide v0

    :cond_0
    invoke-virtual {p0}, Ll/ᩳᩳۖ;->ܽ()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v0

    return-wide v0
.end method

.method public final ܽ()Ljava/lang/String;
    .locals 4

    .line 160
    iget-object v0, p0, Ll/ᩳᩳۖ;->֫:Ljava/io/Serializable;

    instance-of v1, v0, Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 161
    check-cast v0, Ljava/lang/String;

    return-object v0

    .line 128
    :cond_0
    instance-of v1, v0, Ljava/lang/Number;

    if-eqz v1, :cond_1

    .line 163
    invoke-virtual {p0}, Ll/ᩳᩳۖ;->᩻()Ljava/lang/Number;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 104
    :cond_1
    instance-of v1, v0, Ljava/lang/Boolean;

    if-eqz v1, :cond_2

    .line 165
    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 167
    :cond_2
    new-instance v1, Ljava/lang/AssertionError;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Unexpected value type: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v1
.end method

.method public final ܿ()Z
    .locals 2

    .line 104
    iget-object v0, p0, Ll/ᩳᩳۖ;->֫:Ljava/io/Serializable;

    instance-of v1, v0, Ljava/lang/Boolean;

    if-eqz v1, :cond_0

    .line 116
    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0

    .line 119
    :cond_0
    invoke-virtual {p0}, Ll/ᩳᩳۖ;->ܽ()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public final ᩳ()Ljava/math/BigInteger;
    .locals 2

    .line 193
    iget-object v0, p0, Ll/ᩳᩳۖ;->֫:Ljava/io/Serializable;

    instance-of v1, v0, Ljava/math/BigInteger;

    if-eqz v1, :cond_0

    .line 194
    check-cast v0, Ljava/math/BigInteger;

    return-object v0

    .line 195
    :cond_0
    invoke-static {p0}, Ll/ᩳᩳۖ;->֫(Ll/ᩳᩳۖ;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 196
    invoke-virtual {p0}, Ll/ᩳᩳۖ;->᩻()Ljava/lang/Number;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v0

    return-object v0

    .line 197
    :cond_1
    invoke-virtual {p0}, Ll/ᩳᩳۖ;->ܽ()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/ۜܿۖ;->ܽ(Ljava/lang/String;)Ljava/math/BigInteger;

    move-result-object v0

    return-object v0
.end method

.method public final ᩷()Z
    .locals 1

    .line 128
    iget-object v0, p0, Ll/ᩳᩳۖ;->֫:Ljava/io/Serializable;

    instance-of v0, v0, Ljava/lang/Number;

    return v0
.end method

.method public final ᩻()Ljava/lang/Number;
    .locals 2

    .line 140
    iget-object v0, p0, Ll/ᩳᩳۖ;->֫:Ljava/io/Serializable;

    instance-of v1, v0, Ljava/lang/Number;

    if-eqz v1, :cond_0

    .line 141
    check-cast v0, Ljava/lang/Number;

    return-object v0

    .line 142
    :cond_0
    instance-of v1, v0, Ljava/lang/String;

    if-eqz v1, :cond_1

    .line 143
    new-instance v1, Ll/ܰᩳۖ;

    check-cast v0, Ljava/lang/String;

    invoke-direct {v1, v0}, Ll/ܰᩳۖ;-><init>(Ljava/lang/String;)V

    return-object v1

    .line 145
    :cond_1
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Primitive is neither a number nor a string"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
