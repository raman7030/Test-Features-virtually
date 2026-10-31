.class public final Ll/֫ۜۘ;
.super Ll/۬᩻ۘ;
.source "27ZX"


# instance fields
.field public ֫֫:Ll/ܺ᩻ۘ;

.field public ۛ:Ljava/util/Hashtable;

.field public ۜ֫:Z

.field public ۟:Ljava/io/InputStream;

.field public ۤ:Z

.field public ۧ֫:Ll/۠ۢۘ;

.field public ۨ:Ljava/nio/charset/Charset;

.field public ۫:Ljava/lang/String;

.field public ۬:Ll/ܺ᩻ۘ;

.field public ܰ:Ljava/lang/String;

.field public ܳ֫:I

.field public ܽ֫:Ll/۠ۢۘ;

.field public ܿ֫:I

.field public ᩳ֫:Ll/۟᩻ۘ;

.field public ᩺:Z

.field public ᩻֫:Ll/᩵ᩴ᩻;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 153
    sget-object v0, Ljava/io/File;->separator:Ljava/lang/String;

    .line 154
    sget-char v0, Ljava/io/File;->separatorChar:C

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 201
    invoke-direct {p0}, Ll/۬᩻ۘ;-><init>()V

    const/4 v0, 0x1

    .line 121
    iput v0, p0, Ll/֫ۜۘ;->ܿ֫:I

    const/4 v1, 0x3

    .line 132
    iput v1, p0, Ll/֫ۜۘ;->ܳ֫:I

    .line 133
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    const/4 v1, 0x0

    .line 135
    iput-object v1, p0, Ll/֫ۜۘ;->ۛ:Ljava/util/Hashtable;

    .line 136
    iput-object v1, p0, Ll/֫ۜۘ;->۟:Ljava/io/InputStream;

    const/4 v1, 0x0

    .line 138
    iput-boolean v1, p0, Ll/֫ۜۘ;->ۤ:Z

    .line 161
    sget-object v1, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    iput-object v1, p0, Ll/֫ۜۘ;->ۨ:Ljava/nio/charset/Charset;

    .line 162
    iput-boolean v0, p0, Ll/֫ۜۘ;->᩺:Z

    .line 164
    iput-boolean v0, p0, Ll/֫ۜۘ;->ۜ֫:Z

    .line 166
    new-instance v0, Ll/۟᩻ۘ;

    invoke-direct {v0, p0}, Ll/۟᩻ۘ;-><init>(Ll/֫ۜۘ;)V

    iput-object v0, p0, Ll/֫ۜۘ;->ᩳ֫:Ll/۟᩻ۘ;

    const/high16 v0, 0x200000

    .line 202
    iput v0, p0, Ll/᩵᩻ۘ;->᩷:I

    .line 203
    iput v0, p0, Ll/᩵᩻ۘ;->ۜ:I

    const v0, 0x8000

    .line 204
    iput v0, p0, Ll/᩵᩻ۘ;->᩻:I

    return-void
.end method

