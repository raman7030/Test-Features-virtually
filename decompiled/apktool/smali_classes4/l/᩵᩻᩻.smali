.class public final synthetic Ll/᩵᩻᩻;
.super Ljava/lang/Object;
.source "5AG9"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ᩸:Ll/֡᩻᩻;


# direct methods
.method public synthetic constructor <init>(Ll/֡᩻᩻;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩵᩻᩻;->᩸:Ll/֡᩻᩻;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    .line 2
    iget-object p1, p0, Ll/᩵᩻᩻;->᩸:Ll/֡᩻᩻;

    .line 275
    iget-object p1, p1, Ll/֡᩻᩻;->ᩳ:Ll/ۗۘ;

    invoke-virtual {p1}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    invoke-virtual {p1, v0}, Ll/ۗۘ;->setChecked(Z)V

    return-void
.end method
