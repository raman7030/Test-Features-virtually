.class public final Ll/᩹֫ᩳ;
.super Ljava/lang/Object;
.source "S7JE"


# instance fields
.field public ֫:[Ll/᩸᩻ܽ;

.field public ۧ:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;[Ll/᩸᩻ܽ;)V
    .locals 0

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    iput-object p1, p0, Ll/᩹֫ᩳ;->ۧ:Ljava/lang/String;

    .line 36
    iput-object p2, p0, Ll/᩹֫ᩳ;->֫:[Ll/᩸᩻ܽ;

    return-void
.end method

.method public constructor <init>(Ll/ۗ᩻ܽ;)V
    .locals 1

    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 40
    invoke-interface {p1}, Ll/ۗ᩻ܽ;->getValue()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/᩹֫ᩳ;->ۧ:Ljava/lang/String;

    .line 41
    invoke-interface {p1}, Ll/ۗ᩻ܽ;->᩶֫()[Ll/᩸᩻ܽ;

    move-result-object p1

    iput-object p1, p0, Ll/᩹֫ᩳ;->֫:[Ll/᩸᩻ܽ;

    return-void
.end method

.method public static ֫(Ljava/lang/String;)Ll/᩹֫ᩳ;
    .locals 5

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return-object v0

    :cond_0
    const-string v1, "&"

    .line 24
    invoke-virtual {p0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_1

    const-string v1, "<"

    invoke-virtual {p0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 25
    new-instance v1, Ll/᩹֫ᩳ;

    invoke-direct {v1, p0, v0}, Ll/᩹֫ᩳ;-><init>(Ljava/lang/String;[Ll/᩸᩻ܽ;)V

    return-object v1

    .line 27
    :cond_1
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "<string>"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "</string>"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const/4 v1, 0x0

    invoke-static {p0, v1}, Ll/᩵ۘܽ;->֫(Ljava/lang/String;Z)Ll/᩵ۘܽ;

    move-result-object p0

    .line 28
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 29
    new-instance v3, Ljava/util/LinkedList;

    invoke-direct {v3}, Ljava/util/LinkedList;-><init>()V

    .line 30
    invoke-virtual {p0}, Ll/᩵ۘܽ;->ۜ()Ljava/util/ArrayList;

    move-result-object p0

    invoke-static {p0, v2, v3}, Ll/ۨܳܽ;->֫(Ljava/util/ArrayList;Ljava/lang/StringBuilder;Ljava/util/LinkedList;)V

    .line 31
    new-instance p0, Ll/᩹֫ᩳ;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_2

    goto :goto_0

    :cond_2
    new-array v0, v1, [Ll/᩸᩻ܽ;

    invoke-virtual {v3, v0}, Ljava/util/LinkedList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ll/᩸᩻ܽ;

    :goto_0
    invoke-direct {p0, v2, v0}, Ll/᩹֫ᩳ;-><init>(Ljava/lang/String;[Ll/᩸᩻ܽ;)V

    return-object p0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    .line 92
    instance-of v0, p1, Ll/᩹֫ᩳ;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p1, Ll/᩹֫ᩳ;

    .line 94
    iget-object v0, p0, Ll/᩹֫ᩳ;->ۧ:Ljava/lang/String;

    iget-object v2, p1, Ll/᩹֫ᩳ;->ۧ:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/᩹֫ᩳ;->֫:[Ll/᩸᩻ܽ;

    iget-object p1, p1, Ll/᩹֫ᩳ;->֫:[Ll/᩸᩻ܽ;

    invoke-static {v0, p1}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    return v1
.end method

.method public final hashCode()I
    .locals 2

    .line 99
    iget-object v0, p0, Ll/᩹֫ᩳ;->ۧ:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    .line 100
    iget-object v1, p0, Ll/᩹֫ᩳ;->֫:[Ll/᩸᩻ܽ;

    invoke-static {v1}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final ֫()[Ll/᩸᩻ܽ;
    .locals 1

    .line 87
    iget-object v0, p0, Ll/᩹֫ᩳ;->֫:[Ll/᩸᩻ܽ;

    return-object v0
.end method

.method public final ۧ()Ljava/lang/String;
    .locals 1

    .line 83
    iget-object v0, p0, Ll/᩹֫ᩳ;->ۧ:Ljava/lang/String;

    return-object v0
.end method

.method public final ܽ()Ljava/lang/String;
    .locals 5

    .line 45
    iget-object v0, p0, Ll/᩹֫ᩳ;->ۧ:Ljava/lang/String;

    iget-object v1, p0, Ll/᩹֫ᩳ;->֫:[Ll/᩸᩻ܽ;

    if-eqz v1, :cond_1

    array-length v2, v1

    if-nez v2, :cond_0

    goto :goto_0

    .line 50
    :cond_0
    new-instance v2, Ll/᩺ۖܽ;

    invoke-direct {v2}, Ll/᩺ۖܽ;-><init>()V

    .line 51
    new-instance v3, Ll/ۧۘܽ;

    const/4 v4, 0x0

    invoke-direct {v3, v4}, Ll/ۧۘܽ;-><init>(Z)V

    .line 52
    invoke-virtual {v3, v2}, Ll/ۧۘܽ;->setOutput(Ljava/io/Writer;)V

    .line 53
    new-instance v4, Ll/᩸֫ᩳ;

    invoke-direct {v4, v3}, Ll/᩸֫ᩳ;-><init>(Ll/ۧۘܽ;)V

    .line 75
    :try_start_0
    invoke-static {v4, v0, v1}, Ll/ۢܳܽ;->֫(Ll/ܰܿܽ;Ljava/lang/String;[Ll/᩸᩻ܽ;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 79
    invoke-virtual {v2}, Ll/᩺ۖܽ;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :catch_0
    move-exception v0

    .line 77
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1

    :cond_1
    :goto_0
    const-string v1, "&"

    const-string v2, "&amp;"

    .line 46
    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    const-string v1, ">"

    const-string v2, "&gt;"

    .line 47
    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "<"

    const-string v2, "&lt;"

    .line 48
    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
