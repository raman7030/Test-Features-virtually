.class public final synthetic Ll/ۜۛ֨;
.super Ljava/lang/Object;
.source "M43N"

# interfaces
.implements Ljava/util/function/BiPredicate;


# instance fields
.field public final synthetic ᩸:Ll/ۛ᩸֨;


# direct methods
.method public synthetic constructor <init>(Ll/ۛ᩸֨;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۜۛ֨;->᩸:Ll/ۛ᩸֨;

    return-void
.end method


# virtual methods
.method public synthetic and(Ljava/util/function/BiPredicate;)Ljava/util/function/BiPredicate;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ܳۛᩴ;->$default$and(Ljava/util/function/BiPredicate;Ljava/util/function/BiPredicate;)Ljava/util/function/BiPredicate;

    move-result-object p1

    return-object p1
.end method

.method public synthetic negate()Ljava/util/function/BiPredicate;
    .locals 1

    .line 0
    invoke-static {p0}, Ll/ܳۛᩴ;->$default$negate(Ljava/util/function/BiPredicate;)Ljava/util/function/BiPredicate;

    move-result-object v0

    return-object v0
.end method

.method public synthetic or(Ljava/util/function/BiPredicate;)Ljava/util/function/BiPredicate;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ܳۛᩴ;->$default$or(Ljava/util/function/BiPredicate;Ljava/util/function/BiPredicate;)Ljava/util/function/BiPredicate;

    move-result-object p1

    return-object p1
.end method

.method public final test(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 1

    .line 0
    check-cast p1, Ll/ۙ֨֨;

    check-cast p2, Ll/ۙ֨֨;

    iget-object v0, p0, Ll/ۜۛ֨;->᩸:Ll/ۛ᩸֨;

    invoke-virtual {v0, p1, p2}, Ll/ۛ᩸֨;->ܿ(Ll/ۙ֨֨;Ll/ۙ֨֨;)Z

    move-result p1

    return p1
.end method
