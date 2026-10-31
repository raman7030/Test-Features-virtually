.class public abstract Ll/᩻᩷ۧ;
.super Ljava/lang/Object;
.source "88UO"


# instance fields
.field public final ֫:I

.field public final ۧ:Ll/֫᩷ۧ;

.field public ܽ:Ll/ܽ᩷ۧ;

.field public final ᩳ:Ll/ܳ᩷ۧ;


# direct methods
.method public constructor <init>(Ll/ᩳ᩷ۧ;Ll/ܳ᩷ۧ;JJJJJI)V
    .locals 14

    move-object v0, p0

    .line 131
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    move-object/from16 v1, p2

    .line 132
    iput-object v1, v0, Ll/᩻᩷ۧ;->ᩳ:Ll/ܳ᩷ۧ;

    move/from16 v1, p13

    .line 133
    iput v1, v0, Ll/᩻᩷ۧ;->֫:I

    .line 134
    new-instance v13, Ll/֫᩷ۧ;

    move-object v1, v13

    move-object v2, p1

    move-wide/from16 v3, p3

    move-wide/from16 v5, p5

    move-wide/from16 v7, p7

    move-wide/from16 v9, p9

    move-wide/from16 v11, p11

    invoke-direct/range {v1 .. v12}, Ll/֫᩷ۧ;-><init>(Ll/ᩳ᩷ۧ;JJJJJ)V

    iput-object v13, v0, Ll/᩻᩷ۧ;->ۧ:Ll/֫᩷ۧ;

    return-void
.end method

.method public static ֫(Ll/۠᩷ۧ;JLl/᩻ۢۧ;)I
    .locals 2

    .line 258
    invoke-interface {p0}, Ll/۠᩷ۧ;->getPosition()J

    move-result-wide v0

    cmp-long p0, p1, v0

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return p0

    .line 261
    :cond_0
    iput-wide p1, p3, Ll/᩻ۢۧ;->֫:J

    const/4 p0, 0x1

    return p0
.end method


# virtual methods
.method public final ֫(Ll/۠᩷ۧ;Ll/᩻ۢۧ;)I
    .locals 13

    .line 180
    :goto_0
    iget-object v0, p0, Ll/᩻᩷ۧ;->ܽ:Ll/ܽ᩷ۧ;

    .line 181
    invoke-static {v0}, Ll/᩺֡֫;->ۧ(Ljava/lang/Object;)V

    .line 182
    invoke-static {v0}, Ll/ܽ᩷ۧ;->ۧ(Ll/ܽ᩷ۧ;)J

    move-result-wide v1

    .line 183
    invoke-static {v0}, Ll/ܽ᩷ۧ;->֫(Ll/ܽ᩷ۧ;)J

    move-result-wide v3

    .line 184
    invoke-static {v0}, Ll/ܽ᩷ۧ;->ܽ(Ll/ܽ᩷ۧ;)J

    move-result-wide v5

    sub-long/2addr v3, v1

    .line 186
    iget v7, p0, Ll/᩻᩷ۧ;->֫:I

    int-to-long v7, v7

    const/4 v9, 0x0

    iget-object v10, p0, Ll/᩻᩷ۧ;->ᩳ:Ll/ܳ᩷ۧ;

    cmp-long v11, v3, v7

    if-gtz v11, :cond_0

    .line 237
    iput-object v9, p0, Ll/᩻᩷ۧ;->ܽ:Ll/ܽ᩷ۧ;

    .line 238
    invoke-interface {v10}, Ll/ܳ᩷ۧ;->֫()V

    .line 189
    invoke-static {p1, v1, v2, p2}, Ll/᩻᩷ۧ;->֫(Ll/۠᩷ۧ;JLl/᩻ۢۧ;)I

    move-result p1

    return p1

    .line 248
    :cond_0
    invoke-interface {p1}, Ll/۠᩷ۧ;->getPosition()J

    move-result-wide v1

    sub-long v1, v5, v1

    const-wide/16 v3, 0x0

    cmp-long v7, v1, v3

    if-ltz v7, :cond_6

    const-wide/32 v7, 0x40000

    cmp-long v11, v1, v7

    if-gtz v11, :cond_6

    long-to-int v2, v1

    .line 250
    invoke-interface {p1, v2}, Ll/۠᩷ۧ;->ܽ(I)V

    .line 195
    invoke-interface {p1}, Ll/۠᩷ۧ;->ۧ()V

    .line 197
    invoke-static {v0}, Ll/ܽ᩷ۧ;->ܿ(Ll/ܽ᩷ۧ;)J

    move-result-wide v1

    invoke-interface {v10, p1, v1, v2}, Ll/ܳ᩷ۧ;->֫(Ll/۠᩷ۧ;J)Ll/ܿ᩷ۧ;

    move-result-object v1

    .line 199
    invoke-static {v1}, Ll/ܿ᩷ۧ;->ܽ(Ll/ܿ᩷ۧ;)I

    move-result v2

    const/4 v11, -0x3

    if-eq v2, v11, :cond_5

    const/4 v5, -0x2

    if-eq v2, v5, :cond_4

    const/4 v5, -0x1

    if-eq v2, v5, :cond_3

    if-nez v2, :cond_2

    .line 209
    invoke-static {v1}, Ll/ܿ᩷ۧ;->֫(Ll/ܿ᩷ۧ;)J

    move-result-wide v5

    .line 248
    invoke-interface {p1}, Ll/۠᩷ۧ;->getPosition()J

    move-result-wide v11

    sub-long/2addr v5, v11

    cmp-long v0, v5, v3

    if-ltz v0, :cond_1

    cmp-long v0, v5, v7

    if-gtz v0, :cond_1

    long-to-int v0, v5

    .line 250
    invoke-interface {p1, v0}, Ll/۠᩷ۧ;->ܽ(I)V

    .line 237
    :cond_1
    iput-object v9, p0, Ll/᩻᩷ۧ;->ܽ:Ll/ܽ᩷ۧ;

    .line 238
    invoke-interface {v10}, Ll/ܳ᩷ۧ;->֫()V

    .line 212
    invoke-static {v1}, Ll/ܿ᩷ۧ;->֫(Ll/ܿ᩷ۧ;)J

    move-result-wide v0

    invoke-static {p1, v0, v1, p2}, Ll/᩻᩷ۧ;->֫(Ll/۠᩷ۧ;JLl/᩻ۢۧ;)I

    move-result p1

    return p1

    .line 220
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Invalid case"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 201
    :cond_3
    invoke-static {v1}, Ll/ܿ᩷ۧ;->ۧ(Ll/ܿ᩷ۧ;)J

    move-result-wide v2

    invoke-static {v1}, Ll/ܿ᩷ۧ;->֫(Ll/ܿ᩷ۧ;)J

    move-result-wide v4

    invoke-static {v0, v2, v3, v4, v5}, Ll/ܽ᩷ۧ;->֫(Ll/ܽ᩷ۧ;JJ)V

    goto/16 :goto_0

    .line 205
    :cond_4
    invoke-static {v1}, Ll/ܿ᩷ۧ;->ۧ(Ll/ܿ᩷ۧ;)J

    move-result-wide v2

    invoke-static {v1}, Ll/ܿ᩷ۧ;->֫(Ll/ܿ᩷ۧ;)J

    move-result-wide v4

    invoke-static {v0, v2, v3, v4, v5}, Ll/ܽ᩷ۧ;->ۧ(Ll/ܽ᩷ۧ;JJ)V

    goto/16 :goto_0

    .line 237
    :cond_5
    iput-object v9, p0, Ll/᩻᩷ۧ;->ܽ:Ll/ܽ᩷ۧ;

    .line 238
    invoke-interface {v10}, Ll/ܳ᩷ۧ;->֫()V

    .line 218
    invoke-static {p1, v5, v6, p2}, Ll/᩻᩷ۧ;->֫(Ll/۠᩷ۧ;JLl/᩻ۢۧ;)I

    move-result p1

    return p1

    .line 192
    :cond_6
    invoke-static {p1, v5, v6, p2}, Ll/᩻᩷ۧ;->֫(Ll/۠᩷ۧ;JLl/᩻ۢۧ;)I

    move-result p1

    return p1
