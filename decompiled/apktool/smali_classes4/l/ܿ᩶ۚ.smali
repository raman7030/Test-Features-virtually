.class public final Ll/ܿ᩶ۚ;
.super Ljava/lang/Object;
.source "Z5U8"


# instance fields
.field public final ֫:[I

.field public final ۧ:[B

.field public final ܳ:I

.field public final ܽ:[Ll/᩷᩶ۚ;

.field public final ܿ:[I

.field public final ᩳ:[Ljava/lang/String;

.field public final ᩻:I


# direct methods
.method public constructor <init>(Ljava/io/InputStream;)V
    .locals 7

    .line 340
    invoke-virtual {p1}, Ljava/io/InputStream;->available()I

    move-result v0

    const/16 v1, 0x100

    if-ge v0, v1, :cond_0

    const/16 v0, 0x1000

    goto :goto_0

    :cond_0
    const/high16 v1, 0x100000

    .line 349
    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    .line 319
    :goto_0
    new-instance v1, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v1}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 320
    :try_start_0
    new-array v2, v0, [B

    const/4 v3, 0x0

    const/4 v4, 0x0

    .line 323
    :goto_1
    invoke-virtual {p1, v2, v3, v0}, Ljava/io/InputStream;->read([BII)I

    move-result v5

    const/4 v6, -0x1

    if-eq v5, v6, :cond_1

    .line 324
    invoke-virtual {v1, v2, v3, v5}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    .line 327
    :cond_1
    invoke-virtual {v1}, Ljava/io/OutputStream;->flush()V

    const/4 p1, 0x1

    if-ne v4, p1, :cond_2

    goto :goto_2

    .line 331
    :cond_2
    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 332
    :goto_2
    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->close()V

    .line 166
    array-length v0, v2

    .line 180
    invoke-direct {p0, v2, p1}, Ll/ܿ᩶ۚ;-><init>([BZ)V

    return-void

    :catchall_0
    move-exception p1

    .line 319
    :try_start_1
    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    throw p1
.end method

.method public constructor <init>([BZ)V
    .locals 11

    .line 193
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 194
    iput-object p1, p0, Ll/ܿ᩶ۚ;->ۧ:[B

    if-eqz p2, :cond_1

    const/4 p2, 0x6

    .line 198
    invoke-virtual {p0, p2}, Ll/ܿ᩶ۚ;->ᩳ(I)S

    move-result v0

    const/16 v1, 0x46

    if-gt v0, v1, :cond_0

    goto :goto_0

    .line 199
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 200
    invoke-virtual {p0, p2}, Ll/ܿ᩶ۚ;->ᩳ(I)S

    move-result p2

    const-string v0, "Unsupported class file major version "

    .line 0
    invoke-static {p2, v0}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 200
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    const/16 p2, 0x8

    .line 204
    invoke-virtual {p0, p2}, Ll/ܿ᩶ۚ;->ܿ(I)I

    move-result v0

    .line 205
    new-array v1, v0, [I

    iput-object v1, p0, Ll/ܿ᩶ۚ;->ܿ:[I

    .line 206
    new-array v1, v0, [Ljava/lang/String;

    iput-object v1, p0, Ll/ܿ᩶ۚ;->ᩳ:[Ljava/lang/String;

    const/4 v1, 0x0

    const/16 v2, 0xa

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    :goto_1
    const/4 v7, 0x4

    if-ge v3, v0, :cond_3

    .line 218
    iget-object v8, p0, Ll/ܿ᩶ۚ;->ܿ:[I

    add-int/lit8 v9, v3, 0x1

    add-int/lit8 v10, v2, 0x1

    aput v10, v8, v3

    .line 220
    aget-byte v8, p1, v2

    packed-switch v8, :pswitch_data_0

    .line 263
    :pswitch_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1

    :pswitch_1
    const/4 v5, 0x1

    :pswitch_2
    const/4 v6, 0x1

    goto :goto_2

    :pswitch_3
    const/4 v3, 0x3

    goto :goto_3

    :pswitch_4
    add-int/lit8 v3, v3, 0x2

    const/16 v7, 0x9

    move v9, v3

    const/16 v3, 0x9

    goto :goto_3

    :goto_2
    :pswitch_5
    const/4 v3, 0x5

    goto :goto_3

    .line 244
    :pswitch_6
    invoke-virtual {p0, v10}, Ll/ܿ᩶ۚ;->ܿ(I)I

    move-result v3

    add-int/lit8 v7, v3, 0x3

    if-le v7, v4, :cond_2

    move v4, v7

    :cond_2
    :pswitch_7
    move v3, v7

    :goto_3
    add-int/2addr v2, v3

    move v3, v9

    goto :goto_1

    .line 267
    :cond_3
    iput v4, p0, Ll/ܿ᩶ۚ;->᩻:I

    .line 269
    iput v2, p0, Ll/ܿ᩶ۚ;->ܳ:I

    const/4 p1, 0x0

    if-eqz v5, :cond_4

    .line 272
    new-array v0, v0, [Ll/᩷᩶ۚ;

    goto :goto_4

    :cond_4
    move-object v0, p1

    :goto_4
    iput-object v0, p0, Ll/ܿ᩶ۚ;->ܽ:[Ll/᩷᩶ۚ;

    if-eqz v6, :cond_8

    .line 3488
    new-array p1, v4, [C

    .line 3489
    invoke-virtual {p0}, Ll/ܿ᩶ۚ;->֫()I

    move-result v0

    add-int/lit8 v2, v0, -0x2

    .line 3490
    invoke-virtual {p0, v2}, Ll/ܿ᩶ۚ;->ܿ(I)I

    move-result v2

    :goto_5
    if-lez v2, :cond_7

    .line 3492
    invoke-virtual {p0, p1, v0}, Ll/ܿ᩶ۚ;->ۧ([CI)Ljava/lang/String;

    move-result-object v3

    add-int/lit8 v4, v0, 0x2

    .line 3493
    invoke-virtual {p0, v4}, Ll/ܿ᩶ۚ;->ۧ(I)I

    move-result v4

    add-int/lit8 v5, v0, 0x6

    const-string v6, "BootstrapMethods"

    .line 3495
    invoke-virtual {v6, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_6

    .line 3497
    invoke-virtual {p0, v5}, Ll/ܿ᩶ۚ;->ܿ(I)I

    move-result p1

    new-array v2, p1, [I

    add-int/2addr v0, p2

    :goto_6
    if-ge v1, p1, :cond_5

    .line 3501
    aput v0, v2, v1

    add-int/lit8 p2, v0, 0x2

    .line 3505
    invoke-virtual {p0, p2}, Ll/ܿ᩶ۚ;->ܿ(I)I

    move-result p2

    mul-int/lit8 p2, p2, 0x2

    add-int/2addr p2, v7

    add-int/2addr v0, p2

    add-int/lit8 v1, v1, 0x1

    goto :goto_6

    :cond_5
    move-object p1, v2

    goto :goto_7

    :cond_6
    add-int v0, v5, v4

    add-int/lit8 v2, v2, -0x1

    goto :goto_5

    .line 3511
    :cond_7
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1

    .line 276
    :cond_8
    :goto_7
    iput-object p1, p0, Ll/ܿ᩶ۚ;->֫:[I

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_6
        :pswitch_0
        :pswitch_5
        :pswitch_5
        :pswitch_4
        :pswitch_4
        :pswitch_3
        :pswitch_3
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_0
        :pswitch_0
        :pswitch_7
        :pswitch_3
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_3
    .end packed-switch
.end method

.method private ֫(I[I)I
    .locals 2

    if-eqz p2, :cond_1

    .line 2850
    array-length v0, p2

    if-ge p1, v0, :cond_1

    aget v0, p2, p1

    .line 2852
    invoke-virtual {p0, v0}, Ll/ܿ᩶ۚ;->֫(I)I

    move-result v0

    const/16 v1, 0x43

    if-ge v0, v1, :cond_0

    goto :goto_0

    .line 2855
    :cond_0
    aget p1, p2, p1

    add-int/lit8 p1, p1, 0x1

    invoke-virtual {p0, p1}, Ll/ܿ᩶ۚ;->ܿ(I)I

    move-result p1

    return p1

    :cond_1
    :goto_0
    const/4 p1, -0x1

    return p1
.end method

.method private ֫(I[Ljava/lang/Object;I[C[Ll/֨᩶ۚ;)I
    .locals 3

    add-int/lit8 v0, p1, 0x1

    .line 3392
    iget-object v1, p0, Ll/ܿ᩶ۚ;->ۧ:[B

    aget-byte v1, v1, p1

    and-int/lit16 v1, v1, 0xff

    const/4 v2, 0x3

    packed-switch v1, :pswitch_data_0

    .line 3424
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1

    .line 3420
    :pswitch_0
    invoke-virtual {p0, v0}, Ll/ܿ᩶ۚ;->ܿ(I)I

    move-result p4

    invoke-static {p4, p5}, Ll/ܿ᩶ۚ;->֫(I[Ll/֨᩶ۚ;)Ll/֨᩶ۚ;

    move-result-object p4

    aput-object p4, p2, p3

    goto :goto_0

    .line 3771
    :pswitch_1
    invoke-direct {p0, p4, v0}, Ll/ܿ᩶ۚ;->ᩳ([CI)Ljava/lang/String;

    move-result-object p4

    .line 3416
    aput-object p4, p2, p3

    :goto_0
    add-int/2addr p1, v2

    return p1

    :pswitch_2
    const/4 p1, 0x6

    .line 3413
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, p2, p3

    return v0

    :pswitch_3
    const/4 p1, 0x5

    .line 3410
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, p2, p3

    return v0

    :pswitch_4
    const/4 p1, 0x4

    .line 3407
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, p2, p3

    return v0

    .line 3404
    :pswitch_5
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, p2, p3

    return v0

    :pswitch_6
    const/4 p1, 0x2

    .line 3401
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, p2, p3

    return v0

    :pswitch_7
    const/4 p1, 0x1

    .line 3398
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, p2, p3

    return v0

    :pswitch_8
    const/4 p1, 0x0

    .line 3395
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, p2, p3

    return v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
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

.method private ֫(Ll/ۡ᩶ۚ;I)I
    .locals 9

    .line 2871
    invoke-virtual {p0, p2}, Ll/ܿ᩶ۚ;->ۧ(I)I

    move-result v0

    ushr-int/lit8 v1, v0, 0x18

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    if-eq v1, v2, :cond_0

    const/high16 v3, -0x1000000

    packed-switch v1, :pswitch_data_0

    packed-switch v1, :pswitch_data_1

    .line 2929
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1

    :pswitch_0
    and-int/2addr v0, v3

    add-int/2addr p2, v2

    goto :goto_2

    :pswitch_1
    const v1, -0xffff01

    and-int/2addr v0, v1

    add-int/lit8 p2, p2, 0x4

    goto :goto_2

    :pswitch_2
    and-int/2addr v0, v3

    goto :goto_0

    :pswitch_3
    and-int/lit16 v0, v0, -0x100

    :goto_0
    add-int/lit8 p2, p2, 0x3

    goto :goto_2

    :pswitch_4
    and-int/2addr v0, v3

    add-int/lit8 v1, p2, 0x1

    .line 2888
    invoke-virtual {p0, v1}, Ll/ܿ᩶ۚ;->ܿ(I)I

    move-result v1

    add-int/lit8 p2, p2, 0x3

    .line 2890
    new-array v3, v1, [Ll/֨᩶ۚ;

    iput-object v3, p1, Ll/ۡ᩶ۚ;->ܺ:[Ll/֨᩶ۚ;

    .line 2891
    new-array v3, v1, [Ll/֨᩶ۚ;

    iput-object v3, p1, Ll/ۡ᩶ۚ;->ۢ:[Ll/֨᩶ۚ;

    .line 2892
    new-array v3, v1, [I

    iput-object v3, p1, Ll/ۡ᩶ۚ;->ۡ:[I

    const/4 v3, 0x0

    :goto_1
    if-ge v3, v1, :cond_1

    .line 2894
    invoke-virtual {p0, p2}, Ll/ܿ᩶ۚ;->ܿ(I)I

    move-result v4

    add-int/lit8 v5, p2, 0x2

    .line 2895
    invoke-virtual {p0, v5}, Ll/ܿ᩶ۚ;->ܿ(I)I

    move-result v5

    add-int/lit8 v6, p2, 0x4

    .line 2896
    invoke-virtual {p0, v6}, Ll/ܿ᩶ۚ;->ܿ(I)I

    move-result v6

    add-int/lit8 p2, p2, 0x6

    .line 2898
    iget-object v7, p1, Ll/ۡ᩶ۚ;->ܺ:[Ll/֨᩶ۚ;

    iget-object v8, p1, Ll/ۡ᩶ۚ;->ᩴ:[Ll/֨᩶ۚ;

    .line 2899
    invoke-static {v4, v8}, Ll/ܿ᩶ۚ;->֫(I[Ll/֨᩶ۚ;)Ll/֨᩶ۚ;

    move-result-object v8

    aput-object v8, v7, v3

    .line 2900
    iget-object v7, p1, Ll/ۡ᩶ۚ;->ۢ:[Ll/֨᩶ۚ;

    add-int/2addr v4, v5

    iget-object v5, p1, Ll/ۡ᩶ۚ;->ᩴ:[Ll/֨᩶ۚ;

    .line 2901
    invoke-static {v4, v5}, Ll/ܿ᩶ۚ;->֫(I[Ll/֨᩶ۚ;)Ll/֨᩶ۚ;

    move-result-object v4

    aput-object v4, v7, v3

    .line 2902
    iget-object v4, p1, Ll/ۡ᩶ۚ;->ۡ:[I

    aput v6, v4, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_0
    :pswitch_5
    const/high16 v1, -0x10000

    and-int/2addr v0, v1

    add-int/lit8 p2, p2, 0x2

    .line 2931
    :cond_1
    :goto_2
    iput v0, p1, Ll/ۡ᩶ۚ;->֡:I

    .line 2933
    invoke-virtual {p0, p2}, Ll/ܿ᩶ۚ;->֫(I)I

    move-result v0

    if-nez v0, :cond_2

    const/4 v1, 0x0

    goto :goto_3

    .line 2935
    :cond_2
    new-instance v1, Ll/᩺᩶ۚ;

    iget-object v3, p0, Ll/ܿ᩶ۚ;->ۧ:[B

    invoke-direct {v1, v3, p2}, Ll/᩺᩶ۚ;-><init>([BI)V

    :goto_3
    iput-object v1, p1, Ll/ۡ᩶ۚ;->ۚ:Ll/᩺᩶ۚ;

    add-int/2addr p2, v2

    mul-int/lit8 v0, v0, 0x2

    add-int/2addr v0, p2

    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x10
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_5
        :pswitch_3
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x40
        :pswitch_4
        :pswitch_4
        :pswitch_3
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

.method private ֫(Ll/ܰ᩹ۚ;ILjava/lang/String;[C)I
    .locals 11

    const/16 v0, 0x65

    const/16 v1, 0x5b

    const/16 v2, 0x40

    .line 3037
    iget-object v3, p0, Ll/ܿ᩶ۚ;->ۧ:[B

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-nez p1, :cond_3

    .line 3038
    aget-byte p1, v3, p2

    and-int/lit16 p1, p1, 0xff

    const/4 p3, 0x0

    if-eq p1, v2, :cond_2

    if-eq p1, v1, :cond_1

    if-eq p1, v0, :cond_0

    add-int/lit8 p2, p2, 0x3

    return p2

    :cond_0
    add-int/lit8 p2, p2, 0x5

    return p2

    :cond_1
    add-int/lit8 p2, p2, 0x1

    .line 3044
    invoke-direct {p0, p3, p2, v4, p4}, Ll/ܿ᩶ۚ;->֫(Ll/ܰ᩹ۚ;IZ[C)I

    move-result p1

    return p1

    :cond_2
    add-int/lit8 p2, p2, 0x3

    .line 3042
    invoke-direct {p0, p3, p2, v5, p4}, Ll/ܿ᩶ۚ;->֫(Ll/ܰ᩹ۚ;IZ[C)I

    move-result p1

    return p1

    :cond_3
    add-int/lit8 v6, p2, 0x1

    .line 3049
    aget-byte v7, v3, p2

    and-int/lit16 v7, v7, 0xff

    if-eq v7, v2, :cond_1b

    const/16 v2, 0x46

    if-eq v7, v2, :cond_1a

    const/16 v5, 0x53

    iget-object v8, p0, Ll/ܿ᩶ۚ;->ܿ:[I

    if-eq v7, v5, :cond_19

    const/16 v9, 0x63

    if-eq v7, v9, :cond_18

    if-eq v7, v0, :cond_17

    const/16 v0, 0x73

    if-eq v7, v0, :cond_16

    const/16 v0, 0x49

    if-eq v7, v0, :cond_1a

    const/16 v9, 0x4a

    if-eq v7, v9, :cond_1a

    const/16 v10, 0x5a

    if-eq v7, v10, :cond_14

    if-eq v7, v1, :cond_4

    packed-switch v7, :pswitch_data_0

    .line 3195
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1

    .line 3057
    :pswitch_0
    invoke-virtual {p0, v6}, Ll/ܿ᩶ۚ;->ܿ(I)I

    move-result p4

    aget p4, v8, p4

    invoke-virtual {p0, p4}, Ll/ܿ᩶ۚ;->ۧ(I)I

    move-result p4

    int-to-char p4, p4

    invoke-static {p4}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object p4

    .line 3056
    invoke-virtual {p1, p4, p3}, Ll/ܰ᩹ۚ;->֫(Ljava/lang/Object;Ljava/lang/String;)V

    add-int/lit8 p2, p2, 0x3

    return p2

    .line 3052
    :pswitch_1
    invoke-virtual {p0, v6}, Ll/ܿ᩶ۚ;->ܿ(I)I

    move-result p4

    aget p4, v8, p4

    invoke-virtual {p0, p4}, Ll/ܿ᩶ۚ;->ۧ(I)I

    move-result p4

    int-to-byte p4, p4

    invoke-static {p4}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p4

    .line 3051
    invoke-virtual {p1, p4, p3}, Ll/ܰ᩹ۚ;->֫(Ljava/lang/Object;Ljava/lang/String;)V

    add-int/lit8 p2, p2, 0x3

    return p2

    .line 3106
    :cond_4
    invoke-virtual {p0, v6}, Ll/ܿ᩶ۚ;->ܿ(I)I

    move-result v1

    add-int/lit8 p2, p2, 0x3

    if-nez v1, :cond_5

    .line 3110
    invoke-virtual {p1, p3}, Ll/ܰ᩹ۚ;->֫(Ljava/lang/String;)Ll/ܰ᩹ۚ;

    move-result-object p1

    .line 3109
    invoke-direct {p0, p1, v6, v4, p4}, Ll/ܿ᩶ۚ;->֫(Ll/ܰ᩹ۚ;IZ[C)I

    move-result p1

    return p1

    .line 3115
    :cond_5
    aget-byte v3, v3, p2

    and-int/lit16 v3, v3, 0xff

    if-eq v3, v2, :cond_12

    if-eq v3, v5, :cond_10

    if-eq v3, v10, :cond_d

    if-eq v3, v0, :cond_b

    if-eq v3, v9, :cond_9

    packed-switch v3, :pswitch_data_1

    .line 3187
    invoke-virtual {p1, p3}, Ll/ܰ᩹ۚ;->֫(Ljava/lang/String;)Ll/ܰ᩹ۚ;

    move-result-object p1

    .line 3186
    invoke-direct {p0, p1, v6, v4, p4}, Ll/ܿ᩶ۚ;->֫(Ll/ܰ᩹ۚ;IZ[C)I

    move-result p1

    return p1

    .line 3175
    :pswitch_2
    new-array p4, v1, [D

    :goto_0
    if-ge v4, v1, :cond_6

    add-int/lit8 v0, p2, 0x1

    .line 3179
    invoke-virtual {p0, v0}, Ll/ܿ᩶ۚ;->ܿ(I)I

    move-result v0

    aget v0, v8, v0

    invoke-virtual {p0, v0}, Ll/ܿ᩶ۚ;->ܽ(I)J

    move-result-wide v2

    .line 3178
    invoke-static {v2, v3}, Ljava/lang/Double;->longBitsToDouble(J)D

    move-result-wide v2

    aput-wide v2, p4, v4

    add-int/lit8 p2, p2, 0x3

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 3182
    :cond_6
    invoke-virtual {p1, p4, p3}, Ll/ܰ᩹ۚ;->֫(Ljava/lang/Object;Ljava/lang/String;)V

    return p2

    .line 3141
    :pswitch_3
    new-array p4, v1, [C

    :goto_1
    if-ge v4, v1, :cond_7

    add-int/lit8 v0, p2, 0x1

    .line 3143
    invoke-virtual {p0, v0}, Ll/ܿ᩶ۚ;->ܿ(I)I

    move-result v0

    aget v0, v8, v0

    invoke-virtual {p0, v0}, Ll/ܿ᩶ۚ;->ۧ(I)I

    move-result v0

    int-to-char v0, v0

    aput-char v0, p4, v4

    add-int/lit8 p2, p2, 0x3

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    .line 3146
    :cond_7
    invoke-virtual {p1, p4, p3}, Ll/ܰ᩹ۚ;->֫(Ljava/lang/Object;Ljava/lang/String;)V

    return p2

    .line 3117
    :pswitch_4
    new-array p4, v1, [B

    :goto_2
    if-ge v4, v1, :cond_8

    add-int/lit8 v0, p2, 0x1

    .line 3119
    invoke-virtual {p0, v0}, Ll/ܿ᩶ۚ;->ܿ(I)I

    move-result v0

    aget v0, v8, v0

    invoke-virtual {p0, v0}, Ll/ܿ᩶ۚ;->ۧ(I)I

    move-result v0

    int-to-byte v0, v0

    aput-byte v0, p4, v4

    add-int/lit8 p2, p2, 0x3

    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    .line 3122
    :cond_8
    invoke-virtual {p1, p4, p3}, Ll/ܰ᩹ۚ;->֫(Ljava/lang/Object;Ljava/lang/String;)V

    return p2

    .line 3157
    :cond_9
    new-array p4, v1, [J

    :goto_3
    if-ge v4, v1, :cond_a

    add-int/lit8 v0, p2, 0x1

    .line 3159
    invoke-virtual {p0, v0}, Ll/ܿ᩶ۚ;->ܿ(I)I

    move-result v0

    aget v0, v8, v0

    invoke-virtual {p0, v0}, Ll/ܿ᩶ۚ;->ܽ(I)J

    move-result-wide v2

    aput-wide v2, p4, v4

    add-int/lit8 p2, p2, 0x3

    add-int/lit8 v4, v4, 0x1

    goto :goto_3

    .line 3162
    :cond_a
    invoke-virtual {p1, p4, p3}, Ll/ܰ᩹ۚ;->֫(Ljava/lang/Object;Ljava/lang/String;)V

    return p2

    .line 3149
    :cond_b
    new-array p4, v1, [I

    :goto_4
    if-ge v4, v1, :cond_c

    add-int/lit8 v0, p2, 0x1

    .line 3151
    invoke-virtual {p0, v0}, Ll/ܿ᩶ۚ;->ܿ(I)I

    move-result v0

    aget v0, v8, v0

    invoke-virtual {p0, v0}, Ll/ܿ᩶ۚ;->ۧ(I)I

    move-result v0

    aput v0, p4, v4

    add-int/lit8 p2, p2, 0x3

    add-int/lit8 v4, v4, 0x1

    goto :goto_4

    .line 3154
    :cond_c
    invoke-virtual {p1, p4, p3}, Ll/ܰ᩹ۚ;->֫(Ljava/lang/Object;Ljava/lang/String;)V

    return p2

    .line 3125
    :cond_d
    new-array p4, v1, [Z

    const/4 v0, 0x0

    :goto_5
    if-ge v0, v1, :cond_f

    add-int/lit8 v2, p2, 0x1

    .line 3127
    invoke-virtual {p0, v2}, Ll/ܿ᩶ۚ;->ܿ(I)I

    move-result v2

    aget v2, v8, v2

    invoke-virtual {p0, v2}, Ll/ܿ᩶ۚ;->ۧ(I)I

    move-result v2

    if-eqz v2, :cond_e

    const/4 v2, 0x1

    goto :goto_6

    :cond_e
    const/4 v2, 0x0

    :goto_6
    aput-boolean v2, p4, v0

    add-int/lit8 p2, p2, 0x3

    add-int/lit8 v0, v0, 0x1

    goto :goto_5

    .line 3130
    :cond_f
    invoke-virtual {p1, p4, p3}, Ll/ܰ᩹ۚ;->֫(Ljava/lang/Object;Ljava/lang/String;)V

    return p2

    .line 3133
    :cond_10
    new-array p4, v1, [S

    :goto_7
    if-ge v4, v1, :cond_11

    add-int/lit8 v0, p2, 0x1

    .line 3135
    invoke-virtual {p0, v0}, Ll/ܿ᩶ۚ;->ܿ(I)I

    move-result v0

    aget v0, v8, v0

    invoke-virtual {p0, v0}, Ll/ܿ᩶ۚ;->ۧ(I)I

    move-result v0

    int-to-short v0, v0

    aput-short v0, p4, v4

    add-int/lit8 p2, p2, 0x3

    add-int/lit8 v4, v4, 0x1

    goto :goto_7

    .line 3138
    :cond_11
    invoke-virtual {p1, p4, p3}, Ll/ܰ᩹ۚ;->֫(Ljava/lang/Object;Ljava/lang/String;)V

    return p2

    .line 3165
    :cond_12
    new-array p4, v1, [F

    :goto_8
    if-ge v4, v1, :cond_13

    add-int/lit8 v0, p2, 0x1

    .line 3169
    invoke-virtual {p0, v0}, Ll/ܿ᩶ۚ;->ܿ(I)I

    move-result v0

    aget v0, v8, v0

    invoke-virtual {p0, v0}, Ll/ܿ᩶ۚ;->ۧ(I)I

    move-result v0

    .line 3168
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v0

    aput v0, p4, v4

    add-int/lit8 p2, p2, 0x3

    add-int/lit8 v4, v4, 0x1

    goto :goto_8

    .line 3172
    :cond_13
    invoke-virtual {p1, p4, p3}, Ll/ܰ᩹ۚ;->֫(Ljava/lang/Object;Ljava/lang/String;)V

    return p2

    .line 3077
    :cond_14
    invoke-virtual {p0, v6}, Ll/ܿ᩶ۚ;->ܿ(I)I

    move-result p4

    aget p4, v8, p4

    invoke-virtual {p0, p4}, Ll/ܿ᩶ۚ;->ۧ(I)I

    move-result p4

    if-nez p4, :cond_15

    .line 3078
    sget-object p4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    goto :goto_9

    .line 3079
    :cond_15
    sget-object p4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 3075
    :goto_9
    invoke-virtual {p1, p4, p3}, Ll/ܰ᩹ۚ;->֫(Ljava/lang/Object;Ljava/lang/String;)V

    add-int/lit8 p2, p2, 0x3

    return p2

    .line 3083
    :cond_16
    invoke-virtual {p0, p4, v6}, Ll/ܿ᩶ۚ;->ۧ([CI)Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p1, p4, p3}, Ll/ܰ᩹ۚ;->֫(Ljava/lang/Object;Ljava/lang/String;)V

    add-int/lit8 p2, p2, 0x3

    return p2

    .line 3089
    :cond_17
    invoke-virtual {p0, p4, v6}, Ll/ܿ᩶ۚ;->ۧ([CI)Ljava/lang/String;

    move-result-object v0

    add-int/lit8 v1, p2, 0x3

    .line 3090
    invoke-virtual {p0, p4, v1}, Ll/ܿ᩶ۚ;->ۧ([CI)Ljava/lang/String;

    move-result-object p4

    .line 3087
    invoke-virtual {p1, p3, v0, p4}, Ll/ܰ᩹ۚ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    add-int/lit8 p2, p2, 0x5

    return p2

    .line 3094
    :cond_18
    invoke-virtual {p0, p4, v6}, Ll/ܿ᩶ۚ;->ۧ([CI)Ljava/lang/String;

    move-result-object p4

    invoke-static {p4}, Ll/ۨ᩶ۚ;->ۜ(Ljava/lang/String;)Ll/ۨ᩶ۚ;

    move-result-object p4

    invoke-virtual {p1, p4, p3}, Ll/ܰ᩹ۚ;->֫(Ljava/lang/Object;Ljava/lang/String;)V

    add-int/lit8 p2, p2, 0x3

    return p2

    .line 3070
    :cond_19
    invoke-virtual {p0, v6}, Ll/ܿ᩶ۚ;->ܿ(I)I

    move-result p4

    aget p4, v8, p4

    invoke-virtual {p0, p4}, Ll/ܿ᩶ۚ;->ۧ(I)I

    move-result p4

    int-to-short p4, p4

    invoke-static {p4}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object p4

    .line 3069
    invoke-virtual {p1, p4, p3}, Ll/ܰ᩹ۚ;->֫(Ljava/lang/Object;Ljava/lang/String;)V

    add-int/lit8 p2, p2, 0x3

    return p2

    .line 3065
    :cond_1a
    :pswitch_5
    invoke-virtual {p0, v6}, Ll/ܿ᩶ۚ;->ܿ(I)I

    move-result v0

    invoke-virtual {p0, p4, v0}, Ll/ܿ᩶ۚ;->֫([CI)Ljava/lang/Object;

    move-result-object p4

    .line 3064
    invoke-virtual {p1, p4, p3}, Ll/ܰ᩹ۚ;->֫(Ljava/lang/Object;Ljava/lang/String;)V

    add-int/lit8 p2, p2, 0x3

    return p2

    .line 3100
    :cond_1b
    invoke-virtual {p0, p4, v6}, Ll/ܿ᩶ۚ;->ۧ([CI)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, p3, v0}, Ll/ܰ᩹ۚ;->֫(Ljava/lang/String;Ljava/lang/String;)Ll/ܰ᩹ۚ;

    move-result-object p1

    add-int/lit8 p2, p2, 0x3

    .line 3099
    invoke-direct {p0, p1, p2, v5, p4}, Ll/ܿ᩶ۚ;->֫(Ll/ܰ᩹ۚ;IZ[C)I

    move-result p1

    return p1

    nop

    :pswitch_data_0
    .packed-switch 0x42
        :pswitch_1
        :pswitch_0
        :pswitch_5
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x42
        :pswitch_4
        :pswitch_3
        :pswitch_2
    .end packed-switch
.end method

.method private ֫(Ll/ܰ᩹ۚ;IZ[C)I
    .locals 1

    .line 2999
    invoke-virtual {p0, p2}, Ll/ܿ᩶ۚ;->ܿ(I)I

    move-result v0

    add-int/lit8 p2, p2, 0x2

    if-eqz p3, :cond_0

    :goto_0
    add-int/lit8 p3, v0, -0x1

    if-lez v0, :cond_1

    .line 3004
    invoke-virtual {p0, p4, p2}, Ll/ܿ᩶ۚ;->ۧ([CI)Ljava/lang/String;

    move-result-object v0

    add-int/lit8 p2, p2, 0x2

    .line 3006
    invoke-direct {p0, p1, p2, v0, p4}, Ll/ܿ᩶ۚ;->֫(Ll/ܰ᩹ۚ;ILjava/lang/String;[C)I

    move-result p2

    move v0, p3

    goto :goto_0

    :cond_0
    :goto_1
    add-int/lit8 p3, v0, -0x1

    if-lez v0, :cond_1

    const/4 v0, 0x0

    .line 3012
    invoke-direct {p0, p1, p2, v0, p4}, Ll/ܿ᩶ۚ;->֫(Ll/ܰ᩹ۚ;ILjava/lang/String;[C)I

    move-result p2

    move v0, p3

    goto :goto_1

    :cond_1
    if-eqz p1, :cond_2

    .line 3016
    invoke-virtual {p1}, Ll/ܰ᩹ۚ;->֫()V

    :cond_2
    return p2
.end method

.method private ֫(Ll/᩻᩶ۚ;Ll/ۡ᩶ۚ;I)I
    .locals 44

    move-object/from16 v8, p0

    move-object/from16 v9, p2

    move/from16 v0, p3

    .line 1251
    iget-object v10, v9, Ll/ۡ᩶ۚ;->ۧ:[C

    .line 1255
    invoke-virtual {v8, v0}, Ll/ܿ᩶ۚ;->ܿ(I)I

    move-result v1

    iput v1, v9, Ll/ۡ᩶ۚ;->ۖ:I

    add-int/lit8 v1, v0, 0x2

    .line 1256
    invoke-virtual {v8, v10, v1}, Ll/ܿ᩶ۚ;->ۧ([CI)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v9, Ll/ۡ᩶ۚ;->᩵:Ljava/lang/String;

    add-int/lit8 v11, v0, 0x4

    .line 1257
    invoke-virtual {v8, v10, v11}, Ll/ܿ᩶ۚ;->ۧ([CI)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v9, Ll/ۡ᩶ۚ;->ۘ:Ljava/lang/String;

    add-int/lit8 v1, v0, 0x6

    .line 1292
    invoke-virtual {v8, v1}, Ll/ܿ᩶ۚ;->ܿ(I)I

    move-result v1

    add-int/lit8 v0, v0, 0x8

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    move-object v3, v12

    move-object/from16 v23, v15

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v24, 0x0

    move v12, v0

    const/4 v0, 0x0

    :goto_0
    add-int/lit8 v18, v1, -0x1

    move/from16 p3, v7

    const-string v7, "RuntimeInvisibleTypeAnnotations"

    move/from16 v25, v15

    const-string v15, "RuntimeVisibleTypeAnnotations"

    const/high16 v26, 0x20000

    if-lez v1, :cond_f

    .line 1296
    invoke-virtual {v8, v10, v12}, Ll/ܿ᩶ۚ;->ۧ([CI)Ljava/lang/String;

    move-result-object v1

    move/from16 v19, v0

    add-int/lit8 v0, v12, 0x2

    .line 1297
    invoke-virtual {v8, v0}, Ll/ܿ᩶ۚ;->ۧ(I)I

    move-result v20

    add-int/lit8 v0, v12, 0x6

    move/from16 v21, v2

    const-string v2, "Code"

    .line 1301
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 1302
    iget v1, v9, Ll/ۡ᩶ۚ;->֨:I

    and-int/lit8 v1, v1, 0x1

    if-nez v1, :cond_4

    move/from16 v7, p3

    move/from16 v24, v0

    goto/16 :goto_2

    :cond_0
    const-string v2, "Exceptions"

    .line 1305
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 1307
    invoke-virtual {v8, v0}, Ll/ܿ᩶ۚ;->ܿ(I)I

    move-result v1

    new-array v2, v1, [Ljava/lang/String;

    add-int/lit8 v12, v12, 0x8

    const/4 v7, 0x0

    :goto_1
    if-ge v7, v1, :cond_1

    .line 3771
    invoke-direct {v8, v10, v12}, Ll/ܿ᩶ۚ;->ᩳ([CI)Ljava/lang/String;

    move-result-object v15

    .line 1310
    aput-object v15, v2, v7

    add-int/lit8 v12, v12, 0x2

    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    :cond_1
    move/from16 v7, p3

    move/from16 v17, v0

    move-object/from16 v23, v2

    goto/16 :goto_2

    :cond_2
    const-string v2, "Signature"

    .line 1313
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 1314
    invoke-virtual {v8, v0}, Ll/ܿ᩶ۚ;->ܿ(I)I

    move-result v1

    move v7, v1

    goto/16 :goto_2

    :cond_3
    const-string v2, "Deprecated"

    .line 1315
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_5

    .line 1316
    iget v1, v9, Ll/ۡ᩶ۚ;->ۖ:I

    or-int v1, v1, v26

    iput v1, v9, Ll/ۡ᩶ۚ;->ۖ:I

    :cond_4
    move/from16 v7, p3

    goto/16 :goto_2

    :cond_5
    const-string v2, "RuntimeVisibleAnnotations"

    .line 1317
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_6

    move/from16 v7, p3

    move v14, v0

    goto :goto_2

    .line 1319
    :cond_6
    invoke-virtual {v15, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_7

    move/from16 v7, p3

    move v6, v0

    goto :goto_2

    :cond_7
    const-string v2, "AnnotationDefault"

    .line 1321
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_8

    move/from16 v7, p3

    move v13, v0

    move/from16 v29, v4

    move/from16 v2, v21

    move/from16 v15, v25

    move/from16 v0, v19

    move/from16 v19, v13

    goto/16 :goto_5

    :cond_8
    const-string v2, "Synthetic"

    .line 1323
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_9

    .line 1325
    iget v1, v9, Ll/ۡ᩶ۚ;->ۖ:I

    or-int/lit16 v1, v1, 0x1000

    iput v1, v9, Ll/ۡ᩶ۚ;->ۖ:I

    const/16 v16, 0x1

    move/from16 v7, p3

    move/from16 v2, v21

    move/from16 v15, v25

    move/from16 v43, v19

    move/from16 v19, v0

    move/from16 v0, v43

    goto/16 :goto_6

    :cond_9
    const-string v2, "RuntimeInvisibleAnnotations"

    .line 1326
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_a

    move/from16 v7, p3

    move v15, v0

    move/from16 v2, v21

    goto :goto_4

    .line 1328
    :cond_a
    invoke-virtual {v7, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_b

    move/from16 v7, p3

    move v5, v0

    :goto_2
    move/from16 v2, v21

    :goto_3
    move/from16 v15, v25

    goto :goto_4

    :cond_b
    const-string v2, "RuntimeVisibleParameterAnnotations"

    .line 1330
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_c

    move/from16 v7, p3

    move v4, v0

    move/from16 v2, v21

    move/from16 v15, v25

    move/from16 v0, v19

    move/from16 v19, v4

    goto/16 :goto_6

    :cond_c
    const-string v2, "RuntimeInvisibleParameterAnnotations"

    .line 1332
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_d

    move/from16 v7, p3

    move/from16 v19, v0

    goto :goto_2

    :cond_d
    const-string v2, "MethodParameters"

    .line 1334
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_e

    move/from16 v7, p3

    move v2, v0

    goto :goto_3

    :goto_4
    move/from16 v29, v4

    move/from16 v43, v19

    move/from16 v19, v0

    move/from16 v0, v43

    goto :goto_5

    .line 1337
    :cond_e
    iget-object v2, v9, Ll/ۡ᩶ۚ;->֫:[Ll/ܽ᩶ۚ;

    const/4 v7, -0x1

    const/4 v12, 0x0

    move/from16 v15, v19

    move/from16 v19, v0

    move-object/from16 v0, p0

    move-object/from16 v22, v1

    move-object v1, v2

    move/from16 v27, v21

    move-object/from16 v2, v22

    move-object/from16 v28, v3

    move/from16 v3, v19

    move/from16 v29, v4

    move/from16 v4, v20

    move/from16 v30, v5

    move-object v5, v10

    move/from16 v21, v15

    move v15, v6

    move v6, v7

    move/from16 v31, v15

    move/from16 v15, p3

    move-object v7, v12

    .line 1338
    invoke-direct/range {v0 .. v7}, Ll/ܿ᩶ۚ;->֫([Ll/ܽ᩶ۚ;Ljava/lang/String;II[CI[Ll/֨᩶ۚ;)Ll/ܽ᩶ۚ;

    move-result-object v3

    move-object/from16 v6, v28

    .line 1346
    iput-object v6, v3, Ll/ܽ᩶ۚ;->ۧ:Ll/ܽ᩶ۚ;

    move v7, v15

    move/from16 v0, v21

    move/from16 v15, v25

    move/from16 v2, v27

    move/from16 v5, v30

    move/from16 v6, v31

    :goto_5
    move/from16 v4, v29

    :goto_6
    add-int v12, v19, v20

    move/from16 v1, v18

    goto/16 :goto_0

    :cond_f
    move/from16 v27, v2

    move/from16 v29, v4

    move/from16 v30, v5

    move/from16 v31, v6

    move-object v5, v15

    move/from16 v15, p3

    move v4, v0

    move-object v6, v3

    const/16 v28, 0x2

    .line 1353
    iget v0, v9, Ll/ۡ᩶ۚ;->ۖ:I

    iget-object v1, v9, Ll/ۡ᩶ۚ;->᩵:Ljava/lang/String;

    iget-object v2, v9, Ll/ۡ᩶ۚ;->ۘ:Ljava/lang/String;

    if-nez v15, :cond_10

    const/4 v3, 0x0

    goto :goto_7

    .line 1358
    :cond_10
    invoke-virtual {v8, v10, v15}, Ll/ܿ᩶ۚ;->ܽ([CI)Ljava/lang/String;

    move-result-object v3

    :goto_7
    move-object/from16 v22, v3

    move-object/from16 v18, p1

    move/from16 v19, v0

    move-object/from16 v20, v1

    move-object/from16 v21, v2

    .line 1354
    invoke-virtual/range {v18 .. v23}, Ll/᩻᩶ۚ;->֫(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Ll/ܶ᩶ۚ;

    move-result-object v3

    if-nez v3, :cond_11

    return v12

    .line 1368
    :cond_11
    instance-of v0, v3, Ll/᩸᩶ۚ;

    if-eqz v0, :cond_13

    .line 1369
    move-object v0, v3

    check-cast v0, Ll/᩸᩶ۚ;

    .line 1370
    iget v1, v9, Ll/ۡ᩶ۚ;->ۖ:I

    and-int v1, v1, v26

    if-eqz v1, :cond_12

    const/4 v1, 0x1

    const/16 v18, 0x1

    goto :goto_8

    :cond_12
    const/4 v1, 0x0

    const/16 v18, 0x0

    .line 1374
    :goto_8
    invoke-virtual {v8, v11}, Ll/ܿ᩶ۚ;->ܿ(I)I

    move-result v11

    move-object/from16 v1, p0

    move/from16 v2, v16

    move/from16 v16, v12

    move-object v12, v3

    move/from16 v3, v18

    move-object/from16 p3, v7

    move v7, v4

    move v4, v11

    move-object v11, v5

    move v5, v15

    move-object v15, v6

    move/from16 v6, v17

    .line 1370
    invoke-virtual/range {v0 .. v6}, Ll/᩸᩶ۚ;->֫(Ll/ܿ᩶ۚ;ZZIII)Z

    goto :goto_9

    :cond_13
    move-object v11, v5

    move-object v15, v6

    move-object/from16 p3, v7

    move/from16 v16, v12

    move-object v12, v3

    move v7, v4

    :goto_9
    move/from16 v2, v27

    if-eqz v2, :cond_14

    .line 1383
    iget v0, v9, Ll/ۡ᩶ۚ;->֨:I

    and-int/lit8 v0, v0, 0x2

    if-nez v0, :cond_14

    .line 1384
    invoke-virtual {v8, v2}, Ll/ܿ᩶ۚ;->֫(I)I

    move-result v0

    add-int/lit8 v2, v2, 0x1

    :goto_a
    add-int/lit8 v1, v0, -0x1

    if-lez v0, :cond_14

    .line 1389
    invoke-virtual {v8, v10, v2}, Ll/ܿ᩶ۚ;->ۧ([CI)Ljava/lang/String;

    move-result-object v0

    add-int/lit8 v3, v2, 0x2

    .line 1390
    invoke-virtual {v8, v3}, Ll/ܿ᩶ۚ;->ܿ(I)I

    move-result v3

    .line 1388
    invoke-virtual {v12, v3, v0}, Ll/ܶ᩶ۚ;->ۧ(ILjava/lang/String;)V

    add-int/lit8 v2, v2, 0x4

    move v0, v1

    goto :goto_a

    :cond_14
    if-eqz v13, :cond_15

    .line 1397
    invoke-virtual {v12}, Ll/ܶ᩶ۚ;->֫()Ll/ܰ᩹ۚ;

    move-result-object v0

    const/4 v1, 0x0

    .line 1398
    invoke-direct {v8, v0, v13, v1, v10}, Ll/ܿ᩶ۚ;->֫(Ll/ܰ᩹ۚ;ILjava/lang/String;[C)I

    if-eqz v0, :cond_15

    .line 1400
    invoke-virtual {v0}, Ll/ܰ᩹ۚ;->֫()V

    :cond_15
    if-eqz v14, :cond_16

    .line 1406
    invoke-virtual {v8, v14}, Ll/ܿ᩶ۚ;->ܿ(I)I

    move-result v0

    add-int/lit8 v14, v14, 0x2

    :goto_b
    add-int/lit8 v1, v0, -0x1

    if-lez v0, :cond_16

    .line 1410
    invoke-virtual {v8, v10, v14}, Ll/ܿ᩶ۚ;->ۧ([CI)Ljava/lang/String;

    move-result-object v0

    add-int/lit8 v14, v14, 0x2

    const/4 v2, 0x1

    .line 1415
    invoke-virtual {v12, v0, v2}, Ll/ܶ᩶ۚ;->֫(Ljava/lang/String;Z)Ll/ܰ᩹ۚ;

    move-result-object v0

    .line 1414
    invoke-direct {v8, v0, v14, v2, v10}, Ll/ܿ᩶ۚ;->֫(Ll/ܰ᩹ۚ;IZ[C)I

    move-result v14

    move v0, v1

    goto :goto_b

    :cond_16
    if-eqz v25, :cond_17

    move/from16 v4, v25

    .line 1424
    invoke-virtual {v8, v4}, Ll/ܿ᩶ۚ;->ܿ(I)I

    move-result v0

    add-int/lit8 v1, v4, 0x2

    :goto_c
    add-int/lit8 v2, v0, -0x1

    if-lez v0, :cond_17

    .line 1428
    invoke-virtual {v8, v10, v1}, Ll/ܿ᩶ۚ;->ۧ([CI)Ljava/lang/String;

    move-result-object v0

    add-int/lit8 v1, v1, 0x2

    const/4 v3, 0x0

    .line 1433
    invoke-virtual {v12, v0, v3}, Ll/ܶ᩶ۚ;->֫(Ljava/lang/String;Z)Ll/ܰ᩹ۚ;

    move-result-object v0

    const/4 v3, 0x1

    .line 1432
    invoke-direct {v8, v0, v1, v3, v10}, Ll/ܿ᩶ۚ;->֫(Ll/ܰ᩹ۚ;IZ[C)I

    move-result v1

    move v0, v2

    goto :goto_c

    :cond_17
    if-eqz v31, :cond_18

    move/from16 v5, v31

    .line 1442
    invoke-virtual {v8, v5}, Ll/ܿ᩶ۚ;->ܿ(I)I

    move-result v0

    add-int/lit8 v6, v5, 0x2

    :goto_d
    add-int/lit8 v1, v0, -0x1

    if-lez v0, :cond_18

    .line 1446
    invoke-direct {v8, v9, v6}, Ll/ܿ᩶ۚ;->֫(Ll/ۡ᩶ۚ;I)I

    move-result v0

    .line 1448
    invoke-virtual {v8, v10, v0}, Ll/ܿ᩶ۚ;->ۧ([CI)Ljava/lang/String;

    move-result-object v2

    add-int/lit8 v0, v0, 0x2

    .line 1451
    iget v3, v9, Ll/ۡ᩶ۚ;->֡:I

    iget-object v4, v9, Ll/ۡ᩶ۚ;->ۚ:Ll/᩺᩶ۚ;

    const/4 v5, 0x1

    .line 1453
    invoke-virtual {v12, v3, v4, v2, v5}, Ll/ܶ᩶ۚ;->ܽ(ILl/᩺᩶ۚ;Ljava/lang/String;Z)Ll/ܰ᩹ۚ;

    move-result-object v2

    .line 1452
    invoke-direct {v8, v2, v0, v5, v10}, Ll/ܿ᩶ۚ;->֫(Ll/ܰ᩹ۚ;IZ[C)I

    move-result v6

    move v0, v1

    goto :goto_d

    :cond_18
    move/from16 v5, v30

    if-eqz v5, :cond_19

    .line 1466
    invoke-virtual {v8, v5}, Ll/ܿ᩶ۚ;->ܿ(I)I

    move-result v0

    add-int/lit8 v5, v5, 0x2

    :goto_e
    add-int/lit8 v1, v0, -0x1

    if-lez v0, :cond_19

    .line 1470
    invoke-direct {v8, v9, v5}, Ll/ܿ᩶ۚ;->֫(Ll/ۡ᩶ۚ;I)I

    move-result v0

    .line 1472
    invoke-virtual {v8, v10, v0}, Ll/ܿ᩶ۚ;->ۧ([CI)Ljava/lang/String;

    move-result-object v2

    add-int/lit8 v0, v0, 0x2

    .line 1475
    iget v3, v9, Ll/ۡ᩶ۚ;->֡:I

    iget-object v4, v9, Ll/ۡ᩶ۚ;->ۚ:Ll/᩺᩶ۚ;

    const/4 v5, 0x0

    .line 1477
    invoke-virtual {v12, v3, v4, v2, v5}, Ll/ܶ᩶ۚ;->ܽ(ILl/᩺᩶ۚ;Ljava/lang/String;Z)Ll/ܰ᩹ۚ;

    move-result-object v2

    const/4 v3, 0x1

    .line 1476
    invoke-direct {v8, v2, v0, v3, v10}, Ll/ܿ᩶ۚ;->֫(Ll/ܰ᩹ۚ;IZ[C)I

    move-result v5

    move v0, v1

    goto :goto_e

    :cond_19
    const/4 v0, 0x1

    const/4 v1, 0x0

    move/from16 v4, v29

    if-eqz v4, :cond_1a

    .line 1490
    invoke-direct {v8, v12, v9, v4, v0}, Ll/ܿ᩶ۚ;->֫(Ll/ܶ᩶ۚ;Ll/ۡ᩶ۚ;IZ)V

    :cond_1a
    if-eqz v7, :cond_1b

    .line 1496
    invoke-direct {v8, v12, v9, v7, v1}, Ll/ܿ᩶ۚ;->֫(Ll/ܶ᩶ۚ;Ll/ۡ᩶ۚ;IZ)V

    :cond_1b
    move-object v3, v15

    :goto_f
    if-eqz v3, :cond_1c

    .line 1503
    iget-object v0, v3, Ll/ܽ᩶ۚ;->ۧ:Ll/ܽ᩶ۚ;

    const/4 v1, 0x0

    .line 1504
    iput-object v1, v3, Ll/ܽ᩶ۚ;->ۧ:Ll/ܽ᩶ۚ;

    .line 1505
    invoke-virtual {v12, v3}, Ll/ܶ᩶ۚ;->֫(Ll/ܽ᩶ۚ;)V

    move-object v3, v0

    goto :goto_f

    :cond_1c
    move/from16 v10, v24

    if-eqz v10, :cond_7a

    .line 1511
    invoke-virtual {v12}, Ll/ܶ᩶ۚ;->ۧ()V

    .line 1538
    iget-object v13, v9, Ll/ۡ᩶ۚ;->ۧ:[C

    .line 1539
    invoke-virtual {v8, v10}, Ll/ܿ᩶ۚ;->ܿ(I)I

    move-result v14

    add-int/lit8 v0, v10, 0x2

    .line 1540
    invoke-virtual {v8, v0}, Ll/ܿ᩶ۚ;->ܿ(I)I

    move-result v15

    add-int/lit8 v0, v10, 0x4

    .line 1541
    invoke-virtual {v8, v0}, Ll/ܿ᩶ۚ;->ۧ(I)I

    move-result v7

    add-int/lit8 v24, v10, 0x8

    .line 1543
    iget-object v6, v8, Ll/ܿ᩶ۚ;->ۧ:[B

    array-length v0, v6

    sub-int v0, v0, v24

    if-gt v7, v0, :cond_79

    add-int v5, v24, v7

    add-int/lit8 v0, v7, 0x1

    .line 1550
    new-array v4, v0, [Ll/֨᩶ۚ;

    iput-object v4, v9, Ll/ۡ᩶ۚ;->ᩴ:[Ll/֨᩶ۚ;

    move/from16 v0, v24

    :goto_10
    const/16 v1, 0x84

    if-ge v0, v5, :cond_20

    sub-int v2, v0, v24

    .line 1553
    aget-byte v3, v6, v0

    and-int/lit16 v3, v3, 0xff

    packed-switch v3, :pswitch_data_0

    .line 1841
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v0

    :pswitch_0
    add-int/lit8 v1, v0, 0x1

    .line 1743
    invoke-virtual {v8, v1}, Ll/ܿ᩶ۚ;->ܿ(I)I

    move-result v1

    add-int/2addr v1, v2

    invoke-static {v1, v4}, Ll/ܿ᩶ۚ;->֫(I[Ll/֨᩶ۚ;)Ll/֨᩶ۚ;

    goto/16 :goto_14

    :pswitch_1
    add-int/lit8 v1, v0, 0x1

    .line 1749
    invoke-virtual {v8, v1}, Ll/ܿ᩶ۚ;->ۧ(I)I

    move-result v1

    add-int/2addr v1, v2

    invoke-static {v1, v4}, Ll/ܿ᩶ۚ;->֫(I[Ll/֨᩶ۚ;)Ll/֨᩶ۚ;

    goto :goto_11

    :pswitch_2
    add-int/lit8 v2, v0, 0x1

    .line 1753
    aget-byte v2, v6, v2

    and-int/lit16 v2, v2, 0xff

    if-eq v2, v1, :cond_1e

    const/16 v1, 0xa9

    if-eq v2, v1, :cond_1d

    packed-switch v2, :pswitch_data_1

    packed-switch v2, :pswitch_data_2

    .line 1771
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v0

    :cond_1d
    :pswitch_3
    add-int/lit8 v0, v0, 0x4

    goto :goto_10

    :cond_1e
    add-int/lit8 v0, v0, 0x6

    goto :goto_10

    :goto_11
    :pswitch_4
    add-int/lit8 v0, v0, 0x5

    goto :goto_10

    :pswitch_5
    and-int/lit8 v1, v2, 0x3

    rsub-int/lit8 v1, v1, 0x4

    add-int/2addr v1, v0

    .line 1791
    invoke-virtual {v8, v1}, Ll/ܿ᩶ۚ;->ۧ(I)I

    move-result v0

    add-int/2addr v0, v2

    invoke-static {v0, v4}, Ll/ܿ᩶ۚ;->֫(I[Ll/֨᩶ۚ;)Ll/֨᩶ۚ;

    add-int/lit8 v0, v1, 0x4

    .line 1792
    invoke-virtual {v8, v0}, Ll/ܿ᩶ۚ;->ۧ(I)I

    move-result v0

    add-int/lit8 v1, v1, 0x8

    :goto_12
    add-int/lit8 v3, v0, -0x1

    if-lez v0, :cond_1f

    add-int/lit8 v0, v1, 0x4

    .line 1796
    invoke-virtual {v8, v0}, Ll/ܿ᩶ۚ;->ۧ(I)I

    move-result v0

    add-int/2addr v0, v2

    invoke-static {v0, v4}, Ll/ܿ᩶ۚ;->֫(I[Ll/֨᩶ۚ;)Ll/֨᩶ۚ;

    add-int/lit8 v1, v1, 0x8

    move v0, v3

    goto :goto_12

    :pswitch_6
    and-int/lit8 v1, v2, 0x3

    rsub-int/lit8 v1, v1, 0x4

    add-int/2addr v1, v0

    .line 1778
    invoke-virtual {v8, v1}, Ll/ܿ᩶ۚ;->ۧ(I)I

    move-result v0

    add-int/2addr v0, v2

    invoke-static {v0, v4}, Ll/ܿ᩶ۚ;->֫(I[Ll/֨᩶ۚ;)Ll/֨᩶ۚ;

    add-int/lit8 v0, v1, 0x8

    .line 1779
    invoke-virtual {v8, v0}, Ll/ܿ᩶ۚ;->ۧ(I)I

    move-result v0

    add-int/lit8 v3, v1, 0x4

    invoke-virtual {v8, v3}, Ll/ܿ᩶ۚ;->ۧ(I)I

    move-result v3

    sub-int/2addr v0, v3

    add-int/lit8 v0, v0, 0x1

    add-int/lit8 v1, v1, 0xc

    :goto_13
    add-int/lit8 v3, v0, -0x1

    if-lez v0, :cond_1f

    .line 1783
    invoke-virtual {v8, v1}, Ll/ܿ᩶ۚ;->ۧ(I)I

    move-result v0

    add-int/2addr v0, v2

    invoke-static {v0, v4}, Ll/ܿ᩶ۚ;->֫(I[Ll/֨᩶ۚ;)Ll/֨᩶ۚ;

    add-int/lit8 v1, v1, 0x4

    move v0, v3

    goto :goto_13

    :cond_1f
    move v0, v1

    goto/16 :goto_10

    :pswitch_7
    add-int/lit8 v1, v0, 0x1

    .line 1722
    invoke-virtual {v8, v1}, Ll/ܿ᩶ۚ;->ᩳ(I)S

    move-result v1

    add-int/2addr v1, v2

    invoke-static {v1, v4}, Ll/ܿ᩶ۚ;->֫(I[Ll/֨᩶ۚ;)Ll/֨᩶ۚ;

    :goto_14
    :pswitch_8
    add-int/lit8 v0, v0, 0x3

    goto/16 :goto_10

    :pswitch_9
    add-int/lit8 v0, v0, 0x2

    goto/16 :goto_10

    :pswitch_a
    add-int/lit8 v0, v0, 0x1

    goto/16 :goto_10

    .line 1847
    :cond_20
    invoke-virtual {v8, v0}, Ll/ܿ᩶ۚ;->ܿ(I)I

    move-result v1

    add-int/lit8 v0, v0, 0x2

    :goto_15
    add-int/lit8 v2, v1, -0x1

    .line 1849
    iget-object v3, v8, Ll/ܿ᩶ۚ;->ܿ:[I

    if-lez v1, :cond_21

    .line 1850
    invoke-virtual {v8, v0}, Ll/ܿ᩶ۚ;->ܿ(I)I

    move-result v1

    invoke-static {v1, v4}, Ll/ܿ᩶ۚ;->֫(I[Ll/֨᩶ۚ;)Ll/֨᩶ۚ;

    move-result-object v1

    move/from16 p1, v2

    add-int/lit8 v2, v0, 0x2

    .line 1851
    invoke-virtual {v8, v2}, Ll/ܿ᩶ۚ;->ܿ(I)I

    move-result v2

    invoke-static {v2, v4}, Ll/ܿ᩶ۚ;->֫(I[Ll/֨᩶ۚ;)Ll/֨᩶ۚ;

    move-result-object v2

    move/from16 v17, v5

    add-int/lit8 v5, v0, 0x4

    .line 1852
    invoke-virtual {v8, v5}, Ll/ܿ᩶ۚ;->ܿ(I)I

    move-result v5

    invoke-static {v5, v4}, Ll/ܿ᩶ۚ;->֫(I[Ll/֨᩶ۚ;)Ll/֨᩶ۚ;

    move-result-object v5

    move-object/from16 v18, v6

    add-int/lit8 v6, v0, 0x6

    .line 1853
    invoke-virtual {v8, v6}, Ll/ܿ᩶ۚ;->ܿ(I)I

    move-result v6

    aget v3, v3, v6

    invoke-virtual {v8, v13, v3}, Ll/ܿ᩶ۚ;->ۧ([CI)Ljava/lang/String;

    move-result-object v3

    add-int/lit8 v0, v0, 0x8

    .line 1855
    invoke-virtual {v12, v1, v2, v5, v3}, Ll/ܶ᩶ۚ;->֫(Ll/֨᩶ۚ;Ll/֨᩶ۚ;Ll/֨᩶ۚ;Ljava/lang/String;)V

    move/from16 v1, p1

    move/from16 v5, v17

    move-object/from16 v6, v18

    goto :goto_15

    :cond_21
    move/from16 v17, v5

    move-object/from16 v18, v6

    .line 1883
    invoke-virtual {v8, v0}, Ll/ܿ᩶ۚ;->ܿ(I)I

    move-result v1

    add-int/lit8 v0, v0, 0x2

    const/4 v2, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x1

    move-object/from16 v43, v6

    move-object v6, v2

    move-object/from16 v2, v43

    :goto_16
    add-int/lit8 v25, v1, -0x1

    if-lez v1, :cond_33

    .line 1887
    invoke-virtual {v8, v13, v0}, Ll/ܿ᩶ۚ;->ۧ([CI)Ljava/lang/String;

    move-result-object v1

    move-object/from16 p1, v2

    add-int/lit8 v2, v0, 0x2

    .line 1888
    invoke-virtual {v8, v2}, Ll/ܿ᩶ۚ;->ۧ(I)I

    move-result v26

    add-int/lit8 v2, v0, 0x6

    move-object/from16 v27, v3

    const-string v3, "LocalVariableTable"

    .line 1890
    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_28

    .line 1891
    iget v1, v9, Ll/ۡ᩶ۚ;->֨:I

    and-int/lit8 v1, v1, 0x2

    if-nez v1, :cond_27

    .line 1895
    invoke-virtual {v8, v2}, Ll/ܿ᩶ۚ;->ܿ(I)I

    move-result v1

    add-int/lit8 v0, v0, 0x8

    :goto_17
    add-int/lit8 v3, v1, -0x1

    if-lez v1, :cond_26

    .line 1898
    invoke-virtual {v8, v0}, Ll/ܿ᩶ۚ;->ܿ(I)I

    move-result v1

    .line 2722
    aget-object v22, v4, v1

    if-nez v22, :cond_23

    if-nez v22, :cond_22

    .line 2693
    new-instance v22, Ll/֨᩶ۚ;

    invoke-direct/range {v22 .. v22}, Ll/֨᩶ۚ;-><init>()V

    aput-object v22, v4, v1

    :cond_22
    move/from16 v22, v3

    .line 2695
    aget-object v3, v4, v1

    move-object/from16 v29, v5

    .line 2723
    iget-short v5, v3, Ll/֨᩶ۚ;->ۧ:S

    or-int/lit8 v5, v5, 0x1

    int-to-short v5, v5

    iput-short v5, v3, Ll/֨᩶ۚ;->ۧ:S

    goto :goto_18

    :cond_23
    move/from16 v22, v3

    move-object/from16 v29, v5

    :goto_18
    add-int/lit8 v3, v0, 0x2

    .line 1900
    invoke-virtual {v8, v3}, Ll/ܿ᩶ۚ;->ܿ(I)I

    move-result v3

    add-int/2addr v3, v1

    .line 2722
    aget-object v1, v4, v3

    if-nez v1, :cond_25

    if-nez v1, :cond_24

    .line 2693
    new-instance v1, Ll/֨᩶ۚ;

    invoke-direct {v1}, Ll/֨᩶ۚ;-><init>()V

    aput-object v1, v4, v3

    .line 2695
    :cond_24
    aget-object v1, v4, v3

    .line 2723
    iget-short v3, v1, Ll/֨᩶ۚ;->ۧ:S

    or-int/lit8 v3, v3, 0x1

    int-to-short v3, v3

    iput-short v3, v1, Ll/֨᩶ۚ;->ۧ:S

    :cond_25
    add-int/lit8 v0, v0, 0xa

    move/from16 v1, v22

    move-object/from16 v5, v29

    goto :goto_17

    :cond_26
    move-object/from16 v29, v5

    move/from16 v22, v2

    goto :goto_19

    :cond_27
    move-object/from16 v29, v5

    goto/16 :goto_1c

    :cond_28
    move-object/from16 v29, v5

    const-string v3, "LocalVariableTypeTable"

    .line 1906
    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_29

    move/from16 v20, v2

    :goto_19
    move/from16 v31, v2

    move/from16 v32, v10

    move-object/from16 v30, v11

    move-object/from16 v5, v29

    move-object/from16 v2, p1

    move-object/from16 v29, p3

    move-object/from16 p1, v4

    move v10, v7

    move-object/from16 p3, v13

    goto/16 :goto_20

    :cond_29
    const-string v3, "LineNumberTable"

    .line 1910
    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2d

    .line 1911
    iget v1, v9, Ll/ۡ᩶ۚ;->֨:I

    and-int/lit8 v1, v1, 0x2

    if-nez v1, :cond_2c

    .line 1914
    invoke-virtual {v8, v2}, Ll/ܿ᩶ۚ;->ܿ(I)I

    move-result v1

    add-int/lit8 v0, v0, 0x8

    :goto_1a
    add-int/lit8 v3, v1, -0x1

    if-lez v1, :cond_2c

    .line 1917
    invoke-virtual {v8, v0}, Ll/ܿ᩶ۚ;->ܿ(I)I

    move-result v1

    add-int/lit8 v5, v0, 0x2

    .line 1918
    invoke-virtual {v8, v5}, Ll/ܿ᩶ۚ;->ܿ(I)I

    move-result v5

    add-int/lit8 v0, v0, 0x4

    .line 2722
    aget-object v30, v4, v1

    if-nez v30, :cond_2b

    if-nez v30, :cond_2a

    .line 2693
    new-instance v30, Ll/֨᩶ۚ;

    invoke-direct/range {v30 .. v30}, Ll/֨᩶ۚ;-><init>()V

    aput-object v30, v4, v1

    :cond_2a
    move/from16 v30, v0

    .line 2695
    aget-object v0, v4, v1

    move/from16 v31, v3

    .line 2723
    iget-short v3, v0, Ll/֨᩶ۚ;->ۧ:S

    or-int/lit8 v3, v3, 0x1

    int-to-short v3, v3

    iput-short v3, v0, Ll/֨᩶ۚ;->ۧ:S

    goto :goto_1b

    :cond_2b
    move/from16 v30, v0

    move/from16 v31, v3

    .line 1921
    :goto_1b
    aget-object v0, v4, v1

    invoke-virtual {v0, v5}, Ll/֨᩶ۚ;->֫(I)V

    move/from16 v0, v30

    move/from16 v1, v31

    goto :goto_1a

    :cond_2c
    :goto_1c
    move-object/from16 v5, p3

    goto :goto_1d

    .line 1924
    :cond_2d
    invoke-virtual {v11, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2e

    const/4 v0, 0x1

    .line 1926
    invoke-direct {v8, v12, v9, v2, v0}, Ll/ܿ᩶ۚ;->ۧ(Ll/ܶ᩶ۚ;Ll/ۡ᩶ۚ;IZ)[I

    move-result-object v6

    move-object/from16 v5, p3

    goto :goto_1f

    :cond_2e
    move-object/from16 v5, p3

    .line 1933
    invoke-virtual {v5, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2f

    const/4 v0, 0x0

    .line 1935
    invoke-direct {v8, v12, v9, v2, v0}, Ll/ܿ᩶ۚ;->ۧ(Ll/ܶ᩶ۚ;Ll/ۡ᩶ۚ;IZ)[I

    move-result-object v0

    move-object/from16 v29, v0

    goto :goto_1f

    :cond_2f
    const-string v3, "StackMapTable"

    .line 1937
    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_30

    .line 1938
    iget v1, v9, Ll/ۡ᩶ۚ;->֨:I

    and-int/lit8 v1, v1, 0x4

    if-nez v1, :cond_31

    add-int/lit8 v21, v0, 0x8

    add-int v19, v2, v26

    goto :goto_1d

    :cond_30
    const-string v3, "StackMap"

    .line 1951
    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_32

    .line 1952
    iget v1, v9, Ll/ۡ᩶ۚ;->֨:I

    and-int/lit8 v1, v1, 0x4

    if-nez v1, :cond_31

    add-int/lit8 v0, v0, 0x8

    add-int v1, v2, v26

    const/16 v23, 0x0

    goto :goto_1e

    :cond_31
    :goto_1d
    move/from16 v1, v19

    move/from16 v0, v21

    :goto_1e
    move/from16 v21, v0

    move/from16 v19, v1

    :goto_1f
    move/from16 v31, v2

    move/from16 v32, v10

    move-object/from16 v30, v11

    move-object/from16 p3, v13

    move-object/from16 v2, p1

    move-object/from16 p1, v4

    move v10, v7

    move-object/from16 v43, v29

    move-object/from16 v29, v5

    move-object/from16 v5, v43

    goto :goto_20

    .line 1962
    :cond_32
    iget-object v3, v9, Ll/ۡ᩶ۚ;->֫:[Ll/ܽ᩶ۚ;

    move-object/from16 v0, p0

    move-object/from16 v30, v1

    move-object v1, v3

    move-object/from16 v3, p1

    move/from16 v31, v2

    move-object/from16 v2, v30

    move-object/from16 v30, v11

    move-object v11, v3

    move/from16 v3, v31

    move-object/from16 p1, v4

    move/from16 v4, v26

    move-object/from16 v38, v29

    move-object/from16 v29, v5

    move-object v5, v13

    move-object/from16 p3, v13

    move-object v13, v6

    move v6, v10

    move/from16 v32, v10

    move v10, v7

    move-object/from16 v7, p1

    .line 1963
    invoke-direct/range {v0 .. v7}, Ll/ܿ᩶ۚ;->֫([Ll/ܽ᩶ۚ;Ljava/lang/String;II[CI[Ll/֨᩶ۚ;)Ll/ܽ᩶ۚ;

    move-result-object v0

    .line 1971
    iput-object v11, v0, Ll/ܽ᩶ۚ;->ۧ:Ll/ܽ᩶ۚ;

    move-object v2, v0

    move-object v6, v13

    move-object/from16 v5, v38

    :goto_20
    add-int v0, v31, v26

    move-object/from16 v4, p1

    move-object/from16 v13, p3

    move v7, v10

    move/from16 v1, v25

    move-object/from16 v3, v27

    move-object/from16 p3, v29

    move-object/from16 v11, v30

    move/from16 v10, v32

    goto/16 :goto_16

    :cond_33
    move-object v11, v2

    move-object/from16 v27, v3

    move-object/from16 p1, v4

    move-object/from16 v38, v5

    move v10, v7

    move-object/from16 p3, v13

    move-object v13, v6

    .line 1979
    iget v1, v9, Ll/ۡ᩶ۚ;->֨:I

    and-int/lit8 v1, v1, 0x8

    if-eqz v1, :cond_34

    const/4 v1, 0x1

    goto :goto_21

    :cond_34
    const/4 v1, 0x0

    :goto_21
    const/4 v2, -0x1

    if-eqz v21, :cond_42

    .line 1984
    iput v2, v9, Ll/ۡ᩶ۚ;->ܳ:I

    const/4 v2, 0x0

    .line 1985
    iput v2, v9, Ll/ۡ᩶ۚ;->᩷:I

    .line 1986
    iput v2, v9, Ll/ۡ᩶ۚ;->ܽ:I

    .line 1987
    iput v2, v9, Ll/ۡ᩶ۚ;->ᩳ:I

    .line 1988
    new-array v3, v15, [Ljava/lang/Object;

    iput-object v3, v9, Ll/ۡ᩶ۚ;->ܿ:[Ljava/lang/Object;

    .line 1989
    iput v2, v9, Ll/ۡ᩶ۚ;->᩻:I

    .line 1990
    new-array v2, v14, [Ljava/lang/Object;

    iput-object v2, v9, Ll/ۡ᩶ۚ;->ۜ:[Ljava/lang/Object;

    if-eqz v1, :cond_40

    .line 3211
    iget-object v2, v9, Ll/ۡ᩶ۚ;->ۘ:Ljava/lang/String;

    .line 3214
    iget v5, v9, Ll/ۡ᩶ۚ;->ۖ:I

    and-int/lit8 v5, v5, 0x8

    if-nez v5, :cond_36

    const-string v5, "<init>"

    .line 3215
    iget-object v6, v9, Ll/ۡ᩶ۚ;->᩵:Ljava/lang/String;

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_35

    const/4 v5, 0x6

    .line 3216
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    const/4 v6, 0x0

    aput-object v5, v3, v6

    goto :goto_22

    .line 3218
    :cond_35
    iget v5, v8, Ll/ܿ᩶ۚ;->ܳ:I

    add-int/lit8 v5, v5, 0x2

    const/4 v6, 0x0

    iget-object v7, v9, Ll/ۡ᩶ۚ;->ۧ:[C

    .line 3771
    invoke-direct {v8, v7, v5}, Ll/ܿ᩶ۚ;->ᩳ([CI)Ljava/lang/String;

    move-result-object v5

    .line 3218
    aput-object v5, v3, v6

    :goto_22
    const/4 v5, 0x1

    goto :goto_23

    :cond_36
    const/4 v5, 0x0

    :goto_23
    const/4 v6, 0x1

    :goto_24
    add-int/lit8 v7, v6, 0x1

    .line 3226
    invoke-virtual {v2, v6}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/16 v4, 0x46

    if-eq v0, v4, :cond_3f

    const/16 v4, 0x4c

    if-eq v0, v4, :cond_3d

    const/16 v4, 0x53

    if-eq v0, v4, :cond_3c

    const/16 v4, 0x49

    if-eq v0, v4, :cond_3c

    const/16 v4, 0x4a

    if-eq v0, v4, :cond_3b

    const/16 v4, 0x5a

    if-eq v0, v4, :cond_3a

    const/16 v4, 0x5b

    if-eq v0, v4, :cond_37

    packed-switch v0, :pswitch_data_3

    .line 3266
    iput v5, v9, Ll/ۡ᩶ۚ;->ܽ:I

    goto/16 :goto_2a

    :pswitch_b
    add-int/lit8 v0, v5, 0x1

    const/16 v26, 0x3

    .line 3241
    invoke-static/range {v26 .. v26}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v3, v5

    goto/16 :goto_29

    :cond_37
    const/16 v26, 0x3

    .line 3244
    :goto_25
    invoke-virtual {v2, v7}, Ljava/lang/String;->charAt(I)C

    move-result v0

    if-ne v0, v4, :cond_38

    add-int/lit8 v7, v7, 0x1

    goto :goto_25

    .line 3247
    :cond_38
    invoke-virtual {v2, v7}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/16 v4, 0x4c

    if-ne v0, v4, :cond_39

    :goto_26
    add-int/lit8 v7, v7, 0x1

    .line 3249
    invoke-virtual {v2, v7}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/16 v4, 0x3b

    if-eq v0, v4, :cond_39

    goto :goto_26

    :cond_39
    add-int/lit8 v0, v5, 0x1

    add-int/lit8 v7, v7, 0x1

    .line 3254
    invoke-virtual {v2, v6, v7}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v4

    aput-object v4, v3, v5

    goto :goto_29

    :cond_3a
    :pswitch_c
    const/16 v26, 0x3

    const/4 v4, 0x4

    goto :goto_27

    :cond_3b
    const/16 v26, 0x3

    add-int/lit8 v0, v5, 0x1

    const/4 v4, 0x4

    .line 3238
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v3, v5

    goto :goto_29

    :cond_3c
    const/4 v4, 0x4

    const/16 v26, 0x3

    :goto_27
    add-int/lit8 v0, v5, 0x1

    const/4 v6, 0x1

    .line 3232
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v3, v5

    goto :goto_29

    :cond_3d
    const/4 v4, 0x4

    const/16 v26, 0x3

    move v0, v7

    .line 3258
    :goto_28
    invoke-virtual {v2, v0}, Ljava/lang/String;->charAt(I)C

    move-result v6

    const/16 v4, 0x3b

    if-eq v6, v4, :cond_3e

    add-int/lit8 v0, v0, 0x1

    const/4 v4, 0x4

    goto :goto_28

    :cond_3e
    add-int/lit8 v4, v5, 0x1

    add-int/lit8 v6, v0, 0x1

    .line 3262
    invoke-virtual {v2, v7, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    aput-object v0, v3, v5

    move v5, v4

    goto/16 :goto_24

    :cond_3f
    const/16 v26, 0x3

    add-int/lit8 v0, v5, 0x1

    .line 3235
    invoke-static/range {v28 .. v28}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v3, v5

    :goto_29
    move v5, v0

    move v6, v7

    goto/16 :goto_24

    :cond_40
    :goto_2a
    move/from16 v0, v21

    :goto_2b
    add-int/lit8 v2, v19, -0x2

    if-ge v0, v2, :cond_42

    .line 2002
    aget-byte v2, v18, v0

    const/16 v3, 0x8

    if-ne v2, v3, :cond_41

    add-int/lit8 v2, v0, 0x1

    .line 2003
    invoke-virtual {v8, v2}, Ll/ܿ᩶ۚ;->ܿ(I)I

    move-result v2

    if-ltz v2, :cond_41

    if-ge v2, v10, :cond_41

    add-int v3, v24, v2

    .line 2004
    aget-byte v3, v18, v3

    and-int/lit16 v3, v3, 0xff

    const/16 v4, 0xbb

    if-ne v3, v4, :cond_41

    move-object/from16 v3, p1

    .line 2008
    invoke-static {v2, v3}, Ll/ܿ᩶ۚ;->֫(I[Ll/֨᩶ۚ;)Ll/֨᩶ۚ;

    goto :goto_2c

    :cond_41
    move-object/from16 v3, p1

    :goto_2c
    add-int/lit8 v0, v0, 0x1

    move-object/from16 p1, v3

    goto :goto_2b

    :cond_42
    move-object/from16 v3, p1

    if-eqz v1, :cond_43

    .line 2013
    iget v0, v9, Ll/ۡ᩶ۚ;->֨:I

    and-int/lit16 v0, v0, 0x100

    if-eqz v0, :cond_43

    const/16 v35, 0x0

    const/16 v37, 0x0

    const/16 v33, -0x1

    const/16 v36, 0x0

    move-object/from16 v32, v12

    move/from16 v34, v15

    .line 2020
    invoke-virtual/range {v32 .. v37}, Ll/ܶ᩶ۚ;->֫(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    :cond_43
    const/4 v0, 0x0

    .line 2031
    invoke-direct {v8, v0, v13}, Ll/ܿ᩶ۚ;->֫(I[I)I

    move-result v2

    move-object/from16 v5, v38

    .line 2037
    invoke-direct {v8, v0, v5}, Ll/ܿ᩶ۚ;->֫(I[I)I

    move-result v0

    .line 2046
    iget v4, v9, Ll/ۡ᩶ۚ;->֨:I

    and-int/lit16 v4, v4, 0x100

    if-nez v4, :cond_44

    const/16 v4, 0x21

    goto :goto_2d

    :cond_44
    const/4 v4, 0x0

    :goto_2d
    const/4 v6, 0x0

    const/4 v7, 0x0

    const/16 v25, 0x0

    move/from16 p1, v0

    move v6, v4

    move-object/from16 p2, v11

    move-object v4, v12

    move v12, v14

    move v11, v15

    move/from16 v7, v17

    move/from16 v0, v19

    const/16 v17, 0x0

    move-object v15, v8

    move-object v14, v13

    move/from16 v19, v16

    move-object/from16 v13, p3

    move/from16 p3, v2

    move/from16 v16, v10

    move/from16 v2, v20

    const/4 v10, 0x0

    move-object/from16 v20, v5

    move-object v5, v3

    move/from16 v3, v22

    move-object/from16 v22, v15

    move/from16 v8, v24

    :goto_2e
    if-ge v8, v7, :cond_6b

    sub-int v15, v8, v24

    move/from16 v26, v7

    .line 2054
    aget-object v7, v5, v15

    move/from16 v28, v10

    if-eqz v7, :cond_46

    .line 2056
    iget v10, v9, Ll/ۡ᩶ۚ;->֨:I

    and-int/lit8 v10, v10, 0x2

    if-nez v10, :cond_45

    const/4 v10, 0x1

    goto :goto_2f

    :cond_45
    const/4 v10, 0x0

    :goto_2f
    invoke-virtual {v7, v4, v10}, Ll/֨᩶ۚ;->֫(Ll/ܶ᩶ۚ;Z)V

    :cond_46
    move/from16 v7, v21

    move/from16 v10, v28

    :goto_30
    if-eqz v7, :cond_59

    move/from16 v21, v11

    .line 2060
    iget v11, v9, Ll/ۡ᩶ۚ;->ܳ:I

    move/from16 v28, v12

    const/4 v12, -0x1

    if-eq v11, v15, :cond_48

    if-ne v11, v12, :cond_47

    goto :goto_31

    :cond_47
    move/from16 v34, v0

    move-object/from16 v41, v14

    move-object/from16 v42, v20

    move/from16 v39, v21

    move/from16 v40, v28

    move/from16 v21, v2

    move-object v2, v13

    goto/16 :goto_3e

    :cond_48
    :goto_31
    if-eq v11, v12, :cond_4b

    if-eqz v23, :cond_4a

    if-eqz v1, :cond_49

    goto :goto_32

    .line 2074
    :cond_49
    iget v11, v9, Ll/ۡ᩶ۚ;->᩷:I

    iget v12, v9, Ll/ۡ᩶ۚ;->ᩳ:I

    iget-object v10, v9, Ll/ۡ᩶ۚ;->ܿ:[Ljava/lang/Object;

    move-object/from16 v29, v13

    iget v13, v9, Ll/ۡ᩶ۚ;->᩻:I

    move/from16 v30, v15

    iget-object v15, v9, Ll/ۡ᩶ۚ;->ۜ:[Ljava/lang/Object;

    move-object/from16 v31, v10

    move-object v10, v4

    move/from16 v39, v21

    move/from16 v40, v28

    move/from16 v21, v2

    move-object/from16 v2, v29

    move-object/from16 v41, v14

    move-object/from16 v14, v31

    move-object/from16 v42, v20

    move/from16 v20, v30

    invoke-virtual/range {v10 .. v15}, Ll/ܶ᩶ۚ;->֫(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    goto :goto_33

    :cond_4a
    :goto_32
    move-object/from16 v41, v14

    move-object/from16 v42, v20

    move/from16 v39, v21

    move/from16 v40, v28

    move/from16 v21, v2

    move-object v2, v13

    move/from16 v20, v15

    .line 2067
    iget v12, v9, Ll/ۡ᩶ۚ;->ܽ:I

    iget-object v14, v9, Ll/ۡ᩶ۚ;->ܿ:[Ljava/lang/Object;

    iget v13, v9, Ll/ۡ᩶ۚ;->᩻:I

    iget-object v15, v9, Ll/ۡ᩶ۚ;->ۜ:[Ljava/lang/Object;

    const/4 v11, -0x1

    move-object v10, v4

    invoke-virtual/range {v10 .. v15}, Ll/ܶ᩶ۚ;->֫(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    :goto_33
    const/4 v10, 0x0

    goto :goto_34

    :cond_4b
    move-object/from16 v41, v14

    move-object/from16 v42, v20

    move/from16 v39, v21

    move/from16 v40, v28

    move/from16 v21, v2

    move-object v2, v13

    move/from16 v20, v15

    :goto_34
    if-ge v7, v0, :cond_58

    .line 3292
    iget-object v11, v9, Ll/ۡ᩶ۚ;->ۧ:[C

    .line 3293
    iget-object v12, v9, Ll/ۡ᩶ۚ;->ᩴ:[Ll/֨᩶ۚ;

    if-eqz v23, :cond_4c

    add-int/lit8 v13, v7, 0x1

    .line 3297
    aget-byte v7, v18, v7

    and-int/lit16 v7, v7, 0xff

    goto :goto_35

    :cond_4c
    const/4 v13, -0x1

    .line 3300
    iput v13, v9, Ll/ۡ᩶ۚ;->ܳ:I

    const/16 v13, 0xff

    move v13, v7

    const/16 v7, 0xff

    :goto_35
    const/4 v14, 0x0

    .line 3303
    iput v14, v9, Ll/ۡ᩶ۚ;->ᩳ:I

    const/16 v14, 0x40

    if-ge v7, v14, :cond_4d

    const/4 v11, 0x3

    .line 3306
    iput v11, v9, Ll/ۡ᩶ۚ;->᩷:I

    const/4 v11, 0x0

    .line 3307
    iput v11, v9, Ll/ۡ᩶ۚ;->᩻:I

    move/from16 v34, v0

    move/from16 v35, v10

    :goto_36
    move-object/from16 v15, v22

    goto/16 :goto_3d

    :cond_4d
    const/16 v14, 0x80

    if-ge v7, v14, :cond_4e

    add-int/lit8 v7, v7, -0x40

    .line 3310
    iget-object v14, v9, Ll/ۡ᩶ۚ;->ۜ:[Ljava/lang/Object;

    const/16 v31, 0x0

    move-object/from16 v28, v22

    move/from16 v29, v13

    move-object/from16 v30, v14

    move-object/from16 v32, v11

    move-object/from16 v33, v12

    .line 3311
    invoke-direct/range {v28 .. v33}, Ll/ܿ᩶ۚ;->֫(I[Ljava/lang/Object;I[C[Ll/֨᩶ۚ;)I

    move-result v11

    const/4 v13, 0x4

    .line 3313
    iput v13, v9, Ll/ۡ᩶ۚ;->᩷:I

    const/4 v13, 0x1

    .line 3314
    iput v13, v9, Ll/ۡ᩶ۚ;->᩻:I

    move/from16 v34, v0

    move/from16 v35, v10

    move v13, v11

    goto :goto_36

    :cond_4e
    const/16 v14, 0xf7

    if-lt v7, v14, :cond_57

    move-object/from16 v15, v22

    .line 3316
    invoke-virtual {v15, v13}, Ll/ܿ᩶ۚ;->ܿ(I)I

    move-result v22

    move/from16 v34, v0

    add-int/lit8 v0, v13, 0x2

    if-ne v7, v14, :cond_4f

    .line 3319
    iget-object v7, v9, Ll/ۡ᩶ۚ;->ۜ:[Ljava/lang/Object;

    const/16 v31, 0x0

    const/4 v13, 0x4

    move-object/from16 v28, v15

    move/from16 v29, v0

    move-object/from16 v30, v7

    move-object/from16 v32, v11

    move-object/from16 v33, v12

    .line 3320
    invoke-direct/range {v28 .. v33}, Ll/ܿ᩶ۚ;->֫(I[Ljava/lang/Object;I[C[Ll/֨᩶ۚ;)I

    move-result v0

    .line 3322
    iput v13, v9, Ll/ۡ᩶ۚ;->᩷:I

    const/4 v7, 0x1

    .line 3323
    iput v7, v9, Ll/ۡ᩶ۚ;->᩻:I

    move/from16 v35, v10

    goto/16 :goto_3c

    :cond_4f
    const/16 v14, 0xf8

    move/from16 v35, v10

    const/16 v10, 0xfb

    if-lt v7, v14, :cond_50

    if-ge v7, v10, :cond_50

    const/4 v10, 0x2

    .line 3325
    iput v10, v9, Ll/ۡ᩶ۚ;->᩷:I

    rsub-int v7, v7, 0xfb

    .line 3326
    iput v7, v9, Ll/ۡ᩶ۚ;->ᩳ:I

    .line 3327
    iget v10, v9, Ll/ۡ᩶ۚ;->ܽ:I

    sub-int/2addr v10, v7

    iput v10, v9, Ll/ۡ᩶ۚ;->ܽ:I

    const/4 v7, 0x0

    .line 3328
    iput v7, v9, Ll/ۡ᩶ۚ;->᩻:I

    goto/16 :goto_3c

    :cond_50
    const/4 v14, 0x0

    if-ne v7, v10, :cond_51

    const/4 v7, 0x3

    .line 3330
    iput v7, v9, Ll/ۡ᩶ۚ;->᩷:I

    .line 3331
    iput v14, v9, Ll/ۡ᩶ۚ;->᩻:I

    goto/16 :goto_3c

    :cond_51
    const/16 v10, 0xff

    if-ge v7, v10, :cond_54

    if-eqz v1, :cond_52

    .line 3333
    iget v10, v9, Ll/ۡ᩶ۚ;->ܽ:I

    goto :goto_37

    :cond_52
    const/4 v10, 0x0

    :goto_37
    add-int/lit16 v7, v7, -0xfb

    move/from16 v29, v0

    move v0, v7

    move/from16 v31, v10

    :goto_38
    if-lez v0, :cond_53

    .line 3335
    iget-object v10, v9, Ll/ۡ᩶ۚ;->ܿ:[Ljava/lang/Object;

    add-int/lit8 v13, v31, 0x1

    move-object/from16 v28, v15

    move-object/from16 v30, v10

    move-object/from16 v32, v11

    move-object/from16 v33, v12

    .line 3336
    invoke-direct/range {v28 .. v33}, Ll/ܿ᩶ۚ;->֫(I[Ljava/lang/Object;I[C[Ll/֨᩶ۚ;)I

    move-result v29

    add-int/lit8 v0, v0, -0x1

    move/from16 v31, v13

    goto :goto_38

    :cond_53
    const/4 v0, 0x1

    .line 3339
    iput v0, v9, Ll/ۡ᩶ۚ;->᩷:I

    .line 3340
    iput v7, v9, Ll/ۡ᩶ۚ;->ᩳ:I

    .line 3341
    iget v0, v9, Ll/ۡ᩶ۚ;->ܽ:I

    add-int/2addr v0, v7

    iput v0, v9, Ll/ۡ᩶ۚ;->ܽ:I

    const/4 v0, 0x0

    .line 3342
    iput v0, v9, Ll/ۡ᩶ۚ;->᩻:I

    goto :goto_3b

    :cond_54
    const/4 v7, 0x0

    .line 3344
    invoke-virtual {v15, v0}, Ll/ܿ᩶ۚ;->ܿ(I)I

    move-result v0

    add-int/lit8 v13, v13, 0x4

    .line 3346
    iput v7, v9, Ll/ۡ᩶ۚ;->᩷:I

    .line 3347
    iput v0, v9, Ll/ۡ᩶ۚ;->ᩳ:I

    .line 3348
    iput v0, v9, Ll/ۡ᩶ۚ;->ܽ:I

    :goto_39
    if-ge v7, v0, :cond_55

    .line 3350
    iget-object v10, v9, Ll/ۡ᩶ۚ;->ܿ:[Ljava/lang/Object;

    move-object/from16 v28, v15

    move/from16 v29, v13

    move-object/from16 v30, v10

    move/from16 v31, v7

    move-object/from16 v32, v11

    move-object/from16 v33, v12

    .line 3351
    invoke-direct/range {v28 .. v33}, Ll/ܿ᩶ۚ;->֫(I[Ljava/lang/Object;I[C[Ll/֨᩶ۚ;)I

    move-result v13

    add-int/lit8 v7, v7, 0x1

    goto :goto_39

    .line 3354
    :cond_55
    invoke-virtual {v15, v13}, Ll/ܿ᩶ۚ;->ܿ(I)I

    move-result v0

    add-int/lit8 v13, v13, 0x2

    .line 3356
    iput v0, v9, Ll/ۡ᩶ۚ;->᩻:I

    const/4 v7, 0x0

    move/from16 v29, v13

    :goto_3a
    if-ge v7, v0, :cond_56

    .line 3358
    iget-object v10, v9, Ll/ۡ᩶ۚ;->ۜ:[Ljava/lang/Object;

    move-object/from16 v28, v15

    move-object/from16 v30, v10

    move/from16 v31, v7

    move-object/from16 v32, v11

    move-object/from16 v33, v12

    .line 3359
    invoke-direct/range {v28 .. v33}, Ll/ܿ᩶ۚ;->֫(I[Ljava/lang/Object;I[C[Ll/֨᩶ۚ;)I

    move-result v29

    add-int/lit8 v7, v7, 0x1

    goto :goto_3a

    :cond_56
    :goto_3b
    move/from16 v0, v29

    :goto_3c
    move v13, v0

    move/from16 v7, v22

    .line 3366
    :goto_3d
    iget v0, v9, Ll/ۡ᩶ۚ;->ܳ:I

    add-int/lit8 v7, v7, 0x1

    add-int/2addr v7, v0

    iput v7, v9, Ll/ۡ᩶ۚ;->ܳ:I

    .line 3367
    invoke-static {v7, v12}, Ll/ܿ᩶ۚ;->֫(I[Ll/֨᩶ۚ;)Ll/֨᩶ۚ;

    move v7, v13

    move-object/from16 v22, v15

    move/from16 v15, v20

    move/from16 v0, v34

    move/from16 v10, v35

    move/from16 v11, v39

    move/from16 v12, v40

    move-object/from16 v14, v41

    move-object/from16 v20, v42

    move-object v13, v2

    move/from16 v2, v21

    goto/16 :goto_30

    .line 3364
    :cond_57
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v0

    :cond_58
    move/from16 v34, v0

    move/from16 v35, v10

    move-object/from16 v15, v22

    const/4 v7, 0x0

    move-object v13, v2

    move/from16 v15, v20

    move/from16 v2, v21

    move/from16 v11, v39

    move/from16 v12, v40

    move-object/from16 v14, v41

    move-object/from16 v20, v42

    goto/16 :goto_30

    :cond_59
    move/from16 v34, v0

    move/from16 v21, v2

    move/from16 v39, v11

    move/from16 v40, v12

    move-object v2, v13

    move-object/from16 v41, v14

    move-object/from16 v42, v20

    :goto_3e
    move/from16 v20, v15

    move-object/from16 v15, v22

    if-eqz v10, :cond_5b

    .line 2096
    iget v0, v9, Ll/ۡ᩶ۚ;->֨:I

    and-int/lit8 v0, v0, 0x8

    if-eqz v0, :cond_5a

    const/4 v13, 0x0

    const/4 v0, 0x0

    const/16 v11, 0x100

    const/4 v12, 0x0

    const/4 v14, 0x0

    move-object v10, v4

    move/from16 v22, v1

    move-object v1, v15

    move-object v15, v0

    .line 2097
    invoke-virtual/range {v10 .. v15}, Ll/ܶ᩶ۚ;->֫(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    goto :goto_3f

    :cond_5a
    move/from16 v22, v1

    move-object v1, v15

    :goto_3f
    const/4 v10, 0x0

    const/4 v0, 0x0

    goto :goto_40

    :cond_5b
    move/from16 v22, v1

    move-object v1, v15

    move v0, v10

    .line 2103
    :goto_40
    aget-byte v10, v18, v8

    and-int/lit16 v15, v10, 0xff

    const/16 v10, 0xc8

    packed-switch v15, :pswitch_data_4

    .line 2496
    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    :pswitch_d
    add-int/lit8 v0, v8, 0x1

    .line 2343
    invoke-virtual {v1, v0}, Ll/ܿ᩶ۚ;->ۧ(I)I

    move-result v0

    add-int v0, v0, v20

    aget-object v0, v5, v0

    .line 2342
    invoke-virtual {v4, v10, v0}, Ll/ܶ᩶ۚ;->֫(ILl/֨᩶ۚ;)V

    add-int/lit8 v8, v8, 0x5

    const/4 v0, 0x1

    goto :goto_46

    :pswitch_e
    const/16 v10, 0xda

    if-ge v15, v10, :cond_5c

    add-int/lit8 v15, v15, -0x31

    goto :goto_41

    :cond_5c
    add-int/lit8 v15, v15, -0x14

    :goto_41
    add-int/lit8 v10, v8, 0x1

    .line 2321
    invoke-virtual {v1, v10}, Ll/ܿ᩶ۚ;->ܿ(I)I

    move-result v10

    add-int v10, v10, v20

    aget-object v10, v5, v10

    const/16 v11, 0xa7

    if-eq v15, v11, :cond_5f

    const/16 v11, 0xa8

    if-ne v15, v11, :cond_5d

    goto :goto_43

    :cond_5d
    const/16 v0, 0xa7

    if-ge v15, v0, :cond_5e

    add-int/lit8 v15, v15, 0x1

    xor-int/lit8 v0, v15, 0x1

    add-int/lit8 v0, v0, -0x1

    goto :goto_42

    :cond_5e
    xor-int/lit8 v0, v15, 0x1

    :goto_42
    add-int/lit8 v15, v20, 0x3

    .line 2330
    invoke-static {v15, v5}, Ll/ܿ᩶ۚ;->֫(I[Ll/֨᩶ۚ;)Ll/֨᩶ۚ;

    move-result-object v11

    .line 2331
    invoke-virtual {v4, v0, v11}, Ll/ܶ᩶ۚ;->֫(ILl/֨᩶ۚ;)V

    const/16 v0, 0xc8

    .line 2332
    invoke-virtual {v4, v0, v10}, Ll/ܶ᩶ۚ;->֫(ILl/֨᩶ۚ;)V

    const/4 v0, 0x1

    goto :goto_44

    :cond_5f
    :goto_43
    add-int/lit8 v15, v15, 0x21

    .line 2324
    invoke-virtual {v4, v15, v10}, Ll/ܶ᩶ۚ;->֫(ILl/֨᩶ۚ;)V

    :goto_44
    add-int/lit8 v8, v8, 0x3

    goto :goto_46

    :pswitch_f
    sub-int/2addr v15, v6

    add-int/lit8 v10, v8, 0x1

    .line 2289
    invoke-virtual {v1, v10}, Ll/ܿ᩶ۚ;->ۧ(I)I

    move-result v10

    add-int v10, v10, v20

    aget-object v10, v5, v10

    .line 2287
    invoke-virtual {v4, v15, v10}, Ll/ܶ᩶ۚ;->֫(ILl/֨᩶ۚ;)V

    add-int/lit8 v8, v8, 0x5

    goto :goto_46

    :pswitch_10
    add-int/lit8 v10, v8, 0x1

    .line 3771
    invoke-direct {v1, v2, v10}, Ll/ܿ᩶ۚ;->ᩳ([CI)Ljava/lang/String;

    move-result-object v10

    add-int/lit8 v11, v8, 0x3

    .line 2492
    aget-byte v11, v18, v11

    and-int/lit16 v11, v11, 0xff

    .line 2491
    invoke-virtual {v4, v11, v10}, Ll/ܶ᩶ۚ;->֫(ILjava/lang/String;)V

    :goto_45
    add-int/lit8 v8, v8, 0x4

    :goto_46
    move/from16 v29, v6

    goto/16 :goto_4c

    :pswitch_11
    add-int/lit8 v10, v8, 0x1

    .line 2351
    aget-byte v10, v18, v10

    and-int/lit16 v10, v10, 0xff

    const/16 v11, 0x84

    if-ne v10, v11, :cond_60

    add-int/lit8 v10, v8, 0x2

    .line 2354
    invoke-virtual {v1, v10}, Ll/ܿ᩶ۚ;->ܿ(I)I

    move-result v10

    add-int/lit8 v11, v8, 0x4

    invoke-virtual {v1, v11}, Ll/ܿ᩶ۚ;->ᩳ(I)S

    move-result v11

    .line 2353
    invoke-virtual {v4, v10, v11}, Ll/ܶ᩶ۚ;->֫(II)V

    add-int/lit8 v8, v8, 0x6

    goto :goto_46

    :cond_60
    add-int/lit8 v11, v8, 0x2

    .line 2357
    invoke-virtual {v1, v11}, Ll/ܿ᩶ۚ;->ܿ(I)I

    move-result v11

    invoke-virtual {v4, v10, v11}, Ll/ܶ᩶ۚ;->ᩳ(II)V

    goto :goto_45

    :pswitch_12
    add-int/lit8 v10, v8, 0x1

    .line 3771
    invoke-direct {v1, v2, v10}, Ll/ܿ᩶ۚ;->ᩳ([CI)Ljava/lang/String;

    move-result-object v10

    .line 2482
    invoke-virtual {v4, v15, v10}, Ll/ܶ᩶ۚ;->ܽ(ILjava/lang/String;)V

    goto :goto_44

    :pswitch_13
    add-int/lit8 v10, v8, 0x1

    .line 2458
    invoke-virtual {v1, v10}, Ll/ܿ᩶ۚ;->ܿ(I)I

    move-result v10

    aget v10, v27, v10

    add-int/lit8 v11, v10, 0x2

    .line 2459
    invoke-virtual {v1, v11}, Ll/ܿ᩶ۚ;->ܿ(I)I

    move-result v11

    aget v11, v27, v11

    .line 2460
    invoke-virtual {v1, v2, v11}, Ll/ܿ᩶ۚ;->ۧ([CI)Ljava/lang/String;

    move-result-object v12

    add-int/lit8 v11, v11, 0x2

    .line 2461
    invoke-virtual {v1, v2, v11}, Ll/ܿ᩶ۚ;->ۧ([CI)Ljava/lang/String;

    move-result-object v11

    .line 2462
    iget-object v13, v1, Ll/ܿ᩶ۚ;->֫:[I

    invoke-virtual {v1, v10}, Ll/ܿ᩶ۚ;->ܿ(I)I

    move-result v10

    aget v10, v13, v10

    .line 2464
    invoke-virtual {v1, v10}, Ll/ܿ᩶ۚ;->ܿ(I)I

    move-result v13

    invoke-virtual {v1, v2, v13}, Ll/ܿ᩶ۚ;->֫([CI)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ll/֡᩶ۚ;

    add-int/lit8 v14, v10, 0x2

    .line 2466
    invoke-virtual {v1, v14}, Ll/ܿ᩶ۚ;->ܿ(I)I

    move-result v14

    new-array v15, v14, [Ljava/lang/Object;

    add-int/lit8 v10, v10, 0x4

    const/16 v28, 0x0

    move/from16 v28, v0

    const/4 v0, 0x0

    :goto_47
    if-ge v0, v14, :cond_61

    move/from16 v29, v6

    .line 2470
    invoke-virtual {v1, v10}, Ll/ܿ᩶ۚ;->ܿ(I)I

    move-result v6

    invoke-virtual {v1, v2, v6}, Ll/ܿ᩶ۚ;->֫([CI)Ljava/lang/Object;

    move-result-object v6

    aput-object v6, v15, v0

    add-int/lit8 v10, v10, 0x2

    add-int/lit8 v0, v0, 0x1

    move/from16 v6, v29

    goto :goto_47

    :cond_61
    move/from16 v29, v6

    .line 2473
    invoke-virtual {v4, v12, v11, v13, v15}, Ll/ܶ᩶ۚ;->֫(Ljava/lang/String;Ljava/lang/String;Ll/֡᩶ۚ;[Ljava/lang/Object;)V

    goto :goto_4a

    :pswitch_14
    move/from16 v28, v0

    move/from16 v29, v6

    add-int/lit8 v0, v8, 0x1

    .line 2437
    invoke-virtual {v1, v0}, Ll/ܿ᩶ۚ;->ܿ(I)I

    move-result v0

    aget v0, v27, v0

    add-int/lit8 v6, v0, 0x2

    .line 2438
    invoke-virtual {v1, v6}, Ll/ܿ᩶ۚ;->ܿ(I)I

    move-result v6

    aget v6, v27, v6

    .line 3771
    invoke-direct {v1, v2, v0}, Ll/ܿ᩶ۚ;->ᩳ([CI)Ljava/lang/String;

    move-result-object v12

    .line 2440
    invoke-virtual {v1, v2, v6}, Ll/ܿ᩶ۚ;->ۧ([CI)Ljava/lang/String;

    move-result-object v13

    add-int/lit8 v6, v6, 0x2

    .line 2441
    invoke-virtual {v1, v2, v6}, Ll/ܿ᩶ۚ;->ۧ([CI)Ljava/lang/String;

    move-result-object v14

    const/16 v6, 0xb6

    if-ge v15, v6, :cond_62

    .line 2443
    invoke-virtual {v4, v12, v15, v13, v14}, Ll/ܶ᩶ۚ;->֫(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    move v6, v15

    goto :goto_49

    :cond_62
    add-int/lit8 v0, v0, -0x1

    .line 2445
    aget-byte v0, v18, v0

    const/16 v6, 0xb

    if-ne v0, v6, :cond_63

    const/4 v0, 0x1

    goto :goto_48

    :cond_63
    const/4 v0, 0x0

    :goto_48
    move-object v10, v4

    move v11, v15

    move v6, v15

    move v15, v0

    .line 2447
    invoke-virtual/range {v10 .. v15}, Ll/ܶ᩶ۚ;->֫(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    :goto_49
    const/16 v0, 0xb9

    if-ne v6, v0, :cond_64

    :goto_4a
    add-int/lit8 v8, v8, 0x5

    goto :goto_4b

    :cond_64
    add-int/lit8 v8, v8, 0x3

    :goto_4b
    move/from16 v0, v28

    :goto_4c
    move v10, v0

    move-object v0, v1

    move-object v13, v2

    move/from16 v2, v17

    move/from16 v15, v20

    move/from16 v6, v29

    move/from16 v11, v39

    move/from16 v12, v40

    move-object/from16 v14, v41

    move-object/from16 v20, v0

    move/from16 v17, v7

    move/from16 v7, v26

    move/from16 v1, p3

    move/from16 p3, v3

    goto/16 :goto_54

    :pswitch_15
    move/from16 v28, v0

    move/from16 v29, v6

    and-int/lit8 v0, v20, 0x3

    rsub-int/lit8 v0, v0, 0x4

    add-int/2addr v0, v8

    .line 2383
    invoke-virtual {v1, v0}, Ll/ܿ᩶ۚ;->ۧ(I)I

    move-result v6

    add-int v6, v6, v20

    aget-object v6, v5, v6

    add-int/lit8 v8, v0, 0x4

    .line 2384
    invoke-virtual {v1, v8}, Ll/ܿ᩶ۚ;->ۧ(I)I

    move-result v8

    add-int/lit8 v0, v0, 0x8

    .line 2386
    new-array v10, v8, [I

    .line 2387
    new-array v11, v8, [Ll/֨᩶ۚ;

    const/4 v12, 0x0

    :goto_4d
    if-ge v12, v8, :cond_65

    .line 2389
    invoke-virtual {v1, v0}, Ll/ܿ᩶ۚ;->ۧ(I)I

    move-result v13

    aput v13, v10, v12

    add-int/lit8 v13, v0, 0x4

    .line 2390
    invoke-virtual {v1, v13}, Ll/ܿ᩶ۚ;->ۧ(I)I

    move-result v13

    add-int v13, v13, v20

    aget-object v13, v5, v13

    aput-object v13, v11, v12

    add-int/lit8 v0, v0, 0x8

    add-int/lit8 v12, v12, 0x1

    goto :goto_4d

    .line 2393
    :cond_65
    invoke-virtual {v4, v6, v10, v11}, Ll/ܶ᩶ۚ;->֫(Ll/֨᩶ۚ;[I[Ll/֨᩶ۚ;)V

    goto/16 :goto_51

    :pswitch_16
    move/from16 v28, v0

    move/from16 v29, v6

    and-int/lit8 v0, v20, 0x3

    rsub-int/lit8 v0, v0, 0x4

    add-int/2addr v0, v8

    .line 2366
    invoke-virtual {v1, v0}, Ll/ܿ᩶ۚ;->ۧ(I)I

    move-result v6

    add-int v6, v6, v20

    aget-object v6, v5, v6

    add-int/lit8 v8, v0, 0x4

    .line 2367
    invoke-virtual {v1, v8}, Ll/ܿ᩶ۚ;->ۧ(I)I

    move-result v8

    add-int/lit8 v10, v0, 0x8

    .line 2368
    invoke-virtual {v1, v10}, Ll/ܿ᩶ۚ;->ۧ(I)I

    move-result v10

    add-int/lit8 v0, v0, 0xc

    sub-int v11, v10, v8

    add-int/lit8 v11, v11, 0x1

    .line 2370
    new-array v12, v11, [Ll/֨᩶ۚ;

    const/4 v13, 0x0

    :goto_4e
    if-ge v13, v11, :cond_66

    .line 2372
    invoke-virtual {v1, v0}, Ll/ܿ᩶ۚ;->ۧ(I)I

    move-result v14

    add-int v14, v14, v20

    aget-object v14, v5, v14

    aput-object v14, v12, v13

    add-int/lit8 v0, v0, 0x4

    add-int/lit8 v13, v13, 0x1

    goto :goto_4e

    .line 2375
    :cond_66
    invoke-virtual {v4, v8, v10, v6, v12}, Ll/ܶ᩶ۚ;->֫(IILl/֨᩶ۚ;[Ll/֨᩶ۚ;)V

    goto/16 :goto_51

    :pswitch_17
    move/from16 v28, v0

    move/from16 v29, v6

    move v6, v15

    add-int/lit8 v0, v8, 0x1

    .line 2282
    invoke-virtual {v1, v0}, Ll/ܿ᩶ۚ;->ᩳ(I)S

    move-result v0

    add-int v0, v0, v20

    aget-object v0, v5, v0

    .line 2281
    invoke-virtual {v4, v6, v0}, Ll/ܶ᩶ۚ;->֫(ILl/֨᩶ۚ;)V

    goto :goto_50

    :pswitch_18
    move/from16 v28, v0

    move/from16 v29, v6

    add-int/lit8 v0, v8, 0x1

    .line 2486
    aget-byte v0, v18, v0

    and-int/lit16 v0, v0, 0xff

    add-int/lit8 v6, v8, 0x2

    aget-byte v6, v18, v6

    invoke-virtual {v4, v0, v6}, Ll/ܶ᩶ۚ;->֫(II)V

    goto :goto_50

    :pswitch_19
    move/from16 v28, v0

    move/from16 v29, v6

    move v6, v15

    add-int/lit8 v15, v6, -0x3b

    shr-int/lit8 v0, v15, 0x2

    add-int/lit8 v0, v0, 0x36

    and-int/lit8 v6, v15, 0x3

    .line 2260
    invoke-virtual {v4, v0, v6}, Ll/ܶ᩶ۚ;->ᩳ(II)V

    goto :goto_4f

    :pswitch_1a
    move/from16 v28, v0

    move/from16 v29, v6

    move v6, v15

    add-int/lit8 v15, v6, -0x1a

    shr-int/lit8 v0, v15, 0x2

    add-int/lit8 v0, v0, 0x15

    and-int/lit8 v6, v15, 0x3

    .line 2236
    invoke-virtual {v4, v0, v6}, Ll/ܶ᩶ۚ;->ᩳ(II)V

    :goto_4f
    add-int/lit8 v0, v8, 0x1

    goto :goto_51

    :pswitch_1b
    move/from16 v28, v0

    move/from16 v29, v6

    move v6, v15

    add-int/lit8 v0, v8, 0x1

    .line 2407
    aget-byte v0, v18, v0

    and-int/lit16 v0, v0, 0xff

    invoke-virtual {v4, v6, v0}, Ll/ܶ᩶ۚ;->ᩳ(II)V

    add-int/lit8 v0, v8, 0x2

    goto :goto_51

    :pswitch_1c
    move/from16 v28, v0

    move/from16 v29, v6

    add-int/lit8 v0, v8, 0x1

    .line 2425
    invoke-virtual {v1, v0}, Ll/ܿ᩶ۚ;->ܿ(I)I

    move-result v0

    invoke-virtual {v1, v2, v0}, Ll/ܿ᩶ۚ;->֫([CI)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v4, v0}, Ll/ܶ᩶ۚ;->֫(Ljava/lang/Object;)V

    :goto_50
    add-int/lit8 v0, v8, 0x3

    :goto_51
    move v8, v0

    move-object v13, v2

    move/from16 v15, v20

    move/from16 v10, v28

    move/from16 v6, v29

    move/from16 v11, v39

    move/from16 v12, v40

    move-object/from16 v14, v41

    move-object/from16 v0, p2

    move-object v2, v1

    move/from16 v20, v19

    move-object/from16 v28, v27

    move-object/from16 v19, v18

    move/from16 v27, v25

    move/from16 v18, v7

    move/from16 v25, v24

    move/from16 v7, v26

    move-object/from16 v26, v5

    move/from16 v24, v23

    move-object v5, v4

    move/from16 v23, v22

    move/from16 v4, p3

    move/from16 v22, v21

    move-object/from16 v21, v2

    move/from16 v1, p1

    goto/16 :goto_57

    :pswitch_1d
    move/from16 v28, v0

    move/from16 v29, v6

    add-int/lit8 v0, v8, 0x1

    .line 2420
    aget-byte v0, v18, v0

    and-int/lit16 v0, v0, 0xff

    invoke-virtual {v1, v2, v0}, Ll/ܿ᩶ۚ;->֫([CI)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v4, v0}, Ll/ܶ᩶ۚ;->֫(Ljava/lang/Object;)V

    goto :goto_52

    :pswitch_1e
    move/from16 v28, v0

    move/from16 v29, v6

    move v6, v15

    add-int/lit8 v0, v8, 0x1

    .line 2416
    invoke-virtual {v1, v0}, Ll/ܿ᩶ۚ;->ᩳ(I)S

    move-result v0

    invoke-virtual {v4, v6, v0}, Ll/ܶ᩶ۚ;->ۧ(II)V

    add-int/lit8 v8, v8, 0x3

    goto :goto_53

    :pswitch_1f
    move/from16 v28, v0

    move/from16 v29, v6

    move v6, v15

    add-int/lit8 v0, v8, 0x1

    .line 2412
    aget-byte v0, v18, v0

    invoke-virtual {v4, v6, v0}, Ll/ܶ᩶ۚ;->ۧ(II)V

    :goto_52
    add-int/lit8 v8, v8, 0x2

    goto :goto_53

    :pswitch_20
    move/from16 v28, v0

    move/from16 v29, v6

    move v6, v15

    .line 2212
    invoke-virtual {v4, v6}, Ll/ܶ᩶ۚ;->֫(I)V

    add-int/lit8 v8, v8, 0x1

    :goto_53
    move-object v0, v1

    move-object v13, v2

    move/from16 v2, v17

    move/from16 v15, v20

    move/from16 v10, v28

    move/from16 v6, v29

    move/from16 v11, v39

    move/from16 v12, v40

    move-object/from16 v14, v41

    move/from16 v1, p3

    move-object/from16 v20, v0

    move/from16 p3, v3

    move/from16 v17, v7

    move/from16 v7, v26

    :goto_54
    move-object/from16 v3, v42

    move-object/from16 v43, p2

    move/from16 p2, p1

    move-object/from16 p1, v43

    :goto_55
    move-object/from16 v26, v5

    if-eqz v14, :cond_68

    .line 2500
    array-length v5, v14

    if-ge v2, v5, :cond_68

    if-gt v1, v15, :cond_68

    if-ne v1, v15, :cond_67

    .line 2505
    aget v1, v14, v2

    .line 2506
    invoke-direct {v0, v9, v1}, Ll/ܿ᩶ۚ;->֫(Ll/ۡ᩶ۚ;I)I

    move-result v1

    .line 2509
    invoke-virtual {v0, v13, v1}, Ll/ܿ᩶ۚ;->ۧ([CI)Ljava/lang/String;

    move-result-object v5

    add-int/lit8 v1, v1, 0x2

    move/from16 v28, v6

    .line 2512
    iget v6, v9, Ll/ۡ᩶ۚ;->֡:I

    move/from16 v29, v7

    iget-object v7, v9, Ll/ۡ᩶ۚ;->ۚ:Ll/᩺᩶ۚ;

    move/from16 v30, v8

    const/4 v8, 0x1

    .line 2513
    invoke-virtual {v4, v6, v7, v5, v8}, Ll/ܶ᩶ۚ;->֫(ILl/᩺᩶ۚ;Ljava/lang/String;Z)Ll/ܰ᩹ۚ;

    move-result-object v5

    .line 2512
    invoke-direct {v0, v5, v1, v8, v13}, Ll/ܿ᩶ۚ;->֫(Ll/ܰ᩹ۚ;IZ[C)I

    goto :goto_56

    :cond_67
    move/from16 v28, v6

    move/from16 v29, v7

    move/from16 v30, v8

    :goto_56
    add-int/lit8 v1, v2, 0x1

    .line 2523
    invoke-direct {v0, v1, v14}, Ll/ܿ᩶ۚ;->֫(I[I)I

    move-result v2

    move-object/from16 v42, v3

    move-object v5, v4

    move/from16 v6, v28

    move/from16 v7, v29

    move/from16 v8, v30

    move/from16 v3, p3

    move v4, v2

    move-object/from16 v28, v27

    move-object v2, v0

    move/from16 v27, v25

    move-object/from16 v0, p1

    move/from16 v25, v24

    move/from16 v24, v23

    move/from16 v23, v22

    move/from16 v22, v21

    move-object/from16 v21, v20

    move/from16 v20, v19

    move-object/from16 v19, v18

    move/from16 v18, v17

    move/from16 v17, v1

    move/from16 v1, p2

    :goto_57
    move-object/from16 p1, v0

    move/from16 p2, v1

    move-object v0, v2

    move/from16 p3, v3

    move v1, v4

    move-object v4, v5

    move/from16 v2, v17

    move/from16 v17, v18

    move-object/from16 v18, v19

    move/from16 v19, v20

    move-object/from16 v20, v21

    move/from16 v21, v22

    move/from16 v22, v23

    move/from16 v23, v24

    move/from16 v24, v25

    move-object/from16 v5, v26

    move/from16 v25, v27

    move-object/from16 v27, v28

    move-object/from16 v3, v42

    goto/16 :goto_55

    :cond_68
    move/from16 v28, v6

    move/from16 v29, v7

    move/from16 v30, v8

    move/from16 v5, p2

    move/from16 v6, v25

    :goto_58
    if-eqz v3, :cond_6a

    .line 2528
    array-length v7, v3

    if-ge v6, v7, :cond_6a

    if-gt v5, v15, :cond_6a

    if-ne v5, v15, :cond_69

    .line 2533
    aget v5, v3, v6

    .line 2534
    invoke-direct {v0, v9, v5}, Ll/ܿ᩶ۚ;->֫(Ll/ۡ᩶ۚ;I)I

    move-result v5

    .line 2537
    invoke-virtual {v0, v13, v5}, Ll/ܿ᩶ۚ;->ۧ([CI)Ljava/lang/String;

    move-result-object v7

    add-int/lit8 v5, v5, 0x2

    .line 2540
    iget v8, v9, Ll/ۡ᩶ۚ;->֡:I

    move/from16 v25, v1

    iget-object v1, v9, Ll/ۡ᩶ۚ;->ۚ:Ll/᩺᩶ۚ;

    move/from16 v31, v2

    const/4 v2, 0x0

    .line 2541
    invoke-virtual {v4, v8, v1, v7, v2}, Ll/ܶ᩶ۚ;->֫(ILl/᩺᩶ۚ;Ljava/lang/String;Z)Ll/ܰ᩹ۚ;

    move-result-object v1

    const/4 v2, 0x1

    .line 2540
    invoke-direct {v0, v1, v5, v2, v13}, Ll/ܿ᩶ۚ;->֫(Ll/ܰ᩹ۚ;IZ[C)I

    goto :goto_59

    :cond_69
    move/from16 v25, v1

    move/from16 v31, v2

    :goto_59
    add-int/lit8 v6, v6, 0x1

    .line 2551
    invoke-direct {v0, v6, v3}, Ll/ܿ᩶ۚ;->֫(I[I)I

    move-result v5

    move/from16 v1, v25

    move/from16 v2, v31

    goto :goto_58

    :cond_6a
    move/from16 v25, v1

    move/from16 v31, v2

    move-object/from16 p2, p1

    move-object v15, v0

    move/from16 p1, v5

    move/from16 v2, v21

    move/from16 v1, v22

    move-object/from16 v5, v26

    move/from16 v7, v29

    move/from16 v8, v30

    move/from16 v0, v34

    move/from16 v21, v17

    move-object/from16 v22, v20

    move/from16 v17, v31

    move-object/from16 v20, v3

    move/from16 v3, p3

    move/from16 p3, v25

    move/from16 v25, v6

    move/from16 v6, v28

    goto/16 :goto_2e

    :cond_6b
    move/from16 v21, v2

    move/from16 v39, v11

    move/from16 v40, v12

    move-object v2, v13

    move-object/from16 v41, v14

    move-object/from16 v42, v20

    .line 2555
    aget-object v0, v5, v16

    if-eqz v0, :cond_6c

    .line 2556
    invoke-virtual {v4, v0}, Ll/ܶ᩶ۚ;->֫(Ll/֨᩶ۚ;)V

    :cond_6c
    if-eqz v3, :cond_71

    .line 2560
    iget v0, v9, Ll/ۡ᩶ۚ;->֨:I

    and-int/lit8 v0, v0, 0x2

    if-nez v0, :cond_71

    if-eqz v21, :cond_6d

    move/from16 v0, v21

    .line 2564
    invoke-virtual {v15, v0}, Ll/ܿ᩶ۚ;->ܿ(I)I

    move-result v1

    mul-int/lit8 v1, v1, 0x3

    new-array v6, v1, [I

    add-int/lit8 v0, v0, 0x2

    :goto_5a
    if-lez v1, :cond_6e

    add-int/lit8 v7, v1, -0x1

    add-int/lit8 v8, v0, 0x6

    .line 2569
    aput v8, v6, v7

    add-int/lit8 v7, v1, -0x2

    add-int/lit8 v8, v0, 0x8

    .line 2570
    invoke-virtual {v15, v8}, Ll/ܿ᩶ۚ;->ܿ(I)I

    move-result v8

    aput v8, v6, v7

    add-int/lit8 v1, v1, -0x3

    .line 2571
    invoke-virtual {v15, v0}, Ll/ܿ᩶ۚ;->ܿ(I)I

    move-result v7

    aput v7, v6, v1

    add-int/lit8 v0, v0, 0xa

    goto :goto_5a

    :cond_6d
    const/4 v6, 0x0

    .line 2575
    :cond_6e
    invoke-virtual {v15, v3}, Ll/ܿ᩶ۚ;->ܿ(I)I

    move-result v0

    add-int/lit8 v3, v3, 0x2

    :goto_5b
    add-int/lit8 v1, v0, -0x1

    if-lez v0, :cond_71

    .line 2578
    invoke-virtual {v15, v3}, Ll/ܿ᩶ۚ;->ܿ(I)I

    move-result v0

    add-int/lit8 v7, v3, 0x2

    .line 2579
    invoke-virtual {v15, v7}, Ll/ܿ᩶ۚ;->ܿ(I)I

    move-result v7

    add-int/lit8 v8, v3, 0x4

    .line 2580
    invoke-virtual {v15, v2, v8}, Ll/ܿ᩶ۚ;->ۧ([CI)Ljava/lang/String;

    move-result-object v11

    add-int/lit8 v8, v3, 0x6

    .line 2581
    invoke-virtual {v15, v2, v8}, Ll/ܿ᩶ۚ;->ۧ([CI)Ljava/lang/String;

    move-result-object v12

    add-int/lit8 v8, v3, 0x8

    .line 2582
    invoke-virtual {v15, v8}, Ll/ܿ᩶ۚ;->ܿ(I)I

    move-result v8

    add-int/lit8 v3, v3, 0xa

    if-eqz v6, :cond_70

    const/4 v10, 0x0

    .line 2586
    :goto_5c
    array-length v13, v6

    if-ge v10, v13, :cond_70

    .line 2587
    aget v13, v6, v10

    if-ne v13, v0, :cond_6f

    add-int/lit8 v13, v10, 0x1

    aget v13, v6, v13

    if-ne v13, v8, :cond_6f

    add-int/lit8 v10, v10, 0x2

    .line 2588
    aget v10, v6, v10

    invoke-virtual {v15, v2, v10}, Ll/ܿ᩶ۚ;->ۧ([CI)Ljava/lang/String;

    move-result-object v10

    goto :goto_5d

    :cond_6f
    add-int/lit8 v10, v10, 0x3

    goto :goto_5c

    :cond_70
    const/4 v10, 0x0

    :goto_5d
    move-object v13, v10

    .line 2593
    aget-object v14, v5, v0

    add-int/2addr v0, v7

    aget-object v0, v5, v0

    move-object v10, v4

    move-object v7, v15

    move-object v15, v0

    move/from16 v16, v8

    invoke-virtual/range {v10 .. v16}, Ll/ܶ᩶ۚ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ll/֨᩶ۚ;Ll/֨᩶ۚ;I)V

    move v0, v1

    move-object v15, v7

    goto :goto_5b

    :cond_71
    move-object v7, v15

    const/16 v0, 0x41

    move-object/from16 v1, v41

    if-eqz v1, :cond_74

    .line 2600
    array-length v3, v1

    const/4 v5, 0x0

    :goto_5e
    if-ge v5, v3, :cond_74

    aget v6, v1, v5

    .line 2601
    invoke-virtual {v7, v6}, Ll/ܿ᩶ۚ;->֫(I)I

    move-result v8

    const/16 v10, 0x40

    if-eq v8, v10, :cond_72

    if-ne v8, v0, :cond_73

    .line 2605
    :cond_72
    invoke-direct {v7, v9, v6}, Ll/ܿ᩶ۚ;->֫(Ll/ۡ᩶ۚ;I)I

    move-result v6

    .line 2607
    invoke-virtual {v7, v2, v6}, Ll/ܿ᩶ۚ;->ۧ([CI)Ljava/lang/String;

    move-result-object v16

    add-int/lit8 v6, v6, 0x2

    .line 2610
    iget v11, v9, Ll/ۡ᩶ۚ;->֡:I

    iget-object v12, v9, Ll/ۡ᩶ۚ;->ۚ:Ll/᩺᩶ۚ;

    iget-object v13, v9, Ll/ۡ᩶ۚ;->ܺ:[Ll/֨᩶ۚ;

    iget-object v14, v9, Ll/ۡ᩶ۚ;->ۢ:[Ll/֨᩶ۚ;

    iget-object v15, v9, Ll/ۡ᩶ۚ;->ۡ:[I

    const/16 v17, 0x1

    move-object v10, v4

    .line 2611
    invoke-virtual/range {v10 .. v17}, Ll/ܶ᩶ۚ;->֫(ILl/᩺᩶ۚ;[Ll/֨᩶ۚ;[Ll/֨᩶ۚ;[ILjava/lang/String;Z)Ll/ܰ᩹ۚ;

    move-result-object v8

    const/4 v10, 0x1

    .line 2610
    invoke-direct {v7, v8, v6, v10, v2}, Ll/ܿ᩶ۚ;->֫(Ll/ܰ᩹ۚ;IZ[C)I

    :cond_73
    add-int/lit8 v5, v5, 0x1

    goto :goto_5e

    :cond_74
    move-object/from16 v3, v42

    if-eqz v3, :cond_77

    .line 2628
    array-length v1, v3

    const/4 v5, 0x0

    :goto_5f
    if-ge v5, v1, :cond_77

    aget v6, v3, v5

    .line 2629
    invoke-virtual {v7, v6}, Ll/ܿ᩶ۚ;->֫(I)I

    move-result v8

    const/16 v10, 0x40

    if-eq v8, v10, :cond_75

    if-ne v8, v0, :cond_76

    .line 2633
    :cond_75
    invoke-direct {v7, v9, v6}, Ll/ܿ᩶ۚ;->֫(Ll/ۡ᩶ۚ;I)I

    move-result v6

    .line 2635
    invoke-virtual {v7, v2, v6}, Ll/ܿ᩶ۚ;->ۧ([CI)Ljava/lang/String;

    move-result-object v16

    add-int/lit8 v6, v6, 0x2

    .line 2638
    iget v11, v9, Ll/ۡ᩶ۚ;->֡:I

    iget-object v12, v9, Ll/ۡ᩶ۚ;->ۚ:Ll/᩺᩶ۚ;

    iget-object v13, v9, Ll/ۡ᩶ۚ;->ܺ:[Ll/֨᩶ۚ;

    iget-object v14, v9, Ll/ۡ᩶ۚ;->ۢ:[Ll/֨᩶ۚ;

    iget-object v15, v9, Ll/ۡ᩶ۚ;->ۡ:[I

    const/16 v17, 0x0

    move-object v10, v4

    .line 2639
    invoke-virtual/range {v10 .. v17}, Ll/ܶ᩶ۚ;->֫(ILl/᩺᩶ۚ;[Ll/֨᩶ۚ;[Ll/֨᩶ۚ;[ILjava/lang/String;Z)Ll/ܰ᩹ۚ;

    move-result-object v8

    const/4 v10, 0x1

    .line 2638
    invoke-direct {v7, v8, v6, v10, v2}, Ll/ܿ᩶ۚ;->֫(Ll/ܰ᩹ۚ;IZ[C)I

    :cond_76
    add-int/lit8 v5, v5, 0x1

    goto :goto_5f

    :cond_77
    move-object/from16 v2, p2

    :goto_60
    if-eqz v2, :cond_78

    .line 2657
    iget-object v0, v2, Ll/ܽ᩶ۚ;->ۧ:Ll/ܽ᩶ۚ;

    const/4 v1, 0x0

    .line 2658
    iput-object v1, v2, Ll/ܽ᩶ۚ;->ۧ:Ll/ܽ᩶ۚ;

    .line 2659
    invoke-virtual {v4, v2}, Ll/ܶ᩶ۚ;->֫(Ll/ܽ᩶ۚ;)V

    move-object v2, v0

    goto :goto_60

    :cond_78
    move/from16 v15, v39

    move/from16 v12, v40

    .line 2664
    invoke-virtual {v4, v12, v15}, Ll/ܶ᩶ۚ;->ܽ(II)V

    move-object v3, v4

    move/from16 v12, v19

    goto :goto_61

    .line 1544
    :cond_79
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v0

    :cond_7a
    move-object v3, v12

    move/from16 v12, v16

    .line 1516
    :goto_61
    invoke-virtual {v3}, Ll/ܶ᩶ۚ;->ܽ()V

    return v12

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_9
        :pswitch_8
        :pswitch_8
        :pswitch_9
        :pswitch_9
        :pswitch_9
        :pswitch_9
        :pswitch_9
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_9
        :pswitch_9
        :pswitch_9
        :pswitch_9
        :pswitch_9
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_8
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_7
        :pswitch_7
        :pswitch_7
        :pswitch_7
        :pswitch_7
        :pswitch_7
        :pswitch_7
        :pswitch_7
        :pswitch_7
        :pswitch_7
        :pswitch_7
        :pswitch_7
        :pswitch_7
        :pswitch_7
        :pswitch_7
        :pswitch_7
        :pswitch_9
        :pswitch_6
        :pswitch_5
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_4
        :pswitch_4
        :pswitch_8
        :pswitch_9
        :pswitch_8
        :pswitch_a
        :pswitch_a
        :pswitch_8
        :pswitch_8
        :pswitch_a
        :pswitch_a
        :pswitch_2
        :pswitch_3
        :pswitch_7
        :pswitch_7
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_1
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x15
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x36
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
    .end packed-switch

    :pswitch_data_3
    .packed-switch 0x42
        :pswitch_c
        :pswitch_c
        :pswitch_b
    .end packed-switch

    :pswitch_data_4
    .packed-switch 0x0
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1c
        :pswitch_1b
        :pswitch_1b
        :pswitch_1b
        :pswitch_1b
        :pswitch_1b
        :pswitch_1a
        :pswitch_1a
        :pswitch_1a
        :pswitch_1a
        :pswitch_1a
        :pswitch_1a
        :pswitch_1a
        :pswitch_1a
        :pswitch_1a
        :pswitch_1a
        :pswitch_1a
        :pswitch_1a
        :pswitch_1a
        :pswitch_1a
        :pswitch_1a
        :pswitch_1a
        :pswitch_1a
        :pswitch_1a
        :pswitch_1a
        :pswitch_1a
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_1b
        :pswitch_1b
        :pswitch_1b
        :pswitch_1b
        :pswitch_1b
        :pswitch_19
        :pswitch_19
        :pswitch_19
        :pswitch_19
        :pswitch_19
        :pswitch_19
        :pswitch_19
        :pswitch_19
        :pswitch_19
        :pswitch_19
        :pswitch_19
        :pswitch_19
        :pswitch_19
        :pswitch_19
        :pswitch_19
        :pswitch_19
        :pswitch_19
        :pswitch_19
        :pswitch_19
        :pswitch_19
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_18
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_17
        :pswitch_17
        :pswitch_17
        :pswitch_17
        :pswitch_17
        :pswitch_17
        :pswitch_17
        :pswitch_17
        :pswitch_17
        :pswitch_17
        :pswitch_17
        :pswitch_17
        :pswitch_17
        :pswitch_17
        :pswitch_17
        :pswitch_17
        :pswitch_1b
        :pswitch_16
        :pswitch_15
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_14
        :pswitch_14
        :pswitch_14
        :pswitch_14
        :pswitch_14
        :pswitch_14
        :pswitch_14
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_1f
        :pswitch_12
        :pswitch_20
        :pswitch_20
        :pswitch_12
        :pswitch_12
        :pswitch_20
        :pswitch_20
        :pswitch_11
        :pswitch_10
        :pswitch_17
        :pswitch_17
        :pswitch_f
        :pswitch_f
        :pswitch_e
        :pswitch_e
        :pswitch_e
        :pswitch_e
        :pswitch_e
        :pswitch_e
        :pswitch_e
        :pswitch_e
        :pswitch_e
        :pswitch_e
        :pswitch_e
        :pswitch_e
        :pswitch_e
        :pswitch_e
        :pswitch_e
        :pswitch_e
        :pswitch_e
        :pswitch_e
        :pswitch_d
    .end packed-switch
.end method

.method private ֫([CII)Ljava/lang/String;
    .locals 7

    add-int/2addr p3, p2

    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_0
    if-ge p2, p3, :cond_2

    add-int/lit8 v2, p2, 0x1

    .line 3723
    iget-object v3, p0, Ll/ܿ᩶ۚ;->ۧ:[B

    aget-byte v4, v3, p2

    and-int/lit16 v5, v4, 0x80

    if-nez v5, :cond_0

    add-int/lit8 p2, v1, 0x1

    and-int/lit8 v3, v4, 0x7f

    int-to-char v3, v3

    .line 3725
    aput-char v3, p1, v1

    move v1, p2

    move p2, v2

    goto :goto_0

    :cond_0
    and-int/lit16 v5, v4, 0xe0

    const/16 v6, 0xc0

    if-ne v5, v6, :cond_1

    add-int/lit8 v5, v1, 0x1

    and-int/lit8 v4, v4, 0x1f

    shl-int/lit8 v4, v4, 0x6

    add-int/lit8 p2, p2, 0x2

    .line 3727
    aget-byte v2, v3, v2

    and-int/lit8 v2, v2, 0x3f

    add-int/2addr v4, v2

    int-to-char v2, v4

    aput-char v2, p1, v1

    goto :goto_1

    :cond_1
    add-int/lit8 v5, v1, 0x1

    and-int/lit8 v4, v4, 0xf

    shl-int/lit8 v4, v4, 0xc

    add-int/lit8 v6, p2, 0x2

    .line 3730
    aget-byte v2, v3, v2

    and-int/lit8 v2, v2, 0x3f

    shl-int/lit8 v2, v2, 0x6

    add-int/2addr v4, v2

    add-int/lit8 p2, p2, 0x3

    aget-byte v2, v3, v6

    and-int/lit8 v2, v2, 0x3f

    add-int/2addr v4, v2

    int-to-char v2, v4

    aput-char v2, p1, v1

    :goto_1
    move v1, v5

    goto :goto_0

    .line 3737
    :cond_2
    new-instance p2, Ljava/lang/String;

    invoke-direct {p2, p1, v0, v1}, Ljava/lang/String;-><init>([CII)V

    return-object p2
.end method

.method public static ֫(I[Ll/֨᩶ۚ;)Ll/֨᩶ۚ;
    .locals 1

    .line 2692
    aget-object v0, p1, p0

    if-nez v0, :cond_0

    .line 2693
    new-instance v0, Ll/֨᩶ۚ;

    invoke-direct {v0}, Ll/֨᩶ۚ;-><init>()V

    aput-object v0, p1, p0

    .line 2695
    :cond_0
    aget-object p0, p1, p0

    .line 2709
    iget-short p1, p0, Ll/֨᩶ۚ;->ۧ:S

    and-int/lit8 p1, p1, -0x2

    int-to-short p1, p1

    iput-short p1, p0, Ll/֨᩶ۚ;->ۧ:S

    return-object p0
.end method

.method private ֫([Ll/ܽ᩶ۚ;Ljava/lang/String;II[CI[Ll/֨᩶ۚ;)Ll/ܽ᩶ۚ;
    .locals 2

    .line 3542
    iget-object p6, p0, Ll/ܿ᩶ۚ;->ۧ:[B

    array-length p6, p6

    sub-int/2addr p6, p3

    if-gt p4, p6, :cond_2

    .line 3545
    array-length p6, p1

    const/4 p7, 0x0

    :goto_0
    if-ge p7, p6, :cond_1

    aget-object v0, p1, p7

    .line 3546
    iget-object v1, v0, Ll/ܽ᩶ۚ;->ܽ:Ljava/lang/String;

    invoke-virtual {v1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 3547
    invoke-virtual {v0, p0, p3, p4, p5}, Ll/ܽ᩶ۚ;->֫(Ll/ܿ᩶ۚ;II[C)Ll/ܽ᩶ۚ;

    move-result-object p1

    return-object p1

    :cond_0
    add-int/lit8 p7, p7, 0x1

    goto :goto_0

    .line 3551
    :cond_1
    new-instance p1, Ll/ܽ᩶ۚ;

    invoke-direct {p1, p2}, Ll/ܽ᩶ۚ;-><init>(Ljava/lang/String;)V

    const/4 p2, 0x0

    invoke-virtual {p1, p0, p3, p4, p2}, Ll/ܽ᩶ۚ;->֫(Ll/ܿ᩶ۚ;II[C)Ll/ܽ᩶ۚ;

    move-result-object p1

    return-object p1

    .line 3543
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1
.end method

.method private ֫(Ll/ܶ᩶ۚ;Ll/ۡ᩶ۚ;IZ)V
    .locals 5

    add-int/lit8 v0, p3, 0x1

    .line 2957
    iget-object v1, p0, Ll/ܿ᩶ۚ;->ۧ:[B

    aget-byte p3, v1, p3

    and-int/lit16 p3, p3, 0xff

    .line 2958
    invoke-virtual {p1, p3, p4}, Ll/ܶ᩶ۚ;->֫(IZ)V

    .line 2959
    iget-object p2, p2, Ll/ۡ᩶ۚ;->ۧ:[C

    const/4 v1, 0x0

    :goto_0
    if-ge v1, p3, :cond_1

    .line 2961
    invoke-virtual {p0, v0}, Ll/ܿ᩶ۚ;->ܿ(I)I

    move-result v2

    add-int/lit8 v0, v0, 0x2

    :goto_1
    add-int/lit8 v3, v2, -0x1

    if-lez v2, :cond_0

    .line 2965
    invoke-virtual {p0, p2, v0}, Ll/ܿ᩶ۚ;->ۧ([CI)Ljava/lang/String;

    move-result-object v2

    add-int/lit8 v0, v0, 0x2

    .line 2970
    invoke-virtual {p1, v1, v2, p4}, Ll/ܶ᩶ۚ;->֫(ILjava/lang/String;Z)Ll/ܰ᩹ۚ;

    move-result-object v2

    const/4 v4, 0x1

    .line 2969
    invoke-direct {p0, v2, v0, v4, p2}, Ll/ܿ᩶ۚ;->֫(Ll/ܰ᩹ۚ;IZ[C)I

    move-result v0

    move v2, v3

    goto :goto_1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method private ۧ(Ll/ܶ᩶ۚ;Ll/ۡ᩶ۚ;IZ)[I
    .locals 11

    .line 2750
    iget-object v0, p2, Ll/ۡ᩶ۚ;->ۧ:[C

    .line 2753
    invoke-virtual {p0, p3}, Ll/ܿ᩶ۚ;->ܿ(I)I

    move-result v1

    new-array v2, v1, [I

    const/4 v3, 0x2

    add-int/2addr p3, v3

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v1, :cond_4

    .line 2757
    aput p3, v2, v4

    .line 2760
    invoke-virtual {p0, p3}, Ll/ܿ᩶ۚ;->ۧ(I)I

    move-result v5

    ushr-int/lit8 v6, v5, 0x18

    const/16 v7, 0x17

    if-eq v6, v7, :cond_0

    packed-switch v6, :pswitch_data_0

    packed-switch v6, :pswitch_data_1

    .line 2803
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1

    :pswitch_0
    add-int/lit8 p3, p3, 0x4

    goto :goto_2

    :pswitch_1
    add-int/lit8 v7, p3, 0x1

    .line 2766
    invoke-virtual {p0, v7}, Ll/ܿ᩶ۚ;->ܿ(I)I

    move-result v7

    add-int/lit8 p3, p3, 0x3

    :goto_1
    add-int/lit8 v8, v7, -0x1

    if-lez v7, :cond_1

    .line 2769
    invoke-virtual {p0, p3}, Ll/ܿ᩶ۚ;->ܿ(I)I

    move-result v7

    add-int/lit8 v9, p3, 0x2

    .line 2770
    invoke-virtual {p0, v9}, Ll/ܿ᩶ۚ;->ܿ(I)I

    move-result v9

    add-int/lit8 p3, p3, 0x6

    .line 2773
    iget-object v10, p2, Ll/ۡ᩶ۚ;->ᩴ:[Ll/֨᩶ۚ;

    invoke-static {v7, v10}, Ll/ܿ᩶ۚ;->֫(I[Ll/֨᩶ۚ;)Ll/֨᩶ۚ;

    add-int/2addr v7, v9

    .line 2774
    iget-object v9, p2, Ll/ۡ᩶ۚ;->ᩴ:[Ll/֨᩶ۚ;

    invoke-static {v7, v9}, Ll/ܿ᩶ۚ;->֫(I[Ll/֨᩶ۚ;)Ll/֨᩶ۚ;

    move v7, v8

    goto :goto_1

    :cond_0
    :pswitch_2
    add-int/lit8 p3, p3, 0x3

    .line 2807
    :cond_1
    :goto_2
    invoke-virtual {p0, p3}, Ll/ܿ᩶ۚ;->֫(I)I

    move-result v7

    const/16 v8, 0x42

    const/4 v9, 0x0

    const/4 v10, 0x1

    if-ne v6, v8, :cond_3

    if-nez v7, :cond_2

    goto :goto_3

    .line 2810
    :cond_2
    new-instance v9, Ll/᩺᩶ۚ;

    iget-object v6, p0, Ll/ܿ᩶ۚ;->ۧ:[B

    invoke-direct {v9, v6, p3}, Ll/᩺᩶ۚ;-><init>([BI)V

    :goto_3
    invoke-static {v7, v3, v10, p3}, Ll/᩺᩵ܿ;->֫(IIII)I

    move-result p3

    .line 2813
    invoke-virtual {p0, v0, p3}, Ll/ܿ᩶ۚ;->ۧ([CI)Ljava/lang/String;

    move-result-object v6

    add-int/2addr p3, v3

    and-int/lit16 v5, v5, -0x100

    .line 2818
    invoke-virtual {p1, v5, v9, v6, p4}, Ll/ܶ᩶ۚ;->ۧ(ILl/᩺᩶ۚ;Ljava/lang/String;Z)Ll/ܰ᩹ۚ;

    move-result-object v5

    .line 2817
    invoke-direct {p0, v5, p3, v10, v0}, Ll/ܿ᩶ۚ;->֫(Ll/ܰ᩹ۚ;IZ[C)I

    move-result p3

    goto :goto_4

    :cond_3
    const/4 v5, 0x3

    .line 2823
    invoke-static {v7, v3, v5, p3}, Ll/᩺᩵ܿ;->֫(IIII)I

    move-result p3

    .line 2831
    invoke-direct {p0, v9, p3, v10, v0}, Ll/ܿ᩶ۚ;->֫(Ll/ܰ᩹ۚ;IZ[C)I

    move-result p3

    :goto_4
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_4
    return-object v2

    :pswitch_data_0
    .packed-switch 0x10
        :pswitch_2
        :pswitch_2
        :pswitch_2
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x40
        :pswitch_1
        :pswitch_1
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method private ᩳ([CI)Ljava/lang/String;
    .locals 1

    .line 3756
    iget-object v0, p0, Ll/ܿ᩶ۚ;->ܿ:[I

    invoke-virtual {p0, p2}, Ll/ܿ᩶ۚ;->ܿ(I)I

    move-result p2

    aget p2, v0, p2

    invoke-virtual {p0, p1, p2}, Ll/ܿ᩶ۚ;->ۧ([CI)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public final ֫()I
    .locals 4

    .line 3443
    iget v0, p0, Ll/ܿ᩶ۚ;->ܳ:I

    add-int/lit8 v1, v0, 0x8

    add-int/lit8 v0, v0, 0x6

    invoke-virtual {p0, v0}, Ll/ܿ᩶ۚ;->ܿ(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x2

    add-int/2addr v0, v1

    .line 3446
    invoke-virtual {p0, v0}, Ll/ܿ᩶ۚ;->ܿ(I)I

    move-result v1

    add-int/lit8 v0, v0, 0x2

    :goto_0
    add-int/lit8 v2, v1, -0x1

    if-lez v1, :cond_1

    add-int/lit8 v1, v0, 0x6

    .line 3453
    invoke-virtual {p0, v1}, Ll/ܿ᩶ۚ;->ܿ(I)I

    move-result v1

    add-int/lit8 v0, v0, 0x8

    :goto_1
    add-int/lit8 v3, v1, -0x1

    if-lez v1, :cond_0

    add-int/lit8 v1, v0, 0x2

    .line 3461
    invoke-virtual {p0, v1}, Ll/ܿ᩶ۚ;->ۧ(I)I

    move-result v1

    add-int/lit8 v1, v1, 0x6

    add-int/2addr v0, v1

    move v1, v3

    goto :goto_1

    :cond_0
    move v1, v2

    goto :goto_0

    .line 3466
    :cond_1
    invoke-virtual {p0, v0}, Ll/ܿ᩶ۚ;->ܿ(I)I

    move-result v1

    add-int/lit8 v0, v0, 0x2

    :goto_2
    add-int/lit8 v2, v1, -0x1

    if-lez v1, :cond_3

    add-int/lit8 v1, v0, 0x6

    .line 3469
    invoke-virtual {p0, v1}, Ll/ܿ᩶ۚ;->ܿ(I)I

    move-result v1

    add-int/lit8 v0, v0, 0x8

    :goto_3
    add-int/lit8 v3, v1, -0x1

    if-lez v1, :cond_2

    add-int/lit8 v1, v0, 0x2

    .line 3472
    invoke-virtual {p0, v1}, Ll/ܿ᩶ۚ;->ۧ(I)I

    move-result v1

    add-int/lit8 v1, v1, 0x6

    add-int/2addr v0, v1

    move v1, v3

    goto :goto_3

    :cond_2
    move v1, v2

    goto :goto_2

    :cond_3
    add-int/lit8 v0, v0, 0x2

    return v0
.end method

.method public final ֫(I)I
    .locals 1

    .line 3600
    iget-object v0, p0, Ll/ܿ᩶ۚ;->ۧ:[B

    aget-byte p1, v0, p1

    and-int/lit16 p1, p1, 0xff

    return p1
.end method

.method public final ֫([CI)Ljava/lang/Object;
    .locals 9

    .line 3850
    iget-object v0, p0, Ll/ܿ᩶ۚ;->ܿ:[I

    aget v1, v0, p2

    add-int/lit8 v2, v1, -0x1

    .line 3851
    iget-object v3, p0, Ll/ܿ᩶ۚ;->ۧ:[B

    aget-byte v2, v3, v2

    packed-switch v2, :pswitch_data_0

    const/4 v4, 0x0

    packed-switch v2, :pswitch_data_1

    .line 3879
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1

    .line 3863
    :pswitch_0
    invoke-virtual {p0, p1, v1}, Ll/ܿ᩶ۚ;->ۧ([CI)Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 3861
    :pswitch_1
    invoke-virtual {p0, p1, v1}, Ll/ܿ᩶ۚ;->ۧ([CI)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ll/ۨ᩶ۚ;->ܿ(Ljava/lang/String;)Ll/ۨ᩶ۚ;

    move-result-object p1

    return-object p1

    .line 3859
    :pswitch_2
    invoke-virtual {p0, v1}, Ll/ܿ᩶ۚ;->ܽ(I)J

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Double;->longBitsToDouble(J)D

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    return-object p1

    .line 3857
    :pswitch_3
    invoke-virtual {p0, v1}, Ll/ܿ᩶ۚ;->ܽ(I)J

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    return-object p1

    .line 3855
    :pswitch_4
    invoke-virtual {p0, v1}, Ll/ܿ᩶ۚ;->ۧ(I)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p1

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    return-object p1

    .line 3853
    :pswitch_5
    invoke-virtual {p0, v1}, Ll/ܿ᩶ۚ;->ۧ(I)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    .line 3815
    :pswitch_6
    iget-object v2, p0, Ll/ܿ᩶ۚ;->ܽ:[Ll/᩷᩶ۚ;

    aget-object v3, v2, p2

    if-eqz v3, :cond_0

    return-object v3

    :cond_0
    add-int/lit8 v3, v1, 0x2

    .line 3820
    invoke-virtual {p0, v3}, Ll/ܿ᩶ۚ;->ܿ(I)I

    move-result v3

    aget v0, v0, v3

    .line 3821
    invoke-virtual {p0, p1, v0}, Ll/ܿ᩶ۚ;->ۧ([CI)Ljava/lang/String;

    move-result-object v3

    add-int/lit8 v0, v0, 0x2

    .line 3822
    invoke-virtual {p0, p1, v0}, Ll/ܿ᩶ۚ;->ۧ([CI)Ljava/lang/String;

    move-result-object v0

    .line 3823
    iget-object v5, p0, Ll/ܿ᩶ۚ;->֫:[I

    invoke-virtual {p0, v1}, Ll/ܿ᩶ۚ;->ܿ(I)I

    move-result v1

    aget v1, v5, v1

    .line 3824
    invoke-virtual {p0, v1}, Ll/ܿ᩶ۚ;->ܿ(I)I

    move-result v5

    invoke-virtual {p0, p1, v5}, Ll/ܿ᩶ۚ;->֫([CI)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/֡᩶ۚ;

    add-int/lit8 v6, v1, 0x2

    .line 3825
    invoke-virtual {p0, v6}, Ll/ܿ᩶ۚ;->ܿ(I)I

    move-result v6

    new-array v7, v6, [Ljava/lang/Object;

    add-int/lit8 v1, v1, 0x4

    :goto_0
    if-ge v4, v6, :cond_1

    .line 3828
    invoke-virtual {p0, v1}, Ll/ܿ᩶ۚ;->ܿ(I)I

    move-result v8

    invoke-virtual {p0, p1, v8}, Ll/ܿ᩶ۚ;->֫([CI)Ljava/lang/Object;

    move-result-object v8

    aput-object v8, v7, v4

    add-int/lit8 v1, v1, 0x2

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 3831
    :cond_1
    new-instance p1, Ll/᩷᩶ۚ;

    invoke-direct {p1, v3, v0, v5, v7}, Ll/᩷᩶ۚ;-><init>(Ljava/lang/String;Ljava/lang/String;Ll/֡᩶ۚ;[Ljava/lang/Object;)V

    aput-object p1, v2, p2

    return-object p1

    .line 3865
    :pswitch_7
    invoke-virtual {p0, p1, v1}, Ll/ܿ᩶ۚ;->ۧ([CI)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ll/ۨ᩶ۚ;->ᩳ(Ljava/lang/String;)Ll/ۨ᩶ۚ;

    move-result-object p1

    return-object p1

    .line 3867
    :pswitch_8
    invoke-virtual {p0, v1}, Ll/ܿ᩶ۚ;->֫(I)I

    move-result p2

    add-int/lit8 v1, v1, 0x1

    .line 3868
    invoke-virtual {p0, v1}, Ll/ܿ᩶ۚ;->ܿ(I)I

    move-result v1

    aget v1, v0, v1

    add-int/lit8 v2, v1, 0x2

    .line 3869
    invoke-virtual {p0, v2}, Ll/ܿ᩶ۚ;->ܿ(I)I

    move-result v2

    aget v0, v0, v2

    const/4 v2, 0x1

    .line 3771
    invoke-direct {p0, p1, v1}, Ll/ܿ᩶ۚ;->ᩳ([CI)Ljava/lang/String;

    move-result-object v4

    .line 3871
    invoke-virtual {p0, p1, v0}, Ll/ܿ᩶ۚ;->ۧ([CI)Ljava/lang/String;

    move-result-object v5

    add-int/lit8 v0, v0, 0x2

    .line 3872
    invoke-virtual {p0, p1, v0}, Ll/ܿ᩶ۚ;->ۧ([CI)Ljava/lang/String;

    move-result-object p1

    sub-int/2addr v1, v2

    .line 3873
    aget-byte v0, v3, v1

    const/16 v1, 0xb

    if-ne v0, v1, :cond_2

    const/4 v6, 0x1

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    const/4 v6, 0x0

    .line 3875
    :goto_1
    new-instance v7, Ll/֡᩶ۚ;

    move-object v0, v7

    move v1, p2

    move-object v2, v4

    move-object v3, v5

    move-object v4, p1

    move v5, v6

    invoke-direct/range {v0 .. v5}, Ll/֡᩶ۚ;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    return-object v7

    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0xf
        :pswitch_8
        :pswitch_7
        :pswitch_6
    .end packed-switch
.end method

.method public final ֫(Ll/᩻᩶ۚ;[Ll/ܽ᩶ۚ;I)V
    .locals 51

    move-object/from16 v8, p0

    move-object/from16 v9, p1

    move/from16 v10, p3

    .line 446
    new-instance v11, Ll/ۡ᩶ۚ;

    .line 36
    invoke-direct {v11}, Ljava/lang/Object;-><init>()V

    move-object/from16 v12, p2

    .line 447
    iput-object v12, v11, Ll/ۡ᩶ۚ;->֫:[Ll/ܽ᩶ۚ;

    .line 448
    iput v10, v11, Ll/ۡ᩶ۚ;->֨:I

    .line 449
    iget v0, v8, Ll/ܿ᩶ۚ;->᩻:I

    new-array v13, v0, [C

    iput-object v13, v11, Ll/ۡ᩶ۚ;->ۧ:[C

    .line 454
    iget v0, v8, Ll/ܿ᩶ۚ;->ܳ:I

    invoke-virtual {v8, v0}, Ll/ܿ᩶ۚ;->ܿ(I)I

    move-result v1

    add-int/lit8 v2, v0, 0x2

    .line 3771
    invoke-direct {v8, v13, v2}, Ll/ܿ᩶ۚ;->ᩳ([CI)Ljava/lang/String;

    move-result-object v14

    add-int/lit8 v2, v0, 0x4

    invoke-direct {v8, v13, v2}, Ll/ܿ᩶ۚ;->ᩳ([CI)Ljava/lang/String;

    move-result-object v15

    add-int/lit8 v2, v0, 0x6

    .line 457
    invoke-virtual {v8, v2}, Ll/ܿ᩶ۚ;->ܿ(I)I

    move-result v2

    new-array v7, v2, [Ljava/lang/String;

    add-int/lit8 v0, v0, 0x8

    const/4 v3, 0x0

    move v6, v0

    :goto_0
    if-ge v3, v2, :cond_0

    .line 3771
    invoke-direct {v8, v13, v6}, Ll/ܿ᩶ۚ;->ᩳ([CI)Ljava/lang/String;

    move-result-object v0

    .line 460
    aput-object v0, v7, v3

    add-int/lit8 v6, v6, 0x2

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 502
    :cond_0
    invoke-virtual/range {p0 .. p0}, Ll/ܿ᩶ۚ;->֫()I

    move-result v0

    add-int/lit8 v2, v0, -0x2

    .line 503
    invoke-virtual {v8, v2}, Ll/ܿ᩶ۚ;->ܿ(I)I

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    move/from16 v16, v2

    move-object v2, v5

    move-object/from16 v30, v18

    move-object/from16 v31, v19

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    move v5, v1

    move-object/from16 v18, v7

    const/4 v1, 0x0

    move-object/from16 v50, v4

    move-object v4, v3

    move-object/from16 v3, v50

    :goto_1
    const-string v7, "Synthetic"

    const/high16 v19, 0x20000

    const-string v12, "Deprecated"

    move-object/from16 v20, v11

    const-string v11, "RuntimeInvisibleTypeAnnotations"

    const-string v9, "RuntimeInvisibleAnnotations"

    const-string v10, "RuntimeVisibleTypeAnnotations"

    move/from16 v21, v6

    const-string v6, "RuntimeVisibleAnnotations"

    move-object/from16 v22, v15

    const-string v15, "Signature"

    if-lez v16, :cond_15

    move-object/from16 v23, v2

    .line 505
    invoke-virtual {v8, v13, v0}, Ll/ܿ᩶ۚ;->ۧ([CI)Ljava/lang/String;

    move-result-object v2

    move/from16 v24, v1

    add-int/lit8 v1, v0, 0x2

    .line 506
    invoke-virtual {v8, v1}, Ll/ܿ᩶ۚ;->ۧ(I)I

    move-result v1

    add-int/lit8 v0, v0, 0x6

    move-object/from16 v25, v3

    const-string v3, "SourceFile"

    .line 510
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 511
    invoke-virtual {v8, v13, v0}, Ll/ܿ᩶ۚ;->ۧ([CI)Ljava/lang/String;

    move-result-object v4

    goto/16 :goto_2

    :cond_1
    const-string v3, "InnerClasses"

    .line 512
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    move/from16 v39, v0

    goto/16 :goto_2

    :cond_2
    const-string v3, "EnclosingMethod"

    .line 514
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    move/from16 v32, v0

    goto/16 :goto_2

    :cond_3
    const-string v3, "NestHost"

    .line 516
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    .line 3771
    invoke-direct {v8, v13, v0}, Ll/ܿ᩶ۚ;->ᩳ([CI)Ljava/lang/String;

    move-result-object v30

    goto/16 :goto_2

    :cond_4
    const-string v3, "NestMembers"

    .line 518
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_5

    move/from16 v37, v0

    goto/16 :goto_2

    :cond_5
    const-string v3, "PermittedSubclasses"

    .line 520
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_6

    move/from16 v38, v0

    goto/16 :goto_2

    .line 522
    :cond_6
    invoke-virtual {v15, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_7

    .line 523
    invoke-virtual {v8, v13, v0}, Ll/ܿ᩶ۚ;->ۧ([CI)Ljava/lang/String;

    move-result-object v17

    goto/16 :goto_2

    .line 524
    :cond_7
    invoke-virtual {v6, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_8

    move/from16 v33, v0

    goto/16 :goto_2

    .line 526
    :cond_8
    invoke-virtual {v10, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_9

    move/from16 v35, v0

    goto/16 :goto_2

    .line 528
    :cond_9
    invoke-virtual {v12, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_a

    or-int v5, v5, v19

    goto/16 :goto_2

    .line 530
    :cond_a
    invoke-virtual {v7, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_b

    or-int/lit16 v5, v5, 0x1000

    goto :goto_2

    :cond_b
    const-string v3, "SourceDebugExtension"

    .line 532
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_d

    .line 533
    iget-object v2, v8, Ll/ܿ᩶ۚ;->ۧ:[B

    array-length v2, v2

    sub-int/2addr v2, v0

    if-gt v1, v2, :cond_c

    .line 536
    new-array v2, v1, [C

    .line 537
    invoke-direct {v8, v2, v0, v1}, Ll/ܿ᩶ۚ;->֫([CII)Ljava/lang/String;

    move-result-object v3

    move-object/from16 v2, v23

    goto :goto_4

    .line 534
    :cond_c
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v0

    .line 538
    :cond_d
    invoke-virtual {v9, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_e

    move/from16 v34, v0

    goto :goto_2

    .line 540
    :cond_e
    invoke-virtual {v11, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_f

    move/from16 v36, v0

    goto :goto_2

    :cond_f
    const-string v3, "Record"

    .line 542
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_10

    const/high16 v2, 0x10000

    or-int/2addr v5, v2

    move/from16 v40, v0

    goto :goto_2

    :cond_10
    const-string v3, "Module"

    .line 545
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_11

    move/from16 v41, v0

    goto :goto_2

    :cond_11
    const-string v3, "ModuleMainClass"

    .line 547
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_12

    .line 3771
    invoke-direct {v8, v13, v0}, Ll/ܿ᩶ۚ;->ᩳ([CI)Ljava/lang/String;

    move-result-object v2

    goto :goto_3

    :cond_12
    const-string v3, "ModulePackages"

    .line 549
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_13

    move/from16 v24, v0

    :goto_2
    move-object/from16 v2, v23

    :goto_3
    move-object/from16 v3, v25

    :goto_4
    move v9, v0

    move v11, v1

    move/from16 v10, v21

    move/from16 v1, v24

    goto :goto_6

    :cond_13
    const-string v3, "BootstrapMethods"

    .line 551
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_14

    const/4 v6, -0x1

    const/4 v7, 0x0

    move v9, v0

    move-object/from16 v0, p0

    move v11, v1

    move/from16 v10, v24

    move-object/from16 v1, p2

    move-object/from16 v12, v23

    move-object/from16 v15, v25

    move v3, v9

    move-object/from16 v42, v4

    move v4, v11

    move/from16 v23, v5

    move-object v5, v13

    move/from16 v10, v21

    .line 554
    invoke-direct/range {v0 .. v7}, Ll/ܿ᩶ۚ;->֫([Ll/ܽ᩶ۚ;Ljava/lang/String;II[CI[Ll/֨᩶ۚ;)Ll/ܽ᩶ۚ;

    move-result-object v0

    move-object/from16 v5, v31

    .line 562
    iput-object v5, v0, Ll/ܽ᩶ۚ;->ۧ:Ll/ܽ᩶ۚ;

    move-object/from16 v31, v0

    goto :goto_5

    :cond_14
    move v9, v0

    move v11, v1

    move-object/from16 v42, v4

    move/from16 v10, v21

    move-object/from16 v12, v23

    move-object/from16 v15, v25

    move/from16 v23, v5

    move-object/from16 v5, v31

    :goto_5
    move-object v2, v12

    move-object v3, v15

    move/from16 v5, v23

    move/from16 v1, v24

    move-object/from16 v4, v42

    :goto_6
    add-int v0, v9, v11

    add-int/lit8 v16, v16, -0x1

    move-object/from16 v9, p1

    move-object/from16 v12, p2

    move v6, v10

    move-object/from16 v11, v20

    move-object/from16 v15, v22

    move/from16 v10, p3

    goto/16 :goto_1

    :cond_15
    move-object/from16 v42, v4

    move/from16 v23, v5

    move-object/from16 v16, v10

    move/from16 v10, v21

    move-object/from16 v5, v31

    move v4, v1

    .line 570
    iget-object v1, v8, Ll/ܿ᩶ۚ;->ܿ:[I

    const/4 v0, 0x1

    aget v0, v1, v0

    add-int/lit8 v0, v0, -0x7

    .line 571
    invoke-virtual {v8, v0}, Ll/ܿ᩶ۚ;->ۧ(I)I

    move-result v21

    const/4 v0, 0x1

    move-object/from16 v24, v7

    const/4 v7, 0x1

    move-object/from16 v0, p1

    move-object/from16 v25, v1

    move/from16 v1, v21

    move-object v7, v2

    move/from16 v2, v23

    move-object/from16 v23, v9

    move-object v9, v3

    move-object v3, v14

    move v14, v4

    move-object/from16 v4, v17

    move-object/from16 v5, v22

    move-object/from16 v17, v12

    move-object v12, v6

    move-object/from16 v6, v18

    .line 570
    invoke-virtual/range {v0 .. v6}, Ll/᩻᩶ۚ;->֫(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V

    move-object/from16 v6, v16

    and-int/lit8 v0, p3, 0x2

    if-nez v0, :cond_17

    move-object/from16 v3, v42

    if-nez v3, :cond_16

    if-eqz v9, :cond_17

    :cond_16
    move-object/from16 v5, p1

    move-object/from16 v4, v23

    .line 576
    invoke-virtual {v5, v3, v9}, Ll/᩻᩶ۚ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_7

    :cond_17
    move-object/from16 v5, p1

    move-object/from16 v4, v23

    :goto_7
    move/from16 v0, v41

    if-eqz v0, :cond_25

    move-object/from16 v9, v20

    .line 774
    iget-object v1, v9, Ll/ۡ᩶ۚ;->ۧ:[C

    .line 3786
    invoke-direct {v8, v1, v0}, Ll/ܿ᩶ۚ;->ᩳ([CI)Ljava/lang/String;

    move-result-object v2

    add-int/lit8 v3, v0, 0x2

    .line 779
    invoke-virtual {v8, v3}, Ll/ܿ᩶ۚ;->ܿ(I)I

    move-result v3

    move/from16 v16, v10

    add-int/lit8 v10, v0, 0x4

    .line 780
    invoke-virtual {v8, v1, v10}, Ll/ܿ᩶ۚ;->ۧ([CI)Ljava/lang/String;

    move-result-object v10

    move-object/from16 v18, v11

    add-int/lit8 v11, v0, 0x6

    .line 782
    invoke-virtual {v5, v3, v2, v10}, Ll/᩻᩶ۚ;->֫(ILjava/lang/String;Ljava/lang/String;)Ll/᩹᩶ۚ;

    move-result-object v2

    if-nez v2, :cond_18

    goto/16 :goto_11

    :cond_18
    if-eqz v7, :cond_19

    .line 789
    invoke-virtual {v2, v7}, Ll/᩹᩶ۚ;->֫(Ljava/lang/String;)V

    :cond_19
    if-eqz v14, :cond_1a

    .line 794
    invoke-virtual {v8, v14}, Ll/ܿ᩶ۚ;->ܿ(I)I

    move-result v3

    add-int/lit8 v7, v14, 0x2

    :goto_8
    add-int/lit8 v10, v3, -0x1

    if-lez v3, :cond_1a

    .line 3801
    invoke-direct {v8, v1, v7}, Ll/ܿ᩶ۚ;->ᩳ([CI)Ljava/lang/String;

    move-result-object v3

    .line 797
    invoke-virtual {v2, v3}, Ll/᩹᩶ۚ;->ۧ(Ljava/lang/String;)V

    add-int/lit8 v7, v7, 0x2

    move v3, v10

    goto :goto_8

    .line 803
    :cond_1a
    invoke-virtual {v8, v11}, Ll/ܿ᩶ۚ;->ܿ(I)I

    move-result v3

    add-int/lit8 v41, v0, 0x8

    move/from16 v0, v41

    :goto_9
    add-int/lit8 v7, v3, -0x1

    if-lez v3, :cond_1b

    .line 3786
    invoke-direct {v8, v1, v0}, Ll/ܿ᩶ۚ;->ᩳ([CI)Ljava/lang/String;

    move-result-object v3

    add-int/lit8 v10, v0, 0x2

    .line 808
    invoke-virtual {v8, v10}, Ll/ܿ᩶ۚ;->ܿ(I)I

    move-result v10

    add-int/lit8 v11, v0, 0x4

    .line 809
    invoke-virtual {v8, v1, v11}, Ll/ܿ᩶ۚ;->ۧ([CI)Ljava/lang/String;

    move-result-object v11

    add-int/lit8 v0, v0, 0x6

    .line 811
    invoke-virtual {v2, v10, v3, v11}, Ll/᩹᩶ۚ;->֫(ILjava/lang/String;Ljava/lang/String;)V

    move v3, v7

    goto :goto_9

    .line 815
    :cond_1b
    invoke-virtual {v8, v0}, Ll/ܿ᩶ۚ;->ܿ(I)I

    move-result v3

    add-int/lit8 v0, v0, 0x2

    :goto_a
    add-int/lit8 v7, v3, -0x1

    if-lez v3, :cond_1e

    .line 3801
    invoke-direct {v8, v1, v0}, Ll/ܿ᩶ۚ;->ᩳ([CI)Ljava/lang/String;

    move-result-object v3

    add-int/lit8 v10, v0, 0x2

    .line 821
    invoke-virtual {v8, v10}, Ll/ܿ᩶ۚ;->ܿ(I)I

    move-result v10

    add-int/lit8 v11, v0, 0x4

    .line 822
    invoke-virtual {v8, v11}, Ll/ܿ᩶ۚ;->ܿ(I)I

    move-result v11

    add-int/lit8 v0, v0, 0x6

    if-eqz v11, :cond_1c

    .line 826
    new-array v14, v11, [Ljava/lang/String;

    const/16 v20, 0x0

    move/from16 p2, v7

    const/4 v7, 0x0

    :goto_b
    if-ge v7, v11, :cond_1d

    .line 3786
    invoke-direct {v8, v1, v0}, Ll/ܿ᩶ۚ;->ᩳ([CI)Ljava/lang/String;

    move-result-object v20

    .line 828
    aput-object v20, v14, v7

    add-int/lit8 v0, v0, 0x2

    add-int/lit8 v7, v7, 0x1

    goto :goto_b

    :cond_1c
    move/from16 p2, v7

    const/4 v14, 0x0

    .line 832
    :cond_1d
    invoke-virtual {v2, v3, v10, v14}, Ll/᩹᩶ۚ;->֫(Ljava/lang/String;I[Ljava/lang/String;)V

    move/from16 v3, p2

    goto :goto_a

    .line 836
    :cond_1e
    invoke-virtual {v8, v0}, Ll/ܿ᩶ۚ;->ܿ(I)I

    move-result v3

    add-int/lit8 v0, v0, 0x2

    :goto_c
    add-int/lit8 v7, v3, -0x1

    if-lez v3, :cond_21

    .line 3801
    invoke-direct {v8, v1, v0}, Ll/ܿ᩶ۚ;->ᩳ([CI)Ljava/lang/String;

    move-result-object v3

    add-int/lit8 v10, v0, 0x2

    .line 841
    invoke-virtual {v8, v10}, Ll/ܿ᩶ۚ;->ܿ(I)I

    move-result v10

    add-int/lit8 v11, v0, 0x4

    .line 842
    invoke-virtual {v8, v11}, Ll/ܿ᩶ۚ;->ܿ(I)I

    move-result v11

    add-int/lit8 v0, v0, 0x6

    if-eqz v11, :cond_1f

    .line 846
    new-array v14, v11, [Ljava/lang/String;

    const/16 v20, 0x0

    move/from16 p2, v7

    const/4 v7, 0x0

    :goto_d
    if-ge v7, v11, :cond_20

    .line 3786
    invoke-direct {v8, v1, v0}, Ll/ܿ᩶ۚ;->ᩳ([CI)Ljava/lang/String;

    move-result-object v20

    .line 848
    aput-object v20, v14, v7

    add-int/lit8 v0, v0, 0x2

    add-int/lit8 v7, v7, 0x1

    goto :goto_d

    :cond_1f
    move/from16 p2, v7

    const/4 v14, 0x0

    .line 852
    :cond_20
    invoke-virtual {v2, v3, v10, v14}, Ll/᩹᩶ۚ;->ۧ(Ljava/lang/String;I[Ljava/lang/String;)V

    move/from16 v3, p2

    goto :goto_c

    .line 856
    :cond_21
    invoke-virtual {v8, v0}, Ll/ܿ᩶ۚ;->ܿ(I)I

    move-result v3

    add-int/lit8 v0, v0, 0x2

    :goto_e
    add-int/lit8 v7, v3, -0x1

    if-lez v3, :cond_22

    .line 3771
    invoke-direct {v8, v1, v0}, Ll/ܿ᩶ۚ;->ᩳ([CI)Ljava/lang/String;

    move-result-object v3

    .line 859
    invoke-virtual {v2, v3}, Ll/᩹᩶ۚ;->ܽ(Ljava/lang/String;)V

    add-int/lit8 v0, v0, 0x2

    move v3, v7

    goto :goto_e

    .line 864
    :cond_22
    invoke-virtual {v8, v0}, Ll/ܿ᩶ۚ;->ܿ(I)I

    move-result v3

    add-int/lit8 v0, v0, 0x2

    :goto_f
    add-int/lit8 v7, v3, -0x1

    if-lez v3, :cond_24

    .line 3771
    invoke-direct {v8, v1, v0}, Ll/ܿ᩶ۚ;->ᩳ([CI)Ljava/lang/String;

    move-result-object v3

    add-int/lit8 v10, v0, 0x2

    .line 869
    invoke-virtual {v8, v10}, Ll/ܿ᩶ۚ;->ܿ(I)I

    move-result v10

    add-int/lit8 v0, v0, 0x4

    .line 871
    new-array v11, v10, [Ljava/lang/String;

    const/4 v14, 0x0

    :goto_10
    if-ge v14, v10, :cond_23

    .line 3771
    invoke-direct {v8, v1, v0}, Ll/ܿ᩶ۚ;->ᩳ([CI)Ljava/lang/String;

    move-result-object v20

    .line 873
    aput-object v20, v11, v14

    add-int/lit8 v0, v0, 0x2

    add-int/lit8 v14, v14, 0x1

    goto :goto_10

    .line 876
    :cond_23
    invoke-virtual {v2, v3, v11}, Ll/᩹᩶ۚ;->֫(Ljava/lang/String;[Ljava/lang/String;)V

    move v3, v7

    goto :goto_f

    .line 880
    :cond_24
    invoke-virtual {v2}, Ll/᩹᩶ۚ;->֫()V

    goto :goto_11

    :cond_25
    move/from16 v16, v10

    move-object/from16 v18, v11

    move-object/from16 v9, v20

    :goto_11
    move-object/from16 v0, v30

    if-eqz v0, :cond_26

    .line 587
    invoke-virtual {v5, v0}, Ll/᩻᩶ۚ;->֫(Ljava/lang/String;)V

    :cond_26
    move/from16 v0, v32

    if-eqz v0, :cond_29

    .line 3771
    invoke-direct {v8, v13, v0}, Ll/ܿ᩶ۚ;->ᩳ([CI)Ljava/lang/String;

    move-result-object v1

    add-int/lit8 v0, v0, 0x2

    .line 593
    invoke-virtual {v8, v0}, Ll/ܿ᩶ۚ;->ܿ(I)I

    move-result v0

    if-nez v0, :cond_27

    const/4 v2, 0x0

    goto :goto_12

    .line 594
    :cond_27
    aget v2, v25, v0

    invoke-virtual {v8, v13, v2}, Ll/ܿ᩶ۚ;->ۧ([CI)Ljava/lang/String;

    move-result-object v2

    :goto_12
    if-nez v0, :cond_28

    const/4 v0, 0x0

    goto :goto_13

    .line 595
    :cond_28
    aget v0, v25, v0

    add-int/lit8 v0, v0, 0x2

    invoke-virtual {v8, v13, v0}, Ll/ܿ᩶ۚ;->ۧ([CI)Ljava/lang/String;

    move-result-object v0

    .line 596
    :goto_13
    invoke-virtual {v5, v1, v2, v0}, Ll/᩻᩶ۚ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :cond_29
    move/from16 v0, v33

    if-eqz v0, :cond_2a

    .line 601
    invoke-virtual {v8, v0}, Ll/ܿ᩶ۚ;->ܿ(I)I

    move-result v1

    add-int/lit8 v33, v0, 0x2

    move/from16 v0, v33

    :goto_14
    add-int/lit8 v2, v1, -0x1

    if-lez v1, :cond_2a

    .line 605
    invoke-virtual {v8, v13, v0}, Ll/ܿ᩶ۚ;->ۧ([CI)Ljava/lang/String;

    move-result-object v1

    add-int/lit8 v0, v0, 0x2

    const/4 v3, 0x1

    .line 610
    invoke-virtual {v5, v1, v3}, Ll/᩻᩶ۚ;->֫(Ljava/lang/String;Z)Ll/ܰ᩹ۚ;

    move-result-object v1

    .line 609
    invoke-direct {v8, v1, v0, v3, v13}, Ll/ܿ᩶ۚ;->֫(Ll/ܰ᩹ۚ;IZ[C)I

    move-result v0

    move v1, v2

    goto :goto_14

    :cond_2a
    move/from16 v0, v34

    if-eqz v0, :cond_2b

    .line 619
    invoke-virtual {v8, v0}, Ll/ܿ᩶ۚ;->ܿ(I)I

    move-result v1

    add-int/lit8 v34, v0, 0x2

    move/from16 v0, v34

    :goto_15
    add-int/lit8 v2, v1, -0x1

    if-lez v1, :cond_2b

    .line 623
    invoke-virtual {v8, v13, v0}, Ll/ܿ᩶ۚ;->ۧ([CI)Ljava/lang/String;

    move-result-object v1

    add-int/lit8 v0, v0, 0x2

    const/4 v3, 0x0

    .line 628
    invoke-virtual {v5, v1, v3}, Ll/᩻᩶ۚ;->֫(Ljava/lang/String;Z)Ll/ܰ᩹ۚ;

    move-result-object v1

    const/4 v3, 0x1

    .line 627
    invoke-direct {v8, v1, v0, v3, v13}, Ll/ܿ᩶ۚ;->֫(Ll/ܰ᩹ۚ;IZ[C)I

    move-result v0

    move v1, v2

    goto :goto_15

    :cond_2b
    move/from16 v0, v35

    if-eqz v0, :cond_2c

    .line 637
    invoke-virtual {v8, v0}, Ll/ܿ᩶ۚ;->ܿ(I)I

    move-result v1

    add-int/lit8 v35, v0, 0x2

    move/from16 v0, v35

    :goto_16
    add-int/lit8 v2, v1, -0x1

    if-lez v1, :cond_2c

    .line 641
    invoke-direct {v8, v9, v0}, Ll/ܿ᩶ۚ;->֫(Ll/ۡ᩶ۚ;I)I

    move-result v0

    .line 643
    invoke-virtual {v8, v13, v0}, Ll/ܿ᩶ۚ;->ۧ([CI)Ljava/lang/String;

    move-result-object v1

    add-int/lit8 v0, v0, 0x2

    .line 646
    iget v3, v9, Ll/ۡ᩶ۚ;->֡:I

    iget-object v7, v9, Ll/ۡ᩶ۚ;->ۚ:Ll/᩺᩶ۚ;

    const/4 v10, 0x1

    .line 648
    invoke-virtual {v5, v3, v7, v1, v10}, Ll/᩻᩶ۚ;->֫(ILl/᩺᩶ۚ;Ljava/lang/String;Z)Ll/ܰ᩹ۚ;

    move-result-object v1

    .line 647
    invoke-direct {v8, v1, v0, v10, v13}, Ll/ܿ᩶ۚ;->֫(Ll/ܰ᩹ۚ;IZ[C)I

    move-result v0

    move v1, v2

    goto :goto_16

    :cond_2c
    move/from16 v0, v36

    if-eqz v0, :cond_2d

    .line 661
    invoke-virtual {v8, v0}, Ll/ܿ᩶ۚ;->ܿ(I)I

    move-result v1

    add-int/lit8 v36, v0, 0x2

    move/from16 v0, v36

    :goto_17
    add-int/lit8 v2, v1, -0x1

    if-lez v1, :cond_2d

    .line 665
    invoke-direct {v8, v9, v0}, Ll/ܿ᩶ۚ;->֫(Ll/ۡ᩶ۚ;I)I

    move-result v0

    .line 667
    invoke-virtual {v8, v13, v0}, Ll/ܿ᩶ۚ;->ۧ([CI)Ljava/lang/String;

    move-result-object v1

    add-int/lit8 v0, v0, 0x2

    .line 670
    iget v3, v9, Ll/ۡ᩶ۚ;->֡:I

    iget-object v7, v9, Ll/ۡ᩶ۚ;->ۚ:Ll/᩺᩶ۚ;

    const/4 v10, 0x0

    .line 672
    invoke-virtual {v5, v3, v7, v1, v10}, Ll/᩻᩶ۚ;->֫(ILl/᩺᩶ۚ;Ljava/lang/String;Z)Ll/ܰ᩹ۚ;

    move-result-object v1

    const/4 v3, 0x1

    .line 671
    invoke-direct {v8, v1, v0, v3, v13}, Ll/ܿ᩶ۚ;->֫(Ll/ܰ᩹ۚ;IZ[C)I

    move-result v0

    move v1, v2

    goto :goto_17

    :cond_2d
    move-object/from16 v0, v31

    :goto_18
    if-eqz v0, :cond_2e

    .line 686
    iget-object v1, v0, Ll/ܽ᩶ۚ;->ۧ:Ll/ܽ᩶ۚ;

    const/4 v2, 0x0

    .line 687
    iput-object v2, v0, Ll/ܽ᩶ۚ;->ۧ:Ll/ܽ᩶ۚ;

    .line 688
    invoke-virtual {v5, v0}, Ll/᩻᩶ۚ;->֫(Ll/ܽ᩶ۚ;)V

    move-object v0, v1

    goto :goto_18

    :cond_2e
    move/from16 v0, v37

    if-eqz v0, :cond_2f

    .line 694
    invoke-virtual {v8, v0}, Ll/ܿ᩶ۚ;->ܿ(I)I

    move-result v1

    add-int/lit8 v37, v0, 0x2

    move/from16 v0, v37

    :goto_19
    add-int/lit8 v2, v1, -0x1

    if-lez v1, :cond_2f

    .line 3771
    invoke-direct {v8, v13, v0}, Ll/ܿ᩶ۚ;->ᩳ([CI)Ljava/lang/String;

    move-result-object v1

    .line 697
    invoke-virtual {v5, v1}, Ll/᩻᩶ۚ;->ۧ(Ljava/lang/String;)V

    add-int/lit8 v0, v0, 0x2

    move v1, v2

    goto :goto_19

    :cond_2f
    move/from16 v0, v38

    if-eqz v0, :cond_30

    .line 704
    invoke-virtual {v8, v0}, Ll/ܿ᩶ۚ;->ܿ(I)I

    move-result v1

    add-int/lit8 v38, v0, 0x2

    move/from16 v0, v38

    :goto_1a
    add-int/lit8 v2, v1, -0x1

    if-lez v1, :cond_30

    .line 3771
    invoke-direct {v8, v13, v0}, Ll/ܿ᩶ۚ;->ᩳ([CI)Ljava/lang/String;

    move-result-object v1

    .line 707
    invoke-virtual {v5, v1}, Ll/᩻᩶ۚ;->ܽ(Ljava/lang/String;)V

    add-int/lit8 v0, v0, 0x2

    move v1, v2

    goto :goto_1a

    :cond_30
    move/from16 v0, v39

    if-eqz v0, :cond_31

    .line 715
    invoke-virtual {v8, v0}, Ll/ܿ᩶ۚ;->ܿ(I)I

    move-result v1

    add-int/lit8 v39, v0, 0x2

    move/from16 v0, v39

    :goto_1b
    add-int/lit8 v2, v1, -0x1

    if-lez v1, :cond_31

    .line 3771
    invoke-direct {v8, v13, v0}, Ll/ܿ᩶ۚ;->ᩳ([CI)Ljava/lang/String;

    move-result-object v1

    add-int/lit8 v3, v0, 0x2

    invoke-direct {v8, v13, v3}, Ll/ܿ᩶ۚ;->ᩳ([CI)Ljava/lang/String;

    move-result-object v3

    add-int/lit8 v7, v0, 0x4

    .line 721
    invoke-virtual {v8, v13, v7}, Ll/ܿ᩶ۚ;->ۧ([CI)Ljava/lang/String;

    move-result-object v7

    add-int/lit8 v10, v0, 0x6

    .line 722
    invoke-virtual {v8, v10}, Ll/ܿ᩶ۚ;->ܿ(I)I

    move-result v10

    .line 718
    invoke-virtual {v5, v1, v10, v3, v7}, Ll/᩻᩶ۚ;->֫(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    add-int/lit8 v0, v0, 0x8

    move v1, v2

    goto :goto_1b

    :cond_31
    move/from16 v0, v40

    if-eqz v0, :cond_3f

    .line 729
    invoke-virtual {v8, v0}, Ll/ܿ᩶ۚ;->ܿ(I)I

    move-result v1

    add-int/lit8 v40, v0, 0x2

    move-object v2, v8

    move/from16 v0, v40

    :goto_1c
    add-int/lit8 v10, v1, -0x1

    if-lez v1, :cond_3e

    .line 893
    iget-object v11, v9, Ll/ۡ᩶ۚ;->ۧ:[C

    .line 896
    invoke-virtual {v2, v11, v0}, Ll/ܿ᩶ۚ;->ۧ([CI)Ljava/lang/String;

    move-result-object v13

    add-int/lit8 v1, v0, 0x2

    .line 897
    invoke-virtual {v2, v11, v1}, Ll/ܿ᩶ۚ;->ۧ([CI)Ljava/lang/String;

    move-result-object v14

    add-int/lit8 v1, v0, 0x4

    .line 918
    invoke-virtual {v2, v1}, Ll/ܿ᩶ۚ;->ܿ(I)I

    move-result v1

    add-int/lit8 v0, v0, 0x6

    const/4 v3, 0x0

    const/4 v7, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    move-object/from16 v44, v21

    move-object/from16 v45, v22

    const/4 v3, 0x0

    const/4 v7, 0x0

    const/16 v43, 0x0

    const/16 v46, 0x0

    :goto_1d
    add-int/lit8 v20, v1, -0x1

    if-lez v1, :cond_37

    .line 922
    invoke-virtual {v2, v11, v0}, Ll/ܿ᩶ۚ;->ۧ([CI)Ljava/lang/String;

    move-result-object v1

    move/from16 p2, v3

    add-int/lit8 v3, v0, 0x2

    .line 923
    invoke-virtual {v2, v3}, Ll/ܿ᩶ۚ;->ۧ(I)I

    move-result v21

    add-int/lit8 v3, v0, 0x6

    .line 927
    invoke-virtual {v15, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_32

    .line 928
    invoke-virtual {v2, v11, v3}, Ll/ܿ᩶ۚ;->ۧ([CI)Ljava/lang/String;

    move-result-object v44

    goto :goto_1e

    .line 929
    :cond_32
    invoke-virtual {v12, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_33

    move v7, v3

    goto :goto_1e

    .line 931
    :cond_33
    invoke-virtual {v6, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_34

    move/from16 v43, v3

    :goto_1e
    move-object/from16 v0, v18

    goto :goto_1f

    .line 933
    :cond_34
    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_35

    move/from16 v23, v3

    move-object/from16 v49, v4

    move/from16 p2, v10

    move-object/from16 v47, v18

    move-object/from16 v10, v24

    move-object/from16 v18, v6

    goto :goto_20

    :cond_35
    move-object/from16 v0, v18

    .line 935
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_36

    move/from16 v46, v3

    :goto_1f
    move-object/from16 v47, v0

    move/from16 v23, v3

    move-object/from16 v49, v4

    move-object/from16 v18, v6

    move/from16 v3, p2

    move/from16 p2, v10

    move-object/from16 v10, v24

    goto :goto_20

    .line 938
    :cond_36
    iget-object v2, v9, Ll/ۡ᩶ۚ;->֫:[Ll/ܽ᩶ۚ;

    const/16 v18, -0x1

    const/16 v22, 0x0

    move-object/from16 v47, v0

    move-object/from16 v0, p0

    move-object/from16 v23, v1

    move-object v1, v2

    move-object/from16 v2, v23

    move/from16 v48, p2

    move/from16 v23, v3

    move-object/from16 v49, v4

    move/from16 v4, v21

    move-object v5, v11

    move-object v8, v6

    move/from16 v6, v18

    move-object/from16 v18, v8

    move/from16 p2, v10

    move-object/from16 v10, v24

    move v8, v7

    move-object/from16 v7, v22

    .line 939
    invoke-direct/range {v0 .. v7}, Ll/ܿ᩶ۚ;->֫([Ll/ܽ᩶ۚ;Ljava/lang/String;II[CI[Ll/֨᩶ۚ;)Ll/ܽ᩶ۚ;

    move-result-object v0

    move-object/from16 v1, v45

    .line 947
    iput-object v1, v0, Ll/ܽ᩶ۚ;->ۧ:Ll/ܽ᩶ۚ;

    move-object/from16 v2, p0

    move-object/from16 v45, v0

    move v7, v8

    move/from16 v3, v48

    :goto_20
    add-int v0, v23, v21

    move-object/from16 v8, p0

    move-object/from16 v5, p1

    move-object/from16 v24, v10

    move-object/from16 v6, v18

    move/from16 v1, v20

    move-object/from16 v18, v47

    move-object/from16 v4, v49

    move/from16 v10, p2

    goto/16 :goto_1d

    :cond_37
    move/from16 v48, v3

    move-object/from16 v49, v4

    move v8, v7

    move/from16 p2, v10

    move-object/from16 v47, v18

    move-object/from16 v10, v24

    move-object/from16 v3, v44

    move-object/from16 v1, v45

    move-object/from16 v18, v6

    move-object v6, v5

    .line 954
    invoke-virtual {v6, v13, v14, v3}, Ll/᩻᩶ۚ;->ۧ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ۙ᩶ۚ;

    move-result-object v3

    if-nez v3, :cond_38

    goto/16 :goto_26

    :cond_38
    if-eqz v8, :cond_39

    .line 961
    invoke-virtual {v2, v8}, Ll/ܿ᩶ۚ;->ܿ(I)I

    move-result v4

    add-int/lit8 v7, v8, 0x2

    :goto_21
    add-int/lit8 v5, v4, -0x1

    if-lez v4, :cond_39

    .line 965
    invoke-virtual {v2, v11, v7}, Ll/ܿ᩶ۚ;->ۧ([CI)Ljava/lang/String;

    move-result-object v4

    add-int/lit8 v7, v7, 0x2

    const/4 v8, 0x1

    .line 970
    invoke-virtual {v3, v4, v8}, Ll/ۙ᩶ۚ;->֫(Ljava/lang/String;Z)Ll/ܰ᩹ۚ;

    move-result-object v4

    .line 969
    invoke-direct {v2, v4, v7, v8, v11}, Ll/ܿ᩶ۚ;->֫(Ll/ܰ᩹ۚ;IZ[C)I

    move-result v7

    move v4, v5

    goto :goto_21

    :cond_39
    move/from16 v7, v48

    if-eqz v7, :cond_3a

    .line 979
    invoke-virtual {v2, v7}, Ll/ܿ᩶ۚ;->ܿ(I)I

    move-result v4

    add-int/lit8 v5, v7, 0x2

    :goto_22
    add-int/lit8 v7, v4, -0x1

    if-lez v4, :cond_3a

    .line 983
    invoke-virtual {v2, v11, v5}, Ll/ܿ᩶ۚ;->ۧ([CI)Ljava/lang/String;

    move-result-object v4

    add-int/lit8 v5, v5, 0x2

    const/4 v8, 0x0

    .line 988
    invoke-virtual {v3, v4, v8}, Ll/ۙ᩶ۚ;->֫(Ljava/lang/String;Z)Ll/ܰ᩹ۚ;

    move-result-object v4

    const/4 v8, 0x1

    .line 987
    invoke-direct {v2, v4, v5, v8, v11}, Ll/ܿ᩶ۚ;->֫(Ll/ܰ᩹ۚ;IZ[C)I

    move-result v5

    move v4, v7

    goto :goto_22

    :cond_3a
    move/from16 v4, v43

    if-eqz v4, :cond_3b

    .line 997
    invoke-virtual {v2, v4}, Ll/ܿ᩶ۚ;->ܿ(I)I

    move-result v5

    add-int/lit8 v43, v4, 0x2

    move/from16 v4, v43

    :goto_23
    add-int/lit8 v7, v5, -0x1

    if-lez v5, :cond_3b

    .line 1001
    invoke-direct {v2, v9, v4}, Ll/ܿ᩶ۚ;->֫(Ll/ۡ᩶ۚ;I)I

    move-result v4

    .line 1003
    invoke-virtual {v2, v11, v4}, Ll/ܿ᩶ۚ;->ۧ([CI)Ljava/lang/String;

    move-result-object v5

    add-int/lit8 v4, v4, 0x2

    .line 1006
    iget v8, v9, Ll/ۡ᩶ۚ;->֡:I

    iget-object v13, v9, Ll/ۡ᩶ۚ;->ۚ:Ll/᩺᩶ۚ;

    const/4 v14, 0x1

    .line 1008
    invoke-virtual {v3, v8, v13, v5, v14}, Ll/ۙ᩶ۚ;->֫(ILl/᩺᩶ۚ;Ljava/lang/String;Z)Ll/ܰ᩹ۚ;

    move-result-object v5

    .line 1007
    invoke-direct {v2, v5, v4, v14, v11}, Ll/ܿ᩶ۚ;->֫(Ll/ܰ᩹ۚ;IZ[C)I

    move-result v4

    move v5, v7

    goto :goto_23

    :cond_3b
    move/from16 v4, v46

    if-eqz v4, :cond_3c

    .line 1021
    invoke-virtual {v2, v4}, Ll/ܿ᩶ۚ;->ܿ(I)I

    move-result v5

    add-int/lit8 v46, v4, 0x2

    move/from16 v4, v46

    :goto_24
    add-int/lit8 v7, v5, -0x1

    if-lez v5, :cond_3c

    .line 1025
    invoke-direct {v2, v9, v4}, Ll/ܿ᩶ۚ;->֫(Ll/ۡ᩶ۚ;I)I

    move-result v4

    .line 1027
    invoke-virtual {v2, v11, v4}, Ll/ܿ᩶ۚ;->ۧ([CI)Ljava/lang/String;

    move-result-object v5

    add-int/lit8 v4, v4, 0x2

    .line 1030
    iget v8, v9, Ll/ۡ᩶ۚ;->֡:I

    iget-object v13, v9, Ll/ۡ᩶ۚ;->ۚ:Ll/᩺᩶ۚ;

    const/4 v14, 0x0

    .line 1032
    invoke-virtual {v3, v8, v13, v5, v14}, Ll/ۙ᩶ۚ;->֫(ILl/᩺᩶ۚ;Ljava/lang/String;Z)Ll/ܰ᩹ۚ;

    move-result-object v5

    const/4 v8, 0x1

    .line 1031
    invoke-direct {v2, v5, v4, v8, v11}, Ll/ܿ᩶ۚ;->֫(Ll/ܰ᩹ۚ;IZ[C)I

    move-result v4

    move v5, v7

    goto :goto_24

    :cond_3c
    :goto_25
    if-eqz v1, :cond_3d

    .line 1046
    iget-object v4, v1, Ll/ܽ᩶ۚ;->ۧ:Ll/ܽ᩶ۚ;

    const/4 v5, 0x0

    .line 1047
    iput-object v5, v1, Ll/ܽ᩶ۚ;->ۧ:Ll/ܽ᩶ۚ;

    .line 1048
    invoke-virtual {v3, v1}, Ll/ۙ᩶ۚ;->֫(Ll/ܽ᩶ۚ;)V

    move-object v1, v4

    goto :goto_25

    .line 1053
    :cond_3d
    invoke-virtual {v3}, Ll/ۙ᩶ۚ;->֫()V

    :goto_26
    move-object/from16 v8, p0

    move/from16 v1, p2

    move-object v5, v6

    move-object/from16 v24, v10

    move-object/from16 v6, v18

    move-object/from16 v18, v47

    move-object/from16 v4, v49

    goto/16 :goto_1c

    :cond_3e
    move-object/from16 v49, v4

    move-object/from16 v47, v18

    move-object/from16 v10, v24

    move-object/from16 v18, v6

    move-object v6, v5

    move-object v7, v2

    goto :goto_27

    :cond_3f
    move-object/from16 v49, v4

    move-object/from16 v47, v18

    move-object/from16 v10, v24

    move-object/from16 v18, v6

    move-object v6, v5

    move-object/from16 v7, p0

    :goto_27
    move/from16 v0, v16

    .line 737
    invoke-virtual {v7, v0}, Ll/ܿ᩶ۚ;->ܿ(I)I

    move-result v1

    add-int/lit8 v0, v0, 0x2

    :goto_28
    add-int/lit8 v8, v1, -0x1

    if-lez v1, :cond_50

    .line 1067
    iget-object v11, v9, Ll/ۡ᩶ۚ;->ۧ:[C

    .line 1071
    invoke-virtual {v7, v0}, Ll/ܿ᩶ۚ;->ܿ(I)I

    move-result v1

    add-int/lit8 v2, v0, 0x2

    .line 1072
    invoke-virtual {v7, v11, v2}, Ll/ܿ᩶ۚ;->ۧ([CI)Ljava/lang/String;

    move-result-object v2

    add-int/lit8 v3, v0, 0x4

    .line 1073
    invoke-virtual {v7, v11, v3}, Ll/ܿ᩶ۚ;->ۧ([CI)Ljava/lang/String;

    move-result-object v3

    add-int/lit8 v4, v0, 0x6

    .line 1094
    invoke-virtual {v7, v4}, Ll/ܿ᩶ۚ;->ܿ(I)I

    move-result v4

    add-int/lit8 v0, v0, 0x8

    const/4 v5, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v16, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    move v13, v0

    move-object v14, v5

    move/from16 p2, v8

    move-object/from16 v5, v20

    move-object/from16 v16, v21

    const/16 p3, 0x0

    const/4 v0, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    :goto_29
    add-int/lit8 v28, v4, -0x1

    if-lez v4, :cond_49

    .line 1098
    invoke-virtual {v7, v11, v13}, Ll/ܿ᩶ۚ;->ۧ([CI)Ljava/lang/String;

    move-result-object v4

    move/from16 v29, v0

    add-int/lit8 v0, v13, 0x2

    .line 1099
    invoke-virtual {v7, v0}, Ll/ܿ᩶ۚ;->ۧ(I)I

    move-result v0

    add-int/lit8 v13, v13, 0x6

    move/from16 v30, v8

    const-string v8, "ConstantValue"

    .line 1103
    invoke-virtual {v8, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_41

    .line 1104
    invoke-virtual {v7, v13}, Ll/ܿ᩶ۚ;->ܿ(I)I

    move-result v4

    if-nez v4, :cond_40

    const/4 v4, 0x0

    goto :goto_2a

    .line 1105
    :cond_40
    invoke-virtual {v7, v11, v4}, Ll/ܿ᩶ۚ;->֫([CI)Ljava/lang/Object;

    move-result-object v4

    :goto_2a
    move-object/from16 v16, v4

    move-object/from16 v8, v17

    goto :goto_2b

    .line 1106
    :cond_41
    invoke-virtual {v15, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_42

    .line 1107
    invoke-virtual {v7, v11, v13}, Ll/ܿ᩶ۚ;->ۧ([CI)Ljava/lang/String;

    move-result-object v5

    move/from16 v4, p3

    move-object/from16 v8, v18

    goto :goto_2d

    :cond_42
    move-object/from16 v8, v17

    .line 1108
    invoke-virtual {v8, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_43

    or-int v1, v1, v19

    goto :goto_2b

    .line 1110
    :cond_43
    invoke-virtual {v10, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_44

    or-int/lit16 v1, v1, 0x1000

    :goto_2b
    move-object/from16 v17, v8

    :goto_2c
    move-object/from16 v8, v47

    goto :goto_2e

    .line 1112
    :cond_44
    invoke-virtual {v12, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_45

    move/from16 v4, p3

    move-object/from16 v17, v8

    move v6, v13

    goto :goto_30

    :cond_45
    move-object/from16 v17, v8

    move-object/from16 v8, v18

    .line 1114
    invoke-virtual {v8, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_46

    move v4, v13

    :goto_2d
    move-object/from16 v18, v8

    move-object/from16 v8, v47

    goto :goto_2f

    :cond_46
    move-object/from16 v18, v8

    move-object/from16 v8, v49

    .line 1116
    invoke-virtual {v8, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v20

    if-eqz v20, :cond_47

    move-object/from16 v49, v8

    move/from16 v30, v13

    goto :goto_2c

    :cond_47
    move-object/from16 v49, v8

    move-object/from16 v8, v47

    .line 1118
    invoke-virtual {v8, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v20

    if-eqz v20, :cond_48

    move/from16 v29, v13

    :goto_2e
    move/from16 v4, p3

    :goto_2f
    move-object/from16 v47, v8

    :goto_30
    move/from16 v8, v30

    goto :goto_31

    :cond_48
    move-object/from16 v47, v8

    .line 1121
    iget-object v8, v9, Ll/ۡ᩶ۚ;->֫:[Ll/ܽ᩶ۚ;

    const/16 v26, -0x1

    const/16 v27, 0x0

    move-object/from16 v20, v7

    move-object/from16 v21, v8

    move-object/from16 v22, v4

    move/from16 v23, v13

    move/from16 v24, v0

    move-object/from16 v25, v11

    .line 1122
    invoke-direct/range {v20 .. v27}, Ll/ܿ᩶ۚ;->֫([Ll/ܽ᩶ۚ;Ljava/lang/String;II[CI[Ll/֨᩶ۚ;)Ll/ܽ᩶ۚ;

    move-result-object v4

    .line 1130
    iput-object v14, v4, Ll/ܽ᩶ۚ;->ۧ:Ll/ܽ᩶ۚ;

    move-object v14, v4

    move/from16 v8, v30

    move/from16 v4, p3

    :goto_31
    add-int/2addr v13, v0

    move/from16 p3, v4

    move/from16 v4, v28

    move/from16 v0, v29

    goto/16 :goto_29

    :cond_49
    move/from16 v30, v8

    move v8, v0

    move-object/from16 v0, p1

    move-object v4, v5

    move-object/from16 v5, v16

    .line 1138
    invoke-virtual/range {v0 .. v5}, Ll/᩻᩶ۚ;->֫(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Ll/ۘ᩶ۚ;

    move-result-object v0

    if-nez v0, :cond_4a

    goto/16 :goto_37

    :cond_4a
    if-eqz v6, :cond_4b

    .line 1145
    invoke-virtual {v7, v6}, Ll/ܿ᩶ۚ;->ܿ(I)I

    move-result v1

    add-int/lit8 v6, v6, 0x2

    :goto_32
    add-int/lit8 v2, v1, -0x1

    if-lez v1, :cond_4b

    .line 1149
    invoke-virtual {v7, v11, v6}, Ll/ܿ᩶ۚ;->ۧ([CI)Ljava/lang/String;

    move-result-object v1

    add-int/lit8 v6, v6, 0x2

    const/4 v3, 0x1

    .line 1154
    invoke-virtual {v0, v1, v3}, Ll/ۘ᩶ۚ;->֫(Ljava/lang/String;Z)Ll/ܰ᩹ۚ;

    move-result-object v1

    .line 1153
    invoke-direct {v7, v1, v6, v3, v11}, Ll/ܿ᩶ۚ;->֫(Ll/ܰ᩹ۚ;IZ[C)I

    move-result v6

    move v1, v2

    goto :goto_32

    :cond_4b
    if-eqz v30, :cond_4c

    move/from16 v1, v30

    .line 1163
    invoke-virtual {v7, v1}, Ll/ܿ᩶ۚ;->ܿ(I)I

    move-result v2

    add-int/lit8 v1, v1, 0x2

    :goto_33
    add-int/lit8 v3, v2, -0x1

    if-lez v2, :cond_4c

    .line 1167
    invoke-virtual {v7, v11, v1}, Ll/ܿ᩶ۚ;->ۧ([CI)Ljava/lang/String;

    move-result-object v2

    add-int/lit8 v1, v1, 0x2

    const/4 v4, 0x0

    .line 1172
    invoke-virtual {v0, v2, v4}, Ll/ۘ᩶ۚ;->֫(Ljava/lang/String;Z)Ll/ܰ᩹ۚ;

    move-result-object v2

    const/4 v4, 0x1

    .line 1171
    invoke-direct {v7, v2, v1, v4, v11}, Ll/ܿ᩶ۚ;->֫(Ll/ܰ᩹ۚ;IZ[C)I

    move-result v1

    move v2, v3

    goto :goto_33

    :cond_4c
    if-eqz p3, :cond_4d

    move/from16 v4, p3

    .line 1181
    invoke-virtual {v7, v4}, Ll/ܿ᩶ۚ;->ܿ(I)I

    move-result v1

    add-int/lit8 v2, v4, 0x2

    :goto_34
    add-int/lit8 v3, v1, -0x1

    if-lez v1, :cond_4d

    .line 1185
    invoke-direct {v7, v9, v2}, Ll/ܿ᩶ۚ;->֫(Ll/ۡ᩶ۚ;I)I

    move-result v1

    .line 1187
    invoke-virtual {v7, v11, v1}, Ll/ܿ᩶ۚ;->ۧ([CI)Ljava/lang/String;

    move-result-object v2

    add-int/lit8 v1, v1, 0x2

    .line 1190
    iget v4, v9, Ll/ۡ᩶ۚ;->֡:I

    iget-object v5, v9, Ll/ۡ᩶ۚ;->ۚ:Ll/᩺᩶ۚ;

    const/4 v6, 0x1

    .line 1192
    invoke-virtual {v0, v4, v5, v2, v6}, Ll/ۘ᩶ۚ;->֫(ILl/᩺᩶ۚ;Ljava/lang/String;Z)Ll/ܰ᩹ۚ;

    move-result-object v2

    .line 1191
    invoke-direct {v7, v2, v1, v6, v11}, Ll/ܿ᩶ۚ;->֫(Ll/ܰ᩹ۚ;IZ[C)I

    move-result v2

    move v1, v3

    goto :goto_34

    :cond_4d
    if-eqz v8, :cond_4e

    .line 1205
    invoke-virtual {v7, v8}, Ll/ܿ᩶ۚ;->ܿ(I)I

    move-result v1

    add-int/lit8 v2, v8, 0x2

    :goto_35
    add-int/lit8 v3, v1, -0x1

    if-lez v1, :cond_4e

    .line 1209
    invoke-direct {v7, v9, v2}, Ll/ܿ᩶ۚ;->֫(Ll/ۡ᩶ۚ;I)I

    move-result v1

    .line 1211
    invoke-virtual {v7, v11, v1}, Ll/ܿ᩶ۚ;->ۧ([CI)Ljava/lang/String;

    move-result-object v2

    add-int/lit8 v1, v1, 0x2

    .line 1214
    iget v4, v9, Ll/ۡ᩶ۚ;->֡:I

    iget-object v5, v9, Ll/ۡ᩶ۚ;->ۚ:Ll/᩺᩶ۚ;

    const/4 v6, 0x0

    .line 1216
    invoke-virtual {v0, v4, v5, v2, v6}, Ll/ۘ᩶ۚ;->֫(ILl/᩺᩶ۚ;Ljava/lang/String;Z)Ll/ܰ᩹ۚ;

    move-result-object v2

    const/4 v4, 0x1

    .line 1215
    invoke-direct {v7, v2, v1, v4, v11}, Ll/ܿ᩶ۚ;->֫(Ll/ܰ᩹ۚ;IZ[C)I

    move-result v2

    move v1, v3

    goto :goto_35

    :cond_4e
    :goto_36
    if-eqz v14, :cond_4f

    .line 1230
    iget-object v1, v14, Ll/ܽ᩶ۚ;->ۧ:Ll/ܽ᩶ۚ;

    const/4 v2, 0x0

    .line 1231
    iput-object v2, v14, Ll/ܽ᩶ۚ;->ۧ:Ll/ܽ᩶ۚ;

    .line 1232
    invoke-virtual {v0, v14}, Ll/ۘ᩶ۚ;->֫(Ll/ܽ᩶ۚ;)V

    move-object v14, v1

    goto :goto_36

    .line 1237
    :cond_4f
    invoke-virtual {v0}, Ll/ۘ᩶ۚ;->֫()V

    :goto_37
    move-object/from16 v6, p1

    move/from16 v1, p2

    move v0, v13

    goto/16 :goto_28

    .line 742
    :cond_50
    invoke-virtual {v7, v0}, Ll/ܿ᩶ۚ;->ܿ(I)I

    move-result v1

    add-int/lit8 v0, v0, 0x2

    :goto_38
    add-int/lit8 v2, v1, -0x1

    if-lez v1, :cond_51

    move-object/from16 v1, p1

    .line 745
    invoke-direct {v7, v1, v9, v0}, Ll/ܿ᩶ۚ;->֫(Ll/᩻᩶ۚ;Ll/ۡ᩶ۚ;I)I

    move-result v0

    move v1, v2

    goto :goto_38

    :cond_51
    move-object/from16 v1, p1

    .line 749
    invoke-virtual/range {p1 .. p1}, Ll/᩻᩶ۚ;->֫()V

    return-void
.end method

.method public final ۧ(I)I
    .locals 3

    .line 3650
    iget-object v0, p0, Ll/ܿ᩶ۚ;->ۧ:[B

    aget-byte v1, v0, p1

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x18

    add-int/lit8 v2, p1, 0x1

    aget-byte v2, v0, v2

    and-int/lit16 v2, v2, 0xff

    shl-int/lit8 v2, v2, 0x10

    or-int/2addr v1, v2

    add-int/lit8 v2, p1, 0x2

    aget-byte v2, v0, v2

    and-int/lit16 v2, v2, 0xff

    shl-int/lit8 v2, v2, 0x8

    or-int/2addr v1, v2

    add-int/lit8 p1, p1, 0x3

    aget-byte p1, v0, p1

    and-int/lit16 p1, p1, 0xff

    or-int/2addr p1, v1

    return p1
.end method

.method public final ۧ([CI)Ljava/lang/String;
    .locals 1

    .line 3682
    invoke-virtual {p0, p2}, Ll/ܿ᩶ۚ;->ܿ(I)I

    move-result v0

    if-eqz p2, :cond_1

    if-nez v0, :cond_0

    goto :goto_0

    .line 3686
    :cond_0
    invoke-virtual {p0, p1, v0}, Ll/ܿ᩶ۚ;->ܽ([CI)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final ܽ(I)J
    .locals 6

    .line 3664
    invoke-virtual {p0, p1}, Ll/ܿ᩶ۚ;->ۧ(I)I

    move-result v0

    int-to-long v0, v0

    add-int/lit8 p1, p1, 0x4

    .line 3665
    invoke-virtual {p0, p1}, Ll/ܿ᩶ۚ;->ۧ(I)I

    move-result p1

    int-to-long v2, p1

    const-wide v4, 0xffffffffL

    and-long/2addr v2, v4

    const/16 p1, 0x20

    shl-long/2addr v0, p1

    or-long/2addr v0, v2

    return-wide v0
.end method

.method public final ܽ([CI)Ljava/lang/String;
    .locals 3

    .line 3699
    iget-object v0, p0, Ll/ܿ᩶ۚ;->ᩳ:[Ljava/lang/String;

    aget-object v1, v0, p2

    if-eqz v1, :cond_0

    return-object v1

    .line 3703
    :cond_0
    iget-object v1, p0, Ll/ܿ᩶ۚ;->ܿ:[I

    aget v1, v1, p2

    add-int/lit8 v2, v1, 0x2

    .line 3705
    invoke-virtual {p0, v1}, Ll/ܿ᩶ۚ;->ܿ(I)I

    move-result v1

    invoke-direct {p0, p1, v2, v1}, Ll/ܿ᩶ۚ;->֫([CII)Ljava/lang/String;

    move-result-object p1

    aput-object p1, v0, p2

    return-object p1
.end method

.method public final ܿ(I)I
    .locals 2

    .line 3626
    iget-object v0, p0, Ll/ܿ᩶ۚ;->ۧ:[B

    aget-byte v1, v0, p1

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x8

    add-int/lit8 p1, p1, 0x1

    aget-byte p1, v0, p1

    and-int/lit16 p1, p1, 0xff

    or-int/2addr p1, v1

    return p1
.end method

.method public final ᩳ(I)S
    .locals 2

    .line 3638
    iget-object v0, p0, Ll/ܿ᩶ۚ;->ۧ:[B

    aget-byte v1, v0, p1

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x8

    add-int/lit8 p1, p1, 0x1

    aget-byte p1, v0, p1

    and-int/lit16 p1, p1, 0xff

    or-int/2addr p1, v1

    int-to-short p1, p1

    return p1
.end method
