.class public final Ll/᩶ۜᩴ;
.super Ll/ۨۘᩴ;
.source "VZ3"


# instance fields
.field public final synthetic ᩸:Ll/ۙۜᩴ;


# direct methods
.method public constructor <init>(Ll/ۙۜᩴ;)V
    .locals 0

    .line 620
    iput-object p1, p0, Ll/᩶ۜᩴ;->᩸:Ll/ۙۜᩴ;

    .line 34
    invoke-direct {p0}, Ljava/util/AbstractCollection;-><init>()V

    return-void
.end method


# virtual methods
.method public final clear()V
    .locals 1

    .line 720
    iget-object v0, p0, Ll/᩶ۜᩴ;->᩸:Ll/ۙۜᩴ;

    invoke-virtual {v0}, Ll/ۙۜᩴ;->clear()V

    return-void
.end method

.method public final contains(Ljava/lang/Object;)Z
    .locals 1

    .line 623
    iget-object v0, p0, Ll/᩶ۜᩴ;->᩸:Ll/ۙۜᩴ;

    invoke-virtual {v0, p1}, Ll/ۙۜᩴ;->containsValue(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final forEach(Ljava/util/function/Consumer;)V
    .locals 4

    .line 707
    iget-object v0, p0, Ll/᩶ۜᩴ;->᩸:Ll/ۙۜᩴ;

    iget-object v1, v0, Ll/ۙۜᩴ;->ۗ:[Ljava/lang/Object;

    .line 708
    iget v0, v0, Ll/ۙۜᩴ;->ۙ:I

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_0

    .line 709
    aget-object v3, v1, v2

    invoke-interface {p1, v3}, Ljava/util/function/Consumer;->accept(Ljava/lang/Object;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 1

    .line 628
    new-instance v0, Ll/᩸ۜᩴ;

    invoke-direct {v0, p0}, Ll/᩸ۜᩴ;-><init>(Ll/᩶ۜᩴ;)V

    return-object v0
.end method

.method public final iterator()Ll/۫֡ᩴ;
    .locals 1

    .line 628
    new-instance v0, Ll/᩸ۜᩴ;

    invoke-direct {v0, p0}, Ll/᩸ۜᩴ;-><init>(Ll/᩶ۜᩴ;)V

    return-object v0
.end method

.method public final size()I
    .locals 1

    .line 715
    iget-object v0, p0, Ll/᩶ۜᩴ;->᩸:Ll/ۙۜᩴ;

    iget v0, v0, Ll/ۙۜᩴ;->ۙ:I

    return v0
.end method

.method public synthetic spliterator()Ljava/util/Spliterator;
    .locals 1

    .line 0
    invoke-virtual {p0}, Ll/᩶ۜᩴ;->spliterator()Ll/ܶ۫ᩴ;

    move-result-object v0

    invoke-static {v0}, Ll/۠۫ᩴ;->convert(Ll/ܶ۫ᩴ;)Ljava/util/Spliterator;

    move-result-object v0

    return-object v0
.end method

.method public final spliterator()Ll/۠ۚᩴ;
    .locals 3

    .line 701
    new-instance v0, Ll/᩹ۜᩴ;

    iget-object v1, p0, Ll/᩶ۜᩴ;->᩸:Ll/ۙۜᩴ;

    iget v1, v1, Ll/ۙۜᩴ;->ۙ:I

    const/4 v2, 0x0

    invoke-direct {v0, p0, v2, v1}, Ll/᩹ۜᩴ;-><init>(Ll/᩶ۜᩴ;II)V

    return-object v0
.end method

.method public final bridge synthetic spliterator()Ll/ܶ۫ᩴ;
    .locals 1

    .line 620
    invoke-virtual {p0}, Ll/᩶ۜᩴ;->spliterator()Ll/۠ۚᩴ;

    move-result-object v0

    return-object v0
.end method
