.class public final Ll/֫᩶ᩳ;
.super Ljava/io/InputStream;
.source "V6SW"

# interfaces
.implements Ll/ܶ֨ᩴ;


# instance fields
.field public ۗ:Z

.field public final ۙ:[B

.field public final synthetic ۬:Ll/ܿ᩶ᩳ;

.field public ᩶:I

.field public ᩸:Z

.field public ᩹:Ljava/io/InputStream;


# direct methods
.method public constructor <init>(Ll/ܿ᩶ᩳ;)V
    .locals 1

    .line 91
    iput-object p1, p0, Ll/֫᩶ᩳ;->۬:Ll/ܿ᩶ᩳ;

    invoke-direct {p0}, Ljava/io/InputStream;-><init>()V

    const/4 v0, 0x1

    new-array v0, v0, [B

    .line 92
    iput-object v0, p0, Ll/֫᩶ᩳ;->ۙ:[B

    .line 93
    new-instance v0, Ljava/io/ByteArrayInputStream;

    invoke-static {p1}, Ll/ܿ᩶ᩳ;->ܽ(Ll/ܿ᩶ᩳ;)[B

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    iput-object v0, p0, Ll/֫᩶ᩳ;->᩹:Ljava/io/InputStream;

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 1

    .line 117
    iget-boolean v0, p0, Ll/֫᩶ᩳ;->᩸:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Ll/֫᩶ᩳ;->᩸:Z

    iget-object v0, p0, Ll/֫᩶ᩳ;->᩹:Ljava/io/InputStream;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    const/4 v0, 0x0

    iput-object v0, p0, Ll/֫᩶ᩳ;->᩹:Ljava/io/InputStream;

    :cond_0
    return-void
.end method

.method public final read()I
    .locals 4

    const/4 v0, 0x1

    .line 96
    iget-object v1, p0, Ll/֫᩶ᩳ;->ۙ:[B

    const/4 v2, 0x0

    invoke-virtual {p0, v1, v2, v0}, Ll/֫᩶ᩳ;->read([BII)I

    move-result v0

    const/4 v3, -0x1

    if-ne v0, v3, :cond_0

    return v3

    :cond_0
    aget-byte v0, v1, v2

    and-int/lit16 v0, v0, 0xff

    return v0
.end method

.method public final read([BII)I
    .locals 6

    .line 98
    array-length v0, p1

    invoke-static {p2, p3, v0}, Ll/ۧ۫ᩴ;->checkFromIndexSize(III)I

    .line 99
    iget-boolean v0, p0, Ll/֫᩶ᩳ;->᩸:Z

    if-nez v0, :cond_6

    iget-object v0, p0, Ll/֫᩶ᩳ;->۬:Ll/ܿ᩶ᩳ;

    invoke-static {v0}, Ll/ܿ᩶ᩳ;->֫(Ll/ܿ᩶ᩳ;)Z

    move-result v1

    if-nez v1, :cond_6

    const/4 v1, 0x0

    if-nez p3, :cond_0

    return v1

    .line 101
    :cond_0
    :goto_0
    iget-object v2, p0, Ll/֫᩶ᩳ;->᩹:Ljava/io/InputStream;

    const/4 v3, -0x1

    if-eqz v2, :cond_5

    .line 102
    invoke-virtual {v2, p1, p2, p3}, Ljava/io/InputStream;->read([BII)I

    move-result v2

    if-eq v2, v3, :cond_1

    return v2

    .line 104
    :cond_1
    iget-object v2, p0, Ll/֫᩶ᩳ;->᩹:Ljava/io/InputStream;

    invoke-virtual {v2}, Ljava/io/InputStream;->close()V

    const/4 v2, 0x0

    iput-object v2, p0, Ll/֫᩶ᩳ;->᩹:Ljava/io/InputStream;

    .line 105
    iget-boolean v2, p0, Ll/֫᩶ᩳ;->ۗ:Z

    if-eqz v2, :cond_3

    .line 106
    invoke-static {v0}, Ll/ܿ᩶ᩳ;->ۧ(Ll/ܿ᩶ᩳ;)Ljava/util/List;

    move-result-object v2

    iget v3, p0, Ll/֫᩶ᩳ;->᩶:I

    add-int/lit8 v4, v3, 0x1

    iput v4, p0, Ll/֫᩶ᩳ;->᩶:I

    check-cast v2, Ljava/util/ArrayList;

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܽ᩶ᩳ;

    .line 177
    iget-object v3, v2, Ll/ܽ᩶ᩳ;->ۧ:Ll/ۢ᩶ᩳ;

    if-nez v3, :cond_2

    new-instance v3, Ljava/io/ByteArrayInputStream;

    iget-object v2, v2, Ll/ܽ᩶ᩳ;->֫:[B

    invoke-direct {v3, v2}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    goto :goto_1

    .line 197
    :cond_2
    iget-object v2, v3, Ll/ۢ᩶ᩳ;->ܽ:Ll/ۡ᩶ᩳ;

    invoke-static {v2}, Ll/ۡ᩶ᩳ;->ۧ(Ll/ۡ᩶ᩳ;)V

    .line 198
    new-instance v2, Ll/᩷᩶ᩳ;

    invoke-direct {v2, v3}, Ll/᩷᩶ᩳ;-><init>(Ll/ۢ᩶ᩳ;)V

    move-object v3, v2

    .line 106
    :goto_1
    iput-object v3, p0, Ll/֫᩶ᩳ;->᩹:Ljava/io/InputStream;

    iput-boolean v1, p0, Ll/֫᩶ᩳ;->ۗ:Z

    goto :goto_0

    .line 107
    :cond_3
    iget v2, p0, Ll/֫᩶ᩳ;->᩶:I

    invoke-static {v0}, Ll/ܿ᩶ᩳ;->ۧ(Ll/ܿ᩶ᩳ;)Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ge v2, v3, :cond_0

    .line 108
    invoke-static {v0}, Ll/ܿ᩶ᩳ;->ۧ(Ll/ܿ᩶ᩳ;)Ljava/util/List;

    move-result-object v2

    iget v3, p0, Ll/֫᩶ᩳ;->᩶:I

    check-cast v2, Ljava/util/ArrayList;

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܽ᩶ᩳ;

    .line 109
    new-instance v3, Ll/ۤۜܽ;

    const/16 v4, 0xc

    invoke-direct {v3, v4}, Ll/ۤۜܽ;-><init>(I)V

    .line 110
    iget v4, v2, Ll/ܽ᩶ᩳ;->ܽ:I

    invoke-virtual {v3, v4}, Ll/ۤۜܽ;->writeInt(I)V

    .line 176
    iget-object v4, v2, Ll/ܽ᩶ᩳ;->ۧ:Ll/ۢ᩶ᩳ;

    if-nez v4, :cond_4

    iget-object v2, v2, Ll/ܽ᩶ᩳ;->֫:[B

    array-length v2, v2

    int-to-long v4, v2

    goto :goto_2

    :cond_4
    invoke-virtual {v4}, Ll/ۢ᩶ᩳ;->֫()J

    move-result-wide v4

    .line 110
    :goto_2
    invoke-virtual {v3, v4, v5}, Ll/ۤۜܽ;->ۧ(J)V

    .line 111
    new-instance v2, Ljava/io/ByteArrayInputStream;

    invoke-virtual {v3}, Ll/ۤۜܽ;->᩻()[B

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    iput-object v2, p0, Ll/֫᩶ᩳ;->᩹:Ljava/io/InputStream;

    const/4 v2, 0x1

    iput-boolean v2, p0, Ll/֫᩶ᩳ;->ۗ:Z

    goto/16 :goto_0

    :cond_5
    return v3

    .line 99
    :cond_6
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Legacy app state stream is closed"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public synthetic transferTo(Ljava/io/OutputStream;)J
    .locals 2

    .line 0
    invoke-static {p0, p1}, Ll/֨֨ᩴ;->transferTo(Ljava/io/InputStream;Ljava/io/OutputStream;)J

    move-result-wide v0

    return-wide v0
.end method