.end method

.method public final ֫()Ll/֫᩷ۧ;
    .locals 1

    .line 147
    iget-object v0, p0, Ll/᩻᩷ۧ;->ۧ:Ll/֫᩷ۧ;

    return-object v0
.end method

.method public final ֫(J)V
    .locals 17

    move-object/from16 v0, p0

    move-wide/from16 v2, p1

    .line 156
    iget-object v1, v0, Ll/᩻᩷ۧ;->ܽ:Ll/ܽ᩷ۧ;

    if-eqz v1, :cond_0

    invoke-static {v1}, Ll/ܽ᩷ۧ;->ᩳ(Ll/ܽ᩷ۧ;)J

    move-result-wide v4

    cmp-long v1, v4, v2

    if-nez v1, :cond_0

    return-void

    .line 226
    :cond_0
    new-instance v14, Ll/ܽ᩷ۧ;

    .line 228
    iget-object v1, v0, Ll/᩻᩷ۧ;->ۧ:Ll/֫᩷ۧ;

    invoke-virtual {v1, v2, v3}, Ll/֫᩷ۧ;->ܽ(J)J

    move-result-wide v4

    invoke-static {v1}, Ll/֫᩷ۧ;->ܽ(Ll/֫᩷ۧ;)J

    move-result-wide v8

    invoke-static {v1}, Ll/֫᩷ۧ;->ᩳ(Ll/֫᩷ۧ;)J

    move-result-wide v10

    invoke-static {v1}, Ll/֫᩷ۧ;->ۧ(Ll/֫᩷ۧ;)J

    move-result-wide v12

    invoke-static {v1}, Ll/֫᩷ۧ;->֫(Ll/֫᩷ۧ;)J

    move-result-wide v15

    const-wide/16 v6, 0x0

    move-object v1, v14

    move-wide/from16 v2, p1

    move-object v0, v14

    move-wide v14, v15

    invoke-direct/range {v1 .. v15}, Ll/ܽ᩷ۧ;-><init>(JJJJJJJ)V

    move-object v1, v0

    move-object/from16 v0, p0

    .line 159
    iput-object v1, v0, Ll/᩻᩷ۧ;->ܽ:Ll/ܽ᩷ۧ;

    return-void
.end method

.method public final ۧ()Z
    .locals 1

    .line 164
    iget-object v0, p0, Ll/᩻᩷ۧ;->ܽ:Ll/ܽ᩷ۧ;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
