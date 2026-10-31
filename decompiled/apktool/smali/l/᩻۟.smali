.class public Ll/᩻۟;
.super Landroid/view/accessibility/AccessibilityNodeProvider;
.source "K4SO"


# instance fields
.field public final ֫:Ll/᩷۟;


# direct methods
.method public constructor <init>(Ll/᩷۟;)V
    .locals 0

    .line 44
    invoke-direct {p0}, Landroid/view/accessibility/AccessibilityNodeProvider;-><init>()V

    .line 45
    iput-object p1, p0, Ll/᩻۟;->֫:Ll/᩷۟;

    return-void
.end method


# virtual methods
.method public final createAccessibilityNodeInfo(I)Landroid/view/accessibility/AccessibilityNodeInfo;
    .locals 1

    .line 50
    iget-object v0, p0, Ll/᩻۟;->֫:Ll/᩷۟;

    .line 51
    invoke-virtual {v0, p1}, Ll/᩷۟;->֫(I)Ll/ܳ۟;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 55
    :cond_0
    invoke-virtual {p1}, Ll/ܳ۟;->ܶ()Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object p1

    return-object p1
.end method

.method public final findAccessibilityNodeInfosByText(Ljava/lang/String;I)Ljava/util/List;
    .locals 0

    .line 62
    iget-object p1, p0, Ll/᩻۟;->֫:Ll/᩷۟;

    .line 63
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p1, 0x0

    return-object p1
.end method

.method public final findFocus(I)Landroid/view/accessibility/AccessibilityNodeInfo;
    .locals 1

    .line 84
    iget-object v0, p0, Ll/᩻۟;->֫:Ll/᩷۟;

    invoke-virtual {v0, p1}, Ll/᩷۟;->ۧ(I)Ll/ܳ۟;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 88
    :cond_0
    invoke-virtual {p1}, Ll/ܳ۟;->ܶ()Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object p1

    return-object p1
.end method

.method public final performAction(IILandroid/os/Bundle;)Z
    .locals 1

    .line 79
    iget-object v0, p0, Ll/᩻۟;->֫:Ll/᩷۟;

    invoke-virtual {v0, p1, p2, p3}, Ll/᩷۟;->֫(IILandroid/os/Bundle;)Z

    move-result p1

    return p1
.end method
