.class public Lcom/google/android/material/timepicker/TimePickerClockPresenter$2;
.super Lcom/google/android/material/timepicker/ClickActionDelegate;
.source "TimePickerClockPresenter.java"


# instance fields
.field public final synthetic this$0:Lcom/google/android/material/timepicker/TimePickerClockPresenter;


# direct methods
.method public constructor <init>(Lcom/google/android/material/timepicker/TimePickerClockPresenter;Landroid/content/Context;I)V
    .locals 0

    .line 190
    iput-object p1, p0, Lcom/google/android/material/timepicker/TimePickerClockPresenter$2;->this$0:Lcom/google/android/material/timepicker/TimePickerClockPresenter;

    invoke-direct {p0, p2, p3}, Lcom/google/android/material/timepicker/ClickActionDelegate;-><init>(Landroid/content/Context;I)V

    return-void
.end method


# virtual methods
.method public onInitializeAccessibilityNodeInfo(Landroid/view/View;Ll/ܳ۟;)V
    .locals 4

    .line 194
    invoke-super {p0, p1, p2}, Lcom/google/android/material/timepicker/ClickActionDelegate;->onInitializeAccessibilityNodeInfo(Landroid/view/View;Ll/ܳ۟;)V

    .line 196
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    sget v0, Ll/ۘ۠ܺ;->ۜۧ:I

    iget-object v1, p0, Lcom/google/android/material/timepicker/TimePickerClockPresenter$2;->this$0:Lcom/google/android/material/timepicker/TimePickerClockPresenter;

    .line 197
    invoke-static {v1}, Lcom/google/android/material/timepicker/TimePickerClockPresenter;->access$000(Lcom/google/android/material/timepicker/TimePickerClockPresenter;)Lcom/google/android/material/timepicker/TimeModel;

    move-result-object v1

    iget v1, v1, Lcom/google/android/material/timepicker/TimeModel;->minute:I

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v1, v2, v3

    invoke-virtual {p1, v0, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    .line 195
    invoke-virtual {p2, p1}, Ll/ܳ۟;->ۧ(Ljava/lang/CharSequence;)V

    return-void
.end method
