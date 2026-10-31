.class public final Ll/᩸ۜᩴ;
.super Ljava/lang/Object;
.source "VZ3"

# interfaces
.implements Ll/۫֡ᩴ;
.implements Ll/۫۬ᩴ;


# instance fields
.field public ᩸:I

.field public final synthetic ᩹:Ll/᩶ۜᩴ;


# direct methods
.method public constructor <init>(Ll/᩶ۜᩴ;)V
    .locals 0

    .line 628
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩸ۜᩴ;->᩹:Ll/᩶ۜᩴ;

    const/4 p1, 0x0

    .line 629
    iput p1, p0, Ll/᩸ۜᩴ;->᩸:I

    return-void
.end method


# virtual methods
.method public final forEachRemaining(Ljava/util/function/Consumer;)V
    .locals 4

    .line 657
    iget-object v0, p0, Ll/᩸ۜᩴ;->᩹:Ll/᩶ۜᩴ;

    iget-object v0, v0, Ll/᩶ۜᩴ;->᩸:Ll/ۙۜᩴ;

    iget-object v1, v0, Ll/ۙۜᩴ;->ۗ:[Ljava/lang/Object;

    .line 658
    iget v0, v0, Ll/ۙۜᩴ;->ۙ:I

    .line 659
    :goto_0
    iget v2, p0, Ll/᩸ۜᩴ;->᩸:I

    if-ge v2, v0, :cond_0

    add-int/lit8 v3, v2, 0x1

    .line 660
    iput v3, p0, Ll/᩸ۜᩴ;->᩸:I

    aget-object v2, v1, v2

    invoke-interface {p1, v2}, Ljava/util/function/Consumer;->accept(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final hasNext()Z
    .locals 2

    .line 633
    iget v0, p0, Ll/᩸ۜᩴ;->᩸:I

    iget-object v1, p0, Ll/᩸ۜᩴ;->᩹:Ll/᩶ۜᩴ;

    iget-object v1, v1, Ll/᩶ۜᩴ;->᩸:Ll/ۙۜᩴ;

    iget v1, v1, Ll/ۙۜᩴ;->ۙ:I

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final next()Ljava/lang/Object;
    .locals 3

    .line 639
    invoke-virtual {p0}, Ll/᩸ۜᩴ;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 640
    iget-object v0, p0, Ll/᩸ۜᩴ;->᩹:Ll/᩶ۜᩴ;

    iget-object v0, v0, Ll/᩶ۜᩴ;->᩸:Ll/ۙۜᩴ;

    iget-object v0, v0, Ll/ۙۜᩴ;->ۗ:[Ljava/lang/Object;

    iget v1, p0, Ll/᩸ۜᩴ;->᩸:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Ll/᩸ۜᩴ;->᩸:I

    aget-object v0, v0, v1

    return-object v0

    .line 639
    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public final remove()V
    .locals 5

    .line 645
    iget v0, p0, Ll/᩸ۜᩴ;->᩸:I

    if-eqz v0, :cond_0

    .line 646
    iget-object v1, p0, Ll/᩸ۜᩴ;->᩹:Ll/᩶ۜᩴ;

    iget-object v2, v1, Ll/᩶ۜᩴ;->᩸:Ll/ۙۜᩴ;

    iget v3, v2, Ll/ۙۜᩴ;->ۙ:I

    sub-int/2addr v3, v0

    .line 647
    iget-object v2, v2, Ll/ۙۜᩴ;->᩹:[I

    add-int/lit8 v4, v0, -0x1

    invoke-static {v2, v0, v2, v4, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 648
    iget-object v0, v1, Ll/᩶ۜᩴ;->᩸:Ll/ۙۜᩴ;

    iget-object v0, v0, Ll/ۙۜᩴ;->ۗ:[Ljava/lang/Object;

    iget v2, p0, Ll/᩸ۜᩴ;->᩸:I

    add-int/lit8 v4, v2, -0x1

    invoke-static {v0, v2, v0, v4, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 649
    iget-object v0, v1, Ll/᩶ۜᩴ;->᩸:Ll/ۙۜᩴ;

    iget v1, v0, Ll/ۙۜᩴ;->ۙ:I

    add-int/lit8 v1, v1, -0x1

    iput v1, v0, Ll/ۙۜᩴ;->ۙ:I

    .line 650
    iget v2, p0, Ll/᩸ۜᩴ;->᩸:I

    add-int/lit8 v2, v2, -0x1

    iput v2, p0, Ll/᩸ۜᩴ;->᩸:I

    .line 651
    iget-object v0, v0, Ll/ۙۜᩴ;->ۗ:[Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v2, v0, v1

    return-void

    .line 645
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0
.end method
