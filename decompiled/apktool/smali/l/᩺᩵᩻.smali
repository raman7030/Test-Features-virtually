.class public final Ll/᩺᩵᩻;
.super Ll/ܽۘ֡;
.source "R9JP"


# instance fields
.field public ۫:J


# direct methods
.method public constructor <init>(Ll/ۤ᩵᩻;)V
    .locals 2

    .line 884
    invoke-direct {p0, p1}, Ll/ܽۘ֡;-><init>(Ljava/lang/Object;)V

    .line 881
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Ll/᩺᩵᩻;->۫:J

    return-void
.end method


# virtual methods
.method public final ֫()Z
    .locals 5

    .line 900
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Ll/᩺᩵᩻;->۫:J

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x7530

    cmp-long v4, v0, v2

    if-lez v4, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ۧ()V
    .locals 6

    .line 888
    invoke-virtual {p0}, Ll/ܽۘ֡;->ۙۧ()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۤ᩵᩻;

    .line 890
    :try_start_0
    iget-object v0, v0, Ll/ۤ᩵᩻;->ᩳ:Ll/ܶܽۘ;

    const-string v1, "MT_PING$"

    invoke-virtual {v0, v1}, Ll/ܶܽۘ;->֫(Ljava/lang/String;)Ll/ۖᩳۘ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۖᩳۘ;->close()V
    :try_end_0
    .catch Ll/֨ۨۖ; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 892
    invoke-virtual {v0}, Ll/֨ۨۖ;->ۧ()J

    move-result-wide v1

    sget-object v3, Ll/۟۫ۖ;->ۗ:Ll/۟۫ۖ;

    invoke-virtual {v3}, Ll/۟۫ۖ;->getValue()J

    move-result-wide v3

    cmp-long v5, v1, v3

    if-nez v5, :cond_0

    .line 896
    :goto_0
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Ll/᩺᩵᩻;->۫:J

    return-void

    .line 893
    :cond_0
    throw v0
.end method
