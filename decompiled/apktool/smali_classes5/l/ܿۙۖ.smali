.class public final Ll/ܿۙۖ;
.super Ll/᩹᩶ۖ;
.source "T5S8"


# instance fields
.field public ۘ:I


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 34
    sget-object v0, Ll/۟᩶ۖ;->ܽ֫:Ll/۟᩶ۖ;

    const/4 v1, 0x0

    .line 30
    invoke-direct {p0, v0, v1}, Ll/᩺᩶ۖ;-><init>(Ll/۟᩶ۖ;Ll/۠᩶ۖ;)V

    return-void
.end method

.method public constructor <init>(Ll/۠᩶ۖ;I[Ll/۬᩶ۖ;Ll/۬᩶ۖ;)V
    .locals 1

    .line 38
    sget-object v0, Ll/۟᩶ۖ;->ܽ֫:Ll/۟᩶ۖ;

    .line 30
    invoke-direct {p0, v0, p1}, Ll/᩺᩶ۖ;-><init>(Ll/۟᩶ۖ;Ll/۠᩶ۖ;)V

    .line 39
    iput p2, p0, Ll/ܿۙۖ;->ۘ:I

    .line 40
    iput-object p3, p0, Ll/᩹᩶ۖ;->ۖ:[Ll/۬᩶ۖ;

    .line 41
    iput-object p4, p0, Ll/᩹᩶ۖ;->ܺ:Ll/۬᩶ۖ;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 3

    .line 55
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "switch("

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/᩺᩶ۖ;->ۡ:Ll/۠᩶ۖ;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ") {"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v1, 0x0

    .line 57
    :goto_0
    iget-object v2, p0, Ll/᩹᩶ۖ;->ۖ:[Ll/۬᩶ۖ;

    array-length v2, v2

    if-ge v1, v2, :cond_0

    const-string v2, "\n case "

    .line 58
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Ll/ܿۙۖ;->ۘ:I

    add-int/2addr v2, v1

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ": GOTO "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Ll/᩹᩶ۖ;->ۖ:[Ll/۬᩶ۖ;

    aget-object v2, v2, v1

    invoke-virtual {v2}, Ll/۬᩶ۖ;->᩻()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ";"

    .line 59
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    const-string v1, "\n default : GOTO "

    .line 61
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/᩹᩶ۖ;->ܺ:Ll/۬᩶ۖ;

    invoke-virtual {v1}, Ll/۬᩶ۖ;->᩻()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ";\n}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/֨᩹ۖ;)Ll/֫ۙۖ;
    .locals 4

    .line 46
    iget-object v0, p0, Ll/᩹᩶ۖ;->ۖ:[Ll/۬᩶ۖ;

    array-length v0, v0

    new-array v1, v0, [Ll/۬᩶ۖ;

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_0

    .line 48
    iget-object v3, p0, Ll/᩹᩶ۖ;->ۖ:[Ll/۬᩶ۖ;

    aget-object v3, v3, v2

    invoke-virtual {p1, v3}, Ll/֨᩹ۖ;->֫(Ll/۬᩶ۖ;)Ll/۬᩶ۖ;

    move-result-object v3

    aput-object v3, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 50
    :cond_0
    new-instance v0, Ll/ܿۙۖ;

    iget-object v2, p0, Ll/᩺᩶ۖ;->ۡ:Ll/۠᩶ۖ;

    invoke-virtual {v2, p1}, Ll/۠᩶ۖ;->֫(Ll/֨᩹ۖ;)Ll/۠᩶ۖ;

    move-result-object v2

    iget-object v3, p0, Ll/᩹᩶ۖ;->ܺ:Ll/۬᩶ۖ;

    invoke-virtual {p1, v3}, Ll/֨᩹ۖ;->֫(Ll/۬᩶ۖ;)Ll/۬᩶ۖ;

    move-result-object p1

    iget v3, p0, Ll/ܿۙۖ;->ۘ:I

    invoke-direct {v0, v2, v3, v1, p1}, Ll/ܿۙۖ;-><init>(Ll/۠᩶ۖ;I[Ll/۬᩶ۖ;Ll/۬᩶ۖ;)V

    return-object v0
.end method
