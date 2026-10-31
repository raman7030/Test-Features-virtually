.class public final synthetic Ll/ۤᩳᩴ;
.super Ljava/lang/Object;
.source "JAPJ"

# interfaces
.implements Ll/᩺ᩳᩴ;


# instance fields
.field public final synthetic ᩸:Ll/᩺ᩳᩴ;

.field public final synthetic ᩹:Ll/᩺ᩳᩴ;


# direct methods
.method public synthetic constructor <init>(Ll/᩺ᩳᩴ;Ll/᩺ᩳᩴ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۤᩳᩴ;->᩸:Ll/᩺ᩳᩴ;

    iput-object p2, p0, Ll/ۤᩳᩴ;->᩹:Ll/᩺ᩳᩴ;

    return-void
.end method


# virtual methods
.method public final synthetic and(Ljava/util/function/DoublePredicate;)Ljava/util/function/DoublePredicate;
    .locals 0

    .line 35
    invoke-static {p0, p1}, Ll/ۨᩳᩴ;->֫(Ll/᩺ᩳᩴ;Ljava/util/function/DoublePredicate;)Ll/᩺ᩳᩴ;

    move-result-object p1

    return-object p1
.end method

.method public final and(Ljava/util/function/Predicate;)Ljava/util/function/Predicate;
    .locals 0

    .line 103
    invoke-static {p0, p1}, Ll/᩵ۛᩴ;->$default$and(Ljava/util/function/Predicate;Ljava/util/function/Predicate;)Ljava/util/function/Predicate;

    move-result-object p1

    return-object p1
.end method

.method public final negate()Ljava/util/function/DoublePredicate;
    .locals 1

    .line 109
    new-instance v0, Ll/۬ᩳᩴ;

    invoke-direct {v0, p0}, Ll/۬ᩳᩴ;-><init>(Ll/᩺ᩳᩴ;)V

    return-object v0
.end method

.method public final negate()Ljava/util/function/Predicate;
    .locals 1

    .line 109
    new-instance v0, Ll/۬ᩳᩴ;

    invoke-direct {v0, p0}, Ll/۬ᩳᩴ;-><init>(Ll/᩺ᩳᩴ;)V

    return-object v0
.end method

.method public final synthetic or(Ljava/util/function/DoublePredicate;)Ljava/util/function/DoublePredicate;
    .locals 0

    .line 35
    invoke-static {p0, p1}, Ll/ۨᩳᩴ;->ۧ(Ll/᩺ᩳᩴ;Ljava/util/function/DoublePredicate;)Ll/᩺ᩳᩴ;

    move-result-object p1

    return-object p1
.end method

.method public final or(Ljava/util/function/Predicate;)Ljava/util/function/Predicate;
    .locals 0

    .line 148
    invoke-static {p0, p1}, Ll/᩵ۛᩴ;->$default$or(Ljava/util/function/Predicate;Ljava/util/function/Predicate;)Ljava/util/function/Predicate;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic test(D)Z
    .locals 0

    .line 0
    invoke-static {p0, p1, p2}, Ll/ۨᩳᩴ;->֫(Ll/᩺ᩳᩴ;D)Z

    move-result p1

    return p1
.end method

.method public final synthetic test(Ljava/lang/Object;)Z
    .locals 0

    .line 35
    check-cast p1, Ljava/lang/Float;

    invoke-static {p0, p1}, Ll/ۨᩳᩴ;->֫(Ll/᩺ᩳᩴ;Ljava/lang/Float;)Z

    move-result p1

    return p1
.end method

.method public final ֫(Ll/᩺ᩳᩴ;)Ll/ۛᩳᩴ;
    .locals 1

    .line 126
    new-instance v0, Ll/ۛᩳᩴ;

    invoke-direct {v0, p0, p1}, Ll/ۛᩳᩴ;-><init>(Ll/᩺ᩳᩴ;Ll/᩺ᩳᩴ;)V

    return-object v0
.end method

.method public final ۧ(Ll/᩺ᩳᩴ;)Ll/ۤᩳᩴ;
    .locals 1

    .line 81
    new-instance v0, Ll/ۤᩳᩴ;

    invoke-direct {v0, p0, p1}, Ll/ۤᩳᩴ;-><init>(Ll/᩺ᩳᩴ;Ll/᩺ᩳᩴ;)V

    return-object v0
.end method

.method public final ܽ(F)Z
    .locals 1

    .line 81
    iget-object v0, p0, Ll/ۤᩳᩴ;->᩸:Ll/᩺ᩳᩴ;

    invoke-interface {v0, p1}, Ll/᩺ᩳᩴ;->ܽ(F)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/ۤᩳᩴ;->᩹:Ll/᩺ᩳᩴ;

    invoke-interface {v0, p1}, Ll/᩺ᩳᩴ;->ܽ(F)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
