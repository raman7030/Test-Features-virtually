.class public final synthetic Ll/۬֨ܿ;
.super Ljava/lang/Object;
.source "Q13J"

# interfaces
.implements Ll/ᩴܺܳ;


# instance fields
.field public final synthetic ᩶:Ll/ܽۢܳ;

.field public final synthetic ᩸:Ll/۫֨ܿ;

.field public final synthetic ᩹:Ll/ᩳۜܳ;


# direct methods
.method public synthetic constructor <init>(Ll/۫֨ܿ;Ll/ᩳۜܳ;Ll/ܽۢܳ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۬֨ܿ;->᩸:Ll/۫֨ܿ;

    iput-object p2, p0, Ll/۬֨ܿ;->᩹:Ll/ᩳۜܳ;

    iput-object p3, p0, Ll/۬֨ܿ;->᩶:Ll/ܽۢܳ;

    return-void
.end method


# virtual methods
.method public final ۧ(Ll/ܶ᩵ܿ;)V
    .locals 2

    const/16 v0, 0x1388

    .line 42
    iget-object v1, p0, Ll/۬֨ܿ;->᩹:Ll/ᩳۜܳ;

    invoke-static {v1, v0}, Ll/ۢۘܳ;->֫(Ll/ᩳۜܳ;I)V

    .line 43
    iget-object v0, p0, Ll/۬֨ܿ;->᩶:Ll/ܽۢܳ;

    invoke-virtual {v0}, Ll/ܽۢܳ;->ᩴ()Lbin/mt/plus/Main;

    move-result-object v0

    invoke-interface {v1}, Ll/ᩳۜܳ;->۠֫()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, p1, v1}, Ll/ۛ֨ܿ;->֫(Ll/ۗܺ᩷;Ll/ܶ᩵ܿ;Ljava/lang/String;)Ll/ۛ֨ܿ;

    move-result-object p1

    iget-object v0, p0, Ll/۬֨ܿ;->᩸:Ll/۫֨ܿ;

    invoke-virtual {p1, v0}, Ll/ۛ֨ܿ;->ۧ(Ll/ۛ֡ܿ;)V

    return-void
.end method
