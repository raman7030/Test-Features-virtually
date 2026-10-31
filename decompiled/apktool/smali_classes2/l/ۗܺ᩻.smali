.class public final Ll/ۗܺ᩻;
.super Ljava/lang/Object;
.source "MAHH"


# instance fields
.field public final ֫:Ljava/lang/String;

.field public final ۜ:Z

.field public final ۡ:I

.field public final ۢ:Ljava/lang/String;

.field public final ۧ:Z

.field public final ܳ:Ljava/lang/String;

.field public final ܽ:Ljava/lang/String;

.field public final ܿ:Z

.field public final ᩳ:Ljava/lang/String;

.field public final ᩷:I

.field public final ᩻:I


# direct methods
.method public constructor <init>(ILl/֫ܺ᩻;)V
    .locals 1

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    iput p1, p0, Ll/ۗܺ᩻;->ۡ:I

    const/4 p1, 0x0

    .line 35
    iput p1, p0, Ll/ۗܺ᩻;->᩷:I

    .line 36
    iget-object v0, p2, Ll/֫ܺ᩻;->ۧ֫:Ljava/lang/String;

    iput-object v0, p0, Ll/ۗܺ᩻;->ܽ:Ljava/lang/String;

    .line 37
    iget v0, p2, Ll/֫ܺ᩻;->ܿ֫:I

    iput v0, p0, Ll/ۗܺ᩻;->᩻:I

    .line 38
    iget-object v0, p2, Ll/֫ܺ᩻;->ܳ֫:Ljava/lang/String;

    iput-object v0, p0, Ll/ۗܺ᩻;->ۢ:Ljava/lang/String;

    .line 39
    iget-object v0, p2, Ll/֫ܺ᩻;->ᩳ֫:Ljava/lang/String;

    iput-object v0, p0, Ll/ۗܺ᩻;->ܳ:Ljava/lang/String;

    .line 40
    iget-object v0, p2, Ll/ۗ᩻᩻;->۬:Ljava/lang/String;

    iput-object v0, p0, Ll/ۗܺ᩻;->ᩳ:Ljava/lang/String;

    .line 41
    iget-object v0, p2, Ll/֫ܺ᩻;->֫֫:Ljava/lang/String;

    iput-object v0, p0, Ll/ۗܺ᩻;->֫:Ljava/lang/String;

    .line 42
    iget-boolean p2, p2, Ll/֫ܺ᩻;->ܽ֫:Z

    iput-boolean p2, p0, Ll/ۗܺ᩻;->ܿ:Z

    const/4 p2, 0x1

    .line 43
    iput-boolean p2, p0, Ll/ۗܺ᩻;->ۧ:Z

    .line 44
    iput-boolean p1, p0, Ll/ۗܺ᩻;->ۜ:Z

    return-void
.end method

.method public constructor <init>(ILl/ۜܺ᩻;)V
    .locals 0

    .line 47
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 48
    iput p1, p0, Ll/ۗܺ᩻;->ۡ:I

    const/4 p1, 0x1

    .line 49
    iput p1, p0, Ll/ۗܺ᩻;->᩷:I

    .line 50
    iget-object p1, p2, Ll/ۜܺ᩻;->ܽ֫:Ljava/lang/String;

    iput-object p1, p0, Ll/ۗܺ᩻;->ܽ:Ljava/lang/String;

    .line 51
    iget p1, p2, Ll/ۜܺ᩻;->ܳ֫:I

    iput p1, p0, Ll/ۗܺ᩻;->᩻:I

    .line 52
    iget-object p1, p2, Ll/ۜܺ᩻;->ۜ֫:Ljava/lang/String;

    iput-object p1, p0, Ll/ۗܺ᩻;->ۢ:Ljava/lang/String;

    .line 53
    iget-object p1, p2, Ll/ۜܺ᩻;->ܿ֫:Ljava/lang/String;

    iput-object p1, p0, Ll/ۗܺ᩻;->ܳ:Ljava/lang/String;

    .line 54
    iget-object p1, p2, Ll/ۗ᩻᩻;->۬:Ljava/lang/String;

    iput-object p1, p0, Ll/ۗܺ᩻;->ᩳ:Ljava/lang/String;

    .line 55
    iget-object p1, p2, Ll/ۜܺ᩻;->֫֫:Ljava/lang/String;

    iput-object p1, p0, Ll/ۗܺ᩻;->֫:Ljava/lang/String;

    .line 56
    iget-boolean p1, p2, Ll/ۜܺ᩻;->ᩳ֫:Z

    iput-boolean p1, p0, Ll/ۗܺ᩻;->ܿ:Z

    .line 57
    iget-boolean p1, p2, Ll/ۜܺ᩻;->ۧ֫:Z

    iput-boolean p1, p0, Ll/ۗܺ᩻;->ۧ:Z

    .line 58
    iget-boolean p1, p2, Ll/ۜܺ᩻;->᩻֫:Z

    iput-boolean p1, p0, Ll/ۗܺ᩻;->ۜ:Z

    return-void
.end method

