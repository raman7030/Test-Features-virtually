.class public final Ll/ۙ᩸ۘ;
.super Ljava/lang/Object;
.source "51RR"


# instance fields
.field public ֫:Ljava/util/Properties;

.field public ۧ:[B


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    .line 87
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "ApkExternalInfo [p="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/ۙ᩸ۘ;->֫:Ljava/util/Properties;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", otherData="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ۙ᩸ۘ;->ۧ:[B

    invoke-static {v1}, Ljava/util/Arrays;->toString([B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫([B)V
    .locals 6

    if-nez p1, :cond_0

    goto :goto_0

    .line 27
    :cond_0
    invoke-static {p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v0

    const/4 v1, 0x2

    new-array v2, v1, [B

    .line 30
    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    .line 32
    invoke-static {}, Ll/ۗ᩸ۘ;->֫()Ll/ܳ᩹ۘ;

    move-result-object v3

    new-instance v4, Ll/ܳ᩹ۘ;

    invoke-direct {v4, v2}, Ll/ܳ᩹ۘ;-><init>([B)V

    invoke-virtual {v3, v4}, Ll/ܳ᩹ۘ;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    .line 36
    array-length v2, p1

    sub-int/2addr v2, v1

    if-gt v2, v1, :cond_1

    goto :goto_0

    :cond_1
    new-array v2, v1, [B

    .line 42
    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    .line 43
    new-instance v3, Ll/ܳ᩹ۘ;

    invoke-direct {v3, v2}, Ll/ܳ᩹ۘ;-><init>([B)V

    invoke-virtual {v3}, Ll/ܳ᩹ۘ;->֫()I

    move-result v2

    .line 45
    array-length v3, p1

    add-int/lit8 v3, v3, -0x4

    if-ge v3, v2, :cond_2

    goto :goto_0

    .line 50
    :cond_2
    new-array v3, v2, [B

    .line 51
    invoke-virtual {v0, v3}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    .line 52
    iget-object v4, p0, Ll/ۙ᩸ۘ;->֫:Ljava/util/Properties;

    new-instance v5, Ljava/io/ByteArrayInputStream;

    invoke-direct {v5, v3}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    invoke-virtual {v4, v5}, Ljava/util/Properties;->load(Ljava/io/InputStream;)V

    .line 54
    array-length p1, p1

    sub-int/2addr p1, v1

    sub-int/2addr p1, v2

    sub-int/2addr p1, v1

    if-lez p1, :cond_3

    .line 57
    new-array p1, p1, [B

    iput-object p1, p0, Ll/ۙ᩸ۘ;->ۧ:[B

    .line 58
    invoke-virtual {v0, p1}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    :cond_3
    :goto_0
    return-void

    .line 34
    :cond_4
    new-instance v0, Ljava/net/ProtocolException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "unknow protocl ["

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Ljava/util/Arrays;->toString([B)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "]"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
