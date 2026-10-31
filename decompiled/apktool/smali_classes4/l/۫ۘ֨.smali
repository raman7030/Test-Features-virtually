.class public final Ll/۫ۘ֨;
.super Ljava/lang/Object;
.source "07MC"

# interfaces
.implements Ll/۟ۘ֨;


# instance fields
.field public final ֫:Ljava/util/HashMap;


# direct methods
.method public constructor <init>(Ll/֫ᩴ֨;)V
    .locals 0

    .line 64
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 65
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Ll/۫ۘ֨;->֫:Ljava/util/HashMap;

    return-void
.end method

.method public static bridge synthetic ֫(Ll/۫ۘ֨;)Ljava/util/HashMap;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/۫ۘ֨;->֫:Ljava/util/HashMap;

    return-object p0
.end method


# virtual methods
.method public final ֫()V
    .locals 2

    .line 68
    iget-object v0, p0, Ll/۫ۘ֨;->֫:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v0

    new-instance v1, Ll/ۙۘ֨;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    invoke-static {v0, v1}, Ll/᩶֨ᩴ;->forEach(Ljava/lang/Iterable;Ljava/util/function/Consumer;)V

    return-void
.end method

.method public final ֫(Ll/ܳ֡֨;)V
    .locals 1

    .line 82
    iget-object v0, p0, Ll/۫ۘ֨;->֫:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final ֫(Ll/ܳ֡֨;Ll/ۜ֡֨;)V
    .locals 2

    .line 74
    new-instance v0, Ll/ܰۘ֨;

    new-instance v1, Ll/۬ۘ֨;

    invoke-direct {v1, p0, p2}, Ll/۬ۘ֨;-><init>(Ll/۫ۘ֨;Ll/ۜ֡֨;)V

    invoke-direct {v0, p1, v1}, Ll/ܰۘ֨;-><init>(Ll/ܳ֡֨;Ll/ۜ֡֨;)V

    iget-object p2, p0, Ll/۫ۘ֨;->֫:Ljava/util/HashMap;

    invoke-virtual {p2, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final ֫(Ll/᩷֡֨;)V
    .locals 0

    return-void
.end method

.method public final ۧ()V
    .locals 2

    .line 85
    iget-object v0, p0, Ll/۫ۘ֨;->֫:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v0

    new-instance v1, Ll/ۗۘ֨;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    invoke-static {v0, v1}, Ll/᩶֨ᩴ;->forEach(Ljava/lang/Iterable;Ljava/util/function/Consumer;)V

    return-void
.end method
