.class public final Ll/᩵ۜܽ;
.super Ll/ۤᩳܽ;
.source "F54P"


# instance fields
.field public final ۗ:Ljava/util/ArrayList;

.field public ۬:I


# direct methods
.method public constructor <init>(Ll/ᩴۜܽ;Ll/ۛۜܽ;Ll/֫ᩳܽ;)V
    .locals 1

    const/4 v0, 0x0

    .line 18
    invoke-direct {p0, p1, v0}, Ll/ۤᩳܽ;-><init>(Ll/۠ᩳܽ;I)V

    .line 15
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Ll/᩵ۜܽ;->ۗ:Ljava/util/ArrayList;

    .line 19
    invoke-virtual {p0, p2, p3}, Ll/ۤᩳܽ;->֫(Ll/ۛۜܽ;Ll/֫ᩳܽ;)I

    move-result p1

    iput p1, p0, Ll/᩵ۜܽ;->۬:I

    return-void
.end method


# virtual methods
.method public final ֫()Ll/ۢ᩻ܽ;
    .locals 1

    .line 64
    invoke-super {p0}, Ll/ۤᩳܽ;->֫()Ll/ۢ᩻ܽ;

    move-result-object v0

    check-cast v0, Ll/ۚۜܽ;

    return-object v0
.end method

.method public final ֫(Ll/ۡۜܽ;)V
    .locals 1

    .line 53
    iget-object v0, p0, Ll/᩵ۜܽ;->ۗ:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 54
    invoke-virtual {p1}, Ll/ۡۜܽ;->ۚ֫()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 55
    invoke-virtual {p1}, Ll/ۡۜܽ;->֨()I

    move-result p1

    add-int/lit8 p1, p1, 0x1

    .line 56
    iget v0, p0, Ll/᩵ۜܽ;->۬:I

    if-le p1, v0, :cond_0

    .line 57
    iput p1, p0, Ll/᩵ۜܽ;->۬:I

    :cond_0
    return-void
.end method

.method public final ۜ֫()I
    .locals 1

    .line 29
    iget-object v0, p0, Ll/᩵ۜܽ;->ۗ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public final ۢ֫()V
    .locals 2

    .line 49
    new-instance v0, Ll/۫ᩳܽ;

    .line 179
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 49
    iget-object v1, p0, Ll/᩵ۜܽ;->ۗ:Ljava/util/ArrayList;

    invoke-static {v1, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    return-void
.end method

.method public final ۧ()Ll/ۘ᩻ܽ;
    .locals 1

    .line 69
    invoke-super {p0}, Ll/ۤᩳܽ;->ۧ()Ll/ۘ᩻ܽ;

    move-result-object v0

    check-cast v0, Ll/ᩴۜܽ;

    return-object v0
.end method

.method public final ۧ()Ll/ᩴۜܽ;
    .locals 1

    .line 69
    invoke-super {p0}, Ll/ۤᩳܽ;->ۧ()Ll/ۘ᩻ܽ;

    move-result-object v0

    check-cast v0, Ll/ᩴۜܽ;

    return-object v0
.end method

.method public final ܿ(I)Ll/ۜ᩻ܽ;
    .locals 1

    .line 34
    iget-object v0, p0, Ll/᩵ۜܽ;->ۗ:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۡۜܽ;

    return-object p1
.end method

.method public final ᩷()I
    .locals 1

    .line 24
    iget v0, p0, Ll/᩵ۜܽ;->۬:I

    return v0
.end method
