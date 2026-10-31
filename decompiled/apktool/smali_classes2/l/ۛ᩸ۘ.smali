.class public Ll/ۛ᩸ۘ;
.super Ljava/lang/Object;
.source "51RR"


# direct methods
.method public static ֫(Ljava/io/InputStream;)Ljava/lang/String;
    .locals 7

    const/4 v0, 0x0

    const-string v1, "MD5Utils"

    if-nez p0, :cond_0

    const-string p0, "md5 stream is null"

    .line 24
    invoke-static {v1, p0}, Ll/ۡ᩸ۘ;->ۧ(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0

    :cond_0
    :try_start_0
    const-string v2, "MD5"

    .line 28
    invoke-static {v2}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object v2

    const/16 v3, 0x2000

    new-array v4, v3, [B

    :goto_0
    const/4 v5, 0x0

    .line 31
    invoke-virtual {p0, v4, v5, v3}, Ljava/io/InputStream;->read([BII)I

    move-result v6

    if-lez v6, :cond_1

    .line 32
    invoke-virtual {v2, v4, v5, v6}, Ljava/security/MessageDigest;->update([BII)V

    goto :goto_0

    .line 34
    :cond_1
    invoke-virtual {v2}, Ljava/security/MessageDigest;->digest()[B

    move-result-object p0

    invoke-static {p0}, Ll/ᩳ᩹ۘ;->֫([B)Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p0

    :catchall_0
    move-exception p0

    const-string v2, "md5 exception"

    .line 36
    invoke-static {v1, v2, p0}, Ll/ۡ᩸ۘ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    const-string p0, "md5 return null"

    .line 39
    invoke-static {v1, p0}, Ll/ۡ᩸ۘ;->ۧ(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public static ֫(II[B)V
    .locals 1

    if-ltz p1, :cond_3

    if-lez p1, :cond_2

    if-ltz p0, :cond_1

    .line 24
    array-length v0, p2

    if-ge p0, v0, :cond_1

    add-int/2addr p0, p1

    add-int/lit8 p0, p0, -0x1

    if-ltz p0, :cond_0

    array-length p1, p2

    if-ge p0, p1, :cond_0

    goto :goto_0

    .line 25
    :cond_0
    new-instance p1, Ljava/lang/ArrayIndexOutOfBoundsException;

    invoke-direct {p1, p0}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(I)V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/ArrayIndexOutOfBoundsException;

    invoke-direct {p1, p0}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(I)V

    throw p1

    :cond_2
    :goto_0
    return-void

    .line 39
    :cond_3
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "lengths must be >= 0"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ֫(Landroid/text/SpannableStringBuilder;Ljava/lang/Object;II)V
    .locals 6

    .line 46
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-interface {p0, p2, p3, v0}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object v0

    .line 47
    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    const/16 v3, 0x21

    if-ge v2, v1, :cond_1

    aget-object v4, v0, v2

    .line 88
    invoke-interface {p0, v4}, Landroid/text/Spanned;->getSpanStart(Ljava/lang/Object;)I

    move-result v5

    if-ne v5, p2, :cond_0

    .line 89
    invoke-interface {p0, v4}, Landroid/text/Spanned;->getSpanEnd(Ljava/lang/Object;)I

    move-result v5

    if-ne v5, p3, :cond_0

    .line 90
    invoke-interface {p0, v4}, Landroid/text/Spanned;->getSpanFlags(Ljava/lang/Object;)I

    move-result v5

    if-ne v5, v3, :cond_0

    .line 91
    invoke-interface {p0, v4}, Landroid/text/Spannable;->removeSpan(Ljava/lang/Object;)V

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 50
    :cond_1
    invoke-interface {p0, p1, p2, p3, v3}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    return-void
.end method

.method public static ֫(I[B)[B
    .locals 2

    .line 56
    array-length v0, p1

    if-ge p0, v0, :cond_0

    return-object p1

    .line 59
    :cond_0
    array-length v0, p1

    :goto_0
    add-int/lit8 v1, p0, 0x1

    if-ge v0, v1, :cond_1

    mul-int/lit8 v0, v0, 0x2

    goto :goto_0

    .line 60
    :cond_1
    new-array p0, v0, [B

    .line 61
    array-length v0, p1

    const/4 v1, 0x0

    invoke-static {p1, v1, p0, v1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object p0
.end method

.method public static ֫(I[Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 2

    .line 44
    array-length v0, p1

    if-ge p0, v0, :cond_0

    return-object p1

    .line 47
    :cond_0
    array-length v0, p1

    :goto_0
    add-int/lit8 v1, p0, 0x1

    if-ge v0, v1, :cond_1

    mul-int/lit8 v0, v0, 0x2

    goto :goto_0

    .line 49
    :cond_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    move-result-object p0

    invoke-static {p0, v0}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [Ljava/lang/Object;

    .line 50
    array-length v0, p1

    const/4 v1, 0x0

    invoke-static {p1, v1, p0, v1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object p0
.end method

.method public static ۧ(I[B)I
    .locals 2

    .line 56
    sget-object v0, Ll/ۛۨ᩵;->֫:Ljava/nio/ByteOrder;

    sget-object v1, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    if-ne v0, v1, :cond_0

    .line 48
    aget-byte v0, p1, p0

    and-int/lit16 v0, v0, 0xff

    shl-int/lit8 v0, v0, 0x18

    add-int/lit8 v1, p0, 0x1

    aget-byte v1, p1, v1

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x10

    or-int/2addr v0, v1

    add-int/lit8 v1, p0, 0x2

    aget-byte v1, p1, v1

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x8

    or-int/2addr v0, v1

    add-int/lit8 p0, p0, 0x3

    aget-byte p0, p1, p0

    and-int/lit16 p0, p0, 0xff

    or-int/2addr p0, v0

    return p0

    .line 59
    :cond_0
    invoke-static {p0, p1}, Ll/ۛ᩸ۘ;->ܽ(I[B)I

    move-result p0

    return p0
.end method

.method public static ۧ(Ljava/lang/String;)Z
    .locals 1

    const-string v0, "target_not_mapped"

    .line 22
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "result_limit_reached"

    .line 23
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "scan_budget_exhausted"

    .line 24
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "relocation_page_budget_exhausted"

    .line 25
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "scan_space_exhausted"

    .line 26
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

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

.method public static ܽ(I[B)I
    .locals 2

    .line 52
    aget-byte v0, p1, p0

    and-int/lit16 v0, v0, 0xff

    add-int/lit8 v1, p0, 0x1

    aget-byte v1, p1, v1

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x8

    or-int/2addr v0, v1

    add-int/lit8 v1, p0, 0x2

    aget-byte v1, p1, v1

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x10

    or-int/2addr v0, v1

    add-int/lit8 p0, p0, 0x3

    aget-byte p0, p1, p0

    and-int/lit16 p0, p0, 0xff

    shl-int/lit8 p0, p0, 0x18

    or-int/2addr p0, v0

    return p0
.end method


# virtual methods
.method public ֫(Ll/ᩴܿ֡;Ll/ᩴܿ֡;)Ljava/lang/Object;
    .locals 2

    .line 151
    invoke-interface {p1}, Ll/᩹ܿ֡;->ᩳ()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 152
    invoke-interface {p1}, Ll/᩹ܿ֡;->getChildCount()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    .line 153
    invoke-interface {p1, v0}, Ll/᩹ܿ֡;->֫(I)Ll/᩹ܿ֡;

    move-result-object p1

    goto :goto_0

    :cond_0
    if-gt v0, v1, :cond_1

    goto :goto_0

    .line 156
    :cond_1
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "more than one node as root (TODO: make exception hierarchy)"

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 162
    :cond_2
    :goto_0
    invoke-interface {p1, p2}, Ll/᩹ܿ֡;->֫(Ll/᩹ܿ֡;)V

    return-object p1
.end method

.method public ֫(Ll/᩷ܿ֡;Ll/ۜܿ֡;Ll/ۜܿ֡;Ll/ܳܿ֡;)Ll/ۘܿ֡;
    .locals 3

    .line 66
    new-instance v0, Ll/ۘܿ֡;

    .line 41
    invoke-direct {v0}, Ll/ᩴܿ֡;-><init>()V

    if-eqz p3, :cond_0

    .line 43
    invoke-interface {p3}, Ll/ۜܿ֡;->ܽ()I

    move-result v1

    invoke-interface {p2}, Ll/ۜܿ֡;->ܽ()I

    move-result v2

    if-ge v1, v2, :cond_1

    invoke-interface {p3}, Ll/ۜܿ֡;->getType()I

    move-result v1

    const/4 v2, -0x1

    if-eq v1, v2, :cond_1

    :cond_0
    move-object p3, p2

    .line 53
    :cond_1
    iput-object p1, v0, Ll/ۘܿ֡;->᩻:Ll/᩷ܿ֡;

    .line 54
    iput-object p2, v0, Ll/ۘܿ֡;->ۜ:Ll/ۜܿ֡;

    .line 55
    iput-object p3, v0, Ll/ۘܿ֡;->᩷:Ll/ۜܿ֡;

    .line 56
    iput-object p4, v0, Ll/ۘܿ֡;->ۢ:Ll/ܳܿ֡;

    return-object v0
.end method

.method public ֫(Ljava/lang/String;)Ll/ۛ᩸ۘ;
    .locals 0

    const/4 p1, 0x0

    throw p1
.end method

.method public ֫(Ljava/lang/String;Ljava/lang/String;)Ll/ۛ᩸ۘ;
    .locals 0

    const/4 p1, 0x0

    throw p1
.end method

.method public ֫()Ll/ᩴܿ֡;
    .locals 2

    .line 58
    new-instance v0, Ll/ᩴܿ֡;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ll/ᩴܿ֡;-><init>(Ll/ۜܿ֡;)V

    return-object v0
.end method

.method public ֫(ILjava/lang/String;)Ll/ᩴܿ֡;
    .locals 1

    .line 71
    new-instance v0, Ll/ۗᩳ֡;

    invoke-direct {v0, p1, p2}, Ll/ۗᩳ֡;-><init>(ILjava/lang/String;)V

    .line 58
    new-instance p1, Ll/ᩴܿ֡;

    invoke-direct {p1, v0}, Ll/ᩴܿ֡;-><init>(Ll/ۜܿ֡;)V

    return-object p1
.end method

.method public ֫(ILl/ۜܿ֡;)Ll/ᩴܿ֡;
    .locals 1

    .line 90
    new-instance v0, Ll/ۗᩳ֡;

    invoke-direct {v0, p2}, Ll/ۗᩳ֡;-><init>(Ll/ۜܿ֡;)V

    .line 194
    invoke-virtual {v0, p1}, Ll/ۗᩳ֡;->ܿ(I)V

    .line 58
    new-instance p1, Ll/ᩴܿ֡;

    invoke-direct {p1, v0}, Ll/ᩴܿ֡;-><init>(Ll/ۜܿ֡;)V

    return-object p1
.end method

.method public ֫(ILl/ۜܿ֡;Ljava/lang/String;)Ll/ᩴܿ֡;
    .locals 1

    if-nez p2, :cond_0

    .line 201
    invoke-virtual {p0, p1, p3}, Ll/ۛ᩸ۘ;->֫(ILjava/lang/String;)Ll/ᩴܿ֡;

    move-result-object p1

    return-object p1

    .line 90
    :cond_0
    new-instance v0, Ll/ۗᩳ֡;

    invoke-direct {v0, p2}, Ll/ۗᩳ֡;-><init>(Ll/ۜܿ֡;)V

    .line 203
    invoke-virtual {v0, p1}, Ll/ۗᩳ֡;->ܿ(I)V

    .line 204
    invoke-virtual {v0, p3}, Ll/ۗᩳ֡;->֫(Ljava/lang/String;)V

    .line 58
    new-instance p1, Ll/ᩴܿ֡;

    invoke-direct {p1, v0}, Ll/ᩴܿ֡;-><init>(Ll/ۜܿ֡;)V

    return-object p1
.end method

.method public ֫(Ll/ۜܿ֡;)Ll/ᩴܿ֡;
    .locals 1

    .line 58
    new-instance v0, Ll/ᩴܿ֡;

    invoke-direct {v0, p1}, Ll/ᩴܿ֡;-><init>(Ll/ۜܿ֡;)V

    return-object v0
.end method

.method public ֫(Ljava/lang/Object;Ljava/lang/Object;)Ll/᩹ܿ֡;
    .locals 4

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 53
    :cond_0
    move-object v0, p1

    check-cast v0, Ll/᩹ܿ֡;

    invoke-interface {v0}, Ll/᩹ܿ֡;->ܿ()Ll/ᩴܿ֡;

    move-result-object v1

    .line 171
    invoke-interface {v0}, Ll/᩹ܿ֡;->ۧ()I

    move-result v2

    .line 184
    iput v2, v1, Ll/ᩴܿ֡;->ۧ:I

    .line 165
    check-cast p2, Ll/᩹ܿ֡;

    .line 179
    check-cast p2, Ll/ᩴܿ֡;

    iput-object p2, v1, Ll/ᩴܿ֡;->ܽ:Ll/ᩴܿ֡;

    .line 154
    invoke-interface {v0}, Ll/᩹ܿ֡;->getChildCount()I

    move-result p2

    const/4 v2, 0x0

    :goto_0
    if-ge v2, p2, :cond_1

    .line 148
    invoke-interface {v0, v2}, Ll/᩹ܿ֡;->֫(I)Ll/᩹ܿ֡;

    move-result-object v3

    .line 96
    invoke-virtual {p0, v3, p1}, Ll/ۛ᩸ۘ;->֫(Ljava/lang/Object;Ljava/lang/Object;)Ll/᩹ܿ֡;

    move-result-object v3

    .line 97
    invoke-virtual {p0, v1, v3}, Ll/ۛ᩸ۘ;->֫(Ll/᩹ܿ֡;Ljava/lang/Object;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-object v1
.end method

.method public ֫(Ll/ᩴܿ֡;)Ll/᩹ܿ֡;
    .locals 3

    if-eqz p1, :cond_1

    .line 171
    invoke-interface {p1}, Ll/᩹ܿ֡;->ᩳ()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 172
    invoke-interface {p1}, Ll/᩹ܿ֡;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    .line 175
    :cond_0
    invoke-interface {p1}, Ll/᩹ܿ֡;->getChildCount()I

    move-result v0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_1

    const/4 v0, 0x0

    .line 176
    invoke-interface {p1, v0}, Ll/᩹ܿ֡;->֫(I)Ll/᩹ܿ֡;

    move-result-object p1

    .line 178
    invoke-interface {p1, v1}, Ll/᩹ܿ֡;->ۧ(Ll/᩹ܿ֡;)V

    const/4 v0, -0x1

    .line 179
    invoke-interface {p1, v0}, Ll/᩹ܿ֡;->ᩳ(I)V

    :cond_1
    return-object p1
.end method

.method public ֫(Ljava/lang/Object;Ljava/lang/String;)V
    .locals 0

    const/4 p1, 0x0

    throw p1
.end method

.method public ֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    const/4 p1, 0x0

    throw p1
.end method

.method public ֫(Ll/ᩴܿ֡;Ll/ۜܿ֡;Ll/ۜܿ֡;)V
    .locals 1

    if-nez p1, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    if-eqz p2, :cond_1

    .line 103
    invoke-interface {p2}, Ll/ۜܿ֡;->ܽ()I

    move-result p2

    goto :goto_0

    :cond_1
    const/4 p2, 0x0

    :goto_0
    if-eqz p3, :cond_2

    .line 104
    invoke-interface {p3}, Ll/ۜܿ֡;->ܽ()I

    move-result v0

    .line 105
    :cond_2
    invoke-interface {p1, p2}, Ll/᩹ܿ֡;->ܽ(I)V

    .line 106
    invoke-interface {p1, v0}, Ll/᩹ܿ֡;->ۧ(I)V

    return-void
.end method

.method public ֫(Ll/᩹ܿ֡;Ljava/lang/Object;)V
    .locals 0

    if-eqz p1, :cond_0

    if-eqz p2, :cond_0

    .line 112
    check-cast p2, Ll/᩹ܿ֡;

    invoke-interface {p1, p2}, Ll/᩹ܿ֡;->֫(Ll/᩹ܿ֡;)V

    :cond_0
    return-void
.end method

.method public ۧ()V
    .locals 0

    return-void
.end method
