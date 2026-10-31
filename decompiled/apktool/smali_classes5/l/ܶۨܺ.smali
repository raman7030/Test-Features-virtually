.class public final Ll/ܶۨܺ;
.super Ll/֨᩶ܺ;
.source "O5F3"


# instance fields
.field public final synthetic ۙ:Ljava/util/Iterator;

.field public final synthetic ᩶:Ll/᩸ۨܺ;


# direct methods
.method public constructor <init>(Ll/᩸ۨܺ;Ljava/util/Iterator;)V
    .locals 0

    .line 831
    iput-object p2, p0, Ll/ܶۨܺ;->ۙ:Ljava/util/Iterator;

    iput-object p1, p0, Ll/ܶۨܺ;->᩶:Ll/᩸ۨܺ;

    invoke-direct {p0}, Ll/֨᩶ܺ;-><init>()V

    return-void
.end method


# virtual methods
.method public final ֫()Ljava/lang/Object;
    .locals 5

    .line 834
    iget-object v0, p0, Ll/ܶۨܺ;->ۙ:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    .line 835
    invoke-virtual {p0}, Ll/֨᩶ܺ;->ۧ()V

    return-object v2

    .line 837
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܰۤܺ;

    .line 838
    iget-object v1, p0, Ll/ܶۨܺ;->᩶:Ll/᩸ۨܺ;

    invoke-static {v1}, Ll/᩸ۨܺ;->֫(Ll/᩸ۨܺ;)Ll/ܰۤܺ;

    move-result-object v3

    iget-object v3, v3, Ll/ܰۤܺ;->᩸:Ll/ۘۗܺ;

    iget-object v4, v0, Ll/ܰۤܺ;->᩹:Ll/ۘۗܺ;

    invoke-virtual {v3, v4}, Ll/ۘۗܺ;->֫(Ll/ۘۗܺ;)I

    move-result v3

    if-ltz v3, :cond_1

    .line 839
    invoke-virtual {p0}, Ll/֨᩶ܺ;->ۧ()V

    return-object v2

    .line 841
    :cond_1
    invoke-static {v1}, Ll/᩸ۨܺ;->֫(Ll/᩸ۨܺ;)Ll/ܰۤܺ;

    move-result-object v3

    invoke-virtual {v0, v3}, Ll/ܰۤܺ;->ۧ(Ll/ܰۤܺ;)Ll/ܰۤܺ;

    move-result-object v0

    iget-object v3, v0, Ll/ܰۤܺ;->᩸:Ll/ۘۗܺ;

    .line 842
    invoke-static {v1}, Ll/᩸ۨܺ;->ۧ(Ll/᩸ۨܺ;)Ll/ܰۤܺ;

    move-result-object v1

    invoke-virtual {v1, v3}, Ll/ܰۤܺ;->֫(Ljava/lang/Comparable;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 1442
    new-instance v1, Ljava/util/AbstractMap$SimpleImmutableEntry;

    invoke-direct {v1, v3, v0}, Ljava/util/AbstractMap$SimpleImmutableEntry;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v1

    .line 845
    :cond_2
    invoke-virtual {p0}, Ll/֨᩶ܺ;->ۧ()V

    return-object v2
.end method
