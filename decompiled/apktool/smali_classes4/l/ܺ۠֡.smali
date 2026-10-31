.class public final Ll/ܺ۠֡;
.super Ljava/io/OutputStream;
.source "Q8FD"


# instance fields
.field public ۗ:I

.field public final ۙ:I

.field public ۬:Z

.field public ᩶:Ljava/io/OutputStream;

.field public ᩸:Ll/ۧ۠֡;

.field public ᩹:Ll/ܽ۠֡;


# direct methods
.method public constructor <init>(Ljava/io/OutputStream;I)V
    .locals 3

    .line 191
    invoke-direct {p0}, Ljava/io/OutputStream;-><init>()V

    const/4 v0, 0x0

    .line 49
    iput-boolean v0, p0, Ll/ܺ۠֡;->۬:Z

    .line 59
    iput v0, p0, Ll/ܺ۠֡;->ۗ:I

    const/4 v0, 0x1

    if-lt p2, v0, :cond_0

    const/16 v0, 0x9

    if-gt p2, v0, :cond_0

    const v0, 0x186a0

    mul-int v0, v0, p2

    .line 201
    iput v0, p0, Ll/ܺ۠֡;->ۙ:I

    .line 202
    iput-object p1, p0, Ll/ܺ۠֡;->᩶:Ljava/io/OutputStream;

    .line 203
    new-instance v1, Ll/ۧ۠֡;

    invoke-direct {v1, p1}, Ll/ۧ۠֡;-><init>(Ljava/io/OutputStream;)V

    iput-object v1, p0, Ll/ܺ۠֡;->᩸:Ll/ۧ۠֡;

    const/16 p1, 0x10

    const/16 v2, 0x425a

    .line 205
    invoke-virtual {v1, p1, v2}, Ll/ۧ۠֡;->֫(II)V

    const/16 p1, 0x68

    const/16 v2, 0x8

    .line 206
    invoke-virtual {v1, v2, p1}, Ll/ۧ۠֡;->֫(II)V

    add-int/lit8 p2, p2, 0x30

    .line 207
    invoke-virtual {v1, v2, p2}, Ll/ۧ۠֡;->֫(II)V

    .line 137
    new-instance p1, Ll/ܽ۠֡;

    invoke-direct {p1, v1, v0}, Ll/ܽ۠֡;-><init>(Ll/ۧ۠֡;I)V

    iput-object p1, p0, Ll/ܺ۠֡;->᩹:Ll/ܽ۠֡;

    return-void

    .line 198
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Invalid BZip2 block size"

    .line 0
    invoke-static {p2, v0}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 198
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private ֫()V
    .locals 3

    .line 149
    iget-object v0, p0, Ll/ܺ۠֡;->᩹:Ll/ܽ۠֡;

    invoke-virtual {v0}, Ll/ܽ۠֡;->ܽ()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 153
    :cond_0
    iget-object v0, p0, Ll/ܺ۠֡;->᩹:Ll/ܽ۠֡;

    invoke-virtual {v0}, Ll/ܽ۠֡;->֫()V

    .line 154
    iget-object v0, p0, Ll/ܺ۠֡;->᩹:Ll/ܽ۠֡;

    invoke-virtual {v0}, Ll/ܽ۠֡;->ۧ()I

    move-result v0

    .line 155
    iget v1, p0, Ll/ܺ۠֡;->ۗ:I

    shl-int/lit8 v2, v1, 0x1

    ushr-int/lit8 v1, v1, 0x1f

    or-int/2addr v1, v2

    xor-int/2addr v0, v1

    iput v0, p0, Ll/ܺ۠֡;->ۗ:I

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 6

    .line 123
    iget-object v0, p0, Ll/ܺ۠֡;->᩶:Ljava/io/OutputStream;

    if-eqz v0, :cond_1

    .line 167
    iget-object v0, p0, Ll/ܺ۠֡;->᩸:Ll/ۧ۠֡;

    iget-boolean v1, p0, Ll/ܺ۠֡;->۬:Z

    const/4 v2, 0x0

    if-nez v1, :cond_0

    const/4 v1, 0x1

    .line 168
    iput-boolean v1, p0, Ll/ܺ۠֡;->۬:Z

    .line 170
    :try_start_0
    invoke-direct {p0}, Ll/ܺ۠֡;->֫()V

    const v1, 0x177245

    const/16 v3, 0x18

    .line 171
    invoke-virtual {v0, v3, v1}, Ll/ۧ۠֡;->֫(II)V

    const v1, 0x385090

    .line 172
    invoke-virtual {v0, v3, v1}, Ll/ۧ۠֡;->֫(II)V

    .line 173
    iget v1, p0, Ll/ܺ۠֡;->ۗ:I

    ushr-int/lit8 v3, v1, 0x10

    const v4, 0xffff

    and-int/2addr v3, v4

    const/16 v5, 0x10

    .line 120
    invoke-virtual {v0, v5, v3}, Ll/ۧ۠֡;->֫(II)V

    and-int/2addr v1, v4

    .line 121
    invoke-virtual {v0, v5, v1}, Ll/ۧ۠֡;->֫(II)V

    .line 174
    invoke-virtual {v0}, Ll/ۧ۠֡;->֫()V

    .line 175
    iget-object v0, p0, Ll/ܺ۠֡;->᩶:Ljava/io/OutputStream;

    invoke-virtual {v0}, Ljava/io/OutputStream;->flush()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 177
    iput-object v2, p0, Ll/ܺ۠֡;->᩹:Ll/ܽ۠֡;

    goto :goto_0

    :catchall_0
    move-exception v0

    iput-object v2, p0, Ll/ܺ۠֡;->᩹:Ll/ܽ۠֡;

    throw v0

    .line 125
    :cond_0
    :goto_0
    iget-object v0, p0, Ll/ܺ۠֡;->᩶:Ljava/io/OutputStream;

    invoke-virtual {v0}, Ljava/io/OutputStream;->close()V

    .line 126
    iput-object v2, p0, Ll/ܺ۠֡;->᩶:Ljava/io/OutputStream;

    :cond_1
    return-void
