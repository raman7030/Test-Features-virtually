.class public final synthetic Ll/۟ۤۚ;
.super Ljava/lang/Object;
.source "K3OA"

# interfaces
.implements Ljava/util/function/Predicate;


# instance fields
.field public final synthetic ᩸:Ljava/util/function/Function;


# direct methods
.method public synthetic constructor <init>(Ljava/util/function/Function;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۟ۤۚ;->᩸:Ljava/util/function/Function;

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
    .locals 2

    .line 2
    check-cast p1, Ljava/util/Map$Entry;

    .line 491
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۖۤۚ;

    iget-object v0, v0, Ll/ۖۤۚ;->֫:Ll/ۧۤۚ;

    sget-object v1, Ll/ۧۤۚ;->ۤ֫:Ll/ۧۤۚ;

    if-ne v0, v1, :cond_0

    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۖۤۚ;

    iget-object p1, p1, Ll/ۖۤۚ;->ۧ:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    iget-object v0, p0, Ll/۟ۤۚ;->᩸:Ljava/util/function/Function;

    invoke-interface {v0, p1}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
