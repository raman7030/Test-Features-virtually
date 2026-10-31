.class public final Ll/᩷ۜ֨;
.super Ll/ۛ᩻֨;
.source "A1RE"


# instance fields
.field public ۗ:Ll/ۛ᩻֨;

.field public ۙ:Z

.field public ۛ:I

.field public final ۤ:[B

.field public final ۫:[B

.field public final ۬:Ljava/io/DataOutputStream;

.field public ᩶:Ljava/io/IOException;

.field public final ᩸:Ll/ۘ᩻֨;

.field public ᩹:Z


# direct methods
.method public constructor <init>(Ll/ۛ᩻֨;Ll/ۘ᩻֨;)V
    .locals 2

    .line 14
    invoke-direct {p0}, Ljava/io/OutputStream;-><init>()V

    const/4 v0, 0x0

    .line 17
    iput v0, p0, Ll/᩷ۜ֨;->ۛ:I

    const/4 v1, 0x1

    .line 18
    iput-boolean v1, p0, Ll/᩷ۜ֨;->᩹:Z

    .line 20
    iput-boolean v0, p0, Ll/᩷ۜ֨;->ۙ:Z

    const/4 v0, 0x0

    .line 21
    iput-object v0, p0, Ll/᩷ۜ֨;->᩶:Ljava/io/IOException;

    new-array v0, v1, [B

    .line 23
    iput-object v0, p0, Ll/᩷ۜ֨;->۫:[B

    .line 33
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    iput-object p1, p0, Ll/᩷ۜ֨;->ۗ:Ll/ۛ᩻֨;

    .line 36
    new-instance v0, Ljava/io/DataOutputStream;

    invoke-direct {v0, p1}, Ljava/io/DataOutputStream;-><init>(Ljava/io/OutputStream;)V

    iput-object v0, p0, Ll/᩷ۜ֨;->۬:Ljava/io/DataOutputStream;

    .line 40
    iput-object p2, p0, Ll/᩷ۜ֨;->᩸:Ll/ۘ᩻֨;

    const/high16 p1, 0x10000

    .line 41
    invoke-virtual {p2, p1}, Ll/ۘ᩻֨;->֫(I)[B

    move-result-object p1

    iput-object p1, p0, Ll/᩷ۜ֨;->ۤ:[B

    return-void
.end method

.method private ֫()V
    .locals 6

    .line 102
    iget-object v0, p0, Ll/᩷ۜ֨;->᩶:Ljava/io/IOException;

    if-nez v0, :cond_3

    .line 105
    iget-boolean v0, p0, Ll/᩷ۜ֨;->ۙ:Z

    if-nez v0, :cond_2

    .line 109
    :try_start_0
    iget v0, p0, Ll/᩷ۜ֨;->ۛ:I
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v1, 0x1

    const/4 v2, 0x0

    iget-object v3, p0, Ll/᩷ۜ֨;->ۤ:[B

    if-lez v0, :cond_1

    .line 95
    :try_start_1
    iget-object v4, p0, Ll/᩷ۜ֨;->۬:Ljava/io/DataOutputStream;

    iget-boolean v5, p0, Ll/᩷ۜ֨;->᩹:Z

    if-eqz v5, :cond_0

    const/4 v5, 0x1

    goto :goto_0

    :cond_0
    const/4 v5, 0x2

    :goto_0
    invoke-virtual {v4, v5}, Ljava/io/DataOutputStream;->writeByte(I)V

    add-int/lit8 v5, v0, -0x1

    .line 96
    invoke-virtual {v4, v5}, Ljava/io/DataOutputStream;->writeShort(I)V

    .line 97
    invoke-virtual {v4, v3, v2, v0}, Ljava/io/DataOutputStream;->write([BII)V

    .line 98
    iput-boolean v2, p0, Ll/᩷ۜ֨;->᩹:Z

    .line 91
    iput v2, p0, Ll/᩷ۜ֨;->ۛ:I

    .line 112
    :cond_1
    iget-object v0, p0, Ll/᩷ۜ֨;->ۗ:Ll/ۛ᩻֨;

    invoke-virtual {v0, v2}, Ljava/io/OutputStream;->write(I)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 118
    iput-boolean v1, p0, Ll/᩷ۜ֨;->ۙ:Z

    .line 119
    iget-object v0, p0, Ll/᩷ۜ֨;->᩸:Ll/ۘ᩻֨;

    invoke-virtual {v0, v3}, Ll/ۘ᩻֨;->֫([B)V

    return-void

    :catch_0
    move-exception v0

    .line 114
    iput-object v0, p0, Ll/᩷ۜ֨;->᩶:Ljava/io/IOException;

    .line 115
    throw v0

    .line 106
    :cond_2
    new-instance v0, Ll/ۖۜ֨;

    const-string v1, "Stream finished or closed"

    .line 20
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 106
    throw v0

    .line 103
    :cond_3
    throw v0
.end method


# virtual methods
.method public final close()V
    .locals 2

    .line 157
    iget-object v0, p0, Ll/᩷ۜ֨;->ۗ:Ll/ۛ᩻֨;

    if-eqz v0, :cond_2

    .line 158
    iget-boolean v0, p0, Ll/᩷ۜ֨;->ۙ:Z

    if-nez v0, :cond_0

    .line 160
    :try_start_0
    invoke-direct {p0}, Ll/᩷ۜ֨;->֫()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 165
    :catch_0
    :cond_0
    :try_start_1
    iget-object v0, p0, Ll/᩷ۜ֨;->ۗ:Ll/ۛ᩻֨;

    invoke-virtual {v0}, Ljava/io/OutputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    :catch_1
    move-exception v0

    .line 167
    iget-object v1, p0, Ll/᩷ۜ֨;->᩶:Ljava/io/IOException;

    if-nez v1, :cond_1

    .line 168
    iput-object v0, p0, Ll/᩷ۜ֨;->᩶:Ljava/io/IOException;

    :cond_1
    :goto_0
    const/4 v0, 0x0

    .line 171
    iput-object v0, p0, Ll/᩷ۜ֨;->ۗ:Ll/ۛ᩻֨;

    .line 174
    :cond_2
    iget-object v0, p0, Ll/᩷ۜ֨;->᩶:Ljava/io/IOException;

    if-nez v0, :cond_3

    return-void

    .line 175
    :cond_3
    throw v0
.end method

.method public final finish()V
    .locals 1

    .line 143
    iget-boolean v0, p0, Ll/᩷ۜ֨;->ۙ:Z

    if-nez v0, :cond_0

    .line 144
    invoke-direct {p0}, Ll/᩷ۜ֨;->֫()V

    .line 147
    :try_start_0
    iget-object v0, p0, Ll/᩷ۜ֨;->ۗ:Ll/ۛ᩻֨;

    invoke-virtual {v0}, Ll/ۛ᩻֨;->finish()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    .line 149
    iput-object v0, p0, Ll/᩷ۜ֨;->᩶:Ljava/io/IOException;

    .line 150
    throw v0

    :cond_0
    return-void
.end method

.method public final flush()V
    .locals 4

    .line 124
    iget-object v0, p0, Ll/᩷ۜ֨;->᩶:Ljava/io/IOException;

    if-nez v0, :cond_3

    .line 127
    iget-boolean v0, p0, Ll/᩷ۜ֨;->ۙ:Z

    if-nez v0, :cond_2

    .line 131
    :try_start_0
    iget v0, p0, Ll/᩷ۜ֨;->ۛ:I

    if-lez v0, :cond_1

    .line 90
    iget-object v1, p0, Ll/᩷ۜ֨;->ۤ:[B

    .line 95
    iget-object v2, p0, Ll/᩷ۜ֨;->۬:Ljava/io/DataOutputStream;

    iget-boolean v3, p0, Ll/᩷ۜ֨;->᩹:Z

    if-eqz v3, :cond_0

    const/4 v3, 0x1

    goto :goto_0

    :cond_0
    const/4 v3, 0x2

    :goto_0
    invoke-virtual {v2, v3}, Ljava/io/DataOutputStream;->writeByte(I)V

    add-int/lit8 v3, v0, -0x1

    .line 96
    invoke-virtual {v2, v3}, Ljava/io/DataOutputStream;->writeShort(I)V

    const/4 v3, 0x0

    .line 97
    invoke-virtual {v2, v1, v3, v0}, Ljava/io/DataOutputStream;->write([BII)V

    .line 98
    iput-boolean v3, p0, Ll/᩷ۜ֨;->᩹:Z

    .line 91
    iput v3, p0, Ll/᩷ۜ֨;->ۛ:I

    .line 134
    :cond_1
    iget-object v0, p0, Ll/᩷ۜ֨;->ۗ:Ll/ۛ᩻֨;

    invoke-virtual {v0}, Ljava/io/OutputStream;->flush()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    .line 136
    iput-object v0, p0, Ll/᩷ۜ֨;->᩶:Ljava/io/IOException;

    .line 137
    throw v0

    .line 128
    :cond_2
    new-instance v0, Ll/ۖۜ֨;

    const-string v1, "Stream finished or closed"

    .line 20
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 128
    throw v0

    .line 125
    :cond_3
    throw v0
.end method

.method public final write(I)V
    .locals 2

    int-to-byte p1, p1

    .line 47
    iget-object v0, p0, Ll/᩷ۜ֨;->۫:[B

    const/4 v1, 0x0

    aput-byte p1, v0, v1

    const/4 p1, 0x1

    .line 48
    invoke-virtual {p0, v0, v1, p1}, Ll/᩷ۜ֨;->write([BII)V

    return-void
.end method

.method public final write([BII)V
    .locals 7

    .line 53
    iget-object v0, p0, Ll/᩷ۜ֨;->ۤ:[B

    if-ltz p2, :cond_7

    if-ltz p3, :cond_7

    add-int v1, p2, p3

    if-ltz v1, :cond_7

    array-length v2, p1

    if-gt v1, v2, :cond_7

    .line 56
    iget-object v1, p0, Ll/᩷ۜ֨;->᩶:Ljava/io/IOException;

    if-nez v1, :cond_6

    .line 59
    iget-boolean v1, p0, Ll/᩷ۜ֨;->ۙ:Z

    if-nez v1, :cond_5

    :goto_0
    if-lez p3, :cond_4

    .line 64
    :try_start_0
    iget v1, p0, Ll/᩷ۜ֨;->ۛ:I

    const/high16 v2, 0x10000

    sub-int v1, v2, v1

    invoke-static {v1, p3}, Ljava/lang/Math;->min(II)I

    move-result v1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v3, 0x0

    const/4 v4, 0x2

    .line 67
    iget-object v5, p0, Ll/᩷ۜ֨;->۬:Ljava/io/DataOutputStream;

    if-ne v1, v2, :cond_1

    .line 95
    :try_start_1
    iget-boolean v2, p0, Ll/᩷ۜ֨;->᩹:Z

    if-eqz v2, :cond_0

    const/4 v4, 0x1

    :cond_0
    invoke-virtual {v5, v4}, Ljava/io/DataOutputStream;->writeByte(I)V

    add-int/lit8 v2, v1, -0x1

    .line 96
    invoke-virtual {v5, v2}, Ljava/io/DataOutputStream;->writeShort(I)V

    .line 97
    invoke-virtual {v5, p1, p2, v1}, Ljava/io/DataOutputStream;->write([BII)V

    .line 98
    iput-boolean v3, p0, Ll/᩷ۜ֨;->᩹:Z

    goto :goto_1

    .line 74
    :cond_1
    iget v6, p0, Ll/᩷ۜ֨;->ۛ:I

    invoke-static {p1, p2, v0, v6, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 75
    iget v6, p0, Ll/᩷ۜ֨;->ۛ:I

    add-int/2addr v6, v1

    iput v6, p0, Ll/᩷ۜ֨;->ۛ:I

    if-ne v6, v2, :cond_3

    .line 95
    iget-boolean v2, p0, Ll/᩷ۜ֨;->᩹:Z

    if-eqz v2, :cond_2

    const/4 v4, 0x1

    :cond_2
    invoke-virtual {v5, v4}, Ljava/io/DataOutputStream;->writeByte(I)V

    add-int/lit8 v2, v6, -0x1

    .line 96
    invoke-virtual {v5, v2}, Ljava/io/DataOutputStream;->writeShort(I)V

    .line 97
    invoke-virtual {v5, v0, v3, v6}, Ljava/io/DataOutputStream;->write([BII)V

    .line 98
    iput-boolean v3, p0, Ll/᩷ۜ֨;->᩹:Z

    .line 91
    iput v3, p0, Ll/᩷ۜ֨;->ۛ:I
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    :cond_3
    :goto_1
    add-int/2addr p2, v1

    sub-int/2addr p3, v1

    goto :goto_0

    :catch_0
    move-exception p1

    .line 84
    iput-object p1, p0, Ll/᩷ۜ֨;->᩶:Ljava/io/IOException;

    .line 85
    throw p1

    :cond_4
    return-void

    .line 60
    :cond_5
    new-instance p1, Ll/ۖۜ֨;

    const-string p2, "Stream finished or closed"

    .line 20
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 60
    throw p1

    .line 57
    :cond_6
    throw v1

    .line 54
    :cond_7
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {p1}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    throw p1
.end method
