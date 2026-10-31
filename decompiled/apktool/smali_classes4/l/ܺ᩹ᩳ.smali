.class public final Ll/ܺ᩹ᩳ;
.super Ljava/lang/Object;
.source "Q6UO"


# instance fields
.field public ֫:Z

.field public ۜ:Ljava/lang/Object;

.field public final ۧ:Ll/ۡ᩹ᩳ;

.field public ܳ:Z

.field public ܽ:Z

.field public ܿ:J

.field public ᩳ:Ll/ۨ᩹ᩳ;

.field public final ᩻:Ljava/lang/Thread;


# direct methods
.method public constructor <init>(Ll/ۨ᩹ᩳ;Ll/ۡ᩹ᩳ;)V
    .locals 1

    .line 170
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 162
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Ll/ܺ᩹ᩳ;->ۜ:Ljava/lang/Object;

    .line 163
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    iput-object v0, p0, Ll/ܺ᩹ᩳ;->᩻:Ljava/lang/Thread;

    const/4 v0, 0x1

    .line 164
    iput-boolean v0, p0, Ll/ܺ᩹ᩳ;->֫:Z

    .line 171
    iput-object p1, p0, Ll/ܺ᩹ᩳ;->ᩳ:Ll/ۨ᩹ᩳ;

    .line 172
    iput-object p2, p0, Ll/ܺ᩹ᩳ;->ۧ:Ll/ۡ᩹ᩳ;

    return-void
.end method

