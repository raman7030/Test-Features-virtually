.class public final Ll/ܰ֡ۧ;
.super Ljava/lang/Object;
.source "O8OV"

# interfaces
.implements Ll/ܳ᩷ۧ;


# instance fields
.field public final ֫:Ll/ᩳ֨֫;

.field public final ۧ:Ll/ۢ֨֫;


# direct methods
.method public constructor <init>(Ll/ۢ֨֫;)V
    .locals 0

    .line 68
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 69
    iput-object p1, p0, Ll/ܰ֡ۧ;->ۧ:Ll/ۢ֨֫;

    .line 70
    new-instance p1, Ll/ᩳ֨֫;

    invoke-direct {p1}, Ll/ᩳ֨֫;-><init>()V

    iput-object p1, p0, Ll/ܰ֡ۧ;->֫:Ll/ᩳ֨֫;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/۠᩷ۧ;J)Ll/ܿ᩷ۧ;
    .locals 16

    move-object/from16 v0, p0

    .line 76
    invoke-interface/range {p1 .. p1}, Ll/۠᩷ۧ;->getPosition()J

    move-result-wide v1

    .line 77
    invoke-interface/range {p1 .. p1}, Ll/۠᩷ۧ;->getLength()J

    move-result-wide v3

    sub-long/2addr v3, v1

    const-wide/16 v5, 0x4e20

    invoke-static {v5, v6, v3, v4}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v3

    long-to-int v4, v3

    .line 79
    iget-object v3, v0, Ll/ܰ֡ۧ;->֫:Ll/ᩳ֨֫;

    invoke-virtual {v3, v4}, Ll/ᩳ֨֫;->ܽ(I)V

    .line 80
    invoke-virtual {v3}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v5

    const/4 v6, 0x0

    move-object/from16 v7, p1

    invoke-interface {v7, v6, v4, v5}, Ll/۠᩷ۧ;->֫(II[B)V

    const/4 v4, -0x1

    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    const/4 v7, -0x1

    move-wide v8, v5

    .line 96
    :goto_0
    invoke-virtual {v3}, Ll/ᩳ֨֫;->֫()I

    move-result v10

    const/4 v11, 0x4

    if-lt v10, v11, :cond_e

    .line 97
    invoke-virtual {v3}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v10

    invoke-virtual {v3}, Ll/ᩳ֨֫;->ᩳ()I

    move-result v12

    invoke-static {v12, v10}, Ll/۟֡ۧ;->֫(I[B)I

    move-result v10

    const/4 v12, 0x1

    const/16 v13, 0x1ba

    if-eq v10, v13, :cond_0

    .line 99
    invoke-virtual {v3, v12}, Ll/ᩳ֨֫;->ܳ(I)V

    goto :goto_0

    .line 102
    :cond_0
    invoke-virtual {v3, v11}, Ll/ᩳ֨֫;->ܳ(I)V

    .line 106
    invoke-static {v3}, Ll/֫ۚۧ;->֫(Ll/ᩳ֨֫;)J

    move-result-wide v14

    cmp-long v4, v14, v5

    if-eqz v4, :cond_4

    .line 108
    iget-object v4, v0, Ll/ܰ֡ۧ;->ۧ:Ll/ۢ֨֫;

    invoke-virtual {v4, v14, v15}, Ll/ۢ֨֫;->ۧ(J)J

    move-result-wide v14

    cmp-long v4, v14, p2

    if-lez v4, :cond_2

    cmp-long v3, v8, v5

    if-nez v3, :cond_1

    .line 112
    invoke-static {v14, v15, v1, v2}, Ll/ܿ᩷ۧ;->֫(JJ)Ll/ܿ᩷ۧ;

    move-result-object v1

    return-object v1

    :cond_1
    int-to-long v3, v7

    add-long/2addr v1, v3

    .line 115
    invoke-static {v1, v2}, Ll/ܿ᩷ۧ;->֫(J)Ll/ܿ᩷ۧ;

    move-result-object v1

    return-object v1

    :cond_2
    const-wide/32 v7, 0x186a0

    add-long/2addr v7, v14

    cmp-long v4, v7, p2

    if-lez v4, :cond_3

    .line 119
    invoke-virtual {v3}, Ll/ᩳ֨֫;->ᩳ()I

    move-result v3

    int-to-long v3, v3

    add-long/2addr v1, v3

    .line 120
    invoke-static {v1, v2}, Ll/ܿ᩷ۧ;->֫(J)Ll/ܿ᩷ۧ;

    move-result-object v1

    return-object v1

    .line 124
    :cond_3
    invoke-virtual {v3}, Ll/ᩳ֨֫;->ᩳ()I

    move-result v4

    move v7, v4

    move-wide v8, v14

    .line 145
    :cond_4
    invoke-virtual {v3}, Ll/ᩳ֨֫;->ܿ()I

    move-result v4

    .line 147
    invoke-virtual {v3}, Ll/ᩳ֨֫;->֫()I

    move-result v10

    const/16 v14, 0xa

    if-ge v10, v14, :cond_5

    .line 150
    invoke-virtual {v3, v4}, Ll/ᩳ֨֫;->ܿ(I)V

    goto/16 :goto_2

    :cond_5
    const/16 v10, 0x9

    .line 153
    invoke-virtual {v3, v10}, Ll/ᩳ֨֫;->ܳ(I)V

    .line 155
    invoke-virtual {v3}, Ll/ᩳ֨֫;->֨()I

    move-result v10

    and-int/lit8 v10, v10, 0x7

    .line 156
    invoke-virtual {v3}, Ll/ᩳ֨֫;->֫()I

    move-result v14

    if-ge v14, v10, :cond_6

    .line 157
    invoke-virtual {v3, v4}, Ll/ᩳ֨֫;->ܿ(I)V

    goto/16 :goto_2

    .line 160
    :cond_6
    invoke-virtual {v3, v10}, Ll/ᩳ֨֫;->ܳ(I)V

    .line 162
    invoke-virtual {v3}, Ll/ᩳ֨֫;->֫()I

    move-result v10

    if-ge v10, v11, :cond_7

    .line 163
    invoke-virtual {v3, v4}, Ll/ᩳ֨֫;->ܿ(I)V

    goto :goto_2

    .line 167
    :cond_7
    invoke-virtual {v3}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v10

    invoke-virtual {v3}, Ll/ᩳ֨֫;->ᩳ()I

    move-result v14

    invoke-static {v14, v10}, Ll/۟֡ۧ;->֫(I[B)I

    move-result v10

    const/16 v14, 0x1bb

    if-ne v10, v14, :cond_9

    .line 169
    invoke-virtual {v3, v11}, Ll/ᩳ֨֫;->ܳ(I)V

    .line 170
    invoke-virtual {v3}, Ll/ᩳ֨֫;->ۗ()I

    move-result v10

    .line 171
    invoke-virtual {v3}, Ll/ᩳ֨֫;->֫()I

    move-result v14

    if-ge v14, v10, :cond_8

    .line 172
    invoke-virtual {v3, v4}, Ll/ᩳ֨֫;->ܿ(I)V

    goto :goto_2

    .line 175
    :cond_8
    invoke-virtual {v3, v10}, Ll/ᩳ֨֫;->ܳ(I)V

    .line 182
    :cond_9
    :goto_1
    invoke-virtual {v3}, Ll/ᩳ֨֫;->֫()I

    move-result v10

    if-lt v10, v11, :cond_d

    .line 183
    invoke-virtual {v3}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v10

    invoke-virtual {v3}, Ll/ᩳ֨֫;->ᩳ()I

    move-result v14

    invoke-static {v14, v10}, Ll/۟֡ۧ;->֫(I[B)I

    move-result v10

    if-eq v10, v13, :cond_d

    const/16 v14, 0x1b9

    if-ne v10, v14, :cond_a

    goto :goto_2

    :cond_a
    ushr-int/lit8 v10, v10, 0x8

    if-eq v10, v12, :cond_b

    goto :goto_2

    .line 191
    :cond_b
    invoke-virtual {v3, v11}, Ll/ᩳ֨֫;->ܳ(I)V

    .line 193
    invoke-virtual {v3}, Ll/ᩳ֨֫;->֫()I

    move-result v10

    const/4 v14, 0x2

    if-ge v10, v14, :cond_c

    .line 195
    invoke-virtual {v3, v4}, Ll/ᩳ֨֫;->ܿ(I)V

    goto :goto_2

    .line 198
    :cond_c
    invoke-virtual {v3}, Ll/ᩳ֨֫;->ۗ()I

    move-result v10

    .line 200
    invoke-virtual {v3}, Ll/ᩳ֨֫;->ܿ()I

    move-result v14

    invoke-virtual {v3}, Ll/ᩳ֨֫;->ᩳ()I

    move-result v15

    add-int/2addr v15, v10

    invoke-static {v14, v15}, Ljava/lang/Math;->min(II)I

    move-result v10

    .line 199
    invoke-virtual {v3, v10}, Ll/ᩳ֨֫;->ܿ(I)V

    goto :goto_1

    .line 127
    :cond_d
    :goto_2
    invoke-virtual {v3}, Ll/ᩳ֨֫;->ᩳ()I

    move-result v4

    goto/16 :goto_0

    :cond_e
    cmp-long v3, v8, v5

    if-eqz v3, :cond_f

    int-to-long v3, v4

    add-long/2addr v1, v3

    .line 132
    invoke-static {v8, v9, v1, v2}, Ll/ܿ᩷ۧ;->ۧ(JJ)Ll/ܿ᩷ۧ;

    move-result-object v1

    return-object v1

    .line 135
    :cond_f
    sget-object v1, Ll/ܿ᩷ۧ;->ᩳ:Ll/ܿ᩷ۧ;

    return-object v1
.end method

.method public final ֫()V
    .locals 3

    .line 87
    sget-object v0, Ll/ۘ֨֫;->ܿ:[B

    iget-object v1, p0, Ll/ܰ֡ۧ;->֫:Ll/ᩳ֨֫;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 113
    array-length v2, v0

    invoke-virtual {v1, v2, v0}, Ll/ᩳ֨֫;->֫(I[B)V

    return-void
.end method
