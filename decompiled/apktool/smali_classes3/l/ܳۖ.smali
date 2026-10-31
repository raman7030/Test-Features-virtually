.class public final Ll/ܳۖ;
.super Landroid/database/DataSetObserver;
.source "25PA"


# instance fields
.field public final synthetic ֫:Ll/ۢۖ;


# direct methods
.method public constructor <init>(Ll/ۢۖ;)V
    .locals 0

    .line 1341
    iput-object p1, p0, Ll/ܳۖ;->֫:Ll/ۢۖ;

    invoke-direct {p0}, Landroid/database/DataSetObserver;-><init>()V

    return-void
.end method


# virtual methods
.method public final onChanged()V
    .locals 2

    .line 859
    iget-object v0, p0, Ll/ܳۖ;->֫:Ll/ۢۖ;

    iget-object v1, v0, Ll/ۢۖ;->᩷֫:Landroid/widget/PopupWindow;

    invoke-virtual {v1}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 1348
    invoke-virtual {v0}, Ll/ۢۖ;->show()V

    :cond_0
    return-void
.end method

.method public final onInvalidated()V
    .locals 1

    .line 1354
    iget-object v0, p0, Ll/ܳۖ;->֫:Ll/ۢۖ;

    invoke-virtual {v0}, Ll/ۢۖ;->dismiss()V

    return-void
.end method
