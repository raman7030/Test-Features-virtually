.class public final Ll/ۡۘ;
.super Ljava/lang/Object;
.source "N5JQ"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ᩸:Ll/᩹ۘ;


# direct methods
.method public constructor <init>(Ll/᩹ۘ;)V
    .locals 0

    .line 992
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۡۘ;->᩸:Ll/᩹ۘ;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .line 995
    iget-object v0, p0, Ll/ۡۘ;->᩸:Ll/᩹ۘ;

    iget-object v1, v0, Ll/᩹ۘ;->֫֫:Landroid/widget/ImageView;

    if-ne p1, v1, :cond_0

    .line 996
    invoke-virtual {v0}, Ll/᩹ۘ;->ܿ()V

    return-void

    .line 997
    :cond_0
    iget-object v1, v0, Ll/᩹ۘ;->᩹:Landroid/widget/ImageView;

    if-ne p1, v1, :cond_1

    .line 998
    invoke-virtual {v0}, Ll/᩹ۘ;->ᩳ()V

    return-void

    .line 999
    :cond_1
    iget-object v1, v0, Ll/᩹ۘ;->ۤ:Landroid/widget/ImageView;

    if-ne p1, v1, :cond_2

    .line 1000
    invoke-virtual {v0}, Ll/᩹ۘ;->ܳ()V

    return-void

    .line 1001
    :cond_2
    iget-object v1, v0, Ll/᩹ۘ;->ۘ֫:Landroid/widget/ImageView;

    if-ne p1, v1, :cond_3

    goto :goto_0

    .line 1003
    :cond_3
    iget-object v0, v0, Ll/᩹ۘ;->ܿ֫:Ll/ܶۘ;

    if-ne p1, v0, :cond_5

    .line 1713
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-lt p1, v1, :cond_4

    .line 1714
    invoke-static {v0}, Ll/᩵ۘ;->֫(Landroid/widget/AutoCompleteTextView;)V

    return-void

    .line 1716
    :cond_4
    sget-object p1, Ll/᩹ۘ;->ᩴ֫:Ll/֡ۘ;

    invoke-virtual {p1, v0}, Ll/֡ۘ;->ۧ(Landroid/widget/AutoCompleteTextView;)V

    .line 1717
    invoke-virtual {p1, v0}, Ll/֡ۘ;->֫(Landroid/widget/AutoCompleteTextView;)V

    :cond_5
    :goto_0
    return-void
.end method
