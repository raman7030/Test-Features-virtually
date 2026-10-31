.class public final Ll/֡ܺۧ;
.super Ll/ۚܺۧ;
.source "H8SS"


# instance fields
.field public final ֫:J

.field public final ۧ:J


# direct methods
.method public constructor <init>(JJ)V
    .locals 0

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    iput-wide p3, p0, Ll/֡ܺۧ;->ۧ:J

    .line 36
    iput-wide p1, p0, Ll/֡ܺۧ;->֫:J

    return-void
.end method

.method public static ֫(Ll/ᩳ֨֫;IJ)Ll/֡ܺۧ;
    .locals 4

    .line 42
    invoke-virtual {p0}, Ll/ᩳ֨֫;->ܶ()J

    move-result-wide v0

    add-int/lit8 p1, p1, -0x4

    .line 43
    new-array v2, p1, [B

    const/4 v3, 0x0

    .line 44
    invoke-virtual {p0, v3, p1, v2}, Ll/ᩳ֨֫;->֫(II[B)V

    .line 45
    new-instance p0, Ll/֡ܺۧ;

    invoke-direct {p0, v0, v1, p2, p3}, Ll/֡ܺۧ;-><init>(JJ)V

    return-object p0
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 4

    .line 50
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "SCTE-35 PrivateCommand { ptsAdjustment="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v1, p0, Ll/֡ܺۧ;->ۧ:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", identifier= "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Ll/֡ܺۧ;->֫:J

    const-string v3, " }"

    .line 0
    invoke-static {v0, v1, v2, v3}, Ll/ܺ۫᩷;->֫(Ljava/lang/StringBuilder;JLjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
