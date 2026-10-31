.class public final Ll/ܳۛܺ;
.super Ll/ۛ۬ܺ;
.source "6574"


# instance fields
.field public final transient ۗ:Ll/ۢ۬ܺ;

.field public final transient ۙ:Ll/ܳ۬ܺ;


# direct methods
.method public constructor <init>(Ll/ۢ۬ܺ;Ll/ܳ۬ܺ;)V
    .locals 0

    .line 523
    invoke-direct {p0}, Ll/ۛ۬ܺ;-><init>()V

    .line 524
    iput-object p1, p0, Ll/ܳۛܺ;->ۗ:Ll/ۢ۬ܺ;

    .line 525
    iput-object p2, p0, Ll/ܳۛܺ;->ۙ:Ll/ܳ۬ܺ;

    return-void
.end method


# virtual methods
.method public final contains(Ljava/lang/Object;)Z
    .locals 1

    .line 545
    iget-object v0, p0, Ll/ܳۛܺ;->ۗ:Ll/ۢ۬ܺ;

    invoke-virtual {v0, p1}, Ll/ۢ۬ܺ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final bridge synthetic iterator()Ljava/util/Iterator;
    .locals 1

    .line 519
    invoke-virtual {p0}, Ll/ܳۛܺ;->iterator()Ll/᩶ۨܺ;

    move-result-object v0

    return-object v0
.end method

.method public final iterator()Ll/᩶ۨܺ;
    .locals 2

    .line 540
    iget-object v0, p0, Ll/ܳۛܺ;->ۙ:Ll/ܳ۬ܺ;

    const/4 v1, 0x0

    .line 375
    invoke-virtual {v0, v1}, Ll/ܳ۬ܺ;->listIterator(I)Ll/ۙۨܺ;

    move-result-object v0

    return-object v0
.end method

.method public final size()I
    .locals 1

    .line 555
    iget-object v0, p0, Ll/ܳۛܺ;->ۗ:Ll/ۢ۬ܺ;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    return v0
.end method

.method public writeReplace()Ljava/lang/Object;
    .locals 1

    .line 564
    invoke-super {p0}, Ll/ۛ۬ܺ;->writeReplace()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(I[Ljava/lang/Object;)I
    .locals 1

    .line 540
    iget-object v0, p0, Ll/ܳۛܺ;->ۙ:Ll/ܳ۬ܺ;

    .line 535
    invoke-virtual {v0, p1, p2}, Ll/ܳ۬ܺ;->֫(I[Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method public final ۧ()Ll/ܳ۬ܺ;
    .locals 1

    .line 540
    iget-object v0, p0, Ll/ܳۛܺ;->ۙ:Ll/ܳ۬ܺ;

    return-object v0
.end method

.method public final ܳ()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
