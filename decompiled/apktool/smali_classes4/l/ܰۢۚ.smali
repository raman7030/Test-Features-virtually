.class public final Ll/ܰۢۚ;
.super Ljava/lang/Object;
.source "45YI"

# interfaces
.implements Ll/۟ۜۚ;


# instance fields
.field public final ֫:Ll/ۧۤᩴ;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 46
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 368
    new-instance v0, Ll/ۧۤᩴ;

    invoke-direct {v0}, Ll/ۧۤᩴ;-><init>()V

    .line 48
    iput-object v0, p0, Ll/ܰۢۚ;->֫:Ll/ۧۤᩴ;

    return-void
.end method


# virtual methods
.method public final getItemCount()I
    .locals 1

    .line 104
    iget-object v0, p0, Ll/ܰۢۚ;->֫:Ll/ۧۤᩴ;

    invoke-virtual {v0}, Ll/ۧۤᩴ;->size()I

    move-result v0

    return v0
.end method

.method public final ֫(Ll/ܶܽۚ;)I
    .locals 0

    .line 46
    check-cast p1, Ll/۟ۢۚ;

    .line 76
    iget p1, p1, Ll/۟ۢۚ;->᩸:I

    return p1
.end method

.method public final ֫()Ljava/util/Collection;
    .locals 2

    .line 87
    new-instance v0, Ll/᩺ۢۚ;

    iget-object v1, p0, Ll/ܰۢۚ;->֫:Ll/ۧۤᩴ;

    invoke-virtual {v1}, Ll/ۧۤᩴ;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-direct {v0, v1}, Ll/ۚۢۚ;-><init>(Ljava/util/Collection;)V

    return-object v0
.end method

.method public final ֫(Ljava/lang/String;)Ll/۟ۢۚ;
    .locals 2

    .line 52
    iget-object v0, p0, Ll/ܰۢۚ;->֫:Ll/ۧۤᩴ;

    invoke-virtual {v0, p1}, Ll/ۧۤᩴ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/۟ۢۚ;

    if-eqz v1, :cond_0

    return-object v1

    .line 56
    :cond_0
    new-instance v1, Ll/۟ۢۚ;

    invoke-direct {v1, p1}, Ll/۟ۢۚ;-><init>(Ljava/lang/String;)V

    .line 57
    invoke-virtual {v0, p1, v1}, Ll/ۧۤᩴ;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/۟ۢۚ;

    if-nez p1, :cond_1

    return-object v1

    :cond_1
    return-object p1
.end method

.method public final ۧ()Z
    .locals 2

    .line 81
    iget-object v0, p0, Ll/ܰۢۚ;->֫:Ll/ۧۤᩴ;

    invoke-virtual {v0}, Ll/ۧۤᩴ;->size()I

    move-result v0

    const/high16 v1, 0x10000

    if-le v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ܳ(Ljava/lang/Object;)I
    .locals 0

    .line 46
    check-cast p1, Ll/۟ۢۚ;

    .line 76
    iget p1, p1, Ll/۟ۢۚ;->᩸:I

    return p1
.end method

.method public final ܽ(Ljava/lang/Object;)I
    .locals 0

    .line 46
    check-cast p1, Ll/۟ۢۚ;

    if-nez p1, :cond_0

    const/4 p1, -0x1

    return p1

    .line 71
    :cond_0
    iget p1, p1, Ll/۟ۢۚ;->᩸:I

    return p1
.end method
