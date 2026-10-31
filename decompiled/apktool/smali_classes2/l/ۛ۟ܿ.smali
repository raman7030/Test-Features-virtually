.class public final Ll/ۛ۟ܿ;
.super Ljava/lang/Object;
.source "X4M8"


# direct methods
.method public static ֫(Ljava/lang/CharSequence;IIILl/ܿۖ᩷;)I
    .locals 6

    if-ge p1, p2, :cond_9

    .line 374
    invoke-interface {p0, p1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v0

    const/16 v1, 0x2d

    const/4 v2, 0x0

    if-eq v0, v1, :cond_1

    const/16 v3, 0x2b

    if-ne v0, v3, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_2

    :cond_1
    :goto_0
    if-ne v0, v1, :cond_2

    const/4 v0, 0x1

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    :goto_1
    add-int/lit8 p1, p1, 0x1

    if-eq p1, p2, :cond_8

    :goto_2
    if-eqz v0, :cond_3

    const/high16 v1, -0x80000000

    goto :goto_3

    :cond_3
    const v1, -0x7fffffff

    .line 382
    :goto_3
    div-int v3, v1, p3

    :goto_4
    if-ge p1, p2, :cond_6

    .line 385
    invoke-static {p1, p4}, Ll/ۛ۟ܿ;->ۧ(ILl/ܿۖ᩷;)V

    add-int/lit8 v4, p1, 0x1

    .line 386
    invoke-interface {p0, p1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result p1

    invoke-static {p1, p3}, Ljava/lang/Character;->digit(CI)I

    move-result p1

    if-ltz p1, :cond_5

    if-lt v2, v3, :cond_5

    mul-int v2, v2, p3

    add-int v5, v1, p1

    if-lt v2, v5, :cond_4

    sub-int/2addr v2, p1

    move p1, v4

    goto :goto_4

    .line 392
    :cond_4
    new-instance p0, Ljava/lang/NumberFormatException;

    invoke-direct {p0}, Ljava/lang/NumberFormatException;-><init>()V

    throw p0

    .line 388
    :cond_5
    new-instance p0, Ljava/lang/NumberFormatException;

    invoke-direct {p0}, Ljava/lang/NumberFormatException;-><init>()V

    throw p0

    :cond_6
    if-eqz v0, :cond_7

    return v2

    :cond_7
    neg-int p0, v2

    return p0

    .line 378
    :cond_8
    new-instance p0, Ljava/lang/NumberFormatException;

    invoke-direct {p0}, Ljava/lang/NumberFormatException;-><init>()V

    throw p0

    .line 370
    :cond_9
    new-instance p0, Ljava/lang/NumberFormatException;

    invoke-direct {p0}, Ljava/lang/NumberFormatException;-><init>()V

    throw p0
.end method

.method public static ֫(Ljava/lang/CharSequence;ILl/ܿۖ᩷;Ll/ۤ۟ܿ;)I
    .locals 6

    const-string v0, "text"

    .line 262
    invoke-static {p0, v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 264
    invoke-static {p2}, Ll/ܽۖ᩷;->֫(Ll/ܿۖ᩷;)Ll/ܿۖ᩷;

    move-result-object p2

    .line 265
    new-instance v0, Ll/᩶۟ܿ;

    invoke-direct {v0, p3, p2}, Ll/᩶۟ܿ;-><init>(Ll/ۤ۟ܿ;Ll/ܿۖ᩷;)V

    const/4 p3, -0x1

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz p1, :cond_8

    if-eq p1, v2, :cond_7

    const/4 v3, 0x2

    if-eq p1, v3, :cond_6

    const/4 v3, 0x3

    if-eq p1, v3, :cond_2

    const/4 v2, 0x4

    if-ne p1, v2, :cond_1

    const/high16 p1, 0x100000

    new-array p1, p1, [B

    .line 409
    :try_start_0
    new-instance v2, Landroid/util/Base64InputStream;

    new-instance v3, Ll/ۙ۟ܿ;

    invoke-direct {v3, p0, p2}, Ll/ۙ۟ܿ;-><init>(Ljava/lang/CharSequence;Ll/ܿۖ᩷;)V

    invoke-direct {v2, v3, v1}, Landroid/util/Base64InputStream;-><init>(Ljava/io/InputStream;I)V
    :try_end_0
    .catch Landroid/util/Base64DataException; {:try_start_0 .. :try_end_0} :catch_0

    .line 412
    :goto_0
    :try_start_1
    invoke-virtual {v2, p1}, Ljava/io/InputStream;->read([B)I

    move-result p0

    if-eq p0, p3, :cond_0

    .line 413
    invoke-virtual {v0, p0, p1}, Ll/᩶۟ܿ;->֫(I[B)V

    goto :goto_0

    .line 415
    :cond_0
    invoke-static {p2}, Ll/ۛ۟ܿ;->ۧ(Ll/ܿۖ᩷;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 417
    :try_start_2
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catch Landroid/util/Base64DataException; {:try_start_2 .. :try_end_2} :catch_0

    goto/16 :goto_6

    :catchall_0
    move-exception p0

    .line 409
    :try_start_3
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception p1

    :try_start_4
    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_1
    throw p0
    :try_end_4
    .catch Landroid/util/Base64DataException; {:try_start_4 .. :try_end_4} :catch_0

    .line 284
    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p2, "which = "

    .line 0
    invoke-static {p1, p2}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 284
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 318
    :cond_2
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result p1

    :goto_2
    if-ge v1, p1, :cond_5

    .line 320
    invoke-static {v1, p2}, Ll/ۛ۟ܿ;->ۧ(ILl/ܿۖ᩷;)V

    .line 321
    invoke-interface {p0, v1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v3

    const/16 v4, 0x7f

    if-gt v3, v4, :cond_3

    .line 323
    invoke-virtual {v0, v3}, Ll/᩶۟ܿ;->֫(I)V

    goto :goto_3

    :cond_3
    const/16 v4, 0x3f

    .line 325
    invoke-virtual {v0, v4}, Ll/᩶۟ܿ;->֫(I)V

    .line 326
    invoke-static {v3}, Ljava/lang/Character;->isHighSurrogate(C)Z

    move-result v3

    if-eqz v3, :cond_4

    add-int/lit8 v3, v1, 0x1

    if-ge v3, p1, :cond_4

    .line 327
    invoke-interface {p0, v3}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v4

    invoke-static {v4}, Ljava/lang/Character;->isLowSurrogate(C)Z

    move-result v4

    if-eqz v4, :cond_4

    move v1, v3

    :cond_4
    :goto_3
    add-int/2addr v1, v2

    goto :goto_2

    .line 332
    :cond_5
    invoke-static {p2}, Ll/ۛ۟ܿ;->ۧ(Ll/ܿۖ᩷;)V

    goto :goto_8

    .line 275
    :cond_6
    invoke-static {p0, v3, p2, v0}, Ll/ۛ۟ܿ;->֫(Ljava/lang/CharSequence;ILl/ܿۖ᩷;Ll/᩶۟ܿ;)Z

    move-result v2

    goto :goto_8

    :cond_7
    const/16 p1, 0xa

    .line 272
    invoke-static {p0, p1, p2, v0}, Ll/ۛ۟ܿ;->֫(Ljava/lang/CharSequence;ILl/ܿۖ᩷;Ll/᩶۟ܿ;)Z

    move-result v2

    goto :goto_8

    .line 293
    :cond_8
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result p1

    const/4 v2, 0x0

    const/4 v3, -0x1

    :goto_4
    if-ge v2, p1, :cond_c

    .line 295
    invoke-static {v2, p2}, Ll/ۛ۟ܿ;->ۧ(ILl/ܿۖ᩷;)V

    .line 296
    invoke-interface {p0, v2}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v4

    .line 297
    invoke-static {v4}, Ll/ۛ۟ܿ;->֫(C)Z

    move-result v5

    if-eqz v5, :cond_9

    goto :goto_5

    :cond_9
    const/16 v5, 0x10

    .line 300
    invoke-static {v4, v5}, Ljava/lang/Character;->digit(CI)I

    move-result v4

    if-gez v4, :cond_a

    goto :goto_7

    :cond_a
    if-gez v3, :cond_b

    move v3, v4

    goto :goto_5

    :cond_b
    shl-int/lit8 v3, v3, 0x4

    or-int/2addr v3, v4

    .line 307
    invoke-virtual {v0, v3}, Ll/᩶۟ܿ;->֫(I)V

    const/4 v3, -0x1

    :goto_5
    add-int/lit8 v2, v2, 0x1

    goto :goto_4

    .line 311
    :cond_c
    invoke-static {p2}, Ll/ۛ۟ܿ;->ۧ(Ll/ܿۖ᩷;)V

    if-gez v3, :cond_d

    :goto_6
    const/4 v1, 0x1

    :catch_0
    :cond_d
    :goto_7
    move v2, v1

    :goto_8
    if-eqz v2, :cond_e

    .line 286
    invoke-virtual {v0}, Ll/᩶۟ܿ;->֫()I

    move-result p3

    :cond_e
    return p3
.end method

.method public static ֫(Ll/ۜܰܿ;Ll/۬۟ܿ;Ljava/lang/CharSequence;ILl/۠۟ܿ;)Ll/ۗ۟ܿ;
    .locals 7

    const-string v0, "editView"

    .line 144
    invoke-static {p0, v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 145
    iget v0, p1, Ll/۬۟ܿ;->ܿ:I

    const-string v1, "text"

    .line 146
    invoke-static {p2, v1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 147
    new-instance v1, Ll/֨۟ܿ;

    invoke-direct {v1, p4, p1, p0}, Ll/֨۟ܿ;-><init>(Ll/۠۟ܿ;Ll/۬۟ܿ;Ll/ۜܰܿ;)V

    invoke-static {v1}, Ll/ܽۖ᩷;->֫(Ll/ܿۖ᩷;)Ll/ܿۖ᩷;

    move-result-object p0

    .line 149
    invoke-static {p0}, Ll/ۛ۟ܿ;->ۧ(Ll/ܿۖ᩷;)V

    .line 151
    iget-object p4, p1, Ll/۬۟ܿ;->֫:Ll/ᩳܽܳ;

    invoke-virtual {p4}, Ll/ᩳܽܳ;->᩹()Ll/ܽܽܳ;

    move-result-object v1

    .line 153
    :try_start_0
    invoke-virtual {v1}, Ll/ܽܽܳ;->֫()J

    move-result-wide v2

    iget-wide v4, p1, Ll/۬۟ܿ;->ۧ:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_4

    cmp-long v6, v2, v4

    if-nez v6, :cond_4

    .line 156
    :try_start_1
    invoke-virtual {v1, p0}, Ll/ܽܽܳ;->֫(Ll/ܿۖ᩷;)Ll/ܺܽܳ;

    move-result-object v2
    :try_end_1
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_4

    .line 158
    :try_start_2
    invoke-virtual {p4, v2}, Ll/ᩳܽܳ;->֫(Ll/ܺܽܳ;)Ll/ۧܽܳ;

    move-result-object v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 159
    :try_start_3
    new-instance v4, Ll/ۤ۟ܿ;

    iget p1, p1, Ll/۬۟ܿ;->ܽ:I

    invoke-direct {v4, v3, v0, p1, p0}, Ll/ۤ۟ܿ;-><init>(Ll/ۧܽܳ;IILl/ܿۖ᩷;)V

    .line 161
    invoke-static {p2, p3, p0, v4}, Ll/ۛ۟ܿ;->֫(Ljava/lang/CharSequence;ILl/ܿۖ᩷;Ll/ۤ۟ܿ;)I

    move-result p1

    if-gez p1, :cond_0

    .line 163
    invoke-static {}, Ll/ۗ۟ܿ;->֫()Ll/ۗ۟ܿ;

    move-result-object p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 174
    :try_start_4
    invoke-virtual {v3}, Ll/ۧܽܳ;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :try_start_5
    invoke-virtual {v2}, Ll/ܺܽܳ;->close()V
    :try_end_5
    .catch Ljava/lang/IllegalStateException; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    .line 182
    invoke-virtual {v1}, Ll/ܽܽܳ;->close()V

    return-object p1

    .line 165
    :cond_0
    :try_start_6
    invoke-virtual {v4}, Ll/ۤ۟ܿ;->֫()V

    int-to-long p2, v0

    int-to-long v4, p1

    add-long/2addr p2, v4

    long-to-int v0, p2

    int-to-long v4, v0

    cmp-long v6, p2, v4

    if-nez v6, :cond_2

    .line 168
    invoke-virtual {v3, v0, v0}, Ll/ۧܽܳ;->ۧ(II)V

    .line 169
    invoke-virtual {v3, p0}, Ll/ۧܽܳ;->֫(Ll/ܿۖ᩷;)Z

    move-result p2

    if-eqz p2, :cond_1

    .line 173
    invoke-virtual {p4}, Ll/ᩳܽܳ;->ۖ()J

    move-result-wide p2

    .line 172
    invoke-static {p1, p2, p3}, Ll/ۗ۟ܿ;->֫(IJ)Ll/ۗ۟ܿ;

    move-result-object p1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 174
    :try_start_7
    invoke-virtual {v3}, Ll/ۧܽܳ;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    :try_start_8
    invoke-virtual {v2}, Ll/ܺܽܳ;->close()V
    :try_end_8
    .catch Ljava/lang/IllegalStateException; {:try_start_8 .. :try_end_8} :catch_0
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    .line 182
    invoke-virtual {v1}, Ll/ܽܽܳ;->close()V

    return-object p1

    .line 170
    :cond_1
    :try_start_9
    new-instance p1, Ll/᩻ܽܳ;

    invoke-direct {p1}, Ll/᩻ܽܳ;-><init>()V

    throw p1

    .line 0
    :cond_2
    new-instance p1, Ljava/lang/ArithmeticException;

    invoke-direct {p1}, Ljava/lang/ArithmeticException;-><init>()V

    throw p1
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    :catchall_0
    move-exception p1

    .line 156
    :try_start_a
    invoke-virtual {v3}, Ll/ۧܽܳ;->close()V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception p2

    :try_start_b
    invoke-virtual {p1, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw p1
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_2

    :catchall_2
    move-exception p1

    :try_start_c
    invoke-virtual {v2}, Ll/ܺܽܳ;->close()V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_3

    goto :goto_1

    :catchall_3
    move-exception p2

    :try_start_d
    invoke-virtual {p1, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_1
    throw p1
    :try_end_d
    .catch Ljava/lang/IllegalStateException; {:try_start_d .. :try_end_d} :catch_0
    .catchall {:try_start_d .. :try_end_d} :catchall_4

    :catch_0
    move-exception p1

    .line 175
    :try_start_e
    invoke-interface {p0}, Ll/ܿۖ᩷;->᩻()Z

    move-result p0

    if-eqz p0, :cond_3

    .line 176
    new-instance p0, Ll/᩻ܽܳ;

    invoke-direct {p0}, Ll/᩻ܽܳ;-><init>()V

    throw p0

    .line 178
    :cond_3
    throw p1

    .line 154
    :cond_4
    new-instance p0, Ll/᩻ܽܳ;

    invoke-direct {p0}, Ll/᩻ܽܳ;-><init>()V

    throw p0
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_4

    :catchall_4
    move-exception p0

    .line 182
    invoke-virtual {v1}, Ll/ܽܽܳ;->close()V

    .line 183
    throw p0
.end method

.method public static bridge synthetic ֫(ILl/ܿۖ᩷;)V
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ۛ۟ܿ;->ۧ(ILl/ܿۖ᩷;)V

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ܿۖ᩷;)V
    .locals 0

    .line 0
    invoke-static {p0}, Ll/ۛ۟ܿ;->ۧ(Ll/ܿۖ᩷;)V

    return-void
.end method

.method public static ֫(C)Z
    .locals 1

    const/16 v0, 0x20

    if-eq p0, v0, :cond_1

    const/16 v0, 0x9

    if-eq p0, v0, :cond_1

    const/16 v0, 0xa

    if-eq p0, v0, :cond_1

    const/16 v0, 0xb

    if-eq p0, v0, :cond_1

    const/16 v0, 0xc

    if-eq p0, v0, :cond_1

    const/16 v0, 0xd

    if-ne p0, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method

.method public static ֫(Ljava/lang/CharSequence;ILl/ܿۖ᩷;Ll/᩶۟ܿ;)Z
    .locals 7

    .line 342
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, -0x1

    :goto_0
    const/4 v5, 0x1

    if-gt v2, v0, :cond_4

    .line 347
    :try_start_0
    invoke-static {v2, p2}, Ll/ۛ۟ܿ;->ۧ(ILl/ܿۖ᩷;)V

    if-eq v2, v0, :cond_1

    .line 348
    invoke-interface {p0, v2}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v6

    invoke-static {v6}, Ll/ۛ۟ܿ;->֫(C)Z

    move-result v6

    if-eqz v6, :cond_0

    goto :goto_1

    :cond_0
    const/4 v5, 0x0

    :cond_1
    :goto_1
    if-nez v5, :cond_2

    if-gez v4, :cond_2

    move v4, v2

    goto :goto_2

    :cond_2
    if-eqz v5, :cond_3

    if-ltz v4, :cond_3

    .line 352
    invoke-static {p0, v4, v2, p1, p2}, Ll/ۛ۟ܿ;->֫(Ljava/lang/CharSequence;IIILl/ܿۖ᩷;)I

    move-result v4

    invoke-virtual {p3, v4}, Ll/᩶۟ܿ;->֫(I)V

    add-int/lit8 v3, v3, 0x1

    const/4 v4, -0x1

    :cond_3
    :goto_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 357
    :cond_4
    invoke-static {p2}, Ll/ۛ۟ܿ;->ۧ(Ll/ܿۖ᩷;)V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v3, :cond_5

    return v5

    :catch_0
    :cond_5
    return v1
.end method

.method public static ۧ(ILl/ܿۖ᩷;)V
    .locals 0

    and-int/lit16 p0, p0, 0x3fff

    if-nez p0, :cond_0

    .line 604
    invoke-static {p1}, Ll/ۛ۟ܿ;->ۧ(Ll/ܿۖ᩷;)V

    :cond_0
    return-void
.end method

.method public static ۧ(Ll/ܿۖ᩷;)V
    .locals 0

    if-eqz p0, :cond_1

    .line 611
    invoke-interface {p0}, Ll/ܿۖ᩷;->᩻()Z

    move-result p0

    if-nez p0, :cond_0

    goto :goto_0

    .line 612
    :cond_0
    new-instance p0, Ll/᩻ܽܳ;

    invoke-direct {p0}, Ll/᩻ܽܳ;-><init>()V

    throw p0

    :cond_1
    :goto_0
    return-void
.end method
