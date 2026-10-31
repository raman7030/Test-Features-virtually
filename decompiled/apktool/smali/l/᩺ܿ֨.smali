.class public final Ll/᩺ܿ֨;
.super Ljava/lang/Object;
.source "V7CO"


# instance fields
.field public ֫:I

.field public ۧ:I

.field public ܽ:I

.field public ܿ:I

.field public ᩳ:I


# virtual methods
.method public final ֫()Ljava/lang/String;
    .locals 2

    .line 52
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "T"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Ll/᩺ܿ֨;->ᩳ:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
