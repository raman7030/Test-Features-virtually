.class public abstract Ll/ۖ᩹ۢ;
.super Ljava/lang/Object;
.source "A1UM"


# instance fields
.field public final synthetic ֫:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ۖ᩹ۢ;->֫:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1

    .line 2
    iget v0, p0, Ll/ۖ᩹ۢ;->֫:I

    packed-switch v0, :pswitch_data_0

    .line 8
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 156
    :pswitch_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x5
        :pswitch_0
    .end packed-switch
.end method

.method public abstract ֫(I)D
.end method

.method public abstract ֫(ID)D
.end method

.method public abstract ֫()I
.end method

.method public abstract ֫(II[B[B)I
.end method

.method public abstract ֫(Ljava/lang/Object;)I
.end method

.method public abstract ֫(I[B)V
.end method

.method public abstract ֫(Ljava/lang/String;)V
.end method

.method public ֫(Ll/ۗۗۡ;)V
    .locals 0

    .line 21
    invoke-virtual {p0, p1}, Ll/ۖ᩹ۢ;->ۧ(Ll/ۗۗۡ;)V

    return-void
.end method

.method public ֫(Ll/ۗۗۡ;Ll/ۤۗۡ;)V
    .locals 0

    .line 33
    invoke-virtual {p0, p2}, Ll/ۖ᩹ۢ;->֫(Ll/۫ۗۡ;)V

    return-void
.end method

.method public ֫(Ll/ۗۗۡ;Ll/۬ۗۡ;)V
    .locals 0

    .line 33
    invoke-virtual {p0, p2}, Ll/ۖ᩹ۢ;->֫(Ll/۫ۗۡ;)V

    return-void
.end method

.method public ֫(Ll/۫ۗۡ;)V
    .locals 2

    .line 29
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Method must be overridden in ["

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "] if ever called"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public abstract ֫(Ljava/lang/Object;Ljava/lang/Object;)Z
.end method

.method public ۧ()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public ۧ(Ljava/lang/String;)V
    .locals 1

    .line 14
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {p1, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p1

    .line 15
    array-length v0, p1

    invoke-virtual {p0, v0, p1}, Ll/ۖ᩹ۢ;->֫(I[B)V

    return-void
.end method

.method public ۧ(Ll/ۗۗۡ;)V
    .locals 2

    .line 17
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Method must be overridden in ["

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "] if ever called"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public abstract ܽ()V
.end method

.method public abstract ܿ()V
.end method

.method public abstract ᩳ()V
.end method
