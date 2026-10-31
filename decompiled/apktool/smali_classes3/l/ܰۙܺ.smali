.class public abstract Ll/ܰۙܺ;
.super Ljava/lang/Object;
.source "O2OZ"

# interfaces
.implements Ljava/util/Iterator;


# instance fields
.field public final synthetic ۙ:Ll/ܽۗܺ;

.field public ᩶:I

.field public ᩸:I

.field public ᩹:I


# direct methods
.method public constructor <init>(Ll/ܽۗܺ;)V
    .locals 1

    .line 621
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܰۙܺ;->ۙ:Ll/ܽۗܺ;

    .line 622
    invoke-static {p1}, Ll/ܽۗܺ;->֫(Ll/ܽۗܺ;)I

    move-result v0

    iput v0, p0, Ll/ܰۙܺ;->᩹:I

    .line 605
    invoke-virtual {p1}, Ll/ܽۗܺ;->isEmpty()Z

    move-result p1

    const/4 v0, -0x1

    if-eqz p1, :cond_0

    const/4 p1, -0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 623
    :goto_0
    iput p1, p0, Ll/ܰۙܺ;->᩸:I

    .line 624
    iput v0, p0, Ll/ܰۙܺ;->᩶:I

    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 1

    .line 628
    iget v0, p0, Ll/ܰۙܺ;->᩸:I

    if-ltz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final next()Ljava/lang/Object;
    .locals 3

    .line 662
    iget-object v0, p0, Ll/ܰۙܺ;->ۙ:Ll/ܽۗܺ;

    invoke-static {v0}, Ll/ܽۗܺ;->֫(Ll/ܽۗܺ;)I

    move-result v1

    iget v2, p0, Ll/ܰۙܺ;->᩹:I

    if-ne v1, v2, :cond_1

    .line 638
    invoke-virtual {p0}, Ll/ܰۙܺ;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 641
    iget v1, p0, Ll/ܰۙܺ;->᩸:I

    iput v1, p0, Ll/ܰۙܺ;->᩶:I

    .line 642
    invoke-virtual {p0, v1}, Ll/ܰۙܺ;->ۧ(I)Ljava/lang/Object;

    move-result-object v1

    .line 643
    iget v2, p0, Ll/ܰۙܺ;->᩸:I

    invoke-virtual {v0, v2}, Ll/ܽۗܺ;->ۧ(I)I

    move-result v0

    iput v0, p0, Ll/ܰۙܺ;->᩸:I

    return-object v1

    .line 639
    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0

    .line 663
    :cond_1
    new-instance v0, Ljava/util/ConcurrentModificationException;

    invoke-direct {v0}, Ljava/util/ConcurrentModificationException;-><init>()V

    throw v0
.end method

.method public final remove()V
    .locals 3

    .line 662
    iget-object v0, p0, Ll/ܰۙܺ;->ۙ:Ll/ܽۗܺ;

    invoke-static {v0}, Ll/ܽۗܺ;->֫(Ll/ܽۗܺ;)I

    move-result v1

    iget v2, p0, Ll/ܰۙܺ;->᩹:I

    if-ne v1, v2, :cond_1

    .line 650
    iget v1, p0, Ll/ܰۙܺ;->᩶:I

    if-ltz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    const-string v2, "no calls to next() since the last call to remove()"

    .line 63
    invoke-static {v2, v1}, Ll/ۘܶܺ;->ۧ(Ljava/lang/String;Z)V

    .line 658
    iget v1, p0, Ll/ܰۙܺ;->᩹:I

    add-int/lit8 v1, v1, 0x20

    iput v1, p0, Ll/ܰۙܺ;->᩹:I

    .line 652
    iget v1, p0, Ll/ܰۙܺ;->᩶:I

    invoke-static {v0, v1}, Ll/ܽۗܺ;->֫(Ll/ܽۗܺ;I)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/ܽۗܺ;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 653
    iget v0, p0, Ll/ܰۙܺ;->᩸:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Ll/ܰۙܺ;->᩸:I

    const/4 v0, -0x1

    .line 654
    iput v0, p0, Ll/ܰۙܺ;->᩶:I

    return-void

    .line 663
    :cond_1
    new-instance v0, Ljava/util/ConcurrentModificationException;

    invoke-direct {v0}, Ljava/util/ConcurrentModificationException;-><init>()V

    throw v0
.end method

.method public abstract ۧ(I)Ljava/lang/Object;
.end method
