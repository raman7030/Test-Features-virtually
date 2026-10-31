.class public final Ll/ܰ᩻ܳ;
.super Ljava/lang/Object;
.source "D6L6"


# instance fields
.field public ֫:I

.field public ۧ:F

.field public ܽ:J

.field public ܿ:J

.field public ᩳ:I


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, -0x1

    .line 9
    iput-wide v0, p0, Ll/ܰ᩻ܳ;->ܿ:J

    const/4 v0, 0x0

    .line 11
    iput v0, p0, Ll/ܰ᩻ܳ;->ᩳ:I

    const/4 v0, 0x1

    iput v0, p0, Ll/ܰ᩻ܳ;->֫:I

    return-void
.end method

.method public static ֫(Ljava/util/List;IIII)Ljava/util/ArrayList;
    .locals 5

    .line 57
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    if-ltz p1, :cond_7

    if-lt p2, p1, :cond_7

    .line 58
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v1

    if-lt p1, v1, :cond_0

    goto :goto_5

    .line 59
    :cond_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-static {p2, v1}, Ljava/lang/Math;->min(II)I

    move-result p2

    move v1, p1

    :goto_0
    if-gt v1, p2, :cond_1

    .line 60
    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ᩳۜܳ;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    const/4 v1, 0x2

    if-ne p3, v1, :cond_2

    goto :goto_5

    :cond_2
    sub-int v2, p2, p1

    add-int/lit8 v3, v2, 0x1

    if-nez p3, :cond_3

    move v4, v3

    goto :goto_1

    :cond_3
    add-int/lit8 v4, v2, 0x2

    .line 63
    div-int/2addr v4, v1

    :goto_1
    if-nez p3, :cond_4

    add-int/2addr v2, v1

    .line 64
    div-int/2addr v2, v1

    goto :goto_2

    :cond_4
    div-int/lit8 v3, v3, 0x4

    invoke-static {v1, v3}, Ljava/lang/Math;->min(II)I

    move-result v2

    :goto_2
    if-lez p4, :cond_5

    add-int/lit8 p3, p2, 0x1

    goto :goto_3

    :cond_5
    add-int/lit8 p3, p1, -0x1

    .line 65
    :goto_3
    invoke-static {v0, p0, p3, p4, v4}, Ll/ܰ᩻ܳ;->֫(Ljava/util/ArrayList;Ljava/util/List;III)V

    if-lez p4, :cond_6

    add-int/lit8 p1, p1, -0x1

    goto :goto_4

    :cond_6
    add-int/lit8 p1, p2, 0x1

    :goto_4
    neg-int p2, p4

    .line 66
    invoke-static {v0, p0, p1, p2, v2}, Ll/ܰ᩻ܳ;->֫(Ljava/util/ArrayList;Ljava/util/List;III)V

    :cond_7
    :goto_5
    return-object v0
.end method

.method public static ֫(Ljava/util/ArrayList;Ljava/util/List;III)V
    .locals 2

    const/4 v0, 0x0

    :goto_0
    if-ge v0, p4, :cond_0

    if-ltz p2, :cond_0

    .line 71
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    if-ge p2, v1, :cond_0

    .line 72
    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ᩳۜܳ;

    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v0, 0x1

    add-int/2addr p2, p3

    goto :goto_0

    :cond_0
    return-void
.end method


# virtual methods
.method public final ֫()I
    .locals 1

    .line 45
    iget v0, p0, Ll/ܰ᩻ܳ;->֫:I

    return v0
.end method

