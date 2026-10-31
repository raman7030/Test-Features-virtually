.class public abstract Ll/ۧۗ᩵;
.super Ll/ᩳ۫᩵;
.source "2AXL"

# interfaces
.implements Ll/ۨܶ᩵;
.implements Ll/ۨۗ᩵;


# instance fields
.field public final ᩹:Ll/ܳ᩸᩵;


# direct methods
.method public constructor <init>(Ll/ܳ᩸᩵;Z)V
    .locals 0

    .line 41
    invoke-direct {p0, p2}, Ll/ᩳ۫᩵;-><init>(Z)V

    .line 51
    sget-object p2, Ll/۫۬᩵;->᩸:Ll/۫۬᩵;

    invoke-interface {p1, p2}, Ll/ܳ᩸᩵;->֫(Ll/ܿ᩸᩵;)Ll/ᩳ᩸᩵;

    move-result-object p2

    check-cast p2, Ll/ۤ۬᩵;

    invoke-virtual {p0, p2}, Ll/ᩳ۫᩵;->֫(Ll/ۤ۬᩵;)V

    .line 58
    invoke-interface {p1, p0}, Ll/ܳ᩸᩵;->֫(Ll/ܳ᩸᩵;)Ll/ܳ᩸᩵;

    move-result-object p1

    iput-object p1, p0, Ll/ۧۗ᩵;->᩹:Ll/ܳ᩸᩵;

    return-void
.end method


# virtual methods
.method public final getContext()Ll/ܳ᩸᩵;
    .locals 1

    .line 58
    iget-object v0, p0, Ll/ۧۗ᩵;->᩹:Ll/ܳ᩸᩵;

    return-object v0
.end method

.method public final ֫()Ljava/lang/String;
    .locals 2

    .line 21
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    const-string v1, " was cancelled"

    .line 86
    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ljava/lang/Object;)V
    .locals 2

    .line 14
    invoke-static {p1}, Ll/ۘ۠᩵;->֫(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 16
    :cond_0
    new-instance p1, Ll/ᩴۗ᩵;

    const/4 v1, 0x0

    .line 42
    invoke-direct {p1, v0, v1}, Ll/ᩴۗ᩵;-><init>(Ljava/lang/Throwable;Z)V

    .line 100
    :goto_0
    invoke-virtual {p0, p1}, Ll/ᩳ۫᩵;->ܳ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    .line 101
    sget-object v0, Ll/ܿ۫᩵;->ܽ:Ll/ܶۛ᩵;

    if-ne p1, v0, :cond_1

    return-void

    .line 102
    :cond_1
    invoke-virtual {p0, p1}, Ll/ᩳ۫᩵;->ᩳ(Ljava/lang/Object;)V

    return-void
.end method

.method public final ֫(Ll/ۚۗ᩵;)V
    .locals 1

    .line 108
    iget-object v0, p0, Ll/ۧۗ᩵;->᩹:Ll/ܳ᩸᩵;

    invoke-static {p1, v0}, Ll/ۛۗ᩵;->֫(Ljava/lang/Throwable;Ll/ܳ᩸᩵;)V

    return-void
.end method
