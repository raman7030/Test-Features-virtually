.class public final Ll/ᩴᩳᩳ;
.super Ljava/lang/Object;
.source "21VN"


# instance fields
.field public final ֫:J

.field public final ۧ:J

.field public final ܳ:Z

.field public final ܽ:J

.field public final ܿ:Ll/᩻ۖܽ;

.field public final ᩳ:J

.field public final ᩻:Z


# direct methods
.method public constructor <init>(Ll/᩻ۖܽ;)V
    .locals 21

    move-object/from16 v0, p0

    .line 28
    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    move-object/from16 v1, p1

    .line 29
    iput-object v1, v0, Ll/ᩴᩳᩳ;->ܿ:Ll/᩻ۖܽ;

    .line 144
    invoke-virtual/range {p1 .. p1}, Ll/᩻ۖܽ;->length()J

    move-result-wide v1

    const-wide/16 v3, 0x16

    sub-long v5, v1, v3

    const-wide/32 v7, 0x10015

    sub-long v7, v1, v7

    const-wide/16 v9, 0x0

    .line 33
    invoke-static {v9, v10, v7, v8}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v7

    :goto_0
    cmp-long v11, v5, v7

    if-ltz v11, :cond_d

    .line 37
    invoke-virtual {v0, v5, v6}, Ll/ᩴᩳᩳ;->֫(J)V

    .line 38
    invoke-virtual/range {p0 .. p0}, Ll/ᩴᩳᩳ;->ۢ()I

    move-result v11

    const v12, 0x6054b50

    if-ne v11, v12, :cond_c

    const-wide/16 v11, 0xc

    add-long/2addr v11, v5

    .line 39
    invoke-virtual {v0, v11, v12}, Ll/ᩴᩳᩳ;->֫(J)V

    .line 203
    invoke-virtual/range {p0 .. p0}, Ll/ᩴᩳᩳ;->ۢ()I

    move-result v13

    int-to-long v13, v13

    const-wide v15, 0xffffffffL

    and-long/2addr v13, v15

    invoke-virtual/range {p0 .. p0}, Ll/ᩴᩳᩳ;->ۢ()I

    move-result v9

    int-to-long v9, v9

    and-long/2addr v9, v15

    .line 208
    iget-object v15, v0, Ll/ᩴᩳᩳ;->ܿ:Ll/᩻ۖܽ;

    invoke-virtual {v15}, Ll/᩻ۖܽ;->read()I

    move-result v16

    .line 209
    invoke-virtual {v15}, Ll/᩻ۖܽ;->read()I

    move-result v15

    or-int v17, v16, v15

    if-ltz v17, :cond_b

    shl-int/lit8 v15, v15, 0x8

    or-int v15, v15, v16

    move-wide/from16 v17, v7

    int-to-long v7, v15

    sub-long v15, v1, v5

    sub-long/2addr v15, v3

    const/16 v19, 0x0

    cmp-long v20, v7, v15

    if-nez v20, :cond_0

    const/4 v7, 0x1

    goto :goto_1

    :cond_0
    const/4 v7, 0x0

    :goto_1
    const-wide v15, 0xffffffffL

    cmp-long v8, v9, v15

    if-eqz v8, :cond_2

    cmp-long v8, v13, v15

    if-nez v8, :cond_1

    goto :goto_2

    :cond_1
    const/4 v8, 0x0

    goto :goto_3

    :cond_2
    :goto_2
    const/4 v8, 0x1

    :goto_3
    cmp-long v15, v9, v5

    if-gtz v15, :cond_3

    sub-long v9, v5, v9

    cmp-long v15, v13, v9

    if-gtz v15, :cond_3

    const/4 v9, 0x1

    goto :goto_4

    :cond_3
    const/4 v9, 0x0

    :goto_4
    if-eqz v7, :cond_a

    if-nez v8, :cond_4

    if-eqz v9, :cond_a

    .line 61
    :cond_4
    iput-wide v5, v0, Ll/ᩴᩳᩳ;->ᩳ:J

    .line 69
    invoke-virtual {v0, v11, v12}, Ll/ᩴᩳᩳ;->֫(J)V

    .line 203
    invoke-virtual/range {p0 .. p0}, Ll/ᩴᩳᩳ;->ۢ()I

    move-result v1

    int-to-long v1, v1

    const-wide v3, 0xffffffffL

    and-long/2addr v1, v3

    invoke-virtual/range {p0 .. p0}, Ll/ᩴᩳᩳ;->ۢ()I

    move-result v7

    int-to-long v7, v7

    and-long/2addr v7, v3

    cmp-long v9, v7, v3

    if-eqz v9, :cond_5

    cmp-long v9, v1, v3

    if-nez v9, :cond_6

    :cond_5
    const-wide/16 v3, 0x14

    sub-long v3, v5, v3

    const-wide/16 v9, 0x0

    cmp-long v11, v3, v9

    if-ltz v11, :cond_6

    .line 78
    invoke-virtual {v0, v3, v4}, Ll/ᩴᩳᩳ;->֫(J)V

    .line 79
    invoke-virtual/range {p0 .. p0}, Ll/ᩴᩳᩳ;->ۢ()I

    move-result v3

    const v4, 0x7064b50

    if-ne v3, v4, :cond_6

    const/4 v3, 0x4

    .line 81
    invoke-virtual {v0, v3}, Ll/ᩴᩳᩳ;->ۧ(I)V

    .line 82
    invoke-virtual/range {p0 .. p0}, Ll/ᩴᩳᩳ;->ۡ()J

    move-result-wide v3

    .line 85
    invoke-virtual {v0, v3, v4}, Ll/ᩴᩳᩳ;->֫(J)V

    .line 86
    invoke-virtual/range {p0 .. p0}, Ll/ᩴᩳᩳ;->ۢ()I

    move-result v3

    const v4, 0x6064b50

    if-ne v3, v4, :cond_6

    .line 88
    invoke-virtual/range {p0 .. p0}, Ll/ᩴᩳᩳ;->ۡ()J

    const/16 v3, 0xc

    .line 89
    invoke-virtual {v0, v3}, Ll/ᩴᩳᩳ;->ۧ(I)V

    .line 91
    invoke-virtual/range {p0 .. p0}, Ll/ᩴᩳᩳ;->ۡ()J

    const/16 v3, 0x8

    .line 92
    invoke-virtual {v0, v3}, Ll/ᩴᩳᩳ;->ۧ(I)V

    .line 93
    invoke-virtual/range {p0 .. p0}, Ll/ᩴᩳᩳ;->ۡ()J

    move-result-wide v3

    .line 94
    invoke-virtual/range {p0 .. p0}, Ll/ᩴᩳᩳ;->ۡ()J

    move-result-wide v9

    const/4 v11, 0x1

    goto :goto_5

    :cond_6
    const/4 v11, 0x0

    const-wide/16 v3, 0x0

    const-wide/16 v9, 0x0

    :goto_5
    if-nez v11, :cond_7

    goto :goto_6

    :cond_7
    move-wide v1, v3

    move-wide v7, v9

    :goto_6
    const-wide/16 v3, 0x0

    cmp-long v9, v7, v3

    if-ltz v9, :cond_9

    cmp-long v9, v1, v3

    if-ltz v9, :cond_9

    cmp-long v3, v7, v5

    if-gtz v3, :cond_9

    sub-long/2addr v5, v7

    cmp-long v3, v1, v5

    if-gtz v3, :cond_9

    .line 112
    iput-boolean v11, v0, Ll/ᩴᩳᩳ;->᩻:Z

    .line 113
    iput-wide v1, v0, Ll/ᩴᩳᩳ;->ۧ:J

    .line 114
    iput-wide v7, v0, Ll/ᩴᩳᩳ;->֫:J

    const-wide/16 v1, 0x20

    cmp-long v3, v7, v1

    if-ltz v3, :cond_8

    const-wide/16 v1, 0x10

    sub-long v1, v7, v1

    .line 121
    :try_start_0
    invoke-virtual {v0, v1, v2}, Ll/ᩴᩳᩳ;->֫(J)V

    .line 122
    invoke-virtual/range {p0 .. p0}, Ll/ᩴᩳᩳ;->ۡ()J

    move-result-wide v1

    const-wide v3, 0x20676953204b5041L

    cmp-long v5, v1, v3

    if-nez v5, :cond_8

    invoke-virtual/range {p0 .. p0}, Ll/ᩴᩳᩳ;->ۡ()J

    move-result-wide v1

    const-wide v3, 0x3234206b636f6c42L    # 7.465385175170059E-67

    cmp-long v5, v1, v3

    if-nez v5, :cond_8

    const-wide/16 v1, 0x18

    sub-long v1, v7, v1

    .line 123
    invoke-virtual {v0, v1, v2}, Ll/ᩴᩳᩳ;->֫(J)V

    .line 124
    invoke-virtual/range {p0 .. p0}, Ll/ᩴᩳᩳ;->ۡ()J

    move-result-wide v1

    sub-long v3, v7, v1

    const-wide/16 v5, 0x8

    sub-long/2addr v3, v5

    const-wide/16 v9, 0x0

    cmp-long v5, v3, v9

    if-ltz v5, :cond_8

    .line 127
    invoke-virtual {v0, v3, v4}, Ll/ᩴᩳᩳ;->֫(J)V

    .line 128
    invoke-virtual/range {p0 .. p0}, Ll/ᩴᩳᩳ;->ۡ()J

    move-result-wide v5
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    cmp-long v9, v5, v1

    if-nez v9, :cond_8

    const/16 v19, 0x1

    move-wide v7, v3

    goto :goto_7

    :catch_0
    const/4 v1, 0x0

    goto :goto_8

    :cond_8
    :goto_7
    move/from16 v1, v19

    .line 139
    :goto_8
    iput-wide v7, v0, Ll/ᩴᩳᩳ;->ܽ:J

    .line 140
    iput-boolean v1, v0, Ll/ᩴᩳᩳ;->ܳ:Z

    return-void

    .line 109
    :cond_9
    new-instance v1, Ljava/io/IOException;

    const-string v2, "Central Directory exceeds EOCD"

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_a
    const-wide/16 v9, 0x0

    goto :goto_9

    .line 211
    :cond_b
    new-instance v1, Ljava/io/EOFException;

    invoke-direct {v1}, Ljava/io/EOFException;-><init>()V

    throw v1

    :cond_c
    move-wide/from16 v17, v7

    :goto_9
    const-wide/16 v7, 0x1

    sub-long/2addr v5, v7

    move-wide/from16 v7, v17

    goto/16 :goto_0

    .line 58
    :cond_d
    new-instance v1, Ljava/io/IOException;

    const-string v2, "Archive is not a ZIP archive"

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1
.end method


