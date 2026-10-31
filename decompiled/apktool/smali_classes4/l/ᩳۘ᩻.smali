.class public final synthetic Ll/ᩳۘ᩻;
.super Ljava/lang/Object;
.source "27JL"

# interfaces
.implements Landroid/widget/CompoundButton$OnCheckedChangeListener;


# instance fields
.field public final synthetic ᩸:Landroid/view/View;

.field public final synthetic ᩹:Landroid/view/View;


# direct methods
.method public synthetic constructor <init>(Landroid/view/View;Landroid/view/View;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ᩳۘ᩻;->᩸:Landroid/view/View;

    iput-object p2, p0, Ll/ᩳۘ᩻;->᩹:Landroid/view/View;

    return-void
.end method


# virtual methods
.method public final onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .locals 3

    .line 217
    iget-object p1, p0, Ll/ᩳۘ᩻;->᩸:Landroid/view/View;

    iget-object v0, p0, Ll/ᩳۘ᩻;->᩹:Landroid/view/View;

    const/16 v1, 0x8

    const/4 v2, 0x0

    if-eqz p2, :cond_0

    .line 218
    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 219
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    return-void

    .line 221
    :cond_0
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 222
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method
