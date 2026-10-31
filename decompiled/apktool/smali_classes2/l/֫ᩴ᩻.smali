.class public final Ll/֫ᩴ᩻;
.super Ll/۟ܶۡ;
.source "1AFL"


# instance fields
.field public final synthetic ۜ:Landroid/widget/EditText;

.field public ܳ:Ljava/lang/String;

.field public final synthetic ᩷:Ljava/lang/String;

.field public final synthetic ᩻:Ll/ۗܺ᩷;


# direct methods
.method public constructor <init>(Ll/ۗܺ᩷;Ljava/lang/String;Landroid/widget/EditText;)V
    .locals 0

    .line 318
    iput-object p1, p0, Ll/֫ᩴ᩻;->᩻:Ll/ۗܺ᩷;

    iput-object p2, p0, Ll/֫ᩴ᩻;->᩷:Ljava/lang/String;

    iput-object p3, p0, Ll/֫ᩴ᩻;->ۜ:Landroid/widget/EditText;

    invoke-direct {p0}, Ll/۟ܶۡ;-><init>()V

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 2

    .line 336
    iget-object v0, p0, Ll/֫ᩴ᩻;->ۜ:Landroid/widget/EditText;

    iget-object v1, p0, Ll/֫ᩴ᩻;->ܳ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final ֫(Ljava/lang/Exception;)V
    .locals 2

    .line 341
    iget-object v0, p0, Ll/֫ᩴ᩻;->᩻:Ll/ۗܺ᩷;

    const/4 v1, 0x0

    .line 546
    invoke-virtual {v0, p1, v1}, Ll/ۗܺ᩷;->֫(Ljava/lang/Throwable;Landroid/content/DialogInterface$OnDismissListener;)V

    return-void
.end method

.method public final ۧ()V
    .locals 2

    .line 323
    iget-object v0, p0, Ll/֫ᩴ᩻;->᩻:Ll/ۗܺ᩷;

    const v1, 0x7f120528

    invoke-virtual {p0, v0, v1}, Ll/۟ܶۡ;->֫(Ll/ۗܺ᩷;I)V

    return-void
.end method

.method public final ܿ()V
    .locals 3

    const/4 v0, 0x0

    new-array v1, v0, [Ljava/lang/String;

    .line 328
    iget-object v2, p0, Ll/֫ᩴ᩻;->᩷:Ljava/lang/String;

    invoke-static {v2, v1}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;[Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->֡ۧ()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Ll/֫ᩴ᩻;->ܳ:Ljava/lang/String;

    .line 329
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    const/16 v2, 0x5000

    if-le v1, v2, :cond_0

    .line 330
    iget-object v1, p0, Ll/֫ᩴ᩻;->ܳ:Ljava/lang/String;

    invoke-virtual {v1, v0, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/֫ᩴ᩻;->ܳ:Ljava/lang/String;

    :cond_0
    return-void
.end method

.method public final ᩳ()V
    .locals 0

    .line 346
    invoke-virtual {p0}, Ll/۟ܶۡ;->ܽ()V

    return-void
.end method
