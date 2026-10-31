.class public abstract Ll/᩶ۡ֡;
.super Ll/۫ۡ֡;
.source "L2QA"


# instance fields
.field public ֫:J

.field public ۧ:Ll/᩶۫᩷;

.field public ܽ:Z


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 63
    invoke-direct {p0}, Ll/۬ۢ֡;-><init>()V

    const-wide/16 v0, -0x1

    .line 102
    iput-wide v0, p0, Ll/᩶ۡ֡;->֫:J

    .line 104
    invoke-static {}, Ll/ᩴۡ֡;->֫()Ll/᩶۫᩷;

    move-result-object v0

    iput-object v0, p0, Ll/᩶ۡ֡;->ۧ:Ll/᩶۫᩷;

    const/4 v0, 0x1

    .line 107
    iput-boolean v0, p0, Ll/᩶ۡ֡;->ܽ:Z

    return-void
.end method


# virtual methods
.method public final ֫()J
    .locals 2

    .line 114
    iget-wide v0, p0, Ll/᩶ۡ֡;->֫:J

    return-wide v0
.end method

.method public ֫(J)V
    .locals 2

    const-wide/16 v0, -0x1

    .line 152
    invoke-static {v0, v1, p1, p2}, Ljava/lang/Math;->max(JJ)J

    move-result-wide p1

    iput-wide p1, p0, Ll/᩶ۡ֡;->֫:J

    return-void
.end method

.method public final ۧ()Ll/᩶۫᩷;
    .locals 1

    .line 118
    iget-object v0, p0, Ll/᩶ۡ֡;->ۧ:Ll/᩶۫᩷;

    return-object v0
.end method

.method public final ܽ()Z
    .locals 1

    .line 122
    iget-boolean v0, p0, Ll/᩶ۡ֡;->ܽ:Z

    return v0
.end method
