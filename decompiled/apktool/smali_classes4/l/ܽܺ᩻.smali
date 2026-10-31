.class public final synthetic Ll/ܽܺ᩻;
.super Ljava/lang/Object;
.source "CAG8"

# interfaces
.implements Landroid/widget/CompoundButton$OnCheckedChangeListener;


# instance fields
.field public final synthetic ᩸:Landroid/widget/RadioButton;

.field public final synthetic ᩹:Landroid/widget/RadioButton;


# direct methods
.method public synthetic constructor <init>(Landroid/widget/RadioButton;Landroid/widget/RadioButton;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܽܺ᩻;->᩸:Landroid/widget/RadioButton;

    iput-object p2, p0, Ll/ܽܺ᩻;->᩹:Landroid/widget/RadioButton;

    return-void
.end method


# virtual methods
.method public final onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .locals 1

    .line 238
    iget-object v0, p0, Ll/ܽܺ᩻;->᩸:Landroid/widget/RadioButton;

    if-ne p1, v0, :cond_0

    .line 239
    iget-object v0, p0, Ll/ܽܺ᩻;->᩹:Landroid/widget/RadioButton;

    .line 243
    :cond_0
    invoke-virtual {v0}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result p1

    if-ne p1, p2, :cond_1

    xor-int/lit8 p1, p2, 0x1

    .line 244
    invoke-virtual {v0, p1}, Landroid/widget/CompoundButton;->setChecked(Z)V

    :cond_1
    return-void
.end method
