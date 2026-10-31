.class public final Ll/֡֫ۧ;
.super Ljava/io/IOException;
.source "U8SG"


# direct methods
.method public constructor <init>(I)V
    .locals 6

    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    move-object v0, p0

    move v3, p1

    .line 254
    invoke-direct/range {v0 .. v5}, Ll/֡֫ۧ;-><init>(JIJ)V

    return-void
.end method

.method public constructor <init>(JIJ)V
    .locals 4

    .line 258
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Illegal clipping: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    if-eqz p3, :cond_3

    const/4 v1, 0x1

    if-eq p3, v1, :cond_2

    const/4 v2, 0x2

    if-eq p3, v2, :cond_0

    const-string p1, "unknown"

    goto :goto_1

    :cond_0
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long p3, p1, v2

    if-eqz p3, :cond_1

    cmp-long p3, p4, v2

    if-eqz p3, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    .line 269
    :goto_0
    invoke-static {v1}, Ll/᩺֡֫;->ۧ(Z)V

    .line 270
    new-instance p3, Ljava/lang/StringBuilder;

    const-string v1, "start exceeds end. Start time: "

    invoke-direct {p3, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p1, ", End time: "

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p4, p5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_1

    :cond_2
    const-string p1, "not seekable to start"

    goto :goto_1

    :cond_3
    const-string p1, "invalid period count"

    .line 258
    :goto_1
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    return-void
.end method
