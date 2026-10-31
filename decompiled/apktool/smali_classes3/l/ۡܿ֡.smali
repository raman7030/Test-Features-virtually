.class public Ll/ۡܿ֡;
.super Ljava/lang/Object;
.source "I62U"


# instance fields
.field public ֫:Ljava/util/ArrayList;

.field public ۧ:I

.field public ܽ:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 46
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ۡܿ֡;->֫:Ljava/util/ArrayList;

    const/4 v0, 0x0

    .line 48
    iput v0, p0, Ll/ۡܿ֡;->ۧ:I

    const/4 v0, -0x1

    .line 49
    iput v0, p0, Ll/ۡܿ֡;->ܽ:I

    return-void
.end method


# virtual methods
.method public size()I
    .locals 2

    .line 68
    iget-object v0, p0, Ll/ۡܿ֡;->֫:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    iget v1, p0, Ll/ۡܿ֡;->ۧ:I

    sub-int/2addr v0, v1

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    .line 94
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 95
    invoke-virtual {p0}, Ll/ۡܿ֡;->size()I

    move-result v1

    const/4 v2, 0x0

    :cond_0
    :goto_0
    if-ge v2, v1, :cond_1

    .line 97
    invoke-virtual {p0, v2}, Ll/ۡܿ֡;->ᩳ(I)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    add-int/lit8 v2, v2, 0x1

    if-ge v2, v1, :cond_0

    const-string v3, " "

    .line 98
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 100
    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/᩹ܿ֡;)V
    .locals 1

    .line 66
    iget-object v0, p0, Ll/ۡܿ֡;->֫:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public ܿ()Ljava/lang/Object;
    .locals 5

    const/4 v0, 0x0

    .line 56
    invoke-virtual {p0, v0}, Ll/ۡܿ֡;->ᩳ(I)Ljava/lang/Object;

    move-result-object v1

    .line 57
    iget v2, p0, Ll/ۡܿ֡;->ۧ:I

    add-int/lit8 v2, v2, 0x1

    iput v2, p0, Ll/ۡܿ֡;->ۧ:I

    .line 59
    iget-object v3, p0, Ll/ۡܿ֡;->֫:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-ne v2, v4, :cond_0

    .line 52
    iput v0, p0, Ll/ۡܿ֡;->ۧ:I

    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V

    :cond_0
    return-object v1
.end method

.method public final ᩳ(I)Ljava/lang/Object;
    .locals 4

    .line 80
    iget v0, p0, Ll/ۡܿ֡;->ۧ:I

    add-int/2addr v0, p1

    .line 81
    iget-object p1, p0, Ll/ۡܿ֡;->֫:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v1

    const-string v2, "queue index "

    if-ge v0, v1, :cond_2

    if-ltz v0, :cond_1

    .line 87
    iget v1, p0, Ll/ۡܿ֡;->ܽ:I

    if-le v0, v1, :cond_0

    iput v0, p0, Ll/ۡܿ֡;->ܽ:I

    .line 88
    :cond_0
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    .line 85
    :cond_1
    new-instance p1, Ljava/util/NoSuchElementException;

    const-string v1, " < 0"

    .line 0
    invoke-static {v0, v2, v1}, Ll/ᩳ᩷ᩳ;->֫(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 85
    invoke-direct {p1, v0}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 82
    :cond_2
    new-instance v1, Ljava/util/NoSuchElementException;

    const-string v3, " > last index "

    .line 0
    invoke-static {v0, v2, v3}, Ll/۬᩵ᩳ;->֫(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 82
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    add-int/lit8 p1, p1, -0x1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw v1
.end method
