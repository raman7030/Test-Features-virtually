.class public abstract Ll/ܺ۟֨;
.super Ljava/lang/Object;
.source "57L9"


# instance fields
.field public final synthetic ۙ:Ll/ۤ۟֨;

.field public ᩶:Ll/ۖܶ۠;

.field public ᩸:Ll/ܽ۫ᩴ;

.field public final ᩹:Ll/ۤܶ۠;


# direct methods
.method public constructor <init>(Ll/ۤ۟֨;Ll/ᩴۚ۠;)V
    .locals 1

    .line 277
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܺ۟֨;->ۙ:Ll/ۤ۟֨;

    .line 271
    invoke-static {}, Ll/ܽ۫ᩴ;->empty()Ll/ܽ۫ᩴ;

    move-result-object v0

    iput-object v0, p0, Ll/ܺ۟֨;->᩸:Ll/ܽ۫ᩴ;

    .line 274
    invoke-static {}, Ll/ۖܶ۠;->ܳ()Ll/ۖܶ۠;

    move-result-object v0

    iput-object v0, p0, Ll/ܺ۟֨;->᩶:Ll/ۖܶ۠;

    .line 278
    invoke-virtual {p1, p2}, Ll/ۤ۟֨;->֫(Ll/ᩴۚ۠;)Ll/ۤܶ۠;

    move-result-object p1

    iput-object p1, p0, Ll/ܺ۟֨;->᩹:Ll/ۤܶ۠;

    return-void
.end method

.method public static ֫(Ll/ܺ۟֨;)[Ll/֨֡֨;
    .locals 3

    .line 298
    iget-object v0, p0, Ll/ܺ۟֨;->᩶:Ll/ۖܶ۠;

    invoke-static {v0}, Ll/ۚ۬ᩴ;->stream(Ljava/util/Collection;)Ll/ܿ᩺ᩴ;

    move-result-object v0

    new-instance v1, Ll/ܽۤ֨;

    const/4 v2, 0x1

    invoke-direct {v1, v2}, Ll/ܽۤ֨;-><init>(I)V

    .line 299
    invoke-interface {v0, v1}, Ll/ܿ᩺ᩴ;->map(Ljava/util/function/Function;)Ll/ܿ᩺ᩴ;

    move-result-object v0

    new-instance v1, Ll/ۡ۟֨;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 300
    invoke-interface {v0, v1}, Ll/ܿ᩺ᩴ;->toArray(Ljava/util/function/IntFunction;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ll/֨֡֨;

    .line 301
    invoke-static {v0}, Ll/ܽ۫ᩴ;->of(Ljava/lang/Object;)Ll/ܽ۫ᩴ;

    move-result-object v1

    iput-object v1, p0, Ll/ܺ۟֨;->᩸:Ll/ܽ۫ᩴ;

    const/4 v1, 0x0

    .line 302
    iput-object v1, p0, Ll/ܺ۟֨;->᩶:Ll/ۖܶ۠;

    return-object v0
.end method


# virtual methods
.method public final ֫(Ljava/util/function/Predicate;)Ll/֨֡֨;
    .locals 2

    .line 287
    iget-object v0, p0, Ll/ܺ۟֨;->᩸:Ll/ܽ۫ᩴ;

    new-instance v1, Ll/ۢ۟֨;

    invoke-direct {v1, p0}, Ll/ۢ۟֨;-><init>(Ll/ܺ۟֨;)V

    invoke-virtual {v0, v1}, Ll/ܽ۫ᩴ;->orElseGet(Ljava/util/function/Supplier;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ll/֨֡֨;

    invoke-static {v0}, Ll/ܽ᩺ᩴ;->of([Ljava/lang/Object;)Ll/ܿ᩺ᩴ;

    move-result-object v0

    .line 288
    invoke-interface {v0, p1}, Ll/ܿ᩺ᩴ;->filter(Ljava/util/function/Predicate;)Ll/ܿ᩺ᩴ;

    move-result-object p1

    .line 289
    invoke-interface {p1}, Ll/ܿ᩺ᩴ;->findFirst()Ll/ܽ۫ᩴ;

    move-result-object p1

    iget-object v0, p0, Ll/ܺ۟֨;->ۙ:Ll/ۤ۟֨;

    iget-object v0, v0, Ll/ۤ۟֨;->ᩳ:Ll/֨֡֨;

    .line 290
    invoke-virtual {p1, v0}, Ll/ܽ۫ᩴ;->orElse(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/֨֡֨;

    return-object p1
.end method
