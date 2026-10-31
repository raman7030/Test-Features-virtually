.class public final Ll/ۗ֡ܽ;
.super Ljava/lang/Object;
.source "Z6QT"


# instance fields
.field public final ֫:[C

.field public ۧ:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 841
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x8

    new-array v0, v0, [C

    .line 844
    iput-object v0, p0, Ll/ۗ֡ܽ;->֫:[C

    return-void
.end method

.method public static ֫(Ll/ۛۚܽ;)Ll/ۗ֡ܽ;
    .locals 6

    .line 851
    instance-of v0, p0, Ll/ۨ֡ܽ;

    if-nez v0, :cond_0

    goto/16 :goto_4

    .line 854
    :cond_0
    new-instance v0, Ll/ۗ֡ܽ;

    invoke-direct {v0}, Ll/ۗ֡ܽ;-><init>()V

    .line 859
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 860
    invoke-virtual {v1, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 861
    :cond_1
    :goto_0
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p0

    const/4 v2, 0x1

    if-nez p0, :cond_d

    .line 0
    invoke-static {v1, v2}, Ll/ۘ᩺ۘ;->֫(Ljava/util/ArrayList;I)Ljava/lang/Object;

    move-result-object p0

    .line 862
    check-cast p0, Ll/ۛۚܽ;

    .line 863
    instance-of v3, p0, Ll/ۨ֡ܽ;

    if-eqz v3, :cond_3

    check-cast p0, Ll/ۨ֡ܽ;

    .line 865
    iget v3, p0, Ll/ۨ֡ܽ;->ܿ:I

    sub-int/2addr v3, v2

    :goto_1
    if-ltz v3, :cond_1

    .line 866
    iget-object v2, p0, Ll/ۨ֡ܽ;->ܽ:[Ll/ۛۚܽ;

    aget-object v2, v2, v3

    if-nez v2, :cond_2

    goto/16 :goto_4

    .line 870
    :cond_2
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, -0x1

    goto :goto_1

    .line 872
    :cond_3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    const/4 v3, 0x0

    iget-object v4, v0, Ll/ۗ֡ܽ;->֫:[C

    const-class v5, Ll/ۢ֨ܽ;

    if-ne v2, v5, :cond_7

    .line 873
    check-cast p0, Ll/ۢ֨ܽ;

    .line 874
    iget-object p0, p0, Ll/ۖ֨ܽ;->ۧ:[I

    array-length v2, p0

    if-eqz v2, :cond_e

    aget p0, p0, v3

    const v2, 0xffff

    if-gt p0, v2, :cond_e

    int-to-char p0, p0

    .line 896
    :goto_2
    iget v2, v0, Ll/ۗ֡ܽ;->ۧ:I

    if-ge v3, v2, :cond_5

    .line 897
    aget-char v2, v4, v3

    if-ne v2, p0, :cond_4

    goto :goto_0

    :cond_4
    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    .line 901
    :cond_5
    array-length v3, v4

    if-ne v2, v3, :cond_6

    goto :goto_4

    :cond_6
    add-int/lit8 v3, v2, 0x1

    .line 904
    iput v3, v0, Ll/ۗ֡ܽ;->ۧ:I

    aput-char p0, v4, v2

    goto :goto_0

    .line 879
    :cond_7
    instance-of v2, p0, Ll/᩶֡ܽ;

    if-eqz v2, :cond_b

    check-cast p0, Ll/᩶֡ܽ;

    .line 880
    invoke-static {p0}, Ll/ܿ֨ܽ;->֫(Ll/᩶֡ܽ;)I

    move-result p0

    if-ltz p0, :cond_e

    int-to-char p0, p0

    .line 896
    :goto_3
    iget v2, v0, Ll/ۗ֡ܽ;->ۧ:I

    if-ge v3, v2, :cond_9

    .line 897
    aget-char v2, v4, v3

    if-ne v2, p0, :cond_8

    goto :goto_0

    :cond_8
    add-int/lit8 v3, v3, 0x1

    goto :goto_3

    .line 901
    :cond_9
    array-length v3, v4

    if-ne v2, v3, :cond_a

    goto :goto_4

    :cond_a
    add-int/lit8 v3, v2, 0x1

    .line 904
    iput v3, v0, Ll/ۗ֡ܽ;->ۧ:I

    aput-char p0, v4, v2

    goto :goto_0

    .line 884
    :cond_b
    instance-of v2, p0, Ll/᩷ۚܽ;

    if-eqz v2, :cond_e

    check-cast p0, Ll/᩷ۚܽ;

    iget-object v2, p0, Ll/᩷ۚܽ;->ۧ:Ll/ۛۚܽ;

    iget p0, p0, Ll/᩷ۚܽ;->ᩳ:I

    if-lez p0, :cond_e

    .line 886
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    if-eq p0, v5, :cond_c

    instance-of p0, v2, Ll/᩶֡ܽ;

    if-eqz p0, :cond_e

    .line 887
    :cond_c
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 855
    :cond_d
    iget p0, v0, Ll/ۗ֡ܽ;->ۧ:I

    if-le p0, v2, :cond_e

    return-object v0

    :cond_e
    :goto_4
    const/4 p0, 0x0

    return-object p0
.end method

.method public static bridge synthetic ֫(Ll/ۗ֡ܽ;)[C
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۗ֡ܽ;->֫:[C

    return-object p0
.end method

.method public static bridge synthetic ۧ(Ll/ۗ֡ܽ;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/ۗ֡ܽ;->ۧ:I

    return p0
.end method
