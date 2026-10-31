.class public final Ll/ۡ֡ᩴ;
.super Ljava/lang/Object;
.source "C1NC"

# interfaces
.implements Ll/ۧۚᩴ;
.implements Ll/۫۬ᩴ;


# instance fields
.field public final synthetic ᩶:Ll/᩵֡ᩴ;

.field public ᩸:I

.field public ᩹:I


# direct methods
.method public constructor <init>(Ll/᩵֡ᩴ;I)V
    .locals 0

    .line 837
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۡ֡ᩴ;->᩶:Ll/᩵֡ᩴ;

    .line 838
    iput p2, p0, Ll/ۡ֡ᩴ;->᩹:I

    const/4 p1, -0x1

    iput p1, p0, Ll/ۡ֡ᩴ;->᩸:I

    return-void
.end method


# virtual methods
.method public final add(Ljava/lang/Object;)V
    .locals 2

    .line 874
    iget v0, p0, Ll/ۡ֡ᩴ;->᩹:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Ll/ۡ֡ᩴ;->᩹:I

    iget-object v1, p0, Ll/ۡ֡ᩴ;->᩶:Ll/᩵֡ᩴ;

    invoke-virtual {v1, v0, p1}, Ll/᩵֡ᩴ;->add(ILjava/lang/Object;)V

    const/4 p1, -0x1

    .line 875
    iput p1, p0, Ll/ۡ֡ᩴ;->᩸:I

    return-void
.end method

.method public final forEachRemaining(Ljava/util/function/Consumer;)V
    .locals 4

    .line 895
    iget-object v0, p0, Ll/ۡ֡ᩴ;->᩶:Ll/᩵֡ᩴ;

    iget-object v1, v0, Ll/᩵֡ᩴ;->᩸:[Ljava/lang/Object;

    .line 896
    :goto_0
    iget v2, p0, Ll/ۡ֡ᩴ;->᩹:I

    iget v3, v0, Ll/᩵֡ᩴ;->᩹:I

    if-ge v2, v3, :cond_0

    add-int/lit8 v3, v2, 0x1

    .line 897
    iput v3, p0, Ll/ۡ֡ᩴ;->᩹:I

    iput v2, p0, Ll/ۡ֡ᩴ;->᩸:I

    aget-object v2, v1, v2

    invoke-interface {p1, v2}, Ljava/util/function/Consumer;->accept(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final hasNext()Z
    .locals 2

    .line 842
    iget v0, p0, Ll/ۡ֡ᩴ;->᩹:I

    iget-object v1, p0, Ll/ۡ֡ᩴ;->᩶:Ll/᩵֡ᩴ;

    iget v1, v1, Ll/᩵֡ᩴ;->᩹:I

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final hasPrevious()Z
    .locals 1

    .line 847
    iget v0, p0, Ll/ۡ֡ᩴ;->᩹:I

    if-lez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final next()Ljava/lang/Object;
    .locals 3

    .line 852
    invoke-virtual {p0}, Ll/ۡ֡ᩴ;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 853
    iget-object v0, p0, Ll/ۡ֡ᩴ;->᩶:Ll/᩵֡ᩴ;

    iget-object v0, v0, Ll/᩵֡ᩴ;->᩸:[Ljava/lang/Object;

    iget v1, p0, Ll/ۡ֡ᩴ;->᩹:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Ll/ۡ֡ᩴ;->᩹:I

    iput v1, p0, Ll/ۡ֡ᩴ;->᩸:I

    aget-object v0, v0, v1

    return-object v0

    .line 852
    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public final nextIndex()I
    .locals 1

    .line 864
    iget v0, p0, Ll/ۡ֡ᩴ;->᩹:I

    return v0
.end method

.method public final previous()Ljava/lang/Object;
    .locals 2

    .line 858
    invoke-virtual {p0}, Ll/ۡ֡ᩴ;->hasPrevious()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 859
    iget-object v0, p0, Ll/ۡ֡ᩴ;->᩶:Ll/᩵֡ᩴ;

    iget-object v0, v0, Ll/᩵֡ᩴ;->᩸:[Ljava/lang/Object;

    iget v1, p0, Ll/ۡ֡ᩴ;->᩹:I

    add-int/lit8 v1, v1, -0x1

    iput v1, p0, Ll/ۡ֡ᩴ;->᩹:I

    iput v1, p0, Ll/ۡ֡ᩴ;->᩸:I

    aget-object v0, v0, v1

    return-object v0

    .line 858
    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public final previousIndex()I
    .locals 1

    .line 869
    iget v0, p0, Ll/ۡ֡ᩴ;->᩹:I

    add-int/lit8 v0, v0, -0x1

    return v0
.end method

.method public final remove()V
    .locals 3

    .line 886
    iget v0, p0, Ll/ۡ֡ᩴ;->᩸:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_1

    .line 887
    iget-object v2, p0, Ll/ۡ֡ᩴ;->᩶:Ll/᩵֡ᩴ;

    invoke-virtual {v2, v0}, Ll/᩵֡ᩴ;->remove(I)Ljava/lang/Object;

    .line 889
    iget v0, p0, Ll/ۡ֡ᩴ;->᩸:I

    iget v2, p0, Ll/ۡ֡ᩴ;->᩹:I

    if-ge v0, v2, :cond_0

    add-int/lit8 v2, v2, -0x1

    iput v2, p0, Ll/ۡ֡ᩴ;->᩹:I

    .line 890
    :cond_0
    iput v1, p0, Ll/ۡ֡ᩴ;->᩸:I

    return-void

    .line 886
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0
.end method

.method public final set(Ljava/lang/Object;)V
    .locals 2

    .line 880
    iget v0, p0, Ll/ۡ֡ᩴ;->᩸:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    .line 881
    iget-object v1, p0, Ll/ۡ֡ᩴ;->᩶:Ll/᩵֡ᩴ;

    invoke-virtual {v1, v0, p1}, Ll/᩵֡ᩴ;->set(ILjava/lang/Object;)Ljava/lang/Object;

    return-void

    .line 880
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1
.end method
