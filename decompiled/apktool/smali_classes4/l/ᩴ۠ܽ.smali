.class public final Ll/ᩴ۠ܽ;
.super Ljava/lang/Object;
.source "N9AI"


# instance fields
.field public final ֫:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ᩴ۠ܽ;->֫:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final ֫(I)V
    .locals 2

    .line 47
    iget-object v0, p0, Ll/ᩴ۠ܽ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-le v1, p1, :cond_0

    .line 49
    invoke-virtual {v0, p1, v1}, Ljava/util/ArrayList;->subList(II)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->clear()V

    :cond_0
    return-void
.end method

.method public final ֫(III[I)V
    .locals 2

    const/4 v0, 0x1

    if-le p1, v0, :cond_0

    .line 18
    aget v0, p4, p1

    add-int/lit8 v1, p1, 0x1

    .line 19
    aget p4, p4, v1

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    if-eq p4, v1, :cond_0

    if-eq v0, p2, :cond_0

    if-eq p4, p3, :cond_0

    .line 21
    new-instance p2, Ll/ۗۘܽ;

    div-int/lit8 p1, p1, 0x2

    invoke-direct {p2, p1, v0, p4}, Ll/ۗۘܽ;-><init>(III)V

    iget-object p1, p0, Ll/ᩴ۠ܽ;->֫:Ljava/util/ArrayList;

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method
