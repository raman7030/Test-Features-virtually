.class public final synthetic Ll/۟᩸᩻;
.super Ljava/lang/Object;
.source "8985"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic ۙ:[Ljava/lang/CharSequence;

.field public final synthetic ᩶:Landroid/content/res/Resources;

.field public final synthetic ᩸:Ll/ܿ᩹᩻;

.field public final synthetic ᩹:Ll/ܽۢܳ;


# direct methods
.method public synthetic constructor <init>(Ll/ܿ᩹᩻;Ll/ܽۢܳ;Landroid/content/res/Resources;[Ljava/lang/CharSequence;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۟᩸᩻;->᩸:Ll/ܿ᩹᩻;

    iput-object p2, p0, Ll/۟᩸᩻;->᩹:Ll/ܽۢܳ;

    iput-object p3, p0, Ll/۟᩸᩻;->᩶:Landroid/content/res/Resources;

    iput-object p4, p0, Ll/۟᩸᩻;->ۙ:[Ljava/lang/CharSequence;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 4

    .line 229
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    .line 230
    iget-object p1, p0, Ll/۟᩸᩻;->᩹:Ll/ܽۢܳ;

    invoke-virtual {p1}, Ll/ܽۢܳ;->ᩴ()Lbin/mt/plus/Main;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۗܺ᩷;->buildDialog()Ll/᩵ۚۢ;

    move-result-object v0

    const v1, 0x7f120b7b

    .line 231
    invoke-virtual {v0, v1}, Ll/᩵ۚۢ;->ۧ(I)V

    iget-object v1, p0, Ll/۟᩸᩻;->ۙ:[Ljava/lang/CharSequence;

    aget-object v1, v1, p2

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v1, v2, v3

    .line 232
    iget-object v1, p0, Ll/۟᩸᩻;->᩶:Landroid/content/res/Resources;

    const v3, 0x7f1205b3

    invoke-virtual {v1, v3, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/᩵ۚۢ;->֫(Ljava/lang/CharSequence;)V

    new-instance v1, Ll/֫᩹᩻;

    iget-object v2, p0, Ll/۟᩸᩻;->᩸:Ll/ܿ᩹᩻;

    invoke-direct {v1, v2, p2, p1}, Ll/֫᩹᩻;-><init>(Ll/ܿ᩹᩻;ILl/ܽۢܳ;)V

    const p1, 0x7f12070a

    .line 233
    invoke-virtual {v0, p1, v1}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    const p1, 0x7f12015e

    const/4 p2, 0x0

    .line 249
    invoke-virtual {v0, p1, p2}, Ll/᩵ۚۢ;->ۧ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 250
    invoke-virtual {v0}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    return-void
.end method
