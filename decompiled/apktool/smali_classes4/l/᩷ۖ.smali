.class public final Ll/᩷ۖ;
.super Ljava/lang/Object;
.source "25PA"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩸:Ll/ۢۖ;


# direct methods
.method public constructor <init>(Ll/ۢۖ;)V
    .locals 0

    .line 1369
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩷ۖ;->᩸:Ll/ۢۖ;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1374
    iget-object v0, p0, Ll/᩷ۖ;->᩸:Ll/ۢۖ;

    iget-object v1, v0, Ll/ۢۖ;->۫:Ll/۫ܺ;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroid/view/View;->isAttachedToWindow()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, v0, Ll/ۢۖ;->۫:Ll/۫ܺ;

    .line 1375
    invoke-virtual {v1}, Landroid/widget/AdapterView;->getCount()I

    move-result v1

    iget-object v2, v0, Ll/ۢۖ;->۫:Ll/۫ܺ;

    invoke-virtual {v2}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v2

    if-le v1, v2, :cond_0

    iget-object v1, v0, Ll/ۢۖ;->۫:Ll/۫ܺ;

    .line 1376
    invoke-virtual {v1}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    iget v2, v0, Ll/ۢۖ;->ᩳ֫:I

    if-gt v1, v2, :cond_0

    .line 1377
    iget-object v1, v0, Ll/ۢۖ;->᩷֫:Landroid/widget/PopupWindow;

    const/4 v2, 0x2

    invoke-virtual {v1, v2}, Landroid/widget/PopupWindow;->setInputMethodMode(I)V

    .line 1378
    invoke-virtual {v0}, Ll/ۢۖ;->show()V

    :cond_0
    return-void
.end method