.method private ֫(IILjava/lang/CharSequence;IIZ)V
    .locals 16

    move-object/from16 v1, p0

    move/from16 v0, p1

    move/from16 v8, p2

    move/from16 v9, p4

    .line 195
    invoke-direct/range {p0 .. p0}, Ll/ܺ᩹ᩳ;->ܽ()V

    .line 196
    iget-boolean v2, v1, Ll/ܺ᩹ᩳ;->ܳ:Z

    if-nez v2, :cond_6

    const/4 v10, 0x1

    .line 197
    iput-boolean v10, v1, Ll/ܺ᩹ᩳ;->ܳ:Z

    const/4 v11, 0x0

    .line 199
    :try_start_0
    iget-object v2, v1, Ll/ܺ᩹ᩳ;->ᩳ:Ll/ۨ᩹ᩳ;

    invoke-virtual {v2}, Ll/ۨ᩹ᩳ;->ۧ()I

    move-result v2

    invoke-static {v0, v8, v2}, Ll/ۨ᩹ᩳ;->֫(III)V

    .line 200
    invoke-interface/range {p3 .. p3}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-eqz p6, :cond_0

    move v12, v2

    goto :goto_0

    :cond_0
    move/from16 v12, p5

    .line 202
    :goto_0
    invoke-static {v9, v12, v2}, Ll/ۨ᩹ᩳ;->֫(III)V

    .line 203
    iget-object v2, v1, Ll/ܺ᩹ᩳ;->ᩳ:Ll/ۨ᩹ᩳ;

    invoke-virtual {v2}, Ll/ۨ᩹ᩳ;->ۧ()I

    move-result v2

    sub-int v3, v8, v0

    sub-int v4, v12, v9

    invoke-static {v2, v3, v4}, Ll/ۨ᩹ᩳ;->ۧ(III)V

    .line 204
    iget-object v2, v1, Ll/ܺ᩹ᩳ;->ᩳ:Ll/ۨ᩹ᩳ;

    move-object/from16 v3, p3

    invoke-virtual {v2, v9, v12, v3}, Ll/ۨ᩹ᩳ;->֫(IILjava/lang/CharSequence;)Ll/ۤ᩹ᩳ;

    move-result-object v13
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 205
    :try_start_1
    iget-object v2, v1, Ll/ܺ᩹ᩳ;->ۧ:Ll/ۡ᩹ᩳ;

    if-eqz v2, :cond_2

    if-ne v0, v8, :cond_1

    iget v2, v13, Ll/ۤ᩹ᩳ;->᩹:I

    if-nez v2, :cond_1

    goto :goto_1

    .line 209
    :cond_1
    new-instance v2, Ljava/lang/Object;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    iput-object v2, v1, Ll/ܺ᩹ᩳ;->ۜ:Ljava/lang/Object;

    .line 210
    iget-object v3, v1, Ll/ܺ᩹ᩳ;->ᩳ:Ll/ۨ᩹ᩳ;

    invoke-virtual {v3, v0, v8, v13, v2}, Ll/ۨ᩹ᩳ;->֫(IILl/ۤ᩹ᩳ;Ljava/lang/Object;)Ll/ۨ᩹ᩳ;

    move-result-object v14

    .line 211
    new-instance v2, Ljava/lang/Object;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    iput-object v2, v1, Ll/ܺ᩹ᩳ;->ۜ:Ljava/lang/Object;

    .line 212
    iget-object v2, v1, Ll/ܺ᩹ᩳ;->ۧ:Ll/ۡ᩹ᩳ;

    iget-object v5, v1, Ll/ܺ᩹ᩳ;->ᩳ:Ll/ۨ᩹ᩳ;

    iget v7, v13, Ll/ۤ᩹ᩳ;->᩹:I

    move/from16 v3, p1

    move/from16 v4, p2

    move-object v6, v14

    invoke-interface/range {v2 .. v7}, Ll/ۡ᩹ᩳ;->֫(IILl/ۨ᩹ᩳ;Ll/ۨ᩹ᩳ;I)V

    .line 213
    iput-object v14, v1, Ll/ܺ᩹ᩳ;->ᩳ:Ll/ۨ᩹ᩳ;

    goto :goto_2

    .line 206
    :cond_2
    :goto_1
    iget-object v2, v1, Ll/ܺ᩹ᩳ;->ᩳ:Ll/ۨ᩹ᩳ;

    iget-object v3, v1, Ll/ܺ᩹ᩳ;->ۜ:Ljava/lang/Object;

    invoke-virtual {v2, v0, v8, v13, v3}, Ll/ۨ᩹ᩳ;->֫(IILl/ۤ᩹ᩳ;Ljava/lang/Object;)Ll/ۨ᩹ᩳ;

    move-result-object v2

    iput-object v2, v1, Ll/ܺ᩹ᩳ;->ᩳ:Ll/ۨ᩹ᩳ;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 215
    :goto_2
    :try_start_2
    invoke-virtual {v13}, Ll/ۤ᩹ᩳ;->close()V

    int-to-long v2, v8

    int-to-long v4, v0

    sub-long/2addr v2, v4

    int-to-long v4, v12

    add-long/2addr v2, v4

    int-to-long v4, v9

    sub-long/2addr v2, v4

    const-wide/16 v4, 0x2

    mul-long v2, v2, v4

    .line 217
    iget-wide v4, v1, Ll/ܺ᩹ᩳ;->ܿ:J

    const-wide v6, 0x7fffffffffffffffL

    sub-long v13, v6, v4

    cmp-long v15, v2, v13

    if-lez v15, :cond_3

    goto :goto_3

    :cond_3
    add-long v6, v4, v2

    :goto_3
    iput-wide v6, v1, Ll/ܺ᩹ᩳ;->ܿ:J

    if-ne v0, v8, :cond_4

    if-eq v9, v12, :cond_5

    .line 218
    :cond_4
    iput-boolean v10, v1, Ll/ܺ᩹ᩳ;->ܽ:Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 220
    :cond_5
    iput-boolean v11, v1, Ll/ܺ᩹ᩳ;->ܳ:Z

    return-void

    :catchall_0
    move-exception v0

    move-object v2, v0

    .line 204
    :try_start_3
    invoke-virtual {v13}, Ll/ۤ᩹ᩳ;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_4

    :catchall_1
    move-exception v0

    move-object v3, v0

    :try_start_4
    invoke-virtual {v2, v3}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_4
    throw v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :catchall_2
    move-exception v0

    .line 220
    iput-boolean v11, v1, Ll/ܺ᩹ᩳ;->ܳ:Z

    .line 221
    throw v0

    .line 196
    :cond_6
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "Recursive text source edit"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static bridge synthetic ֫(Ll/ܺ᩹ᩳ;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/ܺ᩹ᩳ;->ܽ:Z

    return p0
.end method

.method public static bridge synthetic ۧ(Ll/ܺ᩹ᩳ;)Ll/ۨ᩹ᩳ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܺ᩹ᩳ;->ᩳ:Ll/ۨ᩹ᩳ;

    return-object p0
.end method

.method private ܽ()V
    .locals 2

    .line 176
    iget-object v0, p0, Ll/ܺ᩹ᩳ;->᩻:Ljava/lang/Thread;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    if-ne v0, v1, :cond_0

    iget-boolean v0, p0, Ll/ܺ᩹ᩳ;->֫:Z

    if-eqz v0, :cond_0

    return-void

    .line 177
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Text transaction is not active on this thread"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static bridge synthetic ܽ(Ll/ܺ᩹ᩳ;)V
    .locals 1

    const/4 v0, 0x0

    .line 0
    iput-boolean v0, p0, Ll/ܺ᩹ᩳ;->֫:Z

    return-void
.end method

.method public static bridge synthetic ᩳ(Ll/ܺ᩹ᩳ;)V
    .locals 1

    const/4 v0, 0x0

    .line 0
    iput-object v0, p0, Ll/ܺ᩹ᩳ;->ᩳ:Ll/ۨ᩹ᩳ;

    return-void
.end method


# virtual methods
.method public final ֫()J
    .locals 2

    .line 227
    invoke-direct {p0}, Ll/ܺ᩹ᩳ;->ܽ()V

    .line 228
    iget-wide v0, p0, Ll/ܺ᩹ᩳ;->ܿ:J

    return-wide v0
.end method

.method public final ֫(IILjava/lang/CharSequence;II)V
    .locals 7

    const/4 v6, 0x0

    move-object v0, p0

    move v1, p1

    move v2, p2

    move-object v3, p3

    move v4, p4

    move v5, p5

    .line 191
    invoke-direct/range {v0 .. v6}, Ll/ܺ᩹ᩳ;->֫(IILjava/lang/CharSequence;IIZ)V

    return-void
.end method

.method public final ֫(IILjava/nio/CharBuffer;)V
    .locals 7

    const/4 v5, 0x0

    const/4 v6, 0x1

    const/4 v4, 0x0

    move-object v0, p0

    move v1, p1

    move v2, p2

    move-object v3, p3

    .line 187
    invoke-direct/range {v0 .. v6}, Ll/ܺ᩹ᩳ;->֫(IILjava/lang/CharSequence;IIZ)V

    return-void
.end method

.method public final ۧ()I
    .locals 1

    .line 182
    invoke-direct {p0}, Ll/ܺ᩹ᩳ;->ܽ()V

    .line 183
    iget-object v0, p0, Ll/ܺ᩹ᩳ;->ᩳ:Ll/ۨ᩹ᩳ;

    invoke-virtual {v0}, Ll/ۨ᩹ᩳ;->ۧ()I

    move-result v0

    return v0
.end method
