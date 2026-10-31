.class public Lcom/amazonaws/util/NamespaceRemovingInputStream;
.super Lcom/amazonaws/internal/SdkFilterInputStream;
.source "NamespaceRemovingInputStream.java"


# instance fields
.field public ᩸:Z

.field public final ᩹:[B


# direct methods
.method public constructor <init>(Ljava/io/ByteArrayInputStream;)V
    .locals 1

    .line 48
    new-instance v0, Ljava/io/BufferedInputStream;

    invoke-direct {v0, p1}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V

    .line 29
    invoke-direct {p0, v0}, Ljava/io/FilterInputStream;-><init>(Ljava/io/InputStream;)V

    const/16 p1, 0xc8

    new-array p1, p1, [B

    .line 33
    iput-object p1, p0, Lcom/amazonaws/util/NamespaceRemovingInputStream;->᩹:[B

    const/4 p1, 0x0

    .line 36
    iput-boolean p1, p0, Lcom/amazonaws/util/NamespaceRemovingInputStream;->᩸:Z

    return-void
.end method


# virtual methods
.method public final read()I
    .locals 7

    .line 57
    invoke-virtual {p0}, Lcom/amazonaws/internal/SdkFilterInputStream;->ᩳ()V

    .line 58
    iget-object v0, p0, Ljava/io/FilterInputStream;->in:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->read()I

    move-result v0

    const/16 v1, 0x78

    if-ne v0, v1, :cond_5

    .line 59
    iget-boolean v1, p0, Lcom/amazonaws/util/NamespaceRemovingInputStream;->᩸:Z

    if-nez v1, :cond_5

    .line 60
    iget-object v1, p0, Lcom/amazonaws/util/NamespaceRemovingInputStream;->᩹:[B

    int-to-byte v2, v0

    const/4 v3, 0x0

    aput-byte v2, v1, v3

    .line 61
    iget-object v1, p0, Ljava/io/FilterInputStream;->in:Ljava/io/InputStream;

    iget-object v2, p0, Lcom/amazonaws/util/NamespaceRemovingInputStream;->᩹:[B

    array-length v2, v2

    invoke-virtual {v1, v2}, Ljava/io/InputStream;->mark(I)V

    .line 62
    iget-object v1, p0, Ljava/io/FilterInputStream;->in:Ljava/io/InputStream;

    iget-object v2, p0, Lcom/amazonaws/util/NamespaceRemovingInputStream;->᩹:[B

    array-length v4, v2

    const/4 v5, 0x1

    sub-int/2addr v4, v5

    invoke-virtual {v1, v2, v5, v4}, Ljava/io/InputStream;->read([BII)I

    move-result v1

    .line 63
    iget-object v2, p0, Ljava/io/FilterInputStream;->in:Ljava/io/InputStream;

    invoke-virtual {v2}, Ljava/io/InputStream;->reset()V

    .line 65
    new-instance v2, Ljava/lang/String;

    iget-object v4, p0, Lcom/amazonaws/util/NamespaceRemovingInputStream;->᩹:[B

    add-int/2addr v1, v5

    sget-object v6, Lcom/amazonaws/util/StringUtils;->֫:Ljava/nio/charset/Charset;

    invoke-direct {v2, v4, v3, v1, v6}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 121
    new-instance v1, Lcom/amazonaws/util/NamespaceRemovingInputStream$StringPrefixSlicer;

    invoke-direct {v1, v2}, Lcom/amazonaws/util/NamespaceRemovingInputStream$StringPrefixSlicer;-><init>(Ljava/lang/String;)V

    const-string v4, "xmlns"

    .line 122
    invoke-virtual {v1, v4}, Lcom/amazonaws/util/NamespaceRemovingInputStream$StringPrefixSlicer;->֫(Ljava/lang/String;)Z

    move-result v4

    const/4 v6, -0x1

    if-nez v4, :cond_0

    goto :goto_0

    .line 125
    :cond_0
    invoke-virtual {v1}, Lcom/amazonaws/util/NamespaceRemovingInputStream$StringPrefixSlicer;->ܽ()V

    const-string v4, "="

    .line 126
    invoke-virtual {v1, v4}, Lcom/amazonaws/util/NamespaceRemovingInputStream$StringPrefixSlicer;->֫(Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_1

    goto :goto_0

    .line 128
    :cond_1
    invoke-virtual {v1}, Lcom/amazonaws/util/NamespaceRemovingInputStream$StringPrefixSlicer;->ܽ()V

    const-string v4, "\""

    .line 130
    invoke-virtual {v1, v4}, Lcom/amazonaws/util/NamespaceRemovingInputStream$StringPrefixSlicer;->֫(Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_2

    goto :goto_0

    .line 132
    :cond_2
    invoke-virtual {v1}, Lcom/amazonaws/util/NamespaceRemovingInputStream$StringPrefixSlicer;->ۧ()Z

    move-result v4

    if-nez v4, :cond_3

    goto :goto_0

    .line 135
    :cond_3
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    invoke-virtual {v1}, Lcom/amazonaws/util/NamespaceRemovingInputStream$StringPrefixSlicer;->֫()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    sub-int v6, v2, v1

    :goto_0
    if-lez v6, :cond_5

    :goto_1
    add-int/lit8 v0, v6, -0x1

    if-ge v3, v0, :cond_4

    .line 70
    iget-object v0, p0, Ljava/io/FilterInputStream;->in:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->read()I

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 72
    :cond_4
    iget-object v0, p0, Ljava/io/FilterInputStream;->in:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->read()I

    move-result v0

    .line 73
    iput-boolean v5, p0, Lcom/amazonaws/util/NamespaceRemovingInputStream;->᩸:Z

    :cond_5
    return v0
.end method

.method public final read([B)I
    .locals 2

    const/4 v0, 0x0

    .line 106
    array-length v1, p1

    invoke-virtual {p0, p1, v0, v1}, Lcom/amazonaws/util/NamespaceRemovingInputStream;->read([BII)I

    move-result p1

    return p1
.end method

.method public final read([BII)I
    .locals 3

    const/4 v0, 0x0

    :goto_0
    if-ge v0, p3, :cond_2

    .line 87
    invoke-virtual {p0}, Lcom/amazonaws/util/NamespaceRemovingInputStream;->read()I

    move-result v1

    const/4 v2, -0x1

    if-ne v1, v2, :cond_1

    if-nez v0, :cond_0

    return v2

    :cond_0
    return v0

    :cond_1
    add-int v2, v0, p2

    int-to-byte v1, v1

    .line 94
    aput-byte v1, p1, v2

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    return p3
.end method
