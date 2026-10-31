.class public final synthetic Ll/᩻ۡ᩻;
.super Ljava/lang/Object;
.source "TAIM"

# interfaces
.implements Landroid/content/DialogInterface$OnDismissListener;


# instance fields
.field public final synthetic ᩶:Ljava/util/ArrayList;

.field public final synthetic ᩸:Ll/᩷ۡ᩻;

.field public final synthetic ᩹:Ll/ܽۢܳ;


# direct methods
.method public synthetic constructor <init>(Ll/᩷ۡ᩻;Ll/ܽۢܳ;Ljava/util/ArrayList;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩻ۡ᩻;->᩸:Ll/᩷ۡ᩻;

    iput-object p2, p0, Ll/᩻ۡ᩻;->᩹:Ll/ܽۢܳ;

    iput-object p3, p0, Ll/᩻ۡ᩻;->᩶:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final onDismiss(Landroid/content/DialogInterface;)V
    .locals 3

    .line 579
    iget-object p1, p0, Ll/᩻ۡ᩻;->᩸:Ll/᩷ۡ᩻;

    iget-object p1, p1, Ll/᩷ۡ᩻;->᩷:Ll/ۚۡ᩻;

    const v0, 0x7f120ac1

    invoke-static {v0}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Ll/᩻ۡ᩻;->᩹:Ll/ܽۢܳ;

    iget-object v2, p0, Ll/᩻ۡ᩻;->᩶:Ljava/util/ArrayList;

    invoke-static {p1, v1, v2, v0}, Ll/ۚۡ᩻;->֫(Ll/ۚۡ᩻;Ll/ܽۢܳ;Ljava/util/ArrayList;Ljava/lang/String;)V

    return-void
.end method
