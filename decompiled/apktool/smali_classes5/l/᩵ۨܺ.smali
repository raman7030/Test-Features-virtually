.class public final Ll/᩵ۨܺ;
.super Ll/֨᩶ܺ;
.source "O5F3"


# instance fields
.field public final synthetic ۙ:Ljava/util/Iterator;

.field public final synthetic ᩶:Ll/ۚۨܺ;


# direct methods
.method public constructor <init>(Ll/ۚۨܺ;Ljava/util/Iterator;)V
    .locals 0

    .line 386
    iput-object p2, p0, Ll/᩵ۨܺ;->ۙ:Ljava/util/Iterator;

    iput-object p1, p0, Ll/᩵ۨܺ;->᩶:Ll/ۚۨܺ;

    invoke-direct {p0}, Ll/֨᩶ܺ;-><init>()V

    return-void
.end method


# virtual methods
.method public final ֫()Ljava/lang/Object;
    .locals 4

    .line 389
    iget-object v0, p0, Ll/᩵ۨܺ;->ۙ:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    .line 390
    invoke-virtual {p0}, Ll/֨᩶ܺ;->ۧ()V

    return-object v2

    .line 392
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܰۤܺ;

    .line 393
    iget-object v1, p0, Ll/᩵ۨܺ;->᩶:Ll/ۚۨܺ;

    invoke-static {v1}, Ll/ۚۨܺ;->֫(Ll/ۚۨܺ;)Ll/ܰۤܺ;

    move-result-object v1

    iget-object v1, v1, Ll/ܰۤܺ;->᩹:Ll/ۘۗܺ;

    iget-object v3, v0, Ll/ܰۤܺ;->᩹:Ll/ۘۗܺ;

    invoke-virtual {v1, v3}, Ll/ۘۗܺ;->֫(Ljava/lang/Comparable;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 394
    invoke-virtual {p0}, Ll/֨᩶ܺ;->ۧ()V

    return-object v2

    .line 396
    :cond_1
    iget-object v1, v0, Ll/ܰۤܺ;->᩹:Ll/ۘۗܺ;

    .line 1442
    new-instance v2, Ljava/util/AbstractMap$SimpleImmutableEntry;

    invoke-direct {v2, v1, v0}, Ljava/util/AbstractMap$SimpleImmutableEntry;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v2
.end method
