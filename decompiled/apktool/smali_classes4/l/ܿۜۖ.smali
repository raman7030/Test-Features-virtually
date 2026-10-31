.class public Ll/ܿۜۖ;
.super Ljava/lang/Object;
.source "2B08"

# interfaces
.implements Ljava/io/Closeable;


# instance fields
.field public ֫֫:[I

.field public ۗ:I

.field public ۙ:I

.field public ۛ:I

.field public ۟:I

.field public ۤ:[Ljava/lang/String;

.field public ۧ֫:I

.field public ۨ:J

.field public ۫:[I

.field public ۬:I

.field public ܰ:Ljava/lang/String;

.field public ܽ֫:Ll/ܺᩳۖ;

.field public ᩶:I

.field public final ᩸:[C

.field public final ᩹:Ljava/io/StringReader;

.field public ᩺:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1859
    new-instance v0, Ll/ᩳۜۖ;

    .line 23
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 1859
    sput-object v0, Ll/᩺ᩳۖ;->֫:Ll/᩺ᩳۖ;

    return-void
.end method

.method public constructor <init>(Ljava/io/StringReader;)V
    .locals 4

    .line 316
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 254
    sget-object v0, Ll/ܺᩳۖ;->᩹:Ll/ܺᩳۖ;

    iput-object v0, p0, Ll/ܿۜۖ;->ܽ֫:Ll/ܺᩳۖ;

    const/16 v0, 0xff

    .line 258
    iput v0, p0, Ll/ܿۜۖ;->۬:I

    const/16 v0, 0x400

    new-array v0, v0, [C

    .line 267
    iput-object v0, p0, Ll/ܿۜۖ;->᩸:[C

    const/4 v0, 0x0

    .line 269
    iput v0, p0, Ll/ܿۜۖ;->۟:I

    .line 270
    iput v0, p0, Ll/ܿۜۖ;->᩶:I

    .line 272
    iput v0, p0, Ll/ܿۜۖ;->ۙ:I

    .line 273
    iput v0, p0, Ll/ܿۜۖ;->ۗ:I

    .line 275
    iput v0, p0, Ll/ܿۜۖ;->ۛ:I

    const/16 v1, 0x20

    new-array v2, v1, [I

    .line 296
    iput-object v2, p0, Ll/ܿۜۖ;->֫֫:[I

    const/4 v3, 0x1

    .line 301
    iput v3, p0, Ll/ܿۜۖ;->ۧ֫:I

    const/4 v3, 0x6

    aput v3, v2, v0

    new-array v0, v1, [Ljava/lang/String;

    .line 312
    iput-object v0, p0, Ll/ܿۜۖ;->ۤ:[Ljava/lang/String;

    new-array v0, v1, [I

    .line 313
    iput-object v0, p0, Ll/ܿۜۖ;->۫:[I

    .line 317
    iput-object p1, p0, Ll/ܿۜۖ;->᩹:Ljava/io/StringReader;

    return-void
.end method

.method public static synthetic ֫(Ll/ܿۜۖ;)Ljava/lang/IllegalStateException;
    .locals 1

    const-string v0, "a name"

    .line 213
    invoke-direct {p0, v0}, Ll/ܿۜۖ;->ۧ(Ljava/lang/String;)Ljava/lang/IllegalStateException;

    move-result-object p0

    return-object p0
.end method

.method private ֫(Z)Ljava/lang/String;
    .locals 4

    .line 1669
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "$"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const/4 v1, 0x0

    .line 1670
    :goto_0
    iget v2, p0, Ll/ܿۜۖ;->ۧ֫:I

    if-ge v1, v2, :cond_2

    .line 1671
    iget-object v3, p0, Ll/ܿۜۖ;->֫֫:[I

    aget v3, v3, v1

    packed-switch v3, :pswitch_data_0

    .line 1695
    new-instance p1, Ljava/lang/AssertionError;

    const-string v0, "Unknown scope value: "

    .line 0
    invoke-static {v3, v0}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 1695
    invoke-direct {p1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1

    :pswitch_0
    const/16 v2, 0x2e

    .line 1685
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 1686
    iget-object v2, p0, Ll/ܿۜۖ;->ۤ:[Ljava/lang/String;

    aget-object v2, v2, v1

    if-eqz v2, :cond_1

    .line 1687
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 1675
    :pswitch_1
    iget-object v3, p0, Ll/ܿۜۖ;->۫:[I

    aget v3, v3, v1

    if-eqz p1, :cond_0

    if-lez v3, :cond_0

    add-int/lit8 v2, v2, -0x1

    if-ne v1, v2, :cond_0

    add-int/lit8 v3, v3, -0x1

    :cond_0
    const/16 v2, 0x5b

    .line 1680
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v2, 0x5d

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_1
    :goto_1
    :pswitch_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 1698
    :cond_2
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_2
        :pswitch_2
        :pswitch_2
    .end packed-switch
.end method

.method private ֫(Ljava/lang/String;)V
    .locals 3

    .line 1816
    new-instance v0, Ll/ۜۜۖ;

    .line 0
    invoke-static {p1}, Ll/ۚ۬ۚ;->֫(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    .line 1817
    invoke-virtual {p0}, Ll/ܿۜۖ;->֡()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\nSee "

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "malformed-json"

    const-string v2, "https://github.com/google/gson/blob/main/Troubleshooting.md#"

    .line 8
    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 1817
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 30
    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 1817
    throw v0
.end method

.method private ֫(I)Z
    .locals 7

    .line 1490
    iget v0, p0, Ll/ܿۜۖ;->ۗ:I

    iget v1, p0, Ll/ܿۜۖ;->۟:I

    sub-int/2addr v0, v1

    iput v0, p0, Ll/ܿۜۖ;->ۗ:I

    .line 1491
    iget v0, p0, Ll/ܿۜۖ;->᩶:I

    const/4 v2, 0x0

    iget-object v3, p0, Ll/ܿۜۖ;->᩸:[C

    if-eq v0, v1, :cond_0

    sub-int/2addr v0, v1

    .line 1492
    iput v0, p0, Ll/ܿۜۖ;->᩶:I

    .line 1493
    invoke-static {v3, v1, v3, v2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    goto :goto_0

    .line 1495
    :cond_0
    iput v2, p0, Ll/ܿۜۖ;->᩶:I

    .line 1498
    :goto_0
    iput v2, p0, Ll/ܿۜۖ;->۟:I

    .line 1500
    :cond_1
    iget v0, p0, Ll/ܿۜۖ;->᩶:I

    array-length v1, v3

    sub-int/2addr v1, v0

    iget-object v4, p0, Ll/ܿۜۖ;->᩹:Ljava/io/StringReader;

    invoke-virtual {v4, v3, v0, v1}, Ljava/io/Reader;->read([CII)I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_3

    .line 1501
    iget v1, p0, Ll/ܿۜۖ;->᩶:I

    add-int/2addr v1, v0

    iput v1, p0, Ll/ܿۜۖ;->᩶:I

    .line 1504
    iget v0, p0, Ll/ܿۜۖ;->ۙ:I

    const/4 v4, 0x1

    if-nez v0, :cond_2

    iget v0, p0, Ll/ܿۜۖ;->ۗ:I

    if-nez v0, :cond_2

    if-lez v1, :cond_2

    aget-char v5, v3, v2

    const v6, 0xfeff

    if-ne v5, v6, :cond_2

    .line 1505
    iget v5, p0, Ll/ܿۜۖ;->۟:I

    add-int/2addr v5, v4

    iput v5, p0, Ll/ܿۜۖ;->۟:I

    add-int/lit8 v0, v0, 0x1

    .line 1506
    iput v0, p0, Ll/ܿۜۖ;->ۗ:I

    add-int/lit8 p1, p1, 0x1

    :cond_2
    if-lt v1, p1, :cond_1

    return v4

    :cond_3
    return v2
.end method

.method private ۟()Ljava/lang/String;
    .locals 7

    const/4 v0, 0x0

    const/4 v1, 0x0

    :cond_0
    const/4 v2, 0x0

    .line 1190
    :goto_0
    iget v3, p0, Ll/ܿۜۖ;->۟:I

    add-int v4, v3, v2

    iget v5, p0, Ll/ܿۜۖ;->᩶:I

    iget-object v6, p0, Ll/ܿۜۖ;->᩸:[C

    if-ge v4, v5, :cond_2

    add-int/2addr v3, v2

    .line 1191
    aget-char v3, v6, v3

    const/16 v4, 0x9

    if-eq v3, v4, :cond_3

    const/16 v4, 0xa

    if-eq v3, v4, :cond_3

    const/16 v4, 0xc

    if-eq v3, v4, :cond_3

    const/16 v4, 0xd

    if-eq v3, v4, :cond_3

    const/16 v4, 0x20

    if-eq v3, v4, :cond_3

    const/16 v4, 0x23

    if-eq v3, v4, :cond_1

    const/16 v4, 0x2c

    if-eq v3, v4, :cond_3

    const/16 v4, 0x2f

    if-eq v3, v4, :cond_1

    const/16 v4, 0x3d

    if-eq v3, v4, :cond_1

    const/16 v4, 0x7b

    if-eq v3, v4, :cond_3

    const/16 v4, 0x7d

    if-eq v3, v4, :cond_3

    const/16 v4, 0x3a

    if-eq v3, v4, :cond_3

    const/16 v4, 0x3b

    if-eq v3, v4, :cond_1

    packed-switch v3, :pswitch_data_0

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 1197
    :cond_1
    :pswitch_0
    invoke-direct {p0}, Ll/ܿۜۖ;->ܰ()V

    goto :goto_1

    .line 1216
    :cond_2
    array-length v3, v6

    if-ge v2, v3, :cond_4

    add-int/lit8 v3, v2, 0x1

    .line 1217
    invoke-direct {p0, v3}, Ll/ܿۜۖ;->֫(I)Z

    move-result v3

    if-eqz v3, :cond_3

    goto :goto_0

    :cond_3
    :goto_1
    :pswitch_1
    move v1, v2

    goto :goto_2

    :cond_4
    if-nez v0, :cond_5

    .line 1226
    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v3, 0x10

    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    move-result v3

    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 1228
    :cond_5
    iget v3, p0, Ll/ܿۜۖ;->۟:I

    invoke-virtual {v0, v6, v3, v2}, Ljava/lang/StringBuilder;->append([CII)Ljava/lang/StringBuilder;

    .line 1229
    iget v3, p0, Ll/ܿۜۖ;->۟:I

    add-int/2addr v3, v2

    iput v3, p0, Ll/ܿۜۖ;->۟:I

    const/4 v2, 0x1

    .line 1231
    invoke-direct {p0, v2}, Ll/ܿۜۖ;->֫(I)Z

    move-result v2

    if-nez v2, :cond_0

    :goto_2
    if-nez v0, :cond_6

    .line 1237
    new-instance v0, Ljava/lang/String;

    iget v2, p0, Ll/ܿۜۖ;->۟:I

    invoke-direct {v0, v6, v2, v1}, Ljava/lang/String;-><init>([CII)V

    goto :goto_3

    :cond_6
    iget v2, p0, Ll/ܿۜۖ;->۟:I

    invoke-virtual {v0, v6, v2, v1}, Ljava/lang/StringBuilder;->append([CII)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 1238
    :goto_3
    iget v2, p0, Ll/ܿۜۖ;->۟:I

    add-int/2addr v2, v1

    iput v2, p0, Ll/ܿۜۖ;->۟:I

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x5b
        :pswitch_1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method private ۧ(Z)I
    .locals 9

    .line 1532
    iget v0, p0, Ll/ܿۜۖ;->۟:I

    .line 1533
    iget v1, p0, Ll/ܿۜۖ;->᩶:I

    :goto_0
    const/4 v2, 0x1

    if-ne v0, v1, :cond_2

    .line 1536
    iput v0, p0, Ll/ܿۜۖ;->۟:I

    .line 1537
    invoke-direct {p0, v2}, Ll/ܿۜۖ;->֫(I)Z

    move-result v0

    if-nez v0, :cond_1

    if-nez p1, :cond_0

    const/4 p1, -0x1

    return p1

    .line 1605
    :cond_0
    new-instance p1, Ljava/io/EOFException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "End of input"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ll/ܿۜۖ;->֡()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 1540
    :cond_1
    iget v0, p0, Ll/ܿۜۖ;->۟:I

    .line 1541
    iget v1, p0, Ll/ܿۜۖ;->᩶:I

    :cond_2
    add-int/lit8 v3, v0, 0x1

    .line 1544
    iget-object v4, p0, Ll/ܿۜۖ;->᩸:[C

    aget-char v5, v4, v0

    const/16 v6, 0xa

    if-ne v5, v6, :cond_3

    .line 1546
    iget v0, p0, Ll/ܿۜۖ;->ۙ:I

    add-int/2addr v0, v2

    iput v0, p0, Ll/ܿۜۖ;->ۙ:I

    .line 1547
    iput v3, p0, Ll/ܿۜۖ;->ۗ:I

    goto/16 :goto_6

    :cond_3
    const/16 v7, 0x20

    if-eq v5, v7, :cond_f

    const/16 v7, 0xd

    if-eq v5, v7, :cond_f

    const/16 v7, 0x9

    if-ne v5, v7, :cond_4

    goto/16 :goto_6

    :cond_4
    const/16 v7, 0x2f

    if-ne v5, v7, :cond_d

    .line 1554
    iput v3, p0, Ll/ܿۜۖ;->۟:I

    const/4 v8, 0x2

    if-ne v3, v1, :cond_5

    .line 1556
    iput v0, p0, Ll/ܿۜۖ;->۟:I

    .line 1557
    invoke-direct {p0, v8}, Ll/ܿۜۖ;->֫(I)Z

    move-result v0

    .line 1558
    iget v1, p0, Ll/ܿۜۖ;->۟:I

    add-int/2addr v1, v2

    iput v1, p0, Ll/ܿۜۖ;->۟:I

    if-nez v0, :cond_5

    goto :goto_1

    .line 1564
    :cond_5
    invoke-direct {p0}, Ll/ܿۜۖ;->ܰ()V

    .line 1565
    iget v0, p0, Ll/ܿۜۖ;->۟:I

    aget-char v1, v4, v0

    const/16 v3, 0x2a

    if-eq v1, v3, :cond_7

    if-eq v1, v7, :cond_6

    :goto_1
    return v5

    :cond_6
    add-int/lit8 v0, v0, 0x1

    .line 1579
    iput v0, p0, Ll/ܿۜۖ;->۟:I

    .line 1580
    invoke-direct {p0}, Ll/ܿۜۖ;->ᩳ֫()V

    .line 1581
    iget v0, p0, Ll/ܿۜۖ;->۟:I

    .line 1582
    iget v1, p0, Ll/ܿۜۖ;->᩶:I

    goto :goto_0

    :cond_7
    add-int/lit8 v0, v0, 0x1

    .line 1569
    iput v0, p0, Ll/ܿۜۖ;->۟:I

    .line 1641
    :goto_2
    iget v0, p0, Ll/ܿۜۖ;->۟:I

    add-int/2addr v0, v8

    iget v1, p0, Ll/ܿۜۖ;->᩶:I

    if-le v0, v1, :cond_9

    invoke-direct {p0, v8}, Ll/ܿۜۖ;->֫(I)Z

    move-result v0

    if-eqz v0, :cond_8

    goto :goto_3

    :cond_8
    const-string p1, "Unterminated comment"

    .line 1571
    invoke-direct {p0, p1}, Ll/ܿۜۖ;->֫(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1

    .line 1642
    :cond_9
    :goto_3
    iget v0, p0, Ll/ܿۜۖ;->۟:I

    aget-char v1, v4, v0

    if-ne v1, v6, :cond_a

    .line 1643
    iget v1, p0, Ll/ܿۜۖ;->ۙ:I

    add-int/2addr v1, v2

    iput v1, p0, Ll/ܿۜۖ;->ۙ:I

    add-int/lit8 v0, v0, 0x1

    .line 1644
    iput v0, p0, Ll/ܿۜۖ;->ۗ:I

    goto :goto_5

    :cond_a
    const/4 v0, 0x0

    :goto_4
    if-ge v0, v8, :cond_c

    .line 1648
    iget v1, p0, Ll/ܿۜۖ;->۟:I

    add-int/2addr v1, v0

    aget-char v1, v4, v1

    const-string v3, "*/"

    invoke-virtual {v3, v0}, Ljava/lang/String;->charAt(I)C

    move-result v3

    if-eq v1, v3, :cond_b

    .line 1641
    :goto_5
    iget v0, p0, Ll/ܿۜۖ;->۟:I

    add-int/2addr v0, v2

    iput v0, p0, Ll/ܿۜۖ;->۟:I

    goto :goto_2

    :cond_b
    add-int/lit8 v0, v0, 0x1

    goto :goto_4

    .line 1573
    :cond_c
    iget v0, p0, Ll/ܿۜۖ;->۟:I

    add-int/2addr v0, v8

    .line 1574
    iget v1, p0, Ll/ܿۜۖ;->᩶:I

    goto/16 :goto_0

    :cond_d
    const/16 v0, 0x23

    if-ne v5, v0, :cond_e

    .line 1589
    iput v3, p0, Ll/ܿۜۖ;->۟:I

    .line 1595
    invoke-direct {p0}, Ll/ܿۜۖ;->ܰ()V

    .line 1596
    invoke-direct {p0}, Ll/ܿۜۖ;->ᩳ֫()V

    .line 1597
    iget v0, p0, Ll/ܿۜۖ;->۟:I

    .line 1598
    iget v1, p0, Ll/ܿۜۖ;->᩶:I

    goto/16 :goto_0

    .line 1600
    :cond_e
    iput v3, p0, Ll/ܿۜۖ;->۟:I

    return v5

    :cond_f
    :goto_6
    move v0, v3

    goto/16 :goto_0
.end method

.method private ۧ(Ljava/lang/String;)Ljava/lang/IllegalStateException;
    .locals 4

    .line 1821
    invoke-virtual {p0}, Ll/ܿۜۖ;->ۤ()Ll/ܳۜۖ;

    move-result-object v0

    .line 1823
    sget-object v1, Ll/ܳۜۖ;->ۛ:Ll/ܳۜۖ;

    if-ne v0, v1, :cond_0

    const-string v0, "adapter-not-null-safe"

    goto :goto_0

    :cond_0
    const-string v0, "unexpected-json-structure"

    .line 1824
    :goto_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "Expected "

    const-string v3, " but was "

    .line 0
    invoke-static {v2, p1, v3}, Ll/ۗۧᩳ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    .line 1828
    invoke-virtual {p0}, Ll/ܿۜۖ;->ۤ()Ll/ܳۜۖ;

    move-result-object v2

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1829
    invoke-virtual {p0}, Ll/ܿۜۖ;->֡()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "\nSee "

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "https://github.com/google/gson/blob/main/Troubleshooting.md#"

    .line 8
    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 1831
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    return-object v1
.end method

.method private ۧ(I)V
    .locals 3

    .line 1470
    iget v0, p0, Ll/ܿۜۖ;->ۧ֫:I

    add-int/lit8 v1, v0, -0x1

    iget v2, p0, Ll/ܿۜۖ;->۬:I

    if-ge v1, v2, :cond_1

    .line 1475
    iget-object v1, p0, Ll/ܿۜۖ;->֫֫:[I

    array-length v2, v1

    if-ne v0, v2, :cond_0

    mul-int/lit8 v0, v0, 0x2

    .line 1477
    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v1

    iput-object v1, p0, Ll/ܿۜۖ;->֫֫:[I

    .line 1478
    iget-object v1, p0, Ll/ܿۜۖ;->۫:[I

    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v1

    iput-object v1, p0, Ll/ܿۜۖ;->۫:[I

    .line 1479
    iget-object v1, p0, Ll/ܿۜۖ;->ۤ:[Ljava/lang/String;

    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    iput-object v0, p0, Ll/ܿۜۖ;->ۤ:[Ljava/lang/String;

    .line 1481
    :cond_0
    iget-object v0, p0, Ll/ܿۜۖ;->֫֫:[I

    iget v1, p0, Ll/ܿۜۖ;->ۧ֫:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Ll/ܿۜۖ;->ۧ֫:I

    aput p1, v0, v1

    return-void

    .line 1471
    :cond_1
    new-instance p1, Ll/ۜۜۖ;

    const-string v0, "Nesting limit "

    const-string v1, " reached"

    .line 0
    invoke-static {v2, v0, v1}, Ll/۬᩵ᩳ;->֫(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 1472
    invoke-virtual {p0}, Ll/ܿۜۖ;->֡()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 30
    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 1472
    throw p1
.end method

.method private ۧ(C)Z
    .locals 1

    const/16 v0, 0x9

    if-eq p1, v0, :cond_1

    const/16 v0, 0xa

    if-eq p1, v0, :cond_1

    const/16 v0, 0xc

    if-eq p1, v0, :cond_1

    const/16 v0, 0xd

    if-eq p1, v0, :cond_1

    const/16 v0, 0x20

    if-eq p1, v0, :cond_1

    const/16 v0, 0x23

    if-eq p1, v0, :cond_0

    const/16 v0, 0x2c

    if-eq p1, v0, :cond_1

    const/16 v0, 0x2f

    if-eq p1, v0, :cond_0

    const/16 v0, 0x3d

    if-eq p1, v0, :cond_0

    const/16 v0, 0x7b

    if-eq p1, v0, :cond_1

    const/16 v0, 0x7d

    if-eq p1, v0, :cond_1

    const/16 v0, 0x3a

    if-eq p1, v0, :cond_1

    const/16 v0, 0x3b

    if-eq p1, v0, :cond_0

    packed-switch p1, :pswitch_data_0

    const/4 p1, 0x1

    return p1

    .line 904
    :cond_0
    :pswitch_0
    invoke-direct {p0}, Ll/ܿۜۖ;->ܰ()V

    :cond_1
    :pswitch_1
    const/4 p1, 0x0

    return p1

    :pswitch_data_0
    .packed-switch 0x5b
        :pswitch_1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method private ۧ֫()C
    .locals 9

    .line 1746
    iget v0, p0, Ll/ܿۜۖ;->۟:I

    iget v1, p0, Ll/ܿۜۖ;->᩶:I

    const/4 v2, 0x0

    const-string v3, "Unterminated escape sequence"

    const/4 v4, 0x1

    if-ne v0, v1, :cond_1

    invoke-direct {p0, v4}, Ll/ܿۜۖ;->֫(I)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 1747
    :cond_0
    invoke-direct {p0, v3}, Ll/ܿۜۖ;->֫(Ljava/lang/String;)V

    throw v2

    .line 1750
    :cond_1
    :goto_0
    iget v0, p0, Ll/ܿۜۖ;->۟:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Ll/ܿۜۖ;->۟:I

    iget-object v5, p0, Ll/ܿۜۖ;->᩸:[C

    aget-char v6, v5, v0

    const/16 v7, 0xa

    if-eq v6, v7, :cond_e

    const/16 v1, 0x22

    if-eq v6, v1, :cond_10

    const/16 v1, 0x27

    if-eq v6, v1, :cond_f

    const/16 v1, 0x2f

    if-eq v6, v1, :cond_10

    const/16 v1, 0x5c

    if-eq v6, v1, :cond_10

    const/16 v1, 0x62

    if-eq v6, v1, :cond_d

    const/16 v1, 0x66

    if-eq v6, v1, :cond_c

    const/16 v4, 0x6e

    if-eq v6, v4, :cond_b

    const/16 v4, 0x72

    if-eq v6, v4, :cond_a

    const/16 v4, 0x74

    if-eq v6, v4, :cond_9

    const/16 v4, 0x75

    if-ne v6, v4, :cond_8

    add-int/lit8 v0, v0, 0x5

    .line 1753
    iget v4, p0, Ll/ܿۜۖ;->᩶:I

    const/4 v6, 0x4

    if-le v0, v4, :cond_3

    invoke-direct {p0, v6}, Ll/ܿۜۖ;->֫(I)Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_1

    .line 1754
    :cond_2
    invoke-direct {p0, v3}, Ll/ܿۜۖ;->֫(Ljava/lang/String;)V

    throw v2

    .line 1758
    :cond_3
    :goto_1
    iget v0, p0, Ll/ܿۜۖ;->۟:I

    add-int/lit8 v3, v0, 0x4

    const/4 v4, 0x0

    :goto_2
    if-ge v0, v3, :cond_7

    .line 1759
    aget-char v7, v5, v0

    shl-int/lit8 v4, v4, 0x4

    const/16 v8, 0x30

    if-lt v7, v8, :cond_4

    const/16 v8, 0x39

    if-gt v7, v8, :cond_4

    add-int/lit8 v7, v7, -0x30

    goto :goto_3

    :cond_4
    const/16 v8, 0x61

    if-lt v7, v8, :cond_5

    if-gt v7, v1, :cond_5

    add-int/lit8 v7, v7, -0x57

    goto :goto_3

    :cond_5
    const/16 v8, 0x41

    if-lt v7, v8, :cond_6

    const/16 v8, 0x46

    if-gt v7, v8, :cond_6

    add-int/lit8 v7, v7, -0x37

    :goto_3
    add-int/2addr v4, v7

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    .line 1768
    :cond_6
    new-instance v0, Ljava/lang/String;

    iget v1, p0, Ll/ܿۜۖ;->۟:I

    invoke-direct {v0, v5, v1, v6}, Ljava/lang/String;-><init>([CII)V

    const-string v1, "Malformed Unicode escape \\u"

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ll/ܿۜۖ;->֫(Ljava/lang/String;)V

    throw v2

    .line 1771
    :cond_7
    iget v0, p0, Ll/ܿۜۖ;->۟:I

    add-int/2addr v0, v6

    iput v0, p0, Ll/ܿۜۖ;->۟:I

    int-to-char v0, v4

    return v0

    :cond_8
    const-string v0, "Invalid escape sequence"

    .line 1807
    invoke-direct {p0, v0}, Ll/ܿۜۖ;->֫(Ljava/lang/String;)V

    throw v2

    :cond_9
    const/16 v0, 0x9

    return v0

    :cond_a
    const/16 v0, 0xd

    return v0

    :cond_b
    return v7

    :cond_c
    const/16 v0, 0xc

    return v0

    :cond_d
    const/16 v0, 0x8

    return v0

    .line 1790
    :cond_e
    iget-object v0, p0, Ll/ܿۜۖ;->ܽ֫:Ll/ܺᩳۖ;

    sget-object v3, Ll/ܺᩳۖ;->ۙ:Ll/ܺᩳۖ;

    if-eq v0, v3, :cond_12

    .line 1793
    iget v0, p0, Ll/ܿۜۖ;->ۙ:I

    add-int/2addr v0, v4

    iput v0, p0, Ll/ܿۜۖ;->ۙ:I

    .line 1794
    iput v1, p0, Ll/ܿۜۖ;->ۗ:I

    .line 1798
    :cond_f
    iget-object v0, p0, Ll/ܿۜۖ;->ܽ֫:Ll/ܺᩳۖ;

    sget-object v1, Ll/ܺᩳۖ;->ۙ:Ll/ܺᩳۖ;

    if-eq v0, v1, :cond_11

    :cond_10
    return v6

    :cond_11
    const-string v0, "Invalid escaped character \"\'\" in strict mode"

    .line 1799
    invoke-direct {p0, v0}, Ll/ܿۜۖ;->֫(Ljava/lang/String;)V

    throw v2

    :cond_12
    const-string v0, "Cannot escape a newline character in strict mode"

    .line 1791
    invoke-direct {p0, v0}, Ll/ܿۜۖ;->֫(Ljava/lang/String;)V

    throw v2
.end method

.method private ܰ()V
    .locals 2

    .line 1612
    iget-object v0, p0, Ll/ܿۜۖ;->ܽ֫:Ll/ܺᩳۖ;

    sget-object v1, Ll/ܺᩳۖ;->᩶:Ll/ܺᩳۖ;

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    const-string v0, "Use JsonReader.setStrictness(Strictness.LENIENT) to accept malformed JSON"

    .line 1613
    invoke-direct {p0, v0}, Ll/ܿۜۖ;->֫(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method private ܽ(C)Ljava/lang/String;
    .locals 11

    const/4 v0, 0x0

    move-object v1, v0

    .line 1131
    :goto_0
    iget v2, p0, Ll/ܿۜۖ;->۟:I

    .line 1132
    iget v3, p0, Ll/ܿۜۖ;->᩶:I

    :goto_1
    move v4, v2

    :goto_2
    const/16 v5, 0x10

    const/4 v6, 0x1

    .line 1135
    iget-object v7, p0, Ll/ܿۜۖ;->᩸:[C

    if-ge v4, v3, :cond_7

    add-int/lit8 v8, v4, 0x1

    .line 1136
    aget-char v4, v7, v4

    .line 1140
    iget-object v9, p0, Ll/ܿۜۖ;->ܽ֫:Ll/ܺᩳۖ;

    sget-object v10, Ll/ܺᩳۖ;->ۙ:Ll/ܺᩳۖ;

    if-ne v9, v10, :cond_1

    const/16 v9, 0x20

    if-lt v4, v9, :cond_0

    goto :goto_3

    :cond_0
    const-string p1, "Unescaped control characters (\\u0000-\\u001F) are not allowed in strict mode"

    .line 1141
    invoke-direct {p0, p1}, Ll/ܿۜۖ;->֫(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_3
    if-ne v4, p1, :cond_3

    .line 1144
    iput v8, p0, Ll/ܿۜۖ;->۟:I

    sub-int/2addr v8, v2

    sub-int/2addr v8, v6

    if-nez v1, :cond_2

    .line 1147
    new-instance p1, Ljava/lang/String;

    invoke-direct {p1, v7, v2, v8}, Ljava/lang/String;-><init>([CII)V

    return-object p1

    .line 1149
    :cond_2
    invoke-virtual {v1, v7, v2, v8}, Ljava/lang/StringBuilder;->append([CII)Ljava/lang/StringBuilder;

    .line 1150
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_3
    const/16 v9, 0x5c

    if-ne v4, v9, :cond_5

    .line 1153
    iput v8, p0, Ll/ܿۜۖ;->۟:I

    sub-int/2addr v8, v2

    add-int/lit8 v3, v8, -0x1

    if-nez v1, :cond_4

    mul-int/lit8 v8, v8, 0x2

    .line 1157
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-static {v8, v5}, Ljava/lang/Math;->max(II)I

    move-result v4

    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 1159
    :cond_4
    invoke-virtual {v1, v7, v2, v3}, Ljava/lang/StringBuilder;->append([CII)Ljava/lang/StringBuilder;

    .line 1160
    invoke-direct {p0}, Ll/ܿۜۖ;->ۧ֫()C

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 1161
    iget v2, p0, Ll/ܿۜۖ;->۟:I

    .line 1162
    iget v3, p0, Ll/ܿۜۖ;->᩶:I

    goto :goto_1

    :cond_5
    const/16 v5, 0xa

    if-ne v4, v5, :cond_6

    .line 1165
    iget v4, p0, Ll/ܿۜۖ;->ۙ:I

    add-int/2addr v4, v6

    iput v4, p0, Ll/ܿۜۖ;->ۙ:I

    .line 1166
    iput v8, p0, Ll/ܿۜۖ;->ۗ:I

    :cond_6
    move v4, v8

    goto :goto_2

    :cond_7
    if-nez v1, :cond_8

    sub-int v1, v4, v2

    mul-int/lit8 v1, v1, 0x2

    .line 1172
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-static {v1, v5}, Ljava/lang/Math;->max(II)I

    move-result v1

    invoke-direct {v3, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    move-object v1, v3

    :cond_8
    sub-int v3, v4, v2

    .line 1174
    invoke-virtual {v1, v7, v2, v3}, Ljava/lang/StringBuilder;->append([CII)Ljava/lang/StringBuilder;

    .line 1175
    iput v4, p0, Ll/ܿۜۖ;->۟:I

    .line 1176
    invoke-direct {p0, v6}, Ll/ܿۜۖ;->֫(I)Z

    move-result v2

    if-eqz v2, :cond_9

    goto/16 :goto_0

    :cond_9
    const-string p1, "Unterminated string"

    .line 1177
    invoke-direct {p0, p1}, Ll/ܿۜۖ;->֫(Ljava/lang/String;)V

    throw v0
.end method

.method private ܿ֫()V
    .locals 4

    :cond_0
    const/4 v0, 0x0

    .line 1273
    :goto_0
    iget v1, p0, Ll/ܿۜۖ;->۟:I

    add-int v2, v1, v0

    iget v3, p0, Ll/ܿۜۖ;->᩶:I

    if-ge v2, v3, :cond_3

    .line 1274
    iget-object v2, p0, Ll/ܿۜۖ;->᩸:[C

    add-int/2addr v1, v0

    aget-char v1, v2, v1

    const/16 v2, 0x9

    if-eq v1, v2, :cond_2

    const/16 v2, 0xa

    if-eq v1, v2, :cond_2

    const/16 v2, 0xc

    if-eq v1, v2, :cond_2

    const/16 v2, 0xd

    if-eq v1, v2, :cond_2

    const/16 v2, 0x20

    if-eq v1, v2, :cond_2

    const/16 v2, 0x23

    if-eq v1, v2, :cond_1

    const/16 v2, 0x2c

    if-eq v1, v2, :cond_2

    const/16 v2, 0x2f

    if-eq v1, v2, :cond_1

    const/16 v2, 0x3d

    if-eq v1, v2, :cond_1

    const/16 v2, 0x7b

    if-eq v1, v2, :cond_2

    const/16 v2, 0x7d

    if-eq v1, v2, :cond_2

    const/16 v2, 0x3a

    if-eq v1, v2, :cond_2

    const/16 v2, 0x3b

    if-eq v1, v2, :cond_1

    packed-switch v1, :pswitch_data_0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 1280
    :cond_1
    :pswitch_0
    invoke-direct {p0}, Ll/ܿۜۖ;->ܰ()V

    .line 1292
    :cond_2
    :pswitch_1
    iget v1, p0, Ll/ܿۜۖ;->۟:I

    add-int/2addr v1, v0

    iput v1, p0, Ll/ܿۜۖ;->۟:I

    return-void

    :cond_3
    add-int/2addr v1, v0

    .line 1298
    iput v1, p0, Ll/ܿۜۖ;->۟:I

    const/4 v0, 0x1

    .line 1299
    invoke-direct {p0, v0}, Ll/ܿۜۖ;->֫(I)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :pswitch_data_0
    .packed-switch 0x5b
        :pswitch_1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method private ᩳ(C)V
    .locals 5

    .line 1246
    :goto_0
    iget v0, p0, Ll/ܿۜۖ;->۟:I

    .line 1247
    iget v1, p0, Ll/ܿۜۖ;->᩶:I

    :goto_1
    const/4 v2, 0x1

    if-ge v0, v1, :cond_3

    add-int/lit8 v3, v0, 0x1

    .line 1250
    iget-object v4, p0, Ll/ܿۜۖ;->᩸:[C

    aget-char v0, v4, v0

    if-ne v0, p1, :cond_0

    .line 1252
    iput v3, p0, Ll/ܿۜۖ;->۟:I

    return-void

    :cond_0
    const/16 v4, 0x5c

    if-ne v0, v4, :cond_1

    .line 1255
    iput v3, p0, Ll/ܿۜۖ;->۟:I

    .line 1256
    invoke-direct {p0}, Ll/ܿۜۖ;->ۧ֫()C

    .line 1257
    iget v0, p0, Ll/ܿۜۖ;->۟:I

    .line 1258
    iget v1, p0, Ll/ܿۜۖ;->᩶:I

    goto :goto_1

    :cond_1
    const/16 v4, 0xa

    if-ne v0, v4, :cond_2

    .line 1260
    iget v0, p0, Ll/ܿۜۖ;->ۙ:I

    add-int/2addr v0, v2

    iput v0, p0, Ll/ܿۜۖ;->ۙ:I

    .line 1261
    iput v3, p0, Ll/ܿۜۖ;->ۗ:I

    :cond_2
    move v0, v3

    goto :goto_1

    .line 1264
    :cond_3
    iput v0, p0, Ll/ܿۜۖ;->۟:I

    .line 1265
    invoke-direct {p0, v2}, Ll/ܿۜۖ;->֫(I)Z

    move-result v0

    if-eqz v0, :cond_4

    goto :goto_0

    :cond_4
    const-string p1, "Unterminated string"

    .line 1266
    invoke-direct {p0, p1}, Ll/ܿۜۖ;->֫(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1
.end method

.method private ᩳ֫()V
    .locals 4

    .line 1623
    :cond_0
    iget v0, p0, Ll/ܿۜۖ;->۟:I

    iget v1, p0, Ll/ܿۜۖ;->᩶:I

    const/4 v2, 0x1

    if-lt v0, v1, :cond_1

    invoke-direct {p0, v2}, Ll/ܿۜۖ;->֫(I)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 1624
    :cond_1
    iget v0, p0, Ll/ܿۜۖ;->۟:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Ll/ܿۜۖ;->۟:I

    iget-object v3, p0, Ll/ܿۜۖ;->᩸:[C

    aget-char v0, v3, v0

    const/16 v3, 0xa

    if-ne v0, v3, :cond_2

    .line 1626
    iget v0, p0, Ll/ܿۜۖ;->ۙ:I

    add-int/2addr v0, v2

    iput v0, p0, Ll/ܿۜۖ;->ۙ:I

    .line 1627
    iput v1, p0, Ll/ܿۜۖ;->ۗ:I

    return-void

    :cond_2
    const/16 v1, 0xd

    if-ne v0, v1, :cond_0

    :cond_3
    return-void
.end method


# virtual methods
.method public close()V
    .locals 3

    const/4 v0, 0x0

    .line 1369
    iput v0, p0, Ll/ܿۜۖ;->ۛ:I

    .line 1370
    iget-object v1, p0, Ll/ܿۜۖ;->֫֫:[I

    const/16 v2, 0x8

    aput v2, v1, v0

    const/4 v0, 0x1

    .line 1371
    iput v0, p0, Ll/ܿۜۖ;->ۧ֫:I

    .line 1372
    iget-object v0, p0, Ll/ܿۜۖ;->᩹:Ljava/io/StringReader;

    invoke-virtual {v0}, Ljava/io/Reader;->close()V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1659
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ll/ܿۜۖ;->֡()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֡()Ljava/lang/String;
    .locals 5

    .line 1663
    iget v0, p0, Ll/ܿۜۖ;->ۙ:I

    add-int/lit8 v0, v0, 0x1

    .line 1664
    iget v1, p0, Ll/ܿۜۖ;->۟:I

    iget v2, p0, Ll/ܿۜۖ;->ۗ:I

    sub-int/2addr v1, v2

    add-int/lit8 v1, v1, 0x1

    const-string v2, " column "

    const-string v3, " path "

    const-string v4, " at line "

    .line 0
    invoke-static {v4, v0, v2, v3, v1}, Ll/᩶ᩴᩳ;->֫(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 1665
    invoke-virtual {p0}, Ll/ܿۜۖ;->ۜ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public ֫()V
    .locals 3

    .line 461
    iget v0, p0, Ll/ܿۜۖ;->ۛ:I

    if-nez v0, :cond_0

    .line 463
    invoke-virtual {p0}, Ll/ܿۜۖ;->ᩳ()I

    move-result v0

    :cond_0
    const/4 v1, 0x3

    if-ne v0, v1, :cond_1

    const/4 v0, 0x1

    .line 466
    invoke-direct {p0, v0}, Ll/ܿۜۖ;->ۧ(I)V

    .line 467
    iget-object v1, p0, Ll/ܿۜۖ;->۫:[I

    iget v2, p0, Ll/ܿۜۖ;->ۧ֫:I

    sub-int/2addr v2, v0

    const/4 v0, 0x0

    aput v0, v1, v2

    .line 468
    iput v0, p0, Ll/ܿۜۖ;->ۛ:I

    return-void

    :cond_1
    const-string v0, "BEGIN_ARRAY"

    .line 470
    invoke-direct {p0, v0}, Ll/ܿۜۖ;->ۧ(Ljava/lang/String;)Ljava/lang/IllegalStateException;

    move-result-object v0

    throw v0
.end method

.method public final ֫(Ll/ܺᩳۖ;)V
    .locals 0

    .line 405
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 406
    iput-object p1, p0, Ll/ܿۜۖ;->ܽ֫:Ll/ܺᩳۖ;

    return-void
.end method

.method public ۖ()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x1

    .line 1734
    invoke-direct {p0, v0}, Ll/ܿۜۖ;->֫(Z)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public ۗ()V
    .locals 3

    .line 1009
    iget v0, p0, Ll/ܿۜۖ;->ۛ:I

    if-nez v0, :cond_0

    .line 1011
    invoke-virtual {p0}, Ll/ܿۜۖ;->ᩳ()I

    move-result v0

    :cond_0
    const/4 v1, 0x7

    if-ne v0, v1, :cond_1

    const/4 v0, 0x0

    .line 1014
    iput v0, p0, Ll/ܿۜۖ;->ۛ:I

    .line 1015
    iget-object v0, p0, Ll/ܿۜۖ;->۫:[I

    iget v1, p0, Ll/ܿۜۖ;->ۧ֫:I

    add-int/lit8 v1, v1, -0x1

    aget v2, v0, v1

    add-int/lit8 v2, v2, 0x1

    aput v2, v0, v1

    return-void

    :cond_1
    const-string v0, "null"

    .line 1017
    invoke-direct {p0, v0}, Ll/ܿۜۖ;->ۧ(Ljava/lang/String;)Ljava/lang/IllegalStateException;

    move-result-object v0

    throw v0
.end method

.method public final ۘ()Ll/ܺᩳۖ;
    .locals 1

    .line 416
    iget-object v0, p0, Ll/ܿۜۖ;->ܽ֫:Ll/ܺᩳۖ;

    return-object v0
.end method

.method public ۙ()Ljava/lang/String;
    .locals 3

    .line 928
    iget v0, p0, Ll/ܿۜۖ;->ۛ:I

    if-nez v0, :cond_0

    .line 930
    invoke-virtual {p0}, Ll/ܿۜۖ;->ᩳ()I

    move-result v0

    :cond_0
    const/16 v1, 0xe

    if-ne v0, v1, :cond_1

    .line 934
    invoke-direct {p0}, Ll/ܿۜۖ;->۟()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_1
    const/16 v1, 0xc

    if-ne v0, v1, :cond_2

    const/16 v0, 0x27

    .line 936
    invoke-direct {p0, v0}, Ll/ܿۜۖ;->ܽ(C)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_2
    const/16 v1, 0xd

    if-ne v0, v1, :cond_3

    const/16 v0, 0x22

    .line 938
    invoke-direct {p0, v0}, Ll/ܿۜۖ;->ܽ(C)Ljava/lang/String;

    move-result-object v0

    :goto_0
    const/4 v1, 0x0

    .line 942
    iput v1, p0, Ll/ܿۜۖ;->ۛ:I

    .line 943
    iget-object v1, p0, Ll/ܿۜۖ;->ۤ:[Ljava/lang/String;

    iget v2, p0, Ll/ܿۜۖ;->ۧ֫:I

    add-int/lit8 v2, v2, -0x1

    aput-object v0, v1, v2

    return-object v0

    :cond_3
    const-string v0, "a name"

    .line 940
    invoke-direct {p0, v0}, Ll/ܿۜۖ;->ۧ(Ljava/lang/String;)Ljava/lang/IllegalStateException;

    move-result-object v0

    throw v0
.end method

.method public ۜ()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    .line 1716
    invoke-direct {p0, v0}, Ll/ܿۜۖ;->֫(Z)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public ۤ()Ll/ܳۜۖ;
    .locals 1

    .line 545
    iget v0, p0, Ll/ܿۜۖ;->ۛ:I

    if-nez v0, :cond_0

    .line 547
    invoke-virtual {p0}, Ll/ܿۜۖ;->ᩳ()I

    move-result v0

    :cond_0
    packed-switch v0, :pswitch_data_0

    .line 579
    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 577
    :pswitch_0
    sget-object v0, Ll/ܳۜۖ;->۬:Ll/ܳۜۖ;

    return-object v0

    .line 575
    :pswitch_1
    sget-object v0, Ll/ܳۜۖ;->ۨ:Ll/ܳۜۖ;

    return-object v0

    .line 562
    :pswitch_2
    sget-object v0, Ll/ܳۜۖ;->ۤ:Ll/ܳۜۖ;

    return-object v0

    .line 572
    :pswitch_3
    sget-object v0, Ll/ܳۜۖ;->᩺:Ll/ܳۜۖ;

    return-object v0

    .line 567
    :pswitch_4
    sget-object v0, Ll/ܳۜۖ;->ۛ:Ll/ܳۜۖ;

    return-object v0

    .line 565
    :pswitch_5
    sget-object v0, Ll/ܳۜۖ;->ۙ:Ll/ܳۜۖ;

    return-object v0

    .line 558
    :pswitch_6
    sget-object v0, Ll/ܳۜۖ;->ۗ:Ll/ܳۜۖ;

    return-object v0

    .line 556
    :pswitch_7
    sget-object v0, Ll/ܳۜۖ;->᩹:Ll/ܳۜۖ;

    return-object v0

    .line 554
    :pswitch_8
    sget-object v0, Ll/ܳۜۖ;->۫:Ll/ܳۜۖ;

    return-object v0

    .line 552
    :pswitch_9
    sget-object v0, Ll/ܳۜۖ;->᩶:Ll/ܳۜۖ;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public ۬()Ljava/lang/String;
    .locals 4

    .line 954
    iget v0, p0, Ll/ܿۜۖ;->ۛ:I

    if-nez v0, :cond_0

    .line 956
    invoke-virtual {p0}, Ll/ܿۜۖ;->ᩳ()I

    move-result v0

    :cond_0
    const/16 v1, 0xa

    if-ne v0, v1, :cond_1

    .line 960
    invoke-direct {p0}, Ll/ܿۜۖ;->۟()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_1
    const/16 v1, 0x8

    if-ne v0, v1, :cond_2

    const/16 v0, 0x27

    .line 962
    invoke-direct {p0, v0}, Ll/ܿۜۖ;->ܽ(C)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_2
    const/16 v1, 0x9

    if-ne v0, v1, :cond_3

    const/16 v0, 0x22

    .line 964
    invoke-direct {p0, v0}, Ll/ܿۜۖ;->ܽ(C)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_3
    const/16 v1, 0xb

    if-ne v0, v1, :cond_4

    .line 966
    iget-object v0, p0, Ll/ܿۜۖ;->ܰ:Ljava/lang/String;

    const/4 v1, 0x0

    .line 967
    iput-object v1, p0, Ll/ܿۜۖ;->ܰ:Ljava/lang/String;

    goto :goto_0

    :cond_4
    const/16 v1, 0xf

    if-ne v0, v1, :cond_5

    .line 969
    iget-wide v0, p0, Ll/ܿۜۖ;->ۨ:J

    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_5
    const/16 v1, 0x10

    if-ne v0, v1, :cond_6

    .line 971
    new-instance v0, Ljava/lang/String;

    iget v1, p0, Ll/ܿۜۖ;->۟:I

    iget v2, p0, Ll/ܿۜۖ;->᩺:I

    iget-object v3, p0, Ll/ܿۜۖ;->᩸:[C

    invoke-direct {v0, v3, v1, v2}, Ljava/lang/String;-><init>([CII)V

    .line 972
    iget v1, p0, Ll/ܿۜۖ;->۟:I

    iget v2, p0, Ll/ܿۜۖ;->᩺:I

    add-int/2addr v1, v2

    iput v1, p0, Ll/ܿۜۖ;->۟:I

    :goto_0
    const/4 v1, 0x0

    .line 976
    iput v1, p0, Ll/ܿۜۖ;->ۛ:I

    .line 977
    iget-object v1, p0, Ll/ܿۜۖ;->۫:[I

    iget v2, p0, Ll/ܿۜۖ;->ۧ֫:I

    add-int/lit8 v2, v2, -0x1

    aget v3, v1, v2

    add-int/lit8 v3, v3, 0x1

    aput v3, v1, v2

    return-object v0

    :cond_6
    const-string v0, "a string"

    .line 974
    invoke-direct {p0, v0}, Ll/ܿۜۖ;->ۧ(Ljava/lang/String;)Ljava/lang/IllegalStateException;

    move-result-object v0

    throw v0
.end method

.method public ܳ()V
    .locals 3

    .line 481
    iget v0, p0, Ll/ܿۜۖ;->ۛ:I

    if-nez v0, :cond_0

    .line 483
    invoke-virtual {p0}, Ll/ܿۜۖ;->ᩳ()I

    move-result v0

    :cond_0
    const/4 v1, 0x4

    if-ne v0, v1, :cond_1

    .line 486
    iget v0, p0, Ll/ܿۜۖ;->ۧ֫:I

    add-int/lit8 v1, v0, -0x1

    iput v1, p0, Ll/ܿۜۖ;->ۧ֫:I

    .line 487
    iget-object v1, p0, Ll/ܿۜۖ;->۫:[I

    add-int/lit8 v0, v0, -0x2

    aget v2, v1, v0

    add-int/lit8 v2, v2, 0x1

    aput v2, v1, v0

    const/4 v0, 0x0

    .line 488
    iput v0, p0, Ll/ܿۜۖ;->ۛ:I

    return-void

    :cond_1
    const-string v0, "END_ARRAY"

    .line 490
    invoke-direct {p0, v0}, Ll/ܿۜۖ;->ۧ(Ljava/lang/String;)Ljava/lang/IllegalStateException;

    move-result-object v0

    throw v0
.end method

.method public ܶ()Z
    .locals 5

    .line 987
    iget v0, p0, Ll/ܿۜۖ;->ۛ:I

    if-nez v0, :cond_0

    .line 989
    invoke-virtual {p0}, Ll/ܿۜۖ;->ᩳ()I

    move-result v0

    :cond_0
    const/4 v1, 0x5

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-ne v0, v1, :cond_1

    .line 992
    iput v2, p0, Ll/ܿۜۖ;->ۛ:I

    .line 993
    iget-object v0, p0, Ll/ܿۜۖ;->۫:[I

    iget v1, p0, Ll/ܿۜۖ;->ۧ֫:I

    sub-int/2addr v1, v3

    aget v2, v0, v1

    add-int/2addr v2, v3

    aput v2, v0, v1

    return v3

    :cond_1
    const/4 v1, 0x6

    if-ne v0, v1, :cond_2

    .line 996
    iput v2, p0, Ll/ܿۜۖ;->ۛ:I

    .line 997
    iget-object v0, p0, Ll/ܿۜۖ;->۫:[I

    iget v1, p0, Ll/ܿۜۖ;->ۧ֫:I

    sub-int/2addr v1, v3

    aget v4, v0, v1

    add-int/2addr v4, v3

    aput v4, v0, v1

    return v2

    :cond_2
    const-string v0, "a boolean"

    .line 1000
    invoke-direct {p0, v0}, Ll/ܿۜۖ;->ۧ(Ljava/lang/String;)Ljava/lang/IllegalStateException;

    move-result-object v0

    throw v0
.end method

.method public ܽ()V
    .locals 2

    .line 501
    iget v0, p0, Ll/ܿۜۖ;->ۛ:I

    if-nez v0, :cond_0

    .line 503
    invoke-virtual {p0}, Ll/ܿۜۖ;->ᩳ()I

    move-result v0

    :cond_0
    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    const/4 v0, 0x3

    .line 506
    invoke-direct {p0, v0}, Ll/ܿۜۖ;->ۧ(I)V

    const/4 v0, 0x0

    .line 507
    iput v0, p0, Ll/ܿۜۖ;->ۛ:I

    return-void

    :cond_1
    const-string v0, "BEGIN_OBJECT"

    .line 509
    invoke-direct {p0, v0}, Ll/ܿۜۖ;->ۧ(Ljava/lang/String;)Ljava/lang/IllegalStateException;

    move-result-object v0

    throw v0
.end method

.method public final ᩳ()I
    .locals 22

    move-object/from16 v0, p0

    .line 585
    iget-object v1, v0, Ll/ܿۜۖ;->֫֫:[I

    iget v2, v0, Ll/ܿۜۖ;->ۧ֫:I

    const/4 v3, 0x1

    sub-int/2addr v2, v3

    aget v4, v1, v2

    const/16 v6, 0x27

    const/4 v7, 0x6

    const/16 v8, 0x5d

    const/16 v9, 0x3b

    const/16 v10, 0x2c

    const/4 v11, 0x3

    const/4 v12, 0x0

    .line 586
    iget-object v13, v0, Ll/ܿۜۖ;->᩸:[C

    const/4 v14, 0x4

    const/4 v15, 0x5

    const/16 v16, 0x7

    const/4 v5, 0x2

    if-ne v4, v3, :cond_0

    .line 587
    aput v5, v1, v2

    goto/16 :goto_1

    :cond_0
    if-ne v4, v5, :cond_3

    .line 590
    invoke-direct {v0, v3}, Ll/ܿۜۖ;->ۧ(Z)I

    move-result v1

    if-eq v1, v10, :cond_e

    if-eq v1, v9, :cond_2

    if-ne v1, v8, :cond_1

    .line 593
    iput v14, v0, Ll/ܿۜۖ;->ۛ:I

    return v14

    :cond_1
    const-string v1, "Unterminated array"

    .line 600
    invoke-direct {v0, v1}, Ll/ܿۜۖ;->֫(Ljava/lang/String;)V

    throw v12

    .line 596
    :cond_2
    invoke-direct/range {p0 .. p0}, Ll/ܿۜۖ;->ܰ()V

    goto/16 :goto_1

    :cond_3
    const/16 v5, 0x7d

    if-eq v4, v11, :cond_42

    if-ne v4, v15, :cond_4

    goto/16 :goto_17

    :cond_4
    if-ne v4, v14, :cond_7

    .line 646
    aput v15, v1, v2

    .line 648
    invoke-direct {v0, v3}, Ll/ܿۜۖ;->ۧ(Z)I

    move-result v1

    const/16 v2, 0x3a

    if-eq v1, v2, :cond_e

    const/16 v2, 0x3d

    if-ne v1, v2, :cond_6

    .line 653
    invoke-direct/range {p0 .. p0}, Ll/ܿۜۖ;->ܰ()V

    .line 654
    iget v1, v0, Ll/ܿۜۖ;->۟:I

    iget v2, v0, Ll/ܿۜۖ;->᩶:I

    if-lt v1, v2, :cond_5

    invoke-direct {v0, v3}, Ll/ܿۜۖ;->֫(I)Z

    move-result v1

    if-eqz v1, :cond_e

    :cond_5
    iget v1, v0, Ll/ܿۜۖ;->۟:I

    aget-char v2, v13, v1

    const/16 v5, 0x3e

    if-ne v2, v5, :cond_e

    add-int/2addr v1, v3

    .line 655
    iput v1, v0, Ll/ܿۜۖ;->۟:I

    goto/16 :goto_1

    :cond_6
    const-string v1, "Expected \':\'"

    .line 659
    invoke-direct {v0, v1}, Ll/ܿۜۖ;->֫(Ljava/lang/String;)V

    throw v12

    :cond_7
    if-ne v4, v7, :cond_b

    .line 662
    iget-object v1, v0, Ll/ܿۜۖ;->ܽ֫:Ll/ܺᩳۖ;

    sget-object v2, Ll/ܺᩳۖ;->᩶:Ll/ܺᩳۖ;

    if-ne v1, v2, :cond_a

    .line 1837
    invoke-direct {v0, v3}, Ll/ܿۜۖ;->ۧ(Z)I

    .line 1838
    iget v1, v0, Ll/ܿۜۖ;->۟:I

    add-int/lit8 v2, v1, -0x1

    iput v2, v0, Ll/ܿۜۖ;->۟:I

    add-int/lit8 v1, v1, 0x4

    .line 1840
    iget v2, v0, Ll/ܿۜۖ;->᩶:I

    if-le v1, v2, :cond_8

    invoke-direct {v0, v15}, Ll/ܿۜۖ;->֫(I)Z

    move-result v1

    if-nez v1, :cond_8

    goto :goto_0

    .line 1844
    :cond_8
    iget v1, v0, Ll/ܿۜۖ;->۟:I

    .line 1846
    aget-char v2, v13, v1

    const/16 v14, 0x29

    if-ne v2, v14, :cond_a

    add-int/lit8 v2, v1, 0x1

    aget-char v2, v13, v2

    if-ne v2, v8, :cond_a

    add-int/lit8 v2, v1, 0x2

    aget-char v2, v13, v2

    if-ne v2, v5, :cond_a

    add-int/lit8 v2, v1, 0x3

    aget-char v2, v13, v2

    if-ne v2, v6, :cond_a

    add-int/lit8 v2, v1, 0x4

    aget-char v2, v13, v2

    const/16 v5, 0xa

    if-eq v2, v5, :cond_9

    goto :goto_0

    :cond_9
    add-int/2addr v1, v15

    .line 1855
    iput v1, v0, Ll/ܿۜۖ;->۟:I

    .line 665
    :cond_a
    :goto_0
    iget-object v1, v0, Ll/ܿۜۖ;->֫֫:[I

    iget v2, v0, Ll/ܿۜۖ;->ۧ֫:I

    sub-int/2addr v2, v3

    aput v16, v1, v2

    goto :goto_1

    :cond_b
    const/4 v1, 0x7

    if-ne v4, v1, :cond_d

    const/4 v1, 0x0

    .line 667
    invoke-direct {v0, v1}, Ll/ܿۜۖ;->ۧ(Z)I

    move-result v1

    const/4 v2, -0x1

    if-ne v1, v2, :cond_c

    const/16 v1, 0x11

    .line 669
    iput v1, v0, Ll/ܿۜۖ;->ۛ:I

    return v1

    .line 672
    :cond_c
    invoke-direct/range {p0 .. p0}, Ll/ܿۜۖ;->ܰ()V

    .line 673
    iget v1, v0, Ll/ܿۜۖ;->۟:I

    sub-int/2addr v1, v3

    iput v1, v0, Ll/ܿۜۖ;->۟:I

    goto :goto_1

    :cond_d
    const/16 v1, 0x8

    if-eq v4, v1, :cond_41

    .line 679
    :cond_e
    :goto_1
    invoke-direct {v0, v3}, Ll/ܿۜۖ;->ۧ(Z)I

    move-result v1

    const/16 v2, 0x22

    if-eq v1, v2, :cond_40

    if-eq v1, v6, :cond_3f

    if-eq v1, v10, :cond_3c

    if-eq v1, v9, :cond_3c

    const/16 v2, 0x5b

    if-eq v1, v2, :cond_3b

    if-eq v1, v8, :cond_3a

    const/16 v2, 0x7b

    if-eq v1, v2, :cond_39

    .line 712
    iget v1, v0, Ll/ܿۜۖ;->۟:I

    sub-int/2addr v1, v3

    iput v1, v0, Ll/ܿۜۖ;->۟:I

    .line 736
    aget-char v1, v13, v1

    const/16 v2, 0x74

    if-eq v1, v2, :cond_13

    const/16 v2, 0x54

    if-ne v1, v2, :cond_f

    goto :goto_3

    :cond_f
    const/16 v2, 0x66

    if-eq v1, v2, :cond_12

    const/16 v2, 0x46

    if-ne v1, v2, :cond_10

    goto :goto_2

    :cond_10
    const/16 v2, 0x6e

    if-eq v1, v2, :cond_11

    const/16 v2, 0x4e

    if-ne v1, v2, :cond_19

    :cond_11
    const-string v1, "null"

    const-string v2, "NULL"

    const/4 v4, 0x7

    goto :goto_4

    :cond_12
    :goto_2
    const-string v1, "false"

    const-string v2, "FALSE"

    const/4 v4, 0x6

    goto :goto_4

    :cond_13
    :goto_3
    const-string v1, "true"

    const-string v2, "TRUE"

    const/4 v4, 0x5

    .line 759
    :goto_4
    iget-object v5, v0, Ll/ܿۜۖ;->ܽ֫:Ll/ܺᩳۖ;

    sget-object v6, Ll/ܺᩳۖ;->ۙ:Ll/ܺᩳۖ;

    if-eq v5, v6, :cond_14

    const/4 v5, 0x1

    goto :goto_5

    :cond_14
    const/4 v5, 0x0

    .line 762
    :goto_5
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v6

    const/4 v8, 0x0

    :goto_6
    if-ge v8, v6, :cond_17

    .line 764
    iget v9, v0, Ll/ܿۜۖ;->۟:I

    add-int/2addr v9, v8

    iget v10, v0, Ll/ܿۜۖ;->᩶:I

    if-lt v9, v10, :cond_15

    add-int/lit8 v9, v8, 0x1

    invoke-direct {v0, v9}, Ll/ܿۜۖ;->֫(I)Z

    move-result v9

    if-nez v9, :cond_15

    goto :goto_7

    .line 767
    :cond_15
    iget v9, v0, Ll/ܿۜۖ;->۟:I

    add-int/2addr v9, v8

    aget-char v9, v13, v9

    .line 768
    invoke-virtual {v1, v8}, Ljava/lang/String;->charAt(I)C

    move-result v10

    if-eq v9, v10, :cond_16

    if-eqz v5, :cond_19

    invoke-virtual {v2, v8}, Ljava/lang/String;->charAt(I)C

    move-result v10

    if-ne v9, v10, :cond_19

    :cond_16
    add-int/lit8 v8, v8, 0x1

    goto :goto_6

    .line 774
    :cond_17
    iget v1, v0, Ll/ܿۜۖ;->۟:I

    add-int/2addr v1, v6

    iget v2, v0, Ll/ܿۜۖ;->᩶:I

    if-lt v1, v2, :cond_18

    add-int/lit8 v1, v6, 0x1

    invoke-direct {v0, v1}, Ll/ܿۜۖ;->֫(I)Z

    move-result v1

    if-eqz v1, :cond_1a

    :cond_18
    iget v1, v0, Ll/ܿۜۖ;->۟:I

    add-int/2addr v1, v6

    aget-char v1, v13, v1

    invoke-direct {v0, v1}, Ll/ܿۜۖ;->ۧ(C)Z

    move-result v1

    if-eqz v1, :cond_1a

    :cond_19
    :goto_7
    const/4 v4, 0x0

    goto :goto_8

    .line 779
    :cond_1a
    iget v1, v0, Ll/ܿۜۖ;->۟:I

    add-int/2addr v1, v6

    iput v1, v0, Ll/ܿۜۖ;->۟:I

    .line 780
    iput v4, v0, Ll/ܿۜۖ;->ۛ:I

    :goto_8
    if-eqz v4, :cond_1b

    return v4

    .line 787
    :cond_1b
    iget v1, v0, Ll/ܿۜۖ;->۟:I

    .line 788
    iget v2, v0, Ll/ܿۜۖ;->᩶:I

    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x1

    const/4 v10, 0x0

    const-wide/16 v17, 0x0

    :goto_9
    add-int v14, v1, v8

    if-ne v14, v2, :cond_1e

    .line 800
    array-length v1, v13

    if-ne v8, v1, :cond_1c

    goto/16 :goto_14

    :cond_1c
    add-int/lit8 v1, v8, 0x1

    .line 805
    invoke-direct {v0, v1}, Ll/ܿۜۖ;->֫(I)Z

    move-result v1

    if-nez v1, :cond_1d

    move/from16 v21, v8

    goto/16 :goto_10

    .line 808
    :cond_1d
    iget v1, v0, Ll/ܿۜۖ;->۟:I

    .line 809
    iget v2, v0, Ll/ܿۜۖ;->᩶:I

    :cond_1e
    add-int v14, v1, v8

    .line 812
    aget-char v14, v13, v14

    const/16 v12, 0x2b

    if-eq v14, v12, :cond_35

    const/16 v12, 0x45

    if-eq v14, v12, :cond_33

    const/16 v12, 0x65

    if-eq v14, v12, :cond_33

    const/16 v12, 0x2d

    if-eq v14, v12, :cond_31

    const/16 v12, 0x2e

    if-eq v14, v12, :cond_30

    const/16 v12, 0x30

    if-lt v14, v12, :cond_29

    const/16 v12, 0x39

    if-le v14, v12, :cond_1f

    goto :goto_f

    :cond_1f
    if-eq v6, v3, :cond_27

    if-nez v6, :cond_20

    goto :goto_d

    :cond_20
    const/4 v12, 0x2

    if-ne v6, v12, :cond_24

    cmp-long v12, v4, v17

    if-nez v12, :cond_21

    goto/16 :goto_14

    :cond_21
    const-wide/16 v19, 0xa

    mul-long v19, v19, v4

    add-int/lit8 v14, v14, -0x30

    move/from16 v21, v8

    int-to-long v7, v14

    sub-long v19, v19, v7

    const-wide v7, -0xcccccccccccccccL

    cmp-long v14, v4, v7

    if-gtz v14, :cond_23

    if-nez v14, :cond_22

    cmp-long v7, v19, v4

    if-gez v7, :cond_22

    goto :goto_a

    :cond_22
    const/4 v4, 0x0

    goto :goto_b

    :cond_23
    :goto_a
    const/4 v4, 0x1

    :goto_b
    and-int/2addr v4, v9

    move v9, v4

    move-wide/from16 v4, v19

    goto :goto_c

    :cond_24
    move/from16 v21, v8

    if-ne v6, v11, :cond_25

    const/4 v6, 0x4

    :goto_c
    move/from16 v8, v21

    const/4 v7, 0x6

    goto/16 :goto_13

    :cond_25
    const/4 v7, 0x6

    if-eq v6, v15, :cond_26

    if-ne v6, v7, :cond_28

    :cond_26
    const/4 v6, 0x7

    goto :goto_e

    :cond_27
    :goto_d
    move/from16 v21, v8

    add-int/lit8 v14, v14, -0x30

    neg-int v4, v14

    int-to-long v4, v4

    const/4 v6, 0x2

    :cond_28
    :goto_e
    move/from16 v8, v21

    goto :goto_13

    :cond_29
    :goto_f
    move/from16 v21, v8

    .line 849
    invoke-direct {v0, v14}, Ll/ܿۜۖ;->ۧ(C)Z

    move-result v1

    if-nez v1, :cond_36

    :goto_10
    const/4 v1, 0x2

    if-ne v6, v1, :cond_2e

    if-eqz v9, :cond_2d

    const-wide/high16 v1, -0x8000000000000000L

    cmp-long v3, v4, v1

    if-nez v3, :cond_2a

    if-eqz v10, :cond_2d

    :cond_2a
    cmp-long v1, v4, v17

    if-nez v1, :cond_2b

    if-nez v10, :cond_2d

    :cond_2b
    if-eqz v10, :cond_2c

    goto :goto_11

    :cond_2c
    neg-long v4, v4

    .line 881
    :goto_11
    iput-wide v4, v0, Ll/ܿۜۖ;->ۨ:J

    .line 882
    iget v1, v0, Ll/ܿۜۖ;->۟:I

    add-int v1, v1, v21

    iput v1, v0, Ll/ܿۜۖ;->۟:I

    const/16 v1, 0xf

    .line 883
    iput v1, v0, Ll/ܿۜۖ;->ۛ:I

    goto :goto_15

    :cond_2d
    const/4 v1, 0x2

    :cond_2e
    if-eq v6, v1, :cond_2f

    const/4 v1, 0x4

    if-eq v6, v1, :cond_2f

    const/4 v1, 0x7

    if-ne v6, v1, :cond_36

    :cond_2f
    move/from16 v8, v21

    .line 888
    iput v8, v0, Ll/ܿۜۖ;->᩺:I

    const/16 v1, 0x10

    .line 889
    iput v1, v0, Ll/ܿۜۖ;->ۛ:I

    goto :goto_15

    :cond_30
    const/4 v12, 0x2

    if-ne v6, v12, :cond_36

    const/4 v6, 0x3

    goto :goto_13

    :cond_31
    if-nez v6, :cond_32

    const/4 v6, 0x1

    const/4 v10, 0x1

    goto :goto_13

    :cond_32
    if-ne v6, v15, :cond_36

    goto :goto_12

    :cond_33
    const/4 v12, 0x2

    if-eq v6, v12, :cond_34

    const/4 v12, 0x4

    if-ne v6, v12, :cond_36

    :cond_34
    const/4 v6, 0x5

    goto :goto_13

    :cond_35
    if-ne v6, v15, :cond_36

    :goto_12
    const/4 v6, 0x6

    :goto_13
    add-int/lit8 v8, v8, 0x1

    const/4 v12, 0x0

    goto/16 :goto_9

    :cond_36
    :goto_14
    const/4 v1, 0x0

    :goto_15
    if-eqz v1, :cond_37

    return v1

    .line 725
    :cond_37
    iget v1, v0, Ll/ܿۜۖ;->۟:I

    aget-char v1, v13, v1

    invoke-direct {v0, v1}, Ll/ܿۜۖ;->ۧ(C)Z

    move-result v1

    if-eqz v1, :cond_38

    .line 729
    invoke-direct/range {p0 .. p0}, Ll/ܿۜۖ;->ܰ()V

    const/16 v1, 0xa

    .line 730
    iput v1, v0, Ll/ܿۜۖ;->ۛ:I

    return v1

    :cond_38
    const-string v1, "Expected value"

    .line 726
    invoke-direct {v0, v1}, Ll/ܿۜۖ;->֫(Ljava/lang/String;)V

    const/4 v1, 0x0

    throw v1

    .line 709
    :cond_39
    iput v3, v0, Ll/ܿۜۖ;->ۛ:I

    return v3

    :cond_3a
    if-ne v4, v3, :cond_3c

    const/4 v1, 0x4

    .line 683
    iput v1, v0, Ll/ܿۜۖ;->ۛ:I

    return v1

    .line 706
    :cond_3b
    iput v11, v0, Ll/ܿۜۖ;->ۛ:I

    return v11

    :cond_3c
    if-eq v4, v3, :cond_3e

    const/4 v1, 0x2

    if-ne v4, v1, :cond_3d

    goto :goto_16

    :cond_3d
    const-string v1, "Unexpected value"

    .line 696
    invoke-direct {v0, v1}, Ll/ܿۜۖ;->֫(Ljava/lang/String;)V

    const/4 v1, 0x0

    throw v1

    .line 691
    :cond_3e
    :goto_16
    invoke-direct/range {p0 .. p0}, Ll/ܿۜۖ;->ܰ()V

    .line 692
    iget v1, v0, Ll/ܿۜۖ;->۟:I

    sub-int/2addr v1, v3

    iput v1, v0, Ll/ܿۜۖ;->۟:I

    const/4 v1, 0x7

    .line 693
    iput v1, v0, Ll/ܿۜۖ;->ۛ:I

    return v1

    .line 699
    :cond_3f
    invoke-direct/range {p0 .. p0}, Ll/ܿۜۖ;->ܰ()V

    const/16 v1, 0x8

    .line 700
    iput v1, v0, Ll/ܿۜۖ;->ۛ:I

    return v1

    :cond_40
    const/16 v1, 0x9

    .line 703
    iput v1, v0, Ll/ܿۜۖ;->ۛ:I

    return v1

    .line 676
    :cond_41
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "JsonReader is closed"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_42
    :goto_17
    const/4 v7, 0x4

    .line 603
    aput v7, v1, v2

    if-ne v4, v15, :cond_45

    .line 606
    invoke-direct {v0, v3}, Ll/ܿۜۖ;->ۧ(Z)I

    move-result v1

    if-eq v1, v10, :cond_45

    if-eq v1, v9, :cond_44

    if-ne v1, v5, :cond_43

    const/4 v1, 0x2

    .line 609
    iput v1, v0, Ll/ܿۜۖ;->ۛ:I

    return v1

    :cond_43
    const-string v1, "Unterminated object"

    .line 616
    invoke-direct {v0, v1}, Ll/ܿۜۖ;->֫(Ljava/lang/String;)V

    const/4 v1, 0x0

    throw v1

    .line 612
    :cond_44
    invoke-direct/range {p0 .. p0}, Ll/ܿۜۖ;->ܰ()V

    .line 619
    :cond_45
    invoke-direct {v0, v3}, Ll/ܿۜۖ;->ۧ(Z)I

    move-result v1

    const/16 v2, 0x22

    if-eq v1, v2, :cond_4a

    if-eq v1, v6, :cond_49

    const-string v2, "Expected name"

    if-eq v1, v5, :cond_47

    .line 636
    invoke-direct/range {p0 .. p0}, Ll/ܿۜۖ;->ܰ()V

    .line 637
    iget v4, v0, Ll/ܿۜۖ;->۟:I

    sub-int/2addr v4, v3

    iput v4, v0, Ll/ܿۜۖ;->۟:I

    int-to-char v1, v1

    .line 638
    invoke-direct {v0, v1}, Ll/ܿۜۖ;->ۧ(C)Z

    move-result v1

    if-eqz v1, :cond_46

    const/16 v1, 0xe

    .line 639
    iput v1, v0, Ll/ܿۜۖ;->ۛ:I

    return v1

    .line 642
    :cond_46
    invoke-direct {v0, v2}, Ll/ܿۜۖ;->֫(Ljava/lang/String;)V

    const/4 v1, 0x0

    throw v1

    :cond_47
    const/4 v1, 0x0

    if-eq v4, v15, :cond_48

    const/4 v1, 0x2

    .line 630
    iput v1, v0, Ll/ܿۜۖ;->ۛ:I

    return v1

    .line 633
    :cond_48
    invoke-direct {v0, v2}, Ll/ܿۜۖ;->֫(Ljava/lang/String;)V

    throw v1

    .line 625
    :cond_49
    invoke-direct/range {p0 .. p0}, Ll/ܿۜۖ;->ܰ()V

    const/16 v1, 0xc

    .line 626
    iput v1, v0, Ll/ܿۜۖ;->ۛ:I

    return v1

    :cond_4a
    const/16 v1, 0xd

    .line 622
    iput v1, v0, Ll/ܿۜۖ;->ۛ:I

    return v1
.end method

.method public ᩴ()Z
    .locals 2

    .line 536
    iget v0, p0, Ll/ܿۜۖ;->ۛ:I

    if-nez v0, :cond_0

    .line 538
    invoke-virtual {p0}, Ll/ܿۜۖ;->ᩳ()I

    move-result v0

    :cond_0
    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    const/4 v1, 0x4

    if-eq v0, v1, :cond_1

    const/16 v1, 0x11

    if-eq v0, v1, :cond_1

    const/4 v0, 0x1

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public final ᩵()Z
    .locals 2

    .line 347
    iget-object v0, p0, Ll/ܿۜۖ;->ܽ֫:Ll/ܺᩳۖ;

    sget-object v1, Ll/ܺᩳۖ;->᩶:Ll/ܺᩳۖ;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public ᩶()J
    .locals 8

    .line 1075
    iget v0, p0, Ll/ܿۜۖ;->ۛ:I

    if-nez v0, :cond_0

    .line 1077
    invoke-virtual {p0}, Ll/ܿۜۖ;->ᩳ()I

    move-result v0

    :cond_0
    const/16 v1, 0xf

    const/4 v2, 0x0

    if-ne v0, v1, :cond_1

    .line 1081
    iput v2, p0, Ll/ܿۜۖ;->ۛ:I

    .line 1082
    iget-object v0, p0, Ll/ܿۜۖ;->۫:[I

    iget v1, p0, Ll/ܿۜۖ;->ۧ֫:I

    add-int/lit8 v1, v1, -0x1

    aget v2, v0, v1

    add-int/lit8 v2, v2, 0x1

    aput v2, v0, v1

    .line 1083
    iget-wide v0, p0, Ll/ܿۜۖ;->ۨ:J

    return-wide v0

    :cond_1
    const/16 v1, 0x10

    if-ne v0, v1, :cond_2

    .line 1087
    new-instance v0, Ljava/lang/String;

    iget v1, p0, Ll/ܿۜۖ;->۟:I

    iget v3, p0, Ll/ܿۜۖ;->᩺:I

    iget-object v4, p0, Ll/ܿۜۖ;->᩸:[C

    invoke-direct {v0, v4, v1, v3}, Ljava/lang/String;-><init>([CII)V

    iput-object v0, p0, Ll/ܿۜۖ;->ܰ:Ljava/lang/String;

    .line 1088
    iget v0, p0, Ll/ܿۜۖ;->۟:I

    iget v1, p0, Ll/ܿۜۖ;->᩺:I

    add-int/2addr v0, v1

    iput v0, p0, Ll/ܿۜۖ;->۟:I

    goto :goto_3

    :cond_2
    const/16 v1, 0xa

    const/16 v3, 0x8

    if-eq v0, v3, :cond_4

    const/16 v4, 0x9

    if-eq v0, v4, :cond_4

    if-ne v0, v1, :cond_3

    goto :goto_0

    :cond_3
    const-string v0, "a long"

    .line 1104
    invoke-direct {p0, v0}, Ll/ܿۜۖ;->ۧ(Ljava/lang/String;)Ljava/lang/IllegalStateException;

    move-result-object v0

    throw v0

    :cond_4
    :goto_0
    if-ne v0, v1, :cond_5

    .line 1091
    invoke-direct {p0}, Ll/ܿۜۖ;->۟()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/ܿۜۖ;->ܰ:Ljava/lang/String;

    goto :goto_2

    :cond_5
    if-ne v0, v3, :cond_6

    const/16 v0, 0x27

    goto :goto_1

    :cond_6
    const/16 v0, 0x22

    .line 1093
    :goto_1
    invoke-direct {p0, v0}, Ll/ܿۜۖ;->ܽ(C)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/ܿۜۖ;->ܰ:Ljava/lang/String;

    .line 1096
    :goto_2
    :try_start_0
    iget-object v0, p0, Ll/ܿۜۖ;->ܰ:Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    .line 1097
    iput v2, p0, Ll/ܿۜۖ;->ۛ:I

    .line 1098
    iget-object v3, p0, Ll/ܿۜۖ;->۫:[I

    iget v4, p0, Ll/ܿۜۖ;->ۧ֫:I

    add-int/lit8 v4, v4, -0x1

    aget v5, v3, v4

    add-int/lit8 v5, v5, 0x1

    aput v5, v3, v4
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    return-wide v0

    :catch_0
    nop

    :goto_3
    const/16 v0, 0xb

    .line 1107
    iput v0, p0, Ll/ܿۜۖ;->ۛ:I

    .line 1108
    iget-object v0, p0, Ll/ܿۜۖ;->ܰ:Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v0

    double-to-long v3, v0

    long-to-double v5, v3

    cmpl-double v7, v5, v0

    if-nez v7, :cond_7

    const/4 v0, 0x0

    .line 1113
    iput-object v0, p0, Ll/ܿۜۖ;->ܰ:Ljava/lang/String;

    .line 1114
    iput v2, p0, Ll/ܿۜۖ;->ۛ:I

    .line 1115
    iget-object v0, p0, Ll/ܿۜۖ;->۫:[I

    iget v1, p0, Ll/ܿۜۖ;->ۧ֫:I

    add-int/lit8 v1, v1, -0x1

    aget v2, v0, v1

    add-int/lit8 v2, v2, 0x1

    aput v2, v0, v1

    return-wide v3

    .line 1111
    :cond_7
    new-instance v0, Ljava/lang/NumberFormatException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Expected a long but was "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Ll/ܿۜۖ;->ܰ:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ll/ܿۜۖ;->֡()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public ᩸()D
    .locals 6

    .line 1032
    iget v0, p0, Ll/ܿۜۖ;->ۛ:I

    if-nez v0, :cond_0

    .line 1034
    invoke-virtual {p0}, Ll/ܿۜۖ;->ᩳ()I

    move-result v0

    :cond_0
    const/16 v1, 0xf

    const/4 v2, 0x0

    if-ne v0, v1, :cond_1

    .line 1038
    iput v2, p0, Ll/ܿۜۖ;->ۛ:I

    .line 1039
    iget-object v0, p0, Ll/ܿۜۖ;->۫:[I

    iget v1, p0, Ll/ܿۜۖ;->ۧ֫:I

    add-int/lit8 v1, v1, -0x1

    aget v2, v0, v1

    add-int/lit8 v2, v2, 0x1

    aput v2, v0, v1

    .line 1040
    iget-wide v0, p0, Ll/ܿۜۖ;->ۨ:J

    long-to-double v0, v0

    return-wide v0

    :cond_1
    const/16 v1, 0x10

    const/16 v3, 0xb

    if-ne v0, v1, :cond_2

    .line 1044
    new-instance v0, Ljava/lang/String;

    iget v1, p0, Ll/ܿۜۖ;->۟:I

    iget v4, p0, Ll/ܿۜۖ;->᩺:I

    iget-object v5, p0, Ll/ܿۜۖ;->᩸:[C

    invoke-direct {v0, v5, v1, v4}, Ljava/lang/String;-><init>([CII)V

    iput-object v0, p0, Ll/ܿۜۖ;->ܰ:Ljava/lang/String;

    .line 1045
    iget v0, p0, Ll/ܿۜۖ;->۟:I

    iget v1, p0, Ll/ܿۜۖ;->᩺:I

    add-int/2addr v0, v1

    iput v0, p0, Ll/ܿۜۖ;->۟:I

    goto :goto_2

    :cond_2
    const/16 v1, 0x8

    if-eq v0, v1, :cond_6

    const/16 v4, 0x9

    if-ne v0, v4, :cond_3

    goto :goto_0

    :cond_3
    const/16 v1, 0xa

    if-ne v0, v1, :cond_4

    .line 1049
    invoke-direct {p0}, Ll/ܿۜۖ;->۟()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/ܿۜۖ;->ܰ:Ljava/lang/String;

    goto :goto_2

    :cond_4
    if-ne v0, v3, :cond_5

    goto :goto_2

    :cond_5
    const-string v0, "a double"

    .line 1051
    invoke-direct {p0, v0}, Ll/ܿۜۖ;->ۧ(Ljava/lang/String;)Ljava/lang/IllegalStateException;

    move-result-object v0

    throw v0

    :cond_6
    :goto_0
    if-ne v0, v1, :cond_7

    const/16 v0, 0x27

    goto :goto_1

    :cond_7
    const/16 v0, 0x22

    .line 1047
    :goto_1
    invoke-direct {p0, v0}, Ll/ܿۜۖ;->ܽ(C)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/ܿۜۖ;->ܰ:Ljava/lang/String;

    .line 1054
    :goto_2
    iput v3, p0, Ll/ܿۜۖ;->ۛ:I

    .line 1055
    iget-object v0, p0, Ll/ܿۜۖ;->ܰ:Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v0

    .line 1056
    iget-object v3, p0, Ll/ܿۜۖ;->ܽ֫:Ll/ܺᩳۖ;

    sget-object v4, Ll/ܺᩳۖ;->᩶:Ll/ܺᩳۖ;

    const/4 v5, 0x0

    if-eq v3, v4, :cond_9

    invoke-static {v0, v1}, Ljava/lang/Double;->isNaN(D)Z

    move-result v3

    if-nez v3, :cond_8

    invoke-static {v0, v1}, Ljava/lang/Double;->isInfinite(D)Z

    move-result v3

    if-nez v3, :cond_8

    goto :goto_3

    .line 1057
    :cond_8
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "JSON forbids NaN and infinities: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ll/ܿۜۖ;->֫(Ljava/lang/String;)V

    throw v5

    .line 1059
    :cond_9
    :goto_3
    iput-object v5, p0, Ll/ܿۜۖ;->ܰ:Ljava/lang/String;

    .line 1060
    iput v2, p0, Ll/ܿۜۖ;->ۛ:I

    .line 1061
    iget-object v2, p0, Ll/ܿۜۖ;->۫:[I

    iget v3, p0, Ll/ܿۜۖ;->ۧ֫:I

    add-int/lit8 v3, v3, -0x1

    aget v4, v2, v3

    add-int/lit8 v4, v4, 0x1

    aput v4, v2, v3

    return-wide v0
.end method

.method public ᩹()I
    .locals 8

    .line 1312
    iget v0, p0, Ll/ܿۜۖ;->ۛ:I

    if-nez v0, :cond_0

    .line 1314
    invoke-virtual {p0}, Ll/ܿۜۖ;->ᩳ()I

    move-result v0

    :cond_0
    const/16 v1, 0xf

    const-string v2, "Expected an int but was "

    const/4 v3, 0x0

    if-ne v0, v1, :cond_2

    .line 1319
    iget-wide v0, p0, Ll/ܿۜۖ;->ۨ:J

    long-to-int v4, v0

    int-to-long v5, v4

    cmp-long v7, v0, v5

    if-nez v7, :cond_1

    .line 1323
    iput v3, p0, Ll/ܿۜۖ;->ۛ:I

    .line 1324
    iget-object v0, p0, Ll/ܿۜۖ;->۫:[I

    iget v1, p0, Ll/ܿۜۖ;->ۧ֫:I

    add-int/lit8 v1, v1, -0x1

    aget v2, v0, v1

    add-int/lit8 v2, v2, 0x1

    aput v2, v0, v1

    return v4

    .line 1321
    :cond_1
    new-instance v0, Ljava/lang/NumberFormatException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v2, p0, Ll/ܿۜۖ;->ۨ:J

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ll/ܿۜۖ;->֡()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    const/16 v1, 0x10

    if-ne v0, v1, :cond_3

    .line 1329
    new-instance v0, Ljava/lang/String;

    iget v1, p0, Ll/ܿۜۖ;->۟:I

    iget v4, p0, Ll/ܿۜۖ;->᩺:I

    iget-object v5, p0, Ll/ܿۜۖ;->᩸:[C

    invoke-direct {v0, v5, v1, v4}, Ljava/lang/String;-><init>([CII)V

    iput-object v0, p0, Ll/ܿۜۖ;->ܰ:Ljava/lang/String;

    .line 1330
    iget v0, p0, Ll/ܿۜۖ;->۟:I

    iget v1, p0, Ll/ܿۜۖ;->᩺:I

    add-int/2addr v0, v1

    iput v0, p0, Ll/ܿۜۖ;->۟:I

    goto :goto_3

    :cond_3
    const/16 v1, 0xa

    const/16 v4, 0x8

    if-eq v0, v4, :cond_5

    const/16 v5, 0x9

    if-eq v0, v5, :cond_5

    if-ne v0, v1, :cond_4

    goto :goto_0

    :cond_4
    const-string v0, "an int"

    .line 1346
    invoke-direct {p0, v0}, Ll/ܿۜۖ;->ۧ(Ljava/lang/String;)Ljava/lang/IllegalStateException;

    move-result-object v0

    throw v0

    :cond_5
    :goto_0
    if-ne v0, v1, :cond_6

    .line 1333
    invoke-direct {p0}, Ll/ܿۜۖ;->۟()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/ܿۜۖ;->ܰ:Ljava/lang/String;

    goto :goto_2

    :cond_6
    if-ne v0, v4, :cond_7

    const/16 v0, 0x27

    goto :goto_1

    :cond_7
    const/16 v0, 0x22

    .line 1335
    :goto_1
    invoke-direct {p0, v0}, Ll/ܿۜۖ;->ܽ(C)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/ܿۜۖ;->ܰ:Ljava/lang/String;

    .line 1338
    :goto_2
    :try_start_0
    iget-object v0, p0, Ll/ܿۜۖ;->ܰ:Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    .line 1339
    iput v3, p0, Ll/ܿۜۖ;->ۛ:I

    .line 1340
    iget-object v1, p0, Ll/ܿۜۖ;->۫:[I

    iget v4, p0, Ll/ܿۜۖ;->ۧ֫:I

    add-int/lit8 v4, v4, -0x1

    aget v5, v1, v4

    add-int/lit8 v5, v5, 0x1

    aput v5, v1, v4
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    return v0

    :catch_0
    nop

    :goto_3
    const/16 v0, 0xb

    .line 1349
    iput v0, p0, Ll/ܿۜۖ;->ۛ:I

    .line 1350
    iget-object v0, p0, Ll/ܿۜۖ;->ܰ:Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v0

    double-to-int v4, v0

    int-to-double v5, v4

    cmpl-double v7, v5, v0

    if-nez v7, :cond_8

    const/4 v0, 0x0

    .line 1355
    iput-object v0, p0, Ll/ܿۜۖ;->ܰ:Ljava/lang/String;

    .line 1356
    iput v3, p0, Ll/ܿۜۖ;->ۛ:I

    .line 1357
    iget-object v0, p0, Ll/ܿۜۖ;->۫:[I

    iget v1, p0, Ll/ܿۜۖ;->ۧ֫:I

    add-int/lit8 v1, v1, -0x1

    aget v2, v0, v1

    add-int/lit8 v2, v2, 0x1

    aput v2, v0, v1

    return v4

    .line 1353
    :cond_8
    new-instance v0, Ljava/lang/NumberFormatException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Ll/ܿۜۖ;->ܰ:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ll/ܿۜۖ;->֡()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public ᩺()V
    .locals 7

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 1394
    :cond_0
    iget v2, p0, Ll/ܿۜۖ;->ۛ:I

    if-nez v2, :cond_1

    .line 1396
    invoke-virtual {p0}, Ll/ܿۜۖ;->ᩳ()I

    move-result v2

    :cond_1
    const/16 v3, 0x27

    const/16 v4, 0x22

    const-string v5, "<skipped>"

    const/4 v6, 0x1

    packed-switch v2, :pswitch_data_0

    :pswitch_0
    goto :goto_2

    :pswitch_1
    return-void

    .line 1453
    :pswitch_2
    iget v2, p0, Ll/ܿۜۖ;->۟:I

    iget v3, p0, Ll/ܿۜۖ;->᩺:I

    add-int/2addr v2, v3

    iput v2, p0, Ll/ܿۜۖ;->۟:I

    goto :goto_2

    .line 1432
    :pswitch_3
    invoke-direct {p0}, Ll/ܿۜۖ;->ܿ֫()V

    if-nez v1, :cond_3

    .line 1435
    iget-object v2, p0, Ll/ܿۜۖ;->ۤ:[Ljava/lang/String;

    iget v3, p0, Ll/ܿۜۖ;->ۧ֫:I

    sub-int/2addr v3, v6

    aput-object v5, v2, v3

    goto :goto_2

    .line 1446
    :pswitch_4
    invoke-direct {p0, v4}, Ll/ܿۜۖ;->ᩳ(C)V

    if-nez v1, :cond_3

    .line 1449
    iget-object v2, p0, Ll/ܿۜۖ;->ۤ:[Ljava/lang/String;

    iget v3, p0, Ll/ܿۜۖ;->ۧ֫:I

    sub-int/2addr v3, v6

    aput-object v5, v2, v3

    goto :goto_2

    .line 1439
    :pswitch_5
    invoke-direct {p0, v3}, Ll/ܿۜۖ;->ᩳ(C)V

    if-nez v1, :cond_3

    .line 1442
    iget-object v2, p0, Ll/ܿۜۖ;->ۤ:[Ljava/lang/String;

    iget v3, p0, Ll/ܿۜۖ;->ۧ֫:I

    sub-int/2addr v3, v6

    aput-object v5, v2, v3

    goto :goto_2

    .line 1423
    :pswitch_6
    invoke-direct {p0}, Ll/ܿۜۖ;->ܿ֫()V

    goto :goto_2

    .line 1429
    :pswitch_7
    invoke-direct {p0, v4}, Ll/ܿۜۖ;->ᩳ(C)V

    goto :goto_2

    .line 1426
    :pswitch_8
    invoke-direct {p0, v3}, Ll/ܿۜۖ;->ᩳ(C)V

    goto :goto_2

    .line 1409
    :pswitch_9
    iget v2, p0, Ll/ܿۜۖ;->ۧ֫:I

    sub-int/2addr v2, v6

    iput v2, p0, Ll/ܿۜۖ;->ۧ֫:I

    goto :goto_0

    .line 1401
    :pswitch_a
    invoke-direct {p0, v6}, Ll/ܿۜۖ;->ۧ(I)V

    goto :goto_1

    :pswitch_b
    if-nez v1, :cond_2

    .line 1417
    iget-object v2, p0, Ll/ܿۜۖ;->ۤ:[Ljava/lang/String;

    iget v3, p0, Ll/ܿۜۖ;->ۧ֫:I

    sub-int/2addr v3, v6

    const/4 v4, 0x0

    aput-object v4, v2, v3

    .line 1419
    :cond_2
    iget v2, p0, Ll/ܿۜۖ;->ۧ֫:I

    sub-int/2addr v2, v6

    iput v2, p0, Ll/ܿۜۖ;->ۧ֫:I

    :goto_0
    add-int/lit8 v1, v1, -0x1

    goto :goto_2

    :pswitch_c
    const/4 v2, 0x3

    .line 1405
    invoke-direct {p0, v2}, Ll/ܿۜۖ;->ۧ(I)V

    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 1462
    :cond_3
    :goto_2
    iput v0, p0, Ll/ܿۜۖ;->ۛ:I

    if-gtz v1, :cond_0

    .line 1465
    iget-object v0, p0, Ll/ܿۜۖ;->۫:[I

    iget v1, p0, Ll/ܿۜۖ;->ۧ֫:I

    sub-int/2addr v1, v6

    aget v2, v0, v1

    add-int/2addr v2, v6

    aput v2, v0, v1

    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public ᩻()V
    .locals 5

    .line 520
    iget v0, p0, Ll/ܿۜۖ;->ۛ:I

    if-nez v0, :cond_0

    .line 522
    invoke-virtual {p0}, Ll/ܿۜۖ;->ᩳ()I

    move-result v0

    :cond_0
    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 525
    iget v0, p0, Ll/ܿۜۖ;->ۧ֫:I

    add-int/lit8 v2, v0, -0x1

    iput v2, p0, Ll/ܿۜۖ;->ۧ֫:I

    .line 526
    iget-object v3, p0, Ll/ܿۜۖ;->ۤ:[Ljava/lang/String;

    const/4 v4, 0x0

    aput-object v4, v3, v2

    .line 527
    iget-object v2, p0, Ll/ܿۜۖ;->۫:[I

    sub-int/2addr v0, v1

    aget v1, v2, v0

    add-int/lit8 v1, v1, 0x1

    aput v1, v2, v0

    const/4 v0, 0x0

    .line 528
    iput v0, p0, Ll/ܿۜۖ;->ۛ:I

    return-void

    :cond_1
    const-string v0, "END_OBJECT"

    .line 530
    invoke-direct {p0, v0}, Ll/ܿۜۖ;->ۧ(Ljava/lang/String;)Ljava/lang/IllegalStateException;

    move-result-object v0

    throw v0
.end method
