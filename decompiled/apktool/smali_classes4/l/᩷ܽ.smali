.class public final Ll/᩷ܽ;
.super Ljava/lang/Object;
.source "38CF"


# static fields
.field public static final ֫:I

.field public static final ۧ:I

.field public static ܽ:Ll/ۢܽ;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const/16 v0, 0xe6

    const/16 v1, 0xff

    .line 38
    invoke-static {v0, v1, v1, v1}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    sput v0, Ll/᩷ܽ;->ۧ:I

    const/16 v0, 0x80

    const/16 v1, 0x1b

    .line 44
    invoke-static {v0, v1, v1, v1}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    sput v0, Ll/᩷ܽ;->֫:I

    return-void
.end method

.method public static final ֫(Ll/ۗܺ᩷;)V
    .locals 8

    .line 134
    new-instance v1, Ll/֫ᩳ;

    const/4 v0, 0x0

    sget-object v2, Ll/ܰܽ;->᩹:Ll/ܰܽ;

    invoke-direct {v1, v0, v0, v2}, Ll/֫ᩳ;-><init>(IILl/ܺ᩹᩵;)V

    new-instance v3, Ll/֫ᩳ;

    sget v0, Ll/᩷ܽ;->ۧ:I

    sget v4, Ll/᩷ܽ;->֫:I

    invoke-direct {v3, v0, v4, v2}, Ll/֫ᩳ;-><init>(IILl/ܺ᩹᩵;)V

    .line 75
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v4

    const-string v0, "window.decorView"

    invoke-static {v4, v0}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 76
    invoke-virtual {v1}, Ll/֫ᩳ;->ۧ()Ll/ܺ᩹᩵;

    move-result-object v0

    invoke-virtual {v4}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const-string v5, "view.resources"

    invoke-static {v2, v5}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0, v2}, Ll/ܺ᩹᩵;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v6

    .line 77
    invoke-virtual {v3}, Ll/֫ᩳ;->ۧ()Ll/ܺ᩹᩵;

    move-result-object v0

    invoke-virtual {v4}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-static {v2, v5}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0, v2}, Ll/ܺ᩹᩵;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v7

    .line 78
    sget-object v0, Ll/᩷ܽ;->ܽ:Ll/ۢܽ;

    if-nez v0, :cond_3

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1d

    if-lt v0, v2, :cond_0

    .line 79
    new-instance v0, Ll/ۖܽ;

    .line 276
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    goto :goto_0

    :cond_0
    const/16 v2, 0x1a

    if-lt v0, v2, :cond_1

    .line 81
    new-instance v0, Ll/ܺܽ;

    .line 254
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    goto :goto_0

    :cond_1
    const/16 v2, 0x17

    if-lt v0, v2, :cond_2

    .line 83
    new-instance v0, Ll/ۡܽ;

    .line 235
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    goto :goto_0

    .line 85
    :cond_2
    new-instance v0, Ll/ۢܽ;

    .line 216
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 88
    sput-object v0, Ll/᩷ܽ;->ܽ:Ll/ۢܽ;

    .line 90
    :cond_3
    :goto_0
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p0

    const-string v2, "window"

    invoke-static {p0, v2}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v2, v3

    move-object v3, p0

    move v5, v6

    move v6, v7

    .line 89
    invoke-interface/range {v0 .. v6}, Ll/ۘܽ;->֫(Ll/֫ᩳ;Ll/֫ᩳ;Landroid/view/Window;Landroid/view/View;ZZ)V

    return-void
.end method
