.class public final Ll/᩻ۨܺ;
.super Ll/᩸۫ᩴ;
.source "TUG"


# instance fields
.field public final synthetic ᩶:Ll/֫᩺᩷;

.field public ᩸:J

.field public final synthetic ᩹:Ljava/util/Iterator;


# direct methods
.method public constructor <init>(JILjava/util/Iterator;Ll/֫᩺᩷;)V
    .locals 0

    .line 462
    iput-object p4, p0, Ll/᩻ۨܺ;->᩹:Ljava/util/Iterator;

    iput-object p5, p0, Ll/᩻ۨܺ;->᩶:Ll/֫᩺᩷;

    invoke-direct {p0, p1, p2, p3}, Ll/᩸۫ᩴ;-><init>(JI)V

    const-wide/16 p1, 0x0

    .line 463
    iput-wide p1, p0, Ll/᩻ۨܺ;->᩸:J

    return-void
.end method


# virtual methods
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

.method public final tryAdvance(Ljava/util/function/Consumer;)Z
    .locals 5

    .line 467
    iget-object v0, p0, Ll/᩻ۨܺ;->᩹:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 468
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    iget-wide v1, p0, Ll/᩻ۨܺ;->᩸:J

    const-wide/16 v3, 0x1

    add-long/2addr v3, v1

    iput-wide v3, p0, Ll/᩻ۨܺ;->᩸:J

    iget-object v3, p0, Ll/᩻ۨܺ;->᩶:Ll/֫᩺᩷;

    iget-object v3, v3, Ll/֫᩺᩷;->᩸:Ljava/lang/Object;

    check-cast v3, Ll/ۗ֫ۖ;

    .line 1886
    invoke-virtual {v3, v0}, Ll/ۗ֫ۖ;->apply(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const-wide/16 v1, -0x1

    :goto_0
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    .line 468
    invoke-interface {p1, v0}, Ljava/util/function/Consumer;->accept(Ljava/lang/Object;)V

    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method
