.class public final Ll/ۗۨܳ;
.super Ljava/lang/Object;
.source "E29Y"

# interfaces
.implements Ll/ۙܳᩳ;


# instance fields
.field public final synthetic ۗ:Ljava/lang/String;

.field public final synthetic ۙ:Ll/ܶ᩵ܿ;

.field public final synthetic ۬:J

.field public final synthetic ᩶:Ljava/util/ArrayList;

.field public final synthetic ᩸:Ll/۬ۨܳ;

.field public final synthetic ᩹:Ll/֫ۤܳ;


# direct methods
.method public constructor <init>(Ll/۬ۨܳ;JLl/ܶ᩵ܿ;Ljava/util/ArrayList;Ljava/lang/String;Ll/֫ۤܳ;)V
    .locals 0

    .line 992
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۗۨܳ;->᩸:Ll/۬ۨܳ;

    iput-wide p2, p0, Ll/ۗۨܳ;->۬:J

    iput-object p4, p0, Ll/ۗۨܳ;->ۙ:Ll/ܶ᩵ܿ;

    iput-object p5, p0, Ll/ۗۨܳ;->᩶:Ljava/util/ArrayList;

    iput-object p6, p0, Ll/ۗۨܳ;->ۗ:Ljava/lang/String;

    iput-object p7, p0, Ll/ۗۨܳ;->᩹:Ll/֫ۤܳ;

    return-void
.end method


# virtual methods
.method public final synthetic getItemInformation(ILnet/sf/sevenzipjbinding/impl/OutItemFactory;)Lnet/sf/sevenzipjbinding/impl/OutItem;
    .locals 0

    .line 0
    invoke-static {p0, p1, p2}, Ll/᩶ܳᩳ;->֫(Ll/ۙܳᩳ;ILnet/sf/sevenzipjbinding/impl/OutItemFactory;)Lnet/sf/sevenzipjbinding/impl/OutItem;

    move-result-object p1

    return-object p1
.end method

.method public final getStream(I)Lnet/sf/sevenzipjbinding/ISequentialInStream;
    .locals 2

    .line 1015
    iget-object v0, p0, Ll/ۗۨܳ;->᩹:Ll/֫ۤܳ;

    iget-object v0, v0, Ll/֫ۤܳ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/۟۫ܳ;

    .line 1016
    iget-boolean v0, p1, Ll/۟۫ܳ;->ᩳ:Z

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 1019
    :cond_0
    iget-object v0, p0, Ll/ۗۨܳ;->᩸:Ll/۬ۨܳ;

    iget-object v1, p1, Ll/۟۫ܳ;->ۜ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ll/ۘ۠ۢ;->֫(Ljava/lang/CharSequence;)V

    .line 1020
    new-instance v0, Ll/ۘ᩺᩵;

    iget-object p1, p1, Ll/۟۫ܳ;->֫:Ll/ܶ᩵ܿ;

    invoke-direct {v0, p1}, Ll/ۘ᩺᩵;-><init>(Ll/ܶ᩵ܿ;)V

    return-object v0
.end method

.method public final ֨֫()Ll/᩵᩺᩵;
    .locals 7

    const-wide/16 v0, -0x1

    .line 996
    iget-object v2, p0, Ll/ۗۨܳ;->᩶:Ljava/util/ArrayList;

    iget-object v3, p0, Ll/ۗۨܳ;->ۙ:Ll/ܶ᩵ܿ;

    iget-wide v4, p0, Ll/ۗۨܳ;->۬:J

    cmp-long v6, v4, v0

    if-eqz v6, :cond_0

    .line 997
    new-instance v0, Ll/᩵᩺᩵;

    new-instance v1, Ll/ۙۨܳ;

    invoke-direct {v1, v2}, Ll/ۙۨܳ;-><init>(Ljava/util/ArrayList;)V

    invoke-direct {v0, v3, v4, v5, v1}, Ll/᩵᩺᩵;-><init>(Ll/ܶ᩵ܿ;JLl/۬ۤ;)V

    return-object v0

    .line 999
    :cond_0
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1000
    new-instance v0, Ll/᩵᩺᩵;

    invoke-direct {v0, v3}, Ll/᩵᩺᩵;-><init>(Ll/ܶ᩵ܿ;)V

    return-object v0
.end method

.method public final ֫(I)V
    .locals 1

    .line 1030
    iget-object v0, p0, Ll/ۗۨܳ;->᩸:Ll/۬ۨܳ;

    invoke-virtual {v0, p1}, Ll/᩹ܶۢ;->ܺ(I)V

    return-void
.end method

.method public final ۘ()Ljava/lang/String;
    .locals 1

    .line 1005
    iget-object v0, p0, Ll/ۗۨܳ;->ۗ:Ljava/lang/String;

    return-object v0
.end method

.method public final ᩳ(I)Ll/ۗܳᩳ;
    .locals 2

    .line 1010
    new-instance v0, Ll/ۗܳᩳ;

    iget-object v1, p0, Ll/ۗۨܳ;->᩹:Ll/֫ۤܳ;

    iget-object v1, v1, Ll/֫ۤܳ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/۟۫ܳ;

    invoke-direct {v0, p1}, Ll/ۗܳᩳ;-><init>(Ll/۟۫ܳ;)V

    return-object v0
.end method

.method public final ᩻()Z
    .locals 1

    .line 1025
    iget-object v0, p0, Ll/ۗۨܳ;->᩸:Ll/۬ۨܳ;

    .line 301
    invoke-virtual {v0}, Ll/ۘ۠ۢ;->᩻()Z

    move-result v0

    return v0
.end method
