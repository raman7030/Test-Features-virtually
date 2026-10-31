.class public final Ll/֨ۖۧ;
.super Ljava/lang/Object;
.source "U8RL"

# interfaces
.implements Ll/᩵ۖۧ;


# instance fields
.field public final ֫:Ll/ᩳ֨֫;

.field public final ۧ:I

.field public final ܽ:I


# direct methods
.method public constructor <init>(Ll/۠֨֫;Ll/۠ᩴ֫;)V
    .locals 3

    .line 2815
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2816
    iget-object p1, p1, Ll/۠֨֫;->ۧ:Ll/ᩳ֨֫;

    iput-object p1, p0, Ll/֨ۖۧ;->֫:Ll/ᩳ֨֫;

    const/16 v0, 0xc

    .line 2817
    invoke-virtual {p1, v0}, Ll/ᩳ֨֫;->ܿ(I)V

    .line 2818
    invoke-virtual {p1}, Ll/ᩳ֨֫;->᩹()I

    move-result v0

    const-string v1, "audio/raw"

    .line 2819
    iget-object v2, p2, Ll/۠ᩴ֫;->ۧ֫:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 2820
    iget v1, p2, Ll/۠ᩴ֫;->ۛ:I

    iget p2, p2, Ll/۠ᩴ֫;->ܿ:I

    .line 2423
    invoke-static {v1}, Ll/ۘ֨֫;->ܽ(I)I

    move-result v1

    mul-int v1, v1, p2

    if-eqz v0, :cond_0

    .line 2821
    rem-int p2, v0, v1

    if-eqz p2, :cond_1

    .line 2825
    :cond_0
    new-instance p2, Ljava/lang/StringBuilder;

    const-string v2, "Audio sample size mismatch. stsd sample size: "

    invoke-direct {p2, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ", stsz sample size: "

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Ll/᩶ۚ֫;->ᩳ(Ljava/lang/String;)V

    move v0, v1

    :cond_1
    if-nez v0, :cond_2

    const/4 v0, -0x1

    .line 2834
    :cond_2
    iput v0, p0, Ll/֨ۖۧ;->ۧ:I

    .line 2835
    invoke-virtual {p1}, Ll/ᩳ֨֫;->᩹()I

    move-result p1

    iput p1, p0, Ll/֨ۖۧ;->ܽ:I

    return-void
.end method


# virtual methods
.method public final ֫()I
    .locals 2

    const/4 v0, -0x1

    .line 2850
    iget v1, p0, Ll/֨ۖۧ;->ۧ:I

    if-ne v1, v0, :cond_0

    iget-object v0, p0, Ll/֨ۖۧ;->֫:Ll/ᩳ֨֫;

    invoke-virtual {v0}, Ll/ᩳ֨֫;->᩹()I

    move-result v0

    return v0

    :cond_0
    return v1
.end method

.method public final ۧ()I
    .locals 1

    .line 2845
    iget v0, p0, Ll/֨ۖۧ;->ۧ:I

    return v0
.end method

.method public final ܽ()I
    .locals 1

    .line 2840
    iget v0, p0, Ll/֨ۖۧ;->ܽ:I

    return v0
.end method
