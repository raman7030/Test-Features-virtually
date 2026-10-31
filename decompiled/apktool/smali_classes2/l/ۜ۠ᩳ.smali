.class public final synthetic Ll/ۜ۠ᩳ;
.super Ljava/lang/Object;
.source "3B3L"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic ᩸:Ll/᩹ܶᩳ;

.field public final synthetic ᩹:Ll/ܽ֨ᩳ;


# direct methods
.method public synthetic constructor <init>(Ll/᩹ܶᩳ;Ll/ܽ֨ᩳ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۜ۠ᩳ;->᩸:Ll/᩹ܶᩳ;

    iput-object p2, p0, Ll/ۜ۠ᩳ;->᩹:Ll/ܽ֨ᩳ;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 1

    .line 2624
    new-instance p1, Ll/֨۠ᩳ;

    const/4 p2, 0x0

    iget-object v0, p0, Ll/ۜ۠ᩳ;->᩹:Ll/ܽ֨ᩳ;

    invoke-direct {p1, p2, v0}, Ll/֨۠ᩳ;-><init>(ILjava/lang/Object;)V

    iget-object p2, p0, Ll/ۜ۠ᩳ;->᩸:Ll/᩹ܶᩳ;

    invoke-virtual {p2, v0, p1}, Ll/᩹ܶᩳ;->֫(Ll/ܽ֨ᩳ;Ljava/lang/Runnable;)V

    return-void
.end method
