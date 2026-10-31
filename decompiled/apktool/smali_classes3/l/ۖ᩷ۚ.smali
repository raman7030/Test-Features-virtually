.class public final Ll/ۖ᩷ۚ;
.super Ll/ܽ᩷ۚ;
.source "C5E9"

# interfaces
.implements Ll/᩷ۜۚ;


# instance fields
.field public ۧ:I

.field public final ܽ:Ll/ۧۤᩴ;


# direct methods
.method public constructor <init>(Ll/᩵ۡۚ;)V
    .locals 0

    .line 54
    invoke-direct {p0, p1}, Ll/ܽ᩷ۚ;-><init>(Ll/᩵ۡۚ;)V

    .line 368
    new-instance p1, Ll/ۧۤᩴ;

    invoke-direct {p1}, Ll/ۧۤᩴ;-><init>()V

    .line 51
    iput-object p1, p0, Ll/ۖ᩷ۚ;->ܽ:Ll/ۧۤᩴ;

    return-void
.end method


# virtual methods
.method public final getItemCount()I
    .locals 1

    .line 100
    iget-object v0, p0, Ll/ۖ᩷ۚ;->ܽ:Ll/ۧۤᩴ;

    invoke-virtual {v0}, Ll/ۧۤᩴ;->size()I

    move-result v0

    return v0
.end method

.method public final ֫()Ljava/util/Collection;
    .locals 2

    .line 83
    new-instance v0, Ll/ܺ᩷ۚ;

    iget-object v1, p0, Ll/ۖ᩷ۚ;->ܽ:Ll/ۧۤᩴ;

    invoke-virtual {v1}, Ll/ۧۤᩴ;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-direct {v0, v1}, Ll/ۚۢۚ;-><init>(Ljava/util/Collection;)V

    return-object v0
.end method

.method public final ֫(Ll/ۘܽۚ;)Ll/۫᩷ۚ;
    .locals 0

    .line 47
    check-cast p1, Ll/ۘ᩷ۚ;

    .line 72
    iget-object p1, p1, Ll/ۘ᩷ۚ;->᩸:Ll/۫᩷ۚ;

    return-object p1
.end method

.method public final ֫(I)V
    .locals 0

    .line 112
    iput p1, p0, Ll/ۖ᩷ۚ;->ۧ:I

    return-void
.end method

.method public final ۧ(Ll/ۘܽۚ;)Ll/ۘ᩷ۚ;
    .locals 3

    .line 59
    iget-object v0, p0, Ll/ۖ᩷ۚ;->ܽ:Ll/ۧۤᩴ;

    invoke-virtual {v0, p1}, Ll/ۧۤᩴ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۘ᩷ۚ;

    if-eqz v1, :cond_0

    return-object v1

    .line 63
    :cond_0
    iget-object v1, p0, Ll/ܽ᩷ۚ;->֫:Ll/᩵ۡۚ;

    iget-object v1, v1, Ll/᩸ۜۚ;->᩵:Ll/ۗ᩷ۚ;

    .line 64
    invoke-static {p1}, Ll/۫ۡۚ;->֫(Ll/ۘܽۚ;)Ll/᩶ܽۚ;

    move-result-object v2

    .line 63
    check-cast v2, Ll/۠۬֡;

    invoke-virtual {v1, v2}, Ll/ۗ᩷ۚ;->֫(Ll/۠۬֡;)Ll/۫᩷ۚ;

    move-result-object v1

    .line 65
    new-instance v2, Ll/ۘ᩷ۚ;

    invoke-interface {p1}, Ll/ۘܽۚ;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v2, p1, v1}, Ll/ۘ᩷ۚ;-><init>(Ljava/lang/String;Ll/۫᩷ۚ;)V

    .line 66
    invoke-virtual {v0, v2, v2}, Ll/ۧۤᩴ;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۘ᩷ۚ;

    if-nez p1, :cond_1

    return-object v2

    :cond_1
    return-object p1
.end method

.method public final ܳ(Ljava/lang/Object;)I
    .locals 0

    .line 47
    check-cast p1, Ll/ۘ᩷ۚ;

    .line 77
    iget p1, p1, Ll/ۘ᩷ۚ;->᩹:I

    return p1
.end method

.method public final ܽ()I
    .locals 2

    .line 100
    iget-object v0, p0, Ll/ۖ᩷ۚ;->ܽ:Ll/ۧۤᩴ;

    invoke-virtual {v0}, Ll/ۧۤᩴ;->size()I

    move-result v0

    .line 107
    iget v1, p0, Ll/ۖ᩷ۚ;->ۧ:I

    add-int/2addr v1, v0

    return v1
.end method
