.class public final Ll/۫᩶ۖ;
.super Ll/᩹᩶ۖ;
.source "J5P4"


# instance fields
.field public ۘ:[I


# direct methods
.method public constructor <init>(Ll/۠᩶ۖ;[I[Ll/۬᩶ۖ;Ll/۬᩶ۖ;)V
    .locals 1

    .line 34
    sget-object v0, Ll/۟᩶ۖ;->ܰ:Ll/۟᩶ۖ;

    .line 30
    invoke-direct {p0, v0, p1}, Ll/᩺᩶ۖ;-><init>(Ll/۟᩶ۖ;Ll/۠᩶ۖ;)V

    .line 35
    iput-object p2, p0, Ll/۫᩶ۖ;->ۘ:[I

    .line 36
    iput-object p3, p0, Ll/᩹᩶ۖ;->ۖ:[Ll/۬᩶ۖ;

    .line 37
    iput-object p4, p0, Ll/᩹᩶ۖ;->ܺ:Ll/۬᩶ۖ;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 4

    .line 54
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "switch("

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/᩺᩶ۖ;->ۡ:Ll/۠᩶ۖ;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ") {"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v1, 0x0

    .line 56
    :goto_0
    iget-object v2, p0, Ll/۫᩶ۖ;->ۘ:[I

    array-length v3, v2

    if-ge v1, v3, :cond_0

    const-string v3, "\n case "

    .line 57
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    aget v2, v2, v1

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ": GOTO "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Ll/᩹᩶ۖ;->ۖ:[Ll/۬᩶ۖ;

    aget-object v2, v2, v1

    invoke-virtual {v2}, Ll/۬᩶ۖ;->᩻()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ";"

    .line 58
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    const-string v1, "\n default : GOTO "

    .line 60
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/᩹᩶ۖ;->ܺ:Ll/۬᩶ۖ;

    invoke-virtual {v1}, Ll/۬᩶ۖ;->᩻()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ";\n}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/֨᩹ۖ;)Ll/֫ۙۖ;
    .locals 5

    .line 42
    iget-object v0, p0, Ll/᩹᩶ۖ;->ۖ:[Ll/۬᩶ۖ;

    array-length v0, v0

    new-array v1, v0, [Ll/۬᩶ۖ;

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v0, :cond_0

    .line 44
    iget-object v4, p0, Ll/᩹᩶ۖ;->ۖ:[Ll/۬᩶ۖ;

    aget-object v4, v4, v3

    invoke-virtual {p1, v4}, Ll/֨᩹ۖ;->֫(Ll/۬᩶ۖ;)Ll/۬᩶ۖ;

    move-result-object v4

    aput-object v4, v1, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 46
    :cond_0
    iget-object v0, p0, Ll/۫᩶ۖ;->ۘ:[I

    array-length v3, v0

    new-array v4, v3, [I

    .line 47
    invoke-static {v0, v2, v4, v2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 49
    new-instance v0, Ll/۫᩶ۖ;

    iget-object v2, p0, Ll/᩺᩶ۖ;->ۡ:Ll/۠᩶ۖ;

    invoke-virtual {v2, p1}, Ll/۠᩶ۖ;->֫(Ll/֨᩹ۖ;)Ll/۠᩶ۖ;

    move-result-object v2

    iget-object v3, p0, Ll/᩹᩶ۖ;->ܺ:Ll/۬᩶ۖ;

    invoke-virtual {p1, v3}, Ll/֨᩹ۖ;->֫(Ll/۬᩶ۖ;)Ll/۬᩶ۖ;

    move-result-object p1

    invoke-direct {v0, v2, v4, v1, p1}, Ll/۫᩶ۖ;-><init>(Ll/۠᩶ۖ;[I[Ll/۬᩶ۖ;Ll/۬᩶ۖ;)V

    return-object v0
.end method
