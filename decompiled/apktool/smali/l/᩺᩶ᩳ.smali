.class public final Ll/᩺᩶ᩳ;
.super Ljava/lang/Object;
.source "E6TD"


# instance fields
.field public final ֫:Ll/ۨ᩹ᩳ;

.field public final ۜ:I

.field public final ۧ:J

.field public final ܳ:Ll/ۨ᩹ᩳ;

.field public final ܽ:J

.field public ܿ:Ll/᩸۬ᩳ;

.field public volatile ᩳ:J

.field public final ᩻:Ll/ۚۗᩳ;


# direct methods
.method public constructor <init>(IJJLl/ۚۗᩳ;Ll/ۨ᩹ᩳ;Ll/ۨ᩹ᩳ;)V
    .locals 7

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, -0x1

    .line 13
    iput-wide v0, p0, Ll/᩺᩶ᩳ;->ᩳ:J

    if-ltz p1, :cond_1

    int-to-long v0, p1

    .line 17
    invoke-virtual {p7}, Ll/ۨ᩹ᩳ;->ۧ()I

    move-result v2

    int-to-long v2, v2

    add-long/2addr v2, v0

    const-wide/32 v4, 0x7fffffff

    cmp-long v6, v2, v4

    if-gtz v6, :cond_1

    .line 18
    invoke-virtual {p8}, Ll/ۨ᩹ᩳ;->ۧ()I

    move-result v2

    int-to-long v2, v2

    add-long/2addr v0, v2

    cmp-long v2, v0, v4

    if-gtz v2, :cond_1

    .line 21
    iget-object v0, p7, Ll/ۨ᩹ᩳ;->ᩳ:Ll/᩸۬ᩳ;

    iget-object v1, p8, Ll/ۨ᩹ᩳ;->ᩳ:Ll/᩸۬ᩳ;

    if-ne v0, v1, :cond_0

    iget v0, p7, Ll/ۨ᩹ᩳ;->֫:I

    iget v1, p8, Ll/ۨ᩹ᩳ;->֫:I

    if-ne v0, v1, :cond_0

    iget v0, p7, Ll/ۨ᩹ᩳ;->ۧ:I

    iget v1, p8, Ll/ۨ᩹ᩳ;->ۧ:I

    if-ne v0, v1, :cond_0

    .line 24
    iput p1, p0, Ll/᩺᩶ᩳ;->ۜ:I

    .line 25
    iput-wide p2, p0, Ll/᩺᩶ᩳ;->ܽ:J

    .line 26
    iput-wide p4, p0, Ll/᩺᩶ᩳ;->ۧ:J

    .line 27
    invoke-static {p6}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p6, p0, Ll/᩺᩶ᩳ;->᩻:Ll/ۚۗᩳ;

    .line 28
    iput-object p7, p0, Ll/᩺᩶ᩳ;->ܳ:Ll/ۨ᩹ᩳ;

    .line 29
    iput-object p8, p0, Ll/᩺᩶ᩳ;->֫:Ll/ۨ᩹ᩳ;

    return-void

    .line 22
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "History fragments belong to different text stores"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 19
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Invalid history text range"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final ֫()Z
    .locals 1

    .line 32
    iget-object v0, p0, Ll/᩺᩶ᩳ;->ܳ:Ll/ۨ᩹ᩳ;

    invoke-virtual {v0}, Ll/ۨ᩹ᩳ;->ۧ()I

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Ll/᩺᩶ᩳ;->֫:Ll/ۨ᩹ᩳ;

    invoke-virtual {v0}, Ll/ۨ᩹ᩳ;->ۧ()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
