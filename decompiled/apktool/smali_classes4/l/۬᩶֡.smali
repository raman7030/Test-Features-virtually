.class public final Ll/۬᩶֡;
.super Ll/ۚۙ֡;
.source "556V"


# instance fields
.field public ۗ:I

.field public ۙ:Ll/ۛ᩶֡;


# direct methods
.method public constructor <init>(Ll/ۗ᩶֡;)V
    .locals 0

    .line 46
    invoke-direct {p0, p1}, Ll/ۚۙ֡;-><init>(Ll/ۗ᩶֡;)V

    const/4 p1, 0x0

    .line 36
    iput p1, p0, Ll/۬᩶֡;->ۗ:I

    return-void
.end method

.method public static ֫(Ll/ۗ᩶֡;Ll/ۛ᩶֡;)Ll/۬᩶֡;
    .locals 2

    .line 69
    new-instance v0, Ll/۬᩶֡;

    .line 56
    invoke-direct {v0, p0}, Ll/ۚۙ֡;-><init>(Ll/ۗ᩶֡;)V

    const/4 v1, 0x0

    .line 36
    iput v1, v0, Ll/۬᩶֡;->ۗ:I

    .line 57
    iput-object p1, v0, Ll/۬᩶֡;->ۙ:Ll/ۛ᩶֡;

    .line 70
    iget-object p0, p0, Ll/ۗ᩶֡;->᩷:Ll/ۗۙ֡;

    invoke-virtual {p0, v0}, Ll/ۤۙ֡;->֫(Ll/ۚۙ֡;)Ll/ۚۙ֡;

    move-result-object p0

    check-cast p0, Ll/۬᩶֡;

    return-object p0
.end method


# virtual methods
.method public final compareTo(Ljava/lang/Object;)I
    .locals 1

    .line 35
    check-cast p1, Ll/۬᩶֡;

    .line 112
    iget-object v0, p0, Ll/۬᩶֡;->ۙ:Ll/ۛ᩶֡;

    iget-object p1, p1, Ll/۬᩶֡;->ۙ:Ll/ۛ᩶֡;

    invoke-virtual {v0, p1}, Ll/ܽۙ֡;->֫(Ll/ܽۙ֡;)I

    move-result p1

    return p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_2

    .line 143
    const-class v2, Ll/۬᩶֡;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    goto :goto_0

    .line 147
    :cond_1
    check-cast p1, Ll/۬᩶֡;

    .line 148
    iget-object v2, p0, Ll/۬᩶֡;->ۙ:Ll/ۛ᩶֡;

    iget-object p1, p1, Ll/۬᩶֡;->ۙ:Ll/ۛ᩶֡;

    invoke-virtual {v2, p1}, Ll/ܽۙ֡;->֫(Ll/ܽۙ֡;)I

    move-result p1

    if-nez p1, :cond_2

    return v0

    :cond_2
    :goto_0
    return v1
.end method

.method public final hashCode()I
    .locals 1

    .line 133
    iget v0, p0, Ll/۬᩶֡;->ۗ:I

    if-nez v0, :cond_0

    .line 126
    iget-object v0, p0, Ll/۬᩶֡;->ۙ:Ll/ۛ᩶֡;

    invoke-virtual {v0}, Ll/ۛ᩶֡;->hashCode()I

    move-result v0

    iput v0, p0, Ll/۬᩶֡;->ۗ:I

    .line 135
    :cond_0
    iget v0, p0, Ll/۬᩶֡;->ۗ:I

    return v0
.end method

.method public final ֫(I)I
    .locals 1

    .line 84
    iget-object v0, p0, Ll/۬᩶֡;->ۙ:Ll/ۛ᩶֡;

    invoke-virtual {v0, p1}, Ll/ۛ᩶֡;->֫(I)I

    move-result p1

    return p1
.end method

.method public final ֫()Ljava/lang/String;
    .locals 2

    .line 105
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "encoded_array @0x"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 202
    iget v1, p0, Ll/ۚۙ֡;->᩶:I

    .line 0
    invoke-static {v0, v1}, Ll/ܰۗ;->֫(Ljava/lang/StringBuilder;I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/֫ۗ֡;)V
    .locals 1

    .line 91
    iget-object v0, p0, Ll/۬᩶֡;->ۙ:Ll/ۛ᩶֡;

    invoke-virtual {v0, p1}, Ll/ۛ᩶֡;->֫(Ll/֫ۗ֡;)V

    return-void
.end method

.method public final ֫(Ll/ۧۗ֡;Ll/۫ۙ֡;)V
    .locals 1

    .line 77
    new-instance p2, Ll/ۛ᩶֡;

    iget-object v0, p0, Ll/ۚۙ֡;->᩸:Ll/ۗ᩶֡;

    invoke-direct {p2, v0, p1}, Ll/ۛ᩶֡;-><init>(Ll/ۗ᩶֡;Ll/ۧۗ֡;)V

    iput-object p2, p0, Ll/۬᩶֡;->ۙ:Ll/ۛ᩶֡;

    return-void
.end method

.method public final ᩻()Ll/ۛ᩶֡;
    .locals 1

    .line 119
    iget-object v0, p0, Ll/۬᩶֡;->ۙ:Ll/ۛ᩶֡;

    return-object v0
.end method
