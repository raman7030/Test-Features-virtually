.class public Lcom/google/android/material/datepicker/MaterialCalendar$6;
.super Ll/ܽۛ;
.source "MaterialCalendar.java"


# instance fields
.field public final synthetic this$0:Lcom/google/android/material/datepicker/MaterialCalendar;


# direct methods
.method public constructor <init>(Lcom/google/android/material/datepicker/MaterialCalendar;)V
    .locals 0

    .line 412
    iput-object p1, p0, Lcom/google/android/material/datepicker/MaterialCalendar$6;->this$0:Lcom/google/android/material/datepicker/MaterialCalendar;

    invoke-direct {p0}, Ll/ܽۛ;-><init>()V

    return-void
.end method


# virtual methods
.method public onInitializeAccessibilityNodeInfo(Landroid/view/View;Ll/ܳ۟;)V
    .locals 1

    .line 417
    invoke-super {p0, p1, p2}, Ll/ܽۛ;->onInitializeAccessibilityNodeInfo(Landroid/view/View;Ll/ܳ۟;)V

    .line 419
    iget-object p1, p0, Lcom/google/android/material/datepicker/MaterialCalendar$6;->this$0:Lcom/google/android/material/datepicker/MaterialCalendar;

    invoke-static {p1}, Lcom/google/android/material/datepicker/MaterialCalendar;->access$500(Lcom/google/android/material/datepicker/MaterialCalendar;)Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    move-result p1

    if-nez p1, :cond_0

    .line 420
    iget-object p1, p0, Lcom/google/android/material/datepicker/MaterialCalendar$6;->this$0:Lcom/google/android/material/datepicker/MaterialCalendar;

    sget v0, Ll/ۘ۠ܺ;->᩻ᩳ:I

    invoke-virtual {p1, v0}, Ll/ۡ᩻֫;->getString(I)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    .line 421
    :cond_0
    iget-object p1, p0, Lcom/google/android/material/datepicker/MaterialCalendar$6;->this$0:Lcom/google/android/material/datepicker/MaterialCalendar;

    sget v0, Ll/ۘ۠ܺ;->ܿᩳ:I

    invoke-virtual {p1, v0}, Ll/ۡ᩻֫;->getString(I)Ljava/lang/String;

    move-result-object p1

    .line 418
    :goto_0
    invoke-virtual {p2, p1}, Ll/ܳ۟;->֫(Ljava/lang/String;)V

    return-void
.end method
