.class public final synthetic Ll/ܶ۠ᩳ;
.super Ljava/lang/Object;
.source "3B3L"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic ᩸:Ll/᩹ܶᩳ;

.field public final synthetic ᩹:Ll/ۙܶᩳ;


# direct methods
.method public synthetic constructor <init>(Ll/᩹ܶᩳ;Ll/ۙܶᩳ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܶ۠ᩳ;->᩸:Ll/᩹ܶᩳ;

    iput-object p2, p0, Ll/ܶ۠ᩳ;->᩹:Ll/ۙܶᩳ;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 2

    .line 575
    iget-object p1, p0, Ll/ܶ۠ᩳ;->᩸:Ll/᩹ܶᩳ;

    iget-object p2, p1, Ll/᩹ܶᩳ;->᩺:Ll/۫ۨᩳ;

    const/4 v0, 0x1

    invoke-virtual {p2, v0}, Ll/۫ۨᩳ;->ܳ(Z)V

    .line 576
    invoke-virtual {p1, v0}, Ll/֫ۘᩳ;->֫(Z)Z

    .line 73
    iget-object p2, p0, Ll/ܶ۠ᩳ;->᩹:Ll/ۙܶᩳ;

    iget-object p2, p2, Ll/ۙܶᩳ;->֫:Ll/ܶ᩵ܿ;

    invoke-virtual {p2}, Ll/ܶ᩵ܿ;->ۛ֫()J

    move-result-wide v0

    .line 577
    invoke-virtual {p1, v0, v1}, Ll/֫ۘᩳ;->֫(J)V

    return-void
.end method
