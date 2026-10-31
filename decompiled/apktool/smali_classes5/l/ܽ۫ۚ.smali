.class public Ll/ܽ۫ۚ;
.super Ljava/lang/Object;
.source "R7DV"

# interfaces
.implements Ll/۫ۛۚ;


# instance fields
.field public ᩶:Ll/ܺۤۚ;

.field public ᩸:Ljava/util/ArrayList;

.field public ᩹:Z


# direct methods
.method public constructor <init>(Ll/ܺۤۚ;Z)V
    .locals 0

    .line 88
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 89
    iput-object p1, p0, Ll/ܽ۫ۚ;->᩶:Ll/ܺۤۚ;

    .line 90
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Ll/ܽ۫ۚ;->᩸:Ljava/util/ArrayList;

    .line 91
    iput-boolean p2, p0, Ll/ܽ۫ۚ;->᩹:Z

    return-void
.end method


# virtual methods
.method public getLength()I
    .locals 2

    .line 109
    iget-object v0, p0, Ll/ܽ۫ۚ;->᩸:Ljava/util/ArrayList;

    invoke-static {v0}, Ll/ۚ۬ᩴ;->stream(Ljava/util/Collection;)Ll/ܿ᩺ᩴ;

    move-result-object v0

    new-instance v1, Ll/֫۫ۚ;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    invoke-interface {v0, v1}, Ll/ܿ᩺ᩴ;->flatMapToInt(Ljava/util/function/Function;)Ll/ۧ᩺ᩴ;

    move-result-object v0

    invoke-interface {v0}, Ll/ۧ᩺ᩴ;->sum()I

    move-result v0

    add-int/lit8 v0, v0, 0x4

    return v0
.end method

.method public ֫(Ll/ۗۛۚ;)Ll/֫ۨۚ;
    .locals 2

    .line 48
    iget-object v0, p0, Ll/ܽ۫ۚ;->᩸:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۧ۫ۚ;

    .line 49
    invoke-virtual {v1, p1}, Ll/ۧ۫ۚ;->֫(Ll/ۗۛۚ;)Ll/֫ۨۚ;

    goto :goto_0

    :cond_0
    return-object p0
.end method

.method public ֫(Ll/֡۫ۚ;)V
    .locals 2

    .line 100
    iget-object v0, p0, Ll/ܽ۫ۚ;->᩶:Ll/ܺۤۚ;

    iget v0, v0, Ll/ۜۨۚ;->᩸:I

    check-cast p1, Ll/ۛ۫ۚ;

    invoke-virtual {p1, v0}, Ll/ۛ۫ۚ;->ܽ(I)V

    .line 101
    iget-object v0, p0, Ll/ܽ۫ۚ;->᩸:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-virtual {p1, v1}, Ll/ۛ۫ۚ;->ܽ(I)V

    .line 102
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/֫ۨۚ;

    .line 103
    invoke-interface {v1, p1}, Ll/֫ۨۚ;->֫(Ll/֡۫ۚ;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public ֫(Ll/ۧ۫ۚ;)V
    .locals 1

    .line 95
    iget-object v0, p0, Ll/ܽ۫ۚ;->᩸:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final synthetic ۧ()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
