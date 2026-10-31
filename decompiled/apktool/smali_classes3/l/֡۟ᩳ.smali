.class public Ll/֡۟ᩳ;
.super Ll/ۤ᩸ᩳ;
.source "66R4"

# interfaces
.implements Ll/۟᩺ᩳ;


# instance fields
.field public ۜ֫:Z

.field public final ۢ֫:Ll/᩻۬ᩳ;

.field public ܳ֫:I

.field public ᩷֫:J

.field public final ᩻֫:Ll/֫ۧܿ;


# direct methods
.method public constructor <init>()V
    .locals 1

    const-string v0, ""

    .line 22
    invoke-direct {p0, v0}, Ll/֡۟ᩳ;-><init>(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/CharSequence;)V
    .locals 1

    .line 25
    invoke-static {p1}, Ll/᩻۬ᩳ;->֫(Ljava/lang/CharSequence;)Ll/᩻۬ᩳ;

    move-result-object v0

    invoke-direct {p0, v0, p1}, Ll/֡۟ᩳ;-><init>(Ll/᩻۬ᩳ;Ljava/lang/CharSequence;)V

    return-void
.end method

.method public constructor <init>(Ll/᩻۬ᩳ;)V
    .locals 1

    const/4 v0, 0x0

    .line 34
    invoke-direct {p0, p1, v0}, Ll/֡۟ᩳ;-><init>(Ll/᩻۬ᩳ;Ljava/lang/CharSequence;)V

    return-void
.end method

.method public constructor <init>(Ll/᩻۬ᩳ;Ljava/lang/CharSequence;)V
    .locals 1

    .line 28
    invoke-direct {p0, p1, p2}, Ll/ۤ᩸ᩳ;-><init>(Ll/᩻۬ᩳ;Ljava/lang/CharSequence;)V

    .line 19
    new-instance p2, Ll/֫ۧܿ;

    new-instance v0, Ll/ۘ۟ᩳ;

    invoke-direct {v0, p0}, Ll/ۘ۟ᩳ;-><init>(Ll/֡۟ᩳ;)V

    invoke-direct {p2, v0}, Ll/֫ۧܿ;-><init>(Ll/۟֫ܿ;)V

    iput-object p2, p0, Ll/֡۟ᩳ;->᩻֫:Ll/֫ۧܿ;

    .line 29
    iput-object p1, p0, Ll/֡۟ᩳ;->ۢ֫:Ll/᩻۬ᩳ;

    .line 30
    invoke-virtual {p1}, Ll/᩻۬ᩳ;->֡()J

    move-result-wide p1

    iput-wide p1, p0, Ll/֡۟ᩳ;->᩷֫:J

    return-void
.end method

.method public static ֫(Ll/֡۟ᩳ;IJLl/ܳۛᩳ;)Ljava/lang/Boolean;
    .locals 2

    .line 77
    invoke-virtual {p0}, Ll/ۤ᩸ᩳ;->֨ۧ()I

    move-result v0

    if-ne v0, p1, :cond_1

    .line 37
    iget-wide v0, p0, Ll/֡۟ᩳ;->᩷֫:J

    cmp-long p1, v0, p2

    if-eqz p1, :cond_0

    goto :goto_0

    .line 78
    :cond_0
    invoke-virtual {p4}, Ll/ܳۛᩳ;->run()V

    .line 80
    iget-object p1, p0, Ll/֡۟ᩳ;->᩻֫:Ll/֫ۧܿ;

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Ll/֫ۧܿ;->֫(Z)V

    const/4 p1, 0x0

    .line 81
    invoke-virtual {p0, p1}, Ll/ۤ᩸ᩳ;->֫(Z)V

    .line 82
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p0

    .line 77
    :cond_1
    :goto_0
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object p0
.end method

.method public static synthetic ֫(Ll/֡۟ᩳ;)Ll/ܽ۬ᩳ;
    .locals 0

    .line 96
    invoke-super {p0}, Ll/ۤ᩸ᩳ;->ۤ֫()Ll/ܽ۬ᩳ;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic ֫(Ll/֡۟ᩳ;IILjava/lang/CharSequence;II)V
    .locals 0

    .line 19
    invoke-super/range {p0 .. p5}, Ll/ۤ᩸ᩳ;->replace(IILjava/lang/CharSequence;II)Ll/ۤ᩸ᩳ;

    return-void
