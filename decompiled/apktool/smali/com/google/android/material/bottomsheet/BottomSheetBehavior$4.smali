.class public Lcom/google/android/material/bottomsheet/BottomSheetBehavior$4;
.super Ljava/lang/Object;
.source "BottomSheetBehavior.java"

# interfaces
.implements Lcom/google/android/material/internal/ViewUtils$OnApplyWindowInsetsListener;


# instance fields
.field public final synthetic this$0:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

.field public final synthetic val$shouldHandleGestureInsets:Z


# direct methods
.method public constructor <init>(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;Z)V
    .locals 0

    .line 1738
    iput-object p1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior$4;->this$0:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    iput-boolean p2, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior$4;->val$shouldHandleGestureInsets:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onApplyWindowInsets(Landroid/view/View;Ll/᩸ܰ;Lcom/google/android/material/internal/ViewUtils$RelativePadding;)Ll/᩸ܰ;
    .locals 10

    const/4 v0, 0x7

    .line 1743
    invoke-virtual {p2, v0}, Ll/᩸ܰ;->֫(I)Ll/ۧ۬;

    move-result-object v0

    const/16 v1, 0x20

    .line 1745
    invoke-virtual {p2, v1}, Ll/᩸ܰ;->֫(I)Ll/ۧ۬;

    move-result-object v1

    .line 1747
    iget-object v2, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior$4;->this$0:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    iget v3, v0, Ll/ۧ۬;->ᩳ:I

    iget v4, v0, Ll/ۧ۬;->ܽ:I

    iget v5, v0, Ll/ۧ۬;->ۧ:I

    invoke-static {v2, v3}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->access$302(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;I)I

    .line 1749
    invoke-static {p1}, Lcom/google/android/material/internal/ViewUtils;->isLayoutRtl(Landroid/view/View;)Z

    move-result v2

    .line 1751
    invoke-virtual {p1}, Landroid/view/View;->getPaddingBottom()I

    move-result v3

    .line 1752
    invoke-virtual {p1}, Landroid/view/View;->getPaddingLeft()I

    move-result v6

    .line 1753
    invoke-virtual {p1}, Landroid/view/View;->getPaddingRight()I

    move-result v7

    .line 1755
    iget-object v8, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior$4;->this$0:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    invoke-static {v8}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->access$400(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;)Z

    move-result v8

    if-eqz v8, :cond_0

    .line 1758
    iget-object v3, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior$4;->this$0:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    invoke-virtual {p2}, Ll/᩸ܰ;->᩻()I

    move-result v8

    invoke-static {v3, v8}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->access$502(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;I)I

    .line 1759
    iget v3, p3, Lcom/google/android/material/internal/ViewUtils$RelativePadding;->bottom:I

    iget-object v8, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior$4;->this$0:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    invoke-static {v8}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->access$500(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;)I

    move-result v8

    add-int/2addr v3, v8

    .line 1762
    :cond_0
    iget-object v8, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior$4;->this$0:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    invoke-static {v8}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->access$600(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;)Z

    move-result v8

    if-eqz v8, :cond_2

    if-eqz v2, :cond_1

    .line 1763
    iget v6, p3, Lcom/google/android/material/internal/ViewUtils$RelativePadding;->end:I

    goto :goto_0

    :cond_1
    iget v6, p3, Lcom/google/android/material/internal/ViewUtils$RelativePadding;->start:I

    :goto_0
    add-int/2addr v6, v5

    .line 1767
    :cond_2
    iget-object v8, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior$4;->this$0:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    invoke-static {v8}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->access$700(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;)Z

    move-result v8

    if-eqz v8, :cond_4

    if-eqz v2, :cond_3

    .line 1768
    iget p3, p3, Lcom/google/android/material/internal/ViewUtils$RelativePadding;->start:I

    goto :goto_1

    :cond_3
    iget p3, p3, Lcom/google/android/material/internal/ViewUtils$RelativePadding;->end:I

    :goto_1
    add-int v7, p3, v4

    .line 1772
    :cond_4
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p3

    check-cast p3, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 1775
    iget-object v2, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior$4;->this$0:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    invoke-static {v2}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->access$800(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;)Z

    move-result v2

    const/4 v8, 0x0

    const/4 v9, 0x1

    if-eqz v2, :cond_5

    iget v2, p3, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    if-eq v2, v5, :cond_5

    .line 1776
    iput v5, p3, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    const/4 v2, 0x1

    goto :goto_2

    :cond_5
    const/4 v2, 0x0

    .line 1780
    :goto_2
    iget-object v5, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior$4;->this$0:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    invoke-static {v5}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->access$900(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;)Z

    move-result v5

    if-eqz v5, :cond_6

    iget v5, p3, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    if-eq v5, v4, :cond_6

    .line 1781
    iput v4, p3, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    const/4 v2, 0x1

    .line 1785
    :cond_6
    iget-object v4, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior$4;->this$0:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    invoke-static {v4}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->access$1000(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;)Z

    move-result v4

    if-eqz v4, :cond_7

    iget v4, p3, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    iget v0, v0, Ll/ۧ۬;->ᩳ:I

    if-eq v4, v0, :cond_7

    .line 1786
    iput v0, p3, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    goto :goto_3

    :cond_7
    move v9, v2

    :goto_3
    if-eqz v9, :cond_8

    .line 1791
    invoke-virtual {p1, p3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1793
    :cond_8
    invoke-virtual {p1}, Landroid/view/View;->getPaddingTop()I

    move-result p3

    invoke-virtual {p1, v6, p3, v7, v3}, Landroid/view/View;->setPadding(IIII)V

    .line 1795
    iget-boolean p1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior$4;->val$shouldHandleGestureInsets:Z

    if-eqz p1, :cond_9

    .line 1796
    iget-object p1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior$4;->this$0:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    iget p3, v1, Ll/ۧ۬;->֫:I

    invoke-static {p1, p3}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->access$1102(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;I)I

    .line 1801
    :cond_9
    iget-object p1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior$4;->this$0:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    invoke-static {p1}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->access$400(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;)Z

    move-result p1

    if-nez p1, :cond_b

    iget-boolean p1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior$4;->val$shouldHandleGestureInsets:Z

    if-eqz p1, :cond_a

    goto :goto_4

    :cond_a
    return-object p2

    .line 1802
    :cond_b
    :goto_4
    iget-object p1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior$4;->this$0:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    invoke-static {p1, v8}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->access$1200(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;Z)V

    return-object p2
.end method
