.class public final Ll/ۡ᩶ᩳ;
.super Ljava/lang/Object;
.source "A6SP"

# interfaces
.implements Ljava/lang/AutoCloseable;


# instance fields
.field public ֫֫:Ll/ۚۗᩳ;

.field public final ۗ:Ljava/nio/channels/FileChannel;

.field public ۙ:I

.field public ۛ:Ll/ۢ᩶ᩳ;

.field public ۟:Ll/ۢ᩶ᩳ;

.field public ۤ:Ll/ۢ᩶ᩳ;

.field public ۧ֫:Ll/ۢ᩶ᩳ;

.field public final ۨ:[Ll/ۢ᩶ᩳ;

.field public ۫:I

.field public ۬:Ll/ۢ᩶ᩳ;

.field public final ܰ:Ll/᩷۠ᩴ;

.field public ᩶:I

.field public ᩸:Ll/ۢ᩶ᩳ;

.field public ᩹:Z

.field public final ᩺:Ll/ۚ۬ᩳ;


# direct methods
.method public constructor <init>(Ll/᩷۠ᩴ;Ljava/nio/channels/FileChannel;Ll/ۚ۬ᩳ;)V
    .locals 2

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0xff

    new-array v0, v0, [Ll/ۢ᩶ᩳ;

    .line 26
    iput-object v0, p0, Ll/ۡ᩶ᩳ;->ۨ:[Ll/ۢ᩶ᩳ;

    .line 9
    new-instance v0, Ll/ۚۗᩳ;

    const/4 v1, -0x1

    invoke-direct {v0, v1, v1}, Ll/ۚۗᩳ;-><init>(II)V

    .line 28
    iput-object v0, p0, Ll/ۡ᩶ᩳ;->֫֫:Ll/ۚۗᩳ;

    .line 33
    iput-object p1, p0, Ll/ۡ᩶ᩳ;->ܰ:Ll/᩷۠ᩴ;

    iput-object p2, p0, Ll/ۡ᩶ᩳ;->ۗ:Ljava/nio/channels/FileChannel;

    iput-object p3, p0, Ll/ۡ᩶ᩳ;->᩺:Ll/ۚ۬ᩳ;

    return-void
.end method

.method private ֡()V
    .locals 17

    move-object/from16 v0, p0

    .line 93
    new-instance v1, Ll/ۜ᩶ᩳ;

    iget-object v2, v0, Ll/ۡ᩶ᩳ;->ۗ:Ljava/nio/channels/FileChannel;

    invoke-virtual {v2}, Ljava/nio/channels/FileChannel;->size()J

    move-result-wide v2

    invoke-direct {v1, v0, v2, v3}, Ll/ۜ᩶ᩳ;-><init>(Ll/ۡ᩶ᩳ;J)V

    const v2, 0x52631361

    .line 94
    invoke-virtual {v1, v2}, Ll/ۜ᩶ᩳ;->ۧ(I)V

    .line 95
    iget-wide v2, v1, Ll/ۜ᩶ᩳ;->ܿ:J

    .line 96
    invoke-virtual {v1}, Ll/ۜ᩶ᩳ;->֫()I

    move-result v4

    const-wide/16 v5, 0x1

    if-eqz v4, :cond_2

    const-wide/16 v7, 0x9

    .line 97
    invoke-virtual {v1, v7, v8}, Ll/ۜ᩶ᩳ;->ۧ(J)V

    .line 98
    invoke-virtual {v1}, Ll/ۜ᩶ᩳ;->֫()I

    move-result v4

    if-eqz v4, :cond_0

    .line 247
    :goto_0
    invoke-virtual {v1}, Ll/ۜ᩶ᩳ;->֫()I

    move-result v4

    if-eqz v4, :cond_0

    goto :goto_0

    .line 99
    :cond_0
    invoke-virtual {v1, v5, v6}, Ll/ۜ᩶ᩳ;->ۧ(J)V

    const/16 v4, 0x14

    .line 100
    invoke-virtual {v1, v4}, Ll/ۜ᩶ᩳ;->֫(I)I

    move-result v4

    const/4 v5, 0x0

    :goto_1
    if-ge v5, v4, :cond_2

    .line 102
    invoke-virtual {v1}, Ll/ۜ᩶ᩳ;->ܿ()V

    const-wide/16 v6, 0x8

    invoke-virtual {v1, v6, v7}, Ll/ۜ᩶ᩳ;->ۧ(J)V

    invoke-virtual {v1}, Ll/ۜ᩶ᩳ;->ܿ()V

    const/16 v8, 0xc

    .line 103
    invoke-virtual {v1, v8}, Ll/ۜ᩶ᩳ;->֫(I)I

    move-result v8

    const/4 v9, 0x0

    :goto_2
    if-ge v9, v8, :cond_1

    .line 104
    invoke-virtual {v1, v6, v7}, Ll/ۜ᩶ᩳ;->ۧ(J)V

    invoke-virtual {v1}, Ll/ۜ᩶ᩳ;->ܿ()V

    add-int/lit8 v9, v9, 0x1

    goto :goto_2

    :cond_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    .line 107
    :cond_2
    iget-wide v4, v1, Ll/ۜ᩶ᩳ;->ܿ:J

    invoke-direct {v0, v2, v3, v4, v5}, Ll/ۡ᩶ᩳ;->֫(JJ)Ll/ۢ᩶ᩳ;

    move-result-object v2

    iput-object v2, v0, Ll/ۡ᩶ᩳ;->ۤ:Ll/ۢ᩶ᩳ;

    const v2, 0x52631362

    .line 108
    invoke-virtual {v1, v2}, Ll/ۜ᩶ᩳ;->ۧ(I)V

    const v2, -0xedca186

    .line 109
    invoke-virtual {v1, v2}, Ll/ۜ᩶ᩳ;->ۧ(I)V

    .line 110
    invoke-virtual {v1}, Ll/ۜ᩶ᩳ;->ۧ()I

    move-result v3

    int-to-long v3, v3

    .line 111
    invoke-virtual {v1, v3, v4}, Ll/ۜ᩶ᩳ;->֫(J)J

    move-result-wide v3

    .line 112
    iget-wide v5, v1, Ll/ۜ᩶ᩳ;->ᩳ:J

    .line 113
    iput-wide v3, v1, Ll/ۜ᩶ᩳ;->ᩳ:J

    .line 115
    :goto_3
    invoke-virtual {v1}, Ll/ۜ᩶ᩳ;->֫()I

    move-result v7

    const/16 v8, 0xff

    const/16 v9, 0x8

    if-eq v7, v8, :cond_a

    .line 116
    iget-object v8, v0, Ll/ۡ᩶ᩳ;->ۨ:[Ll/ۢ᩶ᩳ;

    aget-object v10, v8, v7

    if-nez v10, :cond_9

    .line 117
    invoke-virtual {v1}, Ll/ۜ᩶ᩳ;->ۧ()I

    move-result v10

    .line 118
    iget-wide v11, v1, Ll/ۜ᩶ᩳ;->ܿ:J

    const-wide/16 v13, 0x4

    move-wide v15, v3

    int-to-long v2, v10

    .line 119
    invoke-virtual {v1, v2, v3}, Ll/ۜ᩶ᩳ;->֫(J)J

    move-result-wide v2

    .line 120
    invoke-direct {v0, v11, v12, v2, v3}, Ll/ۡ᩶ᩳ;->֫(JJ)Ll/ۢ᩶ᩳ;

    move-result-object v4

    aput-object v4, v8, v7

    .line 121
    iput-wide v2, v1, Ll/ۜ᩶ᩳ;->ᩳ:J

    if-eqz v7, :cond_7

    const/4 v4, 0x1

    if-eq v7, v4, :cond_6

    const/4 v4, 0x2

    if-eq v7, v4, :cond_4

    const/4 v8, 0x3

    if-eq v7, v8, :cond_3

    .line 147
    iput-wide v2, v1, Ll/ۜ᩶ᩳ;->ܿ:J

    goto :goto_4

    :cond_3
    new-array v2, v4, [I

    .line 140
    invoke-virtual {v1, v2}, Ll/ۜ᩶ᩳ;->֫([I)V

    invoke-virtual {v1, v2}, Ll/ۜ᩶ᩳ;->֫([I)V

    .line 142
    invoke-virtual {v1}, Ll/ۜ᩶ᩳ;->ܽ()Ll/ۢ᩶ᩳ;

    move-result-object v2

    iput-object v2, v0, Ll/ۡ᩶ᩳ;->᩸:Ll/ۢ᩶ᩳ;

    .line 143
    invoke-virtual {v1}, Ll/ۜ᩶ᩳ;->ܽ()Ll/ۢ᩶ᩳ;

    move-result-object v2

    iput-object v2, v0, Ll/ۡ᩶ᩳ;->۬:Ll/ۢ᩶ᩳ;

    goto :goto_4

    .line 133
    :cond_4
    invoke-virtual {v1}, Ll/ۜ᩶ᩳ;->ۧ()I

    move-result v2

    invoke-virtual {v1}, Ll/ۜ᩶ᩳ;->ۧ()I

    move-result v3

    const/4 v4, -0x1

    if-lt v2, v4, :cond_5

    if-lt v3, v4, :cond_5

    .line 135
    new-instance v4, Ll/ۚۗᩳ;

    invoke-direct {v4, v2, v3}, Ll/ۚۗᩳ;-><init>(II)V

    iput-object v4, v0, Ll/ۡ᩶ᩳ;->֫֫:Ll/ۚۗᩳ;

    const-wide/16 v2, 0xc

    .line 136
    invoke-virtual {v1, v2, v3}, Ll/ۜ᩶ᩳ;->ۧ(J)V

    goto :goto_4

    .line 134
    :cond_5
    new-instance v1, Ljava/io/IOException;

    const-string v2, "Invalid legacy selection"

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 130
    :cond_6
    invoke-virtual {v1}, Ll/ۜ᩶ᩳ;->ۧ()I

    move-result v2

    iput v2, v0, Ll/ۡ᩶ᩳ;->۫:I

    invoke-virtual {v1}, Ll/ۜ᩶ᩳ;->ۧ()I

    invoke-virtual {v1}, Ll/ۜ᩶ᩳ;->ۧ()I

    move-result v2

    iput v2, v0, Ll/ۡ᩶ᩳ;->᩶:I

    goto :goto_4

    :cond_7
    if-lt v10, v9, :cond_8

    sub-long/2addr v2, v13

    .line 125
    invoke-direct {v0, v11, v12, v2, v3}, Ll/ۡ᩶ᩳ;->֫(JJ)Ll/ۢ᩶ᩳ;

    move-result-object v4

    iput-object v4, v0, Ll/ۡ᩶ᩳ;->ۧ֫:Ll/ۢ᩶ᩳ;

    .line 126
    iput-wide v2, v1, Ll/ۜ᩶ᩳ;->ܿ:J

    .line 127
    invoke-virtual {v1}, Ll/ۜ᩶ᩳ;->ۧ()I

    move-result v2

    iput v2, v0, Ll/ۡ᩶ᩳ;->ۙ:I

    .line 149
    :goto_4
    invoke-virtual {v1}, Ll/ۜ᩶ᩳ;->ᩳ()V

    move-wide v2, v15

    .line 150
    iput-wide v2, v1, Ll/ۜ᩶ᩳ;->ᩳ:J

    move-wide v3, v2

    const v2, -0xedca186

    goto/16 :goto_3

    .line 124
    :cond_8
    new-instance v1, Ljava/io/IOException;

    const-string v2, "Invalid legacy text record"

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 116
    :cond_9
    new-instance v1, Ljava/io/IOException;

    const-string v2, "Duplicate legacy editor record"

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_a
    const-wide/16 v2, 0x4

    .line 152
    invoke-virtual {v1}, Ll/ۜ᩶ᩳ;->ᩳ()V

    .line 153
    iput-wide v5, v1, Ll/ۜ᩶ᩳ;->ᩳ:J

    const v4, -0xedca186

    .line 154
    invoke-virtual {v1, v4}, Ll/ۜ᩶ᩳ;->ۧ(I)V

    .line 155
    iget-object v4, v0, Ll/ۡ᩶ᩳ;->ۧ֫:Ll/ۢ᩶ᩳ;

    if-eqz v4, :cond_13

    .line 156
    iget v4, v0, Ll/ۡ᩶ᩳ;->᩶:I

    iget v5, v0, Ll/ۡ᩶ᩳ;->۫:I

    const/high16 v6, -0x80000000

    xor-int/2addr v4, v6

    xor-int/2addr v5, v6

    .line 0
    invoke-static {v4, v5}, Ljava/lang/Integer;->compare(II)I

    move-result v4

    if-gtz v4, :cond_12

    const v4, 0x52631363

    .line 157
    invoke-virtual {v1, v4}, Ll/ۜ᩶ᩳ;->ۧ(I)V

    .line 158
    iget-wide v4, v1, Ll/ۜ᩶ᩳ;->ܿ:J

    const-wide/16 v6, 0x2

    .line 159
    invoke-virtual {v1, v6, v7}, Ll/ۜ᩶ᩳ;->ۧ(J)V

    invoke-virtual {v1}, Ll/ۜ᩶ᩳ;->ܿ()V

    invoke-virtual {v1}, Ll/ۜ᩶ᩳ;->ܿ()V

    .line 244
    iget-wide v6, v1, Ll/ۜ᩶ᩳ;->ܿ:J

    .line 242
    invoke-virtual {v1}, Ll/ۜ᩶ᩳ;->֫()I

    move-result v8

    invoke-virtual {v1}, Ll/ۜ᩶ᩳ;->֫()I

    move-result v10

    shl-int/lit8 v9, v10, 0x8

    or-int/2addr v8, v9

    .line 244
    iput-wide v6, v1, Ll/ۜ᩶ᩳ;->ܿ:J

    const/16 v6, 0x7272

    if-ne v8, v6, :cond_b

    const-wide/16 v6, 0x3

    .line 160
    invoke-virtual {v1, v6, v7}, Ll/ۜ᩶ᩳ;->ۧ(J)V

    .line 161
    :cond_b
    iget-wide v6, v1, Ll/ۜ᩶ᩳ;->ܿ:J

    invoke-direct {v0, v4, v5, v6, v7}, Ll/ۡ᩶ᩳ;->֫(JJ)Ll/ۢ᩶ᩳ;

    move-result-object v4

    iput-object v4, v0, Ll/ۡ᩶ᩳ;->۟:Ll/ۢ᩶ᩳ;

    const v4, 0x52631364

    .line 162
    invoke-virtual {v1, v4}, Ll/ۜ᩶ᩳ;->ۧ(I)V

    .line 163
    iget-wide v4, v1, Ll/ۜ᩶ᩳ;->ܿ:J

    .line 243
    invoke-virtual {v1}, Ll/ۜ᩶ᩳ;->ۧ()I

    move-result v6

    iput-wide v4, v1, Ll/ۜ᩶ᩳ;->ܿ:J

    const v7, 0x1727271a

    const v8, 0x17272716

    if-lt v6, v8, :cond_c

    if-gt v6, v7, :cond_c

    .line 165
    invoke-virtual {v1, v2, v3}, Ll/ۜ᩶ᩳ;->ۧ(J)V

    goto :goto_5

    :cond_c
    const/4 v6, 0x0

    .line 167
    :goto_5
    invoke-virtual {v1}, Ll/ۜ᩶ᩳ;->ܿ()V

    const-wide/16 v2, 0xa

    invoke-virtual {v1, v2, v3}, Ll/ۜ᩶ᩳ;->ۧ(J)V

    const v2, 0x17272717

    if-lt v6, v2, :cond_d

    const-wide/16 v2, 0x1

    .line 168
    invoke-virtual {v1, v2, v3}, Ll/ۜ᩶ᩳ;->ۧ(J)V

    goto :goto_6

    :cond_d
    const-wide/16 v2, 0x1

    .line 169
    :goto_6
    invoke-virtual {v1, v2, v3}, Ll/ۜ᩶ᩳ;->ۧ(J)V

    const-wide/16 v2, 0x4

    if-lt v6, v8, :cond_e

    .line 170
    invoke-virtual {v1, v2, v3}, Ll/ۜ᩶ᩳ;->ۧ(J)V

    .line 171
    :cond_e
    invoke-virtual {v1, v2, v3}, Ll/ۜ᩶ᩳ;->ۧ(J)V

    const v2, 0x17272718

    if-lt v6, v2, :cond_f

    .line 247
    :goto_7
    invoke-virtual {v1}, Ll/ۜ᩶ᩳ;->֫()I

    move-result v2

    if-eqz v2, :cond_f

    goto :goto_7

    :cond_f
    const v2, 0x17272719

    const-wide/16 v8, 0x1

    if-lt v6, v2, :cond_10

    .line 173
    invoke-virtual {v1, v8, v9}, Ll/ۜ᩶ᩳ;->ۧ(J)V

    :cond_10
    if-lt v6, v7, :cond_11

    .line 174
    invoke-virtual {v1, v8, v9}, Ll/ۜ᩶ᩳ;->ۧ(J)V

    .line 175
    :cond_11
    invoke-virtual {v1}, Ll/ۜ᩶ᩳ;->ᩳ()V

    .line 176
    iget-wide v1, v1, Ll/ۜ᩶ᩳ;->ܿ:J

    invoke-direct {v0, v4, v5, v1, v2}, Ll/ۡ᩶ᩳ;->֫(JJ)Ll/ۢ᩶ᩳ;

    move-result-object v1

    iput-object v1, v0, Ll/ۡ᩶ᩳ;->ۛ:Ll/ۢ᩶ᩳ;

    return-void

    .line 156
    :cond_12
    new-instance v1, Ljava/io/IOException;

    const-string v2, "Invalid legacy current mark"

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 155
    :cond_13
    new-instance v1, Ljava/io/IOException;

    const-string v2, "Legacy editor state has no text record"

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public static bridge synthetic ֫(Ll/ۡ᩶ᩳ;)Ljava/nio/channels/FileChannel;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۡ᩶ᩳ;->ۗ:Ljava/nio/channels/FileChannel;

    return-object p0
.end method

.method public static ֫(Ljava/io/InputStream;Ll/᩷۠ᩴ;Ll/֨۬ᩳ;J)Ll/ۡ᩶ᩳ;
    .locals 6

    const-wide/16 v0, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    cmp-long v4, p3, v0

    if-ltz v4, :cond_4

    const-wide/32 v0, 0x7fffffff

    cmp-long v4, p3, v0

    if-gtz v4, :cond_4

    const-wide/32 v0, 0x10000

    .line 46
    :try_start_0
    invoke-virtual {p2, v0, v1}, Ll/֨۬ᩳ;->֫(J)Ll/ۚ۬ᩳ;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_7

    const/4 v1, 0x2

    :try_start_1
    new-array v1, v1, [Ll/᩻۠ᩴ;

    .line 47
    sget-object v4, Ll/ۘ۠ᩴ;->CREATE_NEW:Ll/ۘ۠ᩴ;

    aput-object v4, v1, v2

    sget-object v4, Ll/ۘ۠ᩴ;->WRITE:Ll/ۘ۠ᩴ;

    const/4 v5, 0x1

    aput-object v4, v1, v5

    invoke-static {p1, v1}, Ll/ܿ۠ᩴ;->newOutputStream(Ll/᩷۠ᩴ;[Ll/᩻۠ᩴ;)Ljava/io/OutputStream;

    move-result-object v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_5

    .line 49
    :try_start_2
    invoke-static {p0, p3, p4, v1}, Ll/᩸᩶ᩳ;->֫(Ljava/io/InputStream;JLjava/io/OutputStream;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    if-eqz v1, :cond_0

    :try_start_3
    invoke-virtual {v1}, Ljava/io/OutputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p2

    goto :goto_6

    .line 50
    :cond_0
    :goto_0
    :try_start_4
    invoke-virtual {v0}, Ll/ۚ۬ᩳ;->close()V

    const-wide/16 p3, 0x6000

    .line 51
    invoke-virtual {p2, p3, p4}, Ll/֨۬ᩳ;->֫(J)Ll/ۚ۬ᩳ;

    move-result-object p2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :try_start_5
    new-array p3, v5, [Ll/᩻۠ᩴ;

    .line 54
    sget-object p4, Ll/ۘ۠ᩴ;->READ:Ll/ۘ۠ᩴ;

    aput-object p4, p3, v2

    invoke-static {p1, p3}, Ll/۫֨ᩴ;->open(Ll/᩷۠ᩴ;[Ll/᩻۠ᩴ;)Ljava/nio/channels/FileChannel;

    move-result-object p3
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_8
    .catch Ljava/lang/RuntimeException; {:try_start_5 .. :try_end_5} :catch_7
    .catch Ljava/lang/Error; {:try_start_5 .. :try_end_5} :catch_6
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 55
    :try_start_6
    new-instance p4, Ll/ۡ᩶ᩳ;

    invoke-direct {p4, p1, p3, p2}, Ll/ۡ᩶ᩳ;-><init>(Ll/᩷۠ᩴ;Ljava/nio/channels/FileChannel;Ll/ۚ۬ᩳ;)V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_5
    .catch Ljava/lang/RuntimeException; {:try_start_6 .. :try_end_6} :catch_4
    .catch Ljava/lang/Error; {:try_start_6 .. :try_end_6} :catch_3
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 61
    :try_start_7
    invoke-direct {p4}, Ll/ۡ᩶ᩳ;->֡()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    if-eqz p0, :cond_1

    .line 63
    :try_start_8
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_8 .. :try_end_8} :catch_1
    .catch Ljava/lang/Error; {:try_start_8 .. :try_end_8} :catch_0

    return-object p4

    :catch_0
    move-exception p0

    goto/16 :goto_c

    :catch_1
    move-exception p0

    goto/16 :goto_c

    :catch_2
    move-exception p0

    goto/16 :goto_c

    :cond_1
    return-object p4

    :catchall_1
    move-exception p2

    move-object v3, p4

    goto :goto_4

    :catch_3
    move-exception p4

    goto :goto_2

    :catch_4
    move-exception p4

    goto :goto_2

    :catch_5
    move-exception p4

    goto :goto_2

    :catch_6
    move-exception p3

    goto :goto_1

    :catch_7
    move-exception p3

    goto :goto_1

    :catch_8
    move-exception p3

    :goto_1
    move-object p4, p3

    move-object p3, v3

    :goto_2
    if-eqz p3, :cond_2

    .line 57
    :try_start_9
    invoke-virtual {p3}, Ljava/nio/channels/spi/AbstractInterruptibleChannel;->close()V
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    goto :goto_3

    :catch_9
    move-exception p3

    :try_start_a
    invoke-virtual {p4, p3}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 58
    :cond_2
    :goto_3
    invoke-virtual {p2}, Ll/ۚ۬ᩳ;->close()V

    .line 59
    throw p4
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_2

    :catchall_2
    move-exception p2

    :goto_4
    const/4 p3, 0x1

    const/4 v5, 0x1

    goto :goto_9

    :catchall_3
    move-exception p2

    if-eqz v1, :cond_3

    .line 49
    :try_start_b
    invoke-virtual {v1}, Ljava/io/OutputStream;->close()V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_4

    goto :goto_5

    :catchall_4
    move-exception p3

    :try_start_c
    invoke-virtual {p2, p3}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_3
    :goto_5
    throw p2
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_0

    :goto_6
    const/4 v2, 0x1

    goto :goto_7

    :catchall_5
    move-exception p2

    .line 46
    :goto_7
    :try_start_d
    invoke-virtual {v0}, Ll/ۚ۬ᩳ;->close()V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_6

    goto :goto_8

    :catchall_6
    move-exception p3

    :try_start_e
    invoke-virtual {p2, p3}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_8
    throw p2

    .line 44
    :cond_4
    new-instance p2, Ljava/lang/IllegalArgumentException;

    const-string p3, "Invalid legacy state size limit"

    invoke-direct {p2, p3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_7

    :catchall_7
    move-exception p2

    move v5, v2

    :goto_9
    if-eqz p0, :cond_5

    .line 43
    :try_start_f
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_8

    goto :goto_a

    :catchall_8
    move-exception p0

    :try_start_10
    invoke-virtual {p2, p0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_5
    :goto_a
    throw p2
    :try_end_10
    .catch Ljava/io/IOException; {:try_start_10 .. :try_end_10} :catch_c
    .catch Ljava/lang/RuntimeException; {:try_start_10 .. :try_end_10} :catch_b
    .catch Ljava/lang/Error; {:try_start_10 .. :try_end_10} :catch_a

    :catch_a
    move-exception p0

    goto :goto_b

    :catch_b
    move-exception p0

    goto :goto_b

    :catch_c
    move-exception p0

    :goto_b
    move-object p4, v3

    :goto_c
    if-nez p4, :cond_6

    if-eqz v5, :cond_7

    .line 67
    :try_start_11
    invoke-static {p1}, Ll/ܿ۠ᩴ;->delete(Ll/᩷۠ᩴ;)V
    :try_end_11
    .catch Ljava/io/IOException; {:try_start_11 .. :try_end_11} :catch_d

    goto :goto_d

    :catch_d
    move-exception p1

    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    goto :goto_d

    .line 65
    :cond_6
    :try_start_12
    invoke-virtual {p4}, Ll/ۡ᩶ᩳ;->close()V
    :try_end_12
    .catch Ljava/io/IOException; {:try_start_12 .. :try_end_12} :catch_e

    goto :goto_d

    :catch_e
    move-exception p1

    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 69
    :cond_7
    :goto_d
    throw p0
.end method

.method private ֫(JJ)Ll/ۢ᩶ᩳ;
    .locals 7

    .line 179
    new-instance v6, Ll/ۢ᩶ᩳ;

    sub-long v4, p3, p1

    move-object v0, v6

    move-object v1, p0

    move-wide v2, p1

    invoke-direct/range {v0 .. v5}, Ll/ۢ᩶ᩳ;-><init>(Ll/ۡ᩶ᩳ;JJ)V

    return-object v6
.end method

.method public static bridge synthetic ֫(Ll/ۡ᩶ᩳ;JJ)Ll/ۢ᩶ᩳ;
    .locals 0

    .line 0
    invoke-direct {p0, p1, p2, p3, p4}, Ll/ۡ᩶ᩳ;->֫(JJ)Ll/ۢ᩶ᩳ;

    move-result-object p0

    return-object p0
.end method

.method public static ۧ(Ll/ۡ᩶ᩳ;)V
    .locals 1

    .line 180
    iget-boolean p0, p0, Ll/ۡ᩶ᩳ;->᩹:Z

    if-nez p0, :cond_0

    return-void

    :cond_0
    new-instance p0, Ljava/io/IOException;

    const-string v0, "Legacy state index is closed"

    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public final close()V
    .locals 3

    .line 184
    iget-object v0, p0, Ll/ۡ᩶ᩳ;->᩺:Ll/ۚ۬ᩳ;

    iget-object v1, p0, Ll/ۡ᩶ᩳ;->ܰ:Ll/᩷۠ᩴ;

    iget-boolean v2, p0, Ll/ۡ᩶ᩳ;->᩹:Z

    if-eqz v2, :cond_0

    return-void

    :cond_0
    const/4 v2, 0x1

    .line 185
    iput-boolean v2, p0, Ll/ۡ᩶ᩳ;->᩹:Z

    .line 187
    :try_start_0
    iget-object v2, p0, Ll/ۡ᩶ᩳ;->ۗ:Ljava/nio/channels/FileChannel;

    invoke-virtual {v2}, Ljava/nio/channels/spi/AbstractInterruptibleChannel;->close()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    invoke-static {v1}, Ll/ܿ۠ᩴ;->delete(Ll/᩷۠ᩴ;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 188
    invoke-virtual {v0}, Ll/ۚ۬ᩳ;->close()V

    return-void

    :catchall_0
    move-exception v1

    goto :goto_0

    :catchall_1
    move-exception v2

    .line 187
    :try_start_2
    invoke-static {v1}, Ll/ܿ۠ᩴ;->delete(Ll/᩷۠ᩴ;)V

    throw v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 188
    :goto_0
    invoke-virtual {v0}, Ll/ۚ۬ᩳ;->close()V

    throw v1
.end method

.method public final ֫()Ll/ۢ᩶ᩳ;
    .locals 1

    .line 76
    iget-object v0, p0, Ll/ۡ᩶ᩳ;->᩸:Ll/ۢ᩶ᩳ;

    return-object v0
.end method

.method public final ֫(I)Ll/ۢ᩶ᩳ;
    .locals 2

    if-ltz p1, :cond_0

    .line 88
    iget-object v0, p0, Ll/ۡ᩶ᩳ;->ۨ:[Ll/ۢ᩶ᩳ;

    array-length v1, v0

    if-ge p1, v1, :cond_0

    .line 89
    aget-object p1, v0, p1

    return-object p1

    .line 88
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Invalid legacy state record type"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ۖ()Ll/ۢ᩶ᩳ;
    .locals 1

    .line 79
    iget-object v0, p0, Ll/ۡ᩶ᩳ;->ۛ:Ll/ۢ᩶ᩳ;

    return-object v0
.end method

.method public final ۘ()Ll/ۢ᩶ᩳ;
    .locals 1

    .line 78
    iget-object v0, p0, Ll/ۡ᩶ᩳ;->۟:Ll/ۢ᩶ᩳ;

    return-object v0
.end method

.method public final ۜ()Ll/ۢ᩶ᩳ;
    .locals 1

    .line 73
    iget-object v0, p0, Ll/ۡ᩶ᩳ;->ۤ:Ll/ۢ᩶ᩳ;

    return-object v0
.end method

.method public final ܳ()Ll/ۢ᩶ᩳ;
    .locals 1

    .line 77
    iget-object v0, p0, Ll/ۡ᩶ᩳ;->۬:Ll/ۢ᩶ᩳ;

    return-object v0
.end method

.method public final ܽ()I
    .locals 1

    .line 83
    iget v0, p0, Ll/ۡ᩶ᩳ;->᩶:I

    return v0
.end method

.method public final ᩳ()I
    .locals 1

    .line 81
    iget v0, p0, Ll/ۡ᩶ᩳ;->ۙ:I

    return v0
.end method

.method public final ᩴ()Ll/ۚۗᩳ;
    .locals 1

    .line 80
    iget-object v0, p0, Ll/ۡ᩶ᩳ;->֫֫:Ll/ۚۗᩳ;

    return-object v0
.end method

.method public final ᩵()Ll/ۢ᩶ᩳ;
    .locals 1

    .line 74
    iget-object v0, p0, Ll/ۡ᩶ᩳ;->ۧ֫:Ll/ۢ᩶ᩳ;

    return-object v0
.end method

.method public final ᩻()I
    .locals 1

    .line 82
    iget v0, p0, Ll/ۡ᩶ᩳ;->۫:I

    return v0
.end method
