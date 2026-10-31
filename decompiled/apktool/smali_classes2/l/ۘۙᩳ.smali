.class public final Ll/ۘۙᩳ;
.super Ljava/io/Reader;
.source "U6QB"


# instance fields
.field public ۙ:Ljava/io/Reader;

.field public ᩶:Z

.field public ᩸:Z

.field public ᩹:I


# direct methods
.method public constructor <init>(Ljava/io/Reader;)V
    .locals 0

    .line 16
    invoke-direct {p0}, Ljava/io/Reader;-><init>()V

    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Ll/ۘۙᩳ;->ۙ:Ljava/io/Reader;

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 2

    .line 96
    iget-object v0, p0, Ll/ۘۙᩳ;->ۙ:Ljava/io/Reader;

    const/4 v1, 0x0

    .line 97
    iput-object v1, p0, Ll/ۘۙᩳ;->ۙ:Ljava/io/Reader;

    if-eqz v0, :cond_0

    .line 98
    invoke-virtual {v0}, Ljava/io/Reader;->close()V

    :cond_0
    return-void
.end method

.method public final read()I
    .locals 8

    .line 23
    iget-object v0, p0, Ll/ۘۙᩳ;->ۙ:Ljava/io/Reader;

    if-eqz v0, :cond_9

    .line 24
    iget-boolean v0, p0, Ll/ۘۙᩳ;->᩸:Z

    const/4 v1, -0x1

    if-eqz v0, :cond_0

    return v1

    .line 26
    :cond_0
    :goto_0
    iget-object v0, p0, Ll/ۘۙᩳ;->ۙ:Ljava/io/Reader;

    invoke-virtual {v0}, Ljava/io/Reader;->read()I

    move-result v0

    const/4 v2, 0x0

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-ne v0, v1, :cond_3

    .line 28
    iget v0, p0, Ll/ۘۙᩳ;->᩹:I

    if-nez v0, :cond_2

    iget-boolean v0, p0, Ll/ۘۙᩳ;->᩶:Z

    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    const/4 v3, 0x1

    :goto_1
    iput v3, p0, Ll/ۘۙᩳ;->᩹:I

    .line 29
    :cond_2
    iput-boolean v2, p0, Ll/ۘۙᩳ;->᩶:Z

    .line 30
    iput-boolean v4, p0, Ll/ۘۙᩳ;->᩸:Z

    return v1

    .line 33
    :cond_3
    iget-boolean v5, p0, Ll/ۘۙᩳ;->᩶:Z

    const/16 v6, 0xd

    const/16 v7, 0xa

    if-eqz v5, :cond_7

    .line 34
    iput-boolean v2, p0, Ll/ۘۙᩳ;->᩶:Z

    .line 35
    iget v2, p0, Ll/ۘۙᩳ;->᩹:I

    if-nez v2, :cond_5

    if-ne v0, v7, :cond_4

    const/4 v3, 0x3

    :cond_4
    iput v3, p0, Ll/ۘۙᩳ;->᩹:I

    :cond_5
    if-ne v0, v7, :cond_6

    goto :goto_0

    :cond_6
    if-ne v0, v6, :cond_8

    return v7

    :cond_7
    if-ne v0, v6, :cond_8

    .line 41
    iput-boolean v4, p0, Ll/ۘۙᩳ;->᩶:Z

    return v7

    :cond_8
    return v0

    .line 23
    :cond_9
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Line normalizer is closed"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final read([CII)I
    .locals 10

    .line 50
    iget-object v0, p0, Ll/ۘۙᩳ;->ۙ:Ljava/io/Reader;

    if-eqz v0, :cond_12

    .line 51
    invoke-static {p1, p2, p3}, Ll/۬᩹ᩳ;->֫([CII)V

    const/4 v0, 0x0

    if-nez p3, :cond_0

    return v0

    .line 53
    :cond_0
    iget-boolean v1, p0, Ll/ۘۙᩳ;->᩸:Z

    const/4 v2, -0x1

    if-eqz v1, :cond_1

    goto/16 :goto_7

    :cond_1
    const/4 v1, 0x0

    :cond_2
    if-ge v1, p3, :cond_10

    .line 56
    iget-object v3, p0, Ll/ۘۙᩳ;->ۙ:Ljava/io/Reader;

    add-int v4, p2, v1

    sub-int v5, p3, v1

    invoke-virtual {v3, p1, v4, v5}, Ljava/io/Reader;->read([CII)I

    move-result v3

    const/4 v6, 0x2

    const/4 v7, 0x1

    if-ne v3, v2, :cond_5

    .line 58
    iget p1, p0, Ll/ۘۙᩳ;->᩹:I

    if-nez p1, :cond_4

    iget-boolean p1, p0, Ll/ۘۙᩳ;->᩶:Z

    if-eqz p1, :cond_3

    goto :goto_0

    :cond_3
    const/4 v6, 0x1

    :goto_0
    iput v6, p0, Ll/ۘۙᩳ;->᩹:I

    .line 59
    :cond_4
    iput-boolean v0, p0, Ll/ۘۙᩳ;->᩶:Z

    .line 60
    iput-boolean v7, p0, Ll/ۘۙᩳ;->᩸:Z

    goto/16 :goto_6

    :cond_5
    if-lez v3, :cond_f

    if-gt v3, v5, :cond_f

    add-int/2addr v3, v4

    :goto_1
    if-ge v4, v3, :cond_2

    .line 68
    iget-boolean v5, p0, Ll/ۘۙᩳ;->᩶:Z

    const/16 v6, 0xd

    const/16 v8, 0xa

    if-eqz v5, :cond_b

    add-int/lit8 v5, v4, 0x1

    .line 69
    aget-char v4, p1, v4

    .line 70
    iput-boolean v0, p0, Ll/ۘۙᩳ;->᩶:Z

    .line 71
    iget v9, p0, Ll/ۘۙᩳ;->᩹:I

    if-nez v9, :cond_7

    if-ne v4, v8, :cond_6

    const/4 v9, 0x3

    goto :goto_2

    :cond_6
    const/4 v9, 0x2

    :goto_2
    iput v9, p0, Ll/ۘۙᩳ;->᩹:I

    :cond_7
    if-ne v4, v8, :cond_9

    :cond_8
    :goto_3
    move v4, v5

    goto :goto_1

    :cond_9
    add-int/lit8 v9, v1, 0x1

    add-int/2addr v1, p2

    if-ne v4, v6, :cond_a

    goto :goto_4

    :cond_a
    move v8, v4

    .line 73
    :goto_4
    aput-char v8, p1, v1

    move v4, v5

    move v1, v9

    goto :goto_1

    :cond_b
    move v5, v4

    :goto_5
    if-ge v5, v3, :cond_c

    .line 78
    aget-char v9, p1, v5

    if-eq v9, v6, :cond_c

    add-int/lit8 v5, v5, 0x1

    goto :goto_5

    :cond_c
    sub-int v6, v5, v4

    if-eqz v6, :cond_e

    add-int v9, p2, v1

    if-eq v9, v4, :cond_d

    .line 81
    invoke-static {p1, v4, p1, v9, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_d
    add-int/2addr v1, v6

    :cond_e
    if-ge v5, v3, :cond_8

    add-int/lit8 v5, v5, 0x1

    add-int/lit8 v4, v1, 0x1

    add-int/2addr v1, p2

    .line 86
    aput-char v8, p1, v1

    .line 87
    iput-boolean v7, p0, Ll/ۘۙᩳ;->᩶:Z

    move v1, v4

    goto :goto_3

    .line 63
    :cond_f
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Text normalizer input made invalid progress"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_10
    :goto_6
    if-nez v1, :cond_11

    :goto_7
    return v2

    :cond_11
    return v1

    .line 50
    :cond_12
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Line normalizer is closed"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫()I
    .locals 1

    .line 18
    iget v0, p0, Ll/ۘۙᩳ;->᩹:I

    return v0
.end method

.method public final ܽ()Z
    .locals 1

    .line 19
    iget-boolean v0, p0, Ll/ۘۙᩳ;->᩶:Z

    return v0
.end method
