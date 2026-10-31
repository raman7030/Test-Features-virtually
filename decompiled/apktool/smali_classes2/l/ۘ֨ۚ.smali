.class public final Ll/ۘ֨ۚ;
.super Ljava/lang/Object;
.source "EBIJ"


# instance fields
.field public ֫:I

.field public ۧ:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 13
    iput v0, p0, Ll/ۘ֨ۚ;->֫:I

    .line 22
    invoke-static {p1}, Ll/ܿ֡ۚ;->֫(Ljava/lang/Object;)V

    .line 23
    iput-object p1, p0, Ll/ۘ֨ۚ;->ۧ:Ljava/lang/String;

    return-void
.end method

.method public static ᩳ(Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    .line 281
    invoke-static {}, Ll/᩷֡ۚ;->֫()Ljava/lang/StringBuilder;

    move-result-object v0

    .line 283
    invoke-virtual {p0}, Ljava/lang/String;->toCharArray()[C

    move-result-object p0

    array-length v1, p0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v2, v1, :cond_2

    aget-char v4, p0, v2

    const/16 v5, 0x5c

    if-ne v4, v5, :cond_0

    if-ne v3, v5, :cond_1

    .line 286
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 289
    :cond_0
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_1
    :goto_1
    add-int/lit8 v2, v2, 0x1

    move v3, v4

    goto :goto_0

    .line 292
    :cond_2
    invoke-static {v0}, Ll/᩷֡ۚ;->֫(Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    .line 358
    iget-object v0, p0, Ll/ۘ֨ۚ;->ۧ:Ljava/lang/String;

    iget v1, p0, Ll/ۘ֨ۚ;->֫:I

    invoke-virtual {v0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()Ljava/lang/String;
    .locals 4

    .line 150
    iget v0, p0, Ll/ۘ֨ۚ;->֫:I

    iget-object v1, p0, Ll/ۘ֨ۚ;->ۧ:Ljava/lang/String;

    const-string v2, ")"

    invoke-virtual {v1, v2, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;I)I

    move-result v0

    const/4 v3, -0x1

    if-eq v0, v3, :cond_0

    .line 152
    iget v3, p0, Ll/ۘ֨ۚ;->֫:I

    invoke-virtual {v1, v3, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    .line 153
    iget v1, p0, Ll/ۘ֨ۚ;->֫:I

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v3

    add-int/2addr v3, v1

    iput v3, p0, Ll/ۘ֨ۚ;->֫:I

    goto :goto_0

    .line 156
    :cond_0
    invoke-virtual {p0}, Ll/ۘ֨ۚ;->ۜ()Ljava/lang/String;

    move-result-object v0

    .line 210
    :goto_0
    invoke-virtual {p0, v2}, Ll/ۘ֨ۚ;->ۧ(Ljava/lang/String;)Z

    return-object v0
.end method

.method public final ֫(CC)Ljava/lang/String;
    .locals 10

    const/4 v0, -0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, -0x1

    const/4 v5, -0x1

    const/4 v6, 0x0

    const/4 v7, 0x0

    .line 239
    :goto_0
    invoke-virtual {p0}, Ll/ۘ֨ۚ;->ܳ()Z

    move-result v8

    if-eqz v8, :cond_0

    goto :goto_4

    .line 240
    :cond_0
    invoke-virtual {p0}, Ll/ۘ֨ۚ;->ۧ()C

    move-result v8

    const/16 v9, 0x5c

    if-eq v1, v9, :cond_5

    const/16 v9, 0x27

    if-ne v8, v9, :cond_1

    if-eq v8, p1, :cond_1

    if-nez v2, :cond_1

    xor-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_1
    const/16 v9, 0x22

    if-ne v8, v9, :cond_2

    if-eq v8, p1, :cond_2

    if-nez v3, :cond_2

    xor-int/lit8 v2, v2, 0x1

    :cond_2
    :goto_1
    if-nez v3, :cond_8

    if-nez v2, :cond_8

    if-eqz v7, :cond_3

    goto :goto_3

    :cond_3
    if-ne v8, p1, :cond_4

    add-int/lit8 v6, v6, 0x1

    if-ne v4, v0, :cond_7

    .line 254
    iget v4, p0, Ll/ۘ֨ۚ;->֫:I

    goto :goto_2

    :cond_4
    if-ne v8, p2, :cond_7

    add-int/lit8 v6, v6, -0x1

    goto :goto_2

    :cond_5
    const/16 v9, 0x51

    if-ne v8, v9, :cond_6

    const/4 v7, 0x1

    goto :goto_2

    :cond_6
    const/16 v9, 0x45

    if-ne v8, v9, :cond_7

    const/4 v7, 0x0

    :cond_7
    :goto_2
    if-lez v6, :cond_8

    if-eqz v1, :cond_8

    .line 265
    iget v1, p0, Ll/ۘ֨ۚ;->֫:I

    move v5, v1

    :cond_8
    :goto_3
    if-gtz v6, :cond_b

    :goto_4
    if-ltz v5, :cond_9

    .line 268
    iget-object p1, p0, Ll/ۘ֨ۚ;->ۧ:Ljava/lang/String;

    invoke-virtual {p1, v4, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    goto :goto_5

    :cond_9
    const-string p1, ""

    :goto_5
    if-gtz v6, :cond_a

    return-object p1

    :cond_a
    const-string p2, "Did not find balanced marker at \'"

    const-string v0, "\'"

    .line 0
    invoke-static {p2, p1, v0}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 183
    new-instance p2, Ll/ܳ֡ۚ;

    .line 14
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 183
    throw p2

    :cond_b
    move v1, v8

    goto :goto_0
.end method

.method public final varargs ֫([Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 192
    iget v0, p0, Ll/ۘ֨ۚ;->֫:I

    .line 193
    :goto_0
    invoke-virtual {p0}, Ll/ۘ֨ۚ;->ܳ()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {p0, p1}, Ll/ۘ֨ۚ;->ۧ([Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 194
    iget v1, p0, Ll/ۘ֨ۚ;->֫:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Ll/ۘ֨ۚ;->֫:I

    goto :goto_0

    .line 197
    :cond_0
    iget-object p1, p0, Ll/ۘ֨ۚ;->ۧ:Ljava/lang/String;

    iget v1, p0, Ll/ۘ֨ۚ;->֫:I

    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ljava/lang/String;)V
    .locals 2

    .line 135
    invoke-virtual {p0, p1}, Ll/ۘ֨ۚ;->ܽ(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 137
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    .line 35
    iget-object v0, p0, Ll/ۘ֨ۚ;->ۧ:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    iget v1, p0, Ll/ۘ֨ۚ;->֫:I

    sub-int/2addr v0, v1

    if-gt p1, v0, :cond_0

    add-int/2addr v1, p1

    .line 141
    iput v1, p0, Ll/ۘ֨ۚ;->֫:I

    return-void

    .line 139
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Queue not long enough to consume sequence"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 136
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Queue did not match expected sequence"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ۜ()Ljava/lang/String;
    .locals 2

    .line 351
    iget v0, p0, Ll/ۘ֨ۚ;->֫:I

    iget-object v1, p0, Ll/ۘ֨ۚ;->ۧ:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    .line 352
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    iput v1, p0, Ll/ۘ֨ۚ;->֫:I

    return-object v0
.end method

.method public final ۧ()C
    .locals 2

    .line 124
    iget v0, p0, Ll/ۘ֨ۚ;->֫:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Ll/ۘ֨ۚ;->֫:I

    iget-object v1, p0, Ll/ۘ֨ۚ;->ۧ:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    return v0
.end method

.method public final ۧ(Ljava/lang/String;)Z
    .locals 1

    .line 88
    invoke-virtual {p0, p1}, Ll/ۘ֨ۚ;->ܽ(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 89
    iget v0, p0, Ll/ۘ֨ۚ;->֫:I

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    add-int/2addr p1, v0

    iput p1, p0, Ll/ۘ֨ۚ;->֫:I

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final varargs ۧ([Ljava/lang/String;)Z
    .locals 4

    .line 63
    array-length v0, p1

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_1

    aget-object v3, p1, v2

    .line 64
    invoke-virtual {p0, v3}, Ll/ۘ֨ۚ;->ܽ(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return v1
.end method

.method public final ܳ()Z
    .locals 2

    .line 35
    iget-object v0, p0, Ll/ۘ֨ۚ;->ۧ:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    iget v1, p0, Ll/ۘ֨ۚ;->֫:I

    sub-int/2addr v0, v1

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ܽ()Ljava/lang/String;
    .locals 7

    .line 339
    iget v0, p0, Ll/ۘ֨ۚ;->֫:I

    .line 340
    :goto_0
    invoke-virtual {p0}, Ll/ۘ֨ۚ;->ܳ()Z

    move-result v1

    iget-object v2, p0, Ll/ۘ֨ۚ;->ۧ:Ljava/lang/String;

    if-nez v1, :cond_3

    invoke-virtual {p0}, Ll/ۘ֨ۚ;->᩻()Z

    move-result v1

    if-nez v1, :cond_2

    const/4 v1, 0x2

    new-array v3, v1, [C

    fill-array-data v3, :array_0

    .line 71
    invoke-virtual {p0}, Ll/ۘ֨ۚ;->ܳ()Z

    move-result v4

    if-eqz v4, :cond_0

    goto :goto_3

    :cond_0
    const/4 v4, 0x0

    :goto_1
    if-ge v4, v1, :cond_3

    .line 74
    aget-char v5, v3, v4

    .line 75
    iget v6, p0, Ll/ۘ֨ۚ;->֫:I

    invoke-virtual {v2, v6}, Ljava/lang/String;->charAt(I)C

    move-result v6

    if-ne v6, v5, :cond_1

    goto :goto_2

    :cond_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    .line 341
    :cond_2
    :goto_2
    iget v1, p0, Ll/ۘ֨ۚ;->֫:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Ll/ۘ֨ۚ;->֫:I

    goto :goto_0

    .line 343
    :cond_3
    :goto_3
    iget v1, p0, Ll/ۘ֨ۚ;->֫:I

    invoke-virtual {v2, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :array_0
    .array-data 2
        0x2ds
        0x5fs
    .end array-data
.end method

.method public final ܽ(Ljava/lang/String;)Z
    .locals 6

    .line 54
    iget v2, p0, Ll/ۘ֨ۚ;->֫:I

    const/4 v4, 0x0

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v5

    iget-object v0, p0, Ll/ۘ֨ۚ;->ۧ:Ljava/lang/String;

    const/4 v1, 0x1

    move-object v3, p1

    invoke-virtual/range {v0 .. v5}, Ljava/lang/String;->regionMatches(ZILjava/lang/String;II)Z

    move-result p1

    return p1
.end method

.method public final ܿ()Z
    .locals 3

    const/4 v0, 0x0

    .line 101
    :goto_0
    invoke-virtual {p0}, Ll/ۘ֨ۚ;->ܳ()Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Ll/ۘ֨ۚ;->ۧ:Ljava/lang/String;

    iget v2, p0, Ll/ۘ֨ۚ;->֫:I

    invoke-virtual {v1, v2}, Ljava/lang/String;->charAt(I)C

    move-result v1

    invoke-static {v1}, Ll/᩷֡ۚ;->֫(I)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 302
    iget v0, p0, Ll/ۘ֨ۚ;->֫:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Ll/ۘ֨ۚ;->֫:I

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    return v0
.end method

.method public final ᩳ()Ljava/lang/String;
    .locals 5

    .line 326
    iget v0, p0, Ll/ۘ֨ۚ;->֫:I

    .line 327
    :goto_0
    invoke-virtual {p0}, Ll/ۘ֨ۚ;->ܳ()Z

    move-result v1

    if-nez v1, :cond_1

    invoke-virtual {p0}, Ll/ۘ֨ۚ;->᩻()Z

    move-result v1

    if-nez v1, :cond_0

    const-string v1, "_"

    const-string v2, "-"

    const-string v3, "*|"

    const-string v4, "|"

    filled-new-array {v3, v4, v1, v2}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Ll/ۘ֨ۚ;->ۧ([Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 328
    :cond_0
    iget v1, p0, Ll/ۘ֨ۚ;->֫:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Ll/ۘ֨ۚ;->֫:I

    goto :goto_0

    .line 330
    :cond_1
    iget-object v1, p0, Ll/ۘ֨ۚ;->ۧ:Ljava/lang/String;

    iget v2, p0, Ll/ۘ֨ۚ;->֫:I

    invoke-virtual {v1, v0, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ᩻()Z
    .locals 2

    .line 109
    invoke-virtual {p0}, Ll/ۘ֨ۚ;->ܳ()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Ll/ۘ֨ۚ;->ۧ:Ljava/lang/String;

    iget v1, p0, Ll/ۘ֨ۚ;->֫:I

    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v0

    invoke-static {v0}, Ljava/lang/Character;->isLetterOrDigit(C)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
