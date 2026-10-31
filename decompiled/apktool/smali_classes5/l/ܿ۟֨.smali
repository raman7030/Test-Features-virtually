.class public final synthetic Ll/ܿ۟֨;
.super Ljava/lang/Object;
.source "57L9"

# interfaces
.implements Ljava/util/function/Predicate;


# instance fields
.field public final synthetic ᩶:Ll/ۙ֨֨;

.field public final synthetic ᩸:Ll/ܳ۟֨;

.field public final synthetic ᩹:Ll/ۙ֨֨;


# direct methods
.method public synthetic constructor <init>(Ll/ܳ۟֨;Ll/ۙ֨֨;Ll/ۙ֨֨;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܿ۟֨;->᩸:Ll/ܳ۟֨;

    iput-object p2, p0, Ll/ܿ۟֨;->᩹:Ll/ۙ֨֨;

    iput-object p3, p0, Ll/ܿ۟֨;->᩶:Ll/ۙ֨֨;

    return-void
.end method


# virtual methods
.method public synthetic and(Ljava/util/function/Predicate;)Ljava/util/function/Predicate;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/᩵ۛᩴ;->$default$and(Ljava/util/function/Predicate;Ljava/util/function/Predicate;)Ljava/util/function/Predicate;

    move-result-object p1

    return-object p1
.end method

.method public synthetic negate()Ljava/util/function/Predicate;
    .locals 1

    .line 0
    invoke-static {p0}, Ll/᩵ۛᩴ;->$default$negate(Ljava/util/function/Predicate;)Ljava/util/function/Predicate;

    move-result-object v0

    return-object v0
.end method

.method public synthetic or(Ljava/util/function/Predicate;)Ljava/util/function/Predicate;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/᩵ۛᩴ;->$default$or(Ljava/util/function/Predicate;Ljava/util/function/Predicate;)Ljava/util/function/Predicate;

    move-result-object p1

    return-object p1
.end method

.method public final test(Ljava/lang/Object;)Z
    .locals 4

    .line 2
    check-cast p1, Ll/֨֡֨;

    .line 4
    iget-object v0, p0, Ll/ܿ۟֨;->᩸:Ll/ܳ۟֨;

    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 366
    iget-object p1, p1, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    invoke-virtual {p1}, Ll/ۙ֨֨;->ܰ()Ll/ۖܶ۠;

    move-result-object p1

    .line 367
    iget-object v0, v0, Ll/ܳ۟֨;->ۗ:Ll/ۤ۟֨;

    invoke-static {v0}, Ll/ۤ۟֨;->ۧ(Ll/ۤ۟֨;)Ll/ۛ᩸֨;

    move-result-object v1

    iget-object v2, p1, Ll/ۖܶ۠;->᩸:Ljava/lang/Object;

    check-cast v2, Ll/ۙ֨֨;

    iget-object v3, p0, Ll/ܿ۟֨;->᩹:Ll/ۙ֨֨;

    invoke-virtual {v1, v2, v3}, Ll/ۛ᩸֨;->ܿ(Ll/ۙ֨֨;Ll/ۙ֨֨;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {v0}, Ll/ۤ۟֨;->ۧ(Ll/ۤ۟֨;)Ll/ۛ᩸֨;

    move-result-object v0

    iget-object p1, p1, Ll/ۖܶ۠;->᩹:Ll/ۖܶ۠;

    iget-object p1, p1, Ll/ۖܶ۠;->᩸:Ljava/lang/Object;

    check-cast p1, Ll/ۙ֨֨;

    .line 368
    iget-object v1, p0, Ll/ܿ۟֨;->᩶:Ll/ۙ֨֨;

    invoke-virtual {v0, p1, v1}, Ll/ۛ᩸֨;->ܿ(Ll/ۙ֨֨;Ll/ۙ֨֨;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
