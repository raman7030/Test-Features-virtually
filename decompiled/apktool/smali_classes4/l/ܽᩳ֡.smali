.class public final Ll/ܽᩳ֡;
.super Ljava/lang/Object;
.source "J4DP"

# interfaces
.implements Ll/ۚᩳ֡;


# instance fields
.field public final synthetic ᩸:Ljava/io/OutputStream;

.field public final synthetic ᩹:Ll/ܶᩳ֡;


# direct methods
.method public constructor <init>(Ll/ܶᩳ֡;Ljava/io/OutputStream;)V
    .locals 0

    .line 72
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܽᩳ֡;->᩹:Ll/ܶᩳ֡;

    iput-object p2, p0, Ll/ܽᩳ֡;->᩸:Ljava/io/OutputStream;

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 1

    .line 97
    iget-object v0, p0, Ll/ܽᩳ֡;->᩸:Ljava/io/OutputStream;

    invoke-virtual {v0}, Ljava/io/OutputStream;->close()V

    return-void
.end method

.method public final flush()V
    .locals 1

    .line 93
    iget-object v0, p0, Ll/ܽᩳ֡;->᩸:Ljava/io/OutputStream;

    invoke-virtual {v0}, Ljava/io/OutputStream;->flush()V

    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 105
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "sink("

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/ܽᩳ֡;->᩸:Ljava/io/OutputStream;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/۫ܽ֡;J)V
    .locals 6

    .line 74
    iget-wide v0, p1, Ll/۫ܽ֡;->᩹:J

    const-wide/16 v2, 0x0

    move-wide v4, p2

    invoke-static/range {v0 .. v5}, Ll/᩸ᩳ֡;->֫(JJJ)V

    :cond_0
    :goto_0
    const-wide/16 v0, 0x0

    cmp-long v2, p2, v0

    if-lez v2, :cond_1

    .line 76
    iget-object v0, p0, Ll/ܽᩳ֡;->᩹:Ll/ܶᩳ֡;

    invoke-virtual {v0}, Ll/ܶᩳ֡;->ܿ()V

    .line 77
    iget-object v0, p1, Ll/۫ܽ֡;->᩸:Ll/ᩴᩳ֡;

    .line 78
    iget v1, v0, Ll/ᩴᩳ֡;->ۧ:I

    iget v2, v0, Ll/ᩴᩳ֡;->ܿ:I

    sub-int/2addr v1, v2

    int-to-long v1, v1

    invoke-static {p2, p3, v1, v2}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v1

    long-to-int v2, v1

    .line 79
    iget-object v1, v0, Ll/ᩴᩳ֡;->֫:[B

    iget v3, v0, Ll/ᩴᩳ֡;->ܿ:I

    iget-object v4, p0, Ll/ܽᩳ֡;->᩸:Ljava/io/OutputStream;

    invoke-virtual {v4, v1, v3, v2}, Ljava/io/OutputStream;->write([BII)V

    .line 81
    iget v1, v0, Ll/ᩴᩳ֡;->ܿ:I

    add-int/2addr v1, v2

    iput v1, v0, Ll/ᩴᩳ֡;->ܿ:I

    int-to-long v2, v2

    sub-long/2addr p2, v2

    .line 83
    iget-wide v4, p1, Ll/۫ܽ֡;->᩹:J

    sub-long/2addr v4, v2

    iput-wide v4, p1, Ll/۫ܽ֡;->᩹:J

    .line 85
    iget v2, v0, Ll/ᩴᩳ֡;->ۧ:I

    if-ne v1, v2, :cond_0

    .line 86
    invoke-virtual {v0}, Ll/ᩴᩳ֡;->֫()Ll/ᩴᩳ֡;

    move-result-object v1

    iput-object v1, p1, Ll/۫ܽ֡;->᩸:Ll/ᩴᩳ֡;

    .line 87
    invoke-static {v0}, Ll/᩵ᩳ֡;->֫(Ll/ᩴᩳ֡;)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final ۢ()Ll/ܶᩳ֡;
    .locals 1

    .line 101
    iget-object v0, p0, Ll/ܽᩳ֡;->᩹:Ll/ܶᩳ֡;

    return-object v0
.end method
