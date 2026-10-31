.class public final Ll/ۙۡܺ;
.super Ll/ᩴᩴܺ;
.source "7BAL"


# instance fields
.field public final ᩶:[Ll/᩸ۡܺ;

.field public ᩹:I


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 30
    new-instance v0, Ll/ۙۡܺ;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ll/ۙۡܺ;-><init>(I)V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 2

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 51
    :goto_0
    invoke-direct {p0, v1}, Ll/ᩴᩴܺ;-><init>(Z)V

    .line 53
    new-array p1, p1, [Ll/᩸ۡܺ;

    iput-object p1, p0, Ll/ۙۡܺ;->᩶:[Ll/᩸ۡܺ;

    .line 54
    iput v0, p0, Ll/ۙۡܺ;->᩹:I

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 6

    .line 62
    instance-of v0, p1, Ll/ۙۡܺ;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 66
    :cond_0
    check-cast p1, Ll/ۙۡܺ;

    .line 67
    iget-object v0, p1, Ll/ۙۡܺ;->᩶:[Ll/᩸ۡܺ;

    .line 68
    iget-object v2, p0, Ll/ۙۡܺ;->᩶:[Ll/᩸ۡܺ;

    array-length v3, v2

    .line 70
    array-length v4, v0

    if-ne v3, v4, :cond_6

    invoke-virtual {p0}, Ll/ۙۡܺ;->size()I

    move-result v4

    invoke-virtual {p1}, Ll/ۙۡܺ;->size()I

    move-result p1

    if-eq v4, p1, :cond_1

    goto :goto_3

    :cond_1
    const/4 p1, 0x0

    :goto_0
    if-ge p1, v3, :cond_5

    .line 75
    aget-object v4, v2, p1

    .line 76
    aget-object v5, v0, p1

    if-ne v4, v5, :cond_2

    goto :goto_1

    :cond_2
    if-eqz v4, :cond_4

    .line 82
    invoke-virtual {v4, v5}, Ll/᩸ۡܺ;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_3

    goto :goto_2

    :cond_3
    :goto_1
    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_4
    :goto_2
    return v1

    :cond_5
    const/4 p1, 0x1

    return p1

    :cond_6
    :goto_3
    return v1
.end method

.method public final get(I)Ll/᩸ۡܺ;
    .locals 1

    .line 178
    :try_start_0
    iget-object v0, p0, Ll/ۙۡܺ;->᩶:[Ll/᩸ۡܺ;

    aget-object p1, v0, p1
    :try_end_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    .line 181
    :catch_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "bogus reg"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final hashCode()I
    .locals 5

    .line 95
    iget-object v0, p0, Ll/ۙۡܺ;->᩶:[Ll/᩸ۡܺ;

    array-length v1, v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    .line 99
    aget-object v4, v0, v2

    if-nez v4, :cond_0

    const/4 v4, 0x0

    goto :goto_1

    .line 100
    :cond_0
    invoke-virtual {v4}, Ll/᩸ۡܺ;->hashCode()I

    move-result v4

    :goto_1
    mul-int/lit8 v3, v3, 0x1f

    add-int/2addr v3, v4

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return v3
.end method

.method public final size()I
    .locals 5

    .line 151
    iget v0, p0, Ll/ۙۡܺ;->᩹:I

    if-gez v0, :cond_2

    .line 154
    iget-object v0, p0, Ll/ۙۡܺ;->᩶:[Ll/᩸ۡܺ;

    array-length v1, v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    .line 158
    aget-object v4, v0, v2

    if-eqz v4, :cond_0

    add-int/lit8 v3, v3, 0x1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 163
    :cond_1
    iput v3, p0, Ll/ۙۡܺ;->᩹:I

    return v3

    :cond_2
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 7

    .line 112
    iget-object v0, p0, Ll/ۙۡܺ;->᩶:[Ll/᩸ۡܺ;

    array-length v1, v0

    .line 113
    new-instance v2, Ljava/lang/StringBuilder;

    mul-int/lit8 v3, v1, 0x19

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    const/16 v3, 0x7b

    .line 115
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_0
    if-ge v3, v1, :cond_2

    .line 119
    aget-object v5, v0, v3

    if-eqz v5, :cond_1

    if-eqz v4, :cond_0

    const-string v6, ", "

    .line 122
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_0
    const/4 v4, 0x1

    .line 126
    :goto_1
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    const/16 v0, 0x7d

    .line 130
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 131
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֨()Ll/ۙۡܺ;
    .locals 5

    .line 392
    iget-object v0, p0, Ll/ۙۡܺ;->᩶:[Ll/᩸ۡܺ;

    array-length v1, v0

    .line 393
    new-instance v2, Ll/ۙۡܺ;

    invoke-direct {v2, v1}, Ll/ۙۡܺ;-><init>(I)V

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_1

    .line 396
    aget-object v4, v0, v3

    if-eqz v4, :cond_0

    .line 398
    invoke-virtual {v2, v4}, Ll/ۙۡܺ;->ۧ(Ll/᩸ۡܺ;)V

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 402
    :cond_1
    iget v0, p0, Ll/ۙۡܺ;->᩹:I

    iput v0, v2, Ll/ۙۡܺ;->᩹:I

    return-object v2
.end method

.method public final ֫(I)Ll/ۙۡܺ;
    .locals 5

    .line 367
    iget-object v0, p0, Ll/ۙۡܺ;->᩶:[Ll/᩸ۡܺ;

    array-length v1, v0

    .line 368
    new-instance v2, Ll/ۙۡܺ;

    add-int v3, v1, p1

    invoke-direct {v2, v3}, Ll/ۙۡܺ;-><init>(I)V

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_1

    .line 371
    aget-object v4, v0, v3

    if-eqz v4, :cond_0

    .line 373
    invoke-virtual {v4, p1}, Ll/᩸ۡܺ;->֫(I)Ll/᩸ۡܺ;

    move-result-object v4

    invoke-virtual {v2, v4}, Ll/ۙۡܺ;->ۧ(Ll/᩸ۡܺ;)V

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 377
    :cond_1
    iget p1, p0, Ll/ۙۡܺ;->᩹:I

    iput p1, v2, Ll/ۙۡܺ;->᩹:I

    .line 379
    invoke-virtual {p0}, Ll/ᩴᩴܺ;->᩻()Z

    move-result p1

    if-eqz p1, :cond_2

    .line 380
    invoke-virtual {v2}, Ll/ᩴᩴܺ;->ܺ()V

    :cond_2
    return-object v2
.end method

.method public final ֫(Ll/ᩴۡܺ;)Ll/᩸ۡܺ;
    .locals 5

    .line 233
    iget-object v0, p0, Ll/ۙۡܺ;->᩶:[Ll/᩸ۡܺ;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    .line 236
    aget-object v3, v0, v2

    if-eqz v3, :cond_0

    .line 238
    invoke-virtual {v3}, Ll/᩸ۡܺ;->᩻()Ll/ᩴۡܺ;

    move-result-object v4

    invoke-virtual {p1, v4}, Ll/ᩴۡܺ;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    return-object v3

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public final ֫(Ll/᩸ۡܺ;)Ll/᩸ۡܺ;
    .locals 5

    .line 208
    iget-object v0, p0, Ll/ۙۡܺ;->᩶:[Ll/᩸ۡܺ;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_2

    .line 211
    aget-object v3, v0, v2

    if-nez v3, :cond_0

    goto :goto_1

    .line 217
    :cond_0
    invoke-virtual {p1, v3}, Ll/᩸ۡܺ;->ᩳ(Ll/᩸ۡܺ;)Z

    move-result v4

    if-eqz v4, :cond_1

    return-object v3

    :cond_1
    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    return-object p1
.end method

.method public final ֫(Ll/ۙۡܺ;)V
    .locals 6

    .line 331
    invoke-virtual {p0}, Ll/ᩴᩴܺ;->ᩴ()V

    .line 333
    iget-object p1, p1, Ll/ۙۡܺ;->᩶:[Ll/᩸ۡܺ;

    .line 334
    iget-object v0, p0, Ll/ۙۡܺ;->᩶:[Ll/᩸ۡܺ;

    array-length v1, v0

    .line 335
    array-length v2, p1

    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    move-result v2

    const/4 v3, -0x1

    .line 337
    iput v3, p0, Ll/ۙۡܺ;->᩹:I

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_2

    .line 340
    aget-object v4, v0, v3

    if-nez v4, :cond_0

    goto :goto_1

    .line 346
    :cond_0
    aget-object v5, p1, v3

    .line 347
    invoke-virtual {v4, v5}, Ll/᩸ۡܺ;->ܽ(Ll/᩸ۡܺ;)Ll/᩸ۡܺ;

    move-result-object v5

    if-eq v5, v4, :cond_1

    .line 349
    aput-object v5, v0, v3

    :cond_1
    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    :goto_2
    if-ge v2, v1, :cond_3

    const/4 p1, 0x0

    .line 354
    aput-object p1, v0, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_3
    return-void
.end method

.method public final ۚ()I
    .locals 1

    .line 142
    iget-object v0, p0, Ll/ۙۡܺ;->᩶:[Ll/᩸ۡܺ;

    array-length v0, v0

    return v0
.end method

.method public final ۧ(Ll/ۙۡܺ;)V
    .locals 3

    .line 142
    iget-object v0, p1, Ll/ۙۡܺ;->᩶:[Ll/᩸ۡܺ;

    array-length v0, v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    .line 311
    invoke-virtual {p1, v1}, Ll/ۙۡܺ;->get(I)Ll/᩸ۡܺ;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 313
    invoke-virtual {p0, v2}, Ll/ۙۡܺ;->ۧ(Ll/᩸ۡܺ;)V

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final ۧ(Ll/᩸ۡܺ;)V
    .locals 6

    .line 273
    iget-object v0, p0, Ll/ۙۡܺ;->᩶:[Ll/᩸ۡܺ;

    invoke-virtual {p0}, Ll/ᩴᩴܺ;->ᩴ()V

    if-eqz p1, :cond_2

    const/4 v1, -0x1

    .line 279
    iput v1, p0, Ll/ۙۡܺ;->᩹:I

    .line 282
    :try_start_0
    invoke-virtual {p1}, Ll/᩸ۡܺ;->ᩴ()I

    move-result v1

    .line 283
    aput-object p1, v0, v1

    const/4 v2, 0x0

    const/4 v3, 0x2

    if-lez v1, :cond_0

    add-int/lit8 v4, v1, -0x1

    .line 287
    aget-object v5, v0, v4

    if-eqz v5, :cond_0

    .line 288
    invoke-virtual {v5}, Ll/᩸ۡܺ;->ۧ()I

    move-result v5

    if-ne v5, v3, :cond_0

    .line 289
    aput-object v2, v0, v4

    .line 293
    :cond_0
    invoke-virtual {p1}, Ll/᩸ۡܺ;->ۧ()I

    move-result p1

    if-ne p1, v3, :cond_1

    add-int/lit8 v1, v1, 0x1

    .line 294
    aput-object v2, v0, v1
    :try_end_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_1
    return-void

    .line 298
    :catch_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "spec.getReg() out of range"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 276
    :cond_2
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "spec == null"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ܽ(Ll/᩸ۡܺ;)V
    .locals 2

    .line 254
    :try_start_0
    iget-object v0, p0, Ll/ۙۡܺ;->᩶:[Ll/᩸ۡܺ;

    invoke-virtual {p1}, Ll/᩸ۡܺ;->ᩴ()I

    move-result p1

    const/4 v1, 0x0

    aput-object v1, v0, p1

    const/4 p1, -0x1

    .line 255
    iput p1, p0, Ll/ۙۡܺ;->᩹:I
    :try_end_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    .line 258
    :catch_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "bogus reg"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
