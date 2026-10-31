.class public final Ll/֫ܿ֡;
.super Ll/ܳܿ֡;
.source "Y5S4"


# instance fields
.field public ۫:I


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 3

    .line 47
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "MismatchedTreeNodeException("

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ll/ܳܿ֡;->֫()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "!="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ll/֫ܿ֡;->۫:I

    const-string v2, ")"

    .line 0
    invoke-static {v1, v2, v0}, Ll/ۗۧᩳ;->֫(ILjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
