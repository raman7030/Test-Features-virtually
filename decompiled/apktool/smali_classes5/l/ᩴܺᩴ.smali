.class public final Ll/ᩴܺᩴ;
.super Ll/ۚܺᩴ;
.source "LCCE"

# interfaces
.implements Ll/۠ܺᩴ;


# instance fields
.field public ۙ:I

.field public ᩶:Ljava/io/InputStream;

.field public ᩸:I

.field public ᩹:[B


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 95
    const-class v0, Ll/ۘܺᩴ;

    invoke-static {v0}, Ljava/util/EnumSet;->allOf(Ljava/lang/Class;)Ljava/util/EnumSet;

    return-void
.end method

.method public constructor <init>(Ljava/io/InputStream;[B)V
    .locals 2

    .line 26
    invoke-direct {p0}, Ljava/io/InputStream;-><init>()V

    .line 134
    iput-object p1, p0, Ll/ᩴܺᩴ;->᩶:Ljava/io/InputStream;

    .line 135
    array-length v0, p2

    if-lez v0, :cond_2

    .line 136
    iput-object p2, p0, Ll/ᩴܺᩴ;->᩹:[B

    .line 138
    instance-of p2, p1, Ll/۠ܺᩴ;

    if-eqz p2, :cond_0

    move-object p2, p1

    check-cast p2, Ll/۠ܺᩴ;

    .line 139
    :cond_0
    instance-of p2, p1, Ll/֨ܺᩴ;

    if-eqz p2, :cond_1

    move-object p2, p1

    check-cast p2, Ll/֨ܺᩴ;

    .line 144
    :cond_1
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p2

    const-string v0, "getChannel"

    const/4 v1, 0x0

    invoke-virtual {p2, v0, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object p2

    invoke-virtual {p2, p1, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/nio/channels/FileChannel;
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void

    .line 124
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Illegal buffer size: "

    .line 0
    invoke-static {v0, p2}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 124
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final available()I
    .locals 4

    .line 507
    iget-object v0, p0, Ll/ᩴܺᩴ;->᩶:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->available()I

    move-result v0

    int-to-long v0, v0

    iget v2, p0, Ll/ᩴܺᩴ;->᩸:I

    int-to-long v2, v2

    add-long/2addr v0, v2

    const-wide/32 v2, 0x7fffffff

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    long-to-int v1, v0

    return v1
.end method

.method public final close()V
    .locals 2

    .line 512
    iget-object v0, p0, Ll/ᩴܺᩴ;->᩶:Ljava/io/InputStream;

    if-nez v0, :cond_0

    return-void

    .line 513
    :cond_0
    sget-object v1, Ljava/lang/System;->in:Ljava/io/InputStream;

    if-eq v0, v1, :cond_1

    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    :cond_1
    const/4 v0, 0x0

    .line 514
    iput-object v0, p0, Ll/ᩴܺᩴ;->᩶:Ljava/io/InputStream;

    .line 515
    iput-object v0, p0, Ll/ᩴܺᩴ;->᩹:[B

    return-void
.end method

.method public final read()I
    .locals 3

    .line 180
    iget v0, p0, Ll/ᩴܺᩴ;->᩸:I

    if-nez v0, :cond_1

    .line 181
    iget-object v0, p0, Ll/ᩴܺᩴ;->᩶:Ljava/io/InputStream;

    iget-object v1, p0, Ll/ᩴܺᩴ;->᩹:[B

    invoke-virtual {v0, v1}, Ljava/io/InputStream;->read([B)I

    move-result v0

    iput v0, p0, Ll/ᩴܺᩴ;->᩸:I

    const/4 v1, 0x0

    if-gtz v0, :cond_0

    .line 183
    iput v1, p0, Ll/ᩴܺᩴ;->᩸:I

    const/4 v0, -0x1

    return v0

    .line 186
    :cond_0
    iput v1, p0, Ll/ᩴܺᩴ;->ۙ:I

    .line 194
    :cond_1
    iget v0, p0, Ll/ᩴܺᩴ;->᩸:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Ll/ᩴܺᩴ;->᩸:I

    .line 196
    iget-object v0, p0, Ll/ᩴܺᩴ;->᩹:[B

    iget v1, p0, Ll/ᩴܺᩴ;->ۙ:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Ll/ᩴܺᩴ;->ۙ:I

    aget-byte v0, v0, v1

    and-int/lit16 v0, v0, 0xff

    return v0
.end method

.method public final read([BII)I
    .locals 4

    .line 201
    iget v0, p0, Ll/ᩴܺᩴ;->᩸:I

    if-gt p3, v0, :cond_0

    .line 202
    iget-object v0, p0, Ll/ᩴܺᩴ;->᩹:[B

    iget v1, p0, Ll/ᩴܺᩴ;->ۙ:I

    invoke-static {v0, v1, p1, p2, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 203
    iget p1, p0, Ll/ᩴܺᩴ;->ۙ:I

    add-int/2addr p1, p3

    iput p1, p0, Ll/ᩴܺᩴ;->ۙ:I

    .line 204
    iget p1, p0, Ll/ᩴܺᩴ;->᩸:I

    sub-int/2addr p1, p3

    iput p1, p0, Ll/ᩴܺᩴ;->᩸:I

    return p3

    .line 211
    :cond_0
    iget-object v1, p0, Ll/ᩴܺᩴ;->᩹:[B

    iget v2, p0, Ll/ᩴܺᩴ;->ۙ:I

    invoke-static {v1, v2, p1, p2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    const/4 v1, 0x0

    .line 212
    iput v1, p0, Ll/ᩴܺᩴ;->᩸:I

    iput v1, p0, Ll/ᩴܺᩴ;->ۙ:I

    .line 215
    iget-object v2, p0, Ll/ᩴܺᩴ;->᩹:[B

    array-length v3, v2

    if-le p3, v3, :cond_2

    .line 217
    iget-object v1, p0, Ll/ᩴܺᩴ;->᩶:Ljava/io/InputStream;

    add-int/2addr p2, v0

    sub-int/2addr p3, v0

    invoke-virtual {v1, p1, p2, p3}, Ljava/io/InputStream;->read([BII)I

    move-result p1

    if-gez p1, :cond_1

    if-nez v0, :cond_3

    goto :goto_0

    :cond_1
    add-int/2addr p1, v0

    return p1

    .line 181
    :cond_2
    iget-object v3, p0, Ll/ᩴܺᩴ;->᩶:Ljava/io/InputStream;

    invoke-virtual {v3, v2}, Ljava/io/InputStream;->read([B)I

    move-result v2

    iput v2, p0, Ll/ᩴܺᩴ;->᩸:I

    if-gtz v2, :cond_4

    .line 183
    iput v1, p0, Ll/ᩴܺᩴ;->᩸:I

    if-nez v0, :cond_3

    :goto_0
    const/4 p1, -0x1

    return p1

    :cond_3
    return v0

    .line 186
    :cond_4
    iput v1, p0, Ll/ᩴܺᩴ;->ۙ:I

    sub-int/2addr p3, v0

    .line 224
    iget v2, p0, Ll/ᩴܺᩴ;->᩸:I

    invoke-static {p3, v2}, Ljava/lang/Math;->min(II)I

    move-result p3

    .line 226
    iget-object v2, p0, Ll/ᩴܺᩴ;->᩹:[B

    add-int/2addr p2, v0

    invoke-static {v2, v1, p1, p2, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 227
    iput p3, p0, Ll/ᩴܺᩴ;->ۙ:I

    .line 228
    iget p1, p0, Ll/ᩴܺᩴ;->᩸:I

    sub-int/2addr p1, p3

    iput p1, p0, Ll/ᩴܺᩴ;->᩸:I

    add-int/2addr p3, v0

    return p3
.end method

.method public final reset()V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 529
    iget-object v0, p0, Ll/ᩴܺᩴ;->᩶:Ljava/io/InputStream;

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    .line 531
    iput v0, p0, Ll/ᩴܺᩴ;->ۙ:I

    iput v0, p0, Ll/ᩴܺᩴ;->᩸:I

    return-void
.end method

.method public final skip(J)J
    .locals 11

    .line 481
    iget v0, p0, Ll/ᩴܺᩴ;->᩸:I

    int-to-long v1, v0

    cmp-long v3, p1, v1

    if-gtz v3, :cond_0

    long-to-int v1, p1

    .line 483
    iget v2, p0, Ll/ᩴܺᩴ;->ۙ:I

    add-int/2addr v2, v1

    iput v2, p0, Ll/ᩴܺᩴ;->ۙ:I

    sub-int/2addr v0, v1

    .line 484
    iput v0, p0, Ll/ᩴܺᩴ;->᩸:I

    return-wide p1

    :cond_0
    sub-long v0, p1, v1

    const/4 v2, 0x0

    .line 490
    iput v2, p0, Ll/ᩴܺᩴ;->᩸:I

    const-wide/16 v3, 0x0

    move-wide v5, v3

    :goto_0
    cmp-long v7, v0, v3

    if-eqz v7, :cond_4

    .line 492
    iget-object v5, p0, Ll/ᩴܺᩴ;->᩶:Ljava/io/InputStream;

    sget-object v6, Ljava/lang/System;->in:Ljava/io/InputStream;

    if-ne v5, v6, :cond_2

    move-wide v5, v0

    :goto_1
    cmp-long v7, v5, v3

    if-lez v7, :cond_1

    .line 456
    iget-object v7, p0, Ll/ᩴܺᩴ;->᩶:Ljava/io/InputStream;

    iget-object v8, p0, Ll/ᩴܺᩴ;->᩹:[B

    array-length v9, v8

    int-to-long v9, v9

    invoke-static {v9, v10, v5, v6}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v9

    long-to-int v10, v9

    invoke-virtual {v7, v8, v2, v10}, Ljava/io/InputStream;->read([BII)I

    move-result v7

    if-lez v7, :cond_1

    int-to-long v7, v7

    sub-long/2addr v5, v7

    goto :goto_1

    :cond_1
    sub-long v5, v0, v5

    goto :goto_2

    .line 492
    :cond_2
    invoke-virtual {v5, v0, v1}, Ljava/io/InputStream;->skip(J)J

    move-result-wide v5

    :goto_2
    cmp-long v7, v5, v0

    if-gez v7, :cond_4

    cmp-long v7, v5, v3

    if-eqz v7, :cond_3

    sub-long/2addr v0, v5

    goto :goto_0

    .line 494
    :cond_3
    iget-object p1, p0, Ll/ᩴܺᩴ;->᩶:Ljava/io/InputStream;

    invoke-virtual {p1}, Ljava/io/InputStream;->read()I

    const/4 p1, 0x0

    throw p1

    :cond_4
    sub-long/2addr v0, v5

    sub-long/2addr p1, v0

    return-wide p1
.end method
