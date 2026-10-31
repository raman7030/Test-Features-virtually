.class public Lcom/google/android/material/internal/NavigationMenuPresenter$NavigationMenuAdapter$1;
.super Ll/ܽۛ;
.source "NavigationMenuPresenter.java"


# instance fields
.field public final synthetic this$1:Lcom/google/android/material/internal/NavigationMenuPresenter$NavigationMenuAdapter;

.field public final synthetic val$isHeader:Z

.field public final synthetic val$position:I


# direct methods
.method public constructor <init>(Lcom/google/android/material/internal/NavigationMenuPresenter$NavigationMenuAdapter;IZ)V
    .locals 0

    .line 652
    iput-object p1, p0, Lcom/google/android/material/internal/NavigationMenuPresenter$NavigationMenuAdapter$1;->this$1:Lcom/google/android/material/internal/NavigationMenuPresenter$NavigationMenuAdapter;

    iput p2, p0, Lcom/google/android/material/internal/NavigationMenuPresenter$NavigationMenuAdapter$1;->val$position:I

    iput-boolean p3, p0, Lcom/google/android/material/internal/NavigationMenuPresenter$NavigationMenuAdapter$1;->val$isHeader:Z

    invoke-direct {p0}, Ll/ܽۛ;-><init>()V

    return-void
.end method


# virtual methods
.method public onInitializeAccessibilityNodeInfo(Landroid/view/View;Ll/ܳ۟;)V
    .locals 8

    .line 656
    invoke-super {p0, p1, p2}, Ll/ܽۛ;->onInitializeAccessibilityNodeInfo(Landroid/view/View;Ll/ܳ۟;)V

    .line 657
    iget-object v0, p0, Lcom/google/android/material/internal/NavigationMenuPresenter$NavigationMenuAdapter$1;->this$1:Lcom/google/android/material/internal/NavigationMenuPresenter$NavigationMenuAdapter;

    iget v1, p0, Lcom/google/android/material/internal/NavigationMenuPresenter$NavigationMenuAdapter$1;->val$position:I

    .line 659
    invoke-static {v0, v1}, Lcom/google/android/material/internal/NavigationMenuPresenter$NavigationMenuAdapter;->access$100(Lcom/google/android/material/internal/NavigationMenuPresenter$NavigationMenuAdapter;I)I

    move-result v2

    iget-boolean v6, p0, Lcom/google/android/material/internal/NavigationMenuPresenter$NavigationMenuAdapter$1;->val$isHeader:Z

    .line 664
    invoke-virtual {p1}, Landroid/view/View;->isSelected()Z

    move-result v7

    const/4 v3, 0x1

    const/4 v4, 0x1

    const/4 v5, 0x1

    .line 658
    invoke-static/range {v2 .. v7}, Ll/ᩳ۟;->֫(IIIIZZ)Ll/ᩳ۟;

    move-result-object p1

    .line 657
    invoke-virtual {p2, p1}, Ll/ܳ۟;->֫(Ll/ᩳ۟;)V

    return-void
.end method
