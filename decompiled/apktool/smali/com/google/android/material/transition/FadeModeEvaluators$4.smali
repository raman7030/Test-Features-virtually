.class public Lcom/google/android/material/transition/FadeModeEvaluators$4;
.super Ljava/lang/Object;
.source "FadeModeEvaluators.java"

# interfaces
.implements Lcom/google/android/material/transition/FadeModeEvaluator;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 63
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public evaluate(FFFF)Lcom/google/android/material/transition/FadeModeResult;
    .locals 2

    .line 67
    invoke-static {p3, p2, p4, p2}, Ll/᩶᩵ᩳ;->֫(FFFF)F

    move-result p4

    const/16 v0, 0xff

    const/4 v1, 0x0

    .line 70
    invoke-static {v0, v1, p2, p4, p1}, Lcom/google/android/material/transition/TransitionUtils;->lerp(IIFFF)I

    move-result p2

    .line 71
    invoke-static {v1, v0, p4, p3, p1}, Lcom/google/android/material/transition/TransitionUtils;->lerp(IIFFF)I

    move-result p1

    .line 72
    invoke-static {p2, p1}, Lcom/google/android/material/transition/FadeModeResult;->startOnTop(II)Lcom/google/android/material/transition/FadeModeResult;

    move-result-object p1

    return-object p1
.end method
