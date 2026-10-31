.class public final synthetic Ll/᩻۟ܳ;
.super Ljava/lang/Object;
.source "B29A"

# interfaces
.implements Landroid/view/View$OnLongClickListener;


# instance fields
.field public final synthetic ᩸:Ll/۬ۗܿ;


# direct methods
.method public synthetic constructor <init>(Ll/۬ۗܿ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩻۟ܳ;->᩸:Ll/۬ۗܿ;

    return-void
.end method


# virtual methods
.method public final onLongClick(Landroid/view/View;)Z
    .locals 3

    .line 335
    invoke-static {}, Ll/ۙ᩸᩷;->ܳ()Ljava/lang/String;

    move-result-object p1

    .line 336
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    .line 337
    iget-object v0, p0, Ll/᩻۟ܳ;->᩸:Ll/۬ۗܿ;

    invoke-virtual {v0}, Ll/۬ۗܿ;->ܳ()Ll/۟᩺ᩳ;

    move-result-object v0

    .line 338
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v2

    invoke-interface {v0, v1, v2, p1}, Landroid/text/Editable;->replace(IILjava/lang/CharSequence;)Landroid/text/Editable;

    .line 339
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    invoke-static {v0, p1}, Landroid/text/Selection;->setSelection(Landroid/text/Spannable;I)V

    const/4 p1, 0x1

    return p1

    :cond_0
    const p1, 0x7f120a7f

    .line 342
    invoke-static {p1}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;

    return v1
.end method
