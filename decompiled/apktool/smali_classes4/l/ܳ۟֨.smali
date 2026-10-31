.class public abstract Ll/ܳ۟֨;
.super Ll/ܺ۟֨;
.source "57L9"

# interfaces
.implements Ljava/util/function/BiPredicate;


# instance fields
.field public final synthetic ۗ:Ll/ۤ۟֨;


# direct methods
.method public constructor <init>(Ll/ۤ۟֨;Ll/ᩴۚ۠;)V
    .locals 0

    .line 349
    iput-object p1, p0, Ll/ܳ۟֨;->ۗ:Ll/ۤ۟֨;

    .line 350
    invoke-direct {p0, p1, p2}, Ll/ܺ۟֨;-><init>(Ll/ۤ۟֨;Ll/ᩴۚ۠;)V

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

.method public abstract ֫(Ll/ۙ֨֨;Ll/ۙ֨֨;)Ll/֨֡֨;
.end method

.method public final varargs ֫(Ll/ܶ۟֨;Ll/ܶ۟֨;Ll/ܶ۟֨;[I)V
    .locals 8

    .line 375
    iget-object v0, p0, Ll/ܺ۟֨;->᩶:Ll/ۖܶ۠;

    new-instance v7, Ll/ᩳ۟֨;

    move-object v1, v7

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    invoke-direct/range {v1 .. v6}, Ll/ᩳ۟֨;-><init>(Ll/ܳ۟֨;Ll/ܶ۟֨;Ll/ܶ۟֨;Ll/ܶ۟֨;[I)V

    invoke-virtual {v0, v7}, Ll/ۖܶ۠;->ۧ(Ljava/lang/Object;)Ll/ۖܶ۠;

    move-result-object p1

    iput-object p1, p0, Ll/ܺ۟֨;->᩶:Ll/ۖܶ۠;

    return-void
.end method
