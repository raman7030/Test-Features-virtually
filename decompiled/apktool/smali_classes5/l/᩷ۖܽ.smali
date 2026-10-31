.class public final Ll/᩷ۖܽ;
.super Ljava/lang/Object;
.source "6AJ2"

# interfaces
.implements Ll/ۖۖܽ;


# instance fields
.field public final ۙ:Ll/ۖۖܽ;

.field public ᩶:J

.field public final ᩸:J

.field public final ᩹:J


# direct methods
.method public constructor <init>(Ll/ۖۖܽ;JJ)V
    .locals 4

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    iput-object p1, p0, Ll/᩷ۖܽ;->ۙ:Ll/ۖۖܽ;

    .line 13
    iput-wide p2, p0, Ll/᩷ۖܽ;->᩹:J

    .line 14
    iput-wide p4, p0, Ll/᩷ۖܽ;->᩸:J

    .line 15
    invoke-interface {p1}, Ll/ۖۖܽ;->length()J

    move-result-wide v0

    add-long v2, p2, p4

    cmp-long p1, v2, v0

    if-gtz p1, :cond_0

    const-wide/16 p1, 0x0

    .line 19
    invoke-virtual {p0, p1, p2}, Ll/᩷ۖܽ;->seek(J)V

    return-void

    .line 17
    :cond_0
    new-instance p1, Ljava/io/IOException;

    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    invoke-static {p4, p5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p3

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p4

    const/4 p5, 0x3

    new-array p5, p5, [Ljava/lang/Object;

    const/4 v0, 0x0

    aput-object p2, p5, v0

    const/4 p2, 0x1

    aput-object p3, p5, p2

    const/4 p2, 0x2

    aput-object p4, p5, p2

    const-string p2, "fragment.offset=%d, fragment.length=%d, data.length=%d"

    invoke-static {p2, p5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final close()V
    .locals 1

    .line 91
    iget-object v0, p0, Ll/᩷ۖܽ;->ۙ:Ll/ۖۖܽ;

    invoke-interface {v0}, Ljava/io/Closeable;->close()V

    return-void
.end method

.method public final getName()Ljava/lang/String;
    .locals 4

    .line 71
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Ll/᩷ۖܽ;->ۙ:Ll/ۖۖܽ;

    invoke-interface {v1}, Ll/ۖۖܽ;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "-Fragment("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Ll/᩷ۖܽ;->᩹:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ","

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Ll/᩷ۖܽ;->᩸:J

    const-string v3, ")"

    .line 0
    invoke-static {v0, v1, v2, v3}, Ll/ܺ۫᩷;->֫(Ljava/lang/StringBuilder;JLjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final isClosed()Z
    .locals 1

    .line 86
    iget-object v0, p0, Ll/᩷ۖܽ;->ۙ:Ll/ۖۖܽ;

    invoke-interface {v0}, Ll/ۖۖܽ;->isClosed()Z

    move-result v0

    return v0
.end method

.method public final length()J
    .locals 2

    .line 51
    iget-wide v0, p0, Ll/᩷ۖܽ;->᩸:J

    return-wide v0
.end method

.method public final position()J
    .locals 2

    .line 61
    iget-wide v0, p0, Ll/᩷ۖܽ;->᩶:J

    return-wide v0
.end method

.method public final read([BII)I
    .locals 5

    .line 30
    iget-wide v0, p0, Ll/᩷ۖܽ;->᩸:J

    iget-wide v2, p0, Ll/᩷ۖܽ;->᩶:J

    sub-long/2addr v0, v2

    int-to-long v2, p3

    cmp-long v4, v2, v0

    if-lez v4, :cond_1

    const-wide/16 v2, 0x0

    cmp-long p3, v0, v2

    if-gtz p3, :cond_0

    const/4 p1, -0x1

    return p1

    :cond_0
    long-to-int p3, v0

    .line 37
    :cond_1
    iget-object v0, p0, Ll/᩷ۖܽ;->ۙ:Ll/ۖۖܽ;

    invoke-interface {v0, p1, p2, p3}, Ll/ۖۖܽ;->read([BII)I

    move-result p1

    if-lez p1, :cond_2

    .line 39
    iget-wide p2, p0, Ll/᩷ۖܽ;->᩶:J

    int-to-long v0, p1

    add-long/2addr p2, v0

    iput-wide p2, p0, Ll/᩷ۖܽ;->᩶:J

    :cond_2
    return p1
.end method

.method public final seek(J)V
    .locals 3

    .line 24
    iget-wide v0, p0, Ll/᩷ۖܽ;->᩹:J

    add-long/2addr p1, v0

    iget-object v2, p0, Ll/᩷ۖܽ;->ۙ:Ll/ۖۖܽ;

    invoke-interface {v2, p1, p2}, Ll/ۖۖܽ;->seek(J)V

    .line 25
    invoke-interface {v2}, Ll/ۖۖܽ;->position()J

    move-result-wide p1

    sub-long/2addr p1, v0

    iput-wide p1, p0, Ll/᩷ۖܽ;->᩶:J

    return-void
.end method

.method public final setLength(J)V
    .locals 0

    .line 56
    new-instance p1, Ljava/io/IOException;

    const-string p2, "FragmentRandomAccessData is readonly"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final write([BII)V
    .locals 0

    .line 46
    new-instance p1, Ljava/io/IOException;

    const-string p2, "FragmentRandomAccessData is readonly"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final synthetic ֫ܽ()Ljava/nio/channels/FileChannel;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final ۡ()Ll/ۖۖܽ;
    .locals 7

    .line 81
    new-instance v6, Ll/᩷ۖܽ;

    iget-object v0, p0, Ll/᩷ۖܽ;->ۙ:Ll/ۖۖܽ;

    invoke-interface {v0}, Ll/ۖۖܽ;->ۡ()Ll/ۖۖܽ;

    move-result-object v1

    iget-wide v2, p0, Ll/᩷ۖܽ;->᩹:J

    iget-wide v4, p0, Ll/᩷ۖܽ;->᩸:J

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Ll/᩷ۖܽ;-><init>(Ll/ۖۖܽ;JJ)V

    return-object v6
.end method

.method public final ۧ(JJ)Ll/ۖۖܽ;
    .locals 7

    .line 47
    new-instance v6, Ll/᩷ۖܽ;

    invoke-virtual {p0}, Ll/᩷ۖܽ;->ۡ()Ll/ۖۖܽ;

    move-result-object v1

    move-object v0, v6

    move-wide v2, p1

    move-wide v4, p3

    invoke-direct/range {v0 .. v5}, Ll/᩷ۖܽ;-><init>(Ll/ۖۖܽ;JJ)V

    return-object v6
.end method

.method public final ܺ()V
    .locals 1

    .line 66
    iget-object v0, p0, Ll/᩷ۖܽ;->ۙ:Ll/ۖۖܽ;

    invoke-interface {v0}, Ll/ۖۖܽ;->ܺ()V

    return-void
.end method

.method public final ܽ(JJ)Ll/ۖۖܽ;
    .locals 7

    .line 51
    new-instance v6, Ll/᩷ۖܽ;

    move-object v0, v6

    move-object v1, p0

    move-wide v2, p1

    move-wide v4, p3

    invoke-direct/range {v0 .. v5}, Ll/᩷ۖܽ;-><init>(Ll/ۖۖܽ;JJ)V

    return-object v6
.end method

.method public final synthetic ᩻ܽ()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
