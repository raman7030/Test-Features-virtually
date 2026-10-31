.class public final Ll/۫᩷֡;
.super Ll/֫ۢ֡;
.source "Z8F1"


# instance fields
.field public ۗ:I

.field public final ۙ:Ljava/nio/channels/SeekableByteChannel;

.field public final synthetic ۛ:Ll/ۤ᩷֡;

.field public final ۤ:Ljava/util/List;

.field public ۫:J

.field public final ۬:Ll/֨᩷֡;


# direct methods
.method public constructor <init>(Ll/ۤ᩷֡;Ll/֨᩷֡;Ll/᩻ۖܽ;Ljava/util/List;)V
    .locals 4

    .line 68
    iput-object p1, p0, Ll/۫᩷֡;->ۛ:Ll/ۤ᩷֡;

    .line 69
    invoke-virtual {p2}, Ll/֨᩷֡;->ۧ()J

    move-result-wide v0

    invoke-virtual {p2}, Ll/֨᩷֡;->᩵()J

    move-result-wide v2

    invoke-direct {p0, v0, v1, v2, v3}, Ll/֫ۢ֡;-><init>(JJ)V

    .line 173
    invoke-virtual {p3}, Ll/᩻ۖܽ;->length()J

    move-result-wide v0

    .line 70
    invoke-virtual {p2}, Ll/֨᩷֡;->֡()J

    move-result-wide v2

    sub-long/2addr v0, v2

    invoke-virtual {p2}, Ll/֨᩷֡;->ۧ()J

    move-result-wide v2

    cmp-long p1, v0, v2

    if-ltz p1, :cond_0

    .line 73
    iput-object p2, p0, Ll/۫᩷֡;->۬:Ll/֨᩷֡;

    .line 74
    iput-object p3, p0, Ll/۫᩷֡;->ۙ:Ljava/nio/channels/SeekableByteChannel;

    .line 75
    iput-object p4, p0, Ll/۫᩷֡;->ۤ:Ljava/util/List;

    return-void

    .line 71
    :cond_0
    new-instance p1, Ljava/io/IOException;

    const-string p2, "entry size exceeds archive size"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private ֫(IJLjava/nio/ByteBuffer;)I
    .locals 6

    .line 112
    iget-object v0, p0, Ll/۫᩷֡;->ۤ:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 113
    iget-object p1, p0, Ll/۫᩷֡;->۬:Ll/֨᩷֡;

    invoke-virtual {p1}, Ll/֨᩷֡;->ۧ()J

    move-result-wide v0

    add-long/2addr v0, p2

    invoke-direct {p0, v0, v1, p4}, Ll/۫᩷֡;->ۧ(JLjava/nio/ByteBuffer;)I

    move-result p1

    return p1

    .line 116
    :cond_0
    iget v1, p0, Ll/۫᩷֡;->ۗ:I

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    const/4 v3, -0x1

    if-lt v1, v2, :cond_1

    return v3

    .line 120
    :cond_1
    iget v1, p0, Ll/۫᩷֡;->ۗ:I

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/io/InputStream;

    .line 121
    new-array v2, p1, [B

    .line 122
    invoke-virtual {v1, v2}, Ljava/io/InputStream;->read([B)I

    move-result v1

    if-eq v1, v3, :cond_2

    const/4 v4, 0x0

    .line 124
    invoke-virtual {p4, v2, v4, v1}, Ljava/nio/ByteBuffer;->put([BII)Ljava/nio/ByteBuffer;

    .line 129
    :cond_2
    iget v2, p0, Ll/۫᩷֡;->ۗ:I

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-ne v2, v0, :cond_3

    goto :goto_0

    :cond_3
    if-ne v1, v3, :cond_4

    .line 135
    iget v0, p0, Ll/۫᩷֡;->ۗ:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Ll/۫᩷֡;->ۗ:I

    .line 136
    invoke-direct {p0, p1, p2, p3, p4}, Ll/۫᩷֡;->֫(IJLjava/nio/ByteBuffer;)I

    move-result p1

    return p1

    :cond_4
    if-ge v1, p1, :cond_6

    .line 142
    iget v0, p0, Ll/۫᩷֡;->ۗ:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Ll/۫᩷֡;->ۗ:I

    int-to-long v4, v1

    add-long/2addr p2, v4

    sub-int/2addr p1, v1

    .line 143
    invoke-direct {p0, p1, p2, p3, p4}, Ll/۫᩷֡;->֫(IJLjava/nio/ByteBuffer;)I

    move-result p1

    if-ne p1, v3, :cond_5

    goto :goto_0

    :cond_5
    add-int/2addr v1, p1

    :cond_6
    :goto_0
    return v1
.end method

.method private ۧ(JLjava/nio/ByteBuffer;)I
    .locals 2

    .line 104
    iget-object v0, p0, Ll/۫᩷֡;->ۙ:Ljava/nio/channels/SeekableByteChannel;

    monitor-enter v0

    .line 105
    :try_start_0
    iget-object v1, p0, Ll/۫᩷֡;->ۙ:Ljava/nio/channels/SeekableByteChannel;

    invoke-interface {v1, p1, p2}, Ljava/nio/channels/SeekableByteChannel;->position(J)Ljava/nio/channels/SeekableByteChannel;

    .line 106
    iget-object p1, p0, Ll/۫᩷֡;->ۙ:Ljava/nio/channels/SeekableByteChannel;

    invoke-interface {p1, p3}, Ljava/nio/channels/SeekableByteChannel;->read(Ljava/nio/ByteBuffer;)I

    move-result p1

    monitor-exit v0

    return p1

    :catchall_0
    move-exception p1

    .line 107
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method


# virtual methods
.method public final ֫(JLjava/nio/ByteBuffer;)I
    .locals 7

    .line 80
    iget-wide v0, p0, Ll/۫᩷֡;->۫:J

    iget-object v2, p0, Ll/۫᩷֡;->۬:Ll/֨᩷֡;

    invoke-virtual {v2}, Ll/֨᩷֡;->᩵()J

    move-result-wide v3

    const/4 v5, -0x1

    cmp-long v6, v0, v3

    if-ltz v6, :cond_0

    return v5

    .line 85
    :cond_0
    invoke-virtual {v2}, Ll/֨᩷֡;->ۨ()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 86
    iget-wide p1, p0, Ll/۫᩷֡;->۫:J

    invoke-virtual {p3}, Ljava/nio/Buffer;->limit()I

    move-result v0

    invoke-direct {p0, v0, p1, p2, p3}, Ll/۫᩷֡;->֫(IJLjava/nio/ByteBuffer;)I

    move-result p1

    goto :goto_0

    .line 88
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Ll/۫᩷֡;->ۧ(JLjava/nio/ByteBuffer;)I

    move-result p1

    :goto_0
    if-ne p1, v5, :cond_3

    .line 92
    invoke-virtual {p3}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object p2

    array-length p2, p2

    if-gtz p2, :cond_2

    .line 95
    iget-object p2, p0, Ll/۫᩷֡;->ۛ:Ll/ۤ᩷֡;

    invoke-virtual {p2}, Ll/ۤ᩷֡;->ᩳ()V

    return p1

    .line 93
    :cond_2
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Truncated TAR archive"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 97
    :cond_3
    iget-wide v0, p0, Ll/۫᩷֡;->۫:J

    int-to-long v2, p1

    add-long/2addr v0, v2

    iput-wide v0, p0, Ll/۫᩷֡;->۫:J

    .line 98
    invoke-virtual {p3}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    return p1
.end method
