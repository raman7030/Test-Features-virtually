.class public Ll/ۤܰۖ;
.super Ljava/lang/Object;
.source "04CR"


# instance fields
.field public ֫:[B

.field public ۧ:Ll/᩺ܰۖ;

.field public ܽ:I

.field public ᩳ:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 30
    const-class v0, Ll/ۤܰۖ;

    invoke-static {v0}, Ll/ۧ᩻֨;->֫(Ljava/lang/Class;)Ll/֫᩻֨;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    const/16 v0, 0x100

    .line 101
    invoke-static {v0}, Ll/ۤܰۖ;->ܳ(I)I

    move-result v0

    new-array v0, v0, [B

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Ll/ۤܰۖ;-><init>([BZ)V

    return-void
.end method

.method public constructor <init>([B)V
    .locals 1

    const/4 v0, 0x1

    .line 97
    invoke-direct {p0, p1, v0}, Ll/ۤܰۖ;-><init>([BZ)V

    return-void
.end method

.method public constructor <init>([BZ)V
    .locals 1

    .line 104
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 105
    iput-object p1, p0, Ll/ۤܰۖ;->֫:[B

    .line 106
    sget-object v0, Ll/᩺ܰۖ;->ۧ:Ll/᩺ܰۖ;

    iput-object v0, p0, Ll/ۤܰۖ;->ۧ:Ll/᩺ܰۖ;

    const/4 v0, 0x0

    .line 107
    iput v0, p0, Ll/ۤܰۖ;->ܽ:I

    if-eqz p2, :cond_0

    .line 108
    array-length v0, p1

    :cond_0
    iput v0, p0, Ll/ۤܰۖ;->ᩳ:I

    return-void
.end method

.method public static ܳ(I)I
    .locals 3

    const/4 v0, 0x1

    :goto_0
    if-ge v0, p0, :cond_1

    shl-int/lit8 v0, v0, 0x1

    if-lez v0, :cond_0

    goto :goto_0

    .line 73
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Cannot get next power of 2; "

    const-string v2, " is too large"

    .line 0
    invoke-static {p0, v1, v2}, Ll/ᩳ᩷ᩳ;->֫(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 73
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    return v0
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 3

    .line 753
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Buffer [rpos="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Ll/ۤܰۖ;->ܽ:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", wpos="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ll/ۤܰۖ;->ᩳ:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", size="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ۤܰۖ;->֫:[B

    array-length v1, v1

    const-string v2, "]"

    .line 0
    invoke-static {v1, v2, v0}, Ll/ۗۧᩳ;->֫(ILjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(ILjava/nio/charset/Charset;)Ljava/lang/String;
    .locals 3

    .line 609
    invoke-virtual {p2}, Ljava/nio/charset/Charset;->name()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v1

    const/4 v2, -0x1

    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v1, "UTF-16LE"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x3

    goto :goto_0

    :sswitch_1
    const-string v1, "UTF-16BE"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v2, 0x2

    goto :goto_0

    :sswitch_2
    const-string v1, "UTF-8"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    const/4 v2, 0x1

    goto :goto_0

    :sswitch_3
    const-string v1, "UTF-16"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_0

    :cond_3
    const/4 v2, 0x0

    :goto_0
    packed-switch v2, :pswitch_data_0

    .line 619
    new-instance p1, Ljava/nio/charset/UnsupportedCharsetException;

    invoke-virtual {p2}, Ljava/nio/charset/Charset;->name()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/nio/charset/UnsupportedCharsetException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 277
    :pswitch_0
    sget-object p2, Ll/۠ܰۖ;->ᩳ:Ljava/nio/charset/Charset;

    invoke-static {p0, p1, p2}, Ll/᩺ܰۖ;->֫(Ll/ۤܰۖ;ILjava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 152
    :pswitch_1
    sget-object p2, Ll/۠ܰۖ;->ܽ:Ljava/nio/charset/Charset;

    invoke-static {p0, p1, p2}, Ll/᩺ܰۖ;->֫(Ll/ۤܰۖ;ILjava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 617
    :pswitch_2
    new-instance v0, Ljava/lang/String;

    .line 280
    new-array v1, p1, [B

    .line 293
    invoke-virtual {p0, p1, v1}, Ll/ۤܰۖ;->ۧ(I[B)V

    .line 617
    invoke-direct {v0, v1, p2}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    return-object v0

    .line 611
    :pswitch_3
    iget-object p2, p0, Ll/ۤܰۖ;->ۧ:Ll/᩺ܰۖ;

    check-cast p2, Ll/ۨܰۖ;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 277
    sget-object p2, Ll/۠ܰۖ;->ᩳ:Ljava/nio/charset/Charset;

    invoke-static {p0, p1, p2}, Ll/᩺ܰۖ;->֫(Ll/ۤܰۖ;ILjava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    nop

    :sswitch_data_0
    .sparse-switch
        -0x6a33dbd5 -> :sswitch_3
        0x4d50972 -> :sswitch_2
        0x5353cdae -> :sswitch_1
        0x5353cee4 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final ֫(Ljava/nio/charset/Charset;)Ljava/lang/String;
    .locals 3

    .line 637
    invoke-virtual {p1}, Ljava/nio/charset/Charset;->name()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v1

    const/4 v2, -0x1

    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v1, "UTF-16LE"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x3

    goto :goto_0

    :sswitch_1
    const-string v1, "UTF-16BE"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v2, 0x2

    goto :goto_0

    :sswitch_2
    const-string v1, "UTF-8"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    const/4 v2, 0x1

    goto :goto_0

    :sswitch_3
    const-string v1, "UTF-16"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_0

    :cond_3
    const/4 v2, 0x0

    :goto_0
    packed-switch v2, :pswitch_data_0

    .line 653
    new-instance v0, Ljava/nio/charset/UnsupportedCharsetException;

    invoke-virtual {p1}, Ljava/nio/charset/Charset;->name()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/nio/charset/UnsupportedCharsetException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 282
    :pswitch_0
    sget-object p1, Ll/۠ܰۖ;->ᩳ:Ljava/nio/charset/Charset;

    invoke-static {p0, p1}, Ll/᩺ܰۖ;->֫(Ll/ۤܰۖ;Ljava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 157
    :pswitch_1
    sget-object p1, Ll/۠ܰۖ;->ܽ:Ljava/nio/charset/Charset;

    invoke-static {p0, p1}, Ll/᩺ܰۖ;->֫(Ll/ۤܰۖ;Ljava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 645
    :pswitch_2
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 646
    invoke-virtual {p0}, Ll/ۤܰۖ;->ܿ()B

    move-result v1

    :goto_1
    if-eqz v1, :cond_4

    .line 648
    invoke-virtual {v0, v1}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 649
    invoke-virtual {p0}, Ll/ۤܰۖ;->ܿ()B

    move-result v1

    goto :goto_1

    .line 651
    :cond_4
    new-instance v1, Ljava/lang/String;

    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    invoke-direct {v1, v0, p1}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    return-object v1

    .line 639
    :pswitch_3
    move-object p1, p0

    check-cast p1, Ll/֡֫ۘ;

    iget-object v0, p0, Ll/ۤܰۖ;->ۧ:Ll/᩺ܰۖ;

    check-cast v0, Ll/ۨܰۖ;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 282
    sget-object v0, Ll/۠ܰۖ;->ᩳ:Ljava/nio/charset/Charset;

    invoke-static {p1, v0}, Ll/᩺ܰۖ;->֫(Ll/ۤܰۖ;Ljava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :sswitch_data_0
    .sparse-switch
        -0x6a33dbd5 -> :sswitch_3
        0x4d50972 -> :sswitch_2
        0x5353cdae -> :sswitch_1
        0x5353cee4 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final ֫(B)V
    .locals 3

    const/4 v0, 0x1

    .line 267
    invoke-virtual {p0, v0}, Ll/ۤܰۖ;->֫(I)V

    .line 268
    iget-object v0, p0, Ll/ۤܰۖ;->֫:[B

    iget v1, p0, Ll/ۤܰۖ;->ᩳ:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Ll/ۤܰۖ;->ᩳ:I

    aput-byte p1, v0, v1

    return-void
.end method

.method public final ֫(I)V
    .locals 3

    .line 198
    iget-object v0, p0, Ll/ۤܰۖ;->֫:[B

    array-length v0, v0

    iget v1, p0, Ll/ۤܰۖ;->ᩳ:I

    sub-int/2addr v0, v1

    if-ge v0, p1, :cond_0

    add-int/2addr v1, p1

    .line 200
    invoke-static {v1}, Ll/ۤܰۖ;->ܳ(I)I

    move-result p1

    new-array p1, p1, [B

    .line 201
    iget-object v0, p0, Ll/ۤܰۖ;->֫:[B

    array-length v1, v0

    const/4 v2, 0x0

    invoke-static {v0, v2, p1, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 202
    iput-object p1, p0, Ll/ۤܰۖ;->֫:[B

    :cond_0
    return-void
.end method

.method public final ֫(I[B)V
    .locals 3

    .line 330
    invoke-virtual {p0, p1}, Ll/ۤܰۖ;->֫(I)V

    .line 331
    iget-object v0, p0, Ll/ۤܰۖ;->֫:[B

    iget v1, p0, Ll/ۤܰۖ;->ᩳ:I

    const/4 v2, 0x0

    invoke-static {p2, v2, v0, v1, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 332
    iget p2, p0, Ll/ۤܰۖ;->ᩳ:I

    add-int/2addr p2, p1

    iput p2, p0, Ll/ۤܰۖ;->ᩳ:I

    return-void
.end method

.method public final ֫(J)V
    .locals 1

    .line 545
    iget-object v0, p0, Ll/ۤܰۖ;->ۧ:Ll/᩺ܰۖ;

    .line 557
    invoke-virtual {v0, p0, p1, p2}, Ll/᩺ܰۖ;->֫(Ll/ۤܰۖ;J)V

    return-void
.end method

.method public final ֫(Ljava/lang/String;Ljava/nio/charset/Charset;)V
    .locals 4

    .line 707
    invoke-virtual {p2}, Ljava/nio/charset/Charset;->name()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, -0x1

    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v1, "UTF-16LE"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v3, 0x3

    goto :goto_0

    :sswitch_1
    const-string v1, "UTF-16BE"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v3, 0x2

    goto :goto_0

    :sswitch_2
    const-string v1, "UTF-8"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    const/4 v3, 0x1

    goto :goto_0

    :sswitch_3
    const-string v1, "UTF-16"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_0

    :cond_3
    const/4 v3, 0x0

    :goto_0
    packed-switch v3, :pswitch_data_0

    .line 723
    new-instance p1, Ljava/nio/charset/UnsupportedCharsetException;

    invoke-virtual {p2}, Ljava/nio/charset/Charset;->name()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/nio/charset/UnsupportedCharsetException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 712
    :pswitch_0
    sget-object p2, Ll/᩺ܰۖ;->ۧ:Ll/᩺ܰۖ;

    move-object v0, p0

    check-cast v0, Ll/֡֫ۘ;

    invoke-virtual {p2, v0, p1}, Ll/᩺ܰۖ;->֫(Ll/֡֫ۘ;Ljava/lang/String;)V

    return-void

    .line 715
    :pswitch_1
    sget-object p2, Ll/᩺ܰۖ;->֫:Ll/᩺ܰۖ;

    move-object v0, p0

    check-cast v0, Ll/֡֫ۘ;

    invoke-virtual {p2, v0, p1}, Ll/᩺ܰۖ;->֫(Ll/֡֫ۘ;Ljava/lang/String;)V

    return-void

    .line 718
    :pswitch_2
    invoke-virtual {p1, p2}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p1

    .line 318
    array-length p2, p1

    invoke-virtual {p0, p2, p1}, Ll/ۤܰۖ;->֫(I[B)V

    .line 720
    invoke-virtual {p0, v2}, Ll/ۤܰۖ;->֫(B)V

    return-void

    .line 709
    :pswitch_3
    move-object p2, p0

    check-cast p2, Ll/֡֫ۘ;

    iget-object v0, p0, Ll/ۤܰۖ;->ۧ:Ll/᩺ܰۖ;

    invoke-virtual {v0, p2, p1}, Ll/᩺ܰۖ;->֫(Ll/֡֫ۘ;Ljava/lang/String;)V

    return-void

    :sswitch_data_0
    .sparse-switch
        -0x6a33dbd5 -> :sswitch_3
        0x4d50972 -> :sswitch_2
        0x5353cdae -> :sswitch_1
        0x5353cee4 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final ֫(Ll/֡֫ۘ;)V
    .locals 4

    .line 346
    invoke-virtual {p1}, Ll/ۤܰۖ;->ܽ()I

    move-result v0

    .line 347
    invoke-virtual {p0, v0}, Ll/ۤܰۖ;->֫(I)V

    .line 348
    iget-object v1, p1, Ll/ۤܰۖ;->֫:[B

    iget p1, p1, Ll/ۤܰۖ;->ܽ:I

    iget-object v2, p0, Ll/ۤܰۖ;->֫:[B

    iget v3, p0, Ll/ۤܰۖ;->ᩳ:I

    invoke-static {v1, p1, v2, v3, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 349
    iget p1, p0, Ll/ۤܰۖ;->ᩳ:I

    add-int/2addr p1, v0

    iput p1, p0, Ll/ۤܰۖ;->ᩳ:I

    return-void
.end method

.method public final ֫()[B
    .locals 1

    .line 119
    iget-object v0, p0, Ll/ۤܰۖ;->֫:[B

    return-object v0
.end method

.method public final ۜ()J
    .locals 2

    .line 457
    iget-object v0, p0, Ll/ۤܰۖ;->ۧ:Ll/᩺ܰۖ;

    .line 468
    invoke-virtual {v0, p0}, Ll/᩺ܰۖ;->ۧ(Ll/ۤܰۖ;)J

    move-result-wide v0

    return-wide v0
.end method

.method public final ۡ()I
    .locals 1

    .line 147
    iget v0, p0, Ll/ۤܰۖ;->ܽ:I

    return v0
.end method

.method public final ۢ()J
    .locals 5

    .line 500
    iget-object v0, p0, Ll/ۤܰۖ;->ۧ:Ll/᩺ܰۖ;

    .line 511
    check-cast v0, Ll/ۨܰۖ;

    .line 243
    invoke-virtual {v0, p0}, Ll/ۨܰۖ;->ۧ(Ll/ۤܰۖ;)J

    move-result-wide v1

    const-wide v3, 0xffffffffL

    and-long/2addr v1, v3

    invoke-virtual {v0, p0}, Ll/ۨܰۖ;->ۧ(Ll/ۤܰۖ;)J

    move-result-wide v3

    const/16 v0, 0x20

    shl-long/2addr v3, v0

    add-long/2addr v1, v3

    const-wide/16 v3, 0x0

    cmp-long v0, v1, v3

    if-ltz v0, :cond_0

    return-wide v1

    .line 245
    :cond_0
    new-instance v0, Ll/۬ܰۖ;

    const-string v1, "Cannot handle values > 9223372036854775807"

    .line 36
    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 245
    throw v0
.end method

.method public final ۧ()Ljava/io/InputStream;
    .locals 1

    .line 757
    new-instance v0, Ll/ۗܰۖ;

    invoke-direct {v0, p0}, Ll/ۗܰۖ;-><init>(Ll/ۤܰۖ;)V

    return-object v0
.end method

.method public final ۧ(I)V
    .locals 4

    .line 382
    iget-object v0, p0, Ll/ۤܰۖ;->ۧ:Ll/᩺ܰۖ;

    .line 393
    check-cast v0, Ll/ۨܰۖ;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-ltz p1, :cond_0

    const v0, 0xffff

    if-gt p1, v0, :cond_0

    int-to-byte v0, p1

    shr-int/lit8 p1, p1, 0x8

    int-to-byte p1, p1

    const/4 v1, 0x2

    new-array v2, v1, [B

    const/4 v3, 0x0

    aput-byte v0, v2, v3

    const/4 v0, 0x1

    aput-byte p1, v2, v0

    .line 318
    invoke-virtual {p0, v1, v2}, Ll/ۤܰۖ;->֫(I[B)V

    return-void

    .line 177
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Invalid uint16 value: "

    .line 0
    invoke-static {p1, v1}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 177
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ۧ(I[B)V
    .locals 3

    .line 186
    invoke-virtual {p0}, Ll/ۤܰۖ;->ܽ()I

    move-result v0

    if-lt v0, p1, :cond_0

    .line 307
    iget-object v0, p0, Ll/ۤܰۖ;->֫:[B

    iget v1, p0, Ll/ۤܰۖ;->ܽ:I

    const/4 v2, 0x0

    invoke-static {v0, v1, p2, v2, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 308
    iget p2, p0, Ll/ۤܰۖ;->ܽ:I

    add-int/2addr p2, p1

    iput p2, p0, Ll/ۤܰۖ;->ܽ:I

    return-void

    .line 187
    :cond_0
    new-instance p1, Ll/۬ܰۖ;

    const-string p2, "Underflow"

    .line 36
    invoke-direct {p1, p2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 187
    throw p1
.end method

.method public final ۧ(J)V
    .locals 5

    .line 478
    iget-object v0, p0, Ll/ۤܰۖ;->ۧ:Ll/᩺ܰۖ;

    .line 489
    check-cast v0, Ll/ۨܰۖ;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-ltz v2, :cond_0

    const-wide v0, 0xffffffffL

    cmp-long v2, p1, v0

    if-gtz v2, :cond_0

    long-to-int v0, p1

    int-to-byte v0, v0

    const/16 v1, 0x8

    shr-long v1, p1, v1

    long-to-int v2, v1

    int-to-byte v1, v2

    const/16 v2, 0x10

    shr-long v2, p1, v2

    long-to-int v3, v2

    int-to-byte v2, v3

    const/16 v3, 0x18

    shr-long/2addr p1, v3

    long-to-int p2, p1

    int-to-byte p1, p2

    const/4 p2, 0x4

    new-array v3, p2, [B

    const/4 v4, 0x0

    aput-byte v0, v3, v4

    const/4 v0, 0x1

    aput-byte v1, v3, v0

    const/4 v0, 0x2

    aput-byte v2, v3, v0

    const/4 v0, 0x3

    aput-byte p1, v3, v0

    .line 318
    invoke-virtual {p0, p2, v3}, Ll/ۤܰۖ;->֫(I[B)V

    return-void

    .line 214
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Invalid uint32 value: "

    .line 0
    invoke-static {p1, p2, v1}, Ll/ܺܶۡ;->֫(JLjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 214
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ۧ(Ljava/lang/String;Ljava/nio/charset/Charset;)V
    .locals 3

    .line 672
    invoke-virtual {p2}, Ljava/nio/charset/Charset;->name()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v1

    const/4 v2, -0x1

    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v1, "UTF-16LE"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x3

    goto :goto_0

    :sswitch_1
    const-string v1, "UTF-16BE"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v2, 0x2

    goto :goto_0

    :sswitch_2
    const-string v1, "UTF-8"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    const/4 v2, 0x1

    goto :goto_0

    :sswitch_3
    const-string v1, "UTF-16"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_0

    :cond_3
    const/4 v2, 0x0

    :goto_0
    packed-switch v2, :pswitch_data_0

    .line 687
    new-instance p1, Ljava/nio/charset/UnsupportedCharsetException;

    invoke-virtual {p2}, Ljava/nio/charset/Charset;->name()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/nio/charset/UnsupportedCharsetException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 677
    :pswitch_0
    sget-object p2, Ll/᩺ܰۖ;->ۧ:Ll/᩺ܰۖ;

    invoke-virtual {p2, p0, p1}, Ll/᩺ܰۖ;->֫(Ll/ۤܰۖ;Ljava/lang/String;)V

    return-void

    .line 680
    :pswitch_1
    sget-object p2, Ll/᩺ܰۖ;->֫:Ll/᩺ܰۖ;

    invoke-virtual {p2, p0, p1}, Ll/᩺ܰۖ;->֫(Ll/ۤܰۖ;Ljava/lang/String;)V

    return-void

    .line 683
    :pswitch_2
    invoke-virtual {p1, p2}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p1

    .line 318
    array-length p2, p1

    invoke-virtual {p0, p2, p1}, Ll/ۤܰۖ;->֫(I[B)V

    return-void

    .line 674
    :pswitch_3
    iget-object p2, p0, Ll/ۤܰۖ;->ۧ:Ll/᩺ܰۖ;

    invoke-virtual {p2, p0, p1}, Ll/᩺ܰۖ;->֫(Ll/ۤܰۖ;Ljava/lang/String;)V

    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        -0x6a33dbd5 -> :sswitch_3
        0x4d50972 -> :sswitch_2
        0x5353cdae -> :sswitch_1
        0x5353cee4 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final ܳ()J
    .locals 2

    .line 568
    iget-object v0, p0, Ll/ۤܰۖ;->ۧ:Ll/᩺ܰۖ;

    .line 579
    invoke-virtual {v0, p0}, Ll/᩺ܰۖ;->֫(Ll/ۤܰۖ;)J

    move-result-wide v0

    return-wide v0
.end method

.method public final ܺ()I
    .locals 1

    .line 165
    iget v0, p0, Ll/ۤܰۖ;->ᩳ:I

    return v0
.end method

.method public final ܽ()I
    .locals 2

    .line 128
    iget v0, p0, Ll/ۤܰۖ;->ᩳ:I

    iget v1, p0, Ll/ۤܰۖ;->ܽ:I

    sub-int/2addr v0, v1

    return v0
.end method

.method public final ܽ(J)V
    .locals 4

    .line 521
    iget-object v0, p0, Ll/ۤܰۖ;->ۧ:Ll/᩺ܰۖ;

    .line 532
    check-cast v0, Ll/ۨܰۖ;

    const-wide/16 v1, 0x0

    cmp-long v3, p1, v1

    if-ltz v3, :cond_0

    .line 238
    invoke-virtual {v0, p0, p1, p2}, Ll/ۨܰۖ;->֫(Ll/ۤܰۖ;J)V

    return-void

    .line 532
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 236
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Invalid uint64 value: "

    .line 0
    invoke-static {p1, p2, v1}, Ll/ܺܶۡ;->֫(JLjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 236
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ܽ(I)[B
    .locals 1

    .line 280
    new-array v0, p1, [B

    .line 293
    invoke-virtual {p0, p1, v0}, Ll/ۤܰۖ;->ۧ(I[B)V

    return-object v0
.end method

.method public final ܿ()B
    .locals 3

    const/4 v0, 0x1

    .line 186
    invoke-virtual {p0}, Ll/ۤܰۖ;->ܽ()I

    move-result v1

    if-lt v1, v0, :cond_0

    .line 257
    iget-object v0, p0, Ll/ۤܰۖ;->֫:[B

    iget v1, p0, Ll/ۤܰۖ;->ܽ:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Ll/ۤܰۖ;->ܽ:I

    aget-byte v0, v0, v1

    return v0

    .line 187
    :cond_0
    new-instance v0, Ll/۬ܰۖ;

    const-string v1, "Underflow"

    .line 36
    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 187
    throw v0
.end method

.method public final ܿ(I)V
    .locals 1

    .line 186
    invoke-virtual {p0}, Ll/ۤܰۖ;->ܽ()I

    move-result v0

    if-lt v0, p1, :cond_0

    .line 738
    iget v0, p0, Ll/ۤܰۖ;->ܽ:I

    add-int/2addr v0, p1

    iput v0, p0, Ll/ۤܰۖ;->ܽ:I

    return-void

    .line 187
    :cond_0
    new-instance p1, Ll/۬ܰۖ;

    const-string v0, "Underflow"

    .line 36
    invoke-direct {p1, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 187
    throw p1
.end method

.method public final ᩳ(I)V
    .locals 0

    .line 156
    iput p1, p0, Ll/ۤܰۖ;->ܽ:I

    return-void
.end method

.method public final ᩳ()[B
    .locals 5

    .line 219
    invoke-virtual {p0}, Ll/ۤܰۖ;->ܽ()I

    move-result v0

    const/4 v1, 0x0

    if-lez v0, :cond_0

    .line 221
    new-array v2, v0, [B

    .line 222
    iget-object v3, p0, Ll/ۤܰۖ;->֫:[B

    iget v4, p0, Ll/ۤܰۖ;->ܽ:I

    invoke-static {v3, v4, v2, v1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v2

    :cond_0
    new-array v0, v1, [B

    return-object v0
.end method

.method public final ᩷()I
    .locals 2

    .line 457
    iget-object v0, p0, Ll/ۤܰۖ;->ۧ:Ll/᩺ܰۖ;

    .line 468
    invoke-virtual {v0, p0}, Ll/᩺ܰۖ;->ۧ(Ll/ۤܰۖ;)J

    move-result-wide v0

    long-to-int v1, v0

    return v1
.end method

.method public final ᩻()I
    .locals 3

    .line 361
    iget-object v0, p0, Ll/ۤܰۖ;->ۧ:Ll/᩺ܰۖ;

    .line 372
    check-cast v0, Ll/ۨܰۖ;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x2

    new-array v1, v0, [B

    .line 293
    invoke-virtual {p0, v0, v1}, Ll/ۤܰۖ;->ۧ(I[B)V

    const/4 v0, 0x0

    .line 187
    aget-byte v0, v1, v0

    and-int/lit16 v0, v0, 0xff

    const/4 v2, 0x1

    aget-byte v1, v1, v2

    shl-int/lit8 v1, v1, 0x8

    const v2, 0xff00

    and-int/2addr v1, v2

    or-int/2addr v0, v1

    return v0
.end method
