.class public final Ll/ܽᩴᩳ;
.super Ljava/lang/Object;
.source "16RW"


# instance fields
.field public ֫:[B

.field public ۜ:Z

.field public final ۢ:Ll/۫ۨᩳ;

.field public final ۧ:Ll/᩹ܶᩳ;

.field public ܳ:Z

.field public final ܽ:Landroid/os/Handler;

.field public ܿ:J

.field public final ᩳ:Ll/ۨ᩵ᩳ;

.field public final ᩷:Ll/۟ۘᩳ;

.field public final ᩻:I


# direct methods
.method public constructor <init>(Ll/᩹ܶᩳ;Ll/ۨ᩵ᩳ;I)V
    .locals 2

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Ll/ܽᩴᩳ;->ܽ:Landroid/os/Handler;

    .line 20
    new-instance v0, Ll/۟ۘᩳ;

    invoke-direct {v0, p0}, Ll/۟ۘᩳ;-><init>(Ll/ܽᩴᩳ;)V

    iput-object v0, p0, Ll/ܽᩴᩳ;->᩷:Ll/۟ۘᩳ;

    const-wide/16 v0, -0x1

    .line 22
    iput-wide v0, p0, Ll/ܽᩴᩳ;->ܿ:J

    .line 26
    iput-object p1, p0, Ll/ܽᩴᩳ;->ۧ:Ll/᩹ܶᩳ;

    iput-object p2, p0, Ll/ܽᩴᩳ;->ᩳ:Ll/ۨ᩵ᩳ;

    iget-object p1, p1, Ll/᩹ܶᩳ;->᩺:Ll/۫ۨᩳ;

    iput-object p1, p0, Ll/ܽᩴᩳ;->ۢ:Ll/۫ۨᩳ;

    iput p3, p0, Ll/ܽᩴᩳ;->᩻:I

    return-void
.end method

.method public static synthetic ֫(JLl/ܽᩴᩳ;Ljava/lang/Throwable;[B)V
    .locals 8

    .line 47
    iget-object v0, p2, Ll/ܽᩴᩳ;->ܽ:Landroid/os/Handler;

    new-instance v7, Ll/ۧᩴᩳ;

    move-object v1, v7

    move-wide v2, p0

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    invoke-direct/range {v1 .. v6}, Ll/ۧᩴᩳ;-><init>(JLl/ܽᩴᩳ;Ljava/lang/Throwable;[B)V

    invoke-virtual {v0, v7}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public static ֫(Ll/ܽᩴᩳ;)V
    .locals 17

    move-object/from16 v1, p0

    .line 35
    iget-object v0, v1, Ll/ܽᩴᩳ;->ۢ:Ll/۫ۨᩳ;

    iget-object v2, v1, Ll/ܽᩴᩳ;->ᩳ:Ll/ۨ᩵ᩳ;

    iget-object v3, v1, Ll/ܽᩴᩳ;->ۧ:Ll/᩹ܶᩳ;

    iget-boolean v4, v1, Ll/ܽᩴᩳ;->ۜ:Z

    if-nez v4, :cond_4

    invoke-virtual {v3, v2, v0}, Ll/᩹ܶᩳ;->֫(Ll/ۨ᩵ᩳ;Ll/۫ۨᩳ;)Z

    move-result v4

    if-nez v4, :cond_0

    goto/16 :goto_2

    .line 36
    :cond_0
    iget-boolean v4, v1, Ll/ܽᩴᩳ;->ܳ:Z

    if-nez v4, :cond_3

    invoke-virtual {v0}, Ll/۫ۨᩳ;->ᩴ()Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_1

    .line 38
    :cond_1
    :try_start_0
    new-instance v0, Ll/ۤۜܽ;

    invoke-direct {v0}, Ll/ۤۜܽ;-><init>()V

    new-instance v4, Ll/ۤۜܽ;

    invoke-direct {v4}, Ll/ۤۜܽ;-><init>()V

    .line 39
    iget-object v5, v3, Ll/᩹ܶᩳ;->ܰ:Ll/ܶ᩺ᩳ;

    invoke-virtual {v5, v0}, Ll/ܶ᩺ᩳ;->ۧ(Ll/ۤۜܽ;)V

    iget-object v5, v3, Ll/᩹ܶᩳ;->ܰ:Ll/ܶ᩺ᩳ;

    invoke-virtual {v5, v4}, Ll/ܶ᩺ᩳ;->֫(Ll/ۤۜܽ;)V

    .line 40
    iget-object v5, v3, Ll/֫ۘᩳ;->᩸:Landroid/os/Bundle;

    const-string v6, "changed"

    iget-object v7, v2, Ll/ۨ᩵ᩳ;->ᩴ:Ll/ۙ֫ܿ;

    invoke-virtual {v7}, Ll/ۙ֫ܿ;->isChanged()Z

    move-result v7

    invoke-virtual {v3, v7}, Ll/᩹ܶᩳ;->ᩳ(Z)Z

    move-result v7

    invoke-virtual {v5, v6, v7}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 41
    iget-object v8, v1, Ll/ܽᩴᩳ;->ۢ:Ll/۫ۨᩳ;

    iget-object v9, v3, Ll/֫ۘᩳ;->᩸:Landroid/os/Bundle;

    invoke-virtual {v3}, Ll/᩹ܶᩳ;->ۗ()Ll/᩺ܶᩳ;

    move-result-object v10

    .line 42
    invoke-virtual {v0}, Ll/ۤۜܽ;->᩻()[B

    move-result-object v11

    invoke-virtual {v4}, Ll/ۤۜܽ;->᩻()[B

    move-result-object v12

    iget v13, v1, Ll/ܽᩴᩳ;->᩻:I

    iget-wide v14, v1, Ll/ܽᩴᩳ;->ܿ:J

    iget-object v0, v1, Ll/ܽᩴᩳ;->֫:[B

    move-object/from16 v16, v0

    .line 41
    invoke-static/range {v8 .. v16}, Ll/۬ᩴᩳ;->֫(Ll/۫ۨᩳ;Landroid/os/Bundle;Ll/᩺ܶᩳ;[B[BIJ[B)Ll/۬ᩴᩳ;

    move-result-object v0

    if-nez v0, :cond_2

    .line 43
    invoke-direct/range {p0 .. p0}, Ll/ܽᩴᩳ;->ܽ()V

    return-void

    .line 44
    :cond_2
    invoke-virtual {v0}, Ll/۬ᩴᩳ;->ᩳ()[B

    move-result-object v4

    .line 45
    invoke-virtual {v0}, Ll/۬ᩴᩳ;->ۖ()J

    move-result-wide v5

    const/4 v7, 0x1

    .line 46
    iput-boolean v7, v1, Ll/ܽᩴᩳ;->ܳ:Z

    .line 47
    iget-object v2, v2, Ll/ۨ᩵ᩳ;->ۡ:Ll/᩻ᩴᩳ;

    invoke-virtual {v2, v0}, Ll/᩻ᩴᩳ;->ۧ(Ll/۬ᩴᩳ;)Ll/ۗ᩻᩵;

    move-result-object v0

    new-instance v2, Ll/֫ᩴᩳ;

    invoke-direct {v2, v1, v5, v6, v4}, Ll/֫ᩴᩳ;-><init>(Ll/ܽᩴᩳ;J[B)V

    invoke-virtual {v0, v2}, Ll/ۗ᩻᩵;->֫(Ll/۠ۜ᩵;)Ll/ۗ᩻᩵;
    :try_end_0
    .catch Ll/ۗᩴᩳ; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    .line 61
    iget-object v2, v3, Ll/֫ۘᩳ;->۫:Ll/᩶ܶᩳ;

    invoke-virtual {v2, v0}, Ll/᩶ܶᩳ;->֫(Ljava/lang/Throwable;)V

    invoke-direct/range {p0 .. p0}, Ll/ܽᩴᩳ;->ܽ()V

    goto :goto_0

    .line 59
    :catch_1
    invoke-direct/range {p0 .. p0}, Ll/ܽᩴᩳ;->ܽ()V

    :goto_0
    return-void

    .line 36
    :cond_3
    :goto_1
    invoke-direct/range {p0 .. p0}, Ll/ܽᩴᩳ;->ܽ()V

    return-void

    .line 35
    :cond_4
    :goto_2
    invoke-virtual/range {p0 .. p0}, Ll/ܽᩴᩳ;->ۧ()V

    return-void
.end method

.method public static synthetic ۧ(JLl/ܽᩴᩳ;Ljava/lang/Throwable;[B)V
    .locals 3

    .line 48
    iget-object v0, p2, Ll/ܽᩴᩳ;->ᩳ:Ll/ۨ᩵ᩳ;

    iget-object v1, p2, Ll/ܽᩴᩳ;->ۧ:Ll/᩹ܶᩳ;

    const/4 v2, 0x0

    iput-boolean v2, p2, Ll/ܽᩴᩳ;->ܳ:Z

    if-nez p3, :cond_0

    .line 49
    iput-wide p0, p2, Ll/ܽᩴᩳ;->ܿ:J

    iput-object p4, p2, Ll/ܽᩴᩳ;->֫:[B

    .line 50
    :cond_0
    iget-boolean p0, p2, Ll/ܽᩴᩳ;->ۜ:Z

    if-nez p0, :cond_4

    iget-object p0, p2, Ll/ܽᩴᩳ;->ۢ:Ll/۫ۨᩳ;

    invoke-virtual {v1, v0, p0}, Ll/᩹ܶᩳ;->֫(Ll/ۨ᩵ᩳ;Ll/۫ۨᩳ;)Z

    move-result p0

    if-eqz p0, :cond_4

    .line 51
    instance-of p0, p3, Ll/۬᩻᩵;

    if-eqz p0, :cond_1

    invoke-virtual {p3}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p3

    :cond_1
    if-eqz p3, :cond_2

    .line 52
    instance-of p0, p3, Ljava/util/concurrent/CancellationException;

    if-nez p0, :cond_2

    iget-object p0, v1, Ll/֫ۘᩳ;->۫:Ll/᩶ܶᩳ;

    invoke-virtual {p0, p3}, Ll/᩶ܶᩳ;->֫(Ljava/lang/Throwable;)V

    .line 53
    :cond_2
    iget-object p0, v0, Ll/ۨ᩵ᩳ;->ۡ:Ll/᩻ᩴᩳ;

    invoke-virtual {p0}, Ll/᩻ᩴᩳ;->ܽ()Ljava/io/IOException;

    move-result-object p0

    if-eqz p0, :cond_3

    iget-object p0, v1, Ll/֫ۘᩳ;->۫:Ll/᩶ܶᩳ;

    iget-object p1, v0, Ll/ۨ᩵ᩳ;->ۡ:Ll/᩻ᩴᩳ;

    invoke-virtual {p1}, Ll/᩻ᩴᩳ;->ܽ()Ljava/io/IOException;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/᩶ܶᩳ;->֫(Ljava/lang/Throwable;)V

    .line 54
    :cond_3
    invoke-direct {p2}, Ll/ܽᩴᩳ;->ܽ()V

    :cond_4
    return-void
.end method

.method private ܽ()V
    .locals 4

    .line 65
    iget-boolean v0, p0, Ll/ܽᩴᩳ;->ۜ:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Ll/ܽᩴᩳ;->᩷:Ll/۟ۘᩳ;

    const-wide/16 v1, 0x7d0

    iget-object v3, p0, Ll/ܽᩴᩳ;->ܽ:Landroid/os/Handler;

    invoke-virtual {v3, v0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_0
    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 4

    .line 29
    iget-object v0, p0, Ll/ܽᩴᩳ;->᩷:Ll/۟ۘᩳ;

    const-wide/16 v1, 0x7d0

    iget-object v3, p0, Ll/ܽᩴᩳ;->ܽ:Landroid/os/Handler;

    invoke-virtual {v3, v0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method public final ۧ()V
    .locals 2

    const/4 v0, 0x1

    .line 32
    iput-boolean v0, p0, Ll/ܽᩴᩳ;->ۜ:Z

    iget-object v0, p0, Ll/ܽᩴᩳ;->ܽ:Landroid/os/Handler;

    iget-object v1, p0, Ll/ܽᩴᩳ;->᩷:Ll/۟ۘᩳ;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    return-void
.end method
