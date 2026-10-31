.class public final Ll/ۛ۬ܳ;
.super Ljava/lang/Object;
.source "M2AR"

# interfaces
.implements Ljava/lang/Comparable;


# instance fields
.field public ۗ:Ljava/lang/String;

.field public ۙ:Ljava/math/BigInteger;

.field public ۬:Ljava/lang/String;

.field public ᩶:I

.field public ᩸:Ljava/text/Collator;

.field public ᩹:Z


# direct methods
.method public constructor <init>(Ljava/text/Collator;Ljava/lang/String;Z)V
    .locals 2

    .line 551
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 552
    iput-object p1, p0, Ll/ۛ۬ܳ;->᩸:Ljava/text/Collator;

    .line 554
    invoke-virtual {p2}, Ljava/lang/String;->isEmpty()Z

    move-result p1

    const/4 v0, 0x0

    if-nez p1, :cond_1

    invoke-virtual {p2, v0}, Ljava/lang/String;->charAt(I)C

    move-result p1

    const/16 v1, 0x80

    if-ge p1, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x1

    .line 557
    iput p1, p0, Ll/ۛ۬ܳ;->᩶:I

    goto :goto_1

    .line 555
    :cond_1
    :goto_0
    iput v0, p0, Ll/ۛ۬ܳ;->᩶:I

    .line 559
    :goto_1
    iput-boolean p3, p0, Ll/ۛ۬ܳ;->᩹:Z

    if-eqz p3, :cond_2

    .line 562
    :try_start_0
    new-instance p1, Ljava/math/BigInteger;

    invoke-direct {p1, p2}, Ljava/math/BigInteger;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Ll/ۛ۬ܳ;->ۙ:Ljava/math/BigInteger;
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    .line 565
    :catch_0
    sget-object p1, Ljava/math/BigInteger;->ZERO:Ljava/math/BigInteger;

    iput-object p1, p0, Ll/ۛ۬ܳ;->ۙ:Ljava/math/BigInteger;

    .line 568
    :cond_2
    :goto_2
    iput-object p2, p0, Ll/ۛ۬ܳ;->ۗ:Ljava/lang/String;

    .line 569
    invoke-virtual {p2}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ll/ۛ۬ܳ;->۬:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 543
    check-cast p1, Ll/ۛ۬ܳ;

    invoke-virtual {p0, p1}, Ll/ۛ۬ܳ;->֫(Ll/ۛ۬ܳ;)I

    move-result p1

    return p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 593
    iget-object v0, p0, Ll/ۛ۬ܳ;->۬:Ljava/lang/String;

    return-object v0
.end method

.method public final ֫(Ll/ۛ۬ܳ;)I
    .locals 11

    .line 574
    iget v0, p1, Ll/ۛ۬ܳ;->᩶:I

    iget v1, p0, Ll/ۛ۬ܳ;->᩶:I

    if-eq v1, v0, :cond_0

    sub-int/2addr v1, v0

    return v1

    .line 577
    :cond_0
    iget-boolean v0, p0, Ll/ۛ۬ܳ;->᩹:Z

    if-eqz v0, :cond_1

    iget-boolean v0, p1, Ll/ۛ۬ܳ;->᩹:Z

    if-eqz v0, :cond_1

    .line 578
    iget-object v0, p0, Ll/ۛ۬ܳ;->ۙ:Ljava/math/BigInteger;

    iget-object v1, p1, Ll/ۛ۬ܳ;->ۙ:Ljava/math/BigInteger;

    invoke-virtual {v0, v1}, Ljava/math/BigInteger;->compareTo(Ljava/math/BigInteger;)I

    move-result v0

    if-eqz v0, :cond_1

    return v0

    .line 583
    :cond_1
    iget-object v0, p1, Ll/ۛ۬ܳ;->۬:Ljava/lang/String;

    sget v1, Ll/۟۬ܳ;->֫:I

    .line 598
    iget-object v1, p0, Ll/ۛ۬ܳ;->۬:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    .line 599
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v3

    .line 600
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v4

    invoke-static {v4, v3}, Ljava/lang/Math;->min(II)I

    move-result v4

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v4, :cond_9

    .line 602
    invoke-virtual {v1, v5}, Ljava/lang/String;->charAt(I)C

    move-result v6

    .line 603
    invoke-virtual {v0, v5}, Ljava/lang/String;->charAt(I)C

    move-result v7

    if-ne v6, v7, :cond_2

    goto :goto_3

    :cond_2
    const/16 v8, 0x7f

    const/4 v9, 0x1

    if-gt v6, v8, :cond_3

    const/4 v10, 0x1

    goto :goto_1

    :cond_3
    const/4 v10, 0x0

    :goto_1
    if-gt v7, v8, :cond_4

    const/4 v8, 0x1

    goto :goto_2

    :cond_4
    const/4 v8, 0x0

    :goto_2
    if-eqz v10, :cond_5

    if-eqz v8, :cond_5

    sub-int v9, v6, v7

    goto :goto_4

    :cond_5
    if-eqz v10, :cond_6

    const/4 v9, -0x1

    goto :goto_4

    :cond_6
    if-eqz v8, :cond_7

    goto :goto_4

    .line 614
    :cond_7
    invoke-static {v6}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object v6

    invoke-static {v7}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object v7

    iget-object v8, p0, Ll/ۛ۬ܳ;->᩸:Ljava/text/Collator;

    invoke-virtual {v8, v6, v7}, Ljava/text/Collator;->compare(Ljava/lang/String;Ljava/lang/String;)I

    move-result v9

    if-eqz v9, :cond_8

    goto :goto_4

    :cond_8
    :goto_3
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 618
    :cond_9
    invoke-static {v2, v3}, Ljava/lang/Integer;->compare(II)I

    move-result v9

    :goto_4
    if-eqz v9, :cond_a

    return v9

    .line 587
    :cond_a
    iget-object v0, p0, Ll/ۛ۬ܳ;->ۗ:Ljava/lang/String;

    iget-object p1, p1, Ll/ۛ۬ܳ;->ۗ:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result p1

    return p1
.end method
