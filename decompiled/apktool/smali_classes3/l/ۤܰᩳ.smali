.class public final Ll/ۤܰᩳ;
.super Ljava/lang/Object;
.source "N6T5"

# interfaces
.implements Ljava/lang/AutoCloseable;


# instance fields
.field public ۗ:Ll/ۛܰᩳ;

.field public final ۙ:[Z

.field public final ۫:Z

.field public final ۬:Ll/۫᩹ᩳ;

.field public final ᩶:I

.field public final ᩸:Ll/֡᩶ᩳ;

.field public ᩹:Z


# direct methods
.method public constructor <init>(Ll/۫᩹ᩳ;III)V
    .locals 1

    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x105

    new-array v0, v0, [Z

    .line 36
    iput-object v0, p0, Ll/ۤܰᩳ;->ۙ:[Z

    .line 37
    new-instance v0, Ll/ۛܰᩳ;

    .line 23
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 37
    iput-object v0, p0, Ll/ۤܰᩳ;->ۗ:Ll/ۛܰᩳ;

    if-ltz p4, :cond_1

    .line 42
    iput-object p1, p0, Ll/ۤܰᩳ;->۬:Ll/۫᩹ᩳ;

    iput p4, p0, Ll/ۤܰᩳ;->᩶:I

    .line 43
    new-instance p4, Ll/֡᩶ᩳ;

    invoke-direct {p4, p1, p2, p3}, Ll/֡᩶ᩳ;-><init>(Ll/۫᩹ᩳ;II)V

    iput-object p4, p0, Ll/ۤܰᩳ;->᩸:Ll/֡᩶ᩳ;

    if-nez p2, :cond_0

    .line 44
    invoke-virtual {p1}, Ll/۬᩹ᩳ;->length()I

    move-result p1

    if-ne p3, p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-boolean p1, p0, Ll/ۤܰᩳ;->۫:Z

    return-void

    .line 41
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Invalid app state limit"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private ֫()V
    .locals 2

    .line 105
    iget-object v0, p0, Ll/ۤܰᩳ;->ۗ:Ll/ۛܰᩳ;

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Ll/ۤܰᩳ;->᩹:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Legacy view reader is closed or failed"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static synthetic ֫(Ll/ۤܰᩳ;Ljava/util/ArrayList;III)V
    .locals 1

    .line 71
    iget-object v0, p0, Ll/ۤܰᩳ;->۬:Ll/۫᩹ᩳ;

    iget-boolean p0, p0, Ll/ۤܰᩳ;->۫:Z

    if-nez p0, :cond_0

    if-ltz p4, :cond_0

    invoke-virtual {v0, p4}, Ll/۬᩹ᩳ;->ܽ(I)I

    move-result p2

    invoke-virtual {v0, p2}, Ll/۬᩹ᩳ;->ᩳ(I)I

    move-result p0

    sub-int p3, p4, p0

    .line 72
    :cond_0
    new-instance p0, Ll/᩸۟ᩳ;

    invoke-direct {p0, p2, p3}, Ll/᩸۟ᩳ;-><init>(II)V

    invoke-virtual {p1, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 1

    const/4 v0, 0x0

    .line 106
    iput-object v0, p0, Ll/ۤܰᩳ;->ۗ:Ll/ۛܰᩳ;

    iget-object v0, p0, Ll/ۤܰᩳ;->᩸:Ll/֡᩶ᩳ;

    invoke-virtual {v0}, Ll/֡᩶ᩳ;->close()V

    return-void
.end method

.method public final finish()Ll/ۛܰᩳ;
    .locals 1

    .line 99
    invoke-direct {p0}, Ll/ۤܰᩳ;->֫()V

    .line 100
    iget-object v0, p0, Ll/ۤܰᩳ;->ۗ:Ll/ۛܰᩳ;

    .line 101
    invoke-virtual {p0}, Ll/ۤܰᩳ;->close()V

    return-object v0
.end method

.method public final ֫(IJLjava/io/InputStream;)V
    .locals 10

    const/16 v0, 0x104

    const/4 v1, 0x4

    const/4 v2, 0x2

    const/16 v3, 0x103

    const/4 v4, 0x1

    if-eq p1, v4, :cond_0

    if-eq p1, v2, :cond_0

    if-eq p1, v1, :cond_0

    const/4 v5, 0x7

    if-eq p1, v5, :cond_0

    if-eq p1, v3, :cond_0

    if-eq p1, v0, :cond_0

    .line 50
    invoke-direct {p0}, Ll/ۤܰᩳ;->֫()V

    return-void

    .line 53
    :cond_0
    :try_start_0
    invoke-direct {p0}, Ll/ۤܰᩳ;->֫()V

    .line 54
    iget-object v5, p0, Ll/ۤܰᩳ;->ۙ:[Z

    aget-boolean v6, v5, p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    if-nez v6, :cond_a

    const-wide/16 v6, 0x0

    cmp-long v8, p2, v6

    if-ltz v8, :cond_a

    iget v6, p0, Ll/ۤܰᩳ;->᩶:I

    int-to-long v7, v6

    cmp-long v9, p2, v7

    if-gtz v9, :cond_a

    .line 55
    :try_start_1
    aput-boolean v4, v5, p1

    .line 57
    new-instance v5, Ll/۫ܰᩳ;

    invoke-direct {v5, p4}, Ll/۫ܰᩳ;-><init>(Ljava/io/InputStream;)V

    if-ne p1, v1, :cond_3

    .line 59
    iget-object p1, p0, Ll/ۤܰᩳ;->ۗ:Ll/ۛܰᩳ;

    long-to-int v0, p2

    new-array v0, v0, [B

    iput-object v0, p1, Ll/ۛܰᩳ;->ܿ:[B

    const/4 p1, 0x0

    .line 61
    :goto_0
    iget-object v0, p0, Ll/ۤܰᩳ;->ۗ:Ll/ۛܰᩳ;

    iget-object v1, v0, Ll/ۛܰᩳ;->ܿ:[B

    array-length v2, v1

    if-ge p1, v2, :cond_2

    .line 62
    array-length v0, v1

    sub-int/2addr v0, p1

    invoke-virtual {v5, v1, p1, v0}, Ljava/io/InputStream;->read([BII)I

    move-result v0

    if-lez v0, :cond_1

    add-int/2addr p1, v0

    goto :goto_0

    .line 63
    :cond_1
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Truncated legacy text config"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 66
    :cond_2
    new-instance p1, Ljava/io/ByteArrayInputStream;

    iget-object v1, p0, Ll/ۤܰᩳ;->ۗ:Ll/ۛܰᩳ;

    iget-object v1, v1, Ll/ۛܰᩳ;->ܿ:[B

    invoke-direct {p1, v1}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    invoke-static {p1, p2, p3, v6}, Ll/۬ܰᩳ;->֫(Ljava/io/ByteArrayInputStream;JI)Ll/۬ܰᩳ;

    move-result-object p1

    iput-object p1, v0, Ll/ۛܰᩳ;->ܽ:Ll/۬ܰᩳ;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    goto/16 :goto_5

    .line 67
    :cond_3
    iget-object v1, p0, Ll/ۤܰᩳ;->᩸:Ll/֡᩶ᩳ;

    if-eq p1, v3, :cond_8

    if-ne p1, v0, :cond_4

    goto/16 :goto_4

    .line 76
    :cond_4
    :try_start_2
    invoke-static {p2, p3, v5}, Ll/᩻᩶ᩳ;->֫(JLjava/io/InputStream;)Ll/᩻᩶ᩳ;

    move-result-object p2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    if-ne p1, v4, :cond_6

    .line 78
    :try_start_3
    iget-object p1, p0, Ll/ۤܰᩳ;->ۗ:Ll/ۛܰᩳ;

    invoke-virtual {p2}, Ll/᩻᩶ᩳ;->readInt()I

    move-result p3

    iput p3, p1, Ll/ۛܰᩳ;->ۡ:I

    iget-object p1, p0, Ll/ۤܰᩳ;->ۗ:Ll/ۛܰᩳ;

    invoke-virtual {p2}, Ll/᩻᩶ᩳ;->readInt()I

    move-result p3

    iput p3, p1, Ll/ۛܰᩳ;->ۘ:I

    iget-object p1, p0, Ll/ۤܰᩳ;->ۗ:Ll/ۛܰᩳ;

    invoke-virtual {p2}, Ll/᩻᩶ᩳ;->readInt()I

    move-result p3

    iput p3, p1, Ll/ۛܰᩳ;->ᩳ:I

    .line 79
    iget-object p1, p0, Ll/ۤܰᩳ;->ۗ:Ll/ۛܰᩳ;

    iget p3, p1, Ll/ۛܰᩳ;->ᩳ:I

    iget p1, p1, Ll/ۛܰᩳ;->ۡ:I

    const/high16 v0, -0x80000000

    xor-int/2addr p3, v0

    xor-int/2addr p1, v0

    .line 0
    invoke-static {p3, p1}, Ljava/lang/Integer;->compare(II)I

    move-result p1

    if-gtz p1, :cond_5

    .line 80
    iget-object p1, p0, Ll/ۤܰᩳ;->ۗ:Ll/ۛܰᩳ;

    iput-boolean v4, p1, Ll/ۛܰᩳ;->᩻:Z

    goto :goto_1

    .line 79
    :cond_5
    new-instance p1, Ljava/io/IOException;

    const-string p3, "Invalid legacy edit marks"

    invoke-direct {p1, p3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_6
    if-ne p1, v2, :cond_7

    .line 82
    iget-object p1, p0, Ll/ۤܰᩳ;->ۗ:Ll/ۛܰᩳ;

    invoke-virtual {p2}, Ll/᩻᩶ᩳ;->readInt()I

    move-result p3

    invoke-virtual {v1, p3}, Ll/֡᩶ᩳ;->֫(I)I

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object p1, p0, Ll/ۤܰᩳ;->ۗ:Ll/ۛܰᩳ;

    invoke-virtual {p2}, Ll/᩻᩶ᩳ;->readInt()I

    move-result p3

    invoke-virtual {v1, p3}, Ll/֡᩶ᩳ;->֫(I)I

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 83
    iget-object p1, p0, Ll/ۤܰᩳ;->ۗ:Ll/ۛܰᩳ;

    invoke-virtual {p2}, Ll/᩻᩶ᩳ;->readInt()I

    move-result p3

    iput p3, p1, Ll/ۛܰᩳ;->ᩴ:I

    iget-object p1, p0, Ll/ۤܰᩳ;->ۗ:Ll/ۛܰᩳ;

    invoke-virtual {p2}, Ll/᩻᩶ᩳ;->readInt()I

    move-result p3

    iput p3, p1, Ll/ۛܰᩳ;->᩵:I

    iget-object p1, p0, Ll/ۤܰᩳ;->ۗ:Ll/ۛܰᩳ;

    invoke-virtual {p2}, Ll/᩻᩶ᩳ;->readByte()I

    move-result p3

    iput p3, p1, Ll/ۛܰᩳ;->ۚ:I

    .line 84
    iget-object p1, p0, Ll/ۤܰᩳ;->ۗ:Ll/ۛܰᩳ;

    invoke-virtual {p2}, Ll/᩻᩶ᩳ;->֫()Z

    move-result p3

    iput-boolean p3, p1, Ll/ۛܰᩳ;->֡:Z

    iget-object p1, p0, Ll/ۤܰᩳ;->ۗ:Ll/ۛܰᩳ;

    invoke-virtual {p2}, Ll/᩻᩶ᩳ;->֫()Z

    move-result p3

    iput-boolean p3, p1, Ll/ۛܰᩳ;->֫:Z

    iget-object p1, p0, Ll/ۤܰᩳ;->ۗ:Ll/ۛܰᩳ;

    invoke-virtual {p2}, Ll/᩻᩶ᩳ;->֫()Z

    move-result p3

    iput-boolean p3, p1, Ll/ۛܰᩳ;->ۢ:Z

    .line 85
    iget-object p1, p0, Ll/ۤܰᩳ;->ۗ:Ll/ۛܰᩳ;

    iput-boolean v4, p1, Ll/ۛܰᩳ;->ۜ:Z

    goto :goto_1

    .line 87
    :cond_7
    iget-object p1, p0, Ll/ۤܰᩳ;->ۗ:Ll/ۛܰᩳ;

    invoke-virtual {p2}, Ll/᩻᩶ᩳ;->readInt()I

    move-result p3

    invoke-virtual {v1, p3}, Ll/֡᩶ᩳ;->֫(I)I

    move-result p3

    iput p3, p1, Ll/ۛܰᩳ;->ۖ:I

    iget-object p1, p0, Ll/ۤܰᩳ;->ۗ:Ll/ۛܰᩳ;

    invoke-virtual {p2}, Ll/᩻᩶ᩳ;->readInt()I

    move-result p3

    invoke-virtual {v1, p3}, Ll/֡᩶ᩳ;->֫(I)I

    move-result p3

    iput p3, p1, Ll/ۛܰᩳ;->ܺ:I

    .line 88
    iget-object p1, p0, Ll/ۤܰᩳ;->ۗ:Ll/ۛܰᩳ;

    iput-boolean v4, p1, Ll/ۛܰᩳ;->᩷:Z

    .line 90
    :goto_1
    invoke-virtual {p2}, Ll/᩻᩶ᩳ;->ᩳ()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 91
    :try_start_4
    invoke-virtual {p2}, Ll/᩻᩶ᩳ;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    goto :goto_5

    .line 76
    :goto_2
    :try_start_5
    invoke-virtual {p2}, Ll/᩻᩶ᩳ;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    goto :goto_3

    :catchall_1
    move-exception p2

    :try_start_6
    invoke-virtual {p1, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_3
    throw p1

    .line 68
    :cond_8
    :goto_4
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 69
    new-instance v2, Ll/ۙۢۢ;

    invoke-direct {v2, p0, v0}, Ll/ۙۢۢ;-><init>(Ll/ۤܰᩳ;Ljava/util/ArrayList;)V

    invoke-virtual {v1, v5, p2, p3, v2}, Ll/֡᩶ᩳ;->֫(Ljava/io/InputStream;JLl/᩵᩶ᩳ;)V

    if-ne p1, v3, :cond_9

    .line 74
    iget-object p1, p0, Ll/ۤܰᩳ;->ۗ:Ll/ۛܰᩳ;

    iput-object v0, p1, Ll/ۛܰᩳ;->ۧ:Ljava/util/ArrayList;

    goto :goto_5

    :cond_9
    iget-object p1, p0, Ll/ۤܰᩳ;->ۗ:Ll/ۛܰᩳ;

    iput-object v0, p1, Ll/ۛܰᩳ;->ܳ:Ljava/util/ArrayList;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 94
    :goto_5
    :try_start_7
    invoke-virtual {p4}, Ljava/io/InputStream;->close()V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_7 .. :try_end_7} :catch_1
    .catch Ljava/lang/Error; {:try_start_7 .. :try_end_7} :catch_0

    return-void

    .line 54
    :cond_a
    :try_start_8
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Invalid or repeated legacy view field"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    :catchall_2
    move-exception p1

    .line 52
    :try_start_9
    invoke-virtual {p4}, Ljava/io/InputStream;->close()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    goto :goto_6

    :catchall_3
    move-exception p2

    :try_start_a
    invoke-virtual {p1, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_6
    throw p1
    :try_end_a
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_a .. :try_end_a} :catch_1
    .catch Ljava/lang/Error; {:try_start_a .. :try_end_a} :catch_0

    :catch_0
    move-exception p1

    goto :goto_7

    :catch_1
    move-exception p1

    goto :goto_7

    :catch_2
    move-exception p1

    .line 94
    :goto_7
    iput-boolean v4, p0, Ll/ۤܰᩳ;->᩹:Z

    throw p1
.end method
