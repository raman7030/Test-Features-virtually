.class public Lcom/google/android/material/internal/NavigationMenuPresenter$NavigationMenuViewAccessibilityDelegate;
.super Ll/ۤ۬ۧ;
.source "NavigationMenuPresenter.java"


# instance fields
.field public final synthetic this$0:Lcom/google/android/material/internal/NavigationMenuPresenter;


# direct methods
.method public constructor <init>(Lcom/google/android/material/internal/NavigationMenuPresenter;Ll/۬۬ۧ;)V
    .locals 0

    .line 920
    iput-object p1, p0, Lcom/google/android/material/internal/NavigationMenuPresenter$NavigationMenuViewAccessibilityDelegate;->this$0:Lcom/google/android/material/internal/NavigationMenuPresenter;

    .line 921
    invoke-direct {p0, p2}, Ll/ۤ۬ۧ;-><init>(Ll/۬۬ۧ;)V

    return-void
.end method


# virtual methods
.method public onInitializeAccessibilityNodeInfo(Landroid/view/View;Ll/ܳ۟;)V
    .locals 0

    .line 927
    invoke-super {p0, p1, p2}, Ll/ۤ۬ۧ;->onInitializeAccessibilityNodeInfo(Landroid/view/View;Ll/ܳ۟;)V

    .line 928
    iget-object p1, p0, Lcom/google/android/material/internal/NavigationMenuPresenter$NavigationMenuViewAccessibilityDelegate;->this$0:Lcom/google/android/material/internal/NavigationMenuPresenter;

    iget-object p1, p1, Lcom/google/android/material/internal/NavigationMenuPresenter;->adapter:Lcom/google/android/material/internal/NavigationMenuPresenter$NavigationMenuAdapter;

    .line 930
    invoke-virtual {p1}, Lcom/google/android/material/internal/NavigationMenuPresenter$NavigationMenuAdapter;->getRowCount()I

    move-result p1

    .line 929
    invoke-static {p1}, Ll/ܽ۟;->֫(I)Ll/ܽ۟;

    move-result-object p1

    .line 928
    invoke-virtual {p2, p1}, Ll/ܳ۟;->֫(Ll/ܽ۟;)V

    return-void
.end method
