.class public Lcom/google/android/material/button/MaterialButtonToggleGroup$2;
.super Ll/ܽۛ;
.source "MaterialButtonToggleGroup.java"


# instance fields
.field public final synthetic this$0:Lcom/google/android/material/button/MaterialButtonToggleGroup;


# direct methods
.method public constructor <init>(Lcom/google/android/material/button/MaterialButtonToggleGroup;)V
    .locals 0

    .line 265
    iput-object p1, p0, Lcom/google/android/material/button/MaterialButtonToggleGroup$2;->this$0:Lcom/google/android/material/button/MaterialButtonToggleGroup;

    invoke-direct {p0}, Ll/ܽۛ;-><init>()V

    return-void
.end method


# virtual methods
.method public onInitializeAccessibilityNodeInfo(Landroid/view/View;Ll/ܳ۟;)V
    .locals 7

    .line 269
    invoke-super {p0, p1, p2}, Ll/ܽۛ;->onInitializeAccessibilityNodeInfo(Landroid/view/View;Ll/ܳ۟;)V

    .line 270
    iget-object v0, p0, Lcom/google/android/material/button/MaterialButtonToggleGroup$2;->this$0:Lcom/google/android/material/button/MaterialButtonToggleGroup;

    .line 274
    invoke-static {v0, p1}, Lcom/google/android/material/button/MaterialButtonToggleGroup;->access$100(Lcom/google/android/material/button/MaterialButtonToggleGroup;Landroid/view/View;)I

    move-result v3

    check-cast p1, Lcom/google/android/material/button/MaterialButton;

    .line 277
    invoke-virtual {p1}, Lcom/google/android/material/button/MaterialButton;->isChecked()Z

    move-result v6

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v4, 0x1

    const/4 v5, 0x0

    .line 271
    invoke-static/range {v1 .. v6}, Ll/ᩳ۟;->֫(IIIIZZ)Ll/ᩳ۟;

    move-result-object p1

    .line 270
    invoke-virtual {p2, p1}, Ll/ܳ۟;->֫(Ll/ᩳ۟;)V

    return-void
.end method
