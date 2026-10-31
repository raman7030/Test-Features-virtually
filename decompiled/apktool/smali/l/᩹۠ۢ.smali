.class public final Ll/᩹۠ۢ;
.super Ll/ۧۙۧ;
.source "998H"


# instance fields
.field public final synthetic ֫:Ljava/util/ArrayList;

.field public final synthetic ۧ:Ljava/util/List;


# direct methods
.method public constructor <init>(Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    .locals 0

    .line 332
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 126
    iput-object p1, p0, Ll/᩹۠ۢ;->ۧ:Ljava/util/List;

    iput-object p2, p0, Ll/᩹۠ۢ;->֫:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final ֫()I
    .locals 1

    .line 134
    iget-object v0, p0, Ll/᩹۠ۢ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public final ֫(II)Z
    .locals 1

    .line 144
    iget-object v0, p0, Ll/᩹۠ۢ;->ۧ:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    iget-object v0, p0, Ll/᩹۠ۢ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ۧ()I
    .locals 1

    .line 129
    iget-object v0, p0, Ll/᩹۠ۢ;->ۧ:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public final ۧ(II)Z
    .locals 1

    .line 139
    iget-object v0, p0, Ll/᩹۠ۢ;->ۧ:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۘ۠ۢ;

    invoke-virtual {p1}, Ll/ۘ۠ۢ;->۫()I

    move-result p1

    iget-object v0, p0, Ll/᩹۠ۢ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/ۘ۠ۢ;

    invoke-virtual {p2}, Ll/ۘ۠ۢ;->۫()I

    move-result p2

    if-ne p1, p2, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