.end method

.method public final write(I)V
    .locals 3

    .line 73
    iget-object v0, p0, Ll/ܺ۠֡;->᩶:Ljava/io/OutputStream;

    if-eqz v0, :cond_2

    .line 77
    iget-boolean v0, p0, Ll/ܺ۠֡;->۬:Z

    if-nez v0, :cond_1

    .line 81
    iget-object v0, p0, Ll/ܺ۠֡;->᩹:Ll/ܽ۠֡;

    and-int/lit16 p1, p1, 0xff

    invoke-virtual {v0, p1}, Ll/ܽ۠֡;->֫(I)Z

    move-result v0

    if-nez v0, :cond_0

    .line 82
    invoke-direct {p0}, Ll/ܺ۠֡;->֫()V

    .line 137
    new-instance v0, Ll/ܽ۠֡;

    iget-object v1, p0, Ll/ܺ۠֡;->᩸:Ll/ۧ۠֡;

    iget v2, p0, Ll/ܺ۠֡;->ۙ:I

    invoke-direct {v0, v1, v2}, Ll/ܽ۠֡;-><init>(Ll/ۧ۠֡;I)V

    iput-object v0, p0, Ll/ܺ۠֡;->᩹:Ll/ܽ۠֡;

    .line 84
    invoke-virtual {v0, p1}, Ll/ܽ۠֡;->֫(I)Z

    :cond_0
    return-void

    .line 78
    :cond_1
    new-instance p1, Ll/᩻۠֡;

    const-string v0, "Write beyond end of stream"

    .line 20
    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 78
    throw p1

    .line 74
    :cond_2
    new-instance p1, Ll/᩻۠֡;

    const-string v0, "Stream closed"

    .line 20
    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 74
    throw p1
.end method

.method public final write([BII)V
    .locals 5

    .line 96
    iget-object v0, p0, Ll/ܺ۠֡;->᩶:Ljava/io/OutputStream;

    if-eqz v0, :cond_5

    .line 100
    iget-boolean v0, p0, Ll/ܺ۠֡;->۬:Z

    if-nez v0, :cond_4

    :goto_0
    if-lez p3, :cond_3

    .line 106
    iget-object v0, p0, Ll/ܺ۠֡;->᩹:Ll/ܽ۠֡;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v1, 0x0

    move v3, p2

    move v2, p3

    :goto_1
    add-int/lit8 v4, v2, -0x1

    if-lez v2, :cond_1

    add-int/lit8 v2, v3, 0x1

    .line 221
    aget-byte v3, p1, v3

    invoke-virtual {v0, v3}, Ll/ܽ۠֡;->֫(I)Z

    move-result v3

    if-nez v3, :cond_0

    goto :goto_2

    :cond_0
    add-int/lit8 v1, v1, 0x1

    move v3, v2

    move v2, v4

    goto :goto_1

    :cond_1
    :goto_2
    if-ge v1, p3, :cond_2

    .line 107
    invoke-direct {p0}, Ll/ܺ۠֡;->֫()V

    .line 137
    new-instance v0, Ll/ܽ۠֡;

    iget-object v2, p0, Ll/ܺ۠֡;->᩸:Ll/ۧ۠֡;

    iget v3, p0, Ll/ܺ۠֡;->ۙ:I

    invoke-direct {v0, v2, v3}, Ll/ܽ۠֡;-><init>(Ll/ۧ۠֡;I)V

    iput-object v0, p0, Ll/ܺ۠֡;->᩹:Ll/ܽ۠֡;

    :cond_2
    add-int/2addr p2, v1

    sub-int/2addr p3, v1

    goto :goto_0

    :cond_3
    return-void

    .line 101
    :cond_4
    new-instance p1, Ll/᩻۠֡;

    const-string p2, "Write beyond end of stream"

    .line 20
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 101
    throw p1

    .line 97
    :cond_5
    new-instance p1, Ll/᩻۠֡;

    const-string p2, "Stream closed"

    .line 20
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 97
    throw p1
.end method
