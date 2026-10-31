.class public final Ll/ܽܿ֡;
.super Ll/ܳܿ֡;
.source "25TV"


# instance fields
.field public ۫:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;IILl/ۨᩳ֡;)V
    .locals 0

    .line 43
    invoke-direct {p0, p4}, Ll/ܳܿ֡;-><init>(Ll/ۨᩳ֡;)V

    .line 44
    iput-object p1, p0, Ll/ܽܿ֡;->۫:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 4

    .line 51
    iget-object v0, p0, Ll/ܳܿ֡;->᩶:Ll/ۨᩳ֡;

    instance-of v0, v0, Ll/ۙᩳ֡;

    const-string v1, "])"

    iget-object v2, p0, Ll/ܽܿ֡;->۫:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 52
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v3, "NoViableAltException(\'"

    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ll/ܳܿ֡;->֫()I

    move-result v3

    int-to-char v3, v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v3, "\'@["

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 55
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v3, "NoViableAltException("

    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ll/ܳܿ֡;->֫()I

    move-result v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, "@["

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
