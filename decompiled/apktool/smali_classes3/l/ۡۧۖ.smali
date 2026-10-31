.class public abstract Ll/ۡۧۖ;
.super Ljava/lang/Object;
.source "17QI"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 2729
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract ֫()Ll/ܳ۬ܺ;
.end method

.method public final ۧ()Z
    .locals 2

    .line 2746
    invoke-virtual {p0}, Ll/ۡۧۖ;->֫()Ll/ܳ۬ܺ;

    move-result-object v0

    invoke-static {v0}, Ll/ۚ۬ᩴ;->stream(Ljava/util/Collection;)Ll/ܿ᩺ᩴ;

    move-result-object v0

    new-instance v1, Ll/ۢۧۖ;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    invoke-interface {v0, v1}, Ll/ܿ᩺ᩴ;->anyMatch(Ljava/util/function/Predicate;)Z

    move-result v0

    return v0
.end method

.method public abstract ܽ()Ll/ܳ۬ܺ;
.end method
