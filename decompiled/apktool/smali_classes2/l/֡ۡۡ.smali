.class public final Ll/֡ۡۡ;
.super Ljava/lang/Object;
.source "47G1"


# instance fields
.field public ֫:F

.field public final ۜ:I

.field public ۧ:F

.field public ܳ:I

.field public ܽ:Z

.field public ܿ:Ljava/lang/Object;

.field public final ᩳ:I

.field public ᩷:Z

.field public ᩻:Z


# direct methods
.method public constructor <init>(II)V
    .locals 1

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 17
    iput v0, p0, Ll/֡ۡۡ;->ܳ:I

    .line 28
    iput p1, p0, Ll/֡ۡۡ;->ᩳ:I

    .line 29
    iput p2, p0, Ll/֡ۡۡ;->ۜ:I

    return-void
.end method


# virtual methods
.method public final ֫(Landroid/view/View;FFI)Ll/᩵ۡۡ;
    .locals 1

    .line 52
    iget-boolean v0, p0, Ll/֡ۡۡ;->᩻:Z

    if-eqz v0, :cond_8

    iget-boolean v0, p0, Ll/֡ۡۡ;->᩷:Z

    if-eqz v0, :cond_0

    goto/16 :goto_2

    :cond_0
    if-eqz p1, :cond_7

    .line 55
    iget-object v0, p0, Ll/֡ۡۡ;->ܿ:Ljava/lang/Object;

    if-ne p1, v0, :cond_7

    iget p1, p0, Ll/֡ۡۡ;->ܳ:I

    if-eq p4, p1, :cond_1

    goto :goto_1

    .line 60
    :cond_1
    iget p1, p0, Ll/֡ۡۡ;->֫:F

    sub-float/2addr p2, p1

    .line 61
    iget p1, p0, Ll/֡ۡۡ;->ۧ:F

    sub-float/2addr p3, p1

    .line 62
    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    move-result p1

    .line 63
    invoke-static {p3}, Ljava/lang/Math;->abs(F)F

    move-result p3

    const/4 p4, 0x0

    .line 66
    iget v0, p0, Ll/֡ۡۡ;->ᩳ:I

    cmpg-float p4, p2, p4

    if-gez p4, :cond_2

    int-to-float p4, v0

    cmpl-float p4, p1, p4

    if-lez p4, :cond_2

    cmpl-float p4, p1, p3

    if-lez p4, :cond_2

    .line 67
    invoke-virtual {p0}, Ll/֡ۡۡ;->֫()V

    .line 68
    sget-object p1, Ll/᩵ۡۡ;->ۙ:Ll/᩵ۡۡ;

    return-object p1

    :cond_2
    int-to-float p4, v0

    cmpl-float v0, p3, p4

    if-lez v0, :cond_3

    cmpl-float p1, p3, p1

    if-lez p1, :cond_3

    .line 71
    invoke-virtual {p0}, Ll/֡ۡۡ;->֫()V

    .line 72
    sget-object p1, Ll/᩵ۡۡ;->ۙ:Ll/᩵ۡۡ;

    return-object p1

    :cond_3
    const/4 p1, 0x1

    cmpl-float p4, p2, p4

    if-lez p4, :cond_4

    cmpl-float p4, p2, p3

    if-lez p4, :cond_4

    const/4 p4, 0x1

    goto :goto_0

    :cond_4
    const/4 p4, 0x0

    .line 76
    :goto_0
    iget v0, p0, Ll/֡ۡۡ;->ۜ:I

    int-to-float v0, v0

    cmpl-float v0, p2, v0

    if-ltz v0, :cond_5

    cmpl-float p2, p2, p3

    if-lez p2, :cond_5

    .line 77
    iput-boolean p1, p0, Ll/֡ۡۡ;->ܽ:Z

    .line 78
    iput-boolean p1, p0, Ll/֡ۡۡ;->᩷:Z

    .line 79
    sget-object p1, Ll/᩵ۡۡ;->۬:Ll/᩵ۡۡ;

    return-object p1

    :cond_5
    if-eqz p4, :cond_6

    .line 81
    iget-boolean p2, p0, Ll/֡ۡۡ;->ܽ:Z

    if-nez p2, :cond_6

    .line 82
    iput-boolean p1, p0, Ll/֡ۡۡ;->ܽ:Z

    .line 83
    sget-object p1, Ll/᩵ۡۡ;->ۗ:Ll/᩵ۡۡ;

    return-object p1

    .line 85
    :cond_6
    sget-object p1, Ll/᩵ۡۡ;->ۙ:Ll/᩵ۡۡ;

    return-object p1

    .line 56
    :cond_7
    :goto_1
    invoke-virtual {p0}, Ll/֡ۡۡ;->֫()V

    .line 57
    sget-object p1, Ll/᩵ۡۡ;->ۙ:Ll/᩵ۡۡ;

    return-object p1

    .line 53
    :cond_8
    :goto_2
    sget-object p1, Ll/᩵ۡۡ;->ۙ:Ll/᩵ۡۡ;

    return-object p1
.end method

.method public final ֫()V
    .locals 1

    const/4 v0, 0x0

    .line 92
    iput-object v0, p0, Ll/֡ۡۡ;->ܿ:Ljava/lang/Object;

    const/4 v0, -0x1

    .line 93
    iput v0, p0, Ll/֡ۡۡ;->ܳ:I

    const/4 v0, 0x0

    .line 94
    iput v0, p0, Ll/֡ۡۡ;->֫:F

    .line 95
    iput v0, p0, Ll/֡ۡۡ;->ۧ:F

    const/4 v0, 0x0

    .line 96
    iput-boolean v0, p0, Ll/֡ۡۡ;->᩻:Z

    .line 97
    iput-boolean v0, p0, Ll/֡ۡۡ;->ܽ:Z

    .line 98
    iput-boolean v0, p0, Ll/֡ۡۡ;->᩷:Z

    return-void
.end method

.method public final ֫(Landroid/view/View;IFFZ)V
    .locals 0

    .line 36
    invoke-virtual {p0}, Ll/֡ۡۡ;->֫()V

    if-eqz p5, :cond_1

    if-nez p1, :cond_0

    goto :goto_0

    .line 40
    :cond_0
    iput-object p1, p0, Ll/֡ۡۡ;->ܿ:Ljava/lang/Object;

    .line 41
    iput p2, p0, Ll/֡ۡۡ;->ܳ:I

    .line 42
    iput p3, p0, Ll/֡ۡۡ;->֫:F

    .line 43
    iput p4, p0, Ll/֡ۡۡ;->ۧ:F

    const/4 p1, 0x1

    .line 44
    iput-boolean p1, p0, Ll/֡ۡۡ;->᩻:Z

    :cond_1
    :goto_0
    return-void
.end method
