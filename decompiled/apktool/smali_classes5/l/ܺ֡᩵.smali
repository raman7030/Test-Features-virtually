.class public final Ll/ܺ֡᩵;
.super Ljava/lang/Object;
.source "09TZ"

# interfaces
.implements Ll/ۙۡ᩵;


# instance fields
.field public ֫:I

.field public ۧ:Ljava/lang/String;

.field public ܽ:Ll/ܽ֡᩵;

.field public ᩳ:Z


# direct methods
.method public constructor <init>(Ll/ܽ֡᩵;I)V
    .locals 0

    .line 157
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 158
    iput-object p1, p0, Ll/ܺ֡᩵;->ܽ:Ll/ܽ֡᩵;

    .line 159
    iput p2, p0, Ll/ܺ֡᩵;->֫:I

    return-void
.end method

.method public constructor <init>(Ll/ܽ֡᩵;II)V
    .locals 0

    .line 166
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 173
    iput-object p1, p0, Ll/ܺ֡᩵;->ܽ:Ll/ܽ֡᩵;

    .line 174
    iput p2, p0, Ll/ܺ֡᩵;->֫:I

    const/4 p1, 0x1

    .line 182
    iput-boolean p1, p0, Ll/ܺ֡᩵;->ᩳ:Z

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    if-eqz p1, :cond_0

    .line 475
    instance-of v0, p1, Ll/ܺ֡᩵;

    if-eqz v0, :cond_0

    check-cast p1, Ll/ܺ֡᩵;

    iget p1, p1, Ll/ܺ֡᩵;->֫:I

    iget v0, p0, Ll/ܺ֡᩵;->֫:I

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 1

    .line 463
    iget v0, p0, Ll/ܺ֡᩵;->֫:I

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 485
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Ll/ܺ֡᩵;->ܽ:Ll/ܽ֡᩵;

    invoke-virtual {v1}, Ll/ܽ֡᩵;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ll/ܺ֡᩵;->֫()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()Ljava/lang/String;
    .locals 4

    .line 443
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget v1, p0, Ll/ܺ֡᩵;->֫:I

    ushr-int/lit8 v2, v1, 0x18

    and-int/lit16 v2, v2, 0xff

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "."

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    ushr-int/lit8 v3, v1, 0x10

    and-int/lit16 v3, v3, 0xff

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    ushr-int/lit8 v3, v1, 0x8

    and-int/lit16 v3, v3, 0xff

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    and-int/lit16 v1, v1, 0xff

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/ᩴۡ᩵;)Ljava/lang/String;
    .locals 5

    .line 250
    iget-object v0, p0, Ll/ܺ֡᩵;->ۧ:Ljava/lang/String;

    iget-object v1, p0, Ll/ܺ֡᩵;->ܽ:Ll/ܽ֡᩵;

    iget-object v1, v1, Ll/ܽ֡᩵;->ܽ:Ljava/lang/String;

    const-string v2, "*SMBSERVER     "

    if-ne v0, v1, :cond_0

    .line 251
    iput-object v2, p0, Ll/ܺ֡᩵;->ۧ:Ljava/lang/String;

    goto :goto_1

    .line 252
    :cond_0
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_4

    .line 256
    :try_start_0
    invoke-interface {p1}, Ll/ᩴۡ᩵;->ܽ()Ll/᩶ۡ᩵;

    move-result-object p1

    check-cast p1, Ll/ۢ֡᩵;

    .line 53
    invoke-virtual {p1, p0}, Ll/ۢ֡᩵;->֫(Ll/ܺ֡᩵;)[Ll/ܺ֡᩵;

    move-result-object p1

    .line 450
    iget-object v0, p0, Ll/ܺ֡᩵;->ܽ:Ll/ܽ֡᩵;

    iget v0, v0, Ll/ܽ֡᩵;->ۧ:I

    const/16 v2, 0x1d

    if-ne v0, v2, :cond_3

    const/4 v0, 0x0

    .line 258
    :goto_0
    array-length v2, p1

    if-ge v0, v2, :cond_2

    .line 259
    aget-object v2, p1, v0

    .line 450
    iget-object v3, v2, Ll/ܺ֡᩵;->ܽ:Ll/ܽ֡᩵;

    iget v3, v3, Ll/ܽ֡᩵;->ۧ:I

    const/16 v4, 0x20

    if-ne v3, v4, :cond_1

    .line 260
    invoke-virtual {v2}, Ll/ܺ֡᩵;->ۧ()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    return-object v1

    .line 264
    :cond_3
    iget-boolean p1, p0, Ll/ܺ֡᩵;->ᩳ:Z

    if-eqz p1, :cond_5

    .line 269
    iput-object v1, p0, Ll/ܺ֡᩵;->ۧ:Ljava/lang/String;

    .line 270
    invoke-virtual {p0}, Ll/ܺ֡᩵;->ۧ()Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catch Ljava/net/UnknownHostException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    .line 273
    :catch_0
    iput-object v1, p0, Ll/ܺ֡᩵;->ۧ:Ljava/lang/String;

    goto :goto_1

    .line 276
    :cond_4
    iput-object v1, p0, Ll/ܺ֡᩵;->ۧ:Ljava/lang/String;

    .line 279
    :cond_5
    :goto_1
    iget-object p1, p0, Ll/ܺ֡᩵;->ۧ:Ljava/lang/String;

    return-object p1
.end method

.method public final ֫(Ljava/lang/Class;)Ll/ۘۡ᩵;
    .locals 1

    .line 194
    const-class v0, Ll/ܺ֡᩵;

    invoke-virtual {p1, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result p1

    if-eqz p1, :cond_0

    return-object p0

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final ۧ()Ljava/lang/String;
    .locals 1

    .line 388
    iget-object v0, p0, Ll/ܺ֡᩵;->ܽ:Ll/ܽ֡᩵;

    invoke-virtual {v0}, Ll/ܽ֡᩵;->֫()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 389
    invoke-virtual {p0}, Ll/ܺ֡᩵;->֫()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 391
    :cond_0
    iget-object v0, p0, Ll/ܺ֡᩵;->ܽ:Ll/ܽ֡᩵;

    iget-object v0, v0, Ll/ܽ֡᩵;->ܽ:Ljava/lang/String;

    return-object v0
.end method

.method public final ܽ()I
    .locals 1

    .line 450
    iget-object v0, p0, Ll/ܺ֡᩵;->ܽ:Ll/ܽ֡᩵;

    iget v0, v0, Ll/ܽ֡᩵;->ۧ:I

    return v0
.end method

.method public final ᩳ()Ljava/lang/String;
    .locals 8

    .line 210
    iget-object v0, p0, Ll/ܺ֡᩵;->ܽ:Ll/ܽ֡᩵;

    iget-object v0, v0, Ll/ܽ֡᩵;->ܽ:Ljava/lang/String;

    iput-object v0, p0, Ll/ܺ֡᩵;->ۧ:Ljava/lang/String;

    const/4 v1, 0x0

    .line 212
    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v0

    invoke-static {v0}, Ljava/lang/Character;->isDigit(C)Z

    move-result v0

    const-string v2, "*SMBSERVER     "

    if-eqz v0, :cond_2

    .line 217
    iget-object v0, p0, Ll/ܺ֡᩵;->ۧ:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    .line 218
    iget-object v3, p0, Ll/ܺ֡᩵;->ۧ:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->toCharArray()[C

    move-result-object v3

    const/4 v4, 0x0

    :goto_0
    if-ge v1, v0, :cond_3

    add-int/lit8 v5, v1, 0x1

    .line 219
    aget-char v6, v3, v1

    invoke-static {v6}, Ljava/lang/Character;->isDigit(C)Z

    move-result v6

    if-eqz v6, :cond_3

    if-ne v5, v0, :cond_0

    const/4 v6, 0x3

    if-ne v4, v6, :cond_0

    .line 222
    iput-object v2, p0, Ll/ܺ֡᩵;->ۧ:Ljava/lang/String;

    goto :goto_1

    :cond_0
    if-ge v5, v0, :cond_1

    .line 225
    aget-char v6, v3, v5

    const/16 v7, 0x2e

    if-ne v6, v7, :cond_1

    add-int/lit8 v4, v4, 0x1

    add-int/lit8 v1, v1, 0x2

    goto :goto_0

    :cond_1
    move v1, v5

    goto :goto_0

    .line 231
    :cond_2
    iget-object v0, p0, Ll/ܺ֡᩵;->ܽ:Ll/ܽ֡᩵;

    iget v0, v0, Ll/ܽ֡᩵;->ۧ:I

    packed-switch v0, :pswitch_data_0

    goto :goto_1

    .line 235
    :pswitch_0
    iput-object v2, p0, Ll/ܺ֡᩵;->ۧ:Ljava/lang/String;

    .line 239
    :cond_3
    :goto_1
    iget-object v0, p0, Ll/ܺ֡᩵;->ۧ:Ljava/lang/String;

    return-object v0

    :pswitch_data_0
    .packed-switch 0x1b
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method
