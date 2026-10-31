.class public Lcom/google/android/material/datepicker/MaterialCalendar$2;
.super Lcom/google/android/material/datepicker/SmoothCalendarLayoutManager;
.source "MaterialCalendar.java"


# instance fields
.field public final synthetic this$0:Lcom/google/android/material/datepicker/MaterialCalendar;

.field public final synthetic val$orientation:I


# direct methods
.method public constructor <init>(Lcom/google/android/material/datepicker/MaterialCalendar;Landroid/content/Context;IZI)V
    .locals 0

    .line 189
    iput-object p1, p0, Lcom/google/android/material/datepicker/MaterialCalendar$2;->this$0:Lcom/google/android/material/datepicker/MaterialCalendar;

    iput p5, p0, Lcom/google/android/material/datepicker/MaterialCalendar$2;->val$orientation:I

    invoke-direct {p0, p2, p3, p4}, Lcom/google/android/material/datepicker/SmoothCalendarLayoutManager;-><init>(Landroid/content/Context;IZ)V

    return-void
.end method


# virtual methods
.method public calculateExtraLayoutSpace(Ll/᩸۬ۧ;[I)V
    .locals 2

    .line 192
    iget p1, p0, Lcom/google/android/material/datepicker/MaterialCalendar$2;->val$orientation:I

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-nez p1, :cond_0

    .line 193
    iget-object p1, p0, Lcom/google/android/material/datepicker/MaterialCalendar$2;->this$0:Lcom/google/android/material/datepicker/MaterialCalendar;

    invoke-static {p1}, Lcom/google/android/material/datepicker/MaterialCalendar;->access$000(Lcom/google/android/material/datepicker/MaterialCalendar;)Ll/۬۬ۧ;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result p1

    aput p1, p2, v1

    .line 194
    iget-object p1, p0, Lcom/google/android/material/datepicker/MaterialCalendar$2;->this$0:Lcom/google/android/material/datepicker/MaterialCalendar;

    invoke-static {p1}, Lcom/google/android/material/datepicker/MaterialCalendar;->access$000(Lcom/google/android/material/datepicker/MaterialCalendar;)Ll/۬۬ۧ;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result p1

    aput p1, p2, v0

    return-void

    .line 196
    :cond_0
    iget-object p1, p0, Lcom/google/android/material/datepicker/MaterialCalendar$2;->this$0:Lcom/google/android/material/datepicker/MaterialCalendar;

    invoke-static {p1}, Lcom/google/android/material/datepicker/MaterialCalendar;->access$000(Lcom/google/android/material/datepicker/MaterialCalendar;)Ll/۬۬ۧ;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result p1

    aput p1, p2, v1

    .line 197
    iget-object p1, p0, Lcom/google/android/material/datepicker/MaterialCalendar$2;->this$0:Lcom/google/android/material/datepicker/MaterialCalendar;

    invoke-static {p1}, Lcom/google/android/material/datepicker/MaterialCalendar;->access$000(Lcom/google/android/material/datepicker/MaterialCalendar;)Ll/۬۬ۧ;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result p1

    aput p1, p2, v0

    return-void
.end method
