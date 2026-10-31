.class public final Ll/۬᩵ܳ;
.super Ljava/io/FilterInputStream;
.source "473S"

# interfaces
.implements Ll/ܶ֨ᩴ;


# instance fields
.field public final ᩶:J

.field public final ᩸:Ll/֨ۚܳ;

.field public ᩹:J


# direct methods
.method public constructor <init>(Ljava/io/InputStream;JLl/֨ۚܳ;)V
    .locals 2

    .line 1016
    invoke-direct {p0, p1}, Ljava/io/FilterInputStream;-><init>(Ljava/io/InputStream;)V

    const-wide/16 v0, 0x1

    .line 1017
    invoke-static {v0, v1, p2, p3}, Ljava/lang/Math;->max(JJ)J

    move-result-wide p1

    iput-wide p1, p0, Ll/۬᩵ܳ;->᩶:J

    .line 1018
    iput-object p4, p0, Ll/۬᩵ܳ;->᩸:Ll/֨ۚܳ;

    return-void
.end method

.method private ֫(I)V
    .locals 5

    .line 1059
    iget-object v0, p0, Ll/۬᩵ܳ;->᩸:Ll/֨ۚܳ;

    invoke-virtual {v0}, Ll/֨ۚܳ;->۫֫()Z

    move-result v1

    if-nez v1, :cond_0

    .line 1062
    iget-wide v1, p0, Ll/۬᩵ܳ;->᩹:J

    int-to-long v3, p1

    add-long/2addr v1, v3

    iput-wide v1, p0, Ll/۬᩵ܳ;->᩹:J

    .line 1063
    iget-wide v3, p0, Ll/۬᩵ܳ;->᩶:J

    invoke-static {v1, v2, v3, v4}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v1

    .line 188
    invoke-virtual {v0, v1, v2, v3, v4}, Ll/ۘ۠ۢ;->ۧ(JJ)V

    return-void

    .line 1060
    :cond_0
    new-instance p1, Ll/ܽ֡ܳ;

    .line 1093
    invoke-direct {p1}, Ljava/io/IOException;-><init>()V

    .line 1060
    throw p1
.end method


# virtual methods
.method public final close()V
    .locals 2

    .line 1052
    :try_start_0
    invoke-super {p0}, Ljava/io/FilterInputStream;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    .line 1054
    new-instance v1, Ll/۟᩵ܳ;

    .line 1080
    invoke-direct {v1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    .line 1054
    throw v1
.end method

.method public final read()I
    .locals 2

    .line 1025
    :try_start_0
    invoke-super {p0}, Ljava/io/FilterInputStream;->read()I

    move-result v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    const/4 v1, 0x1

    .line 1030
    invoke-direct {p0, v1}, Ll/۬᩵ܳ;->֫(I)V

    :cond_0
    return v0

    :catch_0
    move-exception v0

    .line 1027
    new-instance v1, Ll/۟᩵ܳ;

    .line 1080
    invoke-direct {v1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    .line 1027
    throw v1
.end method

.method public final read([BII)I
    .locals 0

    .line 1039
    :try_start_0
    invoke-super {p0, p1, p2, p3}, Ljava/io/FilterInputStream;->read([BII)I

    move-result p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    if-lez p1, :cond_0

    .line 1044
    invoke-direct {p0, p1}, Ll/۬᩵ܳ;->֫(I)V

    :cond_0
    return p1

    :catch_0
    move-exception p1

    .line 1041
    new-instance p2, Ll/۟᩵ܳ;

    .line 1080
    invoke-direct {p2, p1}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    .line 1041
    throw p2
.end method

.method public synthetic transferTo(Ljava/io/OutputStream;)J
    .locals 2

    .line 0
    invoke-static {p0, p1}, Ll/֨֨ᩴ;->transferTo(Ljava/io/InputStream;Ljava/io/OutputStream;)J

    move-result-wide v0

    return-wide v0
.end method
