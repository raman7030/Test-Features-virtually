.class public final Ll/ۡ᩷ۚ;
.super Ll/ܽ᩷ۚ;
.source "45BU"

# interfaces
.implements Ll/ۜۜۚ;


# instance fields
.field public final ۧ:Ll/ۧۤᩴ;


# direct methods
.method public constructor <init>(Ll/᩵ۡۚ;)V
    .locals 0

    .line 58
    invoke-direct {p0, p1}, Ll/ܽ᩷ۚ;-><init>(Ll/᩵ۡۚ;)V

    .line 368
    new-instance p1, Ll/ۧۤᩴ;

    invoke-direct {p1}, Ll/ۧۤᩴ;-><init>()V

    .line 55
    iput-object p1, p0, Ll/ۡ᩷ۚ;->ۧ:Ll/ۧۤᩴ;

    return-void
.end method


# virtual methods
.method public final ֫()Ljava/util/Collection;
    .locals 2

    .line 105
    new-instance v0, Ll/ۢ᩷ۚ;

    iget-object v1, p0, Ll/ۡ᩷ۚ;->ۧ:Ll/ۧۤᩴ;

    invoke-virtual {v1}, Ll/ۧۤᩴ;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-direct {v0, v1}, Ll/ۚۢۚ;-><init>(Ljava/util/Collection;)V

    return-object v0
.end method

.method public final ֫(Ljava/util/Set;)Ll/ۜ᩷ۚ;
    .locals 3

    if-nez p1, :cond_0

    .line 64
    sget-object p1, Ll/ۜ᩷ۚ;->᩶:Ll/ۜ᩷ۚ;

    return-object p1

    .line 67
    :cond_0
    iget-object v0, p0, Ll/ۡ᩷ۚ;->ۧ:Ll/ۧۤᩴ;

    invoke-virtual {v0, p1}, Ll/ۧۤᩴ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۜ᩷ۚ;

    if-eqz v1, :cond_1

    return-object v1

    .line 72
    :cond_1
    new-instance v1, Ll/ۜ᩷ۚ;

    .line 73
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    new-instance v2, Ll/᩷᩷ۚ;

    invoke-direct {v2, p0}, Ll/᩷᩷ۚ;-><init>(Ll/ۡ᩷ۚ;)V

    invoke-static {p1, v2}, Ll/ۙ۫ܺ;->֫(Ljava/util/Iterator;Ll/ܽܶܺ;)Ljava/util/Iterator;

    move-result-object p1

    invoke-static {p1}, Ll/ۛ۬ܺ;->֫(Ljava/util/Iterator;)Ll/ۛ۬ܺ;

    move-result-object p1

    invoke-direct {v1, p1}, Ll/ۜ᩷ۚ;-><init>(Ll/ۛ۬ܺ;)V

    .line 82
    invoke-virtual {v0, v1, v1}, Ll/ۧۤᩴ;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۜ᩷ۚ;

    if-nez p1, :cond_2

    return-object v1

    :cond_2
    return-object p1
.end method

.method public final ۧ(Ljava/lang/Object;)I
    .locals 0

    .line 51
    check-cast p1, Ll/ۜ᩷ۚ;

    .line 99
    iget p1, p1, Ll/ۜ᩷ۚ;->᩹:I

    return p1
.end method

.method public final ܿ(Ljava/lang/Object;)Ljava/util/Set;
    .locals 0

    .line 51
    check-cast p1, Ll/ۜ᩷ۚ;

    .line 89
    iget-object p1, p1, Ll/ۜ᩷ۚ;->᩸:Ljava/util/Set;

    return-object p1
.end method

.method public final ᩳ(Ljava/lang/Object;)I
    .locals 0

    .line 51
    check-cast p1, Ll/ۜ᩷ۚ;

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return p1

    .line 94
    :cond_0
    iget p1, p1, Ll/ۜ᩷ۚ;->᩹:I

    return p1
.end method
