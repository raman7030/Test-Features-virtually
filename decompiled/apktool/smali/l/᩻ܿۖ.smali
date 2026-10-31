.class public final Ll/᩻ܿۖ;
.super Ljava/util/AbstractMap;
.source "1AZL"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field public static final ۛ:Ljava/util/Comparator;


# instance fields
.field public ۗ:Ll/ᩳܿۖ;

.field public final ۙ:Ll/ܳܿۖ;

.field public ۤ:I

.field public ۫:Ll/ܳܿۖ;

.field public ۬:I

.field public ᩶:Ll/ۧܿۖ;

.field public final ᩸:Z

.field public final ᩹:Ljava/util/Comparator;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 46
    new-instance v0, Ll/۟ᩳۖ;

    .line 47
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 46
    sput-object v0, Ll/᩻ܿۖ;->ۛ:Ljava/util/Comparator;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    .line 69
    invoke-direct {p0, v0}, Ll/᩻ܿۖ;-><init>(Z)V

    return-void
.end method

.method public constructor <init>(Z)V
    .locals 1

    .line 92
    invoke-direct {p0}, Ljava/util/AbstractMap;-><init>()V

    const/4 v0, 0x0

    .line 57
    iput v0, p0, Ll/᩻ܿۖ;->ۤ:I

    .line 58
    iput v0, p0, Ll/᩻ܿۖ;->۬:I

    .line 93
    sget-object v0, Ll/᩻ܿۖ;->ۛ:Ljava/util/Comparator;

    iput-object v0, p0, Ll/᩻ܿۖ;->᩹:Ljava/util/Comparator;

    .line 94
    iput-boolean p1, p0, Ll/᩻ܿۖ;->᩸:Z

    .line 95
    new-instance v0, Ll/ܳܿۖ;

    invoke-direct {v0, p1}, Ll/ܳܿۖ;-><init>(Z)V

    iput-object v0, p0, Ll/᩻ܿۖ;->ۙ:Ll/ܳܿۖ;

    return-void
.end method

.method private readObject(Ljava/io/ObjectInputStream;)V
    .locals 1

    .line 685
    new-instance p1, Ljava/io/InvalidObjectException;

    const-string v0, "Deserialization is unsupported"

    invoke-direct {p1, v0}, Ljava/io/InvalidObjectException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private writeReplace()Ljava/lang/Object;
    .locals 1

    .line 679
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0, p0}, Ljava/util/LinkedHashMap;-><init>(Ljava/util/Map;)V

    return-object v0
.end method

.method private ֫(Ll/ܳܿۖ;)V
    .locals 5

    .line 400
    iget-object v0, p1, Ll/ܳܿۖ;->ۙ:Ll/ܳܿۖ;

    .line 401
    iget-object v1, p1, Ll/ܳܿۖ;->ۤ:Ll/ܳܿۖ;

    .line 402
    iget-object v2, v1, Ll/ܳܿۖ;->ۙ:Ll/ܳܿۖ;

    .line 403
    iget-object v3, v1, Ll/ܳܿۖ;->ۤ:Ll/ܳܿۖ;

    .line 406
    iput-object v2, p1, Ll/ܳܿۖ;->ۤ:Ll/ܳܿۖ;

    if-eqz v2, :cond_0

    .line 408
    iput-object p1, v2, Ll/ܳܿۖ;->۬:Ll/ܳܿۖ;

    .line 411
    :cond_0
    invoke-direct {p0, p1, v1}, Ll/᩻ܿۖ;->֫(Ll/ܳܿۖ;Ll/ܳܿۖ;)V

    .line 414
    iput-object p1, v1, Ll/ܳܿۖ;->ۙ:Ll/ܳܿۖ;

    .line 415
    iput-object v1, p1, Ll/ܳܿۖ;->۬:Ll/ܳܿۖ;

    const/4 v4, 0x0

    if-eqz v0, :cond_1

    .line 419
    iget v0, v0, Ll/ܳܿۖ;->᩹:I

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    if-eqz v2, :cond_2

    iget v2, v2, Ll/ܳܿۖ;->᩹:I

    goto :goto_1

    :cond_2
    const/4 v2, 0x0

    :goto_1
    invoke-static {v0, v2}, Ljava/lang/Math;->max(II)I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    iput v0, p1, Ll/ܳܿۖ;->᩹:I

    if-eqz v3, :cond_3

    .line 420
    iget v4, v3, Ll/ܳܿۖ;->᩹:I

    :cond_3
    invoke-static {v0, v4}, Ljava/lang/Math;->max(II)I

    move-result p1

    add-int/lit8 p1, p1, 0x1

    iput p1, v1, Ll/ܳܿۖ;->᩹:I

    return-void
