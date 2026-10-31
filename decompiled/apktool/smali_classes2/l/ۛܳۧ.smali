.class public final Ll/ۛܳۧ;
.super Ljava/lang/Object;
.source "G8MT"


# instance fields
.field public ֫:J

.field public final ۜ:[Z

.field public ۧ:J

.field public ܳ:J

.field public ܽ:J

.field public ܿ:J

.field public ᩳ:J

.field public ᩻:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 157
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0xf

    new-array v0, v0, [Z

    .line 158
    iput-object v0, p0, Ll/ۛܳۧ;->ۜ:[Z

    return-void
.end method


# virtual methods
.method public final ֫()J
    .locals 5

    .line 186
    iget-wide v0, p0, Ll/ۛܳۧ;->ܿ:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    return-wide v2

    :cond_0
    iget-wide v2, p0, Ll/ۛܳۧ;->ܳ:J

    div-long/2addr v2, v0

    return-wide v2
.end method

.method public final ֫(J)V
    .locals 12

    .line 190
    iget-wide v0, p0, Ll/ۛܳۧ;->ܽ:J

    const-wide/16 v2, 0x0

    const-wide/16 v4, 0x1

    cmp-long v6, v0, v2

    if-nez v6, :cond_0

    .line 191
    iput-wide p1, p0, Ll/ۛܳۧ;->ۧ:J

    goto :goto_0

    :cond_0
    cmp-long v2, v0, v4

    if-nez v2, :cond_1

    .line 194
    iget-wide v0, p0, Ll/ۛܳۧ;->ۧ:J

    sub-long v0, p1, v0

    iput-wide v0, p0, Ll/ۛܳۧ;->֫:J

    .line 195
    iput-wide v0, p0, Ll/ۛܳۧ;->ܳ:J

    .line 196
    iput-wide v4, p0, Ll/ۛܳۧ;->ܿ:J

    goto :goto_0

    .line 198
    :cond_1
    iget-wide v2, p0, Ll/ۛܳۧ;->ᩳ:J

    sub-long v2, p1, v2

    const-wide/16 v6, 0xf

    .line 221
    rem-long/2addr v0, v6

    long-to-int v1, v0

    .line 200
    iget-wide v6, p0, Ll/ۛܳۧ;->֫:J

    sub-long v6, v2, v6

    invoke-static {v6, v7}, Ljava/lang/Math;->abs(J)J

    move-result-wide v6

    const-wide/32 v8, 0xf4240

    iget-object v0, p0, Ll/ۛܳۧ;->ۜ:[Z

    const/4 v10, 0x1

    cmp-long v11, v6, v8

    if-gtz v11, :cond_2

    .line 202
    iget-wide v6, p0, Ll/ۛܳۧ;->ܿ:J

    add-long/2addr v6, v4

    iput-wide v6, p0, Ll/ۛܳۧ;->ܿ:J

    .line 203
    iget-wide v6, p0, Ll/ۛܳۧ;->ܳ:J

    add-long/2addr v6, v2

    iput-wide v6, p0, Ll/ۛܳۧ;->ܳ:J

    .line 204
    aget-boolean v2, v0, v1

    if-eqz v2, :cond_3

    const/4 v2, 0x0

    .line 205
    aput-boolean v2, v0, v1

    .line 206
    iget v0, p0, Ll/ۛܳۧ;->᩻:I

    sub-int/2addr v0, v10

    iput v0, p0, Ll/ۛܳۧ;->᩻:I

    goto :goto_0

    .line 209
    :cond_2
    aget-boolean v2, v0, v1

    if-nez v2, :cond_3

    .line 210
    aput-boolean v10, v0, v1

    .line 211
    iget v0, p0, Ll/ۛܳۧ;->᩻:I

    add-int/2addr v0, v10

    iput v0, p0, Ll/ۛܳۧ;->᩻:I

    .line 216
    :cond_3
    :goto_0
    iget-wide v0, p0, Ll/ۛܳۧ;->ܽ:J

    add-long/2addr v0, v4

    iput-wide v0, p0, Ll/ۛܳۧ;->ܽ:J

    .line 217
    iput-wide p1, p0, Ll/ۛܳۧ;->ᩳ:J

    return-void
.end method

.method public final ۧ()J
    .locals 2

    .line 182
    iget-wide v0, p0, Ll/ۛܳۧ;->ܳ:J

    return-wide v0
.end method

.method public final ܽ()Z
    .locals 5

    .line 175
    iget-wide v0, p0, Ll/ۛܳۧ;->ܽ:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    const-wide/16 v2, 0x1

    sub-long/2addr v0, v2

    const-wide/16 v2, 0xf

    .line 221
    rem-long/2addr v0, v2

    long-to-int v1, v0

    .line 178
    iget-object v0, p0, Ll/ۛܳۧ;->ۜ:[Z

    aget-boolean v0, v0, v1

    return v0
.end method

.method public final ܿ()V
    .locals 2

    const-wide/16 v0, 0x0

    .line 162
    iput-wide v0, p0, Ll/ۛܳۧ;->ܽ:J

    .line 163
    iput-wide v0, p0, Ll/ۛܳۧ;->ܿ:J

    .line 164
    iput-wide v0, p0, Ll/ۛܳۧ;->ܳ:J

    const/4 v0, 0x0

    .line 165
    iput v0, p0, Ll/ۛܳۧ;->᩻:I

    .line 166
    iget-object v1, p0, Ll/ۛܳۧ;->ۜ:[Z

    invoke-static {v1, v0}, Ljava/util/Arrays;->fill([ZZ)V

    return-void
.end method

.method public final ᩳ()Z
    .locals 5

    .line 170
    iget-wide v0, p0, Ll/ۛܳۧ;->ܽ:J

    const-wide/16 v2, 0xf

    cmp-long v4, v0, v2

    if-lez v4, :cond_0

    iget v0, p0, Ll/ۛܳۧ;->᩻:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
