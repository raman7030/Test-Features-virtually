.class public final Ll/᩵ۡۧ;
.super Ll/ۨ᩷ۧ;
.source "Y8IT"


# instance fields
.field public final ۧ:J


# direct methods
.method public constructor <init>(Ll/۠᩷ۧ;J)V
    .locals 2

    .line 45
    invoke-direct {p0, p1}, Ll/ۨ᩷ۧ;-><init>(Ll/۠᩷ۧ;)V

    .line 46
    invoke-interface {p1}, Ll/۠᩷ۧ;->getPosition()J

    move-result-wide v0

    cmp-long p1, v0, p2

    if-ltz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-static {p1}, Ll/᩺֡֫;->֫(Z)V

    .line 47
    iput-wide p2, p0, Ll/᩵ۡۧ;->ۧ:J

    return-void
.end method


# virtual methods
.method public final getLength()J
    .locals 4

    .line 62
    invoke-super {p0}, Ll/ۨ᩷ۧ;->getLength()J

    move-result-wide v0

    iget-wide v2, p0, Ll/᩵ۡۧ;->ۧ:J

    sub-long/2addr v0, v2

    return-wide v0
.end method

.method public final getPosition()J
    .locals 4

    .line 52
    invoke-super {p0}, Ll/ۨ᩷ۧ;->getPosition()J

    move-result-wide v0

    iget-wide v2, p0, Ll/᩵ۡۧ;->ۧ:J

    sub-long/2addr v0, v2

    return-wide v0
.end method

.method public final ܽ()J
    .locals 4

    .line 57
    invoke-super {p0}, Ll/ۨ᩷ۧ;->ܽ()J

    move-result-wide v0

    iget-wide v2, p0, Ll/᩵ۡۧ;->ۧ:J

    sub-long/2addr v0, v2

    return-wide v0
.end method
