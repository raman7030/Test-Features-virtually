.class public final Ll/᩺ܿ֫;
.super Ljava/lang/Object;
.source "057Y"


# instance fields
.field public final ֫:J

.field public final ۧ:J


# direct methods
.method public constructor <init>(JJ)V
    .locals 3

    .line 3190
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x0

    cmp-long v2, p3, v0

    if-nez v2, :cond_0

    .line 3193
    iput-wide v0, p0, Ll/᩺ܿ֫;->ۧ:J

    const-wide/16 p1, 0x1

    .line 3194
    iput-wide p1, p0, Ll/᩺ܿ֫;->֫:J

    return-void

    .line 3197
    :cond_0
    iput-wide p1, p0, Ll/᩺ܿ֫;->ۧ:J

    .line 3198
    iput-wide p3, p0, Ll/᩺ܿ֫;->֫:J

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 3

    .line 3239
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-wide v1, p0, Ll/᩺ܿ֫;->ۧ:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Ll/᩺ܿ֫;->֫:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
