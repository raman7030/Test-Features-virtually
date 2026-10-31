.class public final Ll/᩸ܺܺ;
.super Ll/ۛܺܺ;
.source "YBD4"


# static fields
.field public static final ᩶:[Ljava/lang/String;


# instance fields
.field public final ᩸:Ll/ܰۡܺ;

.field public final ᩹:I


# direct methods
.method public static constructor <clinit>()V
    .locals 9

    const-string v7, "invoke-direct"

    const-string v8, "invoke-interface"

    const-string v0, "static-put"

    const-string v1, "static-get"

    const-string v2, "instance-put"

    const-string v3, "instance-get"

    const-string v4, "invoke-static"

    const-string v5, "invoke-instance"

    const-string v6, "invoke-constructor"

    .line 37
    filled-new-array/range {v0 .. v8}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ll/᩸ܺܺ;->᩶:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(ILl/ܰۡܺ;)V
    .locals 0

    .line 82
    invoke-direct {p0}, Ll/ۛܺܺ;-><init>()V

    .line 83
    iput p1, p0, Ll/᩸ܺܺ;->᩹:I

    .line 84
    iput-object p2, p0, Ll/᩸ܺܺ;->᩸:Ll/ܰۡܺ;

    return-void
.end method

.method public static ֫(I)Ljava/lang/String;
    .locals 1

    .line 167
    sget-object v0, Ll/᩸ܺܺ;->᩶:[Ljava/lang/String;

    aget-object p0, v0, p0

    return-object p0
.end method

.method public static ֫(ILl/ܰۡܺ;)Ll/᩸ܺܺ;
    .locals 2

    const-string v0, "ref has wrong type: "

    if-eqz p0, :cond_1

    const/4 v1, 0x1

    if-eq p0, v1, :cond_1

    const/4 v1, 0x2

    if-eq p0, v1, :cond_1

    const/4 v1, 0x3

    if-eq p0, v1, :cond_1

    packed-switch p0, :pswitch_data_0

    .line 71
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "type is out of range: "

    .line 0
    invoke-static {p0, v0}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 71
    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 67
    :pswitch_0
    instance-of v1, p1, Ll/ܽܺܺ;

    if-eqz v1, :cond_0

    goto :goto_0

    .line 68
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 63
    :cond_1
    instance-of v1, p1, Ll/ۡܺܺ;

    if-eqz v1, :cond_2

    .line 73
    :goto_0
    new-instance v0, Ll/᩸ܺܺ;

    invoke-direct {v0, p0, p1}, Ll/᩸ܺܺ;-><init>(ILl/ܰۡܺ;)V

    return-object v0

    .line 64
    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    nop

    :pswitch_data_0
    .packed-switch 0x4
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final getType()Ll/۟ܺܺ;
    .locals 1

    .line 217
    sget-object v0, Ll/۟ܺܺ;->֨֫:Ll/۟ܺܺ;

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 196
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "method-handle{"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ll/᩸ܺܺ;->֫()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֡()Z
    .locals 1

    .line 157
    iget v0, p0, Ll/᩸ܺܺ;->᩹:I

    packed-switch v0, :pswitch_data_0

    const/4 v0, 0x0

    return v0

    :pswitch_0
    const/4 v0, 0x1

    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x4
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public final ֫()Ljava/lang/String;
    .locals 3

    .line 212
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget v1, p0, Ll/᩸ܺܺ;->᩹:I

    .line 167
    sget-object v2, Ll/᩸ܺܺ;->᩶:[Ljava/lang/String;

    aget-object v1, v2, v1

    .line 212
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ","

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/᩸ܺܺ;->᩸:Ll/ܰۡܺ;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫ۧ()I
    .locals 1

    .line 102
    iget v0, p0, Ll/᩸ܺܺ;->᩹:I

    return v0
.end method

.method public final ۧ(Ll/ܰۡܺ;)I
    .locals 2

    .line 183
    check-cast p1, Ll/᩸ܺܺ;

    .line 102
    iget v0, p1, Ll/᩸ܺܺ;->᩹:I

    .line 184
    iget v1, p0, Ll/᩸ܺܺ;->᩹:I

    if-ne v1, v0, :cond_0

    .line 93
    iget-object v0, p0, Ll/᩸ܺܺ;->᩸:Ll/ܰۡܺ;

    iget-object p1, p1, Ll/᩸ܺܺ;->᩸:Ll/ܰۡܺ;

    .line 185
    invoke-virtual {v0, p1}, Ll/ܰۡܺ;->֫(Ll/ܰۡܺ;)I

    move-result p1

    return p1

    .line 187
    :cond_0
    invoke-static {v1, v0}, Ljava/lang/Integer;->compare(II)I

    move-result p1

    return p1
.end method

.method public final ۧ()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final ܺ()Ll/ܰۡܺ;
    .locals 1

    .line 93
    iget-object v0, p0, Ll/᩸ܺܺ;->᩸:Ll/ܰۡܺ;

    return-object v0
.end method

.method public final ᩴ()Z
    .locals 3

    .line 112
    iget v0, p0, Ll/᩸ܺܺ;->᩹:I

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    if-eq v0, v1, :cond_0

    const/4 v2, 0x2

    if-eq v0, v2, :cond_0

    const/4 v2, 0x3

    if-eq v0, v2, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    return v1
.end method

.method public final ᩻()Ljava/lang/String;
    .locals 1

    const-string v0, "method handle"

    return-object v0
.end method
