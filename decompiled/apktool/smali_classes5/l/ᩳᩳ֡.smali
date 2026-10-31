.class public final Ll/ᩳᩳ֡;
.super Ljava/lang/Object;
.source "J4DP"

# interfaces
.implements Ll/֨ᩳ֡;


# instance fields
.field public final synthetic ᩸:Ljava/io/InputStream;

.field public final synthetic ᩹:Ll/ܶᩳ֡;


# direct methods
.method public constructor <init>(Ll/ܶᩳ֡;Ljava/io/InputStream;)V
    .locals 0

    .line 132
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ᩳᩳ֡;->᩹:Ll/ܶᩳ֡;

    iput-object p2, p0, Ll/ᩳᩳ֡;->᩸:Ljava/io/InputStream;

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 1

    .line 152
    iget-object v0, p0, Ll/ᩳᩳ֡;->᩸:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 160
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "source("

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/ᩳᩳ֡;->᩸:Ljava/io/InputStream;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۢ()Ll/ܶᩳ֡;
    .locals 1

    .line 156
    iget-object v0, p0, Ll/ᩳᩳ֡;->᩹:Ll/ܶᩳ֡;

    return-object v0
.end method

.method public final ۧ(Ll/۫ܽ֡;J)J
    .locals 3

    const-wide/16 v0, 0x0

    cmp-long v2, p2, v0

    if-ltz v2, :cond_3

    if-nez v2, :cond_0

    return-wide v0

    .line 137
    :cond_0
    :try_start_0
    iget-object v0, p0, Ll/ᩳᩳ֡;->᩹:Ll/ܶᩳ֡;

    invoke-virtual {v0}, Ll/ܶᩳ֡;->ܿ()V

    const/4 v0, 0x1

    .line 138
    invoke-virtual {p1, v0}, Ll/۫ܽ֡;->֫(I)Ll/ᩴᩳ֡;

    move-result-object v0

    .line 139
    iget v1, v0, Ll/ᩴᩳ֡;->ۧ:I

    rsub-int v1, v1, 0x2000

    int-to-long v1, v1

    invoke-static {p2, p3, v1, v2}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p2

    long-to-int p3, p2

    .line 140
    iget-object p2, p0, Ll/ᩳᩳ֡;->᩸:Ljava/io/InputStream;

    iget-object v1, v0, Ll/ᩴᩳ֡;->֫:[B

    iget v2, v0, Ll/ᩴᩳ֡;->ۧ:I

    invoke-virtual {p2, v1, v2, p3}, Ljava/io/InputStream;->read([BII)I

    move-result p2

    const/4 p3, -0x1

    if-ne p2, p3, :cond_1

    const-wide/16 p1, -0x1

    return-wide p1

    .line 142
    :cond_1
    iget p3, v0, Ll/ᩴᩳ֡;->ۧ:I

    add-int/2addr p3, p2

    iput p3, v0, Ll/ᩴᩳ֡;->ۧ:I

    .line 143
    iget-wide v0, p1, Ll/۫ܽ֡;->᩹:J

    int-to-long p2, p2

    add-long/2addr v0, p2

    iput-wide v0, p1, Ll/۫ܽ֡;->᩹:J
    :try_end_0
    .catch Ljava/lang/AssertionError; {:try_start_0 .. :try_end_0} :catch_0

    return-wide p2

    :catch_0
    move-exception p1

    .line 262
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p2

    if-eqz p2, :cond_2

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_2

    .line 263
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p2

    const-string p3, "getsockname failed"

    invoke-virtual {p2, p3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p2

    if-eqz p2, :cond_2

    .line 146
    new-instance p2, Ljava/io/IOException;

    invoke-direct {p2, p1}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    throw p2

    .line 147
    :cond_2
    throw p1

    .line 134
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "byteCount < 0: "

    .line 0
    invoke-static {p2, p3, v0}, Ll/ܺܶۡ;->֫(JLjava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 134
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
