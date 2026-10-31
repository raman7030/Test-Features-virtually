.class public final Ll/ۨ᩵֨;
.super Ljava/lang/Object;
.source "R450"


# instance fields
.field public ֫:Ll/ۖܶ۠;


# direct methods
.method private ֫(Ll/ۛ֡֨;Ll/۟᩵֨;Z)V
    .locals 4

    .line 197
    new-instance v0, Ll/ᩴܶ۠;

    invoke-direct {v0}, Ll/ᩴܶ۠;-><init>()V

    .line 198
    iget-object v1, p0, Ll/ۨ᩵֨;->֫:Ll/ۖܶ۠;

    invoke-virtual {v1}, Ll/ۖܶ۠;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/ref/WeakReference;

    .line 199
    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۛ᩵֨;

    if-eqz v3, :cond_0

    if-eqz p3, :cond_1

    .line 202
    invoke-interface {v3, p2, p1}, Ll/ۛ᩵֨;->ۧ(Ll/۟᩵֨;Ll/ۛ֡֨;)V

    goto :goto_1

    .line 204
    :cond_1
    invoke-interface {v3, p2, p1}, Ll/ۛ᩵֨;->֫(Ll/۟᩵֨;Ll/ۛ֡֨;)V

    .line 227
    :goto_1
    invoke-virtual {v0, v2}, Ll/ᩴܶ۠;->֫(Ljava/lang/Object;)V

    goto :goto_0

    .line 209
    :cond_2
    invoke-virtual {v0}, Ll/ᩴܶ۠;->ܿ()Ll/ۖܶ۠;

    move-result-object p1

    iput-object p1, p0, Ll/ۨ᩵֨;->֫:Ll/ۖܶ۠;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/۟᩵֨;Ll/ۛ֡֨;)V
    .locals 1

    const/4 v0, 0x0

    .line 189
    invoke-direct {p0, p2, p1, v0}, Ll/ۨ᩵֨;->֫(Ll/ۛ֡֨;Ll/۟᩵֨;Z)V

    return-void
.end method

.method public final ۧ(Ll/۟᩵֨;Ll/ۛ֡֨;)V
    .locals 1

    const/4 v0, 0x1

    .line 193
    invoke-direct {p0, p2, p1, v0}, Ll/ۨ᩵֨;->֫(Ll/ۛ֡֨;Ll/۟᩵֨;Z)V

    return-void
.end method