.end method

.method private ֫(Ll/ܳܿۖ;Ll/ܳܿۖ;)V
    .locals 2

    .line 314
    iget-object v0, p1, Ll/ܳܿۖ;->۬:Ll/ܳܿۖ;

    const/4 v1, 0x0

    .line 315
    iput-object v1, p1, Ll/ܳܿۖ;->۬:Ll/ܳܿۖ;

    if-eqz p2, :cond_0

    .line 317
    iput-object v0, p2, Ll/ܳܿۖ;->۬:Ll/ܳܿۖ;

    :cond_0
    if-eqz v0, :cond_2

    .line 321
    iget-object v1, v0, Ll/ܳܿۖ;->ۙ:Ll/ܳܿۖ;

    if-ne v1, p1, :cond_1

    .line 322
    iput-object p2, v0, Ll/ܳܿۖ;->ۙ:Ll/ܳܿۖ;

    return-void

    .line 325
    :cond_1
    iput-object p2, v0, Ll/ܳܿۖ;->ۤ:Ll/ܳܿۖ;

    return-void

    .line 328
    :cond_2
    iput-object p2, p0, Ll/᩻ܿۖ;->۫:Ll/ܳܿۖ;

    return-void
.end method

.method private ۧ(Ll/ܳܿۖ;)V
    .locals 5

    .line 425
    iget-object v0, p1, Ll/ܳܿۖ;->ۙ:Ll/ܳܿۖ;

    .line 426
    iget-object v1, p1, Ll/ܳܿۖ;->ۤ:Ll/ܳܿۖ;

    .line 427
    iget-object v2, v0, Ll/ܳܿۖ;->ۙ:Ll/ܳܿۖ;

    .line 428
    iget-object v3, v0, Ll/ܳܿۖ;->ۤ:Ll/ܳܿۖ;

    .line 431
    iput-object v3, p1, Ll/ܳܿۖ;->ۙ:Ll/ܳܿۖ;

    if-eqz v3, :cond_0

    .line 433
    iput-object p1, v3, Ll/ܳܿۖ;->۬:Ll/ܳܿۖ;

    .line 436
    :cond_0
    invoke-direct {p0, p1, v0}, Ll/᩻ܿۖ;->֫(Ll/ܳܿۖ;Ll/ܳܿۖ;)V

    .line 439
    iput-object p1, v0, Ll/ܳܿۖ;->ۤ:Ll/ܳܿۖ;

    .line 440
    iput-object v0, p1, Ll/ܳܿۖ;->۬:Ll/ܳܿۖ;

    const/4 v4, 0x0

    if-eqz v1, :cond_1

    .line 444
    iget v1, v1, Ll/ܳܿۖ;->᩹:I

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    if-eqz v3, :cond_2

    iget v3, v3, Ll/ܳܿۖ;->᩹:I

    goto :goto_1

    :cond_2
    const/4 v3, 0x0

    :goto_1
    invoke-static {v1, v3}, Ljava/lang/Math;->max(II)I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    iput v1, p1, Ll/ܳܿۖ;->᩹:I

    if-eqz v2, :cond_3

    .line 445
    iget v4, v2, Ll/ܳܿۖ;->᩹:I

    :cond_3
    invoke-static {v1, v4}, Ljava/lang/Math;->max(II)I

    move-result p1

    add-int/lit8 p1, p1, 0x1

    iput p1, v0, Ll/ܳܿۖ;->᩹:I

    return-void
