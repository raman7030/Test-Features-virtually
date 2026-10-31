.class public final synthetic Ll/ܳ۠ᩳ;
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

    iput-object p1, p0, Ll/ܳ۠ᩳ;->᩸:Ll/᩹ܶᩳ;

    iput-object p2, p0, Ll/ܳ۠ᩳ;->᩹:Ll/ܽ֨ᩳ;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 2

    .line 2606
    new-instance p1, Ll/᩹۫᩷;

    const/4 p2, 0x1

    iget-object v0, p0, Ll/ܳ۠ᩳ;->᩸:Ll/᩹ܶᩳ;

    iget-object v1, p0, Ll/ܳ۠ᩳ;->᩹:Ll/ܽ֨ᩳ;

    invoke-direct {p1, p2, v0, v1}, Ll/᩹۫᩷;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0, v1, p1}, Ll/᩹ܶᩳ;->֫(Ll/ܽ֨ᩳ;Ljava/lang/Runnable;)V

    return-void
.end method
