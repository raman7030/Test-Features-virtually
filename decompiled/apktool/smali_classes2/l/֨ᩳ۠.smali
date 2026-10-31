.class public abstract Ll/֨ᩳ۠;
.super Ll/ܰᩳ۠;
.source "B7KX"


# instance fields
.field public ۗ:Z

.field public ۫:Ll/ۖܶ۠;

.field public final synthetic ۬:Ll/ۧܿ۠;


# direct methods
.method public constructor <init>(Ll/ۧܿ۠;Ll/۫֨۠;Ll/ۨᩳ۠;)V
    .locals 0

    .line 909
    iput-object p1, p0, Ll/֨ᩳ۠;->۬:Ll/ۧܿ۠;

    .line 910
    invoke-direct {p0, p1, p2, p3}, Ll/ܰᩳ۠;-><init>(Ll/ۧܿ۠;Ll/۫֨۠;Ll/ܰᩳ۠;)V

    .line 914
    invoke-static {}, Ll/ۖܶ۠;->ܳ()Ll/ۖܶ۠;

    move-result-object p1

    iput-object p1, p0, Ll/֨ᩳ۠;->۫:Ll/ۖܶ۠;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ܳ֡֨;Ll/֫ۤ֨;)V
    .locals 11

    .line 936
    iget-object v0, p1, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    move-object v6, v0

    check-cast v6, Ll/᩶ۚ֨;

    .line 938
    new-instance v7, Ll/۫֡֨;

    iget-object v8, p0, Ll/֨ᩳ۠;->۬:Ll/ۧܿ۠;

    invoke-static {v8}, Ll/ۧܿ۠;->ܺ(Ll/ۧܿ۠;)Ll/ۛܶ۠;

    move-result-object v0

    iget-object v3, v0, Ll/ۛܶ۠;->᩶֫:Ll/ۤܶ۠;

    iget-object v4, p1, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    const-wide/32 v1, 0x40010

    move-object v0, v7

    move-object v5, p1

    invoke-direct/range {v0 .. v5}, Ll/۫֡֨;-><init>(JLl/ۤܶ۠;Ll/ۙ֨֨;Ll/ۛ֡֨;)V

    const/4 v9, 0x0

    .line 940
    iput v9, v7, Ll/۫֡֨;->᩺:I

    .line 941
    iget-object v10, p2, Ll/֫ۤ֨;->ۙ:Ljava/lang/Object;

    move-object v0, v10

    check-cast v0, Ll/ۡۗ֨;

    iget-object v0, v0, Ll/ۡۗ֨;->ۘ:Ll/ܰ᩵֨;

    invoke-virtual {v0, v7}, Ll/ܰ᩵֨;->ܿ(Ll/ۛ֡֨;)V

    .line 943
    iget-wide v0, p1, Ll/ۛ֡֨;->᩶:J

    const-wide/16 v2, 0x200

    and-long/2addr v0, v2

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    iget-object v0, v6, Ll/᩶ۚ֨;->۟:Ll/ۙ֨֨;

    sget-object v1, Ll/ۢ۠֨;->ۨ:Ll/ۢ۠֨;

    .line 944
    invoke-virtual {v0, v1}, Ll/ۙ֨֨;->֫(Ll/ۢ۠֨;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 945
    new-instance v7, Ll/۫֡֨;

    invoke-static {v8}, Ll/ۧܿ۠;->ܺ(Ll/ۧܿ۠;)Ll/ۛܶ۠;

    move-result-object v0

    iget-object v3, v0, Ll/ۛܶ۠;->᩹֫:Ll/ۤܶ۠;

    iget-object v4, v6, Ll/᩶ۚ֨;->۟:Ll/ۙ֨֨;

    const-wide/32 v1, 0x40010

    move-object v0, v7

    move-object v5, p1

    invoke-direct/range {v0 .. v5}, Ll/۫֡֨;-><init>(JLl/ۤܶ۠;Ll/ۙ֨֨;Ll/ۛ֡֨;)V

    .line 948
    iput v9, v7, Ll/۫֡֨;->᩺:I

    .line 949
    check-cast v10, Ll/ۡۗ֨;

    iget-object v0, v10, Ll/ۡۗ֨;->ۘ:Ll/ܰ᩵֨;

    invoke-virtual {v0, v7}, Ll/ܰ᩵֨;->ܿ(Ll/ۛ֡֨;)V

    :cond_0
    return-void
.end method

.method public final ۧ(Ll/ۖܶ۠;)V
    .locals 2

    .line 918
    iget-object v0, p0, Ll/֨ᩳ۠;->۫:Ll/ۖܶ۠;

    invoke-virtual {v0, p1}, Ll/ۖܶ۠;->ܽ(Ll/ۖܶ۠;)Ll/ۖܶ۠;

    move-result-object p1

    iput-object p1, p0, Ll/֨ᩳ۠;->۫:Ll/ۖܶ۠;

    .line 919
    iget-boolean p1, p0, Ll/֨ᩳ۠;->ۗ:Z

    if-eqz p1, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    .line 923
    iput-boolean v0, p0, Ll/֨ᩳ۠;->ۗ:Z

    .line 925
    :goto_0
    :try_start_0
    iget-object v0, p0, Ll/֨ᩳ۠;->۫:Ll/ۖܶ۠;

    invoke-virtual {v0}, Ll/ۖܶ۠;->ܽ()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 926
    iget-object v0, p0, Ll/֨ᩳ۠;->۫:Ll/ۖܶ۠;

    iget-object v1, v0, Ll/ۖܶ۠;->᩸:Ljava/lang/Object;

    check-cast v1, Ll/֫ۤ֨;

    .line 927
    iget-object v0, v0, Ll/ۖܶ۠;->᩹:Ll/ۖܶ۠;

    iput-object v0, p0, Ll/֨ᩳ۠;->۫:Ll/ۖܶ۠;

    .line 928
    invoke-static {v1}, Ll/ۖܶ۠;->of(Ljava/lang/Object;)Ll/ۖܶ۠;

    move-result-object v0

    invoke-super {p0, v0}, Ll/ܰᩳ۠;->ۧ(Ll/ۖܶ۠;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 931
    :cond_1
    iput-boolean p1, p0, Ll/֨ᩳ۠;->ۗ:Z

    return-void

    :catchall_0
    move-exception v0

    iput-boolean p1, p0, Ll/֨ᩳ۠;->ۗ:Z

    .line 932
    throw v0
.end method
