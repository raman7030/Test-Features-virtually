.class public final Ll/ۘ᩵;
.super Ll/ۙ᩵;
.source "A5X5"


# instance fields
.field public final synthetic ᩳ:Ll/ᩴ᩵;


# direct methods
.method public constructor <init>(Ll/ᩴ᩵;)V
    .locals 0

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 635
    iput-object p1, p0, Ll/ۘ᩵;->ᩳ:Ll/ᩴ᩵;

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/Object;)I
    .locals 1

    .line 648
    iget-object v0, p0, Ll/ۘ᩵;->ᩳ:Ll/ᩴ᩵;

    invoke-virtual {v0, p1}, Ll/ᩴ᩵;->indexOf(Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method public final ֫(II)Ljava/lang/Object;
    .locals 0

    .line 643
    iget-object p2, p0, Ll/ۘ᩵;->ᩳ:Ll/ᩴ᩵;

    iget-object p2, p2, Ll/ᩴ᩵;->᩸:[Ljava/lang/Object;

    aget-object p1, p2, p1

    return-object p1
.end method

.method public final ֫(ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 668
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string p2, "not a map"

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫()V
    .locals 1

    .line 678
    iget-object v0, p0, Ll/ۘ᩵;->ᩳ:Ll/ᩴ᩵;

    invoke-virtual {v0}, Ll/ᩴ᩵;->clear()V

    return-void
.end method

.method public final ֫(I)V
    .locals 1

    .line 673
    iget-object v0, p0, Ll/ۘ᩵;->ᩳ:Ll/ᩴ᩵;

    invoke-virtual {v0, p1}, Ll/ᩴ᩵;->֫(I)V

    return-void
.end method

.method public final ֫(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 663
    iget-object p2, p0, Ll/ۘ᩵;->ᩳ:Ll/ᩴ᩵;

    invoke-virtual {p2, p1}, Ll/ᩴ᩵;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final ۧ(Ljava/lang/Object;)I
    .locals 1

    .line 653
    iget-object v0, p0, Ll/ۘ᩵;->ᩳ:Ll/ᩴ᩵;

    invoke-virtual {v0, p1}, Ll/ᩴ᩵;->indexOf(Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method public final ۧ()Ljava/util/Map;
    .locals 2

    .line 658
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "not a map"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ܽ()I
    .locals 1

    .line 638
    iget-object v0, p0, Ll/ۘ᩵;->ᩳ:Ll/ᩴ᩵;

    iget v0, v0, Ll/ᩴ᩵;->ۙ:I

    return v0
.end method
