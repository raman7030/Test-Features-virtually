.class public final Ll/ۘ᩸ܳ;
.super Ll/۬ۗܿ;
.source "94PF"


# instance fields
.field public final synthetic ֫֫:Ll/ܶ᩵ܿ;

.field public final synthetic ۟:Ll/֡᩸ܳ;


# direct methods
.method public constructor <init>(Ll/֡᩸ܳ;Ll/ۗܺ᩷;Ll/ܶ᩵ܿ;)V
    .locals 0

    .line 234
    iput-object p1, p0, Ll/ۘ᩸ܳ;->۟:Ll/֡᩸ܳ;

    iput-object p3, p0, Ll/ۘ᩸ܳ;->֫֫:Ll/ܶ᩵ܿ;

    const/4 p1, -0x1

    .line 40
    invoke-direct {p0, p2, p1}, Ll/۬ۗܿ;-><init>(Ll/ۗܺ᩷;I)V

    return-void
.end method


# virtual methods
.method public final ᩴ()V
    .locals 4

    .line 238
    iget-object v0, p0, Ll/ۘ᩸ܳ;->֫֫:Ll/ܶ᩵ܿ;

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v1

    .line 239
    invoke-virtual {p0}, Ll/۬ۗܿ;->ۢ()Ljava/lang/String;

    move-result-object v2

    .line 240
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 241
    invoke-virtual {p0}, Ll/۬ۗܿ;->ۧ()V

    return-void

    .line 244
    :cond_0
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ۢ֫()Ll/ܶ᩵ܿ;

    move-result-object v3

    .line 245
    invoke-virtual {v3, v2}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v3

    .line 246
    invoke-virtual {v1, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    iget-object v2, p0, Ll/ۘ᩸ܳ;->۟:Ll/֡᩸ܳ;

    if-eqz v1, :cond_1

    const-string v1, ".tmp"

    .line 899
    invoke-virtual {v0, v1}, Ll/ܶ᩵ܿ;->ܳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v1

    .line 248
    invoke-virtual {v0, v1}, Ll/ܶ᩵ܿ;->ۧ(Ll/ܶ᩵ܿ;)Z

    .line 249
    invoke-virtual {v1, v3}, Ll/ܶ᩵ܿ;->ۧ(Ll/ܶ᩵ܿ;)Z

    .line 250
    invoke-virtual {v2}, Ll/֡᩸ܳ;->ܿ()V

    .line 251
    invoke-virtual {p0}, Ll/۬ۗܿ;->ۧ()V

    return-void

    .line 254
    :cond_1
    invoke-virtual {v3}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v1

    if-eqz v1, :cond_2

    const v0, 0x7f1206b1

    .line 255
    invoke-virtual {p0, v0}, Ll/۬ۗܿ;->ۧ(I)V

    return-void

    .line 258
    :cond_2
    invoke-virtual {v0, v3}, Ll/ܶ᩵ܿ;->ۧ(Ll/ܶ᩵ܿ;)Z

    .line 259
    invoke-virtual {v2}, Ll/֡᩸ܳ;->ܿ()V

    .line 260
    invoke-virtual {p0}, Ll/۬ۗܿ;->ۧ()V

    return-void
.end method
