.class public final synthetic Ll/᩻ܳۢ;
.super Ljava/lang/Object;
.source "I1KV"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩸:Ll/۟ܳۢ;

.field public final synthetic ᩹:Ll/ܽ᩻ۡ;


# direct methods
.method public synthetic constructor <init>(Ll/۟ܳۢ;Ll/ܽ᩻ۡ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩻ܳۢ;->᩸:Ll/۟ܳۢ;

    iput-object p2, p0, Ll/᩻ܳۢ;->᩹:Ll/ܽ᩻ۡ;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 406
    iget-object v0, p0, Ll/᩻ܳۢ;->᩸:Ll/۟ܳۢ;

    invoke-virtual {v0}, Ll/ۡ᩻֫;->requireActivity()Ll/֡᩻֫;

    move-result-object v1

    check-cast v1, Ll/ۗܺ᩷;

    .line 407
    new-instance v2, Ll/ۙܳۢ;

    iget-object v3, p0, Ll/᩻ܳۢ;->᩹:Ll/ܽ᩻ۡ;

    invoke-direct {v2, v0, v1, v1, v3}, Ll/ۙܳۢ;-><init>(Ll/۟ܳۢ;Ll/ۗܺ᩷;Ll/ۗܺ᩷;Ll/ܽ᩻ۡ;)V

    const v0, 0x7f1205f9

    .line 553
    invoke-virtual {v2, v0}, Ll/۬ۗܿ;->ۡ(I)V

    .line 554
    invoke-virtual {v3}, Ll/ܽ᩻ۡ;->ᩳ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ll/۬ۗܿ;->֫(Ljava/lang/CharSequence;)V

    .line 555
    invoke-virtual {v2}, Ll/۬ۗܿ;->֫()V

    .line 556
    invoke-virtual {v2}, Ll/۬ۗܿ;->֡()V

    const/4 v0, 0x6

    .line 557
    invoke-virtual {v2, v0}, Ll/۬ۗܿ;->ᩳ(I)V

    const/4 v0, 0x1

    .line 205
    invoke-virtual {v2, v0}, Ll/۬ۗܿ;->ۧ(Z)V

    return-void
.end method
