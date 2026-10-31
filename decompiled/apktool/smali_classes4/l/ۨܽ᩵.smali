.class public final Ll/ۨܽ᩵;
.super Ljava/lang/Object;
.source "N673"

# interfaces
.implements Ll/ܶ۫ᩴ;
.implements Ljava/util/function/Consumer;


# static fields
.field public static final d:Ljava/lang/Object;


# instance fields
.field public final a:Ll/ܶ۫ᩴ;

.field public final b:Ll/ۧۤᩴ;

.field public c:Ljava/lang/Object;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1248
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ll/ۨܽ᩵;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ll/ܶ۫ᩴ;Ll/ۧۤᩴ;)V
    .locals 0

    .line 1263
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1264
    iput-object p1, p0, Ll/ۨܽ᩵;->a:Ll/ܶ۫ᩴ;

    .line 1265
    iput-object p2, p0, Ll/ۨܽ᩵;->b:Ll/ۧۤᩴ;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 0

    .line 1270
    iput-object p1, p0, Ll/ۨܽ᩵;->c:Ljava/lang/Object;

    return-void
.end method

.method public final synthetic andThen(Ljava/util/function/Consumer;)Ljava/util/function/Consumer;
    .locals 0

    invoke-static {p0, p1}, Ll/᩻ۛᩴ;->$default$andThen(Ljava/util/function/Consumer;Ljava/util/function/Consumer;)Ljava/util/function/Consumer;

    move-result-object p1

    return-object p1
.end method

.method public final characteristics()I
    .locals 1

    .line 1312
    iget-object v0, p0, Ll/ۨܽ᩵;->a:Ll/ܶ۫ᩴ;

    invoke-interface {v0}, Ll/ܶ۫ᩴ;->characteristics()I

    move-result v0

    and-int/lit16 v0, v0, -0x4055

    or-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public final estimateSize()J
    .locals 2

    .line 1307
    iget-object v0, p0, Ll/ۨܽ᩵;->a:Ll/ܶ۫ᩴ;

    invoke-interface {v0}, Ll/ܶ۫ᩴ;->estimateSize()J

    move-result-wide v0

    return-wide v0
.end method

.method public final forEachRemaining(Ljava/util/function/Consumer;)V
    .locals 2

    .line 1292
    new-instance v0, Ll/ۤܶᩴ;

    const/16 v1, 0x8

    invoke-direct {v0, v1, p0, p1}, Ll/ۤܶᩴ;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    iget-object p1, p0, Ll/ۨܽ᩵;->a:Ll/ܶ۫ᩴ;

    invoke-interface {p1, v0}, Ll/ܶ۫ᩴ;->forEachRemaining(Ljava/util/function/Consumer;)V

    return-void
.end method

.method public final getComparator()Ljava/util/Comparator;
    .locals 1

    .line 1319
    iget-object v0, p0, Ll/ۨܽ᩵;->a:Ll/ܶ۫ᩴ;

    invoke-interface {v0}, Ll/ܶ۫ᩴ;->getComparator()Ljava/util/Comparator;

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
    .locals 3

    .line 1280
    :cond_0
    iget-object v0, p0, Ll/ۨܽ᩵;->a:Ll/ܶ۫ᩴ;

    invoke-interface {v0, p0}, Ll/ܶ۫ᩴ;->tryAdvance(Ljava/util/function/Consumer;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1281
    iget-object v0, p0, Ll/ۨܽ᩵;->c:Ljava/lang/Object;

    if-eqz v0, :cond_1

    goto :goto_0

    .line 1275
    :cond_1
    sget-object v0, Ll/ۨܽ᩵;->d:Ljava/lang/Object;

    .line 1281
    :goto_0
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iget-object v2, p0, Ll/ۨܽ᩵;->b:Ll/ۧۤᩴ;

    invoke-virtual {v2, v0, v1}, Ll/ۧۤᩴ;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    .line 1282
    iget-object v0, p0, Ll/ۨܽ᩵;->c:Ljava/lang/Object;

    invoke-interface {p1, v0}, Ljava/util/function/Consumer;->accept(Ljava/lang/Object;)V

    const/4 p1, 0x0

    .line 1283
    iput-object p1, p0, Ll/ۨܽ᩵;->c:Ljava/lang/Object;

    const/4 p1, 0x1

    return p1

    :cond_2
    const/4 p1, 0x0

    return p1
.end method

.method public final trySplit()Ll/ܶ۫ᩴ;
    .locals 3

    .line 1301
    iget-object v0, p0, Ll/ۨܽ᩵;->a:Ll/ܶ۫ᩴ;

    invoke-interface {v0}, Ll/ܶ۫ᩴ;->trySplit()Ll/ܶ۫ᩴ;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 1302
    new-instance v1, Ll/ۨܽ᩵;

    iget-object v2, p0, Ll/ۨܽ᩵;->b:Ll/ۧۤᩴ;

    invoke-direct {v1, v0, v2}, Ll/ۨܽ᩵;-><init>(Ll/ܶ۫ᩴ;Ll/ۧۤᩴ;)V

    return-object v1

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method
