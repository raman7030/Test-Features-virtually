.class public final synthetic Ll/ܰۢ᩷;
.super Ljava/lang/Object;
.source "R7YU"

# interfaces
.implements Landroid/widget/CompoundButton$OnCheckedChangeListener;


# instance fields
.field public final synthetic ᩸:[Landroid/widget/CheckBox;

.field public final synthetic ᩹:Landroid/widget/Button;


# direct methods
.method public synthetic constructor <init>([Landroid/widget/CheckBox;Landroid/widget/Button;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܰۢ᩷;->᩸:[Landroid/widget/CheckBox;

    iput-object p2, p0, Ll/ܰۢ᩷;->᩹:Landroid/widget/Button;

    return-void
.end method


# virtual methods
.method public final onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .locals 3

    .line 83
    iget-object p1, p0, Ll/ܰۢ᩷;->᩸:[Landroid/widget/CheckBox;

    array-length p2, p1

    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, p2, :cond_1

    aget-object v2, p1, v1

    .line 84
    invoke-virtual {v2}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x1

    .line 89
    :goto_1
    iget-object p1, p0, Ll/ܰۢ᩷;->᩹:Landroid/widget/Button;

    invoke-virtual {p1, v0}, Landroid/view/View;->setEnabled(Z)V

    return-void
.end method
