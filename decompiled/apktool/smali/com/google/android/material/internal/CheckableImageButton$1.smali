.class public Lcom/google/android/material/internal/CheckableImageButton$1;
.super Ll/ܽۛ;
.source "CheckableImageButton.java"


# instance fields
.field public final synthetic this$0:Lcom/google/android/material/internal/CheckableImageButton;


# direct methods
.method public constructor <init>(Lcom/google/android/material/internal/CheckableImageButton;)V
    .locals 0

    .line 60
    iput-object p1, p0, Lcom/google/android/material/internal/CheckableImageButton$1;->this$0:Lcom/google/android/material/internal/CheckableImageButton;

    invoke-direct {p0}, Ll/ܽۛ;-><init>()V

    return-void
.end method


# virtual methods
.method public onInitializeAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 0

    .line 63
    invoke-super {p0, p1, p2}, Ll/ܽۛ;->onInitializeAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V

    .line 64
    iget-object p1, p0, Lcom/google/android/material/internal/CheckableImageButton$1;->this$0:Lcom/google/android/material/internal/CheckableImageButton;

    invoke-virtual {p1}, Lcom/google/android/material/internal/CheckableImageButton;->isChecked()Z

    move-result p1

    invoke-virtual {p2, p1}, Landroid/view/accessibility/AccessibilityRecord;->setChecked(Z)V

    return-void
.end method

.method public onInitializeAccessibilityNodeInfo(Landroid/view/View;Ll/ܳ۟;)V
    .locals 0

    .line 70
    invoke-super {p0, p1, p2}, Ll/ܽۛ;->onInitializeAccessibilityNodeInfo(Landroid/view/View;Ll/ܳ۟;)V

    .line 71
    iget-object p1, p0, Lcom/google/android/material/internal/CheckableImageButton$1;->this$0:Lcom/google/android/material/internal/CheckableImageButton;

    invoke-virtual {p1}, Lcom/google/android/material/internal/CheckableImageButton;->isCheckable()Z

    move-result p1

    invoke-virtual {p2, p1}, Ll/ܳ۟;->ۧ(Z)V

    .line 72
    iget-object p1, p0, Lcom/google/android/material/internal/CheckableImageButton$1;->this$0:Lcom/google/android/material/internal/CheckableImageButton;

    invoke-virtual {p1}, Lcom/google/android/material/internal/CheckableImageButton;->isChecked()Z

    move-result p1

    invoke-virtual {p2, p1}, Ll/ܳ۟;->ܽ(Z)V

    return-void
.end method
