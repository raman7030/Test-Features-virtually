.class public final Ll/֡᩶ۚ;
.super Ljava/lang/Object;
.source "S578"


# instance fields
.field public final ֫:Ljava/lang/String;

.field public final ۧ:Z

.field public final ܽ:Ljava/lang/String;

.field public final ܿ:I

.field public final ᩳ:Ljava/lang/String;


# direct methods
.method public constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 0

    .line 98
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 99
    iput p1, p0, Ll/֡᩶ۚ;->ܿ:I

    .line 100
    iput-object p2, p0, Ll/֡᩶ۚ;->ᩳ:Ljava/lang/String;

    .line 101
    iput-object p3, p0, Ll/֡᩶ۚ;->ܽ:Ljava/lang/String;

    .line 102
    iput-object p4, p0, Ll/֡᩶ۚ;->֫:Ljava/lang/String;

    .line 103
    iput-boolean p5, p0, Ll/֡᩶ۚ;->ۧ:Z

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    .line 160
    :cond_0
    instance-of v1, p1, Ll/֡᩶ۚ;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    .line 163
    :cond_1
    check-cast p1, Ll/֡᩶ۚ;

    .line 164
    iget v1, p0, Ll/֡᩶ۚ;->ܿ:I

    iget v3, p1, Ll/֡᩶ۚ;->ܿ:I

    if-ne v1, v3, :cond_2

    iget-boolean v1, p0, Ll/֡᩶ۚ;->ۧ:Z

    iget-boolean v3, p1, Ll/֡᩶ۚ;->ۧ:Z

    if-ne v1, v3, :cond_2

    iget-object v1, p0, Ll/֡᩶ۚ;->ᩳ:Ljava/lang/String;

    iget-object v3, p1, Ll/֡᩶ۚ;->ᩳ:Ljava/lang/String;

    .line 166
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Ll/֡᩶ۚ;->ܽ:Ljava/lang/String;

    iget-object v3, p1, Ll/֡᩶ۚ;->ܽ:Ljava/lang/String;

    .line 167
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Ll/֡᩶ۚ;->֫:Ljava/lang/String;

    iget-object p1, p1, Ll/֡᩶ۚ;->֫:Ljava/lang/String;

    .line 168
    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    return v0

    :cond_2
    return v2
.end method

.method public final hashCode()I
    .locals 3

    .line 174
    iget-boolean v0, p0, Ll/֡᩶ۚ;->ۧ:Z

    if-eqz v0, :cond_0

    const/16 v0, 0x40

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iget v1, p0, Ll/֡᩶ۚ;->ܿ:I

    add-int/2addr v1, v0

    iget-object v0, p0, Ll/֡᩶ۚ;->ᩳ:Ljava/lang/String;

    .line 175
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    iget-object v2, p0, Ll/֡᩶ۚ;->ܽ:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    mul-int v2, v2, v0

    iget-object v0, p0, Ll/֡᩶ۚ;->֫:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int v0, v0, v2

    add-int/2addr v0, v1

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 188
    iget-boolean v0, p0, Ll/֡᩶ۚ;->ۧ:Z

    if-eqz v0, :cond_0

    const-string v0, " itf"

    goto :goto_0

    :cond_0
    const-string v0, ""

    .line 0
    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Ll/֡᩶ۚ;->ᩳ:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Ll/֡᩶ۚ;->ܽ:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Ll/֡᩶ۚ;->֫:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " ("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Ll/֡᩶ۚ;->ܿ:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()Ljava/lang/String;
    .locals 1

    .line 143
    iget-object v0, p0, Ll/֡᩶ۚ;->֫:Ljava/lang/String;

    return-object v0
.end method

.method public final ۧ()Ljava/lang/String;
    .locals 1

    .line 134
    iget-object v0, p0, Ll/֡᩶ۚ;->ܽ:Ljava/lang/String;

    return-object v0
.end method

.method public final ܽ()Ljava/lang/String;
    .locals 1

    .line 125
    iget-object v0, p0, Ll/֡᩶ۚ;->ᩳ:Ljava/lang/String;

    return-object v0
.end method

.method public final ܿ()Z
    .locals 1

    .line 152
    iget-boolean v0, p0, Ll/֡᩶ۚ;->ۧ:Z

    return v0
.end method

.method public final ᩳ()I
    .locals 1

    .line 115
    iget v0, p0, Ll/֡᩶ۚ;->ܿ:I

    return v0
.end method
