.class public final Ll/ۗۨ֨;
.super Ll/᩻֨۠;
.source "Y7SB"


# instance fields
.field public final synthetic ۧ:Ll/ۡ᩺֨;

.field public final synthetic ܽ:Z

.field public final synthetic ᩳ:Ll/ۡ֡۠;


# direct methods
.method public constructor <init>(Ll/ۡ᩺֨;ZLl/ۡ֡۠;)V
    .locals 0

    .line 3437
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 660
    iput-object p1, p0, Ll/ۗۨ֨;->ۧ:Ll/ۡ᩺֨;

    iput-boolean p2, p0, Ll/ۗۨ֨;->ܽ:Z

    iput-object p3, p0, Ll/ۗۨ֨;->ᩳ:Ll/ۡ֡۠;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ۚ᩵۠;)V
    .locals 0

    .line 665
    iput-object p1, p0, Ll/᩻֨۠;->֫:Ll/ۚۚ۠;

    return-void
.end method

.method public final ֫(Ll/ۤ֡۠;)V
    .locals 10

    .line 676
    iget-object v0, p1, Ll/ۤ֡۠;->ۗ:Ll/۫᩵۠;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 677
    :goto_0
    iget-boolean v1, p0, Ll/ۗۨ֨;->ܽ:Z

    if-eqz v1, :cond_1

    if-nez v0, :cond_1

    .line 680
    iget-object v0, p0, Ll/ۗۨ֨;->ۧ:Ll/ۡ᩺֨;

    invoke-static {v0}, Ll/ۡ᩺֨;->ۢ(Ll/ۡ᩺֨;)Ll/ۛܶ۠;

    move-result-object v1

    .line 414
    iget-object v1, v1, Ll/ۛܶ۠;->ᩴܽ:Ll/۫ܶ۠;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v2, "$loc"

    .line 224
    invoke-virtual {v2}, Ljava/lang/String;->toCharArray()[C

    move-result-object v2

    .line 225
    array-length v3, v2

    invoke-virtual {v1, v2, v3}, Ll/۫ܶ۠;->֫([CI)Ll/ۤܶ۠;

    move-result-object v7

    .line 680
    iget-object v1, p1, Ll/ۤ֡۠;->ۗ:Ll/۫᩵۠;

    iget-object v8, v1, Ll/ۚۚ۠;->᩹:Ll/ۙ֨֨;

    iget-object v1, p0, Ll/ۗۨ֨;->ᩳ:Ll/ۡ֡۠;

    iget-object v9, v1, Ll/ۡ֡۠;->۟:Ll/ۘ֡֨;

    .line 849
    new-instance v1, Ll/۫֡֨;

    const-wide/16 v5, 0x1000

    move-object v4, v1

    invoke-direct/range {v4 .. v9}, Ll/۫֡֨;-><init>(JLl/ۤܶ۠;Ll/ۙ֨֨;Ll/ۛ֡֨;)V

    .line 681
    invoke-static {v0}, Ll/ۡ᩺֨;->᩷(Ll/ۡ᩺֨;)Ll/ܿ֨۠;

    move-result-object v2

    iget-object p1, p1, Ll/ۤ֡۠;->ۗ:Ll/۫᩵۠;

    invoke-virtual {v2, v1, p1}, Ll/ܿ֨۠;->֫(Ll/۫֡֨;Ll/۫᩵۠;)Ll/ۢۚ۠;

    move-result-object p1

    .line 682
    invoke-static {v0}, Ll/ۡ᩺֨;->᩷(Ll/ۡ᩺֨;)Ll/ܿ֨۠;

    move-result-object v1

    invoke-static {v0}, Ll/ۡ᩺֨;->᩷(Ll/ۡ᩺֨;)Ll/ܿ֨۠;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Ll/ܿ֨۠;->ܽ(Ll/۫᩵۠;)Ll/ۤ֡۠;

    move-result-object v0

    invoke-static {p1, v0}, Ll/ۖܶ۠;->of(Ljava/lang/Object;Ljava/lang/Object;)Ll/ۖܶ۠;

    move-result-object p1

    const-wide/16 v2, 0x0

    invoke-virtual {v1, v2, v3, p1}, Ll/ܿ֨۠;->֫(JLl/ۖܶ۠;)Ll/ۖ᩵۠;

    move-result-object p1

    iput-object p1, p0, Ll/᩻֨۠;->֫:Ll/ۚۚ۠;

    return-void

    .line 684
    :cond_1
    iput-object p1, p0, Ll/᩻֨۠;->֫:Ll/ۚۚ۠;

    return-void
.end method

.method public final ֫(Ll/ܳ֡۠;)V
    .locals 0

    .line 671
    iput-object p1, p0, Ll/᩻֨۠;->֫:Ll/ۚۚ۠;

    return-void
.end method
