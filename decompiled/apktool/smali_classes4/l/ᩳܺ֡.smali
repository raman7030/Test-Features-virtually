.class public final Ll/ᩳܺ֡;
.super Ljava/io/OutputStream;
.source "S2LM"


# instance fields
.field public ۗ:J

.field public ۙ:Z

.field public final ᩶:Ll/֡ۡ֡;

.field public final ᩸:Ll/ۚۡ֡;

.field public final ᩹:I


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ll/᩵ۢ֡;Ll/۟ۢۡ;)V
    .locals 1

    .line 97
    invoke-direct {p0}, Ljava/io/OutputStream;-><init>()V

    const v0, 0x7fffffff

    .line 98
    iput v0, p0, Ll/ᩳܺ֡;->᩹:I

    .line 99
    iput-object p1, p0, Ll/ᩳܺ֡;->᩶:Ll/֡ۡ֡;

    .line 100
    iput-object p2, p0, Ll/ᩳܺ֡;->᩸:Ll/ۚۡ֡;

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 1

    .line 125
    :try_start_0
    invoke-virtual {p0}, Ll/ᩳܺ֡;->flush()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 163
    :catch_0
    iget-object v0, p0, Ll/ᩳܺ֡;->᩸:Ll/ۚۡ֡;

    invoke-interface {v0, p0}, Ll/ۚۡ֡;->֫(Ll/ᩳܺ֡;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/io/OutputStream;

    .line 130
    invoke-virtual {v0}, Ljava/io/OutputStream;->close()V

    return-void
.end method

.method public final flush()V
    .locals 1

    .line 163
    iget-object v0, p0, Ll/ᩳܺ֡;->᩸:Ll/ۚۡ֡;

    invoke-interface {v0, p0}, Ll/ۚۡ֡;->֫(Ll/ᩳܺ֡;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/io/OutputStream;

    .line 142
    invoke-virtual {v0}, Ljava/io/OutputStream;->flush()V

    return-void
.end method

.method public final write(I)V
    .locals 4

    const/4 v0, 0x1

    .line 269
    invoke-virtual {p0, v0}, Ll/ᩳܺ֡;->֫(I)V

    .line 163
    iget-object v0, p0, Ll/ᩳܺ֡;->᩸:Ll/ۚۡ֡;

    invoke-interface {v0, p0}, Ll/ۚۡ֡;->֫(Ll/ᩳܺ֡;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/io/OutputStream;

    .line 271
    invoke-virtual {v0, p1}, Ljava/io/OutputStream;->write(I)V

    .line 272
    iget-wide v0, p0, Ll/ᩳܺ֡;->ۗ:J

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    iput-wide v0, p0, Ll/ᩳܺ֡;->ۗ:J

    return-void
.end method

.method public final write([B)V
    .locals 4

    .line 235
    array-length v0, p1

    invoke-virtual {p0, v0}, Ll/ᩳܺ֡;->֫(I)V

    .line 163
    iget-object v0, p0, Ll/ᩳܺ֡;->᩸:Ll/ۚۡ֡;

    invoke-interface {v0, p0}, Ll/ۚۡ֡;->֫(Ll/ᩳܺ֡;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/io/OutputStream;

    .line 237
    invoke-virtual {v0, p1}, Ljava/io/OutputStream;->write([B)V

    .line 238
    iget-wide v0, p0, Ll/ᩳܺ֡;->ۗ:J

    array-length p1, p1

    int-to-long v2, p1

    add-long/2addr v0, v2

    iput-wide v0, p0, Ll/ᩳܺ֡;->ۗ:J

    return-void
.end method

.method public final write([BII)V
    .locals 2

    .line 254
    invoke-virtual {p0, p3}, Ll/ᩳܺ֡;->֫(I)V

    .line 163
    iget-object v0, p0, Ll/ᩳܺ֡;->᩸:Ll/ۚۡ֡;

    invoke-interface {v0, p0}, Ll/ۚۡ֡;->֫(Ll/ᩳܺ֡;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/io/OutputStream;

    .line 256
    invoke-virtual {v0, p1, p2, p3}, Ljava/io/OutputStream;->write([BII)V

    .line 257
    iget-wide p1, p0, Ll/ᩳܺ֡;->ۗ:J

    int-to-long v0, p3

    add-long/2addr p1, v0

    iput-wide p1, p0, Ll/ᩳܺ֡;->ۗ:J

    return-void
.end method

.method public final ֫(I)V
    .locals 4

    .line 111
    iget-boolean v0, p0, Ll/ᩳܺ֡;->ۙ:Z

    if-nez v0, :cond_0

    iget-wide v0, p0, Ll/ᩳܺ֡;->ۗ:J

    int-to-long v2, p1

    add-long/2addr v0, v2

    iget p1, p0, Ll/ᩳܺ֡;->᩹:I

    int-to-long v2, p1

    cmp-long p1, v0, v2

    if-lez p1, :cond_0

    const/4 p1, 0x1

    .line 112
    iput-boolean p1, p0, Ll/ᩳܺ֡;->ۙ:Z

    .line 223
    iget-object p1, p0, Ll/ᩳܺ֡;->᩶:Ll/֡ۡ֡;

    invoke-interface {p1, p0}, Ll/֡ۡ֡;->accept(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method
