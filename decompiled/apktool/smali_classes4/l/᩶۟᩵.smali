.class public final Ll/᩶۟᩵;
.super Ljava/lang/Object;
.source "R5PD"


# static fields
.field public static final ֡:Ljava/util/regex/Pattern;

.field public static final ֫:[B

.field public static final ۖ:Ljava/nio/charset/Charset;

.field public static final ۘ:Ll/ۨܽ֡;

.field public static final ۚ:Ljava/lang/reflect/Method;

.field public static final ۜ:Ll/ۨܽ֡;

.field public static final ۡ:Ljava/nio/charset/Charset;

.field public static final ۢ:Ll/ۨܽ֡;

.field public static final ۧ:Ll/ۖ۟᩵;

.field public static final ܳ:Ljava/util/TimeZone;

.field public static final ܺ:Ll/ۨܽ֡;

.field public static final ܽ:Ll/֡۟᩵;

.field public static final ܿ:Ljava/util/Comparator;

.field public static final ᩳ:[Ljava/lang/String;

.field public static final ᩴ:Ljava/nio/charset/Charset;

.field public static final ᩵:Ll/ۨܽ֡;

.field public static final ᩷:Ljava/nio/charset/Charset;

.field public static final ᩻:Ljava/nio/charset/Charset;


# direct methods
.method public static constructor <clinit>()V
    .locals 7

    .line 59
    const-class v0, Ljava/lang/Throwable;

    const/4 v1, 0x0

    new-array v2, v1, [B

    sput-object v2, Ll/᩶۟᩵;->֫:[B

    new-array v3, v1, [Ljava/lang/String;

    .line 60
    sput-object v3, Ll/᩶۟᩵;->ᩳ:[Ljava/lang/String;

    .line 210
    new-instance v3, Ll/۫ܽ֡;

    invoke-direct {v3}, Ll/۫ܽ֡;-><init>()V

    .line 1091
    invoke-virtual {v3, v2, v1, v1}, Ll/۫ܽ֡;->write([BII)V

    int-to-long v4, v1

    const/4 v6, 0x0

    .line 211
    invoke-static {v6, v4, v5, v3}, Ll/֡۟᩵;->֫(Ll/ܰܰ᩵;JLl/۫ܽ֡;)Ll/֡۟᩵;

    move-result-object v3

    .line 62
    sput-object v3, Ll/᩶۟᩵;->ܽ:Ll/֡۟᩵;

    .line 63
    invoke-static {v6, v2}, Ll/ۖ۟᩵;->֫(Ll/ܰܰ᩵;[B)Ll/ۖ۟᩵;

    move-result-object v2

    sput-object v2, Ll/᩶۟᩵;->ۧ:Ll/ۖ۟᩵;

    const-string v2, "efbbbf"

    .line 65
    invoke-static {v2}, Ll/ۨܽ֡;->ۧ(Ljava/lang/String;)Ll/ۨܽ֡;

    move-result-object v2

    sput-object v2, Ll/᩶۟᩵;->᩵:Ll/ۨܽ֡;

    const-string v2, "feff"

    .line 66
    invoke-static {v2}, Ll/ۨܽ֡;->ۧ(Ljava/lang/String;)Ll/ۨܽ֡;

    move-result-object v2

    sput-object v2, Ll/᩶۟᩵;->ۜ:Ll/ۨܽ֡;

    const-string v2, "fffe"

    .line 67
    invoke-static {v2}, Ll/ۨܽ֡;->ۧ(Ljava/lang/String;)Ll/ۨܽ֡;

    move-result-object v2

    sput-object v2, Ll/᩶۟᩵;->ۢ:Ll/ۨܽ֡;

    const-string v2, "0000ffff"

    .line 68
    invoke-static {v2}, Ll/ۨܽ֡;->ۧ(Ljava/lang/String;)Ll/ۨܽ֡;

    move-result-object v2

    sput-object v2, Ll/᩶۟᩵;->ܺ:Ll/ۨܽ֡;

    const-string v2, "ffff0000"

    .line 69
    invoke-static {v2}, Ll/ۨܽ֡;->ۧ(Ljava/lang/String;)Ll/ۨܽ֡;

    move-result-object v2

    sput-object v2, Ll/᩶۟᩵;->ۘ:Ll/ۨܽ֡;

    const-string v2, "UTF-8"

    .line 71
    invoke-static {v2}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v2

    sput-object v2, Ll/᩶۟᩵;->ᩴ:Ljava/nio/charset/Charset;

    const-string v2, "ISO-8859-1"

    .line 72
    invoke-static {v2}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    const-string v2, "UTF-16BE"

    .line 73
    invoke-static {v2}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v2

    sput-object v2, Ll/᩶۟᩵;->᩻:Ljava/nio/charset/Charset;

    const-string v2, "UTF-16LE"

    .line 74
    invoke-static {v2}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v2

    sput-object v2, Ll/᩶۟᩵;->᩷:Ljava/nio/charset/Charset;

    const-string v2, "UTF-32BE"

    .line 75
    invoke-static {v2}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v2

    sput-object v2, Ll/᩶۟᩵;->ۡ:Ljava/nio/charset/Charset;

    const-string v2, "UTF-32LE"

    .line 76
    invoke-static {v2}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v2

    sput-object v2, Ll/᩶۟᩵;->ۖ:Ljava/nio/charset/Charset;

    const-string v2, "GMT"

    .line 79
    invoke-static {v2}, Ll/ۗ۬ᩴ;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    move-result-object v2

    sput-object v2, Ll/᩶۟᩵;->ܳ:Ljava/util/TimeZone;

    .line 81
    new-instance v2, Ll/᩸۟᩵;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    sput-object v2, Ll/᩶۟᩵;->ܿ:Ljava/util/Comparator;

    :try_start_0
    const-string v2, "addSuppressed"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Class;

    aput-object v0, v3, v1

    .line 92
    invoke-virtual {v0, v2, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v6
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 96
    :catch_0
    sput-object v6, Ll/᩶۟᩵;->ۚ:Ljava/lang/reflect/Method;

    const-string v0, "([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)"

    .line 118
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ll/᩶۟᩵;->֡:Ljava/util/regex/Pattern;

    return-void
.end method

.method public static ֫(C)I
    .locals 2

    const/16 v0, 0x30

    if-lt p0, v0, :cond_0

    const/16 v1, 0x39

    if-gt p0, v1, :cond_0

    sub-int/2addr p0, v0

    return p0

    :cond_0
    const/16 v0, 0x61

    if-lt p0, v0, :cond_1

    const/16 v0, 0x66

    if-gt p0, v0, :cond_1

    add-int/lit8 p0, p0, -0x57

    return p0

    :cond_1
    const/16 v0, 0x41

    if-lt p0, v0, :cond_2

    const/16 v0, 0x46

    if-gt p0, v0, :cond_2

    add-int/lit8 p0, p0, -0x37

    return p0

    :cond_2
    const/4 p0, -0x1

    return p0
.end method

.method public static ֫(JLjava/util/concurrent/TimeUnit;)I
    .locals 5

    const-wide/16 v0, 0x0

    cmp-long v2, p0, v0

    if-ltz v2, :cond_4

    if-eqz p2, :cond_3

    .line 502
    invoke-virtual {p2, p0, p1}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide p0

    const-wide/32 v3, 0x7fffffff

    cmp-long p2, p0, v3

    if-gtz p2, :cond_2

    cmp-long p2, p0, v0

    if-nez p2, :cond_1

    if-gtz v2, :cond_0

    goto :goto_0

    .line 504
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "timeout too small."

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    :goto_0
    long-to-int p1, p0

    return p1

    .line 503
    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "timeout too large."

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 501
    :cond_3
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "unit == null"

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 500
    :cond_4
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "timeout < 0"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ֫(Ljava/lang/String;IIC)I
    .locals 1

    :goto_0
    if-ge p1, p2, :cond_1

    .line 390
    invoke-virtual {p0, p1}, Ljava/lang/String;->charAt(I)C

    move-result v0

    if-ne v0, p3, :cond_0

    return p1

    :cond_0
    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_1
    return p2
.end method

.method public static ֫(Ljava/lang/String;IILjava/lang/String;)I
    .locals 2

    :goto_0
    if-ge p1, p2, :cond_1

    .line 379
    invoke-virtual {p0, p1}, Ljava/lang/String;->charAt(I)C

    move-result v0

    invoke-virtual {p3, v0}, Ljava/lang/String;->indexOf(I)I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    return p1

    :cond_0
    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_1
    return p2
.end method

.method public static ֫(Ljava/lang/String;Ljava/lang/Exception;)Ljava/lang/AssertionError;
    .locals 1

    .line 509
    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0, p0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 511
    :try_start_0
    invoke-virtual {v0, p1}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-object v0
.end method

.method public static ֫(Ljava/lang/String;)Ljava/lang/String;
    .locals 8

    const-string v0, ":"

    .line 405
    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    const/4 v1, -0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_a

    const-string v0, "["

    .line 407
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "]"

    invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 408
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v3, 0x1

    sub-int/2addr v0, v3

    invoke-static {v3, v0, p0}, Ll/᩶۟᩵;->֫(IILjava/lang/String;)Ljava/net/InetAddress;

    move-result-object v0

    goto :goto_0

    .line 409
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    invoke-static {v2, v0, p0}, Ll/᩶۟᩵;->֫(IILjava/lang/String;)Ljava/net/InetAddress;

    move-result-object v0

    :goto_0
    if-nez v0, :cond_1

    goto/16 :goto_5

    .line 411
    :cond_1
    invoke-virtual {v0}, Ljava/net/InetAddress;->getAddress()[B

    move-result-object v0

    .line 412
    array-length v3, v0

    const/16 v4, 0x10

    if-ne v3, v4, :cond_9

    const/4 p0, 0x0

    const/4 v3, 0x0

    .line 638
    :goto_1
    array-length v5, v0

    if-ge p0, v5, :cond_4

    move v5, p0

    :goto_2
    if-ge v5, v4, :cond_2

    .line 640
    aget-byte v6, v0, v5

    if-nez v6, :cond_2

    add-int/lit8 v6, v5, 0x1

    aget-byte v6, v0, v6

    if-nez v6, :cond_2

    add-int/lit8 v5, v5, 0x2

    goto :goto_2

    :cond_2
    sub-int v6, v5, p0

    if-le v6, v3, :cond_3

    const/4 v7, 0x4

    if-lt v6, v7, :cond_3

    move v1, p0

    move v3, v6

    :cond_3
    add-int/lit8 p0, v5, 0x2

    goto :goto_1

    .line 651
    :cond_4
    new-instance p0, Ll/۫ܽ֡;

    invoke-direct {p0}, Ll/۫ܽ֡;-><init>()V

    .line 652
    :cond_5
    :goto_3
    array-length v5, v0

    if-ge v2, v5, :cond_8

    const/16 v5, 0x3a

    if-ne v2, v1, :cond_6

    .line 654
    invoke-virtual {p0, v5}, Ll/۫ܽ֡;->writeByte(I)V

    add-int/2addr v2, v3

    if-ne v2, v4, :cond_5

    .line 656
    invoke-virtual {p0, v5}, Ll/۫ܽ֡;->writeByte(I)V

    goto :goto_3

    :cond_6
    if-lez v2, :cond_7

    .line 658
    invoke-virtual {p0, v5}, Ll/۫ܽ֡;->writeByte(I)V

    .line 659
    :cond_7
    aget-byte v5, v0, v2

    and-int/lit16 v5, v5, 0xff

    shl-int/lit8 v5, v5, 0x8

    add-int/lit8 v6, v2, 0x1

    aget-byte v6, v0, v6

    and-int/lit16 v6, v6, 0xff

    or-int/2addr v5, v6

    int-to-long v5, v5

    .line 660
    invoke-virtual {p0, v5, v6}, Ll/۫ܽ֡;->ۡ(J)V

    add-int/lit8 v2, v2, 0x2

    goto :goto_3

    .line 664
    :cond_8
    invoke-virtual {p0}, Ll/۫ܽ֡;->ܳ()Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 413
    :cond_9
    new-instance v0, Ljava/lang/AssertionError;

    const-string v1, "Invalid IPv6 address: \'"

    const-string v2, "\'"

    .line 0
    invoke-static {v1, p0, v2}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 413
    invoke-direct {v0, p0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    .line 417
    :cond_a
    :try_start_0
    invoke-static {p0}, Ljava/net/IDN;->toASCII(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {p0, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p0

    .line 418
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_b

    goto :goto_5

    .line 432
    :cond_b
    :goto_4
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    if-ge v2, v0, :cond_e

    .line 433
    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/16 v3, 0x1f

    if-le v0, v3, :cond_f

    const/16 v3, 0x7f

    if-lt v0, v3, :cond_c

    goto :goto_5

    :cond_c
    const-string v3, " #%/:?@[\\]"

    .line 443
    invoke-virtual {v3, v0}, Ljava/lang/String;->indexOf(I)I

    move-result v0
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    if-eq v0, v1, :cond_d

    goto :goto_5

    :cond_d
    add-int/lit8 v2, v2, 0x1

    goto :goto_4

    :cond_e
    return-object p0

    :catch_0
    :cond_f
    :goto_5
    const/4 p0, 0x0

    return-object p0
.end method

.method public static ֫(Ll/ۨܰ᩵;Z)Ljava/lang/String;
    .locals 3

    .line 295
    invoke-virtual {p0}, Ll/ۨܰ᩵;->ܳ()Ljava/lang/String;

    move-result-object v0

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 296
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "["

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ll/ۨܰ᩵;->ܳ()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "]"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 297
    :cond_0
    invoke-virtual {p0}, Ll/ۨܰ᩵;->ܳ()Ljava/lang/String;

    move-result-object v0

    :goto_0
    if-nez p1, :cond_2

    .line 298
    invoke-virtual {p0}, Ll/ۨܰ᩵;->ۢ()I

    move-result p1

    invoke-virtual {p0}, Ll/ۨܰ᩵;->ۖ()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ll/ۨܰ᩵;->ۧ(Ljava/lang/String;)I

    move-result v2

    if-eq p1, v2, :cond_1

    goto :goto_1

    :cond_1
    return-object v0

    .line 0
    :cond_2
    :goto_1
    invoke-static {v0, v1}, Ll/۟֫ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    .line 299
    invoke-virtual {p0}, Ll/ۨܰ᩵;->ۢ()I

    move-result p0

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(IILjava/lang/String;)Ljava/net/InetAddress;
    .locals 13

    const/16 v0, 0x10

    new-array v1, v0, [B

    const/4 v2, 0x0

    const/4 v3, -0x1

    const/4 v4, 0x0

    const/4 v5, -0x1

    const/4 v6, -0x1

    :goto_0
    if-ge p0, p1, :cond_13

    if-ne v4, v0, :cond_0

    goto/16 :goto_9

    :cond_0
    add-int/lit8 v7, p0, 0x2

    const/16 v8, 0xff

    const/4 v9, 0x2

    if-gt v7, p1, :cond_3

    const-string v10, "::"

    .line 536
    invoke-virtual {p2, p0, v10, v2, v9}, Ljava/lang/String;->regionMatches(ILjava/lang/String;II)Z

    move-result v10

    if-eqz v10, :cond_3

    if-eq v5, v3, :cond_1

    goto/16 :goto_9

    :cond_1
    add-int/lit8 v4, v4, 0x2

    move v5, v4

    if-ne v7, p1, :cond_2

    goto/16 :goto_8

    :cond_2
    move v6, v7

    goto/16 :goto_5

    :cond_3
    if-eqz v4, :cond_f

    const-string v7, ":"

    const/4 v10, 0x1

    .line 545
    invoke-virtual {p2, p0, v7, v2, v10}, Ljava/lang/String;->regionMatches(ILjava/lang/String;II)Z

    move-result v7

    if-eqz v7, :cond_4

    add-int/lit8 p0, p0, 0x1

    goto/16 :goto_4

    :cond_4
    const-string v7, "."

    .line 547
    invoke-virtual {p2, p0, v7, v2, v10}, Ljava/lang/String;->regionMatches(ILjava/lang/String;II)Z

    move-result p0

    if-eqz p0, :cond_14

    add-int/lit8 p0, v4, -0x2

    move v7, p0

    :goto_1
    if-ge v6, p1, :cond_d

    if-ne v7, v0, :cond_5

    goto/16 :goto_9

    :cond_5
    if-eq v7, p0, :cond_7

    .line 606
    invoke-virtual {p2, v6}, Ljava/lang/String;->charAt(I)C

    move-result v9

    const/16 v10, 0x2e

    if-eq v9, v10, :cond_6

    goto/16 :goto_9

    :cond_6
    add-int/lit8 v6, v6, 0x1

    :cond_7
    const/4 v9, 0x0

    move v9, v6

    const/4 v10, 0x0

    :goto_2
    if-ge v9, p1, :cond_b

    .line 614
    invoke-virtual {p2, v9}, Ljava/lang/String;->charAt(I)C

    move-result v11

    const/16 v12, 0x30

    if-lt v11, v12, :cond_b

    const/16 v12, 0x39

    if-le v11, v12, :cond_8

    goto :goto_3

    :cond_8
    if-nez v10, :cond_9

    if-eq v6, v9, :cond_9

    goto :goto_9

    :cond_9
    mul-int/lit8 v10, v10, 0xa

    add-int/2addr v10, v11

    add-int/lit8 v10, v10, -0x30

    if-le v10, v8, :cond_a

    goto :goto_9

    :cond_a
    add-int/lit8 v9, v9, 0x1

    goto :goto_2

    :cond_b
    :goto_3
    sub-int v6, v9, v6

    if-nez v6, :cond_c

    goto :goto_9

    :cond_c
    add-int/lit8 v6, v7, 0x1

    int-to-byte v10, v10

    .line 624
    aput-byte v10, v1, v7

    move v7, v6

    move v6, v9

    goto :goto_1

    :cond_d
    add-int/lit8 p0, v4, 0x2

    if-eq v7, p0, :cond_e

    goto :goto_9

    :cond_e
    add-int/lit8 v4, v4, 0x2

    goto :goto_8

    :cond_f
    :goto_4
    move v6, p0

    :goto_5
    const/4 p0, 0x0

    move p0, v6

    const/4 v7, 0x0

    :goto_6
    if-ge p0, p1, :cond_11

    .line 561
    invoke-virtual {p2, p0}, Ljava/lang/String;->charAt(I)C

    move-result v10

    .line 562
    invoke-static {v10}, Ll/᩶۟᩵;->֫(C)I

    move-result v10

    if-ne v10, v3, :cond_10

    goto :goto_7

    :cond_10
    shl-int/lit8 v7, v7, 0x4

    add-int/2addr v7, v10

    add-int/lit8 p0, p0, 0x1

    goto :goto_6

    :cond_11
    :goto_7
    sub-int v10, p0, v6

    if-eqz v10, :cond_14

    const/4 v11, 0x4

    if-le v10, v11, :cond_12

    goto :goto_9

    :cond_12
    add-int/lit8 v10, v4, 0x1

    ushr-int/lit8 v11, v7, 0x8

    and-int/2addr v8, v11

    int-to-byte v8, v8

    .line 570
    aput-byte v8, v1, v4

    add-int/2addr v4, v9

    and-int/lit16 v7, v7, 0xff

    int-to-byte v7, v7

    .line 571
    aput-byte v7, v1, v10

    goto/16 :goto_0

    :cond_13
    :goto_8
    if-eq v4, v0, :cond_16

    if-ne v5, v3, :cond_15

    :cond_14
    :goto_9
    const/4 p0, 0x0

    return-object p0

    :cond_15
    sub-int p0, v4, v5

    rsub-int/lit8 p1, p0, 0x10

    .line 585
    invoke-static {v1, v5, v1, p1, p0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    sub-int/2addr v0, v4

    add-int/2addr v0, v5

    .line 586
    invoke-static {v1, v5, v0, v2}, Ljava/util/Arrays;->fill([BIIB)V

    .line 590
    :cond_16
    :try_start_0
    invoke-static {v1}, Ljava/net/InetAddress;->getByAddress([B)Ljava/net/InetAddress;

    move-result-object p0
    :try_end_0
    .catch Ljava/net/UnknownHostException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    .line 592
    :catch_0
    new-instance p0, Ljava/lang/AssertionError;

    invoke-direct {p0}, Ljava/lang/AssertionError;-><init>()V

    throw p0
.end method

.method public static ֫(Ll/ۛܽ֡;Ljava/nio/charset/Charset;)Ljava/nio/charset/Charset;
    .locals 2

    .line 476
    sget-object v0, Ll/᩶۟᩵;->᩵:Ll/ۨܽ֡;

    invoke-interface {p0, v0}, Ll/ۛܽ֡;->ۧ(Ll/ۨܽ֡;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 477
    invoke-virtual {v0}, Ll/ۨܽ֡;->᩷()I

    move-result p1

    int-to-long v0, p1

    invoke-interface {p0, v0, v1}, Ll/ۛܽ֡;->skip(J)V

    .line 478
    sget-object p0, Ll/᩶۟᩵;->ᩴ:Ljava/nio/charset/Charset;

    return-object p0

    .line 480
    :cond_0
    sget-object v0, Ll/᩶۟᩵;->ۜ:Ll/ۨܽ֡;

    invoke-interface {p0, v0}, Ll/ۛܽ֡;->ۧ(Ll/ۨܽ֡;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 481
    invoke-virtual {v0}, Ll/ۨܽ֡;->᩷()I

    move-result p1

    int-to-long v0, p1

    invoke-interface {p0, v0, v1}, Ll/ۛܽ֡;->skip(J)V

    .line 482
    sget-object p0, Ll/᩶۟᩵;->᩻:Ljava/nio/charset/Charset;

    return-object p0

    .line 484
    :cond_1
    sget-object v0, Ll/᩶۟᩵;->ۢ:Ll/ۨܽ֡;

    invoke-interface {p0, v0}, Ll/ۛܽ֡;->ۧ(Ll/ۨܽ֡;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 485
    invoke-virtual {v0}, Ll/ۨܽ֡;->᩷()I

    move-result p1

    int-to-long v0, p1

    invoke-interface {p0, v0, v1}, Ll/ۛܽ֡;->skip(J)V

    .line 486
    sget-object p0, Ll/᩶۟᩵;->᩷:Ljava/nio/charset/Charset;

    return-object p0

    .line 488
    :cond_2
    sget-object v0, Ll/᩶۟᩵;->ܺ:Ll/ۨܽ֡;

    invoke-interface {p0, v0}, Ll/ۛܽ֡;->ۧ(Ll/ۨܽ֡;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 489
    invoke-virtual {v0}, Ll/ۨܽ֡;->᩷()I

    move-result p1

    int-to-long v0, p1

    invoke-interface {p0, v0, v1}, Ll/ۛܽ֡;->skip(J)V

    .line 490
    sget-object p0, Ll/᩶۟᩵;->ۡ:Ljava/nio/charset/Charset;

    return-object p0

    .line 492
    :cond_3
    sget-object v0, Ll/᩶۟᩵;->ۘ:Ll/ۨܽ֡;

    invoke-interface {p0, v0}, Ll/ۛܽ֡;->ۧ(Ll/ۨܽ֡;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 493
    invoke-virtual {v0}, Ll/ۨܽ֡;->᩷()I

    move-result p1

    int-to-long v0, p1

    invoke-interface {p0, v0, v1}, Ll/ۛܽ֡;->skip(J)V

    .line 494
    sget-object p0, Ll/᩶۟᩵;->ۖ:Ljava/nio/charset/Charset;

    return-object p0

    :cond_4
    return-object p1
.end method

.method public static ֫(Ljava/util/List;)Ljava/util/List;
    .locals 1

    .line 229
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-static {v0}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static varargs ֫([Ljava/lang/Object;)Ljava/util/List;
    .locals 0

    .line 241
    invoke-virtual {p0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [Ljava/lang/Object;

    invoke-static {p0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    invoke-static {p0}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ljava/lang/String;Z)Ljava/util/concurrent/ThreadFactory;
    .locals 1

    .line 245
    new-instance v0, Ll/᩹۟᩵;

    invoke-direct {v0, p0, p1}, Ll/᩹۟᩵;-><init>(Ljava/lang/String;Z)V

    return-object v0
.end method

.method public static ֫(Ljava/util/ArrayList;)Ll/ۤܰ᩵;
    .locals 4

    .line 684
    new-instance v0, Ll/۫ܰ᩵;

    invoke-direct {v0}, Ll/۫ܰ᩵;-><init>()V

    .line 685
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/۟֫֡;

    .line 686
    sget-object v2, Ll/۠۟᩵;->֫:Ll/۠۟᩵;

    iget-object v3, v1, Ll/۟֫֡;->ۧ:Ll/ۨܽ֡;

    invoke-virtual {v3}, Ll/ۨܽ֡;->ᩴ()Ljava/lang/String;

    move-result-object v3

    iget-object v1, v1, Ll/۟֫֡;->ܽ:Ll/ۨܽ֡;

    invoke-virtual {v1}, Ll/ۨܽ֡;->ᩴ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v3, v1}, Ll/۠۟᩵;->֫(Ll/۫ܰ᩵;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 688
    :cond_0
    invoke-virtual {v0}, Ll/۫ܰ᩵;->֫()Ll/ۤܰ᩵;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ljava/io/Closeable;)V
    .locals 0

    if-eqz p0, :cond_0

    .line 142
    :try_start_0
    invoke-interface {p0}, Ljava/io/Closeable;->close()V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void

    :catch_1
    move-exception p0

    .line 144
    throw p0

    :cond_0
    return-void
.end method

.method public static ֫(Ljava/lang/Throwable;Ljava/io/IOException;)V
    .locals 3

    .line 100
    sget-object v0, Ll/᩶۟᩵;->ۚ:Ljava/lang/reflect/Method;

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    :try_start_0
    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    .line 102
    invoke-virtual {v0, p0, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    return-void
.end method

.method public static ֫(Ljava/net/Socket;)V
    .locals 2

    if-eqz p0, :cond_2

    .line 157
    :try_start_0
    invoke-virtual {p0}, Ljava/net/Socket;->close()V
    :try_end_0
    .catch Ljava/lang/AssertionError; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2

    return-void

    :catch_0
    move-exception p0

    const-string v0, "bio == null"

    .line 161
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 166
    :cond_0
    throw p0

    :catch_1
    move-exception p0

    .line 159
    invoke-static {p0}, Ll/᩶۟᩵;->֫(Ljava/lang/AssertionError;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    throw p0

    :catch_2
    :cond_2
    :goto_0
    return-void
.end method

.method public static ֫(Ljava/lang/AssertionError;)Z
    .locals 1

    .line 308
    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 309
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    const-string v0, "getsockname failed"

    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static ֫(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    if-eq p0, p1, :cond_1

    if-eqz p0, :cond_0

    .line 132
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method

.method public static ֫(Ll/֨ᩳ֡;I)Z
    .locals 12

    .line 2
    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 205
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v1

    .line 206
    invoke-interface {p0}, Ll/֨ᩳ֡;->ۢ()Ll/ܶᩳ֡;

    move-result-object v3

    invoke-virtual {v3}, Ll/ܶᩳ֡;->ᩳ()Z

    move-result v3

    const-wide v4, 0x7fffffffffffffffL

    if-eqz v3, :cond_0

    .line 207
    invoke-interface {p0}, Ll/֨ᩳ֡;->ۢ()Ll/ܶᩳ֡;

    move-result-object v3

    invoke-virtual {v3}, Ll/ܶᩳ֡;->ܽ()J

    move-result-wide v6

    sub-long/2addr v6, v1

    goto :goto_0

    :cond_0
    move-wide v6, v4

    .line 209
    :goto_0
    invoke-interface {p0}, Ll/֨ᩳ֡;->ۢ()Ll/ܶᩳ֡;

    move-result-object v3

    int-to-long v8, p1

    invoke-virtual {v0, v8, v9}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide v8

    invoke-static {v6, v7, v8, v9}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v8

    add-long/2addr v8, v1

    invoke-virtual {v3, v8, v9}, Ll/ܶᩳ֡;->֫(J)Ll/ܶᩳ֡;

    .line 211
    :try_start_0
    new-instance p1, Ll/۫ܽ֡;

    invoke-direct {p1}, Ll/۫ܽ֡;-><init>()V

    :goto_1
    const-wide/16 v8, 0x2000

    .line 212
    invoke-interface {p0, p1, v8, v9}, Ll/֨ᩳ֡;->ۧ(Ll/۫ܽ֡;J)J

    move-result-wide v8

    const-wide/16 v10, -0x1

    cmp-long v0, v8, v10

    if-eqz v0, :cond_1

    .line 213
    invoke-virtual {p1}, Ll/۫ܽ֡;->֫()V
    :try_end_0
    .catch Ljava/io/InterruptedIOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :cond_1
    const/4 p1, 0x1

    cmp-long v0, v6, v4

    if-nez v0, :cond_2

    .line 220
    invoke-interface {p0}, Ll/֨ᩳ֡;->ۢ()Ll/ܶᩳ֡;

    move-result-object p0

    invoke-virtual {p0}, Ll/ܶᩳ֡;->֫()Ll/ܶᩳ֡;

    return p1

    .line 222
    :cond_2
    invoke-interface {p0}, Ll/֨ᩳ֡;->ۢ()Ll/ܶᩳ֡;

    move-result-object p0

    add-long/2addr v1, v6

    invoke-virtual {p0, v1, v2}, Ll/ܶᩳ֡;->֫(J)Ll/ܶᩳ֡;

    return p1

    :catchall_0
    move-exception p1

    cmp-long v0, v6, v4

    if-nez v0, :cond_3

    .line 220
    invoke-interface {p0}, Ll/֨ᩳ֡;->ۢ()Ll/ܶᩳ֡;

    move-result-object p0

    invoke-virtual {p0}, Ll/ܶᩳ֡;->֫()Ll/ܶᩳ֡;

    goto :goto_2

    .line 222
    :cond_3
    invoke-interface {p0}, Ll/֨ᩳ֡;->ۢ()Ll/ܶᩳ֡;

    move-result-object p0

    add-long/2addr v1, v6

    invoke-virtual {p0, v1, v2}, Ll/ܶᩳ֡;->֫(J)Ll/ܶᩳ֡;

    :goto_2
    throw p1

    :catch_0
    cmp-long p1, v6, v4

    if-nez p1, :cond_4

    .line 220
    invoke-interface {p0}, Ll/֨ᩳ֡;->ۢ()Ll/ܶᩳ֡;

    move-result-object p0

    invoke-virtual {p0}, Ll/ܶᩳ֡;->֫()Ll/ܶᩳ֡;

    goto :goto_3

    .line 222
    :cond_4
    invoke-interface {p0}, Ll/֨ᩳ֡;->ۢ()Ll/ܶᩳ֡;

    move-result-object p0

    add-long/2addr v1, v6

    invoke-virtual {p0, v1, v2}, Ll/ܶᩳ֡;->֫(J)Ll/ܶᩳ֡;

    :goto_3
    const/4 p0, 0x0

    return p0
.end method

.method public static ֫(Ljava/util/Comparator;[Ljava/lang/String;[Ljava/lang/String;)[Ljava/lang/String;
    .locals 7

    .line 261
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 262
    array-length v1, p1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_2

    aget-object v3, p1, v2

    .line 263
    array-length v4, p2

    const/4 v5, 0x0

    :goto_1
    if-ge v5, v4, :cond_1

    aget-object v6, p2, v5

    .line 264
    invoke-interface {p0, v3, v6}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v6

    if-nez v6, :cond_0

    .line 265
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_0
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_1
    :goto_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 270
    :cond_2
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result p0

    new-array p0, p0, [Ljava/lang/String;

    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [Ljava/lang/String;

    return-object p0
.end method

.method public static ۧ(IILjava/lang/String;)I
    .locals 2

    :goto_0
    if-ge p0, p1, :cond_1

    .line 332
    invoke-virtual {p2, p0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/16 v1, 0x9

    if-eq v0, v1, :cond_0

    const/16 v1, 0xa

    if-eq v0, v1, :cond_0

    const/16 v1, 0xc

    if-eq v0, v1, :cond_0

    const/16 v1, 0xd

    if-eq v0, v1, :cond_0

    const/16 v1, 0x20

    if-eq v0, v1, :cond_0

    return p0

    :cond_0
    add-int/lit8 p0, p0, 0x1

    goto :goto_0

    :cond_1
    return p1
.end method

.method public static ۧ(Ljava/lang/String;)Z
    .locals 1

    .line 467
    sget-object v0, Ll/᩶۟᩵;->֡:Ljava/util/regex/Pattern;

    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p0

    invoke-virtual {p0}, Ljava/util/regex/Matcher;->matches()Z

    move-result p0

    return p0
.end method

.method public static ۧ(Ljava/util/Comparator;[Ljava/lang/String;[Ljava/lang/String;)Z
    .locals 7

    const/4 v0, 0x0

    if-eqz p1, :cond_3

    if-eqz p2, :cond_3

    .line 281
    array-length v1, p1

    if-eqz v1, :cond_3

    array-length v1, p2

    if-nez v1, :cond_0

    goto :goto_2

    .line 284
    :cond_0
    array-length v1, p1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_3

    aget-object v3, p1, v2

    .line 285
    array-length v4, p2

    const/4 v5, 0x0

    :goto_1
    if-ge v5, v4, :cond_2

    aget-object v6, p2, v5

    .line 286
    invoke-interface {p0, v3, v6}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v6

    if-nez v6, :cond_1

    const/4 p0, 0x1

    return p0

    :cond_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_3
    :goto_2
    return v0
.end method

.method public static ܽ(IILjava/lang/String;)I
    .locals 2

    :cond_0
    add-int/lit8 p1, p1, -0x1

    if-lt p1, p0, :cond_1

    .line 352
    invoke-virtual {p2, p1}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/16 v1, 0x9

    if-eq v0, v1, :cond_0

    const/16 v1, 0xa

    if-eq v0, v1, :cond_0

    const/16 v1, 0xc

    if-eq v0, v1, :cond_0

    const/16 v1, 0xd

    if-eq v0, v1, :cond_0

    const/16 v1, 0x20

    if-eq v0, v1, :cond_0

    add-int/lit8 p1, p1, 0x1

    return p1

    :cond_1
    return p0
.end method
