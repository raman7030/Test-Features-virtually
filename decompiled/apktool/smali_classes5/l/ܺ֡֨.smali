.class public final Ll/ܺ֡֨;
.super Ll/ۘ֡֨;
.source "643O"

# interfaces
.implements Ll/۠ۢ۠;


# instance fields
.field public ۧ֫:Z

.field public ܽ֫:Ll/ۛ֡֨;


# direct methods
.method public constructor <init>(Ll/ۛ֡֨;Z)V
    .locals 6

    .line 2361
    iget-wide v1, p1, Ll/ۛ֡֨;->᩶:J

    iget-object v3, p1, Ll/ۛ֡֨;->۬:Ll/ۤܶ۠;

    iget-object v4, p1, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    iget-object v5, p1, Ll/ۛ֡֨;->۫:Ll/ۛ֡֨;

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Ll/ۘ֡֨;-><init>(JLl/ۤܶ۠;Ll/ۙ֨֨;Ll/ۛ֡֨;)V

    .line 2362
    iput-object p1, p0, Ll/ܺ֡֨;->ܽ֫:Ll/ۛ֡֨;

    .line 2363
    iput-boolean p2, p0, Ll/ܺ֡֨;->ۧ֫:Z

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ۛ᩸֨;)Ljava/lang/Object;
    .locals 2

    .line 2405
    new-instance p1, Ll/᩺ܶ۠;

    invoke-virtual {p0}, Ll/ܺ֡֨;->۬֫()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget-object v1, p0, Ll/ܺ֡֨;->ܽ֫:Ll/ۛ֡֨;

    invoke-direct {p1, v1, v0}, Ll/᩺ܶ۠;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p1
.end method

.method public final ۘ()I
    .locals 1

    const/16 v0, 0xf

    return v0
.end method

.method public final ۬֫()I
    .locals 6

    .line 2370
    iget-object v0, p0, Ll/ܺ֡֨;->ܽ֫:Ll/ۛ֡֨;

    iget-object v1, v0, Ll/ۛ֡֨;->ۙ:Ll/֨ᩴ֨;

    sget-object v2, Ll/֨ᩴ֨;->ۜ֫:Ll/֨ᩴ֨;

    if-ne v1, v2, :cond_3

    .line 2371
    iget-boolean v1, p0, Ll/ܺ֡֨;->ۧ֫:Z

    if-eqz v1, :cond_1

    .line 2372
    invoke-virtual {v0}, Ll/ۛ֡֨;->֡֫()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x2

    return v0

    :cond_0
    const/4 v0, 0x1

    return v0

    .line 2373
    :cond_1
    invoke-virtual {v0}, Ll/ۛ֡֨;->֡֫()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, 0x4

    return v0

    :cond_2
    const/4 v0, 0x3

    return v0

    .line 2375
    :cond_3
    invoke-virtual {v0}, Ll/ۛ֡֨;->ۜ֫()Z

    move-result v1

    if-eqz v1, :cond_4

    const/16 v0, 0x8

    return v0

    .line 2378
    :cond_4
    invoke-virtual {v0}, Ll/ۛ֡֨;->֡֫()Z

    move-result v1

    if-eqz v1, :cond_5

    const/4 v0, 0x6

    return v0

    .line 2380
    :cond_5
    invoke-virtual {v0}, Ll/ۛ֡֨;->۬()J

    move-result-wide v1

    const-wide/16 v3, 0x2

    and-long/2addr v1, v3

    const-wide/16 v3, 0x0

    cmp-long v5, v1, v3

    if-eqz v5, :cond_8

    move-object v1, p0

    :goto_0
    if-eqz v1, :cond_6

    .line 2393
    instance-of v2, v1, Ll/᩹֡֨;

    if-nez v2, :cond_6

    .line 2394
    iget-object v1, v1, Ll/ۛ֡֨;->۫:Ll/ۛ֡֨;

    goto :goto_0

    :cond_6
    if-eqz v1, :cond_7

    .line 2396
    check-cast v1, Ll/᩹֡֨;

    iget-boolean v1, v1, Ll/᩹֡֨;->֫֫:Z

    if-eqz v1, :cond_7

    goto :goto_1

    :cond_7
    const/4 v0, 0x7

    return v0

    .line 2382
    :cond_8
    :goto_1
    invoke-virtual {v0}, Ll/ۛ֡֨;->ۙ()Ll/ܳ֡֨;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۛ֡֨;->ۘ֫()Z

    move-result v0

    if-eqz v0, :cond_9

    const/16 v0, 0x9

    return v0

    :cond_9
    const/4 v0, 0x5

    return v0
.end method

.method public final ᩹()Ll/ۛ֡֨;
    .locals 1

    .line 2415
    iget-object v0, p0, Ll/ܺ֡֨;->ܽ֫:Ll/ۛ֡֨;

    return-object v0
.end method

.method public final ᩹֫()Ll/ܺ֡֨;
    .locals 0

    return-object p0
.end method
