.class public final synthetic Ll/ۧۡۢ;
.super Ljava/lang/Object;
.source "31PG"

# interfaces
.implements Landroid/widget/CompoundButton$OnCheckedChangeListener;


# instance fields
.field public final synthetic ᩶:Landroid/widget/CheckBox;

.field public final synthetic ᩸:Ll/֡ۚۢ;

.field public final synthetic ᩹:Landroid/widget/CheckBox;


# direct methods
.method public synthetic constructor <init>(Ll/֡ۚۢ;Landroid/widget/CheckBox;Landroid/widget/CheckBox;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۧۡۢ;->᩸:Ll/֡ۚۢ;

    iput-object p2, p0, Ll/ۧۡۢ;->᩹:Landroid/widget/CheckBox;

    iput-object p3, p0, Ll/ۧۡۢ;->᩶:Landroid/widget/CheckBox;

    return-void
.end method


# virtual methods
.method public final onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .locals 0

    .line 474
    iget-object p1, p0, Ll/ۧۡۢ;->᩸:Ll/֡ۚۢ;

    invoke-virtual {p1}, Ll/֡ۚۢ;->ܿ()Landroid/widget/Button;

    move-result-object p1

    iget-object p2, p0, Ll/ۧۡۢ;->᩹:Landroid/widget/CheckBox;

    invoke-virtual {p2}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result p2

    if-nez p2, :cond_1

    .line 475
    iget-object p2, p0, Ll/ۧۡۢ;->᩶:Landroid/widget/CheckBox;

    invoke-virtual {p2}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result p2

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p2, 0x1

    .line 474
    :goto_1
    invoke-virtual {p1, p2}, Landroid/view/View;->setEnabled(Z)V

    return-void
.end method