.end method

.method private ۧ(Ll/ܳܿۖ;Z)V
    .locals 7

    :goto_0
    if-eqz p1, :cond_e

    .line 340
    iget-object v0, p1, Ll/ܳܿۖ;->ۙ:Ll/ܳܿۖ;

    .line 341
    iget-object v1, p1, Ll/ܳܿۖ;->ۤ:Ll/ܳܿۖ;

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    .line 342
    iget v3, v0, Ll/ܳܿۖ;->᩹:I

    goto :goto_1

    :cond_0
    const/4 v3, 0x0

    :goto_1
    if-eqz v1, :cond_1

    .line 343
    iget v4, v1, Ll/ܳܿۖ;->᩹:I

    goto :goto_2

    :cond_1
    const/4 v4, 0x0

    :goto_2
    sub-int v5, v3, v4

    const/4 v6, -0x2

    if-ne v5, v6, :cond_6

    .line 347
    iget-object v0, v1, Ll/ܳܿۖ;->ۙ:Ll/ܳܿۖ;

    .line 348
    iget-object v3, v1, Ll/ܳܿۖ;->ۤ:Ll/ܳܿۖ;

    if-eqz v3, :cond_2

    .line 349
    iget v3, v3, Ll/ܳܿۖ;->᩹:I

    goto :goto_3

    :cond_2
    const/4 v3, 0x0

    :goto_3
    if-eqz v0, :cond_3

    .line 350
    iget v2, v0, Ll/ܳܿۖ;->᩹:I

    :cond_3
    sub-int/2addr v2, v3

    const/4 v0, -0x1

    if-eq v2, v0, :cond_5

    if-nez v2, :cond_4

    if-nez p2, :cond_4

    goto :goto_4

    .line 357
    :cond_4
    invoke-direct {p0, v1}, Ll/᩻ܿۖ;->ۧ(Ll/ܳܿۖ;)V

    .line 358
    invoke-direct {p0, p1}, Ll/᩻ܿۖ;->֫(Ll/ܳܿۖ;)V

    goto :goto_5

    .line 354
    :cond_5
    :goto_4
    invoke-direct {p0, p1}, Ll/᩻ܿۖ;->֫(Ll/ܳܿۖ;)V

    :goto_5
    if-eqz p2, :cond_d

    goto :goto_9

    :cond_6
    const/4 v1, 0x2

    const/4 v6, 0x1

    if-ne v5, v1, :cond_b

    .line 365
    iget-object v1, v0, Ll/ܳܿۖ;->ۙ:Ll/ܳܿۖ;

    .line 366
    iget-object v3, v0, Ll/ܳܿۖ;->ۤ:Ll/ܳܿۖ;

    if-eqz v3, :cond_7

    .line 367
    iget v3, v3, Ll/ܳܿۖ;->᩹:I

    goto :goto_6

    :cond_7
    const/4 v3, 0x0

    :goto_6
    if-eqz v1, :cond_8

    .line 368
    iget v2, v1, Ll/ܳܿۖ;->᩹:I

    :cond_8
    sub-int/2addr v2, v3

    if-eq v2, v6, :cond_a

    if-nez v2, :cond_9

    if-nez p2, :cond_9

    goto :goto_7

    .line 375
    :cond_9
    invoke-direct {p0, v0}, Ll/᩻ܿۖ;->֫(Ll/ܳܿۖ;)V

    .line 376
    invoke-direct {p0, p1}, Ll/᩻ܿۖ;->ۧ(Ll/ܳܿۖ;)V

    goto :goto_8

    .line 372
    :cond_a
    :goto_7
    invoke-direct {p0, p1}, Ll/᩻ܿۖ;->ۧ(Ll/ܳܿۖ;)V

    :goto_8
    if-eqz p2, :cond_d

    goto :goto_9

    :cond_b
    if-nez v5, :cond_c

    add-int/lit8 v3, v3, 0x1

    .line 383
    iput v3, p1, Ll/ܳܿۖ;->᩹:I

    if-eqz p2, :cond_d

    goto :goto_9

    .line 390
    :cond_c
    invoke-static {v3, v4}, Ljava/lang/Math;->max(II)I

    move-result v0

    add-int/2addr v0, v6

    iput v0, p1, Ll/ܳܿۖ;->᩹:I

    if-nez p2, :cond_d

    goto :goto_9

    .line 339
    :cond_d
    iget-object p1, p1, Ll/ܳܿۖ;->۬:Ll/ܳܿۖ;

    goto :goto_0

    :cond_e
    :goto_9
    return-void
