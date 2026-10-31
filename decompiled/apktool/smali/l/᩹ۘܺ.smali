.class public final Ll/᩹ۘܺ;
.super Ljava/lang/Object;
.source "VB9Q"


# instance fields
.field public final ֫:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(I)V
    .locals 3

    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Ll/᩹ۘܺ;->֫:Ljava/util/ArrayList;

    const/4 v0, 0x0

    :goto_0
    if-ge v0, p1, :cond_1

    .line 44
    iget-object v1, p0, Ll/᩹ۘܺ;->֫:Ljava/util/ArrayList;

    const/16 v2, 0xc00

    if-gt p1, v2, :cond_0

    .line 81
    new-instance v2, Ll/᩺ۘܺ;

    invoke-direct {v2, p1}, Ll/᩺ۘܺ;-><init>(I)V

    goto :goto_1

    .line 82
    :cond_0
    new-instance v2, Ll/ۘᩴܺ;

    invoke-direct {v2}, Ll/ۘᩴܺ;-><init>()V

    .line 44
    :goto_1
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method


# virtual methods
.method public final ֫(II)V
    .locals 4

    .line 56
    invoke-static {p1, p2}, Ljava/lang/Math;->max(II)I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    .line 96
    iget-object v1, p0, Ll/᩹ۘܺ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    .line 98
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->ensureCapacity(I)V

    :goto_0
    if-ge v2, v0, :cond_1

    const/16 v3, 0xc00

    if-gt v0, v3, :cond_0

    .line 81
    new-instance v3, Ll/᩺ۘܺ;

    invoke-direct {v3, v0}, Ll/᩺ۘܺ;-><init>(I)V

    goto :goto_1

    .line 82
    :cond_0
    new-instance v3, Ll/ۘᩴܺ;

    invoke-direct {v3}, Ll/ۘᩴܺ;-><init>()V

    .line 101
    :goto_1
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 58
    :cond_1
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۢᩴܺ;

    invoke-interface {v0, p2}, Ll/ۢᩴܺ;->add(I)V

    .line 59
    invoke-virtual {v1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/ۢᩴܺ;

    invoke-interface {p2, p1}, Ll/ۢᩴܺ;->add(I)V

    return-void
.end method

.method public final ֫(ILl/ۢᩴܺ;)V
    .locals 2

    .line 85
    iget-object v0, p0, Ll/᩹ۘܺ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge p1, v1, :cond_0

    .line 86
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۢᩴܺ;

    invoke-interface {p2, p1}, Ll/ۢᩴܺ;->֫(Ll/ۢᩴܺ;)V

    :cond_0
    return-void
.end method
