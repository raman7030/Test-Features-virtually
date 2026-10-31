.class public final Ll/ܳۡۚ;
.super Ll/ܽ᩷ۚ;
.source "V5J6"

# interfaces
.implements Ll/ۧ᩷ۚ;


# instance fields
.field public final ۧ:Ll/ۧۤᩴ;


# direct methods
.method public constructor <init>(Ll/᩵ۡۚ;)V
    .locals 0

    .line 52
    invoke-direct {p0, p1}, Ll/ܽ᩷ۚ;-><init>(Ll/᩵ۡۚ;)V

    .line 368
    new-instance p1, Ll/ۧۤᩴ;

    invoke-direct {p1}, Ll/ۧۤᩴ;-><init>()V

    .line 49
    iput-object p1, p0, Ll/ܳۡۚ;->ۧ:Ll/ۧۤᩴ;

    return-void
.end method


# virtual methods
.method public final getItemCount()I
    .locals 1

    .line 111
    iget-object v0, p0, Ll/ܳۡۚ;->ۧ:Ll/ۧۤᩴ;

    invoke-virtual {v0}, Ll/ۧۤᩴ;->size()I

    move-result v0

    return v0
.end method

.method public final ֫(Ll/᩸ܽۚ;)I
    .locals 0

    .line 46
    check-cast p1, Ll/᩻ۡۚ;

    .line 56
    iget p1, p1, Ll/᩻ۡۚ;->᩸:I

    return p1
.end method

.method public final ֫()Ljava/util/Collection;
    .locals 2

    .line 94
    new-instance v0, Ll/ܿۡۚ;

    iget-object v1, p0, Ll/ܳۡۚ;->ۧ:Ll/ۧۤᩴ;

    invoke-virtual {v1}, Ll/ۧۤᩴ;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-direct {v0, v1}, Ll/ۚۢۚ;-><init>(Ljava/util/Collection;)V

    return-object v0
.end method

.method public final ֫(Ljava/lang/CharSequence;)Ll/۟ۢۚ;
    .locals 0

    .line 46
    check-cast p1, Ll/᩻ۡۚ;

    .line 78
    iget-object p1, p1, Ll/᩻ۡۚ;->᩹:Ll/۟ۢۚ;

    return-object p1
.end method

.method public final ֫(Ljava/lang/String;)Ll/᩻ۡۚ;
    .locals 3

    .line 57
    iget-object v0, p0, Ll/ܳۡۚ;->ۧ:Ll/ۧۤᩴ;

    invoke-virtual {v0, p1}, Ll/ۧۤᩴ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩻ۡۚ;

    if-eqz v1, :cond_0

    return-object v1

    .line 61
    :cond_0
    iget-object v1, p0, Ll/ܽ᩷ۚ;->֫:Ll/᩵ۡۚ;

    iget-object v1, v1, Ll/᩸ۜۚ;->ᩳ֫:Ll/۟ۜۚ;

    check-cast v1, Ll/ܰۢۚ;

    invoke-virtual {v1, p1}, Ll/ܰۢۚ;->֫(Ljava/lang/String;)Ll/۟ۢۚ;

    move-result-object v1

    .line 62
    new-instance v2, Ll/᩻ۡۚ;

    invoke-direct {v2, v1}, Ll/᩻ۡۚ;-><init>(Ll/۟ۢۚ;)V

    .line 63
    invoke-virtual {v0, p1, v2}, Ll/ۧۤᩴ;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/᩻ۡۚ;

    if-nez p1, :cond_1

    return-object v2

    :cond_1
    return-object p1
.end method

.method public final ܳ(Ljava/lang/Object;)I
    .locals 0

    .line 46
    check-cast p1, Ll/᩻ۡۚ;

    .line 56
    iget p1, p1, Ll/᩻ۡۚ;->᩸:I

    return p1
.end method

.method public final ܽ(Ljava/lang/Object;)I
    .locals 0

    .line 46
    check-cast p1, Ll/᩻ۡۚ;

    if-nez p1, :cond_0

    const/4 p1, -0x1

    return p1

    .line 83
    :cond_0
    iget p1, p1, Ll/᩻ۡۚ;->᩸:I

    return p1
.end method
