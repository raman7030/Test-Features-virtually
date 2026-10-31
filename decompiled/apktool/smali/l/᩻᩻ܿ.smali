.class public final synthetic Ll/᩻᩻ܿ;
.super Ljava/lang/Object;
.source "89CO"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic ᩸:Ll/ۜ᩻ܿ;


# direct methods
.method public synthetic constructor <init>(Ll/ۜ᩻ܿ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩻᩻ܿ;->᩸:Ll/ۜ᩻ܿ;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 1

    .line 224
    invoke-static {}, Ll/۬ۙܿ;->values()[Ll/۬ۙܿ;

    move-result-object v0

    aget-object p2, v0, p2

    invoke-static {p2}, Ll/۟᩶ܿ;->֫(Ll/۬ۙܿ;)V

    .line 225
    iget-object p2, p0, Ll/᩻᩻ܿ;->᩸:Ll/ۜ᩻ܿ;

    iget-object p2, p2, Ll/ۜ᩻ܿ;->᩸:Landroid/widget/TextView;

    invoke-static {}, Ll/۟᩶ܿ;->ܿ()Ll/۬ۙܿ;

    move-result-object v0

    invoke-virtual {v0}, Ll/۬ۙܿ;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 226
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    return-void
.end method
