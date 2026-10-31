.class public final Ll/ۙۜܳ;
.super Ll/ۤۜܳ;
.source "969A"


# instance fields
.field public final synthetic ᩳ:Ll/ܽ᩷ܳ;


# direct methods
.method public constructor <init>(Ll/ܽ᩷ܳ;)V
    .locals 1

    .line 741
    iput-object p1, p0, Ll/ۙۜܳ;->ᩳ:Ll/ܽ᩷ܳ;

    const p1, 0x7f120115

    const v0, 0x7f080213

    invoke-direct {p0, p1, v0}, Ll/ۤۜܳ;-><init>(II)V

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ܽۢܳ;)V
    .locals 2

    const-string v0, "/"

    const/4 v1, 0x0

    .line 744
    invoke-virtual {p1, v0, v1}, Ll/ܽۢܳ;->ۧ(Ljava/lang/String;Z)V

    return-void
.end method

.method public final ܳ()Z
    .locals 2

    .line 749
    iget-object v0, p0, Ll/ۙۜܳ;->ᩳ:Ll/ܽ᩷ܳ;

    invoke-virtual {v0}, Ll/ܽ᩷ܳ;->۠()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
