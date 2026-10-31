.class public final synthetic Ll/ۚ᩹ܳ;
.super Ljava/lang/Object;
.source "164Z"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ۙ:Ll/֡ۚۢ;

.field public final synthetic ᩶:Ljava/lang/String;

.field public final synthetic ᩸:Ll/۠᩹ܳ;

.field public final synthetic ᩹:Lbin/mt/plus/Main;


# direct methods
.method public synthetic constructor <init>(Ll/۠᩹ܳ;Lbin/mt/plus/Main;Ljava/lang/String;Ll/֡ۚۢ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۚ᩹ܳ;->᩸:Ll/۠᩹ܳ;

    iput-object p2, p0, Ll/ۚ᩹ܳ;->᩹:Lbin/mt/plus/Main;

    iput-object p3, p0, Ll/ۚ᩹ܳ;->᩶:Ljava/lang/String;

    iput-object p4, p0, Ll/ۚ᩹ܳ;->ۙ:Ll/֡ۚۢ;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    .line 267
    iget-object p1, p0, Ll/ۚ᩹ܳ;->᩹:Lbin/mt/plus/Main;

    invoke-virtual {p1}, Ll/ۗܺ᩷;->buildDialog()Ll/᩵ۚۢ;

    move-result-object p1

    const v0, 0x7f120b7b

    .line 268
    invoke-virtual {p1, v0}, Ll/᩵ۚۢ;->ۧ(I)V

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "\u662f\u5426\u4ece\u5de5\u5177\u4e2d\u9690\u85cf\u300c"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/ۚ᩹ܳ;->᩶:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\u300d\uff1f"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 269
    invoke-virtual {p1, v0}, Ll/᩵ۚۢ;->֫(Ljava/lang/CharSequence;)V

    new-instance v0, Ll/֨᩹ܳ;

    iget-object v1, p0, Ll/ۚ᩹ܳ;->᩸:Ll/۠᩹ܳ;

    iget-object v2, p0, Ll/ۚ᩹ܳ;->ۙ:Ll/֡ۚۢ;

    invoke-direct {v0, v1, v2}, Ll/֨᩹ܳ;-><init>(Ll/۠᩹ܳ;Ll/֡ۚۢ;)V

    const v1, 0x7f12070a

    .line 270
    invoke-virtual {p1, v1, v0}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    const v0, 0x7f12015e

    const/4 v1, 0x0

    .line 276
    invoke-virtual {p1, v0, v1}, Ll/᩵ۚۢ;->ۧ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 277
    invoke-virtual {p1}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    return-void
.end method