# virtual methods
.method public final ֫()J
    .locals 2

    .line 225
    iget-wide v0, p0, Ll/ᩴᩳᩳ;->֫:J

    return-wide v0
.end method

.method public final ֫(J)V
    .locals 1

    .line 148
    iget-object v0, p0, Ll/ᩴᩳᩳ;->ܿ:Ll/᩻ۖܽ;

    invoke-virtual {v0, p1, p2}, Ll/᩻ۖܽ;->seek(J)V

    return-void
.end method

.method public final ֫(I)[B
    .locals 7

    if-ltz p1, :cond_1

    int-to-long v0, p1

    .line 170
    iget-object v2, p0, Ll/ᩴᩳᩳ;->ܿ:Ll/᩻ۖܽ;

    invoke-virtual {v2}, Ll/᩻ۖܽ;->length()J

    move-result-wide v3

    invoke-virtual {v2}, Ll/᩻ۖܽ;->getFilePointer()J

    move-result-wide v5

    sub-long/2addr v3, v5

    cmp-long v5, v0, v3

    if-gtz v5, :cond_0

    .line 173
    new-array v0, p1, [B

    const/4 v1, 0x0

    .line 187
    invoke-virtual {v2, v0, v1, p1}, Ll/᩻ۖܽ;->֫([BII)V

    return-object v0

    .line 171
    :cond_0
    new-instance p1, Ljava/io/EOFException;

    invoke-direct {p1}, Ljava/io/EOFException;-><init>()V

    throw p1

    .line 167
    :cond_1
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Read "

    .line 0
    invoke-static {p1, v1}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 167
    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ۜ()J
    .locals 2

    .line 144
    iget-object v0, p0, Ll/ᩴᩳᩳ;->ܿ:Ll/᩻ۖܽ;

    invoke-virtual {v0}, Ll/᩻ۖܽ;->length()J

    move-result-wide v0

    return-wide v0
.end method

.method public final ۡ()J
    .locals 21

    move-object/from16 v0, p0

    .line 189
    iget-object v1, v0, Ll/ᩴᩳᩳ;->ܿ:Ll/᩻ۖܽ;

    invoke-virtual {v1}, Ll/᩻ۖܽ;->read()I

    move-result v2

    int-to-long v2, v2

    .line 190
    invoke-virtual {v1}, Ll/᩻ۖܽ;->read()I

    move-result v4

    int-to-long v4, v4

    .line 191
    invoke-virtual {v1}, Ll/᩻ۖܽ;->read()I

    move-result v6

    int-to-long v6, v6

    .line 192
    invoke-virtual {v1}, Ll/᩻ۖܽ;->read()I

    move-result v8

    int-to-long v8, v8

    .line 193
    invoke-virtual {v1}, Ll/᩻ۖܽ;->read()I

    move-result v10

    int-to-long v10, v10

    .line 194
    invoke-virtual {v1}, Ll/᩻ۖܽ;->read()I

    move-result v12

    int-to-long v12, v12

    .line 195
    invoke-virtual {v1}, Ll/᩻ۖܽ;->read()I

    move-result v14

    int-to-long v14, v14

    .line 196
    invoke-virtual {v1}, Ll/᩻ۖܽ;->read()I

    move-result v1

    int-to-long v0, v1

    or-long v16, v2, v4

    or-long v16, v16, v6

    or-long v16, v16, v8

    or-long v16, v16, v10

    or-long v16, v16, v12

    or-long v16, v16, v14

    or-long v16, v16, v0

    const-wide/16 v18, 0x0

    cmp-long v20, v16, v18

    if-ltz v20, :cond_0

    const/16 v16, 0x8

    shl-long v4, v4, v16

    or-long/2addr v2, v4

    const/16 v4, 0x10

    shl-long v4, v6, v4

    or-long/2addr v2, v4

    const/16 v4, 0x18

    shl-long v4, v8, v4

    or-long/2addr v2, v4

    const/16 v4, 0x20

    shl-long v4, v10, v4

    or-long/2addr v2, v4

    const/16 v4, 0x28

    shl-long v4, v12, v4

    or-long/2addr v2, v4

    const/16 v4, 0x30

    shl-long v4, v14, v4

    or-long/2addr v2, v4

    const/16 v4, 0x38

    shl-long/2addr v0, v4

    or-long/2addr v0, v2

    return-wide v0

    .line 198
    :cond_0
    new-instance v0, Ljava/io/EOFException;

    invoke-direct {v0}, Ljava/io/EOFException;-><init>()V

    throw v0
.end method

.method public final ۢ()I
    .locals 5

    .line 179
    iget-object v0, p0, Ll/ᩴᩳᩳ;->ܿ:Ll/᩻ۖܽ;

    invoke-virtual {v0}, Ll/᩻ۖܽ;->read()I

    move-result v1

    .line 180
    invoke-virtual {v0}, Ll/᩻ۖܽ;->read()I

    move-result v2

    .line 181
    invoke-virtual {v0}, Ll/᩻ۖܽ;->read()I

    move-result v3

    .line 182
    invoke-virtual {v0}, Ll/᩻ۖܽ;->read()I

    move-result v0

    or-int v4, v1, v2

    or-int/2addr v4, v3

    or-int/2addr v4, v0

    if-ltz v4, :cond_0

    shl-int/lit8 v2, v2, 0x8

    or-int/2addr v1, v2

    shl-int/lit8 v2, v3, 0x10

    or-int/2addr v1, v2

    shl-int/lit8 v0, v0, 0x18

    or-int/2addr v0, v1

    return v0

    .line 184
    :cond_0
    new-instance v0, Ljava/io/EOFException;

    invoke-direct {v0}, Ljava/io/EOFException;-><init>()V

    throw v0
.end method

.method public final ۧ()J
    .locals 2

    .line 229
    iget-wide v0, p0, Ll/ᩴᩳᩳ;->ۧ:J

    return-wide v0
.end method

.method public final ۧ(I)V
    .locals 5

    if-ltz p1, :cond_1

    .line 158
    iget-object v0, p0, Ll/ᩴᩳᩳ;->ܿ:Ll/᩻ۖܽ;

    invoke-virtual {v0}, Ll/᩻ۖܽ;->getFilePointer()J

    move-result-wide v1

    int-to-long v3, p1

    add-long/2addr v1, v3

    .line 159
    invoke-virtual {v0}, Ll/᩻ۖܽ;->length()J

    move-result-wide v3

    cmp-long p1, v1, v3

    if-gtz p1, :cond_0

    .line 162
    invoke-virtual {v0, v1, v2}, Ll/᩻ۖܽ;->seek(J)V

    return-void

    .line 161
    :cond_0
    new-instance p1, Ljava/io/EOFException;

    invoke-direct {p1}, Ljava/io/EOFException;-><init>()V

    throw p1

    .line 157
    :cond_1
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Skip "

    .line 0
    invoke-static {p1, v1}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 157
    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ܳ()Z
    .locals 1

    .line 237
    iget-boolean v0, p0, Ll/ᩴᩳᩳ;->ܳ:Z

    return v0
.end method

.method public final ܽ()J
    .locals 2

    .line 221
    iget-wide v0, p0, Ll/ᩴᩳᩳ;->ܽ:J

    return-wide v0
.end method

.method public final ܿ()Ll/۠ۖܽ;
    .locals 1

    .line 241
    iget-object v0, p0, Ll/ᩴᩳᩳ;->ܿ:Ll/᩻ۖܽ;

    return-object v0
.end method

.method public final ᩳ()J
    .locals 2

    .line 233
    iget-wide v0, p0, Ll/ᩴᩳᩳ;->ᩳ:J

    return-wide v0
.end method

.method public final ᩷()J
    .locals 2

    .line 152
    iget-object v0, p0, Ll/ᩴᩳᩳ;->ܿ:Ll/᩻ۖܽ;

    invoke-virtual {v0}, Ll/᩻ۖܽ;->getFilePointer()J

    move-result-wide v0

    return-wide v0
.end method

.method public final ᩻()Z
    .locals 1

    .line 217
    iget-boolean v0, p0, Ll/ᩴᩳᩳ;->᩻:Z

    return v0
.end method
