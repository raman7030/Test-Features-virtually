.class public final Ll/۬ۗܺ;
.super Ll/ۜ۬ܺ;
.source "M5U2"


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x4

    .line 453
    invoke-direct {p0, v0}, Ll/ۜ۬ܺ;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/Object;Ljava/lang/Object;)Ll/ۜ۬ܺ;
    .locals 0

    .line 380
    invoke-super {p0, p1, p2}, Ll/ۜ۬ܺ;->֫(Ljava/lang/Object;Ljava/lang/Object;)Ll/ۜ۬ܺ;

    return-object p0
.end method

.method public final ֫()Ll/ۢ۬ܺ;
    .locals 1

    const/4 v0, 0x0

    throw v0
.end method

.method public final ֫(Ljava/lang/Integer;Ljava/lang/String;)V
    .locals 0

    .line 380
    invoke-super {p0, p1, p2}, Ll/ۜ۬ܺ;->֫(Ljava/lang/Object;Ljava/lang/Object;)Ll/ۜ۬ܺ;

    return-void
.end method

.method public final bridge synthetic ۧ()Ll/ۢ۬ܺ;
    .locals 1

    .line 360
    invoke-virtual {p0}, Ll/۬ۗܺ;->ۧ()Ll/ۤۗܺ;

    move-result-object v0

    return-object v0
.end method

.method public final ۧ()Ll/ۤۗܺ;
    .locals 3

    .line 475
    iget v0, p0, Ll/ۜ۬ܺ;->ܽ:I

    if-nez v0, :cond_0

    .line 77
    sget-object v0, Ll/ۧۛܺ;->ۨ:Ll/ۧۛܺ;

    return-object v0

    .line 485
    :cond_0
    new-instance v0, Ll/ۧۛܺ;

    iget-object v1, p0, Ll/ۜ۬ܺ;->֫:[Ljava/lang/Object;

    iget v2, p0, Ll/ۜ۬ܺ;->ܽ:I

    invoke-direct {v0, v2, v1}, Ll/ۧۛܺ;-><init>(I[Ljava/lang/Object;)V

    return-object v0
.end method
