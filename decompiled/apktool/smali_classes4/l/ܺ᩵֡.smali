.class public final Ll/ܺ᩵֡;
.super Ljava/lang/Object;
.source "590L"


# instance fields
.field public final ֫:Z

.field public final ۧ:Z

.field public final ܳ:I

.field public final ܽ:Ljava/util/ArrayList;

.field public ܿ:Ll/ܺ᩵֡;

.field public final ᩳ:C

.field public ᩻:Ll/ܺ᩵֡;


# direct methods
.method public constructor <init>(Ljava/util/ArrayList;CZZLl/ܺ᩵֡;)V
    .locals 0

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    iput-object p1, p0, Ll/ܺ᩵֡;->ܽ:Ljava/util/ArrayList;

    .line 30
    iput-char p2, p0, Ll/ܺ᩵֡;->ᩳ:C

    .line 31
    iput-boolean p3, p0, Ll/ܺ᩵֡;->ۧ:Z

    .line 32
    iput-boolean p4, p0, Ll/ܺ᩵֡;->֫:Z

    .line 33
    iput-object p5, p0, Ll/ܺ᩵֡;->᩻:Ll/ܺ᩵֡;

    .line 34
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    iput p1, p0, Ll/ܺ᩵֡;->ܳ:I

    return-void
.end method


# virtual methods
.method public final ֫(I)Ljava/util/List;
    .locals 4

    const/4 v0, 0x1

    .line 79
    iget-object v1, p0, Ll/ܺ᩵֡;->ܽ:Ljava/util/ArrayList;

    if-lt p1, v0, :cond_0

    .line 49
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-gt p1, v0, :cond_0

    const/4 v0, 0x0

    .line 84
    invoke-virtual {v1, v0, p1}, Ljava/util/ArrayList;->subList(II)Ljava/util/List;

    move-result-object p1

    return-object p1

    .line 80
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "length must be between 1 and "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 49
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    .line 81
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", was "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ֫()Z
    .locals 1

    .line 44
    iget-boolean v0, p0, Ll/ܺ᩵֡;->֫:Z

    return v0
.end method

.method public final ۧ(I)Ljava/util/List;
    .locals 4

    const/4 v0, 0x1

    .line 69
    iget-object v1, p0, Ll/ܺ᩵֡;->ܽ:Ljava/util/ArrayList;

    if-lt p1, v0, :cond_0

    .line 49
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-gt p1, v0, :cond_0

    .line 74
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v0

    sub-int/2addr v0, p1

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result p1

    invoke-virtual {v1, v0, p1}, Ljava/util/ArrayList;->subList(II)Ljava/util/List;

    move-result-object p1

    return-object p1

    .line 70
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "length must be between 1 and "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 49
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    .line 71
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", was "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ۧ()Z
    .locals 1

    .line 39
    iget-boolean v0, p0, Ll/ܺ᩵֡;->ۧ:Z

    return v0
.end method

.method public final ܽ()Ll/۬ۚ֡;
    .locals 2

    .line 59
    iget-object v0, p0, Ll/ܺ᩵֡;->ܽ:Ljava/util/ArrayList;

    const/4 v1, 0x1

    .line 0
    invoke-static {v0, v1}, Ll/ᩴۛ֫;->֫(Ljava/util/ArrayList;I)Ljava/lang/Object;

    move-result-object v0

    .line 59
    check-cast v0, Ll/۬ۚ֡;

    return-object v0
.end method

.method public final ᩳ()I
    .locals 1

    .line 54
    iget v0, p0, Ll/ܺ᩵֡;->ܳ:I

    return v0
.end method