.method private ֫(II[B)I
    .locals 2

    move v0, p1

    :goto_0
    if-lez p2, :cond_1

    .line 2877
    iget-object v1, p0, Ll/֫ۜۘ;->۟:Ljava/io/InputStream;

    invoke-virtual {v1, p3, v0, p2}, Ljava/io/InputStream;->read([BII)I

    move-result v1

    if-lez v1, :cond_0

    add-int/2addr v0, v1

    sub-int/2addr p2, v1

    goto :goto_0

    .line 2879
    :cond_0
    new-instance p1, Ljava/io/IOException;

    const-string p2, "inputstream is closed"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    sub-int/2addr v0, p1

    return v0
.end method

.method public static ֫(Ll/֫ۜۘ;[BJ[BII)I
    .locals 7

    .line 2587
    iget-object v0, p0, Ll/֫ۜۘ;->ۧ֫:Ll/۠ۢۘ;

    invoke-virtual {v0}, Ll/۠ۢۘ;->֫()V

    .line 2588
    invoke-virtual {p0}, Ll/᩵᩻ۘ;->᩻()Ll/۟ۢۘ;

    move-result-object v0

    .line 2589
    invoke-virtual {v0}, Ll/۟ۢۘ;->ܽ()I

    move-result v1

    .line 2590
    iget-object v2, p0, Ll/֫ۜۘ;->֫֫:Ll/ܺ᩻ۘ;

    iget-object v3, v2, Ll/ܺ᩻ۘ;->֫:[B

    array-length v4, v3

    iget v5, v2, Ll/ܺ᩻ۘ;->ۧ:I

    add-int/lit8 v5, v5, 0x22

    array-length v6, p1

    invoke-static {v5, v6, p6, v1}, Ll/᩵ۢ֡;->֫(IIII)I

    move-result v6

    if-ge v4, v6, :cond_0

    .line 2591
    array-length p6, v3

    array-length v3, p1

    add-int/2addr v5, v3

    add-int/2addr v5, v1

    sub-int/2addr p6, v5

    .line 2595
    :cond_0
    array-length v1, p1

    const/16 v3, 0x15

    add-int/2addr v1, v3

    add-int/2addr v1, p6

    const/16 v4, 0x5e

    .line 2627
    invoke-virtual {v2, v4}, Ll/ܺ᩻ۘ;->֫(B)V

    .line 2628
    iget v4, p0, Ll/᩵᩻ۘ;->ܺ:I

    invoke-virtual {v2, v4}, Ll/ܺ᩻ۘ;->ۧ(I)V

    add-int/lit8 v4, v1, 0x4

    .line 2629
    invoke-virtual {v2, v4}, Ll/ܺ᩻ۘ;->ۧ(I)V

    .line 2630
    invoke-virtual {v2, v1}, Ll/ܺ᩻ۘ;->ۧ(I)V

    const/4 v1, 0x6

    .line 2631
    invoke-virtual {v2, v1}, Ll/ܺ᩻ۘ;->֫(B)V

    .line 2596
    iget-object v1, p0, Ll/֫ۜۘ;->֫֫:Ll/ܺ᩻ۘ;

    iget v2, p0, Ll/֫ۜۘ;->ܿ֫:I

    add-int/lit8 v4, v2, 0x1

    iput v4, p0, Ll/֫ۜۘ;->ܿ֫:I

    invoke-virtual {v1, v2}, Ll/ܺ᩻ۘ;->ۧ(I)V

    .line 2597
    iget-object v1, p0, Ll/֫ۜۘ;->֫֫:Ll/ܺ᩻ۘ;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v2, 0x0

    .line 65
    array-length v4, p1

    invoke-virtual {v1, v2, v4, p1}, Ll/ܺ᩻ۘ;->ܽ(II[B)V

    .line 2598
    iget-object v1, p0, Ll/֫ۜۘ;->֫֫:Ll/ܺ᩻ۘ;

    invoke-virtual {v1, p2, p3}, Ll/ܺ᩻ۘ;->֫(J)V

    .line 2599
    iget-object p2, p0, Ll/֫ۜۘ;->֫֫:Ll/ܺ᩻ۘ;

    iget-object p3, p2, Ll/ܺ᩻ۘ;->֫:[B

    if-eq p3, p4, :cond_1

    .line 2600
    invoke-virtual {p2, p5, p6, p4}, Ll/ܺ᩻ۘ;->ܽ(II[B)V

    goto :goto_0

    .line 2602
    :cond_1
    invoke-virtual {p2, p6}, Ll/ܺ᩻ۘ;->ۧ(I)V

    .line 2603
    iget-object p2, p0, Ll/֫ۜۘ;->֫֫:Ll/ܺ᩻ۘ;

    invoke-virtual {p2, p6}, Ll/ܺ᩻ۘ;->ܽ(I)V

    .line 2605
    :goto_0
    iget-object p2, p0, Ll/֫ۜۘ;->ۧ֫:Ll/۠ۢۘ;

    array-length p1, p1

    const/4 p3, 0x4

    invoke-static {p1, v3, p6, p3}, Ll/᩵ۢ֡;->֫(IIII)I

    move-result p1

    invoke-virtual {v0, p2, p0, p1}, Ll/۟ۢۘ;->֫(Ll/۠ۢۘ;Ll/᩵᩻ۘ;I)V

    return p6
.end method

.method private ֫([B)Ll/֫ۡۘ;
    .locals 3

    const/16 v0, 0x11

    .line 2444
    :try_start_0
    invoke-direct {p0, p1, v0}, Ll/֫ۜۘ;->֫([BB)V

    .line 2160
    iget-object p1, p0, Ll/֫ۜۘ;->۬:Ll/ܺ᩻ۘ;

    const/4 v0, 0x0

    .line 238
    iput v0, p1, Ll/ܺ᩻ۘ;->ܽ:I

    .line 2905
    iget-object v1, p1, Ll/ܺ᩻ۘ;->֫:[B

    const/16 v2, 0x9

    invoke-direct {p0, v0, v2, v1}, Ll/֫ۜۘ;->֫(II[B)I

    .line 2906
    invoke-virtual {p1}, Ll/ܺ᩻ۘ;->ܽ()I

    move-result v0

    add-int/lit8 v0, v0, -0x5

    .line 2907
    invoke-virtual {p1}, Ll/ܺ᩻ۘ;->֫()I

    move-result v1

    and-int/lit16 v1, v1, 0xff

    .line 2908
    invoke-virtual {p1}, Ll/ܺ᩻ۘ;->ܽ()I

    .line 2164
    iget-object p1, p0, Ll/֫ۜۘ;->۬:Ll/ܺ᩻ۘ;

    invoke-direct {p0, p1, v0}, Ll/֫ۜۘ;->֫(Ll/ܺ᩻ۘ;I)V

    const/16 p1, 0x69

    if-eq v1, p1, :cond_1

    const/16 p1, 0x65

    if-ne v1, p1, :cond_0

    .line 2168
    iget-object p1, p0, Ll/֫ۜۘ;->۬:Ll/ܺ᩻ۘ;

    invoke-virtual {p1}, Ll/ܺ᩻ۘ;->ܽ()I

    move-result p1

    .line 2169
    iget-object v0, p0, Ll/֫ۜۘ;->۬:Ll/ܺ᩻ۘ;

    invoke-direct {p0, v0, p1}, Ll/֫ۜۘ;->ۧ(Ll/ܺ᩻ۘ;I)V

    const/4 p1, 0x0

    throw p1

    .line 2171
    :cond_0
    new-instance p1, Ll/ܽۡۘ;

    const-string v0, ""

    const/4 v1, 0x4

    invoke-direct {p1, v1, v0}, Ll/ܽۡۘ;-><init>(ILjava/lang/String;)V

    throw p1

    .line 2173
    :cond_1
    iget-object p1, p0, Ll/֫ۜۘ;->۬:Ll/ܺ᩻ۘ;

    invoke-static {p1}, Ll/֫ۡۘ;->ۧ(Ll/ܺ᩻ۘ;)Ll/֫ۡۘ;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    .line 2176
    instance-of v0, p1, Ll/ܽۡۘ;

    if-eqz v0, :cond_2

    .line 2177
    check-cast p1, Ll/ܽۡۘ;

    throw p1

    .line 2178
    :cond_2
    new-instance v0, Ll/ܽۡۘ;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Ll/ܽۡۘ;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    throw v0
.end method

.method public static bridge synthetic ֫(Ll/֫ۜۘ;)Ll/ܺ᩻ۘ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/֫ۜۘ;->۬:Ll/ܺ᩻ۘ;

    return-object p0
.end method

.method private ֫(BI)V
    .locals 2

    .line 2635
    iget-object v0, p0, Ll/֫ۜۘ;->۬:Ll/ܺ᩻ۘ;

    const/16 v1, 0x5e

    .line 2627
    invoke-virtual {v0, v1}, Ll/ܺ᩻ۘ;->֫(B)V

    .line 2628
    iget v1, p0, Ll/᩵᩻ۘ;->ܺ:I

    invoke-virtual {v0, v1}, Ll/ܺ᩻ۘ;->ۧ(I)V

    add-int/lit8 v1, p2, 0x4

    .line 2629
    invoke-virtual {v0, v1}, Ll/ܺ᩻ۘ;->ۧ(I)V

    .line 2630
    invoke-virtual {v0, p2}, Ll/ܺ᩻ۘ;->ۧ(I)V

    .line 2631
    invoke-virtual {v0, p1}, Ll/ܺ᩻ۘ;->֫(B)V

    return-void
.end method

.method private ֫(I[B)V
    .locals 3

    .line 2534
    iget-object v0, p0, Ll/֫ۜۘ;->ܽ֫:Ll/۠ۢۘ;

    invoke-virtual {v0}, Ll/۠ۢۘ;->֫()V

    .line 2535
    array-length v0, p2

    add-int/lit8 v0, v0, 0x11

    const/4 v1, 0x3

    invoke-direct {p0, v1, v0}, Ll/֫ۜۘ;->֫(BI)V

    .line 2536
    iget-object v0, p0, Ll/֫ۜۘ;->۬:Ll/ܺ᩻ۘ;

    iget v1, p0, Ll/֫ۜۘ;->ܿ֫:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Ll/֫ۜۘ;->ܿ֫:I

    invoke-virtual {v0, v1}, Ll/ܺ᩻ۘ;->ۧ(I)V

    .line 2537
    iget-object v0, p0, Ll/֫ۜۘ;->۬:Ll/ܺ᩻ۘ;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    array-length v1, p2

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1, p2}, Ll/ܺ᩻ۘ;->ܽ(II[B)V

    .line 2538
    iget-object v0, p0, Ll/֫ۜۘ;->۬:Ll/ܺ᩻ۘ;

    invoke-virtual {v0, p1}, Ll/ܺ᩻ۘ;->ۧ(I)V

    .line 2539
    iget-object p1, p0, Ll/֫ۜۘ;->۬:Ll/ܺ᩻ۘ;

    invoke-virtual {p1, v2}, Ll/ܺ᩻ۘ;->ۧ(I)V

    .line 2540
    invoke-virtual {p0}, Ll/᩵᩻ۘ;->᩻()Ll/۟ۢۘ;

    move-result-object p1

    iget-object v0, p0, Ll/֫ۜۘ;->ܽ֫:Ll/۠ۢۘ;

    array-length p2, p2

    add-int/lit8 p2, p2, 0x15

    invoke-virtual {p1, v0, p0, p2}, Ll/۟ۢۘ;->֫(Ll/۠ۢۘ;Ll/᩵᩻ۘ;I)V

    return-void
.end method

.method public static ֫(Ll/֫ۜۘ;J)V
    .locals 5

    :goto_0
    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-lez v2, :cond_1

    .line 2890
    iget-object v2, p0, Ll/֫ۜۘ;->۟:Ljava/io/InputStream;

    invoke-virtual {v2, p1, p2}, Ljava/io/InputStream;->skip(J)J

    move-result-wide v2

    cmp-long v4, v2, v0

    if-gtz v4, :cond_0

    goto :goto_1

    :cond_0
    sub-long/2addr p1, v2

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method

.method public static bridge synthetic ֫(Ll/֫ۜۘ;Ll/ܺ᩻ۘ;I)V
    .locals 0

    .line 0
    invoke-direct {p0, p1, p2}, Ll/֫ۜۘ;->֫(Ll/ܺ᩻ۘ;I)V

    return-void
.end method

.method public static bridge synthetic ֫(Ll/֫ۜۘ;Ll/ܺ᩻ۘ;Ll/ۛ᩻ۘ;)V
    .locals 0

    .line 0
    invoke-direct {p0, p1, p2}, Ll/֫ۜۘ;->֫(Ll/ܺ᩻ۘ;Ll/ۛ᩻ۘ;)V

    return-void
.end method

.method public static bridge synthetic ֫(Ll/֫ۜۘ;[B)V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x4

    .line 0
    invoke-direct {p0, v0, v1, p1}, Ll/֫ۜۘ;->֫(II[B)I

    return-void
.end method

.method public static ֫(Ll/֫ۜۘ;[BJILl/۟᩻ۘ;)V
    .locals 3

    .line 2614
    iget-object v0, p0, Ll/֫ۜۘ;->ܽ֫:Ll/۠ۢۘ;

    invoke-virtual {v0}, Ll/۠ۢۘ;->֫()V

    .line 2615
    array-length v0, p1

    add-int/lit8 v0, v0, 0x15

    const/4 v1, 0x5

    invoke-direct {p0, v1, v0}, Ll/֫ۜۘ;->֫(BI)V

    .line 2616
    iget-object v0, p0, Ll/֫ۜۘ;->۬:Ll/ܺ᩻ۘ;

    iget v1, p0, Ll/֫ۜۘ;->ܿ֫:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Ll/֫ۜۘ;->ܿ֫:I

    invoke-virtual {v0, v1}, Ll/ܺ᩻ۘ;->ۧ(I)V

    .line 2617
    iget-object v0, p0, Ll/֫ۜۘ;->۬:Ll/ܺ᩻ۘ;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    array-length v1, p1

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1, p1}, Ll/ܺ᩻ۘ;->ܽ(II[B)V

    .line 2618
    iget-object v0, p0, Ll/֫ۜۘ;->۬:Ll/ܺ᩻ۘ;

    invoke-virtual {v0, p2, p3}, Ll/ܺ᩻ۘ;->֫(J)V

    .line 2619
    iget-object v0, p0, Ll/֫ۜۘ;->۬:Ll/ܺ᩻ۘ;

    invoke-virtual {v0, p4}, Ll/ܺ᩻ۘ;->ۧ(I)V

    .line 2620
    invoke-virtual {p0}, Ll/᩵᩻ۘ;->᩻()Ll/۟ۢۘ;

    move-result-object v0

    iget-object v1, p0, Ll/֫ۜۘ;->ܽ֫:Ll/۠ۢۘ;

    array-length p1, p1

    add-int/lit8 p1, p1, 0x19

    invoke-virtual {v0, v1, p0, p1}, Ll/۟ۢۘ;->֫(Ll/۠ۢۘ;Ll/᩵᩻ۘ;I)V

    if-eqz p5, :cond_2

    .line 2622
    iget p0, p0, Ll/֫ۜۘ;->ܿ֫:I

    add-int/lit8 p0, p0, -0x1

    .line 1174
    iget p1, p5, Ll/۟᩻ۘ;->֫:I

    if-nez p1, :cond_0

    .line 1175
    iput v2, p5, Ll/۟᩻ۘ;->ۧ:I

    .line 1176
    :cond_0
    iget v0, p5, Ll/۟᩻ۘ;->ۧ:I

    add-int/2addr v0, p1

    .line 1177
    iget-object v1, p5, Ll/۟᩻ۘ;->ܽ:[Ll/ܰ᩻ۘ;

    array-length v2, v1

    if-lt v0, v2, :cond_1

    .line 1178
    array-length v2, v1

    sub-int/2addr v0, v2

    .line 1179
    :cond_1
    aget-object v0, v1, v0

    iput p0, v0, Ll/ܰ᩻ۘ;->֫:I

    .line 1180
    iput-wide p2, v0, Ll/ܰ᩻ۘ;->ܽ:J

    int-to-long p2, p4

    .line 1181
    iput-wide p2, v0, Ll/ܰ᩻ۘ;->ۧ:J

    add-int/lit8 p1, p1, 0x1

    .line 1182
    iput p1, p5, Ll/۟᩻ۘ;->֫:I

    :cond_2
    return-void
.end method

.method public static ֫(Ll/֫ۜۘ;[BLl/ۛ᩻ۘ;)V
    .locals 1

    const/4 v0, 0x4

    .line 2518
    invoke-direct {p0, p1, v0}, Ll/֫ۜۘ;->֫([BB)V

    const/4 p1, 0x0

    .line 2429
    invoke-direct {p0, p1, p2}, Ll/֫ۜۘ;->֫([ILl/ۛ᩻ۘ;)V

    return-void
.end method

.method public static bridge synthetic ֫(Ll/֫ۜۘ;[ILl/ۛ᩻ۘ;)V
    .locals 0

    .line 0
    invoke-direct {p0, p1, p2}, Ll/֫ۜۘ;->֫([ILl/ۛ᩻ۘ;)V

    return-void
.end method

.method private ֫(Ll/ܺ᩻ۘ;I)V
    .locals 2

    .line 2868
    invoke-virtual {p1}, Ll/ܺ᩻ۘ;->ۡ()V

    .line 2869
    iget-object v0, p1, Ll/ܺ᩻ۘ;->֫:[B

    const/4 v1, 0x0

    invoke-direct {p0, v1, p2, v0}, Ll/֫ۜۘ;->֫(II[B)I

    .line 2870
    invoke-virtual {p1, p2}, Ll/ܺ᩻ۘ;->ܽ(I)V

    return-void
.end method

.method private ֫(Ll/ܺ᩻ۘ;Ll/ۛ᩻ۘ;)V
    .locals 3

    const/4 v0, 0x0

    .line 238
    iput v0, p1, Ll/ܺ᩻ۘ;->ܽ:I

    .line 2905
    iget-object v1, p1, Ll/ܺ᩻ۘ;->֫:[B

    const/16 v2, 0x9

    invoke-direct {p0, v0, v2, v1}, Ll/֫ۜۘ;->֫(II[B)I

    .line 2906
    invoke-virtual {p1}, Ll/ܺ᩻ۘ;->ܽ()I

    move-result v0

    add-int/lit8 v0, v0, -0x5

    iput v0, p2, Ll/ۛ᩻ۘ;->֫:I

    .line 2907
    invoke-virtual {p1}, Ll/ܺ᩻ۘ;->֫()I

    move-result v0

    and-int/lit16 v0, v0, 0xff

    iput v0, p2, Ll/ۛ᩻ۘ;->ܽ:I

    .line 2908
    invoke-virtual {p1}, Ll/ܺ᩻ۘ;->ܽ()I

    move-result p1

    iput p1, p2, Ll/ۛ᩻ۘ;->ۧ:I

    return-void
.end method

.method private ֫([BB)V
    .locals 3

    .line 2548
    iget-object v0, p0, Ll/֫ۜۘ;->ܽ֫:Ll/۠ۢۘ;

    invoke-virtual {v0}, Ll/۠ۢۘ;->֫()V

    .line 2549
    array-length v0, p1

    add-int/lit8 v1, v0, 0x9

    .line 2551
    invoke-direct {p0, p2, v1}, Ll/֫ۜۘ;->֫(BI)V

    .line 2552
    iget-object p2, p0, Ll/֫ۜۘ;->۬:Ll/ܺ᩻ۘ;

    iget v1, p0, Ll/֫ۜۘ;->ܿ֫:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Ll/֫ۜۘ;->ܿ֫:I

    invoke-virtual {p2, v1}, Ll/ܺ᩻ۘ;->ۧ(I)V

    .line 2559
    iget-object p2, p0, Ll/֫ۜۘ;->۬:Ll/ܺ᩻ۘ;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v1, 0x0

    .line 65
    array-length v2, p1

    invoke-virtual {p2, v1, v2, p1}, Ll/ܺ᩻ۘ;->ܽ(II[B)V

    .line 2560
    invoke-virtual {p0}, Ll/᩵᩻ۘ;->᩻()Ll/۟ۢۘ;

    move-result-object p1

    iget-object p2, p0, Ll/֫ۜۘ;->ܽ֫:Ll/۠ۢۘ;

    add-int/lit8 v0, v0, 0xd

    invoke-virtual {p1, p2, p0, v0}, Ll/۟ۢۘ;->֫(Ll/۠ۢۘ;Ll/᩵᩻ۘ;I)V

    return-void
.end method

.method private ֫([BLl/֫ۡۘ;)V
    .locals 3

    .line 2477
    iget-object v0, p0, Ll/֫ۜۘ;->ܽ֫:Ll/۠ۢۘ;

    invoke-virtual {v0}, Ll/۠ۢۘ;->֫()V

    .line 2478
    array-length v0, p1

    add-int/lit8 v0, v0, 0x9

    invoke-virtual {p2}, Ll/֫ۡۘ;->ܿ()I

    move-result v1

    add-int/2addr v0, v1

    const/16 v1, 0xe

    invoke-direct {p0, v1, v0}, Ll/֫ۜۘ;->֫(BI)V

    .line 2479
    iget-object v0, p0, Ll/֫ۜۘ;->۬:Ll/ܺ᩻ۘ;

    iget v1, p0, Ll/֫ۜۘ;->ܿ֫:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Ll/֫ۜۘ;->ܿ֫:I

    invoke-virtual {v0, v1}, Ll/ܺ᩻ۘ;->ۧ(I)V

    .line 2480
    iget-object v0, p0, Ll/֫ۜۘ;->۬:Ll/ܺ᩻ۘ;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    array-length v1, p1

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1, p1}, Ll/ܺ᩻ۘ;->ܽ(II[B)V

    .line 2482
    iget-object v0, p0, Ll/֫ۜۘ;->۬:Ll/ܺ᩻ۘ;

    invoke-virtual {p2, v0}, Ll/֫ۡۘ;->֫(Ll/ܺ᩻ۘ;)V

    .line 2485
    invoke-virtual {p0}, Ll/᩵᩻ۘ;->᩻()Ll/۟ۢۘ;

    move-result-object v0

    iget-object v1, p0, Ll/֫ۜۘ;->ܽ֫:Ll/۠ۢۘ;

    array-length p1, p1

    add-int/lit8 p1, p1, 0x9

    invoke-virtual {p2}, Ll/֫ۡۘ;->ܿ()I

    move-result p2

    add-int/2addr p1, p2

    add-int/lit8 p1, p1, 0x4

    invoke-virtual {v0, v1, p0, p1}, Ll/۟ۢۘ;->֫(Ll/۠ۢۘ;Ll/᩵᩻ۘ;I)V

    return-void
.end method

.method private ֫([B[B)V
    .locals 5

    .line 2514
    iget-boolean v0, p0, Ll/֫ۜۘ;->ۤ:Z

    if-eqz v0, :cond_0

    const-string v0, "posix-rename@openssh.com"

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 2568
    :goto_0
    iget-object v1, p0, Ll/֫ۜۘ;->ܽ֫:Ll/۠ۢۘ;

    invoke-virtual {v1}, Ll/۠ۢۘ;->֫()V

    .line 2569
    array-length v1, p1

    add-int/lit8 v1, v1, 0xd

    array-length v2, p2

    add-int/2addr v1, v2

    if-nez v0, :cond_1

    const/16 v0, 0x12

    .line 2571
    invoke-direct {p0, v0, v1}, Ll/֫ۜۘ;->֫(BI)V

    .line 2572
    iget-object v0, p0, Ll/֫ۜۘ;->۬:Ll/ܺ᩻ۘ;

    iget v2, p0, Ll/֫ۜۘ;->ܿ֫:I

    add-int/lit8 v3, v2, 0x1

    iput v3, p0, Ll/֫ۜۘ;->ܿ֫:I

    invoke-virtual {v0, v2}, Ll/ܺ᩻ۘ;->ۧ(I)V

    goto :goto_1

    .line 2574
    :cond_1
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    add-int/lit8 v2, v2, 0x4

    add-int/2addr v1, v2

    const/16 v2, -0x38

    .line 2575
    invoke-direct {p0, v2, v1}, Ll/֫ۜۘ;->֫(BI)V

    .line 2576
    iget-object v2, p0, Ll/֫ۜۘ;->۬:Ll/ܺ᩻ۘ;

    iget v3, p0, Ll/֫ۜۘ;->ܿ֫:I

    add-int/lit8 v4, v3, 0x1

    iput v4, p0, Ll/֫ۜۘ;->ܿ֫:I

    invoke-virtual {v2, v3}, Ll/ܺ᩻ۘ;->ۧ(I)V

    .line 2577
    iget-object v2, p0, Ll/֫ۜۘ;->۬:Ll/ܺ᩻ۘ;

    sget-object v3, Ll/᩵ۡۘ;->ܽ:[B

    .line 397
    sget-object v3, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 393
    invoke-virtual {v0, v3}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    .line 2577
    invoke-virtual {v2, v0}, Ll/ܺ᩻ۘ;->ᩳ([B)V

    .line 2579
    :goto_1
    iget-object v0, p0, Ll/֫ۜۘ;->۬:Ll/ܺ᩻ۘ;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    array-length v2, p1

    const/4 v3, 0x0

    invoke-virtual {v0, v3, v2, p1}, Ll/ܺ᩻ۘ;->ܽ(II[B)V

    .line 2580
    iget-object p1, p0, Ll/֫ۜۘ;->۬:Ll/ܺ᩻ۘ;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    array-length v0, p2

    invoke-virtual {p1, v3, v0, p2}, Ll/ܺ᩻ۘ;->ܽ(II[B)V

    .line 2581
    invoke-virtual {p0}, Ll/᩵᩻ۘ;->᩻()Ll/۟ۢۘ;

    move-result-object p1

    iget-object p2, p0, Ll/֫ۜۘ;->ܽ֫:Ll/۠ۢۘ;

    add-int/lit8 v1, v1, 0x4

    invoke-virtual {p1, p2, p0, v1}, Ll/۟ۢۘ;->֫(Ll/۠ۢۘ;Ll/᩵᩻ۘ;I)V

    return-void
.end method

.method private ֫([ILl/ۛ᩻ۘ;)V
    .locals 3

    .line 2409
    iget-object v0, p0, Ll/֫ۜۘ;->۬:Ll/ܺ᩻ۘ;

    invoke-direct {p0, v0, p2}, Ll/֫ۜۘ;->֫(Ll/ܺ᩻ۘ;Ll/ۛ᩻ۘ;)V

    .line 2410
    iget v0, p2, Ll/ۛ᩻ۘ;->֫:I

    .line 2411
    iget v1, p2, Ll/ۛ᩻ۘ;->ܽ:I

    if-eqz p1, :cond_0

    const/4 v2, 0x0

    .line 2413
    iget p2, p2, Ll/ۛ᩻ۘ;->ۧ:I

    aput p2, p1, v2

    .line 2415
    :cond_0
    iget-object p1, p0, Ll/֫ۜۘ;->۬:Ll/ܺ᩻ۘ;

    invoke-direct {p0, p1, v0}, Ll/֫ۜۘ;->֫(Ll/ܺ᩻ۘ;I)V

    const/16 p1, 0x65

    if-ne v1, p1, :cond_2

    .line 2420
    iget-object p1, p0, Ll/֫ۜۘ;->۬:Ll/ܺ᩻ۘ;

    invoke-virtual {p1}, Ll/ܺ᩻ۘ;->ܽ()I

    move-result p1

    if-nez p1, :cond_1

    return-void

    .line 2422
    :cond_1
    iget-object p2, p0, Ll/֫ۜۘ;->۬:Ll/ܺ᩻ۘ;

    invoke-direct {p0, p2, p1}, Ll/֫ۜۘ;->ۧ(Ll/ܺ᩻ۘ;I)V

    const/4 p1, 0x0

    throw p1

    .line 2418
    :cond_2
    new-instance p1, Ll/ܽۡۘ;

    const/4 p2, 0x4

    const-string v0, ""

    invoke-direct {p1, p2, v0}, Ll/ܽۡۘ;-><init>(ILjava/lang/String;)V

    throw p1
.end method

.method public static ֫(Ljava/lang/String;[[B)Z
    .locals 5

    .line 2857
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-static {p0, v0}, Ll/᩵ۡۘ;->֫(Ljava/lang/String;Ljava/nio/charset/Charset;)[B

    move-result-object p0

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    .line 2859
    aput-object p0, p1, v0

    .line 2759
    :cond_0
    array-length p1, p0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, p1, :cond_4

    .line 2762
    aget-byte v2, p0, v1

    const/16 v3, 0x2a

    const/4 v4, 0x1

    if-eq v2, v3, :cond_3

    const/16 v3, 0x3f

    if-ne v2, v3, :cond_1

    goto :goto_1

    :cond_1
    const/16 v3, 0x5c

    if-ne v2, v3, :cond_2

    add-int/lit8 v2, v1, 0x1

    if-ge v2, p1, :cond_2

    move v1, v2

    :cond_2
    add-int/2addr v1, v4

    goto :goto_0

    :cond_3
    :goto_1
    return v4

    :cond_4
    return v0
.end method

.method private ۚ()[B
    .locals 5

    .line 2284
    iget-object v0, p0, Ll/֫ۜۘ;->ۨ:Ljava/nio/charset/Charset;

    sget-object v1, Ll/᩵ۡۘ;->ܽ:[B

    const-string v1, ""

    .line 393
    invoke-virtual {v1, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    const/16 v2, 0x10

    .line 2440
    invoke-direct {p0, v0, v2}, Ll/֫ۜۘ;->֫([BB)V

    .line 2287
    iget-object v0, p0, Ll/֫ۜۘ;->۬:Ll/ܺ᩻ۘ;

    const/4 v2, 0x0

    .line 238
    iput v2, v0, Ll/ܺ᩻ۘ;->ܽ:I

    .line 2905
    iget-object v3, v0, Ll/ܺ᩻ۘ;->֫:[B

    const/16 v4, 0x9

    invoke-direct {p0, v2, v4, v3}, Ll/֫ۜۘ;->֫(II[B)I

    .line 2906
    invoke-virtual {v0}, Ll/ܺ᩻ۘ;->ܽ()I

    move-result v2

    add-int/lit8 v2, v2, -0x5

    .line 2907
    invoke-virtual {v0}, Ll/ܺ᩻ۘ;->֫()I

    move-result v3

    and-int/lit16 v3, v3, 0xff

    .line 2908
    invoke-virtual {v0}, Ll/ܺ᩻ۘ;->ܽ()I

    .line 2291
    iget-object v0, p0, Ll/֫ۜۘ;->۬:Ll/ܺ᩻ۘ;

    invoke-direct {p0, v0, v2}, Ll/֫ۜۘ;->֫(Ll/ܺ᩻ۘ;I)V

    const/16 v0, 0x65

    if-eq v3, v0, :cond_1

    const/16 v2, 0x68

    if-ne v3, v2, :cond_0

    goto :goto_0

    .line 2294
    :cond_0
    new-instance v0, Ll/ܽۡۘ;

    const/4 v2, 0x4

    invoke-direct {v0, v2, v1}, Ll/ܽۡۘ;-><init>(ILjava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    const/4 v1, 0x0

    if-eq v3, v0, :cond_4

    .line 2301
    iget-object v0, p0, Ll/֫ۜۘ;->۬:Ll/ܺ᩻ۘ;

    invoke-virtual {v0}, Ll/ܺ᩻ۘ;->ܽ()I

    move-result v0

    :goto_1
    add-int/lit8 v2, v0, -0x1

    if-lez v0, :cond_3

    .line 2305
    iget-object v0, p0, Ll/֫ۜۘ;->۬:Ll/ܺ᩻ۘ;

    invoke-virtual {v0}, Ll/ܺ᩻ۘ;->᩷()[B

    move-result-object v1

    .line 2306
    iget v0, p0, Ll/֫ۜۘ;->ܳ֫:I

    const/4 v3, 0x3

    if-gt v0, v3, :cond_2

    .line 2307
    iget-object v0, p0, Ll/֫ۜۘ;->۬:Ll/ܺ᩻ۘ;

    invoke-virtual {v0}, Ll/ܺ᩻ۘ;->᩷()[B

    .line 2309
    :cond_2
    iget-object v0, p0, Ll/֫ۜۘ;->۬:Ll/ܺ᩻ۘ;

    invoke-static {v0}, Ll/֫ۡۘ;->ۧ(Ll/ܺ᩻ۘ;)Ll/֫ۡۘ;

    move v0, v2

    goto :goto_1

    :cond_3
    return-object v1

    .line 2298
    :cond_4
    iget-object v0, p0, Ll/֫ۜۘ;->۬:Ll/ܺ᩻ۘ;

    invoke-virtual {v0}, Ll/ܺ᩻ۘ;->ܽ()I

    move-result v0

    .line 2299
    iget-object v2, p0, Ll/֫ۜۘ;->۬:Ll/ܺ᩻ۘ;

    invoke-direct {p0, v2, v0}, Ll/֫ۜۘ;->ۧ(Ll/ܺ᩻ۘ;I)V

    throw v1
.end method

.method private ۜ(Ljava/lang/String;)Z
    .locals 3

    const/4 v0, 0x0

    .line 1944
    :try_start_0
    iget-object v1, p0, Ll/֫ۜۘ;->ۨ:Ljava/nio/charset/Charset;

    invoke-static {p1, v1}, Ll/᩵ۡۘ;->֫(Ljava/lang/String;Ljava/nio/charset/Charset;)[B

    move-result-object p1

    const/16 v1, 0x11

    .line 2444
    invoke-direct {p0, p1, v1}, Ll/֫ۜۘ;->֫([BB)V

    .line 1947
    iget-object p1, p0, Ll/֫ۜۘ;->۬:Ll/ܺ᩻ۘ;

    .line 238
    iput v0, p1, Ll/ܺ᩻ۘ;->ܽ:I

    .line 2905
    iget-object v1, p1, Ll/ܺ᩻ۘ;->֫:[B

    const/16 v2, 0x9

    invoke-direct {p0, v0, v2, v1}, Ll/֫ۜۘ;->֫(II[B)I

    .line 2906
    invoke-virtual {p1}, Ll/ܺ᩻ۘ;->ܽ()I

    move-result v1

    add-int/lit8 v1, v1, -0x5

    .line 2907
    invoke-virtual {p1}, Ll/ܺ᩻ۘ;->֫()I

    move-result v2

    and-int/lit16 v2, v2, 0xff

    .line 2908
    invoke-virtual {p1}, Ll/ܺ᩻ۘ;->ܽ()I

    .line 1951
    iget-object p1, p0, Ll/֫ۜۘ;->۬:Ll/ܺ᩻ۘ;

    invoke-direct {p0, p1, v1}, Ll/֫ۜۘ;->֫(Ll/ܺ᩻ۘ;I)V

    const/16 p1, 0x69

    if-eq v2, p1, :cond_0

    goto :goto_0

    .line 1956
    :cond_0
    iget-object p1, p0, Ll/֫ۜۘ;->۬:Ll/ܺ᩻ۘ;

    invoke-static {p1}, Ll/֫ۡۘ;->ۧ(Ll/ܺ᩻ۘ;)Ll/֫ۡۘ;

    move-result-object p1

    .line 1957
    invoke-virtual {p1}, Ll/֫ۡۘ;->ۧ()Z

    move-result p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    :goto_0
    return v0
.end method

.method private ۢ(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    const/4 v0, 0x0

    .line 2913
    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/16 v1, 0x2f

    if-ne v0, v1, :cond_0

    return-object p1

    .line 2387
    :cond_0
    iget-object v0, p0, Ll/֫ۜۘ;->۫:Ljava/lang/String;

    if-nez v0, :cond_1

    .line 2388
    invoke-virtual {p0}, Ll/֫ۜۘ;->֡()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/֫ۜۘ;->۫:Ljava/lang/String;

    .line 2389
    :cond_1
    iget-object v0, p0, Ll/֫ۜۘ;->۫:Ljava/lang/String;

    const-string v1, "/"

    .line 2917
    invoke-virtual {v0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 2918
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 0
    :cond_2
    invoke-static {v0, v1, p1}, Ll/᩺۠ܽ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public static bridge synthetic ۧ(Ll/֫ۜۘ;)Ljava/io/InputStream;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/֫ۜۘ;->۟:Ljava/io/InputStream;

    return-object p0
.end method

.method private ۧ(Ll/ܺ᩻ۘ;I)V
    .locals 5

    .line 2837
    iget v0, p0, Ll/֫ۜۘ;->ܳ֫:I

    const/4 v1, 0x3

    if-lt v0, v1, :cond_0

    .line 2838
    invoke-virtual {p1}, Ll/ܺ᩻ۘ;->ᩳ()I

    move-result v0

    const/4 v1, 0x4

    if-lt v0, v1, :cond_0

    .line 2839
    invoke-virtual {p1}, Ll/ܺ᩻ۘ;->᩷()[B

    move-result-object p1

    .line 2841
    new-instance v0, Ll/ܽۡۘ;

    sget-object v1, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    sget-object v2, Ll/᩵ۡۘ;->ܽ:[B

    .line 401
    array-length v2, p1

    .line 405
    new-instance v3, Ljava/lang/String;

    const/4 v4, 0x0

    invoke-direct {v3, p1, v4, v2, v1}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 2841
    invoke-direct {v0, p2, v3}, Ll/ܽۡۘ;-><init>(ILjava/lang/String;)V

    throw v0

    .line 2843
    :cond_0
    new-instance p1, Ll/ܽۡۘ;

    const-string v0, "Failure"

    invoke-direct {p1, p2, v0}, Ll/ܽۡۘ;-><init>(ILjava/lang/String;)V

    throw p1
.end method

.method private ۧ([BLl/֫ۡۘ;)V
    .locals 4

    .line 2464
    iget-object v0, p0, Ll/֫ۜۘ;->ܽ֫:Ll/۠ۢۘ;

    invoke-virtual {v0}, Ll/۠ۢۘ;->֫()V

    .line 2465
    array-length v0, p1

    const/16 v1, 0x9

    add-int/2addr v0, v1

    invoke-virtual {p2}, Ll/֫ۡۘ;->ܿ()I

    move-result v2

    add-int/2addr v0, v2

    invoke-direct {p0, v1, v0}, Ll/֫ۜۘ;->֫(BI)V

    .line 2466
    iget-object v0, p0, Ll/֫ۜۘ;->۬:Ll/ܺ᩻ۘ;

    iget v2, p0, Ll/֫ۜۘ;->ܿ֫:I

    add-int/lit8 v3, v2, 0x1

    iput v3, p0, Ll/֫ۜۘ;->ܿ֫:I

    invoke-virtual {v0, v2}, Ll/ܺ᩻ۘ;->ۧ(I)V

    .line 2467
    iget-object v0, p0, Ll/֫ۜۘ;->۬:Ll/ܺ᩻ۘ;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v2, 0x0

    .line 65
    array-length v3, p1

    invoke-virtual {v0, v2, v3, p1}, Ll/ܺ᩻ۘ;->ܽ(II[B)V

    .line 2468
    iget-object v0, p0, Ll/֫ۜۘ;->۬:Ll/ܺ᩻ۘ;

    invoke-virtual {p2, v0}, Ll/֫ۡۘ;->֫(Ll/ܺ᩻ۘ;)V

    .line 2469
    invoke-virtual {p0}, Ll/᩵᩻ۘ;->᩻()Ll/۟ۢۘ;

    move-result-object v0

    iget-object v2, p0, Ll/֫ۜۘ;->ܽ֫:Ll/۠ۢۘ;

    array-length p1, p1

    add-int/2addr p1, v1

    invoke-virtual {p2}, Ll/֫ۡۘ;->ܿ()I

    move-result p2

    add-int/2addr p1, p2

    add-int/lit8 p1, p1, 0x4

    invoke-virtual {v0, v2, p0, p1}, Ll/۟ۢۘ;->֫(Ll/۠ۢۘ;Ll/᩵᩻ۘ;I)V

    return-void
.end method

.method public static bridge synthetic ܳ(Ll/֫ۜۘ;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/֫ۜۘ;->ۜ֫:Z

    return p0
.end method

.method public static bridge synthetic ܽ(Ll/֫ۜۘ;)Ll/۟᩻ۘ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/֫ۜۘ;->ᩳ֫:Ll/۟᩻ۘ;

    return-object p0
.end method

.method private ܽ(Ljava/lang/String;Ll/֫ۡۘ;)V
    .locals 2

    .line 2335
    :try_start_0
    iget-object v0, p0, Ll/֫ۜۘ;->ۨ:Ljava/nio/charset/Charset;

    invoke-static {p1, v0}, Ll/᩵ۡۘ;->֫(Ljava/lang/String;Ljava/nio/charset/Charset;)[B

    move-result-object p1

    invoke-direct {p0, p1, p2}, Ll/֫ۜۘ;->ۧ([BLl/֫ۡۘ;)V

    .line 2338
    iget-object p1, p0, Ll/֫ۜۘ;->۬:Ll/ܺ᩻ۘ;

    const/4 p2, 0x0

    .line 238
    iput p2, p1, Ll/ܺ᩻ۘ;->ܽ:I

    .line 2905
    iget-object v0, p1, Ll/ܺ᩻ۘ;->֫:[B

    const/16 v1, 0x9

    invoke-direct {p0, p2, v1, v0}, Ll/֫ۜۘ;->֫(II[B)I

    .line 2906
    invoke-virtual {p1}, Ll/ܺ᩻ۘ;->ܽ()I

    move-result p2

    add-int/lit8 p2, p2, -0x5

    .line 2907
    invoke-virtual {p1}, Ll/ܺ᩻ۘ;->֫()I

    move-result v0

    and-int/lit16 v0, v0, 0xff

    .line 2908
    invoke-virtual {p1}, Ll/ܺ᩻ۘ;->ܽ()I

    .line 2342
    iget-object p1, p0, Ll/֫ۜۘ;->۬:Ll/ܺ᩻ۘ;

    invoke-direct {p0, p1, p2}, Ll/֫ۜۘ;->֫(Ll/ܺ᩻ۘ;I)V

    const/16 p1, 0x65

    if-ne v0, p1, :cond_1

    .line 2347
    iget-object p1, p0, Ll/֫ۜۘ;->۬:Ll/ܺ᩻ۘ;

    invoke-virtual {p1}, Ll/ܺ᩻ۘ;->ܽ()I

    move-result p1

    if-nez p1, :cond_0

    return-void

    .line 2349
    :cond_0
    iget-object p2, p0, Ll/֫ۜۘ;->۬:Ll/ܺ᩻ۘ;

    invoke-direct {p0, p2, p1}, Ll/֫ۜۘ;->ۧ(Ll/ܺ᩻ۘ;I)V

    const/4 p1, 0x0

    throw p1

    .line 2345
    :cond_1
    new-instance p1, Ll/ܽۡۘ;

    const-string p2, ""

    const/4 v0, 0x4

    invoke-direct {p1, v0, p2}, Ll/ܽۡۘ;-><init>(ILjava/lang/String;)V

    throw p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception p1

    .line 2352
    instance-of p2, p1, Ll/ܽۡۘ;

    if-eqz p2, :cond_2

    .line 2353
    check-cast p1, Ll/ܽۡۘ;

    throw p1

    .line 2354
    :cond_2
    new-instance p2, Ll/ܽۡۘ;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p2, v0, p1}, Ll/ܽۡۘ;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    throw p2
.end method

.method public static bridge synthetic ܿ(Ll/֫ۜۘ;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/֫ۜۘ;->ܳ֫:I

    return p0
.end method

.method public static bridge synthetic ᩳ(Ll/֫ۜۘ;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/֫ۜۘ;->ܿ֫:I

    return p0
.end method

.method private ᩷(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 2937
    invoke-direct {p0, p1}, Ll/֫ۜۘ;->᩻(Ljava/lang/String;)Ljava/util/Vector;

    move-result-object v0

    .line 2938
    invoke-virtual {v0}, Ljava/util/Vector;->size()I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    const/4 p1, 0x0

    .line 2941
    invoke-virtual {v0, p1}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    return-object p1

    .line 2939
    :cond_0
    new-instance v1, Ll/ܽۡۘ;

    const-string v2, " is not unique: "

    .line 0
    invoke-static {p1, v2}, Ll/۟֫ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    .line 2939
    invoke-virtual {v0}, Ljava/util/Vector;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x4

    invoke-direct {v1, v0, p1}, Ll/ܽۡۘ;-><init>(ILjava/lang/String;)V

    throw v1
.end method

.method private ᩻(Ljava/lang/String;)Ljava/util/Vector;
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 2639
    new-instance v2, Ljava/util/Vector;

    invoke-direct {v2}, Ljava/util/Vector;-><init>()V

    const/16 v3, 0x2f

    .line 2642
    invoke-virtual {v1, v3}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v3

    if-gez v3, :cond_0

    .line 2644
    invoke-static/range {p1 .. p1}, Ll/᩵ۡۘ;->ܽ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/util/Vector;->addElement(Ljava/lang/Object;)V

    return-object v2

    :cond_0
    const/4 v4, 0x1

    if-nez v3, :cond_1

    const/4 v5, 0x1

    goto :goto_0

    :cond_1
    move v5, v3

    :goto_0
    const/4 v6, 0x0

    .line 2648
    invoke-virtual {v1, v6, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v5

    add-int/2addr v3, v4

    .line 2649
    invoke-virtual {v1, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    .line 2651
    invoke-static {v5}, Ll/᩵ۡۘ;->ܽ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    new-array v4, v4, [[B

    .line 2655
    invoke-static {v1, v4}, Ll/֫ۜۘ;->֫(Ljava/lang/String;[[B)Z

    move-result v5

    const-string v7, "/"

    if-nez v5, :cond_3

    .line 2658
    invoke-virtual {v3, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_2

    .line 2659
    invoke-virtual {v3, v7}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 0
    :cond_2
    invoke-static {v3}, Ll/ۚ۬ۚ;->֫(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    .line 2660
    invoke-static {v1}, Ll/᩵ۡۘ;->ܽ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/util/Vector;->addElement(Ljava/lang/Object;)V

    return-object v2

    .line 2664
    :cond_3
    aget-object v1, v4, v6

    .line 2666
    iget-object v4, v0, Ll/֫ۜۘ;->ۨ:Ljava/nio/charset/Charset;

    invoke-static {v3, v4}, Ll/᩵ۡۘ;->֫(Ljava/lang/String;Ljava/nio/charset/Charset;)[B

    move-result-object v4

    const/16 v5, 0xb

    .line 2505
    invoke-direct {v0, v4, v5}, Ll/֫ۜۘ;->֫([BB)V

    .line 2668
    new-instance v4, Ll/ۛ᩻ۘ;

    .line 2897
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 2669
    iget-object v5, v0, Ll/֫ۜۘ;->۬:Ll/ܺ᩻ۘ;

    invoke-direct {v0, v5, v4}, Ll/֫ۜۘ;->֫(Ll/ܺ᩻ۘ;Ll/ۛ᩻ۘ;)V

    .line 2670
    iget v5, v4, Ll/ۛ᩻ۘ;->֫:I

    .line 2671
    iget v8, v4, Ll/ۛ᩻ۘ;->ܽ:I

    .line 2673
    iget-object v9, v0, Ll/֫ۜۘ;->۬:Ll/ܺ᩻ۘ;

    invoke-direct {v0, v9, v5}, Ll/֫ۜۘ;->֫(Ll/ܺ᩻ۘ;I)V

    const-string v5, ""

    const/4 v9, 0x4

    const/16 v10, 0x65

    if-eq v8, v10, :cond_5

    const/16 v11, 0x66

    if-ne v8, v11, :cond_4

    goto :goto_1

    .line 2676
    :cond_4
    new-instance v1, Ll/ܽۡۘ;

    invoke-direct {v1, v9, v5}, Ll/ܽۡۘ;-><init>(ILjava/lang/String;)V

    throw v1

    :cond_5
    :goto_1
    const/4 v11, 0x0

    if-eq v8, v10, :cond_14

    .line 2683
    iget-object v8, v0, Ll/֫ۜۘ;->۬:Ll/ܺ᩻ۘ;

    invoke-virtual {v8}, Ll/ܺ᩻ۘ;->᩷()[B

    move-result-object v8

    move-object v12, v11

    :goto_2
    const/16 v13, 0xc

    .line 2509
    invoke-direct {v0, v8, v13}, Ll/֫ۜۘ;->֫([BB)V

    .line 2688
    iget-object v13, v0, Ll/֫ۜۘ;->۬:Ll/ܺ᩻ۘ;

    invoke-direct {v0, v13, v4}, Ll/֫ۜۘ;->֫(Ll/ܺ᩻ۘ;Ll/ۛ᩻ۘ;)V

    .line 2689
    iget v13, v4, Ll/ۛ᩻ۘ;->֫:I

    .line 2690
    iget v14, v4, Ll/ۛ᩻ۘ;->ܽ:I

    if-eq v14, v10, :cond_7

    const/16 v15, 0x68

    if-ne v14, v15, :cond_6

    goto :goto_3

    .line 2693
    :cond_6
    new-instance v1, Ll/ܽۡۘ;

    invoke-direct {v1, v9, v5}, Ll/ܽۡۘ;-><init>(ILjava/lang/String;)V

    throw v1

    :cond_7
    :goto_3
    if-ne v14, v10, :cond_8

    .line 2696
    iget-object v1, v0, Ll/֫ۜۘ;->۬:Ll/ܺ᩻ۘ;

    invoke-direct {v0, v1, v13}, Ll/֫ۜۘ;->֫(Ll/ܺ᩻ۘ;I)V

    .line 2518
    invoke-direct {v0, v8, v9}, Ll/֫ۜۘ;->֫([BB)V

    .line 2429
    invoke-direct {v0, v11, v4}, Ll/֫ۜۘ;->֫([ILl/ۛ᩻ۘ;)V

    return-object v2

    .line 2700
    :cond_8
    iget-object v10, v0, Ll/֫ۜۘ;->۬:Ll/ܺ᩻ۘ;

    .line 238
    iput v6, v10, Ll/ܺ᩻ۘ;->ܽ:I

    .line 2701
    iget-object v10, v10, Ll/ܺ᩻ۘ;->֫:[B

    invoke-direct {v0, v6, v9, v10}, Ll/֫ۜۘ;->֫(II[B)I

    add-int/lit8 v13, v13, -0x4

    .line 2703
    iget-object v9, v0, Ll/֫ۜۘ;->۬:Ll/ܺ᩻ۘ;

    invoke-virtual {v9}, Ll/ܺ᩻ۘ;->ܽ()I

    move-result v9

    .line 2708
    iget-object v10, v0, Ll/֫ۜۘ;->۬:Ll/ܺ᩻ۘ;

    invoke-virtual {v10}, Ll/ܺ᩻ۘ;->ۡ()V

    :goto_4
    if-lez v9, :cond_13

    if-lez v13, :cond_c

    .line 2711
    iget-object v10, v0, Ll/֫ۜۘ;->۬:Ll/ܺ᩻ۘ;

    .line 230
    iget v14, v10, Ll/ܺ᩻ۘ;->ܽ:I

    if-nez v14, :cond_9

    goto :goto_5

    .line 232
    :cond_9
    iget-object v15, v10, Ll/ܺ᩻ۘ;->֫:[B

    iget v11, v10, Ll/ܺ᩻ۘ;->ۧ:I

    sub-int/2addr v11, v14

    invoke-static {v15, v14, v15, v6, v11}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 233
    iget v11, v10, Ll/ܺ᩻ۘ;->ۧ:I

    iget v14, v10, Ll/ܺ᩻ۘ;->ܽ:I

    sub-int/2addr v11, v14

    iput v11, v10, Ll/ܺ᩻ۘ;->ۧ:I

    .line 234
    iput v6, v10, Ll/ܺ᩻ۘ;->ܽ:I

    .line 2713
    :goto_5
    iget-object v10, v0, Ll/֫ۜۘ;->۬:Ll/ܺ᩻ۘ;

    iget-object v11, v10, Ll/ܺ᩻ۘ;->֫:[B

    array-length v14, v11

    iget v10, v10, Ll/ܺ᩻ۘ;->ۧ:I

    add-int v15, v10, v13

    if-le v14, v15, :cond_a

    move v14, v13

    goto :goto_6

    :cond_a
    array-length v14, v11

    sub-int/2addr v14, v10

    .line 2714
    :goto_6
    iget-object v15, v0, Ll/֫ۜۘ;->۟:Ljava/io/InputStream;

    invoke-virtual {v15, v11, v10, v14}, Ljava/io/InputStream;->read([BII)I

    move-result v10

    if-gtz v10, :cond_b

    goto :goto_9

    .line 2717
    :cond_b
    iget-object v11, v0, Ll/֫ۜۘ;->۬:Ll/ܺ᩻ۘ;

    iget v14, v11, Ll/ܺ᩻ۘ;->ۧ:I

    add-int/2addr v14, v10

    iput v14, v11, Ll/ܺ᩻ۘ;->ۧ:I

    sub-int/2addr v13, v10

    .line 2721
    :cond_c
    iget-object v10, v0, Ll/֫ۜۘ;->۬:Ll/ܺ᩻ۘ;

    invoke-virtual {v10}, Ll/ܺ᩻ۘ;->᩷()[B

    move-result-object v10

    .line 2723
    iget v11, v0, Ll/֫ۜۘ;->ܳ֫:I

    const/4 v14, 0x3

    if-gt v11, v14, :cond_d

    .line 2724
    iget-object v11, v0, Ll/֫ۜۘ;->۬:Ll/ܺ᩻ۘ;

    invoke-virtual {v11}, Ll/ܺ᩻ۘ;->᩷()[B

    .line 2726
    :cond_d
    iget-object v11, v0, Ll/֫ۜۘ;->۬:Ll/ܺ᩻ۘ;

    invoke-static {v11}, Ll/֫ۡۘ;->ۧ(Ll/ܺ᩻ۘ;)Ll/֫ۡۘ;

    .line 2732
    iget-boolean v11, v0, Ll/֫ۜۘ;->᩺:Z

    if-nez v11, :cond_e

    .line 2733
    iget-object v11, v0, Ll/֫ۜۘ;->ۨ:Ljava/nio/charset/Charset;

    .line 401
    array-length v14, v10

    .line 405
    new-instance v15, Ljava/lang/String;

    invoke-direct {v15, v10, v6, v14, v11}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 2734
    sget-object v11, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 393
    invoke-virtual {v15, v11}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v11

    goto :goto_7

    :cond_e
    move-object v11, v10

    const/4 v15, 0x0

    .line 2736
    :goto_7
    invoke-static {v1, v11}, Ll/᩵ۡۘ;->ܽ([B[B)Z

    move-result v11

    if-eqz v11, :cond_12

    if-nez v15, :cond_f

    .line 2740
    iget-object v11, v0, Ll/֫ۜۘ;->ۨ:Ljava/nio/charset/Charset;

    .line 401
    array-length v14, v10

    .line 405
    new-instance v15, Ljava/lang/String;

    invoke-direct {v15, v10, v6, v14, v11}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    :cond_f
    if-nez v12, :cond_11

    .line 2744
    invoke-virtual {v3, v7}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v10

    if-nez v10, :cond_10

    .line 2745
    invoke-virtual {v3, v7}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    goto :goto_8

    :cond_10
    move-object v12, v3

    .line 2748
    :cond_11
    :goto_8
    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v10, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v2, v10}, Ljava/util/Vector;->addElement(Ljava/lang/Object;)V

    :cond_12
    add-int/lit8 v9, v9, -0x1

    const/4 v11, 0x0

    goto/16 :goto_4

    :cond_13
    :goto_9
    const/4 v9, 0x4

    const/16 v10, 0x65

    const/4 v11, 0x0

    goto/16 :goto_2

    .line 2679
    :cond_14
    iget-object v1, v0, Ll/֫ۜۘ;->۬:Ll/ܺ᩻ۘ;

    invoke-virtual {v1}, Ll/ܺ᩻ۘ;->ܽ()I

    move-result v1

    .line 2680
    iget-object v2, v0, Ll/֫ۜۘ;->۬:Ll/ܺ᩻ۘ;

    invoke-direct {v0, v2, v1}, Ll/֫ۜۘ;->ۧ(Ll/ܺ᩻ۘ;I)V

    const/4 v1, 0x0

    throw v1
.end method


# virtual methods
.method public final ֡()Ljava/lang/String;
    .locals 5

    .line 2371
    iget-object v0, p0, Ll/֫ۜۘ;->ܰ:Ljava/lang/String;

    if-nez v0, :cond_1

    .line 2373
    :try_start_0
    iget-object v0, p0, Ll/֫ۜۘ;->۟:Ljava/io/InputStream;

    check-cast v0, Ll/ۖ᩻ۘ;

    invoke-virtual {v0}, Ll/ۖ᩻ۘ;->֫()V

    .line 2375
    invoke-direct {p0}, Ll/֫ۜۘ;->ۚ()[B

    move-result-object v0

    .line 2376
    iget-object v1, p0, Ll/֫ۜۘ;->ۨ:Ljava/nio/charset/Charset;

    .line 401
    array-length v2, v0

    .line 405
    new-instance v3, Ljava/lang/String;

    const/4 v4, 0x0

    invoke-direct {v3, v0, v4, v2, v1}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 2376
    iput-object v3, p0, Ll/֫ۜۘ;->ܰ:Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 2378
    instance-of v1, v0, Ll/ܽۡۘ;

    if-eqz v1, :cond_0

    .line 2379
    check-cast v0, Ll/ܽۡۘ;

    throw v0

    .line 2380
    :cond_0
    new-instance v1, Ll/ܽۡۘ;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Ll/ܽۡۘ;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    throw v1

    .line 2383
    :cond_1
    :goto_0
    iget-object v0, p0, Ll/֫ۜۘ;->ܰ:Ljava/lang/String;

    return-object v0
.end method

.method public final ֫(JLjava/lang/String;)Ljava/io/InputStream;
    .locals 3

    .line 1276
    :try_start_0
    iget-object v0, p0, Ll/֫ۜۘ;->۟:Ljava/io/InputStream;

    check-cast v0, Ll/ۖ᩻ۘ;

    invoke-virtual {v0}, Ll/ۖ᩻ۘ;->֫()V

    .line 1278
    invoke-direct {p0, p3}, Ll/֫ۜۘ;->ۢ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    .line 1279
    invoke-direct {p0, p3}, Ll/֫ۜۘ;->᩷(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    .line 1281
    iget-object v0, p0, Ll/֫ۜۘ;->ۨ:Ljava/nio/charset/Charset;

    invoke-static {p3, v0}, Ll/᩵ۡۘ;->֫(Ljava/lang/String;Ljava/nio/charset/Charset;)[B

    move-result-object p3

    .line 1283
    invoke-direct {p0, p3}, Ll/֫ۜۘ;->֫([B)Ll/֫ۡۘ;

    const/4 v0, 0x1

    .line 2522
    invoke-direct {p0, v0, p3}, Ll/֫ۜۘ;->֫(I[B)V

    .line 1291
    iget-object p3, p0, Ll/֫ۜۘ;->۬:Ll/ܺ᩻ۘ;

    const/4 v0, 0x0

    .line 238
    iput v0, p3, Ll/ܺ᩻ۘ;->ܽ:I

    .line 2905
    iget-object v1, p3, Ll/ܺ᩻ۘ;->֫:[B

    const/16 v2, 0x9

    invoke-direct {p0, v0, v2, v1}, Ll/֫ۜۘ;->֫(II[B)I

    .line 2906
    invoke-virtual {p3}, Ll/ܺ᩻ۘ;->ܽ()I

    move-result v1

    add-int/lit8 v1, v1, -0x5

    .line 2907
    invoke-virtual {p3}, Ll/ܺ᩻ۘ;->֫()I

    move-result v2

    and-int/lit16 v2, v2, 0xff

    .line 2908
    invoke-virtual {p3}, Ll/ܺ᩻ۘ;->ܽ()I

    .line 1295
    iget-object p3, p0, Ll/֫ۜۘ;->۬:Ll/ܺ᩻ۘ;

    invoke-direct {p0, p3, v1}, Ll/֫ۜۘ;->֫(Ll/ܺ᩻ۘ;I)V

    const/16 p3, 0x65

    if-eq v2, p3, :cond_1

    const/16 v1, 0x66

    if-ne v2, v1, :cond_0

    goto :goto_0

    .line 1298
    :cond_0
    new-instance p1, Ll/ܽۡۘ;

    const-string p2, ""

    const/4 p3, 0x4

    invoke-direct {p1, p3, p2}, Ll/ܽۡۘ;-><init>(ILjava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    if-eq v2, p3, :cond_2

    .line 1305
    iget-object p3, p0, Ll/֫ۜۘ;->۬:Ll/ܺ᩻ۘ;

    invoke-virtual {p3}, Ll/ܺ᩻ۘ;->᩷()[B

    move-result-object p3

    .line 1307
    iget-object v1, p0, Ll/֫ۜۘ;->ᩳ֫:Ll/۟᩻ۘ;

    .line 1170
    iput v0, v1, Ll/۟᩻ۘ;->֫:I

    iput v0, v1, Ll/۟᩻ۘ;->ۧ:I

    .line 1309
    new-instance v0, Ll/ۤ᩻ۘ;

    invoke-direct {v0, p0, p1, p2, p3}, Ll/ۤ᩻ۘ;-><init>(Ll/֫ۜۘ;J[B)V

    return-object v0

    .line 1301
    :cond_2
    iget-object p1, p0, Ll/֫ۜۘ;->۬:Ll/ܺ᩻ۘ;

    invoke-virtual {p1}, Ll/ܺ᩻ۘ;->ܽ()I

    move-result p1

    .line 1302
    iget-object p2, p0, Ll/֫ۜۘ;->۬:Ll/ܺ᩻ۘ;

    invoke-direct {p0, p2, p1}, Ll/֫ۜۘ;->ۧ(Ll/ܺ᩻ۘ;I)V

    const/4 p1, 0x0

    throw p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception p1

    .line 1521
    instance-of p2, p1, Ll/ܽۡۘ;

    if-eqz p2, :cond_3

    .line 1522
    check-cast p1, Ll/ܽۡۘ;

    throw p1

    .line 1523
    :cond_3
    new-instance p2, Ll/ܽۡۘ;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-direct {p2, p3, p1}, Ll/ܽۡۘ;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    throw p2
.end method

.method public final ֫(Ljava/lang/String;)Ljava/util/Vector;
    .locals 16

    move-object/from16 v1, p0

    .line 1528
    new-instance v0, Ljava/util/Vector;

    invoke-direct {v0}, Ljava/util/Vector;-><init>()V

    .line 1551
    :try_start_0
    iget-object v2, v1, Ll/֫ۜۘ;->۟:Ljava/io/InputStream;

    check-cast v2, Ll/ۖ᩻ۘ;

    invoke-virtual {v2}, Ll/ۖ᩻ۘ;->֫()V

    .line 1553
    invoke-direct/range {p0 .. p1}, Ll/֫ۜۘ;->ۢ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 1555
    new-instance v3, Ljava/util/Vector;

    invoke-direct {v3}, Ljava/util/Vector;-><init>()V

    const/16 v3, 0x2f

    .line 1557
    invoke-virtual {v2, v3}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v3

    const/4 v4, 0x1

    if-nez v3, :cond_0

    const/4 v5, 0x1

    goto :goto_0

    :cond_0
    move v5, v3

    :goto_0
    const/4 v6, 0x0

    .line 1558
    invoke-virtual {v2, v6, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v5

    add-int/2addr v3, v4

    .line 1559
    invoke-virtual {v2, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v3

    .line 1560
    invoke-static {v5}, Ll/᩵ۡۘ;->ܽ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    new-array v7, v4, [[B

    .line 1565
    invoke-static {v3, v7}, Ll/֫ۜۘ;->֫(Ljava/lang/String;[[B)Z

    move-result v8

    const/4 v9, 0x0

    if-eqz v8, :cond_1

    .line 1568
    aget-object v2, v7, v6

    goto :goto_1

    .line 1570
    :cond_1
    invoke-static {v2}, Ll/᩵ۡۘ;->ܽ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 2184
    iget-object v10, v1, Ll/֫ۜۘ;->ۨ:Ljava/nio/charset/Charset;

    invoke-static {v2, v10}, Ll/᩵ۡۘ;->֫(Ljava/lang/String;Ljava/nio/charset/Charset;)[B

    move-result-object v10

    invoke-direct {v1, v10}, Ll/֫ۜۘ;->֫([B)Ll/֫ۡۘ;

    move-result-object v10

    .line 1573
    invoke-virtual {v10}, Ll/֫ۡۘ;->ۧ()Z

    move-result v10

    if-eqz v10, :cond_2

    move-object v5, v2

    move-object v2, v9

    goto :goto_1

    .line 1583
    :cond_2
    iget-boolean v2, v1, Ll/֫ۜۘ;->᩺:Z

    if-eqz v2, :cond_3

    .line 1584
    aget-object v2, v7, v6

    .line 1585
    invoke-static {v2}, Ll/᩵ۡۘ;->ᩳ([B)[B

    move-result-object v2

    goto :goto_1

    .line 1587
    :cond_3
    invoke-static {v3}, Ll/᩵ۡۘ;->ܽ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 1588
    iget-object v3, v1, Ll/֫ۜۘ;->ۨ:Ljava/nio/charset/Charset;

    invoke-static {v2, v3}, Ll/᩵ۡۘ;->֫(Ljava/lang/String;Ljava/nio/charset/Charset;)[B

    move-result-object v2

    .line 1593
    :goto_1
    iget-object v3, v1, Ll/֫ۜۘ;->ۨ:Ljava/nio/charset/Charset;

    invoke-static {v5, v3}, Ll/᩵ۡۘ;->֫(Ljava/lang/String;Ljava/nio/charset/Charset;)[B

    move-result-object v3

    const/16 v5, 0xb

    .line 2505
    invoke-direct {v1, v3, v5}, Ll/֫ۜۘ;->֫([BB)V

    .line 1595
    new-instance v3, Ll/ۛ᩻ۘ;

    .line 2897
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 1596
    iget-object v5, v1, Ll/֫ۜۘ;->۬:Ll/ܺ᩻ۘ;

    invoke-direct {v1, v5, v3}, Ll/֫ۜۘ;->֫(Ll/ܺ᩻ۘ;Ll/ۛ᩻ۘ;)V

    .line 1597
    iget v5, v3, Ll/ۛ᩻ۘ;->֫:I

    .line 1598
    iget v7, v3, Ll/ۛ᩻ۘ;->ܽ:I

    .line 1600
    iget-object v10, v1, Ll/֫ۜۘ;->۬:Ll/ܺ᩻ۘ;

    invoke-direct {v1, v10, v5}, Ll/֫ۜۘ;->֫(Ll/ܺ᩻ۘ;I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const-string v5, ""

    const/4 v10, 0x4

    const/16 v11, 0x65

    if-eq v7, v11, :cond_5

    const/16 v12, 0x66

    if-ne v7, v12, :cond_4

    goto :goto_2

    .line 1603
    :cond_4
    :try_start_1
    new-instance v0, Ll/ܽۡۘ;

    invoke-direct {v0, v10, v5}, Ll/ܽۡۘ;-><init>(ILjava/lang/String;)V

    throw v0

    :cond_5
    :goto_2
    if-eq v7, v11, :cond_15

    .line 1611
    iget-object v7, v1, Ll/֫ۜۘ;->۬:Ll/ܺ᩻ۘ;

    invoke-virtual {v7}, Ll/ܺ᩻ۘ;->᩷()[B

    move-result-object v7

    :cond_6
    const/16 v12, 0xc

    .line 2509
    invoke-direct {v1, v7, v12}, Ll/֫ۜۘ;->֫([BB)V

    .line 1617
    iget-object v12, v1, Ll/֫ۜۘ;->۬:Ll/ܺ᩻ۘ;

    invoke-direct {v1, v12, v3}, Ll/֫ۜۘ;->֫(Ll/ܺ᩻ۘ;Ll/ۛ᩻ۘ;)V

    .line 1618
    iget v12, v3, Ll/ۛ᩻ۘ;->֫:I

    .line 1619
    iget v13, v3, Ll/ۛ᩻ۘ;->ܽ:I

    if-eq v13, v11, :cond_8

    const/16 v14, 0x68

    if-ne v13, v14, :cond_7

    goto :goto_3

    .line 1621
    :cond_7
    new-instance v0, Ll/ܽۡۘ;

    invoke-direct {v0, v10, v5}, Ll/ܽۡۘ;-><init>(ILjava/lang/String;)V

    throw v0

    :cond_8
    :goto_3
    if-ne v13, v11, :cond_a

    .line 1624
    iget-object v2, v1, Ll/֫ۜۘ;->۬:Ll/ܺ᩻ۘ;

    invoke-direct {v1, v2, v12}, Ll/֫ۜۘ;->֫(Ll/ܺ᩻ۘ;I)V

    .line 1625
    iget-object v2, v1, Ll/֫ۜۘ;->۬:Ll/ܺ᩻ۘ;

    invoke-virtual {v2}, Ll/ܺ᩻ۘ;->ܽ()I

    move-result v2

    if-ne v2, v4, :cond_9

    .line 2518
    invoke-direct {v1, v7, v10}, Ll/֫ۜۘ;->֫([BB)V

    .line 2429
    invoke-direct {v1, v9, v3}, Ll/֫ۜۘ;->֫([ILl/ۛ᩻ۘ;)V

    return-object v0

    .line 1628
    :cond_9
    iget-object v0, v1, Ll/֫ۜۘ;->۬:Ll/ܺ᩻ۘ;

    invoke-direct {v1, v0, v2}, Ll/֫ۜۘ;->ۧ(Ll/ܺ᩻ۘ;I)V

    throw v9

    .line 1631
    :cond_a
    iget-object v13, v1, Ll/֫ۜۘ;->۬:Ll/ܺ᩻ۘ;

    .line 238
    iput v6, v13, Ll/ܺ᩻ۘ;->ܽ:I

    .line 1632
    iget-object v13, v13, Ll/ܺ᩻ۘ;->֫:[B

    invoke-direct {v1, v6, v10, v13}, Ll/֫ۜۘ;->֫(II[B)I

    add-int/lit8 v12, v12, -0x4

    .line 1634
    iget-object v13, v1, Ll/֫ۜۘ;->۬:Ll/ܺ᩻ۘ;

    invoke-virtual {v13}, Ll/ܺ᩻ۘ;->ܽ()I

    move-result v13

    .line 1639
    iget-object v14, v1, Ll/֫ۜۘ;->۬:Ll/ܺ᩻ۘ;

    invoke-virtual {v14}, Ll/ܺ᩻ۘ;->ۡ()V

    :goto_4
    if-lez v13, :cond_6

    if-lez v12, :cond_d

    .line 1642
    iget-object v4, v1, Ll/֫ۜۘ;->۬:Ll/ܺ᩻ۘ;

    .line 230
    iget v10, v4, Ll/ܺ᩻ۘ;->ܽ:I

    if-nez v10, :cond_b

    goto :goto_5

    .line 232
    :cond_b
    iget-object v11, v4, Ll/ܺ᩻ۘ;->֫:[B

    iget v14, v4, Ll/ܺ᩻ۘ;->ۧ:I

    sub-int/2addr v14, v10

    invoke-static {v11, v10, v11, v6, v14}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 233
    iget v10, v4, Ll/ܺ᩻ۘ;->ۧ:I

    iget v11, v4, Ll/ܺ᩻ۘ;->ܽ:I

    sub-int/2addr v10, v11

    iput v10, v4, Ll/ܺ᩻ۘ;->ۧ:I

    .line 234
    iput v6, v4, Ll/ܺ᩻ۘ;->ܽ:I

    .line 1643
    :goto_5
    iget-object v4, v1, Ll/֫ۜۘ;->۬:Ll/ܺ᩻ۘ;

    iget-object v10, v4, Ll/ܺ᩻ۘ;->֫:[B

    array-length v11, v10

    iget v4, v4, Ll/ܺ᩻ۘ;->ۧ:I

    add-int v14, v4, v12

    if-le v11, v14, :cond_c

    move v11, v12

    goto :goto_6

    .line 1644
    :cond_c
    array-length v11, v10

    sub-int/2addr v11, v4

    .line 1645
    :goto_6
    invoke-direct {v1, v4, v11, v10}, Ll/֫ۜۘ;->֫(II[B)I

    move-result v4

    .line 1646
    iget-object v10, v1, Ll/֫ۜۘ;->۬:Ll/ܺ᩻ۘ;

    iget v11, v10, Ll/ܺ᩻ۘ;->ۧ:I

    add-int/2addr v11, v4

    iput v11, v10, Ll/ܺ᩻ۘ;->ۧ:I

    sub-int/2addr v12, v4

    .line 1649
    :cond_d
    iget-object v4, v1, Ll/֫ۜۘ;->۬:Ll/ܺ᩻ۘ;

    invoke-virtual {v4}, Ll/ܺ᩻ۘ;->᩷()[B

    move-result-object v4

    .line 1651
    iget v10, v1, Ll/֫ۜۘ;->ܳ֫:I

    const/4 v11, 0x3

    if-gt v10, v11, :cond_e

    .line 1652
    iget-object v10, v1, Ll/֫ۜۘ;->۬:Ll/ܺ᩻ۘ;

    invoke-virtual {v10}, Ll/ܺ᩻ۘ;->᩷()[B

    move-result-object v10

    goto :goto_7

    :cond_e
    move-object v10, v9

    .line 1654
    :goto_7
    iget-object v11, v1, Ll/֫ۜۘ;->۬:Ll/ܺ᩻ۘ;

    invoke-static {v11}, Ll/֫ۡۘ;->ۧ(Ll/ܺ᩻ۘ;)Ll/֫ۡۘ;

    move-result-object v11

    if-nez v2, :cond_f

    const/4 v14, 0x1

    goto :goto_9

    :cond_f
    if-nez v8, :cond_10

    .line 1666
    invoke-static {v2, v4}, Ll/᩵ۡۘ;->֫([B[B)Z

    move-result v14

    goto :goto_9

    .line 1669
    :cond_10
    iget-boolean v14, v1, Ll/֫ۜۘ;->᩺:Z

    if-nez v14, :cond_11

    .line 1670
    iget-object v14, v1, Ll/֫ۜۘ;->ۨ:Ljava/nio/charset/Charset;

    .line 401
    array-length v15, v4

    .line 405
    new-instance v9, Ljava/lang/String;

    invoke-direct {v9, v4, v6, v15, v14}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 1671
    sget-object v14, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 393
    invoke-virtual {v9, v14}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v14

    goto :goto_8

    :cond_11
    move-object v14, v4

    const/4 v9, 0x0

    .line 1673
    :goto_8
    invoke-static {v2, v14}, Ll/᩵ۡۘ;->ܽ([B[B)Z

    move-result v14

    :goto_9
    if-eqz v14, :cond_14

    if-nez v9, :cond_12

    .line 1678
    iget-object v9, v1, Ll/֫ۜۘ;->ۨ:Ljava/nio/charset/Charset;

    .line 401
    array-length v14, v4

    .line 405
    new-instance v15, Ljava/lang/String;

    invoke-direct {v15, v4, v6, v14, v9}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    move-object v9, v15

    :cond_12
    if-nez v10, :cond_13

    .line 1684
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v11}, Ll/֫ۡۘ;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v4, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v10, " "

    invoke-virtual {v4, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    goto :goto_a

    .line 1686
    :cond_13
    iget-object v4, v1, Ll/֫ۜۘ;->ۨ:Ljava/nio/charset/Charset;

    .line 401
    array-length v14, v10

    .line 405
    new-instance v15, Ljava/lang/String;

    invoke-direct {v15, v10, v6, v14, v4}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    move-object v4, v15

    .line 1689
    :goto_a
    new-instance v10, Ll/ۨ᩻ۘ;

    invoke-direct {v10, v9, v4, v11}, Ll/ۨ᩻ۘ;-><init>(Ljava/lang/String;Ljava/lang/String;Ll/֫ۡۘ;)V

    .line 1532
    invoke-virtual {v0, v10}, Ljava/util/Vector;->addElement(Ljava/lang/Object;)V

    :cond_14
    add-int/lit8 v13, v13, -0x1

    const/4 v4, 0x1

    const/4 v10, 0x4

    const/16 v11, 0x65

    const/4 v9, 0x0

    goto/16 :goto_4

    .line 1606
    :cond_15
    iget-object v0, v1, Ll/֫ۜۘ;->۬:Ll/ܺ᩻ۘ;

    invoke-virtual {v0}, Ll/ܺ᩻ۘ;->ܽ()I

    move-result v0

    .line 1607
    iget-object v2, v1, Ll/֫ۜۘ;->۬:Ll/ܺ᩻ۘ;

    invoke-direct {v1, v2, v0}, Ll/֫ۜۘ;->ۧ(Ll/ܺ᩻ۘ;I)V

    const/4 v0, 0x0

    throw v0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    move-exception v0

    .line 1704
    instance-of v2, v0, Ll/ܽۡۘ;

    if-eqz v2, :cond_16

    .line 1705
    check-cast v0, Ll/ܽۡۘ;

    throw v0

    .line 1706
    :cond_16
    new-instance v2, Ll/ܽۡۘ;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3, v0}, Ll/ܽۡۘ;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    throw v2
.end method

.method public final ֫(Ljava/lang/String;Ljava/lang/String;)V
    .locals 6

    .line 1856
    iget v0, p0, Ll/֫ۜۘ;->ܳ֫:I

    const/4 v1, 0x2

    if-lt v0, v1, :cond_6

    .line 1862
    :try_start_0
    iget-object v0, p0, Ll/֫ۜۘ;->۟:Ljava/io/InputStream;

    check-cast v0, Ll/ۖ᩻ۘ;

    invoke-virtual {v0}, Ll/ۖ᩻ۘ;->֫()V

    .line 1864
    invoke-direct {p0, p1}, Ll/֫ۜۘ;->ۢ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 1865
    invoke-direct {p0, p2}, Ll/֫ۜۘ;->ۢ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 1867
    invoke-direct {p0, p1}, Ll/֫ۜۘ;->᩷(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 1869
    invoke-direct {p0, p2}, Ll/֫ۜۘ;->᩻(Ljava/lang/String;)Ljava/util/Vector;

    move-result-object v0

    .line 1870
    invoke-virtual {v0}, Ljava/util/Vector;->size()I

    move-result v2

    const/4 v3, 0x4

    if-ge v2, v1, :cond_4

    const/4 v1, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    if-ne v2, v1, :cond_0

    .line 1875
    invoke-virtual {v0, v5}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    goto :goto_0

    .line 2864
    :cond_0
    invoke-static {p2, v4}, Ll/֫ۜۘ;->֫(Ljava/lang/String;[[B)Z

    move-result v0

    if-nez v0, :cond_3

    .line 1879
    invoke-static {p2}, Ll/᩵ۡۘ;->ܽ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 1882
    :goto_0
    iget-object v0, p0, Ll/֫ۜۘ;->ۨ:Ljava/nio/charset/Charset;

    invoke-static {p1, v0}, Ll/᩵ۡۘ;->֫(Ljava/lang/String;Ljava/nio/charset/Charset;)[B

    move-result-object p1

    iget-object v0, p0, Ll/֫ۜۘ;->ۨ:Ljava/nio/charset/Charset;

    invoke-static {p2, v0}, Ll/᩵ۡۘ;->֫(Ljava/lang/String;Ljava/nio/charset/Charset;)[B

    move-result-object p2

    invoke-direct {p0, p1, p2}, Ll/֫ۜۘ;->֫([B[B)V

    .line 1885
    iget-object p1, p0, Ll/֫ۜۘ;->۬:Ll/ܺ᩻ۘ;

    .line 238
    iput v5, p1, Ll/ܺ᩻ۘ;->ܽ:I

    .line 2905
    iget-object p2, p1, Ll/ܺ᩻ۘ;->֫:[B

    const/16 v0, 0x9

    invoke-direct {p0, v5, v0, p2}, Ll/֫ۜۘ;->֫(II[B)I

    .line 2906
    invoke-virtual {p1}, Ll/ܺ᩻ۘ;->ܽ()I

    move-result p2

    add-int/lit8 p2, p2, -0x5

    .line 2907
    invoke-virtual {p1}, Ll/ܺ᩻ۘ;->֫()I

    move-result v0

    and-int/lit16 v0, v0, 0xff

    .line 2908
    invoke-virtual {p1}, Ll/ܺ᩻ۘ;->ܽ()I

    .line 1889
    iget-object p1, p0, Ll/֫ۜۘ;->۬:Ll/ܺ᩻ۘ;

    invoke-direct {p0, p1, p2}, Ll/֫ۜۘ;->֫(Ll/ܺ᩻ۘ;I)V

    const/16 p1, 0x65

    if-ne v0, p1, :cond_2

    .line 1895
    iget-object p1, p0, Ll/֫ۜۘ;->۬:Ll/ܺ᩻ۘ;

    invoke-virtual {p1}, Ll/ܺ᩻ۘ;->ܽ()I

    move-result p1

    if-nez p1, :cond_1

    return-void

    .line 1898
    :cond_1
    iget-object p2, p0, Ll/֫ۜۘ;->۬:Ll/ܺ᩻ۘ;

    invoke-direct {p0, p2, p1}, Ll/֫ۜۘ;->ۧ(Ll/ܺ᩻ۘ;I)V

    throw v4

    .line 1892
    :cond_2
    new-instance p1, Ll/ܽۡۘ;

    const-string p2, ""

    invoke-direct {p1, v3, p2}, Ll/ܽۡۘ;-><init>(ILjava/lang/String;)V

    throw p1

    .line 1878
    :cond_3
    new-instance p1, Ll/ܽۡۘ;

    invoke-direct {p1, v3, p2}, Ll/ܽۡۘ;-><init>(ILjava/lang/String;)V

    throw p1

    .line 1872
    :cond_4
    new-instance p1, Ll/ܽۡۘ;

    invoke-virtual {v0}, Ljava/util/Vector;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, v3, p2}, Ll/ܽۡۘ;-><init>(ILjava/lang/String;)V

    throw p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception p1

    .line 1900
    instance-of p2, p1, Ll/ܽۡۘ;

    if-eqz p2, :cond_5

    .line 1901
    check-cast p1, Ll/ܽۡۘ;

    throw p1

    .line 1902
    :cond_5
    new-instance p2, Ll/ܽۡۘ;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p2, v0, p1}, Ll/ܽۡۘ;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    throw p2

    .line 1857
    :cond_6
    new-instance p1, Ll/ܽۡۘ;

    const/16 p2, 0x8

    const-string v0, "The remote sshd is too old to support rename operation."

    invoke-direct {p1, p2, v0}, Ll/ܽۡۘ;-><init>(ILjava/lang/String;)V

    throw p1
.end method

.method public final ֫(Ljava/lang/String;Ll/֫ۡۘ;)V
    .locals 2

    .line 2098
    :try_start_0
    iget-object v0, p0, Ll/֫ۜۘ;->۟:Ljava/io/InputStream;

    check-cast v0, Ll/ۖ᩻ۘ;

    invoke-virtual {v0}, Ll/ۖ᩻ۘ;->֫()V

    .line 2100
    invoke-direct {p0, p1}, Ll/֫ۜۘ;->ۢ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 2102
    iget-object v0, p0, Ll/֫ۜۘ;->ۨ:Ljava/nio/charset/Charset;

    invoke-static {p1, v0}, Ll/᩵ۡۘ;->֫(Ljava/lang/String;Ljava/nio/charset/Charset;)[B

    move-result-object p1

    invoke-direct {p0, p1, p2}, Ll/֫ۜۘ;->֫([BLl/֫ۡۘ;)V

    .line 2105
    iget-object p1, p0, Ll/֫ۜۘ;->۬:Ll/ܺ᩻ۘ;

    const/4 p2, 0x0

    .line 238
    iput p2, p1, Ll/ܺ᩻ۘ;->ܽ:I

    .line 2905
    iget-object v0, p1, Ll/ܺ᩻ۘ;->֫:[B

    const/16 v1, 0x9

    invoke-direct {p0, p2, v1, v0}, Ll/֫ۜۘ;->֫(II[B)I

    .line 2906
    invoke-virtual {p1}, Ll/ܺ᩻ۘ;->ܽ()I

    move-result p2

    add-int/lit8 p2, p2, -0x5

    .line 2907
    invoke-virtual {p1}, Ll/ܺ᩻ۘ;->֫()I

    move-result v0

    and-int/lit16 v0, v0, 0xff

    .line 2908
    invoke-virtual {p1}, Ll/ܺ᩻ۘ;->ܽ()I

    .line 2109
    iget-object p1, p0, Ll/֫ۜۘ;->۬:Ll/ܺ᩻ۘ;

    invoke-direct {p0, p1, p2}, Ll/֫ۜۘ;->֫(Ll/ܺ᩻ۘ;I)V

    const/16 p1, 0x65

    if-ne v0, p1, :cond_1

    .line 2115
    iget-object p1, p0, Ll/֫ۜۘ;->۬:Ll/ܺ᩻ۘ;

    invoke-virtual {p1}, Ll/ܺ᩻ۘ;->ܽ()I

    move-result p1

    if-nez p1, :cond_0

    return-void

    .line 2118
    :cond_0
    iget-object p2, p0, Ll/֫ۜۘ;->۬:Ll/ܺ᩻ۘ;

    invoke-direct {p0, p2, p1}, Ll/֫ۜۘ;->ۧ(Ll/ܺ᩻ۘ;I)V

    const/4 p1, 0x0

    throw p1

    .line 2112
    :cond_1
    new-instance p1, Ll/ܽۡۘ;

    const-string p2, ""

    const/4 v0, 0x4

    invoke-direct {p1, v0, p2}, Ll/ܽۡۘ;-><init>(ILjava/lang/String;)V

    throw p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception p1

    .line 2120
    instance-of p2, p1, Ll/ܽۡۘ;

    if-eqz p2, :cond_2

    .line 2121
    check-cast p1, Ll/ܽۡۘ;

    throw p1

    .line 2122
    :cond_2
    new-instance p2, Ll/ܽۡۘ;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p2, v0, p1}, Ll/ܽۡۘ;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    throw p2
.end method

.method public final ֫(Ljava/nio/charset/Charset;)V
    .locals 1

    .line 2963
    iput-object p1, p0, Ll/֫ۜۘ;->ۨ:Ljava/nio/charset/Charset;

    .line 2964
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {p1, v0}, Ljava/nio/charset/Charset;->equals(Ljava/lang/Object;)Z

    move-result p1

    iput-boolean p1, p0, Ll/֫ۜۘ;->᩺:Z

    return-void
.end method

.method public final ֫(Z)V
    .locals 0

    .line 193
    iput-boolean p1, p0, Ll/֫ۜۘ;->ۜ֫:Z

    return-void
.end method

.method public final ۜ()V
    .locals 0

    return-void
.end method

.method public final ۧ(Ljava/lang/String;)Ljava/io/OutputStream;
    .locals 4

    .line 690
    :try_start_0
    iget-object v0, p0, Ll/֫ۜۘ;->۟:Ljava/io/InputStream;

    check-cast v0, Ll/ۖ᩻ۘ;

    invoke-virtual {v0}, Ll/ۖ᩻ۘ;->֫()V

    .line 692
    invoke-direct {p0, p1}, Ll/֫ۜۘ;->ۢ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 693
    invoke-direct {p0, p1}, Ll/֫ۜۘ;->᩷(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 695
    invoke-direct {p0, p1}, Ll/֫ۜۘ;->ۜ(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x4

    if-nez v0, :cond_3

    .line 699
    iget-object v0, p0, Ll/֫ۜۘ;->ۨ:Ljava/nio/charset/Charset;

    invoke-static {p1, v0}, Ll/᩵ۡۘ;->֫(Ljava/lang/String;Ljava/nio/charset/Charset;)[B

    move-result-object p1

    const/16 v0, 0x1a

    .line 2526
    invoke-direct {p0, v0, p1}, Ll/֫ۜۘ;->֫(I[B)V

    .line 722
    iget-object p1, p0, Ll/֫ۜۘ;->۬:Ll/ܺ᩻ۘ;

    const/4 v0, 0x0

    .line 238
    iput v0, p1, Ll/ܺ᩻ۘ;->ܽ:I

    .line 2905
    iget-object v2, p1, Ll/ܺ᩻ۘ;->֫:[B

    const/16 v3, 0x9

    invoke-direct {p0, v0, v3, v2}, Ll/֫ۜۘ;->֫(II[B)I

    .line 2906
    invoke-virtual {p1}, Ll/ܺ᩻ۘ;->ܽ()I

    move-result v2

    add-int/lit8 v2, v2, -0x5

    .line 2907
    invoke-virtual {p1}, Ll/ܺ᩻ۘ;->֫()I

    move-result v3

    and-int/lit16 v3, v3, 0xff

    .line 2908
    invoke-virtual {p1}, Ll/ܺ᩻ۘ;->ܽ()I

    .line 726
    iget-object p1, p0, Ll/֫ۜۘ;->۬:Ll/ܺ᩻ۘ;

    invoke-direct {p0, p1, v2}, Ll/֫ۜۘ;->֫(Ll/ܺ᩻ۘ;I)V

    const/16 p1, 0x65

    if-eq v3, p1, :cond_1

    const/16 v2, 0x66

    if-ne v3, v2, :cond_0

    goto :goto_0

    .line 729
    :cond_0
    new-instance p1, Ll/ܽۡۘ;

    const-string v0, ""

    invoke-direct {p1, v1, v0}, Ll/ܽۡۘ;-><init>(ILjava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    if-eq v3, p1, :cond_2

    .line 735
    iget-object p1, p0, Ll/֫ۜۘ;->۬:Ll/ܺ᩻ۘ;

    invoke-virtual {p1}, Ll/ܺ᩻ۘ;->᩷()[B

    move-result-object p1

    const/4 v1, 0x1

    new-array v1, v1, [J

    const-wide/16 v2, 0x0

    aput-wide v2, v1, v0

    .line 743
    new-instance v0, Ll/۫᩻ۘ;

    invoke-direct {v0, p0, p1, v1}, Ll/۫᩻ۘ;-><init>(Ll/֫ۜۘ;[B[J)V

    return-object v0

    .line 732
    :cond_2
    iget-object p1, p0, Ll/֫ۜۘ;->۬:Ll/ܺ᩻ۘ;

    invoke-virtual {p1}, Ll/ܺ᩻ۘ;->ܽ()I

    move-result p1

    .line 733
    iget-object v0, p0, Ll/֫ۜۘ;->۬:Ll/ܺ᩻ۘ;

    invoke-direct {p0, v0, p1}, Ll/֫ۜۘ;->ۧ(Ll/ܺ᩻ۘ;I)V

    const/4 p1, 0x0

    throw p1

    .line 696
    :cond_3
    new-instance v0, Ll/ܽۡۘ;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " is a directory"

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Ll/ܽۡۘ;-><init>(ILjava/lang/String;)V

    throw v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception p1

    .line 855
    instance-of v0, p1, Ll/ܽۡۘ;

    if-eqz v0, :cond_4

    .line 856
    check-cast p1, Ll/ܽۡۘ;

    throw p1

    .line 857
    :cond_4
    new-instance v0, Ll/ܽۡۘ;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Ll/ܽۡۘ;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    throw v0
.end method

.method public final ۧ(Ljava/lang/String;Ll/֫ۡۘ;)V
    .locals 3

    .line 2316
    :try_start_0
    iget-object v0, p0, Ll/֫ۜۘ;->۟:Ljava/io/InputStream;

    check-cast v0, Ll/ۖ᩻ۘ;

    invoke-virtual {v0}, Ll/ۖ᩻ۘ;->֫()V

    .line 2318
    invoke-direct {p0, p1}, Ll/֫ۜۘ;->ۢ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 2320
    invoke-direct {p0, p1}, Ll/֫ۜۘ;->᩻(Ljava/lang/String;)Ljava/util/Vector;

    move-result-object p1

    .line 2321
    invoke-virtual {p1}, Ljava/util/Vector;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    .line 2323
    invoke-virtual {p1, v1}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 2324
    invoke-direct {p0, v2, p2}, Ll/֫ۜۘ;->ܽ(Ljava/lang/String;Ll/֫ۡۘ;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void

    :catch_0
    move-exception p1

    .line 2327
    instance-of p2, p1, Ll/ܽۡۘ;

    if-eqz p2, :cond_1

    .line 2328
    check-cast p1, Ll/ܽۡۘ;

    throw p1

    .line 2329
    :cond_1
    new-instance p2, Ll/ܽۡۘ;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p2, v0, p1}, Ll/ܽۡۘ;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    throw p2
.end method

.method public final ܳ(Ljava/lang/String;)Ll/֫ۡۘ;
    .locals 2

    .line 2140
    :try_start_0
    iget-object v0, p0, Ll/֫ۜۘ;->۟:Ljava/io/InputStream;

    check-cast v0, Ll/ۖ᩻ۘ;

    invoke-virtual {v0}, Ll/ۖ᩻ۘ;->֫()V

    .line 2142
    invoke-direct {p0, p1}, Ll/֫ۜۘ;->ۢ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 2143
    invoke-direct {p0, p1}, Ll/֫ۜۘ;->᩷(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 2184
    iget-object v0, p0, Ll/֫ۜۘ;->ۨ:Ljava/nio/charset/Charset;

    invoke-static {p1, v0}, Ll/᩵ۡۘ;->֫(Ljava/lang/String;Ljava/nio/charset/Charset;)[B

    move-result-object p1

    invoke-direct {p0, p1}, Ll/֫ۜۘ;->֫([B)Ll/֫ۡۘ;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    .line 2147
    instance-of v0, p1, Ll/ܽۡۘ;

    if-eqz v0, :cond_0

    .line 2148
    check-cast p1, Ll/ܽۡۘ;

    throw p1

    .line 2149
    :cond_0
    new-instance v0, Ll/ܽۡۘ;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Ll/ܽۡۘ;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    throw v0
.end method

.method public final ܽ(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 1712
    :try_start_0
    iget v0, p0, Ll/֫ۜۘ;->ܳ֫:I

    const/4 v1, 0x3

    if-lt v0, v1, :cond_5

    .line 1717
    iget-object v0, p0, Ll/֫ۜۘ;->۟:Ljava/io/InputStream;

    check-cast v0, Ll/ۖ᩻ۘ;

    invoke-virtual {v0}, Ll/ۖ᩻ۘ;->֫()V

    .line 1719
    invoke-direct {p0, p1}, Ll/֫ۜۘ;->ۢ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 1721
    invoke-direct {p0, p1}, Ll/֫ۜۘ;->᩷(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 1723
    iget-object v0, p0, Ll/֫ۜۘ;->ۨ:Ljava/nio/charset/Charset;

    invoke-static {p1, v0}, Ll/᩵ۡۘ;->֫(Ljava/lang/String;Ljava/nio/charset/Charset;)[B

    move-result-object p1

    const/16 v0, 0x13

    .line 2501
    invoke-direct {p0, p1, v0}, Ll/֫ۜۘ;->֫([BB)V

    .line 1726
    iget-object p1, p0, Ll/֫ۜۘ;->۬:Ll/ܺ᩻ۘ;

    const/4 v0, 0x0

    .line 238
    iput v0, p1, Ll/ܺ᩻ۘ;->ܽ:I

    .line 2905
    iget-object v2, p1, Ll/ܺ᩻ۘ;->֫:[B

    const/16 v3, 0x9

    invoke-direct {p0, v0, v3, v2}, Ll/֫ۜۘ;->֫(II[B)I

    .line 2906
    invoke-virtual {p1}, Ll/ܺ᩻ۘ;->ܽ()I

    move-result v2

    add-int/lit8 v2, v2, -0x5

    .line 2907
    invoke-virtual {p1}, Ll/ܺ᩻ۘ;->֫()I

    move-result v3

    and-int/lit16 v3, v3, 0xff

    .line 2908
    invoke-virtual {p1}, Ll/ܺ᩻ۘ;->ܽ()I

    .line 1730
    iget-object p1, p0, Ll/֫ۜۘ;->۬:Ll/ܺ᩻ۘ;

    invoke-direct {p0, p1, v2}, Ll/֫ۜۘ;->֫(Ll/ܺ᩻ۘ;I)V

    const/16 p1, 0x65

    const/16 v2, 0x68

    if-eq v3, p1, :cond_1

    if-ne v3, v2, :cond_0

    goto :goto_0

    .line 1733
    :cond_0
    new-instance p1, Ll/ܽۡۘ;

    const-string v0, ""

    const/4 v1, 0x4

    invoke-direct {p1, v1, v0}, Ll/ܽۡۘ;-><init>(ILjava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    if-ne v3, v2, :cond_4

    .line 1736
    iget-object v2, p0, Ll/֫ۜۘ;->۬:Ll/ܺ᩻ۘ;

    invoke-virtual {v2}, Ll/ܺ᩻ۘ;->ܽ()I

    move-result v2

    const/4 v3, 0x0

    :goto_1
    if-ge v3, v2, :cond_3

    .line 1739
    iget-object p1, p0, Ll/֫ۜۘ;->۬:Ll/ܺ᩻ۘ;

    invoke-virtual {p1}, Ll/ܺ᩻ۘ;->᩷()[B

    move-result-object p1

    .line 1740
    iget v4, p0, Ll/֫ۜۘ;->ܳ֫:I

    if-gt v4, v1, :cond_2

    .line 1741
    iget-object v4, p0, Ll/֫ۜۘ;->۬:Ll/ܺ᩻ۘ;

    invoke-virtual {v4}, Ll/ܺ᩻ۘ;->᩷()[B

    .line 1743
    :cond_2
    iget-object v4, p0, Ll/֫ۜۘ;->۬:Ll/ܺ᩻ۘ;

    invoke-static {v4}, Ll/֫ۡۘ;->ۧ(Ll/ܺ᩻ۘ;)Ll/֫ۡۘ;

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 1745
    :cond_3
    iget-object v1, p0, Ll/֫ۜۘ;->ۨ:Ljava/nio/charset/Charset;

    .line 401
    array-length v2, p1

    .line 405
    new-instance v3, Ljava/lang/String;

    invoke-direct {v3, p1, v0, v2, v1}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    return-object v3

    .line 1748
    :cond_4
    iget-object v0, p0, Ll/֫ۜۘ;->۬:Ll/ܺ᩻ۘ;

    invoke-virtual {v0}, Ll/ܺ᩻ۘ;->ܽ()I

    move-result v0

    .line 1749
    iget-object v1, p0, Ll/֫ۜۘ;->۬:Ll/ܺ᩻ۘ;

    invoke-direct {p0, v1, v0}, Ll/֫ۜۘ;->ۧ(Ll/ܺ᩻ۘ;I)V

    throw p1

    .line 1713
    :cond_5
    new-instance p1, Ll/ܽۡۘ;

    const-string v0, "The remote sshd is too old to support symlink operation."

    const/16 v1, 0x8

    invoke-direct {p1, v1, v0}, Ll/ܽۡۘ;-><init>(ILjava/lang/String;)V

    throw p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception p1

    .line 1751
    instance-of v0, p1, Ll/ܽۡۘ;

    if-eqz v0, :cond_6

    .line 1752
    check-cast p1, Ll/ܽۡۘ;

    throw p1

    .line 1753
    :cond_6
    new-instance v0, Ll/ܽۡۘ;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Ll/ܽۡۘ;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    throw v0
.end method

.method public final ܿ(Ljava/lang/String;)V
    .locals 6

    .line 2061
    :try_start_0
    iget-object v0, p0, Ll/֫ۜۘ;->۟:Ljava/io/InputStream;

    check-cast v0, Ll/ۖ᩻ۘ;

    invoke-virtual {v0}, Ll/ۖ᩻ۘ;->֫()V

    .line 2063
    invoke-direct {p0, p1}, Ll/֫ۜۘ;->ۢ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 2065
    invoke-direct {p0, p1}, Ll/֫ۜۘ;->᩻(Ljava/lang/String;)Ljava/util/Vector;

    move-result-object p1

    .line 2066
    invoke-virtual {p1}, Ljava/util/Vector;->size()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_2

    .line 2071
    invoke-virtual {p1, v2}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 2072
    iget-object v4, p0, Ll/֫ۜۘ;->ۨ:Ljava/nio/charset/Charset;

    invoke-static {v3, v4}, Ll/᩵ۡۘ;->֫(Ljava/lang/String;Ljava/nio/charset/Charset;)[B

    move-result-object v3

    const/16 v4, 0xf

    .line 2489
    invoke-direct {p0, v3, v4}, Ll/֫ۜۘ;->֫([BB)V

    .line 2074
    iget-object v3, p0, Ll/֫ۜۘ;->۬:Ll/ܺ᩻ۘ;

    .line 238
    iput v1, v3, Ll/ܺ᩻ۘ;->ܽ:I

    .line 2905
    iget-object v4, v3, Ll/ܺ᩻ۘ;->֫:[B

    const/16 v5, 0x9

    invoke-direct {p0, v1, v5, v4}, Ll/֫ۜۘ;->֫(II[B)I

    .line 2906
    invoke-virtual {v3}, Ll/ܺ᩻ۘ;->ܽ()I

    move-result v4

    add-int/lit8 v4, v4, -0x5

    .line 2907
    invoke-virtual {v3}, Ll/ܺ᩻ۘ;->֫()I

    move-result v5

    and-int/lit16 v5, v5, 0xff

    .line 2908
    invoke-virtual {v3}, Ll/ܺ᩻ۘ;->ܽ()I

    .line 2078
    iget-object v3, p0, Ll/֫ۜۘ;->۬:Ll/ܺ᩻ۘ;

    invoke-direct {p0, v3, v4}, Ll/֫ۜۘ;->֫(Ll/ܺ᩻ۘ;I)V

    const/16 v3, 0x65

    if-ne v5, v3, :cond_1

    .line 2084
    iget-object v3, p0, Ll/֫ۜۘ;->۬:Ll/ܺ᩻ۘ;

    invoke-virtual {v3}, Ll/ܺ᩻ۘ;->ܽ()I

    move-result v3

    if-nez v3, :cond_0

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 2086
    :cond_0
    iget-object p1, p0, Ll/֫ۜۘ;->۬:Ll/ܺ᩻ۘ;

    invoke-direct {p0, p1, v3}, Ll/֫ۜۘ;->ۧ(Ll/ܺ᩻ۘ;I)V

    const/4 p1, 0x0

    throw p1

    .line 2081
    :cond_1
    new-instance p1, Ll/ܽۡۘ;

    const-string v0, ""

    const/4 v1, 0x4

    invoke-direct {p1, v1, v0}, Ll/ܽۡۘ;-><init>(ILjava/lang/String;)V

    throw p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_2
    return-void

    :catch_0
    move-exception p1

    .line 2090
    instance-of v0, p1, Ll/ܽۡۘ;

    if-eqz v0, :cond_3

    .line 2091
    check-cast p1, Ll/ܽۡۘ;

    throw p1

    .line 2092
    :cond_3
    new-instance v0, Ll/ܽۡۘ;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Ll/ܽۡۘ;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    throw v0
.end method

.method public final ᩳ(Ljava/lang/String;)V
    .locals 6

    .line 1908
    :try_start_0
    iget-object v0, p0, Ll/֫ۜۘ;->۟:Ljava/io/InputStream;

    check-cast v0, Ll/ۖ᩻ۘ;

    invoke-virtual {v0}, Ll/ۖ᩻ۘ;->֫()V

    .line 1910
    invoke-direct {p0, p1}, Ll/֫ۜۘ;->ۢ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 1912
    invoke-direct {p0, p1}, Ll/֫ۜۘ;->᩻(Ljava/lang/String;)Ljava/util/Vector;

    move-result-object p1

    .line 1913
    invoke-virtual {p1}, Ljava/util/Vector;->size()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_2

    .line 1918
    invoke-virtual {p1, v2}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 1919
    iget-object v4, p0, Ll/֫ۜۘ;->ۨ:Ljava/nio/charset/Charset;

    invoke-static {v3, v4}, Ll/᩵ۡۘ;->֫(Ljava/lang/String;Ljava/nio/charset/Charset;)[B

    move-result-object v3

    const/16 v4, 0xd

    .line 2473
    invoke-direct {p0, v3, v4}, Ll/֫ۜۘ;->֫([BB)V

    .line 1921
    iget-object v3, p0, Ll/֫ۜۘ;->۬:Ll/ܺ᩻ۘ;

    .line 238
    iput v1, v3, Ll/ܺ᩻ۘ;->ܽ:I

    .line 2905
    iget-object v4, v3, Ll/ܺ᩻ۘ;->֫:[B

    const/16 v5, 0x9

    invoke-direct {p0, v1, v5, v4}, Ll/֫ۜۘ;->֫(II[B)I

    .line 2906
    invoke-virtual {v3}, Ll/ܺ᩻ۘ;->ܽ()I

    move-result v4

    add-int/lit8 v4, v4, -0x5

    .line 2907
    invoke-virtual {v3}, Ll/ܺ᩻ۘ;->֫()I

    move-result v5

    and-int/lit16 v5, v5, 0xff

    .line 2908
    invoke-virtual {v3}, Ll/ܺ᩻ۘ;->ܽ()I

    .line 1925
    iget-object v3, p0, Ll/֫ۜۘ;->۬:Ll/ܺ᩻ۘ;

    invoke-direct {p0, v3, v4}, Ll/֫ۜۘ;->֫(Ll/ܺ᩻ۘ;I)V

    const/16 v3, 0x65

    if-ne v5, v3, :cond_1

    .line 1930
    iget-object v3, p0, Ll/֫ۜۘ;->۬:Ll/ܺ᩻ۘ;

    invoke-virtual {v3}, Ll/ܺ᩻ۘ;->ܽ()I

    move-result v3

    if-nez v3, :cond_0

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 1932
    :cond_0
    iget-object p1, p0, Ll/֫ۜۘ;->۬:Ll/ܺ᩻ۘ;

    invoke-direct {p0, p1, v3}, Ll/֫ۜۘ;->ۧ(Ll/ܺ᩻ۘ;I)V

    const/4 p1, 0x0

    throw p1

    .line 1928
    :cond_1
    new-instance p1, Ll/ܽۡۘ;

    const-string v0, ""

    const/4 v1, 0x4

    invoke-direct {p1, v1, v0}, Ll/ܽۡۘ;-><init>(ILjava/lang/String;)V

    throw p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_2
    return-void

    :catch_0
    move-exception p1

    .line 1936
    instance-of v0, p1, Ll/ܽۡۘ;

    if-eqz v0, :cond_3

    .line 1937
    check-cast p1, Ll/ܽۡۘ;

    throw p1

    .line 1938
    :cond_3
    new-instance v0, Ll/ܽۡۘ;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Ll/ܽۡۘ;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    throw v0
.end method

.method public final ᩴ()V
    .locals 13

    const-string v0, "hardlink@openssh.com"

    const-string v1, "statvfs@openssh.com"

    const-string v2, "posix-rename@openssh.com"

    const-string v3, "Received message is too long: "

    .line 214
    :try_start_0
    new-instance v4, Ljava/io/PipedOutputStream;

    invoke-direct {v4}, Ljava/io/PipedOutputStream;-><init>()V

    .line 215
    iget-object v5, p0, Ll/᩵᩻ۘ;->ܳ:Ll/᩵᩷ۘ;

    .line 44
    iput-object v4, v5, Ll/᩵᩷ۘ;->ۧ:Ljava/io/OutputStream;

    .line 216
    new-instance v5, Ll/ۖ᩻ۘ;

    iget-object v6, p0, Ll/֫ۜۘ;->ᩳ֫:Ll/۟᩻ۘ;

    .line 1214
    iget-object v6, v6, Ll/۟᩻ۘ;->ܽ:[Ll/ܰ᩻ۘ;

    array-length v6, v6

    .line 216
    iget v7, p0, Ll/᩵᩻ۘ;->ۘ:I

    mul-int v6, v6, v7

    invoke-direct {v5, v4, v6}, Ll/ۖ᩻ۘ;-><init>(Ljava/io/PipedOutputStream;I)V

    .line 217
    iget-object v4, p0, Ll/᩵᩻ۘ;->ܳ:Ll/᩵᩷ۘ;

    .line 62
    iput-object v5, v4, Ll/᩵᩷ۘ;->֫:Ljava/io/InputStream;

    .line 219
    iput-object v5, p0, Ll/֫ۜۘ;->۟:Ljava/io/InputStream;

    .line 225
    new-instance v4, Ll/۬ۢۘ;

    .line 30
    invoke-direct {v4}, Ll/᩶ۢۘ;-><init>()V

    const/4 v5, 0x1

    .line 31
    invoke-virtual {v4, v5}, Ll/᩶ۢۘ;->֫(Z)V

    .line 226
    invoke-virtual {p0}, Ll/᩵᩻ۘ;->᩻()Ll/۟ۢۘ;

    move-result-object v6

    invoke-virtual {v4, v6, p0}, Ll/۬ۢۘ;->֫(Ll/۟ۢۘ;Ll/᩵᩻ۘ;)V

    .line 233
    new-instance v4, Ll/ܺ᩻ۘ;

    iget v6, p0, Ll/᩵᩻ۘ;->᩻:I

    invoke-direct {v4, v6}, Ll/ܺ᩻ۘ;-><init>(I)V

    iput-object v4, p0, Ll/֫ۜۘ;->۬:Ll/ܺ᩻ۘ;

    .line 234
    new-instance v6, Ll/۠ۢۘ;

    invoke-direct {v6, v4}, Ll/۠ۢۘ;-><init>(Ll/ܺ᩻ۘ;)V

    iput-object v6, p0, Ll/֫ۜۘ;->ܽ֫:Ll/۠ۢۘ;

    .line 236
    new-instance v4, Ll/ܺ᩻ۘ;

    iget v6, p0, Ll/᩵᩻ۘ;->ۘ:I

    invoke-direct {v4, v6}, Ll/ܺ᩻ۘ;-><init>(I)V

    iput-object v4, p0, Ll/֫ۜۘ;->֫֫:Ll/ܺ᩻ۘ;

    .line 237
    new-instance v6, Ll/۠ۢۘ;

    invoke-direct {v6, v4}, Ll/۠ۢۘ;-><init>(Ll/ܺ᩻ۘ;)V

    iput-object v6, p0, Ll/֫ۜۘ;->ۧ֫:Ll/۠ۢۘ;

    .line 2433
    iget-object v4, p0, Ll/֫ۜۘ;->ܽ֫:Ll/۠ۢۘ;

    invoke-virtual {v4}, Ll/۠ۢۘ;->֫()V

    const/4 v4, 0x5

    .line 2434
    invoke-direct {p0, v5, v4}, Ll/֫ۜۘ;->֫(BI)V

    .line 2435
    iget-object v6, p0, Ll/֫ۜۘ;->۬:Ll/ܺ᩻ۘ;

    const/4 v7, 0x3

    invoke-virtual {v6, v7}, Ll/ܺ᩻ۘ;->ۧ(I)V

    .line 2436
    invoke-virtual {p0}, Ll/᩵᩻ۘ;->᩻()Ll/۟ۢۘ;

    move-result-object v6

    iget-object v7, p0, Ll/֫ۜۘ;->ܽ֫:Ll/۠ۢۘ;

    const/16 v8, 0x9

    invoke-virtual {v6, v7, p0, v8}, Ll/۟ۢۘ;->֫(Ll/۠ۢۘ;Ll/᩵᩻ۘ;I)V

    .line 249
    iget-object v6, p0, Ll/֫ۜۘ;->۬:Ll/ܺ᩻ۘ;

    const/4 v7, 0x0

    .line 238
    iput v7, v6, Ll/ܺ᩻ۘ;->ܽ:I

    .line 2905
    iget-object v9, v6, Ll/ܺ᩻ۘ;->֫:[B

    invoke-direct {p0, v7, v8, v9}, Ll/֫ۜۘ;->֫(II[B)I

    .line 2906
    invoke-virtual {v6}, Ll/ܺ᩻ۘ;->ܽ()I

    move-result v8

    sub-int/2addr v8, v4

    .line 2907
    invoke-virtual {v6}, Ll/ܺ᩻ۘ;->֫()I

    .line 2908
    invoke-virtual {v6}, Ll/ܺ᩻ۘ;->ܽ()I

    move-result v4

    const/high16 v6, 0x40000

    const/4 v9, 0x4

    if-gt v8, v6, :cond_4

    .line 255
    iput v4, p0, Ll/֫ۜۘ;->ܳ֫:I

    .line 257
    new-instance v3, Ljava/util/Hashtable;

    invoke-direct {v3}, Ljava/util/Hashtable;-><init>()V

    iput-object v3, p0, Ll/֫ۜۘ;->ۛ:Ljava/util/Hashtable;

    if-lez v8, :cond_0

    .line 260
    iget-object v3, p0, Ll/֫ۜۘ;->۬:Ll/ܺ᩻ۘ;

    invoke-direct {p0, v3, v8}, Ll/֫ۜۘ;->֫(Ll/ܺ᩻ۘ;I)V

    :goto_0
    if-lez v8, :cond_0

    .line 264
    iget-object v3, p0, Ll/֫ۜۘ;->۬:Ll/ܺ᩻ۘ;

    invoke-virtual {v3}, Ll/ܺ᩻ۘ;->᩷()[B

    move-result-object v3

    .line 265
    array-length v4, v3

    add-int/2addr v4, v9

    sub-int/2addr v8, v4

    .line 266
    iget-object v4, p0, Ll/֫ۜۘ;->۬:Ll/ܺ᩻ۘ;

    invoke-virtual {v4}, Ll/ܺ᩻ۘ;->᩷()[B

    move-result-object v4

    .line 267
    array-length v6, v4

    add-int/2addr v6, v9

    sub-int/2addr v8, v6

    .line 268
    iget-object v6, p0, Ll/֫ۜۘ;->ۛ:Ljava/util/Hashtable;

    .line 409
    array-length v10, v3

    sget-object v11, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 405
    new-instance v12, Ljava/lang/String;

    invoke-direct {v12, v3, v7, v10, v11}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 409
    array-length v3, v4

    .line 405
    new-instance v10, Ljava/lang/String;

    invoke-direct {v10, v4, v7, v3, v11}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 268
    invoke-virtual {v6, v12, v10}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 272
    :cond_0
    iget-object v3, p0, Ll/֫ۜۘ;->ۛ:Ljava/util/Hashtable;

    invoke-virtual {v3, v2}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const-string v4, "1"

    if-eqz v3, :cond_1

    :try_start_1
    iget-object v3, p0, Ll/֫ۜۘ;->ۛ:Ljava/util/Hashtable;

    .line 273
    invoke-virtual {v3, v2}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 274
    iput-boolean v5, p0, Ll/֫ۜۘ;->ۤ:Z

    .line 277
    :cond_1
    iget-object v2, p0, Ll/֫ۜۘ;->ۛ:Ljava/util/Hashtable;

    invoke-virtual {v2, v1}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Ll/֫ۜۘ;->ۛ:Ljava/util/Hashtable;

    .line 278
    invoke-virtual {v2, v1}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    const-string v2, "2"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 287
    :cond_2
    iget-object v1, p0, Ll/֫ۜۘ;->ۛ:Ljava/util/Hashtable;

    invoke-virtual {v1, v0}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_3

    iget-object v1, p0, Ll/֫ۜۘ;->ۛ:Ljava/util/Hashtable;

    .line 288
    invoke-virtual {v1, v0}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 292
    :cond_3
    new-instance v0, Ljava/io/File;

    const-string v1, "."

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->getCanonicalPath()Ljava/lang/String;

    return-void

    .line 252
    :cond_4
    new-instance v0, Ll/ܽۡۘ;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v9, v1}, Ll/ܽۡۘ;-><init>(ILjava/lang/String;)V

    throw v0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    move-exception v0

    .line 295
    instance-of v1, v0, Ll/۫᩷ۘ;

    if-eqz v1, :cond_5

    .line 296
    check-cast v0, Ll/۫᩷ۘ;

    throw v0

    .line 297
    :cond_5
    new-instance v1, Ll/۫᩷ۘ;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    .line 43
    invoke-direct {v1, v2, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 297
    throw v1
.end method
