.class public final synthetic Ll/᩶᩷ܳ;
.super Ljava/lang/Object;
.source "123V"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic ᩸:Ll/ۙ᩷ܳ;


# direct methods
.method public synthetic constructor <init>(Ll/ۙ᩷ܳ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩶᩷ܳ;->᩸:Ll/ۙ᩷ܳ;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 0

    .line 2
    iget-object p1, p0, Ll/᩶᩷ܳ;->᩸:Ll/ۙ᩷ܳ;

    .line 347
    iget-object p1, p1, Ll/ۙ᩷ܳ;->ۜ:Ll/ܽۢܳ;

    invoke-virtual {p1}, Ll/ܽۢܳ;->ᩴ()Lbin/mt/plus/Main;

    move-result-object p1

    const-string p2, "https://mt.cc/download"

    invoke-virtual {p1, p2}, Ll/ۗܺ᩷;->ۧ(Ljava/lang/String;)V

    return-void
.end method
