.class public final Ll/֫ۙۡ;
.super Ll/ܽۙۡ;
.source "A3Q2"


# instance fields
.field public final ֫:[Ljava/lang/String;

.field public final ۧ:I

.field public ܽ:I

.field public final ᩳ:I


# direct methods
.method public constructor <init>([Ljava/lang/String;I)V
    .locals 3

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 98
    iput-object p1, p0, Ll/֫ۙۡ;->֫:[Ljava/lang/String;

    .line 99
    iput p2, p0, Ll/֫ۙۡ;->ۧ:I

    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_0
    if-ge v0, p2, :cond_0

    .line 102
    aget-object v2, p1, v0

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    add-int/2addr v1, v2

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 104
    :cond_0
    iput v1, p0, Ll/֫ۙۡ;->ᩳ:I

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 6

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    if-eqz p1, :cond_5

    .line 118
    const-class v1, Ll/֫ۙۡ;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    if-ne v1, v2, :cond_5

    .line 119
    check-cast p1, Ll/֫ۙۡ;

    .line 120
    iget v1, p1, Ll/֫ۙۡ;->ۧ:I

    iget v2, p0, Ll/֫ۙۡ;->ۧ:I

    const/4 v3, 0x0

    if-ne v2, v1, :cond_4

    iget v1, p0, Ll/֫ۙۡ;->ᩳ:I

    iget v4, p1, Ll/֫ۙۡ;->ᩳ:I

    if-eq v1, v4, :cond_1

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_0
    if-ge v1, v2, :cond_3

    .line 124
    iget-object v4, p0, Ll/֫ۙۡ;->֫:[Ljava/lang/String;

    aget-object v4, v4, v1

    iget-object v5, p1, Ll/֫ۙۡ;->֫:[Ljava/lang/String;

    aget-object v5, v5, v1

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_2

    return v3

    :cond_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_3
    return v0

    :cond_4
    :goto_1
    return v3

    .line 118
    :cond_5
    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1
.end method

.method public final hashCode()I
    .locals 3

    .line 133
    iget v0, p0, Ll/֫ۙۡ;->ܽ:I

    if-nez v0, :cond_1

    .line 134
    iget v1, p0, Ll/֫ۙۡ;->ᩳ:I

    if-lez v1, :cond_1

    const/4 v1, 0x0

    .line 135
    :goto_0
    iget v2, p0, Ll/֫ۙۡ;->ۧ:I

    if-ge v1, v2, :cond_0

    .line 136
    iget-object v2, p0, Ll/֫ۙۡ;->֫:[Ljava/lang/String;

    aget-object v2, v2, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 137
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    add-int/2addr v0, v2

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 139
    :cond_0
    iput v0, p0, Ll/֫ۙۡ;->ܽ:I

    :cond_1
    return v0
.end method

.method public final ֫()Ljava/lang/String;
    .locals 3

    .line 146
    new-instance v0, Ljava/lang/StringBuilder;

    iget v1, p0, Ll/֫ۙۡ;->ᩳ:I

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const/4 v1, 0x0

    .line 147
    :goto_0
    iget v2, p0, Ll/֫ۙۡ;->ۧ:I

    if-ge v1, v2, :cond_0

    .line 148
    iget-object v2, p0, Ll/֫ۙۡ;->֫:[Ljava/lang/String;

    aget-object v2, v2, v1

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 150
    :cond_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
