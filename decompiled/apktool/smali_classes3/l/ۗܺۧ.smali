.class public final Ll/ۗܺۧ;
.super Ll/ۚܺۧ;
.source "G8TP"


# instance fields
.field public final ֫:J

.field public final ۧ:J


# direct methods
.method public constructor <init>(JJ)V
    .locals 0

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    iput-wide p1, p0, Ll/ۗܺۧ;->ۧ:J

    .line 35
    iput-wide p3, p0, Ll/ۗܺۧ;->֫:J

    return-void
.end method

.method public static ֫(JLl/ᩳ֨֫;)J
    .locals 7

    .line 55
    invoke-virtual {p2}, Ll/ᩳ֨֫;->֨()I

    move-result v0

    int-to-long v0, v0

    const-wide/16 v2, 0x80

    and-long/2addr v2, v0

    const-wide/16 v4, 0x0

    cmp-long v6, v2, v4

    if-eqz v6, :cond_0

    const-wide/16 v2, 0x1

    and-long/2addr v0, v2

    const/16 v2, 0x20

    shl-long/2addr v0, v2

    .line 59
    invoke-virtual {p2}, Ll/ᩳ֨֫;->ܶ()J

    move-result-wide v2

    or-long/2addr v0, v2

    add-long/2addr v0, p0

    const-wide p0, 0x1ffffffffL

    and-long/2addr p0, v0

    return-wide p0

    :cond_0
    const-wide p0, -0x7fffffffffffffffL    # -4.9E-324

    return-wide p0
.end method

.method public static ֫(Ll/ᩳ֨֫;JLl/ۢ֨֫;)Ll/ۗܺۧ;
    .locals 1

    .line 40
    invoke-static {p1, p2, p0}, Ll/ۗܺۧ;->֫(JLl/ᩳ֨֫;)J

    move-result-wide p0

    .line 41
    invoke-virtual {p3, p0, p1}, Ll/ۢ֨֫;->ۧ(J)J

    move-result-wide p2

    .line 42
    new-instance v0, Ll/ۗܺۧ;

    invoke-direct {v0, p0, p1, p2, p3}, Ll/ۗܺۧ;-><init>(JJ)V

    return-object v0
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 4

    .line 68
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "SCTE-35 TimeSignalCommand { ptsTime="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v1, p0, Ll/ۗܺۧ;->ۧ:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", playbackPositionUs= "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Ll/ۗܺۧ;->֫:J

    const-string v3, " }"

    .line 0
    invoke-static {v0, v1, v2, v3}, Ll/ܺ۫᩷;->֫(Ljava/lang/StringBuilder;JLjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