.method public static ֫(ILl/ۗ᩻᩻;)Ll/ۗܺ᩻;
    .locals 1

    .line 24
    instance-of v0, p1, Ll/֫ܺ᩻;

    if-eqz v0, :cond_0

    check-cast p1, Ll/֫ܺ᩻;

    .line 25
    new-instance v0, Ll/ۗܺ᩻;

    invoke-direct {v0, p0, p1}, Ll/ۗܺ᩻;-><init>(ILl/֫ܺ᩻;)V

    return-object v0

    .line 26
    :cond_0
    instance-of v0, p1, Ll/ۜܺ᩻;

    if-eqz v0, :cond_1

    check-cast p1, Ll/ۜܺ᩻;

    .line 27
    new-instance v0, Ll/ۗܺ᩻;

    invoke-direct {v0, p0, p1}, Ll/ۗܺ᩻;-><init>(ILl/ۜܺ᩻;)V

    return-object v0

    .line 29
    :cond_1
    new-instance p0, Ljava/lang/RuntimeException;

    invoke-direct {p0}, Ljava/lang/RuntimeException;-><init>()V

    throw p0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    goto :goto_0

    :cond_0
    if-eqz p1, :cond_2

    .line 76
    const-class v0, Ll/ۗܺ᩻;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    if-eq v0, v1, :cond_1

    goto :goto_1

    .line 77
    :cond_1
    check-cast p1, Ll/ۗܺ᩻;

    .line 78
    iget v0, p0, Ll/ۗܺ᩻;->ۡ:I

    iget v1, p1, Ll/ۗܺ᩻;->ۡ:I

    if-ne v0, v1, :cond_2

    iget v0, p0, Ll/ۗܺ᩻;->᩷:I

    iget v1, p1, Ll/ۗܺ᩻;->᩷:I

    if-ne v0, v1, :cond_2

    iget v0, p0, Ll/ۗܺ᩻;->᩻:I

    iget v1, p1, Ll/ۗܺ᩻;->᩻:I

    if-ne v0, v1, :cond_2

    iget-boolean v0, p0, Ll/ۗܺ᩻;->ܿ:Z

    iget-boolean v1, p1, Ll/ۗܺ᩻;->ܿ:Z

    if-ne v0, v1, :cond_2

    iget-boolean v0, p0, Ll/ۗܺ᩻;->ۧ:Z

    iget-boolean v1, p1, Ll/ۗܺ᩻;->ۧ:Z

    if-ne v0, v1, :cond_2

    iget-boolean v0, p0, Ll/ۗܺ᩻;->ۜ:Z

    iget-boolean v1, p1, Ll/ۗܺ᩻;->ۜ:Z

    if-ne v0, v1, :cond_2

    iget-object v0, p0, Ll/ۗܺ᩻;->ܽ:Ljava/lang/String;

    iget-object v1, p1, Ll/ۗܺ᩻;->ܽ:Ljava/lang/String;

    .line 84
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Ll/ۗܺ᩻;->ۢ:Ljava/lang/String;

    iget-object v1, p1, Ll/ۗܺ᩻;->ۢ:Ljava/lang/String;

    .line 85
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Ll/ۗܺ᩻;->ܳ:Ljava/lang/String;

    iget-object v1, p1, Ll/ۗܺ᩻;->ܳ:Ljava/lang/String;

    .line 86
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Ll/ۗܺ᩻;->֫:Ljava/lang/String;

    iget-object p1, p1, Ll/ۗܺ᩻;->֫:Ljava/lang/String;

    .line 87
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    :goto_0
    const/4 p1, 0x1

    return p1

    :cond_2
    :goto_1
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 8

    .line 92
    iget v0, p0, Ll/ۗܺ᩻;->ۡ:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget v1, p0, Ll/ۗܺ᩻;->᩷:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iget v2, p0, Ll/ۗܺ᩻;->᩻:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iget-boolean v3, p0, Ll/ۗܺ᩻;->ܿ:Z

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    iget-boolean v4, p0, Ll/ۗܺ᩻;->ۧ:Z

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    iget-boolean v5, p0, Ll/ۗܺ᩻;->ۜ:Z

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    const/16 v6, 0xa

    new-array v6, v6, [Ljava/lang/Object;

    const/4 v7, 0x0

    aput-object v0, v6, v7

    const/4 v0, 0x1

    aput-object v1, v6, v0

    const/4 v0, 0x2

    iget-object v1, p0, Ll/ۗܺ᩻;->ܽ:Ljava/lang/String;

    aput-object v1, v6, v0

    const/4 v0, 0x3

    aput-object v2, v6, v0

    const/4 v0, 0x4

    iget-object v1, p0, Ll/ۗܺ᩻;->ۢ:Ljava/lang/String;

    aput-object v1, v6, v0

    const/4 v0, 0x5

    iget-object v1, p0, Ll/ۗܺ᩻;->ܳ:Ljava/lang/String;

    aput-object v1, v6, v0

    const/4 v0, 0x6

    iget-object v1, p0, Ll/ۗܺ᩻;->֫:Ljava/lang/String;

    aput-object v1, v6, v0

    const/4 v0, 0x7

    aput-object v3, v6, v0

    const/16 v0, 0x8

    aput-object v4, v6, v0

    const/16 v0, 0x9

    aput-object v5, v6, v0

    invoke-static {v6}, Ll/ۧ۫ᩴ;->hash([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method
