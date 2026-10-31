.class public final Ll/ܳܺۚ;
.super Ljava/lang/Object;
.source "35OG"


# static fields
.field public static ֫:Ljava/util/regex/Pattern;

.field public static ۧ:Ljava/util/regex/Pattern;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const-string v0, "((-)?infinityf)|(nanf)"

    const/4 v1, 0x2

    .line 35
    invoke-static {v0, v1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ll/ܳܺۚ;->ۧ:Ljava/util/regex/Pattern;

    const-string v0, "((-)?infinityd?)|(nand?)"

    .line 36
    invoke-static {v0, v1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ll/ܳܺۚ;->֫:Ljava/util/regex/Pattern;

    return-void
.end method

.method public static ֫(Ljava/lang/String;)B
    .locals 9

    if-eqz p0, :cond_10

    .line 43
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    if-eqz v0, :cond_f

    .line 48
    invoke-virtual {p0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v0

    const-string v1, "T"

    invoke-virtual {v0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    .line 49
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    sub-int/2addr v0, v1

    invoke-virtual {p0, v2, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    goto :goto_0

    .line 51
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    .line 57
    :goto_0
    aget-char v3, v0, v2

    const/16 v4, 0x2d

    if-ne v3, v4, :cond_1

    const/4 v3, 0x1

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    const/4 v3, 0x0

    .line 62
    :goto_1
    aget-char v4, v0, v1

    const/16 v5, 0x30

    const/16 v6, 0xa

    if-ne v4, v5, :cond_6

    add-int/lit8 v4, v1, 0x1

    .line 64
    array-length v5, v0

    if-ne v4, v5, :cond_2

    return v2

    .line 66
    :cond_2
    aget-char v5, v0, v4

    const/16 v7, 0x78

    if-eq v5, v7, :cond_5

    const/16 v7, 0x58

    if-ne v5, v7, :cond_3

    goto :goto_2

    :cond_3
    const/16 v1, 0x8

    .line 69
    invoke-static {v5, v1}, Ljava/lang/Character;->digit(CI)I

    move-result v1

    if-ltz v1, :cond_4

    const/16 v6, 0x8

    :cond_4
    move v1, v4

    goto :goto_3

    :cond_5
    :goto_2
    add-int/lit8 v1, v1, 0x2

    const/16 v6, 0x10

    :cond_6
    :goto_3
    const/16 v4, 0x7f

    .line 77
    div-int/lit8 v5, v6, 0x2

    div-int/2addr v4, v5

    int-to-byte v4, v4

    .line 79
    :goto_4
    array-length v5, v0

    const-string v7, " cannot fit into a byte"

    if-ge v1, v5, :cond_b

    .line 80
    aget-char v5, v0, v1

    invoke-static {v5, v6}, Ljava/lang/Character;->digit(CI)I

    move-result v5

    if-ltz v5, :cond_a

    mul-int v8, v2, v6

    int-to-byte v8, v8

    if-gt v2, v4, :cond_9

    if-gez v8, :cond_8

    neg-int v2, v5

    if-ge v8, v2, :cond_7

    goto :goto_5

    .line 89
    :cond_7
    new-instance v0, Ljava/lang/NumberFormatException;

    invoke-virtual {p0, v7}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_8
    :goto_5
    add-int/2addr v8, v5

    int-to-byte v2, v8

    add-int/lit8 v1, v1, 0x1

    goto :goto_4

    .line 86
    :cond_9
    new-instance v0, Ljava/lang/NumberFormatException;

    invoke-virtual {p0, v7}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 82
    :cond_a
    new-instance p0, Ljava/lang/NumberFormatException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "The string contains invalid an digit - \'"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    aget-char v0, v0, v1

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v0, "\'"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_b
    if-eqz v3, :cond_e

    const/16 v0, -0x80

    if-ne v2, v0, :cond_c

    goto :goto_6

    :cond_c
    if-ltz v2, :cond_d

    mul-int/lit8 v2, v2, -0x1

    int-to-byte p0, v2

    return p0

    .line 100
    :cond_d
    new-instance v0, Ljava/lang/NumberFormatException;

    invoke-virtual {p0, v7}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_e
    :goto_6
    return v2

    .line 44
    :cond_f
    new-instance p0, Ljava/lang/NumberFormatException;

    const-string v0, "string is blank"

    invoke-direct {p0, v0}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 41
    :cond_10
    new-instance p0, Ljava/lang/NumberFormatException;

    const-string v0, "string is null"

    invoke-direct {p0, v0}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ֫(J)V
    .locals 5

    const-wide/16 v0, 0xff

    const/4 v2, 0x0

    cmp-long v3, p0, v0

    if-lez v3, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-wide/16 v3, -0x80

    cmp-long v1, p0, v3

    if-gez v1, :cond_1

    const/4 v2, 0x1

    :cond_1
    or-int/2addr v0, v2

    if-nez v0, :cond_2

    return-void

    .line 408
    :cond_2
    new-instance v0, Ljava/lang/NumberFormatException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {p0, p1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, " cannot fit into a byte"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static ۧ(Ljava/lang/String;)D
    .locals 2

    .line 330
    sget-object v0, Ll/ܳܺۚ;->֫:Ljava/util/regex/Pattern;

    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    .line 331
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->matches()Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 p0, 0x1

    .line 333
    invoke-virtual {v0, p0}, Ljava/util/regex/Matcher;->start(I)I

    move-result p0

    const/4 v1, -0x1

    if-eq p0, v1, :cond_1

    const/4 p0, 0x2

    .line 334
    invoke-virtual {v0, p0}, Ljava/util/regex/Matcher;->start(I)I

    move-result p0

    if-eq p0, v1, :cond_0

    const-wide/high16 v0, -0x10000000000000L    # Double.NEGATIVE_INFINITY

    return-wide v0

    :cond_0
    const-wide/high16 v0, 0x7ff0000000000000L    # Double.POSITIVE_INFINITY

    return-wide v0

    :cond_1
    const-wide/high16 v0, 0x7ff8000000000000L    # Double.NaN

    return-wide v0

    .line 343
    :cond_2
    invoke-static {p0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v0

    return-wide v0
.end method

.method public static ۧ(J)V
    .locals 3

    const-wide/16 v0, -0x1

    cmp-long v2, p0, v0

    if-gtz v2, :cond_0

    const-wide/32 v0, -0x80000000

    cmp-long v2, p0, v0

    if-ltz v2, :cond_0

    return-void

    .line 396
    :cond_0
    new-instance v0, Ljava/lang/NumberFormatException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {p0, p1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, " cannot fit into an int"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static ܳ(Ljava/lang/String;)S
    .locals 9

    if-eqz p0, :cond_10

    .line 113
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    if-eqz v0, :cond_f

    .line 118
    invoke-virtual {p0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v0

    const-string v1, "S"

    invoke-virtual {v0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    .line 119
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    sub-int/2addr v0, v1

    invoke-virtual {p0, v2, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    goto :goto_0

    .line 121
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    .line 127
    :goto_0
    aget-char v3, v0, v2

    const/16 v4, 0x2d

    if-ne v3, v4, :cond_1

    const/4 v3, 0x1

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    const/4 v3, 0x0

    .line 132
    :goto_1
    aget-char v4, v0, v1

    const/16 v5, 0x30

    const/16 v6, 0xa

    if-ne v4, v5, :cond_6

    add-int/lit8 v4, v1, 0x1

    .line 134
    array-length v5, v0

    if-ne v4, v5, :cond_2

    return v2

    .line 136
    :cond_2
    aget-char v5, v0, v4

    const/16 v7, 0x78

    if-eq v5, v7, :cond_5

    const/16 v7, 0x58

    if-ne v5, v7, :cond_3

    goto :goto_2

    :cond_3
    const/16 v1, 0x8

    .line 139
    invoke-static {v5, v1}, Ljava/lang/Character;->digit(CI)I

    move-result v1

    if-ltz v1, :cond_4

    const/16 v6, 0x8

    :cond_4
    move v1, v4

    goto :goto_3

    :cond_5
    :goto_2
    add-int/lit8 v1, v1, 0x2

    const/16 v6, 0x10

    :cond_6
    :goto_3
    const/16 v4, 0x7fff

    .line 147
    div-int/lit8 v5, v6, 0x2

    div-int/2addr v4, v5

    int-to-short v4, v4

    .line 149
    :goto_4
    array-length v5, v0

    const-string v7, " cannot fit into a short"

    if-ge v1, v5, :cond_b

    .line 150
    aget-char v5, v0, v1

    invoke-static {v5, v6}, Ljava/lang/Character;->digit(CI)I

    move-result v5

    if-ltz v5, :cond_a

    mul-int v8, v2, v6

    int-to-short v8, v8

    if-gt v2, v4, :cond_9

    if-gez v8, :cond_8

    neg-int v2, v5

    if-ge v8, v2, :cond_7

    goto :goto_5

    .line 159
    :cond_7
    new-instance v0, Ljava/lang/NumberFormatException;

    invoke-virtual {p0, v7}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_8
    :goto_5
    add-int/2addr v8, v5

    int-to-short v2, v8

    add-int/lit8 v1, v1, 0x1

    goto :goto_4

    .line 156
    :cond_9
    new-instance v0, Ljava/lang/NumberFormatException;

    invoke-virtual {p0, v7}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 152
    :cond_a
    new-instance p0, Ljava/lang/NumberFormatException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "The string contains invalid an digit - \'"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    aget-char v0, v0, v1

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v0, "\'"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_b
    if-eqz v3, :cond_e

    const/16 v0, -0x8000

    if-ne v2, v0, :cond_c

    goto :goto_6

    :cond_c
    if-ltz v2, :cond_d

    mul-int/lit8 v2, v2, -0x1

    int-to-short p0, v2

    return p0

    .line 170
    :cond_d
    new-instance v0, Ljava/lang/NumberFormatException;

    invoke-virtual {p0, v7}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_e
    :goto_6
    return v2

    .line 114
    :cond_f
    new-instance p0, Ljava/lang/NumberFormatException;

    const-string v0, "string is blank"

    invoke-direct {p0, v0}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 111
    :cond_10
    new-instance p0, Ljava/lang/NumberFormatException;

    const-string v0, "string is null"

    invoke-direct {p0, v0}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ܽ(Ljava/lang/String;)F
    .locals 2

    .line 313
    sget-object v0, Ll/ܳܺۚ;->ۧ:Ljava/util/regex/Pattern;

    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    .line 314
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->matches()Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 p0, 0x1

    .line 316
    invoke-virtual {v0, p0}, Ljava/util/regex/Matcher;->start(I)I

    move-result p0

    const/4 v1, -0x1

    if-eq p0, v1, :cond_1

    const/4 p0, 0x2

    .line 317
    invoke-virtual {v0, p0}, Ljava/util/regex/Matcher;->start(I)I

    move-result p0

    if-eq p0, v1, :cond_0

    const/high16 p0, -0x800000    # Float.NEGATIVE_INFINITY

    return p0

    :cond_0
    const/high16 p0, 0x7f800000    # Float.POSITIVE_INFINITY

    return p0

    :cond_1
    const/high16 p0, 0x7fc00000    # Float.NaN

    return p0

    .line 326
    :cond_2
    invoke-static {p0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result p0

    return p0
.end method

.method public static ܽ(J)V
    .locals 5

    const-wide/16 v0, 0xf

    const/4 v2, 0x0

    cmp-long v3, p0, v0

    if-lez v3, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-wide/16 v3, -0x8

    cmp-long v1, p0, v3

    if-gez v1, :cond_1

    const/4 v2, 0x1

    :cond_1
    or-int/2addr v0, v2

    if-nez v0, :cond_2

    return-void

    .line 414
    :cond_2
    new-instance v0, Ljava/lang/NumberFormatException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {p0, p1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, " cannot fit into a nibble"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static ܿ(Ljava/lang/String;)J
    .locals 15

    if-eqz p0, :cond_10

    .line 247
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    if-eqz v0, :cond_f

    .line 252
    invoke-virtual {p0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v0

    const-string v1, "L"

    invoke-virtual {v0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    .line 253
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    sub-int/2addr v0, v2

    invoke-virtual {p0, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    goto :goto_0

    .line 255
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    .line 261
    :goto_0
    aget-char v3, v0, v1

    const/16 v4, 0x2d

    if-ne v3, v4, :cond_1

    const/4 v1, 0x1

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    .line 266
    :goto_1
    aget-char v3, v0, v1

    const/16 v4, 0x30

    const-wide/16 v5, 0x0

    const/16 v7, 0xa

    if-ne v3, v4, :cond_6

    add-int/lit8 v3, v1, 0x1

    .line 268
    array-length v4, v0

    if-ne v3, v4, :cond_2

    return-wide v5

    .line 270
    :cond_2
    aget-char v4, v0, v3

    const/16 v8, 0x78

    if-eq v4, v8, :cond_5

    const/16 v8, 0x58

    if-ne v4, v8, :cond_3

    goto :goto_2

    :cond_3
    const/16 v1, 0x8

    .line 273
    invoke-static {v4, v1}, Ljava/lang/Character;->digit(CI)I

    move-result v1

    if-ltz v1, :cond_4

    const/16 v7, 0x8

    :cond_4
    move v1, v3

    goto :goto_3

    :cond_5
    :goto_2
    add-int/lit8 v1, v1, 0x2

    const/16 v7, 0x10

    .line 281
    :cond_6
    :goto_3
    div-int/lit8 v3, v7, 0x2

    int-to-long v3, v3

    const-wide v8, 0x7fffffffffffffffL

    div-long/2addr v8, v3

    move-wide v3, v5

    .line 283
    :goto_4
    array-length v10, v0

    const-string v11, " cannot fit into a long"

    if-ge v1, v10, :cond_b

    .line 284
    aget-char v10, v0, v1

    invoke-static {v10, v7}, Ljava/lang/Character;->digit(CI)I

    move-result v10

    if-ltz v10, :cond_a

    int-to-long v12, v7

    mul-long v12, v12, v3

    cmp-long v14, v3, v8

    if-gtz v14, :cond_9

    cmp-long v3, v12, v5

    if-gez v3, :cond_8

    neg-int v3, v10

    int-to-long v3, v3

    cmp-long v14, v12, v3

    if-gez v14, :cond_7

    goto :goto_5

    .line 293
    :cond_7
    new-instance v0, Ljava/lang/NumberFormatException;

    invoke-virtual {p0, v11}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_8
    :goto_5
    int-to-long v3, v10

    add-long/2addr v3, v12

    add-int/lit8 v1, v1, 0x1

    goto :goto_4

    .line 290
    :cond_9
    new-instance v0, Ljava/lang/NumberFormatException;

    invoke-virtual {p0, v11}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 286
    :cond_a
    new-instance p0, Ljava/lang/NumberFormatException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "The string contains an invalid digit - \'"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    aget-char v0, v0, v1

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v0, "\'"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_b
    if-eqz v2, :cond_e

    const-wide/high16 v0, -0x8000000000000000L

    cmp-long v2, v3, v0

    if-nez v2, :cond_c

    goto :goto_6

    :cond_c
    cmp-long v0, v3, v5

    if-ltz v0, :cond_d

    const-wide/16 v0, -0x1

    mul-long v3, v3, v0

    return-wide v3

    .line 304
    :cond_d
    new-instance v0, Ljava/lang/NumberFormatException;

    invoke-virtual {p0, v11}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_e
    :goto_6
    return-wide v3

    .line 248
    :cond_f
    new-instance p0, Ljava/lang/NumberFormatException;

    const-string v0, "string is blank"

    invoke-direct {p0, v0}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 245
    :cond_10
    new-instance p0, Ljava/lang/NumberFormatException;

    const-string v0, "string is null"

    invoke-direct {p0, v0}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ᩳ(Ljava/lang/String;)I
    .locals 9

    if-eqz p0, :cond_f

    .line 183
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    if-eqz v0, :cond_e

    .line 187
    invoke-virtual {p0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    const/4 v1, 0x0

    .line 191
    aget-char v2, v0, v1

    const/16 v3, 0x2d

    if-ne v2, v3, :cond_0

    const/4 v2, 0x1

    const/4 v3, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    const/4 v3, 0x0

    .line 196
    :goto_0
    aget-char v4, v0, v2

    const/16 v5, 0x30

    const/16 v6, 0xa

    if-ne v4, v5, :cond_5

    add-int/lit8 v4, v2, 0x1

    .line 198
    array-length v5, v0

    if-ne v4, v5, :cond_1

    return v1

    .line 200
    :cond_1
    aget-char v5, v0, v4

    const/16 v7, 0x78

    if-eq v5, v7, :cond_4

    const/16 v7, 0x58

    if-ne v5, v7, :cond_2

    goto :goto_1

    :cond_2
    const/16 v2, 0x8

    .line 203
    invoke-static {v5, v2}, Ljava/lang/Character;->digit(CI)I

    move-result v2

    if-ltz v2, :cond_3

    const/16 v6, 0x8

    :cond_3
    move v2, v4

    goto :goto_2

    :cond_4
    :goto_1
    add-int/lit8 v2, v2, 0x2

    const/16 v6, 0x10

    :cond_5
    :goto_2
    const v4, 0x7fffffff

    .line 211
    div-int/lit8 v5, v6, 0x2

    div-int/2addr v4, v5

    .line 213
    :goto_3
    array-length v5, v0

    const-string v7, " cannot fit into an int"

    if-ge v2, v5, :cond_a

    .line 214
    aget-char v5, v0, v2

    invoke-static {v5, v6}, Ljava/lang/Character;->digit(CI)I

    move-result v5

    if-ltz v5, :cond_9

    mul-int v8, v1, v6

    if-gt v1, v4, :cond_8

    if-gez v8, :cond_7

    neg-int v1, v5

    if-ge v8, v1, :cond_6

    goto :goto_4

    .line 223
    :cond_6
    new-instance v0, Ljava/lang/NumberFormatException;

    invoke-virtual {p0, v7}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_7
    :goto_4
    add-int v1, v8, v5

    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    .line 220
    :cond_8
    new-instance v0, Ljava/lang/NumberFormatException;

    invoke-virtual {p0, v7}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 216
    :cond_9
    new-instance p0, Ljava/lang/NumberFormatException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "The string contains an invalid digit - \'"

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    aget-char v0, v0, v2

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v0, "\'"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_a
    if-eqz v3, :cond_d

    const/high16 v0, -0x80000000

    if-ne v1, v0, :cond_b

    goto :goto_5

    :cond_b
    if-ltz v1, :cond_c

    mul-int/lit8 v1, v1, -0x1

    return v1

    .line 234
    :cond_c
    new-instance v0, Ljava/lang/NumberFormatException;

    invoke-virtual {p0, v7}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_d
    :goto_5
    return v1

    .line 184
    :cond_e
    new-instance p0, Ljava/lang/NumberFormatException;

    const-string v0, "string is blank"

    invoke-direct {p0, v0}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 181
    :cond_f
    new-instance p0, Ljava/lang/NumberFormatException;

    const-string v0, "string is null"

    invoke-direct {p0, v0}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ᩳ(J)V
    .locals 5

    const-wide/32 v0, 0xffff

    const/4 v2, 0x0

    cmp-long v3, p0, v0

    if-lez v3, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-wide/16 v3, -0x8000

    cmp-long v1, p0, v3

    if-gez v1, :cond_1

    const/4 v2, 0x1

    :cond_1
    or-int/2addr v0, v2

    if-nez v0, :cond_2

    return-void

    .line 402
    :cond_2
    new-instance v0, Ljava/lang/NumberFormatException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {p0, p1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, " cannot fit into a short"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
