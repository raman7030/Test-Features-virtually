.class public final Ll/ۚ᩷ۧ;
.super Ljava/lang/Object;
.source "88T8"


# static fields
.field public static final ֫:[I

.field public static final ۜ:[I

.field public static final ۧ:[I

.field public static final ܳ:[I

.field public static final ܽ:[I

.field public static final ܿ:[I

.field public static final ᩳ:[I

.field public static final ᩷:[I

.field public static final ᩻:[I


# direct methods
.method public static constructor <clinit>()V
    .locals 9

    const/16 v0, 0x10

    new-array v1, v0, [I

    .line 192
    fill-array-data v1, :array_0

    sput-object v1, Ll/ۚ᩷ۧ;->֫:[I

    new-array v1, v0, [I

    .line 196
    fill-array-data v1, :array_1

    sput-object v1, Ll/ۚ᩷ۧ;->ܽ:[I

    const/16 v1, 0x1d

    new-array v1, v1, [I

    .line 203
    fill-array-data v1, :array_2

    sput-object v1, Ll/ۚ᩷ۧ;->ᩳ:[I

    new-array v1, v0, [I

    .line 213
    fill-array-data v1, :array_3

    sput-object v1, Ll/ۚ᩷ۧ;->ۧ:[I

    const/4 v1, 0x5

    const/16 v2, 0x8

    const/16 v3, 0xa

    const/16 v4, 0xc

    .line 223
    filled-new-array {v1, v2, v3, v4}, [I

    move-result-object v5

    sput-object v5, Ll/ۚ᩷ۧ;->᩻:[I

    const/16 v5, 0xf

    const/4 v6, 0x6

    const/16 v7, 0x9

    .line 226
    filled-new-array {v6, v7, v4, v5}, [I

    move-result-object v5

    sput-object v5, Ll/ۚ᩷ۧ;->᩷:[I

    const/4 v5, 0x2

    const/4 v8, 0x4

    .line 229
    filled-new-array {v5, v8, v6, v2}, [I

    move-result-object v5

    sput-object v5, Ll/ۚ᩷ۧ;->ܿ:[I

    const/16 v5, 0xb

    const/16 v6, 0xd

    .line 232
    filled-new-array {v7, v5, v6, v0}, [I

    move-result-object v0

    sput-object v0, Ll/ۚ᩷ۧ;->ܳ:[I

    .line 235
    filled-new-array {v1, v2, v3, v4}, [I

    move-result-object v0

    sput-object v0, Ll/ۚ᩷ۧ;->ۜ:[I

    return-void

    nop

    :array_0
    .array-data 4
        0x1
        0x2
        0x2
        0x2
        0x2
        0x3
        0x3
        0x4
        0x4
        0x5
        0x6
        0x6
        0x6
        0x7
        0x8
        0x8
    .end array-data

    :array_1
    .array-data 4
        -0x1
        0x1f40
        0x3e80
        0x7d00
        -0x1
        -0x1
        0x2b11
        0x5622
        0xac44
        -0x1
        -0x1
        0x2ee0
        0x5dc0
        0xbb80
        -0x1
        -0x1
    .end array-data

    :array_2
    .array-data 4
        0x40
        0x70
        0x80
        0xc0
        0xe0
        0x100
        0x180
        0x1c0
        0x200
        0x280
        0x300
        0x380
        0x400
        0x480
        0x500
        0x600
        0x780
        0x800
        0x900
        0xa00
        0xa80
        0xb00
        0xb07
        0xb80
        0xc00
        0xf00
        0x1000
        0x1800
        0x1e00
    .end array-data

    :array_3
    .array-data 4
        0x1f40
        0x3e80
        0x7d00
        0xfa00
        0x1f400
        0x5622
        0xac44
        0x15888
        0x2b110
        0x56220
        0x2ee0
        0x5dc0
        0xbb80
        0x17700
        0x2ee00
        0x5dc00
    .end array-data
.end method

.method public static ֫(Ll/ܽ֨֫;[I)I
    .locals 5

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    const/4 v3, 0x3

    if-ge v1, v3, :cond_0

    .line 706
    invoke-virtual {p0}, Ll/ܽ֨֫;->ܿ()Z

    move-result v3

    if-eqz v3, :cond_0

    add-int/lit8 v2, v2, 0x1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_1
    if-ge v0, v2, :cond_1

    .line 716
    aget v3, p1, v0

    const/4 v4, 0x1

    shl-int v3, v4, v3

    add-int/2addr v1, v3

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 719
    :cond_1
    aget p1, p1, v2

    invoke-virtual {p0, p1}, Ll/ܽ֨֫;->ۧ(I)I

    move-result p0

    add-int/2addr p0, v1

    return p0
.end method

.method public static ֫([BLjava/util/concurrent/atomic/AtomicInteger;)Ll/֡᩷ۧ;
    .locals 16

    move-object/from16 v0, p0

    .line 554
    invoke-static/range {p0 .. p0}, Ll/ۚ᩷ۧ;->֫([B)Ll/ܽ֨֫;

    move-result-object v1

    const/16 v2, 0x20

    .line 555
    invoke-virtual {v1, v2}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v2

    const v3, 0x40411bf2

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-ne v2, v3, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    .line 558
    :goto_0
    sget-object v3, Ll/ۚ᩷ۧ;->᩻:[I

    .line 559
    invoke-static {v1, v3}, Ll/ۚ᩷ۧ;->֫(Ll/ܽ֨֫;[I)I

    move-result v3

    add-int/lit8 v6, v3, 0x1

    if-eqz v2, :cond_a

    .line 568
    invoke-virtual {v1}, Ll/ܽ֨֫;->ܿ()Z

    move-result v7

    if-eqz v7, :cond_9

    add-int/lit8 v7, v3, -0x1

    .line 689
    aget-byte v8, v0, v7

    shl-int/lit8 v8, v8, 0x8

    const v9, 0xffff

    and-int/2addr v8, v9

    aget-byte v3, v0, v3

    and-int/lit16 v3, v3, 0xff

    or-int/2addr v3, v8

    .line 691
    invoke-static {v7, v0}, Ll/ۘ֨֫;->֫(I[B)I

    move-result v0

    const/4 v7, 0x0

    if-ne v3, v0, :cond_8

    const/4 v0, 0x2

    .line 576
    invoke-virtual {v1, v0}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v3

    if-eqz v3, :cond_3

    if-eq v3, v5, :cond_2

    if-ne v3, v0, :cond_1

    const/16 v3, 0x180

    goto :goto_1

    .line 590
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Unsupported base duration index in DTS UHD header: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v7}, Ll/ۡ᩵֫;->֫(Ljava/lang/String;Ljava/lang/Throwable;)Ll/ۡ᩵֫;

    move-result-object v0

    throw v0

    :cond_2
    const/16 v3, 0x1e0

    goto :goto_1

    :cond_3
    const/16 v3, 0x200

    :goto_1
    const/4 v8, 0x3

    .line 596
    invoke-virtual {v1, v8}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v8

    add-int/2addr v8, v5

    mul-int v8, v8, v3

    .line 597
    invoke-virtual {v1, v0}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v3

    if-eqz v3, :cond_6

    if-eq v3, v5, :cond_5

    if-ne v3, v0, :cond_4

    const v3, 0xbb80

    goto :goto_2

    .line 610
    :cond_4
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Unsupported clock rate index in DTS UHD header: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v7}, Ll/ۡ᩵֫;->֫(Ljava/lang/String;Ljava/lang/Throwable;)Ll/ۡ᩵֫;

    move-result-object v0

    throw v0

    :cond_5
    const v3, 0xac44

    goto :goto_2

    :cond_6
    const/16 v3, 0x7d00

    .line 615
    :goto_2
    invoke-virtual {v1}, Ll/ܽ֨֫;->ܿ()Z

    move-result v7

    if-eqz v7, :cond_7

    const/16 v7, 0x24

    .line 617
    invoke-virtual {v1, v7}, Ll/ܽ֨֫;->ܿ(I)V

    .line 619
    :cond_7
    invoke-virtual {v1, v0}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v0

    shl-int v0, v5, v0

    mul-int v0, v0, v3

    int-to-long v9, v8

    int-to-long v13, v3

    .line 1955
    sget-object v15, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    const-wide/32 v11, 0xf4240

    invoke-static/range {v9 .. v15}, Ll/ۘ֨֫;->֫(JJJLjava/math/RoundingMode;)J

    move-result-wide v7

    move v11, v0

    move-wide v13, v7

    goto :goto_3

    :cond_8
    const-string v0, "CRC check failed"

    .line 693
    invoke-static {v0, v7}, Ll/ۡ᩵֫;->֫(Ljava/lang/String;Ljava/lang/Throwable;)Ll/ۡ᩵֫;

    move-result-object v0

    throw v0

    :cond_9
    const-string v0, "Only supports full channel mask-based audio presentation"

    .line 569
    invoke-static {v0}, Ll/ۡ᩵֫;->ۧ(Ljava/lang/String;)Ll/ۡ᩵֫;

    move-result-object v0

    throw v0

    :cond_a
    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    const v0, -0x7fffffff

    move-wide v13, v7

    const v11, -0x7fffffff

    :goto_3
    const/4 v0, 0x0

    const/4 v3, 0x0

    :goto_4
    if-ge v0, v2, :cond_b

    .line 631
    sget-object v5, Ll/ۚ᩷ۧ;->᩷:[I

    .line 632
    invoke-static {v1, v5}, Ll/ۚ᩷ۧ;->֫(Ll/ܽ֨֫;[I)I

    move-result v5

    add-int/2addr v3, v5

    add-int/lit8 v0, v0, 0x1

    goto :goto_4

    :cond_b
    if-eqz v2, :cond_c

    .line 643
    sget-object v0, Ll/ۚ᩷ۧ;->ܿ:[I

    .line 644
    invoke-static {v1, v0}, Ll/ۚ᩷ۧ;->֫(Ll/ܽ֨֫;[I)I

    move-result v0

    move-object/from16 v2, p1

    .line 643
    invoke-virtual {v2, v0}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    goto :goto_5

    :cond_c
    move-object/from16 v2, p1

    .line 648
    :goto_5
    invoke-virtual/range {p1 .. p1}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    if-eqz v0, :cond_d

    .line 649
    sget-object v0, Ll/ۚ᩷ۧ;->ܳ:[I

    invoke-static {v1, v0}, Ll/ۚ᩷ۧ;->֫(Ll/ܽ֨֫;[I)I

    move-result v4

    :cond_d
    add-int/2addr v3, v4

    add-int v12, v3, v6

    .line 656
    new-instance v0, Ll/֡᩷ۧ;

    const-string v15, "audio/vnd.dts.uhd;profile=p2"

    const/4 v10, 0x2

    move-object v9, v0

    invoke-direct/range {v9 .. v15}, Ll/֡᩷ۧ;-><init>(IIIJLjava/lang/String;)V

    return-object v0
.end method

.method public static ֫(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[B)Ll/۠ᩴ֫;
    .locals 5

    .line 276
    invoke-static {p4}, Ll/ۚ᩷ۧ;->֫([B)Ll/ܽ֨֫;

    move-result-object p4

    const/16 v0, 0x3c

    .line 277
    invoke-virtual {p4, v0}, Ll/ܽ֨֫;->ܿ(I)V

    const/4 v0, 0x6

    .line 278
    invoke-virtual {p4, v0}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v0

    .line 279
    sget-object v1, Ll/ۚ᩷ۧ;->֫:[I

    aget v0, v1, v0

    const/4 v1, 0x4

    .line 280
    invoke-virtual {p4, v1}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v1

    .line 281
    sget-object v2, Ll/ۚ᩷ۧ;->ܽ:[I

    aget v1, v2, v1

    const/4 v2, 0x5

    .line 282
    invoke-virtual {p4, v2}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v2

    const/16 v3, 0x1d

    const/4 v4, 0x2

    if-lt v2, v3, :cond_0

    const/4 v2, -0x1

    goto :goto_0

    .line 286
    :cond_0
    sget-object v3, Ll/ۚ᩷ۧ;->ᩳ:[I

    aget v2, v3, v2

    mul-int/lit16 v2, v2, 0x3e8

    div-int/2addr v2, v4

    :goto_0
    const/16 v3, 0xa

    .line 287
    invoke-virtual {p4, v3}, Ll/ܽ֨֫;->ܿ(I)V

    .line 288
    invoke-virtual {p4, v4}, Ll/ܽ֨֫;->ۧ(I)I

    move-result p4

    if-lez p4, :cond_1

    const/4 p4, 0x1

    goto :goto_1

    :cond_1
    const/4 p4, 0x0

    :goto_1
    add-int/2addr v0, p4

    .line 289
    new-instance p4, Ll/֨ᩴ֫;

    invoke-direct {p4}, Ll/֨ᩴ֫;-><init>()V

    .line 290
    invoke-virtual {p4, p1}, Ll/֨ᩴ֫;->ܽ(Ljava/lang/String;)V

    .line 291
    invoke-virtual {p4, p3}, Ll/֨ᩴ֫;->ۧ(Ljava/lang/String;)V

    const-string p1, "audio/vnd.dts"

    .line 292
    invoke-virtual {p4, p1}, Ll/֨ᩴ֫;->ܳ(Ljava/lang/String;)V

    .line 293
    invoke-virtual {p4, v2}, Ll/֨ᩴ֫;->ܽ(I)V

    .line 294
    invoke-virtual {p4, v0}, Ll/֨ᩴ֫;->ᩳ(I)V

    .line 295
    invoke-virtual {p4, v1}, Ll/֨ᩴ֫;->۠(I)V

    const/4 p1, 0x0

    .line 296
    invoke-virtual {p4, p1}, Ll/֨ᩴ֫;->֫(Ll/᩵ᩴ֫;)V

    .line 297
    invoke-virtual {p4, p2}, Ll/֨ᩴ֫;->ܿ(Ljava/lang/String;)V

    .line 298
    invoke-virtual {p4, p0}, Ll/֨ᩴ֫;->ۚ(I)V

    .line 299
    invoke-virtual {p4}, Ll/֨ᩴ֫;->֫()Ll/۠ᩴ֫;

    move-result-object p0

    return-object p0
.end method

.method public static ֫([B)Ll/ܽ֨֫;
    .locals 5

    const/4 v0, 0x0

    .line 723
    aget-byte v1, p0, v0

    const/16 v2, 0x7f

    if-eq v1, v2, :cond_4

    const/16 v2, 0x64

    if-eq v1, v2, :cond_4

    const/16 v2, 0x40

    if-eq v1, v2, :cond_4

    const/16 v2, 0x71

    if-ne v1, v2, :cond_0

    goto :goto_2

    .line 731
    :cond_0
    array-length v1, p0

    invoke-static {p0, v1}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object p0

    .line 754
    aget-byte v1, p0, v0

    const/4 v2, -0x2

    if-eq v1, v2, :cond_1

    const/4 v2, -0x1

    if-eq v1, v2, :cond_1

    const/16 v2, 0x25

    if-eq v1, v2, :cond_1

    const/16 v2, -0xe

    if-eq v1, v2, :cond_1

    const/16 v2, -0x18

    if-ne v1, v2, :cond_2

    :cond_1
    const/4 v1, 0x0

    .line 734
    :goto_0
    array-length v2, p0

    add-int/lit8 v2, v2, -0x1

    if-ge v1, v2, :cond_2

    .line 735
    aget-byte v2, p0, v1

    add-int/lit8 v3, v1, 0x1

    .line 736
    aget-byte v4, p0, v3

    aput-byte v4, p0, v1

    .line 737
    aput-byte v2, p0, v3

    add-int/lit8 v1, v1, 0x2

    goto :goto_0

    .line 740
    :cond_2
    new-instance v1, Ll/ܽ֨֫;

    .line 48
    array-length v2, p0

    invoke-direct {v1, p0, v2}, Ll/ܽ֨֫;-><init>([BI)V

    .line 741
    aget-byte v0, p0, v0

    const/16 v2, 0x1f

    if-ne v0, v2, :cond_3

    .line 743
    new-instance v0, Ll/ܽ֨֫;

    .line 48
    array-length v2, p0

    invoke-direct {v0, p0, v2}, Ll/ܽ֨֫;-><init>([BI)V

    .line 744
    :goto_1
    invoke-virtual {v0}, Ll/ܽ֨֫;->֫()I

    move-result v2

    const/16 v3, 0x10

    if-lt v2, v3, :cond_3

    const/4 v2, 0x2

    .line 745
    invoke-virtual {v0, v2}, Ll/ܽ֨֫;->ܿ(I)V

    const/16 v2, 0xe

    .line 746
    invoke-virtual {v0, v2}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v2

    invoke-virtual {v1, v2}, Ll/ܽ֨֫;->֫(I)V

    goto :goto_1

    .line 68
    :cond_3
    array-length v0, p0

    invoke-virtual {v1, v0, p0}, Ll/ܽ֨֫;->ܽ(I[B)V

    return-object v1

    .line 728
    :cond_4
    :goto_2
    new-instance v0, Ll/ܽ֨֫;

    .line 48
    array-length v1, p0

    invoke-direct {v0, p0, v1}, Ll/ܽ֨֫;-><init>([BI)V

    return-object v0
.end method

.method public static ۧ([B)Ll/֡᩷ۧ;
    .locals 19

    .line 404
    invoke-static/range {p0 .. p0}, Ll/ۚ᩷ۧ;->֫([B)Ll/ܽ֨֫;

    move-result-object v0

    const/16 v1, 0x28

    .line 405
    invoke-virtual {v0, v1}, Ll/ܽ֨֫;->ܿ(I)V

    const/4 v1, 0x2

    .line 407
    invoke-virtual {v0, v1}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v2

    .line 410
    invoke-virtual {v0}, Ll/ܽ֨֫;->ܿ()Z

    move-result v3

    const/16 v4, 0xc

    const/16 v5, 0x8

    if-nez v3, :cond_0

    const/16 v3, 0x10

    const/16 v6, 0x8

    goto :goto_0

    :cond_0
    const/16 v3, 0x14

    const/16 v6, 0xc

    .line 417
    :goto_0
    invoke-virtual {v0, v6}, Ll/ܽ֨֫;->ܿ(I)V

    .line 419
    invoke-virtual {v0, v3}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v6

    const/4 v7, 0x1

    add-int/lit8 v11, v6, 0x1

    .line 425
    invoke-virtual {v0}, Ll/ܽ֨֫;->ܿ()Z

    move-result v6

    const/4 v8, -0x1

    const/4 v9, 0x0

    if-eqz v6, :cond_6

    .line 427
    invoke-virtual {v0, v1}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v10

    const/4 v12, 0x3

    .line 428
    invoke-virtual {v0, v12}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v13

    add-int/2addr v13, v7

    mul-int/lit16 v13, v13, 0x200

    .line 430
    invoke-virtual {v0}, Ll/ܽ֨֫;->ܿ()Z

    move-result v14

    if-eqz v14, :cond_1

    const/16 v14, 0x24

    .line 431
    invoke-virtual {v0, v14}, Ll/ܽ֨֫;->ܿ(I)V

    .line 434
    :cond_1
    invoke-virtual {v0, v12}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v14

    add-int/2addr v14, v7

    .line 435
    invoke-virtual {v0, v12}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v12

    add-int/2addr v12, v7

    if-ne v14, v7, :cond_5

    if-ne v12, v7, :cond_5

    add-int/2addr v2, v7

    .line 443
    invoke-virtual {v0, v2}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v12

    const/4 v14, 0x0

    :goto_1
    if-ge v14, v2, :cond_3

    shr-int v15, v12, v14

    and-int/2addr v15, v7

    if-ne v15, v7, :cond_2

    .line 447
    invoke-virtual {v0, v5}, Ll/ܽ֨֫;->ܿ(I)V

    :cond_2
    add-int/lit8 v14, v14, 0x1

    goto :goto_1

    .line 451
    :cond_3
    invoke-virtual {v0}, Ll/ܽ֨֫;->ܿ()Z

    move-result v2

    if-eqz v2, :cond_4

    .line 452
    invoke-virtual {v0, v1}, Ll/ܽ֨֫;->ܿ(I)V

    .line 453
    invoke-virtual {v0, v1}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v2

    add-int/2addr v2, v7

    shl-int/2addr v2, v1

    .line 454
    invoke-virtual {v0, v1}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v12

    add-int/2addr v12, v7

    :goto_2
    if-ge v9, v12, :cond_4

    .line 457
    invoke-virtual {v0, v2}, Ll/ܽ֨֫;->ܿ(I)V

    add-int/lit8 v9, v9, 0x1

    goto :goto_2

    :cond_4
    move v9, v13

    goto :goto_3

    :cond_5
    const-string v0, "Multiple audio presentations or assets not supported"

    .line 437
    invoke-static {v0}, Ll/ۡ᩵֫;->ۧ(Ljava/lang/String;)Ll/ۡ᩵֫;

    move-result-object v0

    throw v0

    :cond_6
    const/4 v10, -0x1

    .line 468
    :goto_3
    invoke-virtual {v0, v3}, Ll/ܽ֨֫;->ܿ(I)V

    .line 473
    invoke-virtual {v0, v4}, Ll/ܽ֨֫;->ܿ(I)V

    if-eqz v6, :cond_a

    .line 475
    invoke-virtual {v0}, Ll/ܽ֨֫;->ܿ()Z

    move-result v2

    const/4 v3, 0x4

    if-eqz v2, :cond_7

    .line 476
    invoke-virtual {v0, v3}, Ll/ܽ֨֫;->ܿ(I)V

    .line 478
    :cond_7
    invoke-virtual {v0}, Ll/ܽ֨֫;->ܿ()Z

    move-result v2

    if-eqz v2, :cond_8

    const/16 v2, 0x18

    .line 479
    invoke-virtual {v0, v2}, Ll/ܽ֨֫;->ܿ(I)V

    .line 481
    :cond_8
    invoke-virtual {v0}, Ll/ܽ֨֫;->ܿ()Z

    move-result v2

    if-eqz v2, :cond_9

    const/16 v2, 0xa

    .line 482
    invoke-virtual {v0, v2}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v2

    add-int/2addr v2, v7

    .line 483
    invoke-virtual {v0, v2}, Ll/ܽ֨֫;->ܳ(I)V

    :cond_9
    const/4 v2, 0x5

    .line 485
    invoke-virtual {v0, v2}, Ll/ܽ֨֫;->ܿ(I)V

    .line 486
    sget-object v2, Ll/ۚ᩷ۧ;->ۧ:[I

    invoke-virtual {v0, v3}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v3

    aget v2, v2, v3

    .line 487
    invoke-virtual {v0, v5}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_4

    :cond_a
    const v0, -0x7fffffff

    const/4 v0, -0x1

    const v2, -0x7fffffff

    :goto_4
    if-eqz v6, :cond_e

    if-eqz v10, :cond_d

    if-eq v10, v7, :cond_c

    if-ne v10, v1, :cond_b

    const v1, 0xbb80

    goto :goto_5

    .line 506
    :cond_b
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Unsupported reference clock code in DTS HD header: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Ll/ۡ᩵֫;->֫(Ljava/lang/String;Ljava/lang/Throwable;)Ll/ۡ᩵֫;

    move-result-object v0

    throw v0

    :cond_c
    const v1, 0xac44

    goto :goto_5

    :cond_d
    const/16 v1, 0x7d00

    :goto_5
    int-to-long v12, v9

    int-to-long v3, v1

    .line 512
    sget-object v1, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    .line 1955
    sget-object v18, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    const-wide/32 v14, 0xf4240

    move-wide/from16 v16, v3

    invoke-static/range {v12 .. v18}, Ll/ۘ֨֫;->֫(JJJLjava/math/RoundingMode;)J

    move-result-wide v3

    goto :goto_6

    :cond_e
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    :goto_6
    move-wide v12, v3

    .line 515
    new-instance v1, Ll/֡᩷ۧ;

    const-string v14, "audio/vnd.dts.hd;profile=lbr"

    move-object v8, v1

    move v9, v0

    move v10, v2

    invoke-direct/range {v8 .. v14}, Ll/֡᩷ۧ;-><init>(IIIJLjava/lang/String;)V

    return-object v1
.end method

.method public static ܽ([B)I
    .locals 1

    .line 532
    invoke-static {p0}, Ll/ۚ᩷ۧ;->֫([B)Ll/ܽ֨֫;

    move-result-object p0

    const/16 v0, 0x2a

    .line 533
    invoke-virtual {p0, v0}, Ll/ܽ֨֫;->ܿ(I)V

    .line 535
    invoke-virtual {p0}, Ll/ܽ֨֫;->ܿ()Z

    move-result v0

    if-eqz v0, :cond_0

    const/16 v0, 0xc

    goto :goto_0

    :cond_0
    const/16 v0, 0x8

    .line 537
    :goto_0
    invoke-virtual {p0, v0}, Ll/ܽ֨֫;->ۧ(I)I

    move-result p0

    add-int/lit8 p0, p0, 0x1

    return p0
.end method

.method public static ᩳ([B)I
    .locals 1

    .line 677
    invoke-static {p0}, Ll/ۚ᩷ۧ;->֫([B)Ll/ܽ֨֫;

    move-result-object p0

    const/16 v0, 0x20

    .line 678
    invoke-virtual {p0, v0}, Ll/ܽ֨֫;->ܿ(I)V

    .line 679
    sget-object v0, Ll/ۚ᩷ۧ;->ۜ:[I

    invoke-static {p0, v0}, Ll/ۚ᩷ۧ;->֫(Ll/ܽ֨֫;[I)I

    move-result p0

    add-int/lit8 p0, p0, 0x1

    return p0
.end method
