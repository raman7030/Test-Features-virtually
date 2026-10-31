.class public final Ll/۟᩹ۚ;
.super Ll/ܰ᩹ۚ;
.source "W4LM"


# instance fields
.field public final ۜ:Ll/ۛ᩶ۚ;

.field public final ܳ:I

.field public final ܽ:Ll/ᩳ᩶ۚ;

.field public ܿ:I

.field public ᩳ:Ll/۟᩹ۚ;

.field public final ᩷:Z

.field public final ᩻:Ll/۟᩹ۚ;


# direct methods
.method public constructor <init>(Ll/ۛ᩶ۚ;ZLl/ᩳ᩶ۚ;Ll/۟᩹ۚ;)V
    .locals 2

    const/high16 v0, 0x90000

    const/4 v1, 0x0

    .line 59
    invoke-direct {p0, v0, v1}, Ll/ܰ᩹ۚ;-><init>(ILl/ܰ᩹ۚ;)V

    .line 116
    iput-object p1, p0, Ll/۟᩹ۚ;->ۜ:Ll/ۛ᩶ۚ;

    .line 117
    iput-boolean p2, p0, Ll/۟᩹ۚ;->᩷:Z

    .line 118
    iput-object p3, p0, Ll/۟᩹ۚ;->ܽ:Ll/ᩳ᩶ۚ;

    .line 120
    iget p1, p3, Ll/ᩳ᩶ۚ;->ۧ:I

    if-nez p1, :cond_0

    const/4 p1, -0x1

    goto :goto_0

    :cond_0
    add-int/lit8 p1, p1, -0x2

    :goto_0
    iput p1, p0, Ll/۟᩹ۚ;->ܳ:I

    .line 121
    iput-object p4, p0, Ll/۟᩹ۚ;->᩻:Ll/۟᩹ۚ;

    if-eqz p4, :cond_1

    .line 123
    iput-object p0, p4, Ll/۟᩹ۚ;->ᩳ:Ll/۟᩹ۚ;

    :cond_1
    return-void
.end method

