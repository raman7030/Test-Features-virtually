.class public final synthetic Ll/ܶۤܳ;
.super Ljava/lang/Object;
.source "9AJ5"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ᩶:Landroid/widget/CheckBox;

.field public final synthetic ᩸:[Landroid/widget/RadioButton;

.field public final synthetic ᩹:Z


# direct methods
.method public synthetic constructor <init>([Landroid/widget/RadioButton;ZLandroid/widget/CheckBox;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܶۤܳ;->᩸:[Landroid/widget/RadioButton;

    iput-boolean p2, p0, Ll/ܶۤܳ;->᩹:Z

    iput-object p3, p0, Ll/ܶۤܳ;->᩶:Landroid/widget/CheckBox;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 6

    .line 105
    iget-object v0, p0, Ll/ܶۤܳ;->᩸:[Landroid/widget/RadioButton;

    array-length v1, v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_1

    aget-object v4, v0, v3

    if-ne v4, p1, :cond_0

    const/4 v5, 0x1

    goto :goto_1

    :cond_0
    const/4 v5, 0x0

    .line 106
    :goto_1
    invoke-virtual {v4, v5}, Landroid/widget/CompoundButton;->setChecked(Z)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 108
    :cond_1
    iget-boolean v0, p0, Ll/ܶۤܳ;->᩹:Z

    if-eqz v0, :cond_3

    .line 109
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    const v0, 0x7f0a0479

    if-ne p1, v0, :cond_2

    goto :goto_2

    :cond_2
    const/16 v2, 0x8

    :goto_2
    iget-object p1, p0, Ll/ܶۤܳ;->᩶:Landroid/widget/CheckBox;

    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    :cond_3
    return-void
.end method
