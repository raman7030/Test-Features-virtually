.class public final Ll/֡ܶ۠;
.super Ll/֨ܶ۠;
.source "93Z4"


# instance fields
.field public final synthetic ۧ:Ll/᩹ܶ۠;


# direct methods
.method public constructor <init>(Ll/᩹ܶ۠;)V
    .locals 0

    .line 668
    iput-object p1, p0, Ll/֡ܶ۠;->ۧ:Ll/᩹ܶ۠;

    invoke-direct {p0}, Ll/֨ܶ۠;-><init>()V

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ܽܶ۠;)V
    .locals 4

    .line 671
    iget-object v0, p0, Ll/֡ܶ۠;->ۧ:Ll/᩹ܶ۠;

    iget-object v1, v0, Ll/᩹ܶ۠;->ܺ:Ljava/util/HashSet;

    if-eqz v1, :cond_0

    .line 672
    invoke-virtual {p1}, Ll/ܽܶ۠;->ۧ()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 674
    :cond_0
    sget-object v1, Ll/᩵ܶ۠;->֫:[I

    invoke-virtual {p1}, Ll/ܽܶ۠;->ܺ()Ll/۬۠۠;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v1, v1, v2

    const/4 v2, 0x1

    if-eq v1, v2, :cond_b

    const/4 v3, 0x2

    if-eq v1, v3, :cond_7

    const/4 v3, 0x3

    if-eq v1, v3, :cond_4

    const/4 v3, 0x4

    if-eq v1, v3, :cond_1

    goto :goto_0

    .line 699
    :cond_1
    sget-object v1, Ll/᩶۠۠;->᩹:Ll/᩶۠۠;

    invoke-virtual {p1, v1}, Ll/ܽܶ۠;->֫(Ll/᩶۠۠;)Z

    move-result v1

    if-nez v1, :cond_2

    .line 700
    invoke-static {v0, p1}, Ll/᩹ܶ۠;->֫(Ll/᩹ܶ۠;Ll/ܽܶ۠;)Z

    move-result v1

    if-eqz v1, :cond_9

    .line 701
    :cond_2
    iget v1, v0, Ll/᩹ܶ۠;->ۘ:I

    iget v3, v0, Ll/᩹ܶ۠;->ᩳ:I

    if-ge v1, v3, :cond_3

    .line 702
    invoke-virtual {v0, p1}, Ll/᩹ܶ۠;->ۧ(Ll/ܽܶ۠;)V

    .line 703
    iget v1, v0, Ll/᩹ܶ۠;->ۘ:I

    add-int/2addr v1, v2

    iput v1, v0, Ll/᩹ܶ۠;->ۘ:I

    goto :goto_0

    .line 705
    :cond_3
    iget v1, v0, Ll/᩹ܶ۠;->ᩴ:I

    add-int/2addr v1, v2

    iput v1, v0, Ll/᩹ܶ۠;->ᩴ:I

    goto :goto_0

    .line 688
    :cond_4
    iget-boolean v1, v0, Ll/᩹ܶ۠;->ۡ:Z

    if-nez v1, :cond_5

    invoke-virtual {p1}, Ll/ܽܶ۠;->ۖ()Z

    move-result v1

    if-eqz v1, :cond_9

    .line 689
    :cond_5
    iget v1, v0, Ll/᩹ܶ۠;->֡:I

    iget v3, v0, Ll/᩹ܶ۠;->ܿ:I

    if-ge v1, v3, :cond_6

    .line 690
    invoke-virtual {v0, p1}, Ll/᩹ܶ۠;->ۧ(Ll/ܽܶ۠;)V

    .line 691
    iget v1, v0, Ll/᩹ܶ۠;->֡:I

    add-int/2addr v1, v2

    iput v1, v0, Ll/᩹ܶ۠;->֡:I

    goto :goto_0

    .line 693
    :cond_6
    iget v1, v0, Ll/᩹ܶ۠;->᩵:I

    add-int/2addr v1, v2

    iput v1, v0, Ll/᩹ܶ۠;->᩵:I

    goto :goto_0

    .line 682
    :cond_7
    iget-boolean v1, v0, Ll/᩹ܶ۠;->ۡ:Z

    if-nez v1, :cond_8

    invoke-virtual {p1}, Ll/ܽܶ۠;->ۖ()Z

    move-result v1

    if-eqz v1, :cond_9

    :cond_8
    iget-boolean v1, v0, Ll/᩹ܶ۠;->ܶ:Z

    if-nez v1, :cond_9

    .line 683
    invoke-virtual {v0, p1}, Ll/᩹ܶ۠;->ۧ(Ll/ܽܶ۠;)V

    .line 710
    :cond_9
    :goto_0
    sget-object v1, Ll/᩶۠۠;->᩶:Ll/᩶۠۠;

    invoke-virtual {p1, v1}, Ll/ܽܶ۠;->֫(Ll/᩶۠۠;)Z

    move-result p1

    if-eqz p1, :cond_a

    .line 711
    iput-boolean v2, v0, Ll/᩹ܶ۠;->ܳ:Z

    :cond_a
    return-void

    .line 676
    :cond_b
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1
.end method
