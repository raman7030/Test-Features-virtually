.class public final synthetic Ll/᩷ܳ᩻;
.super Ljava/lang/Object;
.source "OAHZ"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ᩸:[Landroid/widget/RadioButton;


# direct methods
.method public synthetic constructor <init>([Landroid/widget/RadioButton;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩷ܳ᩻;->᩸:[Landroid/widget/RadioButton;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 5

    .line 236
    iget-object v0, p0, Ll/᩷ܳ᩻;->᩸:[Landroid/widget/RadioButton;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    if-ne p1, v3, :cond_0

    const/4 v4, 0x1

    goto :goto_1

    :cond_0
    const/4 v4, 0x0

    .line 237
    :goto_1
    invoke-virtual {v3, v4}, Landroid/widget/CompoundButton;->setChecked(Z)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method
