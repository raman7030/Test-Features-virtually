.class public final Ll/ۚܰ᩷;
.super Ll/۬ۗܿ;
.source "I1KV"


# instance fields
.field public final synthetic ֫֫:Ljava/lang/String;

.field public final synthetic ۟:Ll/᩸ܰ᩷;

.field public final synthetic ۧ֫:Ljava/lang/String;

.field public final synthetic ܽ֫:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ll/᩸ܰ᩷;Ll/ۗܺ᩷;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 894
    iput-object p1, p0, Ll/ۚܰ᩷;->۟:Ll/᩸ܰ᩷;

    iput-object p3, p0, Ll/ۚܰ᩷;->ܽ֫:Ljava/lang/String;

    iput-object p4, p0, Ll/ۚܰ᩷;->ۧ֫:Ljava/lang/String;

    iput-object p5, p0, Ll/ۚܰ᩷;->֫֫:Ljava/lang/String;

    const/4 p1, -0x1

    .line 40
    invoke-direct {p0, p2, p1}, Ll/۬ۗܿ;-><init>(Ll/ۗܺ᩷;I)V

    return-void
.end method


# virtual methods
.method public final ᩴ()V
    .locals 5

    .line 898
    iget-object v0, p0, Ll/ۚܰ᩷;->ۧ֫:Ljava/lang/String;

    iget-object v1, p0, Ll/ۚܰ᩷;->۟:Ll/᩸ܰ᩷;

    invoke-virtual {p0}, Ll/۬ۗܿ;->ۢ()Ljava/lang/String;

    move-result-object v2

    .line 899
    iget-object v3, p0, Ll/ۚܰ᩷;->ܽ֫:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_0

    const-string v0, "error"

    .line 900
    invoke-virtual {p0, v0}, Ll/۬ۗܿ;->֫(Ljava/lang/String;)V

    return-void

    .line 904
    :cond_0
    :try_start_0
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v4

    invoke-virtual {v2, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1}, Ll/᩸ܰ᩷;->ᩳ(Ll/᩸ܰ᩷;)Ll/᩵ۨ᩷;

    move-result-object v4

    invoke-virtual {v4, v0}, Ll/᩵ۨ᩷;->ܽ(Ljava/lang/String;)Ll/ۤܽܽ;

    move-result-object v4

    invoke-static {v2, v4}, Ll/᩸ܽܽ;->֫(Ljava/lang/String;Ll/ۤܽܽ;)Ll/᩸ܽܽ;

    move-result-object v2

    invoke-virtual {v2}, Ll/᩸ܽܽ;->ܽ()Ljava/lang/String;

    move-result-object v2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 909
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "/"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 910
    invoke-static {v1}, Ll/᩸ܰ᩷;->ᩳ(Ll/᩸ܰ᩷;)Ll/᩵ۨ᩷;

    move-result-object v2

    invoke-virtual {v2, v0}, Ll/᩵ۨ᩷;->ۡ(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    const v0, 0x7f1206b1

    .line 911
    invoke-virtual {p0, v0}, Ll/۬ۗܿ;->ۧ(I)V

    return-void

    .line 915
    :cond_1
    :try_start_1
    invoke-static {v1}, Ll/᩸ܰ᩷;->ᩳ(Ll/᩸ܰ᩷;)Ll/᩵ۨ᩷;

    move-result-object v2

    iget-object v3, p0, Ll/ۚܰ᩷;->֫֫:Ljava/lang/String;

    invoke-virtual {v2, v0, v3}, Ll/᩵ۨ᩷;->֫(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 920
    invoke-virtual {v1}, Ll/᩸ܰ᩷;->ۧ()V

    .line 921
    invoke-virtual {v1, v0}, Ll/᩸ܰ᩷;->ۧ(Ljava/lang/String;)V

    .line 922
    invoke-virtual {p0}, Ll/۬ۗܿ;->ۧ()V

    return-void

    :catch_0
    move-exception v0

    .line 917
    invoke-static {v1}, Ll/᩸ܰ᩷;->ܳ(Ll/᩸ܰ᩷;)Ll/ۘۛ᩷;

    move-result-object v1

    invoke-virtual {v1, v0}, Ll/ۘۛ᩷;->֫(Ljava/lang/Throwable;)V

    return-void

    :catch_1
    move-exception v0

    .line 906
    invoke-static {v1}, Ll/᩸ܰ᩷;->ܳ(Ll/᩸ܰ᩷;)Ll/ۘۛ᩷;

    move-result-object v1

    invoke-virtual {v1, v0}, Ll/ۘۛ᩷;->֫(Ljava/lang/Throwable;)V

    return-void
.end method
