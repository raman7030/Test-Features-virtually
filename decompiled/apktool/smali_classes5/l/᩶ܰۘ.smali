.class public final Ll/᩶ܰۘ;
.super Ljava/lang/Object;
.source "YCK3"

# interfaces
.implements Ll/ܺۧᩴ;
.implements Ll/۫۬ᩴ;


# instance fields
.field public ᩸:I

.field public final synthetic ᩹:Ll/ۗܰۘ;


# direct methods
.method public constructor <init>(Ll/ۗܰۘ;)V
    .locals 0

    .line 530
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩶ܰۘ;->᩹:Ll/ۗܰۘ;

    const/4 p1, 0x0

    .line 531
    iput p1, p0, Ll/᩶ܰۘ;->᩸:I

    return-void
.end method


# virtual methods
.method public final bridge synthetic forEachRemaining(Ljava/lang/Object;)V
    .locals 0

    .line 530
    check-cast p1, Ll/᩻ۧᩴ;

    invoke-virtual {p0, p1}, Ll/᩶ܰۘ;->ۧ(Ll/᩻ۧᩴ;)V

    return-void
.end method

.method public final synthetic forEachRemaining(Ljava/util/function/Consumer;)V
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ۡۧᩴ;->֫(Ll/ܺۧᩴ;Ljava/util/function/Consumer;)V

    return-void
.end method

.method public final hasNext()Z
    .locals 2

    .line 535
    iget v0, p0, Ll/᩶ܰۘ;->᩸:I

    iget-object v1, p0, Ll/᩶ܰۘ;->᩹:Ll/ۗܰۘ;

    iget-object v1, v1, Ll/ۗܰۘ;->᩸:Ll/ۨܰۘ;

    iget v1, v1, Ll/ۨܰۘ;->ۙ:I

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final next()Ljava/lang/Object;
    .locals 1

    .line 46
    invoke-virtual {p0}, Ll/᩶ܰۘ;->֡ۧ()C

    move-result v0

    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v0

    return-object v0
.end method

.method public final remove()V
    .locals 5

    .line 547
    iget v0, p0, Ll/᩶ܰۘ;->᩸:I

    if-eqz v0, :cond_0

    .line 548
    iget-object v1, p0, Ll/᩶ܰۘ;->᩹:Ll/ۗܰۘ;

    iget-object v2, v1, Ll/ۗܰۘ;->᩸:Ll/ۨܰۘ;

    iget v3, v2, Ll/ۨܰۘ;->ۙ:I

    sub-int/2addr v3, v0

    .line 549
    iget-object v2, v2, Ll/ۨܰۘ;->᩹:[C

    add-int/lit8 v4, v0, -0x1

    invoke-static {v2, v0, v2, v4, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 550
    iget-object v0, v1, Ll/ۗܰۘ;->᩸:Ll/ۨܰۘ;

    iget-object v0, v0, Ll/ۨܰۘ;->ۗ:[C

    iget v2, p0, Ll/᩶ܰۘ;->᩸:I

    add-int/lit8 v4, v2, -0x1

    invoke-static {v0, v2, v0, v4, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 551
    iget-object v0, v1, Ll/ۗܰۘ;->᩸:Ll/ۨܰۘ;

    iget v1, v0, Ll/ۨܰۘ;->ۙ:I

    add-int/lit8 v1, v1, -0x1

    iput v1, v0, Ll/ۨܰۘ;->ۙ:I

    .line 552
    iget v0, p0, Ll/᩶ܰۘ;->᩸:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Ll/᩶ܰۘ;->᩸:I

    return-void

    .line 547
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0
.end method

.method public final ֡ۧ()C
    .locals 3

    .line 541
    invoke-virtual {p0}, Ll/᩶ܰۘ;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 542
    iget-object v0, p0, Ll/᩶ܰۘ;->᩹:Ll/ۗܰۘ;

    iget-object v0, v0, Ll/ۗܰۘ;->᩸:Ll/ۨܰۘ;

    iget-object v0, v0, Ll/ۨܰۘ;->᩹:[C

    iget v1, p0, Ll/᩶ܰۘ;->᩸:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Ll/᩶ܰۘ;->᩸:I

    aget-char v0, v0, v1

    return v0

    .line 541
    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public final ۧ(Ll/᩻ۧᩴ;)V
    .locals 4

    .line 558
    iget-object v0, p0, Ll/᩶ܰۘ;->᩹:Ll/ۗܰۘ;

    iget-object v0, v0, Ll/ۗܰۘ;->᩸:Ll/ۨܰۘ;

    iget-object v1, v0, Ll/ۨܰۘ;->᩹:[C

    .line 559
    iget v0, v0, Ll/ۨܰۘ;->ۙ:I

    .line 560
    :goto_0
    iget v2, p0, Ll/᩶ܰۘ;->᩸:I

    if-ge v2, v0, :cond_0

    add-int/lit8 v3, v2, 0x1

    .line 561
    iput v3, p0, Ll/᩶ܰۘ;->᩸:I

    aget-char v2, v1, v2

    invoke-interface {p1, v2}, Ll/᩻ۧᩴ;->ܽ(C)V

    goto :goto_0

    :cond_0
    return-void
.end method
