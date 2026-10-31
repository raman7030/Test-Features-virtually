.class public Lcom/google/android/material/datepicker/SmoothCalendarLayoutManager$1;
.super Ll/᩷ۗۧ;
.source "SmoothCalendarLayoutManager.java"


# instance fields
.field public final synthetic this$0:Lcom/google/android/material/datepicker/SmoothCalendarLayoutManager;


# direct methods
.method public constructor <init>(Lcom/google/android/material/datepicker/SmoothCalendarLayoutManager;Landroid/content/Context;)V
    .locals 0

    .line 41
    iput-object p1, p0, Lcom/google/android/material/datepicker/SmoothCalendarLayoutManager$1;->this$0:Lcom/google/android/material/datepicker/SmoothCalendarLayoutManager;

    invoke-direct {p0, p2}, Ll/᩷ۗۧ;-><init>(Landroid/content/Context;)V

    return-void
.end method


# virtual methods
.method public calculateSpeedPerPixel(Landroid/util/DisplayMetrics;)F
    .locals 1

    .line 45
    iget p1, p1, Landroid/util/DisplayMetrics;->densityDpi:I

    int-to-float p1, p1

    const/high16 v0, 0x42c80000    # 100.0f

    div-float/2addr v0, p1

    return v0
.end method
