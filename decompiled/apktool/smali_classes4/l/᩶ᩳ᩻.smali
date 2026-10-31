.class public final Ll/᩶ᩳ᩻;
.super Ljava/lang/Object;
.source "195F"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field public ۗ:I

.field public ۙ:I

.field public ۛ:I

.field public ۟:Z

.field public ۤ:Z

.field public ۨ:Z

.field public ۫:I

.field public ۬:I

.field public ܰ:I

.field public ᩶:Z

.field public ᩸:Ljava/lang/String;

.field public ᩹:Z

.field public ᩺:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 4

    .line 667
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 668
    iput v0, p0, Ll/᩶ᩳ᩻;->۫:I

    const/4 v1, 0x1

    .line 669
    iput-boolean v1, p0, Ll/᩶ᩳ᩻;->᩶:Z

    .line 670
    iput-boolean v0, p0, Ll/᩶ᩳ᩻;->ۤ:Z

    .line 671
    iput-boolean v0, p0, Ll/᩶ᩳ᩻;->᩹:Z

    const/16 v2, 0xa

    .line 672
    iput v2, p0, Ll/᩶ᩳ᩻;->ۗ:I

    const/4 v3, 0x2

    .line 673
    iput v3, p0, Ll/᩶ᩳ᩻;->۬:I

    .line 674
    iput v2, p0, Ll/᩶ᩳ᩻;->ۙ:I

    const/16 v2, 0x3e8

    .line 675
    iput v2, p0, Ll/᩶ᩳ᩻;->ۛ:I

    .line 676
    iput-boolean v1, p0, Ll/᩶ᩳ᩻;->ۨ:Z

    const-string v2, "\\n"

    .line 677
    iput-object v2, p0, Ll/᩶ᩳ᩻;->᩺:Ljava/lang/String;

    .line 678
    iput v0, p0, Ll/᩶ᩳ᩻;->ܰ:I

    .line 679
    iput-boolean v1, p0, Ll/᩶ᩳ᩻;->۟:Z

    const-string v0, ""

    .line 680
    iput-object v0, p0, Ll/᩶ᩳ᩻;->᩸:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final ֫()Z
    .locals 2

    .line 775
    iget v0, p0, Ll/᩶ᩳ᩻;->۫:I

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public final ۧ()V
    .locals 9

    .line 693
    sget-object v0, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v1, "smfa"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Ll/۫ۤۡ;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 694
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_5

    .line 705
    :try_start_0
    new-instance v1, Ll/۬ۜܽ;

    const/4 v2, 0x2

    invoke-static {v0, v2}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object v0

    invoke-direct {v1, v0}, Ll/۬ۜܽ;-><init>([B)V

    .line 706
    invoke-virtual {v1}, Ll/۬ۜܽ;->readByte()B

    move-result v0

    and-int/lit8 v2, v0, 0x1

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    .line 707
    :goto_0
    iput-boolean v2, p0, Ll/᩶ᩳ᩻;->᩶:Z

    and-int/lit8 v2, v0, 0x2

    if-eqz v2, :cond_1

    const/4 v2, 0x1

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    .line 708
    :goto_1
    iput-boolean v2, p0, Ll/᩶ᩳ᩻;->ۤ:Z

    and-int/lit8 v0, v0, 0x4

    if-eqz v0, :cond_2

    const/4 v0, 0x1

    goto :goto_2

    :cond_2
    const/4 v0, 0x0

    .line 709
    :goto_2
    iput-boolean v0, p0, Ll/᩶ᩳ᩻;->᩹:Z

    .line 710
    invoke-virtual {v1}, Ll/۬ۜܽ;->readInt()I

    move-result v0

    iput v0, p0, Ll/᩶ᩳ᩻;->ۗ:I

    .line 711
    invoke-virtual {v1}, Ll/۬ۜܽ;->readInt()I

    move-result v0

    iput v0, p0, Ll/᩶ᩳ᩻;->۬:I

    .line 712
    invoke-virtual {v1}, Ll/۬ۜܽ;->readInt()I

    move-result v0

    iput v0, p0, Ll/᩶ᩳ᩻;->ۙ:I

    .line 713
    iget-boolean v0, p0, Ll/᩶ᩳ᩻;->᩶:Z

    xor-int/lit8 v0, v0, 0x1

    iput v0, p0, Ll/᩶ᩳ᩻;->۫:I

    .line 719
    invoke-virtual {v1}, Ll/۬ۜܽ;->readInt()I

    move-result v0

    .line 720
    invoke-virtual {v1}, Ll/۬ۜܽ;->readInt()I

    move-result v2

    .line 721
    invoke-virtual {v1}, Ll/۬ۜܽ;->ܳ()Z

    move-result v4

    .line 722
    invoke-virtual {v1}, Ll/۬ۜܽ;->᩶()Ljava/lang/String;

    move-result-object v5

    .line 723
    invoke-virtual {v1}, Ll/۬ۜܽ;->readInt()I

    move-result v6

    invoke-static {v6}, Ll/᩻ܿ᩻;->ۧ(I)I

    move-result v6

    .line 724
    invoke-virtual {v1}, Ll/۬ۜܽ;->ܳ()Z

    move-result v7

    .line 725
    invoke-virtual {v1}, Ll/۬ۜܽ;->᩶()Ljava/lang/String;

    move-result-object v1

    if-ltz v0, :cond_4

    const/4 v8, 0x3

    if-gt v0, v8, :cond_4

    .line 727
    iput v0, p0, Ll/᩶ᩳ᩻;->۫:I

    if-nez v0, :cond_3

    const/4 v3, 0x1

    .line 728
    :cond_3
    iput-boolean v3, p0, Ll/᩶ᩳ᩻;->᩶:Z

    .line 730
    :cond_4
    iput v2, p0, Ll/᩶ᩳ᩻;->ۛ:I

    .line 731
    iput-boolean v4, p0, Ll/᩶ᩳ᩻;->ۨ:Z

    .line 732
    iput-object v5, p0, Ll/᩶ᩳ᩻;->᩺:Ljava/lang/String;

    .line 733
    iput v6, p0, Ll/᩶ᩳ᩻;->ܰ:I

    .line 734
    iput-boolean v7, p0, Ll/᩶ᩳ᩻;->۟:Z

    .line 735
    iput-object v1, p0, Ll/᩶ᩳ᩻;->᩸:Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_5
    return-void
.end method

.method public final ܽ()V
    .locals 4

    .line 686
    sget-object v0, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    invoke-interface {v0}, Ll/۫ۤۡ;->edit()Ll/۬ۤۡ;

    move-result-object v0

    .line 744
    new-instance v1, Ll/ۤۜܽ;

    invoke-direct {v1}, Ll/ۤۜܽ;-><init>()V

    .line 745
    iget v2, p0, Ll/᩶ᩳ᩻;->۫:I

    if-nez v2, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    iput-boolean v2, p0, Ll/᩶ᩳ᩻;->᩶:Z

    .line 750
    iget-boolean v3, p0, Ll/᩶ᩳ᩻;->ۤ:Z

    if-eqz v3, :cond_1

    or-int/lit8 v2, v2, 0x2

    .line 753
    :cond_1
    iget-boolean v3, p0, Ll/᩶ᩳ᩻;->᩹:Z

    if-eqz v3, :cond_2

    or-int/lit8 v2, v2, 0x4

    .line 756
    :cond_2
    invoke-virtual {v1, v2}, Ll/ۤۜܽ;->writeByte(I)V

    .line 757
    iget v2, p0, Ll/᩶ᩳ᩻;->ۗ:I

    invoke-virtual {v1, v2}, Ll/ۤۜܽ;->writeInt(I)V

    .line 758
    iget v2, p0, Ll/᩶ᩳ᩻;->۬:I

    invoke-virtual {v1, v2}, Ll/ۤۜܽ;->writeInt(I)V

    .line 759
    iget v2, p0, Ll/᩶ᩳ᩻;->ۙ:I

    invoke-virtual {v1, v2}, Ll/ۤۜܽ;->writeInt(I)V

    .line 760
    iget v2, p0, Ll/᩶ᩳ᩻;->۫:I

    invoke-virtual {v1, v2}, Ll/ۤۜܽ;->writeInt(I)V

    .line 761
    iget v2, p0, Ll/᩶ᩳ᩻;->ۛ:I

    invoke-virtual {v1, v2}, Ll/ۤۜܽ;->writeInt(I)V

    .line 762
    iget-boolean v2, p0, Ll/᩶ᩳ᩻;->ۨ:Z

    invoke-virtual {v1, v2}, Ll/ۤۜܽ;->֫(Z)V

    .line 763
    iget-object v2, p0, Ll/᩶ᩳ᩻;->᩺:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ll/ۤۜܽ;->֫(Ljava/lang/CharSequence;)V

    .line 764
    iget v2, p0, Ll/᩶ᩳ᩻;->ܰ:I

    invoke-static {v2}, Ll/᩻ܿ᩻;->ۧ(I)I

    move-result v2

    iput v2, p0, Ll/᩶ᩳ᩻;->ܰ:I

    .line 765
    invoke-virtual {v1, v2}, Ll/ۤۜܽ;->writeInt(I)V

    .line 766
    iget-boolean v2, p0, Ll/᩶ᩳ᩻;->۟:Z

    invoke-virtual {v1, v2}, Ll/ۤۜܽ;->֫(Z)V

    .line 767
    iget-object v2, p0, Ll/᩶ᩳ᩻;->᩸:Ljava/lang/String;

    if-nez v2, :cond_3

    const-string v2, ""

    :cond_3
    invoke-virtual {v1, v2}, Ll/ۤۜܽ;->֫(Ljava/lang/CharSequence;)V

    .line 768
    invoke-virtual {v1}, Ll/ۤۜܽ;->᩻()[B

    move-result-object v1

    const/4 v2, 0x2

    invoke-static {v1, v2}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object v1

    const-string v2, "smfa"

    .line 686
    invoke-interface {v0, v2, v1}, Ll/۬ۤۡ;->putString(Ljava/lang/String;Ljava/lang/String;)Ll/۬ۤۡ;

    move-result-object v0

    invoke-interface {v0}, Ll/۬ۤۡ;->apply()V

    return-void
.end method
