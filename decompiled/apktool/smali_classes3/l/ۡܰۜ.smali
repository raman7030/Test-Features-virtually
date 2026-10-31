.class public final Ll/ۡܰۜ;
.super Ljava/lang/Object;
.source "76MD"


# instance fields
.field public final ֫:I

.field public final ۜ:I

.field public final ۧ:I

.field public final ܳ:I

.field public final ܽ:I

.field public final ܿ:I

.field public final ᩳ:I

.field public final ᩷:I

.field public final ᩻:I


# direct methods
.method public constructor <init>(IIIJJJJ)V
    .locals 16

    move-object/from16 v0, p0

    move/from16 v1, p3

    move-wide/from16 v2, p4

    move-wide/from16 v4, p6

    move-wide/from16 v6, p8

    move-wide/from16 v8, p10

    .line 105
    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    .line 106
    iput v1, v0, Ll/ۡܰۜ;->ۜ:I

    long-to-int v10, v2

    .line 107
    iput v10, v0, Ll/ۡܰۜ;->ܽ:I

    long-to-int v10, v4

    .line 108
    iput v10, v0, Ll/ۡܰۜ;->ܿ:I

    move/from16 v10, p1

    int-to-long v10, v10

    .line 109
    invoke-static {v10, v11, v6, v7}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v12

    long-to-int v13, v12

    iput v13, v0, Ll/ۡܰۜ;->ᩳ:I

    move/from16 v12, p2

    int-to-long v12, v12

    .line 110
    invoke-static {v12, v13, v8, v9}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v14

    long-to-int v15, v14

    iput v15, v0, Ll/ۡܰۜ;->ۧ:I

    int-to-long v14, v1

    sub-long v1, v2, v14

    move-wide/from16 p1, v12

    const-wide/16 v12, 0x0

    .line 111
    invoke-static {v12, v13, v1, v2}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v1

    long-to-int v2, v1

    iput v2, v0, Ll/ۡܰۜ;->ܳ:I

    sub-long v1, v4, v14

    .line 112
    invoke-static {v12, v13, v1, v2}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v1

    long-to-int v2, v1

    iput v2, v0, Ll/ۡܰۜ;->᩷:I

    add-long v1, v6, v14

    .line 113
    invoke-static {v10, v11, v1, v2}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v1

    long-to-int v2, v1

    iput v2, v0, Ll/ۡܰۜ;->᩻:I

    add-long v1, v8, v14

    move-wide/from16 v3, p1

    .line 114
    invoke-static {v3, v4, v1, v2}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v1

    long-to-int v2, v1

    iput v2, v0, Ll/ۡܰۜ;->֫:I

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    .line 125
    :cond_0
    instance-of v1, p1, Ll/ۡܰۜ;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    .line 126
    :cond_1
    check-cast p1, Ll/ۡܰۜ;

    .line 127
    iget v1, p0, Ll/ۡܰۜ;->ۜ:I

    iget v3, p1, Ll/ۡܰۜ;->ۜ:I

    if-ne v1, v3, :cond_2

    iget v1, p0, Ll/ۡܰۜ;->ܳ:I

    iget v3, p1, Ll/ۡܰۜ;->ܳ:I

    if-ne v1, v3, :cond_2

    iget v1, p0, Ll/ۡܰۜ;->᩷:I

    iget v3, p1, Ll/ۡܰۜ;->᩷:I

    if-ne v1, v3, :cond_2

    iget v1, p0, Ll/ۡܰۜ;->᩻:I

    iget v3, p1, Ll/ۡܰۜ;->᩻:I

    if-ne v1, v3, :cond_2

    iget v1, p0, Ll/ۡܰۜ;->֫:I

    iget v3, p1, Ll/ۡܰۜ;->֫:I

    if-ne v1, v3, :cond_2

    iget v1, p0, Ll/ۡܰۜ;->ܽ:I

    iget v3, p1, Ll/ۡܰۜ;->ܽ:I

    if-ne v1, v3, :cond_2

    iget v1, p0, Ll/ۡܰۜ;->ܿ:I

    iget v3, p1, Ll/ۡܰۜ;->ܿ:I

    if-ne v1, v3, :cond_2

    iget v1, p0, Ll/ۡܰۜ;->ᩳ:I

    iget v3, p1, Ll/ۡܰۜ;->ᩳ:I

    if-ne v1, v3, :cond_2

    iget v1, p0, Ll/ۡܰۜ;->ۧ:I

    iget p1, p1, Ll/ۡܰۜ;->ۧ:I

    if-ne v1, p1, :cond_2

    return v0

    :cond_2
    return v2
.end method

.method public final hashCode()I
    .locals 2

    .line 136
    iget v0, p0, Ll/ۡܰۜ;->ۜ:I

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Ll/ۡܰۜ;->ܳ:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 137
    iget v1, p0, Ll/ۡܰۜ;->᩷:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 138
    iget v1, p0, Ll/ۡܰۜ;->᩻:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 139
    iget v1, p0, Ll/ۡܰۜ;->֫:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 140
    iget v1, p0, Ll/ۡܰۜ;->ܽ:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 141
    iget v1, p0, Ll/ۡܰۜ;->ܿ:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 142
    iget v1, p0, Ll/ۡܰۜ;->ᩳ:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 143
    iget v1, p0, Ll/ۡܰۜ;->ۧ:I

    add-int/2addr v0, v1

    return v0
.end method