.end method


# virtual methods
.method public final clear()V
    .locals 1

    const/4 v0, 0x0

    .line 131
    iput-object v0, p0, Ll/᩻ܿۖ;->۫:Ll/ܳܿۖ;

    const/4 v0, 0x0

    .line 132
    iput v0, p0, Ll/᩻ܿۖ;->ۤ:I

    .line 133
    iget v0, p0, Ll/᩻ܿۖ;->۬:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Ll/᩻ܿۖ;->۬:I

    .line 137
    iget-object v0, p0, Ll/᩻ܿۖ;->ۙ:Ll/ܳܿۖ;

    iput-object v0, v0, Ll/ܳܿۖ;->۫:Ll/ܳܿۖ;

    iput-object v0, v0, Ll/ܳܿۖ;->ۗ:Ll/ܳܿۖ;

    return-void
.end method

.method public final containsKey(Ljava/lang/Object;)Z
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    .line 216
    :try_start_0
    invoke-virtual {p0, p1, v0}, Ll/᩻ܿۖ;->֫(Ljava/lang/Object;Z)Ll/ܳܿۖ;

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    nop

    :cond_0
    :goto_0
    if-eqz v1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    return v0
.end method

.method public final entrySet()Ljava/util/Set;
    .locals 1

    .line 453
    iget-object v0, p0, Ll/᩻ܿۖ;->᩶:Ll/ۧܿۖ;

    if-nez v0, :cond_0

    .line 455
    new-instance v0, Ll/ۧܿۖ;

    invoke-direct {v0, p0}, Ll/ۧܿۖ;-><init>(Ll/᩻ܿۖ;)V

    iput-object v0, p0, Ll/᩻ܿۖ;->᩶:Ll/ۧܿۖ;

    :cond_0
    return-object v0
.end method

.method public final get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    const/4 v1, 0x0

    .line 216
    :try_start_0
    invoke-virtual {p0, p1, v1}, Ll/᩻ܿۖ;->֫(Ljava/lang/Object;Z)Ll/ܳܿۖ;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    :cond_0
    move-object p1, v0

    :goto_0
    if-eqz p1, :cond_1

    .line 106
    iget-object p1, p1, Ll/ܳܿۖ;->ۛ:Ljava/lang/Object;

    return-object p1

    :cond_1
    return-object v0
.end method

.method public final keySet()Ljava/util/Set;
    .locals 1

    .line 462
    iget-object v0, p0, Ll/᩻ܿۖ;->ۗ:Ll/ᩳܿۖ;

    if-nez v0, :cond_0

    .line 464
    new-instance v0, Ll/ᩳܿۖ;

    invoke-direct {v0, p0}, Ll/ᩳܿۖ;-><init>(Ll/᩻ܿۖ;)V

    iput-object v0, p0, Ll/᩻ܿۖ;->ۗ:Ll/ᩳܿۖ;

    :cond_0
    return-object v0
.end method

