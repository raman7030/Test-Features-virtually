.class public final synthetic Ll/۟ۘ᩻;
.super Ljava/lang/Object;
.source "1AFL"

# interfaces
.implements Ll/۬ۤ;


# instance fields
.field public final synthetic ֫:Landroid/widget/EditText;

.field public final synthetic ۧ:Landroid/widget/EditText;

.field public final synthetic ܽ:Landroid/widget/EditText;


# direct methods
.method public synthetic constructor <init>(Landroid/widget/EditText;Landroid/widget/EditText;Landroid/widget/EditText;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۟ۘ᩻;->֫:Landroid/widget/EditText;

    iput-object p2, p0, Ll/۟ۘ᩻;->ۧ:Landroid/widget/EditText;

    iput-object p3, p0, Ll/۟ۘ᩻;->ܽ:Landroid/widget/EditText;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 2

    .line 2
    check-cast p1, Ll/ۜᩴ᩻;

    .line 253
    invoke-virtual {p1}, Ll/ۜᩴ᩻;->֫()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Ll/۟ۘ᩻;->֫:Landroid/widget/EditText;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 254
    invoke-virtual {p1}, Ll/ۜᩴ᩻;->ܽ()I

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Ll/۟ۘ᩻;->ۧ:Landroid/widget/EditText;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 255
    invoke-virtual {p1}, Ll/ۜᩴ᩻;->ۧ()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Ll/۟ۘ᩻;->ܽ:Landroid/widget/EditText;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method
