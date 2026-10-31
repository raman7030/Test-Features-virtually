.class public final Ll/۟᩺᩵;
.super Ljava/lang/Object;
.source "V4E2"

# interfaces
.implements Ljava/io/Closeable;
.implements Ljava/io/Flushable;


# instance fields
.field public final ᩸:Ll/ۧ֫֡;

.field public final ᩹:Ll/ᩳ֫֡;


# direct methods
.method public constructor <init>(Ljava/io/File;)V
    .locals 4

    .line 185
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 143
    new-instance v0, Ll/۫᩺᩵;

    invoke-direct {v0, p0}, Ll/۫᩺᩵;-><init>(Ll/۟᩺᩵;)V

    iput-object v0, p0, Ll/۟᩺᩵;->᩹:Ll/ᩳ֫֡;

    const v0, 0x31191

    const/4 v1, 0x2

    const-wide/32 v2, 0xa00000

    .line 186
    invoke-static {p1, v0, v1, v2, v3}, Ll/ۧ֫֡;->֫(Ljava/io/File;IIJ)Ll/ۧ֫֡;

    move-result-object p1

    iput-object p1, p0, Ll/۟᩺᩵;->᩸:Ll/ۧ֫֡;

    return-void
.end method

.method public static ֫(Ll/ۛܽ֡;)I
    .locals 6

    const-string v0, "expected an int but was \""

    .line 726
    :try_start_0
    invoke-interface {p0}, Ll/ۛܽ֡;->᩵ۧ()J

    move-result-wide v1

    .line 727
    invoke-interface {p0}, Ll/ۛܽ֡;->֡֫()Ljava/lang/String;

    move-result-object p0

    const-wide/16 v3, 0x0

    cmp-long v5, v1, v3

    if-ltz v5, :cond_0

    const-wide/32 v3, 0x7fffffff

    cmp-long v5, v1, v3

    if-gtz v5, :cond_0

    .line 728
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_0

    long-to-int p0, v1

    return p0

    .line 729
    :cond_0
    new-instance v3, Ljava/io/IOException;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "\""

    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v3, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v3
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception p0

    .line 733
    new-instance v0, Ljava/io/IOException;

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public final close()V
    .locals 1

    .line 395
    iget-object v0, p0, Ll/۟᩺᩵;->᩸:Ll/ۧ֫֡;

    invoke-virtual {v0}, Ll/ۧ֫֡;->close()V

    return-void
.end method

.method public final flush()V
    .locals 1

    .line 391
    iget-object v0, p0, Ll/۟᩺᩵;->᩸:Ll/ۧ֫֡;

    invoke-virtual {v0}, Ll/ۧ֫֡;->flush()V

    return-void
.end method
