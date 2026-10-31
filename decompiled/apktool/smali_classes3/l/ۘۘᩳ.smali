.class public final Ll/ۘۘᩳ;
.super Ljava/lang/Object;
.source "I6TG"

# interfaces
.implements Ll/ᩳ᩶ᩳ;
.implements Ljava/lang/AutoCloseable;


# instance fields
.field public final ۗ:I

.field public ۙ:I

.field public ۛ:Ll/ۗܰᩳ;

.field public ۤ:Ll/ۙܰᩳ;

.field public final ۨ:Ll/۫᩹ᩳ;

.field public ۫:Ll/ۛۘᩳ;

.field public ۬:I

.field public ᩶:Ll/᩵ۘᩳ;

.field public ᩸:[B

.field public ᩹:[B

.field public ᩺:Ll/ۤܰᩳ;


# direct methods
.method public constructor <init>(Ll/۫᩹ᩳ;I)V
    .locals 0

    .line 70
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۘۘᩳ;->ۨ:Ll/۫᩹ᩳ;

    iput p2, p0, Ll/ۘۘᩳ;->ۗ:I

    return-void
.end method

.method private ֫(JLjava/io/InputStream;)[B
    .locals 3

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-ltz v2, :cond_2

    .line 91
    iget v0, p0, Ll/ۘۘᩳ;->ۗ:I

    int-to-long v0, v0

    cmp-long v2, p1, v0

    if-gtz v2, :cond_2

    long-to-int p2, p1

    .line 92
    new-array p1, p2, [B

    const/4 v0, 0x0

    :goto_0
    if-ge v0, p2, :cond_1

    sub-int v1, p2, v0

    .line 95
    invoke-virtual {p3, p1, v0, v1}, Ljava/io/InputStream;->read([BII)I

    move-result v1

    if-lez v1, :cond_0

    add-int/2addr v0, v1

    goto :goto_0

    .line 96
    :cond_0
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Truncated migration app field"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    return-object p1

    .line 91
    :cond_2
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Migration app field exceeds limit"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static bridge synthetic ֫(Ll/ۘۘᩳ;)[B
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۘۘᩳ;->᩸:[B

    return-object p0
.end method

.method public static bridge synthetic ۧ(Ll/ۘۘᩳ;)[B
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۘۘᩳ;->᩹:[B

    return-object p0
.end method

.method public static bridge synthetic ܽ(Ll/ۘۘᩳ;)Ll/᩵ۘᩳ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۘۘᩳ;->᩶:Ll/᩵ۘᩳ;

    return-object p0
.end method

.method public static bridge synthetic ܿ(Ll/ۘۘᩳ;)Ll/ۤܰᩳ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۘۘᩳ;->᩺:Ll/ۤܰᩳ;

    return-object p0
.end method

.method public static bridge synthetic ᩳ(Ll/ۘۘᩳ;)Ll/ۛۘᩳ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۘۘᩳ;->۫:Ll/ۛۘᩳ;

    return-object p0
.end method


# virtual methods
.method public final close()V
    .locals 1

    .line 110
    iget-object v0, p0, Ll/ۘۘᩳ;->᩺:Ll/ۤܰᩳ;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ll/ۤܰᩳ;->close()V

    :cond_0
    return-void
.end method

.method public final ֫()V
    .locals 5

    .line 102
    iget-object v0, p0, Ll/ۘۘᩳ;->᩶:Ll/᩵ۘᩳ;

    if-eqz v0, :cond_3

    iget-object v1, p0, Ll/ۘۘᩳ;->۫:Ll/ۛۘᩳ;

    if-eqz v1, :cond_3

    iget-object v1, p0, Ll/ۘۘᩳ;->ۛ:Ll/ۗܰᩳ;

    if-eqz v1, :cond_3

    iget-object v1, p0, Ll/ۘۘᩳ;->ۤ:Ll/ۙܰᩳ;

    if-eqz v1, :cond_3

    iget-object v1, p0, Ll/ۘۘᩳ;->᩺:Ll/ۤܰᩳ;

    if-eqz v1, :cond_3

    .line 105
    invoke-virtual {v0}, Ll/᩵ۘᩳ;->֫()I

    move-result v0

    if-nez v0, :cond_0

    iget v0, p0, Ll/ۘۘᩳ;->۬:I

    if-nez v0, :cond_1

    :cond_0
    iget-object v0, p0, Ll/ۘۘᩳ;->᩶:Ll/᩵ۘᩳ;

    .line 106
    invoke-virtual {v0}, Ll/᩵ۘᩳ;->֫()I

    move-result v0

    iget-object v1, p0, Ll/ۘۘᩳ;->᩶:Ll/᩵ۘᩳ;

    invoke-virtual {v1}, Ll/᩵ۘᩳ;->ᩳ()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    if-ne v0, v1, :cond_2

    iget v0, p0, Ll/ۘۘᩳ;->۬:I

    int-to-long v0, v0

    iget v2, p0, Ll/ۘۘᩳ;->ۙ:I

    int-to-long v2, v2

    add-long/2addr v0, v2

    iget-object v2, p0, Ll/ۘۘᩳ;->ۨ:Ll/۫᩹ᩳ;

    invoke-virtual {v2}, Ll/۬᩹ᩳ;->length()I

    move-result v2

    int-to-long v2, v2

    cmp-long v4, v0, v2

    if-nez v4, :cond_1

    goto :goto_0

    .line 107
    :cond_1
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Migration page range disagrees with fragment manifest"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    :goto_0
    return-void

    .line 103
    :cond_3
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Incomplete migration app fields"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ֫(II)V
    .locals 6

    if-ltz p2, :cond_0

    int-to-long v0, p1

    int-to-long v2, p2

    add-long/2addr v0, v2

    .line 73
    iget-object v2, p0, Ll/ۘۘᩳ;->ۨ:Ll/۫᩹ᩳ;

    invoke-virtual {v2}, Ll/۬᩹ᩳ;->length()I

    move-result v3

    int-to-long v3, v3

    cmp-long v5, v0, v3

    if-gtz v5, :cond_0

    .line 74
    iput p1, p0, Ll/ۘۘᩳ;->۬:I

    iput p2, p0, Ll/ۘۘᩳ;->ۙ:I

    .line 75
    new-instance v0, Ll/ۤܰᩳ;

    iget v1, p0, Ll/ۘۘᩳ;->ۗ:I

    invoke-direct {v0, v2, p1, p2, v1}, Ll/ۤܰᩳ;-><init>(Ll/۫᩹ᩳ;III)V

    iput-object v0, p0, Ll/ۘۘᩳ;->᩺:Ll/ۤܰᩳ;

    return-void

    .line 73
    :cond_0
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Invalid migration page range"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(IJLjava/io/InputStream;)V
    .locals 2

    const/16 v0, 0x105

    .line 78
    iget v1, p0, Ll/ۘۘᩳ;->ۗ:I

    if-eq p1, v0, :cond_0

    packed-switch p1, :pswitch_data_0

    .line 87
    iget-object v0, p0, Ll/ۘۘᩳ;->᩺:Ll/ۤܰᩳ;

    invoke-virtual {v0, p1, p2, p3, p4}, Ll/ۤܰᩳ;->֫(IJLjava/io/InputStream;)V

    return-void

    .line 85
    :pswitch_0
    invoke-direct {p0, p2, p3, p4}, Ll/ۘۘᩳ;->֫(JLjava/io/InputStream;)[B

    move-result-object p1

    iput-object p1, p0, Ll/ۘۘᩳ;->᩸:[B

    .line 86
    new-instance p1, Ljava/io/ByteArrayInputStream;

    iget-object p4, p0, Ll/ۘۘᩳ;->᩸:[B

    invoke-direct {p1, p4}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    invoke-static {p1, p2, p3, v1}, Ll/ۙܰᩳ;->֫(Ljava/io/ByteArrayInputStream;JI)Ll/ۙܰᩳ;

    move-result-object p1

    iput-object p1, p0, Ll/ۘۘᩳ;->ۤ:Ll/ۙܰᩳ;

    return-void

    .line 82
    :pswitch_1
    invoke-direct {p0, p2, p3, p4}, Ll/ۘۘᩳ;->֫(JLjava/io/InputStream;)[B

    move-result-object p1

    iput-object p1, p0, Ll/ۘۘᩳ;->᩹:[B

    .line 83
    new-instance p1, Ljava/io/ByteArrayInputStream;

    iget-object p4, p0, Ll/ۘۘᩳ;->᩹:[B

    invoke-direct {p1, p4}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    invoke-static {p1, p2, p3, v1}, Ll/ۗܰᩳ;->֫(Ljava/io/ByteArrayInputStream;JI)Ll/ۗܰᩳ;

    move-result-object p1

    iput-object p1, p0, Ll/ۘۘᩳ;->ۛ:Ll/ۗܰᩳ;

    return-void

    .line 80
    :pswitch_2
    invoke-static {v1, p2, p3, p4}, Ll/ۛۘᩳ;->֫(IJLjava/io/InputStream;)Ll/ۛۘᩳ;

    move-result-object p1

    iput-object p1, p0, Ll/ۘۘᩳ;->۫:Ll/ۛۘᩳ;

    return-void

    .line 79
    :cond_0
    invoke-static {v1, p2, p3, p4}, Ll/᩵ۘᩳ;->֫(IJLjava/io/InputStream;)Ll/᩵ۘᩳ;

    move-result-object p1

    iput-object p1, p0, Ll/ۘۘᩳ;->᩶:Ll/᩵ۘᩳ;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x100
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
