.class public abstract Ll/۠۠ܺ;
.super Ljava/lang/Object;
.source "Q64S"

# interfaces
.implements Ljava/util/Iterator;


# instance fields
.field public ᩸:Ljava/lang/String;

.field public ᩹:Ll/֨۠ܺ;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    sget-object v0, Ll/֨۠ܺ;->ۙ:Ll/֨۠ܺ;

    iput-object v0, p0, Ll/۠۠ܺ;->᩹:Ll/֨۠ܺ;

    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 9

    .line 55
    iget-object v0, p0, Ll/۠۠ܺ;->᩹:Ll/֨۠ܺ;

    sget-object v1, Ll/֨۠ܺ;->᩶:Ll/֨۠ܺ;

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Ll/ۘܶܺ;->ۧ(Z)V

    .line 56
    iget-object v0, p0, Ll/۠۠ܺ;->᩹:Ll/֨۠ܺ;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    if-eqz v0, :cond_b

    const/4 v4, 0x2

    if-eq v0, v4, :cond_a

    .line 67
    iput-object v1, p0, Ll/۠۠ܺ;->᩹:Ll/֨۠ܺ;

    .line 68
    move-object v0, p0

    check-cast v0, Ll/᩶ܶܺ;

    .line 557
    iget v1, v0, Ll/᩶ܶܺ;->ۙ:I

    .line 558
    :cond_1
    :goto_1
    iget v4, v0, Ll/᩶ܶܺ;->ۙ:I

    const/4 v5, -0x1

    if-eq v4, v5, :cond_9

    .line 562
    invoke-virtual {v0, v4}, Ll/᩶ܶܺ;->ܽ(I)I

    move-result v4

    .line 563
    iget-object v6, v0, Ll/᩶ܶܺ;->۬:Ljava/lang/CharSequence;

    if-ne v4, v5, :cond_2

    .line 564
    invoke-interface {v6}, Ljava/lang/CharSequence;->length()I

    move-result v4

    .line 565
    iput v5, v0, Ll/᩶ܶܺ;->ۙ:I

    goto :goto_2

    .line 568
    :cond_2
    invoke-virtual {v0, v4}, Ll/᩶ܶܺ;->ۧ(I)I

    move-result v7

    iput v7, v0, Ll/᩶ܶܺ;->ۙ:I

    .line 570
    :goto_2
    iget v7, v0, Ll/᩶ܶܺ;->ۙ:I

    if-ne v7, v1, :cond_3

    add-int/lit8 v7, v7, 0x1

    .line 577
    iput v7, v0, Ll/᩶ܶܺ;->ۙ:I

    .line 578
    invoke-interface {v6}, Ljava/lang/CharSequence;->length()I

    move-result v4

    if-le v7, v4, :cond_1

    .line 579
    iput v5, v0, Ll/᩶ܶܺ;->ۙ:I

    goto :goto_1

    .line 584
    :cond_3
    :goto_3
    iget-object v7, v0, Ll/᩶ܶܺ;->۫:Ll/ۨ۠ܺ;

    if-ge v1, v4, :cond_4

    invoke-interface {v6, v1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v8

    invoke-virtual {v7, v8}, Ll/ۨ۠ܺ;->֫(C)Z

    move-result v8

    if-eqz v8, :cond_4

    add-int/lit8 v1, v1, 0x1

    goto :goto_3

    :cond_4
    :goto_4
    if-le v4, v1, :cond_5

    add-int/lit8 v8, v4, -0x1

    .line 587
    invoke-interface {v6, v8}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v8

    invoke-virtual {v7, v8}, Ll/ۨ۠ܺ;->֫(C)Z

    move-result v8

    if-eqz v8, :cond_5

    add-int/lit8 v4, v4, -0x1

    goto :goto_4

    .line 591
    :cond_5
    iget-boolean v8, v0, Ll/᩶ܶܺ;->ۗ:Z

    if-eqz v8, :cond_6

    if-ne v1, v4, :cond_6

    .line 593
    iget v1, v0, Ll/᩶ܶܺ;->ۙ:I

    goto :goto_1

    .line 597
    :cond_6
    iget v8, v0, Ll/᩶ܶܺ;->᩶:I

    if-ne v8, v3, :cond_7

    .line 601
    invoke-interface {v6}, Ljava/lang/CharSequence;->length()I

    move-result v4

    .line 602
    iput v5, v0, Ll/᩶ܶܺ;->ۙ:I

    :goto_5
    if-le v4, v1, :cond_8

    add-int/lit8 v0, v4, -0x1

    .line 604
    invoke-interface {v6, v0}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v0

    invoke-virtual {v7, v0}, Ll/ۨ۠ܺ;->֫(C)Z

    move-result v0

    if-eqz v0, :cond_8

    add-int/lit8 v4, v4, -0x1

    goto :goto_5

    :cond_7
    sub-int/2addr v8, v3

    .line 608
    iput v8, v0, Ll/᩶ܶܺ;->᩶:I

    .line 611
    :cond_8
    invoke-interface {v6, v1, v4}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_6

    .line 49
    :cond_9
    sget-object v1, Ll/֨۠ܺ;->᩹:Ll/֨۠ܺ;

    iput-object v1, v0, Ll/۠۠ܺ;->᩹:Ll/֨۠ܺ;

    const/4 v0, 0x0

    .line 68
    :goto_6
    iput-object v0, p0, Ll/۠۠ܺ;->᩸:Ljava/lang/String;

    .line 69
    iget-object v0, p0, Ll/۠۠ܺ;->᩹:Ll/֨۠ܺ;

    sget-object v1, Ll/֨۠ܺ;->᩹:Ll/֨۠ܺ;

    if-eq v0, v1, :cond_a

    .line 70
    sget-object v0, Ll/֨۠ܺ;->ۗ:Ll/֨۠ܺ;

    iput-object v0, p0, Ll/۠۠ܺ;->᩹:Ll/֨۠ܺ;

    return v3

    :cond_a
    return v2

    :cond_b
    return v3
.end method

.method public final next()Ljava/lang/Object;
    .locals 2

    .line 79
    invoke-virtual {p0}, Ll/۠۠ܺ;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 82
    sget-object v0, Ll/֨۠ܺ;->ۙ:Ll/֨۠ܺ;

    iput-object v0, p0, Ll/۠۠ܺ;->᩹:Ll/֨۠ܺ;

    .line 84
    iget-object v0, p0, Ll/۠۠ܺ;->᩸:Ljava/lang/String;

    const/4 v1, 0x0

    .line 85
    iput-object v1, p0, Ll/۠۠ܺ;->᩸:Ljava/lang/String;

    return-object v0

    .line 80
    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public final remove()V
    .locals 1

    .line 91
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method
