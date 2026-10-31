.class public final Ll/ۢ᩺ܿ;
.super Ljava/lang/Object;
.source "964V"


# static fields
.field public static final synthetic ֫:I

.field public static final ۧ:[C


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-string v0, "0123456789ABCDEF"

    .line 30
    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    sput-object v0, Ll/ۢ᩺ܿ;->ۧ:[C

    return-void
.end method

.method public static ֫(III)J
    .locals 6

    if-ltz p0, :cond_6

    if-lez p1, :cond_6

    if-nez p0, :cond_0

    const-wide/16 v0, 0x0

    goto :goto_0

    :cond_0
    int-to-long v0, p0

    const-wide/16 v2, 0x1

    sub-long/2addr v0, v2

    int-to-long v2, p1

    .line 247
    div-long/2addr v0, v2

    :goto_0
    const-wide/16 v2, 0x3

    if-eqz p2, :cond_5

    const/4 p1, 0x1

    const-wide/16 v4, 0x4

    if-eq p2, p1, :cond_4

    const/4 p1, 0x2

    if-eq p2, p1, :cond_3

    const/4 p1, 0x3

    if-eq p2, p1, :cond_2

    const/4 p1, 0x4

    if-ne p2, p1, :cond_1

    int-to-long p0, p0

    const-wide/16 v0, 0x2

    add-long/2addr p0, v0

    .line 254
    div-long/2addr p0, v2

    mul-long p0, p0, v4

    const-wide/16 v2, 0x4c

    .line 255
    div-long v2, p0, v2

    add-long/2addr v2, p0

    goto :goto_1

    .line 257
    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "which = "

    .line 0
    invoke-static {p2, p1}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 257
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    int-to-long p0, p0

    return-wide p0

    :cond_3
    const-wide/16 p1, 0x9

    int-to-long v2, p0

    mul-long v2, v2, p1

    :goto_1
    add-long/2addr v2, v0

    return-wide v2

    :cond_4
    int-to-long p0, p0

    mul-long p0, p0, v4

    goto :goto_2

    :cond_5
    int-to-long p0, p0

    mul-long p0, p0, v2

    :goto_2
    add-long/2addr p0, v0

    return-wide p0

    .line 245
    :cond_6
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Invalid copy range"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ֫(Ll/ۢܽܳ;IILl/ۤۨܿ;)Ljava/lang/String;
    .locals 5

    if-lez p1, :cond_2

    const/4 v0, 0x5

    const-wide/32 v1, 0x80000

    if-ge p2, v0, :cond_1

    .line 224
    invoke-virtual {p0}, Ll/ۢܽܳ;->length()I

    move-result v0

    invoke-static {v0, p1, p2}, Ll/ۢ᩺ܿ;->֫(III)J

    move-result-wide v3

    cmp-long v0, v3, v1

    if-gtz v0, :cond_0

    goto :goto_0

    .line 226
    :cond_0
    new-instance p0, Ll/ܿ᩺ܿ;

    .line 505
    invoke-direct {p0}, Ljava/io/IOException;-><init>()V

    .line 226
    throw p0

    .line 228
    :cond_1
    :goto_0
    invoke-static {p3}, Ll/ܽۖ᩷;->֫(Ll/ܿۖ᩷;)Ll/ܿۖ᩷;

    move-result-object p3

    const/4 v0, 0x1

    const/4 v3, 0x0

    packed-switch p2, :pswitch_data_0

    .line 238
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "which = "

    .line 0
    invoke-static {p2, p1}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 238
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 292
    :pswitch_0
    new-instance p1, Ljava/util/zip/CRC32;

    invoke-direct {p1}, Ljava/util/zip/CRC32;-><init>()V

    .line 293
    new-instance p2, Ll/ܰۨܿ;

    invoke-direct {p2, p3, p1}, Ll/ܰۨܿ;-><init>(Ll/ܿۖ᩷;Ljava/util/zip/CRC32;)V

    .line 298
    invoke-virtual {p0}, Ll/ۢܽܳ;->length()I

    move-result p3

    .line 293
    invoke-virtual {p0, p2, p3}, Ll/ۢܽܳ;->֫(Ljava/io/OutputStream;I)V

    .line 299
    invoke-virtual {p1}, Ljava/util/zip/CRC32;->getValue()J

    move-result-wide p0

    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p0

    new-array p1, v0, [Ljava/lang/Object;

    aput-object p0, p1, v3

    const-string p0, "%08X"

    invoke-static {p0, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 236
    :pswitch_1
    invoke-static {}, Ll/ܳۤۡ;->֫()Ljava/security/MessageDigest;

    move-result-object p1

    .line 281
    new-instance p2, Ll/᩺ۨܿ;

    invoke-direct {p2, p3, p1}, Ll/᩺ۨܿ;-><init>(Ll/ܿۖ᩷;Ljava/security/MessageDigest;)V

    .line 286
    invoke-virtual {p0}, Ll/ۢܽܳ;->length()I

    move-result p3

    .line 281
    invoke-virtual {p0, p2, p3}, Ll/ۢܽܳ;->֫(Ljava/io/OutputStream;I)V

    .line 287
    invoke-virtual {p1}, Ljava/security/MessageDigest;->digest()[B

    move-result-object p0

    invoke-static {p0}, Ll/ܳۤۡ;->ۧ([B)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 235
    :pswitch_2
    invoke-static {}, Ll/ܳۤۡ;->ۧ()Ljava/security/MessageDigest;

    move-result-object p1

    .line 281
    new-instance p2, Ll/᩺ۨܿ;

    invoke-direct {p2, p3, p1}, Ll/᩺ۨܿ;-><init>(Ll/ܿۖ᩷;Ljava/security/MessageDigest;)V

    .line 286
    invoke-virtual {p0}, Ll/ۢܽܳ;->length()I

    move-result p3

    .line 281
    invoke-virtual {p0, p2, p3}, Ll/ۢܽܳ;->֫(Ljava/io/OutputStream;I)V

    .line 287
    invoke-virtual {p1}, Ljava/security/MessageDigest;->digest()[B

    move-result-object p0

    invoke-static {p0}, Ll/ܳۤۡ;->ۧ([B)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 270
    :pswitch_3
    invoke-virtual {p0}, Ll/ۢܽܳ;->length()I

    move-result p1

    const/4 p2, 0x4

    invoke-static {p1, v0, p2}, Ll/ۢ᩺ܿ;->֫(III)J

    move-result-wide p1

    .line 269
    invoke-static {v1, v2, p1, p2}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p1

    long-to-int p2, p1

    .line 271
    new-instance p1, Ljava/io/ByteArrayOutputStream;

    invoke-direct {p1, p2}, Ljava/io/ByteArrayOutputStream;-><init>(I)V

    .line 272
    new-instance p2, Landroid/util/Base64OutputStream;

    invoke-direct {p2, p1, v3}, Landroid/util/Base64OutputStream;-><init>(Ljava/io/OutputStream;I)V

    .line 273
    :try_start_0
    new-instance v0, Ll/ۧ᩺ܿ;

    invoke-direct {v0, p2, p3}, Ll/ۧ᩺ܿ;-><init>(Landroid/util/Base64OutputStream;Ll/ܿۖ᩷;)V

    invoke-virtual {p0}, Ll/ۢܽܳ;->length()I

    move-result p3

    invoke-virtual {p0, v0, p3}, Ll/ۢܽܳ;->֫(Ljava/io/OutputStream;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 274
    invoke-virtual {p2}, Landroid/util/Base64OutputStream;->close()V

    .line 275
    sget-object p0, Ljava/nio/charset/StandardCharsets;->US_ASCII:Ljava/nio/charset/Charset;

    invoke-virtual {p0}, Ljava/nio/charset/Charset;->name()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Ljava/io/ByteArrayOutputStream;->toString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :catchall_0
    move-exception p0

    .line 272
    :try_start_1
    invoke-virtual {p2}, Landroid/util/Base64OutputStream;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception p1

    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_1
    throw p0

    .line 233
    :pswitch_4
    new-instance p1, Ll/۟ۨܿ;

    invoke-virtual {p0}, Ll/ۢܽܳ;->length()I

    move-result p2

    .line 424
    invoke-direct {p1, p2, p3}, Ll/ۜ᩺ܿ;-><init>(ILl/ܿۖ᩷;)V

    .line 263
    invoke-virtual {p0}, Ll/ۢܽܳ;->length()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Ll/ۢܽܳ;->֫(Ljava/io/OutputStream;I)V

    .line 264
    invoke-virtual {p1}, Ll/ۜ᩺ܿ;->finish()Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 232
    :pswitch_5
    new-instance p2, Ll/֫᩺ܿ;

    invoke-virtual {p0}, Ll/ۢܽܳ;->length()I

    move-result v0

    invoke-direct {p2, v0, p1, p3}, Ll/֫᩺ܿ;-><init>(IILl/ܿۖ᩷;)V

    .line 263
    invoke-virtual {p0}, Ll/ۢܽܳ;->length()I

    move-result p1

    invoke-virtual {p0, p2, p1}, Ll/ۢܽܳ;->֫(Ljava/io/OutputStream;I)V

    .line 264
    invoke-virtual {p2}, Ll/֫᩺ܿ;->finish()Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 231
    :pswitch_6
    new-instance p2, Ll/ܳ᩺ܿ;

    invoke-virtual {p0}, Ll/ۢܽܳ;->length()I

    move-result v0

    invoke-direct {p2, v0, p1, p3}, Ll/ܳ᩺ܿ;-><init>(IILl/ܿۖ᩷;)V

    .line 263
    invoke-virtual {p0}, Ll/ۢܽܳ;->length()I

    move-result p1

    invoke-virtual {p0, p2, p1}, Ll/ۢܽܳ;->֫(Ljava/io/OutputStream;I)V

    .line 264
    invoke-virtual {p2}, Ll/ܳ᩺ܿ;->finish()Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 230
    :pswitch_7
    new-instance p2, Ll/᩻᩺ܿ;

    invoke-virtual {p0}, Ll/ۢܽܳ;->length()I

    move-result v0

    invoke-direct {p2, v0, p1, p3}, Ll/᩻᩺ܿ;-><init>(IILl/ܿۖ᩷;)V

    .line 263
    invoke-virtual {p0}, Ll/ۢܽܳ;->length()I

    move-result p1

    invoke-virtual {p0, p2, p1}, Ll/ۢܽܳ;->֫(Ljava/io/OutputStream;I)V

    .line 264
    invoke-virtual {p2}, Ll/᩻᩺ܿ;->finish()Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 222
    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "column must be positive"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static ֫(Ljava/lang/StringBuilder;)V
    .locals 2

    .line 495
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    if-eqz v0, :cond_0

    .line 496
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    const/16 v1, 0xa

    invoke-virtual {p0, v0, v1}, Ljava/lang/StringBuilder;->setCharAt(IC)V

    :cond_0
    return-void
.end method

.method public static ֫(Ll/ۜܰܿ;Ll/ᩳ᩺ܿ;Ll/ۗܺ᩷;)Z
    .locals 1

    if-eqz p2, :cond_0

    .line 168
    invoke-virtual {p2}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p2}, Landroid/app/Activity;->isDestroyed()Z

    move-result p2

    if-nez p2, :cond_1

    .line 169
    :cond_0
    invoke-virtual {p1, p0}, Ll/ᩳ᩺ܿ;->֫(Ll/ۜܰܿ;)Z

    move-result p0

    if-eqz p0, :cond_1

    const/4 p0, 0x1

    return p0

    :cond_1
    const/4 p0, 0x0

    return p0
.end method

.method public static bridge synthetic ֫()[C
    .locals 1

    .line 0
    sget-object v0, Ll/ۢ᩺ܿ;->ۧ:[C

    return-object v0
.end method
