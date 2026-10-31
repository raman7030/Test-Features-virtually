.class public final synthetic Ll/۠ᩳ᩻;
.super Ljava/lang/Object;
.source "195F"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic ᩸:Landroid/widget/EditText;

.field public final synthetic ᩹:[Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Landroid/widget/EditText;[Ljava/lang/String;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۠ᩳ᩻;->᩸:Landroid/widget/EditText;

    iput-object p2, p0, Ll/۠ᩳ᩻;->᩹:[Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 1

    if-nez p2, :cond_0

    const-string p2, ""

    goto :goto_0

    .line 477
    :cond_0
    iget-object v0, p0, Ll/۠ᩳ᩻;->᩹:[Ljava/lang/String;

    aget-object p2, v0, p2

    :goto_0
    iget-object v0, p0, Ll/۠ᩳ᩻;->᩸:Landroid/widget/EditText;

    invoke-virtual {v0, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 478
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    return-void
.end method
