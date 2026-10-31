.class public final synthetic Ll/ܽۘ᩻;
.super Ljava/lang/Object;
.source "27JL"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ۙ:Landroid/widget/EditText;

.field public final synthetic ᩶:Landroid/widget/EditText;

.field public final synthetic ᩸:Ll/ۗܺ᩷;

.field public final synthetic ᩹:Landroid/widget/EditText;


# direct methods
.method public synthetic constructor <init>(Ll/ۗܺ᩷;Landroid/widget/EditText;Landroid/widget/EditText;Landroid/widget/EditText;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܽۘ᩻;->᩸:Ll/ۗܺ᩷;

    iput-object p2, p0, Ll/ܽۘ᩻;->᩹:Landroid/widget/EditText;

    iput-object p3, p0, Ll/ܽۘ᩻;->᩶:Landroid/widget/EditText;

    iput-object p4, p0, Ll/ܽۘ᩻;->ۙ:Landroid/widget/EditText;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    .line 199
    new-instance p1, Ll/᩷ۘ᩻;

    iget-object v0, p0, Ll/ܽۘ᩻;->᩹:Landroid/widget/EditText;

    iget-object v1, p0, Ll/ܽۘ᩻;->᩶:Landroid/widget/EditText;

    iget-object v2, p0, Ll/ܽۘ᩻;->ۙ:Landroid/widget/EditText;

    invoke-direct {p1, v0, v1, v2}, Ll/᩷ۘ᩻;-><init>(Landroid/widget/EditText;Landroid/widget/EditText;Landroid/widget/EditText;)V

    iget-object v0, p0, Ll/ܽۘ᩻;->᩸:Ll/ۗܺ᩷;

    invoke-static {v0, p1}, Ll/᩷ᩴ᩻;->֫(Ll/ۗܺ᩷;Ll/۬ۤ;)V

    return-void
.end method
