.class public final synthetic Ll/᩺᩺ܳ;
.super Ljava/lang/Object;
.source "A1YB"

# interfaces
.implements Landroid/widget/CompoundButton$OnCheckedChangeListener;


# instance fields
.field public final synthetic ᩸:Landroid/widget/EditText;


# direct methods
.method public synthetic constructor <init>(Landroid/widget/EditText;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩺᩺ܳ;->᩸:Landroid/widget/EditText;

    return-void
.end method


# virtual methods
.method public final onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .locals 0

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const/16 p1, 0x8

    .line 99
    :goto_0
    iget-object p2, p0, Ll/᩺᩺ܳ;->᩸:Landroid/widget/EditText;

    invoke-virtual {p2, p1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method