.method public final put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    if-eqz p1, :cond_2

    if-nez p2, :cond_1

    .line 120
    iget-boolean v0, p0, Ll/᩻ܿۖ;->᩸:Z

    if-eqz v0, :cond_0

    goto :goto_0

    .line 121
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "value == null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 123
    invoke-virtual {p0, p1, v0}, Ll/᩻ܿۖ;->֫(Ljava/lang/Object;Z)Ll/ܳܿۖ;

    move-result-object p1

    .line 124
    iget-object v0, p1, Ll/ܳܿۖ;->ۛ:Ljava/lang/Object;

    .line 125
    iput-object p2, p1, Ll/ܳܿۖ;->ۛ:Ljava/lang/Object;

    return-object v0

    .line 118
    :cond_2
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "key == null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final remove(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    const/4 v1, 0x0

    .line 216
    :try_start_0
    invoke-virtual {p0, p1, v1}, Ll/᩻ܿۖ;->֫(Ljava/lang/Object;Z)Ll/ܳܿۖ;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    :cond_0
    move-object p1, v0

    :goto_0
    if-eqz p1, :cond_1

    const/4 v1, 0x1

    .line 307
    invoke-virtual {p0, p1, v1}, Ll/᩻ܿۖ;->֫(Ll/ܳܿۖ;Z)V

    :cond_1
    if-eqz p1, :cond_2

    .line 143
    iget-object p1, p1, Ll/ܳܿۖ;->ۛ:Ljava/lang/Object;

    return-object p1

    :cond_2
    return-object v0
.end method

.method public final size()I
    .locals 1

    .line 100
    iget v0, p0, Ll/᩻ܿۖ;->ۤ:I

    return v0
.end method

