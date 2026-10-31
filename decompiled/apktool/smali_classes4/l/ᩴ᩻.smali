.class public abstract Ll/ᩴ᩻;
.super Landroid/graphics/drawable/Drawable$ConstantState;
.source "I9N6"


# instance fields
.field public ֡:I

.field public ֨:Landroid/util/SparseArray;

.field public ֫:Z

.field public ۖ:I

.field public ۗ:I

.field public ۘ:Landroid/graphics/Rect;

.field public ۙ:Z

.field public ۚ:Z

.field public ۛ:Landroid/content/res/Resources;

.field public ۜ:Z

.field public ۠:[Landroid/graphics/drawable/Drawable;

.field public ۡ:I

.field public ۢ:Landroid/graphics/ColorFilter;

.field public final ۤ:Ll/۠᩻;

.field public ۧ:Z

.field public ۨ:Landroid/content/res/ColorStateList;

.field public ۫:I

.field public ۬:I

.field public ܰ:Z

.field public ܳ:Z

.field public ܶ:I

.field public ܺ:I

.field public ܽ:I

.field public ܿ:Z

.field public ᩳ:Z

.field public ᩴ:Z

.field public ᩵:I

.field public ᩶:Z

.field public ᩷:I

.field public ᩸:I

.field public ᩹:Z

.field public ᩺:Landroid/graphics/PorterDuff$Mode;

.field public ᩻:Z


# direct methods
.method public constructor <init>(Ll/֨᩻;Ll/۠᩻;Landroid/content/res/Resources;)V
    .locals 4

    .line 679
    invoke-direct {p0}, Landroid/graphics/drawable/Drawable$ConstantState;-><init>()V

    const/4 v0, 0x0

    .line 650
    iput-boolean v0, p0, Ll/ᩴ᩻;->ܰ:Z

    .line 653
    iput-boolean v0, p0, Ll/ᩴ᩻;->ᩴ:Z

    const/4 v1, 0x1

    .line 665
    iput-boolean v1, p0, Ll/ᩴ᩻;->ۚ:Z

    .line 668
    iput v0, p0, Ll/ᩴ᩻;->ܶ:I

    .line 669
    iput v0, p0, Ll/ᩴ᩻;->᩸:I

    .line 680
    iput-object p2, p0, Ll/ᩴ᩻;->ۤ:Ll/۠᩻;

    const/4 p2, 0x0

    if-eqz p3, :cond_0

    move-object v2, p3

    goto :goto_0

    :cond_0
    if-eqz p1, :cond_1

    .line 681
    iget-object v2, p1, Ll/ᩴ᩻;->ۛ:Landroid/content/res/Resources;

    goto :goto_0

    :cond_1
    move-object v2, p2

    :goto_0
    iput-object v2, p0, Ll/ᩴ᩻;->ۛ:Landroid/content/res/Resources;

    if-eqz p1, :cond_2

    .line 682
    iget v2, p1, Ll/ᩴ᩻;->֡:I

    goto :goto_1

    :cond_2
    const/4 v2, 0x0

    :goto_1
    sget v3, Ll/᩵᩻;->۟:I

    if-nez p3, :cond_3

    goto :goto_2

    .line 1204
    :cond_3
    invoke-virtual {p3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p3

    iget v2, p3, Landroid/util/DisplayMetrics;->densityDpi:I

    :goto_2
    if-nez v2, :cond_4

    const/16 v2, 0xa0

    .line 682
    :cond_4
    iput v2, p0, Ll/ᩴ᩻;->֡:I

    if-eqz p1, :cond_e

    .line 684
    iget p3, p1, Ll/ᩴ᩻;->ܽ:I

    iput p3, p0, Ll/ᩴ᩻;->ܽ:I

    .line 685
    iget p3, p1, Ll/ᩴ᩻;->᩷:I

    iput p3, p0, Ll/ᩴ᩻;->᩷:I

    .line 686
    iput-boolean v1, p0, Ll/ᩴ᩻;->ܿ:Z

    .line 687
    iput-boolean v1, p0, Ll/ᩴ᩻;->ۧ:Z

    .line 688
    iget-boolean p3, p1, Ll/ᩴ᩻;->ܰ:Z

    iput-boolean p3, p0, Ll/ᩴ᩻;->ܰ:Z

    .line 689
    iget-boolean p3, p1, Ll/ᩴ᩻;->ᩴ:Z

    iput-boolean p3, p0, Ll/ᩴ᩻;->ᩴ:Z

    .line 690
    iget-boolean p3, p1, Ll/ᩴ᩻;->ۚ:Z

    iput-boolean p3, p0, Ll/ᩴ᩻;->ۚ:Z

    .line 692
    iget p3, p1, Ll/ᩴ᩻;->ۗ:I

    iput p3, p0, Ll/ᩴ᩻;->ۗ:I

    .line 693
    iget p3, p1, Ll/ᩴ᩻;->ܶ:I

    iput p3, p0, Ll/ᩴ᩻;->ܶ:I

    .line 694
    iget p3, p1, Ll/ᩴ᩻;->᩸:I

    iput p3, p0, Ll/ᩴ᩻;->᩸:I

    .line 695
    iget-boolean p3, p1, Ll/ᩴ᩻;->֫:Z

    iput-boolean p3, p0, Ll/ᩴ᩻;->֫:Z

    .line 696
    iget-object p3, p1, Ll/ᩴ᩻;->ۢ:Landroid/graphics/ColorFilter;

    iput-object p3, p0, Ll/ᩴ᩻;->ۢ:Landroid/graphics/ColorFilter;

    .line 697
    iget-boolean p3, p1, Ll/ᩴ᩻;->᩹:Z

    iput-boolean p3, p0, Ll/ᩴ᩻;->᩹:Z

    .line 698
    iget-object p3, p1, Ll/ᩴ᩻;->ۨ:Landroid/content/res/ColorStateList;

    iput-object p3, p0, Ll/ᩴ᩻;->ۨ:Landroid/content/res/ColorStateList;

    .line 699
    iget-object p3, p1, Ll/ᩴ᩻;->᩺:Landroid/graphics/PorterDuff$Mode;

    iput-object p3, p0, Ll/ᩴ᩻;->᩺:Landroid/graphics/PorterDuff$Mode;

    .line 700
    iget-boolean p3, p1, Ll/ᩴ᩻;->᩶:Z

    iput-boolean p3, p0, Ll/ᩴ᩻;->᩶:Z

    .line 701
    iget-boolean p3, p1, Ll/ᩴ᩻;->ۙ:Z

    iput-boolean p3, p0, Ll/ᩴ᩻;->ۙ:Z

    .line 702
    iget p3, p1, Ll/ᩴ᩻;->֡:I

    if-ne p3, v2, :cond_7

    .line 703
    iget-boolean p3, p1, Ll/ᩴ᩻;->᩻:Z

    if-eqz p3, :cond_6

    .line 705
    iget-object p3, p1, Ll/ᩴ᩻;->ۘ:Landroid/graphics/Rect;

    if-eqz p3, :cond_5

    .line 706
    new-instance p2, Landroid/graphics/Rect;

    iget-object p3, p1, Ll/ᩴ᩻;->ۘ:Landroid/graphics/Rect;

    invoke-direct {p2, p3}, Landroid/graphics/Rect;-><init>(Landroid/graphics/Rect;)V

    :cond_5
    iput-object p2, p0, Ll/ᩴ᩻;->ۘ:Landroid/graphics/Rect;

    .line 707
    iput-boolean v1, p0, Ll/ᩴ᩻;->᩻:Z

    .line 709
    :cond_6
    iget-boolean p2, p1, Ll/ᩴ᩻;->ᩳ:Z

    if-eqz p2, :cond_7

    .line 710
    iget p2, p1, Ll/ᩴ᩻;->᩵:I

    iput p2, p0, Ll/ᩴ᩻;->᩵:I

    .line 711
    iget p2, p1, Ll/ᩴ᩻;->ۡ:I

    iput p2, p0, Ll/ᩴ᩻;->ۡ:I

    .line 712
    iget p2, p1, Ll/ᩴ᩻;->ۖ:I

    iput p2, p0, Ll/ᩴ᩻;->ۖ:I

    .line 713
    iget p2, p1, Ll/ᩴ᩻;->ܺ:I

    iput p2, p0, Ll/ᩴ᩻;->ܺ:I

    .line 714
    iput-boolean v1, p0, Ll/ᩴ᩻;->ᩳ:Z

    .line 717
    :cond_7
    iget-boolean p2, p1, Ll/ᩴ᩻;->ܳ:Z

    if-eqz p2, :cond_8

    .line 718
    iget p2, p1, Ll/ᩴ᩻;->۫:I

    iput p2, p0, Ll/ᩴ᩻;->۫:I

    .line 719
    iput-boolean v1, p0, Ll/ᩴ᩻;->ܳ:Z

    .line 721
    :cond_8
    iget-boolean p2, p1, Ll/ᩴ᩻;->ۜ:Z

    if-eqz p2, :cond_9

    .line 723
    iput-boolean v1, p0, Ll/ᩴ᩻;->ۜ:Z

    .line 727
    :cond_9
    iget-object p2, p1, Ll/ᩴ᩻;->۠:[Landroid/graphics/drawable/Drawable;

    .line 728
    array-length p3, p2

    new-array p3, p3, [Landroid/graphics/drawable/Drawable;

    iput-object p3, p0, Ll/ᩴ᩻;->۠:[Landroid/graphics/drawable/Drawable;

    .line 729
    iget p3, p1, Ll/ᩴ᩻;->۬:I

    iput p3, p0, Ll/ᩴ᩻;->۬:I

    .line 730
    iget-object p1, p1, Ll/ᩴ᩻;->֨:Landroid/util/SparseArray;

    if-eqz p1, :cond_a

    .line 732
    invoke-virtual {p1}, Landroid/util/SparseArray;->clone()Landroid/util/SparseArray;

    move-result-object p1

    iput-object p1, p0, Ll/ᩴ᩻;->֨:Landroid/util/SparseArray;

    goto :goto_3

    .line 734
    :cond_a
    new-instance p1, Landroid/util/SparseArray;

    iget p3, p0, Ll/ᩴ᩻;->۬:I

    invoke-direct {p1, p3}, Landroid/util/SparseArray;-><init>(I)V

    iput-object p1, p0, Ll/ᩴ᩻;->֨:Landroid/util/SparseArray;

    .line 739
    :goto_3
    iget p1, p0, Ll/ᩴ᩻;->۬:I

    :goto_4
    if-ge v0, p1, :cond_d

    .line 741
    aget-object p3, p2, v0

    if-eqz p3, :cond_c

    .line 742
    invoke-virtual {p3}, Landroid/graphics/drawable/Drawable;->getConstantState()Landroid/graphics/drawable/Drawable$ConstantState;

    move-result-object p3

    if-eqz p3, :cond_b

    .line 744
    iget-object v1, p0, Ll/ᩴ᩻;->֨:Landroid/util/SparseArray;

    invoke-virtual {v1, v0, p3}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    goto :goto_5

    .line 746
    :cond_b
    iget-object p3, p0, Ll/ᩴ᩻;->۠:[Landroid/graphics/drawable/Drawable;

    aget-object v1, p2, v0

    aput-object v1, p3, v0

    :cond_c
    :goto_5
    add-int/lit8 v0, v0, 0x1

    goto :goto_4

    :cond_d
    return-void

    :cond_e
    const/16 p1, 0xa

    new-array p1, p1, [Landroid/graphics/drawable/Drawable;

    .line 751
    iput-object p1, p0, Ll/ᩴ᩻;->۠:[Landroid/graphics/drawable/Drawable;

    .line 752
    iput v0, p0, Ll/ᩴ᩻;->۬:I

    return-void
.end method

.method private ܳ()V
    .locals 7

    .line 799
    iget-object v0, p0, Ll/ᩴ᩻;->֨:Landroid/util/SparseArray;

    if-eqz v0, :cond_2

    .line 800
    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    .line 802
    iget-object v2, p0, Ll/ᩴ᩻;->֨:Landroid/util/SparseArray;

    invoke-virtual {v2, v1}, Landroid/util/SparseArray;->keyAt(I)I

    move-result v2

    .line 803
    iget-object v3, p0, Ll/ᩴ᩻;->֨:Landroid/util/SparseArray;

    invoke-virtual {v3, v1}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/graphics/drawable/Drawable$ConstantState;

    .line 804
    iget-object v4, p0, Ll/ᩴ᩻;->۠:[Landroid/graphics/drawable/Drawable;

    iget-object v5, p0, Ll/ᩴ᩻;->ۛ:Landroid/content/res/Resources;

    invoke-virtual {v3, v5}, Landroid/graphics/drawable/Drawable$ConstantState;->newDrawable(Landroid/content/res/Resources;)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    .line 811
    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v6, 0x17

    if-lt v5, v6, :cond_0

    .line 812
    iget v5, p0, Ll/ᩴ᩻;->ۗ:I

    invoke-static {v3, v5}, Ll/۠۬;->֫(Landroid/graphics/drawable/Drawable;I)Z

    .line 814
    :cond_0
    invoke-virtual {v3}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object v3

    .line 815
    iget-object v5, p0, Ll/ᩴ᩻;->ۤ:Ll/۠᩻;

    invoke-virtual {v3, v5}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V

    .line 804
    aput-object v3, v4, v2

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    .line 806
    iput-object v0, p0, Ll/ᩴ᩻;->֨:Landroid/util/SparseArray;

    :cond_2
    return-void
.end method


# virtual methods
.method public final canApplyTheme()Z
    .locals 6

    .line 911
    iget v0, p0, Ll/ᩴ᩻;->۬:I

    .line 912
    iget-object v1, p0, Ll/ᩴ᩻;->۠:[Landroid/graphics/drawable/Drawable;

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v0, :cond_2

    .line 914
    aget-object v4, v1, v3

    const/4 v5, 0x1

    if-eqz v4, :cond_0

    .line 916
    invoke-static {v4}, Ll/۠۬;->֫(Landroid/graphics/drawable/Drawable;)Z

    move-result v4

    if-eqz v4, :cond_1

    return v5

    .line 920
    :cond_0
    iget-object v4, p0, Ll/ᩴ᩻;->֨:Landroid/util/SparseArray;

    invoke-virtual {v4, v3}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/graphics/drawable/Drawable$ConstantState;

    if-eqz v4, :cond_1

    .line 1215
    invoke-virtual {v4}, Landroid/graphics/drawable/Drawable$ConstantState;->canApplyTheme()Z

    move-result v4

    if-eqz v4, :cond_1

    return v5

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    return v2
.end method

.method public final getChangingConfigurations()I
    .locals 2

    .line 758
    iget v0, p0, Ll/ᩴ᩻;->ܽ:I

    iget v1, p0, Ll/ᩴ᩻;->᩷:I

    or-int/2addr v0, v1

    return v0
.end method

.method public final ֫(Landroid/graphics/drawable/Drawable;)I
    .locals 6

    .line 768
    iget v0, p0, Ll/ᩴ᩻;->۬:I

    .line 769
    iget-object v1, p0, Ll/ᩴ᩻;->۠:[Landroid/graphics/drawable/Drawable;

    array-length v1, v1

    const/4 v2, 0x0

    if-lt v0, v1, :cond_1

    add-int/lit8 v1, v0, 0xa

    .line 770
    move-object v3, p0

    check-cast v3, Ll/֨᩻;

    .line 1123
    new-array v4, v1, [Landroid/graphics/drawable/Drawable;

    .line 1124
    iget-object v5, v3, Ll/ᩴ᩻;->۠:[Landroid/graphics/drawable/Drawable;

    if-eqz v5, :cond_0

    .line 1125
    invoke-static {v5, v2, v4, v2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 1127
    :cond_0
    iput-object v4, v3, Ll/ᩴ᩻;->۠:[Landroid/graphics/drawable/Drawable;

    .line 378
    new-array v1, v1, [[I

    .line 379
    iget-object v4, v3, Ll/֨᩻;->۟:[[I

    invoke-static {v4, v2, v1, v2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 380
    iput-object v1, v3, Ll/֨᩻;->۟:[[I

    .line 772
    :cond_1
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    const/4 v1, 0x1

    .line 773
    invoke-virtual {p1, v2, v1}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z

    .line 774
    iget-object v3, p0, Ll/ᩴ᩻;->ۤ:Ll/۠᩻;

    invoke-virtual {p1, v3}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V

    .line 775
    iget-object v3, p0, Ll/ᩴ᩻;->۠:[Landroid/graphics/drawable/Drawable;

    aput-object p1, v3, v0

    .line 776
    iget v3, p0, Ll/ᩴ᩻;->۬:I

    add-int/2addr v3, v1

    iput v3, p0, Ll/ᩴ᩻;->۬:I

    .line 777
    iget v1, p0, Ll/ᩴ᩻;->᩷:I

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getChangingConfigurations()I

    move-result p1

    or-int/2addr p1, v1

    iput p1, p0, Ll/ᩴ᩻;->᩷:I

    .line 790
    iput-boolean v2, p0, Ll/ᩴ᩻;->ܳ:Z

    .line 791
    iput-boolean v2, p0, Ll/ᩴ᩻;->ۜ:Z

    const/4 p1, 0x0

    .line 779
    iput-object p1, p0, Ll/ᩴ᩻;->ۘ:Landroid/graphics/Rect;

    .line 780
    iput-boolean v2, p0, Ll/ᩴ᩻;->᩻:Z

    .line 781
    iput-boolean v2, p0, Ll/ᩴ᩻;->ᩳ:Z

    .line 782
    iput-boolean v2, p0, Ll/ᩴ᩻;->ܿ:Z

    return v0
.end method

.method public final ֫(I)Landroid/graphics/drawable/Drawable;
    .locals 5

    .line 827
    iget-object v0, p0, Ll/ᩴ᩻;->۠:[Landroid/graphics/drawable/Drawable;

    aget-object v0, v0, p1

    if-eqz v0, :cond_0

    return-object v0

    .line 832
    :cond_0
    iget-object v0, p0, Ll/ᩴ᩻;->֨:Landroid/util/SparseArray;

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    .line 833
    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->indexOfKey(I)I

    move-result v0

    if-ltz v0, :cond_3

    .line 835
    iget-object v2, p0, Ll/ᩴ᩻;->֨:Landroid/util/SparseArray;

    invoke-virtual {v2, v0}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/graphics/drawable/Drawable$ConstantState;

    .line 836
    iget-object v3, p0, Ll/ᩴ᩻;->ۛ:Landroid/content/res/Resources;

    invoke-virtual {v2, v3}, Landroid/graphics/drawable/Drawable$ConstantState;->newDrawable(Landroid/content/res/Resources;)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    .line 811
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x17

    if-lt v3, v4, :cond_1

    .line 812
    iget v3, p0, Ll/ᩴ᩻;->ۗ:I

    invoke-static {v2, v3}, Ll/۠۬;->֫(Landroid/graphics/drawable/Drawable;I)Z

    .line 814
    :cond_1
    invoke-virtual {v2}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object v2

    .line 815
    iget-object v3, p0, Ll/ᩴ᩻;->ۤ:Ll/۠᩻;

    invoke-virtual {v2, v3}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V

    .line 837
    iget-object v3, p0, Ll/ᩴ᩻;->۠:[Landroid/graphics/drawable/Drawable;

    aput-object v2, v3, p1

    .line 838
    iget-object p1, p0, Ll/ᩴ᩻;->֨:Landroid/util/SparseArray;

    invoke-virtual {p1, v0}, Landroid/util/SparseArray;->removeAt(I)V

    .line 839
    iget-object p1, p0, Ll/ᩴ᩻;->֨:Landroid/util/SparseArray;

    invoke-virtual {p1}, Landroid/util/SparseArray;->size()I

    move-result p1

    if-nez p1, :cond_2

    .line 840
    iput-object v1, p0, Ll/ᩴ᩻;->֨:Landroid/util/SparseArray;

    :cond_2
    return-object v2

    :cond_3
    return-object v1
.end method

.method public final ֫(Landroid/content/res/Resources$Theme;)V
    .locals 6

    if-eqz p1, :cond_3

    .line 894
    invoke-direct {p0}, Ll/ᩴ᩻;->ܳ()V

    .line 895
    iget v0, p0, Ll/ᩴ᩻;->۬:I

    .line 896
    iget-object v1, p0, Ll/ᩴ᩻;->۠:[Landroid/graphics/drawable/Drawable;

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v0, :cond_1

    .line 898
    aget-object v4, v1, v3

    if-eqz v4, :cond_0

    invoke-static {v4}, Ll/۠۬;->֫(Landroid/graphics/drawable/Drawable;)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 899
    aget-object v4, v1, v3

    invoke-static {v4, p1}, Ll/۠۬;->֫(Landroid/graphics/drawable/Drawable;Landroid/content/res/Resources$Theme;)V

    .line 901
    iget v4, p0, Ll/ᩴ᩻;->᩷:I

    aget-object v5, v1, v3

    invoke-virtual {v5}, Landroid/graphics/drawable/Drawable;->getChangingConfigurations()I

    move-result v5

    or-int/2addr v4, v5

    iput v4, p0, Ll/ᩴ᩻;->᩷:I

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 1219
    :cond_1
    invoke-virtual {p1}, Landroid/content/res/Resources$Theme;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    if-eqz p1, :cond_3

    .line 878
    iput-object p1, p0, Ll/ᩴ᩻;->ۛ:Landroid/content/res/Resources;

    .line 881
    sget v0, Ll/᩵᩻;->۟:I

    .line 1204
    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p1

    iget p1, p1, Landroid/util/DisplayMetrics;->densityDpi:I

    if-nez p1, :cond_2

    const/16 p1, 0xa0

    .line 882
    :cond_2
    iget v0, p0, Ll/ᩴ᩻;->֡:I

    .line 883
    iput p1, p0, Ll/ᩴ᩻;->֡:I

    if-eq v0, p1, :cond_3

    .line 885
    iput-boolean v2, p0, Ll/ᩴ᩻;->ᩳ:Z

    .line 886
    iput-boolean v2, p0, Ll/ᩴ᩻;->᩻:Z

    :cond_3
    return-void
.end method

.method public final ֫()Z
    .locals 6

    .line 1134
    iget-boolean v0, p0, Ll/ᩴ᩻;->ܿ:Z

    if-eqz v0, :cond_0

    .line 1135
    iget-boolean v0, p0, Ll/ᩴ᩻;->ۧ:Z

    return v0

    .line 1137
    :cond_0
    invoke-direct {p0}, Ll/ᩴ᩻;->ܳ()V

    const/4 v0, 0x1

    .line 1138
    iput-boolean v0, p0, Ll/ᩴ᩻;->ܿ:Z

    .line 1139
    iget v1, p0, Ll/ᩴ᩻;->۬:I

    .line 1140
    iget-object v2, p0, Ll/ᩴ᩻;->۠:[Landroid/graphics/drawable/Drawable;

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v1, :cond_2

    .line 1142
    aget-object v5, v2, v4

    invoke-virtual {v5}, Landroid/graphics/drawable/Drawable;->getConstantState()Landroid/graphics/drawable/Drawable$ConstantState;

    move-result-object v5

    if-nez v5, :cond_1

    .line 1143
    iput-boolean v3, p0, Ll/ᩴ᩻;->ۧ:Z

    return v3

    :cond_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 1147
    :cond_2
    iput-boolean v0, p0, Ll/ᩴ᩻;->ۧ:Z

    return v0
.end method

.method public final ۧ()V
    .locals 6

    const/4 v0, 0x1

    .line 1042
    iput-boolean v0, p0, Ll/ᩴ᩻;->ᩳ:Z

    .line 1043
    invoke-direct {p0}, Ll/ᩴ᩻;->ܳ()V

    .line 1044
    iget v0, p0, Ll/ᩴ᩻;->۬:I

    .line 1045
    iget-object v1, p0, Ll/ᩴ᩻;->۠:[Landroid/graphics/drawable/Drawable;

    const/4 v2, -0x1

    .line 1046
    iput v2, p0, Ll/ᩴ᩻;->ۡ:I

    iput v2, p0, Ll/ᩴ᩻;->᩵:I

    const/4 v2, 0x0

    .line 1047
    iput v2, p0, Ll/ᩴ᩻;->ܺ:I

    iput v2, p0, Ll/ᩴ᩻;->ۖ:I

    :goto_0
    if-ge v2, v0, :cond_4

    .line 1049
    aget-object v3, v1, v2

    .line 1050
    invoke-virtual {v3}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v4

    .line 1051
    iget v5, p0, Ll/ᩴ᩻;->᩵:I

    if-le v4, v5, :cond_0

    iput v4, p0, Ll/ᩴ᩻;->᩵:I

    .line 1052
    :cond_0
    invoke-virtual {v3}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v4

    .line 1053
    iget v5, p0, Ll/ᩴ᩻;->ۡ:I

    if-le v4, v5, :cond_1

    iput v4, p0, Ll/ᩴ᩻;->ۡ:I

    .line 1054
    :cond_1
    invoke-virtual {v3}, Landroid/graphics/drawable/Drawable;->getMinimumWidth()I

    move-result v4

    .line 1055
    iget v5, p0, Ll/ᩴ᩻;->ۖ:I

    if-le v4, v5, :cond_2

    iput v4, p0, Ll/ᩴ᩻;->ۖ:I

    .line 1056
    :cond_2
    invoke-virtual {v3}, Landroid/graphics/drawable/Drawable;->getMinimumHeight()I

    move-result v3

    .line 1057
    iget v4, p0, Ll/ᩴ᩻;->ܺ:I

    if-le v3, v4, :cond_3

    iput v3, p0, Ll/ᩴ᩻;->ܺ:I

    :cond_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_4
    return-void
.end method

.method public final ܽ()Landroid/graphics/Rect;
    .locals 8

    .line 966
    iget-boolean v0, p0, Ll/ᩴ᩻;->ܰ:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return-object v1

    .line 969
    :cond_0
    iget-object v0, p0, Ll/ᩴ᩻;->ۘ:Landroid/graphics/Rect;

    if-nez v0, :cond_8

    iget-boolean v2, p0, Ll/ᩴ᩻;->᩻:Z

    if-eqz v2, :cond_1

    goto :goto_1

    .line 972
    :cond_1
    invoke-direct {p0}, Ll/ᩴ᩻;->ܳ()V

    .line 974
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 975
    iget v2, p0, Ll/ᩴ᩻;->۬:I

    .line 976
    iget-object v3, p0, Ll/ᩴ᩻;->۠:[Landroid/graphics/drawable/Drawable;

    const/4 v4, 0x0

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v2, :cond_7

    .line 978
    aget-object v6, v3, v5

    invoke-virtual {v6, v0}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z

    move-result v6

    if-eqz v6, :cond_6

    if-nez v1, :cond_2

    .line 979
    new-instance v1, Landroid/graphics/Rect;

    invoke-direct {v1, v4, v4, v4, v4}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 980
    :cond_2
    iget v6, v0, Landroid/graphics/Rect;->left:I

    iget v7, v1, Landroid/graphics/Rect;->left:I

    if-le v6, v7, :cond_3

    iput v6, v1, Landroid/graphics/Rect;->left:I

    .line 981
    :cond_3
    iget v6, v0, Landroid/graphics/Rect;->top:I

    iget v7, v1, Landroid/graphics/Rect;->top:I

    if-le v6, v7, :cond_4

    iput v6, v1, Landroid/graphics/Rect;->top:I

    .line 982
    :cond_4
    iget v6, v0, Landroid/graphics/Rect;->right:I

    iget v7, v1, Landroid/graphics/Rect;->right:I

    if-le v6, v7, :cond_5

    iput v6, v1, Landroid/graphics/Rect;->right:I

    .line 983
    :cond_5
    iget v6, v0, Landroid/graphics/Rect;->bottom:I

    iget v7, v1, Landroid/graphics/Rect;->bottom:I

    if-le v6, v7, :cond_6

    iput v6, v1, Landroid/graphics/Rect;->bottom:I

    :cond_6
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_7
    const/4 v0, 0x1

    .line 986
    iput-boolean v0, p0, Ll/ᩴ᩻;->᩻:Z

    .line 987
    iput-object v1, p0, Ll/ᩴ᩻;->ۘ:Landroid/graphics/Rect;

    return-object v1

    :cond_8
    :goto_1
    return-object v0
.end method

.method public abstract ܿ()V
.end method

.method public final ᩳ()I
    .locals 6

    .line 1082
    iget-boolean v0, p0, Ll/ᩴ᩻;->ܳ:Z

    if-eqz v0, :cond_0

    .line 1083
    iget v0, p0, Ll/ᩴ᩻;->۫:I

    return v0

    .line 1085
    :cond_0
    invoke-direct {p0}, Ll/ᩴ᩻;->ܳ()V

    .line 1086
    iget v0, p0, Ll/ᩴ᩻;->۬:I

    .line 1087
    iget-object v1, p0, Ll/ᩴ᩻;->۠:[Landroid/graphics/drawable/Drawable;

    if-lez v0, :cond_1

    const/4 v2, 0x0

    .line 1088
    aget-object v2, v1, v2

    invoke-virtual {v2}, Landroid/graphics/drawable/Drawable;->getOpacity()I

    move-result v2

    goto :goto_0

    :cond_1
    const/4 v2, -0x2

    :goto_0
    const/4 v3, 0x1

    const/4 v4, 0x1

    :goto_1
    if-ge v4, v0, :cond_2

    .line 1090
    aget-object v5, v1, v4

    invoke-virtual {v5}, Landroid/graphics/drawable/Drawable;->getOpacity()I

    move-result v5

    invoke-static {v2, v5}, Landroid/graphics/drawable/Drawable;->resolveOpacity(II)I

    move-result v2

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    .line 1092
    :cond_2
    iput v2, p0, Ll/ᩴ᩻;->۫:I

    .line 1093
    iput-boolean v3, p0, Ll/ᩴ᩻;->ܳ:Z

    return v2
.end method