.method public final ֫(JIIZZ)I
    .locals 6

    const/4 v0, 0x1

    if-eqz p3, :cond_1

    if-lez p3, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, -0x1

    .line 14
    :goto_0
    iput v1, p0, Ll/ܰ᩻ܳ;->֫:I

    :cond_1
    const/4 v1, 0x0

    if-nez p5, :cond_2

    if-nez p6, :cond_2

    const/4 p3, 0x0

    .line 16
    iput p3, p0, Ll/ܰ᩻ܳ;->ᩳ:I

    .line 17
    iput-wide p1, p0, Ll/ܰ᩻ܳ;->ܿ:J

    .line 18
    iput v1, p0, Ll/ܰ᩻ܳ;->ۧ:F

    goto :goto_2

    :cond_2
    const/4 p5, 0x2

    if-eqz p6, :cond_3

    .line 20
    iput p5, p0, Ll/ܰ᩻ܳ;->ᩳ:I

    .line 21
    iput-wide p1, p0, Ll/ܰ᩻ܳ;->ܿ:J

    iput-wide p1, p0, Ll/ܰ᩻ܳ;->ܽ:J

    .line 22
    iput v1, p0, Ll/ܰ᩻ܳ;->ۧ:F

    goto :goto_2

    .line 24
    :cond_3
    iget p6, p0, Ll/ܰ᩻ܳ;->ᩳ:I

    if-nez p6, :cond_4

    iput v0, p0, Ll/ܰ᩻ܳ;->ᩳ:I

    .line 25
    :cond_4
    iget-wide v2, p0, Ll/ܰ᩻ܳ;->ܿ:J

    const-wide/16 v4, 0x0

    cmp-long p6, v2, v4

    if-gez p6, :cond_5

    iput-wide p1, p0, Ll/ܰ᩻ܳ;->ܿ:J

    .line 26
    :cond_5
    iget p6, p0, Ll/ܰ᩻ܳ;->ۧ:F

    invoke-static {p3}, Ljava/lang/Math;->abs(I)I

    move-result p3

    int-to-float p3, p3

    add-float/2addr p6, p3

    iput p6, p0, Ll/ܰ᩻ܳ;->ۧ:F

    .line 27
    iget-wide v2, p0, Ll/ܰ᩻ܳ;->ܿ:J

    sub-long v2, p1, v2

    const-wide/16 v4, 0x28

    cmp-long p3, v2, v4

    if-ltz p3, :cond_8

    if-lez p4, :cond_8

    const/high16 p3, 0x447a0000    # 1000.0f

    mul-float p6, p6, p3

    int-to-float p3, p4

    long-to-float p4, v2

    mul-float p3, p3, p4

    div-float/2addr p6, p3

    const/high16 p3, 0x40000000    # 2.0f

    cmpl-float p3, p6, p3

    if-ltz p3, :cond_6

    .line 32
    iput p5, p0, Ll/ܰ᩻ܳ;->ᩳ:I

    .line 33
    iput-wide p1, p0, Ll/ܰ᩻ܳ;->ܽ:J

    goto :goto_1

    :cond_6
    const/high16 p3, 0x3f800000    # 1.0f

    cmpg-float p3, p6, p3

    if-gtz p3, :cond_7

    .line 34
    iget-wide p3, p0, Ll/ܰ᩻ܳ;->ܽ:J

    sub-long p3, p1, p3

    const-wide/16 p5, 0x78

    cmp-long v2, p3, p5

    if-ltz v2, :cond_7

    .line 35
    iput v0, p0, Ll/ܰ᩻ܳ;->ᩳ:I

    .line 37
    :cond_7
    :goto_1
    iput v1, p0, Ll/ܰ᩻ܳ;->ۧ:F

    .line 38
    iput-wide p1, p0, Ll/ܰ᩻ܳ;->ܿ:J

    .line 41
    :cond_8
    :goto_2
    iget p1, p0, Ll/ܰ᩻ܳ;->ᩳ:I

    return p1
.end method

.method public final ۧ()V
    .locals 2

    const-wide/16 v0, -0x1

    .line 49
    iput-wide v0, p0, Ll/ܰ᩻ܳ;->ܿ:J

    const/4 v0, 0x0

    .line 50
    iput v0, p0, Ll/ܰ᩻ܳ;->ۧ:F

    const/4 v0, 0x0

    .line 51
    iput v0, p0, Ll/ܰ᩻ܳ;->ᩳ:I

    const/4 v0, 0x1

    .line 52
    iput v0, p0, Ll/ܰ᩻ܳ;->֫:I

    return-void
.end method
