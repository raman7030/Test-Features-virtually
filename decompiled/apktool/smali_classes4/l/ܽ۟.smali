.class public final Ll/ܽ۟;
.super Ljava/lang/Object;
.source "44RH"


# instance fields
.field public final ֫:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroid/view/accessibility/AccessibilityNodeInfo$CollectionInfo;)V
    .locals 0

    .line 1018
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1019
    iput-object p1, p0, Ll/ܽ۟;->֫:Ljava/lang/Object;

    return-void
.end method

.method public static ֫(I)Ll/ܽ۟;
    .locals 3

    .line 1014
    new-instance v0, Ll/ܽ۟;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {p0, v1, v2}, Landroid/view/accessibility/AccessibilityNodeInfo$CollectionInfo;->obtain(IIZ)Landroid/view/accessibility/AccessibilityNodeInfo$CollectionInfo;

    move-result-object p0

    invoke-direct {v0, p0}, Ll/ܽ۟;-><init>(Landroid/view/accessibility/AccessibilityNodeInfo$CollectionInfo;)V

    return-object v0
.end method

.method public static ֫(IIIZ)Ll/ܽ۟;
    .locals 1

    .line 995
    new-instance v0, Ll/ܽ۟;

    invoke-static {p0, p1, p3, p2}, Landroid/view/accessibility/AccessibilityNodeInfo$CollectionInfo;->obtain(IIZI)Landroid/view/accessibility/AccessibilityNodeInfo$CollectionInfo;

    move-result-object p0

    invoke-direct {v0, p0}, Ll/ܽ۟;-><init>(Landroid/view/accessibility/AccessibilityNodeInfo$CollectionInfo;)V

    return-object v0
.end method
