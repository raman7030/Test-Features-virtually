.class public final Ll/᩺ۜۖ;
.super Ll/۟ۜۖ;
.source "J9OT"


# instance fields
.field public ۜ:I

.field public ۡ:I

.field public ۢ:I

.field public ܳ:I

.field public ܺ:I

.field public final ܿ:[B

.field public final ᩷:Ljava/io/InputStream;

.field public ᩻:I


# direct methods
.method public constructor <init>(Ljava/io/InputStream;)V
    .locals 2

    const/4 v0, 0x0

    .line 2028
    invoke-direct {p0, v0}, Ll/۟ۜۖ;-><init>(I)V

    const v1, 0x7fffffff

    .line 2026
    iput v1, p0, Ll/᩺ۜۖ;->ۜ:I

    const-string v1, "input"

    .line 2029
    invoke-static {p1, v1}, Ll/ܰᩴۖ;->֫(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2030
    iput-object p1, p0, Ll/᩺ۜۖ;->᩷:Ljava/io/InputStream;

    const/16 p1, 0x1000

    new-array p1, p1, [B

    .line 2031
    iput-object p1, p0, Ll/᩺ۜۖ;->ܿ:[B

    .line 2032
    iput v0, p0, Ll/᩺ۜۖ;->ܳ:I

    .line 2033
    iput v0, p0, Ll/᩺ۜۖ;->ۡ:I

    .line 2034
    iput v0, p0, Ll/᩺ۜۖ;->ܺ:I

    return-void
.end method

.method private ۜ(I)[B
    .locals 6

    if-nez p1, :cond_0

    .line 2911
    sget-object p1, Ll/ܰᩴۖ;->֫:[B

    return-object p1

    :cond_0
    if-ltz p1, :cond_7

    .line 2918
    iget v0, p0, Ll/᩺ۜۖ;->ܺ:I

    iget v1, p0, Ll/᩺ۜۖ;->ۡ:I

    add-int v2, v0, v1

    add-int/2addr v2, p1

    .line 2919
    iget v3, p0, Ll/۟ۜۖ;->ܽ:I

    sub-int v3, v2, v3

    if-gtz v3, :cond_6

    .line 2924
    iget v3, p0, Ll/᩺ۜۖ;->ۜ:I

    if-gt v2, v3, :cond_5

    .line 2930
    iget v0, p0, Ll/᩺ۜۖ;->ܳ:I

    sub-int/2addr v0, v1

    sub-int v1, p1, v0

    const/16 v2, 0x1000

    .line 2934
    iget-object v3, p0, Ll/᩺ۜۖ;->᩷:Ljava/io/InputStream;

    if-lt v1, v2, :cond_2

    .line 2068
    invoke-virtual {v3}, Ljava/io/InputStream;->available()I

    move-result v2

    if-gt v1, v2, :cond_1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    return-object p1

    .line 2937
    :cond_2
    :goto_0
    new-array v1, p1, [B

    .line 2940
    iget-object v2, p0, Ll/᩺ۜۖ;->ܿ:[B

    iget v4, p0, Ll/᩺ۜۖ;->ۡ:I

    const/4 v5, 0x0

    invoke-static {v2, v4, v1, v5, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 2941
    iget v2, p0, Ll/᩺ۜۖ;->ܺ:I

    iget v4, p0, Ll/᩺ۜۖ;->ܳ:I

    add-int/2addr v2, v4

    iput v2, p0, Ll/᩺ۜۖ;->ܺ:I

    .line 2942
    iput v5, p0, Ll/᩺ۜۖ;->ۡ:I

    .line 2943
    iput v5, p0, Ll/᩺ۜۖ;->ܳ:I

    :goto_1
    if-ge v0, p1, :cond_4

    sub-int v2, p1, v0

    .line 2050
    invoke-virtual {v3, v1, v0, v2}, Ljava/io/InputStream;->read([BII)I

    move-result v2

    const/4 v4, -0x1

    if-eq v2, v4, :cond_3

    .line 2952
    iget v4, p0, Ll/᩺ۜۖ;->ܺ:I

    add-int/2addr v4, v2

    iput v4, p0, Ll/᩺ۜۖ;->ܺ:I

    add-int/2addr v0, v2

    goto :goto_1

    .line 2950
    :cond_3
    invoke-static {}, Ll/֫᩵ۖ;->᩷()Ll/֫᩵ۖ;

    move-result-object p1

    throw p1

    :cond_4
    return-object v1

    :cond_5
    sub-int/2addr v3, v0

    sub-int/2addr v3, v1

    .line 2926
    invoke-virtual {p0, v3}, Ll/᩺ۜۖ;->ܳ(I)V

    .line 2927
    invoke-static {}, Ll/֫᩵ۖ;->᩷()Ll/֫᩵ۖ;

    move-result-object p1

    throw p1

    .line 139
    :cond_6
    new-instance p1, Ll/֫᩵ۖ;

    const-string v0, "Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit."

    .line 24
    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 2920
    throw p1

    .line 2914
    :cond_7
    invoke-static {}, Ll/֫᩵ۖ;->᩻()Ll/֫᩵ۖ;

    move-result-object p1

    throw p1
.end method

.method private ۡ(I)Z
    .locals 6

    .line 2777
    iget v0, p0, Ll/᩺ۜۖ;->ۡ:I

    add-int v1, v0, p1

    iget v2, p0, Ll/᩺ۜۖ;->ܳ:I

    if-le v1, v2, :cond_7

    .line 2785
    iget v1, p0, Ll/᩺ۜۖ;->ܺ:I

    iget v3, p0, Ll/۟ۜۖ;->ܽ:I

    sub-int v4, v3, v1

    sub-int/2addr v4, v0

    const/4 v5, 0x0

    if-le p1, v4, :cond_0

    goto :goto_0

    :cond_0
    add-int/2addr v1, v0

    add-int/2addr v1, p1

    .line 2790
    iget v4, p0, Ll/᩺ۜۖ;->ۜ:I

    if-le v1, v4, :cond_1

    goto :goto_0

    .line 2800
    :cond_1
    iget-object v1, p0, Ll/᩺ۜۖ;->ܿ:[B

    if-lez v0, :cond_3

    if-le v2, v0, :cond_2

    sub-int/2addr v2, v0

    .line 2802
    invoke-static {v1, v0, v1, v5, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 2804
    :cond_2
    iget v2, p0, Ll/᩺ۜۖ;->ܺ:I

    add-int/2addr v2, v0

    iput v2, p0, Ll/᩺ۜۖ;->ܺ:I

    .line 2805
    iget v2, p0, Ll/᩺ۜۖ;->ܳ:I

    sub-int/2addr v2, v0

    iput v2, p0, Ll/᩺ۜۖ;->ܳ:I

    .line 2806
    iput v5, p0, Ll/᩺ۜۖ;->ۡ:I

    .line 2810
    :cond_3
    iget v0, p0, Ll/᩺ۜۖ;->ܳ:I

    array-length v2, v1

    sub-int/2addr v2, v0

    iget v4, p0, Ll/᩺ۜۖ;->ܺ:I

    sub-int/2addr v3, v4

    sub-int/2addr v3, v0

    .line 2815
    invoke-static {v2, v3}, Ljava/lang/Math;->min(II)I

    move-result v2

    .line 2050
    iget-object v3, p0, Ll/᩺ۜۖ;->᩷:Ljava/io/InputStream;

    invoke-virtual {v3, v1, v0, v2}, Ljava/io/InputStream;->read([BII)I

    move-result v0

    if-eqz v0, :cond_6

    const/4 v2, -0x1

    if-lt v0, v2, :cond_6

    .line 2820
    array-length v1, v1

    if-gt v0, v1, :cond_6

    if-lez v0, :cond_5

    .line 2828
    iget v1, p0, Ll/᩺ۜۖ;->ܳ:I

    add-int/2addr v1, v0

    iput v1, p0, Ll/᩺ۜۖ;->ܳ:I

    .line 2829
    invoke-direct {p0}, Ll/᩺ۜۖ;->۫()V

    .line 2830
    iget v0, p0, Ll/᩺ۜۖ;->ܳ:I

    if-lt v0, p1, :cond_4

    const/4 p1, 0x1

    return p1

    :cond_4
    invoke-direct {p0, p1}, Ll/᩺ۜۖ;->ۡ(I)Z

    move-result p1

    return p1

    :cond_5
    :goto_0
    return v5

    .line 2821
    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 2822
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, "#read(byte[]) returned invalid result: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, "\nThe InputStream implementation is buggy."

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 2778
    :cond_7
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "refillBuffer() called when "

    const-string v2, " bytes were already available in buffer"

    .line 0
    invoke-static {p1, v1, v2}, Ll/ᩳ᩷ᩳ;->֫(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 2778
    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private ۢ(I)V
    .locals 2

    .line 2757
    invoke-direct {p0, p1}, Ll/᩺ۜۖ;->ۡ(I)Z

    move-result v0

    if-nez v0, :cond_1

    .line 2760
    iget v0, p0, Ll/۟ۜۖ;->ܽ:I

    iget v1, p0, Ll/᩺ۜۖ;->ܺ:I

    sub-int/2addr v0, v1

    iget v1, p0, Ll/᩺ۜۖ;->ۡ:I

    sub-int/2addr v0, v1

    if-le p1, v0, :cond_0

    .line 139
    new-instance p1, Ll/֫᩵ۖ;

    const-string v0, "Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit."

    .line 24
    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 2761
    throw p1

    .line 2763
    :cond_0
    invoke-static {}, Ll/֫᩵ۖ;->᩷()Ll/֫᩵ۖ;

    move-result-object p1

    throw p1

    :cond_1
    return-void
.end method

.method private ۫()V
    .locals 3

    .line 2705
    iget v0, p0, Ll/᩺ۜۖ;->ܳ:I

    iget v1, p0, Ll/᩺ۜۖ;->᩻:I

    add-int/2addr v0, v1

    iput v0, p0, Ll/᩺ۜۖ;->ܳ:I

    .line 2706
    iget v1, p0, Ll/᩺ۜۖ;->ܺ:I

    add-int/2addr v1, v0

    .line 2707
    iget v2, p0, Ll/᩺ۜۖ;->ۜ:I

    if-le v1, v2, :cond_0

    sub-int/2addr v1, v2

    .line 2709
    iput v1, p0, Ll/᩺ۜۖ;->᩻:I

    sub-int/2addr v0, v1

    .line 2710
    iput v0, p0, Ll/᩺ۜۖ;->ܳ:I

    return-void

    :cond_0
    const/4 v0, 0x0

    .line 2712
    iput v0, p0, Ll/᩺ۜۖ;->᩻:I

    return-void
.end method

.method private ᩷(I)Ljava/util/ArrayList;
    .locals 6

    .line 2975
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    :goto_0
    if-lez p1, :cond_2

    const/16 v1, 0x1000

    .line 2979
    invoke-static {p1, v1}, Ljava/lang/Math;->min(II)I

    move-result v1

    new-array v2, v1, [B

    const/4 v3, 0x0

    :goto_1
    if-ge v3, v1, :cond_1

    .line 2982
    iget-object v4, p0, Ll/᩺ۜۖ;->᩷:Ljava/io/InputStream;

    sub-int v5, v1, v3

    invoke-virtual {v4, v2, v3, v5}, Ljava/io/InputStream;->read([BII)I

    move-result v4

    const/4 v5, -0x1

    if-eq v4, v5, :cond_0

    .line 2986
    iget v5, p0, Ll/᩺ۜۖ;->ܺ:I

    add-int/2addr v5, v4

    iput v5, p0, Ll/᩺ۜۖ;->ܺ:I

    add-int/2addr v3, v4

    goto :goto_1

    .line 2984
    :cond_0
    invoke-static {}, Ll/֫᩵ۖ;->᩷()Ll/֫᩵ۖ;

    move-result-object p1

    throw p1

    :cond_1
    sub-int/2addr p1, v1

    .line 2990
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    return-object v0
.end method

.method private ᩻(I)[B
    .locals 5

    .line 2866
    invoke-direct {p0, p1}, Ll/᩺ۜۖ;->ۜ(I)[B

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    .line 2871
    :cond_0
    iget v0, p0, Ll/᩺ۜۖ;->ۡ:I

    .line 2872
    iget v1, p0, Ll/᩺ۜۖ;->ܳ:I

    sub-int v2, v1, v0

    .line 2875
    iget v3, p0, Ll/᩺ۜۖ;->ܺ:I

    add-int/2addr v3, v1

    iput v3, p0, Ll/᩺ۜۖ;->ܺ:I

    const/4 v1, 0x0

    .line 2876
    iput v1, p0, Ll/᩺ۜۖ;->ۡ:I

    .line 2877
    iput v1, p0, Ll/᩺ۜۖ;->ܳ:I

    sub-int v3, p1, v2

    .line 2884
    invoke-direct {p0, v3}, Ll/᩺ۜۖ;->᩷(I)Ljava/util/ArrayList;

    move-result-object v3

    .line 2887
    new-array p1, p1, [B

    .line 2890
    iget-object v4, p0, Ll/᩺ۜۖ;->ܿ:[B

    invoke-static {v4, v0, p1, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 2894
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, [B

    .line 2895
    array-length v4, v3

    invoke-static {v3, v1, p1, v2, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 2896
    array-length v3, v3

    add-int/2addr v2, v3

    goto :goto_0

    :cond_1
    return-object p1
.end method


# virtual methods
.method public final ֡()I
    .locals 1

    .line 2472
    invoke-virtual {p0}, Ll/᩺ۜۖ;->ۘ()I

    move-result v0

    invoke-static {v0}, Ll/۟ۜۖ;->ܿ(I)I

    move-result v0

    return v0
.end method

.method public final ֨()Ljava/lang/String;
    .locals 5

    .line 2270
    invoke-virtual {p0}, Ll/᩺ۜۖ;->ۘ()I

    move-result v0

    .line 2271
    iget-object v1, p0, Ll/᩺ۜۖ;->ܿ:[B

    if-lez v0, :cond_0

    iget v2, p0, Ll/᩺ۜۖ;->ܳ:I

    iget v3, p0, Ll/᩺ۜۖ;->ۡ:I

    sub-int/2addr v2, v3

    if-gt v0, v2, :cond_0

    .line 2274
    new-instance v2, Ljava/lang/String;

    sget-object v4, Ll/ܰᩴۖ;->ܽ:Ljava/nio/charset/Charset;

    invoke-direct {v2, v1, v3, v0, v4}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 2275
    iget v1, p0, Ll/᩺ۜۖ;->ۡ:I

    add-int/2addr v1, v0

    iput v1, p0, Ll/᩺ۜۖ;->ۡ:I

    return-object v2

    :cond_0
    if-nez v0, :cond_1

    const-string v0, ""

    return-object v0

    :cond_1
    if-ltz v0, :cond_3

    .line 2284
    iget v2, p0, Ll/᩺ۜۖ;->ܳ:I

    if-gt v0, v2, :cond_2

    .line 2285
    invoke-direct {p0, v0}, Ll/᩺ۜۖ;->ۢ(I)V

    .line 2286
    new-instance v2, Ljava/lang/String;

    iget v3, p0, Ll/᩺ۜۖ;->ۡ:I

    sget-object v4, Ll/ܰᩴۖ;->ܽ:Ljava/nio/charset/Charset;

    invoke-direct {v2, v1, v3, v0, v4}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 2287
    iget v1, p0, Ll/᩺ۜۖ;->ۡ:I

    add-int/2addr v1, v0

    iput v1, p0, Ll/᩺ۜۖ;->ۡ:I

    return-object v2

    .line 2291
    :cond_2
    new-instance v1, Ljava/lang/String;

    invoke-direct {p0, v0}, Ll/᩺ۜۖ;->᩻(I)[B

    move-result-object v0

    sget-object v2, Ll/ܰᩴۖ;->ܽ:Ljava/nio/charset/Charset;

    invoke-direct {v1, v0, v2}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    return-object v1

    .line 2282
    :cond_3
    invoke-static {}, Ll/֫᩵ۖ;->᩻()Ll/֫᩵ۖ;

    move-result-object v0

    throw v0
.end method

.method public final ֫(Ll/۫֡ۖ;Ll/ᩳۘۖ;)Ll/ۡ֡ۖ;
    .locals 2

    .line 2377
    invoke-virtual {p0}, Ll/᩺ۜۖ;->ۘ()I

    move-result v0

    .line 2378
    invoke-virtual {p0}, Ll/۟ۜۖ;->֫()V

    .line 2379
    invoke-virtual {p0, v0}, Ll/᩺ۜۖ;->ܽ(I)I

    move-result v0

    .line 2380
    iget v1, p0, Ll/۟ۜۖ;->֫:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Ll/۟ۜۖ;->֫:I

    .line 2381
    invoke-interface {p1, p0, p2}, Ll/۫֡ۖ;->parsePartialFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۡ֡ۖ;

    const/4 p2, 0x0

    .line 2382
    invoke-virtual {p0, p2}, Ll/᩺ۜۖ;->֫(I)V

    .line 2383
    iget p2, p0, Ll/۟ۜۖ;->֫:I

    add-int/lit8 p2, p2, -0x1

    iput p2, p0, Ll/۟ۜۖ;->֫:I

    .line 2384
    invoke-virtual {p0}, Ll/᩺ۜۖ;->ۧ()I

    move-result p2

    if-nez p2, :cond_0

    .line 2387
    invoke-virtual {p0, v0}, Ll/᩺ۜۖ;->ۧ(I)V

    return-object p1

    .line 2385
    :cond_0
    invoke-static {}, Ll/֫᩵ۖ;->᩷()Ll/֫᩵ۖ;

    move-result-object p1

    throw p1
.end method

.method public final ֫(I)V
    .locals 1

    .line 2093
    iget v0, p0, Ll/᩺ۜۖ;->ۢ:I

    if-ne v0, p1, :cond_0

    return-void

    .line 2094
    :cond_0
    invoke-static {}, Ll/֫᩵ۖ;->ۧ()Ll/֫᩵ۖ;

    move-result-object p1

    throw p1
.end method

.method public final ֫(ILl/ۢ֡ۖ;Ll/ᩳۘۖ;)V
    .locals 1

    .line 2329
    invoke-virtual {p0}, Ll/۟ۜۖ;->֫()V

    .line 2330
    iget v0, p0, Ll/۟ۜۖ;->֫:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Ll/۟ۜۖ;->֫:I

    .line 2331
    invoke-interface {p2, p0, p3}, Ll/ۢ֡ۖ;->mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/ۢ֡ۖ;

    shl-int/lit8 p1, p1, 0x3

    or-int/lit8 p1, p1, 0x4

    .line 2332
    invoke-virtual {p0, p1}, Ll/᩺ۜۖ;->֫(I)V

    .line 2333
    iget p1, p0, Ll/۟ۜۖ;->֫:I

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, Ll/۟ۜۖ;->֫:I

    return-void
.end method

.method public final ֫(Ll/ۢ֡ۖ;Ll/ᩳۘۖ;)V
    .locals 2

    .line 2361
    invoke-virtual {p0}, Ll/᩺ۜۖ;->ۘ()I

    move-result v0

    .line 2362
    invoke-virtual {p0}, Ll/۟ۜۖ;->֫()V

    .line 2363
    invoke-virtual {p0, v0}, Ll/᩺ۜۖ;->ܽ(I)I

    move-result v0

    .line 2364
    iget v1, p0, Ll/۟ۜۖ;->֫:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Ll/۟ۜۖ;->֫:I

    .line 2365
    invoke-interface {p1, p0, p2}, Ll/ۢ֡ۖ;->mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/ۢ֡ۖ;

    const/4 p1, 0x0

    .line 2366
    invoke-virtual {p0, p1}, Ll/᩺ۜۖ;->֫(I)V

    .line 2367
    iget p1, p0, Ll/۟ۜۖ;->֫:I

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, Ll/۟ۜۖ;->֫:I

    .line 2368
    invoke-virtual {p0}, Ll/᩺ۜۖ;->ۧ()I

    move-result p1

    if-nez p1, :cond_0

    .line 2371
    invoke-virtual {p0, v0}, Ll/᩺ۜۖ;->ۧ(I)V

    return-void

    .line 2369
    :cond_0
    invoke-static {}, Ll/֫᩵ۖ;->᩷()Ll/֫᩵ۖ;

    move-result-object p1

    throw p1
.end method

.method public final ۖ()J
    .locals 2

    .line 2245
    invoke-virtual {p0}, Ll/᩺ۜۖ;->ۗ()J

    move-result-wide v0

    return-wide v0
.end method

.method public final ۗ()J
    .locals 12

    .line 2566
    iget v0, p0, Ll/᩺ۜۖ;->ۡ:I

    .line 2568
    iget v1, p0, Ll/᩺ۜۖ;->ܳ:I

    if-ne v1, v0, :cond_0

    goto/16 :goto_3

    :cond_0
    add-int/lit8 v2, v0, 0x1

    .line 2575
    iget-object v3, p0, Ll/᩺ۜۖ;->ܿ:[B

    aget-byte v4, v3, v0

    if-ltz v4, :cond_1

    .line 2576
    iput v2, p0, Ll/᩺ۜۖ;->ۡ:I

    int-to-long v0, v4

    return-wide v0

    :cond_1
    sub-int/2addr v1, v2

    const/16 v5, 0x9

    if-ge v1, v5, :cond_2

    goto/16 :goto_3

    :cond_2
    add-int/lit8 v1, v0, 0x2

    .line 2580
    aget-byte v2, v3, v2

    shl-int/lit8 v2, v2, 0x7

    xor-int/2addr v2, v4

    if-gez v2, :cond_3

    xor-int/lit8 v0, v2, -0x80

    int-to-long v2, v0

    goto/16 :goto_4

    :cond_3
    add-int/lit8 v4, v0, 0x3

    .line 2582
    aget-byte v1, v3, v1

    shl-int/lit8 v1, v1, 0xe

    xor-int/2addr v1, v2

    if-ltz v1, :cond_4

    xor-int/lit16 v0, v1, 0x3f80

    int-to-long v2, v0

    move v1, v4

    goto/16 :goto_4

    :cond_4
    add-int/lit8 v2, v0, 0x4

    .line 2584
    aget-byte v4, v3, v4

    shl-int/lit8 v4, v4, 0x15

    xor-int/2addr v1, v4

    if-gez v1, :cond_5

    const v0, -0x1fc080

    xor-int/2addr v0, v1

    int-to-long v0, v0

    :goto_0
    move-wide v10, v0

    move v1, v2

    move-wide v2, v10

    goto/16 :goto_4

    :cond_5
    int-to-long v4, v1

    add-int/lit8 v1, v0, 0x5

    .line 2586
    aget-byte v2, v3, v2

    int-to-long v6, v2

    const/16 v2, 0x1c

    shl-long/2addr v6, v2

    xor-long/2addr v4, v6

    const-wide/16 v6, 0x0

    cmp-long v2, v4, v6

    if-ltz v2, :cond_6

    const-wide/32 v2, 0xfe03f80

    goto :goto_1

    :cond_6
    add-int/lit8 v2, v0, 0x6

    .line 2588
    aget-byte v1, v3, v1

    int-to-long v8, v1

    const/16 v1, 0x23

    shl-long/2addr v8, v1

    xor-long/2addr v4, v8

    cmp-long v1, v4, v6

    if-gez v1, :cond_7

    const-wide v0, -0x7f01fc080L

    goto :goto_2

    :cond_7
    add-int/lit8 v1, v0, 0x7

    .line 2590
    aget-byte v2, v3, v2

    int-to-long v8, v2

    const/16 v2, 0x2a

    shl-long/2addr v8, v2

    xor-long/2addr v4, v8

    cmp-long v2, v4, v6

    if-ltz v2, :cond_8

    const-wide v2, 0x3f80fe03f80L

    :goto_1
    xor-long/2addr v2, v4

    goto :goto_4

    :cond_8
    add-int/lit8 v2, v0, 0x8

    .line 2592
    aget-byte v1, v3, v1

    int-to-long v8, v1

    const/16 v1, 0x31

    shl-long/2addr v8, v1

    xor-long/2addr v4, v8

    cmp-long v1, v4, v6

    if-gez v1, :cond_9

    const-wide v0, -0x1fc07f01fc080L

    :goto_2
    xor-long/2addr v0, v4

    goto :goto_0

    :cond_9
    add-int/lit8 v1, v0, 0x9

    .line 2602
    aget-byte v2, v3, v2

    int-to-long v8, v2

    const/16 v2, 0x38

    shl-long/2addr v8, v2

    xor-long/2addr v4, v8

    const-wide v8, 0xfe03f80fe03f80L

    xor-long/2addr v4, v8

    cmp-long v2, v4, v6

    if-gez v2, :cond_b

    add-int/lit8 v0, v0, 0xa

    .line 2613
    aget-byte v1, v3, v1

    int-to-long v1, v1

    cmp-long v3, v1, v6

    if-gez v3, :cond_a

    .line 2621
    :goto_3
    invoke-virtual {p0}, Ll/᩺ۜۖ;->۬()J

    move-result-wide v0

    return-wide v0

    :cond_a
    move v1, v0

    :cond_b
    move-wide v2, v4

    .line 2618
    :goto_4
    iput v1, p0, Ll/᩺ۜۖ;->ۡ:I

    return-wide v2
.end method

.method public final ۘ()I
    .locals 7

    .line 2487
    iget v0, p0, Ll/᩺ۜۖ;->ۡ:I

    .line 2489
    iget v1, p0, Ll/᩺ۜۖ;->ܳ:I

    if-ne v1, v0, :cond_0

    goto :goto_2

    :cond_0
    add-int/lit8 v2, v0, 0x1

    .line 2495
    iget-object v3, p0, Ll/᩺ۜۖ;->ܿ:[B

    aget-byte v4, v3, v0

    if-ltz v4, :cond_1

    .line 2496
    iput v2, p0, Ll/᩺ۜۖ;->ۡ:I

    return v4

    :cond_1
    sub-int/2addr v1, v2

    const/16 v5, 0x9

    if-ge v1, v5, :cond_2

    goto :goto_2

    :cond_2
    add-int/lit8 v1, v0, 0x2

    .line 2500
    aget-byte v2, v3, v2

    shl-int/lit8 v2, v2, 0x7

    xor-int/2addr v2, v4

    if-gez v2, :cond_3

    xor-int/lit8 v0, v2, -0x80

    goto :goto_3

    :cond_3
    add-int/lit8 v4, v0, 0x3

    .line 2502
    aget-byte v1, v3, v1

    shl-int/lit8 v1, v1, 0xe

    xor-int/2addr v1, v2

    if-ltz v1, :cond_4

    xor-int/lit16 v0, v1, 0x3f80

    :goto_0
    move v1, v4

    goto :goto_3

    :cond_4
    add-int/lit8 v2, v0, 0x4

    .line 2504
    aget-byte v4, v3, v4

    shl-int/lit8 v4, v4, 0x15

    xor-int/2addr v1, v4

    if-gez v1, :cond_5

    const v0, -0x1fc080

    xor-int/2addr v0, v1

    :goto_1
    move v1, v2

    goto :goto_3

    :cond_5
    add-int/lit8 v4, v0, 0x5

    .line 2507
    aget-byte v2, v3, v2

    shl-int/lit8 v5, v2, 0x1c

    xor-int/2addr v1, v5

    const v5, 0xfe03f80

    xor-int/2addr v1, v5

    if-gez v2, :cond_8

    add-int/lit8 v2, v0, 0x6

    .line 2510
    aget-byte v4, v3, v4

    if-gez v4, :cond_7

    add-int/lit8 v4, v0, 0x7

    aget-byte v2, v3, v2

    if-gez v2, :cond_8

    add-int/lit8 v2, v0, 0x8

    aget-byte v4, v3, v4

    if-gez v4, :cond_7

    add-int/lit8 v4, v0, 0x9

    aget-byte v2, v3, v2

    if-gez v2, :cond_8

    add-int/lit8 v0, v0, 0xa

    aget-byte v2, v3, v4

    if-gez v2, :cond_6

    .line 2522
    :goto_2
    invoke-virtual {p0}, Ll/᩺ۜۖ;->۬()J

    move-result-wide v0

    long-to-int v1, v0

    return v1

    :cond_6
    move v6, v1

    move v1, v0

    move v0, v6

    goto :goto_3

    :cond_7
    move v0, v1

    goto :goto_1

    :cond_8
    move v0, v1

    goto :goto_0

    .line 2519
    :goto_3
    iput v1, p0, Ll/᩺ۜۖ;->ۡ:I

    return v0
.end method

.method public final ۙ()J
    .locals 9

    .line 2656
    iget v0, p0, Ll/᩺ۜۖ;->ۡ:I

    .line 2658
    iget v1, p0, Ll/᩺ۜۖ;->ܳ:I

    sub-int/2addr v1, v0

    const/16 v2, 0x8

    if-ge v1, v2, :cond_0

    .line 2659
    invoke-direct {p0, v2}, Ll/᩺ۜۖ;->ۢ(I)V

    .line 2660
    iget v0, p0, Ll/᩺ۜۖ;->ۡ:I

    :cond_0
    add-int/lit8 v1, v0, 0x8

    .line 2664
    iput v1, p0, Ll/᩺ۜۖ;->ۡ:I

    .line 2665
    iget-object v1, p0, Ll/᩺ۜۖ;->ܿ:[B

    aget-byte v3, v1, v0

    int-to-long v3, v3

    const-wide/16 v5, 0xff

    and-long/2addr v3, v5

    add-int/lit8 v7, v0, 0x1

    aget-byte v7, v1, v7

    int-to-long v7, v7

    and-long/2addr v7, v5

    shl-long/2addr v7, v2

    or-long v2, v3, v7

    add-int/lit8 v4, v0, 0x2

    aget-byte v4, v1, v4

    int-to-long v7, v4

    and-long/2addr v7, v5

    const/16 v4, 0x10

    shl-long/2addr v7, v4

    or-long/2addr v2, v7

    add-int/lit8 v4, v0, 0x3

    aget-byte v4, v1, v4

    int-to-long v7, v4

    and-long/2addr v7, v5

    const/16 v4, 0x18

    shl-long/2addr v7, v4

    or-long/2addr v2, v7

    add-int/lit8 v4, v0, 0x4

    aget-byte v4, v1, v4

    int-to-long v7, v4

    and-long/2addr v7, v5

    const/16 v4, 0x20

    shl-long/2addr v7, v4

    or-long/2addr v2, v7

    add-int/lit8 v4, v0, 0x5

    aget-byte v4, v1, v4

    int-to-long v7, v4

    and-long/2addr v7, v5

    const/16 v4, 0x28

    shl-long/2addr v7, v4

    or-long/2addr v2, v7

    add-int/lit8 v4, v0, 0x6

    aget-byte v4, v1, v4

    int-to-long v7, v4

    and-long/2addr v7, v5

    const/16 v4, 0x30

    shl-long/2addr v7, v4

    or-long/2addr v2, v7

    add-int/lit8 v0, v0, 0x7

    aget-byte v0, v1, v0

    int-to-long v0, v0

    and-long/2addr v0, v5

    const/16 v4, 0x38

    shl-long/2addr v0, v4

    or-long/2addr v0, v2

    return-wide v0
.end method

.method public final ۚ()J
    .locals 2

    .line 2477
    invoke-virtual {p0}, Ll/᩺ۜۖ;->ۗ()J

    move-result-wide v0

    invoke-static {v0, v1}, Ll/۟ۜۖ;->֫(J)J

    move-result-wide v0

    return-wide v0
.end method

.method public final ۜ()I
    .locals 1

    .line 2457
    invoke-virtual {p0}, Ll/᩺ۜۖ;->ۘ()I

    move-result v0

    return v0
.end method

.method public final ۠()Ljava/lang/String;
    .locals 5

    .line 2296
    invoke-virtual {p0}, Ll/᩺ۜۖ;->ۘ()I

    move-result v0

    .line 2298
    iget v1, p0, Ll/᩺ۜۖ;->ۡ:I

    .line 2300
    iget v2, p0, Ll/᩺ۜۖ;->ܳ:I

    sub-int v3, v2, v1

    iget-object v4, p0, Ll/᩺ۜۖ;->ܿ:[B

    if-gt v0, v3, :cond_0

    if-lez v0, :cond_0

    add-int v2, v1, v0

    .line 2304
    iput v2, p0, Ll/᩺ۜۖ;->ۡ:I

    goto :goto_0

    :cond_0
    if-nez v0, :cond_1

    const-string v0, ""

    return-object v0

    :cond_1
    if-ltz v0, :cond_3

    const/4 v1, 0x0

    if-gt v0, v2, :cond_2

    .line 2311
    invoke-direct {p0, v0}, Ll/᩺ۜۖ;->ۢ(I)V

    .line 2314
    iput v0, p0, Ll/᩺ۜۖ;->ۡ:I

    goto :goto_0

    .line 2317
    :cond_2
    invoke-direct {p0, v0}, Ll/᩺ۜۖ;->᩻(I)[B

    move-result-object v4

    .line 2320
    :goto_0
    invoke-static {v1, v0, v4}, Ll/۫֨ۖ;->ۧ(II[B)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 2309
    :cond_3
    invoke-static {}, Ll/֫᩵ۖ;->᩻()Ll/֫᩵ۖ;

    move-result-object v0

    throw v0
.end method

.method public final ۡ()F
    .locals 1

    .line 2235
    invoke-virtual {p0}, Ll/᩺ۜۖ;->᩶()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v0

    return v0
.end method

.method public final ۢ()J
    .locals 2

    .line 2255
    invoke-virtual {p0}, Ll/᩺ۜۖ;->ۙ()J

    move-result-wide v0

    return-wide v0
.end method

.method public final ۧ()I
    .locals 3

    .line 2724
    iget v0, p0, Ll/᩺ۜۖ;->ۜ:I

    const v1, 0x7fffffff

    if-ne v0, v1, :cond_0

    const/4 v0, -0x1

    return v0

    .line 2728
    :cond_0
    iget v1, p0, Ll/᩺ۜۖ;->ܺ:I

    iget v2, p0, Ll/᩺ۜۖ;->ۡ:I

    add-int/2addr v1, v2

    sub-int/2addr v0, v1

    return v0
.end method

.method public final ۧ(I)V
    .locals 0

    .line 2718
    iput p1, p0, Ll/᩺ۜۖ;->ۜ:I

    .line 2719
    invoke-direct {p0}, Ll/᩺ۜۖ;->۫()V

    return-void
.end method

.method public final ۬()J
    .locals 6

    const-wide/16 v0, 0x0

    const/4 v2, 0x0

    :goto_0
    const/16 v3, 0x40

    if-ge v2, v3, :cond_2

    .line 2838
    iget v3, p0, Ll/᩺ۜۖ;->ۡ:I

    iget v4, p0, Ll/᩺ۜۖ;->ܳ:I

    if-ne v3, v4, :cond_0

    const/4 v3, 0x1

    .line 2839
    invoke-direct {p0, v3}, Ll/᩺ۜۖ;->ۢ(I)V

    .line 2841
    :cond_0
    iget v3, p0, Ll/᩺ۜۖ;->ۡ:I

    add-int/lit8 v4, v3, 0x1

    iput v4, p0, Ll/᩺ۜۖ;->ۡ:I

    iget-object v4, p0, Ll/᩺ۜۖ;->ܿ:[B

    aget-byte v3, v4, v3

    and-int/lit8 v4, v3, 0x7f

    int-to-long v4, v4

    shl-long/2addr v4, v2

    or-long/2addr v0, v4

    and-int/lit16 v3, v3, 0x80

    if-nez v3, :cond_1

    return-wide v0

    :cond_1
    add-int/lit8 v2, v2, 0x7

    goto :goto_0

    .line 2634
    :cond_2
    invoke-static {}, Ll/֫᩵ۖ;->ܳ()Ll/֫᩵ۖ;

    move-result-object v0

    throw v0
.end method

.method public final ܳ()Ll/ۛۜۖ;
    .locals 7

    .line 2393
    invoke-virtual {p0}, Ll/᩺ۜۖ;->ۘ()I

    move-result v0

    .line 2394
    iget v1, p0, Ll/᩺ۜۖ;->ܳ:I

    iget v2, p0, Ll/᩺ۜۖ;->ۡ:I

    sub-int/2addr v1, v2

    iget-object v3, p0, Ll/᩺ۜۖ;->ܿ:[B

    if-gt v0, v1, :cond_0

    if-lez v0, :cond_0

    .line 2397
    invoke-static {v2, v0, v3}, Ll/ۛۜۖ;->֫(II[B)Ll/ۛۜۖ;

    move-result-object v1

    .line 2398
    iget v2, p0, Ll/᩺ۜۖ;->ۡ:I

    add-int/2addr v2, v0

    iput v2, p0, Ll/᩺ۜۖ;->ۡ:I

    return-object v1

    :cond_0
    if-nez v0, :cond_1

    .line 2402
    sget-object v0, Ll/ۛۜۖ;->᩹:Ll/ۛۜۖ;

    return-object v0

    :cond_1
    if-ltz v0, :cond_4

    .line 3001
    invoke-direct {p0, v0}, Ll/᩺ۜۖ;->ۜ(I)[B

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    .line 412
    array-length v0, v1

    invoke-static {v2, v0, v1}, Ll/ۛۜۖ;->֫(II[B)Ll/ۛۜۖ;

    move-result-object v0

    return-object v0

    .line 3008
    :cond_2
    iget v1, p0, Ll/᩺ۜۖ;->ۡ:I

    .line 3009
    iget v4, p0, Ll/᩺ۜۖ;->ܳ:I

    sub-int v5, v4, v1

    .line 3012
    iget v6, p0, Ll/᩺ۜۖ;->ܺ:I

    add-int/2addr v6, v4

    iput v6, p0, Ll/᩺ۜۖ;->ܺ:I

    .line 3013
    iput v2, p0, Ll/᩺ۜۖ;->ۡ:I

    .line 3014
    iput v2, p0, Ll/᩺ۜۖ;->ܳ:I

    sub-int v4, v0, v5

    .line 3021
    invoke-direct {p0, v4}, Ll/᩺ۜۖ;->᩷(I)Ljava/util/ArrayList;

    move-result-object v4

    .line 3024
    new-array v0, v0, [B

    .line 3027
    invoke-static {v3, v1, v0, v2, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 3031
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, [B

    .line 3032
    array-length v4, v3

    invoke-static {v3, v2, v0, v5, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 3033
    array-length v3, v3

    add-int/2addr v5, v3

    goto :goto_0

    .line 3036
    :cond_3
    sget-object v1, Ll/ۛۜۖ;->᩹:Ll/ۛۜۖ;

    .line 439
    new-instance v1, Ll/۫ۜۖ;

    invoke-direct {v1, v0}, Ll/۫ۜۖ;-><init>([B)V

    return-object v1

    .line 2405
    :cond_4
    invoke-static {}, Ll/֫᩵ۖ;->᩻()Ll/֫᩵ۖ;

    move-result-object v0

    throw v0
.end method

.method public final ܳ(I)V
    .locals 9

    .line 3041
    iget v0, p0, Ll/᩺ۜۖ;->ܳ:I

    iget v1, p0, Ll/᩺ۜۖ;->ۡ:I

    sub-int v2, v0, v1

    if-gt p1, v2, :cond_0

    if-ltz p1, :cond_0

    add-int/2addr v1, p1

    .line 3043
    iput v1, p0, Ll/᩺ۜۖ;->ۡ:I

    return-void

    .line 3054
    :cond_0
    iget-object v2, p0, Ll/᩺ۜۖ;->᩷:Ljava/io/InputStream;

    if-ltz p1, :cond_7

    .line 3058
    iget v3, p0, Ll/᩺ۜۖ;->ܺ:I

    add-int v4, v3, v1

    add-int v5, v4, p1

    iget v6, p0, Ll/᩺ۜۖ;->ۜ:I

    if-gt v5, v6, :cond_6

    .line 3068
    iput v4, p0, Ll/᩺ۜۖ;->ܺ:I

    sub-int/2addr v0, v1

    const/4 v1, 0x0

    .line 3070
    iput v1, p0, Ll/᩺ۜۖ;->ܳ:I

    .line 3071
    iput v1, p0, Ll/᩺ۜۖ;->ۡ:I

    :goto_0
    if-ge v0, p1, :cond_3

    sub-int v1, p1, v0

    int-to-long v3, v1

    .line 2059
    :try_start_0
    invoke-virtual {v2, v3, v4}, Ljava/io/InputStream;->skip(J)J

    move-result-wide v5

    const-wide/16 v7, 0x0

    cmp-long v1, v5, v7

    if-ltz v1, :cond_2

    cmp-long v7, v5, v3

    if-gtz v7, :cond_2

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    long-to-int v1, v5

    add-int/2addr v0, v1

    goto :goto_0

    .line 3078
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 3079
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, "#skip returned invalid result: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v2, "\nThe InputStream implementation is buggy."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    move-exception p1

    .line 3093
    iget v1, p0, Ll/᩺ۜۖ;->ܺ:I

    add-int/2addr v1, v0

    iput v1, p0, Ll/᩺ۜۖ;->ܺ:I

    .line 3094
    invoke-direct {p0}, Ll/᩺ۜۖ;->۫()V

    .line 3095
    throw p1

    .line 3093
    :cond_3
    :goto_1
    iget v1, p0, Ll/᩺ۜۖ;->ܺ:I

    add-int/2addr v1, v0

    iput v1, p0, Ll/᩺ۜۖ;->ܺ:I

    .line 3094
    invoke-direct {p0}, Ll/᩺ۜۖ;->۫()V

    if-ge v0, p1, :cond_5

    .line 3099
    iget v0, p0, Ll/᩺ۜۖ;->ܳ:I

    iget v1, p0, Ll/᩺ۜۖ;->ۡ:I

    sub-int v1, v0, v1

    .line 3100
    iput v0, p0, Ll/᩺ۜۖ;->ۡ:I

    const/4 v0, 0x1

    .line 3104
    invoke-direct {p0, v0}, Ll/᩺ۜۖ;->ۢ(I)V

    :goto_2
    sub-int v2, p1, v1

    .line 3105
    iget v3, p0, Ll/᩺ۜۖ;->ܳ:I

    if-le v2, v3, :cond_4

    add-int/2addr v1, v3

    .line 3107
    iput v3, p0, Ll/᩺ۜۖ;->ۡ:I

    .line 3108
    invoke-direct {p0, v0}, Ll/᩺ۜۖ;->ۢ(I)V

    goto :goto_2

    .line 3111
    :cond_4
    iput v2, p0, Ll/᩺ۜۖ;->ۡ:I

    :cond_5
    return-void

    :cond_6
    sub-int/2addr v6, v3

    sub-int/2addr v6, v1

    .line 3060
    invoke-virtual {p0, v6}, Ll/᩺ۜۖ;->ܳ(I)V

    .line 3062
    invoke-static {}, Ll/֫᩵ۖ;->᩷()Ll/֫᩵ۖ;

    move-result-object p1

    throw p1

    .line 3055
    :cond_7
    invoke-static {}, Ll/֫᩵ۖ;->᩻()Ll/֫᩵ۖ;

    move-result-object p1

    throw p1
.end method

.method public final ܶ()I
    .locals 2

    .line 2077
    invoke-virtual {p0}, Ll/᩺ۜۖ;->ᩳ()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 2078
    iput v0, p0, Ll/᩺ۜۖ;->ۢ:I

    return v0

    .line 2082
    :cond_0
    invoke-virtual {p0}, Ll/᩺ۜۖ;->ۘ()I

    move-result v0

    iput v0, p0, Ll/᩺ۜۖ;->ۢ:I

    ushr-int/lit8 v1, v0, 0x3

    if-eqz v1, :cond_1

    return v0

    .line 2086
    :cond_1
    invoke-static {}, Ll/֫᩵ۖ;->ܽ()Ll/֫᩵ۖ;

    move-result-object v0

    throw v0
.end method

.method public final ܺ()I
    .locals 1

    .line 2250
    invoke-virtual {p0}, Ll/᩺ۜۖ;->ۘ()I

    move-result v0

    return v0
.end method

.method public final ܽ()I
    .locals 2

    .line 2739
    iget v0, p0, Ll/᩺ۜۖ;->ܺ:I

    iget v1, p0, Ll/᩺ۜۖ;->ۡ:I

    add-int/2addr v0, v1

    return v0
.end method

.method public final ܽ(I)I
    .locals 2

    if-ltz p1, :cond_1

    .line 2692
    iget v0, p0, Ll/᩺ۜۖ;->ܺ:I

    iget v1, p0, Ll/᩺ۜۖ;->ۡ:I

    add-int/2addr v0, v1

    add-int/2addr v0, p1

    .line 2693
    iget p1, p0, Ll/᩺ۜۖ;->ۜ:I

    if-gt v0, p1, :cond_0

    .line 2697
    iput v0, p0, Ll/᩺ۜۖ;->ۜ:I

    .line 2699
    invoke-direct {p0}, Ll/᩺ۜۖ;->۫()V

    return p1

    .line 2695
    :cond_0
    invoke-static {}, Ll/֫᩵ۖ;->᩷()Ll/֫᩵ۖ;

    move-result-object p1

    throw p1

    .line 2690
    :cond_1
    invoke-static {}, Ll/֫᩵ۖ;->᩻()Ll/֫᩵ۖ;

    move-result-object p1

    throw p1
.end method

.method public final ܿ()Z
    .locals 5

    .line 2265
    invoke-virtual {p0}, Ll/᩺ۜۖ;->ۗ()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ᩳ()Z
    .locals 2

    .line 2734
    iget v0, p0, Ll/᩺ۜۖ;->ۡ:I

    iget v1, p0, Ll/᩺ۜۖ;->ܳ:I

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Ll/᩺ۜۖ;->ۡ(I)Z

    move-result v1

    if-nez v1, :cond_0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ᩳ(I)Z
    .locals 5

    and-int/lit8 v0, p1, 0x7

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_6

    if-eq v0, v2, :cond_5

    const/4 v3, 0x2

    if-eq v0, v3, :cond_4

    const/4 v3, 0x4

    const/4 v4, 0x3

    if-eq v0, v4, :cond_2

    if-eq v0, v3, :cond_1

    const/4 p1, 0x5

    if-ne v0, p1, :cond_0

    .line 2123
    invoke-virtual {p0, v3}, Ll/᩺ۜۖ;->ܳ(I)V

    return v2

    .line 2126
    :cond_0
    invoke-static {}, Ll/֫᩵ۖ;->ܿ()Ll/۟ᩴۖ;

    move-result-object p1

    throw p1

    :cond_1
    return v1

    .line 2184
    :cond_2
    invoke-virtual {p0}, Ll/᩺ۜۖ;->ܶ()I

    move-result v0

    if-eqz v0, :cond_3

    .line 2185
    invoke-virtual {p0, v0}, Ll/᩺ۜۖ;->ᩳ(I)Z

    move-result v0

    if-nez v0, :cond_2

    :cond_3
    ushr-int/2addr p1, v4

    shl-int/2addr p1, v4

    or-int/2addr p1, v3

    .line 2117
    invoke-virtual {p0, p1}, Ll/᩺ۜۖ;->֫(I)V

    return v2

    .line 2113
    :cond_4
    invoke-virtual {p0}, Ll/᩺ۜۖ;->ۘ()I

    move-result p1

    invoke-virtual {p0, p1}, Ll/᩺ۜۖ;->ܳ(I)V

    return v2

    :cond_5
    const/16 p1, 0x8

    .line 2110
    invoke-virtual {p0, p1}, Ll/᩺ۜۖ;->ܳ(I)V

    return v2

    .line 2526
    :cond_6
    iget p1, p0, Ll/᩺ۜۖ;->ܳ:I

    iget v0, p0, Ll/᩺ۜۖ;->ۡ:I

    sub-int/2addr p1, v0

    iget-object v0, p0, Ll/᩺ۜۖ;->ܿ:[B

    const/16 v3, 0xa

    if-lt p1, v3, :cond_9

    :goto_0
    if-ge v1, v3, :cond_8

    .line 2535
    iget p1, p0, Ll/᩺ۜۖ;->ۡ:I

    add-int/lit8 v4, p1, 0x1

    iput v4, p0, Ll/᩺ۜۖ;->ۡ:I

    aget-byte p1, v0, p1

    if-ltz p1, :cond_7

    goto :goto_2

    :cond_7
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 2539
    :cond_8
    invoke-static {}, Ll/֫᩵ۖ;->ܳ()Ll/֫᩵ۖ;

    move-result-object p1

    throw p1

    :cond_9
    :goto_1
    if-ge v1, v3, :cond_c

    .line 2838
    iget p1, p0, Ll/᩺ۜۖ;->ۡ:I

    iget v4, p0, Ll/᩺ۜۖ;->ܳ:I

    if-ne p1, v4, :cond_a

    .line 2839
    invoke-direct {p0, v2}, Ll/᩺ۜۖ;->ۢ(I)V

    .line 2841
    :cond_a
    iget p1, p0, Ll/᩺ۜۖ;->ۡ:I

    add-int/lit8 v4, p1, 0x1

    iput v4, p0, Ll/᩺ۜۖ;->ۡ:I

    aget-byte p1, v0, p1

    if-ltz p1, :cond_b

    :goto_2
    return v2

    :cond_b
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 2548
    :cond_c
    invoke-static {}, Ll/֫᩵ۖ;->ܳ()Ll/֫᩵ۖ;

    move-result-object p1

    throw p1
.end method

.method public final ᩴ()I
    .locals 1

    .line 2462
    invoke-virtual {p0}, Ll/᩺ۜۖ;->᩶()I

    move-result v0

    return v0
.end method

.method public final ᩵()J
    .locals 2

    .line 2467
    invoke-virtual {p0}, Ll/᩺ۜۖ;->ۙ()J

    move-result-wide v0

    return-wide v0
.end method

.method public final ᩶()I
    .locals 4

    .line 2639
    iget v0, p0, Ll/᩺ۜۖ;->ۡ:I

    .line 2641
    iget v1, p0, Ll/᩺ۜۖ;->ܳ:I

    sub-int/2addr v1, v0

    const/4 v2, 0x4

    if-ge v1, v2, :cond_0

    .line 2642
    invoke-direct {p0, v2}, Ll/᩺ۜۖ;->ۢ(I)V

    .line 2643
    iget v0, p0, Ll/᩺ۜۖ;->ۡ:I

    :cond_0
    add-int/lit8 v1, v0, 0x4

    .line 2647
    iput v1, p0, Ll/᩺ۜۖ;->ۡ:I

    .line 2648
    iget-object v1, p0, Ll/᩺ۜۖ;->ܿ:[B

    aget-byte v2, v1, v0

    and-int/lit16 v2, v2, 0xff

    add-int/lit8 v3, v0, 0x1

    aget-byte v3, v1, v3

    and-int/lit16 v3, v3, 0xff

    shl-int/lit8 v3, v3, 0x8

    or-int/2addr v2, v3

    add-int/lit8 v3, v0, 0x2

    aget-byte v3, v1, v3

    and-int/lit16 v3, v3, 0xff

    shl-int/lit8 v3, v3, 0x10

    or-int/2addr v2, v3

    add-int/lit8 v0, v0, 0x3

    aget-byte v0, v1, v0

    and-int/lit16 v0, v0, 0xff

    shl-int/lit8 v0, v0, 0x18

    or-int/2addr v0, v2

    return v0
.end method

.method public final ᩷()I
    .locals 1

    .line 2260
    invoke-virtual {p0}, Ll/᩺ۜۖ;->᩶()I

    move-result v0

    return v0
.end method

.method public final ᩸()I
    .locals 1

    .line 2452
    invoke-virtual {p0}, Ll/᩺ۜۖ;->ۘ()I

    move-result v0

    return v0
.end method

.method public final ᩹()J
    .locals 2

    .line 2240
    invoke-virtual {p0}, Ll/᩺ۜۖ;->ۗ()J

    move-result-wide v0

    return-wide v0
.end method

.method public final ᩻()D
    .locals 2

    .line 2230
    invoke-virtual {p0}, Ll/᩺ۜۖ;->ۙ()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->longBitsToDouble(J)D

    move-result-wide v0

    return-wide v0
.end method
