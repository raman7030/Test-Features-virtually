.class public final Ll/۬᩶ۖ;
.super Ll/ۨ᩶ۖ;
.source "J58K"


# instance fields
.field public ۖ:Ll/֨᩶ۚ;

.field public ۡ:I

.field public ܺ:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 39
    sget-object v0, Ll/۟᩶ۖ;->ۤ:Ll/۟᩶ۖ;

    invoke-direct {p0, v0}, Ll/ۨ᩶ۖ;-><init>(Ll/۟᩶ۖ;)V

    const/4 v0, -0x1

    .line 34
    iput v0, p0, Ll/۬᩶ۖ;->ۡ:I

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    .line 68
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 69
    invoke-virtual {p0}, Ll/۬᩶ۖ;->᩻()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    iget-object v1, p0, Ll/۬᩶ۖ;->ܺ:Ljava/util/ArrayList;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-lez v1, :cond_0

    const-string v1, " // "

    .line 72
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/۬᩶ۖ;->ܺ:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 74
    :cond_0
    iget v1, p0, Ll/۬᩶ۖ;->ۡ:I

    if-ltz v1, :cond_1

    const-string v1, " // line "

    .line 75
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ll/۬᩶ۖ;->ۡ:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 77
    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic ֫(Ll/֨᩹ۖ;)Ll/֫ۙۖ;
    .locals 0

    .line 31
    invoke-virtual {p0, p1}, Ll/۬᩶ۖ;->֫(Ll/֨᩹ۖ;)Ll/۬᩶ۖ;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ll/֨᩹ۖ;)Ll/۬᩶ۖ;
    .locals 4

    .line 44
    invoke-virtual {p1, p0}, Ll/֨᩹ۖ;->֫(Ll/۬᩶ۖ;)Ll/۬᩶ۖ;

    move-result-object v0

    .line 45
    iget-object v1, p0, Ll/۬᩶ۖ;->ܺ:Ljava/util/ArrayList;

    if-eqz v1, :cond_0

    iget-object v1, v0, Ll/۬᩶ۖ;->ܺ:Ljava/util/ArrayList;

    if-nez v1, :cond_0

    .line 46
    new-instance v1, Ljava/util/ArrayList;

    iget-object v2, p0, Ll/۬᩶ۖ;->ܺ:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v1, v0, Ll/۬᩶ۖ;->ܺ:Ljava/util/ArrayList;

    .line 47
    iget-object v1, p0, Ll/۬᩶ۖ;->ܺ:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩸᩶ۖ;

    .line 48
    iget-object v3, v0, Ll/۬᩶ۖ;->ܺ:Ljava/util/ArrayList;

    invoke-virtual {v2, p1}, Ll/᩸᩶ۖ;->֫(Ll/֨᩹ۖ;)Ll/֫ۙۖ;

    move-result-object v2

    check-cast v2, Ll/᩸᩶ۖ;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public final ᩻()Ljava/lang/String;
    .locals 3

    .line 58
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    .line 59
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    const-string v0, "L%08x"

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
