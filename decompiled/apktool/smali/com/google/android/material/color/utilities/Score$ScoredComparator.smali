.class public Lcom/google/android/material/color/utilities/Score$ScoredComparator;
.super Ljava/lang/Object;
.source "Score.java"

# interfaces
.implements Ljava/util/Comparator;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 178
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public compare(Lcom/google/android/material/color/utilities/Score$ScoredHCT;Lcom/google/android/material/color/utilities/Score$ScoredHCT;)I
    .locals 2

    .line 182
    iget-wide v0, p2, Lcom/google/android/material/color/utilities/Score$ScoredHCT;->score:D

    iget-wide p1, p1, Lcom/google/android/material/color/utilities/Score$ScoredHCT;->score:D

    invoke-static {v0, v1, p1, p2}, Ljava/lang/Double;->compare(DD)I

    move-result p1

    return p1
.end method

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    .line 177
    check-cast p1, Lcom/google/android/material/color/utilities/Score$ScoredHCT;

    check-cast p2, Lcom/google/android/material/color/utilities/Score$ScoredHCT;

    invoke-virtual {p0, p1, p2}, Lcom/google/android/material/color/utilities/Score$ScoredComparator;->compare(Lcom/google/android/material/color/utilities/Score$ScoredHCT;Lcom/google/android/material/color/utilities/Score$ScoredHCT;)I

    move-result p1

    return p1
.end method
