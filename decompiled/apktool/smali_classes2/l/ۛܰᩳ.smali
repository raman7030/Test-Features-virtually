.class public final Ll/ۛܰᩳ;
.super Ljava/lang/Object;
.source "N6T5"


# instance fields
.field public ֡:Z

.field public ֫:Z

.field public ۖ:I

.field public ۘ:I

.field public ۚ:I

.field public ۜ:Z

.field public ۡ:I

.field public ۢ:Z

.field public ۧ:Ljava/util/ArrayList;

.field public ܳ:Ljava/util/ArrayList;

.field public ܺ:I

.field public ܽ:Ll/۬ܰᩳ;

.field public ܿ:[B

.field public ᩳ:I

.field public ᩴ:I

.field public ᩵:I

.field public ᩷:Z

.field public ᩻:Z


# virtual methods
.method public final ֫()J
    .locals 4

    .line 27
    iget-boolean v0, p0, Ll/ۛܰᩳ;->᩻:Z

    if-nez v0, :cond_0

    const-wide/16 v0, 0x0

    return-wide v0

    :cond_0
    iget v0, p0, Ll/ۛܰᩳ;->ۘ:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_1

    iget v2, p0, Ll/ۛܰᩳ;->ᩳ:I

    if-eq v2, v1, :cond_1

    const-wide/16 v0, -0x1

    return-wide v0

    :cond_1
    int-to-long v0, v0

    const-wide v2, 0xffffffffL

    and-long/2addr v0, v2

    return-wide v0
.end method
