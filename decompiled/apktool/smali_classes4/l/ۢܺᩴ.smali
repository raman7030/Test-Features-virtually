.class public final Ll/ۢܺᩴ;
.super Ljava/lang/Object;
.source "AAP5"

# interfaces
.implements Ll/ܽܺᩴ;


# instance fields
.field public ᩸:Z

.field public final ᩹:I


# direct methods
.method public constructor <init>(I)V
    .locals 1

    .line 123
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 116
    iput-boolean v0, p0, Ll/ۢܺᩴ;->᩸:Z

    .line 124
    iput p1, p0, Ll/ۢܺᩴ;->᩹:I

    return-void
.end method


# virtual methods
.method public final characteristics()I
    .locals 1

    const/16 v0, 0x4555

    return v0
.end method

.method public final estimateSize()J
    .locals 2

    .line 145
    iget-boolean v0, p0, Ll/ۢܺᩴ;->᩸:Z

    if-eqz v0, :cond_0

    const-wide/16 v0, 0x0

    return-wide v0

    :cond_0
    const-wide/16 v0, 0x1

    return-wide v0
.end method

.method public final bridge synthetic forEachRemaining(Ljava/lang/Object;)V
    .locals 0

    .line 113
    check-cast p1, Ljava/util/function/IntConsumer;

    invoke-virtual {p0, p1}, Ll/ۢܺᩴ;->forEachRemaining(Ljava/util/function/IntConsumer;)V

    return-void
.end method

.method public final synthetic forEachRemaining(Ljava/util/function/Consumer;)V
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ۧܺᩴ;->֫(Ll/ܽܺᩴ;Ljava/util/function/Consumer;)V

    return-void
.end method

.method public final forEachRemaining(Ljava/util/function/IntConsumer;)V
    .locals 1

    .line 155
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 156
    iget-boolean v0, p0, Ll/ۢܺᩴ;->᩸:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    .line 157
    iput-boolean v0, p0, Ll/ۢܺᩴ;->᩸:Z

    .line 158
    iget v0, p0, Ll/ۢܺᩴ;->᩹:I

    invoke-interface {p1, v0}, Ljava/util/function/IntConsumer;->accept(I)V

    :cond_0
    return-void
.end method

.method public final getComparator()Ljava/util/Comparator;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getComparator()Ll/ۙۢᩴ;
    .locals 1

    const/4 v0, 0x0

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

.method public final bridge synthetic tryAdvance(Ljava/lang/Object;)Z
    .locals 0

    .line 113
    check-cast p1, Ljava/util/function/IntConsumer;

    invoke-virtual {p0, p1}, Ll/ۢܺᩴ;->tryAdvance(Ljava/util/function/IntConsumer;)Z

    move-result p1

    return p1
.end method

.method public final synthetic tryAdvance(Ljava/util/function/Consumer;)Z
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ۧܺᩴ;->ۧ(Ll/ܽܺᩴ;Ljava/util/function/Consumer;)Z

    move-result p1

    return p1
.end method

.method public final tryAdvance(Ljava/util/function/IntConsumer;)Z
    .locals 2

    .line 130
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 131
    iget-boolean v0, p0, Ll/ۢܺᩴ;->᩸:Z

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    const/4 v0, 0x1

    .line 133
    iput-boolean v0, p0, Ll/ۢܺᩴ;->᩸:Z

    .line 134
    iget v1, p0, Ll/ۢܺᩴ;->᩹:I

    invoke-interface {p1, v1}, Ljava/util/function/IntConsumer;->accept(I)V

    return v0
.end method

.method public final bridge synthetic trySplit()Ll/֨۫ᩴ;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final bridge synthetic trySplit()Ll/ܶ۫ᩴ;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final bridge synthetic trySplit()Ll/ᩴ۫ᩴ;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method
