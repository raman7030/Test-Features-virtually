.class public final Ll/۬֨۠;
.super Ljava/lang/Object;
.source "F411"


# direct methods
.method public static ֫([BII[C)I
    .locals 5

    const/4 v0, 0x0

    :goto_0
    if-ge v0, p2, :cond_2

    .line 191
    aget-char v1, p3, v0

    const/4 v2, 0x1

    if-gt v2, v1, :cond_0

    const/16 v2, 0x7f

    if-gt v1, v2, :cond_0

    add-int/lit8 v2, p1, 0x1

    int-to-byte v1, v1

    .line 193
    aput-byte v1, p0, p1

    move p1, v2

    goto :goto_1

    :cond_0
    const/16 v2, 0x7ff

    if-gt v1, v2, :cond_1

    add-int/lit8 v2, p1, 0x1

    shr-int/lit8 v3, v1, 0x6

    or-int/lit16 v3, v3, 0xc0

    int-to-byte v3, v3

    .line 195
    aput-byte v3, p0, p1

    add-int/lit8 p1, p1, 0x2

    and-int/lit8 v1, v1, 0x3f

    or-int/lit16 v1, v1, 0x80

    int-to-byte v1, v1

    .line 196
    aput-byte v1, p0, v2

    goto :goto_1

    :cond_1
    add-int/lit8 v2, p1, 0x1

    shr-int/lit8 v3, v1, 0xc

    or-int/lit16 v3, v3, 0xe0

    int-to-byte v3, v3

    .line 198
    aput-byte v3, p0, p1

    add-int/lit8 v3, p1, 0x2

    shr-int/lit8 v4, v1, 0x6

    and-int/lit8 v4, v4, 0x3f

    or-int/lit16 v4, v4, 0x80

    int-to-byte v4, v4

    .line 199
    aput-byte v4, p0, v2

    add-int/lit8 p1, p1, 0x3

    and-int/lit8 v1, v1, 0x3f

    or-int/lit16 v1, v1, 0x80

    int-to-byte v1, v1

    .line 200
    aput-byte v1, p0, v3

    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    return p1
.end method

.method public static ֫(C)Ljava/lang/String;
    .locals 2

    const/16 v0, 0xc

    if-eq p0, v0, :cond_5

    const/16 v0, 0xd

    if-eq p0, v0, :cond_4

    const/16 v0, 0x22

    if-eq p0, v0, :cond_3

    const/16 v0, 0x27

    if-eq p0, v0, :cond_2

    const/16 v0, 0x5c

    if-eq p0, v0, :cond_1

    packed-switch p0, :pswitch_data_0

    const/16 v0, 0x20

    if-lt p0, v0, :cond_0

    const/16 v0, 0x7e

    if-gt p0, v0, :cond_0

    .line 261
    invoke-static {p0}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :pswitch_0
    const-string p0, "\\n"

    return-object p0

    :pswitch_1
    const-string p0, "\\t"

    return-object p0

    :pswitch_2
    const-string p0, "\\b"

    return-object p0

    .line 262
    :cond_0
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p0, v0, v1

    const-string p0, "\\u%04x"

    invoke-static {p0, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_1
    const-string p0, "\\\\"

    return-object p0

    :cond_2
    const-string p0, "\\\'"

    return-object p0

    :cond_3
    const-string p0, "\\\""

    return-object p0

    :cond_4
    const-string p0, "\\r"

    return-object p0

    :cond_5
    const-string p0, "\\f"

    return-object p0

    nop

    :pswitch_data_0
    .packed-switch 0x8
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static ֫(II[B)Ljava/lang/String;
    .locals 7

    .line 161
    new-array v0, p1, [C

    add-int/2addr p1, p0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge p0, p1, :cond_2

    add-int/lit8 v3, p0, 0x1

    .line 120
    aget-byte v4, p2, p0

    and-int/lit16 v5, v4, 0xff

    const/16 v6, 0xe0

    if-lt v5, v6, :cond_0

    and-int/lit8 v4, v4, 0xf

    shl-int/lit8 v4, v4, 0xc

    add-int/lit8 v5, p0, 0x2

    .line 123
    aget-byte v3, p2, v3

    and-int/lit8 v3, v3, 0x3f

    shl-int/lit8 v3, v3, 0x6

    or-int/2addr v3, v4

    add-int/lit8 p0, p0, 0x3

    .line 124
    aget-byte v4, p2, v5

    and-int/lit8 v4, v4, 0x3f

    or-int v5, v3, v4

    goto :goto_1

    :cond_0
    const/16 v6, 0xc0

    if-lt v5, v6, :cond_1

    and-int/lit8 v4, v4, 0x1f

    shl-int/lit8 v4, v4, 0x6

    add-int/lit8 p0, p0, 0x2

    .line 127
    aget-byte v3, p2, v3

    and-int/lit8 v3, v3, 0x3f

    or-int v5, v4, v3

    goto :goto_1

    :cond_1
    move p0, v3

    :goto_1
    add-int/lit8 v3, v2, 0x1

    int-to-char v4, v5

    .line 129
    aput-char v4, v0, v2

    move v2, v3

    goto :goto_0

    .line 163
    :cond_2
    new-instance p0, Ljava/lang/String;

    invoke-direct {p0, v0, v1, v2}, Ljava/lang/String;-><init>([CII)V

    return-object p0
.end method

.method public static ֫(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 238
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, 0x0

    .line 239
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v2

    if-ge v1, v2, :cond_0

    .line 240
    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v2

    invoke-static {v2}, Ll/۬֨۠;->֫(C)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 242
    :cond_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ll/ۤܶ۠;)Ll/ۖܶ۠;
    .locals 7

    .line 351
    invoke-static {}, Ll/ۖܶ۠;->ܳ()Ll/ۖܶ۠;

    move-result-object v0

    .line 352
    invoke-virtual {p0}, Ll/ۤܶ۠;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, -0x1

    :goto_0
    add-int/lit8 v2, v2, 0x1

    const/16 v3, 0x2e

    .line 354
    invoke-virtual {v1, v3, v2}, Ljava/lang/String;->indexOf(II)I

    move-result v2

    if-lez v2, :cond_0

    add-int/lit8 v4, v2, 0x1

    const/4 v5, 0x0

    .line 355
    invoke-virtual {v1, v5, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v5

    .line 356
    invoke-virtual {v1, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v4

    const/16 v6, 0x24

    invoke-virtual {v4, v3, v6}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v3

    .line 357
    iget-object v4, p0, Ll/ۤܶ۠;->᩸:Ll/۫ܶ۠;

    iget-object v4, v4, Ll/۫ܶ۠;->֫:Ll/ۛܶ۠;

    .line 0
    invoke-static {v5, v3}, Ll/ܺܶۡ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 414
    iget-object v4, v4, Ll/ۛܶ۠;->ᩴܽ:Ll/۫ܶ۠;

    invoke-virtual {v4, v3}, Ll/۫ܶ۠;->֫(Ljava/lang/String;)Ll/ۤܶ۠;

    move-result-object v3

    .line 357
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 230
    new-instance v4, Ll/ۖܶ۠;

    invoke-direct {v4, v3, v0}, Ll/ۖܶ۠;-><init>(Ljava/lang/Object;Ll/ۖܶ۠;)V

    move-object v0, v4

    goto :goto_0

    .line 359
    :cond_0
    invoke-virtual {v0}, Ll/ۖܶ۠;->ᩳ()Ll/ۖܶ۠;

    move-result-object p0

    return-object p0
.end method

.method public static ۧ(Ll/ۤܶ۠;)Ll/ۖܶ۠;
    .locals 3

    .line 341
    invoke-static {}, Ll/ۖܶ۠;->ܳ()Ll/ۖܶ۠;

    move-result-object v0

    :goto_0
    const/16 v1, 0x24

    .line 343
    invoke-virtual {p0, v1}, Ll/ۤܶ۠;->֫(B)I

    move-result v1

    if-lez v1, :cond_0

    const/4 v2, 0x0

    .line 344
    invoke-virtual {p0, v2, v1}, Ll/ۤܶ۠;->֫(II)Ll/ۤܶ۠;

    move-result-object p0

    .line 345
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 230
    new-instance v1, Ll/ۖܶ۠;

    invoke-direct {v1, p0, v0}, Ll/ۖܶ۠;-><init>(Ljava/lang/Object;Ll/ۖܶ۠;)V

    move-object v0, v1

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public static ܽ(Ll/ۤܶ۠;)Ll/ۤܶ۠;
    .locals 3

    const/16 v0, 0x2e

    .line 311
    invoke-virtual {p0, v0}, Ll/ۤܶ۠;->֫(B)I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    .line 312
    invoke-virtual {p0}, Ll/ۤܶ۠;->ۧ()I

    move-result v2

    if-nez v1, :cond_0

    .line 313
    invoke-virtual {p0}, Ll/ۤܶ۠;->length()I

    move-result v1

    if-ne v2, v1, :cond_0

    return-object p0

    .line 317
    :cond_0
    invoke-virtual {p0, v0}, Ll/ۤܶ۠;->֫(B)I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {p0}, Ll/ۤܶ۠;->ۧ()I

    move-result v1

    .line 316
    invoke-virtual {p0, v0, v1}, Ll/ۤܶ۠;->֫(II)Ll/ۤܶ۠;

    move-result-object p0

    return-object p0
.end method
