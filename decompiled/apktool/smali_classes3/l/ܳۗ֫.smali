.class public final Ll/ܳۗ֫;
.super Ljava/lang/Object;
.source "F8T9"


# instance fields
.field public final ֫:J

.field public final ۜ:Z

.field public final ۢ:J

.field public final ۧ:J

.field public final ܳ:Z

.field public final ܽ:Ll/ܺۧۧ;

.field public final ܿ:Z

.field public final ᩳ:Z

.field public final ᩷:J

.field public final ᩻:Z


# direct methods
.method public constructor <init>(Ll/ܺۧۧ;JJJJZZZZZ)V
    .locals 7

    move-object v0, p0

    move/from16 v1, p11

    move/from16 v2, p12

    move/from16 v3, p13

    move/from16 v4, p14

    .line 97
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v5, 0x1

    if-eqz v4, :cond_1

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v6, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v6, 0x1

    .line 98
    :goto_1
    invoke-static {v6}, Ll/᩺֡֫;->֫(Z)V

    if-eqz v3, :cond_3

    if-eqz v2, :cond_2

    goto :goto_2

    :cond_2
    const/4 v6, 0x0

    goto :goto_3

    :cond_3
    :goto_2
    const/4 v6, 0x1

    .line 99
    :goto_3
    invoke-static {v6}, Ll/᩺֡֫;->֫(Z)V

    if-eqz v1, :cond_5

    if-nez v2, :cond_4

    if-nez v3, :cond_4

    if-nez v4, :cond_4

    goto :goto_4

    :cond_4
    const/4 v5, 0x0

    .line 100
    :cond_5
    :goto_4
    invoke-static {v5}, Ll/᩺֡֫;->֫(Z)V

    move-object v5, p1

    .line 103
    iput-object v5, v0, Ll/ܳۗ֫;->ܽ:Ll/ܺۧۧ;

    move-wide v5, p2

    .line 104
    iput-wide v5, v0, Ll/ܳۗ֫;->ۢ:J

    move-wide v5, p4

    .line 105
    iput-wide v5, v0, Ll/ܳۗ֫;->᩷:J

    move-wide v5, p6

    .line 106
    iput-wide v5, v0, Ll/ܳۗ֫;->ۧ:J

    move-wide v5, p8

    .line 107
    iput-wide v5, v0, Ll/ܳۗ֫;->֫:J

    move/from16 v5, p10

    .line 108
    iput-boolean v5, v0, Ll/ܳۗ֫;->ۜ:Z

    .line 109
    iput-boolean v1, v0, Ll/ܳۗ֫;->ܿ:Z

    .line 110
    iput-boolean v2, v0, Ll/ܳۗ֫;->ܳ:Z

    .line 111
    iput-boolean v3, v0, Ll/ܳۗ֫;->᩻:Z

    .line 112
    iput-boolean v4, v0, Ll/ܳۗ֫;->ᩳ:Z

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_2

    .line 160
    const-class v2, Ll/ܳۗ֫;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_0

    .line 163
    :cond_1
    check-cast p1, Ll/ܳۗ֫;

    .line 164
    iget-wide v2, p0, Ll/ܳۗ֫;->ۢ:J

    iget-wide v4, p1, Ll/ܳۗ֫;->ۢ:J

    cmp-long v6, v2, v4

    if-nez v6, :cond_2

    iget-wide v2, p0, Ll/ܳۗ֫;->᩷:J

    iget-wide v4, p1, Ll/ܳۗ֫;->᩷:J

    cmp-long v6, v2, v4

    if-nez v6, :cond_2

    iget-wide v2, p0, Ll/ܳۗ֫;->ۧ:J

    iget-wide v4, p1, Ll/ܳۗ֫;->ۧ:J

    cmp-long v6, v2, v4

    if-nez v6, :cond_2

    iget-wide v2, p0, Ll/ܳۗ֫;->֫:J

    iget-wide v4, p1, Ll/ܳۗ֫;->֫:J

    cmp-long v6, v2, v4

    if-nez v6, :cond_2

    iget-boolean v2, p0, Ll/ܳۗ֫;->ۜ:Z

    iget-boolean v3, p1, Ll/ܳۗ֫;->ۜ:Z

    if-ne v2, v3, :cond_2

    iget-boolean v2, p0, Ll/ܳۗ֫;->ܿ:Z

    iget-boolean v3, p1, Ll/ܳۗ֫;->ܿ:Z

    if-ne v2, v3, :cond_2

    iget-boolean v2, p0, Ll/ܳۗ֫;->ܳ:Z

    iget-boolean v3, p1, Ll/ܳۗ֫;->ܳ:Z

    if-ne v2, v3, :cond_2

    iget-boolean v2, p0, Ll/ܳۗ֫;->᩻:Z

    iget-boolean v3, p1, Ll/ܳۗ֫;->᩻:Z

    if-ne v2, v3, :cond_2

    iget-boolean v2, p0, Ll/ܳۗ֫;->ᩳ:Z

    iget-boolean v3, p1, Ll/ܳۗ֫;->ᩳ:Z

    if-ne v2, v3, :cond_2

    iget-object v2, p0, Ll/ܳۗ֫;->ܽ:Ll/ܺۧۧ;

    iget-object p1, p1, Ll/ܳۗ֫;->ܽ:Ll/ܺۧۧ;

    .line 173
    invoke-static {v2, p1}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    return v0

    :cond_2
    :goto_0
    return v1
