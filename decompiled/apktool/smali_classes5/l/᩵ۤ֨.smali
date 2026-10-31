.class public final Ll/᩵ۤ֨;
.super Ll/ᩴۤ֨;
.source "6428"


# instance fields
.field public ۧ:Ll/ۚۚ۠;

.field public final synthetic ܽ:Ll/ۤۤ֨;


# direct methods
.method public constructor <init>(Ll/ۤۤ֨;)V
    .locals 0

    .line 3437
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2900
    iput-object p1, p0, Ll/᩵ۤ֨;->ܽ:Ll/ۤۤ֨;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ۖۚ۠;)V
    .locals 0

    .line 3056
    iget-object p1, p1, Ll/ۖۚ۠;->۬:Ll/۫᩵۠;

    invoke-virtual {p0, p1}, Ll/ᩴۤ֨;->ۧ(Ll/ۚۚ۠;)V

    return-void
.end method

.method public final ֫(Ll/ۘ֡۠;)V
    .locals 0

    return-void
.end method

.method public final ֫(Ll/ۚ᩵۠;)V
    .locals 2

    .line 2976
    iget-object v0, p0, Ll/᩵ۤ֨;->ۧ:Ll/ۚۚ۠;

    .line 2978
    :try_start_0
    iget-object v1, p1, Ll/ۚ᩵۠;->᩺:Ll/ܳ֡֨;

    invoke-virtual {v1}, Ll/ۛ֡֨;->ۡ֫()Z

    move-result v1

    if-eqz v1, :cond_0

    move-object v1, p1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    iput-object v1, p0, Ll/᩵ۤ֨;->ۧ:Ll/ۚۚ۠;

    .line 2979
    invoke-super {p0, p1}, Ll/ܳ֨۠;->֫(Ll/ۚ᩵۠;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2981
    iput-object v0, p0, Ll/᩵ۤ֨;->ۧ:Ll/ۚۚ۠;

    return-void

    :catchall_0
    move-exception p1

    iput-object v0, p0, Ll/᩵ۤ֨;->ۧ:Ll/ۚۚ۠;

    .line 2982
    throw p1
.end method

.method public final ֫(Ll/ۛ֡֨;Ll/ۚۚ۠;)V
    .locals 5

    .line 2955
    sget-object v0, Ll/ۧۤ֨;->ܽ:[I

    iget-object v1, p0, Ll/᩵ۤ֨;->ۧ:Ll/ۚۚ۠;

    invoke-virtual {v1}, Ll/ۚۚ۠;->ܽ֫()Ll/ᩴۚ۠;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 2959
    new-instance p1, Ljava/lang/AssertionError;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "Unexpected tree kind: "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v0, p0, Ll/᩵ۤ֨;->ۧ:Ll/ۚۚ۠;

    invoke-virtual {v0}, Ll/ۚۚ۠;->ܽ֫()Ll/ᩴۚ۠;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1

    .line 2956
    :pswitch_0
    sget-object v0, Ll/ۨᩴ۠;->ۘ֫:Ll/ۨ۠۠;

    goto :goto_0

    .line 2957
    :pswitch_1
    sget-object v0, Ll/ۨᩴ۠;->᩷֫:Ll/ۨ۠۠;

    goto :goto_0

    .line 2958
    :pswitch_2
    sget-object v0, Ll/ۨᩴ۠;->ۖ֫:Ll/ۨ۠۠;

    .line 2961
    :goto_0
    iget-object v1, p0, Ll/᩵ۤ֨;->ܽ:Ll/ۤۤ֨;

    invoke-static {v1}, Ll/ۤۤ֨;->ܳ(Ll/ۤۤ֨;)Ll/᩹ܶ۠;

    move-result-object v2

    invoke-static {v1}, Ll/ۤۤ֨;->ᩳ(Ll/ۤۤ֨;)Ll/ۛ۠۠;

    move-result-object v1

    invoke-virtual {v1, v0}, Ll/ۛ۠۠;->֫(Ll/ۨ۠۠;)Ll/ܽܶ۠;

    move-result-object v0

    sget-object v1, Ll/ۛᩴ۠;->֫:Ll/۫۠۠;

    .line 765
    new-instance v1, Ll/۫۠۠;

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object p1, v3, v4

    const/4 p1, 0x1

    aput-object v0, v3, p1

    const-string p1, "compiler"

    const-string v0, "cant.ref.non.effectively.final.var"

    invoke-direct {v1, p1, v0, v3}, Ll/۫۠۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2961
    invoke-virtual {v2, p2, v1}, Ll/ۖ֨۠;->֫(Ll/ۗ۠۠;Ll/۫۠۠;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x8
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final ֫(Ll/ۜۚ۠;)V
    .locals 2

    .line 3031
    sget-object v0, Ll/ۧۤ֨;->ܽ:[I

    invoke-virtual {p1}, Ll/֨֡۠;->ܽ֫()Ll/ᩴۚ۠;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    const/4 v1, 0x3

    if-eq v0, v1, :cond_0

    const/4 v1, 0x4

    if-eq v0, v1, :cond_0

    const/4 v1, 0x5

    if-eq v0, v1, :cond_0

    .line 3038
    iget-object p1, p1, Ll/ۜۚ۠;->۫:Ll/۫᩵۠;

    invoke-virtual {p0, p1}, Ll/ᩴۤ֨;->ۧ(Ll/ۚۚ۠;)V

    return-void

    .line 3034
    :cond_0
    iget-object v0, p1, Ll/ۜۚ۠;->۫:Ll/۫᩵۠;

    invoke-virtual {p0, v0}, Ll/ᩴۤ֨;->ۧ(Ll/ۚۚ۠;)V

    .line 3035
    iget-object p1, p1, Ll/ۜۚ۠;->۫:Ll/۫᩵۠;

    invoke-virtual {p0, p1}, Ll/᩵ۤ֨;->ᩳ(Ll/ۚۚ۠;)V

    return-void
.end method

.method public final ֫(Ll/۟᩵۠;)V
    .locals 8

    .line 3010
    iget-object v0, p1, Ll/۟᩵۠;->۬:Ll/ۛ֡֨;

    iget-object v1, v0, Ll/ۛ֡֨;->ۙ:Ll/֨ᩴ֨;

    sget-object v2, Ll/֨ᩴ֨;->ۜ֫:Ll/֨ᩴ֨;

    if-ne v1, v2, :cond_1

    .line 3011
    check-cast v0, Ll/۫֡֨;

    .line 2911
    iget-object v1, p0, Ll/᩵ۤ֨;->ۧ:Ll/ۚۚ۠;

    if-eqz v1, :cond_1

    iget-object v2, v0, Ll/ۛ֡֨;->۫:Ll/ۛ֡֨;

    iget-object v2, v2, Ll/ۛ֡֨;->ۙ:Ll/֨ᩴ֨;

    sget-object v3, Ll/֨ᩴ֨;->ۧ֫:Ll/֨ᩴ֨;

    if-ne v2, v3, :cond_1

    iget v2, v0, Ll/۫֡֨;->᩺:I

    .line 506
    invoke-static {v1}, Ll/۟ۚ۠;->ۢ(Ll/ۚۚ۠;)I

    move-result v1

    if-ge v2, v1, :cond_1

    .line 2914
    sget-object v1, Ll/ۧۤ֨;->ܽ:[I

    iget-object v2, p0, Ll/᩵ۤ֨;->ۧ:Ll/ۚۚ۠;

    invoke-virtual {v2}, Ll/ۚۚ۠;->ܽ֫()Ll/ᩴۚ۠;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v1, v1, v2

    const-wide/16 v2, 0x0

    packed-switch v1, :pswitch_data_0

    goto :goto_0

    .line 2916
    :pswitch_0
    iget-object v1, p0, Ll/᩵ۤ֨;->ܽ:Ll/ۤۤ֨;

    invoke-static {v1}, Ll/ۤۤ֨;->֫(Ll/ۤۤ֨;)Z

    move-result v4

    if-nez v4, :cond_0

    .line 111
    iget-wide v4, v0, Ll/ۛ֡֨;->᩶:J

    const-wide/16 v6, 0x10

    and-long/2addr v4, v6

    cmp-long v6, v4, v2

    if-nez v6, :cond_1

    .line 2965
    invoke-static {v1}, Ll/ۤۤ֨;->ܳ(Ll/ۤۤ֨;)Ll/᩹ܶ۠;

    move-result-object v1

    .line 2966
    sget-object v2, Ll/ۛᩴ۠;->֫:Ll/۫۠۠;

    .line 2369
    new-instance v2, Ll/۫۠۠;

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v0, v3, v4

    const-string v0, "compiler"

    const-string v4, "local.var.accessed.from.icls.needs.final"

    invoke-direct {v2, v0, v4, v3}, Ll/۫۠۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2965
    invoke-virtual {v1, p1, v2}, Ll/ۖ֨۠;->֫(Ll/ۗ۠۠;Ll/۫۠۠;)V

    return-void

    .line 111
    :cond_0
    :pswitch_1
    iget-wide v4, v0, Ll/ۛ֡֨;->᩶:J

    const-wide v6, 0x20000000010L

    and-long/2addr v4, v6

    cmp-long v1, v4, v2

    if-nez v1, :cond_1

    .line 2925
    invoke-virtual {p0, v0, p1}, Ll/᩵ۤ֨;->֫(Ll/ۛ֡֨;Ll/ۚۚ۠;)V

    :cond_1
    :goto_0
    return-void

    :pswitch_data_0
    .packed-switch 0x8
        :pswitch_0
        :pswitch_1
        :pswitch_1
    .end packed-switch
.end method

.method public final ֫(Ll/ۢ᩵۠;)V
    .locals 1

    .line 3025
    iget-object v0, p1, Ll/ۢ᩵۠;->۫:Ll/۫᩵۠;

    invoke-virtual {p0, v0}, Ll/ᩴۤ֨;->ۧ(Ll/ۚۚ۠;)V

    .line 3026
    iget-object v0, p1, Ll/ۢ᩵۠;->ۤ:Ll/۫᩵۠;

    invoke-virtual {p0, v0}, Ll/ᩴۤ֨;->ۧ(Ll/ۚۚ۠;)V

    .line 3027
    iget-object p1, p1, Ll/ۢ᩵۠;->۫:Ll/۫᩵۠;

    invoke-virtual {p0, p1}, Ll/᩵ۤ֨;->ᩳ(Ll/ۚۚ۠;)V

    return-void
.end method

.method public final ֫(Ll/ۧۚ۠;)V
    .locals 8

    .line 3043
    iget-object v0, p1, Ll/ۧۚ۠;->ۛ:Ll/ۖܶ۠;

    invoke-virtual {v0}, Ll/ۖܶ۠;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۚۚ۠;

    .line 3044
    sget-object v2, Ll/ᩴۚ۠;->᩹ܽ:Ll/ᩴۚ۠;

    invoke-virtual {v1, v2}, Ll/ۚۚ۠;->֫(Ll/ᩴۚ۠;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 3045
    invoke-static {v1}, Ll/۟ۚ۠;->᩹(Ll/ۚۚ۠;)Ll/ۛ֡֨;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 3046
    invoke-virtual {v2}, Ll/ۛ֡֨;->۬()J

    move-result-wide v3

    const-wide v5, 0x20000000010L

    and-long/2addr v3, v5

    const-wide/16 v5, 0x0

    cmp-long v7, v3, v5

    if-nez v7, :cond_0

    .line 3047
    iget-object v3, p0, Ll/᩵ۤ֨;->ܽ:Ll/ۤۤ֨;

    invoke-static {v3}, Ll/ۤۤ֨;->ܳ(Ll/ۤۤ֨;)Ll/᩹ܶ۠;

    move-result-object v3

    sget-object v4, Ll/ۛᩴ۠;->֫:Ll/۫۠۠;

    .line 3729
    new-instance v4, Ll/۫۠۠;

    const/4 v5, 0x1

    new-array v5, v5, [Ljava/lang/Object;

    const/4 v6, 0x0

    aput-object v2, v5, v6

    const-string v2, "compiler"

    const-string v6, "try.with.resources.expr.effectively.final.var"

    invoke-direct {v4, v2, v6, v5}, Ll/۫۠۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3047
    invoke-virtual {v3, v1, v4}, Ll/ۖ֨۠;->֫(Ll/ۗ۠۠;Ll/۫۠۠;)V

    goto :goto_0

    .line 3051
    :cond_1
    invoke-super {p0, p1}, Ll/ܳ֨۠;->֫(Ll/ۧۚ۠;)V

    return-void
.end method

.method public final ֫(Ll/ܰ᩵۠;)V
    .locals 1

    .line 2998
    iget-object v0, p1, Ll/ܰ᩵۠;->۬:Ll/᩹֡۠;

    invoke-virtual {p0, v0}, Ll/ᩴۤ֨;->ۧ(Ll/ۚۚ۠;)V

    .line 2999
    iget-object v0, p0, Ll/᩵ۤ֨;->ۧ:Ll/ۚۚ۠;

    .line 3001
    :try_start_0
    iput-object p1, p0, Ll/᩵ۤ֨;->ۧ:Ll/ۚۚ۠;

    .line 3002
    iget-object p1, p1, Ll/ܰ᩵۠;->ۗ:Ll/۫᩵۠;

    invoke-virtual {p0, p1}, Ll/ᩴۤ֨;->ۧ(Ll/ۚۚ۠;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3004
    iput-object v0, p0, Ll/᩵ۤ֨;->ۧ:Ll/ۚۚ۠;

    return-void

    :catchall_0
    move-exception p1

    iput-object v0, p0, Ll/᩵ۤ֨;->ۧ:Ll/ۚۚ۠;

    .line 3005
    throw p1
.end method

.method public final ֫(Ll/ܳ֡۠;)V
    .locals 1

    .line 2987
    iget-object v0, p0, Ll/᩵ۤ֨;->ۧ:Ll/ۚۚ۠;

    .line 2989
    :try_start_0
    iput-object p1, p0, Ll/᩵ۤ֨;->ۧ:Ll/ۚۚ۠;

    .line 2990
    invoke-super {p0, p1}, Ll/ܳ֨۠;->֫(Ll/ܳ֡۠;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2992
    iput-object v0, p0, Ll/᩵ۤ֨;->ۧ:Ll/ۚۚ۠;

    return-void

    :catchall_0
    move-exception p1

    iput-object v0, p0, Ll/᩵ۤ֨;->ۧ:Ll/ۚۚ۠;

    .line 2993
    throw p1
.end method

.method public final ֫(Ll/᩷᩵۠;)V
    .locals 2

    .line 3016
    iget-object v0, p1, Ll/᩷᩵۠;->ۗ:Ll/۫᩵۠;

    invoke-static {v0}, Ll/۟ۚ۠;->ۧ(Ll/۫᩵۠;)Ll/۫᩵۠;

    move-result-object v0

    .line 3017
    instance-of v1, v0, Ll/۟᩵۠;

    if-nez v1, :cond_0

    .line 3018
    invoke-virtual {p0, v0}, Ll/ᩴۤ֨;->ۧ(Ll/ۚۚ۠;)V

    .line 3020
    :cond_0
    iget-object p1, p1, Ll/᩷᩵۠;->۬:Ll/۫᩵۠;

    invoke-virtual {p0, p1}, Ll/ᩴۤ֨;->ۧ(Ll/ۚۚ۠;)V

    .line 3021
    invoke-virtual {p0, v0}, Ll/᩵ۤ֨;->ᩳ(Ll/ۚۚ۠;)V

    return-void
.end method

.method public final ᩳ()V
    .locals 0

    return-void
.end method

.method public final ᩳ(Ll/ۚۚ۠;)V
    .locals 5

    .line 2933
    invoke-static {p1}, Ll/۟ۚ۠;->᩸(Ll/ۚۚ۠;)Ll/ۚۚ۠;

    move-result-object p1

    .line 2934
    sget-object v0, Ll/ᩴۚ۠;->᩶֫:Ll/ᩴۚ۠;

    invoke-virtual {p1, v0}, Ll/ۚۚ۠;->֫(Ll/ᩴۚ۠;)Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Ll/ᩴۚ۠;->᩺ۧ:Ll/ᩴۚ۠;

    invoke-virtual {p1, v0}, Ll/ۚۚ۠;->֫(Ll/ᩴۚ۠;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 2935
    :cond_0
    invoke-static {p1}, Ll/۟ۚ۠;->᩹(Ll/ۚۚ۠;)Ll/ۛ֡֨;

    move-result-object v0

    .line 2936
    iget-object v1, p0, Ll/᩵ۤ֨;->ۧ:Ll/ۚۚ۠;

    if-eqz v1, :cond_2

    iget-object v2, v0, Ll/ۛ֡֨;->ۙ:Ll/֨ᩴ֨;

    sget-object v3, Ll/֨ᩴ֨;->ۜ֫:Ll/֨ᩴ֨;

    if-ne v2, v3, :cond_2

    iget-object v2, v0, Ll/ۛ֡֨;->۫:Ll/ۛ֡֨;

    iget-object v2, v2, Ll/ۛ֡֨;->ۙ:Ll/֨ᩴ֨;

    sget-object v3, Ll/֨ᩴ֨;->ۧ֫:Ll/֨ᩴ֨;

    if-ne v2, v3, :cond_2

    move-object v2, v0

    check-cast v2, Ll/۫֡֨;

    iget v2, v2, Ll/۫֡֨;->᩺:I

    .line 506
    invoke-static {v1}, Ll/۟ۚ۠;->ۢ(Ll/ۚۚ۠;)I

    move-result v1

    if-ge v2, v1, :cond_2

    .line 2940
    sget-object v1, Ll/ۧۤ֨;->ܽ:[I

    iget-object v2, p0, Ll/᩵ۤ֨;->ۧ:Ll/ۚۚ۠;

    invoke-virtual {v2}, Ll/ۚۚ۠;->ܽ֫()Ll/ᩴۚ۠;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v1, v1, v2

    packed-switch v1, :pswitch_data_0

    goto :goto_0

    .line 2942
    :pswitch_0
    iget-object v1, p0, Ll/᩵ۤ֨;->ܽ:Ll/ۤۤ֨;

    invoke-static {v1}, Ll/ۤۤ֨;->֫(Ll/ۤۤ֨;)Z

    move-result v2

    if-nez v2, :cond_1

    .line 2965
    invoke-static {v1}, Ll/ۤۤ֨;->ܳ(Ll/ۤۤ֨;)Ll/᩹ܶ۠;

    move-result-object v1

    .line 2966
    sget-object v2, Ll/ۛᩴ۠;->֫:Ll/۫۠۠;

    .line 2369
    new-instance v2, Ll/۫۠۠;

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v0, v3, v4

    const-string v0, "compiler"

    const-string v4, "local.var.accessed.from.icls.needs.final"

    invoke-direct {v2, v0, v4, v3}, Ll/۫۠۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2965
    invoke-virtual {v1, p1, v2}, Ll/ۖ֨۠;->֫(Ll/ۗ۠۠;Ll/۫۠۠;)V

    return-void

    .line 2948
    :cond_1
    :pswitch_1
    invoke-virtual {p0, v0, p1}, Ll/᩵ۤ֨;->֫(Ll/ۛ֡֨;Ll/ۚۚ۠;)V

    :cond_2
    :goto_0
    return-void

    :pswitch_data_0
    .packed-switch 0x8
        :pswitch_0
        :pswitch_1
        :pswitch_1
    .end packed-switch
.end method
