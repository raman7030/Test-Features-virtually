.class public final Ll/ܰۨ֡;
.super Ll/᩺ۤ֡;
.source "T65P"


# static fields
.field public static final ۫:[B

.field public static final ۬:[B


# instance fields
.field public final ۗ:Ll/᩹ۨ֡;

.field public final ۙ:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const/4 v0, 0x4

    new-array v1, v0, [B

    .line 61
    fill-array-data v1, :array_0

    sput-object v1, Ll/ܰۨ֡;->۬:[B

    new-array v0, v0, [B

    .line 62
    fill-array-data v0, :array_1

    sput-object v0, Ll/ܰۨ֡;->۫:[B

    return-void

    :array_0
    .array-data 1
        0x7ft
        0x45t
        0x4ct
        0x46t
    .end array-data

    :array_1
    .array-data 1
        0x6ft
        0x61t
        0x74t
        0xat
    .end array-data
.end method

.method public constructor <init>([B)V
    .locals 9

    const/4 v0, 0x0

    .line 44
    invoke-direct {p0, p1, v0}, Ll/᩺ۤ֡;-><init>([BI)V

    .line 83
    array-length v1, p1

    const/16 v2, 0x34

    if-lt v1, v2, :cond_b

    const/4 v1, 0x0

    :goto_0
    const/4 v2, 0x4

    if-ge v1, v2, :cond_1

    .line 121
    aget-byte v2, p1, v1

    sget-object v3, Ll/ܰۨ֡;->۬:[B

    aget-byte v3, v3, v1

    if-ne v2, v3, :cond_0

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 122
    :cond_0
    new-instance p1, Ll/ܶۨ֡;

    .line 330
    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    .line 122
    throw p1

    .line 89
    :cond_1
    aget-byte v1, p1, v2

    const/4 v3, 0x1

    if-ne v1, v3, :cond_2

    .line 90
    iput-boolean v0, p0, Ll/ܰۨ֡;->ۙ:Z

    goto :goto_1

    :cond_2
    const/4 v4, 0x2

    if-ne v1, v4, :cond_a

    .line 92
    iput-boolean v3, p0, Ll/ܰۨ֡;->ۙ:Z

    .line 296
    :goto_1
    invoke-direct {p0}, Ll/ܰۨ֡;->᩻()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/AbstractList;

    invoke-virtual {p1}, Ljava/util/AbstractList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۗۨ֡;

    .line 467
    iget-object v1, v0, Ll/ۗۨ֡;->ۧ:Ll/ܰۨ֡;

    iget v3, v0, Ll/ۗۨ֡;->֫:I

    add-int/2addr v3, v2

    invoke-virtual {v1, v3}, Ll/᩺ۤ֡;->ۧ(I)I

    move-result v1

    const/16 v3, 0xb

    if-ne v1, v3, :cond_3

    .line 298
    new-instance p1, Ll/᩺ۨ֡;

    invoke-direct {p1, p0, v0}, Ll/᩺ۨ֡;-><init>(Ll/ܰۨ֡;Ll/ۗۨ֡;)V

    .line 567
    new-instance v0, Ll/۫ۨ֡;

    invoke-direct {v0, p1}, Ll/۫ۨ֡;-><init>(Ll/᩺ۨ֡;)V

    .line 99
    invoke-virtual {v0}, Ljava/util/AbstractList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۨۨ֡;

    .line 100
    invoke-virtual {v0}, Ll/ۨۨ֡;->֫()Ljava/lang/String;

    move-result-object v1

    const-string v2, "oatdata"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 101
    new-instance p1, Ll/᩹ۨ֡;

    .line 606
    :try_start_0
    iget-object v1, v0, Ll/ۨۨ֡;->ۧ:Ll/᩺ۨ֡;

    iget-object v1, v1, Ll/᩺ۨ֡;->ܿ:Ll/ܰۨ֡;

    invoke-direct {v1}, Ll/ܰۨ֡;->᩻()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0}, Ll/ۨۨ֡;->ۧ()I

    move-result v2

    check-cast v1, Ll/ۚۨ֡;

    invoke-virtual {v1, v2}, Ll/ۚۨ֡;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۗۨ֡;
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    .line 611
    invoke-virtual {v1}, Ll/ۗۨ֡;->֫()J

    move-result-wide v2

    .line 612
    invoke-virtual {v1}, Ll/ۗۨ֡;->ᩳ()I

    move-result v4

    .line 613
    invoke-virtual {v1}, Ll/ۗۨ֡;->ܿ()I

    move-result v1

    .line 615
    invoke-virtual {v0}, Ll/ۨۨ֡;->ܽ()J

    move-result-wide v5

    cmp-long v7, v5, v2

    if-ltz v7, :cond_5

    int-to-long v7, v1

    add-long/2addr v7, v2

    cmp-long v1, v5, v7

    if-gez v1, :cond_5

    int-to-long v4, v4

    .line 621
    invoke-virtual {v0}, Ll/ۨۨ֡;->ܽ()J

    move-result-wide v0

    sub-long/2addr v0, v2

    add-long/2addr v0, v4

    long-to-int v1, v0

    .line 101
    invoke-direct {p1, p0, v1}, Ll/᩹ۨ֡;-><init>(Ll/ܰۨ֡;I)V

    goto :goto_2

    .line 618
    :cond_5
    new-instance p1, Ll/۠ۨ֡;

    const-string v0, "symbol address lies outside it\'s associated section"

    .line 325
    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 618
    throw p1

    .line 608
    :catch_0
    new-instance p1, Ll/۠ۨ֡;

    const-string v0, "Section index for symbol is out of bounds"

    .line 325
    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 608
    throw p1

    :cond_6
    const/4 p1, 0x0

    :goto_2
    if-eqz p1, :cond_8

    .line 109
    iput-object p1, p0, Ll/ܰۨ֡;->ۗ:Ll/᩹ۨ֡;

    .line 111
    invoke-virtual {p1}, Ll/᩹ۨ֡;->ᩳ()Z

    move-result v0

    if-eqz v0, :cond_7

    .line 115
    invoke-virtual {p1}, Ll/᩹ۨ֡;->ܽ()I

    move-result p1

    invoke-static {p1}, Ll/۠ۗ֡;->ܽ(I)V

    return-void

    .line 112
    :cond_7
    new-instance p1, Ll/۠ۨ֡;

    const-string v0, "Invalid oat magic value"

    .line 325
    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 112
    throw p1

    .line 107
    :cond_8
    new-instance p1, Ll/۠ۨ֡;

    const-string v0, "Oat file has no oatdata symbol"

    .line 325
    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 107
    throw p1

    .line 301
    :cond_9
    new-instance p1, Ll/۠ۨ֡;

    const-string v0, "Oat file has no symbol table"

    .line 325
    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 301
    throw p1

    .line 94
    :cond_a
    new-instance v1, Ll/۠ۨ֡;

    const/4 v2, 0x5

    aget-byte p1, p1, v2

    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    new-array v2, v3, [Ljava/lang/Object;

    aput-object p1, v2, v0

    const-string p1, "Invalid word-size value: %x"

    invoke-static {p1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    .line 325
    invoke-direct {v1, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 94
    throw v1

    .line 84
    :cond_b
    new-instance p1, Ll/ܶۨ֡;

    .line 330
    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    .line 84
    throw p1
.end method

.method public static ֫(Ljava/io/BufferedInputStream;)Ll/ܰۨ֡;
    .locals 5

    .line 133
    invoke-virtual {p0}, Ljava/io/InputStream;->markSupported()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, 0x4

    .line 136
    invoke-virtual {p0, v0}, Ljava/io/InputStream;->mark(I)V

    new-array v1, v0, [B

    const/4 v2, 0x0

    .line 798
    :try_start_0
    invoke-static {p0, v1, v2, v0}, Ll/ᩳ᩺ܺ;->֫(Ljava/io/InputStream;[BII)V
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 143
    invoke-virtual {p0}, Ljava/io/InputStream;->reset()V

    :goto_0
    if-ge v2, v0, :cond_1

    .line 121
    aget-byte v3, v1, v2

    sget-object v4, Ll/ܰۨ֡;->۬:[B

    aget-byte v4, v4, v2

    if-ne v3, v4, :cond_0

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 122
    :cond_0
    new-instance p0, Ll/ܶۨ֡;

    .line 330
    invoke-direct {p0}, Ljava/lang/RuntimeException;-><init>()V

    .line 122
    throw p0

    .line 148
    :cond_1
    invoke-virtual {p0}, Ljava/io/InputStream;->reset()V

    .line 150
    invoke-static {p0}, Ll/ᩳ᩺ܺ;->֫(Ljava/io/InputStream;)[B

    move-result-object p0

    .line 151
    new-instance v0, Ll/ܰۨ֡;

    invoke-direct {v0, p0}, Ll/ܰۨ֡;-><init>([B)V

    return-object v0

    :catchall_0
    move-exception v0

    goto :goto_1

    .line 141
    :catch_0
    :try_start_1
    new-instance v0, Ll/ܶۨ֡;

    .line 330
    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    .line 141
    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 143
    :goto_1
    invoke-virtual {p0}, Ljava/io/InputStream;->reset()V

    .line 144
    throw v0

    .line 134
    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "InputStream must support mark"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static bridge synthetic ֫(Ll/ܰۨ֡;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/ܰۨ֡;->ۙ:Z

    return p0
.end method

.method public static bridge synthetic ۧ(Ll/ܰۨ֡;)Ll/᩹ۨ֡;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܰۨ֡;->ۗ:Ll/᩹ۨ֡;

    return-object p0
.end method

.method public static bridge synthetic ܳ()[B
    .locals 1

    .line 0
    sget-object v0, Ll/ܰۨ֡;->۫:[B

    return-object v0
.end method

.method public static bridge synthetic ܽ(Ll/ܰۨ֡;)Ljava/util/List;
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/ܰۨ֡;->᩻()Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method private ᩻()Ljava/util/List;
    .locals 5

    .line 260
    iget-boolean v0, p0, Ll/ܰۨ֡;->ۙ:Z

    if-eqz v0, :cond_0

    const/16 v0, 0x28

    .line 261
    invoke-virtual {p0, v0}, Ll/ۘۨ֡;->ᩳ(I)I

    move-result v0

    const/16 v1, 0x3a

    .line 262
    invoke-virtual {p0, v1}, Ll/ۘۨ֡;->ۢ(I)I

    move-result v1

    const/16 v2, 0x3c

    .line 263
    invoke-virtual {p0, v2}, Ll/ۘۨ֡;->ۢ(I)I

    move-result v2

    goto :goto_0

    :cond_0
    const/16 v0, 0x20

    .line 265
    invoke-virtual {p0, v0}, Ll/ۘۨ֡;->ۜ(I)I

    move-result v0

    const/16 v1, 0x2e

    .line 266
    invoke-virtual {p0, v1}, Ll/ۘۨ֡;->ۢ(I)I

    move-result v1

    const/16 v2, 0x30

    .line 267
    invoke-virtual {p0, v2}, Ll/ۘۨ֡;->ۢ(I)I

    move-result v2

    :goto_0
    mul-int v3, v1, v2

    add-int/2addr v3, v0

    .line 270
    invoke-virtual {p0}, Ll/᩺ۤ֡;->length()I

    move-result v4

    if-gt v3, v4, :cond_1

    .line 274
    new-instance v3, Ll/ۚۨ֡;

    invoke-direct {v3, p0, v2, v0, v1}, Ll/ۚۨ֡;-><init>(Ll/ܰۨ֡;III)V

    return-object v3

    .line 271
    :cond_1
    new-instance v0, Ll/۠ۨ֡;

    const-string v1, "The ELF section headers extend past the end of the file"

    .line 325
    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 271
    throw v0
.end method


# virtual methods
.method public final ܽ()Ljava/util/List;
    .locals 1

    .line 205
    new-instance v0, Ll/֡ۨ֡;

    invoke-direct {v0, p0}, Ll/֡ۨ֡;-><init>(Ll/ܰۨ֡;)V

    return-object v0
.end method

.method public final ᩳ()I
    .locals 1

    .line 155
    iget-object v0, p0, Ll/ܰۨ֡;->ۗ:Ll/᩹ۨ֡;

    invoke-virtual {v0}, Ll/᩹ۨ֡;->ܽ()I

    move-result v0

    return v0
.end method
