.class public final Ll/᩷ۖۧ;
.super Ljava/lang/Object;
.source "X8LV"


# instance fields
.field public final ֫:J

.field public final ۧ:I

.field public final ܳ:[J

.field public final ܽ:I

.field public final ܿ:Ll/ܿۢۧ;

.field public final ᩳ:J


# direct methods
.method public constructor <init>(Ll/ܿۢۧ;JJ[JII)V
    .locals 2

    .line 62
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 63
    new-instance v0, Ll/ܿۢۧ;

    .line 55
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 56
    iget v1, p1, Ll/ܿۢۧ;->᩻:I

    iput v1, v0, Ll/ܿۢۧ;->᩻:I

    .line 57
    iget-object v1, p1, Ll/ܿۢۧ;->ᩳ:Ljava/lang/String;

    iput-object v1, v0, Ll/ܿۢۧ;->ᩳ:Ljava/lang/String;

    .line 58
    iget v1, p1, Ll/ܿۢۧ;->ܽ:I

    iput v1, v0, Ll/ܿۢۧ;->ܽ:I

    .line 59
    iget v1, p1, Ll/ܿۢۧ;->ܿ:I

    iput v1, v0, Ll/ܿۢۧ;->ܿ:I

    .line 60
    iget v1, p1, Ll/ܿۢۧ;->ۧ:I

    iput v1, v0, Ll/ܿۢۧ;->ۧ:I

    .line 61
    iget v1, p1, Ll/ܿۢۧ;->֫:I

    iput v1, v0, Ll/ܿۢۧ;->֫:I

    .line 62
    iget p1, p1, Ll/ܿۢۧ;->ܳ:I

    iput p1, v0, Ll/ܿۢۧ;->ܳ:I

    .line 63
    iput-object v0, p0, Ll/᩷ۖۧ;->ܿ:Ll/ܿۢۧ;

    .line 64
    iput-wide p2, p0, Ll/᩷ۖۧ;->ᩳ:J

    .line 65
    iput-wide p4, p0, Ll/᩷ۖۧ;->֫:J

    .line 66
    iput-object p6, p0, Ll/᩷ۖۧ;->ܳ:[J

    .line 67
    iput p7, p0, Ll/᩷ۖۧ;->ۧ:I

    .line 68
    iput p8, p0, Ll/᩷ۖۧ;->ܽ:I

    return-void
.end method

.method public static ֫(Ll/ܿۢۧ;Ll/ᩳ֨֫;)Ll/᩷ۖۧ;
    .locals 13

    .line 83
    invoke-virtual {p1}, Ll/ᩳ֨֫;->᩻()I

    move-result v0

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    .line 84
    invoke-virtual {p1}, Ll/ᩳ֨֫;->᩹()I

    move-result v1

    goto :goto_0

    :cond_0
    const/4 v1, -0x1

    :goto_0
    and-int/lit8 v2, v0, 0x2

    if-eqz v2, :cond_1

    .line 85
    invoke-virtual {p1}, Ll/ᩳ֨֫;->ܶ()J

    move-result-wide v2

    goto :goto_1

    :cond_1
    const-wide/16 v2, -0x1

    :goto_1
    move-wide v8, v2

    and-int/lit8 v2, v0, 0x4

    const/4 v3, 0x4

    if-ne v2, v3, :cond_3

    const/16 v2, 0x64

    new-array v4, v2, [J

    const/4 v5, 0x0

    :goto_2
    if-ge v5, v2, :cond_2

    .line 91
    invoke-virtual {p1}, Ll/ᩳ֨֫;->֨()I

    move-result v6

    int-to-long v6, v6

    aput-wide v6, v4, v5

    add-int/lit8 v5, v5, 0x1

    goto :goto_2

    :cond_2
    move-object v10, v4

    goto :goto_3

    :cond_3
    const/4 v2, 0x0

    move-object v10, v2

    :goto_3
    and-int/lit8 v0, v0, 0x8

    if-eqz v0, :cond_4

    .line 98
    invoke-virtual {p1, v3}, Ll/ᩳ֨֫;->ܳ(I)V

    .line 106
    :cond_4
    invoke-virtual {p1}, Ll/ᩳ֨֫;->֫()I

    move-result v0

    const/16 v2, 0x18

    if-lt v0, v2, :cond_5

    const/16 v0, 0x15

    .line 107
    invoke-virtual {p1, v0}, Ll/ᩳ֨֫;->ܳ(I)V

    .line 108
    invoke-virtual {p1}, Ll/ᩳ֨֫;->᩸()I

    move-result p1

    const v0, 0xfff000

    and-int/2addr v0, p1

    shr-int/lit8 v0, v0, 0xc

    and-int/lit16 p1, p1, 0xfff

    move v12, p1

    move v11, v0

    goto :goto_4

    :cond_5
    const/4 p1, -0x1

    const/4 v0, -0x1

    const/4 v11, -0x1

    const/4 v12, -0x1

    .line 116
    :goto_4
    new-instance p1, Ll/᩷ۖۧ;

    int-to-long v6, v1

    move-object v4, p1

    move-object v5, p0

    invoke-direct/range {v4 .. v12}, Ll/᩷ۖۧ;-><init>(Ll/ܿۢۧ;JJ[JII)V

    return-object p1
.end method


# virtual methods
.method public final ֫()J
    .locals 6

    const-wide/16 v0, -0x1

    .line 126
    iget-wide v2, p0, Ll/᩷ۖۧ;->ᩳ:J

    cmp-long v4, v2, v0

    if-eqz v4, :cond_1

    const-wide/16 v0, 0x0

    cmp-long v4, v2, v0

    if-nez v4, :cond_0

    goto :goto_0

    .line 132
    :cond_0
    iget-object v0, p0, Ll/᩷ۖۧ;->ܿ:Ll/ܿۢۧ;

    iget v1, v0, Ll/ܿۢۧ;->ܳ:I

    int-to-long v4, v1

    mul-long v2, v2, v4

    const-wide/16 v4, 0x1

    sub-long/2addr v2, v4

    iget v0, v0, Ll/ܿۢۧ;->ܿ:I

    invoke-static {v0, v2, v3}, Ll/ۘ֨֫;->֫(IJ)J

    move-result-wide v0

    return-wide v0

    :cond_1
    :goto_0
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    return-wide v0
.end method
