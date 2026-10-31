.class public abstract Ll/ۜۨܺ;
.super Ljava/lang/Object;
.source "TUG"

# interfaces
.implements Ll/ܶ۫ᩴ;


# instance fields
.field public final ᩸:Ll/ܶ۫ᩴ;

.field public ᩹:J


# direct methods
.method public constructor <init>(Ll/ܶ۫ᩴ;J)V
    .locals 0

    .line 780
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 781
    iput-object p1, p0, Ll/ۜۨܺ;->᩸:Ll/ܶ۫ᩴ;

    .line 782
    iput-wide p2, p0, Ll/ۜۨܺ;->᩹:J

    return-void
.end method


# virtual methods
.method public final characteristics()I
    .locals 1

    .line 807
    iget-object v0, p0, Ll/ۜۨܺ;->᩸:Ll/ܶ۫ᩴ;

    invoke-interface {v0}, Ll/ܶ۫ᩴ;->characteristics()I

    move-result v0

    and-int/lit16 v0, v0, 0x4050

    return v0
.end method

.method public final estimateSize()J
    .locals 2

    .line 802
    iget-object v0, p0, Ll/ۜۨܺ;->᩸:Ll/ܶ۫ᩴ;

    invoke-interface {v0}, Ll/ܶ۫ᩴ;->estimateSize()J

    move-result-wide v0

    return-wide v0
.end method

.method public synthetic forEachRemaining(Ljava/util/function/Consumer;)V
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ۖ۫ᩴ;->$default$forEachRemaining(Ll/ܶ۫ᩴ;Ljava/util/function/Consumer;)V

    return-void
.end method

.method public synthetic getComparator()Ljava/util/Comparator;
    .locals 1

    .line 0
    invoke-static {p0}, Ll/ۖ۫ᩴ;->$default$getComparator(Ll/ܶ۫ᩴ;)Ljava/util/Comparator;

    move-result-object v0

    return-object v0
.end method

.method public synthetic getExactSizeIfKnown()J
    .locals 2

    .line 0
    invoke-static {p0}, Ll/ۖ۫ᩴ;->$default$getExactSizeIfKnown(Ll/ܶ۫ᩴ;)J

    move-result-wide v0

    return-wide v0
.end method

.method public synthetic hasCharacteristics(I)Z
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ۖ۫ᩴ;->$default$hasCharacteristics(Ll/ܶ۫ᩴ;I)Z

    move-result p1

    return p1
.end method

.method public final trySplit()Ll/ܶ۫ᩴ;
    .locals 7

    .line 789
    iget-object v0, p0, Ll/ۜۨܺ;->᩸:Ll/ܶ۫ᩴ;

    invoke-interface {v0}, Ll/ܶ۫ᩴ;->trySplit()Ll/ܶ۫ᩴ;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 795
    :cond_0
    iget-wide v1, p0, Ll/ۜۨܺ;->᩹:J

    move-object v3, p0

    check-cast v3, Ll/ܳۨܺ;

    .line 506
    new-instance v4, Ll/ܳۨܺ;

    iget-object v3, v3, Ll/ܳۨܺ;->ۙ:Ll/֫᩺᩷;

    invoke-direct {v4, v0, v1, v2, v3}, Ll/ܳۨܺ;-><init>(Ll/ܶ۫ᩴ;JLl/֫᩺᩷;)V

    .line 796
    invoke-interface {v0}, Ll/ܶ۫ᩴ;->getExactSizeIfKnown()J

    move-result-wide v5

    add-long/2addr v5, v1

    iput-wide v5, p0, Ll/ۜۨܺ;->᩹:J

    return-object v4
.end method
