.class public final Ll/ܿ۟;
.super Ljava/lang/Object;
.source "44RH"


# instance fields
.field public final ֫:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroid/view/accessibility/AccessibilityNodeInfo$RangeInfo;)V
    .locals 0

    .line 1381
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1382
    iput-object p1, p0, Ll/ܿ۟;->֫:Ljava/lang/Object;

    return-void
.end method

.method public static ֫(FFF)Ll/ܿ۟;
    .locals 2

    .line 1375
    new-instance v0, Ll/ܿ۟;

    const/4 v1, 0x1

    .line 1376
    invoke-static {v1, p0, p1, p2}, Landroid/view/accessibility/AccessibilityNodeInfo$RangeInfo;->obtain(IFFF)Landroid/view/accessibility/AccessibilityNodeInfo$RangeInfo;

    move-result-object p0

    invoke-direct {v0, p0}, Ll/ܿ۟;-><init>(Landroid/view/accessibility/AccessibilityNodeInfo$RangeInfo;)V

    return-object v0
.end method
