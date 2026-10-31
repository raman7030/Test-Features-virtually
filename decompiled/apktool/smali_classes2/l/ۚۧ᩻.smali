.class public final synthetic Ll/ۚۧ᩻;
.super Ljava/lang/Object;
.source "22BV"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩸:Ll/ܽۢܳ;

.field public final synthetic ᩹:Ll/۬۠ܿ;


# direct methods
.method public synthetic constructor <init>(Ll/ܽۢܳ;Ll/۬۠ܿ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۚۧ᩻;->᩸:Ll/ܽۢܳ;

    iput-object p2, p0, Ll/ۚۧ᩻;->᩹:Ll/۬۠ܿ;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 455
    iget-object v0, p0, Ll/ۚۧ᩻;->᩸:Ll/ܽۢܳ;

    invoke-virtual {v0}, Ll/ܽۢܳ;->ᩴ()Lbin/mt/plus/Main;

    move-result-object v0

    const-string v1, "unknown"

    .line 115
    iget-object v2, p0, Ll/ۚۧ᩻;->᩹:Ll/۬۠ܿ;

    invoke-virtual {v2}, Ll/۬۠ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2, v1, v1, v1}, Ll/᩵ۨܳ;->֫(Ll/ۗܺ᩷;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
