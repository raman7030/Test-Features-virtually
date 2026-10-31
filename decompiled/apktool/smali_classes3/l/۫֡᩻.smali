.class public final Ll/۫֡᩻;
.super Ljava/lang/Object;
.source "Z9YI"


# instance fields
.field public final ֫:Ljava/lang/String;

.field public final ۧ:Ljava/lang/String;

.field public final ܳ:Ljava/lang/String;

.field public final ܽ:Ljava/lang/String;

.field public final ܿ:I

.field public final ᩳ:Ljava/lang/String;

.field public final ᩻:I


# direct methods
.method public constructor <init>(ILl/᩻֡᩻;)V
    .locals 0

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    iput p1, p0, Ll/۫֡᩻;->᩻:I

    .line 24
    iget-object p1, p2, Ll/᩻֡᩻;->ۧ֫:Ljava/lang/String;

    iput-object p1, p0, Ll/۫֡᩻;->ۧ:Ljava/lang/String;

    .line 25
    iget p1, p2, Ll/᩻֡᩻;->ᩳ֫:I

    iput p1, p0, Ll/۫֡᩻;->ܿ:I

    .line 26
    iget-object p1, p2, Ll/᩻֡᩻;->֫֫:Ljava/lang/String;

    iput-object p1, p0, Ll/۫֡᩻;->֫:Ljava/lang/String;

    .line 27
    iget-object p1, p2, Ll/᩻֡᩻;->ܿ֫:Ljava/lang/String;

    iput-object p1, p0, Ll/۫֡᩻;->ܳ:Ljava/lang/String;

    .line 28
    iget-object p1, p2, Ll/᩻֡᩻;->ܽ֫:Ljava/lang/String;

    iput-object p1, p0, Ll/۫֡᩻;->ᩳ:Ljava/lang/String;

    .line 29
    iget-object p1, p2, Ll/ۗ᩻᩻;->۬:Ljava/lang/String;

    iput-object p1, p0, Ll/۫֡᩻;->ܽ:Ljava/lang/String;

    return-void
.end method

.method public static ֫(ILl/ۗ᩻᩻;)Ll/۫֡᩻;
    .locals 1

    .line 15
    instance-of v0, p1, Ll/᩻֡᩻;

    if-eqz v0, :cond_0

    .line 16
    new-instance v0, Ll/۫֡᩻;

    check-cast p1, Ll/᩻֡᩻;

    invoke-direct {v0, p0, p1}, Ll/۫֡᩻;-><init>(ILl/᩻֡᩻;)V

    return-object v0

    .line 18
    :cond_0
    new-instance p0, Ljava/lang/RuntimeException;

    invoke-direct {p0}, Ljava/lang/RuntimeException;-><init>()V

    throw p0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 v0, 0x0

    if-eqz p1, :cond_7

    .line 35
    const-class v1, Ll/۫֡᩻;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    if-eq v1, v2, :cond_1

    goto :goto_0

    .line 37
    :cond_1
    check-cast p1, Ll/۫֡᩻;

    .line 39
    iget v1, p0, Ll/۫֡᩻;->᩻:I

    iget v2, p1, Ll/۫֡᩻;->᩻:I

    if-eq v1, v2, :cond_2

    return v0

    .line 40
    :cond_2
    iget v1, p0, Ll/۫֡᩻;->ܿ:I

    iget v2, p1, Ll/۫֡᩻;->ܿ:I

    if-eq v1, v2, :cond_3

    return v0

    .line 41
    :cond_3
    iget-object v1, p0, Ll/۫֡᩻;->ۧ:Ljava/lang/String;

    iget-object v2, p1, Ll/۫֡᩻;->ۧ:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v0

    .line 42
    :cond_4
    iget-object v1, p0, Ll/۫֡᩻;->֫:Ljava/lang/String;

    iget-object v2, p1, Ll/۫֡᩻;->֫:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v0

    .line 43
    :cond_5
    iget-object v1, p0, Ll/۫֡᩻;->ܳ:Ljava/lang/String;

    iget-object v2, p1, Ll/۫֡᩻;->ܳ:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v0

    .line 44
    :cond_6
    iget-object v0, p0, Ll/۫֡᩻;->ᩳ:Ljava/lang/String;

    iget-object p1, p1, Ll/۫֡᩻;->ᩳ:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_7
    :goto_0
    return v0
.end method

.method public final hashCode()I
    .locals 3

    .line 50
    iget v0, p0, Ll/۫֡᩻;->᩻:I

    const/16 v1, 0x1f

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Ll/۫֡᩻;->ۧ:Ljava/lang/String;

    .line 0
    invoke-static {v0, v1, v2}, Ll/ۧ۬֫;->֫(IILjava/lang/String;)I

    move-result v0

    .line 51
    iget v2, p0, Ll/۫֡᩻;->ܿ:I

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    .line 52
    iget-object v2, p0, Ll/۫֡᩻;->֫:Ljava/lang/String;

    .line 0
    invoke-static {v0, v1, v2}, Ll/ۧ۬֫;->֫(IILjava/lang/String;)I

    move-result v0

    .line 53
    iget-object v2, p0, Ll/۫֡᩻;->ܳ:Ljava/lang/String;

    .line 0
    invoke-static {v0, v1, v2}, Ll/ۧ۬֫;->֫(IILjava/lang/String;)I

    move-result v0

    .line 54
    iget-object v1, p0, Ll/۫֡᩻;->ᩳ:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method