.end method

.method public final hashCode()I
    .locals 3

    .line 179
    iget-object v0, p0, Ll/ܳۗ֫;->ܽ:Ll/ܺۧۧ;

    invoke-virtual {v0}, Ll/ܺۧۧ;->hashCode()I

    move-result v0

    add-int/lit16 v0, v0, 0x20f

    mul-int/lit8 v0, v0, 0x1f

    .line 180
    iget-wide v1, p0, Ll/ܳۗ֫;->ۢ:J

    long-to-int v2, v1

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    .line 181
    iget-wide v1, p0, Ll/ܳۗ֫;->᩷:J

    long-to-int v2, v1

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    .line 182
    iget-wide v1, p0, Ll/ܳۗ֫;->ۧ:J

    long-to-int v2, v1

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    .line 183
    iget-wide v1, p0, Ll/ܳۗ֫;->֫:J

    long-to-int v2, v1

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    .line 184
    iget-boolean v1, p0, Ll/ܳۗ֫;->ۜ:Z

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 185
    iget-boolean v1, p0, Ll/ܳۗ֫;->ܿ:Z

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 186
    iget-boolean v1, p0, Ll/ܳۗ֫;->ܳ:Z

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 187
    iget-boolean v1, p0, Ll/ܳۗ֫;->᩻:Z

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 188
    iget-boolean v1, p0, Ll/ܳۗ֫;->ᩳ:Z

    add-int/2addr v0, v1

    return v0
.end method

.method public final ֫(J)Ll/ܳۗ֫;
    .locals 18

    move-object/from16 v0, p0

    .line 140
    iget-wide v1, v0, Ll/ܳۗ֫;->᩷:J

    cmp-long v3, p1, v1

    if-nez v3, :cond_0

    return-object v0

    .line 142
    :cond_0
    new-instance v1, Ll/ܳۗ֫;

    iget-boolean v2, v0, Ll/ܳۗ֫;->᩻:Z

    iget-boolean v15, v0, Ll/ܳۗ֫;->ᩳ:Z

    iget-object v4, v0, Ll/ܳۗ֫;->ܽ:Ll/ܺۧۧ;

    iget-wide v5, v0, Ll/ܳۗ֫;->ۢ:J

    iget-wide v9, v0, Ll/ܳۗ֫;->ۧ:J

    iget-wide v11, v0, Ll/ܳۗ֫;->֫:J

    iget-boolean v13, v0, Ll/ܳۗ֫;->ۜ:Z

    iget-boolean v14, v0, Ll/ܳۗ֫;->ܿ:Z

    iget-boolean v7, v0, Ll/ܳۗ֫;->ܳ:Z

    move-object v3, v1

    move/from16 v16, v7

    move-wide/from16 v7, p1

    move/from16 v17, v15

    move/from16 v15, v16

    move/from16 v16, v2

    invoke-direct/range {v3 .. v17}, Ll/ܳۗ֫;-><init>(Ll/ܺۧۧ;JJJJZZZZZ)V

    return-object v1
.end method

.method public final ۧ(J)Ll/ܳۗ֫;
    .locals 18

    move-object/from16 v0, p0

    .line 120
    iget-wide v1, v0, Ll/ܳۗ֫;->ۢ:J

    cmp-long v3, p1, v1

    if-nez v3, :cond_0

    return-object v0

    .line 122
    :cond_0
    new-instance v1, Ll/ܳۗ֫;

    iget-boolean v2, v0, Ll/ܳۗ֫;->᩻:Z

    iget-boolean v15, v0, Ll/ܳۗ֫;->ᩳ:Z

    iget-object v4, v0, Ll/ܳۗ֫;->ܽ:Ll/ܺۧۧ;

    iget-wide v7, v0, Ll/ܳۗ֫;->᩷:J

    iget-wide v9, v0, Ll/ܳۗ֫;->ۧ:J

    iget-wide v11, v0, Ll/ܳۗ֫;->֫:J

    iget-boolean v13, v0, Ll/ܳۗ֫;->ۜ:Z

    iget-boolean v14, v0, Ll/ܳۗ֫;->ܿ:Z

    iget-boolean v5, v0, Ll/ܳۗ֫;->ܳ:Z

    move-object v3, v1

    move/from16 v16, v5

    move-wide/from16 v5, p1

    move/from16 v17, v15

    move/from16 v15, v16

    move/from16 v16, v2

    invoke-direct/range {v3 .. v17}, Ll/ܳۗ֫;-><init>(Ll/ܺۧۧ;JJJJZZZZZ)V

    return-object v1
.end method
