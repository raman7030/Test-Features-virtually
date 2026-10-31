.class public final Ll/ܳ֡᩷;
.super Ll/۬ۗܿ;
.source "6AY4"


# instance fields
.field public final synthetic ۟:Ll/᩵֡᩷;


# direct methods
.method public constructor <init>(Ll/᩵֡᩷;)V
    .locals 1

    .line 2
    iput-object p1, p0, Ll/ܳ֡᩷;->۟:Ll/᩵֡᩷;

    const v0, 0x104000b

    .line 1305
    invoke-direct {p0, p1, v0}, Ll/۬ۗܿ;-><init>(Ll/ۗܺ᩷;I)V

    return-void
.end method


# virtual methods
.method public final ۘ()V
    .locals 0

    return-void
.end method

.method public final ᩴ()V
    .locals 3

    .line 1307
    invoke-virtual {p0}, Ll/۬ۗܿ;->ۢ()Ljava/lang/String;

    move-result-object v0

    .line 1308
    invoke-static {v0}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;)V

    const-string v1, "/"

    .line 449
    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 1309
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 1310
    :cond_0
    invoke-static {v0}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;)V

    iget-object v1, p0, Ll/ܳ֡᩷;->۟:Ll/᩵֡᩷;

    invoke-static {v1, v0}, Ll/᩵֡᩷;->ܽ(Ll/᩵֡᩷;Ljava/lang/String;)V

    .line 1311
    invoke-virtual {p0}, Ll/۬ۗܿ;->ۧ()V

    return-void
.end method
