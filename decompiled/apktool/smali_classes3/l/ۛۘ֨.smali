.class public final Ll/ۛۘ֨;
.super Ljava/lang/Object;
.source "07MC"

# interfaces
.implements Ll/۟ۘ֨;


# instance fields
.field public final ֫:Ljava/util/HashMap;


# direct methods
.method public constructor <init>(Ll/֫ᩴ֨;)V
    .locals 0

    .line 89
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 90
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Ll/ۛۘ֨;->֫:Ljava/util/HashMap;

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 0

    return-void
.end method

.method public final ֫(Ll/ܳ֡֨;)V
    .locals 1

    .line 101
    iget-object v0, p0, Ll/ۛۘ֨;->֫:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final ֫(Ll/ܳ֡֨;Ll/ۜ֡֨;)V
    .locals 2

    .line 98
    new-instance v0, Ll/ܰۘ֨;

    new-instance v1, Ll/᩺ۘ֨;

    invoke-direct {v1, p2}, Ll/᩺ۘ֨;-><init>(Ll/ۜ֡֨;)V

    invoke-direct {v0, p1, v1}, Ll/ܰۘ֨;-><init>(Ll/ܳ֡֨;Ll/ۜ֡֨;)V

    iget-object p2, p0, Ll/ۛۘ֨;->֫:Ljava/util/HashMap;

    invoke-virtual {p2, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final ֫(Ll/᩷֡֨;)V
    .locals 0

    .line 95
    throw p1
.end method

.method public final ۧ()V
    .locals 3

    .line 104
    iget-object v0, p0, Ll/ۛۘ֨;->֫:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v1

    new-instance v2, Ll/ۤۘ֨;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    invoke-static {v1, v2}, Ll/᩶֨ᩴ;->forEach(Ljava/lang/Iterable;Ljava/util/function/Consumer;)V

    .line 105
    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    return-void
.end method
