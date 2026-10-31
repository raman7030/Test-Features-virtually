.class public final Ll/ܺۖۧ;
.super Ljava/lang/Object;
.source "U8RL"


# instance fields
.field public final ֫:Ll/ᩳ֨֫;

.field public ۜ:I

.field public final ۧ:Z

.field public ܳ:I

.field public ܽ:I

.field public ܿ:I

.field public final ᩳ:I

.field public final ᩷:Ll/ᩳ֨֫;

.field public ᩻:J


# direct methods
.method public constructor <init>(Ll/ᩳ֨֫;Ll/ᩳ֨֫;Z)V
    .locals 0

    .line 2644
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2645
    iput-object p1, p0, Ll/ܺۖۧ;->᩷:Ll/ᩳ֨֫;

    .line 2646
    iput-object p2, p0, Ll/ܺۖۧ;->֫:Ll/ᩳ֨֫;

    .line 2647
    iput-boolean p3, p0, Ll/ܺۖۧ;->ۧ:Z

    const/16 p3, 0xc

    .line 2648
    invoke-virtual {p2, p3}, Ll/ᩳ֨֫;->ܿ(I)V

    .line 2649
    invoke-virtual {p2}, Ll/ᩳ֨֫;->᩹()I

    move-result p2

    iput p2, p0, Ll/ܺۖۧ;->ᩳ:I

    .line 2650
    invoke-virtual {p1, p3}, Ll/ᩳ֨֫;->ܿ(I)V

    .line 2651
    invoke-virtual {p1}, Ll/ᩳ֨֫;->᩹()I

    move-result p2

    iput p2, p0, Ll/ܺۖۧ;->ۜ:I

    .line 2652
    invoke-virtual {p1}, Ll/ᩳ֨֫;->᩻()I

    move-result p1

    const/4 p2, 0x1

    if-ne p1, p2, :cond_0

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    const-string p1, "first_chunk must be 1"

    invoke-static {p1, p2}, Ll/᩹᩷ۧ;->֫(Ljava/lang/String;Z)V

    const/4 p1, -0x1

    .line 2653
    iput p1, p0, Ll/ܺۖۧ;->ܽ:I

    return-void
.end method


# virtual methods
.method public final ֫()Z
    .locals 4

    .line 2657
    iget v0, p0, Ll/ܺۖۧ;->ܽ:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    iput v0, p0, Ll/ܺۖۧ;->ܽ:I

    iget v2, p0, Ll/ܺۖۧ;->ᩳ:I

    if-ne v0, v2, :cond_0

    const/4 v0, 0x0

    return v0

    .line 2661
    :cond_0
    iget-boolean v0, p0, Ll/ܺۖۧ;->ۧ:Z

    iget-object v2, p0, Ll/ܺۖۧ;->֫:Ll/ᩳ֨֫;

    if-eqz v0, :cond_1

    .line 2662
    invoke-virtual {v2}, Ll/ᩳ֨֫;->ۙ()J

    move-result-wide v2

    goto :goto_0

    .line 2663
    :cond_1
    invoke-virtual {v2}, Ll/ᩳ֨֫;->ܶ()J

    move-result-wide v2

    :goto_0
    iput-wide v2, p0, Ll/ܺۖۧ;->᩻:J

    .line 2664
    iget v0, p0, Ll/ܺۖۧ;->ܽ:I

    iget v2, p0, Ll/ܺۖۧ;->ܿ:I

    if-ne v0, v2, :cond_3

    .line 2665
    iget-object v0, p0, Ll/ܺۖۧ;->᩷:Ll/ᩳ֨֫;

    invoke-virtual {v0}, Ll/ᩳ֨֫;->᩹()I

    move-result v2

    iput v2, p0, Ll/ܺۖۧ;->ܳ:I

    const/4 v2, 0x4

    .line 2666
    invoke-virtual {v0, v2}, Ll/ᩳ֨֫;->ܳ(I)V

    .line 2668
    iget v2, p0, Ll/ܺۖۧ;->ۜ:I

    sub-int/2addr v2, v1

    iput v2, p0, Ll/ܺۖۧ;->ۜ:I

    if-lez v2, :cond_2

    .line 2669
    invoke-virtual {v0}, Ll/ᩳ֨֫;->᩹()I

    move-result v0

    sub-int/2addr v0, v1

    goto :goto_1

    :cond_2
    const/4 v0, -0x1

    .line 2670
    :goto_1
    iput v0, p0, Ll/ܺۖۧ;->ܿ:I

    :cond_3
    return v1
.end method
