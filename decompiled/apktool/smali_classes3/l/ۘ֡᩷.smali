.class public final synthetic Ll/ۘ֡᩷;
.super Ljava/lang/Object;
.source "6AY4"

# interfaces
.implements Ll/ܺ᩹᩵;


# instance fields
.field public final synthetic ᩸:Ll/۟ۤ;


# direct methods
.method public synthetic constructor <init>(Ll/۟ۤ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۘ֡᩷;->᩸:Ll/۟ۤ;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 2
    check-cast p1, Ljava/lang/String;

    const-string v0, "it"

    .line 0
    invoke-static {p1, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 881
    iget-object v0, p0, Ll/ۘ֡᩷;->᩸:Ll/۟ۤ;

    invoke-interface {v0, p1}, Ll/۟ۤ;->֫(Ljava/lang/String;)Z

    move-result p1

    .line 0
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
