.class public final Ll/ۖۖᩳ;
.super Ljava/lang/Object;
.source "C5LF"


# instance fields
.field public ֫:Ljava/io/Serializable;


# direct methods
.method public constructor <init>()V
    .locals 15

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    const-wide/32 v2, 0x927c0

    sub-long v2, v0, v2

    const-wide/32 v4, 0x36ee80

    sub-long v4, v0, v4

    .line 14
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v6

    const/16 v7, 0xb

    const/4 v8, 0x0

    .line 15
    invoke-virtual {v6, v7, v8}, Ljava/util/Calendar;->set(II)V

    const/16 v7, 0xc

    .line 16
    invoke-virtual {v6, v7, v8}, Ljava/util/Calendar;->set(II)V

    const/16 v7, 0xd

    .line 17
    invoke-virtual {v6, v7, v8}, Ljava/util/Calendar;->set(II)V

    const/16 v7, 0xe

    .line 18
    invoke-virtual {v6, v7, v8}, Ljava/util/Calendar;->set(II)V

    .line 19
    invoke-virtual {v6}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v9

    const/16 v7, 0xa

    const/16 v11, -0x18

    .line 20
    invoke-virtual {v6, v7, v11}, Ljava/util/Calendar;->add(II)V

    .line 21
    invoke-virtual {v6}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v6

    const-wide/32 v11, 0x240c8400

    sub-long v11, v0, v11

    const-wide v13, 0x9a7ec800L

    sub-long/2addr v0, v13

    const/4 v13, 0x6

    new-array v13, v13, [J

    aput-wide v2, v13, v8

    const/4 v2, 0x1

    aput-wide v4, v13, v2

    const/4 v2, 0x2

    aput-wide v9, v13, v2

    const/4 v2, 0x3

    aput-wide v6, v13, v2

    const/4 v2, 0x4

    aput-wide v11, v13, v2

    const/4 v2, 0x5

    aput-wide v0, v13, v2

    .line 24
    iput-object v13, p0, Ll/ۖۖᩳ;->֫:Ljava/io/Serializable;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 2

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, " "

    const-string v1, ""

    .line 9
    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "_"

    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "-"

    .line 10
    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 12
    :try_start_0
    invoke-static {p1, p2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    const/16 p2, 0x10

    .line 18
    :catch_0
    :cond_0
    new-instance v0, Ljava/math/BigInteger;

    invoke-direct {v0, p1, p2}, Ljava/math/BigInteger;-><init>(Ljava/lang/String;I)V

    iput-object v0, p0, Ll/ۖۖᩳ;->֫:Ljava/io/Serializable;

    return-void
.end method

.method public static ֫(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 32
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    if-lez v0, :cond_0

    invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/16 v2, 0x2d

    if-ne v0, v2, :cond_0

    const-string v0, "-"

    .line 33
    invoke-virtual {v0, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    const/4 v0, 0x1

    .line 34
    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    .line 36
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 39
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p2

    rem-int/2addr p2, p0

    if-eqz p2, :cond_1

    .line 40
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p2

    rem-int/2addr p2, p0

    sub-int p2, p0, p2

    const/4 v2, 0x0

    :goto_0
    if-ge v2, p2, :cond_2

    const/16 v3, 0x30

    .line 43
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    const/4 p2, 0x0

    .line 46
    :cond_2
    invoke-virtual {p1}, Ljava/lang/String;->toCharArray()[C

    move-result-object p1

    array-length v2, p1

    :goto_1
    if-ge v1, v2, :cond_4

    aget-char v3, p1, v1

    if-lez p2, :cond_3

    .line 47
    rem-int v4, p2, p0

    if-nez v4, :cond_3

    const/16 v4, 0x5f

    .line 48
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 49
    :cond_3
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 p2, p2, 0x1

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 52
    :cond_4
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public ֫()I
    .locals 1

    .line 64
    iget-object v0, p0, Ll/ۖۖᩳ;->֫:Ljava/io/Serializable;

    check-cast v0, Ljava/math/BigInteger;

    invoke-virtual {v0}, Ljava/math/BigInteger;->intValue()I

    move-result v0

    return v0
.end method

.method public ֫(J)I
    .locals 6

    .line 28
    iget-object v0, p0, Ll/ۖۖᩳ;->֫:Ljava/io/Serializable;

    check-cast v0, [J

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    .line 30
    aget-wide v3, v0, v2

    cmp-long v5, p1, v3

    if-lez v5, :cond_0

    return v2

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return v1
.end method

.method public ۧ()Ljava/lang/String;
    .locals 3

    .line 28
    iget-object v0, p0, Ll/ۖۖᩳ;->֫:Ljava/io/Serializable;

    check-cast v0, Ljava/math/BigInteger;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Ljava/math/BigInteger;->toString(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "0b"

    const/4 v2, 0x4

    invoke-static {v2, v0, v1}, Ll/ۖۖᩳ;->֫(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public ܽ()Ljava/lang/String;
    .locals 3

    .line 22
    iget-object v0, p0, Ll/ۖۖᩳ;->֫:Ljava/io/Serializable;

    check-cast v0, Ljava/math/BigInteger;

    invoke-virtual {v0}, Ljava/math/BigInteger;->intValue()I

    move-result v1

    const/16 v2, 0xa

    if-gez v1, :cond_0

    .line 23
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v2}, Ljava/math/BigInteger;->toString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ", "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/math/BigInteger;->intValue()I

    move-result v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " (32bit)"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 24
    :cond_0
    invoke-virtual {v0, v2}, Ljava/math/BigInteger;->toString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public ܿ()Ljava/lang/String;
    .locals 3

    .line 60
    iget-object v0, p0, Ll/ۖۖᩳ;->֫:Ljava/io/Serializable;

    check-cast v0, Ljava/math/BigInteger;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Ljava/math/BigInteger;->toString(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "0_"

    const/4 v2, 0x4

    invoke-static {v2, v0, v1}, Ll/ۖۖᩳ;->֫(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public ᩳ()Ljava/lang/String;
    .locals 3

    .line 56
    iget-object v0, p0, Ll/ۖۖᩳ;->֫:Ljava/io/Serializable;

    check-cast v0, Ljava/math/BigInteger;

    const/16 v1, 0x10

    invoke-virtual {v0, v1}, Ljava/math/BigInteger;->toString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v0

    const-string v1, "0x"

    const/16 v2, 0x8

    invoke-static {v2, v0, v1}, Ll/ۖۖᩳ;->֫(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