.method public static ֫(Ljava/lang/String;[Ll/۟᩹ۚ;I)I
    .locals 3

    mul-int/lit8 v0, p2, 0x2

    add-int/lit8 v0, v0, 0x7

    const/4 v1, 0x0

    :goto_0
    if-ge v1, p2, :cond_1

    .line 498
    aget-object v2, p1, v1

    if-nez v2, :cond_0

    const/4 v2, 0x0

    goto :goto_1

    .line 500
    :cond_0
    invoke-virtual {v2, p0}, Ll/۟᩹ۚ;->ۧ(Ljava/lang/String;)I

    move-result v2

    add-int/lit8 v2, v2, -0x8

    :goto_1
    add-int/2addr v0, v2

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return v0
.end method

.method public static ֫(Ll/۟᩹ۚ;Ll/۟᩹ۚ;Ll/۟᩹ۚ;Ll/۟᩹ۚ;)I
    .locals 1

    if-eqz p0, :cond_0

    const-string v0, "RuntimeVisibleAnnotations"

    .line 375
    invoke-virtual {p0, v0}, Ll/۟᩹ۚ;->ۧ(Ljava/lang/String;)I

    move-result p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    if-eqz p1, :cond_1

    const-string v0, "RuntimeInvisibleAnnotations"

    .line 380
    invoke-virtual {p1, v0}, Ll/۟᩹ۚ;->ۧ(Ljava/lang/String;)I

    move-result p1

    add-int/2addr p0, p1

    :cond_1
    if-eqz p2, :cond_2

    const-string p1, "RuntimeVisibleTypeAnnotations"

    .line 385
    invoke-virtual {p2, p1}, Ll/۟᩹ۚ;->ۧ(Ljava/lang/String;)I

    move-result p1

    add-int/2addr p0, p1

    :cond_2
    if-eqz p3, :cond_3

    const-string p1, "RuntimeInvisibleTypeAnnotations"

    .line 390
    invoke-virtual {p3, p1}, Ll/۟᩹ۚ;->ۧ(Ljava/lang/String;)I

    move-result p1

    add-int/2addr p0, p1

    :cond_3
    return p0
.end method

.method public static ֫(Ll/ۛ᩶ۚ;ILl/᩺᩶ۚ;Ljava/lang/String;Ll/۟᩹ۚ;)Ll/۟᩹ۚ;
    .locals 4

    .line 175
    new-instance v0, Ll/ᩳ᩶ۚ;

    invoke-direct {v0}, Ll/ᩳ᩶ۚ;-><init>()V

    ushr-int/lit8 v1, p1, 0x18

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    if-eq v1, v2, :cond_0

    packed-switch v1, :pswitch_data_0

    packed-switch v1, :pswitch_data_1

    .line 433
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p0

    .line 412
    :pswitch_0
    invoke-virtual {v0, v1}, Ll/ᩳ᩶ۚ;->֫(I)V

    goto :goto_0

    .line 419
    :pswitch_1
    invoke-virtual {v0, p1}, Ll/ᩳ᩶ۚ;->ۧ(I)V

    goto :goto_0

    :pswitch_2
    const v3, 0xffff00

    and-int/2addr p1, v3

    shr-int/lit8 p1, p1, 0x8

    .line 430
    invoke-virtual {v0, v1, p1}, Ll/ᩳ᩶ۚ;->ܽ(II)V

    goto :goto_0

    :cond_0
    :pswitch_3
    ushr-int/lit8 p1, p1, 0x10

    .line 407
    invoke-virtual {v0, p1}, Ll/ᩳ᩶ۚ;->ܽ(I)V

    .line 178
    :goto_0
    invoke-static {p2, v0}, Ll/᩺᩶ۚ;->֫(Ll/᩺᩶ۚ;Ll/ᩳ᩶ۚ;)V

    .line 180
    invoke-virtual {p0, p3}, Ll/ۛ᩶ۚ;->ᩳ(Ljava/lang/String;)I

    move-result p1

    invoke-virtual {v0, p1}, Ll/ᩳ᩶ۚ;->ܽ(I)V

    const/4 p1, 0x0

    invoke-virtual {v0, p1}, Ll/ᩳ᩶ۚ;->ܽ(I)V

    .line 181
    new-instance p1, Ll/۟᩹ۚ;

    invoke-direct {p1, p0, v2, v0, p4}, Ll/۟᩹ۚ;-><init>(Ll/ۛ᩶ۚ;ZLl/ᩳ᩶ۚ;Ll/۟᩹ۚ;)V

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x10
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_3
        :pswitch_2
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x42
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
    .end packed-switch
.end method

.method public static ֫(Ll/ۛ᩶ۚ;Ljava/lang/String;Ll/۟᩹ۚ;)Ll/۟᩹ۚ;
    .locals 2

    .line 143
    new-instance v0, Ll/ᩳ᩶ۚ;

    invoke-direct {v0}, Ll/ᩳ᩶ۚ;-><init>()V

    .line 145
    invoke-virtual {p0, p1}, Ll/ۛ᩶ۚ;->ᩳ(Ljava/lang/String;)I

    move-result p1

    invoke-virtual {v0, p1}, Ll/ᩳ᩶ۚ;->ܽ(I)V

    const/4 p1, 0x0

    invoke-virtual {v0, p1}, Ll/ᩳ᩶ۚ;->ܽ(I)V

    .line 146
    new-instance p1, Ll/۟᩹ۚ;

    const/4 v1, 0x1

    invoke-direct {p1, p0, v1, v0, p2}, Ll/۟᩹ۚ;-><init>(Ll/ۛ᩶ۚ;ZLl/ᩳ᩶ۚ;Ll/۟᩹ۚ;)V

    return-object p1
.end method

.method public static ֫(I[Ll/۟᩹ۚ;ILl/ᩳ᩶ۚ;)V
    .locals 6

    mul-int/lit8 v0, p2, 0x2

    add-int/lit8 v0, v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    const/4 v3, 0x0

    if-ge v2, p2, :cond_1

    .line 526
    aget-object v4, p1, v2

    if-nez v4, :cond_0

    const/4 v3, 0x0

    goto :goto_1

    .line 528
    :cond_0
    invoke-virtual {v4, v3}, Ll/۟᩹ۚ;->ۧ(Ljava/lang/String;)I

    move-result v3

    add-int/lit8 v3, v3, -0x8

    :goto_1
    add-int/2addr v0, v3

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 530
    :cond_1
    invoke-virtual {p3, p0}, Ll/ᩳ᩶ۚ;->ܽ(I)V

    .line 531
    invoke-virtual {p3, v0}, Ll/ᩳ᩶ۚ;->ۧ(I)V

    .line 532
    invoke-virtual {p3, p2}, Ll/ᩳ᩶ۚ;->֫(I)V

    const/4 p0, 0x0

    :goto_2
    if-ge p0, p2, :cond_4

    .line 534
    aget-object v0, p1, p0

    const/4 v2, 0x0

    move-object v4, v3

    :goto_3
    if-eqz v0, :cond_2

    .line 539
    invoke-virtual {v0}, Ll/۟᩹ۚ;->֫()V

    add-int/lit8 v2, v2, 0x1

    .line 542
    iget-object v4, v0, Ll/۟᩹ۚ;->᩻:Ll/۟᩹ۚ;

    move-object v5, v4

    move-object v4, v0

    move-object v0, v5

    goto :goto_3

    .line 544
    :cond_2
    invoke-virtual {p3, v2}, Ll/ᩳ᩶ۚ;->ܽ(I)V

    :goto_4
    if-eqz v4, :cond_3

    .line 547
    iget-object v0, v4, Ll/۟᩹ۚ;->ܽ:Ll/ᩳ᩶ۚ;

    iget-object v2, v0, Ll/ᩳ᩶ۚ;->֫:[B

    iget v0, v0, Ll/ᩳ᩶ۚ;->ۧ:I

    invoke-virtual {p3, v1, v0, v2}, Ll/ᩳ᩶ۚ;->֫(II[B)V

    .line 549
    iget-object v4, v4, Ll/۟᩹ۚ;->ᩳ:Ll/۟᩹ۚ;

    goto :goto_4

    :cond_3
    add-int/lit8 p0, p0, 0x1

    goto :goto_2

    :cond_4
    return-void
.end method

.method public static ֫(Ll/ۛ᩶ۚ;Ll/۟᩹ۚ;Ll/۟᩹ۚ;Ll/۟᩹ۚ;Ll/۟᩹ۚ;Ll/ᩳ᩶ۚ;)V
    .locals 1

    if-eqz p1, :cond_0

    const-string v0, "RuntimeVisibleAnnotations"

    .line 457
    invoke-virtual {p0, v0}, Ll/ۛ᩶ۚ;->ᩳ(Ljava/lang/String;)I

    move-result v0

    .line 456
    invoke-virtual {p1, v0, p5}, Ll/۟᩹ۚ;->֫(ILl/ᩳ᩶ۚ;)V

    :cond_0
    if-eqz p2, :cond_1

    const-string p1, "RuntimeInvisibleAnnotations"

    .line 461
    invoke-virtual {p0, p1}, Ll/ۛ᩶ۚ;->ᩳ(Ljava/lang/String;)I

    move-result p1

    .line 460
    invoke-virtual {p2, p1, p5}, Ll/۟᩹ۚ;->֫(ILl/ᩳ᩶ۚ;)V

    :cond_1
    if-eqz p3, :cond_2

    const-string p1, "RuntimeVisibleTypeAnnotations"

    .line 465
    invoke-virtual {p0, p1}, Ll/ۛ᩶ۚ;->ᩳ(Ljava/lang/String;)I

    move-result p1

    .line 464
    invoke-virtual {p3, p1, p5}, Ll/۟᩹ۚ;->֫(ILl/ᩳ᩶ۚ;)V

    :cond_2
    if-eqz p4, :cond_3

    const-string p1, "RuntimeInvisibleTypeAnnotations"

    .line 469
    invoke-virtual {p0, p1}, Ll/ۛ᩶ۚ;->ᩳ(Ljava/lang/String;)I

    move-result p0

    .line 468
    invoke-virtual {p4, p0, p5}, Ll/۟᩹ۚ;->֫(ILl/ᩳ᩶ۚ;)V

    :cond_3
    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/String;)Ll/ܰ᩹ۚ;
    .locals 4

    .line 294
    iget v0, p0, Ll/۟᩹ۚ;->ܿ:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Ll/۟᩹ۚ;->ܿ:I

    .line 295
    iget-boolean v0, p0, Ll/۟᩹ۚ;->᩷:Z

    iget-object v1, p0, Ll/۟᩹ۚ;->ۜ:Ll/ۛ᩶ۚ;

    iget-object v2, p0, Ll/۟᩹ۚ;->ܽ:Ll/ᩳ᩶ۚ;

    if-eqz v0, :cond_0

    .line 296
    invoke-virtual {v1, p1}, Ll/ۛ᩶ۚ;->ᩳ(Ljava/lang/String;)I

    move-result p1

    invoke-virtual {v2, p1}, Ll/ᩳ᩶ۚ;->ܽ(I)V

    :cond_0
    const/16 p1, 0x5b

    const/4 v0, 0x0

    .line 305
    invoke-virtual {v2, p1, v0}, Ll/ᩳ᩶ۚ;->ܽ(II)V

    .line 306
    new-instance p1, Ll/۟᩹ۚ;

    const/4 v3, 0x0

    invoke-direct {p1, v1, v0, v2, v3}, Ll/۟᩹ۚ;-><init>(Ll/ۛ᩶ۚ;ZLl/ᩳ᩶ۚ;Ll/۟᩹ۚ;)V

    return-object p1
.end method

.method public final ֫(Ljava/lang/String;Ljava/lang/String;)Ll/ܰ᩹ۚ;
    .locals 4

    .line 281
    iget v0, p0, Ll/۟᩹ۚ;->ܿ:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    iput v0, p0, Ll/۟᩹ۚ;->ܿ:I

    .line 282
    iget-boolean v0, p0, Ll/۟᩹ۚ;->᩷:Z

    iget-object v2, p0, Ll/۟᩹ۚ;->ۜ:Ll/ۛ᩶ۚ;

    iget-object v3, p0, Ll/۟᩹ۚ;->ܽ:Ll/ᩳ᩶ۚ;

    if-eqz v0, :cond_0

    .line 283
    invoke-virtual {v2, p1}, Ll/ۛ᩶ۚ;->ᩳ(Ljava/lang/String;)I

    move-result p1

    invoke-virtual {v3, p1}, Ll/ᩳ᩶ۚ;->ܽ(I)V

    :cond_0
    const/16 p1, 0x40

    .line 286
    invoke-virtual {v2, p2}, Ll/ۛ᩶ۚ;->ᩳ(Ljava/lang/String;)I

    move-result p2

    invoke-virtual {v3, p1, p2}, Ll/ᩳ᩶ۚ;->ܽ(II)V

    const/4 p1, 0x0

    invoke-virtual {v3, p1}, Ll/ᩳ᩶ۚ;->ܽ(I)V

    .line 287
    new-instance p1, Ll/۟᩹ۚ;

    const/4 p2, 0x0

    invoke-direct {p1, v2, v1, v3, p2}, Ll/۟᩹ۚ;-><init>(Ll/ۛ᩶ۚ;ZLl/ᩳ᩶ۚ;Ll/۟᩹ۚ;)V

    return-object p1
.end method

.method public final ֫()V
    .locals 4

    const/4 v0, -0x1

    .line 311
    iget v1, p0, Ll/۟᩹ۚ;->ܳ:I

    if-eq v1, v0, :cond_0

    .line 312
    iget-object v0, p0, Ll/۟᩹ۚ;->ܽ:Ll/ᩳ᩶ۚ;

    iget-object v0, v0, Ll/ᩳ᩶ۚ;->֫:[B

    .line 313
    iget v2, p0, Ll/۟᩹ۚ;->ܿ:I

    ushr-int/lit8 v3, v2, 0x8

    int-to-byte v3, v3

    aput-byte v3, v0, v1

    add-int/lit8 v1, v1, 0x1

    int-to-byte v2, v2

    .line 314
    aput-byte v2, v0, v1

    :cond_0
    return-void
.end method

.method public final ֫(ILl/ᩳ᩶ۚ;)V
    .locals 6

    const/4 v0, 0x2

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v3, v2

    move-object v2, p0

    :goto_0
    if-eqz v2, :cond_0

    .line 412
    invoke-virtual {v2}, Ll/۟᩹ۚ;->֫()V

    .line 413
    iget-object v3, v2, Ll/۟᩹ۚ;->ܽ:Ll/ᩳ᩶ۚ;

    iget v3, v3, Ll/ᩳ᩶ۚ;->ۧ:I

    add-int/2addr v0, v3

    add-int/lit8 v4, v4, 0x1

    .line 416
    iget-object v3, v2, Ll/۟᩹ۚ;->᩻:Ll/۟᩹ۚ;

    move-object v5, v3

    move-object v3, v2

    move-object v2, v5

    goto :goto_0

    .line 418
    :cond_0
    invoke-virtual {p2, p1}, Ll/ᩳ᩶ۚ;->ܽ(I)V

    .line 419
    invoke-virtual {p2, v0}, Ll/ᩳ᩶ۚ;->ۧ(I)V

    .line 420
    invoke-virtual {p2, v4}, Ll/ᩳ᩶ۚ;->ܽ(I)V

    :goto_1
    if-eqz v3, :cond_1

    .line 423
    iget-object p1, v3, Ll/۟᩹ۚ;->ܽ:Ll/ᩳ᩶ۚ;

    iget-object v0, p1, Ll/ᩳ᩶ۚ;->֫:[B

    iget p1, p1, Ll/ᩳ᩶ۚ;->ۧ:I

    invoke-virtual {p2, v1, p1, v0}, Ll/ᩳ᩶ۚ;->֫(II[B)V

    .line 424
    iget-object v3, v3, Ll/۟᩹ۚ;->ᩳ:Ll/۟᩹ۚ;

    goto :goto_1

    :cond_1
    return-void
.end method

.method public final ֫(Ljava/lang/Object;Ljava/lang/String;)V
    .locals 8

    .line 193
    iget v0, p0, Ll/۟᩹ۚ;->ܿ:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Ll/۟᩹ۚ;->ܿ:I

    .line 194
    iget-boolean v0, p0, Ll/۟᩹ۚ;->᩷:Z

    iget-object v1, p0, Ll/۟᩹ۚ;->ۜ:Ll/ۛ᩶ۚ;

    iget-object v2, p0, Ll/۟᩹ۚ;->ܽ:Ll/ᩳ᩶ۚ;

    if-eqz v0, :cond_0

    .line 195
    invoke-virtual {v1, p2}, Ll/ۛ᩶ۚ;->ᩳ(Ljava/lang/String;)I

    move-result p2

    invoke-virtual {v2, p2}, Ll/ᩳ᩶ۚ;->ܽ(I)V

    .line 197
    :cond_0
    instance-of p2, p1, Ljava/lang/String;

    if-eqz p2, :cond_1

    .line 198
    check-cast p1, Ljava/lang/String;

    invoke-virtual {v1, p1}, Ll/ۛ᩶ۚ;->ᩳ(Ljava/lang/String;)I

    move-result p1

    const/16 p2, 0x73

    invoke-virtual {v2, p2, p1}, Ll/ᩳ᩶ۚ;->ܽ(II)V

    return-void

    .line 199
    :cond_1
    instance-of p2, p1, Ljava/lang/Byte;

    const/16 v0, 0x42

    if-eqz p2, :cond_2

    .line 200
    check-cast p1, Ljava/lang/Byte;

    invoke-virtual {p1}, Ljava/lang/Byte;->byteValue()B

    move-result p1

    invoke-virtual {v1, p1}, Ll/ۛ᩶ۚ;->֫(I)Ll/۫᩶ۚ;

    move-result-object p1

    iget p1, p1, Ll/۬᩶ۚ;->ۧ:I

    invoke-virtual {v2, v0, p1}, Ll/ᩳ᩶ۚ;->ܽ(II)V

    return-void

    .line 201
    :cond_2
    instance-of p2, p1, Ljava/lang/Boolean;

    const/16 v3, 0x5a

    if-eqz p2, :cond_3

    .line 202
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    .line 203
    invoke-virtual {v1, p1}, Ll/ۛ᩶ۚ;->֫(I)Ll/۫᩶ۚ;

    move-result-object p1

    iget p1, p1, Ll/۬᩶ۚ;->ۧ:I

    invoke-virtual {v2, v3, p1}, Ll/ᩳ᩶ۚ;->ܽ(II)V

    return-void

    .line 204
    :cond_3
    instance-of p2, p1, Ljava/lang/Character;

    const/16 v4, 0x43

    if-eqz p2, :cond_4

    .line 205
    check-cast p1, Ljava/lang/Character;

    invoke-virtual {p1}, Ljava/lang/Character;->charValue()C

    move-result p1

    invoke-virtual {v1, p1}, Ll/ۛ᩶ۚ;->֫(I)Ll/۫᩶ۚ;

    move-result-object p1

    iget p1, p1, Ll/۬᩶ۚ;->ۧ:I

    invoke-virtual {v2, v4, p1}, Ll/ᩳ᩶ۚ;->ܽ(II)V

    return-void

    .line 206
    :cond_4
    instance-of p2, p1, Ljava/lang/Short;

    const/16 v5, 0x53

    if-eqz p2, :cond_5

    .line 207
    check-cast p1, Ljava/lang/Short;

    invoke-virtual {p1}, Ljava/lang/Short;->shortValue()S

    move-result p1

    invoke-virtual {v1, p1}, Ll/ۛ᩶ۚ;->֫(I)Ll/۫᩶ۚ;

    move-result-object p1

    iget p1, p1, Ll/۬᩶ۚ;->ۧ:I

    invoke-virtual {v2, v5, p1}, Ll/ᩳ᩶ۚ;->ܽ(II)V

    return-void

    .line 208
    :cond_5
    instance-of p2, p1, Ll/ۨ᩶ۚ;

    if-eqz p2, :cond_6

    .line 209
    check-cast p1, Ll/ۨ᩶ۚ;

    invoke-virtual {p1}, Ll/ۨ᩶ۚ;->֫()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ll/ۛ᩶ۚ;->ᩳ(Ljava/lang/String;)I

    move-result p1

    const/16 p2, 0x63

    invoke-virtual {v2, p2, p1}, Ll/ᩳ᩶ۚ;->ܽ(II)V

    return-void

    .line 210
    :cond_6
    instance-of p2, p1, [B

    const/4 v6, 0x0

    const/16 v7, 0x5b

    if-eqz p2, :cond_7

    .line 211
    check-cast p1, [B

    .line 212
    array-length p2, p1

    invoke-virtual {v2, v7, p2}, Ll/ᩳ᩶ۚ;->ܽ(II)V

    .line 213
    array-length p2, p1

    :goto_0
    if-ge v6, p2, :cond_e

    aget-byte v3, p1, v6

    .line 214
    invoke-virtual {v1, v3}, Ll/ۛ᩶ۚ;->֫(I)Ll/۫᩶ۚ;

    move-result-object v3

    iget v3, v3, Ll/۬᩶ۚ;->ۧ:I

    invoke-virtual {v2, v0, v3}, Ll/ᩳ᩶ۚ;->ܽ(II)V

    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 216
    :cond_7
    instance-of p2, p1, [Z

    if-eqz p2, :cond_8

    .line 217
    check-cast p1, [Z

    .line 218
    array-length p2, p1

    invoke-virtual {v2, v7, p2}, Ll/ᩳ᩶ۚ;->ܽ(II)V

    .line 219
    array-length p2, p1

    :goto_1
    if-ge v6, p2, :cond_e

    aget-boolean v0, p1, v6

    .line 220
    invoke-virtual {v1, v0}, Ll/ۛ᩶ۚ;->֫(I)Ll/۫᩶ۚ;

    move-result-object v0

    iget v0, v0, Ll/۬᩶ۚ;->ۧ:I

    invoke-virtual {v2, v3, v0}, Ll/ᩳ᩶ۚ;->ܽ(II)V

    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    .line 222
    :cond_8
    instance-of p2, p1, [S

    if-eqz p2, :cond_9

    .line 223
    check-cast p1, [S

    .line 224
    array-length p2, p1

    invoke-virtual {v2, v7, p2}, Ll/ᩳ᩶ۚ;->ܽ(II)V

    .line 225
    array-length p2, p1

    :goto_2
    if-ge v6, p2, :cond_e

    aget-short v0, p1, v6

    .line 226
    invoke-virtual {v1, v0}, Ll/ۛ᩶ۚ;->֫(I)Ll/۫᩶ۚ;

    move-result-object v0

    iget v0, v0, Ll/۬᩶ۚ;->ۧ:I

    invoke-virtual {v2, v5, v0}, Ll/ᩳ᩶ۚ;->ܽ(II)V

    add-int/lit8 v6, v6, 0x1

    goto :goto_2

    .line 228
    :cond_9
    instance-of p2, p1, [C

    if-eqz p2, :cond_a

    .line 229
    check-cast p1, [C

    .line 230
    array-length p2, p1

    invoke-virtual {v2, v7, p2}, Ll/ᩳ᩶ۚ;->ܽ(II)V

    .line 231
    array-length p2, p1

    :goto_3
    if-ge v6, p2, :cond_e

    aget-char v0, p1, v6

    .line 232
    invoke-virtual {v1, v0}, Ll/ۛ᩶ۚ;->֫(I)Ll/۫᩶ۚ;

    move-result-object v0

    iget v0, v0, Ll/۬᩶ۚ;->ۧ:I

    invoke-virtual {v2, v4, v0}, Ll/ᩳ᩶ۚ;->ܽ(II)V

    add-int/lit8 v6, v6, 0x1

    goto :goto_3

    .line 234
    :cond_a
    instance-of p2, p1, [I

    if-eqz p2, :cond_b

    .line 235
    check-cast p1, [I

    .line 236
    array-length p2, p1

    invoke-virtual {v2, v7, p2}, Ll/ᩳ᩶ۚ;->ܽ(II)V

    .line 237
    array-length p2, p1

    :goto_4
    if-ge v6, p2, :cond_e

    aget v0, p1, v6

    .line 238
    invoke-virtual {v1, v0}, Ll/ۛ᩶ۚ;->֫(I)Ll/۫᩶ۚ;

    move-result-object v0

    iget v0, v0, Ll/۬᩶ۚ;->ۧ:I

    const/16 v3, 0x49

    invoke-virtual {v2, v3, v0}, Ll/ᩳ᩶ۚ;->ܽ(II)V

    add-int/lit8 v6, v6, 0x1

    goto :goto_4

    .line 240
    :cond_b
    instance-of p2, p1, [J

    if-eqz p2, :cond_c

    .line 241
    check-cast p1, [J

    .line 242
    array-length p2, p1

    invoke-virtual {v2, v7, p2}, Ll/ᩳ᩶ۚ;->ܽ(II)V

    .line 243
    array-length p2, p1

    :goto_5
    if-ge v6, p2, :cond_e

    aget-wide v3, p1, v6

    .line 244
    invoke-virtual {v1, v3, v4}, Ll/ۛ᩶ۚ;->֫(J)Ll/۫᩶ۚ;

    move-result-object v0

    iget v0, v0, Ll/۬᩶ۚ;->ۧ:I

    const/16 v3, 0x4a

    invoke-virtual {v2, v3, v0}, Ll/ᩳ᩶ۚ;->ܽ(II)V

    add-int/lit8 v6, v6, 0x1

    goto :goto_5

    .line 246
    :cond_c
    instance-of p2, p1, [F

    if-eqz p2, :cond_d

    .line 247
    check-cast p1, [F

    .line 248
    array-length p2, p1

    invoke-virtual {v2, v7, p2}, Ll/ᩳ᩶ۚ;->ܽ(II)V

    .line 249
    array-length p2, p1

    :goto_6
    if-ge v6, p2, :cond_e

    aget v0, p1, v6

    .line 250
    invoke-virtual {v1, v0}, Ll/ۛ᩶ۚ;->֫(F)Ll/۫᩶ۚ;

    move-result-object v0

    iget v0, v0, Ll/۬᩶ۚ;->ۧ:I

    const/16 v3, 0x46

    invoke-virtual {v2, v3, v0}, Ll/ᩳ᩶ۚ;->ܽ(II)V

    add-int/lit8 v6, v6, 0x1

    goto :goto_6

    .line 252
    :cond_d
    instance-of p2, p1, [D

    if-eqz p2, :cond_f

    .line 253
    check-cast p1, [D

    .line 254
    array-length p2, p1

    invoke-virtual {v2, v7, p2}, Ll/ᩳ᩶ۚ;->ܽ(II)V

    .line 255
    array-length p2, p1

    :goto_7
    if-ge v6, p2, :cond_e

    aget-wide v3, p1, v6

    .line 256
    invoke-virtual {v1, v3, v4}, Ll/ۛ᩶ۚ;->֫(D)Ll/۫᩶ۚ;

    move-result-object v0

    iget v0, v0, Ll/۬᩶ۚ;->ۧ:I

    const/16 v3, 0x44

    invoke-virtual {v2, v3, v0}, Ll/ᩳ᩶ۚ;->ܽ(II)V

    add-int/lit8 v6, v6, 0x1

    goto :goto_7

    :cond_e
    return-void

    .line 259
    :cond_f
    invoke-virtual {v1, p1}, Ll/ۛ᩶ۚ;->֫(Ljava/lang/Object;)Ll/۫᩶ۚ;

    move-result-object p1

    const-string p2, ".s.IFJDCS"

    .line 260
    iget v0, p1, Ll/۬᩶ۚ;->ܳ:I

    invoke-virtual {p2, v0}, Ljava/lang/String;->charAt(I)C

    move-result p2

    iget p1, p1, Ll/۬᩶ۚ;->ۧ:I

    invoke-virtual {v2, p2, p1}, Ll/ᩳ᩶ۚ;->ܽ(II)V

    return-void
.end method

.method public final ֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 268
    iget v0, p0, Ll/۟᩹ۚ;->ܿ:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Ll/۟᩹ۚ;->ܿ:I

    .line 269
    iget-boolean v0, p0, Ll/۟᩹ۚ;->᩷:Z

    iget-object v1, p0, Ll/۟᩹ۚ;->ܽ:Ll/ᩳ᩶ۚ;

    iget-object v2, p0, Ll/۟᩹ۚ;->ۜ:Ll/ۛ᩶ۚ;

    if-eqz v0, :cond_0

    .line 270
    invoke-virtual {v2, p1}, Ll/ۛ᩶ۚ;->ᩳ(Ljava/lang/String;)I

    move-result p1

    invoke-virtual {v1, p1}, Ll/ᩳ᩶ۚ;->ܽ(I)V

    :cond_0
    const/16 p1, 0x65

    .line 273
    invoke-virtual {v2, p2}, Ll/ۛ᩶ۚ;->ᩳ(Ljava/lang/String;)I

    move-result p2

    invoke-virtual {v1, p1, p2}, Ll/ᩳ᩶ۚ;->ܽ(II)V

    .line 274
    invoke-virtual {v2, p3}, Ll/ۛ᩶ۚ;->ᩳ(Ljava/lang/String;)I

    move-result p1

    invoke-virtual {v1, p1}, Ll/ᩳ᩶ۚ;->ܽ(I)V

    return-void
.end method

.method public final ۧ(Ljava/lang/String;)I
    .locals 2

    if-eqz p1, :cond_0

    .line 334
    iget-object v0, p0, Ll/۟᩹ۚ;->ۜ:Ll/ۛ᩶ۚ;

    invoke-virtual {v0, p1}, Ll/ۛ᩶ۚ;->ᩳ(Ljava/lang/String;)I

    :cond_0
    const/16 p1, 0x8

    move-object v0, p0

    :goto_0
    if-eqz v0, :cond_1

    .line 340
    iget-object v1, v0, Ll/۟᩹ۚ;->ܽ:Ll/ᩳ᩶ۚ;

    iget v1, v1, Ll/ᩳ᩶ۚ;->ۧ:I

    add-int/2addr p1, v1

    .line 341
    iget-object v0, v0, Ll/۟᩹ۚ;->᩻:Ll/۟᩹ۚ;

    goto :goto_0

    :cond_1
    return p1
.end method
