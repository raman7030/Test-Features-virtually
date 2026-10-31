.class public final synthetic Ll/۬᩹᩻;
.super Ljava/lang/Object;
.source "E1YX"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩸:Ll/ۤ᩹᩻;

.field public final synthetic ᩹:Ll/ܶ᩵ܿ;


# direct methods
.method public synthetic constructor <init>(Ll/ۤ᩹᩻;Ll/ܶ᩵ܿ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۬᩹᩻;->᩸:Ll/ۤ᩹᩻;

    iput-object p2, p0, Ll/۬᩹᩻;->᩹:Ll/ܶ᩵ܿ;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 2
    sget v0, Ll/ۤ᩹᩻;->֡֫:I

    const v0, 0x7f120b85

    .line 213
    iget-object v1, p0, Ll/۬᩹᩻;->᩸:Ll/ۤ᩹᩻;

    invoke-virtual {v1, v0}, Ll/ۘ۠ۢ;->ۡ(I)V

    .line 214
    iget-object v0, p0, Ll/۬᩹᩻;->᩹:Ll/ܶ᩵ܿ;

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ll/ۘ۠ۢ;->֫(Ljava/lang/CharSequence;)V

    return-void
.end method
