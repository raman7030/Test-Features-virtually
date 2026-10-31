.class public Lcom/google/android/material/progressindicator/DeterminateDrawable$1;
.super Ll/ܶܽ֫;
.source "DeterminateDrawable.java"


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 300
    invoke-direct {p0, p1}, Ll/ܶܽ֫;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public getValue(Lcom/google/android/material/progressindicator/DeterminateDrawable;)F
    .locals 1

    .line 303
    invoke-static {p1}, Lcom/google/android/material/progressindicator/DeterminateDrawable;->access$000(Lcom/google/android/material/progressindicator/DeterminateDrawable;)F

    move-result p1

    const v0, 0x461c4000    # 10000.0f

    mul-float p1, p1, v0

    return p1
.end method

.method public bridge synthetic getValue(Ljava/lang/Object;)F
    .locals 0

    .line 300
    check-cast p1, Lcom/google/android/material/progressindicator/DeterminateDrawable;

    invoke-virtual {p0, p1}, Lcom/google/android/material/progressindicator/DeterminateDrawable$1;->getValue(Lcom/google/android/material/progressindicator/DeterminateDrawable;)F

    move-result p1

    return p1
.end method

.method public setValue(Lcom/google/android/material/progressindicator/DeterminateDrawable;F)V
    .locals 1

    const v0, 0x461c4000    # 10000.0f

    div-float/2addr p2, v0

    .line 308
    invoke-static {p1, p2}, Lcom/google/android/material/progressindicator/DeterminateDrawable;->access$100(Lcom/google/android/material/progressindicator/DeterminateDrawable;F)V

    return-void
.end method

.method public bridge synthetic setValue(Ljava/lang/Object;F)V
    .locals 0

    .line 300
    check-cast p1, Lcom/google/android/material/progressindicator/DeterminateDrawable;

    invoke-virtual {p0, p1, p2}, Lcom/google/android/material/progressindicator/DeterminateDrawable$1;->setValue(Lcom/google/android/material/progressindicator/DeterminateDrawable;F)V

    return-void
.end method
