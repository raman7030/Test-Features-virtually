.class public Lcom/google/android/material/carousel/CarouselLayoutManager$KeylineRange;
.super Ljava/lang/Object;
.source "CarouselLayoutManager.java"


# instance fields
.field public final leftOrTop:Lcom/google/android/material/carousel/KeylineState$Keyline;

.field public final rightOrBottom:Lcom/google/android/material/carousel/KeylineState$Keyline;


# direct methods
.method public constructor <init>(Lcom/google/android/material/carousel/KeylineState$Keyline;Lcom/google/android/material/carousel/KeylineState$Keyline;)V
    .locals 2

    .line 1672
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1673
    iget v0, p1, Lcom/google/android/material/carousel/KeylineState$Keyline;->loc:F

    iget v1, p2, Lcom/google/android/material/carousel/KeylineState$Keyline;->loc:F

    cmpg-float v0, v0, v1

    if-gtz v0, :cond_0

    .line 1674
    iput-object p1, p0, Lcom/google/android/material/carousel/CarouselLayoutManager$KeylineRange;->leftOrTop:Lcom/google/android/material/carousel/KeylineState$Keyline;

    .line 1675
    iput-object p2, p0, Lcom/google/android/material/carousel/CarouselLayoutManager$KeylineRange;->rightOrBottom:Lcom/google/android/material/carousel/KeylineState$Keyline;

    return-void

    .line 37
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1
.end method
