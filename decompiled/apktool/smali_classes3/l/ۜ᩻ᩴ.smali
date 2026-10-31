.class public final Ll/ۜ᩻ᩴ;
.super Ll/ܳ᩻ᩴ;
.source "K9H"

# interfaces
.implements Ll/ܽܿᩴ;


# instance fields
.field public final synthetic ۫:Ll/᩷᩻ᩴ;


# direct methods
.method public constructor <init>(Ll/᩷᩻ᩴ;)V
    .locals 0

    .line 1281
    iput-object p1, p0, Ll/ۜ᩻ᩴ;->۫:Ll/᩷᩻ᩴ;

    invoke-direct {p0, p1}, Ll/ܳ᩻ᩴ;-><init>(Ll/᩷᩻ᩴ;)V

    return-void
.end method

.method public constructor <init>(Ll/᩷᩻ᩴ;IIZ)V
    .locals 0

    .line 1284
    iput-object p1, p0, Ll/ۜ᩻ᩴ;->۫:Ll/᩷᩻ᩴ;

    .line 1285
    invoke-direct {p0, p1, p2, p3, p4}, Ll/ܳ᩻ᩴ;-><init>(Ll/᩷᩻ᩴ;IIZ)V

    return-void
.end method


# virtual methods
.method public final characteristics()I
    .locals 1

    .line 1290
    iget-boolean v0, p0, Ll/ܳ᩻ᩴ;->᩹:Z

    if-eqz v0, :cond_0

    const/16 v0, 0x100

    return v0

    :cond_0
    const/16 v0, 0x140

    return v0
.end method

.method public final synthetic forEachRemaining(Ljava/util/function/Consumer;)V
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ۧܿᩴ;->֫(Ll/ܽܿᩴ;Ljava/util/function/Consumer;)V

    return-void
.end method

.method public final getComparator()Ljava/util/Comparator;
    .locals 1

    .line 103
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0
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

.method public final synthetic tryAdvance(Ljava/util/function/Consumer;)Z
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ۧܿᩴ;->ۧ(Ll/ܽܿᩴ;Ljava/util/function/Consumer;)Z

    move-result p1

    return p1
.end method

.method public final ֫(IIZ)Ll/ܳ᩻ᩴ;
    .locals 2

    .line 1300
    new-instance v0, Ll/ۜ᩻ᩴ;

    iget-object v1, p0, Ll/ۜ᩻ᩴ;->۫:Ll/᩷᩻ᩴ;

    invoke-direct {v0, v1, p1, p2, p3}, Ll/ۜ᩻ᩴ;-><init>(Ll/᩷᩻ᩴ;IIZ)V

    return-object v0
.end method

.method public final ֫(ILjava/lang/Object;)V
    .locals 1

    .line 1278
    check-cast p2, Ll/ۘᩳᩴ;

    .line 1295
    iget-object v0, p0, Ll/ۜ᩻ᩴ;->۫:Ll/᩷᩻ᩴ;

    iget-object v0, v0, Ll/᩷᩻ᩴ;->ۨ:[F

    aget p1, v0, p1

    invoke-interface {p2, p1}, Ll/ۘᩳᩴ;->֫(F)V

    return-void
.end method
