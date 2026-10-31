.class public final Ll/֫ۘ᩻;
.super Ljava/lang/Object;
.source "F7U3"


# instance fields
.field public final ֫:Ljava/lang/String;

.field public final ۜ:I

.field public final ۧ:Ljava/lang/String;

.field public final ܳ:Z

.field public final ܽ:Ljava/lang/String;

.field public final ܿ:Z

.field public final ᩳ:Ljava/lang/String;

.field public final ᩻:Ljava/lang/String;


# direct methods
.method public constructor <init>(ILl/۬ۖ᩻;)V
    .locals 0

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    iput p1, p0, Ll/֫ۘ᩻;->ۜ:I

    .line 32
    iget-object p1, p2, Ll/۬ۖ᩻;->֫֫:Ljava/lang/String;

    iput-object p1, p0, Ll/֫ۘ᩻;->֫:Ljava/lang/String;

    .line 33
    iget-object p1, p2, Ll/۬ۖ᩻;->ܳ֫:Ljava/lang/String;

    iput-object p1, p0, Ll/֫ۘ᩻;->᩻:Ljava/lang/String;

    .line 34
    iget-object p1, p2, Ll/۬ۖ᩻;->ᩳ֫:Ljava/lang/String;

    iput-object p1, p0, Ll/֫ۘ᩻;->ᩳ:Ljava/lang/String;

    .line 35
    iget-object p1, p2, Ll/۬ۖ᩻;->ۧ֫:Ljava/lang/String;

    iput-object p1, p0, Ll/֫ۘ᩻;->ۧ:Ljava/lang/String;

    .line 36
    iget-object p1, p2, Ll/۬ۖ᩻;->ܽ֫:Ljava/lang/String;

    iput-object p1, p0, Ll/֫ۘ᩻;->ܽ:Ljava/lang/String;

    .line 37
    iget-boolean p1, p2, Ll/۬ۖ᩻;->ܿ֫:Z

    iput-boolean p1, p0, Ll/֫ۘ᩻;->ܳ:Z

    .line 38
    iget p1, p2, Ll/۬ۖ᩻;->᩻֫:I

    const/4 p2, 0x5

    if-ne p1, p2, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-boolean p1, p0, Ll/֫ۘ᩻;->ܿ:Z

    return-void
.end method

.method public static ֫(ILl/ۗ᩻᩻;)Ll/֫ۘ᩻;
    .locals 1

    .line 23
    instance-of v0, p1, Ll/۬ۖ᩻;

    if-eqz v0, :cond_0

    check-cast p1, Ll/۬ۖ᩻;

    .line 24
    new-instance v0, Ll/֫ۘ᩻;

    invoke-direct {v0, p0, p1}, Ll/֫ۘ᩻;-><init>(ILl/۬ۖ᩻;)V

    return-object v0

    .line 26
    :cond_0
    new-instance p0, Ljava/lang/RuntimeException;

    invoke-direct {p0}, Ljava/lang/RuntimeException;-><init>()V

    throw p0
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

    .line 61
    const-class v2, Ll/֫ۘ᩻;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_0

    .line 63
    :cond_1
    check-cast p1, Ll/֫ۘ᩻;

    .line 64
    iget v2, p0, Ll/֫ۘ᩻;->ۜ:I

    iget v3, p1, Ll/֫ۘ᩻;->ۜ:I

    if-ne v2, v3, :cond_2

    iget-object v2, p0, Ll/֫ۘ᩻;->֫:Ljava/lang/String;

    iget-object v3, p1, Ll/֫ۘ᩻;->֫:Ljava/lang/String;

    .line 65
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Ll/֫ۘ᩻;->᩻:Ljava/lang/String;

    iget-object v3, p1, Ll/֫ۘ᩻;->᩻:Ljava/lang/String;

    .line 66
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Ll/֫ۘ᩻;->ᩳ:Ljava/lang/String;

    iget-object v3, p1, Ll/֫ۘ᩻;->ᩳ:Ljava/lang/String;

    .line 67
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Ll/֫ۘ᩻;->ۧ:Ljava/lang/String;

    iget-object v3, p1, Ll/֫ۘ᩻;->ۧ:Ljava/lang/String;

    .line 68
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Ll/֫ۘ᩻;->ܽ:Ljava/lang/String;

    iget-object v3, p1, Ll/֫ۘ᩻;->ܽ:Ljava/lang/String;

    .line 69
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-boolean v2, p0, Ll/֫ۘ᩻;->ܳ:Z

    iget-boolean v3, p1, Ll/֫ۘ᩻;->ܳ:Z

    if-ne v2, v3, :cond_2

    iget-boolean v2, p0, Ll/֫ۘ᩻;->ܿ:Z

    iget-boolean p1, p1, Ll/֫ۘ᩻;->ܿ:Z

    if-ne v2, p1, :cond_2

    return v0

    :cond_2
    :goto_0
    return v1
.end method

.method public final hashCode()I
    .locals 3

    .line 77
    iget v0, p0, Ll/֫ۘ᩻;->ۜ:I

    const/16 v1, 0x1f

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Ll/֫ۘ᩻;->֫:Ljava/lang/String;

    .line 0
    invoke-static {v0, v1, v2}, Ll/ۧ۬֫;->֫(IILjava/lang/String;)I

    move-result v0

    .line 78
    iget-object v2, p0, Ll/֫ۘ᩻;->᩻:Ljava/lang/String;

    .line 0
    invoke-static {v0, v1, v2}, Ll/ۧ۬֫;->֫(IILjava/lang/String;)I

    move-result v0

    .line 79
    iget-object v2, p0, Ll/֫ۘ᩻;->ᩳ:Ljava/lang/String;

    .line 0
    invoke-static {v0, v1, v2}, Ll/ۧ۬֫;->֫(IILjava/lang/String;)I

    move-result v0

    .line 80
    iget-object v2, p0, Ll/֫ۘ᩻;->ۧ:Ljava/lang/String;

    .line 0
    invoke-static {v0, v1, v2}, Ll/ۧ۬֫;->֫(IILjava/lang/String;)I

    move-result v0

    .line 81
    iget-object v2, p0, Ll/֫ۘ᩻;->ܽ:Ljava/lang/String;

    .line 0
    invoke-static {v0, v1, v2}, Ll/ۧ۬֫;->֫(IILjava/lang/String;)I

    move-result v0

    .line 82
    iget-boolean v1, p0, Ll/֫ۘ᩻;->ܳ:Z

    const/16 v2, 0x4d5

    if-eqz v1, :cond_0

    const/16 v1, 0x4cf

    goto :goto_0

    :cond_0
    const/16 v1, 0x4d5

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 83
    iget-boolean v1, p0, Ll/֫ۘ᩻;->ܿ:Z

    if-eqz v1, :cond_1

    const/16 v2, 0x4cf

    :cond_1
    add-int/2addr v0, v2

    return v0
.end method

.method public final ֫()Ljava/net/URI;
    .locals 4

    .line 43
    iget-object v0, p0, Ll/֫ۘ᩻;->ܽ:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    return-object v2

    .line 47
    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v1

    const-string v3, "http://"

    .line 48
    invoke-virtual {v1, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_1

    const-string v3, "https://"

    invoke-virtual {v1, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 49
    invoke-virtual {v3, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 52
    :cond_1
    :try_start_0
    new-instance v1, Ljava/net/URI;

    invoke-direct {v1, v0}, Ljava/net/URI;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/net/URISyntaxException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v1

    :catch_0
    return-object v2
.end method
