.class public final Ll/᩻ۚۧ;
.super Ljava/lang/Object;
.source "88S1"

# interfaces
.implements Ll/ܳ᩷ۧ;


# instance fields
.field public final ֫:Ll/ᩳ֨֫;

.field public final ۧ:I

.field public final ܽ:Ll/ۢ֨֫;


# direct methods
.method public constructor <init>(ILl/ۢ֨֫;)V
    .locals 0

    .line 76
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 77
    iput p1, p0, Ll/᩻ۚۧ;->ۧ:I

    .line 78
    iput-object p2, p0, Ll/᩻ۚۧ;->ܽ:Ll/ۢ֨֫;

    .line 80
    new-instance p1, Ll/ᩳ֨֫;

    invoke-direct {p1}, Ll/ᩳ֨֫;-><init>()V

    iput-object p1, p0, Ll/᩻ۚۧ;->֫:Ll/ᩳ֨֫;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/۠᩷ۧ;J)Ll/ܿ᩷ۧ;
    .locals 16

    move-object/from16 v0, p0

    .line 86
    invoke-interface/range {p1 .. p1}, Ll/۠᩷ۧ;->getPosition()J

    move-result-wide v1

    const v3, 0x1b8a0

    int-to-long v3, v3

    .line 87
    invoke-interface/range {p1 .. p1}, Ll/۠᩷ۧ;->getLength()J

    move-result-wide v5

    sub-long/2addr v5, v1

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v3

    long-to-int v4, v3

    .line 89
    iget-object v3, v0, Ll/᩻ۚۧ;->֫:Ll/ᩳ֨֫;

    invoke-virtual {v3, v4}, Ll/ᩳ֨֫;->ܽ(I)V

    .line 90
    invoke-virtual {v3}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v5

    const/4 v6, 0x0

    move-object/from16 v7, p1

    invoke-interface {v7, v6, v4, v5}, Ll/۠᩷ۧ;->֫(II[B)V

    .line 97
    invoke-virtual {v3}, Ll/ᩳ֨֫;->ܿ()I

    move-result v4

    const-wide/16 v5, -0x1

    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    move-wide v9, v7

    move-wide v7, v5

    .line 103
    :goto_0
    invoke-virtual {v3}, Ll/ᩳ֨֫;->֫()I

    move-result v11

    const/16 v12, 0xbc

    if-lt v11, v12, :cond_6

    .line 105
    invoke-virtual {v3}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v11

    invoke-virtual {v3}, Ll/ᩳ֨֫;->ᩳ()I

    move-result v12

    :goto_1
    if-ge v12, v4, :cond_0

    .line 64
    aget-byte v13, v11, v12

    const/16 v14, 0x47

    if-eq v13, v14, :cond_0

    add-int/lit8 v12, v12, 0x1

    goto :goto_1

    :cond_0
    const-wide v14, -0x7fffffffffffffffL    # -4.9E-324

    add-int/lit16 v11, v12, 0xbc

    if-le v11, v4, :cond_1

    goto :goto_2

    .line 110
    :cond_1
    iget v5, v0, Ll/᩻ۚۧ;->ۧ:I

    invoke-static {v3, v12, v5}, Ll/ۨܺܺ;->֫(Ll/ᩳ֨֫;II)J

    move-result-wide v5

    cmp-long v13, v5, v14

    if-eqz v13, :cond_5

    .line 112
    iget-object v13, v0, Ll/᩻ۚۧ;->ܽ:Ll/ۢ֨֫;

    invoke-virtual {v13, v5, v6}, Ll/ۢ֨֫;->ۧ(J)J

    move-result-wide v5

    cmp-long v13, v5, p2

    if-lez v13, :cond_3

    cmp-long v3, v9, v14

    if-nez v3, :cond_2

    .line 116
    invoke-static {v5, v6, v1, v2}, Ll/ܿ᩷ۧ;->֫(JJ)Ll/ܿ᩷ۧ;

    move-result-object v1

    return-object v1

    :cond_2
    add-long/2addr v1, v7

    .line 119
    invoke-static {v1, v2}, Ll/ܿ᩷ۧ;->֫(J)Ll/ܿ᩷ۧ;

    move-result-object v1

    return-object v1

    :cond_3
    const-wide/32 v7, 0x186a0

    add-long/2addr v7, v5

    cmp-long v9, v7, p2

    if-lez v9, :cond_4

    int-to-long v3, v12

    add-long/2addr v1, v3

    .line 124
    invoke-static {v1, v2}, Ll/ܿ᩷ۧ;->֫(J)Ll/ܿ᩷ۧ;

    move-result-object v1

    return-object v1

    :cond_4
    int-to-long v7, v12

    move-wide v9, v5

    .line 130
    :cond_5
    invoke-virtual {v3, v11}, Ll/ᩳ֨֫;->ܿ(I)V

    int-to-long v5, v11

    goto :goto_0

    :cond_6
    const-wide v14, -0x7fffffffffffffffL    # -4.9E-324

    :goto_2
    cmp-long v3, v9, v14

    if-eqz v3, :cond_7

    add-long/2addr v1, v5

    .line 136
    invoke-static {v9, v10, v1, v2}, Ll/ܿ᩷ۧ;->ۧ(JJ)Ll/ܿ᩷ۧ;

    move-result-object v1

    return-object v1

    .line 139
    :cond_7
    sget-object v1, Ll/ܿ᩷ۧ;->ᩳ:Ll/ܿ᩷ۧ;

    return-object v1
.end method

.method public final ֫()V
    .locals 3

    .line 145
    sget-object v0, Ll/ۘ֨֫;->ܿ:[B

    iget-object v1, p0, Ll/᩻ۚۧ;->֫:Ll/ᩳ֨֫;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 113
    array-length v2, v0

    invoke-virtual {v1, v2, v0}, Ll/ᩳ֨֫;->֫(I[B)V

    return-void
.end method
