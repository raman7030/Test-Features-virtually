.class public final Ll/۬᩹֫;
.super Ljava/lang/Object;
.source "W8GP"


# instance fields
.field public final ֫:Ljava/lang/String;

.field public final ۧ:I

.field public final ܽ:Ll/۠ᩴ֫;

.field public final ܿ:I

.field public final ᩳ:Ll/۠ᩴ֫;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ll/۠ᩴ֫;Ll/۠ᩴ֫;II)V
    .locals 1

    .line 171
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p4, :cond_1

    if-nez p5, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 172
    :goto_1
    invoke-static {v0}, Ll/᩺֡֫;->֫(Z)V

    .line 191
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 173
    iput-object p1, p0, Ll/۬᩹֫;->֫:Ljava/lang/String;

    .line 155
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 174
    iput-object p2, p0, Ll/۬᩹֫;->ᩳ:Ll/۠ᩴ֫;

    .line 155
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 175
    iput-object p3, p0, Ll/۬᩹֫;->ܽ:Ll/۠ᩴ֫;

    .line 176
    iput p4, p0, Ll/۬᩹֫;->ܿ:I

    .line 177
    iput p5, p0, Ll/۬᩹֫;->ۧ:I

    return-void

    .line 192
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_2

    .line 185
    const-class v2, Ll/۬᩹֫;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_0

    .line 188
    :cond_1
    check-cast p1, Ll/۬᩹֫;

    .line 189
    iget v2, p0, Ll/۬᩹֫;->ܿ:I

    iget v3, p1, Ll/۬᩹֫;->ܿ:I

    if-ne v2, v3, :cond_2

    iget v2, p0, Ll/۬᩹֫;->ۧ:I

    iget v3, p1, Ll/۬᩹֫;->ۧ:I

    if-ne v2, v3, :cond_2

    iget-object v2, p0, Ll/۬᩹֫;->֫:Ljava/lang/String;

    iget-object v3, p1, Ll/۬᩹֫;->֫:Ljava/lang/String;

    .line 191
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Ll/۬᩹֫;->ᩳ:Ll/۠ᩴ֫;

    iget-object v3, p1, Ll/۬᩹֫;->ᩳ:Ll/۠ᩴ֫;

    .line 192
    invoke-virtual {v2, v3}, Ll/۠ᩴ֫;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Ll/۬᩹֫;->ܽ:Ll/۠ᩴ֫;

    iget-object p1, p1, Ll/۬᩹֫;->ܽ:Ll/۠ᩴ֫;

    .line 193
    invoke-virtual {v2, p1}, Ll/۠ᩴ֫;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    return v0

    :cond_2
    :goto_0
    return v1
.end method

.method public final hashCode()I
    .locals 3

    .line 199
    iget v0, p0, Ll/۬᩹֫;->ܿ:I

    add-int/lit16 v0, v0, 0x20f

    const/16 v1, 0x1f

    mul-int/lit8 v0, v0, 0x1f

    .line 200
    iget v2, p0, Ll/۬᩹֫;->ۧ:I

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    .line 201
    iget-object v2, p0, Ll/۬᩹֫;->֫:Ljava/lang/String;

    .line 0
    invoke-static {v0, v1, v2}, Ll/ۧ۬֫;->֫(IILjava/lang/String;)I

    move-result v0

    .line 202
    iget-object v1, p0, Ll/۬᩹֫;->ᩳ:Ll/۠ᩴ֫;

    invoke-virtual {v1}, Ll/۠ᩴ֫;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    .line 203
    iget-object v0, p0, Ll/۬᩹֫;->ܽ:Ll/۠ᩴ֫;

    invoke-virtual {v0}, Ll/۠ᩴ֫;->hashCode()I

    move-result v0

    add-int/2addr v0, v1

    return v0
.end method
