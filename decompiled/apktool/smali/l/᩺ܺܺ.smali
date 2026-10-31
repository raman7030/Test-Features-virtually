.class public final Ll/᩺ܺܺ;
.super Ljava/lang/Object;
.source "7BE0"

# interfaces
.implements Ljava/lang/Comparable;


# static fields
.field public static final synthetic ۗ:I

.field public static final ۬:Ll/ۧۤᩴ;


# instance fields
.field public final ۙ:Ll/۟ܺܺ;

.field public final ᩶:Ll/ܰܺܺ;

.field public final ᩸:Ljava/lang/String;

.field public ᩹:Ll/ܰܺܺ;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 33
    new-instance v0, Ll/ۧۤᩴ;

    const/16 v1, 0x2710

    const/high16 v2, 0x3f400000    # 0.75f

    invoke-direct {v0, v1, v2}, Ll/ۧۤᩴ;-><init>(IF)V

    sput-object v0, Ll/᩺ܺܺ;->۬:Ll/ۧۤᩴ;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ll/۟ܺܺ;Ll/ܰܺܺ;)V
    .locals 0

    .line 251
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_1

    if-eqz p2, :cond_0

    .line 264
    iput-object p1, p0, Ll/᩺ܺܺ;->᩸:Ljava/lang/String;

    .line 265
    iput-object p2, p0, Ll/᩺ܺܺ;->ۙ:Ll/۟ܺܺ;

    .line 266
    iput-object p3, p0, Ll/᩺ܺܺ;->᩶:Ll/ܰܺܺ;

    const/4 p1, 0x0

    .line 267
    iput-object p1, p0, Ll/᩺ܺܺ;->᩹:Ll/ܰܺܺ;

    return-void

    .line 257
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "returnType == null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 253
    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "descriptor == null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static ֫(Ljava/lang/String;)Ll/᩺ܺܺ;
    .locals 10

    .line 93
    sget-object v0, Ll/᩺ܺܺ;->۬:Ll/ۧۤᩴ;

    invoke-virtual {v0, p0}, Ll/ۧۤᩴ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩺ܺܺ;

    if-eqz v0, :cond_0

    return-object v0

    .line 157
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    .line 159
    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/16 v3, 0x28

    const-string v4, "bad descriptor"

    if-ne v2, v3, :cond_c

    const/4 v2, 0x1

    const/4 v3, 0x0

    :goto_0
    const/16 v5, 0x29

    if-ge v2, v0, :cond_3

    .line 170
    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v6

    if-ne v6, v5, :cond_1

    goto :goto_1

    :cond_1
    const/16 v5, 0x41

    if-lt v6, v5, :cond_2

    const/16 v5, 0x5a

    if-gt v6, v5, :cond_2

    add-int/lit8 v3, v3, 0x1

    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_3
    const/4 v2, 0x0

    :goto_1
    if-eqz v2, :cond_b

    add-int/lit8 v0, v0, -0x1

    if-eq v2, v0, :cond_b

    add-int/lit8 v2, v2, 0x1

    .line 184
    invoke-virtual {p0, v5, v2}, Ljava/lang/String;->indexOf(II)I

    move-result v0

    const/4 v2, -0x1

    if-ne v0, v2, :cond_a

    .line 188
    new-array v0, v3, [Ll/۟ܺܺ;

    const/4 v3, 0x1

    const/4 v6, 0x0

    .line 104
    :goto_2
    invoke-virtual {p0, v3}, Ljava/lang/String;->charAt(I)C

    move-result v7

    if-ne v7, v5, :cond_6

    add-int/lit8 v3, v3, 0x1

    .line 132
    invoke-virtual {p0, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v2

    sget-object v3, Ll/۟ܺܺ;->ۤ:Ll/۟ܺܺ;

    :try_start_0
    const-string v3, "V"

    .line 514
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    .line 516
    sget-object v2, Ll/۟ܺܺ;->ۨ֫:Ll/۟ܺܺ;
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3

    .line 523
    :cond_4
    invoke-static {v2}, Ll/۟ܺܺ;->֫(Ljava/lang/String;)Ll/۟ܺܺ;

    move-result-object v2

    .line 133
    :goto_3
    new-instance v3, Ll/ܰܺܺ;

    .line 404
    invoke-direct {v3, v6}, Ll/ܿᩴܺ;-><init>(I)V

    :goto_4
    if-ge v1, v6, :cond_5

    .line 136
    aget-object v4, v0, v1

    invoke-virtual {v3, v1, v4}, Ll/ܿᩴܺ;->֫(ILl/۟ܺܺ;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_4

    .line 139
    :cond_5
    new-instance v0, Ll/᩺ܺܺ;

    invoke-direct {v0, p0, v2, v3}, Ll/᩺ܺܺ;-><init>(Ljava/lang/String;Ll/۟ܺܺ;Ll/ܰܺܺ;)V

    return-object v0

    .line 520
    :catch_0
    new-instance p0, Ljava/lang/NullPointerException;

    const-string v0, "descriptor == null"

    invoke-direct {p0, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_6
    move v8, v3

    :goto_5
    const/16 v9, 0x5b

    if-ne v7, v9, :cond_7

    add-int/lit8 v8, v8, 0x1

    .line 113
    invoke-virtual {p0, v8}, Ljava/lang/String;->charAt(I)C

    move-result v7

    goto :goto_5

    :cond_7
    const/16 v9, 0x4c

    if-ne v7, v9, :cond_9

    const/16 v7, 0x3b

    .line 118
    invoke-virtual {p0, v7, v8}, Ljava/lang/String;->indexOf(II)I

    move-result v7

    if-eq v7, v2, :cond_8

    add-int/lit8 v7, v7, 0x1

    goto :goto_6

    .line 120
    :cond_8
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0, v4}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_9
    add-int/lit8 v8, v8, 0x1

    move v7, v8

    .line 128
    :goto_6
    invoke-virtual {p0, v3, v7}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ll/۟ܺܺ;->֫(Ljava/lang/String;)Ll/۟ܺܺ;

    move-result-object v3

    aput-object v3, v0, v6

    add-int/lit8 v6, v6, 0x1

    move v3, v7

    goto :goto_2

    .line 185
    :cond_a
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0, v4}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 181
    :cond_b
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0, v4}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 160
    :cond_c
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0, v4}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ۧ(Ljava/lang/String;)Ll/᩺ܺܺ;
    .locals 2

    if-eqz p0, :cond_2

    .line 71
    sget-object v0, Ll/᩺ܺܺ;->۬:Ll/ۧۤᩴ;

    invoke-virtual {v0, p0}, Ll/ۧۤᩴ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩺ܺܺ;

    if-eqz v1, :cond_0

    return-object v1

    .line 76
    :cond_0
    invoke-static {p0}, Ll/᩺ܺܺ;->֫(Ljava/lang/String;)Ll/᩺ܺܺ;

    move-result-object p0

    .line 357
    iget-object v1, p0, Ll/᩺ܺܺ;->᩸:Ljava/lang/String;

    .line 434
    invoke-virtual {v0, v1, p0}, Ll/ۧۤᩴ;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩺ܺܺ;

    if-eqz v0, :cond_1

    return-object v0

    :cond_1
    return-object p0

    .line 68
    :cond_2
    new-instance p0, Ljava/lang/NullPointerException;

    const-string v0, "descriptor == null"

    invoke-direct {p0, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public final bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 27
    check-cast p1, Ll/᩺ܺܺ;

    invoke-virtual {p0, p1}, Ll/᩺ܺܺ;->֫(Ll/᩺ܺܺ;)I

    move-result p1

    return p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    .line 283
    :cond_0
    instance-of v0, p1, Ll/᩺ܺܺ;

    if-nez v0, :cond_1

    const/4 p1, 0x0

    return p1

    .line 287
    :cond_1
    check-cast p1, Ll/᩺ܺܺ;

    iget-object p1, p1, Ll/᩺ܺܺ;->᩸:Ljava/lang/String;

    iget-object v0, p0, Ll/᩺ܺܺ;->᩸:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final hashCode()I
    .locals 1

    .line 295
    iget-object v0, p0, Ll/᩺ܺܺ;->᩸:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 348
    iget-object v0, p0, Ll/᩺ܺܺ;->᩸:Ljava/lang/String;

    return-object v0
.end method

.method public final ֫(Ll/᩺ܺܺ;)I
    .locals 8

    const/4 v0, 0x0

    if-ne p0, p1, :cond_0

    return v0

    .line 313
    :cond_0
    iget-object v1, p1, Ll/᩺ܺܺ;->ۙ:Ll/۟ܺܺ;

    iget-object p1, p1, Ll/᩺ܺܺ;->᩶:Ll/ܰܺܺ;

    iget-object v2, p0, Ll/᩺ܺܺ;->ۙ:Ll/۟ܺܺ;

    invoke-virtual {v2, v1}, Ll/۟ܺܺ;->֫(Ll/۟ܺܺ;)I

    move-result v1

    if-eqz v1, :cond_1

    return v1

    .line 319
    :cond_1
    iget-object v1, p0, Ll/᩺ܺܺ;->᩶:Ll/ܰܺܺ;

    invoke-virtual {v1}, Ll/ܿᩴܺ;->size()I

    move-result v2

    .line 320
    invoke-virtual {p1}, Ll/ܿᩴܺ;->size()I

    move-result v3

    .line 321
    invoke-static {v2, v3}, Ljava/lang/Math;->min(II)I

    move-result v4

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v4, :cond_3

    .line 324
    invoke-virtual {v1, v5}, Ll/ܿᩴܺ;->get(I)Ll/۟ܺܺ;

    move-result-object v6

    .line 325
    invoke-virtual {p1, v5}, Ll/ܿᩴܺ;->get(I)Ll/۟ܺܺ;

    move-result-object v7

    .line 327
    invoke-virtual {v6, v7}, Ll/۟ܺܺ;->֫(Ll/۟ܺܺ;)I

    move-result v6

    if-eqz v6, :cond_2

    return v6

    :cond_2
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_3
    if-ge v2, v3, :cond_4

    const/4 p1, -0x1

    return p1

    :cond_4
    if-le v2, v3, :cond_5

    const/4 p1, 0x1

    return p1

    :cond_5
    return v0
.end method

.method public final ֫()Ljava/lang/String;
    .locals 1

    .line 357
    iget-object v0, p0, Ll/᩺ܺܺ;->᩸:Ljava/lang/String;

    return-object v0
.end method

.method public final ֫(Ll/۟ܺܺ;)Ll/᩺ܺܺ;
    .locals 3

    .line 414
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "("

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ll/۟ܺܺ;->֡()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/᩺ܺܺ;->᩸:Ljava/lang/String;

    const/4 v2, 0x1

    .line 0
    invoke-static {v2, v1, v0}, Ll/᩶ۢۢ;->֫(ILjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    .line 415
    iget-object v1, p0, Ll/᩺ܺܺ;->᩶:Ll/ܰܺܺ;

    invoke-virtual {v1, p1}, Ll/ܰܺܺ;->ۧ(Ll/۟ܺܺ;)Ll/ܰܺܺ;

    move-result-object p1

    .line 417
    invoke-virtual {p1}, Ll/ᩴᩴܺ;->ܺ()V

    .line 419
    new-instance v1, Ll/᩺ܺܺ;

    iget-object v2, p0, Ll/᩺ܺܺ;->ۙ:Ll/۟ܺܺ;

    invoke-direct {v1, v0, v2, p1}, Ll/᩺ܺܺ;-><init>(Ljava/lang/String;Ll/۟ܺܺ;Ll/ܰܺܺ;)V

    .line 434
    sget-object p1, Ll/᩺ܺܺ;->۬:Ll/ۧۤᩴ;

    invoke-virtual {p1, v0, v1}, Ll/ۧۤᩴ;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/᩺ܺܺ;

    if-eqz p1, :cond_0

    return-object p1

    :cond_0
    return-object v1
.end method

.method public final ۘ()Ll/ܰܺܺ;
    .locals 1

    .line 375
    iget-object v0, p0, Ll/᩺ܺܺ;->᩶:Ll/ܰܺܺ;

    return-object v0
.end method

.method public final ۧ()Ll/ܰܺܺ;
    .locals 7

    .line 387
    iget-object v0, p0, Ll/᩺ܺܺ;->᩹:Ll/ܰܺܺ;

    if-nez v0, :cond_3

    .line 388
    iget-object v0, p0, Ll/᩺ܺܺ;->᩶:Ll/ܰܺܺ;

    invoke-virtual {v0}, Ll/ܿᩴܺ;->size()I

    move-result v1

    .line 389
    new-instance v2, Ll/ܰܺܺ;

    .line 404
    invoke-direct {v2, v1}, Ll/ܿᩴܺ;-><init>(I)V

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_0
    if-ge v3, v1, :cond_1

    .line 392
    invoke-virtual {v0, v3}, Ll/ܿᩴܺ;->get(I)Ll/۟ܺܺ;

    move-result-object v5

    .line 393
    invoke-virtual {v5}, Ll/۟ܺܺ;->᩸()Z

    move-result v6

    if-eqz v6, :cond_0

    .line 395
    sget-object v5, Ll/۟ܺܺ;->ܺ֫:Ll/۟ܺܺ;

    const/4 v4, 0x1

    .line 397
    :cond_0
    invoke-virtual {v2, v3, v5}, Ll/ܿᩴܺ;->֫(ILl/۟ܺܺ;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    if-eqz v4, :cond_2

    move-object v0, v2

    .line 399
    :cond_2
    iput-object v0, p0, Ll/᩺ܺܺ;->᩹:Ll/ܰܺܺ;

    .line 402
    :cond_3
    iget-object v0, p0, Ll/᩺ܺܺ;->᩹:Ll/ܰܺܺ;

    return-object v0
.end method

.method public final ᩳ()Ll/۟ܺܺ;
    .locals 1

    .line 366
    iget-object v0, p0, Ll/᩺ܺܺ;->ۙ:Ll/۟ܺܺ;

    return-object v0
.end method
