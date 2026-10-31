.class public final Ll/ܿۖܿ;
.super Ljava/lang/Object;
.source "M701"


# instance fields
.field public ֫:I

.field public ۧ:I

.field public ܳ:I

.field public ܽ:I

.field public final ܿ:[Ll/ۜۖܿ;

.field public ᩳ:Ll/ۜۖܿ;

.field public final ᩻:Z


# direct methods
.method public constructor <init>(Ll/ۜۖܿ;Z)V
    .locals 1

    .line 542
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 543
    iget v0, p1, Ll/ۜۖܿ;->ۧ:I

    new-array v0, v0, [Ll/ۜۖܿ;

    iput-object v0, p0, Ll/ܿۖܿ;->ܿ:[Ll/ۜۖܿ;

    .line 544
    iput-boolean p2, p0, Ll/ܿۖܿ;->᩻:Z

    .line 545
    invoke-direct {p0, p1}, Ll/ܿۖܿ;->֫(Ll/ۜۖܿ;)V

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ܿۖܿ;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/ܿۖܿ;->֫:I

    return p0
.end method

.method private ֫(Ll/ۜۖܿ;)V
    .locals 2

    .line 578
    iput-object p1, p0, Ll/ܿۖܿ;->ᩳ:Ll/ۜۖܿ;

    const/4 v0, 0x0

    .line 579
    iput v0, p0, Ll/ܿۖܿ;->֫:I

    .line 580
    instance-of v1, p1, Ll/᩻ۖܿ;

    if-eqz v1, :cond_1

    check-cast p1, Ll/᩻ۖܿ;

    .line 581
    iget-boolean v1, p0, Ll/ܿۖܿ;->᩻:Z

    if-eqz v1, :cond_0

    iget v0, p1, Ll/ۜۖܿ;->ᩳ:I

    add-int/lit8 v0, v0, -0x1

    :cond_0
    iput v0, p0, Ll/ܿۖܿ;->ܽ:I

    .line 582
    iget-object p1, p1, Ll/᩻ۖܿ;->ܿ:[I

    aget p1, p1, v0

    const v0, 0x7fffffff

    and-int/2addr p1, v0

    iput p1, p0, Ll/ܿۖܿ;->ܳ:I

    :cond_1
    return-void
.end method

.method public static bridge synthetic ۧ(Ll/ܿۖܿ;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/ܿۖܿ;->ܽ:I

    return p0
.end method

.method public static bridge synthetic ܽ(Ll/ܿۖܿ;)Ll/ۜۖܿ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܿۖܿ;->ᩳ:Ll/ۜۖܿ;

    return-object p0
.end method

.method public static bridge synthetic ᩳ(Ll/ܿۖܿ;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/ܿۖܿ;->ܳ:I

    return p0
.end method


# virtual methods
.method public final ֫()V
    .locals 5

    .line 550
    iget-object v0, p0, Ll/ܿۖܿ;->ᩳ:Ll/ۜۖܿ;

    check-cast v0, Ll/ۧۖܿ;

    .line 551
    iget v1, p0, Ll/ܿۖܿ;->ۧ:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Ll/ܿۖܿ;->ۧ:I

    iget-boolean v2, p0, Ll/ܿۖܿ;->᩻:Z

    if-eqz v2, :cond_0

    iget-object v3, v0, Ll/ۧۖܿ;->ܿ:Ll/ۜۖܿ;

    goto :goto_0

    :cond_0
    iget-object v3, v0, Ll/ۧۖܿ;->ܳ:Ll/ۜۖܿ;

    :goto_0
    iget-object v4, p0, Ll/ܿۖܿ;->ܿ:[Ll/ۜۖܿ;

    aput-object v3, v4, v1

    if-eqz v2, :cond_1

    .line 552
    iget-object v0, v0, Ll/ۧۖܿ;->ܳ:Ll/ۜۖܿ;

    goto :goto_1

    :cond_1
    iget-object v0, v0, Ll/ۧۖܿ;->ܿ:Ll/ۜۖܿ;

    :goto_1
    invoke-direct {p0, v0}, Ll/ܿۖܿ;->֫(Ll/ۜۖܿ;)V

    return-void
.end method

.method public final ֫(I)V
    .locals 2

    .line 567
    iget v0, p0, Ll/ܿۖܿ;->֫:I

    add-int/2addr v0, p1

    iput v0, p0, Ll/ܿۖܿ;->֫:I

    .line 568
    iget v0, p0, Ll/ܿۖܿ;->ܳ:I

    sub-int/2addr v0, p1

    iput v0, p0, Ll/ܿۖܿ;->ܳ:I

    if-eqz v0, :cond_0

    return-void

    .line 570
    :cond_0
    iget-object p1, p0, Ll/ܿۖܿ;->ᩳ:Ll/ۜۖܿ;

    check-cast p1, Ll/᩻ۖܿ;

    .line 571
    iget v0, p0, Ll/ܿۖܿ;->ܽ:I

    iget-boolean v1, p0, Ll/ܿۖܿ;->᩻:Z

    if-eqz v1, :cond_1

    const/4 v1, -0x1

    goto :goto_0

    :cond_1
    const/4 v1, 0x1

    :goto_0
    add-int/2addr v0, v1

    iput v0, p0, Ll/ܿۖܿ;->ܽ:I

    if-ltz v0, :cond_3

    .line 572
    iget v1, p1, Ll/ۜۖܿ;->ᩳ:I

    if-ne v0, v1, :cond_2

    goto :goto_1

    .line 573
    :cond_2
    iget-object p1, p1, Ll/᩻ۖܿ;->ܿ:[I

    aget p1, p1, v0

    const v0, 0x7fffffff

    and-int/2addr p1, v0

    iput p1, p0, Ll/ܿۖܿ;->ܳ:I

    return-void

    .line 572
    :cond_3
    :goto_1
    invoke-virtual {p0}, Ll/ܿۖܿ;->ۧ()V

    return-void
.end method

.method public final ۧ()V
    .locals 4

    .line 557
    iget v0, p0, Ll/ܿۖܿ;->ۧ:I

    const/4 v1, 0x0

    if-nez v0, :cond_0

    invoke-direct {p0, v1}, Ll/ܿۖܿ;->֫(Ll/ۜۖܿ;)V

    return-void

    :cond_0
    add-int/lit8 v0, v0, -0x1

    .line 559
    iput v0, p0, Ll/ܿۖܿ;->ۧ:I

    iget-object v2, p0, Ll/ܿۖܿ;->ܿ:[Ll/ۜۖܿ;

    aget-object v3, v2, v0

    .line 560
    aput-object v1, v2, v0

    .line 561
    invoke-direct {p0, v3}, Ll/ܿۖܿ;->֫(Ll/ۜۖܿ;)V

    return-void
.end method
