.class public abstract Ll/ۘ᩵֨;
.super Ljava/lang/Object;
.source "R450"


# instance fields
.field public final ֫:Z

.field public ۧ:Ljava/util/HashSet;

.field public final synthetic ܽ:Ll/ᩴ᩵֨;


# direct methods
.method public constructor <init>(Ll/ᩴ᩵֨;Z)V
    .locals 0

    .line 996
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۘ᩵֨;->ܽ:Ll/ᩴ᩵֨;

    .line 993
    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    iput-object p1, p0, Ll/ۘ᩵֨;->ۧ:Ljava/util/HashSet;

    .line 994
    sget p1, Ll/ۖܶ۠;->᩶:I

    .line 997
    iput-boolean p2, p0, Ll/ۘ᩵֨;->֫:Z

    return-void
.end method


# virtual methods
.method public abstract ֫(Ll/᩶֡֨;)Ljava/lang/Iterable;
.end method

.method public final ֫(Ll/᩶֡֨;Ll/ۖܶ۠;)Ll/ۖܶ۠;
    .locals 3

    if-eqz p1, :cond_2

    .line 1000
    iget-object v0, p0, Ll/ۘ᩵֨;->ۧ:Ljava/util/HashSet;

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_1

    .line 1004
    :cond_0
    iget-boolean v0, p0, Ll/ۘ᩵֨;->֫:Z

    if-eqz v0, :cond_1

    .line 1006
    iget-object v0, p0, Ll/ۘ᩵֨;->ܽ:Ll/ᩴ᩵֨;

    invoke-static {v0}, Ll/ᩴ᩵֨;->ᩳ(Ll/ᩴ᩵֨;)Ll/ۛ᩸֨;

    move-result-object v1

    iget-object v2, p1, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    invoke-virtual {v1, v2}, Ll/ۛ᩸֨;->᩸(Ll/ۙ֨֨;)Ll/ۙ֨֨;

    move-result-object v1

    iget-object v1, v1, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    invoke-virtual {p0, v1, p2}, Ll/ۘ᩵֨;->֫(Ll/᩶֡֨;Ll/ۖܶ۠;)Ll/ۖܶ۠;

    move-result-object p2

    .line 1007
    invoke-static {v0}, Ll/ᩴ᩵֨;->ᩳ(Ll/ᩴ᩵֨;)Ll/ۛ᩸֨;

    move-result-object v0

    iget-object v1, p1, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    invoke-virtual {v0, v1}, Ll/ۛ᩸֨;->ۖ(Ll/ۙ֨֨;)Ll/ۖܶ۠;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۖܶ۠;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۙ֨֨;

    .line 1008
    iget-object v1, v1, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    invoke-virtual {p0, v1, p2}, Ll/ۘ᩵֨;->֫(Ll/᩶֡֨;Ll/ۖܶ۠;)Ll/ۖܶ۠;

    move-result-object p2

    goto :goto_0

    .line 1011
    :cond_1
    invoke-virtual {p0, p1}, Ll/ۘ᩵֨;->֫(Ll/᩶֡֨;)Ljava/lang/Iterable;

    move-result-object p1

    invoke-virtual {p2, p1}, Ll/ۖܶ۠;->ۧ(Ljava/lang/Object;)Ll/ۖܶ۠;

    move-result-object p1

    return-object p1

    :cond_2
    :goto_1
    return-object p2
.end method
