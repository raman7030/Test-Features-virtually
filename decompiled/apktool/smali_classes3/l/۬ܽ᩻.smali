.class public final synthetic Ll/۬ܽ᩻;
.super Ljava/lang/Object;
.source "795C"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic ᩸:Landroid/widget/EditText;

.field public final synthetic ᩹:Ljava/util/ArrayList;


# direct methods
.method public synthetic constructor <init>(Landroid/widget/EditText;Ljava/util/ArrayList;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۬ܽ᩻;->᩸:Landroid/widget/EditText;

    iput-object p2, p0, Ll/۬ܽ᩻;->᩹:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 0

    .line 2
    iget-object p1, p0, Ll/۬ܽ᩻;->᩹:Ljava/util/ArrayList;

    .line 120
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ܶ᩵ܿ;

    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object p1

    iget-object p2, p0, Ll/۬ܽ᩻;->᩸:Landroid/widget/EditText;

    invoke-virtual {p2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 121
    invoke-virtual {p2}, Landroid/widget/TextView;->length()I

    move-result p1

    invoke-virtual {p2, p1}, Landroid/widget/EditText;->setSelection(I)V

    return-void
.end method
