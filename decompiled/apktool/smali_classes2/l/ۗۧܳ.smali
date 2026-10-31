.class public final Ll/ۗۧܳ;
.super Ljava/lang/Object;
.source "D70T"


# instance fields
.field public ֫:I

.field public ۧ:J

.field public ܽ:I

.field public final synthetic ܿ:Ll/۬ۧܳ;

.field public ᩳ:I


# direct methods
.method public constructor <init>(Ll/۬ۧܳ;IIJI)V
    .locals 0

    .line 5563
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۗۧܳ;->ܿ:Ll/۬ۧܳ;

    .line 5564
    iput p2, p0, Ll/ۗۧܳ;->ܽ:I

    .line 5565
    iput p3, p0, Ll/ۗۧܳ;->֫:I

    .line 5566
    iput-wide p4, p0, Ll/ۗۧܳ;->ۧ:J

    .line 5567
    iput p6, p0, Ll/ۗۧܳ;->ᩳ:I

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 6

    .line 5590
    invoke-virtual {p0}, Ll/ۗۧܳ;->ۧ()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 5593
    :cond_0
    iget-wide v0, p0, Ll/ۗۧܳ;->ۧ:J

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    iput-wide v0, p0, Ll/ۗۧܳ;->ۧ:J

    .line 5594
    iget-object v2, p0, Ll/ۗۧܳ;->ܿ:Ll/۬ۧܳ;

    invoke-static {v2}, Ll/۬ۧܳ;->ۧ(Ll/۬ۧܳ;)J

    move-result-wide v3

    cmp-long v5, v0, v3

    if-ltz v5, :cond_1

    :goto_0
    return-void

    .line 5597
    :cond_1
    invoke-static {v2}, Ll/۬ۧܳ;->֫(Ll/۬ۧܳ;)[Ll/ۧᩳܳ;

    move-result-object v0

    iget v1, p0, Ll/ۗۧܳ;->ܽ:I

    aget-object v0, v0, v1

    .line 5598
    iget v1, p0, Ll/ۗۧܳ;->֫:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Ll/ۗۧܳ;->֫:I

    .line 5599
    invoke-virtual {v0}, Ll/ۧᩳܳ;->ܽ()I

    move-result v3

    if-ge v1, v3, :cond_2

    .line 5600
    iget v1, p0, Ll/ۗۧܳ;->ᩳ:I

    invoke-virtual {v0, v1}, Ll/ۧᩳܳ;->ۧ(I)I

    move-result v0

    iput v0, p0, Ll/ۗۧܳ;->ᩳ:I

    return-void

    .line 5603
    :cond_2
    iget v0, p0, Ll/ۗۧܳ;->ܽ:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Ll/ۗۧܳ;->ܽ:I

    const/4 v0, 0x0

    .line 5604
    iput v0, p0, Ll/ۗۧܳ;->֫:I

    .line 5605
    invoke-static {v2}, Ll/۬ۧܳ;->֫(Ll/۬ۧܳ;)[Ll/ۧᩳܳ;

    move-result-object v1

    iget v2, p0, Ll/ۗۧܳ;->ܽ:I

    aget-object v1, v1, v2

    invoke-virtual {v1, v0}, Ll/ۧᩳܳ;->ܽ(I)I

    move-result v0

    iput v0, p0, Ll/ۗۧܳ;->ᩳ:I

    return-void
.end method

.method public final ۧ()Z
    .locals 5

    .line 5572
    iget-wide v0, p0, Ll/ۗۧܳ;->ۧ:J

    iget-object v2, p0, Ll/ۗۧܳ;->ܿ:Ll/۬ۧܳ;

    invoke-static {v2}, Ll/۬ۧܳ;->ۧ(Ll/۬ۧܳ;)J

    move-result-wide v2

    cmp-long v4, v0, v2

    if-gez v4, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ܽ()I
    .locals 2

    .line 5577
    invoke-virtual {p0}, Ll/ۗۧܳ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 5580
    iget v0, p0, Ll/ۗۧܳ;->ᩳ:I

    return v0

    .line 5578
    :cond_0
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    const-string v1, "Recipe cursor exhausted"

    invoke-direct {v0, v1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
