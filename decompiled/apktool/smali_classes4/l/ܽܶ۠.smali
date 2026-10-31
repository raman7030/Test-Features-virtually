.class public Ll/ܽܶ۠;
.super Ljava/lang/Object;
.source "544J"

# interfaces
.implements Ll/ۨ᩹۠;


# instance fields
.field public ֫:Ll/۬ۖ֨;

.field public final ۧ:Ll/ۙ۠۠;

.field public final ܳ:Ll/ܳ۠۠;

.field public final ܽ:Ljava/util/Set;

.field public final ܿ:Ll/ۗ۠۠;

.field public final ᩳ:Ll/᩶ᩴ֨;

.field public ᩻:Ll/֫ܶ۠;


# direct methods
.method public constructor <init>(Ll/۬ۖ֨;Ll/ۙ۠۠;Ll/᩶ᩴ֨;Ljava/util/Set;Ll/ܳ۠۠;Ll/ۗ۠۠;)V
    .locals 2

    .line 598
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-nez p5, :cond_1

    if-eqz p6, :cond_1

    .line 599
    invoke-interface {p6}, Ll/ۗ۠۠;->֨()I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    goto :goto_0

    .line 600
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1

    .line 602
    :cond_1
    :goto_0
    iput-object p1, p0, Ll/ܽܶ۠;->֫:Ll/۬ۖ֨;

    .line 603
    iput-object p2, p0, Ll/ܽܶ۠;->ۧ:Ll/ۙ۠۠;

    .line 604
    iput-object p3, p0, Ll/ܽܶ۠;->ᩳ:Ll/᩶ᩴ֨;

    .line 605
    iput-object p4, p0, Ll/ܽܶ۠;->ܽ:Ljava/util/Set;

    .line 606
    iput-object p5, p0, Ll/ܽܶ۠;->ܳ:Ll/ܳ۠۠;

    .line 607
    iput-object p6, p0, Ll/ܽܶ۠;->ܿ:Ll/ۗ۠۠;

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ܽܶ۠;)Ll/۬ۖ֨;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܽܶ۠;->֫:Ll/۬ۖ֨;

    return-object p0
.end method

.method public static bridge synthetic ۧ(Ll/ܽܶ۠;)Ll/ۙ۠۠;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܽܶ۠;->ۧ:Ll/ۙ۠۠;

    return-object p0
.end method

.method public static bridge synthetic ܽ(Ll/ܽܶ۠;)Ljava/util/Set;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܽܶ۠;->ܽ:Ljava/util/Set;

    return-object p0
.end method

.method public static bridge synthetic ܿ(Ll/ܽܶ۠;)Ll/ܳ۠۠;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܽܶ۠;->ܳ:Ll/ܳ۠۠;

    return-object p0
.end method

.method public static bridge synthetic ᩳ(Ll/ܽܶ۠;)Ll/ۗ۠۠;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܽܶ۠;->ܿ:Ll/ۗ۠۠;

    return-object p0
.end method


# virtual methods
.method public final getColumnNumber()J
    .locals 2

    .line 721
    iget-object v0, p0, Ll/ܽܶ۠;->᩻:Ll/֫ܶ۠;

    if-nez v0, :cond_0

    .line 722
    new-instance v0, Ll/֫ܶ۠;

    invoke-direct {v0, p0}, Ll/֫ܶ۠;-><init>(Ll/ܽܶ۠;)V

    iput-object v0, p0, Ll/ܽܶ۠;->᩻:Ll/֫ܶ۠;

    .line 724
    :cond_0
    iget-object v0, p0, Ll/ܽܶ۠;->᩻:Ll/֫ܶ۠;

    invoke-virtual {v0}, Ll/֫ܶ۠;->֫()I

    move-result v0

    int-to-long v0, v0

    return-wide v0
.end method

