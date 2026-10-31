.class public final synthetic Ll/۫᩸ۡ;
.super Ljava/lang/Object;
.source "Z6W9"

# interfaces
.implements Ll/ܿۡ֫;


# instance fields
.field public final synthetic ᩸:Ll/ۗܺ᩷;

.field public final synthetic ᩹:Ll/۬᩸ۡ;


# direct methods
.method public synthetic constructor <init>(Ll/ۗܺ᩷;Ll/۬᩸ۡ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۫᩸ۡ;->᩸:Ll/ۗܺ᩷;

    iput-object p2, p0, Ll/۫᩸ۡ;->᩹:Ll/۬᩸ۡ;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/᩻ۡ֫;Ll/᩺ۢ֫;)V
    .locals 0

    .line 121
    sget-object p1, Ll/᩺ۢ֫;->ۗ:Ll/᩺ۢ֫;

    if-ne p2, p1, :cond_0

    .line 122
    iget-object p1, p0, Ll/۫᩸ۡ;->᩸:Ll/ۗܺ᩷;

    invoke-virtual {p1}, Ll/᩻ܽ;->getLifecycle()Ll/۟ۢ֫;

    move-result-object p1

    iget-object p2, p0, Ll/۫᩸ۡ;->᩹:Ll/۬᩸ۡ;

    invoke-virtual {p1, p2}, Ll/۟ۢ֫;->ۧ(Ll/ܳۡ֫;)V

    :cond_0
    return-void
.end method