.end method

.method public static ֫(Ll/۬ۜܽ;I)[C
    .locals 5

    .line 143
    invoke-virtual {p0}, Ll/۬ۜܽ;->֫()I

    move-result v0

    if-lt p1, v0, :cond_3

    invoke-virtual {p0}, Ll/۬ۜܽ;->֫()I

    move-result v0

    sub-int v0, p1, v0

    const/16 v1, 0x8

    if-lt v0, v1, :cond_3

    invoke-virtual {p0}, Ll/۬ۜܽ;->֫()I

    move-result v0

    sub-int v0, p1, v0

    int-to-long v0, v0

    invoke-virtual {p0}, Ll/۬ۜܽ;->available()J

    move-result-wide v2

    cmp-long v4, v0, v2

    if-gtz v4, :cond_3

    .line 145
    invoke-virtual {p0}, Ll/۬ۜܽ;->readInt()I

    move-result v0

    const v1, -0x1dcdb2ac

    if-ne v0, v1, :cond_2

    .line 146
    invoke-virtual {p0}, Ll/۬ۜܽ;->readInt()I

    move-result v0

    if-ltz v0, :cond_1

    const-wide/16 v1, 0x2

    int-to-long v3, v0

    mul-long v3, v3, v1

    .line 147
    invoke-virtual {p0}, Ll/۬ۜܽ;->֫()I

    move-result v1

    sub-int/2addr p1, v1

    int-to-long v1, p1

    cmp-long p1, v3, v1

    if-gtz p1, :cond_1

    .line 149
    new-array p1, v0, [C

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    .line 150
    invoke-virtual {p0}, Ll/۬ۜܽ;->᩻()C

    move-result v2

    aput-char v2, p1, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-object p1

    .line 148
    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Invalid memory text length"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 145
    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Invalid memory text magic"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 144
    :cond_3
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Truncated memory text state"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ۧ(Ll/۬ۜܽ;I)Ll/֡۟ᩳ;
    .locals 5

    .line 118
    invoke-virtual {p0}, Ll/۬ۜܽ;->ܽ()I

    move-result v0

    const v1, -0x1dcdb2ac

    if-ne v0, v1, :cond_1

    .line 119
    invoke-static {p0, p1}, Ll/֡۟ᩳ;->֫(Ll/۬ۜܽ;I)[C

    move-result-object v0

    .line 120
    invoke-virtual {p0}, Ll/۬ۜܽ;->֫()I

    move-result p0

    if-ne p0, p1, :cond_0

    .line 121
    new-instance p0, Ll/֡۟ᩳ;

    invoke-static {v0}, Ljava/nio/CharBuffer;->wrap([C)Ljava/nio/CharBuffer;

    move-result-object p1

    invoke-direct {p0, p1}, Ll/֡۟ᩳ;-><init>(Ljava/lang/CharSequence;)V

    return-object p0

    .line 120
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Trailing memory text state bytes"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 123
    :cond_1
    invoke-virtual {p0}, Ll/۬ۜܽ;->֫()I

    move-result v0

    add-int/lit8 v0, v0, 0x4

    if-lt p1, v0, :cond_3

    invoke-virtual {p0}, Ll/۬ۜܽ;->֫()I

    move-result v0

    sub-int v0, p1, v0

    int-to-long v0, v0

    invoke-virtual {p0}, Ll/۬ۜܽ;->available()J

    move-result-wide v2

    cmp-long v4, v0, v2

    if-gtz v4, :cond_3

    invoke-virtual {p0}, Ll/۬ۜܽ;->readInt()I

    move-result v0

    const v1, -0x1cccb2ac

    if-ne v0, v1, :cond_3

    const-string v0, ""

    .line 125
    invoke-static {v0}, Ll/᩻۬ᩳ;->֫(Ljava/lang/CharSequence;)Ll/᩻۬ᩳ;

    move-result-object v0

    .line 126
    :try_start_0
    invoke-static {p0}, Ll/᩻۬ᩳ;->֫(Ll/۬ۜܽ;)Ll/ܳ۬ᩳ;

    move-result-object v1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_0

    .line 127
    :try_start_1
    invoke-virtual {p0}, Ll/۬ۜܽ;->֫()I

    move-result p0

    if-ne p0, p1, :cond_2

    .line 128
    invoke-virtual {v0, v1}, Ll/᩻۬ᩳ;->֫(Ll/ܳ۬ᩳ;)V

    .line 129
    new-instance p0, Ll/֡۟ᩳ;

    const/4 p1, 0x0

    .line 34
    invoke-direct {p0, v0, p1}, Ll/֡۟ᩳ;-><init>(Ll/᩻۬ᩳ;Ljava/lang/CharSequence;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 130
    :try_start_2
    invoke-virtual {v1}, Ll/ܳ۬ᩳ;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/Error; {:try_start_2 .. :try_end_2} :catch_0

    return-object p0

    .line 127
    :cond_2
    :try_start_3
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Trailing memory session state bytes"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :catchall_0
    move-exception p0

    .line 126
    :try_start_4
    invoke-virtual {v1}, Ll/ܳ۬ᩳ;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception p1

    :try_start_5
    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw p0
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_5 .. :try_end_5} :catch_1
    .catch Ljava/lang/Error; {:try_start_5 .. :try_end_5} :catch_0

    :catch_0
    move-exception p0

    goto :goto_1

    :catch_1
    move-exception p0

    .line 132
    :goto_1
    invoke-virtual {v0}, Ll/᩻۬ᩳ;->֫()Ll/ۗ᩻᩵;

    throw p0

    :catch_2
    move-exception p0

    .line 131
    invoke-virtual {v0}, Ll/᩻۬ᩳ;->֫()Ll/ۗ᩻᩵;

    new-instance p1, Ljava/io/UncheckedIOException;

    invoke-direct {p1, p0}, Ljava/io/UncheckedIOException;-><init>(Ljava/io/IOException;)V

    throw p1

    .line 124
    :cond_3
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Invalid memory session state"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static synthetic ۧ(Ll/֡۟ᩳ;)Ll/ܽ۬ᩳ;
    .locals 0

    .line 100
    invoke-super {p0}, Ll/ۤ᩸ᩳ;->ۗ֫()Ll/ܽ۬ᩳ;

    move-result-object p0

    return-object p0
.end method

.method public static ܽ(Ll/֡۟ᩳ;)Ll/֡۟ᩳ;
    .locals 5

    const-string v0, ""

    .line 55
    invoke-static {v0}, Ll/᩻۬ᩳ;->֫(Ljava/lang/CharSequence;)Ll/᩻۬ᩳ;

    move-result-object v0

    .line 36
    :try_start_0
    iget-object v1, p0, Ll/֡۟ᩳ;->ۢ֫:Ll/᩻۬ᩳ;

    .line 56
    invoke-virtual {v1}, Ll/᩻۬ᩳ;->᩻()Ll/ܳ۬ᩳ;

    move-result-object v1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_0

    .line 57
    :try_start_1
    invoke-virtual {v0, v1}, Ll/᩻۬ᩳ;->֫(Ll/ܳ۬ᩳ;)V

    .line 58
    new-instance v2, Ll/֡۟ᩳ;

    const/4 v3, 0x0

    .line 34
    invoke-direct {v2, v0, v3}, Ll/֡۟ᩳ;-><init>(Ll/᩻۬ᩳ;Ljava/lang/CharSequence;)V

    .line 37
    iget-wide v3, p0, Ll/֡۟ᩳ;->᩷֫:J

    .line 59
    invoke-virtual {v2, v3, v4}, Ll/֡۟ᩳ;->ᩳ(J)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 61
    :try_start_2
    invoke-virtual {v1}, Ll/ܳ۬ᩳ;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/Error; {:try_start_2 .. :try_end_2} :catch_0

    return-object v2

    :catchall_0
    move-exception p0

    .line 56
    :try_start_3
    invoke-virtual {v1}, Ll/ܳ۬ᩳ;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v1

    :try_start_4
    invoke-virtual {p0, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw p0
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/lang/Error; {:try_start_4 .. :try_end_4} :catch_0

    :catch_0
    move-exception p0

    goto :goto_1

    :catch_1
    move-exception p0

    goto :goto_1

    :catch_2
    move-exception p0

    .line 62
    :goto_1
    invoke-virtual {v0}, Ll/᩻۬ᩳ;->֫()Ll/ۗ᩻᩵;

    .line 63
    throw p0
.end method


# virtual methods
.method public close()V
    .locals 2

    .line 167
    invoke-virtual {p0}, Ll/ۤ᩸ᩳ;->ᩳ()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ll/۟ۤᩳ;

    const/4 v1, 0x3

    invoke-direct {v0, v1, p0}, Ll/۟ۤᩳ;-><init>(ILjava/lang/Object;)V

    invoke-static {v0}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;)V

    return-void

    .line 168
    :cond_0
    new-instance v0, Ll/֫ۛᩳ;

    const/4 v1, 0x1

    invoke-direct {v0, v1, p0}, Ll/֫ۛᩳ;-><init>(ILjava/lang/Object;)V

    iget-object v1, p0, Ll/֡۟ᩳ;->᩻֫:Ll/֫ۧܿ;

    invoke-virtual {v1, v0}, Ll/֫ۧܿ;->֫(Ll/֫ۛᩳ;)V

    return-void
.end method

.method public final isChanged()Z
    .locals 5

    .line 39
    invoke-virtual {p0}, Ll/ۤ᩸ᩳ;->֫()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Ll/֡۟ᩳ;->ۜ֫:Z

    return v0

    .line 40
    :cond_0
    :try_start_0
    iget-wide v0, p0, Ll/֡۟ᩳ;->᩷֫:J

    iget-object v2, p0, Ll/֡۟ᩳ;->ۢ֫:Ll/᩻۬ᩳ;

    invoke-virtual {v2}, Ll/᩻۬ᩳ;->֡()J

    move-result-wide v2
    :try_end_0
    .catch Ll/֫᩹ᩳ; {:try_start_0 .. :try_end_0} :catch_0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_1

    const/4 v0, 0x1

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0

    :catch_0
    move-exception v0

    .line 42
    invoke-virtual {p0}, Ll/ۤ᩸ᩳ;->֫()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 43
    iget-boolean v0, p0, Ll/֡۟ᩳ;->ۜ֫:Z

    return v0

    .line 42
    :cond_2
    throw v0
.end method

.method public final replace(IILjava/lang/CharSequence;II)Landroid/text/Editable;
    .locals 9

    .line 91
    iget v0, p0, Ll/֡۟ᩳ;->ܳ֫:I

    if-nez v0, :cond_0

    iget-object v0, p0, Ll/֡۟ᩳ;->᩻֫:Ll/֫ۧܿ;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v8, Ll/ܰ֫ܿ;

    move-object v1, v8

    move-object v2, v0

    move v3, p1

    move v4, p2

    move-object v5, p3

    move v6, p4

    move v7, p5

    invoke-direct/range {v1 .. v7}, Ll/ܰ֫ܿ;-><init>(Ll/֫ۧܿ;IILjava/lang/CharSequence;II)V

    const/4 p1, 0x0

    invoke-virtual {v0, p1, v8}, Ll/֫ۧܿ;->֫(Ljava/lang/Object;Ljava/util/function/Supplier;)Ljava/lang/Object;

    :cond_0
    return-object p0
.end method

.method public final replace(IILjava/lang/CharSequence;II)Ll/ۤ᩸ᩳ;
    .locals 9

    .line 91
    iget v0, p0, Ll/֡۟ᩳ;->ܳ֫:I

    if-nez v0, :cond_0

    iget-object v0, p0, Ll/֡۟ᩳ;->᩻֫:Ll/֫ۧܿ;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v8, Ll/ܰ֫ܿ;

    move-object v1, v8

    move-object v2, v0

    move v3, p1

    move v4, p2

    move-object v5, p3

    move v6, p4

    move v7, p5

    invoke-direct/range {v1 .. v7}, Ll/ܰ֫ܿ;-><init>(Ll/֫ۧܿ;IILjava/lang/CharSequence;II)V

    const/4 p1, 0x0

    invoke-virtual {v0, p1, v8}, Ll/֫ۧܿ;->֫(Ljava/lang/Object;Ljava/util/function/Supplier;)Ljava/lang/Object;

    :cond_0
    return-object p0
.end method

.method public final setReadOnly(Z)V
    .locals 1

    .line 67
    iget-object v0, p0, Ll/֡۟ᩳ;->᩻֫:Ll/֫ۧܿ;

    invoke-virtual {v0, p1}, Ll/֫ۧܿ;->֫(Z)V

    return-void
.end method

.method public final ֡ۧ()I
    .locals 1

    .line 87
    iget v0, p0, Ll/֡۟ᩳ;->ܳ֫:I

    return v0
.end method

.method public final ֫(I)V
    .locals 0

    .line 86
    iput p1, p0, Ll/֡۟ᩳ;->ܳ֫:I

    return-void
.end method

.method public synthetic ֫(Ll/۟᩹ᩳ;)V
    .locals 0

    return-void
.end method

.method public ֫(Ll/ۤۜܽ;)V
    .locals 1

    const v0, -0x1cccb2ac

    .line 110
    invoke-virtual {p1, v0}, Ll/ۤۜܽ;->writeInt(I)V

    .line 111
    iget-object v0, p0, Ll/֡۟ᩳ;->ۢ֫:Ll/᩻۬ᩳ;

    invoke-virtual {v0}, Ll/᩻۬ᩳ;->᩻()Ll/ܳ۬ᩳ;

    move-result-object v0

    :try_start_0
    invoke-virtual {v0, p1}, Ll/ܳ۬ᩳ;->֫(Ll/ۤۜܽ;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v0}, Ll/ܳ۬ᩳ;->close()V

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    invoke-virtual {v0}, Ll/ܳ۬ᩳ;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v0

    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw p1
.end method

.method public final ֫(IJLl/ܳۛᩳ;)Z
    .locals 7

    .line 76
    new-instance v6, Ll/ᩴ۟ᩳ;

    move-object v0, v6

    move-object v1, p0

    move v2, p1

    move-wide v3, p2

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Ll/ᩴ۟ᩳ;-><init>(Ll/֡۟ᩳ;IJLl/ܳۛᩳ;)V

    .line 83
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 76
    iget-object p2, p0, Ll/֡۟ᩳ;->᩻֫:Ll/֫ۧܿ;

    invoke-virtual {p2, p1, v6}, Ll/֫ۧܿ;->֫(Ljava/lang/Object;Ljava/util/function/Supplier;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    return p1
.end method

.method public final ֫(Ljava/lang/Runnable;)Z
    .locals 2

    .line 104
    iget v0, p0, Ll/֡۟ᩳ;->ܳ֫:I

    if-nez v0, :cond_0

    new-instance v0, Ll/᩵۟ᩳ;

    invoke-direct {v0, p0, p1}, Ll/᩵۟ᩳ;-><init>(Ll/֡۟ᩳ;Ljava/lang/Runnable;)V

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iget-object v1, p0, Ll/֡۟ᩳ;->᩻֫:Ll/֫ۧܿ;

    invoke-virtual {v1, p1, v0}, Ll/֫ۧܿ;->֫(Ljava/lang/Object;Ljava/util/function/Supplier;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ۗ֫()Ll/ܽ۬ᩳ;
    .locals 3

    .line 100
    new-instance v0, Ll/ۖ۟ᩳ;

    invoke-direct {v0, p0}, Ll/ۖ۟ᩳ;-><init>(Ll/֡۟ᩳ;)V

    sget-object v1, Ll/ܽ۬ᩳ;->ۙ:Ll/ܽ۬ᩳ;

    iget-object v2, p0, Ll/֡۟ᩳ;->᩻֫:Ll/֫ۧܿ;

    invoke-virtual {v2, v1, v0}, Ll/֫ۧܿ;->֫(Ljava/lang/Object;Ljava/util/function/Supplier;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܽ۬ᩳ;

    return-object v0
.end method

.method public ۘ()V
    .locals 2

    .line 173
    invoke-virtual {p0}, Ll/֡۟ᩳ;->isChanged()Z

    move-result v0

    iput-boolean v0, p0, Ll/֡۟ᩳ;->ۜ֫:Z

    .line 174
    invoke-super {p0}, Ll/ۤ᩸ᩳ;->close()V

    .line 175
    iget-object v0, p0, Ll/֡۟ᩳ;->ۢ֫:Ll/᩻۬ᩳ;

    invoke-virtual {v0}, Ll/᩻۬ᩳ;->᩶()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v0}, Ll/᩻۬ᩳ;->֫()Ll/ۗ᩻᩵;

    :cond_0
    return-void
.end method

.method public final ۤ֫()Ll/ܽ۬ᩳ;
    .locals 3

    .line 96
    new-instance v0, Ll/ܺ۟ᩳ;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p0}, Ll/ܺ۟ᩳ;-><init>(ILjava/lang/Object;)V

    sget-object v1, Ll/ܽ۬ᩳ;->ۙ:Ll/ܽ۬ᩳ;

    iget-object v2, p0, Ll/֡۟ᩳ;->᩻֫:Ll/֫ۧܿ;

    invoke-virtual {v2, v1, v0}, Ll/֫ۧܿ;->֫(Ljava/lang/Object;Ljava/util/function/Supplier;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܽ۬ᩳ;

    return-object v0
.end method

.method public final ۧ(Z)V
    .locals 2

    .line 47
    invoke-virtual {p0}, Ll/ۤ᩸ᩳ;->֫()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    if-eqz p1, :cond_1

    const-wide/16 v0, -0x1

    goto :goto_0

    .line 48
    :cond_1
    :try_start_0
    iget-object p1, p0, Ll/֡۟ᩳ;->ۢ֫:Ll/᩻۬ᩳ;

    invoke-virtual {p1}, Ll/᩻۬ᩳ;->֡()J

    move-result-wide v0

    :goto_0
    iput-wide v0, p0, Ll/֡۟ᩳ;->᩷֫:J
    :try_end_0
    .catch Ll/֫᩹ᩳ; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 49
    invoke-virtual {p0}, Ll/ۤ᩸ᩳ;->֫()Z

    move-result v0

    if-eqz v0, :cond_2

    :goto_1
    return-void

    :cond_2
    throw p1
.end method

.method public final ܳۧ()Ll/᩻۬ᩳ;
    .locals 1

    .line 36
    iget-object v0, p0, Ll/֡۟ᩳ;->ۢ֫:Ll/᩻۬ᩳ;

    return-object v0
.end method

.method public ܺۧ()V
    .locals 0

    return-void
.end method

.method public final ᩳ(J)V
    .locals 1

    .line 51
    invoke-virtual {p0}, Ll/ۤ᩸ᩳ;->֫()Z

    move-result v0

    if-nez v0, :cond_0

    iput-wide p1, p0, Ll/֡۟ᩳ;->᩷֫:J

    :cond_0
    return-void
.end method

.method public final ᩴ()Ll/ۗ᩻᩵;
    .locals 1

    .line 72
    iget-object v0, p0, Ll/֡۟ᩳ;->᩻֫:Ll/֫ۧܿ;

    invoke-virtual {v0}, Ll/֫ۧܿ;->ᩳ()Ll/ۗ᩻᩵;

    move-result-object v0

    return-object v0
.end method

.method public final ᩵֫()Z
    .locals 1

    .line 69
    iget-object v0, p0, Ll/֡۟ᩳ;->᩻֫:Ll/֫ۧܿ;

    invoke-virtual {v0}, Ll/֫ۧܿ;->ۧ()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Ll/ۤ᩸ᩳ;->ᩳ()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public final ᩶()J
    .locals 2

    .line 37
    iget-wide v0, p0, Ll/֡۟ᩳ;->᩷֫:J

    return-wide v0
.end method

.method public synthetic ᩸֫()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public ᩹֫()V
    .locals 1

    const/4 v0, 0x1

    .line 43
    invoke-interface {p0, v0}, Ll/۟᩺ᩳ;->֫(Z)V

    return-void
.end method
