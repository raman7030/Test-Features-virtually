.class public final Ll/᩸ܰ֨;
.super Ljava/lang/Object;
.source "T7LF"

# interfaces
.implements Ll/ۜ֡֨;


# instance fields
.field public final synthetic ᩸:Ll/ۗܰ֨;


# direct methods
.method public constructor <init>(Ll/ۗܰ֨;)V
    .locals 0

    .line 1435
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩸ܰ֨;->᩸:Ll/ۗܰ֨;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    const-string v0, "unnamedModule Completer"

    return-object v0
.end method

.method public final ֫(Ll/ۛ֡֨;)V
    .locals 4

    .line 1438
    iget-object v0, p0, Ll/᩸ܰ֨;->᩸:Ll/ۗܰ֨;

    iget-boolean v1, v0, Ll/ۗܰ֨;->֡:Z

    if-eqz v1, :cond_0

    .line 1439
    iput-object p0, p1, Ll/ۛ֡֨;->᩸:Ll/ۜ֡֨;

    return-void

    .line 1442
    :cond_0
    check-cast p1, Ll/֡֡֨;

    .line 1443
    new-instance v1, Ljava/util/HashSet;

    invoke-virtual {v0}, Ll/ۗܰ֨;->ᩳ()Ljava/util/Set;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 1444
    invoke-static {v0}, Ll/ۗܰ֨;->᩷(Ll/ۗܰ֨;)Ll/᩷ۚ֨;

    move-result-object v2

    iget-object v2, v2, Ll/᩷ۚ֨;->֡ۧ:Ll/֡֡֨;

    invoke-virtual {v1, v2}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 1445
    invoke-virtual {v1}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/֡֡֨;

    .line 1446
    invoke-virtual {v3}, Ll/ۛ֡֨;->᩶()V

    goto :goto_0

    .line 1448
    :cond_1
    invoke-static {v0, p1, v1}, Ll/ۗܰ֨;->֫(Ll/ۗܰ֨;Ll/֡֡֨;Ljava/util/HashSet;)V

    return-void
.end method

.method public final synthetic ܽ()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
