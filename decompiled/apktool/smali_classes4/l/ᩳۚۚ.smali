.class public final Ll/ᩳۚۚ;
.super Ljava/lang/Object;
.source "5BIC"


# instance fields
.field public ֫:I

.field public ۖ:[Ljava/lang/String;

.field public ۜ:I

.field public ۡ:Ljava/io/StringReader;

.field public ۢ:Z

.field public ۧ:I

.field public ܳ:I

.field public ܺ:I

.field public ܽ:I

.field public ܿ:[C

.field public ᩳ:I

.field public ᩷:Ljava/util/ArrayList;

.field public ᩻:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/io/StringReader;I)V
    .locals 1

    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 31
    iput v0, p0, Ll/ᩳۚۚ;->ۧ:I

    const/16 v0, 0x200

    new-array v0, v0, [Ljava/lang/String;

    .line 33
    iput-object v0, p0, Ll/ᩳۚۚ;->ۖ:[Ljava/lang/String;

    const/4 v0, 0x0

    .line 35
    iput-object v0, p0, Ll/ᩳۚۚ;->᩷:Ljava/util/ArrayList;

    const/4 v0, 0x1

    .line 36
    iput v0, p0, Ll/ᩳۚۚ;->ۜ:I

    .line 40
    invoke-virtual {p1}, Ljava/io/Reader;->markSupported()Z

    move-result v0

    invoke-static {v0}, Ll/ܿ֡ۚ;->֫(Z)V

    .line 41
    iput-object p1, p0, Ll/ᩳۚۚ;->ۡ:Ljava/io/StringReader;

    const p1, 0x8000

    .line 42
    invoke-static {p2, p1}, Ljava/lang/Math;->min(II)I

    move-result p1

    new-array p1, p1, [C

    iput-object p1, p0, Ll/ᩳۚۚ;->ܿ:[C

    .line 43
    invoke-direct {p0}, Ll/ᩳۚۚ;->᩹()V

    return-void
.end method

.method public static ֫([C[Ljava/lang/String;II)Ljava/lang/String;
    .locals 7

    const/16 v0, 0xc

    if-le p3, v0, :cond_0

    .line 715
    new-instance p1, Ljava/lang/String;

    invoke-direct {p1, p0, p2, p3}, Ljava/lang/String;-><init>([CII)V

    return-object p1

    :cond_0
    const/4 v0, 0x1

    if-ge p3, v0, :cond_1

    const-string p0, ""

    return-object p0

    :cond_1
    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v1, p3, :cond_2

    mul-int/lit8 v2, v2, 0x1f

    add-int v3, p2, v1

    .line 722
    aget-char v3, p0, v3

    add-int/2addr v2, v3

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    and-int/lit16 v1, v2, 0x1ff

    .line 727
    aget-object v2, p1, v1

    if-eqz v2, :cond_5

    .line 743
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v3

    if-ne p3, v3, :cond_5

    move v4, p2

    move v3, p3

    :goto_1
    add-int/lit8 v5, v3, -0x1

    if-eqz v3, :cond_4

    add-int/lit8 v3, v4, 0x1

    .line 747
    aget-char v4, p0, v4

    add-int/lit8 v6, v0, 0x1

    invoke-virtual {v2, v0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    if-eq v4, v0, :cond_3

    goto :goto_2

    :cond_3
    move v4, v3

    move v3, v5

    move v0, v6

    goto :goto_1

    :cond_4
    return-object v2

    .line 732
    :cond_5
    :goto_2
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, p0, p2, p3}, Ljava/lang/String;-><init>([CII)V

    .line 733
    aput-object v0, p1, v1

    return-object v0
.end method

.method private ܽ(I)I
    .locals 1

    .line 142
    iget-object v0, p0, Ll/ᩳۚۚ;->᩷:Ljava/util/ArrayList;

    if-eqz v0, :cond_1

    .line 200
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {v0, p1}, Ljava/util/Collections;->binarySearch(Ljava/util/List;Ljava/lang/Object;)I

    move-result p1

    const/4 v0, -0x1

    if-ge p1, v0, :cond_0

    .line 201
    invoke-static {p1}, Ljava/lang/Math;->abs(I)I

    move-result p1

    add-int/lit8 p1, p1, -0x2

    :cond_0
    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method private ᩶()V
    .locals 3

    .line 142
    iget-object v0, p0, Ll/ᩳۚۚ;->᩷:Ljava/util/ArrayList;

    if-eqz v0, :cond_3

    .line 212
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 214
    iget v0, p0, Ll/ᩳۚۚ;->ܺ:I

    invoke-direct {p0, v0}, Ll/ᩳۚۚ;->ܽ(I)I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    .line 216
    :cond_0
    iget-object v1, p0, Ll/ᩳۚۚ;->᩷:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 217
    iget v2, p0, Ll/ᩳۚۚ;->ۜ:I

    add-int/2addr v2, v0

    iput v2, p0, Ll/ᩳۚۚ;->ۜ:I

    .line 218
    iget-object v0, p0, Ll/ᩳۚۚ;->᩷:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 219
    iget-object v0, p0, Ll/ᩳۚۚ;->᩷:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 222
    :cond_1
    iget v0, p0, Ll/ᩳۚۚ;->ܽ:I

    :goto_0
    iget v1, p0, Ll/ᩳۚۚ;->֫:I

    if-ge v0, v1, :cond_3

    .line 223
    iget-object v1, p0, Ll/ᩳۚۚ;->ܿ:[C

    aget-char v1, v1, v0

    const/16 v2, 0xa

    if-ne v1, v2, :cond_2

    .line 224
    iget-object v1, p0, Ll/ᩳۚۚ;->᩷:Ljava/util/ArrayList;

    iget v2, p0, Ll/ᩳۚۚ;->ܺ:I

    add-int/lit8 v2, v2, 0x1

    add-int/2addr v2, v0

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_3
    return-void
.end method

.method private ᩹()V
    .locals 14

    .line 69
    iget-boolean v0, p0, Ll/ᩳۚۚ;->ۢ:Z

    if-nez v0, :cond_8

    iget v0, p0, Ll/ᩳۚۚ;->ܽ:I

    iget v1, p0, Ll/ᩳۚۚ;->ᩳ:I

    if-ge v0, v1, :cond_0

    goto/16 :goto_4

    .line 74
    :cond_0
    iget v1, p0, Ll/ᩳۚۚ;->ۧ:I

    const/4 v2, -0x1

    const/4 v3, 0x0

    if-eq v1, v2, :cond_1

    sub-int/2addr v0, v1

    move v13, v1

    move v1, v0

    move v0, v13

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    .line 83
    :goto_0
    :try_start_0
    iget-object v4, p0, Ll/ᩳۚۚ;->ۡ:Ljava/io/StringReader;

    int-to-long v5, v0

    invoke-virtual {v4, v5, v6}, Ljava/io/Reader;->skip(J)J

    move-result-wide v7

    .line 84
    iget-object v4, p0, Ll/ᩳۚۚ;->ۡ:Ljava/io/StringReader;

    const v9, 0x8000

    invoke-virtual {v4, v9}, Ljava/io/Reader;->mark(I)V

    const/4 v4, 0x0

    :goto_1
    const/16 v9, 0x400

    const/4 v10, 0x1

    if-gt v4, v9, :cond_4

    .line 87
    iget-object v9, p0, Ll/ᩳۚۚ;->ۡ:Ljava/io/StringReader;

    iget-object v11, p0, Ll/ᩳۚۚ;->ܿ:[C

    array-length v12, v11

    sub-int/2addr v12, v4

    invoke-virtual {v9, v11, v4, v12}, Ljava/io/Reader;->read([CII)I

    move-result v9

    if-ne v9, v2, :cond_2

    .line 89
    iput-boolean v10, p0, Ll/ᩳۚۚ;->ۢ:Z

    :cond_2
    if-gtz v9, :cond_3

    goto :goto_2

    :cond_3
    add-int/2addr v4, v9

    goto :goto_1

    .line 94
    :cond_4
    :goto_2
    iget-object v9, p0, Ll/ᩳۚۚ;->ۡ:Ljava/io/StringReader;

    invoke-virtual {v9}, Ljava/io/Reader;->reset()V

    if-lez v4, :cond_7

    cmp-long v9, v7, v5

    if-nez v9, :cond_5

    goto :goto_3

    :cond_5
    const/4 v10, 0x0

    .line 96
    :goto_3
    invoke-static {v10}, Ll/ܿ֡ۚ;->֫(Z)V

    .line 97
    iput v4, p0, Ll/ᩳۚۚ;->֫:I

    .line 98
    iget v5, p0, Ll/ᩳۚۚ;->ܺ:I

    add-int/2addr v5, v0

    iput v5, p0, Ll/ᩳۚۚ;->ܺ:I

    .line 99
    iput v1, p0, Ll/ᩳۚۚ;->ܽ:I

    .line 100
    iget v0, p0, Ll/ᩳۚۚ;->ۧ:I

    if-eq v0, v2, :cond_6

    .line 101
    iput v3, p0, Ll/ᩳۚۚ;->ۧ:I

    :cond_6
    const/16 v0, 0x6000

    .line 102
    invoke-static {v4, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    iput v0, p0, Ll/ᩳۚۚ;->ᩳ:I
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 107
    :cond_7
    invoke-direct {p0}, Ll/ᩳۚۚ;->᩶()V

    const/4 v0, 0x0

    .line 108
    iput-object v0, p0, Ll/ᩳۚۚ;->᩻:Ljava/lang/String;

    return-void

    :catch_0
    move-exception v0

    .line 105
    new-instance v1, Ll/ۧ֡ۚ;

    .line 7
    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 105
    throw v1

    :cond_8
    :goto_4
    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 4

    .line 700
    iget v0, p0, Ll/ᩳۚۚ;->֫:I

    iget v1, p0, Ll/ᩳۚۚ;->ܽ:I

    sub-int v2, v0, v1

    if-gez v2, :cond_0

    const-string v0, ""

    return-object v0

    .line 702
    :cond_0
    new-instance v2, Ljava/lang/String;

    iget-object v3, p0, Ll/ᩳۚۚ;->ܿ:[C

    sub-int/2addr v0, v1

    invoke-direct {v2, v3, v1, v0}, Ljava/lang/String;-><init>([CII)V

    return-object v2
.end method

.method public final ֡()Z
    .locals 2

    .line 646
    invoke-virtual {p0}, Ll/ᩳۚۚ;->ۘ()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 648
    :cond_0
    iget-object v0, p0, Ll/ᩳۚۚ;->ܿ:[C

    iget v1, p0, Ll/ᩳۚۚ;->ܽ:I

    aget-char v0, v0, v1

    const/16 v1, 0x30

    if-lt v0, v1, :cond_1

    const/16 v1, 0x39

    if-gt v0, v1, :cond_1

    const/4 v0, 0x1

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ֨()I
    .locals 2

    .line 116
    iget v0, p0, Ll/ᩳۚۚ;->ܺ:I

    iget v1, p0, Ll/ᩳۚۚ;->ܽ:I

    add-int/2addr v0, v1

    return v0
.end method

.method public final ֫(I)I
    .locals 2

    .line 142
    iget-object v0, p0, Ll/ᩳۚۚ;->᩷:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    .line 181
    invoke-direct {p0, p1}, Ll/ᩳۚۚ;->ܽ(I)I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_1

    :cond_0
    :goto_0
    add-int/lit8 p1, p1, 0x1

    return p1

    .line 184
    :cond_1
    iget-object v1, p0, Ll/ᩳۚۚ;->᩷:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    sub-int/2addr p1, v0

    goto :goto_0
.end method

.method public final ֫(C)Ljava/lang/String;
    .locals 3

    .line 302
    invoke-direct {p0}, Ll/ᩳۚۚ;->᩹()V

    .line 303
    iget v0, p0, Ll/ᩳۚۚ;->ܽ:I

    :goto_0
    iget v1, p0, Ll/ᩳۚۚ;->֫:I

    const/4 v2, -0x1

    if-ge v0, v1, :cond_1

    .line 304
    iget-object v1, p0, Ll/ᩳۚۚ;->ܿ:[C

    aget-char v1, v1, v0

    if-ne p1, v1, :cond_0

    .line 305
    iget p1, p0, Ll/ᩳۚۚ;->ܽ:I

    sub-int/2addr v0, p1

    goto :goto_1

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, -0x1

    :goto_1
    if-eq v0, v2, :cond_2

    .line 343
    iget-object p1, p0, Ll/ᩳۚۚ;->ܿ:[C

    iget-object v1, p0, Ll/ᩳۚۚ;->ۖ:[Ljava/lang/String;

    iget v2, p0, Ll/ᩳۚۚ;->ܽ:I

    invoke-static {p1, v1, v2, v0}, Ll/ᩳۚۚ;->֫([C[Ljava/lang/String;II)Ljava/lang/String;

    move-result-object p1

    .line 344
    iget v1, p0, Ll/ᩳۚۚ;->ܽ:I

    add-int/2addr v1, v0

    iput v1, p0, Ll/ᩳۚۚ;->ܽ:I

    return-object p1

    .line 510
    :cond_2
    invoke-direct {p0}, Ll/ᩳۚۚ;->᩹()V

    .line 511
    iget-object p1, p0, Ll/ᩳۚۚ;->ܿ:[C

    iget-object v0, p0, Ll/ᩳۚۚ;->ۖ:[Ljava/lang/String;

    iget v1, p0, Ll/ᩳۚۚ;->ܽ:I

    iget v2, p0, Ll/ᩳۚۚ;->֫:I

    sub-int/2addr v2, v1

    invoke-static {p1, v0, v1, v2}, Ll/ᩳۚۚ;->֫([C[Ljava/lang/String;II)Ljava/lang/String;

    move-result-object p1

    .line 512
    iget v0, p0, Ll/ᩳۚۚ;->֫:I

    iput v0, p0, Ll/ᩳۚۚ;->ܽ:I

    return-object p1
.end method

.method public final ֫(Z)Ljava/lang/String;
    .locals 6

    .line 437
    iget v0, p0, Ll/ᩳۚۚ;->ܽ:I

    .line 439
    iget v1, p0, Ll/ᩳۚۚ;->֫:I

    .line 440
    iget-object v2, p0, Ll/ᩳۚۚ;->ܿ:[C

    move v3, v0

    :goto_0
    if-ge v3, v1, :cond_3

    .line 443
    aget-char v4, v2, v3

    if-eqz v4, :cond_3

    const/16 v5, 0x22

    if-eq v4, v5, :cond_1

    const/16 v5, 0x26

    if-eq v4, v5, :cond_3

    const/16 v5, 0x27

    if-eq v4, v5, :cond_0

    goto :goto_1

    :cond_0
    if-eqz p1, :cond_1

    goto :goto_2

    :cond_1
    if-nez p1, :cond_2

    goto :goto_2

    :cond_2
    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 455
    :cond_3
    :goto_2
    iput v3, p0, Ll/ᩳۚۚ;->ܽ:I

    if-le v3, v0, :cond_4

    .line 456
    iget-object p1, p0, Ll/ᩳۚۚ;->ܿ:[C

    iget-object v1, p0, Ll/ᩳۚۚ;->ۖ:[Ljava/lang/String;

    sub-int/2addr v3, v0

    invoke-static {p1, v1, v0, v3}, Ll/ᩳۚۚ;->֫([C[Ljava/lang/String;II)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_4
    const-string p1, ""

    return-object p1
.end method

.method public final varargs ֫([C)Ljava/lang/String;
    .locals 8

    .line 376
    invoke-direct {p0}, Ll/ᩳۚۚ;->᩹()V

    .line 377
    iget v0, p0, Ll/ᩳۚۚ;->ܽ:I

    .line 379
    iget v1, p0, Ll/ᩳۚۚ;->֫:I

    .line 380
    iget-object v2, p0, Ll/ᩳۚۚ;->ܿ:[C

    .line 381
    array-length v3, p1

    move v4, v0

    :goto_0
    if-ge v4, v1, :cond_2

    const/4 v5, 0x0

    :goto_1
    if-ge v5, v3, :cond_1

    .line 386
    aget-char v6, v2, v4

    aget-char v7, p1, v5

    if-ne v6, v7, :cond_0

    goto :goto_2

    :cond_0
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 392
    :cond_2
    :goto_2
    iput v4, p0, Ll/ᩳۚۚ;->ܽ:I

    if-le v4, v0, :cond_3

    .line 393
    iget-object p1, p0, Ll/ᩳۚۚ;->ܿ:[C

    iget-object v1, p0, Ll/ᩳۚۚ;->ۖ:[Ljava/lang/String;

    sub-int/2addr v4, v0

    invoke-static {p1, v1, v0, v4}, Ll/ᩳۚۚ;->֫([C[Ljava/lang/String;II)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_3
    const-string p1, ""

    return-object p1
.end method

.method public final ֫()V
    .locals 1

    .line 271
    iget v0, p0, Ll/ᩳۚۚ;->ܽ:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Ll/ᩳۚۚ;->ܽ:I

    return-void
.end method

.method public final ֫(Ljava/lang/String;)Z
    .locals 5

    .line 679
    iget-object v0, p0, Ll/ᩳۚۚ;->᩻:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v3, -0x1

    if-eqz v0, :cond_1

    .line 680
    iget v0, p0, Ll/ᩳۚۚ;->ܳ:I

    if-ne v0, v3, :cond_0

    return v1

    .line 681
    :cond_0
    iget v4, p0, Ll/ᩳۚۚ;->ܽ:I

    if-lt v0, v4, :cond_1

    return v2

    .line 683
    :cond_1
    iput-object p1, p0, Ll/ᩳۚۚ;->᩻:Ljava/lang/String;

    .line 685
    sget-object v0, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-virtual {p1, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v4

    .line 686
    invoke-virtual {p0, v4}, Ll/ᩳۚۚ;->ᩳ(Ljava/lang/String;)I

    move-result v4

    if-le v4, v3, :cond_2

    .line 688
    iget p1, p0, Ll/ᩳۚۚ;->ܽ:I

    add-int/2addr p1, v4

    iput p1, p0, Ll/ᩳۚۚ;->ܳ:I

    return v2

    .line 691
    :cond_2
    invoke-virtual {p1, v0}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    .line 692
    invoke-virtual {p0, p1}, Ll/ᩳۚۚ;->ᩳ(Ljava/lang/String;)I

    move-result p1

    if-le p1, v3, :cond_3

    const/4 v1, 0x1

    :cond_3
    if-eqz v1, :cond_4

    .line 694
    iget v0, p0, Ll/ᩳۚۚ;->ܽ:I

    add-int v3, v0, p1

    :cond_4
    iput v3, p0, Ll/ᩳۚۚ;->ܳ:I

    return v1
.end method

.method public final ۖ()Ljava/lang/String;
    .locals 3

    .line 152
    invoke-virtual {p0}, Ll/ᩳۚۚ;->֨()I

    move-result v0

    invoke-virtual {p0, v0}, Ll/ᩳۚۚ;->ۧ(I)I

    move-result v0

    .line 174
    invoke-virtual {p0}, Ll/ᩳۚۚ;->֨()I

    move-result v1

    invoke-virtual {p0, v1}, Ll/ᩳۚۚ;->֫(I)I

    move-result v1

    .line 195
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ":"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۘ()Z
    .locals 2

    .line 233
    invoke-direct {p0}, Ll/ᩳۚۚ;->᩹()V

    .line 234
    iget v0, p0, Ll/ᩳۚۚ;->ܽ:I

    iget v1, p0, Ll/ᩳۚۚ;->֫:I

    if-lt v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ۚ()Z
    .locals 2

    .line 628
    invoke-virtual {p0}, Ll/ᩳۚۚ;->ۘ()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 630
    :cond_0
    iget-object v0, p0, Ll/ᩳۚۚ;->ܿ:[C

    iget v1, p0, Ll/ᩳۚۚ;->ܽ:I

    aget-char v0, v0, v1

    const/16 v1, 0x41

    if-lt v0, v1, :cond_1

    const/16 v1, 0x5a

    if-le v0, v1, :cond_3

    :cond_1
    const/16 v1, 0x61

    if-lt v0, v1, :cond_2

    const/16 v1, 0x7a

    if-le v0, v1, :cond_3

    .line 631
    :cond_2
    invoke-static {v0}, Ljava/lang/Character;->isLetter(C)Z

    move-result v0

    if-eqz v0, :cond_4

    :cond_3
    const/4 v0, 0x1

    return v0

    :cond_4
    :goto_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ۜ()Ljava/lang/String;
    .locals 4

    .line 531
    invoke-direct {p0}, Ll/ᩳۚۚ;->᩹()V

    .line 532
    iget v0, p0, Ll/ᩳۚۚ;->ܽ:I

    .line 533
    :goto_0
    iget v1, p0, Ll/ᩳۚۚ;->ܽ:I

    iget v2, p0, Ll/ᩳۚۚ;->֫:I

    if-ge v1, v2, :cond_3

    .line 534
    iget-object v2, p0, Ll/ᩳۚۚ;->ܿ:[C

    aget-char v1, v2, v1

    const/16 v2, 0x41

    if-lt v1, v2, :cond_0

    const/16 v2, 0x5a

    if-le v1, v2, :cond_2

    :cond_0
    const/16 v2, 0x61

    if-lt v1, v2, :cond_1

    const/16 v2, 0x7a

    if-le v1, v2, :cond_2

    .line 535
    :cond_1
    invoke-static {v1}, Ljava/lang/Character;->isLetter(C)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 536
    :cond_2
    iget v1, p0, Ll/ᩳۚۚ;->ܽ:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Ll/ᩳۚۚ;->ܽ:I

    goto :goto_0

    .line 238
    :cond_3
    :goto_1
    iget v1, p0, Ll/ᩳۚۚ;->ܽ:I

    iget v2, p0, Ll/ᩳۚۚ;->֫:I

    if-lt v1, v2, :cond_4

    goto :goto_2

    .line 541
    :cond_4
    iget-object v2, p0, Ll/ᩳۚۚ;->ܿ:[C

    aget-char v2, v2, v1

    const/16 v3, 0x30

    if-lt v2, v3, :cond_5

    const/16 v3, 0x39

    if-gt v2, v3, :cond_5

    add-int/lit8 v1, v1, 0x1

    .line 543
    iput v1, p0, Ll/ᩳۚۚ;->ܽ:I

    goto :goto_1

    .line 548
    :cond_5
    :goto_2
    iget-object v2, p0, Ll/ᩳۚۚ;->ܿ:[C

    iget-object v3, p0, Ll/ᩳۚۚ;->ۖ:[Ljava/lang/String;

    sub-int/2addr v1, v0

    invoke-static {v2, v3, v0, v1}, Ll/ᩳۚۚ;->֫([C[Ljava/lang/String;II)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۠()V
    .locals 3

    .line 288
    iget v0, p0, Ll/ᩳۚۚ;->ۧ:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    .line 291
    iput v0, p0, Ll/ᩳۚۚ;->ܽ:I

    .line 284
    iput v1, p0, Ll/ᩳۚۚ;->ۧ:I

    return-void

    .line 289
    :cond_0
    new-instance v0, Ll/ۧ֡ۚ;

    new-instance v1, Ljava/io/IOException;

    const-string v2, "Mark invalid"

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 7
    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 289
    throw v0
.end method

.method public final ۡ()Ljava/lang/String;
    .locals 5

    const-string v0, "]]>"

    .line 352
    invoke-virtual {p0, v0}, Ll/ᩳۚۚ;->ᩳ(Ljava/lang/String;)I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    .line 354
    iget-object v1, p0, Ll/ᩳۚۚ;->ܿ:[C

    iget-object v2, p0, Ll/ᩳۚۚ;->ۖ:[Ljava/lang/String;

    iget v3, p0, Ll/ᩳۚۚ;->ܽ:I

    invoke-static {v1, v2, v3, v0}, Ll/ᩳۚۚ;->֫([C[Ljava/lang/String;II)Ljava/lang/String;

    move-result-object v1

    .line 355
    iget v2, p0, Ll/ᩳۚۚ;->ܽ:I

    add-int/2addr v2, v0

    iput v2, p0, Ll/ᩳۚۚ;->ܽ:I

    return-object v1

    .line 357
    :cond_0
    iget v0, p0, Ll/ᩳۚۚ;->֫:I

    iget v1, p0, Ll/ᩳۚۚ;->ܽ:I

    sub-int v2, v0, v1

    const/4 v3, 0x3

    if-ge v2, v3, :cond_1

    .line 510
    invoke-direct {p0}, Ll/ᩳۚۚ;->᩹()V

    .line 511
    iget-object v0, p0, Ll/ᩳۚۚ;->ܿ:[C

    iget-object v1, p0, Ll/ᩳۚۚ;->ۖ:[Ljava/lang/String;

    iget v2, p0, Ll/ᩳۚۚ;->ܽ:I

    iget v3, p0, Ll/ᩳۚۚ;->֫:I

    sub-int/2addr v3, v2

    invoke-static {v0, v1, v2, v3}, Ll/ᩳۚۚ;->֫([C[Ljava/lang/String;II)Ljava/lang/String;

    move-result-object v0

    .line 512
    iget v1, p0, Ll/ᩳۚۚ;->֫:I

    iput v1, p0, Ll/ᩳۚۚ;->ܽ:I

    return-object v0

    :cond_1
    add-int/lit8 v0, v0, -0x2

    .line 364
    iget-object v2, p0, Ll/ᩳۚۚ;->ܿ:[C

    iget-object v3, p0, Ll/ᩳۚۚ;->ۖ:[Ljava/lang/String;

    sub-int v4, v0, v1

    invoke-static {v2, v3, v1, v4}, Ll/ᩳۚۚ;->֫([C[Ljava/lang/String;II)Ljava/lang/String;

    move-result-object v1

    .line 365
    iput v0, p0, Ll/ᩳۚۚ;->ܽ:I

    return-object v1
.end method

.method public final ۢ()Ljava/lang/String;
    .locals 6

    .line 484
    invoke-direct {p0}, Ll/ᩳۚۚ;->᩹()V

    .line 485
    iget v0, p0, Ll/ᩳۚۚ;->ܽ:I

    .line 487
    iget v1, p0, Ll/ᩳۚۚ;->֫:I

    .line 488
    iget-object v2, p0, Ll/ᩳۚۚ;->ܿ:[C

    move v3, v0

    :goto_0
    if-ge v3, v1, :cond_0

    .line 491
    aget-char v4, v2, v3

    const/16 v5, 0x9

    if-eq v4, v5, :cond_0

    const/16 v5, 0xa

    if-eq v4, v5, :cond_0

    const/16 v5, 0xc

    if-eq v4, v5, :cond_0

    const/16 v5, 0xd

    if-eq v4, v5, :cond_0

    const/16 v5, 0x20

    if-eq v4, v5, :cond_0

    const/16 v5, 0x2f

    if-eq v4, v5, :cond_0

    const/16 v5, 0x3c

    if-eq v4, v5, :cond_0

    const/16 v5, 0x3e

    if-eq v4, v5, :cond_0

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 505
    :cond_0
    iput v3, p0, Ll/ᩳۚۚ;->ܽ:I

    if-le v3, v0, :cond_1

    .line 506
    iget-object v1, p0, Ll/ᩳۚۚ;->ܿ:[C

    iget-object v2, p0, Ll/ᩳۚۚ;->ۖ:[Ljava/lang/String;

    sub-int/2addr v3, v0

    invoke-static {v1, v2, v0, v3}, Ll/ᩳۚۚ;->֫([C[Ljava/lang/String;II)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_1
    const-string v0, ""

    return-object v0
.end method

.method public final ۧ(I)I
    .locals 2

    .line 142
    iget-object v0, p0, Ll/ᩳۚۚ;->᩷:Ljava/util/ArrayList;

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    .line 161
    invoke-direct {p0, p1}, Ll/ᩳۚۚ;->ܽ(I)I

    move-result p1

    const/4 v0, -0x1

    if-ne p1, v0, :cond_0

    .line 163
    iget p1, p0, Ll/ᩳۚۚ;->ۜ:I

    return p1

    .line 164
    :cond_0
    iget v0, p0, Ll/ᩳۚۚ;->ۜ:I

    add-int/2addr p1, v0

    add-int/2addr p1, v1

    return p1

    :cond_1
    return v1
.end method

.method public final varargs ۧ([C)Ljava/lang/String;
    .locals 5

    .line 397
    invoke-direct {p0}, Ll/ᩳۚۚ;->᩹()V

    .line 398
    iget v0, p0, Ll/ᩳۚۚ;->ܽ:I

    .line 400
    iget v1, p0, Ll/ᩳۚۚ;->֫:I

    .line 401
    iget-object v2, p0, Ll/ᩳۚۚ;->ܿ:[C

    move v3, v0

    :goto_0
    if-ge v3, v1, :cond_1

    .line 404
    aget-char v4, v2, v3

    invoke-static {p1, v4}, Ljava/util/Arrays;->binarySearch([CC)I

    move-result v4

    if-ltz v4, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 408
    :cond_1
    :goto_1
    iput v3, p0, Ll/ᩳۚۚ;->ܽ:I

    if-le v3, v0, :cond_2

    .line 409
    iget-object p1, p0, Ll/ᩳۚۚ;->ܿ:[C

    iget-object v1, p0, Ll/ᩳۚۚ;->ۖ:[Ljava/lang/String;

    sub-int/2addr v3, v0

    invoke-static {p1, v1, v0, v3}, Ll/ᩳۚۚ;->֫([C[Ljava/lang/String;II)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_2
    const-string p1, ""

    return-object p1
.end method

.method public final ۧ()V
    .locals 2

    .line 55
    iget-object v0, p0, Ll/ᩳۚۚ;->ۡ:Ljava/io/StringReader;

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v1, 0x0

    .line 58
    :try_start_0
    invoke-virtual {v0}, Ljava/io/Reader;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    .line 61
    iput-object v1, p0, Ll/ᩳۚۚ;->ۡ:Ljava/io/StringReader;

    .line 62
    iput-object v1, p0, Ll/ᩳۚۚ;->ܿ:[C

    .line 63
    iput-object v1, p0, Ll/ᩳۚۚ;->ۖ:[Ljava/lang/String;

    .line 64
    throw v0

    .line 61
    :catch_0
    :goto_0
    iput-object v1, p0, Ll/ᩳۚۚ;->ۡ:Ljava/io/StringReader;

    .line 62
    iput-object v1, p0, Ll/ᩳۚۚ;->ܿ:[C

    .line 63
    iput-object v1, p0, Ll/ᩳۚۚ;->ۖ:[Ljava/lang/String;

    return-void
.end method

.method public final ۧ(Z)V
    .locals 1

    if-eqz p1, :cond_0

    .line 128
    iget-object v0, p0, Ll/ᩳۚۚ;->᩷:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    .line 129
    new-instance p1, Ljava/util/ArrayList;

    const/16 v0, 0x199

    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(I)V

    iput-object p1, p0, Ll/ᩳۚۚ;->᩷:Ljava/util/ArrayList;

    .line 130
    invoke-direct {p0}, Ll/ᩳۚۚ;->᩶()V

    return-void

    :cond_0
    if-nez p1, :cond_1

    const/4 p1, 0x0

    .line 133
    iput-object p1, p0, Ll/ᩳۚۚ;->᩷:Ljava/util/ArrayList;

    :cond_1
    return-void
.end method

.method public final ۧ(C)Z
    .locals 2

    .line 578
    invoke-virtual {p0}, Ll/ᩳۚۚ;->ۘ()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Ll/ᩳۚۚ;->ܿ:[C

    iget v1, p0, Ll/ᩳۚۚ;->ܽ:I

    aget-char v0, v0, v1

    if-ne v0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ۧ(Ljava/lang/String;)Z
    .locals 6

    .line 653
    invoke-direct {p0}, Ll/ᩳۚۚ;->᩹()V

    .line 583
    invoke-direct {p0}, Ll/ᩳۚۚ;->᩹()V

    .line 584
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    .line 585
    iget v1, p0, Ll/ᩳۚۚ;->֫:I

    iget v2, p0, Ll/ᩳۚۚ;->ܽ:I

    sub-int/2addr v1, v2

    const/4 v2, 0x0

    if-le v0, v1, :cond_0

    goto :goto_1

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_2

    .line 589
    invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C

    move-result v3

    iget-object v4, p0, Ll/ᩳۚۚ;->ܿ:[C

    iget v5, p0, Ll/ᩳۚۚ;->ܽ:I

    add-int/2addr v5, v1

    aget-char v4, v4, v5

    if-eq v3, v4, :cond_1

    :goto_1
    return v2

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 655
    :cond_2
    iget v0, p0, Ll/ᩳۚۚ;->ܽ:I

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    add-int/2addr p1, v0

    iput p1, p0, Ll/ᩳۚۚ;->ܽ:I

    const/4 p1, 0x1

    return p1
.end method

.method public final ܳ()Ljava/lang/String;
    .locals 4

    .line 552
    invoke-direct {p0}, Ll/ᩳۚۚ;->᩹()V

    .line 553
    iget v0, p0, Ll/ᩳۚۚ;->ܽ:I

    .line 554
    :goto_0
    iget v1, p0, Ll/ᩳۚۚ;->ܽ:I

    iget v2, p0, Ll/ᩳۚۚ;->֫:I

    if-ge v1, v2, :cond_3

    .line 555
    iget-object v2, p0, Ll/ᩳۚۚ;->ܿ:[C

    aget-char v2, v2, v1

    const/16 v3, 0x30

    if-lt v2, v3, :cond_0

    const/16 v3, 0x39

    if-le v2, v3, :cond_2

    :cond_0
    const/16 v3, 0x41

    if-lt v2, v3, :cond_1

    const/16 v3, 0x46

    if-le v2, v3, :cond_2

    :cond_1
    const/16 v3, 0x61

    if-lt v2, v3, :cond_3

    const/16 v3, 0x66

    if-gt v2, v3, :cond_3

    :cond_2
    add-int/lit8 v1, v1, 0x1

    .line 557
    iput v1, p0, Ll/ᩳۚۚ;->ܽ:I

    goto :goto_0

    .line 561
    :cond_3
    iget-object v2, p0, Ll/ᩳۚۚ;->ܿ:[C

    iget-object v3, p0, Ll/ᩳۚۚ;->ۖ:[Ljava/lang/String;

    sub-int/2addr v1, v0

    invoke-static {v2, v3, v0, v1}, Ll/ᩳۚۚ;->֫([C[Ljava/lang/String;II)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ܶ()V
    .locals 3

    .line 261
    iget v0, p0, Ll/ᩳۚۚ;->ܽ:I

    const/4 v1, 0x1

    if-lt v0, v1, :cond_0

    sub-int/2addr v0, v1

    .line 264
    iput v0, p0, Ll/ᩳۚۚ;->ܽ:I

    return-void

    .line 262
    :cond_0
    new-instance v0, Ll/ۧ֡ۚ;

    new-instance v1, Ljava/io/IOException;

    const-string v2, "WTF: No buffer left to unconsume."

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 7
    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 262
    throw v0
.end method

.method public final ܺ()C
    .locals 2

    .line 246
    invoke-direct {p0}, Ll/ᩳۚۚ;->᩹()V

    .line 238
    iget v0, p0, Ll/ᩳۚۚ;->ܽ:I

    iget v1, p0, Ll/ᩳۚۚ;->֫:I

    if-lt v0, v1, :cond_0

    const v0, 0xffff

    return v0

    .line 247
    :cond_0
    iget-object v1, p0, Ll/ᩳۚۚ;->ܿ:[C

    aget-char v0, v1, v0

    return v0
.end method

.method public final ܽ()C
    .locals 2

    .line 251
    invoke-direct {p0}, Ll/ᩳۚۚ;->᩹()V

    .line 238
    iget v0, p0, Ll/ᩳۚۚ;->ܽ:I

    iget v1, p0, Ll/ᩳۚۚ;->֫:I

    if-lt v0, v1, :cond_0

    const v1, 0xffff

    goto :goto_0

    .line 252
    :cond_0
    iget-object v1, p0, Ll/ᩳۚۚ;->ܿ:[C

    aget-char v1, v1, v0

    :goto_0
    add-int/lit8 v0, v0, 0x1

    .line 253
    iput v0, p0, Ll/ᩳۚۚ;->ܽ:I

    return v1
.end method

.method public final ܽ(Ljava/lang/String;)Z
    .locals 6

    .line 595
    invoke-direct {p0}, Ll/ᩳۚۚ;->᩹()V

    .line 596
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    .line 597
    iget v1, p0, Ll/ᩳۚۚ;->֫:I

    iget v2, p0, Ll/ᩳۚۚ;->ܽ:I

    sub-int/2addr v1, v2

    const/4 v2, 0x0

    if-le v0, v1, :cond_0

    goto :goto_1

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_2

    .line 601
    invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C

    move-result v3

    invoke-static {v3}, Ljava/lang/Character;->toUpperCase(C)C

    move-result v3

    .line 602
    iget-object v4, p0, Ll/ᩳۚۚ;->ܿ:[C

    iget v5, p0, Ll/ᩳۚۚ;->ܽ:I

    add-int/2addr v5, v1

    aget-char v4, v4, v5

    invoke-static {v4}, Ljava/lang/Character;->toUpperCase(C)C

    move-result v4

    if-eq v3, v4, :cond_1

    :goto_1
    return v2

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 664
    :cond_2
    iget v0, p0, Ll/ᩳۚۚ;->ܽ:I

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    add-int/2addr p1, v0

    iput p1, p0, Ll/ᩳۚۚ;->ܽ:I

    const/4 p1, 0x1

    return p1
.end method

.method public final varargs ܽ([C)Z
    .locals 5

    .line 610
    invoke-virtual {p0}, Ll/ᩳۚۚ;->ۘ()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    goto :goto_1

    .line 613
    :cond_0
    invoke-direct {p0}, Ll/ᩳۚۚ;->᩹()V

    .line 614
    iget-object v0, p0, Ll/ᩳۚۚ;->ܿ:[C

    iget v2, p0, Ll/ᩳۚۚ;->ܽ:I

    aget-char v0, v0, v2

    .line 615
    array-length v2, p1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_2

    aget-char v4, p1, v3

    if-ne v4, v0, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    :goto_1
    return v1
.end method

.method public final ܿ()Ljava/lang/String;
    .locals 4

    .line 565
    invoke-direct {p0}, Ll/ᩳۚۚ;->᩹()V

    .line 566
    iget v0, p0, Ll/ᩳۚۚ;->ܽ:I

    .line 567
    :goto_0
    iget v1, p0, Ll/ᩳۚۚ;->ܽ:I

    iget v2, p0, Ll/ᩳۚۚ;->֫:I

    if-ge v1, v2, :cond_0

    .line 568
    iget-object v2, p0, Ll/ᩳۚۚ;->ܿ:[C

    aget-char v2, v2, v1

    const/16 v3, 0x30

    if-lt v2, v3, :cond_0

    const/16 v3, 0x39

    if-gt v2, v3, :cond_0

    add-int/lit8 v1, v1, 0x1

    .line 570
    iput v1, p0, Ll/ᩳۚۚ;->ܽ:I

    goto :goto_0

    .line 574
    :cond_0
    iget-object v2, p0, Ll/ᩳۚۚ;->ܿ:[C

    iget-object v3, p0, Ll/ᩳۚۚ;->ۖ:[Ljava/lang/String;

    sub-int/2addr v1, v0

    invoke-static {v2, v3, v0, v1}, Ll/ᩳۚۚ;->֫([C[Ljava/lang/String;II)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ᩳ(Ljava/lang/String;)I
    .locals 8

    .line 317
    invoke-direct {p0}, Ll/ᩳۚۚ;->᩹()V

    const/4 v0, 0x0

    .line 319
    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    .line 320
    iget v1, p0, Ll/ᩳۚۚ;->ܽ:I

    :goto_0
    iget v2, p0, Ll/ᩳۚۚ;->֫:I

    if-ge v1, v2, :cond_3

    .line 322
    iget-object v2, p0, Ll/ᩳۚۚ;->ܿ:[C

    aget-char v2, v2, v1

    const/4 v3, 0x1

    if-eq v0, v2, :cond_0

    :goto_1
    add-int/2addr v1, v3

    .line 323
    iget v2, p0, Ll/ᩳۚۚ;->֫:I

    if-ge v1, v2, :cond_0

    iget-object v2, p0, Ll/ᩳۚۚ;->ܿ:[C

    aget-char v2, v2, v1

    if-eq v0, v2, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v2, v1, 0x1

    .line 325
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v4

    add-int/2addr v4, v2

    sub-int/2addr v4, v3

    .line 326
    iget v5, p0, Ll/ᩳۚۚ;->֫:I

    if-ge v1, v5, :cond_2

    if-gt v4, v5, :cond_2

    move v5, v2

    :goto_2
    if-ge v5, v4, :cond_1

    .line 327
    invoke-virtual {p1, v3}, Ljava/lang/String;->charAt(I)C

    move-result v6

    iget-object v7, p0, Ll/ᩳۚۚ;->ܿ:[C

    aget-char v7, v7, v5

    if-ne v6, v7, :cond_1

    add-int/lit8 v5, v5, 0x1

    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    :cond_1
    if-ne v5, v4, :cond_2

    .line 329
    iget p1, p0, Ll/ᩳۚۚ;->ܽ:I

    sub-int/2addr v1, p1

    return v1

    :cond_2
    move v1, v2

    goto :goto_0

    :cond_3
    const/4 p1, -0x1

    return p1
.end method

.method public final ᩳ()Ljava/lang/String;
    .locals 6

    .line 415
    iget v0, p0, Ll/ᩳۚۚ;->ܽ:I

    .line 417
    iget v1, p0, Ll/ᩳۚۚ;->֫:I

    .line 418
    iget-object v2, p0, Ll/ᩳۚۚ;->ܿ:[C

    move v3, v0

    :goto_0
    if-ge v3, v1, :cond_0

    .line 421
    aget-char v4, v2, v3

    if-eqz v4, :cond_0

    const/16 v5, 0x26

    if-eq v4, v5, :cond_0

    const/16 v5, 0x3c

    if-eq v4, v5, :cond_0

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 430
    :cond_0
    iput v3, p0, Ll/ᩳۚۚ;->ܽ:I

    if-le v3, v0, :cond_1

    .line 431
    iget-object v1, p0, Ll/ᩳۚۚ;->ܿ:[C

    iget-object v2, p0, Ll/ᩳۚۚ;->ۖ:[Ljava/lang/String;

    sub-int/2addr v3, v0

    invoke-static {v1, v2, v0, v3}, Ll/ᩳۚۚ;->֫([C[Ljava/lang/String;II)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_1
    const-string v0, ""

    return-object v0
.end method

.method public final ᩳ([C)Z
    .locals 2

    .line 623
    invoke-direct {p0}, Ll/ᩳۚۚ;->᩹()V

    .line 624
    invoke-virtual {p0}, Ll/ᩳۚۚ;->ۘ()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Ll/ᩳۚۚ;->ܿ:[C

    iget v1, p0, Ll/ᩳۚۚ;->ܽ:I

    aget-char v0, v0, v1

    invoke-static {p1, v0}, Ljava/util/Arrays;->binarySearch([CC)I

    move-result p1

    if-ltz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ᩴ()V
    .locals 2

    .line 276
    iget v0, p0, Ll/ᩳۚۚ;->֫:I

    iget v1, p0, Ll/ᩳۚۚ;->ܽ:I

    sub-int/2addr v0, v1

    const/16 v1, 0x400

    if-ge v0, v1, :cond_0

    const/4 v0, 0x0

    .line 277
    iput v0, p0, Ll/ᩳۚۚ;->ᩳ:I

    .line 279
    :cond_0
    invoke-direct {p0}, Ll/ᩳۚۚ;->᩹()V

    .line 280
    iget v0, p0, Ll/ᩳۚۚ;->ܽ:I

    iput v0, p0, Ll/ᩳۚۚ;->ۧ:I

    return-void
.end method

.method public final ᩵()Z
    .locals 3

    .line 639
    invoke-virtual {p0}, Ll/ᩳۚۚ;->ۘ()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    .line 641
    :cond_0
    iget-object v0, p0, Ll/ᩳۚۚ;->ܿ:[C

    iget v2, p0, Ll/ᩳۚۚ;->ܽ:I

    aget-char v0, v0, v2

    const/16 v2, 0x41

    if-lt v0, v2, :cond_1

    const/16 v2, 0x5a

    if-le v0, v2, :cond_2

    :cond_1
    const/16 v2, 0x61

    if-lt v0, v2, :cond_3

    const/16 v2, 0x7a

    if-gt v0, v2, :cond_3

    :cond_2
    const/4 v0, 0x1

    return v0

    :cond_3
    return v1
.end method

.method public final ᩷()Ljava/lang/String;
    .locals 6

    .line 463
    iget v0, p0, Ll/ᩳۚۚ;->ܽ:I

    .line 465
    iget v1, p0, Ll/ᩳۚۚ;->֫:I

    .line 466
    iget-object v2, p0, Ll/ᩳۚۚ;->ܿ:[C

    move v3, v0

    :goto_0
    if-ge v3, v1, :cond_0

    .line 469
    aget-char v4, v2, v3

    if-eqz v4, :cond_0

    const/16 v5, 0x3c

    if-eq v4, v5, :cond_0

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 477
    :cond_0
    iput v3, p0, Ll/ᩳۚۚ;->ܽ:I

    if-le v3, v0, :cond_1

    .line 478
    iget-object v1, p0, Ll/ᩳۚۚ;->ܿ:[C

    iget-object v2, p0, Ll/ᩳۚۚ;->ۖ:[Ljava/lang/String;

    sub-int/2addr v3, v0

    invoke-static {v1, v2, v0, v3}, Ll/ᩳۚۚ;->֫([C[Ljava/lang/String;II)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_1
    const-string v0, ""

    return-object v0
.end method

.method public final ᩸()V
    .locals 1

    const/4 v0, -0x1

    .line 284
    iput v0, p0, Ll/ᩳۚۚ;->ۧ:I

    return-void
.end method

.method public final ᩻()Ljava/lang/String;
    .locals 4

    .line 517
    invoke-direct {p0}, Ll/ᩳۚۚ;->᩹()V

    .line 518
    iget v0, p0, Ll/ᩳۚۚ;->ܽ:I

    .line 519
    :goto_0
    iget v1, p0, Ll/ᩳۚۚ;->ܽ:I

    iget v2, p0, Ll/ᩳۚۚ;->֫:I

    if-ge v1, v2, :cond_3

    .line 520
    iget-object v2, p0, Ll/ᩳۚۚ;->ܿ:[C

    aget-char v1, v2, v1

    const/16 v2, 0x41

    if-lt v1, v2, :cond_0

    const/16 v2, 0x5a

    if-le v1, v2, :cond_2

    :cond_0
    const/16 v2, 0x61

    if-lt v1, v2, :cond_1

    const/16 v2, 0x7a

    if-le v1, v2, :cond_2

    .line 521
    :cond_1
    invoke-static {v1}, Ljava/lang/Character;->isLetter(C)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 522
    :cond_2
    iget v1, p0, Ll/ᩳۚۚ;->ܽ:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Ll/ᩳۚۚ;->ܽ:I

    goto :goto_0

    .line 527
    :cond_3
    iget-object v1, p0, Ll/ᩳۚۚ;->ܿ:[C

    iget-object v2, p0, Ll/ᩳۚۚ;->ۖ:[Ljava/lang/String;

    iget v3, p0, Ll/ᩳۚۚ;->ܽ:I

    sub-int/2addr v3, v0

    invoke-static {v1, v2, v0, v3}, Ll/ᩳۚۚ;->֫([C[Ljava/lang/String;II)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
