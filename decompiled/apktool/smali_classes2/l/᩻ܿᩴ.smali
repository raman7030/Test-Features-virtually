.class public abstract Ll/᩻ܿᩴ;
.super Ll/ᩳܿᩴ;
.source "OAQ5"


# instance fields
.field public ᩶:Z

.field public ᩹:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 964
    invoke-direct {p0, p1}, Ll/ᩳܿᩴ;-><init>(I)V

    const/4 p1, -0x1

    .line 960
    iput p1, p0, Ll/᩻ܿᩴ;->᩹:I

    const/4 p1, 0x0

    .line 965
    iput-boolean p1, p0, Ll/᩻ܿᩴ;->᩶:Z

    return-void
.end method

.method public constructor <init>(II)V
    .locals 0

    .line 969
    invoke-direct {p0, p1}, Ll/ᩳܿᩴ;-><init>(I)V

    .line 970
    iput p2, p0, Ll/᩻ܿᩴ;->᩹:I

    const/4 p1, 0x1

    .line 971
    iput-boolean p1, p0, Ll/᩻ܿᩴ;->᩶:Z

    return-void
.end method


# virtual methods
.method public final bridge synthetic trySplit()Ll/֨۫ᩴ;
    .locals 1

    .line 958
    invoke-virtual {p0}, Ll/᩻ܿᩴ;->trySplit()Ll/ܽܿᩴ;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic trySplit()Ll/ܶ۫ᩴ;
    .locals 1

    .line 958
    invoke-virtual {p0}, Ll/᩻ܿᩴ;->trySplit()Ll/ܽܿᩴ;

    move-result-object v0

    return-object v0
.end method

.method public final trySplit()Ll/ܽܿᩴ;
    .locals 5

    .line 896
    invoke-virtual {p0}, Ll/᩻ܿᩴ;->֫()I

    move-result v0

    .line 824
    iget v1, p0, Ll/ᩳܿᩴ;->᩸:I

    invoke-virtual {p0}, Ll/᩻ܿᩴ;->֫()I

    move-result v2

    iget v3, p0, Ll/ᩳܿᩴ;->᩸:I

    const/4 v4, 0x2

    invoke-static {v2, v3, v4, v1}, Ll/۟ۤ᩻;->֫(IIII)I

    move-result v1

    if-eq v1, v3, :cond_2

    if-ne v1, v0, :cond_0

    goto :goto_0

    :cond_0
    if-lt v1, v3, :cond_1

    if-gt v1, v0, :cond_1

    .line 901
    invoke-virtual {p0, v3, v1}, Ll/ᩳܿᩴ;->֫(II)Ll/ܽܿᩴ;

    move-result-object v0

    .line 902
    iput v1, p0, Ll/ᩳܿᩴ;->᩸:I

    goto :goto_1

    .line 831
    :cond_1
    new-instance v2, Ljava/lang/IndexOutOfBoundsException;

    const-string v3, "splitPoint "

    const-string v4, " outside of range of current position "

    .line 0
    invoke-static {v1, v3, v4}, Ll/۬᩵ᩳ;->֫(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 831
    iget v3, p0, Ll/ᩳܿᩴ;->᩸:I

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, " and range end "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_2
    :goto_0
    const/4 v0, 0x0

    .line 992
    :goto_1
    iget-boolean v1, p0, Ll/᩻ܿᩴ;->᩶:Z

    if-nez v1, :cond_3

    if-eqz v0, :cond_3

    .line 993
    invoke-virtual {p0}, Ll/᩻ܿᩴ;->ۧ()I

    move-result v1

    iput v1, p0, Ll/᩻ܿᩴ;->᩹:I

    const/4 v1, 0x1

    .line 994
    iput-boolean v1, p0, Ll/᩻ܿᩴ;->᩶:Z

    :cond_3
    return-object v0
.end method

.method public final ֫()I
    .locals 1

    .line 986
    iget-boolean v0, p0, Ll/᩻ܿᩴ;->᩶:Z

    if-eqz v0, :cond_0

    iget v0, p0, Ll/᩻ܿᩴ;->᩹:I

    return v0

    :cond_0
    invoke-virtual {p0}, Ll/᩻ܿᩴ;->ۧ()I

    move-result v0

    return v0
.end method

.method public abstract ۧ()I
.end method
