.class public final Ll/᩵ۛܳ;
.super Ll/ۧ᩻ᩳ;
.source "6B6V"


# instance fields
.field public ۗ:Ll/ۤۢܳ;

.field public ۙ:Ll/ܶ᩵ܿ;

.field public final synthetic ۫:Ll/ۙۜᩴ;

.field public final synthetic ۬:Ll/֡ۛܳ;

.field public ᩶:Ll/ۘܳᩳ;


# direct methods
.method public constructor <init>(Ll/֡ۛܳ;Ll/ۚۛܳ;Ll/᩺ۤܿ;Ll/ۙۜᩴ;)V
    .locals 0

    .line 304
    iput-object p1, p0, Ll/᩵ۛܳ;->۬:Ll/֡ۛܳ;

    iput-object p4, p0, Ll/᩵ۛܳ;->۫:Ll/ۙۜᩴ;

    invoke-direct {p0, p2, p3}, Ll/ۧ᩻ᩳ;-><init>(Ll/ۚۛܳ;Ll/᩺ۤܿ;)V

    return-void
.end method


# virtual methods
.method public final ܳ()Lnet/sf/sevenzipjbinding/ISequentialOutStream;
    .locals 2

    .line 320
    new-instance v0, Ll/᩵᩺᩵;

    iget-object v1, p0, Ll/᩵ۛܳ;->ۙ:Ll/ܶ᩵ܿ;

    invoke-direct {v0, v1}, Ll/᩵᩺᩵;-><init>(Ll/ܶ᩵ܿ;)V

    return-object v0
.end method

.method public final ᩷(I)V
    .locals 1

    .line 311
    iget-object v0, p0, Ll/᩵ۛܳ;->۫:Ll/ۙۜᩴ;

    invoke-virtual {v0, p1}, Ll/ۙۜᩴ;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/util/Pair;

    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 312
    iget-object v0, p1, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v0, Ll/ۤۢܳ;

    iput-object v0, p0, Ll/᩵ۛܳ;->ۗ:Ll/ۤۢܳ;

    .line 313
    iget-object p1, p1, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast p1, Ll/ۘܳᩳ;

    iput-object p1, p0, Ll/᩵ۛܳ;->᩶:Ll/ۘܳᩳ;

    .line 314
    iget-object p1, p0, Ll/᩵ۛܳ;->۬:Ll/֡ۛܳ;

    iget-object p1, p1, Ll/֡ۛܳ;->᩻:Ll/ܶ᩵ܿ;

    invoke-virtual {v0}, Ll/ۤۢܳ;->᩻()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object p1

    iput-object p1, p0, Ll/᩵ۛܳ;->ۙ:Ll/ܶ᩵ܿ;

    .line 315
    new-instance p1, Ll/ᩴۛܳ;

    invoke-direct {p1, p0}, Ll/ᩴۛܳ;-><init>(Ll/᩵ۛܳ;)V

    invoke-static {p1}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final ᩹()V
    .locals 6

    .line 325
    iget-object v0, p0, Ll/᩵ۛܳ;->ۗ:Ll/ۤۢܳ;

    iget-object v1, p0, Ll/᩵ۛܳ;->ۙ:Ll/ܶ᩵ܿ;

    invoke-virtual {v0, v1}, Ll/ۤۢܳ;->֫(Ll/ܶ᩵ܿ;)V

    .line 326
    iget-object v0, p0, Ll/᩵ۛܳ;->۬:Ll/֡ۛܳ;

    iget-object v1, v0, Ll/֡ۛܳ;->ۜ:Ljava/util/ArrayList;

    new-instance v2, Ll/ۛۢܳ;

    iget-object v3, p0, Ll/᩵ۛܳ;->ۗ:Ll/ۤۢܳ;

    invoke-virtual {v3}, Ll/ۤۢܳ;->ᩳ()Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Ll/᩵ۛܳ;->᩶:Ll/ۘܳᩳ;

    invoke-virtual {v4}, Ll/ۘܳᩳ;->ܿ()Ljava/lang/String;

    move-result-object v4

    iget-object v5, p0, Ll/᩵ۛܳ;->ۙ:Ll/ܶ᩵ܿ;

    invoke-direct {v2, v5, v3, v4}, Ll/ۛۢܳ;-><init>(Ll/ܶ᩵ܿ;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 327
    iget-object v0, v0, Ll/֡ۛܳ;->᩷:Ljava/util/HashSet;

    iget-object v1, p0, Ll/᩵ۛܳ;->᩶:Ll/ۘܳᩳ;

    invoke-virtual {v1}, Ll/ۘܳᩳ;->ܿ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    return-void
.end method
