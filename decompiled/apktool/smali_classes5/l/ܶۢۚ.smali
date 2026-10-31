.class public final Ll/ܶۢۚ;
.super Ll/ܽ᩷ۚ;
.source "Z69Q"

# interfaces
.implements Ll/۫ۜۚ;


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
    iput-object p1, p0, Ll/ܶۢۚ;->ۧ:Ll/ۧۤᩴ;

    return-void
.end method


# virtual methods
.method public final getItemCount()I
    .locals 1

    .line 128
    iget-object v0, p0, Ll/ܶۢۚ;->ۧ:Ll/ۧۤᩴ;

    invoke-virtual {v0}, Ll/ۧۤᩴ;->size()I

    move-result v0

    return v0
.end method

.method public final ֫()Ljava/util/Collection;
    .locals 2

    .line 111
    new-instance v0, Ll/۠ۢۚ;

    iget-object v1, p0, Ll/ܶۢۚ;->ۧ:Ll/ۧۤᩴ;

    invoke-virtual {v1}, Ll/ۧۤᩴ;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-direct {v0, v1}, Ll/ۚۢۚ;-><init>(Ljava/util/Collection;)V

    return-object v0
.end method

.method public final ֫(Ll/᩵ܽۚ;)Ll/ᩴۢۚ;
    .locals 0

    .line 49
    check-cast p1, Ll/᩸ۢۚ;

    .line 59
    iget-object p1, p1, Ll/᩸ۢۚ;->᩹:Ll/᩵۬֡;

    .line 95
    check-cast p1, Ll/ᩴۢۚ;

    return-object p1
.end method

.method public final ۧ(Ll/᩵ܽۚ;)Ll/۫ۢۚ;
    .locals 0

    .line 49
    check-cast p1, Ll/᩸ۢۚ;

    .line 59
    iget-object p1, p1, Ll/᩸ۢۚ;->᩹:Ll/᩵۬֡;

    .line 100
    check-cast p1, Ll/۫ۢۚ;

    return-object p1
.end method

.method public final ܳ(Ljava/lang/Object;)I
    .locals 0

    .line 49
    check-cast p1, Ll/᩸ۢۚ;

    .line 105
    iget p1, p1, Ll/᩸ۢۚ;->᩸:I

    return p1
.end method

.method public final ܽ(Ll/᩵ܽۚ;)Ll/᩸ۢۚ;
    .locals 3

    .line 60
    iget-object v0, p0, Ll/ܶۢۚ;->ۧ:Ll/ۧۤᩴ;

    invoke-virtual {v0, p1}, Ll/ۧۤᩴ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩸ۢۚ;

    if-eqz v1, :cond_0

    return-object v1

    .line 66
    :cond_0
    invoke-interface {p1}, Ll/᩵ܽۚ;->֫ۧ()I

    move-result v1

    iget-object v2, p0, Ll/ܽ᩷ۚ;->֫:Ll/᩵ۡۚ;

    packed-switch v1, :pswitch_data_0

    .line 83
    new-instance v0, Ll/ܶ᩵ۚ;

    .line 84
    invoke-interface {p1}, Ll/᩵ܽۚ;->֫ۧ()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const/4 p1, 0x0

    const-string v2, "Invalid method handle type: %d"

    .line 46
    invoke-direct {v0, p1, v2, v1}, Ll/ܶ᩵ۚ;-><init>(Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 84
    throw v0

    .line 80
    :pswitch_0
    invoke-interface {p1}, Ll/᩵ܽۚ;->᩻ۧ()Ll/۠ܽۚ;

    move-result-object v1

    check-cast v1, Ll/ۚܽۚ;

    .line 298
    iget-object v2, v2, Ll/᩸ۜۚ;->ۙ:Ll/ۗۢۚ;

    invoke-virtual {v2, v1}, Ll/ۗۢۚ;->ᩳ(Ll/ۚܽۚ;)Ll/۫ۢۚ;

    move-result-object v1

    goto :goto_0

    .line 72
    :pswitch_1
    invoke-interface {p1}, Ll/᩵ܽۚ;->᩻ۧ()Ll/۠ܽۚ;

    move-result-object v1

    check-cast v1, Ll/ᩴܽۚ;

    .line 293
    iget-object v2, v2, Ll/᩸ۜۚ;->ۚ:Ll/ۘۢۚ;

    invoke-virtual {v2, v1}, Ll/ۘۢۚ;->ᩳ(Ll/ᩴܽۚ;)Ll/ᩴۢۚ;

    move-result-object v1

    .line 87
    :goto_0
    new-instance v2, Ll/᩸ۢۚ;

    invoke-interface {p1}, Ll/᩵ܽۚ;->֫ۧ()I

    move-result p1

    invoke-direct {v2, p1, v1}, Ll/᩸ۢۚ;-><init>(ILl/ۨۢۚ;)V

    .line 89
    invoke-virtual {v0, v2, v2}, Ll/ۧۤᩴ;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/᩸ۢۚ;

    if-nez p1, :cond_1

    return-object v2

    :cond_1
    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method
