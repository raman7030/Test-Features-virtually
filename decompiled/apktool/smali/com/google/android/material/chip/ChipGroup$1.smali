.class public Lcom/google/android/material/chip/ChipGroup$1;
.super Ljava/lang/Object;
.source "ChipGroup.java"

# interfaces
.implements Lcom/google/android/material/internal/CheckableGroup$OnCheckedStateChangeListener;


# instance fields
.field public final synthetic this$0:Lcom/google/android/material/chip/ChipGroup;


# direct methods
.method public constructor <init>(Lcom/google/android/material/chip/ChipGroup;)V
    .locals 0

    .line 162
    iput-object p1, p0, Lcom/google/android/material/chip/ChipGroup$1;->this$0:Lcom/google/android/material/chip/ChipGroup;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCheckedStateChanged(Ljava/util/Set;)V
    .locals 3

    .line 165
    iget-object p1, p0, Lcom/google/android/material/chip/ChipGroup$1;->this$0:Lcom/google/android/material/chip/ChipGroup;

    invoke-static {p1}, Lcom/google/android/material/chip/ChipGroup;->access$100(Lcom/google/android/material/chip/ChipGroup;)Lcom/google/android/material/chip/ChipGroup$OnCheckedStateChangeListener;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 166
    iget-object p1, p0, Lcom/google/android/material/chip/ChipGroup$1;->this$0:Lcom/google/android/material/chip/ChipGroup;

    invoke-static {p1}, Lcom/google/android/material/chip/ChipGroup;->access$100(Lcom/google/android/material/chip/ChipGroup;)Lcom/google/android/material/chip/ChipGroup$OnCheckedStateChangeListener;

    move-result-object p1

    iget-object v0, p0, Lcom/google/android/material/chip/ChipGroup$1;->this$0:Lcom/google/android/material/chip/ChipGroup;

    .line 168
    invoke-static {v0}, Lcom/google/android/material/chip/ChipGroup;->access$200(Lcom/google/android/material/chip/ChipGroup;)Lcom/google/android/material/internal/CheckableGroup;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/material/chip/ChipGroup$1;->this$0:Lcom/google/android/material/chip/ChipGroup;

    invoke-virtual {v1, v2}, Lcom/google/android/material/internal/CheckableGroup;->getCheckedIdsSortedByChildOrder(Landroid/view/ViewGroup;)Ljava/util/List;

    move-result-object v1

    .line 166
    invoke-interface {p1, v0, v1}, Lcom/google/android/material/chip/ChipGroup$OnCheckedStateChangeListener;->onCheckedChanged(Lcom/google/android/material/chip/ChipGroup;Ljava/util/List;)V

    :cond_0
    return-void
.end method
