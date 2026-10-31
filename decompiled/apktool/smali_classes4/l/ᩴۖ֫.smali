.class public Ll/ᩴۖ֫;
.super Ljava/lang/Object;
.source "722P"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ֫(Ll/۫᩺ۧ;)Ll/ۘۖ֫;
    .locals 2

    .line 11
    new-instance v0, Ll/ۘۖ֫;

    invoke-direct {v0}, Ll/ۘۖ֫;-><init>()V

    .line 12
    iget-object v1, v0, Ll/ۘۖ֫;->֫:Ll/᩵ۖ֫;

    invoke-virtual {p0, v1}, Ll/۫᩺ۧ;->֫(Ll/ۛ᩺ۧ;)Ll/ۛ᩺ۧ;

    move-result-object p0

    check-cast p0, Ll/᩵ۖ֫;

    iput-object p0, v0, Ll/ۘۖ֫;->֫:Ll/᩵ۖ֫;

    return-object v0
.end method

.method public static ֫(Ll/ۘۖ֫;Ll/۫᩺ۧ;)V
    .locals 0

    .line 18
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    iget-object p0, p0, Ll/ۘۖ֫;->֫:Ll/᩵ۖ֫;

    invoke-virtual {p1, p0}, Ll/۫᩺ۧ;->ۧ(Ll/ۛ᩺ۧ;)V

    return-void
.end method
