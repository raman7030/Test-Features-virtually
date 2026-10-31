.class public final Ll/ۤۛۧ;
.super Ll/ᩳۨۧ;
.source "G5Y2"

# interfaces
.implements Ll/᩷ۨۧ;
.implements Ll/֡ܽ֫;


# instance fields
.field public ֫:J

.field public final synthetic ۧ:Ll/ܽۨۧ;


# direct methods
.method public constructor <init>(Ll/ܽۨۧ;)V
    .locals 2

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2729
    iput-object p1, p0, Ll/ۤۛۧ;->ۧ:Ll/ܽۨۧ;

    const-wide/16 v0, -0x1

    .line 2732
    iput-wide v0, p0, Ll/ۤۛۧ;->֫:J

    const/16 p1, 0x14

    new-array p1, p1, [J

    const-wide/high16 v0, -0x8000000000000000L

    .line 35
    invoke-static {p1, v0, v1}, Ljava/util/Arrays;->fill([JJ)V

    return-void
.end method


# virtual methods
.method public final onTransitionCancel(Ll/ܽۨۧ;)V
    .locals 0

    return-void
.end method

.method public final ֫()V
    .locals 6

    .line 2745
    iget-object v0, p0, Ll/ۤۛۧ;->ۧ:Ll/ܽۨۧ;

    invoke-virtual {v0}, Ll/ܽۨۧ;->getTotalDurationMillis()J

    move-result-wide v1

    const-wide/16 v3, 0x0

    cmp-long v5, v1, v3

    if-nez v5, :cond_0

    const-wide/16 v3, 0x1

    .line 2809
    :cond_0
    iget-wide v1, p0, Ll/ۤۛۧ;->֫:J

    invoke-virtual {v0, v3, v4, v1, v2}, Ll/ܽۨۧ;->setCurrentPlayTimeMillis(JJ)V

    .line 2810
    iput-wide v3, p0, Ll/ۤۛۧ;->֫:J

    return-void
.end method

.method public final ֫(F)V
    .locals 5

    .line 2745
    iget-object v0, p0, Ll/ۤۛۧ;->ۧ:Ll/ܽۨۧ;

    invoke-virtual {v0}, Ll/ܽۨۧ;->getTotalDurationMillis()J

    move-result-wide v1

    const-wide/16 v3, 0x1

    add-long/2addr v1, v3

    float-to-double v3, p1

    .line 2855
    invoke-static {v3, v4}, Ljava/lang/Math;->round(D)J

    move-result-wide v3

    invoke-static {v1, v2, v3, v4}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v1

    const-wide/16 v3, -0x1

    invoke-static {v3, v4, v1, v2}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v1

    .line 2856
    iget-wide v3, p0, Ll/ۤۛۧ;->֫:J

    invoke-virtual {v0, v1, v2, v3, v4}, Ll/ܽۨۧ;->setCurrentPlayTimeMillis(JJ)V

    .line 2857
    iput-wide v1, p0, Ll/ۤۛۧ;->֫:J

    return-void
.end method