.method public final getLineNumber()J
    .locals 2

    .line 709
    iget-object v0, p0, Ll/ܽܶ۠;->᩻:Ll/֫ܶ۠;

    if-nez v0, :cond_0

    .line 710
    new-instance v0, Ll/֫ܶ۠;

    invoke-direct {v0, p0}, Ll/֫ܶ۠;-><init>(Ll/ܽܶ۠;)V

    iput-object v0, p0, Ll/ܽܶ۠;->᩻:Ll/֫ܶ۠;

    .line 712
    :cond_0
    iget-object v0, p0, Ll/ܽܶ۠;->᩻:Ll/֫ܶ۠;

    invoke-virtual {v0}, Ll/֫ܶ۠;->ۧ()I

    move-result v0

    int-to-long v0, v0

    return-wide v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 756
    iget-object v0, p0, Ll/ܽܶ۠;->֫:Ll/۬ۖ֨;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v1

    invoke-interface {v0, p0, v1}, Ll/۬ۖ֨;->ۧ(Ll/ܽܶ۠;Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ljava/util/Locale;)Ljava/lang/String;
    .locals 1

    .line 788
    iget-object v0, p0, Ll/ܽܶ۠;->֫:Ll/۬ۖ֨;

    invoke-interface {v0, p0, p1}, Ll/۬ۖ֨;->֫(Ll/ܽܶ۠;Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final ֫()Ll/ۛ᩹۠;
    .locals 2

    .line 767
    iget-object v0, p0, Ll/ܽܶ۠;->ۧ:Ll/ۙ۠۠;

    iget-object v0, v0, Ll/ۙ۠۠;->ᩳ:Ll/۬۠۠;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_3

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    const/4 v1, 0x3

    if-eq v0, v1, :cond_0

    .line 777
    sget-object v0, Ll/ۛ᩹۠;->ۗ:Ll/ۛ᩹۠;

    return-object v0

    .line 775
    :cond_0
    sget-object v0, Ll/ۛ᩹۠;->᩹:Ll/ۛ᩹۠;

    return-object v0

    .line 771
    :cond_1
    iget-object v0, p0, Ll/ܽܶ۠;->ܽ:Ljava/util/Set;

    sget-object v1, Ll/᩶۠۠;->ۙ:Ll/᩶۠۠;

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 772
    sget-object v0, Ll/ۛ᩹۠;->᩶:Ll/ۛ᩹۠;

    return-object v0

    .line 773
    :cond_2
    sget-object v0, Ll/ۛ᩹۠;->۬:Ll/ۛ᩹۠;

    return-object v0

    .line 769
    :cond_3
    sget-object v0, Ll/ۛ᩹۠;->ۙ:Ll/ۛ᩹۠;

    return-object v0
.end method

.method public final ֫(Ll/᩶۠۠;)Z
    .locals 1

    .line 807
    iget-object v0, p0, Ll/ܽܶ۠;->ܽ:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final ۖ()Z
    .locals 2

    .line 635
    iget-object v0, p0, Ll/ܽܶ۠;->ܽ:Ljava/util/Set;

    sget-object v1, Ll/᩶۠۠;->ۙ:Ll/᩶۠۠;

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final ۜ()I
    .locals 1

    .line 673
    iget-object v0, p0, Ll/ܽܶ۠;->ܿ:Ll/ۗ۠۠;

    if-nez v0, :cond_0

    const/4 v0, -0x1

    return v0

    :cond_0
    invoke-interface {v0}, Ll/ۗ۠۠;->ۨ()I

    move-result v0

    return v0
.end method

.method public ۡ()Ll/ۖܶ۠;
    .locals 1

    .line 623
    invoke-static {}, Ll/ۖܶ۠;->ܳ()Ll/ۖܶ۠;

    move-result-object v0

    return-object v0
.end method

.method public final ۢ()Ll/ᩳ᩶۠;
    .locals 1

    .line 658
    iget-object v0, p0, Ll/ܽܶ۠;->ܳ:Ll/ܳ۠۠;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 68
    :cond_0
    iget-object v0, v0, Ll/ܳ۠۠;->ᩳ:Ll/ᩳ᩶۠;

    return-object v0
.end method

.method public final ۧ()Ljava/lang/String;
    .locals 1

    .line 783
    iget-object v0, p0, Ll/ܽܶ۠;->ۧ:Ll/ۙ۠۠;

    invoke-virtual {v0}, Ll/ۙ۠۠;->֫()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۧ(Ll/᩶۠۠;)V
    .locals 3

    .line 792
    iget-object v0, p0, Ll/ܽܶ۠;->ܽ:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 794
    iget-object v1, p0, Ll/ܽܶ۠;->ۧ:Ll/ۙ۠۠;

    iget-object v1, v1, Ll/ۙ۠۠;->ᩳ:Ll/۬۠۠;

    sget-object v2, Ll/۬۠۠;->᩶:Ll/۬۠۠;

    if-ne v1, v2, :cond_2

    .line 795
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    const/4 v1, 0x1

    if-eq p1, v1, :cond_1

    const/4 v1, 0x2

    if-eq p1, v1, :cond_0

    goto :goto_0

    .line 797
    :cond_0
    sget-object p1, Ll/᩶۠۠;->۬:Ll/᩶۠۠;

    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    return-void

    .line 800
    :cond_1
    sget-object p1, Ll/᩶۠۠;->۬:Ll/᩶۠۠;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_2
    :goto_0
    return-void
.end method

.method public final ܳ()I
    .locals 2

    .line 681
    iget-object v0, p0, Ll/ܽܶ۠;->ܿ:Ll/ۗ۠۠;

    if-nez v0, :cond_0

    const/4 v0, -0x1

    return v0

    :cond_0
    iget-object v1, p0, Ll/ܽܶ۠;->ܳ:Ll/ܳ۠۠;

    .line 131
    iget-object v1, v1, Ll/ܳ۠۠;->ܽ:Ll/֫᩵۠;

    .line 681
    invoke-interface {v0, v1}, Ll/ۗ۠۠;->֫(Ll/֫᩵۠;)I

    move-result v0

    return v0
.end method

.method public final ܺ()Ll/۬۠۠;
    .locals 1

    .line 615
    iget-object v0, p0, Ll/ܽܶ۠;->ۧ:Ll/ۙ۠۠;

    iget-object v0, v0, Ll/ۙ۠۠;->ᩳ:Ll/۬۠۠;

    return-object v0
.end method

.method public final ܽ()[Ljava/lang/Object;
    .locals 1

    .line 732
    iget-object v0, p0, Ll/ܽܶ۠;->ۧ:Ll/ۙ۠۠;

    iget-object v0, v0, Ll/ۙ۠۠;->֫:[Ljava/lang/Object;

    return-object v0
.end method

.method public final ܿ()Ll/ܳ۠۠;
    .locals 1

    .line 669
    iget-object v0, p0, Ll/ܽܶ۠;->ܳ:Ll/ܳ۠۠;

    return-object v0
.end method

.method public final ᩳ()Ll/ۗ۠۠;
    .locals 1

    .line 700
    iget-object v0, p0, Ll/ܽܶ۠;->ܿ:Ll/ۗ۠۠;

    return-object v0
.end method

.method public final ᩷()Ll/᩶ᩴ֨;
    .locals 1

    .line 649
    iget-object v0, p0, Ll/ܽܶ۠;->ᩳ:Ll/᩶ᩴ֨;

    return-object v0
.end method

.method public final ᩻()I
    .locals 1

    .line 677
    iget-object v0, p0, Ll/ܽܶ۠;->ܿ:Ll/ۗ۠۠;

    if-nez v0, :cond_0

    const/4 v0, -0x1

    return v0

    :cond_0
    invoke-interface {v0}, Ll/ۗ۠۠;->֨()I

    move-result v0

    return v0
.end method
