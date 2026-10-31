.class public final Ll/ᩳۡۚ;
.super Ll/ܽ᩷ۚ;
.source "05ZW"

# interfaces
.implements Ll/֫᩷ۚ;


# instance fields
.field public final ۧ:Ll/ۧۤᩴ;


# direct methods
.method public constructor <init>(Ll/᩵ۡۚ;)V
    .locals 0

    .line 56
    invoke-direct {p0, p1}, Ll/ܽ᩷ۚ;-><init>(Ll/᩵ۡۚ;)V

    .line 368
    new-instance p1, Ll/ۧۤᩴ;

    invoke-direct {p1}, Ll/ۧۤᩴ;-><init>()V

    .line 53
    iput-object p1, p0, Ll/ᩳۡۚ;->ۧ:Ll/ۧۤᩴ;

    return-void
.end method


# virtual methods
.method public final ֫()Ljava/util/Collection;
    .locals 2

    .line 102
    new-instance v0, Ll/ܽۡۚ;

    iget-object v1, p0, Ll/ᩳۡۚ;->ۧ:Ll/ۧۤᩴ;

    invoke-virtual {v1}, Ll/ۧۤᩴ;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-direct {v0, v1}, Ll/ۚۢۚ;-><init>(Ljava/util/Collection;)V

    return-object v0
.end method

.method public final ֫(Ljava/lang/Object;)Ljava/util/List;
    .locals 0

    .line 50
    check-cast p1, Ll/֫ۡۚ;

    if-nez p1, :cond_0

    .line 91
    sget-object p1, Ll/֫ۡۚ;->᩶:Ll/֫ۡۚ;

    return-object p1

    :cond_0
    iget-object p1, p1, Ll/֫ۡۚ;->᩹:Ljava/util/List;

    return-object p1
.end method

.method public final ֫(Ljava/util/List;)Ll/֫ۡۚ;
    .locals 3

    if-eqz p1, :cond_3

    .line 61
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 65
    :cond_0
    iget-object v0, p0, Ll/ᩳۡۚ;->ۧ:Ll/ۧۤᩴ;

    invoke-virtual {v0, p1}, Ll/ۧۤᩴ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/֫ۡۚ;

    if-eqz v1, :cond_1

    return-object v1

    .line 70
    :cond_1
    new-instance v1, Ll/֫ۡۚ;

    new-instance v2, Ll/ۧۡۚ;

    invoke-direct {v2, p0}, Ll/ۧۡۚ;-><init>(Ll/ᩳۡۚ;)V

    .line 71
    invoke-static {p1, v2}, Ll/ۡ۫ܺ;->֫(Ljava/lang/Iterable;Ll/ܽܶܺ;)Ljava/lang/Iterable;

    move-result-object p1

    invoke-static {p1}, Ll/ܳ۬ܺ;->֫(Ljava/lang/Iterable;)Ll/ܳ۬ܺ;

    move-result-object p1

    invoke-direct {v1, p1}, Ll/֫ۡۚ;-><init>(Ll/ܳ۬ܺ;)V

    .line 79
    invoke-virtual {v0, v1, v1}, Ll/ۧۤᩴ;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/֫ۡۚ;

    if-nez p1, :cond_2

    return-object v1

    :cond_2
    return-object p1

    .line 62
    :cond_3
    :goto_0
    sget-object p1, Ll/֫ۡۚ;->᩶:Ll/֫ۡۚ;

    return-object p1
.end method

.method public final ᩳ(Ljava/lang/Object;)I
    .locals 1

    .line 50
    check-cast p1, Ll/֫ۡۚ;

    if-eqz p1, :cond_1

    .line 61
    iget-object v0, p1, Ll/֫ۡۚ;->᩹:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 85
    :cond_0
    iget p1, p1, Ll/֫ۡۚ;->᩸:I

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return p1
.end method
