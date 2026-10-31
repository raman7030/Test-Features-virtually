.class public final synthetic Ll/ۚۤܿ;
.super Ljava/lang/Object;
.source "G668"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ᩶:Landroid/widget/TextView;

.field public final synthetic ᩸:[Landroid/widget/RadioButton;

.field public final synthetic ᩹:Landroid/widget/EditText;


# direct methods
.method public synthetic constructor <init>([Landroid/widget/RadioButton;Landroid/widget/EditText;Landroid/widget/TextView;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۚۤܿ;->᩸:[Landroid/widget/RadioButton;

    iput-object p2, p0, Ll/ۚۤܿ;->᩹:Landroid/widget/EditText;

    iput-object p3, p0, Ll/ۚۤܿ;->᩶:Landroid/widget/TextView;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 6

    .line 280
    iget-object v0, p0, Ll/ۚۤܿ;->᩸:[Landroid/widget/RadioButton;

    array-length v1, v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    const/4 v4, 0x1

    if-ge v3, v1, :cond_1

    aget-object v5, v0, v3

    if-ne p1, v5, :cond_0

    goto :goto_1

    :cond_0
    const/4 v4, 0x0

    .line 281
    :goto_1
    invoke-virtual {v5, v4}, Landroid/widget/CompoundButton;->setChecked(Z)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 283
    :cond_1
    aget-object v0, v0, v4

    if-ne p1, v0, :cond_2

    goto :goto_2

    :cond_2
    const/16 v2, 0x8

    :goto_2
    iget-object v0, p0, Ll/ۚۤܿ;->᩹:Landroid/widget/EditText;

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 284
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iget-object v0, p0, Ll/ۚۤܿ;->᩶:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method
