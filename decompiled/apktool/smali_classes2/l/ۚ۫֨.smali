.class public final Ll/ۚ۫֨;
.super Ljava/lang/Object;
.source "W7SR"


# instance fields
.field public ֫:Ljava/util/WeakHashMap;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 251
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 253
    new-instance v0, Ljava/util/WeakHashMap;

    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    iput-object v0, p0, Ll/ۚ۫֨;->֫:Ljava/util/WeakHashMap;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ۛ֡֨;Ll/ܽܽ۠;)Ll/֡۫֨;
    .locals 2

    .line 274
    iget-object v0, p0, Ll/ۚ۫֨;->֫:Ljava/util/WeakHashMap;

    invoke-virtual {v0, p1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۖܶ۠;

    if-nez p1, :cond_0

    goto :goto_0

    .line 276
    :cond_0
    invoke-virtual {p1}, Ll/ۖܶ۠;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/֡۫֨;

    .line 265
    iget-object v1, v0, Ll/֡۫֨;->֫:Ll/᩻ۗ֨;

    iget-object v1, v1, Ll/᩻ۗ֨;->֫:Ll/ۘ۬֨;

    invoke-interface {v1}, Ll/ۘ۬֨;->ۧ()Ll/ۜ۫֨;

    move-result-object v1

    iget-object v1, v1, Ll/ۜ۫֨;->ܳ:Ll/ܽܽ۠;

    if-ne v1, p2, :cond_1

    return-object v0

    :cond_2
    :goto_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final ֫(Ll/ۚۚ۠;Ll/᩻ۗ֨;)V
    .locals 4

    .line 287
    iget-object v0, p2, Ll/᩻ۗ֨;->֫:Ll/ۘ۬֨;

    invoke-interface {v0}, Ll/ۘ۬֨;->ۧ()Ll/ۜ۫֨;

    move-result-object v0

    iget-object v0, v0, Ll/ۜ۫֨;->ᩳ:Ll/ۛ֡֨;

    .line 288
    iget-object v1, p0, Ll/ۚ۫֨;->֫:Ljava/util/WeakHashMap;

    invoke-virtual {v1, v0}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۖܶ۠;

    if-nez v2, :cond_0

    .line 290
    invoke-static {}, Ll/ۖܶ۠;->ܳ()Ll/ۖܶ۠;

    move-result-object v2

    .line 292
    :cond_0
    new-instance v3, Ll/֡۫֨;

    .line 259
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 260
    iput-object p1, v3, Ll/֡۫֨;->ۧ:Ll/ۚۚ۠;

    .line 261
    iput-object p2, v3, Ll/֡۫֨;->֫:Ll/᩻ۗ֨;

    .line 292
    invoke-virtual {v2, v3}, Ll/ۖܶ۠;->ۧ(Ljava/lang/Object;)Ll/ۖܶ۠;

    move-result-object p1

    invoke-virtual {v1, v0, p1}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
