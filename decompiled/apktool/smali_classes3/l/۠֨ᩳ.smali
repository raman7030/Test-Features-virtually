.class public final synthetic Ll/۠֨ᩳ;
.super Ljava/lang/Object;
.source "3B3L"

# interfaces
.implements Landroid/view/View$OnLongClickListener;


# instance fields
.field public final synthetic ᩸:Landroid/widget/TextView;


# direct methods
.method public synthetic constructor <init>(Landroid/widget/TextView;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۠֨ᩳ;->᩸:Landroid/widget/TextView;

    return-void
.end method


# virtual methods
.method public final onLongClick(Landroid/view/View;)Z
    .locals 0

    .line 2
    iget-object p1, p0, Ll/۠֨ᩳ;->᩸:Landroid/widget/TextView;

    .line 271
    invoke-virtual {p1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ll/ۙ᩸᩷;->֫(Ljava/lang/CharSequence;)V

    const/4 p1, 0x1

    return p1
.end method
