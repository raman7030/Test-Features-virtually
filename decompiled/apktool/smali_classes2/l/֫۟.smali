.class public final Ll/֫۟;
.super Ljava/lang/Object;
.source "44RH"


# direct methods
.method public static ֫(Landroid/view/accessibility/AccessibilityNodeInfo;)Landroid/view/accessibility/AccessibilityNodeInfo$ExtraRenderingInfo;
    .locals 0

    .line 5212
    invoke-virtual {p0}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtraRenderingInfo()Landroid/view/accessibility/AccessibilityNodeInfo$ExtraRenderingInfo;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ljava/lang/Object;)Ljava/lang/String;
    .locals 0

    .line 5273
    check-cast p0, Landroid/view/accessibility/AccessibilityNodeInfo$CollectionItemInfo;

    invoke-virtual {p0}, Landroid/view/accessibility/AccessibilityNodeInfo$CollectionItemInfo;->getColumnTitle()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Landroid/view/accessibility/AccessibilityNodeInfo;I)Ll/ܳ۟;
    .locals 0

    .line 5251
    invoke-virtual {p0, p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->getParent(I)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object p0

    if-eqz p0, :cond_0

    .line 2223
    new-instance p1, Ll/ܳ۟;

    invoke-direct {p1, p0}, Ll/ܳ۟;-><init>(Ljava/lang/Object;)V

    return-object p1

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static ֫(Landroid/view/accessibility/AccessibilityNodeInfo;II)Ll/ܳ۟;
    .locals 0

    .line 5244
    invoke-virtual {p0, p1, p2}, Landroid/view/accessibility/AccessibilityNodeInfo;->getChild(II)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object p0

    if-eqz p0, :cond_0

    .line 2223
    new-instance p1, Ll/ܳ۟;

    invoke-direct {p1, p0}, Ll/ܳ۟;-><init>(Ljava/lang/Object;)V

    return-object p1

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static ֫(ZIIIIZLjava/lang/String;Ljava/lang/String;)Ll/ᩳ۟;
    .locals 2

    .line 5229
    new-instance v0, Ll/ᩳ۟;

    new-instance v1, Landroid/view/accessibility/AccessibilityNodeInfo$CollectionItemInfo$Builder;

    invoke-direct {v1}, Landroid/view/accessibility/AccessibilityNodeInfo$CollectionItemInfo$Builder;-><init>()V

    .line 5231
    invoke-virtual {v1, p0}, Landroid/view/accessibility/AccessibilityNodeInfo$CollectionItemInfo$Builder;->setHeading(Z)Landroid/view/accessibility/AccessibilityNodeInfo$CollectionItemInfo$Builder;

    move-result-object p0

    invoke-virtual {p0, p1}, Landroid/view/accessibility/AccessibilityNodeInfo$CollectionItemInfo$Builder;->setColumnIndex(I)Landroid/view/accessibility/AccessibilityNodeInfo$CollectionItemInfo$Builder;

    move-result-object p0

    .line 5232
    invoke-virtual {p0, p2}, Landroid/view/accessibility/AccessibilityNodeInfo$CollectionItemInfo$Builder;->setRowIndex(I)Landroid/view/accessibility/AccessibilityNodeInfo$CollectionItemInfo$Builder;

    move-result-object p0

    .line 5233
    invoke-virtual {p0, p3}, Landroid/view/accessibility/AccessibilityNodeInfo$CollectionItemInfo$Builder;->setColumnSpan(I)Landroid/view/accessibility/AccessibilityNodeInfo$CollectionItemInfo$Builder;

    move-result-object p0

    .line 5234
    invoke-virtual {p0, p4}, Landroid/view/accessibility/AccessibilityNodeInfo$CollectionItemInfo$Builder;->setRowSpan(I)Landroid/view/accessibility/AccessibilityNodeInfo$CollectionItemInfo$Builder;

    move-result-object p0

    .line 5235
    invoke-virtual {p0, p5}, Landroid/view/accessibility/AccessibilityNodeInfo$CollectionItemInfo$Builder;->setSelected(Z)Landroid/view/accessibility/AccessibilityNodeInfo$CollectionItemInfo$Builder;

    move-result-object p0

    .line 5236
    invoke-virtual {p0, p6}, Landroid/view/accessibility/AccessibilityNodeInfo$CollectionItemInfo$Builder;->setRowTitle(Ljava/lang/String;)Landroid/view/accessibility/AccessibilityNodeInfo$CollectionItemInfo$Builder;

    move-result-object p0

    .line 5237
    invoke-virtual {p0, p7}, Landroid/view/accessibility/AccessibilityNodeInfo$CollectionItemInfo$Builder;->setColumnTitle(Ljava/lang/String;)Landroid/view/accessibility/AccessibilityNodeInfo$CollectionItemInfo$Builder;

    move-result-object p0

    .line 5238
    invoke-virtual {p0}, Landroid/view/accessibility/AccessibilityNodeInfo$CollectionItemInfo$Builder;->build()Landroid/view/accessibility/AccessibilityNodeInfo$CollectionItemInfo;

    move-result-object p0

    invoke-direct {v0, p0}, Ll/ᩳ۟;-><init>(Landroid/view/accessibility/AccessibilityNodeInfo$CollectionItemInfo;)V

    return-object v0
.end method

.method public static ֫(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)V
    .locals 0

    .line 5262
    invoke-virtual {p0, p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setUniqueId(Ljava/lang/String;)V

    return-void
.end method

.method public static ֫(Landroid/view/accessibility/AccessibilityNodeInfo;Z)V
    .locals 0

    .line 5222
    invoke-virtual {p0, p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setTextSelectable(Z)V

    return-void
.end method

.method public static ۧ(Landroid/view/accessibility/AccessibilityNodeInfo;)Ljava/lang/String;
    .locals 0

    .line 5257
    invoke-virtual {p0}, Landroid/view/accessibility/AccessibilityNodeInfo;->getUniqueId()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ۧ(Ljava/lang/Object;)Ljava/lang/String;
    .locals 0

    .line 5267
    check-cast p0, Landroid/view/accessibility/AccessibilityNodeInfo$CollectionItemInfo;

    invoke-virtual {p0}, Landroid/view/accessibility/AccessibilityNodeInfo$CollectionItemInfo;->getRowTitle()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ܽ(Landroid/view/accessibility/AccessibilityNodeInfo;)Z
    .locals 0

    .line 5217
    invoke-virtual {p0}, Landroid/view/accessibility/AccessibilityNodeInfo;->isTextSelectable()Z

    move-result p0

    return p0
.end method
