.class public final synthetic Ll/ۗۛ;
.super Ljava/lang/Object;
.source "0B2V"

# interfaces
.implements Ll/ܿۡ֫;


# instance fields
.field public final synthetic ᩸:Ll/۫ۛ;

.field public final synthetic ᩹:Ll/ۨۛ;


# direct methods
.method public synthetic constructor <init>(Ll/۫ۛ;Ll/ۨۛ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۗۛ;->᩸:Ll/۫ۛ;

    iput-object p2, p0, Ll/ۗۛ;->᩹:Ll/ۨۛ;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/᩻ۡ֫;Ll/᩺ۢ֫;)V
    .locals 1

    .line 2
    iget-object p1, p0, Ll/ۗۛ;->᩸:Ll/۫ۛ;

    .line 5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 153
    sget-object v0, Ll/᩺ۢ֫;->ۗ:Ll/᩺ۢ֫;

    if-ne p2, v0, :cond_0

    .line 154
    iget-object p2, p0, Ll/ۗۛ;->᩹:Ll/ۨۛ;

    invoke-virtual {p1, p2}, Ll/۫ۛ;->ۧ(Ll/ۨۛ;)V

    :cond_0
    return-void
.end method
