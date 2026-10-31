.class public Ll/۬ܶ֨;
.super Ljava/lang/Object;
.source "X43L"


# instance fields
.field public ֫:Ll/ۛ֡֨;

.field public final synthetic ۧ:Ll/۫ܶ֨;


# direct methods
.method public constructor <init>(Ll/۫ܶ֨;Ll/ۛ֡֨;)V
    .locals 0

    .line 670
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۬ܶ֨;->ۧ:Ll/۫ܶ֨;

    .line 671
    iput-object p2, p0, Ll/۬ܶ֨;->֫:Ll/ۛ֡֨;

    return-void
.end method


# virtual methods
.method public ֫(Ll/ۙ֨֨;)Ll/ۙ֨֨;
    .locals 4

    .line 679
    iget-object v0, p0, Ll/۬ܶ֨;->ۧ:Ll/۫ܶ֨;

    iget-object v1, v0, Ll/۫ܶ֨;->ۧ:Ll/ۛ᩸֨;

    iget-object v0, v0, Ll/۫ܶ֨;->ۧ:Ll/ۛ᩸֨;

    invoke-virtual {v1, p1}, Ll/ۛ᩸֨;->ܶ(Ll/ۙ֨֨;)Ll/ۙ֨֨;

    move-result-object p1

    .line 680
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    instance-of v1, p1, Ll/ۛۚ֨;

    if-eqz v1, :cond_1

    .line 681
    move-object v1, p1

    check-cast v1, Ll/ۛۚ֨;

    .line 682
    invoke-virtual {v1}, Ll/ۛۚ֨;->۫֫()Ll/ۖܶ۠;

    move-result-object v1

    invoke-virtual {v1}, Ll/ۖܶ۠;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۙ֨֨;

    .line 683
    iget-object v3, v0, Ll/ۛ᩸֨;->᩷:Ll/ܶ۬֨;

    invoke-virtual {v3, v2}, Ll/ܶ۬֨;->֫(Ll/ۙ֨֨;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    .line 686
    :cond_0
    iget-object v0, v0, Ll/ۛ᩸֨;->ᩴ:Ll/ۛ۠۠;

    invoke-static {p1}, Ll/ۨᩴ۠;->ۧ(Ll/ۙ֨֨;)Ll/ۨ۠۠;

    move-result-object p1

    invoke-virtual {v0, p1}, Ll/ۛ۠۠;->֫(Ll/ۨ۠۠;)Ll/ܽܶ۠;

    move-result-object p1

    .line 809
    new-instance v0, Ll/ۛܶ֨;

    .line 645
    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    .line 650
    iput-object p1, v0, Ll/ۛܶ֨;->᩸:Ll/ܽܶ۠;

    .line 686
    throw v0

    .line 690
    :cond_1
    iget-object v1, v0, Ll/ۛ᩸֨;->᩷:Ll/ܶ۬֨;

    invoke-virtual {v1, p1}, Ll/ܶ۬֨;->֫(Ll/ۙ֨֨;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 696
    :cond_2
    iget-object v1, p0, Ll/۬ܶ֨;->֫:Ll/ۛ֡֨;

    invoke-virtual {v0, v1, p1}, Ll/ۛ᩸֨;->ܽ(Ll/ۛ֡֨;Ll/ۙ֨֨;)Ll/ۙ֨֨;

    move-result-object p1

    return-object p1

    .line 693
    :cond_3
    iget-object v0, v0, Ll/ۛ᩸֨;->ᩴ:Ll/ۛ۠۠;

    invoke-static {p1}, Ll/ۨᩴ۠;->ۧ(Ll/ۙ֨֨;)Ll/ۨ۠۠;

    move-result-object p1

    invoke-virtual {v0, p1}, Ll/ۛ۠۠;->֫(Ll/ۨ۠۠;)Ll/ܽܶ۠;

    move-result-object p1

    .line 809
    new-instance v0, Ll/ۛܶ֨;

    .line 645
    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    .line 650
    iput-object p1, v0, Ll/ۛܶ֨;->᩸:Ll/ܽܶ۠;

    .line 693
    throw v0
.end method
