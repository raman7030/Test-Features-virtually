.class public abstract Ll/ۗ۟֨;
.super Ll/ܺ۟֨;
.source "57L9"

# interfaces
.implements Ljava/util/function/Predicate;


# instance fields
.field public final synthetic ۗ:Ll/ۤ۟֨;


# direct methods
.method public constructor <init>(Ll/ۤ۟֨;Ll/ᩴۚ۠;)V
    .locals 0

    .line 312
    iput-object p1, p0, Ll/ۗ۟֨;->ۗ:Ll/ۤ۟֨;

    .line 313
    invoke-direct {p0, p1, p2}, Ll/ܺ۟֨;-><init>(Ll/ۤ۟֨;Ll/ᩴۚ۠;)V

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

.method public abstract ֫(Ll/ۙ֨֨;)Ll/֨֡֨;
.end method

.method public final varargs ֫(Ll/ܶ۟֨;Ll/ܶ۟֨;[I)V
    .locals 2

    .line 336
    iget-object v0, p0, Ll/ܺ۟֨;->᩶:Ll/ۖܶ۠;

    new-instance v1, Ll/᩶۟֨;

    invoke-direct {v1, p0, p1, p2, p3}, Ll/᩶۟֨;-><init>(Ll/ۗ۟֨;Ll/ܶ۟֨;Ll/ܶ۟֨;[I)V

    invoke-virtual {v0, v1}, Ll/ۖܶ۠;->ۧ(Ljava/lang/Object;)Ll/ۖܶ۠;

    move-result-object p1

    iput-object p1, p0, Ll/ܺ۟֨;->᩶:Ll/ۖܶ۠;

    return-void
.end method
