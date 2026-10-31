.class public final Ll/ܽۡۧ;
.super Ll/᩻᩷ۧ;
.source "G8K7"


# direct methods
.method public constructor <init>(Ll/ۛ᩷ۧ;IJJ)V
    .locals 16

    move-object/from16 v0, p1

    .line 51
    invoke-static/range {p1 .. p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iget v1, v0, Ll/ۛ᩷ۧ;->ۜ:I

    new-instance v3, Ll/۟ܰ᩷;

    const/4 v2, 0x1

    invoke-direct {v3, v2, v0}, Ll/۟ܰ᩷;-><init>(ILjava/lang/Object;)V

    new-instance v4, Ll/ۧۡۧ;

    move/from16 v2, p2

    invoke-direct {v4, v0, v2}, Ll/ۧۡۧ;-><init>(Ll/ۛ᩷ۧ;I)V

    .line 53
    invoke-virtual/range {p1 .. p1}, Ll/ۛ᩷ۧ;->֫()J

    move-result-wide v5

    iget-wide v7, v0, Ll/ۛ᩷ۧ;->ܺ:J

    .line 225
    iget v2, v0, Ll/ۛ᩷ۧ;->ܿ:I

    if-lez v2, :cond_0

    int-to-long v9, v2

    int-to-long v11, v1

    add-long/2addr v9, v11

    const-wide/16 v11, 0x2

    .line 226
    div-long/2addr v9, v11

    const-wide/16 v11, 0x1

    goto :goto_1

    .line 231
    :cond_0
    iget v2, v0, Ll/ۛ᩷ۧ;->᩻:I

    iget v9, v0, Ll/ۛ᩷ۧ;->ᩳ:I

    if-ne v2, v9, :cond_1

    if-lez v2, :cond_1

    int-to-long v9, v2

    goto :goto_0

    :cond_1
    const-wide/16 v9, 0x1000

    .line 234
    :goto_0
    iget v2, v0, Ll/ۛ᩷ۧ;->ܽ:I

    int-to-long v11, v2

    mul-long v9, v9, v11

    iget v0, v0, Ll/ۛ᩷ۧ;->֫:I

    int-to-long v11, v0

    mul-long v9, v9, v11

    const-wide/16 v11, 0x8

    div-long/2addr v9, v11

    const-wide/16 v11, 0x40

    :goto_1
    add-long v13, v9, v11

    const/4 v0, 0x6

    .line 59
    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v15

    move-object/from16 v2, p0

    move-wide/from16 v9, p3

    move-wide/from16 v11, p5

    .line 50
    invoke-direct/range {v2 .. v15}, Ll/᩻᩷ۧ;-><init>(Ll/ᩳ᩷ۧ;Ll/ܳ᩷ۧ;JJJJJI)V

    return-void
.end method
