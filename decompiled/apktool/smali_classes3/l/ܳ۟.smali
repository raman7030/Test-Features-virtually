.class public final Ll/ܳ۟;
.super Ljava/lang/Object;
.source "44RH"


# static fields
.field public static ܽ:I


# instance fields
.field public final ֫:Landroid/view/accessibility/AccessibilityNodeInfo;

.field public ۧ:I


# direct methods
.method public constructor <init>(Landroid/view/accessibility/AccessibilityNodeInfo;)V
    .locals 1

    .line 2241
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 1596
    iput v0, p0, Ll/ܳ۟;->ۧ:I

    .line 2242
    iput-object p1, p0, Ll/ܳ۟;->֫:Landroid/view/accessibility/AccessibilityNodeInfo;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 2237
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 1596
    iput v0, p0, Ll/ܳ۟;->ۧ:I

    .line 2238
    check-cast p1, Landroid/view/accessibility/AccessibilityNodeInfo;

    iput-object p1, p0, Ll/ܳ۟;->֫:Landroid/view/accessibility/AccessibilityNodeInfo;

    return-void
.end method

.method public static ֫(Landroid/view/accessibility/AccessibilityNodeInfo;)Ll/ܳ۟;
    .locals 1

    .line 2252
    new-instance v0, Ll/ܳ۟;

    invoke-direct {v0, p0}, Ll/ܳ۟;-><init>(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    return-object v0
.end method

.method public static ֫(Ll/ܳ۟;)Ll/ܳ۟;
    .locals 1

    .line 2315
    iget-object p0, p0, Ll/ܳ۟;->֫:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-static {p0}, Landroid/view/accessibility/AccessibilityNodeInfo;->obtain(Landroid/view/accessibility/AccessibilityNodeInfo;)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object p0

    .line 2252
    new-instance v0, Ll/ܳ۟;

    invoke-direct {v0, p0}, Ll/ܳ۟;-><init>(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    return-object v0
.end method

.method private ֫(IZ)V
    .locals 4

    .line 4193
    iget-object v0, p0, Ll/ܳ۟;->֫:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    if-eqz v0, :cond_1

    const-string v1, "androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY"

    const/4 v2, 0x0

    .line 5061
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v2

    not-int v3, p1

    and-int/2addr v2, v3

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    or-int/2addr p1, v2

    .line 5064
    invoke-virtual {v0, v1, p1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    :cond_1
    return-void
.end method

.method public static ܳ(Landroid/view/View;)Ll/ܳ۟;
    .locals 1

    .line 2280
    invoke-static {p0}, Landroid/view/accessibility/AccessibilityNodeInfo;->obtain(Landroid/view/View;)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object p0

    .line 2252
    new-instance v0, Ll/ܳ۟;

    invoke-direct {v0, p0}, Ll/ܳ۟;-><init>(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    return-object v0
.end method

.method private ܽ(Ljava/lang/String;)Ljava/util/ArrayList;
    .locals 2

    .line 2544
    iget-object v0, p0, Ll/ܳ۟;->֫:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    move-result-object v1

    .line 2545
    invoke-virtual {v1, p1}, Landroid/os/Bundle;->getIntegerArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v1

    if-nez v1, :cond_0

    .line 2547
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 2548
    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    invoke-virtual {v0, p1, v1}, Landroid/os/Bundle;->putIntegerArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    :cond_0
    return-object v1
.end method

.method private ܿ(I)Z
    .locals 3

    .line 4193
    iget-object v0, p0, Ll/ܳ۟;->֫:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const-string v2, "androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY"

    .line 5071
    invoke-virtual {v0, v2, v1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    and-int/2addr v0, p1

    if-ne v0, p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    :goto_0
    return v1
.end method

.method public static ᩳ(I)Ljava/lang/String;
    .locals 1

    const/4 v0, 0x1

    if-eq p0, v0, :cond_1

    const/4 v0, 0x2

    if-eq p0, v0, :cond_0

    sparse-switch p0, :sswitch_data_0

    packed-switch p0, :pswitch_data_0

    packed-switch p0, :pswitch_data_1

    packed-switch p0, :pswitch_data_2

    const-string p0, "ACTION_UNKNOWN"

    return-object p0

    :sswitch_0
    const-string p0, "ACTION_SCROLL_IN_DIRECTION"

    return-object p0

    :sswitch_1
    const-string p0, "ACTION_MOVE_WINDOW"

    return-object p0

    :sswitch_2
    const-string p0, "ACTION_SET_TEXT"

    return-object p0

    :sswitch_3
    const-string p0, "ACTION_COLLAPSE"

    return-object p0

    :sswitch_4
    const-string p0, "ACTION_EXPAND"

    return-object p0

    :sswitch_5
    const-string p0, "ACTION_SET_SELECTION"

    return-object p0

    :sswitch_6
    const-string p0, "ACTION_CUT"

    return-object p0

    :sswitch_7
    const-string p0, "ACTION_PASTE"

    return-object p0

    :sswitch_8
    const-string p0, "ACTION_COPY"

    return-object p0

    :sswitch_9
    const-string p0, "ACTION_SCROLL_BACKWARD"

    return-object p0

    :sswitch_a
    const-string p0, "ACTION_SCROLL_FORWARD"

    return-object p0

    :sswitch_b
    const-string p0, "ACTION_PREVIOUS_HTML_ELEMENT"

    return-object p0

    :sswitch_c
    const-string p0, "ACTION_NEXT_HTML_ELEMENT"

    return-object p0

    :sswitch_d
    const-string p0, "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY"

    return-object p0

    :sswitch_e
    const-string p0, "ACTION_NEXT_AT_MOVEMENT_GRANULARITY"

    return-object p0

    :sswitch_f
    const-string p0, "ACTION_CLEAR_ACCESSIBILITY_FOCUS"

    return-object p0

    :sswitch_10
    const-string p0, "ACTION_ACCESSIBILITY_FOCUS"

    return-object p0

    :sswitch_11
    const-string p0, "ACTION_LONG_CLICK"

    return-object p0

    :sswitch_12
    const-string p0, "ACTION_CLICK"

    return-object p0

    :sswitch_13
    const-string p0, "ACTION_CLEAR_SELECTION"

    return-object p0

    :sswitch_14
    const-string p0, "ACTION_SELECT"

    return-object p0

    :pswitch_0
    const-string p0, "ACTION_SET_PROGRESS"

    return-object p0

    :pswitch_1
    const-string p0, "ACTION_CONTEXT_CLICK"

    return-object p0

    :pswitch_2
    const-string p0, "ACTION_SCROLL_RIGHT"

    return-object p0

    :pswitch_3
    const-string p0, "ACTION_SCROLL_DOWN"

    return-object p0

    :pswitch_4
    const-string p0, "ACTION_SCROLL_LEFT"

    return-object p0

    :pswitch_5
    const-string p0, "ACTION_SCROLL_UP"

    return-object p0

    :pswitch_6
    const-string p0, "ACTION_SCROLL_TO_POSITION"

    return-object p0

    :pswitch_7
    const-string p0, "ACTION_SHOW_ON_SCREEN"

    return-object p0

    :pswitch_8
    const-string p0, "ACTION_PRESS_AND_HOLD"

    return-object p0

    :pswitch_9
    const-string p0, "ACTION_PAGE_RIGHT"

    return-object p0

    :pswitch_a
    const-string p0, "ACTION_PAGE_LEFT"

    return-object p0

    :pswitch_b
    const-string p0, "ACTION_PAGE_DOWN"

    return-object p0

    :pswitch_c
    const-string p0, "ACTION_PAGE_UP"

    return-object p0

    :pswitch_d
    const-string p0, "ACTION_HIDE_TOOLTIP"

    return-object p0

    :pswitch_e
    const-string p0, "ACTION_SHOW_TOOLTIP"

    return-object p0

    :pswitch_f
    const-string p0, "ACTION_DRAG_CANCEL"

    return-object p0

    :pswitch_10
    const-string p0, "ACTION_DRAG_DROP"

    return-object p0

    :pswitch_11
    const-string p0, "ACTION_DRAG_START"

    return-object p0

    :pswitch_12
    const-string p0, "ACTION_IME_ENTER"

    return-object p0

    :cond_0
    const-string p0, "ACTION_CLEAR_FOCUS"

    return-object p0

    :cond_1
    const-string p0, "ACTION_FOCUS"

    return-object p0

    nop

    :sswitch_data_0
    .sparse-switch
        0x4 -> :sswitch_14
        0x8 -> :sswitch_13
        0x10 -> :sswitch_12
        0x20 -> :sswitch_11
        0x40 -> :sswitch_10
        0x80 -> :sswitch_f
        0x100 -> :sswitch_e
        0x200 -> :sswitch_d
        0x400 -> :sswitch_c
        0x800 -> :sswitch_b
        0x1000 -> :sswitch_a
        0x2000 -> :sswitch_9
        0x4000 -> :sswitch_8
        0x8000 -> :sswitch_7
        0x10000 -> :sswitch_6
        0x20000 -> :sswitch_5
        0x40000 -> :sswitch_4
        0x80000 -> :sswitch_3
        0x200000 -> :sswitch_2
        0x1020042 -> :sswitch_1
        0x102005e -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x1020036
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x1020044
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x1020054
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
    .end packed-switch
.end method

.method public static ᩸()Ll/ܳ۟;
    .locals 2

    .line 2304
    invoke-static {}, Landroid/view/accessibility/AccessibilityNodeInfo;->obtain()Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v0

    .line 2252
    new-instance v1, Ll/ܳ۟;

    invoke-direct {v1, v0}, Ll/ܳ۟;-><init>(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    return-object v1
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    if-nez p1, :cond_1

    goto :goto_0

    .line 4962
    :cond_1
    instance-of v1, p1, Ll/ܳ۟;

    if-nez v1, :cond_2

    goto :goto_0

    .line 4965
    :cond_2
    check-cast p1, Ll/ܳ۟;

    iget-object v1, p1, Ll/ܳ۟;->֫:Landroid/view/accessibility/AccessibilityNodeInfo;

    .line 4966
    iget-object v2, p0, Ll/ܳ۟;->֫:Landroid/view/accessibility/AccessibilityNodeInfo;

    if-nez v2, :cond_3

    if-eqz v1, :cond_4

    goto :goto_0

    .line 4970
    :cond_3
    invoke-virtual {v2, v1}, Landroid/view/accessibility/AccessibilityNodeInfo;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    goto :goto_0

    .line 4973
    :cond_4
    iget v1, p0, Ll/ܳ۟;->ۧ:I

    iget p1, p1, Ll/ܳ۟;->ۧ:I

    if-eq v1, p1, :cond_5

    :goto_0
    const/4 p1, 0x0

    return p1

    :cond_5
    return v0
.end method

.method public final hashCode()I
    .locals 1

    .line 4951
    iget-object v0, p0, Ll/ܳ۟;->֫:Landroid/view/accessibility/AccessibilityNodeInfo;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->hashCode()I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 13

    .line 4986
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4987
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 4989
    new-instance v1, Landroid/graphics/Rect;

    invoke-direct {v1}, Landroid/graphics/Rect;-><init>()V

    .line 4991
    invoke-virtual {p0, v1}, Ll/ܳ۟;->֫(Landroid/graphics/Rect;)V

    .line 4992
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "; boundsInParent: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 4994
    invoke-virtual {p0, v1}, Ll/ܳ۟;->ۧ(Landroid/graphics/Rect;)V

    .line 4995
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "; boundsInScreen: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2846
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    iget-object v3, p0, Ll/ܳ۟;->֫:Landroid/view/accessibility/AccessibilityNodeInfo;

    const/16 v4, 0x22

    if-lt v2, v4, :cond_0

    .line 2847
    invoke-static {v3, v1}, Ll/ۧ۟;->֫(Landroid/view/accessibility/AccessibilityNodeInfo;Landroid/graphics/Rect;)V

    goto :goto_0

    .line 2849
    :cond_0
    invoke-virtual {v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    move-result-object v5

    const-string v6, "androidx.view.accessibility.AccessibilityNodeInfoCompat.BOUNDS_IN_WINDOW_KEY"

    invoke-virtual {v5, v6}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v5

    check-cast v5, Landroid/graphics/Rect;

    if-eqz v5, :cond_1

    .line 2851
    iget v6, v5, Landroid/graphics/Rect;->left:I

    iget v7, v5, Landroid/graphics/Rect;->top:I

    iget v8, v5, Landroid/graphics/Rect;->right:I

    iget v5, v5, Landroid/graphics/Rect;->bottom:I

    invoke-virtual {v1, v6, v7, v8, v5}, Landroid/graphics/Rect;->set(IIII)V

    .line 4998
    :cond_1
    :goto_0
    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "; boundsInWindow: "

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "; packageName: "

    .line 5000
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 3378
    invoke-virtual {v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->getPackageName()Ljava/lang/CharSequence;

    move-result-object v1

    .line 5000
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    const-string v1, "; className: "

    .line 5001
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 3402
    invoke-virtual {v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->getClassName()Ljava/lang/CharSequence;

    move-result-object v1

    .line 5001
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    const-string v1, "; text: "

    .line 5002
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ll/ܳ۟;->᩻()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    const-string v1, "; error: "

    .line 5003
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 4042
    invoke-virtual {v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->getError()Ljava/lang/CharSequence;

    move-result-object v1

    .line 5003
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    const-string v1, "; maxTextLength: "

    .line 5004
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 4293
    invoke-virtual {v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->getMaxTextLength()I

    move-result v1

    .line 5004
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "; stateDescription: "

    .line 5005
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x1e

    if-lt v2, v1, :cond_2

    .line 3569
    invoke-static {v3}, Ll/۟ܰ;->֫(Landroid/view/accessibility/AccessibilityNodeInfo;)Ljava/lang/CharSequence;

    move-result-object v1

    goto :goto_1

    .line 3571
    :cond_2
    invoke-virtual {v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    move-result-object v1

    const-string v5, "androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY"

    invoke-virtual {v1, v5}, Landroid/os/Bundle;->getCharSequence(Ljava/lang/String;)Ljava/lang/CharSequence;

    move-result-object v1

    .line 5005
    :goto_1
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    const-string v1, "; contentDescription: "

    .line 5006
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 3558
    invoke-virtual {v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->getContentDescription()Ljava/lang/CharSequence;

    move-result-object v1

    .line 5006
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    const-string v1, "; tooltipText: "

    .line 5007
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x1c

    if-lt v2, v1, :cond_3

    .line 4556
    invoke-virtual {v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->getTooltipText()Ljava/lang/CharSequence;

    move-result-object v1

    goto :goto_2

    .line 4558
    :cond_3
    invoke-virtual {v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    move-result-object v1

    const-string v5, "androidx.view.accessibility.AccessibilityNodeInfoCompat.TOOLTIP_TEXT_KEY"

    invoke-virtual {v1, v5}, Landroid/os/Bundle;->getCharSequence(Ljava/lang/String;)Ljava/lang/CharSequence;

    move-result-object v1

    .line 5007
    :goto_2
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    const-string v1, "; viewIdResName: "

    .line 5008
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 3736
    invoke-virtual {v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->getViewIdResourceName()Ljava/lang/String;

    move-result-object v1

    .line 5008
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "; uniqueId: "

    .line 5009
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x21

    if-lt v2, v1, :cond_4

    .line 3617
    invoke-static {v3}, Ll/֫۟;->ۧ(Landroid/view/accessibility/AccessibilityNodeInfo;)Ljava/lang/String;

    move-result-object v5

    goto :goto_3

    .line 3619
    :cond_4
    invoke-virtual {v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    move-result-object v5

    const-string v6, "androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY"

    invoke-virtual {v5, v6}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 5009
    :goto_3
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "; checkable: "

    .line 5011
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2887
    invoke-virtual {v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->isCheckable()Z

    move-result v5

    .line 5011
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v5, "; checked: "

    .line 5012
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2911
    invoke-virtual {v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->isChecked()Z

    move-result v5

    .line 5012
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v5, "; focusable: "

    .line 5013
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2935
    invoke-virtual {v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->isFocusable()Z

    move-result v5

    .line 5013
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v5, "; focused: "

    .line 5014
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2959
    invoke-virtual {v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->isFocused()Z

    move-result v5

    .line 5014
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v5, "; selected: "

    .line 5015
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 3033
    invoke-virtual {v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->isSelected()Z

    move-result v5

    .line 5015
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v5, "; clickable: "

    .line 5016
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 3057
    invoke-virtual {v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->isClickable()Z

    move-result v5

    .line 5016
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v5, "; longClickable: "

    .line 5017
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 3081
    invoke-virtual {v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->isLongClickable()Z

    move-result v5

    .line 5017
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v5, "; contextClickable: "

    .line 5018
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v5, 0x17

    const/4 v6, 0x0

    if-lt v2, v5, :cond_5

    .line 3959
    invoke-virtual {v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->isContextClickable()Z

    move-result v5

    goto :goto_4

    :cond_5
    const/4 v5, 0x0

    .line 5018
    :goto_4
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v5, "; enabled: "

    .line 5019
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 3105
    invoke-virtual {v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->isEnabled()Z

    move-result v5

    .line 5019
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v5, "; password: "

    .line 5020
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 3129
    invoke-virtual {v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->isPassword()Z

    move-result v5

    .line 5020
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 5021
    new-instance v5, Ljava/lang/StringBuilder;

    const-string v7, "; scrollable: "

    invoke-direct {v5, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 3153
    invoke-virtual {v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->isScrollable()Z

    move-result v7

    .line 5021
    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "; containerTitle: "

    .line 5022
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-lt v2, v4, :cond_6

    .line 3691
    invoke-static {v3}, Ll/ۧ۟;->֫(Landroid/view/accessibility/AccessibilityNodeInfo;)Ljava/lang/CharSequence;

    move-result-object v5

    goto :goto_5

    .line 3693
    :cond_6
    invoke-virtual {v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    move-result-object v5

    const-string v7, "androidx.view.accessibility.AccessibilityNodeInfoCompat.CONTAINER_TITLE_KEY"

    invoke-virtual {v5, v7}, Landroid/os/Bundle;->getCharSequence(Ljava/lang/String;)Ljava/lang/CharSequence;

    move-result-object v5

    .line 5022
    :goto_5
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    const-string v5, "; granularScrollingSupported: "

    .line 5023
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/high16 v5, 0x4000000

    .line 3183
    invoke-direct {p0, v5}, Ll/ܳ۟;->ܿ(I)Z

    move-result v5

    .line 5023
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v5, "; importantForAccessibility: "

    .line 5024
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v5, 0x18

    if-lt v2, v5, :cond_7

    .line 3303
    invoke-virtual {v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->isImportantForAccessibility()Z

    move-result v5

    goto :goto_6

    :cond_7
    const/4 v5, 0x1

    .line 5024
    :goto_6
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v5, "; visible: "

    .line 5025
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2983
    invoke-virtual {v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->isVisibleToUser()Z

    move-result v5

    .line 5025
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v5, "; isTextSelectable: "

    .line 5026
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-lt v2, v1, :cond_8

    .line 3228
    invoke-static {v3}, Ll/֫۟;->ܽ(Landroid/view/accessibility/AccessibilityNodeInfo;)Z

    move-result v1

    goto :goto_7

    :cond_8
    const/high16 v1, 0x800000

    .line 3230
    invoke-direct {p0, v1}, Ll/ܳ۟;->ܿ(I)Z

    move-result v1

    .line 5026
    :goto_7
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, "; accessibilityDataSensitive: "

    .line 5027
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-lt v2, v4, :cond_9

    .line 3334
    invoke-static {v3}, Ll/ۧ۟;->ᩳ(Landroid/view/accessibility/AccessibilityNodeInfo;)Z

    move-result v1

    goto :goto_8

    :cond_9
    const/16 v1, 0x40

    .line 3336
    invoke-direct {p0, v1}, Ll/ܳ۟;->ܿ(I)Z

    move-result v1

    .line 5027
    :goto_8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, "; ["

    .line 5029
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 3912
    invoke-virtual {v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->getActionList()Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_a

    .line 3915
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 3916
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v3

    const/4 v4, 0x0

    :goto_9
    if-ge v4, v3, :cond_b

    .line 3918
    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    .line 3919
    new-instance v5, Ll/ܰܰ;

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v7, v5

    .line 784
    invoke-direct/range {v7 .. v12}, Ll/ܰܰ;-><init>(Ljava/lang/Object;ILjava/lang/CharSequence;Ll/ۚ۟;Ljava/lang/Class;)V

    .line 3919
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x1

    goto :goto_9

    .line 3923
    :cond_a
    sget-object v2, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 5032
    :cond_b
    :goto_a
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v1

    if-ge v6, v1, :cond_e

    .line 5033
    invoke-interface {v2, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܰܰ;

    .line 5034
    invoke-virtual {v1}, Ll/ܰܰ;->֫()I

    move-result v3

    invoke-static {v3}, Ll/ܳ۟;->ᩳ(I)Ljava/lang/String;

    move-result-object v3

    const-string v4, "ACTION_UNKNOWN"

    .line 5035
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_c

    invoke-virtual {v1}, Ll/ܰܰ;->ۧ()Ljava/lang/CharSequence;

    move-result-object v4

    if-eqz v4, :cond_c

    .line 5036
    invoke-virtual {v1}, Ll/ܰܰ;->ۧ()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v3

    .line 5038
    :cond_c
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 5039
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    if-eq v6, v1, :cond_d

    const-string v1, ", "

    .line 5040
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_d
    add-int/lit8 v6, v6, 0x1

    goto :goto_a

    :cond_e
    const-string v1, "]"

    .line 5053
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 5055
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֡()Z
    .locals 1

    .line 3033
    iget-object v0, p0, Ll/ܳ۟;->֫:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->isSelected()Z

    move-result v0

    return v0
.end method

.method public final ֨()Z
    .locals 1

    .line 2983
    iget-object v0, p0, Ll/ܳ۟;->֫:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->isVisibleToUser()Z

    move-result v0

    return v0
.end method

.method public final ֫()I
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 2525
    iget-object v0, p0, Ll/ܳ۟;->֫:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->getActions()I

    move-result v0

    return v0
.end method

.method public final ֫(I)V
    .locals 1

    .line 2540
    iget-object v0, p0, Ll/ܳ۟;->֫:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-virtual {v0, p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->addAction(I)V

    return-void
.end method

.method public final ֫(ILandroid/os/Bundle;)V
    .locals 1

    .line 2632
    iget-object v0, p0, Ll/ܳ۟;->֫:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-virtual {v0, p1, p2}, Landroid/view/accessibility/AccessibilityNodeInfo;->performAction(ILandroid/os/Bundle;)Z

    return-void
.end method

.method public final ֫(ILandroid/view/View;)V
    .locals 1

    .line 2469
    iget-object v0, p0, Ll/ܳ۟;->֫:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-virtual {v0, p2, p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->addChild(Landroid/view/View;I)V

    return-void
.end method

.method public final ֫(Landroid/graphics/Rect;)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 2780
    iget-object v0, p0, Ll/ܳ۟;->֫:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-virtual {v0, p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->getBoundsInParent(Landroid/graphics/Rect;)V

    return-void
.end method

.method public final ֫(Landroid/view/View;)V
    .locals 1

    .line 2451
    iget-object v0, p0, Ll/ܳ۟;->֫:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-virtual {v0, p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->addChild(Landroid/view/View;)V

    return-void
.end method

.method public final ֫(Landroid/view/View;Ljava/lang/CharSequence;)V
    .locals 11

    .line 3463
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-ge v0, v1, :cond_7

    .line 3524
    iget-object v0, p0, Ll/ܳ۟;->֫:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    move-result-object v1

    const-string v2, "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY"

    invoke-virtual {v1, v2}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 3525
    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    move-result-object v1

    const-string v3, "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY"

    invoke-virtual {v1, v3}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 3526
    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    move-result-object v1

    const-string v4, "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY"

    invoke-virtual {v1, v4}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 3527
    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    move-result-object v1

    const-string v5, "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY"

    invoke-virtual {v1, v5}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    const v1, 0x7f0a05ab

    .line 3491
    invoke-virtual {p1, v1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroid/util/SparseArray;

    const/4 v7, 0x0

    if-eqz v6, :cond_2

    .line 3540
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    const/4 v9, 0x0

    .line 3541
    :goto_0
    invoke-virtual {v6}, Landroid/util/SparseArray;->size()I

    move-result v10

    if-ge v9, v10, :cond_1

    .line 3542
    invoke-virtual {v6, v9}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/ref/WeakReference;

    invoke-virtual {v10}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v10

    if-nez v10, :cond_0

    .line 3543
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-virtual {v8, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    add-int/lit8 v9, v9, 0x1

    goto :goto_0

    :cond_1
    const/4 v9, 0x0

    .line 3546
    :goto_1
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    move-result v10

    if-ge v9, v10, :cond_2

    .line 3547
    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/Integer;

    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    move-result v10

    invoke-virtual {v6, v10}, Landroid/util/SparseArray;->remove(I)V

    add-int/lit8 v9, v9, 0x1

    goto :goto_1

    .line 3499
    :cond_2
    instance-of v6, p2, Landroid/text/Spanned;

    if-eqz v6, :cond_3

    .line 3500
    move-object v6, p2

    check-cast v6, Landroid/text/Spanned;

    .line 3501
    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result v8

    const-class v9, Landroid/text/style/ClickableSpan;

    invoke-interface {v6, v7, v8, v9}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object v6

    check-cast v6, [Landroid/text/style/ClickableSpan;

    goto :goto_2

    :cond_3
    const/4 v6, 0x0

    :goto_2
    if-eqz v6, :cond_7

    .line 3467
    array-length v7, v6

    if-lez v7, :cond_7

    .line 4193
    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    const-string v7, "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY"

    const v8, 0x7f0a0012

    .line 3468
    invoke-virtual {v0, v7, v8}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 3491
    invoke-virtual {p1, v1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/util/SparseArray;

    if-nez v0, :cond_4

    .line 3483
    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    .line 3484
    invoke-virtual {p1, v1, v0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    :cond_4
    const/4 p1, 0x0

    .line 3471
    :goto_3
    array-length v1, v6

    if-ge p1, v1, :cond_7

    .line 3472
    aget-object v1, v6, p1

    const/4 v7, 0x0

    .line 3509
    :goto_4
    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    move-result v8

    if-ge v7, v8, :cond_6

    .line 3510
    invoke-virtual {v0, v7}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/ref/WeakReference;

    invoke-virtual {v8}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Landroid/text/style/ClickableSpan;

    .line 3511
    invoke-virtual {v1, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_5

    .line 3512
    invoke-virtual {v0, v7}, Landroid/util/SparseArray;->keyAt(I)I

    move-result v1

    goto :goto_5

    :cond_5
    add-int/lit8 v7, v7, 0x1

    goto :goto_4

    .line 3516
    :cond_6
    sget v1, Ll/ܳ۟;->ܽ:I

    add-int/lit8 v7, v1, 0x1

    sput v7, Ll/ܳ۟;->ܽ:I

    .line 3473
    :goto_5
    new-instance v7, Ljava/lang/ref/WeakReference;

    aget-object v8, v6, p1

    invoke-direct {v7, v8}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v0, v1, v7}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 3474
    aget-object v7, v6, p1

    move-object v8, p2

    check-cast v8, Landroid/text/Spanned;

    .line 3531
    invoke-direct {p0, v2}, Ll/ܳ۟;->ܽ(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v9

    invoke-interface {v8, v7}, Landroid/text/Spanned;->getSpanStart(Ljava/lang/Object;)I

    move-result v10

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-interface {v9, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 3532
    invoke-direct {p0, v3}, Ll/ܳ۟;->ܽ(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v9

    invoke-interface {v8, v7}, Landroid/text/Spanned;->getSpanEnd(Ljava/lang/Object;)I

    move-result v10

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-interface {v9, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 3533
    invoke-direct {p0, v4}, Ll/ܳ۟;->ܽ(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v9

    invoke-interface {v8, v7}, Landroid/text/Spanned;->getSpanFlags(Ljava/lang/Object;)I

    move-result v7

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v9, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 3534
    invoke-direct {p0, v5}, Ll/ܳ۟;->ܽ(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v7

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v7, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 p1, p1, 0x1

    goto :goto_3

    :cond_7
    return-void
.end method

.method public final ֫(Ljava/lang/CharSequence;)V
    .locals 1

    .line 3417
    iget-object v0, p0, Ll/ܳ۟;->֫:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-virtual {v0, p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setClassName(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final ֫(Ljava/lang/String;)V
    .locals 3

    .line 4009
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    iget-object v2, p0, Ll/ܳ۟;->֫:Landroid/view/accessibility/AccessibilityNodeInfo;

    if-lt v0, v1, :cond_0

    .line 4010
    invoke-virtual {v2, p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setHintText(Ljava/lang/CharSequence;)V

    return-void

    .line 4012
    :cond_0
    invoke-virtual {v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY"

    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final ֫(Ll/ܰܰ;)V
    .locals 1

    .line 2571
    iget-object p1, p1, Ll/ܰܰ;->֫:Ljava/lang/Object;

    check-cast p1, Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;

    iget-object v0, p0, Ll/ܳ۟;->֫:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-virtual {v0, p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->addAction(Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;)V

    return-void
.end method

.method public final ֫(Ll/ܽ۟;)V
    .locals 1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    .line 3829
    :cond_0
    iget-object p1, p1, Ll/ܽ۟;->֫:Ljava/lang/Object;

    check-cast p1, Landroid/view/accessibility/AccessibilityNodeInfo$CollectionInfo;

    .line 3828
    :goto_0
    iget-object v0, p0, Ll/ܳ۟;->֫:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-virtual {v0, p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setCollectionInfo(Landroid/view/accessibility/AccessibilityNodeInfo$CollectionInfo;)V

    return-void
.end method

.method public final ֫(Ll/ܿ۟;)V
    .locals 1

    .line 3878
    iget-object p1, p1, Ll/ܿ۟;->֫:Ljava/lang/Object;

    check-cast p1, Landroid/view/accessibility/AccessibilityNodeInfo$RangeInfo;

    iget-object v0, p0, Ll/ܳ۟;->֫:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-virtual {v0, p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setRangeInfo(Landroid/view/accessibility/AccessibilityNodeInfo$RangeInfo;)V

    return-void
.end method

.method public final ֫(Ll/ᩳ۟;)V
    .locals 1

    .line 3836
    iget-object p1, p1, Ll/ᩳ۟;->֫:Ljava/lang/Object;

    check-cast p1, Landroid/view/accessibility/AccessibilityNodeInfo$CollectionItemInfo;

    .line 3835
    iget-object v0, p0, Ll/ܳ۟;->֫:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-virtual {v0, p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setCollectionItemInfo(Landroid/view/accessibility/AccessibilityNodeInfo$CollectionItemInfo;)V

    return-void
.end method

.method public final ֫(Z)V
    .locals 1

    .line 3024
    iget-object v0, p0, Ll/ܳ۟;->֫:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-virtual {v0, p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setAccessibilityFocused(Z)V

    return-void
.end method

.method public final ۖ(Z)V
    .locals 1

    .line 3048
    iget-object v0, p0, Ll/ܳ۟;->֫:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-virtual {v0, p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setSelected(Z)V

    return-void
.end method

.method public final ۖ()Z
    .locals 1

    .line 2959
    iget-object v0, p0, Ll/ܳ۟;->֫:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->isFocused()Z

    move-result v0

    return v0
.end method

.method public final ۘ(Z)V
    .locals 2

    .line 4682
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-lt v0, v1, :cond_0

    .line 4683
    iget-object v0, p0, Ll/ܳ۟;->֫:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-virtual {v0, p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setShowingHintText(Z)V

    return-void

    :cond_0
    const/4 v0, 0x4

    .line 4685
    invoke-direct {p0, v0, p1}, Ll/ܳ۟;->֫(IZ)V

    return-void
.end method

.method public final ۘ()Z
    .locals 1

    .line 3081
    iget-object v0, p0, Ll/ܳ۟;->֫:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->isLongClickable()Z

    move-result v0

    return v0
.end method

.method public final ۚ()Z
    .locals 2

    .line 4662
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-lt v0, v1, :cond_0

    .line 4663
    iget-object v0, p0, Ll/ܳ۟;->֫:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->isShowingHintText()Z

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x4

    .line 4665
    invoke-direct {p0, v0}, Ll/ܳ۟;->ܿ(I)Z

    move-result v0

    return v0
.end method

.method public final ۜ(Z)V
    .locals 1

    .line 2974
    iget-object v0, p0, Ll/ܳ۟;->֫:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-virtual {v0, p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setFocused(Z)V

    return-void
.end method

.method public final ۜ()Z
    .locals 1

    .line 3008
    iget-object v0, p0, Ll/ܳ۟;->֫:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->isAccessibilityFocused()Z

    move-result v0

    return v0
.end method

.method public final ۠()V
    .locals 2

    const/4 v0, 0x1

    .line 4149
    iget-object v1, p0, Ll/ܳ۟;->֫:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-virtual {v1, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->setCanOpenPopup(Z)V

    return-void
.end method

.method public final ۡ(Z)V
    .locals 2

    .line 4647
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-lt v0, v1, :cond_0

    .line 4648
    iget-object v0, p0, Ll/ܳ۟;->֫:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-virtual {v0, p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setScreenReaderFocusable(Z)V

    return-void

    :cond_0
    const/4 v0, 0x1

    .line 4650
    invoke-direct {p0, v0, p1}, Ll/ܳ۟;->֫(IZ)V

    return-void
.end method

.method public final ۡ()Z
    .locals 1

    .line 3105
    iget-object v0, p0, Ll/ܳ۟;->֫:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->isEnabled()Z

    move-result v0

    return v0
.end method

.method public final ۢ(Z)V
    .locals 1

    .line 3096
    iget-object v0, p0, Ll/ܳ۟;->֫:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-virtual {v0, p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setLongClickable(Z)V

    return-void
.end method

.method public final ۢ()Z
    .locals 1

    .line 3057
    iget-object v0, p0, Ll/ܳ۟;->֫:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->isClickable()Z

    move-result v0

    return v0
.end method

.method public final ۧ()I
    .locals 1

    .line 2404
    iget-object v0, p0, Ll/ܳ۟;->֫:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->getChildCount()I

    move-result v0

    return v0
.end method

.method public final ۧ(I)V
    .locals 1

    .line 4281
    iget-object v0, p0, Ll/ܳ۟;->֫:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-virtual {v0, p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setMaxTextLength(I)V

    return-void
.end method

.method public final ۧ(ILandroid/view/View;)V
    .locals 1

    .line 2351
    iput p1, p0, Ll/ܳ۟;->ۧ:I

    .line 2353
    iget-object v0, p0, Ll/ܳ۟;->֫:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-virtual {v0, p2, p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setSource(Landroid/view/View;I)V

    return-void
.end method

.method public final ۧ(Landroid/graphics/Rect;)V
    .locals 1

    .line 2812
    iget-object v0, p0, Ll/ܳ۟;->֫:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-virtual {v0, p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->getBoundsInScreen(Landroid/graphics/Rect;)V

    return-void
.end method

.method public final ۧ(Landroid/view/View;)V
    .locals 1

    .line 4055
    iget-object v0, p0, Ll/ܳ۟;->֫:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-virtual {v0, p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setLabelFor(Landroid/view/View;)V

    return-void
.end method

.method public final ۧ(Ljava/lang/CharSequence;)V
    .locals 1

    .line 3587
    iget-object v0, p0, Ll/ܳ۟;->֫:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-virtual {v0, p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setContentDescription(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final ۧ(Ljava/lang/String;)V
    .locals 2

    .line 4844
    iget-object v0, p0, Ll/ܳ۟;->֫:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "AccessibilityNodeInfo.roleDescription"

    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final ۧ(Ll/ܰܰ;)V
    .locals 1

    .line 2596
    iget-object p1, p1, Ll/ܰܰ;->֫:Ljava/lang/Object;

    check-cast p1, Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;

    iget-object v0, p0, Ll/ܳ۟;->֫:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-virtual {v0, p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->removeAction(Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;)Z

    return-void
.end method

.method public final ۧ(Z)V
    .locals 1

    .line 2902
    iget-object v0, p0, Ll/ܳ۟;->֫:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-virtual {v0, p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setCheckable(Z)V

    return-void
.end method

.method public final ܳ()Ljava/lang/CharSequence;
    .locals 1

    .line 3378
    iget-object v0, p0, Ll/ܳ۟;->֫:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->getPackageName()Ljava/lang/CharSequence;

    move-result-object v0

    return-object v0
.end method

.method public final ܳ(Ljava/lang/CharSequence;)V
    .locals 3

    .line 3602
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    iget-object v2, p0, Ll/ܳ۟;->֫:Landroid/view/accessibility/AccessibilityNodeInfo;

    if-lt v0, v1, :cond_0

    .line 3603
    invoke-static {v2, p1}, Ll/۟ܰ;->֫(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/CharSequence;)V

    return-void

    .line 3605
    :cond_0
    invoke-virtual {v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY"

    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final ܳ(Z)V
    .locals 1

    .line 3120
    iget-object v0, p0, Ll/ܳ۟;->֫:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-virtual {v0, p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setEnabled(Z)V

    return-void
.end method

.method public final ܶ()Landroid/view/accessibility/AccessibilityNodeInfo;
    .locals 1

    .line 2259
    iget-object v0, p0, Ll/ܳ۟;->֫:Landroid/view/accessibility/AccessibilityNodeInfo;

    return-object v0
.end method

.method public final ܺ(Z)V
    .locals 1

    .line 3168
    iget-object v0, p0, Ll/ܳ۟;->֫:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-virtual {v0, p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setScrollable(Z)V

    return-void
.end method

.method public final ܺ()Z
    .locals 1

    .line 2935
    iget-object v0, p0, Ll/ܳ۟;->֫:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->isFocusable()Z

    move-result v0

    return v0
.end method

.method public final ܽ()Ljava/lang/CharSequence;
    .locals 1

    .line 3402
    iget-object v0, p0, Ll/ܳ۟;->֫:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->getClassName()Ljava/lang/CharSequence;

    move-result-object v0

    return-object v0
.end method

.method public final ܽ(I)V
    .locals 1

    .line 2648
    iget-object v0, p0, Ll/ܳ۟;->֫:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-virtual {v0, p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setMovementGranularities(I)V

    return-void
.end method

.method public final ܽ(Landroid/graphics/Rect;)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 2803
    iget-object v0, p0, Ll/ܳ۟;->֫:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-virtual {v0, p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setBoundsInParent(Landroid/graphics/Rect;)V

    return-void
.end method

.method public final ܽ(Landroid/view/View;)V
    .locals 1

    .line 2737
    iget-object v0, p0, Ll/ܳ۟;->֫:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-virtual {v0, p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setParent(Landroid/view/View;)V

    return-void
.end method

.method public final ܽ(Ljava/lang/CharSequence;)V
    .locals 1

    .line 4031
    iget-object v0, p0, Ll/ܳ۟;->֫:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-virtual {v0, p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setError(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final ܽ(Z)V
    .locals 1

    .line 2926
    iget-object v0, p0, Ll/ܳ۟;->֫:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-virtual {v0, p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setChecked(Z)V

    return-void
.end method

.method public final ܿ()I
    .locals 1

    .line 2657
    iget-object v0, p0, Ll/ܳ۟;->֫:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->getMovementGranularities()I

    move-result v0

    return v0
.end method

.method public final ܿ(Landroid/view/View;)V
    .locals 2

    .line 4431
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x16

    if-lt v0, v1, :cond_0

    .line 4432
    iget-object v0, p0, Ll/ܳ۟;->֫:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-virtual {v0, p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setTraversalAfter(Landroid/view/View;)V

    :cond_0
    return-void
.end method

.method public final ܿ(Ljava/lang/CharSequence;)V
    .locals 3

    .line 4596
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    iget-object v2, p0, Ll/ܳ۟;->֫:Landroid/view/accessibility/AccessibilityNodeInfo;

    if-lt v0, v1, :cond_0

    .line 4597
    invoke-virtual {v2, p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setPaneTitle(Ljava/lang/CharSequence;)V

    return-void

    .line 4599
    :cond_0
    invoke-virtual {v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY"

    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final ܿ(Z)V
    .locals 1

    .line 4497
    iget-object v0, p0, Ll/ܳ۟;->֫:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-virtual {v0, p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setDismissable(Z)V

    return-void
.end method

.method public final ᩳ()Ljava/lang/CharSequence;
    .locals 1

    .line 3558
    iget-object v0, p0, Ll/ܳ۟;->֫:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->getContentDescription()Ljava/lang/CharSequence;

    move-result-object v0

    return-object v0
.end method

.method public final ᩳ(Landroid/graphics/Rect;)V
    .locals 1

    .line 2827
    iget-object v0, p0, Ll/ܳ۟;->֫:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-virtual {v0, p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setBoundsInScreen(Landroid/graphics/Rect;)V

    return-void
.end method

.method public final ᩳ(Landroid/view/View;)V
    .locals 1

    const/4 v0, -0x1

    .line 2324
    iput v0, p0, Ll/ܳ۟;->ۧ:I

    .line 2326
    iget-object v0, p0, Ll/ܳ۟;->֫:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-virtual {v0, p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setSource(Landroid/view/View;)V

    return-void
.end method

.method public final ᩳ(Ljava/lang/CharSequence;)V
    .locals 1

    .line 3393
    iget-object v0, p0, Ll/ܳ۟;->֫:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-virtual {v0, p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setPackageName(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final ᩳ(Z)V
    .locals 1

    .line 3072
    iget-object v0, p0, Ll/ܳ۟;->֫:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-virtual {v0, p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setClickable(Z)V

    return-void
.end method

.method public final ᩴ(Z)V
    .locals 1

    .line 2999
    iget-object v0, p0, Ll/ܳ۟;->֫:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-virtual {v0, p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setVisibleToUser(Z)V

    return-void
.end method

.method public final ᩴ()Z
    .locals 1

    .line 3129
    iget-object v0, p0, Ll/ܳ۟;->֫:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->isPassword()Z

    move-result v0

    return v0
.end method

.method public final ᩵()Z
    .locals 1

    .line 3153
    iget-object v0, p0, Ll/ܳ۟;->֫:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->isScrollable()Z

    move-result v0

    return v0
.end method

.method public final ᩷(Z)V
    .locals 2

    .line 4719
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-lt v0, v1, :cond_0

    .line 4720
    iget-object v0, p0, Ll/ܳ۟;->֫:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-virtual {v0, p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setHeading(Z)V

    return-void

    :cond_0
    const/4 v0, 0x2

    .line 4722
    invoke-direct {p0, v0, p1}, Ll/ܳ۟;->֫(IZ)V

    return-void
.end method

.method public final ᩷()Z
    .locals 1

    .line 2911
    iget-object v0, p0, Ll/ܳ۟;->֫:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->isChecked()Z

    move-result v0

    return v0
.end method

.method public final ᩻()Ljava/lang/CharSequence;
    .locals 11

    const-string v0, "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY"

    .line 3520
    invoke-direct {p0, v0}, Ll/ܳ۟;->ܽ(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    .line 3426
    iget-object v2, p0, Ll/ܳ۟;->֫:Landroid/view/accessibility/AccessibilityNodeInfo;

    if-nez v1, :cond_1

    .line 3427
    invoke-direct {p0, v0}, Ll/ܳ۟;->ܽ(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v0

    const-string v1, "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY"

    .line 3428
    invoke-direct {p0, v1}, Ll/ܳ۟;->ܽ(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v1

    const-string v3, "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY"

    .line 3429
    invoke-direct {p0, v3}, Ll/ܳ۟;->ܽ(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v3

    const-string v4, "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY"

    .line 3430
    invoke-direct {p0, v4}, Ll/ܳ۟;->ܽ(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v4

    .line 3431
    new-instance v5, Landroid/text/SpannableString;

    invoke-virtual {v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->getText()Ljava/lang/CharSequence;

    move-result-object v6

    .line 3432
    invoke-virtual {v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->getText()Ljava/lang/CharSequence;

    move-result-object v7

    invoke-interface {v7}, Ljava/lang/CharSequence;->length()I

    move-result v7

    const/4 v8, 0x0

    .line 3431
    invoke-static {v6, v8, v7}, Landroid/text/TextUtils;->substring(Ljava/lang/CharSequence;II)Ljava/lang/String;

    move-result-object v6

    invoke-direct {v5, v6}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 3433
    :goto_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v6

    if-ge v8, v6, :cond_0

    .line 3434
    new-instance v6, Ll/ۤܰ;

    invoke-interface {v4, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Integer;

    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v7

    .line 4193
    invoke-virtual {v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    move-result-object v9

    const-string v10, "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY"

    .line 3435
    invoke-virtual {v9, v10}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result v9

    invoke-direct {v6, v7, p0, v9}, Ll/ۤܰ;-><init>(ILl/ܳ۟;I)V

    .line 3436
    invoke-interface {v0, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Integer;

    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v7

    invoke-interface {v1, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/Integer;

    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    move-result v9

    invoke-interface {v3, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/Integer;

    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    move-result v10

    .line 3434
    invoke-virtual {v5, v6, v7, v9, v10}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    :cond_0
    return-object v5

    .line 3440
    :cond_1
    invoke-virtual {v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    return-object v0
.end method

.method public final ᩻(Ljava/lang/CharSequence;)V
    .locals 1

    .line 3456
    iget-object v0, p0, Ll/ܳ۟;->֫:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-virtual {v0, p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final ᩻(Z)V
    .locals 1

    .line 2950
    iget-object v0, p0, Ll/ܳ۟;->֫:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-virtual {v0, p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setFocusable(Z)V

    return-void
.end method
