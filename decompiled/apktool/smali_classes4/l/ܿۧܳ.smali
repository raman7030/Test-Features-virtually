.class public final Ll/ܿۧܳ;
.super Ljava/lang/Object;
.source "D70T"


# instance fields
.field public ֫:J


# virtual methods
.method public final ֫(J)V
    .locals 3

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-ltz v2, :cond_1

    .line 3231
    iget-wide v0, p0, Ll/ܿۧܳ;->֫:J

    invoke-static {v0, v1, p1, p2}, Ll/ᩳܽܳ;->֫(JJ)J

    move-result-wide p1

    const-wide/32 v0, 0x4000000

    cmp-long v2, p1, v0

    if-gtz v2, :cond_0

    .line 3235
    iput-wide p1, p0, Ll/ܿۧܳ;->֫:J

    return-void

    :cond_0
    const-string p1, "Checkpoint metadata exceeds memory limit"

    .line 3233
    invoke-static {p1}, Ll/ᩳܽܳ;->֫(Ljava/lang/String;)Ljava/io/IOException;

    move-result-object p1

    throw p1

    :cond_1
    const-string p1, "Negative checkpoint allocation"

    .line 3229
    invoke-static {p1}, Ll/ᩳܽܳ;->֫(Ljava/lang/String;)Ljava/io/IOException;

    move-result-object p1

    throw p1
.end method
