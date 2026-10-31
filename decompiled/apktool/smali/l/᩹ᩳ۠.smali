.class public final Ll/᩹ᩳ۠;
.super Ll/ۚᩳ۠;
.source "B7KX"


# instance fields
.field public final synthetic ۬:Ll/ۧܿ۠;


# direct methods
.method public constructor <init>(Ll/ۧܿ۠;)V
    .locals 2

    .line 856
    iput-object p1, p0, Ll/᩹ᩳ۠;->۬:Ll/ۧܿ۠;

    .line 857
    sget-object v0, Ll/۫֨۠;->᩶:Ll/۫֨۠;

    new-instance v1, Ll/֫ܿ۠;

    invoke-direct {v1, p1}, Ll/֫ܿ۠;-><init>(Ll/ۧܿ۠;)V

    invoke-direct {p0, p1, v0, v1}, Ll/ۚᩳ۠;-><init>(Ll/ۧܿ۠;Ll/۫֨۠;Ll/ܰᩳ۠;)V

    return-void
.end method


# virtual methods
.method public final ֫(Ll/֫ۤ֨;)V
    .locals 10

    .line 862
    iget-object v0, p1, Ll/֫ۤ֨;->᩹:Ll/ۚ᩵۠;

    .line 863
    iget-object v1, v0, Ll/ۚ᩵۠;->᩺:Ll/ܳ֡֨;

    .line 864
    iget-object v2, v1, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    check-cast v2, Ll/᩶ۚ֨;

    .line 867
    invoke-static {p1, v0}, Ll/ۚᩳ۠;->֫(Ll/֫ۤ֨;Ll/ۚ᩵۠;)Ll/֫ۤ֨;

    move-result-object v2

    .line 869
    iget-object v3, v0, Ll/ۚ᩵۠;->۬:Ll/۫᩵۠;

    iget-object v4, p0, Ll/᩹ᩳ۠;->۬:Ll/ۧܿ۠;

    if-eqz v3, :cond_0

    .line 870
    invoke-static {v4}, Ll/ۧܿ۠;->֫(Ll/ۧܿ۠;)Ll/۬᩹֨;

    move-result-object v3

    iget-object v5, v0, Ll/ۚ᩵۠;->۬:Ll/۫᩵۠;

    invoke-virtual {v3, v5, v2, v1, v0}, Ll/۬᩹֨;->֫(Ll/ۚۚ۠;Ll/֫ۤ֨;Ll/ۛ֡֨;Ll/ۗ۠۠;)V

    .line 871
    :cond_0
    iget-object v3, v0, Ll/ۚ᩵۠;->۫:Ll/ۖܶ۠;

    invoke-virtual {v3}, Ll/ۖܶ۠;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/۫᩵۠;

    .line 872
    invoke-static {v4}, Ll/ۧܿ۠;->֫(Ll/ۧܿ۠;)Ll/۬᩹֨;

    move-result-object v6

    invoke-virtual {v6, v5, v2, v1, v0}, Ll/۬᩹֨;->֫(Ll/ۚۚ۠;Ll/֫ۤ֨;Ll/ۛ֡֨;Ll/ۗ۠۠;)V

    goto :goto_0

    .line 873
    :cond_1
    invoke-static {v4}, Ll/ۧܿ۠;->֫(Ll/ۧܿ۠;)Ll/۬᩹֨;

    move-result-object v3

    invoke-virtual {v3}, Ll/۬᩹֨;->ܽ()V

    .line 875
    invoke-virtual {p0, p1, v2}, Ll/ۚᩳ۠;->֫(Ll/֫ۤ֨;Ll/֫ۤ֨;)V

    .line 877
    new-instance v3, Ljava/util/HashSet;

    invoke-direct {v3}, Ljava/util/HashSet;-><init>()V

    .line 879
    iget-object v5, v0, Ll/ۚ᩵۠;->۫:Ll/ۖܶ۠;

    invoke-virtual {v5}, Ll/ۖܶ۠;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_2
    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/۫᩵۠;

    .line 880
    iget-object v7, v6, Ll/ۚۚ۠;->᩹:Ll/ۙ֨֨;

    .line 881
    sget-object v8, Ll/ۢ۠֨;->ۨ:Ll/ۢ۠֨;

    invoke-virtual {v7, v8}, Ll/ۙ֨֨;->֫(Ll/ۢ۠֨;)Z

    move-result v8

    if-eqz v8, :cond_2

    .line 882
    invoke-static {v4}, Ll/ۧܿ۠;->ܽ(Ll/ۧܿ۠;)Ll/ܶ۬֨;

    move-result-object v8

    invoke-static {v4}, Ll/ۧܿ۠;->ۚ(Ll/ۧܿ۠;)Ll/ۛ᩸֨;

    move-result-object v9

    invoke-virtual {v9, v7}, Ll/ۛ᩸֨;->ۢ(Ll/ۙ֨֨;)Ll/ۙ֨֨;

    move-result-object v7

    invoke-virtual {v8, v6, v7, v3}, Ll/ܶ۬֨;->֫(Ll/۫᩵۠;Ll/ۙ֨֨;Ljava/util/HashSet;)V

    goto :goto_1

    .line 885
    :cond_3
    invoke-static {v4}, Ll/ۧܿ۠;->֫(Ll/ۧܿ۠;)Ll/۬᩹֨;

    move-result-object v3

    iget-object v5, v0, Ll/ۚ᩵۠;->ۤ:Ll/ۖ֡۠;

    iget-object v5, v5, Ll/ۖ֡۠;->ۗ:Ll/ۖܶ۠;

    invoke-virtual {v3, v5, v2, v1, v0}, Ll/۬᩹֨;->֫(Ll/ۖܶ۠;Ll/֫ۤ֨;Ll/ۛ֡֨;Ll/ۗ۠۠;)V

    .line 887
    invoke-static {v4}, Ll/ۧܿ۠;->ۧ(Ll/ۧܿ۠;)Ll/ۢۗ֨;

    move-result-object v3

    iget-object v5, v0, Ll/ۚ᩵۠;->ܰ:Ll/ۖܶ۠;

    const/4 v6, 0x0

    invoke-virtual {v3, v5, v2, v6}, Ll/ۢۗ֨;->֫(Ll/ۖܶ۠;Ll/֫ۤ֨;Z)V

    .line 889
    iget-object v3, v0, Ll/ۚ᩵۠;->ܰ:Ll/ۖܶ۠;

    invoke-virtual {v3}, Ll/ۖܶ۠;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ܳۚ۠;

    .line 890
    invoke-static {v4}, Ll/ۧܿ۠;->֫(Ll/ۧܿ۠;)Ll/۬᩹֨;

    move-result-object v7

    invoke-virtual {v7, v5, v2, v1, v0}, Ll/۬᩹֨;->֫(Ll/ۚۚ۠;Ll/֫ۤ֨;Ll/ۛ֡֨;Ll/ۗ۠۠;)V

    goto :goto_2

    .line 895
    :cond_4
    iget-object v2, v1, Ll/ۛ֡֨;->۫:Ll/ۛ֡֨;

    iget-object v3, v2, Ll/ۛ֡֨;->ۙ:Ll/֨ᩴ֨;

    sget-object v5, Ll/֨ᩴ֨;->ᩳ֫:Ll/֨ᩴ֨;

    if-ne v3, v5, :cond_5

    iget-object v3, p1, Ll/֫ۤ֨;->۫:Ll/֨᩵۠;

    iget-object v3, v3, Ll/֨᩵۠;->ۛ:Ll/֡֡֨;

    iget-object v3, v3, Ll/֡֡֨;->ۢ֫:Ll/۠֡֨;

    if-eq v2, v3, :cond_5

    invoke-static {v4}, Ll/ۧܿ۠;->ۖ(Ll/ۧܿ۠;)Ll/᩷ۚ֨;

    move-result-object v2

    iget-object v3, p1, Ll/֫ۤ֨;->۫:Ll/֨᩵۠;

    iget-object v3, v3, Ll/֨᩵۠;->ۛ:Ll/֡֡֨;

    iget-object v7, v1, Ll/ܳ֡֨;->ܰ:Ll/ۤܶ۠;

    .line 897
    invoke-virtual {v2, v3, v7}, Ll/᩷ۚ֨;->ܳ(Ll/֡֡֨;Ll/ۤܶ۠;)Z

    move-result v2

    if-eqz v2, :cond_5

    .line 898
    invoke-static {v4}, Ll/ۧܿ۠;->᩷(Ll/ۧܿ۠;)Ll/᩹ܶ۠;

    move-result-object v2

    iget v0, v0, Ll/ۚۚ۠;->᩸:I

    invoke-static {v1}, Ll/᩸ᩴ֨;->֫(Ll/ۛ֡֨;)Ll/۠ᩴ֨;

    move-result-object v3

    sget-object v4, Ll/ۛᩴ۠;->֫:Ll/۫۠۠;

    new-instance v4, Ll/۫۠۠;

    const/4 v7, 0x2

    new-array v7, v7, [Ljava/lang/Object;

    aput-object v3, v7, v6

    const/4 v3, 0x1

    aput-object v1, v7, v3

    const-string v3, "compiler"

    const-string v6, "clash.with.pkg.of.same.name"

    invoke-direct {v4, v3, v6, v7}, Ll/۫۠۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {v2, v0, v4}, Ll/ۖ֨۠;->֫(ILl/۫۠۠;)V

    .line 900
    :cond_5
    iget-object v0, v1, Ll/ۛ֡֨;->۫:Ll/ۛ֡֨;

    iget-object v0, v0, Ll/ۛ֡֨;->ۙ:Ll/֨ᩴ֨;

    if-ne v0, v5, :cond_6

    iget-wide v2, v1, Ll/ۛ֡֨;->᩶:J

    const-wide/16 v4, 0x1

    and-long/2addr v2, v4

    const-wide/16 v4, 0x0

    cmp-long v0, v2, v4

    if-nez v0, :cond_6

    iget-object p1, p1, Ll/֫ۤ֨;->۫:Ll/֨᩵۠;

    iget-object p1, p1, Ll/֨᩵۠;->ܰ:Ll/ᩳ᩶۠;

    iget-object v0, v1, Ll/ۛ֡֨;->۬:Ll/ۤܶ۠;

    .line 901
    invoke-virtual {v0}, Ll/ۤܶ۠;->toString()Ljava/lang/String;

    move-result-object v0

    sget-object v2, Ll/ܽ᩶۠;->۬:Ll/ܽ᩶۠;

    invoke-interface {p1, v0, v2}, Ll/ᩳ᩶۠;->֫(Ljava/lang/String;Ll/ܽ᩶۠;)Z

    move-result p1

    if-nez p1, :cond_6

    .line 902
    iget-wide v2, v1, Ll/ۛ֡֨;->᩶:J

    const-wide v4, 0x100000000000L

    or-long/2addr v2, v4

    iput-wide v2, v1, Ll/ۛ֡֨;->᩶:J

    :cond_6
    return-void
.end method
