.class public final synthetic Ll/ۨ᩷ۡ;
.super Ljava/lang/Object;
.source "U8UP"

# interfaces
.implements Ll/ܿۡ֫;


# instance fields
.field public final synthetic ᩸:Ll/ۗܺ᩷;

.field public final synthetic ᩹:Ll/ۛ᩷ۡ;


# direct methods
.method public synthetic constructor <init>(Ll/ۗܺ᩷;Ll/ۛ᩷ۡ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۨ᩷ۡ;->᩸:Ll/ۗܺ᩷;

    iput-object p2, p0, Ll/ۨ᩷ۡ;->᩹:Ll/ۛ᩷ۡ;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/᩻ۡ֫;Ll/᩺ۢ֫;)V
    .locals 2

    .line 38
    sget-object p1, Ll/᩺ۢ֫;->ۤ:Ll/᩺ۢ֫;

    iget-object v0, p0, Ll/ۨ᩷ۡ;->᩸:Ll/ۗܺ᩷;

    iget-object v1, p0, Ll/ۨ᩷ۡ;->᩹:Ll/ۛ᩷ۡ;

    if-ne p2, p1, :cond_0

    .line 40
    invoke-virtual {v0, v1}, Ll/᩻ܽ;->ۜ(Ll/۬ۤ;)V

    .line 41
    invoke-virtual {v0, v1}, Ll/᩻ܽ;->֫(Ll/۬ۤ;)V

    return-void

    .line 42
    :cond_0
    sget-object p1, Ll/᩺ۢ֫;->ۛ:Ll/᩺ۢ֫;

    if-ne p2, p1, :cond_1

    .line 43
    invoke-virtual {v0, v1}, Ll/᩻ܽ;->ۜ(Ll/۬ۤ;)V

    :cond_1
    return-void
.end method
