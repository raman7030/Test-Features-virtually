.class public final Ll/ܰ᩶;
.super Ljava/lang/Object;
.source "374"


# instance fields
.field public ֫:Ll/ۙ۬;

.field public ۧ:Z

.field public ܳ:Ljava/lang/String;

.field public ܽ:Z

.field public ܿ:Ljava/lang/CharSequence;

.field public ᩳ:Ljava/lang/String;


# direct methods
.method public static ֫(Landroid/os/PersistableBundle;)Ll/ܰ᩶;
    .locals 0

    .line 72
    invoke-static {p0}, Ll/ۨ᩶;->֫(Landroid/os/PersistableBundle;)Ll/ܰ᩶;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    .line 234
    :cond_0
    instance-of v1, p1, Ll/ܰ᩶;

    if-nez v1, :cond_1

    return v0

    .line 238
    :cond_1
    check-cast p1, Ll/ܰ᩶;

    .line 194
    iget-object v1, p0, Ll/ܰ᩶;->ᩳ:Ljava/lang/String;

    iget-object v2, p1, Ll/ܰ᩶;->ᩳ:Ljava/lang/String;

    if-nez v1, :cond_4

    if-eqz v2, :cond_2

    goto :goto_0

    .line 161
    :cond_2
    iget-object v1, p0, Ll/ܰ᩶;->ܿ:Ljava/lang/CharSequence;

    .line 248
    invoke-static {v1}, Ll/ۧ۫ᩴ;->toString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 161
    iget-object v2, p1, Ll/ܰ᩶;->ܿ:Ljava/lang/CharSequence;

    .line 249
    invoke-static {v2}, Ll/ۧ۫ᩴ;->toString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    .line 253
    invoke-static {v1, v2}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 185
    iget-object v1, p0, Ll/ܰ᩶;->ܳ:Ljava/lang/String;

    iget-object v2, p1, Ll/ܰ᩶;->ܳ:Ljava/lang/String;

    .line 254
    invoke-static {v1, v2}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 202
    iget-boolean v1, p0, Ll/ܰ᩶;->ۧ:Z

    .line 255
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    .line 202
    iget-boolean v2, p1, Ll/ܰ᩶;->ۧ:Z

    .line 255
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 210
    iget-boolean v1, p0, Ll/ܰ᩶;->ܽ:Z

    .line 256
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    .line 210
    iget-boolean p1, p1, Ll/ܰ᩶;->ܽ:Z

    .line 256
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    const/4 p1, 0x1

    return p1

    :cond_3
    return v0

    .line 244
    :cond_4
    :goto_0
    invoke-static {v1, v2}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final hashCode()I
    .locals 6

    .line 194
    iget-object v0, p0, Ll/ܰ᩶;->ᩳ:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 264
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    return v0

    .line 161
    :cond_0
    iget-object v0, p0, Ll/ܰ᩶;->ܿ:Ljava/lang/CharSequence;

    .line 185
    iget-object v1, p0, Ll/ܰ᩶;->ܳ:Ljava/lang/String;

    .line 202
    iget-boolean v2, p0, Ll/ܰ᩶;->ۧ:Z

    .line 268
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    .line 210
    iget-boolean v3, p0, Ll/ܰ᩶;->ܽ:Z

    .line 268
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    const/4 v4, 0x4

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    aput-object v0, v4, v5

    const/4 v0, 0x1

    aput-object v1, v4, v0

    const/4 v0, 0x2

    aput-object v2, v4, v0

    const/4 v0, 0x3

    aput-object v3, v4, v0

    invoke-static {v4}, Ll/ۧ۫ᩴ;->hash([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final ֫()Landroid/app/Person;
    .locals 1

    .line 152
    invoke-static {p0}, Ll/᩺᩶;->֫(Ll/ܰ᩶;)Landroid/app/Person;

    move-result-object v0

    return-object v0
.end method

.method public final ۧ()Landroid/os/PersistableBundle;
    .locals 1

    .line 135
    invoke-static {p0}, Ll/ۨ᩶;->֫(Ll/ܰ᩶;)Landroid/os/PersistableBundle;

    move-result-object v0

    return-object v0
.end method
