.class public final synthetic Ll/᩵ۙܽ;
.super Ljava/lang/Object;
.source "28VT"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩸:Ll/᩸ۙܽ;

.field public final synthetic ᩹:Ll/۬ܿᩳ;


# direct methods
.method public synthetic constructor <init>(Ll/᩸ۙܽ;Ll/۬ܿᩳ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩵ۙܽ;->᩸:Ll/᩸ۙܽ;

    iput-object p2, p0, Ll/᩵ۙܽ;->᩹:Ll/۬ܿᩳ;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 507
    new-instance v0, Ll/ܳۛܽ;

    iget-object v1, p0, Ll/᩵ۙܽ;->᩸:Ll/᩸ۙܽ;

    iget-object v2, v1, Ll/᩸ۙܽ;->᩹:Ll/᩹ۙܽ;

    new-instance v3, Ll/ۚۙܽ;

    invoke-direct {v3, v1}, Ll/ۚۙܽ;-><init>(Ll/᩸ۙܽ;)V

    invoke-direct {v0, v2, v3}, Ll/ܳۛܽ;-><init>(Ll/ۗܺ᩷;Ll/۬ۤ;)V

    .line 510
    iget-object v1, p0, Ll/᩵ۙܽ;->᩹:Ll/۬ܿᩳ;

    invoke-virtual {v0, v1}, Ll/ܳۛܽ;->֫(Ll/۬ܿᩳ;)V

    invoke-virtual {v0}, Ll/ܳۛܽ;->֫()V

    return-void
.end method
