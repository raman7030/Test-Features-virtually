.class public final Ll/ܽ᩵ܺ;
.super Ll/ܿ᩵ܺ;
.source "AB81"


# instance fields
.field public final ۧ:[Ljava/lang/String;

.field public final ܽ:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V
    .locals 0

    .line 208
    invoke-direct {p0, p1}, Ll/ܿ᩵ܺ;-><init>(Ljava/lang/String;)V

    .line 209
    iput-object p2, p0, Ll/ܽ᩵ܺ;->ܽ:Ljava/lang/String;

    .line 210
    iput-object p3, p0, Ll/ܽ᩵ܺ;->ۧ:[Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    .line 277
    :cond_0
    instance-of v1, p1, Ll/ܽ᩵ܺ;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    .line 281
    :cond_1
    check-cast p1, Ll/ܽ᩵ܺ;

    .line 282
    iget-object v1, p0, Ll/ܽ᩵ܺ;->ܽ:Ljava/lang/String;

    iget-object v3, p1, Ll/ܽ᩵ܺ;->ܽ:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Ll/ܿ᩵ܺ;->֫:Ljava/lang/String;

    iget-object v3, p1, Ll/ܿ᩵ܺ;->֫:Ljava/lang/String;

    .line 283
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Ll/ܽ᩵ܺ;->ۧ:[Ljava/lang/String;

    iget-object p1, p1, Ll/ܽ᩵ܺ;->ۧ:[Ljava/lang/String;

    .line 284
    invoke-static {v1, p1}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    return v0

    :cond_2
    return v2
.end method

.method public final hashCode()I
    .locals 3

    .line 289
    iget-object v0, p0, Ll/ܽ᩵ܺ;->ܽ:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x11

    iget-object v1, p0, Ll/ܿ᩵ܺ;->֫:Ljava/lang/String;

    const/16 v2, 0x1f

    .line 0
    invoke-static {v0, v2, v1}, Ll/ۧ۬֫;->֫(IILjava/lang/String;)I

    move-result v0

    .line 290
    iget-object v1, p0, Ll/ܽ᩵ܺ;->ۧ:[Ljava/lang/String;

    .line 291
    invoke-static {v1}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 297
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Ll/ܽ᩵ܺ;->ܽ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x20

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ܿ᩵ܺ;->֫:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x28

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ܽ᩵ܺ;->ۧ:[Ljava/lang/String;

    const/16 v2, 0x2c

    invoke-static {v1, v2}, Ll/ۢܺ֡;->֫([Ljava/lang/Object;C)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ljava/lang/String;)Ll/ܿ᩵ܺ;
    .locals 3

    .line 264
    new-instance v0, Ll/ܽ᩵ܺ;

    iget-object v1, p0, Ll/ܽ᩵ܺ;->ܽ:Ljava/lang/String;

    iget-object v2, p0, Ll/ܽ᩵ܺ;->ۧ:[Ljava/lang/String;

    invoke-direct {v0, p1, v1, v2}, Ll/ܽ᩵ܺ;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V

    return-object v0
.end method

.method public final ֫()Ll/ᩳ᩵ܺ;
    .locals 1

    .line 269
    sget-object v0, Ll/ᩳ᩵ܺ;->᩶:Ll/ᩳ᩵ܺ;

    return-object v0
.end method
