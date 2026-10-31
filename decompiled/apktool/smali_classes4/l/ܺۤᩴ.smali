.class public final Ll/ܺۤᩴ;
.super Ll/ܶۤᩴ;
.source "N673"

# interfaces
.implements Ll/ܶ۫ᩴ;


# instance fields
.field public final i:Ll/ۧۤᩴ;

.field public j:J


# direct methods
.method public constructor <init>([Ll/֡ۤᩴ;IIIJLl/ۧۤᩴ;)V
    .locals 0

    .line 3633
    invoke-direct {p0, p1, p2, p3, p4}, Ll/ܶۤᩴ;-><init>([Ll/֡ۤᩴ;III)V

    .line 3634
    iput-object p7, p0, Ll/ܺۤᩴ;->i:Ll/ۧۤᩴ;

    .line 3635
    iput-wide p5, p0, Ll/ܺۤᩴ;->j:J

    return-void
.end method


# virtual methods
.method public final characteristics()I
    .locals 1

    const/16 v0, 0x1101

    return v0
.end method

.method public final estimateSize()J
    .locals 2

    .line 3660
    iget-wide v0, p0, Ll/ܺۤᩴ;->j:J

    return-wide v0
.end method

.method public final forEachRemaining(Ljava/util/function/Consumer;)V
    .locals 4

    .line 3646
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3647
    :goto_0
    invoke-virtual {p0}, Ll/ܶۤᩴ;->a()Ll/֡ۤᩴ;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 3648
    new-instance v1, Ll/᩵ۤᩴ;

    iget-object v2, v0, Ll/֡ۤᩴ;->b:Ljava/lang/Object;

    iget-object v0, v0, Ll/֡ۤᩴ;->c:Ljava/lang/Object;

    iget-object v3, p0, Ll/ܺۤᩴ;->i:Ll/ۧۤᩴ;

    invoke-direct {v1, v2, v0, v3}, Ll/᩵ۤᩴ;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ll/ۧۤᩴ;)V

    invoke-interface {p1, v1}, Ljava/util/function/Consumer;->accept(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final synthetic getComparator()Ljava/util/Comparator;
    .locals 1

    invoke-static {p0}, Ll/ۖ۫ᩴ;->$default$getComparator(Ll/ܶ۫ᩴ;)Ljava/util/Comparator;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic getExactSizeIfKnown()J
    .locals 2

    invoke-static {p0}, Ll/ۖ۫ᩴ;->$default$getExactSizeIfKnown(Ll/ܶ۫ᩴ;)J

    move-result-wide v0

    return-wide v0
.end method

.method public final synthetic hasCharacteristics(I)Z
    .locals 0

    invoke-static {p0, p1}, Ll/ۖ۫ᩴ;->$default$hasCharacteristics(Ll/ܶ۫ᩴ;I)Z

    move-result p1

    return p1
.end method

.method public final tryAdvance(Ljava/util/function/Consumer;)Z
    .locals 4

    .line 3652
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3654
    invoke-virtual {p0}, Ll/ܶۤᩴ;->a()Ll/֡ۤᩴ;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 3656
    :cond_0
    new-instance v1, Ll/᩵ۤᩴ;

    iget-object v2, v0, Ll/֡ۤᩴ;->b:Ljava/lang/Object;

    iget-object v0, v0, Ll/֡ۤᩴ;->c:Ljava/lang/Object;

    iget-object v3, p0, Ll/ܺۤᩴ;->i:Ll/ۧۤᩴ;

    invoke-direct {v1, v2, v0, v3}, Ll/᩵ۤᩴ;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ll/ۧۤᩴ;)V

    invoke-interface {p1, v1}, Ljava/util/function/Consumer;->accept(Ljava/lang/Object;)V

    const/4 p1, 0x1

    return p1
.end method

.method public final trySplit()Ll/ܶ۫ᩴ;
    .locals 9

    .line 3640
    iget v0, p0, Ll/ܶۤᩴ;->f:I

    iget v5, p0, Ll/ܶۤᩴ;->g:I

    add-int v1, v0, v5

    ushr-int/lit8 v4, v1, 0x1

    if-gt v4, v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 3641
    :cond_0
    new-instance v0, Ll/ܺۤᩴ;

    const/4 v1, 0x1

    iget-object v2, p0, Ll/ܶۤᩴ;->a:[Ll/֡ۤᩴ;

    iput v4, p0, Ll/ܶۤᩴ;->g:I

    iget-wide v6, p0, Ll/ܺۤᩴ;->j:J

    ushr-long/2addr v6, v1

    iput-wide v6, p0, Ll/ܺۤᩴ;->j:J

    iget-object v8, p0, Ll/ܺۤᩴ;->i:Ll/ۧۤᩴ;

    iget v3, p0, Ll/ܶۤᩴ;->h:I

    move-object v1, v0

    invoke-direct/range {v1 .. v8}, Ll/ܺۤᩴ;-><init>([Ll/֡ۤᩴ;IIIJLl/ۧۤᩴ;)V

    return-object v0
.end method
