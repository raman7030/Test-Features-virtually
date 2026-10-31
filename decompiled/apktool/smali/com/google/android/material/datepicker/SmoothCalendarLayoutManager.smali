.class public Lcom/google/android/material/datepicker/SmoothCalendarLayoutManager;
.super Ll/ۜۗۧ;
.source "SmoothCalendarLayoutManager.java"


# static fields
.field public static final MILLISECONDS_PER_INCH:F = 100.0f


# direct methods
.method public constructor <init>(Landroid/content/Context;IZ)V
    .locals 0

    .line 34
    invoke-direct {p0, p1, p2, p3}, Ll/ۜۗۧ;-><init>(Landroid/content/Context;IZ)V

    return-void
.end method


# virtual methods
.method public smoothScrollToPosition(Ll/۬۬ۧ;Ll/᩸۬ۧ;I)V
    .locals 0

    .line 40
    new-instance p2, Lcom/google/android/material/datepicker/SmoothCalendarLayoutManager$1;

    .line 41
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-direct {p2, p0, p1}, Lcom/google/android/material/datepicker/SmoothCalendarLayoutManager$1;-><init>(Lcom/google/android/material/datepicker/SmoothCalendarLayoutManager;Landroid/content/Context;)V

    .line 48
    invoke-virtual {p2, p3}, Ll/ܶ۬ۧ;->setTargetPosition(I)V

    .line 49
    invoke-virtual {p0, p2}, Ll/ܿ۬ۧ;->startSmoothScroll(Ll/ܶ۬ۧ;)V

    return-void
.end method