.method public final ֫(Ljava/lang/Object;Z)Ll/ܳܿۖ;
    .locals 12

    .line 153
    iget-object v0, p0, Ll/᩻ܿۖ;->۫:Ll/ܳܿۖ;

    const/4 v1, 0x0

    .line 156
    sget-object v2, Ll/᩻ܿۖ;->ۛ:Ljava/util/Comparator;

    iget-object v3, p0, Ll/᩻ܿۖ;->᩹:Ljava/util/Comparator;

    if-eqz v0, :cond_5

    if-ne v3, v2, :cond_0

    .line 160
    move-object v4, p1

    check-cast v4, Ljava/lang/Comparable;

    goto :goto_0

    :cond_0
    move-object v4, v1

    .line 164
    :goto_0
    iget-object v5, v0, Ll/ܳܿۖ;->᩶:Ljava/lang/Object;

    if-eqz v4, :cond_1

    .line 165
    invoke-interface {v4, v5}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    move-result v5

    goto :goto_1

    .line 166
    :cond_1
    invoke-interface {v3, p1, v5}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v5

    :goto_1
    if-nez v5, :cond_2

    return-object v0

    :cond_2
    if-gez v5, :cond_3

    .line 174
    iget-object v6, v0, Ll/ܳܿۖ;->ۙ:Ll/ܳܿۖ;

    goto :goto_2

    :cond_3
    iget-object v6, v0, Ll/ܳܿۖ;->ۤ:Ll/ܳܿۖ;

    :goto_2
    if-nez v6, :cond_4

    goto :goto_3

    :cond_4
    move-object v0, v6

    goto :goto_0

    :cond_5
    const/4 v5, 0x0

    :goto_3
    if-nez p2, :cond_6

    return-object v1

    :cond_6
    const/4 p2, 0x1

    .line 191
    iget-object v10, p0, Ll/᩻ܿۖ;->ۙ:Ll/ܳܿۖ;

    if-nez v0, :cond_9

    if-ne v3, v2, :cond_8

    .line 193
    instance-of v1, p1, Ljava/lang/Comparable;

    if-eqz v1, :cond_7

    goto :goto_4

    .line 194
    :cond_7
    new-instance p2, Ljava/lang/ClassCastException;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    const-string v0, " is not Comparable"

    invoke-virtual {p1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/ClassCastException;-><init>(Ljava/lang/String;)V

    throw p2

    .line 196
    :cond_8
    :goto_4
    new-instance v1, Ll/ܳܿۖ;

    iget-boolean v7, p0, Ll/᩻ܿۖ;->᩸:Z

    iget-object v11, v10, Ll/ܳܿۖ;->۫:Ll/ܳܿۖ;

    move-object v6, v1

    move-object v8, v0

    move-object v9, p1

    invoke-direct/range {v6 .. v11}, Ll/ܳܿۖ;-><init>(ZLl/ܳܿۖ;Ljava/lang/Object;Ll/ܳܿۖ;Ll/ܳܿۖ;)V

    .line 197
    iput-object v1, p0, Ll/᩻ܿۖ;->۫:Ll/ܳܿۖ;

    goto :goto_6

    .line 199
    :cond_9
    new-instance v1, Ll/ܳܿۖ;

    iget-boolean v7, p0, Ll/᩻ܿۖ;->᩸:Z

    iget-object v11, v10, Ll/ܳܿۖ;->۫:Ll/ܳܿۖ;

    move-object v6, v1

    move-object v8, v0

    move-object v9, p1

    invoke-direct/range {v6 .. v11}, Ll/ܳܿۖ;-><init>(ZLl/ܳܿۖ;Ljava/lang/Object;Ll/ܳܿۖ;Ll/ܳܿۖ;)V

    if-gez v5, :cond_a

    .line 201
    iput-object v1, v0, Ll/ܳܿۖ;->ۙ:Ll/ܳܿۖ;

    goto :goto_5

    .line 203
    :cond_a
    iput-object v1, v0, Ll/ܳܿۖ;->ۤ:Ll/ܳܿۖ;

    .line 205
    :goto_5
    invoke-direct {p0, v0, p2}, Ll/᩻ܿۖ;->ۧ(Ll/ܳܿۖ;Z)V

    .line 207
    :goto_6
    iget p1, p0, Ll/᩻ܿۖ;->ۤ:I

    add-int/2addr p1, p2

    iput p1, p0, Ll/᩻ܿۖ;->ۤ:I

    .line 208
    iget p1, p0, Ll/᩻ܿۖ;->۬:I

    add-int/2addr p1, p2

    iput p1, p0, Ll/᩻ܿۖ;->۬:I

    return-object v1
.end method

.method public final ֫(Ll/ܳܿۖ;Z)V
    .locals 6

    if-eqz p2, :cond_0

    .line 247
    iget-object p2, p1, Ll/ܳܿۖ;->۫:Ll/ܳܿۖ;

    iget-object v0, p1, Ll/ܳܿۖ;->ۗ:Ll/ܳܿۖ;

    iput-object v0, p2, Ll/ܳܿۖ;->ۗ:Ll/ܳܿۖ;

    .line 248
    iget-object v0, p1, Ll/ܳܿۖ;->ۗ:Ll/ܳܿۖ;

    iput-object p2, v0, Ll/ܳܿۖ;->۫:Ll/ܳܿۖ;

    .line 251
    :cond_0
    iget-object p2, p1, Ll/ܳܿۖ;->ۙ:Ll/ܳܿۖ;

    .line 252
    iget-object v0, p1, Ll/ܳܿۖ;->ۤ:Ll/ܳܿۖ;

    .line 253
    iget-object v1, p1, Ll/ܳܿۖ;->۬:Ll/ܳܿۖ;

    const/4 v2, 0x0

    const/4 v3, 0x0

    if-eqz p2, :cond_5

    if-eqz v0, :cond_5

    .line 265
    iget v1, p2, Ll/ܳܿۖ;->᩹:I

    iget v4, v0, Ll/ܳܿۖ;->᩹:I

    if-le v1, v4, :cond_1

    .line 553
    iget-object v0, p2, Ll/ܳܿۖ;->ۤ:Ll/ܳܿۖ;

    :goto_0
    move-object v5, v0

    move-object v0, p2

    move-object p2, v5

    if-eqz p2, :cond_2

    .line 556
    iget-object v0, p2, Ll/ܳܿۖ;->ۤ:Ll/ܳܿۖ;

    goto :goto_0

    .line 542
    :cond_1
    iget-object p2, v0, Ll/ܳܿۖ;->ۙ:Ll/ܳܿۖ;

    :goto_1
    if-eqz p2, :cond_2

    .line 545
    iget-object v0, p2, Ll/ܳܿۖ;->ۙ:Ll/ܳܿۖ;

    move-object v5, v0

    move-object v0, p2

    move-object p2, v5

    goto :goto_1

    .line 266
    :cond_2
    invoke-virtual {p0, v0, v2}, Ll/᩻ܿۖ;->֫(Ll/ܳܿۖ;Z)V

    .line 269
    iget-object p2, p1, Ll/ܳܿۖ;->ۙ:Ll/ܳܿۖ;

    if-eqz p2, :cond_3

    .line 271
    iget v1, p2, Ll/ܳܿۖ;->᩹:I

    .line 272
    iput-object p2, v0, Ll/ܳܿۖ;->ۙ:Ll/ܳܿۖ;

    .line 273
    iput-object v0, p2, Ll/ܳܿۖ;->۬:Ll/ܳܿۖ;

    .line 274
    iput-object v3, p1, Ll/ܳܿۖ;->ۙ:Ll/ܳܿۖ;

    goto :goto_2

    :cond_3
    const/4 v1, 0x0

    .line 278
    :goto_2
    iget-object p2, p1, Ll/ܳܿۖ;->ۤ:Ll/ܳܿۖ;

    if-eqz p2, :cond_4

    .line 280
    iget v2, p2, Ll/ܳܿۖ;->᩹:I

    .line 281
    iput-object p2, v0, Ll/ܳܿۖ;->ۤ:Ll/ܳܿۖ;

    .line 282
    iput-object v0, p2, Ll/ܳܿۖ;->۬:Ll/ܳܿۖ;

    .line 283
    iput-object v3, p1, Ll/ܳܿۖ;->ۤ:Ll/ܳܿۖ;

    .line 286
    :cond_4
    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result p2

    add-int/lit8 p2, p2, 0x1

    iput p2, v0, Ll/ܳܿۖ;->᩹:I

    .line 287
    invoke-direct {p0, p1, v0}, Ll/᩻ܿۖ;->֫(Ll/ܳܿۖ;Ll/ܳܿۖ;)V

    return-void

    :cond_5
    if-eqz p2, :cond_6

    .line 290
    invoke-direct {p0, p1, p2}, Ll/᩻ܿۖ;->֫(Ll/ܳܿۖ;Ll/ܳܿۖ;)V

    .line 291
    iput-object v3, p1, Ll/ܳܿۖ;->ۙ:Ll/ܳܿۖ;

    goto :goto_3

    :cond_6
    if-eqz v0, :cond_7

    .line 293
    invoke-direct {p0, p1, v0}, Ll/᩻ܿۖ;->֫(Ll/ܳܿۖ;Ll/ܳܿۖ;)V

    .line 294
    iput-object v3, p1, Ll/ܳܿۖ;->ۤ:Ll/ܳܿۖ;

    goto :goto_3

    .line 296
    :cond_7
    invoke-direct {p0, p1, v3}, Ll/᩻ܿۖ;->֫(Ll/ܳܿۖ;Ll/ܳܿۖ;)V

    .line 299
    :goto_3
    invoke-direct {p0, v1, v2}, Ll/᩻ܿۖ;->ۧ(Ll/ܳܿۖ;Z)V

    .line 300
    iget p1, p0, Ll/᩻ܿۖ;->ۤ:I

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, Ll/᩻ܿۖ;->ۤ:I

    .line 301
    iget p1, p0, Ll/᩻ܿۖ;->۬:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Ll/᩻ܿۖ;->۬:I

    return-void
.end method
