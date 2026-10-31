.class public final Ll/ܽۧۘ;
.super Ljava/lang/Object;
.source "F9EF"


# instance fields
.field public final ֫:Ljava/lang/String;

.field public final ۧ:Ljava/lang/String;

.field public final ܽ:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    iput-object p2, p0, Ll/ܽۧۘ;->ܽ:Ljava/lang/String;

    .line 36
    iput-object p1, p0, Ll/ܽۧۘ;->֫:Ljava/lang/String;

    .line 37
    invoke-static {p3}, Ll/ܽۧۘ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ll/ܽۧۘ;->ۧ:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ll/ܽۧۘ;Ljava/lang/String;)V
    .locals 1

    .line 55
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 56
    iget-object v0, p1, Ll/ܽۧۘ;->֫:Ljava/lang/String;

    iput-object v0, p0, Ll/ܽۧۘ;->֫:Ljava/lang/String;

    .line 57
    iget-object v0, p1, Ll/ܽۧۘ;->ܽ:Ljava/lang/String;

    invoke-static {v0}, Ll/ۗᩳۘ;->ᩳ(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 58
    iget-object v0, p1, Ll/ܽۧۘ;->ܽ:Ljava/lang/String;

    iput-object v0, p0, Ll/ܽۧۘ;->ܽ:Ljava/lang/String;

    .line 62
    iget-object v0, p1, Ll/ܽۧۘ;->ۧ:Ljava/lang/String;

    invoke-static {v0}, Ll/ۗᩳۘ;->ᩳ(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 63
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object p1, p1, Ll/ܽۧۘ;->ۧ:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "\\"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p2}, Ll/ܽۧۘ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ll/ܽۧۘ;->ۧ:Ljava/lang/String;

    return-void

    .line 65
    :cond_0
    invoke-static {p2}, Ll/ܽۧۘ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ll/ܽۧۘ;->ۧ:Ljava/lang/String;

    return-void

    .line 60
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Can only make child SmbPath of fully specified SmbPath"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static ֫(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 41
    invoke-static {p0}, Ll/ۗᩳۘ;->ᩳ(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/16 v0, 0x2f

    const/16 v1, 0x5c

    .line 42
    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object p0

    const/4 v0, 0x0

    .line 43
    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    if-ne v0, v1, :cond_1

    .line 44
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v2, 0x1

    if-le v0, v2, :cond_0

    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v0

    if-ne v0, v1, :cond_0

    const/4 v0, 0x2

    .line 45
    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 47
    :cond_0
    invoke-virtual {p0, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    :cond_1
    return-object p0
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

    .line 106
    const-class v2, Ll/ܽۧۘ;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_0

    .line 107
    :cond_1
    check-cast p1, Ll/ܽۧۘ;

    .line 108
    iget-object v2, p0, Ll/ܽۧۘ;->֫:Ljava/lang/String;

    iget-object v3, p1, Ll/ܽۧۘ;->֫:Ljava/lang/String;

    invoke-static {v2, v3}, Ll/᩶ۗ֡;->֫(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Ll/ܽۧۘ;->ܽ:Ljava/lang/String;

    iget-object v3, p1, Ll/ܽۧۘ;->ܽ:Ljava/lang/String;

    .line 109
    invoke-static {v2, v3}, Ll/᩶ۗ֡;->֫(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Ll/ܽۧۘ;->ۧ:Ljava/lang/String;

    iget-object p1, p1, Ll/ܽۧۘ;->ۧ:Ljava/lang/String;

    .line 110
    invoke-static {v2, p1}, Ll/᩶ۗ֡;->֫(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    return v0

    :cond_2
    :goto_0
    return v1
.end method

.method public final hashCode()I
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    .line 115
    iget-object v2, p0, Ll/ܽۧۘ;->֫:Ljava/lang/String;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    iget-object v2, p0, Ll/ܽۧۘ;->ܽ:Ljava/lang/String;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    iget-object v2, p0, Ll/ܽۧۘ;->ۧ:Ljava/lang/String;

    aput-object v2, v0, v1

    .line 30
    invoke-static {v0}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 87
    invoke-virtual {p0}, Ll/ܽۧۘ;->ᩳ()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()Ljava/lang/String;
    .locals 1

    .line 119
    iget-object v0, p0, Ll/ܽۧۘ;->֫:Ljava/lang/String;

    return-object v0
.end method

.method public final ֫(Ll/ܽۧۘ;)Z
    .locals 1

    .line 144
    iget-object v0, p0, Ll/ܽۧۘ;->֫:Ljava/lang/String;

    iget-object p1, p1, Ll/ܽۧۘ;->֫:Ljava/lang/String;

    invoke-static {v0, p1}, Ll/᩶ۗ֡;->֫(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ۧ()Ljava/lang/String;
    .locals 1

    .line 127
    iget-object v0, p0, Ll/ܽۧۘ;->ۧ:Ljava/lang/String;

    return-object v0
.end method

.method public final ۧ(Ll/ܽۧۘ;)Z
    .locals 1

    .line 148
    invoke-virtual {p0, p1}, Ll/ܽۧۘ;->֫(Ll/ܽۧۘ;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/ܽۧۘ;->ܽ:Ljava/lang/String;

    iget-object p1, p1, Ll/ܽۧۘ;->ܽ:Ljava/lang/String;

    invoke-static {v0, p1}, Ll/᩶ۗ֡;->֫(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ܽ()Ljava/lang/String;
    .locals 1

    .line 123
    iget-object v0, p0, Ll/ܽۧۘ;->ܽ:Ljava/lang/String;

    return-object v0
.end method

.method public final ᩳ()Ljava/lang/String;
    .locals 5

    .line 70
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "\\\\"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 71
    iget-object v1, p0, Ll/ܽۧۘ;->֫:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    iget-object v1, p0, Ll/ܽۧۘ;->ܽ:Ljava/lang/String;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_1

    const/4 v2, 0x0

    .line 74
    invoke-virtual {v1, v2}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/16 v3, 0x5c

    const-string v4, "\\"

    if-eq v2, v3, :cond_0

    .line 75
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    :cond_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    iget-object v1, p0, Ll/ܽۧۘ;->ۧ:Ljava/lang/String;

    invoke-static {v1}, Ll/ۗᩳۘ;->ᩳ(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 79
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
