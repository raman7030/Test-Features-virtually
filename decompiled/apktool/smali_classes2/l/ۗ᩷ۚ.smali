.class public final Ll/ۗ᩷ۚ;
.super Ll/ܽ᩷ۚ;
.source "95UO"

# interfaces
.implements Ll/᩺ۜۚ;


# instance fields
.field public final ۧ:Ll/ۧۤᩴ;


# direct methods
.method public constructor <init>(Ll/᩵ۡۚ;)V
    .locals 0

    .line 55
    invoke-direct {p0, p1}, Ll/ܽ᩷ۚ;-><init>(Ll/᩵ۡۚ;)V

    .line 368
    new-instance p1, Ll/ۧۤᩴ;

    invoke-direct {p1}, Ll/ۧۤᩴ;-><init>()V

    .line 52
    iput-object p1, p0, Ll/ۗ᩷ۚ;->ۧ:Ll/ۧۤᩴ;

    return-void
.end method


# virtual methods
.method public final ֫()Ljava/util/Collection;
    .locals 2

    .line 79
    new-instance v0, Ll/ۙ᩷ۚ;

    iget-object v1, p0, Ll/ۗ᩷ۚ;->ۧ:Ll/ۧۤᩴ;

    invoke-virtual {v1}, Ll/ۧۤᩴ;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-direct {v0, v1}, Ll/ۚۢۚ;-><init>(Ljava/util/Collection;)V

    return-object v0
.end method

.method public final ֫(Ll/۠۬֡;)Ll/۫᩷ۚ;
    .locals 2

    .line 60
    iget-object v0, p0, Ll/ۗ᩷ۚ;->ۧ:Ll/ۧۤᩴ;

    invoke-virtual {v0, p1}, Ll/ۧۤᩴ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/۫᩷ۚ;

    if-eqz v1, :cond_0

    return-object v1

    .line 65
    :cond_0
    iget-object v1, p0, Ll/ܽ᩷ۚ;->֫:Ll/᩵ۡۚ;

    invoke-virtual {v1, p1}, Ll/᩵ۡۚ;->֫(Ll/ۤܽۚ;)Ll/ܰ᩷ۚ;

    move-result-object p1

    check-cast p1, Ll/۫᩷ۚ;

    .line 66
    invoke-virtual {v0, p1, p1}, Ll/ۧۤᩴ;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/۫᩷ۚ;

    if-nez v0, :cond_1

    return-object p1

    :cond_1
    return-object v0
.end method

.method public final ۧ(Ljava/lang/Object;)I
    .locals 0

    .line 48
    check-cast p1, Ll/۫᩷ۚ;

    .line 73
    iget p1, p1, Ll/۫᩷ۚ;->᩹:I

    return p1
.end method

.method public final ᩻(Ljava/lang/Object;)Ljava/util/List;
    .locals 0

    .line 48
    check-cast p1, Ll/۫᩷ۚ;

    .line 96
    iget-object p1, p1, Ll/۫᩷ۚ;->᩸:Ljava/util/List;

    return-object p1
.end method
