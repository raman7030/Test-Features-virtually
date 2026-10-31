.class public final synthetic Ll/ܺ۠ᩳ;
.super Ljava/lang/Object;
.source "3B3L"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩸:Ll/᩹ܶᩳ;

.field public final synthetic ᩹:Ll/ܽ֨ᩳ;


# direct methods
.method public synthetic constructor <init>(Ll/᩹ܶᩳ;Ll/ܽ֨ᩳ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܺ۠ᩳ;->᩸:Ll/᩹ܶᩳ;

    iput-object p2, p0, Ll/ܺ۠ᩳ;->᩹:Ll/ܽ֨ᩳ;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 2
    iget-object v0, p0, Ll/ܺ۠ᩳ;->᩸:Ll/᩹ܶᩳ;

    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2977
    iget-object v1, p0, Ll/ܺ۠ᩳ;->᩹:Ll/ܽ֨ᩳ;

    invoke-virtual {v1, v0}, Ll/ܽ֨ᩳ;->֫(Ll/᩹ܶᩳ;)V

    return-void
.end method
