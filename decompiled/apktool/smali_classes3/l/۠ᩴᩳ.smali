.class public final synthetic Ll/۠ᩴᩳ;
.super Ljava/lang/Object;
.source "J6S5"

# interfaces
.implements Ljava/util/function/Predicate;


# instance fields
.field public final synthetic ᩸:Ll/᩷۠ᩴ;


# direct methods
.method public synthetic constructor <init>(Ll/᩷۠ᩴ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۠ᩴᩳ;->᩸:Ll/᩷۠ᩴ;

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
    .locals 1

    .line 2
    check-cast p1, Ljava/util/Map$Entry;

    .line 37
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/᩷۠ᩴ;

    iget-object v0, p0, Ll/۠ᩴᩳ;->᩸:Ll/᩷۠ᩴ;

    invoke-interface {p1, v0}, Ll/᩷۠ᩴ;->startsWith(Ll/᩷۠ᩴ;)Z

    move-result p1

    return p1
.end method
