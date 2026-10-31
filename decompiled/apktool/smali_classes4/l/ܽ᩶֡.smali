.class public abstract Ll/ܽ᩶֡;
.super Ll/֫᩶֡;
.source "85GM"


# instance fields
.field public ۧ:Ll/ۚۙ֡;


# direct methods
.method public constructor <init>(Ll/ۗ᩶֡;Ll/᩻᩶֡;[BI)V
    .locals 0

    .line 49
    invoke-direct {p0, p2}, Ll/֫᩶֡;-><init>(Ll/᩻᩶֡;)V

    .line 51
    invoke-virtual {p0, p4, p3}, Ll/ܽ᩶֡;->֫(I[B)I

    move-result p3

    .line 70
    sget-object p4, Ll/ۧ᩶֡;->֫:[I

    iget-object p2, p2, Ll/᩻᩶֡;->ۙ:Ll/ۜ᩶֡;

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result p2

    aget p2, p4, p2

    const/4 p4, 0x1

    if-eq p2, p4, :cond_3

    const/4 p4, 0x2

    if-eq p2, p4, :cond_2

    const/4 p4, 0x3

    if-eq p2, p4, :cond_1

    const/4 p4, 0x4

    if-eq p2, p4, :cond_0

    return-void

    .line 81
    :cond_0
    iget-object p1, p1, Ll/ۗ᩶֡;->᩵:Ll/֡ۙ֡;

    invoke-virtual {p1, p3}, Ll/֡ۙ֡;->ۧ(I)Ll/ۚۙ֡;

    move-result-object p1

    iput-object p1, p0, Ll/ܽ᩶֡;->ۧ:Ll/ۚۙ֡;

    return-void

    .line 78
    :cond_1
    iget-object p1, p1, Ll/ۗ᩶֡;->֡:Ll/֡ۙ֡;

    invoke-virtual {p1, p3}, Ll/֡ۙ֡;->ۧ(I)Ll/ۚۙ֡;

    move-result-object p1

    iput-object p1, p0, Ll/ܽ᩶֡;->ۧ:Ll/ۚۙ֡;

    return-void

    .line 75
    :cond_2
    iget-object p1, p1, Ll/ۗ᩶֡;->ۖ:Ll/֡ۙ֡;

    invoke-virtual {p1, p3}, Ll/֡ۙ֡;->ۧ(I)Ll/ۚۙ֡;

    move-result-object p1

    iput-object p1, p0, Ll/ܽ᩶֡;->ۧ:Ll/ۚۙ֡;

    return-void

    .line 72
    :cond_3
    iget-object p1, p1, Ll/ۗ᩶֡;->ۢ:Ll/֡ۙ֡;

    invoke-virtual {p1, p3}, Ll/֡ۙ֡;->ۧ(I)Ll/ۚۙ֡;

    move-result-object p1

    iput-object p1, p0, Ll/ܽ᩶֡;->ۧ:Ll/ۚۙ֡;

    return-void
.end method

.method public constructor <init>(Ll/᩻᩶֡;Ll/ۚۙ֡;)V
    .locals 3

    .line 43
    invoke-direct {p0, p1}, Ll/֫᩶֡;-><init>(Ll/᩻᩶֡;)V

    .line 44
    iput-object p2, p0, Ll/ܽ᩶֡;->ۧ:Ll/ۚۙ֡;

    .line 87
    sget-object p2, Ll/ۧ᩶֡;->֫:[I

    iget-object v0, p1, Ll/᩻᩶֡;->ۙ:Ll/ۜ᩶֡;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget p2, p2, v0

    const/4 v0, 0x1

    const-string v1, " is the wrong item type for opcode "

    if-eq p2, v0, :cond_7

    const/4 v0, 0x2

    if-eq p2, v0, :cond_5

    const/4 v0, 0x3

    if-eq p2, v0, :cond_3

    const/4 v0, 0x4

    if-eq p2, v0, :cond_1

    .line 113
    iget-object p2, p0, Ll/ܽ᩶֡;->ۧ:Ll/ۚۙ֡;

    if-nez p2, :cond_0

    goto/16 :goto_0

    .line 114
    :cond_0
    new-instance p2, Ljava/lang/RuntimeException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Ll/ܽ᩶֡;->ۧ:Ll/ۚۙ֡;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " is invalid for opcode "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p1, Ll/᩻᩶֡;->᩶:Ljava/lang/String;

    const-string v1, ". This opcode does not reference an item"

    .line 0
    invoke-static {v0, p1, v1}, Ll/ۡᩳۢ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 114
    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p2

    .line 107
    :cond_1
    iget-object p2, p0, Ll/ܽ᩶֡;->ۧ:Ll/ۚۙ֡;

    instance-of p2, p2, Ll/ۨۙ֡;

    if-eqz p2, :cond_2

    goto/16 :goto_0

    .line 108
    :cond_2
    new-instance p2, Ljava/lang/RuntimeException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Ll/ܽ᩶֡;->ۧ:Ll/ۚۙ֡;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p1, Ll/᩻᩶֡;->᩶:Ljava/lang/String;

    const-string v1, ". Expecting StringIdItem."

    .line 0
    invoke-static {v0, p1, v1}, Ll/ۡᩳۢ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 108
    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p2

    .line 101
    :cond_3
    iget-object p2, p0, Ll/ܽ᩶֡;->ۧ:Ll/ۚۙ֡;

    instance-of p2, p2, Ll/᩺ۙ֡;

    if-eqz p2, :cond_4

    goto :goto_0

    .line 102
    :cond_4
    new-instance p2, Ljava/lang/RuntimeException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Ll/ܽ᩶֡;->ۧ:Ll/ۚۙ֡;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p1, Ll/᩻᩶֡;->᩶:Ljava/lang/String;

    const-string v1, ". Expecting TypeIdItem."

    .line 0
    invoke-static {v0, p1, v1}, Ll/ۡᩳۢ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 102
    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p2

    .line 95
    :cond_5
    iget-object p2, p0, Ll/ܽ᩶֡;->ۧ:Ll/ۚۙ֡;

    instance-of p2, p2, Ll/᩹ۙ֡;

    if-eqz p2, :cond_6

    goto :goto_0

    .line 96
    :cond_6
    new-instance p2, Ljava/lang/RuntimeException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Ll/ܽ᩶֡;->ۧ:Ll/ۚۙ֡;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p1, Ll/᩻᩶֡;->᩶:Ljava/lang/String;

    const-string v1, ". Expecting MethodIdItem."

    .line 0
    invoke-static {v0, p1, v1}, Ll/ۡᩳۢ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 96
    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p2

    .line 89
    :cond_7
    iget-object p2, p0, Ll/ܽ᩶֡;->ۧ:Ll/ۚۙ֡;

    instance-of p2, p2, Ll/ᩴۙ֡;

    if-eqz p2, :cond_8

    :goto_0
    return-void

    .line 90
    :cond_8
    new-instance p2, Ljava/lang/RuntimeException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Ll/ܽ᩶֡;->ۧ:Ll/ۚۙ֡;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p1, Ll/᩻᩶֡;->᩶:Ljava/lang/String;

    const-string v1, ". Expecting FieldIdItem."

    .line 0
    invoke-static {v0, p1, v1}, Ll/ۡᩳۢ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 90
    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p2
.end method


# virtual methods
.method public ֫(I[B)I
    .locals 0

    add-int/lit8 p1, p1, 0x2

    .line 56
    invoke-static {p1, p2}, Ll/ۨܺܺ;->ܽ(I[B)I

    move-result p1

    return p1
.end method

.method public final ֫(Ll/ۚۙ֡;)V
    .locals 0

    .line 65
    iput-object p1, p0, Ll/ܽ᩶֡;->ۧ:Ll/ۚۙ֡;

    return-void
.end method

.method public final ۡ()Ll/ۚۙ֡;
    .locals 1

    .line 60
    iget-object v0, p0, Ll/ܽ᩶֡;->ۧ:Ll/ۚۙ֡;

    return-object v0
.end method
