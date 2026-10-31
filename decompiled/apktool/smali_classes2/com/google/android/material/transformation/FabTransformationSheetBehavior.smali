.class public Lcom/google/android/material/transformation/FabTransformationSheetBehavior;
.super Lcom/google/android/material/transformation/FabTransformationBehavior;
.source "FabTransformationSheetBehavior.java"


# annotations
.annotation runtime Ljava/lang/Deprecated;
.end annotation


# instance fields
.field public importantForAccessibilityMap:Ljava/util/Map;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 53
    invoke-direct {p0}, Lcom/google/android/material/transformation/FabTransformationBehavior;-><init>()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 56
    invoke-direct {p0, p1, p2}, Lcom/google/android/material/transformation/FabTransformationBehavior;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method private updateImportantForAccessibility(Landroid/view/View;Z)V
    .locals 6

    .line 84
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    .line 85
    instance-of v1, v0, Ll/ᩳ᩹;

    if-nez v1, :cond_0

    goto :goto_4

    .line 89
    :cond_0
    check-cast v0, Ll/ᩳ᩹;

    .line 90
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    if-eqz p2, :cond_1

    .line 92
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2, v1}, Ljava/util/HashMap;-><init>(I)V

    iput-object v2, p0, Lcom/google/android/material/transformation/FabTransformationSheetBehavior;->importantForAccessibilityMap:Ljava/util/Map;

    :cond_1
    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_6

    .line 96
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    .line 100
    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v4

    instance-of v4, v4, Ll/ܰ᩸;

    if-eqz v4, :cond_2

    .line 101
    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v4

    check-cast v4, Ll/ܰ᩸;

    invoke-virtual {v4}, Ll/ܰ᩸;->ܽ()Ll/ۛ᩸;

    move-result-object v4

    instance-of v4, v4, Lcom/google/android/material/transformation/FabTransformationScrimBehavior;

    if-eqz v4, :cond_2

    const/4 v4, 0x1

    goto :goto_1

    :cond_2
    const/4 v4, 0x0

    :goto_1
    if-eq v3, p1, :cond_5

    if-eqz v4, :cond_3

    goto :goto_3

    :cond_3
    if-nez p2, :cond_4

    .line 108
    iget-object v4, p0, Lcom/google/android/material/transformation/FabTransformationSheetBehavior;->importantForAccessibilityMap:Ljava/util/Map;

    if-eqz v4, :cond_5

    .line 109
    invoke-interface {v4, v3}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_5

    .line 111
    iget-object v4, p0, Lcom/google/android/material/transformation/FabTransformationSheetBehavior;->importantForAccessibilityMap:Ljava/util/Map;

    invoke-interface {v4, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    sget v5, Ll/ܿ᩺;->֫:I

    goto :goto_2

    .line 116
    :cond_4
    iget-object v4, p0, Lcom/google/android/material/transformation/FabTransformationSheetBehavior;->importantForAccessibilityMap:Ljava/util/Map;

    invoke-virtual {v3}, Landroid/view/View;->getImportantForAccessibility()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v4, v3, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 119
    sget v4, Ll/ܿ᩺;->֫:I

    const/4 v4, 0x4

    .line 1427
    :goto_2
    invoke-virtual {v3, v4}, Landroid/view/View;->setImportantForAccessibility(I)V

    :cond_5
    :goto_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_6
    if-nez p2, :cond_7

    const/4 p1, 0x0

    .line 125
    iput-object p1, p0, Lcom/google/android/material/transformation/FabTransformationSheetBehavior;->importantForAccessibilityMap:Ljava/util/Map;

    :cond_7
    :goto_4
    return-void
.end method


# virtual methods
.method public onCreateMotionSpec(Landroid/content/Context;Z)Lcom/google/android/material/transformation/FabTransformationBehavior$FabTransformationSpec;
    .locals 2

    if-eqz p2, :cond_0

    .line 64
    sget p2, Ll/ܽ۠ܺ;->۟:I

    goto :goto_0

    .line 66
    :cond_0
    sget p2, Ll/ܽ۠ܺ;->ܰ:I

    .line 69
    :goto_0
    new-instance v0, Lcom/google/android/material/transformation/FabTransformationBehavior$FabTransformationSpec;

    invoke-direct {v0}, Lcom/google/android/material/transformation/FabTransformationBehavior$FabTransformationSpec;-><init>()V

    .line 70
    invoke-static {p1, p2}, Lcom/google/android/material/animation/MotionSpec;->createFromResource(Landroid/content/Context;I)Lcom/google/android/material/animation/MotionSpec;

    move-result-object p1

    iput-object p1, v0, Lcom/google/android/material/transformation/FabTransformationBehavior$FabTransformationSpec;->timings:Lcom/google/android/material/animation/MotionSpec;

    .line 71
    new-instance p1, Lcom/google/android/material/animation/Positioning;

    const/16 p2, 0x11

    const/4 v1, 0x0

    invoke-direct {p1, p2, v1, v1}, Lcom/google/android/material/animation/Positioning;-><init>(IFF)V

    iput-object p1, v0, Lcom/google/android/material/transformation/FabTransformationBehavior$FabTransformationSpec;->positioning:Lcom/google/android/material/animation/Positioning;

    return-object v0
.end method

.method public onExpandedStateChange(Landroid/view/View;Landroid/view/View;ZZ)Z
    .locals 0

    .line 79
    invoke-direct {p0, p2, p3}, Lcom/google/android/material/transformation/FabTransformationSheetBehavior;->updateImportantForAccessibility(Landroid/view/View;Z)V

    .line 80
    invoke-super {p0, p1, p2, p3, p4}, Lcom/google/android/material/transformation/ExpandableTransformationBehavior;->onExpandedStateChange(Landroid/view/View;Landroid/view/View;ZZ)Z

    move-result p1

    return p1
.end method
