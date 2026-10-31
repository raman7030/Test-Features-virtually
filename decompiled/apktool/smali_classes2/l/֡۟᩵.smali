.class public abstract Ll/֡۟᩵;
.super Ljava/lang/Object;
.source "F4CH"

# interfaces
.implements Ljava/io/Closeable;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 103
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ֫(Ll/ܰܰ᩵;JLl/۫ܽ֡;)Ll/֡۟᩵;
    .locals 1

    .line 224
    new-instance v0, Ll/᩵۟᩵;

    invoke-direct {v0, p0, p1, p2, p3}, Ll/᩵۟᩵;-><init>(Ll/ܰܰ᩵;JLl/۫ܽ֡;)V

    return-object v0
.end method

.method public static ۖ()Ll/֡۟᩵;
    .locals 5

    .line 196
    sget-object v0, Ll/᩶۟᩵;->ᩴ:Ljava/nio/charset/Charset;

    .line 204
    new-instance v1, Ll/۫ܽ֡;

    invoke-direct {v1}, Ll/۫ܽ֡;-><init>()V

    const/4 v2, 0x0

    const-string v3, ""

    .line 1069
    invoke-virtual {v1, v3, v2, v2, v0}, Ll/۫ܽ֡;->֫(Ljava/lang/String;IILjava/nio/charset/Charset;)V

    .line 205
    invoke-virtual {v1}, Ll/۫ܽ֡;->size()J

    move-result-wide v2

    .line 224
    new-instance v0, Ll/᩵۟᩵;

    const/4 v4, 0x0

    invoke-direct {v0, v4, v2, v3, v1}, Ll/᩵۟᩵;-><init>(Ll/ܰܰ᩵;JLl/۫ܽ֡;)V

    return-object v0
.end method


# virtual methods
.method public final close()V
    .locals 1

    .line 188
    invoke-virtual {p0}, Ll/֡۟᩵;->᩻()Ll/ۛܽ֡;

    move-result-object v0

    invoke-static {v0}, Ll/᩶۟᩵;->֫(Ljava/io/Closeable;)V

    return-void
.end method

.method public final ֫()Ljava/io/InputStream;
    .locals 1

    .line 116
    invoke-virtual {p0}, Ll/֡۟᩵;->᩻()Ll/ۛܽ֡;

    move-result-object v0

    invoke-interface {v0}, Ll/ۛܽ֡;->ۡܽ()Ljava/io/InputStream;

    move-result-object v0

    return-object v0
.end method

.method public final ۜ()Ljava/lang/String;
    .locals 3

    .line 173
    invoke-virtual {p0}, Ll/֡۟᩵;->᩻()Ll/ۛܽ֡;

    move-result-object v0

    .line 183
    :try_start_0
    invoke-virtual {p0}, Ll/֡۟᩵;->ܳ()Ll/ܰܰ᩵;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 184
    sget-object v2, Ll/᩶۟᩵;->ᩴ:Ljava/nio/charset/Charset;

    invoke-virtual {v1, v2}, Ll/ܰܰ᩵;->֫(Ljava/nio/charset/Charset;)Ljava/nio/charset/Charset;

    move-result-object v1

    goto :goto_0

    :cond_0
    sget-object v1, Ll/᩶۟᩵;->ᩴ:Ljava/nio/charset/Charset;

    .line 175
    :goto_0
    invoke-static {v0, v1}, Ll/᩶۟᩵;->֫(Ll/ۛܽ֡;Ljava/nio/charset/Charset;)Ljava/nio/charset/Charset;

    move-result-object v1

    .line 176
    invoke-interface {v0, v1}, Ll/ۛܽ֡;->֫(Ljava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 178
    invoke-static {v0}, Ll/᩶۟᩵;->֫(Ljava/io/Closeable;)V

    return-object v1

    :catchall_0
    move-exception v1

    invoke-static {v0}, Ll/᩶۟᩵;->֫(Ljava/io/Closeable;)V

    throw v1
.end method

.method public abstract ܳ()Ll/ܰܰ᩵;
.end method

.method public final ܽ()[B
    .locals 6

    .line 129
    invoke-virtual {p0}, Ll/֡۟᩵;->ᩳ()J

    move-result-wide v0

    const-wide/32 v2, 0x7fffffff

    cmp-long v4, v0, v2

    if-gtz v4, :cond_2

    .line 134
    invoke-virtual {p0}, Ll/֡۟᩵;->᩻()Ll/ۛܽ֡;

    move-result-object v2

    .line 137
    :try_start_0
    invoke-interface {v2}, Ll/ۛܽ֡;->ۜۧ()[B

    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 139
    invoke-static {v2}, Ll/᩶۟᩵;->֫(Ljava/io/Closeable;)V

    const-wide/16 v4, -0x1

    cmp-long v2, v0, v4

    if-eqz v2, :cond_1

    .line 141
    array-length v2, v3

    int-to-long v4, v2

    cmp-long v2, v0, v4

    if-nez v2, :cond_0

    goto :goto_0

    .line 142
    :cond_0
    new-instance v2, Ljava/io/IOException;

    const-string v4, "Content-Length ("

    const-string v5, ") and stream length ("

    .line 0
    invoke-static {v4, v5, v0, v1}, Ll/۬֫ۢ;->֫(Ljava/lang/String;Ljava/lang/String;J)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 142
    array-length v1, v3

    const-string v3, ") disagree"

    .line 0
    invoke-static {v1, v3, v0}, Ll/ۗۧᩳ;->֫(ILjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    .line 142
    invoke-direct {v2, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_1
    :goto_0
    return-object v3

    :catchall_0
    move-exception v0

    .line 139
    invoke-static {v2}, Ll/᩶۟᩵;->֫(Ljava/io/Closeable;)V

    throw v0

    .line 131
    :cond_2
    new-instance v2, Ljava/io/IOException;

    const-string v3, "Cannot buffer entire body for content length: "

    .line 0
    invoke-static {v0, v1, v3}, Ll/ܺܶۡ;->֫(JLjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 131
    invoke-direct {v2, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v2
.end method

.method public abstract ᩳ()J
.end method

.method public abstract ᩻()Ll/ۛܽ֡;
.end method
